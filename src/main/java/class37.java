import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 extends class119 {

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public int field824 = 0;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Lv;")
    private static class146 field823 = class159.method1226((byte) -37, "Checking for updates )2 ");

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Lv;")
    public static class146 field821 = field823;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lwf;")
    public static class159 field831 = new class159();

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "Lv;")
    public static class146 field834 = class159.method1226((byte) -37, ":duelreq:");

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "Lv;")
    public static class146 field836 = class159.method1226((byte) -37, "weiss:");

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "Lua;")
    public static class140 field837 = new class140(64);

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "[J")
    public static long[] field838 = new long[100];

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Lla;")
    public static class77 field820;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "[I")
    public static int[] field833;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "[[[B")
    public static byte[][][] field835;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "[[[B")
    public static byte[][][] field839;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IJ)V")
    public static final void method245(int arg0, long arg1) {
        if (arg0 != 29690) {
            return;
        }
        field832++;
        if (arg1 != 0L) {
            class140.field3208++;
            class82.field1990.method265((byte) -85, 208);
            class82.field1990.method746(arg1, 1101310632);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILdd;)Z")
    public static final boolean method246(int arg0, class26 arg1) {
        field829++;
        if (arg0 > -100) {
            field823 = null;
        }
        if (class119.field2767) {
            if (class42.method281(arg1, 1299495520) != 0) {
                return false;
            }
            if (arg1.field479 == 0) {
                return false;
            }
        }
        return arg1.field522;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)I")
    public static final int method247(int arg0, int arg1, byte arg2) {
        field826++;
        int var3 = -114 / ((-arg2 - 19) / 35);
        int var4 = arg0 >>> 31;
        return (arg0 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lne;I)V")
    public final void method248(class95 arg0, int arg1) {
        field822++;
        if (arg1 != -19402) {
            return;
        }
        while (true) {
            int var3 = arg0.method790((byte) 73);
            if (var3 == 0) {
                return;
            }
            this.method251((byte) 105, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static void method249(byte arg0) {
        field833 = null;
        field837 = null;
        field820 = null;
        field836 = null;
        field838 = null;
        if (arg0 > -14) {
            method247(88, 75, (byte) 61);
        }
        field839 = null;
        field821 = null;
        field823 = null;
        field835 = null;
        field831 = null;
        field834 = null;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static final void method250(byte arg0) {
        class115.field2673 = null;
        class91.field2172 = null;
        field825++;
        class125.field2898 = null;
        if (arg0 != 13) {
            field838 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILne;)V")
    private final void method251(byte arg0, int arg1, class95 arg2) {
        if (arg1 == 5) {
            this.field824 = arg2.method795(1);
        }
        if (arg0 != 105) {
            method249((byte) -122);
        }
        field828++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lla;B)V")
    public static final void method252(class77 arg0, byte arg1) {
        class123.field2858 = arg0;
        field827++;
        int var2 = 80 / ((arg1 + 13) / 36);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ldd;ZII)V")
    public static final void method253(class26 arg0, boolean arg1, int arg2, int arg3) {
        field830++;
        if (client.field340 != null || class38.field842 || (arg0 == null || class92.method735(arg0, (byte) 106) == null)) {
            return;
        }
        client.field340 = arg0;
        class67.field1518 = class92.method735(arg0, (byte) 106);
        class118.field2755 = arg2;
        class125.field2897 = arg3;
        if (!arg1) {
            field833 = null;
        }
        class57.field1280 = 0;
        class8.field161 = false;
    }
}
