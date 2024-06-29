import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class444 implements class161 {

    @OriginalMember(owner = "client!un", name = "j", descriptor = "Lsja;")
    private class11 field6398 = new class11(256);

    @OriginalMember(owner = "client!un", name = "p", descriptor = "Luq;")
    private class172 field6404;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Luq;")
    private class172 field6392;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    private int field6402;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "[Lnl;")
    private class577[] field6397;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field6394 = 1339;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Z")
    public static boolean field6399 = false;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "Luq;")
    public static class172 field6395;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 3)
    public static void method2651(int arg0) {
        if (arg0 >= -47) {
            method2651(17);
        }
        field6395 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z", line = 13)
    public final boolean method1112(int arg0, int arg1) {
        if (arg0 == 29302) {
            field6393++;
            class701 var3 = this.method2653(arg1, 635);
            return var3 != null && var3.method3824(0, this, this.field6404);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I", line = 27)
    public final int method1109(int arg0) {
        field6389++;
        if (arg0 > -79) {
            this.method1113(-98, -107, 57, false, 85, 0.70912254F);
        }
        return this.field6402;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IFIIIZ)[I", line = 42)
    public final int[] method1111(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field6403++;
        int var7 = 14 % ((arg0 + 22) / 48);
        return this.method2653(arg3, 635).method3823(arg4, this, this.field6404, (double) arg1, this.field6397[arg3].field7859, arg2, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lub;[I[II[I)V", line = 58)
    public static final void method2652(class22 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        field6391++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field6163.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field6163[var9] = null;
                    } else {
                        class317 var10 = class693.field9223.method2388(var6, 0);
                        int var11 = var10.field4487;
                        class610 var12 = arg0.field6163[var9];
                        if (var12 != null) {
                            if (var12.field8251 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field6163[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field8250 = 0;
                                    var12.field8252 = 0;
                                    var12.field8249 = 0;
                                    var12.field8248 = 1;
                                    var12.field8253 = var8;
                                    if (!arg0.field6135) {
                                        class627.method3466(arg0, var10, -29701, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field8250 = 0;
                                }
                            } else if (var10.field4466 >= class693.field9223.method2388(var12.field8251, 0).field4466) {
                                var12 = arg0.field6163[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class610 var13 = arg0.field6163[var9] = new class610();
                            var13.field8253 = var8;
                            var13.field8251 = var6;
                            var13.field8250 = 0;
                            var13.field8252 = 0;
                            var13.field8248 = 1;
                            var13.field8249 = 0;
                            if (!arg0.field6135) {
                                class627.method3466(arg0, var10, arg3 - 3774, 0);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg3 != -25927) {
            field6394 = -13;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(II)Lfb;", line = 158)
    private final class701 method2653(int arg0, int arg1) {
        field6400++;
        class659 var3 = this.field6398.method76(42, (long) arg0);
        if (var3 != null) {
            return (class701) var3;
        }
        byte[] var4 = this.field6392.method1176(arg0, 82);
        if (var4 == null) {
            return null;
        }
        class701 var5 = new class701(new class254(var4));
        this.field6398.method79(var5, (long) arg0, false);
        if (arg1 != 635) {
            this.field6402 = 123;
        }
        return var5;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIZIF)[I", line = 183)
    public final int[] method1113(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        if (arg0 >= -60) {
            field6395 = null;
        }
        field6396++;
        return this.method2653(arg4, 635).method3825(arg1, 0, arg3, this.field6404, arg2, (double) arg5, this, this.field6397[arg4].field7859);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZFIIII)[F", line = 197)
    public final float[] method1110(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5) {
        field6390++;
        if (arg5 != 149) {
            this.field6404 = null;
        }
        return this.method2653(arg3, 635).method3822(this.field6397[arg3].field7859, arg2, (byte) -128, arg4, this.field6404, this);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)Lnl;", line = 214)
    public final class577 method1114(int arg0, int arg1) {
        field6401++;
        if (arg1 >= -20) {
            field6395 = null;
        }
        return this.field6397[arg0];
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Luq;Luq;Luq;)V", line = 230)
    public class444(class172 arg0, class172 arg1, class172 arg2) {
        this.field6404 = arg2;
        this.field6392 = arg1;
        class254 var4 = new class254(arg0.method1188(0, -18047, 0));
        this.field6402 = var4.method1728((byte) 15);
        this.field6397 = new class577[this.field6402];
        for (int var5 = 0; var5 < this.field6402; var5++) {
            if (var4.method1731((byte) 64) == 1) {
                this.field6397[var5] = new class577();
            }
        }
        for (int var6 = 0; var6 < this.field6402; var6++) {
            if (this.field6397[var6] != null) {
                this.field6397[var6].field7868 = var4.method1731((byte) 64) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field6402; var7++) {
            if (this.field6397[var7] != null) {
                this.field6397[var7].field7853 = var4.method1731((byte) 64) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field6402; var8++) {
            if (this.field6397[var8] != null) {
                this.field6397[var8].field7863 = var4.method1731((byte) 64) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field6402; var9++) {
            if (this.field6397[var9] != null) {
                this.field6397[var9].field7857 = var4.method1737(true);
            }
        }
        for (int var10 = 0; var10 < this.field6402; var10++) {
            if (this.field6397[var10] != null) {
                this.field6397[var10].field7865 = var4.method1737(true);
            }
        }
        for (int var11 = 0; var11 < this.field6402; var11++) {
            if (this.field6397[var11] != null) {
                this.field6397[var11].field7855 = var4.method1737(true);
            }
        }
        for (int var12 = 0; var12 < this.field6402; var12++) {
            if (this.field6397[var12] != null) {
                this.field6397[var12].field7867 = var4.method1737(true);
            }
        }
        for (int var13 = 0; var13 < this.field6402; var13++) {
            if (this.field6397[var13] != null) {
                this.field6397[var13].field7854 = (short) var4.method1728((byte) 28);
            }
        }
        for (int var14 = 0; var14 < this.field6402; var14++) {
            if (this.field6397[var14] != null) {
                this.field6397[var14].field7861 = var4.method1737(true);
            }
        }
        for (int var15 = 0; var15 < this.field6402; var15++) {
            if (this.field6397[var15] != null) {
                this.field6397[var15].field7852 = var4.method1737(true);
            }
        }
        for (int var16 = 0; var16 < this.field6402; var16++) {
            if (this.field6397[var16] != null) {
                this.field6397[var16].field7870 = var4.method1731((byte) 64) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field6402; var17++) {
            if (this.field6397[var17] != null) {
                this.field6397[var17].field7859 = var4.method1731((byte) 64) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field6402; var18++) {
            if (this.field6397[var18] != null) {
                this.field6397[var18].field7874 = var4.method1737(true);
            }
        }
        for (int var19 = 0; var19 < this.field6402; var19++) {
            if (this.field6397[var19] != null) {
                this.field6397[var19].field7873 = var4.method1731((byte) 64) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field6402; var20++) {
            if (this.field6397[var20] != null) {
                this.field6397[var20].field7858 = var4.method1731((byte) 64) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field6402; var21++) {
            if (this.field6397[var21] != null) {
                this.field6397[var21].field7872 = var4.method1731((byte) 64) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field6402; var22++) {
            if (this.field6397[var22] != null) {
                this.field6397[var22].field7869 = var4.method1731((byte) 64);
            }
        }
        for (int var23 = 0; var23 < this.field6402; var23++) {
            if (this.field6397[var23] != null) {
                this.field6397[var23].field7876 = var4.method1672(-16516);
            }
        }
        for (int var24 = 0; var24 < this.field6402; var24++) {
            if (this.field6397[var24] != null) {
                this.field6397[var24].field7860 = var4.method1731((byte) 64);
            }
        }
    }
}
