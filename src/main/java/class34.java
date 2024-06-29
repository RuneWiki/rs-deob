import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class34 extends class84 {

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "[I")
    private int[] field522;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "[I")
    private int[] field527;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "Ltl;")
    private class68 field519;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "Ltl;")
    private class68 field523;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Ltl;")
    private class68 field513;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "[Ltl;")
    private class68[] field520;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "Lic;")
    public static class143 field518 = new class143(64);

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "Lab;")
    public static class148 field524 = new class148();

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static volatile int field532 = -1;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "Z")
    public static boolean field529 = false;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "[Lke;")
    public static class110[] field525;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "[[[B")
    public static byte[][][] field528;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "[[[B")
    public static byte[][][] field530;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "[[[I")
    public static int[][][] field531;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(I)V")
    public static void method224(int arg0) {
        field524 = null;
        if (arg0 != 0) {
            field528 = null;
        }
        field525 = null;
        field528 = null;
        field531 = null;
        field530 = null;
        field518 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lhc;Lv;I)Z")
    public final boolean method225(class235 arg0, class152 arg1, int arg2) {
        field517++;
        if (class6.field54 <= 0) {
            for (int var4 = 0; var4 < this.field527.length; var4++) {
                if (!arg0.method1570((byte) -39, this.field527[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field527.length; var5++) {
                if (!arg0.method1564(2, class6.field54, this.field527[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field522.length; var6++) {
            if (!arg1.method693(this.field522[var6], (byte) -60)) {
                return false;
            }
        }
        if (arg2 != 683499716) {
            this.method227((class235) null, false, (class152) null, -31, -54, true, (byte) 120, -0.8386818478970159D);
        }
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILhc;ILv;ZDZ)Ldc;")
    public final class243 method226(int arg0, class235 arg1, int arg2, class152 arg3, boolean arg4, double arg5, boolean arg6) {
        field515++;
        if (!arg4) {
            field528 = null;
        }
        class252.method1688(arg5, (byte) -56);
        class199.field2775 = arg3;
        class43.field650 = arg1;
        class123.method811(-1, arg2, arg0);
        class243 var9 = new class243(arg0, arg2);
        for (int var10 = 0; var10 < this.field520.length; var10++) {
            this.field520[var10].method424(-5656, arg2, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg6) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field523.field926) {
                int[] var14 = this.field523.method32(var12, -127);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field523.method91(var12, (byte) 127);
                var17 = var18[2];
                var15 = var18[0];
                var16 = var18[1];
            }
            int[] var19;
            if (this.field513.field926) {
                var19 = this.field513.method32(var12, -126);
            } else {
                var19 = this.field513.method91(var12, (byte) -47)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var15[var20] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class20.field288[var21];
                int var24 = var17[var20] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class20.field288[var22];
                int var26 = class20.field288[var24];
                int var27;
                if (var25 == 0 && var23 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field1820[var11++] = (var23 << 8) + (var27 << 24) + (var25 << 16) + var26;
                if (arg6) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field520.length; var13++) {
            this.field520[var13].method159((byte) -48);
        }
        return var9;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lhc;ZLv;IIZBD)[I")
    public final int[] method227(class235 arg0, boolean arg1, class152 arg2, int arg3, int arg4, boolean arg5, byte arg6, double arg7) {
        class252.method1688(arg7, (byte) -88);
        class43.field650 = arg0;
        field514++;
        class199.field2775 = arg2;
        class123.method811(-1, arg3, arg4);
        if (arg6 != -4) {
            field530 = null;
        }
        for (int var10 = 0; var10 < this.field520.length; var10++) {
            this.field520[var10].method424(arg6 ^ 0x1614, arg3, arg4);
        }
        int[] var11 = new int[arg3 * arg4];
        byte var12;
        int var13;
        int var14;
        if (arg5) {
            var14 = -1;
            var13 = arg4 - 1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field523.field926) {
                int[] var18 = this.field523.method32(var16, -127);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field523.method91(var16, (byte) 125);
                var20 = var22[0];
                var19 = var22[2];
                var21 = var22[1];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var20[var23] >> 4;
                int var25 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var19[var23] >> 4;
                int var27 = class20.field288[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class20.field288[var26];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var29 = class20.field288[var25];
                var11[var15++] = (var27 << 16) + (var29 << 8) + var28;
                if (arg1) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field520.length; var17++) {
            this.field520[var17].method159((byte) -48);
        }
        return var11;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZLhc;Lv;DI)Lq;")
    public final class128 method228(int arg0, int arg1, boolean arg2, class235 arg3, class152 arg4, double arg5, int arg6) {
        class252.method1688(arg5, (byte) -32);
        class43.field650 = arg3;
        class199.field2775 = arg4;
        class123.method811(arg1, arg0, arg6);
        class128 var9 = new class128(arg6, arg0);
        for (int var10 = 0; var10 < this.field520.length; var10++) {
            this.field520[var10].method424(arg1 ^ 0x1617, arg0, arg6);
        }
        field511++;
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg2) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field523.field926) {
                int[] var18 = this.field523.method32(var12, -121);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field523.method91(var12, (byte) 127);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            for (int var19 = 0; var19 != arg6; var19++) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var17[var19] >> 4;
                int var22 = var15[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class20.field288[var21];
                int var24 = class20.field288[var22];
                int var25 = class20.field288[var20];
                var9.field1820[var11++] = (var25 << 16) + (var23 << 8) + var24;
                if (arg2) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field520.length; var13++) {
            this.field520[var13].method159((byte) -48);
        }
        return var9;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)V")
    public static final void method229(boolean arg0, int arg1) {
        if (!arg0) {
            class221.field3312.method536(105, arg1);
            class227.field3445.method536(117, arg1);
            field512++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BJ)V")
    public static final void method230(byte arg0, long arg1) {
        field521++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class279.field4323; var3++) {
            if (class84.field1144[var3] == arg1) {
                class279.field4323--;
                class40.field594++;
                for (int var4 = var3; var4 < class279.field4323; var4++) {
                    class180.field2531[var4] = class180.field2531[var4 + 1];
                    class67.field909[var4] = class67.field909[var4 + 1];
                    class208.field2966[var4] = class208.field2966[var4 + 1];
                    class84.field1144[var4] = class84.field1144[var4 + 1];
                    class277.field4287[var4] = class277.field4287[var4 + 1];
                    class145.field2025[var4] = class145.field2025[var4 + 1];
                }
                class66.field892 = class35.field548;
                class281.field4359.method1864(124, (byte) -69);
                class281.field4359.method1451(arg1, (byte) -24);
                break;
            }
        }
        if (arg0 < 91) {
            method224(-4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)Z")
    public static final boolean method231(int arg0) {
        field516++;
        return arg0 < 108 ? false : class251.field3847;
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V")
    public static final void method232(int arg0) {
        class75.field1044 = null;
        class39.field587 = null;
        if (arg0 > 0) {
            field532 = -23;
        }
        class269.field4119 = null;
        class79.field1099 = null;
        class225.field3418 = null;
        field510++;
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V")
    public static final void method233(int arg0) {
        if (class287.field4533 != null) {
            class236 var1 = class287.field4533;
            synchronized (class287.field4533) {
                class287.field4533 = null;
            }
        }
        if (arg0 != 32384) {
            field533 = -127;
        }
        field526++;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class34() {
        this.field522 = new int[0];
        this.field527 = new int[0];
        this.field519 = new class257(0);
        this.field519.field922 = 1;
        this.field523 = new class257();
        this.field523.field922 = 1;
        this.field513 = new class257();
        this.field520 = new class68[] { this.field523, this.field513, this.field519 };
        this.field513.field922 = 1;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lql;)V")
    public class34(class224 arg0) {
        int var2 = 0;
        int var3 = arg0.method1453((byte) -127);
        this.field520 = new class68[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class68 var16 = class81.method511(arg0, true);
            if (var16.method425((byte) 28) >= 0) {
                var2++;
            }
            if (var16.method153((byte) -63) >= 0) {
                var4++;
            }
            int var17 = var16.field932.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1453((byte) -128);
            }
            this.field520[var6] = var16;
        }
        this.field527 = new int[var2];
        this.field522 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class68 var11 = this.field520[var9];
            int var12 = var11.field932.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field932[var13] = this.field520[var5[var9][var13]];
            }
            int var14 = var11.method425((byte) 28);
            int var15 = var11.method153((byte) -63);
            if (var14 > 0) {
                this.field527[var7++] = var14;
            }
            if (var15 > 0) {
                this.field522[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field523 = this.field520[arg0.method1453((byte) -128)];
        this.field513 = this.field520[arg0.method1453((byte) -127)];
        this.field519 = this.field520[arg0.method1453((byte) -127)];
    }
}
