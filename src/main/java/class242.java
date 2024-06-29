import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class242 {

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private int field3776 = -1;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    private int field3786 = -1;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Z")
    private boolean field3789 = true;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
    private boolean field3781;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field3769;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    private int field3772;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field3788;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    private int field3767;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
    private static int[] field3768 = new int[4];

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private static int field3775 = -1;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    private static int field3787 = -1;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    private int field3771;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    private int field3778;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lom;")
    private static class165 field3774;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lun;")
    private class190 field3780;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3779;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3784;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[B")
    private static byte[] field3766;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 6)
    private static final void method1722() {
        if (field3784 != null) {
            return;
        }
        class6 var0 = new class6(1088);
        class6 var1 = new class6(5140);
        if (class109.field1464) {
            var1.method36(0.0F, (byte) 127);
            var1.method36(1.0F, (byte) 119);
            var1.method36(0.0F, (byte) 121);
            var1.method36(0.5F, (byte) 119);
            var1.method36(1.0F, (byte) 123);
            var1.method36(0.0F, (byte) 123);
            var1.method36(-1.0F, (byte) 126);
            var1.method36(0.0F, (byte) 119);
            var1.method36(0.5F, (byte) 127);
            var1.method36(0.0F, (byte) 123);
        } else {
            var1.method91(0.0F, -211870840);
            var1.method91(1.0F, -211870840);
            var1.method91(0.0F, -211870840);
            var1.method91(0.5F, -211870840);
            var1.method91(1.0F, -211870840);
            var1.method91(0.0F, -211870840);
            var1.method91(-1.0F, -211870840);
            var1.method91(0.0F, -211870840);
            var1.method91(0.5F, -211870840);
            var1.method91(0.0F, -211870840);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class31.field467[var5] / 65535.0F;
            float var7 = (float) class31.field451[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class31.field451[var9] / 65535.0F;
                float var11 = (float) class31.field467[var9] * var6 / 65535.0F;
                float var12 = (float) class31.field467[var9] * var7 / 65535.0F;
                if (class109.field1464) {
                    var1.method36(var12, (byte) 126);
                    var1.method36(var10, (byte) 126);
                    var1.method36(var11, (byte) 124);
                    var1.method36(var2, (byte) 119);
                    var1.method36(var3, (byte) 125);
                } else {
                    var1.method91(var12, -211870840);
                    var1.method91(var10, -211870840);
                    var1.method91(var11, -211870840);
                    var1.method91(var2, -211870840);
                    var1.method91(var3, -211870840);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class109.field1464) {
                    var0.method65((byte) -9, 0);
                    var0.method65((byte) -9, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method65((byte) -9, var14++);
                        var0.method65((byte) -9, var13++);
                    }
                    var0.method65((byte) -9, 1);
                    var0.method65((byte) -9, 1);
                } else {
                    var0.method43(0, 114);
                    var0.method43(0, 113);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method43(var14++, 112);
                        var0.method43(var13++, 124);
                    }
                    var0.method43(1, 112);
                    var0.method43(1, 122);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field3784 = ByteBuffer.allocateDirect(var1.field111);
        field3784.put(var1.field115, 0, var1.field111);
        field3784.flip();
        field3779 = ByteBuffer.allocateDirect(var0.field111);
        field3779.put(var0.field115, 0, var0.field111);
        field3779.flip();
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V", line = 163)
    public static void method1723() {
        field3784 = null;
        field3779 = null;
        field3774 = null;
        field3766 = null;
        field3768 = null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V", line = 171)
    private static final void method1724() {
        method1741();
        if (field3775 == -1 || field3787 != class103.field1369) {
            field3775 = class313.method2181(class313.field4906, 128, 128, field3766);
            field3787 = class103.field1369;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 181)
    public final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field3783 - arg4 & 0x7FF;
        int var8 = this.field3778 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field3771) / 2 + var9;
        int var12 = (arg2 - this.field3771) / 2 + var10;
        if (var11 >= arg3 || this.field3771 + var11 <= 0 || var12 >= arg2 || this.field3771 + var12 <= 0) {
            return;
        }
        if (this.field3767 == 0) {
            class31.field466.method461(this.field3782, this.field3769, 12487);
        } else if (this.field3776 == -1) {
            return;
        } else {
            class109.method752(this.field3776);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field3771 + var14;
        int var16 = this.field3771 + var13;
        GL var17 = class109.field1456;
        var17.glBegin(7);
        var17.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var17.glTexCoord2f(0.0F, 0.0F);
        var17.glVertex2i(var14, var13);
        var17.glTexCoord2f(0.0F, 1.0F);
        var17.glVertex2i(var14, var16);
        var17.glTexCoord2f(1.0F, 1.0F);
        var17.glVertex2i(var15, var16);
        var17.glTexCoord2f(1.0F, 0.0F);
        var17.glVertex2i(var15, var13);
        var17.glEnd();
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 234)
    protected final void finalize() throws Throwable {
        this.method1740();
        super.finalize();
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V", line = 240)
    public static final void method1726() {
        if (field3775 != -1) {
            class103.method714(field3775, 0, field3787);
        }
        field3775 = -1;
        field3787 = -1;
        field3784 = null;
        field3779 = null;
        field3774 = null;
        field3766 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIILj;)V", line = 255)
    public final void method1727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class242 arg6) {
        int var8 = this.field3783 - arg4 & 0x7FF;
        int var9 = this.field3778 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3771) / 2 + var10;
        int var13 = (arg2 - this.field3771) / 2 + var11;
        if (var12 < arg3 && this.field3771 + var12 > 0 && var13 < arg2 && this.field3771 + var13 > 0 && this.method1731(arg6)) {
            this.field3780.method1262(arg0 + var13, arg1 + var12, this.field3771, this.field3771);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lj;)Z", line = 285)
    private final boolean method1728(class242 arg0) {
        class165 var2 = class165.method1235(class299.field4609, this.field3769, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class109.field1456;
        class122.method881(field3768);
        class122.method898();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field3781) {
                var4 = -arg0.field3770;
                var5 = -arg0.field3785;
                var6 = -arg0.field3773;
            } else {
                var4 = this.field3770 - arg0.field3770;
                var5 = this.field3785 - arg0.field3785;
                var6 = this.field3773 - arg0.field3773;
            }
        }
        var2.method1241();
        class89 var7 = var2.method1226(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method383() - var7.method408()) / 2;
        int var9 = (var7.method392() - var7.method397()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class90.method645((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field3782, this.field3782);
        if (this.field3783 != 0) {
            int var11 = class31.field467[this.field3783];
            int var12 = class31.field451[this.field3783];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field3778 != 0) {
            int var14 = this.field3778 - 1024 & 0x7FF;
            int var15 = class31.field467[var14];
            int var16 = class31.field451[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class115.method808((float) (-var4), (float) var5, (float) (-var6));
        class115.method811(16777215, 0.5F, 0.5F, 0.5F);
        class115.method816();
        class109.method776();
        class109.method753(true);
        class109.method749(true);
        var7.method402(0, 0, 0, 0, -var8 - var7.method408(), -var9 - var7.method397(), 0, -1L);
        class109.method749(false);
        class109.method753(false);
        class109.method768();
        class90.method648();
        class109.method752(this.field3776);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3782, this.field3782, 0);
        class122.method883(field3768);
        return true;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lj;)V", line = 371)
    public final void method1729(class242 arg0) {
        if (this.field3767 == 0) {
            return;
        }
        boolean var2 = this.field3776 == -1 || class103.field1369 != this.field3786;
        if (!this.field3789 && !var2) {
            return;
        }
        if (var2) {
            this.field3786 = class103.field1369;
            this.field3776 = class313.method2185(class313.field4900, this.field3782, this.field3782);
        } else {
            class109.method752(this.field3776);
            class313.method2186(class313.field4900, this.field3782, this.field3782);
        }
        if (this.field3767 == 1) {
            this.method1735(arg0);
            this.field3789 = false;
        } else if (this.field3767 == 2) {
            this.field3789 = !this.method1728(arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)Z", line = 415)
    public final boolean method1730(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3781) {
            this.field3777 = 1073741823;
            var8 = this.field3770;
            var9 = this.field3785;
            var10 = this.field3773;
        } else {
            int var5 = this.field3770 - arg0;
            int var6 = this.field3785 - arg1;
            int var7 = this.field3773 - arg2;
            this.field3777 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3777 == 0) {
                this.field3777 = 1;
            }
            var8 = (var5 << 8) / this.field3777;
            var9 = (var6 << 8) / this.field3777;
            var10 = (var7 << 8) / this.field3777;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3771 = this.field3788 * arg3 / (this.field3781 ? 1024 : this.field3777);
        } else {
            this.field3771 = 0;
        }
        if (this.field3771 < 8) {
            this.method1740();
            this.field3780 = null;
            return false;
        }
        int var12 = class225.method1654(-2, this.field3771);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3782 != var12) {
            this.field3782 = var12;
        }
        this.field3783 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3778 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3789 = true;
        this.field3780 = null;
        return true;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Lj;)Z", line = 471)
    private final boolean method1731(class242 arg0) {
        if (this.field3780 == null) {
            if (this.field3767 == 0) {
                this.field3780 = class31.field466.method448(true, this.field3782, this.field3769, class31.field452, 1);
            } else if (this.field3767 == 2) {
                this.method1737(arg0);
            } else if (this.field3767 == 1) {
                this.method1738(arg0);
            }
        }
        return this.field3780 != null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 500)
    private final void method1732(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3766[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3770 = arg2;
        this.field3785 = arg3;
        this.field3773 = arg4;
        this.field3781 = arg7;
        this.field3769 = arg1;
        this.field3772 = arg6;
        this.field3788 = arg5;
        this.field3767 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()V", line = 547)
    private final void method1733() {
        int var1 = this.field3782 * 3 / 32;
        int var3 = this.field3782 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class280.field4303 * var1 + var1;
        int var8 = class280.field4303 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class280.field4306) {
            var4 = var3 - (var1 + var3 - class280.field4306);
        }
        if (var1 < class280.field4311) {
            int var11 = class280.field4311 - var1;
            var4 -= var11;
            var7 += class280.field4303 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class280.field4308) {
            int var12 = var1 + var3 - class280.field4308;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class280.field4305) {
            int var13 = class280.field4305 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1732(class280.field4310, 0, this.field3772, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "()V", line = 600)
    private final void method1734() {
        int var1 = this.field3782;
        int var2 = this.field3782;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class280.field4303 - var1;
        if (var2 > class280.field4306) {
            var2 -= var2 - class280.field4306;
        }
        if (class280.field4311 > 0) {
            int var9 = class280.field4311;
            var2 -= var9;
            var7 += class280.field4303 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class280.field4308) {
            int var10 = var1 - class280.field4308;
            var1 -= var10;
            var8 += var10;
        }
        if (class280.field4305 > 0) {
            int var11 = class280.field4305;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1736(class280.field4310, this.field3772, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(Lj;)V", line = 650)
    private final void method1735(class242 arg0) {
        method1722();
        method1724();
        GL var2 = class109.field1456;
        class122.method881(field3768);
        class122.method898();
        var2.glClearColor((float) ((this.field3772 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field3772 & 0xFF00) >> 8) / 255.0F, (float) (this.field3772 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3781) {
                var3 = -arg0.field3770;
                var4 = -arg0.field3785;
                var5 = -arg0.field3773;
            } else {
                var3 = this.field3770 - arg0.field3770;
                var4 = this.field3785 - arg0.field3785;
                var5 = this.field3773 - arg0.field3773;
            }
        }
        class90.method650(-1.0F, 1.0F, -1.0F, 1.0F, this.field3782, this.field3782);
        if (this.field3783 != 0) {
            int var6 = class31.field467[this.field3783];
            int var7 = class31.field451[this.field3783];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3778 != 0) {
            int var9 = this.field3778 - 1024 & 0x7FF;
            int var10 = class31.field467[var9];
            int var11 = class31.field451[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class115.method808((float) (-var3), (float) (-var4), (float) var5);
        class115.method811(16777215, 0.5F, 0.5F, 1.0F);
        class115.method816();
        if (this.field3772 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class31.field466.method461(this.field3782, this.field3769, 12487);
        class109.method749(true);
        if (class109.field1496) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field3784.position(0));
        var2.glVertexPointer(2, 5126, 20, field3784.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field3784.position(12));
        var2.glDrawElements(5, field3779.limit() / 2, 5123, field3779.position(0));
        var2.glEnableClientState(32886);
        class109.method749(false);
        if (this.field3772 != 0) {
            class256.method1855(0, -115, 0);
            class109.method766(1);
            class109.method756(0);
            class109.method752(field3775);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3772 >> 16), (byte) (this.field3772 >> 8), (byte) this.field3772, (byte) 127);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glTexEnvi(8960, 34200, 770);
            var2.glLoadIdentity();
            var2.glColorMask(true, true, true, true);
            var2.glBlendFunc(773, 772);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3772 >> 16), (byte) (this.field3772 >> 8), (byte) this.field3772, (byte) -1);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glBlendFunc(770, 771);
            var2.glTexEnvi(8960, 34176, 5890);
        }
        class90.method648();
        class109.method752(this.field3776);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3782, this.field3782, 0);
        class122.method883(field3768);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIIIIIIIII)V", line = 776)
    private final void method1736(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3766[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(Lj;)V", line = 811)
    private final void method1737(class242 arg0) {
        class165 var2 = class165.method1235(class299.field4609, this.field3769, 0);
        if (var2 == null) {
            return;
        }
        this.field3780 = new class190(this.field3782, this.field3782);
        class280.method1966(field3768);
        this.field3780.method1401();
        class31.method277();
        class280.method1971(0, 0, this.field3782, this.field3782, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3781) {
                var3 = -arg0.field3770;
                var4 = -arg0.field3785;
                var5 = -arg0.field3773;
            } else {
                var3 = this.field3770 - arg0.field3770;
                var4 = this.field3785 - arg0.field3785;
                var5 = this.field3773 - arg0.field3773;
            }
        }
        if (this.field3783 != 0) {
            int var6 = class31.field467[this.field3783];
            int var7 = class31.field451[this.field3783];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3778 != 0) {
            int var9 = this.field3778 - 1024 & 0x7FF;
            int var10 = class31.field467[var9];
            int var11 = class31.field451[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class53 var13 = var2.method1220(64, 768, -var3, -var4, -var5);
        int var14 = var13.method383() - var13.method408();
        int var15 = var13.method392() - var13.method397();
        int var16 = var13.method408() + var14 / 2;
        int var17 = var13.method397() + var15 / 2;
        if (var14 > var15) {
            var13.method414(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3782);
        } else {
            var13.method414(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3782);
        }
        class42.field583.method512(25);
        class280.method1984(field3768);
        class31.method277();
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(Lj;)V", line = 895)
    private final void method1738(class242 arg0) {
        method1739();
        method1741();
        this.field3780 = new class186(this.field3782, this.field3782);
        class280.method1966(field3768);
        this.field3780.method1401();
        class31.method277();
        class280.method1971(0, 0, this.field3782, this.field3782, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3781) {
                var2 = -arg0.field3770;
                var3 = -arg0.field3785;
                var4 = -arg0.field3773;
            } else {
                var2 = this.field3770 - arg0.field3770;
                var3 = this.field3785 - arg0.field3785;
                var4 = this.field3773 - arg0.field3773;
            }
        }
        if (this.field3783 != 0) {
            int var5 = class31.field467[this.field3783];
            int var6 = class31.field451[this.field3783];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3778 != 0) {
            int var8 = this.field3778 - 1024 & 0x7FF;
            int var9 = class31.field467[var8];
            int var10 = class31.field451[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class54.method428(field3774.field2667, 0, field3774.field2668, (short) class31.field466.method458(17701, this.field3769));
        class53 var12 = field3774.method1220(64, 512, -var2, -var3, -var4);
        int var13 = var12.method383() - var12.method408();
        int var14 = var12.method392() - var12.method397();
        if (var13 > var14) {
            int var15 = this.field3772 == 0 ? (var13 << 9) / this.field3782 : (var13 * 16 << 9) / (this.field3782 * 13);
            var12.method414(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3772 == 0 ? (var14 << 9) / this.field3782 : (var14 * 16 << 9) / (this.field3782 * 13);
            var12.method414(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3772 == 0) {
            for (int var17 = 0; var17 < class280.field4310.length; var17++) {
                if (class280.field4310[var17] != 0) {
                    class280.field4310[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1733();
            this.method1734();
        }
        class42.field583.method512(121);
        class280.method1984(field3768);
        class31.method277();
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "()V", line = 996)
    private static final void method1739() {
        if (field3774 != null) {
            return;
        }
        class165 var0 = field3774 = new class165(260, 480, 0);
        int[] var1 = var0.field2679;
        int[] var2 = var0.field2669;
        int[] var3 = var0.field2687;
        int[] var4 = var0.field2689;
        int[] var5 = var0.field2708;
        int[] var6 = var0.field2680;
        var0.field2661 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class31.field467[var8] >> 1;
            int var10 = class31.field451[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class31.field451[var12] >> 9;
                int var14 = (class31.field467[var12] >> 1) * var9 >> 23;
                int var15 = (class31.field467[var12] >> 1) * var10 >> 23;
                var1[var0.field2661] = var15;
                var2[var0.field2661] = var13;
                var3[var0.field2661] = -var14;
                var0.field2661++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field2668] = 0;
                var5[var0.field2668] = var17;
                var6[var0.field2668] = var16;
                var0.field2668++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field2668] = var17;
                    var5[var0.field2668] = var19;
                    var6[var0.field2668] = var16;
                    var0.field2668++;
                    var4[var0.field2668] = var19;
                    var5[var0.field2668] = var20;
                    var6[var0.field2668] = var16;
                    var0.field2668++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field2668] = var16;
                var5[var0.field2668] = var17;
                var6[var0.field2668] = 1;
                var0.field2668++;
            }
        }
        var0.field2675 = var0.field2661;
        var0.field2696 = null;
        var0.field2706 = null;
        var0.field2672 = null;
        var0.field2685 = null;
        var0.field2682 = null;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()V", line = 1114)
    private final void method1740() {
        if (this.field3776 != -1) {
            class103.method714(this.field3776, 0, this.field3786);
        }
        this.field3789 = true;
        this.field3776 = -1;
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "()V", line = 1124)
    private static final void method1741() {
        if (field3766 != null) {
            return;
        }
        field3766 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field3766[var4 + var6] = field3766[var4 + var9] = field3766[var5 + var6] = field3766[var5 + var9] = (byte) var11;
            }
        }
    }
}
