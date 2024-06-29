import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class92 extends class122 {

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lke;")
    public static class256 field1671 = class316.method2202(")0", 27626);

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Z")
    public static boolean field1674 = false;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lke;")
    public static class256 field1677 = class316.method2202(" autres options", 27626);

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "F")
    public static float field1676;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIIIII)V", line = 7)
    public static final void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1675++;
        if (arg2 > -49) {
            return;
        }
        long var6 = class308.method2141(arg0, arg3, arg4);
        if (var6 != 0L) {
            int var8 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var9 = ((int) var6 & 0x3DABF9) >> 20;
            int var10 = ((int) var6 & 0x7FD6E) >> 14;
            class273 var11 = class271.method1871(126, var8);
            if (var11.field4674 == -1) {
                int[] var12 = class178.field3146;
                int var13 = arg5;
                if (var6 > 0L) {
                    var13 = arg1;
                }
                int var14 = (52736 - (arg4 * 512)) * 4 + (arg3 * 4) + 24624;
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var12[var14] = var13;
                        var12[var14 + 512] = var13;
                        var12[var14 + 1024] = var13;
                        var12[var14 + 1536] = var13;
                    } else if (var9 == 1) {
                        var12[var14] = var13;
                        var12[var14 + 1] = var13;
                        var12[var14 + 2] = var13;
                        var12[var14 + 3] = var13;
                    } else if (var9 == 2) {
                        var12[var14 + 3] = var13;
                        var12[var14 + 512 + 3] = var13;
                        var12[var14 + 1027] = var13;
                        var12[var14 + 1536 + 3] = var13;
                    } else if (var9 == 3) {
                        var12[var14 + 1536] = var13;
                        var12[var14 + 1536 + 1] = var13;
                        var12[var14 + 1536 + 2] = var13;
                        var12[var14 + 1539] = var13;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var12[var14] = var13;
                    } else if (var9 == 1) {
                        var12[var14 + 3] = var13;
                    } else if (var9 == 2) {
                        var12[var14 + 1539] = var13;
                    } else if (var9 == 3) {
                        var12[var14 + 1536] = var13;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var12[var14] = var13;
                        var12[var14 + 512] = var13;
                        var12[var14 + 1024] = var13;
                        var12[var14 + 1536] = var13;
                    } else if (var9 == 0) {
                        var12[var14] = var13;
                        var12[var14 + 1] = var13;
                        var12[var14 + 2] = var13;
                        var12[var14 + 3] = var13;
                    } else if (var9 == 1) {
                        var12[var14 + 3] = var13;
                        var12[var14 + 3 + 512] = var13;
                        var12[var14 + 1024 + 3] = var13;
                        var12[var14 + 3 + 1536] = var13;
                    } else if (var9 == 2) {
                        var12[var14 + 1536] = var13;
                        var12[var14 + 1536 + 1] = var13;
                        var12[var14 + 1536 + 2] = var13;
                        var12[var14 + 1536 + 3] = var13;
                    }
                }
            } else {
                class232 var15 = null;
                int var16 = var11.field4711;
                if (!var11.field4718) {
                    var15 = class6.field91[var11.field4674];
                } else if (var9 == 0) {
                    var15 = class6.field91[var11.field4674];
                } else if (var9 == 1) {
                    var15 = class264.field4533[var11.field4674];
                    var16 = var11.field4662;
                } else if (var9 == 2) {
                    var15 = class116.field2035[var11.field4674];
                } else if (var9 == 3) {
                    var15 = class6.field96[var11.field4674];
                    var16 = var11.field4662;
                }
                if (var15 != null) {
                    var15.method12(arg3 * 4 + 48, (-arg4 + 104 + -var16) * 4 + 48);
                }
            }
        }
        long var17 = class229.method1560(arg0, arg3, arg4);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x7E40E) >> 14;
            int var20 = (int) var17 >> 20 & 0x3;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class273 var22 = class271.method1871(126, var21);
            if (var22.field4674 != -1) {
                class232 var23 = null;
                int var24 = var22.field4711;
                if (!var22.field4718) {
                    var23 = class6.field91[var22.field4674];
                } else if (var20 == 0) {
                    var23 = class6.field91[var22.field4674];
                } else if (var20 == 1) {
                    var24 = var22.field4662;
                    var23 = class264.field4533[var22.field4674];
                } else if (var20 == 2) {
                    var23 = class116.field2035[var22.field4674];
                } else if (var20 == 3) {
                    var23 = class6.field96[var22.field4674];
                    var24 = var22.field4662;
                }
                if (var23 != null) {
                    var23.method12((arg3 * 4) + 48, 48 - -((-var24 + 104 + -arg4) * 4));
                }
            } else if (var19 == 9) {
                int var25 = 15658734;
                if (var17 > 0L) {
                    var25 = 15597568;
                }
                int[] var26 = class178.field3146;
                int var27 = (52736 - (arg4 * 512)) * 4 + arg3 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var26[var27 + 1536] = var25;
                    var26[var27 + 1025] = var25;
                    var26[var27 + 512 + 2] = var25;
                    var26[var27 + 3] = var25;
                } else {
                    var26[var27] = var25;
                    var26[var27 + 512 + 1] = var25;
                    var26[var27 + 1024 + 2] = var25;
                    var26[var27 + 3 + 1536] = var25;
                }
            }
        }
        long var28 = client.method824(arg0, arg3, arg4);
        if (var28 == 0L) {
            return;
        }
        int var30 = (int) var28 >> 20 & 0x3;
        int var31 = Integer.MAX_VALUE & (int) (var28 >>> 32);
        class273 var32 = class271.method1871(124, var31);
        if (var32.field4674 == -1) {
            return;
        }
        class232 var33 = null;
        int var34 = var32.field4711;
        if (!var32.field4718) {
            var33 = class6.field91[var32.field4674];
        } else if (var30 == 0) {
            var33 = class6.field91[var32.field4674];
        } else if (var30 == 1) {
            var34 = var32.field4662;
            var33 = class264.field4533[var32.field4674];
        } else if (var30 == 2) {
            var33 = class116.field2035[var32.field4674];
        } else if (var30 == 3) {
            var34 = var32.field4662;
            var33 = class6.field96[var32.field4674];
        }
        if (var33 != null) {
            var33.method12(arg3 * 4 + 48, (-arg4 + 104 + -var34) * 4 + 48);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)[Lrd;", line = 323)
    public static final class135[] method680(int arg0) {
        class135[] var1 = new class135[class38.field691];
        if (arg0 != 1536) {
            return (class135[]) null;
        }
        field1673++;
        for (int var2 = 0; var2 < class38.field691; var2++) {
            byte[] var3 = class6.field92[var2];
            int var4 = class94.field1692[var2] * class62.field1093[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class305.field5270[class150.method1123(var3[var6], 255)];
            }
            if (class253.field4323) {
                var1[var2] = new class87(class142.field2486, class153.field2740, class13.field172[var2], class307.field5283[var2], class94.field1692[var2], class62.field1093[var2], var5);
            } else {
                var1[var2] = new class227(class142.field2486, class153.field2740, class13.field172[var2], class307.field5283[var2], class94.field1692[var2], class62.field1093[var2], var5);
            }
        }
        class183.method1343(255);
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 388)
    public static void method681(int arg0) {
        field1677 = null;
        if (arg0 != 517134) {
            field1674 = false;
        }
        field1671 = null;
    }
}
