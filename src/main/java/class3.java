import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Ldd;")
    private static class35 field49 = class180.method1196((byte) -101, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Ldd;")
    public static class35 field52 = class180.method1196((byte) 127, "document)3cookie=(R");

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field51 = -1;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Ldd;")
    public static class35 field47 = field49;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lba;")
    public static class12 field42;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
    public static int[] field43;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ldd;B)Z")
    public static final boolean method16(class35 arg0, byte arg1) {
        field48++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -6 % ((arg1 - 90) / 35);
        for (int var3 = 0; var3 < class25.field505; var3++) {
            if (arg0.method337(-102, class39.field871[var3])) {
                return true;
            }
        }
        return arg0.method337(64, class71.field1704.field2254);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public static final void method17(int arg0, int arg1, int arg2) {
        if (class72.field1719 != arg0) {
            class118.field2622 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class118.field2622[var3] = (var3 << 12) / arg0;
            }
            class71.field1691 = arg0 - 1;
            class35.field718 = arg0 == 64 ? 2048 : 4096;
            class72.field1719 = arg0;
        }
        field50++;
        if (class35.field782 != arg1) {
            class22.field450 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class22.field450[var4] = (var4 << 12) / arg1;
            }
            class105.field2348 = arg1 - 1;
            class35.field782 = arg1;
        }
        if (arg2 != 20295) {
            field42 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method18(int arg0) {
        field49 = null;
        field52 = null;
        field42 = null;
        if (arg0 != 4096) {
            method17(-53, -118, -1);
        }
        field47 = null;
        field43 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Ldd;")
    public static final class35 method19(int arg0, int arg1) {
        field46++;
        return arg1 == -29578 ? class96.method732((byte) 17, 10, arg0, false) : null;
    }
}
