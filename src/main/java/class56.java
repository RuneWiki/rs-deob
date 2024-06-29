import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class56 extends class297 {

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field869 = 0;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public int field875 = 0;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    private int field866 = 0;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    private int field887 = 0;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public int field885 = 0;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private int field879 = 0;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "F")
    private float field877;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Z")
    public boolean field870;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "Z")
    private boolean field895;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lbf;")
    private class209 field888;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "Lii;")
    private static class221 field873;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "Lii;")
    private static class221 field894;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Lwk;")
    private class54 field884;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field872;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field878;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field880;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[F")
    private float[] field871;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "[F")
    private float[] field882;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "[F")
    private float[] field889;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "[F")
    private float[] field892;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "[I")
    private int[] field865;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "[I")
    private int[] field867;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "[I")
    private int[] field874;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
    private int[] field876;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "[I")
    private int[] field886;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "[I")
    private int[] field890;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "[I")
    private int[] field891;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "[Z")
    private boolean[] field893;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "[[I")
    private int[][] field868;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "[[I")
    private int[][] field881;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 14)
    public final void method423() {
        class221 var1 = new class221((this.field895 ? 40 : 36) * this.field885);
        for (int var2 = 0; var2 < this.field885; var2++) {
            if (class45.field675) {
                var1.method1538(false, (float) this.field874[var2]);
                var1.method1538(false, (float) this.field865[var2]);
                var1.method1538(false, (float) this.field886[var2]);
                var1.method1513(this.field867[var2], false);
                var1.method1538(false, this.field892[var2]);
                var1.method1538(false, this.field871[var2]);
                var1.method1538(false, this.field889[var2]);
                var1.method1538(false, (float) this.field874[var2] / this.field877);
                var1.method1538(false, (float) this.field886[var2] / this.field877);
                if (this.field895) {
                    var1.method1538(false, this.field882[var2]);
                }
            } else {
                var1.method1558(-72, (float) this.field874[var2]);
                var1.method1558(-116, (float) this.field865[var2]);
                var1.method1558(-103, (float) this.field886[var2]);
                var1.method1513(this.field867[var2], false);
                var1.method1558(-73, this.field892[var2]);
                var1.method1558(-127, this.field871[var2]);
                var1.method1558(-90, this.field889[var2]);
                var1.method1558(-128, (float) this.field874[var2] / this.field877);
                var1.method1558(-70, (float) this.field886[var2] / this.field877);
                if (this.field895) {
                    var1.method1558(-109, this.field882[var2]);
                }
            }
        }
        if (class45.field674) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3617, 0, var1.field3610);
            this.field884 = new class54();
            this.field884.method415(var3);
        } else {
            this.field880 = ByteBuffer.allocateDirect(var1.field3610).order(ByteOrder.nativeOrder());
            this.field880.put(var1.field3617, 0, var1.field3610);
            this.field880.flip();
        }
        this.field874 = null;
        this.field865 = null;
        this.field886 = null;
        this.field867 = null;
        this.field892 = null;
        this.field871 = null;
        this.field889 = null;
        this.field888 = null;
        this.field882 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIFFFIF)I", line = 85)
    public final int method424(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class276 var11 = (class276) this.field888.method1372(false, var9);
            if (var11 != null) {
                if (arg1 < this.field865[var11.field4703]) {
                    this.field865[var11.field4703] = arg1;
                }
                return var11.field4703;
            }
        }
        this.field874[this.field885] = arg0;
        this.field865[this.field885] = arg1;
        this.field886[this.field885] = arg2;
        if (this.field895) {
            this.field882[this.field885] = arg7;
        }
        this.field892[this.field885] = arg3;
        this.field871[this.field885] = arg4;
        this.field889[this.field885] = arg5;
        this.field867[this.field885] = arg6;
        if (var9 != 0L) {
            this.field888.method1376(var9, -1, new class276(this.field885));
        }
        return this.field885++;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IFZZI)V", line = 411)
    public class56(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field883 = arg0;
        this.field877 = arg1;
        this.field870 = arg2;
        this.field895 = arg3;
        this.field896 = arg4;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()V", line = 125)
    public final void method425() {
        this.field874 = new int[this.field875];
        this.field865 = new int[this.field875];
        this.field886 = new int[this.field875];
        if (this.field895) {
            this.field882 = new float[this.field875];
        }
        this.field867 = new int[this.field875];
        this.field892 = new float[this.field875];
        this.field871 = new float[this.field875];
        this.field889 = new float[this.field875];
        this.field876 = new int[this.field869];
        this.field891 = new int[this.field869];
        this.field890 = new int[this.field869];
        this.field868 = new int[this.field869][];
        this.field888 = new class209(class275.method1871(this.field875, 1110164296));
        if (this.field870) {
            this.field881 = new int[this.field869][];
            this.field893 = new boolean[this.field869];
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()V", line = 148)
    public static void method426() {
        field873 = null;
        field894 = null;
        field878 = null;
        field872 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([[[Lek;FZ)V", line = 165)
    public final void method427(class198[][][] arg0, float arg1, boolean arg2) {
        if (field873 == null || field873.field3617.length < this.field879 * 4) {
            field873 = new class221(this.field879 * 4);
        } else {
            field873.field3610 = 0;
        }
        if (field894 == null || field894.field3617.length < this.field866 * 4) {
            field894 = new class221(this.field866 * 4);
        } else {
            field894.field3610 = 0;
        }
        if (class45.field675) {
            for (int var4 = 0; var4 < this.field887; var4++) {
                class198 var5 = arg0[this.field890[var4]][this.field876[var4]][this.field891[var4]];
                if (var5 != null && var5.field3157) {
                    int[] var6 = this.field868[var4];
                    class221 var9;
                    if (this.field870) {
                        int[] var7 = this.field881[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field894.method1513(var7[var8], false);
                            }
                        }
                        var9 = this.field893[var4] ? field894 : field873;
                    } else {
                        var9 = field873;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1513(var6[0], false);
                        var9.method1513(var6[var10], false);
                        var9.method1513(var6[var10 + 1], false);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field887; var11++) {
                class198 var12 = arg0[this.field890[var11]][this.field876[var11]][this.field891[var11]];
                if (var12 != null && var12.field3157) {
                    int[] var13 = this.field868[var11];
                    class221 var16;
                    if (this.field870) {
                        int[] var14 = this.field881[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field894.method1511(var14[var15], (byte) 109);
                            }
                        }
                        var16 = this.field893[var11] ? field894 : field873;
                    } else {
                        var16 = field873;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1511(var13[0], (byte) 116);
                        var16.method1511(var13[var17], (byte) 121);
                        var16.method1511(var13[var17 + 1], (byte) 95);
                    }
                }
            }
        }
        if (field873.field3610 == 0 && field894.field3610 == 0) {
            return;
        }
        GL var18 = class45.field688;
        if (this.field883 == -1 || arg2) {
            class45.method321(-1);
            class264.method1814(0, 0, (byte) 83);
        } else {
            class229.field3802.method1102(this.field883, 255);
        }
        int var19 = this.field895 ? 40 : 36;
        if (this.field884 == null) {
            if (class45.field674) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field880.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field880);
            this.field880.position(12);
            var18.glColorPointer(4, 5121, var19, this.field880);
            if (class8.field114) {
                this.field880.position(16);
                var18.glNormalPointer(5126, var19, this.field880);
            }
            this.field880.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field880);
            if (this.field895) {
                var18.glClientActiveTexture(class3.method13());
                this.field880.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field880);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field884.method414();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class8.field114) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field895) {
                var18.glClientActiveTexture(class3.method13());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class45.field674) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field873.field3610 != 0) {
            if (field878 == null || field878.capacity() < field873.field3610) {
                field878 = ByteBuffer.allocateDirect(field873.field3610).order(ByteOrder.nativeOrder());
            } else {
                field878.clear();
            }
            field878.put(field873.field3617, 0, field873.field3610);
            field878.flip();
            class45.method315(arg1);
            var18.glDrawElements(4, field873.field3610 / 4, 5125, field878);
        }
        if (field894.field3610 == 0) {
            return;
        }
        if (field872 == null || field872.capacity() < field894.field3610) {
            field872 = ByteBuffer.allocateDirect(field894.field3610).order(ByteOrder.nativeOrder());
        } else {
            field872.clear();
        }
        field872.put(field894.field3617, 0, field894.field3610);
        field872.flip();
        class45.method315(arg1 - 100.0F);
        class45.method340();
        var18.glDrawElements(4, field894.field3610 / 4, 5125, field872);
        class45.method341();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[I[IZ)I", line = 383)
    public final int method428(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field870) {
            this.field881[this.field887] = arg4;
            this.field893[this.field887] = arg5;
            if (arg4 != null) {
                this.field866 += arg4.length;
            }
            if (arg5) {
                this.field866 += (arg3.length - 2) * 3;
            } else {
                this.field879 += (arg3.length - 2) * 3;
            }
        } else {
            this.field879 += (arg3.length - 2) * 3;
        }
        this.field890[this.field887] = arg0;
        this.field876[this.field887] = arg1;
        this.field891[this.field887] = arg2;
        this.field868[this.field887] = arg3;
        return this.field887++;
    }
}
