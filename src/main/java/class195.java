import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class195 {

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    private int field3557 = 32;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "J")
    private long field3566 = class224.method1536(false);

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "[Lfd;")
    private class219[] field3574 = new class219[8];

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    private int field3573 = 0;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "J")
    private long field3575 = 0L;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "[Lfd;")
    private class219[] field3572 = new class219[8];

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "J")
    private long field3578 = 0L;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    private int field3571 = 0;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    private int field3577 = 0;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    private int field3576 = 0;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "Z")
    private boolean field3581 = true;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lke;")
    public static class256 field3545 = class316.method2202("null", 27626);

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lke;")
    public static class256 field3563 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "Lng;")
    public static class138 field3568;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lfd;")
    private class219 field3546;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "[I")
    public int[] field3570;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 4)
    public final synchronized void method1404(byte arg0) {
        if (arg0 != -40) {
            return;
        }
        field3550++;
        if (class121.field2127 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class121.field2127.field4613[var3] == this) {
                    class121.field2127.field4613[var3] = null;
                }
                if (class121.field2127.field4613[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class121.field2127.field4607 = true;
                while (class121.field2127.field4609) {
                    class46.method381(50L, 72);
                }
                class121.field2127 = null;
            }
        }
        this.method231();
        this.field3570 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)V", line = 49)
    public static final void method1405(int arg0, byte arg1, int arg2) {
        field3565++;
        if (arg1 >= -16) {
            method1418(-65, (byte) 106);
        }
        for (int var3 = 0; var3 < class277.field4753; var3++) {
            class192 var4 = class252.method1695(var3, -31903);
            if (var4 != null) {
                int var5 = var4.field3522;
                if (var5 >= 0 && !class136.field2373.method205(var5, false)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field3499 >= 0) {
                    int var6 = var4.field3499;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + var7 + (var6 & 0x380);
                    var9 = class136.field2370[class90.method674(var8, -118, 96)];
                } else if (var5 >= 0) {
                    var9 = class136.field2370[class90.method674(class136.field2373.method190(var5, 65535), -61, 96)];
                } else if (var4.field3506 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field3506;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class136.field2370[class90.method674(var12, -69, 96)];
                }
                class163.field2898[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 124)
    public final synchronized void method1406(byte arg0) {
        if (arg0 != 127) {
            this.field3579 = -80;
        }
        this.field3581 = true;
        try {
            this.method227();
        } catch (Exception var3) {
            this.method231();
            this.field3575 = class224.method1536(false) + 2000L;
        }
        field3554++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 147)
    public static void method1407(int arg0) {
        field3568 = null;
        if (arg0 != 23734) {
            field3553 = -37;
        }
        field3545 = null;
        field3563 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B[S)[S", line = 159)
    public static final short[] method1408(byte arg0, short[] arg1) {
        if (arg0 != 53) {
            field3545 = (class256) null;
        }
        field3548++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class299.method2091(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()I", line = 181)
    public int method229() throws Exception {
        field3551++;
        return this.field3579;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lke;Z)Z", line = 197)
    public static final boolean method1409(class256 arg0, boolean arg1) {
        field3555++;
        if (arg0 == null) {
            return false;
        }
        if (!arg1) {
            method1407(-15);
        }
        for (int var2 = 0; var2 < class129.field2263; var2++) {
            if (arg0.method1769(class22.field284[var2], (byte) 64)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()V", line = 223)
    public void method231() {
        field3556++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(JI)V", line = 233)
    public static final void method1410(long arg0, int arg1) {
        field3558++;
        if (arg0 == 0L) {
            return;
        }
        if (class129.field2263 >= 100) {
            class274.method1895(0, 22156, class46.field844, class255.field4365);
            return;
        }
        class256 var3 = class290.method2018(7130, arg0).method1761(-92);
        if (arg1 >= -74) {
            field3553 = 10;
        }
        for (int var4 = 0; var4 < class129.field2263; var4++) {
            if (class62.field1090[var4] == arg0) {
                class274.method1895(0, 22156, class46.field844, class30.method214(new class256[] { var3, class277.field4769 }, 29784));
                return;
            }
        }
        for (int var5 = 0; var5 < class311.field5358; var5++) {
            if (class108.field1924[var5] == arg0) {
                class274.method1895(0, 22156, class46.field844, class30.method214(new class256[] { class250.field4251, var3, class24.field318 }, 29784));
                return;
            }
        }
        if (var3.method1806(false, class121.field2124.field2532)) {
            class274.method1895(0, 22156, class46.field844, class79.field1476);
            return;
        }
        class62.field1090[class129.field2263] = arg0;
        class39.field710++;
        class22.field284[class129.field2263++] = class290.method2018(7130, arg0);
        class7.field113 = class35.field549;
        class308.field5322.method1599(71, (byte) -72);
        class308.field5322.method330(255, arg0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILfd;)V", line = 296)
    private final void method1411(int arg0, int arg1, class219 arg2) {
        if (arg0 != 4) {
            this.method1413((int[]) null, 60);
        }
        field3561++;
        int var4 = arg1 >> 5;
        class219 var5 = this.field3572[var4];
        if (var5 == null) {
            this.field3574[var4] = arg2;
        } else {
            var5.field3862 = arg2;
        }
        this.field3572[var4] = arg2;
        arg2.field3861 = arg1;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 317)
    public void method232(int arg0) throws Exception {
        field3560++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V", line = 326)
    private final void method1412(byte arg0, int arg1) {
        field3547++;
        if (arg0 >= -54) {
            this.method1411(118, 70, (class219) null);
        }
        this.field3571 -= arg1;
        if (this.field3571 < 0) {
            this.field3571 = 0;
        }
        if (this.field3546 != null) {
            this.field3546.method912(arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([II)V", line = 349)
    private final void method1413(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class305.field5277) {
            var3 = arg1 << 1;
        }
        class299.method2089(arg0, 0, var3);
        this.field3571 -= arg1;
        if (this.field3546 != null && this.field3571 <= 0) {
            this.field3571 += class175.field3109 >> 4;
            class34.method236(this.field3546, (byte) 22);
            this.method1411(4, this.field3546.method918(), this.field3546);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class219 var10 = null;
                        class219 var11 = this.field3574[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field3860;
                                if (var12 == null || var12.field2253 <= var8) {
                                    var11.field3859 = true;
                                    int var13 = var11.method915();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2253 += var13;
                                    }
                                    if (var4 >= this.field3557) {
                                        break label105;
                                    }
                                    class219 var14 = var11.method913();
                                    if (var14 != null) {
                                        int var15 = var11.field3861;
                                        while (var14 != null) {
                                            this.method1411(4, var15 * var14.method918() >> 8, var14);
                                            var14 = var11.method934();
                                        }
                                    }
                                    class219 var16 = var11.field3862;
                                    var11.field3862 = null;
                                    if (var10 == null) {
                                        this.field3574[var7] = var16;
                                    } else {
                                        var10.field3862 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3572[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3862;
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
                class219 var18 = this.field3574[var17];
                this.field3574[var17] = this.field3572[var17] = null;
                while (var18 != null) {
                    class219 var19 = var18.field3862;
                    var18.field3862 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3571 < 0) {
            this.field3571 = 0;
        }
        if (this.field3546 != null) {
            this.field3546.method941(arg0, 0, arg1);
        }
        this.field3566 = class224.method1536(false);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 510)
    public void method226(Component arg0) throws Exception {
        field3559++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIB)Lke;", line = 529)
    public static final class256 method1414(int arg0, int arg1, byte arg2) {
        int var3 = arg0 - arg1;
        field3549++;
        if (var3 < -9) {
            return class129.field2262;
        } else if (var3 < -6) {
            return class66.field1170;
        } else if (var3 < -3) {
            return class164.field2903;
        } else if (var3 < 0) {
            return class246.field4195;
        } else if (var3 > 9) {
            return class255.field4362;
        } else if (var3 > 6) {
            return class239.field4072;
        } else if (var3 > 3) {
            return class28.field387;
        } else if (var3 > 0) {
            return class124.field2199;
        } else {
            if (arg2 > -81) {
                method1408((byte) -7, (short[]) null);
            }
            return class298.field5161;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V", line = 573)
    public final synchronized void method1415(byte arg0) {
        field3562++;
        if (this.field3570 == null) {
            return;
        }
        long var2 = class224.method1536(false);
        try {
            if (this.field3575 != 0L) {
                if (var2 < this.field3575) {
                    return;
                }
                this.method232(this.field3579);
                this.field3575 = 0L;
                this.field3581 = true;
            }
            if (arg0 >= -84) {
                this.method1417((class219) null, -110);
            }
            int var4 = this.method229();
            int var5 = this.field3582 + this.field3580;
            if (this.field3577 < (this.field3573 - var4)) {
                this.field3577 = this.field3573 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field3579) {
                var4 = 0;
                this.field3579 += 1024;
                if (this.field3579 > 16384) {
                    this.field3579 = 16384;
                }
                this.method231();
                this.method232(this.field3579);
                if ((var5 + 256) > this.field3579) {
                    var5 = this.field3579 - 256;
                    this.field3580 = var5 - this.field3582;
                }
                this.field3581 = true;
            }
            while (var4 < var5) {
                this.method1413(this.field3570, 256);
                this.method230();
                var4 += 256;
            }
            if (var2 > this.field3578) {
                if (this.field3581) {
                    this.field3581 = false;
                } else if (this.field3577 == 0 && this.field3576 == 0) {
                    this.method231();
                    this.field3575 = var2 + 2000L;
                    return;
                } else {
                    this.field3580 = Math.min(this.field3576, this.field3577);
                    this.field3576 = this.field3577;
                }
                this.field3577 = 0;
                this.field3578 = var2 + 2000L;
            }
            this.field3573 = var4;
        } catch (Exception var9) {
            this.method231();
            this.field3575 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field3566 + 500000L)) {
                var2 = this.field3566;
            }
            while (this.field3566 + 5000L < var2) {
                this.method1412((byte) -57, 256);
                this.field3566 += (long) (256000 / class175.field3109);
            }
        } catch (Exception var8) {
            this.field3566 = var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()V", line = 687)
    public void method227() throws Exception {
        field3552++;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V", line = 694)
    public final void method1416(byte arg0) {
        if (arg0 != -63) {
            this.field3546 = (class219) null;
        }
        field3567++;
        this.field3581 = true;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "()V", line = 707)
    public void method230() throws Exception {
        field3564++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lfd;I)V", line = 714)
    public final synchronized void method1417(class219 arg0, int arg1) {
        field3569++;
        this.field3546 = arg0;
        if (arg1 < 8) {
            method1418(43, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)Z", line = 725)
    public static final boolean method1418(int arg0, byte arg1) {
        field3544++;
        if (arg1 > -103) {
            method1418(103, (byte) 42);
        }
        return (arg0 & 0x1) != 0;
    }
}
