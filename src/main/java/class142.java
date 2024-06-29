import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class142 extends class208 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    private int field2352 = 0;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    private int field2356 = 0;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public int field2359 = 0;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    private int field2351 = 0;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public int field2362 = 0;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public int field2373 = 0;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "F")
    private float field2370;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Z")
    public boolean field2371;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
    private boolean field2349;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "Lhj;")
    private class28 field2376;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Lff;")
    private class47 field2361;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Lpb;")
    private static class70 field2363;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "Lpb;")
    private static class70 field2365;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2369;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2375;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2377;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "[F")
    private float[] field2348;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "[F")
    private float[] field2353;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "[F")
    private float[] field2354;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "[F")
    private float[] field2368;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "[I")
    private int[] field2347;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "[I")
    private int[] field2355;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "[I")
    private int[] field2358;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[I")
    private int[] field2360;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "[I")
    private int[] field2364;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "[I")
    private int[] field2372;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "[I")
    private int[] field2374;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[Z")
    private boolean[] field2350;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "[[I")
    private int[][] field2357;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "[[I")
    private int[][] field2366;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V", line = 6)
    public final void method1054() {
        this.field2358 = new int[this.field2362];
        this.field2374 = new int[this.field2362];
        this.field2372 = new int[this.field2362];
        if (this.field2349) {
            this.field2348 = new float[this.field2362];
        }
        this.field2360 = new int[this.field2362];
        this.field2368 = new float[this.field2362];
        this.field2354 = new float[this.field2362];
        this.field2353 = new float[this.field2362];
        this.field2364 = new int[this.field2359];
        this.field2347 = new int[this.field2359];
        this.field2355 = new int[this.field2359];
        this.field2366 = new int[this.field2359][];
        this.field2361 = new class47(class287.method2033(this.field2362, -1410546649));
        if (this.field2371) {
            this.field2357 = new int[this.field2359][];
            this.field2350 = new boolean[this.field2359];
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()V", line = 42)
    public final void method1055() {
        class70 var1 = new class70((this.field2349 ? 40 : 36) * this.field2373);
        for (int var2 = 0; var2 < this.field2373; var2++) {
            if (class281.field4816) {
                var1.method428((float) this.field2358[var2], (byte) -121);
                var1.method428((float) this.field2374[var2], (byte) -122);
                var1.method428((float) this.field2372[var2], (byte) -124);
                var1.method436(this.field2360[var2], -18820);
                var1.method428(this.field2368[var2], (byte) -124);
                var1.method428(this.field2354[var2], (byte) -120);
                var1.method428(this.field2353[var2], (byte) -121);
                var1.method428((float) this.field2358[var2] / this.field2370, (byte) -122);
                var1.method428((float) this.field2372[var2] / this.field2370, (byte) -123);
                if (this.field2349) {
                    var1.method428(this.field2348[var2], (byte) -124);
                }
            } else {
                var1.method475((byte) -61, (float) this.field2358[var2]);
                var1.method475((byte) -61, (float) this.field2374[var2]);
                var1.method475((byte) -61, (float) this.field2372[var2]);
                var1.method436(this.field2360[var2], -18820);
                var1.method475((byte) -61, this.field2368[var2]);
                var1.method475((byte) -61, this.field2354[var2]);
                var1.method475((byte) -61, this.field2353[var2]);
                var1.method475((byte) -61, (float) this.field2358[var2] / this.field2370);
                var1.method475((byte) -61, (float) this.field2372[var2] / this.field2370);
                if (this.field2349) {
                    var1.method475((byte) -61, this.field2348[var2]);
                }
            }
        }
        if (class281.field4820) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1066, 0, var1.field1068);
            this.field2376 = new class28();
            this.field2376.method156(var3);
        } else {
            this.field2375 = ByteBuffer.allocateDirect(var1.field1068).order(ByteOrder.nativeOrder());
            this.field2375.put(var1.field1066, 0, var1.field1068);
            this.field2375.flip();
        }
        this.field2358 = null;
        this.field2374 = null;
        this.field2372 = null;
        this.field2360 = null;
        this.field2368 = null;
        this.field2354 = null;
        this.field2353 = null;
        this.field2361 = null;
        this.field2348 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IFZZI)V", line = 416)
    public class142(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2346 = arg0;
        this.field2370 = arg1;
        this.field2371 = arg2;
        this.field2349 = arg3;
        this.field2367 = arg4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III[I[IZ)I", line = 113)
    public final int method1056(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2371) {
            this.field2357[this.field2352] = arg4;
            this.field2350[this.field2352] = arg5;
            if (arg4 != null) {
                this.field2351 += arg4.length;
            }
            if (arg5) {
                this.field2351 += (arg3.length - 2) * 3;
            } else {
                this.field2356 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2356 += (arg3.length - 2) * 3;
        }
        this.field2355[this.field2352] = arg0;
        this.field2364[this.field2352] = arg1;
        this.field2347[this.field2352] = arg2;
        this.field2366[this.field2352] = arg3;
        return this.field2352++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIFFFIF)I", line = 137)
    public final int method1057(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class172 var11 = (class172) this.field2361.method280(var9, 29153);
            if (var11 != null) {
                if (arg1 < this.field2374[var11.field2849]) {
                    this.field2374[var11.field2849] = arg1;
                }
                return var11.field2849;
            }
        }
        this.field2358[this.field2373] = arg0;
        this.field2374[this.field2373] = arg1;
        this.field2372[this.field2373] = arg2;
        if (this.field2349) {
            this.field2348[this.field2373] = arg7;
        }
        this.field2368[this.field2373] = arg3;
        this.field2354[this.field2373] = arg4;
        this.field2353[this.field2373] = arg5;
        this.field2360[this.field2373] = arg6;
        if (var9 != 0L) {
            this.field2361.method284(true, var9, new class172(this.field2373));
        }
        return this.field2373++;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()V", line = 169)
    public static final void method1058() {
        field2363 = null;
        field2365 = null;
        field2369 = null;
        field2377 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()V", line = 181)
    public static void method1059() {
        field2363 = null;
        field2365 = null;
        field2369 = null;
        field2377 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([[[Lsc;FZ)V", line = 206)
    public final void method1060(class249[][][] arg0, float arg1, boolean arg2) {
        if (field2363 == null || field2363.field1066.length < this.field2356 * 4) {
            field2363 = new class70(this.field2356 * 4);
        } else {
            field2363.field1068 = 0;
        }
        if (field2365 == null || field2365.field1066.length < this.field2351 * 4) {
            field2365 = new class70(this.field2351 * 4);
        } else {
            field2365.field1068 = 0;
        }
        if (class281.field4816) {
            for (int var4 = 0; var4 < this.field2352; var4++) {
                class249 var5 = arg0[this.field2355[var4]][this.field2364[var4]][this.field2347[var4]];
                if (var5 != null && var5.field4187) {
                    int[] var6 = this.field2366[var4];
                    class70 var9;
                    if (this.field2371) {
                        int[] var7 = this.field2357[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2365.method436(var7[var8], -18820);
                            }
                        }
                        var9 = this.field2350[var4] ? field2365 : field2363;
                    } else {
                        var9 = field2363;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method436(var6[0], -18820);
                        var9.method436(var6[var10], -18820);
                        var9.method436(var6[var10 + 1], -18820);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2352; var11++) {
                class249 var12 = arg0[this.field2355[var11]][this.field2364[var11]][this.field2347[var11]];
                if (var12 != null && var12.field4187) {
                    int[] var13 = this.field2366[var11];
                    class70 var16;
                    if (this.field2371) {
                        int[] var14 = this.field2357[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2365.method450(var14[var15], 123);
                            }
                        }
                        var16 = this.field2350[var11] ? field2365 : field2363;
                    } else {
                        var16 = field2363;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method450(var13[0], 127);
                        var16.method450(var13[var17], 125);
                        var16.method450(var13[var17 + 1], -111);
                    }
                }
            }
        }
        if (field2363.field1068 == 0 && field2365.field1068 == 0) {
            return;
        }
        GL var18 = class281.field4839;
        if (this.field2346 == -1 || arg2) {
            class281.method1953(-1);
            class256.method1795(0, 0, -536);
        } else {
            class283.field4866.method995(-13854, this.field2346);
        }
        int var19 = this.field2349 ? 40 : 36;
        if (this.field2376 == null) {
            if (class281.field4820) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2375.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2375);
            this.field2375.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2375);
            if (class114.field1921) {
                this.field2375.position(16);
                var18.glNormalPointer(5126, var19, this.field2375);
            }
            this.field2375.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2375);
            if (this.field2349) {
                var18.glClientActiveTexture(class134.method999());
                this.field2375.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2375);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2376.method154();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class114.field1921) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2349) {
                var18.glClientActiveTexture(class134.method999());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class281.field4820) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2363.field1068 != 0) {
            if (field2369 == null || field2369.capacity() < field2363.field1068) {
                field2369 = ByteBuffer.allocateDirect(field2363.field1068).order(ByteOrder.nativeOrder());
            } else {
                field2369.clear();
            }
            field2369.put(field2363.field1066, 0, field2363.field1068);
            field2369.flip();
            class281.method1952(arg1);
            var18.glDrawElements(4, field2363.field1068 / 4, 5125, field2369);
        }
        if (field2365.field1068 == 0) {
            return;
        }
        if (field2377 == null || field2377.capacity() < field2365.field1068) {
            field2377 = ByteBuffer.allocateDirect(field2365.field1068).order(ByteOrder.nativeOrder());
        } else {
            field2377.clear();
        }
        field2377.put(field2365.field1066, 0, field2365.field1068);
        field2377.flip();
        class281.method1952(arg1 - 100.0F);
        class281.method1958();
        var18.glDrawElements(4, field2365.field1068 / 4, 5125, field2377);
        class281.method1957();
    }
}
