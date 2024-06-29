import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class362 {

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field5205 = 0;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
    public static int[] field5201 = new int[6];

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field5203 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "J")
    public long field5204;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Leh;")
    public class362 field5207;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Leh;")
    public class362 field5208;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lin;")
    public static class91 field5199;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[Lga;")
    public static class404[] field5206;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
    public static final boolean method2308(int arg0, int arg1, int arg2) {
        field5200++;
        if (arg2 != -1) {
            method2310(-42, 89, null, -113, true, -22, -35, 27, -109, null, 74, -94, -119, null);
        }
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
    public static final int method2309(int arg0, int arg1) {
        field5202++;
        if (arg1 < 96) {
            return 0;
        } else {
            if (arg0 >= -113) {
                field5206 = null;
            }
            return arg1 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILka;IZIIIILha;IIILhg;)Lka;")
    public static final class472 method2310(int arg0, int arg1, class472 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9, int arg10, int arg11, int arg12, class691 arg13) {
        field5211++;
        if (arg2 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg4) {
            return null;
        }
        if (arg13 != null) {
            int var15 = var14 | arg13.method3860(-1, 103, arg5, false);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg11 << 48) + (long) ((arg10 << 16) + (arg12 << 24) + arg7) + ((long) arg6 << 32);
        class112 var18 = class755.field10551;
        class472 var19;
        synchronized (class755.field10551) {
            var19 = (class472) class755.field10551.method992(var16, -64);
        }
        if (var19 == null || arg9.method343(var19.method527(), var14) != 0) {
            if (var19 != null) {
                var14 = arg9.method219(var14, var19.method527());
            }
            byte var20;
            if (arg7 == 1) {
                var20 = 9;
            } else if (arg7 == 2) {
                var20 = 12;
            } else if (arg7 == 3) {
                var20 = 15;
            } else if (arg7 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class37 var23 = new class37(var20 * var21 + 1, var20 * 2 * var21 + -var20, 0);
            int var24 = var23.method467(0, 0, 0, -44);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class255.field3698[var30] * var27 >> 14;
                    int var32 = class255.field3695[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method467(0, var32, var31, 123);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg10 * var35 + arg12 * var34 >> 8);
                short var37 = (short) (((arg6 & 0x7F) * var35 + (arg11 & 0x7F) * var34 & 0x7F00) + ((arg6 & 0xFC00) * var35 + (arg11 & 0xFC00) * var34 & 0xFC0000) + ((arg6 & 0x380) * var35 + (arg11 & 0x380) * var34 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method468(var24, (byte) 1, (byte) -1, (short) -1, (byte) 45, var37, var25[0][(var38 + 1) % var20], var36, var25[0][var38]);
                    } else {
                        var23.method468(var25[var33 - 1][var38], (byte) 1, (byte) -1, (short) -1, (byte) 48, var37, var25[var33 - 1][(var38 + 1) % var20], var36, var25[var33][(var38 + 1) % var20]);
                        var23.method468(var25[var33 - 1][var38], (byte) 1, (byte) -1, (short) -1, (byte) 100, var37, var25[var33][(var38 + 1) % var20], var36, var25[var33][var38]);
                    }
                }
            }
            var19 = arg9.method174(var23, var14, class681.field9222, 64, 768);
            class112 var39 = class755.field10551;
            synchronized (class755.field10551) {
                class755.field10551.method991(var19, var16, (byte) -103);
            }
        }
        int var40 = arg2.method509();
        int var41 = arg2.method532();
        int var42 = arg2.method506();
        int var43 = arg2.method512();
        class172 var44 = null;
        if (arg13 != null) {
            int var45 = arg13.field9327[arg5];
            var44 = class456.field6436.method1025(var45 >> 16, 3);
            arg5 = var45 & 0xFFFF;
        }
        class472 var46;
        if (var44 == null) {
            var46 = var19.method504((byte) 3, var14, true);
            var46.method483(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method528(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method504((byte) 3, var14, true);
            var46.method483(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method528(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2782(arg5, -8700, var44);
        }
        if (arg0 != 0) {
            var46.method515(arg0);
        }
        if (arg3 != 0) {
            var46.method502(arg3);
        }
        if (arg8 != 0) {
            var46.method528(0, arg8, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)Z")
    public final boolean method2311(byte arg0) {
        if (arg0 == 4) {
            field5210++;
            return this.field5208 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
    public static void method2312(int arg0) {
        field5199 = null;
        field5206 = null;
        if (arg0 != 0) {
            method2310(-47, 87, null, 85, false, -126, -116, -51, -44, null, 75, -69, 87, null);
        }
        field5201 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)Z")
    public static final boolean method2313(int arg0, int arg1) {
        if (arg0 != 7351) {
            method2308(-15, 59, 58);
        }
        field5209++;
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)V")
    public final void method2314(byte arg0) {
        field5198++;
        if (this.field5208 == null) {
            return;
        }
        this.field5208.field5207 = this.field5207;
        this.field5207.field5208 = this.field5208;
        if (arg0 < 18) {
            this.method2311((byte) 46);
        }
        this.field5207 = null;
        this.field5208 = null;
    }
}
