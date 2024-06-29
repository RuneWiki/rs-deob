import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class98 extends class183 {

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public int field1323 = 0;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Lkm;")
    public static class133 field1332;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Lek;")
    public class220 field1333;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "Lek;")
    public class220 field1339;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lfj;")
    public class241 field1324;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Ltd;")
    public static class283 field1327;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lwj;")
    public class302 field1319;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lsc;")
    public class329 field1334;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Z")
    public boolean field1329;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "Z")
    public static boolean field1340;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "[I")
    public int[] field1328;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V", line = 13)
    public static void method710(byte arg0) {
        field1327 = null;
        if (arg0 < 120) {
            field1340 = true;
        }
        field1332 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZBZII)V", line = 30)
    public static final void method711(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        field1336++;
        if (arg4) {
            class67.method469();
        }
        if (class329.field4964 != null && (arg0 != 3 || class253.field3625 != arg1 || class61.field810 != arg6)) {
            class145.method1048((byte) -32, class165.field2258, class329.field4964);
            class329.field4964 = null;
        }
        if (arg0 == 3 && class329.field4964 == null) {
            class329.field4964 = class337.method2331((byte) -81, arg6, 0, arg1, 0, class165.field2258);
            if (class329.field4964 != null) {
                class61.field810 = arg6;
                class253.field3625 = arg1;
                class275.method1894((byte) 111, class165.field2258);
            }
        }
        if (arg0 == 3 && class329.field4964 == null) {
            method711(class162.field2230, -1, true, (byte) -92, true, arg5, -1);
            return;
        }
        Container var7;
        if (class329.field4964 != null) {
            var7 = class329.field4964;
        } else if (class138.field1898 == null) {
            var7 = class165.field2258.field1157;
        } else {
            var7 = class138.field1898;
        }
        class226.field3237 = var7.getSize().width;
        class223.field3203 = var7.getSize().height;
        if (class138.field1898 == var7) {
            Insets var8 = class138.field1898.getInsets();
            class223.field3203 -= var8.top + var8.bottom;
            class226.field3237 -= var8.left + var8.right;
        }
        if (arg0 < 2) {
            class187.field2592 = 765;
            class64.field836 = 503;
            class113.field1550 = (class226.field3237 - 765) / 2;
            class169.field2294 = 0;
        } else {
            class113.field1550 = 0;
            class169.field2294 = 0;
            class64.field836 = class223.field3203;
            class187.field2592 = class226.field3237;
        }
        if (arg2) {
            class259.method1785(-26092, class150.field2079);
            class181.method1258(0, class150.field2079);
            if (class196.field2731 != null) {
                class196.field2731.method1700(class150.field2079, (byte) -52);
            }
            class329.field4968.method278(2);
            class22.method135(class150.field2079, false);
            class1.method5(-1, class150.field2079);
            if (class196.field2731 != null) {
                class196.field2731.method1702(-104, class150.field2079);
            }
        } else {
            if (class67.field908) {
                class67.method493(class187.field2592, class64.field836);
            }
            class150.field2079.setSize(class187.field2592, class64.field836);
            if (class138.field1898 == var7) {
                Insets var9 = class138.field1898.getInsets();
                class150.field2079.setLocation(class113.field1550 + var9.left, class169.field2294 + var9.top);
            } else {
                class150.field2079.setLocation(class113.field1550, class169.field2294);
            }
        }
        if (arg0 == 0 && arg5 > 0) {
            class67.method478(class150.field2079);
        }
        if (arg4 && arg0 > 0) {
            class150.field2079.setIgnoreRepaint(true);
            if (!class92.field1272) {
                class61.method411();
                class272.field4079 = null;
                class272.field4079 = class202.method1434(class150.field2079, class64.field836, class187.field2592, -84);
                class38.method232();
                if (class148.field2051 == 5) {
                    class246.method1689((byte) -76, true, class204.field2946);
                } else {
                    class301.method2052(false, (byte) -123, class175.field2382);
                }
                try {
                    Graphics var10 = class150.field2079.getGraphics();
                    class272.field4079.method1109(0, 30364, var10, 0);
                } catch (Exception var15) {
                }
                class172.method1206((byte) 95);
                if (arg5 == 0) {
                    class272.field4079 = class202.method1434(class150.field2079, 503, 765, -102);
                } else {
                    class272.field4079 = null;
                }
                class285 var12 = class165.field2258.method627(class329.field4968.getClass(), 125);
                while (var12.field4241 == 0) {
                    class186.method1304(10, 100L);
                }
                if (var12.field4241 == 1) {
                    class92.field1272 = true;
                }
            }
            if (class92.field1272) {
                class67.method471(class150.field2079, class239.field3394 * 2);
            }
        }
        if (!class67.field908 && arg0 > 0) {
            method711(0, -1, true, (byte) -22, true, arg5, -1);
            return;
        }
        if (arg0 > 0 && arg5 == 0) {
            class117.field1594.setPriority(5);
            class272.field4079 = null;
            class50.method314();
            ((class204) class184.field2543).method1449(1, 200);
            if (class314.field4736) {
                class184.method1281(0.7F);
            }
            if (class181.field2431 == null) {
                class181.field2431 = new class85[13][13];
            }
            class147.method1056(4, 104, 104);
            class322.method2259(104, 104);
            class28.method166((byte) -118);
        } else if (arg0 == 0 && arg5 > 0) {
            class117.field1594.setPriority(1);
            class272.field4079 = class202.method1434(class150.field2079, 503, 765, -40);
            class50.method330();
            class265.method1800();
            ((class204) class184.field2543).method1449(1, 20);
            if (class314.field4736) {
                if (class297.field4401 == 1) {
                    class184.method1281(0.9F);
                }
                if (class297.field4401 == 2) {
                    class184.method1281(0.8F);
                }
                if (class297.field4401 == 3) {
                    class184.method1281(0.7F);
                }
                if (class297.field4401 == 4) {
                    class184.method1281(0.6F);
                }
            }
            class268.method1845();
            class28.method166((byte) -119);
        }
        class73.field1002 = !class154.method1113(-122);
        if (arg4) {
            class1.method3((byte) 62);
        }
        if (arg0 < 2) {
            class165.field2261 = false;
        } else {
            class165.field2261 = true;
        }
        if (class183.field2521 != -1) {
            class134.method977(true, 128);
        }
        if (class39.field442 != null && (class148.field2051 == 30 || class148.field2051 == 25)) {
            class304.method2071(-13658);
        }
        int var13 = 125 / ((37 - arg3) / 56);
        for (int var14 = 0; var14 < 100; var14++) {
            class121.field1644[var14] = true;
        }
        class276.field4134 = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZII)V", line = 273)
    public static final void method712(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return;
        }
        field1316++;
        class143 var4 = class163.method1176((byte) -11, arg0, 11);
        var4.method1032((byte) 126);
        var4.field1965 = arg2;
        var4.field1958 = arg3;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(B)V", line = 289)
    public final void method713(byte arg0) {
        int var2 = this.field1342;
        field1321++;
        if (this.field1319 != null) {
            class302 var5 = this.field1319.method2066((byte) -84);
            if (var5 == null) {
                this.field1322 = 0;
                this.field1342 = -1;
                this.field1328 = null;
                this.field1338 = 0;
                this.field1343 = 0;
                this.field1318 = 0;
            } else {
                this.field1343 = var5.field4524 * 128;
                this.field1342 = var5.field4481;
                this.field1338 = var5.field4500;
                this.field1328 = var5.field4498;
                this.field1322 = var5.field4517;
                this.field1318 = var5.field4493;
            }
        } else if (this.field1334 != null) {
            int var3 = class170.method1197(this.field1334, -96);
            if (var2 != var3) {
                this.field1342 = var3;
                class181 var4 = this.field1334.field4961;
                if (var4.field2476 != null) {
                    var4 = var4.method1266((byte) 123);
                }
                if (var4 == null) {
                    this.field1338 = this.field1343 = 0;
                } else {
                    this.field1343 = var4.field2423 * 128;
                    this.field1338 = var4.field2463;
                }
            }
        } else if (this.field1324 != null) {
            this.field1342 = class202.method1437(this.field1324, arg0 + 9);
            this.field1343 = this.field1324.field3414 * 128;
            this.field1338 = this.field1324.field3436;
        }
        if (this.field1342 != var2 && this.field1333 != null) {
            class160.field2196.method1130(this.field1333);
            this.field1333 = null;
        }
        if (arg0 != -10) {
            this.method713((byte) -79);
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(B)V", line = 389)
    public static final void method714(byte arg0) {
        field1330++;
        if (arg0 >= -53 || class115.field1555 != null && class257.field3805 != null) {
            return;
        }
        class257.field3805 = new int[256];
        class115.field1555 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class115.field1555[var1] = (int) (Math.sin(var2) * 4096.0D);
            class257.field3805[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I", line = 426)
    public static final int method715(int arg0) {
        if (arg0 != 503) {
            method710((byte) 56);
        }
        field1320++;
        return 6;
    }
}
