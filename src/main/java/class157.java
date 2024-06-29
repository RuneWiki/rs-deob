import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class157 extends class21 {

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public int field2552 = 4;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "Z")
    public boolean field2556 = true;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    public int field2557 = 1638;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "I")
    public int field2560 = 4;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "[B")
    private byte[] field2562 = new byte[512];

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    public int field2561 = 0;

    @OriginalMember(owner = "client!vl", name = "eb", descriptor = "I")
    public int field2566 = 4;

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "Z")
    public static boolean field2563 = false;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "Lab;")
    public static class279 field2550 = new class279(64);

    @OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
    public static int field2565 = -2;

    @OriginalMember(owner = "client!vl", name = "fb", descriptor = "I")
    public static int field2567 = 0;

    @OriginalMember(owner = "client!vl", name = "kb", descriptor = "Z")
    public static boolean field2572 = true;

    @OriginalMember(owner = "client!vl", name = "ib", descriptor = "Lkb;")
    public static class218 field2570 = new class218();

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!vl", name = "gb", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!vl", name = "hb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "Lmf;")
    public static class201 field2554;

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "[S")
    private short[] field2564;

    @OriginalMember(owner = "client!vl", name = "jb", descriptor = "[S")
    private short[] field2571;

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 3)
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)I", line = 8)
    private final int method1015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -28141) {
            return -54;
        }
        field2568++;
        int var8 = arg1 - 4096;
        int var9 = arg2 >> 12;
        int var10 = var9 + 1;
        if (arg5 <= var10) {
            var10 = 0;
        }
        int var11 = arg2 & 0xFFF;
        int var12 = var11 - 4096;
        int var13 = var9 & 0xFF;
        int var14 = class87.field1639[var11];
        int var15 = this.field2562[var13 + arg6] & 0x3;
        int var16 = var10 & 0xFF;
        int var17;
        if (var15 <= 1) {
            var17 = var15 == 0 ? arg1 + var11 : -var11 + arg1;
        } else {
            var17 = var15 == 2 ? var11 - arg1 : -var11 - arg1;
        }
        int var18 = this.field2562[arg6 + var16] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var12 - arg1 : -arg1 + -var12;
        } else {
            var19 = var18 == 0 ? arg1 + var12 : arg1 - var12;
        }
        int var20 = var17 + ((var19 - var17) * var14 >> 12);
        int var21 = this.field2562[arg3 + var13] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var22 = var21 == 0 ? var11 + var8 : -var11 + var8;
        }
        int var23 = this.field2562[arg3 + var16] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        } else {
            var24 = var23 == 0 ? var8 + var12 : -var12 + var8;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return ((var25 - var20) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V", line = 84)
    public final void method183(byte arg0) {
        field2559++;
        this.field2562 = class118.method773(this.field2561, true);
        this.method1016(4096);
        if (arg0 <= 82) {
            return;
        }
        for (int var2 = this.field2560 - 1; var2 >= 1; var2--) {
            short var3 = this.field2564[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field2560--;
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 113)
    private final void method1016(int arg0) {
        if (this.field2557 > 0) {
            this.field2571 = new short[this.field2560];
            this.field2564 = new short[this.field2560];
            for (int var2 = 0; var2 < this.field2560; var2++) {
                this.field2564[var2] = (short) ((int) (Math.pow((double) ((float) this.field2557 / 4096.0F), (double) var2) * 4096.0D));
                this.field2571[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2564 != null && this.field2564.length == this.field2560) {
            this.field2571 = new short[this.field2560];
            for (int var3 = 0; var3 < this.field2560; var3++) {
                this.field2571[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        field2553++;
        if (arg0 != 4096) {
            field2572 = true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILag;)V", line = 163)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            this.method177(-21, 18);
        }
        if (arg1 == 0) {
            this.field2556 = arg2.method1317((byte) -97) == 1;
        } else if (arg1 == 1) {
            this.field2560 = arg2.method1317((byte) -124);
        } else if (arg1 == 2) {
            this.field2557 = arg2.method1356(false);
            if (this.field2557 < 0) {
                this.field2564 = new short[this.field2560];
                for (int var5 = 0; var5 < this.field2560; var5++) {
                    this.field2564[var5] = (short) arg2.method1356(false);
                }
            }
        } else if (arg1 == 3) {
            this.field2552 = this.field2566 = arg2.method1317((byte) -98);
        } else if (arg1 == 4) {
            this.field2561 = arg2.method1317((byte) -97);
        } else if (arg1 == 5) {
            this.field2552 = arg2.method1317((byte) -72);
        } else if (arg1 == 6) {
            this.field2566 = arg2.method1317((byte) -77);
        }
        field2555++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[I", line = 259)
    public final int[] method177(int arg0, int arg1) {
        int var3 = -117 % ((arg0 - 33) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        field2558++;
        if (this.field443.field2637) {
            this.method1018(var4, -29163, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(B)V", line = 281)
    public static void method1017(byte arg0) {
        field2570 = null;
        if (arg0 != 18) {
            method1017((byte) -1);
        }
        field2554 = null;
        field2550 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([III)V", line = 297)
    public final void method1018(int[] arg0, int arg1, int arg2) {
        field2551++;
        if (arg1 != -29163) {
            return;
        }
        int var4 = class330.field5058[arg2] * this.field2566;
        if (this.field2560 == 1) {
            short var38 = this.field2564[0];
            int var39 = this.field2571[0] << 12;
            int var40 = this.field2552 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = var41 >> 12;
            int var43 = this.field2566 * var39 >> 12;
            int var44 = var41 & 0xFFF;
            int var45 = class87.field1639[var44];
            int var46 = var42 + 1;
            int var47 = this.field2562[var42 & 0xFF] & 0xFF;
            if (var46 >= var43) {
                var46 = 0;
            }
            int var48 = this.field2562[var46 & 0xFF] & 0xFF;
            if (this.field2556) {
                for (int var49 = 0; var49 < class294.field4489; var49++) {
                    int var50 = class51.field1027[var49] * this.field2552;
                    int var51 = this.method1015(var45, var44, var39 * var50 >> 12, var48, -28141, var40, var47);
                    int var52 = var38 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class294.field4489; var53++) {
                    int var54 = class51.field1027[var53] * this.field2552;
                    int var55 = this.method1015(var45, var44, var39 * var54 >> 12, var48, arg1 ^ 0x1C06, var40, var47);
                    arg0[var53] = var38 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field2564[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field2571[0] << 12;
            int var7 = this.field2552 * var6 >> 12;
            int var8 = this.field2566 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 0xFFF;
            int var13 = class87.field1639[var12];
            int var14 = this.field2562[var10 & 0xFF] & 0xFF;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var15 = this.field2562[var11 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class294.field4489; var16++) {
                int var17 = class51.field1027[var16] * this.field2552;
                int var18 = this.method1015(var13, var12, var6 * var17 >> 12, var15, -28141, var7, var14);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field2560; var19++) {
            short var20 = this.field2564[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field2571[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = this.field2552 * var21 >> 12;
                int var24 = this.field2566 * var21 >> 12;
                int var25 = var22 >> 12;
                int var26 = this.field2562[var25 & 0xFF] & 0xFF;
                int var27 = var22 & 0xFFF;
                int var28 = class87.field1639[var27];
                int var29 = var25 + 1;
                if (var29 >= var24) {
                    var29 = 0;
                }
                int var30 = this.field2562[var29 & 0xFF] & 0xFF;
                if (this.field2556 && (this.field2560 - 1) == var19) {
                    for (int var31 = 0; var31 < class294.field4489; var31++) {
                        int var32 = class51.field1027[var31] * this.field2552;
                        int var33 = this.method1015(var28, var27, var21 * var32 >> 12, var30, arg1 ^ 0x1C06, var23, var26);
                        int var34 = (var20 * var33 >> 12) + arg0[var31];
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class294.field4489; var35++) {
                        int var36 = class51.field1027[var35] * this.field2552;
                        int var37 = this.method1015(var28, var27, var21 * var36 >> 12, var30, -28141, var23, var26);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }
}
