import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class174 {

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    private int field2718 = -1;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    private int field2720;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[Lw;")
    private class134[] field2717;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "[Lw;")
    private class134[] field2723;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lw;")
    private class134 field2715;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    private int field2719;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lle;")
    private class137 field2714;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lnm;")
    public static class221 field2712;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 4)
    private final void method1200(int arg0) {
        if (this.field2718 == arg0) {
            return;
        }
        this.field2718 = arg0;
        int var2 = class278.method1978(128, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2722 != var2) {
            this.field2722 = var2;
            this.field2714 = null;
        }
        if (this.field2717 == null) {
            return;
        }
        this.field2719 = 0;
        int[] var3 = new int[this.field2717.length];
        for (int var4 = 0; var4 < this.field2717.length; var4++) {
            class134 var5 = this.field2717[var4];
            if (var5.method882(this.field2721, this.field2716, this.field2713, this.field2718)) {
                var3[this.field2719] = var5.field2049;
                this.field2723[this.field2719++] = var5;
            }
        }
        class37.method305(this.field2723, var3, this.field2719 - 1, (byte) 50, 0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIII)V", line = 50)
    public final void method1201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1200(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2720 == -1) {
            class317.method2282(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2714 == null) {
                this.field2714 = class272.field4467.method409(this.field2722, this.field2720, class272.field4472, (byte) -93, false);
            }
            if (!class272.field4467.method402(true, this.field2720)) {
                class317.method2282(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2714 != null) {
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
                        this.field2714.method959(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2719 - 1; var14 >= 0; var14--) {
            this.field2723[var14].method874(arg1, arg2, arg3, arg4, arg5, var9, this.field2715);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V", line = 112)
    public static void method1202() {
        field2712 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lnm;)V", line = 116)
    public static final void method1203(class221 arg0) {
        field2712 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()V", line = 120)
    public static final void method1204() {
        class134.method876();
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I[Lw;IIII)V", line = 198)
    public class174(int arg0, class134[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2721 = arg3;
        this.field2716 = arg4;
        this.field2713 = arg5;
        this.field2720 = arg0;
        this.field2717 = arg1;
        if (arg1 == null) {
            this.field2723 = null;
            this.field2715 = null;
        } else {
            this.field2723 = new class134[arg1.length];
            this.field2715 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIIIIIII)V", line = 134)
    public final void method1205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class245.field3884;
        this.method1200(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class245.method1743(false);
        class245.method1740(false);
        class245.method1742(false);
        class245.method1710();
        class245.method1703(arg1, var11, arg2, var12);
        class245.method1713();
        for (int var13 = this.field2719 - 1; var13 >= 0; var13--) {
            this.field2723[var13].method881(this.field2715);
        }
        if (this.field2720 == -1) {
            class245.method1717(arg7);
        } else {
            if (!class272.field4467.method402(true, this.field2720)) {
                class245.method1717(arg7);
            }
            class272.field4467.method414(this.field2720, this.field2722, true);
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
        for (int var17 = this.field2719 - 1; var17 >= 0; var17--) {
            this.field2723[var17].method884(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class245.method1724();
        class245.method1742(true);
        class245.method1740(true);
        class245.method1743(true);
    }
}
