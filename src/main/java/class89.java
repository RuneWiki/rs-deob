import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class89 extends class114 {

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Z")
    private boolean field1278 = true;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[B")
    private byte[] field1283 = new byte[512];

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
    private int field1294 = 4;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    private int field1285 = 4;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    private int field1279 = 0;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
    private int field1292 = 1638;

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "I")
    private int field1295 = 4;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "[I")
    public static int[] field1288 = new int[5];

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field1287 = 0;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "[Lwh;")
    public static class250[] field1282;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "[S")
    private short[] field1291;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "[S")
    private short[] field1293;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V")
    public static final void method572(int arg0) {
        if (arg0 > -36) {
            method573((String) null, (byte) -116);
        }
        class157.field2168 = 0;
        class249.field3897 = 0;
        class141.field1939 = 0;
        class176.field2485 = false;
        class274.field4354 = 0;
        ++field1280;
        class222.field3460 = -1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field1290;
        this.field1283 = class271.method1770(13080, this.field1279);
        this.method575(0);
        for (int var2 = this.field1295 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field1291[var2];
            if (~var3 < -9 || var3 < -8) {
                break;
            }
            --this.field1295;
        }
        if (arg0 <= 101) {
            this.method575(32);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method573(String arg0, byte arg1) {
        ++field1276;
        class82.method524(0, (byte) 79, arg0, 0, "", "");
        if (arg1 > -113) {
            method572(-77);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
    public static final void method574() {
        if (class174.field2456 != null) {
            for (int var0 = 0; var0 < class174.field2456.length; ++var0) {
                for (int var1 = 0; var1 < class207.field3086; ++var1) {
                    for (int var2 = 0; var2 < class265.field4271; ++var2) {
                        class174.field2456[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class184.field2793 != null) {
            for (int var3 = 0; var3 < class184.field2793.length; ++var3) {
                for (int var4 = 0; var4 < class207.field3086; ++var4) {
                    for (int var5 = 0; var5 < class265.field4271; ++var5) {
                        class184.field2793[var3][var4][var5] = null;
                    }
                }
            }
        }
        class195.field2991 = 0;
        if (class288.field4590 != null) {
            for (int var6 = 0; var6 < class195.field2991; ++var6) {
                class288.field4590[var6] = null;
            }
        }
        if (class126.field1764 != null) {
            for (int var7 = 0; var7 < class57.field787; ++var7) {
                class126.field1764[var7] = null;
            }
            class57.field787 = 0;
        }
        if (class120.field1713 != null) {
            for (int var8 = 0; var8 < class120.field1713.length; ++var8) {
                class120.field1713[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)V")
    private final void method575(int arg0) {
        if (this.field1292 <= arg0) {
            if (this.field1291 != null && ~this.field1291.length == ~this.field1295) {
                this.field1293 = new short[this.field1295];
                for (int var2 = 0; ~var2 > ~this.field1295; ++var2) {
                    this.field1293[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field1291 = new short[this.field1295];
            this.field1293 = new short[this.field1295];
            for (int var3 = 0; this.field1295 > var3; ++var3) {
                this.field1291[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1292 / 4096.0F), (double) var3)));
                this.field1293[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field1281;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([IIB)V")
    private final void method576(int[] arg0, int arg1, byte arg2) {
        int var4 = class159.field2209[arg1] * this.field1285;
        ++field1289;
        if (arg2 > 36) {
            if (~this.field1295 != -2) {
                short var5 = this.field1291[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field1293[0] << 12;
                    int var7 = this.field1294 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = this.field1285 * var6 >> 12;
                    int var10 = var8 >> 12;
                    int var11 = var8 & 4095;
                    int var12 = var10 - -1;
                    if (var9 <= var12) {
                        var12 = 0;
                    }
                    int var13 = this.field1283[255 & var12] & 255;
                    int var14 = class233.field3652[var11];
                    int var15 = this.field1283[255 & var10] & 255;
                    for (int var16 = 0; ~class145.field2009 < ~var16; ++var16) {
                        int var36 = class99.field1434[var16] * this.field1294;
                        int var37 = this.method577(var15, var7, var14, var11, var6 * var36 >> 12, 4096, var13);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field1295; ++var17) {
                    short var18 = this.field1291[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field1293[var17] << 12;
                        int var20 = this.field1294 * var19 >> 12;
                        int var21 = this.field1285 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 - -1;
                        if (~var24 <= ~var21) {
                            var24 = 0;
                        }
                        int var25 = 255 & this.field1283[255 & var23];
                        int var26 = this.field1283[255 & var24] & 255;
                        int var27 = var22 & 4095;
                        int var28 = class233.field3652[var27];
                        if (this.field1278 && this.field1295 + -1 == var17) {
                            for (int var29 = 0; ~class145.field2009 < ~var29; ++var29) {
                                int var30 = class99.field1434[var29] * this.field1294;
                                int var31 = this.method577(var25, var20, var28, var27, var19 * var30 >> 12, 4096, var26);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = 2048 - -(var32 >> 1);
                            }
                        } else {
                            for (int var33 = 0; ~class145.field2009 < ~var33; ++var33) {
                                int var34 = class99.field1434[var33] * this.field1294;
                                int var35 = this.method577(var25, var20, var28, var27, var19 * var34 >> 12, 4096, var26);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field1291[0];
                int var39 = this.field1293[0] << 12;
                int var40 = this.field1294 * var39 >> 12;
                int var41 = this.field1285 * var39 >> 12;
                int var42 = var4 * var39 >> 12;
                int var43 = var42 >> 12;
                int var44 = var43 + 1;
                int var45 = var42 & 4095;
                if (var44 >= var41) {
                    var44 = 0;
                }
                int var46 = this.field1283[var44 & 255] & 255;
                int var47 = class233.field3652[var45];
                int var48 = 255 & this.field1283[255 & var43];
                if (this.field1278) {
                    for (int var49 = 0; ~var49 > ~class145.field2009; ++var49) {
                        int var50 = class99.field1434[var49] * this.field1294;
                        int var51 = this.method577(var48, var40, var47, var45, var39 * var50 >> 12, 4096, var46);
                        int var52 = var38 * var51 >> 12;
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class145.field2009; ++var53) {
                        int var54 = class99.field1434[var53] * this.field1294;
                        int var55 = this.method577(var48, var40, var47, var45, var39 * var54 >> 12, 4096, var46);
                        arg0[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)I")
    private final int method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 4096) {
            method574();
        }
        ++field1286;
        int var8 = arg3 + -4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        if (~arg1 >= ~var10) {
            var10 = 0;
        }
        int var11 = var9 & 255;
        int var12 = this.field1283[arg0 + var11] & 3;
        int var13 = var10 & 255;
        int var14 = arg4 & 4095;
        int var15;
        if (var12 > 1) {
            var15 = var12 == 2 ? -arg3 + var14 : -arg3 + -var14;
        } else {
            var15 = ~var12 == -1 ? arg3 + var14 : -var14 + arg3;
        }
        int var16 = this.field1283[arg0 + var13] & 3;
        int var17 = class233.field3652[var14];
        int var18 = var14 + -4096;
        int var19;
        if (~var16 < -2) {
            var19 = ~var16 != -3 ? -arg3 + -var18 : -arg3 + var18;
        } else {
            var19 = var16 == 0 ? arg3 + var18 : -var18 + arg3;
        }
        int var20 = this.field1283[arg6 + var11] & 3;
        int var21 = var15 - -((-var15 + var19) * var17 >> 12);
        int var22;
        if (~var20 < -2) {
            var22 = var20 != 2 ? -var8 + -var14 : -var8 + var14;
        } else {
            var22 = var20 == 0 ? var8 + var14 : -var14 + var8;
        }
        int var23 = 3 & this.field1283[arg6 + var13];
        int var24;
        if (~var23 >= -2) {
            var24 = var23 != 0 ? -var18 + var8 : var8 + var18;
        } else {
            var24 = var23 != 2 ? -var8 + -var18 : -var8 + var18;
        }
        int var25 = ((-var22 + var24) * var17 >> 12) + var22;
        return ((-var21 + var25) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field1277;
        int[] var3 = super.field1630.method302(arg0, -111);
        if (arg1) {
            this.field1279 = -95;
        }
        if (super.field1630.field710) {
            this.method576(var3, arg0, (byte) 117);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            this.field1295 = 76;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field1285 = arg0.method1374((byte) -60);
                                }
                            } else {
                                this.field1294 = arg0.method1374((byte) -60);
                            }
                        } else {
                            this.field1279 = arg0.method1374((byte) -60);
                        }
                    } else {
                        this.field1294 = this.field1285 = arg0.method1374((byte) -60);
                    }
                } else {
                    this.field1292 = arg0.method1356(false);
                    if (~this.field1292 > -1) {
                        this.field1291 = new short[this.field1295];
                        for (int var5 = 0; ~var5 > ~this.field1295; ++var5) {
                            this.field1291[var5] = (short) arg0.method1356(false);
                        }
                    }
                }
            } else {
                this.field1295 = arg0.method1374((byte) -60);
            }
        } else {
            this.field1278 = ~arg0.method1374((byte) -60) == -2;
        }
        ++field1284;
    }

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "(I)V")
    public static void method578(int arg0) {
        field1282 = null;
        if (arg0 != -3) {
            field1282 = null;
        }
        field1288 = null;
    }
}
