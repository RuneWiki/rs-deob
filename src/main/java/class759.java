import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class759 {

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    private int field10406 = 0;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    private int field10403 = 1;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    private int field10418 = 0;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    private int field10420 = 1;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lqw;")
    private class84 field10400 = new class84();

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Z")
    private boolean field10424 = true;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "Z")
    private boolean field10423 = true;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "Z")
    private boolean field10426 = true;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    private int field10428 = -1;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "Z")
    private boolean field10422 = false;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
    private int field10431 = 0;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "Z")
    private boolean field10434 = true;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "[Lrba;")
    private class456[] field10433 = new class456[2];

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Llf;")
    private class250 field10410;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Lgea;")
    private class82 field10419;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Lgea;")
    private class82 field10407;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Lgea;")
    private class82 field10401;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "[I")
    public static int[] field10405 = new int[4];

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "[F")
    public static float[] field10408 = new float[4];

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field10421;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field10425;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Ld;")
    public static class161 field10404;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Ldf;")
    private class420 field10429;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "Ldf;")
    private class420 field10432;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "Lrba;")
    private class456 field10430;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "Z")
    private boolean field10414;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIILha;Lofa;)V", line = 6)
    public static final void method4167(int arg0, int arg1, int arg2, class66 arg3, class347 arg4) {
        field10417++;
        if (arg2 != -5915) {
            method4176(-89, null);
        }
        class512 var5 = arg4.method2214((byte) 67, arg3);
        if (var5 == null) {
            return;
        }
        arg3.method453(arg1, arg0, arg4.field4986 + arg1, arg4.field4940 + arg0);
        if (class8.field70 == 2 || class8.field70 == 5 || class103.field1472 == null) {
            arg3.method449(-16777216, var5, arg1, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class697.field9252 == 4) {
            var6 = class46.field479;
            var7 = class265.field3902;
            var8 = 4096;
            var9 = (int) (-class514.field7144) & 0x3FFF;
        } else {
            var7 = class625.field8475.field2810;
            var9 = (int) (-class514.field7144) + class551.field7614 & 0x3FFF;
            var6 = class625.field8475.field2802;
            var8 = 4096 - (class767.field10544 * 16);
        }
        int var10 = (var6 / 128) + 48 - ((class102.field1467 - 104) * 2);
        int var11 = (class393.field5663 * 4) + 48 - (var7 / 128) - (class393.field5663 + -104) * 2;
        class103.field1472.method974((float) arg4.field4986 / 2.0F + (float) arg1, (float) arg4.field4940 / 2.0F + (float) arg0, (float) var10, (float) var11, var8, var9 << 2, var5, arg1, arg0);
        for (class445 var12 = (class445) class655.field8839.method679((byte) -86); var12 != null; var12 = (class445) class655.field8839.method681(-81)) {
            int var58 = var12.field6408;
            int var59 = ((class498.field6992.field4677[var58] & 0xFFFEB27) >> 14) - class120.field1625;
            int var60 = (class498.field6992.field4677[var58] & 0x3FFF) - class259.field3849;
            int var61 = var59 * 4 + 2 - (var6 / 128);
            int var62 = var60 * 4 + 2 - var7 / 128;
            class304.method1969(arg4, var61, arg3, (byte) -127, arg0, var62, arg1, var5, class498.field6992.field4679[var58]);
        }
        for (int var13 = 0; var13 < class684.field9142; var13++) {
            int var55 = class781.field10717[var13] * 4 + 2 - (var6 / 128);
            int var56 = class322.field4567[var13] * 4 + 2 - (var7 / 128);
            class412 var57 = class210.field2705.method1362(0, class383.field5567[var13]);
            if (var57.field5919 != null) {
                var57 = var57.method2478(class480.field6740, -1);
                if (var57 == null || var57.field5881 == -1) {
                    continue;
                }
            }
            class304.method1969(arg4, var55, arg3, (byte) 69, arg0, var56, arg1, var5, var57.field5881);
        }
        for (class769 var14 = (class769) class523.field7265.method1249((byte) -96); var14 != null; var14 = (class769) class523.field7265.method1246(true)) {
            int var50 = (int) (var14.field2146 >> 28 & 0x3L);
            if (class514.field7151 == var50) {
                int var51 = (int) (var14.field2146 & 0x3FFFL) - class120.field1625;
                int var52 = (int) (var14.field2146 >> 14 & 0x3FFFL) - class259.field3849;
                int var53 = var51 * 4 + 2 - (var6 / 128);
                int var54 = var52 * 4 + 2 - (var7 / 128);
                class673.method3714(var54, var53, arg1, arg0, false, arg4, var5, class346.field4860[0]);
            }
        }
        for (int var15 = 0; var15 < class178.field2352; var15++) {
            class316 var45 = (class316) class176.field2326.method1248(114, (long) class245.field3206[var15]);
            if (var45 != null) {
                class22 var46 = var45.field4455;
                if (var46.method120((byte) 63) && class625.field8475.field2813 == var46.field2813) {
                    class304 var47 = var46.field217;
                    if (var47 != null && var47.field4295 != null) {
                        var47 = var47.method1968(class480.field6740, -1);
                    }
                    if (var47 != null && var47.field4277 && var47.field4260) {
                        int var48 = var46.field2802 / 128 - (var6 / 128);
                        int var49 = var46.field2810 / 128 - (var7 / 128);
                        if (var47.field4334 == -1) {
                            class673.method3714(var49, var48, arg1, arg0, false, arg4, var5, class346.field4860[1]);
                        } else {
                            class304.method1969(arg4, var48, arg3, (byte) -112, arg0, var49, arg1, var5, var47.field4334);
                        }
                    }
                }
            }
        }
        int var16 = class652.field8795;
        int[] var17 = class497.field6986;
        for (int var18 = 0; var18 < var16; var18++) {
            class758 var37 = class84.field1204[var17[var18]];
            if (var37 != null && var37.method4165((byte) 63) && !var37.field10374 && class625.field8475 != var37 && class625.field8475.field2813 == var37.field2813) {
                int var38 = var37.field2802 / 128 - (var6 / 128);
                int var39 = var37.field2810 / 128 - (var7 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class525.field7289; var41++) {
                    if (var37.field10367.equals(class316.field4458[var41]) && class565.field7737[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class199.field2588; var43++) {
                    if (var37.field10367.equals(class245.field3209[var43].field1713)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class625.field8475.field10383 != 0 && var37.field10383 != 0 && class625.field8475.field10383 == var37.field10383) {
                    var44 = true;
                }
                if (var37.field10373) {
                    class673.method3714(var39, var38, arg1, arg0, false, arg4, var5, class346.field4860[6]);
                } else if (var44) {
                    class673.method3714(var39, var38, arg1, arg0, false, arg4, var5, class346.field4860[4]);
                } else if (var37.field10397) {
                    class673.method3714(var39, var38, arg1, arg0, false, arg4, var5, class346.field4860[7]);
                } else if (var40) {
                    class673.method3714(var39, var38, arg1, arg0, false, arg4, var5, class346.field4860[3]);
                } else if (var42) {
                    class673.method3714(var39, var38, arg1, arg0, false, arg4, var5, class346.field4860[5]);
                } else {
                    class673.method3714(var39, var38, arg1, arg0, false, arg4, var5, class346.field4860[2]);
                }
            }
        }
        class436[] var19 = class681.field9112;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class436 var23 = var19[var20];
            if (var23 != null && var23.field6307 != 0 && class572.field7788 % 20 < 10) {
                if (var23.field6307 == 1) {
                    class316 var24 = (class316) class176.field2326.method1248(124, (long) var23.field6304);
                    if (var24 != null) {
                        class22 var25 = var24.field4455;
                        int var26 = var25.field2802 / 128 - var6 / 128;
                        int var27 = var25.field2810 / 128 - (var7 / 128);
                        class550.method3159(var27, true, arg0, 360000L, var26, var5, arg4, arg1, var23.field6311);
                    }
                }
                if (var23.field6307 == 2) {
                    int var28 = var23.field6300 / 128 - (var6 / 128);
                    int var29 = var23.field6302 / 128 - var7 / 128;
                    long var30 = (long) (var23.field6303 << 7);
                    long var32 = var30 * var30;
                    class550.method3159(var29, true, arg0, var32, var28, var5, arg4, arg1, var23.field6311);
                }
                if (var23.field6307 == 10 && var23.field6304 >= 0 && var23.field6304 < class84.field1204.length) {
                    class758 var34 = class84.field1204[var23.field6304];
                    if (var34 != null) {
                        int var35 = var34.field2802 / 128 - (var6 / 128);
                        int var36 = var34.field2810 / 128 - (var7 / 128);
                        class550.method3159(var36, true, arg0, 360000L, var35, var5, arg4, arg1, var23.field6311);
                    }
                }
            }
        }
        if (class697.field9252 == 4) {
            return;
        }
        if (class302.field4242 != 0) {
            int var21 = (class302.field4242 * 4 - -((class625.field8475.method2563(-12840) + -1) * 2)) + 2 - (var6 / 128);
            int var22 = class15.field148 * 4 + (-(var7 / 128) - (-(class625.field8475.method2563(-12840) * 2) + 2)) + 2;
            class673.method3714(var22, var21, arg1, arg0, false, arg4, var5, class249.field3295[class635.field8577 ? 1 : 0]);
        }
        if (!class625.field8475.field10374) {
            arg3.method529(3, arg0 + (arg4.field4940 / 2) - 1, 3, arg1 + (arg4.field4986 / 2) - 1, -1, 1);
            return;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z", line = 323)
    public final boolean method4168(int arg0) {
        field10413++;
        if (arg0 < 66) {
            method4175('p', (byte) 48);
        }
        return this.field10407 != null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Llf;)V", line = 898)
    public class759(class250 arg0) {
        this.field10410 = arg0;
        if (this.field10410.field3652 && this.field10410.field3616) {
            this.field10407 = this.field10419 = new class82(this.field10410);
            if (this.field10410.field3511 > 1 && this.field10410.field3564 && this.field10410.field3592) {
                this.field10407 = this.field10401 = new class82(this.field10410);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lov;I)V", line = 344)
    public final void method4169(class200 arg0, int arg1) {
        arg0.field2597 = false;
        field10425++;
        arg0.method1310(-23544);
        arg0.method1102((byte) 108);
        this.method4171((byte) 38);
        if (arg1 != 16383) {
            this.field10410 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 366)
    public static void method4170(boolean arg0) {
        field10404 = null;
        field10405 = null;
        if (!arg0) {
            method4175('q', (byte) -23);
        }
        field10408 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 380)
    private final void method4171(byte arg0) {
        field10416++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class200 var5 = (class200) this.field10400.method679((byte) -86); var5 != null; var5 = (class200) this.field10400.method681(-128)) {
            int var9 = var5.method1309((byte) 71);
            var4 += var5.method1316((byte) -120);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method1314(-117);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (arg0 != 38) {
            this.field10407 = null;
        }
        if (this.field10428 != var6) {
            this.field10426 = true;
            this.field10428 = var6;
        }
        int var7 = this.field10431 <= 2 ? this.field10431 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (this.field10422 != var2) {
            this.field10424 = true;
            this.field10422 = var2;
        }
        if (var7 != var8) {
            this.field10434 = this.field10426 = true;
        }
        this.field10431 = var4;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 446)
    public final void method4172(int arg0) {
        this.field10430 = null;
        this.field10429 = null;
        field10412++;
        this.field10432 = null;
        this.field10407 = this.field10401 = this.field10419 = null;
        this.field10433 = null;
        if (arg0 != 2) {
            return;
        }
        if (!this.field10400.method688(116)) {
            for (class159 var2 = this.field10400.method679((byte) -86); var2 != this.field10400.field1194; var2 = var2.field2139) {
                ((class200) var2).method1310(-23544);
            }
        }
        this.field10403 = this.field10420 = 1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)Z", line = 475)
    public final boolean method4173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10421++;
        if (this.field10407 == null || this.field10400.method688(-99)) {
            return false;
        }
        if (this.field10403 != arg1 || this.field10420 != arg4) {
            this.field10403 = arg1;
            this.field10420 = arg4;
            for (class159 var6 = this.field10400.method679((byte) -86); var6 != this.field10400.field1194; var6 = var6.field2139) {
                ((class200) var6).method1307(this.field10403, this.field10420, (byte) -78);
            }
            this.field10424 = true;
            this.field10434 = true;
            this.field10426 = true;
        }
        if (arg3 <= 46) {
            this.method4172(22);
        }
        if (!this.method4177(1)) {
            return false;
        }
        this.field10418 = arg0;
        this.field10414 = true;
        this.field10406 = arg2;
        this.field10410.method1594(this.field10407, (byte) -117);
        this.field10407.method669(true, 0);
        this.field10410.method1621(1, -this.field10406, this.field10420 + this.field10418 - this.field10410.field3421);
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V", line = 523)
    public final void method4174(boolean arg0) {
        field10399++;
        if (!this.field10414) {
            return;
        }
        if (this.field10401 != null) {
            this.field10410.method1609((byte) -103, this.field10401);
            int var2 = 16384;
            this.field10410.method1636(0, this.field10419);
            this.field10401.method659(0, -17);
            this.field10419.method669(arg0, 0);
            if (this.field10422) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field10403, this.field10420, 0, 0, this.field10403, this.field10420, var2, 9728);
            this.field10410.method1606(this.field10401, -122);
            this.field10410.method1586(-19803, this.field10419);
        }
        this.field10410.method1598(-8556);
        this.field10410.method1564(0, (byte) 60);
        this.field10410.method1601(25456, 1);
        this.field10410.method526();
        int var3 = 0;
        int var4 = 1;
        class200 var6;
        for (class200 var5 = (class200) this.field10400.method679((byte) -86); var5 != null; var5 = var6) {
            var6 = (class200) this.field10400.method681(-19);
            int var7 = var5.method1316((byte) -113);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1308(this.field10433[var3], this.field10430, -257, var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field10410.method1567(this.field10419, -109);
                    this.field10410.method1621(1, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field10420);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field10406, this.field10418);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field10406, this.field10418 + this.field10420);
                    OpenGL.glTexCoord2f((float) this.field10403, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field10406 + this.field10403, this.field10420 + this.field10418);
                    OpenGL.glTexCoord2f((float) this.field10403, (float) this.field10420);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field10406 + this.field10403, this.field10418);
                    OpenGL.glEnd();
                } else {
                    this.field10419.method669(arg0, -(-var4));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field10420);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field10420);
                    OpenGL.glTexCoord2f((float) this.field10403, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field10403, this.field10420);
                    OpenGL.glTexCoord2f((float) this.field10403, (float) this.field10420);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field10403, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method1317(var8, 0);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field10414 = false;
        if (!arg0) {
            this.method4171((byte) -89);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(CB)Z", line = 626)
    public static final boolean method4175(char arg0, byte arg1) {
        field10409++;
        if (arg1 >= -19) {
            return false;
        } else if ((arg0 <= '\u0000' || arg0 >= '\u0080') && (arg0 < ' ' || arg0 > 'ÿ')) {
            if (arg0 != '\u0000') {
                char[] var2 = class652.field8796;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILdt;)Lar;", line = 663)
    public static final class709 method4176(int arg0, class254 arg1) {
        if (arg0 != 16383) {
            method4167(73, 76, 50, null, null);
        }
        field10427++;
        class68 var2 = class685.method3762(arg1, 1);
        int var3 = arg1.method1695(423951304);
        return new class709(var2.field4711, var2.field4715, var2.field4713, var2.field4709, var2.field4708, var2.field4710, var2.field4712, var2.field4706, var2.field4707, var2.field948, var2.field946, var2.field949, var2.field940, var2.field941, var2.field944, var3);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Z", line = 687)
    private final boolean method4177(int arg0) {
        field10415++;
        if (this.field10424) {
            if (this.field10432 != null) {
                this.field10432.method2527(arg0 ^ 0x27E7);
                this.field10432 = null;
            }
            if (this.field10430 != null) {
                this.field10430.method1341(true);
                this.field10430 = null;
            }
            if (this.field10401 != null) {
                this.field10432 = new class420(this.field10410, 6402, this.field10403, this.field10420, this.field10410.field3511);
            }
            if (this.field10422) {
                this.field10430 = new class456(this.field10410, 34037, 6402, this.field10403, this.field10420);
            } else if (this.field10432 == null) {
                this.field10432 = new class420(this.field10410, 6402, this.field10403, this.field10420);
            }
            this.field10423 = true;
            this.field10424 = false;
            this.field10434 = true;
        }
        if (arg0 != 1) {
            this.method4174(true);
        }
        if (this.field10426) {
            if (this.field10429 != null) {
                this.field10429.method2527(arg0 + 10213);
                this.field10429 = null;
            }
            if (this.field10433[0] != null) {
                this.field10433[0].method1341(true);
                this.field10433[0] = null;
            }
            if (this.field10433[1] != null) {
                this.field10433[1].method1341(true);
                this.field10433[1] = null;
            }
            if (this.field10401 != null) {
                this.field10429 = new class420(this.field10410, this.field10428, this.field10403, this.field10420, this.field10410.field3511);
            }
            this.field10433[0] = new class456(this.field10410, 34037, this.field10428, this.field10403, this.field10420);
            this.field10433[1] = this.field10431 > 1 ? new class456(this.field10410, 34037, this.field10428, this.field10403, this.field10420) : null;
            this.field10426 = false;
            this.field10434 = true;
            this.field10423 = true;
        }
        if (this.field10434) {
            if (this.field10401 == null) {
                this.field10410.method1594(this.field10419, (byte) -91);
                this.field10419.method661((byte) 12, 0);
                this.field10419.method661((byte) 12, 1);
                this.field10419.method661((byte) 12, 8);
                this.field10419.method655(91, 0, this.field10433[0]);
                if (this.field10431 > 1) {
                    this.field10419.method655(53, 1, this.field10433[1]);
                }
                if (this.field10422) {
                    this.field10419.method655(99, 8, this.field10430);
                } else {
                    this.field10419.method667(this.field10432, 8, arg0 + 16069);
                }
                this.field10410.method1567(this.field10419, -118);
            } else {
                this.field10410.method1594(this.field10419, (byte) -81);
                this.field10419.method661((byte) 12, 0);
                this.field10419.method661((byte) 12, 1);
                this.field10419.method661((byte) 12, 8);
                this.field10419.method655(34, 0, this.field10433[0]);
                if (this.field10431 > 1) {
                    this.field10419.method655(arg0 ^ 0x71, 1, this.field10433[1]);
                }
                if (this.field10422) {
                    this.field10419.method655(arg0 + 99, 8, this.field10430);
                }
                this.field10410.method1567(this.field10419, -88);
                this.field10410.method1594(this.field10401, (byte) -57);
                this.field10401.method661((byte) 12, 0);
                this.field10401.method661((byte) 12, 8);
                this.field10401.method667(this.field10429, 0, 16070);
                this.field10401.method667(this.field10432, 8, 16070);
                this.field10410.method1567(this.field10401, -114);
            }
            this.field10423 = true;
            this.field10434 = false;
        }
        if (this.field10423) {
            this.field10410.method1594(this.field10407, (byte) -82);
            this.field10423 = !this.field10407.method670(true);
            this.field10410.method1567(this.field10407, -105);
        }
        return !this.field10423;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Lov;I)Z", line = 829)
    public final boolean method4178(class200 arg0, int arg1) {
        field10411++;
        if (arg1 != -1) {
            return false;
        }
        if (this.field10407 != null) {
            if (arg0.method1318(false) || arg0.method1312(9216)) {
                this.field10400.method689(arg0, arg1 - 79);
                this.method4171((byte) 38);
                if (this.method4177(1)) {
                    if (this.field10403 != -1 && this.field10420 != -1) {
                        arg0.method1307(this.field10403, this.field10420, (byte) -36);
                    }
                    arg0.field2597 = true;
                    return true;
                }
            }
            this.method4169(arg0, 16383);
        }
        return false;
    }
}
