import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class187 extends class232 {

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    private int field2970 = 4096;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    private int field2973 = 4096;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    private int field2966 = 4096;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field2977 = new String[] { method1756(method1755(".%5@9")), method1756(method1755("gl")), method1756(method1755("k\u000bVU")), method1756(method1755(".%5E9")), method1756(method1755("%9wm")), method1756(method1755(".%5D9")), method1756(method1755("0b5/l")), method1756(method1755(".%5C9")), method1756(method1755(".%5G9")) };

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "[I")
    public static int[] field2967 = null;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "J")
    public static long field2974;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field2971;
            if (arg0 != -3093) {
                this.field2970 = -12;
            }
            int[][] var3 = super.field3599.method1580(arg1, (byte) -73);
            if (super.field3599.field2743) {
                int[][] var4 = this.method2023((byte) 122, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class449.field6969; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && var13 == var14) {
                        var8[var11] = this.field2970 * var12 >> 12;
                        var9[var11] = this.field2966 * var13 >> 12;
                        var10[var11] = this.field2973 * var14 >> 12;
                    } else {
                        var8[var11] = this.field2970;
                        var9[var11] = this.field2966;
                        var10[var11] = this.field2973;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field2977[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1752(int arg0, long arg1) {
        try {
            ++field2968;
            class640.field9166.setTime(new Date(arg1));
            int var3 = class640.field9166.get(7);
            int var4 = class640.field9166.get(5);
            if (arg0 < 121) {
                method1754(-72);
            }
            int var5 = class640.field9166.get(2);
            int var6 = class640.field9166.get(1);
            int var7 = class640.field9166.get(11);
            int var8 = class640.field9166.get(12);
            int var9 = class640.field9166.get(13);
            return class658.field9409[var3 + -1] + field2977[1] + var4 / 10 + var4 % 10 + "-" + class53.field646[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field2977[2];
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field2977[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)I")
    public static final int method1753(byte arg0) {
        try {
            int var1 = 21 % ((arg0 - 50) / 55);
            ++field2972;
            return class42.field477;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2977[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field2969;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field2973 = arg1.method1687((byte) -100);
                    }
                } else {
                    this.field2966 = arg1.method1687((byte) -122);
                }
            } else {
                this.field2970 = arg1.method1687((byte) -69);
            }
            if (arg0 < 96) {
                field2974 = 52L;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2977[5] + arg0 + ',' + (arg1 != null ? field2977[6] : field2977[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public static void method1754(int arg0) {
        try {
            field2967 = null;
            if (arg0 <= 49) {
                field2975 = -30;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2977[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1755(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1756(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
