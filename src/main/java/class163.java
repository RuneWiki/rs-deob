import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class163 extends class135 {

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "I")
    private int field2633 = -1;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "Lqj;")
    public static class196 field2635 = class80.method502("", -48);

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "I")
    public static int field2640 = 0;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "I")
    private int field2639;

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "I")
    private int field2641;

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "Lsc;")
    public static class212 field2638;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "[I")
    private int[] field2625;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)Lfa;")
    public static final class235 method1024(int arg0, byte arg1) {
        int var2 = -121 / ((arg1 - 8) / 54);
        ++field2628;
        class235 var3 = (class235) class74.field1072.method575(0, (long) arg0);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class72.field1032.method842(5, (byte) 114, arg0);
            class235 var5 = new class235();
            if (var4 != null) {
                var5.method1581((byte) -113, new class56(var4));
            }
            class74.field1072.method574((long) arg0, false, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IZ)V")
    public static final void method1025(int arg0, boolean arg1) {
        ++field2630;
        byte[][] var2 = class135.field1944;
        byte var3 = 4;
        int var4 = 0;
        if (arg0 == 8) {
            while (~var4 > ~var3) {
                class181.method1187((byte) 113);
                for (int var5 = 0; var5 < 13; ++var5) {
                    for (int var6 = 0; ~var6 > -14; ++var6) {
                        boolean var7 = false;
                        int var8 = class13.field147[var4][var5][var6];
                        if (var8 != -1) {
                            int var9 = (var8 & 54894224) >> 24;
                            if (!arg1 || var9 == 0) {
                                int var10 = (var8 & 7) >> 1;
                                int var11 = (var8 & 16769956) >> 14;
                                int var12 = (16378 & var8) >> 3;
                                int var13 = (var11 / 8 << 8) + var12 / 8;
                                for (int var14 = 0; var14 < class181.field3191.length; ++var14) {
                                    if (class181.field3191[var14] == var13 && var2[var14] != null) {
                                        var7 = true;
                                        class151.method946(var4, arg1, (var11 & 7) * 8, var2[var14], class188.field3298, var9, var5 * 8, var6 * 8, 128, var10, (7 & var12) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var7) {
                            class214.method1475(var5 * 8, var6 * 8, var4, -105, 8, 8);
                        }
                    }
                }
                ++var4;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (arg0 != 260028743) {
            field2638 = null;
        }
        ++field2636;
        if (super.field1947.field1180 && this.method1030(128)) {
            int var4 = this.field2641 * (class150.field2400 == this.field2639 ? arg1 : this.field2639 * arg1 / class150.field2400);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (~class131.field1862 != ~this.field2641) {
                for (int var8 = 0; class131.field1862 > var8; ++var8) {
                    int var9 = this.field2641 * var8 / class131.field1862;
                    int var10 = this.field2625[var4 + var9];
                    var7[var8] = class65.method409(4080, var10 << 4);
                    var5[var8] = class65.method409(var10 >> 4, 4080);
                    var6[var8] = class65.method409(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class131.field1862 < ~var11; ++var11) {
                    int var12 = this.field2625[var4++];
                    var7[var11] = class65.method409(var12, 255) << 4;
                    var5[var11] = class65.method409(4080, var12 >> 4);
                    var6[var11] = class65.method409(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public final void method517(boolean arg0) {
        ++field2632;
        if (!arg0) {
            super.method517(arg0);
            this.field2625 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZILec;)V")
    public static final void method1026(boolean arg0, int arg1, class178 arg2) {
        int var3 = arg2.field3070 != 0 ? arg2.field3070 : arg2.field3085;
        ++field2631;
        int var4 = ~arg2.field3056 == -1 ? arg2.field2997 : arg2.field3056;
        if (arg1 > -1) {
            method1027(-6);
        }
        class224.method1517(arg0, 0, arg2.field3117, var4, var3, class91.field1335[arg2.field3117 >> 16]);
        if (arg2.field3087 != null) {
            class224.method1517(arg0, 0, arg2.field3117, var4, var3, arg2.field3087);
        }
        class63 var5 = (class63) class101.field1445.method1551(32768, (long) arg2.field3117);
        if (var5 != null) {
            class10.method49(var3, var4, var5.field864, -120, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static void method1027(int arg0) {
        if (arg0 != -19202) {
            field2638 = null;
        }
        field2638 = null;
        field2635 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILp;)Ln;")
    public static final class135 method1028(int arg0, class56 arg1) {
        ++field2629;
        int var2 = 71 / ((-37 - arg0) / 57);
        arg1.method367(1);
        int var3 = arg1.method367(1);
        class135 var4 = class217.method1487(var3, -94);
        var4.field1945 = arg1.method367(1);
        int var5 = arg1.method367(1);
        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = arg1.method367(1);
            var4.method97(arg1, var7, -16231);
        }
        var4.method102((byte) -85);
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
    public final int method815(int arg0) {
        ++field2634;
        if (arg0 != -28861) {
            field2638 = null;
        }
        return this.field2633;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field2637;
        if (arg2 != -16231) {
            field2635 = null;
        }
        if (~arg1 == -1) {
            this.field2633 = arg0.method318(true);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IZ)Lqj;")
    public static final class196 method1029(int arg0, boolean arg1) {
        ++field2627;
        return arg1 ? null : class149.method933(10, false, (byte) -86, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Z")
    private final boolean method1030(int arg0) {
        ++field2626;
        if (this.field2625 != null) {
            return true;
        } else {
            if (arg0 != 128) {
                method1027(122);
            }
            if (~this.field2633 <= -1) {
                int var2 = class150.field2400;
                int var3 = class131.field1862;
                int var4 = class216.field3890.method1200(45757040, this.field2633) ? 64 : 128;
                this.field2625 = class216.field3890.method1199(this.field2633, arg0 ^ 136);
                this.field2639 = var4;
                this.field2641 = var4;
                class84.method525(true, var2, var3);
                return this.field2625 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, false);
    }
}
