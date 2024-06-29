import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class358 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5688 = "Allocated memory";

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[I")
    public static int[] field5695 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Llj;")
    public static class59 field5694 = new class59(64);

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field5700 = 500;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
    public static boolean field5697 = true;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Z")
    public static boolean field5702 = false;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[I")
    public static int[] field5701 = new int[64];

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lea;")
    private class227 field5689;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lr;")
    private class301 field5686;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ldj;")
    public static class361 field5698;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Z")
    public static boolean field5687;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method2529(int arg0, int arg1) {
        field5693++;
        class191 var2 = class303.method2166(99, arg0);
        if (var2 == null) {
            return false;
        } else if (class157.field2662 == 1 || class157.field2662 == 2 || class39.field848 == 2) {
            class68.field1262 = var2.field3237;
            class199.field3348 = var2.field3235;
            if (class39.field848 != 0) {
                class160.field2714 = class68.field1262 + 50000;
                class65.field1239 = class68.field1262 + 40000;
                class177.field2934 = class65.field1239;
            }
            return true;
        } else {
            String var3 = "";
            if (~class39.field848 != arg1) {
                var3 = ":" + (var2.field3237 + 7000);
            }
            String var4 = "";
            if (class200.field3359 != null) {
                var4 = "/p=" + class200.field3359;
            }
            String var5 = "http://" + var2.field3235 + var3 + "/l=" + class86.field1497 + "/a=" + class363.field5745 + var4 + "/j" + (class216.field3604 ? "1" : "0") + ",o" + (class359.field5724 ? "1" : "0") + ",a2,m" + (class295.field4812 ? "1" : "0");
            try {
                class111.field2036.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;JISZLjava/lang/String;II)V", line = 59)
    public static final void method2530(String arg0, long arg1, int arg2, short arg3, boolean arg4, String arg5, int arg6, int arg7) {
        field5692++;
        if (class5.field87) {
            return;
        }
        if (arg4) {
            method2529(51, -101);
        }
        if (class137.field2343 >= 500) {
            return;
        }
        class317.field5173[class137.field2343] = arg5;
        class300.field4889[class137.field2343] = arg0;
        class73.field1327[class137.field2343] = arg7 == -1 ? class229.field3756 : arg7;
        class107.field1938[class137.field2343] = arg3;
        class177.field2926[class137.field2343] = arg1;
        class206.field3450[class137.field2343] = arg6;
        class317.field5172[class137.field2343] = arg2;
        class137.field2343++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 85)
    public static void method2531(int arg0) {
        field5688 = null;
        field5701 = null;
        field5694 = null;
        field5695 = null;
        if (arg0 != -1354) {
            method2529(-118, -118);
        }
        field5698 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Lr;", line = 106)
    public final class301 method2532(byte arg0) {
        field5696++;
        if (arg0 != 8) {
            method2529(63, 74);
        }
        class301 var2 = this.field5686;
        if (this.field5689.field3741 == var2) {
            this.field5686 = null;
            return null;
        } else {
            this.field5686 = var2.field4901;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lr;", line = 127)
    public final class301 method2533(int arg0) {
        field5690++;
        int var2 = -86 / ((35 - arg0) / 50);
        class301 var3 = this.field5689.field3741.field4901;
        if (this.field5689.field3741 == var3) {
            this.field5686 = null;
            return null;
        } else {
            this.field5686 = var3.field4901;
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILea;)V", line = 163)
    public final void method2534(int arg0, class227 arg1) {
        if (arg0 != 1) {
            this.field5686 = (class301) null;
        }
        this.field5689 = arg1;
        field5691++;
    }
}
