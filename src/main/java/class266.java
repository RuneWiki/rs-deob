import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class266 {

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    private int field4308 = -1;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    private int field4302;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    private int field4299;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[Lkk;")
    private class71[] field4305;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[Lkk;")
    private class71[] field4301;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lkk;")
    private class71 field4310;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    private int field4309;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lak;")
    public static class172 field4300;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lek;")
    private class220 field4303;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public final void method1890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1895(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field4306 == -1) {
            class59.method382(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field4303 == null) {
                this.field4303 = class170.field2814.method958(-110, class170.field2815, this.field4306, false, this.field4304);
            }
            if (!class170.field2814.method938(this.field4306, (byte) -61)) {
                class59.method382(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field4303 != null) {
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
                for (int var12 = var11 - arg4; var12 < class59.field827; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class59.field828; var13 += arg4) {
                        this.field4303.method376(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field4309 - 1; var14 >= 0; var14--) {
            this.field4301[var14].method475(arg1, arg2, arg3, arg4, arg5, var9, this.field4310);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)V", line = 70)
    public final void method1891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class232.field3716;
        this.method1895(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class232.method1647(false);
        class232.method1660(false);
        class232.method1674(false);
        class232.method1654();
        class232.method1644(arg1, var11, arg2, var12);
        class232.method1673();
        for (int var13 = this.field4309 - 1; var13 >= 0; var13--) {
            this.field4301[var13].method480(this.field4310);
        }
        if (this.field4306 == -1) {
            class232.method1661(arg7);
        } else {
            if (!class170.field2814.method938(this.field4306, (byte) 82)) {
                class232.method1661(arg7);
            }
            class170.field2814.method950(this.field4306, 255, this.field4304);
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
        for (int var17 = this.field4309 - 1; var17 >= 0; var17--) {
            this.field4301[var17].method478(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class232.method1681();
        class232.method1674(true);
        class232.method1660(true);
        class232.method1647(true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V", line = 137)
    public static final void method1892() {
        class71.method482();
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()V", line = 142)
    public static void method1893() {
        field4300 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lak;)V", line = 147)
    public static final void method1894(class172 arg0) {
        field4300 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I[Lkk;IIII)V", line = 198)
    public class266(int arg0, class71[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4302 = arg3;
        this.field4307 = arg4;
        this.field4299 = arg5;
        this.field4306 = arg0;
        this.field4305 = arg1;
        if (arg1 == null) {
            this.field4301 = null;
            this.field4310 = null;
        } else {
            this.field4301 = new class71[arg1.length];
            this.field4310 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 156)
    private final void method1895(int arg0) {
        if (this.field4308 == arg0) {
            return;
        }
        this.field4308 = arg0;
        int var2 = class119.method837(372938402, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field4304 != var2) {
            this.field4304 = var2;
            this.field4303 = null;
        }
        if (this.field4305 == null) {
            return;
        }
        this.field4309 = 0;
        int[] var3 = new int[this.field4305.length];
        for (int var4 = 0; var4 < this.field4305.length; var4++) {
            class71 var5 = this.field4305[var4];
            if (var5.method476(this.field4302, this.field4307, this.field4299, this.field4308)) {
                var3[this.field4309] = var5.field1021;
                this.field4301[this.field4309++] = var5;
            }
        }
        class226.method1603(-21796, this.field4309 - 1, 0, var3, this.field4301);
    }
}
