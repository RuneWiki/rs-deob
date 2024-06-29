import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class658 {

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "Ljava/lang/String;")
    public String field9173;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "Ljava/lang/String;")
    public String field9172;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "Ljava/lang/String;")
    public String field9168;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Lra;")
    public static class361 field9174 = new class361(58, -1);

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "Lki;")
    public static class364 field9176 = new class364();

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
    public static final void method3616(int arg0) {
        class359.field4655 = new class647(8);
        int var1 = 27 % ((49 - arg0) / 55);
        field9170++;
        class385.field4919 = 0;
        for (class231 var2 = (class231) class666.field9241.method2101(260); var2 != null; var2 = (class231) class666.field9241.method2098((byte) 57)) {
            var2.method1459();
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIZI)V")
    public static final void method3617(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9169++;
        class686.field9406 = 0L;
        int var5 = class62.method528(2);
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (arg4 == 11015) {
            if (!class520.field6799.method380()) {
                arg3 = true;
            }
            class54.method465(arg2, arg0, var5, arg1, arg4 ^ 0x5A7A72AE, arg3);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V")
    public static void method3618(byte arg0) {
        field9174 = null;
        field9176 = null;
        if (arg0 != -67) {
            field9176 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
    public static final void method3619(int arg0) {
        field9171++;
        class287.field3710.method3658(0);
        if (arg0 != -3031) {
            method3620(-51, null);
        }
        class152.field1941.method3658(0);
        class202.field2628.method3658(0);
        class559.field7285.method3658(0);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILfd;)Lkp;")
    public static final class386 method3620(int arg0, class418 arg1) {
        if (arg0 > -26) {
            field9176 = null;
        }
        field9167++;
        return new class386(arg1.method2383(65280), arg1.method2383(65280), arg1.method2383(65280), arg1.method2383(65280), arg1.method2383(65280), arg1.method2383(65280), arg1.method2383(65280), arg1.method2383(65280), arg1.method2364(-87), arg1.method2396(-105));
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class658(String arg0, String arg1, String arg2) {
        this.field9173 = arg2;
        this.field9172 = arg1;
        this.field9168 = arg0;
    }
}
