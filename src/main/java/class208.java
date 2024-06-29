import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class208 {

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lfa;")
    public class238[] field3089;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
    public int[] field3088;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3094 = 0;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3096 = "Loaded fonts";

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3095 = 0;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "J")
    public static long field3090 = 0L;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[I")
    public static int[] field3087;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field3096 = null;
        field3087 = null;
        if (arg0 != 0) {
            method1294((byte) -44, -48, -89);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -2) {
            return;
        }
        if (class261.field4204 <= arg5 && arg4 <= class18.field310 && arg1 >= class271.field4322 && class311.field5001 >= arg3) {
            if (arg2 == 1) {
                class295.method1983(arg5, arg1, arg4, arg6, arg0 + 3, arg3);
            } else {
                class252.method1645(112, arg3, arg4, arg1, arg2, arg6, arg5);
            }
        } else if (arg2 == 1) {
            class111.method711(arg3, arg1, arg6, arg5, arg4, (byte) 34);
        } else {
            class306.method2085(arg3, arg1, (byte) 116, arg4, arg2, arg5, arg6);
        }
        field3091++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
    public static final void method1294(byte arg0, int arg1, int arg2) {
        class170.field2422 = arg2 - class97.field1400;
        if (arg0 >= -97) {
            field3096 = null;
        }
        field3097++;
        class145.field2008 = -arg1 - (1 - class97.field1397 - class97.field1406);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lvd;")
    public static final class160 method1295(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1343; var4++) {
            class160 var5 = var3.field1339[var4];
            if ((var5.field2225 >> 29 & 0x3L) == 2L && var5.field2234 == arg1 && var5.field2229 == arg2) {
                class137.method862(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Lgj;")
    public static final class39 method1296(int arg0) {
        field3100++;
        if (arg0 >= -106) {
            field3096 = null;
        }
        class39 var1 = (class39) class42.field626.method1059((byte) -106);
        if (var1 != null) {
            var1.method962(128);
            var1.method819((byte) -12);
            return var1;
        }
        class39 var2;
        do {
            var2 = (class39) class110.field1563.method1059((byte) -106);
            if (var2 == null) {
                return null;
            }
            if (var2.method267((byte) 35) > class299.method2006(9594)) {
                return null;
            }
            var2.method962(128);
            var2.method819((byte) -12);
        } while ((Long.MIN_VALUE & var2.field1793) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1297(String arg0, int arg1) {
        field3099++;
        if (arg1 != -2) {
            field3096 = null;
        }
        if (class245.field3846 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class82.method525(false);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class89.method573("mem=" + var4 + "k", (byte) -123);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class82.method525(false);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class89.method573("Memory before cleanup=" + var7 + "k", (byte) -124);
                class279.method1807(119);
                class82.method525(false);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class89.method573("Memory after cleanup=" + var9 + "k", (byte) -120);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class89.method573("Number of player models in cache:" + class53.method338(82), (byte) -119);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class260.method1698(-102);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class104.field1498.method1119(-3741);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class104.field1498.method1118(-72);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class45.field667.method319(-103);
                class272.field4332.method1209(-83);
                class104.field1498.method1111(true);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class197.field3020 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class82.method519(-127, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class223.field3481 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class223.field3481 = false;
            }
            if (arg0.startsWith("::setba")) {
                class221.field3441 = class18.method124(arg0.substring(8), true);
                class149.method929(class45.field667, -1);
                class25.field402 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class220.method1445(class18.method124(arg0.substring(15), true));
                class149.method929(class45.field667, -1);
                class25.field402 = false;
            }
            if (arg0.startsWith("::fps ") && class241.field3789 != 0) {
                class119.method772(class18.method124(arg0.substring(6), true), -126);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class83.field1143 = class18.method124(arg0.substring(12).trim(), true);
                class89.method573("rect_debug=" + class83.field1143, (byte) -122);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class16.field288 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class199.field3035) {
                    class199.field3035 = false;
                    class89.method573("Forced tweening disabled.", (byte) -120);
                } else {
                    class199.field3035 = true;
                    class89.method573("Forced tweening ENABLED!", (byte) -122);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class192.field2940) {
                    System.out.println("Shift-click disabled.");
                    class192.field2940 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class192.field2940 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class89.method573("x:" + (class250.field3905.field4081 >> 7) + " z:" + (class250.field3905.field4140 >> 7) + " groundh:" + class185.field2812[class166.field2364][class250.field3905.field4081 >> 7][class250.field3905.field4140 >> 7], (byte) -123);
            }
            if (arg0.equalsIgnoreCase("::getheight")) {
                class89.method573("Height: " + class185.field2812[class166.field2364][class250.field3905.field4081 >> 7][class250.field3905.field4140 >> 7], (byte) -118);
            }
        }
        class198.field3029++;
        class231.field3614.method809(88, 0);
        class231.field3614.method1363(arg0.length() - 1, 114);
        class231.field3614.method1384(arg0.substring(2), -595448376);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class208(int arg0) {
        this.field3098 = arg0;
        this.field3089 = new class238[this.field3098];
        this.field3088 = new int[this.field3098];
    }
}
