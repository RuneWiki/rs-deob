import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class192 extends class24 {

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public int field3107 = 0;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    private int field3113 = 0;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public int field3118 = 0;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    private int field3120 = 0;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    private int field3121 = 0;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public int field3122 = 0;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "F")
    private float field3108;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Z")
    public boolean field3133;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Z")
    private boolean field3119;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lj;")
    private static class153 field3104;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "Lj;")
    private static class153 field3130;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "Lie;")
    private class47 field3111;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "Lkb;")
    private class80 field3132;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3110;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3115;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3125;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "[F")
    private float[] field3102;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[F")
    private float[] field3103;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "[F")
    private float[] field3114;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "[F")
    private float[] field3129;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
    private int[] field3105;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "[I")
    private int[] field3109;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "[I")
    private int[] field3112;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "[I")
    private int[] field3117;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "[I")
    private int[] field3126;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "[I")
    private int[] field3128;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "[I")
    private int[] field3131;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[Z")
    private boolean[] field3127;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[[I")
    private int[][] field3106;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "[[I")
    private int[][] field3116;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()V", line = 12)
    public final void method1353() {
        class153 var1 = new class153((this.field3119 ? 40 : 36) * this.field3118);
        for (int var2 = 0; var2 < this.field3118; var2++) {
            if (class90.field1369) {
                var1.method1098(0, (float) this.field3126[var2]);
                var1.method1098(0, (float) this.field3131[var2]);
                var1.method1098(0, (float) this.field3128[var2]);
                var1.method1045(this.field3117[var2], (byte) 122);
                var1.method1098(0, this.field3102[var2]);
                var1.method1098(0, this.field3114[var2]);
                var1.method1098(0, this.field3129[var2]);
                var1.method1098(0, (float) this.field3126[var2] / this.field3108);
                var1.method1098(0, (float) this.field3128[var2] / this.field3108);
                if (this.field3119) {
                    var1.method1098(0, this.field3103[var2]);
                }
            } else {
                var1.method1070((byte) -127, (float) this.field3126[var2]);
                var1.method1070((byte) -117, (float) this.field3131[var2]);
                var1.method1070((byte) -117, (float) this.field3128[var2]);
                var1.method1045(this.field3117[var2], (byte) 73);
                var1.method1070((byte) -112, this.field3102[var2]);
                var1.method1070((byte) -128, this.field3114[var2]);
                var1.method1070((byte) -110, this.field3129[var2]);
                var1.method1070((byte) -116, (float) this.field3126[var2] / this.field3108);
                var1.method1070((byte) -105, (float) this.field3128[var2] / this.field3108);
                if (this.field3119) {
                    var1.method1070((byte) -119, this.field3103[var2]);
                }
            }
        }
        if (class90.field1383) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2359, 0, var1.field2367);
            this.field3111 = new class47();
            this.field3111.method252(var3);
        } else {
            this.field3125 = ByteBuffer.allocateDirect(var1.field2367).order(ByteOrder.nativeOrder());
            this.field3125.put(var1.field2359, 0, var1.field2367);
            this.field3125.flip();
        }
        this.field3126 = null;
        this.field3131 = null;
        this.field3128 = null;
        this.field3117 = null;
        this.field3102 = null;
        this.field3114 = null;
        this.field3129 = null;
        this.field3132 = null;
        this.field3103 = null;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()V", line = 87)
    public final void method1354() {
        this.field3126 = new int[this.field3107];
        this.field3131 = new int[this.field3107];
        this.field3128 = new int[this.field3107];
        if (this.field3119) {
            this.field3103 = new float[this.field3107];
        }
        this.field3117 = new int[this.field3107];
        this.field3102 = new float[this.field3107];
        this.field3114 = new float[this.field3107];
        this.field3129 = new float[this.field3107];
        this.field3112 = new int[this.field3122];
        this.field3105 = new int[this.field3122];
        this.field3109 = new int[this.field3122];
        this.field3106 = new int[this.field3122][];
        this.field3132 = new class80(class180.method1294(true, this.field3107));
        if (this.field3133) {
            this.field3116 = new int[this.field3122][];
            this.field3127 = new boolean[this.field3122];
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IFZZI)V", line = 411)
    public class192(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3124 = arg0;
        this.field3108 = arg1;
        this.field3133 = arg2;
        this.field3119 = arg3;
        this.field3123 = arg4;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([[[Lsb;FZ)V", line = 125)
    public final void method1355(class127[][][] arg0, float arg1, boolean arg2) {
        if (field3104 == null || field3104.field2359.length < this.field3121 * 4) {
            field3104 = new class153(this.field3121 * 4);
        } else {
            field3104.field2367 = 0;
        }
        if (field3130 == null || field3130.field2359.length < this.field3120 * 4) {
            field3130 = new class153(this.field3120 * 4);
        } else {
            field3130.field2367 = 0;
        }
        if (class90.field1369) {
            for (int var4 = 0; var4 < this.field3113; var4++) {
                class127 var5 = arg0[this.field3109[var4]][this.field3112[var4]][this.field3105[var4]];
                if (var5 != null && var5.field1975) {
                    int[] var6 = this.field3106[var4];
                    class153 var9;
                    if (this.field3133) {
                        int[] var7 = this.field3116[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3130.method1045(var7[var8], (byte) 66);
                            }
                        }
                        var9 = this.field3127[var4] ? field3130 : field3104;
                    } else {
                        var9 = field3104;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1045(var6[0], (byte) 86);
                        var9.method1045(var6[var10], (byte) 108);
                        var9.method1045(var6[var10 + 1], (byte) 31);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3113; var11++) {
                class127 var12 = arg0[this.field3109[var11]][this.field3112[var11]][this.field3105[var11]];
                if (var12 != null && var12.field1975) {
                    int[] var13 = this.field3106[var11];
                    class153 var16;
                    if (this.field3133) {
                        int[] var14 = this.field3116[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3130.method1057(false, var14[var15]);
                            }
                        }
                        var16 = this.field3127[var11] ? field3130 : field3104;
                    } else {
                        var16 = field3104;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1057(false, var13[0]);
                        var16.method1057(false, var13[var17]);
                        var16.method1057(false, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3104.field2367 == 0 && field3130.field2367 == 0) {
            return;
        }
        GL var18 = class90.field1390;
        if (this.field3124 == -1 || arg2) {
            class90.method617(-1);
            class284.method1960(0, 0, 15);
        } else {
            class173.field2815.method510((byte) -98, this.field3124);
        }
        int var19 = this.field3119 ? 40 : 36;
        if (this.field3111 == null) {
            if (class90.field1383) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3125.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3125);
            this.field3125.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3125);
            if (class44.field539) {
                this.field3125.position(16);
                var18.glNormalPointer(5126, var19, this.field3125);
            }
            this.field3125.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3125);
            if (this.field3119) {
                var18.glClientActiveTexture(class88.method600());
                this.field3125.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3125);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3111.method255();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class44.field539) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3119) {
                var18.glClientActiveTexture(class88.method600());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class90.field1383) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3104.field2367 != 0) {
            if (field3115 == null || field3115.capacity() < field3104.field2367) {
                field3115 = ByteBuffer.allocateDirect(field3104.field2367).order(ByteOrder.nativeOrder());
            } else {
                field3115.clear();
            }
            field3115.put(field3104.field2359, 0, field3104.field2367);
            field3115.flip();
            class90.method622(arg1);
            var18.glDrawElements(4, field3104.field2367 / 4, 5125, field3115);
        }
        if (field3130.field2367 == 0) {
            return;
        }
        if (field3110 == null || field3110.capacity() < field3130.field2367) {
            field3110 = ByteBuffer.allocateDirect(field3130.field2367).order(ByteOrder.nativeOrder());
        } else {
            field3110.clear();
        }
        field3110.put(field3130.field2359, 0, field3130.field2367);
        field3110.flip();
        class90.method622(arg1 - 100.0F);
        class90.method619();
        var18.glDrawElements(4, field3130.field2367 / 4, 5125, field3110);
        class90.method642();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIFFFIF)I", line = 338)
    public final int method1356(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class69 var11 = (class69) this.field3132.method493(var9, 81);
            if (var11 != null) {
                if (arg1 < this.field3131[var11.field919]) {
                    this.field3131[var11.field919] = arg1;
                }
                return var11.field919;
            }
        }
        this.field3126[this.field3118] = arg0;
        this.field3131[this.field3118] = arg1;
        this.field3128[this.field3118] = arg2;
        if (this.field3119) {
            this.field3103[this.field3118] = arg7;
        }
        this.field3102[this.field3118] = arg3;
        this.field3114[this.field3118] = arg4;
        this.field3129[this.field3118] = arg5;
        this.field3117[this.field3118] = arg6;
        if (var9 != 0L) {
            this.field3132.method490(new class69(this.field3118), var9, true);
        }
        return this.field3118++;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "()V", line = 379)
    public static void method1357() {
        field3104 = null;
        field3130 = null;
        field3115 = null;
        field3110 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III[I[IZ)I", line = 385)
    public final int method1358(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3133) {
            this.field3116[this.field3113] = arg4;
            this.field3127[this.field3113] = arg5;
            if (arg4 != null) {
                this.field3120 += arg4.length;
            }
            if (arg5) {
                this.field3120 += (arg3.length - 2) * 3;
            } else {
                this.field3121 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3121 += (arg3.length - 2) * 3;
        }
        this.field3109[this.field3113] = arg0;
        this.field3112[this.field3113] = arg1;
        this.field3105[this.field3113] = arg2;
        this.field3106[this.field3113] = arg3;
        return this.field3113++;
    }
}
