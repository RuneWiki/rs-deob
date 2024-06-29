import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class78 extends class23 {

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    private int field1375 = 1638;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "[B")
    private byte[] field1364 = new byte[512];

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "Z")
    private boolean field1382 = true;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    private int field1371 = 4;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    private int field1369 = 4;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
    private int field1384 = 4;

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "I")
    private int field1383 = 0;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field1379 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "[S")
    private short[] field1373;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "[S")
    private short[] field1381;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "[[[I")
    public static int[][][] field1370;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        int[] var3 = super.field405.method1461(arg1, (byte) -111);
        if (arg0 != 0) {
            this.field1383 = 29;
        }
        ++field1376;
        if (super.field405.field4114) {
            this.method535(arg1, var3, 2000000);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[II)V")
    private final void method535(int arg0, int[] arg1, int arg2) {
        ++field1366;
        int var4 = class167.field3196[arg0] * this.field1371;
        if (arg2 != 2000000) {
            field1379 = 23;
        }
        if (this.field1369 != 1) {
            short var5 = this.field1381[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field1373[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field1371 * var6 >> 12;
                int var9 = var7 >> 12;
                int var10 = var9 + 1;
                if (var8 <= var10) {
                    var10 = 0;
                }
                int var11 = this.field1384 * var6 >> 12;
                int var12 = this.field1364[255 & var9] & 255;
                int var13 = this.field1364[255 & var10] & 255;
                int var14 = var7 & 4095;
                int var15 = class31.field617[var14];
                for (int var16 = 0; ~var16 > ~class199.field3705; ++var16) {
                    int var36 = class133.field2477[var16] * this.field1384;
                    int var37 = this.method536(arg2 ^ 2025650, var6 * var36 >> 12, var11, var13, var14, var15, var12);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field1369 < ~var17; ++var17) {
                short var18 = this.field1381[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field1373[var17] << 12;
                    int var20 = this.field1384 * var19 >> 12;
                    int var21 = this.field1371 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = this.field1364[255 & var23] & 255;
                    int var25 = var22 & 4095;
                    int var26 = class31.field617[var25];
                    int var27 = var23 + 1;
                    if (var27 >= var21) {
                        var27 = 0;
                    }
                    int var28 = this.field1364[var27 & 255] & 255;
                    if (this.field1382 && ~(this.field1369 + -1) == ~var17) {
                        for (int var29 = 0; ~class199.field3705 < ~var29; ++var29) {
                            int var30 = class133.field2477[var29] * this.field1384;
                            int var31 = this.method536(27698, var19 * var30 >> 12, var20, var28, var25, var26, var24);
                            int var32 = arg1[var29] - -(var18 * var31 >> 12);
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class199.field3705 > var33; ++var33) {
                            int var34 = class133.field2477[var33] * this.field1384;
                            int var35 = this.method536(27698, var19 * var34 >> 12, var20, var28, var25, var26, var24);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field1373[0] << 12;
            int var39 = this.field1371 * var38 >> 12;
            int var40 = this.field1384 * var38 >> 12;
            int var41 = var4 * var38 >> 12;
            short var42 = this.field1381[0];
            int var43 = var41 >> 12;
            int var44 = var41 & 4095;
            int var45 = var43 + 1;
            int var46 = class31.field617[var44];
            if (~var45 <= ~var39) {
                var45 = 0;
            }
            int var47 = 255 & this.field1364[255 & var43];
            int var48 = this.field1364[255 & var45] & 255;
            if (!this.field1382) {
                for (int var49 = 0; class199.field3705 > var49; ++var49) {
                    int var50 = class133.field2477[var49] * this.field1384;
                    int var51 = this.method536(27698, var38 * var50 >> 12, var40, var48, var44, var46, var47);
                    arg1[var49] = var42 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class199.field3705; ++var52) {
                    int var53 = class133.field2477[var52] * this.field1384;
                    int var54 = this.method536(arg2 ^ 2025650, var38 * var53 >> 12, var40, var48, var44, var46, var47);
                    int var55 = var42 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)I")
    private final int method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1367;
        if (arg0 != 27698) {
            return 127;
        } else {
            int var8 = arg4 + -4096;
            int var9 = arg1 >> 12;
            int var10 = var9 + 1;
            if (arg2 <= var10) {
                var10 = 0;
            }
            int var11 = arg1 & 4095;
            int var12 = var10 & 255;
            int var13 = var9 & 255;
            int var14 = var11 + -4096;
            int var15 = this.field1364[arg6 + var13] & 3;
            int var16 = class31.field617[var11];
            int var17;
            if (~var15 >= -2) {
                var17 = ~var15 != -1 ? -var11 + arg4 : arg4 + var11;
            } else {
                var17 = var15 != 2 ? -var11 - arg4 : -arg4 + var11;
            }
            int var18 = this.field1364[arg6 + var12] & 3;
            int var19;
            if (var18 > 1) {
                var19 = ~var18 == -3 ? -arg4 + var14 : -arg4 + -var14;
            } else {
                var19 = var18 == 0 ? arg4 + var14 : -var14 + arg4;
            }
            int var20 = this.field1364[arg3 + var13] & 3;
            int var21 = ((var19 - var17) * var16 >> 12) + var17;
            int var22;
            if (~var20 < -2) {
                var22 = ~var20 != -3 ? -var8 + -var11 : -var8 + var11;
            } else {
                var22 = ~var20 != -1 ? -var11 + var8 : var8 + var11;
            }
            int var23 = this.field1364[var12 - -arg3] & 3;
            int var24;
            if (var23 <= 1) {
                var24 = ~var23 == -1 ? var14 - -var8 : -var14 + var8;
            } else {
                var24 = ~var23 == -3 ? -var8 + var14 : -var8 + -var14;
            }
            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return ((-var21 + var25) * arg5 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
    public static final void method537(boolean arg0) {
        if (!class229.field4204[96]) {
            if (!class229.field4204[97]) {
                class162.field3071 /= 2;
            } else {
                class162.field3071 += (24 - class162.field3071) / 2;
            }
        } else {
            class162.field3071 += (-class162.field3071 + -24) / 2;
        }
        ++field1378;
        class82.field1454 += class162.field3071 / 2;
        if (!class229.field4204[98]) {
            if (class229.field4204[99]) {
                class50.field1019 += (-class50.field1019 + -12) / 2;
            } else {
                class50.field1019 /= 2;
            }
        } else {
            class50.field1019 += (-class50.field1019 + 12) / 2;
        }
        class242.field4445 += class50.field1019 / 2;
        int var1 = class209.field3923 + class238.field4382.field3505;
        int var2 = class239.field4385 + class238.field4382.field3490;
        if (-var1 + class159.field3006 < -500 || -var1 + class159.field3006 > 500 || ~(-var2 + class3.field28) > 499 || -var2 + class3.field28 > 500) {
            class3.field28 = var2;
            class159.field3006 = var1;
        }
        if (class159.field3006 != var1) {
            class159.field3006 += (-class159.field3006 + var1) / 16;
        }
        if (class3.field28 != var2) {
            class3.field28 += (-class3.field28 + var2) / 16;
        }
        class239.method1569((byte) 50);
        if (!arg0) {
            field1370 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            field1365 = 53;
        }
        ++field1368;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field1369 = arg0.method215(-1797813752);
            } else {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field1384 = this.field1371 = arg0.method215(-1797813752);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.field1383 = arg0.method215(-1797813752);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field1384 = arg0.method215(-1797813752);
                        return;
                    }
                    if (arg1 == 6) {
                        this.field1371 = arg0.method215(arg2 ^ -1797813792);
                        return;
                    }
                } else {
                    this.field1375 = arg0.method228(true);
                    if (this.field1375 < 0) {
                        this.field1381 = new short[this.field1369];
                        for (int var5 = 0; ~this.field1369 < ~var5; ++var5) {
                            this.field1381[var5] = (short) arg0.method228(true);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field1382 = ~arg0.method215(-1797813752) == -2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
    public static void method538(int arg0) {
        field1370 = null;
        if (arg0 != 6) {
            field1365 = -102;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    public static final void method539(int arg0, boolean arg1) {
        ++field1377;
        if (arg0 != -1) {
            if (class39.method352(-10924, arg0)) {
                class136[] var2 = class177.field3344[arg0];
                int var3 = 0;
                if (arg1) {
                    while (~var2.length < ~var3) {
                        class136 var4 = var2[var3];
                        if (var4.field2623 != null) {
                            class51 var5 = new class51();
                            var5.field1042 = var4.field2623;
                            var5.field1031 = var4;
                            class166.method1115(2000000, var5, true);
                        }
                        ++var3;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
    private final void method540(byte arg0) {
        if (~this.field1375 >= -1) {
            if (this.field1381 != null && ~this.field1381.length == ~this.field1369) {
                this.field1373 = new short[this.field1369];
                for (int var2 = 0; var2 < this.field1369; ++var2) {
                    this.field1373[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field1373 = new short[this.field1369];
            this.field1381 = new short[this.field1369];
            for (int var3 = 0; ~var3 > ~this.field1369; ++var3) {
                this.field1381[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1375 / 4096.0F), (double) var3)));
                this.field1373[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 107) {
            method538(-37);
        }
        ++field1372;
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        ++field1374;
        this.field1364 = class212.method1410(this.field1383, true);
        this.method540((byte) 107);
        for (int var2 = this.field1369 - 1; var2 >= 1; --var2) {
            short var3 = this.field1381[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field1369;
        }
        if (arg0 != -21746) {
            this.field1383 = 26;
        }
    }
}
