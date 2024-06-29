import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class213 extends class304 {

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    private int field3265 = 4096;

    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "[I")
    private int[] field3273 = new int[3];

    @OriginalMember(owner = "client!nm", name = "fb", descriptor = "I")
    private int field3277 = 409;

    @OriginalMember(owner = "client!nm", name = "hb", descriptor = "I")
    private int field3279 = 4096;

    @OriginalMember(owner = "client!nm", name = "jb", descriptor = "I")
    private int field3281 = 4096;

    @OriginalMember(owner = "client!nm", name = "db", descriptor = "I")
    public static int field3275 = -1;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!nm", name = "cb", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!nm", name = "eb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!nm", name = "gb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!nm", name = "ib", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "Ljd;")
    public static class95 field3269;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "[[[Lvb;")
    public static class79[][][] field3262;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BB)V", line = 10)
    public static final void method1523(byte arg0, byte arg1) {
        field3267++;
        if (class2.field25 == null) {
            class2.field25 = new byte[4][104][104];
        }
        if (arg0 <= 90) {
            method1523((byte) 53, (byte) 80);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class2.field25[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZIIIII)V", line = 49)
    public static final void method1524(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3271++;
        int var7 = arg5 - arg2;
        int var8 = arg0 + arg2;
        int var9 = arg3 - arg2;
        int var10 = arg4 + arg2;
        for (int var11 = arg4; var11 < var10; var11++) {
            class7.method72(arg3, -7, arg0, class79.field1178[var11], arg6);
        }
        if (!arg1) {
            field3269 = (class95) null;
        }
        for (int var12 = arg5; var12 > var7; var12--) {
            class7.method72(arg3, -7, arg0, class79.field1178[var12], arg6);
        }
        for (int var13 = var10; var13 <= var7; var13++) {
            int[] var14 = class79.field1178[var13];
            class7.method72(var8, -7, arg0, var14, arg6);
            class7.method72(arg3, -7, var9, var14, arg6);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 216)
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V", line = 98)
    public static final void method1525(String arg0, boolean arg1, String arg2, String arg3, int arg4) {
        if (!arg1) {
            class131.method1018(105, arg3, -1, arg4, arg2, arg0);
            field3266++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I", line = 111)
    public final int[][] method75(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method69((class254) null, 94, 14);
        }
        field3272++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -71, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class218.field3333; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3273[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3277 >= var13) {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field3273[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3277 >= var15) {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field3273[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3277 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3281 * var12 >> 12;
                            var9[var11] = this.field3265 * var14 >> 12;
                            var10[var11] = this.field3279 * var16 >> 12;
                        }
                    } else {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var6[var11];
                    }
                } else {
                    var8[var11] = var12;
                    var9[var11] = var7[var11];
                    var10[var11] = var6[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V", line = 204)
    public static void method1526(int arg0) {
        if (arg0 != 26551) {
            method1523((byte) 78, (byte) -111);
        }
        field3262 = (class79[][][]) null;
        field3269 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V", line = 223)
    public static final void method1527(boolean arg0, int arg1) {
        field3263++;
        if (arg0 && class35.field504 == null || arg1 > class35.field504.length) {
            class35.field504 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lwm;II)V", line = 257)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3277 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field3279 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field3265 = arg0.method1755(false);
        } else if (arg1 == 3) {
            this.field3281 = arg0.method1755(false);
        } else if (arg1 == 4) {
            int var5 = arg0.method1758((byte) 107);
            this.field3273[1] = class149.method1117(4080, var5 >> 4);
            this.field3273[0] = class149.method1117(267386880, var5 << 4);
            this.field3273[2] = class149.method1117(0, var5 >> 12);
        }
        if (arg2 == -2828) {
            field3280++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 321)
    public static final void method1528(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class275.field4282; var1++) {
            class211 var2 = class102.method774(var1, -2);
            if (var2 != null && var2.field3244 == 0) {
                class245.field3708[var1] = 0;
                class154.field2330[var1] = 0;
            }
        }
        field3276++;
        class272.field4251 = new class250(16);
    }
}
