import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class436 {

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6422 = new String[] { method3404(method3403("Wl\u0013}")), method3404(method3403("B7Q?2")), method3404(method3403("\\\u007f\u001e?\u000e\u0011")), method3404(method3403("\\\u007f\u001e?\r\u0011")), method3404(method3403("\\\u007f\u001e?\f\u0011")) };

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZB)I")
    public static final int method3400(boolean arg0, byte arg1) {
        try {
            field6421++;
            int var2 = 9 / ((arg1 - 31) / 39);
            int var3 = class101.field1360;
            if (var3 == 0) {
                return arg0 ? 0 : class615.field8779;
            } else if (var3 == 1) {
                return class615.field8779;
            } else if (var3 == 2) {
                return 0;
            } else {
                return 0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6422[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field6420++;
            if (arg0 == 0) {
                if (arg5 == arg7) {
                    class74.method765(arg5, arg1, 124, arg4, arg6, arg3, arg2);
                } else if (class335.field4844 <= arg2 - arg5 && class507.field7453 >= (arg2 + arg5) && class557.field8113 <= (arg1 - arg7) && arg1 + arg7 <= class50.field717) {
                    class302.method2427(arg1, arg4, arg3, arg5, arg2, arg7, arg0 ^ 0x7981A901, arg6);
                } else {
                    class789.method5680(arg1, arg5, arg3, arg7, arg0 + 77, arg2, arg6, arg4);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field6422[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)V")
    public static final void method3402(int arg0, String arg1, boolean arg2, String arg3, int arg4) {
        try {
            field6419++;
            class274 var5 = class625.method4586((byte) 74);
            var5.field3885.method5114(255, class414.field5956.field5193);
            var5.field3885.method5138((byte) -101, 0);
            int var6 = var5.field3885.field9945;
            var5.field3885.method5138((byte) -107, 658);
            int[] var7 = class236.method1951(4, var5);
            int var8 = var5.field3885.field9945;
            var5.field3885.method5089(arg1, (byte) -118);
            var5.field3885.method5138((byte) -117, class713.field10069);
            var5.field3885.method5089(arg3, (byte) 109);
            var5.field3885.method5083((byte) 115, class791.field11509);
            var5.field3885.method5114(255, class405.field5883);
            var5.field3885.method5114(255, class544.field7978.field11572);
            class619.method4553(var5.field3885, arg0 ^ 0xFE);
            String var9 = class799.field11615;
            var5.field3885.method5114(255, var9 == null ? 0 : 1);
            if (var9 != null) {
                var5.field3885.method5089(var9, (byte) 63);
            }
            var5.field3885.method5114(255, arg4);
            var5.field3885.method5114(255, arg2 ? 1 : 0);
            var5.field3885.field9945 += 7;
            var5.field3885.method5100(var8, var7, var5.field3885.field9945, 8);
            var5.field3885.method5091(var5.field3885.field9945 - var6, false);
            class60.field911.method5608(var5, arg0 ^ 0x74AA);
            class189.field2516 = arg0;
            class121.field1533 = -3;
            class399.field5822 = 0;
            class723.field10286 = 0;
            if (arg4 < 13) {
                class10.field133 = true;
                class337.method2709((byte) -71);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field6422[2] + arg0 + ',' + (arg1 == null ? field6422[0] : field6422[1]) + ',' + arg2 + ',' + (arg3 == null ? field6422[0] : field6422[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3403(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3404(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
