import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class40 {

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    private int field853 = 0;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "[[I")
    public int[][] field855;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Lqe;")
    private static class179 field857 = class206.method1380("Loaded input handler", (byte) 103);

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lqe;")
    public static class179 field849 = field857;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lsg;")
    public static class201 field843 = new class201(5);

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "Lqe;")
    private static class179 field865 = class206.method1380("Please reload this page)3", (byte) -127);

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field869 = 100;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lqe;")
    public static class179 field863 = field865;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "Lqe;")
    public static class179 field864 = class206.method1380("Ihr Spielkonto wird bereits benutzt)3", (byte) -127);

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "Lqe;")
    public static class179 field871 = class206.method1380("<col=ffff00>", (byte) -127);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "Lpc;")
    public static class166 field867;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "Leb;")
    public static class46 field870;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "[I")
    public static int[] field866;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZI)V")
    public final void method255(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg5 - this.field862;
        int var8 = arg0 - this.field853;
        if (arg1 != 16) {
            method256(40);
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method270(var8, arg1 ^ 0xFFFFFFEF, 128, var7);
                this.method270(var8 - 1, -1, 8, var7);
            }
            if (arg2 == 1) {
                this.method270(var8, -1, 2, var7);
                this.method270(var8, arg1 - 17, 32, var7 + 1);
            }
            if (arg2 == 2) {
                this.method270(var8, -1, 8, var7);
                this.method270(var8 + 1, -1, 128, var7);
            }
            if (arg2 == 3) {
                this.method270(var8, arg1 - 17, 32, var7);
                this.method270(var8, -1, 2, var7 - 1);
            }
        }
        field839++;
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method270(var8, -1, 1, var7);
                this.method270(var8 - 1, arg1 ^ 0xFFFFFFEF, 16, var7 + 1);
            }
            if (arg2 == 1) {
                this.method270(var8, arg1 ^ 0xFFFFFFEF, 4, var7);
                this.method270(var8 + 1, -1, 64, var7 + 1);
            }
            if (arg2 == 2) {
                this.method270(var8, arg1 ^ 0xFFFFFFEF, 16, var7);
                this.method270(var8 + 1, -1, 1, var7 - 1);
            }
            if (arg2 == 3) {
                this.method270(var8, -1, 64, var7);
                this.method270(var8 - 1, -1, 4, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method270(var8, -1, 130, var7);
                this.method270(var8 - 1, -1, 8, var7);
                this.method270(var8, -1, 32, var7 + 1);
            }
            if (arg2 == 1) {
                this.method270(var8, -1, 10, var7);
                this.method270(var8, -1, 32, var7 + 1);
                this.method270(var8 + 1, -1, 128, var7);
            }
            if (arg2 == 2) {
                this.method270(var8, -1, 40, var7);
                this.method270(var8 + 1, arg1 + -17, 128, var7);
                this.method270(var8, -1, 2, var7 - 1);
            }
            if (arg2 == 3) {
                this.method270(var8, -1, 160, var7);
                this.method270(var8, -1, 2, var7 - 1);
                this.method270(var8 - 1, -1, 8, var7);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method270(var8, -1, 65536, var7);
                this.method270(var8 - 1, -1, 4096, var7);
            }
            if (arg2 == 1) {
                this.method270(var8, -1, 1024, var7);
                this.method270(var8, -1, 16384, var7 + 1);
            }
            if (arg2 == 2) {
                this.method270(var8, -1, 4096, var7);
                this.method270(var8 + 1, arg1 ^ 0xFFFFFFEF, 65536, var7);
            }
            if (arg2 == 3) {
                this.method270(var8, arg1 - 17, 16384, var7);
                this.method270(var8, -1, 1024, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method270(var8, -1, 512, var7);
                this.method270(var8 - 1, arg1 + -17, 8192, var7 + 1);
            }
            if (arg2 == 1) {
                this.method270(var8, -1, 2048, var7);
                this.method270(var8 + 1, -1, 32768, var7 + 1);
            }
            if (arg2 == 2) {
                this.method270(var8, -1, 8192, var7);
                this.method270(var8 + 1, -1, 512, var7 - 1);
            }
            if (arg2 == 3) {
                this.method270(var8, -1, 32768, var7);
                this.method270(var8 - 1, -1, 2048, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method270(var8, -1, 66560, var7);
            this.method270(var8 - 1, -1, 4096, var7);
            this.method270(var8, -1, 16384, var7 + 1);
        }
        if (arg2 == 1) {
            this.method270(var8, -1, 5120, var7);
            this.method270(var8, -1, 16384, var7 + 1);
            this.method270(var8 + 1, arg1 + -17, 65536, var7);
        }
        if (arg2 == 2) {
            this.method270(var8, arg1 ^ 0xFFFFFFEF, 20480, var7);
            this.method270(var8 + 1, arg1 + -17, 65536, var7);
            this.method270(var8, -1, 1024, var7 - 1);
        }
        if (arg2 == 3) {
            this.method270(var8, -1, 81920, var7);
            this.method270(var8, arg1 ^ 0xFFFFFFEF, 1024, var7 - 1);
            this.method270(var8 - 1, -1, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method256(int arg0) {
        if (arg0 > -114) {
            field864 = null;
        }
        field867 = null;
        field843 = null;
        field865 = null;
        field857 = null;
        field870 = null;
        field849 = null;
        field871 = null;
        field866 = null;
        field864 = null;
        field863 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1 + arg4 - 1;
        field852++;
        if (arg2 > -75) {
            this.method270(-106, 18, -4, -109);
        }
        int var10 = arg6 + arg3 - 1;
        if (arg1 <= arg5 && var9 >= arg5 && arg0 >= arg3 && arg0 <= var10) {
            return true;
        } else if (arg1 - 1 == arg5 && arg0 >= arg3 && var10 >= arg0 && (this.field855[arg5 - this.field853][arg0 - this.field862] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg0 >= arg3 && arg0 <= var10 && (this.field855[arg5 - this.field853][arg0 - this.field862] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg0 && arg1 <= arg5 && var9 >= arg5 && (this.field855[arg5 - this.field853][arg0 - this.field862] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg1 <= arg5 && var9 >= arg5 && (this.field855[arg5 - this.field853][arg0 - this.field862] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field850++;
        if (arg0 == arg4 && arg1 == arg2) {
            return true;
        }
        int var8 = arg0 - this.field853;
        int var9 = arg4 - this.field853;
        int var10 = arg2 - this.field862;
        if (arg6 >= -66) {
            return false;
        }
        int var11 = arg1 - this.field862;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field855[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field855[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field855[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field855[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field855[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field855[var8][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field855[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field855[var8][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field855[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field855[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field855[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field855[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    public final void method259(int arg0, int arg1, int arg2) {
        if (arg2 >= -23) {
            field864 = null;
        }
        field841++;
        int var4 = arg0 - this.field853;
        int var5 = arg1 - this.field862;
        this.field855[var4][var5] = class125.method790(this.field855[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZBIIII)V")
    public final void method260(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field858++;
        int var7 = arg5 - this.field853;
        int var8 = arg2 - this.field862;
        if (arg1 != -50) {
            return;
        }
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < var7 + arg4; var10++) {
            if (var10 >= 0 && var10 < this.field846) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && this.field860 > var11) {
                        this.method261(arg1 ^ 0x7CCB, var11, var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
    private final void method261(int arg0, int arg1, int arg2, int arg3) {
        field859++;
        if (arg0 != -31995) {
            this.field860 = -37;
        }
        this.field855[arg3][arg1] = class125.method790(this.field855[arg3][arg1], arg2);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIBI)V")
    public static final void method262(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -109) {
            method256(-89);
        }
        field848++;
        if (class96.field1817 < 100) {
            class149.method955(119);
        }
        class145.method918(arg1, arg2, arg1 + arg4, arg0 + arg2);
        class27.method169();
        class145.method937(arg1, arg2, arg4, arg0, 0);
        if (class96.field1817 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg1;
            int var7 = arg0 / 2 + arg2 - var5 - 18;
            class145.method919(var6 - 152, var7, 304, 34, 9179409);
            class145.method919(var6 - 151, var7 - -1, 302, 32, 0);
            class145.method937(var6 - 150, var7 + 2, class96.field1817 * 3, 30, 9179409);
            class145.method937(var6 + class96.field1817 * 3 - 150, var7 + 2, 300 - class96.field1817 * 3, 30, 0);
            class71.field1422.method1000(class86.field1655, var6, var5 + var7, 16777215, -1);
            return;
        }
        class52.field1132 = (int) ((double) (arg0 * 2) / class150.field2698);
        int var8 = class164.field2972 - (int) ((double) arg4 / class150.field2698);
        class71.field1426 = (int) ((double) (arg4 * 2) / class150.field2698);
        class33.field716 = class71.field1421 - (int) ((double) arg0 / class150.field2698);
        class189.field3505 = class164.field2972 - (int) ((double) arg4 / class150.field2698);
        int var9 = class71.field1421 - (int) ((double) arg0 / class150.field2698);
        int var10 = (int) ((double) arg0 / class150.field2698) + class71.field1421;
        int var11 = class164.field2972 + (int) ((double) arg4 / class150.field2698);
        class128.method824(arg0 + arg2, var9, var10, 109, var8, arg2, arg1 + arg4, arg1, var11);
        class9.method56(arg0 + arg2, var8, arg1, var11, arg1 + arg4, var9, var10, arg2, (byte) -87);
        if (class232.field4282 > 0) {
            class232.field4282--;
        }
        if (!class191.field3568) {
            return;
        }
        int var12 = arg1 + arg4 - 5;
        int var13 = arg0 + arg2 - 8;
        class191.field3546.method999(class78.method502((byte) -83, new class179[] { class114.field2138, class148.method949((byte) -14, class149.field2689) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        int var14 = 16776960;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 32768 && class180.field3307) {
            var14 = 16711680;
        }
        if (var16 > 65536 && !class180.field3307) {
            var14 = 16711680;
        }
        class191.field3546.method999(class78.method502((byte) -115, new class179[] { class54.field1199, class148.method949((byte) -14, var16), class241.field4429 }), var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
    public final void method263(int arg0, int arg1, int arg2) {
        field845++;
        int var4 = arg1 - this.field853;
        if (arg2 != -5502) {
            this.method257(95, 89, -67, 36, 51, -24, -78, 30);
        }
        int var5 = arg0 - this.field862;
        this.field855[var4][var5] = class107.method696(this.field855[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lra;Z)Lje;")
    public static final class102 method264(class185 arg0, boolean arg1) {
        arg0.method1243(3);
        field854++;
        int var2 = arg0.method1243(3);
        class102 var3 = class44.method292(var2, -12437);
        var3.field1958 = arg0.method1243(3);
        int var4 = arg0.method1243(3);
        if (!arg1) {
            method262(101, 13, 56, (byte) -24, -34);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1243(3);
            var3.method13(arg0, var6, false);
        }
        var3.method191(14005);
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIIII)V")
    public final void method265(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field862;
        field840++;
        int var8 = arg3 - this.field853;
        if (arg5 != 128) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method261(-31995, var7, 128, var8);
                this.method261(-31995, var7, 8, var8 - 1);
            }
            if (arg2 == 1) {
                this.method261(-31995, var7, 2, var8);
                this.method261(-31995, var7 + 1, 32, var8);
            }
            if (arg2 == 2) {
                this.method261(-31995, var7, 8, var8);
                this.method261(arg5 - 32123, var7, 128, var8 + 1);
            }
            if (arg2 == 3) {
                this.method261(-31995, var7, 32, var8);
                this.method261(-31995, var7 - 1, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method261(-31995, var7, 1, var8);
                this.method261(-31995, var7 + 1, 16, var8 - 1);
            }
            if (arg2 == 1) {
                this.method261(arg5 ^ 0xFFFF8385, var7, 4, var8);
                this.method261(arg5 ^ 0xFFFF8385, var7 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method261(-31995, var7, 16, var8);
                this.method261(-31995, var7 - 1, 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method261(-31995, var7, 64, var8);
                this.method261(arg5 - 32123, var7 + -1, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method261(arg5 ^ 0xFFFF8385, var7, 130, var8);
                this.method261(-31995, var7, 8, var8 - 1);
                this.method261(arg5 - 32123, var7 + 1, 32, var8);
            }
            if (arg2 == 1) {
                this.method261(-31995, var7, 10, var8);
                this.method261(-31995, var7 + 1, 32, var8);
                this.method261(arg5 - 32123, var7, 128, var8 + 1);
            }
            if (arg2 == 2) {
                this.method261(-31995, var7, 40, var8);
                this.method261(arg5 - 32123, var7, 128, var8 + 1);
                this.method261(-31995, var7 - 1, 2, var8);
            }
            if (arg2 == 3) {
                this.method261(arg5 - 32123, var7, 160, var8);
                this.method261(-31995, var7 - 1, 2, var8);
                this.method261(-31995, var7, 8, var8 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method261(-31995, var7, 65536, var8);
                this.method261(-31995, var7, 4096, var8 - 1);
            }
            if (arg2 == 1) {
                this.method261(-31995, var7, 1024, var8);
                this.method261(-31995, var7 + 1, 16384, var8);
            }
            if (arg2 == 2) {
                this.method261(-31995, var7, 4096, var8);
                this.method261(-31995, var7, 65536, var8 + 1);
            }
            if (arg2 == 3) {
                this.method261(-31995, var7, 16384, var8);
                this.method261(arg5 - 32123, var7 + -1, 1024, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method261(-31995, var7, 512, var8);
                this.method261(-31995, var7 + 1, 8192, var8 - 1);
            }
            if (arg2 == 1) {
                this.method261(-31995, var7, 2048, var8);
                this.method261(arg5 ^ 0xFFFF8385, var7 + 1, 32768, var8 + 1);
            }
            if (arg2 == 2) {
                this.method261(-31995, var7, 8192, var8);
                this.method261(-31995, var7 - 1, 512, var8 + 1);
            }
            if (arg2 == 3) {
                this.method261(-31995, var7, 32768, var8);
                this.method261(-31995, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method261(-31995, var7, 66560, var8);
            this.method261(arg5 - 32123, var7, 4096, var8 - 1);
            this.method261(-31995, var7 + 1, 16384, var8);
        }
        if (arg2 == 1) {
            this.method261(-31995, var7, 5120, var8);
            this.method261(arg5 ^ 0xFFFF8385, var7 + 1, 16384, var8);
            this.method261(-31995, var7, 65536, var8 + 1);
        }
        if (arg2 == 2) {
            this.method261(-31995, var7, 20480, var8);
            this.method261(-31995, var7, 65536, var8 + 1);
            this.method261(arg5 ^ 0xFFFF8385, var7 - 1, 1024, var8);
        }
        if (arg2 == 3) {
            this.method261(-31995, var7, 81920, var8);
            this.method261(-31995, var7 - 1, 1024, var8);
            this.method261(-31995, var7, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIZII)V")
    public final void method266(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field853;
        int var9 = arg3 - this.field862;
        field844++;
        int var10 = 256;
        if (arg4) {
            var10 += 131072;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg5;
            arg5 = arg0;
            arg0 = var11;
        }
        int var12 = var8;
        if (arg1) {
            return;
        }
        while (var12 < var8 + arg5) {
            if (var12 >= 0 && var12 < this.field846) {
                for (int var13 = var9; var13 < var9 + arg0; var13++) {
                    if (var13 >= 0 && var13 < this.field860) {
                        this.method270(var12, -1, var10, var13);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field851++;
        if (arg2 == arg5 && arg1 == arg6) {
            return true;
        }
        int var8 = arg6 - this.field862;
        int var9 = arg1 - this.field862;
        int var10 = arg2 - this.field853;
        int var11 = arg5 - this.field853;
        if (~arg3 == arg0) {
            if (arg4 == 0) {
                if (var10 - 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field855[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field855[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 == var11 && var8 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 + 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field855[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field855[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 == var11 && var8 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                if (var10 - 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field855[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field855[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field855[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 - 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field855[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field855[var11][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field855[var11][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var11 && var8 == var9 && (this.field855[var11][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)V")
    public final void method268(int arg0, int arg1, int arg2) {
        field856++;
        if (arg2 != -8261) {
            this.field853 = 118;
        }
        int var4 = arg0 - this.field853;
        int var5 = arg1 - this.field862;
        this.field855[var4][var5] = class125.method790(this.field855[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method269(int arg0) {
        if (arg0 != 16777215) {
            return;
        }
        for (int var2 = 0; var2 < this.field846; var2++) {
            for (int var3 = 0; var3 < this.field860; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field846 - 5 || var3 >= this.field860 - 5) {
                    this.field855[var2][var3] = 16777215;
                } else {
                    this.field855[var2][var3] = 16777216;
                }
            }
        }
        field838++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIII)V")
    private final void method270(int arg0, int arg1, int arg2, int arg3) {
        field861++;
        if (arg1 == -1) {
            this.field855[arg0][arg3] = class107.method696(this.field855[arg0][arg3], ~arg2);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
    public static final boolean method271(int arg0) {
        field842++;
        try {
            if (arg0 < 1) {
                field863 = null;
            }
            return class178.method1120(-94);
        } catch (IOException var4) {
            class84.method571((byte) 90);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class169.field3043 + "," + class223.field4120 + "," + class192.field3581 + " - " + class150.field2705 + "," + (class61.field1298.field3200[0] + class2.field26) + "," + (class141.field2582 + class61.field1298.field3160[0]) + " - ";
            for (int var3 = 0; var3 < class150.field2705 && var3 < 50; var3++) {
                var2 = var2 + class36.field789.field3397[var3] + ",";
            }
            class214.method1406(var2, true, var5);
            class219.method1429(-53);
            return true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V")
    public class40(int arg0, int arg1) {
        this.field846 = arg0;
        this.field862 = 0;
        this.field860 = arg1;
        this.field855 = new int[this.field846][this.field860];
        this.method269(16777215);
    }
}
