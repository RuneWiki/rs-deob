import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class204 extends class25 {

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    private int field3483 = 0;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public int field3492 = 0;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    private int field3491 = 0;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public int field3497 = 0;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    private int field3479 = 0;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public int field3487 = 0;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "F")
    private float field3499;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Z")
    public boolean field3478;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "Z")
    private boolean field3498;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Lkh;")
    private static class13 field3476;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "Lkh;")
    private static class13 field3482;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "Ldh;")
    private class159 field3502;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Lul;")
    private class39 field3501;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3475;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3477;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3486;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "[F")
    private float[] field3471;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "[F")
    private float[] field3484;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "[F")
    private float[] field3485;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "[F")
    private float[] field3493;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "[I")
    private int[] field3473;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "[I")
    private int[] field3474;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[I")
    private int[] field3480;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "[I")
    private int[] field3490;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "[I")
    private int[] field3494;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "[I")
    private int[] field3496;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "[I")
    private int[] field3500;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "[Z")
    private boolean[] field3481;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "[[I")
    private int[][] field3489;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "[[I")
    private int[][] field3495;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 11)
    public final void method1424() {
        class13 var1 = new class13((this.field3498 ? 40 : 36) * this.field3487);
        for (int var2 = 0; var2 < this.field3487; var2++) {
            if (class123.field2221) {
                var1.method141((float) this.field3490[var2], -1731515408);
                var1.method141((float) this.field3480[var2], -1731515408);
                var1.method141((float) this.field3473[var2], -1731515408);
                var1.method128((byte) -102, this.field3494[var2]);
                var1.method141(this.field3471[var2], -1731515408);
                var1.method141(this.field3484[var2], -1731515408);
                var1.method141(this.field3493[var2], -1731515408);
                var1.method141((float) this.field3490[var2] / this.field3499, -1731515408);
                var1.method141((float) this.field3473[var2] / this.field3499, -1731515408);
                if (this.field3498) {
                    var1.method141(this.field3485[var2], -1731515408);
                }
            } else {
                var1.method106((float) this.field3490[var2], true);
                var1.method106((float) this.field3480[var2], true);
                var1.method106((float) this.field3473[var2], true);
                var1.method128((byte) 125, this.field3494[var2]);
                var1.method106(this.field3471[var2], true);
                var1.method106(this.field3484[var2], true);
                var1.method106(this.field3493[var2], true);
                var1.method106((float) this.field3490[var2] / this.field3499, true);
                var1.method106((float) this.field3473[var2] / this.field3499, true);
                if (this.field3498) {
                    var1.method106(this.field3485[var2], true);
                }
            }
        }
        if (class123.field2227) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field254, 0, var1.field281);
            this.field3501 = new class39();
            this.field3501.method305(var3);
        } else {
            this.field3486 = ByteBuffer.allocateDirect(var1.field281).order(ByteOrder.nativeOrder());
            this.field3486.put(var1.field254, 0, var1.field281);
            this.field3486.flip();
        }
        this.field3490 = null;
        this.field3480 = null;
        this.field3473 = null;
        this.field3494 = null;
        this.field3471 = null;
        this.field3484 = null;
        this.field3493 = null;
        this.field3502 = null;
        this.field3485 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([[[Lbd;FZ)V", line = 78)
    public final void method1425(class295[][][] arg0, float arg1, boolean arg2) {
        if (field3476 == null || field3476.field254.length < this.field3491 * 4) {
            field3476 = new class13(this.field3491 * 4);
        } else {
            field3476.field281 = 0;
        }
        if (field3482 == null || field3482.field254.length < this.field3483 * 4) {
            field3482 = new class13(this.field3483 * 4);
        } else {
            field3482.field281 = 0;
        }
        if (class123.field2221) {
            for (int var4 = 0; var4 < this.field3479; var4++) {
                class295 var5 = arg0[this.field3496[var4]][this.field3474[var4]][this.field3500[var4]];
                if (var5 != null && var5.field5096) {
                    int[] var6 = this.field3495[var4];
                    class13 var9;
                    if (this.field3478) {
                        int[] var7 = this.field3489[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3482.method128((byte) 111, var7[var8]);
                            }
                        }
                        var9 = this.field3481[var4] ? field3482 : field3476;
                    } else {
                        var9 = field3476;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method128((byte) -80, var6[0]);
                        var9.method128((byte) 124, var6[var10]);
                        var9.method128((byte) 116, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3479; var11++) {
                class295 var12 = arg0[this.field3496[var11]][this.field3474[var11]][this.field3500[var11]];
                if (var12 != null && var12.field5096) {
                    int[] var13 = this.field3495[var11];
                    class13 var16;
                    if (this.field3478) {
                        int[] var14 = this.field3489[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3482.method137(var14[var15], (byte) -72);
                            }
                        }
                        var16 = this.field3481[var11] ? field3482 : field3476;
                    } else {
                        var16 = field3476;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method137(var13[0], (byte) 68);
                        var16.method137(var13[var17], (byte) -41);
                        var16.method137(var13[var17 + 1], (byte) -119);
                    }
                }
            }
        }
        if (field3476.field281 == 0 && field3482.field281 == 0) {
            return;
        }
        GL var18 = class123.field2212;
        if (this.field3472 == -1 || arg2) {
            class123.method867(-1);
            class125.method908(0, -5, 0);
        } else {
            class50.field816.method668(this.field3472, -16147);
        }
        int var19 = this.field3498 ? 40 : 36;
        if (this.field3501 == null) {
            if (class123.field2227) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3486.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3486);
            this.field3486.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3486);
            if (class274.field4701) {
                this.field3486.position(16);
                var18.glNormalPointer(5126, var19, this.field3486);
            }
            this.field3486.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3486);
            if (this.field3498) {
                var18.glClientActiveTexture(class68.method560());
                this.field3486.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3486);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3501.method301();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class274.field4701) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3498) {
                var18.glClientActiveTexture(class68.method560());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class123.field2227) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3476.field281 != 0) {
            if (field3477 == null || field3477.capacity() < field3476.field281) {
                field3477 = ByteBuffer.allocateDirect(field3476.field281).order(ByteOrder.nativeOrder());
            } else {
                field3477.clear();
            }
            field3477.put(field3476.field254, 0, field3476.field281);
            field3477.flip();
            class123.method875(arg1);
            var18.glDrawElements(4, field3476.field281 / 4, 5125, field3477);
        }
        if (field3482.field281 == 0) {
            return;
        }
        if (field3475 == null || field3475.capacity() < field3482.field281) {
            field3475 = ByteBuffer.allocateDirect(field3482.field281).order(ByteOrder.nativeOrder());
        } else {
            field3475.clear();
        }
        field3475.put(field3482.field254, 0, field3482.field281);
        field3475.flip();
        class123.method875(arg1 - 100.0F);
        class123.method891();
        var18.glDrawElements(4, field3482.field281 / 4, 5125, field3475);
        class123.method872();
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 284)
    public static final void method1426() {
        field3476 = null;
        field3482 = null;
        field3477 = null;
        field3475 = null;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V", line = 291)
    public static void method1427() {
        field3476 = null;
        field3482 = null;
        field3477 = null;
        field3475 = null;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()V", line = 302)
    public final void method1428() {
        this.field3490 = new int[this.field3497];
        this.field3480 = new int[this.field3497];
        this.field3473 = new int[this.field3497];
        if (this.field3498) {
            this.field3485 = new float[this.field3497];
        }
        this.field3494 = new int[this.field3497];
        this.field3471 = new float[this.field3497];
        this.field3484 = new float[this.field3497];
        this.field3493 = new float[this.field3497];
        this.field3474 = new int[this.field3492];
        this.field3500 = new int[this.field3492];
        this.field3496 = new int[this.field3492];
        this.field3495 = new int[this.field3492][];
        this.field3502 = new class159(class143.method1013((byte) 107, this.field3497));
        if (this.field3478) {
            this.field3489 = new int[this.field3492][];
            this.field3481 = new boolean[this.field3492];
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class204(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3472 = arg0;
        this.field3499 = arg1;
        this.field3478 = arg2;
        this.field3498 = arg3;
        this.field3488 = arg4;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III[I[IZ)I", line = 343)
    public final int method1429(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3478) {
            this.field3489[this.field3479] = arg4;
            this.field3481[this.field3479] = arg5;
            if (arg4 != null) {
                this.field3483 += arg4.length;
            }
            if (arg5) {
                this.field3483 += (arg3.length - 2) * 3;
            } else {
                this.field3491 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3491 += (arg3.length - 2) * 3;
        }
        this.field3496[this.field3479] = arg0;
        this.field3474[this.field3479] = arg1;
        this.field3500[this.field3479] = arg2;
        this.field3495[this.field3479] = arg3;
        return this.field3479++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIFFFIF)I", line = 367)
    public final int method1430(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class84 var11 = (class84) this.field3502.method1151(var9, 0);
            if (var11 != null) {
                if (arg1 < this.field3480[var11.field1552]) {
                    this.field3480[var11.field1552] = arg1;
                }
                return var11.field1552;
            }
        }
        this.field3490[this.field3487] = arg0;
        this.field3480[this.field3487] = arg1;
        this.field3473[this.field3487] = arg2;
        if (this.field3498) {
            this.field3485[this.field3487] = arg7;
        }
        this.field3471[this.field3487] = arg3;
        this.field3484[this.field3487] = arg4;
        this.field3493[this.field3487] = arg5;
        this.field3494[this.field3487] = arg6;
        if (var9 != 0L) {
            this.field3502.method1149(new class84(this.field3487), var9, -68);
        }
        return this.field3487++;
    }
}
