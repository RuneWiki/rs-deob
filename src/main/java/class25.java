import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class25 extends class81 {

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "Z")
    public boolean field474 = false;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "Lej;")
    private class129 field468;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "Z")
    private boolean field491;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Z")
    private boolean field478;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "Lsg;")
    private static class30 field482 = class167.method1221((byte) 33, "Continue");

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "[I")
    public static int[] field483 = new int[50];

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "Lsg;")
    public static class30 field487 = class167.method1221((byte) 33, "welle2:");

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "Lsg;")
    public static class30 field473 = field482;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "F")
    private float field475;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Lka;")
    public static class157 field477;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILni;IJ)Z")
    public static final boolean method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class20 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class203.method1434(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lbk;FZBLmc;)[I")
    public final int[] method220(class51 arg0, float arg1, boolean arg2, byte arg3, class151 arg4) {
        field484++;
        if (arg3 > -13) {
            return null;
        }
        if (this.field469 == null || this.field475 != arg1) {
            if (!this.field468.method982(arg4, true, arg0)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field469 = this.field468.method984(arg0, var6, this.field478, (double) arg1, var6, (byte) 119, true, arg4);
            this.field475 = arg1;
            if (this.field491) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field469[var12];
                        var7[var34] += class68.method612(16732835, var35) >> 16;
                        var8[var34] += class68.method612(65311, var35) >> 8;
                        var9[var34] += class68.method612(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var23 += var9[var25];
                        var24 += var7[var25];
                        var22 += var8[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var24 / 9;
                        var25--;
                        int var32 = var22 / 9;
                        int var33 = var23 / 9;
                        var21--;
                        var19--;
                        var10[var19] = class182.method1314(var33, class182.method1314(var31 << 16, var32 << 8));
                        var23 += var9[var25] - var9[var21];
                        var24 += var7[var25] - var7[var21];
                        var22 += var8[var25] - var8[var21];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field469[var13];
                        var12--;
                        int var30 = this.field469[var12];
                        var7[var28] += -class68.method612(var29 >> 16, 255) + class68.method612(var30 >> 16, 255);
                        var8[var28] += -(class68.method612(65323, var29) >> 8) + class68.method612(255, var30 >> 8);
                        var9[var28] += class68.method612(255, var30) - class68.method612(var29, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field469 = var10;
            }
        }
        return this.field469;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public static void method221(int arg0) {
        field473 = null;
        field483 = null;
        field487 = null;
        field477 = null;
        field482 = null;
        if (arg0 > -115) {
            method224((byte) 46);
        }
    }

    @OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field472++;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)V")
    public final void method222(int arg0, int arg1) {
        field480++;
        if (this.field469 == null) {
            return;
        }
        if (this.field488 != 0 || this.field489 != 0) {
            if (class250.field4416 == null || this.field469.length > class250.field4416.length) {
                class250.field4416 = new int[this.field469.length];
            }
            int var3 = this.field469.length == 4096 ? 64 : 128;
            int var4 = this.field469.length;
            int var5 = this.field489 * arg1;
            int var6 = var3 - 1;
            int var7 = arg1 * var3 * this.field488;
            int var8 = var4 - 1;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var11 = var8 & var7 + var9;
                for (int var12 = 0; var12 < var3; var12++) {
                    int var13 = var9 + var12;
                    int var14 = (var12 + var5 & var6) + var11;
                    class250.field4416[var13] = this.field469[var14];
                }
            }
            int[] var10 = this.field469;
            this.field469 = class250.field4416;
            class250.field4416 = var10;
        }
        if (arg0 != 1) {
            this.field488 = 94;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static final void method223(byte arg0) {
        if (arg0 != -12) {
            method224((byte) 84);
        }
        field479++;
        try {
            if (class269.field4739 == 1) {
                int var1 = class168.field3108.method635((byte) -65);
                if (var1 > 0 && class168.field3108.method640((byte) 120)) {
                    int var2 = var1 - class149.field2845;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class168.field3108.method650(var2, false);
                } else {
                    class168.field3108.method632((byte) -122);
                    class168.field3108.method642(false);
                    class112.field2223 = null;
                    class146.field2805 = null;
                    if (class215.field3939 == null) {
                        class269.field4739 = 0;
                    } else {
                        class269.field4739 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class168.field3108.method632((byte) -107);
            class112.field2223 = null;
            class215.field3939 = null;
            class146.field2805 = null;
            class269.field4739 = 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
    public static final void method224(byte arg0) {
        if (class91.field1851 < 128) {
            class91.field1851 = 128;
        }
        class110.field2202 &= 0x7FF;
        if (class91.field1851 > 383) {
            class91.field1851 = 383;
        }
        field471++;
        int var1 = class277.field4839 >> 7;
        if (arg0 > -1) {
            return;
        }
        int var2 = class98.field1984 >> 7;
        int var3 = class31.method303(class277.field4839, class98.field1984, class159.field2998, -4);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class159.field2998;
                    if (var7 < 3 && (class272.field4771[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class242.field4333[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class228.field4069 < var9) {
            class228.field4069 += (var9 - class228.field4069) / 24;
        } else if (class228.field4069 > var9) {
            class228.field4069 += (var9 - class228.field4069) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lbk;Lmc;ZI)[I")
    public final int[] method225(class51 arg0, class151 arg1, boolean arg2, int arg3) {
        field481++;
        if (this.field468.method982(arg1, true, arg0)) {
            int var5 = arg2 ? 64 : 128;
            return arg3 == 128 ? this.field468.method984(arg0, var5, this.field478, 1.0D, var5, (byte) -110, false, arg1) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLmc;Lbk;)Z")
    public final boolean method226(boolean arg0, class151 arg1, class51 arg2) {
        if (arg0) {
            field470++;
            return this.field468.method982(arg1, arg0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lmc;Lmc;I)V")
    public static final void method227(class151 arg0, class151 arg1, int arg2) {
        field467++;
        class3.field54 = arg1;
        if (arg2 != -22194) {
            method223((byte) -123);
        }
        class222.field3990 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method228(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field485++;
        int var8 = arg3;
        int var9 = 0;
        int var10 = arg0 - arg7;
        int var11 = 0;
        int var12 = arg3 - arg7;
        int var13 = arg3 * arg3;
        int var14 = var10 * var10;
        int var15 = arg0 * arg0;
        int var16 = var13 << 1;
        int var17 = var12 * var12;
        int var18 = var15 << 1;
        int var19 = var17 << 1;
        int var20 = var14 << 1;
        int var21 = arg3 << 1;
        int var22 = (1 - var21) * var15 + var16;
        int var23 = var12 << 1;
        int var24 = var17 - (var23 - 1) * var20;
        int var25 = var13 - ((var21 - 1) * var18);
        int var26 = (1 - var23) * var14 + var19;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 * 3;
        if (arg1 != 88) {
            method224((byte) 60);
        }
        int var31 = var17 << 2;
        int var32 = (var21 - 3) * var18;
        int var33 = (var23 - 3) * var20;
        int var34 = var27;
        int var35 = var19 * 3;
        int var36 = (arg3 - 1) * var28;
        int var37 = var31;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class121.field2390[arg5];
        class194.method1405(true, var39, arg2 - var10, -arg0 + arg2, arg6);
        class194.method1405(true, var39, arg2 + var10, -var10 + arg2, arg4);
        class194.method1405(true, var39, arg0 + arg2, arg2 + var10, arg6);
        while (var8 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var30;
                    var30 += var27;
                    var9++;
                    var25 += var34;
                    var34 += var27;
                }
            }
            if (var25 < 0) {
                var9++;
                var25 += var34;
                var22 += var30;
                var34 += var27;
                var30 += var27;
            }
            var22 += -var36;
            boolean var40 = var8 <= var12;
            var8--;
            int var41 = arg5 - var8;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var26 += var35;
                        var35 += var31;
                        var11++;
                        var24 += var37;
                        var37 += var31;
                    }
                }
                if (var24 < 0) {
                    var11++;
                    var26 += var35;
                    var24 += var37;
                    var35 += var31;
                    var37 += var31;
                }
                var26 += -var38;
                var24 += -var33;
                var33 -= var29;
                var38 -= var29;
            }
            var25 += -var32;
            int var42 = arg2 + var9;
            int var43 = arg5 + var8;
            var32 -= var28;
            int var44 = arg2 - var9;
            var36 -= var28;
            if (var40) {
                int var45 = arg2 - var11;
                class194.method1405(true, class121.field2390[var41], var45, var44, arg6);
                int var46 = arg2 + var11;
                class194.method1405(true, class121.field2390[var41], var46, var45, arg4);
                class194.method1405(true, class121.field2390[var41], var42, var46, arg6);
                class194.method1405(true, class121.field2390[var43], var45, var44, arg6);
                class194.method1405(true, class121.field2390[var43], var46, var45, arg4);
                class194.method1405(true, class121.field2390[var43], var42, var46, arg6);
            } else {
                class194.method1405(true, class121.field2390[var41], var42, var44, arg6);
                class194.method1405(true, class121.field2390[var43], var42, var44, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Laa;)V")
    public class25(class8 arg0) {
        this.field468 = new class129(arg0);
        this.field491 = arg0.method63((byte) 72) == 1;
        this.field478 = arg0.method63((byte) 96) == 1;
        arg0.method63((byte) 56);
        arg0.method63((byte) 51);
        int var2 = arg0.method63((byte) 53) & 0x3;
        this.field489 = arg0.method98(1);
        this.field488 = arg0.method98(1);
        arg0.method63((byte) 67);
        arg0.method63((byte) 116);
    }
}
