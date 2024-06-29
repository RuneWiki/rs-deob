import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class563 extends class386 {

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Lwo;")
    public static class690 field8142 = new class690(23, -1);

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "Lsl;")
    public static class425 field8141;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBLun;)V", line = 3)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (~arg0 == -1) {
            super.field5145 = arg2.method2229(255) == 1;
        }
        ++field8140;
        if (arg1 <= 111) {
            field8142 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLwt;Lub;I)V", line = 17)
    public static final void method3294(byte arg0, class282 arg1, class20 arg2, int arg3) {
        ++field8143;
        if (~class244.field3334 > -51) {
            if (arg1 != null && arg1.field3832 != null && ~arg3 > ~arg1.field3832.length && arg1.field3832[arg3] != null) {
                int var4 = arg1.field3832[arg3][0];
                int var5 = var4 >> 8;
                int var6 = var4 >> 5 & 7;
                if (arg1.field3832[arg3].length > 1) {
                    int var7 = (int) (Math.random() * (double) arg1.field3832[arg3].length);
                    if (var7 > 0) {
                        var5 = arg1.field3832[arg3][var7];
                    }
                }
                int var8 = 31 & var4;
                int var9 = 256;
                if (arg1.field3842 != null && arg1.field3841 != null) {
                    var9 = arg1.field3842[arg3] + (int) ((double) (arg1.field3841[arg3] + -arg1.field3842[arg3]) * Math.random());
                }
                if (~var8 == -1) {
                    if (class206.field2472 == arg2) {
                        int var10 = arg1.field3845 == null ? 255 : arg1.field3845[arg3];
                        if (!arg1.field3818) {
                            class6.method38((byte) 115, var5, var10, var9, 0, var6);
                            return;
                        }
                        class188.method1164(var10, 0, var5, -1, false, var9, var6);
                    }
                } else {
                    int var11 = -42 / ((arg0 - -13) / 33);
                    if (~class221.field2851.field4134 != -1) {
                        int var12 = arg2.field530 + -256 >> 9;
                        int var13 = arg2.field531 + -256 >> 9;
                        int var14 = class206.field2472 != arg2 ? (arg2.field532 << 24) + (var12 << 16) + var8 - -(var13 << 8) : 0;
                        class465.field6487[class244.field3334++] = new class68((byte) (arg1.field3818 ? 2 : 1), var5, var6, 0, 255, var14, var9, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(B)V", line = 86)
    public static void method3295(byte arg0) {
        int var1 = -93 / ((-62 - arg0) / 62);
        field8141 = null;
        field8142 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I", line = 97)
    public final int[][] method645(int arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        } else {
            ++field8144;
            int[][] var3 = super.field5148.method1054(arg0, 16257);
            if (super.field5148.field2041) {
                int[] var4 = this.method2212((byte) 107, arg0, 2);
                int[][] var5 = this.method2211(arg0, 0, -108);
                int[][] var6 = this.method2211(arg0, 1, arg1 ^ -105);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class599.field8643 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 != 4096) {
                        if (~var17 != -1) {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        } else {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 181)
    public class563() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I", line = 188)
    public final int[] method359(int arg0, int arg1) {
        ++field8139;
        int var3 = 91 % ((arg1 - 13) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) 109, arg0, 0);
            int[] var6 = this.method2212((byte) -8, arg0, 1);
            int[] var7 = this.method2212((byte) -8, arg0, 2);
            for (int var8 = 0; class599.field8643 > var8; ++var8) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var4[var8] = var5[var8];
                } else if (~var9 != -1) {
                    var4[var8] = (-var9 + 4096) * var6[var8] + var5[var8] * var9 >> 12;
                } else {
                    var4[var8] = var6[var8];
                }
            }
        }
        return var4;
    }
}
