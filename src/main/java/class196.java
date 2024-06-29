import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class196 {

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "[I")
    public static int[] field2861 = new int[4];

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2860 = new String[200];

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "Llc;")
    public static class435 field2866 = new class435(109, 0);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public int field2862;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "Ljia;")
    public static class336 field2867;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "Lsca;")
    public static class432 field2868;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lha;I)V", line = 10)
    public static final void method1379(class543 arg0, int arg1) {
        field2865++;
        if (class405.field5772 == class108.field1536.field3920 || class565.field8185 == null) {
            return;
        }
        if (arg1 != -17930) {
            method1383(true, (byte) -3);
        }
        if (class376.method2331(class108.field1536.field3920, arg0, 95)) {
            class405.field5772 = class108.field1536.field3920;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZ)V", line = 35)
    public static final void method1380(int arg0, boolean arg1) {
        class366.method2303(class565.field8187, false, arg1, class346.field4771, class68.field1042);
        field2869++;
        int var2 = -99 / ((-arg0 - 42) / 62);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)V", line = 45)
    public static final void method1381(boolean arg0) {
        class31.field288.method3553(0);
        field2863++;
        class340.field4683 = 0;
        if (arg0) {
            field2860 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLjava/lang/String;)J", line = 57)
    public static final long method1382(byte arg0, String arg1) {
        field2859++;
        int var2 = arg1.length();
        if (arg0 < 123) {
            field2868 = null;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZB)V", line = 81)
    public static final void method1383(boolean arg0, byte arg1) {
        field2872++;
        class99.field1409++;
        class88 var2 = class448.method2741((byte) 117, class264.field3780, class583.field8319);
        class523.method3183(var2, (byte) 31);
        for (class182 var3 = (class182) class591.field8410.method4023((byte) -117); var3 != null; var3 = (class182) class591.field8410.method4021((byte) 80)) {
            if (!var3.method2657(false)) {
                var3 = (class182) class591.field8410.method4023((byte) -84);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field2507 == 0) {
                class417.method2517(0, true, arg0, var3);
            }
        }
        if (class310.field4186 != null) {
            class401.method2439(1723, class310.field4186);
            class310.field4186 = null;
        }
        if (arg1 < 31) {
            field2860 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 125)
    public static void method1384(int arg0) {
        field2866 = null;
        if (arg0 >= 93) {
            field2860 = null;
            field2867 = null;
            field2861 = null;
            field2868 = null;
        }
    }
}
