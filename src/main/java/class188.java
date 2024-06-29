import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class188 extends class211 {

    @OriginalMember(owner = "client!dca", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field2580 = new String[] { method1634(method1633(",';2:`")), method1634(method1633(",';29`")), method1634(method1633(",';2<`")), method1634(method1633("3jt2\u0005")), method1634(method1633("&16p")), method1634(method1633(",';2;`")), method1634(method1633(",';21`")) };

    @OriginalMember(owner = "client!dca", name = "E", descriptor = "[B")
    public static byte[] field2579 = new byte[2048];

    @OriginalMember(owner = "client!dca", name = "D", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!dca", name = "C", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!dca", name = "G", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!dca", name = "F", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "()V", line = 4)
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field2576;
            if (arg0 != 8217) {
                field2579 = null;
            }
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                for (int var4 = 0; ~class343.field5332 < ~var4; ++var4) {
                    this.method1630(false, var4, arg1);
                    int[] var5 = this.method1856(0, class770.field11163, arg0 + -8106);
                    var3[var4] = var5[class70.field757];
                }
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field2580[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)[[I", line = 43)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field2578;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (arg1 >= -38) {
                field2579 = null;
            }
            if (super.field3230.field10931) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class343.field5332 < ~var7; ++var7) {
                    this.method1630(false, var7, arg0);
                    int[][] var8 = this.method1853(0, 0, class770.field11163);
                    var4[var7] = var8[0][class70.field757];
                    var5[var7] = var8[1][class70.field757];
                    var6[var7] = var8[2][class70.field757];
                }
            }
            return var3;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field2580[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BILib;)V", line = 86)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 == 0) {
                super.field3235 = ~arg2.method1455((byte) 62) == -2;
            }
            if (arg0 >= 67) {
                ++field2575;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2580[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2580[3] : field2580[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZII)V", line = 101)
    private final void method1630(boolean arg0, int arg1, int arg2) {
        try {
            ++field2577;
            int var4 = class88.field997[arg1];
            if (!arg0) {
                int var5 = class302.field4735[arg2];
                float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
                if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                    class70.field757 = arg1;
                    class770.field11163 = arg2;
                } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                    class70.field757 = arg2;
                    class770.field11163 = arg1;
                } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                    class70.field757 = -arg2 + class343.field5332;
                    class770.field11163 = arg1;
                } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                    class70.field757 = arg1;
                    class770.field11163 = -arg2 + class463.field6744;
                } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                    class70.field757 = -arg1 + class343.field5332;
                    class770.field11163 = -arg2 + class463.field6744;
                } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                    class70.field757 = class343.field5332 - arg2;
                    class770.field11163 = -arg1 + class463.field6744;
                } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                    class770.field11163 = -arg1 + class463.field6744;
                    class70.field757 = arg2;
                } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                    class70.field757 = -arg1 + class343.field5332;
                    class770.field11163 = arg2;
                }
                class70.field757 &= class3.field28;
                class770.field11163 &= class484.field6992;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2580[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V", line = 176)
    public static void method1631(int arg0) {
        try {
            field2579 = null;
            if (arg0 != 7365) {
                field2579 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2580[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lr;III[Z)V", line = 190)
    public static final void method1632(class194 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class555.field8261 != class195.field2617) {
            int var5 = class184.field2541[arg1].method2404((byte) 123, arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class294 var7 = class184.field2541[var6];
                    if (var7 != null) {
                        var7.method1514(arg0, arg2, var5 - var7.method2404((byte) 119, arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1633(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 120);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1634(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
