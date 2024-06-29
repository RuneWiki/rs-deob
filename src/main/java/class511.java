import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public abstract class class511 extends class207 {

    @OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
    private boolean field7144;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "Z")
    private boolean field7146;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "Ldea;")
    public class205 field7145;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public int field7150;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public int field7160;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "I")
    public int field7167;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public int field7165;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "Z")
    public boolean field7152;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public int field7153;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    private int field7158;

    @OriginalMember(owner = "client!et", name = "X", descriptor = "I")
    public int field7173;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    private int field7154;

    @OriginalMember(owner = "client!et", name = "ab", descriptor = "I")
    public int field7176;

    @OriginalMember(owner = "client!et", name = "db", descriptor = "Z")
    private boolean field7179;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public int field7161;

    @OriginalMember(owner = "client!et", name = "W", descriptor = "I")
    public int field7172;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "I")
    private int field7164;

    @OriginalMember(owner = "client!et", name = "eb", descriptor = "I")
    public int field7180;

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public int field7170;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public int field7163;

    @OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
    public int field7175;

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public int field7166;

    @OriginalMember(owner = "client!et", name = "ob", descriptor = "I")
    private int field7190;

    @OriginalMember(owner = "client!et", name = "nb", descriptor = "I")
    public int field7189;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "Lh;")
    private class571 field7156;

    @OriginalMember(owner = "client!et", name = "rb", descriptor = "I")
    private int field7193;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "Lh;")
    private class571 field7168;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "Ltg;")
    public class195 field7169;

    @OriginalMember(owner = "client!et", name = "kb", descriptor = "F")
    private float field7186;

    @OriginalMember(owner = "client!et", name = "lb", descriptor = "F")
    private float field7187;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    private int field7148;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "I")
    public int field7151;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    public int field7155;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "I")
    public int field7157;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "I")
    public int field7159;

    @OriginalMember(owner = "client!et", name = "Y", descriptor = "I")
    public int field7174;

    @OriginalMember(owner = "client!et", name = "cb", descriptor = "I")
    public int field7178;

    @OriginalMember(owner = "client!et", name = "gb", descriptor = "I")
    public int field7182;

    @OriginalMember(owner = "client!et", name = "hb", descriptor = "I")
    public int field7183;

    @OriginalMember(owner = "client!et", name = "ib", descriptor = "I")
    public int field7184;

    @OriginalMember(owner = "client!et", name = "jb", descriptor = "I")
    public int field7185;

    @OriginalMember(owner = "client!et", name = "mb", descriptor = "I")
    public int field7188;

    @OriginalMember(owner = "client!et", name = "pb", descriptor = "I")
    public int field7191;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "Lat;")
    public class316 field7147;

    @OriginalMember(owner = "client!et", name = "fb", descriptor = "Lha;")
    public class52 field7181;

    @OriginalMember(owner = "client!et", name = "qb", descriptor = "Lha;")
    private class52 field7192;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7149;

    @OriginalMember(owner = "client!et", name = "V", descriptor = "Z")
    public boolean field7171;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "[I")
    public int[] field7162;

    @OriginalMember(owner = "client!et", name = "bb", descriptor = "[Lch;")
    public class394[] field7177;

    @OriginalMember(owner = "client!et", name = "UA", descriptor = "(IIIII)V")
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field7160 && arg1 < this.field7173) {
            if (arg0 < this.field7165) {
                arg2 -= this.field7165 - arg0;
                arg0 = this.field7165;
            }
            if (arg0 + arg2 > this.field7170) {
                arg2 = this.field7170 - arg0;
            }
            int var6 = this.field7182 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7162[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field7162[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field7162[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field7162[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field7162[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIII)Lsv;")
    public final class567 method1261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!et", name = "w", descriptor = "()Z")
    public final boolean method2951() {
        return this.field7144;
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "(I)Z")
    public final boolean method2952(int arg0) {
        return super.field2924.method188(arg0, -121);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lr;Lhp;Lm;Lkn;I)V")
    public final void method1366(class157 arg0, class274 arg1, class163 arg2, class631 arg3, int arg4) {
        ((class24) arg0).method289(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "()Z")
    public final boolean method1285() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "G", descriptor = "(ILpa;II)V")
    public final void method1347(int arg0, class310 arg1, int arg2, int arg3) {
        class491 var5 = (class491) arg1;
        int[] var6 = var5.field6873;
        int[] var7 = var5.field6874;
        int var8;
        if (this.field7173 < var6.length + arg3) {
            var8 = this.field7173 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field7160 > arg3) {
            var9 = this.field7160 - arg3;
            arg3 = this.field7160;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field7182 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field7165 > var12) {
                    var13 -= this.field7165 - var12;
                    var12 = this.field7165;
                }
                if (this.field7170 < var12 + var13) {
                    var13 = this.field7170 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field7162[var14++] = arg0;
                }
                var10 += this.field7182;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "M", descriptor = "(F)V")
    public final void method1295(float arg0) {
        this.field7163 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([Lr;Lhp;Lm;[Lkn;I)V")
    public abstract void method1288(class157[] arg0, class274 arg1, class163 arg2, class631[] arg3, int arg4);

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lbt;Z)Lha;")
    public final class52 method1332(class38 arg0, boolean arg1) {
        int[] var3 = arg0.field784;
        byte[] var4 = arg0.field782;
        int var5 = arg0.field785;
        int var6 = arg0.field783;
        class44 var11;
        if (arg1 && arg0.field790 == null) {
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
            var11 = new class149(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field790;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class460(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class581(this, var14, var5, var6);
            }
        }
        var11.method420(arg0.field787, arg0.field786, arg0.field789, arg0.field788);
        return var11;
    }

    @OriginalMember(owner = "client!et", name = "s", descriptor = "()Z")
    public final boolean method1323() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "m", descriptor = "()Z")
    public final boolean method1310() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "i", descriptor = "(I)I")
    public final int method2953(int arg0) {
        return super.field2924.method190((byte) -89, arg0).field2967 & 65535;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lsv;Lsv;FLsv;)Lsv;")
    public final class567 method1281(class567 arg0, class567 arg1, float arg2, class567 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!et", name = "xa", descriptor = "()V")
    public final void method1352() {
        this.field7180 = this.field7154;
        this.field7152 = false;
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "()V")
    public final void method1276() {
        if (this.field7146) {
            class278.method1792(false, true, false);
            this.field7146 = false;
        }
        this.field7147 = null;
        this.field7149 = null;
        this.field7145 = null;
        this.field7144 = true;
    }

    @OriginalMember(owner = "client!et", name = "j", descriptor = "(I)Z")
    public final boolean method2954(int arg0) {
        return this.field7179 || super.field2924.method190((byte) -89, arg0).field2965;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
    public void method1280(int arg0) {
        this.field7177[arg0].method2364(Thread.currentThread(), 8190);
    }

    @OriginalMember(owner = "client!et", name = "k", descriptor = "(I)[I")
    public final int[] method2955(int arg0) {
        class571 var2 = this.field7168;
        class129 var3;
        synchronized (this.field7168) {
            var3 = (class129) this.field7168.method3252((long) arg0, (byte) 79);
            if (var3 == null) {
                if (!super.field2924.method188(arg0, -113)) {
                    return null;
                }
                class211 var5 = super.field2924.method190((byte) -89, arg0);
                int var6 = !var5.field2965 && !this.field7179 ? 128 : 64;
                var3 = new class129(arg0, var6, super.field2924.method186(true, arg0, 10350, var6, var6, 0.7F), var5.field2982);
                this.field7168.method3243(var3, (long) arg0, 114);
            }
        }
        var3.field2071 = true;
        return var3.method885();
    }

    @OriginalMember(owner = "client!et", name = "t", descriptor = "()Z")
    public final boolean method1328() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "ba", descriptor = "()I")
    public final int method1287() {
        int var1 = this.field7190;
        this.field7190 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class174 method1270(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!et", name = "JA", descriptor = "(IIII)V")
    public final void method1314(int arg0, int arg1, int arg2, int arg3) {
        this.field7189 = arg0;
        this.field7180 = arg1;
        this.field7175 = arg2;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)I")
    public final int method1306(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!et", name = "ta", descriptor = "(II)V")
    public final void method1290(int arg0, int arg1) {
        this.field7153 = arg0;
        this.field7164 = arg1;
        this.field7166 = this.field7164 - 255;
        this.method2957();
    }

    @OriginalMember(owner = "client!et", name = "E", descriptor = "()V")
    public final void method2956() {
        for (int var1 = 0; var1 < this.field7178; ++var1) {
            this.field7177[var1].method180(-8191);
        }
        this.method1269();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lpu;[Lbt;Z)Lra;")
    public final class91 method1348(class483 arg0, class38[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field785;
            var5[var7] = arg1[var7].field783;
            if (arg1[var7].field790 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class230(this, arg0, arg1, var4, var5);
            } else {
                return new class417(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class289(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "()V")
    public final void method1289() {
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class511(Canvas arg0, class17 arg1) {
        this(arg1);
        this.method1260(arg0);
        this.method1343(arg0);
    }

    @OriginalMember(owner = "client!et", name = "p", descriptor = "()Lla;")
    public final class384 method1317() {
        return new class384(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!et", name = "F", descriptor = "(IIII)V")
    public final void method1303(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7165 < arg0) {
            this.field7165 = arg0;
        }
        if (this.field7160 < arg1) {
            this.field7160 = arg1;
        }
        if (this.field7170 > arg2) {
            this.field7170 = arg2;
        }
        if (this.field7173 > arg3) {
            this.field7173 = arg3;
        }
        this.method1374();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lu;)V")
    public final void method1296(class64 arg0) {
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[Lrh;)V")
    public final void method1311(int arg0, class223[] arg1) {
    }

    @OriginalMember(owner = "client!et", name = "A", descriptor = "()Z")
    public final boolean method1345() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(IIIIII)V")
    public final void method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1329(arg0, arg1, arg2, arg4, arg5);
        this.method1329(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1292(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1292(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!et", name = "A", descriptor = "(IIIII)V")
    public final void method1312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field7160) {
            var6 = this.field7160;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field7173) {
            var7 = this.field7173;
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
                if (var64 < this.field7165) {
                    var64 = this.field7165;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field7170) {
                    var65 = this.field7170;
                }
                int var66 = this.field7182 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field7162[var66++] = arg3;
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
                if (var60 < this.field7165) {
                    var60 = this.field7165;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field7170 - 1) {
                    var61 = this.field7170 - 1;
                }
                int var62 = this.field7182 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field7162[var62++] = arg3;
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
                if (var28 < this.field7165) {
                    var28 = this.field7165;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field7170) {
                    var29 = this.field7170;
                }
                int var30 = this.field7182 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field7162[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field7162[var30++] = var15 + var33;
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
                if (var22 < this.field7165) {
                    var22 = this.field7165;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field7170 - 1) {
                    var23 = this.field7170 - 1;
                }
                int var24 = this.field7182 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field7162[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field7162[var24++] = var15 + var27;
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
                if (var47 < this.field7165) {
                    var47 = this.field7165;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field7170) {
                    var48 = this.field7170;
                }
                int var49 = this.field7182 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field7162[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field7162[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field7165) {
                    var39 = this.field7165;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field7170 - 1) {
                    var40 = this.field7170 - 1;
                }
                int var41 = this.field7182 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field7162[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field7162[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "YA", descriptor = "()I")
    public final int method1339() {
        int var1 = this.field7158;
        this.field7158 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1327(Rectangle[] arg0, int arg1) throws class589 {
        if (this.field7149 != null && this.field7147 != null) {
            try {
                Graphics var3 = this.field7149.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field7182 && var5.y <= this.field7159 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field7147.method1009(var3, var5.width, var5.y, false, var5.height, var5.x);
                    }
                }
            } catch (Exception var6) {
                this.field7149.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ln;)V")
    private class511(class17 arg0) {
        super(arg0);
        this.field7144 = false;
        this.field7146 = false;
        this.field7145 = new class205(4);
        this.field7150 = 78642;
        this.field7160 = 0;
        this.field7167 = 512;
        this.field7165 = 0;
        this.field7152 = false;
        this.field7153 = 50;
        this.field7158 = 0;
        this.field7173 = 0;
        this.field7154 = 0;
        this.field7176 = 512;
        this.field7179 = false;
        this.field7161 = 3500;
        this.field7172 = 45823;
        this.field7164 = 3500;
        this.field7180 = 0;
        this.field7170 = 0;
        this.field7163 = 75518;
        this.field7175 = 0;
        this.field7166 = this.field7164 - 255;
        this.field7190 = 0;
        this.field7189 = 0;
        this.field7156 = new class571(16);
        this.field7193 = -1;
        this.field7168 = new class571(20);
        this.field7169 = new class195();
        this.method1272(1);
        this.method1280(0);
        class568.method3231(110, false, true);
        this.field7146 = true;
    }

    @OriginalMember(owner = "client!et", name = "y", descriptor = "()V")
    public final void method1342() {
    }

    @OriginalMember(owner = "client!et", name = "IA", descriptor = "(III[I)V")
    public final void method1324(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field7169.field2766 * arg2 + this.field7169.field2773 * arg1 + this.field7169.field2771 * arg0 >> 15) + this.field7169.field2764;
        if (var5 >= this.field7153 && var5 <= this.field7164) {
            int var6 = ((this.field7169.field2772 * arg2 + this.field7169.field2770 * arg0 + this.field7169.field2769 * arg1 >> 15) + this.field7169.field2768) * this.field7176 / var5;
            int var7 = ((this.field7169.field2763 * arg2 + this.field7169.field2765 * arg0 + this.field7169.field2762 * arg1 >> 15) + this.field7169.field2767) * this.field7167 / var5;
            if (var6 >= this.field7183 && var6 <= this.field7188 && var7 >= this.field7185 && var7 <= this.field7191) {
                arg3[0] = var6 - this.field7183;
                arg3[1] = var7 - this.field7185;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!et", name = "o", descriptor = "()I")
    public final int method1313() {
        return 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public final void method1283(boolean arg0) {
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lln;IIII)Lr;")
    public abstract class157 method1293(class317 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V")
    public final void method1309(boolean arg0) {
    }

    @OriginalMember(owner = "client!et", name = "v", descriptor = "(IIII)[I")
    public final int[] method1361(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field7182 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field7162[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class52 method1300(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field7182 * arg1 + arg0;
        int var8 = this.field7182 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field7162[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class460(this, var6, arg2, arg3);
        } else {
            return new class581(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)Lu;")
    public final class64 method1359(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(IIIIII)V")
    public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field7165) {
            arg2 -= this.field7165 - arg0;
            arg0 = this.field7165;
        }
        if (arg1 < this.field7160) {
            arg3 -= this.field7160 - arg1;
            arg1 = this.field7160;
        }
        if (arg0 + arg2 > this.field7170) {
            arg2 = this.field7170 - arg0;
        }
        if (arg1 + arg3 > this.field7173) {
            arg3 = this.field7173 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7170 && arg1 <= this.field7173) {
            int var7 = this.field7182 - arg2;
            int var8 = this.field7182 * arg1 + arg0;
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
                            this.field7162[var24] = arg4;
                            ++var24;
                            this.field7162[var24] = arg4;
                            ++var24;
                            this.field7162[var24] = arg4;
                            ++var24;
                            this.field7162[var24] = arg4;
                            ++var24;
                            this.field7162[var24] = arg4;
                            ++var24;
                            this.field7162[var24] = arg4;
                            ++var24;
                            this.field7162[var24] = arg4;
                            ++var24;
                            this.field7162[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field7162[var24] = arg4;
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
                        int var14 = this.field7162[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field7162[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field7162[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field7162[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "()Lm;")
    public final class163 method1344() {
        class394 var1 = this.method1372(Thread.currentThread());
        return var1.field5559;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "()Z")
    public final boolean method1273() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "F", descriptor = "()V")
    private final void method2957() {
        if (this.field7186 != 0.0F) {
            float var1 = (float) this.field7164;
            float var2 = (float) this.field7153;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field7187 / (this.field7187 + this.field7186);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field7186;
            this.field7161 = (int) (((float) this.field7164 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field7161 = this.field7164;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!et", name = "r", descriptor = "()Z")
    public final boolean method1319() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "q", descriptor = "()Lm;")
    public final class163 method1318() {
        return new class195();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1260(Canvas arg0) {
        class316 var2 = (class316) this.field7145.method1242(0, (long) arg0.hashCode());
        if (var2 == null) {
            class316 var3 = class496.method2873(arg0, (byte) 119);
            this.field7145.method1241(var3, (long) arg0.hashCode(), -111);
        }
    }

    @OriginalMember(owner = "client!et", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field7182 * arg1 + arg0;
            int var15 = this.field7182 - arg2;
            if (arg1 + arg3 > this.field7173) {
                arg3 -= arg1 + arg3 - this.field7173;
            }
            if (arg1 < this.field7160) {
                int var16 = this.field7160 - arg1;
                arg3 -= var16;
                var14 += this.field7182 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field7170) {
                int var17 = arg0 + arg2 - this.field7170;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field7165) {
                int var18 = this.field7165 - arg0;
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
                            int var28 = this.field7162[var14];
                            this.field7162[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field7162[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field7162[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field7162[var14++] = arg5;
                        } else {
                            this.field7162[var14++] = arg4;
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

    @OriginalMember(owner = "client!et", name = "v", descriptor = "()Z")
    public final boolean method1338() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([IIIII)Lha;")
    public final class52 method1363(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class460(this, arg0, arg1, arg2, arg3, arg4) : new class581(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class460(this, arg0, arg1, arg2, arg3, arg4) : new class581(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!et", name = "G", descriptor = "()V")
    public abstract void method1374();

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!et", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field7169.field2766 * arg2 + this.field7169.field2773 * arg1 + this.field7169.field2771 * arg0 >> 15) + this.field7169.field2764;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field7169.field2766 * arg5 + this.field7169.field2773 * arg4 + this.field7169.field2771 * arg3 >> 15) + this.field7169.field2764;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field7153 || var8 >= this.field7153) && (var7 <= this.field7164 || var8 <= this.field7164)) {
            int var9 = ((this.field7169.field2772 * arg2 + this.field7169.field2770 * arg0 + this.field7169.field2769 * arg1 >> 15) + this.field7169.field2768) * this.field7176 / var7;
            int var10 = ((this.field7169.field2772 * arg5 + this.field7169.field2770 * arg3 + this.field7169.field2769 * arg4 >> 15) + this.field7169.field2768) * this.field7176 / var8;
            if (var9 < this.field7183 && var10 < this.field7183 || var9 > this.field7188 && var10 > this.field7188) {
                return false;
            } else {
                int var11 = ((this.field7169.field2763 * arg2 + this.field7169.field2765 * arg0 + this.field7169.field2762 * arg1 >> 15) + this.field7169.field2767) * this.field7167 / var7;
                int var12 = ((this.field7169.field2763 * arg5 + this.field7169.field2765 * arg3 + this.field7169.field2762 * arg4 >> 15) + this.field7169.field2767) * this.field7167 / var8;
                return (var11 >= this.field7185 || var12 >= this.field7185) && (var11 <= this.field7191 || var12 <= this.field7191);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class310 arg6, int arg7, int arg8) {
        class491 var10 = (class491) arg6;
        int[] var11 = var10.field6873;
        int[] var12 = var10.field6874;
        int var13 = this.field7160 > arg8 ? this.field7160 : arg8;
        int var14 = this.field7173 < var11.length + arg8 ? this.field7173 : var11.length + arg8;
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
            if (arg0 < this.field7165) {
                var18 += (this.field7165 - arg0) * var20;
                arg0 = this.field7165;
            }
            if (var21 >= this.field7170) {
                var21 = this.field7170 - 1;
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
                                int var28 = this.field7182 * var25 + arg0;
                                int var29 = this.field7162[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field7162[var28] = var23 + var30;
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
                                int var34 = this.field7182 * var31 + arg0;
                                int var35 = this.field7162[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field7162[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field7162[this.field7182 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field7165 && var64 < this.field7170 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field7162[this.field7182 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field7165 && var50 < this.field7170 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field7182 * arg1 + var50;
                        int var54 = this.field7162[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field7162[this.field7182 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field7165 && var56 < this.field7170 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field7182 * arg1 + var56;
                        int var60 = this.field7162[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field7162[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(IIIII)V")
    public final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field7165 && arg0 < this.field7170) {
            if (arg1 < this.field7160) {
                arg2 -= this.field7160 - arg1;
                arg1 = this.field7160;
            }
            if (arg1 + arg2 > this.field7173) {
                arg2 = this.field7173 - arg1;
            }
            int var6 = this.field7182 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7182 * var10 + var6;
                        int var12 = this.field7162[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field7162[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field7182 * var14 + var6;
                        int var16 = this.field7162[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field7162[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field7162[this.field7182 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "l", descriptor = "(I)[I")
    private final int[] method2958(int arg0) {
        class571 var2 = this.field7168;
        class129 var3;
        synchronized (this.field7168) {
            var3 = (class129) this.field7168.method3252((long) arg0, (byte) -123);
            if (var3 == null) {
                if (!super.field2924.method188(arg0, -125)) {
                    return null;
                }
                class211 var5 = super.field2924.method190((byte) -89, arg0);
                int var6 = !var5.field2965 && !this.field7179 ? 128 : 64;
                var3 = new class129(arg0, var6, super.field2924.method185(true, 0.7F, var6, arg0, var6, (byte) 49), var5.field2982);
                this.field7168.method3243(var3, (long) arg0, -85);
            }
        }
        var3.field2071 = true;
        return var3.method885();
    }

    @OriginalMember(owner = "client!et", name = "ra", descriptor = "()F")
    public final float method1271() {
        return this.field7186;
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V")
    public final void method1362(int arg0) {
        int var2 = arg0 - this.field7148;
        for (Object var3 = this.field7168.method3249((byte) 127); var3 != null; var3 = this.field7168.method3247((byte) -61)) {
            class129 var4 = (class129) var3;
            if (var4.field2071) {
                var4.field2070 += var2;
                int var5 = var4.field2070 / 20;
                if (var5 > 0) {
                    class211 var6 = super.field2924.method190((byte) -89, var4.field2067);
                    var4.method883(var6.field2968 * var2 * 50 / 1000, var6.field2986 * var2 * 50 / 1000);
                    var4.field2070 -= var5 * 20;
                }
                var4.field2071 = false;
            }
        }
        this.field7148 = arg0;
        this.field7156.method3253(5, -128);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IIII)V")
    public final void method1365(int arg0, int arg1, int arg2, int arg3) {
        this.field7184 = arg0;
        this.field7157 = arg1;
        this.field7176 = arg2;
        this.field7167 = arg3;
        this.method1374();
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "()I")
    public final int method1301() {
        return this.field7153;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "([I)V")
    public final void method1350(int[] arg0) {
        arg0[0] = this.field7165;
        arg0[1] = this.field7160;
        arg0[2] = this.field7170;
        arg0[3] = this.field7173;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lhp;)V")
    public final void method1356(class274 arg0) {
        class590 var2 = arg0.field3798.field3267;
        for (class590 var3 = var2.field8428; var2 != var3; var3 = var3.field8428) {
            class28 var4 = (class28) var3;
            int var5 = var4.field468 >> 12;
            int var6 = var4.field478 >> 12;
            int var7 = var4.field479 >> 12;
            int var8 = (this.field7169.field2766 * var7 + this.field7169.field2773 * var6 + this.field7169.field2771 * var5 >> 15) + this.field7169.field2764;
            if (var8 >= this.field7153 && var8 <= this.field7166) {
                int var9 = ((this.field7169.field2772 * var7 + this.field7169.field2770 * var5 + this.field7169.field2769 * var6 >> 15) + this.field7169.field2768) * this.field7176 / var8 + this.field7184;
                int var10 = ((this.field7169.field2763 * var7 + this.field7169.field2765 * var5 + this.field7169.field2762 * var6 >> 15) + this.field7169.field2767) * this.field7167 / var8 + this.field7157;
                if (var9 >= this.field7165 && var9 <= this.field7170 && var10 >= this.field7160 && var10 <= this.field7173) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2961(var4, var9, var10, (this.field7176 * var4.field475 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "()Z")
    public final boolean method1294() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "C", descriptor = "()Z")
    public final boolean method1353() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(FFF)V")
    public final void method1279(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!et", name = "N", descriptor = "(IIII)V")
    public final void method1308(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7182) {
            arg2 = this.field7182;
        }
        if (arg3 > this.field7159) {
            arg3 = this.field7159;
        }
        this.field7165 = arg0;
        this.field7170 = arg2;
        this.field7160 = arg1;
        this.field7173 = arg3;
        this.method1374();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Runnable;)Lch;")
    public abstract class394 method1372(Runnable arg0);

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lsv;)V")
    public final void method1277(class567 arg0) {
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(IIIIII)V")
    public final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1329(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1329(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1292(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1292(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field7165) {
                    var10 += (this.field7165 - arg0) * var12;
                    arg0 = this.field7165;
                }
                if (var13 >= this.field7170) {
                    var13 = this.field7170 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field7160 && var17 < this.field7173) {
                                int var18 = this.field7182 * var17 + arg0;
                                int var19 = this.field7162[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field7162[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field7160 && var21 < this.field7173) {
                                int var22 = this.field7182 * var21 + arg0;
                                int var23 = this.field7162[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field7162[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field7160 && var27 < this.field7173) {
                            this.field7162[this.field7182 * var27 + arg0] = arg4;
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
                if (arg1 < this.field7160) {
                    var29 += (this.field7160 - arg1) * var31;
                    arg1 = this.field7160;
                }
                if (var32 >= this.field7173) {
                    var32 = this.field7173 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field7165 && var46 < this.field7170) {
                            this.field7162[this.field7182 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field7165 && var36 < this.field7170) {
                            int var37 = this.field7182 * arg1 + var36;
                            int var38 = this.field7162[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field7162[this.field7182 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field7165 && var40 < this.field7170) {
                            int var41 = this.field7182 * arg1 + var40;
                            int var42 = this.field7162[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field7162[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!et", name = "E", descriptor = "(III)V")
    public final void method1334(int arg0, int arg1, int arg2) {
        this.field7180 = arg0 & 16777215;
        int var4 = this.field7180 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field7180 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field7180 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field7180 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field7171 = false;
        } else {
            this.field7171 = true;
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(II)I")
    public final int method1357(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!et", name = "q", descriptor = "(IIII)V")
    public final void method1336(int arg0, int arg1, int arg2, int arg3) {
        this.field7154 = this.field7180;
        this.field7189 = arg0;
        this.field7180 = arg1;
        this.field7175 = arg2;
        this.field7152 = true;
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
    public abstract void method1330(int arg0);

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1275(Canvas arg0);

    @OriginalMember(owner = "client!et", name = "a", descriptor = "()V")
    public void method1265() {
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class310 method1322(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class491(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field2924.method190((byte) -89, arg5).field2969) {
                if (this.field7193 != arg5) {
                    class52 var10 = (class52) this.field7156.method3252((long) arg5, (byte) -109);
                    if (var10 == null) {
                        int[] var11 = this.method2958(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method2954(arg5) ? 64 : 128;
                        var10 = this.method1363(var11, 0, var12, var12, var12);
                        this.field7156.method3243(var10, (long) arg5, 93);
                    }
                    this.field7193 = arg5;
                    this.field7192 = var10;
                }
                this.field7192.method423(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method1312(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(Z)V")
    public final void method1364(boolean arg0) {
        this.field7179 = arg0;
        this.field7168.method3246(false);
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1343(Canvas arg0);

    @OriginalMember(owner = "client!et", name = "i", descriptor = "()V")
    public final void method1299() {
    }

    @OriginalMember(owner = "client!et", name = "m", descriptor = "(I)Z")
    public final boolean method2960(int arg0) {
        return super.field2924.method190((byte) -89, arg0).field2977;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([Lr;Lm;[Lkn;I)V")
    public abstract void method1360(class157[] arg0, class163 arg1, class631[] arg2, int arg3);

    @OriginalMember(owner = "client!et", name = "m", descriptor = "(IFFFFF)V")
    public final void method1298(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field7172 = (int) (arg1 * 65535.0F);
        this.field7150 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field7155 = (int) (arg3 * 65535.0F / var7);
        this.field7174 = (int) (arg4 * 65535.0F / var7);
        this.field7151 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lm;)V")
    public final void method1355(class163 arg0) {
        this.field7169 = (class195) arg0;
    }

    @OriginalMember(owner = "client!et", name = "CA", descriptor = "()I")
    public final int method1282() {
        return this.field7164;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "()V")
    public final void method1267() {
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1262(Canvas arg0) {
        if (this.field7149 == arg0) {
            this.method1343((Canvas) null);
        }
        class316 var2 = (class316) this.field7145.method1242(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1117(0);
        }
    }

    @OriginalMember(owner = "client!et", name = "l", descriptor = "()V")
    public final void method1307() throws class589 {
        if (this.field7149 != null && this.field7147 != null) {
            try {
                Graphics var1 = this.field7149.getGraphics();
                this.field7147.method1010(0, 0, var1, (byte) -55);
            } catch (Exception var2) {
                this.field7149.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!et", name = "u", descriptor = "()V")
    public final void method1337() {
        this.field7168.method3246(false);
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
    public final void method1297(int arg0) {
    }

    @OriginalMember(owner = "client!et", name = "n", descriptor = "()V")
    public final void method1269() {
        this.field7165 = 0;
        this.field7160 = 0;
        this.field7170 = this.field7182;
        this.field7173 = this.field7159;
        this.method1374();
    }

    @OriginalMember(owner = "client!et", name = "x", descriptor = "()Z")
    public abstract boolean method1340();

    @OriginalMember(owner = "client!et", name = "P", descriptor = "()F")
    public final float method1326() {
        return this.field7187;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)V")
    public final void method1268(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lmca;III)V")
    public final void method2961(class28 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field469;
        int var7 = arg3 << 1;
        if (var5 == -1) {
            this.method1312(arg1, arg2, arg3, arg0.field480, 1);
        } else {
            if (this.field7193 != var5) {
                class52 var8 = (class52) this.field7156.method3252((long) var5, (byte) 92);
                if (var8 == null) {
                    int[] var9 = this.method2958(var5);
                    if (var9 == null) {
                        return;
                    }
                    int var10 = this.method2954(var5) ? 64 : 128;
                    var8 = this.method1363(var9, 0, var10, var10, var10);
                    this.field7156.method3243(var8, (long) var5, -97);
                }
                this.field7193 = var5;
                this.field7192 = var8;
            }
            ++var7;
            this.field7192.method423(arg1 - arg3, arg2 - arg3, var7, var7, 0, arg0.field480, 1);
        }
    }

    @OriginalMember(owner = "client!et", name = "D", descriptor = "()Z")
    public final boolean method1369() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "la", descriptor = "(FF)V")
    public final void method1333(float arg0, float arg1) {
        this.field7187 = arg0;
        this.field7186 = arg1;
        this.method2957();
    }

    @OriginalMember(owner = "client!et", name = "U", descriptor = "()I")
    public final int method1286() {
        return 0;
    }

    @OriginalMember(owner = "client!et", name = "L", descriptor = "(I)V")
    public final void method1302(int arg0) {
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
    public abstract void method1272(int arg0);

    @OriginalMember(owner = "client!et", name = "j", descriptor = "()Z")
    public final boolean method1304() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "B", descriptor = "()Z")
    public final boolean method1346() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "Z", descriptor = "(I)V")
    public final void method1274(int arg0) {
        this.method1321(0, 0, this.field7182, this.field7159, arg0, 0);
    }

    @OriginalMember(owner = "client!et", name = "k", descriptor = "()Z")
    public final boolean method1305() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIF)Lrh;")
    public final class223 method1320(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }
}
