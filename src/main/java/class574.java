import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class574 extends class30 {

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    private int field8124 = 0;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    private int field8123 = 4096;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field8119 = 0;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "F")
    public static float field8118;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class574() {
        super(1, false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field8117;
        if (arg1 != 7) {
            return null;
        } else {
            int[][] var3 = super.field377.method3683(arg0, (byte) 121);
            if (super.field377.field9085) {
                int[][] var4 = this.method292(85, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class31.field399; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~var12 <= ~this.field8124) {
                        if (~this.field8123 > ~var12) {
                            var8[var11] = this.field8123;
                        } else {
                            var8[var11] = var12;
                        }
                    } else {
                        var8[var11] = this.field8124;
                    }
                    if (this.field8124 <= var13) {
                        if (~var13 < ~this.field8123) {
                            var9[var11] = this.field8123;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field8124;
                    }
                    if (~var14 <= ~this.field8124) {
                        if (var14 > this.field8123) {
                            var10[var11] = this.field8123;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field8124;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I")
    public static final int method3275(int arg0) {
        if (arg0 > -17) {
            method3277(-83, 127);
        }
        ++field8120;
        class663 var1 = class457.field6346;
        synchronized (class457.field6346) {
            return class457.field6346.method3746(80);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLr;)V")
    public static final void method3276(byte arg0, class166 arg1) {
        ++field8116;
        class499.field6781 = class171.method1204(arg1, -25163, class243.field3306, true);
        class166.field2419 = class272.method1664((byte) 104, arg1, class243.field3306);
        class273.field3741 = class171.method1204(arg1, -25163, class392.field5549, true);
        if (arg0 >= 17) {
            class136.field1916 = class272.method1664((byte) 110, arg1, class392.field5549);
            class428.field5986 = class171.method1204(arg1, -25163, class230.field3187, true);
            class377.field5030 = class272.method1664((byte) 105, arg1, class230.field3187);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field8121;
        if (arg0 != 1) {
            this.field8123 = 2;
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 0, (byte) 102);
            for (int var5 = 0; class31.field399 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field8124 < ~var6) {
                    var3[var5] = this.field8124;
                } else if (~var6 < ~this.field8123) {
                    var3[var5] = this.field8123;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 < 100) {
            method3276((byte) 24, (class166) null);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field378 = ~arg2.method2874((byte) -75) == -2;
                }
            } else {
                this.field8123 = arg2.method2845(-1);
            }
        } else {
            this.field8124 = arg2.method2845(-1);
        }
        ++field8115;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lch;")
    public static final class428 method3277(int arg0, int arg1) {
        if (arg1 != -2604) {
            method3276((byte) -113, (class166) null);
        }
        ++field8122;
        class428[] var2 = class249.method1537((byte) -100);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class428 var4 = var2[var3];
            if (~var4.field5979 == ~arg0) {
                return var4;
            }
        }
        return null;
    }
}
