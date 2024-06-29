import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class423 {

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "[[B")
    public static byte[][] field5924 = new byte[1000][];

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
    public static int[] field5921 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lqe;")
    public static class465 field5925 = new class465(10, 6);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Leq;")
    public static class209 field5926;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static final void method2582(byte arg0) {
        field5923++;
        if (arg0 >= -31) {
            field5924 = null;
        }
        for (int var1 = 0; var1 < class617.field8924; var1++) {
            int var2 = class239.field3370[var1];
            class84 var3 = ((class272) class758.field10539.method4203(true, (long) var2)).field3885;
            int var4 = class644.field9146.method273(255);
            if ((var4 & 0x8) != 0) {
                var4 += class644.field9146.method273(255) << 8;
            }
            if ((var4 & 0x400) != 0) {
                int var5 = class644.field9146.method280((byte) -105);
                var3.field976 = class644.field9146.method236(118);
                var3.field879 = class644.field9146.method236(120);
                var3.field961 = (var5 & 0x8000) != 0;
                var3.field897 = var5 & 0x7FFF;
                var3.field964 = var3.field976 + var3.field897 + class605.field8787;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field881 = class644.field9146.method286(128);
                var3.field948 = class644.field9146.method286(128);
                var3.field977 = class644.field9146.method274(29471);
                var3.field981 = class644.field9146.method242(-2);
                var3.field898 = class644.field9146.method228((byte) 67) + class605.field8787;
                var3.field962 = class644.field9146.method248((byte) -113) + class605.field8787;
                var3.field979 = class644.field9146.method278(87);
                var3.field948 += var3.field995[0];
                var3.field977 += var3.field991[0];
                var3.field992 = 1;
                var3.field981 += var3.field995[0];
                var3.field881 += var3.field991[0];
                var3.field988 = 0;
            }
            if ((var4 & 0x4000) != 0) {
                int var6 = class644.field9146.method248((byte) -106);
                int var7 = class644.field9146.method262((byte) -57);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var8 = class644.field9146.method288((byte) -127);
                int var9 = var8 & 0x7;
                int var10 = var8 >> 3 & 0xF;
                if (var10 == 15) {
                    var10 = -1;
                }
                var3.method463(var9, var6, var10, true, -124, var7);
            }
            if ((var4 & 0x2) != 0) {
                int[] var11 = new int[4];
                for (int var12 = 0; var12 < 4; var12++) {
                    var11[var12] = class644.field9146.method228((byte) 67);
                    if (var11[var12] == 65535) {
                        var11[var12] = -1;
                    }
                }
                int var13 = class644.field9146.method236(118);
                class521.method3092(var11, var3, 8298, var13);
            }
            if ((var4 & 0x800) != 0) {
                var3.field926 = class644.field9146.method242(-2);
                var3.field929 = class644.field9146.method274(29471);
                var3.field974 = class644.field9146.method242(-2);
                var3.field887 = (byte) class644.field9146.method278(89);
                var3.field958 = class605.field8787 + class644.field9146.method253(-13900);
                var3.field907 = class605.field8787 + class644.field9146.method280((byte) -69);
            }
            if ((var4 & 0x80) != 0) {
                int var14 = class644.field9146.method232((byte) -128);
                int var15 = class644.field9146.method278(99);
                var3.method469(var15, class605.field8787, (byte) 89, var14);
                var3.field954 = class605.field8787 + 300;
                var3.field947 = class644.field9146.method288((byte) -127);
            }
            if ((var4 & 0x40) != 0) {
                var3.field928 = class644.field9146.method272(2);
                var3.field934 = 100;
            }
            if ((var4 & 0x100) != 0) {
                int var16 = class644.field9146.method278(105);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class644.field9146.method228((byte) 67);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = class644.field9146.method278(88);
                    var19[var20] = class644.field9146.method248((byte) -98);
                }
                class157.method1194((byte) 29, var18, var3, var19, var17);
            }
            if ((var4 & 0x200) != 0) {
                int var22 = class644.field9146.method273(255);
                int[] var23 = new int[var22];
                int[] var24 = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = class644.field9146.method253(-13900);
                    if ((var26 & 0xC000) == 49152) {
                        int var27 = class644.field9146.method280((byte) -50);
                        var23[var25] = class164.method1221(var27, var26 << 16);
                    } else {
                        var23[var25] = var26;
                    }
                    var24[var25] = class644.field9146.method253(-13900);
                }
                var3.method483(true, var23, var24);
            }
            if ((var4 & 0x20) != 0) {
                var3.field967 = class644.field9146.method280((byte) -87);
                if (var3.field967 == 65535) {
                    var3.field967 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var28 = class644.field9146.method228((byte) 67);
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = class644.field9146.method234((byte) -95);
                int var30 = class644.field9146.method273(255);
                int var31 = var30 & 0x7;
                int var32 = var30 >> 3 & 0xF;
                if (var32 == 15) {
                    var32 = -1;
                }
                var3.method463(var31, var28, var32, false, -113, var29);
            }
            if ((var4 & 0x1000) != 0) {
                int var33 = class644.field9146.method232((byte) -26);
                int var34 = class644.field9146.method236(124);
                var3.method469(var34, class605.field8787, (byte) 110, var33);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field1523.method2928((byte) 109)) {
                    class310.method2011(-88, var3);
                }
                var3.method809(class134.field2102.method3038(class644.field9146.method248((byte) -125), (byte) 102), -1);
                var3.method470(var3.field1523.field6911, 0);
                var3.field878 = var3.field1523.field6927 << 3;
                if (var3.field1523.method2928((byte) -93)) {
                    class229.method1575(var3.field649, var3, null, null, 0, -1, var3.field995[0], var3.field991[0]);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1531 = class644.field9146.method228((byte) 67);
                var3.field1522 = class644.field9146.method228((byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static void method2583(boolean arg0) {
        field5926 = null;
        field5924 = null;
        field5921 = null;
        field5925 = null;
        if (!arg0) {
            field5925 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIBI)V")
    public static final void method2584(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class78.field1464 = arg0;
        class399.field5586 = arg3;
        if (arg4 >= -54) {
            return;
        }
        class668.field9370 = arg1;
        class348.field4891 = arg2;
        class505.field7211 = arg5;
        field5920++;
        if (class505.field7211 >= 100) {
            int var6 = class348.field4891 * 512 + 256;
            int var7 = class668.field9370 * 512 + 256;
            int var8 = class534.method3136(1, class312.field4409, var6, var7) - class78.field1464;
            int var9 = var6 - class685.field9660;
            int var10 = var8 - class136.field2118;
            int var11 = var7 - class260.field3810;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class694.field9754 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class239.field3371 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class717.field10039 = 0;
            if (class694.field9754 < 1024) {
                class694.field9754 = 1024;
            }
            if (class694.field9754 > 3072) {
                class694.field9754 = 3072;
            }
        }
        class666.field9338 = 2;
        class411.field5689 = -1;
        class679.field9569 = -1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2585(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
