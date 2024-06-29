import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class82 {

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    private int field1181 = -1;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[Lmb;")
    private class198[] field1182;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[Lmb;")
    private class198[] field1176;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lmb;")
    private class198 field1177;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lln;")
    private class118 field1172;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lph;")
    public static class361 field1174;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lph;)V", line = 5)
    public static final void method670(class361 arg0) {
        field1174 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 11)
    public static final void method671() {
        class198.method1438();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V", line = 17)
    public final void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method674(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field1175 == -1) {
            class44.method317(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field1172 == null) {
                this.field1172 = class345.field5336.method579(false, class345.field5338, this.field1175, this.field1180, false);
            }
            if (!class345.field5336.method578(126, this.field1175)) {
                class44.method317(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field1172 != null) {
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
                        this.field1172.method651(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field1178 - 1; var14 >= 0; var14--) {
            this.field1176[var14].method1424(arg1, arg2, arg3, arg4, arg5, var9, this.field1177);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V", line = 83)
    public static void method673() {
        field1174 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 86)
    private final void method674(int arg0) {
        if (this.field1181 == arg0) {
            return;
        }
        this.field1181 = arg0;
        int var2 = class98.method771((byte) 101, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field1180 != var2) {
            this.field1180 = var2;
            this.field1172 = null;
        }
        if (this.field1182 == null) {
            return;
        }
        this.field1178 = 0;
        int[] var3 = new int[this.field1182.length];
        for (int var4 = 0; var4 < this.field1182.length; var4++) {
            class198 var5 = this.field1182[var4];
            if (var5.method1423(this.field1179, this.field1183, this.field1173, this.field1181)) {
                var3[this.field1178] = var5.field2878;
                this.field1176[this.field1178++] = var5;
            }
        }
        class265.method1965(this.field1176, 2, var3, this.field1178 - 1, 0);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[Lmb;IIII)V", line = 198)
    public class82(int arg0, class198[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1179 = arg3;
        this.field1183 = arg4;
        this.field1173 = arg5;
        this.field1175 = arg0;
        this.field1182 = arg1;
        if (arg1 == null) {
            this.field1176 = null;
            this.field1177 = null;
        } else {
            this.field1176 = new class198[arg1.length];
            this.field1177 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIIIII)V", line = 133)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class141.field2025;
        this.method674(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class141.method1011(false);
        class141.method1021(false);
        class141.method982(false);
        class141.method987();
        class141.method1010(arg1, var11, arg2, var12);
        class141.method1020();
        for (int var13 = this.field1178 - 1; var13 >= 0; var13--) {
            this.field1176[var13].method1440(this.field1177);
        }
        if (this.field1175 == -1) {
            class141.method990(arg7);
        } else {
            if (!class345.field5336.method578(125, this.field1175)) {
                class141.method990(arg7);
            }
            class345.field5336.method582(this.field1175, -114, this.field1180);
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
        for (int var17 = this.field1178 - 1; var17 >= 0; var17--) {
            this.field1176[var17].method1433(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class141.method1023();
        class141.method982(true);
        class141.method1021(true);
        class141.method1011(true);
    }
}
