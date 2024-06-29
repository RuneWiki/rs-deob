import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class343 extends class116 {

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field5341 = 0;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field5336 = new String[100];

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lee;")
    public static class137 field5337;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lee;")
    public static class137 field5344;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lng;")
    public static class245 field5343;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lic;Z)V", line = 4)
    public static final void method2389(class176 arg0, boolean arg1) {
        if (arg0.field2687 != null) {
            arg0.field2687.field3325 = 0;
        }
        field5339++;
        arg0.field2689 = arg1;
        for (class176 var2 = arg0.method220(); var2 != null; var2 = arg0.method213()) {
            method2389(var2, arg1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V", line = 34)
    public static final void method2390(String arg0, int arg1, boolean arg2, String arg3) {
        field5340++;
        class128.method862(arg3, (String) null, -1, true, arg0, arg1);
        if (arg2) {
            field5343 = (class245) null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 50)
    public static final void method2391(int arg0) {
        if (class79.field1173 != null && class79.field1173.field537 + 64 - (class79.field1173.method271((byte) 109) * 64) >> 7 == class133.field2099 && class79.field1173.field519 - ((class79.field1173.method271((byte) 94) - 1) * 64) >> 7 == class228.field3660) {
            class133.field2099 = 0;
        }
        field5338++;
        for (int var1 = arg0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class200.field3011[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class175.field2678; var3++) {
            class82 var4 = class64.field966[class174.field2645[var3]];
            if (var4 != null) {
                var4.field524 = false;
            }
        }
        for (int var5 = 0; var5 < class155.field2439; var5++) {
            class80 var6 = class208.field3313[class144.field2286[var5]];
            if (var6 != null) {
                var6.field524 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 114)
    public static void method2392(byte arg0) {
        field5337 = null;
        field5344 = null;
        if (arg0 != -11) {
            method2391(-93);
        }
        field5343 = null;
        field5336 = null;
    }
}
