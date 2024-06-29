import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class195 extends class93 {

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field3810 = 0;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "Ljd;")
    private static class92 field3816 = class202.method1325((byte) 90, "Close");

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "Ljd;")
    private static class92 field3807 = class202.method1325((byte) 90, "M");

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "Ljd;")
    public static class92 field3811 = field3807;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "Ljd;")
    public static class92 field3809 = field3807;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Ljd;")
    public static class92 field3805 = field3816;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "Llh;")
    public static class115 field3819;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "Lnh;")
    public static class133 field3814;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "[Ld;")
    private class31[] field3812;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "[[B")
    public static byte[][] field3806;

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public static void method1299(boolean arg0) {
        field3811 = null;
        field3805 = null;
        field3807 = null;
        field3809 = null;
        field3806 = null;
        field3816 = null;
        field3819 = null;
        if (arg0) {
            field3807 = null;
        }
        field3814 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            field3805 = null;
        }
        int[][] var3 = super.field1873.method553(arg0, 0);
        ++field3813;
        if (super.field1873.field1656) {
            int var4 = class68.field1385;
            int var5 = class150.field2985;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = super.field1873.method548((byte) -60);
            this.method1300(0, var6);
            for (int var8 = 0; class68.field1385 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[2];
                int[] var12 = var10[1];
                int[] var13 = var10[0];
                for (int var14 = 0; var14 < class150.field2985; ++var14) {
                    int var15 = var9[var14];
                    var11[var14] = class196.method1301(var15 << 4, 4080);
                    var12[var14] = class196.method1301(4080, var15 >> 4);
                    var13[var14] = class196.method1301(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[[I)V")
    private final void method1300(int arg0, int[][] arg1) {
        ++field3815;
        int var3 = class68.field1385;
        int var4 = class150.field2985;
        class152.method974(arg1, -21347);
        class58.method359(class2.field163, (byte) 26, class5.field279, arg0, 0);
        if (this.field3812 != null) {
            for (int var5 = 0; ~this.field3812.length < ~var5; ++var5) {
                class31 var6 = this.field3812[var5];
                int var7 = var6.field715;
                int var8 = var6.field716;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method203(var4, 27156, var3);
                    }
                } else if (var8 < 0) {
                    var6.method201((byte) -67, var3, var4);
                } else {
                    var6.method202(var3, var4, (byte) 124);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = 89 / ((67 - arg1) / 42);
        int[] var4 = super.field1887.method916(arg0, -101);
        if (super.field1887.field2757) {
            this.method1300(0, super.field1887.method913(0));
        }
        ++field3818;
        return var4;
    }
}
