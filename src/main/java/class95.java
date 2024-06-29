import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class95 {

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1742 = 2;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lkh;")
    public static class117 field1744 = class224.method1450((byte) 105, "");

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lkh;")
    private static class117 field1738 = class224.method1450((byte) -84, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1739 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lkh;")
    public static class117 field1743 = field1738;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lkh;")
    private static class117 field1747 = class224.method1450((byte) -32, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lkh;")
    public static class117 field1748 = field1747;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Loe;")
    public class158 field1741;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[I")
    public int[] field1735;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[[Z")
    public static boolean[][] field1740;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static final void method648(int arg0) {
        field1736++;
        if (arg0 >= -20) {
            method649(-81);
        }
        class82 var1 = class94.field1719;
        synchronized (class94.field1719) {
            class128.field2371++;
            class159.field2913 = class90.field1665;
            if (class240.field4347 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class53.field1090[var2] = false;
                }
                class240.field4347 = class93.field1709;
            } else {
                while (class93.field1709 != class240.field4347) {
                    int var3 = class12.field398[class93.field1709];
                    class93.field1709 = class93.field1709 + 1 & 0x7F;
                    if (var3 < 0) {
                        class53.field1090[~var3] = false;
                    } else {
                        class53.field1090[var3] = true;
                    }
                }
            }
            class90.field1665 = class187.field3349;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static void method649(int arg0) {
        field1740 = null;
        field1743 = null;
        field1748 = null;
        field1747 = null;
        if (arg0 != -1) {
            field1748 = null;
        }
        field1738 = null;
        field1744 = null;
    }
}
