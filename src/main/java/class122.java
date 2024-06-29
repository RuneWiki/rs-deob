import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class122 extends class64 {

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!ne", name = "rb", descriptor = "I")
    private int field2255 = 4096;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lsg;")
    private static class169 field2244 = class165.method1060("Please enter your username)3", 1536);

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "[I")
    public static int[] field2250 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lsg;")
    private static class169 field2239 = class165.method1060("green:", 1536);

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "Lsg;")
    public static class169 field2251 = field2239;

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "Lsg;")
    public static class169 field2253 = field2244;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "Lsg;")
    private static class169 field2243 = class165.method1060("Unexpected server response)3", 1536);

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "[I")
    public static int[] field2252 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ne", name = "qb", descriptor = "Lsg;")
    public static class169 field2254 = class165.method1060("::errortest", 1536);

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Lsg;")
    public static class169 field2241 = field2239;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "Lsg;")
    public static class169 field2242 = field2243;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ne", name = "sb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "[I")
    public static int[] field2246;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V")
    public static void method756(boolean arg0) {
        field2241 = null;
        field2250 = null;
        field2254 = null;
        field2252 = null;
        field2239 = null;
        field2253 = null;
        field2244 = null;
        field2243 = null;
        field2251 = null;
        field2246 = null;
        if (!arg0) {
            method758(46, 56, true);
        }
        field2242 = null;
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
    public static final void method757(int arg0) {
        if (class116.field2148 != null) {
            class116.field2148.method359((byte) 69);
        }
        ++field2245;
        if (arg0 >= -123) {
            method756(false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = 31 / ((arg0 - -60) / 36);
        ++field2256;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2255 = arg1.method785(true);
            }
        } else {
            this.field2249 = arg1.method785(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field2248;
        int[] var3 = super.field1192.method19((byte) 127, arg0);
        if (arg1 != 19) {
            field2243 = null;
        }
        if (super.field1192.field75) {
            int[] var4 = this.method394(20331, 0, arg0);
            for (int var5 = 0; ~class147.field2715 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2249 && ~var6 >= ~this.field2255 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZ)Lsg;")
    public static final class169 method758(int arg0, int arg1, boolean arg2) {
        ++field2240;
        if (arg0 != -27907) {
            method757(-29);
        }
        return class112.method692(true, arg2, arg1, 10);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, true);
    }
}
