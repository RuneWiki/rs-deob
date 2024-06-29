import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class504 extends class525 {

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public int field6875 = (int) (class197.method1423(1) / 1000L);

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "S")
    public short field6878;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "Ljava/lang/String;")
    public String field6880;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "Lfja;")
    public static class783 field6874 = new class783(100, 10);

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
    public static void method2878(int arg0) {
        if (arg0 == 8192) {
            field6874 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(B)V")
    public static final void method2879(byte arg0) {
        if (arg0 > -122) {
            method2881(-84);
        }
        field6877++;
        if (class289.field3991 == -1 || class281.field3906 == -1) {
            return;
        }
        int var1 = class56.field796 + ((class615.field8572 - class56.field796) * class118.field2161 >> 16);
        class118.field2161 += var1;
        if (class118.field2161 < 65535) {
            class736.field10165 = false;
            class608.field8490 = false;
        } else {
            class118.field2161 = 65535;
            if (class736.field10165) {
                class608.field8490 = false;
            } else {
                class608.field8490 = true;
            }
            class736.field10165 = true;
        }
        float var2 = (float) class118.field2161 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class254.field3581 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class747.field10322[class289.field3991][var4][var5] * 3;
            int var22 = class747.field10322[class289.field3991][var4 + 1][var5] * 3;
            int var23 = (class747.field10322[class289.field3991][var4 + 2][var5] + class747.field10322[class289.field3991][var4 + 2][var5] - class747.field10322[class289.field3991][var4 + 3][var5]) * 3;
            int var24 = class747.field10322[class289.field3991][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class747.field10322[class289.field3991][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class450.field6172 = (int) var3[2] - (class400.field5510 * 512);
        class733.field10131 = (int) var3[0] - (class217.field3198 * 512);
        class605.field8452 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class137.field2344 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class747.field10322[class281.field3906][var7][var8] * 3;
            int var15 = class747.field10322[class281.field3906][var7 + 1][var8] * 3;
            int var16 = (class747.field10322[class281.field3906][var7 + 2][var8] - (class747.field10322[class281.field3906][var7 + 3][var8] - class747.field10322[class281.field3906][var7 + 2][var8])) * 3;
            int var17 = class747.field10322[class281.field3906][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class747.field10322[class281.field3906][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class255.field3585 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class460.field6249 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class463.field6307 = class747.field10322[class289.field3991][var4][3] + ((class747.field10322[class289.field3991][var4 + 2][3] - class747.field10322[class289.field3991][var4][3]) * class118.field2161 >> 16);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2880(int arg0, int arg1, boolean arg2) {
        field6879++;
        if (arg2) {
            method2882(-104, true, true);
        }
        return class789.method4307((byte) -62, arg0, arg1) & (class303.method1937(arg0, (byte) 125, arg1) | (arg1 & 0x2000) != 0 | class142.method1153(arg1, 125, arg0));
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)Lnaa;")
    public static final class79 method2881(int arg0) {
        if (arg0 != -16647) {
            return null;
        }
        field6876++;
        try {
            return (class79) Class.forName("aw").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZZ)I")
    public static final int method2882(int arg0, boolean arg1, boolean arg2) {
        field6873++;
        if (arg1) {
            return 0;
        }
        class539 var3 = class210.method1479(arg1, -113, arg0);
        if (var3 == null) {
            return class108.field1698.method3631(false, arg0).field9537;
        }
        if (arg2) {
            method2878(58);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field7320.length; var5++) {
            if (var3.field7320[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class108.field1698.method3631(arg2, arg0).field9537 - var3.field7320.length);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class504(String arg0, int arg1) {
        this.field6878 = (short) arg1;
        this.field6880 = arg0;
    }
}
