import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class122 extends class294 {

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Lok;")
    public static class146 field2002 = class235.method1724(-12908, "::gc");

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Lhd;")
    public static class117 field2001 = new class117(5);

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 8)
    public static void method844(boolean arg0) {
        field2002 = null;
        if (!arg0) {
            method846((byte) -9);
        }
        field2001 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)I", line = 37)
    public static final int method845(boolean arg0, int arg1, int arg2) {
        class258 var3 = (class258) class115.field1854.method810((byte) -100, (long) arg2);
        if (arg0) {
            method848((class47) null, -16);
        }
        field1998++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4284.length; var5++) {
                if (var3.field4293[var5] == arg1) {
                    var4 += var3.field4284[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 78)
    public static final void method846(byte arg0) {
        field2000++;
        if (class238.field3974 == -1 || class217.field3579 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = class112.field1790 * 2;
        int var3 = ((class288.field4938 - class150.field2545) * class166.field2810 >> 16) + class150.field2545;
        class166.field2810 += var3;
        if (class166.field2810 >= 65535) {
            class166.field2810 = 65535;
            if (class183.field3057) {
                class121.field1986 = false;
            } else {
                class121.field1986 = true;
            }
            class183.field3057 = true;
        } else {
            class121.field1986 = false;
            class183.field3057 = false;
        }
        float var4 = (float) class166.field2810 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class232.field3882[class238.field3974][var2 + 1][var5] * 3;
            int var7 = (class232.field3882[class238.field3974][var2 + 2][var5] - (class232.field3882[class238.field3974][var2 + 3][var5] - class232.field3882[class238.field3974][var2 + 2][var5])) * 3;
            int var8 = class232.field3882[class238.field3974][var2][var5] * 3;
            int var9 = class232.field3882[class238.field3974][var2][var5];
            int var10 = var7 + var8 - (var6 * 2);
            int var11 = class232.field3882[class238.field3974][var2 + 2][var5] - var9 - (-var6 - -var7);
            int var12 = var6 - var8;
            var1[var5] = (((float) var11 * var4 + (float) var10) * var4 + (float) var12) * var4 + (float) var9;
        }
        class151.field2572 = (int) var1[1] * -1;
        class107.field1742 = (int) var1[0] - class15.field300 * 128;
        class161.field2719 = (int) var1[2] - (class201.field3357 * 128);
        float[] var13 = new float[3];
        if (arg0 <= 77) {
            method848((class47) null, -85);
        }
        int var14 = class17.field349 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class232.field3882[class217.field3579][var14 + 1][var15] * 3;
            int var17 = (class232.field3882[class217.field3579][var14 + 2][var15] + class232.field3882[class217.field3579][var14 - -2][var15] - class232.field3882[class217.field3579][var14 + 3][var15]) * 3;
            int var18 = class232.field3882[class217.field3579][var14][var15];
            int var19 = class232.field3882[class217.field3579][var14][var15] * 3;
            int var20 = var16 - var19;
            int var21 = class232.field3882[class217.field3579][var14 + 2][var15] + var16 - var18 - var17;
            int var22 = var19 + var17 - (var16 * 2);
            var13[var15] = (((float) var21 * var4 + (float) var22) * var4 + (float) var20) * var4 + (float) var18;
        }
        float var23 = var13[0] - var1[0];
        float var24 = (var13[1] - var1[1]) * -1.0F;
        float var25 = var13[2] - var1[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class13.field251 = (float) Math.atan2((double) var24, var26);
        class135.field2261 = -((float) Math.atan2((double) var23, (double) var25));
        class63.field1088 = (int) ((double) class13.field251 * 325.949D) & 0x7FF;
        class79.field1269 = (int) ((double) class135.field2261 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZ)V", line = 184)
    public static final void method847(byte arg0, boolean arg1) {
        class106.field1711 = new int[104];
        class84.field1339 = new int[104];
        class245.field4054 = new int[104];
        class251.field4207 = 99;
        field1996++;
        class25.field447 = new int[104];
        class297.field5056 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class55.field988 = new byte[var2][104][104];
        class292.field4973 = new byte[var2][104][104];
        class20.field389 = new byte[var2][104][104];
        class199.field3332 = new int[var2][105][105];
        class118.field1914 = new byte[var2][104][104];
        if (arg0 < 53) {
            field2004 = 17;
        }
        class164.field2777 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lwe;I)Loi;", line = 214)
    public static final class312 method848(class47 arg0, int arg1) {
        field2003++;
        return arg1 == -17260 ? new class312(arg0.method343(26167), arg0.method343(26167), arg0.method343(arg1 + 43427), arg0.method343(26167), arg0.method389((byte) 88), arg0.method389((byte) 106), arg0.method368(85)) : (class312) null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIII)V", line = 233)
    public static final void method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1999++;
        if (arg5 >= class151.field2564 && arg7 <= class126.field2058 && arg4 >= class123.field2008 && class318.field5394 >= arg6) {
            class17.method134(true, arg7, arg4, arg6, arg1, arg3, arg5, arg2);
        } else {
            class227.method1678(arg2, false, arg3, arg4, arg6, arg5, arg7, arg1);
        }
        if (arg0 < 67) {
            field2001 = (class117) null;
        }
    }
}
