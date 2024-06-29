import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class134 {

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lge;")
    private class103 field1721;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Lql;")
    private class346 field1719;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "[B")
    public byte[] field1722;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "[[Lqr;")
    private class15[][] field1725;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBILve;)V", line = 5)
    public final void method724(int arg0, byte arg1, int arg2, class307 arg3) {
        class214 var5 = (class214) arg3;
        int var6 = var5.field2890 + arg0 + 1;
        int var7 = var5.field2891 + arg2 + 1;
        int var8 = this.field1717 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2892;
        int var11 = var5.field2893;
        int var12 = this.field1717 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var9 += var11 * var14;
            var8 += this.field1717 * var14;
            var10 -= var14;
        }
        if (this.field1718 <= (var7 + var10)) {
            int var15 = var7 + 1 - (-var10 + this.field1718);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var13 += var16;
            var8 += var16;
            var6 = 1;
            var11 -= var16;
            var12 += var16;
        }
        if (this.field1717 <= (var6 + var11)) {
            int var17 = var6 + var11 + (1 - this.field1717);
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        method728(var5.field2889, var11, var12, this.field1722, var13, var10, var9, var8, -636441598);
        if (arg1 >= -110) {
            this.field1721 = (class103) null;
        }
        this.method727(var11, var7, var6, (byte) 74, var10);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III[BIIZ)Z", line = 76)
    private static final boolean method725(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg2 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg5 + arg4 - 1) / arg4);
        int var10 = -((arg2 + arg4 - 1) / arg4);
        if (arg6) {
            method725(28, 126, -95, (byte[]) null, 1, -5, false);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg0] == 0) {
                    return true;
                }
                arg0 += arg4;
            }
            int var13 = arg0 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 123)
    public final void method726(int arg0) {
        if (arg0 <= 34) {
            return;
        }
        this.field1725 = new class15[this.field1720][this.field1723];
        for (int var2 = 0; var2 < this.field1723; var2++) {
            for (int var3 = 0; var3 < this.field1720; var3++) {
                this.field1725[var3][var2] = new class15(this.field1719, this, this.field1721, var3, var2, this.field1724, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIBI)V", line = 152)
    private final void method727(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (this.field1725 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg0 - 1 - 1 >> 7;
        if (arg3 < 14) {
            this.field1718 = 93;
        }
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class15[] var11 = this.field1725[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field139 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([BII[BIIIII)V", line = 193)
    private static final void method728(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg3[var10001] += arg0[arg6++];
                int var14 = arg7++;
                arg3[var14] += arg0[arg6++];
                int var15 = arg7++;
                arg3[var15] += arg0[arg6++];
                int var16 = arg7++;
                arg3[var16] += arg0[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg3[var10001] += arg0[arg6++];
            }
            arg7 += arg2;
            arg6 += arg4;
        }
        if (arg8 != -636441598) {
            method725(-19, 107, 84, (byte[]) null, 70, 1, false);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lve;IIB)Z", line = 237)
    public final boolean method729(class307 arg0, int arg1, int arg2, byte arg3) {
        class214 var5 = (class214) arg0;
        int var6 = var5.field2891 + arg1 + 1;
        int var7 = var5.field2890 + arg2 + 1;
        int var8 = this.field1717 * var6 + var7;
        int var9 = var5.field2892;
        int var10 = var5.field2893;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var9 -= var11;
            var8 += this.field1717 * var11;
        }
        int var12 = this.field1717 - var10;
        if (this.field1718 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field1718;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
            var7 = 1;
        }
        if (this.field1717 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field1717;
            var12 += var15;
            var10 -= var15;
        }
        if (arg3 >= -57) {
            this.method726(121);
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1717 + var12;
            return method725(var8, var17, var10, this.field1722, var16, var9, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIZ[[ZI)V", line = 308)
    public final void method730(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, int arg5) {
        opengl var7 = this.field1719.field4697;
        this.field1719.method2068();
        this.field1719.method2094(false);
        this.field1719.method2080(false);
        this.field1719.method2091(-2);
        this.field1719.method2054(arg5);
        this.field1719.method2044(1);
        float var8 = 1.0F / (float) (this.field1719.field4714 * 128);
        if (arg3) {
            for (int var9 = 0; var9 < this.field1723; var9++) {
                int var10 = var9 << this.field1724;
                int var11 = var9 + 1 << this.field1724;
                label130: for (int var12 = 0; var12 < this.field1720; var12++) {
                    int var13 = var12 << this.field1724;
                    int var14 = var12 + 1 << this.field1724;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if (-arg2 <= var15 - arg1 && arg2 >= (var15 - arg1)) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if (var16 - arg0 >= -arg2 && arg2 >= (var16 - arg0) && arg4[var15 + arg2 - arg1][var16 - (arg0 - arg2)]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field1725[var12][var9].method67(17);
                                    continue label130;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1723; var17++) {
                int var18 = var17 << this.field1724;
                int var19 = var17 + 1 << this.field1724;
                for (int var20 = 0; var20 < this.field1720; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field1724;
                    class103.field1246.field3389 = 0;
                    int var23 = var20 + 1 << this.field1724;
                    for (int var24 = var18; var24 < var19; var24++) {
                        if (-arg2 <= var24 - arg0 && arg2 >= (var24 - arg0)) {
                            int var25 = this.field1721.field556 * var24 + var22;
                            for (int var26 = var22; var26 < var23; var26++) {
                                if (-arg2 <= var26 - arg1 && arg2 >= var26 - arg1 && arg4[var26 + arg2 - arg1][var24 + arg2 - arg0]) {
                                    short[] var27 = this.field1721.field1243[var25];
                                    if (var27 != null) {
                                        if (this.field1719.field4736) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var21++;
                                                class103.field1246.method1346(118, var27[var28]);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                class103.field1246.method1370((byte) -36, var27[var29]);
                                                var21++;
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var21 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var20) / var8, (float) (-var17) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field1719.field4761.method791(5123, class103.field1246.field3406, var21 * 2);
                        this.field1725[var20][var17].method68((byte) 96, var21, this.field1719.field4761);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILve;IZ)V", line = 490)
    public final void method731(int arg0, class307 arg1, int arg2, boolean arg3) {
        class214 var5 = (class214) arg1;
        int var6 = var5.field2891 + arg0 + 1;
        int var7 = var5.field2890 + arg2 + 1;
        int var8 = var7 + (this.field1717 * var6);
        int var9 = 0;
        int var10 = var5.field2892;
        if (!arg3) {
            return;
        }
        int var11 = var5.field2893;
        int var12 = this.field1717 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var6 = 1;
            var8 += this.field1717 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field1718) {
            int var15 = var10 + var6 + 1 - this.field1718;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var14 += var16;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
            var12 += var16;
        }
        if (this.field1717 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field1717;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method732(var12, var11, this.field1722, var10, var5.field2889, var14, var8, var9, -13558);
            this.method727(var11, var6, var7, (byte) 30, var10);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[BI[BIIII)V", line = 562)
    private static final void method732(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg2[var10001] = (byte) (arg2[var10001] - arg4[arg7++]);
                int var14 = arg6++;
                arg2[var14] = (byte) (arg2[var14] - arg4[arg7++]);
                int var15 = arg6++;
                arg2[var15] = (byte) (arg2[var15] - arg4[arg7++]);
                int var16 = arg6++;
                arg2[var16] = (byte) (arg2[var16] - arg4[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg2[var10001] = (byte) (arg2[var10001] - arg4[arg7++]);
            }
            arg6 += arg0;
            arg7 += arg5;
        }
        if (arg8 != -13558) {
            method732(-27, -120, (byte[]) null, 34, (byte[]) null, 9, 115, -57, 113);
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lql;Lge;)V", line = 603)
    public class134(class346 arg0, class103 arg1) {
        this.field1721 = arg1;
        this.field1719 = arg0;
        this.field1717 = (this.field1721.field556 * this.field1721.field1248 >> this.field1719.field4719) + 2;
        this.field1718 = (this.field1721.field550 * this.field1721.field1248 >> this.field1719.field4719) + 2;
        this.field1722 = new byte[this.field1718 * this.field1717];
        this.field1724 = this.field1719.field4719 + 7 - this.field1721.field1249;
        this.field1720 = this.field1721.field556 >> this.field1724;
        this.field1723 = this.field1721.field550 >> this.field1724;
    }
}
