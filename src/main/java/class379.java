import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class379 extends class108 {

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
    private int field5301;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "Z")
    private boolean field5306;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
    private int field5296;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
    private int field5304;

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
    private int field5299;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
    private int field5308;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "Z")
    private boolean field5303;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "[I")
    public static int[] field5297;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIII)V")
    public static final void method2307(int arg0, int arg1, int arg2, int arg3) {
        class272.field3457.method3071(-83, arg1);
        field5300++;
        class272.field3457.method3042(arg3, arg2 - 48);
        if (arg2 != 3) {
            field5297 = null;
        }
        class272.field3457.method3082(arg0, 128);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2308(int arg0, String arg1) {
        class418.field5715 = arg1;
        field5310++;
        if (class31.field488.field3644 == null) {
            return;
        }
        try {
            String var2 = class31.field488.field3644.getParameter("cookieprefix");
            String var3 = class31.field488.field3644.getParameter("cookiehost");
            int var4 = 53 % ((-arg0 - 11) / 58);
            String var5 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var6;
            if (arg1.length() == 0) {
                var6 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var6 = var5 + "; Expires=" + class227.method1440(class348.method2175(-122) + 94608000000L, -28715) + "; Max-Age=" + 94608000L;
            }
            class499.method2792("document.cookie=\"" + var6 + "\"", class31.field488.field3644, -6891);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
    public static final void method2309(byte arg0) {
        class552.field7724.method3099(true);
        field5298++;
        class39.field585.method900(true);
        class10.field104.method2706(-1);
        class626.field9084.method1088(-1);
        class579.field8053.method3620(106);
        class98.field1307.method3390(-124);
        class609.field8754.method537((byte) -115);
        class410.field5636.method351((byte) -127);
        class643.field9328.method1290(-25282);
        class642.field9326.method3403((byte) 53);
        class217.field2772.method1469(32);
        class376.field5232.method2482(0);
        class494.field6893.method1541((byte) -20);
        if (arg0 >= -105) {
            return;
        }
        class33.field508.method548(0);
        class132.field1621.method145(57);
        class1.field5.method1479(29);
        class369.field5136.method1067((byte) -75);
        class192.field2492.method1325(false);
        class104.field1365.method640((byte) 114);
        class452.field6400.method689((byte) -128);
        class69.method393((byte) 123);
        class577.method3243((byte) -109);
        class28.method165((byte) -104);
        class452.method2630(8);
        class624.field9027.method317((byte) 21);
        class600.field8677.method317((byte) 21);
        class26.field449.method317((byte) 21);
        class616.field8878.method317((byte) 21);
        class218.field2799.method317((byte) 21);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILge;)V")
    public final void method2310(int arg0, class551 arg1) {
        field5311++;
        arg1.method3060(2, -25098);
        arg1.method3060(this.field5301, -25098);
        arg1.method3060(this.field5306 ? 1 : 0, -25098);
        arg1.method3060(this.field5296, -25098);
        if (arg0 >= -80) {
            this.field5306 = false;
        }
        arg1.method3060(this.field5304, -25098);
        arg1.method3060(this.field5299, -25098);
        arg1.method3060(this.field5308, -25098);
        arg1.method3060(this.field5303 ? 1 : 0, -25098);
        arg1.method3042(this.field5295, 123);
        arg1.method3060(this.field5302, -25098);
        arg1.method3047((byte) -12, this.field5309);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public static void method2311(int arg0) {
        if (arg0 == 31067) {
            field5297 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)V")
    public static final void method2312(int arg0, int arg1, int arg2) {
        field5307++;
        class632 var3 = class641.method3699(-121, arg0, arg2);
        var3.method3656(0);
        var3.field9198 = arg1;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(ZLgaa;)V")
    public class379(boolean arg0, class279 arg1) {
        if (arg0) {
            if (class279.field3649.startsWith("win")) {
                this.field5301 = 1;
            } else if (class279.field3649.startsWith("mac")) {
                this.field5301 = 2;
            } else if (class279.field3649.startsWith("linux")) {
                this.field5301 = 3;
            } else {
                this.field5301 = 4;
            }
            if (class279.field3643.startsWith("amd64") || class279.field3643.startsWith("x86_64")) {
                this.field5306 = true;
            } else {
                this.field5306 = false;
            }
            if (class279.field3645.toLowerCase().indexOf("sun") != -1) {
                this.field5296 = 1;
            } else if (class279.field3645.toLowerCase().indexOf("microsoft") != -1) {
                this.field5296 = 2;
            } else if (class279.field3645.toLowerCase().indexOf("apple") == -1) {
                this.field5296 = 4;
            } else {
                this.field5296 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class279.field3630.length()) {
                    char var5 = class279.field3630.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var15) {
            }
            this.field5304 = var4;
            int var6 = class279.field3630.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class279.field3630.length() > var6) {
                    char var8 = class279.field3630.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + (var8 - 48);
                    var6++;
                }
            } catch (Exception var14) {
            }
            this.field5299 = var7;
            int var9 = class279.field3630.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class279.field3630.length()) {
                    char var11 = class279.field3630.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var13) {
            }
            this.field5295 = class282.field3697;
            if (this.field5304 <= 3) {
                this.field5302 = 0;
            } else {
                this.field5302 = class435.field5919;
            }
            this.field5308 = var10;
            if (class279.field3639 == 3) {
                this.field5303 = true;
            } else {
                this.field5303 = false;
            }
            try {
                this.field5309 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field5309 = 0;
            }
        }
    }
}
