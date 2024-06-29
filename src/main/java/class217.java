import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class217 extends class187 {

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    private int field3414 = 0;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public int field3427 = 0;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public int field3419 = 0;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    private int field3434 = 0;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public int field3418 = 0;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    private int field3443 = 0;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "F")
    private float field3422;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Z")
    public boolean field3428;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Z")
    private boolean field3430;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lpc;")
    private class216 field3433;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Ljf;")
    private class227 field3431;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "Lgn;")
    private static class303 field3437;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Lgn;")
    private static class303 field3440;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3417;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3423;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3425;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[F")
    private float[] field3413;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "[F")
    private float[] field3429;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "[F")
    private float[] field3435;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "[F")
    private float[] field3441;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
    private int[] field3420;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[I")
    private int[] field3421;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[I")
    private int[] field3426;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "[I")
    private int[] field3432;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "[I")
    private int[] field3436;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[I")
    private int[] field3438;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "[I")
    private int[] field3444;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[Z")
    private boolean[] field3424;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "[[I")
    private int[][] field3439;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "[[I")
    private int[][] field3442;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 10)
    public static final void method1447() {
        field3437 = null;
        field3440 = null;
        field3417 = null;
        field3423 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I[IZ)I", line = 19)
    public final int method1448(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3428) {
            this.field3439[this.field3434] = arg4;
            this.field3424[this.field3434] = arg5;
            if (arg4 != null) {
                this.field3443 += arg4.length;
            }
            if (arg5) {
                this.field3443 += (arg3.length - 2) * 3;
            } else {
                this.field3414 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3414 += (arg3.length - 2) * 3;
        }
        this.field3438[this.field3434] = arg0;
        this.field3432[this.field3434] = arg1;
        this.field3426[this.field3434] = arg2;
        this.field3442[this.field3434] = arg3;
        return this.field3434++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 54)
    public final void method1449() {
        class303 var1 = new class303((this.field3430 ? 40 : 36) * this.field3418);
        for (int var2 = 0; var2 < this.field3418; var2++) {
            if (class333.field5170) {
                var1.method2046((float) this.field3444[var2], 0);
                var1.method2046((float) this.field3436[var2], 0);
                var1.method2046((float) this.field3421[var2], 0);
                var1.method2013(this.field3420[var2], -75);
                var1.method2046(this.field3413[var2], 0);
                var1.method2046(this.field3435[var2], 0);
                var1.method2046(this.field3441[var2], 0);
                var1.method2046((float) this.field3444[var2] / this.field3422, 0);
                var1.method2046((float) this.field3421[var2] / this.field3422, 0);
                if (this.field3430) {
                    var1.method2046(this.field3429[var2], 0);
                }
            } else {
                var1.method2056(115, (float) this.field3444[var2]);
                var1.method2056(117, (float) this.field3436[var2]);
                var1.method2056(123, (float) this.field3421[var2]);
                var1.method2013(this.field3420[var2], -100);
                var1.method2056(122, this.field3413[var2]);
                var1.method2056(113, this.field3435[var2]);
                var1.method2056(126, this.field3441[var2]);
                var1.method2056(114, (float) this.field3444[var2] / this.field3422);
                var1.method2056(116, (float) this.field3421[var2] / this.field3422);
                if (this.field3430) {
                    var1.method2056(116, this.field3429[var2]);
                }
            }
        }
        if (class333.field5188) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field4716, 0, var1.field4679);
            this.field3433 = new class216();
            this.field3433.method1442(var3);
        } else {
            this.field3425 = ByteBuffer.allocateDirect(var1.field4679).order(ByteOrder.nativeOrder());
            this.field3425.put(var1.field4716, 0, var1.field4679);
            this.field3425.flip();
        }
        this.field3444 = null;
        this.field3436 = null;
        this.field3421 = null;
        this.field3420 = null;
        this.field3413 = null;
        this.field3435 = null;
        this.field3441 = null;
        this.field3431 = null;
        this.field3429 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class217(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3416 = arg0;
        this.field3422 = arg1;
        this.field3428 = arg2;
        this.field3430 = arg3;
        this.field3415 = arg4;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V", line = 123)
    public static void method1450() {
        field3437 = null;
        field3440 = null;
        field3417 = null;
        field3423 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIFFFIF)I", line = 130)
    public final int method1451(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class27 var11 = (class27) this.field3431.method1558(var9, false);
            if (var11 != null) {
                if (arg1 < this.field3436[var11.field344]) {
                    this.field3436[var11.field344] = arg1;
                }
                return var11.field344;
            }
        }
        this.field3444[this.field3418] = arg0;
        this.field3436[this.field3418] = arg1;
        this.field3421[this.field3418] = arg2;
        if (this.field3430) {
            this.field3429[this.field3418] = arg7;
        }
        this.field3413[this.field3418] = arg3;
        this.field3435[this.field3418] = arg4;
        this.field3441[this.field3418] = arg5;
        this.field3420[this.field3418] = arg6;
        if (var9 != 0L) {
            this.field3431.method1550(new class27(this.field3418), var9, (byte) 104);
        }
        return this.field3418++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([[[Lsa;FZ)V", line = 175)
    public final void method1452(class174[][][] arg0, float arg1, boolean arg2) {
        if (field3437 == null || field3437.field4716.length < this.field3414 * 4) {
            field3437 = new class303(this.field3414 * 4);
        } else {
            field3437.field4679 = 0;
        }
        if (field3440 == null || field3440.field4716.length < this.field3443 * 4) {
            field3440 = new class303(this.field3443 * 4);
        } else {
            field3440.field4679 = 0;
        }
        if (class333.field5170) {
            for (int var4 = 0; var4 < this.field3434; var4++) {
                class174 var5 = arg0[this.field3438[var4]][this.field3432[var4]][this.field3426[var4]];
                if (var5 != null && var5.field2663) {
                    int[] var6 = this.field3442[var4];
                    class303 var9;
                    if (this.field3428) {
                        int[] var7 = this.field3439[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3440.method2013(var7[var8], -50);
                            }
                        }
                        var9 = this.field3424[var4] ? field3440 : field3437;
                    } else {
                        var9 = field3437;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method2013(var6[0], -59);
                        var9.method2013(var6[var10], -110);
                        var9.method2013(var6[var10 + 1], -120);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3434; var11++) {
                class174 var12 = arg0[this.field3438[var11]][this.field3432[var11]][this.field3426[var11]];
                if (var12 != null && var12.field2663) {
                    int[] var13 = this.field3442[var11];
                    class303 var16;
                    if (this.field3428) {
                        int[] var14 = this.field3439[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3440.method1993((byte) 7, var14[var15]);
                            }
                        }
                        var16 = this.field3424[var11] ? field3440 : field3437;
                    } else {
                        var16 = field3437;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1993((byte) 7, var13[0]);
                        var16.method1993((byte) 7, var13[var17]);
                        var16.method1993((byte) 7, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3437.field4679 == 0 && field3440.field4679 == 0) {
            return;
        }
        GL var18 = class333.field5160;
        if (this.field3416 == -1 || arg2) {
            class333.method2282(-1);
            class174.method1179(0, 0, (byte) 102);
        } else {
            class12.field126.method465(this.field3416, 37);
        }
        int var19 = this.field3430 ? 40 : 36;
        if (this.field3433 == null) {
            if (class333.field5188) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3425.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3425);
            this.field3425.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3425);
            if (class192.field2903) {
                this.field3425.position(16);
                var18.glNormalPointer(5126, var19, this.field3425);
            }
            this.field3425.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3425);
            if (this.field3430) {
                var18.glClientActiveTexture(class321.method2174());
                this.field3425.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3425);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3433.method1446();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class192.field2903) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3430) {
                var18.glClientActiveTexture(class321.method2174());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class333.field5188) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3437.field4679 != 0) {
            if (field3417 == null || field3417.capacity() < field3437.field4679) {
                field3417 = ByteBuffer.allocateDirect(field3437.field4679).order(ByteOrder.nativeOrder());
            } else {
                field3417.clear();
            }
            field3417.put(field3437.field4716, 0, field3437.field4679);
            field3417.flip();
            class333.method2305(arg1);
            var18.glDrawElements(4, field3437.field4679 / 4, 5125, field3417);
        }
        if (field3440.field4679 == 0) {
            return;
        }
        if (field3423 == null || field3423.capacity() < field3440.field4679) {
            field3423 = ByteBuffer.allocateDirect(field3440.field4679).order(ByteOrder.nativeOrder());
        } else {
            field3423.clear();
        }
        field3423.put(field3440.field4716, 0, field3440.field4679);
        field3423.flip();
        class333.method2305(arg1 - 100.0F);
        class333.method2290();
        var18.glDrawElements(4, field3440.field4679 / 4, 5125, field3423);
        class333.method2301();
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V", line = 384)
    public final void method1453() {
        this.field3444 = new int[this.field3419];
        this.field3436 = new int[this.field3419];
        this.field3421 = new int[this.field3419];
        if (this.field3430) {
            this.field3429 = new float[this.field3419];
        }
        this.field3420 = new int[this.field3419];
        this.field3413 = new float[this.field3419];
        this.field3435 = new float[this.field3419];
        this.field3441 = new float[this.field3419];
        this.field3432 = new int[this.field3427];
        this.field3426 = new int[this.field3427];
        this.field3438 = new int[this.field3427];
        this.field3442 = new int[this.field3427][];
        this.field3431 = new class227(class47.method330((byte) 64, this.field3419));
        if (this.field3428) {
            this.field3439 = new int[this.field3427][];
            this.field3424 = new boolean[this.field3427];
        }
    }
}
