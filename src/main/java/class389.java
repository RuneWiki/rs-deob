import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class389 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    private int field5571 = 128;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    private int field5572 = 0;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
    public boolean field5577 = false;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    private int field5574 = 128;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    private int field5585 = 0;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    private int field5592 = 0;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Z")
    public boolean field5590 = false;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public int field5597 = -1;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field5578 = -1;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field5570 = 0;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
    public static boolean field5581 = false;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field5591 = 0;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5593 = "Created gameworld";

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field5596 = -1;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    private int field5580;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[S")
    private short[] field5573;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[S")
    private short[] field5586;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "[S")
    private short[] field5588;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "[S")
    private short[] field5594;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILja;I[Lc;IZ[BII)[I", line = 8)
    public static final int[] method2459(int arg0, int arg1, class90 arg2, int arg3, class158[] arg4, int arg5, boolean arg6, byte[] arg7, int arg8, int arg9) {
        if (!arg6) {
            for (int var10 = 0; var10 < 4; var10++) {
                class158 var11 = arg4[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg8 + var12;
                        int var15 = arg0 + var13;
                        if (var14 >= 0 && var14 < class183.field2703 && var15 >= 0 && class66.field1056 > var15) {
                            var11.method1248(var15, 1, var14);
                        }
                    }
                }
            }
        }
        field5598++;
        class37 var16 = new class37(arg7);
        int var17 = arg3 + arg8;
        int var18 = arg0 + arg5;
        for (int var19 = 0; var19 < arg1; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class432.method2683(0, arg8 + var55, arg6, false, 0, var17 + var55, 0, arg0 + var56, -2222, var19, var16, var18 + var56);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        if (arg9 != -3175) {
            method2463((byte) -89);
        }
        while (var16.field565 < var16.field578.length) {
            int var22 = var16.method271((byte) 105);
            if (var22 == 128) {
                class157.field2385[0] = var16.method320((byte) -87);
                class157.field2385[1] = var16.method321((byte) 112);
                class157.field2385[2] = var16.method321((byte) 125);
                class157.field2385[3] = var16.method321((byte) 101);
                var20 = true;
                class157.field2385[4] = var16.method320((byte) -87);
            } else {
                if (var22 != 129) {
                    var16.field565--;
                    break;
                }
                if (class417.field6034 == null) {
                    class417.field6034 = new byte[4][][];
                }
                for (int var40 = 0; var40 < 4; var40++) {
                    byte var41 = var16.method291(0);
                    if (var41 == 0 && class417.field6034[var40] != null) {
                        int var42 = arg8;
                        int var43 = arg8 + 64;
                        int var44 = arg0;
                        int var45 = arg0 + 64;
                        if (arg8 < 0) {
                            var42 = 0;
                        } else if (arg8 >= class183.field2703) {
                            var42 = class183.field2703;
                        }
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (var43 >= class183.field2703) {
                            var43 = class183.field2703;
                        }
                        if (arg0 < 0) {
                            var44 = 0;
                        } else if (class66.field1056 <= arg0) {
                            var44 = class66.field1056;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (class66.field1056 <= var45) {
                            var45 = class66.field1056;
                        }
                        while (var42 < var43) {
                            while (var44 < var45) {
                                class417.field6034[var40][var42][var44] = 0;
                                var44++;
                            }
                            var42++;
                        }
                    } else if (var41 == 1) {
                        if (class417.field6034[var40] == null) {
                            class417.field6034[var40] = new byte[class183.field2703 + 1][class66.field1056 + 1];
                        }
                        for (int var46 = 0; var46 < 64; var46 += 4) {
                            for (int var47 = 0; var47 < 64; var47 += 4) {
                                byte var48 = var16.method291(arg9 ^ 0xFFFFF399);
                                for (int var49 = arg8 + var46; var49 < var46 - (-arg8 - 4); var49++) {
                                    for (int var50 = arg0 + var47; var50 < var47 + arg0 + 4; var50++) {
                                        if (var49 >= 0 && var49 < class183.field2703 && var50 >= 0 && class66.field1056 > var50) {
                                            class417.field6034[var40][var49][var50] = var48;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var41 == 2) {
                        if (class417.field6034[var40] == null) {
                            class417.field6034[var40] = new byte[class183.field2703 + 1][class66.field1056 + 1];
                        }
                        if (var40 > 0) {
                            int var51 = arg8;
                            int var52 = arg8 + 64;
                            int var53 = arg0;
                            if (var52 < 0) {
                                var52 = 0;
                            } else if (class183.field2703 <= var52) {
                                var52 = class183.field2703;
                            }
                            if (arg0 < 0) {
                                var53 = 0;
                            } else if (class66.field1056 <= arg0) {
                                var53 = class66.field1056;
                            }
                            if (arg8 < 0) {
                                var51 = 0;
                            } else if (class183.field2703 <= arg8) {
                                var51 = class183.field2703;
                            }
                            int var54 = arg0 + 64;
                            if (var54 < 0) {
                                var54 = 0;
                            } else if (class66.field1056 <= var54) {
                                var54 = class66.field1056;
                            }
                            while (var51 < var52) {
                                while (var54 > var53) {
                                    class417.field6034[var40][var51][var53] = class417.field6034[var40 - 1][var51][var53];
                                    var53++;
                                }
                                var51++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg6) {
            class283 var23 = null;
            label289: while (true) {
                int var29;
                label282: do {
                    while (true) {
                        while (var16.field565 < var16.field578.length) {
                            int var28 = var16.method271((byte) 106);
                            if (var28 == 0) {
                                var23 = new class283(var16);
                            } else {
                                if (var28 == 1) {
                                    var29 = var16.method271((byte) 118);
                                    continue label282;
                                }
                                if (var28 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var23 == null) {
                                    var23 = new class283();
                                }
                                var23.method2007(var16, 2955);
                            }
                        }
                        if (var23 != null) {
                            for (int var24 = 0; var24 < 8; var24++) {
                                for (int var25 = 0; var25 < 8; var25++) {
                                    int var26 = (arg8 >> 3) + var24;
                                    int var27 = (arg0 >> 3) + var25;
                                    if (var26 >= 0 && class183.field2703 >> 3 > var26 && var27 >= 0 && var27 < (class66.field1056 >> 3)) {
                                        class79.method625(var23, var26, true, var27);
                                    }
                                }
                            }
                        }
                        break label289;
                    }
                } while (var29 <= 0);
                for (int var30 = 0; var30 < var29; var30++) {
                    class420 var31 = new class420(var16);
                    if (var31.field6128 == 31) {
                        class75 var32 = class308.method2107(200, var16.method320((byte) -87));
                        var31.method2640(var32.field1284, var32.field1285, var32.field1287, 99, var32.field1283);
                    }
                    var31.field945 += arg0 << 7;
                    var31.field942 += arg8 << 7;
                    int var33 = var31.field942 >> 7;
                    int var34 = var31.field945 >> 7;
                    if (var33 >= 0 && var34 >= 0 && class183.field2703 > var33 && var34 < class66.field1056) {
                        var31.field944 = class275.field4146[var31.field6124][var33][var34] - var31.field944;
                        if (arg2.method757() > 0) {
                            class319.method2136(var31);
                        }
                    }
                }
            }
        }
        if (!var21 && class417.field6034 != null) {
            for (int var35 = 0; var35 < 4; var35++) {
                if (class417.field6034[var35] != null) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            int var38 = (arg8 >> 2) + var36;
                            int var39 = (arg0 >> 2) + var37;
                            if (var38 >= 0 && var38 < 26 && var39 >= 0 && var39 < 26) {
                                class417.field6034[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class157.field2385;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lec;II)V", line = 454)
    private final void method2460(class37 arg0, int arg1, int arg2) {
        if (arg1 != -20848) {
            this.field5572 = -63;
        }
        if (arg2 == 1) {
            this.field5580 = arg0.method320((byte) -87);
        } else if (arg2 == 2) {
            this.field5597 = arg0.method320((byte) -87);
        } else if (arg2 == 4) {
            this.field5571 = arg0.method320((byte) -87);
        } else if (arg2 == 5) {
            this.field5574 = arg0.method320((byte) -87);
        } else if (arg2 == 6) {
            this.field5592 = arg0.method320((byte) -87);
        } else if (arg2 == 7) {
            this.field5572 = arg0.method271((byte) 113);
        } else if (arg2 == 8) {
            this.field5585 = arg0.method271((byte) 121);
        } else if (arg2 == 9) {
            this.field5577 = true;
        } else if (arg2 == 10) {
            this.field5590 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method271((byte) 127);
            this.field5588 = new short[var4];
            this.field5586 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5586[var5] = (short) arg0.method320((byte) -87);
                this.field5588[var5] = (short) arg0.method320((byte) -87);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method271((byte) 102);
            this.field5573 = new short[var6];
            this.field5594 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5594[var7] = (short) arg0.method320((byte) -87);
                this.field5573[var7] = (short) arg0.method320((byte) -87);
            }
        }
        field5583++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V", line = 546)
    public static final void method2461(byte arg0, int arg1, int arg2) {
        int var3 = -117 / ((arg0 - 43) / 52);
        class367.field5215++;
        field5582++;
        class13.field216.method2781(false, 78);
        class13.field216.method275(arg2, 1414495172);
        class13.field216.method324(arg1, -111);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILec;)V", line = 561)
    public final void method2462(int arg0, class37 arg1) {
        field5576++;
        while (true) {
            int var3 = arg1.method271((byte) 101);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field5593 = null;
                    return;
                }
            }
            this.method2460(arg1, -20848, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 588)
    public static void method2463(byte arg0) {
        field5593 = null;
        if (arg0 > -7) {
            field5587 = 65;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lja;IIIII)Lrc;", line = 620)
    public final class100 method2464(class90 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5584++;
        int var7 = arg1;
        class51 var8 = this.field5597 == -1 || arg4 == -1 ? null : class113.method974(this.field5597, (byte) -73);
        if (var8 != null) {
            var7 = arg1 | var8.method410(arg2, false, arg4, false);
        }
        if (this.field5574 != 128) {
            var7 |= 0x2;
        }
        if (this.field5571 != 128 || this.field5592 != 0) {
            var7 |= 0x5;
        }
        class18 var9 = class418.field6059;
        class100 var10;
        synchronized (class418.field6059) {
            var10 = (class100) class418.field6059.method103(0, (long) (this.field5589 |= arg0.field1431 << 29));
        }
        if (var10 == null || arg0.method677(var10.method560(), var7) != 0) {
            if (var10 != null) {
                var7 = arg0.method713(var7, var10.method560());
            }
            int var11 = var7;
            if (this.field5586 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field5594 != null) {
                var11 |= 0x4000;
            }
            class382 var12 = class265.method1893(this.field5580, class187.field2772, 0, (byte) -116);
            if (var12 == null) {
                return null;
            }
            var10 = arg0.method735(var12, var11, class351.field4990, this.field5572 + 64, this.field5585 - -850);
            if (this.field5586 != null) {
                for (int var13 = 0; var13 < this.field5586.length; var13++) {
                    var10.method554(this.field5586[var13], this.field5588[var13]);
                }
            }
            if (this.field5594 != null) {
                for (int var14 = 0; var14 < this.field5594.length; var14++) {
                    var10.method570(this.field5594[var14], this.field5573[var14]);
                }
            }
            var10.method525(var7);
            class18 var15 = class418.field6059;
            synchronized (class418.field6059) {
                class418.field6059.method113(var10, arg5 - 6677, (long) (this.field5589 |= arg0.field1431 << 29));
            }
        }
        class100 var16 = var10.method518((byte) 2, var7, true);
        if (var8 != null) {
            var16 = var8.method403((byte) 2, var16, arg2, arg3, -15566, arg4, var7, 0);
        }
        if (this.field5571 != 128 || this.field5574 != 128) {
            var16.method539(this.field5571, this.field5574, this.field5571);
        }
        if (this.field5592 != 0) {
            if (this.field5592 == 90) {
                var16.method538(4096);
            }
            if (this.field5592 == 180) {
                var16.method538(8192);
            }
            if (this.field5592 == 270) {
                var16.method538(12288);
            }
        }
        if (arg5 != 6677) {
            this.field5594 = null;
        }
        var16.method525(arg1);
        return var16;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLtd;)V", line = 744)
    public static final void method2465(byte arg0, class107 arg1) {
        if (arg0 == 112) {
            class139.field2204 = arg1;
            field5575++;
        }
    }
}
