import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class71 {

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
    private boolean field1007 = true;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    private int field1006 = -1;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    private int field1016 = -1;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
    private boolean field998;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    private static int field1003 = -1;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[I")
    private static int[] field999 = new int[4];

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    private static int field1010 = -1;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Lgd;")
    private static class134 field1005;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lek;")
    private class220 field1009;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1000;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1002;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[B")
    private static byte[] field1011;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V", line = 7)
    private static final void method466() {
        if (field1005 != null) {
            return;
        }
        class134 var0 = field1005 = new class134(260, 480, 0);
        int[] var1 = var0.field2135;
        int[] var2 = var0.field2100;
        int[] var3 = var0.field2139;
        int[] var4 = var0.field2112;
        int[] var5 = var0.field2115;
        int[] var6 = var0.field2129;
        var0.field2131 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class170.field2801[var8] >> 1;
            int var10 = class170.field2810[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class170.field2810[var12] >> 9;
                int var14 = (class170.field2801[var12] >> 1) * var9 >> 23;
                int var15 = (class170.field2801[var12] >> 1) * var10 >> 23;
                var1[var0.field2131] = var15;
                var2[var0.field2131] = var13;
                var3[var0.field2131] = -var14;
                var0.field2131++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field2096] = 0;
                var5[var0.field2096] = var17;
                var6[var0.field2096] = var16;
                var0.field2096++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field2096] = var17;
                    var5[var0.field2096] = var19;
                    var6[var0.field2096] = var16;
                    var0.field2096++;
                    var4[var0.field2096] = var19;
                    var5[var0.field2096] = var20;
                    var6[var0.field2096] = var16;
                    var0.field2096++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field2096] = var16;
                var5[var0.field2096] = var17;
                var6[var0.field2096] = 1;
                var0.field2096++;
            }
        }
        var0.field2126 = var0.field2131;
        var0.field2114 = null;
        var0.field2137 = null;
        var0.field2107 = null;
        var0.field2143 = null;
        var0.field2116 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lkk;)V", line = 124)
    private final void method467(class71 arg0) {
        method466();
        method485();
        this.field1009 = new class293(this.field1014, this.field1014);
        class59.method404(field999);
        this.field1009.method1565();
        class170.method1250();
        class59.method382(0, 0, this.field1014, this.field1014, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field998) {
                var2 = -arg0.field1008;
                var3 = -arg0.field1012;
                var4 = -arg0.field1017;
            } else {
                var2 = this.field1008 - arg0.field1008;
                var3 = this.field1012 - arg0.field1012;
                var4 = this.field1017 - arg0.field1017;
            }
        }
        if (this.field1020 != 0) {
            int var5 = class170.field2801[this.field1020];
            int var6 = class170.field2810[this.field1020];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1013 != 0) {
            int var8 = this.field1013 - 1024 & 0x7FF;
            int var9 = class170.field2801[var8];
            int var10 = class170.field2810[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class9.method50(field1005.field2144, 0, field1005.field2096, (short) class170.field2814.method945(this.field1018, 255));
        class250 var12 = field1005.method1004(64, 512, -var2, -var3, -var4);
        int var13 = var12.method1180() - var12.method1187();
        int var14 = var12.method1198() - var12.method33();
        if (var13 > var14) {
            int var15 = this.field1015 == 0 ? (var13 << 9) / this.field1014 : (var13 * 16 << 9) / (this.field1014 * 13);
            var12.method1776(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1015 == 0 ? (var14 << 9) / this.field1014 : (var14 * 16 << 9) / (this.field1014 * 13);
            var12.method1776(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1015 == 0) {
            for (int var17 = 0; var17 < class59.field833.length; var17++) {
                if (class59.field833[var17] != 0) {
                    class59.field833[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method468();
            this.method471();
        }
        class8.field120.method2345((byte) -125);
        class59.method385(field999);
        class170.method1250();
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()V", line = 237)
    private final void method468() {
        int var1 = this.field1014 * 3 / 32;
        int var3 = this.field1014 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class59.field827 * var1 + var1;
        int var8 = class59.field827 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class59.field826) {
            var4 = var3 - (var1 + var3 - class59.field826);
        }
        if (var1 < class59.field832) {
            int var11 = class59.field832 - var1;
            var4 -= var11;
            var7 += class59.field827 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class59.field830) {
            int var12 = var1 + var3 - class59.field830;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class59.field834) {
            int var13 = class59.field834 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method469(class59.field833, 0, this.field1015, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 290)
    private final void method469(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1011[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()V", line = 330)
    public static void method470() {
        field1000 = null;
        field1002 = null;
        field1005 = null;
        field1011 = null;
        field999 = null;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "()V", line = 339)
    private final void method471() {
        int var1 = this.field1014;
        int var2 = this.field1014;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class59.field827 - var1;
        if (var2 > class59.field826) {
            var2 -= var2 - class59.field826;
        }
        if (class59.field832 > 0) {
            int var9 = class59.field832;
            var2 -= var9;
            var7 += class59.field827 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class59.field830) {
            int var10 = var1 - class59.field830;
            var1 -= var10;
            var8 += var10;
        }
        if (class59.field834 > 0) {
            int var11 = class59.field834;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method481(class59.field833, this.field1015, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lkk;)V", line = 388)
    private final void method472(class71 arg0) {
        method473();
        method477();
        GL var2 = class232.field3716;
        class75.method513(field999);
        class75.method508();
        var2.glClearColor((float) ((this.field1015 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field1015 & 0xFF00) >> 8) / 255.0F, (float) (this.field1015 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field998) {
                var3 = -arg0.field1008;
                var4 = -arg0.field1012;
                var5 = -arg0.field1017;
            } else {
                var3 = this.field1008 - arg0.field1008;
                var4 = this.field1012 - arg0.field1012;
                var5 = this.field1017 - arg0.field1017;
            }
        }
        class299.method2126(-1.0F, 1.0F, -1.0F, 1.0F, this.field1014, this.field1014);
        if (this.field1020 != 0) {
            int var6 = class170.field2801[this.field1020];
            int var7 = class170.field2810[this.field1020];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1013 != 0) {
            int var9 = this.field1013 - 1024 & 0x7FF;
            int var10 = class170.field2801[var9];
            int var11 = class170.field2810[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class87.method594((float) (-var3), (float) (-var4), (float) var5);
        class87.method598(16777215, 0.5F, 0.5F, 1.0F);
        class87.method591();
        if (this.field1015 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class170.field2814.method950(this.field1018, 255, this.field1014);
        class232.method1660(true);
        if (class232.field3700) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field1000.position(0));
        var2.glVertexPointer(2, 5126, 20, field1000.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field1000.position(12));
        var2.glDrawElements(5, field1002.limit() / 2, 5123, field1002.position(0));
        var2.glEnableClientState(32886);
        class232.method1660(false);
        if (this.field1015 != 0) {
            class179.method1343(0, 0, -3);
            class232.method1677(1);
            class232.method1664(0);
            class232.method1662(field1003);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field1015 >> 16), (byte) (this.field1015 >> 8), (byte) this.field1015, (byte) 127);
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
            var2.glColor4ub((byte) (this.field1015 >> 16), (byte) (this.field1015 >> 8), (byte) this.field1015, (byte) -1);
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
        class299.method2135();
        class232.method1662(this.field1006);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field1014, this.field1014, 0);
        class75.method511(field999);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "()V", line = 516)
    private static final void method473() {
        if (field1000 != null) {
            return;
        }
        class44 var0 = new class44(1088);
        class44 var1 = new class44(5140);
        if (class232.field3718) {
            var1.method230(-126, 0.0F);
            var1.method230(-120, 1.0F);
            var1.method230(-126, 0.0F);
            var1.method230(-124, 0.5F);
            var1.method230(-123, 1.0F);
            var1.method230(-124, 0.0F);
            var1.method230(-128, -1.0F);
            var1.method230(-123, 0.0F);
            var1.method230(-124, 0.5F);
            var1.method230(-123, 0.0F);
        } else {
            var1.method252(7284, 0.0F);
            var1.method252(7284, 1.0F);
            var1.method252(7284, 0.0F);
            var1.method252(7284, 0.5F);
            var1.method252(7284, 1.0F);
            var1.method252(7284, 0.0F);
            var1.method252(7284, -1.0F);
            var1.method252(7284, 0.0F);
            var1.method252(7284, 0.5F);
            var1.method252(7284, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class170.field2801[var5] / 65535.0F;
            float var7 = (float) class170.field2810[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class170.field2810[var9] / 65535.0F;
                float var11 = (float) class170.field2801[var9] * var6 / 65535.0F;
                float var12 = (float) class170.field2801[var9] * var7 / 65535.0F;
                if (class232.field3718) {
                    var1.method230(-127, var12);
                    var1.method230(-125, var10);
                    var1.method230(-127, var11);
                    var1.method230(-124, var2);
                    var1.method230(-124, var3);
                } else {
                    var1.method252(7284, var12);
                    var1.method252(7284, var10);
                    var1.method252(7284, var11);
                    var1.method252(7284, var2);
                    var1.method252(7284, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class232.field3718) {
                    var0.method287(0, 0);
                    var0.method287(0, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method287(0, var14++);
                        var0.method287(0, var13++);
                    }
                    var0.method287(0, 1);
                    var0.method287(0, 1);
                } else {
                    var0.method278(true, 0);
                    var0.method278(true, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method278(true, var14++);
                        var0.method278(true, var13++);
                    }
                    var0.method278(true, 1);
                    var0.method278(true, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field1000 = ByteBuffer.allocateDirect(var1.field586);
        field1000.put(var1.field573, 0, var1.field586);
        field1000.flip();
        field1002 = ByteBuffer.allocateDirect(var0.field586);
        field1002.put(var0.field573, 0, var0.field586);
        field1002.flip();
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Lkk;)Z", line = 667)
    private final boolean method474(class71 arg0) {
        if (this.field1009 == null) {
            if (this.field1004 == 0) {
                this.field1009 = class170.field2814.method958(-128, class170.field2815, this.field1018, true, this.field1014);
            } else if (this.field1004 == 2) {
                this.method479(arg0);
            } else if (this.field1004 == 1) {
                this.method467(arg0);
            }
        }
        return this.field1009 != null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIILkk;)V", line = 696)
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class71 arg6) {
        int var8 = this.field1020 - arg4 & 0x7FF;
        int var9 = this.field1013 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1001) / 2 + var10;
        int var13 = (arg2 - this.field1001) / 2 + var11;
        if (var12 < arg3 && this.field1001 + var12 > 0 && var13 < arg2 && this.field1001 + var13 > 0 && this.method474(arg6)) {
            this.field1009.method376(arg0 + var13, arg1 + var12, this.field1001, this.field1001);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)Z", line = 722)
    public final boolean method476(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field998) {
            this.field1021 = 1073741823;
            var8 = this.field1008;
            var9 = this.field1012;
            var10 = this.field1017;
        } else {
            int var5 = this.field1008 - arg0;
            int var6 = this.field1012 - arg1;
            int var7 = this.field1017 - arg2;
            this.field1021 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1021 == 0) {
                this.field1021 = 1;
            }
            var8 = (var5 << 8) / this.field1021;
            var9 = (var6 << 8) / this.field1021;
            var10 = (var7 << 8) / this.field1021;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1001 = this.field1019 * arg3 / (this.field998 ? 1024 : this.field1021);
        } else {
            this.field1001 = 0;
        }
        if (this.field1001 < 8) {
            this.method484();
            this.field1009 = null;
            return false;
        }
        int var12 = class119.method837(372938402, this.field1001);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1014 != var12) {
            this.field1014 = var12;
        }
        this.field1020 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1013 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1007 = true;
        this.field1009 = null;
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "()V", line = 779)
    private static final void method477() {
        method485();
        if (field1003 == -1 || field1010 != class230.field3658) {
            field1003 = class249.method1769(class249.field3911, 128, 128, field1011);
            field1010 = class230.field3658;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIII)V", line = 790)
    public final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1020 - arg4 & 0x7FF;
        int var8 = this.field1013 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field1001) / 2 + var9;
        int var12 = (arg2 - this.field1001) / 2 + var10;
        if (var11 >= arg3 || this.field1001 + var11 <= 0 || var12 >= arg2 || this.field1001 + var12 <= 0) {
            return;
        }
        if (this.field1004 == 0) {
            class170.field2814.method950(this.field1018, 255, this.field1014);
        } else if (this.field1006 == -1) {
            return;
        } else {
            class232.method1662(this.field1006);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field1001 + var14;
        int var16 = this.field1001 + var13;
        GL var17 = class232.field3716;
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

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1008 = arg2;
        this.field1012 = arg3;
        this.field1017 = arg4;
        this.field998 = arg7;
        this.field1018 = arg1;
        this.field1015 = arg6;
        this.field1019 = arg5;
        this.field1004 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(Lkk;)V", line = 846)
    private final void method479(class71 arg0) {
        class134 var2 = class134.method997(class266.field4300, this.field1018, 0);
        if (var2 == null) {
            return;
        }
        this.field1009 = new class220(this.field1014, this.field1014);
        class59.method404(field999);
        this.field1009.method1565();
        class170.method1250();
        class59.method382(0, 0, this.field1014, this.field1014, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field998) {
                var3 = -arg0.field1008;
                var4 = -arg0.field1012;
                var5 = -arg0.field1017;
            } else {
                var3 = this.field1008 - arg0.field1008;
                var4 = this.field1012 - arg0.field1012;
                var5 = this.field1017 - arg0.field1017;
            }
        }
        if (this.field1020 != 0) {
            int var6 = class170.field2801[this.field1020];
            int var7 = class170.field2810[this.field1020];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1013 != 0) {
            int var9 = this.field1013 - 1024 & 0x7FF;
            int var10 = class170.field2801[var9];
            int var11 = class170.field2810[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class250 var13 = var2.method1004(64, 768, -var3, -var4, -var5);
        int var14 = var13.method1180() - var13.method1187();
        int var15 = var13.method1198() - var13.method33();
        int var16 = var13.method1187() + var14 / 2;
        int var17 = var13.method33() + var15 / 2;
        if (var14 > var15) {
            var13.method1776(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1014);
        } else {
            var13.method1776(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1014);
        }
        class8.field120.method2345((byte) -119);
        class59.method385(field999);
        class170.method1250();
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(Lkk;)V", line = 929)
    public final void method480(class71 arg0) {
        if (this.field1004 == 0) {
            return;
        }
        boolean var2 = this.field1006 == -1 || class230.field3658 != this.field1016;
        if (!this.field1007 && !var2) {
            return;
        }
        if (var2) {
            this.field1016 = class230.field3658;
            this.field1006 = class249.method1767(class249.field3905, this.field1014, this.field1014);
        } else {
            class232.method1662(this.field1006);
            class249.method1772(class249.field3905, this.field1014, this.field1014);
        }
        if (this.field1004 == 1) {
            this.method472(arg0);
            this.field1007 = false;
        } else if (this.field1004 == 2) {
            this.field1007 = !this.method483(arg0);
        }
    }

    @OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V", line = 970)
    protected final void finalize() throws Throwable {
        this.method484();
        super.finalize();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIIIIIIIIII)V", line = 979)
    private final void method481(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1011[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "()V", line = 1013)
    public static final void method482() {
        if (field1003 != -1) {
            class230.method1630(field1003, 0, field1010);
        }
        field1003 = -1;
        field1010 = -1;
        field1000 = null;
        field1002 = null;
        field1005 = null;
        field1011 = null;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(Lkk;)Z", line = 1026)
    private final boolean method483(class71 arg0) {
        class134 var2 = class134.method997(class266.field4300, this.field1018, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class232.field3716;
        class75.method513(field999);
        class75.method508();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field998) {
                var4 = -arg0.field1008;
                var5 = -arg0.field1012;
                var6 = -arg0.field1017;
            } else {
                var4 = this.field1008 - arg0.field1008;
                var5 = this.field1012 - arg0.field1012;
                var6 = this.field1017 - arg0.field1017;
            }
        }
        var2.method998();
        class262 var7 = var2.method988(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method1180() - var7.method1187()) / 2;
        int var9 = (var7.method1198() - var7.method33()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class299.method2131((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field1014, this.field1014);
        if (this.field1020 != 0) {
            int var11 = class170.field2801[this.field1020];
            int var12 = class170.field2810[this.field1020];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field1013 != 0) {
            int var14 = this.field1013 - 1024 & 0x7FF;
            int var15 = class170.field2801[var14];
            int var16 = class170.field2810[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class87.method594((float) (-var4), (float) var5, (float) (-var6));
        class87.method598(16777215, 0.5F, 0.5F, 0.5F);
        class87.method591();
        class232.method1681();
        class232.method1674(true);
        class232.method1660(true);
        var7.method1171(0, 0, 0, 0, -var8 - var7.method1187(), -var9 - var7.method33(), 0, -1L);
        class232.method1660(false);
        class232.method1674(false);
        class232.method1673();
        class299.method2135();
        class232.method1662(this.field1006);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field1014, this.field1014, 0);
        class75.method511(field999);
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "()V", line = 1121)
    private final void method484() {
        if (this.field1006 != -1) {
            class230.method1630(this.field1006, 0, this.field1016);
        }
        this.field1007 = true;
        this.field1006 = -1;
    }

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "()V", line = 1128)
    private static final void method485() {
        if (field1011 != null) {
            return;
        }
        field1011 = new byte[16384];
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
                field1011[var4 + var6] = field1011[var4 + var9] = field1011[var5 + var6] = field1011[var5 + var9] = (byte) var11;
            }
        }
    }
}
