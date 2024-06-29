import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class145 extends class79 {

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field2328 = 0;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    private int field2325 = 0;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public int field2332 = 0;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public int field2317 = 0;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    private int field2326 = 0;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public int field2335 = 0;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "F")
    private float field2324;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "Z")
    public boolean field2311;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Z")
    private boolean field2316;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Lvh;")
    private class212 field2308;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "Lfj;")
    private static class3 field2318;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lfj;")
    private static class3 field2320;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Leh;")
    private class40 field2334;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2304;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2310;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2323;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "[F")
    private float[] field2314;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "[F")
    private float[] field2321;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[F")
    private float[] field2329;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[F")
    private float[] field2331;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[I")
    private int[] field2305;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
    private int[] field2306;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[I")
    private int[] field2307;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
    private int[] field2312;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "[I")
    private int[] field2313;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
    private int[] field2319;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "[I")
    private int[] field2333;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "[Z")
    private boolean[] field2309;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "[[I")
    private int[][] field2327;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "[[I")
    private int[][] field2330;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([[[Li;FZ)V", line = 9)
    public final void method947(class104[][][] arg0, float arg1, boolean arg2) {
        if (field2318 == null || field2318.field101.length < this.field2326 * 4) {
            field2318 = new class3(this.field2326 * 4);
        } else {
            field2318.field44 = 0;
        }
        if (field2320 == null || field2320.field101.length < this.field2325 * 4) {
            field2320 = new class3(this.field2325 * 4);
        } else {
            field2320.field44 = 0;
        }
        if (class264.field4297) {
            for (int var4 = 0; var4 < this.field2328; var4++) {
                class104 var5 = arg0[this.field2319[var4]][this.field2307[var4]][this.field2305[var4]];
                if (var5 != null && var5.field1613) {
                    int[] var6 = this.field2330[var4];
                    class3 var9;
                    if (this.field2311) {
                        int[] var7 = this.field2327[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2320.method26(var7[var8], 50);
                            }
                        }
                        var9 = this.field2309[var4] ? field2320 : field2318;
                    } else {
                        var9 = field2318;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method26(var6[0], 20);
                        var9.method26(var6[var10], 107);
                        var9.method26(var6[var10 + 1], 45);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2328; var11++) {
                class104 var12 = arg0[this.field2319[var11]][this.field2307[var11]][this.field2305[var11]];
                if (var12 != null && var12.field1613) {
                    int[] var13 = this.field2330[var11];
                    class3 var16;
                    if (this.field2311) {
                        int[] var14 = this.field2327[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2320.method38(true, var14[var15]);
                            }
                        }
                        var16 = this.field2309[var11] ? field2320 : field2318;
                    } else {
                        var16 = field2318;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method38(true, var13[0]);
                        var16.method38(true, var13[var17]);
                        var16.method38(true, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field2318.field44 == 0 && field2320.field44 == 0) {
            return;
        }
        GL var18 = class264.field4313;
        if (this.field2322 == -1 || arg2) {
            class264.method1722(-1);
            class103.method677(0, 30359, 0);
        } else {
            class284.field4692.method127(this.field2322, (byte) -63);
        }
        int var19 = this.field2316 ? 40 : 36;
        if (this.field2334 == null) {
            if (class264.field4314) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2304.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2304);
            this.field2304.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2304);
            if (class6.field146) {
                this.field2304.position(16);
                var18.glNormalPointer(5126, var19, this.field2304);
            }
            this.field2304.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2304);
            if (this.field2316) {
                var18.glClientActiveTexture(class115.method729());
                this.field2304.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2304);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2334.method316();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class6.field146) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2316) {
                var18.glClientActiveTexture(class115.method729());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class264.field4314) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2318.field44 != 0) {
            if (field2310 == null || field2310.capacity() < field2318.field44) {
                field2310 = ByteBuffer.allocateDirect(field2318.field44).order(ByteOrder.nativeOrder());
            } else {
                field2310.clear();
            }
            field2310.put(field2318.field101, 0, field2318.field44);
            field2310.flip();
            class264.method1740(arg1);
            var18.glDrawElements(4, field2318.field44 / 4, 5125, field2310);
        }
        if (field2320.field44 == 0) {
            return;
        }
        if (field2323 == null || field2323.capacity() < field2320.field44) {
            field2323 = ByteBuffer.allocateDirect(field2320.field44).order(ByteOrder.nativeOrder());
        } else {
            field2323.clear();
        }
        field2323.put(field2320.field101, 0, field2320.field44);
        field2323.flip();
        class264.method1740(arg1 - 100.0F);
        class264.method1725();
        var18.glDrawElements(4, field2320.field44 / 4, 5125, field2323);
        class264.method1739();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V", line = 214)
    public static void method948() {
        field2318 = null;
        field2320 = null;
        field2310 = null;
        field2323 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V", line = 221)
    public final void method949() {
        this.field2306 = new int[this.field2317];
        this.field2312 = new int[this.field2317];
        this.field2313 = new int[this.field2317];
        if (this.field2316) {
            this.field2321 = new float[this.field2317];
        }
        this.field2333 = new int[this.field2317];
        this.field2331 = new float[this.field2317];
        this.field2314 = new float[this.field2317];
        this.field2329 = new float[this.field2317];
        this.field2307 = new int[this.field2332];
        this.field2305 = new int[this.field2332];
        this.field2319 = new int[this.field2332];
        this.field2330 = new int[this.field2332][];
        this.field2308 = new class212(class140.method925(this.field2317, (byte) 98));
        if (this.field2311) {
            this.field2327 = new int[this.field2332][];
            this.field2309 = new boolean[this.field2332];
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V", line = 248)
    public final void method950() {
        class3 var1 = new class3((this.field2316 ? 40 : 36) * this.field2335);
        for (int var2 = 0; var2 < this.field2335; var2++) {
            if (class264.field4297) {
                var1.method28((float) this.field2306[var2], 10894);
                var1.method28((float) this.field2312[var2], 10894);
                var1.method28((float) this.field2313[var2], 10894);
                var1.method26(this.field2333[var2], 97);
                var1.method28(this.field2331[var2], 10894);
                var1.method28(this.field2314[var2], 10894);
                var1.method28(this.field2329[var2], 10894);
                var1.method28((float) this.field2306[var2] / this.field2324, 10894);
                var1.method28((float) this.field2313[var2] / this.field2324, 10894);
                if (this.field2316) {
                    var1.method28(this.field2321[var2], 10894);
                }
            } else {
                var1.method44(19679, (float) this.field2306[var2]);
                var1.method44(19679, (float) this.field2312[var2]);
                var1.method44(19679, (float) this.field2313[var2]);
                var1.method26(this.field2333[var2], 56);
                var1.method44(19679, this.field2331[var2]);
                var1.method44(19679, this.field2314[var2]);
                var1.method44(19679, this.field2329[var2]);
                var1.method44(19679, (float) this.field2306[var2] / this.field2324);
                var1.method44(19679, (float) this.field2313[var2] / this.field2324);
                if (this.field2316) {
                    var1.method44(19679, this.field2321[var2]);
                }
            }
        }
        if (class264.field4314) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field101, 0, var1.field44);
            this.field2334 = new class40();
            this.field2334.method315(var3);
        } else {
            this.field2304 = ByteBuffer.allocateDirect(var1.field44).order(ByteOrder.nativeOrder());
            this.field2304.put(var1.field101, 0, var1.field44);
            this.field2304.flip();
        }
        this.field2306 = null;
        this.field2312 = null;
        this.field2313 = null;
        this.field2333 = null;
        this.field2331 = null;
        this.field2314 = null;
        this.field2329 = null;
        this.field2308 = null;
        this.field2321 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIFFFIF)I", line = 317)
    public final int method951(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class204 var11 = (class204) this.field2308.method1329((byte) 90, var9);
            if (var11 != null) {
                if (arg1 < this.field2312[var11.field3230]) {
                    this.field2312[var11.field3230] = arg1;
                }
                return var11.field3230;
            }
        }
        this.field2306[this.field2335] = arg0;
        this.field2312[this.field2335] = arg1;
        this.field2313[this.field2335] = arg2;
        if (this.field2316) {
            this.field2321[this.field2335] = arg7;
        }
        this.field2331[this.field2335] = arg3;
        this.field2314[this.field2335] = arg4;
        this.field2329[this.field2335] = arg5;
        this.field2333[this.field2335] = arg6;
        if (var9 != 0L) {
            this.field2308.method1326(var9, (byte) -127, new class204(this.field2335));
        }
        return this.field2335++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[I[IZ)I", line = 352)
    public final int method952(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2311) {
            this.field2327[this.field2328] = arg4;
            this.field2309[this.field2328] = arg5;
            if (arg4 != null) {
                this.field2325 += arg4.length;
            }
            if (arg5) {
                this.field2325 += (arg3.length - 2) * 3;
            } else {
                this.field2326 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2326 += (arg3.length - 2) * 3;
        }
        this.field2319[this.field2328] = arg0;
        this.field2307[this.field2328] = arg1;
        this.field2305[this.field2328] = arg2;
        this.field2330[this.field2328] = arg3;
        return this.field2328++;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IFZZI)V", line = 411)
    public class145(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2322 = arg0;
        this.field2324 = arg1;
        this.field2311 = arg2;
        this.field2316 = arg3;
        this.field2315 = arg4;
    }
}
