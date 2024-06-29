import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class297 extends class227 {

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    private int field4580;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    private int field4587;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    private int field4591;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field4577 = 0;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "[C")
    public static char[] field4586 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "[I")
    public static int[] field4596 = new int[14];

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Lla;")
    public static class193 field4594 = class227.method1611((byte) 92);

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    private int field4585;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "[B")
    private byte[] field4590;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V", line = 7)
    public static final void method2013(byte arg0) {
        field4575++;
        class241.field3846.method2174(-10385);
        class268.field4178.method2174(-10385);
        int var1 = 112 % ((arg0 - 1) / 63);
        class281.field4342.method2174(-10385);
        class294.field4553.method2174(-10385);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Z", line = 31)
    public static final boolean method2014(int arg0) {
        if (arg0 != -21525) {
            field4594 = (class193) null;
        }
        field4593++;
        class307 var1 = class141.field2180;
        synchronized (class141.field2180) {
            if (class19.field258 == class1.field17) {
                return false;
            } else {
                class323.field5038 = class226.field3591[class19.field258];
                class181.field2730 = class184.field2769[class19.field258];
                class19.field258 = class19.field258 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIII)V", line = 53)
    public static final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -106 % ((arg1 + 49) / 32);
        field4581++;
        if (arg3 < 1 || arg0 < 1 || arg3 > 102 || arg0 > 102) {
            return;
        }
        if (!class19.method150(-102) && (class92.field1468[0][arg3][arg0] & 0x2) == 0) {
            int var9 = arg2;
            if ((class92.field1468[arg2][arg3][arg0] & 0x8) != 0) {
                var9 = 0;
            }
            if (class276.field4262 != var9) {
                return;
            }
        }
        int var10 = arg2;
        if (arg2 < 3 && (class92.field1468[1][arg3][arg0] & 0x2) == 2) {
            var10 = arg2 + 1;
        }
        class90.method649(arg6, arg3, arg2, 127, var10, class224.field3570[arg2], arg0);
        if (arg5 >= 0) {
            boolean var11 = class260.field4071;
            class260.field4071 = true;
            class257.method1764(false, arg3, -28552, false, class224.field3570[arg2], arg5, arg0, arg7, arg2, arg4, var10);
            class260.field4071 = var11;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIIFFF)V", line = 100)
    public class297(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4580 = (int) (arg6 * 4096.0F);
        this.field4595 = (int) (arg7 * 4096.0F);
        this.field4591 = this.field4587 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[[FIIIFI[[FZ[[ILfm;[[FBI[[IIII)I", line = 115)
    public static final int method2016(int arg0, float[][] arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float[][] arg7, boolean arg8, int[][] arg9, class127 arg10, float[][] arg11, byte arg12, int arg13, int[][] arg14, int arg15, int arg16, int arg17) {
        field4579++;
        if (arg13 == 1) {
            int var18 = arg2;
            arg2 = arg6;
            arg6 = 128 - var18;
        } else if (arg13 == 2) {
            arg2 = 128 - arg2;
            arg6 = 128 - arg6;
        } else if (arg13 == 3) {
            int var19 = arg2;
            arg2 = 128 - arg6;
            arg6 = var19;
        }
        if (arg12 >= -57) {
            return -43;
        }
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg2 == 0 && arg6 == 0) {
            var20 = arg15;
            var21 = arg11[arg16][arg3];
            var22 = arg7[arg16][arg3];
            var23 = arg1[arg16][arg3];
        } else if (arg2 == 128 && arg6 == 0) {
            var21 = arg11[arg16 + 1][arg3];
            var23 = arg1[arg16 + 1][arg3];
            var22 = arg7[arg16 + 1][arg3];
            var20 = arg17;
        } else if (arg2 == 128 && arg6 == 128) {
            var22 = arg7[arg16 + 1][arg3 + 1];
            var23 = arg1[arg16 + 1][arg3 + 1];
            var21 = arg11[arg16 + 1][arg3 + 1];
            var20 = arg0;
        } else if (arg2 == 0 && arg6 == 128) {
            var23 = arg1[arg16][arg3 + 1];
            var21 = arg11[arg16][arg3 + 1];
            var22 = arg7[arg16][arg3 + 1];
            var20 = arg4;
        } else {
            float var24 = arg7[arg16][arg3];
            float var25 = arg11[arg16][arg3];
            float var26 = (float) arg6 / 128.0F;
            float var27 = (float) arg2 / 128.0F;
            float var28 = (arg7[arg16 + 1][arg3] - var24) * var27 + var24;
            float var29 = arg1[arg16][arg3];
            float var30 = (arg1[arg16 + 1][arg3] - var29) * var27 + var29;
            float var31 = (arg11[arg16 + 1][arg3] - var25) * var27 + var25;
            float var32 = arg7[arg16][arg3 + 1];
            float var33 = (arg7[arg16 + 1][arg3 + 1] - var32) * var27 + var32;
            var22 = (var33 - var28) * var26 + var28;
            float var34 = arg1[arg16][arg3 + 1];
            float var35 = arg11[arg16][arg3 + 1];
            float var36 = (arg11[arg16 + 1][arg3 + 1] - var35) * var27 + var35;
            float var37 = (arg1[arg16 + 1][arg3 + 1] - var34) * var27 + var34;
            var23 = (var37 - var30) * var26 + var30;
            int var38 = class41.method332(arg15, arg17, arg2, 122);
            var21 = (var36 - var31) * var26 + var31;
            int var39 = class41.method332(arg4, arg0, arg2, 80);
            var20 = class41.method332(var38, var39, arg6, 123);
        }
        int var40 = (arg16 << 7) + arg2;
        int var41 = (arg3 << 7) + arg6;
        int var42 = class158.method1072(arg3, arg6, arg2, arg16, true, arg14);
        return arg10.method921(var40, var42, var41, var22, var21, var23, arg8 ? var20 & 0xFFFFFF00 : var20, arg9 == null ? 0.0F : (float) (var42 - class158.method1072(arg3, arg6, arg2, arg16, true, arg9)) / arg5);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 228)
    public final void method136(int arg0) {
        this.field4585 >>= 0x4;
        field4588++;
        this.field4591 = this.field4587;
        if (this.field4585 < 0) {
            this.field4585 = 0;
        } else if (this.field4585 > 255) {
            this.field4585 = 255;
        }
        this.method665(this.field4576++, (byte) this.field4585);
        if (arg0 == -26370) {
            this.field4585 = 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V", line = 253)
    public final void method134(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field4584 = this.field4580 - (arg2 >= 0 ? arg2 : -arg2);
            this.field4584 = this.field4584 * this.field4584 >> 12;
            this.field4585 = this.field4584;
            this.field4592 = 4096;
        } else {
            this.field4592 = this.field4595 * this.field4584 >> 12;
            this.field4584 = this.field4580 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field4592 < 0) {
                this.field4592 = 0;
            } else if (this.field4592 > 4096) {
                this.field4592 = 4096;
            }
            this.field4584 = this.field4584 * this.field4584 >> 12;
            this.field4584 = this.field4592 * this.field4584 >> 12;
            this.field4585 += this.field4591 * this.field4584 >> 12;
            this.field4591 = this.field4591 * this.field4587 >> 12;
        }
        if (arg1 < 44) {
            field4596 = (int[]) null;
        }
        field4583++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V", line = 287)
    public void method665(int arg0, byte arg1) {
        this.field4590[arg0] = arg1;
        field4578++;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(B)V", line = 295)
    public static void method2017(byte arg0) {
        field4594 = null;
        if (arg0 != 122) {
            method2015(-18, 97, 101, -123, -13, 15, -32, -30);
        }
        field4596 = null;
        field4586 = null;
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(B)V", line = 308)
    public static final void method2018(byte arg0) {
        if (arg0 != 117) {
            field4577 = -22;
        }
        field4589++;
        class106.field1639++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 331)
    public final void method131(int arg0) {
        this.field4576 = 0;
        field4582++;
        this.field4585 = 0;
        int var2 = 64 % ((79 - arg0) / 35);
    }
}
