import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3237 = 0;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Laf;")
    public static class7 field3244 = class48.method406(40, "swe");

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Laf;")
    public static class7 field3251 = class48.method406(40, "<col=80ff00>");

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "J")
    private long field3240;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "J")
    private long field3241;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
    public boolean field3246;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[I")
    private int[] field3250;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "[I")
    private int[] field3253;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILcd;)V")
    public static final void method1111(int arg0, class19 arg1) {
        arg1.field502 = arg1.field460;
        field3233++;
        if (arg1.field455 == 0) {
            arg1.field441 = 0;
            return;
        }
        if (arg1.field478 != -1 && arg1.field457 == 0) {
            class93 var2 = class87.method710(arg1.field478, arg0 + 6491);
            if (arg1.field471 > 0 && var2.field2150 == 0) {
                arg1.field441++;
                return;
            }
            if (arg1.field471 <= 0 && var2.field2157 == 0) {
                arg1.field441++;
                return;
            }
        }
        int var3 = arg1.field491;
        int var4 = arg1.field493[arg1.field455 - 1] * 128 + arg1.field473 * 64;
        int var5 = arg1.field509[arg1.field455 - 1] * 128 + arg1.field473 * 64;
        int var6 = arg1.field505;
        if (var4 - var6 > 256 || var4 - var6 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg1.field505 = var4;
            arg1.field491 = var5;
            return;
        }
        if (var4 > var6) {
            if (var3 < var5) {
                arg1.field492 = 1280;
            } else if (var3 <= var5) {
                arg1.field492 = 1536;
            } else {
                arg1.field492 = 1792;
            }
        } else if (var6 <= var4) {
            if (var3 < var5) {
                arg1.field492 = 1024;
            } else if (var3 > var5) {
                arg1.field492 = 0;
            }
        } else if (var5 > var3) {
            arg1.field492 = 768;
        } else if (var5 < var3) {
            arg1.field492 = 256;
        } else {
            arg1.field492 = 512;
        }
        int var7 = arg1.field490;
        boolean var8 = true;
        int var9 = 4;
        int var10 = arg1.field492 - arg1.field485 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var7 = arg1.field454;
        } else if (var10 >= 256 && var10 < 768) {
            var7 = arg1.field447;
        } else if (var10 >= -768 && var10 <= -256) {
            var7 = arg1.field465;
        }
        if (~var7 == arg0) {
            var7 = arg1.field454;
        }
        arg1.field502 = var7;
        if (arg1 instanceof class141) {
            var8 = ((class141) arg1).field3323.field2218;
        }
        if (var8) {
            if (arg1.field492 != arg1.field485 && arg1.field445 == -1 && arg1.field466 != 0) {
                var9 = 2;
            }
            if (arg1.field455 > 2) {
                var9 = 6;
            }
            if (arg1.field455 > 3) {
                var9 = 8;
            }
            if (arg1.field441 > 0 && arg1.field455 > 1) {
                var9 = 8;
                arg1.field441--;
            }
        } else {
            if (arg1.field455 > 1) {
                var9 = 6;
            }
            if (arg1.field455 > 2) {
                var9 = 8;
            }
            if (arg1.field441 > 0 && arg1.field455 > 1) {
                arg1.field441--;
                var9 = 8;
            }
        }
        if (arg1.field462[arg1.field455 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field502 == arg1.field454 && arg1.field442 != -1) {
            arg1.field502 = arg1.field442;
        }
        if (var3 < var5) {
            arg1.field491 += var9;
            if (var5 < arg1.field491) {
                arg1.field491 = var5;
            }
        } else if (var5 < var3) {
            arg1.field491 -= var9;
            if (var5 > arg1.field491) {
                arg1.field491 = var5;
            }
        }
        if (var4 > var6) {
            arg1.field505 += var9;
            if (arg1.field505 > var4) {
                arg1.field505 = var4;
            }
        } else if (var4 < var6) {
            arg1.field505 -= var9;
            if (var4 > arg1.field505) {
                arg1.field505 = var4;
            }
        }
        if (arg1.field505 == var4 && arg1.field491 == var5) {
            if (arg1.field471 > 0) {
                arg1.field471--;
            }
            arg1.field455--;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILoc;IILjava/awt/Component;)Lkc;")
    public static final class72 method1112(int arg0, class100 arg1, int arg2, int arg3, Component arg4) {
        field3243++;
        if (class48.field1164 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class72 var5 = (class72) Class.forName("mb").getDeclaredConstructor().newInstance();
                var5.field1629 = arg2;
                var5.field1610 = new int[(class78.field1824 ? 2 : 1) * 256];
                var5.method165(arg4);
                var5.field1621 = (arg2 & -1024) + 1024;
                if (var5.field1621 > 16384) {
                    var5.field1621 = 16384;
                }
                int var6 = -128 % ((arg3 + 38) / 57);
                var5.method160(var5.field1621);
                if (class89.field2082 > 0 && class73.field1636 == null) {
                    class73.field1636 = new class80();
                    class73.field1636.field1859 = arg1;
                    arg1.method823((byte) -95, class89.field2082, class73.field1636);
                }
                if (class73.field1636 != null) {
                    if (class73.field1636.field1853[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class73.field1636.field1853[arg0] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class16 var7 = new class16(arg1, arg0);
                    var7.field1629 = arg2;
                    var7.field1610 = new int[(class78.field1824 ? 2 : 1) * 256];
                    var7.method165(arg4);
                    var7.field1621 = 16384;
                    var7.method160(var7.field1621);
                    if (class89.field2082 > 0 && class73.field1636 == null) {
                        class73.field1636 = new class80();
                        class73.field1636.field1859 = arg1;
                        arg1.method823((byte) -118, class89.field2082, class73.field1636);
                    }
                    if (class73.field1636 != null) {
                        if (class73.field1636.field1853[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class73.field1636.field1853[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class72();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
    public final int method1113(int arg0) {
        int var2 = 77 % (-arg0 / 63);
        field3239++;
        return this.field3234 == -1 ? (this.field3250[8] << 10) + (this.field3253[4] << 20) + (this.field3250[0] << 15) + (this.field3253[0] << 25) + (this.field3250[11] << 5) + this.field3250[1] : 305419896 - -class135.method1101(this.field3234, 3215).field2239;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)V")
    public final void method1114(boolean arg0, int arg1) {
        field3238++;
        if (this.field3246 != arg0) {
            if (arg1 != 0) {
                this.field3234 = -20;
            }
            this.method1123(null, arg1 + 1, arg0, this.field3253, -1);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lc;")
    public final class15 method1115(byte arg0) {
        field3232++;
        if (this.field3234 != -1) {
            return class135.method1101(this.field3234, 3215).method780(arg0 - 127);
        }
        boolean var2 = false;
        if (arg0 != 40) {
            return null;
        }
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field3250[var3];
            if (var12 >= 256 && var12 < 512 && !class79.method672(false, var12 - 256).method806((byte) 87)) {
                var2 = true;
            }
            if (var12 >= 512 && !class64.method526(false, var12 - 512).method1097(0, this.field3246)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        int var4 = 0;
        class15[] var5 = new class15[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field3250[var6];
            if (var9 >= 256 && var9 < 512) {
                class15 var10 = class79.method672(false, var9 - 256).method808(arg0 ^ 0xFFFFFFB8);
                if (var10 != null) {
                    var5[var4++] = var10;
                }
            }
            if (var9 >= 512) {
                class15 var11 = class64.method526(false, var9 - 512).method1108(this.field3246, (byte) -113);
                if (var11 != null) {
                    var5[var4++] = var11;
                }
            }
        }
        class15 var7 = new class15(var5, var4);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field3253[var8] != 0) {
                var7.method142(class4.field58[var8][0], class4.field58[var8][this.field3253[var8]]);
                if (var8 == 1) {
                    var7.method142(class147.field3469[0], class147.field3469[this.field3253[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lrd;I)V")
    public final void method1116(class122 arg0, int arg1) {
        field3252++;
        arg0.method959(this.field3246 ? 1 : 0, (byte) -120);
        if (arg1 != -5801) {
            this.field3241 = -2L;
        }
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field3250[class123.field2930[var3]];
            if (var5 == 0) {
                arg0.method959(-1, (byte) -120);
            } else {
                arg0.method959(var5 - 256, (byte) -120);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method959(this.field3253[var4], (byte) -120);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    private final void method1117(boolean arg0) {
        field3235++;
        long var2 = this.field3241;
        if (arg0) {
            return;
        }
        int var4 = this.field3250[5];
        int var5 = this.field3250[9];
        this.field3250[5] = var5;
        this.field3250[9] = var4;
        this.field3241 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field3241 <<= 0x4;
            if (this.field3250[var6] >= 256) {
                this.field3241 += this.field3250[var6] - 256;
            }
        }
        if (this.field3250[0] >= 256) {
            this.field3241 += this.field3250[0] - 256 >> 4;
        }
        if (this.field3250[1] >= 256) {
            this.field3241 += this.field3250[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field3241 <<= 0x3;
            this.field3241 += this.field3253[var7];
        }
        this.field3250[9] = var5;
        this.field3241 <<= 0x1;
        this.field3241 += this.field3246 ? 1 : 0;
        this.field3250[5] = var4;
        if (var2 != 0L && this.field3241 != var2) {
            class74.field1724.method394(var2, 8000);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZII)V")
    public final void method1118(boolean arg0, int arg1, int arg2) {
        field3236++;
        if (arg1 != 0) {
            return;
        }
        int var4 = this.field3253[arg2];
        if (arg0) {
            var4++;
            if (class4.field58[arg2].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class4.field58[arg2].length - 1;
            }
        }
        this.field3253[arg2] = var4;
        this.method1117(false);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZI)V")
    public final void method1119(boolean arg0, boolean arg1, int arg2) {
        field3247++;
        if (arg2 == 1 && this.field3246) {
            return;
        }
        int var4 = this.field3250[class123.field2930[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class98 var5;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class127.field3050) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class127.field3050 - 1;
                }
            }
            var5 = class79.method672(arg1, var4);
        } while (var5 == null || var5.field2331 || arg2 + (this.field3246 ? 7 : 0) != var5.field2344);
        this.field3250[class123.field2930[arg2]] = var4 + 256;
        this.method1117(arg1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILnc;Lnc;)Leb;")
    public final class31 method1120(int arg0, int arg1, int arg2, class93 arg3, class93 arg4) {
        field3242++;
        if (this.field3234 != -1) {
            return class135.method1101(this.field3234, arg1 + 3208).method782(arg3, arg2, arg4, arg0, (byte) 40);
        }
        if (arg1 != 7) {
            this.method1114(true, -125);
        }
        int[] var6 = this.field3250;
        long var7 = this.field3241;
        if (arg4 != null && (arg4.field2151 >= 0 || arg4.field2168 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field3250[var9];
            }
            if (arg4.field2151 >= 0) {
                var7 += arg4.field2151 - this.field3250[5] << 8;
                var6[5] = arg4.field2151;
            }
            if (arg4.field2168 >= 0) {
                var7 += arg4.field2168 - this.field3250[3] << 16;
                var6[3] = arg4.field2168;
            }
        }
        class31 var10 = (class31) class74.field1724.method395(127, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class79.method672(false, var21 - 256).method804(false)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class64.method526(false, var21 - 512).method1102(95, this.field3246)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3240 != -1L) {
                    var10 = (class31) class74.field1724.method395(arg1 + 119, this.field3240);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class15[] var13 = new class15[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class15 var19 = class79.method672(false, var18 - 256).method807((byte) -69);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class15 var20 = class64.method526(false, var18 - 512).method1110(this.field3246, true);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class15 var16 = new class15(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field3253[var17] != 0) {
                        var16.method142(class4.field58[var17][0], class4.field58[var17][this.field3253[var17]]);
                        if (var17 == 1) {
                            var16.method142(class147.field3469[0], class147.field3469[this.field3253[var17]]);
                        }
                    }
                }
                var10 = var16.method151(64, 850, -30, -50, -30);
                class74.field1724.method388(var10, var7, arg1 ^ 0x7F8);
                this.field3240 = var7;
            }
        }
        if (arg4 == null && arg3 == null) {
            return var10;
        }
        class31 var22;
        if (arg4 != null && arg3 != null) {
            var22 = arg4.method750(arg3, var10, -120, arg0, arg2);
        } else if (arg4 == null) {
            var22 = arg3.method746(16278, var10, arg0);
        } else {
            var22 = arg4.method746(arg1 + 16271, var10, arg2);
        }
        return var22;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static final void method1121(int arg0) {
        class141.method1151(15569, class81.field1865);
        field3245++;
        class79.field1833++;
        if (class86.field2004 && class106.field2607) {
            int var1 = class113.field2709;
            int var2 = class111.field2681;
            int var3 = var2 - class47.field1154;
            if (var3 < class127.field3061) {
                var3 = class127.field3061;
            }
            if (var3 + class81.field1865.field2517 > class127.field3061 + class73.field1695.field2517) {
                var3 = class127.field3061 + class73.field1695.field2517 - class81.field1865.field2517;
            }
            int var4 = class81.field1865.field2455;
            int var5 = var1 - class43.field1028;
            int var6 = var3 - class82.field1903;
            if (var5 < class39.field965) {
                var5 = class39.field965;
            }
            int var7 = var3 + class73.field1695.field2486 - class127.field3061;
            if (class39.field965 + class73.field1695.field2550 < class81.field1865.field2550 + var5) {
                var5 = class73.field1695.field2550 + class39.field965 - class81.field1865.field2550;
            }
            int var8 = var5 + class73.field1695.field2437 - class39.field965;
            int var9 = var5 - class21.field532;
            if (class81.field1865.field2552 < class79.field1833 && (var9 > var4 || -var4 > var9 || var6 > var4 || -var4 > var6)) {
                class130.field3093 = true;
            }
            if (arg0 != 29714) {
                field3244 = null;
            }
            if (class81.field1865.field2530 != null && class130.field3093) {
                class39 var10 = new class39();
                var10.field962 = class81.field1865.field2530;
                var10.field967 = class81.field1865;
                var10.field964 = var7;
                var10.field972 = var8;
                class80.method675(-2001, var10);
            }
            if (class97.field2311 == 0) {
                if (class130.field3093) {
                    if (class81.field1865.field2448 != null) {
                        class39 var11 = new class39();
                        var11.field963 = class4.field41;
                        var11.field972 = var8;
                        var11.field964 = var7;
                        var11.field967 = class81.field1865;
                        var11.field962 = class81.field1865.field2448;
                        class80.method675(arg0 ^ 0xFFFF8C3D, var11);
                    }
                    if (class4.field41 != null && class23.method224(class81.field1865, -1413) != null) {
                        class47.field1150.method1131(129, 2027385224);
                        class47.field1150.method939(466050456, class4.field41.field2445);
                        class47.field1150.method970((byte) -96, class4.field41.field2442);
                        class47.field1150.method937(class81.field1865.field2442, arg0 + 675568190);
                        class47.field1150.method933((byte) 67, class81.field1865.field2445);
                        class149.field3505++;
                    }
                } else if ((class86.field2015 == 1 || class93.method749(class19.field449 - 1, (byte) 1)) && class19.field449 > 2) {
                    class93.method748((byte) 125);
                } else if (class19.field449 > 0) {
                    class98.method805(class19.field449 - 1, true);
                }
                class81.field1865 = null;
            }
        } else if (class79.field1833 > 1) {
            class81.field1865 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
    public static void method1122(boolean arg0) {
        field3244 = null;
        field3251 = null;
        if (arg0) {
            field3254 = 7;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IIZ[II)V")
    public final void method1123(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4) {
        field3255++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class127.field3050; var7++) {
                    class98 var8 = class79.method672(false, var7);
                    if (var8 != null && !var8.field2331 && var8.field2344 == var6 + (arg2 ? 7 : 0)) {
                        arg0[class123.field2930[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field3253 = arg3;
        if (arg1 == 1) {
            this.field3234 = arg4;
            this.field3246 = arg2;
            this.field3250 = arg0;
            this.method1117(false);
        }
    }
}
