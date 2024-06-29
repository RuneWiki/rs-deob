import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class183 extends class518 {

    @OriginalMember(owner = "client!uea", name = "F", descriptor = "I")
    private int field2365 = 1024;

    @OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
    private int field2370 = 3072;

    @OriginalMember(owner = "client!uea", name = "J", descriptor = "I")
    private int field2364 = 2048;

    @OriginalMember(owner = "client!uea", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field2372 = new String[] { method1516(method1515("IEk\u000e#\u0014")), method1516(method1515("IEk\u000e%\u0014")), method1516(method1515("G\u000e$\u000e\u0019")), method1516(method1515("RUfL")), method1516(method1515("IEk\u000e'\u0014")), method1516(method1515("IEk\u000e.\u0014")) };

    @OriginalMember(owner = "client!uea", name = "D", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!uea", name = "E", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!uea", name = "I", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field2368;
            if (arg0 != 0) {
                this.method14(-25, 107);
            }
            int[][] var3 = super.field7575.method1955(arg1, arg0 + -2);
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, arg1, arg0 ^ -23583);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class110.field1436; ++var11) {
                    var8[var11] = (var5[var11] * this.field2364 >> 12) + this.field2365;
                    var9[var11] = this.field2365 - -(var6[var11] * this.field2364 >> 12);
                    var10[var11] = this.field2365 - -(var7[var11] * this.field2364 >> 12);
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field2372[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)[I", line = 50)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field2367;
            int[] var3 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[] var4 = this.method3944(arg0, 0, (byte) 73);
                for (int var5 = 0; var5 < class110.field1436; ++var5) {
                    var3[var5] = (var4[var5] * this.field2364 >> 12) + this.field2365;
                }
            }
            int var6 = -95 % ((-57 - arg1) / 55);
            return var3;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2372[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V", line = 130)
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILjc;I)V", line = 87)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field2366;
            if (arg2 != -3) {
                this.field2365 = -119;
            }
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        super.field7565 = ~arg1.method5128(0) == -2;
                    }
                } else {
                    this.field2370 = arg1.method5116((byte) -106);
                }
            } else {
                this.field2365 = arg1.method5116((byte) -115);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2372[4] + arg0 + ',' + (arg1 != null ? field2372[2] : field2372[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V", line = 133)
    public final void method12(int arg0) {
        try {
            this.field2364 = -this.field2365 + this.field2370;
            ++field2369;
            if (arg0 <= 38) {
                this.method14(-107, 97);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2372[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1515(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 100);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1516(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
