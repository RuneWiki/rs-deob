import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class128 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lsf;")
    public static class108 field2184 = class140.method973(255, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Laj;")
    public static class1 field2182 = new class1();

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lsf;")
    public static class108 field2190 = class140.method973(255, "Texturen geladen)3");

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2191 = 0;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lik;")
    public static class262 field2183;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lik;")
    public static class262 field2189;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method883(byte arg0, int arg1) {
        class269.field4724 = 0;
        class271.field4738 = -1;
        class331.field5655 = -1;
        if (arg0 != 123) {
            field2184 = (class108) null;
        }
        field2186++;
        class223.field3951 = arg1;
        class220.field3913 = false;
        class1.field23 = null;
        class305.field5312 = 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lik;Lik;III)Lvl;", line = 26)
    public static final class80 method884(class262 arg0, class262 arg1, int arg2, int arg3, int arg4) {
        field2185++;
        if (class167.method1166(arg0, arg2, (byte) 119, arg4)) {
            return arg3 == -1 ? class35.method245(85, arg1.method1868(arg3 ^ 0xFFFFD033, arg2, arg4)) : (class80) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 48)
    public static void method885(int arg0) {
        field2182 = null;
        field2184 = null;
        field2183 = null;
        if (arg0 != -1) {
            method884((class262) null, (class262) null, -44, 115, 16);
        }
        field2189 = null;
        field2190 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lik;B)V", line = 69)
    public static final void method886(class262 arg0, byte arg1) {
        if (arg1 == 37) {
            class114.field1953 = arg0;
            field2187++;
        }
    }
}
