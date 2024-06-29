import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class168 extends class314 {

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public int field3030 = 0;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public int field3027 = 0;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public int field3035 = 0;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    private int field3034 = 0;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    private int field3049 = 0;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    private int field3039 = 0;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "F")
    private float field3046;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "Z")
    public boolean field3048;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "Z")
    private boolean field3040;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "Lmk;")
    private class288 field3051;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lvh;")
    private static class53 field3024;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Lvh;")
    private static class53 field3043;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lcd;")
    private class69 field3025;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3032;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3044;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3050;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "[F")
    private float[] field3028;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "[F")
    private float[] field3033;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "[F")
    private float[] field3041;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[F")
    private float[] field3052;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "[I")
    private int[] field3023;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
    private int[] field3029;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "[I")
    private int[] field3036;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "[I")
    private int[] field3037;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "[I")
    private int[] field3047;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "[I")
    private int[] field3053;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "[I")
    private int[] field3054;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "[Z")
    private boolean[] field3045;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "[[I")
    private int[][] field3026;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "[[I")
    private int[][] field3038;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()V", line = 9)
    public static void method1309() {
        field3024 = null;
        field3043 = null;
        field3032 = null;
        field3044 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class168(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3031 = arg0;
        this.field3046 = arg1;
        this.field3048 = arg2;
        this.field3040 = arg3;
        this.field3042 = arg4;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()V", line = 25)
    public final void method1310() {
        class53 var1 = new class53((this.field3040 ? 40 : 36) * this.field3030);
        for (int var2 = 0; var2 < this.field3030; var2++) {
            if (class97.field1808) {
                var1.method451((byte) -104, (float) this.field3036[var2]);
                var1.method451((byte) 38, (float) this.field3037[var2]);
                var1.method451((byte) 64, (float) this.field3047[var2]);
                var1.method444((byte) 46, this.field3023[var2]);
                var1.method451((byte) -113, this.field3041[var2]);
                var1.method451((byte) -113, this.field3052[var2]);
                var1.method451((byte) -120, this.field3028[var2]);
                var1.method451((byte) 125, (float) this.field3036[var2] / this.field3046);
                var1.method451((byte) -114, (float) this.field3047[var2] / this.field3046);
                if (this.field3040) {
                    var1.method451((byte) -118, this.field3033[var2]);
                }
            } else {
                var1.method459(false, (float) this.field3036[var2]);
                var1.method459(false, (float) this.field3037[var2]);
                var1.method459(false, (float) this.field3047[var2]);
                var1.method444((byte) 46, this.field3023[var2]);
                var1.method459(false, this.field3041[var2]);
                var1.method459(false, this.field3052[var2]);
                var1.method459(false, this.field3028[var2]);
                var1.method459(false, (float) this.field3036[var2] / this.field3046);
                var1.method459(false, (float) this.field3047[var2] / this.field3046);
                if (this.field3040) {
                    var1.method459(false, this.field3033[var2]);
                }
            }
        }
        if (class97.field1814) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1168, 0, var1.field1142);
            this.field3051 = new class288();
            this.field3051.method2055(var3);
        } else {
            this.field3050 = ByteBuffer.allocateDirect(var1.field1142).order(ByteOrder.nativeOrder());
            this.field3050.put(var1.field1168, 0, var1.field1142);
            this.field3050.flip();
        }
        this.field3036 = null;
        this.field3037 = null;
        this.field3047 = null;
        this.field3023 = null;
        this.field3041 = null;
        this.field3052 = null;
        this.field3028 = null;
        this.field3025 = null;
        this.field3033 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIFFFIF)I", line = 99)
    public final int method1311(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class91 var11 = (class91) this.field3025.method610(var9, -1);
            if (var11 != null) {
                if (arg1 < this.field3037[var11.field1714]) {
                    this.field3037[var11.field1714] = arg1;
                }
                return var11.field1714;
            }
        }
        this.field3036[this.field3030] = arg0;
        this.field3037[this.field3030] = arg1;
        this.field3047[this.field3030] = arg2;
        if (this.field3040) {
            this.field3033[this.field3030] = arg7;
        }
        this.field3041[this.field3030] = arg3;
        this.field3052[this.field3030] = arg4;
        this.field3028[this.field3030] = arg5;
        this.field3023[this.field3030] = arg6;
        if (var9 != 0L) {
            this.field3025.method612(false, new class91(this.field3030), var9);
        }
        return this.field3030++;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "()V", line = 131)
    public static final void method1312() {
        field3024 = null;
        field3043 = null;
        field3032 = null;
        field3044 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([[[Lpl;FZ)V", line = 142)
    public final void method1313(class191[][][] arg0, float arg1, boolean arg2) {
        if (field3024 == null || field3024.field1168.length < this.field3039 * 4) {
            field3024 = new class53(this.field3039 * 4);
        } else {
            field3024.field1142 = 0;
        }
        if (field3043 == null || field3043.field1168.length < this.field3034 * 4) {
            field3043 = new class53(this.field3034 * 4);
        } else {
            field3043.field1142 = 0;
        }
        if (class97.field1808) {
            for (int var4 = 0; var4 < this.field3049; var4++) {
                class191 var5 = arg0[this.field3053[var4]][this.field3054[var4]][this.field3029[var4]];
                if (var5 != null && var5.field3461) {
                    int[] var6 = this.field3038[var4];
                    class53 var9;
                    if (this.field3048) {
                        int[] var7 = this.field3026[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3043.method444((byte) 46, var7[var8]);
                            }
                        }
                        var9 = this.field3045[var4] ? field3043 : field3024;
                    } else {
                        var9 = field3024;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method444((byte) 46, var6[0]);
                        var9.method444((byte) 46, var6[var10]);
                        var9.method444((byte) 46, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3049; var11++) {
                class191 var12 = arg0[this.field3053[var11]][this.field3054[var11]][this.field3029[var11]];
                if (var12 != null && var12.field3461) {
                    int[] var13 = this.field3038[var11];
                    class53 var16;
                    if (this.field3048) {
                        int[] var14 = this.field3026[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3043.method484((byte) -84, var14[var15]);
                            }
                        }
                        var16 = this.field3045[var11] ? field3043 : field3024;
                    } else {
                        var16 = field3024;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method484((byte) -98, var13[0]);
                        var16.method484((byte) -103, var13[var17]);
                        var16.method484((byte) -62, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3024.field1142 == 0 && field3043.field1142 == 0) {
            return;
        }
        GL var18 = class97.field1801;
        if (this.field3031 == -1 || arg2) {
            class97.method803(-1);
            class162.method1279(0, 0, 0);
        } else {
            class27.field656.method324(this.field3031, true);
        }
        int var19 = this.field3040 ? 40 : 36;
        if (this.field3051 == null) {
            if (class97.field1814) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3050.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3050);
            this.field3050.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3050);
            if (class126.field2340) {
                this.field3050.position(16);
                var18.glNormalPointer(5126, var19, this.field3050);
            }
            this.field3050.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3050);
            if (this.field3040) {
                var18.glClientActiveTexture(class114.method923());
                this.field3050.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3050);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3051.method2058();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class126.field2340) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3040) {
                var18.glClientActiveTexture(class114.method923());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class97.field1814) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3024.field1142 != 0) {
            if (field3032 == null || field3032.capacity() < field3024.field1142) {
                field3032 = ByteBuffer.allocateDirect(field3024.field1142).order(ByteOrder.nativeOrder());
            } else {
                field3032.clear();
            }
            field3032.put(field3024.field1168, 0, field3024.field1142);
            field3032.flip();
            class97.method838(arg1);
            var18.glDrawElements(4, field3024.field1142 / 4, 5125, field3032);
        }
        if (field3043.field1142 == 0) {
            return;
        }
        if (field3044 == null || field3044.capacity() < field3043.field1142) {
            field3044 = ByteBuffer.allocateDirect(field3043.field1142).order(ByteOrder.nativeOrder());
        } else {
            field3044.clear();
        }
        field3044.put(field3043.field1168, 0, field3043.field1142);
        field3044.flip();
        class97.method838(arg1 - 100.0F);
        class97.method831();
        var18.glDrawElements(4, field3043.field1142 / 4, 5125, field3044);
        class97.method824();
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "()V", line = 355)
    public final void method1314() {
        this.field3036 = new int[this.field3035];
        this.field3037 = new int[this.field3035];
        this.field3047 = new int[this.field3035];
        if (this.field3040) {
            this.field3033 = new float[this.field3035];
        }
        this.field3023 = new int[this.field3035];
        this.field3041 = new float[this.field3035];
        this.field3052 = new float[this.field3035];
        this.field3028 = new float[this.field3035];
        this.field3054 = new int[this.field3027];
        this.field3029 = new int[this.field3027];
        this.field3053 = new int[this.field3027];
        this.field3038 = new int[this.field3027][];
        this.field3025 = new class69(class189.method1440(1, this.field3035));
        if (this.field3048) {
            this.field3026 = new int[this.field3027][];
            this.field3045 = new boolean[this.field3027];
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III[I[IZ)I", line = 379)
    public final int method1315(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3048) {
            this.field3026[this.field3049] = arg4;
            this.field3045[this.field3049] = arg5;
            if (arg4 != null) {
                this.field3034 += arg4.length;
            }
            if (arg5) {
                this.field3034 += (arg3.length - 2) * 3;
            } else {
                this.field3039 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3039 += (arg3.length - 2) * 3;
        }
        this.field3053[this.field3049] = arg0;
        this.field3054[this.field3049] = arg1;
        this.field3029[this.field3049] = arg2;
        this.field3038[this.field3049] = arg3;
        return this.field3049++;
    }
}
