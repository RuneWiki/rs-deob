import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class110 {

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lc;")
    public static class331 field1865 = new class331();

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[J")
    public static long[] field1868 = new long[500];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 6)
    public static final void method953(String arg0, int arg1) {
        class256.field4125 = arg0;
        field1864++;
        if (class85.field1369.field910 == null) {
            return;
        }
        try {
            String var2 = class85.field1369.field910.getParameter("cookieprefix");
            String var3 = class85.field1369.field910.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (~arg0.length() == arg1) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class79.method724((byte) 119, class306.method2102(-289) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class251.method1756(true, "document.cookie=\"" + var5 + "\"", class85.field1369.field910);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 39)
    public static void method954(int arg0) {
        field1865 = null;
        if (arg0 < -124) {
            field1868 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 68)
    public static final void method955(int arg0) {
        field1866++;
        if (class74.field1223) {
            return;
        }
        if (class38.field572) {
            class83.field1331 = (float) ((int) class83.field1331 + 191 & 0xFFFFFF80);
        } else {
            class131.field2257 += (24.0F - class131.field2257) / 2.0F;
        }
        if (arg0 != -128) {
            field1867 = 69;
        }
        class74.field1223 = true;
        class247.field4003 = true;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lgh;", line = 103)
    public static final class250 method956(int arg0) {
        field1861++;
        if (arg0 >= -112) {
            return (class250) null;
        }
        class250 var1;
        if (class43.field680) {
            var1 = new class232(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], class191.field3205[0], class40.field600);
        } else {
            var1 = new class217(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], class191.field3205[0], class40.field600);
        }
        class15.method151(0);
        return var1;
    }
}
