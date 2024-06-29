import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class491 extends class168 {

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public int field6976;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public int field6978;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(CB)C")
    public static final char method2898(char arg0, byte arg1) {
        field6975++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg1 >= 0) {
            return (char) 65434;
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public static final void method2899(byte arg0) {
        field6973++;
        if (class85.field1170 == -1 || class459.field6112 == -1) {
            return;
        }
        int var1 = ((class16.field326 - class571.field8039) * class212.field2800 >> 16) + class571.field8039;
        class212.field2800 += var1;
        if (class212.field2800 < 65535) {
            class658.field9172 = false;
            class313.field4095 = false;
        } else {
            class212.field2800 = 65535;
            if (class313.field4095) {
                class658.field9172 = false;
            } else {
                class658.field9172 = true;
            }
            class313.field4095 = true;
        }
        float var2 = (float) class212.field2800 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class151.field2085 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class622.field8567[class85.field1170][var4][var5] * 3;
            int var22 = class622.field8567[class85.field1170][var4 + 1][var5] * 3;
            int var23 = (class622.field8567[class85.field1170][var4 + 2][var5] + class622.field8567[class85.field1170][var4 + 2][var5] - class622.field8567[class85.field1170][var4 + 3][var5]) * 3;
            int var24 = class622.field8567[class85.field1170][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class622.field8567[class85.field1170][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class450.field5953 = (int) var3[0] - (class332.field4232 * 512);
        class66.field954 = (int) var3[1] * -1;
        class318.field4121 = (int) var3[2] - (class447.field5936 * 512);
        float[] var6 = new float[3];
        int var7 = class505.field7123 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class622.field8567[class459.field6112][var7][var8] * 3;
            int var15 = class622.field8567[class459.field6112][var7 + 1][var8] * 3;
            int var16 = (class622.field8567[class459.field6112][var7 + 2][var8] + class622.field8567[class459.field6112][var7 + 2][var8] - class622.field8567[class459.field6112][var7 + 3][var8]) * 3;
            int var17 = class622.field8567[class459.field6112][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class622.field8567[class459.field6112][var7 + 2][var8] + var15 - (var17 - -var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (arg0 > -47) {
            field6979 = 77;
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class33.field544 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class206.field2731 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class115.field1704 = class622.field8567[class85.field1170][var4][3] + ((class622.field8567[class85.field1170][var4 + 2][3] - class622.field8567[class85.field1170][var4][3]) * class212.field2800 >> 16);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/awt/Canvas;II)Lpca;")
    public static final class717 method2900(byte arg0, Canvas arg1, int arg2, int arg3) {
        field6977++;
        try {
            int var4 = -61 % ((arg0 + 40) / 46);
            Class var5 = Class.forName("ww");
            class717 var6 = (class717) var5.getDeclaredConstructor().newInstance();
            var6.method3426(arg3, -17303, arg2, arg1);
            return var6;
        } catch (Throwable var8) {
            class611 var7 = new class611();
            var7.method3426(arg3, -17303, arg2, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public static final void method2901(int arg0) {
        field6974++;
        if (arg0 != -4) {
            field6979 = -102;
        }
        class589.field8255.method3065(true);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Z")
    public static final boolean method2902(int arg0, int arg1) {
        if (arg1 < 20) {
            method2900((byte) 14, null, -94, -45);
        }
        field6972++;
        if (arg0 == 12 || arg0 == 60 || arg0 == 58 || arg0 == 25 || arg0 == 4) {
            return true;
        } else {
            return arg0 == 11 || arg0 == 1001;
        }
    }
}
