import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class51 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Lao;")
    private class157 field607;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Lje;")
    private class228 field606;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "[B")
    public byte[] field609;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "[[Lwn;")
    private class431[][] field608;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIII)V", line = 4)
    private final void method293(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (this.field608 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg4 + arg3 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 - (1 - arg2) - 1 >> 7;
        if (!arg1) {
            this.method298((byte) -13, (class152) null, 13, -120);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class431[] var11 = this.field608[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field6209 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILmm;II)V", line = 42)
    public final void method294(int arg0, class152 arg1, int arg2, int arg3) {
        class147 var5 = (class147) arg1;
        int var6 = var5.field1802 + arg0 + 1;
        int var7 = var5.field1801 + arg2 + 1;
        int var8 = this.field610 * var7 + var6;
        int var9 = 0;
        if (arg3 != 12586) {
            return;
        }
        int var10 = var5.field1804;
        int var11 = var5.field1800;
        int var12 = this.field610 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += this.field610 * var14;
            var7 = 1;
            var9 += var11 * var14;
        }
        if ((var7 + var10) >= this.field611) {
            int var15 = var7 + var10 + 1 - this.field611;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var13 += var16;
            var12 += var16;
            var11 -= var16;
        }
        if ((var6 + var11) >= this.field610) {
            int var17 = var6 + var11 + 1 - this.field610;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method301(var8, var9, this.field609, var10, var13, var5.field1803, -41, var11, var12);
            this.method293(var7, true, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIBIIII)Z", line = 115)
    private static final boolean method295(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg1 + arg6 - 1) / arg6);
        int var10 = -42 / ((arg2 + 60) / 51);
        int var11 = -((arg6 + arg5 - 1) / arg6);
        for (int var12 = var9; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg0[arg3] == 0) {
                    return true;
                }
                arg3 += arg6;
            }
            int var14 = arg3 - var8;
            if (arg0[var14 - 1] == 0) {
                return true;
            }
            arg3 = arg4 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[[ZZII)V", line = 163)
    public final void method296(int arg0, int arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != 14107) {
            method301(111, -68, (byte[]) null, -104, -108, (byte[]) null, -19, -70, -110);
        }
        opengl var7 = this.field607.field1927;
        this.field607.method974();
        this.field607.method969(false);
        this.field607.method959(false);
        this.field607.method979(-2);
        this.field607.method975(0);
        this.field607.method973(1);
        float var8 = 1.0F / (float) (this.field607.field1939 * 128);
        if (arg3) {
            for (int var23 = 0; var23 < this.field612; var23++) {
                int var24 = var23 << this.field614;
                int var25 = var23 + 1 << this.field614;
                label89: for (int var26 = 0; var26 < this.field613; var26++) {
                    int var27 = var26 << this.field614;
                    int var28 = var26 + 1 << this.field614;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if (-arg0 <= var29 - arg4 && var29 - arg4 <= arg0) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((-arg0) <= (var30 - arg5) && arg0 >= (var30 - arg5) && arg2[arg0 + var29 - arg4][var30 + arg0 - arg5]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field608[var26][var23].method2707((byte) -27);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field612; var9++) {
                int var10 = var9 << this.field614;
                int var11 = var9 + 1 << this.field614;
                for (int var12 = 0; var12 < this.field613; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field614;
                    int var15 = var12 + 1 << this.field614;
                    class236 var16 = class228.field3197;
                    var16.field3320 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((-arg0) <= (var17 - arg5) && arg0 >= (var17 - arg5)) {
                            int var18 = this.field606.field4635 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if ((var19 - arg4) >= (-arg0) && arg0 >= var19 - arg4 && arg2[arg0 + var19 - arg4][arg0 + var17 - arg5]) {
                                    short[] var20 = this.field606.field3200[var18];
                                    if (var20 != null) {
                                        if (this.field607.field1976) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method1605(var20[var22] & 0xFFFF, false);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var13++;
                                                var16.method1609(var20[var21] & 0xFFFF, 5544);
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
                        this.field608[var12][var9].method2706((byte) 104, 5123, var13, var16.field3364);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[BIII[BII)V", line = 353)
    private static final void method297(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        if (arg8 != 27791) {
            method301(-18, -128, (byte[]) null, 69, 117, (byte[]) null, 44, 103, 63);
        }
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg6[var10001] += arg2[arg4++];
                int var14 = arg1++;
                arg6[var14] += arg2[arg4++];
                int var15 = arg1++;
                arg6[var15] += arg2[arg4++];
                int var16 = arg1++;
                arg6[var16] += arg2[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg6[var10001] += arg2[arg4++];
            }
            arg1 += arg3;
            arg4 += arg7;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLmm;II)V", line = 398)
    public final void method298(byte arg0, class152 arg1, int arg2, int arg3) {
        class147 var5 = (class147) arg1;
        int var6 = var5.field1801 + arg2 + 1;
        int var7 = var5.field1802 + arg3 + 1;
        int var8 = this.field610 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field1804;
        int var11 = var5.field1800;
        int var12 = this.field610 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += this.field610 * var14;
            var6 = 1;
            var9 += var11 * var14;
        }
        if ((var6 + var10) >= this.field611) {
            int var15 = var6 + var10 + 1 - this.field611;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
            var7 = 1;
            var9 += var16;
            var8 += var16;
        }
        if (this.field610 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field610;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        method297(var10, var8, var5.field1803, var12, var9, var11, this.field609, var13, 27791);
        if (arg0 != -115) {
            this.method298((byte) 38, (class152) null, 8, -87);
        }
        this.method293(var6, true, var10, var7, var11);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 468)
    public final void method299(int arg0) {
        this.field608 = new class431[this.field613][this.field612];
        if (arg0 != 30004) {
            this.field612 = 118;
        }
        for (int var2 = 0; var2 < this.field612; var2++) {
            for (int var3 = 0; var3 < this.field613; var3++) {
                this.field608[var3][var2] = new class431(this.field607, this, this.field606, var3, var2, this.field614, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(ILmm;II)Z", line = 496)
    public final boolean method300(int arg0, class152 arg1, int arg2, int arg3) {
        class147 var5 = (class147) arg1;
        int var6 = var5.field1801 + arg0 + 1;
        int var7 = var5.field1802 + arg3 + 1;
        int var8 = this.field610 * var6 + var7;
        int var9 = var5.field1804;
        int var10 = var5.field1800;
        int var11 = this.field610 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field610 * var12;
            var6 = 1;
            var9 -= var12;
        }
        if ((var6 + var9) >= this.field611) {
            int var13 = var6 - (this.field611 - var9 - 1);
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var11 += var14;
            var8 += var14;
            var7 = 1;
            var10 -= var14;
        }
        if (this.field610 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field610;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        if (arg2 != -21716) {
            this.field611 = 53;
        }
        byte var16 = 8;
        int var17 = (var16 - 1) * this.field610 + var11;
        return method295(this.field609, var9, (byte) -6, var8, var17, var10, var16);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[BII[BIII)V", line = 567)
    private static final void method301(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg6 > -22) {
            method301(-53, -41, (byte[]) null, 70, -120, (byte[]) null, -20, -121, 26);
        }
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg2[var10001] = (byte) (arg2[var10001] - arg5[arg1++]);
                int var14 = arg0++;
                arg2[var14] = (byte) (arg2[var14] - arg5[arg1++]);
                int var15 = arg0++;
                arg2[var15] = (byte) (arg2[var15] - arg5[arg1++]);
                int var16 = arg0++;
                arg2[var16] = (byte) (arg2[var16] - arg5[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg2[var10001] = (byte) (arg2[var10001] - arg5[arg1++]);
            }
            arg0 += arg8;
            arg1 += arg4;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lao;Lje;)V", line = 609)
    public class51(class157 arg0, class228 arg1) {
        this.field607 = arg0;
        this.field606 = arg1;
        this.field610 = (this.field606.field4635 * this.field606.field3212 >> this.field607.field1934) + 2;
        this.field611 = (this.field606.field4642 * this.field606.field3212 >> this.field607.field1934) + 2;
        this.field609 = new byte[this.field611 * this.field610];
        this.field614 = this.field607.field1934 + 7 - this.field606.field3201;
        this.field613 = this.field606.field4635 >> this.field614;
        this.field612 = this.field606.field4642 >> this.field614;
    }
}
