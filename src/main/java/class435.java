import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class435 {

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
    public int field6381 = 128;

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
    public int field6384 = 128;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    public int field6380;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
    public int field6377;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public int field6378;

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6385 = new String[] { method3329(method3328("^Vv\u0006G\u001b")), method3329(method3328("^Vv\u0006>ZP~\\<\u001b")), method3329(method3328("H\u00109\u0006\u007f")), method3329(method3328("]K{D")), method3329(method3328("^Vv\u0006A\u001b")), method3329(method3328("^Vv\u0006F\u001b")), method3329(method3328("^Vv\u0006@\u001b")), method3329(method3328("^Vv\u0006C\u001b")) };

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(BIII)I")
    public static final int method3323(byte arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 < 94) {
                return -31;
            }
            field6375++;
            int var6 = arg2 & 0x3;
            if (var6 == 0) {
                return arg1;
            } else if (var6 == 1) {
                return 4095 - arg3;
            } else if (var6 == 2) {
                return 4095 - arg1;
            } else {
                return arg3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6385[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "([BB)V")
    public static final void method3324(byte[] arg0, byte arg1) {
        try {
            if (arg1 >= 26) {
                field6376++;
                class163 var2 = new class163(arg0);
                boolean var3 = false;
                while (true) {
                    while (true) {
                        int var4 = var2.method1455((byte) 62);
                        if (var4 == 0) {
                            if (var3) {
                                return;
                            }
                            if (class226.field3466 == null) {
                                class226.field3466 = new int[4];
                                class87.field981 = new int[4];
                                class411.field6076 = 4;
                            }
                            for (int var6 = 0; var6 < class226.field3466.length; var6++) {
                                class226.field3466[var6] = 0;
                                class87.field981[var6] = var6 * 20;
                            }
                            return;
                        }
                        if (var4 == 1) {
                            if (class226.field3466 == null) {
                                class411.field6076 = 4;
                                class226.field3466 = new int[4];
                                class87.field981 = new int[4];
                            }
                            var3 = true;
                            for (int var5 = 0; var5 < class226.field3466.length; var5++) {
                                class226.field3466[var5] = var2.method1442(65280);
                                class87.field981[var5] = var2.method1442(65280);
                            }
                        } else if (var4 == 2) {
                            class676.field9793 = var2.method1445((byte) 115);
                        } else if (var4 == 3) {
                            class411.field6076 = var2.method1455((byte) 62);
                            class87.field981 = new int[class411.field6076];
                            class226.field3466 = new int[class411.field6076];
                        }
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6385[4] + (arg0 == null ? field6385[3] : field6385[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)Lmha;")
    public final class435 method3325(int arg0) {
        try {
            if (arg0 != 4) {
                method3324(null, (byte) 0);
            }
            field6383++;
            return new class435(this.field6380, this.field6381, this.field6384, this.field6377, this.field6382, this.field6378);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6385[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(I)V")
    public class435(int arg0) {
        try {
            this.field6380 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6385[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(IIIIII)V")
    private class435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field6377 = arg3;
            this.field6381 = arg1;
            this.field6380 = arg0;
            this.field6382 = arg4;
            this.field6384 = arg2;
            this.field6378 = arg5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6385[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg4 >= -22) {
                method3324(null, (byte) -15);
            }
            field6379++;
            int var7 = class541.method4089(class676.field9807, class381.field5786, arg1, 18286);
            int var8 = class541.method4089(class676.field9807, class381.field5786, arg0, 18286);
            int var9 = class541.method4089(class200.field3119, class676.field9797, arg5, 18286);
            int var10 = class541.method4089(class200.field3119, class676.field9797, arg3, 18286);
            int var11 = class541.method4089(class676.field9807, class381.field5786, arg1 + arg6, 18286);
            int var12 = class541.method4089(class676.field9807, class381.field5786, arg0 - arg6, 18286);
            for (int var13 = var7; var13 < var11; var13++) {
                class319.method2702(class243.field3731[var13], var9, var10, true, arg2);
            }
            for (int var14 = var8; var14 > var12; var14--) {
                class319.method2702(class243.field3731[var14], var9, var10, true, arg2);
            }
            int var15 = class541.method4089(class200.field3119, class676.field9797, arg5 + arg6, 18286);
            int var16 = class541.method4089(class200.field3119, class676.field9797, arg3 - arg6, 18286);
            for (int var17 = var11; var17 <= var12; var17++) {
                int[] var18 = class243.field3731[var17];
                class319.method2702(var18, var9, var15, true, arg2);
                class319.method2702(var18, var16, var10, true, arg2);
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field6385[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILmha;)V")
    public final void method3327(int arg0, class435 arg1) {
        try {
            this.field6384 = arg1.field6384;
            this.field6378 = arg1.field6378;
            this.field6377 = arg1.field6377;
            this.field6380 = arg1.field6380;
            this.field6382 = arg1.field6382;
            if (arg0 <= 91) {
                method3324(null, (byte) 90);
            }
            field6374++;
            this.field6381 = arg1.field6381;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6385[7] + arg0 + ',' + (arg1 == null ? field6385[3] : field6385[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3328(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3329(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
