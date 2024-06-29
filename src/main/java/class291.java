import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class291 extends class232 {

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4342 = "Choose Option";

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[[Z")
    public static boolean[][] field4341 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lhi;")
    public static class192 field4344 = new class192();

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lin;")
    public static class344 field4348;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 21)
    public static final boolean method1993(String arg0, byte arg1) {
        field4347++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 <= 15) {
            field4345 = 125;
        }
        for (int var2 = 0; var2 < class44.field535; var2++) {
            if (arg0.equalsIgnoreCase(class207.field2986[var2])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class173.field2356.field3439)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILkm;Lkm;)V", line = 55)
    public static final void method1994(int arg0, class133 arg1, class133 arg2) {
        class143.field1968 = arg1;
        class83.field1203 = arg2;
        if (arg0 != 1) {
            method1994(-13, (class133) null, (class133) null);
        }
        field4340++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 75)
    public static void method1995(int arg0) {
        field4341 = (boolean[][]) null;
        field4348 = null;
        field4344 = null;
        if (arg0 != 10035) {
            field4342 = (String) null;
        }
        field4342 = null;
    }
}
