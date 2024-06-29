import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 extends class124 {

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Lm;")
    public class83 field3015 = new class83();

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Lue;")
    public class144 field3040 = new class144();

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Lid;")
    private class60 field3025;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "Lic;")
    private static class59 field3017 = class59.method433(0, "cyan:");

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Lic;")
    public static class59 field3016 = field3017;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Z")
    public static boolean field3021 = false;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "[[[I")
    public static int[][][] field3023 = new int[4][13][13];

    @OriginalMember(owner = "client!td", name = "J", descriptor = "Lic;")
    private static class59 field3026 = class59.method433(0, "slide:");

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Lic;")
    public static class59 field3022 = field3017;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Lic;")
    public static class59 field3018 = field3026;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "Lic;")
    public static class59 field3014 = field3026;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Lic;")
    private static class59 field3038 = class59.method433(0, "Take");

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Lic;")
    public static class59 field3024 = field3038;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "B")
    public static byte field3019;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "Lwf;")
    public static class159 field3039;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[Lce;")
    public static class20[] field3027;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "[[B")
    public static byte[][] field3037;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()Lrf;")
    public final class124 method467() {
        field3020++;
        class158 var1;
        do {
            var1 = (class158) this.field3015.method684((byte) -65);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3499 == null);
        return var1.field3499;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lwe;II)V")
    private final void method1040(class158 arg0, int arg1, int arg2) {
        if ((this.field3025.field1511[arg0.field3512] & 0x4) != 0 && arg0.field3490 < 0) {
            int var4 = this.field3025.field1477[arg0.field3512] / class25.field626;
            int var5 = (var4 + 1048575 - arg0.field3523) / var4;
            arg0.field3523 = arg1 * var4 + arg0.field3523 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field3025.field1480[arg0.field3512] == 0) {
                    arg0.field3499 = class71.method580(arg0.field3484, arg0.field3499.method592(), arg0.field3499.method558(), arg0.field3499.method571());
                } else {
                    arg0.field3499 = class71.method580(arg0.field3484, arg0.field3499.method592(), 0, arg0.field3499.method571());
                    this.field3025.method498(arg0.field3494.field1078[arg0.field3513] < 0, arg0, 1661558406);
                }
                if (arg0.field3494.field1078[arg0.field3513] < 0) {
                    arg0.field3499.method575(-1);
                }
                arg1 = arg0.field3523 / var4;
            }
        }
        if (arg2 >= -117) {
            this.method483();
        }
        field3034++;
        arg0.field3499.method474(arg1);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
    public final int method483() {
        field3029++;
        return 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI[Laa;I[I[I)V")
    public static final void method1041(byte arg0, int arg1, class2[] arg2, int arg3, int[] arg4, int[] arg5) {
        field3028++;
        int var6 = 70 / ((arg0 - 23) / 63);
        if (arg3 <= arg1) {
            return;
        }
        int var7 = arg1 - 1;
        int var8 = arg3 + 1;
        int var9 = (arg1 + arg3) / 2;
        class2 var10 = arg2[var9];
        arg2[var9] = arg2[arg1];
        arg2[arg1] = var10;
        while (var8 > var7) {
            boolean var11 = true;
            do {
                var8--;
                for (int var12 = 0; var12 < 4; var12++) {
                    int var13;
                    int var14;
                    if (arg5[var12] == 2) {
                        var13 = var10.field50;
                        var14 = arg2[var8].field50;
                    } else if (arg5[var12] == 1) {
                        var14 = arg2[var8].field33;
                        var13 = var10.field33;
                        if (var13 == -1 && arg4[var12] == 1) {
                            var13 = 2001;
                        }
                        if (var14 == -1 && arg4[var12] == 1) {
                            var14 = 2001;
                        }
                    } else if (arg5[var12] == 3) {
                        var14 = arg2[var8].field40 ? 1 : 0;
                        var13 = var10.field40 ? 1 : 0;
                    } else {
                        var13 = var10.field38;
                        var14 = arg2[var8].field38;
                    }
                    if (var13 != var14) {
                        if ((arg4[var12] != 1 || var13 >= var14) && (arg4[var12] != 0 || var14 >= var13)) {
                            var11 = false;
                        }
                        break;
                    }
                    if (var12 == 3) {
                        var11 = false;
                    }
                }
            } while (var11);
            boolean var15 = true;
            do {
                var7++;
                for (int var16 = 0; var16 < 4; var16++) {
                    int var17;
                    int var18;
                    if (arg5[var16] == 2) {
                        var17 = arg2[var7].field50;
                        var18 = var10.field50;
                    } else if (arg5[var16] == 1) {
                        var17 = arg2[var7].field33;
                        if (var17 == -1 && arg4[var16] == 1) {
                            var17 = 2001;
                        }
                        var18 = var10.field33;
                        if (var18 == -1 && arg4[var16] == 1) {
                            var18 = 2001;
                        }
                    } else if (arg5[var16] == 3) {
                        var18 = var10.field40 ? 1 : 0;
                        var17 = arg2[var7].field40 ? 1 : 0;
                    } else {
                        var17 = arg2[var7].field38;
                        var18 = var10.field38;
                    }
                    if (var17 != var18) {
                        if ((arg4[var16] != 1 || var17 >= var18) && (arg4[var16] != 0 || var18 >= var17)) {
                            var15 = false;
                        }
                        break;
                    }
                    if (var16 == 3) {
                        var15 = false;
                    }
                }
            } while (var15);
            if (var7 < var8) {
                class2 var19 = arg2[var7];
                arg2[var7] = arg2[var8];
                arg2[var8] = var19;
            }
        }
        method1041((byte) -101, arg1, arg2, var8, arg4, arg5);
        method1041((byte) -91, var8 + 1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()Lrf;")
    public final class124 method470() {
        field3035++;
        class158 var1 = (class158) this.field3015.method682(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3499 == null) {
            return this.method467();
        } else {
            return var1.field3499;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static void method1042(int arg0) {
        field3017 = null;
        field3018 = null;
        field3027 = null;
        field3026 = null;
        field3023 = null;
        field3022 = null;
        field3037 = null;
        if (arg0 > -94) {
            method1042(-71);
        }
        field3016 = null;
        field3014 = null;
        field3038 = null;
        field3039 = null;
        field3024 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public final void method474(int arg0) {
        this.field3040.method474(arg0);
        field3031++;
        for (class158 var2 = (class158) this.field3015.method682(0); var2 != null; var2 = (class158) this.field3015.method684((byte) -65)) {
            if (!this.field3025.method464(var2, -105)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3507) {
                        this.method1040(var2, var3, -127);
                        var2.field3507 -= var3;
                        break;
                    }
                    this.method1040(var2, var2.field3507, -128);
                    var3 -= var2.field3507;
                } while (!this.field3025.method469(0, var3, var2, null, 32694));
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([III)V")
    public final void method495(int[] arg0, int arg1, int arg2) {
        this.field3040.method495(arg0, arg1, arg2);
        field3030++;
        for (class158 var4 = (class158) this.field3015.method682(0); var4 != null; var4 = (class158) this.field3015.method684((byte) -65)) {
            if (!this.field3025.method464(var4, -105)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3507) {
                        this.method1043(var6, var4, -1048576, var5, var5 + var6, arg0);
                        var4.field3507 -= var6;
                        break;
                    }
                    this.method1043(var4.field3507, var4, -1048576, var5, var5 + var6, arg0);
                    var6 -= var4.field3507;
                    var5 += var4.field3507;
                } while (!this.field3025.method469(var5, var6, var4, arg0, 32694));
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILwe;III[I)V")
    private final void method1043(int arg0, class158 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field3036++;
        if (arg2 != -1048576) {
            field3026 = null;
        }
        if ((this.field3025.field1511[arg1.field3512] & 0x4) != 0 && arg1.field3490 < 0) {
            int var7 = this.field3025.field1477[arg1.field3512] / class25.field626;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3523) / var7;
                if (var8 > arg0) {
                    arg1.field3523 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg1.field3499.method495(arg5, arg3, var8);
                arg3 += var8;
                arg1.field3523 += var7 * var8 - 1048576;
                int var9 = class25.field626 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class71 var11 = arg1.field3499;
                if (this.field3025.field1480[arg1.field3512] == 0) {
                    arg1.field3499 = class71.method580(arg1.field3484, var11.method592(), var11.method558(), var11.method571());
                } else {
                    arg1.field3499 = class71.method580(arg1.field3484, var11.method592(), 0, var11.method571());
                    this.field3025.method498(arg1.field3494.field1078[arg1.field3513] < 0, arg1, 1661558406);
                    arg1.field3499.method566(var9, var11.method558());
                }
                if (arg1.field3494.field1078[arg1.field3513] < 0) {
                    arg1.field3499.method575(-1);
                }
                var11.method590(var9);
                var11.method495(arg5, arg3, arg4 - arg3);
                if (var11.method563()) {
                    this.field3040.method1076(var11);
                }
            }
        }
        arg1.field3499.method495(arg5, arg3, arg0);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lid;)V")
    public class136(class60 arg0) {
        this.field3025 = arg0;
    }
}
