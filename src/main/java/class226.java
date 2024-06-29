import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class226 extends class159 {

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field3527 = 0;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    private int field3532 = 0;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public int field3537 = 0;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public int field3546 = 0;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    private int field3550 = 0;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    private int field3555 = 0;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "F")
    private float field3530;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Z")
    public boolean field3548;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Z")
    private boolean field3543;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "Lvj;")
    private class205 field3544;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "Lfh;")
    private static class313 field3551;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "Lfh;")
    private static class313 field3553;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lil;")
    private class4 field3525;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3526;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3539;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3542;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[F")
    private float[] field3534;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[F")
    private float[] field3536;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[F")
    private float[] field3538;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "[F")
    private float[] field3552;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
    private int[] field3528;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "[I")
    private int[] field3531;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
    private int[] field3541;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
    private int[] field3547;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "[I")
    private int[] field3549;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "[I")
    private int[] field3554;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "[I")
    private int[] field3556;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[Z")
    private boolean[] field3533;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[[I")
    private int[][] field3529;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "[[I")
    private int[][] field3545;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[I[IZ)I", line = 6)
    public final int method1531(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3548) {
            this.field3529[this.field3550] = arg4;
            this.field3533[this.field3550] = arg5;
            if (arg4 != null) {
                this.field3532 += arg4.length;
            }
            if (arg5) {
                this.field3532 += (arg3.length - 2) * 3;
            } else {
                this.field3555 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3555 += (arg3.length - 2) * 3;
        }
        this.field3549[this.field3550] = arg0;
        this.field3547[this.field3550] = arg1;
        this.field3554[this.field3550] = arg2;
        this.field3545[this.field3550] = arg3;
        return this.field3550++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V", line = 36)
    public final void method1532() {
        this.field3541 = new int[this.field3537];
        this.field3531 = new int[this.field3537];
        this.field3556 = new int[this.field3537];
        if (this.field3543) {
            this.field3536 = new float[this.field3537];
        }
        this.field3528 = new int[this.field3537];
        this.field3534 = new float[this.field3537];
        this.field3538 = new float[this.field3537];
        this.field3552 = new float[this.field3537];
        this.field3547 = new int[this.field3546];
        this.field3554 = new int[this.field3546];
        this.field3549 = new int[this.field3546];
        this.field3545 = new int[this.field3546][];
        this.field3525 = new class4(class329.method2347(this.field3537, (byte) -96));
        if (this.field3548) {
            this.field3529 = new int[this.field3546][];
            this.field3533 = new boolean[this.field3546];
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class226(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3535 = arg0;
        this.field3530 = arg1;
        this.field3548 = arg2;
        this.field3543 = arg3;
        this.field3540 = arg4;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V", line = 75)
    public final void method1533() {
        class313 var1 = new class313((this.field3543 ? 40 : 36) * this.field3527);
        for (int var2 = 0; var2 < this.field3527; var2++) {
            if (class245.field3895) {
                var1.method2252((float) this.field3541[var2], false);
                var1.method2252((float) this.field3531[var2], false);
                var1.method2252((float) this.field3556[var2], false);
                var1.method2222(this.field3528[var2], 255);
                var1.method2252(this.field3534[var2], false);
                var1.method2252(this.field3538[var2], false);
                var1.method2252(this.field3552[var2], false);
                var1.method2252((float) this.field3541[var2] / this.field3530, false);
                var1.method2252((float) this.field3556[var2] / this.field3530, false);
                if (this.field3543) {
                    var1.method2252(this.field3536[var2], false);
                }
            } else {
                var1.method2219((float) this.field3541[var2], (byte) -125);
                var1.method2219((float) this.field3531[var2], (byte) -127);
                var1.method2219((float) this.field3556[var2], (byte) -128);
                var1.method2222(this.field3528[var2], 255);
                var1.method2219(this.field3534[var2], (byte) -125);
                var1.method2219(this.field3538[var2], (byte) -128);
                var1.method2219(this.field3552[var2], (byte) -128);
                var1.method2219((float) this.field3541[var2] / this.field3530, (byte) -126);
                var1.method2219((float) this.field3556[var2] / this.field3530, (byte) -128);
                if (this.field3543) {
                    var1.method2219(this.field3536[var2], (byte) -125);
                }
            }
        }
        if (class245.field3869) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field5124, 0, var1.field5137);
            this.field3544 = new class205();
            this.field3544.method1396(var3);
        } else {
            this.field3539 = ByteBuffer.allocateDirect(var1.field5137).order(ByteOrder.nativeOrder());
            this.field3539.put(var1.field5124, 0, var1.field5137);
            this.field3539.flip();
        }
        this.field3541 = null;
        this.field3531 = null;
        this.field3556 = null;
        this.field3528 = null;
        this.field3534 = null;
        this.field3538 = null;
        this.field3552 = null;
        this.field3525 = null;
        this.field3536 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()V", line = 148)
    public static void method1534() {
        field3551 = null;
        field3553 = null;
        field3526 = null;
        field3542 = null;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()V", line = 160)
    public static final void method1535() {
        field3551 = null;
        field3553 = null;
        field3526 = null;
        field3542 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIFFFIF)I", line = 172)
    public final int method1536(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class94 var11 = (class94) this.field3525.method29(var9, 103);
            if (var11 != null) {
                if (arg1 < this.field3531[var11.field1373]) {
                    this.field3531[var11.field1373] = arg1;
                }
                return var11.field1373;
            }
        }
        this.field3541[this.field3527] = arg0;
        this.field3531[this.field3527] = arg1;
        this.field3556[this.field3527] = arg2;
        if (this.field3543) {
            this.field3536[this.field3527] = arg7;
        }
        this.field3534[this.field3527] = arg3;
        this.field3538[this.field3527] = arg4;
        this.field3552[this.field3527] = arg5;
        this.field3528[this.field3527] = arg6;
        if (var9 != 0L) {
            this.field3525.method37(false, new class94(this.field3527), var9);
        }
        return this.field3527++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([[[Ljj;FZ)V", line = 207)
    public final void method1537(class50[][][] arg0, float arg1, boolean arg2) {
        if (field3551 == null || field3551.field5124.length < this.field3555 * 4) {
            field3551 = new class313(this.field3555 * 4);
        } else {
            field3551.field5137 = 0;
        }
        if (field3553 == null || field3553.field5124.length < this.field3532 * 4) {
            field3553 = new class313(this.field3532 * 4);
        } else {
            field3553.field5137 = 0;
        }
        if (class245.field3895) {
            for (int var4 = 0; var4 < this.field3550; var4++) {
                class50 var5 = arg0[this.field3549[var4]][this.field3547[var4]][this.field3554[var4]];
                if (var5 != null && var5.field737) {
                    int[] var6 = this.field3545[var4];
                    class313 var9;
                    if (this.field3548) {
                        int[] var7 = this.field3529[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3553.method2222(var7[var8], 255);
                            }
                        }
                        var9 = this.field3533[var4] ? field3553 : field3551;
                    } else {
                        var9 = field3551;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method2222(var6[0], 255);
                        var9.method2222(var6[var10], 255);
                        var9.method2222(var6[var10 + 1], 255);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3550; var11++) {
                class50 var12 = arg0[this.field3549[var11]][this.field3547[var11]][this.field3554[var11]];
                if (var12 != null && var12.field737) {
                    int[] var13 = this.field3545[var11];
                    class313 var16;
                    if (this.field3548) {
                        int[] var14 = this.field3529[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3553.method2210((byte) 75, var14[var15]);
                            }
                        }
                        var16 = this.field3533[var11] ? field3553 : field3551;
                    } else {
                        var16 = field3551;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method2210((byte) -125, var13[0]);
                        var16.method2210((byte) 48, var13[var17]);
                        var16.method2210((byte) -114, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3551.field5137 == 0 && field3553.field5137 == 0) {
            return;
        }
        GL var18 = class245.field3884;
        if (this.field3535 == -1 || arg2) {
            class245.method1729(-1);
            class7.method53(0, 0, true);
        } else {
            class272.field4467.method400((byte) 111, this.field3535);
        }
        int var19 = this.field3543 ? 40 : 36;
        if (this.field3544 == null) {
            if (class245.field3869) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3539.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3539);
            this.field3539.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3539);
            if (class322.field5287) {
                this.field3539.position(16);
                var18.glNormalPointer(5126, var19, this.field3539);
            }
            this.field3539.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3539);
            if (this.field3543) {
                var18.glClientActiveTexture(class106.method700());
                this.field3539.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3539);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3544.method1397();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class322.field5287) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3543) {
                var18.glClientActiveTexture(class106.method700());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class245.field3869) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3551.field5137 != 0) {
            if (field3526 == null || field3526.capacity() < field3551.field5137) {
                field3526 = ByteBuffer.allocateDirect(field3551.field5137).order(ByteOrder.nativeOrder());
            } else {
                field3526.clear();
            }
            field3526.put(field3551.field5124, 0, field3551.field5137);
            field3526.flip();
            class245.method1714(arg1);
            var18.glDrawElements(4, field3551.field5137 / 4, 5125, field3526);
        }
        if (field3553.field5137 == 0) {
            return;
        }
        if (field3542 == null || field3542.capacity() < field3553.field5137) {
            field3542 = ByteBuffer.allocateDirect(field3553.field5137).order(ByteOrder.nativeOrder());
        } else {
            field3542.clear();
        }
        field3542.put(field3553.field5124, 0, field3553.field5137);
        field3542.flip();
        class245.method1714(arg1 - 100.0F);
        class245.method1713();
        var18.glDrawElements(4, field3553.field5137 / 4, 5125, field3542);
        class245.method1724();
    }
}
