import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class92 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Leb;")
    private static class230 field1655 = class68.method589(0, "Walk here");

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static volatile int field1654 = -1;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Leb;")
    public static class230 field1661 = field1655;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Loe;")
    public static class140 field1659;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[I")
    public static int[] field1664;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method775(int arg0) {
        field1656++;
        if (arg0 > -15) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class138.method1064(true, var3, var2, var1, class53.field916, -105)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lok;")
    public static final class39 method776(int arg0, int arg1) {
        field1660++;
        class39 var2 = (class39) class173.field3049.method1125((long) arg0, true);
        if (arg1 <= 121) {
            method775(10);
        }
        if (var2 != null) {
            return var2;
        }
        class39 var3 = class88.method719(false, arg0, class134.field2421, class252.field4517, (byte) 93);
        if (var3 != null) {
            class173.field3049.method1129((long) arg0, true, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLka;)V")
    public static final void method777(byte arg0, class245 arg1) {
        if (arg0 != -65) {
            field1657 = -124;
        }
        field1663++;
        if (class127.field2215 == arg1.field4267) {
            class71.field1300[arg1.field4204] = true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1662++;
        if (arg0 < 13) {
            method780(-49);
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        class9.field161 = (short) arg2;
        class227.field3917 = (short) arg4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static final void method779(boolean arg0) {
        class134.field2423 = 0;
        class27.field504 = 0;
        class17.field387 = -1;
        class178.field3138 = 1;
        if (!arg0) {
            method778(77, 51, -15, -65, 48, true);
        }
        field1658++;
        class49.field863 = 0;
        class60.field1149 = false;
        class159.field2831 = -3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method780(int arg0) {
        if (arg0 != 1) {
            field1664 = null;
        }
        field1664 = null;
        field1655 = null;
        field1661 = null;
        field1659 = null;
    }
}
