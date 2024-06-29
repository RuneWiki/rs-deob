import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class229 {

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    private int field3596 = -1;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[Lnb;")
    private class219[] field3591;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[Lnb;")
    private class219[] field3593;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lnb;")
    private class219 field3585;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private int field3594;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lrn;")
    public static class18 field3590;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lqn;")
    private class361 field3595;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public final void method1722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1725(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3586 == -1) {
            class60.method611(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3595 == null) {
                this.field3595 = class107.field1619.method754(this.field3586, -108, false, this.field3589, class107.field1613);
            }
            if (!class107.field1619.method764(this.field3586, (byte) 63)) {
                class60.method611(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3595 != null) {
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
                        this.field3595.method13(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3594 - 1; var14 >= 0; var14--) {
            this.field3593[var14].method1637(arg1, arg2, arg3, arg4, arg5, var9, this.field3585);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIIIIII)V", line = 69)
    public final void method1723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class240.field3771;
        this.method1725(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class240.method1815(false);
        class240.method1801(false);
        class240.method1807(false);
        class240.method1805();
        class240.method1808(arg1, var11, arg2, var12);
        class240.method1791();
        for (int var13 = this.field3594 - 1; var13 >= 0; var13--) {
            this.field3593[var13].method1649(this.field3585);
        }
        if (this.field3586 == -1) {
            class240.method1810(arg7);
        } else {
            if (!class107.field1619.method764(this.field3586, (byte) 63)) {
                class240.method1810(arg7);
            }
            class107.field1619.method758(this.field3589, (byte) 122, this.field3586);
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
        for (int var17 = this.field3594 - 1; var17 >= 0; var17--) {
            this.field3593[var17].method1651(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class240.method1803();
        class240.method1807(true);
        class240.method1801(true);
        class240.method1815(true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V", line = 135)
    public static final void method1724() {
        class219.method1647();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 138)
    private final void method1725(int arg0) {
        if (this.field3596 == arg0) {
            return;
        }
        this.field3596 = arg0;
        int var2 = class337.method2370((byte) 84, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3589 != var2) {
            this.field3589 = var2;
            this.field3595 = null;
        }
        if (this.field3591 == null) {
            return;
        }
        this.field3594 = 0;
        int[] var3 = new int[this.field3591.length];
        for (int var4 = 0; var4 < this.field3591.length; var4++) {
            class219 var5 = this.field3591[var4];
            if (var5.method1641(this.field3592, this.field3587, this.field3588, this.field3596)) {
                var3[this.field3594] = var5.field3416;
                this.field3593[this.field3594++] = var5;
            }
        }
        class212.method1573(0, var3, this.field3593, -60, this.field3594 - 1);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()V", line = 183)
    public static void method1726() {
        field3590 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lrn;)V", line = 192)
    public static final void method1727(class18 arg0) {
        field3590 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I[Lnb;IIII)V", line = 198)
    public class229(int arg0, class219[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3592 = arg3;
        this.field3587 = arg4;
        this.field3588 = arg5;
        this.field3586 = arg0;
        this.field3591 = arg1;
        if (arg1 == null) {
            this.field3593 = null;
            this.field3585 = null;
        } else {
            this.field3593 = new class219[arg1.length];
            this.field3585 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
