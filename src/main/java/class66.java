import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class66 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ldq;")
    private static class90 field847 = new class90(16);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[S")
    private static short[] field855 = new short[1];

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field854 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field856 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[B")
    private static byte[] field850 = new byte[1];

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Leb;")
    public static class395 field857 = new class395();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "F")
    public static float field851;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "F")
    public static float field853;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lct;")
    public static class104 field849;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Ljr;")
    public static class239 field848;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Li;")
    public static class86 field859;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Ldq;")
    private static class90 field879;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[B")
    private static byte[] field862;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "[B")
    private static byte[] field875;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "[B")
    private static byte[] field876;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "[B")
    private static byte[] field880;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "[B")
    private static byte[] field881;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[I")
    private static int[] field871;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[S")
    private static short[] field865;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[S")
    private static short[] field867;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[[[B")
    public static byte[][][] field852;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[[[Ltg;")
    private static class304[][][] field861;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field864 = arg0 - field870;
        field863 = arg1 - field860;
        field868 = arg2 - field870;
        field873 = arg3 - field860;
        field878 = arg4;
        field866 = arg5;
        field874 = arg6;
        field869 = arg7;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lct;)V")
    public static final void method477(class104 arg0) {
        field849 = arg0;
        field847.method600(-119);
        int var1 = field849.method707(-1, "details");
        int[] var2 = field849.method710(var1, (byte) -72);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class239 var4 = class148.method1022((byte) -114, var2[var3], field849, var1);
            field847.method606(1, var4, (long) var4.field3541);
        }
        class375.method2374(-1, false, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfp;Lat;IIII[I[I)V")
    private static final void method478(class9 arg0, class256 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1738((byte) 116);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1738((byte) 124);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field862[field877 * arg5 + arg4] = (byte) var11;
                    field875[field877 * arg5 + arg4] = 0;
                } else {
                    field875[field877 * arg5 + arg4] = (byte) var11;
                    field880[field877 * arg5 + arg4] = 0;
                    field862[field877 * arg5 + arg4] = arg1.method1728((byte) 105);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1738((byte) 127);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1738((byte) -101);
                var18 = arg1.method1738((byte) -72);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1738((byte) 95);
            }
            if (var15 == 0) {
                field862[field877 * arg5 + arg4] = (byte) var16;
                field875[field877 * arg5 + arg4] = (byte) var17;
                field880[field877 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field865[field877 * arg5 + arg4] = (short) (arg1.method1767(1930493576) + 1);
                    field876[field877 * arg5 + arg4] = arg1.method1728((byte) 112);
                } else if (var19 > 1) {
                    field865[field877 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1767(1930493576);
                        var21[var22] = arg1.method1728((byte) 78);
                    }
                    field879.method606(1, new class123(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1767(1930493576);
                        var24[var25] = arg1.method1728((byte) 88);
                    }
                }
                if (field861[var15 - 1][arg2 - (field870 >> 6)][arg3 - (field860 >> 6)] == null) {
                    field861[var15 - 1][arg2 - (field870 >> 6)][arg3 - (field860 >> 6)] = new class304();
                }
                class335 var26 = new class335(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field861[var15 - 1][arg2 - (field870 >> 6)][arg3 - (field860 >> 6)].method2024(10, var26);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method479(int arg0) {
        field848 = (class239) field847.method609((long) arg0, 92);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Ljr;")
    public static final class239 method480(int arg0, int arg1) {
        for (class239 var2 = (class239) field847.method608((byte) 123); var2 != null; var2 = (class239) field847.method604(-78)) {
            if (var2.field3542 && var2.method1602((byte) -84, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    private static final void method481() {
        for (int var0 = 0; var0 < field877; var0++) {
            for (int var11 = 0; var11 < field872; var11++) {
                int var12 = field865[field877 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class123 var13 = (class123) field879.method609((long) (var0 << 16 | var11), 45);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field1632.length; var14++) {
                                class178 var15 = class450.method2785(var13.field1632[var14] & 0xFFFF, (byte) 127);
                                int var16 = var15.field2460;
                                if (var15.field2489 != null) {
                                    class178 var17 = var15.method1240((byte) -116);
                                    if (var17 != null) {
                                        var16 = var17.field2460;
                                    }
                                }
                                if (var16 != -1) {
                                    class376 var18 = new class376(var16);
                                    var18.field5484 = var0;
                                    var18.field5497 = var11;
                                    field857.method2484(0, var18);
                                }
                            }
                        }
                    } else {
                        class178 var19 = class450.method2785(var12 - 1, (byte) 111);
                        int var20 = var19.field2460;
                        if (var19.field2489 != null) {
                            class178 var21 = var19.method1240((byte) -116);
                            if (var21 != null) {
                                var20 = var21.field2460;
                            }
                        }
                        if (var20 != -1) {
                            class376 var22 = new class376(var20);
                            var22.field5484 = var0;
                            var22.field5497 = var11;
                            field857.method2484(0, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field861[0].length; var2++) {
                for (int var3 = 0; var3 < field861[0][0].length; var3++) {
                    class304 var4 = field861[var1][var2][var3];
                    if (var4 != null) {
                        for (class335 var5 = (class335) var4.method2026(100); var5 != null; var5 = (class335) var4.method2022(10)) {
                            if (var5.field4940 != null) {
                                for (int var6 = 0; var6 < var5.field4940.length; var6++) {
                                    class178 var7 = class450.method2785(var5.field4940[var6] & 0xFFFF, (byte) 85);
                                    int var8 = var7.field2460;
                                    if (var7.field2489 != null) {
                                        class178 var9 = var7.method1240((byte) -116);
                                        if (var9 != null) {
                                            var8 = var9.field2460;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class376 var10 = new class376(var8);
                                        var10.field5484 = ((field870 >> 6) + var2) * 64 + var5.field4945 - field870;
                                        var10.field5497 = ((field860 >> 6) + var3) * 64 + var5.field4944 - field860;
                                        field857.method2484(0, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfp;IIIIIII[S[BZ)V")
    private static final void method482(class9 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method164(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field871[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method164(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class28.method290(arg4, arg7 >> 6 & 0x3, field871[arg6], arg3, arg1, arg0, arg2, var11, field858, (byte) -83, arg5, field852, var12);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class178 var18 = class450.method2785(arg8[var16] & 0xFFFF, (byte) 90);
                if (var18.field2458 == -1) {
                    int var19 = -3355444;
                    if (var18.field2479 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method97(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method115(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method97(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method115(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method97(arg1, arg2, arg4, -1, 0);
                            arg0.method115(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method97(var14, arg2, arg4, -1, 0);
                            arg0.method115(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method97(var14, arg2, arg4, -1, 0);
                            arg0.method115(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method97(arg1, arg2, arg4, -1, 0);
                            arg0.method115(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method115(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method115(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method115(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method115(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method115(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method115(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfp;)Leb;")
    public static final class395 method483(class9 arg0) {
        int var1 = field868 - field864;
        int var2 = field863 - field873;
        int var3 = (field874 - field878 << 16) / var1;
        int var4 = (field869 - field866 << 16) / var2;
        return method485(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lic;II)V")
    public static final void method484(class235 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class432.field6298; var3++) {
            field871[var3 + 1] = method496(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfp;IIII)Leb;")
    private static final class395 method485(class9 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class376 var5 = (class376) field857.method2478(1603); var5 != null; var5 = (class376) field857.method2486((byte) -82)) {
            method486(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field857;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfp;Leg;IIII)V")
    private static final void method486(class9 arg0, class376 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field5488 = ((arg1.field5484 - field864) * arg2 + arg4 >> 16) + field878;
        arg1.field5487 = field869 - ((arg1.field5497 - field873) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lig;")
    public static final class15 method487(int arg0, int arg1) {
        class15 var2 = new class15();
        for (class239 var3 = (class239) field847.method608((byte) 122); var3 != null; var3 = (class239) field847.method604(-101)) {
            if (var3.field3542 && var3.method1602((byte) -84, arg0, arg1)) {
                var2.method211(var3, -32256);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V")
    public static void method488() {
        field848 = null;
        field849 = null;
        field847 = null;
        field852 = null;
        field855 = null;
        field850 = null;
        field859 = null;
        field857 = null;
        field871 = null;
        field862 = null;
        field881 = null;
        field867 = null;
        field875 = null;
        field880 = null;
        field865 = null;
        field876 = null;
        field879 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfp;II)V")
    public static final void method489(class9 arg0, int arg1, int arg2) {
        class256 var3 = new class256(field849.method738(field848.field3543, "area", (byte) -33));
        int var4 = var3.method1738((byte) 119);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1738((byte) -66);
        }
        int var7 = var3.method1738((byte) 78);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1738((byte) 97);
        }
        while (true) {
            while (var3.field3762 < var3.field3764.length) {
                if (var3.method1738((byte) -23) == 0) {
                    int var22 = var3.method1738((byte) -100);
                    int var23 = var3.method1738((byte) 91);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field870;
                            int var27 = var23 * 64 + var25 - field860;
                            method478(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1738((byte) -19);
                    int var29 = var3.method1738((byte) -61);
                    int var30 = var3.method1738((byte) 97);
                    int var31 = var3.method1738((byte) -58);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field870;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field860;
                            method478(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field881 = new byte[field877 * field872];
            field867 = new short[field877 * field872];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field877 * field872];
                for (int var13 = 0; var13 < field861[var11].length; var13++) {
                    for (int var19 = 0; var19 < field861[var11][0].length; var19++) {
                        class304 var20 = field861[var11][var13][var19];
                        if (var20 != null) {
                            for (class335 var21 = (class335) var20.method2026(100); var21 != null; var21 = (class335) var20.method2022(10)) {
                                var12[(var19 * 64 + var21.field4944) * field877 + var13 * 64 + var21.field4945] = (byte) var21.field4941;
                            }
                        }
                    }
                }
                method494(var12, field881, field867, arg1, arg2);
                for (int var14 = 0; var14 < field861[var11].length; var14++) {
                    for (int var15 = 0; var15 < field861[var11][0].length; var15++) {
                        class304 var16 = field861[var11][var14][var15];
                        if (var16 != null) {
                            for (class335 var17 = (class335) var16.method2026(100); var17 != null; var17 = (class335) var16.method2022(10)) {
                                int var18 = (var15 * 64 + var17.field4944) * field877 + var14 * 64 + var17.field4945;
                                var17.field4941 = (field881[var18] & 0xFF) << 16 | field867[var18] & 0xFFFF;
                                if (var17.field4941 != 0) {
                                    var17.field4941 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method494(field862, field881, field867, arg1, arg2);
            field862 = null;
            method481();
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Lfp;IIII)V")
    private static final void method490(class9 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field868 - field864;
        int var6 = field863 - field873;
        if (field868 < field877) {
            var5++;
        }
        if (field863 < field872) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field878;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field878;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field864 + var7;
                if (var52 >= 0 && var52 < field877) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field869 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field869 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field873 + var53;
                            int var58 = field877 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field872) {
                                var59 = (field881[var58] & 0xFF) << 16 | field867[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field875[var58] & 0xFF;
                                var61 = field865[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field848.field3554 != -1) {
                                    var62 = field848.field3554 | 0xFF000000;
                                } else if ((field864 + var7 & 0x4) == (field863 + var53 & 0x4)) {
                                    var62 = field871[class28.field393 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method164(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method482(arg0, var49, var54, var51, var56, var59, var60, field880[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class123 var63 = (class123) field879.method609((long) (var52 << 16 | var57), 84);
                                if (var63 != null) {
                                    method482(arg0, var49, var54, var51, var56, var59, var60, field880[var58], var63.field1632, var63.field1633, true);
                                }
                            } else {
                                field855[0] = (short) (var61 - 1);
                                field850[0] = field876[var58];
                                method482(arg0, var49, var54, var51, var56, var59, var60, field880[var58], field855, field850, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field869 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field869 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field848.field3554 != -1) {
                            var68 = field848.field3554 | 0xFF000000;
                        } else if ((field864 + var7 & 0x4) == (field863 + var64 & 0x4)) {
                            var68 = field871[class28.field393 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method164(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field878;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field878;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field864 + var8;
                if (var41 >= 0 && var41 < field877) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field869 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field869 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field873 + var42;
                            if (var46 >= 0 && var46 < field872) {
                                int var47 = field865[field877 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method493(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class123 var48 = (class123) field879.method609((long) (var41 << 16 | var46), 119);
                                    if (var48 != null) {
                                        method493(arg0, var38, var43, var40, var45, var48.field1632, var48.field1633);
                                    }
                                } else {
                                    field855[0] = (short) (var47 - 1);
                                    field850[0] = field876[field877 * var46 + var41];
                                    method493(arg0, var38, var43, var40, var45, field855, field850);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field864 >> 6;
        int var10 = field873 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field868 >> 6;
        int var12 = field863 >> 6;
        if (var11 >= field861[0].length) {
            var11 = field861[0].length - 1;
        }
        if (var12 >= field861[0][0].length) {
            var12 = field861[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class304 var28 = field861[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field870 >> 6) + var14) * 64;
                        int var30 = ((field860 >> 6) + var27) * 64;
                        for (class335 var31 = (class335) var28.method2026(100); var31 != null; var31 = (class335) var28.method2022(10)) {
                            int var32 = var31.field4945 + var29 - field870 - field864;
                            int var33 = var31.field4944 + var30 - field860 - field873;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field878;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field878;
                            int var36 = field869 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field869 - (arg2 * var33 + arg4 >> 16);
                            method482(arg0, var34, var36, var35 - var34, var37 - var36, var31.field4941, var31.field4946 & 0xFF, var31.field4942, var31.field4940, var31.field4943, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class304 var17 = field861[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field870 >> 6) + var15) * 64;
                        int var19 = ((field860 >> 6) + var16) * 64;
                        for (class335 var20 = (class335) var17.method2026(100); var20 != null; var20 = (class335) var17.method2022(10)) {
                            int var21 = var20.field4945 + var18 - field870 - field864;
                            int var22 = var20.field4944 + var19 - field860 - field873;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field878;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field878;
                            int var25 = field869 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field869 - (arg2 * var22 + arg4 >> 16);
                            method493(arg0, var23, var25, var24 - var23, var26 - var25, var20.field4940, var20.field4943);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
    public static final void method491() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field859.field1056; var1++) {
            boolean var2 = field848.method1610((byte) -127, field859.field1052[var1] & 0x3FFF, field859.field1052[var1] >> 28 & 0x3, var0, field859.field1052[var1] >> 14 & 0x3FFF);
            if (var2) {
                class376 var3 = new class376(field859.field1053[var1]);
                var3.field5484 = var0[1] - field870;
                var3.field5497 = var0[2] - field860;
                field857.method2484(0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Ljr;")
    public static final class239 method492(int arg0) {
        return (class239) field847.method609((long) arg0, 103);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfp;IIII[S[B)V")
    private static final void method493(class9 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class178 var8 = class450.method2785(arg5[var7] & 0xFFFF, (byte) 118);
            int var9 = var8.field2458;
            if (var9 != -1) {
                class127 var10 = class250.method1655(34, var9);
                class285 var11 = var10.method853(var8.field2462 ? arg6[var7] >> 6 & 0x3 : 0, var8.field2481 ? var8.field2517 : false, (byte) -22, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1861() >> 2;
                    int var13 = arg4 * var11.method1860() >> 2;
                    if (var10.field1675) {
                        int var14 = var8.field2533;
                        int var15 = var8.field2476;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field1681 == 0) {
                            var11.method1919(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method929(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field1681 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([B[B[SII)V")
    private static final void method494(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field872];
        int[] var6 = new int[field872];
        int[] var7 = new int[field872];
        int[] var8 = new int[field872];
        int[] var9 = new int[field872];
        for (int var10 = -5; var10 < field877; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field872; var13++) {
                int var10002;
                if (var11 < field877) {
                    int var28 = arg0[field877 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class148 var29 = class104.method700(-21855, var28 - 1);
                        var5[var13] += var29.field2005;
                        var6[var13] += var29.field2009;
                        var7[var13] += var29.field1998;
                        var8[var13] += var29.field2002;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field877 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class148 var31 = class104.method700(-21855, var30 - 1);
                        var5[var13] -= var31.field2005;
                        var6[var13] -= var31.field2009;
                        var7[var13] -= var31.field1998;
                        var8[var13] -= var31.field2002;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field872; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field872) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field877 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field877 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class330.method2158(var14 * 256 / var17, var15 / var18, -30330, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field877 * var19 + var10;
                            int var27 = class10.field129[class57.method429(class210.method1443(var25, 96, true), 127) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public static final void method495() {
        field862 = new byte[field877 * field872];
        field875 = new byte[field877 * field872];
        field880 = new byte[field877 * field872];
        field865 = new short[field877 * field872];
        field876 = new byte[field877 * field872];
        field879 = new class90(1024);
        field861 = new class304[3][field877 >> 6][field872 >> 6];
        field871 = new int[class432.field6298 + 1];
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lic;III)I")
    private static final int method496(class235 arg0, int arg1, int arg2, int arg3) {
        class103 var4 = class465.method2868(-38, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1329;
        if (var5 >= 0 && arg0.method468((byte) -37, var5).field260) {
            var5 = -1;
        }
        int var9;
        if (var4.field1326 >= 0) {
            int var6 = var4.field1326;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class10.field129[class57.method429(class99.method657(96, var8, false), 127) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class10.field129[class57.method429(class99.method657(96, arg0.method468((byte) -37, var5).field259, false), 127) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1338 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1338;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class10.field129[class57.method429(class99.method657(96, var12, false), 127) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
    public static final void method497() {
        field862 = null;
        field881 = null;
        field867 = null;
        field875 = null;
        field880 = null;
        field865 = null;
        field876 = null;
        field879 = null;
        field861 = null;
        field871 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Lfp;)V")
    public static final void method498(class9 arg0) {
        int var1 = field868 - field864;
        int var2 = field863 - field873;
        int var3 = (field874 - field878 << 16) / var1;
        int var4 = (field869 - field866 << 16) / var2;
        method490(arg0, var3, var4, 0, 0);
    }
}
