import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class193 extends class139 {

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    private int field3798 = 4096;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
    private int field3806 = 4096;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    private int field3809 = 4096;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field3801 = 0;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "Lrf;")
    public static class163 field3797 = class53.method392(-85, "headicons_pk");

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "Lrf;")
    public static class163 field3805 = class53.method392(101, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[I")
    public static int[] field3795 = new int[500];

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field3796 = 0;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "Lrf;")
    private static class163 field3808 = class53.method392(108, "Use");

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lrf;")
    public static class163 field3794 = field3808;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static void method1289(int arg0) {
        field3797 = null;
        field3795 = null;
        field3808 = null;
        int var1 = -127 % ((-41 - arg0) / 47);
        field3805 = null;
        field3794 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg0 < 53) {
            method1291(33, -101, 83, -47L);
        }
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[][] var4 = this.method910((byte) -42, arg1, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class23.field402 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var12 == var14 && ~var13 == ~var14) {
                    var8[var11] = this.field3798 * var12 >> 12;
                    var9[var11] = this.field3809 * var14 >> 12;
                    var10[var11] = this.field3806 * var13 >> 12;
                } else {
                    var8[var11] = this.field3798;
                    var9[var11] = this.field3809;
                    var10[var11] = this.field3806;
                }
            }
        }
        ++field3802;
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(II)V")
    public static final void method1290(int arg0, int arg1) {
        ++field3799;
        int[] var2 = class64.field1346.field3370;
        int var3 = var2.length;
        int var4 = 0;
        if (arg1 != -7042) {
            method1291(77, -17, -4, -85L);
        }
        while (~var4 > ~var3) {
            var2[var4] = 1;
            ++var4;
        }
        for (int var5 = 1; ~var5 > -104; ++var5) {
            int var20 = 24628 - -((103 - var5) * 512 * 4);
            for (int var21 = 1; ~var21 > -104; ++var21) {
                if ((24 & class21.field372[arg0][var21][var5]) == 0) {
                    class52.method343(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && ~(class21.field372[arg0 + 1][var21][var5] & 8) != -1) {
                    class52.method343(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = (int) (20.0D * Math.random()) + 238 - (10 - (228 - -((int) (Math.random() * 20.0D)) << 16) - (238 - (-((int) (20.0D * Math.random())) - -10) << 8));
        class64.field1346.method1111();
        int var7 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
        for (int var8 = 1; ~var8 > -104; ++var8) {
            for (int var19 = 1; var19 < 103; ++var19) {
                if ((class21.field372[arg0][var19][var8] & 24) == 0) {
                    class49.method299(arg0, var7, 2, var19, var6, var8);
                }
                if (arg0 < 3 && ~(class21.field372[arg0 + 1][var19][var8] & 8) != -1) {
                    class49.method299(arg0 - -1, var7, arg1 + 7044, var19, var6, var8);
                }
            }
        }
        class118.field2504 = 0;
        for (int var9 = 0; var9 < 104; ++var9) {
            for (int var10 = 0; var10 < 104; ++var10) {
                long var11 = class48.method294(class60.field1227, var9, var10);
                if (~var11 != -1L) {
                    int var13 = class199.method1314((byte) 127, Integer.MAX_VALUE & (int) (var11 >>> 32)).field1285;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (~var13 != -23 && var13 != 29 && ~var13 != -35 && var13 != 36 && var13 != 46 && var13 != 47 && ~var13 != -49) {
                            int[][] var16 = class103.field2163[class60.field1227].field2736;
                            for (int var17 = 0; ~var17 > -11; ++var17) {
                                int var18 = (int) (4.0D * Math.random());
                                if (var18 == 0 && var14 > 0 && var14 > var9 + -3 && (19661064 & var16[var14 - 1][var15]) == 0) {
                                    --var14;
                                }
                                if (var18 == 1 && ~var14 > -104 && var14 < var9 + 3 && ~(19661184 & var16[var14 - -1][var15]) == -1) {
                                    ++var14;
                                }
                                if (var18 == 2 && var15 > 0 && var10 + -3 < var15 && (19661058 & var16[var14][var15 + -1]) == 0) {
                                    --var15;
                                }
                                if (~var18 == -4 && ~var15 > -104 && ~var15 > ~(var10 + 3) && (var16[var14][var15 - -1] & 19661088) == 0) {
                                    ++var15;
                                }
                            }
                        }
                        class122.field2565[class118.field2504] = class41.field832[var13];
                        class43.field869[class118.field2504] = var14;
                        class29.field544[class118.field2504] = var15;
                        ++class118.field2504;
                    }
                }
            }
        }
        class31.field622.method905(1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1291(int arg0, int arg1, int arg2, long arg3) {
        class111 var5 = class97.field2054[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2345 != null && var5.field2345.field1520 == arg3) {
            return true;
        } else if (var5.field2346 != null && var5.field2346.field2573 == arg3) {
            return true;
        } else if (var5.field2357 != null && var5.field2357.field192 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2359; ++var6) {
                if (var5.field2344[var6].field2536 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 != 21) {
            method1289(-44);
        }
        ++field3800;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3806 = arg2.method390((byte) 102);
                }
            } else {
                this.field3809 = arg2.method390((byte) 114);
            }
        } else {
            this.field3798 = arg2.method390((byte) 97);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, false);
    }
}
