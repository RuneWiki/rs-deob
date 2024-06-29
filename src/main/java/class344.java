import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class344 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    private int field5333 = -1;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    private int field5336;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    private int field5340;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    private int field5334;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    private int field5335;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "[Ljf;")
    private class241[] field5343;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "[Ljf;")
    private class241[] field5339;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Ljf;")
    private class241 field5332;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    private int field5341;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    private int field5342;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Llc;")
    public static class175 field5338;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Laf;")
    private class189 field5337;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 5)
    private final void method2374(int arg0) {
        if (this.field5333 == arg0) {
            return;
        }
        this.field5333 = arg0;
        int var2 = class80.method475(1397417249, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field5341 != var2) {
            this.field5341 = var2;
            this.field5337 = null;
        }
        if (this.field5343 == null) {
            return;
        }
        this.field5342 = 0;
        int[] var3 = new int[this.field5343.length];
        for (int var4 = 0; var4 < this.field5343.length; var4++) {
            class241 var5 = this.field5343[var4];
            if (var5.method1737(this.field5336, this.field5340, this.field5334, this.field5333)) {
                var3[this.field5342] = var5.field3629;
                this.field5339[this.field5342++] = var5;
            }
        }
        class219.method1507(0, this.field5342 - 1, false, var3, this.field5339);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V", line = 50)
    public static final void method2375() {
        class241.method1742();
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "()V", line = 55)
    public static void method2376() {
        field5338 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIII)V", line = 60)
    public final void method2377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class250.field3818;
        this.method2374(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class250.method1815(false);
        class250.method1819(false);
        class250.method1794(false);
        class250.method1834();
        class250.method1830(arg1, var11, arg2, var12);
        class250.method1827();
        for (int var13 = this.field5342 - 1; var13 >= 0; var13--) {
            this.field5339[var13].method1741(this.field5332);
        }
        if (this.field5335 == -1) {
            class250.method1831(arg7);
        } else {
            if (!class215.field3020.method384(16056, this.field5335)) {
                class250.method1831(arg7);
            }
            class215.field3020.method368((byte) -6, this.field5341, this.field5335);
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
        for (int var17 = this.field5342 - 1; var17 >= 0; var17--) {
            this.field5339[var17].method1730(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class250.method1791();
        class250.method1794(true);
        class250.method1819(true);
        class250.method1815(true);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Llc;)V", line = 126)
    public static final void method2378(class175 arg0) {
        field5338 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(I[Ljf;IIII)V", line = 135)
    public class344(int arg0, class241[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5336 = arg3;
        this.field5340 = arg4;
        this.field5334 = arg5;
        this.field5335 = arg0;
        this.field5343 = arg1;
        if (arg1 == null) {
            this.field5339 = null;
            this.field5332 = null;
        } else {
            this.field5339 = new class241[arg1.length];
            this.field5332 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIIIII)V", line = 154)
    public final void method2379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2374(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field5335 == -1) {
            class144.method977(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field5337 == null) {
                this.field5337 = class215.field3020.method385(false, (byte) -121, this.field5341, this.field5335, class215.field3008);
            }
            if (!class215.field3020.method384(16056, this.field5335)) {
                class144.method977(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field5337 != null) {
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
                for (int var12 = var11 - arg4; var12 < class144.field2009; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class144.field2011; var13 += arg4) {
                        this.field5337.method539(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field5342 - 1; var14 >= 0; var14--) {
            this.field5339[var14].method1725(arg1, arg2, arg3, arg4, arg5, var9, this.field5332);
        }
    }
}
