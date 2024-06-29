import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class248 extends class32 {

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Z")
    public static boolean field4312 = false;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lij;")
    public static class50 field4313 = class78.method578(125, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "J")
    public long field4309;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lvf;")
    public class248 field4314;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lvf;")
    public class248 field4315;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLda;IZI)V")
    public static final void method1689(int arg0, byte arg1, class22 arg2, int arg3, boolean arg4, int arg5) {
        class52.field951 = arg0;
        class245.field4254 = arg4;
        field4311++;
        class56.field995 = arg3;
        int var6 = -52 % ((-arg1 - 31) / 45);
        class46.field841 = arg2;
        class127.field2229 = arg5;
        class139.field2411 = 1;
        class194.field3228 = 10000;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I")
    public static final int method1690(int arg0, int arg1, int arg2) {
        class99 var3 = (class99) class90.field1716.method443((long) arg1, (byte) -83);
        field4308++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 < 123) {
                method1691(110, 81, -79, (byte) 10, 30, 39, -74, 78, 103);
            }
            for (int var5 = 0; var5 < var3.field1822.length; var5++) {
                if (var3.field1829[var5] == arg2) {
                    var4 += var3.field1822[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method1691(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4310++;
        int var9 = arg2 - arg7;
        int var10 = arg1 - arg0;
        int var11 = (arg6 - arg8 << 16) / var9;
        if (class155.field2701 > arg2) {
            var9++;
        }
        int var12 = (arg5 - arg4 << 16) / var10;
        if (class140.field2460 > arg1) {
            var10++;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            int var30 = var11 * var13 >> 16;
            int var31 = (var13 + 1) * var11 >> 16;
            int var32 = var31 - var30;
            if (var32 > 0) {
                int var33 = arg8 + var30;
                int var34 = arg8 + var31;
                int var35 = arg7 + var13 >> 6;
                byte[][] var36 = class84.field1624[var35];
                int[][] var37 = class184.field3024[var35];
                byte[][] var38 = class250.field4332[var35];
                byte[][] var39 = class161.field2766[var35];
                byte[][] var40 = class203.field3374[var35];
                byte[][] var41 = class237.field4012[var35];
                for (int var42 = 0; var42 < var10; var42++) {
                    int var43 = var12 * var42 >> 16;
                    int var44 = (var42 + 1) * var12 >> 16;
                    int var45 = var44 - var43;
                    if (var45 > 0) {
                        int var46 = arg4 + var43;
                        int var47 = arg4 + var44;
                        int var48 = arg0 + var42 >> 6;
                        int var49 = arg0 + var42 & 0x3F;
                        int var50 = arg7 + var13 & 0x3F;
                        int var51 = (var49 << 6) + var50;
                        int var54;
                        if (var37[var48] == null) {
                            int var52 = arg0 + var42 & 0x4;
                            int var53 = arg7 + var13 & 0x4;
                            if ((var53 >= 2 || var52 <= 2) && (var53 <= 2 || var52 >= 2)) {
                                var54 = class201.field3311[class3.field52 + 1];
                            } else {
                                var54 = 4936552;
                            }
                        } else {
                            var54 = var37[var48][var51];
                        }
                        if (var54 == 0) {
                            var54 = 1;
                        }
                        int var55 = var36[var48] == null ? 0 : class201.field3311[var36[var48][var51] & 0xFF];
                        int var56 = var38[var48] == null ? 0 : class201.field3311[var38[var48][var51] & 0xFF];
                        if (var55 == 0 && var56 == 0) {
                            class158.method1104(var33, var46, var32, var45, var54);
                        } else {
                            if (var55 != 0) {
                                byte var57 = var39[var48] == null ? 0 : var39[var48][var51];
                                int var58 = var57 & 0xFC;
                                if (var55 == -1) {
                                    var55 = 1;
                                }
                                if (var58 == 0 || var32 <= 1 || var45 <= 1) {
                                    class158.method1104(var33, var46, var32, var45, var55);
                                } else {
                                    class240.method1637(var46, var33, var54, (byte) -24, true, var55, class158.field2729, var32, var58 >> 2, var45, var57 & 0x3);
                                }
                            }
                            if (var56 != 0) {
                                if (var56 == -1) {
                                    var56 = var54;
                                }
                                byte var59 = var40[var48][var51];
                                int var60 = var59 & 0xFC;
                                if (var60 == 0 || var32 <= 1 || var45 <= 1) {
                                    class158.method1104(var33, var46, var32, var45, var56);
                                }
                                class240.method1637(var46, var33, 0, (byte) -24, var55 == 0, var56, class158.field2729, var32, var60 >> 2, var45, var59 & 0x3);
                            }
                        }
                        if (var41[var48] != null) {
                            int var61 = var41[var48][var51] & 0xFF;
                            if (var61 != 0) {
                                int var62;
                                if (var32 == 1) {
                                    var62 = var33;
                                } else {
                                    var62 = var34 - 1;
                                }
                                int var63 = 13421772;
                                int var64;
                                if (var45 == 1) {
                                    var64 = var46;
                                } else {
                                    var64 = var47 - 1;
                                }
                                if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                    var61 -= 4;
                                    var63 = 13369344;
                                }
                                if (var61 == 1) {
                                    class158.method1114(var33, var46, var45, var63);
                                } else if (var61 == 2) {
                                    class158.method1107(var33, var46, var32, var63);
                                } else if (var61 == 3) {
                                    class158.method1114(var62, var46, var45, var63);
                                } else if (var61 == 4) {
                                    class158.method1107(var33, var64, var32, var63);
                                } else if (var61 == 9) {
                                    class158.method1114(var33, var46, var45, 16777215);
                                    class158.method1107(var33, var46, var32, var63);
                                } else if (var61 == 10) {
                                    class158.method1114(var62, var46, var45, 16777215);
                                    class158.method1107(var33, var46, var32, var63);
                                } else if (var61 == 11) {
                                    class158.method1114(var62, var46, var45, 16777215);
                                    class158.method1107(var33, var64, var32, var63);
                                } else if (var61 == 12) {
                                    class158.method1114(var33, var46, var45, 16777215);
                                    class158.method1107(var33, var64, var32, var63);
                                } else if (var61 == 17) {
                                    class158.method1107(var33, var46, 1, var63);
                                } else if (var61 == 18) {
                                    class158.method1107(var62, var46, 1, var63);
                                } else if (var61 == 19) {
                                    class158.method1107(var62, var64, 1, var63);
                                } else if (var61 == 20) {
                                    class158.method1107(var33, var64, 1, var63);
                                } else if (var61 == 25) {
                                    for (int var65 = 0; var65 < var45; var65++) {
                                        class158.method1107(var33 + var65, -var65 + var64, 1, var63);
                                    }
                                } else if (var61 == 26) {
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        class158.method1107(var33 + var66, var46 - -var66, 1, var63);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var10000 = arg8 + var15;
                byte[][] var19 = class153.field2679[arg7 + var14 >> 6];
                int var20 = arg8 + var16;
                for (int var21 = 0; var21 < var10; var21++) {
                    int var22 = (var21 + 1) * var12 >> 16;
                    int var23 = var12 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (var24 > 0) {
                        var10000 = arg4 + var22;
                        int var26 = arg0 + var21 >> 6;
                        int var27 = ((var21 + arg0 & 0x3F) << 6) + (arg7 + var14 & 0x3F);
                        int var28 = arg4 + var23;
                        if (var19[var26] != null) {
                            int var29 = var19[var26][var27] & 0xFF;
                            if (var29 != 0) {
                                if (var29 == 47 || var29 == 53) {
                                    class28.field601[var29 - 1].method514(var20, var28, var17 * 2 + 1, var24 * 2 + 1);
                                } else {
                                    class28.field601[var29 - 1].method514(var20 - (var17 / 2), -(var24 / 2) + var28, var17 * 2, var24 * 2);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 <= 85) {
            method1689(17, (byte) -100, (class22) null, -91, false, 21);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public static void method1692(int arg0) {
        field4313 = null;
        if (arg0 != -2) {
            method1691(28, 24, 105, (byte) -18, -44, -40, 90, -52, -56);
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public final void method1693(int arg0) {
        field4316++;
        if (arg0 != 63) {
            method1692(31);
        }
        if (this.field4314 != null) {
            this.field4314.field4315 = this.field4315;
            this.field4315.field4314 = this.field4314;
            this.field4315 = null;
            this.field4314 = null;
        }
    }
}
