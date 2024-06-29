import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class49 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    private int field599 = -1;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Lqd;")
    private class195[] field600;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[Lqd;")
    private class195[] field603;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lqd;")
    private class195 field601;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lkm;")
    public static class133 field604;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lkn;")
    private class178 field602;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method306(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field607 == -1) {
            class38.method224(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field602 == null) {
                this.field602 = class184.field2543.method679(this.field605, false, this.field607, class184.field2544, 64);
            }
            if (!class184.field2543.method676(this.field607, true)) {
                class38.method224(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field602 != null) {
                int var10 = arg4 * arg5 / -512;
                int var11;
                for (var11 = arg4 * var9 / 512 + (arg3 - arg4) / 2; var11 > arg4; var11 -= arg4) {
                }
                while (var11 < 0) {
                    var11 += arg4;
                }
                while (var10 > arg4) {
                    var10 -= arg4;
                }
                while (var10 < 0) {
                    var10 += arg4;
                }
                for (int var12 = var11 - arg4; var12 < class38.field433; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class38.field435; var13 += arg4) {
                        this.field602.method837(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field597 - 1; var14 >= 0; var14--) {
            this.field603[var14].method1366(arg1, arg2, arg3, arg4, arg5, var9, this.field601);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 70)
    private final void method306(int arg0) {
        if (this.field599 == arg0) {
            return;
        }
        this.field599 = arg0;
        int var2 = class234.method1613(arg0, true);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field605 != var2) {
            this.field605 = var2;
            this.field602 = null;
        }
        if (this.field600 == null) {
            return;
        }
        this.field597 = 0;
        int[] var3 = new int[this.field600.length];
        for (int var4 = 0; var4 < this.field600.length; var4++) {
            class195 var5 = this.field600[var4];
            if (var5.method1367(this.field596, this.field606, this.field598, this.field599)) {
                var3[this.field597] = var5.field2730;
                this.field603[this.field597++] = var5;
            }
        }
        class163.method1175(0, this.field597 - 1, -123, var3, this.field603);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 112)
    public static void method307() {
        field604 = null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()V", line = 115)
    public static final void method308() {
        class195.method1368();
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I[Lqd;IIII)V", line = 198)
    public class49(int arg0, class195[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field596 = arg3;
        this.field606 = arg4;
        this.field598 = arg5;
        this.field607 = arg0;
        this.field600 = arg1;
        if (arg1 == null) {
            this.field603 = null;
            this.field601 = null;
        } else {
            this.field603 = new class195[arg1.length];
            this.field601 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lkm;)V", line = 123)
    public static final void method309(class133 arg0) {
        field604 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIIII)V", line = 133)
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class67.field899;
        this.method306(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class67.method476(false);
        class67.method460(false);
        class67.method459(false);
        class67.method477();
        class67.method451(arg1, var11, arg2, var12);
        class67.method475();
        for (int var13 = this.field597 - 1; var13 >= 0; var13--) {
            this.field603[var13].method1374(this.field601);
        }
        if (this.field607 == -1) {
            class67.method453(arg7);
        } else {
            if (!class184.field2543.method676(this.field607, true)) {
                class67.method453(arg7);
            }
            class184.field2543.method668(this.field605, (byte) -56, this.field607);
            float var14 = (float) arg5 / 512.0F;
            float var15 = (float) var10 / -512.0F;
            float var16 = (float) (arg3 - arg4) / ((float) arg4 * 2.0F);
            var9.glBegin(7);
            var9.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var9.glTexCoord2f(var15 - var16, var14);
            var9.glVertex2i(arg1, arg2);
            var9.glTexCoord2f(var15 - var16, var14 + 1.0F);
            var9.glVertex2i(arg1, var12);
            var9.glTexCoord2f(var16 + var15 + 1.0F, var14 + 1.0F);
            var9.glVertex2i(var11, var12);
            var9.glTexCoord2f(var16 + var15 + 1.0F, var14);
            var9.glVertex2i(var11, arg2);
            var9.glEnd();
        }
        for (int var17 = this.field597 - 1; var17 >= 0; var17--) {
            this.field603[var17].method1382(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class67.method482();
        class67.method459(true);
        class67.method460(true);
        class67.method476(true);
    }
}
