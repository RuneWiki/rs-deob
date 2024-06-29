import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class334 {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lvn;")
    public static class169 field4906 = new class169();

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[I")
    public static int[] field4916 = new int[100];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBIII)V")
    public static final void method2144(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class262.field3646; var5++) {
            Rectangle var6 = class281.field3941[var5];
            if (var6.x + var6.width > arg2 && var6.x < (arg2 + arg4) && arg0 < var6.y + var6.height && var6.y < arg0 + arg3) {
                class266.field3723[var5] = true;
            }
        }
        if (arg1 != -64) {
            field4915 = 82;
        }
        field4910++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V")
    public static final void method2145(boolean arg0, byte arg1) {
        field4909++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class98.field1109;
        } else {
            var2 = 4;
            var3 = class239.field3252;
        }
        if (arg1 != 53) {
            method2150(-43);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class58.method365(-26586);
            for (int var5 = 0; var5 < (class279.field3935 >> 3); var5++) {
                for (int var6 = 0; var6 < (class164.field2287 >> 3); var6++) {
                    int var7 = class311.field4449[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x33D704C) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFC2DA) >> 14;
                            int var11 = (var7 & 0x3FF8) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class71.field805.length; var13++) {
                                if (class71.field805[var13] == var12 && var3[var13] != null) {
                                    class364.method2309((var11 & 0x7) * 8, var5 * 8, var8, class218.field2991, (var10 & 0x7) * 8, var9, var6 * 8, var3[var13], var4, class54.field613, arg0, 7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lqa;")
    public static final class134 method2146(int arg0, int arg1) {
        field4907++;
        class134 var2 = (class134) class319.field4528.method2049(-59, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field1073.method361(1, 90, arg0);
        class134 var4 = new class134();
        var4.field1865 = arg0;
        if (var3 != null) {
            var4.method803(new class211(var3), -97);
        }
        var4.method800(8);
        if (var4.field1863 == 2 && class147.field2061.method1204((byte) -65, (long) arg0) == null) {
            class147.field2061.method1202(-1, (long) arg0, new class193(class247.field3358));
            class102.field1154[class247.field3358++] = var4;
        }
        class319.field4528.method2046((long) arg0, arg1 ^ arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2147(String arg0, int arg1) {
        class100.field1130 = arg0;
        field4908++;
        if (class323.field4554.field5559 == null) {
            return;
        }
        try {
            String var2 = class323.field4554.field5559.getParameter("cookieprefix");
            String var3 = class323.field4554.field5559.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1 == ~arg0.length()) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class113.method624(class203.method1299((byte) 5) + 94608000000L, false) + "; Max-Age=" + 94608000L;
            }
            class250.method1568(class323.field4554.field5559, (byte) 14, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method2148(int arg0) {
        field4906 = null;
        field4916 = null;
        if (arg0 != -1955814472) {
            field4906 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILsa;)Ljq;")
    public static final class299 method2149(int arg0, int arg1, class113 arg2) {
        if (arg1 != 0) {
            return null;
        }
        field4904++;
        class299 var3;
        if (class418.field6006 == null) {
            var3 = new class299();
        } else {
            var3 = class418.field6006;
            class418.field6006 = class418.field6006.field4263;
            var3.field4263 = null;
            class92.field1017--;
        }
        var3.field4261 = arg2;
        var3.field4259 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z")
    public static final boolean method2150(int arg0) {
        int var1 = 82 % ((-arg0 - 59) / 41);
        field4914++;
        if (class220.field3019) {
            try {
                class250.method1569("showVideoAd", class323.field4554.field5559, 18050);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Len;Lra;BLra;)V")
    public static final void method2151(class174 arg0, class57 arg1, byte arg2, class57 arg3) {
        int var4 = 2 % ((-arg2 - 13) / 41);
        class324.field4570 = class302.method1906(arg3, 15163, 0, class417.field5990);
        field4905++;
        class105.field1192 = arg0.method966(class324.field4570, class145.method865(arg1, class417.field5990, 0), true);
        class1.field1 = class302.method1906(arg3, 15163, 0, class242.field3277);
        class2.field20 = arg0.method966(class1.field1, class145.method865(arg1, class242.field3277, 0), true);
        class268.field3775 = class302.method1906(arg3, 15163, 0, class166.field2331);
        class287.field4059 = arg0.method966(class268.field3775, class145.method865(arg1, class166.field2331, 0), true);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public static final void method2152(int arg0) {
        class376.field5517 = null;
        field4911++;
        class233.method1485(0, -3141, 0, class424.field6086, -1, 0, class222.field3039, 0, class38.field389);
        if (class376.field5517 != null) {
            class171.method1137(class38.field389, class382.field5600.field1590, class434.field6362, 0, 0, 0, class376.field5517, -1412584499, class222.field3039, class27.field261);
            class376.field5517 = null;
        }
        if (arg0 > -98) {
            field4915 = -96;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)Lsq;")
    public static final class97 method2153(int arg0, int arg1) {
        field4913++;
        class97 var2 = (class97) class175.field2435.method2049(-72, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class327.field4667.method361(34, 58, arg1);
        class97 var4 = new class97();
        if (arg0 != 100) {
            method2145(false, (byte) 80);
        }
        if (var3 != null) {
            var4.method523(new class211(var3), arg1, 0);
        }
        class175.field2435.method2046((long) arg1, 0, var4);
        return var4;
    }
}
