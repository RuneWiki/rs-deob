import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class242 implements Runnable {

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Z")
    public boolean field3629 = true;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Ljava/lang/Object;")
    public Object field3628 = new Object();

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
    public int[] field3632 = new int[500];

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[I")
    public int[] field3631 = new int[500];

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public int field3634 = 0;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3623 = 2301979;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[Lfm;")
    public static class52[] field3624 = new class52[29];

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lwn;")
    public static class30 field3627 = new class30();

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lpk;")
    public static class120 field3626;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[[[B")
    public static byte[][][] field3621;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILtk;B)I", line = 4)
    public static final int method1708(int arg0, class266 arg1, byte arg2) {
        field3616++;
        if (!client.method1867(arg1).method1779(-1, arg0) && arg1.field4037 == null) {
            return -1;
        } else if (arg2 < 123) {
            return -1;
        } else if (arg1.field3930 == null || arg0 >= arg1.field3930.length) {
            return -1;
        } else {
            return arg1.field3930[arg0];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 31)
    public static void method1709(int arg0) {
        field3627 = null;
        field3621 = (byte[][][]) null;
        field3624 = null;
        int var1 = -12 % ((-arg0 - 29) / 41);
        field3626 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Laj;ZIIIIIIIIZB)V", line = 47)
    public static final void method1710(class1 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11) {
        if (arg5 >= 0 && arg5 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg10 && !arg1) {
                class332.field5184[arg4][arg5][arg3] = 0;
            }
            while (true) {
                int var12 = arg0.method15((byte) -62);
                if (var12 == 0) {
                    if (arg10) {
                        class85.field1374[0][arg5 + arg9][arg3 + arg6] = class9.field220[0][arg5 + arg9][arg3 + arg6];
                    } else if (arg4 == 0) {
                        class85.field1374[0][arg5 + arg9][arg3 + arg6] = -class185.method1346(arg2 + 556238, 93, arg8 + 932731) * 8;
                    } else {
                        class85.field1374[arg4][arg5 + arg9][arg3 + arg6] = class85.field1374[arg4 - 1][arg5 + arg9][arg3 + arg6] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg0.method15((byte) 123);
                    if (arg10) {
                        class85.field1374[0][arg5 + arg9][arg3 + arg6] = var13 * 8 + class9.field220[0][arg5 + arg9][arg3 + arg6];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg4 == 0) {
                            class85.field1374[0][arg5 + arg9][arg3 + arg6] = -var13 * 8;
                        } else {
                            class85.field1374[arg4][arg5 + arg9][arg3 + arg6] = class85.field1374[arg4 - 1][arg5 + arg9][arg3 + arg6] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 > 49) {
                    if (var12 <= 81) {
                        if (!arg10 && !arg1) {
                            class332.field5184[arg4][arg5][arg3] = (byte) (var12 - 49);
                        }
                    } else if (!arg1) {
                        class58.field872[arg4][arg5][arg3] = (byte) (var12 - 81);
                    }
                } else if (arg1) {
                    arg0.method15((byte) -59);
                } else {
                    class260.field3875[arg4][arg5][arg3] = arg0.method55(4);
                    class272.field4263[arg4][arg5][arg3] = (byte) ((var12 - 2) / 4);
                    class201.field3096[arg4][arg5][arg3] = (byte) class164.method1234(var12 + arg7 - 2, 3);
                }
            }
        } else {
            while (true) {
                int var14 = arg0.method15((byte) -80);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg0.method15((byte) -39);
                    break;
                }
                if (var14 <= 49) {
                    arg0.method15((byte) 88);
                }
            }
        }
        if (arg11 <= 13) {
            field3633 = 69;
        }
        field3619++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfd;", line = 159)
    public static final class259 method1711(Throwable arg0, String arg1) {
        field3617++;
        class259 var2;
        if (arg0 instanceof class259) {
            var2 = (class259) arg0;
            var2.field3843 = var2.field3843 + ' ' + arg1;
        } else {
            var2 = new class259(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIZIIII)V", line = 176)
    public static final void method1712(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2) {
            class162.method1222();
        }
        if (class244.field3646 != null && (arg3 != 3 || class146.field2393 != arg1 || class73.field1105 != arg6)) {
            class34.method315(class92.field1484, class244.field3646, true);
            class244.field3646 = null;
        }
        if (arg3 == arg4 && class244.field3646 == null) {
            class244.field3646 = class334.method2336(class92.field1484, 0, arg1, 0, arg6, arg4 + 7);
            if (class244.field3646 != null) {
                class73.field1105 = arg6;
                class146.field2393 = arg1;
                class281.method1976(class92.field1484, -7136);
            }
        }
        field3620++;
        if (arg3 == 3 && class244.field3646 == null) {
            method1712(true, -1, true, class101.field1636, 3, arg5, -1);
            return;
        }
        Container var7;
        if (class244.field3646 != null) {
            var7 = class244.field3646;
        } else if (class139.field2247 == null) {
            var7 = class92.field1484.field1037;
        } else {
            var7 = class139.field2247;
        }
        class1.field46 = var7.getSize().width;
        class294.field4625 = var7.getSize().height;
        if (class139.field2247 == var7) {
            Insets var8 = class139.field2247.getInsets();
            class294.field4625 -= var8.top + var8.bottom;
            class1.field46 -= var8.right + var8.left;
        }
        if (arg3 < 2) {
            class211.field3314 = 765;
            class299.field4789 = (class1.field46 - 765) / 2;
            class142.field2301 = 0;
            class338.field5219 = 503;
        } else {
            class299.field4789 = 0;
            class338.field5219 = class294.field4625;
            class142.field2301 = 0;
            class211.field3314 = class1.field46;
        }
        if (arg0) {
            class118.method925(class334.field5197, (byte) -109);
            class251.method1739((byte) -59, class334.field5197);
            if (class345.field5350 != null) {
                class345.field5350.method1669(128, class334.field5197);
            }
            class5.field118.method905(arg4 - 3);
            class183.method1338(false, class334.field5197);
            class34.method317(class334.field5197, 82);
            if (class345.field5350 != null) {
                class345.field5350.method1668(class334.field5197, 128);
            }
        } else {
            if (class162.field2623) {
                class162.method1220(class211.field3314, class338.field5219);
            }
            class334.field5197.setSize(class211.field3314, class338.field5219);
            if (class139.field2247 == var7) {
                Insets var9 = class139.field2247.getInsets();
                class334.field5197.setLocation(class299.field4789 + var9.left, class142.field2301 + var9.top);
            } else {
                class334.field5197.setLocation(class299.field4789, class142.field2301);
            }
        }
        if (arg3 == 0 && arg5 > 0) {
            class162.method1212(class334.field5197);
        }
        if (arg2 && arg3 > 0) {
            class334.field5197.setIgnoreRepaint(true);
            if (!class208.field3290) {
                class42.method381();
                class101.field1666 = null;
                class101.field1666 = class80.method631(class334.field5197, class338.field5219, class211.field3314, (byte) -108);
                class33.method294();
                if (class289.field4548 == 5) {
                    class257.method1781(true, class146.field2392, -4535);
                } else {
                    class121.method968(class244.field3655, (byte) -99, false);
                }
                try {
                    Graphics var10 = class334.field5197.getGraphics();
                    class101.field1666.method1290(-1, var10, 0, 0);
                } catch (Exception var14) {
                }
                class310.method2192(arg4 - 110);
                if (arg5 == 0) {
                    class101.field1666 = class80.method631(class334.field5197, 503, 765, (byte) -64);
                } else {
                    class101.field1666 = null;
                }
                class23 var12 = class92.field1484.method564(-31216, class5.field118.getClass());
                while (var12.field405 == 0) {
                    class245.method1729(120, 100L);
                }
                if (var12.field405 == 1) {
                    class208.field3290 = true;
                }
            }
            if (class208.field3290) {
                class162.method1200(class334.field5197, class315.field4973 * 2);
            }
        }
        if (!class162.field2623 && arg3 > 0) {
            method1712(true, -1, true, 0, 3, arg5, -1);
            return;
        }
        if (arg3 > 0 && arg5 == 0) {
            class165.field2672.setPriority(5);
            class101.field1666 = null;
            class271.method1928();
            ((class277) class40.field614).method1966(25919, 200);
            if (class229.field3531) {
                class40.method352(0.7F);
            }
            if (class155.field2520 == null) {
                class155.field2520 = new class75[13][13];
            }
            class219.method1584(4, 104, 104);
            class295.method2072(104, 104);
            class316.method2234(true);
        } else if (arg3 == 0 && arg5 > 0) {
            class165.field2672.setPriority(1);
            class101.field1666 = class80.method631(class334.field5197, 503, 765, (byte) -89);
            class271.method1931();
            class236.method1690();
            ((class277) class40.field614).method1966(25919, 20);
            if (class229.field3531) {
                if (class343.field5310 == 1) {
                    class40.method352(0.9F);
                }
                if (class343.field5310 == 2) {
                    class40.method352(0.8F);
                }
                if (class343.field5310 == 3) {
                    class40.method352(0.7F);
                }
                if (class343.field5310 == 4) {
                    class40.method352(0.6F);
                }
            }
            class256.method1770();
            class316.method2234(true);
        }
        class161.field2611 = !class53.method450(2);
        if (arg2) {
            class345.method2395((byte) 105);
        }
        if (arg3 >= 2) {
            class229.field3528 = true;
        } else {
            class229.field3528 = false;
        }
        if (class168.field2707 != -1) {
            class281.method1978(-1681, true);
        }
        if (class319.field5005 != null && (class289.field4548 == 30 || class289.field4548 == 25)) {
            class237.method1696(true);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class280.field4378[var13] = true;
        }
        class49.field752 = true;
    }

    @OriginalMember(owner = "client!jf", name = "run", descriptor = "()V", line = 430)
    public final void run() {
        while (this.field3629) {
            Object var1 = this.field3628;
            synchronized (this.field3628) {
                if (this.field3634 < 500) {
                    this.field3632[this.field3634] = class303.field4832;
                    this.field3631[this.field3634] = class22.field389;
                    this.field3634++;
                }
            }
            class245.method1729(-116, 50L);
        }
        field3622++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IC)B", line = 453)
    public static final byte method1713(int arg0, char arg1) {
        int var2 = -115 / ((arg0 + 82) / 42);
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        field3630++;
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 579)
    public static final void method1714(boolean arg0) {
        class326.method2296((byte) -41);
        class307.method2174((byte) -86);
        field3618++;
        class308.method2179((byte) 60);
        class20.method210(-1);
        class53.method446(126);
        class30.method276((byte) -128);
        class150.method1135(0);
        class141.method1085(16739175);
        class176.method1296(arg0);
        class115.method912((byte) 106);
        class214.method1556(-123);
        class176.method1299((byte) 120);
        class146.method1108(258);
        class22.method219(3);
        class91.method725(arg0);
        class308.method2180((byte) -29);
        class143.method1101(0);
        class143.method1097(-103);
        if (class209.field3298 != 0) {
            for (int var1 = 0; var1 < class258.field3832.length; var1++) {
                class258.field3832[var1] = null;
            }
            class21.field385 = 0;
        }
        class140.method1079(-1);
        class227.method1657(119);
        class38.field578.method2282((byte) -120);
        if (!class162.field2623) {
            ((class277) class40.field614).method1963(255);
        }
        class218.field3410.method1176((byte) -60);
        class74.field1138.method961(-1);
        class185.field2932.method961(-1);
        class52.field771.method961(-1);
        class208.field3288.method961(-1);
        class200.field3062.method961(-1);
        class79.field1232.method961(-1);
        class147.field2407.method961(-1);
        class176.field2815.method961(-1);
        class110.field1793.method961(-1);
        class136.field2209.method961(-1);
        class111.field1809.method961(-1);
        class209.field3303.method2282((byte) -126);
    }
}
