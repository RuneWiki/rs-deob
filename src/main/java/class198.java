import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class198 extends class283 {

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
    private int field3086 = 1024;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "I")
    private int field3080 = 2048;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
    private int field3081 = 3072;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "Z")
    public static volatile boolean field3066 = true;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "Lna;")
    private static class26 field3073 = class69.method505("M", (byte) -128);

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "Lna;")
    public static class26 field3078 = field3073;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "[[Z")
    public static boolean[][] field3071 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Lna;")
    public static class26 field3072 = class69.method505("vert:", (byte) -120);

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "Lna;")
    public static class26 field3070 = field3073;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "Lna;")
    public static class26 field3077 = class69.method505("::noclip", (byte) -123);

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lll;")
    public static class156 field3079;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "Ljava/awt/Frame;")
    public static Frame field3075;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method1329(int arg0, int arg1, int arg2, int arg3) {
        field3082++;
        if (arg2 == arg3) {
            return arg2;
        }
        int var4 = 128 - arg1;
        if (arg0 != 18348) {
            method1332(82, -103, 50, -59, (class86) null, 126L, (class86) null, (class86) null);
        }
        int var5 = ((arg2 & 0xFF00FF00) >>> 7) * var4 + ((arg3 & 0xFF00FF00) >>> 7) * arg1 & 0xFF00FF00;
        int var6 = (arg2 & 0xFF00FF) * var4 + ((arg3 & 0xFF00FF) * arg1) & 0xFF00FF00;
        return var5 + (var6 >> 7);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILwa;Z)V", line = 39)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field3086 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field3081 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field4715 = arg1.method642((byte) -117) == 1;
        }
        if (!arg2) {
            this.method1(56, (class82) null, true);
        }
        field3069++;
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V", line = 74)
    public static void method1330(int arg0) {
        field3078 = null;
        field3070 = null;
        if (arg0 != 1024) {
            field3079 = (class156) null;
        }
        field3073 = null;
        field3077 = null;
        field3075 = null;
        field3071 = (boolean[][]) null;
        field3072 = null;
        field3079 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[I", line = 94)
    public final int[] method8(int arg0, byte arg1) {
        field3085++;
        int var3 = 71 / ((arg1 - 30) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(0, arg0, 32755);
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                var4[var6] = this.field3086 + (var5[var6] * this.field3080 >> 12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(JI)V", line = 130)
    public static final void method1331(long arg0, int arg1) {
        field3083++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class132.field2014; var3++) {
            if (class85.field1394[var3] == arg0) {
                class40.field658++;
                class132.field2014--;
                for (int var4 = var3; var4 < class132.field2014; var4++) {
                    class85.field1394[var4] = class85.field1394[var4 + 1];
                    class309.field5316[var4] = class309.field5316[var4 + 1];
                }
                class100.field1611 = class74.field1144;
                class114.field1789.method1431(0, 213);
                class114.field1789.method579(arg0, -2037491440);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIILth;JLth;Lth;)V", line = 170)
    public static final void method1332(int arg0, int arg1, int arg2, int arg3, class86 arg4, long arg5, class86 arg6, class86 arg7) {
        class149 var9 = new class149();
        var9.field2330 = arg4;
        var9.field2337 = arg1 * 128 + 64;
        var9.field2333 = arg2 * 128 + 64;
        var9.field2324 = arg3;
        var9.field2340 = arg5;
        var9.field2323 = arg6;
        var9.field2325 = arg7;
        int var10 = 0;
        class55 var11 = class36.field585[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field879; var12++) {
                class39 var13 = var11.field877[var12];
                if ((var13.field656 & 0x400000L) == 4194304L) {
                    int var14 = var13.field632.method679();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2336 = -var10;
        if (class36.field585[arg0][arg1][arg2] == null) {
            class36.field585[arg0][arg1][arg2] = new class55(arg0, arg1, arg2);
        }
        class36.field585[arg0][arg1][arg2].field901 = var9;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lth;IIIII)V", line = 219)
    public static final void method1333(class86 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class235.field3723 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class285.field4778) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class303.field5221 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class55 var14 = class36.field585[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class229.field3635[var11][var12 + 1][var13] + class229.field3635[var11][var12][var13] + class229.field3635[var11][var12][var13 + 1] + class229.field3635[var11][var12 + 1][var13 + 1]) / 4 - (class229.field3635[arg1][arg2 + 1][arg3] + class229.field3635[arg1][arg2][arg3] + class229.field3635[arg1][arg2][arg3 + 1] + class229.field3635[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class267 var16 = var14.field890;
                                    if (var16 != null) {
                                        if (var16.field4409.method673()) {
                                            arg0.method674(var16.field4409, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4412 != null && var16.field4412.method673()) {
                                            arg0.method674(var16.field4412, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field879; var17++) {
                                        class39 var18 = var14.field877[var17];
                                        if (var18 != null && var18.field632.method673() && (var18.field637 == var12 || var7 == var12) && (var18.field630 == var13 || var9 == var13)) {
                                            int var19 = var18.field652 + 1 - var18.field637;
                                            int var20 = var18.field634 + 1 - var18.field630;
                                            arg0.method674(var18.field632, (var18.field637 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field630 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLek;)V", line = 315)
    public static final void method1334(byte arg0, class183 arg1) {
        short var2 = 256;
        int var3 = 0;
        if (arg0 >= -80) {
            field3066 = true;
        }
        while (class154.field2400.length > var3) {
            class154.field2400[var3] = 0;
            var3++;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * Math.random() * 128.0D);
            class154.field2400[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    class262.field4284[var9] = (class154.field2400[var9 + 128] + class154.field2400[var9 - 1] + class154.field2400[var9 + 1] + class154.field2400[var9 + -128]) / 4;
                }
            }
            int[] var10 = class154.field2400;
            class154.field2400 = class262.field4284;
            class262.field4284 = var10;
        }
        field3068++;
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field2351; var12++) {
            for (int var13 = 0; var13 < arg1.field2341; var13++) {
                if (arg1.field2873[var11++] != 0) {
                    int var14 = var13 + arg1.field2353 + 16;
                    int var15 = var12 + arg1.field2344 + 16;
                    int var16 = var14 + (var15 << 7);
                    class154.field2400[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[[I", line = 413)
    public final int[][] method3(int arg0, int arg1) {
        int[][] var3 = this.field4719.method2182((byte) -118, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(arg1, 0, (byte) -50);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class101.field1632; var11++) {
                var8[var11] = this.field3086 + (var7[var11] * this.field3080 >> 12);
                var9[var11] = (var5[var11] * this.field3080 >> 12) + this.field3086;
                var10[var11] = (var6[var11] * this.field3080 >> 12) + this.field3086;
            }
        }
        field3067++;
        if (arg0 != -1) {
            method1330(51);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V", line = 457)
    public final void method130(int arg0) {
        field3084++;
        if (arg0 == 16251) {
            this.field3080 = this.field3081 - this.field3086;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 471)
    public class198() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lwa;I)V", line = 520)
    public static final void method1335(class82 arg0, int arg1) {
        field3074++;
        for (int var2 = 0; var2 < class117.field1844; var2++) {
            int var3 = arg0.method617(true);
            int var4 = arg0.method576(1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class193.field3005[var3] != null) {
                class193.field3005[var3].field3634 = var4;
            }
        }
        if (arg1 != -14991) {
            field3077 = (class26) null;
        }
    }
}
