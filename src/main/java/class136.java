import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class136 extends class66 {

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
    private boolean field2296;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "Z")
    private boolean field2300;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "Lcja;")
    private class46 field2302;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!ut", name = "T", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!ut", name = "U", descriptor = "Z")
    private boolean field2320;

    @OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!ut", name = "cb", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!ut", name = "S", descriptor = "I")
    public int field2318;

    @OriginalMember(owner = "client!ut", name = "bb", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!ut", name = "ib", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!ut", name = "fb", descriptor = "I")
    private int field2331;

    @OriginalMember(owner = "client!ut", name = "W", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!ut", name = "db", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!ut", name = "mb", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "Lpja;")
    private class43 field2308;

    @OriginalMember(owner = "client!ut", name = "rb", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!ut", name = "jb", descriptor = "Lpja;")
    private class43 field2335;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "Lbca;")
    public class690 field2309;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    private int field2297;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    private int field2298;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    private int field2303;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!ut", name = "V", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!ut", name = "X", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!ut", name = "Y", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!ut", name = "Z", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!ut", name = "eb", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!ut", name = "gb", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!ut", name = "hb", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!ut", name = "lb", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!ut", name = "ob", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!ut", name = "pb", descriptor = "I")
    private int field2341;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "Lhf;")
    public class418 field2295;

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "Lwr;")
    private class484 field2316;

    @OriginalMember(owner = "client!ut", name = "qb", descriptor = "Lnf;")
    private class604 field2342;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2299;

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "[F")
    public float[] field2315;

    @OriginalMember(owner = "client!ut", name = "kb", descriptor = "[F")
    public float[] field2336;

    @OriginalMember(owner = "client!ut", name = "ab", descriptor = "[I")
    public int[] field2326;

    @OriginalMember(owner = "client!ut", name = "nb", descriptor = "[Lcc;")
    private class762[] field2339;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2339.length; ++var4) {
            class762 var5 = this.field2339[var4];
            var5.field10493 = arg0 & 16777215;
            int var6 = var5.field10493 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field10493 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field10493 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field10493 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field10489 = false;
            } else {
                var5.field10489 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)V")
    public final void method507(boolean arg0) {
        this.field2320 = arg0;
        this.field2335.method273(127);
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)V")
    public final void method487(int arg0) {
        class489.field6626 = arg0;
        class489.field6654 = arg0;
        if (this.field2323 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method573(this.field2323);
            this.method545(0);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(FFF)V")
    public final void method501(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ut", name = "na", descriptor = "(IIII)[I")
    public final int[] method484(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2333 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2326[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "()Z")
    public final boolean method595() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lmf;I)V")
    public final void method474(class442 arg0, int arg1) {
        class762 var3 = this.method1124(Thread.currentThread());
        class525 var4 = arg0.field5985.field9507;
        for (class525 var5 = var4.field7133; var4 != var5; var5 = var5.field7133) {
            class400 var6 = (class400) var5;
            int var7 = var6.field5516 >> 12;
            int var8 = var6.field5514 >> 12;
            int var9 = var6.field5509 >> 12;
            float var10 = (float) var9 * this.field2309.field9588 + (float) var7 * this.field2309.field9577 + (float) var8 * this.field2309.field9566 + this.field2309.field9564;
            if (!(var10 < (float) this.field2328) && !(var10 > (float) var3.field10500)) {
                int var11 = (int) (((float) var9 * this.field2309.field9575 + (float) var7 * this.field2309.field9589 + (float) var8 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / (float) arg1) + this.field2330;
                int var12 = (int) (((float) var9 * this.field2309.field9567 + (float) var7 * this.field2309.field9580 + (float) var8 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / (float) arg1) + this.field2325;
                if (var11 >= this.field2329 && var11 <= this.field2314 && var12 >= this.field2327 && var12 <= this.field2334) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1128(var6, var11, var12, (int) var10, (this.field2317 * var6.field5518 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lza;)V")
    public final void method475(class437 arg0) {
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class136(Canvas arg0, class162 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method574(arg0, arg2, arg3);
            this.method559(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method594(0);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "(ILaa;II)V")
    public final void method511(int arg0, class514 arg1, int arg2, int arg3) {
        class559 var5 = (class559) arg1;
        int[] var6 = var5.field7945;
        int[] var7 = var5.field7947;
        int var8;
        if (this.field2334 < var6.length + arg3) {
            var8 = this.field2334 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2327 > arg3) {
            var9 = this.field2327 - arg3;
            arg3 = this.field2327;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2333 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2329 > var12) {
                    var13 -= this.field2329 - var12;
                    var12 = this.field2329;
                }
                if (this.field2314 < var12 + var13) {
                    var13 = this.field2314 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2326[var14++] = arg0;
                }
                var10 += this.field2333;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "()Z")
    public final boolean method592() {
        return true;
    }

    @OriginalMember(owner = "client!ut", name = "DA", descriptor = "(IIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3) {
        this.field2330 = arg0;
        this.field2325 = arg1;
        this.field2317 = arg2;
        this.field2306 = arg3;
        this.method1121();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lmf;)V")
    public final void method478(class442 arg0) {
        class762 var2 = this.method1124(Thread.currentThread());
        class525 var3 = arg0.field5985.field9507;
        for (class525 var4 = var3.field7133; var3 != var4; var4 = var4.field7133) {
            class400 var5 = (class400) var4;
            int var6 = var5.field5516 >> 12;
            int var7 = var5.field5514 >> 12;
            int var8 = var5.field5509 >> 12;
            float var9 = (float) var8 * this.field2309.field9588 + (float) var6 * this.field2309.field9577 + (float) var7 * this.field2309.field9566 + this.field2309.field9564;
            if (!(var9 < (float) this.field2328) && !(var9 > (float) var2.field10500)) {
                int var10 = (int) (((float) var8 * this.field2309.field9575 + (float) var6 * this.field2309.field9589 + (float) var7 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / var9) + this.field2330;
                int var11 = (int) (((float) var8 * this.field2309.field9567 + (float) var6 * this.field2309.field9580 + (float) var7 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / var9) + this.field2325;
                if (var10 >= this.field2329 && var10 <= this.field2314 && var11 >= this.field2327 && var11 <= this.field2334) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1128(var5, var10, var11, (int) var9, (int) ((float) (this.field2317 * var5.field5518 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II[I[I)Laa;")
    public final class514 method517(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class559(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Len;Len;FLen;)Len;")
    public final class339 method535(class339 arg0, class339 arg1, float arg2, class339 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "(II)V")
    public final void method547(int arg0, int arg1) {
        int var3 = this.field2333 * arg1 + arg0;
        int var4 = this.field2311 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field2326;
            float[] var6 = this.field2315;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class275.method1770(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class275.method1770(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class275.method1773(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class275.method1773(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "za", descriptor = "(IIIII)V")
    public final void method567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2327) {
            var6 = this.field2327;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2334) {
            var7 = this.field2334;
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
                if (var64 < this.field2329) {
                    var64 = this.field2329;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2314) {
                    var65 = this.field2314;
                }
                int var66 = this.field2333 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2326[var66++] = arg3;
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
                if (var60 < this.field2329) {
                    var60 = this.field2329;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2314 - 1) {
                    var61 = this.field2314 - 1;
                }
                int var62 = this.field2333 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2326[var62++] = arg3;
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
                if (var28 < this.field2329) {
                    var28 = this.field2329;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2314) {
                    var29 = this.field2314;
                }
                int var30 = this.field2333 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2326[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2326[var30++] = var15 + var33;
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
                if (var22 < this.field2329) {
                    var22 = this.field2329;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2314 - 1) {
                    var23 = this.field2314 - 1;
                }
                int var24 = this.field2333 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2326[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2326[var24++] = var15 + var27;
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
                if (var47 < this.field2329) {
                    var47 = this.field2329;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2314) {
                    var48 = this.field2314;
                }
                int var49 = this.field2333 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2326[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2326[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2329) {
                    var39 = this.field2329;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2314 - 1) {
                    var40 = this.field2314 - 1;
                }
                int var41 = this.field2333 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2326[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2326[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "()Z")
    public final boolean method566() {
        return true;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method560(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class789 {
        if (this.field2299 != null && this.field2295 != null) {
            try {
                Graphics var5 = this.field2299.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field2333 && var7.y + arg3 <= this.field2321 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field2295.method2460(var7.width, var5, var7.y + arg3, var7.x + arg2, var7.y, 6452, var7.x, var7.height);
                    }
                }
            } catch (Exception var8) {
                this.field2299.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field970.method1270(arg6, true).field4244) {
                if (this.field2343 != arg6) {
                    class604 var11 = (class604) this.field2308.method266((byte) -116, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1126(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1127(arg6) ? 64 : this.field2322;
                        var11 = this.method495(0, var13, var12, var13, var13, true);
                        this.field2308.method270(var11, (long) arg6, -122);
                    }
                    this.field2343 = arg6;
                    this.field2342 = var11;
                }
                ((class36) this.field2342).method225(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1129(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2333 * arg1 + arg0;
            int var15 = this.field2333 - arg2;
            if (arg1 + arg3 > this.field2334) {
                arg3 -= arg1 + arg3 - this.field2334;
            }
            if (arg1 < this.field2327) {
                int var16 = this.field2327 - arg1;
                arg3 -= var16;
                var14 += this.field2333 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2314) {
                int var17 = arg0 + arg2 - this.field2314;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2329) {
                int var18 = this.field2329 - arg0;
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
                            int var28 = this.field2326[var14];
                            this.field2326[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2326[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2326[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2326[var14++] = arg5;
                        } else {
                            this.field2326[var14++] = arg4;
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

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class762 var8 = this.method1124(Thread.currentThread());
        class376 var9 = var8.field10539;
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
            int var23 = arg0 - var9.method2284();
            int var24 = arg1 - var9.method2281();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field5087 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5087 = 255 - (arg4 >>> 24);
            }
            this.method557(false);
            var9.field5096 = var25 < 0 || var25 > var9.field5093 || var26 < 0 || var26 > var9.field5093 || var27 < 0 || var27 > var9.field5093;
            var9.method2288((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field5096 = var25 < 0 || var25 > var9.field5093 || var27 < 0 || var27 > var9.field5093 || var28 < 0 || var28 > var9.field5093;
            var9.method2288((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method557(true);
        }
    }

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "(IIIIIII)I")
    public final int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field2309.field9588 + (float) arg0 * this.field2309.field9577 + (float) arg1 * this.field2309.field9566 + this.field2309.field9564;
        float var9 = (float) arg5 * this.field2309.field9588 + (float) arg3 * this.field2309.field9577 + (float) arg4 * this.field2309.field9566 + this.field2309.field9564;
        int var10 = 0;
        if (var8 < (float) this.field2328 && var9 < (float) this.field2328) {
            var10 |= 16;
        } else if (var8 > (float) this.field2313 && var9 > (float) this.field2313) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field2309.field9575 + (float) arg0 * this.field2309.field9589 + (float) arg1 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field2309.field9575 + (float) arg3 * this.field2309.field9589 + (float) arg4 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / (float) arg6);
        if (var11 < this.field2340 && var12 < this.field2340) {
            var10 |= 1;
        } else if (var11 > this.field2305 && var12 > this.field2305) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field2309.field9567 + (float) arg0 * this.field2309.field9580 + (float) arg1 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field2309.field9567 + (float) arg3 * this.field2309.field9580 + (float) arg4 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / (float) arg6);
        if (var13 < this.field2324 && var14 < this.field2324) {
            var10 |= 4;
        } else if (var13 > this.field2307 && var14 > this.field2307) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "(I)V")
    public final void method573(int arg0) {
        this.field2323 = arg0;
        this.field2339 = new class762[this.field2323];
        for (int var2 = 0; var2 < this.field2323; ++var2) {
            this.field2339[var2] = new class762(this);
        }
    }

    @OriginalMember(owner = "client!ut", name = "da", descriptor = "(III[I)V")
    public final void method515(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2309.field9588 + (float) arg0 * this.field2309.field9577 + (float) arg1 * this.field2309.field9566 + this.field2309.field9564;
        if (!(var5 < (float) this.field2328) && !(var5 > (float) this.field2313)) {
            int var6 = (int) (((float) arg2 * this.field2309.field9575 + (float) arg0 * this.field2309.field9589 + (float) arg1 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / var5);
            int var7 = (int) (((float) arg2 * this.field2309.field9567 + (float) arg0 * this.field2309.field9580 + (float) arg1 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / var5);
            if (var6 >= this.field2340 && var6 <= this.field2305 && var7 >= this.field2324 && var7 <= this.field2307) {
                arg3[0] = var6 - this.field2340;
                arg3[1] = var7 - this.field2324;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "ya", descriptor = "()V")
    public final void method494() {
        if (this.field2329 == 0 && this.field2333 == this.field2314 && this.field2327 == 0 && this.field2334 == this.field2321) {
            int var1 = this.field2315.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field2315[var3++] = 2.1474836E9F;
                this.field2315[var3++] = 2.1474836E9F;
                this.field2315[var3++] = 2.1474836E9F;
                this.field2315[var3++] = 2.1474836E9F;
                this.field2315[var3++] = 2.1474836E9F;
                this.field2315[var3++] = 2.1474836E9F;
                this.field2315[var3++] = 2.1474836E9F;
                this.field2315[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field2315[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field2314 - this.field2329;
            int var5 = this.field2334 - this.field2327;
            int var6 = this.field2333 - var4;
            int var7 = this.field2333 * this.field2327 + this.field2329;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field2315[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)V")
    public final void method514(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "()I")
    public final int method572() {
        int var1 = this.field2310;
        this.field2310 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ut", name = "xa", descriptor = "(F)V")
    public final void method480(float arg0) {
        this.field2338 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIII)V")
    private final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field2327 && arg1 < this.field2334) {
            int var9 = this.field2333 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field2329 && arg0 + var15 < this.field2314 && var12 < arg5) {
                            int var16 = this.field2326[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field2326[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field2329 && arg0 + var18 < this.field2314 && var12 < arg5) {
                            int var19 = this.field2326[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field2326[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field2329 && arg0 + var23 < this.field2314 && var12 < arg5) {
                        this.field2326[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "GA", descriptor = "(I)V")
    public final void method536(int arg0) {
        this.method537(0, 0, this.field2333, this.field2321, arg0, 0);
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(II)I")
    public final int method593(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "()V")
    public final void method548() {
    }

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "()V")
    public final void method541() {
        this.field2335.method273(126);
        this.field2308.method273(0);
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V")
    public final void method545(int arg0) {
        this.field2339[arg0].method4214(Thread.currentThread(), (byte) -35);
    }

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "()Lsk;")
    public final class650 method539() {
        return this.field2309;
    }

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "()I")
    public final int method497() {
        return 0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class762 var14 = this.method1124(Thread.currentThread());
        class376 var15 = var14.field10539;
        var15.field5097 = false;
        int var16 = arg0 - this.field2340;
        int var17 = arg3 - this.field2340;
        int var18 = arg6 - this.field2340;
        int var19 = arg1 - this.field2324;
        int var20 = arg4 - this.field2324;
        int var21 = arg7 - this.field2324;
        var15.field5096 = var16 < 0 || var16 > var15.field5093 || var17 < 0 || var17 > var15.field5093 || var18 < 0 || var18 > var15.field5093;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field5087 = 255 - var22;
                var15.field5090 = false;
                var15.method2289((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field5087 = 128;
                var15.field5090 = true;
                var15.method2289((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field5087 = 0;
            var15.field5090 = false;
            var15.method2289((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field5097 = true;
    }

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "()Z")
    public final boolean method578() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "()I")
    public final int method493() {
        return 0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIF)Lbq;")
    public final class307 method531(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)I")
    public final int method1118(int arg0) {
        return super.field970.method1270(arg0, true).field4239 & 65535;
    }

    @OriginalMember(owner = "client!ut", name = "JA", descriptor = "(IIIIII)I")
    public final int method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field2309.field9588 + (float) arg0 * this.field2309.field9577 + (float) arg1 * this.field2309.field9566 + this.field2309.field9564;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field2309.field9588 + (float) arg3 * this.field2309.field9577 + (float) arg4 * this.field2309.field9566 + this.field2309.field9564;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field2328 && var9 < (float) this.field2328) {
            var7 |= 16;
        } else if (var8 > (float) this.field2313 && var9 > (float) this.field2313) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field2309.field9575 + (float) arg0 * this.field2309.field9589 + (float) arg1 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / var8);
        int var11 = (int) (((float) arg5 * this.field2309.field9575 + (float) arg3 * this.field2309.field9589 + (float) arg4 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / var9);
        if (var10 < this.field2340 && var11 < this.field2340) {
            var7 |= 1;
        } else if (var10 > this.field2305 && var11 > this.field2305) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field2309.field9567 + (float) arg0 * this.field2309.field9580 + (float) arg1 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / var8);
        int var13 = (int) (((float) arg5 * this.field2309.field9567 + (float) arg3 * this.field2309.field9580 + (float) arg4 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / var9);
        if (var12 < this.field2324 && var13 < this.field2324) {
            var7 |= 4;
        } else if (var12 > this.field2307 && var13 > this.field2307) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "()Laja;")
    public final class100 method586() {
        return new class100(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!ut", name = "la", descriptor = "()V")
    public final void method575() {
        this.field2329 = 0;
        this.field2327 = 0;
        this.field2314 = this.field2333;
        this.field2334 = this.field2321;
        this.method1121();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method516(Canvas arg0) {
        if (this.field2299 == arg0) {
            this.method559((Canvas) null);
        }
        class418 var2 = (class418) this.field2302.method337((long) arg0.hashCode(), 1);
        if (var2 != null) {
            var2.method1207(115);
        }
    }

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "()V")
    public final void method558() {
    }

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "()Lsk;")
    public final class650 method565() {
        return new class690();
    }

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "()V")
    public final void method581() {
    }

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "()I")
    public final int method538() {
        int var1 = this.field2331;
        this.field2331 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "(I)Z")
    public final boolean method1119(int arg0) {
        return super.field970.method1274(arg0, 21532);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method589(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class772(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ut", name = "HA", descriptor = "(IIII[I)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field2309.field9588 + (float) arg0 * this.field2309.field9577 + (float) arg1 * this.field2309.field9566 + this.field2309.field9564;
        if (!(var6 < (float) this.field2328) && !(var6 > (float) this.field2313)) {
            int var7 = (int) (((float) arg2 * this.field2309.field9575 + (float) arg0 * this.field2309.field9589 + (float) arg1 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field2309.field9567 + (float) arg0 * this.field2309.field9580 + (float) arg1 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / (float) arg3);
            if (var7 >= this.field2340 && var7 <= this.field2305 && var8 >= this.field2324 && var8 <= this.field2307) {
                arg4[0] = var7 - this.field2340;
                arg4[1] = var8 - this.field2324;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "()I")
    public final int method552() {
        return this.field2328;
    }

    @OriginalMember(owner = "client!ut", name = "T", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2329 < arg0) {
            this.field2329 = arg0;
        }
        if (this.field2327 < arg1) {
            this.field2327 = arg1;
        }
        if (this.field2314 > arg2) {
            this.field2314 = arg2;
        }
        if (this.field2334 > arg3) {
            this.field2334 = arg3;
        }
        this.method1121();
    }

    @OriginalMember(owner = "client!ut", name = "ra", descriptor = "(IIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field2339.length; ++var5) {
            this.field2339[var5].field10498 = this.field2339[var5].field10493;
            this.field2339[var5].field10497 = arg0;
            this.field2339[var5].field10493 = arg1;
            this.field2339[var5].field10501 = arg2;
            this.field2339[var5].field10492 = true;
        }
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "()Z")
    public final boolean method1120() {
        return this.field2296;
    }

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "()V")
    private final void method1121() {
        this.field2340 = this.field2329 - this.field2330;
        this.field2305 = this.field2314 - this.field2330;
        this.field2324 = this.field2327 - this.field2325;
        this.field2307 = this.field2334 - this.field2325;
        for (int var1 = 0; var1 < this.field2323; ++var1) {
            class376 var5 = this.field2339[var1].field10539;
            var5.field5100 = this.field2330 - this.field2329;
            var5.field5102 = this.field2325 - this.field2327;
            var5.field5093 = this.field2314 - this.field2329;
            var5.field5088 = this.field2334 - this.field2327;
        }
        int var2 = this.field2333 * this.field2327 + this.field2329;
        for (int var3 = this.field2327; var3 < this.field2334; ++var3) {
            for (int var4 = 0; var4 < this.field2323; ++var4) {
                this.field2339[var4].field10539.field5095[var3 - this.field2327] = var2;
            }
            var2 += this.field2333;
        }
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)V")
    public final void method500(int arg0) {
        this.field2339[arg0].method4214((Runnable) null, (byte) -35);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZ)Lnf;")
    public final class604 method549(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class134(this, arg0, arg1) : new class75(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "()Z")
    public final boolean method570() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([IIIIIZ)Lnf;")
    public final class604 method587(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class134(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class75(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class134(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class75(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ut", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method590(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2318 = (int) (arg1 * 65535.0F);
        this.field2319 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2304 = (int) (arg3 * 65535.0F / var7);
        this.field2337 = (int) (arg4 * 65535.0F / var7);
        this.field2312 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
    public final void method481(int arg0) {
        int var2 = arg0 - this.field2301;
        for (Object var3 = this.field2335.method275((byte) -94); var3 != null; var3 = this.field2335.method268((byte) -90)) {
            class225 var4 = (class225) var3;
            if (var4.field3291) {
                var4.field3289 += var2;
                int var5 = var4.field3289 / 20;
                if (var5 > 0) {
                    class311 var6 = super.field970.method1270(var4.field3292, true);
                    var4.method1542(var6.field4251 * var2 * 50 / 1000, var6.field4243 * var2 * 50 / 1000);
                    var4.field3289 -= var5 * 20;
                }
                var4.field3291 = false;
            }
        }
        this.field2301 = arg0;
        this.field2308.method265(5, -23);
        this.field2335.method265(5, -84);
    }

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "()Z")
    public final boolean method585() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method477(Canvas arg0, int arg1, int arg2) {
        class418 var4 = (class418) this.field2302.method337((long) arg0.hashCode(), 1);
        if (var4 != null) {
            var4.method1207(120);
            class418 var5 = class426.method2512(arg0, arg2, arg1, (byte) -10);
            this.field2302.method341((long) arg0.hashCode(), var5, (byte) 43);
            if (this.field2299 == arg0 && this.field2316 == null) {
                Dimension var6 = arg0.getSize();
                this.field2297 = var6.width;
                this.field2298 = var6.height;
                this.field2295 = var5;
                this.field2326 = var5.field5710;
                this.field2333 = var5.field5705;
                this.field2321 = var5.field5709;
                if (this.field2333 != this.field2311 || this.field2341 != this.field2321) {
                    this.field2303 = this.field2311 = this.field2333;
                    this.field2332 = this.field2341 = this.field2321;
                    this.field2336 = this.field2315 = new float[this.field2341 * this.field2311];
                }
                this.method1122();
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[Lbq;)V")
    public final void method542(int arg0, class307[] arg1) {
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class559 var13 = (class559) arg6;
        int[] var14 = var13.field7945;
        int[] var15 = var13.field7947;
        int var16 = this.field2327 > arg8 ? this.field2327 : arg8;
        int var17 = this.field2334 < var14.length + arg8 ? this.field2334 : var14.length + arg8;
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
                        if (arg0 >= this.field2329 && arg0 < this.field2314 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field2333 * var37 + arg0;
                                int var41 = this.field2326[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field2326[var40] = var35 + var42;
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
                        if (arg0 >= this.field2329 && arg0 < this.field2314 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field2333 * var44 + arg0;
                                int var48 = this.field2326[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field2326[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field2329 && arg0 < this.field2314 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field2326[this.field2333 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field2329 && var80 < this.field2314 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field2326[this.field2333 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field2329 && var66 < this.field2314 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field2333 * arg1 + var66;
                        int var69 = this.field2326[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field2326[this.field2333 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field2329 && var72 < this.field2314 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field2333 * arg1 + var72;
                        int var75 = this.field2326[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field2326[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "()V")
    private final void method1122() {
        for (int var1 = 0; var1 < this.field2323; ++var1) {
            this.field2339[var1].method4215(353);
        }
        this.method575();
    }

    @OriginalMember(owner = "client!ut", name = "XA", descriptor = "()I")
    public final int method563() {
        return this.field2313;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIIIIII)V")
    private final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field2329 && arg0 < this.field2314) {
            int var9 = this.field2333 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field2327 && arg1 + var15 < this.field2334 && var12 < arg5) {
                            int var16 = this.field2333 * var15 + var9;
                            int var17 = this.field2326[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field2326[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field2327 && arg1 + var19 < this.field2334 && var12 < arg5) {
                            int var20 = this.field2333 * var19 + var9;
                            int var21 = this.field2326[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field2326[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field2327 && arg1 + var25 < this.field2334 && var12 < arg5) {
                        this.field2326[this.field2333 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "Y", descriptor = "()[I")
    public final int[] method496() {
        return new int[] { this.field2330, this.field2325, this.field2317, this.field2306 };
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lsk;)V")
    public final void method503(class650 arg0) {
        this.field2309 = (class690) arg0;
    }

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "()Z")
    public final boolean method577() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(IIIIII)Len;")
    public final class339 method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "()V")
    public final void method506() {
        if (this.field2299 != null) {
            this.field2326 = this.field2295.field5710;
            this.field2333 = this.field2295.field5705;
            this.field2321 = this.field2295.field5709;
            this.field2315 = this.field2336;
            this.field2311 = this.field2303;
            this.field2341 = this.field2332;
        } else {
            this.field2333 = 1;
            this.field2321 = 1;
            this.field2326 = null;
            this.field2311 = 1;
            this.field2341 = 1;
            this.field2315 = null;
        }
        this.field2316 = null;
        this.method1122();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lgh;Loq;)Lel;")
    public final class574 method546(class575 arg0, class380 arg1) {
        return new class484(this, (class604) arg0, (class361) arg1);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "()Z")
    public final boolean method485() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([I)V")
    public final void method583(int[] arg0) {
        arg0[0] = this.field2333;
        arg0[1] = this.field2321;
    }

    @OriginalMember(owner = "client!ut", name = "aa", descriptor = "(IIIIII)V")
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2329) {
            arg2 -= this.field2329 - arg0;
            arg0 = this.field2329;
        }
        if (arg1 < this.field2327) {
            arg3 -= this.field2327 - arg1;
            arg1 = this.field2327;
        }
        if (arg0 + arg2 > this.field2314) {
            arg2 = this.field2314 - arg0;
        }
        if (arg1 + arg3 > this.field2334) {
            arg3 = this.field2334 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2314 && arg1 <= this.field2334) {
            int var7 = this.field2333 - arg2;
            int var8 = this.field2333 * arg1 + arg0;
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
                            this.field2326[var24] = arg4;
                            ++var24;
                            this.field2326[var24] = arg4;
                            ++var24;
                            this.field2326[var24] = arg4;
                            ++var24;
                            this.field2326[var24] = arg4;
                            ++var24;
                            this.field2326[var24] = arg4;
                            ++var24;
                            this.field2326[var24] = arg4;
                            ++var24;
                            this.field2326[var24] = arg4;
                            ++var24;
                            this.field2326[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2326[var24] = arg4;
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
                        int var14 = this.field2326[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field2326[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2326[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2326[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "([I)V")
    public final void method580(int[] arg0) {
        arg0[0] = this.field2329;
        arg0[1] = this.field2327;
        arg0[2] = this.field2314;
        arg0[3] = this.field2334;
    }

    @OriginalMember(owner = "client!ut", name = "X", descriptor = "(I)V")
    public final void method502(int arg0) {
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIIZ)Lnf;")
    public final class604 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2333 * arg1 + arg0;
        int var8 = this.field2333 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2326[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class134(this, var6, arg2, arg3);
        } else {
            return new class75(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/Runnable;)Lcc;")
    public final class762 method1124(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2323; ++var2) {
            if (this.field2339[var2].field10494 == arg0) {
                return this.field2339[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "(I)[I")
    public final int[] method1125(int arg0) {
        class43 var2 = this.field2335;
        class225 var3;
        synchronized (this.field2335) {
            var3 = (class225) this.field2335.method266((byte) -107, (long) arg0);
            if (var3 == null) {
                if (!super.field970.method1274(arg0, 21532)) {
                    return null;
                }
                class311 var5 = super.field970.method1270(arg0, true);
                int var6 = !var5.field4248 && !this.field2320 ? this.field2322 : 64;
                var3 = new class225(arg0, var6, super.field970.method1269(0.7F, var6, true, arg0, var6, true), var5.field4242 != 1);
                this.field2335.method270(var3, (long) arg0, -122);
            }
        }
        var3.field3291 = true;
        return var3.method1540();
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Ld;)V")
    private class136(class162 arg0) {
        super(arg0);
        this.field2296 = false;
        this.field2300 = false;
        this.field2302 = new class46(4);
        this.field2313 = 3500;
        this.field2319 = 78642;
        this.field2320 = false;
        this.field2317 = 512;
        this.field2314 = 0;
        this.field2328 = 50;
        this.field2318 = 45823;
        this.field2327 = 0;
        this.field2334 = 0;
        this.field2310 = 0;
        this.field2331 = 0;
        this.field2322 = 128;
        this.field2329 = 0;
        this.field2306 = 512;
        this.field2338 = 75518;
        this.field2308 = new class43(16);
        this.field2343 = -1;
        try {
            this.field2335 = new class43(256);
            this.field2309 = new class690();
            this.method573(1);
            this.method545(0);
            class184.method1371(-2526, true, true);
            this.field2300 = true;
            this.field2301 = (int) class197.method1423(1);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method594(0);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ut", name = "U", descriptor = "(IIIII)V")
    public final void method591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2327 && arg1 < this.field2334) {
            if (arg0 < this.field2329) {
                arg2 -= this.field2329 - arg0;
                arg0 = this.field2329;
            }
            if (arg0 + arg2 > this.field2314) {
                arg2 = this.field2314 - arg0;
            }
            int var6 = this.field2333 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2326[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2326[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2326[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2326[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2326[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "(I)[I")
    public final int[] method1126(int arg0) {
        class43 var2 = this.field2335;
        class225 var3;
        synchronized (this.field2335) {
            var3 = (class225) this.field2335.method266((byte) -114, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field970.method1274(arg0, 21532)) {
                    return null;
                }
                class311 var5 = super.field970.method1270(arg0, true);
                int var6 = !var5.field4248 && !this.field2320 ? this.field2322 : 64;
                var3 = new class225(arg0, var6, super.field970.method1272(var6, arg0, 0.7F, var6, (byte) 81, true), var5.field4242 != 1);
                this.field2335.method270(var3, (long) arg0 | Long.MIN_VALUE, -127);
            }
        }
        var3.field3291 = true;
        return var3.method1540();
    }

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "(I)Z")
    public final boolean method1127(int arg0) {
        return this.field2320 || super.field970.method1270(arg0, true).field4248;
    }

    @OriginalMember(owner = "client!ut", name = "pa", descriptor = "()V")
    public final void method553() {
        for (int var1 = 0; var1 < this.field2339.length; ++var1) {
            this.field2339[var1].field10493 = this.field2339[var1].field10498;
            this.field2339[var1].field10492 = false;
        }
    }

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "(III[I)V")
    public final void method490(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2309.field9588 + (float) arg0 * this.field2309.field9577 + (float) arg1 * this.field2309.field9566 + this.field2309.field9564;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field2309.field9575 + (float) arg0 * this.field2309.field9589 + (float) arg1 * this.field2309.field9582 + this.field2309.field9571) * (float) this.field2317 / var5);
            int var7 = (int) (((float) arg2 * this.field2309.field9567 + (float) arg0 * this.field2309.field9580 + (float) arg1 * this.field2309.field9579 + this.field2309.field9585) * (float) this.field2306 / var5);
            arg3[0] = var6 - this.field2340;
            arg3[1] = var7 - this.field2324;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ldc;IIII)Lka;")
    public final class499 method505(class5 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class489(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "(IIIII)V")
    public final void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2329 && arg0 < this.field2314) {
            if (arg1 < this.field2327) {
                arg2 -= this.field2327 - arg1;
                arg1 = this.field2327;
            }
            if (arg1 + arg2 > this.field2334) {
                arg2 = this.field2334 - arg1;
            }
            int var6 = this.field2333 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2333 * var10 + var6;
                        int var12 = this.field2326[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2326[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2333 * var14 + var6;
                        int var16 = this.field2326[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2326[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2326[this.field2333 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Len;)V")
    public final void method596(class339 arg0) {
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I")
    public final int method482(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ut", name = "EA", descriptor = "(IIII)V")
    public final void method569(int arg0, int arg1, int arg2, int arg3) {
        class762 var5 = this.method1124(Thread.currentThread());
        var5.field10497 = arg0;
        var5.field10493 = arg1;
        var5.field10501 = arg2;
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "()V")
    public final void method489() {
    }

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "(Z)V")
    public final void method557(boolean arg0) {
        class762 var2 = this.method1124(Thread.currentThread());
        var2.field10495 = arg0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        class559 var10 = (class559) arg6;
        int[] var11 = var10.field7945;
        int[] var12 = var10.field7947;
        int var13 = this.field2327 > arg8 ? this.field2327 : arg8;
        int var14 = this.field2334 < var11.length + arg8 ? this.field2334 : var11.length + arg8;
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
            if (arg0 < this.field2329) {
                var18 += (this.field2329 - arg0) * var20;
                arg0 = this.field2329;
            }
            if (var21 >= this.field2314) {
                var21 = this.field2314 - 1;
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
                                int var28 = this.field2333 * var25 + arg0;
                                int var29 = this.field2326[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2326[var28] = var23 + var30;
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
                                int var34 = this.field2333 * var31 + arg0;
                                int var35 = this.field2326[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2326[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2326[this.field2333 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2329 && var64 < this.field2314 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2326[this.field2333 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2329 && var50 < this.field2314 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2333 * arg1 + var50;
                        int var54 = this.field2326[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2326[this.field2333 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2329 && var56 < this.field2314 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2333 * arg1 + var56;
                        int var60 = this.field2326[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2326[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIID)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field2311 - arg2;
        int var8 = this.field2311 * arg1 + arg0;
        float[] var9 = this.field2315;
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

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "()Z")
    public final boolean method534() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lln;IIII)V")
    private final void method1128(class400 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field5511;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1129(arg1, arg2, arg3, arg4, arg0.field5517, 1);
        } else {
            if (this.field2343 != var6) {
                class604 var9 = (class604) this.field2308.method266((byte) -128, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1126(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1127(var6) ? 64 : this.field2322;
                    var9 = this.method495(0, var11, var10, var11, var11, true);
                    this.field2308.method270(var9, (long) var6, -123);
                }
                this.field2343 = var6;
                this.field2342 = var9;
            }
            ++var8;
            ((class36) this.field2342).method225(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field5517, 1, 1);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()Z")
    public final boolean method479() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method1117(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method1117(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method1123(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method1123(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field2329 && arg0 < this.field2314 && var37 >= this.field2327 && var37 < this.field2334 && var24 < var21) {
                                int var38 = this.field2333 * var37 + arg0;
                                int var39 = this.field2326[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field2326[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field2329 && arg0 < this.field2314 && var42 >= this.field2327 && var42 < this.field2334 && var24 < var21) {
                                int var43 = this.field2333 * var42 + arg0;
                                int var44 = this.field2326[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field2326[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field2329 && arg0 < this.field2314 && var49 >= this.field2327 && var49 < this.field2334 && var24 < var21) {
                            this.field2326[this.field2333 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field2327 && arg1 < this.field2334 && var60 >= this.field2329 && var60 < this.field2314 && var24 < var21) {
                                int var61 = this.field2333 * arg1 + var60;
                                int var62 = this.field2326[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field2326[this.field2333 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field2327 && arg1 < this.field2334 && var65 >= this.field2329 && var65 < this.field2314 && var24 < var21) {
                                int var66 = this.field2333 * arg1 + var65;
                                int var67 = this.field2326[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field2326[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field2327 && arg1 < this.field2334 && var72 >= this.field2329 && var72 < this.field2314 && var24 < var21) {
                            this.field2326[this.field2333 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method591(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method591(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method551(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method551(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2329) {
                    var10 += (this.field2329 - arg0) * var12;
                    arg0 = this.field2329;
                }
                if (var13 >= this.field2314) {
                    var13 = this.field2314 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2327 && var17 < this.field2334) {
                                int var18 = this.field2333 * var17 + arg0;
                                int var19 = this.field2326[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2326[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2327 && var21 < this.field2334) {
                                int var22 = this.field2333 * var21 + arg0;
                                int var23 = this.field2326[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2326[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2327 && var27 < this.field2334) {
                            this.field2326[this.field2333 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2327) {
                    var29 += (this.field2327 - arg1) * var31;
                    arg1 = this.field2327;
                }
                if (var32 >= this.field2334) {
                    var32 = this.field2334 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2329 && var46 < this.field2314) {
                            this.field2326[this.field2333 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2329 && var36 < this.field2314) {
                            int var37 = this.field2333 * arg1 + var36;
                            int var38 = this.field2326[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2326[this.field2333 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2329 && var40 < this.field2314) {
                            int var41 = this.field2333 * arg1 + var40;
                            int var42 = this.field2326[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2326[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)Loq;")
    public final class380 method540(int arg0, int arg1) {
        return new class361(arg0, arg1);
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(II)Lgh;")
    public final class575 method562(int arg0, int arg1) {
        return this.method549(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public final void method473(int arg0) {
        this.field2322 = arg0;
        this.field2335.method273(127);
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "()Z")
    public final boolean method524() {
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
    }

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "()V")
    public final void method543() {
        if (this.field2300) {
            class660.method3712((byte) -98, true, false);
            this.field2300 = false;
        }
        this.field2295 = null;
        this.field2299 = null;
        this.field2297 = 0;
        this.field2298 = 0;
        this.field2302 = null;
        this.field2296 = true;
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(IIIIII)V")
    private final void method1129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field2327) {
            var7 = this.field2327;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field2334) {
            var8 = this.field2334;
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
                if (var65 < this.field2329) {
                    var65 = this.field2329;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field2314) {
                    var66 = this.field2314;
                }
                int var67 = this.field2333 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field2315[var67]) {
                        this.field2326[var67] = arg4;
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
                if (var61 < this.field2329) {
                    var61 = this.field2329;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field2314 - 1) {
                    var62 = this.field2314 - 1;
                }
                int var63 = this.field2333 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field2315[var63]) {
                        this.field2326[var63] = arg4;
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
                if (var29 < this.field2329) {
                    var29 = this.field2329;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field2314) {
                    var30 = this.field2314;
                }
                int var31 = this.field2333 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field2315[var31]) {
                        int var33 = this.field2326[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field2326[var31] = var16 + var34;
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
                if (var23 < this.field2329) {
                    var23 = this.field2329;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field2314 - 1) {
                    var24 = this.field2314 - 1;
                }
                int var25 = this.field2333 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field2315[var25]) {
                        int var27 = this.field2326[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field2326[var25] = var16 + var28;
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
                if (var48 < this.field2329) {
                    var48 = this.field2329;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field2314) {
                    var49 = this.field2314;
                }
                int var50 = this.field2333 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field2315[var50]) {
                        int var52 = this.field2326[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field2326[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field2329) {
                    var40 = this.field2329;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field2314 - 1) {
                    var41 = this.field2314 - 1;
                }
                int var42 = this.field2333 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field2315[var42]) {
                        int var44 = this.field2326[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field2326[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method574(Canvas arg0, int arg1, int arg2) {
        class418 var4 = (class418) this.field2302.method337((long) arg0.hashCode(), 1);
        if (var4 == null) {
            class418 var5 = class426.method2512(arg0, arg2, arg1, (byte) -10);
            this.field2302.method341((long) arg0.hashCode(), var5, (byte) 49);
        } else {
            if (var4.field5705 != arg1 || var4.field5709 != arg2) {
                this.method477(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "(I)Z")
    public final boolean method1130(int arg0) {
        return super.field970.method1270(arg0, true).field4235 || super.field970.method1270(arg0, true).field4253;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method559(Canvas arg0) {
        if (arg0 != null) {
            class418 var2 = (class418) this.field2302.method337((long) arg0.hashCode(), 1);
            if (var2 != null) {
                this.field2299 = arg0;
                Dimension var3 = arg0.getSize();
                this.field2297 = var3.width;
                this.field2298 = var3.height;
                this.field2295 = var2;
                if (this.field2316 == null) {
                    this.field2326 = var2.field5710;
                    this.field2333 = var2.field5705;
                    this.field2321 = var2.field5709;
                    if (this.field2333 != this.field2311 || this.field2341 != this.field2321) {
                        this.field2303 = this.field2311 = this.field2333;
                        this.field2332 = this.field2341 = this.field2321;
                        this.field2336 = this.field2315 = new float[this.field2341 * this.field2311];
                    }
                    this.method1122();
                    return;
                }
            }
        } else {
            this.field2299 = null;
            this.field2295 = null;
            if (this.field2316 == null) {
                this.field2326 = null;
                this.field2333 = this.field2321 = 1;
                this.field2311 = this.field2341 = 1;
                this.method1122();
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "(I)I")
    public final int method1131(int arg0) {
        return super.field970.method1270(arg0, true).field4242;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lgs;Z)Lnf;")
    public final class604 method498(class49 arg0, boolean arg1) {
        int[] var3 = arg0.field739;
        byte[] var4 = arg0.field743;
        int var5 = arg0.field745;
        int var6 = arg0.field741;
        class36 var11;
        if (arg1 && arg0.field737 == null) {
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
            var11 = new class115(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field737;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class134(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class75(this, var14, var5, var6);
            }
        }
        var11.method213(arg0.field744, arg0.field738, arg0.field740, arg0.field742);
        return var11;
    }

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "(I)Lza;")
    public final class437 method579(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(IIIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method591(arg0, arg1, arg2, arg4, arg5);
        this.method591(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method551(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method551(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "()Z")
    public final boolean method588() {
        return true;
    }

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "()Z")
    public final boolean method584() {
        return true;
    }

    @OriginalMember(owner = "client!ut", name = "KA", descriptor = "(IIII)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2333) {
            arg2 = this.field2333;
        }
        if (arg3 > this.field2321) {
            arg3 = this.field2321;
        }
        this.field2329 = arg0;
        this.field2314 = arg2;
        this.field2327 = arg1;
        this.field2334 = arg3;
        this.method1121();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lkc;[Lgs;Z)Lda;")
    public final class67 method476(class145 arg0, class49[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field745;
            var5[var7] = arg1[var7].field741;
            if (arg1[var7].field737 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class685(this, arg0, arg1, var4, var5);
            } else {
                return new class103(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class670(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)V")
    public final void method561(int arg0, int arg1) throws class789 {
        if (this.field2299 != null && this.field2295 != null) {
            try {
                Graphics var3 = this.field2299.getGraphics();
                this.field2295.method2460(this.field2297, var3, arg1, arg0, 0, 6452, 0, this.field2298);
            } catch (Exception var4) {
                this.field2299.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "(II)V")
    public final void method509(int arg0, int arg1) {
        class762 var3 = this.method1124(Thread.currentThread());
        this.field2328 = arg0;
        this.field2313 = arg1;
        var3.field10500 = this.field2313 - 255;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lel;)V")
    public final void method527(class574 arg0) {
        class484 var2 = (class484) arg0;
        this.field2333 = var2.field6547;
        this.field2321 = var2.field6549;
        this.field2326 = var2.field6541;
        this.field2316 = var2;
        this.field2311 = var2.field6547;
        this.field2341 = var2.field6549;
        this.field2315 = var2.field6545;
        this.method1122();
    }

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "()Lsk;")
    public final class650 method533() {
        class762 var1 = this.method1124(Thread.currentThread());
        return var1.field10499;
    }
}
