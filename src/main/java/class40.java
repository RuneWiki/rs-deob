import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class40 extends class287 {

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "Llc;")
    public static class143 field684 = class66.method374(" est d-Bj-9 dans votre liste d(Wamis)3", -1);

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "Llc;")
    private static class143 field683 = class66.method374("green:", -1);

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "Llc;")
    public static class143 field689 = class66.method374("; Max)2Age=", -1);

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "I")
    public static int field685 = 0;

    @OriginalMember(owner = "client!lj", name = "jb", descriptor = "Llc;")
    public static class143 field690 = field683;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "Llc;")
    public static class143 field688 = field683;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "Lgf;")
    public static class7 field686;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "[[B")
    public static byte[][] field687;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method131(101, -33);
        }
        int[][] var3 = super.field366.method209(arg1 + -1, arg0);
        ++field681;
        if (super.field366.field508 && this.method1879(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg0 % super.field5032 * super.field5032;
            int[] var7 = var3[2];
            for (int var8 = 0; ~class72.field1359 < ~var8; ++var8) {
                int var9 = super.field5034[var8 % super.field5036 + var6];
                var7[var8] = class129.method777(4080, var9 << 4);
                var5[var8] = class129.method777(var9, 65280) >> 4;
                var4[var8] = class129.method777(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(B)V")
    public static void method258(byte arg0) {
        field687 = null;
        field683 = null;
        if (arg0 > -55) {
            field690 = null;
        }
        field684 = null;
        field689 = null;
        field686 = null;
        field688 = null;
        field690 = null;
    }
}
