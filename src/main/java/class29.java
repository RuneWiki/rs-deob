import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class29 {

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lck;")
    public static class119 field419 = class298.method1987((byte) 62, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lck;")
    public static class119 field418 = class298.method1987((byte) 86, "mx");

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Z")
    public static boolean field417 = true;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lvc;")
    public class293 field414;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lve;")
    public class33 field413;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lva;")
    public static class36 field416;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLck;)V", line = 20)
    public static final void method224(byte arg0, class119 arg1) {
        field415++;
        class154 var2 = class49.method369(arg1, false);
        if (var2 == null) {
            return;
        }
        class19.field242 = var2.field2455 - class142.field2263;
        class11.field195 = class221.field3552 + class258.field4137 - var2.field2453;
        int var3 = class19.field242 - (int) ((double) class187.field2942.field2180 / class285.field4707);
        int var4 = (int) ((double) class187.field2942.field2180 / class285.field4707) + class19.field242;
        if (var3 < 0) {
            class19.field242 = (int) ((double) class187.field2942.field2180 / class285.field4707);
        }
        if (var4 > class126.field1938) {
            class19.field242 = class126.field1938 - ((int) ((double) class187.field2942.field2180 / class285.field4707));
        }
        if (arg0 >= -57) {
            return;
        }
        int var5 = class11.field195 - ((int) ((double) class187.field2942.field2057 / class285.field4707));
        int var6 = (int) ((double) class187.field2942.field2057 / class285.field4707) + class11.field195;
        if (var5 < 0) {
            class11.field195 = (int) ((double) class187.field2942.field2057 / class285.field4707);
        }
        if (var6 > class258.field4137) {
            class11.field195 = class258.field4137 - ((int) ((double) class187.field2942.field2057 / class285.field4707));
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILva;BI)Lve;", line = 64)
    public static final class33 method225(int arg0, class36 arg1, byte arg2, int arg3) {
        field420++;
        if (arg2 > -96) {
            return (class33) null;
        } else if (class56.method414(arg0, arg1, false, arg3)) {
            return class166.method1048((byte) -126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 83)
    public static void method226(int arg0) {
        field419 = null;
        field418 = null;
        if (arg0 > -112) {
            field418 = (class119) null;
        }
        field416 = null;
    }
}
