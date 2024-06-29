import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class222 extends class232 {

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    private int field3492 = 20;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field3493 = 0;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    private int field3494 = 1365;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    private int field3495 = 0;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field3496 = new String[] { method1959(method1958("2mX-d")), method1959(method1958("(y\u001a\u0000")), method1959(method1958("=\"XB1")), method1959(method1958("2mX)d")), method1959(method1958("2mX d")) };

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "Z")
    public static boolean field3488 = false;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field3490 = -1;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "[I")
    public static int[] field3487 = new int[5];

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 16)
    public static void method1957(byte arg0) {
        try {
            field3487 = null;
            int var1 = 1 % ((arg0 - -26) / 49);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3496[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 92)
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I", line = 34)
    public final int[] method66(int arg0, byte arg1) {
        try {
            if (arg1 != 123) {
                this.method66(125, (byte) 124);
            }
            ++field3491;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                for (int var4 = 0; class449.field6969 > var4; ++var4) {
                    int var5 = (class788.field11518[var4] << 12) / this.field3494 + this.field3495;
                    int var6 = (class100.field1467[arg0] << 12) / this.field3494 + this.field3493;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 + var12 < 16384 && ~var13 > ~this.field3492) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var7 + var11 + -var12;
                        ++var13;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = this.field3492 + -1 <= var13 ? 0 : (var13 << 12) / this.field3492;
                }
            }
            return var3;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field3496[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILwq;I)V", line = 95)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field3493 = arg1.method1687((byte) -77);
                        }
                    } else {
                        this.field3495 = arg1.method1687((byte) -79);
                    }
                } else {
                    this.field3492 = arg1.method1687((byte) -103);
                }
            } else {
                this.field3494 = arg1.method1687((byte) -69);
            }
            ++field3489;
            if (arg0 < 96) {
                method1957((byte) 80);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3496[3] + arg0 + ',' + (arg1 != null ? field3496[2] : field3496[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1958(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1959(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
