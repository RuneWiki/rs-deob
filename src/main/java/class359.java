import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class359 {

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    private int field5695 = -1;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    private int field5693;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    private int field5692;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    private int field5696;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    private int field5697;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[Lra;")
    private class188[] field5700;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lra;")
    private class188[] field5690;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lra;")
    private class188 field5694;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    private int field5689;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    private int field5699;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lsi;")
    private class351 field5698;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lth;")
    public static class57 field5691;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 4)
    public static final void method2524() {
        class188.method1486();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V", line = 12)
    public final void method2525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2527(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field5697 == -1) {
            class246.method1885(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field5698 == null) {
                this.field5698 = class153.field2439.method769(this.field5699, 0, class153.field2440, false, this.field5697);
            }
            if (!class153.field2439.method780(65535, this.field5697)) {
                class246.method1885(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field5698 != null) {
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
                        this.field5698.method90(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field5689 - 1; var14 >= 0; var14--) {
            this.field5690[var14].method1473(arg1, arg2, arg3, arg4, arg5, var9, this.field5694);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lth;)V", line = 74)
    public static final void method2526(class57 arg0) {
        field5691 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 78)
    private final void method2527(int arg0) {
        if (this.field5695 == arg0) {
            return;
        }
        this.field5695 = arg0;
        int var2 = class159.method1243(arg0, 108);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field5699 != var2) {
            this.field5699 = var2;
            this.field5698 = null;
        }
        if (this.field5700 == null) {
            return;
        }
        this.field5689 = 0;
        int[] var3 = new int[this.field5700.length];
        for (int var4 = 0; var4 < this.field5700.length; var4++) {
            class188 var5 = this.field5700[var4];
            if (var5.method1482(this.field5693, this.field5692, this.field5696, this.field5695)) {
                var3[this.field5689] = var5.field3028;
                this.field5690[this.field5689++] = var5;
            }
        }
        class206.method1573(var3, this.field5690, this.field5689 - 1, 0, -12359);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V", line = 121)
    public static void method2528() {
        field5691 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIIII)V", line = 126)
    public final void method2529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class42.field627;
        this.method2527(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class42.method286(false);
        class42.method283(false);
        class42.method278(false);
        class42.method299();
        class42.method312(arg1, var11, arg2, var12);
        class42.method279();
        for (int var13 = this.field5689 - 1; var13 >= 0; var13--) {
            this.field5690[var13].method1479(this.field5694);
        }
        if (this.field5697 == -1) {
            class42.method311(arg7);
        } else {
            if (!class153.field2439.method780(65535, this.field5697)) {
                class42.method311(arg7);
            }
            class153.field2439.method757(this.field5699, this.field5697, (byte) -45);
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
        for (int var17 = this.field5689 - 1; var17 >= 0; var17--) {
            this.field5690[var17].method1475(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class42.method282();
        class42.method278(true);
        class42.method283(true);
        class42.method286(true);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[Lra;IIII)V", line = 198)
    public class359(int arg0, class188[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5693 = arg3;
        this.field5692 = arg4;
        this.field5696 = arg5;
        this.field5697 = arg0;
        this.field5700 = arg1;
        if (arg1 == null) {
            this.field5690 = null;
            this.field5694 = null;
        } else {
            this.field5690 = new class188[arg1.length];
            this.field5694 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
