import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class85 extends class105 {

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    private int field1801 = 4096;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
    private int field1805 = 0;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Leh;")
    private static class47 field1795 = class195.method1282((byte) -4, "Loading title screen )2 ");

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "Leh;")
    private static class47 field1804 = class195.method1282((byte) -4, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "Leh;")
    private static class47 field1802 = class195.method1282((byte) -4, "Bad session id)3");

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "Leh;")
    public static class47 field1794 = class195.method1282((byte) -4, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "Leh;")
    public static class47 field1799 = field1802;

    @OriginalMember(owner = "client!jd", name = "nb", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1796 = 0;

    @OriginalMember(owner = "client!jd", name = "pb", descriptor = "Leh;")
    public static class47 field1811 = field1795;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "Leh;")
    public static class47 field1798 = field1804;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!jd", name = "mb", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!jd", name = "ob", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "[I")
    public static int[] field1807;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "[[S")
    public static short[][] field1797;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1801 = arg1.method569(26496);
            }
        } else {
            this.field1805 = arg1.method569(26496);
        }
        if (arg2 != -256) {
            this.method17(22, (class68) null, 84);
        }
        ++field1803;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public static void method701(int arg0) {
        field1802 = null;
        field1799 = null;
        field1794 = null;
        field1804 = null;
        field1811 = null;
        field1798 = null;
        field1807 = null;
        field1797 = null;
        field1795 = null;
        int var1 = -63 % ((61 - arg0) / 61);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field1806;
        int[] var3 = super.field2192.method336(-62, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0);
            for (int var5 = 0; class149.field2928 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1805 && var6 <= this.field1801 ? 4096 : 0;
            }
        }
        if (arg1 < 78) {
            this.method17(34, (class68) null, 122);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public static final void method702(int arg0) {
        ++field1810;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        if (arg0 == 0) {
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(III)J")
    public static final long method703(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        return var3 != null && var3.field2989 != null ? var3.field2989.field3895 : 0L;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, true);
    }
}
