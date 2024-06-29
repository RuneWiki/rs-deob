import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class268 extends class183 {

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public int field3955 = 0;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    private int field3949 = 0;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    private int field3971 = 0;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public int field3976 = 0;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field3952 = 0;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    private int field3977 = 0;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "F")
    private float field3973;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
    public boolean field3960;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "Z")
    private boolean field3965;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "Lik;")
    private class17 field3958;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Lhb;")
    private class305 field3953;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "Lcg;")
    private static class316 field3964;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "Lcg;")
    private static class316 field3967;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3950;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3970;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3972;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "[F")
    private float[] field3947;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "[F")
    private float[] field3951;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "[F")
    private float[] field3961;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "[F")
    private float[] field3975;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[I")
    private int[] field3948;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "[I")
    private int[] field3954;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "[I")
    private int[] field3956;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "[I")
    private int[] field3957;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "[I")
    private int[] field3959;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "[I")
    private int[] field3963;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
    private int[] field3968;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "[Z")
    private boolean[] field3974;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "[[I")
    private int[][] field3962;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "[[I")
    private int[][] field3966;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 11)
    public final void method1844() {
        class316 var1 = new class316((this.field3965 ? 40 : 36) * this.field3955);
        for (int var2 = 0; var2 < this.field3955; var2++) {
            if (class67.field916) {
                var1.method2213(-1, (float) this.field3968[var2]);
                var1.method2213(-1, (float) this.field3956[var2]);
                var1.method2213(-1, (float) this.field3963[var2]);
                var1.method2188(255, this.field3948[var2]);
                var1.method2213(-1, this.field3951[var2]);
                var1.method2213(-1, this.field3975[var2]);
                var1.method2213(-1, this.field3961[var2]);
                var1.method2213(-1, (float) this.field3968[var2] / this.field3973);
                var1.method2213(-1, (float) this.field3963[var2] / this.field3973);
                if (this.field3965) {
                    var1.method2213(-1, this.field3947[var2]);
                }
            } else {
                var1.method2171(-1365938680, (float) this.field3968[var2]);
                var1.method2171(-1365938680, (float) this.field3956[var2]);
                var1.method2171(-1365938680, (float) this.field3963[var2]);
                var1.method2188(255, this.field3948[var2]);
                var1.method2171(-1365938680, this.field3951[var2]);
                var1.method2171(-1365938680, this.field3975[var2]);
                var1.method2171(-1365938680, this.field3961[var2]);
                var1.method2171(-1365938680, (float) this.field3968[var2] / this.field3973);
                var1.method2171(-1365938680, (float) this.field3963[var2] / this.field3973);
                if (this.field3965) {
                    var1.method2171(-1365938680, this.field3947[var2]);
                }
            }
        }
        if (class67.field914) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field4798, 0, var1.field4777);
            this.field3953 = new class305();
            this.field3953.method2075(var3);
        } else {
            this.field3972 = ByteBuffer.allocateDirect(var1.field4777).order(ByteOrder.nativeOrder());
            this.field3972.put(var1.field4798, 0, var1.field4777);
            this.field3972.flip();
        }
        this.field3968 = null;
        this.field3956 = null;
        this.field3963 = null;
        this.field3948 = null;
        this.field3951 = null;
        this.field3975 = null;
        this.field3961 = null;
        this.field3958 = null;
        this.field3947 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V", line = 77)
    public static final void method1845() {
        field3967 = null;
        field3964 = null;
        field3950 = null;
        field3970 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([[[Lpi;FZ)V", line = 86)
    public final void method1846(class202[][][] arg0, float arg1, boolean arg2) {
        if (field3967 == null || field3967.field4798.length < this.field3971 * 4) {
            field3967 = new class316(this.field3971 * 4);
        } else {
            field3967.field4777 = 0;
        }
        if (field3964 == null || field3964.field4798.length < this.field3977 * 4) {
            field3964 = new class316(this.field3977 * 4);
        } else {
            field3964.field4777 = 0;
        }
        if (class67.field916) {
            for (int var4 = 0; var4 < this.field3949; var4++) {
                class202 var5 = arg0[this.field3959[var4]][this.field3957[var4]][this.field3954[var4]];
                if (var5 != null && var5.field2870) {
                    int[] var6 = this.field3962[var4];
                    class316 var9;
                    if (this.field3960) {
                        int[] var7 = this.field3966[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3964.method2188(255, var7[var8]);
                            }
                        }
                        var9 = this.field3974[var4] ? field3964 : field3967;
                    } else {
                        var9 = field3967;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method2188(255, var6[0]);
                        var9.method2188(255, var6[var10]);
                        var9.method2188(255, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3949; var11++) {
                class202 var12 = arg0[this.field3959[var11]][this.field3957[var11]][this.field3954[var11]];
                if (var12 != null && var12.field2870) {
                    int[] var13 = this.field3962[var11];
                    class316 var16;
                    if (this.field3960) {
                        int[] var14 = this.field3966[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3964.method2155(var14[var15], -103);
                            }
                        }
                        var16 = this.field3974[var11] ? field3964 : field3967;
                    } else {
                        var16 = field3967;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method2155(var13[0], -109);
                        var16.method2155(var13[var17], -123);
                        var16.method2155(var13[var17 + 1], -125);
                    }
                }
            }
        }
        if (field3967.field4777 == 0 && field3964.field4777 == 0) {
            return;
        }
        GL var18 = class67.field899;
        if (this.field3978 == -1 || arg2) {
            class67.method479(-1);
            class123.method884(0, 0, 127);
        } else {
            class184.field2543.method672(this.field3978, 255);
        }
        int var19 = this.field3965 ? 40 : 36;
        if (this.field3953 == null) {
            if (class67.field914) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3972.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3972);
            this.field3972.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3972);
            if (class314.field4736) {
                this.field3972.position(16);
                var18.glNormalPointer(5126, var19, this.field3972);
            }
            this.field3972.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3972);
            if (this.field3965) {
                var18.glClientActiveTexture(class5.method27());
                this.field3972.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3972);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3953.method2076();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class314.field4736) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3965) {
                var18.glClientActiveTexture(class5.method27());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class67.field914) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3967.field4777 != 0) {
            if (field3950 == null || field3950.capacity() < field3967.field4777) {
                field3950 = ByteBuffer.allocateDirect(field3967.field4777).order(ByteOrder.nativeOrder());
            } else {
                field3950.clear();
            }
            field3950.put(field3967.field4798, 0, field3967.field4777);
            field3950.flip();
            class67.method488(arg1);
            var18.glDrawElements(4, field3967.field4777 / 4, 5125, field3950);
        }
        if (field3964.field4777 == 0) {
            return;
        }
        if (field3970 == null || field3970.capacity() < field3964.field4777) {
            field3970 = ByteBuffer.allocateDirect(field3964.field4777).order(ByteOrder.nativeOrder());
        } else {
            field3970.clear();
        }
        field3970.put(field3964.field4798, 0, field3964.field4777);
        field3970.flip();
        class67.method488(arg1 - 100.0F);
        class67.method475();
        var18.glDrawElements(4, field3964.field4777 / 4, 5125, field3970);
        class67.method482();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[I[IZ)I", line = 291)
    public final int method1847(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3960) {
            this.field3966[this.field3949] = arg4;
            this.field3974[this.field3949] = arg5;
            if (arg4 != null) {
                this.field3977 += arg4.length;
            }
            if (arg5) {
                this.field3977 += (arg3.length - 2) * 3;
            } else {
                this.field3971 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3971 += (arg3.length - 2) * 3;
        }
        this.field3959[this.field3949] = arg0;
        this.field3957[this.field3949] = arg1;
        this.field3954[this.field3949] = arg2;
        this.field3962[this.field3949] = arg3;
        return this.field3949++;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class268(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3978 = arg0;
        this.field3973 = arg1;
        this.field3960 = arg2;
        this.field3965 = arg3;
        this.field3969 = arg4;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()V", line = 327)
    public static void method1848() {
        field3967 = null;
        field3964 = null;
        field3950 = null;
        field3970 = null;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()V", line = 336)
    public final void method1849() {
        this.field3968 = new int[this.field3976];
        this.field3956 = new int[this.field3976];
        this.field3963 = new int[this.field3976];
        if (this.field3965) {
            this.field3947 = new float[this.field3976];
        }
        this.field3948 = new int[this.field3976];
        this.field3951 = new float[this.field3976];
        this.field3975 = new float[this.field3976];
        this.field3961 = new float[this.field3976];
        this.field3957 = new int[this.field3952];
        this.field3954 = new int[this.field3952];
        this.field3959 = new int[this.field3952];
        this.field3962 = new int[this.field3952][];
        this.field3958 = new class17(class110.method804(this.field3976, (byte) 72));
        if (this.field3960) {
            this.field3966 = new int[this.field3952][];
            this.field3974 = new boolean[this.field3952];
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIFFFIF)I", line = 364)
    public final int method1850(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class336 var11 = (class336) this.field3958.method111(30, var9);
            if (var11 != null) {
                if (arg1 < this.field3956[var11.field5063]) {
                    this.field3956[var11.field5063] = arg1;
                }
                return var11.field5063;
            }
        }
        this.field3968[this.field3955] = arg0;
        this.field3956[this.field3955] = arg1;
        this.field3963[this.field3955] = arg2;
        if (this.field3965) {
            this.field3947[this.field3955] = arg7;
        }
        this.field3951[this.field3955] = arg3;
        this.field3975[this.field3955] = arg4;
        this.field3961[this.field3955] = arg5;
        this.field3948[this.field3955] = arg6;
        if (var9 != 0L) {
            this.field3958.method120(var9, new class336(this.field3955), -22851);
        }
        return this.field3955++;
    }
}
