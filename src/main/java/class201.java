import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class201 extends class68 {

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public int field3416 = 0;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    private int field3417 = 0;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public int field3438 = 0;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    private int field3435 = 0;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    private int field3431 = 0;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public int field3422 = 0;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "F")
    private float field3425;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "Z")
    public boolean field3430;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Z")
    private boolean field3446;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lbb;")
    private static class134 field3418;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Lbb;")
    private static class134 field3440;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Lsi;")
    private class237 field3423;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "Lgb;")
    private class83 field3445;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3420;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3432;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3437;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "[F")
    private float[] field3419;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "[F")
    private float[] field3421;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "[F")
    private float[] field3428;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "[F")
    private float[] field3444;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
    private int[] field3427;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "[I")
    private int[] field3429;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "[I")
    private int[] field3433;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "[I")
    private int[] field3434;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "[I")
    private int[] field3436;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "[I")
    private int[] field3439;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "[I")
    private int[] field3442;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "[Z")
    private boolean[] field3443;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "[[I")
    private int[][] field3426;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "[[I")
    private int[][] field3441;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIFFFIF)I", line = 7)
    public final int method1416(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class27 var11 = (class27) this.field3423.method1631(false, var9);
            if (var11 != null) {
                if (arg1 < this.field3427[var11.field383]) {
                    this.field3427[var11.field383] = arg1;
                }
                return var11.field383;
            }
        }
        this.field3442[this.field3438] = arg0;
        this.field3427[this.field3438] = arg1;
        this.field3429[this.field3438] = arg2;
        if (this.field3446) {
            this.field3444[this.field3438] = arg7;
        }
        this.field3421[this.field3438] = arg3;
        this.field3419[this.field3438] = arg4;
        this.field3428[this.field3438] = arg5;
        this.field3436[this.field3438] = arg6;
        if (var9 != 0L) {
            this.field3423.method1636(11311, new class27(this.field3438), var9);
        }
        return this.field3438++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V", line = 47)
    public final void method1417() {
        class134 var1 = new class134((this.field3446 ? 40 : 36) * this.field3438);
        for (int var2 = 0; var2 < this.field3438; var2++) {
            if (class56.field845) {
                var1.method956((float) this.field3442[var2], false);
                var1.method956((float) this.field3427[var2], false);
                var1.method956((float) this.field3429[var2], false);
                var1.method947(this.field3436[var2], (byte) 113);
                var1.method956(this.field3421[var2], false);
                var1.method956(this.field3419[var2], false);
                var1.method956(this.field3428[var2], false);
                var1.method956((float) this.field3442[var2] / this.field3425, false);
                var1.method956((float) this.field3429[var2] / this.field3425, false);
                if (this.field3446) {
                    var1.method956(this.field3444[var2], false);
                }
            } else {
                var1.method940((float) this.field3442[var2], 967648728);
                var1.method940((float) this.field3427[var2], 967648728);
                var1.method940((float) this.field3429[var2], 967648728);
                var1.method947(this.field3436[var2], (byte) 109);
                var1.method940(this.field3421[var2], 967648728);
                var1.method940(this.field3419[var2], 967648728);
                var1.method940(this.field3428[var2], 967648728);
                var1.method940((float) this.field3442[var2] / this.field3425, 967648728);
                var1.method940((float) this.field3429[var2] / this.field3425, 967648728);
                if (this.field3446) {
                    var1.method940(this.field3444[var2], 967648728);
                }
            }
        }
        if (class56.field855) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2282, 0, var1.field2299);
            this.field3445 = new class83();
            this.field3445.method585(var3);
        } else {
            this.field3432 = ByteBuffer.allocateDirect(var1.field2299).order(ByteOrder.nativeOrder());
            this.field3432.put(var1.field2282, 0, var1.field2299);
            this.field3432.flip();
        }
        this.field3442 = null;
        this.field3427 = null;
        this.field3429 = null;
        this.field3436 = null;
        this.field3421 = null;
        this.field3419 = null;
        this.field3428 = null;
        this.field3423 = null;
        this.field3444 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([[[Lma;FZ)V", line = 113)
    public final void method1418(class5[][][] arg0, float arg1, boolean arg2) {
        if (field3418 == null || field3418.field2282.length < this.field3431 * 4) {
            field3418 = new class134(this.field3431 * 4);
        } else {
            field3418.field2299 = 0;
        }
        if (field3440 == null || field3440.field2282.length < this.field3435 * 4) {
            field3440 = new class134(this.field3435 * 4);
        } else {
            field3440.field2299 = 0;
        }
        if (class56.field845) {
            for (int var4 = 0; var4 < this.field3417; var4++) {
                class5 var5 = arg0[this.field3434[var4]][this.field3439[var4]][this.field3433[var4]];
                if (var5 != null && var5.field39) {
                    int[] var6 = this.field3426[var4];
                    class134 var9;
                    if (this.field3430) {
                        int[] var7 = this.field3441[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3440.method947(var7[var8], (byte) 127);
                            }
                        }
                        var9 = this.field3443[var4] ? field3440 : field3418;
                    } else {
                        var9 = field3418;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method947(var6[0], (byte) 119);
                        var9.method947(var6[var10], (byte) 95);
                        var9.method947(var6[var10 + 1], (byte) 126);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3417; var11++) {
                class5 var12 = arg0[this.field3434[var11]][this.field3439[var11]][this.field3433[var11]];
                if (var12 != null && var12.field39) {
                    int[] var13 = this.field3426[var11];
                    class134 var16;
                    if (this.field3430) {
                        int[] var14 = this.field3441[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3440.method941(-92, var14[var15]);
                            }
                        }
                        var16 = this.field3443[var11] ? field3440 : field3418;
                    } else {
                        var16 = field3418;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method941(-117, var13[0]);
                        var16.method941(-114, var13[var17]);
                        var16.method941(-104, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3418.field2299 == 0 && field3440.field2299 == 0) {
            return;
        }
        GL var18 = class56.field848;
        if (this.field3424 == -1 || arg2) {
            class56.method354(-1);
            class51.method325(0, 0, 26604);
        } else {
            class236.field3987.method604((byte) 73, this.field3424);
        }
        int var19 = this.field3446 ? 40 : 36;
        if (this.field3445 == null) {
            if (class56.field855) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3432.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3432);
            this.field3432.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3432);
            if (class249.field4166) {
                this.field3432.position(16);
                var18.glNormalPointer(5126, var19, this.field3432);
            }
            this.field3432.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3432);
            if (this.field3446) {
                var18.glClientActiveTexture(class42.method269());
                this.field3432.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3432);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3445.method588();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class249.field4166) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3446) {
                var18.glClientActiveTexture(class42.method269());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class56.field855) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3418.field2299 != 0) {
            if (field3420 == null || field3420.capacity() < field3418.field2299) {
                field3420 = ByteBuffer.allocateDirect(field3418.field2299).order(ByteOrder.nativeOrder());
            } else {
                field3420.clear();
            }
            field3420.put(field3418.field2282, 0, field3418.field2299);
            field3420.flip();
            class56.method355(arg1);
            var18.glDrawElements(4, field3418.field2299 / 4, 5125, field3420);
        }
        if (field3440.field2299 == 0) {
            return;
        }
        if (field3437 == null || field3437.capacity() < field3440.field2299) {
            field3437 = ByteBuffer.allocateDirect(field3440.field2299).order(ByteOrder.nativeOrder());
        } else {
            field3437.clear();
        }
        field3437.put(field3440.field2282, 0, field3440.field2299);
        field3437.flip();
        class56.method355(arg1 - 100.0F);
        class56.method356();
        var18.glDrawElements(4, field3440.field2299 / 4, 5125, field3437);
        class56.method360();
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()V", line = 319)
    public static final void method1419() {
        field3418 = null;
        field3440 = null;
        field3420 = null;
        field3437 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class201(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3424 = arg0;
        this.field3425 = arg1;
        this.field3430 = arg2;
        this.field3446 = arg3;
        this.field3447 = arg4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[I[IZ)I", line = 342)
    public final int method1420(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3430) {
            this.field3441[this.field3417] = arg4;
            this.field3443[this.field3417] = arg5;
            if (arg4 != null) {
                this.field3435 += arg4.length;
            }
            if (arg5) {
                this.field3435 += (arg3.length - 2) * 3;
            } else {
                this.field3431 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3431 += (arg3.length - 2) * 3;
        }
        this.field3434[this.field3417] = arg0;
        this.field3439[this.field3417] = arg1;
        this.field3433[this.field3417] = arg2;
        this.field3426[this.field3417] = arg3;
        return this.field3417++;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()V", line = 381)
    public final void method1421() {
        this.field3442 = new int[this.field3416];
        this.field3427 = new int[this.field3416];
        this.field3429 = new int[this.field3416];
        if (this.field3446) {
            this.field3444 = new float[this.field3416];
        }
        this.field3436 = new int[this.field3416];
        this.field3421 = new float[this.field3416];
        this.field3419 = new float[this.field3416];
        this.field3428 = new float[this.field3416];
        this.field3439 = new int[this.field3422];
        this.field3433 = new int[this.field3422];
        this.field3434 = new int[this.field3422];
        this.field3426 = new int[this.field3422][];
        this.field3423 = new class237(class301.method2026(this.field3416, false));
        if (this.field3430) {
            this.field3441 = new int[this.field3422][];
            this.field3443 = new boolean[this.field3422];
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()V", line = 404)
    public static void method1422() {
        field3418 = null;
        field3440 = null;
        field3420 = null;
        field3437 = null;
    }
}
