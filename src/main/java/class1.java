import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class273 {

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    private int field4 = 0;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field1 = 0;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    private int field23 = 0;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public int field6 = 0;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public int field12 = 0;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    private int field25 = 0;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "F")
    private float field30;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "Z")
    public boolean field21;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Z")
    private boolean field13;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "Lpj;")
    private class182 field31;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lol;")
    private class231 field7;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "Lhi;")
    private static class291 field20;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "Lhi;")
    private static class291 field24;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field16;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field18;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "[F")
    private float[] field11;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "[F")
    private float[] field17;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "[F")
    private float[] field27;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "[F")
    private float[] field9;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[I")
    private int[] field10;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "[I")
    private int[] field19;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
    private int[] field2;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "[I")
    private int[] field28;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "[I")
    private int[] field29;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
    private int[] field3;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[I")
    private int[] field8;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "[Z")
    private boolean[] field22;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "[[I")
    private int[][] field14;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "[[I")
    private int[][] field26;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class1(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field15 = arg0;
        this.field30 = arg1;
        this.field21 = arg2;
        this.field13 = arg3;
        this.field32 = arg4;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIFFFIF)I", line = 19)
    public final int method1(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class114 var11 = (class114) this.field7.method1586(var9, -119);
            if (var11 != null) {
                if (arg1 < this.field19[var11.field1616]) {
                    this.field19[var11.field1616] = arg1;
                }
                return var11.field1616;
            }
        }
        this.field29[this.field1] = arg0;
        this.field19[this.field1] = arg1;
        this.field8[this.field1] = arg2;
        if (this.field13) {
            this.field11[this.field1] = arg7;
        }
        this.field17[this.field1] = arg3;
        this.field9[this.field1] = arg4;
        this.field27[this.field1] = arg5;
        this.field10[this.field1] = arg6;
        if (var9 != 0L) {
            this.field7.method1593(var9, new class114(this.field1), 27497);
        }
        return this.field1++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V", line = 58)
    public final void method2() {
        this.field29 = new int[this.field12];
        this.field19 = new int[this.field12];
        this.field8 = new int[this.field12];
        if (this.field13) {
            this.field11 = new float[this.field12];
        }
        this.field10 = new int[this.field12];
        this.field17 = new float[this.field12];
        this.field9 = new float[this.field12];
        this.field27 = new float[this.field12];
        this.field2 = new int[this.field6];
        this.field3 = new int[this.field6];
        this.field28 = new int[this.field6];
        this.field26 = new int[this.field6][];
        this.field7 = new class231(class270.method1847(this.field12, 96));
        if (this.field21) {
            this.field14 = new int[this.field6][];
            this.field22 = new boolean[this.field6];
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()V", line = 82)
    public static void method3() {
        field20 = null;
        field24 = null;
        field16 = null;
        field18 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V", line = 98)
    public final void method4() {
        class291 var1 = new class291((this.field13 ? 40 : 36) * this.field1);
        for (int var2 = 0; var2 < this.field1; var2++) {
            if (class217.field3537) {
                var1.method1987((float) this.field29[var2], (byte) 85);
                var1.method1987((float) this.field19[var2], (byte) 85);
                var1.method1987((float) this.field8[var2], (byte) 85);
                var1.method1967(this.field10[var2], -1303690792);
                var1.method1987(this.field17[var2], (byte) 85);
                var1.method1987(this.field9[var2], (byte) 85);
                var1.method1987(this.field27[var2], (byte) 85);
                var1.method1987((float) this.field29[var2] / this.field30, (byte) 85);
                var1.method1987((float) this.field8[var2] / this.field30, (byte) 85);
                if (this.field13) {
                    var1.method1987(this.field11[var2], (byte) 85);
                }
            } else {
                var1.method1970((float) this.field29[var2], 65536);
                var1.method1970((float) this.field19[var2], 65536);
                var1.method1970((float) this.field8[var2], 65536);
                var1.method1967(this.field10[var2], -1303690792);
                var1.method1970(this.field17[var2], 65536);
                var1.method1970(this.field9[var2], 65536);
                var1.method1970(this.field27[var2], 65536);
                var1.method1970((float) this.field29[var2] / this.field30, 65536);
                var1.method1970((float) this.field8[var2] / this.field30, 65536);
                if (this.field13) {
                    var1.method1970(this.field11[var2], 65536);
                }
            }
        }
        if (class217.field3526) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field4950, 0, var1.field4946);
            this.field31 = new class182();
            this.field31.method1210(var3);
        } else {
            this.field5 = ByteBuffer.allocateDirect(var1.field4946).order(ByteOrder.nativeOrder());
            this.field5.put(var1.field4950, 0, var1.field4946);
            this.field5.flip();
        }
        this.field29 = null;
        this.field19 = null;
        this.field8 = null;
        this.field10 = null;
        this.field17 = null;
        this.field9 = null;
        this.field27 = null;
        this.field7 = null;
        this.field11 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([[[Lkb;FZ)V", line = 177)
    public final void method5(class34[][][] arg0, float arg1, boolean arg2) {
        if (field20 == null || field20.field4950.length < this.field4 * 4) {
            field20 = new class291(this.field4 * 4);
        } else {
            field20.field4946 = 0;
        }
        if (field24 == null || field24.field4950.length < this.field25 * 4) {
            field24 = new class291(this.field25 * 4);
        } else {
            field24.field4946 = 0;
        }
        if (class217.field3537) {
            for (int var4 = 0; var4 < this.field23; var4++) {
                class34 var5 = arg0[this.field28[var4]][this.field2[var4]][this.field3[var4]];
                if (var5 != null && var5.field559) {
                    int[] var6 = this.field26[var4];
                    class291 var9;
                    if (this.field21) {
                        int[] var7 = this.field14[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field24.method1967(var7[var8], -1303690792);
                            }
                        }
                        var9 = this.field22[var4] ? field24 : field20;
                    } else {
                        var9 = field20;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1967(var6[0], -1303690792);
                        var9.method1967(var6[var10], -1303690792);
                        var9.method1967(var6[var10 + 1], -1303690792);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field23; var11++) {
                class34 var12 = arg0[this.field28[var11]][this.field2[var11]][this.field3[var11]];
                if (var12 != null && var12.field559) {
                    int[] var13 = this.field26[var11];
                    class291 var16;
                    if (this.field21) {
                        int[] var14 = this.field14[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field24.method1998(var14[var15], (byte) -78);
                            }
                        }
                        var16 = this.field22[var11] ? field24 : field20;
                    } else {
                        var16 = field20;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1998(var13[0], (byte) 110);
                        var16.method1998(var13[var17], (byte) -91);
                        var16.method1998(var13[var17 + 1], (byte) -20);
                    }
                }
            }
        }
        if (field20.field4946 == 0 && field24.field4946 == 0) {
            return;
        }
        GL var18 = class217.field3551;
        if (this.field15 == -1 || arg2) {
            class217.method1457(-1);
            class89.method587(0, 0, -113);
        } else {
            class181.field2878.method1780(this.field15, 0);
        }
        int var19 = this.field13 ? 40 : 36;
        if (this.field31 == null) {
            if (class217.field3526) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field5.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field5);
            this.field5.position(12);
            var18.glColorPointer(4, 5121, var19, this.field5);
            if (class81.field1131) {
                this.field5.position(16);
                var18.glNormalPointer(5126, var19, this.field5);
            }
            this.field5.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field5);
            if (this.field13) {
                var18.glClientActiveTexture(class168.method1107());
                this.field5.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field5);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field31.method1208();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class81.field1131) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field13) {
                var18.glClientActiveTexture(class168.method1107());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class217.field3526) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field20.field4946 != 0) {
            if (field16 == null || field16.capacity() < field20.field4946) {
                field16 = ByteBuffer.allocateDirect(field20.field4946).order(ByteOrder.nativeOrder());
            } else {
                field16.clear();
            }
            field16.put(field20.field4950, 0, field20.field4946);
            field16.flip();
            class217.method1488(arg1);
            var18.glDrawElements(4, field20.field4946 / 4, 5125, field16);
        }
        if (field24.field4946 == 0) {
            return;
        }
        if (field18 == null || field18.capacity() < field24.field4946) {
            field18 = ByteBuffer.allocateDirect(field24.field4946).order(ByteOrder.nativeOrder());
        } else {
            field18.clear();
        }
        field18.put(field24.field4950, 0, field24.field4946);
        field18.flip();
        class217.method1488(arg1 - 100.0F);
        class217.method1479();
        var18.glDrawElements(4, field24.field4946 / 4, 5125, field18);
        class217.method1461();
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()V", line = 382)
    public static final void method6() {
        field20 = null;
        field24 = null;
        field16 = null;
        field18 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III[I[IZ)I", line = 393)
    public final int method7(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field21) {
            this.field14[this.field23] = arg4;
            this.field22[this.field23] = arg5;
            if (arg4 != null) {
                this.field25 += arg4.length;
            }
            if (arg5) {
                this.field25 += (arg3.length - 2) * 3;
            } else {
                this.field4 += (arg3.length - 2) * 3;
            }
        } else {
            this.field4 += (arg3.length - 2) * 3;
        }
        this.field28[this.field23] = arg0;
        this.field2[this.field23] = arg1;
        this.field3[this.field23] = arg2;
        this.field26[this.field23] = arg3;
        return this.field23++;
    }
}
