import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class131 extends class64 {

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "Lsg;")
    private static class169 field2429 = class165.method1060("Create a free account", 1536);

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "Lsg;")
    public static class169 field2431 = class165.method1060("mod_icons", 1536);

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "Lsg;")
    public static class169 field2438 = class165.method1060("nav", 1536);

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "J")
    public static long field2433 = 0L;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "Lsg;")
    public static class169 field2439 = class165.method1060("<col=c0ff00>", 1536);

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lsg;")
    public static class169 field2436 = field2429;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!oe", name = "ob", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lhg;")
    public static class71 field2430;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "[I")
    public static int[] field2437;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        if (arg0 != -40) {
            return null;
        } else {
            int[][] var3 = super.field1195.method177(1193, arg1);
            if (super.field1195.field532) {
                int[][] var4 = this.method402(false, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var3[0];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class147.field2715; ++var11) {
                    var7[var11] = -var5[var11] + 4096;
                    var9[var11] = -var8[var11] + 4096;
                    var10[var11] = 4096 - var6[var11];
                }
            }
            ++field2432;
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field2440;
        int[] var3 = super.field1192.method19((byte) 124, arg0);
        if (arg1 != 19) {
            return null;
        } else {
            if (super.field1192.field75) {
                int[] var4 = this.method394(20331, 0, arg0);
                for (int var5 = 0; class147.field2715 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILqf;B)V")
    public static final void method858(int arg0, int arg1, class150 arg2, byte arg3) {
        ++field2434;
        if (class37.field726 == null && !class189.field3707) {
            if (arg3 == -104) {
                if (arg2 != null && class162.method1040(arg2, arg3 + 204) != null) {
                    class37.field726 = arg2;
                    class180.field3498 = class162.method1040(arg2, 100);
                    class44.field818 = arg1;
                    client.field594 = 0;
                    class172.field3331 = arg0;
                    class7.field184 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = 19 % ((arg0 - -60) / 36);
        if (~arg2 == -1) {
            super.field1183 = ~arg1.method819((byte) 22) == -2;
        }
        ++field2435;
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
    public static void method859(int arg0) {
        field2430 = null;
        field2429 = null;
        field2438 = null;
        field2431 = null;
        field2436 = null;
        if (arg0 == 1) {
            field2437 = null;
            field2439 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }
}
