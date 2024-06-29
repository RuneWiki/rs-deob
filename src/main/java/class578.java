import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class578 extends class566 {

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "Z")
    private boolean field8067;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "Z")
    private boolean field8070;

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "Lil;")
    private class68 field8072;

    @OriginalMember(owner = "client!nga", name = "I", descriptor = "Z")
    private boolean field8087;

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "I")
    public int field8073;

    @OriginalMember(owner = "client!nga", name = "L", descriptor = "I")
    public int field8090;

    @OriginalMember(owner = "client!nga", name = "R", descriptor = "I")
    public int field8096;

    @OriginalMember(owner = "client!nga", name = "A", descriptor = "I")
    public int field8079;

    @OriginalMember(owner = "client!nga", name = "Q", descriptor = "I")
    public int field8095;

    @OriginalMember(owner = "client!nga", name = "O", descriptor = "I")
    public int field8093;

    @OriginalMember(owner = "client!nga", name = "Y", descriptor = "I")
    public int field8103;

    @OriginalMember(owner = "client!nga", name = "M", descriptor = "I")
    public int field8091;

    @OriginalMember(owner = "client!nga", name = "B", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!nga", name = "S", descriptor = "I")
    private int field8097;

    @OriginalMember(owner = "client!nga", name = "W", descriptor = "I")
    public int field8101;

    @OriginalMember(owner = "client!nga", name = "T", descriptor = "I")
    private int field8098;

    @OriginalMember(owner = "client!nga", name = "cb", descriptor = "I")
    public int field8107;

    @OriginalMember(owner = "client!nga", name = "J", descriptor = "Ltb;")
    private class450 field8088;

    @OriginalMember(owner = "client!nga", name = "eb", descriptor = "I")
    private int field8109;

    @OriginalMember(owner = "client!nga", name = "D", descriptor = "Ltb;")
    private class450 field8082;

    @OriginalMember(owner = "client!nga", name = "bb", descriptor = "Lrd;")
    public class461 field8106;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    private int field8069;

    @OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
    public int field8074;

    @OriginalMember(owner = "client!nga", name = "w", descriptor = "I")
    public int field8075;

    @OriginalMember(owner = "client!nga", name = "x", descriptor = "I")
    public int field8076;

    @OriginalMember(owner = "client!nga", name = "y", descriptor = "I")
    public int field8077;

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "I")
    private int field8078;

    @OriginalMember(owner = "client!nga", name = "C", descriptor = "I")
    public int field8081;

    @OriginalMember(owner = "client!nga", name = "E", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!nga", name = "G", descriptor = "I")
    public int field8085;

    @OriginalMember(owner = "client!nga", name = "K", descriptor = "I")
    private int field8089;

    @OriginalMember(owner = "client!nga", name = "N", descriptor = "I")
    private int field8092;

    @OriginalMember(owner = "client!nga", name = "P", descriptor = "I")
    public int field8094;

    @OriginalMember(owner = "client!nga", name = "V", descriptor = "I")
    public int field8100;

    @OriginalMember(owner = "client!nga", name = "X", descriptor = "I")
    public int field8102;

    @OriginalMember(owner = "client!nga", name = "ab", descriptor = "I")
    public int field8105;

    @OriginalMember(owner = "client!nga", name = "Z", descriptor = "Lf;")
    private class536 field8104;

    @OriginalMember(owner = "client!nga", name = "db", descriptor = "Lf;")
    private class536 field8108;

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "Lnc;")
    private class589 field8071;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8068;

    @OriginalMember(owner = "client!nga", name = "H", descriptor = "[I")
    public int[] field8086;

    @OriginalMember(owner = "client!nga", name = "U", descriptor = "[I")
    public int[] field8099;

    @OriginalMember(owner = "client!nga", name = "F", descriptor = "[Llfa;")
    private class50[] field8084;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lsa;[Laga;Z)Lla;", line = 4)
    public final class413 method989(class595 arg0, class661[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field9351;
            var5[var7] = arg1[var7].field9353;
            if (arg1[var7].field9355 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class409(this, arg0, arg1, var4, var5);
            } else {
                return new class114(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class299(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "()I", line = 42)
    public final int method997() {
        return 0;
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(IIIIII)Ljt;", line = 45)
    public final class533 method990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "O", descriptor = "(IIIIII)Z", line = 49)
    public final boolean method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field8106.field5872 + (float) arg0 * this.field8106.field5860 + (float) arg1 * this.field8106.field5882 + this.field8106.field5871;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field8106.field5872 + (float) arg3 * this.field8106.field5860 + (float) arg4 * this.field8106.field5882 + this.field8106.field5871;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field8091) || !(var8 < (float) this.field8091)) && (!(var7 > (float) this.field8101) || !(var8 > (float) this.field8101))) {
            int var9 = (int) (((float) arg2 * this.field8106.field5862 + (float) arg0 * this.field8106.field5869 + (float) arg1 * this.field8106.field5856 + this.field8106.field5865) * (float) this.field8090 / var7);
            int var10 = (int) (((float) arg5 * this.field8106.field5862 + (float) arg3 * this.field8106.field5869 + (float) arg4 * this.field8106.field5856 + this.field8106.field5865) * (float) this.field8090 / var8);
            if (var9 < this.field8074 && var10 < this.field8074 || var9 > this.field8083 && var10 > this.field8083) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field8106.field5866 + (float) arg0 * this.field8106.field5852 + (float) arg1 * this.field8106.field5854 + this.field8106.field5858) * (float) this.field8093 / var7);
                int var12 = (int) (((float) arg5 * this.field8106.field5866 + (float) arg3 * this.field8106.field5852 + (float) arg4 * this.field8106.field5854 + this.field8106.field5858) * (float) this.field8093 / var8);
                return (var11 >= this.field8105 || var12 >= this.field8105) && (var11 <= this.field8094 || var12 <= this.field8094);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "(IIIII)V", line = 79)
    public final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field8073) {
            var6 = this.field8073;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field8107) {
            var7 = this.field8107;
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
                if (var64 < this.field8103) {
                    var64 = this.field8103;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field8080) {
                    var65 = this.field8080;
                }
                int var66 = this.field8081 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field8086[var66++] = arg3;
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
                if (var60 < this.field8103) {
                    var60 = this.field8103;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field8080 - 1) {
                    var61 = this.field8080 - 1;
                }
                int var62 = this.field8081 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field8086[var62++] = arg3;
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
                if (var28 < this.field8103) {
                    var28 = this.field8103;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field8080) {
                    var29 = this.field8080;
                }
                int var30 = this.field8081 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field8086[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field8086[var30++] = var15 + var33;
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
                if (var22 < this.field8103) {
                    var22 = this.field8103;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field8080 - 1) {
                    var23 = this.field8080 - 1;
                }
                int var24 = this.field8081 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field8086[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field8086[var24++] = var15 + var27;
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
                if (var47 < this.field8103) {
                    var47 = this.field8103;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field8080) {
                    var48 = this.field8080;
                }
                int var49 = this.field8081 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field8086[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field8086[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field8103) {
                    var39 = this.field8103;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field8080 - 1) {
                    var40 = this.field8080 - 1;
                }
                int var41 = this.field8081 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field8086[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field8086[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljt;Ljt;FLjt;)Ljt;", line = 365)
    public final class533 method1064(class533 arg0, class533 arg1, float arg2, class533 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "D", descriptor = "()V", line = 370)
    private final void method3184() {
        for (int var1 = 0; var1 < this.field8100; ++var1) {
            this.field8084[var1].method313(117);
        }
        this.method1017();
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(II)I", line = 378)
    public final int method998(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(Z)V", line = 382)
    public final void method1005(boolean arg0) {
        this.field8087 = arg0;
        this.field8082.method2406(18385);
    }

    @OriginalMember(owner = "client!nga", name = "da", descriptor = "(IIII)V", line = 386)
    public final void method1083(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field8081) {
            arg2 = this.field8081;
        }
        if (arg3 > this.field8078) {
            arg3 = this.field8078;
        }
        this.field8103 = arg0;
        this.field8080 = arg2;
        this.field8073 = arg1;
        this.field8107 = arg3;
        this.method3194();
    }

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "(I)V", line = 406)
    public final void method1040(int arg0) {
        this.field8084[arg0].method317(Thread.currentThread(), 105);
    }

    @OriginalMember(owner = "client!nga", name = "JA", descriptor = "()V", line = 409)
    public final void method1017() {
        this.field8103 = 0;
        this.field8073 = 0;
        this.field8080 = this.field8081;
        this.field8107 = this.field8078;
        this.method3194();
    }

    @OriginalMember(owner = "client!nga", name = "AA", descriptor = "(III[I)V", line = 417)
    public final void method1046(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field8106.field5872 + (float) arg0 * this.field8106.field5860 + (float) arg1 * this.field8106.field5882 + this.field8106.field5871;
        if (!(var5 < (float) this.field8091) && !(var5 > (float) this.field8101)) {
            int var6 = (int) (((float) arg2 * this.field8106.field5862 + (float) arg0 * this.field8106.field5869 + (float) arg1 * this.field8106.field5856 + this.field8106.field5865) * (float) this.field8090 / var5);
            int var7 = (int) (((float) arg2 * this.field8106.field5866 + (float) arg0 * this.field8106.field5852 + (float) arg1 * this.field8106.field5854 + this.field8106.field5858) * (float) this.field8093 / var5);
            if (var6 >= this.field8074 && var6 <= this.field8083 && var7 >= this.field8105 && var7 <= this.field8094) {
                arg3[0] = var6 - this.field8074;
                arg3[1] = var7 - this.field8105;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Laga;Z)Lf;", line = 442)
    public final class536 method1072(class661 arg0, boolean arg1) {
        int[] var3 = arg0.field9358;
        byte[] var4 = arg0.field9352;
        int var5 = arg0.field9351;
        int var6 = arg0.field9353;
        class640 var11;
        if (arg1 && arg0.field9355 == null) {
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
            var11 = new class623(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field9355;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class87(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class617(this, var14, var5, var6);
            }
        }
        var11.method161(arg0.field9354, arg0.field9356, arg0.field9350, arg0.field9357);
        return var11;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lir;)V", line = 546)
    public final void method993(class27 arg0) {
        class50 var2 = this.method3189(Thread.currentThread());
        class181 var3 = arg0.field399.field1895;
        for (class181 var4 = var3.field2322; var3 != var4; var4 = var4.field2322) {
            class26 var5 = (class26) var4;
            int var6 = var5.field393 >> 12;
            int var7 = var5.field390 >> 12;
            int var8 = var5.field388 >> 12;
            float var9 = (float) var8 * this.field8106.field5872 + (float) var6 * this.field8106.field5860 + (float) var7 * this.field8106.field5882 + this.field8106.field5871;
            if (!(var9 < (float) this.field8091) && !(var9 > (float) var2.field703)) {
                int var10 = (int) (((float) var8 * this.field8106.field5862 + (float) var6 * this.field8106.field5869 + (float) var7 * this.field8106.field5856 + this.field8106.field5865) * (float) this.field8090 / var9) + this.field8102;
                int var11 = (int) (((float) var8 * this.field8106.field5866 + (float) var6 * this.field8106.field5852 + (float) var7 * this.field8106.field5854 + this.field8106.field5858) * (float) this.field8093 / var9) + this.field8077;
                if (var10 >= this.field8103 && var10 <= this.field8080 && var11 >= this.field8073 && var11 <= this.field8107) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method3191(var5, var10, var11, (int) var9, (int) ((float) (this.field8090 * var5.field385 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "()V", line = 584)
    public final void method988() throws class180 {
        if (this.field8068 != null && this.field8071 != null) {
            try {
                Graphics var1 = this.field8068.getGraphics();
                this.field8071.method856(0, 0, var1, (byte) -20);
            } catch (Exception var2) {
                this.field8068.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "()Z", line = 600)
    public final boolean method1067() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([I)V", line = 603)
    public final void method1030(int[] arg0) {
        arg0[0] = this.field8081;
        arg0[1] = this.field8078;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 609)
    public final void method1068(Canvas arg0) {
        class589 var2 = (class589) this.field8072.method399(-32748, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1871(-86);
            class589 var3 = class270.method1557(256, arg0);
            this.field8072.method402(var3, (byte) -65, (long) arg0.hashCode());
            if (this.field8068 == arg0 && this.field8104 == null) {
                this.field8071 = var3;
                this.field8086 = var3.field8274;
                this.field8081 = var3.field8279;
                this.field8078 = var3.field8280;
                if (this.field8092 != this.field8081 || this.field8089 != this.field8078) {
                    this.field8092 = this.field8081;
                    this.field8089 = this.field8078;
                    this.field8099 = new int[this.field8092 * this.field8089];
                }
                this.method3184();
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "V", descriptor = "(IIII)V", line = 635)
    public final void method1070(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8103 < arg0) {
            this.field8103 = arg0;
        }
        if (this.field8073 < arg1) {
            this.field8073 = arg1;
        }
        if (this.field8080 > arg2) {
            this.field8080 = arg2;
        }
        if (this.field8107 > arg3) {
            this.field8107 = arg3;
        }
        this.method3194();
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 650)
    public final void method1086(Canvas arg0) {
        if (arg0 != null) {
            class589 var2 = (class589) this.field8072.method399(-32748, (long) arg0.hashCode());
            if (var2 != null) {
                this.field8068 = arg0;
                this.field8071 = var2;
                if (this.field8104 == null) {
                    this.field8086 = var2.field8274;
                    this.field8081 = var2.field8279;
                    this.field8078 = var2.field8280;
                    if (this.field8092 != this.field8081 || this.field8089 != this.field8078) {
                        this.field8092 = this.field8081;
                        this.field8089 = this.field8078;
                        this.field8099 = new int[this.field8092 * this.field8089];
                    }
                    this.method3184();
                    return;
                }
            }
        } else {
            this.field8068 = null;
            this.field8071 = null;
            if (this.field8104 == null) {
                this.field8086 = null;
                this.field8081 = this.field8078 = 1;
                this.field8092 = this.field8089 = 1;
                this.method3184();
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "E", descriptor = "()Z", line = 692)
    public final boolean method3185() {
        return this.field8067;
    }

    @OriginalMember(owner = "client!nga", name = "ra", descriptor = "(F)V", line = 696)
    public final void method1054(float arg0) {
        this.field8079 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIILua;II)V", line = 700)
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class600 arg6, int arg7, int arg8) {
        class355 var10 = (class355) arg6;
        int[] var11 = var10.field4526;
        int[] var12 = var10.field4530;
        int var13 = this.field8073 > arg8 ? this.field8073 : arg8;
        int var14 = this.field8107 < var11.length + arg8 ? this.field8107 : var11.length + arg8;
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
            if (arg0 < this.field8103) {
                var18 += (this.field8103 - arg0) * var20;
                arg0 = this.field8103;
            }
            if (var21 >= this.field8080) {
                var21 = this.field8080 - 1;
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
                                int var28 = this.field8081 * var25 + arg0;
                                int var29 = this.field8086[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field8086[var28] = var23 + var30;
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
                                int var34 = this.field8081 * var31 + arg0;
                                int var35 = this.field8086[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field8086[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field8086[this.field8081 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field8103 && var64 < this.field8080 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field8086[this.field8081 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field8103 && var50 < this.field8080 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field8081 * arg1 + var50;
                        int var54 = this.field8086[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field8086[this.field8081 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field8103 && var56 < this.field8080 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field8081 * arg1 + var56;
                        int var60 = this.field8086[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field8086[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lir;I)V", line = 941)
    public final void method999(class27 arg0, int arg1) {
        class50 var3 = this.method3189(Thread.currentThread());
        class181 var4 = arg0.field399.field1895;
        for (class181 var5 = var4.field2322; var4 != var5; var5 = var5.field2322) {
            class26 var6 = (class26) var5;
            int var7 = var6.field393 >> 12;
            int var8 = var6.field390 >> 12;
            int var9 = var6.field388 >> 12;
            float var10 = (float) var9 * this.field8106.field5872 + (float) var7 * this.field8106.field5860 + (float) var8 * this.field8106.field5882 + this.field8106.field5871;
            if (!(var10 < (float) this.field8091) && !(var10 > (float) var3.field703)) {
                int var11 = (int) (((float) var9 * this.field8106.field5862 + (float) var7 * this.field8106.field5869 + (float) var8 * this.field8106.field5856 + this.field8106.field5865) * (float) this.field8090 / (float) arg1) + this.field8102;
                int var12 = (int) (((float) var9 * this.field8106.field5866 + (float) var7 * this.field8106.field5852 + (float) var8 * this.field8106.field5854 + this.field8106.field5858) * (float) this.field8093 / (float) arg1) + this.field8077;
                if (var11 >= this.field8103 && var11 <= this.field8080 && var12 >= this.field8073 && var12 <= this.field8107) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method3191(var6, var11, var12, (int) var10, (this.field8090 * var6.field385 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "GA", descriptor = "(II)V", line = 981)
    public final void method1062(int arg0, int arg1) {
        class50 var3 = this.method3189(Thread.currentThread());
        this.field8091 = arg0;
        this.field8101 = arg1;
        var3.field703 = this.field8101 - 255;
    }

    @OriginalMember(owner = "client!nga", name = "oa", descriptor = "([I)V", line = 987)
    public final void method1060(int[] arg0) {
        arg0[0] = this.field8103;
        arg0[1] = this.field8073;
        arg0[2] = this.field8080;
        arg0[3] = this.field8107;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIZ)Lf;", line = 994)
    public final class536 method1053(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field8081 * arg1 + arg0;
        int var8 = this.field8081 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field8086[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class87(this, var6, arg2, arg3);
        } else {
            return new class617(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIIIII)V", line = 1027)
    public final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class50 var11 = this.method3189(Thread.currentThread());
        class229 var12 = var11.field745;
        var12.field2850 = false;
        int var13 = arg0 - this.field8074;
        int var14 = arg2 - this.field8074;
        int var15 = arg4 - this.field8074;
        int var16 = arg1 - this.field8105;
        int var17 = arg3 - this.field8105;
        int var18 = arg5 - this.field8105;
        var12.field2862 = var13 < 0 || var13 > var12.field2849 || var14 < 0 || var14 > var12.field2849 || var15 < 0 || var15 > var12.field2849;
        var12.field2857 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field2864 = 255 - var19;
                var12.field2858 = false;
                var12.method1379(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field2864 = 128;
                var12.field2858 = true;
                var12.method1379(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field2864 = 0;
            var12.field2858 = false;
            var12.method1379(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field2850 = true;
        var12.field2857 = false;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V", line = 1069)
    public final void method1041(int arg0) {
    }

    @OriginalMember(owner = "client!nga", name = "FA", descriptor = "(ILua;II)V", line = 1073)
    public final void method1012(int arg0, class600 arg1, int arg2, int arg3) {
        class355 var5 = (class355) arg1;
        int[] var6 = var5.field4526;
        int[] var7 = var5.field4530;
        int var8;
        if (this.field8107 < var6.length + arg3) {
            var8 = this.field8107 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field8073 > arg3) {
            var9 = this.field8073 - arg3;
            arg3 = this.field8073;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field8081 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field8103 > var12) {
                    var13 -= this.field8103 - var12;
                    var12 = this.field8103;
                }
                if (this.field8080 < var12 + var13) {
                    var13 = this.field8080 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field8086[var14++] = arg0;
                }
                var10 += this.field8081;
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "()V", line = 1130)
    public final void method1089() {
    }

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "(I)Z", line = 1133)
    public final boolean method3186(int arg0) {
        return super.field7898.method2486(arg0, (byte) 86).field230;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I[Lgga;)V", line = 1135)
    public final void method1024(int arg0, class332[] arg1) {
    }

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "()Z", line = 1138)
    public final boolean method1026() {
        return true;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Leg;IIII)Lda;", line = 1141)
    public final class474 method1019(class47 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class132(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "()Z", line = 1145)
    public final boolean method1027() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 1148)
    public class578(Canvas arg0, class526 arg1) {
        this(arg1);
        this.method1073(arg0);
        this.method1086(arg0);
    }

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "()V", line = 1152)
    public final void method1052() {
    }

    @OriginalMember(owner = "client!nga", name = "y", descriptor = "()Loa;", line = 1155)
    public final class226 method1001() {
        return new class226(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "(I)V", line = 1158)
    public final void method1063(int arg0) {
        this.field8100 = arg0;
        this.field8084 = new class50[this.field8100];
        for (int var2 = 0; var2 < this.field8100; ++var2) {
            this.field8084[var2] = new class50(this);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIII)V", line = 1170)
    public final void method1078(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "()Z", line = 1173)
    public final boolean method1006() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "x", descriptor = "()Z", line = 1176)
    public final boolean method1023() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "(I)I", line = 1179)
    public final int method3187(int arg0) {
        return super.field7898.method2486(arg0, (byte) 86).field247 & 65535;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(IIIIIIIIII)V", line = 1182)
    public final void method3188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field7898.method2486(arg6, (byte) 86).field246) {
                if (this.field8109 != arg6) {
                    class536 var11 = (class536) this.field8088.method2418((long) arg6, (byte) 100);
                    if (var11 == null) {
                        int[] var12 = this.method3190(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3193(arg6) ? 64 : 128;
                        var11 = this.method1025(var12, 0, var13, var13, var13);
                        this.field8088.method2409((long) arg6, var11, 1);
                    }
                    this.field8109 = arg6;
                    this.field8108 = var11;
                }
                ((class640) this.field8108).method500(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method3195(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "w", descriptor = "()V", line = 1215)
    public final void method1003() {
        this.field8082.method2406(18385);
        this.field8088.method2406(18385);
    }

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "()Z", line = 1221)
    public final boolean method1085() {
        return true;
    }

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "(IIII)[I", line = 1226)
    public final int[] method1037(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field8081 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field8086[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/Runnable;)Llfa;", line = 1255)
    public final class50 method3189(Runnable arg0) {
        for (int var2 = 0; var2 < this.field8100; ++var2) {
            if (this.field8084[var2].field717 == arg0) {
                return this.field8084[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "(I)[I", line = 1268)
    private final int[] method3190(int arg0) {
        class450 var2 = this.field8082;
        class45 var3;
        synchronized (this.field8082) {
            var3 = (class45) this.field8082.method2418((long) arg0, (byte) 100);
            if (var3 == null) {
                if (!super.field7898.method2480(false, arg0)) {
                    return null;
                }
                class13 var5 = super.field7898.method2486(arg0, (byte) 86);
                int var6 = !var5.field241 && !this.field8087 ? 128 : 64;
                var3 = new class45(arg0, var6, super.field7898.method2488(0.7F, var6, (byte) 102, true, var6, arg0), var5.field233);
                this.field8082.method2409((long) arg0, var3, 1);
            }
        }
        var3.field594 = true;
        return var3.method273();
    }

    @OriginalMember(owner = "client!nga", name = "va", descriptor = "(I)V", line = 1287)
    public final void method1029(int arg0) {
    }

    @OriginalMember(owner = "client!nga", name = "IA", descriptor = "(IIIIII[BII)V", line = 1290)
    public final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field8081 * arg1 + arg0;
            int var15 = this.field8081 - arg2;
            if (arg1 + arg3 > this.field8107) {
                arg3 -= arg1 + arg3 - this.field8107;
            }
            if (arg1 < this.field8073) {
                int var16 = this.field8073 - arg1;
                arg3 -= var16;
                var14 += this.field8081 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field8080) {
                int var17 = arg0 + arg2 - this.field8080;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field8103) {
                int var18 = this.field8103 - arg0;
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
                            int var28 = this.field8086[var14];
                            this.field8086[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field8086[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field8086[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field8086[var14++] = arg5;
                        } else {
                            this.field8086[var14++] = arg4;
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

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Le;)V", line = 1466)
    public final void method1091(class385 arg0) {
    }

    @OriginalMember(owner = "client!nga", name = "B", descriptor = "()Z", line = 1470)
    public final boolean method1076() {
        return true;
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1474)
    public final void method1073(Canvas arg0) {
        class589 var2 = (class589) this.field8072.method399(-32748, (long) arg0.hashCode());
        if (var2 == null) {
            class589 var3 = class270.method1557(256, arg0);
            this.field8072.method402(var3, (byte) -51, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!nga", name = "MA", descriptor = "(III[I)V", line = 1484)
    public final void method991(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field8106.field5872 + (float) arg0 * this.field8106.field5860 + (float) arg1 * this.field8106.field5882 + this.field8106.field5871;
        if (!(var5 < (float) this.field8091) && !(var5 > (float) this.field8101)) {
            int var6 = (int) (((float) arg2 * this.field8106.field5862 + (float) arg0 * this.field8106.field5869 + (float) arg1 * this.field8106.field5856 + this.field8106.field5865) * (float) this.field8090 / var5);
            int var7 = (int) (((float) arg2 * this.field8106.field5866 + (float) arg0 * this.field8106.field5852 + (float) arg1 * this.field8106.field5854 + this.field8106.field5858) * (float) this.field8093 / var5);
            arg3[0] = var6 - this.field8074;
            arg3[1] = var7 - this.field8105;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lmm;IIII)V", line = 1501)
    private final void method3191(class26 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field398;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method3195(arg1, arg2, arg3, arg4, arg0.field386, 1);
        } else {
            if (this.field8109 != var6) {
                class536 var9 = (class536) this.field8088.method2418((long) var6, (byte) 100);
                if (var9 == null) {
                    int[] var10 = this.method3190(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3193(var6) ? 64 : 128;
                    var9 = this.method1025(var10, 0, var11, var11, var11);
                    this.field8088.method2409((long) var6, var9, 1);
                }
                this.field8109 = var6;
                this.field8108 = var9;
            }
            ++var8;
            ((class640) this.field8108).method500(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field386, 1, 1);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lq;)V", line = 1539)
    public final void method1058(class491 arg0) {
        this.field8106 = (class461) arg0;
    }

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "()Lq;", line = 1544)
    public final class491 method995() {
        class50 var1 = this.method3189(Thread.currentThread());
        return var1.field706;
    }

    @OriginalMember(owner = "client!nga", name = "ZA", descriptor = "(Z)V", line = 1550)
    public final void method1034(boolean arg0) {
        class50 var2 = this.method3189(Thread.currentThread());
        var2.field711 = arg0;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([IIIII)Lf;", line = 1555)
    public final class536 method1025(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class87(this, arg0, arg1, arg2, arg3, arg4) : new class617(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class87(this, arg0, arg1, arg2, arg3, arg4) : new class617(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)V", line = 1590)
    public final void method973(int arg0) {
        this.field8084[arg0].method317((Runnable) null, -126);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lf;Z)V", line = 1593)
    public final void method976(class536 arg0, boolean arg1) {
        if (arg0 instanceof class617) {
            class617 var3 = (class617) arg0;
            this.field8081 = var3.field9005;
            this.field8078 = var3.field9009;
            this.field8086 = var3.field8648;
            this.field8104 = arg0;
        } else {
            if (!(arg0 instanceof class87)) {
                throw new RuntimeException();
            }
            class87 var4 = (class87) arg0;
            this.field8081 = var4.field9005;
            this.field8078 = var4.field9009;
            this.field8086 = var4.field1229;
            this.field8104 = arg0;
        }
        this.method3184();
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)I", line = 1619)
    public final int method1018(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "()V", line = 1621)
    public final void method1004() {
    }

    @OriginalMember(owner = "client!nga", name = "YA", descriptor = "(IIII)V", line = 1626)
    public final void method984(int arg0, int arg1, int arg2, int arg3) {
        class50 var5 = this.method3189(Thread.currentThread());
        var5.field709 = arg0;
        var5.field721 = arg1;
        var5.field716 = arg2;
    }

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "(I)[I", line = 1635)
    public final int[] method3192(int arg0) {
        class450 var2 = this.field8082;
        class45 var3;
        synchronized (this.field8082) {
            var3 = (class45) this.field8082.method2418((long) arg0, (byte) 100);
            if (var3 == null) {
                if (!super.field7898.method2480(false, arg0)) {
                    return null;
                }
                class13 var5 = super.field7898.method2486(arg0, (byte) 86);
                int var6 = !var5.field241 && !this.field8087 ? 128 : 64;
                var3 = new class45(arg0, var6, super.field7898.method2481(arg0, 0.7F, true, var6, -5969, var6), var5.field233);
                this.field8082.method2409((long) arg0, var3, 1);
            }
        }
        var3.field594 = true;
        return var3.method273();
    }

    @OriginalMember(owner = "client!nga", name = "J", descriptor = "(IIIIII)V", line = 1655)
    public final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field8103) {
            arg2 -= this.field8103 - arg0;
            arg0 = this.field8103;
        }
        if (arg1 < this.field8073) {
            arg3 -= this.field8073 - arg1;
            arg1 = this.field8073;
        }
        if (arg0 + arg2 > this.field8080) {
            arg2 = this.field8080 - arg0;
        }
        if (arg1 + arg3 > this.field8107) {
            arg3 = this.field8107 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field8080 && arg1 <= this.field8107) {
            int var7 = this.field8081 - arg2;
            int var8 = this.field8081 * arg1 + arg0;
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
                            this.field8086[var24] = arg4;
                            ++var24;
                            this.field8086[var24] = arg4;
                            ++var24;
                            this.field8086[var24] = arg4;
                            ++var24;
                            this.field8086[var24] = arg4;
                            ++var24;
                            this.field8086[var24] = arg4;
                            ++var24;
                            this.field8086[var24] = arg4;
                            ++var24;
                            this.field8086[var24] = arg4;
                            ++var24;
                            this.field8086[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field8086[var24] = arg4;
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
                        int var14 = this.field8086[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field8086[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field8086[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field8086[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "()V", line = 1789)
    public final void method983() {
    }

    @OriginalMember(owner = "client!nga", name = "BA", descriptor = "()I", line = 1794)
    public final int method974() {
        return this.field8091;
    }

    @OriginalMember(owner = "client!nga", name = "T", descriptor = "()I", line = 1799)
    public final int method1036() {
        int var1 = this.field8097;
        this.field8097 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "()Lq;", line = 1804)
    public final class491 method1033() {
        return this.field8106;
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(IIIIII)V", line = 1807)
    public final void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1084(arg0, arg1, arg2, arg4, arg5);
        this.method1084(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1002(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1002(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "(I)Z", line = 1814)
    public final boolean method3193(int arg0) {
        return this.field8087 || super.field7898.method2486(arg0, (byte) 86).field241;
    }

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "()Z", line = 1820)
    public final boolean method1011() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "F", descriptor = "()V", line = 1823)
    private final void method3194() {
        this.field8074 = this.field8103 - this.field8102;
        this.field8083 = this.field8080 - this.field8102;
        this.field8105 = this.field8073 - this.field8077;
        this.field8094 = this.field8107 - this.field8077;
        for (int var1 = 0; var1 < this.field8100; ++var1) {
            class229 var5 = this.field8084[var1].field745;
            var5.field2856 = this.field8102 - this.field8103;
            var5.field2859 = this.field8077 - this.field8073;
            var5.field2849 = this.field8080 - this.field8103;
            var5.field2865 = this.field8107 - this.field8073;
        }
        int var2 = this.field8081 * this.field8073 + this.field8103;
        for (int var3 = this.field8073; var3 < this.field8107; ++var3) {
            for (int var4 = 0; var4 < this.field8100; ++var4) {
                this.field8084[var4].field745.field2855[var3 - this.field8073] = var2;
            }
            var2 += this.field8081;
        }
    }

    @OriginalMember(owner = "client!nga", name = "ja", descriptor = "(I)V", line = 1861)
    public final void method1028(int arg0) {
        this.method1090(0, 0, this.field8081, this.field8078, arg0, 0);
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "()I", line = 1864)
    public final int method1057() {
        return 0;
    }

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "(IIIII)V", line = 1867)
    public final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field8103 && arg0 < this.field8080) {
            if (arg1 < this.field8073) {
                arg2 -= this.field8073 - arg1;
                arg1 = this.field8073;
            }
            if (arg1 + arg2 > this.field8107) {
                arg2 = this.field8107 - arg1;
            }
            int var6 = this.field8081 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field8081 * var10 + var6;
                        int var12 = this.field8086[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field8086[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field8081 * var14 + var6;
                        int var16 = this.field8086[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field8086[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field8086[this.field8081 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "(IIIIII)V", line = 1943)
    private final void method3195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field8073) {
            var8 = this.field8073;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field8107) {
            var9 = this.field8107;
        }
        int var10 = var8;
        int var11 = arg3 * arg3;
        int var12 = 0;
        int var13 = arg1 - var8;
        int var14 = var13 * var13;
        int var15 = var14 - var13;
        if (arg1 > var9) {
            arg1 = var9;
        }
        int var16 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var16 == 255) {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var66 = arg0 - var12 + 1;
                if (var66 < this.field8103) {
                    var66 = this.field8103;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field8080) {
                    var67 = this.field8080;
                }
                int var68 = this.field8081 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field8099[var68]) {
                        this.field8086[var68] = arg4;
                    }
                    ++var68;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var57 = arg3;
            int var58 = var10 - arg1;
            int var59 = var58 * var58 + var11;
            int var60 = var59 - arg3;
            int var61 = var59 - var58;
            while (var10 < var9) {
                while (var61 > var11 && var60 > var11) {
                    var61 -= var57-- + var57;
                    var60 -= var57 + var57;
                }
                int var62 = arg0 - var57;
                if (var62 < this.field8103) {
                    var62 = this.field8103;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field8080 - 1) {
                    var63 = this.field8080 - 1;
                }
                int var64 = this.field8081 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field8099[var64]) {
                        this.field8086[var64] = arg4;
                    }
                    ++var64;
                }
                ++var10;
                var61 += var58 + var58;
                var60 += var58++ + var58;
            }
        } else if (arg5 == 1) {
            int var17 = (var16 << 24) + ((arg4 & 16711935) * var16 >> 8 & 16711935) + ((arg4 & 65280) * var16 >> 8 & 65280);
            int var18 = 256 - var16;
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var30 = arg0 - var12 + 1;
                if (var30 < this.field8103) {
                    var30 = this.field8103;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field8080) {
                    var31 = this.field8080;
                }
                int var32 = this.field8081 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field8099[var32]) {
                        int var34 = this.field8086[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field8086[var32] = var17 + var35;
                    }
                    ++var32;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var19 = arg3;
            int var20 = -var13;
            int var21 = var20 * var20 + var11;
            int var22 = var21 - arg3;
            int var23 = var21 - var20;
            while (var10 < var9) {
                while (var23 > var11 && var22 > var11) {
                    var23 -= var19-- + var19;
                    var22 -= var19 + var19;
                }
                int var24 = arg0 - var19;
                if (var24 < this.field8103) {
                    var24 = this.field8103;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field8080 - 1) {
                    var25 = this.field8080 - 1;
                }
                int var26 = this.field8081 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field8099[var26]) {
                        int var28 = this.field8086[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field8086[var26] = var17 + var29;
                    }
                    ++var26;
                }
                ++var10;
                var23 += var20 + var20;
                var22 += var20++ + var20;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var49 = arg0 - var12 + 1;
                if (var49 < this.field8103) {
                    var49 = this.field8103;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field8080) {
                    var50 = this.field8080;
                }
                int var51 = this.field8081 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field8099[var51]) {
                        int var53 = this.field8086[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field8086[var51] = var54 - var56 | var56 - (var56 >>> 8);
                    }
                    ++var51;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var36 = arg3;
            int var37 = -var13;
            int var38 = var37 * var37 + var11;
            int var39 = var38 - arg3;
            int var40 = var38 - var37;
            while (var10 < var9) {
                while (var40 > var11 && var39 > var11) {
                    var40 -= var36-- + var36;
                    var39 -= var36 + var36;
                }
                int var41 = arg0 - var36;
                if (var41 < this.field8103) {
                    var41 = this.field8103;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field8080 - 1) {
                    var42 = this.field8080 - 1;
                }
                int var43 = this.field8081 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field8099[var43]) {
                        int var45 = this.field8086[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field8086[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIZ)Lf;", line = 2261)
    public final class536 method1071(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class87(this, arg0, arg1) : new class617(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lfa;)V", line = 2388)
    private class578(class526 arg0) {
        super(arg0);
        this.field8067 = false;
        this.field8070 = false;
        this.field8072 = new class68(4);
        this.field8087 = false;
        this.field8073 = 0;
        this.field8090 = 512;
        this.field8096 = 45823;
        this.field8079 = 75518;
        this.field8095 = 78642;
        this.field8093 = 512;
        this.field8103 = 0;
        this.field8091 = 50;
        this.field8080 = 0;
        this.field8097 = 0;
        this.field8101 = 3500;
        this.field8098 = 0;
        this.field8107 = 0;
        this.field8088 = new class450(16);
        this.field8109 = -1;
        this.field8082 = new class450(256);
        this.field8106 = new class461();
        this.method1063(1);
        this.method1040(0);
        class48.method305(true, false, (byte) 88);
        this.field8070 = true;
        this.field8069 = (int) class571.method3150(112);
    }

    @OriginalMember(owner = "client!nga", name = "U", descriptor = "()I", line = 2270)
    public final int method1055() {
        return this.field8101;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 2273)
    public final class272 method1008(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class694(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nga", name = "pa", descriptor = "(III)V", line = 2278)
    public final void method1075(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8084.length; ++var4) {
            class50 var5 = this.field8084[var4];
            var5.field721 = arg0 & 16777215;
            int var6 = var5.field721 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field721 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field721 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field721 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field712 = false;
            } else {
                var5.field712 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V", line = 2309)
    public final void method1038(boolean arg0) {
    }

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "(I)Z", line = 2312)
    public final boolean method3196(int arg0) {
        return super.field7898.method2480(false, arg0);
    }

    @OriginalMember(owner = "client!nga", name = "A", descriptor = "()V", line = 2315)
    public final void method1069() {
        if (this.field8070) {
            class326.method1865(false, true, false);
            this.field8070 = false;
        }
        this.field8071 = null;
        this.field8068 = null;
        this.field8072 = null;
        this.field8067 = true;
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "()Z", line = 2327)
    public final boolean method985() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "()Z", line = 2330)
    public final boolean method1032() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "L", descriptor = "()V", line = 2335)
    public final void method1039() {
        for (int var1 = 0; var1 < this.field8084.length; ++var1) {
            this.field8084[var1].field721 = this.field8084[var1].field704;
            this.field8084[var1].field715 = false;
        }
    }

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "()Z", line = 2346)
    public final boolean method996() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "VA", descriptor = "(IFFFFF)V", line = 2349)
    public final void method994(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field8096 = (int) (arg1 * 65535.0F);
        this.field8095 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field8076 = (int) (arg3 * 65535.0F / var7);
        this.field8075 = (int) (arg4 * 65535.0F / var7);
        this.field8085 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2358)
    public final void method987(Rectangle[] arg0, int arg1) throws class180 {
        if (this.field8068 != null && this.field8071 != null) {
            try {
                Graphics var3 = this.field8068.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field8081 && var5.y <= this.field8078 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field8071.method855(var5.y, var5.x, var5.width, var3, (byte) -124, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field8068.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!nga", name = "DA", descriptor = "()I", line = 2399)
    public final int method1045() {
        int var1 = this.field8098;
        this.field8098 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nga", name = "ya", descriptor = "()V", line = 2404)
    public final void method1031() {
        if (this.field8103 == 0 && this.field8081 == this.field8080 && this.field8073 == 0 && this.field8107 == this.field8078) {
            int var1 = this.field8099.length;
            int var2 = var1 - var1 & 7;
            int var3 = 0;
            while (var3 < var2) {
                this.field8099[var3++] = Integer.MAX_VALUE;
                this.field8099[var3++] = Integer.MAX_VALUE;
                this.field8099[var3++] = Integer.MAX_VALUE;
                this.field8099[var3++] = Integer.MAX_VALUE;
                this.field8099[var3++] = Integer.MAX_VALUE;
                this.field8099[var3++] = Integer.MAX_VALUE;
                this.field8099[var3++] = Integer.MAX_VALUE;
                this.field8099[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field8099[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field8080 - this.field8103;
            int var5 = this.field8107 - this.field8073;
            int var6 = this.field8081 - var4;
            int var7 = this.field8081 * this.field8073 + this.field8103;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field8099[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIII)V", line = 2485)
    public final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class50 var8 = this.method3189(Thread.currentThread());
        class229 var9 = var8.field745;
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
            int var23 = arg0 - var9.method1374();
            int var24 = arg1 - var9.method1385();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field2864 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2864 = 255 - (arg4 >>> 24);
            }
            this.method1034(false);
            var9.field2862 = var25 < 0 || var25 > var9.field2849 || var26 < 0 || var26 > var9.field2849 || var27 < 0 || var27 > var9.field2849;
            var9.method1383(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field2862 = var25 < 0 || var25 > var9.field2849 || var27 < 0 || var27 > var9.field2849 || var28 < 0 || var28 > var9.field2849;
            var9.method1383(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method1034(true);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljt;)V", line = 2557)
    public final void method980(class533 arg0) {
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIII)V", line = 2560)
    public final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1084(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1084(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1002(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1002(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field8103) {
                    var10 += (this.field8103 - arg0) * var12;
                    arg0 = this.field8103;
                }
                if (var13 >= this.field8080) {
                    var13 = this.field8080 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field8073 && var17 < this.field8107) {
                                int var18 = this.field8081 * var17 + arg0;
                                int var19 = this.field8086[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field8086[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field8073 && var21 < this.field8107) {
                                int var22 = this.field8081 * var21 + arg0;
                                int var23 = this.field8086[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field8086[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field8073 && var27 < this.field8107) {
                            this.field8086[this.field8081 * var27 + arg0] = arg4;
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
                if (arg1 < this.field8073) {
                    var29 += (this.field8073 - arg1) * var31;
                    arg1 = this.field8073;
                }
                if (var32 >= this.field8107) {
                    var32 = this.field8107 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field8103 && var46 < this.field8080) {
                            this.field8086[this.field8081 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field8103 && var36 < this.field8080) {
                            int var37 = this.field8081 * arg1 + var36;
                            int var38 = this.field8086[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field8086[this.field8081 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field8103 && var40 < this.field8080) {
                            int var41 = this.field8081 * arg1 + var40;
                            int var42 = this.field8086[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field8086[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!nga", name = "CA", descriptor = "(IIII)V", line = 2775)
    public final void method1000(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field8084.length; ++var5) {
            this.field8084[var5].field704 = this.field8084[var5].field721;
            this.field8084[var5].field709 = arg0;
            this.field8084[var5].field721 = arg1;
            this.field8084[var5].field716 = arg2;
            this.field8084[var5].field715 = true;
        }
    }

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "()V", line = 2788)
    public final void method1082() {
        if (this.field8068 != null) {
            this.field8086 = this.field8071.field8274;
            this.field8081 = this.field8071.field8279;
            this.field8078 = this.field8071.field8280;
        } else {
            this.field8081 = 1;
            this.field8078 = 1;
            this.field8086 = null;
        }
        this.field8104 = null;
        this.method3184();
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V", line = 2806)
    public final void method1051(int arg0) {
        int var2 = arg0 - this.field8069;
        for (Object var3 = this.field8082.method2410(true); var3 != null; var3 = this.field8082.method2417(-26973)) {
            class45 var4 = (class45) var3;
            if (var4.field594) {
                var4.field597 += var2;
                int var5 = var4.field597 / 20;
                if (var5 > 0) {
                    class13 var6 = super.field7898.method2486(var4.field598, (byte) 86);
                    var4.method274(var6.field239 * var2 * 50 / 1000, var6.field228 * var2 * 50 / 1000);
                    var4.field597 -= var5 * 20;
                }
                var4.field594 = false;
            }
        }
        this.field8069 = arg0;
        this.field8088.method2411(true, 5);
        this.field8082.method2411(true, 5);
    }

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "()Z", line = 2838)
    public final boolean method1049() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "C", descriptor = "()Lq;", line = 2841)
    public final class491 method1087() {
        return new class461();
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2845)
    public final void method1020(Canvas arg0) {
        if (this.field8068 == arg0) {
            this.method1086((Canvas) null);
        }
        class589 var2 = (class589) this.field8072.method399(-32748, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1871(-125);
        }
    }

    @OriginalMember(owner = "client!nga", name = "XA", descriptor = "(IIIII)V", line = 2858)
    public final void method1084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field8073 && arg1 < this.field8107) {
            if (arg0 < this.field8103) {
                arg2 -= this.field8103 - arg0;
                arg0 = this.field8103;
            }
            if (arg0 + arg2 > this.field8080) {
                arg2 = this.field8080 - arg0;
            }
            int var6 = this.field8081 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field8086[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field8086[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field8086[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field8086[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field8086[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)Le;", line = 2930)
    public final class385 method1015(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "()Z", line = 2933)
    public final boolean method1047() {
        return true;
    }

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "()Z", line = 2936)
    public final boolean method975() {
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[I[I)Lua;", line = 2939)
    public final class600 method1080(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class355(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(FFF)V", line = 2941)
    public final void method1014(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!nga", name = "v", descriptor = "()[I", line = 2944)
    public final int[] method1016() {
        return new int[] { this.field8102, this.field8077, this.field8090, this.field8093 };
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIF)Lgga;", line = 2947)
    public final class332 method1035(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "la", descriptor = "(IIII)V", line = 2961)
    public final void method1048(int arg0, int arg1, int arg2, int arg3) {
        this.field8102 = arg0;
        this.field8077 = arg1;
        this.field8090 = arg2;
        this.field8093 = arg3;
        this.method3194();
    }
}
