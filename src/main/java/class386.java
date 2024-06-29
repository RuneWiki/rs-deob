import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class386 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field5457 = 128;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    private int field5462 = 0;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Z")
    public boolean field5460 = true;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public int field5464 = -1;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
    public static int[] field5456 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public int field5458;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field5459;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2448(int arg0) {
        class15 var1 = class332.field4822;
        synchronized (class332.field4822) {
            class332.field4822.method98(0);
        }
        if (arg0 <= 47) {
            return;
        }
        field5463++;
        class15 var2 = class258.field3826;
        synchronized (class258.field3826) {
            class258.field3826.method98(0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V", line = 23)
    private final void method2449(int arg0, int arg1) {
        field5468++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field5467 = (int) (var15 * 256.0D);
        this.field5465 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field5467 < 0) {
            this.field5467 = 0;
        } else if (this.field5467 > 255) {
            this.field5467 = 255;
        }
        if (this.field5465 < arg0) {
            this.field5465 = 0;
        } else if (this.field5465 > 255) {
            this.field5465 = 255;
        }
        if (var17 > 0.5D) {
            this.field5459 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5459 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5459 < 1) {
            this.field5459 = 1;
        }
        this.field5458 = (int) ((double) this.field5459 * var19);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Llf;IZ)V", line = 114)
    public final void method2450(class130 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2453((byte) 27);
        }
        field5466++;
        while (true) {
            int var4 = arg0.method837(true);
            if (var4 == 0) {
                return;
            }
            this.method2452((byte) 105, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 135)
    public static void method2451(int arg0) {
        field5456 = null;
        if (arg0 < 116) {
            field5456 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BILlf;I)V", line = 145)
    private final void method2452(byte arg0, int arg1, class130 arg2, int arg3) {
        if (arg1 == 1) {
            this.field5462 = arg2.method839((byte) -92);
            this.method2449(0, this.field5462);
        } else if (arg1 == 2) {
            this.field5464 = arg2.method798(false);
            if (this.field5464 == 65535) {
                this.field5464 = -1;
            }
        } else if (arg1 == 3) {
            this.field5457 = arg2.method798(false);
        } else if (arg1 == 4) {
            this.field5460 = false;
        }
        field5455++;
        if (arg0 != 105) {
            method2454((byte) -31, (String) null);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 188)
    public static final void method2453(byte arg0) {
        if (arg0 != -100) {
            method2455(false, (byte) -106);
        }
        if (class219.field3149 != 3) {
            class426.field6087 = -1;
        }
        field5454++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/lang/String;)V", line = 221)
    public static final void method2454(byte arg0, String arg1) {
        field5461++;
        if (!arg1.equals("") && arg0 == 9) {
            class314.field4620++;
            class407.field5761.method2048(2040, 234);
            class407.field5761.method831(class276.method1873(true, arg1), (byte) -87);
            class407.field5761.method807((byte) 124, arg1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZB)V", line = 245)
    public static final void method2455(boolean arg0, byte arg1) {
        field5453++;
        class241.field3551 = arg0;
        if (class241.field3551) {
            int var17 = class352.field5114.method850(false);
            int var18 = class352.field5114.method837(true);
            boolean var19 = class352.field5114.method850(false) == 1;
            int var20 = class352.field5114.method812(3);
            int var21 = class352.field5114.method798(false);
            int var22 = class352.field5114.method798(false);
            int var23 = class352.field5114.method812(3);
            class5.method20(var17, (byte) -127);
            class352.field5114.method2047((byte) -105);
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var39 = 0; var39 < (class80.field1034 >> 3); var39++) {
                    for (int var40 = 0; var40 < (class381.field5414 >> 3); var40++) {
                        int var41 = class352.field5114.method2053((byte) 0, 1);
                        if (var41 == 1) {
                            class366.field5241[var24][var39][var40] = class352.field5114.method2053((byte) 0, 26);
                        } else {
                            class366.field5241[var24][var39][var40] = -1;
                        }
                    }
                }
            }
            class352.field5114.method2054(8);
            int var25 = (class242.field3572 - class352.field5114.field1880) / 16;
            class393.field5531 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var38 = 0; var38 < 4; var38++) {
                    class393.field5531[var26][var38] = class352.field5114.method815(true);
                }
            }
            class199.field2844 = new int[var25];
            class295.field4271 = new byte[var25][];
            class291.field4236 = new int[var25];
            class377.field5378 = new byte[var25][];
            class439.field6265 = null;
            class75.field991 = new byte[var25][];
            class222.field3177 = new int[var25];
            class289.field4210 = new int[var25];
            class450.field6456 = null;
            class403.field5654 = new int[var25];
            class2.field12 = new byte[var25][];
            int var27 = 0;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < (class80.field1034 >> 3); var29++) {
                    for (int var30 = 0; var30 < class381.field5414 >> 3; var30++) {
                        int var31 = class366.field5241[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = var31 >> 14 & 0x3FF;
                            int var33 = var31 >> 3 & 0x7FF;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class199.field2844[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                class199.field2844[var27] = var34;
                                int var36 = (var34 & 0xFFF5) >> 8;
                                int var37 = var34 & 0xFF;
                                class222.field3177[var27] = class226.field3370.method662(5899, "m" + var36 + "_" + var37);
                                class403.field5654[var27] = class226.field3370.method662(5899, "l" + var36 + "_" + var37);
                                class289.field4210[var27] = class226.field3370.method662(5899, "um" + var36 + "_" + var37);
                                class291.field4236[var27] = class226.field3370.method662(arg1 + 6001, "ul" + var36 + "_" + var37);
                                var27++;
                            }
                        }
                    }
                }
            }
            class54.method348(var21, var19, var20, var23, false, true, var18, var22);
        } else {
            int var2 = class352.field5114.method798(false);
            boolean var3 = class352.field5114.method810((byte) -6) == 1;
            int var4 = class352.field5114.method809(false);
            int var5 = class352.field5114.method848(255);
            int var6 = class352.field5114.method812(3);
            int var7 = class352.field5114.method850(false);
            int var8 = (class242.field3572 - class352.field5114.field1880) / 16;
            class393.field5531 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var16 = 0; var16 < 4; var16++) {
                    class393.field5531[var9][var16] = class352.field5114.method822((byte) -13);
                }
            }
            int var10 = class352.field5114.method809(false);
            class5.method20(var5, (byte) -93);
            class295.field4271 = new byte[var8][];
            class222.field3177 = new int[var8];
            class377.field5378 = new byte[var8][];
            class2.field12 = new byte[var8][];
            class289.field4210 = new int[var8];
            class291.field4236 = new int[var8];
            class199.field2844 = new int[var8];
            class439.field6265 = null;
            class403.field5654 = new int[var8];
            class450.field6456 = null;
            class75.field991 = new byte[var8][];
            boolean var11 = false;
            if ((var2 / 8 == 48 || (var2 / 8) == 49) && (var10 / 8) == 48) {
                var11 = true;
            }
            int var12 = 0;
            if (var2 / 8 == 48 && (var10 / 8) == 148) {
                var11 = true;
            }
            for (int var13 = (var2 - (class80.field1034 >> 4)) / 8; var13 <= (var2 + (class80.field1034 >> 4)) / 8; var13++) {
                for (int var14 = (var10 - (class381.field5414 >> 4)) / 8; var14 <= (((class381.field5414 >> 4) + var10) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class199.field2844[var12] = var15;
                        class222.field3177[var12] = -1;
                        class403.field5654[var12] = -1;
                        class289.field4210[var12] = -1;
                        class291.field4236[var12] = -1;
                    } else {
                        class199.field2844[var12] = var15;
                        class222.field3177[var12] = class226.field3370.method662(5899, "m" + var13 + "_" + var14);
                        class403.field5654[var12] = class226.field3370.method662(class417.method2632(arg1, -5999), "l" + var13 + "_" + var14);
                        class289.field4210[var12] = class226.field3370.method662(arg1 + 6001, "um" + var13 + "_" + var14);
                        class291.field4236[var12] = class226.field3370.method662(5899, "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class54.method348(var6, var3, var10, var2, false, true, var7, var4);
        }
        if (arg1 != -102) {
            method2455(true, (byte) 55);
        }
    }
}
