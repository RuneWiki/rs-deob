import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class223 extends class220 {

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Lmh;")
    public static class128 field3911 = class22.method156(127, "<col=00ff80>");

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "Ls;")
    public static class261 field3907 = new class261(5);

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "Lmh;")
    public static class128 field3917 = class22.method156(126, "<col=40ff00>");

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Lmh;")
    public static class128 field3913 = class22.method156(123, " loggt sich aus)3");

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "Lmh;")
    public static class128 field3914 = class22.method156(126, "_labels");

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "[B")
    public static byte[] field3918 = new byte[520];

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "Lvf;")
    public static class296 field3916 = new class296();

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILbg;)V", line = 21)
    public static final void method1533(int arg0, class194 arg1) {
        field3908++;
        if ((arg1.field3417.length - arg1.field3380) < 1) {
            return;
        }
        int var2 = arg1.method1325(7627);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field3417.length - arg1.field3380 < var3) {
            return;
        }
        class254.field4378 = arg1.method1325(7627);
        if (class254.field4378 < 1) {
            class254.field4378 = 1;
        } else if (class254.field4378 > 4) {
            class254.field4378 = 4;
        }
        class3.method17((byte) 59, arg1.method1325(7627) == 1);
        class116.field1969 = arg1.method1325(7627) == 1;
        class228.field3968 = arg1.method1325(7627) == 1;
        class1.field12 = arg1.method1325(7627) == 1;
        class22.field545 = arg1.method1325(7627) == 1;
        class260.field4512 = arg1.method1325(7627) == 1;
        class121.field2039 = arg1.method1325(7627) == 1;
        class114.field1916 = arg1.method1325(7627) == 1;
        class182.field3197 = arg1.method1325(7627);
        if (class182.field3197 > 2) {
            class182.field3197 = 2;
        }
        if (var2 >= 2) {
            class90.field1536 = arg1.method1325(7627) == 1;
        } else {
            class90.field1536 = arg1.method1325(7627) == 1;
            arg1.method1325(7627);
        }
        int var4 = 117 / ((arg0 + 64) / 32);
        class240.field4101 = arg1.method1325(7627) == 1;
        class271.field4693 = arg1.method1325(7627) == 1;
        class238.field4073 = arg1.method1325(7627);
        if (class238.field4073 > 2) {
            class238.field4073 = 2;
        }
        class31.field689 = arg1.method1325(7627) == 1;
        class214.field3778 = arg1.method1325(7627);
        if (class214.field3778 > 127) {
            class214.field3778 = 127;
        }
        class139.field2391 = arg1.method1325(7627);
        class158.field2699 = arg1.method1325(7627);
        if (class158.field2699 > 127) {
            class158.field2699 = 127;
        }
        if (var2 >= 1) {
            class206.field3629 = arg1.method1308(-89);
            class221.field3885 = arg1.method1308(-61);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1325(7627);
        }
        if (var2 >= 4) {
            arg1.method1325(7627);
        }
        if (var2 >= 5) {
            class196.field3435 = arg1.method1350(false);
        }
        if (var2 >= 6) {
            class165.field2836 = arg1.method1325(7627);
        }
        if (var2 >= 7) {
            class45.field908 = arg1.method1325(7627) == 1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 153)
    public static final void method1534(int arg0) {
        for (int var1 = -1; var1 < class75.field1404; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class203.field3593[var1];
            }
            class123 var3 = class140.field2405[var2];
            if (var3 != null && var3.field471 > 0) {
                var3.field471--;
                if (var3.field471 == 0) {
                    var3.field462 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class37.field749; var4++) {
            int var5 = class39.field839[var4];
            class115 var6 = class201.field3560[var5];
            if (var6 != null && var6.field471 > 0) {
                var6.field471--;
                if (var6.field471 == 0) {
                    var6.field462 = null;
                }
            }
        }
        if (arg0 <= 88) {
            field3914 = (class128) null;
        }
        field3912++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBIIIIIIIII)V", line = 209)
    public static final void method1536(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3910++;
        int var11 = arg0 - arg10;
        int var12 = arg8 - arg9;
        boolean var13;
        if (class240.field4107 > 0 && class240.field4107 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        if (arg1 != 47) {
            method1533(108, (class194) null);
        }
        int var14 = 983040 / arg2;
        int var15 = 983040 / arg6;
        for (int var16 = -var15; var16 < var11 + var15; var16++) {
            int var17 = arg5 + (arg6 * var16) >> 16;
            int var18 = (var16 + 1) * arg6 + arg5 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg3 + var18;
                int var21 = arg3 + var17;
                int var22 = arg10 + var16 >> 6;
                if (var22 >= 0 && var22 <= (class173.field3047.length - 1)) {
                    int[][] var23 = class173.field3047[var22];
                    for (int var24 = -var14; var24 < var12 + var14; var24++) {
                        int var25 = arg2 * var24 + arg7 >> 16;
                        int var26 = (var24 + 1) * arg2 + arg7 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            var10000 = arg4 + var26;
                            int var29 = arg4 + var25;
                            int var30 = var24 + arg9 >> 6;
                            if (var30 >= 0 && (var23.length - 1) >= var30 && var23[var30] != null) {
                                int var31 = ((var24 + arg9 & 0x3F) << 6) + (var16 + arg10 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class38 var33 = class239.method1629((byte) -29, var32 - 1);
                                    if (var13 && class281.field4851 == var33.field791) {
                                        class228 var34 = new class228();
                                        var34.field3976 = var29;
                                        var34.field3974 = var21;
                                        var34.field3975 = var33.field791;
                                        class187.field3246.method2029((byte) -34, var34);
                                    }
                                    class110.field1860[var33.field791].method273(var21 - 7, var29 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class228 var35 = (class228) class187.field3246.method2024(0); var35 != null; var35 = (class228) class187.field3246.method2027(arg1 ^ 0x4839E787)) {
            class110.field1860[var35.field3975].method273(var35.field3974 - 7, var35.field3976 - 7);
            class213.method1468(var35.field3974, var35.field3976, 15, 16776960, 128);
            class213.method1468(var35.field3974, var35.field3976, 7, 16777215, 256);
        }
        class187.field3246.method2025((byte) -97);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 354)
    public static void method1537(int arg0) {
        field3917 = null;
        field3911 = null;
        field3914 = null;
        field3913 = null;
        field3918 = null;
        field3907 = null;
        field3916 = null;
        if (arg0 != -7) {
            method1538(-58, -50, 28, 27, 6, -114, 89, -66);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIII)Z", line = 369)
    public static final boolean method1538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Z")
    public abstract boolean method1532(byte arg0);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method1535(boolean arg0);
}
