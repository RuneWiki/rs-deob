import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class250 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    private int field3689 = -1;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    private int field3696;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    private int field3695;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    private int field3690;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[Lma;")
    private class302[] field3694;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[Lma;")
    private class302[] field3699;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lma;")
    private class302 field3691;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    private int field3692;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    private int field3700;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lpk;")
    public static class120 field3697;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Leg;")
    private class317 field3693;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V", line = 7)
    public static final void method1733() {
        class302.method2144();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 10)
    private final void method1734(int arg0) {
        if (this.field3689 == arg0) {
            return;
        }
        this.field3689 = arg0;
        int var2 = class284.method1990(true, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3700 != var2) {
            this.field3700 = var2;
            this.field3693 = null;
        }
        if (this.field3694 == null) {
            return;
        }
        this.field3692 = 0;
        int[] var3 = new int[this.field3694.length];
        for (int var4 = 0; var4 < this.field3694.length; var4++) {
            class302 var5 = this.field3694[var4];
            if (var5.method2147(this.field3696, this.field3698, this.field3695, this.field3689)) {
                var3[this.field3692] = var5.field4821;
                this.field3699[this.field3692++] = var5;
            }
        }
        class10.method152(this.field3699, 0, this.field3692 - 1, 124, var3);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[Lma;IIII)V", line = 198)
    public class250(int arg0, class302[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3696 = arg3;
        this.field3698 = arg4;
        this.field3695 = arg5;
        this.field3690 = arg0;
        this.field3694 = arg1;
        if (arg1 == null) {
            this.field3699 = null;
            this.field3691 = null;
        } else {
            this.field3699 = new class302[arg1.length];
            this.field3691 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lpk;)V", line = 63)
    public static final void method1735(class120 arg0) {
        field3697 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V", line = 68)
    public final void method1736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class162.field2654;
        this.method1734(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class162.method1207(false);
        class162.method1205(false);
        class162.method1193(false);
        class162.method1214();
        class162.method1221(arg1, var11, arg2, var12);
        class162.method1196();
        for (int var13 = this.field3692 - 1; var13 >= 0; var13--) {
            this.field3699[var13].method2139(this.field3691);
        }
        if (this.field3690 == -1) {
            class162.method1225(arg7);
        } else {
            if (!class40.field614.method258(this.field3690, 100)) {
                class162.method1225(arg7);
            }
            class40.field614.method261(this.field3690, (byte) -12, this.field3700);
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
        for (int var17 = this.field3692 - 1; var17 >= 0; var17--) {
            this.field3699[var17].method2138(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class162.method1203();
        class162.method1193(true);
        class162.method1205(true);
        class162.method1207(true);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V", line = 132)
    public static void method1737() {
        field3697 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IIIIIIII)V", line = 137)
    public final void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1734(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3690 == -1) {
            class33.method288(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3693 == null) {
                this.field3693 = class40.field614.method252(false, class40.field604, 12194, this.field3700, this.field3690);
            }
            if (!class40.field614.method258(this.field3690, 100)) {
                class33.method288(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3693 != null) {
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
                for (int var12 = var11 - arg4; var12 < class33.field506; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class33.field509; var13 += arg4) {
                        this.field3693.method695(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3692 - 1; var14 >= 0; var14--) {
            this.field3699[var14].method2141(arg1, arg2, arg3, arg4, arg5, var9, this.field3691);
        }
    }
}
