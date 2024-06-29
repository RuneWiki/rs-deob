import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class371 extends class354 {

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public int field5548 = 4;

    @OriginalMember(owner = "client!ts", name = "T", descriptor = "Z")
    public boolean field5556 = true;

    @OriginalMember(owner = "client!ts", name = "V", descriptor = "I")
    public int field5558 = 0;

    @OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
    public int field5554 = 4;

    @OriginalMember(owner = "client!ts", name = "W", descriptor = "I")
    public int field5559 = 4;

    @OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
    public int field5551 = 1638;

    @OriginalMember(owner = "client!ts", name = "X", descriptor = "[B")
    private byte[] field5560 = new byte[512];

    @OriginalMember(owner = "client!ts", name = "P", descriptor = "Lvp;")
    public static class123 field5552 = new class123(60, 3);

    @OriginalMember(owner = "client!ts", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field5564 = "";

    @OriginalMember(owner = "client!ts", name = "ab", descriptor = "I")
    public static int field5563 = 0;

    @OriginalMember(owner = "client!ts", name = "Z", descriptor = "Lko;")
    public static class348 field5562 = new class348();

    @OriginalMember(owner = "client!ts", name = "cb", descriptor = "Lmt;")
    public static class271 field5565 = new class271("runescape", 0);

    @OriginalMember(owner = "client!ts", name = "db", descriptor = "I")
    public static int field5566 = -1;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!ts", name = "Q", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!ts", name = "S", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!ts", name = "U", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!ts", name = "Y", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "[S")
    private short[] field5546;

    @OriginalMember(owner = "client!ts", name = "N", descriptor = "[S")
    private short[] field5550;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "[[[J")
    public static long[][][] field5544;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)I", line = 8)
    private final int method2372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5553;
        if (arg3 > -52) {
            return -111;
        } else {
            int var8 = arg2 >> 12;
            int var9 = var8 + 1;
            if (arg6 <= var9) {
                var9 = 0;
            }
            int var10 = var8 & 255;
            int var11 = arg2 & 4095;
            int var12 = arg5 + -4096;
            int var13 = var9 & 255;
            int var14 = var11 + -4096;
            int var15 = class351.field5332[var11];
            int var16 = 3 & this.field5560[arg4 + var10];
            int var17;
            if (var16 <= 1) {
                var17 = var16 != 0 ? arg5 - var11 : arg5 + var11;
            } else {
                var17 = var16 == 2 ? -arg5 + var11 : -arg5 + -var11;
            }
            int var18 = 3 & this.field5560[arg4 + var13];
            int var19;
            if (~var18 < -2) {
                var19 = ~var18 == -3 ? -arg5 + var14 : -arg5 + -var14;
            } else {
                var19 = var18 != 0 ? -var14 + arg5 : arg5 + var14;
            }
            int var20 = ((-var17 + var19) * var15 >> 12) + var17;
            int var21 = 3 & this.field5560[var10 - -arg0];
            int var22;
            if (var21 > 1) {
                var22 = ~var21 == -3 ? -var12 + var11 : -var11 + -var12;
            } else {
                var22 = ~var21 == -1 ? var11 + var12 : var12 - var11;
            }
            int var23 = this.field5560[var13 - -arg0] & 3;
            int var24;
            if (~var23 >= -2) {
                var24 = var23 != 0 ? -var14 + var12 : var12 + var14;
            } else {
                var24 = ~var23 != -3 ? -var12 + -var14 : -var12 + var14;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return ((-var20 + var25) * arg1 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V", line = 83)
    public static void method2373(int arg0) {
        field5544 = null;
        field5552 = null;
        field5564 = null;
        field5565 = null;
        field5562 = null;
        if (arg0 <= 76) {
            method2373(-109);
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V", line = 101)
    public class371() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)V", line = 104)
    private final void method2374(byte arg0) {
        if (arg0 == -6) {
            ++field5545;
            if (~this.field5551 >= -1) {
                if (this.field5546 != null && this.field5546.length == this.field5548) {
                    this.field5550 = new short[this.field5548];
                    for (int var2 = 0; ~this.field5548 < ~var2; ++var2) {
                        this.field5550[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                    return;
                }
            } else {
                this.field5550 = new short[this.field5548];
                this.field5546 = new short[this.field5548];
                for (int var3 = 0; var3 < this.field5548; ++var3) {
                    this.field5546[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5551 / 4096.0F), (double) var3)));
                    this.field5550[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(B)V", line = 151)
    public static final void method2375(byte arg0) {
        ++field5555;
        int[] var1 = new int[class8.field111.field7658];
        int var2 = 0;
        for (int var3 = 0; class8.field111.field7658 > var3; ++var3) {
            class172 var5 = class8.field111.method3077(-126, var3);
            if (~var5.field2560 <= -1 || ~var5.field2603 <= -1) {
                var1[var2++] = var3;
            }
        }
        class519.field7623 = new int[var2];
        if (arg0 <= -27) {
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                class519.field7623[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V", line = 189)
    public final void method771(boolean arg0) {
        this.field5560 = class173.method1234(this.field5558, (byte) -127);
        ++field5549;
        this.method2374((byte) -6);
        if (arg0) {
            this.method253(-30, (byte) -29);
        }
        for (int var2 = this.field5548 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field5546[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field5548;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILti;I)V", line = 222)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field5557;
        if (arg0 != 15180) {
            this.field5554 = 33;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field5548 = arg1.method1918((byte) -90);
            } else {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field5554 = this.field5559 = arg1.method1918((byte) -87);
                        return;
                    }
                    if (~arg2 == -5) {
                        this.field5558 = arg1.method1918((byte) -91);
                        return;
                    }
                    if (~arg2 == -6) {
                        this.field5554 = arg1.method1918((byte) 103);
                        return;
                    }
                    if (arg2 == 6) {
                        this.field5559 = arg1.method1918((byte) -51);
                        return;
                    }
                } else {
                    this.field5551 = arg1.method1901(120);
                    if (~this.field5551 > -1) {
                        this.field5546 = new short[this.field5548];
                        for (int var5 = 0; ~var5 > ~this.field5548; ++var5) {
                            this.field5546[var5] = (short) arg1.method1901(arg0 + -15060);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field5556 = ~arg1.method1918((byte) -46) == -2;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[II)V", line = 316)
    public final void method2376(int arg0, int[] arg1, int arg2) {
        ++field5547;
        int var4 = class278.field4009[arg2] * this.field5559;
        if (arg0 >= -79) {
            method2373(26);
        }
        if (~this.field5548 == -2) {
            int var5 = this.field5550[0] << 12;
            short var6 = this.field5546[0];
            int var7 = this.field5554 * var5 >> 12;
            int var8 = var4 * var5 >> 12;
            int var9 = this.field5559 * var5 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var9) {
                var11 = 0;
            }
            int var12 = var8 & 4095;
            int var13 = class351.field5332[var12];
            int var14 = this.field5560[var10 & 255] & 255;
            int var15 = 255 & this.field5560[var11 & 255];
            if (!this.field5556) {
                for (int var16 = 0; var16 < class404.field5952; ++var16) {
                    int var17 = class154.field2358[var16] * this.field5554;
                    int var18 = this.method2372(var15, var13, var5 * var17 >> 12, -112, var14, var12, var7);
                    arg1[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class404.field5952 > var19; ++var19) {
                    int var20 = class154.field2358[var19] * this.field5554;
                    int var21 = this.method2372(var15, var13, var5 * var20 >> 12, -69, var14, var12, var7);
                    int var22 = var6 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field5546[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field5550[0] << 12;
                int var25 = this.field5559 * var24 >> 12;
                int var26 = this.field5554 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var31 = this.field5560[255 & var28] & 255;
                int var32 = this.field5560[var29 & 255] & 255;
                int var33 = class351.field5332[var30];
                for (int var34 = 0; ~class404.field5952 < ~var34; ++var34) {
                    int var54 = class154.field2358[var34] * this.field5554;
                    int var55 = this.method2372(var32, var33, var24 * var54 >> 12, -125, var31, var30, var26);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field5548; ++var35) {
                short var36 = this.field5546[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field5550[var35] << 12;
                    int var38 = this.field5554 * var37 >> 12;
                    int var39 = this.field5559 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var40 & 4095;
                    if (~var42 <= ~var39) {
                        var42 = 0;
                    }
                    int var44 = this.field5560[255 & var42] & 255;
                    int var45 = class351.field5332[var43];
                    int var46 = this.field5560[255 & var41] & 255;
                    if (this.field5556 && this.field5548 - 1 == var35) {
                        for (int var47 = 0; ~class404.field5952 < ~var47; ++var47) {
                            int var48 = class154.field2358[var47] * this.field5554;
                            int var49 = this.method2372(var44, var45, var37 * var48 >> 12, -100, var46, var43, var38);
                            int var50 = arg1[var47] - -(var36 * var49 >> 12);
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; var51 < class404.field5952; ++var51) {
                            int var52 = class154.field2358[var51] * this.field5554;
                            int var53 = this.method2372(var44, var45, var37 * var52 >> 12, -75, var46, var43, var38);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IB)[I", line = 480)
    public final int[] method253(int arg0, byte arg1) {
        ++field5561;
        if (arg1 != -95) {
            this.method2374((byte) -72);
        }
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            this.method2376(arg1, var3, arg0);
        }
        return var3;
    }
}
