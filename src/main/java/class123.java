import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class123 extends class217 {

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public int field1932 = 0;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public int field1926 = 0;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    private int field1931 = 0;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public int field1936 = 0;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    private int field1934 = 0;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    private int field1946 = 0;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "F")
    private float field1944;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "Z")
    public boolean field1942;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
    private boolean field1929;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "Led;")
    private class296 field1954;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "Lhj;")
    private class29 field1941;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "Lhb;")
    private static class35 field1938;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "Lhb;")
    private static class35 field1955;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1930;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1945;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1952;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "[F")
    private float[] field1933;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "[F")
    private float[] field1947;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "[F")
    private float[] field1951;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "[F")
    private float[] field1956;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[I")
    private int[] field1928;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "[I")
    private int[] field1935;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "[I")
    private int[] field1937;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "[I")
    private int[] field1948;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "[I")
    private int[] field1950;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "[I")
    private int[] field1953;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "[I")
    private int[] field1957;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "[Z")
    private boolean[] field1927;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "[[I")
    private int[][] field1940;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "[[I")
    private int[][] field1949;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIFFFIF)I", line = 12)
    public final int method938(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class181 var11 = (class181) this.field1941.method203(1710, var9);
            if (var11 != null) {
                if (arg1 < this.field1928[var11.field2713]) {
                    this.field1928[var11.field2713] = arg1;
                }
                return var11.field2713;
            }
        }
        this.field1950[this.field1926] = arg0;
        this.field1928[this.field1926] = arg1;
        this.field1937[this.field1926] = arg2;
        if (this.field1929) {
            this.field1947[this.field1926] = arg7;
        }
        this.field1951[this.field1926] = arg3;
        this.field1956[this.field1926] = arg4;
        this.field1933[this.field1926] = arg5;
        this.field1935[this.field1926] = arg6;
        if (var9 != 0L) {
            this.field1941.method208(new class181(this.field1926), var9, 0);
        }
        return this.field1926++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V", line = 47)
    public final void method939() {
        this.field1950 = new int[this.field1932];
        this.field1928 = new int[this.field1932];
        this.field1937 = new int[this.field1932];
        if (this.field1929) {
            this.field1947 = new float[this.field1932];
        }
        this.field1935 = new int[this.field1932];
        this.field1951 = new float[this.field1932];
        this.field1956 = new float[this.field1932];
        this.field1933 = new float[this.field1932];
        this.field1953 = new int[this.field1936];
        this.field1948 = new int[this.field1936];
        this.field1957 = new int[this.field1936];
        this.field1949 = new int[this.field1936][];
        this.field1941 = new class29(class230.method1638((byte) 89, this.field1932));
        if (this.field1942) {
            this.field1940 = new int[this.field1936][];
            this.field1927 = new boolean[this.field1936];
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()V", line = 73)
    public static final void method940() {
        field1955 = null;
        field1938 = null;
        field1930 = null;
        field1952 = null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class123(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field1939 = arg0;
        this.field1944 = arg1;
        this.field1942 = arg2;
        this.field1929 = arg3;
        this.field1943 = arg4;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "()V", line = 84)
    public static void method941() {
        field1955 = null;
        field1938 = null;
        field1930 = null;
        field1952 = null;
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "()V", line = 93)
    public final void method942() {
        class35 var1 = new class35((this.field1929 ? 40 : 36) * this.field1926);
        for (int var2 = 0; var2 < this.field1926; var2++) {
            if (class36.field510) {
                var1.method274((byte) 28, (float) this.field1950[var2]);
                var1.method274((byte) 28, (float) this.field1928[var2]);
                var1.method274((byte) 28, (float) this.field1937[var2]);
                var1.method259(-15195, this.field1935[var2]);
                var1.method274((byte) 28, this.field1951[var2]);
                var1.method274((byte) 28, this.field1956[var2]);
                var1.method274((byte) 28, this.field1933[var2]);
                var1.method274((byte) 28, (float) this.field1950[var2] / this.field1944);
                var1.method274((byte) 28, (float) this.field1937[var2] / this.field1944);
                if (this.field1929) {
                    var1.method274((byte) 28, this.field1947[var2]);
                }
            } else {
                var1.method297((float) this.field1950[var2], -11926);
                var1.method297((float) this.field1928[var2], -11926);
                var1.method297((float) this.field1937[var2], -11926);
                var1.method259(-15195, this.field1935[var2]);
                var1.method297(this.field1951[var2], -11926);
                var1.method297(this.field1956[var2], -11926);
                var1.method297(this.field1933[var2], -11926);
                var1.method297((float) this.field1950[var2] / this.field1944, -11926);
                var1.method297((float) this.field1937[var2] / this.field1944, -11926);
                if (this.field1929) {
                    var1.method297(this.field1947[var2], -11926);
                }
            }
        }
        if (class36.field529) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field437, 0, var1.field455);
            this.field1954 = new class296();
            this.field1954.method2089(var3);
        } else {
            this.field1945 = ByteBuffer.allocateDirect(var1.field455).order(ByteOrder.nativeOrder());
            this.field1945.put(var1.field437, 0, var1.field455);
            this.field1945.flip();
        }
        this.field1950 = null;
        this.field1928 = null;
        this.field1937 = null;
        this.field1935 = null;
        this.field1951 = null;
        this.field1956 = null;
        this.field1933 = null;
        this.field1941 = null;
        this.field1947 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([[[Lp;FZ)V", line = 182)
    public final void method943(class99[][][] arg0, float arg1, boolean arg2) {
        if (field1955 == null || field1955.field437.length < this.field1934 * 4) {
            field1955 = new class35(this.field1934 * 4);
        } else {
            field1955.field455 = 0;
        }
        if (field1938 == null || field1938.field437.length < this.field1946 * 4) {
            field1938 = new class35(this.field1946 * 4);
        } else {
            field1938.field455 = 0;
        }
        if (class36.field510) {
            for (int var4 = 0; var4 < this.field1931; var4++) {
                class99 var5 = arg0[this.field1957[var4]][this.field1953[var4]][this.field1948[var4]];
                if (var5 != null && var5.field1485) {
                    int[] var6 = this.field1949[var4];
                    class35 var9;
                    if (this.field1942) {
                        int[] var7 = this.field1940[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field1938.method259(-15195, var7[var8]);
                            }
                        }
                        var9 = this.field1927[var4] ? field1938 : field1955;
                    } else {
                        var9 = field1955;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method259(-15195, var6[0]);
                        var9.method259(-15195, var6[var10]);
                        var9.method259(-15195, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1931; var11++) {
                class99 var12 = arg0[this.field1957[var11]][this.field1953[var11]][this.field1948[var11]];
                if (var12 != null && var12.field1485) {
                    int[] var13 = this.field1949[var11];
                    class35 var16;
                    if (this.field1942) {
                        int[] var14 = this.field1940[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1938.method276(var14[var15], false);
                            }
                        }
                        var16 = this.field1927[var11] ? field1938 : field1955;
                    } else {
                        var16 = field1955;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method276(var13[0], false);
                        var16.method276(var13[var17], false);
                        var16.method276(var13[var17 + 1], false);
                    }
                }
            }
        }
        if (field1955.field455 == 0 && field1938.field455 == 0) {
            return;
        }
        GL var18 = class36.field518;
        if (this.field1939 == -1 || arg2) {
            class36.method310(-1);
            class309.method2143(0, -121, 0);
        } else {
            class56.field829.method1735(this.field1939, (byte) -74);
        }
        int var19 = this.field1929 ? 40 : 36;
        if (this.field1954 == null) {
            if (class36.field529) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1945.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1945);
            this.field1945.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1945);
            if (class175.field2589) {
                this.field1945.position(16);
                var18.glNormalPointer(5126, var19, this.field1945);
            }
            this.field1945.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1945);
            if (this.field1929) {
                var18.glClientActiveTexture(class25.method155());
                this.field1945.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1945);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field1954.method2088();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class175.field2589) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1929) {
                var18.glClientActiveTexture(class25.method155());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class36.field529) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1955.field455 != 0) {
            if (field1930 == null || field1930.capacity() < field1955.field455) {
                field1930 = ByteBuffer.allocateDirect(field1955.field455).order(ByteOrder.nativeOrder());
            } else {
                field1930.clear();
            }
            field1930.put(field1955.field437, 0, field1955.field455);
            field1930.flip();
            class36.method330(arg1);
            var18.glDrawElements(4, field1955.field455 / 4, 5125, field1930);
        }
        if (field1938.field455 == 0) {
            return;
        }
        if (field1952 == null || field1952.capacity() < field1938.field455) {
            field1952 = ByteBuffer.allocateDirect(field1938.field455).order(ByteOrder.nativeOrder());
        } else {
            field1952.clear();
        }
        field1952.put(field1938.field437, 0, field1938.field455);
        field1952.flip();
        class36.method330(arg1 - 100.0F);
        class36.method319();
        var18.glDrawElements(4, field1938.field455 / 4, 5125, field1952);
        class36.method305();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III[I[IZ)I", line = 389)
    public final int method944(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1942) {
            this.field1940[this.field1931] = arg4;
            this.field1927[this.field1931] = arg5;
            if (arg4 != null) {
                this.field1946 += arg4.length;
            }
            if (arg5) {
                this.field1946 += (arg3.length - 2) * 3;
            } else {
                this.field1934 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1934 += (arg3.length - 2) * 3;
        }
        this.field1957[this.field1931] = arg0;
        this.field1953[this.field1931] = arg1;
        this.field1948[this.field1931] = arg2;
        this.field1949[this.field1931] = arg3;
        return this.field1931++;
    }
}
