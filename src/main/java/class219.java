import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class219 {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    private int field3409 = -1;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    private int field3410 = -1;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Z")
    private boolean field3425 = true;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    private int field3422;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    private int field3423;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    private int field3427;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
    private boolean field3424;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    private int field3412;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field3413;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    private int field3419;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    private static int field3411 = -1;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    private static int field3408 = -1;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "[I")
    private static int[] field3417 = new int[4];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    private int field3406;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lqn;")
    private class361 field3421;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Ld;")
    private static class40 field3428;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3407;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3418;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[B")
    private static byte[] field3414;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lnb;)Z", line = 7)
    private final boolean method1633(class219 arg0) {
        if (this.field3421 == null) {
            if (this.field3419 == 0) {
                this.field3421 = class107.field1619.method754(this.field3426, -1, true, this.field3405, class107.field1613);
            } else if (this.field3419 == 2) {
                this.method1638(arg0);
            } else if (this.field3419 == 1) {
                this.method1639(arg0);
            }
        }
        return this.field3421 != null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 36)
    private final void method1634() {
        if (this.field3409 != -1) {
            class28.method324(this.field3409, 0, this.field3410);
        }
        this.field3425 = true;
        this.field3409 = -1;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V", line = 44)
    public static void method1635() {
        field3418 = null;
        field3407 = null;
        field3428 = null;
        field3414 = null;
        field3417 = null;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()V", line = 53)
    private static final void method1636() {
        if (field3418 != null) {
            return;
        }
        class25 var0 = new class25(1088);
        class25 var1 = new class25(5140);
        if (class240.field3757) {
            var1.method299(0.0F, -891392056);
            var1.method299(1.0F, -891392056);
            var1.method299(0.0F, -891392056);
            var1.method299(0.5F, -891392056);
            var1.method299(1.0F, -891392056);
            var1.method299(0.0F, -891392056);
            var1.method299(-1.0F, -891392056);
            var1.method299(0.0F, -891392056);
            var1.method299(0.5F, -891392056);
            var1.method299(0.0F, -891392056);
        } else {
            var1.method300((byte) -30, 0.0F);
            var1.method300((byte) -30, 1.0F);
            var1.method300((byte) -30, 0.0F);
            var1.method300((byte) -30, 0.5F);
            var1.method300((byte) -30, 1.0F);
            var1.method300((byte) -30, 0.0F);
            var1.method300((byte) -30, -1.0F);
            var1.method300((byte) -30, 0.0F);
            var1.method300((byte) -30, 0.5F);
            var1.method300((byte) -30, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class107.field1604[var5] / 65535.0F;
            float var7 = (float) class107.field1605[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class107.field1605[var9] / 65535.0F;
                float var11 = (float) class107.field1604[var9] * var6 / 65535.0F;
                float var12 = (float) class107.field1604[var9] * var7 / 65535.0F;
                if (class240.field3757) {
                    var1.method299(var12, -891392056);
                    var1.method299(var10, -891392056);
                    var1.method299(var11, -891392056);
                    var1.method299(var2, -891392056);
                    var1.method299(var3, -891392056);
                } else {
                    var1.method300((byte) -30, var12);
                    var1.method300((byte) -30, var10);
                    var1.method300((byte) -30, var11);
                    var1.method300((byte) -30, var2);
                    var1.method300((byte) -30, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class240.field3757) {
                    var0.method304(false, 0);
                    var0.method304(false, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method304(false, var14++);
                        var0.method304(false, var13++);
                    }
                    var0.method304(false, 1);
                    var0.method304(false, 1);
                } else {
                    var0.method276(0, 128);
                    var0.method276(0, 128);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method276(var14++, 128);
                        var0.method276(var13++, 128);
                    }
                    var0.method276(1, 128);
                    var0.method276(1, 128);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field3418 = ByteBuffer.allocateDirect(var1.field397);
        field3418.put(var1.field448, 0, var1.field397);
        field3418.flip();
        field3407 = ByteBuffer.allocateDirect(var0.field397);
        field3407.put(var0.field448, 0, var0.field397);
        field3407.flip();
    }

    @OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V", line = 204)
    protected final void finalize() throws Throwable {
        this.method1634();
        super.finalize();
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1127)
    public class219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3422 = arg2;
        this.field3423 = arg3;
        this.field3427 = arg4;
        this.field3424 = arg7;
        this.field3426 = arg1;
        this.field3412 = arg6;
        this.field3413 = arg5;
        this.field3419 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIILnb;)V", line = 218)
    public final void method1637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6) {
        int var8 = this.field3406 - arg4 & 0x7FF;
        int var9 = this.field3415 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3420) / 2 + var10;
        int var13 = (arg2 - this.field3420) / 2 + var11;
        if (var12 < arg3 && this.field3420 + var12 > 0 && var13 < arg2 && this.field3420 + var13 > 0 && this.method1633(arg6)) {
            this.field3421.method13(arg0 + var13, arg1 + var12, this.field3420, this.field3420);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lnb;)V", line = 241)
    private final void method1638(class219 arg0) {
        class40 var2 = class40.method415(class229.field3590, this.field3426, 0);
        if (var2 == null) {
            return;
        }
        this.field3421 = new class361(this.field3405, this.field3405);
        class60.method588(field3417);
        this.field3421.method2532();
        class107.method923();
        class60.method611(0, 0, this.field3405, this.field3405, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3424) {
                var3 = -arg0.field3422;
                var4 = -arg0.field3423;
                var5 = -arg0.field3427;
            } else {
                var3 = this.field3422 - arg0.field3422;
                var4 = this.field3423 - arg0.field3423;
                var5 = this.field3427 - arg0.field3427;
            }
        }
        if (this.field3406 != 0) {
            int var6 = class107.field1604[this.field3406];
            int var7 = class107.field1605[this.field3406];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3415 != 0) {
            int var9 = this.field3415 - 1024 & 0x7FF;
            int var10 = class107.field1604[var9];
            int var11 = class107.field1605[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class124 var13 = var2.method393(64, 768, -var3, -var4, -var5);
        int var14 = var13.method502() - var13.method488();
        int var15 = var13.method494() - var13.method21();
        int var16 = var13.method488() + var14 / 2;
        int var17 = var13.method21() + var15 / 2;
        if (var14 > var15) {
            var13.method1080(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3405);
        } else {
            var13.method1080(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3405);
        }
        class42.field665.method2190(1);
        class60.method590(field3417);
        class107.method923();
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Lnb;)V", line = 323)
    private final void method1639(class219 arg0) {
        method1643();
        method1652();
        this.field3421 = new class54(this.field3405, this.field3405);
        class60.method588(field3417);
        this.field3421.method2532();
        class107.method923();
        class60.method611(0, 0, this.field3405, this.field3405, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3424) {
                var2 = -arg0.field3422;
                var3 = -arg0.field3423;
                var4 = -arg0.field3427;
            } else {
                var2 = this.field3422 - arg0.field3422;
                var3 = this.field3423 - arg0.field3423;
                var4 = this.field3427 - arg0.field3427;
            }
        }
        if (this.field3406 != 0) {
            int var5 = class107.field1604[this.field3406];
            int var6 = class107.field1605[this.field3406];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3415 != 0) {
            int var8 = this.field3415 - 1024 & 0x7FF;
            int var9 = class107.field1604[var8];
            int var10 = class107.field1605[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class65.method645(field3428.field615, 0, field3428.field609, (short) class107.field1619.method760(this.field3426, 1));
        class124 var12 = field3428.method393(64, 512, -var2, -var3, -var4);
        int var13 = var12.method502() - var12.method488();
        int var14 = var12.method494() - var12.method21();
        if (var13 > var14) {
            int var15 = this.field3412 == 0 ? (var13 << 9) / this.field3405 : (var13 * 16 << 9) / (this.field3405 * 13);
            var12.method1080(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3412 == 0 ? (var14 << 9) / this.field3405 : (var14 * 16 << 9) / (this.field3405 * 13);
            var12.method1080(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3412 == 0) {
            for (int var17 = 0; var17 < class60.field928.length; var17++) {
                if (class60.field928[var17] != 0) {
                    class60.field928[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1645();
            this.method1650();
        }
        class42.field665.method2190(1);
        class60.method590(field3417);
        class107.method923();
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(Lnb;)V", line = 426)
    private final void method1640(class219 arg0) {
        method1636();
        method1644();
        GL var2 = class240.field3771;
        class213.method1586(field3417);
        class213.method1596();
        var2.glClearColor((float) ((this.field3412 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field3412 & 0xFF00) >> 8) / 255.0F, (float) (this.field3412 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3424) {
                var3 = -arg0.field3422;
                var4 = -arg0.field3423;
                var5 = -arg0.field3427;
            } else {
                var3 = this.field3422 - arg0.field3422;
                var4 = this.field3423 - arg0.field3423;
                var5 = this.field3427 - arg0.field3427;
            }
        }
        class17.method180(-1.0F, 1.0F, -1.0F, 1.0F, this.field3405, this.field3405);
        if (this.field3406 != 0) {
            int var6 = class107.field1604[this.field3406];
            int var7 = class107.field1605[this.field3406];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3415 != 0) {
            int var9 = this.field3415 - 1024 & 0x7FF;
            int var10 = class107.field1604[var9];
            int var11 = class107.field1605[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class103.method893((float) (-var3), (float) (-var4), (float) var5);
        class103.method898(16777215, 0.5F, 0.5F, 1.0F);
        class103.method892();
        if (this.field3412 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class107.field1619.method758(this.field3405, (byte) 122, this.field3426);
        class240.method1801(true);
        if (class240.field3764) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field3418.position(0));
        var2.glVertexPointer(2, 5126, 20, field3418.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field3418.position(12));
        var2.glDrawElements(5, field3407.limit() / 2, 5123, field3407.position(0));
        var2.glEnableClientState(32886);
        class240.method1801(false);
        if (this.field3412 != 0) {
            class211.method1562(0, 0, -36);
            class240.method1814(1);
            class240.method1806(0);
            class240.method1786(field3411);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3412 >> 16), (byte) (this.field3412 >> 8), (byte) this.field3412, (byte) 127);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glTexEnvi(8960, 34200, 770);
            var2.glLoadIdentity();
            var2.glColorMask(true, true, true, true);
            var2.glBlendFunc(773, 772);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3412 >> 16), (byte) (this.field3412 >> 8), (byte) this.field3412, (byte) -1);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glBlendFunc(770, 771);
            var2.glTexEnvi(8960, 34176, 5890);
        }
        class17.method178();
        class240.method1786(this.field3409);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3405, this.field3405, 0);
        class213.method1583(field3417);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)Z", line = 557)
    public final boolean method1641(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3424) {
            this.field3416 = 1073741823;
            var8 = this.field3422;
            var9 = this.field3423;
            var10 = this.field3427;
        } else {
            int var5 = this.field3422 - arg0;
            int var6 = this.field3423 - arg1;
            int var7 = this.field3427 - arg2;
            this.field3416 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3416 == 0) {
                this.field3416 = 1;
            }
            var8 = (var5 << 8) / this.field3416;
            var9 = (var6 << 8) / this.field3416;
            var10 = (var7 << 8) / this.field3416;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3420 = this.field3413 * arg3 / (this.field3424 ? 1024 : this.field3416);
        } else {
            this.field3420 = 0;
        }
        if (this.field3420 < 8) {
            this.method1634();
            this.field3421 = null;
            return false;
        }
        int var12 = class337.method2370((byte) 84, this.field3420);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3405 != var12) {
            this.field3405 = var12;
        }
        this.field3406 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3415 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3425 = true;
        this.field3421 = null;
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIIIIIIIIII)V", line = 615)
    private final void method1642(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3414[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()V", line = 648)
    private static final void method1643() {
        if (field3428 != null) {
            return;
        }
        class40 var0 = field3428 = new class40(260, 480, 0);
        int[] var1 = var0.field605;
        int[] var2 = var0.field637;
        int[] var3 = var0.field619;
        int[] var4 = var0.field648;
        int[] var5 = var0.field633;
        int[] var6 = var0.field625;
        var0.field600 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class107.field1604[var8] >> 1;
            int var10 = class107.field1605[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class107.field1605[var12] >> 9;
                int var14 = (class107.field1604[var12] >> 1) * var9 >> 23;
                int var15 = (class107.field1604[var12] >> 1) * var10 >> 23;
                var1[var0.field600] = var15;
                var2[var0.field600] = var13;
                var3[var0.field600] = -var14;
                var0.field600++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field609] = 0;
                var5[var0.field609] = var17;
                var6[var0.field609] = var16;
                var0.field609++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field609] = var17;
                    var5[var0.field609] = var19;
                    var6[var0.field609] = var16;
                    var0.field609++;
                    var4[var0.field609] = var19;
                    var5[var0.field609] = var20;
                    var6[var0.field609] = var16;
                    var0.field609++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field609] = var16;
                var5[var0.field609] = var17;
                var6[var0.field609] = 1;
                var0.field609++;
            }
        }
        var0.field650 = var0.field600;
        var0.field598 = null;
        var0.field642 = null;
        var0.field611 = null;
        var0.field643 = null;
        var0.field628 = null;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "()V", line = 759)
    private static final void method1644() {
        method1652();
        if (field3411 == -1 || class28.field455 != field3408) {
            field3411 = class183.method1411(class183.field2878, 128, 128, field3414);
            field3408 = class28.field455;
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "()V", line = 769)
    private final void method1645() {
        int var1 = this.field3405 * 3 / 32;
        int var3 = this.field3405 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class60.field933 * var1 + var1;
        int var8 = class60.field933 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class60.field931) {
            var4 = var3 - (var1 + var3 - class60.field931);
        }
        if (var1 < class60.field934) {
            int var11 = class60.field934 - var1;
            var4 -= var11;
            var7 += class60.field933 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class60.field935) {
            int var12 = var1 + var3 - class60.field935;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class60.field936) {
            int var13 = class60.field936 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1646(class60.field928, 0, this.field3412, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 822)
    private final void method1646(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3414[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "()V", line = 862)
    public static final void method1647() {
        if (field3411 != -1) {
            class28.method324(field3411, 0, field3408);
        }
        field3411 = -1;
        field3408 = -1;
        field3418 = null;
        field3407 = null;
        field3428 = null;
        field3414 = null;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(Lnb;)Z", line = 886)
    private final boolean method1648(class219 arg0) {
        class40 var2 = class40.method415(class229.field3590, this.field3426, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class240.field3771;
        class213.method1586(field3417);
        class213.method1596();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field3424) {
                var4 = -arg0.field3422;
                var5 = -arg0.field3423;
                var6 = -arg0.field3427;
            } else {
                var4 = this.field3422 - arg0.field3422;
                var5 = this.field3423 - arg0.field3423;
                var6 = this.field3427 - arg0.field3427;
            }
        }
        var2.method418();
        class52 var7 = var2.method410(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method502() - var7.method488()) / 2;
        int var9 = (var7.method494() - var7.method21()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class17.method182((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field3405, this.field3405);
        if (this.field3406 != 0) {
            int var11 = class107.field1604[this.field3406];
            int var12 = class107.field1605[this.field3406];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field3415 != 0) {
            int var14 = this.field3415 - 1024 & 0x7FF;
            int var15 = class107.field1604[var14];
            int var16 = class107.field1605[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class103.method893((float) (-var4), (float) var5, (float) (-var6));
        class103.method898(16777215, 0.5F, 0.5F, 0.5F);
        class103.method892();
        class240.method1803();
        class240.method1807(true);
        class240.method1801(true);
        var7.method490(0, 0, 0, 0, -var8 - var7.method488(), -var9 - var7.method21(), 0, -1L);
        class240.method1801(false);
        class240.method1807(false);
        class240.method1791();
        class17.method178();
        class240.method1786(this.field3409);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3405, this.field3405, 0);
        class213.method1583(field3417);
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(Lnb;)V", line = 981)
    public final void method1649(class219 arg0) {
        if (this.field3419 == 0) {
            return;
        }
        boolean var2 = this.field3409 == -1 || class28.field455 != this.field3410;
        if (!this.field3425 && !var2) {
            return;
        }
        if (var2) {
            this.field3410 = class28.field455;
            this.field3409 = class183.method1419(class183.field2872, this.field3405, this.field3405);
        } else {
            class240.method1786(this.field3409);
            class183.method1418(class183.field2872, this.field3405, this.field3405);
        }
        if (this.field3419 == 1) {
            this.method1640(arg0);
            this.field3425 = false;
        } else if (this.field3419 == 2) {
            this.field3425 = !this.method1648(arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "()V", line = 1026)
    private final void method1650() {
        int var1 = this.field3405;
        int var2 = this.field3405;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class60.field933 - var1;
        if (var2 > class60.field931) {
            var2 -= var2 - class60.field931;
        }
        if (class60.field934 > 0) {
            int var9 = class60.field934;
            var2 -= var9;
            var7 += class60.field933 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class60.field935) {
            int var10 = var1 - class60.field935;
            var1 -= var10;
            var8 += var10;
        }
        if (class60.field936 > 0) {
            int var11 = class60.field936;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1642(class60.field928, this.field3412, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V", line = 1079)
    public final void method1651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field3406 - arg4 & 0x7FF;
        int var8 = this.field3415 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field3420) / 2 + var9;
        int var12 = (arg2 - this.field3420) / 2 + var10;
        if (var11 >= arg3 || this.field3420 + var11 <= 0 || var12 >= arg2 || this.field3420 + var12 <= 0) {
            return;
        }
        if (this.field3419 == 0) {
            class107.field1619.method758(this.field3405, (byte) 122, this.field3426);
        } else if (this.field3409 == -1) {
            return;
        } else {
            class240.method1786(this.field3409);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field3420 + var14;
        int var16 = this.field3420 + var13;
        GL var17 = class240.field3771;
        var17.glBegin(7);
        var17.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var17.glTexCoord2f(0.0F, 0.0F);
        var17.glVertex2i(var14, var13);
        var17.glTexCoord2f(0.0F, 1.0F);
        var17.glVertex2i(var14, var16);
        var17.glTexCoord2f(1.0F, 1.0F);
        var17.glVertex2i(var15, var16);
        var17.glTexCoord2f(1.0F, 0.0F);
        var17.glVertex2i(var15, var13);
        var17.glEnd();
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "()V", line = 1138)
    private static final void method1652() {
        if (field3414 != null) {
            return;
        }
        field3414 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field3414[var4 + var6] = field3414[var4 + var9] = field3414[var5 + var6] = field3414[var5 + var9] = (byte) var11;
            }
        }
    }
}
