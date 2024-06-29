import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class78 extends class337 {

    @OriginalMember(owner = "client!co", name = "D", descriptor = "Lhn;")
    public static class509 field1128 = new class509(96, 8);

    @OriginalMember(owner = "client!co", name = "J", descriptor = "Lob;")
    public static class521 field1134;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "Lbt;")
    public static class33 field1135;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "Ltj;")
    public static class135 field1136;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IJ)V")
    public static final void method670(int arg0, long arg1) {
        ++field1132;
        if (arg0 == 96) {
            int var3 = class428.field6372 + class398.field5947.field5837;
            int var4 = class40.field541 + class398.field5947.field5833;
            if (~(-var3 + class380.field5738) > 499 || -var3 + class380.field5738 > 500 || ~(class468.field6767 - var4) > 499 || ~(class468.field6767 - var4) < -501) {
                class380.field5738 = var3;
                class468.field6767 = var4;
            }
            if (~class380.field5738 != ~var3) {
                int var5 = var3 - class380.field5738;
                int var6 = (int) ((long) var5 * arg1 / 320L);
                if (~var5 < -1) {
                    if (var6 == 0) {
                        var6 = 1;
                    } else if (var5 < var6) {
                        var6 = var5;
                    }
                } else if (~var6 == -1) {
                    var6 = -1;
                } else if (~var6 > ~var5) {
                    var6 = var5;
                }
                class380.field5738 += var6;
            }
            if (!class193.field3258.field7239) {
                class473.field6830 += (float) arg1 * class345.field5107 / 6.0F;
                class181.field2711 += (float) arg1 * class52.field654 / 6.0F;
            }
            if (class468.field6767 != var4) {
                int var7 = -class468.field6767 + var4;
                int var8 = (int) ((long) var7 * arg1 / 320L);
                if (~var7 < -1) {
                    if (~var8 != -1) {
                        if (~var7 > ~var8) {
                            var8 = var7;
                        }
                    } else {
                        var8 = 1;
                    }
                } else if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
                class468.field6767 += var8;
            }
            class171.method1146(true);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIB)V")
    public static final void method671(int arg0, int arg1, byte arg2) {
        ++field1126;
        if (arg2 == 48) {
            ++class218.field3581;
            class74.method640(-29627, class467.field6753);
            class71.field1020.method1524(arg1, 128);
            class71.field1020.method1522(arg0, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(III)Z")
    public static final boolean method672(int arg0, int arg1, int arg2) {
        if (arg1 != 14826) {
            return false;
        } else {
            ++field1131;
            return class426.method2662(arg1 ^ 14826, arg0, arg2) & class281.method1831(arg0, arg2, arg1 ^ 28800);
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, false);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field1130;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        int var4 = -38 % ((-41 - arg1) / 49);
        if (super.field5011.field3346) {
            int[][] var5 = this.method2123(arg0, 0, -101);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class402.field5977; ++var12) {
                var9[var12] = 4096 - var6[var12];
                var10[var12] = -var7[var12] + 4096;
                var11[var12] = 4096 - var8[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 53 / ((arg0 - 82) / 40);
        ++field1133;
        if (~arg1 == -1) {
            super.field5019 = ~arg2.method1515((byte) 124) == -2;
        }
    }

    @OriginalMember(owner = "client!co", name = "i", descriptor = "(I)V")
    public static void method674(int arg0) {
        field1136 = null;
        if (arg0 != 8) {
            method675((class38) null, (class455) null, -126, 52, 54, -29, 54);
        }
        field1135 = null;
        field1128 = null;
        field1134 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lya;Lor;IIIII)V")
    public static final void method675(class38 arg0, class455 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; ++var12) {
            if (class213.field3467 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < class497.field7147) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < class385.field5799 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class138 var15 = client.field3311[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class491.field7059[var12].method411(var13, var14) + class491.field7059[var12].method411(var13 + 1, var14) + class491.field7059[var12].method411(var13, var14 + 1) + class491.field7059[var12].method411(var13 + 1, var14 + 1)) / 4 - (class491.field7059[arg2].method411(arg3, arg4) + class491.field7059[arg2].method411(arg3 + 1, arg4) + class491.field7059[arg2].method411(arg3, arg4 + 1) + class491.field7059[arg2].method411(arg3 + 1, arg4 + 1)) / 4;
                                    class312 var17 = var15.field2114;
                                    class312 var18 = var15.field2104;
                                    if (var17 != null && var17.method17(13651334)) {
                                        arg1.method23(3, (var14 - arg4) * class450.field6574 + (1 - arg6) * class5.field63, arg0, (var13 - arg3) * class450.field6574 + (1 - arg5) * class5.field63, var17, var16, var7);
                                    }
                                    if (var18 != null && var18.method17(13651334)) {
                                        arg1.method23(3, (var14 - arg4) * class450.field6574 + (1 - arg6) * class5.field63, arg0, (var13 - arg3) * class450.field6574 + (1 - arg5) * class5.field63, var18, var16, var7);
                                    }
                                    for (class327 var19 = var15.field2118; var19 != null; var19 = var19.field4922) {
                                        class389 var20 = var19.field4921;
                                        if (var20 != null && var20.method17(13651334) && (var20.field5836 == var13 || var8 == var13) && (var20.field5830 == var14 || var10 == var14)) {
                                            int var21 = var20.field5827 - var20.field5836 + 1;
                                            int var22 = var20.field5829 - var20.field5830 + 1;
                                            arg1.method23(3, (var20.field5830 - arg4) * class450.field6574 + (var22 - arg6) * class5.field63, arg0, (var20.field5836 - arg3) * class450.field6574 + (var21 - arg5) * class5.field63, var20, var16, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var8;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            this.method177((byte) 8, 127, (class217) null);
        }
        ++field1129;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[] var4 = this.method2124(arg0, 0, -78);
            for (int var5 = 0; var5 < class402.field5977; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    static {
        new class234(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field1134 = new class521(37, 3);
        field1135 = new class33(128);
    }
}
