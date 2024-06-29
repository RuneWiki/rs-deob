import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class75 extends class194 {

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "Z")
    public static boolean field905 = true;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Lcq;")
    public static class72 field904 = new class72("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
    public static int[] field916 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Lwo;")
    public static class285 field909;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "[Lwb;")
    private class119[] field907;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "[Lip;")
    public static class279[] field915;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B[[I)V")
    private final void method441(byte arg0, int[][] arg1) {
        ++field910;
        int var3 = class138.field1579;
        int var4 = class250.field3286;
        if (arg0 < -98) {
            class22.method139(-53, arg1);
            class367.method2321(class210.field2551, -25485, 0, class442.field6113, 0);
            if (this.field907 != null) {
                for (int var5 = 0; ~this.field907.length < ~var5; ++var5) {
                    class119 var6 = this.field907[var5];
                    int var7 = var6.field1378;
                    int var8 = var6.field1376;
                    if (var7 >= 0) {
                        if (~var8 > -1) {
                            var6.method795((byte) -33, var4, var3);
                        } else {
                            var6.method796(var3, (byte) -74, var4);
                        }
                    } else if (var8 >= 0) {
                        var6.method793(-1, var4, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(JI)V")
    public static final void method442(long arg0, int arg1) {
        ++field911;
        int var3 = class225.field2856;
        if (~class277.field3583 != ~var3) {
            int var4 = var3 - class277.field3583;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (~var4 < -1) {
                if (~var5 == -1) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (~var5 > ~var4) {
                var5 = var4;
            }
            class277.field3583 += var5;
        }
        int var6 = class347.field4725;
        if (arg1 != 32466) {
            field905 = true;
        }
        if (class374.field5069 != var6) {
            int var7 = -class374.field5069 + var6;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (~var7 >= -1) {
                if (~var8 == -1) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 != 0) {
                if (~var8 < ~var7) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class374.field5069 += var8;
        }
        if (!class244.field3246) {
            class301.field4020 += (float) arg0 * class49.field571 / 40.0F * 8.0F;
            class434.field5929 += (float) arg0 * class288.field3792 / 40.0F * 8.0F;
        }
        class355.method2248(-21491);
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(III)V")
    public static final void method443(int arg0, int arg1, int arg2) {
        boolean var3 = class347.field4722[0][arg1][arg2] != null && class347.field4722[0][arg1][arg2].field4271 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class347.field4722[var4][arg1][arg2] == null) {
                class316 var5 = class347.field4722[var4][arg1][arg2] = new class316(var4, arg1, arg2);
                if (var3) {
                    ++var5.field4250;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static final void method444(byte arg0) {
        class365 var1 = class183.field2122;
        synchronized (class183.field2122) {
            class183.field2122.method2290(13831);
        }
        if (arg0 > 37) {
            ++field917;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lwo;I)V")
    public static final void method445(class285 arg0, int arg1) {
        if (arg1 != -26311) {
            field909 = null;
        }
        ++field914;
        class310.field4201 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field906;
        int var4 = -94 / ((52 - arg1) / 61);
        if (~arg0 == -1) {
            this.field907 = new class119[arg2.method1563(-128)];
            for (int var5 = 0; ~var5 > ~this.field907.length; ++var5) {
                int var6 = arg2.method1563(-128);
                if (~var6 != -1) {
                    if (var6 != 1) {
                        if (~var6 != -3) {
                            if (var6 == 3) {
                                this.field907[var5] = class212.method1296(arg2, 261308);
                            }
                        } else {
                            this.field907[var5] = class208.method1279(12929, arg2);
                        }
                    } else {
                        this.field907[var5] = class291.method1862(false, arg2);
                    }
                } else {
                    this.field907[var5] = class2.method11(arg2, (byte) 117);
                }
            }
        } else if (arg0 == 1) {
            super.field2278 = ~arg2.method1563(-128) == -2;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field913;
        int[][] var3 = super.field2283.method1667(arg1, -73);
        if (super.field2283.field3451) {
            int var4 = class138.field1579;
            int var5 = class250.field3286;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2283.method1669(-126);
            this.method441((byte) -114, var6);
            for (int var8 = 0; var8 < class250.field3286; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class138.field1579; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class191.method1183(var15, 255) << 4;
                    var12[var14] = class191.method1183(var15, 65280) >> 4;
                    var11[var14] = class191.method1183(4080, var15 >> 12);
                }
            }
        }
        return arg0 != -730 ? null : var3;
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V")
    public static void method446(int arg0) {
        if (arg0 != 99) {
            field904 = null;
        }
        field904 = null;
        field909 = null;
        field915 = null;
        field916 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field912;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = 66 % ((arg1 - 57) / 46);
        if (super.field2292.field3708) {
            this.method441((byte) -115, super.field2292.method1780((byte) 98));
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Lrn;")
    public static final class214 method447(int arg0, byte arg1) {
        ++field908;
        class214 var2 = (class214) class280.field3629.method2295((long) arg0, (byte) 74);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class363.field4935.method1794(5860, 1, arg0);
            if (arg1 != 81) {
                field916 = null;
            }
            class214 var4 = new class214();
            if (var3 != null) {
                var4.method1313(867, arg0, new class242(var3));
            }
            class280.field3629.method2294(var4, (byte) 87, (long) arg0);
            return var4;
        }
    }
}
