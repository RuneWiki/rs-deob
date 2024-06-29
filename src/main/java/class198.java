import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class198 {

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    private int field2870 = -1;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    private int field2879 = -1;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Z")
    private boolean field2883 = true;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    private int field2884;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Z")
    private boolean field2873;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    private int field2868;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field2875;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
    private static int[] field2886 = new int[4];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private static int field2869 = -1;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private static int field2874 = -1;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    private int field2872;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    private int field2877;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lln;")
    private class118 field2866;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Ltk;")
    private static class46 field2880;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2871;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2882;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[B")
    private static byte[] field2881;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V", line = 13)
    public static void method1421() {
        field2871 = null;
        field2882 = null;
        field2880 = null;
        field2881 = null;
        field2886 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V", line = 21)
    private static final void method1422() {
        if (field2871 != null) {
            return;
        }
        class190 var0 = new class190(1088);
        class190 var1 = new class190(5140);
        if (class141.field2056) {
            var1.method1328((byte) 114, 0.0F);
            var1.method1328((byte) 111, 1.0F);
            var1.method1328((byte) 96, 0.0F);
            var1.method1328((byte) 78, 0.5F);
            var1.method1328((byte) 72, 1.0F);
            var1.method1328((byte) 91, 0.0F);
            var1.method1328((byte) 57, -1.0F);
            var1.method1328((byte) 75, 0.0F);
            var1.method1328((byte) 70, 0.5F);
            var1.method1328((byte) 84, 0.0F);
        } else {
            var1.method1318(0.0F, (byte) -39);
            var1.method1318(1.0F, (byte) -39);
            var1.method1318(0.0F, (byte) -39);
            var1.method1318(0.5F, (byte) -39);
            var1.method1318(1.0F, (byte) -39);
            var1.method1318(0.0F, (byte) -39);
            var1.method1318(-1.0F, (byte) -39);
            var1.method1318(0.0F, (byte) -39);
            var1.method1318(0.5F, (byte) -39);
            var1.method1318(0.0F, (byte) -39);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class345.field5339[var5] / 65535.0F;
            float var7 = (float) class345.field5343[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class345.field5343[var9] / 65535.0F;
                float var11 = (float) class345.field5339[var9] * var6 / 65535.0F;
                float var12 = (float) class345.field5339[var9] * var7 / 65535.0F;
                if (class141.field2056) {
                    var1.method1328((byte) 85, var12);
                    var1.method1328((byte) 90, var10);
                    var1.method1328((byte) 76, var11);
                    var1.method1328((byte) 118, var2);
                    var1.method1328((byte) 112, var3);
                } else {
                    var1.method1318(var12, (byte) -39);
                    var1.method1318(var10, (byte) -39);
                    var1.method1318(var11, (byte) -39);
                    var1.method1318(var2, (byte) -39);
                    var1.method1318(var3, (byte) -39);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class141.field2056) {
                    var0.method1361(0, (byte) 125);
                    var0.method1361(0, (byte) 125);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1361(var14++, (byte) 127);
                        var0.method1361(var13++, (byte) 127);
                    }
                    var0.method1361(1, (byte) 123);
                    var0.method1361(1, (byte) 124);
                } else {
                    var0.method1313(0, (byte) 13);
                    var0.method1313(0, (byte) 13);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1313(var14++, (byte) 13);
                        var0.method1313(var13++, (byte) 13);
                    }
                    var0.method1313(1, (byte) 13);
                    var0.method1313(1, (byte) 13);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field2871 = ByteBuffer.allocateDirect(var1.field2776);
        field2871.put(var1.field2718, 0, var1.field2776);
        field2871.flip();
        field2882 = ByteBuffer.allocateDirect(var0.field2776);
        field2882.put(var0.field2718, 0, var0.field2776);
        field2882.flip();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)Z", line = 174)
    public final boolean method1423(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2873) {
            this.field2878 = 1073741823;
            var8 = this.field2876;
            var9 = this.field2884;
            var10 = this.field2885;
        } else {
            int var5 = this.field2876 - arg0;
            int var6 = this.field2884 - arg1;
            int var7 = this.field2885 - arg2;
            this.field2878 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2878 == 0) {
                this.field2878 = 1;
            }
            var8 = (var5 << 8) / this.field2878;
            var9 = (var6 << 8) / this.field2878;
            var10 = (var7 << 8) / this.field2878;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2888 = this.field2875 * arg3 / (this.field2873 ? 1024 : this.field2878);
        } else {
            this.field2888 = 0;
        }
        if (this.field2888 < 8) {
            this.method1436();
            this.field2866 = null;
            return false;
        }
        int var12 = class98.method771((byte) 96, this.field2888);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2877 != var12) {
            this.field2877 = var12;
        }
        this.field2867 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field2872 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field2883 = true;
        this.field2866 = null;
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIILmb;)V", line = 231)
    public final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class198 arg6) {
        int var8 = this.field2867 - arg4 & 0x7FF;
        int var9 = this.field2872 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field2888) / 2 + var10;
        int var13 = (arg2 - this.field2888) / 2 + var11;
        if (var12 < arg3 && this.field2888 + var12 > 0 && var13 < arg2 && this.field2888 + var13 > 0 && this.method1425(arg6)) {
            this.field2866.method651(arg0 + var13, arg1 + var12, this.field2888, this.field2888);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lmb;)Z", line = 255)
    private final boolean method1425(class198 arg0) {
        if (this.field2866 == null) {
            if (this.field2887 == 0) {
                this.field2866 = class345.field5336.method579(true, class345.field5338, this.field2865, this.field2877, false);
            } else if (this.field2887 == 2) {
                this.method1427(arg0);
            } else if (this.field2887 == 1) {
                this.method1432(arg0);
            }
        }
        return this.field2866 != null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lmb;)V", line = 284)
    private final void method1426(class198 arg0) {
        method1422();
        method1435();
        GL var2 = class141.field2025;
        class205.method1492(field2886);
        class205.method1489();
        var2.glClearColor((float) ((this.field2868 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field2868 & 0xFF00) >> 8) / 255.0F, (float) (this.field2868 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2873) {
                var3 = -arg0.field2876;
                var4 = -arg0.field2884;
                var5 = -arg0.field2885;
            } else {
                var3 = this.field2876 - arg0.field2876;
                var4 = this.field2884 - arg0.field2884;
                var5 = this.field2885 - arg0.field2885;
            }
        }
        class63.method514(-1.0F, 1.0F, -1.0F, 1.0F, this.field2877, this.field2877);
        if (this.field2867 != 0) {
            int var6 = class345.field5339[this.field2867];
            int var7 = class345.field5343[this.field2867];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2872 != 0) {
            int var9 = this.field2872 - 1024 & 0x7FF;
            int var10 = class345.field5339[var9];
            int var11 = class345.field5343[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class222.method1625((float) (-var3), (float) (-var4), (float) var5);
        class222.method1630(16777215, 0.5F, 0.5F, 1.0F);
        class222.method1623();
        if (this.field2868 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class345.field5336.method582(this.field2865, -108, this.field2877);
        class141.method1021(true);
        if (class141.field2032) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field2871.position(0));
        var2.glVertexPointer(2, 5126, 20, field2871.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field2871.position(12));
        var2.glDrawElements(5, field2882.limit() / 2, 5123, field2882.position(0));
        var2.glEnableClientState(32886);
        class141.method1021(false);
        if (this.field2868 != 0) {
            class2.method9(0, 10691, 0);
            class141.method986(1);
            class141.method1013(0);
            class141.method1000(field2874);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field2868 >> 16), (byte) (this.field2868 >> 8), (byte) this.field2868, (byte) 127);
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
            var2.glColor4ub((byte) (this.field2868 >> 16), (byte) (this.field2868 >> 8), (byte) this.field2868, (byte) -1);
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
        class63.method517();
        class141.method1000(this.field2879);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field2877, this.field2877, 0);
        class205.method1490(field2886);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Lmb;)V", line = 411)
    private final void method1427(class198 arg0) {
        class46 var2 = class46.method377(class82.field1174, this.field2865, 0);
        if (var2 == null) {
            return;
        }
        this.field2866 = new class118(this.field2877, this.field2877);
        class44.method335(field2886);
        this.field2866.method880();
        class345.method2423();
        class44.method317(0, 0, this.field2877, this.field2877, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2873) {
                var3 = -arg0.field2876;
                var4 = -arg0.field2884;
                var5 = -arg0.field2885;
            } else {
                var3 = this.field2876 - arg0.field2876;
                var4 = this.field2884 - arg0.field2884;
                var5 = this.field2885 - arg0.field2885;
            }
        }
        if (this.field2867 != 0) {
            int var6 = class345.field5339[this.field2867];
            int var7 = class345.field5343[this.field2867];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2872 != 0) {
            int var9 = this.field2872 - 1024 & 0x7FF;
            int var10 = class345.field5339[var9];
            int var11 = class345.field5343[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class317 var13 = var2.method384(64, 768, -var3, -var4, -var5);
        int var14 = var13.method1074() - var13.method1067();
        int var15 = var13.method1078() - var13.method371();
        int var16 = var13.method1067() + var14 / 2;
        int var17 = var13.method371() + var15 / 2;
        if (var14 > var15) {
            var13.method2219(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field2877);
        } else {
            var13.method2219(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field2877);
        }
        class356.field5460.method973(-27272);
        class44.method331(field2886);
        class345.method2423();
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V", line = 495)
    private final void method1428() {
        int var1 = this.field2877;
        int var2 = this.field2877;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class44.field623 - var1;
        if (var2 > class44.field621) {
            var2 -= var2 - class44.field621;
        }
        if (class44.field616 > 0) {
            int var9 = class44.field616;
            var2 -= var9;
            var7 += class44.field623 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class44.field617) {
            int var10 = var1 - class44.field617;
            var1 -= var10;
            var8 += var10;
        }
        if (class44.field622 > 0) {
            int var11 = class44.field622;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1437(class44.field624, this.field2868, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 545)
    private final void method1429(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field2881[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()V", line = 585)
    private final void method1430() {
        int var1 = this.field2877 * 3 / 32;
        int var3 = this.field2877 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class44.field623 * var1 + var1;
        int var8 = class44.field623 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class44.field621) {
            var4 = var3 - (var1 + var3 - class44.field621);
        }
        if (var1 < class44.field616) {
            int var11 = class44.field616 - var1;
            var4 -= var11;
            var7 += class44.field623 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class44.field617) {
            int var12 = var1 + var3 - class44.field617;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class44.field622) {
            int var13 = class44.field622 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1429(class44.field624, 0, this.field2868, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()V", line = 640)
    private static final void method1431() {
        if (field2880 != null) {
            return;
        }
        class46 var0 = field2880 = new class46(260, 480, 0);
        int[] var1 = var0.field693;
        int[] var2 = var0.field703;
        int[] var3 = var0.field650;
        int[] var4 = var0.field671;
        int[] var5 = var0.field687;
        int[] var6 = var0.field681;
        var0.field656 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class345.field5339[var8] >> 1;
            int var10 = class345.field5343[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class345.field5343[var12] >> 9;
                int var14 = (class345.field5339[var12] >> 1) * var9 >> 23;
                int var15 = (class345.field5339[var12] >> 1) * var10 >> 23;
                var1[var0.field656] = var15;
                var2[var0.field656] = var13;
                var3[var0.field656] = -var14;
                var0.field656++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field672] = 0;
                var5[var0.field672] = var17;
                var6[var0.field672] = var16;
                var0.field672++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field672] = var17;
                    var5[var0.field672] = var19;
                    var6[var0.field672] = var16;
                    var0.field672++;
                    var4[var0.field672] = var19;
                    var5[var0.field672] = var20;
                    var6[var0.field672] = var16;
                    var0.field672++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field672] = var16;
                var5[var0.field672] = var17;
                var6[var0.field672] = 1;
                var0.field672++;
            }
        }
        var0.field674 = var0.field656;
        var0.field677 = null;
        var0.field663 = null;
        var0.field697 = null;
        var0.field699 = null;
        var0.field655 = null;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(Lmb;)V", line = 753)
    private final void method1432(class198 arg0) {
        method1431();
        method1434();
        this.field2866 = new class79(this.field2877, this.field2877);
        class44.method335(field2886);
        this.field2866.method880();
        class345.method2423();
        class44.method317(0, 0, this.field2877, this.field2877, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field2873) {
                var2 = -arg0.field2876;
                var3 = -arg0.field2884;
                var4 = -arg0.field2885;
            } else {
                var2 = this.field2876 - arg0.field2876;
                var3 = this.field2884 - arg0.field2884;
                var4 = this.field2885 - arg0.field2885;
            }
        }
        if (this.field2867 != 0) {
            int var5 = class345.field5339[this.field2867];
            int var6 = class345.field5343[this.field2867];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field2872 != 0) {
            int var8 = this.field2872 - 1024 & 0x7FF;
            int var9 = class345.field5339[var8];
            int var10 = class345.field5343[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class84.method683(field2880.field670, 0, field2880.field672, (short) class345.field5336.method591(this.field2865, -128));
        class317 var12 = field2880.method384(64, 512, -var2, -var3, -var4);
        int var13 = var12.method1074() - var12.method1067();
        int var14 = var12.method1078() - var12.method371();
        if (var13 > var14) {
            int var15 = this.field2868 == 0 ? (var13 << 9) / this.field2877 : (var13 * 16 << 9) / (this.field2877 * 13);
            var12.method2219(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field2868 == 0 ? (var14 << 9) / this.field2877 : (var14 * 16 << 9) / (this.field2877 * 13);
            var12.method2219(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field2868 == 0) {
            for (int var17 = 0; var17 < class44.field624.length; var17++) {
                if (class44.field624[var17] != 0) {
                    class44.field624[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1430();
            this.method1428();
        }
        class356.field5460.method973(-27272);
        class44.method331(field2886);
        class345.method2423();
    }

    @OriginalMember(owner = "client!mb", name = "finalize", descriptor = "()V", line = 859)
    protected final void finalize() throws Throwable {
        this.method1436();
        super.finalize();
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2876 = arg2;
        this.field2884 = arg3;
        this.field2885 = arg4;
        this.field2873 = arg7;
        this.field2865 = arg1;
        this.field2868 = arg6;
        this.field2875 = arg5;
        this.field2887 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V", line = 869)
    public final void method1433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field2867 - arg4 & 0x7FF;
        int var8 = this.field2872 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field2888) / 2 + var9;
        int var12 = (arg2 - this.field2888) / 2 + var10;
        if (var11 >= arg3 || this.field2888 + var11 <= 0 || var12 >= arg2 || this.field2888 + var12 <= 0) {
            return;
        }
        if (this.field2887 == 0) {
            class345.field5336.method582(this.field2865, -82, this.field2877);
        } else if (this.field2879 == -1) {
            return;
        } else {
            class141.method1000(this.field2879);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field2888 + var14;
        int var16 = this.field2888 + var13;
        GL var17 = class141.field2025;
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

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()V", line = 918)
    private static final void method1434() {
        if (field2881 != null) {
            return;
        }
        field2881 = new byte[16384];
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
                field2881[var4 + var6] = field2881[var4 + var9] = field2881[var5 + var6] = field2881[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()V", line = 977)
    private static final void method1435() {
        method1434();
        if (field2874 == -1 || class305.field4573 != field2869) {
            field2874 = class254.method1861(class254.field3796, 128, 128, field2881);
            field2869 = class305.field4573;
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "()V", line = 991)
    private final void method1436() {
        if (this.field2879 != -1) {
            class305.method2145(this.field2879, 0, this.field2870);
        }
        this.field2883 = true;
        this.field2879 = -1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIIIIIIIII)V", line = 1006)
    private final void method1437(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field2881[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "()V", line = 1039)
    public static final void method1438() {
        if (field2874 != -1) {
            class305.method2145(field2874, 0, field2869);
        }
        field2874 = -1;
        field2869 = -1;
        field2871 = null;
        field2882 = null;
        field2880 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(Lmb;)Z", line = 1051)
    private final boolean method1439(class198 arg0) {
        class46 var2 = class46.method377(class82.field1174, this.field2865, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class141.field2025;
        class205.method1492(field2886);
        class205.method1489();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field2873) {
                var4 = -arg0.field2876;
                var5 = -arg0.field2884;
                var6 = -arg0.field2885;
            } else {
                var4 = this.field2876 - arg0.field2876;
                var5 = this.field2884 - arg0.field2884;
                var6 = this.field2885 - arg0.field2885;
            }
        }
        var2.method401();
        class151 var7 = var2.method393(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method1074() - var7.method1067()) / 2;
        int var9 = (var7.method1078() - var7.method371()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class63.method511((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field2877, this.field2877);
        if (this.field2867 != 0) {
            int var11 = class345.field5339[this.field2867];
            int var12 = class345.field5343[this.field2867];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field2872 != 0) {
            int var14 = this.field2872 - 1024 & 0x7FF;
            int var15 = class345.field5339[var14];
            int var16 = class345.field5343[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class222.method1625((float) (-var4), (float) var5, (float) (-var6));
        class222.method1630(16777215, 0.5F, 0.5F, 0.5F);
        class222.method1623();
        class141.method1023();
        class141.method982(true);
        class141.method1021(true);
        var7.method1085(0, 0, 0, 0, -var8 - var7.method1067(), -var9 - var7.method371(), 0, -1L);
        class141.method1021(false);
        class141.method982(false);
        class141.method1020();
        class63.method517();
        class141.method1000(this.field2879);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field2877, this.field2877, 0);
        class205.method1490(field2886);
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(Lmb;)V", line = 1138)
    public final void method1440(class198 arg0) {
        if (this.field2887 == 0) {
            return;
        }
        boolean var2 = this.field2879 == -1 || class305.field4573 != this.field2870;
        if (!this.field2883 && !var2) {
            return;
        }
        if (var2) {
            this.field2870 = class305.field4573;
            this.field2879 = class254.method1863(class254.field3790, this.field2877, this.field2877);
        } else {
            class141.method1000(this.field2879);
            class254.method1868(class254.field3790, this.field2877, this.field2877);
        }
        if (this.field2887 == 1) {
            this.method1426(arg0);
            this.field2883 = false;
        } else if (this.field2887 == 2) {
            this.field2883 = !this.method1439(arg0);
        }
    }
}
