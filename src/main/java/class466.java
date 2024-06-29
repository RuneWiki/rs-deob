import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class466 extends class175 {

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    private int field6596 = 4;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    private int field6603 = 4;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "Lmw;")
    public static class517 field6595 = new class517(54, -1);

    @OriginalMember(owner = "client!os", name = "O", descriptor = "[I")
    public static int[] field6604 = new int[6];

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "Luq;")
    public static class172 field6600;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)[[I", line = 6)
    public final int[][] method238(int arg0, byte arg1) {
        ++field6602;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int var4 = class598.field8136 / this.field6596;
            int var5 = class561.field7687 / this.field6603;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1205(0, 0, 29179);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1205(0, class561.field7687 * var7 / var5, 29179);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class598.field8136; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class598.field8136 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return arg1 > -47 ? null : var3;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)V", line = 75)
    public static final void method2739(boolean arg0) {
        ++field6598;
        if (class375.field5490.method503()) {
            class375.field5490.method543(class669.field8962);
            class171.method1154(-1);
            if (class24.field246) {
                class624.method3441(class669.field8962, (byte) -58);
            } else {
                Dimension var1 = class669.field8962.getSize();
                class375.field5490.method492(class669.field8962, var1.width, var1.height);
            }
            class375.field5490.method556(class669.field8962);
        } else {
            class399.method2434(false, (byte) 107, class125.field1721.field5141.method2541(43));
        }
        class166.method1137(false);
        class132.field1818 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 234)
    public class466() {
        super(1, false);
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(Z)V", line = 106)
    public static final void method2740(boolean arg0) {
        ++field6601;
        if (arg0) {
            field6600 = null;
        }
        if (class303.method1957(1)) {
            if (class614.field8305 == null) {
                class307.method1983(-115);
            }
            class98.field1419 = 0;
            class697.field9244 = true;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)[I", line = 131)
    public final int[] method47(boolean arg0, int arg1) {
        ++field6597;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            return null;
        } else {
            if (super.field2310.field169) {
                int var4 = class598.field8136 / this.field6596;
                int var5 = class561.field7687 / this.field6603;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method1202(class561.field7687 * var6 / var5, -1150480797, 0);
                } else {
                    var7 = this.method1202(0, -1150480797, 0);
                }
                for (int var8 = 0; class598.field8136 > var8; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class598.field8136 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILdt;Z)V", line = 185)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field6603 = arg1.method1731((byte) 64);
            }
        } else {
            this.field6596 = arg1.method1731((byte) 64);
        }
        if (arg2) {
            method2741(-91);
        }
        ++field6599;
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V", line = 222)
    public static void method2741(int arg0) {
        field6600 = null;
        field6604 = null;
        if (arg0 != 0) {
            field6595 = null;
        }
        field6595 = null;
    }
}
