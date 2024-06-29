import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class388 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lci;")
    public static class320 field5515;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[Z")
    public static boolean[] field5517;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 4)
    public static void method2344(int arg0) {
        field5515 = null;
        field5517 = null;
        if (arg0 >= -14) {
            method2348(null, 90);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IC)Z", line = 16)
    public static final boolean method2345(int arg0, char arg1) {
        field5518++;
        if (arg0 > -5) {
            method2346(null, -22);
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 27)
    public static final int method2346(String arg0, int arg1) {
        field5519++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            var3 = (var3 << 5) + class297.method1912(arg0.charAt(var4), arg1 ^ 0xFFFFE1DA) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lib;", line = 59)
    public static final class108 method2347(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        return var3 == null || var3.field2756 == null ? null : var3.field2756;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Liu;I)I", line = 68)
    public static final int method2348(class415 arg0, int arg1) {
        field5516++;
        int var2 = arg0.method2487(2, -23);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2487(5, -117);
        } else if (var2 == 2) {
            var3 = arg0.method2487(8, -95);
        } else {
            var3 = arg0.method2487(11, -35);
        }
        if (arg1 >= -51) {
            field5517 = null;
        }
        return var3;
    }
}
