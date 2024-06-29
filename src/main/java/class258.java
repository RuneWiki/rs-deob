import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class258 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lqj;")
    private static class196 field4510 = class80.method502("Loading config )2 ", -48);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lqj;")
    public static class196 field4511 = field4510;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lea;")
    public static class243 field4508 = new class243();

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lqj;")
    public static class196 field4517 = class80.method502("Hidden)2", -48);

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Lqj;")
    private static class196 field4521 = class80.method502("Starting 3d library", -48);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lqj;")
    public static class196 field4523 = field4521;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lai;")
    public static class77 field4519;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lnb;")
    public static class95 field4518;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
    public static int[] field4524;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[Lub;")
    public static class43[] field4520;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lpe;")
    public class258 method1419(int arg0, int arg1, int arg2) {
        field4515++;
        return this;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
    public static final void method1733() {
        int var0 = class61.field813[class218.field3913];
        class175[] var1 = class61.field811[class218.field3913];
        class93.field1362 = 0;
        label191: for (int var2 = 0; var2 < var0; var2++) {
            class175 var3 = var1[var2];
            if (class218.field3917 != null) {
                for (int var4 = 0; var4 < class218.field3917.length; var4++) {
                    if (class218.field3917[var4] != -1000000 && (var3.field2954 <= class218.field3917[var4] || var3.field2952 <= class218.field3917[var4]) && (var3.field2942 <= class217.field3902[var4] || var3.field2948 <= class217.field3902[var4]) && (var3.field2942 >= class134.field1906[var4] || var3.field2948 >= class134.field1906[var4]) && (var3.field2950 <= class242.field4301[var4] || var3.field2960 <= class242.field4301[var4]) && (var3.field2950 >= class154.field2487[var4] || var3.field2960 >= class154.field2487[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field2963 == 1) {
                int var5 = var3.field2955 + class168.field2827 - class71.field1006;
                if (var5 >= 0 && var5 <= class168.field2827 + class168.field2827) {
                    int var6 = var3.field2953 + class168.field2827 - class238.field4236;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field2958 + class168.field2827 - class238.field4236;
                    if (var7 > class168.field2827 + class168.field2827) {
                        var7 = class168.field2827 + class168.field2827;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class195.field3423[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class202.field3586 - var3.field2942;
                        if (var9 > 32) {
                            var3.field2945 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field2945 = 2;
                            var9 = -var9;
                        }
                        var3.field2939 = (var3.field2950 - class224.field4012 << 8) / var9;
                        var3.field2962 = (var3.field2960 - class224.field4012 << 8) / var9;
                        var3.field2959 = (var3.field2954 - class253.field4483 << 8) / var9;
                        var3.field2940 = (var3.field2952 - class253.field4483 << 8) / var9;
                        class197.field3497[class93.field1362++] = var3;
                    }
                }
            } else if (var3.field2963 == 2) {
                int var10 = var3.field2953 + class168.field2827 - class238.field4236;
                if (var10 >= 0 && var10 <= class168.field2827 + class168.field2827) {
                    int var11 = var3.field2955 + class168.field2827 - class71.field1006;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field2961 + class168.field2827 - class71.field1006;
                    if (var12 > class168.field2827 + class168.field2827) {
                        var12 = class168.field2827 + class168.field2827;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class195.field3423[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class224.field4012 - var3.field2950;
                        if (var14 > 32) {
                            var3.field2945 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field2945 = 4;
                            var14 = -var14;
                        }
                        var3.field2956 = (var3.field2942 - class202.field3586 << 8) / var14;
                        var3.field2957 = (var3.field2948 - class202.field3586 << 8) / var14;
                        var3.field2959 = (var3.field2954 - class253.field4483 << 8) / var14;
                        var3.field2940 = (var3.field2952 - class253.field4483 << 8) / var14;
                        class197.field3497[class93.field1362++] = var3;
                    }
                }
            } else if (var3.field2963 == 4) {
                int var15 = var3.field2954 - class253.field4483;
                if (var15 > 128) {
                    int var16 = var3.field2953 + class168.field2827 - class238.field4236;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field2958 + class168.field2827 - class238.field4236;
                    if (var17 > class168.field2827 + class168.field2827) {
                        var17 = class168.field2827 + class168.field2827;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field2955 + class168.field2827 - class71.field1006;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field2961 + class168.field2827 - class71.field1006;
                        if (var19 > class168.field2827 + class168.field2827) {
                            var19 = class168.field2827 + class168.field2827;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class195.field3423[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field2945 = 5;
                            var3.field2956 = (var3.field2942 - class202.field3586 << 8) / var15;
                            var3.field2957 = (var3.field2948 - class202.field3586 << 8) / var15;
                            var3.field2939 = (var3.field2950 - class224.field4012 << 8) / var15;
                            var3.field2962 = (var3.field2960 - class224.field4012 << 8) / var15;
                            class197.field3497[class93.field1362++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()Z")
    public boolean method1435() {
        field4507++;
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method1734(boolean arg0) {
        field4523 = null;
        field4508 = null;
        field4510 = null;
        field4519 = null;
        field4520 = null;
        field4521 = null;
        field4511 = null;
        field4517 = null;
        if (arg0) {
            method1735(-56, -28, 14);
        }
        field4518 = null;
        field4524 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    public void method948(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 1) {
            field4518 = null;
        }
        field4516++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)I")
    public static final int method1735(int arg0, int arg1, int arg2) {
        field4514++;
        long var3 = (long) ((arg2 << 16) + arg0);
        if (class132.field1888 != null && class132.field1888.field1850 == var3) {
            if (arg1 != 0) {
                field4521 = null;
            }
            return class253.field4481.field699 * 99 / (class253.field4481.field693.length - class132.field1888.field3210) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lpe;IIIZ)V")
    public void method1443(class258 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4509++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4513++;
        int var8 = arg1 + arg5;
        int var9 = arg0 - arg5;
        int var10 = arg4 + arg5;
        for (int var11 = arg1; var11 < var8; var11++) {
            class25.method147(arg2, 7, arg4, class95.field1380[var11], arg3);
        }
        int var12 = arg3 - arg5;
        for (int var13 = arg0; var13 > var9; var13--) {
            class25.method147(arg2, 7, arg4, class95.field1380[var13], arg3);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class95.field1380[var14];
            class25.method147(arg2, arg7 + 5510, arg4, var15, var10);
            class25.method147(arg6, 7, var10, var15, var12);
            class25.method147(arg2, 7, var12, var15, arg3);
        }
        if (arg7 != -5503) {
            method1734(true);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
    public abstract int method266();
}
