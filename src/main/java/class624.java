import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class624 extends class211 {

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    private int field9123 = 3072;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    private int field9126 = 1024;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    private int field9130 = 2048;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field9133 = new String[] { method4640(method4639("\u000f\r\rM\u001c")), method4640(method4639("\u001aVO\u000f")), method4640(method4639("\u001fF\r I")), method4640(method4639("\u001fF\r-I")), method4640(method4639("\u001fF\r*I")), method4640(method4639("\u001fF\r)I")), method4640(method4639("\u001fF\r.I")), method4640(method4639("\u001fF\r(I")), method4640(method4639("\u001fF\r!I")), method4640(method4639("\u001fF\r/I")) };

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Z")
    public static boolean field9124 = false;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Lnp;")
    public static class516 field9131 = new class516();

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Ljava/awt/Font;")
    public static Font field9125;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIZ)V", line = 3)
    public static final void method4635(boolean arg0, int arg1, boolean arg2) {
        try {
            ++field9127;
            if (arg1 != -17200) {
                method4638(42);
            }
            if (arg0) {
                ++class766.field11075;
                class526.method3980((byte) -55);
            }
            if (arg2) {
                ++class634.field9241;
                class381.method3057(6);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9133[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[I", line = 26)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field9132;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int[] var4 = this.method1856(0, arg1, 83);
                for (int var5 = 0; ~var5 > ~class343.field5332; ++var5) {
                    var3[var5] = (var4[var5] * this.field9130 >> 12) + this.field9126;
                }
            }
            return arg0 != 8217 ? null : var3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9133[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V", line = 59)
    public static final void method4636(int arg0, int arg1) {
        try {
            ++field9120;
            class313 var2 = class196.method1670((long) arg1, 3, -29);
            var2.method2635(true);
            if (arg0 != 0) {
                field9125 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9133[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BILib;)V", line = 75)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        super.field3235 = arg2.method1455((byte) 62) == 1;
                    }
                } else {
                    this.field9123 = arg2.method1445((byte) 126);
                }
            } else {
                this.field9126 = arg2.method1445((byte) 116);
            }
            if (arg0 <= 67) {
                method4638(-23);
            }
            ++field9122;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9133[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9133[0] : field9133[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 122)
    public final void method437(int arg0) {
        try {
            ++field9119;
            this.field9130 = -this.field9126 + this.field9123;
            if (arg0 != 27132) {
                this.field9126 = 23;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9133[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 134)
    public class624() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V", line = 141)
    public static void method4637(int arg0) {
        try {
            if (arg0 == -2145518804) {
                field9125 = null;
                field9131 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9133[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I", line = 153)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field9129;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (arg1 > -38) {
                field9124 = false;
            }
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class343.field5332 < ~var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field9130 >> 12) + this.field9126;
                    var9[var11] = this.field9126 - -(var6[var11] * this.field9130 >> 12);
                    var10[var11] = (var7[var11] * this.field9130 >> 12) + this.field9126;
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9133[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 205)
    public static final void method4638(int arg0) {
        try {
            ++field9121;
            class198.field3097.method526(1.1523438F * (0.7F + (float) class289.field4305.field844.method2952(false) * 0.1F));
            class198.field3097.method516(class7.field76, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
            class198.field3097.method584(class722.field10456, -1, arg0);
            class198.field3097.method555(class72.field795);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9133[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4639(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 97);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4640(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
