import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 implements Runnable {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
    public boolean field552 = true;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field550 = new Object();

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
    public int[] field561 = new int[500];

    @OriginalMember(owner = "client!df", name = "q", descriptor = "[I")
    public int[] field565 = new int[500];

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public int field567 = 0;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
    public static int[] field557 = new int[100];

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[Lrd;")
    public static class114[] field563 = new class114[100];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
    public static int[] field555 = new int[5];

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static volatile int field562 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Ldd;")
    public static class26 field553 = new class26(50);

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[Z")
    public static boolean[] field570 = new boolean[5];

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lrd;")
    public static class114 field569 = class84.method656("Hierhin gehen", (byte) 123);

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static volatile int field573 = -1;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "[I")
    public static int[] field572 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Lrd;")
    public static class114 field571 = class84.method656("An:", (byte) 121);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BIII)Lrd;")
    public static final class114 method204(byte[] arg0, int arg1, int arg2, int arg3) {
        field560++;
        class114 var4 = new class114();
        var4.field2660 = arg3;
        var4.field2676 = new byte[arg1];
        for (int var5 = arg2; var5 < arg2 + arg1; var5++) {
            if (arg0[var5] != 0) {
                var4.field2676[var4.field2660++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIBLbd;)V")
    public static final void method205(int arg0, int arg1, int arg2, int arg3, byte arg4, class12 arg5) {
        field564++;
        class65 var6 = new class65();
        var6.field1384 = arg5.field210;
        var6.field1396 = arg5.field263;
        var6.field1403 = arg5.field256 * 128;
        if (arg4 != -36) {
            field555 = null;
        }
        var6.field1405 = arg5.field224;
        var6.field1402 = arg2;
        var6.field1400 = arg5.field217;
        int var7 = arg5.field261;
        var6.field1404 = arg3 * 128;
        int var8 = arg5.field277;
        if (arg1 == 1 || arg1 == 3) {
            var8 = arg5.field261;
            var7 = arg5.field277;
        }
        var6.field1393 = (arg0 + var7) * 128;
        var6.field1406 = (arg3 + var8) * 128;
        var6.field1391 = arg0 * 128;
        if (arg5.field241 != null) {
            var6.field1385 = arg5;
            var6.method523(17015);
        }
        class111.field2601.method645(var6, (byte) 94);
        if (var6.field1405 != null) {
            var6.field1398 = var6.field1384 + (int) ((double) (var6.field1400 - var6.field1384) * Math.random());
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)V")
    public static final void method206(int arg0, int arg1, byte arg2) {
        if (arg2 < 2) {
            field562 = 99;
        }
        field558++;
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class144.field3425[var4] != null) {
                int var5 = class52.field1114 + 70 + 4 - var3 * 14;
                int var6 = field557[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class114 var7 = field563[var4];
                if (var7 != null && var7.method864(27, class50.field1035)) {
                    var7 = var7.method866(false, 5);
                }
                if (var7 != null && var7.method864(27, class79.field1788)) {
                    var7 = var7.method866(false, 5);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class12.field253 == 0 || class12.field253 == 1 && class24.method175((byte) 32, var7))) {
                    if (var5 - 14 < arg1 && arg1 <= var5 && !var7.method881(class7.field103.field3018, false)) {
                        class101.field2321++;
                        field551++;
                        if (class58.field1205 >= 1) {
                            class75.field1739++;
                            class3.method10(0, class101.method786((byte) 126, new class114[] { class128.field3073, var7 }), 0, (byte) 125, 17, class82.field1831, 0);
                        }
                        class3.method10(0, class101.method786((byte) 126, new class114[] { class128.field3073, var7 }), 0, (byte) 125, 2, class135.field3297, 0);
                        class3.method10(0, class101.method786((byte) 125, new class114[] { class128.field3073, var7 }), 0, (byte) 120, 7, class51.field1062, 0);
                    }
                    var3++;
                }
                if ((var6 == 3 || var6 == 7) && class26.field532 == 0 && (var6 == 7 || class130.field3149 == 0 || class130.field3149 == 1 && class24.method175((byte) 32, var7))) {
                    var3++;
                    if (var5 - 14 < arg1 && var5 >= arg1) {
                        field551++;
                        class101.field2321++;
                        if (class58.field1205 >= 1) {
                            class3.method10(0, class101.method786((byte) 127, new class114[] { class128.field3073, var7 }), 0, (byte) 119, 17, class82.field1831, 0);
                            class75.field1739++;
                        }
                        class3.method10(0, class101.method786((byte) 127, new class114[] { class128.field3073, var7 }), 0, (byte) 120, 2, class135.field3297, 0);
                        class3.method10(0, class101.method786((byte) 125, new class114[] { class128.field3073, var7 }), 0, (byte) 120, 7, class51.field1062, 0);
                    }
                }
                if (var6 == 4 && (class99.field2255 == 0 || class99.field2255 == 1 && class24.method175((byte) 32, var7))) {
                    var3++;
                    if (var5 - 14 < arg1 && arg1 <= var5) {
                        class122.field2865++;
                        class3.method10(0, class101.method786((byte) 126, new class114[] { class128.field3073, var7 }), 0, (byte) 122, 22, class67.field1443, 0);
                    }
                }
                if ((var6 == 5 || var6 == 6) && class26.field532 == 0 && class130.field3149 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class99.field2255 == 0 || class99.field2255 == 1 && class24.method175((byte) 32, var7))) {
                    var3++;
                    if (arg1 > var5 - 14 && arg1 <= var5) {
                        class9.field143++;
                        class3.method10(0, class101.method786((byte) 127, new class114[] { class128.field3073, var7 }), 0, (byte) 127, 27, class135.field3295, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static void method207(boolean arg0) {
        field563 = null;
        if (arg0) {
            field569 = null;
        }
        field557 = null;
        field555 = null;
        field569 = null;
        field571 = null;
        field570 = null;
        field553 = null;
        field572 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILhe;)V")
    public static final void method208(int arg0, int arg1, int arg2, class54 arg3) {
        field549++;
        if (arg2 != 23781) {
            return;
        }
        int var4 = arg0 * arg0 + arg1 * arg1;
        if (var4 <= 4225 || var4 >= 90000) {
            class78.method625((byte) 96, arg1, arg3, arg0);
            return;
        }
        int var5 = class92.field2159 + class69.field1505 & 0x7FF;
        int var6 = class134.field3272[var5];
        int var7 = class134.field3279[var5];
        int var8 = var7 * 256 / (class48.field997 + 256);
        int var9 = var6 * 256 / (class48.field997 + 256);
        int var10 = arg1 * var8 - arg0 * var9 >> 16;
        int var11 = arg0 * var8 + arg1 * var9 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class66.field1428.method388(var14 + 88, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;ZLpb;)V")
    public static final void method209(Component arg0, boolean arg1, class100 arg2) {
        field556++;
        if (class14.field308) {
            return;
        }
        class89.field1977 = class47.method343(class77.field1761, arg2, false, class36.field760);
        class24.field474 = class47.method343(class64.field1377, arg2, false, class36.field760);
        class49.field1021 = class47.method343(class72.field1596, arg2, false, class36.field760);
        class142.field3389 = class47.method343(class22.field432, arg2, false, class36.field760);
        class73.field1643 = class47.method343(class26.field524, arg2, !arg1, class36.field760);
        class103.field2405 = class47.method343(class145.field3448, arg2, false, class36.field760);
        class132.field3199 = class67.method538(-127, 479, 96, arg0);
        class24.field474.method722(0, 0);
        class118.field2773 = class67.method538(-111, 172, 156, arg0);
        class59.method425();
        class49.field1021.method722(0, 0);
        class58.field1207 = class67.method538(-116, 190, 261, arg0);
        class89.field1977.method722(0, 0);
        class121.field2834 = class67.method538(-89, 512, 334, arg0);
        class59.method425();
        class11.field187 = class67.method538(-100, 496, 50, arg0);
        class25.field514 = class67.method538(-100, 269, 37, arg0);
        class69.field1520 = class67.method538(-95, 249, 45, arg0);
        class54 var3 = class127.method985(arg2, class32.field656, class36.field760, arg1);
        class74.field1676 = class67.method538(-83, var3.field1128, var3.field1133, arg0);
        var3.method404(0, 0);
        class54 var4 = class127.method985(arg2, class140.field3340, class36.field760, true);
        class86.field1933 = class67.method538(-113, var4.field1128, var4.field1133, arg0);
        var4.method404(0, 0);
        class54 var5 = class127.method985(arg2, class85.field1890, class36.field760, arg1);
        class79.field1801 = class67.method538(-87, var5.field1128, var5.field1133, arg0);
        var5.method404(0, 0);
        class54 var6 = class127.method985(arg2, class103.field2402, class36.field760, true);
        class90.field2115 = class67.method538(-125, var6.field1128, var6.field1133, arg0);
        var6.method404(0, 0);
        class54 var7 = class127.method985(arg2, class126.field2988, class36.field760, arg1);
        class50.field1048 = class67.method538(-121, var7.field1128, var7.field1133, arg0);
        var7.method404(0, 0);
        class54 var8 = class127.method985(arg2, class100.field2297, class36.field760, true);
        class29.field580 = class67.method538(-75, var8.field1128, var8.field1133, arg0);
        var8.method404(0, 0);
        class54 var9 = class127.method985(arg2, class80.field1814, class36.field760, arg1);
        class20.field351 = class67.method538(-108, var9.field1128, var9.field1133, arg0);
        var9.method404(0, 0);
        class54 var10 = class127.method985(arg2, class66.field1433, class36.field760, true);
        class56.field1178 = class67.method538(-84, var10.field1128, var10.field1133, arg0);
        var10.method404(0, 0);
        class54 var11 = class127.method985(arg2, class122.field2870, class36.field760, true);
        client.field411 = class67.method538(-66, var11.field1128, var11.field1133, arg0);
        var11.method404(0, 0);
        class101.field2334 = class47.method343(class18.field342, arg2, false, class36.field760);
        class60.field1251 = class47.method343(class143.field3408, arg2, !arg1, class36.field760);
        class79.field1803 = class47.method343(class107.field2478, arg2, !arg1, class36.field760);
        class121.field2828 = class101.field2334.method721();
        class121.field2828.method725();
        class3.field34 = class60.field1251.method721();
        class3.field34.method725();
        class55.field1159 = class101.field2334.method721();
        class55.field1159.method723();
        class58.field1211 = class60.field1251.method721();
        class58.field1211.method723();
        class9.field131 = class79.field1803.method721();
        class9.field131.method723();
        class61.field1307 = class101.field2334.method721();
        class61.field1307.method725();
        class61.field1307.method723();
        class39.field826 = class60.field1251.method721();
        class39.field826.method725();
        class39.field826.method723();
        class25.field489 = class106.method811(class36.field760, class78.field1779, arg2, -105);
        class111.field2583 = new int[151];
        class109.field2522 = new int[33];
        class114.field2638 = new int[33];
        class50.field1050 = new int[151];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 0;
            int var18 = 999;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class49.field1021.field2171[class49.field1021.field2174 * var12 + var19] == 0) {
                    if (var18 == 999) {
                        var18 = var19;
                    }
                } else if (var18 != 999) {
                    var17 = var19;
                    break;
                }
            }
            class109.field2522[var12] = var18;
            class114.field2638[var12] = var17 - var18;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 0;
            int var15 = 999;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class49.field1021.field2171[class49.field1021.field2174 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var15 == 999) {
                        var15 = var16;
                    }
                } else if (var15 != 999) {
                    var14 = var16;
                    break;
                }
            }
            class50.field1050[var13 - 5] = var15 - 25;
            class111.field2583[var13 - 5] = var14 - var15;
        }
        class14.field308 = true;
    }

    @OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
    public final void run() {
        field566++;
        while (this.field552) {
            Object var1 = this.field550;
            synchronized (this.field550) {
                if (this.field567 < 500) {
                    this.field565[this.field567] = class100.field2289;
                    this.field561[this.field567] = class75.field1741;
                    this.field567++;
                }
            }
            class141.method1122(17525, 50L);
        }
    }
}
