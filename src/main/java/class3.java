import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class3 extends class305 {

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    private int field34 = 0;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    private int field38 = 2048;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    private int field45 = 10;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "Lsc;")
    public static class270 field39 = new class270(12, 0, 1, 0);

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "Ljp;")
    public static class55 field46 = new class55(10, 7);

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "Lmi;")
    public static class156 field47;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "[I")
    private int[] field37;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "[I")
    private int[] field40;

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V", line = 6)
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V", line = 9)
    public static void method13(int arg0) {
        field47 = null;
        field46 = null;
        if (arg0 == 0) {
            field39 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILfh;B)V", line = 22)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field34 = arg1.method1337((byte) 72);
                }
            } else {
                this.field38 = arg1.method1396(70);
            }
        } else {
            this.field45 = arg1.method1337((byte) 28);
        }
        if (arg2 < 76) {
            this.field45 = -54;
        }
        ++field44;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)[I", line = 66)
    public final int[] method15(int arg0, int arg1) {
        ++field43;
        if (arg1 != 4688) {
            return null;
        } else {
            int[] var3 = super.field4677.method2174(arg0, 49);
            if (super.field4677.field5040) {
                int var4 = class301.field4614[arg0];
                if (this.field34 == 0) {
                    short var5 = 0;
                    for (int var6 = 0; ~var6 > ~this.field45; ++var6) {
                        if (~var4 <= ~this.field40[var6] && ~this.field40[var6 + 1] < ~var4) {
                            if (var4 < this.field37[var6]) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class325.method2134(var3, 0, class91.field1471, var5);
                } else {
                    for (int var7 = 0; ~var7 > ~class91.field1471; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class78.field1298[var7];
                        int var11 = this.field34;
                        if (~var11 != -2) {
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    var8 = 2048 - -(-var4 + var10 >> 1);
                                }
                            } else {
                                var8 = (-4096 - -var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; var12 < this.field45; ++var12) {
                            if (var8 >= this.field40[var12] && ~this.field40[var12 + 1] < ~var8) {
                                if (~var8 > ~this.field37[var12]) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V", line = 188)
    public static final void method16(int arg0, int arg1, int arg2) {
        if (arg0 < -95) {
            ++field36;
            class188 var3 = class10.method48((byte) 72, 15, 0);
            var3.method1308(false);
            var3.field2882 = arg2;
            var3.field2873 = arg1;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 206)
    public final void method17(byte arg0) {
        ++field35;
        if (arg0 != -62) {
            method16(-116, 55, -74);
        }
        this.method18(arg0 ^ -62);
    }

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V", line = 229)
    private final void method18(int arg0) {
        ++field42;
        int var2 = 0;
        this.field37 = new int[this.field45 + 1];
        this.field40 = new int[this.field45 + 1];
        int var3 = 4096 / this.field45;
        int var4 = this.field38 * var3 >> 12;
        for (int var5 = 0; var5 < this.field45; ++var5) {
            this.field40[var5] = var2;
            this.field37[var5] = var2 + var4;
            var2 += var3;
        }
        this.field40[this.field45] = 4096;
        this.field37[this.field45] = this.field37[arg0] + 4096;
    }
}
