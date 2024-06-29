import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class70 extends class162 {

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Z")
    private boolean field1006;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Z")
    private boolean field1010;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Lbj;")
    private class159 field1008;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Z")
    public boolean field1021;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "Z")
    private boolean field1034;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "Lff;")
    private class9 field1045;

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "Lff;")
    private class9 field1046;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lpj;")
    public class98 field1022;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "F")
    private float field1020;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "F")
    private float field1040;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lmu;")
    private class195 field1011;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lf;")
    private class529 field1042;

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "Lf;")
    private class529 field1055;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1007;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Z")
    public boolean field1028;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "[I")
    public int[] field1050;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "[Lur;")
    private class374[] field1015;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V", line = 4)
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method530(arg0, arg1, arg2, arg4, arg5);
        this.method530(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method511(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method511(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "()I", line = 11)
    public final int method432() {
        int var1 = this.field1031;
        this.field1031 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "()V", line = 16)
    public final void method433() {
        this.field1046.method67(75);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[I[I)Lea;", line = 22)
    public final class382 method434(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class368(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()V", line = 25)
    public final void method435() {
        if (this.field1007 != null && this.field1011 != null) {
            try {
                Graphics var1 = this.field1007.getGraphics();
                this.field1011.method26(28229, var1, 0, 0);
            } catch (Exception var2) {
                this.field1007.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqb;)V", line = 42)
    public final void method436(class148 arg0) {
        class82 var2 = arg0.field2090.field2362;
        for (class82 var3 = var2.field1151; var2 != var3; var3 = var3.field1151) {
            class151 var4 = (class151) var3;
            int var5 = var4.field2117 >> 12;
            int var6 = var4.field2120 >> 12;
            int var7 = var4.field2125 >> 12;
            int var8 = (this.field1022.field1354 * var7 + this.field1022.field1356 * var5 + this.field1022.field1355 * var6 >> 15) + this.field1022.field1359;
            if (var8 >= this.field1033 && var8 <= this.field1018) {
                int var9 = ((this.field1022.field1362 * var7 + this.field1022.field1360 * var6 + this.field1022.field1358 * var5 >> 15) + this.field1022.field1351) * this.field1035 / var8 + this.field1027;
                int var10 = ((this.field1022.field1352 * var7 + this.field1022.field1361 * var5 + this.field1022.field1357 * var6 >> 15) + this.field1022.field1353) * this.field1049 / var8 + this.field1023;
                if (var9 >= this.field1037 && var9 <= this.field1013 && var10 >= this.field1014 && var10 <= this.field1051) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method480(var4, var9, var10, (var4.field2128 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "(Lia;)V", line = 78)
    public final void method437(class415 arg0) {
        this.field1022 = (class98) arg0;
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)[I", line = 82)
    public final int[] method438(int arg0) {
        class9 var2 = this.field1046;
        class73 var3;
        synchronized (this.field1046) {
            var3 = (class73) this.field1046.method56((long) arg0, 46);
            if (var3 == null) {
                if (!super.field2312.method831(arg0, -63)) {
                    return null;
                }
                class501 var5 = super.field2312.method830(arg0, (byte) 71);
                int var6 = !var5.field7380 && !this.field1034 ? 128 : 64;
                var3 = new class73(arg0, var6, super.field2312.method833(true, var6, 0.7F, -12422, var6, arg0), var5.field7373);
                this.field1046.method73((long) arg0, var3, 26425);
            }
        }
        var3.field1085 = true;
        return var3.method548();
    }

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "()F", line = 102)
    public final float method439() {
        return this.field1040;
    }

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(FF)V", line = 105)
    public final void method440(float arg0, float arg1) {
        this.field1020 = arg0;
        this.field1040 = arg1;
        this.method497();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Z", line = 110)
    public final boolean method441() {
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 113)
    public final void method442(int arg0) {
        if (this.field1052 != arg0) {
            this.field1052 = arg0;
            this.field1015 = new class374[this.field1052];
            for (int var2 = 0; var2 < this.field1052; ++var2) {
                this.field1015[var2] = new class374(this);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "IA", descriptor = "(IIII)[I", line = 130)
    public final int[] method443(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field1047 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field1050[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIII)V", line = 155)
    public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field2312.method830(arg5, (byte) 71).field7371) {
                if (this.field1054 != arg5) {
                    class529 var10 = (class529) this.field1045.method56((long) arg5, 100);
                    if (var10 == null) {
                        int[] var11 = this.method475(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method489(arg5) ? 64 : 128;
                        var10 = this.method476(var11, 0, var12, var12, var12);
                        this.field1045.method73((long) arg5, var10, 26425);
                    }
                    this.field1054 = arg5;
                    this.field1055 = var10;
                }
                this.field1055.method119(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method506(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "()Z", line = 189)
    public final boolean method445() {
        return this.field1006;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "()V", line = 192)
    public final void method446() {
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()I", line = 195)
    public final int method447() {
        return this.field1033;
    }

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "(III)V", line = 201)
    public final void method448(int arg0, int arg1, int arg2) {
        this.field1019 = arg0 & 16777215;
        int var4 = this.field1019 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field1019 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field1019 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field1019 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field1028 = false;
        } else {
            this.field1028 = true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 225)
    public final void method449(Canvas arg0) {
        if (arg0 != null) {
            class195 var2 = (class195) this.field1008.method979((byte) 28, (long) arg0.hashCode());
            if (var2 != null) {
                this.field1007 = arg0;
                this.field1011 = var2;
                if (this.field1042 == null) {
                    this.field1050 = var2.field2782;
                    this.field1047 = var2.field2786;
                    this.field1036 = var2.field2783;
                    this.method477();
                    return;
                }
            }
        } else {
            this.field1007 = null;
            this.field1011 = null;
            if (this.field1042 == null) {
                this.field1050 = null;
                this.field1047 = this.field1036 = 1;
                this.method477();
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "()Z", line = 259)
    public final boolean method450() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V", line = 261)
    public final void method451(boolean arg0) {
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)Z", line = 264)
    public final boolean method452(int arg0) {
        return super.field2312.method831(arg0, 108);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lc;Lia;[Lnh;I)V", line = 268)
    public final void method453(class121[] arg0, class415 arg1, class525[] arg2, int arg3) {
        class491[] var5 = new class491[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class491) arg0[var6];
            }
        }
        class491 var7 = class491.method2914(this, var5);
        var7.method2909(arg1, arg2 != null ? arg2[0] : null, (class148) null, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIZ)Lf;", line = 284)
    public final class529 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field1047 * arg1 + arg0;
        int var8 = this.field1047 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field1050[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class165(this, var6, arg2, arg3);
        } else {
            return new class431(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIF)Lpe;", line = 316)
    public final class432 method455(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "()V", line = 319)
    private final void method456() {
        this.field1044 = this.field1037 - this.field1027;
        this.field1053 = this.field1013 - this.field1027;
        this.field1038 = this.field1014 - this.field1023;
        this.field1041 = this.field1051 - this.field1023;
        for (int var1 = 0; var1 < this.field1052; ++var1) {
            class513 var5 = this.field1015[var1].field5224;
            var5.field7536 = this.field1027 - this.field1037;
            var5.field7538 = this.field1023 - this.field1014;
            var5.field7537 = this.field1013 - this.field1037;
            var5.field7543 = this.field1051 - this.field1014;
        }
        int var2 = this.field1047 * this.field1014 + this.field1037;
        for (int var3 = this.field1014; var3 < this.field1051; ++var3) {
            for (int var4 = 0; var4 < this.field1052; ++var4) {
                this.field1015[var4].field5224.field7540[var3 - this.field1014] = var2;
            }
            var2 += this.field1047;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lc;Lqb;Lia;[Lnh;I)V", line = 358)
    public final void method457(class121[] arg0, class148 arg1, class415 arg2, class525[] arg3, int arg4) {
        class491[] var6 = new class491[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class491) arg0[var7];
            }
        }
        class491 var8 = class491.method2914(this, var6);
        var8.method2909(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "JA", descriptor = "(II)V", line = 374)
    public final void method458(int arg0, int arg1) {
        this.field1033 = arg0;
        this.field1029 = arg1;
        this.field1018 = this.field1029 - 255;
        this.method497();
    }

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(IIIIII)V", line = 380)
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field1037) {
            arg2 -= this.field1037 - arg0;
            arg0 = this.field1037;
        }
        if (arg1 < this.field1014) {
            arg3 -= this.field1014 - arg1;
            arg1 = this.field1014;
        }
        if (arg0 + arg2 > this.field1013) {
            arg2 = this.field1013 - arg0;
        }
        if (arg1 + arg3 > this.field1051) {
            arg3 = this.field1051 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field1013 && arg1 <= this.field1051) {
            int var7 = this.field1047 - arg2;
            int var8 = this.field1047 * arg1 + arg0;
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
                            this.field1050[var24] = arg4;
                            ++var24;
                            this.field1050[var24] = arg4;
                            ++var24;
                            this.field1050[var24] = arg4;
                            ++var24;
                            this.field1050[var24] = arg4;
                            ++var24;
                            this.field1050[var24] = arg4;
                            ++var24;
                            this.field1050[var24] = arg4;
                            ++var24;
                            this.field1050[var24] = arg4;
                            ++var24;
                            this.field1050[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field1050[var24] = arg4;
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
                        int var14 = this.field1050[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field1050[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field1050[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field1050[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "()I", line = 517)
    public final int method460() {
        return this.field1029;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 520)
    public final void method461(Rectangle[] arg0, int arg1) {
        if (this.field1007 != null && this.field1011 != null) {
            try {
                Graphics var3 = this.field1007.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field1047 && var5.y <= this.field1036 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field1011.method28(var3, var5.height, var5.y, var5.x, var5.width, 0);
                    }
                }
            } catch (Exception var6) {
                this.field1007.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ra", name = "pa", descriptor = "(IIII)V", line = 549)
    public final void method462(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field1047) {
            arg2 = this.field1047;
        }
        if (arg3 > this.field1036) {
            arg3 = this.field1036;
        }
        this.field1037 = arg0;
        this.field1013 = arg2;
        this.field1014 = arg1;
        this.field1051 = arg3;
        this.method456();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I", line = 568)
    public final int method463(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lpv;Lpv;FLpv;)Lpv;", line = 571)
    public final class50 method464(class50 arg0, class50 arg1, float arg2, class50 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "()Z", line = 574)
    public final boolean method465() {
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "ba", descriptor = "(IIII)V", line = 577)
    public final void method466(int arg0, int arg1, int arg2, int arg3) {
        this.field1043 = arg0;
        this.field1019 = arg1;
        this.field1039 = arg2;
    }

    @OriginalMember(owner = "client!ra", name = "GA", descriptor = "(IIII)V", line = 582)
    public final void method467(int arg0, int arg1, int arg2, int arg3) {
        this.field1027 = arg0;
        this.field1023 = arg1;
        this.field1035 = arg2;
        this.field1049 = arg3;
        this.method456();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V", line = 590)
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class374 var8 = this.method523(Thread.currentThread());
        class513 var9 = var8.field5224;
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
            int var21 = arg0 - var9.method3018();
            int var22 = arg1 - var9.method3020();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field7542 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field7542 = 255 - (arg4 >> 24);
            }
            var9.field7544 = var23 < 0 || var23 > var9.field7537 || var24 < 0 || var24 > var9.field7537 || var25 < 0 || var25 > var9.field7537;
            var9.method3014(var27, var28, var29, var23, var24, var25, arg4);
            var9.field7544 = var23 < 0 || var23 > var9.field7537 || var24 < 0 || var24 > var9.field7537 || var26 < 0 || var26 > var9.field7537;
            var9.method3014(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V", line = 658)
    public final void method469(boolean arg0) {
    }

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "()Z", line = 661)
    public final boolean method470() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "()Z", line = 664)
    public final boolean method471() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)I", line = 667)
    public final int method472(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 672)
    public final void method473(Canvas arg0) {
        class195 var2 = (class195) this.field1008.method979((byte) 28, (long) arg0.hashCode());
        if (var2 == null) {
            class195 var3 = class249.method1465((byte) 89, arg0);
            this.field1008.method990((long) arg0.hashCode(), (byte) 7, var3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()Z", line = 682)
    public final boolean method474() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)[I", line = 687)
    private final int[] method475(int arg0) {
        class9 var2 = this.field1046;
        class73 var3;
        synchronized (this.field1046) {
            var3 = (class73) this.field1046.method56((long) arg0, 112);
            if (var3 == null) {
                if (!super.field2312.method831(arg0, -97)) {
                    return null;
                }
                class501 var5 = super.field2312.method830(arg0, (byte) 71);
                int var6 = !var5.field7380 && !this.field1034 ? 128 : 64;
                var3 = new class73(arg0, var6, super.field2312.method834(true, 0.7F, arg0, var6, -126, var6), var5.field7373);
                this.field1046.method73((long) arg0, var3, 26425);
            }
        }
        var3.field1085 = true;
        return var3.method548();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIII)Lf;", line = 708)
    public final class529 method476(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class165(this, arg0, arg1, arg2, arg3, arg4) : new class431(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class165(this, arg0, arg1, arg2, arg3, arg4) : new class431(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "()V", line = 745)
    private final void method477() {
        for (int var1 = 0; var1 < this.field1052; ++var1) {
            this.field1015[var1].method2160((byte) 103);
        }
        this.method526();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ll;)V", line = 752)
    public final void method478(class16 arg0) {
    }

    @OriginalMember(owner = "client!ra", name = "aa", descriptor = "(IIIIII[BII)V", line = 756)
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field1047 * arg1 + arg0;
            int var15 = this.field1047 - arg2;
            if (arg1 + arg3 > this.field1051) {
                arg3 -= arg1 + arg3 - this.field1051;
            }
            if (arg1 < this.field1014) {
                int var16 = this.field1014 - arg1;
                arg3 -= var16;
                var14 += this.field1047 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field1013) {
                int var17 = arg0 + arg2 - this.field1013;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field1037) {
                int var18 = this.field1037 - arg0;
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
                            int var28 = this.field1050[var14];
                            this.field1050[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field1050[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field1050[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field1050[var14++] = arg5;
                        } else {
                            this.field1050[var14++] = arg4;
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

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lui;III)V", line = 933)
    public final void method480(class151 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field2122;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method506(arg1, arg2, var6, arg0.field2121, 1);
        } else {
            if (this.field1054 != var5) {
                class529 var7 = (class529) this.field1045.method56((long) var5, 110);
                if (var7 == null) {
                    int[] var8 = this.method475(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method489(var5) ? 64 : 128;
                    var7 = this.method476(var8, 0, var9, var9, var9);
                    this.field1045.method73((long) var5, var7, 26425);
                }
                this.field1054 = var5;
                this.field1055 = var7;
            }
            if (this.field1055.method126() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field1055.method119(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field2121, 1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "()Z", line = 975)
    public final boolean method481() {
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lmp;Z)Lf;", line = 980)
    public final class529 method482(class531 arg0, boolean arg1) {
        int[] var3 = arg0.field7816;
        byte[] var4 = arg0.field7817;
        int var5 = arg0.field7821;
        int var6 = arg0.field7815;
        class211 var11;
        if (arg1 && arg0.field7813 == null) {
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
            var11 = new class445(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field7813;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class165(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class165(this, var14, var5, var6);
                var11 = new class431(this, var14, var5, var6);
            }
        }
        var11.method118(arg0.field7814, arg0.field7820, arg0.field7818, arg0.field7819);
        return var11;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFF)V", line = 1081)
    public final void method483(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ra", name = "FA", descriptor = "()I", line = 1084)
    public final int method484() {
        return 0;
    }

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "()Z", line = 1087)
    public final boolean method485() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 1091)
    public final void method486(int arg0) {
        this.field1015[arg0].method2159((byte) -90, (Runnable) null);
    }

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "()Z", line = 1094)
    public final boolean method487() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "(I)Z", line = 1097)
    public final boolean method488(int arg0) {
        return super.field2312.method830(arg0, (byte) 71).field7381;
    }

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "(I)Z", line = 1100)
    public final boolean method489(int arg0) {
        return this.field1034 || super.field2312.method830(arg0, (byte) 71).field7380;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[Lpe;)V", line = 1105)
    public final void method490(int arg0, class432[] arg1) {
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILm;)V", line = 1108)
    private class70(int arg0, class126 arg1) {
        super(arg0, arg1);
        this.field1006 = false;
        this.field1010 = false;
        this.field1008 = new class159(4);
        this.field1012 = 75518;
        this.field1019 = 0;
        this.field1013 = 0;
        this.field1024 = 0;
        this.field1031 = 0;
        this.field1021 = false;
        this.field1017 = 45823;
        this.field1030 = 78642;
        this.field1014 = 0;
        this.field1032 = 0;
        this.field1035 = 512;
        this.field1029 = 3500;
        this.field1037 = 0;
        this.field1034 = false;
        this.field1043 = 0;
        this.field1048 = 3500;
        this.field1039 = 0;
        this.field1018 = this.field1029 - 255;
        this.field1033 = 50;
        this.field1049 = 512;
        this.field1051 = 0;
        this.field1045 = new class9(16);
        this.field1054 = -1;
        this.field1046 = new class9(20);
        this.field1022 = new class98();
        this.method442(1);
        this.method534(0);
        class51.method315(true, false, 0);
        this.field1010 = true;
    }

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "()Lia;", line = 1117)
    public final class415 method491() {
        return new class98();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIII)V", line = 1121)
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class374 var11 = this.method523(Thread.currentThread());
        class513 var12 = var11.field5224;
        var12.field7533 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field7533 = false;
            var12.field7542 = 0;
            var12.field7544 = true;
            var12.method3016(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field7533 = false;
            var12.field7542 = 255 - var13;
            var12.field7544 = true;
            var12.method3016(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field7533 = true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)V", line = 1154)
    public final void method493(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "(I)I", line = 1158)
    public final int method494(int arg0) {
        return super.field2312.method830(arg0, (byte) 71).field7367 & 65535;
    }

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "()Z", line = 1161)
    public final boolean method495() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V", line = 1165)
    public final void method496(int arg0) {
        int var2 = arg0 - this.field1009;
        for (Object var3 = this.field1046.method58(0); var3 != null; var3 = this.field1046.method60(-7681)) {
            class73 var4 = (class73) var3;
            if (var4.field1085) {
                var4.field1082 += var2;
                int var5 = var4.field1082 / 20;
                if (var5 > 0) {
                    class501 var6 = super.field2312.method830(var4.field1080, (byte) 71);
                    var4.method549(var6.field7382 * var2 * 50 / 1000, var6.field7358 * var2 * 50 / 1000);
                    var4.field1082 -= var5 * 20;
                }
                var4.field1085 = false;
            }
        }
        this.field1009 = arg0;
        this.field1045.method61((byte) -67, 5);
    }

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "()V", line = 1198)
    private final void method497() {
        if (this.field1040 != 0.0F) {
            float var1 = (float) this.field1029;
            float var2 = (float) this.field1033;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field1020 / (this.field1040 + this.field1020);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field1040;
            this.field1048 = (int) (((float) this.field1029 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field1048 = this.field1029;
        }
    }

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "()V", line = 1218)
    public final void method498() {
    }

    @OriginalMember(owner = "client!ra", name = "la", descriptor = "()F", line = 1221)
    public final float method499() {
        return this.field1020;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 1224)
    public final void method500(boolean arg0) {
        this.field1034 = arg0;
        this.field1046.method67(87);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Ll;", line = 1228)
    public final class16 method501(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "fa", descriptor = "(IIII)V", line = 1231)
    public final void method502(int arg0, int arg1, int arg2, int arg3) {
        this.field1032 = this.field1019;
        this.field1043 = arg0;
        this.field1019 = arg1;
        this.field1039 = arg2;
        this.field1021 = true;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1238)
    public final void method503(Canvas arg0) {
        if (this.field1007 == arg0) {
            this.method449((Canvas) null);
        }
        class195 var2 = (class195) this.field1008.method979((byte) 28, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2946(-93);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(IIIIII)V", line = 1248)
    public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method530(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method530(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method511(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method511(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field1037) {
                    var10 += (this.field1037 - arg0) * var12;
                    arg0 = this.field1037;
                }
                if (var13 >= this.field1013) {
                    var13 = this.field1013 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field1014 && var17 < this.field1051) {
                                int var18 = this.field1047 * var17 + arg0;
                                int var19 = this.field1050[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field1050[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field1014 && var21 < this.field1051) {
                                int var22 = this.field1047 * var21 + arg0;
                                int var23 = this.field1050[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field1050[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field1014 && var27 < this.field1051) {
                            this.field1050[this.field1047 * var27 + arg0] = arg4;
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
                if (arg1 < this.field1014) {
                    var29 += (this.field1014 - arg1) * var31;
                    arg1 = this.field1014;
                }
                if (var32 >= this.field1051) {
                    var32 = this.field1051 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field1037 && var46 < this.field1013) {
                            this.field1050[this.field1047 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field1037 && var36 < this.field1013) {
                            int var37 = this.field1047 * arg1 + var36;
                            int var38 = this.field1050[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field1050[this.field1047 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field1037 && var40 < this.field1013) {
                            int var41 = this.field1047 * arg1 + var40;
                            int var42 = this.field1050[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field1050[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V", line = 1461)
    public final void method505() {
    }

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "(IIIII)V", line = 1464)
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field1014) {
            var6 = this.field1014;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field1051) {
            var7 = this.field1051;
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
                if (var64 < this.field1037) {
                    var64 = this.field1037;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field1013) {
                    var65 = this.field1013;
                }
                int var66 = this.field1047 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field1050[var66++] = arg3;
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
                if (var60 < this.field1037) {
                    var60 = this.field1037;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field1013 - 1) {
                    var61 = this.field1013 - 1;
                }
                int var62 = this.field1047 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field1050[var62++] = arg3;
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
                if (var28 < this.field1037) {
                    var28 = this.field1037;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field1013) {
                    var29 = this.field1013;
                }
                int var30 = this.field1047 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field1050[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field1050[var30++] = var15 + var33;
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
                if (var22 < this.field1037) {
                    var22 = this.field1037;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field1013 - 1) {
                    var23 = this.field1013 - 1;
                }
                int var24 = this.field1047 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field1050[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field1050[var24++] = var15 + var27;
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
                if (var47 < this.field1037) {
                    var47 = this.field1037;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field1013) {
                    var48 = this.field1013;
                }
                int var49 = this.field1047 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field1050[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field1050[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field1037) {
                    var39 = this.field1037;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field1013 - 1) {
                    var40 = this.field1013 - 1;
                }
                int var41 = this.field1047 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field1050[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field1050[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;)V", line = 1750)
    public class70(int arg0, Canvas arg1, class126 arg2) {
        this(arg0, arg2);
        this.method473(arg1);
        this.method449(arg1);
    }

    @OriginalMember(owner = "client!ra", name = "SA", descriptor = "(IIIIII)Z", line = 1757)
    public final boolean method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field1022.field1354 * arg2 + this.field1022.field1356 * arg0 + this.field1022.field1355 * arg1 >> 15) + this.field1022.field1359;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field1022.field1354 * arg5 + this.field1022.field1356 * arg3 + this.field1022.field1355 * arg4 >> 15) + this.field1022.field1359;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field1033 || var8 >= this.field1033) && (var7 <= this.field1029 || var8 <= this.field1029)) {
            int var9 = ((this.field1022.field1362 * arg2 + this.field1022.field1360 * arg1 + this.field1022.field1358 * arg0 >> 15) + this.field1022.field1351) * this.field1035 / var7;
            int var10 = ((this.field1022.field1362 * arg5 + this.field1022.field1360 * arg4 + this.field1022.field1358 * arg3 >> 15) + this.field1022.field1351) * this.field1035 / var8;
            if (var9 < this.field1044 && var10 < this.field1044 || var9 > this.field1053 && var10 > this.field1053) {
                return false;
            } else {
                int var11 = ((this.field1022.field1352 * arg2 + this.field1022.field1361 * arg0 + this.field1022.field1357 * arg1 >> 15) + this.field1022.field1353) * this.field1049 / var7;
                int var12 = ((this.field1022.field1352 * arg5 + this.field1022.field1361 * arg3 + this.field1022.field1357 * arg4 >> 15) + this.field1022.field1353) * this.field1049 / var8;
                return (var11 >= this.field1038 || var12 >= this.field1038) && (var11 <= this.field1041 || var12 <= this.field1041);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "()V", line = 1785)
    public final void method508() {
    }

    @OriginalMember(owner = "client!ra", name = "xa", descriptor = "()I", line = 1789)
    public final int method509() {
        int var1 = this.field1024;
        this.field1024 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "()V", line = 1795)
    public final void method510() {
        this.field1019 = this.field1032;
        this.field1021 = false;
    }

    @OriginalMember(owner = "client!ra", name = "da", descriptor = "(IIIII)V", line = 1799)
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field1037 && arg0 < this.field1013) {
            if (arg1 < this.field1014) {
                arg2 -= this.field1014 - arg1;
                arg1 = this.field1014;
            }
            if (arg1 + arg2 > this.field1051) {
                arg2 = this.field1051 - arg1;
            }
            int var6 = this.field1047 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1047 * var10 + var6;
                        int var12 = this.field1050[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field1050[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field1047 * var14 + var6;
                        int var16 = this.field1050[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field1050[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field1050[this.field1047 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lc;Lqb;Lia;Lnh;I)V", line = 1875)
    public final void method512(class121 arg0, class148 arg1, class415 arg2, class525 arg3, int arg4) {
        ((class491) arg0).method2909(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "()Z", line = 1878)
    public final boolean method513() {
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "([I)V", line = 1881)
    public final void method514(int[] arg0) {
        arg0[0] = this.field1037;
        arg0[1] = this.field1014;
        arg0[2] = this.field1013;
        arg0[3] = this.field1051;
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "()Z", line = 1887)
    public final boolean method515() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "(IIII)V", line = 1890)
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1037 < arg0) {
            this.field1037 = arg0;
        }
        if (this.field1014 < arg1) {
            this.field1014 = arg1;
        }
        if (this.field1013 > arg2) {
            this.field1013 = arg2;
        }
        if (this.field1051 > arg3) {
            this.field1051 = arg3;
        }
        this.method456();
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "(ILea;II)V", line = 1906)
    public final void method517(int arg0, class382 arg1, int arg2, int arg3) {
        class368 var5 = (class368) arg1;
        int[] var6 = var5.field5171;
        int[] var7 = var5.field5170;
        int var8;
        if (this.field1051 < var6.length + arg3) {
            var8 = this.field1051 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field1014 > arg3) {
            var9 = this.field1014 - arg3;
            arg3 = this.field1014;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field1047 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field1037 > var12) {
                    var13 -= this.field1037 - var12;
                    var12 = this.field1037;
                }
                if (this.field1013 < var12 + var13) {
                    var13 = this.field1013 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field1050[var14++] = arg0;
                }
                var10 += this.field1047;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 1963)
    public final class35 method518(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class395(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lgv;[Lmp;Z)Loa;", line = 1967)
    public final class490 method519(class56 arg0, class531[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7821;
            var5[var7] = arg1[var7].field7815;
            if (arg1[var7].field7813 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class303(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class72(this, arg0, arg1, var4, var5);
        } else {
            return new class381(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ra", name = "XA", descriptor = "(IFFFFF)V", line = 1996)
    public final void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field1017 = (int) (arg1 * 65535.0F);
        this.field1030 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field1026 = (int) (arg3 * 65535.0F / var7);
        this.field1025 = (int) (arg4 * 65535.0F / var7);
        this.field1016 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIIII)Lpv;", line = 2005)
    public final class50 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(I)V", line = 2007)
    public final void method522(int arg0) {
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/Runnable;)Lur;", line = 2013)
    public final class374 method523(Runnable arg0) {
        for (int var2 = 0; var2 < this.field1052; ++var2) {
            if (this.field1015[var2].field5216 == arg0) {
                return this.field1015[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lpv;)V", line = 2024)
    public final void method524(class50 arg0) {
    }

    @OriginalMember(owner = "client!ra", name = "ua", descriptor = "(F)V", line = 2027)
    public final void method525(float arg0) {
        this.field1012 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ra", name = "va", descriptor = "()V", line = 2030)
    public final void method526() {
        this.field1037 = 0;
        this.field1014 = 0;
        this.field1013 = this.field1047;
        this.field1051 = this.field1036;
        this.method456();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 2037)
    public final void method527(int arg0) {
    }

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "()I", line = 2041)
    public final int method528() {
        return 0;
    }

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "()Z", line = 2044)
    public final boolean method529() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(IIIII)V", line = 2050)
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field1014 && arg1 < this.field1051) {
            if (arg0 < this.field1037) {
                arg2 -= this.field1037 - arg0;
                arg0 = this.field1037;
            }
            if (arg0 + arg2 > this.field1013) {
                arg2 = this.field1013 - arg0;
            }
            int var6 = this.field1047 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1050[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field1050[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field1050[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field1050[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field1050[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "()Z", line = 2125)
    public final boolean method531() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(I)V", line = 2129)
    public final void method532(int arg0) {
        this.method459(0, 0, this.field1047, this.field1036, arg0, 0);
    }

    @OriginalMember(owner = "client!ra", name = "ia", descriptor = "(III[I)V", line = 2133)
    public final void method533(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field1022.field1354 * arg2 + this.field1022.field1356 * arg0 + this.field1022.field1355 * arg1 >> 15) + this.field1022.field1359;
        if (var5 >= this.field1033 && var5 <= this.field1029) {
            int var6 = ((this.field1022.field1362 * arg2 + this.field1022.field1360 * arg1 + this.field1022.field1358 * arg0 >> 15) + this.field1022.field1351) * this.field1035 / var5;
            int var7 = ((this.field1022.field1352 * arg2 + this.field1022.field1361 * arg0 + this.field1022.field1357 * arg1 >> 15) + this.field1022.field1353) * this.field1049 / var5;
            if (var6 >= this.field1044 && var6 <= this.field1053 && var7 >= this.field1038 && var7 <= this.field1041) {
                arg3[0] = var6 - this.field1044;
                arg3[1] = var7 - this.field1038;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V", line = 2157)
    public final void method534(int arg0) {
        this.field1015[arg0].method2159((byte) -111, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()V", line = 2160)
    public final void method535() {
        if (this.field1010) {
            class455.method2686(false, 22485, true);
            this.field1010 = false;
        }
        this.field1011 = null;
        this.field1007 = null;
        this.field1008 = null;
        this.field1006 = true;
    }

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "()Z", line = 2195)
    public final boolean method536() {
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILea;II)V", line = 2206)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class382 arg6, int arg7, int arg8) {
        class368 var10 = (class368) arg6;
        int[] var11 = var10.field5171;
        int[] var12 = var10.field5170;
        int var13 = this.field1014 > arg8 ? this.field1014 : arg8;
        int var14 = this.field1051 < var11.length + arg8 ? this.field1051 : var11.length + arg8;
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
            if (arg0 < this.field1037) {
                var18 += (this.field1037 - arg0) * var20;
                arg0 = this.field1037;
            }
            if (var21 >= this.field1013) {
                var21 = this.field1013 - 1;
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
                                int var28 = this.field1047 * var25 + arg0;
                                int var29 = this.field1050[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field1050[var28] = var23 + var30;
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
                                int var34 = this.field1047 * var31 + arg0;
                                int var35 = this.field1050[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field1050[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field1050[this.field1047 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field1037 && var64 < this.field1013 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field1050[this.field1047 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field1037 && var50 < this.field1013 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field1047 * arg1 + var50;
                        int var54 = this.field1050[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field1050[this.field1047 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field1037 && var56 < this.field1013 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field1047 * arg1 + var56;
                        int var60 = this.field1050[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field1050[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2446)
    public final void method538(Canvas arg0) {
        class195 var2 = (class195) this.field1008.method979((byte) 28, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2946(-116);
            class195 var3 = class249.method1465((byte) 89, arg0);
            this.field1008.method990((long) arg0.hashCode(), (byte) 105, var3);
            if (this.field1007 == arg0 && this.field1042 == null) {
                this.field1011 = var3;
                this.field1050 = var3.field2782;
                this.field1047 = var3.field2786;
                this.field1036 = var3.field2783;
                this.method477();
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "()Lia;", line = 2479)
    public final class415 method539() {
        class374 var1 = this.method523(Thread.currentThread());
        return var1.field5226;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lwk;IIII)Lc;", line = 2487)
    public final class121 method540(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class491(this, arg0, arg1, arg3, arg4, arg2);
    }
}
