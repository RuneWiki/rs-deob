import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class224 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lfl;")
    public static class222 field3958 = new class222(5000);

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[[I")
    public static int[][] field3963 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lud;")
    public static class279 field3962 = class130.method1024(":clanreq:", 255);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lok;")
    public static class149 field3961;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lok;IIILok;)Lvi;", line = 4)
    public static final class6 method1644(class149 arg0, int arg1, int arg2, int arg3, class149 arg4) {
        field3957++;
        if (class137.method1066(arg1, 25486, arg0, arg2)) {
            if (arg3 <= 16) {
                method1645(-30, 18);
            }
            return class103.method870(arg4.method1192(0, arg2, arg1), false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[B", line = 24)
    public static final synchronized byte[] method1645(int arg0, int arg1) {
        field3959++;
        if (arg1 == 100 && class5.field116 > 0) {
            byte[] var2 = class292.field5209[--class5.field116];
            class292.field5209[class5.field116] = null;
            return var2;
        } else if (arg1 == 5000 && class131.field2402 > 0) {
            byte[] var3 = class119.field2145[--class131.field2402];
            class119.field2145[class131.field2402] = null;
            return var3;
        } else if (arg1 == 30000 && class112.field2067 > 0) {
            byte[] var4 = class159.field2897[--class112.field2067];
            class159.field2897[class112.field2067] = null;
            return var4;
        } else {
            if (arg0 <= 24) {
                field3962 = (class279) null;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V", line = 68)
    public static final void method1646(byte arg0, int arg1) {
        field3960++;
        if (arg0 >= 53) {
            class166.field3005.method1339(arg1, 19326);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 92)
    public static void method1647(int arg0) {
        field3961 = null;
        if (arg0 != 2) {
            field3961 = (class149) null;
        }
        field3962 = null;
        field3958 = null;
        field3963 = (int[][]) null;
    }
}
