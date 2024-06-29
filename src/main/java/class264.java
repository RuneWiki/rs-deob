import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class264 extends class80 {

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    private int field4418 = 0;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    private int field4419 = 0;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    private int field4410 = 0;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public int field4429 = 0;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public int field4432 = 0;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public int field4433 = 0;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "F")
    private float field4414;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Z")
    public boolean field4406;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "Z")
    private boolean field4425;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "Lbm;")
    private class140 field4428;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Lhb;")
    private static class164 field4422;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "Lhb;")
    private static class164 field4437;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Lfe;")
    private class97 field4426;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4407;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4413;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4435;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "[F")
    private float[] field4411;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "[F")
    private float[] field4412;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "[F")
    private float[] field4416;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "[F")
    private float[] field4431;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "[I")
    private int[] field4408;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "[I")
    private int[] field4415;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "[I")
    private int[] field4420;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "[I")
    private int[] field4423;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "[I")
    private int[] field4430;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "[I")
    private int[] field4434;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "[I")
    private int[] field4436;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "[Z")
    private boolean[] field4424;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[[I")
    private int[][] field4409;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "[[I")
    private int[][] field4417;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([[[Lkk;FZ)V", line = 11)
    public final void method1835(class72[][][] arg0, float arg1, boolean arg2) {
        if (field4422 == null || field4422.field2668.length < this.field4410 * 4) {
            field4422 = new class164(this.field4410 * 4);
        } else {
            field4422.field2670 = 0;
        }
        if (field4437 == null || field4437.field2668.length < this.field4418 * 4) {
            field4437 = new class164(this.field4418 * 4);
        } else {
            field4437.field2670 = 0;
        }
        if (class99.field1678) {
            for (int var4 = 0; var4 < this.field4419; var4++) {
                class72 var5 = arg0[this.field4408[var4]][this.field4423[var4]][this.field4436[var4]];
                if (var5 != null && var5.field1217) {
                    int[] var6 = this.field4417[var4];
                    class164 var9;
                    if (this.field4406) {
                        int[] var7 = this.field4409[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field4437.method1168(var7[var8], (byte) -67);
                            }
                        }
                        var9 = this.field4424[var4] ? field4437 : field4422;
                    } else {
                        var9 = field4422;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1168(var6[0], (byte) -84);
                        var9.method1168(var6[var10], (byte) -94);
                        var9.method1168(var6[var10 + 1], (byte) -121);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field4419; var11++) {
                class72 var12 = arg0[this.field4408[var11]][this.field4423[var11]][this.field4436[var11]];
                if (var12 != null && var12.field1217) {
                    int[] var13 = this.field4417[var11];
                    class164 var16;
                    if (this.field4406) {
                        int[] var14 = this.field4409[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field4437.method1152(var14[var15], (byte) 98);
                            }
                        }
                        var16 = this.field4424[var11] ? field4437 : field4422;
                    } else {
                        var16 = field4422;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1152(var13[0], (byte) 98);
                        var16.method1152(var13[var17], (byte) 98);
                        var16.method1152(var13[var17 + 1], (byte) 98);
                    }
                }
            }
        }
        if (field4422.field2670 == 0 && field4437.field2670 == 0) {
            return;
        }
        GL var18 = class99.field1682;
        if (this.field4421 == -1 || arg2) {
            class99.method749(-1);
            class285.method1964(118, 0, 0);
        } else {
            class310.field5207.method111(64, this.field4421);
        }
        int var19 = this.field4425 ? 40 : 36;
        if (this.field4428 == null) {
            if (class99.field1689) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field4435.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field4435);
            this.field4435.position(12);
            var18.glColorPointer(4, 5121, var19, this.field4435);
            if (class88.field1483) {
                this.field4435.position(16);
                var18.glNormalPointer(5126, var19, this.field4435);
            }
            this.field4435.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field4435);
            if (this.field4425) {
                var18.glClientActiveTexture(class64.method481());
                this.field4435.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field4435);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field4428.method1008();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class88.field1483) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field4425) {
                var18.glClientActiveTexture(class64.method481());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class99.field1689) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field4422.field2670 != 0) {
            if (field4413 == null || field4413.capacity() < field4422.field2670) {
                field4413 = ByteBuffer.allocateDirect(field4422.field2670).order(ByteOrder.nativeOrder());
            } else {
                field4413.clear();
            }
            field4413.put(field4422.field2668, 0, field4422.field2670);
            field4413.flip();
            class99.method741(arg1);
            var18.glDrawElements(4, field4422.field2670 / 4, 5125, field4413);
        }
        if (field4437.field2670 == 0) {
            return;
        }
        if (field4407 == null || field4407.capacity() < field4437.field2670) {
            field4407 = ByteBuffer.allocateDirect(field4437.field2670).order(ByteOrder.nativeOrder());
        } else {
            field4407.clear();
        }
        field4407.put(field4437.field2668, 0, field4437.field2670);
        field4407.flip();
        class99.method741(arg1 - 100.0F);
        class99.method743();
        var18.glDrawElements(4, field4437.field2670 / 4, 5125, field4407);
        class99.method755();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 217)
    public static final void method1836() {
        field4422 = null;
        field4437 = null;
        field4413 = null;
        field4407 = null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()V", line = 225)
    public static void method1837() {
        field4422 = null;
        field4437 = null;
        field4413 = null;
        field4407 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III[I[IZ)I", line = 234)
    public final int method1838(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field4406) {
            this.field4409[this.field4419] = arg4;
            this.field4424[this.field4419] = arg5;
            if (arg4 != null) {
                this.field4418 += arg4.length;
            }
            if (arg5) {
                this.field4418 += (arg3.length - 2) * 3;
            } else {
                this.field4410 += (arg3.length - 2) * 3;
            }
        } else {
            this.field4410 += (arg3.length - 2) * 3;
        }
        this.field4408[this.field4419] = arg0;
        this.field4423[this.field4419] = arg1;
        this.field4436[this.field4419] = arg2;
        this.field4417[this.field4419] = arg3;
        return this.field4419++;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IFZZI)V", line = 416)
    public class264(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field4421 = arg0;
        this.field4414 = arg1;
        this.field4406 = arg2;
        this.field4425 = arg3;
        this.field4427 = arg4;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V", line = 267)
    public final void method1839() {
        class164 var1 = new class164((this.field4425 ? 40 : 36) * this.field4429);
        for (int var2 = 0; var2 < this.field4429; var2++) {
            if (class99.field1678) {
                var1.method1195(98, (float) this.field4415[var2]);
                var1.method1195(119, (float) this.field4434[var2]);
                var1.method1195(94, (float) this.field4420[var2]);
                var1.method1168(this.field4430[var2], (byte) -114);
                var1.method1195(109, this.field4416[var2]);
                var1.method1195(108, this.field4411[var2]);
                var1.method1195(123, this.field4412[var2]);
                var1.method1195(99, (float) this.field4415[var2] / this.field4414);
                var1.method1195(121, (float) this.field4420[var2] / this.field4414);
                if (this.field4425) {
                    var1.method1195(108, this.field4431[var2]);
                }
            } else {
                var1.method1158((float) this.field4415[var2], (byte) 20);
                var1.method1158((float) this.field4434[var2], (byte) -119);
                var1.method1158((float) this.field4420[var2], (byte) -124);
                var1.method1168(this.field4430[var2], (byte) -125);
                var1.method1158(this.field4416[var2], (byte) 66);
                var1.method1158(this.field4411[var2], (byte) -116);
                var1.method1158(this.field4412[var2], (byte) 112);
                var1.method1158((float) this.field4415[var2] / this.field4414, (byte) 62);
                var1.method1158((float) this.field4420[var2] / this.field4414, (byte) 73);
                if (this.field4425) {
                    var1.method1158(this.field4431[var2], (byte) -103);
                }
            }
        }
        if (class99.field1689) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2668, 0, var1.field2670);
            this.field4428 = new class140();
            this.field4428.method1011(var3);
        } else {
            this.field4435 = ByteBuffer.allocateDirect(var1.field2670).order(ByteOrder.nativeOrder());
            this.field4435.put(var1.field2668, 0, var1.field2670);
            this.field4435.flip();
        }
        this.field4415 = null;
        this.field4434 = null;
        this.field4420 = null;
        this.field4430 = null;
        this.field4416 = null;
        this.field4411 = null;
        this.field4412 = null;
        this.field4426 = null;
        this.field4431 = null;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()V", line = 348)
    public final void method1840() {
        this.field4415 = new int[this.field4432];
        this.field4434 = new int[this.field4432];
        this.field4420 = new int[this.field4432];
        if (this.field4425) {
            this.field4431 = new float[this.field4432];
        }
        this.field4430 = new int[this.field4432];
        this.field4416 = new float[this.field4432];
        this.field4411 = new float[this.field4432];
        this.field4412 = new float[this.field4432];
        this.field4423 = new int[this.field4433];
        this.field4436 = new int[this.field4433];
        this.field4408 = new int[this.field4433];
        this.field4417 = new int[this.field4433][];
        this.field4426 = new class97(class303.method2049(this.field4432, 2539));
        if (this.field4406) {
            this.field4409 = new int[this.field4433][];
            this.field4424 = new boolean[this.field4433];
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIFFFIF)I", line = 385)
    public final int method1841(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class295 var11 = (class295) this.field4426.method713(3365, var9);
            if (var11 != null) {
                if (arg1 < this.field4434[var11.field4829]) {
                    this.field4434[var11.field4829] = arg1;
                }
                return var11.field4829;
            }
        }
        this.field4415[this.field4429] = arg0;
        this.field4434[this.field4429] = arg1;
        this.field4420[this.field4429] = arg2;
        if (this.field4425) {
            this.field4431[this.field4429] = arg7;
        }
        this.field4416[this.field4429] = arg3;
        this.field4411[this.field4429] = arg4;
        this.field4412[this.field4429] = arg5;
        this.field4430[this.field4429] = arg6;
        if (var9 != 0L) {
            this.field4426.method710(new class295(this.field4429), (byte) -28, var9);
        }
        return this.field4429++;
    }
}
