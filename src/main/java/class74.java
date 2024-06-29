import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class74 extends class259 {

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    private int field1652 = 0;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    private int field1658 = 4096;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "Lsg;")
    public static class30 field1653 = class167.method1221((byte) 33, "<col=00ff80>");

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "Lnd;")
    public static class266 field1659 = new class266();

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "Lsg;")
    private static class30 field1660 = class167.method1221((byte) 33, "Walk here");

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "Lsg;")
    public static class30 field1663 = field1660;

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "Lsg;")
    public static class30 field1661 = class167.method1221((byte) 33, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "Lsg;")
    public static class30 field1662 = class167.method1221((byte) 33, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "Lsg;")
    public static class30 field1664 = class167.method1221((byte) 33, ":chalreq:");

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIILni;Lni;IIIIJ)V")
    public static final void method676(int arg0, int arg1, int arg2, int arg3, class20 arg4, class20 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class146 var12 = new class146();
            var12.field2803 = arg10;
            var12.field2796 = arg1 * 128 + 64;
            var12.field2797 = arg2 * 128 + 64;
            var12.field2793 = arg3;
            var12.field2800 = arg4;
            var12.field2798 = arg5;
            var12.field2790 = arg6;
            var12.field2792 = arg7;
            var12.field2801 = arg8;
            var12.field2789 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class71.field1613[var13][arg1][arg2] == null) {
                    class71.field1613[var13][arg1][arg2] = new class195(var13, arg1, arg2);
                }
            }
            class71.field1613[arg0][arg1][arg2].field3537 = var12;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V")
    public static final void method677(boolean arg0) {
        if (arg0) {
            class71.field1613 = class147.field2809;
            class242.field4333 = class87.field1790;
        } else {
            class71.field1613 = class244.field4365;
            class242.field4333 = class177.field3289;
        }
        class182.field3347 = class71.field1613.length;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field1654;
        int var3 = -24 / ((arg0 - -48) / 42);
        int[][] var4 = super.field4568.method241(44, arg1);
        if (super.field4568.field564) {
            int[][] var5 = this.method1795(arg1, 2, 0);
            int[] var6 = var5[1];
            int[] var7 = var4[0];
            int[] var8 = var5[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class223.field3999; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var9[var12];
                if (this.field1652 <= var14) {
                    if (~var14 >= ~this.field1658) {
                        var7[var12] = var14;
                    } else {
                        var7[var12] = this.field1658;
                    }
                } else {
                    var7[var12] = this.field1652;
                }
                if (~this.field1652 < ~var13) {
                    var10[var12] = this.field1652;
                } else if (~this.field1658 <= ~var13) {
                    var10[var12] = var13;
                } else {
                    var10[var12] = this.field1658;
                }
                if (this.field1652 <= var15) {
                    if (~this.field1658 > ~var15) {
                        var11[var12] = this.field1658;
                    } else {
                        var11[var12] = var15;
                    }
                } else {
                    var11[var12] = this.field1652;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "(I)V")
    public static void method678(int arg0) {
        field1663 = null;
        field1653 = null;
        field1659 = null;
        field1662 = null;
        field1660 = null;
        field1661 = null;
        int var1 = -79 % ((arg0 - 54) / 45);
        field1664 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field1657;
        if (arg1 == -1586849108) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        super.field4588 = ~arg2.method63((byte) 99) == -2;
                    }
                } else {
                    this.field1658 = arg2.method65((byte) 113);
                }
            } else {
                this.field1652 = arg2.method65((byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            field1653 = null;
        }
        ++field1656;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int[] var4 = this.method1799(0, arg0, 123);
            for (int var5 = 0; ~class223.field3999 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field1652 < ~var6) {
                    var3[var5] = this.field1652;
                } else if (~var6 < ~this.field1658) {
                    var3[var5] = this.field1658;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }
}
