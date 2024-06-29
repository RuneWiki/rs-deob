import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class70 extends class26 {

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    private int field895 = 0;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    private int field908 = 0;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public int field912 = 0;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    private int field901 = 0;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public int field900 = 0;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public int field920 = 0;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "F")
    private float field910;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "Z")
    public boolean field909;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "Z")
    private boolean field904;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Lfd;")
    private static class299 field902;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "Lfd;")
    private static class299 field906;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "Lic;")
    private class329 field918;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Llk;")
    private class34 field905;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field903;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field911;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field921;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "[F")
    private float[] field894;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "[F")
    private float[] field896;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "[F")
    private float[] field922;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "[F")
    private float[] field923;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
    private int[] field893;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "[I")
    private int[] field897;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "[I")
    private int[] field899;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "[I")
    private int[] field907;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
    private int[] field914;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "[I")
    private int[] field917;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "[I")
    private int[] field924;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "[Z")
    private boolean[] field915;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "[[I")
    private int[][] field916;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "[[I")
    private int[][] field919;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V", line = 8)
    public final void method514() {
        class299 var1 = new class299((this.field904 ? 40 : 36) * this.field920);
        for (int var2 = 0; var2 < this.field920; var2++) {
            if (class47.field593) {
                var1.method2071(true, (float) this.field899[var2]);
                var1.method2071(true, (float) this.field924[var2]);
                var1.method2071(true, (float) this.field914[var2]);
                var1.method2084(true, this.field893[var2]);
                var1.method2071(true, this.field894[var2]);
                var1.method2071(true, this.field922[var2]);
                var1.method2071(true, this.field896[var2]);
                var1.method2071(true, (float) this.field899[var2] / this.field910);
                var1.method2071(true, (float) this.field914[var2] / this.field910);
                if (this.field904) {
                    var1.method2071(true, this.field923[var2]);
                }
            } else {
                var1.method2099((float) this.field899[var2], -2503);
                var1.method2099((float) this.field924[var2], -2503);
                var1.method2099((float) this.field914[var2], -2503);
                var1.method2084(true, this.field893[var2]);
                var1.method2099(this.field894[var2], -2503);
                var1.method2099(this.field922[var2], -2503);
                var1.method2099(this.field896[var2], -2503);
                var1.method2099((float) this.field899[var2] / this.field910, -2503);
                var1.method2099((float) this.field914[var2] / this.field910, -2503);
                if (this.field904) {
                    var1.method2099(this.field923[var2], -2503);
                }
            }
        }
        if (class47.field618) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field4350, 0, var1.field4351);
            this.field905 = new class34();
            this.field905.method218(var3);
        } else {
            this.field921 = ByteBuffer.allocateDirect(var1.field4351).order(ByteOrder.nativeOrder());
            this.field921.put(var1.field4350, 0, var1.field4351);
            this.field921.flip();
        }
        this.field899 = null;
        this.field924 = null;
        this.field914 = null;
        this.field893 = null;
        this.field894 = null;
        this.field922 = null;
        this.field896 = null;
        this.field918 = null;
        this.field923 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([[[Lnh;FZ)V", line = 78)
    public final void method515(class119[][][] arg0, float arg1, boolean arg2) {
        if (field902 == null || field902.field4350.length < this.field901 * 4) {
            field902 = new class299(this.field901 * 4);
        } else {
            field902.field4351 = 0;
        }
        if (field906 == null || field906.field4350.length < this.field908 * 4) {
            field906 = new class299(this.field908 * 4);
        } else {
            field906.field4351 = 0;
        }
        if (class47.field593) {
            for (int var4 = 0; var4 < this.field895; var4++) {
                class119 var5 = arg0[this.field897[var4]][this.field907[var4]][this.field917[var4]];
                if (var5 != null && var5.field1574) {
                    int[] var6 = this.field916[var4];
                    class299 var9;
                    if (this.field909) {
                        int[] var7 = this.field919[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field906.method2084(true, var7[var8]);
                            }
                        }
                        var9 = this.field915[var4] ? field906 : field902;
                    } else {
                        var9 = field902;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method2084(true, var6[0]);
                        var9.method2084(true, var6[var10]);
                        var9.method2084(true, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field895; var11++) {
                class119 var12 = arg0[this.field897[var11]][this.field907[var11]][this.field917[var11]];
                if (var12 != null && var12.field1574) {
                    int[] var13 = this.field916[var11];
                    class299 var16;
                    if (this.field909) {
                        int[] var14 = this.field919[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field906.method2066(var14[var15], false);
                            }
                        }
                        var16 = this.field915[var11] ? field906 : field902;
                    } else {
                        var16 = field902;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method2066(var13[0], false);
                        var16.method2066(var13[var17], false);
                        var16.method2066(var13[var17 + 1], false);
                    }
                }
            }
        }
        if (field902.field4351 == 0 && field906.field4351 == 0) {
            return;
        }
        GL var18 = class47.field592;
        if (this.field913 == -1 || arg2) {
            class47.method357(-1);
            class255.method1781(0, 0, -111);
        } else {
            class350.field5467.method912(64, this.field913);
        }
        int var19 = this.field904 ? 40 : 36;
        if (this.field905 == null) {
            if (class47.field618) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field921.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field921);
            this.field921.position(12);
            var18.glColorPointer(4, 5121, var19, this.field921);
            if (class67.field856) {
                this.field921.position(16);
                var18.glNormalPointer(5126, var19, this.field921);
            }
            this.field921.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field921);
            if (this.field904) {
                var18.glClientActiveTexture(class111.method787());
                this.field921.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field921);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field905.method220();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class67.field856) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field904) {
                var18.glClientActiveTexture(class111.method787());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class47.field618) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field902.field4351 != 0) {
            if (field911 == null || field911.capacity() < field902.field4351) {
                field911 = ByteBuffer.allocateDirect(field902.field4351).order(ByteOrder.nativeOrder());
            } else {
                field911.clear();
            }
            field911.put(field902.field4350, 0, field902.field4351);
            field911.flip();
            class47.method370(arg1);
            var18.glDrawElements(4, field902.field4351 / 4, 5125, field911);
        }
        if (field906.field4351 == 0) {
            return;
        }
        if (field903 == null || field903.capacity() < field906.field4351) {
            field903 = ByteBuffer.allocateDirect(field906.field4351).order(ByteOrder.nativeOrder());
        } else {
            field903.clear();
        }
        field903.put(field906.field4350, 0, field906.field4351);
        field903.flip();
        class47.method370(arg1 - 100.0F);
        class47.method346();
        var18.glDrawElements(4, field906.field4351 / 4, 5125, field903);
        class47.method348();
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class70(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field913 = arg0;
        this.field910 = arg1;
        this.field909 = arg2;
        this.field904 = arg3;
        this.field898 = arg4;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()V", line = 304)
    public static final void method516() {
        field902 = null;
        field906 = null;
        field911 = null;
        field903 = null;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()V", line = 314)
    public static void method517() {
        field902 = null;
        field906 = null;
        field911 = null;
        field903 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[I[IZ)I", line = 326)
    public final int method518(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field909) {
            this.field919[this.field895] = arg4;
            this.field915[this.field895] = arg5;
            if (arg4 != null) {
                this.field908 += arg4.length;
            }
            if (arg5) {
                this.field908 += (arg3.length - 2) * 3;
            } else {
                this.field901 += (arg3.length - 2) * 3;
            }
        } else {
            this.field901 += (arg3.length - 2) * 3;
        }
        this.field897[this.field895] = arg0;
        this.field907[this.field895] = arg1;
        this.field917[this.field895] = arg2;
        this.field916[this.field895] = arg3;
        return this.field895++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIFFFIF)I", line = 351)
    public final int method519(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class7 var11 = (class7) this.field918.method2279(var9, 116);
            if (var11 != null) {
                if (arg1 < this.field924[var11.field67]) {
                    this.field924[var11.field67] = arg1;
                }
                return var11.field67;
            }
        }
        this.field899[this.field920] = arg0;
        this.field924[this.field920] = arg1;
        this.field914[this.field920] = arg2;
        if (this.field904) {
            this.field923[this.field920] = arg7;
        }
        this.field894[this.field920] = arg3;
        this.field922[this.field920] = arg4;
        this.field896[this.field920] = arg5;
        this.field893[this.field920] = arg6;
        if (var9 != 0L) {
            this.field918.method2275(new class7(this.field920), 89, var9);
        }
        return this.field920++;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()V", line = 386)
    public final void method520() {
        this.field899 = new int[this.field900];
        this.field924 = new int[this.field900];
        this.field914 = new int[this.field900];
        if (this.field904) {
            this.field923 = new float[this.field900];
        }
        this.field893 = new int[this.field900];
        this.field894 = new float[this.field900];
        this.field922 = new float[this.field900];
        this.field896 = new float[this.field900];
        this.field907 = new int[this.field912];
        this.field917 = new int[this.field912];
        this.field897 = new int[this.field912];
        this.field916 = new int[this.field912][];
        this.field918 = new class329(class262.method1805(this.field900, (byte) -17));
        if (this.field909) {
            this.field919 = new int[this.field912][];
            this.field915 = new boolean[this.field912];
        }
    }
}
