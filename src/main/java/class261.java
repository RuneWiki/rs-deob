import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class261 extends class420 {

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "S")
    public short field4023;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field4026 = new String[] { method2199(method2198("(}\u0001m\u00177u[oV")), method2199(method2198("(}\u0001\u0017V")), method2199(method2198("(}\u0001\u0012V")), method2199(method2198("7iC=")), method2199(method2198("\"2\u0001\u007f\u0003")), method2199(method2198("(}\u0001\u0010V")), method2199(method2198("(}\u0001\u0013V")) };

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "[[Z")
    public static boolean[][] field4024 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILjava/lang/Class;)Lvv;")
    public static final class343 method2196(int arg0, int arg1, int arg2, Class arg3) {
        class96 var4 = class734.field10683[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class681 var5 = var4.field1085; var5 != null; var5 = var5.field9865) {
                class343 var6 = var5.field9867;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field5330 == arg1 && var6.field5329 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "(I)V")
    public static void method2197(int arg0) {
        try {
            field4024 = null;
            if (arg0 != -13679) {
                method2197(111);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4026[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "(I)Z")
    public final boolean method629(int arg0) {
        try {
            ++field4025;
            if (arg0 != 0) {
                this.method630((class471[]) null, false);
            }
            return class91.field1038[(super.field6197 >> class602.field8828) + -class247.field3811 + class396.field5921][(super.field6211 >> class602.field8828) + -class5.field52 + class396.field5921];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4026[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(ILha;)Z")
    public final boolean method631(int arg0, class66 arg1) {
        try {
            ++field4022;
            return arg0 != -10204 ? false : class364.method2954(super.field6211 >> class602.field8828, super.field6197 >> class602.field8828, super.field6205, false, this);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4026[6] + arg0 + ',' + (arg1 != null ? field4026[4] : field4026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Luf;Z)I")
    public final int method630(class471[] arg0, boolean arg1) {
        try {
            ++field4021;
            int var3 = super.field6197 >> class602.field8828;
            int var4 = super.field6211 >> class602.field8828;
            int var5 = 0;
            if (class247.field3811 == var3) {
                ++var5;
            } else if (class247.field3811 < var3) {
                var5 += 2;
            }
            if (~class5.field52 == ~var4) {
                var5 += 3;
            } else if (~var4 > ~class5.field52) {
                var5 += 6;
            }
            if (!arg1) {
                return -18;
            } else {
                int var6 = class394.field5910[var5];
                if (~(this.field4023 & var6) != -1) {
                    return this.method3252(arg0, var3, var4, (byte) 73);
                } else if (~this.field4023 == -2 && var3 > 0) {
                    return this.method3252(arg0, var3 + -1, var4, (byte) 73);
                } else if (this.field4023 == 4 && ~class132.field1543 <= ~var3) {
                    return this.method3252(arg0, var3 - -1, var4, (byte) 73);
                } else if (~this.field4023 == -9 && var4 > 0) {
                    return this.method3252(arg0, var3, var4 - 1, (byte) 73);
                } else if (this.field4023 == 2 && ~class216.field3296 <= ~var4) {
                    return this.method3252(arg0, var3, var4 + 1, (byte) 73);
                } else if (this.field4023 == 16 && ~var3 < -1 && var4 <= class216.field3296) {
                    return this.method3252(arg0, var3 - 1, var4 + 1, (byte) 73);
                } else if (~this.field4023 == -33 && class132.field1543 >= var3 && ~var4 >= ~class216.field3296) {
                    return this.method3252(arg0, var3 - -1, var4 + 1, (byte) 73);
                } else if (this.field4023 == 128 && ~var3 < -1 && ~var4 < -1) {
                    return this.method3252(arg0, var3 + -1, var4 + -1, (byte) 73);
                } else if (this.field4023 == 64 && class132.field1543 >= var3 && ~var4 < -1) {
                    return this.method3252(arg0, var3 - -1, var4 + -1, (byte) 73);
                } else {
                    throw new RuntimeException("");
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4026[5] + (arg0 != null ? field4026[4] : field4026[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIII)V")
    public class261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field4023 = (short) arg5;
            super.field6205 = (byte) arg4;
            super.field6199 = arg1;
            super.field6200 = (byte) arg3;
            super.field6211 = arg2;
            super.field6197 = arg0;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4026[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2198(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 126);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2199(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
