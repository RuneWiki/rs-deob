import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class133 extends class184 {

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public int field2277 = 0;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    private int field2286 = 0;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public int field2278 = 0;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public int field2292 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private int field2281 = 0;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    private int field2289 = 0;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "F")
    private float field2272;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Z")
    public boolean field2270;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Z")
    private boolean field2290;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "Lof;")
    private class242 field2294;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "Lrm;")
    private static class249 field2300;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "Lrm;")
    private static class249 field2301;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "Lnd;")
    private class319 field2275;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2282;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2283;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2285;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "[F")
    private float[] field2287;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "[F")
    private float[] field2291;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "[F")
    private float[] field2296;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "[F")
    private float[] field2297;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "[I")
    private int[] field2271;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "[I")
    private int[] field2276;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "[I")
    private int[] field2280;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "[I")
    private int[] field2284;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "[I")
    private int[] field2293;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "[I")
    private int[] field2298;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "[I")
    private int[] field2299;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "[Z")
    private boolean[] field2273;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "[[I")
    private int[][] field2274;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "[[I")
    private int[][] field2295;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V", line = 8)
    public static final void method910() {
        field2301 = null;
        field2300 = null;
        field2282 = null;
        field2285 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIFFFIF)I", line = 15)
    public final int method911(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class236 var11 = (class236) this.field2294.method1676(var9, (byte) -98);
            if (var11 != null) {
                if (arg1 < this.field2298[var11.field4144]) {
                    this.field2298[var11.field4144] = arg1;
                }
                return var11.field4144;
            }
        }
        this.field2280[this.field2292] = arg0;
        this.field2298[this.field2292] = arg1;
        this.field2293[this.field2292] = arg2;
        if (this.field2290) {
            this.field2291[this.field2292] = arg7;
        }
        this.field2287[this.field2292] = arg3;
        this.field2297[this.field2292] = arg4;
        this.field2296[this.field2292] = arg5;
        this.field2299[this.field2292] = arg6;
        if (var9 != 0L) {
            this.field2294.method1681(1, new class236(this.field2292), var9);
        }
        return this.field2292++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()V", line = 52)
    public static void method912() {
        field2301 = null;
        field2300 = null;
        field2282 = null;
        field2285 = null;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IFZZI)V", line = 415)
    public class133(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2288 = arg0;
        this.field2272 = arg1;
        this.field2270 = arg2;
        this.field2290 = arg3;
        this.field2279 = arg4;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()V", line = 69)
    public final void method913() {
        this.field2280 = new int[this.field2278];
        this.field2298 = new int[this.field2278];
        this.field2293 = new int[this.field2278];
        if (this.field2290) {
            this.field2291 = new float[this.field2278];
        }
        this.field2299 = new int[this.field2278];
        this.field2287 = new float[this.field2278];
        this.field2297 = new float[this.field2278];
        this.field2296 = new float[this.field2278];
        this.field2284 = new int[this.field2277];
        this.field2271 = new int[this.field2277];
        this.field2276 = new int[this.field2277];
        this.field2274 = new int[this.field2277][];
        this.field2294 = new class242(class117.method832(this.field2278, (byte) 109));
        if (this.field2270) {
            this.field2295 = new int[this.field2277][];
            this.field2273 = new boolean[this.field2277];
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III[I[IZ)I", line = 104)
    public final int method914(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2270) {
            this.field2295[this.field2281] = arg4;
            this.field2273[this.field2281] = arg5;
            if (arg4 != null) {
                this.field2286 += arg4.length;
            }
            if (arg5) {
                this.field2286 += (arg3.length - 2) * 3;
            } else {
                this.field2289 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2289 += (arg3.length - 2) * 3;
        }
        this.field2276[this.field2281] = arg0;
        this.field2284[this.field2281] = arg1;
        this.field2271[this.field2281] = arg2;
        this.field2274[this.field2281] = arg3;
        return this.field2281++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([[[Lje;FZ)V", line = 128)
    public final void method915(class74[][][] arg0, float arg1, boolean arg2) {
        if (field2301 == null || field2301.field4338.length < this.field2289 * 4) {
            field2301 = new class249(this.field2289 * 4);
        } else {
            field2301.field4314 = 0;
        }
        if (field2300 == null || field2300.field4338.length < this.field2286 * 4) {
            field2300 = new class249(this.field2286 * 4);
        } else {
            field2300.field4314 = 0;
        }
        if (class231.field4068) {
            for (int var4 = 0; var4 < this.field2281; var4++) {
                class74 var5 = arg0[this.field2276[var4]][this.field2284[var4]][this.field2271[var4]];
                if (var5 != null && var5.field1114) {
                    int[] var6 = this.field2274[var4];
                    class249 var9;
                    if (this.field2270) {
                        int[] var7 = this.field2295[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2300.method1741(var7[var8], -1580277072);
                            }
                        }
                        var9 = this.field2273[var4] ? field2300 : field2301;
                    } else {
                        var9 = field2301;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1741(var6[0], -1580277072);
                        var9.method1741(var6[var10], -1580277072);
                        var9.method1741(var6[var10 + 1], -1580277072);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2281; var11++) {
                class74 var12 = arg0[this.field2276[var11]][this.field2284[var11]][this.field2271[var11]];
                if (var12 != null && var12.field1114) {
                    int[] var13 = this.field2274[var11];
                    class249 var16;
                    if (this.field2270) {
                        int[] var14 = this.field2295[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2300.method1745(var14[var15], -427081032);
                            }
                        }
                        var16 = this.field2273[var11] ? field2300 : field2301;
                    } else {
                        var16 = field2301;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1745(var13[0], -427081032);
                        var16.method1745(var13[var17], -427081032);
                        var16.method1745(var13[var17 + 1], -427081032);
                    }
                }
            }
        }
        if (field2301.field4314 == 0 && field2300.field4314 == 0) {
            return;
        }
        GL var18 = class231.field4052;
        if (this.field2288 == -1 || arg2) {
            class231.method1597(-1);
            class59.method403(0, (byte) -103, 0);
        } else {
            class263.field4661.method583(22259, this.field2288);
        }
        int var19 = this.field2290 ? 40 : 36;
        if (this.field2275 == null) {
            if (class231.field4060) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2283.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2283);
            this.field2283.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2283);
            if (class26.field397) {
                this.field2283.position(16);
                var18.glNormalPointer(5126, var19, this.field2283);
            }
            this.field2283.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2283);
            if (this.field2290) {
                var18.glClientActiveTexture(class150.method1066());
                this.field2283.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2283);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2275.method2215();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class26.field397) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2290) {
                var18.glClientActiveTexture(class150.method1066());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class231.field4060) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2301.field4314 != 0) {
            if (field2282 == null || field2282.capacity() < field2301.field4314) {
                field2282 = ByteBuffer.allocateDirect(field2301.field4314).order(ByteOrder.nativeOrder());
            } else {
                field2282.clear();
            }
            field2282.put(field2301.field4338, 0, field2301.field4314);
            field2282.flip();
            class231.method1581(arg1);
            var18.glDrawElements(4, field2301.field4314 / 4, 5125, field2282);
        }
        if (field2300.field4314 == 0) {
            return;
        }
        if (field2285 == null || field2285.capacity() < field2300.field4314) {
            field2285 = ByteBuffer.allocateDirect(field2300.field4314).order(ByteOrder.nativeOrder());
        } else {
            field2285.clear();
        }
        field2285.put(field2300.field4338, 0, field2300.field4314);
        field2285.flip();
        class231.method1581(arg1 - 100.0F);
        class231.method1591();
        var18.glDrawElements(4, field2300.field4314 / 4, 5125, field2285);
        class231.method1570();
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()V", line = 335)
    public final void method916() {
        class249 var1 = new class249((this.field2290 ? 40 : 36) * this.field2292);
        for (int var2 = 0; var2 < this.field2292; var2++) {
            if (class231.field4068) {
                var1.method1743((byte) 65, (float) this.field2280[var2]);
                var1.method1743((byte) 65, (float) this.field2298[var2]);
                var1.method1743((byte) 65, (float) this.field2293[var2]);
                var1.method1741(this.field2299[var2], -1580277072);
                var1.method1743((byte) 65, this.field2287[var2]);
                var1.method1743((byte) 65, this.field2297[var2]);
                var1.method1743((byte) 65, this.field2296[var2]);
                var1.method1743((byte) 65, (float) this.field2280[var2] / this.field2272);
                var1.method1743((byte) 65, (float) this.field2293[var2] / this.field2272);
                if (this.field2290) {
                    var1.method1743((byte) 65, this.field2291[var2]);
                }
            } else {
                var1.method1722(124, (float) this.field2280[var2]);
                var1.method1722(-63, (float) this.field2298[var2]);
                var1.method1722(-33, (float) this.field2293[var2]);
                var1.method1741(this.field2299[var2], -1580277072);
                var1.method1722(-127, this.field2287[var2]);
                var1.method1722(107, this.field2297[var2]);
                var1.method1722(-64, this.field2296[var2]);
                var1.method1722(-27, (float) this.field2280[var2] / this.field2272);
                var1.method1722(-60, (float) this.field2293[var2] / this.field2272);
                if (this.field2290) {
                    var1.method1722(103, this.field2291[var2]);
                }
            }
        }
        if (class231.field4060) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field4338, 0, var1.field4314);
            this.field2275 = new class319();
            this.field2275.method2211(var3);
        } else {
            this.field2283 = ByteBuffer.allocateDirect(var1.field4314).order(ByteOrder.nativeOrder());
            this.field2283.put(var1.field4338, 0, var1.field4314);
            this.field2283.flip();
        }
        this.field2280 = null;
        this.field2298 = null;
        this.field2293 = null;
        this.field2299 = null;
        this.field2287 = null;
        this.field2297 = null;
        this.field2296 = null;
        this.field2294 = null;
        this.field2291 = null;
    }
}
