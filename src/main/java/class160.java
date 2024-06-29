import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class160 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    private int field2403 = 32;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Z")
    private boolean field2406 = false;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "J")
    private long field2401 = class464.method2773((byte) 103);

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[Lei;")
    private class116[] field2419 = new class116[8];

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Z")
    private boolean field2418 = true;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "[Lei;")
    private class116[] field2424 = new class116[8];

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    private int field2425 = 0;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "J")
    private long field2429 = 0L;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    private int field2426 = 0;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "J")
    private long field2431 = 0L;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    private int field2432 = 0;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field2427 = 1338;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lao;")
    public static class188 field2423 = new class188(35, -2);

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "Lvp;")
    public static class123 field2434 = new class123(23, 7);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lei;")
    private class116 field2404;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "[I")
    public int[] field2416;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
    public void method1148() {
        field2414++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final void method1149(int arg0) {
        if (arg0 != 0) {
            this.method1148();
        }
        this.field2418 = true;
        field2412++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLei;)V")
    public final synchronized void method1150(boolean arg0, class116 arg1) {
        field2413++;
        this.field2404 = arg1;
        if (arg0) {
            method1162(-50, 32, 28, -17, 93, false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
    public void method1151() throws Exception {
        field2405++;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()I")
    public int method1152() throws Exception {
        field2415++;
        return this.field2421;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public final synchronized void method1153(boolean arg0) {
        if (arg0) {
            return;
        }
        field2409++;
        if (this.field2406) {
            return;
        }
        long var2 = class464.method2773((byte) 103);
        try {
            if ((this.field2401 + 500000L) < var2) {
                this.field2401 = var2 - 500000L;
            }
            while (var2 > (this.field2401 + 5000L)) {
                this.method1157(!arg0, 256);
                this.field2401 += (256000 / class471.field6941);
            }
        } catch (Exception var7) {
            this.field2401 = var2;
        }
        if (this.field2416 == null) {
            return;
        }
        try {
            if (this.field2429 != 0L) {
                if (this.field2429 > var2) {
                    return;
                }
                this.method1161(this.field2421);
                this.field2418 = true;
                this.field2429 = 0L;
            }
            int var4 = this.method1152();
            if (this.field2420 < this.field2432 - var4) {
                this.field2420 = this.field2432 - var4;
            }
            int var5 = this.field2433 + this.field2422;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field2421) {
                this.field2421 += 1024;
                if (this.field2421 > 16384) {
                    this.field2421 = 16384;
                }
                this.method1148();
                this.method1161(this.field2421);
                var4 = 0;
                this.field2418 = true;
                if (this.field2421 < (var5 + 256)) {
                    var5 = this.field2421 - 256;
                    this.field2422 = var5 - this.field2433;
                }
            }
            while (var4 < var5) {
                this.method1155(this.field2416, 256);
                this.method1151();
                var4 += 256;
            }
            if (var2 > this.field2431) {
                if (this.field2418) {
                    this.field2418 = false;
                } else if (this.field2420 == 0 && this.field2426 == 0) {
                    this.method1148();
                    this.field2429 = var2 + 2000L;
                    return;
                } else {
                    this.field2422 = Math.min(this.field2426, this.field2420);
                    this.field2426 = this.field2420;
                }
                this.field2431 = var2 + 2000L;
                this.field2420 = 0;
            }
            this.field2432 = var4;
        } catch (Exception var6) {
            this.method1148();
            this.field2429 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1154(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, String arg6, int arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class142.field2111[var8] = class142.field2111[var8 - 1];
            class111.field1760[var8] = class111.field1760[var8 - 1];
            class168.field2526[var8] = class168.field2526[var8 - 1];
            class231.field3375[var8] = class231.field3375[var8 - 1];
            class415.field6138[var8] = class415.field6138[var8 - 1];
            class118.field1858[var8] = class118.field1858[var8 - 1];
            class383.field5692[var8] = class383.field5692[var8 - 1];
        }
        field2400++;
        class142.field2111[0] = arg7;
        class111.field1760[0] = arg4;
        if (arg0 != -10444) {
            return;
        }
        class168.field2526[0] = arg1;
        class231.field3375[0] = arg3;
        class415.field6138[0] = arg6;
        class471.field6940++;
        class461.field6808 = class285.field4130;
        class383.field5692[0] = arg2;
        class118.field1858[0] = arg5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([II)V")
    private final void method1155(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class275.field3991) {
            var3 = arg1 << 1;
        }
        class486.method2906(arg0, 0, var3);
        this.field2425 -= arg1;
        if (this.field2404 != null && this.field2425 <= 0) {
            this.field2425 += class471.field6941 >> 4;
            class14.method130(0, this.field2404);
            this.method1164(15187, this.field2404.method854(), this.field2404);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class116 var10 = null;
                        class116 var11 = this.field2424[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class521 var12 = var11.field1839;
                                if (var12 == null || var12.field7643 <= var8) {
                                    var11.field1842 = true;
                                    int var13 = var11.method223();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7643 += var13;
                                    }
                                    if (var4 >= this.field2403) {
                                        break label107;
                                    }
                                    class116 var14 = var11.method228();
                                    if (var14 != null) {
                                        int var15 = var11.field1840;
                                        while (var14 != null) {
                                            this.method1164(15187, var15 * var14.method854() >> 8, var14);
                                            var14 = var11.method222();
                                        }
                                    }
                                    class116 var16 = var11.field1841;
                                    var11.field1841 = null;
                                    if (var10 == null) {
                                        this.field2424[var7] = var16;
                                    } else {
                                        var10.field1841 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2419[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1841;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class116 var18 = this.field2424[var17];
                this.field2424[var17] = this.field2419[var17] = null;
                while (var18 != null) {
                    class116 var19 = var18.field1841;
                    var18.field1841 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2425 < 0) {
            this.field2425 = 0;
        }
        if (this.field2404 != null) {
            this.field2404.method231(arg0, 0, arg1);
        }
        this.field2401 = class464.method2773((byte) 103);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public final synchronized void method1156(int arg0) {
        field2411++;
        this.field2418 = true;
        try {
            this.method1158();
        } catch (Exception var2) {
            this.method1148();
            this.field2429 = class464.method2773((byte) 103) + 2000L;
        }
        if (arg0 != 8) {
            this.method1149(-87);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)V")
    private final void method1157(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2422 = -86;
        }
        field2407++;
        this.field2425 -= arg1;
        if (this.field2425 < 0) {
            this.field2425 = 0;
        }
        if (this.field2404 != null) {
            this.field2404.method224(arg1);
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
    public void method1158() throws Exception {
        field2428++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method1159(byte arg0) {
        field2417++;
        if (!class397.field5830.method1292(class399.field5865, -2) && class434.field6317 != class334.field5132) {
            class370.method2370(class251.field3624, 128, false, false, class351.field5335);
            return;
        }
        if (arg0 > -39) {
            field2434 = null;
        }
        class43.method330((byte) -21, class394.field5821);
        if (class434.field6317 != class169.field2537) {
            class335.method2202(-1);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public final synchronized void method1160(int arg0) {
        field2398++;
        if (class230.field3353 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class230.field3353.field1884[var3] == this) {
                    class230.field3353.field1884[var3] = null;
                }
                if (class230.field3353.field1884[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class230.field3353.field1880 = true;
                while (class230.field3353.field1878) {
                    class185.method1285(119, 50L);
                }
                class230.field3353 = null;
            }
        }
        if (arg0 > -109) {
            this.method1153(false);
        }
        this.method1148();
        this.field2416 = null;
        this.field2406 = true;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public void method1161(int arg0) throws Exception {
        field2402++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1162(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2408++;
        long var6 = (long) ((arg5 ? Integer.MIN_VALUE : 0) | arg4);
        class78 var8 = (class78) class156.field2367.method2485(45, var6);
        if (var8 == null) {
            var8 = new class78();
            class156.field2367.method2486(62, var8, var6);
        }
        if (arg1 >= var8.field1306.length) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field1306.length; var11++) {
                var9[var11] = var8.field1306[var11];
                var10[var11] = var8.field1302[var11];
            }
            for (int var12 = var8.field1306.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1302 = var10;
            var8.field1306 = var9;
        }
        var8.field1306[arg1] = arg0;
        var8.field1302[arg1] = arg2;
        if (arg3 != 1) {
            field2423 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1163(Component arg0) throws Exception {
        field2399++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILei;)V")
    private final void method1164(int arg0, int arg1, class116 arg2) {
        field2410++;
        if (arg0 != 15187) {
            return;
        }
        int var4 = arg1 >> 5;
        class116 var5 = this.field2419[var4];
        if (var5 == null) {
            this.field2424[var4] = arg2;
        } else {
            var5.field1841 = arg2;
        }
        this.field2419[var4] = arg2;
        arg2.field1840 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static void method1165(byte arg0) {
        field2423 = null;
        if (arg0 > -113) {
            method1165((byte) -55);
        }
        field2434 = null;
    }
}
