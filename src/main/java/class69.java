import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public abstract class class69 extends class420 {

    @OriginalMember(owner = "client!mia", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field748 = new String[] { method634(method633("\u000fn4E[")), method634(method633("\u001a5v\u0007")), method634(method633("\u0019){Ea\\")), method634(method633("\u0019){E\u001a\u001d.s\u001f\u0018\\")), method634(method633("\u0019){Ee\\")), method634(method633("\u0019){Ed\\")), method634(method633("\u0019){Eg\\")), method634(method633("\u0019){El\\")), method634(method633("\u0019){E`\\")), method634(method633("\u0019){Ec\\")), method634(method633("\u0019){Eb\\")) };

    @OriginalMember(owner = "client!mia", name = "D", descriptor = "I")
    public static int field735 = 0;

    @OriginalMember(owner = "client!mia", name = "E", descriptor = "Lcn;")
    public static class541 field740 = null;

    @OriginalMember(owner = "client!mia", name = "H", descriptor = "I")
    public static int field747 = 0;

    @OriginalMember(owner = "client!mia", name = "M", descriptor = "[I")
    public static int[] field746 = new int[25];

    @OriginalMember(owner = "client!mia", name = "O", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!mia", name = "K", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!mia", name = "I", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!mia", name = "G", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!mia", name = "C", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!mia", name = "L", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!mia", name = "N", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!mia", name = "F", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!mia", name = "J", descriptor = "[I")
    public static int[] field745;

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "(B)Z")
    public final boolean method625(byte arg0) {
        try {
            ++field744;
            if (arg0 != 94) {
                field740 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field748[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I[IB[Ljava/lang/Object;I)V")
    public static final void method626(int arg0, int[] arg1, byte arg2, Object[] arg3, int arg4) {
        try {
            ++field738;
            if (arg2 <= -3) {
                if (~arg4 < ~arg0) {
                    int var5 = (arg0 + arg4) / 2;
                    int var6 = arg0;
                    int var7 = arg1[var5];
                    arg1[var5] = arg1[arg4];
                    arg1[arg4] = var7;
                    Object var8 = arg3[var5];
                    arg3[var5] = arg3[arg4];
                    arg3[arg4] = var8;
                    int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
                    for (int var10 = arg0; ~arg4 < ~var10; ++var10) {
                        if (arg1[var10] < (var9 & var10) + var7) {
                            int var11 = arg1[var10];
                            arg1[var10] = arg1[var6];
                            arg1[var6] = var11;
                            Object var12 = arg3[var10];
                            arg3[var10] = arg3[var6];
                            arg3[var6++] = var12;
                        }
                    }
                    arg1[arg4] = arg1[var6];
                    arg1[var6] = var7;
                    arg3[arg4] = arg3[var6];
                    arg3[var6] = var8;
                    method626(arg0, arg1, (byte) -84, arg3, var6 + -1);
                    method626(var6 + 1, arg1, (byte) -42, arg3, arg4);
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field748[8] + arg0 + ',' + (arg1 != null ? field748[0] : field748[1]) + ',' + arg2 + ',' + (arg3 != null ? field748[0] : field748[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Ldf;IZIIILha;)V")
    public final void method627(class420 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class66 arg6) {
        try {
            if (arg5 != 0) {
                field742 = 85;
            }
            ++field739;
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field748[2] + (arg0 != null ? field748[0] : field748[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field748[0] : field748[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "(I)V")
    public final void method628(int arg0) {
        try {
            if (arg0 == -38) {
                ++field737;
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field748[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "(I)Z")
    public final boolean method629(int arg0) {
        try {
            if (arg0 != 0) {
                return false;
            } else {
                ++field736;
                return class91.field1038[(super.field6197 >> class602.field8828) + class396.field5921 + -class247.field3811][(super.field6211 >> class602.field8828) - (class5.field52 - class396.field5921)];
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field748[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "([Luf;Z)I")
    public final int method630(class471[] arg0, boolean arg1) {
        try {
            if (!arg1) {
                return 14;
            } else {
                ++field741;
                return this.method3252(arg0, super.field6197 >> class602.field8828, super.field6211 >> class602.field8828, (byte) 73);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field748[6] + (arg0 != null ? field748[0] : field748[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(IIIII)V")
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            super.field6205 = (byte) arg4;
            super.field6211 = arg2;
            super.field6200 = (byte) arg3;
            super.field6199 = arg1;
            super.field6197 = arg0;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field748[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "(ILha;)Z")
    public final boolean method631(int arg0, class66 arg1) {
        try {
            ++field743;
            if (arg0 != -10204) {
                this.method630((class471[]) null, false);
            }
            class681 var3 = class186.method1621(super.field6200, super.field6197 >> class602.field8828, super.field6211 >> class602.field8828);
            return var3 != null && var3.field9867.field5333 ? class120.method1045(super.field6211 >> class602.field8828, var3.field9867.method1088(arg0 ^ 12138) + this.method1088(-2226), super.field6200, -108, super.field6197 >> class602.field8828) : class56.method418(super.field6211 >> class602.field8828, super.field6200, 126, super.field6197 >> class602.field8828);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field748[5] + arg0 + ',' + (arg1 != null ? field748[0] : field748[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V")
    public static void method632(int arg0) {
        try {
            if (arg0 < 92) {
                method626(-53, (int[]) null, (byte) -48, (Object[]) null, 49);
            }
            field745 = null;
            field740 = null;
            field746 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field748[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method633(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method634(char[] arg0) {
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
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
