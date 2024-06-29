import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class173 extends class124 {

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    private int field2910 = 1;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    private int field2906 = 0;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field2902 = 0;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field2904 = 127;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Le;")
    public static class191 field2908 = class54.method368("Bitte warten Sie)3)3)3", 2047);

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "Le;")
    public static class191 field2912 = class54.method368(")2", 2047);

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "Le;")
    public static class191 field2918 = class54.method368("lila:", 2047);

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "Le;")
    private static class191 field2922 = class54.method368("Ok", 2047);

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "Le;")
    public static class191 field2923 = class54.method368(":assist:", 2047);

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "Le;")
    public static class191 field2907 = field2922;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "[I")
    public static int[] field2917 = new int[25];

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "Le;")
    public static class191 field2916 = class54.method368("Welt", 2047);

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "[Le;")
    public static class191[] field2921;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        ++field2909;
        if (super.field2064.field1035) {
            int var4 = class236.field4202[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class64.field1132 < ~var6; ++var6) {
                int var7 = class257.field4559[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field2911 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2910 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field2910;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field2906 == -1) {
                    var12 = class20.field281[(var12 & 4094) >> 4] + 4096 >> 1;
                } else if (this.field2906 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 <= 68) {
            field2902 = 34;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V")
    public static void method1162(int arg0) {
        field2912 = null;
        field2916 = null;
        field2918 = null;
        if (arg0 <= 51) {
            field2918 = null;
        }
        field2907 = null;
        field2921 = null;
        field2908 = null;
        field2922 = null;
        field2923 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V")
    public static final void method1163(int arg0) {
        class273.field4822.method992(-31);
        ++field2914;
        if (arg0 != -1) {
            field2922 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILe;)Le;")
    public static final class191 method1164(int arg0, class191 arg1) {
        if (arg0 <= 28) {
            method1167((byte) -88);
        }
        ++field2903;
        int var2 = class37.method252(arg1, 4291);
        return var2 == -1 ? class206.field3659 : class110.field1849.field825[var2].method1321(false, class123.field2040, class13.field160);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            field2917 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field2910 = arg1.method1580(-22);
                }
            } else {
                this.field2906 = arg1.method1580(-94);
            }
        } else {
            this.field2911 = arg1.method1580(-124);
        }
        ++field2920;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLng;II)Lli;")
    public static final class155 method1165(boolean arg0, class121 arg1, int arg2, int arg3) {
        ++field2919;
        return !class121.method796(arg0, arg3, arg2, arg1) ? null : class258.method1781(8639);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public static final void method1166(int arg0, int arg1) {
        ++field2915;
        if (arg1 != 499) {
            field2912 = null;
        }
        class230.field4125.method990(123, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    public static final void method1167(byte arg0) {
        if (class88.field1438[96]) {
            class14.field167 += (-class14.field167 + -24) / 2;
        } else if (class88.field1438[97]) {
            class14.field167 += (-class14.field167 + 24) / 2;
        } else {
            class14.field167 /= 2;
        }
        class65.field1138 += class14.field167 / 2;
        int var1 = class118.field1953 + class175.field2946.field3003;
        int var2 = 106 % ((arg0 - 77) / 34);
        ++field2913;
        if (!class88.field1438[98]) {
            if (!class88.field1438[99]) {
                class27.field391 /= 2;
            } else {
                class27.field391 += (-class27.field391 + -12) / 2;
            }
        } else {
            class27.field391 += (-class27.field391 + 12) / 2;
        }
        class269.field4751 += class27.field391 / 2;
        int var3 = class175.field2946.field2972 - -class107.field1771;
        if (-var1 + class256.field4548 < -500 || -var1 + class256.field4548 > 500 || ~(-var3 + class65.field1142) > 499 || ~(-var3 + class65.field1142) < -501) {
            class256.field4548 = var1;
            class65.field1142 = var3;
        }
        if (~class256.field4548 != ~var1) {
            class256.field4548 += (-class256.field4548 + var1) / 16;
        }
        if (~class65.field1142 != ~var3) {
            class65.field1142 += (var3 - class65.field1142) / 16;
        }
        class265.method1818((byte) 47);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class173() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        class127.method862(7332);
        if (arg0 != -1) {
            field2908 = null;
        }
        ++field2905;
    }
}
