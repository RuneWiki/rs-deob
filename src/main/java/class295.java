import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class295 extends class177 {

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public int field4632 = 0;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "[B")
    private byte[] field4633 = new byte[512];

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Z")
    public boolean field4630 = true;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public int field4636 = 1638;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public int field4644 = 4;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public int field4643 = 4;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public int field4645 = 4;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field4646 = 0;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "[S")
    private short[] field4635;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "[S")
    private short[] field4637;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lhb;II)V", line = 23)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4630 = arg0.method273(65280) == 1;
        } else if (arg2 == 1) {
            this.field4644 = arg0.method273(65280);
        } else if (arg2 == 2) {
            this.field4636 = arg0.method260((byte) -104);
            if (this.field4636 < 0) {
                this.field4635 = new short[this.field4644];
                for (int var5 = 0; var5 < this.field4644; var5++) {
                    this.field4635[var5] = (short) arg0.method260((byte) 103);
                }
            }
        } else if (arg2 == 3) {
            this.field4643 = this.field4645 = arg0.method273(arg1 ^ 0xFFFF4673);
        } else if (arg2 == 4) {
            this.field4632 = arg0.method273(arg1 + 83341);
        } else if (arg2 == 5) {
            this.field4643 = arg0.method273(arg1 + 83341);
        } else if (arg2 == 6) {
            this.field4645 = arg0.method273(65280);
        }
        field4638++;
        if (arg1 != -18061) {
            method2082(-124);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([III)V", line = 98)
    public final void method2081(int[] arg0, int arg1, int arg2) {
        field4631++;
        int var4 = class260.field3858[arg1] * this.field4645;
        if (arg2 != -30427) {
            this.method2081((int[]) null, -114, -6);
        }
        if (this.field4644 == 1) {
            short var38 = this.field4635[0];
            int var39 = this.field4637[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = var40 >> 12;
            int var42 = this.field4633[var41 & 0xFF] & 0xFF;
            int var43 = this.field4643 * var39 >> 12;
            int var44 = var40 & 0xFFF;
            int var45 = class321.field4992[var44];
            int var46 = this.field4645 * var39 >> 12;
            int var47 = var41 + 1;
            if (var46 <= var47) {
                var47 = 0;
            }
            int var48 = this.field4633[var47 & 0xFF] & 0xFF;
            if (this.field4630) {
                for (int var52 = 0; var52 < class287.field4415; var52++) {
                    int var53 = class179.field2684[var52] * this.field4643;
                    int var54 = this.method2083((byte) 116, var42, var39 * var53 >> 12, var43, var48, var44, var45);
                    int var55 = var38 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class287.field4415; var49++) {
                    int var50 = class179.field2684[var49] * this.field4643;
                    int var51 = this.method2083((byte) 111, var42, var39 * var50 >> 12, var43, var48, var44, var45);
                    arg0[var49] = var38 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field4635[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field4637[0] << 12;
            int var7 = this.field4643 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field4645 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var9) {
                var11 = 0;
            }
            int var12 = this.field4633[var10 & 0xFF] & 0xFF;
            int var13 = var8 & 0xFFF;
            int var14 = class321.field4992[var13];
            int var15 = this.field4633[var11 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class287.field4415; var16++) {
                int var17 = class179.field2684[var16] * this.field4643;
                int var18 = this.method2083((byte) 127, var12, var6 * var17 >> 12, var7, var15, var13, var14);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field4644; var19++) {
            short var20 = this.field4635[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field4637[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = var22 >> 12;
                int var24 = this.field4633[var23 & 0xFF] & 0xFF;
                int var25 = var22 & 0xFFF;
                int var26 = this.field4643 * var21 >> 12;
                int var27 = this.field4645 * var21 >> 12;
                int var28 = class321.field4992[var25];
                int var29 = var23 + 1;
                if (var27 <= var29) {
                    var29 = 0;
                }
                int var30 = this.field4633[var29 & 0xFF] & 0xFF;
                if (this.field4630 && (this.field4644 - 1) == var19) {
                    for (int var31 = 0; var31 < class287.field4415; var31++) {
                        int var32 = class179.field2684[var31] * this.field4643;
                        int var33 = this.method2083((byte) 96, var24, var21 * var32 >> 12, var26, var30, var25, var28);
                        int var34 = (var20 * var33 >> 12) + arg0[var31];
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class287.field4415; var35++) {
                        int var36 = class179.field2684[var35] * this.field4643;
                        int var37 = this.method2083((byte) 123, var24, var21 * var36 >> 12, var26, var30, var25, var28);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Ltb;", line = 259)
    public static final class220 method2082(int arg0) {
        if (arg0 == 255) {
            field4629++;
            class30.field389 = 0;
            return class179.method1303((byte) 117);
        } else {
            return (class220) null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 273)
    public final void method465(int arg0) {
        int var2 = -126 / ((arg0 + 6) / 43);
        field4639++;
        this.field4633 = class299.method2104(0, this.field4632);
        this.method2084((byte) -92);
        for (int var3 = this.field4644 - 1; var3 >= 1; var3--) {
            short var4 = this.field4635[var3];
            if (var4 > 8 || var4 < -8) {
                break;
            }
            this.field4644--;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[I", line = 300)
    public final int[] method95(int arg0, int arg1) {
        field4641++;
        if (arg0 > -52) {
            return (int[]) null;
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -39);
        if (this.field2652.field3287) {
            this.method2081(var3, arg1, -30427);
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 324)
    public class295() {
        super(0, true);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIIIII)I", line = 334)
    private final int method2083(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - 4096;
        field4642++;
        int var9 = arg2 >> 12;
        int var10 = var9 + 1;
        int var11 = arg2 & 0xFFF;
        if (var10 >= arg3) {
            var10 = 0;
        }
        int var12 = var11 - 4096;
        int var13 = var10 & 0xFF;
        int var14 = class321.field4992[var11];
        int var15 = var9 & 0xFF;
        int var16 = this.field4633[arg1 + var15] & 0x3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? arg5 + var11 : arg5 - var11;
        } else {
            var17 = var16 == 2 ? var11 - arg5 : -var11 - arg5;
        }
        int var18 = this.field4633[arg1 + var13] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var12 - arg5 : -var12 - arg5;
        } else {
            var19 = var18 == 0 ? arg5 + var12 : -var12 + arg5;
        }
        int var20 = this.field4633[arg4 + var15] & 0x3;
        int var21 = ((var19 - var17) * var14 >> 12) + var17;
        int var22;
        if (var20 > 1) {
            var22 = var20 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var22 = var20 == 0 ? var8 + var11 : -var11 + var8;
        }
        int var23 = this.field4633[arg4 + var13] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var12 : -var12 + var8;
        } else {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        }
        if (arg0 < 95) {
            this.method95(-36, -86);
        }
        int var25 = var22 + ((var24 - var22) * var14 >> 12);
        return ((var25 - var21) * arg6 >> 12) + var21;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V", line = 412)
    private final void method2084(byte arg0) {
        if (this.field4636 > 0) {
            this.field4637 = new short[this.field4644];
            this.field4635 = new short[this.field4644];
            for (int var3 = 0; var3 < this.field4644; var3++) {
                this.field4635[var3] = (short) ((int) (Math.pow((double) ((float) this.field4636 / 4096.0F), (double) var3) * 4096.0D));
                this.field4637[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field4635 != null && this.field4635.length == this.field4644) {
            this.field4637 = new short[this.field4644];
            for (int var2 = 0; var2 < this.field4644; var2++) {
                this.field4637[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 > -79) {
            method2085(false, -88);
        }
        field4640++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)I", line = 451)
    public static final int method2085(boolean arg0, int arg1) {
        field4634++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 >= 0) {
            return arg0 ? 0 : -35;
        } else {
            return -1;
        }
    }
}
