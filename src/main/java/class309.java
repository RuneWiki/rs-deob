import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class309 extends class518 {

    @OriginalMember(owner = "client!maa", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field4267 = new String[] { method2465(method2464("K\u001c4o7\u000e")), method2465(method2464("K\u001c4o1\u000e")), method2465(method2464("K\u001c4o3\u000e")), method2465(method2464("K\u001c4o2\u000e")), method2465(method2464("H\b9-")), method2465(method2464("]S{o\b")), method2465(method2464("K\u001c4o6\u000e")), method2465(method2464("K\u001c4o0\u000e")), method2465(method2464("K\u001c4o4\u000e")) };

    @OriginalMember(owner = "client!maa", name = "N", descriptor = "Z")
    public static boolean field4258 = false;

    @OriginalMember(owner = "client!maa", name = "F", descriptor = "Lsb;")
    public static class261 field4257 = new class261(2, 12);

    @OriginalMember(owner = "client!maa", name = "J", descriptor = "[I")
    public static int[] field4265 = new int[128];

    @OriginalMember(owner = "client!maa", name = "B", descriptor = "Lsb;")
    public static class261 field4266;

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!maa", name = "G", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!maa", name = "M", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!maa", name = "C", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!maa", name = "E", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!maa", name = "L", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!maa", name = "H", descriptor = "J")
    public static long field4263;

    static {
        for (int var0 = 0; ~field4265.length < ~var0; ++var0) {
            field4265[var0] = -1;
        }
        for (int var1 = 65; ~var1 >= -91; ++var1) {
            field4265[var1] = var1 + -65;
        }
        for (int var2 = 97; ~var2 >= -123; ++var2) {
            field4265[var2] = var2 + -71;
        }
        for (int var3 = 48; var3 <= 57; ++var3) {
            field4265[var3] = var3 + 52 - 48;
        }
        field4265[42] = field4265[43] = 62;
        field4265[45] = field4265[47] = 63;
        field4266 = new class261(133, 10);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V", line = 5)
    public class309() {
        super(1, false);
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field4256;
            int var3 = 95 / ((arg1 - -57) / 55);
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                for (int var5 = 0; var5 < class110.field1436; ++var5) {
                    this.method2461(127, var5, arg0);
                    int[] var6 = this.method3944(class447.field6568, 0, (byte) 73);
                    var4[var5] = var6[class483.field7102];
                }
            }
            return var4;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4267[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "(I)I", line = 43)
    public static final int method2460(int arg0) {
        try {
            ++field4264;
            if ((double) class534.field7740 == 3.0D) {
                return 37;
            } else if ((double) class534.field7740 == 4.0D) {
                return 50;
            } else if ((double) class534.field7740 == 6.0D) {
                return 75;
            } else {
                if (arg0 >= -125) {
                    field4266 = null;
                }
                return (double) class534.field7740 == 8.0D ? 100 : 200;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4267[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(III)V", line = 70)
    private final void method2461(int arg0, int arg1, int arg2) {
        try {
            if (arg0 <= 126) {
                method2460(-125);
            }
            ++field4260;
            int var4 = class393.field5718[arg1];
            int var5 = class568.field8263[arg2];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class483.field7102 = arg1;
                class447.field6568 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class447.field6568 = arg1;
                class483.field7102 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class447.field6568 = arg1;
                class483.field7102 = -arg2 + class110.field1436;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class447.field6568 = -arg2 + class606.field8689;
                class483.field7102 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class447.field6568 = -arg2 + class606.field8689;
                class483.field7102 = -arg1 + class110.field1436;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class483.field7102 = -arg2 + class110.field1436;
                class447.field6568 = class606.field8689 - arg1;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class447.field6568 = class606.field8689 - arg1;
                class483.field7102 = arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class483.field7102 = -arg1 + class110.field1436;
                class447.field6568 = arg2;
            }
            class483.field7102 &= class247.field3543;
            class447.field6568 &= class478.field7048;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4267[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "(I)V", line = 145)
    public static void method2462(int arg0) {
        try {
            field4266 = null;
            field4265 = null;
            if (arg0 <= 103) {
                method2463(-68);
            }
            field4257 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4267[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "(I)V", line = 164)
    public static final void method2463(int arg0) {
        try {
            ++field4261;
            if (arg0 <= ~class648.field9208) {
                class451.field6612.method4681(2, class451.field6612.field9123, (byte) -111);
            } else {
                class451.field6612.method4681(4, class451.field6612.field9123, (byte) -111);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4267[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILjc;I)V", line = 185)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field4262;
            if (~arg0 == -1) {
                super.field7565 = arg1.method5128(arg2 ^ -3) == 1;
            }
            if (arg2 != -3) {
                method2460(32);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4267[6] + arg0 + ',' + (arg1 != null ? field4267[5] : field4267[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)[[I", line = 199)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field4259;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (arg0 != 0) {
                this.method349(31, -26);
            }
            if (super.field7575.field3416) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class110.field1436; ++var7) {
                    this.method2461(127, var7, arg1);
                    int[][] var8 = this.method3943(0, class447.field6568, -23583);
                    var4[var7] = var8[0][class483.field7102];
                    var5[var7] = var8[1][class483.field7102];
                    var6[var7] = var8[2][class483.field7102];
                }
            }
            return var3;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4267[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2464(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 117);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2465(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
