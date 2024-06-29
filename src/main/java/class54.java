import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class54 extends class120 {

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field771 = 0;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "Ljava/lang/String;")
    public static String field775 = "Ok";

    @OriginalMember(owner = "client!km", name = "V", descriptor = "S")
    public static short field779 = 32767;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "B")
    public byte field774;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "Lbj;")
    public class215 field768;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method343(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++class2.field14;
        class235.field3669 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class131.field1831; var12 < class150.field2077; ++var12) {
            class91[][] var38 = class246.field3856[var12];
            for (int var39 = class79.field1095; var39 < class312.field5018; ++var39) {
                for (int var40 = class85.field1207; var40 < class248.field3884; ++var40) {
                    class91 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class267.field4284[var39 - class231.field3613 + class307.field4936][var40 - class216.field3312 + class307.field4936] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1344 = true;
                            var41.field1328 = true;
                            if (var41.field1343 > 0) {
                                var41.field1330 = true;
                            } else {
                                var41.field1330 = false;
                            }
                            ++class235.field3669;
                        } else {
                            var41.field1344 = false;
                            var41.field1328 = false;
                            var41.field1324 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1334 != null) {
                                    class180 var42 = var41.field1334;
                                    var42.field2735.method7(0, var12, var42.field2740, var42.field2736, var42.field2732);
                                    if (var42.field2729 != null) {
                                        var42.field2729.method7(0, var12, var42.field2740, var42.field2736, var42.field2732);
                                    }
                                }
                                if (var41.field1329 != null) {
                                    class75 var43 = var41.field1329;
                                    var43.field1047.method7(var43.field1046, var12, var43.field1058, var43.field1048, var43.field1051);
                                    if (var43.field1057 != null) {
                                        var43.field1057.method7(var43.field1046, var12, var43.field1058, var43.field1048, var43.field1051);
                                    }
                                }
                                if (var41.field1323 != null) {
                                    class308 var44 = var41.field1323;
                                    var44.field4953.method7(0, var12, var44.field4945, var44.field4956, var44.field4946);
                                }
                                if (var41.field1339 != null) {
                                    for (int var45 = 0; var45 < var41.field1343; ++var45) {
                                        class160 var46 = var41.field1339[var45];
                                        var46.field2230.method7(var46.field2222, var12, var46.field2233, var46.field2226, var46.field2227);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class228.field3576 == class185.field2812;
        for (int var14 = class131.field1831; var14 < class150.field2077; ++var14) {
            class91[][] var27 = class246.field3856[var14];
            for (int var28 = -class307.field4936; var28 <= 0; ++var28) {
                int var29 = class231.field3613 + var28;
                int var30 = class231.field3613 - var28;
                if (var29 >= class79.field1095 || var30 < class312.field5018) {
                    for (int var31 = -class307.field4936; var31 <= 0; ++var31) {
                        int var32 = class216.field3312 + var31;
                        int var33 = class216.field3312 - var31;
                        if (var29 >= class79.field1095) {
                            if (var32 >= class85.field1207) {
                                class91 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1344) {
                                    class300.method2007(var34, true);
                                }
                            }
                            if (var33 < class248.field3884) {
                                class91 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1344) {
                                    class300.method2007(var35, true);
                                }
                            }
                        }
                        if (var30 < class312.field5018) {
                            if (var32 >= class85.field1207) {
                                class91 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1344) {
                                    class300.method2007(var36, true);
                                }
                            }
                            if (var33 < class248.field3884) {
                                class91 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1344) {
                                    class300.method2007(var37, true);
                                }
                            }
                        }
                        if (class235.field3669 == 0) {
                            if (!var13) {
                                class108.field1545 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class131.field1831; var15 < class150.field2077; ++var15) {
            class91[][] var16 = class246.field3856[var15];
            for (int var17 = -class307.field4936; var17 <= 0; ++var17) {
                int var18 = class231.field3613 + var17;
                int var19 = class231.field3613 - var17;
                if (var18 >= class79.field1095 || var19 < class312.field5018) {
                    for (int var20 = -class307.field4936; var20 <= 0; ++var20) {
                        int var21 = class216.field3312 + var20;
                        int var22 = class216.field3312 - var20;
                        if (var18 >= class79.field1095) {
                            if (var21 >= class85.field1207) {
                                class91 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1344) {
                                    class300.method2007(var23, false);
                                }
                            }
                            if (var22 < class248.field3884) {
                                class91 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1344) {
                                    class300.method2007(var24, false);
                                }
                            }
                        }
                        if (var19 < class312.field5018) {
                            if (var21 >= class85.field1207) {
                                class91 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1344) {
                                    class300.method2007(var25, false);
                                }
                            }
                            if (var22 < class248.field3884) {
                                class91 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1344) {
                                    class300.method2007(var26, false);
                                }
                            }
                        }
                        if (class235.field3669 == 0) {
                            if (!var13) {
                                class108.field1545 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class108.field1545 = false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLnh;)V")
    public static final void method344(byte arg0, class305 arg1) {
        class191.field2909 = class158.method979(class314.field5029, arg1, 0, -126);
        class189.field2857 = class158.method979(class126.field1774, arg1, 0, -121);
        class56.field783 = class158.method979(class194.field2965, arg1, 0, -125);
        ++field773;
        class177.field2504 = class158.method979(class258.field4177, arg1, 0, -122);
        class99.field1435 = class158.method979(class121.field1725, arg1, 0, -128);
        class21.field342 = class158.method979(class38.field576, arg1, 0, -127);
        class11.field187 = class76.method497(class230.field3604, 120, 0, arg1);
        class96.field1388 = class76.method497(class72.field1039, 74, 0, arg1);
        class154.field2140 = class76.method497(class278.field4413, 91, 0, arg1);
        class75.field1044 = class291.method1954(class291.field4643, arg1, 0, -1);
        class260.field4196 = class291.method1954(class170.field2419, arg1, 0, -1);
        class301.field4788.method225(class260.field4196, (int[]) null);
        class17.field293.method225(class260.field4196, (int[]) null);
        class261.field4201.method225(class260.field4196, (int[]) null);
        class203 var2 = class280.method1816(class15.field264, 0, arg1, 0);
        var2.method1266();
        class246.field3869 = var2;
        if (arg0 >= -39) {
            method347(-47);
        }
        class203[] var3 = class99.method640(109, 0, class48.field696, arg1);
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            var3[var4].method1266();
        }
        class166.field2357 = var3;
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(I)[B")
    public final byte[] method345(int arg0) {
        if (arg0 <= 54) {
            method346(-74, -81);
        }
        ++field769;
        if (!super.field1712 && ~(this.field768.field3287.length + -this.field774) >= ~this.field768.field3280) {
            return this.field768.field3287;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V")
    public static final void method346(int arg0, int arg1) {
        class159.field2208 = 1;
        class235.field3666 = -1;
        ++field772;
        if (arg1 != 31058) {
            field770 = -35;
        }
        class4.field31 = false;
        class209.field3112 = -1;
        class145.field2006 = null;
        class186.field2825 = 0;
        class251.field3915 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(I)V")
    public static void method347(int arg0) {
        if (arg0 < 96) {
            field770 = -111;
        }
        field775 = null;
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)I")
    public final int method348(int arg0) {
        ++field777;
        if (arg0 >= -55) {
            field779 = 24;
        }
        return this.field768 == null ? 0 : this.field768.field3280 * 100 / (this.field768.field3287.length + -this.field774);
    }
}
