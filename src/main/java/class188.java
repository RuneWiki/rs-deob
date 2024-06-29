import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class188 extends class232 {

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    private int field2978 = 2048;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
    private int field2983 = 3072;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    private int field2979 = 1024;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field2988 = new String[] { method1759(method1758("*\u001dymy")), method1759(method1758("\"By\u0006,")), method1759(method1758("?F;/")), method1759(method1758("\"By\u0001,")), method1759(method1758("\"By\u0000,")), method1759(method1758("\"By\u0002,")), method1759(method1758("\"By\u000f,")) };

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field2980 = -1;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "[I")
    public static int[] field2984;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            this.field2978 = -this.field2979 + this.field2983;
            ++field2986;
            int var2 = 115 / ((73 - arg0) / 34);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2988[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field2985;
            if (arg1 != 123) {
                return null;
            } else {
                int[] var3 = super.field3601.method3467(arg0, (byte) -61);
                if (super.field3601.field6907) {
                    int[] var4 = this.method2022(arg0, 0, 0);
                    for (int var5 = 0; class449.field6969 > var5; ++var5) {
                        var3[var5] = (var4[var5] * this.field2978 >> 12) + this.field2979;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2988[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field3605 = arg1.method1645((byte) -100) == 1;
                    }
                } else {
                    this.field2983 = arg1.method1687((byte) -57);
                }
            } else {
                this.field2979 = arg1.method1687((byte) -68);
            }
            if (arg0 < 96) {
                this.field2983 = 67;
            }
            ++field2982;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2988[1] + arg0 + ',' + (arg1 != null ? field2988[0] : field2988[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)[[I")
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field2981;
            if (arg0 != -3093) {
                return null;
            } else {
                int[][] var3 = super.field3599.method1580(arg1, (byte) -126);
                if (super.field3599.field2743) {
                    int[][] var4 = this.method2023((byte) 101, arg1, 0);
                    int[] var5 = var4[0];
                    int[] var6 = var4[1];
                    int[] var7 = var4[2];
                    int[] var8 = var3[0];
                    int[] var9 = var3[1];
                    int[] var10 = var3[2];
                    for (int var11 = 0; ~var11 > ~class449.field6969; ++var11) {
                        var8[var11] = (var5[var11] * this.field2978 >> 12) + this.field2979;
                        var9[var11] = (var6[var11] * this.field2978 >> 12) + this.field2979;
                        var10[var11] = (var7[var11] * this.field2978 >> 12) + this.field2979;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2988[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
    public static void method1757(int arg0) {
        try {
            if (arg0 != 2) {
                field2984 = null;
            }
            field2984 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2988[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1758(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1759(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
