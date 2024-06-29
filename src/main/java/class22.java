import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class22 extends class23 {

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    private int field352 = 0;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    private int field359 = 4096;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[S")
    public static short[] field351 = new short[256];

    @OriginalMember(owner = "client!od", name = "L", descriptor = "Llc;")
    public static class143 field353 = class66.method374("(U5", -1);

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Llc;")
    private static class143 field360 = class66.method374("Please remove ", -1);

    @OriginalMember(owner = "client!od", name = "P", descriptor = "Llc;")
    public static class143 field356 = field360;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "Llc;")
    public static class143 field361 = field360;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "Llc;")
    public static class143 field363 = class66.method374("m", -1);

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "Lgf;")
    public static class7 field362;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method152(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field350;
        for (int var9 = 0; ~class90.field1628.field2376 < ~var9; ++var9) {
            int var11 = class90.field1628.field2368[var9] + -class245.field4412;
            int var12 = -class90.field1628.field2378[var9] + -1 + class25.field426 + class236.field4298;
            int var13 = arg2 - -((var11 - arg1) * (-arg2 + arg4) / (arg6 - arg1));
            int var14 = (-arg5 + arg3) * (-arg7 + var12) / (arg8 - arg7) + arg5;
            int var15 = class90.field1628.method810(3, var9);
            int var16 = 16777215;
            class102 var17 = null;
            if (var15 == 0) {
                if ((double) class5.field80 == 3.0D) {
                    var17 = class31.field506;
                }
                if ((double) class5.field80 == 4.0D) {
                    var17 = class135.field2377;
                }
                if ((double) class5.field80 == 6.0D) {
                    var17 = class245.field4395;
                }
                if ((double) class5.field80 == 8.0D) {
                    var17 = class118.field2096;
                }
            }
            if (var15 == 1) {
                if ((double) class5.field80 == 3.0D) {
                    var17 = class245.field4395;
                }
                if ((double) class5.field80 == 4.0D) {
                    var17 = class118.field2096;
                }
                if ((double) class5.field80 == 6.0D) {
                    var17 = class143.field2563;
                }
                if ((double) class5.field80 == 8.0D) {
                    var17 = class289.field5067;
                }
            }
            if (~var15 == -3) {
                if ((double) class5.field80 == 3.0D) {
                    var17 = class143.field2563;
                }
                var16 = 16755200;
                if ((double) class5.field80 == 4.0D) {
                    var17 = class289.field5067;
                }
                if ((double) class5.field80 == 6.0D) {
                    var17 = class268.field4803;
                }
                if ((double) class5.field80 == 8.0D) {
                    var17 = class248.field4450;
                }
            }
            if (class90.field1628.field2373[var9] != -1) {
                var16 = class90.field1628.field2373[var9];
            }
            if (var17 != null) {
                class143[] var18 = new class143[1 + class90.field1628.field2375[var9].method864(-8952, 60)];
                class256.field4608.method1326(class90.field1628.field2375[var9], (int[]) null, var18);
                int var19 = var18.length;
                int var20 = var14 - var17.method613() * (var19 - 1) / 2;
                int var21 = var20 + var17.method611() / 2;
                for (int var22 = 0; var19 > var22; ++var22) {
                    class143 var23 = ~(var19 + -1) != ~var22 ? var18[var22].method896(var18[var22].method913((byte) 45) + -4, 0, false) : var18[var22];
                    var17.method615(var23, var13, var21, var16, true);
                    var21 += var17.method613();
                }
            }
        }
        int var10 = 40 / ((arg0 - -64) / 37);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public static void method153(int arg0) {
        field353 = null;
        field360 = null;
        field351 = null;
        field362 = null;
        field356 = null;
        field363 = null;
        field361 = null;
        if (arg0 != 1) {
            method154(-16, 69, false, 73);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        if (arg1 != 1) {
            field360 = null;
        }
        ++field354;
        int[][] var3 = super.field366.method209(arg1 + -1, arg0);
        if (super.field366.field508) {
            int[][] var4 = this.method161(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class72.field1359 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field352 <= var12) {
                    if (~this.field359 > ~var12) {
                        var8[var11] = this.field359;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field352;
                }
                if (~var13 <= ~this.field352) {
                    if (~this.field359 > ~var13) {
                        var9[var11] = this.field359;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field352;
                }
                if (~this.field352 < ~var14) {
                    var10[var11] = this.field352;
                } else if (~this.field359 <= ~var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field359;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field357;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field373 = arg0.method1265(119) == 1;
                }
            } else {
                this.field359 = arg0.method1275(128);
            }
        } else {
            this.field352 = arg0.method1275(128);
        }
        if (!arg2) {
            field353 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 >= -13) {
            method152((byte) 51, 124, 95, -17, -106, -127, 70, 110, -92);
        }
        ++field358;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int[] var4 = this.method155(arg1, (byte) 115, 0);
            for (int var5 = 0; ~var5 > ~class72.field1359; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field352) {
                    var3[var5] = this.field352;
                } else if (this.field359 < var6) {
                    var3[var5] = this.field359;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZI)I")
    public static final int method154(int arg0, int arg1, boolean arg2, int arg3) {
        ++field355;
        class162 var4 = (class162) class143.field2518.method1824((long) arg1, arg3 ^ arg3);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; ~var4.field2916.length < ~var6; ++var6) {
                if (~var4.field2916[var6] <= -1 && class112.field1967 > var4.field2916[var6]) {
                    class148 var7 = class262.method1743(var4.field2916[var6], 17366);
                    if (var7.field2709 != null) {
                        class3 var8 = (class3) var7.field2709.method1824((long) arg0, arg3 ^ 60);
                        if (var8 != null) {
                            if (!arg2) {
                                var5 += var8.field49;
                            } else {
                                var5 += var4.field2911[var6] * var8.field49;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }
}
