import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class690 {

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9960 = new String[] { method5024(method5023("T.V")), method5024(method5023("O0\u0016xY")), method5024(method5023("O0\u0016}Y")), method5024(method5023("Xi\u0016\u0017\f")), method5024(method5023("M2TU")), method5024(method5023("O0\u0016zY")) };

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field9954 = 0;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public int field9951;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public int field9952;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field9957;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public int field9958;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "[Lvu;")
    public static class356[] field9953;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([J[IB)V", line = 3)
    public static final void method5019(long[] arg0, int[] arg1, byte arg2) {
        try {
            if (arg2 != -121) {
                method5020(null, true, null, -101, (byte) 48);
            }
            field9959++;
            class441.method3454(29529, 0, arg0, arg1, arg0.length - 1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9960[5] + (arg0 == null ? field9960[4] : field9960[3]) + ',' + (arg1 == null ? field9960[4] : field9960[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lrda;Z[[[BIB)Z", line = 14)
    public static final boolean method5020(class693 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class588.field8527) {
            return false;
        }
        int var5 = arg0.field9985 >> class165.field2688;
        int var6 = var5;
        int var7 = arg0.field9983 >> class165.field2688;
        int var8 = var7;
        if (arg0 instanceof class185) {
            var6 = ((class185) arg0).field2940;
            var8 = ((class185) arg0).field2939;
            var5 = ((class185) arg0).field2945;
            var7 = ((class185) arg0).field2946;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field9974 < class612.field8806 && var9 >= class588.field8521 && var9 < class83.field1266 && var10 >= class764.field11207 && var10 < class490.field7385) {
                    if ((arg2 == null || arg0.field9975 < arg3 || arg2[arg0.field9975][var9][var10] != arg4) && arg0.method1737(-56) && !arg0.method1738(1, class120.field1734)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class54.field689 - 16 && var9 <= class54.field689 + 16 && var10 >= class316.field5137 - 16 && var10 <= class316.field5137 + 16) {
                        if (class9.field103) {
                            class764.field11209[class234.field3618++].method1589(arg0, (byte) 126);
                            class234.field3618 %= class582.field8380;
                        } else {
                            arg0.method40((byte) -108, class120.field1734);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 81)
    public static void method5021(int arg0) {
        try {
            if (arg0 == -1) {
                field9953 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9960[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I", line = 91)
    public static final int method5022(int arg0) {
        try {
            field9957++;
            if (arg0 != -513) {
                return 69;
            }
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (class393.field6256.field806 && !class393.field6256.field808) {
                var1 = true;
                if (class372.field6038.field11008 < 512 && class372.field6038.field11008 != 0) {
                    var1 = false;
                }
                if (class61.field790.startsWith(field9960[0])) {
                    var2 = true;
                    var3 = true;
                } else {
                    var2 = true;
                }
            }
            if (class281.field4574) {
                var2 = false;
            }
            if (class328.field5386) {
                var3 = false;
            }
            if (class72.field1013) {
                var1 = false;
            }
            if (!var1 && !var2 && !var3) {
                return class389.method3168((byte) 78);
            }
            int var4 = -1;
            int var5 = -1;
            int var6 = -1;
            if (var1) {
                try {
                    var4 = class496.method3746(1000, (byte) 96, 2);
                } catch (Exception var16) {
                }
            }
            if (var3) {
                try {
                    var6 = class496.method3746(1000, (byte) 100, 3);
                    if (class623.field8996.field6379.method4132(true) == 3) {
                        class734 var7 = class662.field9437.method240();
                        long var8 = var7.field10766 & 0xFFFFFFFFFFFFL;
                        int var10 = var7.field10763;
                        if (var10 == 4318) {
                            var2 &= var8 >= 64425238954L;
                        } else if (var10 == 4098) {
                            var2 &= var8 >= 60129613779L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var2) {
                try {
                    var5 = class496.method3746(1000, (byte) 114, 1);
                } catch (Exception var14) {
                }
            }
            if (var4 == -1 && var5 == -1 && var6 == -1) {
                return class389.method3168((byte) 78);
            }
            int var11 = (int) ((float) var6 * 1.1F);
            int var12 = (int) ((float) var5 * 1.1F);
            if (var4 > var11 && var12 < var4) {
                return class18.method125(var4, (byte) 25);
            } else if (var11 <= var12) {
                return class210.method1903(var12, 1, -118);
            } else {
                return class210.method1903(var11, 3, -83);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field9960[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5023(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5024(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
