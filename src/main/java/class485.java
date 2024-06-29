import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class485 {

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "J")
    private long field6884 = -1L;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    private int field6887 = 0;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "J")
    private long field6902 = -1L;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lis;")
    private class112 field6892;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "J")
    private long field6881;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "J")
    private long field6889;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "[B")
    private byte[] field6891;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
    private long field6878;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "[B")
    private byte[] field6886;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
    public static boolean field6885 = false;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[I")
    public static int[] field6888 = new int[4];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    private int field6904;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "J")
    private long field6895;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    private final void method2820(int arg0) throws IOException {
        if (arg0 != 65535) {
            return;
        }
        this.field6904 = 0;
        field6896++;
        if (this.field6895 != this.field6878) {
            this.field6892.method762(98, this.field6878);
            this.field6895 = this.field6878;
        }
        this.field6902 = this.field6878;
        while (this.field6904 < this.field6886.length) {
            int var2 = this.field6886.length - this.field6904;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6892.method761(var2, (byte) 115, this.field6904, this.field6886);
            if (var3 == -1) {
                break;
            }
            this.field6904 += var3;
            this.field6895 += var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILgaa;II)V")
    public static final void method2821(int arg0, class460 arg1, int arg2, int arg3) {
        field6879++;
        class81 var4 = arg1.method2702(class458.field6407, 102);
        if (var4 == null) {
            return;
        }
        class458.field6407.method131(arg2, arg3, arg1.field6566 + arg2, arg1.field6514 + arg3);
        if (class67.field886 < 3) {
            class756.field10535.method3928((float) arg1.field6566 / 2.0F + (float) arg2, (float) arg1.field6514 / 2.0F + (float) arg3, 4096, ((int) (-class748.field10471) & 0x3FFF) << 2, var4, arg2, arg3);
        } else {
            class458.field6407.method83(-16777216, var4, arg2, arg3);
        }
        if (arg0 != 4582) {
            method2829(null, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method2822(int arg0) {
        if (arg0 == -7190) {
            field6888 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public final void method2823(int arg0) throws IOException {
        field6901++;
        this.method2831(false);
        this.field6892.method756(-1);
        if (arg0 != 7) {
            method2822(6);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI[BI)V")
    public final void method2824(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6883++;
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (!arg0) {
                return;
            }
            if (this.field6884 != -1L && this.field6884 <= this.field6878 && ((long) this.field6887 + this.field6884) >= ((long) arg3 + this.field6878)) {
                class617.method3389(this.field6891, (int) (this.field6878 - this.field6884), arg2, arg1, arg3);
                this.field6878 += arg3;
                return;
            }
            long var5 = this.field6878;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field6902 <= this.field6878 && ((long) this.field6904 + this.field6902) > this.field6878) {
                int var9 = (int) (this.field6902 + (long) this.field6904 - this.field6878);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class617.method3389(this.field6886, (int) (this.field6878 - this.field6902), arg2, arg1, var9);
                arg1 += var9;
                this.field6878 += var9;
                arg3 -= var9;
            }
            if (this.field6886.length < arg3) {
                this.field6892.method762(82, this.field6878);
                this.field6895 = this.field6878;
                while (arg3 > 0) {
                    int var10 = this.field6892.method761(arg3, (byte) 77, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field6878 += var10;
                    this.field6895 += var10;
                    arg1 += var10;
                    arg3 -= var10;
                }
            } else if (arg3 > 0) {
                this.method2820(65535);
                int var11 = arg3;
                if (this.field6904 < arg3) {
                    var11 = this.field6904;
                }
                class617.method3389(this.field6886, 0, arg2, arg1, var11);
                arg1 += var11;
                arg3 -= var11;
                this.field6878 += var11;
            }
            if (this.field6884 != -1L) {
                if (this.field6878 < this.field6884 && arg3 > 0) {
                    int var12 = (int) (this.field6884 - this.field6878) + arg1;
                    if (var12 > (arg1 + arg3)) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field6878++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field6884 && this.field6884 < (long) var8 + var5) {
                    var13 = this.field6884;
                } else if (this.field6884 <= var5 && var5 < (long) this.field6887 + this.field6884) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field6887 + this.field6884 > var5 && (long) this.field6887 + this.field6884 <= (long) var8 + var5) {
                    var15 = (long) this.field6887 + this.field6884;
                } else if (this.field6884 < var5 + ((long) var8) && (long) var8 + var5 <= this.field6884 - -((long) this.field6887)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class617.method3389(this.field6891, (int) (var13 - this.field6884), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (this.field6878 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field6878));
                        this.field6878 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6895 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J")
    public final long method2825(byte arg0) {
        field6900++;
        if (arg0 > -20) {
            this.method2825((byte) 112);
        }
        return this.field6889;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BI)V")
    public final void method2826(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6898++;
        try {
            if ((long) arg3 + this.field6878 > this.field6889) {
                this.field6889 = (long) arg3 + this.field6878;
            }
            if (this.field6884 != -1L && (this.field6884 > this.field6878 || (this.field6884 + ((long) this.field6887)) < this.field6878)) {
                this.method2831(false);
            }
            if (this.field6884 != -1L && (long) arg3 + this.field6878 > (long) this.field6891.length + this.field6884) {
                int var5 = (int) ((long) this.field6891.length + this.field6884 - this.field6878);
                class617.method3389(arg2, arg1, this.field6891, (int) (this.field6878 - this.field6884), var5);
                this.field6878 += var5;
                arg1 += var5;
                arg3 -= var5;
                this.field6887 = this.field6891.length;
                this.method2831(false);
            }
            if (arg3 > this.field6891.length) {
                if (this.field6895 != this.field6878) {
                    this.field6892.method762(63, this.field6878);
                    this.field6895 = this.field6878;
                }
                this.field6892.method759(-1, arg2, arg1, arg3);
                this.field6895 += arg3;
                if (this.field6895 > this.field6881) {
                    this.field6881 = this.field6895;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field6902 <= this.field6878 && this.field6878 < (long) this.field6904 + this.field6902) {
                    var6 = this.field6878;
                } else if (this.field6902 >= this.field6878 && this.field6902 < ((long) arg3 + this.field6878)) {
                    var6 = this.field6902;
                }
                if (this.field6878 + ((long) arg3) > this.field6902 && this.field6902 + ((long) this.field6904) >= (long) arg3 + this.field6878) {
                    var8 = this.field6878 + ((long) arg3);
                } else if (this.field6878 < (long) this.field6904 + this.field6902 && (long) this.field6904 + this.field6902 <= (long) arg3 + this.field6878) {
                    var8 = (long) this.field6904 + this.field6902;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class617.method3389(arg2, (int) ((long) arg1 + var6 - this.field6878), this.field6886, (int) (var6 - this.field6902), var10);
                }
                this.field6878 += arg3;
            } else if (arg0 == -1 && arg3 > 0) {
                if (this.field6884 == -1L) {
                    this.field6884 = this.field6878;
                }
                class617.method3389(arg2, arg1, this.field6891, (int) (this.field6878 - this.field6884), arg3);
                this.field6878 += arg3;
                if (this.field6878 - this.field6884 > (long) this.field6887) {
                    this.field6887 = (int) (this.field6878 - this.field6884);
                }
            }
        } catch (IOException var12) {
            this.field6895 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method2827(int arg0) {
        field6903++;
        if (arg0 != 0) {
            method2832((byte) 56, 110, -100, true, -28, 53, -0.34697837F, -8);
        }
        return this.field6892.method760(0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lha;BLwm;)I")
    public static final int method2828(class454 arg0, byte arg1, class424 arg2) {
        if (arg1 != 9) {
            return 5;
        }
        field6890++;
        if (arg2.field6036 != -1) {
            return arg2.field6036;
        }
        if (arg2.field6047 != -1) {
            class91 var3 = arg0.field6364.method389(9559, arg2.field6047);
            if (!var3.field1167) {
                return var3.field1151;
            }
        }
        return arg2.field6043;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lan;B)V")
    public static final void method2829(class182 arg0, byte arg1) {
        field6899++;
        if (class527.field7442 == arg0) {
            int var2 = class24.field414.method1119(false);
            int var3 = class24.field414.method1122(18726);
            int var4 = class24.field414.method1154((byte) 102);
            int var5 = (var4 & 0x7) + class198.field2543;
            int var6 = class753.field10509 + var5;
            int var7 = ((var4 & 0x70) >> 4) + class515.field7255;
            int var8 = class63.field851 + var7;
            boolean var9 = var7 >= 0 && var5 >= 0 && var7 < class613.field8591 && var5 < class1.field3;
            if (var9 || class374.method2277(-6, class506.field7142)) {
                class137.method856(new class11(var3, var2), arg1 + 34247, var8, class380.field5308, var6);
                if (var9) {
                    class203.method1261(class380.field5308, var5, var7, (byte) 30);
                }
            }
        } else if (class384.field5342 == arg0) {
            int var10 = class24.field414.method1094(255);
            int var11 = ((var10 & 0x70) >> 4) + class515.field7255;
            int var12 = (var10 & 0x7) + class198.field2543;
            int var13 = class24.field414.method1107(false);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class24.field414.method1094(255);
            int var15 = var14 >> 4 & 0xF;
            int var16 = var14 & 0x7;
            int var17 = class24.field414.method1094(255);
            int var18 = class24.field414.method1094(255);
            int var19 = class24.field414.method1107(false);
            if (var11 >= 0 && var12 >= 0 && class613.field8591 > var11 && var12 < class1.field3) {
                int var20 = var15 + 1;
                if (var11 - var20 <= class339.field4374.field435[0] && var11 + var20 >= class339.field4374.field435[0] && class339.field4374.field426[0] >= (var12 - var20) && var12 + var20 >= class339.field4374.field426[0]) {
                    class336.method1978((class380.field5308 << 24) + var15 + (var11 << 16) + (var12 << 8), (byte) -128, var17, false, var18, var13, var16, var19);
                }
            }
        } else if (arg1 == 89) {
            if (class302.field3887 == arg0) {
                int var21 = class24.field414.method1094(255);
                int var22 = (var21 >> 4 & 0xF) + class515.field7255 * 2;
                int var23 = (var21 & 0xF) + class198.field2543 * 2;
                int var24 = class24.field414.method1094(255);
                boolean var25 = (var24 & 0x1) != 0;
                boolean var26 = (var24 & 0x2) != 0;
                int var27 = var26 ? var24 >> 2 : -1;
                int var28 = var22 + class24.field414.method1133(8);
                int var29 = class24.field414.method1133(8) + var23;
                int var30 = class24.field414.method1137((byte) -64);
                int var31 = class24.field414.method1137((byte) -117);
                int var32 = class24.field414.method1107(false);
                int var33 = class24.field414.method1094(arg1 + 166);
                int var34;
                if (var26) {
                    var34 = (byte) var33;
                } else {
                    var34 = var33 * 4;
                }
                int var35 = class24.field414.method1094(255) * 4;
                int var36 = class24.field414.method1107(false);
                int var37 = class24.field414.method1107(false);
                int var38 = class24.field414.method1094(255);
                if (var38 == 255) {
                    var38 = -1;
                }
                int var39 = class24.field414.method1107(false);
                if (var22 >= 0 && var23 >= 0 && var22 < (class613.field8591 * 2) && var23 < class613.field8591 * 2 && var28 >= 0 && var29 >= 0 && (class1.field3 * 2) > var28 && var29 < class1.field3 * 2 && var32 != 65535) {
                    int var40 = var29 * 256;
                    int var41 = var34 << 2;
                    int var42 = var35 << 2;
                    int var43 = var39 << 2;
                    int var44 = var28 * 256;
                    int var45 = var22 * 256;
                    int var46 = var23 * 256;
                    if (var30 != 0 && var27 != -1) {
                        class24 var47 = null;
                        if (var30 < 0) {
                            int var48 = -var30 - 1;
                            if (class456.field6387 == var48) {
                                var47 = class339.field4374;
                            } else {
                                var47 = class447.field6287[var48];
                            }
                        } else {
                            int var49 = var30 - 1;
                            class247 var50 = (class247) class563.field7875.method3248((long) var49, 0);
                            if (var50 != null) {
                                var47 = var50.field3158;
                            }
                        }
                        if (var47 != null) {
                            class459 var51 = var47.method249(-75);
                            if (var51.field6454 != null && var51.field6454[var27] != null) {
                                var41 -= var51.field6454[var27][1];
                            }
                            if (var51.field6424 != null && var51.field6424[var27] != null) {
                                var41 -= var51.field6424[var27][1];
                            }
                        }
                    }
                    class68 var52 = new class68(var32, class380.field5308, class380.field5308, var45, var46, var41, class266.field3368 + var36, var37 - -class266.field3368, var38, var43, var30, var31, var42, var25, var27);
                    var52.method518(class592.method3287(false, var40, class380.field5308, var44) - var42, class266.field3368 + var36, (byte) 62, var44, var40);
                    class700.field9873.method3110(new class742(var52), 1);
                }
            } else if (class507.field7167 == arg0) {
                int var53 = class24.field414.method1107(false);
                int var54 = class24.field414.method1094(255);
                class358.field5112.method890(var53, false).method1741(-97, var54);
            } else if (class635.field8796 == arg0) {
                class24.field414.method1094(255);
                int var55 = class24.field414.method1094(255);
                int var56 = class515.field7255 + (var55 >> 4 & 0x7);
                int var57 = class198.field2543 + (var55 & 0x7);
                int var58 = class24.field414.method1107(false);
                int var59 = class24.field414.method1094(255);
                int var60 = class24.field414.method1114(78);
                String var61 = class24.field414.method1106(arg1 ^ 0xFFFFFFA6);
                class553.method3147(var57, var61, 27093, var59, var56, var58, var60, class380.field5308);
            } else if (class571.field7962 == arg0) {
                int var62 = class24.field414.method1094(arg1 ^ 0xA6);
                int var63 = class515.field7255 + (var62 >> 4 & 0x7);
                int var64 = class198.field2543 + (var62 & 0x7);
                int var65 = class24.field414.method1107(false);
                if (var65 == 65535) {
                    var65 = -1;
                }
                int var66 = class24.field414.method1094(255);
                int var67 = (var66 & 0xF6) >> 4;
                int var68 = var66 & 0x7;
                int var69 = class24.field414.method1094(255);
                int var70 = class24.field414.method1094(255);
                int var71 = class24.field414.method1107(false);
                if (var63 >= 0 && var64 >= 0 && class613.field8591 > var63 && var64 < class1.field3) {
                    int var72 = var67 + 1;
                    if (class339.field4374.field435[0] >= var63 - var72 && var63 + var72 >= class339.field4374.field435[0] && class339.field4374.field426[0] >= var64 - var72 && class339.field4374.field426[0] <= var64 + var72) {
                        class353.method2100(var65, var68, var69, var70, (class380.field5308 << 24) + var67 - (-(var63 << 16) + -(var64 << 8)), (byte) 105, var71);
                    }
                }
            } else if (class513.field7231 == arg0) {
                int var73 = class24.field414.method1140((byte) 125);
                int var74 = class515.field7255 + ((var73 & 0x7F) >> 4);
                int var75 = (var73 & 0x7) + class198.field2543;
                int var76 = class24.field414.method1107(false);
                if (var76 == 65535) {
                    var76 = -1;
                }
                int var77 = class24.field414.method1154((byte) 116);
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = class427.field6061[var78];
                class557.method3160(var79, var75, var80, var74, var76, false, class380.field5308, var78);
            } else if (class685.field9701 == arg0) {
                int var81 = class24.field414.method1140((byte) 127);
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = class427.field6061[var82];
                int var85 = class24.field414.method1119(false);
                int var86 = class24.field414.method1094(255);
                int var87 = ((var86 & 0x7F) >> 4) + class515.field7255;
                int var88 = (var86 & 0x7) + class198.field2543;
                if (class374.method2277(-6, class506.field7142) || var87 >= 0 && var88 >= 0 && class613.field8591 > var87 && var88 < class1.field3) {
                    class423.method2517(var87, arg1 ^ 0x99, var83, var82, 0, var88, var85, var84, -1, class380.field5308);
                }
            } else if (class271.field3432 == arg0) {
                int var89 = class24.field414.method1094(255);
                boolean var90 = (var89 & 0x80) != 0;
                int var91 = (var89 >> 3 & 0x7) + class515.field7255;
                int var92 = (var89 & 0x7) + class198.field2543;
                int var93 = var91 + class24.field414.method1133(8);
                int var94 = var92 + class24.field414.method1133(arg1 - 81);
                int var95 = class24.field414.method1137((byte) -124);
                int var96 = class24.field414.method1107(false);
                int var97 = class24.field414.method1094(255) * 4;
                int var98 = class24.field414.method1094(255) * 4;
                int var99 = class24.field414.method1107(false);
                int var100 = class24.field414.method1107(false);
                int var101 = class24.field414.method1094(arg1 + 166);
                if (var101 == 255) {
                    var101 = -1;
                }
                int var102 = class24.field414.method1107(false);
                if (var91 >= 0 && var92 >= 0 && var91 < class613.field8591 && var92 < class1.field3 && var93 >= 0 && var94 >= 0 && class613.field8591 > var93 && class1.field3 > var94 && var96 != 65535) {
                    int var103 = var92 * 512 + 256;
                    int var104 = var98 << 2;
                    int var105 = var102 << 2;
                    int var106 = var91 * 512 + 256;
                    int var107 = var94 * 512 + 256;
                    int var108 = var97 << 2;
                    int var109 = var93 * 512 + 256;
                    class68 var110 = new class68(var96, class380.field5308, class380.field5308, var106, var103, var108, class266.field3368 + var99, class266.field3368 + var100, var101, var105, 0, var95, var104, var90, -1);
                    var110.method518(class592.method3287(false, var107, class380.field5308, var109) - var104, class266.field3368 + var99, (byte) 62, var109, var107);
                    class700.field9873.method3110(new class742(var110), arg1 ^ 0x58);
                }
            } else if (class510.field7198 == arg0) {
                int var111 = class24.field414.method1122(18726);
                int var112 = class24.field414.method1140((byte) 123);
                int var113 = (var112 & 0x7) + class198.field2543;
                int var114 = class753.field10509 + var113;
                int var115 = (var112 >> 4 & 0x7) + class515.field7255;
                int var116 = class63.field851 + var115;
                class585 var117 = (class585) class497.field7028.method3248((long) (var116 | var114 << 14 | class380.field5308 << 28), 0);
                if (var117 != null) {
                    for (class11 var118 = (class11) var117.field8118.method3111(91); var118 != null; var118 = (class11) var117.field8118.method3116(arg1 ^ 0xFFFFFF91)) {
                        if ((var111 & 0x7FFF) == var118.field127) {
                            var118.method3426((byte) -88);
                            break;
                        }
                    }
                    if (var117.field8118.method3112(arg1 ^ 0xFFFFFFA5)) {
                        var117.method3426((byte) -15);
                    }
                    if (var115 >= 0 && var113 >= 0 && class613.field8591 > var115 && var113 < class1.field3) {
                        class203.method1261(class380.field5308, var113, var115, (byte) 30);
                    }
                }
            } else if (class250.field3174 == arg0) {
                int var119 = class24.field414.method1140((byte) 126);
                int var120 = var119 >> 2;
                int var121 = var119 & 0x3;
                int var122 = class427.field6061[var120];
                int var123 = class24.field414.method1140((byte) 125);
                int var124 = (var123 >> 4 & 0x7) + class515.field7255;
                int var125 = class198.field2543 + (var123 & 0x7);
                if (class374.method2277(-6, class506.field7142) || var124 >= 0 && var125 >= 0 && var124 < class613.field8591 && class1.field3 > var125) {
                    class423.method2517(var124, arg1 ^ 0x99, var121, var120, 0, var125, -1, var122, -1, class380.field5308);
                }
            } else if (class754.field10516 == arg0) {
                int var126 = class24.field414.method1094(255);
                int var127 = class515.field7255 + ((var126 & 0x7D) >> 4);
                int var128 = (var126 & 0x7) + class198.field2543;
                int var129 = class24.field414.method1107(false);
                int var130 = class24.field414.method1094(255);
                int var131 = class24.field414.method1107(false);
                int var132 = class24.field414.method1094(255);
                if (var127 >= 0 && var128 >= 0 && var127 < class613.field8591 && var128 < class1.field3) {
                    int var133 = var127 * 512 + 256;
                    int var134 = var128 * 512 + 256;
                    int var135 = class380.field5308;
                    if (var135 < 3 && class739.method4140((byte) 111, var128, var127)) {
                        var135++;
                    }
                    class561 var136 = new class561(var129, var131, class266.field3368, class380.field5308, var135, var133, class592.method3287(false, var134, class380.field5308, var133) - var130, var134, var127, var127, var128, var128, var132);
                    class631.field8763.method3110(new class64(var136), arg1 ^ 0x58);
                }
            } else if (class468.field6735 == arg0) {
                int var137 = class24.field414.method1094(255);
                int var138 = (var137 & 0x7) + class198.field2543;
                int var139 = class753.field10509 + var138;
                int var140 = (var137 >> 4 & 0x7) + class515.field7255;
                int var141 = class63.field851 + var140;
                int var142 = class24.field414.method1107(false);
                int var143 = class24.field414.method1107(false);
                int var144 = class24.field414.method1107(false);
                if (class497.field7028 != null) {
                    class585 var145 = (class585) class497.field7028.method3248((long) (var141 | var139 << 14 | class380.field5308 << 28), 0);
                    if (var145 != null) {
                        for (class11 var146 = (class11) var145.field8118.method3111(97); var146 != null; var146 = (class11) var145.field8118.method3116(-71)) {
                            if ((var142 & 0x7FFF) == var146.field127 && var146.field122 == var143) {
                                var146.method3426((byte) -104);
                                var146.field122 = var144;
                                class137.method856(var146, arg1 ^ 0x8679, var141, class380.field5308, var139);
                                break;
                            }
                        }
                        if (var140 >= 0 && var138 >= 0 && class613.field8591 > var140 && class1.field3 > var138) {
                            class203.method1261(class380.field5308, var138, var140, (byte) 30);
                        }
                    }
                }
            } else if (class573.field8005 == arg0) {
                int var147 = class24.field414.method1153(true);
                int var148 = class24.field414.method1122(18726);
                int var149 = class24.field414.method1117((byte) -73);
                int var150 = (var149 & 0x7) + class198.field2543;
                int var151 = class753.field10509 + var150;
                int var152 = (var149 >> 4 & 0x7) + class515.field7255;
                int var153 = class63.field851 + var152;
                int var154 = class24.field414.method1107(false);
                if (class456.field6387 != var154) {
                    boolean var155 = var152 >= 0 && var150 >= 0 && var152 < class613.field8591 && class1.field3 > var150;
                    if (var155 || class374.method2277(arg1 ^ 0xFFFFFFA3, class506.field7142)) {
                        class137.method856(new class11(var148, var147), arg1 ^ 0x8679, var153, class380.field5308, var151);
                        if (var155) {
                            class203.method1261(class380.field5308, var150, var152, (byte) 30);
                        }
                    }
                }
            } else {
                class486.method2844((byte) -1, "T3 - " + arg0, null);
                class650.method3509(false, (byte) -74);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILufa;)Z")
    public static final boolean method2830(int arg0, class152 arg1) {
        field6894++;
        if (arg0 <= 62) {
            method2832((byte) -102, 58, 126, true, 109, -89, -0.12774774F, 81);
        }
        return arg1 == null ? false : class600.method3306(arg1.field1846 - arg1.field1848, -arg1.field1844 + arg1.field1840, arg1.field1847 - arg1.field1845, (byte) -62, arg1.field1844, arg1.field1848, arg1.field1845);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    private final void method2831(boolean arg0) throws IOException {
        if (this.field6884 != -1L) {
            if (this.field6895 != this.field6884) {
                this.field6892.method762(56, this.field6884);
                this.field6895 = this.field6884;
            }
            this.field6892.method759(-1, this.field6891, 0, this.field6887);
            this.field6895 += this.field6887;
            if (this.field6895 > this.field6881) {
                this.field6881 = this.field6895;
            }
            long var2 = -1L;
            if (this.field6902 <= this.field6884 && ((long) this.field6904 + this.field6902) > this.field6884) {
                var2 = this.field6884;
            } else if (this.field6902 >= this.field6884 && this.field6902 < ((long) this.field6887 + this.field6884)) {
                var2 = this.field6902;
            }
            long var4 = -1L;
            if ((long) this.field6887 + this.field6884 > this.field6902 && this.field6902 + ((long) this.field6904) >= (long) this.field6887 + this.field6884) {
                var4 = this.field6884 + ((long) this.field6887);
            } else if ((this.field6902 + ((long) this.field6904)) > this.field6884 && ((long) this.field6904 + this.field6902) <= ((long) this.field6887 + this.field6884)) {
                var4 = (long) this.field6904 + this.field6902;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class617.method3389(this.field6891, (int) (var2 - this.field6884), this.field6886, (int) (var2 - this.field6902), var6);
            }
            this.field6887 = 0;
            this.field6884 = -1L;
        }
        if (arg0) {
            method2821(-83, null, -51, 34);
        }
        field6897++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIZIIFI)[I")
    public static final int[] method2832(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, float arg6, int arg7) {
        field6882++;
        int[] var8 = new int[arg2];
        class703 var9 = new class703();
        var9.field9921 = arg1;
        if (arg0 > -117) {
            return null;
        }
        var9.field9909 = arg7;
        var9.field9913 = (int) (arg6 * 4096.0F);
        var9.field9915 = arg4;
        var9.field9906 = arg3;
        var9.field9916 = arg5;
        var9.method303(-105);
        class101.method679(arg2, 0, 1);
        var9.method3901(0, var8, 105);
        return var8;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JB)V")
    public final void method2833(long arg0, byte arg1) throws IOException {
        field6880++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2827(0));
        }
        int var4 = 97 % ((61 - arg1) / 49);
        this.field6878 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
    public final void method2834(byte[] arg0, int arg1) throws IOException {
        this.method2824(true, 0, arg0, arg0.length);
        field6893++;
        if (arg1 != 4) {
            method2832((byte) 54, -92, 13, true, -9, 125, -1.1854866F, -21);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lis;II)V")
    public class485(class112 arg0, int arg1, int arg2) throws IOException {
        this.field6892 = arg0;
        this.field6889 = this.field6881 = arg0.method757(-1);
        this.field6891 = new byte[arg2];
        this.field6878 = 0L;
        this.field6886 = new byte[arg1];
    }
}
