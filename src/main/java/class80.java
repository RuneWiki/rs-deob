import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class80 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1265 = -1;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1267 = "slide:";

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "[I")
    public static int[] field1270 = new int[100];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lfn;")
    public static class300 field1266;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 14)
    public static void method576(boolean arg0) {
        field1267 = null;
        field1270 = null;
        field1266 = null;
        if (!arg0) {
            field1265 = -85;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 26)
    public static final void method577(int arg0, int arg1, int arg2) {
        if (class105.field1630 != arg2) {
            class90.field1437 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class90.field1437[var3] = (var3 << 12) / arg2;
            }
            class105.field1630 = arg2;
            class327.field5094 = arg2 * 32;
            class244.field3906 = arg2 - 1;
        }
        if (class75.field1213 != arg0) {
            if (class105.field1630 == arg0) {
                class280.field4316 = class90.field1437;
            } else {
                class280.field4316 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class280.field4316[var4] = (var4 << 12) / arg0;
                }
            }
            class75.field1213 = arg0;
            class227.field3597 = arg0 - 1;
        }
        field1264++;
        if (arg1 != 0) {
            field1265 = 40;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 76)
    public static final int method578(int arg0, int arg1) {
        if (arg1 != -5755) {
            field1266 = (class300) null;
        }
        field1271++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 91)
    public static final int method579(String arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field1266 = (class300) null;
        }
        field1268++;
        return class76.method556(arg0, true, arg1, 29695);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 103)
    public static final void method580(String arg0, int arg1) {
        class120.field1827 = arg0;
        field1269++;
        if (class32.field471.field2721 == null) {
            return;
        }
        try {
            String var2 = class32.field471.field2721.getParameter("cookieprefix");
            String var3 = class32.field471.field2721.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1 == ~arg0.length()) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class71.method538((byte) -64, class102.method743((byte) 101) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class3.method17(class32.field471.field2721, (byte) -33, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }
}
