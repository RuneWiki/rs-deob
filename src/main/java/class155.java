import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class155 extends class139 {

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Led;")
    public static class187 field2552 = new class187();

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field2554 = -1;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Lcc;")
    public static class216 field2555 = new class216(2);

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "[Lsi;")
    public static class204[] field2556;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z")
    public abstract boolean method1147(byte arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIILqi;)V")
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, class131 arg4) {
        if (arg1 != -13979) {
            method1149(-70, true);
        }
        field2551++;
        if (class205.field3280 < 3) {
            ((class140) class17.field190).method64(arg2, arg3, arg4.field2102, arg4.field2167, class17.field190.field3270 / 2, class17.field190.field3271 / 2, (int) class190.field3068, 256, arg4.field2068, arg4.field2062);
        } else {
            class70.method493(arg2, arg3, 0, arg4.field2068, arg4.field2062);
        }
        class294.field4673[arg0] = true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
    public static final void method1149(int arg0, boolean arg1) {
        if (arg0 != -1) {
            field2552 = null;
        }
        class3.field29 = arg1;
        field2546++;
        class229.field3678 = !class77.method566((byte) -54);
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1150(int arg0);

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Z")
    public static final boolean method1151(int arg0) {
        field2553++;
        return class145.field2379 == arg0 ? class254.field4191.method1708(-1) : true;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
    public static void method1152(int arg0) {
        field2555 = null;
        field2552 = null;
        if (arg0 > 28) {
            field2556 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lv;Z)Lid;")
    public static final class151 method1153(class152 arg0, boolean arg1) {
        if (arg1) {
            field2547++;
            return new class151(arg0.method1090(12107), arg0.method1090(12107), arg0.method1090(12107), arg0.method1090(12107), arg0.method1128((byte) -110), arg0.method1128((byte) -107), arg0.method1111(255));
        } else {
            return null;
        }
    }
}
