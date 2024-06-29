import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class186 extends class240 {

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public int field2960 = 0;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public int field2958 = 0;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    private int field2970 = 0;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field2963 = 0;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    private int field2976 = 0;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    private int field2978 = 0;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "F")
    private float field2965;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Z")
    public boolean field2961;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Z")
    private boolean field2964;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lpe;")
    private static class101 field2951;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lpe;")
    private static class101 field2975;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Lsa;")
    private class110 field2971;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lll;")
    private class158 field2969;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2954;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2956;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2959;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[F")
    private float[] field2953;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "[F")
    private float[] field2957;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[F")
    private float[] field2967;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "[F")
    private float[] field2977;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[I")
    private int[] field2952;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[I")
    private int[] field2955;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[I")
    private int[] field2968;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "[I")
    private int[] field2972;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "[I")
    private int[] field2973;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "[I")
    private int[] field2980;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "[I")
    private int[] field2981;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[Z")
    private boolean[] field2982;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[[I")
    private int[][] field2962;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "[[I")
    private int[][] field2974;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[I[IZ)I", line = 6)
    public final int method1395(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2961) {
            this.field2974[this.field2970] = arg4;
            this.field2982[this.field2970] = arg5;
            if (arg4 != null) {
                this.field2978 += arg4.length;
            }
            if (arg5) {
                this.field2978 += (arg3.length - 2) * 3;
            } else {
                this.field2976 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2976 += (arg3.length - 2) * 3;
        }
        this.field2955[this.field2970] = arg0;
        this.field2972[this.field2970] = arg1;
        this.field2980[this.field2970] = arg2;
        this.field2962[this.field2970] = arg3;
        return this.field2970++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 31)
    public final void method1396() {
        class101 var1 = new class101((this.field2964 ? 40 : 36) * this.field2958);
        for (int var2 = 0; var2 < this.field2958; var2++) {
            if (class265.field4109) {
                var1.method744((float) this.field2952[var2], (byte) -85);
                var1.method744((float) this.field2981[var2], (byte) -85);
                var1.method744((float) this.field2968[var2], (byte) -85);
                var1.method784(84, this.field2973[var2]);
                var1.method744(this.field2977[var2], (byte) -85);
                var1.method744(this.field2967[var2], (byte) -85);
                var1.method744(this.field2953[var2], (byte) -85);
                var1.method744((float) this.field2952[var2] / this.field2965, (byte) -85);
                var1.method744((float) this.field2968[var2] / this.field2965, (byte) -85);
                if (this.field2964) {
                    var1.method744(this.field2957[var2], (byte) -85);
                }
            } else {
                var1.method765(-1, (float) this.field2952[var2]);
                var1.method765(-1, (float) this.field2981[var2]);
                var1.method765(-1, (float) this.field2968[var2]);
                var1.method784(-66, this.field2973[var2]);
                var1.method765(-1, this.field2977[var2]);
                var1.method765(-1, this.field2967[var2]);
                var1.method765(-1, this.field2953[var2]);
                var1.method765(-1, (float) this.field2952[var2] / this.field2965);
                var1.method765(-1, (float) this.field2968[var2] / this.field2965);
                if (this.field2964) {
                    var1.method765(-1, this.field2957[var2]);
                }
            }
        }
        if (class265.field4111) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1661, 0, var1.field1667);
            this.field2969 = new class158();
            this.field2969.method1185(var3);
        } else {
            this.field2956 = ByteBuffer.allocateDirect(var1.field1667).order(ByteOrder.nativeOrder());
            this.field2956.put(var1.field1661, 0, var1.field1667);
            this.field2956.flip();
        }
        this.field2952 = null;
        this.field2981 = null;
        this.field2968 = null;
        this.field2973 = null;
        this.field2977 = null;
        this.field2967 = null;
        this.field2953 = null;
        this.field2971 = null;
        this.field2957 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIFFFIF)I", line = 97)
    public final int method1397(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class250 var11 = (class250) this.field2971.method833(false, var9);
            if (var11 != null) {
                if (arg1 < this.field2981[var11.field3858]) {
                    this.field2981[var11.field3858] = arg1;
                }
                return var11.field3858;
            }
        }
        this.field2952[this.field2958] = arg0;
        this.field2981[this.field2958] = arg1;
        this.field2968[this.field2958] = arg2;
        if (this.field2964) {
            this.field2957[this.field2958] = arg7;
        }
        this.field2977[this.field2958] = arg3;
        this.field2967[this.field2958] = arg4;
        this.field2953[this.field2958] = arg5;
        this.field2973[this.field2958] = arg6;
        if (var9 != 0L) {
            this.field2971.method845(new class250(this.field2958), (byte) 98, var9);
        }
        return this.field2958++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V", line = 140)
    public final void method1398() {
        this.field2952 = new int[this.field2963];
        this.field2981 = new int[this.field2963];
        this.field2968 = new int[this.field2963];
        if (this.field2964) {
            this.field2957 = new float[this.field2963];
        }
        this.field2973 = new int[this.field2963];
        this.field2977 = new float[this.field2963];
        this.field2967 = new float[this.field2963];
        this.field2953 = new float[this.field2963];
        this.field2972 = new int[this.field2960];
        this.field2980 = new int[this.field2960];
        this.field2955 = new int[this.field2960];
        this.field2962 = new int[this.field2960][];
        this.field2971 = new class110(class210.method1532(-1429694904, this.field2963));
        if (this.field2961) {
            this.field2974 = new int[this.field2960][];
            this.field2982 = new boolean[this.field2960];
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class186(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2979 = arg0;
        this.field2965 = arg1;
        this.field2961 = arg2;
        this.field2964 = arg3;
        this.field2966 = arg4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([[[Lw;FZ)V", line = 177)
    public final void method1399(class272[][][] arg0, float arg1, boolean arg2) {
        if (field2975 == null || field2975.field1661.length < this.field2976 * 4) {
            field2975 = new class101(this.field2976 * 4);
        } else {
            field2975.field1667 = 0;
        }
        if (field2951 == null || field2951.field1661.length < this.field2978 * 4) {
            field2951 = new class101(this.field2978 * 4);
        } else {
            field2951.field1667 = 0;
        }
        if (class265.field4109) {
            for (int var4 = 0; var4 < this.field2970; var4++) {
                class272 var5 = arg0[this.field2955[var4]][this.field2972[var4]][this.field2980[var4]];
                if (var5 != null && var5.field4232) {
                    int[] var6 = this.field2962[var4];
                    class101 var9;
                    if (this.field2961) {
                        int[] var7 = this.field2974[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2951.method784(-37, var7[var8]);
                            }
                        }
                        var9 = this.field2982[var4] ? field2951 : field2975;
                    } else {
                        var9 = field2975;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method784(87, var6[0]);
                        var9.method784(-50, var6[var10]);
                        var9.method784(-119, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2970; var11++) {
                class272 var12 = arg0[this.field2955[var11]][this.field2972[var11]][this.field2980[var11]];
                if (var12 != null && var12.field4232) {
                    int[] var13 = this.field2962[var11];
                    class101 var16;
                    if (this.field2961) {
                        int[] var14 = this.field2974[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2951.method725(var14[var15], false);
                            }
                        }
                        var16 = this.field2982[var11] ? field2951 : field2975;
                    } else {
                        var16 = field2975;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method725(var13[0], false);
                        var16.method725(var13[var17], false);
                        var16.method725(var13[var17 + 1], false);
                    }
                }
            }
        }
        if (field2975.field1667 == 0 && field2951.field1667 == 0) {
            return;
        }
        GL var18 = class265.field4099;
        if (this.field2979 == -1 || arg2) {
            class265.method1889(-1);
            class308.method2132(0, (byte) -28, 0);
        } else {
            class174.field2734.method1469(this.field2979, (byte) -94);
        }
        int var19 = this.field2964 ? 40 : 36;
        if (this.field2969 == null) {
            if (class265.field4111) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2956.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2956);
            this.field2956.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2956);
            if (class302.field4753) {
                this.field2956.position(16);
                var18.glNormalPointer(5126, var19, this.field2956);
            }
            this.field2956.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2956);
            if (this.field2964) {
                var18.glClientActiveTexture(class113.method859());
                this.field2956.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2956);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2969.method1184();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class302.field4753) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2964) {
                var18.glClientActiveTexture(class113.method859());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class265.field4111) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2975.field1667 != 0) {
            if (field2954 == null || field2954.capacity() < field2975.field1667) {
                field2954 = ByteBuffer.allocateDirect(field2975.field1667).order(ByteOrder.nativeOrder());
            } else {
                field2954.clear();
            }
            field2954.put(field2975.field1661, 0, field2975.field1667);
            field2954.flip();
            class265.method1907(arg1);
            var18.glDrawElements(4, field2975.field1667 / 4, 5125, field2954);
        }
        if (field2951.field1667 == 0) {
            return;
        }
        if (field2959 == null || field2959.capacity() < field2951.field1667) {
            field2959 = ByteBuffer.allocateDirect(field2951.field1667).order(ByteOrder.nativeOrder());
        } else {
            field2959.clear();
        }
        field2959.put(field2951.field1661, 0, field2951.field1667);
        field2959.flip();
        class265.method1907(arg1 - 100.0F);
        class265.method1908();
        var18.glDrawElements(4, field2951.field1667 / 4, 5125, field2959);
        class265.method1897();
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()V", line = 397)
    public static void method1400() {
        field2975 = null;
        field2951 = null;
        field2954 = null;
        field2959 = null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()V", line = 410)
    public static final void method1401() {
        field2975 = null;
        field2951 = null;
        field2954 = null;
        field2959 = null;
    }
}
