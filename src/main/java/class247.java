import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class247 extends class215 {

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field4067 = -1;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4066 = "Loaded defaults";

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "Z")
    public static boolean field4076 = false;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field4080 = "";

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Lra;")
    public static class38 field4072;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "[Lvd;")
    public static class19[] field4069;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILwj;)V")
    public static final void method1712(int arg0, class149 arg1) {
        short var2 = 256;
        ++field4078;
        for (int var3 = arg0; var3 < class195.field3112.length; ++var3) {
            class195.field3112[var3] = 0;
        }
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class195.field3112[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; ++var5) {
            for (int var12 = 1; var2 - 1 > var12; ++var12) {
                for (int var14 = 1; ~var14 > -128; ++var14) {
                    int var15 = (var12 << 7) + var14;
                    class132.field2103[var15] = (class195.field3112[var15 + -128] + class195.field3112[var15 + 1] + class195.field3112[var15 + -1] + class195.field3112[var15 + 128]) / 4;
                }
            }
            int[] var13 = class195.field3112;
            class195.field3112 = class132.field2103;
            class132.field2103 = var13;
        }
        if (arg1 != null) {
            int var6 = 0;
            for (int var7 = 0; ~arg1.field2137 < ~var7; ++var7) {
                for (int var8 = 0; ~arg1.field2139 < ~var8; ++var8) {
                    if (~arg1.field2339[var6++] != -1) {
                        int var9 = arg1.field2140 + var8 - -16;
                        int var10 = var7 - -16 - -arg1.field2136;
                        int var11 = (var10 << 7) + var9;
                        class195.field3112[var11] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (~arg1 == -1) {
            super.field3453 = arg2.method584(255) == 1;
        }
        if (arg0 != 1521146348) {
            this.method45(58, 89, (class96) null);
        }
        ++field4079;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        int[][] var3 = super.field3461.method1126(1, arg1);
        ++field4070;
        if (arg0 != -1) {
            return null;
        } else {
            if (super.field3461.field2591) {
                int[] var4 = this.method1503(-1, 2, arg1);
                int[][] var5 = this.method1504(-113, 0, arg1);
                int[][] var6 = this.method1504(-121, 1, arg1);
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                int[] var9 = var3[1];
                int[] var10 = var5[1];
                int[] var11 = var5[0];
                int[] var12 = var6[0];
                int[] var13 = var6[1];
                int[] var14 = var5[2];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class244.field4015 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (var17 == 0) {
                            var7[var16] = var12[var16];
                            var9[var16] = var13[var16];
                            var8[var16] = var15[var16];
                        } else {
                            int var18 = -var17 + 4096;
                            var7[var16] = var11[var16] * var17 + var12[var16] * var18 >> 12;
                            var9[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var14[var16] * var17 + var15[var16] * var18 >> 12;
                        }
                    } else {
                        var7[var16] = var11[var16];
                        var9[var16] = var10[var16];
                        var8[var16] = var14[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class247() {
        super(3, false);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
    public static void method1713(byte arg0) {
        field4080 = null;
        field4072 = null;
        field4066 = null;
        field4069 = null;
        if (arg0 >= -93) {
            method1714(61, -30, -93);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(III)Lwb;")
    public static final class123 method1714(int arg0, int arg1, int arg2) {
        class123 var3 = class61.method358(arg1, -119);
        ++field4065;
        if (~arg0 == arg2) {
            return var3;
        } else {
            return var3 != null && var3.field1748 != null && arg0 < var3.field1748.length ? var3.field1748[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
    public static final void method1715(int arg0) {
        ++field4068;
        class246.field4034.method1701((byte) 45);
        if (arg0 != 1) {
            method1713((byte) 117);
        }
    }

    @OriginalMember(owner = "client!of", name = "h", descriptor = "(I)V")
    public static final void method1716(int arg0) {
        if (arg0 == 256) {
            ++field4077;
            if (class177.field2810 == null || class36.field468 == null) {
                class177.field2810 = new int[256];
                class36.field468 = new int[256];
                for (int var1 = 0; var1 < 256; ++var1) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class177.field2810[var1] = (int) (4096.0D * Math.sin(var2));
                    class36.field468[var1] = (int) (4096.0D * Math.cos(var2));
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field4075;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field3445.method1755(arg0, (byte) 118);
            if (super.field3445.field4163) {
                int[] var4 = this.method1503(-1, 0, arg0);
                int[] var5 = this.method1503(-1, 1, arg0);
                int[] var6 = this.method1503(-1, 2, arg0);
                for (int var7 = 0; var7 < class244.field4015; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            return var3;
        }
    }
}
