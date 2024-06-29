import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class82 extends class232 {

    @OriginalMember(owner = "client!dha", name = "M", descriptor = "I")
    private int field1248 = 32768;

    @OriginalMember(owner = "client!dha", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field1255 = new String[] { method844(method843("?zH#\u001bs")), method844(method843("?zH#\u0013s")), method844(method843(" <\u0007#*")), method844(method843("5gEa")), method844(method843("?zH#\u0016s")), method844(method843("?zH#\u0012s")), method844(method843("?zH#\u0014s")), method844(method843("?zH#\u0015s")) };

    @OriginalMember(owner = "client!dha", name = "L", descriptor = "Liha;")
    public static class29 field1252 = new class29(4);

    @OriginalMember(owner = "client!dha", name = "J", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!dha", name = "P", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!dha", name = "Q", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!dha", name = "I", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!dha", name = "O", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!dha", name = "H", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!dha", name = "N", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!dha", name = "K", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!dha", name = "G", descriptor = "Ljava/awt/Frame;")
    public static Frame field1247;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILwq;I)V", line = 7)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field1253;
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    super.field3605 = arg1.method1645((byte) -78) == 1;
                }
            } else {
                this.field1248 = arg1.method1687((byte) -100) << 4;
            }
            if (arg0 <= 96) {
                this.method122(111, -128);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1255[5] + arg0 + ',' + (arg1 != null ? field1255[2] : field1255[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V", line = 42)
    public class82() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)V", line = 46)
    public static void method841(int arg0) {
        try {
            field1247 = null;
            field1252 = null;
            if (arg0 != 766) {
                method842((byte) -52, (class209) null);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1255[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(II)[[I", line = 57)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field1249;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -125);
            if (arg0 != -3093) {
                method841(25);
            }
            if (super.field3599.field2743) {
                int[] var4 = this.method2022(arg1, 1, 0);
                int[] var5 = this.method2022(arg1, 2, 0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class449.field6969; ++var9) {
                    int var10 = (1046625 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field1248 >> 12;
                    int var12 = class266.field4305[var10] * var11 >> 12;
                    int var13 = class305.field4919[var10] * var11 >> 12;
                    int var14 = var9 - -(var12 >> 12) & class250.field3824;
                    int var15 = class315.field5126 & (var13 >> 12) + arg1;
                    int[][] var16 = this.method2023((byte) 119, var15, 0);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field1255[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLrfa;)Z", line = 117)
    public static final boolean method842(byte arg0, class209 arg1) {
        try {
            if (arg0 != -2) {
                return true;
            } else {
                ++field1245;
                if (arg1 == null) {
                    return false;
                } else if (!arg1.field3260) {
                    return false;
                } else if (!arg1.method1884(class770.field11252, false)) {
                    return false;
                } else if (class285.field4613.method737((byte) -39, (long) arg1.field3264) != null) {
                    return false;
                } else {
                    return class497.field7458.method737((byte) -39, (long) arg1.field3274) == null;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1255[4] + arg0 + ',' + (arg1 != null ? field1255[2] : field1255[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V", line = 152)
    public final void method67(byte arg0) {
        try {
            ++field1246;
            int var2 = 92 % ((arg0 - 73) / 34);
            class204.method1843((byte) 92);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1255[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IB)[I", line = 166)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field1251;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                this.method67((byte) -91);
            }
            if (super.field3601.field6907) {
                int[] var4 = this.method2022(arg0, 1, 0);
                int[] var5 = this.method2022(arg0, 2, 0);
                for (int var6 = 0; ~var6 > ~class449.field6969; ++var6) {
                    int var7 = 255 & var4[var6] >> 4;
                    int var8 = var5[var6] * this.field1248 >> 12;
                    int var9 = class266.field4305[var7] * var8 >> 12;
                    int var10 = class305.field4919[var7] * var8 >> 12;
                    int var11 = var6 - -(var9 >> 12) & class250.field3824;
                    int var12 = arg0 - -(var10 >> 12) & class315.field5126;
                    int[] var13 = this.method2022(var12, 0, 0);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field1255[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method843(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 87);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method844(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
