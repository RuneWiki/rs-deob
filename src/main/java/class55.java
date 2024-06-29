import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class55 extends class362 {

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
    private int field787 = -1;

    @OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
    public static int field792 = 1338;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "[I")
    public static int[] field789 = null;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!wba", name = "I", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!wba", name = "L", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!wba", name = "M", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "Lgca;")
    public static class265 field784;

    @OriginalMember(owner = "client!wba", name = "K", descriptor = "[I")
    public int[] field793;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)[[I")
    public int[][] method153(int arg0, byte arg1) {
        ++field785;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 <= 57) {
            this.method154((class93) null, 2, 119);
        }
        if (super.field4938.field7848 && this.method403(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field794 * (~class555.field7845 == ~this.field790 ? arg0 : this.field790 * arg0 / class555.field7845);
            if (class769.field10597 != this.field794) {
                for (int var8 = 0; class769.field10597 > var8; ++var8) {
                    int var9 = this.field794 * var8 / class769.field10597;
                    int var10 = this.field793[var7 - -var9];
                    var6[var8] = class204.method1456(4080, var10 << 4);
                    var5[var8] = class204.method1456(65280, var10) >> 4;
                    var4[var8] = class204.method1456(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class769.field10597; ++var11) {
                    int var12 = this.field793[var7++];
                    var6[var11] = class204.method1456(255, var12) << 4;
                    var5[var11] = class204.method1456(65280, var12) >> 4;
                    var4[var11] = class204.method1456(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
    public static void method399(int arg0) {
        field784 = null;
        field789 = null;
        if (arg0 != -17238) {
            field789 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
    public class55() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V")
    public final void method400(byte arg0) {
        if (arg0 >= -67) {
            field784 = null;
        }
        ++field788;
        super.method400((byte) -103);
        this.field793 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field783;
        if (arg2 != -1) {
            method402((class66) null, 68, (class393) null, -13, (class508) null, 101);
        }
        if (arg1 == 0) {
            this.field787 = arg0.method763(-41);
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)I")
    public final int method401(int arg0) {
        if (arg0 != 15667) {
            this.field787 = 126;
        }
        ++field791;
        return this.field787;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lha;ILgka;ILbi;I)Z")
    public static final boolean method402(class66 arg0, int arg1, class393 arg2, int arg3, class508 arg4, int arg5) {
        ++field781;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field5391 != null) {
            var6 = (-class64.field895 + arg4.field6978 + arg2.field5393) * (-class64.field894 + class64.field908) / (class64.field910 - class64.field895) + class64.field894;
            var8 = -((class64.field912 - class64.field898) * (-class64.field915 + arg2.field5432 + arg4.field6984) / (-class64.field915 + class64.field896)) + class64.field912;
            var9 = -((arg2.field5428 - class64.field915 + arg4.field6984) * (-class64.field898 + class64.field912) / (class64.field896 - class64.field915)) + class64.field912;
            var7 = (arg2.field5440 - -arg4.field6978 - class64.field895) * (-class64.field894 + class64.field908) / (-class64.field895 + class64.field910) + class64.field894;
        }
        class604 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg2.field5401 != 0) {
            if (arg4.field6975 && ~arg2.field5419 != 0) {
                var10 = arg2.method2386(arg0, true, true);
            } else {
                var10 = arg2.method2386(arg0, false, true);
            }
            if (var10 != null) {
                var11 = arg4.field6977 + -(1 + var10.method224() >> 1);
                var12 = arg4.field6977 - -(var10.method224() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (~var12 < ~var7) {
                    var7 = var12;
                }
                var13 = arg4.field6981 + -(1 + var10.method218() >> 1);
                var14 = arg4.field6981 + (var10.method218() - -1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (~var14 < ~var9) {
                    var9 = var14;
                }
            }
        }
        class585 var15 = null;
        int var16 = 40 % ((arg5 - -67) / 41);
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        if (arg2.field5395 != null) {
            var15 = class637.method3557(arg2.field5408, -16680);
            if (var15 != null) {
                var17 = class440.field5967.method1163(arg2.field5395, true, (int[]) null, (class604[]) null, class207.field3114);
                var18 = (-class64.field894 + class64.field908) * arg2.field5388 / (-class64.field895 + class64.field910) + arg4.field6977;
                int var25 = -((-class64.field898 + class64.field912) * arg2.field5405 / (-class64.field915 + class64.field896)) + arg4.field6981;
                if (var10 == null) {
                    var19 = var25 - var17 * var15.method3362() / 2;
                } else {
                    var19 = var25 - ((var10.method218() >> 1) - -(var15.method3364() * var17));
                }
                for (int var26 = 0; ~var26 > ~var17; ++var26) {
                    String var27 = class207.field3114[var26];
                    if (~var26 > ~(var17 + -1)) {
                        var27 = var27.substring(0, var27.length() - 4);
                    }
                    int var28 = var15.method3366(var27);
                    if (var28 > var20) {
                        var20 = var28;
                    }
                }
                var21 = -(var20 / 2) + var18 + arg3;
                var22 = var18 - (-(var20 / 2) + -arg3);
                if (var6 > var21) {
                    var6 = var21;
                }
                if (~var7 > ~var22) {
                    var7 = var22;
                }
                var23 = arg1 + var19;
                var24 = var17 * var15.method3364() + (var19 - -arg1);
                if (var23 < var8) {
                    var8 = var23;
                }
                if (~var9 > ~var24) {
                    var9 = var24;
                }
            }
        }
        if (~var7 <= ~class64.field894 && class64.field908 >= var6 && var9 >= class64.field898 && class64.field912 >= var8) {
            class64.method453(arg0, arg4, arg2);
            if (var10 != null) {
                if (class439.field5965 > 0 && (class769.field10607 != -1 && class769.field10607 == arg4.field6973 || class428.field5845 != -1 && ~class428.field5845 == ~arg2.field5430)) {
                    int var29;
                    if (class299.field4116 > 50) {
                        var29 = -(class299.field4116 * 2) + 200;
                    } else {
                        var29 = class299.field4116 * 2;
                    }
                    int var30 = 16776960 | var29 << 24;
                    arg0.method525(var10.method220() / 2 - -7, arg4.field6977, var30, 33, arg4.field6981);
                    arg0.method525(var10.method220() / 2 - -5, arg4.field6977, var30, 109, arg4.field6981);
                    arg0.method525(var10.method220() / 2 + 3, arg4.field6977, var30, 28, arg4.field6981);
                    arg0.method525(1 + var10.method220() / 2, arg4.field6977, var30, 36, arg4.field6981);
                    arg0.method525(var10.method220() / 2, arg4.field6977, var30, 111, arg4.field6981);
                }
                var10.method3430(arg4.field6977 - (var10.method224() >> 1), arg4.field6981 - (var10.method218() >> 1));
            }
            if (arg2.field5395 != null && var15 != null) {
                class180.method1355(var18, var19, arg4, arg0, arg2, var20, var17, var15, 21938);
            }
            if (~arg2.field5401 != 0 || arg2.field5395 != null) {
                class24 var31 = new class24(arg4);
                var31.field486 = var14;
                var31.field492 = var23;
                var31.field484 = var11;
                var31.field490 = var13;
                var31.field489 = var22;
                var31.field488 = var21;
                var31.field487 = var24;
                var31.field491 = var12;
                class497.field6805.method3594((byte) -126, var31);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "(I)Z")
    public final boolean method403(int arg0) {
        ++field795;
        if (this.field793 != null) {
            return true;
        } else if (arg0 != 0) {
            return false;
        } else if (~this.field787 <= -1) {
            class49 var2 = class460.field6256 < 0 ? class49.method370(class514.field7014, this.field787) : class49.method366(class514.field7014, class460.field6256, this.field787);
            var2.method367();
            this.field793 = var2.method377();
            this.field790 = var2.field741;
            this.field794 = var2.field745;
            return true;
        } else {
            return false;
        }
    }
}
