import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class337 extends class320 {

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field5373 = 0;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    private int field5393 = 0;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public int field5390 = 0;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    private int field5379 = 0;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public int field5383 = 0;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    private int field5401 = 0;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "F")
    private float field5387;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "Z")
    public boolean field5399;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Z")
    private boolean field5392;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "Lme;")
    private class206 field5386;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "Lpi;")
    private static class336 field5385;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "Lpi;")
    private static class336 field5404;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Ltm;")
    private class79 field5380;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5397;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5402;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5403;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "[F")
    private float[] field5384;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "[F")
    private float[] field5391;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "[F")
    private float[] field5394;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "[F")
    private float[] field5398;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "[I")
    private int[] field5374;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "[I")
    private int[] field5375;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "[I")
    private int[] field5376;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "[I")
    private int[] field5378;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "[I")
    private int[] field5382;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "[I")
    private int[] field5388;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "[I")
    private int[] field5395;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[Z")
    private boolean[] field5381;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "[[I")
    private int[][] field5396;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "[[I")
    private int[][] field5400;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 8)
    public static final void method2377() {
        field5385 = null;
        field5404 = null;
        field5402 = null;
        field5403 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()V", line = 15)
    public final void method2378() {
        class336 var1 = new class336((this.field5392 ? 40 : 36) * this.field5390);
        for (int var2 = 0; var2 < this.field5390; var2++) {
            if (class43.field639) {
                var1.method2353((float) this.field5375[var2], (byte) 67);
                var1.method2353((float) this.field5378[var2], (byte) 53);
                var1.method2353((float) this.field5395[var2], (byte) 72);
                var1.method2320(-6128, this.field5382[var2]);
                var1.method2353(this.field5391[var2], (byte) 71);
                var1.method2353(this.field5398[var2], (byte) 85);
                var1.method2353(this.field5394[var2], (byte) 28);
                var1.method2353((float) this.field5375[var2] / this.field5387, (byte) 54);
                var1.method2353((float) this.field5395[var2] / this.field5387, (byte) 111);
                if (this.field5392) {
                    var1.method2353(this.field5384[var2], (byte) 46);
                }
            } else {
                var1.method2341((float) this.field5375[var2], 21536);
                var1.method2341((float) this.field5378[var2], 21536);
                var1.method2341((float) this.field5395[var2], 21536);
                var1.method2320(-6128, this.field5382[var2]);
                var1.method2341(this.field5391[var2], 21536);
                var1.method2341(this.field5398[var2], 21536);
                var1.method2341(this.field5394[var2], 21536);
                var1.method2341((float) this.field5375[var2] / this.field5387, 21536);
                var1.method2341((float) this.field5395[var2] / this.field5387, 21536);
                if (this.field5392) {
                    var1.method2341(this.field5384[var2], 21536);
                }
            }
        }
        if (class43.field674) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field5342, 0, var1.field5353);
            this.field5386 = new class206();
            this.field5386.method1538(var3);
        } else {
            this.field5397 = ByteBuffer.allocateDirect(var1.field5353).order(ByteOrder.nativeOrder());
            this.field5397.put(var1.field5342, 0, var1.field5353);
            this.field5397.flip();
        }
        this.field5375 = null;
        this.field5378 = null;
        this.field5395 = null;
        this.field5382 = null;
        this.field5391 = null;
        this.field5398 = null;
        this.field5394 = null;
        this.field5380 = null;
        this.field5384 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class337(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field5389 = arg0;
        this.field5387 = arg1;
        this.field5399 = arg2;
        this.field5392 = arg3;
        this.field5377 = arg4;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIFFFIF)I", line = 88)
    public final int method2379(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class142 var11 = (class142) this.field5380.method732(var9, true);
            if (var11 != null) {
                if (arg1 < this.field5378[var11.field2601]) {
                    this.field5378[var11.field2601] = arg1;
                }
                return var11.field2601;
            }
        }
        this.field5375[this.field5390] = arg0;
        this.field5378[this.field5390] = arg1;
        this.field5395[this.field5390] = arg2;
        if (this.field5392) {
            this.field5384[this.field5390] = arg7;
        }
        this.field5391[this.field5390] = arg3;
        this.field5398[this.field5390] = arg4;
        this.field5394[this.field5390] = arg5;
        this.field5382[this.field5390] = arg6;
        if (var9 != 0L) {
            this.field5380.method725(var9, new class142(this.field5390), 1);
        }
        return this.field5390++;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()V", line = 128)
    public final void method2380() {
        this.field5375 = new int[this.field5383];
        this.field5378 = new int[this.field5383];
        this.field5395 = new int[this.field5383];
        if (this.field5392) {
            this.field5384 = new float[this.field5383];
        }
        this.field5382 = new int[this.field5383];
        this.field5391 = new float[this.field5383];
        this.field5398 = new float[this.field5383];
        this.field5394 = new float[this.field5383];
        this.field5388 = new int[this.field5373];
        this.field5376 = new int[this.field5373];
        this.field5374 = new int[this.field5373];
        this.field5396 = new int[this.field5373][];
        this.field5380 = new class79(class168.method1318(this.field5383, false));
        if (this.field5399) {
            this.field5400 = new int[this.field5373][];
            this.field5381 = new boolean[this.field5373];
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[I[IZ)I", line = 152)
    public final int method2381(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field5399) {
            this.field5400[this.field5393] = arg4;
            this.field5381[this.field5393] = arg5;
            if (arg4 != null) {
                this.field5401 += arg4.length;
            }
            if (arg5) {
                this.field5401 += (arg3.length - 2) * 3;
            } else {
                this.field5379 += (arg3.length - 2) * 3;
            }
        } else {
            this.field5379 += (arg3.length - 2) * 3;
        }
        this.field5374[this.field5393] = arg0;
        this.field5388[this.field5393] = arg1;
        this.field5376[this.field5393] = arg2;
        this.field5396[this.field5393] = arg3;
        return this.field5393++;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()V", line = 196)
    public static void method2382() {
        field5385 = null;
        field5404 = null;
        field5402 = null;
        field5403 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([[[Lk;FZ)V", line = 208)
    public final void method2383(class257[][][] arg0, float arg1, boolean arg2) {
        if (field5385 == null || field5385.field5342.length < this.field5379 * 4) {
            field5385 = new class336(this.field5379 * 4);
        } else {
            field5385.field5353 = 0;
        }
        if (field5404 == null || field5404.field5342.length < this.field5401 * 4) {
            field5404 = new class336(this.field5401 * 4);
        } else {
            field5404.field5353 = 0;
        }
        if (class43.field639) {
            for (int var4 = 0; var4 < this.field5393; var4++) {
                class257 var5 = arg0[this.field5374[var4]][this.field5388[var4]][this.field5376[var4]];
                if (var5 != null && var5.field4143) {
                    int[] var6 = this.field5396[var4];
                    class336 var9;
                    if (this.field5399) {
                        int[] var7 = this.field5400[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field5404.method2320(-6128, var7[var8]);
                            }
                        }
                        var9 = this.field5381[var4] ? field5404 : field5385;
                    } else {
                        var9 = field5385;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method2320(-6128, var6[0]);
                        var9.method2320(-6128, var6[var10]);
                        var9.method2320(-6128, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field5393; var11++) {
                class257 var12 = arg0[this.field5374[var11]][this.field5388[var11]][this.field5376[var11]];
                if (var12 != null && var12.field4143) {
                    int[] var13 = this.field5396[var11];
                    class336 var16;
                    if (this.field5399) {
                        int[] var14 = this.field5400[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field5404.method2357(var14[var15], (byte) -72);
                            }
                        }
                        var16 = this.field5381[var11] ? field5404 : field5385;
                    } else {
                        var16 = field5385;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method2357(var13[0], (byte) -72);
                        var16.method2357(var13[var17], (byte) -72);
                        var16.method2357(var13[var17 + 1], (byte) -72);
                    }
                }
            }
        }
        if (field5385.field5353 == 0 && field5404.field5353 == 0) {
            return;
        }
        GL var18 = class43.field651;
        if (this.field5389 == -1 || arg2) {
            class43.method390(-1);
            class83.method749(0, 0, 98);
        } else {
            class62.field953.method1210(this.field5389, 4880);
        }
        int var19 = this.field5392 ? 40 : 36;
        if (this.field5386 == null) {
            if (class43.field674) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field5397.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field5397);
            this.field5397.position(12);
            var18.glColorPointer(4, 5121, var19, this.field5397);
            if (class64.field1001) {
                this.field5397.position(16);
                var18.glNormalPointer(5126, var19, this.field5397);
            }
            this.field5397.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field5397);
            if (this.field5392) {
                var18.glClientActiveTexture(class275.method1883());
                this.field5397.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field5397);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field5386.method1539();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class64.field1001) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field5392) {
                var18.glClientActiveTexture(class275.method1883());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class43.field674) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field5385.field5353 != 0) {
            if (field5402 == null || field5402.capacity() < field5385.field5353) {
                field5402 = ByteBuffer.allocateDirect(field5385.field5353).order(ByteOrder.nativeOrder());
            } else {
                field5402.clear();
            }
            field5402.put(field5385.field5342, 0, field5385.field5353);
            field5402.flip();
            class43.method359(arg1);
            var18.glDrawElements(4, field5385.field5353 / 4, 5125, field5402);
        }
        if (field5404.field5353 == 0) {
            return;
        }
        if (field5403 == null || field5403.capacity() < field5404.field5353) {
            field5403 = ByteBuffer.allocateDirect(field5404.field5353).order(ByteOrder.nativeOrder());
        } else {
            field5403.clear();
        }
        field5403.put(field5404.field5342, 0, field5404.field5353);
        field5403.flip();
        class43.method359(arg1 - 100.0F);
        class43.method354();
        var18.glDrawElements(4, field5404.field5353 / 4, 5125, field5403);
        class43.method376();
    }
}
