import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class490 extends class466 {

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    private int field6870 = 0;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    private int field6869 = 4096;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Lej;")
    public static class104 field6862 = new class104("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Ldv;")
    public static class566 field6863 = new class566(63, 3);

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Ldv;")
    public static class566 field6865 = new class566(29, 3);

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static final void method2843(byte arg0) {
        class552.field7625 = 0;
        class467.field6575 = 0;
        class509.field7110 = 0;
        class393.field5537 = 0;
        if (arg0 >= -48) {
            method2843((byte) 40);
        }
        ++field6867;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        if (arg1 != 0) {
            field6862 = null;
        }
        ++field6861;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, arg0, 2);
            for (int var5 = 0; var5 < class312.field4207; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field6870) {
                    if (this.field6869 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field6869;
                    }
                } else {
                    var3[var5] = this.field6870;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    public static void method2844(byte arg0) {
        field6862 = null;
        if (arg0 <= 12) {
            field6863 = null;
        }
        field6865 = null;
        field6863 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field6866;
        if (arg1 != -5062) {
            field6865 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field6565 = arg0.method110((byte) 27) == 1;
                }
            } else {
                this.field6869 = arg0.method93((byte) 87);
            }
        } else {
            this.field6870 = arg0.method93((byte) 110);
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(III)Z")
    public static final boolean method2845(int arg0, int arg1, int arg2) {
        if (arg0 <= 105) {
            return false;
        } else {
            ++field6860;
            return ~(24 & arg2) != -1 | (544 & arg2) == 544;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)I")
    public static final int method2846(int arg0, byte arg1) {
        if (arg1 != -70) {
            field6862 = null;
        }
        ++field6864;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class490() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field6868;
        int[][] var3 = super.field6569.method828((byte) 126, arg0);
        if (super.field6569.field1934) {
            int[][] var4 = this.method2719(0, arg0, 5);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class312.field4207 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field6870) {
                    var8[var11] = this.field6870;
                } else if (~var12 >= ~this.field6869) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field6869;
                }
                if (var13 >= this.field6870) {
                    if (this.field6869 < var13) {
                        var9[var11] = this.field6869;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field6870;
                }
                if (var14 < this.field6870) {
                    var10[var11] = this.field6870;
                } else if (this.field6869 < var14) {
                    var10[var11] = this.field6869;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return arg1 ? null : var3;
    }
}
