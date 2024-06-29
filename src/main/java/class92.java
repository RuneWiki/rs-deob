import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class92 extends class182 {

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    private int field1630 = 10;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    private int field1631 = 0;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    private int field1628 = 2048;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
    public static int field1634 = 0;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
    public static int field1637 = 0;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "[I")
    private int[] field1627;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "[I")
    private int[] field1639;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "[[I")
    public static int[][] field1638;

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 3)
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)[I", line = 11)
    public final int[] method125(int arg0, int arg1) {
        field1629++;
        if (arg0 != 2) {
            field1638 = (int[][]) ((int[][]) null);
        }
        int[] var3 = this.field3166.method775(arg1, 124);
        if (this.field3166.field1903) {
            int var4 = class248.field4066[arg1];
            if (this.field1631 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field1630; var12++) {
                    if (this.field1639[var12] <= var4 && this.field1639[var12 + 1] > var4) {
                        if (this.field1627[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class89.method688(var3, 0, class26.field672, var11);
            } else {
                for (int var5 = 0; var5 < class26.field672; var5++) {
                    short var6 = 0;
                    int var7 = class21.field539[var5];
                    int var8 = 0;
                    int var9 = this.field1631;
                    if (var9 == 1) {
                        var8 = var7;
                    } else if (var9 == 2) {
                        var8 = (var7 - (4096 - var4) >> 1) + 2048;
                    } else if (var9 == 3) {
                        var8 = (var7 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field1630; var10++) {
                        if (this.field1639[var10] <= var8 && this.field1639[var10 + 1] > var8) {
                            if (var8 < this.field1627[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V", line = 137)
    public final void method163(int arg0) {
        if (arg0 != 100) {
            method702(-104, -74);
        }
        this.method704(true);
        field1633++;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V", line = 166)
    public static final void method702(int arg0, int arg1) {
        field1632++;
        if (arg1 == -1 || !class267.method1874(arg1, (byte) 12)) {
            return;
        }
        class181[] var2 = class178.field2938[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            if (var4.field2988 != null) {
                class47 var5 = new class47();
                var5.field936 = var4.field2988;
                var5.field939 = var4;
                class355.method2520(true, var5, 2000000);
            }
        }
        if (arg0 != 2000000) {
            field1637 = -114;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Loe;IB)V", line = 216)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field1630 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field1628 = arg0.method989(105);
        } else if (arg1 == 2) {
            this.field1631 = arg0.method1005((byte) 122);
        }
        if (arg2 != 60) {
            this.method125(105, 118);
        }
        field1636++;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V", line = 251)
    public static void method703(boolean arg0) {
        if (arg0) {
            field1637 = -67;
        }
        field1638 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)V", line = 261)
    private final void method704(boolean arg0) {
        field1635++;
        this.field1627 = new int[this.field1630 + 1];
        this.field1639 = new int[this.field1630 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1630;
        int var4 = this.field1628 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1630; var5++) {
            this.field1639[var5] = var2;
            this.field1627[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1639[this.field1630] = 4096;
        this.field1627[this.field1630] = this.field1627[0] + 4096;
        if (!arg0) {
            this.method163(39);
        }
    }
}
