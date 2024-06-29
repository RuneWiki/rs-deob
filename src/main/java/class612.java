import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class612 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[I")
    public static int[] field8875 = new int[16];

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "[[Z")
    public static boolean[][] field8879 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field8881 = -1;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Ljr;")
    public static class92 field8876 = new class92("", 11);

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Ljr;")
    public static class92 field8882 = new class92("", 15);

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method3517(int arg0) {
        field8882 = null;
        if (arg0 != -1) {
            field8879 = null;
        }
        field8876 = null;
        field8875 = null;
        field8879 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII)V")
    public static final void method3518(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class565.field8299.field2192 * arg3 >> 8;
        if (arg2 != 1609725896) {
            method3519(92, -26);
        }
        field8883++;
        if (var4 != 0 && arg1 != -1) {
            class448.method2621(var4, 0, false, true, arg1, class531.field7458);
            class157.field1921 = true;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)Z")
    public static final boolean method3519(int arg0, int arg1) {
        field8878++;
        if (arg0 != -23287) {
            field8879 = null;
        }
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Lib;")
    public static final class133 method3520(int arg0) {
        if (arg0 != 0) {
            method3518(122, -7, 26, 57);
        }
        field8880++;
        try {
            return (class133) Class.forName("ao").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)V")
    public static final void method3521(byte arg0, int arg1, int arg2) {
        field8877++;
        class310 var3 = class69.field666[arg2][arg1];
        if (var3 != null) {
            class462.field6384 = var3.field3947;
            class69.field661 = var3.field3952;
            class7.field55 = var3.field3945;
        }
        class404.method2304(115);
        if (arg0 < 11) {
            method3517(78);
        }
    }
}
