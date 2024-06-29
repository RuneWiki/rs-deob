import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class165 extends class39 {

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public int field2942 = 0;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Z")
    public boolean field2946 = false;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lbd;")
    private class311 field2936 = new class311();

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    private int field2958 = 0;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "Laj;")
    public class1 field2956 = new class1();

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Z")
    private boolean field2959 = false;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "Z")
    private boolean field2962 = false;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    private int field2973 = 0;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    private int field2961;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "[Lkf;")
    public class226[] field2948;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "J")
    private long field2934;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Z")
    public static boolean field2935 = false;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field2940 = 0;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2949 = 0;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Z")
    public static boolean field2943 = false;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Ldb;")
    public static class187 field2938 = new class187(8);

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "[Z")
    private static boolean[] field2951 = new boolean[8];

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "[Z")
    private static boolean[] field2952 = new boolean[8];

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    private static int field2957 = 0;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public static int field2968 = 2;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "Lrm;")
    private static class249 field2969 = new class249(131056);

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "J")
    public long field2933;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "J")
    private long field2937;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lbd;")
    private static class311 field2944;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2947;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "[I")
    public static int[] field2954;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "[I")
    public static int[] field2978;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "[Lkf;")
    public static class226[] field2950;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[[S")
    public static short[][] field2955;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "[[S")
    public static short[][] field2972;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIII)V", line = 8)
    public final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2946 || !this.field2962 || !class231.field4051) {
            return;
        }
        GL var10 = class231.field4052;
        int var11 = class1.field10;
        int var12 = class260.field4592;
        int var13 = class311.field5381;
        method1159(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16;
        if (this.field2975 == this.field2974 && this.field2970 == this.field2966) {
            var16 = 92;
        } else {
            int var17 = this.field2974 << 7;
            int var18 = (this.field2975 << 7) + 128;
            int var19 = this.field2966 << 7;
            int var20 = (this.field2970 << 7) + 128;
            int var21 = this.field2964 - var17;
            int var22 = var18 - this.field2964;
            if (var21 > var22) {
                int var23 = this.field2971 - var19;
                int var24 = var20 - this.field2971;
                if (var23 > var24) {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var23 * var23)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var24 * var24)) + 0.99D);
                }
            } else {
                int var25 = this.field2971 - var19;
                int var26 = var20 - this.field2971;
                if (var25 > var26) {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var25 * var25)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var26 * var26)) + 0.99D);
                }
            }
        }
        int var27 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var28 = (-var16 * arg2 - (this.field2965 - this.field2977) * arg1 >> 16) + var15;
        int var29 = var27 + 2 - var28;
        if (var29 >= 1600) {
            if (field2943) {
                System.out.println("Model too big for particles - radixsize:" + var29 + " maxmodelsize:" + 1600);
            }
            var10.glDepthMask(true);
            var10.glColorMaterial(1028, 5634);
            return;
        }
        class39 var30 = this.field2936.field5379;
        for (class39 var31 = var30.field549; var31 != var30; var31 = var31.field549) {
            class126 var32 = (class126) var31;
            for (int var33 = 0; var33 < var29; var33++) {
                field2978[var33] = 0;
            }
            for (int var34 = 0; var34 < 32; var34++) {
                field2954[var34] = 0;
            }
            field2953 = 0;
            class39 var35 = var32.field2147.field5379;
            for (class39 var36 = var35.field549; var36 != var35; var36 = var36.field549) {
                class226 var37 = (class226) var36;
                if (!var37.field3978) {
                    int var38 = (var37.field3969 >> 12) - var11;
                    int var39 = (var37.field3975 >> 12) - var12;
                    int var40 = (var37.field3971 >> 12) - var13;
                    int var41 = arg4 * var40 - arg3 * var38 >> 16;
                    int var42 = (arg1 * var39 + arg2 * var41 >> 16) - var28;
                    if (var42 < 0) {
                        var42 = 0;
                    } else if (var42 >= var29) {
                        var42 = var29 - 1;
                    }
                    if (field2978[var42] < 32) {
                        field2955[var42][field2978[var42]++] = var37.field3968;
                    } else {
                        if (field2978[var42] == 32) {
                            if (field2953 == 32) {
                                if (field2943) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field2978[var42] += field2953++ + 1;
                        }
                        short[] var10000 = field2972[field2978[var42] - 32 - 1];
                        int var10002 = field2978[var42] - 32 - 1;
                        int var10004 = field2954[field2978[var42] - 32 - 1];
                        field2954[var10002] = field2954[field2978[var42] - 32 - 1] + 1;
                        var10000[var10004] = var37.field3968;
                    }
                }
            }
            boolean var43 = false;
            if (field2935 && var32.field2127.field3297 != -1) {
                class263.field4661.method583(22259, var32.field2127.field3297);
                var43 = true;
            } else {
                class231.method1597(-1);
            }
            var10.glPointSize((float) var32.field2127.field3324);
            this.method1144(var10, var29, var43, var32.field2127.field3261);
        }
        method1153();
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()V", line = 185)
    public static void method1140() {
        field2944 = null;
        field2950 = null;
        field2938 = null;
        field2951 = null;
        field2952 = null;
        field2955 = (short[][]) null;
        field2972 = (short[][]) null;
        field2978 = null;
        field2954 = null;
        field2969 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Leh;[Lue;Z[I[I[I)V", line = 197)
    public final void method1141(class170[] arg0, class15[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2946) {
            this.method1156(arg0, arg2, arg3, arg4, arg5);
            this.method1146(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V", line = 204)
    public final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1157(arg0, arg1, class1.field10 + arg2, class260.field4592 + arg3, class311.field5381 + arg4);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()V", line = 207)
    public static final void method1143() {
        field2938 = new class187(8);
        field2957 = 0;
        for (class165 var0 = (class165) field2944.method2166(9448); var0 != null; var0 = (class165) field2944.method2167(0)) {
            var0.method1158();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 221)
    public final void method1144(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            arg0.glDisable(2896);
        }
        field2969.field4314 = 0;
        if (class231.field4068) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field2978[var5] > 32 ? 32 : field2978[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class226 var8 = this.field2948[field2955[var5][var7]];
                        field2969.method1743((byte) 65, (float) (var8.field3969 >> 12));
                        field2969.method1743((byte) 65, (float) (var8.field3975 >> 12));
                        field2969.method1743((byte) 65, (float) (var8.field3971 >> 12));
                        int var9 = var8.field3973;
                        field2969.method1759(-32768, (byte) (var9 >> 16));
                        field2969.method1759(-32768, (byte) (var9 >> 8));
                        field2969.method1759(-32768, (byte) var9);
                        field2969.method1759(-32768, (byte) (var9 >> 24));
                    }
                    if (field2978[var5] > 32) {
                        int var10 = field2978[var5] - 32 - 1;
                        for (int var11 = field2954[var10] - 1; var11 >= 0; var11--) {
                            class226 var12 = this.field2948[field2972[var10][var11]];
                            field2969.method1743((byte) 65, (float) (var12.field3969 >> 12));
                            field2969.method1743((byte) 65, (float) (var12.field3975 >> 12));
                            field2969.method1743((byte) 65, (float) (var12.field3971 >> 12));
                            int var13 = var12.field3973;
                            field2969.method1759(-32768, (byte) (var13 >> 16));
                            field2969.method1759(-32768, (byte) (var13 >> 8));
                            field2969.method1759(-32768, (byte) var13);
                            field2969.method1759(-32768, (byte) (var13 >> 24));
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field2978[var14] > 32 ? 32 : field2978[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class226 var17 = this.field2948[field2955[var14][var16]];
                        field2969.method1722(126, (float) (var17.field3969 >> 12));
                        field2969.method1722(97, (float) (var17.field3975 >> 12));
                        field2969.method1722(82, (float) (var17.field3971 >> 12));
                        int var18 = var17.field3973;
                        field2969.method1759(-32768, (byte) (var18 >> 16));
                        field2969.method1759(-32768, (byte) (var18 >> 8));
                        field2969.method1759(-32768, (byte) var18);
                        field2969.method1759(-32768, (byte) (var18 >> 24));
                    }
                    if (field2978[var14] > 32) {
                        int var19 = field2978[var14] - 32 - 1;
                        for (int var20 = field2954[var19] - 1; var20 >= 0; var20--) {
                            class226 var21 = this.field2948[field2972[var19][var20]];
                            field2969.method1722(127, (float) (var21.field3969 >> 12));
                            field2969.method1722(-36, (float) (var21.field3975 >> 12));
                            field2969.method1722(-120, (float) (var21.field3971 >> 12));
                            int var22 = var21.field3973;
                            field2969.method1759(-32768, (byte) (var22 >> 16));
                            field2969.method1759(-32768, (byte) (var22 >> 8));
                            field2969.method1759(-32768, (byte) var22);
                            field2969.method1759(-32768, (byte) (var22 >> 24));
                        }
                    }
                }
            }
        }
        if (field2969.field4314 != 0) {
            if (class231.field4060) {
                arg0.glBindBufferARB(34962, 0);
            }
            this.field2947 = ByteBuffer.allocateDirect(field2969.field4314).order(ByteOrder.nativeOrder());
            this.field2947.put(field2969.field4338, 0, field2969.field4314);
            this.field2947.flip();
            this.field2947.position(0);
            arg0.glVertexPointer(3, 5126, 16, this.field2947);
            this.field2947.position(12);
            arg0.glColorPointer(4, 5121, 16, this.field2947);
            arg0.glDrawArrays(0, 0, field2969.field4314 >> 4);
        }
        if (!arg3) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()I", line = 369)
    public static final int method1145() {
        return field2968;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lue;Z[I[I[I)V", line = 380)
    private final void method1146(class15[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2952[var6] = false;
        }
        label73: for (class105 var7 = (class105) this.field2956.method13(0); var7 != null; var7 = (class105) this.field2956.method15((byte) 47)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field1815) {
                        field2952[var8] = true;
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var7.method1325(0);
                this.field2973--;
                if (var7.method647((byte) 106)) {
                    var7.method648(26562);
                    field2957--;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field2973 != 8; var9++) {
                if (!field2952[var9]) {
                    class105 var10 = null;
                    if (arg0[var9].field199.field1170 == 1 && field2957 < 32) {
                        var10 = new class105(arg0[var9], this);
                        field2938.method1337(1, var10, (long) arg0[var9].field199.field1195);
                        field2957++;
                    }
                    if (var10 == null) {
                        var10 = new class105(arg0[var9], this);
                    }
                    this.field2956.method5(var10, (byte) 71);
                    this.field2973++;
                }
            }
        }
        for (class105 var11 = (class105) this.field2956.method13(0); var11 != null; var11 = (class105) this.field2956.method15((byte) 47)) {
            var11.method722(arg3[var11.field1815.field198], 1, arg4[var11.field1815.field198], arg2[var11.field1815.field198]);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(J)V", line = 473)
    public static final void method1147(long arg0) {
        field2941 = 0;
        field2940 = 0;
        long var2 = class118.method835(-1272);
        for (class165 var4 = (class165) field2944.method2166(9448); var4 != null; var4 = (class165) field2944.method2167(0)) {
            if (var4.method1151(arg0)) {
                field2941++;
            }
        }
        if (field2943 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2944.method2169((byte) 18) + ", running: " + field2941 + ". Particles: " + field2940 + ". Time taken: " + (class118.method835(-1272) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "()V", line = 496)
    public static final void method1148() {
        field2955 = new short[1600][32];
        field2972 = new short[32][768];
        field2978 = new int[1600];
        field2954 = new int[32];
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "()V", line = 503)
    public static final void method1149() {
        field2955 = (short[][]) null;
        field2972 = (short[][]) null;
        field2978 = null;
        field2954 = null;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 509)
    public static final void method1150(int arg0) {
        field2968 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(J)Z", line = 513)
    private final boolean method1151(long arg0) {
        long var3;
        if (this.field2934 > this.field2937) {
            var3 = this.field2934;
        } else {
            var3 = this.field2937;
        }
        int var5 = (int) (this.field2933 - var3);
        if (var5 > 750) {
            this.method1158();
            return false;
        }
        if (this.field2937 > 0L) {
            this.field2974 = this.field2964 - (this.field2960 << 6) >> 7;
            this.field2975 = ((this.field2960 << 6) + this.field2964 >> 7) - 1;
            this.field2966 = this.field2971 - (this.field2961 << 6) >> 7;
            this.field2970 = ((this.field2961 << 6) + this.field2971 >> 7) - 1;
            this.field2965 = this.field2967;
            if (this.field2976 < 3) {
                this.field2977 = class278.field4883[this.field2976 + 1][this.field2975][this.field2966] + class278.field4883[this.field2976 + 1][this.field2974][this.field2966] + class278.field4883[this.field2976 + 1][this.field2974][this.field2970] + class278.field4883[this.field2976 + 1][this.field2975][this.field2970] >> 2;
            } else {
                this.field2977 = this.field2965 - 1024;
            }
            this.field2962 = true;
            int var6 = class263.field4653[this.field2963];
            int var7 = class263.field4649[this.field2963];
            this.method1154(var6, var7);
            if (this.field2959) {
                class126 var8 = (class126) this.field2936.method2166(9448);
                while (true) {
                    if (var8 == null) {
                        this.field2959 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2127.field3321; var9++) {
                        var8.method866(true, var7, 1, var6, this.field2933, (byte) -107);
                    }
                    var8 = (class126) this.field2936.method2167(0);
                }
            }
            int var10 = (int) (arg0 - this.field2933);
            for (class126 var11 = (class126) this.field2936.method2166(9448); var11 != null; var11 = (class126) this.field2936.method2167(0)) {
                var11.method866(var5 < 10, var7, var10, var6, arg0, (byte) -107);
            }
        }
        this.field2933 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lik;)V", line = 588)
    public static final void method1152(class262 arg0) {
        field2932 = 0;
        field2949 = 0;
        field2944 = new class311();
        field2950 = new class226[1024];
        class291.method2085(95, arg0);
        class273.method1973(868084428, arg0);
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "()V", line = 600)
    public static final void method1153() {
        GL var0 = class231.field4052;
        var0.glEnableClientState(32885);
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 610)
    private final void method1154(int arg0, int arg1) {
        for (class105 var3 = (class105) this.field2956.method13(0); var3 != null; var3 = (class105) this.field2956.method15((byte) 47)) {
            var3.field1830 = this.field2964 + var3.field1816;
            var3.field1820 = this.field2967 + var3.field1818;
            var3.field1824 = this.field2971 + var3.field1828;
            if (this.field2963 == 0) {
                var3.field1829 = var3.field1815.field199.field1176;
                var3.field1831 = var3.field1815.field199.field1190;
            } else {
                int var4 = var3.field1815.field199.field1176;
                int var5 = var3.field1815.field199.field1190;
                var3.field1829 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field1831 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "()V", line = 638)
    public final void method1155() {
        this.field2959 = true;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III)V", line = 866)
    public class165(int arg0, int arg1, int arg2) {
        this.field2960 = arg1;
        this.field2961 = arg2;
        this.field2948 = new class226[8192];
        this.field2934 = (long) arg0;
        this.field2959 = true;
        field2944.method2171(this, 87);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Leh;Z[I[I[I)V", line = 657)
    private final void method1156(class170[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2951[var6] = false;
        }
        label64: for (class126 var7 = (class126) this.field2936.method2166(9448); var7 != null; var7 = (class126) this.field2936.method2167(0)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field2146) {
                        field2951[var8] = true;
                        var7.field2130 = false;
                        continue label64;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2110 == 0) {
                    var7.method268(17450);
                    this.field2958--;
                } else {
                    var7.field2130 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field2958 != 8; var9++) {
                if (!field2951[var9]) {
                    class126 var10 = new class126(arg0[var9], this, this.field2933);
                    this.field2936.method2171(var10, 125);
                    this.field2958++;
                }
            }
        }
        for (class126 var11 = (class126) this.field2936.method2166(9448); var11 != null; var11 = (class126) this.field2936.method2167(0)) {
            var11.method871(arg3[var11.field2146.field3048], arg4[var11.field2146.field3051], arg4[var11.field2146.field3043], arg2[var11.field2146.field3048], arg3[var11.field2146.field3051], arg2[var11.field2146.field3051], arg4[var11.field2146.field3048], 11985, arg2[var11.field2146.field3043], arg3[var11.field2146.field3043]);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIII)V", line = 736)
    public final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2946) {
            return;
        }
        if (this.field2963 != arg0) {
            for (class126 var6 = (class126) this.field2936.method2166(9448); var6 != null; var6 = (class126) this.field2936.method2167(0)) {
                var6.field2141 = true;
            }
        }
        this.field2937 = this.field2933;
        this.field2963 = arg0;
        this.field2976 = arg1;
        this.field2964 = arg2;
        this.field2967 = arg3;
        this.field2971 = arg4;
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "()V", line = 766)
    public final void method1158() {
        this.field2946 = true;
        for (class105 var1 = (class105) this.field2956.method13(0); var1 != null; var1 = (class105) this.field2956.method15((byte) 47)) {
            if (var1.field1815.field199.field1170 == 1) {
                var1.method648(26562);
            }
        }
        this.field2948 = new class226[8192];
        this.field2942 = 0;
        this.field2936 = new class311();
        this.field2958 = 0;
        this.field2956 = new class1();
        this.field2973 = 0;
        this.method268(17450);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 788)
    public static final void method1159(int arg0, int arg1, int arg2) {
        GL var3 = class231.field4052;
        var3.glDepthMask(false);
        class59.method403(0, (byte) -37, 0);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class117.field2031, 0);
        var3.glDisableClientState(32885);
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
