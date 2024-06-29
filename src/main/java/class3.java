import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class261 {

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    private int field55 = 6;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Z")
    public static boolean field39 = false;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Lve;")
    public static class255 field43 = class87.method607(120, "");

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lve;")
    public static class255 field48 = class87.method607(104, "Clientscript error in: ");

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Lve;")
    public static class255 field49 = class87.method607(59, "scape main");

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lve;")
    public static class255 field52 = class87.method607(64, "Fallen lassen");

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 6)
    public static void method12(int arg0) {
        field52 = null;
        field43 = null;
        field49 = null;
        field48 = null;
        if (arg0 != -1979359896) {
            field48 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 25)
    public class3() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)[[I", line = 29)
    public final int[][] method13(boolean arg0, int arg1) {
        field42++;
        if (!arg0) {
            method19(119);
        }
        int[][] var3 = this.field4418.method35(arg1, 113);
        if (this.field4418.field94) {
            int[][] var4 = this.method1819(-92, 0, arg1);
            int[][] var5 = this.method1819(120, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var3[2];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field55;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class92.field1576; var63++) {
                    var6[var63] = var9[var63] + var11[var63];
                    var7[var63] = var8[var63] + var14[var63];
                    var10[var63] = var12[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class92.field1576; var16++) {
                    var6[var16] = var9[var16] - var11[var16];
                    var7[var16] = var8[var16] - var14[var16];
                    var10[var16] = var12[var16] - var13[var16];
                }
            } else if (var15 == 3) {
                for (int var62 = 0; var62 < class92.field1576; var62++) {
                    var6[var62] = var9[var62] * var11[var62] >> 12;
                    var7[var62] = var8[var62] * var14[var62] >> 12;
                    var10[var62] = var12[var62] * var13[var62] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class92.field1576; var17++) {
                    int var18 = var11[var17];
                    int var19 = var14[var17];
                    int var20 = var13[var17];
                    var6[var17] = var18 == 0 ? 4096 : (var9[var17] << 12) / var18;
                    var7[var17] = var19 == 0 ? 4096 : (var8[var17] << 12) / var19;
                    var10[var17] = var20 == 0 ? 4096 : (var12[var17] << 12) / var20;
                }
            } else if (var15 == 5) {
                for (int var61 = 0; var61 < class92.field1576; var61++) {
                    var6[var61] = 4096 - ((4096 - var9[var61]) * (4096 - var11[var61]) >> 12);
                    var7[var61] = 4096 - ((4096 - var14[var61]) * (4096 - var8[var61]) >> 12);
                    var10[var61] = 4096 - ((4096 - var12[var61]) * (4096 - var13[var61]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var57 = 0; var57 < class92.field1576; var57++) {
                    int var58 = var14[var57];
                    int var59 = var13[var57];
                    int var60 = var11[var57];
                    var6[var57] = var60 >= 2048 ? 4096 - ((4096 - var9[var57]) * (4096 - var60) >> 11) : var9[var57] * var60 >> 11;
                    var7[var57] = var58 < 2048 ? var8[var57] * var58 >> 11 : 4096 - ((4096 - var8[var57]) * (4096 - var58) >> 11);
                    var10[var57] = var59 >= 2048 ? 4096 - ((4096 - var59) * (4096 - var12[var57]) >> 11) : var12[var57] * var59 >> 11;
                }
            } else if (var15 == 7) {
                for (int var21 = 0; var21 < class92.field1576; var21++) {
                    int var22 = var9[var21];
                    int var23 = var8[var21];
                    int var24 = var12[var21];
                    var6[var21] = var22 == 4096 ? 4096 : (var11[var21] << 12) / (4096 - var22);
                    var7[var21] = var23 == 4096 ? 4096 : (var14[var21] << 12) / (4096 - var23);
                    var10[var21] = var24 == 4096 ? 4096 : (var13[var21] << 12) / (4096 - var24);
                }
            } else if (var15 == 8) {
                for (int var25 = 0; var25 < class92.field1576; var25++) {
                    int var26 = var9[var25];
                    int var27 = var8[var25];
                    int var28 = var12[var25];
                    var6[var25] = var26 == 0 ? 0 : 4096 - ((4096 - var11[var25] << 12) / var26);
                    var7[var25] = var27 == 0 ? 0 : 4096 - (4096 - var14[var25] << 12) / var27;
                    var10[var25] = var28 == 0 ? 0 : 4096 - ((4096 - var13[var25] << 12) / var28);
                }
            } else if (var15 == 9) {
                for (int var29 = 0; var29 < class92.field1576; var29++) {
                    int var30 = var9[var29];
                    int var31 = var14[var29];
                    int var32 = var12[var29];
                    int var33 = var8[var29];
                    int var34 = var13[var29];
                    int var35 = var11[var29];
                    var6[var29] = var35 > var30 ? var30 : var35;
                    var7[var29] = var31 > var33 ? var33 : var31;
                    var10[var29] = var34 <= var32 ? var34 : var32;
                }
            } else if (var15 == 10) {
                for (int var36 = 0; var36 < class92.field1576; var36++) {
                    int var37 = var12[var36];
                    int var38 = var13[var36];
                    int var39 = var11[var36];
                    int var40 = var8[var36];
                    int var41 = var14[var36];
                    int var42 = var9[var36];
                    var6[var36] = var42 <= var39 ? var39 : var42;
                    var7[var36] = var41 < var40 ? var40 : var41;
                    var10[var36] = var38 < var37 ? var37 : var38;
                }
            } else if (var15 == 11) {
                for (int var43 = 0; var43 < class92.field1576; var43++) {
                    int var44 = var12[var43];
                    int var45 = var13[var43];
                    int var46 = var9[var43];
                    int var47 = var14[var43];
                    int var48 = var11[var43];
                    int var49 = var8[var43];
                    var6[var43] = var48 >= var46 ? var48 - var46 : -var48 + var46;
                    var7[var43] = var49 > var47 ? var49 - var47 : var47 - var49;
                    var10[var43] = var45 >= var44 ? var45 - var44 : -var45 + var44;
                }
            } else if (var15 == 12) {
                for (int var50 = 0; var50 < class92.field1576; var50++) {
                    int var51 = var13[var50];
                    int var52 = var11[var50];
                    int var53 = var9[var50];
                    int var54 = var14[var50];
                    int var55 = var8[var50];
                    int var56 = var12[var50];
                    var6[var50] = var53 + var52 - (var52 * var53 >> 11);
                    var7[var50] = var55 - ((var54 * var55 >> 11) - var54);
                    var10[var50] = var56 - ((var51 * var56 >> 11) - var51);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([Lve;B)Lve;", line = 344)
    public static final class255 method14(class255[] arg0, byte arg1) {
        field54++;
        if (arg1 > -50) {
            field48 = (class255) null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class266.method1849(arg0.length, 0, false, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIIII)V", line = 369)
    public static final void method15(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 76) {
            field52 = (class255) null;
        }
        field45++;
        if (arg0 >= class125.field2082 && arg2 <= class30.field473 && class261.field4427 <= arg6 && arg3 <= class11.field156) {
            if (arg5 == 1) {
                class266.method1850(arg4, (byte) -69, arg2, arg3, arg6, arg0);
            } else {
                class87.method606(arg0, false, arg5, arg3, arg2, arg6, arg4);
            }
        } else if (arg5 == 1) {
            class255.method1770(arg3, arg2, arg4, arg0, arg6, false);
        } else {
            class238.method1648(arg5, arg3, arg6, arg2, arg0, arg4, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 405)
    public static final void method16(int arg0) {
        class255.field4318.method1523(22260, arg0);
        class82.field1336++;
        field44++;
        class255.field4318.method449(arg0 ^ 0xFF000D, 0L);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 415)
    public static final void method17(int arg0) {
        field40++;
        class92.field1579.method553(-103);
        class121.field2014.method553(125);
        class68.field1015.method553(-59);
        if (arg0 != -2) {
            field52 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 429)
    public static final void method18(int arg0) {
        if (arg0 != -981) {
            method16(-84);
        }
        int var1 = class85.method592((byte) 76);
        if (var1 == 0) {
            class96.field1664 = (byte[][][]) null;
            class266.method1851(arg0 - 6327, 0);
        } else if (var1 == 1) {
            class232.method1606((byte) 0, false);
            class266.method1851(-7308, 512);
            class222.method1555(arg0 ^ 0xFFFFFC2F);
        } else {
            class232.method1606((byte) (class93.field1600 - 4 & 0xFF), false);
            class266.method1851(-7308, 2);
        }
        field46++;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V", line = 461)
    public static final void method19(int arg0) {
        if (class186.field2998 > 1) {
            class163.field2750 = class251.field4240;
            class186.field2998--;
        }
        if (class79.field1279 > 0) {
            class79.field1279--;
        }
        field41++;
        if (class23.field350) {
            class23.field350 = false;
            class315.method2174((byte) -68);
            return;
        }
        for (int var1 = 0; var1 < 100 && class291.method2058(false); var1++) {
        }
        if (class18.field281 != 30) {
            return;
        }
        class255.method1766(class255.field4318, (byte) -81, 9);
        Object var2 = class230.field3810.field4363;
        synchronized (class230.field3810.field4363) {
            if (!class93.field1593) {
                class230.field3810.field4377 = 0;
            } else if (class119.field1994 != 0 || class230.field3810.field4377 >= 40) {
                class143.field2383++;
                class255.field4318.method1523(22260, 119);
                class255.field4318.method463(false, 0);
                int var3 = class255.field4318.field1068;
                int var4 = 0;
                for (int var5 = 0; var5 < class230.field3810.field4377 && class255.field4318.field1068 - var3 < 240; var5++) {
                    int var6 = class230.field3810.field4374[var5];
                    var4++;
                    boolean var7 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var8 = class230.field3810.field4375[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class230.field3810.field4374[var5] == -1 && class230.field3810.field4375[var5] == -1) {
                        var8 = -1;
                        var6 = -1;
                        var7 = true;
                    }
                    if (class55.field862 != var8 || class68.field1016 != var6) {
                        int var9 = var8 - class55.field862;
                        class55.field862 = var8;
                        int var10 = var6 - class68.field1016;
                        class68.field1016 = var6;
                        if (class93.field1596 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class255.field4318.method462((class93.field1596 << 12) + (var9 << 6) + var10, (byte) -61);
                            class93.field1596 = 0;
                        } else if (class93.field1596 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class255.field4318.method463(false, class93.field1596 + 128);
                            class255.field4318.method462((var9 << 8) + var10, (byte) -61);
                            class93.field1596 = 0;
                        } else if (class93.field1596 >= 32) {
                            class255.field4318.method462(class93.field1596 + 57344, (byte) -61);
                            if (var7) {
                                class255.field4318.method436(Integer.MIN_VALUE, -18820);
                            } else {
                                class255.field4318.method436(var6 << 16 | var8, -18820);
                            }
                            class93.field1596 = 0;
                        } else {
                            class255.field4318.method463(false, class93.field1596 + 192);
                            if (var7) {
                                class255.field4318.method436(Integer.MIN_VALUE, -18820);
                            } else {
                                class255.field4318.method436(var8 | var6 << 16, -18820);
                            }
                            class93.field1596 = 0;
                        }
                    } else if (class93.field1596 < 2047) {
                        class93.field1596++;
                    }
                }
                class255.field4318.method432(-4931, class255.field4318.field1068 - var3);
                if (class230.field3810.field4377 <= var4) {
                    class230.field3810.field4377 = 0;
                } else {
                    class230.field3810.field4377 -= var4;
                    for (int var11 = 0; var11 < class230.field3810.field4377; var11++) {
                        class230.field3810.field4375[var11] = class230.field3810.field4375[var4 + var11];
                        class230.field3810.field4374[var11] = class230.field3810.field4374[var4 + var11];
                    }
                }
            }
        }
        if (class119.field1994 != 0) {
            int var13 = class184.field2973;
            class280.field4792++;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class115.field1953;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            long var15 = (class206.field3542 - class93.field1592) / 50L;
            if (var15 > 32767L) {
                var15 = 32767L;
            }
            int var17 = (int) var15;
            class93.field1592 = class206.field3542;
            byte var18 = 0;
            if (class119.field1994 == 2) {
                var18 = 1;
            }
            class255.field4318.method1523(22260, 59);
            class255.field4318.method441(var13 | var14 << 16, arg0 + 149);
            class255.field4318.method435((byte) 59, var17 | var18 << 15);
        }
        if (class128.field2114[96] || class128.field2114[97] || class128.field2114[98] || class128.field2114[99]) {
            class4.field59 = true;
        }
        if (class241.field4021 > 0) {
            class241.field4021--;
        }
        if (class4.field59 && class241.field4021 <= 0) {
            class115.field1966++;
            class4.field59 = false;
            class241.field4021 = 20;
            class255.field4318.method1523(22260, 64);
            class255.field4318.method462(class76.field1253, (byte) -61);
            class255.field4318.method435((byte) 82, class271.field4652);
        }
        if (class23.field353 && !class55.field863) {
            class100.field1692++;
            class55.field863 = true;
            class255.field4318.method1523(22260, 45);
            class255.field4318.method463(false, 1);
        }
        if (!class23.field353 && class55.field863) {
            class55.field863 = false;
            class100.field1692++;
            class255.field4318.method1523(arg0 ^ 0xFFFFA930, 45);
            class255.field4318.method463(false, 0);
        }
        if (!class43.field674) {
            class15.field226++;
            class255.field4318.method1523(22260, 200);
            class255.field4318.method436(class121.method896(true), -18820);
            class43.field674 = true;
        }
        class289.method2048((byte) -118);
        if (class18.field281 != 30) {
            return;
        }
        class155.method1142((byte) -114);
        class14.method72((byte) -98);
        class103.field1738++;
        if (class103.field1738 > 750) {
            class315.method2174((byte) -68);
            return;
        }
        class241.method1661(8094);
        class159.method1161(0);
        class131.method965((byte) 109);
        if (class285.field4900 != null) {
            class84.method586(arg0 ^ 0xFFFFFFA9);
        }
        for (int var19 = class34.method189(true, false); var19 != -1; var19 = class34.method189(false, false)) {
            class156.method1151((byte) 7, var19);
            class68.field1018[class154.method1134(class262.field4441++, 31)] = var19;
        }
        for (class53 var20 = class37.method223(0); var20 != null; var20 = class37.method223(0)) {
            int var21 = var20.method319(22870);
            int var22 = var20.method331(true);
            if (var21 == 1) {
                class305.field5209[var22] = var20.field824;
                class10.field149[class154.method1134(class127.field2101++, 31)] = var22;
            } else if (var21 == 2) {
                class14.field189[var22] = var20.field822;
                class184.field2967[class154.method1134(31, class156.field2659++)] = var22;
            } else if (var21 == 3) {
                class197 var23 = class58.method353(var22, (byte) -30);
                if (!var20.field822.method1752(true, var23.field3298)) {
                    var23.field3298 = var20.field822;
                    class108.method834((byte) 49, var23);
                }
            } else if (var21 == 4) {
                class197 var40 = class58.method353(var22, (byte) 102);
                int var41 = var20.field824;
                int var42 = var20.field819;
                if (var40.field3274 != var41 || var40.field3399 != var42) {
                    var40.field3399 = var42;
                    var40.field3274 = var41;
                    class108.method834((byte) 49, var40);
                }
            } else if (var21 == 5) {
                class197 var39 = class58.method353(var22, (byte) -120);
                if (var20.field824 != var39.field3309 || var20.field824 == -1) {
                    var39.field3309 = var20.field824;
                    var39.field3317 = 0;
                    var39.field3373 = 0;
                    class108.method834((byte) 49, var39);
                }
            } else if (var21 == 6) {
                int var24 = var20.field824;
                int var25 = var24 & 0x1F;
                int var26 = var24 >> 10 & 0x1F;
                int var27 = (var24 & 0x3FA) >> 5;
                class197 var28 = class58.method353(var22, (byte) -107);
                int var29 = (var26 << 19) + (var27 << 11) + (var25 << 3);
                if (var28.field3331 != var29) {
                    var28.field3331 = var29;
                    class108.method834((byte) 49, var28);
                }
            } else if (var21 == 7) {
                class197 var37 = class58.method353(var22, (byte) 40);
                boolean var38 = var20.field824 == 1;
                if (var37.field3250 != var38) {
                    var37.field3250 = var38;
                    class108.method834((byte) 49, var37);
                }
            } else if (var21 == 8) {
                class197 var36 = class58.method353(var22, (byte) 28);
                if (var20.field824 != var36.field3251 || var20.field819 != var36.field3350 || var20.field825 != var36.field3259) {
                    var36.field3350 = var20.field819;
                    var36.field3259 = var20.field825;
                    if (var36.field3397 != -1) {
                        if (var36.field3400 > 0) {
                            var36.field3259 = var36.field3259 * 32 / var36.field3400;
                        } else if (var36.field3343 > 0) {
                            var36.field3259 = var36.field3259 * 32 / var36.field3343;
                        }
                    }
                    var36.field3251 = var20.field824;
                    class108.method834((byte) 49, var36);
                }
            } else if (var21 == 9) {
                class197 var30 = class58.method353(var22, (byte) -2);
                if (var20.field824 != var30.field3397 || var20.field819 != var30.field3262) {
                    var30.field3397 = var20.field824;
                    var30.field3262 = var20.field819;
                    class108.method834((byte) 49, var30);
                }
            } else if (var21 == 10) {
                class197 var35 = class58.method353(var22, (byte) 99);
                if (var20.field824 != var35.field3258 || var20.field819 != var35.field3357 || var20.field825 != var35.field3340) {
                    var35.field3258 = var20.field824;
                    var35.field3340 = var20.field825;
                    var35.field3357 = var20.field819;
                    class108.method834((byte) 49, var35);
                }
            } else if (var21 == 11) {
                class197 var31 = class58.method353(var22, (byte) -28);
                var31.field3307 = 0;
                var31.field3305 = var31.field3254 = var20.field819;
                var31.field3332 = var31.field3393 = var20.field824;
                var31.field3276 = 0;
                class108.method834((byte) 49, var31);
            } else if (var21 == 12) {
                class197 var32 = class58.method353(var22, (byte) -110);
                int var33 = var20.field824;
                if (var32 != null && var32.field3281 == 0) {
                    if (var33 > var32.field3384 - var32.field3253) {
                        var33 = var32.field3384 - var32.field3253;
                    }
                    if (var33 < 0) {
                        var33 = 0;
                    }
                    if (var32.field3310 != var33) {
                        var32.field3310 = var33;
                        class108.method834((byte) 49, var32);
                    }
                }
            } else if (var21 == 13) {
                class197 var34 = class58.method353(var22, (byte) -121);
                var34.field3275 = var20.field824;
            }
        }
        if (class242.field4051 != 0) {
            class16.field237 += 20;
            if (class16.field237 >= 400) {
                class242.field4051 = 0;
            }
        }
        class122.field2036++;
        if (class268.field4584 != null) {
            class201.field3485++;
            if (class201.field3485 >= 15) {
                class108.method834((byte) 49, class268.field4584);
                class268.field4584 = null;
            }
        }
        if (class51.field767 != null) {
            class108.method834((byte) 49, class51.field767);
            if (class2.field31 > (class79.field1287 + 5) || (class79.field1287 - 5) > class2.field31 || class274.field4703 + 5 < class67.field994 || class67.field994 < class274.field4703 - 5) {
                class223.field3748 = true;
            }
            class114.field1926++;
            if (class235.field3871 == 0) {
                if (class223.field3748 && class114.field1926 >= 5) {
                    if (class51.field767 == class102.field1713 && class47.field704 != class18.field295) {
                        class197 var43 = class51.field767;
                        class252.field4247++;
                        byte var44 = 0;
                        if (class218.field3691 == 1 && var43.field3392 == 206) {
                            var44 = 1;
                        }
                        if (var43.field3352[class18.field295] <= 0) {
                            var44 = 0;
                        }
                        if (class16.method79((byte) -112, client.method1673(var43))) {
                            int var47 = class47.field704;
                            int var48 = class18.field295;
                            var43.field3352[var48] = var43.field3352[var47];
                            var43.field3360[var48] = var43.field3360[var47];
                            var43.field3352[var47] = -1;
                            var43.field3360[var47] = 0;
                        } else if (var44 == 1) {
                            int var45 = class47.field704;
                            int var46 = class18.field295;
                            while (var45 != var46) {
                                if (var45 > var46) {
                                    var43.method1419(101, var45, var45 - 1);
                                    var45--;
                                } else if (var46 > var45) {
                                    var43.method1419(120, var45, var45 + 1);
                                    var45++;
                                }
                            }
                        } else {
                            var43.method1419(95, class47.field704, class18.field295);
                        }
                        class255.field4318.method1523(arg0 + 22320, 203);
                        class255.field4318.method446(-23847, class18.field295);
                        class255.field4318.method462(class47.field704, (byte) -61);
                        class255.field4318.method436(class51.field767.field3256, -18820);
                        class255.field4318.method430((byte) 120, var44);
                    }
                } else if ((class195.field3220 == 1 || class125.method922(class136.field2272 - 1, 98)) && class136.field2272 > 2) {
                    class108.method837((byte) -111);
                } else if (class136.field2272 > 0) {
                    class38.method226(-710);
                }
                class201.field3485 = 10;
                class119.field1994 = 0;
                class51.field767 = null;
            }
        }
        class160.field2698 = false;
        class116.field1971 = null;
        class130.field2142 = false;
        class184.field2962 = 0;
        class197 var49 = class264.field4472;
        class197 var50 = class56.field874;
        class264.field4472 = null;
        class56.field874 = null;
        while (class181.method1275(20936) && class184.field2962 < 128) {
            class75.field1242[class184.field2962] = class216.field3671;
            class265.field4477[class184.field2962] = class13.field183;
            class184.field2962++;
        }
        class285.field4900 = null;
        class162.field2730 = null;
        if (class264.field4459 != -1) {
            class84.method590(class264.field4459, 0, 0, class210.field3589, false, 0, 0, class201.field3479);
        }
        class251.field4240++;
        if (class162.field2730 != null) {
            class114.method872(class237.field3946, class162.field2730, arg0 ^ 0xFFFFD0B3, class70.field1114);
            class162.field2730 = null;
        }
        while (true) {
            class26 var51;
            class197 var52;
            class197 var53;
            do {
                var51 = (class26) class56.field872.method1468(-100);
                if (var51 == null) {
                    while (true) {
                        class26 var54;
                        class197 var55;
                        class197 var56;
                        do {
                            var54 = (class26) class301.field5181.method1468(67);
                            if (var54 == null) {
                                while (true) {
                                    class26 var57;
                                    class197 var58;
                                    class197 var59;
                                    do {
                                        var57 = (class26) class151.field2562.method1468(73);
                                        if (var57 == null) {
                                            if (class246.field4126 && class285.field4900 == null) {
                                                class246.field4126 = false;
                                            }
                                            if (class300.field5110 != null) {
                                                class55.method345(-89);
                                            }
                                            if (class201.field3483 > 0 && class128.field2114[82] && class128.field2114[81] && class19.field320 != 0) {
                                                int var60 = client.field4039 - class19.field320;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class68.method412(class276.field4742.field5154[0] + class268.field4615, var60, class197.field3355 + class276.field4742.field5125[0], 906);
                                            }
                                            if (class247.field4140 != -1) {
                                                int var61 = class247.field4140;
                                                int var62 = class82.field1338;
                                                if (class201.field3483 > 0 && class128.field2114[82] && class128.field2114[81]) {
                                                    class68.method412(class268.field4615 + var62, client.field4039, class197.field3355 + var61, 906);
                                                } else if (class236.field3940) {
                                                    class209.field3577++;
                                                    class255.field4318.method1523(22260, 244);
                                                    class255.field4318.method438(class46.field694, arg0 ^ 0xFFFFFF3B);
                                                    class255.field4318.method462(class197.field3355 + var61, (byte) -61);
                                                    class255.field4318.method446(-23847, class268.field4615 + var62);
                                                    class255.field4318.method437(class168.field2823, -1639306584);
                                                    class144.field2408 = class115.field1953;
                                                    class113.field1916 = class184.field2973;
                                                    class242.field4051 = 1;
                                                    class16.field237 = 0;
                                                } else {
                                                    boolean var63 = class115.method876(var62, 0, 0, 0, 0, 0, class276.field4742.field5154[0], true, 0, (byte) -30, var61, class276.field4742.field5125[0]);
                                                    if (var63) {
                                                        class242.field4051 = 1;
                                                        class16.field237 = 0;
                                                        class113.field1916 = class184.field2973;
                                                        class144.field2408 = class115.field1953;
                                                    }
                                                }
                                                class236.field3940 = false;
                                                class247.field4140 = -1;
                                            }
                                            class115.method878(20425);
                                            if (class56.field874 != var50) {
                                                if (var50 != null) {
                                                    class108.method834((byte) 49, var50);
                                                }
                                                if (class56.field874 != null) {
                                                    class108.method834((byte) 49, class56.field874);
                                                }
                                            }
                                            if (class264.field4472 != var49 && class80.field1296 == class256.field4362) {
                                                if (var49 != null) {
                                                    class108.method834((byte) 49, var49);
                                                }
                                                if (class264.field4472 != null) {
                                                    class108.method834((byte) 49, class264.field4472);
                                                }
                                            }
                                            if (class264.field4472 == null) {
                                                if (class256.field4362 > 0) {
                                                    class256.field4362--;
                                                }
                                            } else if (class256.field4362 < class80.field1296) {
                                                class256.field4362++;
                                                if (class80.field1296 == class256.field4362) {
                                                    class108.method834((byte) 49, class264.field4472);
                                                }
                                            }
                                            if (field50 == 1) {
                                                class53.method329(arg0 + 76);
                                            } else if (field50 == 2) {
                                                class25.method138(-123);
                                            } else {
                                                class282.method1992((byte) -58);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class112.field1889[var64]++;
                                            }
                                            int var65 = class79.method548(false);
                                            int var66 = class5.method29((byte) -107);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class131.field2162++;
                                                class79.field1279 = 250;
                                                class136.method1020(arg0 + 165, 4000);
                                                class255.field4318.method1523(22260, 216);
                                            }
                                            if (class235.field3867 != null && class235.field3867.field2833 == 1) {
                                                if (class235.field3867.field2832 != null) {
                                                    class130.method958(class81.field1317, (byte) 27, class147.field2494);
                                                }
                                                class147.field2494 = null;
                                                class81.field1317 = false;
                                                class235.field3867 = null;
                                            }
                                            class91.field1555++;
                                            class16.field235++;
                                            class11.field157++;
                                            if (class91.field1555 > 500) {
                                                class91.field1555 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x4) == 4) {
                                                    class58.field885 += class211.field3600;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class250.field4218 += class244.field4112;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class23.field354 += class131.field2169;
                                                }
                                            }
                                            if (class11.field157 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class304.field5198 += class92.field1586;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class206.field3541 += class136.field2263;
                                                }
                                                class11.field157 = 0;
                                            }
                                            if (class23.field354 < -50) {
                                                class131.field2169 = 2;
                                            }
                                            if (class250.field4218 < -55) {
                                                class244.field4112 = 2;
                                            }
                                            if (class304.field5198 < -20) {
                                                class92.field1586 = 1;
                                            }
                                            if (class58.field885 < -40) {
                                                class211.field3600 = 1;
                                            }
                                            if (class250.field4218 > 55) {
                                                class244.field4112 = -2;
                                            }
                                            if (class23.field354 > 50) {
                                                class131.field2169 = -2;
                                            }
                                            if (class304.field5198 > 10) {
                                                class92.field1586 = -1;
                                            }
                                            if (class58.field885 > 40) {
                                                class211.field3600 = -1;
                                            }
                                            if (class206.field3541 < arg0) {
                                                class136.field2263 = 2;
                                            }
                                            if (class206.field3541 > 60) {
                                                class136.field2263 = -2;
                                            }
                                            if (class16.field235 > 50) {
                                                class291.field5006++;
                                                class255.field4318.method1523(22260, 130);
                                            }
                                            if (class314.field5320) {
                                                class145.method1083(true);
                                                class314.field5320 = false;
                                            }
                                            try {
                                                if (client.field4041 != null && class255.field4318.field1068 > 0) {
                                                    client.field4041.method1653(0, class255.field4318.field1066, (byte) 86, class255.field4318.field1068);
                                                    class16.field235 = 0;
                                                    class255.field4318.field1068 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class315.method2174((byte) -68);
                                            }
                                            return;
                                        }
                                        var58 = var57.field424;
                                        if (var58.field3273 < 0) {
                                            break;
                                        }
                                        var59 = class58.method353(var58.field3353, (byte) 110);
                                    } while (var59 == null || var59.field3359 == null || var58.field3273 >= var59.field3359.length || var59.field3359[var58.field3273] != var58);
                                    class114.method873(arg0 ^ 0xFFFFFFBF, var57);
                                }
                            }
                            var55 = var54.field424;
                            if (var55.field3273 < 0) {
                                break;
                            }
                            var56 = class58.method353(var55.field3353, (byte) 80);
                        } while (var56 == null || var56.field3359 == null || var56.field3359.length <= var55.field3273 || var56.field3359[var55.field3273] != var55);
                        class114.method873(arg0 ^ 0xFFFFFFB5, var54);
                    }
                }
                var52 = var51.field424;
                if (var52.field3273 < 0) {
                    break;
                }
                var53 = class58.method353(var52.field3353, (byte) -104);
            } while (var53 == null || var53.field3359 == null || var52.field3273 >= var53.field3359.length || var53.field3359[var52.field3273] != var52);
            class114.method873(-60, var51);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lpb;BI)V", line = 1447)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            return;
        }
        field47++;
        if (arg2 == 0) {
            this.field55 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field4434 = arg0.method481(0) == 1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I", line = 1486)
    public final int[] method21(byte arg0, int arg1) {
        int[] var3 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var4 = this.method1822(0, 125, arg1);
            int[] var5 = this.method1822(1, 22, arg1);
            int var6 = this.field55;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class92.field1576; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class92.field1576; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class92.field1576; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class92.field1576; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class92.field1576; var26++) {
                    var3[var26] = 4096 - ((4096 - var4[var26]) * (4096 - var5[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class92.field1576; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 >= 2048 ? 4096 - ((4096 - var4[var8]) * (4096 - var9) >> 11) : var4[var8] * var9 >> 11;
                }
            } else if (var6 == 7) {
                for (int var24 = 0; var24 < class92.field1576; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 4096 ? 4096 : (var5[var24] << 12) / (4096 - var25);
                }
            } else if (var6 == 8) {
                for (int var22 = 0; var22 < class92.field1576; var22++) {
                    int var23 = var4[var22];
                    var3[var22] = var23 == 0 ? 0 : 4096 - ((4096 - var5[var22] << 12) / var23);
                }
            } else if (var6 == 9) {
                for (int var19 = 0; var19 < class92.field1576; var19++) {
                    int var20 = var5[var19];
                    int var21 = var4[var19];
                    var3[var19] = var20 > var21 ? var21 : var20;
                }
            } else if (var6 == 10) {
                for (int var16 = 0; var16 < class92.field1576; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var18 >= var17 ? var18 : var17;
                }
            } else if (var6 == 11) {
                for (int var13 = 0; var13 < class92.field1576; var13++) {
                    int var14 = var5[var13];
                    int var15 = var4[var13];
                    var3[var13] = var14 < var15 ? var15 - var14 : -var15 + var14;
                }
            } else if (var6 == 12) {
                for (int var10 = 0; var10 < class92.field1576; var10++) {
                    int var11 = var5[var10];
                    int var12 = var4[var10];
                    var3[var10] = var11 + var12 - (var11 * var12 >> 11);
                }
            }
        }
        int var31 = -23 % ((arg0 + 49) / 33);
        field51++;
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lfk;Ljava/awt/Frame;I)V", line = 1748)
    public static final void method22(class40 arg0, Frame arg1, int arg2) {
        field53++;
        while (true) {
            class169 var3 = arg0.method243(arg1, 1);
            while (var3.field2833 == 0) {
                class137.method1027(10L, 0);
            }
            if (var3.field2833 == 1) {
                if (arg2 > -3) {
                    field39 = true;
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class137.method1027(100L, 0);
        }
    }
}
