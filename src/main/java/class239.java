import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class239 {

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "Lkea;")
    public static class239 field3488 = new class239();

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "Lkea;")
    public static class239 field3490 = new class239();

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "Lkea;")
    public static class239 field3491 = new class239();

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "Lkea;")
    public static class239 field3492 = new class239();

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "Lpn;")
    public static class742 field3494 = new class742();

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1661(int arg0, int arg1) {
        field3486++;
        class445.field6323 = arg0;
        class112 var2 = class491.field6800;
        synchronized (class491.field6800) {
            if (arg1 != 1226) {
                field3494 = null;
            }
            class491.field6800.method999(0);
        }
        class112 var3 = class477.field6656;
        synchronized (class477.field6656) {
            class477.field6656.method999(0);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lvl;Lvl;I)V", line = 22)
    public static final void method1662(class13 arg0, class13 arg1, int arg2) {
        if (arg1.field238 != null) {
            arg1.method115(true);
        }
        field3487++;
        arg1.field241 = arg0;
        arg1.field238 = arg0.field238;
        arg1.field238.field241 = arg1;
        arg1.field241.field238 = arg1;
        if (arg2 != -1) {
            field3492 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 44)
    public static void method1663(int arg0) {
        field3491 = null;
        if (arg0 != 13569) {
            field3492 = null;
        }
        field3490 = null;
        field3488 = null;
        field3492 = null;
        field3494 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIB)Z", line = 58)
    public static final boolean method1664(int arg0, int arg1, byte arg2) {
        field3489++;
        return arg2 >= -66 ? true : class32.method438(113, arg1, arg0) & class444.method2668(arg0, arg1, -29);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)Z", line = 69)
    public static final boolean method1665(int arg0, int arg1, int arg2) {
        field3484++;
        if (arg2 != 393216) {
            method1664(25, 30, (byte) -113);
        }
        return class32.method438(124, arg1, arg0) | (arg0 & 0x60000) != 0 || class418.method2576(arg0, 90, arg1) || method1664(arg0, arg1, (byte) -120);
    }

    @OriginalMember(owner = "client!kea", name = "toString", descriptor = "()Ljava/lang/String;", line = 82)
    public final String toString() {
        field3485++;
        throw new IllegalStateException();
    }
}
