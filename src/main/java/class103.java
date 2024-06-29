import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class103 extends class57 {

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "Z")
    public static boolean field1651 = true;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "Lna;")
    public static class26 field1649 = class69.method505("<br>", (byte) -124);

    @OriginalMember(owner = "client!pm", name = "gb", descriptor = "Lna;")
    private static class26 field1657 = class69.method505(" from your friend list first)3", (byte) -118);

    @OriginalMember(owner = "client!pm", name = "fb", descriptor = "Lna;")
    public static class26 field1656 = field1657;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "B")
    public byte field1645;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "Lwa;")
    public class82 field1652;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "[[[Lbj;")
    public static class55[][][] field1653;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)I", line = 13)
    public final int method414(boolean arg0) {
        if (arg0) {
            return 92;
        } else {
            field1646++;
            return this.field1652 == null ? 0 : this.field1652.field1301 * 100 / (this.field1652.field1280.length - this.field1645);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILll;)[Lod;", line = 28)
    public static final class25[] method743(int arg0, class156 arg1) {
        field1655++;
        if (!arg1.method1066(false)) {
            return new class25[0];
        }
        class180 var2 = arg1.method1050((byte) 8);
        while (var2.field2811 == 0) {
            class126.method862(10L, 64);
        }
        if (var2.field2811 == 2) {
            return new class25[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2812);
        class25[] var4 = new class25[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class25 var6 = new class25();
            var4[var5] = var6;
            var6.field367 = var3[var5 << 2];
            var6.field369 = var3[(var5 << 2) + 1];
            var6.field370 = var3[(var5 << 2) + 2];
            var6.field368 = var3[(var5 << 2) + 3];
        }
        if (arg0 != 10) {
            method744((byte) -74);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(B)V", line = 75)
    public static void method744(byte arg0) {
        field1657 = null;
        field1653 = (class55[][][]) null;
        field1649 = null;
        if (arg0 < 91) {
            field1653 = (class55[][][]) ((class55[][][]) null);
        }
        field1656 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIZIZII)V", line = 115)
    public static final void method745(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg2) {
            class255.method1782();
        }
        if (class198.field3075 != null && (arg1 != 3 || class283.field4721 != arg5 || class310.field5331 != arg6)) {
            class304.method2135(class198.field3075, true, class45.field712);
            class198.field3075 = null;
        }
        if (arg1 == 3 && class198.field3075 == null) {
            class198.field3075 = class67.method498(2, 0, 0, arg6, arg5, class45.field712);
            if (class198.field3075 != null) {
                class310.field5331 = arg6;
                class283.field4721 = arg5;
                class298.method2106(class45.field712, (byte) 14);
            }
        }
        field1654++;
        if (arg1 == 3 && class198.field3075 == null) {
            method745(true, class96.field1574, true, arg3, arg4, -1, -1);
            return;
        }
        Container var7;
        if (class198.field3075 != null) {
            var7 = class198.field3075;
        } else if (class142.field2172 == null) {
            var7 = class45.field712.field2431;
        } else {
            var7 = class142.field2172;
        }
        class224.field3562 = var7.getSize().width;
        class267.field4407 = var7.getSize().height;
        if (class142.field2172 == var7) {
            Insets var8 = class142.field2172.getInsets();
            class224.field3562 -= var8.right + var8.left;
            class267.field4407 -= var8.top + var8.bottom;
        }
        if (arg4) {
            field1656 = (class26) null;
        }
        if (arg1 >= 2) {
            class38.field622 = class224.field3562;
            class141.field2153 = class267.field4407;
            class124.field1928 = 0;
            class25.field362 = 0;
        } else {
            class25.field362 = 0;
            class124.field1928 = (class224.field3562 - 765) / 2;
            class38.field622 = 765;
            class141.field2153 = 503;
        }
        if (arg0) {
            class139.method930(class250.field4085, -9320);
            class259.method1830(4, class250.field4085);
            if (class45.field717 != null) {
                class45.field717.method1293(false, class250.field4085);
            }
            class136.field2085.method2257((byte) 97);
            class84.method658((byte) 97, class250.field4085);
            class217.method1469(class250.field4085, arg4);
            if (class45.field717 != null) {
                class45.field717.method1295(class250.field4085, -103);
            }
        } else {
            if (class255.field4184) {
                class255.method1794(class38.field622, class141.field2153);
            }
            class250.field4085.setSize(class38.field622, class141.field2153);
            if (class142.field2172 == var7) {
                Insets var9 = class142.field2172.getInsets();
                class250.field4085.setLocation(var9.left + class124.field1928, class25.field362 + var9.top);
            } else {
                class250.field4085.setLocation(class124.field1928, class25.field362);
            }
        }
        if (arg1 == 0 && arg3 > 0) {
            class255.method1774(class250.field4085);
        }
        if (arg2 && arg1 > 0) {
            class250.field4085.setIgnoreRepaint(true);
            if (!class325.field5642) {
                class223.method1490();
                class134.field2040 = null;
                class134.field2040 = class76.method546(class141.field2153, class38.field622, true, class250.field4085);
                class34.method283();
                if (class207.field3217 == 5) {
                    class323.method2244((byte) 122, true, class89.field1474);
                } else {
                    class283.method1996((byte) -20, false, class115.field1810);
                }
                try {
                    Graphics var10 = class250.field4085.getGraphics();
                    class134.field2040.method1030(0, 0, var10, 0);
                } catch (Exception var14) {
                }
                class295.method2076(-1);
                if (arg3 == 0) {
                    class134.field2040 = class76.method546(503, 765, true, class250.field4085);
                } else {
                    class134.field2040 = null;
                }
                class180 var12 = class45.field712.method1055(-43, class136.field2085.getClass());
                while (var12.field2811 == 0) {
                    class126.method862(100L, 64);
                }
                if (var12.field2811 == 1) {
                    class325.field5642 = true;
                }
            }
            if (class325.field5642) {
                class255.method1793(class250.field4085, class2.field17 * 2);
            }
        }
        if (!class255.field4184 && arg1 > 0) {
            method745(true, 0, true, arg3, false, -1, -1);
            return;
        }
        if (arg1 > 0 && arg3 == 0) {
            class192.field2997.setPriority(5);
            class134.field2040 = null;
            class270.method1909();
            ((class13) class200.field3102).method102(200, -1);
            if (class25.field360) {
                class200.method1341(0.7F);
            }
            class283.method1997(-7878);
        } else if (arg1 == 0 && arg3 > 0) {
            class192.field2997.setPriority(1);
            class134.field2040 = class76.method546(503, 765, true, class250.field4085);
            class270.method1912();
            class19.method125();
            ((class13) class200.field3102).method102(20, -1);
            if (class25.field360) {
                if (class57.field923 == 1) {
                    class200.method1341(0.9F);
                }
                if (class57.field923 == 2) {
                    class200.method1341(0.8F);
                }
                if (class57.field923 == 3) {
                    class200.method1341(0.7F);
                }
                if (class57.field923 == 4) {
                    class200.method1341(0.6F);
                }
            }
            class172.method1178();
            class283.method1997(-7878);
        }
        class5.field54 = !class324.method2250(89);
        if (arg2) {
            class210.method1408(false);
        }
        if (arg1 >= 2) {
            class88.field1446 = true;
        } else {
            class88.field1446 = false;
        }
        if (class250.field4095 != -1) {
            class220.method1480(true, (byte) -107);
        }
        if (class88.field1449 != null && (class207.field3217 == 30 || class207.field3217 == 25)) {
            class158.method1074(-3);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class2.field21[var13] = true;
        }
        class198.field3066 = true;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)[B", line = 348)
    public final byte[] method415(boolean arg0) {
        field1647++;
        if (this.field930 || this.field1652.field1301 < (this.field1652.field1280.length - this.field1645)) {
            throw new RuntimeException();
        }
        if (arg0) {
            this.method414(false);
        }
        return this.field1652.field1280;
    }
}
