import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class143 {

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lef;")
    private class338 field2054;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Leg;")
    private class70 field2047;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public int field2053;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field2044;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[B")
    public byte[] field2048;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field2045;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Z")
    public static boolean field2050 = false;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "[I")
    public static int[] field2058 = new int[8];

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
    public static boolean field2052 = true;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field2059 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Ldf;")
    public static class275 field2051;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field2056;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[[Lku;")
    private class255[][] field2040;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILba;)V", line = 4)
    public final void method963(int arg0, int arg1, int arg2, class263 arg3) {
        field2042++;
        class462 var5 = (class462) arg3;
        int var6 = var5.field6798 + arg2 + arg0;
        int var7 = var5.field6795 + arg1 + 1;
        int var8 = this.field2053 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field6794;
        int var11 = var5.field6790;
        int var12 = this.field2053 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field2053 * var14;
            var10 -= var14;
            var9 += var11 * var14;
            var6 = 1;
        }
        if (this.field2049 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field2049;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var12 += var16;
            var8 += var16;
            var7 = 1;
            var13 += var16;
            var11 -= var16;
        }
        if (var7 + var11 >= this.field2053) {
            int var17 = var7 + var11 + 1 - this.field2053;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class121.method842(var5.field6793, var12, this.field2048, var13, var8, var10, var9, (byte) -61, var11);
            this.method969(var6, var7, var10, var11, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILba;I)V", line = 82)
    public final void method964(int arg0, int arg1, class263 arg2, int arg3) {
        field2060++;
        class462 var5 = (class462) arg2;
        int var6 = var5.field6795 + arg3 + 1;
        int var7 = var5.field6798 + arg1 + 1;
        int var8 = this.field2053 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6794;
        int var11 = var5.field6790;
        int var12 = this.field2053 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var7 = 1;
            var8 += this.field2053 * var13;
            var10 -= var13;
        }
        int var14 = arg0;
        if (this.field2049 <= var7 + var10) {
            int var15 = var7 + var10 + (1 - this.field2049);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var11 -= var16;
            var14 = arg0 + var16;
            var8 += var16;
            var9 += var16;
            var6 = 1;
        }
        if (this.field2053 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field2053;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class483.method2837(var9, var11, var5.field6793, this.field2048, var8, var10, var12, (byte) 102, var14);
            this.method969(var7, var6, var10, var11, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 153)
    public static void method965(int arg0) {
        field2058 = null;
        field2056 = null;
        field2051 = null;
        if (arg0 != 1) {
            method965(30);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 165)
    public final void method966(int arg0) {
        this.field2040 = new class255[this.field2043][this.field2045];
        field2057++;
        int var2 = 0;
        if (arg0 <= 91) {
            field2051 = null;
        }
        while (this.field2045 > var2) {
            for (int var3 = 0; var3 < this.field2043; var3++) {
                this.field2040[var3][var2] = new class255(this.field2054, this, this.field2047, var3, var2, this.field2044, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lba;IIB)Z", line = 199)
    public final boolean method967(class263 arg0, int arg1, int arg2, byte arg3) {
        field2046++;
        class462 var5 = (class462) arg0;
        int var6 = var5.field6798 + arg2 + 1;
        int var7 = var5.field6795 + arg1 + 1;
        int var8 = this.field2053 * var6 + var7;
        int var9 = var5.field6794;
        int var10 = var5.field6790;
        int var11 = this.field2053 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var8 += this.field2053 * var12;
            var9 -= var12;
        }
        if (arg3 != 0) {
            this.method968(57, -39, -64, null, true, (byte) 91);
        }
        if (this.field2049 <= var6 + var9) {
            int var13 = var6 - (this.field2049 - var9 - 1);
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var11 += var14;
            var8 += var14;
        }
        if ((var7 + var10) >= this.field2053) {
            int var15 = var7 + var10 + 1 - this.field2053;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2053 + var11;
            return class267.method1602(var10, var16, var9, var17, var8, this.field2048, arg3 ^ 0x75EE);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[[ZZB)V", line = 276)
    public final void method968(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, byte arg5) {
        this.field2054.method1937(false, -118);
        field2039++;
        this.field2054.method1985(false, (byte) 94);
        this.field2054.method1944(-2, 12429);
        this.field2054.method1974(1, 4609);
        this.field2054.method1976(-105, 1);
        if (arg5 <= 1) {
            field2051 = null;
        }
        float var7 = 1.0F / (float) (this.field2054.field4747 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field2045; var22++) {
                int var23 = var22 << this.field2044;
                int var24 = var22 + 1 << this.field2044;
                label88: for (int var25 = 0; var25 < this.field2043; var25++) {
                    int var26 = var25 << this.field2044;
                    int var27 = var25 + 1 << this.field2044;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (-arg1 <= var28 - arg2 && (var28 - arg2) <= arg1) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg1) <= (var29 - arg0) && arg1 >= var29 - arg0 && arg3[var28 + arg1 - arg2][var29 + arg1 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2040[var25][var22].method1533(-1);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2045; var8++) {
                int var9 = var8 << this.field2044;
                int var10 = var8 + 1 << this.field2044;
                for (int var11 = 0; var11 < this.field2043; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field2044;
                    int var14 = var11 + 1 << this.field2044;
                    class391 var15 = class194.field2768;
                    var15.field5719 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((-arg1) <= (var16 - arg0) && arg1 >= (var16 - arg0)) {
                            int var17 = this.field2047.field2037 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg2 >= -arg1 && arg1 >= (var18 - arg2) && arg3[var18 + arg1 - arg2][var16 + arg1 - arg0]) {
                                    short[] var19 = this.field2047.field969[var17];
                                    if (var19 != null) {
                                        if (this.field2054.field4772) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method2355(1686288168, var19[var21] & 0xFFFF);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method2310((byte) 91, var19[var20] & 0xFFFF);
                                                var12++;
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field2040[var11][var8].method1530(var15.field5678, var12, 10483, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIB)V", line = 466)
    private final void method969(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2041++;
        if (this.field2040 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        if (arg4 < 97) {
            method965(-77);
        }
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class255[] var11 = this.field2040[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3534 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lef;Leg;)V", line = 506)
    public class143(class338 arg0, class70 arg1) {
        this.field2054 = arg0;
        this.field2047 = arg1;
        this.field2053 = (this.field2047.field2037 * this.field2047.field2030 >> this.field2054.field4744) + 2;
        this.field2049 = (this.field2047.field2031 * this.field2047.field2030 >> this.field2054.field4744) + 2;
        this.field2044 = this.field2054.field4744 + 7 - this.field2047.field2035;
        this.field2048 = new byte[this.field2053 * this.field2049];
        this.field2043 = this.field2047.field2037 >> this.field2044;
        this.field2045 = this.field2047.field2031 >> this.field2044;
    }
}
