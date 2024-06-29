import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class108 extends class141 {

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public int field1907 = 0;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    private int field1916 = 0;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    private int field1920 = 0;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public int field1910 = 0;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    private int field1928 = 0;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    public int field1924 = 0;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "F")
    private float field1917;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
    public boolean field1915;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Z")
    private boolean field1908;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Lbc;")
    private static class153 field1904;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "Lbc;")
    private static class153 field1912;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "Lej;")
    private class46 field1931;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "Loe;")
    private class79 field1932;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1914;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1929;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1930;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "[F")
    private float[] field1909;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "[F")
    private float[] field1925;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "[F")
    private float[] field1926;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "[F")
    private float[] field1927;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "[I")
    private int[] field1905;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "[I")
    private int[] field1911;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "[I")
    private int[] field1918;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "[I")
    private int[] field1919;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "[I")
    private int[] field1922;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "[I")
    private int[] field1923;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "[I")
    private int[] field1933;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[Z")
    private boolean[] field1913;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "[[I")
    private int[][] field1934;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "[[I")
    private int[][] field1935;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([[[Lrk;FZ)V", line = 9)
    public final void method736(class16[][][] arg0, float arg1, boolean arg2) {
        if (field1912 == null || field1912.field2598.length < this.field1920 * 4) {
            field1912 = new class153(this.field1920 * 4);
        } else {
            field1912.field2611 = 0;
        }
        if (field1904 == null || field1904.field2598.length < this.field1916 * 4) {
            field1904 = new class153(this.field1916 * 4);
        } else {
            field1904.field2611 = 0;
        }
        if (class147.field2482) {
            for (int var4 = 0; var4 < this.field1928; var4++) {
                class16 var5 = arg0[this.field1922[var4]][this.field1905[var4]][this.field1919[var4]];
                if (var5 != null && var5.field169) {
                    int[] var6 = this.field1934[var4];
                    class153 var9;
                    if (this.field1915) {
                        int[] var7 = this.field1935[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field1904.method1065(178808912, var7[var8]);
                            }
                        }
                        var9 = this.field1913[var4] ? field1904 : field1912;
                    } else {
                        var9 = field1912;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1065(178808912, var6[0]);
                        var9.method1065(178808912, var6[var10]);
                        var9.method1065(178808912, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1928; var11++) {
                class16 var12 = arg0[this.field1922[var11]][this.field1905[var11]][this.field1919[var11]];
                if (var12 != null && var12.field169) {
                    int[] var13 = this.field1934[var11];
                    class153 var16;
                    if (this.field1915) {
                        int[] var14 = this.field1935[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1904.method1063(var14[var15], 4);
                            }
                        }
                        var16 = this.field1913[var11] ? field1904 : field1912;
                    } else {
                        var16 = field1912;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1063(var13[0], 4);
                        var16.method1063(var13[var17], 4);
                        var16.method1063(var13[var17 + 1], 4);
                    }
                }
            }
        }
        if (field1912.field2611 == 0 && field1904.field2611 == 0) {
            return;
        }
        GL var18 = class147.field2479;
        if (this.field1906 == -1 || arg2) {
            class147.method1002(-1);
            class171.method1211(0, 0, false);
        } else {
            class102.field1821.method621(128, this.field1906);
        }
        int var19 = this.field1908 ? 40 : 36;
        if (this.field1931 == null) {
            if (class147.field2510) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1914.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1914);
            this.field1914.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1914);
            if (class75.field1303) {
                this.field1914.position(16);
                var18.glNormalPointer(5126, var19, this.field1914);
            }
            this.field1914.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1914);
            if (this.field1908) {
                var18.glClientActiveTexture(class319.method2197());
                this.field1914.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1914);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field1931.method337();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class75.field1303) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1908) {
                var18.glClientActiveTexture(class319.method2197());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class147.field2510) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1912.field2611 != 0) {
            if (field1930 == null || field1930.capacity() < field1912.field2611) {
                field1930 = ByteBuffer.allocateDirect(field1912.field2611).order(ByteOrder.nativeOrder());
            } else {
                field1930.clear();
            }
            field1930.put(field1912.field2598, 0, field1912.field2611);
            field1930.flip();
            class147.method1020(arg1);
            var18.glDrawElements(4, field1912.field2611 / 4, 5125, field1930);
        }
        if (field1904.field2611 == 0) {
            return;
        }
        if (field1929 == null || field1929.capacity() < field1904.field2611) {
            field1929 = ByteBuffer.allocateDirect(field1904.field2611).order(ByteOrder.nativeOrder());
        } else {
            field1929.clear();
        }
        field1929.put(field1904.field2598, 0, field1904.field2611);
        field1929.flip();
        class147.method1020(arg1 - 100.0F);
        class147.method1001();
        var18.glDrawElements(4, field1904.field2611 / 4, 5125, field1929);
        class147.method1006();
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 220)
    public final void method737() {
        this.field1933 = new int[this.field1924];
        this.field1911 = new int[this.field1924];
        this.field1918 = new int[this.field1924];
        if (this.field1908) {
            this.field1926 = new float[this.field1924];
        }
        this.field1923 = new int[this.field1924];
        this.field1909 = new float[this.field1924];
        this.field1927 = new float[this.field1924];
        this.field1925 = new float[this.field1924];
        this.field1905 = new int[this.field1910];
        this.field1919 = new int[this.field1910];
        this.field1922 = new int[this.field1910];
        this.field1934 = new int[this.field1910][];
        this.field1932 = new class79(class135.method922(21793, this.field1924));
        if (this.field1915) {
            this.field1935 = new int[this.field1910][];
            this.field1913 = new boolean[this.field1910];
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIFFFIF)I", line = 244)
    public final int method738(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class259 var11 = (class259) this.field1932.method507(var9, 602425312);
            if (var11 != null) {
                if (arg1 < this.field1911[var11.field4431]) {
                    this.field1911[var11.field4431] = arg1;
                }
                return var11.field4431;
            }
        }
        this.field1933[this.field1907] = arg0;
        this.field1911[this.field1907] = arg1;
        this.field1918[this.field1907] = arg2;
        if (this.field1908) {
            this.field1926[this.field1907] = arg7;
        }
        this.field1909[this.field1907] = arg3;
        this.field1927[this.field1907] = arg4;
        this.field1925[this.field1907] = arg5;
        this.field1923[this.field1907] = arg6;
        if (var9 != 0L) {
            this.field1932.method503(var9, -54, new class259(this.field1907));
        }
        return this.field1907++;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class108(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field1906 = arg0;
        this.field1917 = arg1;
        this.field1915 = arg2;
        this.field1908 = arg3;
        this.field1921 = arg4;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V", line = 285)
    public static final void method739() {
        field1912 = null;
        field1904 = null;
        field1930 = null;
        field1929 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III[I[IZ)I", line = 304)
    public final int method740(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1915) {
            this.field1935[this.field1928] = arg4;
            this.field1913[this.field1928] = arg5;
            if (arg4 != null) {
                this.field1916 += arg4.length;
            }
            if (arg5) {
                this.field1916 += (arg3.length - 2) * 3;
            } else {
                this.field1920 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1920 += (arg3.length - 2) * 3;
        }
        this.field1922[this.field1928] = arg0;
        this.field1905[this.field1928] = arg1;
        this.field1919[this.field1928] = arg2;
        this.field1934[this.field1928] = arg3;
        return this.field1928++;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V", line = 327)
    public static void method741() {
        field1912 = null;
        field1904 = null;
        field1930 = null;
        field1929 = null;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()V", line = 347)
    public final void method742() {
        class153 var1 = new class153((this.field1908 ? 40 : 36) * this.field1907);
        for (int var2 = 0; var2 < this.field1907; var2++) {
            if (class147.field2482) {
                var1.method1047((float) this.field1933[var2], -121);
                var1.method1047((float) this.field1911[var2], -84);
                var1.method1047((float) this.field1918[var2], -110);
                var1.method1065(178808912, this.field1923[var2]);
                var1.method1047(this.field1909[var2], -66);
                var1.method1047(this.field1927[var2], -76);
                var1.method1047(this.field1925[var2], -52);
                var1.method1047((float) this.field1933[var2] / this.field1917, -56);
                var1.method1047((float) this.field1918[var2] / this.field1917, -50);
                if (this.field1908) {
                    var1.method1047(this.field1926[var2], -59);
                }
            } else {
                var1.method1081((float) this.field1933[var2], true);
                var1.method1081((float) this.field1911[var2], true);
                var1.method1081((float) this.field1918[var2], true);
                var1.method1065(178808912, this.field1923[var2]);
                var1.method1081(this.field1909[var2], true);
                var1.method1081(this.field1927[var2], true);
                var1.method1081(this.field1925[var2], true);
                var1.method1081((float) this.field1933[var2] / this.field1917, true);
                var1.method1081((float) this.field1918[var2] / this.field1917, true);
                if (this.field1908) {
                    var1.method1081(this.field1926[var2], true);
                }
            }
        }
        if (class147.field2510) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2598, 0, var1.field2611);
            this.field1931 = new class46();
            this.field1931.method338(var3);
        } else {
            this.field1914 = ByteBuffer.allocateDirect(var1.field2611).order(ByteOrder.nativeOrder());
            this.field1914.put(var1.field2598, 0, var1.field2611);
            this.field1914.flip();
        }
        this.field1933 = null;
        this.field1911 = null;
        this.field1918 = null;
        this.field1923 = null;
        this.field1909 = null;
        this.field1927 = null;
        this.field1925 = null;
        this.field1932 = null;
        this.field1926 = null;
    }
}
