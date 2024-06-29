import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class127 {

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lgi;")
    private class583 field2062;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lql;")
    private class627 field2053;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[B")
    public byte[] field2050;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    private int field2061;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field2049 = -1;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[[Lli;")
    private class362[][] field2047;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIBI)V")
    private final void method877(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2055++;
        if (this.field2047 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg1 + arg2 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 - (1 - arg4) - 1 >> 7;
        if (arg3 >= -44) {
            this.field2062 = null;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class362[] var11 = this.field2047[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4848 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lk;III)Z")
    public final boolean method878(class485 arg0, int arg1, int arg2, int arg3) {
        field2059++;
        class302 var5 = (class302) arg0;
        int var6 = var5.field4126 + arg1 + 1;
        if (arg2 != 17707) {
            this.field2047 = null;
        }
        int var7 = var5.field4125 + arg3 + 1;
        int var8 = var7 + (this.field2056 * var6);
        int var9 = var5.field4123;
        int var10 = var5.field4130;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var8 += this.field2056 * var11;
            var6 = 1;
        }
        int var12 = this.field2056 - var10;
        if ((var6 + var9) >= this.field2048) {
            int var13 = var6 + var9 + 1 - this.field2048;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += var14;
            var12 += var14;
            var10 -= var14;
        }
        if (this.field2056 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field2056;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2056 + var12;
            return class190.method1182(this.field2050, var8, 0, var10, var17, var9, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZILk;I)V")
    public final void method879(boolean arg0, int arg1, class485 arg2, int arg3) {
        field2058++;
        class302 var5 = (class302) arg2;
        int var6 = var5.field4125 + arg1 + 1;
        int var7 = var5.field4126 + arg3 + 1;
        int var8 = this.field2056 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4123;
        int var11 = var5.field4130;
        int var12 = this.field2056 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var8 += this.field2056 * var14;
            var9 += var11 * var14;
        }
        if (this.field2048 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field2048;
            var10 -= var15;
        }
        if (!arg0) {
            return;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var8 += var16;
            var6 = 1;
            var13 += var16;
            var11 -= var16;
        }
        if ((var6 + var11) >= this.field2056) {
            int var17 = var6 - this.field2056 - (-var11 + -1);
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class558.method3182(var9, var5.field4132, this.field2050, var13, var8, var11, var12, (byte) 4, var10);
            this.method877(var7, var11, var6, (byte) -118, var10);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[[ZIZII)V")
    public final void method880(int arg0, boolean[][] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field2062.method3330(false, (byte) 36);
        field2052++;
        this.field2062.method3331(false, -25107);
        this.field2062.method3408(-2, (byte) 111);
        this.field2062.method3396((byte) 10, arg5);
        this.field2062.method3348(1, (byte) 67);
        float var7 = 1.0F / (float) (this.field2062.field8200 * 128);
        if (arg3) {
            for (int var22 = 0; var22 < this.field2061; var22++) {
                int var23 = var22 << this.field2057;
                int var24 = var22 + 1 << this.field2057;
                label85: for (int var25 = 0; var25 < this.field2051; var25++) {
                    int var26 = var25 << this.field2057;
                    int var27 = var25 + 1 << this.field2057;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((var28 - arg2) >= (-arg0) && (var28 - arg2) <= arg0) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg0) <= (var29 - arg4) && var29 - arg4 <= arg0 && arg1[var28 + arg0 - arg2][var29 + arg0 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2047[var25][var22].method2171((byte) 19);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2061; var8++) {
                int var9 = var8 << this.field2057;
                int var10 = var8 + 1 << this.field2057;
                for (int var11 = 0; var11 < this.field2051; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field2057;
                    int var14 = var11 + 1 << this.field2057;
                    class541 var15 = this.field2062.field8288;
                    var15.field165 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((var16 - arg4) >= (-arg0) && var16 - arg4 <= arg0) {
                            int var17 = this.field2053.field2505 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg2 >= -arg0 && arg0 >= (var18 - arg2) && arg1[arg0 + var18 - arg2][var16 + arg0 - arg4]) {
                                    short[] var19 = this.field2053.field9156[var17];
                                    if (var19 != null) {
                                        if (this.field2062.field8254) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method84(var19[var21] & 0xFFFF, (byte) -94);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method95(1412209512, var19[var20] & 0xFFFF);
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
                        this.field2047[var11][var8].method2167(var15.field138, 5123, 28750, var12);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILk;II)V")
    public final void method881(int arg0, class485 arg1, int arg2, int arg3) {
        field2060++;
        class302 var5 = (class302) arg1;
        int var6 = var5.field4125 + arg2 + 1;
        int var7 = var5.field4126 + arg3 + 1;
        int var8 = this.field2056 * var7 + var6;
        int var9 = 0;
        if (arg0 != 2) {
            return;
        }
        int var10 = var5.field4123;
        int var11 = var5.field4130;
        int var12 = this.field2056 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += this.field2056 * var14;
            var7 = 1;
            var9 += var11 * var14;
        }
        if ((var7 + var10) >= this.field2048) {
            int var15 = var10 + var7 + 1 - this.field2048;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var13 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var8 += var16;
        }
        if (this.field2056 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field2056;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class309.method1942(var8, (byte) -12, var11, this.field2050, var10, var9, var5.field4132, var13, var12);
            this.method877(var7, var11, var6, (byte) -117, var10);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lgi;Lql;)V")
    public class127(class583 arg0, class627 arg1) {
        this.field2062 = arg0;
        this.field2053 = arg1;
        this.field2056 = (this.field2053.field2505 * this.field2053.field2504 >> this.field2062.field8198) + 2;
        this.field2048 = (this.field2053.field2504 * this.field2053.field2503 >> this.field2062.field8198) + 2;
        this.field2050 = new byte[this.field2056 * this.field2048];
        this.field2057 = this.field2062.field8198 + 7 - this.field2053.field2506;
        this.field2051 = this.field2053.field2505 >> this.field2057;
        this.field2061 = this.field2053.field2503 >> this.field2057;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public final void method882(byte arg0) {
        if (arg0 <= 92) {
            return;
        }
        field2054++;
        this.field2047 = new class362[this.field2051][this.field2061];
        for (int var2 = 0; var2 < this.field2061; var2++) {
            for (int var3 = 0; var3 < this.field2051; var3++) {
                this.field2047[var3][var2] = new class362(this.field2062, this, this.field2053, var3, var2, this.field2057, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }
}
