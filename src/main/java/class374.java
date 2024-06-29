import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class374 extends class211 {

    @OriginalMember(owner = "client!du", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field5710 = new String[] { method3018(method3017("D\u0017['K")), method3018(method3017("D\u0017[%K")), method3018(method3017("D\u0017[#K")), method3018(method3017("D\u0017[ K")), method3018(method3017("N\u0017\u0019\r")), method3018(method3017("[L[O\u001e")), method3018(method3017("D\u0017[$K")), method3018(method3017("D\u0017[&K")) };

    @OriginalMember(owner = "client!du", name = "H", descriptor = "Z")
    public static boolean field5703 = false;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "[[I")
    public static int[][] field5706 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!du", name = "D", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!du", name = "J", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!du", name = "C", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!du", name = "E", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!du", name = "G", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(Z)V", line = 3)
    public static void method3012(boolean arg0) {
        try {
            if (!arg0) {
                method3013(-36);
            }
            field5706 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5710[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)[Lvha;", line = 13)
    public static final class713[] method3013(int arg0) {
        try {
            if (arg0 != 1) {
                return null;
            } else {
                ++field5704;
                return new class713[] { class745.field10834, class535.field7834, class104.field1208, class757.field10991, class458.field6663, class530.field7770, class349.field5393, class494.field7098, class244.field3746, class661.field9560, class47.field540, class387.field5840, class417.field6156, class108.field1258, class559.field8302 };
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5710[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB)I", line = 24)
    private final int method3014(int arg0, int arg1, byte arg2) {
        try {
            int var4 = -68 / ((-41 - arg2) / 45);
            ++field5709;
            int var5 = arg1 * 57 + arg0;
            int var6 = var5 ^ var5 << 1;
            return -((Integer.MAX_VALUE & (var6 * 15731 * var6 + 789221) * var6 + 1376312589) / 262144) + 4096;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5710[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([BI)[B", line = 38)
    public static final byte[] method3015(byte[] arg0, int arg1) {
        try {
            ++field5708;
            class163 var2 = new class163(arg0);
            int var3 = var2.method1455((byte) 62);
            if (arg1 != 1580) {
                field5703 = false;
            }
            int var4 = var2.method1453((byte) 98);
            if (~var4 > -1 || ~class611.field8922 != -1 && class611.field8922 < var4) {
                throw new RuntimeException();
            } else if (~var3 == -1) {
                byte[] var8 = new byte[var4];
                var2.method1413(var8, -16385, var4, 0);
                return var8;
            } else {
                int var5 = var2.method1453((byte) 106);
                if (~var5 > -1 || class611.field8922 != 0 && var5 > class611.field8922) {
                    throw new RuntimeException();
                } else {
                    byte[] var6 = new byte[var5];
                    if (~var3 == -2) {
                        class189.method1642(var6, var5, arg0, var4, 9);
                    } else {
                        class128 var7 = class302.field4732;
                        synchronized (class302.field4732) {
                            class302.field4732.method1116(var6, var2, 41);
                        }
                    }
                    return var6;
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5710[6] + (arg0 != null ? field5710[5] : field5710[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(II)[I", line = 97)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field5707;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int var4 = class302.field4735[arg1];
                for (int var5 = 0; ~class343.field5332 < ~var5; ++var5) {
                    var3[var5] = this.method3014(class88.field997[var5], var4, (byte) -120) % 4096;
                }
            }
            if (arg0 != 8217) {
                method3016(22, (byte) -103, 52);
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5710[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IBI)Z", line = 133)
    public static final boolean method3016(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 != 127) {
                return true;
            } else {
                ++field5705;
                return ~(arg2 & 393216) != -1 | class414.method3211(false, arg2, arg0) || class547.method4125(arg2, arg0, (byte) 127) || class744.method5422(arg1 + -203, arg2, arg0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5710[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V", line = 149)
    public class374() {
        super(0, true);
    }

    @OriginalMember(owner = "client!du", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3017(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 99);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!du", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3018(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
