import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class299 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    private int field4602 = -1;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    private int field4600;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    private int field4607;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[Lj;")
    private class242[] field4604;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[Lj;")
    private class242[] field4605;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lj;")
    private class242 field4599;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    private int field4601;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    private int field4608;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lun;")
    private class190 field4598;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lug;")
    public static class253 field4609;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()V", line = 8)
    public static final void method2077() {
        class242.method1726();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lug;)V", line = 11)
    public static final void method2078(class253 arg0) {
        field4609 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIII)V", line = 17)
    public final void method2079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2082(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field4607 == -1) {
            class280.method1971(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field4598 == null) {
                this.field4598 = class31.field466.method448(false, this.field4608, this.field4607, class31.field452, 1);
            }
            if (!class31.field466.method451(this.field4607, 105)) {
                class280.method1971(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field4598 != null) {
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
                for (int var12 = var11 - arg4; var12 < class280.field4303; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class280.field4307; var13 += arg4) {
                        this.field4598.method1262(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field4601 - 1; var14 >= 0; var14--) {
            this.field4605[var14].method1727(arg1, arg2, arg3, arg4, arg5, var9, this.field4599);
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I[Lj;IIII)V", line = 198)
    public class299(int arg0, class242[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4606 = arg3;
        this.field4603 = arg4;
        this.field4600 = arg5;
        this.field4607 = arg0;
        this.field4604 = arg1;
        if (arg1 == null) {
            this.field4605 = null;
            this.field4599 = null;
        } else {
            this.field4605 = new class242[arg1.length];
            this.field4599 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()V", line = 85)
    public static void method2080() {
        field4609 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(IIIIIIII)V", line = 89)
    public final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        GL var9 = class109.field1456;
        this.method2082(arg4);
        int var10 = arg0 + arg6 & 0x7FF;
        int var11 = arg1 + arg3;
        int var12 = arg2 + arg4;
        class109.method740(false);
        class109.method749(false);
        class109.method753(false);
        class109.method762();
        class109.method748(arg1, var11, arg2, var12);
        class109.method768();
        for (int var13 = this.field4601 - 1; var13 >= 0; var13--) {
            this.field4605[var13].method1729(this.field4599);
        }
        if (this.field4607 == -1) {
            class109.method782(arg7);
        } else {
            if (!class31.field466.method451(this.field4607, 97)) {
                class109.method782(arg7);
            }
            class31.field466.method461(this.field4608, this.field4607, 12487);
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
        for (int var17 = this.field4601 - 1; var17 >= 0; var17--) {
            this.field4605[var17].method1725(arg1, arg2, arg3, arg4, arg5, var10);
        }
        class109.method776();
        class109.method753(true);
        class109.method749(true);
        class109.method740(true);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 153)
    private final void method2082(int arg0) {
        if (this.field4602 == arg0) {
            return;
        }
        this.field4602 = arg0;
        int var2 = class225.method1654(-2, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field4608 != var2) {
            this.field4608 = var2;
            this.field4598 = null;
        }
        if (this.field4604 == null) {
            return;
        }
        this.field4601 = 0;
        int[] var3 = new int[this.field4604.length];
        for (int var4 = 0; var4 < this.field4604.length; var4++) {
            class242 var5 = this.field4604[var4];
            if (var5.method1730(this.field4606, this.field4603, this.field4600, this.field4602)) {
                var3[this.field4601] = var5.field3777;
                this.field4605[this.field4601++] = var5;
            }
        }
        class316.method2216(this.field4601 - 1, this.field4605, var3, 0, (byte) 118);
    }
}
