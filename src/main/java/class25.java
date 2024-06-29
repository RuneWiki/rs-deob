import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 extends class3 {

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    private int field368 = 6;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lmi;")
    public static class227 field374 = new class227(64);

    @OriginalMember(owner = "client!na", name = "T", descriptor = "Z")
    public static boolean field379 = false;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "[I")
    public static int[] field382 = new int[32];

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field383 = -1;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Z")
    public static boolean field367;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V", line = 9)
    public static final void method213(byte arg0) {
        field377++;
        class148.field2390.method651(0);
        class182.field2831.method651(0);
        class29.field437.method651(0);
        int var1 = 29 % ((-arg0 - 52) / 43);
        class172.field2680.method651(0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljo;III)V", line = 24)
    public static final void method214(class150 arg0, int arg1, int arg2, int arg3) {
        field378++;
        class65.field957.method1082(64);
        if (class132.field2030 || arg3 != -13) {
            return;
        }
        for (class148 var4 = (class148) arg0.method1081(arg3 - 26); var4 != null; var4 = (class148) arg0.method1083((byte) 113)) {
            class312 var5 = class165.method1150(var4.field2378, (byte) -69);
            if (class227.method1545(var5, arg3 + 130)) {
                class305.method2138(var4, arg1, var5, (byte) 91, arg2);
                if (var4.field2380) {
                    class124.method800(-70, var4, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[[I", line = 61)
    public final int[][] method22(int arg0, int arg1) {
        int[][] var3 = this.field20.method2435(arg1, false);
        field369++;
        if (arg0 != -21194) {
            method219(94, -3, 49, 17, 94, -75, -92);
        }
        if (this.field20.field5556) {
            int[][] var4 = this.method16(arg1, 0, (byte) 98);
            int[][] var5 = this.method16(arg1, 1, (byte) -33);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field368;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class326.field5342; var63++) {
                    var6[var63] = var9[var63] + var12[var63];
                    var8[var63] = var10[var63] + var14[var63];
                    var7[var63] = var11[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class326.field5342; var62++) {
                    var6[var62] = var9[var62] - var12[var62];
                    var8[var62] = var10[var62] - var14[var62];
                    var7[var62] = var11[var62] - var13[var62];
                }
            } else if (var15 == 3) {
                for (int var16 = 0; var16 < class326.field5342; var16++) {
                    var6[var16] = var9[var16] * var12[var16] >> 12;
                    var8[var16] = var10[var16] * var14[var16] >> 12;
                    var7[var16] = var11[var16] * var13[var16] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class326.field5342; var17++) {
                    int var18 = var12[var17];
                    int var19 = var13[var17];
                    int var20 = var14[var17];
                    var6[var17] = var18 == 0 ? 4096 : (var9[var17] << 12) / var18;
                    var8[var17] = var20 == 0 ? 4096 : (var10[var17] << 12) / var20;
                    var7[var17] = var19 == 0 ? 4096 : (var11[var17] << 12) / var19;
                }
            } else if (var15 == 5) {
                for (int var21 = 0; var21 < class326.field5342; var21++) {
                    var6[var21] = 4096 - ((4096 - var9[var21]) * (4096 - var12[var21]) >> 12);
                    var8[var21] = 4096 - ((4096 - var10[var21]) * (4096 - var14[var21]) >> 12);
                    var7[var21] = 4096 - ((4096 - var11[var21]) * (4096 - var13[var21]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var58 = 0; var58 < class326.field5342; var58++) {
                    int var59 = var14[var58];
                    int var60 = var13[var58];
                    int var61 = var12[var58];
                    var6[var58] = var61 >= 2048 ? 4096 - ((4096 - var9[var58]) * (4096 - var61) >> 11) : var9[var58] * var61 >> 11;
                    var8[var58] = var59 < 2048 ? var10[var58] * var59 >> 11 : 4096 - ((4096 - var10[var58]) * (4096 - var59) >> 11);
                    var7[var58] = var60 >= 2048 ? 4096 - ((4096 - var11[var58]) * (4096 - var60) >> 11) : var11[var58] * var60 >> 11;
                }
            } else if (var15 == 7) {
                for (int var22 = 0; var22 < class326.field5342; var22++) {
                    int var23 = var11[var22];
                    int var24 = var9[var22];
                    int var25 = var10[var22];
                    var6[var22] = var24 == 4096 ? 4096 : (var12[var22] << 12) / (4096 - var24);
                    var8[var22] = var25 == 4096 ? 4096 : (var14[var22] << 12) / (4096 - var25);
                    var7[var22] = var23 == 4096 ? 4096 : (var13[var22] << 12) / (4096 - var23);
                }
            } else if (var15 == 8) {
                for (int var26 = 0; var26 < class326.field5342; var26++) {
                    int var27 = var9[var26];
                    int var28 = var11[var26];
                    int var29 = var10[var26];
                    var6[var26] = var27 == 0 ? 0 : 4096 - ((4096 - var12[var26] << 12) / var27);
                    var8[var26] = var29 == 0 ? 0 : 4096 - (4096 - var14[var26] << 12) / var29;
                    var7[var26] = var28 == 0 ? 0 : 4096 - (4096 - var13[var26] << 12) / var28;
                }
            } else if (var15 == 9) {
                for (int var51 = 0; var51 < class326.field5342; var51++) {
                    int var52 = var13[var51];
                    int var53 = var9[var51];
                    int var54 = var10[var51];
                    int var55 = var12[var51];
                    int var56 = var14[var51];
                    int var57 = var11[var51];
                    var6[var51] = var53 >= var55 ? var55 : var53;
                    var8[var51] = var56 <= var54 ? var56 : var54;
                    var7[var51] = var57 >= var52 ? var52 : var57;
                }
            } else if (var15 == 10) {
                for (int var44 = 0; var44 < class326.field5342; var44++) {
                    int var45 = var11[var44];
                    int var46 = var13[var44];
                    int var47 = var10[var44];
                    int var48 = var14[var44];
                    int var49 = var12[var44];
                    int var50 = var9[var44];
                    var6[var44] = var49 < var50 ? var50 : var49;
                    var8[var44] = var48 < var47 ? var47 : var48;
                    var7[var44] = var45 <= var46 ? var46 : var45;
                }
            } else if (var15 == 11) {
                for (int var37 = 0; var37 < class326.field5342; var37++) {
                    int var38 = var14[var37];
                    int var39 = var11[var37];
                    int var40 = var12[var37];
                    int var41 = var13[var37];
                    int var42 = var10[var37];
                    int var43 = var9[var37];
                    var6[var37] = var43 <= var40 ? var40 - var43 : -var40 + var43;
                    var8[var37] = var42 <= var38 ? var38 - var42 : -var38 + var42;
                    var7[var37] = var39 <= var41 ? var41 - var39 : var39 - var41;
                }
            } else if (var15 == 12) {
                for (int var30 = 0; var30 < class326.field5342; var30++) {
                    int var31 = var10[var30];
                    int var32 = var13[var30];
                    int var33 = var9[var30];
                    int var34 = var11[var30];
                    int var35 = var12[var30];
                    int var36 = var14[var30];
                    var6[var30] = var33 + var35 - (var33 * var35 >> 11);
                    var8[var30] = var31 + var36 - (var31 * var36 >> 11);
                    var7[var30] = var32 + var34 - (var32 * var34 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 374)
    public static final void method215(boolean arg0) {
        field371++;
        class228.field3583.method1579(2);
        class58.field885 = null;
        class77.field1147 = 1;
        if (arg0) {
            field382 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lvl;", line = 389)
    public static final class8 method216(int arg0, int arg1) {
        if (arg0 != -17626) {
            method221((byte) 114);
        }
        class8 var2 = (class8) class258.field4092.method1539(-83, (long) arg1);
        field380++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class276.field4548.method1504(arg1, true, 5);
        class8 var4 = new class8();
        if (var3 != null) {
            var4.method59((byte) 126, new class313(var3));
        }
        class258.field4092.method1538(54, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V", line = 416)
    public static final void method217(int arg0) {
        class37.field557.method644((byte) -47);
        field373++;
        class216.field3325.method644((byte) -53);
        if (arg0 != 2048) {
            field382 = (int[]) null;
        }
        class16.field206.method644((byte) -107);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V", line = 436)
    public static final void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field375++;
        int var9 = arg5 + 1;
        class270.method1906(arg1, arg4, arg0, class306.field4998[arg5], 121);
        int var8 = arg3 - 1;
        class270.method1906(arg1, arg4, arg0, class306.field4998[arg3], arg2 - 3977);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class306.field4998[var6];
            var7[arg0] = var7[arg4] = arg1;
        }
        if (arg2 != 4096) {
            method215(false);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V", line = 460)
    public static final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field370++;
        if (arg1 <= 99) {
            field367 = false;
        }
        if (class341.field5494 <= (arg4 - arg0) && class196.field3001 >= (arg0 + arg4) && arg6 - arg0 >= class33.field505 && class278.field4586 >= arg0 + arg6) {
            class343.method2421(arg3, arg4, arg5, (byte) 127, arg6, arg2, arg0);
        } else {
            class86.method565(arg6, arg0, arg5, arg2, arg3, arg4, -1);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(II)Lqi;", line = 479)
    public static final class269 method220(int arg0, int arg1) {
        if (arg0 != 27209) {
            return (class269) null;
        }
        field381++;
        class269 var2 = (class269) class8.field104.method652((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class228.field3579.method1504(arg1, true, 1);
        class269 var4 = new class269();
        var4.field4436 = arg1;
        if (var3 != null) {
            var4.method1896(new class313(var3), -78);
        }
        var4.method1903((byte) 8);
        if (var4.field4439 == 2 && class105.field1517.method29((long) arg1, 103) == null) {
            class105.field1517.method37(false, new class94(class259.field4102), (long) arg1);
            class143.field2298[class259.field4102++] = var4;
        }
        class8.field104.method642(var4, (long) arg1, -79);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[I", line = 518)
    public final int[] method25(byte arg0, int arg1) {
        field366++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 0);
            int[] var5 = this.method24(arg1, 1, 1);
            int var6 = this.field368;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class326.field5342; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class326.field5342; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var8 = 0; var8 < class326.field5342; var8++) {
                    var3[var8] = var4[var8] * var5[var8] >> 12;
                }
            } else if (var6 == 4) {
                for (int var9 = 0; var9 < class326.field5342; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 == 0 ? 4096 : (var4[var9] << 12) / var10;
                }
            } else if (var6 == 5) {
                for (int var29 = 0; var29 < class326.field5342; var29++) {
                    var3[var29] = 4096 - ((4096 - var4[var29]) * (4096 - var5[var29]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var27 = 0; var27 < class326.field5342; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 < 2048 ? var4[var27] * var28 >> 11 : 4096 - ((4096 - var4[var27]) * (4096 - var28) >> 11);
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class326.field5342; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var13 = 0; var13 < class326.field5342; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - ((4096 - var5[var13] << 12) / var14);
                }
            } else if (var6 == 9) {
                for (int var24 = 0; var24 < class326.field5342; var24++) {
                    int var25 = var4[var24];
                    int var26 = var5[var24];
                    var3[var24] = var26 <= var25 ? var26 : var25;
                }
            } else if (var6 == 10) {
                for (int var15 = 0; var15 < class326.field5342; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var17 <= var16 ? var16 : var17;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class326.field5342; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var19 > var20 ? var19 - var20 : -var19 + var20;
                }
            } else if (var6 == 12) {
                for (int var21 = 0; var21 < class326.field5342; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var22 + var23 - (var22 * var23 >> 11);
                }
            }
        }
        if (arg0 < 57) {
            method218(-97, -32, 1, -127, 10, 71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(B)V", line = 758)
    public static void method221(byte arg0) {
        field382 = null;
        if (arg0 > -71) {
            method214((class150) null, 115, 29, 36);
        }
        field374 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 768)
    public class25() {
        super(2, false);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lfh;IZ)V", line = 790)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field372++;
        if (arg1 == 0) {
            this.field368 = arg0.method2224(-124);
        } else if (arg1 == 1) {
            this.field34 = arg0.method2224(-119) == 1;
        }
        if (arg2) {
            this.method25((byte) -1, -90);
        }
    }
}
