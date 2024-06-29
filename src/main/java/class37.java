import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class37 extends class242 {

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    private int field682 = 0;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    private int field679 = 0;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public int field675 = 0;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public int field688 = 0;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public int field677 = 0;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    private int field691 = 0;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "F")
    private float field686;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "Z")
    public boolean field694;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Z")
    private boolean field678;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "Lkh;")
    private static class14 field696;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "Lkh;")
    private static class14 field701;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lui;")
    private class268 field673;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lph;")
    private class79 field680;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field672;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field681;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field692;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "[F")
    private float[] field685;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "[F")
    private float[] field693;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "[F")
    private float[] field698;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "[F")
    private float[] field700;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[I")
    private int[] field671;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "[I")
    private int[] field676;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "[I")
    private int[] field684;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "[I")
    private int[] field690;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "[I")
    private int[] field699;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
    private int[] field702;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "[Z")
    private boolean[] field697;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "[[I")
    private int[][] field687;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "[[I")
    private int[][] field695;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 9)
    public final void method326() {
        this.field676 = new int[this.field677];
        this.field699 = new int[this.field677];
        this.field671 = new int[this.field677];
        if (this.field678) {
            this.field700 = new float[this.field677];
        }
        this.field702 = new int[this.field677];
        this.field685 = new float[this.field677];
        this.field693 = new float[this.field677];
        this.field698 = new float[this.field677];
        this.field689 = new int[this.field688];
        this.field690 = new int[this.field688];
        this.field684 = new int[this.field688];
        this.field687 = new int[this.field688][];
        this.field673 = new class268(class5.method28(-95, this.field677));
        if (this.field694) {
            this.field695 = new int[this.field688][];
            this.field697 = new boolean[this.field688];
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[[Llf;FZ)V", line = 39)
    public final void method327(class125[][][] arg0, float arg1, boolean arg2) {
        if (field701 == null || field701.field174.length < this.field679 * 4) {
            field701 = new class14(this.field679 * 4);
        } else {
            field701.field195 = 0;
        }
        if (field696 == null || field696.field174.length < this.field682 * 4) {
            field696 = new class14(this.field682 * 4);
        } else {
            field696.field195 = 0;
        }
        if (class108.field1911) {
            for (int var4 = 0; var4 < this.field691; var4++) {
                class125 var5 = arg0[this.field684[var4]][this.field689[var4]][this.field690[var4]];
                if (var5 != null && var5.field2212) {
                    int[] var6 = this.field687[var4];
                    class14 var9;
                    if (this.field694) {
                        int[] var7 = this.field695[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field696.method100(var7[var8], 65280);
                            }
                        }
                        var9 = this.field697[var4] ? field696 : field701;
                    } else {
                        var9 = field701;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method100(var6[0], 65280);
                        var9.method100(var6[var10], 65280);
                        var9.method100(var6[var10 + 1], 65280);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field691; var11++) {
                class125 var12 = arg0[this.field684[var11]][this.field689[var11]][this.field690[var11]];
                if (var12 != null && var12.field2212) {
                    int[] var13 = this.field687[var11];
                    class14 var16;
                    if (this.field694) {
                        int[] var14 = this.field695[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field696.method89((byte) 94, var14[var15]);
                            }
                        }
                        var16 = this.field697[var11] ? field696 : field701;
                    } else {
                        var16 = field701;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method89((byte) 94, var13[0]);
                        var16.method89((byte) 94, var13[var17]);
                        var16.method89((byte) 94, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field701.field195 == 0 && field696.field195 == 0) {
            return;
        }
        GL var18 = class108.field1899;
        if (this.field674 == -1 || arg2) {
            class108.method736(-1);
            class257.method1832((byte) 54, 0, 0);
        } else {
            class227.field3904.method1504(this.field674, 255);
        }
        int var19 = this.field678 ? 40 : 36;
        if (this.field680 == null) {
            if (class108.field1904) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field672.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field672);
            this.field672.position(12);
            var18.glColorPointer(4, 5121, var19, this.field672);
            if (class329.field5607) {
                this.field672.position(16);
                var18.glNormalPointer(5126, var19, this.field672);
            }
            this.field672.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field672);
            if (this.field678) {
                var18.glClientActiveTexture(class154.method1033());
                this.field672.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field672);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field680.method564();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class329.field5607) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field678) {
                var18.glClientActiveTexture(class154.method1033());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class108.field1904) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field701.field195 != 0) {
            if (field692 == null || field692.capacity() < field701.field195) {
                field692 = ByteBuffer.allocateDirect(field701.field195).order(ByteOrder.nativeOrder());
            } else {
                field692.clear();
            }
            field692.put(field701.field174, 0, field701.field195);
            field692.flip();
            class108.method756(arg1);
            var18.glDrawElements(4, field701.field195 / 4, 5125, field692);
        }
        if (field696.field195 == 0) {
            return;
        }
        if (field681 == null || field681.capacity() < field696.field195) {
            field681 = ByteBuffer.allocateDirect(field696.field195).order(ByteOrder.nativeOrder());
        } else {
            field681.clear();
        }
        field681.put(field696.field174, 0, field696.field195);
        field681.flip();
        class108.method756(arg1 - 100.0F);
        class108.method769();
        var18.glDrawElements(4, field696.field195 / 4, 5125, field681);
        class108.method767();
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class37(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field674 = arg0;
        this.field686 = arg1;
        this.field694 = arg2;
        this.field678 = arg3;
        this.field683 = arg4;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 253)
    public static final void method328() {
        field701 = null;
        field696 = null;
        field692 = null;
        field681 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIFFFIF)I", line = 264)
    public final int method329(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class93 var11 = (class93) this.field673.method1890(var9, -105);
            if (var11 != null) {
                if (arg1 < this.field699[var11.field1678]) {
                    this.field699[var11.field1678] = arg1;
                }
                return var11.field1678;
            }
        }
        this.field676[this.field675] = arg0;
        this.field699[this.field675] = arg1;
        this.field671[this.field675] = arg2;
        if (this.field678) {
            this.field700[this.field675] = arg7;
        }
        this.field685[this.field675] = arg3;
        this.field693[this.field675] = arg4;
        this.field698[this.field675] = arg5;
        this.field702[this.field675] = arg6;
        if (var9 != 0L) {
            this.field673.method1885(var9, new class93(this.field675), (byte) -101);
        }
        return this.field675++;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V", line = 299)
    public static void method330() {
        field701 = null;
        field696 = null;
        field692 = null;
        field681 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[I[IZ)I", line = 305)
    public final int method331(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field694) {
            this.field695[this.field691] = arg4;
            this.field697[this.field691] = arg5;
            if (arg4 != null) {
                this.field682 += arg4.length;
            }
            if (arg5) {
                this.field682 += (arg3.length - 2) * 3;
            } else {
                this.field679 += (arg3.length - 2) * 3;
            }
        } else {
            this.field679 += (arg3.length - 2) * 3;
        }
        this.field684[this.field691] = arg0;
        this.field689[this.field691] = arg1;
        this.field690[this.field691] = arg2;
        this.field687[this.field691] = arg3;
        return this.field691++;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V", line = 344)
    public final void method332() {
        class14 var1 = new class14((this.field678 ? 40 : 36) * this.field675);
        for (int var2 = 0; var2 < this.field675; var2++) {
            if (class108.field1911) {
                var1.method130(false, (float) this.field676[var2]);
                var1.method130(false, (float) this.field699[var2]);
                var1.method130(false, (float) this.field671[var2]);
                var1.method100(this.field702[var2], 65280);
                var1.method130(false, this.field685[var2]);
                var1.method130(false, this.field693[var2]);
                var1.method130(false, this.field698[var2]);
                var1.method130(false, (float) this.field676[var2] / this.field686);
                var1.method130(false, (float) this.field671[var2] / this.field686);
                if (this.field678) {
                    var1.method130(false, this.field700[var2]);
                }
            } else {
                var1.method91((float) this.field676[var2], (byte) -115);
                var1.method91((float) this.field699[var2], (byte) -60);
                var1.method91((float) this.field671[var2], (byte) -50);
                var1.method100(this.field702[var2], 65280);
                var1.method91(this.field685[var2], (byte) -36);
                var1.method91(this.field693[var2], (byte) -67);
                var1.method91(this.field698[var2], (byte) 109);
                var1.method91((float) this.field676[var2] / this.field686, (byte) -47);
                var1.method91((float) this.field671[var2] / this.field686, (byte) 115);
                if (this.field678) {
                    var1.method91(this.field700[var2], (byte) 63);
                }
            }
        }
        if (class108.field1904) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field174, 0, var1.field195);
            this.field680 = new class79();
            this.field680.method563(var3);
        } else {
            this.field672 = ByteBuffer.allocateDirect(var1.field195).order(ByteOrder.nativeOrder());
            this.field672.put(var1.field174, 0, var1.field195);
            this.field672.flip();
        }
        this.field676 = null;
        this.field699 = null;
        this.field671 = null;
        this.field702 = null;
        this.field685 = null;
        this.field693 = null;
        this.field698 = null;
        this.field673 = null;
        this.field700 = null;
    }
}
