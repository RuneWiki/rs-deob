import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class141 extends class32 {

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public int field2171 = 0;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Z")
    public boolean field2175 = false;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lpn;")
    private class218 field2170 = new class218();

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    private int field2193 = 0;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "Lgj;")
    public class257 field2185 = new class257();

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Z")
    private boolean field2199 = false;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    private int field2204 = 0;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "Z")
    private boolean field2210 = false;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    private int field2200;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    private int field2202;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "[Lv;")
    public class83[] field2179;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "J")
    private long field2168;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2166 = 0;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field2180 = 0;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Z")
    public static boolean field2177 = false;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "Z")
    public static boolean field2183 = false;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lie;")
    public static class99 field2176 = new class99(8);

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "[Z")
    private static boolean[] field2184 = new boolean[8];

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "[Z")
    private static boolean[] field2189 = new boolean[8];

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public static int field2187 = 2;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private static int field2191 = 0;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "Llf;")
    private static class143 field2195 = new class143(131056);

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "F")
    public static float field2211 = 1.0F;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "J")
    private long field2169;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "J")
    public long field2173;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lpn;")
    private static class218 field2167;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2212;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "[I")
    public static int[] field2190;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "[I")
    public static int[] field2192;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "[Lv;")
    public static class83[] field2178;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "[[S")
    public static short[][] field2186;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "[[S")
    public static short[][] field2188;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Luj;Z[I[I[I)V", line = 9)
    private final void method970(class160[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2189[var6] = false;
        }
        label79: for (class165 var7 = (class165) this.field2170.method1522((byte) -49); var7 != null; var7 = (class165) this.field2170.method1518(25127)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field2537) {
                        field2189[var8] = true;
                        var7.field2553 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2548 == 0) {
                    var7.method222((byte) -105);
                    this.field2193--;
                } else {
                    var7.field2553 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2193 != 8; var9++) {
            if (!field2189[var9]) {
                class165 var10 = new class165(arg0[var9], this, this.field2173);
                this.field2170.method1519(128, var10);
                this.field2193++;
                field2189[var9] = true;
            }
        }
        for (class165 var11 = (class165) this.field2170.method1522((byte) -49); var11 != null; var11 = (class165) this.field2170.method1518(25127)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2189[var12] && arg0[var12] == var11.field2537) {
                    var11.method1182(arg2[var11.field2537.field2469], arg2[var11.field2537.field2465], arg2[var11.field2537.field2467], arg3[var11.field2537.field2467], arg3[var11.field2537.field2469], arg4[var11.field2537.field2467], arg4[var11.field2537.field2465], arg4[var11.field2537.field2469], (byte) -113, arg3[var11.field2537.field2465]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V", line = 104)
    public static final void method971() {
        GL var0 = class272.field4310;
        if (class290.field4566) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class272.field4293) {
            var0.glEnable(2912);
        }
        if (field2177) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I", line = 126)
    public final int method972() {
        if (this.field2208 == this.field2206 && this.field2207 == this.field2203) {
            return 92;
        }
        int var1 = this.field2206 << 7;
        int var2 = (this.field2208 << 7) + 128;
        int var3 = this.field2203 << 7;
        int var4 = (this.field2207 << 7) + 128;
        int var5 = this.field2198 - var1;
        int var6 = var2 - this.field2198;
        if (var5 > var6) {
            int var7 = this.field2197 - var3;
            int var8 = var4 - this.field2197;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field2197 - var3;
            int var10 = var4 - this.field2197;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 171)
    public final void method973(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class290.field4566) {
            arg0.glDisable(2896);
        }
        field2195.field2295 = 0;
        if (class272.field4318) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field2192[var5] > 32 ? 32 : field2192[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class83 var8 = this.field2179[field2188[var5][var7]];
                        field2195.method1053((byte) 109, (float) (var8.field1079 >> 12));
                        field2195.method1053((byte) 92, (float) (var8.field1078 >> 12));
                        field2195.method1053((byte) 91, (float) (var8.field1083 >> 12));
                        int var9 = var8.field1087;
                        field2195.method1055((byte) (var9 >> 16), 98);
                        field2195.method1055((byte) (var9 >> 8), 92);
                        field2195.method1055((byte) var9, 109);
                        field2195.method1055((byte) (var9 >> 24), 120);
                    }
                    if (field2192[var5] > 32) {
                        int var10 = field2192[var5] - 32 - 1;
                        for (int var11 = field2190[var10] - 1; var11 >= 0; var11--) {
                            class83 var12 = this.field2179[field2186[var10][var11]];
                            field2195.method1053((byte) 119, (float) (var12.field1079 >> 12));
                            field2195.method1053((byte) 126, (float) (var12.field1078 >> 12));
                            field2195.method1053((byte) 114, (float) (var12.field1083 >> 12));
                            int var13 = var12.field1087;
                            field2195.method1055((byte) (var13 >> 16), 109);
                            field2195.method1055((byte) (var13 >> 8), 91);
                            field2195.method1055((byte) var13, 123);
                            field2195.method1055((byte) (var13 >> 24), 79);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field2192[var14] > 32 ? 32 : field2192[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class83 var17 = this.field2179[field2188[var14][var16]];
                        field2195.method1060((byte) 47, (float) (var17.field1079 >> 12));
                        field2195.method1060((byte) 47, (float) (var17.field1078 >> 12));
                        field2195.method1060((byte) 47, (float) (var17.field1083 >> 12));
                        int var18 = var17.field1087;
                        field2195.method1055((byte) (var18 >> 16), 104);
                        field2195.method1055((byte) (var18 >> 8), 87);
                        field2195.method1055((byte) var18, 108);
                        field2195.method1055((byte) (var18 >> 24), 121);
                    }
                    if (field2192[var14] > 32) {
                        int var19 = field2192[var14] - 32 - 1;
                        for (int var20 = field2190[var19] - 1; var20 >= 0; var20--) {
                            class83 var21 = this.field2179[field2186[var19][var20]];
                            field2195.method1060((byte) 47, (float) (var21.field1079 >> 12));
                            field2195.method1060((byte) 47, (float) (var21.field1078 >> 12));
                            field2195.method1060((byte) 47, (float) (var21.field1083 >> 12));
                            int var22 = var21.field1087;
                            field2195.method1055((byte) (var22 >> 16), 120);
                            field2195.method1055((byte) (var22 >> 8), 109);
                            field2195.method1055((byte) var22, 112);
                            field2195.method1055((byte) (var22 >> 24), 92);
                        }
                    }
                }
            }
        }
        if (field2195.field2295 != 0) {
            if (class272.field4302) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field2212 == null || field2212.capacity() < field2195.field2295) {
                field2212 = ByteBuffer.allocateDirect(field2195.field2295).order(ByteOrder.nativeOrder());
            } else {
                field2212.clear();
            }
            field2212.put(field2195.field2260, 0, field2195.field2295);
            field2212.flip();
            field2212.position(0);
            arg0.glVertexPointer(3, 5126, 16, field2212);
            field2212.position(12);
            arg0.glColorPointer(4, 5121, 16, field2212);
            arg0.glDrawArrays(0, 0, field2195.field2295 >> 4);
        }
        if (!arg3 && class290.field4566) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lud;Z[I[I[I)V", line = 324)
    private final void method974(class312[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2184[var6] = false;
        }
        label88: for (class63 var7 = (class63) this.field2185.method1812(1); var7 != null; var7 = (class63) this.field2185.method1809(128)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field758) {
                        field2184[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method1290(110);
                this.field2204--;
                if (var7.method1823(32767)) {
                    var7.method1829((byte) -74);
                    field2191--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2204 != 8; var9++) {
            if (!field2184[var9]) {
                class63 var10 = null;
                if (arg0[var9].field4890.field2332 == 1 && field2191 < 32) {
                    var10 = new class63(arg0[var9], this);
                    field2176.method632((byte) 39, (long) arg0[var9].field4890.field2339, var10);
                    field2191++;
                }
                if (var10 == null) {
                    var10 = new class63(arg0[var9], this);
                }
                this.field2185.method1814(var10, true);
                this.field2204++;
                field2184[var9] = true;
            }
        }
        for (class63 var11 = (class63) this.field2185.method1812(1); var11 != null; var11 = (class63) this.field2185.method1809(128)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2184[var12] && arg0[var12] == var11.field758) {
                    var11.method388(arg3[var11.field758.field4887], arg4[var11.field758.field4887], -25, arg2[var11.field758.field4887]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V", line = 431)
    public static final void method975() {
        field2176 = new class99(8);
        field2191 = 0;
        for (class141 var0 = (class141) field2167.method1522((byte) -49); var0 != null; var0 = (class141) field2167.method1518(25127)) {
            var0.method987();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V", line = 444)
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method984(arg0, arg1, class245.field3859 + arg2, class36.field415 + arg3, class42.field457 + arg4);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(J)Z", line = 452)
    private final boolean method977(long arg0) {
        long var3;
        if (this.field2168 > this.field2169) {
            var3 = this.field2168;
        } else {
            var3 = this.field2169;
        }
        int var5 = (int) (this.field2173 - var3);
        if (var5 > 750) {
            this.method987();
            return false;
        }
        if (this.field2169 > 0L) {
            this.field2206 = this.field2198 - (this.field2200 << 6) >> 7;
            this.field2208 = ((this.field2200 << 6) + this.field2198 >> 7) - 1;
            this.field2203 = this.field2197 - (this.field2202 << 6) >> 7;
            this.field2207 = ((this.field2202 << 6) + this.field2197 >> 7) - 1;
            this.field2209 = this.field2213;
            if (this.field2205 < 3) {
                this.field2196 = class72.field902[this.field2205 + 1][this.field2208][this.field2203] + class72.field902[this.field2205 + 1][this.field2206][this.field2203] + class72.field902[this.field2205 + 1][this.field2206][this.field2207] + class72.field902[this.field2205 + 1][this.field2208][this.field2207] >> 2;
            } else {
                this.field2196 = this.field2209 - 1024;
            }
            this.field2199 = true;
            int var6 = class104.field1426[this.field2201];
            int var7 = class104.field1435[this.field2201];
            this.method989(var6, var7);
            if (this.field2210) {
                class165 var8 = (class165) this.field2170.method1522((byte) -49);
                while (true) {
                    if (var8 == null) {
                        this.field2210 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2557.field1858; var9++) {
                        var8.method1183(1, var7, true, (byte) 6, this.field2173, var6);
                    }
                    var8 = (class165) this.field2170.method1518(25127);
                }
            }
            int var10 = (int) (arg0 - this.field2173);
            for (class165 var11 = (class165) this.field2170.method1522((byte) -49); var11 != null; var11 = (class165) this.field2170.method1518(25127)) {
                var11.method1183(var10, var7, var5 < 10, (byte) 6, arg0, var6);
            }
        }
        this.field2173 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lnk;)V", line = 524)
    public static final void method978(class16 arg0) {
        field2174 = 0;
        field2166 = 0;
        field2167 = new class218();
        field2178 = new class83[1024];
        class242.method1716(0, arg0);
        class136.method937(arg0, 10570);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(J)V", line = 532)
    public static final void method979(long arg0) {
        field2180 = field2172;
        field2165 = 0;
        field2172 = 0;
        long var2 = class9.method57(-14133);
        for (class141 var4 = (class141) field2167.method1522((byte) -49); var4 != null; var4 = (class141) field2167.method1518(25127)) {
            if (var4.method977(arg0)) {
                field2165++;
            }
        }
        if (field2183 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2167.method1521(14) + ", running: " + field2165 + ". Particles: " + field2172 + ". Time taken: " + (class9.method57(-14133) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(III)V", line = 963)
    public class141(int arg0, int arg1, int arg2) {
        this.field2200 = arg1;
        this.field2202 = arg2;
        this.field2179 = new class83[8192];
        this.field2168 = (long) arg0;
        this.field2210 = true;
        field2167.method1519(128, this);
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()I", line = 561)
    public static final int method980() {
        return field2187;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIII)V", line = 564)
    public final void method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2175 || !this.field2199 || !class272.field4317) {
            return;
        }
        GL var10 = class272.field4310;
        int var11 = class245.field3859;
        int var12 = class36.field415;
        int var13 = class42.field457;
        method990(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method972();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field2209 - this.field2196) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field2183) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method971();
            return;
        }
        class32 var20 = this.field2170.field3286;
        for (class32 var21 = var20.field369; var21 != var20; var21 = var21.field369) {
            class165 var22 = (class165) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field2192[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field2190[var24] = 0;
            }
            field2194 = 0;
            class32 var25 = var22.field2533.field3286;
            for (class32 var26 = var25.field369; var26 != var25; var26 = var26.field369) {
                class83 var27 = (class83) var26;
                if (!var27.field1089) {
                    int var28 = (var27.field1079 >> 12) - var11;
                    int var29 = (var27.field1078 >> 12) - var12;
                    int var30 = (var27.field1083 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field2192[var32] < 32) {
                        field2188[var32][field2192[var32]++] = var27.field1075;
                    } else {
                        if (field2192[var32] == 32) {
                            if (field2194 == 32) {
                                if (field2183) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field2192[var32] += field2194++ + 1;
                        }
                        short[] var10000 = field2186[field2192[var32] - 32 - 1];
                        int var10002 = field2192[var32] - 32 - 1;
                        int var10004 = field2190[field2192[var32] - 32 - 1];
                        field2190[var10002] = field2190[field2192[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field1075;
                    }
                }
            }
            boolean var33 = false;
            if (field2177 && var22.field2557.field1853 != -1) {
                class104.field1438.method883((byte) -20, var22.field2557.field1853);
                var33 = true;
            } else {
                class272.method1965(-1);
            }
            float var34 = (float) var22.field2557.field1811 * field2211;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method973(var10, var19, var33, var22.field2557.field1804);
        }
        method971();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 706)
    public static final void method982(int arg0, int arg1) {
        field2211 = (float) arg1 / 334.0F;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Luj;[Lud;Z[I[I[I)V", line = 710)
    public final void method983(class160[] arg0, class312[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2175) {
            this.method970(arg0, arg2, arg3, arg4, arg5);
            this.method974(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIII)V", line = 718)
    public final void method984(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2175) {
            return;
        }
        if (this.field2201 != arg0) {
            for (class165 var6 = (class165) this.field2170.method1522((byte) -49); var6 != null; var6 = (class165) this.field2170.method1518(25127)) {
                var6.field2550 = true;
            }
        }
        this.field2169 = this.field2173;
        this.field2201 = arg0;
        this.field2205 = arg1;
        this.field2198 = arg2;
        this.field2213 = arg3;
        this.field2197 = arg4;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "()V", line = 742)
    public static void method985() {
        field2167 = null;
        field2178 = null;
        field2176 = null;
        field2189 = null;
        field2184 = null;
        field2188 = (short[][]) null;
        field2186 = (short[][]) null;
        field2192 = null;
        field2190 = null;
        field2195 = null;
        field2212 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 755)
    public static final void method986(int arg0) {
        field2187 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "()V", line = 760)
    public final void method987() {
        this.field2175 = true;
        for (class63 var1 = (class63) this.field2185.method1812(1); var1 != null; var1 = (class63) this.field2185.method1809(128)) {
            if (var1.field758.field4890.field2332 == 1) {
                var1.method1829((byte) -74);
            }
        }
        this.field2179 = new class83[8192];
        this.field2171 = 0;
        this.field2170 = new class218();
        this.field2193 = 0;
        this.field2185 = new class257();
        this.field2204 = 0;
        this.method222((byte) -95);
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "()V", line = 782)
    public static final void method988() {
        GL var0 = class272.field4310;
        if (var0.isExtensionAvailable("GL_ARB_point_parameters")) {
            float[] var1 = new float[] { 1.0F, 0.0F, 5.0E-7F };
            var0.glPointParameterfvARB(33065, var1, 0);
            FloatBuffer var2 = FloatBuffer.allocate(1);
            var0.glGetFloatv(33063, var2);
            float var3 = var2.get(0);
            if (var3 > 64.0F) {
                var3 = 64.0F;
            }
            var0.glPointParameterfARB(33062, 1.0F);
            var0.glPointParameterfARB(33063, var3);
        }
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
            field2177 = true;
        }
        field2188 = new short[1600][32];
        field2186 = new short[32][768];
        field2192 = new int[1600];
        field2190 = new int[32];
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V", line = 817)
    private final void method989(int arg0, int arg1) {
        for (class63 var3 = (class63) this.field2185.method1812(1); var3 != null; var3 = (class63) this.field2185.method1809(128)) {
            var3.field749 = this.field2198 + var3.field759;
            var3.field763 = this.field2213 + var3.field757;
            var3.field751 = this.field2197 + var3.field753;
            if (this.field2201 == 0) {
                var3.field754 = var3.field758.field4890.field2345;
                var3.field760 = var3.field758.field4890.field2335;
            } else {
                int var4 = var3.field758.field4890.field2345;
                int var5 = var3.field758.field4890.field2335;
                var3.field754 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field760 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V", line = 844)
    public static final void method990(int arg0, int arg1, int arg2) {
        GL var3 = class272.field4310;
        if (field2177) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class11.method69(-110, 0, 0);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class271.field4258, 0);
        if (class290.field4566) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class272.field4293) {
            var3.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "()V", line = 867)
    public static final void method991() {
        field2188 = (short[][]) null;
        field2186 = (short[][]) null;
        field2192 = null;
        field2190 = null;
    }

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "()V", line = 876)
    public final void method992() {
        this.field2210 = true;
    }
}
