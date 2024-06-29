import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lfc;")
    private static class39 field1681 = class90.method774("Could not complete login)3", -123);

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
    public static int[] field1688 = new int[128];

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lfc;")
    public static class39 field1691 = class90.method774("m-Ochte mit Ihnen handeln)3", -89);

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lfc;")
    public static class39 field1682 = class90.method774("sl_arrows", -82);

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lfc;")
    public static class39 field1685 = class90.method774(")1", -86);

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lfc;")
    public static class39 field1694 = class90.method774("logo", -107);

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Lfc;")
    public static class39 field1695 = field1681;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "J")
    public static long field1684;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    public static int[] field1686;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[Lb;")
    public static class8[] field1690;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lob;", line = 7)
    public static final class99 method663(int arg0, int arg1, int arg2) {
        field1693++;
        class99 var3 = class54.method567(70, arg0);
        if (~arg2 == arg1) {
            return var3;
        } else if (var3 == null || var3.field2416 == null || var3.field2416.length <= arg2) {
            return null;
        } else {
            return var3.field2416[arg2];
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method664(boolean arg0) {
        if (class115.field3015 != null) {
            class115.field3015.method1145(5073);
            class115.field3015 = null;
        }
        field1692++;
        class58.method586(2663);
        class139.field3503.method42();
        for (int var1 = 0; var1 < 4; var1++) {
            class117.field3077[var1].method875(16777215);
        }
        System.gc();
        class83.method694(2, 23440);
        if (!arg0) {
            field1686 = null;
        }
        class9.field255 = false;
        class55.field1371 = -1;
        class103.method926((byte) -56);
        class114.method990((byte) -127, 10);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 85)
    public static void method665(int arg0) {
        field1688 = null;
        int var1 = 6 / ((arg0 + 86) / 33);
        field1690 = null;
        field1695 = null;
        field1686 = null;
        field1694 = null;
        field1681 = null;
        field1682 = null;
        field1691 = null;
        field1685 = null;
    }
}
