import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class221 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    private int field3369 = -1;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    private int field3379;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    private int field3373;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    private int field3371;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    private int field3374;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[Lok;")
    private class107[] field3370;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[Lok;")
    private class107[] field3376;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lok;")
    private class107 field3378;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    private int field3368;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Laf;")
    private class195 field3377;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Ljd;")
    public static class95 field3372;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 5)
    public static final void method1570() {
        class107.method807();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljd;)V", line = 11)
    public static final void method1571(class95 arg0) {
        field3372 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 14)
    private final void method1572(int arg0) {
        if (this.field3369 == arg0) {
            return;
        }
        this.field3369 = arg0;
        int var2 = class224.method1595(arg0, -123);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3368 != var2) {
            this.field3368 = var2;
            this.field3377 = null;
        }
        if (this.field3370 == null) {
            return;
        }
        this.field3375 = 0;
        int[] var3 = new int[this.field3370.length];
        for (int var4 = 0; var4 < this.field3370.length; var4++) {
            class107 var5 = this.field3370[var4];
            if (var5.method811(this.field3379, this.field3373, this.field3371, this.field3369)) {
                var3[this.field3375] = var5.field1563;
                this.field3376[this.field3375++] = var5;
            }
        }
        class48.method363(var3, this.field3376, 0, -769538808, this.field3375 - 1);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIII)V", line = 56)
    public final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1572(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3374 == -1) {
            class287.method1987(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3377 == null) {
                this.field3377 = class164.field2662.method676(class164.field2656, false, this.field3368, this.field3374, 91);
            }
            if (!class164.field2662.method664(this.field3374, 110)) {
                class287.method1987(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3377 != null) {
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
                for (int var12 = var11 - arg4; var12 < class287.field4452; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class287.field4450; var13 += arg4) {
                        this.field3377.method132(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3375 - 1; var14 >= 0; var14--) {
            this.field3376[var14].method804(arg1, arg2, arg3, arg4, arg5, var9, this.field3378);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()V", line = 120)
    public static void method1574() {
        field3372 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIIIII)V", line = 127)
    public final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class73.field1051;
        this.method1572(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class73.method531(false);
        class73.method544(false);
        class73.method558(false);
        class73.method552();
        class73.method541(arg1, var11, arg2, var12);
        class73.method538();
        for (int var13 = this.field3375 - 1; var13 >= 0; var13--) {
            this.field3376[var13].method796(this.field3378);
        }
        if (this.field3374 == -1) {
            class73.method553(arg7);
        } else {
            if (!class164.field2662.method664(this.field3374, 26)) {
                class73.method553(arg7);
            }
            class164.field2662.method673(this.field3374, (byte) -74, this.field3368);
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
        for (int var17 = this.field3375 - 1; var17 >= 0; var17--) {
            this.field3376[var17].method808(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class73.method525();
        class73.method558(true);
        class73.method544(true);
        class73.method531(true);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[Lok;IIII)V", line = 198)
    public class221(int arg0, class107[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3379 = arg3;
        this.field3373 = arg4;
        this.field3371 = arg5;
        this.field3374 = arg0;
        this.field3370 = arg1;
        if (arg1 == null) {
            this.field3376 = null;
            this.field3378 = null;
        } else {
            this.field3376 = new class107[arg1.length];
            this.field3378 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
