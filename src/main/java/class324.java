import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class324 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    private int field4749 = -1;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    private int field4750;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    private int field4754;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    private int field4758;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[Lkg;")
    private class108[] field4753;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[Lkg;")
    private class108[] field4756;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lkg;")
    private class108 field4751;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private int field4752;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field4757;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lvn;")
    private class11 field4760;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lfh;")
    public static class140 field4759;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public final void method2238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2243(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field4755 == -1) {
            class37.method231(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field4760 == null) {
                this.field4760 = class350.field5467.method913(false, class350.field5462, false, this.field4757, this.field4755);
            }
            if (!class350.field5467.method904(-1, this.field4755)) {
                class37.method231(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field4760 != null) {
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
                for (int var12 = var11 - arg4; var12 < arg3; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < arg4; var13 += arg4) {
                        this.field4760.method70(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field4752 - 1; var14 >= 0; var14--) {
            this.field4756[var14].method764(arg1, arg2, arg3, arg4, arg5, var9, this.field4751);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I[Lkg;IIII)V", line = 156)
    public class324(int arg0, class108[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4750 = arg3;
        this.field4754 = arg4;
        this.field4758 = arg5;
        this.field4755 = arg0;
        this.field4753 = arg1;
        if (arg1 == null) {
            this.field4756 = null;
            this.field4751 = null;
        } else {
            this.field4756 = new class108[arg1.length];
            this.field4751 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIIIIIII)V", line = 72)
    public final void method2239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class47.field592;
        this.method2243(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class47.method350(false);
        class47.method367(false);
        class47.method345(false);
        class47.method352();
        class47.method363(arg1, var11, arg2, var12);
        class47.method346();
        for (int var13 = this.field4752 - 1; var13 >= 0; var13--) {
            this.field4756[var13].method758(this.field4751);
        }
        if (this.field4755 == -1) {
            class47.method372(arg7);
        } else {
            if (!class350.field5467.method904(-1, this.field4755)) {
                class47.method372(arg7);
            }
            class350.field5467.method915((byte) -103, this.field4757, this.field4755);
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
        for (int var17 = this.field4752 - 1; var17 >= 0; var17--) {
            this.field4756[var17].method757(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class47.method348();
        class47.method345(true);
        class47.method367(true);
        class47.method350(true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 143)
    public static void method2240() {
        field4759 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()V", line = 148)
    public static final void method2241() {
        class108.method768();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lfh;)V", line = 153)
    public static final void method2242(class140 arg0) {
        field4759 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 175)
    private final void method2243(int arg0) {
        if (this.field4749 == arg0) {
            return;
        }
        this.field4749 = arg0;
        int var2 = class54.method408(arg0, (byte) 99);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field4757 != var2) {
            this.field4757 = var2;
            this.field4760 = null;
        }
        if (this.field4753 == null) {
            return;
        }
        this.field4752 = 0;
        int[] var3 = new int[this.field4753.length];
        for (int var4 = 0; var4 < this.field4753.length; var4++) {
            class108 var5 = this.field4753[var4];
            if (var5.method759(this.field4750, this.field4754, this.field4758, this.field4749)) {
                var3[this.field4752] = var5.field1397;
                this.field4756[this.field4752++] = var5;
            }
        }
        class44.method315(this.field4752 - 1, this.field4756, 0, -80, var3);
    }
}
