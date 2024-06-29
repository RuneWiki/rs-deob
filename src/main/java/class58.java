import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class58 extends class5 {

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public int field756 = 0;

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "I")
    private int field766 = 0;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public int field761 = 0;

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "I")
    private int field770 = 0;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    private int field762 = 0;

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "I")
    public int field773 = 0;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "F")
    private float field763;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "Z")
    public boolean field767;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "Z")
    private boolean field752;

    @OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!fn", name = "V", descriptor = "Lde;")
    private class236 field776;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "Lii;")
    private class250 field759;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "Lwm;")
    private static class254 field753;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "Lwm;")
    private static class254 field758;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field765;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field772;

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field775;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "[F")
    private float[] field748;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "[F")
    private float[] field749;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "[F")
    private float[] field755;

    @OriginalMember(owner = "client!fn", name = "X", descriptor = "[F")
    private float[] field778;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "[I")
    private int[] field751;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "[I")
    private int[] field760;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "[I")
    private int[] field764;

    @OriginalMember(owner = "client!fn", name = "N", descriptor = "[I")
    private int[] field768;

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "[I")
    private int[] field771;

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "[I")
    private int[] field774;

    @OriginalMember(owner = "client!fn", name = "W", descriptor = "[I")
    private int[] field777;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "[Z")
    private boolean[] field754;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "[[I")
    private int[][] field757;

    @OriginalMember(owner = "client!fn", name = "Y", descriptor = "[[I")
    private int[][] field779;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "()V", line = 7)
    public final void method408() {
        this.field774 = new int[this.field773];
        this.field751 = new int[this.field773];
        this.field768 = new int[this.field773];
        if (this.field752) {
            this.field749 = new float[this.field773];
        }
        this.field777 = new int[this.field773];
        this.field778 = new float[this.field773];
        this.field748 = new float[this.field773];
        this.field755 = new float[this.field773];
        this.field764 = new int[this.field761];
        this.field760 = new int[this.field761];
        this.field771 = new int[this.field761];
        this.field779 = new int[this.field761][];
        this.field759 = new class250(class312.method2135(984942384, this.field773));
        if (this.field767) {
            this.field757 = new int[this.field761][];
            this.field754 = new boolean[this.field761];
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "()V", line = 37)
    public final void method409() {
        class254 var1 = new class254((this.field752 ? 40 : 36) * this.field756);
        for (int var2 = 0; var2 < this.field756; var2++) {
            if (class73.field1075) {
                var1.method1779((byte) -79, (float) this.field774[var2]);
                var1.method1779((byte) 124, (float) this.field751[var2]);
                var1.method1779((byte) 117, (float) this.field768[var2]);
                var1.method1773(this.field777[var2], false);
                var1.method1779((byte) 124, this.field778[var2]);
                var1.method1779((byte) 119, this.field748[var2]);
                var1.method1779((byte) -39, this.field755[var2]);
                var1.method1779((byte) -8, (float) this.field774[var2] / this.field763);
                var1.method1779((byte) 13, (float) this.field768[var2] / this.field763);
                if (this.field752) {
                    var1.method1779((byte) 119, this.field749[var2]);
                }
            } else {
                var1.method1757(-68, (float) this.field774[var2]);
                var1.method1757(-123, (float) this.field751[var2]);
                var1.method1757(110, (float) this.field768[var2]);
                var1.method1773(this.field777[var2], false);
                var1.method1757(94, this.field778[var2]);
                var1.method1757(-66, this.field748[var2]);
                var1.method1757(124, this.field755[var2]);
                var1.method1757(101, (float) this.field774[var2] / this.field763);
                var1.method1757(-77, (float) this.field768[var2] / this.field763);
                if (this.field752) {
                    var1.method1757(108, this.field749[var2]);
                }
            }
        }
        if (class73.field1066) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3840, 0, var1.field3866);
            this.field776 = new class236();
            this.field776.method1643(var3);
        } else {
            this.field775 = ByteBuffer.allocateDirect(var1.field3866).order(ByteOrder.nativeOrder());
            this.field775.put(var1.field3840, 0, var1.field3866);
            this.field775.flip();
        }
        this.field774 = null;
        this.field751 = null;
        this.field768 = null;
        this.field777 = null;
        this.field778 = null;
        this.field748 = null;
        this.field755 = null;
        this.field759 = null;
        this.field749 = null;
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "()V", line = 103)
    public static void method410() {
        field758 = null;
        field753 = null;
        field765 = null;
        field772 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([[[Lvb;FZ)V", line = 111)
    public final void method411(class79[][][] arg0, float arg1, boolean arg2) {
        if (field758 == null || field758.field3840.length < this.field762 * 4) {
            field758 = new class254(this.field762 * 4);
        } else {
            field758.field3866 = 0;
        }
        if (field753 == null || field753.field3840.length < this.field770 * 4) {
            field753 = new class254(this.field770 * 4);
        } else {
            field753.field3866 = 0;
        }
        if (class73.field1075) {
            for (int var4 = 0; var4 < this.field766; var4++) {
                class79 var5 = arg0[this.field771[var4]][this.field764[var4]][this.field760[var4]];
                if (var5 != null && var5.field1163) {
                    int[] var6 = this.field779[var4];
                    class254 var9;
                    if (this.field767) {
                        int[] var7 = this.field757[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field753.method1773(var7[var8], false);
                            }
                        }
                        var9 = this.field754[var4] ? field753 : field758;
                    } else {
                        var9 = field758;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1773(var6[0], false);
                        var9.method1773(var6[var10], false);
                        var9.method1773(var6[var10 + 1], false);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field766; var11++) {
                class79 var12 = arg0[this.field771[var11]][this.field764[var11]][this.field760[var11]];
                if (var12 != null && var12.field1163) {
                    int[] var13 = this.field779[var11];
                    class254 var16;
                    if (this.field767) {
                        int[] var14 = this.field757[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field753.method1772(var14[var15], (byte) 102);
                            }
                        }
                        var16 = this.field754[var11] ? field753 : field758;
                    } else {
                        var16 = field758;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1772(var13[0], (byte) 120);
                        var16.method1772(var13[var17], (byte) 122);
                        var16.method1772(var13[var17 + 1], (byte) 121);
                    }
                }
            }
        }
        if (field758.field3866 == 0 && field753.field3866 == 0) {
            return;
        }
        GL var18 = class73.field1051;
        if (this.field750 == -1 || arg2) {
            class73.method537(-1);
            class241.method1672(0, -126, 0);
        } else {
            class164.field2662.method663(this.field750, 16374);
        }
        int var19 = this.field752 ? 40 : 36;
        if (this.field776 == null) {
            if (class73.field1066) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field775.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field775);
            this.field775.position(12);
            var18.glColorPointer(4, 5121, var19, this.field775);
            if (class309.field4812) {
                this.field775.position(16);
                var18.glNormalPointer(5126, var19, this.field775);
            }
            this.field775.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field775);
            if (this.field752) {
                var18.glClientActiveTexture(class46.method349());
                this.field775.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field775);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field776.method1644();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class309.field4812) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field752) {
                var18.glClientActiveTexture(class46.method349());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class73.field1066) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field758.field3866 != 0) {
            if (field765 == null || field765.capacity() < field758.field3866) {
                field765 = ByteBuffer.allocateDirect(field758.field3866).order(ByteOrder.nativeOrder());
            } else {
                field765.clear();
            }
            field765.put(field758.field3840, 0, field758.field3866);
            field765.flip();
            class73.method522(arg1);
            var18.glDrawElements(4, field758.field3866 / 4, 5125, field765);
        }
        if (field753.field3866 == 0) {
            return;
        }
        if (field772 == null || field772.capacity() < field753.field3866) {
            field772 = ByteBuffer.allocateDirect(field753.field3866).order(ByteOrder.nativeOrder());
        } else {
            field772.clear();
        }
        field772.put(field753.field3840, 0, field753.field3866);
        field772.flip();
        class73.method522(arg1 - 100.0F);
        class73.method538();
        var18.glDrawElements(4, field753.field3866 / 4, 5125, field772);
        class73.method525();
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class58(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field750 = arg0;
        this.field763 = arg1;
        this.field767 = arg2;
        this.field752 = arg3;
        this.field769 = arg4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[I[IZ)I", line = 321)
    public final int method412(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field767) {
            this.field757[this.field766] = arg4;
            this.field754[this.field766] = arg5;
            if (arg4 != null) {
                this.field770 += arg4.length;
            }
            if (arg5) {
                this.field770 += (arg3.length - 2) * 3;
            } else {
                this.field762 += (arg3.length - 2) * 3;
            }
        } else {
            this.field762 += (arg3.length - 2) * 3;
        }
        this.field771[this.field766] = arg0;
        this.field764[this.field766] = arg1;
        this.field760[this.field766] = arg2;
        this.field779[this.field766] = arg3;
        return this.field766++;
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "()V", line = 348)
    public static final void method413() {
        field758 = null;
        field753 = null;
        field765 = null;
        field772 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIFFFIF)I", line = 375)
    public final int method414(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class293 var11 = (class293) this.field759.method1716(-1, var9);
            if (var11 != null) {
                if (arg1 < this.field751[var11.field4519]) {
                    this.field751[var11.field4519] = arg1;
                }
                return var11.field4519;
            }
        }
        this.field774[this.field756] = arg0;
        this.field751[this.field756] = arg1;
        this.field768[this.field756] = arg2;
        if (this.field752) {
            this.field749[this.field756] = arg7;
        }
        this.field778[this.field756] = arg3;
        this.field748[this.field756] = arg4;
        this.field755[this.field756] = arg5;
        this.field777[this.field756] = arg6;
        if (var9 != 0L) {
            this.field759.method1708(var9, (byte) -79, new class293(this.field756));
        }
        return this.field756++;
    }
}
