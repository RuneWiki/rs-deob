import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class288 extends class215 {

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Z")
    private boolean field4591 = true;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Z")
    private boolean field4592 = true;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "[I")
    public static int[] field4593 = new int[32];

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "Laf;")
    public static class167 field4596 = class163.method1131(255);

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field4599 = 0;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "[Lrb;")
    public static class135[] field4590;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field4600;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3453 = arg2.method584(arg0 + -1521146093) == 1;
                }
            } else {
                this.field4592 = arg2.method584(255) == 1;
            }
        } else {
            this.field4591 = ~arg2.method584(255) == -2;
        }
        if (arg0 != 1521146348) {
            field4597 = 88;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method46(-77, -11);
        }
        ++field4598;
        int[] var3 = super.field3445.method1755(arg0, (byte) 120);
        if (super.field3445.field4163) {
            int[] var4 = this.method1503(arg1 + -256, 0, this.field4592 ? -arg0 + class83.field1026 : arg0);
            if (this.field4591) {
                for (int var5 = 0; ~class244.field4015 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class118.field1673];
                }
            } else {
                class72.method407(var4, 0, var3, 0, class244.field4015);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)I")
    public static final int method1938(boolean arg0, int arg1) {
        ++field4594;
        double var2 = (double) ((16760483 & arg1) >> 16) / 256.0D;
        double var4 = (double) (arg1 & 255) / 256.0D;
        double var6 = (double) ((65527 & arg1) >> 8) / 256.0D;
        double var8 = var2;
        if (var6 < var2) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var6) {
            var10 = var6;
        }
        if (var4 < var8) {
            var8 = var4;
        }
        double var12 = 0.0D;
        if (var4 > var10) {
            var10 = var4;
        }
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        if (!arg0) {
            field4599 = -99;
        }
        if (var8 != var10) {
            if (var2 != var10) {
                if (var6 == var10) {
                    var16 = (var4 - var2) / (var10 - var8) + 2.0D;
                } else if (var4 == var10) {
                    var16 = (var2 - var6) / (-var8 + var10) + 4.0D;
                }
            } else {
                var16 = (-var4 + var6) / (var10 - var8);
            }
            if (var14 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var14 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var16 / 6.0D;
        int var20 = (int) (var12 * 256.0D);
        if (~var20 <= -1) {
            if (~var20 < -256) {
                var20 = 255;
            }
        } else {
            var20 = 0;
        }
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (~var22 >= -244) {
            if (var22 > 217) {
                var20 >>= 3;
            } else if (var22 <= 192) {
                if (~var22 < -180) {
                    var20 >>= 1;
                }
            } else {
                var20 >>= 2;
            }
        } else {
            var20 >>= 4;
        }
        return (var21 >> 2 << 10) + (var22 >> 1) - -(var20 >> 5 << 7);
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(II)I")
    public static int method1939(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Leh;ILjava/lang/String;)Ljj;")
    public static final class40 method1940(class137 arg0, int arg1, String arg2) {
        ++field4588;
        int var3 = arg0.method929((byte) 127, arg2);
        if (~var3 == 0) {
            return new class40(0);
        } else {
            int[] var4 = arg0.method942(var3, true);
            if (arg1 != 0) {
                return null;
            } else {
                class40 var5 = new class40(var4.length);
                for (int var6 = 0; ~var6 > ~var5.field497; ++var6) {
                    class96 var7 = new class96(arg0.method928(var3, (byte) 113, var4[var6]));
                    var5.field492[var6] = var7.method588(false);
                    var5.field499[var6] = var7.method587(37);
                    var5.field494[var6] = var7.method597(-1197332568);
                    var5.field491[var6] = var7.method597(-1197332568);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
    public static void method1941(byte arg0) {
        if (arg0 > -41) {
            field4596 = null;
        }
        field4593 = null;
        field4590 = null;
        field4596 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class288() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field4589;
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(-103, 0, this.field4592 ? -arg1 + class83.field1026 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (!this.field4591) {
                for (int var11 = 0; class244.field4015 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var10[var11] = var6[var11];
                    var9[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class244.field4015 < ~var12; ++var12) {
                    var8[var12] = var5[class118.field1673 - var12];
                    var10[var12] = var6[-var12 + class118.field1673];
                    var9[var12] = var7[class118.field1673 - var12];
                }
            }
        }
        return arg0 != -1 ? null : var3;
    }
}
