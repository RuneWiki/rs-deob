import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class174 {

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "B")
    private byte field2466;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Z")
    public static boolean field2468 = true;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Lga;")
    public static class332 field2475;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JJ)J", line = 3)
    public static long method1186(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1187(int arg0) {
        if (arg0 != 0) {
            return;
        }
        class339.field4565.method2512(arg0 ^ 0xFFFFD2DA);
        field2467++;
        class182.field2542.method2512(-11558);
        for (class354 var1 = (class354) class101.field1211.method2506(68); var1 != null; var1 = (class354) class101.field1211.method2505(-113)) {
            int var18 = var1.field4729;
            if (var18 < 1000) {
                var1.method242(true);
                if (var18 == 20 || var18 == 18 || var18 == 19 || var18 == 59 || var18 == 22 || var18 == 57 || var18 == 2) {
                    class182.field2542.method2507(var1, (byte) -128);
                } else {
                    class339.field4565.method2507(var1, (byte) -125);
                }
            }
        }
        class339.field4565.method2508(arg0 ^ 0x55, class101.field1211);
        class182.field2542.method2508(85, class101.field1211);
        if (class137.field1873 <= 1) {
            class572.field7773 = null;
        } else if (class482.field6723 && class643.field8914.method2106((byte) -114, 81) && class137.field1873 > 2) {
            class572.field7773 = (class354) class101.field1211.field5887.field547.field547;
        } else {
            class572.field7773 = (class354) class101.field1211.field5887.field547;
        }
        int var2 = -1;
        class294 var3 = (class294) class58.field743.method2506(arg0 + 68);
        if (var3 != null) {
            var2 = var3.method452(false);
        }
        if (!class674.field9590) {
            if (var2 == 0 && (class52.field665 == 1 && class137.field1873 > 2 || class274.method1650(0))) {
                var2 = 2;
            }
            if (var2 == 2 && class137.field1873 > 0 && var3 != null) {
                if (class85.field1028 == null && class182.field2544 == 0) {
                    class500.method2845(var3.method454(-3), var3.method451((byte) -123), arg0 - 30906);
                } else {
                    class152.field2092 = 2;
                }
            }
            if (var2 == 0 && class137.field1873 > 0) {
                class156.method906(-107);
            }
            if (class85.field1028 != null || class182.field2544 != 0) {
                return;
            }
            class61.field759 = null;
            class152.field2092 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class409.field5387.method1890(16777215);
            int var5 = class409.field5387.method1893((byte) 105);
            if (var4 < class114.field1464 - 10 || var4 > class172.field2446 + class114.field1464 + 10 || var5 < class102.field1224 - 10 || var5 > class102.field1224 + class464.field6078 + 10) {
                class143.method819(200);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class114.field1464;
        int var7 = class102.field1224;
        int var8 = class172.field2446;
        int var9 = var3.method454(-3);
        int var10 = var3.method451((byte) -54);
        int var11 = -1;
        for (int var12 = 0; var12 < class137.field1873; var12++) {
            if (class218.field2857) {
                int var16 = (class137.field1873 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && var6 + var8 > var9 && var10 > var16 - 13 && var10 < (var16 + 4)) {
                    var11 = var12;
                }
            } else {
                int var17 = (class137.field1873 - var12 - 1) * 16 + var7 + 31;
                if (var6 < var9 && var6 + var8 > var9 && var10 > (var17 - 13) && (var17 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class218 var14 = new class218(class101.field1211);
            for (class354 var15 = (class354) var14.method1380(122); var15 != null; var15 = (class354) var14.method1383((byte) 1)) {
                if (var11 == var13) {
                    class342.method1988(var10, var15, var9, -127);
                }
                var13++;
            }
        }
        class143.method819(200);
        return;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILr;II)V", line = 183)
    public static final void method1188(int arg0, class562 arg1, int arg2, int arg3) {
        class569.field7760 = new class34[arg2][arg3];
        class610.field8468 = arg1;
        field2473++;
        if (arg0 < 23) {
            field2462 = -25;
        }
        if (class5.field56 != null) {
            class59.field745 = class509.method2887(class5.field56[1], class5.field56[4], (byte) -19, class5.field56[0], class5.field56[3], class5.field56[5], class5.field56[2]);
        }
        class510.field7109 = new class34();
        class324.method1881(true);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)I", line = 214)
    public final int method1189(int arg0) {
        if (arg0 != -1) {
            this.method1189(-51);
        }
        field2471++;
        return this.field2466 & 0x7;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 225)
    public class174() {
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 229)
    public static final void method1190(int arg0, int arg1) {
        if (arg0 != 0) {
            method1188(113, null, -125, -125);
        }
        class470.method2708(arg1, (byte) 5, class371.field4891.method2141(class422.field5539, true));
        field2470++;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lio;)V", line = 239)
    public class174(class157 arg0) {
        this.field2466 = arg0.method969(3);
        this.field2460 = arg0.method963(-128);
        this.field2465 = arg0.method908(false);
        this.field2459 = arg0.method908(false);
        this.field2464 = arg0.method908(false);
        this.field2472 = arg0.method908(false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I", line = 252)
    public final int method1191(boolean arg0) {
        if (arg0) {
            field2474++;
            return (this.field2466 & 0x8) == 8 ? 1 : 0;
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 264)
    public static void method1192(int arg0) {
        field2475 = null;
        if (arg0 < 71) {
            field2461 = 104;
        }
    }
}
