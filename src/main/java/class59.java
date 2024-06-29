import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class59 extends class298 {

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Z")
    private boolean field871 = false;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public int field884 = 0;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public int field874 = 78642;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public int field881 = 0;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public int field891 = 0;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public int field897 = 0;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    private int field880 = 0;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "I")
    public int field893 = 50;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "Z")
    public boolean field901 = false;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    private int field896 = 0;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public int field892 = 512;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    private int field907 = 3500;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public int field902 = 45823;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public int field877 = 0;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "Z")
    private boolean field914 = false;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public int field911 = 0;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public int field899 = 3500;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public int field883 = 0;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
    private int field913 = 0;

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "I")
    public int field915 = 75518;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "I")
    public int field912 = this.field907 - 255;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public int field876 = 512;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "Z")
    private boolean field900 = false;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "Luc;")
    private class51 field886 = new class51(16);

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field903;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "Lwh;")
    public class288 field909;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Llb;")
    private class428 field875;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "[I")
    public int[] field895;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!lh", name = "nb", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "F")
    private float field905;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "F")
    private float field906;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!lh", name = "mb", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lei;")
    public class367 field908;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "Luc;")
    private class51 field890;

    @OriginalMember(owner = "client!lh", name = "ob", descriptor = "Lic;")
    private class74 field918;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "Z")
    public boolean field910;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "[Lmb;")
    private class334[] field878;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "()Z")
    public final boolean method424() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()Z")
    public final boolean method425() {
        return this.field914;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field889 * arg1 + arg0;
            int var15 = this.field889 - arg2;
            if (arg1 + arg3 > this.field883) {
                arg3 -= arg1 + arg3 - this.field883;
            }
            if (arg1 < this.field884) {
                int var16 = this.field884 - arg1;
                arg3 -= var16;
                var14 += this.field889 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field911) {
                int var17 = arg0 + arg2 - this.field911;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field881) {
                int var18 = this.field881 - arg0;
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
                            int var28 = this.field895[var14];
                            this.field895[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field895[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field895[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field895[var14++] = arg5;
                        } else {
                            this.field895[var14++] = arg4;
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

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "()V")
    private final void method427() {
        this.field894 = this.field881 - this.field898;
        this.field887 = this.field911 - this.field898;
        this.field882 = this.field884 - this.field904;
        this.field888 = this.field883 - this.field904;
        for (int var1 = 0; var1 < this.field872; ++var1) {
            class130 var5 = this.field878[var1].field4905;
            var5.field1706 = this.field898 - this.field881;
            var5.field1705 = this.field904 - this.field884;
            var5.field1704 = this.field911 - this.field881;
            var5.field1711 = this.field883 - this.field884;
        }
        int var2 = this.field889 * this.field884 + this.field881;
        for (int var3 = this.field884; var3 < this.field883; ++var3) {
            for (int var4 = 0; var4 < this.field872; ++var4) {
                this.field878[var4].field4905.field1712[var3 - this.field884] = var2;
            }
            var2 += this.field889;
        }
    }

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "()F")
    public final float method428() {
        return this.field905;
    }

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "()Lug;")
    public final class118 method429() {
        return new class367();
    }

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)Z")
    public final boolean method430(int arg0) {
        return this.field909.method1962(arg0, -11999).field48;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method431(Rectangle[] arg0, int arg1) {
        if (this.field903 != null && this.field875 != null) {
            try {
                Graphics var3 = this.field903.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field889 && var5.y <= this.field917 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field875.method797(var5.width, var5.x, var5.y, var5.height, var3, 10);
                    }
                }
            } catch (Exception var6) {
                this.field903.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)Z")
    public final boolean method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field908.field5417 * arg2 + this.field908.field5415 * arg0 + this.field908.field5408 * arg1 >> 15) + this.field908.field5418;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field908.field5417 * arg5 + this.field908.field5415 * arg3 + this.field908.field5408 * arg4 >> 15) + this.field908.field5418;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field893 || var8 >= this.field893) && (var7 <= this.field907 || var8 <= this.field907)) {
            int var9 = ((this.field908.field5411 * arg2 + this.field908.field5416 * arg0 + this.field908.field5413 * arg1 >> 15) + this.field908.field5407) * this.field876 / var7;
            int var10 = ((this.field908.field5411 * arg5 + this.field908.field5416 * arg3 + this.field908.field5413 * arg4 >> 15) + this.field908.field5407) * this.field876 / var8;
            if (var9 < this.field894 && var10 < this.field894 || var9 > this.field887 && var10 > this.field887) {
                return false;
            } else {
                int var11 = ((this.field908.field5412 * arg2 + this.field908.field5414 * arg1 + this.field908.field5409 * arg0 >> 15) + this.field908.field5410) * this.field892 / var7;
                int var12 = ((this.field908.field5412 * arg5 + this.field908.field5414 * arg4 + this.field908.field5409 * arg3 >> 15) + this.field908.field5410) * this.field892 / var8;
                return (var11 >= this.field882 || var12 >= this.field882) && (var11 <= this.field888 || var12 <= this.field888);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(Z)V")
    public final void method433(boolean arg0) {
        this.field900 = arg0;
        this.field890.method372(114);
    }

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "()Z")
    public final boolean method434() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(IIIIII)V")
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field881) {
            arg2 -= this.field881 - arg0;
            arg0 = this.field881;
        }
        if (arg1 < this.field884) {
            arg3 -= this.field884 - arg1;
            arg1 = this.field884;
        }
        if (arg0 + arg2 > this.field911) {
            arg2 = this.field911 - arg0;
        }
        if (arg1 + arg3 > this.field883) {
            arg3 = this.field883 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field911 && arg1 <= this.field883) {
            int var7 = this.field889 - arg2;
            int var8 = this.field889 * arg1 + arg0;
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
                            this.field895[var24] = arg4;
                            ++var24;
                            this.field895[var24] = arg4;
                            ++var24;
                            this.field895[var24] = arg4;
                            ++var24;
                            this.field895[var24] = arg4;
                            ++var24;
                            this.field895[var24] = arg4;
                            ++var24;
                            this.field895[var24] = arg4;
                            ++var24;
                            this.field895[var24] = arg4;
                            ++var24;
                            this.field895[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field895[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = (var9 << 24) + ((arg4 & 16711935) * var9 >> 8 & 16711935) + ((arg4 & 65280) * var9 >> 8 & 65280);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field895[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field895[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field895[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field895[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)I")
    public final int method436(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lin;III)V")
    public final void method437(class113 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field1459;
        if (var6 == -1) {
            this.method443(arg1, arg2, var5, arg0.field1472, 1);
        } else {
            if (this.field918 == null || (long) var6 != this.field918.field6091) {
                this.field918 = (class74) this.field886.method378((byte) 28, (long) var6);
            }
            if (this.field918 == null) {
                int[] var7 = this.method513(var6);
                if (var7 == null) {
                    return;
                }
                this.field918 = new class74();
                this.field918.field1042 = this.method484(var6);
                int var8 = this.field918.field1042 ? 64 : 128;
                this.field918.field1037 = this.method514(var7, 0, var8, var8, var8);
                this.field886.method367((long) var6, this.field918, true);
            }
            if (this.field918.field1042) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field918.field1037.method200(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field1472, 1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(IIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class334 var11 = this.method459(Thread.currentThread());
        class130 var12 = var11.field4905;
        var12.field1707 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field1707 = false;
            var12.field1708 = 0;
            var12.field1700 = true;
            var12.method927(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field1707 = false;
            var12.field1708 = 255 - var13;
            var12.field1700 = true;
            var12.method927(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field1707 = true;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIIII)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field881 && arg0 < this.field911) {
            if (arg1 < this.field884) {
                arg2 -= this.field884 - arg1;
                arg1 = this.field884;
            }
            if (arg1 + arg2 > this.field883) {
                arg2 = this.field883 - arg1;
            }
            int var6 = this.field889 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field889 * var10 + var6;
                        int var12 = this.field895[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field895[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field889 * var14 + var6;
                        int var16 = this.field895[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field895[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field895[this.field889 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lke;)V")
    public final void method441(class295 arg0) {
    }

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "()Z")
    public final boolean method442() {
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(IIIII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field884) {
            var6 = this.field884;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field883) {
            var7 = this.field883;
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
                if (var64 < this.field881) {
                    var64 = this.field881;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field911) {
                    var65 = this.field911;
                }
                int var66 = this.field889 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field895[var66++] = arg3;
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
                if (var60 < this.field881) {
                    var60 = this.field881;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field911 - 1) {
                    var61 = this.field911 - 1;
                }
                int var62 = this.field889 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field895[var62++] = arg3;
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
                if (var28 < this.field881) {
                    var28 = this.field881;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field911) {
                    var29 = this.field911;
                }
                int var30 = this.field889 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field895[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field895[var30++] = var15 + var33;
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
                if (var22 < this.field881) {
                    var22 = this.field881;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field911 - 1) {
                    var23 = this.field911 - 1;
                }
                int var24 = this.field889 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field895[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field895[var24++] = var15 + var27;
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
                if (var47 < this.field881) {
                    var47 = this.field881;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field911) {
                    var48 = this.field911;
                }
                int var49 = this.field889 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field895[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field895[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field881) {
                    var39 = this.field881;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field911 - 1) {
                    var40 = this.field911 - 1;
                }
                int var41 = this.field889 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field895[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field895[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V")
    public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class334 var8 = this.method459(Thread.currentThread());
        class130 var9 = var8.field4905;
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
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var17 = arg5 * var16 >> 17;
            int var18 = arg5 * var16 + 1 >> 17;
            int var19 = arg5 * var15 >> 17;
            int var20 = arg5 * var15 + 1 >> 17;
            int var21 = arg0 - var9.method940();
            int var22 = arg1 - var9.method937();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field1708 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1708 = 255 - (arg4 >> 24);
            }
            var9.field1700 = var23 < 0 || var23 > var9.field1704 || var24 < 0 || var24 > var9.field1704 || var25 < 0 || var25 > var9.field1704;
            var9.method936(var27, var28, var29, var23, var24, var25, arg4);
            var9.field1700 = var23 < 0 || var23 > var9.field1704 || var24 < 0 || var24 > var9.field1704 || var26 < 0 || var26 > var9.field1704;
            var9.method936(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)Z")
    public final boolean method445(int arg0) {
        return this.field909.method1960(false, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lvn;[Lok;Z)Los;")
    public final class129 method446(class431 arg0, class10[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field183;
            var5[var7] = arg1[var7].field187;
            if (arg1[var7].field180 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class292(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class272(this, arg0, arg1, var4, var5);
        } else {
            return new class55(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "()V")
    public final void method447() {
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[[I[[IIII)Lda;")
    public final class193 method448(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class91(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "()V")
    public final void method449() {
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)V")
    public final void method450(int arg0, int arg1, int arg2) {
        this.field891 = arg0;
        this.field897 = arg1;
        this.field877 = arg2;
    }

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "()I")
    public final int method451() {
        return this.field893;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Ldc;")
    public final class247 method452(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lqb;Lai;Lug;Laj;I)V")
    public final void method453(class257 arg0, class305 arg1, class118 arg2, class137 arg3, int arg4) {
        ((class451) arg0).method2787(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "()V")
    public final void method454() {
        this.field875 = class4.method21(1, this.field903);
        this.field895 = this.field875.field6225;
        this.field889 = this.field875.field6219;
        this.field917 = this.field875.field6224;
        for (int var1 = 0; var1 < this.field872; ++var1) {
            this.field878[var1].method2182(false);
        }
        this.method472();
    }

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "()V")
    public final void method455() {
        if (this.field871) {
            class246.method1607((byte) -44, true, false);
            this.field871 = false;
        }
        this.field903 = null;
        this.field909 = null;
        this.field875 = null;
        this.field914 = true;
    }

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "()V")
    public final void method456() {
        this.field890.method372(115);
    }

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "()I")
    public final int method457() {
        return this.field907;
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "()F")
    public final float method458() {
        return this.field906;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Runnable;)Lmb;")
    public final class334 method459(Runnable arg0) {
        for (int var2 = 0; var2 < this.field872; ++var2) {
            if (this.field878[var2].field4909 == arg0) {
                return this.field878[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3) {
        if (this.field881 < arg0) {
            this.field881 = arg0;
        }
        if (this.field884 < arg1) {
            this.field884 = arg1;
        }
        if (this.field911 > arg2) {
            this.field911 = arg2;
        }
        if (this.field883 > arg3) {
            this.field883 = arg3;
        }
        this.method427();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ldc;)V")
    public final void method461(class247 arg0) {
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(IIII)V")
    public final void method462(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field889) {
            arg2 = this.field889;
        }
        if (arg3 > this.field917) {
            arg3 = this.field917;
        }
        this.field881 = arg0;
        this.field911 = arg2;
        this.field884 = arg1;
        this.field883 = arg3;
        this.method427();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lok;Z)Ll;")
    public final class315 method463(class10 arg0, boolean arg1) {
        int[] var3 = arg0.field184;
        byte[] var4 = arg0.field182;
        int var5 = arg0.field183;
        int var6 = arg0.field187;
        class23 var11;
        if (arg1 && arg0.field180 == null) {
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
            var11 = new class311(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field180;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class34(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class34(this, var14, var5, var6);
                var11 = new class343(this, var14, var5, var6);
            }
        }
        var11.method205(arg0.field186, arg0.field188, arg0.field185, arg0.field181);
        return var11;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([Lqb;Lai;Lug;[Laj;I)V")
    public final void method464(class257[] arg0, class305 arg1, class118 arg2, class137[] arg3, int arg4) {
        class451[] var6 = new class451[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class451) arg0[var7];
            }
        }
        class451 var8 = class451.method2788(this, var6);
        var8.method2787(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)I")
    public final int method465(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "()I")
    public final int method466() {
        int var1 = this.field880;
        this.field880 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lke;Lke;FLke;)Lke;")
    public final class295 method467(class295 arg0, class295 arg1, float arg2, class295 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ld;IIII)Lqb;")
    public final class257 method468(class9 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class451(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "()Z")
    public final boolean method469() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "()I")
    public final int method470() {
        int var1 = this.field896;
        this.field896 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "()V")
    public final void method471() {
        if (this.field903 != null && this.field875 != null) {
            try {
                Graphics var1 = this.field903.getGraphics();
                this.field875.method798(var1, (byte) -26, 0, 0);
            } catch (Exception var2) {
                this.field903.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "()V")
    public final void method472() {
        this.field881 = 0;
        this.field884 = 0;
        this.field911 = this.field889;
        this.field883 = this.field917;
        this.method427();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(F)V")
    public final void method473(float arg0) {
        this.field915 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([I)V")
    public final void method474(int[] arg0) {
        arg0[0] = this.field881;
        arg0[1] = this.field884;
        arg0[2] = this.field911;
        arg0[3] = this.field883;
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "(I)[I")
    public final int[] method475(int arg0) {
        class51 var2 = this.field890;
        class187 var3;
        synchronized (this.field890) {
            var3 = (class187) this.field890.method378((byte) 28, (long) arg0);
            if (var3 == null) {
                if (!this.field909.method1960(false, arg0)) {
                    return null;
                }
                class3 var5 = this.field909.method1962(arg0, -11999);
                int var6 = !var5.field34 && !this.field900 ? 128 : 64;
                var3 = new class187(arg0, var6, this.field909.method1961(var6, true, arg0, 22881, 0.7F, var6), var5.field38);
                this.field890.method367((long) arg0, var3, true);
            }
        }
        var3.field2557 = true;
        return var3.method1247();
    }

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "()V")
    public final void method476() {
        this.field897 = this.field913;
        this.field901 = false;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(IIII)V")
    public final void method477(int arg0, int arg1, int arg2, int arg3) {
        this.field898 = arg0;
        this.field904 = arg1;
        this.field876 = arg2;
        this.field892 = arg3;
        this.method427();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lug;)V")
    public final void method478(class118 arg0) {
        this.field908 = (class367) arg0;
    }

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "()Z")
    public final boolean method479() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([Lqb;Lug;[Laj;I)V")
    public final void method480(class257[] arg0, class118 arg1, class137[] arg2, int arg3) {
        class451[] var5 = new class451[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class451) arg0[var6];
            }
        }
        class451 var7 = class451.method2788(this, var5);
        var7.method2787(arg1, arg2 != null ? arg2[0] : null, (class305) null, arg3);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(FF)V")
    public final void method481(float arg0, float arg1) {
        this.field906 = arg0;
        this.field905 = arg1;
        this.method512();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method482(Canvas arg0) {
        this.field903 = arg0;
        this.method454();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public final void method483(int arg0, int arg1) {
        this.field897 = arg0 & 16777215;
        int var3 = this.field897 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field897 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field897 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field897 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field910 = false;
        } else {
            this.field910 = true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "(I)Z")
    public final boolean method484(int arg0) {
        return this.field900 || this.field909.method1962(arg0, -11999).field34;
    }

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "()Z")
    public final boolean method485() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public final void method486(int arg0) {
        this.method435(0, 0, this.field889, this.field917, arg0, 0);
    }

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "(I)I")
    public final int method487(int arg0) {
        return this.field909.method1962(arg0, -11999).field37 & 65535;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IFFFFF)V")
    public final void method488(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field902 = (int) (arg1 * 65535.0F);
        this.field874 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field885 = (int) (arg3 * 65535.0F / var7);
        this.field916 = (int) (arg4 * 65535.0F / var7);
        this.field873 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
    public final void method489(int arg0, int arg1) {
        this.field893 = arg0;
        this.field907 = arg1;
        this.field912 = this.field907 - 255;
        this.method512();
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIII)[I")
    public final int[] method490(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field889 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field895[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(FFF)V")
    public final void method491(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (this.field872 != arg0) {
            this.field872 = arg0;
            this.field878 = new class334[this.field872];
            for (int var2 = 0; var2 < this.field872; ++var2) {
                this.field878[var2] = new class334(this);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(IIIIII)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method510(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method510(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method440(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method440(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field881) {
                    var10 += (this.field881 - arg0) * var12;
                    arg0 = this.field881;
                }
                if (var13 >= this.field911) {
                    var13 = this.field911 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field884 && var17 < this.field883) {
                                int var18 = this.field889 * var17 + arg0;
                                int var19 = this.field895[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field895[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field884 && var21 < this.field883) {
                                int var22 = this.field889 * var21 + arg0;
                                int var23 = this.field895[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field895[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field884 && var27 < this.field883) {
                            this.field895[this.field889 * var27 + arg0] = arg4;
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
                if (arg1 < this.field884) {
                    var29 += (this.field884 - arg1) * var31;
                    arg1 = this.field884;
                }
                if (var32 >= this.field883) {
                    var32 = this.field883 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field881 && var46 < this.field911) {
                            this.field895[this.field889 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field881 && var36 < this.field911) {
                            int var37 = this.field889 * arg1 + var36;
                            int var38 = this.field895[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field895[this.field889 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field881 && var40 < this.field911) {
                            int var41 = this.field889 * arg1 + var40;
                            int var42 = this.field895[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field895[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method494(int arg0) {
        this.field878[arg0].method2183((Runnable) null, 4096);
    }

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "()I")
    public final int method495() {
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "()Z")
    public final boolean method496() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "()Z")
    public final boolean method497() {
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "()Z")
    public final boolean method498() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public final void method499(boolean arg0) {
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "()I")
    public final int method500() {
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "()Z")
    public final boolean method501() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)V")
    public final void method502(boolean arg0) {
    }

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "()Z")
    public final boolean method503() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[I[I)Lsf;")
    public final class421 method504(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class158(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[Ldn;)V")
    public final void method505(int arg0, class16[] arg1) {
    }

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "()V")
    public final void method506() {
    }

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "()Z")
    public final boolean method507() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "()V")
    private final void method508() {
        this.field890 = new class51(20);
        this.field908 = new class367();
        class427.method2673(-83, false, true);
        this.field871 = true;
        this.method492(1);
        this.method527(0);
        this.method472();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lai;)V")
    public final void method509(class305 arg0) {
        class128 var2 = arg0.field4561.field4831;
        for (class128 var3 = var2.field1663; var2 != var3; var3 = var3.field1663) {
            class113 var4 = (class113) var3;
            int var5 = var4.field1473 >> 12;
            int var6 = var4.field1462 >> 12;
            int var7 = var4.field1471 >> 12;
            int var8 = (this.field908.field5417 * var7 + this.field908.field5415 * var5 + this.field908.field5408 * var6 >> 15) + this.field908.field5418;
            if (var8 >= this.field893 && var8 <= this.field907) {
                int var9 = ((this.field908.field5411 * var7 + this.field908.field5416 * var5 + this.field908.field5413 * var6 >> 15) + this.field908.field5407) * this.field876 / var8 + this.field898;
                int var10 = ((this.field908.field5412 * var7 + this.field908.field5414 * var6 + this.field908.field5409 * var5 >> 15) + this.field908.field5410) * this.field892 / var8 + this.field904;
                if (var9 >= this.field881 && var9 <= this.field911 && var10 >= this.field884 && var10 <= this.field883) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method437(var4, var9, var10, (var4.field1463 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(IIIII)V")
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field884 && arg1 < this.field883) {
            if (arg0 < this.field881) {
                arg2 -= this.field881 - arg0;
                arg0 = this.field881;
            }
            if (arg0 + arg2 > this.field911) {
                arg2 = this.field911 - arg0;
            }
            int var6 = this.field889 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field895[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field895[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field895[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field895[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field895[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(IIIIII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method510(arg0, arg1, arg2, arg4, arg5);
        this.method510(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method440(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method440(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "()V")
    private final void method512() {
        if (this.field905 != 0.0F) {
            float var1 = (float) this.field907;
            float var2 = (float) this.field893;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field906 / (this.field906 + this.field905);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field905;
            this.field899 = (int) (((float) this.field907 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field899 = this.field907;
        }
    }

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "(I)[I")
    private final int[] method513(int arg0) {
        class51 var2 = this.field890;
        class187 var3;
        synchronized (this.field890) {
            var3 = (class187) this.field890.method378((byte) 28, (long) arg0);
            if (var3 == null) {
                if (!this.field909.method1960(false, arg0)) {
                    return null;
                }
                class3 var5 = this.field909.method1962(arg0, -11999);
                int var6 = !var5.field34 && !this.field900 ? 128 : 64;
                var3 = new class187(arg0, var6, this.field909.method1958(22410, var6, var6, true, arg0, 0.7F), var5.field38);
                this.field890.method367((long) arg0, var3, true);
            }
        }
        var3.field2557 = true;
        return var3.method1247();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([IIIII)Ll;")
    public final class315 method514(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class34(this, arg0, arg1, arg2, arg3, arg4) : new class343(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class34(this, arg0, arg1, arg2, arg3, arg4) : new class343(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILsf;II)V")
    public final void method515(int arg0, class421 arg1, int arg2, int arg3) {
        class158 var5 = (class158) arg1;
        int[] var6 = var5.field1988;
        int[] var7 = var5.field1987;
        int var8;
        if (this.field883 < var6.length + arg3) {
            var8 = this.field883 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field884 > arg3) {
            var9 = this.field884 - arg3;
            arg3 = this.field884;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field889 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field881 > var12) {
                    var13 -= this.field881 - var12;
                    var12 = this.field881;
                }
                if (this.field911 < var12 + var13) {
                    var13 = this.field911 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field895[var14++] = arg0;
                }
                var10 += this.field889;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIIIII)Lke;")
    public final class295 method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "()Z")
    public final boolean method517() {
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[I)V")
    public final void method518(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field908.field5417 * arg2 + this.field908.field5415 * arg0 + this.field908.field5408 * arg1 >> 15) + this.field908.field5418;
        if (var5 >= this.field893 && var5 <= this.field907) {
            int var6 = ((this.field908.field5411 * arg2 + this.field908.field5416 * arg0 + this.field908.field5413 * arg1 >> 15) + this.field908.field5407) * this.field876 / var5;
            int var7 = ((this.field908.field5412 * arg2 + this.field908.field5414 * arg1 + this.field908.field5409 * arg0 >> 15) + this.field908.field5410) * this.field892 / var5;
            if (var6 >= this.field894 && var6 <= this.field887 && var7 >= this.field882 && var7 <= this.field888) {
                arg3[0] = var6 - this.field894;
                arg3[1] = var7 - this.field882;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "()Lug;")
    public final class118 method519() {
        class334 var1 = this.method459(Thread.currentThread());
        return var1.field4906;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public final void method520(int arg0) {
        int var2 = arg0 - this.field879;
        for (Object var3 = this.field890.method373(126); var3 != null; var3 = this.field890.method374((byte) 110)) {
            class187 var4 = (class187) var3;
            if (var4.field2557) {
                var4.field2560 += var2;
                int var5 = var4.field2560 / 20;
                if (var5 > 0) {
                    class3 var6 = this.field909.method1962(var4.field2562, -11999);
                    var4.method1246(var6.field30 * var2 * 50 / 1000, var6.field42 * var2 * 50 / 1000);
                    var4.field2560 -= var5 * 20;
                }
                var4.field2557 = false;
            }
        }
        this.field879 = arg0;
        this.field886.method379(5, false);
    }

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "()Z")
    public final boolean method521() {
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "()V")
    public final void method522() {
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class315 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field889 * arg1 + arg0;
        int var8 = this.field889 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field895[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class34(this, var6, arg2, arg3);
        } else {
            return new class343(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "()Z")
    public final boolean method524() {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public final void method525(int arg0, int arg1, int arg2) {
        this.field913 = this.field897;
        this.field891 = arg0;
        this.field897 = arg1;
        this.field877 = arg2;
        this.field901 = true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIILsf;II)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class421 arg6, int arg7, int arg8) {
        class158 var10 = (class158) arg6;
        int[] var11 = var10.field1988;
        int[] var12 = var10.field1987;
        int var13 = this.field884 > arg8 ? this.field884 : arg8;
        int var14 = this.field883 < var11.length + arg8 ? this.field883 : var11.length + arg8;
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
            if (arg0 < this.field881) {
                var18 += (this.field881 - arg0) * var20;
                arg0 = this.field881;
            }
            if (var21 >= this.field911) {
                var21 = this.field911 - 1;
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
                                int var28 = this.field889 * var25 + arg0;
                                int var29 = this.field895[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field895[var28] = var23 + var30;
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
                                int var34 = this.field889 * var31 + arg0;
                                int var35 = this.field895[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field895[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field895[this.field889 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field881 && var64 < this.field911 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field895[this.field889 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field881 && var50 < this.field911 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field889 * arg1 + var50;
                        int var54 = this.field895[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field895[this.field889 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field881 && var56 < this.field911 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field889 * arg1 + var56;
                        int var60 = this.field895[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field895[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public final void method527(int arg0) {
        this.field878[arg0].method2183(Thread.currentThread(), 4096);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lwh;I)V")
    public class59(Canvas arg0, class288 arg1, int arg2) {
        this.field903 = arg0;
        this.field909 = arg1;
        super.field4492 = arg2;
        this.field875 = class4.method21(1, this.field903);
        this.field895 = this.field875.field6225;
        this.field889 = this.field875.field6219;
        this.field917 = this.field875.field6224;
        this.method508();
    }
}
