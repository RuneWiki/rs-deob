import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class255 {

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Lvea;")
    private class404 field3334;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    private int field3335;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public int field3342;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Lko;")
    public static class255 field3339 = new class255(0, 3, class404.field5342);

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Lko;")
    public static class255 field3343 = new class255(1, 3, class404.field5342);

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Lko;")
    public static class255 field3344 = new class255(2, 4, class404.field5338);

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Lko;")
    public static class255 field3345 = new class255(3, 1, class404.field5342);

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lko;")
    public static class255 field3346 = new class255(4, 2, class404.field5342);

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "Lko;")
    public static class255 field3347 = new class255(5, 3, class404.field5342);

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lko;")
    public static class255 field3348 = new class255(6, 4, class404.field5342);

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field3349 = class252.method1532(-63, 16);

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field3350 = 100;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public static void method1540(int arg0) {
        field3347 = null;
        field3348 = null;
        field3345 = null;
        field3344 = null;
        field3339 = null;
        if (arg0 != 13179) {
            field3345 = null;
        }
        field3346 = null;
        field3343 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Z")
    public static final boolean method1541(boolean arg0) {
        field3338++;
        boolean var1 = true;
        if (class404.field5344 == null) {
            if (class390.field5228.method1931(1, class609.field8463)) {
                class404.field5344 = class92.method508(class390.field5228, class609.field8463);
            } else {
                var1 = false;
            }
        }
        if (arg0) {
            field3350 = 106;
        }
        if (class441.field5859 == null) {
            if (class390.field5228.method1931(1, class314.field4211)) {
                class441.field5859 = class92.method508(class390.field5228, class314.field4211);
            } else {
                var1 = false;
            }
        }
        if (class559.field7626 == null) {
            if (class390.field5228.method1931(1, class641.field8843)) {
                class559.field7626 = class92.method508(class390.field5228, class641.field8843);
            } else {
                var1 = false;
            }
        }
        if (class342.field4578 == null) {
            if (class208.field2785.method1931(1, class274.field3647)) {
                class342.field4578 = class77.method422(class208.field2785, class274.field3647, (byte) -113);
            } else {
                var1 = false;
            }
        }
        if (class603.field8421 == null) {
            if (class390.field5228.method1931(1, class274.field3647)) {
                class603.field8421 = class92.method513(class390.field5228, class274.field3647);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)Lko;")
    public static final class255 method1542(boolean arg0, int arg1) {
        if (!arg0) {
            method1540(123);
        }
        field3341++;
        if (arg1 == 0) {
            return field3339;
        } else if (arg1 == 1) {
            return field3343;
        } else if (arg1 == 2) {
            return field3344;
        } else if (arg1 == 3) {
            return field3345;
        } else if (arg1 == 4) {
            return field3346;
        } else if (arg1 == 5) {
            return field3347;
        } else if (arg1 == 6) {
            return field3348;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3336++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([BII)[B")
    public static final byte[] method1543(byte[] arg0, int arg1, int arg2) {
        field3340++;
        if (arg2 != 3) {
            method1544(-118, null, null, -85, null, -6, -59, (byte) 38, 21, 50, -66, -21, 69, 35);
        }
        byte[] var3 = new byte[arg1];
        class2.method9(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILda;Lhca;ILr;IIBIIIIII)Lda;")
    public static final class470 method1544(int arg0, class470 arg1, class186 arg2, int arg3, class562 arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3337++;
        if (arg1 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg2 != null) {
            int var15 = var14 | arg2.method1234(arg12, (byte) -90, false, -1);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg8 << 48) + ((long) ((arg9 << 16) + arg10 + (arg13 << 24)) + ((long) arg11 << 32));
        class380 var18 = class133.field1843;
        class470 var19;
        synchronized (class133.field1843) {
            var19 = (class470) class133.field1843.method2176(-128, var16);
            if (arg7 <= 55) {
                method1544(41, null, null, -106, null, -32, 30, (byte) 61, 79, 76, -71, 111, 84, -22);
            }
        }
        if (var19 == null || arg4.method1053(var19.method604(), var14) != 0) {
            if (var19 != null) {
                var14 = arg4.method1080(var14, var19.method604());
            }
            byte var20;
            if (arg10 == 1) {
                var20 = 9;
            } else if (arg10 == 2) {
                var20 = 12;
            } else if (arg10 == 3) {
                var20 = 15;
            } else if (arg10 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class250 var23 = new class250(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method1519(0, 0, false, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class240.field3176[var30] * var27 >> 14;
                    int var32 = class240.field3177[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method1519(var32, var31, false, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg9 * var35 + arg13 * var34 >> 8);
                short var37 = (short) (((arg8 & 0x7F) * var34 + (arg11 & 0x7F) * var35 & 0x7F00) + ((arg8 & 0x380) * var34 + (arg11 & 0x380) * var35 & 0x38000) + ((arg8 & 0xFC00) * var34 + (arg11 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method1520(var36, -127, var37, var25[0][var38], (byte) -1, var24, (short) -1, (byte) 1, var25[0][(var38 + 1) % var20]);
                    } else {
                        var23.method1520(var36, 127, var37, var25[var33][(var38 + 1) % var20], (byte) -1, var25[var33 - 1][var38], (short) -1, (byte) 1, var25[var33 - 1][(var38 + 1) % var20]);
                        var23.method1520(var36, -82, var37, var25[var33][var38], (byte) -1, var25[var33 - 1][var38], (short) -1, (byte) 1, var25[var33][(var38 + 1) % var20]);
                    }
                }
            }
            var19 = arg4.method1089(var23, var14, class55.field726, 64, 768);
            class380 var39 = class133.field1843;
            synchronized (class133.field1843) {
                class133.field1843.method2174(var19, var16, (byte) 127);
            }
        }
        int var40 = arg1.method650();
        int var41 = arg1.method647();
        int var42 = arg1.method656();
        int var43 = arg1.method660();
        class493 var44 = null;
        if (arg2 != null) {
            int var45 = arg2.field2570[arg12];
            var44 = class423.field5620.method1704(100, var45 >> 16);
            arg12 = var45 & 0xFFFF;
        }
        class470 var46;
        if (var44 == null) {
            var46 = var19.method649((byte) 3, var14, true);
            var46.method611(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method605(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method649((byte) 3, var14, true);
            var46.method611(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method605(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2706((byte) -108, arg12, var44);
        }
        if (arg3 != 0) {
            var46.method643(arg3);
        }
        if (arg5 != 0) {
            var46.method616(arg5);
        }
        if (arg0 != 0) {
            var46.method605(0, arg0, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IILvea;)V")
    private class255(int arg0, int arg1, class404 arg2) {
        this.field3334 = arg2;
        this.field3335 = arg1;
        this.field3342 = arg0;
        this.field3333 = this.field3334.field5334 * this.field3335;
        if (this.field3342 >= 16) {
            throw new RuntimeException();
        }
    }
}
