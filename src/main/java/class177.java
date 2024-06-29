import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class177 extends class224 {

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    private int field2864 = -1;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lg;")
    public static class242 field2861 = null;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Z")
    public static boolean field2853 = false;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    private int field2862;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    private int field2869;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Lg;")
    public static class242 field2855;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "[I")
    private int[] field2868;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "[[[I")
    public static int[][][] field2867;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IB)V", line = 5)
    public static final void method1269(int arg0, byte arg1) {
        class267.field4500.method1428(arg0, 29946);
        if (arg1 >= -38) {
            method1271(-65, (byte) -124, -65);
        }
        field2856++;
        class128.field1995.method1428(arg0, 29946);
        class156.field2465.method1428(arg0, 29946);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lul;B)V", line = 46)
    public static final void method1270(class182 arg0, byte arg1) {
        if (arg1 > -2) {
            method1271(-6, (byte) 19, 109);
        }
        class145.method1001(-126, arg0, 200000);
        field2860++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)I", line = 59)
    public static final int method1271(int arg0, byte arg1, int arg2) {
        field2857++;
        int var3 = class80.method503(arg0 - 1, false, arg2 - 1) + class80.method503(arg0 + 1, false, arg2 - 1) + class80.method503(arg0 + -1, false, arg2 + 1) + class80.method503(arg0 + 1, false, arg2 + 1);
        int var4 = class80.method503(arg0 - 1, false, arg2) + class80.method503(arg0 + 1, false, arg2) - (-class80.method503(arg0, false, arg2 + -1) + -class80.method503(arg0, false, arg2 + 1));
        if (arg1 == 71) {
            int var5 = class80.method503(arg0, false, arg2);
            return var3 / 16 + var4 / 8 + var5 / 4;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(Z)Z", line = 77)
    private final boolean method1272(boolean arg0) {
        field2863++;
        if (this.field2868 != null) {
            return true;
        } else if (this.field2864 >= 0) {
            int var2 = class115.field1791;
            int var3 = class187.field2961;
            int var4 = class267.field4497.method511((byte) 91, this.field2864) ? 64 : 128;
            this.field2868 = class267.field4497.method514(this.field2864, 1);
            this.field2869 = var4;
            this.field2862 = var4;
            class241.method1658(var2, var3, (byte) -113);
            return this.field2868 != null;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 108)
    public final void method1273(int arg0) {
        field2854++;
        if (arg0 == -17545) {
            super.method1273(arg0 ^ 0x0);
            this.field2868 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 247)
    public class177() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V", line = 126)
    public static void method1274(byte arg0) {
        field2861 = null;
        field2855 = null;
        field2867 = (int[][][]) null;
        if (arg0 != -6) {
            method1270((class182) null, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[[I", line = 147)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            this.method1275((byte) -55);
        }
        field2865++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756 && this.method1272(false)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = (class115.field1791 == this.field2862 ? arg0 : this.field2862 * arg0 / class115.field1791) * this.field2869;
            int[] var7 = var3[2];
            if (class187.field2961 == this.field2869) {
                for (int var8 = 0; var8 < class187.field2961; var8++) {
                    int var9 = this.field2868[var6++];
                    var7[var8] = class159.method1119(var9 << 4, 4080);
                    var4[var8] = class159.method1119(65280, var9) >> 4;
                    var5[var8] = class159.method1119(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class187.field2961; var10++) {
                    int var11 = this.field2869 * var10 / class187.field2961;
                    int var12 = this.field2868[var6 + var11];
                    var7[var10] = class159.method1119(4080, var12 << 4);
                    var4[var10] = class159.method1119(var12 >> 4, 4080);
                    var5[var10] = class159.method1119(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZLj;)V", line = 214)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field2858++;
        if (arg1) {
            this.method17(-92, (byte) -94);
        }
        if (arg0 == 0) {
            this.field2864 = arg2.method1069(33);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)I", line = 232)
    public final int method1275(byte arg0) {
        if (arg0 != 119) {
            this.method19(-122, true, (class153) null);
        }
        field2859++;
        return this.field2864;
    }
}
