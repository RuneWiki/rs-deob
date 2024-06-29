import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class214 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3798 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lha;")
    private static class46 field3804 = class271.method1828("Created gameworld", -46);

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lha;")
    public static class46 field3802 = field3804;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[[[B")
    public static byte[][][] field3797;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lpi;I)V")
    public static final void method1503(class181 arg0, int arg1) {
        class141.field2563 = arg0.method1320((byte) 63, class87.field1664);
        class202.field3613 = arg0.method1320((byte) 63, class33.field608);
        class147.field2648 = arg0.method1320((byte) 63, class63.field1065);
        field3800++;
        class128.field2347 = arg0.method1320((byte) 63, class107.field1999);
        class260.field4535 = arg0.method1320((byte) 63, class156.field2800);
        class92.field1716 = arg0.method1320((byte) 63, class6.field103);
        class201.field3582 = arg0.method1320((byte) 63, class225.field3929);
        class190.field3392 = arg0.method1320((byte) 63, class116.field2188);
        class269.field4650 = arg0.method1320((byte) 63, class226.field3960);
        class33.field610 = arg0.method1320((byte) 63, class201.field3579);
        class234.field4073 = arg0.method1320((byte) 63, class8.field135);
        if (arg1 != -1) {
            field3799 = 23;
        }
        class90.field1698 = arg0.method1320((byte) 63, class208.field3736);
        class218.field3853 = arg0.method1320((byte) 63, class196.field3497);
        class188.field3365 = arg0.method1320((byte) 63, class64.field1076);
        class268.field4640 = arg0.method1320((byte) 63, class33.field607);
        class209.field3739 = arg0.method1320((byte) 63, class227.field3989);
        class247.field4375 = arg0.method1320((byte) 63, class106.field1899);
        class176.field3165 = arg0.method1320((byte) 63, class237.field4191);
        client.field4697 = arg0.method1320((byte) 63, class6.field107);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class163.field2914.field4224; var9++) {
            int var10 = class163.field2914.field4234[var9] - class194.field3493;
            int var11 = class49.field836 + class232.field4039 - class163.field2914.field4237[var9] - 1;
            int var12 = (var11 - arg1) * (arg4 - arg5) / (arg3 - arg1) + arg5;
            int var13 = (arg7 - arg2) * (var10 - arg6) / (arg8 - arg6) + arg2;
            class211 var14 = null;
            int var15 = 16777215;
            int var16 = class163.field2914.method1640(var9, -41);
            if (var16 == 0) {
                if ((double) class45.field746 == 3.0D) {
                    var14 = class189.field3378;
                }
                if ((double) class45.field746 == 4.0D) {
                    var14 = class247.field4374;
                }
                if ((double) class45.field746 == 6.0D) {
                    var14 = class142.field2601;
                }
                if ((double) class45.field746 == 8.0D) {
                    var14 = class187.field3343;
                }
            }
            if (var16 == 1) {
                if ((double) class45.field746 == 3.0D) {
                    var14 = class142.field2601;
                }
                if ((double) class45.field746 == 4.0D) {
                    var14 = class187.field3343;
                }
                if ((double) class45.field746 == 6.0D) {
                    var14 = class122.field2274;
                }
                if ((double) class45.field746 == 8.0D) {
                    var14 = class63.field1071;
                }
            }
            if (var16 == 2) {
                var15 = 16755200;
                if ((double) class45.field746 == 3.0D) {
                    var14 = class122.field2274;
                }
                if ((double) class45.field746 == 4.0D) {
                    var14 = class63.field1071;
                }
                if ((double) class45.field746 == 6.0D) {
                    var14 = class170.field3029;
                }
                if ((double) class45.field746 == 8.0D) {
                    var14 = class152.field2701;
                }
            }
            if (class163.field2914.field4225[var9] != -1) {
                var15 = class163.field2914.field4225[var9];
            }
            if (var14 != null) {
                class46[] var17 = new class46[class163.field2914.field4232[var9].method307((byte) 108, 60) + 1];
                class37.field663.method155(class163.field2914.field4232[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var12 - (var18 - 1) * var14.method1485() / 2;
                int var20 = var19 + var14.method1488() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class46 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method338(19551, var17[var21].method314(arg0 - 31768) - 4, 0);
                    var14.method1486(var22, var13, var20, var15, true);
                    var20 += var14.method1485();
                }
            }
        }
        if (arg0 != 31850) {
            method1507((class181) null, -73, 110, -92);
        }
        field3806++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public static final void method1505(int arg0, int arg1) {
        int var2 = 126 % ((61 - arg1) / 59);
        class146 var3 = class6.method22((byte) 16, 3, arg0);
        var3.method1082((byte) -101);
        field3801++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3802 = null;
        field3797 = null;
        field3804 = null;
        if (arg0 != 29934) {
            field3804 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lpi;III)Lhh;")
    public static final class263 method1507(class181 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 28974) {
            field3799 = -75;
        }
        field3803++;
        return class146.method1083(arg0, arg1, arg2, (byte) 28) ? class258.method1724(arg3 ^ 0x712E) : null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method1508(Object arg0, boolean arg1, int arg2) {
        field3805++;
        if (arg2 != 2) {
            method1508((Object) null, true, -69);
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class16.method82(44, var3) : var3;
        } else if (arg0 instanceof class250) {
            class250 var4 = (class250) arg0;
            return var4.method275((byte) -55);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
