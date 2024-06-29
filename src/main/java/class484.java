import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public abstract class class484 implements class338 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lkda;")
    public class352 field7055;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field7058 = 0;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Lpr;")
    public static class407 field7056 = new class407(111, 6);

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7059;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pt", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field7060;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZZI)V")
    public abstract void method148(int arg0, boolean arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
    public static final void method2810(int arg0, int arg1) {
        class287 var2 = class97.field1074[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class287 var4 = class97.field1074[var3][arg0][arg1] = class97.field1074[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3684--;
                for (class60 var5 = var4.field3680; var5 != null; var5 = var5.field623) {
                    class354 var6 = var5.field625;
                    if (var6.field4642 == arg0 && var6.field4648 == arg1) {
                        var6.field4638--;
                    }
                }
            }
        }
        if (class97.field1074[0][arg0][arg1] == null) {
            class97.field1074[0][arg0][arg1] = new class287(0, arg0, arg1);
            class97.field1074[0][arg0][arg1].field3685 = 1;
        }
        class97.field1074[0][arg0][arg1].field3688 = var2;
        class97.field1074[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "()V")
    public static final void method2811() {
        for (int var0 = 0; var0 < class112.field1296; var0++) {
            if (!class44.field499[var0]) {
                class247 var1 = class256.field3279[var0];
                class463 var2 = var1.field3189;
                int var3 = var1.field3188;
                int var4 = var2.method2637(123) - class389.field5194;
                int var5 = (var4 * 2 >> class8.field70) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2640(-2049) - var4 >> class8.field70;
                int var9 = var2.method2641((byte) -14) - var4 >> class8.field70;
                int var10 = var2.method2641((byte) -14) + var4 >> class8.field70;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class272.field3451) {
                    var10 = class272.field3451 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field3180[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class181.field2222) {
                        var16 = class181.field2222 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class354 var19 = class396.method2163(var3, var17, var11, field7060 == null ? (field7060 = method2814("fu")) : field7060);
                        if (var19 != null && var19.field4650 != 0) {
                            if (var19.field4650 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field3180[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field3180[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field3180[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field3180[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class44.field499[var0] = true;
                class628.field8912[var3].method254(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)V")
    public static void method2812(boolean arg0) {
        field7056 = null;
        if (!arg0) {
            field7056 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lkda;)V")
    public class484(class352 arg0) {
        this.field7055 = arg0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[IIIIBII)V")
    public static final void method2813(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field7059++;
        if (arg3 > 0 && !class644.method3612(false, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class644.method3612(false, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg7 == 32993) {
            int var8 = 0;
            if (arg5 == -81) {
                int var9 = arg3 < arg2 ? arg3 : arg2;
                int var10 = arg3 >> 1;
                int var11 = arg2 >> 1;
                int[] var12 = arg1;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg6, var8, arg0, arg3, arg2, 0, arg7, arg4, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg3 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var12[var15++];
                            int var21 = var12[var15++];
                            int var22 = var12[var16++];
                            int var23 = var20 & 0xFF;
                            int var24 = (var20 & 0xFFF9) >> 8;
                            int var25 = (var20 & 0xFF6B87) >> 16;
                            int var26 = var20 >> 24 & 0xFF;
                            int var27 = var12[var16++];
                            int var28 = (var21 >> 24 & 0xFF) + var26;
                            int var29 = (var21 & 0xFF) + var23;
                            int var30 = (var21 >> 16 & 0xFF) + var25;
                            int var31 = ((var21 & 0xFFAB) >> 8) + var24;
                            int var32 = (var22 >> 24 & 0xFF) + var28;
                            int var33 = (var22 >> 8 & 0xFF) + var31;
                            int var34 = (var22 & 0xFF) + var29;
                            int var35 = (var22 >> 16 & 0xFF) + var30;
                            int var36 = ((var27 & 0xFF24) >> 8) + var33;
                            int var37 = ((var27 & 0xFFCD33) >> 16) + var35;
                            int var38 = (var27 & 0xFF) + var34;
                            int var39 = (var27 >> 24 & 0xFF) + var32;
                            var13[var14++] = class139.method776(class139.method776(class203.method1246(65280, var36 << 6), class139.method776(class203.method1246(var39, 1020) << 22, class203.method1246(1020, var37) << 14)), class203.method1246(255, var38 >> 2));
                        }
                        var16 += arg3;
                        var15 += arg3;
                    }
                    var13 = var12;
                    arg2 = var11;
                    var12 = var17;
                    arg3 = var10;
                    var9 >>= 0x1;
                    var11 >>= 0x1;
                    var8++;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V")
    public final void method725(boolean arg0, int arg1) {
        if (arg1 != -2536) {
            this.field7055 = null;
        }
        field7057++;
        int var3 = this.field7055.field4605.method1281((byte) -109, class466.field6460, this.field7055.field4617) + this.field7055.field4610;
        int var4 = this.field7055.field4608.method1586(class137.field1567, this.field7055.field4607, (byte) -52) + this.field7055.field4612;
        this.method148(var4, true, arg0, var3);
        this.method151((byte) 86, arg0, var3, var4);
        class211.field2561.method1128(215, var3 + (this.field7055.field4617 / 2), this.field7055.field4607 / 2 + var4 - -4, class412.field5471, this.field7055.field4609, -1);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BZII)V")
    public abstract void method151(byte arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)Z")
    public abstract boolean method152(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2814(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
