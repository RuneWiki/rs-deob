import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class376 extends class45 {

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    private int field5467;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    private int field5471;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    private int field5484;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    private int field5465;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    private int field5476;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    public int field5485;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field5470 = -1;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "[[I")
    public static int[][] field5482 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!an", name = "F", descriptor = "Z")
    public static boolean field5486 = false;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 4)
    public static void method2433(int arg0) {
        int var1 = 77 / ((arg0 + 55) / 43);
        field5482 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lje;", line = 15)
    public static final class299 method2434(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3519;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(III)Z", line = 26)
    public final boolean method2435(int arg0, int arg1, int arg2) {
        if (arg2 < 31) {
            method2433(-25);
        }
        field5466++;
        return arg1 >= this.field5471 && arg1 <= this.field5467 && arg0 >= this.field5484 && this.field5476 >= arg0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IBI[I)V", line = 43)
    public final void method2436(int arg0, byte arg1, int arg2, int[] arg3) {
        arg3[1] = this.field5473 + arg0 - this.field5471;
        field5483++;
        arg3[2] = this.field5479 + arg2 - this.field5484;
        arg3[0] = 0;
        if (arg1 != 73) {
            this.field5471 = 15;
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(III)Z", line = 60)
    public final boolean method2437(int arg0, int arg1, int arg2) {
        int var4 = 103 / ((arg2 + 22) / 35);
        field5469++;
        return this.field5473 <= arg0 && arg0 <= this.field5481 && arg1 >= this.field5479 && arg1 <= this.field5485;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(IBI[I)V", line = 78)
    public final void method2438(int arg0, byte arg1, int arg2, int[] arg3) {
        field5478++;
        arg3[1] = this.field5471 + arg0 - this.field5473;
        if (arg1 != -59) {
            this.method2438(31, (byte) -65, 47, (int[]) null);
        }
        arg3[2] = this.field5484 + arg2 - this.field5479;
        arg3[0] = this.field5465;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)Z", line = 92)
    public final boolean method2439(int arg0, int arg1, int arg2, int arg3) {
        field5475++;
        if (arg0 == -1) {
            return this.field5465 == arg1 && arg2 >= this.field5471 && arg2 <= this.field5467 && arg3 >= this.field5484 && arg3 <= this.field5476;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 115)
    public static final void method2440(boolean arg0) {
        if (arg0) {
            return;
        }
        field5468++;
        class185.field2507.method5(-6445, 130);
        class144.field1964++;
        class185.field2507.method1346(class215.method1266(2), 32767);
        class185.field2507.method1326(class138.field1907, 80);
        class185.field2507.method1326(class92.field1294, -81);
        class185.field2507.method1346(class115.field1611, 32767);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIC)I", line = 133)
    public static final int method2441(int arg0, int arg1, char arg2) {
        field5472++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (~arg2 == arg0 && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V", line = 160)
    public static final void method2442(boolean arg0) {
        if (!arg0) {
            class55.field735.method1136((byte) -95);
            field5474++;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILjava/lang/String;)V", line = 174)
    public static final void method2443(int arg0, String arg1) {
        field5480++;
        if (arg1 == null) {
            return;
        }
        if (arg0 >= -58) {
            field5482 = null;
        }
        String var2 = class397.method2555(2289, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class167.field2254; var3++) {
            String var4 = class397.method2555(2289, class272.field3943[var3]);
            if (var4 != null && var4.equals(var2)) {
                class167.field2254--;
                for (int var5 = var3; var5 < class167.field2254; var5++) {
                    class272.field3943[var5] = class272.field3943[var5 + 1];
                    class148.field2037[var5] = class148.field2037[var5 + 1];
                    class324.field4759[var5] = class324.field4759[var5 + 1];
                    class368.field5312[var5] = class368.field5312[var5 + 1];
                    class356.field5156[var5] = class356.field5156[var5 + 1];
                    class110.field1551[var5] = class110.field1551[var5 + 1];
                }
                class404.field6015++;
                class416.field6111 = class207.field2788;
                class185.field2507.method5(-6445, 103);
                class185.field2507.method1346(class125.method795(-114, arg1), 32767);
                class185.field2507.method1380(65280, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V", line = 228)
    public static final void method2444(int arg0) {
        field5477++;
        class439.method2760(arg0 ^ 0x1E48);
        class197.method1176(0);
        class71.method524((byte) -38);
        class147.method934(-83);
        class34.method225(-29280);
        class167.method1030(4096);
        class201.method1191((byte) -92);
        class252.method1525(255);
        class356.method2337((byte) -122);
        class192.method1155(0);
        class27.method191(true);
        class300.method2055(true);
        class33.method220(arg0 - 18840);
        class352.method2319((byte) 45);
        class22.method149(-96);
        class62.method432(-118);
        class278.method1923(arg0 ^ arg0);
        class40.method285(0);
        class272.method1874(19);
        class197.method1174(-113);
        class271.method1866(14253);
        class298.method2044((byte) 100);
        if (class63.field846 != 0) {
            for (int var1 = 0; var1 < class419.field6200.length; var1++) {
                class419.field6200[var1] = null;
            }
            class250.field3445 = 0;
        }
        class124.method786(arg0 - 18880);
        class1.method13((byte) -31);
        class246.method1487(-116);
        class442.method2784(65280);
        class380.method2467((byte) 38);
        class123.field1718.method1141(256);
        class61.field807.method1751();
        class84.field1204.method2672((byte) 59);
        class145.method925(2);
        class148.field2035.method2274((byte) -100);
        class71.field1034.method2274((byte) -100);
        class130.field1798.method2274((byte) -100);
        class184.field2492.method2274((byte) -100);
        class309.field4551.method2274((byte) -100);
        class153.field2066.method2274((byte) -100);
        class385.field5583.method2274((byte) -100);
        class246.field3318.method2274((byte) -100);
        class362.field5227.method2274((byte) -100);
        class329.field4796.method2274((byte) -100);
        class1.field10.method2274((byte) -100);
        class151.field2056.method2274((byte) -100);
        class21.field280.method2274((byte) -100);
        class291.field4169.method2274((byte) -100);
        class448.field6573.method2274((byte) -100);
        class149.field2040.method2274((byte) -100);
        class349.field5056.method2274((byte) -100);
        class169.field2272.method2274((byte) -100);
        class93.field1339.method2274((byte) -100);
        class181.field2390.method2274((byte) -100);
        class393.field5629.method2274((byte) -100);
        class432.field6348.method2274((byte) -100);
        class180.field2381.method2274((byte) -100);
        class28.field417.method2274((byte) -100);
        class426.field6285.method2274((byte) -100);
        class273.field3973.method2274((byte) -100);
        class335.field4836.method2274((byte) -100);
        class69.field893.method2274((byte) -100);
        class315.field4604.method2274((byte) -100);
        class129.field1789.method1141(256);
        class315.field4603.method1141(256);
        class88.field1231.method1141(256);
        class219.field2902.method1141(256);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIIIIII)V", line = 310)
    public class376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5473 = arg5;
        this.field5467 = arg3;
        this.field5479 = arg6;
        this.field5471 = arg1;
        this.field5481 = arg7;
        this.field5484 = arg2;
        this.field5465 = arg0;
        this.field5476 = arg4;
        this.field5485 = arg8;
    }
}
