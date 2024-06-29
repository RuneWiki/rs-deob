import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class17 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    private int field477 = -1;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "[Lah;")
    private class230[] field488;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "[Lah;")
    private class230[] field486;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "Lah;")
    private class230 field483;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Lek;")
    public static class206 field480;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Lsc;")
    private class288 field481;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V", line = 5)
    public static final void method168() {
        class230.method1598();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIII)V", line = 8)
    public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method172(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field484 == -1) {
            class270.method1894(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field481 == null) {
                this.field481 = class305.field4968.method62((byte) -57, this.field479, this.field484, class305.field4961, false);
            }
            if (!class305.field4968.method82(this.field484, -5001)) {
                class270.method1894(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field481 != null) {
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
                        this.field481.method569(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field482 - 1; var14 >= 0; var14--) {
            this.field486[var14].method1600(arg1, arg2, arg3, arg4, arg5, var9, this.field483);
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(IIIIIIII)V", line = 72)
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class241.field4012;
        this.method172(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class241.method1696(false);
        class241.method1716(false);
        class241.method1705(false);
        class241.method1702();
        class241.method1690(arg1, var11, arg2, var12);
        class241.method1689();
        for (int var13 = this.field482 - 1; var13 >= 0; var13--) {
            this.field486[var13].method1611(this.field483);
        }
        if (this.field484 == -1) {
            class241.method1697(arg7);
        } else {
            if (!class305.field4968.method82(this.field484, -5001)) {
                class241.method1697(arg7);
            }
            class305.field4968.method68(this.field484, 255, this.field479);
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
        for (int var17 = this.field482 - 1; var17 >= 0; var17--) {
            this.field486[var17].method1605(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class241.method1700();
        class241.method1705(true);
        class241.method1716(true);
        class241.method1696(true);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I[Lah;IIII)V", line = 198)
    public class17(int arg0, class230[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field487 = arg3;
        this.field485 = arg4;
        this.field478 = arg5;
        this.field484 = arg0;
        this.field488 = arg1;
        if (arg1 == null) {
            this.field486 = null;
            this.field483 = null;
        } else {
            this.field486 = new class230[arg1.length];
            this.field483 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "()V", line = 142)
    public static void method171() {
        field480 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 154)
    private final void method172(int arg0) {
        if (this.field477 == arg0) {
            return;
        }
        this.field477 = arg0;
        int var2 = class298.method2132((byte) -47, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field479 != var2) {
            this.field479 = var2;
            this.field481 = null;
        }
        if (this.field488 == null) {
            return;
        }
        this.field482 = 0;
        int[] var3 = new int[this.field488.length];
        for (int var4 = 0; var4 < this.field488.length; var4++) {
            class230 var5 = this.field488[var4];
            if (var5.method1603(this.field487, this.field485, this.field478, this.field477)) {
                var3[this.field482] = var5.field3765;
                this.field486[this.field482++] = var5;
            }
        }
        class142.method976(this.field486, var3, 0, (byte) 111, this.field482 - 1);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lek;)V", line = 196)
    public static final void method173(class206 arg0) {
        field480 = arg0;
    }
}
