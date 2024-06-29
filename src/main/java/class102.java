import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class102 extends class70 {

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    private int field1862 = 0;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public int field1856 = 0;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field1854 = 0;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    private int field1866 = 0;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    private int field1876 = 0;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public int field1879 = 0;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "F")
    private float field1851;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "Z")
    public boolean field1858;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Z")
    private boolean field1865;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Loe;")
    private static class146 field1857;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "Loe;")
    private static class146 field1874;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lkf;")
    private class249 field1850;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "Ll;")
    private class328 field1875;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1864;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1870;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1873;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "[F")
    private float[] field1852;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "[F")
    private float[] field1853;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[F")
    private float[] field1855;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "[F")
    private float[] field1860;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "[I")
    private int[] field1859;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "[I")
    private int[] field1869;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "[I")
    private int[] field1871;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "[I")
    private int[] field1877;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "[I")
    private int[] field1878;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "[I")
    private int[] field1880;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "[I")
    private int[] field1881;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "[Z")
    private boolean[] field1863;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "[[I")
    private int[][] field1867;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "[[I")
    private int[][] field1868;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V", line = 6)
    public static final void method768() {
        field1874 = null;
        field1857 = null;
        field1864 = null;
        field1873 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()V", line = 12)
    public final void method769() {
        this.field1871 = new int[this.field1879];
        this.field1869 = new int[this.field1879];
        this.field1880 = new int[this.field1879];
        if (this.field1865) {
            this.field1853 = new float[this.field1879];
        }
        this.field1878 = new int[this.field1879];
        this.field1860 = new float[this.field1879];
        this.field1855 = new float[this.field1879];
        this.field1852 = new float[this.field1879];
        this.field1877 = new int[this.field1854];
        this.field1881 = new int[this.field1854];
        this.field1859 = new int[this.field1854];
        this.field1867 = new int[this.field1854][];
        this.field1875 = new class328(class311.method2264(this.field1879, (byte) -71));
        if (this.field1858) {
            this.field1868 = new int[this.field1854][];
            this.field1863 = new boolean[this.field1854];
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V", line = 37)
    public final void method770() {
        class146 var1 = new class146((this.field1865 ? 40 : 36) * this.field1856);
        for (int var2 = 0; var2 < this.field1856; var2++) {
            if (class241.field4007) {
                var1.method1006((byte) 120, (float) this.field1871[var2]);
                var1.method1006((byte) 118, (float) this.field1869[var2]);
                var1.method1006((byte) 121, (float) this.field1880[var2]);
                var1.method1045((byte) 126, this.field1878[var2]);
                var1.method1006((byte) 111, this.field1860[var2]);
                var1.method1006((byte) 120, this.field1855[var2]);
                var1.method1006((byte) 118, this.field1852[var2]);
                var1.method1006((byte) 120, (float) this.field1871[var2] / this.field1851);
                var1.method1006((byte) 117, (float) this.field1880[var2] / this.field1851);
                if (this.field1865) {
                    var1.method1006((byte) 108, this.field1853[var2]);
                }
            } else {
                var1.method1001(-111, (float) this.field1871[var2]);
                var1.method1001(-93, (float) this.field1869[var2]);
                var1.method1001(-74, (float) this.field1880[var2]);
                var1.method1045((byte) -44, this.field1878[var2]);
                var1.method1001(-125, this.field1860[var2]);
                var1.method1001(-26, this.field1855[var2]);
                var1.method1001(-44, this.field1852[var2]);
                var1.method1001(-24, (float) this.field1871[var2] / this.field1851);
                var1.method1001(-23, (float) this.field1880[var2] / this.field1851);
                if (this.field1865) {
                    var1.method1001(-71, this.field1853[var2]);
                }
            }
        }
        if (class241.field4020) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2496, 0, var1.field2435);
            this.field1850 = new class249();
            this.field1850.method1756(var3);
        } else {
            this.field1870 = ByteBuffer.allocateDirect(var1.field2435).order(ByteOrder.nativeOrder());
            this.field1870.put(var1.field2496, 0, var1.field2435);
            this.field1870.flip();
        }
        this.field1871 = null;
        this.field1869 = null;
        this.field1880 = null;
        this.field1878 = null;
        this.field1860 = null;
        this.field1855 = null;
        this.field1852 = null;
        this.field1875 = null;
        this.field1853 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III[I[IZ)I", line = 103)
    public final int method771(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1858) {
            this.field1868[this.field1866] = arg4;
            this.field1863[this.field1866] = arg5;
            if (arg4 != null) {
                this.field1876 += arg4.length;
            }
            if (arg5) {
                this.field1876 += (arg3.length - 2) * 3;
            } else {
                this.field1862 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1862 += (arg3.length - 2) * 3;
        }
        this.field1859[this.field1866] = arg0;
        this.field1877[this.field1866] = arg1;
        this.field1881[this.field1866] = arg2;
        this.field1867[this.field1866] = arg3;
        return this.field1866++;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "()V", line = 131)
    public static void method772() {
        field1874 = null;
        field1857 = null;
        field1864 = null;
        field1873 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([[[Lee;FZ)V", line = 140)
    public final void method773(class312[][][] arg0, float arg1, boolean arg2) {
        if (field1874 == null || field1874.field2496.length < this.field1862 * 4) {
            field1874 = new class146(this.field1862 * 4);
        } else {
            field1874.field2435 = 0;
        }
        if (field1857 == null || field1857.field2496.length < this.field1876 * 4) {
            field1857 = new class146(this.field1876 * 4);
        } else {
            field1857.field2435 = 0;
        }
        if (class241.field4007) {
            for (int var4 = 0; var4 < this.field1866; var4++) {
                class312 var5 = arg0[this.field1859[var4]][this.field1877[var4]][this.field1881[var4]];
                if (var5 != null && var5.field5081) {
                    int[] var6 = this.field1867[var4];
                    class146 var9;
                    if (this.field1858) {
                        int[] var7 = this.field1868[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field1857.method1045((byte) 125, var7[var8]);
                            }
                        }
                        var9 = this.field1863[var4] ? field1857 : field1874;
                    } else {
                        var9 = field1874;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1045((byte) -54, var6[0]);
                        var9.method1045((byte) -52, var6[var10]);
                        var9.method1045((byte) -113, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1866; var11++) {
                class312 var12 = arg0[this.field1859[var11]][this.field1877[var11]][this.field1881[var11]];
                if (var12 != null && var12.field5081) {
                    int[] var13 = this.field1867[var11];
                    class146 var16;
                    if (this.field1858) {
                        int[] var14 = this.field1868[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1857.method1040((byte) -113, var14[var15]);
                            }
                        }
                        var16 = this.field1863[var11] ? field1857 : field1874;
                    } else {
                        var16 = field1874;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1040((byte) -121, var13[0]);
                        var16.method1040((byte) -115, var13[var17]);
                        var16.method1040((byte) -107, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field1874.field2435 == 0 && field1857.field2435 == 0) {
            return;
        }
        GL var18 = class241.field4012;
        if (this.field1861 == -1 || arg2) {
            class241.method1687(-1);
            class109.method815(-117, 0, 0);
        } else {
            class305.field4968.method77((byte) -126, this.field1861);
        }
        int var19 = this.field1865 ? 40 : 36;
        if (this.field1850 == null) {
            if (class241.field4020) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1870.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1870);
            this.field1870.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1870);
            if (class281.field4606) {
                this.field1870.position(16);
                var18.glNormalPointer(5126, var19, this.field1870);
            }
            this.field1870.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1870);
            if (this.field1865) {
                var18.glClientActiveTexture(class64.method515());
                this.field1870.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1870);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field1850.method1755();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class281.field4606) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1865) {
                var18.glClientActiveTexture(class64.method515());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class241.field4020) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1874.field2435 != 0) {
            if (field1864 == null || field1864.capacity() < field1874.field2435) {
                field1864 = ByteBuffer.allocateDirect(field1874.field2435).order(ByteOrder.nativeOrder());
            } else {
                field1864.clear();
            }
            field1864.put(field1874.field2496, 0, field1874.field2435);
            field1864.flip();
            class241.method1699(arg1);
            var18.glDrawElements(4, field1874.field2435 / 4, 5125, field1864);
        }
        if (field1857.field2435 == 0) {
            return;
        }
        if (field1873 == null || field1873.capacity() < field1857.field2435) {
            field1873 = ByteBuffer.allocateDirect(field1857.field2435).order(ByteOrder.nativeOrder());
        } else {
            field1873.clear();
        }
        field1873.put(field1857.field2496, 0, field1857.field2435);
        field1873.flip();
        class241.method1699(arg1 - 100.0F);
        class241.method1689();
        var18.glDrawElements(4, field1857.field2435 / 4, 5125, field1873);
        class241.method1700();
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class102(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field1861 = arg0;
        this.field1851 = arg1;
        this.field1858 = arg2;
        this.field1865 = arg3;
        this.field1872 = arg4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIFFFIF)I", line = 364)
    public final int method774(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class111 var11 = (class111) this.field1875.method2344(-1, var9);
            if (var11 != null) {
                if (arg1 < this.field1869[var11.field2030]) {
                    this.field1869[var11.field2030] = arg1;
                }
                return var11.field2030;
            }
        }
        this.field1871[this.field1856] = arg0;
        this.field1869[this.field1856] = arg1;
        this.field1880[this.field1856] = arg2;
        if (this.field1865) {
            this.field1853[this.field1856] = arg7;
        }
        this.field1860[this.field1856] = arg3;
        this.field1855[this.field1856] = arg4;
        this.field1852[this.field1856] = arg5;
        this.field1878[this.field1856] = arg6;
        if (var9 != 0L) {
            this.field1875.method2337(new class111(this.field1856), 709, var9);
        }
        return this.field1856++;
    }
}
