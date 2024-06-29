import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class162 {

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "J")
    public long field2848 = 0L;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lcd;")
    public static class64 field2841 = class44.method335((byte) 71, "cookieprefix");

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lcd;")
    public static class64 field2847 = class44.method335((byte) 71, "<br>");

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    public static int[] field2844 = new int[4096];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "La;")
    public class262 field2842;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "La;")
    public class262 field2852;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BJ)V", line = 4)
    public static final void method1163(byte arg0, long arg1) {
        field2843++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class202.field3453 < 100 || class141.field2491) || class202.field3453 >= 200) {
            class233.method1670(class151.field2697, class188.field3240, 0, (byte) -117);
            return;
        }
        class64 var3 = class99.method734(true, arg1).method510(-112);
        for (int var4 = 0; var4 < class202.field3453; var4++) {
            if (class47.field776[var4] == arg1) {
                class233.method1670(class104.method768(new class64[] { var3, class17.field354 }, false), class188.field3240, 0, (byte) -125);
                return;
            }
        }
        if (arg0 != 62) {
            method1166(true);
        }
        for (int var5 = 0; var5 < class61.field1194; var5++) {
            if (class173.field2981[var5] == arg1) {
                class233.method1670(class104.method768(new class64[] { class138.field2453, var3, class58.field958 }, false), class188.field3240, 0, (byte) -104);
                return;
            }
        }
        if (var3.method519((byte) 123, class139.field2472.field672)) {
            class233.method1670(class180.field3095, class188.field3240, 0, (byte) -126);
            return;
        }
        class29.field493[class202.field3453] = var3;
        class59.field986++;
        class47.field776[class202.field3453] = arg1;
        class154.field2726[class202.field3453] = 0;
        class183.field3131[class202.field3453] = class188.field3240;
        class255.field4426[class202.field3453] = 0;
        class153.field2707[class202.field3453] = false;
        class202.field3453++;
        class47.field781 = class238.field4039;
        class17.field353.method1214(-22, 168);
        class17.field353.method161((byte) 88, arg1);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I", line = 73)
    public static final int method1164(int arg0, int arg1, int arg2) {
        field2850++;
        class115 var3 = (class115) class17.field351.method1151((long) arg0, 0);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2112.length; var5++) {
                if (var3.field2109[var5] == arg1) {
                    var4 += var3.field2112[var5];
                }
            }
            if (arg2 != -4097) {
                method1164(91, 23, 36);
            }
            return var4;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2844[var0] = class142.method1011(var0, 15700);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBIII)V", line = 122)
    public static final void method1165(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2845++;
        if (arg1 != 104) {
            return;
        }
        if ((arg3 - arg4) >= class290.field4976 && class153.field2714 >= (arg3 + arg4) && (arg0 - arg4) >= class180.field3098 && (arg0 + arg4) <= class201.field3444) {
            class29.method251(arg2, -118, arg4, arg0, arg3);
        } else {
            class202.method1414(arg0, arg4, arg3, arg2, 2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 145)
    public static void method1166(boolean arg0) {
        field2847 = null;
        field2844 = null;
        field2841 = null;
        if (arg0) {
            field2841 = (class64) null;
        }
    }
}
