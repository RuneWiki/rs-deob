import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 extends class37 {

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public int field840 = -1;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public int field841 = 0;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "[I")
    public static int[] field829 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "[I")
    public static int[] field824 = new int[5];

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Lo;")
    public static class84 field830 = class15.method124("Click to continue", 255);

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "[J")
    public static long[] field833 = new long[100];

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Lo;")
    public static class84 field838 = class15.method124("null", 255);

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "[I")
    public static int[] field835 = new int[500];

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Lo;")
    public static class84 field846 = class15.method124("You last logged in @red@", 255);

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "Lo;")
    public static class84 field848 = class15.method124("Dec", 255);

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lad;")
    public static class5 field828;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lad;")
    public static class5 field831;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Lp;")
    public static class89 field839;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 3)
    public static final void method358(int arg0, int arg1) {
        if (arg0 != 382) {
            method361((byte) -39);
        }
        field832++;
        if (class127.field2813 == null) {
            return;
        }
        if (class21.field387 != 0) {
            if (class30.field600 == null) {
                return;
            }
            class33.field653 = arg1;
        } else if (class73.field1533 >= 0) {
            class73.field1533 = arg1;
            class127.field2813.method432((byte) -97, 0, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 65)
    public static final void method359(int arg0) {
        class86.field1964 = new byte[4][104][104];
        if (arg0 != -25155) {
            field833 = null;
        }
        class88.field1978 = new byte[4][104][104];
        class25.field426 = new int[104];
        class104.field2185 = new int[104];
        field845++;
        class17.field319 = new byte[4][104][104];
        class44.field879 = new byte[4][104][104];
        class55.field1154 = new int[104];
        class71.field1495 = new byte[4][105][105];
        class31.field624 = new int[104];
        class38.field745 = new int[4][105][105];
        class11.field217 = new int[105][105];
        class40.field818 = 99;
        class101.field2137 = new int[104];
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Z", line = 117)
    public static final boolean method360(int arg0, byte arg1) {
        field847++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class63.field1306[arg0];
        if (arg1 == -7) {
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 51;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 141)
    public static void method361(byte arg0) {
        field828 = null;
        field830 = null;
        field848 = null;
        field835 = null;
        field831 = null;
        field824 = null;
        field829 = null;
        field846 = null;
        int var1 = 98 % ((-arg0 - 21) / 54);
        field833 = null;
        field838 = null;
        field839 = null;
    }
}
