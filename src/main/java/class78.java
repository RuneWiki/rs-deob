import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 extends class145 {

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "Ltd;")
    public class136 field1785 = class124.field2890;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public int field1784 = 0;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "Ltd;")
    public static class136 field1793 = class145.method1172("va", 45);

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "Ltd;")
    public static class136 field1791 = class145.method1172("Spieler", 45);

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "Lue;")
    public static class143 field1796 = new class143(64);

    @OriginalMember(owner = "client!lb", name = "mb", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!lb", name = "ob", descriptor = "Ltd;")
    private static class136 field1800 = class145.method1172("Your friend list is full)3 Max of 100 for free users)1 and 200 for members", 45);

    @OriginalMember(owner = "client!lb", name = "nb", descriptor = "[I")
    public static int[] field1799 = new int[1000];

    @OriginalMember(owner = "client!lb", name = "rb", descriptor = "Ltd;")
    public static class136 field1803 = field1800;

    @OriginalMember(owner = "client!lb", name = "sb", descriptor = "[[[I")
    public static int[][][] field1804 = new int[4][105][105];

    @OriginalMember(owner = "client!lb", name = "tb", descriptor = "I")
    public static int field1805 = 1;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!lb", name = "pb", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!lb", name = "lb", descriptor = "Lmd;")
    public static class87 field1797;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "[I")
    public int[] field1783;

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "[I")
    public int[] field1792;

    @OriginalMember(owner = "client!lb", name = "qb", descriptor = "[I")
    public static int[] field1802;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "[Ltd;")
    public class136[] field1790;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lsb;B)V")
    public final void method561(class127 arg0, byte arg1) {
        field1788++;
        int var3 = -102 / ((-arg1 - 37) / 61);
        while (true) {
            int var4 = arg0.method1011(42);
            if (var4 == 0) {
                return;
            }
            this.method563(var4, 105, arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public static void method562(int arg0) {
        int var1 = -71 % ((arg0 + 31) / 58);
        field1799 = null;
        field1797 = null;
        field1800 = null;
        field1796 = null;
        field1803 = null;
        field1791 = null;
        field1804 = null;
        field1802 = null;
        field1793 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILsb;)V")
    private final void method563(int arg0, int arg1, class127 arg2) {
        if (arg0 == 1) {
            this.field1786 = arg2.method1011(73);
        } else if (arg0 == 2) {
            this.field1787 = arg2.method1011(26);
        } else if (arg0 == 3) {
            this.field1785 = arg2.method1010(-14330);
        } else if (arg0 == 4) {
            this.field1789 = arg2.method986(-113);
        } else if (arg0 == 5) {
            this.field1784 = arg2.method1020(false);
            this.field1792 = new int[this.field1784];
            this.field1790 = new class136[this.field1784];
            for (int var4 = 0; var4 < this.field1784; var4++) {
                this.field1792[var4] = arg2.method986(arg1 - 48);
                this.field1790[var4] = arg2.method1010(arg1 - 14435);
            }
        } else if (arg0 == 6) {
            this.field1784 = arg2.method1020(false);
            this.field1792 = new int[this.field1784];
            this.field1783 = new int[this.field1784];
            for (int var5 = 0; var5 < this.field1784; var5++) {
                this.field1792[var5] = arg2.method986(-128);
                this.field1783[var5] = arg2.method986(-69);
            }
        }
        if (arg1 != 105) {
            this.method563(72, -61, null);
        }
        field1781++;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
    public static final void method564(int arg0) {
        if (arg0 > -46) {
            method564(31);
        }
        for (int var1 = 0; var1 < class26.field591; var1++) {
            int var2 = class108.field2532[var1];
            class13 var3 = class154.field3518[var2];
            int var4 = class4.field70.method1011(27);
            if ((var4 & 0x40) != 0) {
                var4 += class4.field70.method1011(75) << 8;
            }
            class28.method238(var4, (byte) 101, var3, var2);
        }
        field1795++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lmd;III)Z")
    public static final boolean method565(class87 arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -114) {
            field1804 = null;
        }
        byte[] var4 = arg0.method669(arg3, arg1, -34);
        field1782++;
        if (var4 == null) {
            return false;
        } else {
            class153.method1200(0, var4);
            return true;
        }
    }
}
