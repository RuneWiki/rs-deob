import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lod;")
    public static class101 field1775 = class46.method335(120, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[Ltf;")
    public static class138[] field1774 = new class138[2048];

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lod;")
    public static class101 field1798 = class46.method335(-84, ":chalreq:");

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "[I")
    public static int[] field1800 = new int[32];

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "Lod;")
    public static class101 field1803;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    private int field1792;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "J")
    private long field1780;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "J")
    private long field1799;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lbe;")
    public static class13 field1778;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lc;")
    public static class15 field1787;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Z")
    public boolean field1802;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    private int[] field1777;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
    private int[] field1783;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lod;")
    public static final class101 method592(boolean arg0, int arg1) {
        field1776++;
        if (arg0) {
            field1781 = -58;
        }
        return class126.method966(10, -2, arg1, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLtf;)V")
    public final void method593(byte arg0, class138 arg1) {
        arg1.method1101(this.field1802 ? 1 : 0, (byte) -32);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1777[class2.field34[var3]];
            if (var5 == 0) {
                arg1.method1101(-1, (byte) -32);
            } else {
                arg1.method1101(var5 - 256, (byte) -32);
            }
        }
        field1801++;
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method1101(this.field1783[var4], (byte) -32);
        }
        if (arg0 < 67) {
            field1778 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method594(byte arg0) {
        field1775 = null;
        field1774 = null;
        field1803 = null;
        field1798 = null;
        if (arg0 == -56) {
            field1787 = null;
            field1778 = null;
            field1800 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public final int method595(int arg0) {
        field1796++;
        int var2 = -124 / ((arg0 - 76) / 42);
        return this.field1792 == -1 ? (this.field1783[4] << 20) + (this.field1777[8] << 10) + (this.field1783[0] << 25) + (this.field1777[0] << 15) + (this.field1777[11] << 5) + this.field1777[1] : class134.method1033(this.field1792, 9).field2521 + 305419896;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method596(boolean arg0, Component arg1) {
        if (arg0) {
            return;
        }
        field1795++;
        Method var2 = class151.field3449;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class132.field3005);
        arg1.addFocusListener(class132.field3005);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBI)V")
    public static final void method597(int arg0, int arg1, byte arg2, int arg3) {
        field1789++;
        if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
            class121.field2678 = -1;
            class150.field3437 = -1;
            return;
        }
        int var4 = class65.method449(arg1, arg3, class95.field2040, true) - arg0;
        int var5 = 115 / ((-arg2 - 35) / 52);
        int var6 = arg3 - class120.field2637;
        int var7 = class124.field2709[class132.field3033];
        int var8 = class124.field2717[class26.field677];
        int var9 = var4 - class26.field692;
        int var10 = class124.field2709[class26.field677];
        int var11 = class124.field2717[class132.field3033];
        int var12 = arg1 - class133.field3048;
        int var13 = var6 * var11 + var7 * var12 >> 16;
        int var14 = var11 * var12 - var6 * var7 >> 16;
        int var16 = var8 * var9 - var10 * var14 >> 16;
        int var17 = var9 * var10 + var8 * var14 >> 16;
        if (var17 < 50) {
            class121.field2678 = -1;
            class150.field3437 = -1;
        } else {
            class121.field2678 = (var13 << 9) / var17 + 256;
            class150.field3437 = (var16 << 9) / var17 + 167;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([I[IIIZ)V")
    public final void method598(int[] arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        field1786++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class79.field1655; var7++) {
                    class40 var8 = class11.method59(var7, arg3 + 30646);
                    if (var8 != null && !var8.field956 && var8.field951 == (arg4 ? 7 : 0) + var6) {
                        arg0[class2.field34[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1802 = arg4;
        this.field1783 = arg1;
        if (arg3 != -30739) {
            method605(76, null, null, null, null);
        }
        this.field1792 = arg2;
        this.field1777 = arg0;
        this.method599(arg3 - 668709827);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    private final void method599(int arg0) {
        field1797++;
        int var2 = this.field1777[5];
        long var3 = this.field1780;
        int var5 = this.field1777[9];
        this.field1777[5] = var5;
        this.field1780 = 0L;
        this.field1777[9] = var2;
        if (arg0 != -668740566) {
            method596(false, null);
        }
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1780 <<= 0x4;
            if (this.field1777[var6] >= 256) {
                this.field1780 += this.field1777[var6] - 256;
            }
        }
        if (this.field1777[0] >= 256) {
            this.field1780 += this.field1777[0] - 256 >> 4;
        }
        if (this.field1777[1] >= 256) {
            this.field1780 += this.field1777[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1780 <<= 0x3;
            this.field1780 += this.field1783[var7];
        }
        this.field1777[9] = var5;
        this.field1777[5] = var2;
        this.field1780 <<= 0x1;
        this.field1780 += this.field1802 ? 1 : 0;
        if (var3 != 0L && this.field1780 != var3) {
            class93.field2002.method138((byte) 125, var3);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(ZI)V")
    public final void method600(boolean arg0, int arg1) {
        field1788++;
        if (this.field1802 != arg0) {
            this.method598(null, this.field1783, arg1, arg1 ^ 0x7812, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZZ)V")
    public final void method601(int arg0, boolean arg1, boolean arg2) {
        field1791++;
        if (arg0 == 1 && this.field1802) {
            return;
        }
        int var4 = this.field1777[class2.field34[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class40 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class79.field1655) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class79.field1655 - 1;
                }
            }
            var5 = class11.method59(var4, -119);
        } while (var5 == null || var5.field956 || arg0 + (this.field1802 ? 7 : 0) != var5.field951);
        if (arg2) {
            this.field1777[class2.field34[arg0]] = var4 + 256;
            this.method599(-668740566);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIZ)V")
    public final void method602(boolean arg0, int arg1, boolean arg2) {
        field1779++;
        int var4 = this.field1783[arg1];
        if (arg0) {
            field1800 = null;
        }
        if (arg2) {
            var4++;
            if (var4 >= class133.field3049[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class133.field3049[arg1].length - 1;
            }
        }
        this.field1783[arg1] = var4;
        this.method599(-668740566);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Lpf;")
    public final class110 method603(int arg0) {
        field1782++;
        if (this.field1792 != -1) {
            return class134.method1033(this.field1792, 9).method873(0);
        }
        if (arg0 <= 31) {
            method592(true, -90);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1777[var3];
            if (var12 >= 256 && var12 < 512 && !class11.method59(var12 - 256, -123).method305(27291)) {
                var2 = true;
            }
            if (var12 >= 512 && !class137.method1045((byte) -99, var12 - 512).method1209((byte) 119, this.field1802)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        int var4 = 0;
        class110[] var5 = new class110[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1777[var6];
            if (var9 >= 256 && var9 < 512) {
                class110 var10 = class11.method59(var9 - 256, -91).method299((byte) -49);
                if (var10 != null) {
                    var5[var4++] = var10;
                }
            }
            if (var9 >= 512) {
                class110 var11 = class137.method1045((byte) -54, var9 - 512).method1202(this.field1802, 0);
                if (var11 != null) {
                    var5[var4++] = var11;
                }
            }
        }
        class110 var7 = new class110(var5, var4);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1783[var8] < class133.field3049[var8].length) {
                var7.method796(class10.field141[var8], class133.field3049[var8][this.field1783[var8]]);
            }
            if (class97.field2112[var8].length > this.field1783[var8]) {
                var7.method796(class46.field1075[var8], class97.field2112[var8][this.field1783[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lia;I)V")
    public static final void method604(class57 arg0, int arg1) {
        field1785++;
        int var2 = arg0.field1334 * 64 + arg0.field1290 * 128;
        int var3 = arg0.field1322 - class143.field3305;
        arg0.field1341 += (var2 - arg0.field1341) / var3;
        if (arg0.field1343 == 0) {
            arg0.field1307 = 1024;
        }
        int var4 = arg0.field1295 * 128 + arg0.field1334 * 64;
        if (arg0.field1343 == arg1) {
            arg0.field1307 = 1536;
        }
        if (arg0.field1343 == 2) {
            arg0.field1307 = 0;
        }
        if (arg0.field1343 == 3) {
            arg0.field1307 = 512;
        }
        arg0.field1276 = 0;
        arg0.field1298 += (var4 - arg0.field1298) / var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILc;Lod;Lc;Lod;)Lme;")
    public static final class88 method605(int arg0, class15 arg1, class101 arg2, class15 arg3, class101 arg4) {
        field1784++;
        int var5 = arg1.method110(arg0 + 828883249, arg2);
        if (arg0 != -828883249) {
            field1800 = null;
        }
        int var6 = arg1.method125(2, arg4, var5);
        return class92.method644(arg3, (byte) 42, var5, arg1, var6);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILne;BILne;)Lqb;")
    public final class113 method606(int arg0, class95 arg1, byte arg2, int arg3, class95 arg4) {
        field1794++;
        if (this.field1792 != -1) {
            return class134.method1033(this.field1792, arg2 + 31).method874(arg4, arg1, false, arg0, arg3);
        }
        long var6 = this.field1780;
        int[] var8 = this.field1777;
        if (arg2 != -22) {
            field1778 = null;
        }
        if (arg4 != null && (arg4.field2068 >= 0 || arg4.field2035 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1777[var9];
            }
            if (arg4.field2068 >= 0) {
                var6 += arg4.field2068 - this.field1777[5] << 8;
                var8[5] = arg4.field2068;
            }
            if (arg4.field2035 >= 0) {
                var6 += arg4.field2035 - this.field1777[3] << 16;
                var8[3] = arg4.field2035;
            }
        }
        class113 var10 = (class113) class93.field2002.method140(true, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class11.method59(var21 - 256, -99).method296(-25254)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class137.method1045((byte) -72, var21 - 512).method1200((byte) -69, this.field1802)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1799 != -1L) {
                    var10 = (class113) class93.field2002.method140(true, this.field1799);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class110[] var13 = new class110[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class110 var19 = class11.method59(var18 - 256, arg2 + -61).method297(true);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class110 var20 = class137.method1045((byte) -37, var18 - 512).method1204(this.field1802, -124);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class110 var16 = new class110(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class133.field3049[var17].length > this.field1783[var17]) {
                        var16.method796(class10.field141[var17], class133.field3049[var17][this.field1783[var17]]);
                    }
                    if (this.field1783[var17] < class97.field2112[var17].length) {
                        var16.method796(class46.field1075[var17], class97.field2112[var17][this.field1783[var17]]);
                    }
                }
                var10 = var16.method807(64, 850, -30, -50, -30);
                class93.field2002.method141(var10, var6, (byte) 3);
                this.field1799 = var6;
            }
        }
        if (arg4 == null && arg1 == null) {
            return var10;
        }
        class113 var22;
        if (arg4 != null && arg1 != null) {
            var22 = arg4.method662(arg0, arg1, 65535, arg3, var10);
        } else if (arg4 == null) {
            var22 = arg1.method659(arg3, 128, var10);
        } else {
            var22 = arg4.method659(arg0, arg2 + 150, var10);
        }
        return var22;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1800[var1] = var0 - 1;
            var0 += var0;
        }
        field1803 = class46.method335(102, "W-=hlen Sie eine Welt");
    }
}
