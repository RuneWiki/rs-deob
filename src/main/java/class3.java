import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    private int field31 = -1;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lqg;")
    private class269[] field35;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[Lqg;")
    private class269[] field36;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lqg;")
    private class269 field33;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lch;")
    private class158 field34;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lnk;")
    public static class16 field38;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method25(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field37 == -1) {
            class343.method2352(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field34 == null) {
                this.field34 = class104.field1438.method890(this.field37, false, this.field28, class104.field1425, (byte) 120);
            }
            if (!class104.field1438.method886(11843, this.field37)) {
                class343.method2352(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field34 != null) {
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
                        this.field34.method19(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field32 - 1; var14 >= 0; var14--) {
            this.field36[var14].method1887(arg1, arg2, arg3, arg4, arg5, var9, this.field33);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 68)
    public static void method22() {
        field38 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lnk;)V", line = 74)
    public static final void method23(class16 arg0) {
        field38 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIIIIII)V", line = 79)
    public final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class272.field4310;
        this.method25(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class272.method1940(false);
        class272.method1941(false);
        class272.method1934(false);
        class272.method1926();
        class272.method1935(arg1, var11, arg2, var12);
        class272.method1922();
        for (int var13 = this.field32 - 1; var13 >= 0; var13--) {
            this.field36[var13].method1888(this.field33);
        }
        if (this.field37 == -1) {
            class272.method1937(arg7);
        } else {
            if (!class104.field1438.method886(11843, this.field37)) {
                class272.method1937(arg7);
            }
            class104.field1438.method887(false, this.field28, this.field37);
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
        for (int var17 = this.field32 - 1; var17 >= 0; var17--) {
            this.field36[var17].method1897(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class272.method1942();
        class272.method1934(true);
        class272.method1941(true);
        class272.method1940(true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 145)
    private final void method25(int arg0) {
        if (this.field31 == arg0) {
            return;
        }
        this.field31 = arg0;
        int var2 = class75.method477((byte) -104, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field28 != var2) {
            this.field28 = var2;
            this.field34 = null;
        }
        if (this.field35 == null) {
            return;
        }
        this.field32 = 0;
        int[] var3 = new int[this.field35.length];
        for (int var4 = 0; var4 < this.field35.length; var4++) {
            class269 var5 = this.field35[var4];
            if (var5.method1892(this.field30, this.field27, this.field29, this.field31)) {
                var3[this.field32] = var5.field4231;
                this.field36[this.field32++] = var5;
            }
        }
        class236.method1632(this.field36, this.field32 - 1, var3, 0, (byte) 78);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 190)
    public static final void method26() {
        class269.method1891();
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[Lqg;IIII)V", line = 198)
    public class3(int arg0, class269[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field30 = arg3;
        this.field27 = arg4;
        this.field29 = arg5;
        this.field37 = arg0;
        this.field35 = arg1;
        if (arg1 == null) {
            this.field36 = null;
            this.field33 = null;
        } else {
            this.field36 = new class269[arg1.length];
            this.field33 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
