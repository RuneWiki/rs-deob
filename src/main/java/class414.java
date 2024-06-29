import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class414 extends class118 {

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    private int field6141 = 3216;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "[I")
    private int[] field6143 = new int[3];

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    private int field6151 = 3216;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    private int field6153 = 4096;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field6149 = -1;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "Lwl;")
    public static class452 field6144 = new class452(68, 7);

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "Lsf;")
    public static class398 field6154 = new class398();

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Z")
    public static boolean field6155 = false;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    public static int field6156 = 0;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field6157 = 0;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
    public static final void method2581(boolean arg0) {
        if (arg0) {
            ++field6140;
            if (class220.method1339(-1)) {
                if (class314.field4766 == null) {
                    class21.method132((byte) 106);
                }
                class314.field4754 = new int[100];
                class62.field788 = new boolean[100];
                class326.field4904 = 0;
                class353.field5221 = new int[100];
                class265.field4049 = new int[100];
                class115.field1524 = true;
                for (int var1 = 0; ~var1 > -101; ++var1) {
                    class353.field5221[var1] = (int) ((double) class221.field3368 * Math.random());
                    class314.field4754[var1] = (int) (350.0D * Math.random());
                    class265.field4049[var1] = (int) (Math.random() * 102.0D);
                    class62.field788[var1] = Math.random() < 0.5D;
                }
                try {
                    class213.field3204 = class68.field876.getToolkit().getSystemClipboard();
                } catch (Exception var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(III)I")
    public static final int method2582(int arg0, int arg1, int arg2) {
        ++field6147;
        if (arg2 != 0) {
            return 111;
        } else {
            return arg0 != 1 && arg0 != 3 ? class162.field2256[3 & arg1] : class183.field2748[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class414() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field6151 = arg2.method2323(-110);
                }
            } else {
                this.field6141 = arg2.method2323(arg1 ^ -26);
            }
        } else {
            this.field6153 = arg2.method2323(arg1 ^ -85);
        }
        if (arg1 != 1) {
            method2586((class85) null, (class261) null, 114, -67, 64, 117);
        }
        ++field6142;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field6139;
        int[] var3 = super.field1537.method2395(arg0 ^ 30962, arg1);
        if (super.field1537.field5756) {
            int var4 = class466.field6857 * this.field6153 >> 12;
            int[] var5 = this.method703(0, arg1 - 1 & class438.field6441, ~arg0);
            int[] var6 = this.method703(0, arg1, -2);
            int[] var7 = this.method703(0, class438.field6441 & arg1 + 1, -2);
            for (int var8 = 0; ~class440.field6474 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class87.field1230] - var6[var8 + 1 & class87.field1230]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class259.field3960[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field6143[1] * var14 >> 12;
                int var18 = this.field6143[2] * var16 >> 12;
                int var19 = this.field6143[0] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        if (arg0 != 1) {
            method2587(68, 56);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static void method2583(int arg0) {
        field6144 = null;
        int var1 = -79 % ((arg0 - 14) / 36);
        field6154 = null;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        if (arg0 >= 103) {
            this.method2584(15376);
            ++field6148;
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    private final void method2584(int arg0) {
        ++field6145;
        double var2 = Math.cos((double) ((float) this.field6151 / 4096.0F));
        this.field6143[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field6141 / 4096.0F)));
        this.field6143[1] = (int) (4096.0D * Math.cos((double) ((float) this.field6141 / 4096.0F)) * var2);
        this.field6143[2] = (int) (Math.sin((double) ((float) this.field6151 / 4096.0F)) * 4096.0D);
        if (arg0 != 15376) {
            field6155 = true;
        }
        int var4 = this.field6143[0] * this.field6143[0] >> 12;
        int var5 = this.field6143[1] * this.field6143[1] >> 12;
        int var6 = this.field6143[2] * this.field6143[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - -var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field6143[0] = (this.field6143[0] << 12) / var7;
            this.field6143[2] = (this.field6143[2] << 12) / var7;
            this.field6143[1] = (this.field6143[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(ZI)V")
    public static final void method2585(boolean arg0, int arg1) {
        ++field6146;
        if (!arg0) {
            field6155 = true;
        }
        class32 var2 = class136.method854(2, (byte) 82, arg1);
        var2.method192(-17451);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lfq;Ldr;IIII)V")
    public static final void method2586(class85 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6152;
        class66 var6 = class198.method1181(arg0.field1155, 34);
        if (~var6.field860 != 0) {
            int var8;
            if (arg0.field1199) {
                int var7 = arg0.field1121 + arg3;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            class234 var9 = var6.method453(var8, true, arg1, arg0.field1171);
            if (var9 != null) {
                int var10 = arg0.field1197;
                int var11 = arg0.field1122;
                if (~(var8 & 1) == -2) {
                    var10 = arg0.field1122;
                    var11 = arg0.field1197;
                }
                int var12 = var9.method1226();
                int var13 = var9.method1219();
                if (var6.field854) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                int var14 = -64 / ((arg2 - -9) / 40);
                if (var6.field848 != 0) {
                    var9.method1222(arg5, arg4 - (var11 + -1) * 4, var12, var13, 1, -16777216 | var6.field848, 1);
                } else {
                    var9.method1409(arg5, -((var11 + -1) * 4) + arg4, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)I")
    public static final int method2587(int arg0, int arg1) {
        ++field6150;
        if (arg1 < 88) {
            field6156 = -48;
        }
        return 127 & arg0 >> 11;
    }
}
