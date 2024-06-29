import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class28 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lcd;")
    private static class64 field448 = class44.method335((byte) 71, "Choose Option");

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lcd;")
    public static class64 field452 = field448;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lcd;")
    public static class64 field454 = class44.method335((byte) 71, "titlebg");

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field446;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 10)
    public static void method244(int arg0) {
        field446 = null;
        if (arg0 != 0) {
            field452 = (class64) null;
        }
        field448 = null;
        field452 = null;
        field454 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIZI)V", line = 39)
    public static final void method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field449++;
        if (arg7 >= class290.field4976 && class153.field2714 >= arg7 && arg1 >= class290.field4976 && arg1 <= class153.field2714 && class290.field4976 <= arg6 && class153.field2714 >= arg6 && arg2 >= class290.field4976 && class153.field2714 >= arg2 && arg4 >= class180.field3098 && class201.field3444 >= arg4 && arg3 >= class180.field3098 && class201.field3444 >= arg3 && arg9 >= class180.field3098 && arg9 <= class201.field3444 && class180.field3098 <= arg5 && class201.field3444 >= arg5) {
            class168.method1195(-109, arg6, arg0, arg2, arg1, arg4, arg5, arg3, arg7, arg9);
        } else {
            class232.method1668(2, arg1, arg9, arg7, arg3, arg0, arg6, arg5, arg2, arg4);
        }
        if (arg8) {
            field454 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIIIIII)V", line = 58)
    public static final void method246(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field447++;
        if (class77.field1453 == 0) {
            class59.field992++;
            int var7 = class290.field4964;
            int var8 = class181.field3113;
            int var9 = class61.field1186;
            int var10 = class66.field1307;
            int var11 = (arg5 - arg2) * (var10 - var9) / arg6 + var9;
            int var12 = (arg4 - arg3) * (var8 - var7) / arg1 + var7;
            if (class42.field690 && (class164.field2883 & 0x40) == 64) {
                class60 var13 = class25.method229(class223.field3809, (byte) 124, class185.field3168);
                if (var13 == null) {
                    class137.method980(25115);
                } else {
                    class248.method1792(class165.field2898, var12, var11, (byte) -60, 0L, (short) 59, class43.field708);
                }
            } else {
                class248.method1792(class188.field3240, var12, var11, (byte) 121, 0L, (short) 3, class260.field4480);
            }
        }
        long var14 = -1L;
        if (arg0 >= -25) {
            method244(49);
        }
        for (int var16 = 0; var16 < class70.field1349; var16++) {
            long var17 = class186.field3203[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) var17 >> 7 & 0x7F;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class119.method844(class20.field364, var19, var21, var17)) {
                    class290 var23 = class172.method1207(var22, -125);
                    if (var23.field4993 != null) {
                        var23 = var23.method2001(true);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class77.field1453 == 1) {
                        class287.field4915++;
                        class248.method1792(class104.method768(new class64[] { class32.field534, class159.field2816, var23.field4975 }, false), var19, var21, (byte) 123, var17, (short) 12, class213.field3588);
                    } else if (!class42.field690) {
                        class64[] var24 = var23.field4956;
                        if (class220.field3719) {
                            var24 = class269.method1885((byte) 26, var24);
                        }
                        class53.field867++;
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 47;
                                    }
                                    if (var25 == 1) {
                                        var26 = 49;
                                    }
                                    if (var25 == 2) {
                                        var26 = 42;
                                    }
                                    if (var25 == 3) {
                                        var26 = 35;
                                    }
                                    class88.field1582++;
                                    if (var25 == 4) {
                                        var26 = 1007;
                                    }
                                    class248.method1792(class104.method768(new class64[] { class29.field498, var23.field4975 }, false), var19, var21, (byte) 125, var17, var26, var24[var25]);
                                }
                            }
                        }
                        class248.method1792(class104.method768(new class64[] { class29.field498, var23.field4975 }, false), var19, var21, (byte) 123, (long) var23.field4962, (short) 1001, class107.field1983);
                    } else if ((class164.field2883 & 0x4) == 4) {
                        class248.method1792(class104.method768(new class64[] { class103.field1891, class159.field2816, var23.field4975 }, false), var19, var21, (byte) 121, var17, (short) 34, class43.field708);
                        class199.field3390++;
                    }
                }
                if (var20 == 1) {
                    class232 var27 = class2.field12[var22];
                    if (var27.field3911.field141 == 1 && (var27.field1859 & 0x7F) == 64 && (var27.field1865 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class218.field3707; var28++) {
                            class232 var29 = class2.field12[class254.field4422[var28]];
                            if (var29 != null && var27 != var29 && var29.field3911.field141 == 1 && var27.field1859 == var29.field1859 && var27.field1865 == var29.field1865) {
                                class281.method1942(var19, -6475, var29.field3911, var21, class254.field4422[var28]);
                            }
                        }
                        for (int var30 = 0; var30 < class163.field2862; var30++) {
                            class41 var31 = class284.field4888[class194.field3307[var30]];
                            if (var31 != null && var27.field1859 == var31.field1859 && var27.field1865 == var31.field1865) {
                                class166.method1183(true, var31, class194.field3307[var30], var19, var21);
                            }
                        }
                    }
                    class281.method1942(var19, -6475, var27.field3911, var21, var22);
                }
                if (var20 == 0) {
                    class41 var32 = class284.field4888[var22];
                    if ((var32.field1859 & 0x7F) == 64 && (var32.field1865 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class218.field3707; var33++) {
                            class232 var34 = class2.field12[class254.field4422[var33]];
                            if (var34 != null && var34.field3911.field141 == 1 && var32.field1859 == var34.field1859 && var32.field1865 == var34.field1865) {
                                class281.method1942(var19, -6475, var34.field3911, var21, class254.field4422[var33]);
                            }
                        }
                        for (int var35 = 0; var35 < class163.field2862; var35++) {
                            class41 var36 = class284.field4888[class194.field3307[var35]];
                            if (var36 != null && var32 != var36 && var32.field1859 == var36.field1859 && var32.field1865 == var36.field1865) {
                                class166.method1183(true, var36, class194.field3307[var35], var19, var21);
                            }
                        }
                    }
                    class166.method1183(true, var32, var22, var19, var21);
                }
                if (var20 == 3) {
                    class106 var37 = class274.field4712[class20.field364][var19][var21];
                    if (var37 != null) {
                        for (class258 var38 = (class258) var37.method779(28619); var38 != null; var38 = (class258) var37.method777((byte) 5)) {
                            int var39 = var38.field4459.field2742;
                            class92 var40 = class132.method949(var39, false);
                            if (class77.field1453 == 1) {
                                class248.method1792(class104.method768(new class64[] { class32.field534, class53.field855, var40.field1669 }, false), var19, var21, (byte) -110, (long) var39, (short) 38, class213.field3588);
                                class135.field2393++;
                            } else if (!class42.field690) {
                                class64[] var41 = var40.field1713;
                                class47.field779++;
                                if (class220.field3719) {
                                    var41 = class269.method1885((byte) 26, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class29.field461++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 10;
                                        }
                                        if (var42 == 1) {
                                            var43 = 19;
                                        }
                                        if (var42 == 2) {
                                            var43 = 24;
                                        }
                                        if (var42 == 3) {
                                            var43 = 25;
                                        }
                                        if (var42 == 4) {
                                            var43 = 45;
                                        }
                                        class248.method1792(class104.method768(new class64[] { class190.field3261, var40.field1669 }, false), var19, var21, (byte) 121, (long) var39, var43, var41[var42]);
                                    } else if (var42 == 2) {
                                        class213.field3592++;
                                        class248.method1792(class104.method768(new class64[] { class190.field3261, var40.field1669 }, false), var19, var21, (byte) 123, (long) var39, (short) 24, class185.field3170);
                                    }
                                }
                                class248.method1792(class104.method768(new class64[] { class190.field3261, var40.field1669 }, false), var19, var21, (byte) 122, (long) var39, (short) 1004, class107.field1983);
                            } else if ((class164.field2883 & 0x1) == 1) {
                                class248.method1792(class104.method768(new class64[] { class103.field1891, class53.field855, var40.field1669 }, false), var19, var21, (byte) -89, (long) var39, (short) 43, class43.field708);
                                class25.field416++;
                            }
                        }
                    }
                }
            }
        }
    }
}
