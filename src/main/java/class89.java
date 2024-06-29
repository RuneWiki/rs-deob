import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class89 extends class175 {

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    private int field1691 = 4096;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    private int field1698 = 0;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field1693 = 0;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lij;")
    private static class50 field1692 = class78.method578(124, "Members object");

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Lij;")
    public static class50 field1700 = field1692;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "Loj;")
    public static class160 field1696 = new class160();

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "Lij;")
    public static class50 field1702 = class78.method578(121, "Hidden)2");

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "Lfe;")
    public static class76 field1703 = class140.method975((byte) 40);

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "[I")
    public static int[] field1704 = new int[1000];

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field1705 = 0;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lij;")
    public static class50 field1706 = class78.method578(123, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V")
    public static final void method697(int arg0, int arg1) {
        class74.field1387.method770(true, arg1);
        ++field1697;
        class78.field1444.method770(true, arg1);
        class187.field3100.method770(true, arg1);
        if (arg0 != 16494) {
            field1703 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IB)Lce;")
    public static final class10 method698(int arg0, byte arg1) {
        ++field1701;
        int var2 = arg0 >> 16;
        if (arg1 != 94) {
            method698(-14, (byte) -16);
        }
        int var3 = arg0 & 65535;
        if (class137.field2380[var2] == null || class137.field2380[var2][var3] == null) {
            boolean var4 = class10.method67(var2, (byte) 106);
            if (!var4) {
                return null;
            }
        }
        return class137.field2380[var2][var3];
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field1694;
        int[][] var3 = super.field2920.method117(arg0, (byte) -21);
        if (super.field2920.field356) {
            int[][] var4 = this.method1206(0, arg0, (byte) -106);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class211.field3514 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 < this.field1698) {
                    var8[var11] = this.field1698;
                } else if (~var12 >= ~this.field1691) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field1691;
                }
                if (~var14 > ~this.field1698) {
                    var9[var11] = this.field1698;
                } else if (var14 > this.field1691) {
                    var9[var11] = this.field1691;
                } else {
                    var9[var11] = var14;
                }
                if (~var13 <= ~this.field1698) {
                    if (this.field1691 >= var13) {
                        var10[var11] = var13;
                    } else {
                        var10[var11] = this.field1691;
                    }
                } else {
                    var10[var11] = this.field1698;
                }
            }
        }
        if (arg1 != -20740) {
            this.method32(74, -52);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            method697(74, -128);
        }
        ++field1699;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(0, arg0, arg1 ^ -11529);
            for (int var5 = 0; var5 < class211.field3514; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field1698) {
                    var3[var5] = this.field1698;
                } else if (~this.field1691 > ~var6) {
                    var3[var5] = this.field1691;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field1695;
        if (!arg0) {
            method698(27, (byte) 4);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field2925 = arg2.method1487(255) == 1;
                }
            } else {
                this.field1691 = arg2.method1441(106);
            }
        } else {
            this.field1698 = arg2.method1441(81);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
    public static void method699(boolean arg0) {
        if (!arg0) {
            method697(78, -81);
        }
        field1700 = null;
        field1704 = null;
        field1703 = null;
        field1702 = null;
        field1706 = null;
        field1696 = null;
        field1692 = null;
    }
}
