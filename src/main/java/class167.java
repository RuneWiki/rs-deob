import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class167 {

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    private int field2922 = -1;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    private int field2923;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    private int field2919;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "[Laf;")
    private class196[] field2915;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "[Laf;")
    private class196[] field2924;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Laf;")
    private class196 field2917;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Ln;")
    private class309 field2914;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lcg;")
    public static class49 field2913;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lcg;)V", line = 9)
    public static final void method1311(class49 arg0) {
        field2913 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()V", line = 13)
    public static final void method1312() {
        class196.method1480();
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "()V", line = 18)
    public static void method1313() {
        field2913 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 21)
    private final void method1314(int arg0) {
        if (this.field2922 == arg0) {
            return;
        }
        this.field2922 = arg0;
        int var2 = class48.method427(arg0, -9);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2921 != var2) {
            this.field2921 = var2;
            this.field2914 = null;
        }
        if (this.field2915 == null) {
            return;
        }
        this.field2918 = 0;
        int[] var3 = new int[this.field2915.length];
        for (int var4 = 0; var4 < this.field2915.length; var4++) {
            class196 var5 = this.field2915[var4];
            if (var5.method1486(this.field2916, this.field2920, this.field2923, this.field2922)) {
                var3[this.field2918] = var5.field3348;
                this.field2924[this.field2918++] = var5;
            }
        }
        class223.method1630(var3, -1, 0, this.field2924, this.field2918 - 1);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIII)V", line = 68)
    public final void method1315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class43.field651;
        this.method1314(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class43.method392(false);
        class43.method352(false);
        class43.method366(false);
        class43.method371();
        class43.method353(arg1, var11, arg2, var12);
        class43.method354();
        for (int var13 = this.field2918 - 1; var13 >= 0; var13--) {
            this.field2924[var13].method1481(this.field2917);
        }
        if (this.field2919 == -1) {
            class43.method365(arg7);
        } else {
            if (!class62.field953.method1207(this.field2919, -77)) {
                class43.method365(arg7);
            }
            class62.field953.method1215(this.field2919, this.field2921, (byte) -70);
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
        for (int var17 = this.field2918 - 1; var17 >= 0; var17--) {
            this.field2924[var17].method1471(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class43.method376();
        class43.method366(true);
        class43.method352(true);
        class43.method392(true);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I[Laf;IIII)V", line = 198)
    public class167(int arg0, class196[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2916 = arg3;
        this.field2920 = arg4;
        this.field2923 = arg5;
        this.field2919 = arg0;
        this.field2915 = arg1;
        if (arg1 == null) {
            this.field2924 = null;
            this.field2917 = null;
        } else {
            this.field2924 = new class196[arg1.length];
            this.field2917 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IIIIIIII)V", line = 137)
    public final void method1316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1314(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2919 == -1) {
            class47.method422(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2914 == null) {
                this.field2914 = class62.field953.method1219(false, this.field2921, true, class62.field947, this.field2919);
            }
            if (!class62.field953.method1207(this.field2919, 125)) {
                class47.method422(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2914 != null) {
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
                for (int var12 = var11 - arg4; var12 < class47.field729; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class47.field721; var13 += arg4) {
                        this.field2914.method1251(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2918 - 1; var14 >= 0; var14--) {
            this.field2924[var14].method1478(arg1, arg2, arg3, arg4, arg5, var9, this.field2917);
        }
    }
}
