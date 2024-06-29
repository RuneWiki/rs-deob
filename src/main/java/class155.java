import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class155 extends class193 {

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public int field2215 = 0;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "Z")
    public boolean field2220 = false;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Ltf;")
    private class116 field2209 = new class116();

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    private int field2226 = 0;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "Lbo;")
    public class16 field2228 = new class16();

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "Z")
    private boolean field2230 = false;

    @OriginalMember(owner = "client!ko", name = "X", descriptor = "I")
    private int field2247 = 0;

    @OriginalMember(owner = "client!ko", name = "eb", descriptor = "Z")
    private boolean field2254 = false;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!ko", name = "Z", descriptor = "I")
    private int field2249;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "[Llb;")
    public class341[] field2223;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "J")
    private long field2222;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field2212 = 0;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Z")
    public static boolean field2210 = false;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field2213 = 0;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "Z")
    public static boolean field2216 = false;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "Lnn;")
    public static class30 field2225 = new class30(8);

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
    private static int field2234 = 0;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
    public static int field2244 = 0;

    @OriginalMember(owner = "client!ko", name = "bb", descriptor = "I")
    public static int field2251 = 2;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "[Z")
    private static boolean[] field2238 = new boolean[8];

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "[Z")
    private static boolean[] field2241 = new boolean[8];

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "Lsb;")
    private static class190 field2240 = new class190(131056);

    @OriginalMember(owner = "client!ko", name = "fb", descriptor = "F")
    public static float field2255 = 1.0F;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!ko", name = "ab", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!ko", name = "cb", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!ko", name = "db", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "J")
    private long field2218;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "J")
    public long field2219;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "Ltf;")
    private static class116 field2227;

    @OriginalMember(owner = "client!ko", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2256;

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "[I")
    public static int[] field2243;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "[I")
    public static int[] field2246;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "[Llb;")
    public static class341[] field2208;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "[[S")
    public static short[][] field2236;

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "[[S")
    public static short[][] field2245;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lph;)V", line = 7)
    public static final void method1107(class361 arg0) {
        field2212 = 0;
        field2224 = 0;
        field2227 = new class116();
        field2208 = new class341[1024];
        class31.method220(-47, arg0);
        class11.method64((byte) -106, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V", line = 18)
    public static final void method1108(int arg0, int arg1, int arg2) {
        GL var3 = class141.field2025;
        if (field2210) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class2.method9(0, 10691, 0);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class216.field3188, 0);
        if (class98.field1379) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class141.field2024) {
            var3.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V", line = 41)
    public final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2220) {
            return;
        }
        if (this.field2252 != arg0) {
            for (class303 var6 = (class303) this.field2209.method869(false); var6 != null; var6 = (class303) this.field2209.method872(32767)) {
                var6.field4554 = true;
            }
        }
        this.field2218 = this.field2219;
        this.field2252 = arg0;
        this.field2232 = arg1;
        this.field2250 = arg2;
        this.field2242 = arg3;
        this.field2248 = arg4;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lfd;Z[I[I[I)V", line = 67)
    private final void method1110(class219[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2238[var6] = false;
        }
        label79: for (class303 var7 = (class303) this.field2209.method869(false); var7 != null; var7 = (class303) this.field2209.method872(32767)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field4534) {
                        field2238[var8] = true;
                        var7.field4550 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field4548 == 0) {
                    var7.method1389(4096);
                    this.field2226--;
                } else {
                    var7.field4550 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2226 != 8; var9++) {
            if (!field2238[var9]) {
                class303 var10 = new class303(arg0[var9], this, this.field2219);
                this.field2209.method868(var10, (byte) -125);
                this.field2226++;
                field2238[var9] = true;
            }
        }
        for (class303 var11 = (class303) this.field2209.method869(false); var11 != null; var11 = (class303) this.field2209.method872(32767)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2238[var12] && arg0[var12] == var11.field4534) {
                    var11.method2140(arg4[var11.field4534.field3272], arg2[var11.field4534.field3277], 8169, arg4[var11.field4534.field3273], arg3[var11.field4534.field3272], arg3[var11.field4534.field3273], arg3[var11.field4534.field3277], arg2[var11.field4534.field3273], arg4[var11.field4534.field3277], arg2[var11.field4534.field3272]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()V", line = 161)
    public final void method1111() {
        this.field2230 = true;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIIIII)V", line = 165)
    public final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2220 || !this.field2254 || !class141.field2031) {
            return;
        }
        GL var10 = class141.field2025;
        int var11 = class7.field142;
        int var12 = class253.field3770;
        int var13 = class126.field1843;
        method1108(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method1122();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field2229 - this.field2235) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field2216) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method1123();
            return;
        }
        class193 var20 = this.field2209.field1644;
        for (class193 var21 = var20.field2815; var21 != var20; var21 = var21.field2815) {
            class303 var22 = (class303) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field2243[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field2246[var24] = 0;
            }
            field2244 = 0;
            class193 var25 = var22.field4539.field1644;
            for (class193 var26 = var25.field2815; var26 != var25; var26 = var26.field2815) {
                class341 var27 = (class341) var26;
                if (!var27.field5269) {
                    int var28 = (var27.field5264 >> 12) - var11;
                    int var29 = (var27.field5262 >> 12) - var12;
                    int var30 = (var27.field5266 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field2243[var32] < 32) {
                        field2236[var32][field2243[var32]++] = var27.field5275;
                    } else {
                        if (field2243[var32] == 32) {
                            if (field2244 == 32) {
                                if (field2216) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field2243[var32] += field2244++ + 1;
                        }
                        short[] var10000 = field2245[field2243[var32] - 32 - 1];
                        int var10002 = field2243[var32] - 32 - 1;
                        int var10004 = field2246[field2243[var32] - 32 - 1];
                        field2246[var10002] = field2246[field2243[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field5275;
                    }
                }
            }
            boolean var33 = false;
            if (field2210 && var22.field4553.field48 != -1) {
                class345.field5336.method583(var22.field4553.field48, 64);
                var33 = true;
            } else {
                class141.method1000(-1);
            }
            float var34 = (float) var22.field4553.field5 * field2255;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method1113(var10, var19, var33, var22.field4553.field9);
        }
        method1123();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 303)
    public final void method1113(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class98.field1379) {
            arg0.glDisable(2896);
        }
        field2240.field2776 = 0;
        if (class141.field2056) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field2243[var5] > 32 ? 32 : field2243[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class341 var8 = this.field2223[field2236[var5][var7]];
                        field2240.method1328((byte) 102, (float) (var8.field5264 >> 12));
                        field2240.method1328((byte) 64, (float) (var8.field5262 >> 12));
                        field2240.method1328((byte) 105, (float) (var8.field5266 >> 12));
                        int var9 = var8.field5274;
                        field2240.method1355((byte) -121, (byte) (var9 >> 16));
                        field2240.method1355((byte) -112, (byte) (var9 >> 8));
                        field2240.method1355((byte) -125, (byte) var9);
                        field2240.method1355((byte) -119, (byte) (var9 >> 24));
                    }
                    if (field2243[var5] > 32) {
                        int var10 = field2243[var5] - 32 - 1;
                        for (int var11 = field2246[var10] - 1; var11 >= 0; var11--) {
                            class341 var12 = this.field2223[field2245[var10][var11]];
                            field2240.method1328((byte) 103, (float) (var12.field5264 >> 12));
                            field2240.method1328((byte) 66, (float) (var12.field5262 >> 12));
                            field2240.method1328((byte) 74, (float) (var12.field5266 >> 12));
                            int var13 = var12.field5274;
                            field2240.method1355((byte) -127, (byte) (var13 >> 16));
                            field2240.method1355((byte) -121, (byte) (var13 >> 8));
                            field2240.method1355((byte) -117, (byte) var13);
                            field2240.method1355((byte) -124, (byte) (var13 >> 24));
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field2243[var14] > 32 ? 32 : field2243[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class341 var17 = this.field2223[field2236[var14][var16]];
                        field2240.method1318((float) (var17.field5264 >> 12), (byte) -39);
                        field2240.method1318((float) (var17.field5262 >> 12), (byte) -39);
                        field2240.method1318((float) (var17.field5266 >> 12), (byte) -39);
                        int var18 = var17.field5274;
                        field2240.method1355((byte) -111, (byte) (var18 >> 16));
                        field2240.method1355((byte) -113, (byte) (var18 >> 8));
                        field2240.method1355((byte) -112, (byte) var18);
                        field2240.method1355((byte) -115, (byte) (var18 >> 24));
                    }
                    if (field2243[var14] > 32) {
                        int var19 = field2243[var14] - 32 - 1;
                        for (int var20 = field2246[var19] - 1; var20 >= 0; var20--) {
                            class341 var21 = this.field2223[field2245[var19][var20]];
                            field2240.method1318((float) (var21.field5264 >> 12), (byte) -39);
                            field2240.method1318((float) (var21.field5262 >> 12), (byte) -39);
                            field2240.method1318((float) (var21.field5266 >> 12), (byte) -39);
                            int var22 = var21.field5274;
                            field2240.method1355((byte) -114, (byte) (var22 >> 16));
                            field2240.method1355((byte) -110, (byte) (var22 >> 8));
                            field2240.method1355((byte) -115, (byte) var22);
                            field2240.method1355((byte) -118, (byte) (var22 >> 24));
                        }
                    }
                }
            }
        }
        if (field2240.field2776 != 0) {
            if (class141.field2032) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field2256 == null || field2256.capacity() < field2240.field2776) {
                field2256 = ByteBuffer.allocateDirect(field2240.field2776).order(ByteOrder.nativeOrder());
            } else {
                field2256.clear();
            }
            field2256.put(field2240.field2718, 0, field2240.field2776);
            field2256.flip();
            field2256.position(0);
            arg0.glVertexPointer(3, 5126, 16, field2256);
            field2256.position(12);
            arg0.glColorPointer(4, 5121, 16, field2256);
            arg0.glDrawArrays(0, 0, field2240.field2776 >> 4);
        }
        if (!arg3 && class98.field1379) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()I", line = 470)
    public static final int method1114() {
        return field2251;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIII)V", line = 473)
    public final void method1115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1109(arg0, arg1, class7.field142 + arg2, class253.field3770 + arg3, class126.field1843 + arg4);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V", line = 478)
    public static final void method1116(int arg0, int arg1) {
        field2255 = (float) arg1 / 334.0F;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "()V", line = 482)
    public static final void method1117() {
        field2225 = new class30(8);
        field2234 = 0;
        for (class155 var0 = (class155) field2227.method869(false); var0 != null; var0 = (class155) field2227.method872(32767)) {
            var0.method1129();
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lfd;[Lbb;Z[I[I[I)V", line = 495)
    public final void method1118(class219[] arg0, class103[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2220) {
            this.method1110(arg0, arg2, arg3, arg4, arg5);
            this.method1119(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lbb;Z[I[I[I)V", line = 505)
    private final void method1119(class103[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2241[var6] = false;
        }
        label88: for (class310 var7 = (class310) this.field2228.method93((byte) -90); var7 != null; var7 = (class310) this.field2228.method97(-64)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field4634) {
                        field2241[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method876(8);
                this.field2247--;
                if (var7.method630((byte) 123)) {
                    var7.method627(0);
                    field2234--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2247 != 8; var9++) {
            if (!field2241[var9]) {
                class310 var10 = null;
                if (arg0[var9].field1482.field3592 == 1 && field2234 < 32) {
                    var10 = new class310(arg0[var9], this);
                    field2225.method215(var10, (byte) -55, (long) arg0[var9].field1482.field3590);
                    field2234++;
                }
                if (var10 == null) {
                    var10 = new class310(arg0[var9], this);
                }
                this.field2228.method106(var10, -126);
                this.field2247++;
                field2241[var9] = true;
            }
        }
        for (class310 var11 = (class310) this.field2228.method93((byte) -65); var11 != null; var11 = (class310) this.field2228.method97(-98)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2241[var12] && arg0[var12] == var11.field4634) {
                    var11.method2180(arg3[var11.field4634.field1478], arg2[var11.field4634.field1478], arg4[var11.field4634.field1478], true);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V", line = 611)
    public static final void method1120(int arg0) {
        field2251 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(III)V", line = 952)
    public class155(int arg0, int arg1, int arg2) {
        this.field2233 = arg1;
        this.field2249 = arg2;
        this.field2223 = new class341[8192];
        this.field2222 = (long) arg0;
        this.field2230 = true;
        field2227.method868(this, (byte) -127);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(J)V", line = 620)
    public static final void method1121(long arg0) {
        field2211 = field2221;
        field2213 = 0;
        field2221 = 0;
        long var2 = class176.method1234(5574);
        for (class155 var4 = (class155) field2227.method869(false); var4 != null; var4 = (class155) field2227.method872(32767)) {
            if (var4.method1125(arg0)) {
                field2213++;
            }
        }
        if (field2216 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2227.method865(14756) + ", running: " + field2213 + ". Particles: " + field2221 + ". Time taken: " + (class176.method1234(5574) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "()I", line = 644)
    public final int method1122() {
        if (this.field2253 == this.field2239 && this.field2237 == this.field2231) {
            return 92;
        }
        int var1 = this.field2253 << 7;
        int var2 = (this.field2239 << 7) + 128;
        int var3 = this.field2231 << 7;
        int var4 = (this.field2237 << 7) + 128;
        int var5 = this.field2250 - var1;
        int var6 = var2 - this.field2250;
        if (var5 > var6) {
            int var7 = this.field2248 - var3;
            int var8 = var4 - this.field2248;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field2248 - var3;
            int var10 = var4 - this.field2248;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "()V", line = 690)
    public static final void method1123() {
        GL var0 = class141.field2025;
        if (class98.field1379) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class141.field2024) {
            var0.glEnable(2912);
        }
        if (field2210) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "()V", line = 712)
    public static void method1124() {
        field2227 = null;
        field2208 = null;
        field2225 = null;
        field2238 = null;
        field2241 = null;
        field2236 = (short[][]) null;
        field2245 = (short[][]) null;
        field2243 = null;
        field2246 = null;
        field2240 = null;
        field2256 = null;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(J)Z", line = 728)
    private final boolean method1125(long arg0) {
        long var3;
        if (this.field2222 > this.field2218) {
            var3 = this.field2222;
        } else {
            var3 = this.field2218;
        }
        int var5 = (int) (this.field2219 - var3);
        if (var5 > 750) {
            this.method1129();
            return false;
        }
        if (this.field2218 > 0L) {
            this.field2253 = this.field2250 - (this.field2233 << 6) >> 7;
            this.field2239 = ((this.field2233 << 6) + this.field2250 >> 7) - 1;
            this.field2231 = this.field2248 - (this.field2249 << 6) >> 7;
            this.field2237 = ((this.field2249 << 6) + this.field2248 >> 7) - 1;
            this.field2229 = this.field2242;
            if (this.field2232 < 3) {
                this.field2235 = class132.field1930[this.field2232 + 1][this.field2253][this.field2231] + class132.field1930[this.field2232 + 1][this.field2239][this.field2231] + class132.field1930[this.field2232 + 1][this.field2253][this.field2237] + class132.field1930[this.field2232 + 1][this.field2239][this.field2237] >> 2;
            } else {
                this.field2235 = this.field2229 - 1024;
            }
            this.field2254 = true;
            int var6 = class345.field5339[this.field2252];
            int var7 = class345.field5343[this.field2252];
            this.method1126(var6, var7);
            if (this.field2230) {
                class303 var8 = (class303) this.field2209.method869(false);
                while (true) {
                    if (var8 == null) {
                        this.field2230 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field4553.field49; var9++) {
                        var8.method2137((byte) 122, var7, var6, true, this.field2219, 1);
                    }
                    var8 = (class303) this.field2209.method872(32767);
                }
            }
            int var10 = (int) (arg0 - this.field2219);
            for (class303 var11 = (class303) this.field2209.method869(false); var11 != null; var11 = (class303) this.field2209.method872(32767)) {
                var11.method2137((byte) 115, var7, var6, var5 < 10, arg0, var10);
            }
        }
        this.field2219 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V", line = 804)
    private final void method1126(int arg0, int arg1) {
        for (class310 var3 = (class310) this.field2228.method93((byte) -112); var3 != null; var3 = (class310) this.field2228.method97(-96)) {
            var3.field4638 = this.field2250 + var3.field4636;
            var3.field4637 = this.field2242 + var3.field4628;
            var3.field4633 = this.field2248 + var3.field4635;
            if (this.field2252 == 0) {
                var3.field4632 = var3.field4634.field1482.field3581;
                var3.field4630 = var3.field4634.field1482.field3599;
            } else {
                int var4 = var3.field4634.field1482.field3581;
                int var5 = var3.field4634.field1482.field3599;
                var3.field4632 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field4630 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "()V", line = 832)
    public static final void method1127() {
        GL var0 = class141.field2025;
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
            field2210 = true;
        }
        field2236 = new short[1600][32];
        field2245 = new short[32][768];
        field2243 = new int[1600];
        field2246 = new int[32];
    }

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "()V", line = 864)
    public static final void method1128() {
        field2236 = (short[][]) null;
        field2245 = (short[][]) null;
        field2243 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "()V", line = 870)
    public final void method1129() {
        this.field2220 = true;
        for (class310 var1 = (class310) this.field2228.method93((byte) -27); var1 != null; var1 = (class310) this.field2228.method97(-88)) {
            if (var1.field4634.field1482.field3592 == 1) {
                var1.method627(0);
            }
        }
        this.field2223 = new class341[8192];
        this.field2215 = 0;
        this.field2209 = new class116();
        this.field2226 = 0;
        this.field2228 = new class16();
        this.field2247 = 0;
        this.method1389(4096);
    }
}
