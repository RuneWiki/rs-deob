import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class47 extends class94 {

    @OriginalMember(owner = "client!k", name = "bc", descriptor = "Lbd;")
    public static class162 field750 = class17.method142(0, "zap");

    @OriginalMember(owner = "client!k", name = "Yb", descriptor = "Lbd;")
    public static class162 field747 = class17.method142(0, " ");

    @OriginalMember(owner = "client!k", name = "hc", descriptor = "[[[I")
    public static int[][][] field756 = new int[4][13][13];

    @OriginalMember(owner = "client!k", name = "ic", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!k", name = "Tb", descriptor = "Z")
    public static boolean field742 = true;

    @OriginalMember(owner = "client!k", name = "Ub", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!k", name = "Vb", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!k", name = "Wb", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!k", name = "Xb", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!k", name = "Zb", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!k", name = "ac", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!k", name = "cc", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!k", name = "dc", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!k", name = "ec", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!k", name = "fc", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!k", name = "gc", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!k", name = "jc", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!k", name = "kc", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!k", name = "mc", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!k", name = "nc", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!k", name = "oc", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!k", name = "lc", descriptor = "Ln;")
    private class288 field760;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IB)V", line = 4)
    public final void method338(int arg0, byte arg1) {
        field752++;
        if (arg1 == 8) {
            this.field1681[this.field1653++] = (byte) (arg0 + this.field760.method1998(true));
        }
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(Z)V", line = 21)
    public final void method339(boolean arg0) {
        this.field1653 = (this.field762 + 7) / 8;
        if (arg0) {
            method348(-68, 47, -124, -108, -125, -58, -68, -79);
        }
        field748++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([II)V", line = 38)
    public final void method340(int[] arg0, int arg1) {
        int var3 = -29 % ((arg1 - 18) / 32);
        this.field760 = new class288(arg0);
        field761++;
    }

    @OriginalMember(owner = "client!k", name = "o", descriptor = "(B)Laf;", line = 50)
    public static final class223 method341(byte arg0) {
        field745++;
        if (class123.field2240 < class13.field220.length) {
            return class13.field220[class123.field2240++];
        } else if (arg0 == 63) {
            return null;
        } else {
            return (class223) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "n", descriptor = "(I)I", line = 70)
    public final int method342(int arg0) {
        if (arg0 >= -60) {
            return -19;
        } else {
            field759++;
            return this.field1681[this.field1653++] - this.field760.method1998(true) & 0xFF;
        }
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(Z)V", line = 82)
    public static void method343(boolean arg0) {
        field750 = null;
        if (!arg0) {
            method349((class143) null, true, (class143) null);
        }
        field756 = (int[][][]) null;
        field747 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V", line = 99)
    public class47(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!k", name = "j", descriptor = "(II)I", line = 104)
    public final int method344(int arg0, int arg1) {
        int var3 = this.field762 >> 3;
        field751++;
        int var4 = 8 - (this.field762 & 0x7);
        this.field762 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class151.field2692[var4] & this.field1681[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0 != 2) {
            field749 = -105;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class151.field2692[var4] & this.field1681[var3]) + var5;
        } else {
            var6 = (this.field1681[var3] >> var4 - arg1 & class151.field2692[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BIIB)V", line = 135)
    public final void method345(byte[] arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[arg2 + var5] = (byte) (this.field1681[this.field1653++] - this.field760.method1998(true));
        }
        field753++;
        int var6 = 117 % ((arg3 - 33) / 59);
    }

    @OriginalMember(owner = "client!k", name = "k", descriptor = "(II)I", line = 150)
    public final int method346(int arg0, int arg1) {
        if (arg1 == 8) {
            field758++;
            return arg0 * 8 - this.field762;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Lph;", line = 161)
    public static final class147 method347(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class147 var4 = var3.field3763;
            var3.field3763 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V", line = 175)
    public static final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3 + arg6;
        int var9 = arg2 - arg6;
        int var10 = arg0 + arg6;
        field763++;
        if (arg5 != 7) {
            return;
        }
        int var11 = arg4 - arg6;
        for (int var12 = arg3; var12 < var8; var12++) {
            class3.method14(arg7, arg0, arg4, class184.field3180[var12], arg5 ^ 0xFFFFFF80);
        }
        for (int var13 = arg2; var13 > var9; var13--) {
            class3.method14(arg7, arg0, arg4, class184.field3180[var13], -117);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class184.field3180[var14];
            class3.method14(arg7, arg0, var10, var15, -122);
            class3.method14(arg1, var10, var11, var15, -123);
            class3.method14(arg7, var11, arg4, var15, -122);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lda;ZLda;)V", line = 222)
    public static final void method349(class143 arg0, boolean arg1, class143 arg2) {
        class187.field3233 = arg0;
        class204.field3450 = arg2;
        if (!arg1) {
            field756 = (int[][][]) ((int[][][]) null);
        }
        class239.field3970 = class187.field3233.method1121(3, (byte) -112);
        field743++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I", line = 248)
    public static final int method350(int arg0, int arg1, int arg2, int arg3) {
        field755++;
        if (arg1 >= -66) {
            return -33;
        }
        int var4 = class312.field5264[class11.method90(arg3, arg2)];
        if (arg0 > 0) {
            int var5 = class312.field5271.method140((byte) -124, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var7 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class312.field5271.method155(arg0 & 0xFFFF, 0);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF00) >> 8) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var11 >> 8) + (var12 << 8 & 0xFF006F) + (var10 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ldc;IILob;III)V", line = 319)
    public static final void method351(class71 arg0, int arg1, int arg2, class78 arg3, int arg4, int arg5, int arg6) {
        field754++;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 * arg2 + arg5 * arg5;
        int var8 = class305.field5137 + class265.field4414 & 0x7FF;
        int var9 = Math.max(arg3.field1340 / 2, arg3.field1367 / arg6) + 10;
        if ((var9 * var9) < var7) {
            return;
        }
        int var10 = class312.field5262[var8];
        int var11 = class312.field5269[var8];
        int var12 = var11 * 256 / (class23.field396 + 256);
        int var13 = var10 * 256 / (class23.field396 + 256);
        int var14 = arg2 * var12 + arg5 * var13 >> 16;
        int var15 = arg5 * var12 - (arg2 * var13) >> 16;
        if (class117.field2159) {
            ((class140) arg0).method1090(arg3.field1340 / 2 + var14 + arg1 - (arg0.field1134 / 2), arg3.field1367 / 2 + arg4 + -(arg0.field1141 / 2) + -var15, (class140) arg3.method596(false, 0));
        } else {
            ((class79) arg0).method604(arg3.field1340 / 2 + arg1 + var14 - (arg0.field1134 / 2), arg3.field1367 / 2 + arg4 + -(arg0.field1141 / 2) + -var15, arg3.field1329, arg3.field1360);
        }
    }

    @OriginalMember(owner = "client!k", name = "o", descriptor = "(I)V", line = 353)
    public final void method352(int arg0) {
        if (arg0 < 5) {
            this.method352(-55);
        }
        this.field762 = this.field1653 * 8;
        field746++;
    }

    @OriginalMember(owner = "client!k", name = "p", descriptor = "(I)V", line = 369)
    public static final void method353(int arg0) {
        class3.field20++;
        class187.field3229.method338(arg0, (byte) 8);
        field744++;
        class187.field3229.method753(class251.method1754((byte) -126), true);
        class187.field3229.method751(class251.field4201, -1044017976);
        class187.field3229.method751(class252.field4205, -1044017976);
    }
}
