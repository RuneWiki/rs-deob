import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class47 extends class307 {

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public int field902 = 0;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    private int field904 = 0;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public int field903 = 0;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public int field925 = 0;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    private int field915 = 0;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    private int field929 = 0;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "F")
    private float field922;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "Z")
    public boolean field916;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "Z")
    private boolean field923;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Lo;")
    private class199 field905;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Lt;")
    private class245 field906;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Lsd;")
    private static class26 field899;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Lsd;")
    private static class26 field900;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field909;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field911;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field927;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "[F")
    private float[] field901;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "[F")
    private float[] field914;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "[F")
    private float[] field919;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "[F")
    private float[] field926;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "[I")
    private int[] field907;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "[I")
    private int[] field912;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "[I")
    private int[] field913;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
    private int[] field920;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "[I")
    private int[] field921;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "[I")
    private int[] field928;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "[Z")
    private boolean[] field898;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "[[I")
    private int[][] field910;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[[I")
    private int[][] field917;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class47(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field924 = arg0;
        this.field922 = arg1;
        this.field916 = arg2;
        this.field923 = arg3;
        this.field908 = arg4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 25)
    public static void method420() {
        field899 = null;
        field900 = null;
        field927 = null;
        field909 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V", line = 32)
    public static final void method421() {
        field899 = null;
        field900 = null;
        field927 = null;
        field909 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIFFFIF)I", line = 40)
    public final int method422(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class270 var11 = (class270) this.field905.method1405((byte) 115, var9);
            if (var11 != null) {
                if (arg1 < this.field907[var11.field4483]) {
                    this.field907[var11.field4483] = arg1;
                }
                return var11.field4483;
            }
        }
        this.field920[this.field903] = arg0;
        this.field907[this.field903] = arg1;
        this.field921[this.field903] = arg2;
        if (this.field923) {
            this.field901[this.field903] = arg7;
        }
        this.field919[this.field903] = arg3;
        this.field914[this.field903] = arg4;
        this.field926[this.field903] = arg5;
        this.field918[this.field903] = arg6;
        if (var9 != 0L) {
            this.field905.method1396(-19928, var9, new class270(this.field903));
        }
        return this.field903++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III[I[IZ)I", line = 79)
    public final int method423(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field916) {
            this.field917[this.field904] = arg4;
            this.field898[this.field904] = arg5;
            if (arg4 != null) {
                this.field929 += arg4.length;
            }
            if (arg5) {
                this.field929 += (arg3.length - 2) * 3;
            } else {
                this.field915 += (arg3.length - 2) * 3;
            }
        } else {
            this.field915 += (arg3.length - 2) * 3;
        }
        this.field928[this.field904] = arg0;
        this.field912[this.field904] = arg1;
        this.field913[this.field904] = arg2;
        this.field910[this.field904] = arg3;
        return this.field904++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V", line = 105)
    public final void method424() {
        class26 var1 = new class26((this.field923 ? 40 : 36) * this.field903);
        for (int var2 = 0; var2 < this.field903; var2++) {
            if (class21.field349) {
                var1.method227((float) this.field920[var2], -122);
                var1.method227((float) this.field907[var2], 36);
                var1.method227((float) this.field921[var2], 75);
                var1.method239((byte) 113, this.field918[var2]);
                var1.method227(this.field919[var2], 98);
                var1.method227(this.field914[var2], -114);
                var1.method227(this.field926[var2], 112);
                var1.method227((float) this.field920[var2] / this.field922, 112);
                var1.method227((float) this.field921[var2] / this.field922, -121);
                if (this.field923) {
                    var1.method227(this.field901[var2], -108);
                }
            } else {
                var1.method214(123, (float) this.field920[var2]);
                var1.method214(123, (float) this.field907[var2]);
                var1.method214(127, (float) this.field921[var2]);
                var1.method239((byte) -85, this.field918[var2]);
                var1.method214(123, this.field919[var2]);
                var1.method214(126, this.field914[var2]);
                var1.method214(123, this.field926[var2]);
                var1.method214(127, (float) this.field920[var2] / this.field922);
                var1.method214(127, (float) this.field921[var2] / this.field922);
                if (this.field923) {
                    var1.method214(123, this.field901[var2]);
                }
            }
        }
        if (class21.field367) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field472, 0, var1.field478);
            this.field906 = new class245();
            this.field906.method1736(var3);
        } else {
            this.field911 = ByteBuffer.allocateDirect(var1.field478).order(ByteOrder.nativeOrder());
            this.field911.put(var1.field472, 0, var1.field478);
            this.field911.flip();
        }
        this.field920 = null;
        this.field907 = null;
        this.field921 = null;
        this.field918 = null;
        this.field919 = null;
        this.field914 = null;
        this.field926 = null;
        this.field905 = null;
        this.field901 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([[[Lue;FZ)V", line = 170)
    public final void method425(class14[][][] arg0, float arg1, boolean arg2) {
        if (field899 == null || field899.field472.length < this.field915 * 4) {
            field899 = new class26(this.field915 * 4);
        } else {
            field899.field478 = 0;
        }
        if (field900 == null || field900.field472.length < this.field929 * 4) {
            field900 = new class26(this.field929 * 4);
        } else {
            field900.field478 = 0;
        }
        if (class21.field349) {
            for (int var4 = 0; var4 < this.field904; var4++) {
                class14 var5 = arg0[this.field928[var4]][this.field912[var4]][this.field913[var4]];
                if (var5 != null && var5.field223) {
                    int[] var6 = this.field910[var4];
                    class26 var9;
                    if (this.field916) {
                        int[] var7 = this.field917[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field900.method239((byte) 109, var7[var8]);
                            }
                        }
                        var9 = this.field898[var4] ? field900 : field899;
                    } else {
                        var9 = field899;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method239((byte) 94, var6[0]);
                        var9.method239((byte) -98, var6[var10]);
                        var9.method239((byte) 121, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field904; var11++) {
                class14 var12 = arg0[this.field928[var11]][this.field912[var11]][this.field913[var11]];
                if (var12 != null && var12.field223) {
                    int[] var13 = this.field910[var11];
                    class26 var16;
                    if (this.field916) {
                        int[] var14 = this.field917[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field900.method248((byte) 119, var14[var15]);
                            }
                        }
                        var16 = this.field898[var11] ? field900 : field899;
                    } else {
                        var16 = field899;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method248((byte) 116, var13[0]);
                        var16.method248((byte) 111, var13[var17]);
                        var16.method248((byte) 108, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field899.field478 == 0 && field900.field478 == 0) {
            return;
        }
        GL var18 = class21.field377;
        if (this.field924 == -1 || arg2) {
            class21.method140(-1);
            class60.method504(0, 0, 20789);
        } else {
            class203.field3217.method567(10, this.field924);
        }
        int var19 = this.field923 ? 40 : 36;
        if (this.field906 == null) {
            if (class21.field367) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field911.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field911);
            this.field911.position(12);
            var18.glColorPointer(4, 5121, var19, this.field911);
            if (class1.field8) {
                this.field911.position(16);
                var18.glNormalPointer(5126, var19, this.field911);
            }
            this.field911.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field911);
            if (this.field923) {
                var18.glClientActiveTexture(class155.method1203());
                this.field911.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field911);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field906.method1738();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class1.field8) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field923) {
                var18.glClientActiveTexture(class155.method1203());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class21.field367) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field899.field478 != 0) {
            if (field927 == null || field927.capacity() < field899.field478) {
                field927 = ByteBuffer.allocateDirect(field899.field478).order(ByteOrder.nativeOrder());
            } else {
                field927.clear();
            }
            field927.put(field899.field472, 0, field899.field478);
            field927.flip();
            class21.method133(arg1);
            var18.glDrawElements(4, field899.field478 / 4, 5125, field927);
        }
        if (field900.field478 == 0) {
            return;
        }
        if (field909 == null || field909.capacity() < field900.field478) {
            field909 = ByteBuffer.allocateDirect(field900.field478).order(ByteOrder.nativeOrder());
        } else {
            field909.clear();
        }
        field909.put(field900.field472, 0, field900.field478);
        field909.flip();
        class21.method133(arg1 - 100.0F);
        class21.method150();
        var18.glDrawElements(4, field900.field478 / 4, 5125, field909);
        class21.method163();
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()V", line = 375)
    public final void method426() {
        this.field920 = new int[this.field902];
        this.field907 = new int[this.field902];
        this.field921 = new int[this.field902];
        if (this.field923) {
            this.field901 = new float[this.field902];
        }
        this.field918 = new int[this.field902];
        this.field919 = new float[this.field902];
        this.field914 = new float[this.field902];
        this.field926 = new float[this.field902];
        this.field912 = new int[this.field925];
        this.field913 = new int[this.field925];
        this.field928 = new int[this.field925];
        this.field910 = new int[this.field925][];
        this.field905 = new class199(class151.method1130(61, this.field902));
        if (this.field916) {
            this.field917 = new int[this.field925][];
            this.field898 = new boolean[this.field925];
        }
    }
}
