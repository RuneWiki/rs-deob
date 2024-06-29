import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class136 extends class51 {

    @OriginalMember(owner = "client!p", name = "ob", descriptor = "I")
    private int field2830 = -1;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "Led;")
    public static class43 field2824 = class191.method1219("scrollbar", false);

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field2826 = 2;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Led;")
    public static class43 field2817 = class191.method1219("blinken3:", false);

    @OriginalMember(owner = "client!p", name = "pb", descriptor = "B")
    public static byte field2831 = 0;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "Led;")
    public static class43 field2827 = class191.method1219("<col=00ffff>", false);

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!p", name = "nb", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!p", name = "qb", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!p", name = "rb", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "Lke;")
    public static class96 field2825;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "[I")
    public int[] field2819;

    @OriginalMember(owner = "client!p", name = "sb", descriptor = "[Lnb;")
    public static class120[] field2834;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)[[I")
    public int[][] method99(int arg0, byte arg1) {
        ++field2820;
        if (arg1 != -94) {
            return null;
        } else {
            int[][] var3 = super.field1027.method1087(arg0, -2);
            if (super.field1027.field3428 && this.method884((byte) -95)) {
                int[] var4 = var3[1];
                int var5 = (class112.field2144 != this.field2816 ? this.field2816 * arg0 / class112.field2144 : arg0) * this.field2815;
                int[] var6 = var3[2];
                int[] var7 = var3[0];
                if (~class122.field2442 != ~this.field2815) {
                    for (int var8 = 0; ~class122.field2442 < ~var8; ++var8) {
                        int var9 = this.field2815 * var8 / class122.field2442;
                        int var10 = this.field2819[var5 - -var9];
                        var6[var8] = class7.method38(var10 << 4, 4080);
                        var4[var8] = class7.method38(65280, var10) >> 4;
                        var7[var8] = class7.method38(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; var11 < class122.field2442; ++var11) {
                        int var12 = this.field2819[var5++];
                        var6[var11] = class7.method38(4080, var12 << 4);
                        var4[var11] = class7.method38(4080, var12 >> 4);
                        var7[var11] = class7.method38(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IBI)I")
    public static final int method879(int arg0, byte arg1, int arg2) {
        if (arg1 > -89) {
            field2825 = null;
        }
        ++field2821;
        if (~arg0 < ~arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (~arg0 != -1) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)I")
    public final int method307(boolean arg0) {
        ++field2829;
        if (!arg0) {
            field2831 = 78;
        }
        return this.field2830;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIB)V")
    public static final void method880(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = (arg0 + -32) * arg0 / arg2;
        if (arg5 != -56) {
            field2831 = -72;
        }
        class69.field1380[0].method1163(arg4, arg1);
        ++field2833;
        class69.field1380[1].method1163(arg4, arg1 - -arg0 - 16);
        if (~var6 > -9) {
            var6 = 8;
        }
        int var7 = (-32 - var6 + arg0) * arg3 / (-arg0 + arg2);
        class168.method1046(arg4, arg1 + 16, 16, arg0 + -32, class154.field3140);
        class168.method1046(arg4, var7 + 16 + arg1, 16, var6, class82.field1619);
        class168.method1048(arg4, arg1 + 16 + var7, var6, class73.field1420);
        class168.method1048(arg4 - -1, arg1 - -var7 + 16, var6, class73.field1420);
        class168.method1040(arg4, arg1 - (-var7 + -16), 16, class73.field1420);
        class168.method1040(arg4, var7 + 17 + arg1, 16, class73.field1420);
        class168.method1048(arg4 + 15, arg1 + 16 + var7, var6, class170.field3396);
        class168.method1048(arg4 + 14, arg1 - -17 + var7, var6 - 1, class170.field3396);
        class168.method1040(arg4, arg1 + var7 + var6 + 15, 16, class170.field3396);
        class168.method1040(arg4 + 1, 14 - -var6 + arg1 + var7, 15, class170.field3396);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Lta;[IBII[I)V")
    public static final void method881(class173[] arg0, int[] arg1, byte arg2, int arg3, int arg4, int[] arg5) {
        if (arg2 != -63) {
            field2834 = null;
        }
        if (~arg4 > ~arg3) {
            int var6 = (arg3 + arg4) / 2;
            int var7 = arg3 + 1;
            int var8 = arg4 + -1;
            class173 var9 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var9;
            while (~var7 < ~var8) {
                boolean var10 = true;
                do {
                    --var7;
                    for (int var11 = 0; var11 < 4; ++var11) {
                        int var12;
                        int var13;
                        if (arg5[var11] != 2) {
                            if (~arg5[var11] == -2) {
                                var12 = var9.field3456;
                                if (var12 == -1 && arg1[var11] == 1) {
                                    var12 = 2001;
                                }
                                var13 = arg0[var7].field3456;
                                if (var13 == -1 && ~arg1[var11] == -2) {
                                    var13 = 2001;
                                }
                            } else if (arg5[var11] != 3) {
                                var13 = arg0[var7].field3458;
                                var12 = var9.field3458;
                            } else {
                                var12 = var9.field3452 ? 1 : 0;
                                var13 = !arg0[var7].field3452 ? 0 : 1;
                            }
                        } else {
                            var12 = var9.field3455;
                            var13 = arg0[var7].field3455;
                        }
                        if (~var12 != ~var13) {
                            if ((arg1[var11] != 1 || var13 <= var12) && (~arg1[var11] != -1 || var13 >= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (~var11 == -4) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    ++var8;
                    for (int var15 = 0; var15 < 4; ++var15) {
                        int var16;
                        int var17;
                        if (arg5[var15] == 2) {
                            var16 = arg0[var8].field3455;
                            var17 = var9.field3455;
                        } else if (~arg5[var15] != -2) {
                            if (~arg5[var15] == -4) {
                                var16 = arg0[var8].field3452 ? 1 : 0;
                                var17 = var9.field3452 ? 1 : 0;
                            } else {
                                var16 = arg0[var8].field3458;
                                var17 = var9.field3458;
                            }
                        } else {
                            var16 = arg0[var8].field3456;
                            if (var16 == -1 && ~arg1[var15] == -2) {
                                var16 = 2001;
                            }
                            var17 = var9.field3456;
                            if (~var17 == 0 && ~arg1[var15] == -2) {
                                var17 = 2001;
                            }
                        }
                        if (~var16 != ~var17) {
                            if ((~arg1[var15] != -2 || var17 <= var16) && (arg1[var15] != 0 || ~var17 <= ~var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 > var8) {
                    class173 var18 = arg0[var8];
                    arg0[var8] = arg0[var7];
                    arg0[var7] = var18;
                }
            }
            method881(arg0, arg1, (byte) -63, var7, arg4, arg5);
            method881(arg0, arg1, (byte) -63, arg3, var7 + 1, arg5);
        }
        ++field2832;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            if (~arg2 == -1) {
                this.field2830 = arg0.method555(arg1 ^ -1113627096);
            }
            ++field2822;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public static void method882(byte arg0) {
        field2825 = null;
        field2824 = null;
        if (arg0 == -72) {
            field2817 = null;
            field2834 = null;
            field2827 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBZI)Led;")
    public static final class43 method883(int arg0, byte arg1, boolean arg2, int arg3) {
        ++field2818;
        if (arg1 != 53) {
            method880(65, 48, 109, -31, 84, (byte) 1);
        }
        if (arg3 >= 2 && ~arg3 >= -37) {
            int var4 = 1;
            int var5 = arg0 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                ++var4;
            }
            int var6 = var4;
            if (~arg0 > -1 || arg2) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg0 >= 0) {
                if (arg2) {
                    var7[0] = 43;
                }
            } else {
                var7[0] = 45;
            }
            for (int var8 = 0; var8 < var4; ++var8) {
                int var10 = arg0 % arg3;
                arg0 /= arg3;
                if (~var10 > -1) {
                    var10 = -var10;
                }
                if (var10 > 9) {
                    var10 += 39;
                }
                var7[var6 + -1 - var8] = (byte) (var10 + 48);
            }
            class43 var9 = new class43();
            var9.field818 = var6;
            var9.field844 = var7;
            return var9;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)Z")
    public final boolean method884(byte arg0) {
        ++field2828;
        if (arg0 > -79) {
            field2834 = null;
        }
        if (this.field2819 != null) {
            return true;
        } else if (~this.field2830 <= -1) {
            class120 var2 = class166.method1030(this.field2830, class191.field3724, (byte) 59);
            var2.method778();
            this.field2815 = var2.field2387;
            this.field2819 = var2.field2388;
            this.field2816 = var2.field2389;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, false);
    }
}
