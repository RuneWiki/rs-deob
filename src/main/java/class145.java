import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class145 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    private int field2375 = -1;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[Ljf;")
    private class340[] field2379;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[Ljf;")
    private class340[] field2383;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljf;")
    private class340 field2382;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    private int field2380;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lfd;")
    private class206 field2384;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lbm;")
    public static class307 field2373;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I[Ljf;IIII)V", line = 198)
    public class145(int arg0, class340[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2377 = arg3;
        this.field2374 = arg4;
        this.field2381 = arg5;
        this.field2378 = arg0;
        this.field2379 = arg1;
        if (arg1 == null) {
            this.field2383 = null;
            this.field2382 = null;
        } else {
            this.field2383 = new class340[arg1.length];
            this.field2382 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public final void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class249.field3898;
        this.method943(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class249.method1661(false);
        class249.method1648(false);
        class249.method1677(false);
        class249.method1657();
        class249.method1668(arg1, var11, arg2, var12);
        class249.method1650();
        for (int var13 = this.field2380 - 1; var13 >= 0; var13--) {
            this.field2383[var13].method2361(this.field2382);
        }
        if (this.field2378 == -1) {
            class249.method1690(arg7);
        } else {
            if (!class284.field4393.method395(255, this.field2378)) {
                class249.method1690(arg7);
            }
            class284.field4393.method407(this.field2378, -118, this.field2376);
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
        for (int var17 = this.field2380 - 1; var17 >= 0; var17--) {
            this.field2383[var17].method2356(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class249.method1659();
        class249.method1677(true);
        class249.method1648(true);
        class249.method1661(true);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIIIIIII)V", line = 76)
    public final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method943(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2378 == -1) {
            class270.method1811(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2384 == null) {
                this.field2384 = class284.field4393.method410(this.field2376, class284.field4394, 65535, this.field2378, false);
            }
            if (!class284.field4393.method395(255, this.field2378)) {
                class270.method1811(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2384 != null) {
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
                for (int var12 = var11 - arg4; var12 < class270.field4172; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class270.field4169; var13 += arg4) {
                        this.field2384.method905(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2380 - 1; var14 >= 0; var14--) {
            this.field2383[var14].method2344(arg1, arg2, arg3, arg4, arg5, var9, this.field2382);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 138)
    public static void method940() {
        field2373 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lbm;)V", line = 145)
    public static final void method941(class307 arg0) {
        field2373 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V", line = 153)
    public static final void method942() {
        class340.method2360();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 157)
    private final void method943(int arg0) {
        if (this.field2375 == arg0) {
            return;
        }
        this.field2375 = arg0;
        int var2 = class173.method1093((byte) 58, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2376 != var2) {
            this.field2376 = var2;
            this.field2384 = null;
        }
        if (this.field2379 == null) {
            return;
        }
        this.field2380 = 0;
        int[] var3 = new int[this.field2379.length];
        for (int var4 = 0; var4 < this.field2379.length; var4++) {
            class340 var5 = this.field2379[var4];
            if (var5.method2348(this.field2377, this.field2374, this.field2381, this.field2375)) {
                var3[this.field2380] = var5.field5280;
                this.field2383[this.field2380++] = var5;
            }
        }
        class345.method2387(0, var3, -24834, this.field2380 - 1, this.field2383);
    }
}
