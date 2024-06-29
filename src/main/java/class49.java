import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class49 {

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "Lpg;")
    private class333 field702;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "Lmr;")
    private class163 field707;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "[B")
    public byte[] field701;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Lew;")
    public static class270 field691 = new class270(16);

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field703 = -2;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "[[Lal;")
    private class220[][] field688;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 15)
    public static final void method324(boolean arg0) {
        if (!arg0) {
            field691 = null;
        }
        class97.field1553 = null;
        class533.field7852 = null;
        class38.field573 = null;
        field692++;
        class418.field6058 = null;
        class271.field3684 = null;
        class83.field1271 = null;
        class296.field4001 = null;
        class487.field7055 = null;
        class203.field2934 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([[ZIIIIZ)V", line = 34)
    public final void method325(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field702.method2036(30919, false);
        field687++;
        this.field702.method2025(-32, false);
        if (arg1 <= 78) {
            return;
        }
        this.field702.method1998(-2, (byte) -53);
        this.field702.method1966(-1, 1);
        this.field702.method2033(1, -1743);
        float var7 = 1.0F / (float) (this.field702.field4729 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field696; var8++) {
                int var9 = var8 << this.field704;
                int var10 = var8 + 1 << this.field704;
                label135: for (int var11 = 0; var11 < this.field705; var11++) {
                    int var12 = var11 << this.field704;
                    int var13 = var11 + 1 << this.field704;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg3 >= -arg4 && (var14 - arg3) <= arg4) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg2 >= -arg4 && var15 - arg2 <= arg4 && arg0[arg4 + var14 - arg3][var15 + arg4 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field688[var11][var8].method1376((byte) 110);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field696; var16++) {
                int var17 = var16 << this.field704;
                int var18 = var16 + 1 << this.field704;
                for (int var19 = 0; var19 < this.field705; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field704;
                    int var22 = var19 + 1 << this.field704;
                    class504 var23 = this.field702.field4789;
                    var23.field4360 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg2 >= -arg4 && (var24 - arg2) <= arg4) {
                            int var25 = this.field707.field125 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg4 <= var26 - arg3 && var26 - arg3 <= arg4 && arg0[arg4 + var26 - arg3][var24 + arg4 - arg2]) {
                                    short[] var27 = this.field707.field2445[var25];
                                    if (var27 != null) {
                                        if (this.field702.field4796) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method1857(561746448, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method1829(0, var27[var28] & 0xFFFF);
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
                        this.field688[var19][var16].method1378(var23.field4336, 5123, var20, 0);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILi;ZI)V", line = 221)
    public final void method326(int arg0, class197 arg1, boolean arg2, int arg3) {
        field690++;
        class74 var5 = (class74) arg1;
        int var6 = var5.field1053 + arg0 + 1;
        int var7 = var5.field1044 + arg3 + 1;
        int var8 = var7 + (this.field686 * var6);
        int var9 = 0;
        int var10 = var5.field1042;
        if (arg2) {
            this.field696 = -78;
        }
        int var11 = var5.field1052;
        int var12 = this.field686 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += this.field686 * var14;
            var6 = 1;
            var9 += var11 * var14;
        }
        if (var6 + var10 >= this.field689) {
            int var15 = var6 + var10 + 1 - this.field689;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var9 += var16;
            var7 = 1;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field686 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field686;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class345.method2081(var8, var5.field1054, var9, var10, var12, arg2, var13, var11, this.field701);
            this.method330(var7, 8, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 299)
    public final void method327(int arg0) {
        this.field688 = new class220[this.field705][this.field696];
        field694++;
        if (arg0 != 30971) {
            method324(false);
        }
        for (int var2 = 0; var2 < this.field696; var2++) {
            for (int var3 = 0; var3 < this.field705; var3++) {
                this.field688[var3][var2] = new class220(this.field702, this, this.field707, var3, var2, this.field704, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILi;B)V", line = 327)
    public final void method328(int arg0, int arg1, class197 arg2, byte arg3) {
        field699++;
        class74 var5 = (class74) arg2;
        int var6 = var5.field1053 + arg0 + 1;
        int var7 = var5.field1044 + arg1 + 1;
        int var8 = var7 + (this.field686 * var6);
        int var9 = 0;
        int var10 = var5.field1042;
        int var11 = var5.field1052;
        int var12 = this.field686 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var8 += this.field686 * var13;
            var9 += var11 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field689 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field689;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var7 = 1;
            var14 += var16;
        }
        if (this.field686 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field686;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        if (arg3 < 122) {
            this.field707 = null;
        }
        class320.method1903(var12, var14, var8, var9, var11, -61, var5.field1054, this.field701, var10);
        this.method330(var7, 8, var10, var6, var11);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 399)
    public static void method329(int arg0) {
        if (arg0 == 1) {
            field691 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V", line = 417)
    private final void method330(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field697++;
        if (this.field688 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 - (1 - arg4) - 1 >> 7;
        if (arg1 != 8) {
            this.field707 = null;
        }
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 - (1 - arg2) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class220[] var11 = this.field688[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3116 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IILi;B)Z", line = 455)
    public final boolean method331(int arg0, int arg1, class197 arg2, byte arg3) {
        field695++;
        class74 var5 = (class74) arg2;
        int var6 = var5.field1044 + arg1 + 1;
        int var7 = var5.field1053 + arg0 + 1;
        int var8 = this.field686 * var7 + var6;
        int var9 = var5.field1042;
        int var10 = 79 % ((-arg3 - 8) / 35);
        int var11 = var5.field1052;
        int var12 = this.field686 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 -= var13;
            var8 += this.field686 * var13;
        }
        if (this.field689 <= var7 + var9) {
            int var14 = var7 + var9 + 1 - this.field689;
            var9 -= var14;
        }
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var11 -= var15;
            var8 += var15;
            var6 = 1;
            var12 += var15;
        }
        if (this.field686 <= var6 + var11) {
            int var16 = var6 + 1 - (this.field686 - var11);
            var12 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var9 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field686 + var12;
            return class440.method2603(var8, var17, var11, var9, var18, 124, this.field701);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lpg;Lmr;)V", line = 527)
    public class49(class333 arg0, class163 arg1) {
        this.field702 = arg0;
        this.field707 = arg1;
        this.field686 = (this.field707.field125 * this.field707.field121 >> this.field702.field4728) + 2;
        this.field689 = (this.field707.field124 * this.field707.field121 >> this.field702.field4728) + 2;
        this.field701 = new byte[this.field689 * this.field686];
        this.field704 = this.field702.field4728 + 7 - this.field707.field126;
        this.field705 = this.field707.field125 >> this.field704;
        this.field696 = this.field707.field124 >> this.field704;
    }
}
