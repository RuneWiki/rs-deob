import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class162 extends class167 {

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "Z")
    private boolean field2959 = true;

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "I")
    private int field2965 = 4096;

    @OriginalMember(owner = "client!oi", name = "cb", descriptor = "Z")
    public static boolean field2967 = false;

    @OriginalMember(owner = "client!oi", name = "bb", descriptor = "Lkh;")
    public static class117 field2966 = class224.method1450((byte) -27, "scape main");

    @OriginalMember(owner = "client!oi", name = "eb", descriptor = "Lkh;")
    private static class117 field2969 = class224.method1450((byte) 113, " has logged out)3");

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "Lkh;")
    public static class117 field2961 = field2969;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!oi", name = "db", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static final void method1154(int arg0) {
        int var1 = class159.field2899 * 128 + 64;
        ++field2962;
        int var2 = class195.field3476 * 128 + 64;
        int var3 = class186.method1265(true, var2, class203.field3675, var1) - class90.field1674;
        if (class186.field3339 < var2) {
            class186.field3339 += (-class186.field3339 + var2) * class181.field3272 / 1000 + field2960;
            if (var2 < class186.field3339) {
                class186.field3339 = var2;
            }
        }
        if (~var1 < ~class19.field535) {
            class19.field535 += field2960 - -((-class19.field535 + var1) * class181.field3272 / 1000);
            if (~class19.field535 < ~var1) {
                class19.field535 = var1;
            }
        }
        if (var3 > class31.field732) {
            class31.field732 += (var3 - class31.field732) * class181.field3272 / 1000 + field2960;
            if (class31.field732 > var3) {
                class31.field732 = var3;
            }
        }
        if (~var1 > ~class19.field535) {
            class19.field535 -= (-var1 + class19.field535) * class181.field3272 / 1000 + field2960;
            if (class19.field535 < var1) {
                class19.field535 = var1;
            }
        }
        int var4 = class82.field1554 * 128 + 64;
        if (var2 < class186.field3339) {
            class186.field3339 -= field2960 - -((-var2 + class186.field3339) * class181.field3272 / 1000);
            if (class186.field3339 < var2) {
                class186.field3339 = var2;
            }
        }
        int var5 = class53.field1103 * 128 + 64;
        if (class31.field732 > var3) {
            class31.field732 -= (-var3 + class31.field732) * class181.field3272 / 1000 + field2960;
            if (var3 > class31.field732) {
                class31.field732 = var3;
            }
        }
        int var6 = class186.method1265(true, var5, class203.field3675, var4) - class234.field4218;
        int var7 = -class31.field732 + var6;
        int var8 = 55 % ((-19 - arg0) / 43);
        int var9 = -class19.field535 + var4;
        int var10 = -class186.field3339 + var5;
        int var11 = (int) Math.sqrt((double) (var9 * var9 - -(var10 * var10)));
        int var12 = 2047 & (int) (Math.atan2((double) var7, (double) var11) * 325.949D);
        if (~var12 > -129) {
            var12 = 128;
        }
        int var13 = 2047 & (int) (Math.atan2((double) var9, (double) var10) * -325.949D);
        int var14 = -class86.field1626 + var13;
        if (var12 > 383) {
            var12 = 383;
        }
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (~var14 > 1023) {
            var14 += 2048;
        }
        if (class150.field2726 < var12) {
            class150.field2726 += (-class150.field2726 + var12) * class18.field530 / 1000 + class211.field3794;
            if (~var12 > ~class150.field2726) {
                class150.field2726 = var12;
            }
        }
        if (var12 < class150.field2726) {
            class150.field2726 -= (-var12 + class150.field2726) * class18.field530 / 1000 + class211.field3794;
            if (var12 > class150.field2726) {
                class150.field2726 = var12;
            }
        }
        if (~var14 < -1) {
            class86.field1626 += class18.field530 * var14 / 1000 + class211.field3794;
            class86.field1626 &= 2047;
        }
        if (~var14 > -1) {
            class86.field1626 -= class211.field3794 - -(-var14 * class18.field530 / 1000);
            class86.field1626 &= 2047;
        }
        int var15 = -class86.field1626 + var13;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (~var15 > -1 && var14 > 0 || ~var15 < -1 && var14 < 0) {
            class86.field1626 = var13;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class157.method1114(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class140.method955(var6 + 1, class156.field2839[arg0][arg1][arg3] + arg5, var7 + 1) && class140.method955(var6 + 128 - 1, class156.field2839[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class140.method955(var6 + 128 - 1, class156.field2839[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class140.method955(var6 + 1, class156.field2839[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class53.field1099[arg0][var8][var14] == -class8.field146) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class156.field2839[arg0][arg1][arg3] + arg5;
            if (!class140.method955(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class140.method955(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class140.method955(var9, var11, var13)) {
                        return false;
                    } else if (!class140.method955(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != -9179) {
            method1157((byte) 115);
        }
        ++field2968;
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int[] var4 = this.method1186(arg0 - 1 & class101.field1839, arg1 + 9179, 0);
            int[] var5 = this.method1186(arg0, 0, 0);
            int[] var6 = this.method1186(class101.field1839 & arg0 + 1, 0, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class115.field2146 < ~var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field2965;
                int var12 = (var5[var10 + 1 & class34.field801] + -var5[var10 - 1 & class34.field801]) * this.field2965;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                    var18 = var12 / var17;
                }
                if (this.field2959) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class162() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(JB)Lkh;")
    public static final class117 method1156(long arg0, byte arg1) {
        ++field2963;
        if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 13 % ((arg1 - 59) / 45);
                int var4 = 0;
                for (long var5 = arg0; ~var5 != -1L; var5 /= 37L) {
                    ++var4;
                }
                byte[] var7 = new byte[var4];
                while (~arg0 != -1L) {
                    long var9 = arg0;
                    arg0 /= 37L;
                    --var4;
                    var7[var4] = class229.field4129[(int) (-(arg0 * 37L) + var9)];
                }
                class117 var8 = new class117();
                var8.field2196 = var7;
                var8.field2213 = var7.length;
                return var8;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field2958;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field2959 = ~arg0.method998(71) == -2;
            }
        } else {
            this.field2965 = arg0.method1049((byte) 101);
        }
        if (arg1) {
            method1156(-18L, (byte) 58);
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(B)V")
    public static void method1157(byte arg0) {
        field2969 = null;
        int var1 = -52 / ((68 - arg0) / 57);
        field2961 = null;
        field2966 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLk;III)V")
    public static final void method1158(boolean arg0, class109 arg1, int arg2, int arg3, int arg4) {
        ++field2964;
        if (~class100.field1825 > -401) {
            if (arg1.field2034 != null) {
                arg1 = arg1.method733(false);
            }
            if (arg1 != null) {
                if (arg1.field2050) {
                    if (!arg0) {
                        class117 var5 = arg1.field2044;
                        if (~arg1.field2049 != -1) {
                            var5 = class36.method316((byte) -34, new class117[] { var5, class88.method605(arg1.field2049, (byte) 35, class93.field1712.field1149), class39.field896, class240.field4348, class42.method358(arg1.field2049, (byte) 34), class111.field2095 });
                        }
                        if (class86.field1623 == 1) {
                            class61.method450(-25300, (long) arg4, class10.field358, arg3, (short) 50, arg2, class36.method316((byte) -34, new class117[] { class120.field2264, class98.field1805, var5 }));
                            ++class136.field2440;
                        } else {
                            if (class82.field1543) {
                                if ((class234.field4231 & 2) == 2) {
                                    class61.method450(-25300, (long) arg4, class38.field878, arg3, (short) 41, arg2, class36.method316((byte) -34, new class117[] { class80.field1509, class98.field1805, var5 }));
                                    ++class100.field1822;
                                    return;
                                }
                            } else {
                                ++class3.field21;
                                class117[] var6 = arg1.field2053;
                                if (class159.field2909) {
                                    var6 = class149.method1067(true, var6);
                                }
                                if (var6 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (var6[var7] != null && (class176.field3172 != 0 || !var6[var7].method789(class4.field52, -125))) {
                                            ++class49.field1023;
                                            byte var8 = 0;
                                            if (~var7 == -1) {
                                                var8 = 34;
                                            }
                                            if (~var7 == -2) {
                                                var8 = 19;
                                            }
                                            if (var7 == 2) {
                                                var8 = 39;
                                            }
                                            if (~var7 == -4) {
                                                var8 = 43;
                                            }
                                            if (~var7 == -5) {
                                                var8 = 17;
                                            }
                                            class61.method450(-25300, (long) arg4, var6[var7], arg3, var8, arg2, class36.method316((byte) -34, new class117[] { class216.field3930, var5 }));
                                        }
                                    }
                                }
                                if (class176.field3172 == 0 && var6 != null) {
                                    for (int var9 = 4; var9 >= 0; --var9) {
                                        if (var6[var9] != null && var6[var9].method789(class4.field52, -125)) {
                                            ++class221.field3985;
                                            short var10 = 0;
                                            short var11 = 0;
                                            if (~var9 == -1) {
                                                var11 = 34;
                                            }
                                            if (~class93.field1712.field1149 > ~arg1.field2049) {
                                                var10 = 2000;
                                            }
                                            if (~var9 == -2) {
                                                var11 = 19;
                                            }
                                            if (var9 == 2) {
                                                var11 = 39;
                                            }
                                            if (var9 == 3) {
                                                var11 = 43;
                                            }
                                            if (~var9 == -5) {
                                                var11 = 17;
                                            }
                                            if (var11 != 0) {
                                                var11 += var10;
                                            }
                                            class61.method450(-25300, (long) arg4, var6[var9], arg3, var11, arg2, class36.method316((byte) -34, new class117[] { class216.field3930, var5 }));
                                        }
                                    }
                                }
                                class61.method450(-25300, (long) arg4, class36.field828, arg3, (short) 1006, arg2, class36.method316((byte) -34, new class117[] { class216.field3930, var5 }));
                            }
                        }
                    }
                }
            }
        }
    }
}
