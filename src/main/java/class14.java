import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Lcd;")
    public static class19 field370 = new class19();

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lpe;")
    public static class109 field373 = class141.method1120("sl_back", 0);

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field374 = 0;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lpe;")
    public static class109 field379 = class141.method1120("Bitte laden Sie die Seite neu)3", 0);

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
    public static int[] field375 = new int[25];

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Z")
    public static boolean field380 = false;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "J")
    private long field358;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "J")
    private long field372;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Ljb;")
    public static class64 field357;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lna;")
    public static class91 field376;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
    public static int[] field352;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    private int[] field353;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "[I")
    private int[] field363;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "[I")
    public static int[] field377;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILae;Lae;B)Lwb;")
    public final class155 method160(int arg0, int arg1, class6 arg2, class6 arg3, byte arg4) {
        field369++;
        if (this.field359 != -1) {
            return class138.method1095(this.field359, false).method935(arg1, arg3, (byte) 6, arg2, arg0);
        }
        long var6 = this.field372;
        int[] var8 = this.field353;
        if (arg4 > -31) {
            method165(78, true);
        }
        if (arg3 != null && (arg3.field158 >= 0 || arg3.field159 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field353[var9];
            }
            if (arg3.field158 >= 0) {
                var6 += arg3.field158 - this.field353[5] << 8;
                var8[5] = arg3.field158;
            }
            if (arg3.field159 >= 0) {
                var6 += arg3.field159 - this.field353[3] << 16;
                var8[3] = arg3.field159;
            }
        }
        class155 var10 = (class155) class124.field2737.method93((byte) 103, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class6.method58((byte) 50, var21 - 256).method812((byte) 31)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class4.method43((byte) 94, var21 - 512).method930(this.field378, -28528)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field358 != -1L) {
                    var10 = (class155) class124.field2737.method93((byte) 103, this.field358);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class33[] var13 = new class33[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class33 var19 = class6.method58((byte) 90, var18 - 256).method813(-20534);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class33 var20 = class4.method43((byte) 94, var18 - 512).method931(this.field378, 95);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class33 var16 = new class33(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field363[var17] < class128.field2839[var17].length) {
                        var16.method336(class52.field1083[var17], class128.field2839[var17][this.field363[var17]]);
                    }
                    if (class156.field3588[var17].length > this.field363[var17]) {
                        var16.method336(class61.field1231[var17], class156.field3588[var17][this.field363[var17]]);
                    }
                }
                var10 = var16.method334(64, 850, -30, -50, -30);
                class124.field2737.method97(var6, (byte) -99, var10);
                this.field358 = var6;
            }
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class155 var22;
        if (arg3 != null && arg2 != null) {
            var22 = arg3.method55(arg2, -2711, arg0, arg1, var10);
        } else if (arg3 == null) {
            var22 = arg2.method57(arg1, (byte) 68, var10);
        } else {
            var22 = arg3.method57(arg0, (byte) 68, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Led;")
    public final class33 method161(int arg0) {
        field356++;
        if (this.field359 != -1) {
            return class138.method1095(this.field359, false).method936((byte) -2);
        }
        boolean var2 = false;
        int var3 = 0;
        if (arg0 < 21) {
            field376 = null;
        }
        while (var3 < 12) {
            int var12 = this.field353[var3];
            if (var12 >= 256 && var12 < 512 && !class6.method58((byte) 46, var12 - 256).method811((byte) 99)) {
                var2 = true;
            }
            if (var12 >= 512 && !class4.method43((byte) 94, var12 - 512).method927(this.field378, (byte) 34)) {
                var2 = true;
            }
            var3++;
        }
        if (var2) {
            return null;
        }
        class33[] var4 = new class33[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field353[var6];
            if (var9 >= 256 && var9 < 512) {
                class33 var10 = class6.method58((byte) 79, var9 - 256).method809(78);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class33 var11 = class4.method43((byte) 94, var9 - 512).method926(this.field378, 0);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class33 var7 = new class33(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (class128.field2839[var8].length > this.field363[var8]) {
                var7.method336(class52.field1083[var8], class128.field2839[var8][this.field363[var8]]);
            }
            if (this.field363[var8] < class156.field3588[var8].length) {
                var7.method336(class61.field1231[var8], class156.field3588[var8][this.field363[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)V")
    public final void method162(byte arg0, boolean arg1) {
        field361++;
        if (arg0 >= 4 && arg1 != this.field378) {
            this.method164(this.field363, (byte) 87, -1, null, arg1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lbe;I)V")
    public final void method163(class13 arg0, int arg1) {
        arg0.method135(this.field378 ? 1 : 0, (byte) -50);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field353[class2.field31[var3]];
            if (var5 == 0) {
                arg0.method135(-1, (byte) -50);
            } else {
                arg0.method135(var5 - 256, (byte) -50);
            }
        }
        if (arg1 >= -31) {
            field380 = false;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method135(this.field363[var4], (byte) -50);
        }
        field354++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([IBI[IZ)V")
    public final void method164(int[] arg0, byte arg1, int arg2, int[] arg3, boolean arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class120.field2670; var7++) {
                    class101 var8 = class6.method58((byte) 91, var7);
                    if (var8 != null && !var8.field2125 && (arg4 ? 7 : 0) + var6 == var8.field2131) {
                        arg3[class2.field31[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field378 = arg4;
        this.field363 = arg0;
        int var9 = 54 / ((arg1 - 38) / 42);
        field362++;
        this.field353 = arg3;
        this.field359 = arg2;
        this.method170((byte) -10);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
    public static final void method165(int arg0, boolean arg1) {
        field366++;
        if (arg1) {
            field377 = null;
        }
        if (arg0 == -1 || !class113.method941(arg0, (byte) -44)) {
            return;
        }
        class154[] var2 = class114.field2525[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class154 var4 = var2[var3];
            if (var4.field3430 != null) {
                class93 var5 = new class93();
                var5.field2014 = var4;
                var5.field2001 = var4.field3430;
                class123.method1003(var5, (byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZ)V")
    public final void method166(int arg0, int arg1, boolean arg2) {
        field364++;
        int var4 = this.field363[arg1];
        if (arg2) {
            var4++;
            if (var4 >= class128.field2839[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class128.field2839[arg1].length - 1;
            }
        }
        this.field363[arg1] = var4;
        if (arg0 != 3058) {
            field380 = false;
        }
        this.method170((byte) -18);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
    public final void method167(boolean arg0, int arg1, int arg2) {
        field365++;
        if (arg2 == 1 && this.field378) {
            return;
        }
        int var4 = this.field353[class2.field31[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class101 var5;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class120.field2670) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class120.field2670 - 1;
                }
            }
            var5 = class6.method58((byte) 113, var4);
        } while (var5 == null || var5.field2125 || (this.field378 ? 7 : 0) + arg2 != var5.field2131);
        this.field353[class2.field31[arg2]] = var4 + 256;
        if (arg1 <= 35) {
            field376 = null;
        }
        this.method170((byte) 119);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field355++;
        class140.method1110(arg3, arg2, arg3 + arg4, arg0 + arg2);
        class105.method847();
        class93.field2000++;
        class72.method579(true, 0);
        class9.method85(-16150, true);
        class72.method579(false, 0);
        class9.method85(-16150, false);
        class67.method518(false);
        class110.method913((byte) -36);
        if (!class47.field984) {
            int var5 = class55.field1120;
            if (class46.field971 / 256 > var5) {
                var5 = class46.field971 / 256;
            }
            int var6 = class15.field388 + class100.field2104 & 0x7FF;
            if (class18.field446[4] && var5 < class116.field2576[4] + 128) {
                var5 = class116.field2576[4] + 128;
            }
            class24.method228((byte) 76, var6, var5, class157.field3636, class126.method1019(class136.field2975.field3106, class136.field2975.field3094, arg1 + 257, class75.field1513) - 50, class50.field1027, var5 * 3 + 600);
        }
        int var7;
        if (class47.field984) {
            var7 = class6.method66(1912164071);
        } else {
            var7 = class147.method1146(19203);
        }
        if (arg1 != -256) {
            return;
        }
        int var8 = class102.field2149;
        int var9 = class85.field1795;
        int var10 = class154.field3518;
        int var11 = class116.field2591;
        int var12 = class57.field1158;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class18.field446[var13]) {
                int var16 = (int) (Math.random() * (double) (class87.field1850[var13] * 2 + 1) + Math.sin((double) class89.field1891[var13] / 100.0D * (double) class35.field789[var13]) * (double) class116.field2576[var13] - (double) class87.field1850[var13]);
                if (var13 == 1) {
                    class102.field2149 += var16;
                }
                if (var13 == 3) {
                    class57.field1158 = class57.field1158 + var16 & 0x7FF;
                }
                if (var13 == 4) {
                    class116.field2591 += var16;
                    if (class116.field2591 < 128) {
                        class116.field2591 = 128;
                    }
                    if (class116.field2591 > 383) {
                        class116.field2591 = 383;
                    }
                }
                if (var13 == 0) {
                    class85.field1795 += var16;
                }
                if (var13 == 2) {
                    class154.field3518 += var16;
                }
            }
        }
        int var14 = class82.field1754;
        int var15 = class48.field992;
        if (var14 >= arg3 && arg3 + arg4 > var14 && arg2 <= var15 && var15 < arg0 + arg2) {
            class155.field3568 = true;
            class155.field3563 = class48.field992 - arg2;
            class155.field3565 = 0;
            class155.field3570 = class82.field1754 - arg3;
        } else {
            class155.field3568 = false;
            class155.field3565 = 0;
        }
        class147.method1148(false);
        class140.method1118(arg3, arg2, arg4, arg0, 0);
        class147.method1148(false);
        class147.field3201.method671(class85.field1795, class102.field2149, class154.field3518, class116.field2591, class57.field1158, var7);
        class147.method1148(false);
        class147.field3201.method694();
        class118.method968(arg4, arg2, arg0, arg3, 112);
        class1.method11(arg3, arg2, 32765);
        ((class1) class105.field2217).method4((byte) -127, class139.field3042);
        class157.method1227(255, arg2, arg0, arg3, arg4);
        class102.field2149 = var8;
        class57.field1158 = var12;
        class85.field1795 = var9;
        class116.field2591 = var11;
        class154.field3518 = var10;
        if (class4.field93 && class3.method21((byte) 38, true, false) == 0) {
            class4.field93 = false;
        }
        if (class4.field93) {
            class140.method1118(arg3, arg2, arg4, arg0, 0);
            class23.method216(class46.field967, false, (byte) -35);
        }
        if (!class4.field93 && !class3.field64 && var14 >= arg3 && var14 < arg3 + arg4 && var15 >= arg2 && arg0 + arg2 > var15) {
            class136.method1083(var14, arg2, -96, var15, arg3);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method169(byte arg0) {
        field375 = null;
        int var1 = 10 % ((arg0 - 75) / 45);
        field379 = null;
        field370 = null;
        field376 = null;
        field377 = null;
        field373 = null;
        field352 = null;
        field357 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    private final void method170(byte arg0) {
        field367++;
        long var2 = this.field372;
        int var4 = this.field353[5];
        this.field372 = 0L;
        int var5 = this.field353[9];
        int var6 = 74 % ((arg0 - 73) / 45);
        this.field353[5] = var5;
        this.field353[9] = var4;
        for (int var7 = 0; var7 < 12; var7++) {
            this.field372 <<= 0x4;
            if (this.field353[var7] >= 256) {
                this.field372 += this.field353[var7] - 256;
            }
        }
        if (this.field353[0] >= 256) {
            this.field372 += this.field353[0] - 256 >> 4;
        }
        if (this.field353[1] >= 256) {
            this.field372 += this.field353[1] - 256 >> 8;
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field372 <<= 0x3;
            this.field372 += this.field363[var8];
        }
        this.field372 <<= 0x1;
        this.field372 += this.field378 ? 1 : 0;
        this.field353[9] = var5;
        this.field353[5] = var4;
        if (var2 != 0L && this.field372 != var2) {
            class124.field2737.method98(var2, -16850);
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)I")
    public final int method171(byte arg0) {
        if (arg0 <= 63) {
            field379 = null;
        }
        field351++;
        return this.field359 == -1 ? (this.field363[0] << 25) + ((this.field353[8] << 10) + (this.field363[4] << 20) + (this.field353[0] << 15) - (-(this.field353[11] << 5) - this.field353[1])) : class138.method1095(this.field359, false).field2463 + 305419896;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public static final void method172(byte arg0) {
        if (arg0 != 55) {
            return;
        }
        field368++;
        while (class82.field1733.method533(class109.field2286, arg0 - 24) >= 11) {
            int var1 = class82.field1733.method526((byte) 127, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class104.field2194[var1] == null) {
                class104.field2194[var1] = new class50();
                var2 = true;
                if (class53.field1094[var1] != null) {
                    class104.field2194[var1].method429((byte) 67, class53.field1094[var1]);
                }
            }
            class92.field1973[class44.field927++] = var1;
            class50 var3 = class104.field2194[var1];
            var3.field3119 = class12.field264;
            int var4 = class82.field1733.method526((byte) 127, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class82.field1733.method526((byte) 127, 1);
            int var6 = class41.field856[class82.field1733.method526((byte) 127, 3)];
            if (var2) {
                var3.field3111 = var3.field3114 = var6;
            }
            int var7 = class82.field1733.method526((byte) 127, 1);
            if (var7 == 1) {
                class84.field1784[class42.field869++] = var1;
            }
            int var8 = class82.field1733.method526((byte) 127, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1125(var5 == 1, class136.field2975.field3120[0] + var8, 4683, class136.field2975.field3121[0] + var4);
        }
        class82.field1733.method536((byte) 63);
    }
}
