import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class266 {

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    private int field4146 = -1;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    private int field4157 = -1;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Z")
    private boolean field4144 = true;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Z")
    private boolean field4140;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    private int field4160;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    private int field4152;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    private int field4159;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    private int field4145;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    private static int field4138 = -1;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "[I")
    private static int[] field4149 = new int[4];

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    private static int field4147 = -1;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    private int field4139;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lgm;")
    private class249 field4137;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Ld;")
    private static class42 field4150;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4156;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4158;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "[B")
    private static byte[] field4154;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([IIIIIIIIIII)V", line = 7)
    private final void method1812(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field4154[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 46)
    private final void method1813(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field4154[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()V", line = 88)
    private final void method1814() {
        int var1 = this.field4141 * 3 / 32;
        int var3 = this.field4141 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class109.field1709 * var1 + var1;
        int var8 = class109.field1709 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class109.field1705) {
            var4 = var3 - (var1 + var3 - class109.field1705);
        }
        if (var1 < class109.field1707) {
            int var11 = class109.field1707 - var1;
            var4 -= var11;
            var7 += class109.field1709 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class109.field1703) {
            int var12 = var1 + var3 - class109.field1703;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class109.field1708) {
            int var13 = class109.field1708 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1813(class109.field1704, 0, this.field4152, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lcn;)V", line = 143)
    private final void method1815(class266 arg0) {
        class42 var2 = class42.method337(class45.field739, this.field4160, 0);
        if (var2 == null) {
            return;
        }
        this.field4137 = new class249(this.field4141, this.field4141);
        class109.method811(field4149);
        this.field4137.method1714();
        class15.method121();
        class109.method812(0, 0, this.field4141, this.field4141, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4140) {
                var3 = -arg0.field4143;
                var4 = -arg0.field4142;
                var5 = -arg0.field4153;
            } else {
                var3 = this.field4143 - arg0.field4143;
                var4 = this.field4142 - arg0.field4142;
                var5 = this.field4153 - arg0.field4153;
            }
        }
        if (this.field4155 != 0) {
            int var6 = class15.field204[this.field4155];
            int var7 = class15.field216[this.field4155];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4139 != 0) {
            int var9 = this.field4139 - 1024 & 0x7FF;
            int var10 = class15.field204[var9];
            int var11 = class15.field216[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class66 var13 = var2.method334(64, 768, -var3, -var4, -var5);
        int var14 = var13.method205() - var13.method173();
        int var15 = var13.method183() - var13.method76();
        int var16 = var13.method173() + var14 / 2;
        int var17 = var13.method76() + var15 / 2;
        if (var14 > var15) {
            var13.method500(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field4141);
        } else {
            var13.method500(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field4141);
        }
        class175.field2644.method1475(true);
        class109.method816(field4149);
        class15.method121();
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lcn;)V", line = 225)
    private final void method1816(class266 arg0) {
        method1831();
        method1821();
        GL var2 = class94.field1473;
        class167.method1199(field4149);
        class167.method1191();
        var2.glClearColor((float) ((this.field4152 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field4152 & 0xFF00) >> 8) / 255.0F, (float) (this.field4152 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4140) {
                var3 = -arg0.field4143;
                var4 = -arg0.field4142;
                var5 = -arg0.field4153;
            } else {
                var3 = this.field4143 - arg0.field4143;
                var4 = this.field4142 - arg0.field4142;
                var5 = this.field4153 - arg0.field4153;
            }
        }
        class151.method1043(-1.0F, 1.0F, -1.0F, 1.0F, this.field4141, this.field4141);
        if (this.field4155 != 0) {
            int var6 = class15.field204[this.field4155];
            int var7 = class15.field216[this.field4155];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4139 != 0) {
            int var9 = this.field4139 - 1024 & 0x7FF;
            int var10 = class15.field204[var9];
            int var11 = class15.field216[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class250.method1734((float) (-var3), (float) (-var4), (float) var5);
        class250.method1736(16777215, 0.5F, 0.5F, 1.0F);
        class250.method1738();
        if (this.field4152 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class15.field207.method2084((byte) 74, this.field4141, this.field4160);
        class94.method668(true);
        if (class94.field1507) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field4158.position(0));
        var2.glVertexPointer(2, 5126, 20, field4158.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field4158.position(12));
        var2.glDrawElements(5, field4156.limit() / 2, 5123, field4156.position(0));
        var2.glEnableClientState(32886);
        class94.method668(false);
        if (this.field4152 != 0) {
            class37.method313(0, 0, 0);
            class94.method677(1);
            class94.method675(0);
            class94.method698(field4147);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field4152 >> 16), (byte) (this.field4152 >> 8), (byte) this.field4152, (byte) 127);
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
            var2.glColor4ub((byte) (this.field4152 >> 16), (byte) (this.field4152 >> 8), (byte) this.field4152, (byte) -1);
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
        class151.method1048();
        class94.method698(this.field4146);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field4141, this.field4141, 0);
        class167.method1201(field4149);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "()V", line = 350)
    private final void method1817() {
        if (this.field4146 != -1) {
            class198.method1404(this.field4146, 0, this.field4157);
        }
        this.field4144 = true;
        this.field4146 = -1;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "()V", line = 358)
    private static final void method1818() {
        if (field4154 != null) {
            return;
        }
        field4154 = new byte[16384];
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
                field4154[var4 + var6] = field4154[var4 + var9] = field4154[var5 + var6] = field4154[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "()V", line = 410)
    private static final void method1819() {
        if (field4150 != null) {
            return;
        }
        class42 var0 = field4150 = new class42(260, 480, 0);
        int[] var1 = var0.field646;
        int[] var2 = var0.field660;
        int[] var3 = var0.field630;
        int[] var4 = var0.field632;
        int[] var5 = var0.field663;
        int[] var6 = var0.field615;
        var0.field636 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class15.field204[var8] >> 1;
            int var10 = class15.field216[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class15.field216[var12] >> 9;
                int var14 = (class15.field204[var12] >> 1) * var9 >> 23;
                int var15 = (class15.field204[var12] >> 1) * var10 >> 23;
                var1[var0.field636] = var15;
                var2[var0.field636] = var13;
                var3[var0.field636] = -var14;
                var0.field636++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field656] = 0;
                var5[var0.field656] = var17;
                var6[var0.field656] = var16;
                var0.field656++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field656] = var17;
                    var5[var0.field656] = var19;
                    var6[var0.field656] = var16;
                    var0.field656++;
                    var4[var0.field656] = var19;
                    var5[var0.field656] = var20;
                    var6[var0.field656] = var16;
                    var0.field656++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field656] = var16;
                var5[var0.field656] = var17;
                var6[var0.field656] = 1;
                var0.field656++;
            }
        }
        var0.field633 = var0.field636;
        var0.field658 = null;
        var0.field623 = null;
        var0.field647 = null;
        var0.field649 = null;
        var0.field618 = null;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(Lcn;)V", line = 521)
    private final void method1820(class266 arg0) {
        method1819();
        method1818();
        this.field4137 = new class262(this.field4141, this.field4141);
        class109.method811(field4149);
        this.field4137.method1714();
        class15.method121();
        class109.method812(0, 0, this.field4141, this.field4141, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field4140) {
                var2 = -arg0.field4143;
                var3 = -arg0.field4142;
                var4 = -arg0.field4153;
            } else {
                var2 = this.field4143 - arg0.field4143;
                var3 = this.field4142 - arg0.field4142;
                var4 = this.field4153 - arg0.field4153;
            }
        }
        if (this.field4155 != 0) {
            int var5 = class15.field204[this.field4155];
            int var6 = class15.field216[this.field4155];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field4139 != 0) {
            int var8 = this.field4139 - 1024 & 0x7FF;
            int var9 = class15.field204[var8];
            int var10 = class15.field216[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class343.method2372(field4150.field662, 0, field4150.field656, (short) class15.field207.method2085(this.field4160, (byte) -84));
        class66 var12 = field4150.method334(64, 512, -var2, -var3, -var4);
        int var13 = var12.method205() - var12.method173();
        int var14 = var12.method183() - var12.method76();
        if (var13 > var14) {
            int var15 = this.field4152 == 0 ? (var13 << 9) / this.field4141 : (var13 * 16 << 9) / (this.field4141 * 13);
            var12.method500(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field4152 == 0 ? (var14 << 9) / this.field4141 : (var14 * 16 << 9) / (this.field4141 * 13);
            var12.method500(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field4152 == 0) {
            for (int var17 = 0; var17 < class109.field1704.length; var17++) {
                if (class109.field1704[var17] != 0) {
                    class109.field1704[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1814();
            this.method1828();
        }
        class175.field2644.method1475(true);
        class109.method816(field4149);
        class15.method121();
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "()V", line = 629)
    private static final void method1821() {
        method1818();
        if (field4147 == -1 || field4138 != class198.field2966) {
            field4147 = class114.method848(class114.field1758, 128, 128, field4154);
            field4138 = class198.field2966;
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(Lcn;)V", line = 640)
    public final void method1822(class266 arg0) {
        if (this.field4145 == 0) {
            return;
        }
        boolean var2 = this.field4146 == -1 || class198.field2966 != this.field4157;
        if (!this.field4144 && !var2) {
            return;
        }
        if (var2) {
            this.field4157 = class198.field2966;
            this.field4146 = class114.method844(class114.field1752, this.field4141, this.field4141);
        } else {
            class94.method698(this.field4146);
            class114.method849(class114.field1752, this.field4141, this.field4141);
        }
        if (this.field4145 == 1) {
            this.method1816(arg0);
            this.field4144 = false;
        } else if (this.field4145 == 2) {
            this.field4144 = !this.method1827(arg0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIILcn;)V", line = 679)
    public final void method1823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class266 arg6) {
        int var8 = this.field4155 - arg4 & 0x7FF;
        int var9 = this.field4139 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field4151) / 2 + var10;
        int var13 = (arg2 - this.field4151) / 2 + var11;
        if (var12 < arg3 && this.field4151 + var12 > 0 && var13 < arg2 && this.field4151 + var13 > 0 && this.method1830(arg6)) {
            this.field4137.method624(arg0 + var13, arg1 + var12, this.field4151, this.field4151);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)Z", line = 704)
    public final boolean method1824(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4140) {
            this.field4148 = 1073741823;
            var8 = this.field4143;
            var9 = this.field4142;
            var10 = this.field4153;
        } else {
            int var5 = this.field4143 - arg0;
            int var6 = this.field4142 - arg1;
            int var7 = this.field4153 - arg2;
            this.field4148 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4148 == 0) {
                this.field4148 = 1;
            }
            var8 = (var5 << 8) / this.field4148;
            var9 = (var6 << 8) / this.field4148;
            var10 = (var7 << 8) / this.field4148;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4151 = this.field4159 * arg3 / (this.field4140 ? 1024 : this.field4148);
        } else {
            this.field4151 = 0;
        }
        if (this.field4151 < 8) {
            this.method1817();
            this.field4137 = null;
            return false;
        }
        int var12 = class324.method2201(this.field4151, -485);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4141 != var12) {
            this.field4141 = var12;
        }
        this.field4155 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field4139 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field4144 = true;
        this.field4137 = null;
        return true;
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "()V", line = 760)
    public static void method1825() {
        field4158 = null;
        field4156 = null;
        field4150 = null;
        field4154 = null;
        field4149 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIII)V", line = 768)
    public final void method1826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field4155 - arg4 & 0x7FF;
        int var8 = this.field4139 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field4151) / 2 + var9;
        int var12 = (arg2 - this.field4151) / 2 + var10;
        if (var11 >= arg3 || this.field4151 + var11 <= 0 || var12 >= arg2 || this.field4151 + var12 <= 0) {
            return;
        }
        if (this.field4145 == 0) {
            class15.field207.method2084((byte) 74, this.field4141, this.field4160);
        } else if (this.field4146 == -1) {
            return;
        } else {
            class94.method698(this.field4146);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field4151 + var14;
        int var16 = this.field4151 + var13;
        GL var17 = class94.field1473;
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

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(Lcn;)Z", line = 821)
    private final boolean method1827(class266 arg0) {
        class42 var2 = class42.method337(class45.field739, this.field4160, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class94.field1473;
        class167.method1199(field4149);
        class167.method1191();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field4140) {
                var4 = -arg0.field4143;
                var5 = -arg0.field4142;
                var6 = -arg0.field4153;
            } else {
                var4 = this.field4143 - arg0.field4143;
                var5 = this.field4142 - arg0.field4142;
                var6 = this.field4153 - arg0.field4153;
            }
        }
        var2.method360();
        class221 var7 = var2.method341(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method205() - var7.method173()) / 2;
        int var9 = (var7.method183() - var7.method76()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class151.method1046((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field4141, this.field4141);
        if (this.field4155 != 0) {
            int var11 = class15.field204[this.field4155];
            int var12 = class15.field216[this.field4155];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field4139 != 0) {
            int var14 = this.field4139 - 1024 & 0x7FF;
            int var15 = class15.field204[var14];
            int var16 = class15.field216[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class250.method1734((float) (-var4), (float) var5, (float) (-var6));
        class250.method1736(16777215, 0.5F, 0.5F, 0.5F);
        class250.method1738();
        class94.method683();
        class94.method696(true);
        class94.method668(true);
        var7.method199(0, 0, 0, 0, -var8 - var7.method173(), -var9 - var7.method76(), 0, -1L);
        class94.method668(false);
        class94.method696(false);
        class94.method674();
        class151.method1048();
        class94.method698(this.field4146);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field4141, this.field4141, 0);
        class167.method1201(field4149);
        return true;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1025)
    public class266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4143 = arg2;
        this.field4142 = arg3;
        this.field4153 = arg4;
        this.field4140 = arg7;
        this.field4160 = arg1;
        this.field4152 = arg6;
        this.field4159 = arg5;
        this.field4145 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "()V", line = 913)
    private final void method1828() {
        int var1 = this.field4141;
        int var2 = this.field4141;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class109.field1709 - var1;
        if (var2 > class109.field1705) {
            var2 -= var2 - class109.field1705;
        }
        if (class109.field1707 > 0) {
            int var9 = class109.field1707;
            var2 -= var9;
            var7 += class109.field1709 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class109.field1703) {
            int var10 = var1 - class109.field1703;
            var1 -= var10;
            var8 += var10;
        }
        if (class109.field1708 > 0) {
            int var11 = class109.field1708;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1812(class109.field1704, this.field4152, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "()V", line = 969)
    public static final void method1829() {
        if (field4147 != -1) {
            class198.method1404(field4147, 0, field4138);
        }
        field4147 = -1;
        field4138 = -1;
        field4158 = null;
        field4156 = null;
        field4150 = null;
        field4154 = null;
    }

    @OriginalMember(owner = "client!cn", name = "finalize", descriptor = "()V", line = 990)
    protected final void finalize() throws Throwable {
        this.method1817();
        super.finalize();
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(Lcn;)Z", line = 998)
    private final boolean method1830(class266 arg0) {
        if (this.field4137 == null) {
            if (this.field4145 == 0) {
                this.field4137 = class15.field207.method2087(-114, true, this.field4141, class15.field202, this.field4160);
            } else if (this.field4145 == 2) {
                this.method1815(arg0);
            } else if (this.field4145 == 1) {
                this.method1820(arg0);
            }
        }
        return this.field4137 != null;
    }

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "()V", line = 1040)
    private static final void method1831() {
        if (field4158 != null) {
            return;
        }
        class166 var0 = new class166(1088);
        class166 var1 = new class166(5140);
        if (class94.field1512) {
            var1.method1160(1, 0.0F);
            var1.method1160(1, 1.0F);
            var1.method1160(1, 0.0F);
            var1.method1160(1, 0.5F);
            var1.method1160(1, 1.0F);
            var1.method1160(1, 0.0F);
            var1.method1160(1, -1.0F);
            var1.method1160(1, 0.0F);
            var1.method1160(1, 0.5F);
            var1.method1160(1, 0.0F);
        } else {
            var1.method1144((byte) -110, 0.0F);
            var1.method1144((byte) -104, 1.0F);
            var1.method1144((byte) -106, 0.0F);
            var1.method1144((byte) -110, 0.5F);
            var1.method1144((byte) -104, 1.0F);
            var1.method1144((byte) -104, 0.0F);
            var1.method1144((byte) -101, -1.0F);
            var1.method1144((byte) -106, 0.0F);
            var1.method1144((byte) -111, 0.5F);
            var1.method1144((byte) -114, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class15.field204[var5] / 65535.0F;
            float var7 = (float) class15.field216[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class15.field216[var9] / 65535.0F;
                float var11 = (float) class15.field204[var9] * var6 / 65535.0F;
                float var12 = (float) class15.field204[var9] * var7 / 65535.0F;
                if (class94.field1512) {
                    var1.method1160(1, var12);
                    var1.method1160(1, var10);
                    var1.method1160(1, var11);
                    var1.method1160(1, var2);
                    var1.method1160(1, var3);
                } else {
                    var1.method1144((byte) -103, var12);
                    var1.method1144((byte) -127, var10);
                    var1.method1144((byte) -109, var11);
                    var1.method1144((byte) -118, var2);
                    var1.method1144((byte) -103, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class94.field1512) {
                    var0.method1150(0, -628562744);
                    var0.method1150(0, -628562744);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1150(var14++, -628562744);
                        var0.method1150(var13++, -628562744);
                    }
                    var0.method1150(1, -628562744);
                    var0.method1150(1, -628562744);
                } else {
                    var0.method1154(-25642, 0);
                    var0.method1154(-25642, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1154(-25642, var14++);
                        var0.method1154(-25642, var13++);
                    }
                    var0.method1154(-25642, 1);
                    var0.method1154(-25642, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field4158 = ByteBuffer.allocateDirect(var1.field2532);
        field4158.put(var1.field2500, 0, var1.field2532);
        field4158.flip();
        field4156 = ByteBuffer.allocateDirect(var0.field2532);
        field4156.put(var0.field2500, 0, var0.field2532);
        field4156.flip();
    }
}
