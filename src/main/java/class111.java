import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class111 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[Lsk;")
    public static class112[] field1841 = new class112[28];

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1843 = 0;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Ln;")
    public static class16 field1834;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method811(byte arg0) {
        field1834 = null;
        if (arg0 != -18) {
            field1840 = -122;
        }
        field1841 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)V")
    public static final void method812(boolean arg0, int arg1) {
        field1833++;
        byte[][] var2 = class27.field426;
        if (arg1 > -12) {
            field1834 = null;
        }
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class99.field1620[var5] & 0xFF) * 64 - class214.field3501;
            byte[] var12 = var2[var5];
            int var13 = (class99.field1620[var5] >> 8) * 64 - class50.field884;
            if (var12 != null) {
                class254.method1730(-70);
                class287.method1927(arg0, var12, (class73.field1196 - 6) * 8, class167.field2657, (byte) 121, var13, var11, class155.field2507 * 8 - 48);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class99.field1620[var6] & 0xFF) * 64 - class214.field3501;
            byte[] var8 = var2[var6];
            int var9 = (class99.field1620[var6] >> 8) * 64 - class50.field884;
            if (var8 == null && class155.field2507 < 800) {
                class254.method1730(-124);
                for (int var10 = 0; var10 < var3; var10++) {
                    class4.method39(var9, false, 64, var7, 64, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public static final void method813(int arg0, int arg1) {
        field1835++;
        class89.method646((byte) -8);
        class281.method1892(-120);
        int var2 = class41.method353(arg0, -119).field547;
        if (var2 == 0) {
            return;
        }
        int var3 = class82.field1289[arg0];
        if (var2 == 9) {
            class216.field3524 = var3;
        }
        if (var2 == 6) {
            class5.field65 = var3;
        }
        if (var2 == 5) {
            class222.field3683 = var3;
        }
        if (arg1 < 107) {
            method812(false, -84);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class111() {
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lth;)V")
    public class111(class111 arg0) {
        this.field1839 = arg0.field1839;
        this.field1836 = arg0.field1836;
        this.field1844 = arg0.field1844;
        this.field1842 = arg0.field1842;
    }
}
