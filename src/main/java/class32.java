import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class32 extends class287 {

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public int field439 = 0;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public int field448 = 0;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    private int field465 = 0;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public int field452 = 0;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    private int field444 = 0;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "F")
    private float field460;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Z")
    public boolean field445;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Z")
    private boolean field451;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Ls;")
    private static class170 field442;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "Ls;")
    private static class170 field457;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Ljh;")
    private class225 field447;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Leh;")
    private class94 field467;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field440;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field450;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field455;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[F")
    private float[] field437;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "[F")
    private float[] field438;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[F")
    private float[] field441;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "[F")
    private float[] field461;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "[I")
    private int[] field436;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "[I")
    private int[] field443;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "[I")
    private int[] field454;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "[I")
    private int[] field459;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "[I")
    private int[] field462;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "[I")
    private int[] field463;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "[I")
    private int[] field464;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "[Z")
    private boolean[] field458;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "[[I")
    private int[][] field446;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "[[I")
    private int[][] field449;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V", line = 8)
    public static void method209() {
        field442 = null;
        field457 = null;
        field440 = null;
        field450 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()V", line = 21)
    public final void method210() {
        this.field443 = new int[this.field448];
        this.field463 = new int[this.field448];
        this.field462 = new int[this.field448];
        if (this.field451) {
            this.field438 = new float[this.field448];
        }
        this.field454 = new int[this.field448];
        this.field461 = new float[this.field448];
        this.field441 = new float[this.field448];
        this.field437 = new float[this.field448];
        this.field459 = new int[this.field452];
        this.field436 = new int[this.field452];
        this.field464 = new int[this.field452];
        this.field449 = new int[this.field452][];
        this.field467 = new class94(class43.method293(true, this.field448));
        if (this.field445) {
            this.field446 = new int[this.field452][];
            this.field458 = new boolean[this.field452];
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()V", line = 45)
    public final void method211() {
        class170 var1 = new class170((this.field451 ? 40 : 36) * this.field439);
        for (int var2 = 0; var2 < this.field439; var2++) {
            if (class55.field819) {
                var1.method1230((byte) 106, (float) this.field443[var2]);
                var1.method1230((byte) 119, (float) this.field463[var2]);
                var1.method1230((byte) 114, (float) this.field462[var2]);
                var1.method1213(-1, this.field454[var2]);
                var1.method1230((byte) 116, this.field461[var2]);
                var1.method1230((byte) 115, this.field441[var2]);
                var1.method1230((byte) 93, this.field437[var2]);
                var1.method1230((byte) 108, (float) this.field443[var2] / this.field460);
                var1.method1230((byte) 89, (float) this.field462[var2] / this.field460);
                if (this.field451) {
                    var1.method1230((byte) 114, this.field438[var2]);
                }
            } else {
                var1.method1252((float) this.field443[var2], 106);
                var1.method1252((float) this.field463[var2], 78);
                var1.method1252((float) this.field462[var2], 114);
                var1.method1213(-1, this.field454[var2]);
                var1.method1252(this.field461[var2], -59);
                var1.method1252(this.field441[var2], -12);
                var1.method1252(this.field437[var2], -49);
                var1.method1252((float) this.field443[var2] / this.field460, 110);
                var1.method1252((float) this.field462[var2] / this.field460, -54);
                if (this.field451) {
                    var1.method1252(this.field438[var2], -89);
                }
            }
        }
        if (class55.field798) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2758, 0, var1.field2787);
            this.field447 = new class225();
            this.field447.method1550(var3);
        } else {
            this.field455 = ByteBuffer.allocateDirect(var1.field2787).order(ByteOrder.nativeOrder());
            this.field455.put(var1.field2758, 0, var1.field2787);
            this.field455.flip();
        }
        this.field443 = null;
        this.field463 = null;
        this.field462 = null;
        this.field454 = null;
        this.field461 = null;
        this.field441 = null;
        this.field437 = null;
        this.field467 = null;
        this.field438 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([[[Lcd;FZ)V", line = 119)
    public final void method212(class245[][][] arg0, float arg1, boolean arg2) {
        if (field442 == null || field442.field2758.length < this.field465 * 4) {
            field442 = new class170(this.field465 * 4);
        } else {
            field442.field2787 = 0;
        }
        if (field457 == null || field457.field2758.length < this.field453 * 4) {
            field457 = new class170(this.field453 * 4);
        } else {
            field457.field2787 = 0;
        }
        if (class55.field819) {
            for (int var4 = 0; var4 < this.field444; var4++) {
                class245 var5 = arg0[this.field464[var4]][this.field459[var4]][this.field436[var4]];
                if (var5 != null && var5.field4095) {
                    int[] var6 = this.field449[var4];
                    class170 var9;
                    if (this.field445) {
                        int[] var7 = this.field446[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field457.method1213(-1, var7[var8]);
                            }
                        }
                        var9 = this.field458[var4] ? field457 : field442;
                    } else {
                        var9 = field442;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1213(-1, var6[0]);
                        var9.method1213(-1, var6[var10]);
                        var9.method1213(-1, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field444; var11++) {
                class245 var12 = arg0[this.field464[var11]][this.field459[var11]][this.field436[var11]];
                if (var12 != null && var12.field4095) {
                    int[] var13 = this.field449[var11];
                    class170 var16;
                    if (this.field445) {
                        int[] var14 = this.field446[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field457.method1225(var14[var15], true);
                            }
                        }
                        var16 = this.field458[var11] ? field457 : field442;
                    } else {
                        var16 = field442;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1225(var13[0], true);
                        var16.method1225(var13[var17], true);
                        var16.method1225(var13[var17 + 1], true);
                    }
                }
            }
        }
        if (field442.field2787 == 0 && field457.field2787 == 0) {
            return;
        }
        GL var18 = class55.field812;
        if (this.field456 == -1 || arg2) {
            class55.method407(-1);
            class131.method963(-12390, 0, 0);
        } else {
            class298.field5107.method375(this.field456, 255);
        }
        int var19 = this.field451 ? 40 : 36;
        if (this.field447 == null) {
            if (class55.field798) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field455.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field455);
            this.field455.position(12);
            var18.glColorPointer(4, 5121, var19, this.field455);
            if (class308.field5243) {
                this.field455.position(16);
                var18.glNormalPointer(5126, var19, this.field455);
            }
            this.field455.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field455);
            if (this.field451) {
                var18.glClientActiveTexture(class76.method599());
                this.field455.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field455);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field447.method1548();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class308.field5243) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field451) {
                var18.glClientActiveTexture(class76.method599());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class55.field798) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field442.field2787 != 0) {
            if (field440 == null || field440.capacity() < field442.field2787) {
                field440 = ByteBuffer.allocateDirect(field442.field2787).order(ByteOrder.nativeOrder());
            } else {
                field440.clear();
            }
            field440.put(field442.field2758, 0, field442.field2787);
            field440.flip();
            class55.method391(arg1);
            var18.glDrawElements(4, field442.field2787 / 4, 5125, field440);
        }
        if (field457.field2787 == 0) {
            return;
        }
        if (field450 == null || field450.capacity() < field457.field2787) {
            field450 = ByteBuffer.allocateDirect(field457.field2787).order(ByteOrder.nativeOrder());
        } else {
            field450.clear();
        }
        field450.put(field457.field2758, 0, field457.field2787);
        field450.flip();
        class55.method391(arg1 - 100.0F);
        class55.method390();
        var18.glDrawElements(4, field457.field2787 / 4, 5125, field450);
        class55.method411();
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IFZZI)V", line = 394)
    public class32(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field456 = arg0;
        this.field460 = arg1;
        this.field445 = arg2;
        this.field451 = arg3;
        this.field466 = arg4;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "()V", line = 344)
    public static final void method213() {
        field442 = null;
        field457 = null;
        field440 = null;
        field450 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIFFFIF)I", line = 351)
    public final int method214(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class174 var11 = (class174) this.field467.method685(var9, 128);
            if (var11 != null) {
                if (arg1 < this.field463[var11.field2851]) {
                    this.field463[var11.field2851] = arg1;
                }
                return var11.field2851;
            }
        }
        this.field443[this.field439] = arg0;
        this.field463[this.field439] = arg1;
        this.field462[this.field439] = arg2;
        if (this.field451) {
            this.field438[this.field439] = arg7;
        }
        this.field461[this.field439] = arg3;
        this.field441[this.field439] = arg4;
        this.field437[this.field439] = arg5;
        this.field454[this.field439] = arg6;
        if (var9 != 0L) {
            this.field467.method694(new class174(this.field439), (byte) -90, var9);
        }
        return this.field439++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III[I[IZ)I", line = 402)
    public final int method215(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field445) {
            this.field446[this.field444] = arg4;
            this.field458[this.field444] = arg5;
            if (arg4 != null) {
                this.field453 += arg4.length;
            }
            if (arg5) {
                this.field453 += (arg3.length - 2) * 3;
            } else {
                this.field465 += (arg3.length - 2) * 3;
            }
        } else {
            this.field465 += (arg3.length - 2) * 3;
        }
        this.field464[this.field444] = arg0;
        this.field459[this.field444] = arg1;
        this.field436[this.field444] = arg2;
        this.field449[this.field444] = arg3;
        return this.field444++;
    }
}
