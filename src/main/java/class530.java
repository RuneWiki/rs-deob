import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class530 extends class448 {

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "Z")
    private boolean field7774 = false;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    private int field7780 = 0;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "Z")
    public boolean field7793 = false;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "Lvj;")
    public class304 field7803;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "J")
    private long field7796;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "Lvc;")
    public class206 field7784;

    @OriginalMember(owner = "client!ms", name = "Q", descriptor = "Ltg;")
    public class153 field7806;

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "Lqi;")
    public class398 field7798;

    @OriginalMember(owner = "client!ms", name = "R", descriptor = "Z")
    public static boolean field7807;

    @OriginalMember(owner = "client!ms", name = "U", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!ms", name = "W", descriptor = "[[S")
    public static short[][] field7812;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    private int field7775;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    private int field7776;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    private int field7778;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    private int field7779;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public int field7782;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    private int field7783;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    private int field7785;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
    private int field7788;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    private int field7789;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
    private int field7790;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    public int field7792;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
    public int field7794;

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
    public int field7795;

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    private int field7797;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    private int field7799;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
    private int field7800;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
    private int field7802;

    @OriginalMember(owner = "client!ms", name = "O", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
    private int field7805;

    @OriginalMember(owner = "client!ms", name = "S", descriptor = "I")
    private int field7808;

    @OriginalMember(owner = "client!ms", name = "T", descriptor = "I")
    private int field7809;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "Lgu;")
    public static class409 field7791;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "[Lf;")
    public static class529[] field7777;

    @OriginalMember(owner = "client!ms", name = "V", descriptor = "[[[I")
    public static int[][][] field7811;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public static void method3113(int arg0) {
        field7811 = null;
        field7777 = null;
        if (arg0 != 21006) {
            method3115(-116);
        }
        field7791 = null;
        field7812 = null;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
    public final void method3114(int arg0) {
        this.field7790 = this.field7803.field4166;
        this.field7788 = this.field7803.field4154;
        this.field7779 = this.field7803.field4151;
        this.field7799 = this.field7803.field4149;
        this.field7775 = this.field7803.field4162;
        this.field7797 = this.field7803.field4159;
        this.field7802 = this.field7803.field4156;
        this.field7776 = this.field7803.field4155;
        this.field7808 = this.field7803.field4164;
        field7781++;
        if (this.field7799 == this.field7790 && this.field7799 == this.field7797 && this.field7808 == this.field7788 && this.field7808 == this.field7776 && this.field7802 == this.field7775 && this.field7779 == this.field7775) {
            this.field7774 = true;
            return;
        }
        this.field7774 = false;
        if (arg0 != -32768) {
            return;
        }
        int var2 = (this.field7799 + this.field7790 + this.field7797) / 3;
        int var3 = (this.field7808 + this.field7788 + this.field7776) / 3;
        int var4 = (this.field7802 + this.field7775 + this.field7779) / 3;
        if (this.field7794 == var2 && this.field7792 == var3 && this.field7782 == var4) {
            return;
        }
        this.field7782 = var4;
        this.field7792 = var3;
        this.field7794 = var2;
        int var5 = this.field7799 - this.field7790;
        int var6 = this.field7808 - this.field7788;
        int var7 = this.field7775 - this.field7802;
        int var8 = this.field7797 - this.field7790;
        int var9 = this.field7776 - this.field7788;
        int var10 = this.field7779 - this.field7802;
        this.field7789 = var5 * var9 - (var6 * var8);
        this.field7809 = var7 * var8 - (var5 * var10);
        this.field7778 = var6 * var10 - (var7 * var9);
        while (this.field7778 > 32767 || this.field7809 > 32767 || this.field7789 > 32767 || this.field7778 < -32767 || this.field7809 < -32767 || this.field7789 < -32767) {
            this.field7789 >>= 0x1;
            this.field7778 >>= 0x1;
            this.field7809 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field7789 * this.field7789 + this.field7809 * this.field7809 + this.field7778 * this.field7778));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field7789 = this.field7789 * 32767 / var11;
        this.field7809 = this.field7809 * 32767 / var11;
        this.field7778 = this.field7778 * 32767 / var11;
        if (this.field7806.field2194 <= 0 && this.field7806.field2160 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field7789, (double) this.field7778) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field7809, Math.sqrt((double) (this.field7789 * this.field7789 + this.field7778 * this.field7778))) * 2607.5945876176133D);
        this.field7785 = this.field7806.field2194 - this.field7806.field2184;
        this.field7805 = this.field7806.field2184 + var12 - (this.field7785 >> 1);
        this.field7800 = this.field7806.field2160 - this.field7806.field2175;
        this.field7783 = this.field7806.field2175 + var13 - (this.field7800 >> 1);
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
    public static final void method3115(int arg0) {
        field7804++;
        if (class428.field6250) {
            return;
        }
        class76.method564((byte) 81, class22.field358);
        int var1 = -43 % ((-arg0 - 68) / 40);
        if (class336.field4640 != null) {
            class76.method564((byte) 89, class336.field4640);
        }
        class428.field6250 = true;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IJLqa;ZI)V")
    public final void method3116(int arg0, long arg1, class162 arg2, boolean arg3, int arg4) {
        if (this.field7793) {
            arg3 = false;
        } else if (this.field7806.field2153 > class233.field3232) {
            arg3 = false;
        } else if (class418.field6113 > class292.field3910[class233.field3232]) {
            arg3 = false;
        } else if (this.field7774) {
            arg3 = false;
        } else if (this.field7806.field2197 != -1) {
            int var7 = (int) (arg1 - this.field7796);
            if (this.field7806.field2167 || var7 <= this.field7806.field2197) {
                var7 %= this.field7806.field2197;
            } else {
                arg3 = false;
            }
            if (!this.field7806.field2166 && var7 < this.field7806.field2170) {
                arg3 = false;
            }
            if (this.field7806.field2166 && this.field7806.field2170 <= var7) {
                arg3 = false;
            }
        }
        field7786++;
        if (arg3) {
            this.field7780 += (int) ((double) arg4 * ((double) (this.field7806.field2205 - this.field7806.field2138) * Math.random() + (double) this.field7806.field2138));
            if (this.field7780 > 63) {
                int var8 = this.field7780 >> 6;
                this.field7780 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field7806.field2194 <= 0 && this.field7806.field2160 <= 0) {
                        var10 = this.field7778;
                        var11 = this.field7789;
                        var12 = this.field7809;
                    } else {
                        int var13 = this.field7805 + (int) (Math.random() * (double) this.field7785);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class377.field5316[var14];
                        int var16 = class377.field5315[var14];
                        int var17 = (int) ((double) this.field7800 * Math.random()) + this.field7783;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class377.field5316[var18];
                        int var20 = class377.field5315[var18];
                        byte var21 = 15;
                        var12 = (var20 << 0) * -1;
                        var10 = var16 * var19 >> var21;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var23 - var22;
                    int var25 = this.field7797 * var24 + this.field7790 * var22 + (this.field7799 * var23) >> 16;
                    int var26 = this.field7808 * var23 + (this.field7788 * var22 + (this.field7776 * var24)) >> 16;
                    int var27 = this.field7775 * var23 + this.field7802 * var22 + this.field7779 * var24 >> 16;
                    int var28 = (int) (Math.random() * (double) (this.field7806.field2143 - this.field7806.field2177)) + this.field7806.field2177;
                    int var29 = this.field7806.field2154 + (int) ((double) (this.field7806.field2164 - this.field7806.field2154) * Math.random());
                    int var30 = this.field7806.field2198 + (int) (Math.random() * (double) (this.field7806.field2179 - this.field7806.field2198));
                    int var31;
                    if (this.field7806.field2185) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field7806.field2155 + (double) this.field7806.field2186 * Math.random()) << 24 | (int) ((double) this.field7806.field2209 * var32 + (double) this.field7806.field2142) << 16 | (int) ((double) this.field7806.field2150 * var32 + (double) this.field7806.field2159) << 8 | (int) ((double) this.field7806.field2208 * var32 + (double) this.field7806.field2145);
                    } else {
                        var31 = (int) ((double) this.field7806.field2155 + (double) this.field7806.field2186 * Math.random()) << 24 | (int) ((double) this.field7806.field2150 * Math.random() + (double) this.field7806.field2159) << 8 | (int) (Math.random() * (double) this.field7806.field2209 + (double) this.field7806.field2142) << 16 | (int) ((double) this.field7806.field2208 * Math.random() + (double) this.field7806.field2145);
                    }
                    int var34 = this.field7806.field2163;
                    if (!arg2.method531() && !this.field7806.field2204) {
                        var34 = -1;
                    }
                    if (class141.field2013 == class14.field168) {
                        new class187(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field7806.field2158, this.field7806.field2149);
                    } else {
                        class187 var35 = class331.field4509[class14.field168];
                        class14.field168 = class14.field168 + 1 & 0x3FF;
                        var35.method1123(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field7806.field2158, this.field7806.field2149);
                    }
                }
            }
        }
        this.field7795 = 0;
        class187 var37 = (class187) this.field7798.method2306(115);
        if (arg0 > -59) {
            this.field7806 = null;
        }
        while (var37 != null) {
            var37.method1124(arg1, arg4);
            this.field7795++;
            var37 = (class187) this.field7798.method2302(-85);
        }
        class119.field1620 += this.field7795;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public static final void method3117(boolean arg0) {
        field7801++;
        class9 var1 = class380.field5354;
        synchronized (class380.field5354) {
            class380.field5354.method65(arg0);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BJ)V")
    public final void method3118(byte arg0, long arg1) {
        field7787++;
        for (class187 var4 = (class187) this.field7798.method2306(119); var4 != null; var4 = (class187) this.field7798.method2302(-113)) {
            var4.method1121(arg1);
        }
        if (arg0 != 66) {
            method3115(-79);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljb;)V")
    public static final void method3119(class340 arg0) {
        if (class34.field482 >= 65535) {
            return;
        }
        class432 var1 = arg0.field4681;
        class461.field6699[class34.field482] = arg0;
        class178.field2528[class34.field482] = false;
        class34.field482++;
        int var2 = arg0.field4683;
        if (arg0.field4694) {
            var2 = 0;
        }
        int var3 = arg0.field4683;
        if (arg0.field4690) {
            var3 = class401.field5574 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2572(false) + class77.field1110 - var1.method2574(false) >> class34.field484;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2572(false) + var1.method2574(false) - class77.field1110 >> class34.field484;
            if (var7 >= class472.field6900) {
                var7 = class472.field6900 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field4684[var5++];
                int var10 = (var1.method2578(true) + class77.field1110 - var1.method2574(false) >> class34.field484) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class469.field6860) {
                    var11 = class469.field6860 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class171.field2450[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class171.field2450[var4][var12][var8] = var13 | (long) class34.field482;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class171.field2450[var4][var12][var8] = var13 | (long) class34.field482 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class171.field2450[var4][var12][var8] = var13 | (long) class34.field482 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class171.field2450[var4][var12][var8] = var13 | (long) class34.field482 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lqa;Lvj;Lvc;J)V")
    public class530(class162 arg0, class304 arg1, class206 arg2, long arg3) {
        this.field7803 = arg1;
        this.field7796 = arg3;
        this.field7784 = arg2;
        this.field7806 = this.field7803.method1727(-117);
        if (!arg0.method531() && this.field7806.field2178 != -1) {
            this.field7806 = class465.method2729(this.field7806.field2178, false);
        }
        this.field7798 = new class398();
        this.field7780 = (int) ((double) this.field7780 + Math.random() * 64.0D);
        this.method3114(-32768);
    }

    static {
        new class83("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field7807 = false;
        field7810 = 0;
        field7812 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
    }
}
