import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class206 extends class165 {

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public int field3384 = 0;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public int field3391 = 0;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public int field3390 = 0;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    private int field3401 = 0;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    private int field3386 = 0;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    private int field3407 = 0;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "F")
    private float field3404;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "Z")
    public boolean field3405;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Z")
    private boolean field3397;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lfd;")
    private class306 field3403;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Ljj;")
    private static class44 field3388;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Ljj;")
    private static class44 field3398;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lcd;")
    private class69 field3393;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3381;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3389;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3399;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "[F")
    private float[] field3378;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "[F")
    private float[] field3380;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "[F")
    private float[] field3394;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "[F")
    private float[] field3402;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[I")
    private int[] field3376;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[I")
    private int[] field3377;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "[I")
    private int[] field3382;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
    private int[] field3385;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "[I")
    private int[] field3387;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "[I")
    private int[] field3395;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "[I")
    private int[] field3400;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "[Z")
    private boolean[] field3383;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "[[I")
    private int[][] field3396;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "[[I")
    private int[][] field3406;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V", line = 15)
    public static void method1494() {
        field3398 = null;
        field3388 = null;
        field3381 = null;
        field3389 = null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()V", line = 26)
    public static final void method1495() {
        field3398 = null;
        field3388 = null;
        field3381 = null;
        field3389 = null;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()V", line = 34)
    public final void method1496() {
        this.field3385 = new int[this.field3391];
        this.field3395 = new int[this.field3391];
        this.field3377 = new int[this.field3391];
        if (this.field3397) {
            this.field3402 = new float[this.field3391];
        }
        this.field3400 = new int[this.field3391];
        this.field3394 = new float[this.field3391];
        this.field3378 = new float[this.field3391];
        this.field3380 = new float[this.field3391];
        this.field3382 = new int[this.field3390];
        this.field3376 = new int[this.field3390];
        this.field3387 = new int[this.field3390];
        this.field3406 = new int[this.field3390][];
        this.field3393 = new class69(class120.method843(-81, this.field3391));
        if (this.field3405) {
            this.field3396 = new int[this.field3390][];
            this.field3383 = new boolean[this.field3390];
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class206(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3379 = arg0;
        this.field3404 = arg1;
        this.field3405 = arg2;
        this.field3397 = arg3;
        this.field3392 = arg4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[I[IZ)I", line = 66)
    public final int method1497(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3405) {
            this.field3396[this.field3401] = arg4;
            this.field3383[this.field3401] = arg5;
            if (arg4 != null) {
                this.field3407 += arg4.length;
            }
            if (arg5) {
                this.field3407 += (arg3.length - 2) * 3;
            } else {
                this.field3386 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3386 += (arg3.length - 2) * 3;
        }
        this.field3387[this.field3401] = arg0;
        this.field3382[this.field3401] = arg1;
        this.field3376[this.field3401] = arg2;
        this.field3406[this.field3401] = arg3;
        return this.field3401++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIFFFIF)I", line = 98)
    public final int method1498(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class174 var11 = (class174) this.field3393.method451(var9, (byte) 100);
            if (var11 != null) {
                if (arg1 < this.field3395[var11.field2881]) {
                    this.field3395[var11.field2881] = arg1;
                }
                return var11.field2881;
            }
        }
        this.field3385[this.field3384] = arg0;
        this.field3395[this.field3384] = arg1;
        this.field3377[this.field3384] = arg2;
        if (this.field3397) {
            this.field3402[this.field3384] = arg7;
        }
        this.field3394[this.field3384] = arg3;
        this.field3378[this.field3384] = arg4;
        this.field3380[this.field3384] = arg5;
        this.field3400[this.field3384] = arg6;
        if (var9 != 0L) {
            this.field3393.method461(-10, var9, new class174(this.field3384));
        }
        return this.field3384++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([[[Lkb;FZ)V", line = 133)
    public final void method1499(class204[][][] arg0, float arg1, boolean arg2) {
        if (field3398 == null || field3398.field573.length < this.field3386 * 4) {
            field3398 = new class44(this.field3386 * 4);
        } else {
            field3398.field586 = 0;
        }
        if (field3388 == null || field3388.field573.length < this.field3407 * 4) {
            field3388 = new class44(this.field3407 * 4);
        } else {
            field3388.field586 = 0;
        }
        if (class232.field3718) {
            for (int var4 = 0; var4 < this.field3401; var4++) {
                class204 var5 = arg0[this.field3387[var4]][this.field3382[var4]][this.field3376[var4]];
                if (var5 != null && var5.field3352) {
                    int[] var6 = this.field3406[var4];
                    class44 var9;
                    if (this.field3405) {
                        int[] var7 = this.field3396[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3388.method283((byte) -51, var7[var8]);
                            }
                        }
                        var9 = this.field3383[var4] ? field3388 : field3398;
                    } else {
                        var9 = field3398;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method283((byte) -51, var6[0]);
                        var9.method283((byte) -51, var6[var10]);
                        var9.method283((byte) -51, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3401; var11++) {
                class204 var12 = arg0[this.field3387[var11]][this.field3382[var11]][this.field3376[var11]];
                if (var12 != null && var12.field3352) {
                    int[] var13 = this.field3406[var11];
                    class44 var16;
                    if (this.field3405) {
                        int[] var14 = this.field3396[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3388.method258(var14[var15], (byte) 40);
                            }
                        }
                        var16 = this.field3383[var11] ? field3388 : field3398;
                    } else {
                        var16 = field3398;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method258(var13[0], (byte) 40);
                        var16.method258(var13[var17], (byte) 40);
                        var16.method258(var13[var17 + 1], (byte) 40);
                    }
                }
            }
        }
        if (field3398.field586 == 0 && field3388.field586 == 0) {
            return;
        }
        GL var18 = class232.field3716;
        if (this.field3379 == -1 || arg2) {
            class232.method1662(-1);
            class179.method1343(0, 0, -3);
        } else {
            class170.field2814.method955(this.field3379, (byte) -72);
        }
        int var19 = this.field3397 ? 40 : 36;
        if (this.field3403 == null) {
            if (class232.field3700) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3399.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3399);
            this.field3399.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3399);
            if (class322.field4994) {
                this.field3399.position(16);
                var18.glNormalPointer(5126, var19, this.field3399);
            }
            this.field3399.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3399);
            if (this.field3397) {
                var18.glClientActiveTexture(class12.method68());
                this.field3399.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3399);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3403.method2177();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class322.field4994) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3397) {
                var18.glClientActiveTexture(class12.method68());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class232.field3700) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3398.field586 != 0) {
            if (field3381 == null || field3381.capacity() < field3398.field586) {
                field3381 = ByteBuffer.allocateDirect(field3398.field586).order(ByteOrder.nativeOrder());
            } else {
                field3381.clear();
            }
            field3381.put(field3398.field573, 0, field3398.field586);
            field3381.flip();
            class232.method1682(arg1);
            var18.glDrawElements(4, field3398.field586 / 4, 5125, field3381);
        }
        if (field3388.field586 == 0) {
            return;
        }
        if (field3389 == null || field3389.capacity() < field3388.field586) {
            field3389 = ByteBuffer.allocateDirect(field3388.field586).order(ByteOrder.nativeOrder());
        } else {
            field3389.clear();
        }
        field3389.put(field3388.field573, 0, field3388.field586);
        field3389.flip();
        class232.method1682(arg1 - 100.0F);
        class232.method1673();
        var18.glDrawElements(4, field3388.field586 / 4, 5125, field3389);
        class232.method1681();
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()V", line = 344)
    public final void method1500() {
        class44 var1 = new class44((this.field3397 ? 40 : 36) * this.field3384);
        for (int var2 = 0; var2 < this.field3384; var2++) {
            if (class232.field3718) {
                var1.method230(-123, (float) this.field3385[var2]);
                var1.method230(-123, (float) this.field3395[var2]);
                var1.method230(-120, (float) this.field3377[var2]);
                var1.method283((byte) -51, this.field3400[var2]);
                var1.method230(-122, this.field3394[var2]);
                var1.method230(-126, this.field3378[var2]);
                var1.method230(-126, this.field3380[var2]);
                var1.method230(-125, (float) this.field3385[var2] / this.field3404);
                var1.method230(-128, (float) this.field3377[var2] / this.field3404);
                if (this.field3397) {
                    var1.method230(-124, this.field3402[var2]);
                }
            } else {
                var1.method252(7284, (float) this.field3385[var2]);
                var1.method252(7284, (float) this.field3395[var2]);
                var1.method252(7284, (float) this.field3377[var2]);
                var1.method283((byte) -51, this.field3400[var2]);
                var1.method252(7284, this.field3394[var2]);
                var1.method252(7284, this.field3378[var2]);
                var1.method252(7284, this.field3380[var2]);
                var1.method252(7284, (float) this.field3385[var2] / this.field3404);
                var1.method252(7284, (float) this.field3377[var2] / this.field3404);
                if (this.field3397) {
                    var1.method252(7284, this.field3402[var2]);
                }
            }
        }
        if (class232.field3700) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field573, 0, var1.field586);
            this.field3403 = new class306();
            this.field3403.method2175(var3);
        } else {
            this.field3399 = ByteBuffer.allocateDirect(var1.field586).order(ByteOrder.nativeOrder());
            this.field3399.put(var1.field573, 0, var1.field586);
            this.field3399.flip();
        }
        this.field3385 = null;
        this.field3395 = null;
        this.field3377 = null;
        this.field3400 = null;
        this.field3394 = null;
        this.field3378 = null;
        this.field3380 = null;
        this.field3393 = null;
        this.field3402 = null;
    }
}
