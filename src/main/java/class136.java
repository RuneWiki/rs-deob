import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class136 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2552 = 4;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[[Lqi;")
    public static class183[][] field2555 = new class183[field2552][500];

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lmb;")
    private static class132 field2554 = class166.method1092("This world is full)3", 123);

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lmb;")
    public static class132 field2557 = class166.method1092("<br>(X100(U(Y", 126);

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lmb;")
    public static class132 field2564 = field2554;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
    public static int[] field2562 = new int[field2552];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lla;")
    public static class120 field2563;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lvc;")
    public static class227 field2550;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "[Lsf;")
    public static class200[] field2558;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method925(byte arg0) {
        field2557 = null;
        field2554 = null;
        field2562 = null;
        field2558 = null;
        field2550 = null;
        field2563 = null;
        field2555 = null;
        field2564 = null;
        if (arg0 != -10) {
            field2554 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Lmf;")
    public class136 method474(int arg0, int arg1, int arg2) {
        field2565++;
        return this;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lmf;IIIZ)V")
    public void method463(class136 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2548++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method926(Component arg0, int arg1) {
        Method var2 = class83.field1387;
        field2551++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        int var3 = 27 / ((arg1 + 13) / 56);
        arg0.addKeyListener(class57.field964);
        arg0.addFocusListener(class57.field964);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BII)Lmb;")
    public static final class132 method927(byte arg0, int arg1, int arg2) {
        field2549++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return class162.field2943;
        } else if (var3 < -6) {
            return class125.field2331;
        } else if (var3 < -3) {
            return class203.field3724;
        } else if (var3 < 0) {
            return class226.field4096;
        } else if (var3 > 9) {
            return class196.field3639;
        } else {
            if (arg0 < 104) {
                method927((byte) -105, 119, 51);
            }
            if (var3 > 6) {
                return class196.field3640;
            } else if (var3 > 3) {
                return class54.field910;
            } else if (var3 > 0) {
                return class208.field3788;
            } else {
                return class131.field2428;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)Z")
    public static final boolean method928(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class128.field2379; var3++) {
            class183 var4 = class182.field3349[var3];
            if (var4.field3365 == 1) {
                int var5 = var4.field3368 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3356 * var5 >> 8) + var4.field3366;
                    int var7 = (var4.field3364 * var5 >> 8) + var4.field3354;
                    int var8 = (var4.field3369 * var5 >> 8) + var4.field3367;
                    int var9 = (var4.field3353 * var5 >> 8) + var4.field3363;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3365 == 2) {
                int var10 = arg0 - var4.field3368;
                if (var10 > 0) {
                    int var11 = (var4.field3356 * var10 >> 8) + var4.field3366;
                    int var12 = (var4.field3364 * var10 >> 8) + var4.field3354;
                    int var13 = (var4.field3369 * var10 >> 8) + var4.field3367;
                    int var14 = (var4.field3353 * var10 >> 8) + var4.field3363;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3365 == 3) {
                int var15 = var4.field3366 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3371 * var15 >> 8) + var4.field3368;
                    int var17 = (var4.field3355 * var15 >> 8) + var4.field3358;
                    int var18 = (var4.field3369 * var15 >> 8) + var4.field3367;
                    int var19 = (var4.field3353 * var15 >> 8) + var4.field3363;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3365 == 4) {
                int var20 = arg2 - var4.field3366;
                if (var20 > 0) {
                    int var21 = (var4.field3371 * var20 >> 8) + var4.field3368;
                    int var22 = (var4.field3355 * var20 >> 8) + var4.field3358;
                    int var23 = (var4.field3369 * var20 >> 8) + var4.field3367;
                    int var24 = (var4.field3353 * var20 >> 8) + var4.field3363;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3365 == 5) {
                int var25 = arg1 - var4.field3367;
                if (var25 > 0) {
                    int var26 = (var4.field3371 * var25 >> 8) + var4.field3368;
                    int var27 = (var4.field3355 * var25 >> 8) + var4.field3358;
                    int var28 = (var4.field3356 * var25 >> 8) + var4.field3366;
                    int var29 = (var4.field3364 * var25 >> 8) + var4.field3354;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()I")
    public abstract int method55();

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BI)V")
    public static final void method929(byte[] arg0, int arg1) {
        int var2 = class122.field2281 >> 2 << 10;
        if (arg1 != -1) {
            field2560 = -114;
        }
        field2553++;
        int var3 = 0;
        int var4 = class46.field789 >> 1;
        byte[][] var5 = new byte[class192.field3586][class113.field2188];
        while (true) {
            while (var3 < arg0.length) {
                int var34 = (arg0[var3++] & 0xFF) * 64 - class28.field451;
                int var35 = (arg0[var3++] & 0xFF) * 64 - class141.field2632;
                if (var34 > 0 && var35 > 0 && var34 + 64 < class192.field3586 && var35 + 64 < class113.field2188) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var5[var34 + var36];
                        int var38 = class113.field2188 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg0[var3++];
                        }
                    }
                } else {
                    var3 += 4096;
                }
            }
            int var6 = class192.field3586;
            int var7 = class113.field2188;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var28 < var6) {
                        int var29 = var5[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class2 var30 = class23.method152(true, var29 - 1);
                            var8[var14] += var30.field26;
                            var9[var14] += var30.field23;
                            var12[var14] += var30.field14;
                            var10[var14] += var30.field34;
                            var10002 = var11[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var5[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class2 var33 = class23.method152(true, var32 - 1);
                            var8[var14] -= var33.field26;
                            var9[var14] -= var33.field23;
                            var12[var14] -= var33.field14;
                            var10[var14] -= var33.field34;
                            var10002 = var11[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class52.field886[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        int var23 = var21 - 5;
                        if (var22 < var7) {
                            var18 += var12[var22];
                            var17 += var9[var22];
                            var19 += var10[var22];
                            var16 += var8[var22];
                            var20 += var11[var22];
                        }
                        if (var23 >= 0) {
                            var17 -= var9[var23];
                            var16 -= var8[var23];
                            var20 -= var11[var23];
                            var18 -= var12[var23];
                            var19 -= var10[var23];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var19 == 0 ? 0 : class135.method924(var16 * 256 / var19, 217, var18 / var20, var17 / var20);
                            if (var5[var13][var21] != 0) {
                                int var26 = (var25 & 0x7F) + var4;
                                if (var15[var24] == null) {
                                    var15[var24] = class52.field886[var13 >> 6][var24] = new int[4096];
                                }
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var2 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                                var15[var24][class75.method450(var13, 63) + class75.method450(var21 << 6, 4032)] = class50.field857[class232.method1473(var27, 96, true)];
                            } else if (var15[var24] != null) {
                                var15[var24][class75.method450(var13, 63) + class75.method450(var21 << 6, 4032)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()Z")
    public boolean method467() {
        field2556++;
        return false;
    }
}
