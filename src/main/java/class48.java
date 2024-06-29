import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class48 {

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Lpb;")
    public class235 field806 = new class235();

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lgj;")
    public static class226 field801 = new class226(20);

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lsb;")
    public static class98 field808 = class47.method368("Schrifts-=tze geladen)3", 0);

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field810 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lpb;")
    private class235 field809;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Lpb;")
    public final class235 method370(boolean arg0) {
        field803++;
        class235 var2 = this.field809;
        if (this.field806 == var2) {
            this.field809 = null;
            return null;
        } else if (arg0) {
            this.field809 = var2.field4069;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lpb;")
    public final class235 method371(byte arg0) {
        field807++;
        class235 var2 = this.field806.field4069;
        if (this.field806 == var2) {
            this.field809 = null;
            return null;
        }
        if (arg0 != 61) {
            method377(-110, (class216) null);
        }
        this.field809 = var2.field4069;
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Lpb;")
    public final class235 method372(int arg0) {
        field804++;
        class235 var2 = this.field806.field4069;
        if (arg0 != 63) {
            return null;
        } else if (this.field806 == var2) {
            return null;
        } else {
            var2.method1611((byte) -126);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Lpb;")
    public final class235 method373(byte arg0) {
        int var2 = 106 / ((-arg0 - 44) / 37);
        class235 var3 = this.field806.field4067;
        field797++;
        if (this.field806 == var3) {
            this.field809 = null;
            return null;
        } else {
            this.field809 = var3.field4067;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public static void method374(boolean arg0) {
        field801 = null;
        field808 = null;
        if (arg0) {
            method377(-91, (class216) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lpb;")
    public final class235 method375(int arg0) {
        field793++;
        class235 var2 = this.field809;
        if (this.field806 == var2) {
            this.field809 = null;
            return null;
        }
        if (arg0 != 8) {
            field801 = null;
        }
        this.field809 = var2.field4067;
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLpb;)V")
    public final void method376(byte arg0, class235 arg1) {
        field805++;
        if (arg1.field4067 != null) {
            arg1.method1611((byte) 42);
        }
        arg1.field4067 = this.field806.field4067;
        arg1.field4069 = this.field806;
        arg1.field4067.field4069 = arg1;
        arg1.field4069.field4067 = arg1;
        if (arg0 != 13) {
            method377(-25, (class216) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILlj;)V")
    public static final void method377(int arg0, class216 arg1) {
        field794++;
        int var2 = class117.field2090 >> 2 << 10;
        int var3 = class114.field2045 >> 1;
        byte[][] var4 = new byte[class140.field2488][class148.field2743];
        while (arg1.field3706.length > arg1.field3728) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method1446(5350) == 1) {
                var33 = true;
                var35 = arg1.method1446(5350);
                var34 = arg1.method1446(5350);
            }
            int var36 = arg1.method1446(5350);
            int var37 = arg1.method1446(5350);
            int var38 = var36 * 64 - class51.field830;
            int var39 = class148.field2743 - (var37 * 64 - class255.field4470) - 1;
            if (var38 >= 0 && (var39 - 63) >= 0 && var38 + 63 < class140.field2488 && class148.field2743 > var39) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var35 * 8 <= var40 && (var35 * 8 + 8) > var40 && (var34 * 8) <= var42 && var34 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg1.method1472(64);
                        }
                    }
                }
            } else if (var33) {
                arg1.field3728 += 64;
            } else {
                arg1.field3728 += 4096;
            }
        }
        int var5 = class140.field2488;
        int var6 = class148.field2743;
        int[] var7 = new int[var6];
        if (arg0 > -1) {
            method377(82, (class216) null);
        }
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class45 var29 = class138.method1036(-28994, var28 - 1);
                        var8[var13] += var29.field761;
                        var10[var13] += var29.field756;
                        var7[var13] += var29.field759;
                        var9[var13] += var29.field753;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class45 var32 = class138.method1036(-28994, var31 - 1);
                        var8[var13] -= var32.field761;
                        var10[var13] -= var32.field756;
                        var7[var13] -= var32.field759;
                        var9[var13] -= var32.field753;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class233.field4018[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 - 5;
                    int var22 = var20 + 5;
                    if (var6 > var22) {
                        var18 += var9[var22];
                        var19 += var11[var22];
                        var17 += var7[var22];
                        var14 += var8[var22];
                        var16 += var10[var22];
                    }
                    if (var21 >= 0) {
                        var14 -= var8[var21];
                        var19 -= var11[var21];
                        var16 -= var10[var21];
                        var17 -= var7[var21];
                        var18 -= var9[var21];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class13.method112(var16 / var19, var17 / var19, 89, var14 * 256 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class214.method1427(4032, var20 << 6) + class214.method1427(63, var12)] = class160.field2895[client.method766(var26, (byte) 107, 96)];
                        } else if (var23 != null) {
                            var23[class214.method1427(var12, 63) + (class214.method1427(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lpb;I)V")
    public final void method378(class235 arg0, int arg1) {
        field802++;
        if (arg0.field4067 != null) {
            arg0.method1611((byte) -127);
        }
        arg0.field4069 = this.field806.field4069;
        arg0.field4067 = this.field806;
        arg0.field4067.field4069 = arg0;
        if (arg1 != 0) {
            field801 = null;
        }
        arg0.field4069.field4067 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)J")
    public static final long method379(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1149; var4++) {
            class14 var5 = var3.field1140[var4];
            if ((var5.field260 >> 29 & 0x3L) == 2L && var5.field268 == arg1 && var5.field256 == arg2) {
                return var5.field260;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method380(int arg0, int arg1) {
        if (arg1 != 30735) {
            field799 = 42;
        }
        class252.field4406.method1561(-120, arg0);
        field800++;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I")
    public final int method381(int arg0) {
        field795++;
        int var2 = 0;
        class235 var3 = this.field806.field4069;
        if (arg0 != 6776) {
            this.method372(-56);
        }
        while (this.field806 != var3) {
            var2++;
            var3 = var3.field4069;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V")
    public final void method382(boolean arg0) {
        while (true) {
            class235 var2 = this.field806.field4069;
            if (this.field806 == var2) {
                if (arg0) {
                    this.method375(-100);
                }
                this.field809 = null;
                field798++;
                return;
            }
            var2.method1611((byte) -11);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class48() {
        this.field806.field4069 = this.field806;
        this.field806.field4067 = this.field806;
    }
}
