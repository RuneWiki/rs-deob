import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class608 extends class232 {

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
    private int field8758 = 585;

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field8764 = new String[] { method4441(method4440("c|u\\K")), method4441(method4440("p&u>\u001e")), method4441(method4440("e}7|")), method4441(method4440("c|uUK")), method4441(method4440("c|uTK")), method4441(method4440("c|uQK")) };

    @OriginalMember(owner = "client!ht", name = "N", descriptor = "Lvn;")
    public static class330 field8759 = new class330(31, -1);

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "Lhl;")
    public static class556 field8760 = new class556(95, 2);

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "[I")
    public static int[] field8763 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ht", name = "P", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "Lcka;")
    public static class183 field8757;

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V", line = 3)
    public class608() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V", line = 6)
    public static void method4438(int arg0) {
        try {
            field8757 = null;
            if (arg0 != -25551) {
                method4438(-74);
            }
            field8763 = null;
            field8759 = null;
            field8760 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8764[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)[I", line = 20)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field8761;
            if (arg1 != 123) {
                field8762 = -5;
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int var4 = class100.field1467[arg0];
                for (int var5 = 0; var5 < class449.field6969; ++var5) {
                    int var6 = class788.field11518[var5];
                    if (var6 > this.field8758 && ~(-this.field8758 + 4096) < ~var6 && var4 > -this.field8758 + 2048 && this.field8758 + 2048 > var4) {
                        int var7 = 2048 - var6;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field8758 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (2048 - this.field8758 < var6 && 2048 - -this.field8758 > var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field8758;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field8758 + 2048);
                    } else if (~var4 <= ~this.field8758 && ~(4096 - this.field8758) <= ~var4) {
                        if (~var6 <= ~this.field8758 && -this.field8758 + 4096 >= var6) {
                            var3[var5] = 0;
                        } else {
                            int var19 = -var4 + 2048;
                            int var20 = ~var19 <= -1 ? var19 : -var19;
                            int var21 = var20 << 12;
                            int var22 = var21 / (-this.field8758 + 2048);
                            var3[var5] = 4096 - var22;
                        }
                    } else {
                        int var15 = var6 + -2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 - this.field8758;
                        int var18 = var17 << 12;
                        var3[var5] = var18 / (-this.field8758 + 2048);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field8764[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)Z", line = 104)
    public static final boolean method4439(int arg0, byte arg1, int arg2) {
        try {
            int var3 = 86 % ((arg1 - -22) / 36);
            ++field8756;
            return ~(arg2 & 384) != -1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8764[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILwq;I)V", line = 115)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 >= 96) {
                if (~arg2 == -1) {
                    this.field8758 = arg1.method1687((byte) -93);
                }
                ++field8755;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8764[3] + arg0 + ',' + (arg1 != null ? field8764[1] : field8764[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4440(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 99);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4441(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
