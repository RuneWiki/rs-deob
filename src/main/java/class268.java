import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class268 {

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    private int field4245 = -1;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field4236;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    private int field4243;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    private int field4241;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[Lvc;")
    private class203[] field4235;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[Lvc;")
    private class203[] field4238;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lvc;")
    private class203 field4234;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    private int field4240;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Ln;")
    private class298 field4244;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lkb;")
    public static class39 field4237;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 5)
    public static void method1915() {
        field4237 = null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V", line = 8)
    public static final void method1916() {
        class203.method1496();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V", line = 17)
    public final void method1917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class186.field2990;
        this.method1918(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class186.method1290(false);
        class186.method1316(false);
        class186.method1274(false);
        class186.method1287();
        class186.method1314(arg1, var11, arg2, var12);
        class186.method1284();
        for (int var13 = this.field4240 - 1; var13 >= 0; var13--) {
            this.field4238[var13].method1487(this.field4234);
        }
        if (this.field4239 == -1) {
            class186.method1309(arg7);
        } else {
            if (!class25.field365.method380(this.field4239, -23908)) {
                class186.method1309(arg7);
            }
            class25.field365.method385(this.field4242, this.field4239, 27314);
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
        for (int var17 = this.field4240 - 1; var17 >= 0; var17--) {
            this.field4238[var17].method1480(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class186.method1289();
        class186.method1274(true);
        class186.method1316(true);
        class186.method1290(true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 81)
    private final void method1918(int arg0) {
        if (this.field4245 == arg0) {
            return;
        }
        this.field4245 = arg0;
        int var2 = class45.method306(arg0, -502316351);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field4242 != var2) {
            this.field4242 = var2;
            this.field4244 = null;
        }
        if (this.field4235 == null) {
            return;
        }
        this.field4240 = 0;
        int[] var3 = new int[this.field4235.length];
        for (int var4 = 0; var4 < this.field4235.length; var4++) {
            class203 var5 = this.field4235[var4];
            if (var5.method1491(this.field4236, this.field4243, this.field4241, this.field4245)) {
                var3[this.field4240] = var5.field3319;
                this.field4238[this.field4240++] = var5;
            }
        }
        class93.method676(0, var3, this.field4240 - 1, 2, this.field4238);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIIIIII)V", line = 124)
    public final void method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1918(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field4239 == -1) {
            class216.method1573(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field4244 == null) {
                this.field4244 = class25.field365.method372(false, this.field4242, class25.field372, this.field4239, 111);
            }
            if (!class25.field365.method380(this.field4239, -23908)) {
                class216.method1573(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field4244 != null) {
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
                for (int var12 = var11 - arg4; var12 < class216.field3482; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class216.field3487; var13 += arg4) {
                        this.field4244.method88(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field4240 - 1; var14 >= 0; var14--) {
            this.field4238[var14].method1497(arg1, arg2, arg3, arg4, arg5, var9, this.field4234);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I[Lvc;IIII)V", line = 198)
    public class268(int arg0, class203[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4236 = arg3;
        this.field4243 = arg4;
        this.field4241 = arg5;
        this.field4239 = arg0;
        this.field4235 = arg1;
        if (arg1 == null) {
            this.field4238 = null;
            this.field4234 = null;
        } else {
            this.field4238 = new class203[arg1.length];
            this.field4234 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lkb;)V", line = 195)
    public static final void method1920(class39 arg0) {
        field4237 = arg0;
    }
}
