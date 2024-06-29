import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class168 extends class51 {

    @OriginalMember(owner = "client!sg", name = "nb", descriptor = "I")
    private int field3462 = 6;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "Lea;")
    public static class38 field3451 = class9.method46((byte) 126, "Mem:");

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "Lea;")
    public static class38 field3449 = class9.method46((byte) 101, "weiss:");

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "Lea;")
    public static class38 field3454 = class9.method46((byte) 116, "scrollbar");

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "Lea;")
    public static class38 field3456 = class9.method46((byte) 110, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "[Lea;")
    public static class38[] field3457 = new class38[100];

    @OriginalMember(owner = "client!sg", name = "lb", descriptor = "Lea;")
    private static class38 field3460 = class9.method46((byte) 107, "Players");

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "Lea;")
    public static class38 field3450 = field3460;

    @OriginalMember(owner = "client!sg", name = "pb", descriptor = "I")
    public static int field3464 = 0;

    @OriginalMember(owner = "client!sg", name = "kb", descriptor = "I")
    public static volatile int field3459 = 0;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!sg", name = "jb", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!sg", name = "ob", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!sg", name = "qb", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!sg", name = "mb", descriptor = "[[Lef;")
    public static class43[][] field3461;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3459 = 47;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field1289 = arg0.method509(121) == 1;
            }
        } else {
            this.field3462 = arg0.method509(126);
        }
        ++field3465;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3458;
        if (arg0 > -125) {
            return null;
        } else {
            int[] var3 = super.field1312.method827(arg1, true);
            if (super.field1312.field2271) {
                int[] var4 = this.method376(arg1, 0, -54);
                int[] var5 = this.method376(arg1, 1, -43);
                for (int var6 = 0; ~class86.field2008 < ~var6; ++var6) {
                    var3[var6] = this.method1192(var4[var6], (byte) 110, var5[var6]);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)I")
    private final int method1192(int arg0, byte arg1, int arg2) {
        ++field3463;
        if (arg1 <= 48) {
            return 57;
        } else {
            int var4 = this.field3462;
            if (var4 != 1) {
                if (~var4 != -3) {
                    if (~var4 != -4) {
                        if (var4 != 4) {
                            if (var4 != 5) {
                                if (var4 != 6) {
                                    if (var4 != 7) {
                                        if (~var4 != -9) {
                                            if (~var4 != -10) {
                                                if (var4 != 10) {
                                                    if (~var4 != -12) {
                                                        return ~var4 == -13 ? -(arg0 * arg2 >> 11) + arg2 + arg0 : arg0;
                                                    } else {
                                                        return arg0 > arg2 ? -arg2 + arg0 : -arg0 + arg2;
                                                    }
                                                } else {
                                                    return arg2 < arg0 ? arg0 : arg2;
                                                }
                                            } else {
                                                return arg0 < arg2 ? arg0 : arg2;
                                            }
                                        } else {
                                            return ~arg0 != -1 ? -((4096 - arg2 << 12) / arg0) + 4096 : 0;
                                        }
                                    } else {
                                        return arg0 != 4096 ? (arg2 << 12) / (-arg0 + 4096) : 4096;
                                    }
                                } else {
                                    return arg2 < 2048 ? arg0 * arg2 >> 11 : -((4096 - arg0) * (-arg2 + 4096) >> 11) + 4096;
                                }
                            } else {
                                return -((4096 - arg0) * (-arg2 + 4096) >> 12) + 4096;
                            }
                        } else {
                            return ~arg2 == -1 ? 4096 : (arg0 << 12) / arg2;
                        }
                    } else {
                        return arg0 * arg2 >> 12;
                    }
                } else {
                    return -arg2 + arg0;
                }
            } else {
                return arg0 + arg2;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V")
    public static final void method1193(boolean arg0) {
        class35.field738.method1083(3056);
        ++field3455;
        if (arg0) {
            method1195((byte) -51);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class168() {
        super(2, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3453;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int[][] var4 = this.method377(0, arg1, (byte) -100);
            int[][] var5 = this.method377(1, arg1, (byte) -104);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            for (int var15 = 0; ~var15 > ~class86.field2008; ++var15) {
                var6[var15] = this.method1192(var9[var15], (byte) 57, var12[var15]);
                var7[var15] = this.method1192(var10[var15], (byte) 98, var13[var15]);
                var8[var15] = this.method1192(var11[var15], (byte) 89, var14[var15]);
            }
        }
        if (arg0 < 111) {
            method1195((byte) 23);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)V")
    public static void method1194(int arg0) {
        field3450 = null;
        field3461 = null;
        field3449 = null;
        field3460 = null;
        field3454 = null;
        field3451 = null;
        field3456 = null;
        field3457 = null;
        int var1 = -53 % (-arg0 / 61);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static final void method1195(byte arg0) {
        ++field3448;
        for (class176 var1 = (class176) class50.field1241.method1020(0); var1 != null; var1 = (class176) class50.field1241.method1027((byte) 91)) {
            if (class10.field224 == var1.field3572 && !var1.field3557) {
                if (~class45.field1098 <= ~var1.field3560) {
                    var1.method1221(class205.field4027, (byte) 84);
                    if (!var1.field3557) {
                        class101.field2268.method1135(var1.field3572, var1.field3564, var1.field3573, var1.field3574, 60, var1, 0, -1, false);
                    } else {
                        var1.method805(false);
                    }
                }
            } else {
                var1.method805(false);
            }
        }
        if (arg0 < 28) {
            field3449 = null;
        }
    }
}
