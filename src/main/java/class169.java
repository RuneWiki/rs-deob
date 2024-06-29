import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class169 extends class232 {

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field2731 = new String[] { method1576(method1575(";iQ4+")), method1576(method1575("56QV~")), method1576(method1575(" m\u0013\u0014")), method1576(method1575(";iQ9+")), method1576(method1575(";iQ>+")), method1576(method1575(";iQ2+")), method1576(method1575(";iQ3+")), method1576(method1575(";iQ<+")) };

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
    public static int field2725 = 104;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V", line = 3)
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method1570(byte arg0, int arg1) {
        try {
            if (arg0 != -103) {
                method1572((class176) null, true);
            }
            ++field2727;
            class551 var2 = class380.method3113(-121, (long) arg1, 12);
            var2.method4089(63);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2731[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)I", line = 23)
    private final int method1571(int arg0, byte arg1, int arg2) {
        try {
            ++field2728;
            int var4 = -107 / ((arg1 - -92) / 32);
            int var5 = arg2 * 57 + arg0;
            int var6 = var5 << 1 ^ var5;
            return -((Integer.MAX_VALUE & (var6 * var6 * 15731 + 789221) * var6 + 1376312589) / 262144) + 4096;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2731[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)[I", line = 37)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field2730;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                method1574(-3);
            }
            if (super.field3601.field6907) {
                int var4 = class100.field1467[arg0];
                for (int var5 = 0; ~var5 > ~class449.field6969; ++var5) {
                    var3[var5] = this.method1571(class788.field11518[var5], (byte) -39, var4) % 4096;
                }
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2731[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lwq;Z)Lmja;", line = 70)
    public static final class443 method1572(class176 arg0, boolean arg1) {
        try {
            ++field2726;
            if (arg1) {
                method1570((byte) 61, 38);
            }
            class282 var2 = class670.method4858(arg0, 0);
            int var3 = arg0.method1657(83);
            return new class443(var2.field1875, var2.field1865, var2.field1872, var2.field1874, var2.field1869, var2.field1862, var2.field1859, var2.field1877, var2.field1870, var2.field4587, var2.field4580, var2.field4585, var2.field4584, var2.field4581, var2.field4586, var3);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2731[3] + (arg0 != null ? field2731[1] : field2731[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBII)V", line = 87)
    public static final void method1573(int arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field2729;
            int var4 = 20 / ((arg1 - -14) / 61);
            int var7 = arg3 * class623.field8996.field6395.method4796(true) >> 8;
            if (~arg2 == 0 && !class127.field1835) {
                class290.method2444((byte) 96);
            } else if (~arg2 != 0 && (~class588.field8526 != ~arg2 || !class453.method3515(-1)) && ~var7 != -1 && !class127.field1835) {
                class333.method2812(false, 0, arg0, class747.field11028, -2, var7, arg2);
                class201.method1831((byte) -113);
            }
            if (~class588.field8526 != ~arg2) {
                class391.field6242 = null;
            }
            class588.field8526 = arg2;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2731[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V", line = 119)
    public static final void method1574(int arg0) {
        try {
            ++field2724;
            if (class592.method4342(false, class315.field5127)) {
                class311.method2673(false, false);
            } else {
                class180.field2881 = class185.field2948.field2644;
                class185.field2948.field2644 = null;
                if (arg0 == -23049) {
                    class302.method2598(14, arg0 + 23046);
                }
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2731[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1575(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1576(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
