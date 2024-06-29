import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class585 {

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "Luh;")
    public static class176 field89 = new class176(9, 0, 4, 1);

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field90 = -1;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "[Lku;")
    private class396[] field87;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "[[I")
    public static int[][] field81;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field83;
        if (arg1 != 1) {
            method59(false, (class735) null);
        }
        if (~arg2 == -1) {
            this.field87 = new class396[arg0.method2964((byte) 125)];
            for (int var4 = 0; this.field87.length > var4; ++var4) {
                int var5 = arg0.method2964((byte) 124);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field87[var4] = class284.method1846((byte) 114, arg0);
                            }
                        } else {
                            this.field87[var4] = class377.method2338(arg0, -106);
                        }
                    } else {
                        this.field87[var4] = class150.method1040(arg0, 12);
                    }
                } else {
                    this.field87[var4] = class179.method1290(-1, arg0);
                }
            }
        } else if (~arg2 == -2) {
            super.field8266 = ~arg0.method2964((byte) 86) == -2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLip;)I")
    public static final int method59(boolean arg0, class735 arg1) {
        ++field82;
        if (arg0) {
            field89 = null;
        }
        if (class605.field8453 == arg1) {
            return 5890;
        } else if (class407.field5550 != arg1) {
            if (class639.field8962 == arg1) {
                return 34168;
            } else if (class683.field9465 == arg1) {
                return 34166;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 34167;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
    public static void method60(byte arg0) {
        field89 = null;
        if (arg0 <= 76) {
            field90 = 43;
        }
        field81 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class9() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZB)V")
    public static final void method61(int arg0, boolean arg1, byte arg2) {
        ++field86;
        class549.method3279(arg1, arg2, class620.field8673.method3580(class140.field2081, 12), arg0);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg1 < 123) {
            field89 = null;
        }
        ++field85;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            this.method62(2559, super.field8255.method1639(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[[I)V")
    private final void method62(int arg0, int[][] arg1) {
        if (arg0 != 2559) {
            field81 = null;
        }
        ++field88;
        int var3 = class293.field4278;
        int var4 = class270.field3923;
        class41.method316(1, arg1);
        class384.method2384(0, class625.field8759, 0, -11197, class305.field4391);
        if (this.field87 != null) {
            for (int var5 = 0; ~this.field87.length < ~var5; ++var5) {
                class396 var6 = this.field87[var5];
                int var7 = var6.field5451;
                int var8 = var6.field5448;
                if (~var7 <= -1) {
                    if (var8 < 0) {
                        var6.method1583(var3, 126, var4);
                    } else {
                        var6.method1580(var3, -20, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method1584(var4, var3, arg0 ^ -1791339784);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field84;
        int[][] var3 = super.field8265.method1576((byte) 124, arg1);
        if (super.field8265.field3546) {
            int var4 = class293.field4278;
            int var5 = class270.field3923;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field8265.method1573(-7);
            this.method62(2559, var6);
            for (int var8 = 0; class270.field3923 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class293.field4278 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class702.method3977(4080, var15 << 4);
                    var12[var14] = class702.method3977(var15 >> 4, 4080);
                    var11[var14] = class702.method3977(var15 >> 12, 4080);
                }
            }
        }
        return arg0 ? null : var3;
    }
}
