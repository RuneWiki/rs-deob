import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class268 {

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Ldl;")
    private class207 field3986;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lks;")
    private class173 field3987;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[B")
    public byte[] field3981;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field3982;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    private int field3980;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[[Lvp;")
    private class201[][] field3988;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BII[BIIII)V", line = 8)
    private static final void method1839(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg4[var10001] += arg1[arg6++];
                int var14 = arg0++;
                arg4[var14] += arg1[arg6++];
                int var15 = arg0++;
                arg4[var15] += arg1[arg6++];
                int var16 = arg0++;
                arg4[var16] += arg1[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg4[var10001] += arg1[arg6++];
            }
            arg6 += arg8;
            arg0 += arg3;
        }
        if (arg5 < 32) {
            method1841(109, 22, (byte[]) null, -5, (byte[]) null, -7, 11, 77, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILqh;II)V", line = 53)
    public final void method1840(int arg0, class337 arg1, int arg2, int arg3) {
        class362 var5 = (class362) arg1;
        if (arg0 >= -56) {
            method1839(40, (byte[]) null, -65, 90, (byte[]) null, -16, -96, -24, 40);
        }
        int var6 = var5.field5232 + arg2 + 1;
        int var7 = var5.field5235 + arg3 + 1;
        int var8 = this.field3985 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field5233;
        int var11 = var5.field5234;
        int var12 = this.field3985 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var8 += this.field3985 * var13;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field3984 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field3984;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var6 = 1;
        }
        if (var6 + var11 >= this.field3985) {
            int var17 = var11 + var6 + 1 - this.field3985;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1839(var8, var5.field5231, var11, var12, this.field3981, 50, var9, var10, var14);
            this.method1846(var7, var6, (byte) 35, var11, var10);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI[BIIIZ)V", line = 122)
    private static final void method1841(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        int var11 = -arg7;
        if (arg8) {
            method1841(38, 78, (byte[]) null, -71, (byte[]) null, -109, -12, -115, true);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg2[var10001] = (byte) (arg2[var10001] - arg4[arg5++]);
                int var14 = arg6++;
                arg2[var14] = (byte) (arg2[var14] - arg4[arg5++]);
                int var15 = arg6++;
                arg2[var15] = (byte) (arg2[var15] - arg4[arg5++]);
                int var16 = arg6++;
                arg2[var16] = (byte) (arg2[var16] - arg4[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg2[var10001] = (byte) (arg2[var10001] - arg4[arg5++]);
            }
            arg5 += arg3;
            arg6 += arg0;
            var11++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 164)
    public final void method1842(int arg0) {
        this.field3988 = new class201[this.field3983][this.field3980];
        for (int var2 = 0; var2 < this.field3980; var2++) {
            for (int var3 = 0; var3 < this.field3983; var3++) {
                this.field3988[var3][var2] = new class201(this.field3987, this, this.field3986, var3, var2, this.field3982, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 >= -34) {
            method1839(27, (byte[]) null, 60, 86, (byte[]) null, -53, -44, -11, -104);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILqh;Z)Z", line = 193)
    public final boolean method1843(int arg0, int arg1, class337 arg2, boolean arg3) {
        class362 var5 = (class362) arg2;
        int var6 = var5.field5232 + arg0 + 1;
        int var7 = var5.field5235 + arg1 + 1;
        int var8 = this.field3985 * var7 + var6;
        int var9 = var5.field5233;
        int var10 = var5.field5234;
        if (arg3) {
            this.field3980 = -38;
        }
        int var11 = this.field3985 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var9 -= var12;
            var8 += this.field3985 * var12;
        }
        if ((var7 + var9) >= this.field3984) {
            int var13 = var7 + var9 + 1 - this.field3984;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var11 += var14;
            var6 = 1;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field3985) {
            int var15 = var10 + var6 + 1 - this.field3985;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3985 + var11;
            return method1844(var9, var8, var17, true, this.field3981, var16, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZ[BII)Z", line = 266)
    private static final boolean method1844(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
        int var7 = arg6 % arg5;
        if (!arg3) {
            return false;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg0 + arg5 - 1) / arg5);
        int var10 = -((arg5 + arg6 - 1) / arg5);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg5;
            }
            int var13 = arg1 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBLqh;)V", line = 313)
    public final void method1845(int arg0, int arg1, byte arg2, class337 arg3) {
        class362 var5 = (class362) arg3;
        int var6 = -96 / ((62 - arg2) / 52);
        int var7 = var5.field5232 + arg0 + 1;
        int var8 = var5.field5235 + arg1 + 1;
        int var9 = this.field3985 * var8 + var7;
        int var10 = 0;
        int var11 = var5.field5233;
        int var12 = var5.field5234;
        int var13 = this.field3985 - var12;
        if (var8 <= 0) {
            int var14 = 1 - var8;
            var8 = 1;
            var9 += this.field3985 * var14;
            var10 += var12 * var14;
            var11 -= var14;
        }
        int var15 = 0;
        if (this.field3984 <= (var8 + var11)) {
            int var16 = var8 + var11 + 1 - this.field3984;
            var11 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var13 += var17;
            var9 += var17;
            var10 += var17;
            var7 = 1;
            var12 -= var17;
            var15 += var17;
        }
        if (var7 + var12 >= this.field3985) {
            int var18 = var7 + var12 + 1 - this.field3985;
            var15 += var18;
            var12 -= var18;
            var13 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            method1841(var13, var12, this.field3981, var15, var5.field5231, var10, var9, var11, false);
            this.method1846(var8, var7, (byte) 35, var12, var11);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBII)V", line = 382)
    private final void method1846(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (this.field3988 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 - (1 - arg3) - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg4 - 1 - 1 >> 7;
        if (arg2 != 35) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class201[] var11 = this.field3988[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field2842 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZIII[[Z)V", line = 424)
    public final void method1847(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean[][] arg5) {
        opengl var7 = this.field3987.field2253;
        this.field3987.method1196();
        this.field3987.method1132(false);
        if (arg3 != 14712) {
            this.method1840(121, (class337) null, -96, 103);
        }
        this.field3987.method1189(false);
        this.field3987.method1133(-2);
        this.field3987.method1143(0);
        this.field3987.method1179(1);
        float var8 = 1.0F / (float) (this.field3987.field2271 * 128);
        if (arg1) {
            for (int var23 = 0; var23 < this.field3980; var23++) {
                int var24 = var23 << this.field3982;
                int var25 = var23 + 1 << this.field3982;
                label88: for (int var26 = 0; var26 < this.field3983; var26++) {
                    int var27 = var26 << this.field3982;
                    int var28 = var26 + 1 << this.field3982;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((-arg4) <= (var29 - arg2) && var29 - arg2 <= arg4) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((-arg4) <= (var30 - arg0) && arg4 >= (var30 - arg0) && arg5[var29 + arg4 - arg2][arg4 + var30 - arg0]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field3988[var26][var23].method1386((byte) 63);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field3980; var9++) {
                int var10 = var9 << this.field3982;
                int var11 = var9 + 1 << this.field3982;
                for (int var12 = 0; var12 < this.field3983; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field3982;
                    int var15 = var12 + 1 << this.field3982;
                    class256 var16 = class207.field2905;
                    var16.field3762 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if (-arg4 <= var17 - arg0 && var17 - arg0 <= arg4) {
                            int var18 = this.field3986.field5538 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if ((var19 - arg2) >= (-arg4) && var19 - arg2 <= arg4 && arg5[var19 + arg4 - arg2][var17 + arg4 - arg0]) {
                                    short[] var20 = this.field3986.field2892[var18];
                                    if (var20 != null) {
                                        if (this.field3987.field2296) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var16.method1750((byte) 0, var20[var22] & 0xFFFF);
                                                var13++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method1731(-122, var20[var21] & 0xFFFF);
                                                var13++;
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field3988[var12][var9].method1388(var13, 71, 5123, var16.field3764);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lks;Ldl;)V", line = 609)
    public class268(class173 arg0, class207 arg1) {
        this.field3986 = arg1;
        this.field3987 = arg0;
        this.field3985 = (this.field3986.field5538 * this.field3986.field2903 >> this.field3987.field2274) + 2;
        this.field3984 = (this.field3986.field5540 * this.field3986.field2903 >> this.field3987.field2274) + 2;
        this.field3981 = new byte[this.field3985 * this.field3984];
        this.field3982 = this.field3987.field2274 + 7 - this.field3986.field2891;
        this.field3983 = this.field3986.field5538 >> this.field3982;
        this.field3980 = this.field3986.field5540 >> this.field3982;
    }
}
