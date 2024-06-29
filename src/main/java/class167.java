import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class167 extends class232 {

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field2710 = new String[] { method1566(method1565("\u0018Out=")), method1566(method1565("\u0018Ou|=")), method1566(method1565("\u0018Our=")), method1566(method1565("\u001cR7\\")), method1566(method1565("\t\tu\u001eh")), method1566(method1565("\u0018Ouu=")), method1566(method1565("\u0018Ouq=")) };

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "Lqr;")
    public static class69 field2705 = new class69(512);

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field2708 = -1;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "F")
    public static float field2707;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILwq;I)V", line = 4)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 <= 96) {
                method1563(-6);
            }
            ++field2704;
            if (~arg2 == -1) {
                super.field3605 = ~arg1.method1645((byte) -80) == -2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2710[5] + arg0 + ',' + (arg1 != null ? field2710[4] : field2710[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V", line = 21)
    public static void method1563(int arg0) {
        try {
            field2705 = null;
            if (arg0 != 0) {
                method1563(79);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2710[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[I", line = 31)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field2702;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                for (int var4 = 0; ~var4 > ~class449.field6969; ++var4) {
                    this.method1564(arg0, (byte) 60, var4);
                    int[] var5 = this.method2022(class176.field2814, 0, 0);
                    var3[var4] = var5[class233.field3614];
                }
            }
            return arg1 != 123 ? null : var3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2710[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[[I", line = 65)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field2706;
            if (arg0 != -3093) {
                this.method1564(-15, (byte) -106, 33);
            }
            int[][] var3 = super.field3599.method1580(arg1, (byte) -85);
            if (super.field3599.field2743) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class449.field6969 < ~var7; ++var7) {
                    this.method1564(arg1, (byte) 60, var7);
                    int[][] var8 = this.method2023((byte) 104, class176.field2814, 0);
                    var4[var7] = var8[0][class233.field3614];
                    var5[var7] = var8[1][class233.field3614];
                    var6[var7] = var8[2][class233.field3614];
                }
            }
            return var3;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2710[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)V", line = 107)
    private final void method1564(int arg0, byte arg1, int arg2) {
        try {
            ++field2703;
            int var4 = class788.field11518[arg2];
            int var5 = class100.field1467[arg0];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class176.field2814 = arg0;
                class233.field3614 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class176.field2814 = arg2;
                class233.field3614 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class233.field3614 = class449.field6969 - arg0;
                class176.field2814 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class176.field2814 = -arg0 + class742.field10920;
                class233.field3614 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class176.field2814 = -arg0 + class742.field10920;
                class233.field3614 = -arg2 + class449.field6969;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class176.field2814 = -arg2 + class742.field10920;
                class233.field3614 = -arg0 + class449.field6969;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class233.field3614 = arg0;
                class176.field2814 = class742.field10920 - arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class176.field2814 = arg0;
                class233.field3614 = -arg2 + class449.field6969;
            }
            class233.field3614 &= class250.field3824;
            if (arg1 == 60) {
                class176.field2814 &= class315.field5126;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2710[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 185)
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1565(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1566(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
