import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class158 extends class120 {

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "Lak;")
    public static class20 field2484 = new class20(50);

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "Lok;")
    public static class41 field2486 = class137.method956("<)4col>", 45);

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "[[B")
    public static byte[][] field2482;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)V", line = 4)
    public static final void method1115(byte arg0, int arg1, int arg2) {
        field2478++;
        class212 var3 = class81.field1199[class55.field807][arg2][arg1];
        if (var3 == null) {
            class27.method172(class55.field807, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class295 var5 = null;
        for (class295 var6 = (class295) var3.method1495(-312); var6 != null; var6 = (class295) var3.method1501(arg0 ^ 0x33)) {
            class138 var7 = class130.method918(var6.field4772.field3290, -50);
            int var8 = var7.field2071;
            if (var7.field2122 == 1) {
                var8 = (var6.field4772.field3288 + 1) * var8;
            }
            if (var4 < var8) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class27.method172(class55.field807, arg2, arg1);
            return;
        }
        var3.method1498(var5, (byte) 93);
        class204 var9 = null;
        class295 var10 = (class295) var3.method1495(-312);
        if (arg0 != 30) {
            return;
        }
        class204 var11 = null;
        while (var10 != null) {
            class204 var12 = var10.field4772;
            if (var5.field4772.field3290 != var12.field3290) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field3290 != var12.field3290 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class295) var3.method1501(-96);
        }
        long var13 = (long) (arg2 - (-(arg1 << 7) - 1610612736));
        class204.method1444(class55.field807, arg2, arg1, class140.method983((byte) 86, class55.field807, arg2 * 128 + 64, arg1 * 128 + 64), var5.field4772, var13, var9, var11);
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 83)
    public static final void method1116(int arg0) {
        class311.field5251 = arg0;
        for (int var1 = 0; var1 < class272.field4434; var1++) {
            for (int var2 = 0; var2 < class65.field996; var2++) {
                if (class205.field3312[arg0][var1][var2] == null) {
                    class205.field3312[arg0][var1][var2] = new class308(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I", line = 114)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            field2484 = (class20) null;
        }
        field2487++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, arg0, -24059);
            int[] var5 = this.method854(1, arg0, -24059);
            int[] var6 = this.method854(2, arg0, arg1 ^ 0x6794);
            for (int var7 = 0; var7 < class307.field5160; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IZ)[[I", line = 165)
    public final int[][] method168(int arg0, boolean arg1) {
        field2480++;
        if (!arg1) {
            this.method30((class112) null, -17, -99);
        }
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[] var4 = this.method854(2, arg0, -24059);
            int[][] var5 = this.method858(0, arg0, 122);
            int[][] var6 = this.method858(1, arg0, 124);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var6[0];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class307.field5160; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var12[var16];
                    var8[var16] = var10[var16];
                    var9[var16] = var13[var16];
                } else if (var17 == 0) {
                    var7[var16] = var11[var16];
                    var8[var16] = var15[var16];
                    var9[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var11[var16] * var18 + var12[var16] * var17 >> 12;
                    var8[var16] = var10[var16] * var17 + (var15[var16] * var18) >> 12;
                    var9[var16] = var13[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Llb;II)V", line = 256)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field2479++;
        if (arg1 == -1 && arg2 == 0) {
            this.field1770 = arg0.method792(2) == 1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lmh;B)V", line = 271)
    public static final void method1117(class65 arg0, byte arg1) {
        class48.field740 = arg0.method476(class222.field3547, (byte) 3);
        class9.field118 = arg0.method476(class202.field3250, (byte) 120);
        field2483++;
        class256.field4117 = arg0.method476(class268.field4272, (byte) -26);
        class111.field1580 = arg0.method476(class224.field3583, (byte) -111);
        class308.field5187 = arg0.method476(class260.field4151, (byte) -22);
        class86.field1269 = arg0.method476(class156.field2465, (byte) -69);
        class80.field1179 = arg0.method476(class127.field1887, (byte) -64);
        class38.field593 = arg0.method476(class69.field1029, (byte) 120);
        if (arg1 > -122) {
            return;
        }
        class164.field2588 = arg0.method476(class244.field3899, (byte) -73);
        class235.field3777 = arg0.method476(class252.field4018, (byte) -128);
        class304.field5067 = arg0.method476(class45.field714, (byte) 125);
        class109.field1535 = arg0.method476(class294.field4765, (byte) -92);
        class249.field3968 = arg0.method476(class153.field2443, (byte) -86);
        class171.field2761 = arg0.method476(class119.field1754, (byte) 14);
        class93.field1373 = arg0.method476(class218.field3494, (byte) -21);
        class226.field3615 = arg0.method476(class146.field2217, (byte) 115);
        class89.field1309 = arg0.method476(class62.field921, (byte) -59);
        class301.field4886 = arg0.method476(class150.field2335, (byte) 123);
        class81.field1202 = arg0.method476(class203.field3268, (byte) 123);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZIIZ)V", line = 301)
    public static final void method1118(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field2485++;
        if (class32.method223(arg3, 255)) {
            class22.method151(arg0, -1, arg1, class273.field4446[arg3], -1, arg2);
            if (!arg4) {
                method1121((class65) null, 86);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V", line = 316)
    public static void method1119(int arg0) {
        int var1 = -115 / ((arg0 - 77) / 37);
        field2486 = null;
        field2482 = (byte[][]) null;
        field2484 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIII)V", line = 329)
    public static final void method1120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2481++;
        if (arg0 != 128) {
            method1115((byte) -13, -50, 13);
        }
        for (int var6 = arg5; var6 <= arg1; var6++) {
            class269.method1908(19, class239.field3829[var6], arg4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lmh;I)V", line = 352)
    public static final void method1121(class65 arg0, int arg1) {
        field2477++;
        if (arg1 == 1610612736) {
            class139.field2133 = arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 364)
    public class158() {
        super(3, false);
    }
}
