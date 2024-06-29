import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class136 extends class64 {

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    private int field2820 = 6;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "Lcd;")
    public static class23 field2814 = class54.method414("cross", -1);

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static volatile int field2811 = -1;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "[[I")
    public static int[][] field2815 = new int[104][104];

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "Lcd;")
    public static class23 field2819 = null;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "Lcd;")
    public static class23 field2821 = class54.method414("Hierhin gehen", -1);

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lcd;")
    public static class23 field2824 = class54.method414(" steht bereits auf Ihrer Freunde)2Liste(Q", -1);

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "[I")
    public static int[] field2822;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field2818;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1510 = ~arg2.method1202(-38) == -2;
            }
        } else {
            this.field2820 = arg2.method1202(123);
        }
        int var5 = 48 / ((arg0 - 7) / 43);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            field2819 = null;
        }
        ++field2812;
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757) {
            int[][] var4 = this.method482(0, arg0, (byte) -126);
            int[][] var5 = this.method482(1, arg0, (byte) -128);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            for (int var15 = 0; ~class168.field3367 < ~var15; ++var15) {
                var7[var15] = this.method865(var13[var15], var8[var15], (byte) -88);
                var9[var15] = this.method865(var12[var15], var11[var15], (byte) -102);
                var6[var15] = this.method865(var14[var15], var10[var15], (byte) -118);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIB)I")
    private final int method865(int arg0, int arg1, byte arg2) {
        ++field2813;
        if (arg2 >= -73) {
            field2819 = null;
        }
        int var4 = this.field2820;
        if (var4 != 1) {
            if (var4 != 2) {
                if (~var4 != -4) {
                    if (var4 != 4) {
                        if (~var4 != -6) {
                            if (~var4 != -7) {
                                if (var4 != 7) {
                                    if (~var4 != -9) {
                                        if (var4 != 9) {
                                            if (~var4 != -11) {
                                                if (~var4 != -12) {
                                                    return ~var4 == -13 ? arg0 + arg1 + -(arg0 * arg1 >> 11) : arg1;
                                                } else {
                                                    return arg0 >= arg1 ? -arg1 + arg0 : -arg0 + arg1;
                                                }
                                            } else {
                                                return arg0 < arg1 ? arg1 : arg0;
                                            }
                                        } else {
                                            return arg0 <= arg1 ? arg0 : arg1;
                                        }
                                    } else {
                                        return ~arg1 != -1 ? 4096 - (4096 - arg0 << 12) / arg1 : 0;
                                    }
                                } else {
                                    return arg1 == 4096 ? 4096 : (arg0 << 12) / (4096 - arg1);
                                }
                            } else {
                                return arg0 < 2048 ? arg0 * arg1 >> 11 : -((-arg0 + 4096) * (-arg1 + 4096) >> 11) + 4096;
                            }
                        } else {
                            return -((-arg0 + 4096) * (-arg1 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return arg0 == 0 ? 4096 : (arg1 << 12) / arg0;
                    }
                } else {
                    return arg0 * arg1 >> 12;
                }
            } else {
                return -arg0 + arg1;
            }
        } else {
            return arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
    public static void method866(byte arg0) {
        field2819 = null;
        if (arg0 == 30) {
            field2814 = null;
            field2824 = null;
            field2822 = null;
            field2821 = null;
            field2815 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            return null;
        } else {
            ++field2816;
            int[] var3 = super.field1513.method1033(-71, arg0);
            if (super.field1513.field3368) {
                int[] var4 = this.method479(-1, arg0, 0);
                int[] var5 = this.method479(arg1 ^ 9420, arg0, 1);
                for (int var6 = 0; var6 < class168.field3367; ++var6) {
                    var3[var6] = this.method865(var5[var6], var4[var6], (byte) -126);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
    public static final void method867(int arg0, byte arg1) {
        class111.method717(125);
        class141.method906(-17169);
        ++field2817;
        int var2 = class122.method759(-83, arg0).field3203;
        if (arg1 < 104) {
            method866((byte) -16);
        }
        if (var2 != 0) {
            int var3 = class54.field1288[arg0];
            if (var2 == 1) {
                if (var3 == 1) {
                    class140.method901(0.9F);
                }
                if (~var3 == -3) {
                    class140.method901(0.8F);
                }
                if (~var3 == -4) {
                    class140.method901(0.7F);
                }
                if (~var3 == -5) {
                    class140.method901(0.6F);
                }
                class104.method689(-1);
            }
            if (var2 == 3) {
                short var4 = 0;
                if (~var3 == -1) {
                    var4 = 255;
                }
                if (~var3 == -2) {
                    var4 = 192;
                }
                if (var3 == 2) {
                    var4 = 128;
                }
                if (~var3 == -4) {
                    var4 = 64;
                }
                if (var3 == 4) {
                    var4 = 0;
                }
                if (class40.field848 != var4) {
                    if (~class40.field848 == -1 && ~class28.field600 != 0) {
                        class66.method489(0, class193.field3812, var4, -16, class28.field600, false);
                        class25.field531 = false;
                    } else if (var4 == 0) {
                        class156.method959(1);
                        class25.field531 = false;
                    } else {
                        class167.method1025(var4, 3);
                    }
                    class40.field848 = var4;
                }
            }
            if (var2 == 9) {
                class190.field3783 = var3;
            }
            if (var2 == 10) {
                if (var3 == 0) {
                    class205.field4031 = 127;
                }
                if (~var3 == -2) {
                    class205.field4031 = 96;
                }
                if (~var3 == -3) {
                    class205.field4031 = 64;
                }
                if (var3 == 3) {
                    class205.field4031 = 32;
                }
                if (~var3 == -5) {
                    class205.field4031 = 0;
                }
            }
            if (var2 == 6) {
                class108.field2298 = var3;
            }
            if (~var2 == -6) {
                class146.field2988 = var3;
            }
            if (var2 == 4) {
                if (var3 == 0) {
                    class160.field3209 = 127;
                }
                if (var3 == 1) {
                    class160.field3209 = 96;
                }
                if (var3 == 2) {
                    class160.field3209 = 64;
                }
                if (~var3 == -4) {
                    class160.field3209 = 32;
                }
                if (var3 == 4) {
                    class160.field3209 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class136() {
        super(2, false);
    }
}
