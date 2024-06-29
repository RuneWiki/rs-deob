import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class145 extends class142 {

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
    public boolean field2306 = false;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public int field2324 = 0;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "Luh;")
    private class74 field2321 = new class74();

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    private int field2334 = 0;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "Ljo;")
    public class150 field2330 = new class150();

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "Z")
    private boolean field2342 = false;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Z")
    private boolean field2339 = false;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
    private int field2351 = 0;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "[Lcc;")
    public class349[] field2320;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "J")
    private long field2319;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Z")
    public static boolean field2307 = false;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2310 = 0;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Z")
    public static boolean field2313 = false;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field2323 = 0;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Lqb;")
    public static class96 field2317 = new class96(8);

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field2325 = 0;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    private static int field2326 = 0;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2332 = 2;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "[Z")
    private static boolean[] field2329 = new boolean[8];

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "[Z")
    private static boolean[] field2336 = new boolean[8];

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Lfh;")
    private static class313 field2331 = new class313(131056);

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "F")
    public static float field2340 = 1.0F;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "J")
    private long field2308;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "J")
    public long field2311;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "Luh;")
    private static class74 field2322;

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2353;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "[I")
    public static int[] field2327;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "[I")
    public static int[] field2333;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "[Lcc;")
    public static class349[] field2315;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "[[S")
    public static short[][] field2328;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "[[S")
    public static short[][] field2335;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1016(int arg0, int arg1) {
        field2340 = (float) arg1 / 334.0F;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V", line = 11)
    public final void method1017(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1038(arg0, arg1, class244.field3847 + arg2, class65.field959 + arg3, class228.field3584 + arg4);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 15)
    public final void method1018(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class322.field5287) {
            arg0.glDisable(2896);
        }
        field2331.field5137 = 0;
        if (class245.field3895) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field2333[var5] > 32 ? 32 : field2333[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class349 var8 = this.field2320[field2335[var5][var7]];
                        field2331.method2252((float) (var8.field5582 >> 12), false);
                        field2331.method2252((float) (var8.field5578 >> 12), false);
                        field2331.method2252((float) (var8.field5586 >> 12), false);
                        int var9 = var8.field5580;
                        field2331.method2193((byte) (var9 >> 16), false);
                        field2331.method2193((byte) (var9 >> 8), false);
                        field2331.method2193((byte) var9, false);
                        field2331.method2193((byte) (var9 >> 24), false);
                    }
                    if (field2333[var5] > 32) {
                        int var10 = field2333[var5] - 32 - 1;
                        for (int var11 = field2327[var10] - 1; var11 >= 0; var11--) {
                            class349 var12 = this.field2320[field2328[var10][var11]];
                            field2331.method2252((float) (var12.field5582 >> 12), false);
                            field2331.method2252((float) (var12.field5578 >> 12), false);
                            field2331.method2252((float) (var12.field5586 >> 12), false);
                            int var13 = var12.field5580;
                            field2331.method2193((byte) (var13 >> 16), false);
                            field2331.method2193((byte) (var13 >> 8), false);
                            field2331.method2193((byte) var13, false);
                            field2331.method2193((byte) (var13 >> 24), false);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field2333[var14] > 32 ? 32 : field2333[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class349 var17 = this.field2320[field2335[var14][var16]];
                        field2331.method2219((float) (var17.field5582 >> 12), (byte) -125);
                        field2331.method2219((float) (var17.field5578 >> 12), (byte) -128);
                        field2331.method2219((float) (var17.field5586 >> 12), (byte) -125);
                        int var18 = var17.field5580;
                        field2331.method2193((byte) (var18 >> 16), false);
                        field2331.method2193((byte) (var18 >> 8), false);
                        field2331.method2193((byte) var18, false);
                        field2331.method2193((byte) (var18 >> 24), false);
                    }
                    if (field2333[var14] > 32) {
                        int var19 = field2333[var14] - 32 - 1;
                        for (int var20 = field2327[var19] - 1; var20 >= 0; var20--) {
                            class349 var21 = this.field2320[field2328[var19][var20]];
                            field2331.method2219((float) (var21.field5582 >> 12), (byte) -125);
                            field2331.method2219((float) (var21.field5578 >> 12), (byte) -128);
                            field2331.method2219((float) (var21.field5586 >> 12), (byte) -128);
                            int var22 = var21.field5580;
                            field2331.method2193((byte) (var22 >> 16), false);
                            field2331.method2193((byte) (var22 >> 8), false);
                            field2331.method2193((byte) var22, false);
                            field2331.method2193((byte) (var22 >> 24), false);
                        }
                    }
                }
            }
        }
        if (field2331.field5137 != 0) {
            if (class245.field3869) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field2353 == null || field2353.capacity() < field2331.field5137) {
                field2353 = ByteBuffer.allocateDirect(field2331.field5137).order(ByteOrder.nativeOrder());
            } else {
                field2353.clear();
            }
            field2353.put(field2331.field5124, 0, field2331.field5137);
            field2353.flip();
            field2353.position(0);
            arg0.glVertexPointer(3, 5126, 16, field2353);
            field2353.position(12);
            arg0.glColorPointer(4, 5121, 16, field2353);
            arg0.glDrawArrays(0, 0, field2331.field5137 >> 4);
        }
        if (!arg3 && class322.field5287) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(J)Z", line = 167)
    private final boolean method1019(long arg0) {
        long var3;
        if (this.field2319 > this.field2308) {
            var3 = this.field2319;
        } else {
            var3 = this.field2308;
        }
        int var5 = (int) (this.field2311 - var3);
        if (var5 > 750) {
            this.method1021();
            return false;
        }
        if (this.field2308 > 0L) {
            this.field2343 = this.field2348 - (this.field2337 << 6) >> 7;
            this.field2352 = ((this.field2337 << 6) + this.field2348 >> 7) - 1;
            this.field2347 = this.field2345 - (this.field2349 << 6) >> 7;
            this.field2344 = ((this.field2349 << 6) + this.field2345 >> 7) - 1;
            this.field2354 = this.field2346;
            if (this.field2350 < 3) {
                this.field2341 = class101.field1457[this.field2350 + 1][this.field2352][this.field2347] + class101.field1457[this.field2350 + 1][this.field2343][this.field2347] + class101.field1457[this.field2350 + 1][this.field2343][this.field2344] + class101.field1457[this.field2350 + 1][this.field2352][this.field2344] >> 2;
            } else {
                this.field2341 = this.field2354 - 1024;
            }
            this.field2339 = true;
            int var6 = class272.field4470[this.field2338];
            int var7 = class272.field4480[this.field2338];
            this.method1036(var6, var7);
            if (this.field2342) {
                class209 var8 = (class209) this.field2321.method506(18673);
                while (true) {
                    if (var8 == null) {
                        this.field2342 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field3163.field3469; var9++) {
                        var8.method1426(29693, true, var6, 1, this.field2311, var7);
                    }
                    var8 = (class209) this.field2321.method503(0);
                }
            }
            int var10 = (int) (arg0 - this.field2311);
            for (class209 var11 = (class209) this.field2321.method506(18673); var11 != null; var11 = (class209) this.field2321.method503(0)) {
                var11.method1426(29693, var5 < 10, var6, var10, arg0, var7);
            }
        }
        this.field2311 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lhk;Z[I[I[I)V", line = 243)
    private final void method1020(class45[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2336[var6] = false;
        }
        label88: for (class273 var7 = (class273) this.field2330.method1081(120); var7 != null; var7 = (class273) this.field2330.method1083((byte) 113)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field4483) {
                        field2336[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method1131(8);
                this.field2351--;
                if (var7.method2151(-4854)) {
                    var7.method2148((byte) 120);
                    field2326--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2351 != 8; var9++) {
            if (!field2336[var9]) {
                class273 var10 = null;
                if (arg0[var9].field657.field4439 == 1 && field2326 < 32) {
                    var10 = new class273(arg0[var9], this);
                    field2317.method632(true, var10, (long) arg0[var9].field657.field4436);
                    field2326++;
                }
                if (var10 == null) {
                    var10 = new class273(arg0[var9], this);
                }
                this.field2330.method1077(16711935, var10);
                this.field2351++;
                field2336[var9] = true;
            }
        }
        for (class273 var11 = (class273) this.field2330.method1081(-111); var11 != null; var11 = (class273) this.field2330.method1083((byte) 113)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2336[var12] && arg0[var12] == var11.field4483) {
                    var11.method1936(arg3[var11.field4483.field655], arg2[var11.field4483.field655], true, arg4[var11.field4483.field655]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V", line = 349)
    public final void method1021() {
        this.field2306 = true;
        for (class273 var1 = (class273) this.field2330.method1081(-81); var1 != null; var1 = (class273) this.field2330.method1083((byte) 113)) {
            if (var1.field4483.field657.field4439 == 1) {
                var1.method2148((byte) 122);
            }
        }
        this.field2320 = new class349[8192];
        this.field2324 = 0;
        this.field2321 = new class74();
        this.field2334 = 0;
        this.field2330 = new class150();
        this.field2351 = 0;
        this.method1005((byte) -94);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(J)V", line = 372)
    public static final void method1022(long arg0) {
        field2310 = field2316;
        field2318 = 0;
        field2316 = 0;
        long var2 = class19.method122(-12169);
        for (class145 var4 = (class145) field2322.method506(18673); var4 != null; var4 = (class145) field2322.method503(0)) {
            if (var4.method1019(arg0)) {
                field2318++;
            }
        }
        if (field2307 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2322.method505(false) + ", running: " + field2318 + ". Particles: " + field2316 + ". Time taken: " + (class19.method122(-12169) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()V", line = 395)
    public static final void method1023() {
        field2317 = new class96(8);
        field2326 = 0;
        for (class145 var0 = (class145) field2322.method506(18673); var0 != null; var0 = (class145) field2322.method503(0)) {
            var0.method1021();
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()V", line = 410)
    public final void method1024() {
        this.field2342 = true;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lnm;)V", line = 417)
    public static final void method1025(class221 arg0) {
        field2323 = 0;
        field2314 = 0;
        field2322 = new class74();
        field2315 = new class349[1024];
        class148.method1050((byte) -52, arg0);
        class15.method106(false, arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V", line = 427)
    public static final void method1026(int arg0, int arg1, int arg2) {
        GL var3 = class245.field3884;
        if (field2313) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class7.method53(0, 0, true);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class100.field1449, 0);
        if (class322.field5287) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class245.field3860) {
            var3.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()V", line = 452)
    public static void method1027() {
        field2322 = null;
        field2315 = null;
        field2317 = null;
        field2329 = null;
        field2336 = null;
        field2335 = (short[][]) null;
        field2328 = (short[][]) null;
        field2333 = null;
        field2327 = null;
        field2331 = null;
        field2353 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lrh;Z[I[I[I)V", line = 467)
    private final void method1028(class117[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2329[var6] = false;
        }
        label79: for (class209 var7 = (class209) this.field2321.method506(18673); var7 != null; var7 = (class209) this.field2321.method503(0)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field3170) {
                        field2329[var8] = true;
                        var7.field3160 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field3183 == 0) {
                    var7.method1005((byte) -103);
                    this.field2334--;
                } else {
                    var7.field3160 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2334 != 8; var9++) {
            if (!field2329[var9]) {
                class209 var10 = new class209(arg0[var9], this, this.field2311);
                this.field2321.method502(true, var10);
                this.field2334++;
                field2329[var9] = true;
            }
        }
        for (class209 var11 = (class209) this.field2321.method506(18673); var11 != null; var11 = (class209) this.field2321.method503(0)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2329[var12] && arg0[var12] == var11.field3170) {
                    var11.method1424((byte) 77, arg2[var11.field3170.field1708], arg4[var11.field3170.field1703], arg3[var11.field3170.field1703], arg2[var11.field3170.field1703], arg3[var11.field3170.field1710], arg3[var11.field3170.field1708], arg4[var11.field3170.field1710], arg2[var11.field3170.field1710], arg4[var11.field3170.field1708]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "()V", line = 564)
    public static final void method1029() {
        GL var0 = class245.field3884;
        if (class322.field5287) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class245.field3860) {
            var0.glEnable(2912);
        }
        if (field2313) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "()I", line = 583)
    public final int method1030() {
        if (this.field2352 == this.field2343 && this.field2347 == this.field2344) {
            return 92;
        }
        int var1 = this.field2343 << 7;
        int var2 = (this.field2352 << 7) + 128;
        int var3 = this.field2347 << 7;
        int var4 = (this.field2344 << 7) + 128;
        int var5 = this.field2348 - var1;
        int var6 = var2 - this.field2348;
        if (var5 > var6) {
            int var7 = this.field2345 - var3;
            int var8 = var4 - this.field2345;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field2345 - var3;
            int var10 = var4 - this.field2345;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "()V", line = 628)
    public static final void method1031() {
        field2335 = (short[][]) null;
        field2328 = (short[][]) null;
        field2333 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIII)V", line = 636)
    public final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2306 || !this.field2339 || !class245.field3886) {
            return;
        }
        GL var10 = class245.field3884;
        int var11 = class244.field3847;
        int var12 = class65.field959;
        int var13 = class228.field3584;
        method1026(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method1030();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field2354 - this.field2341) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field2307) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method1029();
            return;
        }
        class142 var20 = this.field2321.field1116;
        for (class142 var21 = var20.field2280; var21 != var20; var21 = var21.field2280) {
            class209 var22 = (class209) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field2333[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field2327[var24] = 0;
            }
            field2325 = 0;
            class142 var25 = var22.field3185.field1116;
            for (class142 var26 = var25.field2280; var26 != var25; var26 = var26.field2280) {
                class349 var27 = (class349) var26;
                if (!var27.field5574) {
                    int var28 = (var27.field5582 >> 12) - var11;
                    int var29 = (var27.field5578 >> 12) - var12;
                    int var30 = (var27.field5586 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field2333[var32] < 32) {
                        field2335[var32][field2333[var32]++] = var27.field5583;
                    } else {
                        if (field2333[var32] == 32) {
                            if (field2325 == 32) {
                                if (field2307) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field2333[var32] += field2325++ + 1;
                        }
                        short[] var10000 = field2328[field2333[var32] - 32 - 1];
                        int var10002 = field2333[var32] - 32 - 1;
                        int var10004 = field2327[field2333[var32] - 32 - 1];
                        field2327[var10002] = field2327[field2333[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field5583;
                    }
                }
            }
            boolean var33 = false;
            if (field2313 && var22.field3163.field3463 != -1) {
                class272.field4467.method400((byte) 111, var22.field3163.field3463);
                var33 = true;
            } else {
                class245.method1729(-1);
            }
            float var34 = (float) var22.field3163.field3505 * field2340;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method1018(var10, var19, var33, var22.field3163.field3460);
        }
        method1029();
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(III)V", line = 963)
    public class145(int arg0, int arg1, int arg2) {
        this.field2337 = arg1;
        this.field2349 = arg2;
        this.field2320 = new class349[8192];
        this.field2319 = (long) arg0;
        this.field2342 = true;
        field2322.method502(true, this);
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "()I", line = 784)
    public static final int method1033() {
        return field2332;
    }

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "()V", line = 788)
    public static final void method1034() {
        GL var0 = class245.field3884;
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
            field2313 = true;
        }
        field2335 = new short[1600][32];
        field2328 = new short[32][768];
        field2333 = new int[1600];
        field2327 = new int[32];
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 818)
    public static final void method1035(int arg0) {
        field2332 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V", line = 823)
    private final void method1036(int arg0, int arg1) {
        for (class273 var3 = (class273) this.field2330.method1081(-125); var3 != null; var3 = (class273) this.field2330.method1083((byte) 113)) {
            var3.field4499 = this.field2348 + var3.field4497;
            var3.field4496 = this.field2346 + var3.field4487;
            var3.field4489 = this.field2345 + var3.field4484;
            if (this.field2338 == 0) {
                var3.field4485 = var3.field4483.field657.field4424;
                var3.field4498 = var3.field4483.field657.field4443;
            } else {
                int var4 = var3.field4483.field657.field4424;
                int var5 = var3.field4483.field657.field4443;
                var3.field4485 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field4498 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lrh;[Lhk;Z[I[I[I)V", line = 849)
    public final void method1037(class117[] arg0, class45[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2306) {
            this.method1028(arg0, arg2, arg3, arg4, arg5);
            this.method1020(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIIII)V", line = 856)
    public final void method1038(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2306) {
            return;
        }
        if (this.field2338 != arg0) {
            for (class209 var6 = (class209) this.field2321.method506(18673); var6 != null; var6 = (class209) this.field2321.method503(0)) {
                var6.field3199 = true;
            }
        }
        this.field2308 = this.field2311;
        this.field2338 = arg0;
        this.field2350 = arg1;
        this.field2348 = arg2;
        this.field2346 = arg3;
        this.field2345 = arg4;
    }
}
