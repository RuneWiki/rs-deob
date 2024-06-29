import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 extends class81 {

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lpj;")
    public static class237 field422 = class33.method353("::errortest", 93);

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Lak;")
    public static class135 field414 = new class135(64);

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field424 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field425 = 1;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Lpj;")
    public static class237 field427 = class33.method353("Starte 3D)2Softwarebibliothek)3", 62);

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field428 = -1;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Lpj;")
    public static class237 field429 = class33.method353("Speicher wird zugewiesen)3", 23);

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Lcj;")
    public static class115 field417;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method211(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class14.field234++;
        class92.field1661 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class41.field927; var12 < class158.field2852; var12++) {
            class35[][] var38 = class274.field4775[var12];
            for (int var39 = class143.field2589; var39 < class259.field4452; var39++) {
                for (int var40 = class91.field1654; var40 < class59.field1211; var40++) {
                    class35 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class56.field1152[var39 + class159.field2860 - class275.field4833][var40 + class159.field2860 - class207.field3515] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field773 = true;
                            var41.field770 = true;
                            if (var41.field759 > 0) {
                                var41.field775 = true;
                            } else {
                                var41.field775 = false;
                            }
                            class92.field1661++;
                        } else {
                            var41.field773 = false;
                            var41.field770 = false;
                            var41.field766 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field763 != null) {
                                    class114 var42 = var41.field763;
                                    var42.field1999.method703(var42.field2005, var42.field2005, var42.field2003, var42.field2003, 0);
                                    if (var42.field1993 != null) {
                                        var42.field1993.method703(var42.field2005, var42.field2005, var42.field2003, var42.field2003, 0);
                                    }
                                }
                                if (var41.field749 != null) {
                                    class212 var43 = var41.field749;
                                    var43.field3604.method703(var43.field3610, var43.field3610, var43.field3622, var43.field3622, 0);
                                    if (var43.field3605 != null) {
                                        var43.field3605.method703(var43.field3610, var43.field3610, var43.field3622, var43.field3622, 0);
                                    }
                                }
                                if (var41.field753 != null) {
                                    class232 var44 = var41.field753;
                                    var44.field4012.method703(var44.field4017, var44.field4017, var44.field4013, var44.field4013, 0);
                                }
                                if (var41.field755 != null) {
                                    for (int var45 = 0; var45 < var41.field759; var45++) {
                                        class191 var46 = var41.field755[var45];
                                        var46.field3318.method703(var46.field3315, var46.field3320, var46.field3327, var46.field3316, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class99.field1773 == class206.field3509;
        for (int var14 = class41.field927; var14 < class158.field2852; var14++) {
            class35[][] var27 = class274.field4775[var14];
            for (int var28 = -class159.field2860; var28 <= 0; var28++) {
                int var29 = class275.field4833 + var28;
                int var30 = class275.field4833 - var28;
                if (var29 >= class143.field2589 || var30 < class259.field4452) {
                    for (int var31 = -class159.field2860; var31 <= 0; var31++) {
                        int var32 = class207.field3515 + var31;
                        int var33 = class207.field3515 - var31;
                        if (var29 >= class143.field2589) {
                            if (var32 >= class91.field1654) {
                                class35 var34 = var27[var29][var32];
                                if (var34 != null && var34.field773) {
                                    class262.method1757(var34, true);
                                }
                            }
                            if (var33 < class59.field1211) {
                                class35 var35 = var27[var29][var33];
                                if (var35 != null && var35.field773) {
                                    class262.method1757(var35, true);
                                }
                            }
                        }
                        if (var30 < class259.field4452) {
                            if (var32 >= class91.field1654) {
                                class35 var36 = var27[var30][var32];
                                if (var36 != null && var36.field773) {
                                    class262.method1757(var36, true);
                                }
                            }
                            if (var33 < class59.field1211) {
                                class35 var37 = var27[var30][var33];
                                if (var37 != null && var37.field773) {
                                    class262.method1757(var37, true);
                                }
                            }
                        }
                        if (class92.field1661 == 0) {
                            if (!var13) {
                                class247.field4304 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class41.field927; var15 < class158.field2852; var15++) {
            class35[][] var16 = class274.field4775[var15];
            for (int var17 = -class159.field2860; var17 <= 0; var17++) {
                int var18 = class275.field4833 + var17;
                int var19 = class275.field4833 - var17;
                if (var18 >= class143.field2589 || var19 < class259.field4452) {
                    for (int var20 = -class159.field2860; var20 <= 0; var20++) {
                        int var21 = class207.field3515 + var20;
                        int var22 = class207.field3515 - var20;
                        if (var18 >= class143.field2589) {
                            if (var21 >= class91.field1654) {
                                class35 var23 = var16[var18][var21];
                                if (var23 != null && var23.field773) {
                                    class262.method1757(var23, false);
                                }
                            }
                            if (var22 < class59.field1211) {
                                class35 var24 = var16[var18][var22];
                                if (var24 != null && var24.field773) {
                                    class262.method1757(var24, false);
                                }
                            }
                        }
                        if (var19 < class259.field4452) {
                            if (var21 >= class91.field1654) {
                                class35 var25 = var16[var19][var21];
                                if (var25 != null && var25.field773) {
                                    class262.method1757(var25, false);
                                }
                            }
                            if (var22 < class59.field1211) {
                                class35 var26 = var16[var19][var22];
                                if (var26 != null && var26.field773) {
                                    class262.method1757(var26, false);
                                }
                            }
                        }
                        if (class92.field1661 == 0) {
                            if (!var13) {
                                class247.field4304 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class247.field4304 = false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)Z")
    public final boolean method212(byte arg0, int arg1, int arg2) {
        if (arg0 < 100) {
            this.method212((byte) -20, 69, -54);
        }
        field416++;
        return arg2 >= this.field413 && arg2 <= this.field421 && arg1 >= this.field418 && arg1 <= this.field412;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method213(byte arg0) {
        if (arg0 != -48) {
            method211(-85, -80, -1, (byte[][][]) null, 123, (byte) -2, -58, -50);
        }
        field417 = null;
        field427 = null;
        field429 = null;
        field414 = null;
        field422 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(BII)I")
    public static final int method214(byte arg0, int arg1, int arg2) {
        int var3 = class12.method119(arg1 - 1, arg2 + -1, -19341) + class12.method119(arg1 - 1, arg2 - -1, arg0 - 19259) + class12.method119(arg1 + 1, arg2 - 1, -19341) + class12.method119(arg1 + 1, arg2 + 1, -19341);
        int var4 = class12.method119(arg1, arg2 - 1, arg0 ^ 0x4BDD) + class12.method119(arg1, arg2 + 1, arg0 + -19259) - (-class12.method119(arg1 + -1, arg2, -19341) - class12.method119(arg1 - -1, arg2, -19341));
        field420++;
        if (arg0 == -82) {
            int var5 = class12.method119(arg1, arg2, arg0 ^ 0x4BDD);
            return var5 / 4 + var3 / 16 + var4 / 8;
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILfa;IB)[Lcj;")
    public static final class115[] method215(int arg0, class239 arg1, int arg2, byte arg3) {
        field419++;
        if (arg3 != 107) {
            method213((byte) 80);
        }
        return class123.method883(arg2, arg0, arg3 ^ 0xFFFFFF94, arg1) ? class100.method760(0) : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)I")
    public static final int method216(int arg0, int arg1, int arg2, int arg3) {
        field415++;
        if (class99.field1773 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class73.field1410[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        if (arg0 >= -1) {
            method211(-74, 19, -25, (byte[][][]) null, 51, (byte) 16, 96, 6);
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var8) * class99.field1773[var6][var4][var5] + class99.field1773[var6][var4 + 1][var5] * var8 >> 7;
        int var10 = (128 - var8) * class99.field1773[var6][var4][var5 + 1] + (class99.field1773[var6][var4 + 1][var5 + 1] * var8) >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIII)V")
    public class23(int arg0, int arg1, int arg2, int arg3) {
        this.field412 = arg3;
        this.field418 = arg1;
        this.field413 = arg0;
        this.field421 = arg2;
    }
}
