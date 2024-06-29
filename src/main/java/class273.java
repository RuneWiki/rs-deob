import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class273 extends class170 {

    @OriginalMember(owner = "client!em", name = "t", descriptor = "Z")
    public boolean field4205 = false;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public int field4214 = 0;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "Lge;")
    private class233 field4211 = new class233();

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    private int field4229 = 0;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "Lfk;")
    public class317 field4228 = new class317();

    @OriginalMember(owner = "client!em", name = "T", descriptor = "Z")
    private boolean field4231 = false;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "Z")
    private boolean field4235 = false;

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    private int field4237 = 0;

    @OriginalMember(owner = "client!em", name = "eb", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "I")
    private int field4234;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[Ltm;")
    public class137[] field4201;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "J")
    private long field4202;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field4203 = 0;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field4200 = 0;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field4210 = 0;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "Z")
    public static boolean field4207 = false;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field4215 = 0;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "Z")
    public static boolean field4217 = false;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "Llo;")
    public static class261 field4218 = new class261(8);

    @OriginalMember(owner = "client!em", name = "N", descriptor = "[Z")
    private static boolean[] field4225 = new boolean[8];

    @OriginalMember(owner = "client!em", name = "P", descriptor = "[Z")
    private static boolean[] field4227 = new boolean[8];

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    private static int field4224 = 0;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field4221 = 2;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "Lug;")
    private static class25 field4223 = new class25(131056);

    @OriginalMember(owner = "client!em", name = "fb", descriptor = "F")
    public static float field4243 = 1.0F;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!em", name = "cb", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!em", name = "db", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!em", name = "gb", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!em", name = "hb", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!em", name = "jb", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!em", name = "kb", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "J")
    private long field4206;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "J")
    public long field4208;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Lge;")
    private static class233 field4204;

    @OriginalMember(owner = "client!em", name = "ib", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4246;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "[I")
    public static int[] field4222;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "[I")
    public static int[] field4230;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "[Ltm;")
    public static class137[] field4213;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "[[S")
    public static short[][] field4219;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "[[S")
    public static short[][] field4226;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V", line = 8)
    public final void method1993() {
        this.field4231 = true;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lrn;)V", line = 12)
    public static final void method1994(class18 arg0) {
        field4210 = 0;
        field4203 = 0;
        field4204 = new class233();
        field4213 = new class137[1024];
        class34.method357(arg0, 0);
        class51.method487(arg0, (byte) 48);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([Lwb;Z[I[I[I)V", line = 24)
    private final void method1995(class287[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field4227[var6] = false;
        }
        label79: for (class270 var7 = (class270) this.field4211.method1746((byte) -25); var7 != null; var7 = (class270) this.field4211.method1740((byte) -62)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field4179) {
                        field4227[var8] = true;
                        var7.field4174 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field4149 == 0) {
                    var7.method1340(39);
                    this.field4229--;
                } else {
                    var7.field4174 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field4229 != 8; var9++) {
            if (!field4227[var9]) {
                class270 var10 = new class270(arg0[var9], this, this.field4208);
                this.field4211.method1745(1, var10);
                this.field4229++;
                field4227[var9] = true;
            }
        }
        for (class270 var11 = (class270) this.field4211.method1746((byte) -25); var11 != null; var11 = (class270) this.field4211.method1740((byte) -74)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field4227[var12] && arg0[var12] == var11.field4179) {
                    var11.method1980(arg2[var11.field4179.field4448], arg2[var11.field4179.field4446], 1268, arg3[var11.field4179.field4448], arg4[var11.field4179.field4448], arg4[var11.field4179.field4446], arg3[var11.field4179.field4446], arg2[var11.field4179.field4453], arg4[var11.field4179.field4453], arg3[var11.field4179.field4453]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 119)
    public final void method1996(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class59.field927) {
            arg0.glDisable(2896);
        }
        field4223.field397 = 0;
        if (class240.field3757) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field4222[var5] > 32 ? 32 : field4222[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class137 var8 = this.field4201[field4219[var5][var7]];
                        field4223.method299((float) (var8.field2279 >> 12), -891392056);
                        field4223.method299((float) (var8.field2274 >> 12), -891392056);
                        field4223.method299((float) (var8.field2269 >> 12), -891392056);
                        int var9 = var8.field2280;
                        field4223.method273(0, (byte) (var9 >> 16));
                        field4223.method273(0, (byte) (var9 >> 8));
                        field4223.method273(0, (byte) var9);
                        field4223.method273(0, (byte) (var9 >> 24));
                    }
                    if (field4222[var5] > 32) {
                        int var10 = field4222[var5] - 32 - 1;
                        for (int var11 = field4230[var10] - 1; var11 >= 0; var11--) {
                            class137 var12 = this.field4201[field4226[var10][var11]];
                            field4223.method299((float) (var12.field2279 >> 12), -891392056);
                            field4223.method299((float) (var12.field2274 >> 12), -891392056);
                            field4223.method299((float) (var12.field2269 >> 12), -891392056);
                            int var13 = var12.field2280;
                            field4223.method273(0, (byte) (var13 >> 16));
                            field4223.method273(0, (byte) (var13 >> 8));
                            field4223.method273(0, (byte) var13);
                            field4223.method273(0, (byte) (var13 >> 24));
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field4222[var14] > 32 ? 32 : field4222[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class137 var17 = this.field4201[field4219[var14][var16]];
                        field4223.method300((byte) -30, (float) (var17.field2279 >> 12));
                        field4223.method300((byte) -30, (float) (var17.field2274 >> 12));
                        field4223.method300((byte) -30, (float) (var17.field2269 >> 12));
                        int var18 = var17.field2280;
                        field4223.method273(0, (byte) (var18 >> 16));
                        field4223.method273(0, (byte) (var18 >> 8));
                        field4223.method273(0, (byte) var18);
                        field4223.method273(0, (byte) (var18 >> 24));
                    }
                    if (field4222[var14] > 32) {
                        int var19 = field4222[var14] - 32 - 1;
                        for (int var20 = field4230[var19] - 1; var20 >= 0; var20--) {
                            class137 var21 = this.field4201[field4226[var19][var20]];
                            field4223.method300((byte) -30, (float) (var21.field2279 >> 12));
                            field4223.method300((byte) -30, (float) (var21.field2274 >> 12));
                            field4223.method300((byte) -30, (float) (var21.field2269 >> 12));
                            int var22 = var21.field2280;
                            field4223.method273(0, (byte) (var22 >> 16));
                            field4223.method273(0, (byte) (var22 >> 8));
                            field4223.method273(0, (byte) var22);
                            field4223.method273(0, (byte) (var22 >> 24));
                        }
                    }
                }
            }
        }
        if (field4223.field397 != 0) {
            if (class240.field3764) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field4246 == null || field4246.capacity() < field4223.field397) {
                field4246 = ByteBuffer.allocateDirect(field4223.field397).order(ByteOrder.nativeOrder());
            } else {
                field4246.clear();
            }
            field4246.put(field4223.field448, 0, field4223.field397);
            field4246.flip();
            field4246.position(0);
            arg0.glVertexPointer(3, 5126, 16, field4246);
            field4246.position(12);
            arg0.glColorPointer(4, 5121, 16, field4246);
            arg0.glDrawArrays(0, 0, field4223.field397 >> 4);
        }
        if (!arg3 && class59.field927) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V", line = 271)
    public static final void method1997(int arg0, int arg1) {
        field4243 = (float) arg1 / 334.0F;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 274)
    public static final void method1998(int arg0) {
        field4221 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "()V", line = 281)
    public static final void method1999() {
        GL var0 = class240.field3771;
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
            field4207 = true;
        }
        field4219 = new short[1600][32];
        field4226 = new short[32][768];
        field4222 = new int[1600];
        field4230 = new int[32];
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "()I", line = 308)
    public static final int method2000() {
        return field4221;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([Lgo;Z[I[I[I)V", line = 317)
    private final void method2001(class31[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field4225[var6] = false;
        }
        label88: for (class345 var7 = (class345) this.field4228.method2244((byte) -127); var7 != null; var7 = (class345) this.field4228.method2241(-1)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field5493) {
                        field4225[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method1357(947647010);
                this.field4237--;
                if (var7.method2261((byte) -46)) {
                    var7.method2262((byte) -102);
                    field4224--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field4237 != 8; var9++) {
            if (!field4225[var9]) {
                class345 var10 = null;
                if (arg0[var9].field485.field1962 == 1 && field4224 < 32) {
                    var10 = new class345(arg0[var9], this);
                    field4218.method1917(var10, 1, (long) arg0[var9].field485.field1965);
                    field4224++;
                }
                if (var10 == null) {
                    var10 = new class345(arg0[var9], this);
                }
                this.field4228.method2245(var10, 102);
                this.field4237++;
                field4225[var9] = true;
            }
        }
        for (class345 var11 = (class345) this.field4228.method2244((byte) -125); var11 != null; var11 = (class345) this.field4228.method2241(-1)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field4225[var12] && arg0[var12] == var11.field5493) {
                    var11.method2434(arg4[var11.field5493.field486], arg2[var11.field5493.field486], true, arg3[var11.field5493.field486]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(J)V", line = 425)
    public static final void method2002(long arg0) {
        field4200 = field4216;
        field4215 = 0;
        field4216 = 0;
        long var2 = class156.method1273((byte) -97);
        for (class273 var4 = (class273) field4204.method1746((byte) -25); var4 != null; var4 = (class273) field4204.method1740((byte) -93)) {
            if (var4.method2003(arg0)) {
                field4215++;
            }
        }
        if (field4217 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field4204.method1739(0) + ", running: " + field4215 + ". Particles: " + field4216 + ". Time taken: " + (class156.method1273((byte) -113) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(J)Z", line = 449)
    private final boolean method2003(long arg0) {
        long var3;
        if (this.field4202 > this.field4206) {
            var3 = this.field4202;
        } else {
            var3 = this.field4206;
        }
        int var5 = (int) (this.field4208 - var3);
        if (var5 > 750) {
            this.method2013();
            return false;
        }
        if (this.field4206 > 0L) {
            this.field4232 = this.field4245 - (this.field4242 << 6) >> 7;
            this.field4241 = ((this.field4242 << 6) + this.field4245 >> 7) - 1;
            this.field4244 = this.field4248 - (this.field4234 << 6) >> 7;
            this.field4238 = ((this.field4234 << 6) + this.field4248 >> 7) - 1;
            this.field4239 = this.field4247;
            if (this.field4236 < 3) {
                this.field4240 = class277.field4290[this.field4236 + 1][this.field4241][this.field4244] + class277.field4290[this.field4236 + 1][this.field4232][this.field4244] + class277.field4290[this.field4236 + 1][this.field4232][this.field4238] + class277.field4290[this.field4236 + 1][this.field4241][this.field4238] >> 2;
            } else {
                this.field4240 = this.field4239 - 1024;
            }
            this.field4235 = true;
            int var6 = class107.field1604[this.field4233];
            int var7 = class107.field1605[this.field4233];
            this.method2006(var6, var7);
            if (this.field4231) {
                class270 var8 = (class270) this.field4211.method1746((byte) -25);
                while (true) {
                    if (var8 == null) {
                        this.field4231 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field4166.field1899; var9++) {
                        var8.method1979((byte) 113, 1, var6, this.field4208, true, var7);
                    }
                    var8 = (class270) this.field4211.method1740((byte) -49);
                }
            }
            int var10 = (int) (arg0 - this.field4208);
            for (class270 var11 = (class270) this.field4211.method1746((byte) -25); var11 != null; var11 = (class270) this.field4211.method1740((byte) -47)) {
                var11.method1979((byte) -127, var10, var6, arg0, var5 < 10, var7);
            }
        }
        this.field4208 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "()V", line = 521)
    public static final void method2004() {
        GL var0 = class240.field3771;
        if (class59.field927) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class240.field3739) {
            var0.glEnable(2912);
        }
        if (field4207) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(III)V", line = 963)
    public class273(int arg0, int arg1, int arg2) {
        this.field4242 = arg1;
        this.field4234 = arg2;
        this.field4201 = new class137[8192];
        this.field4202 = (long) arg0;
        this.field4231 = true;
        field4204.method1745(1, this);
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "()V", line = 546)
    public static void method2005() {
        field4204 = null;
        field4213 = null;
        field4218 = null;
        field4227 = null;
        field4225 = null;
        field4219 = (short[][]) null;
        field4226 = (short[][]) null;
        field4222 = null;
        field4230 = null;
        field4223 = null;
        field4246 = null;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)V", line = 561)
    private final void method2006(int arg0, int arg1) {
        for (class345 var3 = (class345) this.field4228.method2244((byte) -128); var3 != null; var3 = (class345) this.field4228.method2241(-1)) {
            var3.field5494 = this.field4245 + var3.field5486;
            var3.field5484 = this.field4247 + var3.field5490;
            var3.field5492 = this.field4248 + var3.field5491;
            if (this.field4233 == 0) {
                var3.field5487 = var3.field5493.field485.field1953;
                var3.field5482 = var3.field5493.field485.field1952;
            } else {
                int var4 = var3.field5493.field485.field1953;
                int var5 = var3.field5493.field485.field1952;
                var3.field5487 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field5482 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "()V", line = 587)
    public static final void method2007() {
        field4219 = (short[][]) null;
        field4226 = (short[][]) null;
        field4222 = null;
        field4230 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V", line = 599)
    public static final void method2008(int arg0, int arg1, int arg2) {
        GL var3 = class240.field3771;
        if (field4207) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class211.method1562(0, 0, -76);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class43.field698, 0);
        if (class59.field927) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class240.field3739) {
            var3.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "()V", line = 626)
    public static final void method2009() {
        field4218 = new class261(8);
        field4224 = 0;
        for (class273 var0 = (class273) field4204.method1746((byte) -25); var0 != null; var0 = (class273) field4204.method1740((byte) -27)) {
            var0.method2013();
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([Lwb;[Lgo;Z[I[I[I)V", line = 643)
    public final void method2010(class287[] arg0, class31[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field4205) {
            this.method1995(arg0, arg2, arg3, arg4, arg5);
            this.method2001(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "()I", line = 650)
    public final int method2011() {
        if (this.field4241 == this.field4232 && this.field4244 == this.field4238) {
            return 92;
        }
        int var1 = this.field4232 << 7;
        int var2 = (this.field4241 << 7) + 128;
        int var3 = this.field4244 << 7;
        int var4 = (this.field4238 << 7) + 128;
        int var5 = this.field4245 - var1;
        int var6 = var2 - this.field4245;
        if (var5 > var6) {
            int var7 = this.field4248 - var3;
            int var8 = var4 - this.field4248;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field4248 - var3;
            int var10 = var4 - this.field4248;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIII)V", line = 696)
    public final void method2012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field4205 || !this.field4235 || !class240.field3737) {
            return;
        }
        GL var10 = class240.field3771;
        int var11 = class205.field3165;
        int var12 = class215.field3371;
        int var13 = class190.field2977;
        method2008(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method2011();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field4239 - this.field4240) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field4217) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method2004();
            return;
        }
        class170 var20 = this.field4211.field3628;
        for (class170 var21 = var20.field2693; var21 != var20; var21 = var21.field2693) {
            class270 var22 = (class270) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field4222[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field4230[var24] = 0;
            }
            field4220 = 0;
            class170 var25 = var22.field4182.field3628;
            for (class170 var26 = var25.field2693; var26 != var25; var26 = var26.field2693) {
                class137 var27 = (class137) var26;
                if (!var27.field2275) {
                    int var28 = (var27.field2279 >> 12) - var11;
                    int var29 = (var27.field2274 >> 12) - var12;
                    int var30 = (var27.field2269 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field4222[var32] < 32) {
                        field4219[var32][field4222[var32]++] = var27.field2267;
                    } else {
                        if (field4222[var32] == 32) {
                            if (field4220 == 32) {
                                if (field4217) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field4222[var32] += field4220++ + 1;
                        }
                        short[] var10000 = field4226[field4222[var32] - 32 - 1];
                        int var10002 = field4222[var32] - 32 - 1;
                        int var10004 = field4230[field4222[var32] - 32 - 1];
                        field4230[var10002] = field4230[field4222[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field2267;
                    }
                }
            }
            boolean var33 = false;
            if (field4207 && var22.field4166.field1910 != -1) {
                class107.field1619.method756(var22.field4166.field1910, true);
                var33 = true;
            } else {
                class240.method1786(-1);
            }
            float var34 = (float) var22.field4166.field1888 * field4243;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method1996(var10, var19, var33, var22.field4166.field1901);
        }
        method2004();
    }

    @OriginalMember(owner = "client!em", name = "i", descriptor = "()V", line = 834)
    public final void method2013() {
        this.field4205 = true;
        for (class345 var1 = (class345) this.field4228.method2244((byte) -128); var1 != null; var1 = (class345) this.field4228.method2241(-1)) {
            if (var1.field5493.field485.field1962 == 1) {
                var1.method2262((byte) -102);
            }
        }
        this.field4201 = new class137[8192];
        this.field4214 = 0;
        this.field4211 = new class233();
        this.field4229 = 0;
        this.field4228 = new class317();
        this.field4237 = 0;
        this.method1340(39);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V", line = 855)
    public final void method2014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field4205) {
            return;
        }
        if (this.field4233 != arg0) {
            for (class270 var6 = (class270) this.field4211.method1746((byte) -25); var6 != null; var6 = (class270) this.field4211.method1740((byte) -91)) {
                var6.field4153 = true;
            }
        }
        this.field4206 = this.field4208;
        this.field4233 = arg0;
        this.field4236 = arg1;
        this.field4245 = arg2;
        this.field4247 = arg3;
        this.field4248 = arg4;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(IIIII)V", line = 885)
    public final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2014(arg0, arg1, class205.field3165 + arg2, class215.field3371 + arg3, class190.field2977 + arg4);
    }
}
