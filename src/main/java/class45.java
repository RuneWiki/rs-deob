import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class45 {

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    private int field744 = -1;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    private int field750;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[Lcn;")
    private class266[] field745;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[Lcn;")
    private class266[] field742;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Lcn;")
    private class266 field749;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Ll;")
    public static class133 field739;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lgm;")
    private class249 field740;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 4)
    public static void method397() {
        field739 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIII)V", line = 8)
    public final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method399(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field743 == -1) {
            class109.method812(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field740 == null) {
                this.field740 = class15.field207.method2087(-117, false, this.field748, class15.field202, this.field743);
            }
            if (!class15.field207.method2080(-118, this.field743)) {
                class109.method812(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field740 != null) {
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
                for (int var12 = var11 - arg4; var12 < class109.field1709; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class109.field1702; var13 += arg4) {
                        this.field740.method624(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field741 - 1; var14 >= 0; var14--) {
            this.field742[var14].method1823(arg1, arg2, arg3, arg4, arg5, var9, this.field749);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 70)
    private final void method399(int arg0) {
        if (this.field744 == arg0) {
            return;
        }
        this.field744 = arg0;
        int var2 = class324.method2201(arg0, -485);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field748 != var2) {
            this.field748 = var2;
            this.field740 = null;
        }
        if (this.field745 == null) {
            return;
        }
        this.field741 = 0;
        int[] var3 = new int[this.field745.length];
        for (int var4 = 0; var4 < this.field745.length; var4++) {
            class266 var5 = this.field745[var4];
            if (var5.method1824(this.field750, this.field746, this.field747, this.field744)) {
                var3[this.field741] = var5.field4148;
                this.field742[this.field741++] = var5;
            }
        }
        class317.method2158(this.field741 - 1, var3, 0, this.field742, (byte) -97);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ll;)V", line = 114)
    public static final void method400(class133 arg0) {
        field739 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIIIIII)V", line = 118)
    public final void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class94.field1473;
        this.method399(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class94.method693(false);
        class94.method668(false);
        class94.method696(false);
        class94.method695();
        class94.method687(arg1, var11, arg2, var12);
        class94.method674();
        for (int var13 = this.field741 - 1; var13 >= 0; var13--) {
            this.field742[var13].method1822(this.field749);
        }
        if (this.field743 == -1) {
            class94.method679(arg7);
        } else {
            if (!class15.field207.method2080(118, this.field743)) {
                class94.method679(arg7);
            }
            class15.field207.method2084((byte) 74, this.field748, this.field743);
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
        for (int var17 = this.field741 - 1; var17 >= 0; var17--) {
            this.field742[var17].method1826(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class94.method683();
        class94.method696(true);
        class94.method668(true);
        class94.method693(true);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V", line = 184)
    public static final void method402() {
        class266.method1829();
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I[Lcn;IIII)V", line = 198)
    public class45(int arg0, class266[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field750 = arg3;
        this.field746 = arg4;
        this.field747 = arg5;
        this.field743 = arg0;
        this.field745 = arg1;
        if (arg1 == null) {
            this.field742 = null;
            this.field749 = null;
        } else {
            this.field742 = new class266[arg1.length];
            this.field749 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
