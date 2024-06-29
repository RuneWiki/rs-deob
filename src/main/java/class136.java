import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class136 extends class51 {

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    private int field2859 = -1;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "Lea;")
    public static class38 field2849 = class9.method46((byte) 111, "::gc");

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "Lea;")
    public static class38 field2856 = class9.method46((byte) 121, "title)3jpg");

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "Lea;")
    public static class38 field2863 = class9.method46((byte) 108, "title_mute");

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
    public static int field2865 = 0;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "Lfa;")
    public static class47 field2864;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "[I")
    private int[] field2857;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)V")
    public static final void method984(int arg0) {
        ++field2854;
        field2850 = 0;
        class90.field2056 = 0;
        class188.method1263(22884);
        class74.method588(-111);
        class19.method109(false);
        class188.method1265(89);
        for (int var1 = 0; var1 < field2850; ++var1) {
            int var3 = class39.field868[var1];
            if (~class45.field1098 != ~class175.field3550[var3].field381) {
                class175.field3550[var3] = null;
            }
        }
        if (class14.field285 != class192.field3794.field1620) {
            throw new RuntimeException("gpp1 pos:" + class192.field3794.field1620 + " psize:" + class14.field285);
        } else if (arg0 == -25828) {
            for (int var2 = 0; ~var2 > ~class50.field1247; ++var2) {
                if (class175.field3550[class65.field1556[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class50.field1247);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)I")
    public final int method374(int arg0) {
        if (arg0 <= 70) {
            method987((byte) 26);
        }
        ++field2848;
        return this.field2859;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            this.field2859 = arg0.method511(-124);
        }
        if (!arg2) {
            method985((byte) -118);
        }
        ++field2862;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int[][] var3 = super.field1292.method720(false, arg1);
        if (arg0 <= 111) {
            method985((byte) 10);
        }
        if (super.field1292.field2032 && this.method986(true)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = this.field2852 * (class114.field2528 == this.field2853 ? arg1 : this.field2853 * arg1 / class114.field2528);
            if (class86.field2008 == this.field2852) {
                for (int var8 = 0; ~var8 > ~class86.field2008; ++var8) {
                    int var9 = this.field2857[var7++];
                    var6[var8] = class52.method380(var9 << 4, 4080);
                    var4[var8] = class52.method380(var9 >> 4, 4080);
                    var5[var8] = class52.method380(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class86.field2008; ++var10) {
                    int var11 = this.field2852 * var10 / class86.field2008;
                    int var12 = this.field2857[var7 + var11];
                    var6[var10] = class52.method380(var12 << 4, 4080);
                    var4[var10] = class52.method380(65280, var12) >> 4;
                    var5[var10] = class52.method380(var12, 16711680) >> 12;
                }
            }
        }
        ++field2851;
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)I")
    public static final int method985(byte arg0) {
        if (arg0 != 52) {
            method987((byte) -31);
        }
        ++field2847;
        int var1 = class38.method257(class10.field224, -169496123, class42.field925, class50.field1243);
        return ~(-class203.field4008 + var1) > -801 && ~(class3.field104[class10.field224][class50.field1243 >> 7][class42.field925 >> 7] & 4) != -1 ? class10.field224 : 3;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(Z)Z")
    private final boolean method986(boolean arg0) {
        ++field2860;
        if (this.field2857 != null) {
            return true;
        } else {
            if (!arg0) {
                method985((byte) 37);
            }
            if (this.field2859 >= 0) {
                class89 var2 = class56.method411(this.field2859, 107, class152.field3174);
                var2.method744();
                this.field2853 = var2.field2048;
                this.field2857 = var2.field2045;
                this.field2852 = var2.field2044;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
    public static void method987(byte arg0) {
        if (arg0 <= 27) {
            field2849 = null;
        }
        field2863 = null;
        field2849 = null;
        field2856 = null;
        field2864 = null;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)I")
    public static final int method988(int arg0, int arg1, int arg2) {
        if (arg0 != -44866364) {
            return -38;
        } else {
            ++field2855;
            long var3 = (long) ((arg2 << 16) + arg1);
            return class146.field3050 != null && ~class146.field3050.field2172 == ~var3 ? class126.field2705.field1620 * 99 / (class126.field2705.field1627.length + -class146.field3050.field2975) + 1 : 0;
        }
    }
}
