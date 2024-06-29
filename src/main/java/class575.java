import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class575 extends class578 {

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "Z")
    public boolean field8126 = true;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "Llo;")
    public class700 field8132;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[I")
    private int[] field8125;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "[I")
    public int[] field8134;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field8130;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "[[I")
    private int[][] field8131;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lac;I)Ljava/lang/String;")
    public final String method3278(class501 arg0, int arg1) {
        field8138++;
        if (arg1 < 95) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field8125 != null) {
            for (int var4 = 0; var4 < this.field8125.length; var4++) {
                var3.append(this.field8130[var4]);
                var3.append(this.field8132.method3921(arg0.method2813(21065, class63.method530(-101, this.field8125[var4]).field8183), false, this.method3286(0, var4), this.field8131[var4]));
            }
        }
        var3.append(this.field8130[this.field8130.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([ILac;I)V")
    public final void method3279(int[] arg0, class501 arg1, int arg2) {
        field8137++;
        if (this.field8125 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field8125.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method3286(0, var4).field8187;
            if (var5 > 0) {
                arg1.method2862(var5, -2, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILac;)V")
    private final void method3280(int arg0, int arg1, class501 arg2) {
        if (arg0 == 1) {
            this.field8130 = class48.method383(arg2.method2851((byte) -113), 1, '<');
        } else if (arg0 == 2) {
            int var9 = arg2.method2874((byte) -75);
            this.field8134 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field8134[var10] = arg2.method2845(-1);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method2874((byte) -75);
            this.field8131 = new int[var4][];
            this.field8125 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2845(-1);
                class581 var7 = class63.method530(-108, var6);
                if (var7 != null) {
                    this.field8125[var5] = var6;
                    this.field8131[var5] = new int[var7.field8185];
                    for (int var8 = 0; var8 < var7.field8185; var8++) {
                        this.field8131[var5][var8] = arg2.method2845(-1);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field8126 = false;
        }
        int var11 = 62 / ((arg1 - 56) / 36);
        field8129++;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public final void method3281(int arg0) {
        int var2 = -18 % ((-arg0 - 31) / 37);
        if (this.field8134 != null) {
            for (int var3 = 0; var3 < this.field8134.length; var3++) {
                this.field8134[var3] = class647.method3617(this.field8134[var3], 32768);
            }
        }
        field8141++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lac;I)V")
    public final void method3282(class501 arg0, int arg1) {
        field8135++;
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                if (arg1 > -8) {
                    this.method3280(9, 39, null);
                    return;
                } else {
                    return;
                }
            }
            this.method3280(var3, 10, arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)I")
    public final int method3283(boolean arg0) {
        field8127++;
        if (this.field8125 == null) {
            return 0;
        } else {
            if (arg0) {
                this.field8131 = null;
            }
            return this.field8125.length;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
    public final int method3284(int arg0, int arg1, int arg2) {
        field8139++;
        if (this.field8125 == null || arg0 < 0 || arg0 > this.field8125.length) {
            return -1;
        } else {
            if (arg2 != 80) {
                method3285((byte) -33, null);
            }
            return this.field8131[arg0] == null || arg1 < 0 || this.field8131[arg0].length < arg1 ? -1 : this.field8131[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLls;)V")
    public static final void method3285(byte arg0, class124 arg1) {
        if ((arg1 instanceof class61)) {
            class61 var3 = (class61) arg1;
            if (var3.field674 != null) {
                class563.method3150(class143.field2063.field4053 != var3.field4053, (byte) -128, var3);
            }
        } else if (arg1 instanceof class677) {
            class677 var2 = (class677) arg1;
            class620.method3446(var2, (byte) 94, class143.field2063.field4053 != var2.field4053);
        }
        if (arg0 > -29) {
            field8140 = 84;
        }
        field8133++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lgo;")
    public final class581 method3286(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method3286(-120, 113);
        }
        field8136++;
        return this.field8125 == null || arg1 < 0 || this.field8125.length < arg1 ? null : class63.method530(arg0 ^ 0xFFFFFFA7, this.field8125[arg1]);
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method3287(int arg0) {
        field8128++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field8130 == null) {
            return "";
        }
        var2.append(this.field8130[arg0]);
        for (int var3 = 1; var3 < this.field8130.length; var3++) {
            var2.append("...");
            var2.append(this.field8130[var3]);
        }
        return var2.toString();
    }
}
