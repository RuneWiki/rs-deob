import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class26 extends class151 {

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public int field419 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    private int field415 = 0;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public int field431 = 0;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    private int field428 = 0;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public int field432 = 0;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    private int field446 = 0;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "F")
    private float field425;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Z")
    public boolean field421;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Z")
    private boolean field430;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "Lbe;")
    private class235 field440;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "Lwa;")
    private class75 field439;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lb;")
    private static class94 field416;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Lb;")
    private static class94 field437;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field422;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field426;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field427;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "[F")
    private float[] field418;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "[F")
    private float[] field436;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "[F")
    private float[] field441;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "[F")
    private float[] field445;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
    private int[] field417;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
    private int[] field420;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "[I")
    private int[] field423;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "[I")
    private int[] field429;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "[I")
    private int[] field434;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "[I")
    private int[] field442;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[Z")
    private boolean[] field444;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "[[I")
    private int[][] field438;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "[[I")
    private int[][] field443;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIFFFIF)I", line = 12)
    public final int method206(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class188 var11 = (class188) this.field440.method1672(var9, 19760);
            if (var11 != null) {
                if (arg1 < this.field423[var11.field3237]) {
                    this.field423[var11.field3237] = arg1;
                }
                return var11.field3237;
            }
        }
        this.field442[this.field431] = arg0;
        this.field423[this.field431] = arg1;
        this.field420[this.field431] = arg2;
        if (this.field430) {
            this.field445[this.field431] = arg7;
        }
        this.field436[this.field431] = arg3;
        this.field418[this.field431] = arg4;
        this.field441[this.field431] = arg5;
        this.field424[this.field431] = arg6;
        if (var9 != 0L) {
            this.field440.method1674(new class188(this.field431), false, var9);
        }
        return this.field431++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([[[Lnm;FZ)V", line = 45)
    public final void method207(class225[][][] arg0, float arg1, boolean arg2) {
        if (field437 == null || field437.field1681.length < this.field415 * 4) {
            field437 = new class94(this.field415 * 4);
        } else {
            field437.field1653 = 0;
        }
        if (field416 == null || field416.field1681.length < this.field428 * 4) {
            field416 = new class94(this.field428 * 4);
        } else {
            field416.field1653 = 0;
        }
        if (class117.field2135) {
            for (int var4 = 0; var4 < this.field446; var4++) {
                class225 var5 = arg0[this.field429[var4]][this.field417[var4]][this.field434[var4]];
                if (var5 != null && var5.field3760) {
                    int[] var6 = this.field438[var4];
                    class94 var9;
                    if (this.field421) {
                        int[] var7 = this.field443[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field416.method730(false, var7[var8]);
                            }
                        }
                        var9 = this.field444[var4] ? field416 : field437;
                    } else {
                        var9 = field437;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method730(false, var6[0]);
                        var9.method730(false, var6[var10]);
                        var9.method730(false, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field446; var11++) {
                class225 var12 = arg0[this.field429[var11]][this.field417[var11]][this.field434[var11]];
                if (var12 != null && var12.field3760) {
                    int[] var13 = this.field438[var11];
                    class94 var16;
                    if (this.field421) {
                        int[] var14 = this.field443[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field416.method718((byte) -116, var14[var15]);
                            }
                        }
                        var16 = this.field444[var11] ? field416 : field437;
                    } else {
                        var16 = field437;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method718((byte) -84, var13[0]);
                        var16.method718((byte) -121, var13[var17]);
                        var16.method718((byte) -86, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field437.field1653 == 0 && field416.field1653 == 0) {
            return;
        }
        GL var18 = class117.field2143;
        if (this.field433 == -1 || arg2) {
            class117.method939(-1);
            class116.method913(true, 0, 0);
        } else {
            class312.field5271.method152(this.field433, 255);
        }
        int var19 = this.field430 ? 40 : 36;
        if (this.field439 == null) {
            if (class117.field2145) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field422.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field422);
            this.field422.position(12);
            var18.glColorPointer(4, 5121, var19, this.field422);
            if (class92.field1634) {
                this.field422.position(16);
                var18.glNormalPointer(5126, var19, this.field422);
            }
            this.field422.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field422);
            if (this.field430) {
                var18.glClientActiveTexture(class152.method1190());
                this.field422.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field422);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field439.method536();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class92.field1634) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field430) {
                var18.glClientActiveTexture(class152.method1190());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class117.field2145) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field437.field1653 != 0) {
            if (field426 == null || field426.capacity() < field437.field1653) {
                field426 = ByteBuffer.allocateDirect(field437.field1653).order(ByteOrder.nativeOrder());
            } else {
                field426.clear();
            }
            field426.put(field437.field1681, 0, field437.field1653);
            field426.flip();
            class117.method969(arg1);
            var18.glDrawElements(4, field437.field1653 / 4, 5125, field426);
        }
        if (field416.field1653 == 0) {
            return;
        }
        if (field427 == null || field427.capacity() < field416.field1653) {
            field427 = ByteBuffer.allocateDirect(field416.field1653).order(ByteOrder.nativeOrder());
        } else {
            field427.clear();
        }
        field427.put(field416.field1681, 0, field416.field1653);
        field427.flip();
        class117.method969(arg1 - 100.0F);
        class117.method963();
        var18.glDrawElements(4, field416.field1653 / 4, 5125, field427);
        class117.method968();
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class26(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field433 = arg0;
        this.field425 = arg1;
        this.field421 = arg2;
        this.field430 = arg3;
        this.field435 = arg4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()V", line = 255)
    public final void method208() {
        this.field442 = new int[this.field419];
        this.field423 = new int[this.field419];
        this.field420 = new int[this.field419];
        if (this.field430) {
            this.field445 = new float[this.field419];
        }
        this.field424 = new int[this.field419];
        this.field436 = new float[this.field419];
        this.field418 = new float[this.field419];
        this.field441 = new float[this.field419];
        this.field417 = new int[this.field432];
        this.field434 = new int[this.field432];
        this.field429 = new int[this.field432];
        this.field438 = new int[this.field432][];
        this.field440 = new class235(class237.method1678(this.field419, -31981));
        if (this.field421) {
            this.field443 = new int[this.field432][];
            this.field444 = new boolean[this.field432];
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[I[IZ)I", line = 278)
    public final int method209(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field421) {
            this.field443[this.field446] = arg4;
            this.field444[this.field446] = arg5;
            if (arg4 != null) {
                this.field428 += arg4.length;
            }
            if (arg5) {
                this.field428 += (arg3.length - 2) * 3;
            } else {
                this.field415 += (arg3.length - 2) * 3;
            }
        } else {
            this.field415 += (arg3.length - 2) * 3;
        }
        this.field429[this.field446] = arg0;
        this.field417[this.field446] = arg1;
        this.field434[this.field446] = arg2;
        this.field438[this.field446] = arg3;
        return this.field446++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()V", line = 309)
    public final void method210() {
        class94 var1 = new class94((this.field430 ? 40 : 36) * this.field431);
        for (int var2 = 0; var2 < this.field431; var2++) {
            if (class117.field2135) {
                var1.method710((float) this.field442[var2], -116);
                var1.method710((float) this.field423[var2], -128);
                var1.method710((float) this.field420[var2], -128);
                var1.method730(false, this.field424[var2]);
                var1.method710(this.field436[var2], -117);
                var1.method710(this.field418[var2], -127);
                var1.method710(this.field441[var2], -117);
                var1.method710((float) this.field442[var2] / this.field425, -103);
                var1.method710((float) this.field420[var2] / this.field425, -96);
                if (this.field430) {
                    var1.method710(this.field445[var2], -122);
                }
            } else {
                var1.method733(128, (float) this.field442[var2]);
                var1.method733(128, (float) this.field423[var2]);
                var1.method733(128, (float) this.field420[var2]);
                var1.method730(false, this.field424[var2]);
                var1.method733(128, this.field436[var2]);
                var1.method733(128, this.field418[var2]);
                var1.method733(128, this.field441[var2]);
                var1.method733(128, (float) this.field442[var2] / this.field425);
                var1.method733(128, (float) this.field420[var2] / this.field425);
                if (this.field430) {
                    var1.method733(128, this.field445[var2]);
                }
            }
        }
        if (class117.field2145) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1681, 0, var1.field1653);
            this.field439 = new class75();
            this.field439.method534(var3);
        } else {
            this.field422 = ByteBuffer.allocateDirect(var1.field1653).order(ByteOrder.nativeOrder());
            this.field422.put(var1.field1681, 0, var1.field1653);
            this.field422.flip();
        }
        this.field442 = null;
        this.field423 = null;
        this.field420 = null;
        this.field424 = null;
        this.field436 = null;
        this.field418 = null;
        this.field441 = null;
        this.field440 = null;
        this.field445 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()V", line = 378)
    public static void method211() {
        field437 = null;
        field416 = null;
        field426 = null;
        field427 = null;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()V", line = 390)
    public static final void method212() {
        field437 = null;
        field416 = null;
        field426 = null;
        field427 = null;
    }
}
