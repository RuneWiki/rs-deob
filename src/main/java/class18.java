import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class18 extends class105 {

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    private int field485 = -1;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field486 = 1;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "[I")
    private int[] field495;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "[[[B")
    public static byte[][][] field493;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BILvf;Lvf;)V")
    public static final void method125(byte arg0, int arg1, class265 arg2, class265 arg3) {
        class239.field4176 = arg1;
        class4.field51 = arg2;
        ++field484;
        class4.field58 = arg3;
        if (!class4.field51.method1776((byte) -119, class4.field66) && !class4.field58.method1776((byte) -115, class4.field66)) {
            if (class206.field3700 != -1) {
                class229.method1551(0);
            } else {
                class221.field3967 = 0;
                class283.field4985 = 1;
                class102.field1798 = -3;
                class142.field2632 = 0;
                class135 var4 = new class135(128);
                var4.method903((byte) 36, 10);
                var4.method921(121, (int) (99999.0D * Math.random()));
                var4.method921(102, 526);
                var4.method911(0, class4.field51.method1793(43));
                var4.method898((byte) 63, (int) (9.9999999E7D * Math.random()));
                var4.method941(class4.field58, (byte) -58);
                var4.method898((byte) 94, (int) (9.9999999E7D * Math.random()));
                var4.method916(class31.field796, class197.field3513, 591775048);
                if (arg0 < -86) {
                    class55.field1133.field2449 = 0;
                    class55.field1133.method903((byte) 36, 160);
                    class55.field1133.method903((byte) 36, var4.field2449);
                    class55.field1133.method939(-22, var4.field2449, var4.field2483, 0);
                }
            }
        } else {
            class102.field1798 = 3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class18() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V")
    public static final void method126(int arg0) {
        ++class123.field2222;
        if (arg0 == -1) {
            ++field494;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
    public static void method127(byte arg0) {
        if (arg0 < 17) {
            method127((byte) -3);
        }
        field493 = null;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)I")
    public final int method128(int arg0) {
        ++field489;
        return arg0 != -1 ? 32 : this.field485;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field491;
        if (arg1 > -110) {
            this.method128(-22);
        }
        int[][] var3 = super.field1870.method569((byte) -123, arg0);
        if (super.field1870.field1567 && this.method129((byte) -60)) {
            int var4 = this.field488 * (~class102.field1804 == ~this.field482 ? arg0 : this.field482 * arg0 / class102.field1804);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class94.field1668 != this.field488) {
                for (int var8 = 0; ~var8 > ~class94.field1668; ++var8) {
                    int var9 = this.field488 * var8 / class94.field1668;
                    int var10 = this.field495[var4 + var9];
                    var7[var8] = class203.method1395(4080, var10 << 4);
                    var6[var8] = class203.method1395(var10, 65280) >> 4;
                    var5[var8] = class203.method1395(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class94.field1668 > var11; ++var11) {
                    int var12 = this.field495[var4++];
                    var7[var11] = class203.method1395(255, var12) << 4;
                    var6[var11] = class203.method1395(65280, var12) >> 4;
                    var5[var11] = class203.method1395(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Z")
    private final boolean method129(byte arg0) {
        ++field487;
        int var2 = 99 % ((arg0 - 35) / 51);
        if (this.field495 != null) {
            return true;
        } else if (~this.field485 <= -1) {
            int var3 = class94.field1668;
            int var4 = class102.field1804;
            int var5 = class78.field1492.method58(this.field485, (byte) -14) ? 64 : 128;
            this.field495 = class78.field1492.method66(this.field485, (byte) 114);
            this.field488 = var5;
            this.field482 = var5;
            class275.method1876(var3, var4, (byte) 100);
            return this.field495 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public final void method130(int arg0) {
        ++field490;
        super.method130(arg0);
        this.field495 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field492;
        if (arg1 == 255) {
            if (~arg0 == -1) {
                this.field485 = arg2.method927(127);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lfl;Lfl;I)V")
    public static final void method131(class192 arg0, class192 arg1, int arg2) {
        class190.field3410 = arg0;
        if (arg2 != 128) {
            method125((byte) -128, 111, (class265) null, (class265) null);
        }
        class19.field516 = arg1;
        ++field483;
    }
}
