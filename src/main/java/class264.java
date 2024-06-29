import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class264 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lha;")
    public static class46 field4584 = class271.method1828("", -46);

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lha;")
    public static class46 field4592 = class271.method1828("Verbindung zum Update)2Server hergestellt)3", -46);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lha;")
    private static class46 field4587 = class271.method1828("Loaded fonts", -46);

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Lha;")
    public static class46 field4594 = class271.method1828("Null", -46);

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lha;")
    public static class46 field4595 = class271.method1828("settings", -46);

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lha;")
    public static class46 field4590 = field4587;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Z")
    public static boolean field4596 = true;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)V")
    public static final void method1777(byte arg0, int arg1) {
        class87 var2 = class54.field928;
        synchronized (class54.field928) {
            class14.field210 = arg1;
        }
        int var3 = -111 / ((arg0 + 86) / 37);
        field4588++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V")
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 1878) {
            return;
        }
        if (arg1 < arg0) {
            class24.method170((byte) 33, arg1, class6.field100[arg4], arg0, arg2);
        } else {
            class24.method170((byte) 33, arg0, class6.field100[arg4], arg1, arg2);
        }
        field4593++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)J")
    public static final long method1779(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        return var3 == null || var3.field3589 == null ? 0L : var3.field3589.field4464;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(BI)V")
    public static final void method1780(byte arg0, int arg1) {
        field4585++;
        class131.field2411 = 1000 / arg1;
        int var2 = -112 % ((26 - arg0) / 42);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4589++;
        long var6 = method1779(arg0, arg5, arg2);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x7CFD0) >> 14;
            int var9 = ((int) var6 & 0x31230C) >> 20;
            int var10 = arg3;
            int[] var11 = class262.field4564;
            if (var6 > 0L) {
                var10 = arg4;
            }
            int var12 = arg5 * 4 + ((52736 - arg2 * 512) * 4) + 24624;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class236 var14 = class157.method1158(var13, 117);
            if (var14.field4125 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
            } else {
                class179 var15 = null;
                if (!var14.field4163) {
                    var15 = class273.field4766[var14.field4125];
                } else if (var9 == 0) {
                    var15 = class273.field4766[var14.field4125];
                } else if (var9 == 1) {
                    var15 = class37.field657[var14.field4125];
                } else if (var9 == 2) {
                    var15 = class257.field4484[var14.field4125];
                } else if (var9 == 3) {
                    var15 = class24.field497[var14.field4125];
                }
                if (var15 != null) {
                    int var16 = (var14.field4152 * 4 - var15.field4628) / 2;
                    int var17 = (var14.field4130 * 4 - var15.field4622) / 2;
                    var15.method1278(arg5 * 4 + var16 + 48, (-arg2 + 104 + -var14.field4130) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class99.method765(arg0, arg5, arg2);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class236 var23 = class157.method1158(var22, 127);
            if (var23.field4125 != -1) {
                class179 var24 = null;
                if (!var23.field4163) {
                    var24 = class273.field4766[var23.field4125];
                } else if (var20 == 0) {
                    var24 = class273.field4766[var23.field4125];
                } else if (var20 == 1) {
                    var24 = class37.field657[var23.field4125];
                } else if (var20 == 2) {
                    var24 = class257.field4484[var23.field4125];
                } else if (var20 == 3) {
                    var24 = class24.field497[var23.field4125];
                }
                if (var24 != null) {
                    int var25 = (var23.field4152 * 4 - var24.field4628) / 2;
                    int var26 = (var23.field4130 * 4 - var24.field4622) / 2;
                    var24.method1278(arg5 * 4 + var25 + 48, var26 + 48 - -((-arg2 + 104 + -var23.field4130) * 4));
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                int[] var28 = class262.field4564;
                int var29 = (103 - arg2) * 512 * 4 + arg5 * 4 + 24624;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1025] = var27;
                    var28[var29 + 512 + 2] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 1 + 512] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        long var30 = class57.method397(arg0, arg5, arg2);
        if (arg1 != 24624) {
            method1778(-116, -95, -3, 111, 2);
        }
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class236 var33 = class157.method1158(var32, 112);
        int var34 = (int) var30 >> 20 & 0x3;
        if (var33.field4125 == -1) {
            return;
        }
        class179 var35 = null;
        if (!var33.field4163) {
            var35 = class273.field4766[var33.field4125];
        } else if (var34 == 0) {
            var35 = class273.field4766[var33.field4125];
        } else if (var34 == 1) {
            var35 = class37.field657[var33.field4125];
        } else if (var34 == 2) {
            var35 = class257.field4484[var33.field4125];
        } else if (var34 == 3) {
            var35 = class24.field497[var33.field4125];
        }
        if (var35 != null) {
            int var36 = (var33.field4152 * 4 - var35.field4628) / 2;
            int var37 = (var33.field4130 * 4 - var35.field4622) / 2;
            var35.method1278(arg5 * 4 + var36 + 48, (-arg2 + 104 + -var33.field4130) * 4 + var37 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method1782(byte arg0) {
        field4584 = null;
        field4590 = null;
        field4592 = null;
        field4594 = null;
        if (arg0 != -30) {
            method1782((byte) 39);
        }
        field4587 = null;
        field4595 = null;
    }
}
