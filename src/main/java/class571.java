import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class571 extends class202 {

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "S")
    public short field8278;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field8281 = new String[] { method4255(method4254("\\Y=~]\u0013")), method4255(method4254("UN\u007fU")), method4255(method4254("@\u0015=\u0017a")), method4255(method4254("\\Y=k4")), method4255(method4254("\\Y=p]\u0013")), method4255(method4254("\\Y=q]\u0013")), method4255(method4254("\\Y=\u0005uURg\u00074")) };

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Lmv;")
    public static class125 field8279 = new class125(52, 12);

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V", line = 6)
    public static void method4253(byte arg0) {
        try {
            if (arg0 != 42) {
                method4253((byte) 26);
            }
            field8279 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8281[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIII)V", line = 18)
    public class571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            super.field2984 = arg2;
            super.field2975 = arg1;
            this.field8278 = (short) arg5;
            super.field2981 = (byte) arg3;
            super.field2969 = arg0;
            super.field2971 = (byte) arg4;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8281[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Z", line = 32)
    public final boolean method43(byte arg0) {
        try {
            int var2 = -54 % ((arg0 - -37) / 55);
            ++field8280;
            return class30.field385[(super.field2969 >> class179.field2328) - (-class501.field7316 + class269.field3812)][(super.field2984 >> class179.field2328) + -class98.field1331 + class501.field7316];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8281[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lha;B)Z", line = 42)
    public final boolean method45(class18 arg0, byte arg1) {
        try {
            if (arg1 >= -76) {
                this.field8278 = 105;
            }
            ++field8276;
            return class305.method2449((byte) 127, super.field2969 >> class179.field2328, super.field2984 >> class179.field2328, super.field2971, this);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8281[5] + (arg0 != null ? field8281[2] : field8281[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B[Lta;)I", line = 57)
    public final int method41(byte arg0, class330[] arg1) {
        try {
            ++field8277;
            int var3 = -60 / ((45 - arg0) / 33);
            int var4 = super.field2969 >> class179.field2328;
            int var5 = super.field2984 >> class179.field2328;
            int var6 = 0;
            if (~class269.field3812 != ~var4) {
                if (~class269.field3812 > ~var4) {
                    var6 += 2;
                }
            } else {
                ++var6;
            }
            if (~class98.field1331 != ~var5) {
                if (~var5 > ~class98.field1331) {
                    var6 += 6;
                }
            } else {
                var6 += 3;
            }
            int var7 = class144.field1871[var6];
            if (~(var7 & this.field8278) != -1) {
                return this.method1732(var4, var5, arg1, 16);
            } else if (~this.field8278 == -2 && ~var4 < -1) {
                return this.method1732(var4 + -1, var5, arg1, 16);
            } else if (this.field8278 == 4 && ~class508.field7455 <= ~var4) {
                return this.method1732(var4 + 1, var5, arg1, 16);
            } else if (~this.field8278 == -9 && ~var5 < -1) {
                return this.method1732(var4, var5 + -1, arg1, 16);
            } else if (~this.field8278 == -3 && class700.field9795 >= var5) {
                return this.method1732(var4, var5 + 1, arg1, 16);
            } else if (this.field8278 == 16 && var4 > 0 && ~class700.field9795 <= ~var5) {
                return this.method1732(var4 + -1, var5 + 1, arg1, 16);
            } else if (~this.field8278 == -33 && class508.field7455 >= var4 && ~var5 >= ~class700.field9795) {
                return this.method1732(var4 - -1, var5 + 1, arg1, 16);
            } else if (~this.field8278 == -129 && ~var4 < -1 && var5 > 0) {
                return this.method1732(var4 + -1, var5 + -1, arg1, 16);
            } else if (~this.field8278 == -65 && ~class508.field7455 <= ~var4 && var5 > 0) {
                return this.method1732(var4 + 1, var5 + -1, arg1, 16);
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8281[0] + arg0 + ',' + (arg1 != null ? field8281[2] : field8281[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4254(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4255(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
