import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class278 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field4228 = 0;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4229 = "glow3:";

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[I")
    public static int[] field4234 = new int[2048];

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Z")
    public static boolean field4236 = false;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public static int[] field4227;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[[B")
    public static byte[][] field4233;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[[Lf;")
    public static class329[][] field4231;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lpd;", line = 5)
    public static final class106 method1938(int arg0, int arg1) {
        class106 var2 = (class106) class323.field4870.method1674(0, (long) arg1);
        if (arg0 >= -118) {
            field4227 = (int[]) null;
        }
        field4230++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class200.field2992.method1441(arg1 & 0x7FFF, (byte) -44, 0);
        } else {
            var3 = class116.field1766.method1441(arg1, (byte) -44, 0);
        }
        class106 var4 = new class106();
        if (var3 != null) {
            var4.method748(false, new class263(var3));
        }
        if (arg1 >= 32768) {
            var4.method751(92);
        }
        class323.field4870.method1672(-128, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 44)
    public static void method1940(byte arg0) {
        field4231 = (class329[][]) null;
        field4234 = null;
        field4227 = null;
        field4229 = null;
        int var1 = -57 % ((arg0 - 12) / 37);
        field4233 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)Z", line = 57)
    public static final boolean method1941(byte arg0) {
        if (arg0 != -58) {
            field4236 = false;
        }
        field4232++;
        try {
            return class114.method785(8);
        } catch (IOException var5) {
            class154.method1101(arg0 + 58);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class217.field3289 + "," + class92.field1379 + "," + class318.field4790 + " - " + class3.field13 + "," + (class114.field1750.field1541[0] + class217.field3309) + "," + (class189.field2807 + class114.field1750.field1516[0]) + " - ";
            for (int var4 = 0; var4 < class3.field13 && var4 < 50; var4++) {
                var3 = var3 + class207.field3137.field3986[var4] + ",";
            }
            class19.method122(var6, var3, (byte) -100);
            class11.method57(arg0 ^ 0xFFFFFFC6);
            return true;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/String;)V", line = 86)
    public static final void method1942(byte arg0, String arg1) {
        field4235++;
        class171.field2569 = arg1;
        if (class274.field4200.field3963 == null) {
            return;
        }
        try {
            if (arg0 != -87) {
                method1938(80, -62);
            }
            String var2 = class274.field4200.field3963.getParameter("cookieprefix");
            String var3 = class274.field4200.field3963.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class115.method792(class231.method1594(-20375) + 94608000000L, (byte) -26) + "; Max-Age=" + 94608000L;
            }
            class25.method167(class274.field4200.field3963, -11088, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V", line = 122)
    public static final void method1944(int arg0, int arg1, int arg2) {
        class126.field1976 = true;
        class172.field2578 = arg0;
        class42.field506 = arg1;
        class76.field996 = arg2;
        class41.field495 = -1;
        class190.field2826 = -1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1939(int arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BB)V")
    public abstract void method1943(byte[] arg0, byte arg1);
}
