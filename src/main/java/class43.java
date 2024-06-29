import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class43 extends class221 {

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
    public int[] field700 = new int[16];

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    private int field703 = 1000000;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "[I")
    private int[] field704 = new int[16];

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "[[Lvg;")
    private class254[][] field715 = new class254[16][128];

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "[I")
    private int[] field712 = new int[16];

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "[I")
    private int[] field734 = new int[16];

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "[I")
    private int[] field728 = new int[16];

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "[I")
    private int[] field732 = new int[16];

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "[I")
    public int[] field740 = new int[16];

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "[I")
    private int[] field724 = new int[16];

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[I")
    private int[] field698 = new int[16];

    @OriginalMember(owner = "client!dd", name = "xb", descriptor = "[I")
    private int[] field751 = new int[16];

    @OriginalMember(owner = "client!dd", name = "yb", descriptor = "[I")
    private int[] field752 = new int[16];

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    private int field735 = 256;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "[I")
    private int[] field722 = new int[16];

    @OriginalMember(owner = "client!dd", name = "Hb", descriptor = "[I")
    private int[] field761 = new int[16];

    @OriginalMember(owner = "client!dd", name = "wb", descriptor = "[[Lvg;")
    private class254[][] field750 = new class254[16][128];

    @OriginalMember(owner = "client!dd", name = "Jb", descriptor = "[I")
    public int[] field763 = new int[16];

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "[I")
    private int[] field733 = new int[16];

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "Lbd;")
    private class128 field706 = new class128();

    @OriginalMember(owner = "client!dd", name = "Mb", descriptor = "Lhk;")
    private class85 field766 = new class85(this);

    @OriginalMember(owner = "client!dd", name = "Bb", descriptor = "Ltg;")
    private class215 field755 = new class215(128);

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
    public static int field742 = 1;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "[S")
    public static short[] field710 = new short[500];

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lr;")
    private static class66 field719 = class93.method641(43, "Loading config )2 ");

    @OriginalMember(owner = "client!dd", name = "Gb", descriptor = "Z")
    public static boolean field760 = true;

    @OriginalMember(owner = "client!dd", name = "ub", descriptor = "Lr;")
    public static class66 field748 = field719;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!dd", name = "pb", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!dd", name = "qb", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!dd", name = "rb", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!dd", name = "sb", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!dd", name = "tb", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!dd", name = "vb", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!dd", name = "zb", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!dd", name = "Ab", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!dd", name = "Cb", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!dd", name = "Db", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!dd", name = "Fb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!dd", name = "Ib", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!dd", name = "Kb", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!dd", name = "Pb", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!dd", name = "Lb", descriptor = "J")
    private long field765;

    @OriginalMember(owner = "client!dd", name = "Nb", descriptor = "J")
    private long field767;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "Ljf;")
    private static class183 field737;

    @OriginalMember(owner = "client!dd", name = "Eb", descriptor = "Lsg;")
    public static class247 field758;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Lcj;")
    public static class28 field717;

    @OriginalMember(owner = "client!dd", name = "Ob", descriptor = "Z")
    private boolean field768;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    private final void method276(int arg0, int arg1, int arg2) {
        this.field722[arg0] = arg1;
        this.field700[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * (double) arg2 + 0.5D);
        field744++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        if (this.field706.method882()) {
            int var4 = this.field706.field2396 * this.field703 / class200.field3446;
            do {
                long var5 = this.field767 + ((long) arg2 * (long) var4);
                if ((this.field765 - var5) >= 0L) {
                    this.field767 = var5;
                    break;
                }
                int var7 = (int) ((this.field765 + ((long) var4) - this.field767 - 1L) / (long) var4);
                arg2 -= var7;
                this.field767 += (long) var4 * (long) var7;
                this.field766.method277(arg0, arg1, var7);
                this.method313(true);
                arg1 += var7;
            } while (this.field706.method882());
        }
        field696++;
        this.field766.method277(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()Lwd;")
    public final synchronized class221 method278() {
        field762++;
        return this.field766;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lvg;B)Z")
    public final boolean method279(class254 arg0, byte arg1) {
        field759++;
        if (arg1 != -42) {
            this.method300(-14, (byte) -120);
        }
        if (arg0.field4451 != null) {
            return false;
        }
        if (arg0.field4454 >= 0) {
            arg0.method560(-17554);
            if (arg0.field4445 > 0 && this.field715[arg0.field4459][arg0.field4445] == arg0) {
                this.field715[arg0.field4459][arg0.field4445] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBII)V")
    private final void method280(int arg0, byte arg1, int arg2, int arg3) {
        field697++;
        if (arg1 <= 32) {
            field710 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLvg;)I")
    private final int method281(boolean arg0, class254 arg1) {
        field699++;
        int var3 = (arg1.field4475 * arg1.field4447 >> 12) + arg1.field4455;
        int var4 = ((this.field704[arg1.field4459] - 8192) * this.field752[arg1.field4459] >> 12) + var3;
        class203 var5 = arg1.field4458;
        if (var5.field3482 > 0 && (var5.field3491 > 0 || this.field712[arg1.field4459] > 0)) {
            int var6 = var5.field3491 << 2;
            int var7 = var5.field3489 << 1;
            if (arg1.field4472 < var7) {
                var6 = arg1.field4472 * var6 / var7;
            }
            int var8 = (this.field712[arg1.field4459] >> 7) + var6;
            double var9 = Math.sin((double) (arg1.field4467 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        if (arg0) {
            int var11 = (int) ((double) (arg1.field4470.field3111 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class200.field3446 + 0.5D);
            return var11 < 1 ? 1 : var11;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    private final void method282(int arg0, int arg1) {
        if ((this.field763[arg1] & 0x2) != 0) {
            for (class254 var3 = (class254) this.field766.field1665.method873((byte) 76); var3 != null; var3 = (class254) this.field766.field1665.method870((byte) -118)) {
                if (var3.field4459 == arg1 && this.field750[arg1][var3.field4464] == null && var3.field4454 < 0) {
                    var3.field4454 = 0;
                }
            }
        }
        field749++;
        if (arg0 != 9773) {
            this.field722 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLle;Lbi;ILcj;)Z")
    public final synchronized boolean method283(byte arg0, class104 arg1, class133 arg2, int arg3, class28 arg4) {
        if (arg0 >= -6) {
            return true;
        }
        field739++;
        arg1.method721();
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        boolean var7 = true;
        for (class82 var8 = (class82) arg1.field2018.method1382(-32642); var8 != null; var8 = (class82) arg1.field2018.method1386((byte) -126)) {
            int var9 = (int) var8.field1560;
            class219 var10 = (class219) this.field755.method1381((long) var9, 85);
            if (var10 == null) {
                var10 = class48.method339(var9, true, arg4);
                if (var10 == null) {
                    var7 = false;
                    continue;
                }
                this.field755.method1380((byte) 126, var10, (long) var9);
            }
            if (!var10.method1406(arg2, var6, var8.field1588, (byte) 67)) {
                var7 = false;
            }
        }
        if (var7) {
            arg1.method720();
        }
        return var7;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public final synchronized void method284(byte arg0) {
        field743++;
        if (arg0 < 56) {
            this.field715 = null;
        }
        for (class219 var2 = (class219) this.field755.method1382(-32642); var2 != null; var2 = (class219) this.field755.method1386((byte) -113)) {
            var2.method1405(4);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
    public final synchronized int method285() {
        field708++;
        return 0;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V")
    private final void method286(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field733 = null;
        }
        for (class254 var3 = (class254) this.field766.field1665.method873((byte) 76); var3 != null; var3 = (class254) this.field766.field1665.method870((byte) -106)) {
            if (arg0 < 0 || var3.field4459 == arg0) {
                if (var3.field4451 != null) {
                    var3.field4451.method1743(class200.field3446 / 100);
                    if (var3.field4451.method1733()) {
                        this.field766.field1678.method1033(var3.field4451);
                    }
                    var3.method1704(2);
                }
                if (var3.field4454 < 0) {
                    this.field750[var3.field4459][var3.field4464] = null;
                }
                var3.method560(arg1 ^ 0x4491);
            }
        }
        field756++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
    public final synchronized void method287(int arg0, int arg1, int arg2) {
        field705++;
        this.method315(arg0, arg1, (byte) 35);
        if (arg2 < 19) {
            this.field706 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
    public final synchronized void method288(byte arg0, int arg1) {
        this.field735 = arg1;
        if (arg0 >= -105) {
            this.field750 = null;
        }
        field716++;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)V")
    private final void method289(int arg0, int arg1) {
        int var3 = arg1 & 0xF0;
        field745++;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = (arg1 & 0x7F06) >> 8;
            int var6 = arg1 >> 16 & 0x7F;
            this.method296(var5, var6, (byte) 87, var4);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = (arg1 & 0x7F38) >> 8;
            int var9 = (arg1 & 0x7FCF5D) >> 16;
            if (var9 <= 0) {
                this.method296(var8, 64, (byte) 101, var7);
            } else {
                this.method294(var7, var8, var9, 0);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = (arg1 & 0x7F435D) >> 16;
            int var12 = arg1 >> 8 & 0x7F;
            this.method280(var12, (byte) 85, var11, var10);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = arg1 >> 8 & 0x7F;
            int var15 = arg1 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field724[var13] = class115.method767(this.field724[var13], -2080769) + (var15 << 14);
            }
            if (var14 == 32) {
                this.field724[var13] = (var15 << 7) + class115.method767(-16257, this.field724[var13]);
            }
            if (var14 == 1) {
                this.field712[var13] = (var15 << 7) + class115.method767(-16257, this.field712[var13]);
            }
            if (var14 == 33) {
                this.field712[var13] = var15 + class115.method767(this.field712[var13], -128);
            }
            if (var14 == 5) {
                this.field728[var13] = (var15 << 7) + class115.method767(-16257, this.field728[var13]);
            }
            if (var14 == 37) {
                this.field728[var13] = var15 + class115.method767(this.field728[var13], -128);
            }
            if (var14 == 7) {
                this.field732[var13] = (var15 << 7) + class115.method767(this.field732[var13], -16257);
            }
            if (var14 == 39) {
                this.field732[var13] = class115.method767(this.field732[var13], -128) + var15;
            }
            if (var14 == 10) {
                this.field734[var13] = class115.method767(this.field734[var13], -16257) + (var15 << 7);
            }
            if (var14 == 42) {
                this.field734[var13] = class115.method767(-128, this.field734[var13]) + var15;
            }
            if (var14 == 11) {
                this.field698[var13] = class115.method767(this.field698[var13], -16257) + (var15 << 7);
            }
            if (var14 == 43) {
                this.field698[var13] = class115.method767(-128, this.field698[var13]) + var15;
            }
            if (var14 == 64) {
                if (var15 < 64) {
                    this.field763[var13] = class115.method767(this.field763[var13], -2);
                } else {
                    this.field763[var13] = class73.method521(this.field763[var13], 1);
                }
            }
            if (var14 == 65) {
                if (var15 >= 64) {
                    this.field763[var13] = class73.method521(this.field763[var13], 2);
                } else {
                    this.method282(9773, var13);
                    this.field763[var13] = class115.method767(this.field763[var13], -3);
                }
            }
            if (var14 == 99) {
                this.field761[var13] = (var15 << 7) + class115.method767(this.field761[var13], 127);
            }
            if (var14 == 98) {
                this.field761[var13] = class115.method767(this.field761[var13], 16256) + var15;
            }
            if (var14 == 101) {
                this.field761[var13] = (var15 << 7) + (class115.method767(127, this.field761[var13]) + 16384);
            }
            if (var14 == 100) {
                this.field761[var13] = class115.method767(this.field761[var13], 16256) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method286(var13, -1);
            }
            if (var14 == 121) {
                this.method303((byte) -24, var13);
            }
            if (var14 == 123) {
                this.method300(var13, (byte) 5);
            }
            if (var14 == 6) {
                int var16 = this.field761[var13];
                if (var16 == 16384) {
                    this.field752[var13] = class115.method767(-16257, this.field752[var13]) + (var15 << 7);
                }
            }
            if (var14 == 38) {
                int var17 = this.field761[var13];
                if (var17 == 16384) {
                    this.field752[var13] = class115.method767(-128, this.field752[var13]) + var15;
                }
            }
            if (var14 == 16) {
                this.field740[var13] = (var15 << 7) + class115.method767(-16257, this.field740[var13]);
            }
            if (var14 == 48) {
                this.field740[var13] = var15 + class115.method767(-128, this.field740[var13]);
            }
            if (var14 == 81) {
                if (var15 < 64) {
                    this.method304(var13, (byte) 86);
                    this.field763[var13] = class115.method767(this.field763[var13], -5);
                } else {
                    this.field763[var13] = class73.method521(this.field763[var13], 4);
                }
            }
            if (var14 == 17) {
                this.method276(var13, (this.field722[var13] & 0xFFFFC07F) + (var15 << 7), 2097152);
            }
            if (var14 == 49) {
                this.method276(var13, (this.field722[var13] & 0xFFFFFF80) + var15, 2097152);
            }
        } else if (arg0 == -5420) {
            if (var3 == 192) {
                int var18 = arg1 & 0xF;
                int var19 = arg1 >> 8 & 0x7F;
                this.method293(this.field724[var18] + var19, var18, (byte) 56);
            } else if (var3 == 208) {
                int var20 = arg1 & 0xF;
                int var21 = (arg1 & 0x7F87) >> 8;
                this.method291(var20, 6, var21);
            } else if (var3 == 224) {
                int var22 = arg1 & 0xF;
                int var23 = ((arg1 & 0x7F01BA) >> 9) + (arg1 >> 8 & 0x7F);
                this.method312(var22, true, var23);
            } else {
                int var24 = arg1 & 0xFF;
                if (var24 == 255) {
                    this.method314(arg0 ^ 0xFFFFD195);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class165.field2972 = arg2;
        class241.field4186 = arg1;
        field754++;
        class215.field3706 = arg4;
        if (arg3 != 20685) {
            field758 = null;
        }
        class222.field3788 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(III)V")
    private final void method291(int arg0, int arg1, int arg2) {
        field713++;
        if (arg1 != 6) {
            this.method304(29, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lvg;ZB)V")
    public final void method292(class254 arg0, boolean arg1, byte arg2) {
        field701++;
        int var4 = arg0.field4470.field3109.length;
        if (arg2 <= 18) {
            method311((class237) null, (byte) 14, -77);
        }
        int var7;
        if (arg1 && arg0.field4470.field3110) {
            int var5 = var4 + var4 - arg0.field4470.field3107;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field740[arg0.field4459] * (long) var5 >> 6);
            if (var6 <= var7) {
                arg0.field4451.method1760(true);
                var7 = var6 - (1 - var6) - var7;
            }
        } else {
            var7 = (int) ((long) this.field740[arg0.field4459] * (long) var4 >> 6);
        }
        arg0.field4451.method1747(var7);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIB)V")
    private final void method293(int arg0, int arg1, byte arg2) {
        if (this.field751[arg1] != arg0) {
            this.field751[arg1] = arg0;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field715[arg1][var4] = null;
            }
        }
        field729++;
        int var5 = -24 / ((3 - arg2) / 47);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
    private final void method294(int arg0, int arg1, int arg2, int arg3) {
        this.method296(arg1, 64, (byte) 110, arg0);
        field727++;
        if ((this.field763[arg0] & 0x2) != 0) {
            for (class254 var5 = (class254) this.field766.field1665.method869(arg3 ^ 0x7768); var5 != null; var5 = (class254) this.field766.field1665.method860((byte) -75)) {
                if (var5.field4459 == arg0 && var5.field4454 < 0) {
                    this.field750[arg0][var5.field4464] = null;
                    this.field750[arg0][arg1] = var5;
                    int var6 = (var5.field4475 * var5.field4447 >> 12) + var5.field4455;
                    var5.field4455 += arg1 - var5.field4464 << 8;
                    var5.field4464 = arg1;
                    var5.field4475 = var6 - var5.field4455;
                    var5.field4447 = 4096;
                    return;
                }
            }
        }
        class219 var7 = (class219) this.field755.method1381((long) this.field751[arg0], 72);
        if (var7 == null) {
            return;
        }
        class177 var8 = var7.field3756[arg1];
        if (var8 == null) {
            return;
        }
        class254 var9 = new class254();
        var9.field4459 = arg0;
        var9.field4470 = var8;
        var9.field4460 = var7;
        var9.field4458 = var7.field3767[arg1];
        var9.field4445 = var7.field3760[arg1];
        var9.field4464 = arg1;
        var9.field4474 = var7.field3755[arg1] * var7.field3764 * arg2 * arg2 + 1024 >> 11;
        var9.field4444 = var7.field3765[arg1] & 0xFF;
        var9.field4455 = (arg1 << 8) - (var7.field3754[arg1] & 0x7FFF);
        var9.field4465 = 0;
        var9.field4463 = 0;
        var9.field4454 = -1;
        var9.field4453 = 0;
        var9.field4468 = 0;
        if (this.field740[arg0] == 0) {
            var9.field4451 = class258.method1742(var8, this.method281(true, var9), this.method305((byte) -116, var9), this.method306((byte) -57, var9));
        } else {
            var9.field4451 = class258.method1742(var8, this.method281(true, var9), 0, this.method306((byte) -93, var9));
            this.method292(var9, var7.field3754[arg1] < 0, (byte) 93);
        }
        if (var7.field3754[arg1] < 0) {
            var9.field4451.method1727(-1);
        }
        if (arg3 <= var9.field4445) {
            class254 var10 = this.field715[arg0][var9.field4445];
            if (var10 != null && var10.field4454 < 0) {
                this.field750[arg0][var10.field4464] = null;
                var10.field4454 = 0;
            }
            this.field715[arg0][var9.field4445] = var9;
        }
        this.field766.field1665.method866(var9, true);
        this.field750[arg0][arg1] = var9;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public final synchronized void method295(boolean arg0) {
        for (class219 var2 = (class219) this.field755.method1382(-32642); var2 != null; var2 = (class219) this.field755.method1386((byte) -114)) {
            var2.method560(-17554);
        }
        field702++;
        if (!arg0) {
            this.method283((byte) -100, (class104) null, (class133) null, -35, (class28) null);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBI)V")
    private final void method296(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 82) {
            this.method278();
        }
        field709++;
        class254 var5 = this.field750[arg3][arg0];
        if (var5 == null) {
            return;
        }
        this.field750[arg3][arg0] = null;
        if ((this.field763[arg3] & 0x2) == 0) {
            var5.field4454 = 0;
            return;
        }
        for (class254 var6 = (class254) this.field766.field1665.method873((byte) 76); var6 != null; var6 = (class254) this.field766.field1665.method870((byte) 42)) {
            if (var5.field4459 == var6.field4459 && var6.field4454 < 0 && var5 != var6) {
                var5.field4454 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Lfh;")
    private static final class184 method297(int arg0, byte arg1) {
        class184 var2 = (class184) class33.field498.method1505((long) arg0, (byte) -76);
        field753++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field3119.method135(arg0, 0, 26);
        class184 var4 = new class184();
        if (var3 != null) {
            var4.method1228(new class249(var3), (byte) -93);
        }
        if (arg1 >= 0) {
            return null;
        } else {
            class33.field498.method1497((long) arg0, (byte) 111, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public final synchronized void method298(int arg0) {
        field721++;
        this.field706.method889();
        this.method314(15169);
        if (arg0 < 46) {
            this.field740 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)I")
    public final int method299(int arg0) {
        field707++;
        return arg0 > -29 ? -61 : this.field735;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)V")
    private final void method300(int arg0, byte arg1) {
        for (class254 var3 = (class254) this.field766.field1665.method873((byte) 76); var3 != null; var3 = (class254) this.field766.field1665.method870((byte) -121)) {
            if ((arg0 < 0 || var3.field4459 == arg0) && var3.field4454 < 0) {
                this.field750[var3.field4459][var3.field4464] = null;
                var3.field4454 = 0;
            }
        }
        field747++;
        if (arg1 != 5) {
            this.method306((byte) 50, (class254) null);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILvg;B[I)Z")
    public final boolean method301(int arg0, int arg1, class254 arg2, byte arg3, int[] arg4) {
        field711++;
        if (arg3 != -68) {
            this.field764 = -70;
        }
        arg2.field4462 = class200.field3446 / 100;
        if (arg2.field4454 >= 0 && (arg2.field4451 == null || arg2.field4451.method1750())) {
            arg2.method1704(2);
            arg2.method560(arg3 - 17486);
            if (arg2.field4445 > 0 && this.field715[arg2.field4459][arg2.field4445] == arg2) {
                this.field715[arg2.field4459][arg2.field4445] = null;
            }
            return true;
        }
        int var6 = arg2.field4447;
        boolean var7 = false;
        if (var6 > 0) {
            int var8 = var6 - (int) (Math.pow(2.0D, (double) this.field728[arg2.field4459] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var8 < 0) {
                var8 = 0;
            }
            arg2.field4447 = var8;
        }
        arg2.field4451.method1751(this.method281(true, arg2));
        arg2.field4472++;
        class203 var9 = arg2.field4458;
        arg2.field4467 += var9.field3482;
        double var10 = (double) ((arg2.field4464 - 60 << 8) + (arg2.field4475 * arg2.field4447 >> 12)) * 5.086263020833333E-6D;
        if (var9.field3483 > 0) {
            if (var9.field3476 > 0) {
                arg2.field4468 += (int) (Math.pow(2.0D, (double) var9.field3476 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field4468 += 128;
            }
            if (arg2.field4468 * var9.field3483 >= 819200) {
                var7 = true;
            }
        }
        if (var9.field3481 != null) {
            if (var9.field3492 <= 0) {
                arg2.field4465 += 128;
            } else {
                arg2.field4465 += (int) (Math.pow(2.0D, (double) var9.field3492 * var10) * 128.0D + 0.5D);
            }
            while (var9.field3481.length - 2 > arg2.field4453 && (var9.field3481[arg2.field4453 + 2] & 0xFF << 8) < arg2.field4465) {
                arg2.field4453 += 2;
            }
            if ((var9.field3481.length - 2) == arg2.field4453 && var9.field3481[arg2.field4453 + 1] == 0) {
                var7 = true;
            }
        }
        if (arg2.field4454 >= 0 && var9.field3479 != null && (this.field763[arg2.field4459] & 0x1) == 0 && (arg2.field4445 < 0 || this.field715[arg2.field4459][arg2.field4445] != arg2)) {
            if (var9.field3488 > 0) {
                arg2.field4454 += (int) (Math.pow(2.0D, (double) var9.field3488 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field4454 += 128;
            }
            while (var9.field3479.length - 2 > arg2.field4463 && arg2.field4454 > (var9.field3479[arg2.field4463 + 2] & 0xFF << 8)) {
                arg2.field4463 += 2;
            }
            if (var9.field3479.length - 2 == arg2.field4463) {
                var7 = true;
            }
        }
        if (!var7) {
            arg2.field4451.method1744(arg2.field4462, this.method305((byte) -110, arg2), this.method306((byte) -105, arg2));
            return false;
        }
        arg2.field4451.method1743(arg2.field4462);
        if (arg4 == null) {
            arg2.field4451.method302(arg0);
        } else {
            arg2.field4451.method277(arg4, arg1, arg0);
        }
        if (arg2.field4451.method1733()) {
            this.field766.field1678.method1033(arg2.field4451);
        }
        arg2.method1704(2);
        if (arg2.field4454 >= 0) {
            arg2.method560(-17554);
            if (arg2.field4445 > 0 && this.field715[arg2.field4459][arg2.field4445] == arg2) {
                this.field715[arg2.field4459][arg2.field4445] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public final synchronized void method302(int arg0) {
        field725++;
        if (this.field706.method882()) {
            int var2 = this.field706.field2396 * this.field703 / class200.field3446;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field767;
                if ((this.field765 - var3) >= 0L) {
                    this.field767 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field765 - this.field767 - 1L) / (long) var2);
                arg0 -= var5;
                this.field767 += (long) var2 * (long) var5;
                this.field766.method302(var5);
                this.method313(true);
            } while (this.field706.method882());
        }
        this.field766.method302(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(BI)V")
    private final void method303(byte arg0, int arg1) {
        field726++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method303((byte) -83, var3);
            }
            return;
        }
        this.field732[arg1] = 12800;
        this.field734[arg1] = 8192;
        this.field698[arg1] = 16383;
        this.field704[arg1] = 8192;
        this.field712[arg1] = 0;
        this.field728[arg1] = 8192;
        this.method282(9773, arg1);
        this.method304(arg1, (byte) 38);
        this.field763[arg1] = 0;
        this.field761[arg1] = 32767;
        this.field752[arg1] = 256;
        if (arg0 >= -13) {
            this.field750 = null;
        }
        this.field740[arg1] = 0;
        this.method276(arg1, 8192, 2097152);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(IB)V")
    private final void method304(int arg0, byte arg1) {
        if ((this.field763[arg0] & 0x4) != 0) {
            for (class254 var3 = (class254) this.field766.field1665.method873((byte) 76); var3 != null; var3 = (class254) this.field766.field1665.method870((byte) -125)) {
                if (var3.field4459 == arg0) {
                    var3.field4446 = 0;
                }
            }
        }
        field720++;
        if (arg1 <= 2) {
            this.field732 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLvg;)I")
    private final int method305(byte arg0, class254 arg1) {
        field718++;
        int var3 = this.field732[arg1.field4459] * this.field698[arg1.field4459] + 4096 >> 13;
        class203 var4 = arg1.field4458;
        int var5 = var3 * var3 + 16384 >> 15;
        int var6 = arg1.field4474 * var5 + 16384 >> 15;
        int var7 = this.field735 * var6 + 128 >> 8;
        if (var4.field3483 > 0) {
            var7 = (int) (Math.pow(0.5D, (double) arg1.field4468 * 1.953125E-5D * (double) var4.field3483) * (double) var7 + 0.5D);
        }
        if (var4.field3481 != null) {
            int var8 = var4.field3481[arg1.field4453 + 1];
            int var9 = arg1.field4465;
            if (arg1.field4453 < (var4.field3481.length - 2)) {
                int var10 = var4.field3481[arg1.field4453] & 0xFF << 8;
                int var11 = (var4.field3481[arg1.field4453 + 2] & 0xFF) << 8;
                var8 += (var9 - var10) * (var4.field3481[arg1.field4453 + 3] - var8) / (var11 - var10);
            }
            var7 = var7 * var8 + 32 >> 6;
        }
        if (arg0 > -108) {
            this.method315(91, -118, (byte) 69);
        }
        if (arg1.field4454 > 0 && var4.field3479 != null) {
            int var12 = arg1.field4454;
            int var13 = var4.field3479[arg1.field4463 + 1];
            if (arg1.field4463 < var4.field3479.length - 2) {
                int var14 = var4.field3479[arg1.field4463] & 0xFF << 8;
                int var15 = (var4.field3479[arg1.field4463 + 2] & 0xFF) << 8;
                var13 += (var4.field3479[arg1.field4463 + 3] - var13) * (var12 - var14) / (var15 - var14);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(BLvg;)I")
    private final int method306(byte arg0, class254 arg1) {
        if (arg0 >= -53) {
            return 79;
        } else {
            int var3 = this.field734[arg1.field4459];
            field746++;
            return var3 < 8192 ? arg1.field4444 * var3 + 32 >> 6 : 16384 - ((128 - arg1.field4444) * (16384 - var3) + 32 >> 6);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method307(byte arg0) {
        field719 = null;
        if (arg0 < 88) {
            return;
        }
        field710 = null;
        field758 = null;
        field717 = null;
        field748 = null;
        field737 = null;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()Lwd;")
    public final synchronized class221 method308() {
        field757++;
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)Z")
    public final synchronized boolean method309(int arg0) {
        field741++;
        if (arg0 != -1) {
            this.method314(-85);
        }
        return this.field706.method882();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZZLle;)V")
    public final synchronized void method310(boolean arg0, boolean arg1, class104 arg2) {
        field695++;
        this.method298(111);
        this.field706.method886(arg2.field2017);
        this.field768 = arg0;
        this.field767 = 0L;
        int var4 = this.field706.method885();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field706.method884(var5);
            this.field706.method891(var5);
            this.field706.method894(var5);
        }
        this.field769 = this.field706.method883();
        this.field764 = this.field706.field2394[this.field769];
        if (!arg1) {
            method290(127, 87, -12, 35, -28);
        }
        this.field765 = this.field706.method892(this.field764);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lwj;BI)V")
    public static final void method311(class237 arg0, byte arg1, int arg2) {
        field738++;
        Object[] var3 = arg0.field4118;
        int var4 = (Integer) var3[0];
        class94 var5 = class136.method938(var4, (byte) 109);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class127.field2381 = 0;
        int var7 = -1;
        int[] var8 = var5.field1808;
        byte var9 = -1;
        int[] var10 = var5.field1811;
        int var11 = 0;
        try {
            int var12 = 0;
            class237.field4129 = new class66[var5.field1804];
            class172.field3043 = new int[var5.field1813];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field4121;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field4113;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field4120 == null ? -1 : arg0.field4120.field1115;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field4127;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field4120 == null ? -1 : arg0.field4120.field1190;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field4125 == null ? -1 : arg0.field4125.field1115;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field4125 == null ? -1 : arg0.field4125.field1190;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field4111;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field4122;
                    }
                    class172.field3043[var12++] = var16;
                } else if (var3[var14] instanceof class66) {
                    class66 var15 = (class66) var3[var14];
                    if (var15.method463(class147.field2678, (byte) 101)) {
                        var15 = arg0.field4115;
                    }
                    class237.field4129[var13++] = var15;
                }
            }
            if (arg1 != 124) {
                field730 = -17;
            }
            int var17 = 0;
            label3402: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var451 = var10[var7];
                if (var451 < 100) {
                    if (var451 == 0) {
                        class99.field1931[var6++] = var8[var7];
                        continue;
                    }
                    if (var451 == 1) {
                        int var18 = var8[var7];
                        class99.field1931[var6++] = class89.field1726[var18];
                        continue;
                    }
                    if (var451 == 2) {
                        int var19 = var8[var7];
                        var6--;
                        class187.method1234(var19, class99.field1931[var6], arg1 - 219);
                        continue;
                    }
                    if (var451 == 3) {
                        class151.field2709[var11++] = var5.field1809[var7];
                        continue;
                    }
                    if (var451 == 6) {
                        var7 += var8[var7];
                        continue;
                    }
                    if (var451 == 7) {
                        var6 -= 2;
                        if (class99.field1931[var6 + 1] != class99.field1931[var6]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var451 == 8) {
                        var6 -= 2;
                        if (class99.field1931[var6 + 1] == class99.field1931[var6]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var451 == 9) {
                        var6 -= 2;
                        if (class99.field1931[var6 + 1] > class99.field1931[var6]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var451 == 10) {
                        var6 -= 2;
                        if (class99.field1931[var6] > class99.field1931[var6 + 1]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var451 == 21) {
                        if (class127.field2381 == 0) {
                            return;
                        }
                        class155 var20 = class12.field145[--class127.field2381];
                        var7 = var20.field2759;
                        class237.field4129 = var20.field2761;
                        class172.field3043 = var20.field2754;
                        var5 = var20.field2756;
                        var10 = var5.field1811;
                        var8 = var5.field1808;
                        continue;
                    }
                    if (var451 == 25) {
                        int var21 = var8[var7];
                        class99.field1931[var6++] = class226.method1440(var21, false);
                        continue;
                    }
                    if (var451 == 27) {
                        int var22 = var8[var7];
                        var6--;
                        class178.method1192(var22, 0, class99.field1931[var6]);
                        continue;
                    }
                    if (var451 == 31) {
                        var6 -= 2;
                        if (class99.field1931[var6] <= class99.field1931[var6 + 1]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var451 == 32) {
                        var6 -= 2;
                        if (class99.field1931[var6] >= class99.field1931[var6 + 1]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var451 == 33) {
                        class99.field1931[var6++] = class172.field3043[var8[var7]];
                        continue;
                    }
                    int var10001;
                    if (var451 == 34) {
                        var10001 = var8[var7];
                        var6--;
                        class172.field3043[var10001] = class99.field1931[var6];
                        continue;
                    }
                    if (var451 == 35) {
                        class151.field2709[var11++] = class237.field4129[var8[var7]];
                        continue;
                    }
                    if (var451 == 36) {
                        var10001 = var8[var7];
                        var11--;
                        class237.field4129[var10001] = class151.field2709[var11];
                        continue;
                    }
                    if (var451 == 37) {
                        int var23 = var8[var7];
                        var11 -= var23;
                        class66 var24 = class256.method1714(true, var11, class151.field2709, var23);
                        class151.field2709[var11++] = var24;
                        continue;
                    }
                    if (var451 == 38) {
                        var6--;
                        continue;
                    }
                    if (var451 == 39) {
                        var11--;
                        continue;
                    }
                    if (var451 == 40) {
                        int var25 = var8[var7];
                        class94 var26 = class136.method938(var25, (byte) 61);
                        int[] var27 = new int[var26.field1813];
                        class66[] var28 = new class66[var26.field1804];
                        for (int var29 = 0; var29 < var26.field1807; var29++) {
                            var27[var29] = class99.field1931[var29 + var6 - var26.field1807];
                        }
                        for (int var30 = 0; var30 < var26.field1805; var30++) {
                            var28[var30] = class151.field2709[var11 + var30 - var26.field1805];
                        }
                        var6 -= var26.field1807;
                        var11 -= var26.field1805;
                        class155 var31 = new class155();
                        var31.field2756 = var5;
                        var31.field2754 = class172.field3043;
                        var31.field2759 = var7;
                        var31.field2761 = class237.field4129;
                        if (class12.field145.length <= class127.field2381) {
                            throw new RuntimeException();
                        }
                        class12.field145[class127.field2381++] = var31;
                        var7 = -1;
                        var5 = var26;
                        class237.field4129 = var28;
                        var8 = var26.field1808;
                        class172.field3043 = var27;
                        var10 = var26.field1811;
                        continue;
                    }
                    if (var451 == 42) {
                        class99.field1931[var6++] = class61.field1038[var8[var7]];
                        continue;
                    }
                    if (var451 == 43) {
                        int var32 = var8[var7];
                        var6--;
                        class61.field1038[var32] = class99.field1931[var6];
                        class88.method621((byte) -117, var32);
                        continue;
                    }
                    if (var451 == 44) {
                        int var33 = var8[var7] >> 16;
                        int var34 = var8[var7] & 0xFFFF;
                        var6--;
                        int var35 = class99.field1931[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class180.field3152[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3402;
                                }
                                class4.field51[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var451 == 45) {
                        int var38 = var8[var7];
                        var6--;
                        int var39 = class99.field1931[var6];
                        if (var39 >= 0 && class180.field3152[var38] > var39) {
                            class99.field1931[var6++] = class4.field51[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var451 == 46) {
                        var6 -= 2;
                        int var40 = class99.field1931[var6];
                        int var41 = var8[var7];
                        if (var40 >= 0 && var40 < class180.field3152[var41]) {
                            class4.field51[var41][var40] = class99.field1931[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var451 == 47) {
                        class66 var42 = class247.field4313[var8[var7]];
                        if (var42 == null) {
                            var42 = class60.field1023;
                        }
                        class151.field2709[var11++] = var42;
                        continue;
                    }
                    if (var451 == 48) {
                        int var43 = var8[var7];
                        var11--;
                        class247.field4313[var43] = class151.field2709[var11];
                        class21.method98(arg1 - 252, var43);
                        continue;
                    }
                    if (var451 == 51) {
                        class215 var44 = var5.field1814[var8[var7]];
                        var6--;
                        class49 var45 = (class49) var44.method1381((long) class99.field1931[var6], -86);
                        if (var45 != null) {
                            var7 += var45.field873;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var8[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var451 < 300) {
                    if (var451 == 100) {
                        var6 -= 3;
                        int var429 = class99.field1931[var6];
                        int var430 = class99.field1931[var6 + 1];
                        int var431 = class99.field1931[var6 + 2];
                        if (var430 == 0) {
                            throw new RuntimeException();
                        }
                        class63 var432 = class54.method367(var429, (byte) -80);
                        if (var432.field1092 == null) {
                            var432.field1092 = new class63[var431 + 1];
                        }
                        if (var432.field1092.length <= var431) {
                            class63[] var433 = new class63[var431 + 1];
                            for (int var434 = 0; var434 < var432.field1092.length; var434++) {
                                var433[var434] = var432.field1092[var434];
                            }
                            var432.field1092 = var433;
                        }
                        if (var431 > 0 && var432.field1092[var431 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var431 - 1));
                        }
                        class63 var435 = new class63();
                        var435.field1219 = var430;
                        var435.field1122 = var435.field1115 = var432.field1115;
                        var435.field1186 = true;
                        var435.field1190 = var431;
                        var432.field1092[var431] = var435;
                        if (var46) {
                            class245.field4275 = var435;
                        } else {
                            class173.field3048 = var435;
                        }
                        class215.method1385(var432, arg1 ^ 0xFFFFFFF8);
                        continue;
                    }
                    if (var451 == 101) {
                        class63 var436 = var46 ? class245.field4275 : class173.field3048;
                        if (var436.field1190 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class63 var437 = class54.method367(var436.field1115, (byte) -80);
                        var437.field1092[var436.field1190] = null;
                        class215.method1385(var437, -117);
                        continue;
                    }
                    if (var451 == 102) {
                        var6--;
                        class63 var438 = class54.method367(class99.field1931[var6], (byte) -80);
                        var438.field1092 = null;
                        class215.method1385(var438, arg1 ^ 0xFFFFFFF1);
                        continue;
                    }
                    if (var451 == 200) {
                        var6 -= 2;
                        int var439 = class99.field1931[var6];
                        int var440 = class99.field1931[var6 + 1];
                        class63 var441 = class218.method1401(var439, false, var440);
                        if (var441 != null && var440 != -1) {
                            class99.field1931[var6++] = 1;
                            if (var46) {
                                class245.field4275 = var441;
                            } else {
                                class173.field3048 = var441;
                            }
                            continue;
                        }
                        class99.field1931[var6++] = 0;
                        continue;
                    }
                    if (var451 == 201) {
                        var6--;
                        int var442 = class99.field1931[var6];
                        class63 var443 = class54.method367(var442, (byte) -80);
                        if (var443 == null) {
                            class99.field1931[var6++] = 0;
                        } else {
                            class99.field1931[var6++] = 1;
                            if (var46) {
                                class245.field4275 = var443;
                            } else {
                                class173.field3048 = var443;
                            }
                        }
                        continue;
                    }
                } else if (var451 < 500) {
                    if (var451 == 403) {
                        var6 -= 2;
                        int var47 = class99.field1931[var6];
                        if (var47 >= 7) {
                            var47 -= 7;
                        }
                        int var48 = class99.field1931[var6 + 1];
                        class207.field3595.field811.method697(var47, var48, -27345);
                        continue;
                    }
                    if (var451 == 404) {
                        var6 -= 2;
                        int var49 = class99.field1931[var6];
                        int var50 = class99.field1931[var6 + 1];
                        class207.field3595.field811.method694(var49, 41, var50);
                        continue;
                    }
                    if (var451 == 410) {
                        var6--;
                        boolean var51 = class99.field1931[var6] != 0;
                        class207.field3595.field811.method692(var51, 87);
                        continue;
                    }
                } else if (!(var451 < 1000 || var451 >= 1100) || !(var451 < 2000 || var451 >= 2100)) {
                    class63 var52;
                    if (var451 >= 2000) {
                        var451 -= 1000;
                        var6--;
                        var52 = class54.method367(class99.field1931[var6], (byte) -80);
                    } else {
                        var52 = var46 ? class245.field4275 : class173.field3048;
                    }
                    if (var451 == 1000) {
                        var6 -= 4;
                        var52.field1133 = class99.field1931[var6];
                        var52.field1237 = class99.field1931[var6 + 1];
                        int var53 = class99.field1931[var6 + 2];
                        int var54 = class99.field1931[var6 + 3];
                        if (var53 < 0) {
                            var53 = 0;
                        } else if (var53 > 5) {
                            var53 = 5;
                        }
                        if (var54 < 0) {
                            var54 = 0;
                        } else if (var54 > 5) {
                            var54 = 5;
                        }
                        var52.field1227 = (byte) var53;
                        var52.field1143 = (byte) var54;
                        class215.method1385(var52, -125);
                        class98.method675(-127, var52);
                        continue;
                    }
                    if (var451 == 1001) {
                        var6 -= 4;
                        var52.field1096 = class99.field1931[var6];
                        var52.field1222 = class99.field1931[var6 + 1];
                        var52.field1206 = 0;
                        var52.field1116 = 0;
                        int var55 = class99.field1931[var6 + 2];
                        int var56 = class99.field1931[var6 + 3];
                        if (var55 < 0) {
                            var55 = 0;
                        } else if (var55 > 4) {
                            var55 = 4;
                        }
                        if (var56 < 0) {
                            var56 = 0;
                        } else if (var56 > 4) {
                            var56 = 4;
                        }
                        var52.field1102 = (byte) var55;
                        var52.field1134 = (byte) var56;
                        class215.method1385(var52, -116);
                        class98.method675(-127, var52);
                        if (var52.field1219 == 0) {
                            class69.method503(-1, false, var52);
                        }
                        continue;
                    }
                    if (var451 == 1003) {
                        var6--;
                        boolean var57 = class99.field1931[var6] == 1;
                        if (var52.field1087 != var57) {
                            var52.field1087 = var57;
                            class215.method1385(var52, -125);
                        }
                        continue;
                    }
                    if (var451 == 1004) {
                        var6 -= 2;
                        var52.field1172 = class99.field1931[var6];
                        var52.field1091 = class99.field1931[var6 + 1];
                        class215.method1385(var52, -127);
                        class98.method675(-126, var52);
                        if (var52.field1219 == 0) {
                            class69.method503(-1, false, var52);
                        }
                        continue;
                    }
                } else if (!(var451 < 1100 || var451 >= 1200) || !(var451 < 2100 || var451 >= 2200)) {
                    class63 var426;
                    if (var451 >= 2000) {
                        var6--;
                        var426 = class54.method367(class99.field1931[var6], (byte) -80);
                        var451 -= 1000;
                    } else {
                        var426 = var46 ? class245.field4275 : class173.field3048;
                    }
                    if (var451 == 1100) {
                        var6 -= 2;
                        var426.field1170 = class99.field1931[var6];
                        if ((var426.field1211 - var426.field1215) < var426.field1170) {
                            var426.field1170 = var426.field1211 - var426.field1215;
                        }
                        if (var426.field1170 < 0) {
                            var426.field1170 = 0;
                        }
                        var426.field1141 = class99.field1931[var6 + 1];
                        if (var426.field1117 - var426.field1196 < var426.field1141) {
                            var426.field1141 = var426.field1117 - var426.field1196;
                        }
                        if (var426.field1141 < 0) {
                            var426.field1141 = 0;
                        }
                        class215.method1385(var426, arg1 ^ 0xFFFFFFFD);
                        continue;
                    }
                    if (var451 == 1101) {
                        var6--;
                        var426.field1155 = class99.field1931[var6];
                        class215.method1385(var426, -126);
                        continue;
                    }
                    if (var451 == 1102) {
                        var6--;
                        var426.field1189 = class99.field1931[var6] == 1;
                        class215.method1385(var426, -118);
                        continue;
                    }
                    if (var451 == 1103) {
                        var6--;
                        var426.field1098 = class99.field1931[var6];
                        class215.method1385(var426, -124);
                        continue;
                    }
                    if (var451 == 1104) {
                        var6--;
                        var426.field1145 = class99.field1931[var6];
                        class215.method1385(var426, -119);
                        continue;
                    }
                    if (var451 == 1105) {
                        var6--;
                        var426.field1163 = class99.field1931[var6];
                        class215.method1385(var426, arg1 - 241);
                        continue;
                    }
                    if (var451 == 1106) {
                        var6--;
                        var426.field1168 = class99.field1931[var6];
                        class215.method1385(var426, -121);
                        continue;
                    }
                    if (var451 == 1107) {
                        var6--;
                        var426.field1150 = class99.field1931[var6] == 1;
                        class215.method1385(var426, -117);
                        continue;
                    }
                    if (var451 == 1108) {
                        var426.field1188 = 1;
                        var6--;
                        var426.field1126 = class99.field1931[var6];
                        class215.method1385(var426, -117);
                        continue;
                    }
                    if (var451 == 1109) {
                        var6 -= 6;
                        var426.field1104 = class99.field1931[var6];
                        var426.field1165 = class99.field1931[var6 + 1];
                        var426.field1187 = class99.field1931[var6 + 2];
                        var426.field1137 = class99.field1931[var6 + 3];
                        var426.field1176 = class99.field1931[var6 + 4];
                        var426.field1085 = class99.field1931[var6 + 5];
                        class215.method1385(var426, -114);
                        continue;
                    }
                    if (var451 == 1110) {
                        var6--;
                        int var427 = class99.field1931[var6];
                        if (var426.field1154 != var427) {
                            var426.field1079 = 0;
                            var426.field1094 = 0;
                            var426.field1154 = var427;
                            class215.method1385(var426, -126);
                        }
                        continue;
                    }
                    if (var451 == 1111) {
                        var6--;
                        var426.field1136 = class99.field1931[var6] == 1;
                        class215.method1385(var426, arg1 - 240);
                        continue;
                    }
                    if (var451 == 1112) {
                        var11--;
                        class66 var428 = class151.field2709[var11];
                        if (!var428.method463(var426.field1204, (byte) 127)) {
                            var426.field1204 = var428;
                            class215.method1385(var426, -119);
                        }
                        continue;
                    }
                    if (var451 == 1113) {
                        var6--;
                        var426.field1224 = class99.field1931[var6];
                        class215.method1385(var426, -126);
                        continue;
                    }
                    if (var451 == 1114) {
                        var6 -= 3;
                        var426.field1100 = class99.field1931[var6];
                        var426.field1153 = class99.field1931[var6 + 1];
                        var426.field1112 = class99.field1931[var6 + 2];
                        class215.method1385(var426, -125);
                        continue;
                    }
                    if (var451 == 1115) {
                        var6--;
                        var426.field1084 = class99.field1931[var6] == 1;
                        class215.method1385(var426, -121);
                        continue;
                    }
                    if (var451 == 1116) {
                        var6--;
                        var426.field1182 = class99.field1931[var6];
                        class215.method1385(var426, -126);
                        continue;
                    }
                    if (var451 == 1117) {
                        var6--;
                        var426.field1229 = class99.field1931[var6];
                        class215.method1385(var426, -126);
                        continue;
                    }
                    if (var451 == 1118) {
                        var6--;
                        var426.field1142 = class99.field1931[var6] == 1;
                        class215.method1385(var426, -128);
                        continue;
                    }
                    if (var451 == 1119) {
                        var6--;
                        var426.field1148 = class99.field1931[var6] == 1;
                        class215.method1385(var426, -125);
                        continue;
                    }
                    if (var451 == 1120) {
                        var6 -= 2;
                        var426.field1211 = class99.field1931[var6];
                        var426.field1117 = class99.field1931[var6 + 1];
                        class215.method1385(var426, -120);
                        if (var426.field1219 == 0) {
                            class69.method503(-1, false, var426);
                        }
                        continue;
                    }
                    if (var451 == 1121) {
                        class215.method1385(var426, -117);
                        var6 -= 2;
                        continue;
                    }
                    if (var451 == 1122) {
                        var6--;
                        var426.field1088 = class99.field1931[var6] == 1;
                        class215.method1385(var426, -123);
                        continue;
                    }
                } else if (!(var451 < 1200 || var451 >= 1300) || !(var451 < 2200 || var451 >= 2300)) {
                    class63 var422;
                    if (var451 >= 2000) {
                        var451 -= 1000;
                        var6--;
                        var422 = class54.method367(class99.field1931[var6], (byte) -80);
                    } else {
                        var422 = var46 ? class245.field4275 : class173.field3048;
                    }
                    class215.method1385(var422, -119);
                    if (var451 == 1200 || var451 == 1205) {
                        var6 -= 2;
                        int var423 = class99.field1931[var6];
                        int var424 = class99.field1931[var6 + 1];
                        if (var423 == -1) {
                            var422.field1121 = -1;
                            var422.field1126 = -1;
                            var422.field1188 = 1;
                        } else {
                            var422.field1121 = var423;
                            var422.field1238 = var424;
                            class157 var425 = class40.method242(-25672, var423);
                            var422.field1187 = var425.field2840;
                            if (var451 == 1205) {
                                var422.field1108 = false;
                            } else {
                                var422.field1108 = true;
                            }
                            var422.field1104 = var425.field2809;
                            var422.field1176 = var425.field2806;
                            var422.field1085 = var425.field2787;
                            var422.field1137 = var425.field2846;
                            if (var422.field1116 > 0) {
                                var422.field1085 = var422.field1085 * 32 / var422.field1116;
                            } else if (var422.field1096 > 0) {
                                var422.field1085 = var422.field1085 * 32 / var422.field1096;
                            }
                            var422.field1165 = var425.field2842;
                        }
                        continue;
                    }
                    if (var451 == 1201) {
                        var422.field1188 = 2;
                        var6--;
                        var422.field1126 = class99.field1931[var6];
                        continue;
                    }
                    if (var451 == 1202) {
                        var422.field1188 = 3;
                        var422.field1126 = class207.field3595.field811.method699(true);
                        continue;
                    }
                    if (var451 == 1203) {
                        var422.field1188 = 6;
                        var6--;
                        var422.field1126 = class99.field1931[var6];
                        continue;
                    }
                    if (var451 == 1204) {
                        var422.field1188 = 5;
                        var6--;
                        var422.field1126 = class99.field1931[var6];
                        continue;
                    }
                } else if ((var451 < 1300 || var451 >= 1400) && (var451 < 2300 || var451 >= 2400)) {
                    if (var451 >= 1400 && var451 < 1500 || var451 >= 2400 && var451 < 2500) {
                        class63 var58;
                        if (var451 < 2000) {
                            var58 = var46 ? class245.field4275 : class173.field3048;
                        } else {
                            var451 -= 1000;
                            var6--;
                            var58 = class54.method367(class99.field1931[var6], (byte) -80);
                        }
                        var11--;
                        class66 var59 = class151.field2709[var11];
                        int[] var60 = null;
                        if (var59.method460((byte) -114) > 0 && var59.method448(var59.method460((byte) -117) - 1, 7178) == 89) {
                            var6--;
                            int var61 = class99.field1931[var6];
                            if (var61 > 0) {
                                var60 = new int[var61];
                                while ((var61--) > 0) {
                                    var6--;
                                    var60[var61] = class99.field1931[var6];
                                }
                            }
                            var59 = var59.method477(0, (byte) -74, var59.method460((byte) -112) - 1);
                        }
                        Object[] var62 = new Object[var59.method460((byte) -107) + 1];
                        for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                            if (var59.method448(var63 - 1, 7178) == 115) {
                                var11--;
                                var62[var63] = class151.field2709[var11];
                            } else {
                                var6--;
                                var62[var63] = Integer.valueOf(class99.field1931[var6]);
                            }
                        }
                        var6--;
                        int var64 = class99.field1931[var6];
                        if (var64 == -1) {
                            var62 = null;
                        } else {
                            var62[0] = Integer.valueOf(var64);
                        }
                        if (var451 == 1400) {
                            var58.field1111 = var62;
                        } else if (var451 == 1401) {
                            var58.field1144 = var62;
                        } else if (var451 == 1402) {
                            var58.field1113 = var62;
                        } else if (var451 == 1403) {
                            var58.field1107 = var62;
                        } else if (var451 == 1404) {
                            var58.field1095 = var62;
                        } else if (var451 == 1405) {
                            var58.field1130 = var62;
                        } else if (var451 == 1406) {
                            var58.field1129 = var62;
                        } else if (var451 == 1407) {
                            var58.field1109 = var62;
                            var58.field1110 = var60;
                        } else if (var451 == 1408) {
                            var58.field1201 = var62;
                        } else if (var451 == 1409) {
                            var58.field1179 = var62;
                        } else if (var451 == 1410) {
                            var58.field1101 = var62;
                        } else if (var451 == 1411) {
                            var58.field1234 = var62;
                        } else if (var451 == 1412) {
                            var58.field1161 = var62;
                        } else if (var451 == 1414) {
                            var58.field1210 = var60;
                            var58.field1160 = var62;
                        } else if (var451 == 1415) {
                            var58.field1184 = var62;
                            var58.field1214 = var60;
                        } else if (var451 == 1416) {
                            var58.field1236 = var62;
                        } else if (var451 == 1417) {
                            var58.field1171 = var62;
                        } else if (var451 == 1418) {
                            var58.field1135 = var62;
                        } else if (var451 == 1419) {
                            var58.field1191 = var62;
                        } else if (var451 == 1420) {
                            var58.field1166 = var62;
                        } else if (var451 == 1421) {
                            var58.field1194 = var62;
                        } else if (var451 == 1422) {
                            var58.field1197 = var62;
                        } else if (var451 == 1423) {
                            var58.field1220 = var62;
                        } else if (var451 == 1424) {
                            var58.field1093 = var62;
                        } else if (var451 == 1425) {
                            var58.field1195 = var62;
                        } else if (var451 == 1426) {
                            var58.field1124 = var62;
                        } else if (var451 == 1427) {
                            var58.field1125 = var62;
                        } else if (var451 == 1428) {
                            var58.field1223 = var60;
                            var58.field1198 = var62;
                        } else if (var451 == 1429) {
                            var58.field1103 = var60;
                            var58.field1158 = var62;
                        }
                        var58.field1174 = true;
                        continue;
                    }
                    if (var451 < 1600) {
                        class63 var65 = var46 ? class245.field4275 : class173.field3048;
                        if (var451 == 1500) {
                            class99.field1931[var6++] = var65.field1138;
                            continue;
                        }
                        if (var451 == 1501) {
                            class99.field1931[var6++] = var65.field1226;
                            continue;
                        }
                        if (var451 == 1502) {
                            class99.field1931[var6++] = var65.field1215;
                            continue;
                        }
                        if (var451 == 1503) {
                            class99.field1931[var6++] = var65.field1196;
                            continue;
                        }
                        if (var451 == 1504) {
                            class99.field1931[var6++] = var65.field1087 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 1505) {
                            class99.field1931[var6++] = var65.field1122;
                            continue;
                        }
                    } else if (var451 < 1700) {
                        class63 var66 = var46 ? class245.field4275 : class173.field3048;
                        if (var451 == 1600) {
                            class99.field1931[var6++] = var66.field1170;
                            continue;
                        }
                        if (var451 == 1601) {
                            class99.field1931[var6++] = var66.field1141;
                            continue;
                        }
                        if (var451 == 1602) {
                            class151.field2709[var11++] = var66.field1204;
                            continue;
                        }
                        if (var451 == 1603) {
                            class99.field1931[var6++] = var66.field1211;
                            continue;
                        }
                        if (var451 == 1604) {
                            class99.field1931[var6++] = var66.field1117;
                            continue;
                        }
                        if (var451 == 1605) {
                            class99.field1931[var6++] = var66.field1085;
                            continue;
                        }
                        if (var451 == 1606) {
                            class99.field1931[var6++] = var66.field1187;
                            continue;
                        }
                        if (var451 == 1607) {
                            class99.field1931[var6++] = var66.field1176;
                            continue;
                        }
                        if (var451 == 1608) {
                            class99.field1931[var6++] = var66.field1137;
                            continue;
                        }
                        if (var451 == 1609) {
                            class99.field1931[var6++] = var66.field1098;
                            continue;
                        }
                    } else if (var451 < 1800) {
                        class63 var417 = var46 ? class245.field4275 : class173.field3048;
                        if (var451 == 1700) {
                            class99.field1931[var6++] = var417.field1121;
                            continue;
                        }
                        if (var451 == 1701) {
                            if (var417.field1121 == -1) {
                                class99.field1931[var6++] = 0;
                            } else {
                                class99.field1931[var6++] = var417.field1238;
                            }
                            continue;
                        }
                        if (var451 == 1702) {
                            class99.field1931[var6++] = var417.field1190;
                            continue;
                        }
                    } else if (var451 < 1900) {
                        class63 var415 = var46 ? class245.field4275 : class173.field3048;
                        if (var451 == 1800) {
                            class99.field1931[var6++] = class45.method328(120, client.method592(var415));
                            continue;
                        }
                        if (var451 == 1801) {
                            var6--;
                            int var416 = class99.field1931[var6];
                            int var453 = var416 - 1;
                            if (var415.field1146 != null && var453 < var415.field1146.length && var415.field1146[var453] != null) {
                                class151.field2709[var11++] = var415.field1146[var453];
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 1802) {
                            if (var415.field1213 == null) {
                                class151.field2709[var11++] = class199.field3425;
                            } else {
                                class151.field2709[var11++] = var415.field1213;
                            }
                            continue;
                        }
                    } else if (var451 < 2600) {
                        var6--;
                        class63 var414 = class54.method367(class99.field1931[var6], (byte) -80);
                        if (var451 == 2500) {
                            class99.field1931[var6++] = var414.field1138;
                            continue;
                        }
                        if (var451 == 2501) {
                            class99.field1931[var6++] = var414.field1226;
                            continue;
                        }
                        if (var451 == 2502) {
                            class99.field1931[var6++] = var414.field1215;
                            continue;
                        }
                        if (var451 == 2503) {
                            class99.field1931[var6++] = var414.field1196;
                            continue;
                        }
                        if (var451 == 2504) {
                            class99.field1931[var6++] = var414.field1087 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 2505) {
                            class99.field1931[var6++] = var414.field1122;
                            continue;
                        }
                    } else if (var451 < 2700) {
                        var6--;
                        class63 var413 = class54.method367(class99.field1931[var6], (byte) -80);
                        if (var451 == 2600) {
                            class99.field1931[var6++] = var413.field1170;
                            continue;
                        }
                        if (var451 == 2601) {
                            class99.field1931[var6++] = var413.field1141;
                            continue;
                        }
                        if (var451 == 2602) {
                            class151.field2709[var11++] = var413.field1204;
                            continue;
                        }
                        if (var451 == 2603) {
                            class99.field1931[var6++] = var413.field1211;
                            continue;
                        }
                        if (var451 == 2604) {
                            class99.field1931[var6++] = var413.field1117;
                            continue;
                        }
                        if (var451 == 2605) {
                            class99.field1931[var6++] = var413.field1085;
                            continue;
                        }
                        if (var451 == 2606) {
                            class99.field1931[var6++] = var413.field1187;
                            continue;
                        }
                        if (var451 == 2607) {
                            class99.field1931[var6++] = var413.field1176;
                            continue;
                        }
                        if (var451 == 2608) {
                            class99.field1931[var6++] = var413.field1137;
                            continue;
                        }
                        if (var451 == 2609) {
                            class99.field1931[var6++] = var413.field1098;
                            continue;
                        }
                    } else if (var451 < 2800) {
                        if (var451 == 2700) {
                            var6--;
                            class63 var67 = class54.method367(class99.field1931[var6], (byte) -80);
                            class99.field1931[var6++] = var67.field1121;
                            continue;
                        }
                        if (var451 == 2701) {
                            var6--;
                            class63 var68 = class54.method367(class99.field1931[var6], (byte) -80);
                            if (var68.field1121 == -1) {
                                class99.field1931[var6++] = 0;
                            } else {
                                class99.field1931[var6++] = var68.field1238;
                            }
                            continue;
                        }
                        if (var451 == 2702) {
                            var6--;
                            int var69 = class99.field1931[var6];
                            class75 var70 = (class75) class230.field3981.method1381((long) var69, -62);
                            if (var70 == null) {
                                class99.field1931[var6++] = 0;
                            } else {
                                class99.field1931[var6++] = 1;
                            }
                            continue;
                        }
                        if (var451 == 2703) {
                            var6--;
                            class63 var71 = class54.method367(class99.field1931[var6], (byte) -80);
                            if (var71.field1092 == null) {
                                class99.field1931[var6++] = 0;
                                continue;
                            }
                            int var72 = var71.field1092.length;
                            for (int var73 = 0; var73 < var71.field1092.length; var73++) {
                                if (var71.field1092[var73] == null) {
                                    var72 = var73;
                                    break;
                                }
                            }
                            class99.field1931[var6++] = var72;
                            continue;
                        }
                        if (var451 == 2704 || var451 == 2705) {
                            var6 -= 2;
                            int var74 = class99.field1931[var6 + 1];
                            int var75 = class99.field1931[var6];
                            class75 var76 = (class75) class230.field3981.method1381((long) var75, 95);
                            if (var76 != null && var76.field1492 == var74) {
                                class99.field1931[var6++] = 1;
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                    } else if (var451 < 2900) {
                        var6--;
                        class63 var411 = class54.method367(class99.field1931[var6], (byte) -80);
                        if (var451 == 2800) {
                            class99.field1931[var6++] = class45.method328(class109.method741(arg1, 28), client.method592(var411));
                            continue;
                        }
                        if (var451 == 2801) {
                            var6--;
                            int var412 = class99.field1931[var6];
                            int var452 = var412 - 1;
                            if (var411.field1146 != null && var411.field1146.length > var452 && var411.field1146[var452] != null) {
                                class151.field2709[var11++] = var411.field1146[var452];
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 2802) {
                            if (var411.field1213 == null) {
                                class151.field2709[var11++] = class199.field3425;
                            } else {
                                class151.field2709[var11++] = var411.field1213;
                            }
                            continue;
                        }
                    } else if (var451 < 3200) {
                        if (var451 == 3100) {
                            var11--;
                            class66 var396 = class151.field2709[var11];
                            class234.method1533(class199.field3425, 127, var396, 0);
                            continue;
                        }
                        if (var451 == 3101) {
                            var6 -= 2;
                            class224.method1423(class99.field1931[var6 + 1], arg1 - 124, class207.field3595, class99.field1931[var6]);
                            continue;
                        }
                        if (var451 == 3103) {
                            class203.method1312(636);
                            continue;
                        }
                        if (var451 == 3104) {
                            class10.field114++;
                            var11--;
                            class66 var397 = class151.field2709[var11];
                            int var398 = 0;
                            if (var397.method491((byte) -111)) {
                                var398 = var397.method489((byte) -62);
                            }
                            class28.field412.method578(-99, 43);
                            class28.field412.method1666(arg1 ^ 0x2074FCC4, var398);
                            continue;
                        }
                        if (var451 == 3105) {
                            var11--;
                            class66 var399 = class151.field2709[var11];
                            class28.field412.method578(-113, 189);
                            class28.field412.method1651(true, var399.method479(10908));
                            class156.field2767++;
                            continue;
                        }
                        if (var451 == 3106) {
                            class230.field3983++;
                            var11--;
                            class66 var400 = class151.field2709[var11];
                            class28.field412.method578(-122, 127);
                            class28.field412.method1638(32, var400.method460((byte) -99) + 1);
                            class28.field412.method1641((byte) -9, var400);
                            continue;
                        }
                        if (var451 == 3107) {
                            var6--;
                            int var401 = class99.field1931[var6];
                            var11--;
                            class66 var402 = class151.field2709[var11];
                            class264.method1788(0, var401, var402);
                            continue;
                        }
                        if (var451 == 3108) {
                            var6 -= 3;
                            int var403 = class99.field1931[var6];
                            int var404 = class99.field1931[var6 + 1];
                            int var405 = class99.field1931[var6 + 2];
                            class63 var406 = class54.method367(var405, (byte) -80);
                            class114.method762(var403, var404, arg1 - 4922, var406);
                            continue;
                        }
                        if (var451 == 3109) {
                            var6 -= 2;
                            int var407 = class99.field1931[var6 + 1];
                            int var408 = class99.field1931[var6];
                            class63 var409 = var46 ? class245.field4275 : class173.field3048;
                            class114.method762(var408, var407, arg1 ^ 0xFFFFED3E, var409);
                            continue;
                        }
                        if (var451 == 3110) {
                            class263.field4620++;
                            var6--;
                            int var410 = class99.field1931[var6];
                            class28.field412.method578(58, 195);
                            class28.field412.method1650(false, var410);
                            continue;
                        }
                    } else if (var451 < 3300) {
                        if (var451 == 3200) {
                            var6 -= 3;
                            class140.method969((byte) -35, class99.field1931[var6 + 2], class99.field1931[var6 + 1], class99.field1931[var6]);
                            continue;
                        }
                        if (var451 == 3201) {
                            var6--;
                            class97.method666(86, class99.field1931[var6]);
                            continue;
                        }
                        if (var451 == 3202) {
                            var6 -= 2;
                            class208.method1351((byte) 106, class99.field1931[var6 + 1], class99.field1931[var6]);
                            continue;
                        }
                    } else if (var451 < 3400) {
                        if (var451 == 3300) {
                            class99.field1931[var6++] = class75.field1501;
                            continue;
                        }
                        if (var451 == 3301) {
                            var6 -= 2;
                            int var369 = class99.field1931[var6];
                            int var370 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class91.method639(var370, -11143, var369);
                            continue;
                        }
                        if (var451 == 3302) {
                            var6 -= 2;
                            int var371 = class99.field1931[var6];
                            int var372 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class34.method191(var372, var371, 20558);
                            continue;
                        }
                        if (var451 == 3303) {
                            var6 -= 2;
                            int var373 = class99.field1931[var6 + 1];
                            int var374 = class99.field1931[var6];
                            class99.field1931[var6++] = class57.method385(0, var373, var374);
                            continue;
                        }
                        if (var451 == 3304) {
                            var6--;
                            int var375 = class99.field1931[var6];
                            class99.field1931[var6++] = class174.method1176((byte) 106, var375).field3414;
                            continue;
                        }
                        if (var451 == 3305) {
                            var6--;
                            int var376 = class99.field1931[var6];
                            class99.field1931[var6++] = class98.field1919[var376];
                            continue;
                        }
                        if (var451 == 3306) {
                            var6--;
                            int var377 = class99.field1931[var6];
                            class99.field1931[var6++] = class121.field2290[var377];
                            continue;
                        }
                        if (var451 == 3307) {
                            var6--;
                            int var378 = class99.field1931[var6];
                            class99.field1931[var6++] = class52.field928[var378];
                            continue;
                        }
                        if (var451 == 3308) {
                            int var379 = class196.field3401;
                            int var380 = (class207.field3595.field2077 >> 7) + class3.field39;
                            int var381 = (class207.field3595.field2053 >> 7) + class34.field512;
                            class99.field1931[var6++] = (var379 << 28) + (var380 << 14) + var381;
                            continue;
                        }
                        if (var451 == 3309) {
                            var6--;
                            int var382 = class99.field1931[var6];
                            class99.field1931[var6++] = class115.method767(var382 >> 14, 16383);
                            continue;
                        }
                        if (var451 == 3310) {
                            var6--;
                            int var383 = class99.field1931[var6];
                            class99.field1931[var6++] = var383 >> 28;
                            continue;
                        }
                        if (var451 == 3311) {
                            var6--;
                            int var384 = class99.field1931[var6];
                            class99.field1931[var6++] = class115.method767(16383, var384);
                            continue;
                        }
                        if (var451 == 3312) {
                            class99.field1931[var6++] = class260.field4587 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3313) {
                            var6 -= 2;
                            int var385 = class99.field1931[var6] + 32768;
                            int var386 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class91.method639(var386, arg1 - 11267, var385);
                            continue;
                        }
                        if (var451 == 3314) {
                            var6 -= 2;
                            int var387 = class99.field1931[var6] + 32768;
                            int var388 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class34.method191(var388, var387, 20558);
                            continue;
                        }
                        if (var451 == 3315) {
                            var6 -= 2;
                            int var389 = class99.field1931[var6] + 32768;
                            int var390 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class57.method385(0, var390, var389);
                            continue;
                        }
                        if (var451 == 3316) {
                            if (class130.field2430 < 2) {
                                class99.field1931[var6++] = 0;
                            } else {
                                class99.field1931[var6++] = class130.field2430;
                            }
                            continue;
                        }
                        if (var451 == 3317) {
                            class99.field1931[var6++] = class263.field4618;
                            continue;
                        }
                        if (var451 == 3318) {
                            class99.field1931[var6++] = class61.field1028;
                            continue;
                        }
                        if (var451 == 3321) {
                            class99.field1931[var6++] = class197.field3407;
                            continue;
                        }
                        if (var451 == 3322) {
                            class99.field1931[var6++] = class81.field1587;
                            continue;
                        }
                        if (var451 == 3323) {
                            if (class259.field4559 >= 5 && class259.field4559 <= 9) {
                                class99.field1931[var6++] = 1;
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3324) {
                            if (class259.field4559 >= 5 && class259.field4559 <= 9) {
                                class99.field1931[var6++] = class259.field4559;
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3325) {
                            if (class42.field690 > 0) {
                                class99.field1931[var6++] = 1;
                            } else {
                                class99.field1931[var6++] = 0;
                            }
                            continue;
                        }
                        if (var451 == 3326) {
                            class99.field1931[var6++] = class207.field3595.field816;
                            continue;
                        }
                        if (var451 == 3327) {
                            class99.field1931[var6++] = class207.field3595.field811.field1978 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3328) {
                            class99.field1931[var6++] = class171.field3035;
                            continue;
                        }
                        if (var451 == 3329) {
                            class99.field1931[var6++] = class98.field1923;
                            continue;
                        }
                        if (var451 == 3330) {
                            var6--;
                            int var391 = class99.field1931[var6];
                            class99.field1931[var6++] = class153.method1041(2, var391);
                            continue;
                        }
                        if (var451 == 3331) {
                            var6 -= 2;
                            int var392 = class99.field1931[var6];
                            int var393 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class170.method1162(false, var393, var392, 0);
                            continue;
                        }
                        if (var451 == 3332) {
                            var6 -= 2;
                            int var394 = class99.field1931[var6];
                            int var395 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class170.method1162(true, var395, var394, 0);
                            continue;
                        }
                        if (var451 == 3333) {
                            class99.field1931[var6++] = class166.field2988;
                            continue;
                        }
                    } else if (var451 < 3500) {
                        if (var451 == 3400) {
                            var6 -= 2;
                            int var354 = class99.field1931[var6 + 1];
                            int var355 = class99.field1931[var6];
                            class153 var356 = class102.method707(arg1 ^ 0x69, var355);
                            class151.field2709[var11++] = var356.method1037((byte) -106, var354);
                            continue;
                        }
                        if (var451 == 3408) {
                            var6 -= 4;
                            int var357 = class99.field1931[var6 + 1];
                            int var358 = class99.field1931[var6];
                            int var359 = class99.field1931[var6 + 3];
                            int var360 = class99.field1931[var6 + 2];
                            class153 var361 = class102.method707(21, var360);
                            if (var361.field2724 == var358 && var361.field2726 == var357) {
                                if (var357 == 115) {
                                    class151.field2709[var11++] = var361.method1037((byte) -127, var359);
                                } else {
                                    class99.field1931[var6++] = var361.method1044(var359, -32511);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var451 == 3409) {
                            var6 -= 3;
                            int var362 = class99.field1931[var6 + 1];
                            int var363 = class99.field1931[var6];
                            int var364 = class99.field1931[var6 + 2];
                            class153 var365 = class102.method707(21, var362);
                            if (var365.field2726 != var363) {
                                throw new RuntimeException("C3409-1");
                            }
                            class99.field1931[var6++] = var365.method1036((byte) -107, var364) ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3410) {
                            var6--;
                            int var366 = class99.field1931[var6];
                            var11--;
                            class66 var367 = class151.field2709[var11];
                            class153 var368 = class102.method707(21, var366);
                            if (var368.field2726 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class99.field1931[var6++] = var368.method1040(102, var367) ? 1 : 0;
                            continue;
                        }
                    } else if (var451 < 3700) {
                        if (var451 == 3600) {
                            if (class63.field1240 == 0) {
                                class99.field1931[var6++] = -2;
                            } else if (class63.field1240 == 1) {
                                class99.field1931[var6++] = -1;
                            } else {
                                class99.field1931[var6++] = class173.field3058;
                            }
                            continue;
                        }
                        if (var451 == 3601) {
                            var6--;
                            int var332 = class99.field1931[var6];
                            if (class63.field1240 == 2 && var332 < class173.field3058) {
                                class151.field2709[var11++] = class233.field4077[var332];
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 3602) {
                            var6--;
                            int var333 = class99.field1931[var6];
                            if (class63.field1240 == 2 && class173.field3058 > var333) {
                                class99.field1931[var6++] = class245.field4279[var333];
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3603) {
                            var6--;
                            int var334 = class99.field1931[var6];
                            if (class63.field1240 == 2 && var334 < class173.field3058) {
                                class99.field1931[var6++] = class17.field246[var334];
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3604) {
                            var11--;
                            class66 var335 = class151.field2709[var11];
                            var6--;
                            int var336 = class99.field1931[var6];
                            class83.method574(var335, -32443, var336);
                            continue;
                        }
                        if (var451 == 3605) {
                            var11--;
                            class66 var337 = class151.field2709[var11];
                            class156.method1057((byte) 122, var337.method479(10908));
                            continue;
                        }
                        if (var451 == 3606) {
                            var11--;
                            class66 var338 = class151.field2709[var11];
                            class187.method1233(23136, var338.method479(10908));
                            continue;
                        }
                        if (var451 == 3607) {
                            var11--;
                            class66 var339 = class151.field2709[var11];
                            class222.method1413(var339.method479(10908), (byte) -124);
                            continue;
                        }
                        if (var451 == 3608) {
                            var11--;
                            class66 var340 = class151.field2709[var11];
                            class29.method166(-126, var340.method479(10908));
                            continue;
                        }
                        if (var451 == 3609) {
                            var11--;
                            class66 var341 = class151.field2709[var11];
                            if (var341.method459(class164.field2950, 105) || var341.method459(class212.field3639, arg1 ^ 0x15)) {
                                var341 = var341.method485(7, true);
                            }
                            class99.field1931[var6++] = class136.method939(-128, var341) ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3610) {
                            var6--;
                            int var342 = class99.field1931[var6];
                            if (class63.field1240 == 2 && class173.field3058 > var342) {
                                class151.field2709[var11++] = class16.field202[var342];
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 3611) {
                            if (class44.field788 == null) {
                                class151.field2709[var11++] = class199.field3425;
                            } else {
                                class151.field2709[var11++] = class44.field788.method467(arg1 + 12564);
                            }
                            continue;
                        }
                        if (var451 == 3612) {
                            if (class44.field788 == null) {
                                class99.field1931[var6++] = 0;
                            } else {
                                class99.field1931[var6++] = class41.field677;
                            }
                            continue;
                        }
                        if (var451 == 3613) {
                            var6--;
                            int var343 = class99.field1931[var6];
                            if (class44.field788 != null && var343 < class41.field677) {
                                class151.field2709[var11++] = class212.field3648[var343].field960.method467(12688);
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 3614) {
                            var6--;
                            int var344 = class99.field1931[var6];
                            if (class44.field788 != null && var344 < class41.field677) {
                                class99.field1931[var6++] = class212.field3648[var344].field954;
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3615) {
                            var6--;
                            int var345 = class99.field1931[var6];
                            if (class44.field788 != null && var345 < class41.field677) {
                                class99.field1931[var6++] = class212.field3648[var345].field962;
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3616) {
                            class99.field1931[var6++] = class224.field3847;
                            continue;
                        }
                        if (var451 == 3617) {
                            var11--;
                            class66 var346 = class151.field2709[var11];
                            class31.method179((byte) -62, var346);
                            continue;
                        }
                        if (var451 == 3618) {
                            class99.field1931[var6++] = class80.field1567;
                            continue;
                        }
                        if (var451 == 3619) {
                            var11--;
                            class66 var347 = class151.field2709[var11];
                            class225.method1433(-256, var347.method479(10908));
                            continue;
                        }
                        if (var451 == 3620) {
                            class216.method1391((byte) 98);
                            continue;
                        }
                        if (var451 == 3621) {
                            if (class63.field1240 == 0) {
                                class99.field1931[var6++] = -1;
                            } else {
                                class99.field1931[var6++] = class124.field2338;
                            }
                            continue;
                        }
                        if (var451 == 3622) {
                            var6--;
                            int var348 = class99.field1931[var6];
                            if (class63.field1240 != 0 && class124.field2338 > var348) {
                                class151.field2709[var11++] = class87.method616(class247.field4306[var348], -1).method467(class109.method741(arg1, 12780));
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 3623) {
                            var11--;
                            class66 var349 = class151.field2709[var11];
                            if (var349.method459(class164.field2950, 81) || var349.method459(class212.field3639, 114)) {
                                var349 = var349.method485(7, true);
                            }
                            class99.field1931[var6++] = class60.method393(var349, true) ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3624) {
                            var6--;
                            int var350 = class99.field1931[var6];
                            if (class212.field3648 != null && var350 < class41.field677 && class212.field3648[var350].field960.method470(false, class207.field3595.field815)) {
                                class99.field1931[var6++] = 1;
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3625) {
                            if (class62.field1064 == null) {
                                class151.field2709[var11++] = class199.field3425;
                            } else {
                                class151.field2709[var11++] = class62.field1064.method467(12688);
                            }
                            continue;
                        }
                        if (var451 == 3626) {
                            var6--;
                            int var351 = class99.field1931[var6];
                            if (class44.field788 != null && class41.field677 > var351) {
                                class151.field2709[var11++] = class212.field3648[var351].field963;
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 3627) {
                            var6--;
                            int var352 = class99.field1931[var6];
                            if (class63.field1240 == 2 && var352 >= 0 && class173.field3058 > var352) {
                                class99.field1931[var6++] = class223.field3805[var352] ? 1 : 0;
                                continue;
                            }
                            class99.field1931[var6++] = 0;
                            continue;
                        }
                        if (var451 == 3628) {
                            var11--;
                            class66 var353 = class151.field2709[var11];
                            if (var353.method459(class164.field2950, 59) || var353.method459(class212.field3639, arg1 - 15)) {
                                var353 = var353.method485(7, true);
                            }
                            class99.field1931[var6++] = class176.method1183(31601, var353);
                            continue;
                        }
                    } else if (var451 < 4000) {
                        if (var451 == 3903) {
                            var6--;
                            int var77 = class99.field1931[var6];
                            class99.field1931[var6++] = class251.field4418[var77].method900(8);
                            continue;
                        }
                        if (var451 == 3904) {
                            var6--;
                            int var78 = class99.field1931[var6];
                            class99.field1931[var6++] = class251.field4418[var78].field2402;
                            continue;
                        }
                        if (var451 == 3905) {
                            var6--;
                            int var79 = class99.field1931[var6];
                            class99.field1931[var6++] = class251.field4418[var79].field2415;
                            continue;
                        }
                        if (var451 == 3906) {
                            var6--;
                            int var80 = class99.field1931[var6];
                            class99.field1931[var6++] = class251.field4418[var80].field2406;
                            continue;
                        }
                        if (var451 == 3907) {
                            var6--;
                            int var81 = class99.field1931[var6];
                            class99.field1931[var6++] = class251.field4418[var81].field2410;
                            continue;
                        }
                        if (var451 == 3908) {
                            var6--;
                            int var82 = class99.field1931[var6];
                            class99.field1931[var6++] = class251.field4418[var82].field2413;
                            continue;
                        }
                        if (var451 == 3910) {
                            var6--;
                            int var83 = class99.field1931[var6];
                            int var84 = class251.field4418[var83].method899(arg1 ^ 0x7B);
                            class99.field1931[var6++] = var84 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3911) {
                            var6--;
                            int var85 = class99.field1931[var6];
                            int var86 = class251.field4418[var85].method899(arg1 - 117);
                            class99.field1931[var6++] = var86 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3912) {
                            var6--;
                            int var87 = class99.field1931[var6];
                            int var88 = class251.field4418[var87].method899(7);
                            class99.field1931[var6++] = var88 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 3913) {
                            var6--;
                            int var89 = class99.field1931[var6];
                            int var90 = class251.field4418[var89].method899(arg1 ^ 0x7B);
                            class99.field1931[var6++] = var90 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var451 < 4100) {
                        if (var451 == 4000) {
                            var6 -= 2;
                            int var287 = class99.field1931[var6];
                            int var288 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = var287 + var288;
                            continue;
                        }
                        if (var451 == 4001) {
                            var6 -= 2;
                            int var289 = class99.field1931[var6];
                            int var290 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = var289 - var290;
                            continue;
                        }
                        if (var451 == 4002) {
                            var6 -= 2;
                            int var291 = class99.field1931[var6];
                            int var292 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = var291 * var292;
                            continue;
                        }
                        if (var451 == 4003) {
                            var6 -= 2;
                            int var293 = class99.field1931[var6];
                            int var294 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = var293 / var294;
                            continue;
                        }
                        if (var451 == 4004) {
                            var6--;
                            int var295 = class99.field1931[var6];
                            class99.field1931[var6++] = (int) ((double) var295 * Math.random());
                            continue;
                        }
                        if (var451 == 4005) {
                            var6--;
                            int var296 = class99.field1931[var6];
                            class99.field1931[var6++] = (int) ((double) (var296 + 1) * Math.random());
                            continue;
                        }
                        if (var451 == 4006) {
                            var6 -= 5;
                            int var297 = class99.field1931[var6];
                            int var298 = class99.field1931[var6 + 2];
                            int var299 = class99.field1931[var6 + 3];
                            int var300 = class99.field1931[var6 + 4];
                            int var301 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = (var300 - var298) * (var301 - var297) / (var299 - var298) + var297;
                            continue;
                        }
                        if (var451 == 4007) {
                            var6 -= 2;
                            long var302 = (long) class99.field1931[var6];
                            long var304 = (long) class99.field1931[var6 + 1];
                            class99.field1931[var6++] = (int) (var302 * var304 / 100L + var302);
                            continue;
                        }
                        if (var451 == 4008) {
                            var6 -= 2;
                            int var306 = class99.field1931[var6 + 1];
                            int var307 = class99.field1931[var6];
                            class99.field1931[var6++] = class73.method521(0x1 << var306, var307);
                            continue;
                        }
                        if (var451 == 4009) {
                            var6 -= 2;
                            int var308 = class99.field1931[var6];
                            int var309 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class115.method767(var308, -(0x1 << var309) - 1);
                            continue;
                        }
                        if (var451 == 4010) {
                            var6 -= 2;
                            int var310 = class99.field1931[var6];
                            int var311 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class115.method767(var310, 0x1 << var311) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var451 == 4011) {
                            var6 -= 2;
                            int var312 = class99.field1931[var6];
                            int var313 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = var312 % var313;
                            continue;
                        }
                        if (var451 == 4012) {
                            var6 -= 2;
                            int var314 = class99.field1931[var6 + 1];
                            int var315 = class99.field1931[var6];
                            if (var315 == 0) {
                                class99.field1931[var6++] = 0;
                            } else {
                                class99.field1931[var6++] = (int) Math.pow((double) var315, (double) var314);
                            }
                            continue;
                        }
                        if (var451 == 4013) {
                            var6 -= 2;
                            int var316 = class99.field1931[var6];
                            int var317 = class99.field1931[var6 + 1];
                            if (var316 == 0) {
                                class99.field1931[var6++] = 0;
                            } else if (var317 == 0) {
                                class99.field1931[var6++] = Integer.MAX_VALUE;
                            } else {
                                class99.field1931[var6++] = (int) Math.pow((double) var316, 1.0D / (double) var317);
                            }
                            continue;
                        }
                        if (var451 == 4014) {
                            var6 -= 2;
                            int var318 = class99.field1931[var6];
                            int var319 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = class115.method767(var318, var319);
                            continue;
                        }
                        if (var451 == 4015) {
                            var6 -= 2;
                            int var320 = class99.field1931[var6 + 1];
                            int var321 = class99.field1931[var6];
                            class99.field1931[var6++] = class73.method521(var320, var321);
                            continue;
                        }
                        if (var451 == 4016) {
                            var6 -= 2;
                            int var322 = class99.field1931[var6];
                            int var323 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = var322 >= var323 ? var323 : var322;
                            continue;
                        }
                        if (var451 == 4017) {
                            var6 -= 2;
                            int var324 = class99.field1931[var6];
                            int var325 = class99.field1931[var6 + 1];
                            class99.field1931[var6++] = var324 > var325 ? var324 : var325;
                            continue;
                        }
                        if (var451 == 4018) {
                            var6 -= 3;
                            long var326 = (long) class99.field1931[var6];
                            long var328 = (long) class99.field1931[var6 + 2];
                            long var330 = (long) class99.field1931[var6 + 1];
                            class99.field1931[var6++] = (int) (var326 * var328 / var330);
                            continue;
                        }
                    } else if (var451 < 4200) {
                        if (var451 == 4100) {
                            var11--;
                            class66 var91 = class151.field2709[var11];
                            var6--;
                            int var92 = class99.field1931[var6];
                            class151.field2709[var11++] = class212.method1372(2, new class66[] { var91, class144.method989(var92, 0) });
                            continue;
                        }
                        if (var451 == 4101) {
                            var11 -= 2;
                            class66 var93 = class151.field2709[var11];
                            class66 var94 = class151.field2709[var11 + 1];
                            class151.field2709[var11++] = class212.method1372(2, new class66[] { var93, var94 });
                            continue;
                        }
                        if (var451 == 4102) {
                            var6--;
                            int var95 = class99.field1931[var6];
                            var11--;
                            class66 var96 = class151.field2709[var11];
                            class151.field2709[var11++] = class212.method1372(2, new class66[] { var96, class103.method714(true, (byte) 42, var95) });
                            continue;
                        }
                        if (var451 == 4103) {
                            var11--;
                            class66 var97 = class151.field2709[var11];
                            class151.field2709[var11++] = var97.method478((byte) -90);
                            continue;
                        }
                        if (var451 == 4104) {
                            var6--;
                            int var98 = class99.field1931[var6];
                            long var99 = (long) var98 * 86400000L + 1014768000000L;
                            class2.field22.setTime(new Date(var99));
                            int var101 = class2.field22.get(5);
                            int var102 = class2.field22.get(2);
                            int var103 = class2.field22.get(1);
                            class151.field2709[var11++] = class212.method1372(2, new class66[] { class144.method989(var101, 0), class173.field3051, class38.field563[var102], class173.field3051, class144.method989(var103, 0) });
                            continue;
                        }
                        if (var451 == 4105) {
                            var11 -= 2;
                            class66 var104 = class151.field2709[var11];
                            class66 var105 = class151.field2709[var11 + 1];
                            if (class207.field3595.field811 != null && class207.field3595.field811.field1978) {
                                class151.field2709[var11++] = var105;
                                continue;
                            }
                            class151.field2709[var11++] = var104;
                            continue;
                        }
                        if (var451 == 4106) {
                            var6--;
                            int var106 = class99.field1931[var6];
                            class151.field2709[var11++] = class144.method989(var106, 0);
                            continue;
                        }
                        if (var451 == 4107) {
                            var11 -= 2;
                            class99.field1931[var6++] = class151.field2709[var11].method471((byte) -39, class151.field2709[var11 + 1]);
                            continue;
                        }
                        if (var451 == 4108) {
                            var6 -= 2;
                            int var107 = class99.field1931[var6];
                            var11--;
                            class66 var108 = class151.field2709[var11];
                            int var109 = class99.field1931[var6 + 1];
                            byte[] var110 = class251.field4420.method135(0, arg1 ^ 0x7C, var109);
                            class236 var111 = new class236(var110);
                            var111.method220(class249.field4400, (int[]) null);
                            class99.field1931[var6++] = var111.method223(var108, var107);
                            continue;
                        }
                        if (var451 == 4109) {
                            var6 -= 2;
                            var11--;
                            class66 var112 = class151.field2709[var11];
                            int var113 = class99.field1931[var6];
                            int var114 = class99.field1931[var6 + 1];
                            byte[] var115 = class251.field4420.method135(0, 0, var114);
                            class236 var116 = new class236(var115);
                            var116.method220(class249.field4400, (int[]) null);
                            class99.field1931[var6++] = var116.method221(var112, var113);
                            continue;
                        }
                        if (var451 == 4110) {
                            var11 -= 2;
                            class66 var117 = class151.field2709[var11 + 1];
                            class66 var118 = class151.field2709[var11];
                            var6--;
                            if (class99.field1931[var6] == 1) {
                                class151.field2709[var11++] = var118;
                            } else {
                                class151.field2709[var11++] = var117;
                            }
                            continue;
                        }
                        if (var451 == 4111) {
                            var11--;
                            class66 var119 = class151.field2709[var11];
                            class151.field2709[var11++] = class39.method212(var119);
                            continue;
                        }
                        if (var451 == 4112) {
                            var11--;
                            class66 var120 = class151.field2709[var11];
                            var6--;
                            int var121 = class99.field1931[var6];
                            if (var121 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class151.field2709[var11++] = var120.method446((byte) 115, var121);
                            continue;
                        }
                        if (var451 == 4113) {
                            var6--;
                            int var122 = class99.field1931[var6];
                            class99.field1931[var6++] = class163.method1096(var122, (byte) -53) ? 1 : 0;
                            continue;
                        }
                        if (var451 == 4114) {
                            var6--;
                            int var123 = class99.field1931[var6];
                            class99.field1931[var6++] = class51.method353(var123, 31155) ? 1 : 0;
                            continue;
                        }
                        if (var451 == 4115) {
                            var6--;
                            int var124 = class99.field1931[var6];
                            class99.field1931[var6++] = class172.method1168(122, var124) ? 1 : 0;
                            continue;
                        }
                        if (var451 == 4116) {
                            var6--;
                            int var125 = class99.field1931[var6];
                            class99.field1931[var6++] = class12.method54(false, var125) ? 1 : 0;
                            continue;
                        }
                        if (var451 == 4117) {
                            var11--;
                            class66 var126 = class151.field2709[var11];
                            if (var126 == null) {
                                class99.field1931[var6++] = 0;
                            } else {
                                class99.field1931[var6++] = var126.method460((byte) -117);
                            }
                            continue;
                        }
                        if (var451 == 4118) {
                            var6 -= 2;
                            int var127 = class99.field1931[var6];
                            var11--;
                            class66 var128 = class151.field2709[var11];
                            int var129 = class99.field1931[var6 + 1];
                            class151.field2709[var11++] = var128.method477(var127, (byte) -74, var129);
                            continue;
                        }
                        if (var451 == 4119) {
                            var11--;
                            class66 var130 = class151.field2709[var11];
                            class66 var131 = class28.method136(arg1 ^ 0xFFFFB5A6, var130.method460((byte) -100));
                            boolean var132 = false;
                            for (int var133 = 0; var130.method460((byte) -103) > var133; var133++) {
                                int var134 = var130.method448(var133, arg1 ^ 0x1C76);
                                if (var134 == 60) {
                                    var132 = true;
                                } else if (var134 == 62) {
                                    var132 = false;
                                } else if (!var132) {
                                    var131.method458(var134, 26011);
                                }
                            }
                            var131.method457(true);
                            class151.field2709[var11++] = var131;
                            continue;
                        }
                        if (var451 == 4120) {
                            var6 -= 2;
                            var11--;
                            class66 var135 = class151.field2709[var11];
                            int var136 = class99.field1931[var6 + 1];
                            int var137 = class99.field1931[var6];
                            class99.field1931[var6++] = var135.method454(var137, class109.method741(arg1, -125), var136);
                            continue;
                        }
                        if (var451 == 4121) {
                            var11 -= 2;
                            class66 var138 = class151.field2709[var11];
                            class66 var139 = class151.field2709[var11 + 1];
                            var6--;
                            int var140 = class99.field1931[var6];
                            class99.field1931[var6++] = var138.method456((byte) 43, var139, var140);
                            continue;
                        }
                        if (var451 == 4122) {
                            var6--;
                            int var141 = class99.field1931[var6];
                            class99.field1931[var6++] = class224.method1424(class109.method741(arg1, 125), var141);
                            continue;
                        }
                        if (var451 == 4123) {
                            var6--;
                            int var142 = class99.field1931[var6];
                            class99.field1931[var6++] = class122.method828(-1872384500, var142);
                            continue;
                        }
                    } else if (var451 < 4300) {
                        if (var451 == 4200) {
                            var6--;
                            int var143 = class99.field1931[var6];
                            class151.field2709[var11++] = class40.method242(-25672, var143).field2813;
                            continue;
                        }
                        if (var451 == 4201) {
                            var6 -= 2;
                            int var144 = class99.field1931[var6];
                            int var145 = class99.field1931[var6 + 1];
                            class157 var146 = class40.method242(-25672, var144);
                            if (var145 >= 1 && var145 <= 5 && var146.field2820[var145 - 1] != null) {
                                class151.field2709[var11++] = var146.field2820[var145 - 1];
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 4202) {
                            var6 -= 2;
                            int var147 = class99.field1931[var6];
                            int var148 = class99.field1931[var6 + 1];
                            class157 var149 = class40.method242(-25672, var147);
                            if (var148 >= 1 && var148 <= 5 && var149.field2791[var148 - 1] != null) {
                                class151.field2709[var11++] = var149.field2791[var148 - 1];
                                continue;
                            }
                            class151.field2709[var11++] = class199.field3425;
                            continue;
                        }
                        if (var451 == 4203) {
                            var6--;
                            int var150 = class99.field1931[var6];
                            class99.field1931[var6++] = class40.method242(arg1 - 25796, var150).field2826;
                            continue;
                        }
                        if (var451 == 4204) {
                            var6--;
                            int var151 = class99.field1931[var6];
                            class99.field1931[var6++] = class40.method242(-25672, var151).field2832 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 4205) {
                            var6--;
                            int var152 = class99.field1931[var6];
                            class157 var153 = class40.method242(-25672, var152);
                            if (var153.field2836 == -1 && var153.field2829 >= 0) {
                                class99.field1931[var6++] = var153.field2829;
                                continue;
                            }
                            class99.field1931[var6++] = var152;
                            continue;
                        }
                        if (var451 == 4206) {
                            var6--;
                            int var154 = class99.field1931[var6];
                            class157 var155 = class40.method242(-25672, var154);
                            if (var155.field2836 >= 0 && var155.field2829 >= 0) {
                                class99.field1931[var6++] = var155.field2829;
                                continue;
                            }
                            class99.field1931[var6++] = var154;
                            continue;
                        }
                        if (var451 == 4207) {
                            var6--;
                            int var156 = class99.field1931[var6];
                            class99.field1931[var6++] = class40.method242(-25672, var156).field2822 ? 1 : 0;
                            continue;
                        }
                        if (var451 == 4208) {
                            var6 -= 2;
                            int var157 = class99.field1931[var6];
                            int var158 = class99.field1931[var6 + 1];
                            class30 var159 = class19.method77(var158, 19482);
                            if (var159.method172(115)) {
                                class151.field2709[var11++] = class40.method242(-25672, var157).method1071(var159.field444, (byte) 21, var158);
                            } else {
                                class99.field1931[var6++] = class40.method242(-25672, var157).method1062(var159.field445, (byte) -79, var158);
                            }
                            continue;
                        }
                        if (var451 == 4210) {
                            var6--;
                            int var160 = class99.field1931[var6];
                            var11--;
                            class66 var161 = class151.field2709[var11];
                            class171.method1166(true, var161, var160 == 1);
                            class99.field1931[var6++] = class33.field490;
                            continue;
                        }
                        if (var451 == 4211) {
                            if (class50.field886 != null && class33.field490 > class11.field139) {
                                class99.field1931[var6++] = class115.method767(65535, class50.field886[class11.field139++]);
                                continue;
                            }
                            class99.field1931[var6++] = -1;
                            continue;
                        }
                        if (var451 == 4212) {
                            class11.field139 = 0;
                            continue;
                        }
                    } else if (var451 >= 4400) {
                        if (var451 >= 4500) {
                            if (var451 >= 4600) {
                                if (var451 < 5100) {
                                    if (var451 == 5000) {
                                        class99.field1931[var6++] = class165.field2981;
                                        continue;
                                    }
                                    if (var451 == 5001) {
                                        class174.field3072++;
                                        var6 -= 3;
                                        class165.field2981 = class99.field1931[var6];
                                        class59.field1002 = class99.field1931[var6 + 1];
                                        class17.field231 = class99.field1931[var6 + 2];
                                        class28.field412.method578(-87, 212);
                                        class28.field412.method1638(32, class165.field2981);
                                        class28.field412.method1638(32, class59.field1002);
                                        class28.field412.method1638(32, class17.field231);
                                        continue;
                                    }
                                    if (var451 == 5002) {
                                        class99.field1945++;
                                        var6 -= 2;
                                        int var215 = class99.field1931[var6];
                                        var11--;
                                        class66 var216 = class151.field2709[var11];
                                        int var217 = class99.field1931[var6 + 1];
                                        class28.field412.method578(arg1 - 15, 159);
                                        class28.field412.method1651(true, var216.method479(10908));
                                        class28.field412.method1638(32, var215 - 1);
                                        class28.field412.method1638(32, var217);
                                        continue;
                                    }
                                    if (var451 == 5003) {
                                        class66 var218 = null;
                                        var6--;
                                        int var219 = class99.field1931[var6];
                                        if (var219 < 100) {
                                            var218 = class224.field3843[var219];
                                        }
                                        if (var218 == null) {
                                            var218 = class199.field3425;
                                        }
                                        class151.field2709[var11++] = var218;
                                        continue;
                                    }
                                    if (var451 == 5004) {
                                        var6--;
                                        int var220 = class99.field1931[var6];
                                        int var221 = -1;
                                        if (var220 < 100 && class224.field3843[var220] != null) {
                                            var221 = class21.field288[var220];
                                        }
                                        class99.field1931[var6++] = var221;
                                        continue;
                                    }
                                    if (var451 == 5005) {
                                        class99.field1931[var6++] = class59.field1002;
                                        continue;
                                    }
                                    if (var451 == 5008) {
                                        var11--;
                                        class66 var222 = class151.field2709[var11];
                                        if (var222.method459(class45.field829, 28)) {
                                            class103.method710(var222, (byte) 1);
                                            continue;
                                        }
                                        if (class130.field2430 == 0 && (class171.field3035 == 1 || class98.field1923 == 1)) {
                                            continue;
                                        }
                                        class66 var223 = var222.method478((byte) 34);
                                        class75.field1499++;
                                        byte var224 = 0;
                                        byte var225 = 0;
                                        if (var223.method459(class10.field109, 88)) {
                                            var222 = var222.method485(class10.field109.method460((byte) -128), true);
                                            var224 = 0;
                                        } else if (var223.method459(class115.field2174, 101)) {
                                            var224 = 1;
                                            var222 = var222.method485(class115.field2174.method460((byte) -104), true);
                                        } else if (var223.method459(class260.field4586, 45)) {
                                            var222 = var222.method485(class260.field4586.method460((byte) -124), true);
                                            var224 = 2;
                                        } else if (var223.method459(class203.field3473, 82)) {
                                            var224 = 3;
                                            var222 = var222.method485(class203.field3473.method460((byte) -119), true);
                                        } else if (var223.method459(class224.field3839, 62)) {
                                            var224 = 4;
                                            var222 = var222.method485(class224.field3839.method460((byte) -114), true);
                                        } else if (var223.method459(class44.field796, 51)) {
                                            var224 = 5;
                                            var222 = var222.method485(class44.field796.method460((byte) -107), true);
                                        } else if (var223.method459(class182.field3197, 83)) {
                                            var224 = 6;
                                            var222 = var222.method485(class182.field3197.method460((byte) -117), true);
                                        } else if (var223.method459(class45.field842, 90)) {
                                            var222 = var222.method485(class45.field842.method460((byte) -108), true);
                                            var224 = 7;
                                        } else if (var223.method459(class11.field141, arg1 - 96)) {
                                            var222 = var222.method485(class11.field141.method460((byte) -108), true);
                                            var224 = 8;
                                        } else if (var223.method459(class244.field4257, 109)) {
                                            var224 = 9;
                                            var222 = var222.method485(class244.field4257.method460((byte) -103), true);
                                        } else if (var223.method459(class139.field2561, 42)) {
                                            var224 = 10;
                                            var222 = var222.method485(class139.field2561.method460((byte) -96), true);
                                        } else if (var223.method459(class63.field1246, arg1 ^ 0x8)) {
                                            var222 = var222.method485(class63.field1246.method460((byte) -125), true);
                                            var224 = 11;
                                        } else if (class69.field1401 != 0) {
                                            if (var223.method459(class10.field113, arg1 - 80)) {
                                                var222 = var222.method485(class10.field113.method460((byte) -128), true);
                                                var224 = 0;
                                            } else if (var223.method459(class115.field2170, 103)) {
                                                var222 = var222.method485(class115.field2170.method460((byte) -97), true);
                                                var224 = 1;
                                            } else if (var223.method459(class260.field4576, arg1 ^ 0x4)) {
                                                var224 = 2;
                                                var222 = var222.method485(class260.field4576.method460((byte) -112), true);
                                            } else if (var223.method459(class203.field3474, arg1 ^ 0x1)) {
                                                var224 = 3;
                                                var222 = var222.method485(class203.field3474.method460((byte) -114), true);
                                            } else if (var223.method459(class224.field3835, 86)) {
                                                var224 = 4;
                                                var222 = var222.method485(class224.field3835.method460((byte) -96), true);
                                            } else if (var223.method459(class44.field773, 108)) {
                                                var222 = var222.method485(class44.field773.method460((byte) -98), true);
                                                var224 = 5;
                                            } else if (var223.method459(class182.field3196, arg1 - 24)) {
                                                var224 = 6;
                                                var222 = var222.method485(class182.field3196.method460((byte) -113), true);
                                            } else if (var223.method459(class45.field841, 37)) {
                                                var222 = var222.method485(class45.field841.method460((byte) -101), true);
                                                var224 = 7;
                                            } else if (var223.method459(class11.field138, 66)) {
                                                var222 = var222.method485(class11.field138.method460((byte) -98), true);
                                                var224 = 8;
                                            } else if (var223.method459(class244.field4270, arg1 - 73)) {
                                                var224 = 9;
                                                var222 = var222.method485(class244.field4270.method460((byte) -103), true);
                                            } else if (var223.method459(class139.field2581, arg1 ^ 0x5)) {
                                                var222 = var222.method485(class139.field2581.method460((byte) -120), true);
                                                var224 = 10;
                                            } else if (var223.method459(class63.field1243, 54)) {
                                                var224 = 11;
                                                var222 = var222.method485(class63.field1243.method460((byte) -103), true);
                                            }
                                        }
                                        class66 var226 = var222.method478((byte) -118);
                                        if (var226.method459(class105.field2021, 99)) {
                                            var225 = 1;
                                            var222 = var222.method485(class105.field2021.method460((byte) -118), true);
                                        } else if (var226.method459(class75.field1488, arg1 - 89)) {
                                            var225 = 2;
                                            var222 = var222.method485(class75.field1488.method460((byte) -104), true);
                                        } else if (var226.method459(class257.field4515, arg1 - 16)) {
                                            var225 = 3;
                                            var222 = var222.method485(class257.field4515.method460((byte) -101), true);
                                        } else if (var226.method459(class27.field349, 82)) {
                                            var222 = var222.method485(class27.field349.method460((byte) -125), true);
                                            var225 = 4;
                                        } else if (var226.method459(class250.field4409, arg1 ^ 0x47)) {
                                            var222 = var222.method485(class250.field4409.method460((byte) -108), true);
                                            var225 = 5;
                                        } else if (class69.field1401 != 0) {
                                            if (var226.method459(class105.field2024, 87)) {
                                                var225 = 1;
                                                var222 = var222.method485(class105.field2024.method460((byte) -108), true);
                                            } else if (var226.method459(class75.field1496, 95)) {
                                                var225 = 2;
                                                var222 = var222.method485(class75.field1496.method460((byte) -98), true);
                                            } else if (var226.method459(class257.field4512, 76)) {
                                                var222 = var222.method485(class257.field4512.method460((byte) -120), true);
                                                var225 = 3;
                                            } else if (var226.method459(class27.field366, 116)) {
                                                var222 = var222.method485(class27.field366.method460((byte) -104), true);
                                                var225 = 4;
                                            } else if (var226.method459(class250.field4415, 92)) {
                                                var222 = var222.method485(class250.field4415.method460((byte) -101), true);
                                                var225 = 5;
                                            }
                                        }
                                        class28.field412.method578(arg1 - 43, 222);
                                        class28.field412.method1638(arg1 ^ 0x5C, 0);
                                        int var227 = class28.field412.field4335;
                                        class28.field412.method1638(32, var224);
                                        class28.field412.method1638(32, var225);
                                        class160.method1088(class28.field412, arg1 - 124, var222);
                                        class28.field412.method1662(class28.field412.field4335 - var227, 119);
                                        continue;
                                    }
                                    if (var451 == 5009) {
                                        var11 -= 2;
                                        class66 var228 = class151.field2709[var11];
                                        class66 var229 = class151.field2709[var11 + 1];
                                        if (class130.field2430 != 0 || class171.field3035 != 1 && class98.field1923 != 1) {
                                            class187.field3242++;
                                            class28.field412.method578(arg1 ^ 0x28, 178);
                                            class28.field412.method1638(32, 0);
                                            int var230 = class28.field412.field4335;
                                            class28.field412.method1651(true, var228.method479(arg1 ^ 0x2AE0));
                                            class160.method1088(class28.field412, 0, var229);
                                            class28.field412.method1662(class28.field412.field4335 - var230, 126);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5010) {
                                        var6--;
                                        int var231 = class99.field1931[var6];
                                        class66 var232 = null;
                                        if (var231 < 100) {
                                            var232 = class69.field1402[var231];
                                        }
                                        if (var232 == null) {
                                            var232 = class199.field3425;
                                        }
                                        class151.field2709[var11++] = var232;
                                        continue;
                                    }
                                    if (var451 == 5011) {
                                        class66 var233 = null;
                                        var6--;
                                        int var234 = class99.field1931[var6];
                                        if (var234 < 100) {
                                            var233 = class196.field3391[var234];
                                        }
                                        if (var233 == null) {
                                            var233 = class199.field3425;
                                        }
                                        class151.field2709[var11++] = var233;
                                        continue;
                                    }
                                    if (var451 == 5012) {
                                        var6--;
                                        int var235 = class99.field1931[var6];
                                        int var236 = -1;
                                        if (var235 < 100) {
                                            var236 = class12.field157[var235];
                                        }
                                        class99.field1931[var6++] = var236;
                                        continue;
                                    }
                                    if (var451 == 5015) {
                                        class66 var237;
                                        if (class207.field3595 == null || class207.field3595.field815 == null) {
                                            var237 = class85.field1674;
                                        } else {
                                            var237 = class207.field3595.method324(arg1 ^ 0xBC4);
                                        }
                                        class151.field2709[var11++] = var237;
                                        continue;
                                    }
                                    if (var451 == 5016) {
                                        class99.field1931[var6++] = class17.field231;
                                        continue;
                                    }
                                    if (var451 == 5017) {
                                        class99.field1931[var6++] = class110.field2125;
                                        continue;
                                    }
                                    if (var451 == 5050) {
                                        var6--;
                                        int var238 = class99.field1931[var6];
                                        class151.field2709[var11++] = class133.method922(true, var238).field987;
                                        continue;
                                    }
                                    if (var451 == 5051) {
                                        var6--;
                                        int var239 = class99.field1931[var6];
                                        class57 var240 = class133.method922(true, var239);
                                        if (var240.field983 == null) {
                                            class99.field1931[var6++] = 0;
                                        } else {
                                            class99.field1931[var6++] = var240.field983.length;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5052) {
                                        var6 -= 2;
                                        int var241 = class99.field1931[var6];
                                        int var242 = class99.field1931[var6 + 1];
                                        class57 var243 = class133.method922(true, var241);
                                        int var244 = var243.field983[var242];
                                        class99.field1931[var6++] = var244;
                                        continue;
                                    }
                                    if (var451 == 5053) {
                                        var6--;
                                        int var245 = class99.field1931[var6];
                                        class57 var246 = class133.method922(true, var245);
                                        if (var246.field972 == null) {
                                            class99.field1931[var6++] = 0;
                                        } else {
                                            class99.field1931[var6++] = var246.field972.length;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5054) {
                                        var6 -= 2;
                                        int var247 = class99.field1931[var6];
                                        int var248 = class99.field1931[var6 + 1];
                                        class99.field1931[var6++] = class133.method922(true, var247).field972[var248];
                                        continue;
                                    }
                                    if (var451 == 5055) {
                                        var6--;
                                        int var249 = class99.field1931[var6];
                                        class151.field2709[var11++] = class143.method987(var249, (byte) 103).method266(91);
                                        continue;
                                    }
                                    if (var451 == 5056) {
                                        var6--;
                                        int var250 = class99.field1931[var6];
                                        class41 var251 = class143.method987(var250, (byte) 102);
                                        if (var251.field676 == null) {
                                            class99.field1931[var6++] = 0;
                                        } else {
                                            class99.field1931[var6++] = var251.field676.length;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5057) {
                                        var6 -= 2;
                                        int var252 = class99.field1931[var6];
                                        int var253 = class99.field1931[var6 + 1];
                                        class99.field1931[var6++] = class143.method987(var252, (byte) 108).field676[var253];
                                        continue;
                                    }
                                    if (var451 == 5058) {
                                        field737 = new class183();
                                        var6--;
                                        field737.field3201 = class99.field1931[var6];
                                        field737.field3211 = class143.method987(field737.field3201, (byte) 96);
                                        field737.field3202 = new int[field737.field3211.method258((byte) -121)];
                                        continue;
                                    }
                                    if (var451 == 5059) {
                                        class28.field412.method578(arg1 - 218, 250);
                                        class28.field412.method1638(32, 0);
                                        class83.field1618++;
                                        int var254 = class28.field412.field4335;
                                        class28.field412.method1638(32, 0);
                                        class28.field412.method1650(false, field737.field3201);
                                        field737.field3211.method259(-33, field737.field3202, class28.field412);
                                        class28.field412.method1662(class28.field412.field4335 - var254, 125);
                                        continue;
                                    }
                                    if (var451 == 5060) {
                                        class246.field4295++;
                                        var11--;
                                        class66 var255 = class151.field2709[var11];
                                        class28.field412.method578(122, 78);
                                        class28.field412.method1638(32, 0);
                                        int var256 = class28.field412.field4335;
                                        class28.field412.method1651(true, var255.method479(10908));
                                        class28.field412.method1650(false, field737.field3201);
                                        field737.field3211.method259(-94, field737.field3202, class28.field412);
                                        class28.field412.method1662(class28.field412.field4335 - var256, 120);
                                        continue;
                                    }
                                    if (var451 == 5061) {
                                        class83.field1618++;
                                        class28.field412.method578(84, 250);
                                        class28.field412.method1638(32, 0);
                                        int var257 = class28.field412.field4335;
                                        class28.field412.method1638(32, 1);
                                        class28.field412.method1650(false, field737.field3201);
                                        field737.field3211.method259(-90, field737.field3202, class28.field412);
                                        class28.field412.method1662(class28.field412.field4335 - var257, arg1 + 2);
                                        continue;
                                    }
                                    if (var451 == 5062) {
                                        var6 -= 2;
                                        int var258 = class99.field1931[var6];
                                        int var259 = class99.field1931[var6 + 1];
                                        class99.field1931[var6++] = class133.method922(true, var258).field971[var259];
                                        continue;
                                    }
                                    if (var451 == 5063) {
                                        var6 -= 2;
                                        int var260 = class99.field1931[var6];
                                        int var261 = class99.field1931[var6 + 1];
                                        class99.field1931[var6++] = class133.method922(true, var260).field980[var261];
                                        continue;
                                    }
                                    if (var451 == 5064) {
                                        var6 -= 2;
                                        int var262 = class99.field1931[var6 + 1];
                                        int var263 = class99.field1931[var6];
                                        if (var262 == -1) {
                                            class99.field1931[var6++] = -1;
                                        } else {
                                            class99.field1931[var6++] = class133.method922(true, var263).method381(var262, 115);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5065) {
                                        var6 -= 2;
                                        int var264 = class99.field1931[var6 + 1];
                                        int var265 = class99.field1931[var6];
                                        if (var264 == -1) {
                                            class99.field1931[var6++] = -1;
                                        } else {
                                            class99.field1931[var6++] = class133.method922(true, var265).method376(var264, -1);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5066) {
                                        var6--;
                                        int var266 = class99.field1931[var6];
                                        class99.field1931[var6++] = class143.method987(var266, (byte) 94).method258((byte) -38);
                                        continue;
                                    }
                                    if (var451 == 5067) {
                                        var6 -= 2;
                                        int var267 = class99.field1931[var6];
                                        int var268 = class99.field1931[var6 + 1];
                                        int var269 = class143.method987(var267, (byte) 115).method260(var268, (byte) -66);
                                        class99.field1931[var6++] = var269;
                                        continue;
                                    }
                                    if (var451 == 5068) {
                                        var6 -= 2;
                                        int var270 = class99.field1931[var6 + 1];
                                        int var271 = class99.field1931[var6];
                                        field737.field3202[var271] = var270;
                                        continue;
                                    }
                                    if (var451 == 5069) {
                                        var6 -= 2;
                                        int var272 = class99.field1931[var6];
                                        int var273 = class99.field1931[var6 + 1];
                                        field737.field3202[var272] = var273;
                                        continue;
                                    }
                                    if (var451 == 5070) {
                                        var6 -= 3;
                                        int var274 = class99.field1931[var6];
                                        int var275 = class99.field1931[var6 + 1];
                                        int var276 = class99.field1931[var6 + 2];
                                        class41 var277 = class143.method987(var274, (byte) 126);
                                        if (var277.method260(var275, (byte) -66) != 0) {
                                            throw new RuntimeException("bad command");
                                        }
                                        class99.field1931[var6++] = var277.method257(var275, -20484, var276);
                                        continue;
                                    }
                                } else if (var451 < 5200) {
                                    if (var451 == 5100) {
                                        if (class167.field3009[86]) {
                                            class99.field1931[var6++] = 1;
                                        } else {
                                            class99.field1931[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5101) {
                                        if (class167.field3009[82]) {
                                            class99.field1931[var6++] = 1;
                                        } else {
                                            class99.field1931[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5102) {
                                        if (class167.field3009[81]) {
                                            class99.field1931[var6++] = 1;
                                        } else {
                                            class99.field1931[var6++] = 0;
                                        }
                                        continue;
                                    }
                                } else if (var451 < 5300) {
                                    if (var451 == 5200) {
                                        var6--;
                                        class249.method1670(false, class99.field1931[var6]);
                                        continue;
                                    }
                                    if (var451 == 5201) {
                                        class99.field1931[var6++] = class135.method932(50);
                                        continue;
                                    }
                                    if (var451 == 5202) {
                                        var6--;
                                        client.method588(class99.field1931[var6], true);
                                        continue;
                                    }
                                    if (var451 == 5203) {
                                        var11--;
                                        class145.method999(class151.field2709[var11], -1);
                                        continue;
                                    }
                                    if (var451 == 5204) {
                                        class151.field2709[var11 - 1] = class111.method750(class151.field2709[var11 - 1], 14589);
                                        continue;
                                    }
                                    if (var451 == 5205) {
                                        var11--;
                                        class261.method1780((byte) 37, class151.field2709[var11]);
                                        continue;
                                    }
                                    if (var451 == 5206) {
                                        var6--;
                                        int var162 = class99.field1931[var6];
                                        class240 var163 = class83.method580(var162 & 0x3FFF, var162 >> 14 & 0x3FFF, 111);
                                        if (var163 == null) {
                                            class151.field2709[var11++] = class199.field3425;
                                        } else {
                                            class151.field2709[var11++] = var163.field4164;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5207) {
                                        var11--;
                                        class240 var164 = class122.method826((byte) -94, class151.field2709[var11]);
                                        if (var164 != null && var164.field4181 != null) {
                                            class151.field2709[var11++] = var164.field4181;
                                            continue;
                                        }
                                        class151.field2709[var11++] = class199.field3425;
                                        continue;
                                    }
                                } else if (var451 >= 5400) {
                                    if (var451 < 5500) {
                                        if (var451 == 5400) {
                                            class95.field1824++;
                                            var6--;
                                            int var165 = class99.field1931[var6];
                                            var11 -= 2;
                                            class66 var166 = class151.field2709[var11];
                                            class66 var167 = class151.field2709[var11 + 1];
                                            class28.field412.method578(arg1 ^ 0xFFFFFFB9, 161);
                                            class28.field412.method1638(arg1 - 92, class138.method950(var166, -125) + class138.method950(var167, -110) + 1);
                                            class28.field412.method1641((byte) -9, var166);
                                            class28.field412.method1641((byte) -9, var167);
                                            class28.field412.method1638(32, var165);
                                            continue;
                                        }
                                        if (var451 == 5401) {
                                            var6 -= 2;
                                            class246.field4291[class99.field1931[var6]] = (short) class250.method1694(class99.field1931[var6 + 1], -62);
                                            class48.method344(25580);
                                            class56.method374((byte) -116);
                                            class165.method1115(2);
                                            class75.method538(arg1 ^ 0x7C);
                                            class125.method872((byte) 117);
                                            continue;
                                        }
                                        if (var451 == 5405) {
                                            var6 -= 2;
                                            int var168 = class99.field1931[var6 + 1];
                                            int var169 = class99.field1931[var6];
                                            if (var169 >= 0 && var169 < 2) {
                                                class59.field1008[var169] = new int[var168 << 1][4];
                                            }
                                            continue;
                                        }
                                        if (var451 == 5406) {
                                            var6 -= 7;
                                            int var170 = class99.field1931[var6 + 3];
                                            int var171 = class99.field1931[var6];
                                            int var172 = class99.field1931[var6 + 5];
                                            int var173 = class99.field1931[var6 + 4];
                                            int var174 = class99.field1931[var6 + 2];
                                            int var175 = class99.field1931[var6 + 1] << 1;
                                            int var176 = class99.field1931[var6 + 6];
                                            if (var171 >= 0 && var171 < 2 && class59.field1008[var171] != null && var175 >= 0 && var175 < class59.field1008[var171].length) {
                                                class59.field1008[var171][var175] = new int[] { (class115.method767(268426801, var174) >> 14) * 128, var170, class115.method767(var174, 16383) * 128, var176 };
                                                class59.field1008[var171][var175 + 1] = new int[] { (class115.method767(268429292, var173) >> 14) * 128, var172, class115.method767(16383, var173) * 128 };
                                            }
                                            continue;
                                        }
                                        if (var451 == 5407) {
                                            var6--;
                                            int var177 = class59.field1008[class99.field1931[var6]].length >> 1;
                                            class99.field1931[var6++] = var177;
                                            continue;
                                        }
                                        if (var451 == 5408) {
                                            class99.field1931[var6++] = 0;
                                            continue;
                                        }
                                        if (var451 == 5409) {
                                            class183.method1221(50);
                                            continue;
                                        }
                                        if (var451 == 5411) {
                                            if (class158.field2857 == null) {
                                                class37.method206(class121.method819(arg1 ^ 0xFFFFFF83), false, -124);
                                            } else {
                                                System.exit(0);
                                            }
                                            continue;
                                        }
                                        if (var451 == 5419) {
                                            class66 var178 = class199.field3425;
                                            if (class49.field885 != null) {
                                                var178 = class260.method1772(class49.field885.field4070, -17516);
                                                try {
                                                    if (class49.field885.field4069 != null) {
                                                        byte[] var179 = ((String) class49.field885.field4069).getBytes("ISO-8859-1");
                                                        var178 = class69.method507(var179.length, var179, 109, 0);
                                                    }
                                                } catch (UnsupportedEncodingException var449) {
                                                }
                                            }
                                            class151.field2709[var11++] = var178;
                                            continue;
                                        }
                                        if (var451 == 5420) {
                                            class99.field1931[var6++] = class203.field3477 == 2 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 5421) {
                                            var6--;
                                            boolean var180 = class99.field1931[var6] == 1;
                                            var11--;
                                            class66 var181 = class151.field2709[var11];
                                            class37.method206(class212.method1372(2, new class66[] { class121.method819(-1), var181 }), var180, -127);
                                            continue;
                                        }
                                        if (var451 == 5422) {
                                            var11 -= 2;
                                            class66 var182 = class151.field2709[var11];
                                            class66 var183 = class151.field2709[var11 + 1];
                                            var6--;
                                            int var184 = class99.field1931[var6];
                                            if (var182.method460((byte) -108) > 0) {
                                                if (class231.field4025 == null) {
                                                    class231.field4025 = new class66[class109.field2112[class163.field2921]];
                                                }
                                                class231.field4025[var184] = var182;
                                            }
                                            if (var183.method460((byte) -119) > 0) {
                                                if (class102.field1998 == null) {
                                                    class102.field1998 = new class66[class109.field2112[class163.field2921]];
                                                }
                                                class102.field1998[var184] = var183;
                                            }
                                            continue;
                                        }
                                    } else if (var451 < 5600) {
                                        if (var451 == 5500) {
                                            var6 -= 4;
                                            int var185 = class99.field1931[var6];
                                            int var186 = class99.field1931[var6 + 1];
                                            int var187 = class99.field1931[var6 + 3];
                                            int var188 = class99.field1931[var6 + 2];
                                            class120.method817((var185 >> 14 & 0x3FFF) - class3.field39, (var185 & 0x3FFF) - class34.field512, var187, var188, -127, var186, false);
                                            continue;
                                        }
                                        if (var451 == 5501) {
                                            var6 -= 4;
                                            int var189 = class99.field1931[var6];
                                            int var190 = class99.field1931[var6 + 2];
                                            int var191 = class99.field1931[var6 + 3];
                                            int var192 = class99.field1931[var6 + 1];
                                            class144.method992(var190, var192, (var189 >> 14 & 0x3FFF) - class3.field39, true, (var189 & 0x3FFF) - class34.field512, var191);
                                            continue;
                                        }
                                        if (var451 == 5502) {
                                            var6 -= 6;
                                            int var193 = class99.field1931[var6];
                                            if (var193 >= 2) {
                                                throw new RuntimeException();
                                            }
                                            class181.field3171 = var193;
                                            int var194 = class99.field1931[var6 + 1];
                                            if (var194 + 1 >= class59.field1008[class181.field3171].length >> 1) {
                                                throw new RuntimeException();
                                            }
                                            class98.field1917 = var194;
                                            class253.field4438 = 0;
                                            class9.field91 = class99.field1931[var6 + 2];
                                            class164.field2937 = class99.field1931[var6 + 3];
                                            int var195 = class99.field1931[var6 + 4];
                                            if (var195 >= 2) {
                                                throw new RuntimeException();
                                            }
                                            class238.field4135 = var195;
                                            int var196 = class99.field1931[var6 + 5];
                                            if (var196 + 1 >= class59.field1008[class238.field4135].length >> 1) {
                                                throw new RuntimeException();
                                            }
                                            class150.field2697 = var196;
                                            class167.field2995 = 3;
                                            continue;
                                        }
                                        if (var451 == 5503) {
                                            class48.method340(arg1 ^ 0xFFFFD53B);
                                            continue;
                                        }
                                        if (var451 == 5504) {
                                            var6 -= 2;
                                            class125.field2367 = class99.field1931[var6];
                                            class259.field4562 = class99.field1931[var6 + 1];
                                            class182.method1210((byte) -121);
                                            continue;
                                        }
                                        if (var451 == 5505) {
                                            class99.field1931[var6++] = class125.field2367;
                                            continue;
                                        }
                                        if (var451 == 5506) {
                                            class99.field1931[var6++] = class259.field4562;
                                            continue;
                                        }
                                    } else if (var451 < 5700) {
                                        if (var451 == 5600) {
                                            var11 -= 2;
                                            var6--;
                                            int var197 = class99.field1931[var6];
                                            class66 var198 = class151.field2709[var11 + 1];
                                            class66 var199 = class151.field2709[var11];
                                            if (class244.field4258 == 10 && class173.field3059 == 0 && class69.field1400 == 0) {
                                                class125.method863(var198, arg1 ^ 0x4A, var199, var197);
                                            }
                                            continue;
                                        }
                                        if (var451 == 5601) {
                                            class138.method951(false);
                                            continue;
                                        }
                                        if (var451 == 5602) {
                                            if (class173.field3059 == 0) {
                                                class184.field3217 = -2;
                                            }
                                            continue;
                                        }
                                        if (var451 == 5603) {
                                            var6 -= 4;
                                            if (class244.field4258 == 10 && class173.field3059 == 0 && class69.field1400 == 0) {
                                                class11.method48(class99.field1931[var6], class99.field1931[var6 + 1], true, class99.field1931[var6 + 2], class99.field1931[var6 + 3]);
                                            }
                                            continue;
                                        }
                                        if (var451 == 5604) {
                                            var11--;
                                            if (class244.field4258 == 10 && class173.field3059 == 0 && class69.field1400 == 0) {
                                                class64.method433(-3, class151.field2709[var11].method479(10908));
                                            }
                                            continue;
                                        }
                                        if (var451 == 5605) {
                                            var11 -= 2;
                                            var6 -= 4;
                                            if (class244.field4258 == 10 && class173.field3059 == 0 && class69.field1400 == 0) {
                                                class250.method1696(class151.field2709[var11].method479(arg1 ^ 0x2AE0), class99.field1931[var6], arg1 ^ 0x28, class99.field1931[var6 + 1], class151.field2709[var11 + 1], class99.field1931[var6 + 3], class99.field1931[var6 + 2]);
                                            }
                                            continue;
                                        }
                                        if (var451 == 5606) {
                                            if (class69.field1400 == 0) {
                                                class91.field1750 = -2;
                                            }
                                            continue;
                                        }
                                        if (var451 == 5607) {
                                            class99.field1931[var6++] = class184.field3217;
                                            continue;
                                        }
                                        if (var451 == 5608) {
                                            class99.field1931[var6++] = class3.field38;
                                            continue;
                                        }
                                        if (var451 == 5609) {
                                            class99.field1931[var6++] = class91.field1750;
                                            continue;
                                        }
                                        if (var451 == 5610) {
                                            for (int var200 = 0; var200 < 5; var200++) {
                                                class151.field2709[var11++] = class132.field2462.length <= var200 ? class199.field3425 : class132.field2462[var200];
                                            }
                                            class132.field2462 = null;
                                            continue;
                                        }
                                    } else if (var451 < 6100) {
                                        if (var451 == 6001) {
                                            var6--;
                                            int var209 = class99.field1931[var6];
                                            if (var209 < 1) {
                                                var209 = 1;
                                            }
                                            if (var209 > 4) {
                                                var209 = 4;
                                            }
                                            class63.field1242 = var209;
                                            if (class63.field1242 == 1) {
                                                class123.method847(0.9F);
                                            }
                                            if (class63.field1242 == 2) {
                                                class123.method847(0.8F);
                                            }
                                            if (class63.field1242 == 3) {
                                                class123.method847(0.7F);
                                            }
                                            if (class63.field1242 == 4) {
                                                class123.method847(0.6F);
                                            }
                                            class56.method374((byte) -67);
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6002) {
                                            var6--;
                                            class4.method17(class99.field1931[var6] == 1, 1);
                                            class78.method554((byte) 51);
                                            client.method585((byte) -68);
                                            class225.method1438(-13401);
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6003) {
                                            var6--;
                                            class198.field3421 = class99.field1931[var6] == 1;
                                            class225.method1438(arg1 - 13525);
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6005) {
                                            var6--;
                                            class64.field1265 = class99.field1931[var6] == 1;
                                            client.method585((byte) -120);
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6006) {
                                            var6--;
                                            class7.field61 = class99.field1931[var6] == 1;
                                            ((class62) class123.field2318).method414((byte) -97, !class7.field61);
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6007) {
                                            var6--;
                                            class66.field1277 = class99.field1931[var6] == 1;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6008) {
                                            var6--;
                                            class205.field3512 = class99.field1931[var6] == 1;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6009) {
                                            var6--;
                                            class15.field200 = class99.field1931[var6] == 1;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6010) {
                                            var6--;
                                            class212.field3647 = class99.field1931[var6] == 1;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6011) {
                                            var6--;
                                            int var210 = class99.field1931[var6];
                                            if (var210 < 0 || var210 > 2) {
                                                var210 = 0;
                                            }
                                            class124.field2334 = var210;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6012) {
                                            var6--;
                                            field760 = class99.field1931[var6] == 1;
                                            if (class63.field1242 == 1) {
                                                class123.method847(0.9F);
                                            }
                                            if (class63.field1242 == 2) {
                                                class123.method847(0.8F);
                                            }
                                            if (class63.field1242 == 3) {
                                                class123.method847(0.7F);
                                            }
                                            if (class63.field1242 == 4) {
                                                class123.method847(0.6F);
                                            }
                                            client.method585((byte) -103);
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6014) {
                                            var6--;
                                            class33.field492 = class99.field1931[var6] == 1;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6015) {
                                            var6--;
                                            class155.field2764 = class99.field1931[var6] == 1;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6016) {
                                            var6--;
                                            int var211 = class99.field1931[var6];
                                            if (var211 < 0 || var211 > 2) {
                                                var211 = 0;
                                            }
                                            class44.field782 = var211;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6017) {
                                            var6--;
                                            class250.field4401 = class99.field1931[var6] == 1;
                                            class142.method984((byte) 124);
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6018) {
                                            var6--;
                                            int var212 = class99.field1931[var6];
                                            if (var212 < 0) {
                                                var212 = 0;
                                            }
                                            if (var212 > 127) {
                                                var212 = 127;
                                            }
                                            class61.field1030 = var212;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6019) {
                                            var6--;
                                            int var213 = class99.field1931[var6];
                                            if (var213 < 0) {
                                                var213 = 0;
                                            }
                                            if (var213 > 255) {
                                                var213 = 255;
                                            }
                                            if (class164.field2936 != var213) {
                                                if (class164.field2936 == 0 && class67.field1350 != -1) {
                                                    class233.method1525(class67.field1350, class28.field405, false, 0, var213, false);
                                                    class252.field4431 = false;
                                                } else if (var213 == 0) {
                                                    class130.method907(16777215);
                                                    class252.field4431 = false;
                                                } else {
                                                    class146.method1007(var213, 0);
                                                }
                                                class164.field2936 = var213;
                                            }
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6020) {
                                            var6--;
                                            int var214 = class99.field1931[var6];
                                            if (var214 < 0) {
                                                var214 = 0;
                                            }
                                            if (var214 > 127) {
                                                var214 = 127;
                                            }
                                            class54.field944 = var214;
                                            class256.method1718(true, class95.field1835);
                                            class158.field2855 = false;
                                            continue;
                                        }
                                        if (var451 == 6021) {
                                            var6--;
                                            class251.field4417 = class99.field1931[var6] == 1;
                                            class225.method1438(arg1 ^ 0xFFFFCBDB);
                                            continue;
                                        }
                                        if (var451 == 6022) {
                                            var6--;
                                            class176.field3095 = class99.field1931[var6] == 1;
                                            class256.method1718(true, class95.field1835);
                                            class48.method341(0, -97);
                                            continue;
                                        }
                                    } else if (var451 < 6200) {
                                        if (var451 == 6101) {
                                            class99.field1931[var6++] = class63.field1242;
                                            continue;
                                        }
                                        if (var451 == 6102) {
                                            class99.field1931[var6++] = class88.method625(24781) ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6103) {
                                            class99.field1931[var6++] = class198.field3421 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6105) {
                                            class99.field1931[var6++] = class64.field1265 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6106) {
                                            class99.field1931[var6++] = class7.field61 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6107) {
                                            class99.field1931[var6++] = class66.field1277 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6108) {
                                            class99.field1931[var6++] = class205.field3512 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6109) {
                                            class99.field1931[var6++] = class15.field200 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6110) {
                                            class99.field1931[var6++] = class212.field3647 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6111) {
                                            class99.field1931[var6++] = class124.field2334;
                                            continue;
                                        }
                                        if (var451 == 6112) {
                                            class99.field1931[var6++] = field760 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6114) {
                                            class99.field1931[var6++] = class33.field492 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6115) {
                                            class99.field1931[var6++] = class155.field2764 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6116) {
                                            class99.field1931[var6++] = class44.field782;
                                            continue;
                                        }
                                        if (var451 == 6117) {
                                            class99.field1931[var6++] = class250.field4401 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6118) {
                                            class99.field1931[var6++] = class61.field1030;
                                            continue;
                                        }
                                        if (var451 == 6119) {
                                            class99.field1931[var6++] = class164.field2936;
                                            continue;
                                        }
                                        if (var451 == 6120) {
                                            class99.field1931[var6++] = class54.field944;
                                            continue;
                                        }
                                        if (var451 == 6121) {
                                            class99.field1931[var6++] = 0;
                                            continue;
                                        }
                                        if (var451 == 6122) {
                                            class99.field1931[var6++] = class176.field3095 ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var451 < 6300) {
                                        if (var451 == 6200) {
                                            var6 -= 2;
                                            class96.field1856 = (short) class99.field1931[var6];
                                            if (class96.field1856 <= 0) {
                                                class96.field1856 = 256;
                                            }
                                            class10.field105 = (short) class99.field1931[var6 + 1];
                                            if (class10.field105 <= 0) {
                                                class10.field105 = 205;
                                            }
                                            continue;
                                        }
                                        if (var451 == 6201) {
                                            var6 -= 2;
                                            class37.field544 = (short) class99.field1931[var6];
                                            if (class37.field544 <= 0) {
                                                class37.field544 = 256;
                                            }
                                            class234.field4093 = (short) class99.field1931[var6 + 1];
                                            if (class234.field4093 <= 0) {
                                                class234.field4093 = 320;
                                            }
                                            continue;
                                        }
                                        if (var451 == 6202) {
                                            var6 -= 4;
                                            class102.field1985 = (short) class99.field1931[var6];
                                            if (class102.field1985 <= 0) {
                                                class102.field1985 = 1;
                                            }
                                            class4.field48 = (short) class99.field1931[var6 + 1];
                                            if (class4.field48 <= 0) {
                                                class4.field48 = 32767;
                                            } else if (class102.field1985 > class4.field48) {
                                                class4.field48 = class102.field1985;
                                            }
                                            class195.field3369 = (short) class99.field1931[var6 + 2];
                                            if (class195.field3369 <= 0) {
                                                class195.field3369 = 1;
                                            }
                                            class24.field308 = (short) class99.field1931[var6 + 3];
                                            if (class24.field308 <= 0) {
                                                class24.field308 = 32767;
                                            } else if (class195.field3369 > class24.field308) {
                                                class24.field308 = class195.field3369;
                                            }
                                            continue;
                                        }
                                        if (var451 == 6203) {
                                            class195.method1269(false, class154.field2751.field1196, 0, class154.field2751.field1215, -81, 0);
                                            class99.field1931[var6++] = class194.field3352;
                                            class99.field1931[var6++] = class54.field942;
                                            continue;
                                        }
                                        if (var451 == 6204) {
                                            class99.field1931[var6++] = class37.field544;
                                            class99.field1931[var6++] = class234.field4093;
                                            continue;
                                        }
                                        if (var451 == 6205) {
                                            class99.field1931[var6++] = class96.field1856;
                                            class99.field1931[var6++] = class10.field105;
                                            continue;
                                        }
                                    } else if (var451 < 6400) {
                                        if (var451 == 6300) {
                                            class99.field1931[var6++] = (int) (class3.method13(17161) / 60000L);
                                            continue;
                                        }
                                        if (var451 == 6301) {
                                            class99.field1931[var6++] = (int) (class3.method13(17161) / 86400000L) - 11745;
                                            continue;
                                        }
                                        if (var451 == 6302) {
                                            var6 -= 3;
                                            int var204 = class99.field1931[var6];
                                            int var205 = class99.field1931[var6 + 1];
                                            int var206 = class99.field1931[var6 + 2];
                                            class2.field22.clear();
                                            class2.field22.set(11, 12);
                                            class2.field22.set(var206, var205, var204);
                                            class99.field1931[var6++] = (int) (class2.field22.getTime().getTime() / 86400000L) - 11745;
                                            continue;
                                        }
                                        if (var451 == 6303) {
                                            class2.field22.clear();
                                            class2.field22.setTime(new Date(class3.method13(17161)));
                                            class99.field1931[var6++] = class2.field22.get(1);
                                            continue;
                                        }
                                        if (var451 == 6304) {
                                            var6--;
                                            int var207 = class99.field1931[var6];
                                            boolean var208 = true;
                                            if (var207 < 0) {
                                                var208 = ((var207 + 1) % 4) == 0;
                                            } else if (var207 < 1582) {
                                                var208 = (var207 % 4) == 0;
                                            } else if (var207 % 4 != 0) {
                                                var208 = false;
                                            } else if ((var207 % 100) != 0) {
                                                var208 = true;
                                            } else if (var207 % 400 != 0) {
                                                var208 = false;
                                            }
                                            class99.field1931[var6++] = var208 ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var451 < 6500) {
                                        if (var451 == 6400) {
                                            class99.field1931[var6++] = class2.field27 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6401) {
                                            var6--;
                                            int var201 = class99.field1931[var6];
                                            var11--;
                                            class66 var202 = class151.field2709[var11];
                                            String var203;
                                            try {
                                                var203 = new String(var202.method445((byte) -81), "ISO-8859-1");
                                            } catch (UnsupportedEncodingException var448) {
                                                var203 = new String(var202.method445((byte) -112));
                                            }
                                            if (class2.field27) {
                                                if (!browsercontrol.iscreated()) {
                                                    browsercontrol.create("about:blank");
                                                }
                                                if (browsercontrol.iscreated()) {
                                                    browsercontrol.navigate(var203);
                                                    class181.field3166 = var201;
                                                    class48.method341(0, -103);
                                                }
                                            }
                                            continue;
                                        }
                                        if (var451 == 6402) {
                                            if (browsercontrol.iscreated()) {
                                                browsercontrol.navigate("about:blank");
                                                browsercontrol.hide();
                                                class181.field3166 = 0;
                                                class48.method341(0, -116);
                                            }
                                            continue;
                                        }
                                        if (var451 == 6403) {
                                            class151.field2709[var11++] = class40.field653;
                                            continue;
                                        }
                                        if (var451 == 6404) {
                                            class151.field2709[var11++] = class50.field888;
                                            continue;
                                        }
                                        if (var451 == 6405) {
                                            class99.field1931[var6++] = class100.method686(0) ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 6406) {
                                            class99.field1931[var6++] = class64.method437(-15855) ? 1 : 0;
                                            continue;
                                        }
                                    }
                                } else if (var451 == 5306) {
                                    class99.field1931[var6++] = class25.method109((byte) 97);
                                    continue;
                                }
                            } else if (var451 == 4500) {
                                var6 -= 2;
                                int var278 = class99.field1931[var6];
                                int var279 = class99.field1931[var6 + 1];
                                class30 var280 = class19.method77(var279, 19482);
                                if (var280.method172(115)) {
                                    class151.field2709[var11++] = method297(var278, (byte) -9).method1226(-1, var280.field444, var279);
                                } else {
                                    class99.field1931[var6++] = method297(var278, (byte) -68).method1227(var280.field445, class109.method741(arg1, 8965), var279);
                                }
                                continue;
                            }
                        } else if (var451 == 4400) {
                            var6 -= 2;
                            int var281 = class99.field1931[var6 + 1];
                            int var282 = class99.field1931[var6];
                            class30 var283 = class19.method77(var281, 19482);
                            if (var283.method172(arg1 - 9)) {
                                class151.field2709[var11++] = class52.method359(84, var282).method1510(256, var283.field444, var281);
                            } else {
                                class99.field1931[var6++] = class52.method359(85, var282).method1508((byte) -125, var283.field445, var281);
                            }
                            continue;
                        }
                    } else if (var451 == 4300) {
                        var6 -= 2;
                        int var284 = class99.field1931[var6];
                        int var285 = class99.field1931[var6 + 1];
                        class30 var286 = class19.method77(var285, 19482);
                        if (var286.method172(115)) {
                            class151.field2709[var11++] = class96.method665(var284, -97).method1332(0, var286.field444, var285);
                        } else {
                            class99.field1931[var6++] = class96.method665(var284, arg1 - 117).method1334(var285, var286.field445, class109.method741(arg1, -17));
                        }
                        continue;
                    }
                } else {
                    class63 var418;
                    if (var451 < 2000) {
                        var418 = var46 ? class245.field4275 : class173.field3048;
                    } else {
                        var6--;
                        var418 = class54.method367(class99.field1931[var6], (byte) -80);
                        var451 -= 1000;
                    }
                    if (var451 == 1300) {
                        var6--;
                        int var419 = class99.field1931[var6] - 1;
                        if (var419 >= 0 && var419 <= 9) {
                            var11--;
                            var418.method418(var419, class151.field2709[var11], 0);
                            continue;
                        }
                        var11--;
                        continue;
                    }
                    if (var451 == 1301) {
                        var6 -= 2;
                        int var420 = class99.field1931[var6];
                        int var421 = class99.field1931[var6 + 1];
                        var418.field1216 = class218.method1401(var420, false, var421);
                        continue;
                    }
                    if (var451 == 1302) {
                        var6--;
                        var418.field1089 = class99.field1931[var6] == 1;
                        continue;
                    }
                    if (var451 == 1303) {
                        var6--;
                        var418.field1193 = class99.field1931[var6];
                        continue;
                    }
                    if (var451 == 1304) {
                        var6--;
                        var418.field1232 = class99.field1931[var6];
                        continue;
                    }
                    if (var451 == 1305) {
                        var11--;
                        var418.field1213 = class151.field2709[var11];
                        continue;
                    }
                    if (var451 == 1306) {
                        var11--;
                        var418.field1207 = class151.field2709[var11];
                        continue;
                    }
                    if (var451 == 1307) {
                        var418.field1146 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var450) {
            if (var5.field1803 == null) {
                if (class81.field1585 != 0) {
                    class234.method1533(class199.field3425, -92, class26.field334, 0);
                }
                class181.method1205("CS2 - scr:" + var5.field1560 + " op:" + var9, var450, 38);
            } else {
                class66 var445 = class28.method136(-18982, 30);
                var445.method488(class139.field2572, 12147).method488(var5.field1803, arg1 ^ 0x2F0F);
                for (int var446 = class127.field2381 - 1; var446 >= 0; var446--) {
                    var445.method488(class159.field2864, 12147).method488(class12.field145[var446].field2756.field1803, 12147);
                }
                if (var9 == 40) {
                    int var447 = var8[var7];
                    var445.method488(class15.field186, 12147).method488(class144.method989(var447, 0), 12147);
                }
                if (class81.field1585 != 0) {
                    class234.method1533(class199.field3425, arg1 ^ 0xFFFFFFDE, class212.method1372(2, new class66[] { class78.field1550, var5.field1803 }), 0);
                }
                class181.method1205("CS2 - scr:" + var5.field1560 + " op:" + var9 + new String(var445.method445((byte) -79)), var450, 38);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZI)V")
    private final void method312(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field704[arg0] = arg2;
            field736++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    private final void method313(boolean arg0) {
        field723++;
        if (!arg0) {
            return;
        }
        int var2 = this.field769;
        int var3 = this.field764;
        long var4 = this.field765;
        while (this.field764 == var3) {
            while (this.field706.field2394[var2] == var3) {
                this.field706.method884(var2);
                int var6 = this.field706.method895(var2);
                if (var6 == 1) {
                    this.field706.method893();
                    this.field706.method894(var2);
                    if (this.field706.method897()) {
                        if (!this.field768 || var3 == 0) {
                            this.method314(15169);
                            this.field706.method889();
                            return;
                        }
                        this.field706.method896(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method289(-5420, var6);
                }
                this.field706.method891(var2);
                this.field706.method894(var2);
            }
            var2 = this.field706.method883();
            var3 = this.field706.field2394[var2];
            var4 = this.field706.method892(var3);
        }
        this.field765 = var4;
        this.field764 = var3;
        this.field769 = var2;
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
    private final void method314(int arg0) {
        this.method286(-1, -1);
        field714++;
        if (arg0 != 15169) {
            this.field735 = -6;
        }
        this.method303((byte) -65, -1);
        for (int var2 = 0; var2 < 16; var2++) {
            this.field751[var2] = this.field733[var2];
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field724[var3] = class115.method767(-128, this.field733[var3]);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIB)V")
    private final void method315(int arg0, int arg1, byte arg2) {
        if (arg2 >= 19) {
            field731++;
            this.field733[arg0] = arg1;
            this.field724[arg0] = class115.method767(-128, arg1);
            this.method293(arg1, arg0, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class43() {
        this.method314(15169);
    }
}
