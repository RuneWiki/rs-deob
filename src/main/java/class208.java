import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class208 extends class518 {

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    private int field3029 = 2048;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    private int field3035 = 0;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    private int field3032 = 0;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    private int field3030 = 4096;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    private int field3034 = 12288;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    private int field3037 = 8192;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    private int field3031 = 2048;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field3039 = new String[] { method1770(method1769("C^\u0002 _")), method1770(method1769("C^\u0002\"_")), method1770(method1769("C^\u0002%_")), method1770(method1769("C^\u0002#_")), method1770(method1769("C^\u0002-_")), method1770(method1769("C^\u0002$_")), method1770(method1769("KC@\u000b")), method1770(method1769("^\u0018\u0002I\n")) };

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "Llf;")
    public static class260 field3033 = new class260(7, 7);

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field3025;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = 65 / ((arg1 - -57) / 55);
            if (super.field7564.field8652) {
                int var5 = class568.field8263[arg0] + -2048;
                for (int var6 = 0; ~var6 > ~class110.field1436; ++var6) {
                    int var7 = class393.field5718[var6] + -2048;
                    int var8 = this.field3031 + var7;
                    int var9 = ~var8 > 2047 ? var8 + 4096 : var8;
                    int var10 = var9 > 2048 ? var9 + -4096 : var9;
                    int var11 = this.field3035 + var5;
                    int var12 = var11 >= -2048 ? var11 : var11 + 4096;
                    int var13 = var12 <= 2048 ? var12 : var12 - 4096;
                    int var14 = this.field3032 + var7;
                    int var15 = ~var14 <= 2047 ? var14 : var14 - -4096;
                    int var16 = ~var15 < -2049 ? var15 + -4096 : var15;
                    int var17 = this.field3029 + var5;
                    int var18 = ~var17 <= 2047 ? var17 : var17 - -4096;
                    int var19 = var18 <= 2048 ? var18 : var18 + -4096;
                    var3[var6] = !this.method1766(var13, (byte) -94, var10) && !this.method1768(var19, var16, true) ? 0 : 4096;
                }
            }
            return var3;
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field3039[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)Z")
    private final boolean method1766(int arg0, byte arg1, int arg2) {
        try {
            ++field3026;
            if (arg1 > -37) {
                return true;
            } else {
                int var4 = (-arg2 + arg0) * this.field3034 >> 12;
                int var5 = class412.field5931[(var4 * 255 & 1047307) >> 12];
                int var6 = (var5 << 12) / this.field3034;
                int var7 = (var6 << 12) / this.field3037;
                int var8 = this.field3030 * var7 >> 12;
                return ~(arg0 + arg2) > ~var8 && ~(arg0 + arg2) < ~(-var8);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3039[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
    public static void method1767(int arg0) {
        try {
            field3033 = null;
            if (arg0 != 2048) {
                field3033 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3039[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field3037 = arg1.method5116((byte) -116);
                                    }
                                } else {
                                    this.field3030 = arg1.method5116((byte) -112);
                                }
                            } else {
                                this.field3034 = arg1.method5116((byte) -123);
                            }
                        } else {
                            this.field3029 = arg1.method5116((byte) -126);
                        }
                    } else {
                        this.field3032 = arg1.method5116((byte) -108);
                    }
                } else {
                    this.field3035 = arg1.method5116((byte) -123);
                }
            } else {
                this.field3031 = arg1.method5116((byte) -121);
            }
            if (arg2 != -3) {
                this.field3034 = 44;
            }
            ++field3036;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3039[5] + arg0 + ',' + (arg1 != null ? field3039[7] : field3039[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZ)Z")
    private final boolean method1768(int arg0, int arg1, boolean arg2) {
        try {
            ++field3028;
            int var4 = (arg0 + arg1) * this.field3034 >> 12;
            int var5 = class412.field5931[255 & var4 * 255 >> 12];
            if (!arg2) {
                return false;
            } else {
                int var6 = (var5 << 12) / this.field3034;
                int var7 = (var6 << 12) / this.field3037;
                int var8 = this.field3030 * var7 >> 12;
                return ~(-arg1 + arg0) > ~var8 && ~(-var8) > ~(arg0 - arg1);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3039[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public final void method12(int arg0) {
        try {
            ++field3027;
            if (arg0 > 38) {
                class119.method1079(1);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3039[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1769(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 119);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1770(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
