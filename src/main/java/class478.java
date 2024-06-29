import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class478 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILph;)I")
    public static final int method2852(int arg0, class459 arg1) {
        field7056++;
        int var2 = 0;
        if (arg1.method2739(class524.field7621, 99)) {
            var2++;
        }
        if (arg1.method2739(class338.field5086, -127)) {
            var2++;
        }
        if (arg1.method2739(class510.field7438, -30)) {
            var2++;
        }
        if (arg0 != -25227) {
            return 86;
        }
        if (arg1.method2739(class34.field523, -102)) {
            var2++;
        }
        if (arg1.method2739(class13.field246, arg0 ^ 0xFFFF9D19)) {
            var2++;
        }
        if (arg1.method2739(class199.field3245, -75)) {
            var2++;
        }
        if (arg1.method2739(class100.field1929, 65)) {
            var2++;
        }
        if (arg1.method2739(class284.field4281, 119)) {
            var2++;
        }
        if (arg1.method2739(class20.field316, 87)) {
            var2++;
        }
        if (arg1.method2739(class185.field2974, 67)) {
            var2++;
        }
        if (arg1.method2739(class336.field5071, 102)) {
            var2++;
        }
        if (arg1.method2739(class271.field4114, 94)) {
            var2++;
        }
        if (arg1.method2739(class469.field6951, arg0 + 25331)) {
            var2++;
        }
        if (arg1.method2739(class222.field3471, -77)) {
            var2++;
        }
        if (arg1.method2739(class503.field7359, 81)) {
            var2++;
        }
        if (arg1.method2739(class398.field6041, arg0 ^ 0x62FC)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
    public static final void method2853(int arg0, int arg1, int arg2, int arg3) {
        field7057++;
        if (arg3 != 31530) {
            method2852(15, null);
        }
        class22.field333 = new byte[arg1][arg2][arg0];
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIILta;Lza;Lgh;I)V")
    public static final void method2854(int arg0, int arg1, int arg2, int arg3, int arg4, class144 arg5, class288 arg6, class388 arg7, int arg8) {
        field7058++;
        class25 var9 = class309.field4682.method1247(false, arg8);
        if (var9 != null && var9.field386 && var9.method175(-2871, class402.field6080)) {
            if (var9.field371 != null) {
                int[] var10 = new int[var9.field371.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var13;
                    if (class510.field7435 == 4) {
                        var13 = (int) class525.field7631 & 0x3FFF;
                    } else {
                        var13 = (int) class525.field7631 + class1.field49 & 0x3FFF;
                    }
                    int var14 = class407.field6169[var13];
                    int var15 = class407.field6168[var13];
                    if (class510.field7435 != 4) {
                        var14 = var14 * 256 / (class60.field1242 + 256);
                        var15 = var15 * 256 / (class60.field1242 + 256);
                    }
                    var10[var11 * 2] = arg7.field5745 / 2 + ((var9.field371[var11 * 2] * 4 + arg4) * var15 + (var9.field371[var11 * 2 + 1] * 4 + arg0) * var14 >> 15) + arg2;
                    var10[var11 * 2 + 1] = arg7.field5712 / 2 + (arg3 - ((var9.field371[var11 * 2 + 1] * 4 + arg0) * var15 - ((var9.field371[var11 * 2] * 4 + arg4) * var14) >> 15));
                }
                class147.method1092(arg6, var10, var9.field382, arg7.field5800, arg7.field5786);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg6.method320(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field366, 1, arg5, arg2, arg3);
                }
                arg6.method320(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field366, 1, arg5, arg2, arg3);
            }
            class24 var16 = null;
            if (var9.field356 != -1) {
                var16 = var9.method168(false, (byte) -55, arg6);
                if (var16 != null) {
                    class358.method2206(arg7, arg3, arg2, (byte) -54, arg0, arg4, var16, arg5);
                }
            }
            if (var9.field370 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method154();
                }
                class317 var18 = class276.field4179;
                class470 var19 = class264.field4032;
                if (var9.field347 == 1) {
                    var18 = class470.field6980;
                    var19 = class398.field6038;
                }
                if (var9.field347 == 2) {
                    var19 = class272.field4126;
                    var18 = class356.field5232;
                }
                class78.method702(arg0, arg5, var19, arg3, arg4, arg2, var17, (byte) -37, arg7, var9.field344, var18, var9.field370);
            }
        }
        if (arg1 == 23308) {
            ;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
    public static final boolean method2855(int arg0, int arg1, int arg2) {
        int var3 = class486.field7165[arg0][arg1][arg2];
        if (-class374.field5485 == var3) {
            return false;
        } else if (class374.field5485 == var3) {
            return true;
        } else {
            int var4 = arg1 << class353.field5216;
            int var5 = arg2 << class353.field5216;
            if (class356.method2195(var4 + 1, class520.field7560[arg0].method177(arg1, arg2), var5 + 1) && class356.method2195(class19.field312 + var4 - 1, class520.field7560[arg0].method177(arg1 + 1, arg2), var5 + 1) && class356.method2195(class19.field312 + var4 - 1, class520.field7560[arg0].method177(arg1 + 1, arg2 + 1), class19.field312 + var5 - 1) && class356.method2195(var4 + 1, class520.field7560[arg0].method177(arg1, arg2 + 1), class19.field312 + var5 - 1) && class356.method2195(class421.field6346 + var4, class520.field7560[arg0].method177(arg1, arg2), var5 + 1) && class356.method2195(class19.field312 + var4 - 1, class520.field7560[arg0].method177(arg1 + 1, arg2), class421.field6346 + var5) && class356.method2195(class421.field6346 + var4, class520.field7560[arg0].method177(arg1, arg2 + 1), class19.field312 + var5 - 1) && class356.method2195(class19.field312 + var4 - 1, class520.field7560[arg0].method177(arg1, arg2), class421.field6346 + var5) && class356.method2195(class421.field6346 + var4, class520.field7560[arg0].method177(arg1, arg2), class421.field6346 + var5)) {
                class486.field7165[arg0][arg1][arg2] = class374.field5485;
                return true;
            } else {
                class486.field7165[arg0][arg1][arg2] = -class374.field5485;
                return false;
            }
        }
    }
}
