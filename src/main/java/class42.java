import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class42 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lli;")
    public static class185 field645 = class245.method1649("Ausw-=hlen", -79);

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lni;")
    public static class20 field643;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lhi;")
    public static class250 field648;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method257(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class232.field4172++;
        class12.field215 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class70.field1231; var12 < field641; var12++) {
            class198[][] var38 = class153.field2896[var12];
            for (int var39 = class256.field4558; var39 < class79.field1380; var39++) {
                for (int var40 = class134.field2432; var40 < class94.field1791; var40++) {
                    class198 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class93.field1776[var39 + class223.field4096 - class267.field4732][var40 + class223.field4096 - class9.field193] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3632 = true;
                            var41.field3645 = true;
                            if (var41.field3627 > 0) {
                                var41.field3635 = true;
                            } else {
                                var41.field3635 = false;
                            }
                            class12.field215++;
                        } else {
                            var41.field3632 = false;
                            var41.field3645 = false;
                            var41.field3628 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3640 != null) {
                                    class206 var42 = var41.field3640;
                                    var42.field3787.method46(0, var12, var42.field3783, var42.field3784, var42.field3774);
                                    if (var42.field3780 != null) {
                                        var42.field3780.method46(0, var12, var42.field3783, var42.field3784, var42.field3774);
                                    }
                                }
                                if (var41.field3636 != null) {
                                    class38 var43 = var41.field3636;
                                    var43.field595.method46(var43.field610, var12, var43.field600, var43.field592, var43.field596);
                                    if (var43.field594 != null) {
                                        var43.field594.method46(var43.field610, var12, var43.field600, var43.field592, var43.field596);
                                    }
                                }
                                if (var41.field3631 != null) {
                                    class251 var44 = var41.field3631;
                                    var44.field4467.method46(0, var12, var44.field4473, var44.field4474, var44.field4469);
                                }
                                if (var41.field3646 != null) {
                                    for (int var45 = 0; var45 < var41.field3627; var45++) {
                                        class49 var46 = var41.field3646[var45];
                                        var46.field800.method46(var46.field804, var12, var46.field815, var46.field794, var46.field808);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class268.field4747 == class201.field3694;
        for (int var14 = class70.field1231; var14 < field641; var14++) {
            class198[][] var27 = class153.field2896[var14];
            for (int var28 = -class223.field4096; var28 <= 0; var28++) {
                int var29 = class267.field4732 + var28;
                int var30 = class267.field4732 - var28;
                if (var29 >= class256.field4558 || var30 < class79.field1380) {
                    for (int var31 = -class223.field4096; var31 <= 0; var31++) {
                        int var32 = class9.field193 + var31;
                        int var33 = class9.field193 - var31;
                        if (var29 >= class256.field4558) {
                            if (var32 >= class134.field2432) {
                                class198 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3632) {
                                    class187.method1349(var34, true);
                                }
                            }
                            if (var33 < class94.field1791) {
                                class198 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3632) {
                                    class187.method1349(var35, true);
                                }
                            }
                        }
                        if (var30 < class79.field1380) {
                            if (var32 >= class134.field2432) {
                                class198 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3632) {
                                    class187.method1349(var36, true);
                                }
                            }
                            if (var33 < class94.field1791) {
                                class198 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3632) {
                                    class187.method1349(var37, true);
                                }
                            }
                        }
                        if (class12.field215 == 0) {
                            if (!var13) {
                                class87.field1702 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class70.field1231; var15 < field641; var15++) {
            class198[][] var16 = class153.field2896[var15];
            for (int var17 = -class223.field4096; var17 <= 0; var17++) {
                int var18 = class267.field4732 + var17;
                int var19 = class267.field4732 - var17;
                if (var18 >= class256.field4558 || var19 < class79.field1380) {
                    for (int var20 = -class223.field4096; var20 <= 0; var20++) {
                        int var21 = class9.field193 + var20;
                        int var22 = class9.field193 - var20;
                        if (var18 >= class256.field4558) {
                            if (var21 >= class134.field2432) {
                                class198 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3632) {
                                    class187.method1349(var23, false);
                                }
                            }
                            if (var22 < class94.field1791) {
                                class198 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3632) {
                                    class187.method1349(var24, false);
                                }
                            }
                        }
                        if (var19 < class79.field1380) {
                            if (var21 >= class134.field2432) {
                                class198 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3632) {
                                    class187.method1349(var25, false);
                                }
                            }
                            if (var22 < class94.field1791) {
                                class198 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3632) {
                                    class187.method1349(var26, false);
                                }
                            }
                        }
                        if (class12.field215 == 0) {
                            if (!var13) {
                                class87.field1702 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class87.field1702 = false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILhi;I)Lse;")
    public static final class10 method258(int arg0, class250 arg1, int arg2) {
        field644++;
        if (arg2 != 32363) {
            method259(true);
        }
        return class207.method1467(arg1, arg0, 0) ? class127.method914(arg2 - 45889) : null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static void method259(boolean arg0) {
        field648 = null;
        field643 = null;
        if (!arg0) {
            field645 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBI)I")
    public static final int method260(int arg0, int arg1, byte arg2, int arg3) {
        field649++;
        if (arg2 != 98) {
            method259(true);
        }
        if (arg1 <= arg3) {
            return arg0 >= arg3 ? arg3 : arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static final void method261(byte arg0) {
        field642++;
        if (class106.field1912 == 5) {
            class106.field1912 = 6;
            if (arg0 > -94) {
                field645 = null;
            }
        }
    }
}
