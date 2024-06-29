import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class291 extends class279 {

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    private int field4978 = 585;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Ltl;")
    public static class59 field4972 = class85.method639("<col=ff3000>", 9588);

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field4973 = 0;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Lgb;")
    public static class212 field4977 = new class212(64);

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field4986 = 0;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4985 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "Lme;")
    public static class295 field4981;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "[Loj;")
    public static class260[] field4976;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZZ)V", line = 12)
    public static final void method2014(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        class294.method2030(120, arg4, class53.field782.length - 1, 0, arg3, arg0, arg1);
        if (arg2 >= -117) {
            method2018(26, 120, -56, 19, 69, false, (byte) 7, 62, 9, 53, 8, -17);
        }
        field4980++;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 24)
    public static void method2015(int arg0) {
        field4985 = null;
        field4981 = null;
        field4976 = null;
        if (arg0 == 0) {
            field4977 = null;
            field4972 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)[I", line = 43)
    public final int[] method44(boolean arg0, int arg1) {
        field4974++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int var4 = class71.field1104[arg1];
            for (int var5 = 0; var5 < class56.field835; var5++) {
                int var6 = class31.field430[var5];
                if (var6 > this.field4978 && (4096 - this.field4978) > var6 && var4 > 2048 - this.field4978 && var4 < (this.field4978 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4978);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field4978 && var6 < (this.field4978 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4978;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4978);
                } else if (var4 < this.field4978 || (4096 - this.field4978) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field4978;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4978);
                } else if (var6 >= this.field4978 && (4096 - this.field4978) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4978);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        if (arg0) {
            method2017(-35, (byte) 14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 129)
    public class291() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([II[Ljava/lang/Object;)V", line = 134)
    public static final void method2016(int[] arg0, int arg1, Object[] arg2) {
        class178.method1317(0, 2, arg0, arg2, arg0.length - arg1);
        field4984++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)I", line = 158)
    public static final int method2017(int arg0, byte arg1) {
        class123 var2 = class139.method1013(arg0, -5829);
        field4983++;
        int var3 = var2.field2031;
        int var4 = var2.field2037;
        int var5 = var2.field2034;
        if (arg1 != -49) {
            field4977 = (class212) null;
        }
        int var6 = class288.field4951[var5 - var4];
        return var6 & class116.field1915[var3] >> var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILs;)V", line = 177)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field4975++;
        if (arg1 == 0) {
            this.field4978 = arg2.method1214(-18254);
        }
        if (arg0 > -125) {
            field4976 = (class260[]) null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIZBIIIII)Z", line = 208)
    public static final boolean method2018(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg6 != 52) {
            method2016((int[]) null, 48, (Object[]) null);
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class50.field769[var12][var13] = 0;
                class19.field257[var12][var13] = 99999999;
            }
        }
        field4982++;
        class50.field769[arg0][arg4] = 99;
        class19.field257[arg0][arg4] = 0;
        int var14 = arg0;
        byte var15 = 0;
        class248.field4126[var15] = arg0;
        int var16 = 0;
        int var32 = var15 + 1;
        class274.field4721[var15] = arg4;
        int var17 = arg4;
        boolean var18 = false;
        int[][] var19 = class41.field612[class247.field4119].field409;
        while (var32 != var16) {
            var14 = class248.field4126[var16];
            var17 = class274.field4721[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg9 == var14 && arg8 == var17) {
                var18 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class41.field612[class247.field4119].method203(arg7, arg8, 2, arg10 - 1, (byte) 73, arg9, var17, var14)) {
                    var18 = true;
                    break;
                }
                if (arg10 < 10 && class41.field612[class247.field4119].method193((byte) -65, arg7, var14, arg10 - 1, 2, var17, arg9, arg8)) {
                    var18 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg3 != 0 && class41.field612[class247.field4119].method200(arg1, arg6 + 12749, var17, arg8, arg3, 2, var14, arg2, arg9)) {
                var18 = true;
                break;
            }
            int var20 = class19.field257[var14][var17] + 1;
            if (var14 > 0 && class50.field769[var14 - 1][var17] == 0 && (var19[var14 - 1][var17] & 0x12C010E) == 0 && (var19[var14 - 1][var17 + 1] & 0x12C0138) == 0) {
                class248.field4126[var32] = var14 - 1;
                class274.field4721[var32] = var17;
                class50.field769[var14 - 1][var17] = 2;
                var32 = var32 + 1 & 0xFFF;
                class19.field257[var14 - 1][var17] = var20;
            }
            if (var14 < 102 && class50.field769[var14 + 1][var17] == 0 && (var19[var14 + 2][var17] & 0x12C0183) == 0 && (var19[var14 + 2][var17 + 1] & 0x12C01E0) == 0) {
                class248.field4126[var32] = var14 + 1;
                class274.field4721[var32] = var17;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var14 + 1][var17] = 8;
                class19.field257[var14 + 1][var17] = var20;
            }
            if (var17 > 0 && class50.field769[var14][var17 - 1] == 0 && (var19[var14][var17 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var17 - 1] & 0x12C0183) == 0) {
                class248.field4126[var32] = var14;
                class274.field4721[var32] = var17 - 1;
                class50.field769[var14][var17 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class19.field257[var14][var17 - 1] = var20;
            }
            if (var17 < 102 && class50.field769[var14][var17 + 1] == 0 && (var19[var14][var17 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var17 + 2] & 0x12C01E0) == 0) {
                class248.field4126[var32] = var14;
                class274.field4721[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var14][var17 + 1] = 4;
                class19.field257[var14][var17 + 1] = var20;
            }
            if (var14 > 0 && var17 > 0 && class50.field769[var14 - 1][var17 - 1] == 0 && (var19[var14 - 1][var17] & 0x12C0138) == 0 && (var19[var14 - 1][var17 - 1] & 0x12C010E) == 0 && (var19[var14][var17 - 1] & 0x12C0183) == 0) {
                class248.field4126[var32] = var14 - 1;
                class274.field4721[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var14 - 1][var17 - 1] = 3;
                class19.field257[var14 - 1][var17 - 1] = var20;
            }
            if (var14 < 102 && var17 > 0 && class50.field769[var14 + 1][var17 - 1] == 0 && (var19[var14 + 1][var17 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var17 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var17] & 0x12C01E0) == 0) {
                class248.field4126[var32] = var14 + 1;
                class274.field4721[var32] = var17 - 1;
                class50.field769[var14 + 1][var17 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class19.field257[var14 + 1][var17 - 1] = var20;
            }
            if (var14 > 0 && var17 < 102 && class50.field769[var14 - 1][var17 + 1] == 0 && (var19[var14 - 1][var17 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var17 + 2] & 0x12C0138) == 0 && (var19[var14][var17 + 2] & 0x12C01E0) == 0) {
                class248.field4126[var32] = var14 - 1;
                class274.field4721[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var14 - 1][var17 + 1] = 6;
                class19.field257[var14 - 1][var17 + 1] = var20;
            }
            if (var14 < 102 && var17 < 102 && class50.field769[var14 + 1][var17 + 1] == 0 && (var19[var14 + 1][var17 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var17 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var17 + 1] & 0x12C0183) == 0) {
                class248.field4126[var32] = var14 + 1;
                class274.field4721[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var14 + 1][var17 + 1] = 12;
                class19.field257[var14 + 1][var17 + 1] = var20;
            }
        }
        class121.field2019 = 0;
        if (!var18) {
            if (!arg5) {
                return false;
            }
            int var21 = 100;
            int var22 = 1000;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= (arg9 + var23); var24++) {
                for (int var25 = arg8 - var23; var25 <= arg8 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class19.field257[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (var24 > (arg9 + arg2 - 1)) {
                            var26 = var24 + 1 - arg9 - arg2;
                        }
                        int var27 = 0;
                        if (arg8 > var25) {
                            var27 = arg8 - var25;
                        } else if (var25 > arg8 + arg3 - 1) {
                            var27 = 1 - (arg8 + arg3 - var25);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var22 || var22 == var28 && var21 > class19.field257[var24][var25]) {
                            var22 = var28;
                            var21 = class19.field257[var24][var25];
                            var17 = var25;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg0 == var14 && arg4 == var17) {
                return false;
            }
            class121.field2019 = 1;
        }
        byte var29 = 0;
        class248.field4126[var29] = var14;
        int var33 = var29 + 1;
        class274.field4721[var29] = var17;
        int var30;
        int var31 = var30 = class50.field769[var14][var17];
        while (arg0 != var14 || arg4 != var17) {
            if (var30 != var31) {
                var30 = var31;
                class248.field4126[var33] = var14;
                class274.field4721[var33++] = var17;
            }
            if ((var31 & 0x1) != 0) {
                var17++;
            } else if ((var31 & 0x4) != 0) {
                var17--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class50.field769[var14][var17];
        }
        if (var33 > 0) {
            class191.method1403((byte) -30, arg11, var33);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
