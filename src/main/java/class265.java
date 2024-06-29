import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class265 implements Runnable {

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[Lcn;")
    public volatile class267[] field3965 = new class267[2];

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
    public volatile boolean field3964 = false;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Z")
    public volatile boolean field3957 = false;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3958 = "wave2:";

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3960 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Lna;")
    public class26 field3956;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZ)I", line = 8)
    public static final int method1830(int arg0, int arg1, boolean arg2) {
        field3966++;
        if (arg2) {
            return 1;
        }
        class278 var3 = (class278) class171.field2547.method203(1710, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field4274.length > arg1) {
            return var3.field4274[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZILek;)V", line = 31)
    public static final void method1831(int arg0, boolean arg1, int arg2, class184 arg3) {
        field3954++;
        if (arg1 || class6.field62 < 2 && class327.field5077 == 0 && !class81.field1136) {
            return;
        }
        String var4 = class99.method774((byte) 61);
        if (arg3 == null) {
            int var5 = class64.field956.method430(var4, arg2 + 4, arg0 + 15, 16777215, 0, class3.field7, class159.field2373);
            class141.method1064(var5 + class64.field956.method426(var4), arg2 + 4, arg0, 15, (byte) 105);
            return;
        }
        class48 var6 = arg3.method1333((byte) -112, class255.field3810);
        if (var6 == null) {
            var6 = class64.field956;
        }
        var6.method440(var4, arg2, arg0, arg3.field2890, arg3.field2904, arg3.field2942, arg3.field2829, arg3.field2952, arg3.field2920, class3.field7, class159.field2373, class204.field3247);
        class141.method1064(class204.field3247[2], class204.field3247[0], class204.field3247[1], class204.field3247[3], (byte) 105);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 67)
    public static void method1832(boolean arg0) {
        field3958 = null;
        if (arg0) {
            field3958 = (String) null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 78)
    public static final void method1833(String arg0, int arg1) {
        field3963++;
        class287.field4426 = arg0;
        if (class301.field4715.field285 == null) {
            return;
        }
        try {
            String var2 = class301.field4715.field285.getParameter("cookieprefix");
            String var3 = class301.field4715.field285.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class124.method945(false, class234.method1650((byte) -114) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class226.method1608(false, "document.cookie=\"" + var5 + "\"", class301.field4715.field285);
        } catch (Throwable var8) {
        }
        int var7 = -43 / ((arg1 + 20) / 49);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIZ)V", line = 116)
    public static final void method1834(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class3.field11 == 1) {
            class200.field3163[class113.field1783 / 100].method186(class128.field2027 - 8, class99.field1462 + -8);
        }
        if (!arg4) {
            return;
        }
        field3961++;
        if (class3.field11 == 2) {
            class200.field3163[class113.field1783 / 100 + 4].method186(class128.field2027 - 8, class99.field1462 + -8);
        }
        class203.method1465(arg4);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 145)
    public static final void method1835(int arg0) {
        class271.field4096 = null;
        class111.field1756 = null;
        class57.field843 = null;
        if (arg0 == 10) {
            class101.field1541 = null;
            class274.field4162 = (byte[][]) null;
            class323.field5027 = null;
            field3959++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "run", descriptor = "()V", line = 162)
    public final void run() {
        this.field3957 = true;
        try {
            while (!this.field3964) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class267 var2 = this.field3965[var1];
                    if (var2 != null) {
                        var2.method1855((byte) 77);
                    }
                }
                class97.method768(10L, 61);
                class308.method2133((Object) null, true, this.field3956);
            }
        } catch (Exception var7) {
            class50.method464((byte) 45, (String) null, var7);
        } finally {
            this.field3957 = false;
        }
        field3962++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILhb;Ljava/lang/String;)I", line = 195)
    public static final int method1836(int arg0, class35 arg1, String arg2) {
        if (arg0 >= -86) {
            field3958 = (String) null;
        }
        field3955++;
        int var3 = arg1.field455;
        byte[] var4 = class252.method1756(-124, arg2);
        arg1.method301(var4.length, (byte) 64);
        arg1.field455 += class268.field4027.method2166(var4, arg1.field455, var4.length, -13861, arg1.field437, 0);
        return arg1.field455 - var3;
    }
}
