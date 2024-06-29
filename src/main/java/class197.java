import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class197 extends class194 {

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Lol;")
    public class220 field3106 = new class220();

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Lte;")
    public class280 field3120 = new class280();

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Lal;")
    private class307 field3107;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "S")
    public static short field3104 = 256;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "Z")
    public static boolean field3121 = false;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[I")
    public static int[] field3112 = new int[5];

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "Lam;")
    public static class242 field3114;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "Lvl;")
    public static class73 field3113;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "Lclient;")
    public static client field3117;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "()I")
    public final int method948() {
        field3118++;
        return 0;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public static final void method1371(int arg0) {
        class83.field1290.method1511((byte) 120);
        field3124++;
        if (arg0 != -2) {
            method1373((byte) 107);
        }
        class112.field1616.method1511((byte) 97);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([III)V")
    public final void method969(int[] arg0, int arg1, int arg2) {
        field3122++;
        this.field3120.method969(arg0, arg1, arg2);
        for (class9 var4 = (class9) this.field3106.method1548(0); var4 != null; var4 = (class9) this.field3106.method1549(-41)) {
            if (!this.field3107.method2080(var4, true)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field142 >= var6) {
                        this.method1376(arg0, 0, var5 + var6, var5, var4, var6);
                        var4.field142 -= var6;
                        break;
                    }
                    this.method1376(arg0, 0, var5 + var6, var5, var4, var4.field142);
                    var6 -= var4.field142;
                    var5 += var4.field142;
                } while (!this.field3107.method2068((byte) 63, arg0, var5, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BILwh;)V")
    private final void method1372(byte arg0, int arg1, class9 arg2) {
        if (arg0 != -65) {
            return;
        }
        if ((this.field3107.field4938[arg2.field125] & 0x4) != 0 && arg2.field123 < 0) {
            int var4 = this.field3107.field4905[arg2.field125] / field3105;
            int var5 = (var4 + 1048575 - arg2.field132) / var4;
            arg2.field132 = arg1 * var4 + arg2.field132 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field3107.field4944[arg2.field125] == 0) {
                    arg2.field120 = class145.method954(arg2.field145, arg2.field120.method970(), arg2.field120.method980(), arg2.field120.method983());
                } else {
                    arg2.field120 = class145.method954(arg2.field145, arg2.field120.method970(), 0, arg2.field120.method983());
                    this.field3107.method2062(1000000, arg2, arg2.field136.field2774[arg2.field135] < 0);
                }
                if (arg2.field136.field2774[arg2.field135] < 0) {
                    arg2.field120.method953(-1);
                }
                arg1 = arg2.field132 / var4;
            }
        }
        arg2.field120.method952(arg1);
        field3110++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public static void method1373(byte arg0) {
        if (arg0 >= 92) {
            field3114 = null;
            field3117 = null;
            field3112 = null;
            field3113 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
    public final void method952(int arg0) {
        this.field3120.method952(arg0);
        for (class9 var2 = (class9) this.field3106.method1548(0); var2 != null; var2 = (class9) this.field3106.method1549(81)) {
            if (!this.field3107.method2080(var2, true)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field142) {
                        this.method1372((byte) -65, var3, var2);
                        var2.field142 -= var3;
                        break;
                    }
                    this.method1372((byte) -65, var2.field142, var2);
                    var3 -= var2.field142;
                } while (!this.field3107.method2068((byte) 32, (int[]) null, 0, var3, var2));
            }
        }
        field3115++;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "()Log;")
    public final class194 method947() {
        field3111++;
        class9 var1;
        do {
            var1 = (class9) this.field3106.method1549(84);
            if (var1 == null) {
                return null;
            }
        } while (var1.field120 == null);
        return var1.field120;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
    public static final void method1374(int arg0, boolean arg1) {
        field3116++;
        int var2 = class272.field4432;
        if (arg0 == 0) {
            var2 = 1;
        }
        if (!arg1) {
            method1375((String) null, -128);
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class1 var20;
            if (arg0 == 0) {
                var20 = class214.field3347;
            } else {
                var20 = class35.field409[class52.field745[var3]];
            }
            if (var20 != null && var20.method1(5)) {
                int var21 = var20.method8((byte) -88);
                if (arg0 == 0 || arg0 == var21) {
                    if (var21 == 1) {
                        if ((var20.field3915 & 0x7F) == 64 && (var20.field3920 & 0x7F) == 64) {
                            int var28 = var20.field3915 >> 7;
                            int var29 = var20.field3920 >> 7;
                            if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                var10002 = class114.field1671[var28][var29]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field3915 & 0x7F) == 0 && (var20.field3920 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field3915 & 0x7F) == 64 && (var20.field3920 & 0x7F) == 64)) {
                        int var22 = var20.field3915 - var21 * 64 >> 7;
                        int var23 = var20.field3920 - (var21 * 64) >> 7;
                        int var24 = var22 + var20.method8((byte) -94);
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        int var25 = var20.method8((byte) -81) + var23;
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var26 = var22; var26 < var24; var26++) {
                            for (int var27 = var23; var27 < var25; var27++) {
                                var10002 = class114.field1671[var26][var27]++;
                            }
                        }
                    }
                }
            }
        }
        label216: for (int var4 = 0; var4 < var2; var4++) {
            class1 var5;
            long var6;
            if (arg0 == 0) {
                var6 = 8791798054912L;
                var5 = class214.field3347;
            } else {
                var5 = class35.field409[class52.field745[var4]];
                var6 = (long) class52.field745[var4] << 32;
            }
            if (var5 != null && var5.method1(5)) {
                int var8 = var5.method8((byte) -84);
                if (arg0 == 0 || arg0 == var8) {
                    var5.field3903 = true;
                    var5.field29 = false;
                    if ((class162.field2440 && class272.field4432 > 200 || class272.field4432 > 50) && arg0 != 0 && var5.field3946 == var5.method1725(-127).field2517) {
                        var5.field29 = true;
                    }
                    if (var8 == 1) {
                        if ((var5.field3915 & 0x7F) == 64 && (var5.field3920 & 0x7F) == 64) {
                            int var18 = var5.field3915 >> 7;
                            int var19 = var5.field3920 >> 7;
                            if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class114.field1671[var18][var19] > 1) {
                                var10002 = class114.field1671[var18][var19]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var5.field3915 & 0x7F) == 0 && (var5.field3920 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field3915 & 0x7F) == 64 && (var5.field3920 & 0x7F) == 0) {
                        int var9 = var5.field3915 - (var8 * 64) >> 7;
                        int var10 = var5.field3920 - var8 * 64 >> 7;
                        int var11 = var8 + var9;
                        int var12 = var8 + var10;
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        boolean var13 = true;
                        for (int var14 = var9; var14 < var11; var14++) {
                            for (int var17 = var10; var17 < var12; var17++) {
                                if (class114.field1671[var14][var17] <= 1) {
                                    var13 = false;
                                    break;
                                }
                            }
                        }
                        if (var13) {
                            int var15 = var9;
                            while (true) {
                                if (var15 >= var11) {
                                    continue label216;
                                }
                                for (int var16 = var10; var16 < var12; var16++) {
                                    var10002 = class114.field1671[var15][var16]--;
                                }
                                var15++;
                            }
                        }
                    }
                    if (var5.field3955 == null || class311.field4996 < var5.field3968 || var5.field3912 <= class311.field4996) {
                        var5.field3903 = false;
                        var5.field3986 = class52.method351(-106, var5.field3920, var5.field3915, class148.field2204);
                        class71.method464(class148.field2204, var5.field3915, var5.field3920, var5.field3986, var8 * 64 + 60 - 64, var5, var5.field3913, var6, var5.field3956);
                    } else {
                        var5.field3903 = false;
                        var5.field29 = false;
                        var5.field3986 = class52.method351(-117, var5.field3920, var5.field3915, class148.field2204);
                        class271.method1887(class148.field2204, var5.field3915, var5.field3920, var5.field3986, var5, var5.field3913, var6, var5.field3921, var5.field3917, var5.field3919, var5.field3940);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()Log;")
    public final class194 method988() {
        field3119++;
        class9 var1 = (class9) this.field3106.method1548(0);
        if (var1 == null) {
            return null;
        } else if (var1.field120 == null) {
            return this.method947();
        } else {
            return var1.field120;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1375(String arg0, int arg1) {
        if (arg1 != 200) {
            field3105 = -76;
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field3109++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([IIIILwh;I)V")
    private final void method1376(int[] arg0, int arg1, int arg2, int arg3, class9 arg4, int arg5) {
        field3108++;
        if (arg1 != 0) {
            return;
        }
        if ((this.field3107.field4938[arg4.field125] & 0x4) != 0 && arg4.field123 < 0) {
            int var7 = this.field3107.field4905[arg4.field125] / field3105;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field132) / var7;
                if (var8 > arg5) {
                    arg4.field132 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg4.field120.method969(arg0, arg3, var8);
                arg3 += var8;
                arg4.field132 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                int var10 = field3105 / 100;
                class145 var11 = arg4.field120;
                if (var10 > var9) {
                    var10 = var9;
                }
                if (this.field3107.field4944[arg4.field125] == 0) {
                    arg4.field120 = class145.method954(arg4.field145, var11.method970(), var11.method980(), var11.method983());
                } else {
                    arg4.field120 = class145.method954(arg4.field145, var11.method970(), 0, var11.method983());
                    this.field3107.method2062(arg1 + 1000000, arg4, arg4.field136.field2774[arg4.field135] < 0);
                    arg4.field120.method976(var10, var11.method980());
                }
                if (arg4.field136.field2774[arg4.field135] < 0) {
                    arg4.field120.method953(-1);
                }
                var11.method956(var10);
                var11.method969(arg0, arg3, arg2 - arg3);
                if (var11.method987()) {
                    this.field3120.method1927(var11);
                }
            }
        }
        arg4.field120.method969(arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lal;)V")
    public class197(class307 arg0) {
        this.field3107 = arg0;
    }
}
