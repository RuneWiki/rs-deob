import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class6 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Z")
    public static boolean field57 = false;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field56 = 2301979;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    public static int[] field55 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Llc;")
    public static class270 field58;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILlc;I)Laf;")
    public static final class176 method30(byte arg0, int arg1, class270 arg2, int arg3) {
        field62++;
        if (arg0 == 80) {
            return class144.method1079(arg1, arg2, arg3, (byte) 59) ? class74.method554(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method31(int arg0) {
        field54++;
        class238 var1 = class199.field2924;
        synchronized (class199.field2924) {
            class79.field1274 = class225.field3312;
            class181.field2723++;
            class204.field3017 = class114.field1896;
            class44.field584 = class217.field3171;
            class56.field818 = class306.field4938;
            class17.field187 = class82.field1322;
            class13.field153 = class21.field231;
            class111.field1853 = class261.field4032;
            class306.field4938 = arg0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Loa;I)V")
    public static final void method32(class293 arg0, int arg1) {
        long var2 = 0L;
        field60++;
        if (arg0.field4667 == 0) {
            var2 = class205.method1455(arg0.field4670, arg0.field4655, arg0.field4663);
        }
        if (arg0.field4667 == 1) {
            var2 = class210.method1481(arg0.field4670, arg0.field4655, arg0.field4663);
        }
        if (arg0.field4667 == 2) {
            var2 = class238.method1637(arg0.field4670, arg0.field4655, arg0.field4663);
        }
        int var4 = -1;
        int var5 = 0;
        if (arg0.field4667 == 3) {
            var2 = class91.method678(arg0.field4670, arg0.field4655, arg0.field4663);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7DF45) >> 14;
            var6 = ((int) var2 & 0x3CAD2A) >> 20;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field4652 = var4;
        arg0.field4654 = var6;
        arg0.field4657 = var5;
        if (arg1 != -5678) {
            method34((byte) 51);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method33(byte arg0, String arg1) {
        field61++;
        class220.field3205 = arg1;
        if (arg0 != -124 || class273.field4426.field2020 == null) {
            return;
        }
        try {
            String var2 = class273.field4426.field2020.getParameter("cookieprefix");
            String var3 = class273.field4426.field2020.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class29.method183(1, class3.method14(29853) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class150.method1119(class273.field4426.field2020, (byte) -78, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static void method34(byte arg0) {
        field58 = null;
        field55 = null;
        if (arg0 != 16) {
            method32((class293) null, -104);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public static final void method35(int arg0) {
        field59++;
        if (arg0 > -70) {
            return;
        }
        if (class267.field4272 > 0) {
            class115.method861(0);
        } else {
            class220.field3213 = class281.field4537;
            class281.field4537 = null;
            class79.method586(-1, 40);
        }
    }
}
