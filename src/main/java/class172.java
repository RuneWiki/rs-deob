import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class172 extends class518 {

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    private int field2283 = 32768;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field2286 = new String[] { method1455(method1454("o;\u001d\u0007.")), method1455(method1454("xy\u001da{")), method1455(method1454("m\"_#")), method1455(method1454("o;\u001d\u0004.")), method1455(method1454("o;\u001d\b.")), method1455(method1454("o;\u001d\u0005.")), method1455(method1454("o;\u001d\u000e.")), method1455(method1454("o;\u001d\f.")), method1455(method1454("o;\u001d\u0006.")) };

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V", line = 7)
    public static final void method1451(byte arg0, String arg1, String arg2, int arg3) {
        try {
            ++field2285;
            if (arg2.length() <= 320) {
                if (class586.method4335((byte) 121)) {
                    class525.method3991((byte) -111);
                    class337.field4888 = arg1;
                    if (arg0 <= -50) {
                        class304.field4234 = arg2;
                        class139.field1812 = arg3;
                        class699.method5035(6, 31754);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2286[3] + arg0 + ',' + (arg1 != null ? field2286[1] : field2286[2]) + ',' + (arg2 != null ? field2286[1] : field2286[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V", line = 30)
    public static final void method1452(boolean arg0, int arg1) {
        try {
            class341.field4966 = class60.field916;
            class398.field5797 = 2;
            ++field2277;
            class139.field1812 = arg1;
            String var2 = null;
            if (class482.field7094 != null) {
                class711 var3 = new class711(class482.field7094);
                var2 = class626.method4599((byte) -104, var3.method5147((byte) 82));
                class35.field430 = var3.method5147((byte) 117);
            }
            if (var2 == null) {
                class345.method2766((byte) 109, 35);
            } else {
                class157.method1317(true, var2, 0, "", arg0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2286[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 58)
    public final void method12(int arg0) {
        try {
            if (arg0 < 38) {
                this.field2283 = -32;
            }
            ++field2281;
            class119.method1079(1);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2286[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[[I", line = 70)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field2282;
            if (arg0 != 0) {
                this.field2283 = -59;
            }
            int[][] var3 = super.field7575.method1955(arg1, arg0 ^ -2);
            if (super.field7575.field3416) {
                int[] var4 = this.method3944(arg1, 1, (byte) 73);
                int[] var5 = this.method3944(arg1, 2, (byte) 73);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; class110.field1436 > var9; ++var9) {
                    int var10 = (1048485 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field2283 >> 12;
                    int var12 = class412.field5931[var10] * var11 >> 12;
                    int var13 = class129.field1608[var10] * var11 >> 12;
                    int var14 = (var12 >> 12) + var9 & class247.field3543;
                    int var15 = class478.field7048 & (var13 >> 12) + arg1;
                    int[][] var16 = this.method3943(0, var15, arg0 ^ -23583);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field2286[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[BZLml;III)Lgda;", line = 129)
    public static final class268 method1453(int arg0, int arg1, byte[] arg2, boolean arg3, class194 arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg0 != 34037) {
                field2279 = -119;
            }
            ++field2278;
            if (!arg4.field2899 && (!class357.method2858(arg5, false) || !class357.method2858(arg1, false))) {
                return !arg4.field2884 ? new class268(arg4, arg7, arg5, arg1, class788.method5671(1282334120, arg5), class788.method5671(1282334120, arg1), arg2, arg6) : new class268(arg4, 34037, arg7, arg5, arg1, arg3, arg2, arg6);
            } else {
                return new class268(arg4, 3553, arg7, arg5, arg1, arg3, arg2, arg6);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2286[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2286[1] : field2286[2]) + ',' + arg3 + ',' + (arg4 != null ? field2286[1] : field2286[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjc;I)V", line = 148)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field2284;
            if (arg0 != 0) {
                if (arg0 == 1) {
                    super.field7565 = arg1.method5128(arg2 + 3) == 1;
                }
            } else {
                this.field2283 = arg1.method5116((byte) -127) << 4;
            }
            if (arg2 != -3) {
                this.method12(-78);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2286[7] + arg0 + ',' + (arg1 != null ? field2286[1] : field2286[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 183)
    public class172() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[I", line = 188)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field2280;
            int var3 = -124 / ((arg1 - -57) / 55);
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[] var5 = this.method3944(arg0, 1, (byte) 73);
                int[] var6 = this.method3944(arg0, 2, (byte) 73);
                for (int var7 = 0; ~var7 > ~class110.field1436; ++var7) {
                    int var8 = (4081 & var5[var7]) >> 4;
                    int var9 = var6[var7] * this.field2283 >> 12;
                    int var10 = class412.field5931[var8] * var9 >> 12;
                    int var11 = class129.field1608[var8] * var9 >> 12;
                    int var12 = class247.field3543 & (var10 >> 12) + var7;
                    int var13 = class478.field7048 & (var11 >> 12) + arg0;
                    int[] var14 = this.method3944(var13, 0, (byte) 73);
                    var4[var7] = var14[var12];
                }
            }
            return var4;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field2286[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1454(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1455(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
