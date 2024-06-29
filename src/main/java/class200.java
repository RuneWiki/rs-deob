import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class200 extends class151 {

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field3689 = 0;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lbg;")
    public static class19 field3697 = new class19();

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "Lmb;")
    public static class132 field3702 = class166.method1092("Untersuchen", 124);

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field3700 = -1;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "B")
    public byte field3694;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lmb;")
    public class132 field3693;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Lmb;")
    public class132 field3699;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Loc;")
    public static class155 field3690;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method1260(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3698++;
        int var9 = arg4 - arg0;
        int var10 = arg5 - arg7;
        if (arg1 != 19) {
            method1265(-128, 115, 6);
        }
        int var11 = (arg6 - arg3 << 16) / var10;
        int var12 = (arg2 - arg8 << 16) / var9;
        boolean var13;
        if (class185.field3438 > 0 && class185.field3438 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        for (int var14 = 0; var14 < var10; var14++) {
            int var31 = var11 * var14 >> 16;
            int var32 = (var14 + 1) * var11 >> 16;
            int var33 = var32 - var31;
            if (var33 > 0) {
                int var10000 = arg3 + var32;
                int[][] var35 = class222.field4044[var14 + arg7 >> 6];
                int var36 = arg3 + var31;
                for (int var37 = 0; var37 < var9; var37++) {
                    int var38 = (var37 + 1) * var12 >> 16;
                    int var39 = var12 * var37 >> 16;
                    int var40 = var38 - var39;
                    if (var40 > 0) {
                        int var41 = arg8 + var39;
                        var10000 = arg8 + var38;
                        int var43 = var37 + arg0 >> 6;
                        if (var35[var43] != null) {
                            int var44 = ((arg0 + var37 & 0x3F) << 6) + (arg7 + var14 & 0x3F);
                            int var45 = var35[var43][var44];
                            if (var45 != 0) {
                                class84 var46 = class66.method414(0, var45 - 1);
                                if (var13 && class163.field2949 == var46.field1436) {
                                    class137 var47 = new class137();
                                    var47.field2566 = var41;
                                    var47.field2576 = var36;
                                    var47.field2570 = var46.field1436;
                                    class226.field4090.method120(arg1 ^ 0x13, var47);
                                }
                                class189.field3492[var46.field1436].method103(var36 - 7, var41 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class53.field902 == class151.field2765) {
            for (class100 var15 = (class100) class138.field2584.method119(true); var15 != null; var15 = (class100) class138.field2584.method125((byte) -121)) {
                int var16 = var15.field1880;
                int var17 = var15.field1874;
                int var18 = 16777215;
                int var19 = var15.field1875;
                int var20 = var16 - class28.field451;
                class143 var21 = null;
                int var22 = (arg6 - arg3) * (var20 - arg7) / (arg5 - arg7) + arg3;
                int var23 = class141.field2632 + class113.field2188 - var17;
                int var24 = (var23 - arg0) * (arg2 - arg8) / (arg4 - arg0) + arg8;
                if (var19 == 0) {
                    if (class151.field2765 == 3.0D) {
                        var21 = class159.field2898;
                    }
                    if (class151.field2765 == 4.0D) {
                        var21 = class137.field2574;
                    }
                    if (class151.field2765 == 6.0D) {
                        var21 = class153.field2796;
                    }
                    if (class151.field2765 == 8.0D) {
                        var21 = class82.field1383;
                    }
                }
                if (var19 == 1) {
                    if (class151.field2765 == 3.0D) {
                        var21 = class153.field2796;
                    }
                    if (class151.field2765 == 4.0D) {
                        var21 = class82.field1383;
                    }
                    if (class151.field2765 == 6.0D) {
                        var21 = class32.field500;
                    }
                    if (class151.field2765 == 8.0D) {
                        var21 = class217.field3973;
                    }
                }
                if (var19 == 2) {
                    if (class151.field2765 == 3.0D) {
                        var21 = class32.field500;
                    }
                    var18 = 16755200;
                    if (class151.field2765 == 4.0D) {
                        var21 = class217.field3973;
                    }
                    if (class151.field2765 == 6.0D) {
                        var21 = class24.field344;
                    }
                    if (class151.field2765 == 8.0D) {
                        var21 = class73.field1221;
                    }
                }
                if (var21 != null) {
                    class132[] var25 = var15.field1883;
                    int var26 = var25.length;
                    int var27 = var24 - (var26 - 1) * var21.method959() / 2;
                    int var28 = var27 + var21.method963() / 2;
                    for (int var29 = 0; var29 < var26; var29++) {
                        var21.method966(var25[var29], var22, var28, var18, true);
                        var28 += var21.method959();
                    }
                }
            }
        }
        for (class137 var30 = (class137) class226.field4090.method119(true); var30 != null; var30 = (class137) class226.field4090.method125((byte) -30)) {
            class189.field3492[var30.field2570].method103(var30.field2576 - 7, var30.field2566 + -7);
            class239.method1523(var30.field2576, var30.field2566, 15, 16776960, 128);
            class239.method1523(var30.field2576, var30.field2566, 7, 16777215, 256);
        }
        class226.field4090.method130(12040);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lpb;IB)Lhh;")
    public static final class85 method1261(class165 arg0, int arg1, byte arg2) {
        if (arg2 != 67) {
            field3697 = null;
        }
        field3691++;
        return class43.method293(arg1, arg0, arg2 ^ 0xFFFFADBC) ? class36.method254((byte) 120) : null;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        field3692++;
        class64.field1054.method660(68, 3);
        for (class73 var1 = (class73) class55.field927.method811((byte) -4); var1 != null; var1 = (class73) class55.field927.method807(-19009)) {
            if (var1.field1215 == 0) {
                class24.method168(var1, false, true);
            }
        }
        if (arg0 != -3727) {
            method1263(-51, 13, 43, -42, -79, null, null);
        }
        if (class169.field3115 != null) {
            class183.method1174(class169.field3115, arg0 ^ 0xFFFFCE1A);
            class169.field3115 = null;
        }
        class216.field3943++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII[B[Ltf;)V")
    public static final void method1263(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class210[] arg6) {
        if (arg3 < 109) {
            return;
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg2 + var12 > 0 && arg2 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg6[var7].field3853[arg2 + var12][arg4 + var13] = class75.method450(arg6[var7].field3853[arg2 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        class112 var8 = new class112(arg5);
        field3695++;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class91.method569(0, arg2 + var10, (byte) -15, arg0, arg1, var11 + arg4, var9, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public static void method1264(int arg0) {
        field3702 = null;
        if (arg0 != -620026160) {
            field3701 = -49;
        }
        field3697 = null;
        field3690 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)J")
    public static final long method1265(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        return var3 == null || var3.field3099 == null ? 0L : var3.field3099.field4022;
    }
}
