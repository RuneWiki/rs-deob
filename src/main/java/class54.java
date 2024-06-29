import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class54 extends class123 {

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    private int field926 = 4096;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    private int field930 = 4096;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    private int field932 = 4096;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "Leb;")
    public static class230 field931 = class68.method589(0, "k");

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    public static int field935 = 1;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "Leb;")
    private static class230 field936 = class68.method589(0, "Loaded interfaces");

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Leb;")
    public static class230 field927 = field936;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "Lrg;")
    public static class217 field939 = new class217();

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "Leb;")
    private static class230 field944 = class68.method589(0, "Loaded title screen");

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "Leb;")
    public static class230 field943 = class68.method589(0, "Okay");

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "Leb;")
    public static class230 field942 = field944;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "Leb;")
    public static class230 field945 = class68.method589(0, "zap");

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "Leb;")
    public static class230 field937;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "[I")
    public static int[] field941;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "[[[B")
    public static byte[][][] field940;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
    public static void method424(byte arg0) {
        field942 = null;
        field943 = null;
        field944 = null;
        field939 = null;
        field937 = null;
        field936 = null;
        field927 = null;
        field941 = null;
        field945 = null;
        field931 = null;
        field940 = null;
        if (arg0 != 8) {
            field945 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(B)V")
    public static final void method425(byte arg0) {
        ++field933;
        class146.field2634.method1122(10);
        if (arg0 != 78) {
            field941 = null;
        }
        class1.field1.method1122(10);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)I")
    public static final int method426(boolean arg0, int arg1) {
        ++field928;
        if (!arg0) {
            field931 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 == 1876195788) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field926 = arg1.method161(4);
                    }
                } else {
                    this.field930 = arg1.method161(4);
                }
            } else {
                this.field932 = arg1.method161(4);
            }
            ++field938;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            field942 = null;
        }
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        ++field925;
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, arg0, (byte) -105);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class140.field2505; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field932 * var12 >> 12;
                    var9[var11] = this.field930 * var13 >> 12;
                    var10[var11] = this.field926 * var14 >> 12;
                } else {
                    var8[var11] = this.field932;
                    var9[var11] = this.field930;
                    var10[var11] = this.field926;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class54() {
        super(1, false);
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public static final void method427(int arg0) {
        class45.field803.method1122(10);
        ++field929;
        if (arg0 != 4096) {
            field931 = null;
        }
    }
}
