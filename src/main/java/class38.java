import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class38 extends class115 {

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    private int field560 = 4096;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    private int field561 = 409;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "[I")
    private int[] field563 = new int[3];

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    private int field567 = 4096;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    private int field570 = 4096;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "Ljava/lang/String;")
    public static String field564 = "Drop";

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "[[I")
    public static int[][] field569 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ)V")
    public static final void method266(int arg0, boolean arg1) {
        ++field565;
        class206.method1331(class193.field2774, class250.field3813, (byte) -118, class214.field3080, arg1);
        if (arg0 != 0) {
            method266(-73, false);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V")
    public static void method267(boolean arg0) {
        if (arg0) {
            method267(true);
        }
        field569 = null;
        field564 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 == -1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 == 4) {
                                int var5 = arg1.method779(16711680);
                                this.field563[1] = class184.method1188(var5, 65280) >> 4;
                                this.field563[2] = class184.method1188(var5 >> 12, 0);
                                this.field563[0] = class184.method1188(267386880, var5 << 4);
                            }
                        } else {
                            this.field560 = arg1.method756(-29901);
                        }
                    } else {
                        this.field567 = arg1.method756(arg0 ^ 29900);
                    }
                } else {
                    this.field570 = arg1.method756(arg0 ^ 29900);
                }
            } else {
                this.field561 = arg1.method756(-29901);
            }
            ++field562;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 > -33) {
            this.method168(-112, (class114) null, -61);
        }
        ++field568;
        int[][] var3 = super.field1716.method6(arg1, (byte) 98);
        if (super.field1716.field23) {
            int[][] var4 = this.method798(0, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class77.field1178; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field563[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field561) {
                    var10[var11] = var12;
                    var8[var11] = var5[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field563[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field561 > ~var15) {
                        var10[var11] = var12;
                        var8[var11] = var14;
                        var9[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field563[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field561 < var17) {
                            var10[var11] = var12;
                            var8[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var10[var11] = this.field560 * var12 >> 12;
                            var8[var11] = this.field567 * var14 >> 12;
                            var9[var11] = this.field570 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
