import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class233 implements Runnable {

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lce;")
    private class246 field3698 = new class246();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public int field3700 = 0;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Z")
    private boolean field3704 = false;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field3703;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
    public static boolean field3694 = false;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Z")
    public static boolean field3684 = false;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lna;")
    public static class26 field3695 = class69.method505("brillant1:", (byte) -121);

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field3701 = 0;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Lna;")
    public static class26 field3702 = class69.method505("Chargement des sprites )2 ", (byte) -125);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
    public static int[] field3693;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lc;I)V", line = 5)
    private final void method1566(class304 arg0, int arg1) {
        field3683++;
        class246 var3 = this.field3698;
        synchronized (this.field3698) {
            if (arg1 != 104) {
                this.method1571(-114);
            }
            this.field3698.method1695(arg0, (byte) -127);
            this.field3700++;
            this.field3698.notifyAll();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBLve;Lve;)Lrk;", line = 30)
    public static final class175 method1567(int arg0, int arg1, byte arg2, class266 arg3, class266 arg4) {
        if (arg2 < 123) {
            field3684 = false;
        }
        field3699++;
        return class196.method1317(arg3, arg0, arg1, -30901) ? class246.method1696(-22376, arg4.method1889(arg1, (byte) -122, arg0)) : null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZIZ)V", line = 44)
    public static final void method1568(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field3689++;
        if (class8.field99 == arg2 && class116.field1829 == arg1 && class109.field1737 == arg0 || class324.method2250(45)) {
            return;
        }
        class8.field99 = arg2;
        class116.field1829 = arg1;
        class109.field1737 = arg0;
        if (class324.method2250(105)) {
            class109.field1737 = 0;
        }
        if (arg4) {
            class193.method1302(28, 5);
        } else {
            class193.method1302(25, 5);
        }
        class283.method1996((byte) -125, true, class115.field1810);
        int var7 = class165.field2568;
        int var8 = class12.field157;
        class165.field2568 = arg1 * 8 - 48;
        class12.field157 = (arg2 - 6) * 8;
        class135.field2072 = class246.method1700(class8.field99 * 8, (byte) 88, class116.field1829 * 8);
        int var9 = class165.field2568 - var7;
        int var10 = class12.field157 - var8;
        int var11 = class12.field157;
        int var12 = class165.field2568;
        class219.field3504 = null;
        if (arg4) {
            class81.field1270 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class324 var17 = class185.field2877[var16];
                if (var17 != null) {
                    var17.field3962 -= var10 * 128;
                    var17.field3972 -= var9 * 128;
                    if (var17.field3962 >= 0 && var17.field3962 <= 13184 && var17.field3972 >= 0 && var17.field3972 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field3904[var18] -= var10;
                            var17.field3890[var18] -= var9;
                        }
                        class316.field5412[class81.field1270++] = var16;
                    } else {
                        class185.field2877[var16].method2251(-1, (class187) null);
                        class185.field2877[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class324 var14 = class185.field2877[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field3904[var15] -= var10;
                        var14.field3890[var15] -= var9;
                    }
                    var14.field3962 -= var10 * 128;
                    var14.field3972 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class159 var20 = class268.field4427[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field3904[var21] -= var10;
                    var20.field3890[var21] -= var9;
                }
                var20.field3962 -= var10 * 128;
                var20.field3972 -= var9 * 128;
            }
        }
        class279.field4651 = arg0;
        class13.field221.method1084((byte) 126, arg5, false, arg3);
        byte var22 = 104;
        byte var23 = 0;
        byte var24 = 0;
        byte var25 = 1;
        byte var26 = 104;
        byte var27 = 1;
        if (var9 < 0) {
            var25 = -1;
            var26 = -1;
            var24 = 103;
        }
        if (var10 < 0) {
            var27 = -1;
            var23 = 103;
            var22 = -1;
        }
        for (int var28 = var23; var28 != var22; var28 += var27) {
            for (int var29 = var24; var29 != var26; var29 += var25) {
                int var30 = var10 + var28;
                int var31 = var9 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class268.field4433[var32][var28][var29] = class268.field4433[var32][var30][var31];
                    } else {
                        class268.field4433[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class69 var33 = (class69) class98.field1595.method264(-69); var33 != null; var33 = (class69) class98.field1595.method263(4)) {
            var33.field1066 -= var9;
            var33.field1082 -= var10;
            if (var33.field1082 < 0 || var33.field1066 < 0 || var33.field1082 >= 104 || var33.field1066 >= 104) {
                var33.method1006(-1024);
            }
        }
        if (arg4) {
            class324.field5589 -= var10 * 128;
            class14.field231 -= var9 * 128;
            class189.field2972 -= var9;
            class305.field5256 -= var10;
            class107.field1682 -= var9;
            class71.field1091 -= var10;
        } else {
            class37.field614 = 1;
        }
        class101.field1624 = 0;
        if (class64.field1020 != 0) {
            class7.field84 -= var9;
            class64.field1020 -= var10;
        }
        if (!arg6) {
            return;
        }
        if (class255.field4184 && arg4 && (Math.abs(var10) > 104 || Math.abs(var9) > 104)) {
            class292.method2053((byte) 64);
        }
        class258.field4202 = -1;
        class303.field5219.method253(-122);
        class18.field258.method253(-87);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Lda;", line = 293)
    public static final class120 method1569(byte arg0) {
        field3686++;
        class120 var1 = (class120) class136.field2080.method1692((byte) 100);
        if (var1 != null) {
            var1.method1006(-1024);
            var1.method722((byte) -107);
            return var1;
        } else if (arg0 == -36) {
            class120 var2;
            do {
                var2 = (class120) class138.field2114.method1692((byte) 63);
                if (var2 == null) {
                    return null;
                }
                if (var2.method825(true) > class128.method869((byte) -55)) {
                    return null;
                }
                var2.method1006(-1024);
                var2.method722((byte) -107);
            } while ((Long.MIN_VALUE & var2.field1564) == 0L);
            return var2;
        } else {
            return (class120) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lbe;Lna;I)Lna;", line = 340)
    public static final class26 method1570(class297 arg0, class26 arg1, int arg2) {
        if (~arg1.method182(class284.field4754, 102) != arg2) {
            label64: while (true) {
                int var3 = arg1.method182(class137.field2108, 55);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method182(class10.field142, 106);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method182(class228.field3599, 95);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method182(class209.field3234, 57);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method182(class219.field3496, 113);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method182(class267.field4411, arg2 ^ 0x32);
                                                        if (var8 == -1) {
                                                            break label64;
                                                        }
                                                        class26 var9 = class2.field18;
                                                        if (class157.field2455 != null) {
                                                            var9 = class317.method2198(class157.field2455.field2808, 0);
                                                            try {
                                                                if (class157.field2455.field2812 != null) {
                                                                    byte[] var10 = ((String) class157.field2455.field2812).getBytes("ISO-8859-1");
                                                                    var9 = class320.method2222(var10, -4114, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class236.method1587(new class26[] { arg1.method188(var8, 0, 0), var9, arg1.method187(var8 + 4, (byte) -74) }, (byte) -94);
                                                    }
                                                }
                                                arg1 = class236.method1587(new class26[] { arg1.method188(var7, 0, 0), class307.method2150(class51.method374((byte) -4, 4, arg0), (byte) -78), arg1.method187(var7 + 2, (byte) -74) }, (byte) -107);
                                            }
                                        }
                                        arg1 = class236.method1587(new class26[] { arg1.method188(var6, 0, 0), class307.method2150(class51.method374((byte) -109, 3, arg0), (byte) -78), arg1.method187(var6 + 2, (byte) -74) }, (byte) -70);
                                    }
                                }
                                arg1 = class236.method1587(new class26[] { arg1.method188(var5, 0, 0), class307.method2150(class51.method374((byte) 111, 2, arg0), (byte) -78), arg1.method187(var5 + 2, (byte) -74) }, (byte) -74);
                            }
                        }
                        arg1 = class236.method1587(new class26[] { arg1.method188(var4, 0, 0), class307.method2150(class51.method374((byte) 23, 1, arg0), (byte) -78), arg1.method187(var4 + 2, (byte) -74) }, (byte) -80);
                    }
                }
                arg1 = class236.method1587(new class26[] { arg1.method188(var3, arg2, 0), class307.method2150(class51.method374((byte) 107, 0, arg0), (byte) -78), arg1.method187(var3 + 2, (byte) -74) }, (byte) -89);
            }
        }
        field3692++;
        return arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 431)
    public final void method1571(int arg0) {
        this.field3704 = true;
        class246 var2 = this.field3698;
        synchronized (this.field3698) {
            this.field3698.notifyAll();
        }
        try {
            this.field3703.join();
        } catch (InterruptedException var5) {
        }
        this.field3703 = null;
        field3685++;
        if (arg0 != 3208) {
            this.field3703 = (Thread) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lge;I[BI)Lc;", line = 463)
    public final class304 method1572(class153 arg0, int arg1, byte[] arg2, int arg3) {
        field3697++;
        class304 var5 = new class304();
        var5.field5239 = arg2;
        var5.field926 = false;
        var5.field1564 = (long) arg3;
        var5.field5236 = arg0;
        var5.field5241 = arg1;
        this.method1566(var5, 104);
        return var5;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 479)
    public static void method1573(int arg0) {
        field3702 = null;
        if (arg0 == -16222) {
            field3695 = null;
            field3693 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILge;)Lc;", line = 491)
    public final class304 method1574(int arg0, int arg1, class153 arg2) {
        field3687++;
        class304 var4 = new class304();
        var4.field5236 = arg2;
        var4.field5241 = 3;
        var4.field926 = false;
        if (arg1 != -27447) {
            field3694 = false;
        }
        var4.field1564 = (long) arg0;
        this.method1566(var4, 104);
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lna;Z)V", line = 515)
    public static final void method1575(class26 arg0, boolean arg1) {
        field3682++;
        if (class201.field3119 >= 2) {
            if (arg0.method162(-128, class72.field1110)) {
                class74.method527(8);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class214.method1420((class26) null, 0, class236.method1587(new class26[] { class240.field3883, class149.method1019((byte) 9, var4), class203.field3166 }, (byte) -95), -1);
            }
            if (arg0.method162(-120, class250.field4089)) {
                class74.method527(8);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class214.method1420((class26) null, 0, class236.method1587(new class26[] { class298.field5135, class149.method1019((byte) 9, var7), class203.field3166 }, (byte) -94), -1);
                class327.method2281(1);
                class74.method527(8);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class214.method1420((class26) null, 0, class236.method1587(new class26[] { class154.field2408, class149.method1019((byte) 9, var9), class203.field3166 }, (byte) -104), -1);
            }
            if (arg0.method162(-113, class312.field5342)) {
                class214.method1420((class26) null, 0, class236.method1587(new class26[] { class168.field2600, class149.method1019((byte) 9, class97.method727((byte) 123)) }, (byte) -94), -1);
            }
            if (class255.field4184 && arg0.method162(-113, class148.field2312)) {
                System.out.println("oncard_geometry:" + class197.field3061);
                System.out.println("oncard_2d:" + class197.field3060);
                System.out.println("oncard_texture:" + class197.field3056);
            }
            if (arg0.method162(60, class73.field1125)) {
                class185.method1270(false);
            }
            if (arg0.method162(-118, class174.field2724)) {
                class258.field4212.method232(false);
            }
            if (arg0.method162(33, class100.field1613)) {
                class258.field4212.method222(true);
            }
            if (arg0.method162(-110, class313.field5347)) {
                class45.field712.method1051(0);
                class88.field1449.method2017(arg1);
                class258.field4212.method226(-29340);
            }
            if (arg0.method162(-115, class283.field4738)) {
                class132.field2016 = true;
            }
            if (arg0.method162(21, class218.field3487)) {
                class193.method1302(25, 5);
            }
            if (arg0.method162(-120, class258.field4203)) {
                class318.field5443 = true;
            }
            if (arg0.method162(-109, class41.field668)) {
                class318.field5443 = false;
            }
            if (arg0.method162(-120, class209.field3244)) {
                class86.method670(false, 0, -8914, -1, -1);
            }
            if (arg0.method162(-122, class317.field5433)) {
                class86.method670(false, 1, -8914, -1, -1);
            }
            if (arg0.method162(-106, class17.field248)) {
                class86.method670(false, 2, -8914, -1, -1);
            }
            if (arg0.method162(-121, class303.field5226)) {
                class86.method670(false, 3, -8914, 1024, 768);
            }
            if (arg0.method162(69, class198.field3077)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class218.field3479[var10].field3605[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.method189(class86.field1414, 0)) {
                class19.method127(arg0.method187(15, (byte) -74).method183((byte) -124));
                class298.method2106(class45.field712, (byte) 14);
                class272.field4543 = false;
            }
            if (arg0.method189(class115.field1821, 0) && class229.field3624 != 0) {
                class64.method484(arg0.method187(6, (byte) -74).method183((byte) -106), 1000);
            }
            if (arg0.method162(34, class81.field1269)) {
                throw new RuntimeException();
            }
            if (arg0.method189(class325.field5640, 0)) {
                class4.field42 = arg0.method187(12, (byte) -74).method195(1).method183((byte) -120);
                class214.method1420((class26) null, 0, class236.method1587(new class26[] { class10.field136, class149.method1019((byte) 9, class4.field42) }, (byte) -75), -1);
            }
            if (arg0.method162(104, class317.field5425)) {
                class299.field5146 = true;
            }
            if (arg0.method162(104, class88.field1453)) {
                if (class301.field5188) {
                    class301.field5188 = false;
                    class214.method1420((class26) null, 0, class58.field953, -1);
                } else {
                    class301.field5188 = true;
                    class214.method1420((class26) null, 0, class159.field2483, -1);
                }
            }
            if (arg0.method162(47, class283.field4725)) {
                if (class225.field3564) {
                    class250.field4092.method180(false);
                    class225.field3564 = false;
                } else {
                    class318.field5439.method180(false);
                    class225.field3564 = true;
                }
            }
        }
        class114.field1789.method1431(0, 44);
        class114.field1789.method591((byte) -38, arg0.method171(-83) - 1);
        class251.field4101++;
        class114.field1789.method584(0, arg0.method187(2, (byte) -74));
        if (arg1) {
            field3702 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lge;BI)Lc;", line = 732)
    public final class304 method1576(class153 arg0, byte arg1, int arg2) {
        field3696++;
        class304 var4 = new class304();
        var4.field5241 = 1;
        class246 var5 = this.field3698;
        synchronized (this.field3698) {
            if (arg1 < 39) {
                return (class304) null;
            }
            class304 var6 = (class304) this.field3698.method1692((byte) 100);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field1564 && var6.field5236 == arg0 && var6.field5241 == 2) {
                    var4.field5239 = var6.field5239;
                    var4.field930 = false;
                    return var4;
                }
                var6 = (class304) this.field3698.method1694(29);
            }
        }
        var4.field5239 = arg0.method1041(arg2, (byte) 85);
        var4.field930 = false;
        var4.field926 = true;
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "run", descriptor = "()V", line = 769)
    public final void run() {
        field3688++;
        while (!this.field3704) {
            class246 var1 = this.field3698;
            class304 var2;
            synchronized (this.field3698) {
                var2 = (class304) this.field3698.method1693(-1);
                if (var2 == null) {
                    try {
                        this.field3698.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3700--;
            }
            try {
                if (var2.field5241 == 2) {
                    var2.field5236.method1040((int) var2.field1564, var2.field5239.length, var2.field5239, (byte) -41);
                } else if (var2.field5241 == 3) {
                    var2.field5239 = var2.field5236.method1041((int) var2.field1564, (byte) -77);
                }
            } catch (Exception var6) {
                class302.method2124((String) null, var6, (byte) 111);
            }
            var2.field930 = false;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 844)
    public class233() {
        class180 var1 = class45.field712.method1054(0, 5, this);
        while (var1.field2811 == 0) {
            class126.method862(10L, 64);
        }
        if (var1.field2811 == 2) {
            throw new RuntimeException();
        }
        this.field3703 = (Thread) var1.field2812;
    }
}
