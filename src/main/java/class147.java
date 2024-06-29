import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class147 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Leh;")
    private class180 field1945;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "Lgk;")
    private class463 field1947;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    private int field1943;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "[B")
    public byte[] field1953;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    private int field1960;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    private int field1958;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Leo;")
    public static class423 field1944;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "[[Ltb;")
    private class327[][] field1956;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIZ[[Z)V", line = 11)
    public final void method1013(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5) {
        field1950++;
        this.field1947.method2797(false, (byte) -22);
        this.field1947.method2782(-17939, false);
        if (arg2 <= 117) {
            method1017(-38);
        }
        this.field1947.method2755(-2, true);
        this.field1947.method2739(1, 0);
        this.field1947.method2760(1, 126);
        float var7 = 1.0F / (float) (this.field1947.field6693 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field1958; var8++) {
                int var9 = var8 << this.field1943;
                int var10 = var8 + 1 << this.field1943;
                label135: for (int var11 = 0; var11 < this.field1960; var11++) {
                    int var12 = var11 << this.field1943;
                    int var13 = var11 + 1 << this.field1943;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg1 >= -arg0 && (var14 - arg1) <= arg0) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg3 >= -arg0 && arg0 >= var15 - arg3 && arg5[arg0 + var14 - arg1][arg0 + var15 - arg3]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1956[var11][var8].method1949(-91);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field1958; var16++) {
                int var17 = var16 << this.field1943;
                int var18 = var16 + 1 << this.field1943;
                for (int var19 = 0; var19 < this.field1960; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field1943;
                    int var22 = var19 + 1 << this.field1943;
                    class88 var23 = class164.field2129;
                    var23.field1176 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg0) <= (var24 - arg3) && (var24 - arg3) <= arg0) {
                            int var25 = this.field1945.field3197 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg1) >= (-arg0) && arg0 >= (var26 - arg1) && arg5[var26 + arg0 - arg1][var24 + arg0 - arg3]) {
                                    short[] var27 = this.field1945.field2321[var25];
                                    if (var27 != null) {
                                        if (this.field1947.field6759) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method609(var27[var28] & 0xFFFF, -117);
                                                var20++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method564(var27[var29] & 0xFFFF, 595249544);
                                                var20++;
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1956[var19][var16].method1946(5123, var23.field1223, (byte) -60, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V", line = 201)
    private final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1951++;
        if (this.field1956 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg4 + arg2 - arg0 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class327[] var11 = this.field1956[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4203 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)B", line = 238)
    public static final byte method1015(int arg0, int arg1, int arg2) {
        field1957++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == arg0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILj;)V", line = 254)
    public final void method1016(int arg0, int arg1, int arg2, class254 arg3) {
        field1948++;
        class57 var5 = (class57) arg3;
        int var6 = var5.field760 + arg0 + 1;
        int var7 = var5.field770 + arg1 + 1;
        int var8 = this.field1952 * var6 + var7;
        int var9 = arg2;
        int var10 = var5.field763;
        int var11 = var5.field761;
        int var12 = this.field1952 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 = var11 * var14 + arg2;
            var8 += this.field1952 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if (var6 + var10 >= this.field1949) {
            int var15 = var6 + var10 + 1 - this.field1949;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var13 += var16;
            var7 = 1;
            var11 -= var16;
            var9 += var16;
            var12 += var16;
        }
        if (this.field1952 <= var7 + var11) {
            int var17 = var11 + var7 + 1 - this.field1952;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class238.method1510(var8, var11, this.field1953, var9, var5.field769, var10, var12, var13, arg2 + 9643);
            this.method1014(1, var10, var7, var6, var11);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 322)
    public static void method1017(int arg0) {
        field1944 = null;
        if (arg0 != -8339) {
            field1944 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(IIILj;)Z", line = 333)
    public final boolean method1018(int arg0, int arg1, int arg2, class254 arg3) {
        field1954++;
        class57 var5 = (class57) arg3;
        int var6 = var5.field760 + arg2 + 1;
        int var7 = var5.field770 + arg1 + 1;
        int var8 = this.field1952 * var6 + var7;
        int var9 = var5.field763;
        int var10 = var5.field761;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var6 = 1;
            var8 += this.field1952 * var11;
        }
        int var12 = this.field1952 - var10;
        if (var6 + var9 >= this.field1949) {
            int var13 = var6 + var9 + 1 - this.field1949;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var12 += var14;
            var10 -= var14;
        }
        if ((var7 + var10) >= this.field1952) {
            int var15 = var7 + var10 + 1 - this.field1952;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        byte var16 = 8;
        int var17 = (var16 - 1) * this.field1952 + var12;
        if (arg0 != 13681) {
            this.method1014(72, 12, 37, -8, 72);
        }
        return class300.method1802(var8, arg0 - 18399, var17, this.field1953, var9, var10, var16);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILj;I)V", line = 408)
    public final void method1019(int arg0, int arg1, class254 arg2, int arg3) {
        field1961++;
        class57 var5 = (class57) arg2;
        int var6 = var5.field770 + arg3 + 1;
        int var7 = var5.field760 + arg1 + arg0;
        int var8 = var6 + (this.field1952 * var7);
        int var9 = 0;
        int var10 = var5.field763;
        int var11 = var5.field761;
        int var12 = this.field1952 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var8 += this.field1952 * var14;
            var7 = 1;
            var10 -= var14;
        }
        if (this.field1949 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field1949;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var13 += var16;
            var11 -= var16;
            var6 = 1;
            var9 += var16;
            var12 += var16;
            var8 += var16;
        }
        if (var6 + var11 >= this.field1952) {
            int var17 = var11 + var6 + 1 - this.field1952;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class322.method1921(var10, var11, (byte) -14, this.field1953, var13, var9, var12, var5.field769, var8);
            this.method1014(1, var10, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lgk;Leh;)V", line = 476)
    public class147(class463 arg0, class180 arg1) {
        this.field1945 = arg1;
        this.field1947 = arg0;
        this.field1952 = (this.field1945.field3198 * this.field1945.field3197 >> this.field1947.field6689) + 2;
        this.field1949 = (this.field1945.field3198 * this.field1945.field3194 >> this.field1947.field6689) + 2;
        this.field1943 = this.field1947.field6689 + 7 - this.field1945.field3193;
        this.field1953 = new byte[this.field1952 * this.field1949];
        this.field1960 = this.field1945.field3197 >> this.field1943;
        this.field1958 = this.field1945.field3194 >> this.field1943;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 492)
    public final void method1020(byte arg0) {
        this.field1956 = new class327[this.field1960][this.field1958];
        field1946++;
        int var2 = 37 / ((arg0 + 62) / 40);
        for (int var3 = 0; var3 < this.field1958; var3++) {
            for (int var4 = 0; var4 < this.field1960; var4++) {
                this.field1956[var4][var3] = new class327(this.field1947, this, this.field1945, var4, var3, this.field1943, var4 * 128 + 1, var3 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIB)V", line = 519)
    public static final void method1021(int arg0, int arg1, byte arg2) {
        field1959++;
        if (arg2 != 12) {
            field1944 = null;
        }
        class436 var3 = class459.method2712(16, arg0, arg2 - 1759243692);
        var3.method2574((byte) 47);
        var3.field5980 = arg1;
    }
}
