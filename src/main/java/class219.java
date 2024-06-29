import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class219 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[Z")
    public static boolean[] field3774 = new boolean[5];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lsk;")
    public static class199 field3773 = new class199(64);

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lmh;")
    public static class62 field3780 = class201.method1405(true, "blinken3:");

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[I")
    public static int[] field3779 = new int[2];

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    public static int[] field3777 = new int[100];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Luk;")
    public static class209 field3778;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1563(int arg0) {
        field3775++;
        if (arg0 != 2) {
            method1566((byte) 67, 76);
        }
        class110.field1774.method1395((byte) -43);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILhi;I)Lah;", line = 33)
    public static final class110 method1564(int arg0, class26 arg1, int arg2) {
        if (arg0 <= 62) {
            return (class110) null;
        } else {
            field3771++;
            byte[] var3 = arg1.method137(arg2, (byte) 59);
            return var3 == null ? null : new class110(var3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 53)
    public static void method1565(byte arg0) {
        field3778 = null;
        field3780 = null;
        field3777 = null;
        field3773 = null;
        field3779 = null;
        if (arg0 >= 23) {
            field3774 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V", line = 68)
    public static final void method1566(byte arg0, int arg1) {
        field3772++;
        class46.field688.method1390(arg1, -85);
        class183.field2916.method1390(arg1, -53);
        class36.field498.method1390(arg1, -101);
        class71.field1078.method1390(arg1, -89);
        int var2 = 52 % ((-arg0 - 23) / 54);
    }
}
