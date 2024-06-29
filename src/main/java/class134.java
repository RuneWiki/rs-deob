import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class134 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
    public static int[] field2138 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
    public static int[] field2145 = new int[8];

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Z")
    public static boolean field2141 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 4)
    public static final void method983(int arg0, int arg1) {
        if (arg1 != 0) {
            method984((class133) null, false, (class133) null);
        }
        class227.field3596.method2175(arg0, arg1 ^ 0xAC7A9367);
        field2144++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ll;ZLl;)V", line = 27)
    public static final void method984(class133 arg0, boolean arg1, class133 arg2) {
        class112.field1736 = class120.method879(arg0, arg2, class61.field990, 12803, 0);
        if (!arg1) {
            field2142 = 2;
        }
        if (class94.field1516) {
            class336.field5262 = class195.method1388(arg2, class61.field990, arg0, 0, 255);
        } else {
            class336.field5262 = (class124) class112.field1736;
        }
        field2139++;
        class233.field3723 = class120.method879(arg0, arg2, class11.field170, 12803, 0);
        class344.field5343 = class120.method879(arg0, arg2, class105.field1627, 12803, 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 45)
    public static final String method985(String arg0, byte arg1) {
        field2136++;
        String var2 = class53.method444(arg1 + 107, class128.method926(arg0, (byte) -54));
        if (var2 == null) {
            var2 = "";
        }
        if (arg1 != -106) {
            field2142 = 54;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V", line = 62)
    public static final void method986(int arg0, int arg1) {
        class219.field3337.method2175(arg1, -1401253017);
        if (arg0 != 1930950248) {
            method983(-83, -104);
        }
        field2140++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 81)
    public static void method987(boolean arg0) {
        field2138 = null;
        if (arg0) {
            field2145 = null;
        }
    }
}
