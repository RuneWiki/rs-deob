import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class238 extends class396 {

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "[I")
    public static int[] field3240 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "Lfi;")
    public static class331 field3241 = new class331(256);

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Lfi;")
    public static class331 field3243 = new class331(64);

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Lcf;", line = 3)
    public static final class360 method1518(byte arg0, int arg1) {
        field3237++;
        class331 var2 = class369.field5408;
        class360 var3;
        synchronized (class369.field5408) {
            var3 = (class360) class369.field5408.method2049(-61, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        int var4 = 112 % ((39 - arg0) / 54);
        byte[] var5 = class272.field3860.method361(3, 83, arg1);
        class360 var6 = new class360();
        if (var5 != null) {
            var6.method2297(-1, new class211(var5));
        }
        class331 var7 = class369.field5408;
        synchronized (class369.field5408) {
            class369.field5408.method2046((long) arg1, 0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V", line = 35)
    public static final void method1519(byte arg0) {
        field3235++;
        if (class248.field3363 == 5) {
            class248.field3363 = 6;
            if (arg0 > -48) {
                method1520(30, -104, 85, 15, (byte) 7, 85, 51, 119, -96, 60);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIBIIIII)V", line = 49)
    public static final void method1520(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg9 && arg0 == arg3 && arg1 == arg7 && arg6 == arg8) {
            class339.method2185(arg1, arg5, arg0, arg6, arg2, 1055745068);
        } else {
            int var10 = arg2;
            int var11 = arg0;
            int var12 = arg2 * 3;
            int var13 = arg0 * 3;
            int var14 = arg9 * 3;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg8 * 3;
            int var18 = arg1 + var14 - var16 - arg2;
            int var19 = var15 + arg6 - var17 - arg0;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg2;
                int var34 = (var30 + var32 + var28 >> 12) + arg0;
                class339.method2185(var33, arg5, var11, var34, var10, 1055745068);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg4 != -111) {
            method1524((byte) -58, 95);
        }
        field3234++;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)V", line = 124)
    public static final void method1521(byte arg0) {
        if (arg0 != -106) {
            method1518((byte) 62, 109);
        }
        field3242++;
        for (class201 var1 = (class201) class396.field5783.method1212(arg0 + 70); var1 != null; var1 = (class201) class396.field5783.method1207(false)) {
            int var2 = var1.field2776;
            if (class344.method2202((byte) 56, var2)) {
                boolean var3 = true;
                class119[] var4 = class224.field3054[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1475;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field5248;
                    class119 var7 = class179.method1170(var6, 818041328);
                    if (var7 != null) {
                        class101.method543((byte) -66, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIII)V", line = 184)
    public static final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3238++;
        float var5 = (float) class106.field1227 / (float) class106.field1223;
        int var6 = arg3;
        if (arg1 != 524) {
            method1521((byte) -61);
        }
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg0 - (arg3 - var6) / 2;
        int var9 = arg2 - (arg4 - var7) / 2;
        class237.field3225 = -1;
        class356.field5214 = class106.field1227 - (class106.field1227 * var9 / var7);
        class342.field5027 = -1;
        class221.field3025 = class106.field1223 * var8 / var6;
        class157.method1032(-6600);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILra;)V", line = 212)
    public static final void method1523(int arg0, class57 arg1) {
        class211.field2872 = arg1;
        field3239++;
        if (arg0 != 24047) {
            field3240 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(BI)V", line = 223)
    public static final void method1524(byte arg0, int arg1) {
        int var2 = 76 % ((16 - arg0) / 56);
        class331 var3 = class437.field6410;
        synchronized (class437.field6410) {
            class437.field6410.method2054(69, arg1);
        }
        field3236++;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V", line = 244)
    public static void method1525(int arg0) {
        field3241 = null;
        field3243 = null;
        field3240 = null;
        if (arg0 != 0) {
            method1523(-78, (class57) null);
        }
    }
}
