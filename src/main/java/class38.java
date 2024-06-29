import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class38 extends class206 {

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    private int field562 = 0;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public int field559 = 0;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field566 = 0;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    private int field578 = 0;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public int field582 = 0;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public int field586 = 0;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "F")
    private float field558;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Z")
    public boolean field567;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Z")
    private boolean field574;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Lvd;")
    private class126 field571;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lja;")
    private static class60 field565;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Lja;")
    private static class60 field575;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "Lsl;")
    private class92 field583;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field560;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field570;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field572;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "[F")
    private float[] field561;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "[F")
    private float[] field564;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "[F")
    private float[] field581;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "[F")
    private float[] field584;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
    private int[] field556;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[I")
    private int[] field563;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "[I")
    private int[] field569;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "[I")
    private int[] field573;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "[I")
    private int[] field577;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "[I")
    private int[] field579;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "[I")
    private int[] field587;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "[Z")
    private boolean[] field580;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "[[I")
    private int[][] field568;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "[[I")
    private int[][] field585;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([[[Ltf;FZ)V", line = 6)
    public final void method254(class242[][][] arg0, float arg1, boolean arg2) {
        if (field575 == null || field575.field997.length < this.field566 * 4) {
            field575 = new class60(this.field566 * 4);
        } else {
            field575.field1012 = 0;
        }
        if (field565 == null || field565.field997.length < this.field578 * 4) {
            field565 = new class60(this.field578 * 4);
        } else {
            field565.field1012 = 0;
        }
        if (class47.field749) {
            for (int var4 = 0; var4 < this.field562; var4++) {
                class242 var5 = arg0[this.field563[var4]][this.field573[var4]][this.field577[var4]];
                if (var5 != null && var5.field4085) {
                    int[] var6 = this.field568[var4];
                    class60 var9;
                    if (this.field567) {
                        int[] var7 = this.field585[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field565.method510(var7[var8], -98);
                            }
                        }
                        var9 = this.field580[var4] ? field565 : field575;
                    } else {
                        var9 = field575;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method510(var6[0], 82);
                        var9.method510(var6[var10], -39);
                        var9.method510(var6[var10 + 1], 62);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field562; var11++) {
                class242 var12 = arg0[this.field563[var11]][this.field573[var11]][this.field577[var11]];
                if (var12 != null && var12.field4085) {
                    int[] var13 = this.field568[var11];
                    class60 var16;
                    if (this.field567) {
                        int[] var14 = this.field585[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field565.method528((byte) 123, var14[var15]);
                            }
                        }
                        var16 = this.field580[var11] ? field565 : field575;
                    } else {
                        var16 = field575;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method528((byte) 103, var13[0]);
                        var16.method528((byte) 123, var13[var17]);
                        var16.method528((byte) 106, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field575.field1012 == 0 && field565.field1012 == 0) {
            return;
        }
        GL var18 = class47.field739;
        if (this.field557 == -1 || arg2) {
            class47.method317(-1);
            class140.method1079(0, (byte) -40, 0);
        } else {
            class21.field279.method1064(-29618, this.field557);
        }
        int var19 = this.field574 ? 40 : 36;
        if (this.field583 == null) {
            if (class47.field768) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field560.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field560);
            this.field560.position(12);
            var18.glColorPointer(4, 5121, var19, this.field560);
            if (class116.field1970) {
                this.field560.position(16);
                var18.glNormalPointer(5126, var19, this.field560);
            }
            this.field560.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field560);
            if (this.field574) {
                var18.glClientActiveTexture(class160.method1202());
                this.field560.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field560);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field583.method722();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class116.field1970) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field574) {
                var18.glClientActiveTexture(class160.method1202());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class47.field768) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field575.field1012 != 0) {
            if (field570 == null || field570.capacity() < field575.field1012) {
                field570 = ByteBuffer.allocateDirect(field575.field1012).order(ByteOrder.nativeOrder());
            } else {
                field570.clear();
            }
            field570.put(field575.field997, 0, field575.field1012);
            field570.flip();
            class47.method315(arg1);
            var18.glDrawElements(4, field575.field1012 / 4, 5125, field570);
        }
        if (field565.field1012 == 0) {
            return;
        }
        if (field572 == null || field572.capacity() < field565.field1012) {
            field572 = ByteBuffer.allocateDirect(field565.field1012).order(ByteOrder.nativeOrder());
        } else {
            field572.clear();
        }
        field572.put(field565.field997, 0, field565.field1012);
        field572.flip();
        class47.method315(arg1 - 100.0F);
        class47.method345();
        var18.glDrawElements(4, field565.field1012 / 4, 5125, field572);
        class47.method325();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V", line = 219)
    public final void method255() {
        class60 var1 = new class60((this.field574 ? 40 : 36) * this.field586);
        for (int var2 = 0; var2 < this.field586; var2++) {
            if (class47.field749) {
                var1.method521((float) this.field587[var2], (byte) 98);
                var1.method521((float) this.field556[var2], (byte) 98);
                var1.method521((float) this.field569[var2], (byte) 98);
                var1.method510(this.field579[var2], -65);
                var1.method521(this.field561[var2], (byte) 98);
                var1.method521(this.field581[var2], (byte) 98);
                var1.method521(this.field584[var2], (byte) 98);
                var1.method521((float) this.field587[var2] / this.field558, (byte) 98);
                var1.method521((float) this.field569[var2] / this.field558, (byte) 98);
                if (this.field574) {
                    var1.method521(this.field564[var2], (byte) 98);
                }
            } else {
                var1.method475(-19674, (float) this.field587[var2]);
                var1.method475(-19674, (float) this.field556[var2]);
                var1.method475(-19674, (float) this.field569[var2]);
                var1.method510(this.field579[var2], 90);
                var1.method475(-19674, this.field561[var2]);
                var1.method475(-19674, this.field581[var2]);
                var1.method475(-19674, this.field584[var2]);
                var1.method475(-19674, (float) this.field587[var2] / this.field558);
                var1.method475(-19674, (float) this.field569[var2] / this.field558);
                if (this.field574) {
                    var1.method475(-19674, this.field564[var2]);
                }
            }
        }
        if (class47.field768) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field997, 0, var1.field1012);
            this.field583 = new class92();
            this.field583.method720(var3);
        } else {
            this.field560 = ByteBuffer.allocateDirect(var1.field1012).order(ByteOrder.nativeOrder());
            this.field560.put(var1.field997, 0, var1.field1012);
            this.field560.flip();
        }
        this.field587 = null;
        this.field556 = null;
        this.field569 = null;
        this.field579 = null;
        this.field561 = null;
        this.field581 = null;
        this.field584 = null;
        this.field571 = null;
        this.field564 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()V", line = 286)
    public static void method256() {
        field575 = null;
        field565 = null;
        field570 = null;
        field572 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IFZZI)V", line = 411)
    public class38(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field557 = arg0;
        this.field558 = arg1;
        this.field567 = arg2;
        this.field574 = arg3;
        this.field576 = arg4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIFFFIF)I", line = 312)
    public final int method257(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class8 var11 = (class8) this.field571.method1007(var9, -17004);
            if (var11 != null) {
                if (arg1 < this.field556[var11.field109]) {
                    this.field556[var11.field109] = arg1;
                }
                return var11.field109;
            }
        }
        this.field587[this.field586] = arg0;
        this.field556[this.field586] = arg1;
        this.field569[this.field586] = arg2;
        if (this.field574) {
            this.field564[this.field586] = arg7;
        }
        this.field561[this.field586] = arg3;
        this.field581[this.field586] = arg4;
        this.field584[this.field586] = arg5;
        this.field579[this.field586] = arg6;
        if (var9 != 0L) {
            this.field571.method1004((byte) 73, var9, new class8(this.field586));
        }
        return this.field586++;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()V", line = 361)
    public final void method258() {
        this.field587 = new int[this.field559];
        this.field556 = new int[this.field559];
        this.field569 = new int[this.field559];
        if (this.field574) {
            this.field564 = new float[this.field559];
        }
        this.field579 = new int[this.field559];
        this.field561 = new float[this.field559];
        this.field581 = new float[this.field559];
        this.field584 = new float[this.field559];
        this.field573 = new int[this.field582];
        this.field577 = new int[this.field582];
        this.field563 = new int[this.field582];
        this.field568 = new int[this.field582][];
        this.field571 = new class126(class118.method904(1440830960, this.field559));
        if (this.field567) {
            this.field585 = new int[this.field582][];
            this.field580 = new boolean[this.field582];
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III[I[IZ)I", line = 389)
    public final int method259(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field567) {
            this.field585[this.field562] = arg4;
            this.field580[this.field562] = arg5;
            if (arg4 != null) {
                this.field578 += arg4.length;
            }
            if (arg5) {
                this.field578 += (arg3.length - 2) * 3;
            } else {
                this.field566 += (arg3.length - 2) * 3;
            }
        } else {
            this.field566 += (arg3.length - 2) * 3;
        }
        this.field563[this.field562] = arg0;
        this.field573[this.field562] = arg1;
        this.field577[this.field562] = arg2;
        this.field568[this.field562] = arg3;
        return this.field562++;
    }
}
