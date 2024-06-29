import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class87 extends class276 {

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    private int field1553 = 10;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    private int field1556 = 0;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    private int field1563 = 2048;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field1564 = 0;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "[I")
    private int[] field1559;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field1557;
        if (arg2 != -1) {
            field1564 = -116;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1556 = arg1.method669((byte) 36);
                }
            } else {
                this.field1563 = arg1.method677(false);
            }
        } else {
            this.field1553 = arg1.method669((byte) 36);
        }
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    private final void method569(int arg0) {
        this.field1554 = new int[this.field1553 + 1];
        int var2 = 0;
        this.field1559 = new int[this.field1553 + 1];
        ++field1555;
        int var3 = 4096 / this.field1553;
        int var4 = this.field1563 * var3 >> 12;
        if (arg0 != 31769) {
            this.method23(-77, 8);
        }
        for (int var5 = 0; var5 < this.field1553; ++var5) {
            this.field1554[var5] = var2;
            this.field1559[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1554[this.field1553] = 4096;
        this.field1559[this.field1553] = 4096 - -this.field1559[0];
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ltb;III)V")
    public static final void method570(class184 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class191.field3084) {
            class109 var4 = class79.field1367[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1978 != null && var4.field1978.field158.method1209()) {
                arg0.method1206(var4.field1978.field158, 128, 0, 0, true);
            }
        }
        if (arg3 < class191.field3084) {
            class109 var5 = class79.field1367[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1978 != null && var5.field1978.field158.method1209()) {
                arg0.method1206(var5.field1978.field158, 0, 0, 128, true);
            }
        }
        if (arg2 < class191.field3084 && arg3 < class277.field4439) {
            class109 var6 = class79.field1367[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1978 != null && var6.field1978.field158.method1209()) {
                arg0.method1206(var6.field1978.field158, 128, 0, 128, true);
            }
        }
        if (arg2 < class191.field3084 && arg3 > 0) {
            class109 var7 = class79.field1367[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1978 != null && var7.field1978.field158.method1209()) {
                arg0.method1206(var7.field1978.field158, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
    public static final void method571(int arg0, int arg1, int arg2) {
        ++field1561;
        class55 var3 = class62.method395(5, arg0, (byte) -66);
        var3.method340((byte) -110);
        if (arg2 <= -86) {
            var3.field947 = arg1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            return null;
        } else {
            ++field1562;
            int[] var3 = super.field4425.method992(17118, arg1);
            if (super.field4425.field2448) {
                int var4 = class206.field3389[arg1];
                if (this.field1556 != 0) {
                    for (int var5 = 0; ~class53.field929 < ~var5; ++var5) {
                        short var6 = 0;
                        int var7 = 0;
                        int var8 = class175.field2883[var5];
                        int var9 = this.field1556;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (var9 == 3) {
                                    var7 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var7 = (var4 - 4096 + var8 >> 1) + 2048;
                            }
                        } else {
                            var7 = var8;
                        }
                        for (int var10 = 0; ~var10 > ~this.field1553; ++var10) {
                            if (~this.field1554[var10] >= ~var7 && ~var7 > ~this.field1554[var10 + 1]) {
                                if (var7 < this.field1559[var10]) {
                                    var6 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var6;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~this.field1553 < ~var12; ++var12) {
                        if (~this.field1554[var12] >= ~var4 && ~var4 > ~this.field1554[var12 + 1]) {
                            if (this.field1559[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class235.method1560(var3, 0, class53.field929, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        this.method569(31769);
        if (arg0 > 66) {
            ++field1565;
        }
    }
}
