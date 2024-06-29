import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class67 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    private int field1003 = -1;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[Lcc;")
    private class25[] field997;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[Lcc;")
    private class25[] field1005;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Lcc;")
    private class25 field1006;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Ln;")
    private class178 field1002;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lwf;")
    public static class306 field1000;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 8)
    private final void method480(int arg0) {
        if (this.field1003 == arg0) {
            return;
        }
        this.field1003 = arg0;
        int var2 = class64.method463(arg0, (byte) -32);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field1001 != var2) {
            this.field1001 = var2;
            this.field1002 = null;
        }
        if (this.field997 == null) {
            return;
        }
        this.field998 = 0;
        int[] var3 = new int[this.field997.length];
        for (int var4 = 0; var4 < this.field997.length; var4++) {
            class25 var5 = this.field997[var4];
            if (var5.method186(this.field996, this.field1004, this.field999, this.field1003)) {
                var3[this.field998] = var5.field318;
                this.field1005[this.field998++] = var5;
            }
        }
        class318.method2160(var3, this.field1005, false, this.field998 - 1, 0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lwf;)V", line = 50)
    public static final void method481(class306 arg0) {
        field1000 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V", line = 54)
    public static void method482() {
        field1000 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIII)V", line = 57)
    public final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method480(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field995 == -1) {
            class57.method375(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field1002 == null) {
                this.field1002 = class12.field126.method473(this.field995, this.field1001, 63, false, class12.field114);
            }
            if (!class12.field126.method478(this.field995, -100)) {
                class57.method375(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field1002 != null) {
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
                for (int var12 = var11 - arg4; var12 < class57.field798; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class57.field793; var13 += arg4) {
                        this.field1002.method919(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field998 - 1; var14 >= 0; var14--) {
            this.field1005[var14].method190(arg1, arg2, arg3, arg4, arg5, var9, this.field1006);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIIIIII)V", line = 123)
    public final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class333.field5160;
        this.method480(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class333.method2312(false);
        class333.method2308(false);
        class333.method2316(false);
        class333.method2300();
        class333.method2299(arg1, var11, arg2, var12);
        class333.method2290();
        for (int var13 = this.field998 - 1; var13 >= 0; var13--) {
            this.field1005[var13].method191(this.field1006);
        }
        if (this.field995 == -1) {
            class333.method2287(arg7);
        } else {
            if (!class12.field126.method478(this.field995, -100)) {
                class333.method2287(arg7);
            }
            class12.field126.method474(this.field1001, (byte) -53, this.field995);
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
        for (int var17 = this.field998 - 1; var17 >= 0; var17--) {
            this.field1005[var17].method195(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class333.method2301();
        class333.method2316(true);
        class333.method2308(true);
        class333.method2312(true);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()V", line = 187)
    public static final void method485() {
        class25.method185();
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I[Lcc;IIII)V", line = 198)
    public class67(int arg0, class25[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field996 = arg3;
        this.field1004 = arg4;
        this.field999 = arg5;
        this.field995 = arg0;
        this.field997 = arg1;
        if (arg1 == null) {
            this.field1005 = null;
            this.field1006 = null;
        } else {
            this.field1005 = new class25[arg1.length];
            this.field1006 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
