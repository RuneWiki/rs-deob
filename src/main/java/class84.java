import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class84 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lpd;")
    private static class94 field2116 = class28.method249(-62, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lpd;")
    public static class94 field2120 = class28.method249(60, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lpd;")
    public static class94 field2118 = class28.method249(92, "::clientdrop");

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lpd;")
    public static class94 field2125 = field2116;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lpd;")
    private static class94 field2126 = class28.method249(-51, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lpd;")
    public static class94 field2124 = field2126;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpd;Lpd;Ls;I)[Lad;", line = 23)
    public static final class5[] method613(class94 arg0, class94 arg1, class111 arg2, int arg3) {
        field2123++;
        int var4 = arg2.method815(arg1, (byte) 109);
        if (arg3 != -26288) {
            method613(null, null, null, -69);
        }
        int var5 = arg2.method828(arg0, false, var4);
        return class67.method501(32767, var5, var4, arg2);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 38)
    public static void method614(int arg0) {
        field2120 = null;
        field2116 = null;
        if (arg0 != 0) {
            field2120 = null;
        }
        field2126 = null;
        field2118 = null;
        field2124 = null;
        field2125 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 82)
    public static final void method615(int arg0) {
        field2117++;
        if (arg0 != 0) {
            method614(-73);
        }
        if (class100.field2526 != null) {
            class13 var1 = class100.field2526;
            synchronized (class100.field2526) {
                class100.field2526 = null;
            }
        }
    }
}
