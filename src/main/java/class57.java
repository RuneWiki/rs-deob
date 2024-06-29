import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class57 {

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    private int field752 = 0;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Lek;")
    private class352 field750;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
    public static boolean field751 = true;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
    public static boolean field749 = false;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lnd;")
    private class383 field746;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Lnd;")
    public final class383 method538(int arg0) {
        this.field752 = arg0;
        field745++;
        return this.method539(arg0 + 83);
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)Lnd;")
    public final class383 method539(int arg0) {
        field748++;
        if (this.field752 > 0 && this.field750.field4511[this.field752 - 1] != this.field746) {
            class383 var2 = this.field746;
            this.field746 = var2.field5042;
            return var2;
        }
        while (this.field752 < this.field750.field4510) {
            class383 var4 = this.field750.field4511[this.field752++].field5042;
            if (this.field750.field4511[this.field752 - 1] != var4) {
                this.field746 = var4.field5042;
                return var4;
            }
        }
        int var3 = -113 % ((arg0 + 37) / 59);
        return null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static final void method540(byte arg0) {
        field747++;
        if (class524.field7754 == -1 || class60.field784 == -1) {
            return;
        }
        int var1 = ((class353.field4541 - class98.field1192) * class204.field2665 >> 16) + class98.field1192;
        class204.field2665 += var1;
        if (class204.field2665 < 65535) {
            class433.field6158 = false;
            class229.field2927 = false;
        } else {
            if (class433.field6158) {
                class229.field2927 = false;
            } else {
                class229.field2927 = true;
            }
            class204.field2665 = 65535;
            class433.field6158 = true;
        }
        float var2 = (float) class204.field2665 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class325.field4124 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class418.field5941[class524.field7754][var4][var5] * 3;
            int var22 = class418.field5941[class524.field7754][var4 + 1][var5] * 3;
            int var23 = (class418.field5941[class524.field7754][var4 + 2][var5] + class418.field5941[class524.field7754][var4 + 2][var5] - class418.field5941[class524.field7754][var4 + 3][var5]) * 3;
            int var24 = class418.field5941[class524.field7754][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class418.field5941[class524.field7754][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class286.field3665 = (int) var3[1] * -1;
        class193.field2500 = (int) var3[2] - class320.field4064 * 128;
        class310.field3971 = (int) var3[0] - (class441.field6317 * 128);
        float[] var6 = new float[3];
        int var7 = class198.field2582 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class418.field5941[class60.field784][var7][var8] * 3;
            int var15 = class418.field5941[class60.field784][var7 + 1][var8] * 3;
            int var16 = (class418.field5941[class60.field784][var7 + 2][var8] + class418.field5941[class60.field784][var7 + 2][var8] - class418.field5941[class60.field784][var7 + 3][var8]) * 3;
            int var17 = class418.field5941[class60.field784][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class418.field5941[class60.field784][var7 + 2][var8] - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (arg0 < 11) {
            method540((byte) -102);
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class80.field1030 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class365.field4747 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class347.field4462 = ((class418.field5941[class524.field7754][var4 + 2][3] - class418.field5941[class524.field7754][var4][3]) * class204.field2665 >> 16) + class418.field5941[class524.field7754][var4][3];
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lek;)V")
    public class57(class352 arg0) {
        this.field750 = arg0;
    }
}
