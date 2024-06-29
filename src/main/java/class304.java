import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class304 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4886 = "M";

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field4892 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Ltd;")
    public static class74 field4889;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JI)V")
    public static final void method2036(long arg0, int arg1) {
        field4890++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg1 != 1) {
            return;
        }
        while (var3 < class181.field2843) {
            if (class238.field3762[var3] == arg0) {
                class20.field281++;
                class181.field2843--;
                for (int var4 = var3; var4 < class181.field2843; var4++) {
                    class64.field1015[var4] = class64.field1015[var4 + 1];
                    class143.field2139[var4] = class143.field2139[var4 + 1];
                    class241.field3873[var4] = class241.field3873[var4 + 1];
                    class238.field3762[var4] = class238.field3762[var4 + 1];
                    class157.field2353[var4] = class157.field2353[var4 + 1];
                    class253.field4049[var4] = class253.field4049[var4 + 1];
                }
                class178.field2737 = class216.field3305;
                class240.field3826.method1762(233, true);
                class240.field3826.method313(-6968, arg0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static final void method2037(byte arg0) {
        field4888++;
        if (arg0 > -41) {
            method2039((String) null, -91, ';');
        }
        class19.field265.method1169(true);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2038(int arg0, int arg1, String arg2) {
        field4891++;
        if (arg0 != 1) {
            method2037((byte) 0);
        }
        class69 var3 = class255.method1723((byte) 32, arg1, 3);
        var3.method556((byte) -110);
        var3.field1099 = arg2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method2039(String arg0, int arg1, char arg2) {
        int var3 = 0;
        int var4 = arg0.length();
        field4887++;
        for (int var5 = arg1; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
    public static void method2040(byte arg0) {
        field4889 = null;
        field4886 = null;
        int var1 = 56 / ((arg0 + 18) / 61);
    }
}
