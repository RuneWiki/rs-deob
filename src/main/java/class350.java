import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public abstract class class350 extends class693 {

    @OriginalMember(owner = "client!pba", name = "A", descriptor = "S")
    public short field5668;

    @OriginalMember(owner = "client!pba", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field5669 = new String[] { method2917(method2916("r\u0005\\\u001e$")), method2917(method2916("g^\u001e\\")), method2917(method2916("yI\u0013\u001e\u001c!")), method2917(method2916("yI\u0013\u001ee`E\u001bDg!")), method2917(method2916("yI\u0013\u001e\u001a!")), method2917(method2916("yI\u0013\u001e\u001d!")), method2917(method2916("yI\u0013\u001e\u0018!")), method2917(method2916("yI\u0013\u001e\u001b!")) };

    @OriginalMember(owner = "client!pba", name = "C", descriptor = "[[I")
    public static int[][] field5666 = new int[6][];

    @OriginalMember(owner = "client!pba", name = "I", descriptor = "[I")
    public static int[] field5665 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!pba", name = "B", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!pba", name = "E", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!pba", name = "F", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!pba", name = "H", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!pba", name = "G", descriptor = "Leg;")
    public static class114 field5661;

    @OriginalMember(owner = "client!pba", name = "D", descriptor = "[[S")
    public static short[][] field5667;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "([Lih;Z)I", line = 6)
    public final int method1739(class731[] arg0, boolean arg1) {
        try {
            ++field5664;
            int var3 = super.field9985 >> class165.field2688;
            int var4 = super.field9983 >> class165.field2688;
            int var5 = 0;
            if (class54.field689 == var3) {
                ++var5;
            } else if (var3 > class54.field689) {
                var5 += 2;
            }
            if (arg1) {
                return 37;
            } else {
                if (~class316.field5137 != ~var4) {
                    if (~var4 > ~class316.field5137) {
                        var5 += 6;
                    }
                } else {
                    var5 += 3;
                }
                int var6 = class554.field8107[var5];
                if ((var6 & this.field5668) != 0) {
                    return this.method5034(true, arg0, var3, var4);
                } else if (~this.field5668 == -2 && var3 > 0) {
                    return this.method5034(true, arg0, var3 + -1, var4);
                } else if (~this.field5668 == -5 && var3 <= class150.field2096) {
                    return this.method5034(true, arg0, var3 + 1, var4);
                } else if (this.field5668 == 8 && var4 > 0) {
                    return this.method5034(true, arg0, var3, var4 - 1);
                } else if (~this.field5668 == -3 && var4 <= class117.field1705) {
                    return this.method5034(true, arg0, var3, var4 + 1);
                } else if (this.field5668 == 16 && ~var3 < -1 && ~class117.field1705 <= ~var4) {
                    return this.method5034(true, arg0, var3 - 1, var4 + 1);
                } else if (this.field5668 == 32 && var3 <= class150.field2096 && class117.field1705 >= var4) {
                    return this.method5034(!arg1, arg0, var3 - -1, var4 + 1);
                } else if (~this.field5668 == -129 && var3 > 0 && var4 > 0) {
                    return this.method5034(true, arg0, var3 + -1, var4 + -1);
                } else if (this.field5668 == 64 && var3 <= class150.field2096 && ~var4 < -1) {
                    return this.method5034(true, arg0, var3 - -1, var4 + -1);
                } else {
                    throw new RuntimeException("");
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5669[5] + (arg0 != null ? field5669[0] : field5669[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "(B)V", line = 90)
    public static final void method2914(byte arg0) {
        try {
            if (arg0 >= -33) {
                method2914((byte) -43);
            }
            class363.field5940.method298(5);
            ++field5658;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5669[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "(I)V", line = 102)
    public static void method2915(int arg0) {
        try {
            field5667 = null;
            field5665 = null;
            if (arg0 >= 83) {
                field5666 = null;
                field5661 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5669[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)Z", line = 120)
    public final boolean method1737(int arg0) {
        try {
            ++field5660;
            if (arg0 > -19) {
                field5666 = null;
            }
            return class441.field6890[(super.field9985 >> class165.field2688) + -class54.field689 + class297.field4835][(super.field9983 >> class165.field2688) - class316.field5137 + class297.field4835];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5669[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(ILha;)Z", line = 141)
    public final boolean method1738(int arg0, class63 arg1) {
        try {
            if (arg0 != 1) {
                return true;
            } else {
                ++field5662;
                return class502.method3786(super.field9985 >> class165.field2688, super.field9974, super.field9983 >> class165.field2688, arg0 ^ -112, this);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5669[2] + arg0 + ',' + (arg1 != null ? field5669[0] : field5669[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IIIIII)V", line = 152)
    public class350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            super.field9975 = (byte) arg3;
            this.field5668 = (short) arg5;
            super.field9972 = arg1;
            super.field9985 = arg0;
            super.field9974 = (byte) arg4;
            super.field9983 = arg2;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5669[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2916(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 89);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2917(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
