import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class269 {

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Lsi;")
    private class237 field4550 = new class237(256);

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Lsi;")
    private class237 field4553 = new class237(256);

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lcc;")
    private class313 field4539;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Lcc;")
    private class313 field4552;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Lce;")
    private static class126 field4547 = class206.method1445(-7923, "wave:");

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lce;")
    public static class126 field4545 = class206.method1445(-7923, "(Udns");

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[Lkm;")
    public static class146[] field4541 = new class146[4];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[I")
    public static int[] field4537 = new int[32];

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lce;")
    public static class126 field4540 = field4547;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lce;")
    public static class126 field4546 = field4547;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lcc;")
    public static class313 field4538;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZIIIIIIIII)V", line = 5)
    public static final void method1808(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4544++;
        int var11 = arg4 - arg2;
        int var12 = arg5 - arg8;
        if (!arg1) {
            return;
        }
        boolean var13;
        if (class98.field1574 > 0 && class98.field1574 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg7;
        int var15 = 983040 / arg3;
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var17 = arg6 + (arg7 * var16) >> 16;
            int var18 = arg6 + ((var16 + 1) * arg7) >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg10 + var18;
                int var21 = arg2 + var16 >> 6;
                int var22 = arg10 + var17;
                if (var21 >= 0 && var21 <= (class283.field4710.length - 1)) {
                    int[][] var23 = class283.field4710[var21];
                    for (int var24 = -var15; var24 < var12 + var15; var24++) {
                        int var25 = (var24 + 1) * arg3 + arg0 >> 16;
                        int var26 = arg3 * var24 + arg0 >> 16;
                        int var27 = var25 - var26;
                        if (var27 > 0) {
                            int var28 = arg9 + var26;
                            var10000 = arg9 + var25;
                            int var30 = var24 + arg8 >> 6;
                            if (var30 >= 0 && var30 <= var23.length - 1 && var23[var30] != null) {
                                int var31 = ((arg8 + var24 & 0x3F) << 6) + (var16 + arg2 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class265 var33 = class185.method1338(var32 - 1, -7153);
                                    if (!class185.field3201[var33.field4476]) {
                                        if (var13 && class91.field1435 == var33.field4476) {
                                            class231 var34 = new class231();
                                            var34.field3883 = var22;
                                            var34.field3880 = var33.field4476;
                                            var34.field3878 = var28;
                                            class47.field724.method899(var34, -28);
                                        } else {
                                            class15.field214[var33.field4476].method1333(var22 - 7, var28 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class231 var35 = (class231) class47.field724.method898((byte) -126); var35 != null; var35 = (class231) class47.field724.method893((byte) 59)) {
            class15.field214[var35.field3880].method1333(var35.field3883 - 7, var35.field3878 + -7);
            class276.method1856(var35.field3883, var35.field3878, 15, 16776960, 128);
            class276.method1856(var35.field3883, var35.field3878, 7, 16777215, 256);
        }
        class47.field724.method905((byte) 125);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[III)Loj;", line = 123)
    private final class156 method1809(int arg0, int[] arg1, int arg2, int arg3) {
        field4549++;
        if (arg0 > -36) {
            this.field4552 = (class313) null;
        }
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFFE) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class156 var9 = (class156) this.field4553.method1631(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class271 var10 = class271.method1820(this.field4552, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class156 var11 = var10.method1818();
            this.field4553.method1636(11311, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field2813.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III[[III)I", line = 167)
    public static final int method1810(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        field4548++;
        int var6 = (128 - arg1) * arg3[arg5][arg2] + arg3[arg5 + 1][arg2] * arg1 >> 7;
        if (arg4 != -29029) {
            field4541 = (class146[]) null;
        }
        int var7 = (128 - arg1) * arg3[arg5][arg2 + 1] + arg3[arg5 + 1][arg2 + 1] * arg1 >> 7;
        return (128 - arg0) * var6 + arg0 * var7 >> 7;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([IIB)Loj;", line = 191)
    public final class156 method1811(int[] arg0, int arg1, byte arg2) {
        if (arg2 != -31) {
            return (class156) null;
        }
        field4542++;
        if (this.field4539.method2174(arg2 ^ 0xFFFFFFE1) == 1) {
            return this.method1812(arg1, 0, (byte) -109, arg0);
        } else if (this.field4539.method2165(0, arg1) == 1) {
            return this.method1812(0, arg1, (byte) 74, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB[I)Loj;", line = 218)
    private final class156 method1812(int arg0, int arg1, byte arg2, int[] arg3) {
        field4536++;
        int var5 = (arg1 << 4 & 0xFFFA | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class156 var9 = (class156) this.field4553.method1631(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class310 var10 = (class310) this.field4550.method1631(false, var7);
            if (var10 == null) {
                var10 = class310.method2122(this.field4539, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field4550.method1636(11311, var10, var7);
            }
            int var11 = -8 / ((-arg2 - 2) / 59);
            class156 var12 = var10.method2117(arg3);
            if (var12 == null) {
                return null;
            } else {
                var10.method499((byte) 64);
                this.field4553.method1636(11311, var12, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([III)Loj;", line = 260)
    public final class156 method1813(int[] arg0, int arg1, int arg2) {
        field4543++;
        if (this.field4552.method2174(0) == 1) {
            return this.method1809(-78, arg0, arg1, 0);
        } else if (arg2 > -10) {
            return (class156) null;
        } else if (this.field4552.method2165(0, arg1) == 1) {
            return this.method1809(-75, arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 283)
    public static void method1814(int arg0) {
        field4538 = null;
        if (arg0 != 983040) {
            field4546 = (class126) null;
        }
        field4547 = null;
        field4541 = null;
        field4546 = null;
        field4537 = null;
        field4545 = null;
        field4540 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lcc;Lcc;)V", line = 337)
    public class269(class313 arg0, class313 arg1) {
        this.field4539 = arg1;
        this.field4552 = arg0;
    }
}
