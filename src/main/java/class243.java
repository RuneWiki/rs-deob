import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class243 extends class756 {

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3734 = new String[] { method2074(method2073("\u000eC-n*")), method2074(method2073("\u0001\n-\u0004\u007f")), method2074(method2073("\u001b\u0018o,")), method2074(method2073("\u0001\n-\u0002\u007f")), method2074(method2073("\u0001\n-\u0003\u007f")), method2074(method2073("\u0001\n-\u0001\u007f")) };

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[F")
    public static float[] field3728 = new float[16];

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "Lto;")
    public static class8 field3725 = new class8(method2074(method2073("\u0007\u0018m%$\u0016\fs%")), method2074(method2073("'\u0018m%\u0004\u0016\fs%")), 0);

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    private int field3729;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "J")
    private long field3733;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "[[I")
    public static int[][] field3731;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lic;[IB[I[I)V", line = 4)
    public static final void method2071(class726 arg0, int[] arg1, byte arg2, int[] arg3, int[] arg4) {
        try {
            int var5 = -116 % ((-arg2 - 21) / 47);
            for (int var6 = 0; var6 < arg1.length; var6++) {
                int var7 = arg1[var6];
                int var8 = arg4[var6];
                int var9 = arg3[var6];
                int var10 = 0;
                while (var8 != 0 && var10 < arg0.field3813.length) {
                    if ((var8 & 0x1) != 0) {
                        if (var7 == -1) {
                            arg0.field3813[var10] = null;
                        } else {
                            class344 var11 = class272.field4122.method2242(var7, 100);
                            int var12 = var11.field5364;
                            class694 var13 = arg0.field3813[var10];
                            if (var13 != null) {
                                if (var13.field10138 == var7) {
                                    if (var12 == 0) {
                                        var13 = arg0.field3813[var10] = null;
                                    } else if (var12 == 1) {
                                        var13.field10134 = 1;
                                        var13.field10136 = 0;
                                        var13.field10132 = 0;
                                        var13.field10137 = var9;
                                        var13.field10130 = 0;
                                        if (!arg0.field3800) {
                                            class418.method3242(-256, var11, arg0, 0);
                                        }
                                    } else if (var12 == 2) {
                                        var13.field10132 = 0;
                                    }
                                } else if (var11.field5348 >= class272.field4122.method2242(var13.field10138, 100).field5348) {
                                    var13 = arg0.field3813[var10] = null;
                                }
                            }
                            if (var13 == null) {
                                class694 var14 = arg0.field3813[var10] = new class694();
                                var14.field10137 = var9;
                                var14.field10130 = 0;
                                var14.field10138 = var7;
                                var14.field10132 = 0;
                                var14.field10134 = 1;
                                var14.field10136 = 0;
                                if (!arg0.field3800) {
                                    class418.method3242(-256, var11, arg0, 0);
                                }
                            }
                        }
                    }
                    var10++;
                    var8 >>>= 0x1;
                }
            }
            field3727++;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field3734[1] + (arg0 == null ? field3734[2] : field3734[0]) + ',' + (arg1 == null ? field3734[2] : field3734[0]) + ',' + arg2 + ',' + (arg3 == null ? field3734[2] : field3734[0]) + ',' + (arg4 == null ? field3734[2] : field3734[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lkp;I)V", line = 108)
    public final void method41(class514 arg0, int arg1) {
        try {
            field3730++;
            arg0.method3903(this.field3729, this.field3733, (byte) -117);
            if (arg1 != 9893) {
                field3725 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3734[4] + (arg0 == null ? field3734[2] : field3734[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V", line = 122)
    public static void method2072(byte arg0) {
        try {
            field3728 = null;
            field3731 = null;
            int var1 = 107 % ((-arg0 - 24) / 32);
            field3725 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3734[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLib;)V", line = 141)
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field3729 = arg1.method1453((byte) 81);
            field3726++;
            this.field3733 = arg1.method1435(119);
            if (arg0 <= 32) {
                method2072((byte) -102);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3734[3] + arg0 + ',' + (arg1 == null ? field3734[2] : field3734[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2073(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2074(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
