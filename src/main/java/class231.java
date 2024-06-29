import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class231 extends class205 {

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static volatile int field3514 = -1;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "J")
    public static long field3526 = 0L;

    @OriginalMember(owner = "client!ni", name = "ib", descriptor = "[I")
    public static int[] field3529 = new int[25];

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "Z")
    public static boolean field3527 = false;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ni", name = "jb", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ni", name = "kb", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "Lco;")
    public class48 field3523;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "[B")
    public byte[] field3517;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "[I")
    public static int[] field3516;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V", line = 6)
    public static final void method1625(int arg0) {
        field3515++;
        if (class38.field564 == 0) {
            return;
        }
        try {
            if ((++class324.field5004) > 2000) {
                if (class1.field20 != null) {
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                }
                if (class257.field3929 >= 1) {
                    class38.field564 = 0;
                    class338.field5251 = -5;
                    return;
                }
                class38.field564 = 1;
                class257.field3929++;
                class324.field5004 = 0;
                if (class62.field829 == class340.field5286) {
                    class62.field829 = class216.field3318;
                } else {
                    class62.field829 = class340.field5286;
                }
            }
            if (class38.field564 == 1) {
                class296.field4569 = class330.field5074.method65((byte) -31, class62.field829, class224.field3427);
                class38.field564 = 2;
            }
            if (class38.field564 == 2) {
                if (class296.field4569.field3185 == 2) {
                    throw new IOException();
                }
                if (class296.field4569.field3185 != 1) {
                    return;
                }
                class1.field20 = new class237((Socket) class296.field4569.field3186, class330.field5074);
                class296.field4569 = null;
                class1.field20.method1651(0, class85.field1236.field3866, class85.field1236.field3840, (byte) -121);
                if (class250.field3778 != null) {
                    class250.field3778.method2298((byte) 42);
                }
                if (class234.field3567 != null) {
                    class234.field3567.method2298((byte) 42);
                }
                int var1 = class1.field20.method1655(0);
                if (class250.field3778 != null) {
                    class250.field3778.method2298((byte) 42);
                }
                if (class234.field3567 != null) {
                    class234.field3567.method2298((byte) 42);
                }
                if (var1 != 21) {
                    class338.field5251 = var1;
                    class38.field564 = 0;
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                    return;
                }
                class38.field564 = 3;
            }
            if (class38.field564 == 3) {
                if (class1.field20.method1648(arg0 ^ 0xFFFFACB6) < 1) {
                    return;
                }
                class142.field2189 = new String[class1.field20.method1655(0)];
                class38.field564 = 4;
            }
            if (class38.field564 == 4) {
                if (class1.field20.method1648(arg0 ^ 0xFFFFACB6) < (class142.field2189.length * 8)) {
                    return;
                }
                class204.field3136.field3866 = 0;
                class1.field20.method1656(class142.field2189.length * 8, true, 0, class204.field3136.field3840);
                for (int var2 = 0; var2 < class142.field2189.length; var2++) {
                    class142.field2189[var2] = class101.method759(class204.field3136.method1777(2047062688), (byte) -95);
                }
                class338.field5251 = 21;
                class38.field564 = 0;
                class1.field20.method1653(-19746);
                class1.field20 = null;
                return;
            }
        } catch (IOException var4) {
            if (class1.field20 != null) {
                class1.field20.method1653(arg0 + 1576);
                class1.field20 = null;
            }
            if (class257.field3929 >= 1) {
                class38.field564 = 0;
                class338.field5251 = -4;
            } else {
                class257.field3929++;
                class38.field564 = 1;
                class324.field5004 = 0;
                if (class62.field829 == class340.field5286) {
                    class62.field829 = class216.field3318;
                } else {
                    class62.field829 = class340.field5286;
                }
            }
        }
        if (arg0 != -21322) {
            field3522 = -2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljd;Ljd;I)V", line = 160)
    public static final void method1626(class95 arg0, class95 arg1, int arg2) {
        class168.field2723 = arg0;
        class304.field4665 = arg1;
        if (arg2 != 8) {
            method1625(67);
        }
        field3521++;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V", line = 185)
    public static void method1627(int arg0) {
        if (arg0 != 19485) {
            method1627(-100);
        }
        field3516 = null;
        field3529 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 198)
    public static final long method1628(String arg0, int arg1) {
        int var2 = arg0.length();
        field3530++;
        long var3 = 0L;
        int var5 = 0;
        if (arg1 != -1) {
            return 87L;
        }
        while (var5 < var2) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Z)I", line = 226)
    public final int method1481(boolean arg0) {
        if (arg0) {
            method1628((String) null, 122);
        }
        field3519++;
        return this.field3139 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)[B", line = 243)
    public final byte[] method1477(byte arg0) {
        if (arg0 != -9) {
            field3516 = (int[]) null;
        }
        field3520++;
        if (this.field3139) {
            throw new RuntimeException();
        }
        return this.field3517;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZIBIIZI)V", line = 268)
    public static final void method1629(boolean arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3518++;
        if (arg5) {
            class73.method542();
        }
        if (class170.field2747 != null && (arg6 != 3 || class25.field272 != arg1 || class169.field2735 != arg3)) {
            class1.method10(class170.field2747, (byte) 5, class330.field5074);
            class170.field2747 = null;
        }
        if (arg6 == 3 && class170.field2747 == null) {
            class170.field2747 = class178.method1333(arg1, arg3, class330.field5074, 0, 0, -3);
            if (class170.field2747 != null) {
                class169.field2735 = arg3;
                class25.field272 = arg1;
                class110.method840(-109, class330.field5074);
            }
        }
        if (arg6 == 3 && class170.field2747 == null) {
            method1629(true, -1, (byte) -105, -1, arg4, true, class216.field3321);
            return;
        }
        Container var7;
        if (class170.field2747 != null) {
            var7 = class170.field2747;
        } else if (class254.field3878 == null) {
            var7 = class330.field5074.field95;
        } else {
            var7 = class254.field3878;
        }
        class312.field4843 = var7.getSize().width;
        class242.field3687 = var7.getSize().height;
        if (class254.field3878 == var7) {
            Insets var8 = class254.field3878.getInsets();
            class312.field4843 -= var8.right + var8.left;
            class242.field3687 -= var8.top + var8.bottom;
        }
        if (arg6 >= 2) {
            class176.field2818 = 0;
            class151.field2281 = class312.field4843;
            class215.field3300 = class242.field3687;
            class135.field2052 = 0;
        } else {
            class176.field2818 = (class312.field4843 - 765) / 2;
            class135.field2052 = 0;
            class215.field3300 = 503;
            class151.field2281 = 765;
        }
        if (arg0) {
            class330.method2301(16128, class102.field1480);
            class245.method1685(-2136, class102.field1480);
            if (class38.field542 != null) {
                class38.field542.method1536(class102.field1480, true);
            }
            class304.field4654.method1693((byte) 96);
            class162.method1218(class102.field1480, (byte) -125);
            class170.method1284(class102.field1480, 10151);
            if (class38.field542 != null) {
                class38.field542.method1539((byte) -38, class102.field1480);
            }
        } else {
            if (class73.field1058) {
                class73.method555(class151.field2281, class215.field3300);
            }
            class102.field1480.setSize(class151.field2281, class215.field3300);
            if (class254.field3878 == var7) {
                Insets var9 = class254.field3878.getInsets();
                class102.field1480.setLocation(class176.field2818 + var9.left, class135.field2052 + var9.top);
            } else {
                class102.field1480.setLocation(class176.field2818, class135.field2052);
            }
        }
        if (arg6 == 0 && arg4 > 0) {
            class73.method521(class102.field1480);
        }
        if (arg5 && arg6 > 0) {
            class102.field1480.setIgnoreRepaint(true);
            if (!class286.field4445) {
                class241.method1673();
                class13.field186 = null;
                class13.field186 = class198.method1440(class215.field3300, class151.field2281, class102.field1480, 6);
                class287.method1992();
                if (class152.field2308 == 5) {
                    class184.method1363(-18671, true, class167.field2703);
                } else {
                    class97.method729(29912, false, class286.field4447);
                }
                try {
                    Graphics var10 = class102.field1480.getGraphics();
                    class13.field186.method1091(-24418, var10, 0, 0);
                } catch (Exception var15) {
                }
                class206.method1489(25834);
                if (arg4 == 0) {
                    class13.field186 = class198.method1440(503, 765, class102.field1480, 6);
                } else {
                    class13.field186 = null;
                }
                class208 var12 = class330.field5074.method48(0, class304.field4654.getClass());
                while (var12.field3185 == 0) {
                    class324.method2252(-24861, 100L);
                }
                if (var12.field3185 == 1) {
                    class286.field4445 = true;
                }
            }
            if (class286.field4445) {
                class73.method528(class102.field1480, class142.field2190 * 2);
            }
        }
        if (!class73.field1058 && arg6 > 0) {
            method1629(true, -1, (byte) -99, -1, arg4, true, 0);
            return;
        }
        if (arg6 > 0 && arg4 == 0) {
            class163.field2634.setPriority(5);
            class13.field186 = null;
            class113.method864();
            ((class265) class164.field2662).method1868(10146, 200);
            if (class309.field4812) {
                class164.method1246(0.7F);
            }
            if (class258.field3966 == null) {
                class258.field3966 = new class61[13][13];
            }
            class315.method2161(4, 104, 104);
            class125.method932(104, 104);
            class81.method627(-95);
        } else if (arg6 == 0 && arg4 > 0) {
            class163.field2634.setPriority(1);
            class13.field186 = class198.method1440(503, 765, class102.field1480, 6);
            class113.method871();
            class249.method1701();
            ((class265) class164.field2662).method1868(10146, 20);
            if (class309.field4812) {
                if (class102.field1482 == 1) {
                    class164.method1246(0.9F);
                }
                if (class102.field1482 == 2) {
                    class164.method1246(0.8F);
                }
                if (class102.field1482 == 3) {
                    class164.method1246(0.7F);
                }
                if (class102.field1482 == 4) {
                    class164.method1246(0.6F);
                }
            }
            class58.method413();
            class81.method627(-128);
        }
        class198.field3038 = !class110.method841((byte) 88);
        if (arg5) {
            class234.method1638(-127);
        }
        if (arg6 >= 2) {
            class63.field842 = true;
        } else {
            class63.field842 = false;
        }
        if (class28.field334 != -1) {
            class265.method1860((byte) -73, true);
        }
        if (class1.field20 != null && (class152.field2308 == 30 || class152.field2308 == 25)) {
            class187.method1384((byte) -118);
        }
        int var13 = -79 / ((47 - arg2) / 63);
        for (int var14 = 0; var14 < 100; var14++) {
            class121.field1861[var14] = true;
        }
        class177.field2828 = true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 520)
    public static final void method1630(boolean arg0, String arg1, int arg2) {
        field3528++;
        String var3 = class61.method424(class85.method638(arg1, arg0), -90);
        boolean var4 = false;
        for (int var5 = 0; var5 < class234.field3563; var5++) {
            class270 var6 = class201.field3096[class291.field4475[var5]];
            if (var6 != null && var6.field4218 != null && var6.field4218.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg2 == 1) {
                    class280.field4358++;
                    class85.field1236.method1141((byte) 73, 5);
                    class85.field1236.method1785(class291.field4475[var5], (byte) 74);
                    class85.field1236.method1752(0, -92);
                } else if (arg2 == 4) {
                    class165.field2685++;
                    class85.field1236.method1141((byte) 91, 161);
                    class85.field1236.method1744(true, class291.field4475[var5]);
                    class85.field1236.method1747(-111, 0);
                } else if (arg2 == 5) {
                    class85.field1236.method1141((byte) 88, 92);
                    class85.field1236.method1784(class291.field4475[var5], (byte) -128);
                    class217.field3329++;
                    class85.field1236.method1747(-93, 0);
                } else if (arg2 == 6) {
                    class38.field543++;
                    class85.field1236.method1141((byte) 102, 30);
                    class85.field1236.method1762(class291.field4475[var5], -1545504632);
                    class85.field1236.method1747(-47, 0);
                } else if (arg2 == 7) {
                    class85.field1236.method1141((byte) 92, 250);
                    class133.field2027++;
                    class85.field1236.method1747(-95, 0);
                    class85.field1236.method1744(true, class291.field4475[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class262.method1840("", class166.field2692 + var3, 0, -84);
        }
    }
}
