import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class12 extends class454 {

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Z")
    private boolean field132;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Z")
    private boolean field136;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lsga;")
    private class583 field133;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "Z")
    private boolean field139;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!cg", name = "mb", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!cg", name = "kb", descriptor = "Lgg;")
    private class114 field174;

    @OriginalMember(owner = "client!cg", name = "ob", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Lgg;")
    private class114 field156;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "Lcl;")
    public class336 field158;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!cg", name = "lb", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Laf;")
    private class39 field141;

    @OriginalMember(owner = "client!cg", name = "nb", descriptor = "Lac;")
    private class712 field177;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lsi;")
    public class737 field135;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field134;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "[F")
    public float[] field138;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "[F")
    public float[] field165;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "[Lev;")
    private class156[] field144;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "()Z")
    public final boolean method57() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "()Z")
    public final boolean method58() {
        return this.field132;
    }

    @OriginalMember(owner = "client!cg", name = "la", descriptor = "()V")
    public final void method59() {
        this.field172 = 0;
        this.field173 = 0;
        this.field140 = this.field153;
        this.field162 = this.field147;
        this.method69();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lbe;Z)Lac;")
    public final class712 method60(class196 arg0, boolean arg1) {
        int[] var3 = arg0.field2529;
        byte[] var4 = arg0.field2521;
        int var5 = arg0.field2527;
        int var6 = arg0.field2525;
        class695 var11;
        if (arg1 && arg0.field2523 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class103(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2523;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class472(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class285(this, var14, var5, var6);
            }
        }
        var11.method1874(arg0.field2526, arg0.field2522, arg0.field2528, arg0.field2524);
        return var11;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)Z")
    public final boolean method61(int arg0) {
        return super.field6364.method389(9559, arg0).field1157 || super.field6364.method389(9559, arg0).field1162;
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "()V")
    public final void method62() {
        if (this.field134 != null) {
            this.field168 = this.field135.field10327;
            this.field153 = this.field135.field10323;
            this.field147 = this.field135.field10328;
            this.field138 = this.field165;
            this.field148 = this.field151;
            this.field159 = this.field167;
        } else {
            this.field153 = 1;
            this.field147 = 1;
            this.field168 = null;
            this.field148 = 1;
            this.field159 = 1;
            this.field138 = null;
        }
        this.field141 = null;
        this.method158();
    }

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field153 * arg1 + arg0;
            int var15 = this.field153 - arg2;
            if (arg1 + arg3 > this.field162) {
                arg3 -= arg1 + arg3 - this.field162;
            }
            if (arg1 < this.field173) {
                int var16 = this.field173 - arg1;
                arg3 -= var16;
                var14 += this.field153 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field140) {
                int var17 = arg0 + arg2 - this.field140;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field172) {
                int var18 = this.field172 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field168[var14];
                            this.field168[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field168[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field168[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field168[var14++] = arg5;
                        } else {
                            this.field168[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "(I)V")
    public final void method64(int arg0) {
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public final void method65(boolean arg0) {
        this.field139 = arg0;
        this.field156.method776((byte) 93);
    }

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "()Z")
    public final boolean method66() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class156 var14 = this.method132(Thread.currentThread());
        class254 var15 = var14.field2016;
        var15.field3217 = false;
        int var16 = arg0 - this.field145;
        int var17 = arg3 - this.field145;
        int var18 = arg6 - this.field145;
        int var19 = arg1 - this.field149;
        int var20 = arg4 - this.field149;
        int var21 = arg7 - this.field149;
        var15.field3209 = var16 < 0 || var16 > var15.field3215 || var17 < 0 || var17 > var15.field3215 || var18 < 0 || var18 > var15.field3215;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field3220 = 255 - var22;
                var15.field3206 = false;
                var15.method1537((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field3220 = 128;
                var15.field3206 = true;
                var15.method1537((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field3220 = 0;
            var15.field3206 = false;
            var15.method1537((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field3217 = true;
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "(I)V")
    public final void method68(int arg0) {
        this.field171 = arg0;
        this.field156.method776((byte) -31);
    }

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "()V")
    private final void method69() {
        this.field145 = this.field172 - this.field157;
        this.field175 = this.field140 - this.field157;
        this.field149 = this.field173 - this.field155;
        this.field166 = this.field162 - this.field155;
        for (int var1 = 0; var1 < this.field161; ++var1) {
            class254 var5 = this.field144[var1].field2016;
            var5.field3214 = this.field157 - this.field172;
            var5.field3211 = this.field155 - this.field173;
            var5.field3215 = this.field140 - this.field172;
            var5.field3207 = this.field162 - this.field173;
        }
        int var2 = this.field173 * this.field153 + this.field172;
        for (int var3 = this.field173; var3 < this.field162; ++var3) {
            for (int var4 = 0; var4 < this.field161; ++var4) {
                this.field144[var4].field2016.field3221[var3 - this.field173] = var2;
            }
            var2 += this.field153;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ)Lac;")
    public final class712 method70(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class472(this, arg0, arg1) : new class285(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "()[I")
    public final int[] method71() {
        return new int[] { this.field157, this.field155, this.field160, this.field163 };
    }

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "(I)Z")
    public final boolean method72(int arg0) {
        return super.field6364.method390(arg0, -9396);
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "()Z")
    public final boolean method73() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class156 var8 = this.method132(Thread.currentThread());
        class254 var9 = var8.field2016;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method1539();
            int var24 = arg1 - var9.method1535();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field3220 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3220 = 255 - (arg4 >>> 24);
            }
            this.method129(false);
            var9.field3209 = var25 < 0 || var25 > var9.field3215 || var26 < 0 || var26 > var9.field3215 || var27 < 0 || var27 > var9.field3215;
            var9.method1542((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field3209 = var25 < 0 || var25 > var9.field3215 || var27 < 0 || var27 > var9.field3215 || var28 < 0 || var28 > var9.field3215;
            var9.method1542((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method129(true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIIIIZ)Lac;")
    public final class712 method75(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class472(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class285(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class472(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class285(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "([I)V")
    public final void method76(int[] arg0) {
        arg0[0] = this.field172;
        arg0[1] = this.field173;
        arg0[2] = this.field140;
        arg0[3] = this.field162;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lwc;)V")
    public final void method77(class376 arg0) {
        this.field158 = (class336) arg0;
    }

    @OriginalMember(owner = "client!cg", name = "EA", descriptor = "(IIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        class156 var5 = this.method132(Thread.currentThread());
        var5.field1972 = arg0;
        var5.field1973 = arg1;
        var5.field1971 = arg2;
    }

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "()Loj;")
    public final class633 method79() {
        return new class633(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field6364.method389(9559, arg6).field1167) {
                if (this.field178 != arg6) {
                    class712 var11 = (class712) this.field174.method778((long) arg6, 104);
                    if (var11 == null) {
                        int[] var12 = this.method177(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method159(arg6) ? 64 : this.field171;
                        var11 = this.method2666(var13, var13, (byte) -48, var12, 0, var13);
                        this.field174.method774((long) arg6, 101, var11);
                    }
                    this.field178 = arg6;
                    this.field177 = var11;
                }
                ((class695) this.field177).method692(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method106(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "(IIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (this.field172 < arg0) {
            this.field172 = arg0;
        }
        if (this.field173 < arg1) {
            this.field173 = arg1;
        }
        if (this.field140 > arg2) {
            this.field140 = arg2;
        }
        if (this.field162 > arg3) {
            this.field162 = arg3;
        }
        this.method69();
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
    public final void method82(int arg0) {
        this.field144[arg0].method977((Runnable) null, -24813);
    }

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "(ILaa;II)V")
    public final void method83(int arg0, class81 arg1, int arg2, int arg3) {
        class210 var5 = (class210) arg1;
        int[] var6 = var5.field2688;
        int[] var7 = var5.field2689;
        int var8;
        if (this.field162 < var6.length + arg3) {
            var8 = this.field162 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field173 > arg3) {
            var9 = this.field173 - arg3;
            arg3 = this.field173;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field153 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field172 > var12) {
                    var13 -= this.field172 - var12;
                    var12 = this.field172;
                }
                if (this.field140 < var12 + var13) {
                    var13 = this.field140 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field168[var14++] = arg0;
                }
                var10 += this.field153;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "()V")
    public final void method84() {
        if (this.field136) {
            class283.method1700(0, true, false);
            this.field136 = false;
        }
        this.field135 = null;
        this.field134 = null;
        this.field130 = 0;
        this.field137 = 0;
        this.field133 = null;
        this.field132 = true;
    }

    @OriginalMember(owner = "client!cg", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method85(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field142 = (int) (arg1 * 65535.0F);
        this.field169 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field164 = (int) (arg3 * 65535.0F / var7);
        this.field150 = (int) (arg4 * 65535.0F / var7);
        this.field154 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "()Z")
    public final boolean method86() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[I[I)Laa;")
    public final class81 method87(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class210(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()Z")
    public final boolean method88() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)V")
    public final void method89(int arg0, int arg1) throws class510 {
        if (this.field134 != null && this.field135 != null) {
            try {
                Graphics var3 = this.field134.getGraphics();
                this.field135.method1006(this.field130, this.field137, arg0, 2, var3, 0, arg1, 0);
            } catch (Exception var4) {
                this.field134.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIF)Lpk;")
    public final class621 method90(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "()Z")
    public final boolean method91() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "(I)I")
    public final int method92(int arg0) {
        return super.field6364.method389(9559, arg0).field1151 & 65535;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "()V")
    public final void method93() {
    }

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "()Lwc;")
    public final class376 method94() {
        return this.field158;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method95(Canvas arg0) {
        if (arg0 != null) {
            class737 var2 = (class737) this.field133.method3248((long) arg0.hashCode(), 0);
            if (var2 != null) {
                this.field134 = arg0;
                Dimension var3 = arg0.getSize();
                this.field130 = var3.width;
                this.field137 = var3.height;
                this.field135 = var2;
                if (this.field141 == null) {
                    this.field168 = var2.field10327;
                    this.field153 = var2.field10323;
                    this.field147 = var2.field10328;
                    if (this.field153 != this.field148 || this.field159 != this.field147) {
                        this.field151 = this.field148 = this.field153;
                        this.field167 = this.field159 = this.field147;
                        this.field165 = this.field138 = new float[this.field159 * this.field148];
                    }
                    this.method158();
                    return;
                }
            }
        } else {
            this.field134 = null;
            this.field135 = null;
            if (this.field141 == null) {
                this.field168 = null;
                this.field153 = this.field147 = 1;
                this.field148 = this.field159 = 1;
                this.method158();
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    public final void method97(int arg0) {
        int var2 = arg0 - this.field131;
        for (Object var3 = this.field156.method779(30); var3 != null; var3 = this.field156.method777((byte) 120)) {
            class104 var4 = (class104) var3;
            if (var4.field1282) {
                var4.field1283 += var2;
                int var5 = var4.field1283 / 20;
                if (var5 > 0) {
                    class91 var6 = super.field6364.method389(9559, var4.field1284);
                    var4.method722(var6.field1148 * var2 * 50 / 1000, var6.field1161 * var2 * 50 / 1000);
                    var4.field1283 -= var5 * 20;
                }
                var4.field1282 = false;
            }
        }
        this.field131 = arg0;
        this.field174.method775(1, 5);
        this.field156.method775(1, 5);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method98(Canvas arg0, int arg1, int arg2) {
        class737 var4 = (class737) this.field133.method3248((long) arg0.hashCode(), 0);
        if (var4 == null) {
            class737 var5 = class289.method1729(-5, arg2, arg0, arg1);
            this.field133.method3249((long) arg0.hashCode(), var5, (byte) 43);
        } else {
            if (var4.field10323 != arg1 || var4.field10328 != arg2) {
                this.method151(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "ya", descriptor = "()V")
    public final void method99() {
        if (this.field172 == 0 && this.field153 == this.field140 && this.field173 == 0 && this.field162 == this.field147) {
            int var1 = this.field138.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field138[var3++] = 2.1474836E9F;
                this.field138[var3++] = 2.1474836E9F;
                this.field138[var3++] = 2.1474836E9F;
                this.field138[var3++] = 2.1474836E9F;
                this.field138[var3++] = 2.1474836E9F;
                this.field138[var3++] = 2.1474836E9F;
                this.field138[var3++] = 2.1474836E9F;
                this.field138[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field138[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field140 - this.field172;
            int var5 = this.field162 - this.field173;
            int var6 = this.field153 - var4;
            int var7 = this.field173 * this.field153 + this.field172;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field138[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)I")
    public final int method100(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class402 method101(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class520(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lcd;)V")
    public final void method102(class603 arg0) {
        class156 var2 = this.method132(Thread.currentThread());
        class297 var3 = arg0.field8363.field4479;
        for (class297 var4 = var3.field3857; var3 != var4; var4 = var4.field3857) {
            class744 var5 = (class744) var4;
            int var6 = var5.field10383 >> 12;
            int var7 = var5.field10388 >> 12;
            int var8 = var5.field10387 >> 12;
            float var9 = (float) var8 * this.field158.field4338 + (float) var6 * this.field158.field4344 + (float) var7 * this.field158.field4339 + this.field158.field4334;
            if (!(var9 < (float) this.field176) && !(var9 > (float) var2.field1981)) {
                int var10 = (int) (((float) var8 * this.field158.field4314 + (float) var6 * this.field158.field4330 + (float) var7 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / var9) + this.field157;
                int var11 = (int) (((float) var8 * this.field158.field4337 + (float) var6 * this.field158.field4335 + (float) var7 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / var9) + this.field155;
                if (var10 >= this.field172 && var10 <= this.field140 && var11 >= this.field173 && var11 <= this.field162) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method144(var5, var10, var11, (int) var9, (int) ((float) (this.field160 * var5.field10379 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "(I)[I")
    public final int[] method103(int arg0) {
        class114 var2 = this.field156;
        class104 var3;
        synchronized (this.field156) {
            var3 = (class104) this.field156.method778((long) arg0, 126);
            if (var3 == null) {
                if (!super.field6364.method390(arg0, -9396)) {
                    return null;
                }
                class91 var5 = super.field6364.method389(9559, arg0);
                int var6 = !var5.field1159 && !this.field139 ? this.field171 : 64;
                var3 = new class104(arg0, var6, super.field6364.method395(true, 0.7F, var6, arg0, -11288, var6), var5.field1165 != 1);
                this.field156.method774((long) arg0, 109, var3);
            }
        }
        var3.field1282 = true;
        return var3.method721();
    }

    @OriginalMember(owner = "client!cg", name = "ra", descriptor = "(IIII)V")
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field144.length; ++var5) {
            this.field144[var5].field1985 = this.field144[var5].field1973;
            this.field144[var5].field1972 = arg0;
            this.field144[var5].field1973 = arg1;
            this.field144[var5].field1971 = arg2;
            this.field144[var5].field1980 = true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "(II)V")
    public final void method105(int arg0, int arg1) {
        int var3 = this.field153 * arg1 + arg0;
        int var4 = this.field148 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field168;
            float[] var6 = this.field138;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class617.method3391(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class617.method3391(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class617.method3387(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class617.method3387(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(IIIIII)V")
    private final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field173) {
            var7 = this.field173;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field162) {
            var8 = this.field162;
        }
        int var9 = var7;
        int var10 = arg3 * arg3;
        int var11 = 0;
        int var12 = arg1 - var7;
        int var13 = var12 * var12;
        int var14 = var13 - var12;
        if (arg1 > var8) {
            arg1 = var8;
        }
        int var15 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var15 == 255) {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var65 = arg0 - var11 + 1;
                if (var65 < this.field172) {
                    var65 = this.field172;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field140) {
                    var66 = this.field140;
                }
                int var67 = this.field153 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field138[var67]) {
                        this.field168[var67] = arg4;
                    }
                    ++var67;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var56 = arg3;
            int var57 = var9 - arg1;
            int var58 = var57 * var57 + var10;
            int var59 = var58 - arg3;
            int var60 = var58 - var57;
            while (var9 < var8) {
                while (var60 > var10 && var59 > var10) {
                    var60 -= var56-- + var56;
                    var59 -= var56 + var56;
                }
                int var61 = arg0 - var56;
                if (var61 < this.field172) {
                    var61 = this.field172;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field140 - 1) {
                    var62 = this.field140 - 1;
                }
                int var63 = this.field153 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field138[var63]) {
                        this.field168[var63] = arg4;
                    }
                    ++var63;
                }
                ++var9;
                var60 += var57 + var57;
                var59 += var57++ + var57;
            }
        } else if (arg5 == 1) {
            int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
            int var17 = 256 - var15;
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var29 = arg0 - var11 + 1;
                if (var29 < this.field172) {
                    var29 = this.field172;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field140) {
                    var30 = this.field140;
                }
                int var31 = this.field153 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field138[var31]) {
                        int var33 = this.field168[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field168[var31] = var16 + var34;
                    }
                    ++var31;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var18 = arg3;
            int var19 = -var12;
            int var20 = var19 * var19 + var10;
            int var21 = var20 - arg3;
            int var22 = var20 - var19;
            while (var9 < var8) {
                while (var22 > var10 && var21 > var10) {
                    var22 -= var18-- + var18;
                    var21 -= var18 + var18;
                }
                int var23 = arg0 - var18;
                if (var23 < this.field172) {
                    var23 = this.field172;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field140 - 1) {
                    var24 = this.field140 - 1;
                }
                int var25 = this.field153 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field138[var25]) {
                        int var27 = this.field168[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field168[var25] = var16 + var28;
                    }
                    ++var25;
                }
                ++var9;
                var22 += var19 + var19;
                var21 += var19++ + var19;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var48 = arg0 - var11 + 1;
                if (var48 < this.field172) {
                    var48 = this.field172;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field140) {
                    var49 = this.field140;
                }
                int var50 = this.field153 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field138[var50]) {
                        int var52 = this.field168[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field168[var50] = var53 - var55 | var55 - (var55 >>> 8);
                    }
                    ++var50;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var35 = arg3;
            int var36 = -var12;
            int var37 = var36 * var36 + var10;
            int var38 = var37 - arg3;
            int var39 = var37 - var36;
            while (var9 < var8) {
                while (var39 > var10 && var38 > var10) {
                    var39 -= var35-- + var35;
                    var38 -= var35 + var35;
                }
                int var40 = arg0 - var35;
                if (var40 < this.field172) {
                    var40 = this.field172;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field140 - 1) {
                    var41 = this.field140 - 1;
                }
                int var42 = this.field153 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field138[var42]) {
                        int var44 = this.field168[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field168[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()Z")
    public final boolean method107() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "XA", descriptor = "()I")
    public final int method108() {
        return this.field143;
    }

    @OriginalMember(owner = "client!cg", name = "da", descriptor = "(III[I)V")
    public final void method109(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field158.field4338 + (float) arg0 * this.field158.field4344 + (float) arg1 * this.field158.field4339 + this.field158.field4334;
        if (!(var5 < (float) this.field176) && !(var5 > (float) this.field143)) {
            int var6 = (int) (((float) arg2 * this.field158.field4314 + (float) arg0 * this.field158.field4330 + (float) arg1 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / var5);
            int var7 = (int) (((float) arg2 * this.field158.field4337 + (float) arg0 * this.field158.field4335 + (float) arg1 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / var5);
            if (var6 >= this.field145 && var6 <= this.field175 && var7 >= this.field149 && var7 <= this.field166) {
                arg3[0] = var6 - this.field145;
                arg3[1] = var7 - this.field149;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIII)V")
    private final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field172 && arg0 < this.field140) {
            int var9 = this.field153 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field173 && arg1 + var15 < this.field162 && var12 < arg5) {
                            int var16 = this.field153 * var15 + var9;
                            int var17 = this.field168[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field168[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field173 && arg1 + var19 < this.field162 && var12 < arg5) {
                            int var20 = this.field153 * var19 + var9;
                            int var21 = this.field168[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field168[var20] = var22 - var24 | var24 - (var24 >>> 8);
                        }
                        ++var19;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var25 = 0;
                while (var25 < arg2) {
                    if (arg1 + var25 >= this.field173 && arg1 + var25 < this.field162 && var12 < arg5) {
                        this.field168[this.field153 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lmk;)V")
    public final void method111(class344 arg0) {
        class39 var2 = (class39) arg0;
        this.field153 = var2.field578;
        this.field147 = var2.field579;
        this.field168 = var2.field571;
        this.field141 = var2;
        this.field148 = var2.field578;
        this.field159 = var2.field579;
        this.field138 = var2.field570;
        this.method158();
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public final void method112(int arg0) {
        this.field144[arg0].method977(Thread.currentThread(), -24813);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()Z")
    public final boolean method113() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "()Lwc;")
    public final class376 method114() {
        class156 var1 = this.method132(Thread.currentThread());
        return var1.field1982;
    }

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "()I")
    public final int method115() {
        return 0;
    }

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "()V")
    public final void method116() {
    }

    @OriginalMember(owner = "client!cg", name = "DA", descriptor = "(IIII)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3) {
        this.field157 = arg0;
        this.field155 = arg1;
        this.field160 = arg2;
        this.field163 = arg3;
        this.method69();
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        class156 var3 = this.method132(Thread.currentThread());
        this.field176 = arg0;
        this.field143 = arg1;
        var3.field1981 = this.field143 - 255;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltj;Ltj;FLtj;)Ltj;")
    public final class662 method119(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIID)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field148 - arg2;
        int var8 = this.field148 * arg1 + arg0;
        float[] var9 = this.field138;
        int var10 = 0;
        while (var10 < arg3) {
            int var11 = 0;
            while (var11 < arg2) {
                float var12 = var9[var8];
                if (var12 != 2.1474836E9F) {
                    var9[var8] = (float) ((double) var12 + arg4);
                }
                ++var11;
                ++var8;
            }
            ++var10;
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8) {
        class210 var10 = (class210) arg6;
        int[] var11 = var10.field2688;
        int[] var12 = var10.field2689;
        int var13 = this.field173 > arg8 ? this.field173 : arg8;
        int var14 = this.field162 < var11.length + arg8 ? this.field162 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field172) {
                var18 += (this.field172 - arg0) * var20;
                arg0 = this.field172;
            }
            if (var21 >= this.field140) {
                var21 = this.field140 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field153 * var25 + arg0;
                                int var29 = this.field168[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field168[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field153 * var31 + arg0;
                                int var35 = this.field168[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field168[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field168[this.field153 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field172 && var64 < this.field140 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field168[this.field153 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field172 && var50 < this.field140 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field153 * arg1 + var50;
                        int var54 = this.field168[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field168[this.field153 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field172 && var56 < this.field140 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field153 * arg1 + var56;
                        int var60 = this.field168[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field168[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method122(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class510 {
        if (this.field134 != null && this.field135 != null) {
            try {
                Graphics var5 = this.field134.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field153 && var7.y + arg3 <= this.field147 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field135.method1006(var7.width, var7.height, var7.x + arg2, 2, var5, var7.y, var7.y + arg3, var7.x);
                    }
                }
            } catch (Exception var8) {
                this.field134.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "()Z")
    public final boolean method123() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field161 = arg0;
        this.field144 = new class156[this.field161];
        for (int var2 = 0; var2 < this.field161; ++var2) {
            this.field144[var2] = new class156(this);
        }
    }

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "()Lwc;")
    public final class376 method125() {
        return new class336();
    }

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "()I")
    public final int method126() {
        int var1 = this.field152;
        this.field152 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "()I")
    public final int method127() {
        int var1 = this.field146;
        this.field146 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "(IIIII)V")
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field172 && arg0 < this.field140) {
            if (arg1 < this.field173) {
                arg2 -= this.field173 - arg1;
                arg1 = this.field173;
            }
            if (arg1 + arg2 > this.field162) {
                arg2 = this.field162 - arg1;
            }
            int var6 = this.field153 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field153 * var10 + var6;
                        int var12 = this.field168[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field168[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field153 * var14 + var6;
                        int var16 = this.field168[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field168[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field168[this.field153 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "(Z)V")
    public final void method129(boolean arg0) {
        class156 var2 = this.method132(Thread.currentThread());
        var2.field1978 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "(III)V")
    public final void method130(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field144.length; ++var4) {
            class156 var5 = this.field144[var4];
            var5.field1973 = arg0 & 16777215;
            int var6 = var5.field1973 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field1973 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field1973 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field1973 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field1976 = false;
            } else {
                var5.field1976 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "KA", descriptor = "(IIII)V")
    public final void method131(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field153) {
            arg2 = this.field153;
        }
        if (arg3 > this.field147) {
            arg3 = this.field147;
        }
        this.field172 = arg0;
        this.field140 = arg2;
        this.field173 = arg1;
        this.field162 = arg3;
        this.method69();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/Runnable;)Lev;")
    public final class156 method132(Runnable arg0) {
        for (int var2 = 0; var2 < this.field161; ++var2) {
            if (this.field144[var2].field1986 == arg0) {
                return this.field144[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lza;)V")
    public final void method133(class702 arg0) {
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIII)V")
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method160(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method160(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method128(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method128(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field172) {
                    var10 += (this.field172 - arg0) * var12;
                    arg0 = this.field172;
                }
                if (var13 >= this.field140) {
                    var13 = this.field140 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field173 && var17 < this.field162) {
                                int var18 = this.field153 * var17 + arg0;
                                int var19 = this.field168[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field168[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field173 && var21 < this.field162) {
                                int var22 = this.field153 * var21 + arg0;
                                int var23 = this.field168[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field168[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field173 && var27 < this.field162) {
                            this.field168[this.field153 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field173) {
                    var29 += (this.field173 - arg1) * var31;
                    arg1 = this.field173;
                }
                if (var32 >= this.field162) {
                    var32 = this.field162 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field172 && var46 < this.field140) {
                            this.field168[this.field153 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field172 && var36 < this.field140) {
                            int var37 = this.field153 * arg1 + var36;
                            int var38 = this.field168[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field168[this.field153 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field172 && var40 < this.field140) {
                            int var41 = this.field153 * arg1 + var40;
                            int var42 = this.field168[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field168[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(II)I")
    public final int method135(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIIIII)V")
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method160(arg0, arg1, arg2, arg4, arg5);
        this.method160(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method128(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method128(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(IIIIII)Ltj;")
    public final class662 method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "(I)I")
    public final int method138(int arg0) {
        return super.field6364.method389(9559, arg0).field1165;
    }

    @OriginalMember(owner = "client!cg", name = "xa", descriptor = "(F)V")
    public final void method139(float arg0) {
        this.field170 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method140(Canvas arg0) {
        if (this.field134 == arg0) {
            this.method95((Canvas) null);
        }
        class737 var2 = (class737) this.field133.method3248((long) arg0.hashCode(), 0);
        if (var2 != null) {
            var2.method3426((byte) -26);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I)V")
    public final void method141(int[] arg0) {
        arg0[0] = this.field153;
        arg0[1] = this.field147;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ld;)V")
    private class12(class96 arg0) {
        super(arg0);
        this.field132 = false;
        this.field136 = false;
        this.field133 = new class583(4);
        this.field139 = false;
        this.field143 = 3500;
        this.field140 = 0;
        this.field142 = 45823;
        this.field152 = 0;
        this.field163 = 512;
        this.field160 = 512;
        this.field162 = 0;
        this.field169 = 78642;
        this.field172 = 0;
        this.field146 = 0;
        this.field170 = 75518;
        this.field171 = 128;
        this.field173 = 0;
        this.field176 = 50;
        this.field174 = new class114(16);
        this.field178 = -1;
        try {
            this.field156 = new class114(256);
            this.field158 = new class336();
            this.method124(1);
            this.method112(0);
            class651.method3514(true, true, true);
            this.field136 = true;
            this.field131 = (int) class97.method654((byte) 81);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method2658(8);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "()V")
    public final void method142() {
        this.field156.method776((byte) 105);
        this.field174.method776((byte) 107);
    }

    @OriginalMember(owner = "client!cg", name = "na", descriptor = "(IIII)[I")
    public final int[] method143(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field153 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field168[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lej;IIII)V")
    private final void method144(class744 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field10385;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method106(arg1, arg2, arg3, arg4, arg0.field10380, 1);
        } else {
            if (this.field178 != var6) {
                class712 var9 = (class712) this.field174.method778((long) var6, -79);
                if (var9 == null) {
                    int[] var10 = this.method177(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method159(var6) ? 64 : this.field171;
                    var9 = this.method2666(var11, var11, (byte) -48, var10, 0, var11);
                    this.field174.method774((long) var6, 110, var9);
                }
                this.field178 = var6;
                this.field177 = var9;
            }
            ++var8;
            ((class695) this.field177).method692(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field10380, 1, 1);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method165(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method165(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method110(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method110(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }
        } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
                int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
                int var26 = var25 % var23;
                int var27 = var21 + var23 - var24 - var26;
                var24 = var27 % var23;
                if (var24 < 0) {
                    var24 += var23;
                }
                arg0 += var10;
                var10 = -var10;
                arg1 += var11;
                var11 = -var11;
            }
            if (var10 > var11) {
                int var28 = arg1 << 16;
                int var29 = var28 + 32768;
                int var30 = var11 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
                int var32 = arg0 + var10;
                int var33 = arg4 >>> 24;
                int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                    if (arg5 == 1) {
                        int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                        int var36 = 256 - var33;
                        while (arg0 <= var32) {
                            int var37 = var29 >> 16;
                            if (arg0 >= this.field172 && arg0 < this.field140 && var37 >= this.field173 && var37 < this.field162 && var24 < var21) {
                                int var38 = this.field153 * var37 + arg0;
                                int var39 = this.field168[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field168[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field172 && arg0 < this.field140 && var42 >= this.field173 && var42 < this.field162 && var24 < var21) {
                                int var43 = this.field153 * var42 + arg0;
                                int var44 = this.field168[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field168[var43] = var45 - var47 | var47 - (var47 >>> 8);
                            }
                            var29 += var31;
                            ++arg0;
                            int var48 = var24 + var34;
                            var24 = var48 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var32) {
                        int var49 = var29 >> 16;
                        if (arg0 >= this.field172 && arg0 < this.field140 && var49 >= this.field173 && var49 < this.field162 && var24 < var21) {
                            this.field168[this.field153 * var49 + arg0] = arg4;
                        }
                        var29 += var31;
                        ++arg0;
                        int var50 = var24 + var34;
                        var24 = var50 % var23;
                    }
                }
            } else {
                int var51 = arg0 << 16;
                int var52 = var51 + 32768;
                int var53 = var10 << 16;
                int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
                int var55 = arg1 + var11;
                int var56 = arg4 >>> 24;
                int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
                    if (arg5 == 1) {
                        int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                        int var59 = 256 - var56;
                        while (arg1 <= var55) {
                            int var60 = var52 >> 16;
                            if (arg1 >= this.field173 && arg1 < this.field162 && var60 >= this.field172 && var60 < this.field140 && var24 < var21) {
                                int var61 = this.field153 * arg1 + var60;
                                int var62 = this.field168[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field168[this.field153 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field173 && arg1 < this.field162 && var65 >= this.field172 && var65 < this.field140 && var24 < var21) {
                                int var66 = this.field153 * arg1 + var65;
                                int var67 = this.field168[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field168[var66] = var68 - var70 | var70 - (var70 >>> 8);
                            }
                            var52 += var54;
                            ++arg1;
                            int var71 = var24 + var57;
                            var24 = var71 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg1 <= var55) {
                        int var72 = var52 >> 16;
                        if (arg1 >= this.field173 && arg1 < this.field162 && var72 >= this.field172 && var72 < this.field140 && var24 < var21) {
                            this.field168[this.field153 * arg1 + var72] = arg4;
                        }
                        var52 += var54;
                        ++arg1;
                        int var73 = var24 + var57;
                        var24 = var73 % var23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[Lpk;)V")
    public final void method146(int arg0, class621[] arg1) {
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "()I")
    public final int method147() {
        return this.field176;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Lst;")
    public final class675 method148(int arg0, int arg1) {
        return new class276(arg0, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "()Z")
    public final boolean method149() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lid;IIII)Lka;")
    public final class219 method150(class415 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class352(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method151(Canvas arg0, int arg1, int arg2) {
        class737 var4 = (class737) this.field133.method3248((long) arg0.hashCode(), 0);
        if (var4 != null) {
            var4.method3426((byte) -60);
            class737 var5 = class289.method1729(-5, arg2, arg0, arg1);
            this.field133.method3249((long) arg0.hashCode(), var5, (byte) -112);
            if (this.field134 == arg0 && this.field141 == null) {
                Dimension var6 = arg0.getSize();
                this.field130 = var6.width;
                this.field137 = var6.height;
                this.field135 = var5;
                this.field168 = var5.field10327;
                this.field153 = var5.field10323;
                this.field147 = var5.field10328;
                if (this.field153 != this.field148 || this.field159 != this.field147) {
                    this.field151 = this.field148 = this.field153;
                    this.field167 = this.field159 = this.field147;
                    this.field165 = this.field138 = new float[this.field159 * this.field148];
                }
                this.method158();
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class12(Canvas arg0, class96 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method98(arg0, arg2, arg3);
            this.method95(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method2658(-128);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "()Z")
    public final boolean method152() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "za", descriptor = "(IIIII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field173) {
            var6 = this.field173;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field162) {
            var7 = this.field162;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field172) {
                    var64 = this.field172;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field140) {
                    var65 = this.field140;
                }
                int var66 = this.field153 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field168[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field172) {
                    var60 = this.field172;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field140 - 1) {
                    var61 = this.field140 - 1;
                }
                int var62 = this.field153 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field168[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field172) {
                    var28 = this.field172;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field140) {
                    var29 = this.field140;
                }
                int var30 = this.field153 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field168[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field168[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field172) {
                    var22 = this.field172;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field140 - 1) {
                    var23 = this.field140 - 1;
                }
                int var24 = this.field153 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field168[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field168[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field172) {
                    var47 = this.field172;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field140) {
                    var48 = this.field140;
                }
                int var49 = this.field153 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field168[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field168[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field172) {
                    var39 = this.field172;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field140 - 1) {
                    var40 = this.field140 - 1;
                }
                int var41 = this.field153 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field168[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field168[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lpea;Lst;)Lmk;")
    public final class344 method154(class594 arg0, class675 arg1) {
        return new class39(this, (class712) arg0, (class276) arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lcd;I)V")
    public final void method155(class603 arg0, int arg1) {
        class156 var3 = this.method132(Thread.currentThread());
        class297 var4 = arg0.field8363.field4479;
        for (class297 var5 = var4.field3857; var4 != var5; var5 = var5.field3857) {
            class744 var6 = (class744) var5;
            int var7 = var6.field10383 >> 12;
            int var8 = var6.field10388 >> 12;
            int var9 = var6.field10387 >> 12;
            float var10 = (float) var9 * this.field158.field4338 + (float) var7 * this.field158.field4344 + (float) var8 * this.field158.field4339 + this.field158.field4334;
            if (!(var10 < (float) this.field176) && !(var10 > (float) var3.field1981)) {
                int var11 = (int) (((float) var9 * this.field158.field4314 + (float) var7 * this.field158.field4330 + (float) var8 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / (float) arg1) + this.field157;
                int var12 = (int) (((float) var9 * this.field158.field4337 + (float) var7 * this.field158.field4335 + (float) var8 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / (float) arg1) + this.field155;
                if (var11 >= this.field172 && var11 <= this.field140 && var12 >= this.field173 && var12 <= this.field162) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method144(var6, var11, var12, (int) var10, (this.field160 * var6.field10379 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltba;[Lbe;Z)Lda;")
    public final class423 method156(class56 arg0, class196[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2527;
            var5[var7] = arg1[var7].field2525;
            if (arg1[var7].field2523 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class362(this, arg0, arg1, var4, var5);
            } else {
                return new class577(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class79(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIZ)Lac;")
    public final class712 method157(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field153 * arg1 + arg0;
        int var8 = this.field153 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field168[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class472(this, var6, arg2, arg3);
        } else {
            return new class285(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "()V")
    private final void method158() {
        for (int var1 = 0; var1 < this.field161; ++var1) {
            this.field144[var1].method978(8);
        }
        this.method59();
    }

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "(I)Z")
    public final boolean method159(int arg0) {
        return this.field139 || super.field6364.method389(9559, arg0).field1159;
    }

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "(IIIII)V")
    public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field173 && arg1 < this.field162) {
            if (arg0 < this.field172) {
                arg2 -= this.field172 - arg0;
                arg0 = this.field172;
            }
            if (arg0 + arg2 > this.field140) {
                arg2 = this.field140 - arg0;
            }
            int var6 = this.field153 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field168[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field168[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field168[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field168[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field168[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Lza;")
    public final class702 method161(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "(III[I)V")
    public final void method162(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field158.field4338 + (float) arg0 * this.field158.field4344 + (float) arg1 * this.field158.field4339 + this.field158.field4334;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field158.field4314 + (float) arg0 * this.field158.field4330 + (float) arg1 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / var5);
            int var7 = (int) (((float) arg2 * this.field158.field4337 + (float) arg0 * this.field158.field4335 + (float) arg1 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / var5);
            arg3[0] = var6 - this.field145;
            arg3[1] = var7 - this.field149;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFF)V")
    public final void method163(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V")
    public final void method164(int arg0) {
        class352.field4683 = arg0;
        class352.field4704 = arg0;
        if (this.field161 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method124(this.field161);
            this.method112(0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIIIII)V")
    private final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field173 && arg1 < this.field162) {
            int var9 = this.field153 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field172 && arg0 + var15 < this.field140 && var12 < arg5) {
                            int var16 = this.field168[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field168[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field172 && arg0 + var18 < this.field140 && var12 < arg5) {
                            int var19 = this.field168[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field168[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                        }
                        ++var18;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var23 = 0;
                while (var23 < arg2) {
                    if (arg0 + var23 >= this.field172 && arg0 + var23 < this.field140 && var12 < arg5) {
                        this.field168[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "GA", descriptor = "(I)V")
    public final void method166(int arg0) {
        this.method167(0, 0, this.field153, this.field147, arg0, 0);
    }

    @OriginalMember(owner = "client!cg", name = "aa", descriptor = "(IIIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field172) {
            arg2 -= this.field172 - arg0;
            arg0 = this.field172;
        }
        if (arg1 < this.field173) {
            arg3 -= this.field173 - arg1;
            arg1 = this.field173;
        }
        if (arg0 + arg2 > this.field140) {
            arg2 = this.field140 - arg0;
        }
        if (arg1 + arg3 > this.field162) {
            arg3 = this.field162 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field140 && arg1 <= this.field162) {
            int var7 = this.field153 - arg2;
            int var8 = this.field153 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field168[var24] = arg4;
                            ++var24;
                            this.field168[var24] = arg4;
                            ++var24;
                            this.field168[var24] = arg4;
                            ++var24;
                            this.field168[var24] = arg4;
                            ++var24;
                            this.field168[var24] = arg4;
                            ++var24;
                            this.field168[var24] = arg4;
                            ++var24;
                            this.field168[var24] = arg4;
                            ++var24;
                            this.field168[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field168[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field168[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field168[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field168[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field168[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "JA", descriptor = "(IIIIII)I")
    public final int method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field158.field4338 + (float) arg0 * this.field158.field4344 + (float) arg1 * this.field158.field4339 + this.field158.field4334;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field158.field4338 + (float) arg3 * this.field158.field4344 + (float) arg4 * this.field158.field4339 + this.field158.field4334;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field176 && var9 < (float) this.field176) {
            var7 |= 16;
        } else if (var8 > (float) this.field143 && var9 > (float) this.field143) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field158.field4314 + (float) arg0 * this.field158.field4330 + (float) arg1 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / var8);
        int var11 = (int) (((float) arg5 * this.field158.field4314 + (float) arg3 * this.field158.field4330 + (float) arg4 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / var9);
        if (var10 < this.field145 && var11 < this.field145) {
            var7 |= 1;
        } else if (var10 > this.field175 && var11 > this.field175) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field158.field4337 + (float) arg0 * this.field158.field4335 + (float) arg1 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / var8);
        int var13 = (int) (((float) arg5 * this.field158.field4337 + (float) arg3 * this.field158.field4335 + (float) arg4 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / var9);
        if (var12 < this.field149 && var13 < this.field149) {
            var7 |= 4;
        } else if (var12 > this.field166 && var13 > this.field166) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltj;)V")
    public final void method170(class662 arg0) {
    }

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "()Z")
    public final boolean method171() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()V")
    public final void method172() {
    }

    @OriginalMember(owner = "client!cg", name = "HA", descriptor = "(IIII[I)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field158.field4338 + (float) arg0 * this.field158.field4344 + (float) arg1 * this.field158.field4339 + this.field158.field4334;
        if (!(var6 < (float) this.field176) && !(var6 > (float) this.field143)) {
            int var7 = (int) (((float) arg2 * this.field158.field4314 + (float) arg0 * this.field158.field4330 + (float) arg1 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field158.field4337 + (float) arg0 * this.field158.field4335 + (float) arg1 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / (float) arg3);
            if (var7 >= this.field145 && var7 <= this.field175 && var8 >= this.field149 && var8 <= this.field166) {
                arg4[0] = var7 - this.field145;
                arg4[1] = var8 - this.field149;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)Lpea;")
    public final class594 method174(int arg0, int arg1) {
        return this.method70(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "()V")
    public final void method175() {
    }

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "()Z")
    public final boolean method176() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "(I)[I")
    public final int[] method177(int arg0) {
        class114 var2 = this.field156;
        class104 var3;
        synchronized (this.field156) {
            var3 = (class104) this.field156.method778((long) arg0 | Long.MIN_VALUE, 78);
            if (var3 == null) {
                if (!super.field6364.method390(arg0, -9396)) {
                    return null;
                }
                class91 var5 = super.field6364.method389(9559, arg0);
                int var6 = !var5.field1159 && !this.field139 ? this.field171 : 64;
                var3 = new class104(arg0, var6, super.field6364.method397(arg0, 0.7F, 13049, var6, var6, true), var5.field1165 != 1);
                this.field156.method774((long) arg0 | Long.MIN_VALUE, 79, var3);
            }
        }
        var3.field1282 = true;
        return var3.method721();
    }

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "()I")
    public final int method178() {
        return 0;
    }

    @OriginalMember(owner = "client!cg", name = "pa", descriptor = "()V")
    public final void method179() {
        for (int var1 = 0; var1 < this.field144.length; ++var1) {
            this.field144[var1].field1973 = this.field144[var1].field1985;
            this.field144[var1].field1980 = false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "(IIIIIII)I")
    public final int method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field158.field4338 + (float) arg0 * this.field158.field4344 + (float) arg1 * this.field158.field4339 + this.field158.field4334;
        float var9 = (float) arg5 * this.field158.field4338 + (float) arg3 * this.field158.field4344 + (float) arg4 * this.field158.field4339 + this.field158.field4334;
        int var10 = 0;
        if (var8 < (float) this.field176 && var9 < (float) this.field176) {
            var10 |= 16;
        } else if (var8 > (float) this.field143 && var9 > (float) this.field143) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field158.field4314 + (float) arg0 * this.field158.field4330 + (float) arg1 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field158.field4314 + (float) arg3 * this.field158.field4330 + (float) arg4 * this.field158.field4329 + this.field158.field4326) * (float) this.field160 / (float) arg6);
        if (var11 < this.field145 && var12 < this.field145) {
            var10 |= 1;
        } else if (var11 > this.field175 && var12 > this.field175) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field158.field4337 + (float) arg0 * this.field158.field4335 + (float) arg1 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field158.field4337 + (float) arg3 * this.field158.field4335 + (float) arg4 * this.field158.field4323 + this.field158.field4345) * (float) this.field163 / (float) arg6);
        if (var13 < this.field149 && var14 < this.field149) {
            var10 |= 4;
        } else if (var13 > this.field166 && var14 > this.field166) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class210 var13 = (class210) arg6;
        int[] var14 = var13.field2688;
        int[] var15 = var13.field2689;
        int var16 = this.field173 > arg8 ? this.field173 : arg8;
        int var17 = this.field162 < var14.length + arg8 ? this.field162 : var14.length + arg8;
        int var18 = arg11 << 8;
        int var19 = arg9 << 8;
        int var20 = arg10 << 8;
        int var21 = var19 + var20;
        int var22 = var18 % var21;
        int var23 = arg2 - arg0;
        int var24 = arg3 - arg1;
        if (var23 + var24 < 0) {
            int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
                var22 += var21;
            }
            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
        }
        if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                if (arg5 == 1) {
                    int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var36 = 256 - var33;
                    while (arg0 <= var32) {
                        int var37 = var29 >> 16;
                        int var38 = var37 - arg8;
                        if (arg0 >= this.field172 && arg0 < this.field140 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field153 * var37 + arg0;
                                int var41 = this.field168[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field168[var40] = var35 + var42;
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var43 = var22 + var34;
                        var22 = var43 % var21;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var32) {
                        int var44 = var29 >> 16;
                        int var45 = var44 - arg8;
                        if (arg0 >= this.field172 && arg0 < this.field140 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field153 * var44 + arg0;
                                int var48 = this.field168[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field168[var47] = var49 - var51 | var51 - (var51 >>> 8);
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var52 = var22 + var34;
                        var22 = var52 % var21;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var32) {
                    int var53 = var29 >> 16;
                    int var54 = var53 - arg8;
                    if (arg0 >= this.field172 && arg0 < this.field140 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field168[this.field153 * var53 + arg0] = arg4;
                        }
                    }
                    var29 += var31;
                    ++arg0;
                    int var56 = var22 + var34;
                    var22 = var56 % var21;
                }
            }
        } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
            int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
                while (arg1 <= var62) {
                    int var80 = var58 >> 16;
                    int var81 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field172 && var80 < this.field140 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field168[this.field153 * arg1 + var80] = arg4;
                    }
                    var58 += var60;
                    ++arg1;
                    int var82 = var22 + var61;
                    var22 = var82 % var21;
                }
            } else if (arg5 == 1) {
                int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
                int var65 = 256 - var63;
                while (arg1 <= var62) {
                    int var66 = var58 >> 16;
                    int var67 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field172 && var66 < this.field140 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field153 * arg1 + var66;
                        int var69 = this.field168[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field168[this.field153 * arg1 + var66] = var64 + var70;
                    }
                    var58 += var60;
                    ++arg1;
                    int var71 = var22 + var61;
                    var22 = var71 % var21;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var62) {
                    int var72 = var58 >> 16;
                    int var73 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field172 && var72 < this.field140 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field153 * arg1 + var72;
                        int var75 = this.field168[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field168[var74] = var76 - var78 | var78 - (var78 >>> 8);
                    }
                    var58 += var60;
                    ++arg1;
                    int var79 = var22 + var61;
                    var22 = var79 % var21;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
