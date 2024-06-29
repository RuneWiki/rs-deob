import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class50 extends class104 {

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field897 = 0;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Le;")
    public static class191 field899 = class54.method368("gelb:", 2047);

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field905 = 1;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Le;")
    public static class191 field903 = class54.method368("Speicher wird zugewiesen)3", 2047);

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Z")
    public static boolean field898 = true;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Le;")
    public static class191 field907 = class54.method368(" zuerst von Ihrer Ignorieren)2Liste(Q", 2047);

    @OriginalMember(owner = "client!d", name = "G", descriptor = "[I")
    public static int[] field906 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Le;")
    public static class191 field908 = class54.method368("Ladevorgang )2 bitte warten Sie)3", 2047);

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)Lbj;")
    public static final class83 method334(byte arg0) {
        field904++;
        if (arg0 >= -50) {
            method335(false);
        }
        try {
            return (class83) Class.forName("ig").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class1();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public static final void method335(boolean arg0) {
        if (!arg0) {
            field898 = false;
        }
        field900++;
        class20.field273.method992(-31);
        class262.field4647.method992(-31);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
    public class50(int arg0, int arg1) {
        this.field902 = arg1;
        this.field901 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public static void method336(byte arg0) {
        field906 = null;
        field908 = null;
        field899 = null;
        int var1 = -57 / ((arg0 + 4) / 41);
        field907 = null;
        field903 = null;
    }
}
