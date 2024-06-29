import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class224 extends class117 {

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    private int field3362 = 0;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    private int field3370 = 0;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public int field3365 = 0;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    private int field3364 = 0;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public int field3363 = 0;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public int field3380 = 0;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "F")
    private float field3356;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Z")
    public boolean field3360;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "Z")
    private boolean field3376;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lch;")
    private class115 field3354;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "Lsb;")
    private static class190 field3368;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Lsb;")
    private static class190 field3372;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Ls;")
    private class196 field3382;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3355;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3359;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3367;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "[F")
    private float[] field3366;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "[F")
    private float[] field3371;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "[F")
    private float[] field3381;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "[F")
    private float[] field3383;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "[I")
    private int[] field3357;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "[I")
    private int[] field3361;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "[I")
    private int[] field3369;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "[I")
    private int[] field3374;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "[I")
    private int[] field3377;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "[I")
    private int[] field3378;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "[I")
    private int[] field3379;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "[Z")
    private boolean[] field3384;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "[[I")
    private int[][] field3358;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "[[I")
    private int[][] field3373;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([[[Lmc;FZ)V", line = 7)
    public final void method1639(class167[][][] arg0, float arg1, boolean arg2) {
        if (field3368 == null || field3368.field2718.length < this.field3370 * 4) {
            field3368 = new class190(this.field3370 * 4);
        } else {
            field3368.field2776 = 0;
        }
        if (field3372 == null || field3372.field2718.length < this.field3364 * 4) {
            field3372 = new class190(this.field3364 * 4);
        } else {
            field3372.field2776 = 0;
        }
        if (class141.field2056) {
            for (int var4 = 0; var4 < this.field3362; var4++) {
                class167 var5 = arg0[this.field3377[var4]][this.field3374[var4]][this.field3379[var4]];
                if (var5 != null && var5.field2396) {
                    int[] var6 = this.field3358[var4];
                    class190 var9;
                    if (this.field3360) {
                        int[] var7 = this.field3373[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3372.method1354(var7[var8], (byte) 121);
                            }
                        }
                        var9 = this.field3384[var4] ? field3372 : field3368;
                    } else {
                        var9 = field3368;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1354(var6[0], (byte) -11);
                        var9.method1354(var6[var10], (byte) -69);
                        var9.method1354(var6[var10 + 1], (byte) 109);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3362; var11++) {
                class167 var12 = arg0[this.field3377[var11]][this.field3374[var11]][this.field3379[var11]];
                if (var12 != null && var12.field2396) {
                    int[] var13 = this.field3358[var11];
                    class190 var16;
                    if (this.field3360) {
                        int[] var14 = this.field3373[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3372.method1335(var14[var15], 840118768);
                            }
                        }
                        var16 = this.field3384[var11] ? field3372 : field3368;
                    } else {
                        var16 = field3368;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1335(var13[0], 840118768);
                        var16.method1335(var13[var17], 840118768);
                        var16.method1335(var13[var17 + 1], 840118768);
                    }
                }
            }
        }
        if (field3368.field2776 == 0 && field3372.field2776 == 0) {
            return;
        }
        GL var18 = class141.field2025;
        if (this.field3353 == -1 || arg2) {
            class141.method1000(-1);
            class2.method9(0, 10691, 0);
        } else {
            class345.field5336.method583(this.field3353, 64);
        }
        int var19 = this.field3376 ? 40 : 36;
        if (this.field3354 == null) {
            if (class141.field2032) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3355.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3355);
            this.field3355.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3355);
            if (class98.field1379) {
                this.field3355.position(16);
                var18.glNormalPointer(5126, var19, this.field3355);
            }
            this.field3355.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3355);
            if (this.field3376) {
                var18.glClientActiveTexture(class39.method285());
                this.field3355.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3355);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3354.method861();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class98.field1379) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3376) {
                var18.glClientActiveTexture(class39.method285());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class141.field2032) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3368.field2776 != 0) {
            if (field3359 == null || field3359.capacity() < field3368.field2776) {
                field3359 = ByteBuffer.allocateDirect(field3368.field2776).order(ByteOrder.nativeOrder());
            } else {
                field3359.clear();
            }
            field3359.put(field3368.field2718, 0, field3368.field2776);
            field3359.flip();
            class141.method989(arg1);
            var18.glDrawElements(4, field3368.field2776 / 4, 5125, field3359);
        }
        if (field3372.field2776 == 0) {
            return;
        }
        if (field3367 == null || field3367.capacity() < field3372.field2776) {
            field3367 = ByteBuffer.allocateDirect(field3372.field2776).order(ByteOrder.nativeOrder());
        } else {
            field3367.clear();
        }
        field3367.put(field3372.field2718, 0, field3372.field2776);
        field3367.flip();
        class141.method989(arg1 - 100.0F);
        class141.method1020();
        var18.glDrawElements(4, field3372.field2776 / 4, 5125, field3367);
        class141.method1023();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 223)
    public static void method1640() {
        field3368 = null;
        field3372 = null;
        field3359 = null;
        field3367 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class224(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3353 = arg0;
        this.field3356 = arg1;
        this.field3360 = arg2;
        this.field3376 = arg3;
        this.field3375 = arg4;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III[I[IZ)I", line = 235)
    public final int method1641(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3360) {
            this.field3373[this.field3362] = arg4;
            this.field3384[this.field3362] = arg5;
            if (arg4 != null) {
                this.field3364 += arg4.length;
            }
            if (arg5) {
                this.field3364 += (arg3.length - 2) * 3;
            } else {
                this.field3370 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3370 += (arg3.length - 2) * 3;
        }
        this.field3377[this.field3362] = arg0;
        this.field3374[this.field3362] = arg1;
        this.field3379[this.field3362] = arg2;
        this.field3358[this.field3362] = arg3;
        return this.field3362++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V", line = 260)
    public final void method1642() {
        class190 var1 = new class190((this.field3376 ? 40 : 36) * this.field3365);
        for (int var2 = 0; var2 < this.field3365; var2++) {
            if (class141.field2056) {
                var1.method1328((byte) 82, (float) this.field3369[var2]);
                var1.method1328((byte) 126, (float) this.field3378[var2]);
                var1.method1328((byte) 64, (float) this.field3357[var2]);
                var1.method1354(this.field3361[var2], (byte) -7);
                var1.method1328((byte) 68, this.field3381[var2]);
                var1.method1328((byte) 108, this.field3371[var2]);
                var1.method1328((byte) 55, this.field3366[var2]);
                var1.method1328((byte) 89, (float) this.field3369[var2] / this.field3356);
                var1.method1328((byte) 111, (float) this.field3357[var2] / this.field3356);
                if (this.field3376) {
                    var1.method1328((byte) 94, this.field3383[var2]);
                }
            } else {
                var1.method1318((float) this.field3369[var2], (byte) -39);
                var1.method1318((float) this.field3378[var2], (byte) -39);
                var1.method1318((float) this.field3357[var2], (byte) -39);
                var1.method1354(this.field3361[var2], (byte) -96);
                var1.method1318(this.field3381[var2], (byte) -39);
                var1.method1318(this.field3371[var2], (byte) -39);
                var1.method1318(this.field3366[var2], (byte) -39);
                var1.method1318((float) this.field3369[var2] / this.field3356, (byte) -39);
                var1.method1318((float) this.field3357[var2] / this.field3356, (byte) -39);
                if (this.field3376) {
                    var1.method1318(this.field3383[var2], (byte) -39);
                }
            }
        }
        if (class141.field2032) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2718, 0, var1.field2776);
            this.field3354 = new class115();
            this.field3354.method864(var3);
        } else {
            this.field3355 = ByteBuffer.allocateDirect(var1.field2776).order(ByteOrder.nativeOrder());
            this.field3355.put(var1.field2718, 0, var1.field2776);
            this.field3355.flip();
        }
        this.field3369 = null;
        this.field3378 = null;
        this.field3357 = null;
        this.field3361 = null;
        this.field3381 = null;
        this.field3371 = null;
        this.field3366 = null;
        this.field3382 = null;
        this.field3383 = null;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()V", line = 327)
    public static final void method1643() {
        field3368 = null;
        field3372 = null;
        field3359 = null;
        field3367 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIFFFIF)I", line = 356)
    public final int method1644(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class35 var11 = (class35) this.field3382.method1405(var9, false);
            if (var11 != null) {
                if (arg1 < this.field3378[var11.field515]) {
                    this.field3378[var11.field515] = arg1;
                }
                return var11.field515;
            }
        }
        this.field3369[this.field3365] = arg0;
        this.field3378[this.field3365] = arg1;
        this.field3357[this.field3365] = arg2;
        if (this.field3376) {
            this.field3383[this.field3365] = arg7;
        }
        this.field3381[this.field3365] = arg3;
        this.field3371[this.field3365] = arg4;
        this.field3366[this.field3365] = arg5;
        this.field3361[this.field3365] = arg6;
        if (var9 != 0L) {
            this.field3382.method1400(var9, 112, new class35(this.field3365));
        }
        return this.field3365++;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "()V", line = 395)
    public final void method1645() {
        this.field3369 = new int[this.field3380];
        this.field3378 = new int[this.field3380];
        this.field3357 = new int[this.field3380];
        if (this.field3376) {
            this.field3383 = new float[this.field3380];
        }
        this.field3361 = new int[this.field3380];
        this.field3381 = new float[this.field3380];
        this.field3371 = new float[this.field3380];
        this.field3366 = new float[this.field3380];
        this.field3374 = new int[this.field3363];
        this.field3379 = new int[this.field3363];
        this.field3377 = new int[this.field3363];
        this.field3358 = new int[this.field3363][];
        this.field3382 = new class196(class344.method2409(this.field3380, -24724));
        if (this.field3360) {
            this.field3373 = new int[this.field3363][];
            this.field3384 = new boolean[this.field3363];
        }
    }
}
