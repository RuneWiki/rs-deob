import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class108 extends class313 {

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public int field1355 = 50;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public int field1345 = 45823;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public int field1350 = 75518;

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
    private int field1369 = 0;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
    private boolean field1347 = false;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public int field1356 = 0;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "Z")
    public boolean field1362 = false;

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
    public int field1372 = 0;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "Z")
    private boolean field1348 = false;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public int field1359 = 0;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    private int field1368 = 0;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
    public int field1365 = 512;

    @OriginalMember(owner = "client!sq", name = "cb", descriptor = "I")
    public int field1382 = 0;

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "Z")
    private boolean field1373 = false;

    @OriginalMember(owner = "client!sq", name = "fb", descriptor = "I")
    public int field1385 = 78642;

    @OriginalMember(owner = "client!sq", name = "ab", descriptor = "I")
    public int field1380 = 512;

    @OriginalMember(owner = "client!sq", name = "hb", descriptor = "I")
    public int field1387 = 0;

    @OriginalMember(owner = "client!sq", name = "ib", descriptor = "I")
    public int field1388 = 3500;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public int field1364 = 0;

    @OriginalMember(owner = "client!sq", name = "jb", descriptor = "I")
    private int field1389 = 0;

    @OriginalMember(owner = "client!sq", name = "kb", descriptor = "I")
    private int field1390 = 3500;

    @OriginalMember(owner = "client!sq", name = "bb", descriptor = "I")
    public int field1381 = this.field1390 - 255;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
    public int field1367 = 0;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "Lku;")
    private class232 field1363 = new class232(16);

    @OriginalMember(owner = "client!sq", name = "Z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1379;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "Lqn;")
    private class44 field1352;

    @OriginalMember(owner = "client!sq", name = "eb", descriptor = "[I")
    public int[] field1384;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "F")
    private float field1366;

    @OriginalMember(owner = "client!sq", name = "db", descriptor = "F")
    private float field1383;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!sq", name = "gb", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "Ljl;")
    public class162 field1351;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "Lku;")
    private class232 field1371;

    @OriginalMember(owner = "client!sq", name = "lb", descriptor = "Lnl;")
    private class356 field1391;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Z")
    public boolean field1354;

    @OriginalMember(owner = "client!sq", name = "Y", descriptor = "[Lnj;")
    private class148[] field1378;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "()Z")
    public final boolean method598() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field1351.field2404 * arg2 + this.field1351.field2403 * arg0 + this.field1351.field2396 * arg1 >> 15) + this.field1351.field2399;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field1351.field2404 * arg5 + this.field1351.field2403 * arg3 + this.field1351.field2396 * arg4 >> 15) + this.field1351.field2399;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field1355 || var8 >= this.field1355) && (var7 <= this.field1390 || var8 <= this.field1390)) {
            int var9 = ((this.field1351.field2406 * arg2 + this.field1351.field2405 * arg0 + this.field1351.field2401 * arg1 >> 15) + this.field1351.field2397) * this.field1365 / var7;
            int var10 = ((this.field1351.field2406 * arg5 + this.field1351.field2405 * arg3 + this.field1351.field2401 * arg4 >> 15) + this.field1351.field2397) * this.field1365 / var8;
            if (var9 < this.field1386 && var10 < this.field1386 || var9 > this.field1353 && var10 > this.field1353) {
                return false;
            } else {
                int var11 = ((this.field1351.field2402 * arg2 + this.field1351.field2400 * arg1 + this.field1351.field2398 * arg0 >> 15) + this.field1351.field2407) * this.field1380 / var7;
                int var12 = ((this.field1351.field2402 * arg5 + this.field1351.field2400 * arg4 + this.field1351.field2398 * arg3 >> 15) + this.field1351.field2407) * this.field1380 / var8;
                return (var11 >= this.field1376 || var12 >= this.field1376) && (var11 <= this.field1361 || var12 <= this.field1361);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIIII)V")
    public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field1387 && arg1 < this.field1356) {
            if (arg0 < this.field1372) {
                arg2 -= this.field1372 - arg0;
                arg0 = this.field1372;
            }
            if (arg0 + arg2 > this.field1367) {
                arg2 = this.field1367 - arg0;
            }
            int var6 = this.field1357 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1384[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field1384[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field1384[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field1384[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field1384[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "()Los;")
    public final class282 method601() {
        class148 var1 = this.method638(Thread.currentThread());
        return var1.field2174;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "()V")
    private final void method602() {
        if (this.field1383 != 0.0F) {
            float var1 = (float) this.field1390;
            float var2 = (float) this.field1355;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field1366 / (this.field1383 + this.field1366);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field1383;
            this.field1388 = (int) (((float) this.field1390 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field1388 = this.field1390;
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "()Z")
    public final boolean method603() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIII)V")
    public final void method604(int arg0, int arg1, int arg2, int arg3) {
        this.field1346 = arg0;
        this.field1370 = arg1;
        this.field1365 = arg2;
        this.field1380 = arg3;
        this.method628();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class148 var11 = this.method638(Thread.currentThread());
        class47 var12 = var11.field2182;
        var12.field652 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field652 = false;
            var12.field657 = 0;
            var12.field660 = true;
            var12.method307(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field652 = false;
            var12.field657 = 255 - var13;
            var12.field660 = true;
            var12.method307(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field652 = true;
    }

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "()I")
    public final int method606() {
        return 0;
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(IIII)V")
    public final void method607(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "()I")
    public final int method608() {
        return this.field1390;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Los;)V")
    public final void method609(class282 arg0) {
        this.field1351 = (class162) arg0;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public final void method610(int arg0) {
        if (this.field1358 != arg0) {
            this.field1358 = arg0;
            this.field1378 = new class148[this.field1358];
            for (int var2 = 0; var2 < this.field1358; ++var2) {
                this.field1378[var2] = new class148(this);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)V")
    public final void method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class148 var8 = this.method638(Thread.currentThread());
        class47 var9 = var8.field2182;
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
            int var21 = arg0 - var9.method308();
            int var22 = arg1 - var9.method310();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field657 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field657 = 255 - (arg4 >> 24);
            }
            var9.field660 = var23 < 0 || var23 > var9.field655 || var24 < 0 || var24 > var9.field655 || var25 < 0 || var25 > var9.field655;
            var9.method306(var27, var28, var29, var23, var24, var25, arg4);
            var9.field660 = var23 < 0 || var23 > var9.field655 || var24 < 0 || var24 > var9.field655 || var26 < 0 || var26 > var9.field655;
            var9.method306(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lf;Lcs;Los;[Lkt;I)V")
    public final void method612(class491[] arg0, class207 arg1, class282 arg2, class98[] arg3, int arg4) {
        class205[] var6 = new class205[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class205) arg0[var7];
            }
        }
        class205 var8 = class205.method1291(this, var6);
        var8.method1326(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIII)V")
    public final void method613(int arg0, int arg1, int arg2, int arg3) {
        this.field1389 = this.field1364;
        this.field1359 = arg0;
        this.field1364 = arg1;
        this.field1382 = arg2;
        this.field1362 = true;
    }

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "()I")
    public final int method614() {
        int var1 = this.field1368;
        this.field1368 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "()I")
    public final int method615() {
        int var1 = this.field1369;
        this.field1369 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "()Z")
    public final boolean method616() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIII)V")
    public final void method617(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field1357) {
            arg2 = this.field1357;
        }
        if (arg3 > this.field1349) {
            arg3 = this.field1349;
        }
        this.field1372 = arg0;
        this.field1367 = arg2;
        this.field1387 = arg1;
        this.field1356 = arg3;
        this.method628();
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
    public final void method618(boolean arg0) {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FFF)V")
    public final void method619(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "()V")
    public final void method620() {
        this.field1371.method1478((byte) -116);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lcs;)V")
    public final void method621(class207 arg0) {
        class413 var2 = arg0.field3161.field3579;
        for (class413 var3 = var2.field5807; var2 != var3; var3 = var3.field5807) {
            class74 var4 = (class74) var3;
            int var5 = var4.field913 >> 12;
            int var6 = var4.field907 >> 12;
            int var7 = var4.field910 >> 12;
            int var8 = (this.field1351.field2404 * var7 + this.field1351.field2403 * var5 + this.field1351.field2396 * var6 >> 15) + this.field1351.field2399;
            if (var8 >= this.field1355 && var8 <= this.field1390) {
                int var9 = ((this.field1351.field2406 * var7 + this.field1351.field2405 * var5 + this.field1351.field2401 * var6 >> 15) + this.field1351.field2397) * this.field1365 / var8 + this.field1346;
                int var10 = ((this.field1351.field2402 * var7 + this.field1351.field2400 * var6 + this.field1351.field2398 * var5 >> 15) + this.field1351.field2407) * this.field1380 / var8 + this.field1370;
                if (var9 >= this.field1372 && var9 <= this.field1367 && var10 >= this.field1387 && var10 <= this.field1356) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method624(var4, var9, var10, (var4.field911 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "()V")
    public final void method622() {
        if (this.field1379 != null && this.field1352 != null) {
            try {
                Graphics var1 = this.field1379.getGraphics();
                this.field1352.method295(0, (byte) -97, 0, var1);
            } catch (Exception var2) {
                this.field1379.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)Z")
    public final boolean method623(int arg0) {
        return super.field4432.method702(arg0, 93);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lfg;III)V")
    public final void method624(class74 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field915;
        if (var6 == -1) {
            this.method630(arg1, arg2, var5, arg0.field909, 1);
        } else {
            if (this.field1391 == null || (long) var6 != this.field1391.field3568) {
                this.field1391 = (class356) this.field1363.method1479(0, (long) var6);
            }
            if (this.field1391 == null) {
                int[] var7 = this.method635(var6);
                if (var7 == null) {
                    return;
                }
                this.field1391 = new class356();
                this.field1391.field5140 = this.method658(var6);
                int var8 = this.field1391.field5140 ? 64 : 128;
                this.field1391.field5145 = this.method651(var7, 0, var8, var8, var8);
                this.field1363.method1473(this.field1391, (long) var6, -35);
            }
            if (this.field1391.field5140) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field1391.field5145.method140(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field909, 1);
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(II)V")
    public final void method625(int arg0, int arg1) {
        this.field1355 = arg0;
        this.field1390 = arg1;
        this.field1381 = this.field1390 - 255;
        this.method602();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIZ)Ltr;")
    public final class176 method626(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field1357 * arg1 + arg0;
        int var8 = this.field1357 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field1384[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class56(this, var6, arg2, arg3);
        } else {
            return new class21(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lf;Los;[Lkt;I)V")
    public final void method627(class491[] arg0, class282 arg1, class98[] arg2, int arg3) {
        class205[] var5 = new class205[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class205) arg0[var6];
            }
        }
        class205 var7 = class205.method1291(this, var5);
        var7.method1326(arg1, arg2 != null ? arg2[0] : null, (class207) null, arg3);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "()V")
    private final void method628() {
        this.field1386 = this.field1372 - this.field1346;
        this.field1353 = this.field1367 - this.field1346;
        this.field1376 = this.field1387 - this.field1370;
        this.field1361 = this.field1356 - this.field1370;
        for (int var1 = 0; var1 < this.field1358; ++var1) {
            class47 var5 = this.field1378[var1].field2182;
            var5.field651 = this.field1346 - this.field1372;
            var5.field656 = this.field1370 - this.field1387;
            var5.field655 = this.field1367 - this.field1372;
            var5.field661 = this.field1356 - this.field1387;
        }
        int var2 = this.field1387 * this.field1357 + this.field1372;
        for (int var3 = this.field1387; var3 < this.field1356; ++var3) {
            for (int var4 = 0; var4 < this.field1358; ++var4) {
                this.field1378[var4].field2182.field662[var3 - this.field1387] = var2;
            }
            var2 += this.field1357;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field1357 * arg1 + arg0;
            int var15 = this.field1357 - arg2;
            if (arg1 + arg3 > this.field1356) {
                arg3 -= arg1 + arg3 - this.field1356;
            }
            if (arg1 < this.field1387) {
                int var16 = this.field1387 - arg1;
                arg3 -= var16;
                var14 += this.field1357 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field1367) {
                int var17 = arg0 + arg2 - this.field1367;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field1372) {
                int var18 = this.field1372 - arg0;
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
                            int var28 = this.field1384[var14];
                            this.field1384[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field1384[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field1384[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field1384[var14++] = arg5;
                        } else {
                            this.field1384[var14++] = arg4;
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

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
    public final void method630(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field1387) {
            var6 = this.field1387;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field1356) {
            var7 = this.field1356;
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
                if (var64 < this.field1372) {
                    var64 = this.field1372;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field1367) {
                    var65 = this.field1367;
                }
                int var66 = this.field1357 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field1384[var66++] = arg3;
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
                if (var60 < this.field1372) {
                    var60 = this.field1372;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field1367 - 1) {
                    var61 = this.field1367 - 1;
                }
                int var62 = this.field1357 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field1384[var62++] = arg3;
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
                if (var28 < this.field1372) {
                    var28 = this.field1372;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field1367) {
                    var29 = this.field1367;
                }
                int var30 = this.field1357 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field1384[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field1384[var30++] = var15 + var33;
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
                if (var22 < this.field1372) {
                    var22 = this.field1372;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field1367 - 1) {
                    var23 = this.field1367 - 1;
                }
                int var24 = this.field1357 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field1384[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field1384[var24++] = var15 + var27;
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
                if (var47 < this.field1372) {
                    var47 = this.field1372;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field1367) {
                    var48 = this.field1367;
                }
                int var49 = this.field1357 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field1384[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field1384[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field1372) {
                    var39 = this.field1372;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field1367 - 1) {
                    var40 = this.field1367 - 1;
                }
                int var41 = this.field1357 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field1384[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field1384[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(IIII)V")
    public final void method631(int arg0, int arg1, int arg2, int arg3) {
        this.field1359 = arg0;
        this.field1364 = arg1;
        this.field1382 = arg2;
    }

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "()Los;")
    public final class282 method632() {
        return new class162();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I)V")
    public final void method633(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field1351.field2404 * arg2 + this.field1351.field2403 * arg0 + this.field1351.field2396 * arg1 >> 15) + this.field1351.field2399;
        if (var5 >= this.field1355 && var5 <= this.field1390) {
            int var6 = ((this.field1351.field2406 * arg2 + this.field1351.field2405 * arg0 + this.field1351.field2401 * arg1 >> 15) + this.field1351.field2397) * this.field1365 / var5;
            int var7 = ((this.field1351.field2402 * arg2 + this.field1351.field2400 * arg1 + this.field1351.field2398 * arg0 >> 15) + this.field1351.field2407) * this.field1380 / var5;
            if (var6 >= this.field1386 && var6 <= this.field1353 && var7 >= this.field1376 && var7 <= this.field1361) {
                arg3[0] = var6 - this.field1386;
                arg3[1] = var7 - this.field1376;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lja;Lja;FLja;)Lja;")
    public final class167 method634(class167 arg0, class167 arg1, float arg2, class167 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "(I)[I")
    private final int[] method635(int arg0) {
        class232 var2 = this.field1371;
        class32 var3;
        synchronized (this.field1371) {
            var3 = (class32) this.field1371.method1479(0, (long) arg0);
            if (var3 == null) {
                if (!super.field4432.method702(arg0, 81)) {
                    return null;
                }
                class279 var5 = super.field4432.method703(12095, arg0);
                int var6 = !var5.field4114 && !this.field1373 ? 128 : 64;
                var3 = new class32(arg0, var6, super.field4432.method704(true, 0.7F, var6, true, arg0, var6), var5.field4120);
                this.field1371.method1473(var3, (long) arg0, 120);
            }
        }
        var3.field419 = true;
        return var3.method222();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[[I[[IIII)Lpl;")
    public final class426 method636(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class198(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Leo;)V")
    public final void method637(int arg0, class178[] arg1) {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lnj;")
    public final class148 method638(Runnable arg0) {
        for (int var2 = 0; var2 < this.field1358; ++var2) {
            if (this.field1378[var2].field2184 == arg0) {
                return this.field1378[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "()Z")
    public final boolean method639() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "()Z")
    public final boolean method640() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII)V")
    public final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method600(arg0, arg1, arg2, arg4, arg5);
        this.method600(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method693(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method693(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
    public final void method642(int arg0) {
        int var2 = arg0 - this.field1375;
        for (Object var3 = this.field1371.method1483(32); var3 != null; var3 = this.field1371.method1477(false)) {
            class32 var4 = (class32) var3;
            if (var4.field419) {
                var4.field420 += var2;
                int var5 = var4.field420 / 20;
                if (var5 > 0) {
                    class279 var6 = super.field4432.method703(12095, var4.field423);
                    var4.method224(var6.field4106 * var2 * 50 / 1000, var6.field4104 * var2 * 50 / 1000);
                    var4.field420 -= var5 * 20;
                }
                var4.field419 = false;
            }
        }
        this.field1375 = arg0;
        this.field1363.method1486(438127120, 5);
    }

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "()V")
    public final void method643() {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lju;Z)Ltr;")
    public final class176 method644(class72 arg0, boolean arg1) {
        int[] var3 = arg0.field899;
        byte[] var4 = arg0.field898;
        int var5 = arg0.field893;
        int var6 = arg0.field897;
        class91 var11;
        if (arg1 && arg0.field892 == null) {
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
            var11 = new class119(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field892;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class56(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class56(this, var14, var5, var6);
                var11 = new class21(this, var14, var5, var6);
            }
        }
        var11.method520(arg0.field896, arg0.field891, arg0.field895, arg0.field894);
        return var11;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lwp;I)V")
    public class108(Canvas arg0, class109 arg1, int arg2) {
        super(arg2, arg1);
        this.field1379 = arg0;
        this.field1352 = class199.method1223((byte) 58, this.field1379);
        this.field1384 = this.field1352.field635;
        this.field1357 = this.field1352.field634;
        this.field1349 = this.field1352.field638;
        this.method670();
    }

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "()Z")
    public final boolean method645() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lf;Lcs;Los;Lkt;I)V")
    public final void method646(class491 arg0, class207 arg1, class282 arg2, class98 arg3, int arg4) {
        ((class205) arg0).method1326(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)I")
    public final int method647(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "()Z")
    public final boolean method648() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)[I")
    public final int[] method649(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field1357 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field1384[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIIIII)V")
    public final void method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field1372) {
            arg2 -= this.field1372 - arg0;
            arg0 = this.field1372;
        }
        if (arg1 < this.field1387) {
            arg3 -= this.field1387 - arg1;
            arg1 = this.field1387;
        }
        if (arg0 + arg2 > this.field1367) {
            arg2 = this.field1367 - arg0;
        }
        if (arg1 + arg3 > this.field1356) {
            arg3 = this.field1356 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field1367 && arg1 <= this.field1356) {
            int var7 = this.field1357 - arg2;
            int var8 = this.field1357 * arg1 + arg0;
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
                            this.field1384[var24] = arg4;
                            ++var24;
                            this.field1384[var24] = arg4;
                            ++var24;
                            this.field1384[var24] = arg4;
                            ++var24;
                            this.field1384[var24] = arg4;
                            ++var24;
                            this.field1384[var24] = arg4;
                            ++var24;
                            this.field1384[var24] = arg4;
                            ++var24;
                            this.field1384[var24] = arg4;
                            ++var24;
                            this.field1384[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field1384[var24] = arg4;
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
                        int var14 = this.field1384[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field1384[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field1384[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field1384[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIIII)Ltr;")
    public final class176 method651(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class56(this, arg0, arg1, arg2, arg3, arg4) : new class21(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class56(this, arg0, arg1, arg2, arg3, arg4) : new class21(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "()Z")
    public final boolean method652() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)I")
    public final int method653(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "()I")
    public final int method654() {
        return 0;
    }

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "()Z")
    public final boolean method655() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "()Z")
    public final boolean method656() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "()Z")
    public final boolean method657() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "(I)Z")
    public final boolean method658(int arg0) {
        return this.field1373 || super.field4432.method703(12095, arg0).field4114;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I)Lsm;")
    public final class171 method659(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class81(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "(I)[I")
    public final int[] method660(int arg0) {
        class232 var2 = this.field1371;
        class32 var3;
        synchronized (this.field1371) {
            var3 = (class32) this.field1371.method1479(0, (long) arg0);
            if (var3 == null) {
                if (!super.field4432.method702(arg0, 87)) {
                    return null;
                }
                class279 var5 = super.field4432.method703(12095, arg0);
                int var6 = !var5.field4114 && !this.field1373 ? 128 : 64;
                var3 = new class32(arg0, var6, super.field4432.method705(var6, 0.7F, true, var6, arg0, -30470), var5.field4120);
                this.field1371.method1473(var3, (long) arg0, -91);
            }
        }
        var3.field419 = true;
        return var3.method222();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public final void method661(int arg0) {
        this.field1378[arg0].method939(Thread.currentThread(), 31504);
    }

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "(I)Z")
    public final boolean method662(int arg0) {
        return super.field4432.method703(12095, arg0).field4097;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method663(Rectangle[] arg0, int arg1) {
        if (this.field1379 != null && this.field1352 != null) {
            try {
                Graphics var3 = this.field1379.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field1357 && var5.y <= this.field1349 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field1352.method294(var5.x, -66, var5.height, var5.width, var5.y, var3);
                    }
                }
            } catch (Exception var6) {
                this.field1379.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    public final void method664(int arg0) {
        this.field1378[arg0].method939((Runnable) null, 31504);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILsm;II)V")
    public final void method665(int arg0, class171 arg1, int arg2, int arg3) {
        class81 var5 = (class81) arg1;
        int[] var6 = var5.field989;
        int[] var7 = var5.field993;
        int var8;
        if (this.field1356 < var6.length + arg3) {
            var8 = this.field1356 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field1387 > arg3) {
            var9 = this.field1387 - arg3;
            arg3 = this.field1387;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field1357 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field1372 > var12) {
                    var13 -= this.field1372 - var12;
                    var12 = this.field1372;
                }
                if (this.field1367 < var12 + var13) {
                    var13 = this.field1367 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field1384[var14++] = arg0;
                }
                var10 += this.field1357;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "()Z")
    public final boolean method666() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "()V")
    public final void method667() {
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
    public final void method668(boolean arg0) {
        this.field1373 = arg0;
        this.field1371.method1478((byte) -107);
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIII)V")
    public final void method669(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1372 < arg0) {
            this.field1372 = arg0;
        }
        if (this.field1387 < arg1) {
            this.field1387 = arg1;
        }
        if (this.field1367 > arg2) {
            this.field1367 = arg2;
        }
        if (this.field1356 > arg3) {
            this.field1356 = arg3;
        }
        this.method628();
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "()V")
    private final void method670() {
        this.field1371 = new class232(20);
        this.field1351 = new class162();
        class280.method1774(false, (byte) -66, true);
        this.field1347 = true;
        this.method610(1);
        this.method661(0);
        this.method691();
    }

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "(I)I")
    public final int method671(int arg0) {
        return super.field4432.method703(12095, arg0).field4111 & 65535;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lgf;)V")
    public final void method672(class166 arg0) {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public final void method673(boolean arg0) {
    }

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "()Z")
    public final boolean method674() {
        return this.field1348;
    }

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "()V")
    public final void method675() {
        this.field1364 = this.field1389;
        this.field1362 = false;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIILsm;II)V")
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class171 arg6, int arg7, int arg8) {
        class81 var10 = (class81) arg6;
        int[] var11 = var10.field989;
        int[] var12 = var10.field993;
        int var13 = this.field1387 > arg8 ? this.field1387 : arg8;
        int var14 = this.field1356 < var11.length + arg8 ? this.field1356 : var11.length + arg8;
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
            if (arg0 < this.field1372) {
                var18 += (this.field1372 - arg0) * var20;
                arg0 = this.field1372;
            }
            if (var21 >= this.field1367) {
                var21 = this.field1367 - 1;
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
                                int var28 = this.field1357 * var25 + arg0;
                                int var29 = this.field1384[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field1384[var28] = var23 + var30;
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
                                int var34 = this.field1357 * var31 + arg0;
                                int var35 = this.field1384[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field1384[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field1384[this.field1357 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field1372 && var64 < this.field1367 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field1384[this.field1357 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field1372 && var50 < this.field1367 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field1357 * arg1 + var50;
                        int var54 = this.field1384[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field1384[this.field1357 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field1372 && var56 < this.field1367 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field1357 * arg1 + var56;
                        int var60 = this.field1384[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field1384[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "()F")
    public final float method677() {
        return this.field1366;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
    public final void method678(int arg0) {
        this.method650(0, 0, this.field1357, this.field1349, arg0, 0);
    }

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "()V")
    public final void method679() {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(F)V")
    public final void method680(float arg0) {
        this.field1350 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "()V")
    public final void method681() {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
    public final void method682(int arg0, int arg1) {
        this.field1364 = arg0 & 16777215;
        int var3 = this.field1364 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field1364 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field1364 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field1364 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field1354 = false;
        } else {
            this.field1354 = true;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method683(Canvas arg0) {
        this.field1379 = arg0;
        this.method698();
    }

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "()Z")
    public final boolean method684() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lja;)V")
    public final void method685(class167 arg0) {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FF)V")
    public final void method686(float arg0, float arg1) {
        this.field1366 = arg0;
        this.field1383 = arg1;
        this.method602();
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "()I")
    public final int method687() {
        return this.field1355;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lqb;[Lju;Z)Loh;")
    public final class256 method688(class135 arg0, class72[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field893;
            var5[var7] = arg1[var7].field897;
            if (arg1[var7].field892 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class270(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class219(this, arg0, arg1, var4, var5);
        } else {
            return new class463(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIIII)Lja;")
    public final class167 method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([I)V")
    public final void method690(int[] arg0) {
        arg0[0] = this.field1372;
        arg0[1] = this.field1387;
        arg0[2] = this.field1367;
        arg0[3] = this.field1356;
    }

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "()V")
    public final void method691() {
        this.field1372 = 0;
        this.field1387 = 0;
        this.field1367 = this.field1357;
        this.field1356 = this.field1349;
        this.method628();
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)Lgf;")
    public final class166 method692(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIII)V")
    public final void method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field1372 && arg0 < this.field1367) {
            if (arg1 < this.field1387) {
                arg2 -= this.field1387 - arg1;
                arg1 = this.field1387;
            }
            if (arg1 + arg2 > this.field1356) {
                arg2 = this.field1356 - arg1;
            }
            int var6 = this.field1357 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1357 * var10 + var6;
                        int var12 = this.field1384[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field1384[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field1357 * var14 + var6;
                        int var16 = this.field1384[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field1384[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field1384[this.field1357 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "()F")
    public final float method694() {
        return this.field1383;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IFFFFF)V")
    public final void method695(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field1345 = (int) (arg1 * 65535.0F);
        this.field1385 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field1360 = (int) (arg3 * 65535.0F / var7);
        this.field1374 = (int) (arg4 * 65535.0F / var7);
        this.field1377 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lvn;IIII)Lf;")
    public final class491 method696(class187 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class205(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "()Z")
    public final boolean method697() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "()V")
    public final void method698() {
        this.field1352 = class199.method1223((byte) 93, this.field1379);
        this.field1384 = this.field1352.field635;
        this.field1357 = this.field1352.field634;
        this.field1349 = this.field1352.field638;
        for (int var1 = 0; var1 < this.field1358; ++var1) {
            this.field1378[var1].method931(49);
        }
        this.method691();
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIIIII)V")
    public final void method699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method600(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method600(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method693(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method693(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field1372) {
                    var10 += (this.field1372 - arg0) * var12;
                    arg0 = this.field1372;
                }
                if (var13 >= this.field1367) {
                    var13 = this.field1367 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field1387 && var17 < this.field1356) {
                                int var18 = this.field1357 * var17 + arg0;
                                int var19 = this.field1384[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field1384[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field1387 && var21 < this.field1356) {
                                int var22 = this.field1357 * var21 + arg0;
                                int var23 = this.field1384[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field1384[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field1387 && var27 < this.field1356) {
                            this.field1384[this.field1357 * var27 + arg0] = arg4;
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
                if (arg1 < this.field1387) {
                    var29 += (this.field1387 - arg1) * var31;
                    arg1 = this.field1387;
                }
                if (var32 >= this.field1356) {
                    var32 = this.field1356 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field1372 && var46 < this.field1367) {
                            this.field1384[this.field1357 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field1372 && var36 < this.field1367) {
                            int var37 = this.field1357 * arg1 + var36;
                            int var38 = this.field1384[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field1384[this.field1357 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field1372 && var40 < this.field1367) {
                            int var41 = this.field1357 * arg1 + var40;
                            int var42 = this.field1384[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field1384[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "()Z")
    public final boolean method700() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "()V")
    public final void method701() {
        if (this.field1347) {
            class148.method934(false, 28238, true);
            this.field1347 = false;
        }
        this.field1379 = null;
        this.field1352 = null;
        this.field1348 = true;
    }
}
