import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static volatile int field487 = -1;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
    public static int[] field497 = new int[1000];

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field495 = 0;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field503 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "J")
    private long field489;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "J")
    private long field507;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
    public boolean field493;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    private int[] field490;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[I")
    private int[] field510;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "[Lhc;")
    public static class45[] field506;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 4)
    public static final void method163(byte arg0) {
        class80.field2046 = null;
        class1.field27 = null;
        class93.field2360 = null;
        class67.field1681 = null;
        class93.field2357 = null;
        class4.field105 = null;
        field501++;
        class85.field2169 = null;
        class101.field2563 = null;
        class96.field2435 = null;
        int var1 = 16 % ((43 - arg0) / 35);
        class77.field1921 = null;
        class55.field1394 = null;
        class15.field301 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 27)
    public static void method164(boolean arg0) {
        field497 = null;
        field506 = null;
        if (arg0) {
            method164(false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lde;", line = 40)
    public final class24 method165(int arg0) {
        field491++;
        if (this.field508 != -1) {
            return class118.method913(this.field508, (byte) 12).method363((byte) 90);
        }
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != -513) {
            this.method173(126);
        }
        while (var3 < 12) {
            int var12 = this.field510[var3];
            if (var12 >= 256 && var12 < 512 && !class90.method728(var12 - 256, arg0 ^ 0xFFFFFDFC).method630((byte) 78)) {
                var2 = true;
            }
            if (var12 >= 512 && !class42.method358(0, var12 - 512).method657(this.field493, 0)) {
                var2 = true;
            }
            var3++;
        }
        if (var2) {
            return null;
        }
        class24[] var4 = new class24[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field510[var6];
            if (var9 >= 256 && var9 < 512) {
                class24 var10 = class90.method728(var9 - 256, 3).method619(true);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class24 var11 = class42.method358(arg0 + 513, var9 + -512).method659(this.field493, 1);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class24 var7 = new class24(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field490[var8] != 0) {
                var7.method192(class121.field2961[var8][0], class121.field2961[var8][this.field490[var8]]);
                if (var8 == 1) {
                    var7.method192(class48.field1198[0], class48.field1198[this.field490[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V", line = 145)
    public final void method166(boolean arg0, int arg1) {
        field509++;
        if (arg0 != this.field493) {
            this.method176(107, null, this.field490, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLqd;ILr;)V", line = 163)
    public static final void method167(byte arg0, class100 arg1, int arg2, class102 arg3) {
        field499++;
        class107 var4 = new class107();
        var4.field3057 = arg2;
        var4.field2718 = arg1;
        var4.field2729 = 1;
        var4.field2710 = arg3;
        class47 var5 = class128.field3082;
        synchronized (class128.field3082) {
            class128.field3082.method448(var4, true);
            if (arg0 < 122) {
                method174(false);
            }
        }
        class66.method583(600);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILwd;)V", line = 194)
    public final void method168(int arg0, class131 arg1) {
        arg1.method993(19579, this.field493 ? 1 : 0);
        if (arg0 < 69) {
            method163((byte) 41);
        }
        field511++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field510[class61.field1549[var3]];
            if (var5 == 0) {
                arg1.method993(19579, -1);
            } else {
                arg1.method993(19579, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method993(19579, this.field490[var4]);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZBI)V", line = 242)
    public final void method169(boolean arg0, byte arg1, int arg2) {
        field504++;
        int var4 = this.field490[arg2];
        if (arg1 >= -12) {
            this.field493 = true;
        }
        if (arg0) {
            var4++;
            if (class121.field2961[arg2].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class121.field2961[arg2].length - 1;
            }
        }
        this.field490[arg2] = var4;
        this.method173(22824);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIZ)V", line = 272)
    public final void method170(boolean arg0, int arg1, boolean arg2) {
        field502++;
        if (arg1 == 1 && this.field493) {
            return;
        }
        int var4 = this.field510[class61.field1549[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        if (arg0) {
            return;
        }
        class74 var5;
        do {
            if (arg2) {
                var4++;
                if (var4 >= class48.field1188) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class48.field1188 - 1;
                }
            }
            var5 = class90.method728(var4, 3);
        } while (var5 == null || var5.field1865 || var5.field1863 != (this.field493 ? 7 : 0) + arg1);
        this.field510[class61.field1549[arg1]] = var4 + 256;
        this.method173(22824);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)V", line = 321)
    public static final void method171(byte arg0, long arg1) {
        field496++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 <= 63) {
            field503 = 104;
        }
        for (int var3 = 0; var3 < class49.field1208; var3++) {
            if (class62.field1587[var3] == arg1) {
                class72.field1797++;
                class88.field2251 = true;
                class49.field1208--;
                for (int var4 = var3; var4 < class49.field1208; var4++) {
                    class52.field1300[var4] = class52.field1300[var4 + 1];
                    class25.field600[var4] = class25.field600[var4 + 1];
                    class62.field1587[var4] = class62.field1587[var4 + 1];
                }
                class92.field2333.method702(true, 158);
                class92.field2333.method1018(arg1, -5952);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lua;IBILua;)Lde;", line = 364)
    public final class24 method172(class118 arg0, int arg1, byte arg2, int arg3, class118 arg4) {
        field492++;
        if (this.field508 != -1) {
            return class118.method913(this.field508, (byte) -115).method368(arg0, arg1, 0, arg3, arg4);
        }
        int var6 = 12 % ((arg2 - 1) / 43);
        long var7 = this.field507;
        int[] var9 = this.field510;
        if (arg0 != null && (arg0.field2897 >= 0 || arg0.field2886 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field510[var10];
            }
            if (arg0.field2897 >= 0) {
                var7 += arg0.field2897 - this.field510[5] << 8;
                var9[5] = arg0.field2897;
            }
            if (arg0.field2886 >= 0) {
                var7 += arg0.field2886 - this.field510[3] << 16;
                var9[3] = arg0.field2886;
            }
        }
        class24 var11 = (class24) class4.field99.method330(var7, -1);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var21 = var9[var13];
                if (var21 >= 256 && var21 < 512 && !class90.method728(var21 - 256, 3).method626(4732)) {
                    var12 = true;
                }
                if (var21 >= 512 && !class42.method358(0, var21 - 512).method664(-24, this.field493)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field489 != -1L) {
                    var11 = (class24) class4.field99.method330(this.field489, -1);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class24[] var14 = new class24[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var18 = var9[var16];
                    if (var18 >= 256 && var18 < 512) {
                        class24 var19 = class90.method728(var18 - 256, 3).method631(120);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class24 var20 = class42.method358(0, var18 - 512).method666(this.field493, true);
                        if (var20 != null) {
                            var14[var15++] = var20;
                        }
                    }
                }
                var11 = new class24(var14, var15);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field490[var17] != 0) {
                        var11.method192(class121.field2961[var17][0], class121.field2961[var17][this.field490[var17]]);
                        if (var17 == 1) {
                            var11.method192(class48.field1198[0], class48.field1198[this.field490[var17]]);
                        }
                    }
                }
                var11.method181();
                var11.method193(64, 850, -30, -50, -30, true);
                class4.field99.method332(var11, 0, var7);
                this.field489 = var7;
            }
        }
        if (arg0 == null && arg4 == null) {
            return var11;
        }
        class24 var22;
        if (arg0 != null && arg4 != null) {
            var22 = arg0.method916(var11, arg4, arg1, -113, arg3);
        } else if (arg0 == null) {
            var22 = arg4.method907(var11, arg3, 65535);
        } else {
            var22 = arg0.method907(var11, arg1, 65535);
        }
        return var22;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 533)
    private final void method173(int arg0) {
        field498++;
        long var2 = this.field507;
        int var4 = this.field510[5];
        int var5 = this.field510[9];
        this.field510[5] = var5;
        this.field510[9] = var4;
        if (arg0 != 22824) {
            return;
        }
        this.field507 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field507 <<= 0x4;
            if (this.field510[var6] >= 256) {
                this.field507 += this.field510[var6] - 256;
            }
        }
        if (this.field510[0] >= 256) {
            this.field507 += this.field510[0] - 256 >> 4;
        }
        if (this.field510[1] >= 256) {
            this.field507 += this.field510[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field507 <<= 0x3;
            this.field507 += this.field490[var7];
        }
        this.field507 <<= 0x1;
        this.field507 += this.field493 ? 1 : 0;
        this.field510[5] = var4;
        this.field510[9] = var5;
        if (var2 != 0L && this.field507 != var2) {
            class4.field99.method333(1280, var2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V", line = 592)
    public static final void method174(boolean arg0) {
        if (!arg0) {
            method171((byte) -41, -80L);
        }
        field494++;
        for (class82 var1 = (class82) class22.field481.method443((byte) -111); var1 != null; var1 = (class82) class22.field481.method434(true)) {
            if (class79.field1993 != var1.field2104 || var1.field2096) {
                var1.method948(73);
            } else if (var1.field2101 <= class2.field73) {
                var1.method676(0, class44.field1124);
                if (var1.field2096) {
                    var1.method948(90);
                } else {
                    class89.field2283.method259(var1.field2104, var1.field2100, var1.field2102, var1.field2094, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I", line = 631)
    public final int method175(int arg0) {
        field505++;
        if (arg0 != 11) {
            this.field507 = -43L;
        }
        return this.field508 == -1 ? (this.field490[0] << 25) + (this.field510[11] << 5) + this.field510[1] + (this.field510[8] << 10) + (this.field510[0] << 15) + (this.field490[4] << 20) : class118.method913(this.field508, (byte) 111).field987 + 305419896;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[I[IIZ)V", line = 646)
    public final void method176(int arg0, int[] arg1, int[] arg2, int arg3, boolean arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class48.field1188; var7++) {
                    class74 var8 = class90.method728(var7, 3);
                    if (var8 != null && !var8.field1865 && var8.field1863 == var6 + (arg4 ? 7 : 0)) {
                        arg1[class61.field1549[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        int var9 = -14 / ((arg0 + 76) / 35);
        this.field490 = arg2;
        this.field510 = arg1;
        field488++;
        this.field493 = arg4;
        this.field508 = arg3;
        this.method173(22824);
    }
}
