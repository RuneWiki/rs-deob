import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class468 {

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lus;")
    private class1 field6532;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lih;")
    private class503 field6533;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public int field6530;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    private int field6534;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    private int field6535;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "[B")
    public byte[] field6542;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    private int field6544;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    private int field6546;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Z")
    public static boolean field6529 = false;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Z")
    public static boolean field6547 = false;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "[I")
    public static int[] field6537;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "[[Lfr;")
    private class287[][] field6543;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIII)V")
    private final void method2712(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field6548++;
        if (this.field6543 == null || !arg0) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg3 + arg4 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class287[] var11 = this.field6543[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4194 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Li;IBI)V")
    public final void method2713(class31 arg0, int arg1, byte arg2, int arg3) {
        field6539++;
        if (arg2 >= -112) {
            return;
        }
        class535 var5 = (class535) arg0;
        int var6 = var5.field7833 + arg1 + 1;
        int var7 = var5.field7835 + arg3 + 1;
        int var8 = this.field6530 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7842;
        int var11 = var5.field7844;
        int var12 = this.field6530 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field6530 * var13;
            var9 += var11 * var13;
            var7 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field6534) {
            int var15 = var10 + var7 + 1 - this.field6534;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var14 += var16;
            var11 -= var16;
        }
        if (this.field6530 <= (var6 + var11)) {
            int var17 = var11 + var6 + 1 - this.field6530;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class475.method2742(var11, var12, var14, 17, var5.field7836, var9, var8, this.field6542, var10);
            this.method2712(true, var7, var10, var11, var6);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public final void method2714(boolean arg0) {
        field6540++;
        this.field6543 = new class287[this.field6544][this.field6546];
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field6546; var2++) {
            for (int var3 = 0; var3 < this.field6544; var3++) {
                this.field6543[var3][var2] = new class287(this.field6533, this, this.field6532, var3, var2, this.field6535, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBLi;)Z")
    public final boolean method2715(int arg0, int arg1, byte arg2, class31 arg3) {
        field6541++;
        class535 var5 = (class535) arg3;
        int var6 = var5.field7833 + arg1 + 1;
        int var7 = var5.field7835 + arg0 + 1;
        if (arg2 > -111) {
            field6529 = true;
        }
        int var8 = var6 + (this.field6530 * var7);
        int var9 = var5.field7842;
        int var10 = var5.field7844;
        int var11 = this.field6530 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var8 += this.field6530 * var12;
            var9 -= var12;
        }
        if ((var7 + var9) >= this.field6534) {
            int var13 = var7 + var9 + 1 - this.field6534;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var6 = 1;
            var11 += var14;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field6530) {
            int var15 = var6 + var10 + 1 - this.field6530;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6530 + var11;
            return class74.method546(var16, var9, var10, false, var8, var17, this.field6542);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([[ZBIIIZ)V")
    public final void method2716(boolean[][] arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 != -91) {
            method2719(16);
        }
        this.field6533.method2962(1, false);
        field6536++;
        this.field6533.method2933(false, false);
        this.field6533.method2995(-2, (byte) -127);
        this.field6533.method2999(1, 77);
        this.field6533.method2967(1, arg1 + 163);
        float var7 = 1.0F / (float) (this.field6533.field7314 * 128);
        if (arg5) {
            for (int var22 = 0; var22 < this.field6546; var22++) {
                int var23 = var22 << this.field6535;
                int var24 = var22 + 1 << this.field6535;
                label88: for (int var25 = 0; var25 < this.field6544; var25++) {
                    int var26 = var25 << this.field6535;
                    int var27 = var25 + 1 << this.field6535;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg4) <= (var28 - arg3) && arg4 >= var28 - arg3) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg2 >= -arg4 && arg4 >= var29 - arg2 && arg0[var28 + arg4 - arg3][var29 + arg4 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6543[var25][var22].method1775((byte) -110);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field6546; var8++) {
                int var9 = var8 << this.field6535;
                int var10 = var8 + 1 << this.field6535;
                for (int var11 = 0; var11 < this.field6544; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field6535;
                    int var14 = var11 + 1 << this.field6535;
                    class141 var15 = this.field6533.field7451;
                    var15.field5665 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg2 >= -arg4 && arg4 >= (var16 - arg2)) {
                            int var17 = this.field6532.field411 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg3 >= -arg4 && (var18 - arg3) <= arg4 && arg0[var18 + arg4 - arg3][var16 + arg4 - arg2]) {
                                    short[] var19 = this.field6532.field24[var17];
                                    if (var19 != null) {
                                        if (this.field6533.field7340) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method2372(var19[var21] & 0xFFFF, arg1 - 34);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method2378(arg1 ^ 0x6A61AD0D, var19[var20] & 0xFFFF);
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
                        this.field6543[var11][var8].method1772(var15.field5663, var12, 5123, -1);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Li;III)V")
    public final void method2717(class31 arg0, int arg1, int arg2, int arg3) {
        field6538++;
        class535 var5 = (class535) arg0;
        int var6 = var5.field7833 + arg2 + 1;
        int var7 = var5.field7835 + arg1 + 1;
        int var8 = this.field6530 * var7 + var6;
        if (arg3 != -8669) {
            return;
        }
        int var9 = 0;
        int var10 = var5.field7842;
        int var11 = var5.field7844;
        int var12 = this.field6530 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field6530 * var14;
        }
        if ((var7 + var10) >= this.field6534) {
            int var15 = var10 + var7 + 1 - this.field6534;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var13 += var16;
            var6 = 1;
        }
        if (this.field6530 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field6530;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class458.method2675(var9, var10, var11, this.field6542, var12, var8, var13, -117, var5.field7836);
            this.method2712(true, var7, var10, var11, var6);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBII)V")
    public static final void method2718(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class30.field357.field5665 = 0;
        field6545++;
        class30.field357.method2376((byte) 122, class215.field3110.field7739);
        class30.field357.method2376((byte) 122, arg4);
        class30.field357.method2376((byte) 122, arg3);
        class30.field357.method2372(arg0, -126);
        if (arg2 != -66) {
            method2718(9, 1, (byte) 111, 38, 13);
        }
        class30.field357.method2372(arg1, arg2 ^ 0x3E);
        class269.field3925 = 0;
        class170.field2473 = 1;
        class319.field4622 = -3;
        class526.field7740 = 0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method2719(int arg0) {
        field6537 = null;
        if (arg0 != 0) {
            field6547 = true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lih;Lus;)V")
    public class468(class503 arg0, class1 arg1) {
        this.field6532 = arg1;
        this.field6533 = arg0;
        this.field6530 = (this.field6532.field416 * this.field6532.field411 >> this.field6533.field7311) + 2;
        this.field6534 = (this.field6532.field416 * this.field6532.field413 >> this.field6533.field7311) + 2;
        this.field6535 = this.field6533.field7311 + 7 - this.field6532.field414;
        this.field6542 = new byte[this.field6534 * this.field6530];
        this.field6544 = this.field6532.field411 >> this.field6535;
        this.field6546 = this.field6532.field413 >> this.field6535;
    }
}
