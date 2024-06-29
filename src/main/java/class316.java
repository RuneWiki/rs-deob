import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class316 extends class374 {

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
    private boolean field4880 = false;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
    private boolean field4875;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "[Lui;")
    private class487[] field4888;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lfp;")
    public static class437 field4879 = new class437(0, 2, 2, 1);

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "[I")
    public static int[] field4884 = new int[5];

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "[I")
    public static int[] field4891 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Ldp;")
    public static class347 field4883 = new class347("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lgo;")
    public static class310 field4886;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lce;")
    private class328 field4881;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lok;")
    public static class74 field4882;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lvd;)V")
    public class316(class258 arg0) {
        super(arg0);
        if (arg0.field3810) {
            this.field4875 = ~arg0.field3809 > -4;
            int var2 = this.field4875 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (var14 == 2) {
                                    var15 = var13;
                                } else if (var14 != 3) {
                                    if (~var14 == -5) {
                                        var15 = var11;
                                    } else {
                                        var15 = -var11;
                                    }
                                } else {
                                    var15 = -var13;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field4888 = new class487[3];
            this.field4888[0] = new class487(super.field5646, 6406, 64, false, var4, 6406);
            this.field4888[1] = new class487(super.field5646, 6406, 64, false, var5, 6406);
            this.field4888[2] = new class487(super.field5646, 6406, 64, false, var3, 6406);
            this.method1975(43);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    private final void method1975(int arg0) {
        ++field4885;
        this.field4881 = new class328(super.field5646, 2);
        this.field4881.method2036((byte) -107, 0);
        super.field5646.method1553(1, -8156);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field4875) {
            super.field5646.method1576(260, 7681, (byte) 94);
            super.field5646.method1590(770, 5890, true, 0);
            super.field5646.method1556(770, 34167, 0, 34184);
        } else {
            super.field5646.method1576(7681, 8448, (byte) 91);
            super.field5646.method1590(768, 34168, true, 0);
            super.field5646.method1553(2, -8156);
            super.field5646.method1576(260, 7681, (byte) 126);
            super.field5646.method1590(768, 34168, true, 0);
            super.field5646.method1590(770, 34168, true, 1);
            super.field5646.method1556(770, 34167, 0, 34184);
        }
        super.field5646.method1553(0, -8156);
        this.field4881.method2041((byte) 33);
        this.field4881.method2036((byte) -107, 1);
        super.field5646.method1553(1, -8156);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        int var2 = 108 % ((-32 - arg0) / 56);
        if (!this.field4875) {
            super.field5646.method1576(8448, 8448, (byte) -85);
            super.field5646.method1590(768, 5890, true, 0);
            super.field5646.method1553(2, -8156);
            super.field5646.method1576(8448, 8448, (byte) -85);
            super.field5646.method1590(768, 5890, true, 0);
            super.field5646.method1590(768, 34168, true, 1);
            super.field5646.method1556(770, 5890, 0, 34184);
        } else {
            super.field5646.method1576(8448, 8448, (byte) 71);
            super.field5646.method1590(768, 5890, true, 0);
            super.field5646.method1556(770, 5890, 0, 34184);
        }
        super.field5646.method1553(0, -8156);
        this.field4881.method2041((byte) 33);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (this.field4880) {
            if (!this.field4875) {
                super.field5646.method1553(2, -8156);
                super.field5646.method1546(-2, (class271) null);
            }
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, (class271) null);
            super.field5646.method1553(0, -8156);
            this.field4881.method2035(21, '\u0001');
            this.field4880 = false;
        } else {
            super.field5646.method1556(770, 5890, 0, 34184);
        }
        ++field4887;
        super.field5646.method1576(8448, 8448, (byte) -112);
        if (arg0 <= 74) {
            method1980(-21, 72);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Z")
    public final boolean method21(byte arg0) {
        if (arg0 < 85) {
            this.method18(true, (class271) null, 121);
        }
        ++field4877;
        return true;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public final void method20(int arg0, int arg1, int arg2) {
        if (arg1 == -20857) {
            if (this.field4880) {
                super.field5646.method1553(1, -8156);
                super.field5646.method1546(-2, this.field4888[arg0 + -1]);
                super.field5646.method1553(0, -8156);
            }
            ++field4872;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1976(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return false;
        } else {
            ++field4874;
            return ~(arg1 & 34) != -1;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZ)V")
    public final void method25(boolean arg0, boolean arg1) {
        if (this.field4881 != null && arg0) {
            if (!this.field4875) {
                super.field5646.method1553(2, -8156);
                super.field5646.method1546(-2, super.field5646.field3788);
                super.field5646.method1553(0, -8156);
            }
            this.field4881.method2035(-125, '\u0000');
            this.field4880 = true;
        } else {
            super.field5646.method1556(770, 34168, 0, 34184);
        }
        if (arg1) {
            ++field4890;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIB)I")
    public static final int method1977(int arg0, int arg1, int arg2, byte arg3) {
        ++field4876;
        if (~class507.field7449 > -101) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class137.field2035 + arg2;
            int var7 = -class137.field2036 + arg1;
            for (class219 var8 = (class219) class137.field2025.method2957(-101); var8 != null; var8 = (class219) class137.field2025.method2947(-125)) {
                if (var8.field3137 == arg0) {
                    int var9 = var8.field3134;
                    int var10 = var8.field3132;
                    int var11 = var9 - -class137.field2035 << 14 | var10 - -class137.field2036;
                    int var12 = (-var9 + var6) * (-var9 + var6) - -((var7 - var10) * (-var10 + var7));
                    if (~var4 > -1 || ~var5 < ~var12) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            if (arg3 <= 11) {
                field4883 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method1978(boolean arg0) {
        if (!arg0) {
            method1977(-51, -19, 60, (byte) -73);
        }
        field4879 = null;
        field4883 = null;
        field4884 = null;
        field4886 = null;
        field4882 = null;
        field4891 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
    public static final boolean method1979(int arg0, int arg1, String arg2, boolean arg3) {
        ++field4870;
        if (arg1 >= 2 && ~arg1 >= -37) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg2.length();
            int var8 = 0;
            if (arg0 != 9472) {
                field4883 = null;
            }
            while (~var7 < ~var8) {
                label80: {
                    char var9 = arg2.charAt(var8);
                    if (var8 == 0) {
                        if (~var9 == -46) {
                            var4 = true;
                            break label80;
                        }
                        if (var9 == '+' && arg3) {
                            break label80;
                        }
                    }
                    int var11;
                    if (var9 >= '0' && var9 <= '9') {
                        var11 = var9 - '0';
                    } else if (~var9 <= -66 && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || ~var9 < -123) {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (~var11 <= ~arg1) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg1 * var6 + var11;
                    if (~(var10 / arg1) != ~var6) {
                        return false;
                    }
                    var5 = true;
                    var6 = var10;
                }
                ++var8;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        super.field5646.method1576(8448, 7681, (byte) 112);
        if (arg1 >= -2) {
            field4882 = null;
        }
        ++field4889;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLew;I)V")
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        ++field4878;
        super.field5646.method1546(-2, arg1);
        super.field5646.method1582(arg2, arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
    public static final int method1980(int arg0, int arg1) {
        ++field4871;
        if (arg1 != 0) {
            field4879 = null;
        }
        return arg0 & 255;
    }
}
