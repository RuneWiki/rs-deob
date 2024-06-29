import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 extends class59 {

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    private int field69 = 0;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    private int field76 = 0;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public int field81 = 0;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public int field93 = 0;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public int field87 = 0;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "F")
    private float field66;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "Z")
    public boolean field95;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Z")
    private boolean field71;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "Llb;")
    private static class112 field77;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Llb;")
    private static class112 field91;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "Ltl;")
    private class257 field75;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Lfl;")
    private class86 field80;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field82;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field85;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field86;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "[F")
    private float[] field70;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "[F")
    private float[] field73;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "[F")
    private float[] field74;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "[F")
    private float[] field84;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "[I")
    private int[] field64;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "[I")
    private int[] field72;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "[I")
    private int[] field78;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "[I")
    private int[] field88;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "[I")
    private int[] field89;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "[I")
    private int[] field90;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "[I")
    private int[] field94;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[Z")
    private boolean[] field83;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "[[I")
    private int[][] field67;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "[[I")
    private int[][] field68;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([[[Lnh;FZ)V", line = 7)
    public final void method20(class308[][][] arg0, float arg1, boolean arg2) {
        if (field91 == null || field91.field1607.length < this.field76 * 4) {
            field91 = new class112(this.field76 * 4);
        } else {
            field91.field1640 = 0;
        }
        if (field77 == null || field77.field1607.length < this.field69 * 4) {
            field77 = new class112(this.field69 * 4);
        } else {
            field77.field1640 = 0;
        }
        if (class166.field2642) {
            for (int var4 = 0; var4 < this.field65; var4++) {
                class308 var5 = arg0[this.field88[var4]][this.field78[var4]][this.field90[var4]];
                if (var5 != null && var5.field5200) {
                    int[] var6 = this.field68[var4];
                    class112 var9;
                    if (this.field95) {
                        int[] var7 = this.field67[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field77.method787(853918096, var7[var8]);
                            }
                        }
                        var9 = this.field83[var4] ? field77 : field91;
                    } else {
                        var9 = field91;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method787(853918096, var6[0]);
                        var9.method787(853918096, var6[var10]);
                        var9.method787(853918096, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field65; var11++) {
                class308 var12 = arg0[this.field88[var11]][this.field78[var11]][this.field90[var11]];
                if (var12 != null && var12.field5200) {
                    int[] var13 = this.field68[var11];
                    class112 var16;
                    if (this.field95) {
                        int[] var14 = this.field67[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field77.method804(true, var14[var15]);
                            }
                        }
                        var16 = this.field83[var11] ? field77 : field91;
                    } else {
                        var16 = field91;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method804(true, var13[0]);
                        var16.method804(true, var13[var17]);
                        var16.method804(true, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field91.field1640 == 0 && field77.field1640 == 0) {
            return;
        }
        GL var18 = class166.field2648;
        if (this.field92 == -1 || arg2) {
            class166.method1182(-1);
            class274.method1934(0, 0, (byte) -22);
        } else {
            class31.field461.method692(0, this.field92);
        }
        int var19 = this.field71 ? 40 : 36;
        if (this.field75 == null) {
            if (class166.field2622) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field85.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field85);
            this.field85.position(12);
            var18.glColorPointer(4, 5121, var19, this.field85);
            if (class66.field1006) {
                this.field85.position(16);
                var18.glNormalPointer(5126, var19, this.field85);
            }
            this.field85.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field85);
            if (this.field71) {
                var18.glClientActiveTexture(class56.method393());
                this.field85.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field85);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field75.method1823();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class66.field1006) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field71) {
                var18.glClientActiveTexture(class56.method393());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class166.field2622) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field91.field1640 != 0) {
            if (field82 == null || field82.capacity() < field91.field1640) {
                field82 = ByteBuffer.allocateDirect(field91.field1640).order(ByteOrder.nativeOrder());
            } else {
                field82.clear();
            }
            field82.put(field91.field1607, 0, field91.field1640);
            field82.flip();
            class166.method1164(arg1);
            var18.glDrawElements(4, field91.field1640 / 4, 5125, field82);
        }
        if (field77.field1640 == 0) {
            return;
        }
        if (field86 == null || field86.capacity() < field77.field1640) {
            field86 = ByteBuffer.allocateDirect(field77.field1640).order(ByteOrder.nativeOrder());
        } else {
            field86.clear();
        }
        field86.put(field77.field1607, 0, field77.field1640);
        field86.flip();
        class166.method1164(arg1 - 100.0F);
        class166.method1184();
        var18.glDrawElements(4, field77.field1640 / 4, 5125, field86);
        class166.method1172();
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class6(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field92 = arg0;
        this.field66 = arg1;
        this.field95 = arg2;
        this.field71 = arg3;
        this.field79 = arg4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V", line = 224)
    public final void method21() {
        this.field94 = new int[this.field93];
        this.field64 = new int[this.field93];
        this.field72 = new int[this.field93];
        if (this.field71) {
            this.field70 = new float[this.field93];
        }
        this.field89 = new int[this.field93];
        this.field74 = new float[this.field93];
        this.field73 = new float[this.field93];
        this.field84 = new float[this.field93];
        this.field78 = new int[this.field87];
        this.field90 = new int[this.field87];
        this.field88 = new int[this.field87];
        this.field68 = new int[this.field87][];
        this.field80 = new class86(class110.method746(this.field93, -705295902));
        if (this.field95) {
            this.field67 = new int[this.field87][];
            this.field83 = new boolean[this.field87];
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()V", line = 253)
    public static final void method22() {
        field91 = null;
        field77 = null;
        field82 = null;
        field86 = null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()V", line = 259)
    public static void method23() {
        field91 = null;
        field77 = null;
        field82 = null;
        field86 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIFFFIF)I", line = 270)
    public final int method24(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class55 var11 = (class55) this.field80.method617(var9, false);
            if (var11 != null) {
                if (arg1 < this.field64[var11.field804]) {
                    this.field64[var11.field804] = arg1;
                }
                return var11.field804;
            }
        }
        this.field94[this.field81] = arg0;
        this.field64[this.field81] = arg1;
        this.field72[this.field81] = arg2;
        if (this.field71) {
            this.field70[this.field81] = arg7;
        }
        this.field74[this.field81] = arg3;
        this.field73[this.field81] = arg4;
        this.field84[this.field81] = arg5;
        this.field89[this.field81] = arg6;
        if (var9 != 0L) {
            this.field80.method610(90, new class55(this.field81), var9);
        }
        return this.field81++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[I[IZ)I", line = 304)
    public final int method25(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field95) {
            this.field67[this.field65] = arg4;
            this.field83[this.field65] = arg5;
            if (arg4 != null) {
                this.field69 += arg4.length;
            }
            if (arg5) {
                this.field69 += (arg3.length - 2) * 3;
            } else {
                this.field76 += (arg3.length - 2) * 3;
            }
        } else {
            this.field76 += (arg3.length - 2) * 3;
        }
        this.field88[this.field65] = arg0;
        this.field78[this.field65] = arg1;
        this.field90[this.field65] = arg2;
        this.field68[this.field65] = arg3;
        return this.field65++;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()V", line = 345)
    public final void method26() {
        class112 var1 = new class112((this.field71 ? 40 : 36) * this.field81);
        for (int var2 = 0; var2 < this.field81; var2++) {
            if (class166.field2642) {
                var1.method770(false, (float) this.field94[var2]);
                var1.method770(false, (float) this.field64[var2]);
                var1.method770(false, (float) this.field72[var2]);
                var1.method787(853918096, this.field89[var2]);
                var1.method770(false, this.field74[var2]);
                var1.method770(false, this.field73[var2]);
                var1.method770(false, this.field84[var2]);
                var1.method770(false, (float) this.field94[var2] / this.field66);
                var1.method770(false, (float) this.field72[var2] / this.field66);
                if (this.field71) {
                    var1.method770(false, this.field70[var2]);
                }
            } else {
                var1.method812(-17216, (float) this.field94[var2]);
                var1.method812(-17216, (float) this.field64[var2]);
                var1.method812(-17216, (float) this.field72[var2]);
                var1.method787(853918096, this.field89[var2]);
                var1.method812(-17216, this.field74[var2]);
                var1.method812(-17216, this.field73[var2]);
                var1.method812(-17216, this.field84[var2]);
                var1.method812(-17216, (float) this.field94[var2] / this.field66);
                var1.method812(-17216, (float) this.field72[var2] / this.field66);
                if (this.field71) {
                    var1.method812(-17216, this.field70[var2]);
                }
            }
        }
        if (class166.field2622) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1607, 0, var1.field1640);
            this.field75 = new class257();
            this.field75.method1821(var3);
        } else {
            this.field85 = ByteBuffer.allocateDirect(var1.field1640).order(ByteOrder.nativeOrder());
            this.field85.put(var1.field1607, 0, var1.field1640);
            this.field85.flip();
        }
        this.field94 = null;
        this.field64 = null;
        this.field72 = null;
        this.field89 = null;
        this.field74 = null;
        this.field73 = null;
        this.field84 = null;
        this.field80 = null;
        this.field70 = null;
    }
}
