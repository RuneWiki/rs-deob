import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class159 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    private int field2918 = 0;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lnc;")
    private class85 field2923;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lid;")
    public static class149 field2927 = null;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljf;")
    private class64 field2929;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static final void method1144(boolean arg0) {
        field2924++;
        for (int var1 = -1; var1 < class253.field4432; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class251.field4407[var1];
            }
            class127 var6 = class107.field1851[var5];
            if (var6 != null && var6.field2387 > 0) {
                var6.field2387--;
                if (var6.field2387 == 0) {
                    var6.field2337 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class182.field3281; var2++) {
            int var3 = class110.field1906[var2];
            class20 var4 = class38.field572[var3];
            if (var4 != null && var4.field2387 > 0) {
                var4.field2387--;
                if (var4.field2387 == 0) {
                    var4.field2337 = null;
                }
            }
        }
        if (arg0) {
            method1145((String) null, (String) null, (String) null, 29);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1145(String arg0, String arg1, String arg2, int arg3) {
        field2922++;
        if (arg3 >= -83) {
            return null;
        } else {
            for (int var4 = arg2.indexOf(arg1); var4 != -1; var4 = arg2.indexOf(arg1, arg0.length() + var4)) {
                arg2 = arg2.substring(0, var4) + arg0 + arg2.substring(arg1.length() + var4);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Ljf;")
    public final class64 method1146(int arg0) {
        field2917++;
        if (this.field2918 > 0 && this.field2923.field1554[this.field2918 - 1] != this.field2929) {
            class64 var2 = this.field2929;
            this.field2929 = var2.field1144;
            return var2;
        }
        while (this.field2923.field1545 > this.field2918) {
            class64 var3 = this.field2923.field1554[this.field2918++].field1144;
            if (this.field2923.field1554[this.field2918 - 1] != var3) {
                this.field2929 = var3.field1144;
                return var3;
            }
        }
        if (arg0 != 15035) {
            field2921 = 52;
        }
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static final void method1147(byte arg0) {
        class138.field2520.method1290((byte) -92);
        if (arg0 > 74) {
            field2928++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
    public static void method1148(boolean arg0) {
        if (!arg0) {
            field2927 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Ljf;")
    public final class64 method1149(int arg0) {
        this.field2918 = 0;
        field2919++;
        if (arg0 != -1) {
            this.method1149(32);
        }
        return this.method1146(arg0 ^ 0xFFFFC544);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lnc;)V")
    public class159(class85 arg0) {
        this.field2923 = arg0;
    }
}
