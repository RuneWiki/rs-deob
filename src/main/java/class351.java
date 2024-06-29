import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class351 extends class341 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    private int field5402 = 0;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    private int field5420 = 0;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    private int field5419 = 0;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    private int field5409 = 0;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    private int field5427 = 0;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "Z")
    private boolean field5429 = false;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Lnq;")
    private class325 field5426;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lld;")
    private class116 field5422;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
    public static int[] field5403 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
    public static int[] field5417 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field5430 = 0;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Lco;")
    public static class77 field5406 = new class77("LOCAL", 4);

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "J")
    public static long field5432;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Lld;")
    private class116 field5418;

    static {
        new class446("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "()I", line = 3)
    public final int method305() {
        field5414++;
        return this.field5422.field1595;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lnq;IIII)V", line = 699)
    public class351(class325 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5426 = arg0;
        this.field5422 = class35.method310(arg3, arg2, arg0, 34037, arg1, arg4);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lnq;II[III)V", line = 774)
    public class351(class325 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5426 = arg0;
        this.field5422 = class208.method1430(arg1, arg0, -125, false, arg2, arg3);
    }

    @OriginalMember(owner = "client!lm", name = "ta", descriptor = "(FFFFFFIII)V", line = 21)
    public final void method292(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field5423++;
        if (this.field5429) {
            float var10 = (float) this.method302();
            float var11 = (float) this.method306();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5419 * var14;
            float var17 = (float) this.field5419 * var15;
            float var18 = (float) this.field5402 * var12;
            float var19 = (float) this.field5402 * var13;
            float var20 = (float) this.field5427 * -var12;
            float var21 = (float) this.field5427 * -var13;
            float var22 = (float) this.field5409 * -var14;
            arg4 = arg4 + var18 + var22;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            float var23 = (float) this.field5409 * -var15;
            arg1 = arg1 + var19 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field5422.method3176(false, true);
        float var25 = arg5 + arg3 - arg1;
        this.field5426.method2096(-29861);
        this.field5426.method2075(this.field5422, 0);
        this.field5426.method2087(arg8, 16711935);
        this.field5426.method2045(34023, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V", line = 91)
    private final void method2257(byte arg0, int arg1) {
        this.field5426.method2040((byte) 56, 1);
        field5421++;
        this.field5426.method2075(this.field5422, 0);
        this.field5426.method2030(this.field5426.method2070(arg1, -85), 7681, (byte) 71);
        this.field5426.method2059(34167, 768, 1, -31277);
        int var3 = -11 / ((arg0 - 54) / 59);
        this.field5426.method2044(0, 770, (byte) 64, 34168);
        this.field5426.method2040((byte) -93, 0);
        this.field5426.method2075(this.field5418, 0);
        this.field5426.method2030(34479, 7681, (byte) 71);
        this.field5426.method2059(34166, 768, 1, -31277);
        if (this.field5420 == 0) {
            this.field5426.method2020((byte) 75, 0.5F, 1.0F, 0.0F, 0.5F);
        } else if (this.field5420 == 1) {
            this.field5426.method2020((byte) 75, 1.0F, 0.5F, 0.0F, 0.5F);
        } else if (this.field5420 == 2) {
            this.field5426.method2020((byte) 75, 0.5F, 0.5F, 0.0F, 1.0F);
        } else if (this.field5420 == 3) {
            this.field5426.method2020((byte) 75, 128.5F, 128.5F, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!lm", name = "PA", descriptor = "(IIIIIII)V", line = 126)
    public final void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5404++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field5422.method3176(false, false);
        this.field5426.method2096(-29861);
        this.field5426.method2075(this.field5422, 0);
        this.field5426.method2087(arg6, 16711935);
        this.field5426.method2045(34023, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5422.field1593 && !this.field5429) {
            float var10 = (float) arg3 * this.field5422.field1598 / (float) this.field5422.field1595;
            float var11 = (float) arg2 * this.field5422.field1602 / (float) this.field5422.field1594;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field5402, (float) this.field5419, 0.0F);
        int var12 = this.method302();
        int var13 = this.method306();
        int var14 = this.field5422.field1595 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field5422.field1594 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field5422.field1602 / (float) this.field5422.field1594;
                OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5422.field1598);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field5422.field1595 - var9) * this.field5422.field1598 / (float) this.field5422.field1595;
            int var17 = this.field5422.field1594 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5422.field1602, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field5422.field1602 / (float) this.field5422.field1594;
                OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5422.field1598);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!lm", name = "TA", descriptor = "()I", line = 266)
    public final int method296() {
        field5431++;
        return this.field5422.field1594;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 276)
    public static final void method2258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field5405++;
        if (!arg9) {
            return;
        }
        class119 var10 = null;
        for (class119 var11 = (class119) class460.field6887.method445(33); var11 != null; var11 = (class119) class460.field6887.method451(false)) {
            if (var11.field1631 == arg6 && var11.field1638 == arg0 && var11.field1640 == arg2 && var11.field1629 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class119();
            var10.field1629 = arg4;
            var10.field1640 = arg2;
            var10.field1631 = arg6;
            var10.field1638 = arg0;
            if (arg0 >= 0 && arg2 >= 0 && class398.field6071 > arg0 && class528.field7734 > arg2) {
                class46.method359(var10, (byte) 60);
            }
            class460.field6887.method453((byte) 115, var10);
        }
        var10.field1639 = arg3;
        var10.field1636 = arg1;
        var10.field1634 = arg8;
        var10.field1630 = arg7;
        var10.field1637 = arg5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(FFFFFFLi;II)V", line = 325)
    public final void method300(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8) {
        field5425++;
        class116 var10 = ((class261) arg6).field3678;
        if (this.field5429) {
            float var11 = (float) this.method302();
            float var12 = (float) this.method306();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5419 * var15;
            float var18 = (float) this.field5419 * var16;
            float var19 = (float) this.field5402 * var13;
            float var20 = (float) this.field5402 * var14;
            float var21 = (float) this.field5427 * -var13;
            float var22 = (float) this.field5427 * -var14;
            float var23 = (float) this.field5409 * -var15;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field5409 * -var16;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field5422.method3176(false, true);
        float var26 = arg5 + arg3 - arg1;
        this.field5426.method2096(-29861);
        this.field5426.method2075(this.field5422, 0);
        this.field5426.method2045(34023, 1);
        this.field5426.method2040((byte) -119, 1);
        this.field5426.method2075(var10, 0);
        this.field5426.method2030(7681, 8448, (byte) 71);
        this.field5426.method2059(34168, 768, 0, -31277);
        this.field5426.method2087(1, 16711935);
        float var27 = var10.field1602 / (float) var10.field1594;
        float var28 = var10.field1598 / (float) var10.field1595;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5422.field1598);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field1598 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field1598 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5422.field1602, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field1598 - ((var26 - (float) arg8) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5422.field1602, this.field5422.field1598);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field1598 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5426.method2059(5890, 768, 0, -31277);
        this.field5426.method2045(34023, 0);
        this.field5426.method2075(null, 0);
        this.field5426.method2040((byte) -111, 0);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 410)
    public static void method2259(int arg0) {
        if (arg0 != 33985) {
            method2259(75);
        }
        field5417 = null;
        field5403 = null;
        field5406 = null;
    }

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "(IIIII)V", line = 424)
    public final void method297(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5407++;
        this.field5422.method3176(false, false);
        this.field5426.method2096(-29861);
        this.field5426.method2087(arg4, 16711935);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5402 + arg0;
        int var7 = this.field5419 + arg1;
        if (this.field5418 == null) {
            this.field5426.method2075(this.field5422, 0);
            this.field5426.method2045(34023, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field5422.field1595 + var7);
            OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
            OpenGL.glVertex2i(this.field5422.field1594 + var6, this.field5422.field1595 + var7);
            OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
            OpenGL.glVertex2i(var6 + this.field5422.field1594, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2257((byte) -19, arg2);
        this.field5418.method3176(false, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5422.field1598);
        OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, var7 + this.field5422.field1595);
        OpenGL.glMultiTexCoord2f(33985, this.field5422.field1602, 0.0F);
        OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
        OpenGL.glVertex2i(this.field5422.field1594 + var6, this.field5422.field1595 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field5422.field1602, this.field5422.field1598);
        OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
        OpenGL.glVertex2i(this.field5422.field1594 + var6, var7);
        OpenGL.glEnd();
        this.method2260(12433);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()I", line = 483)
    public final int method302() {
        field5408++;
        return this.field5422.field1594 + this.field5402 + this.field5427;
    }

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "(IIII)V", line = 495)
    public final void method294(int arg0, int arg1, int arg2, int arg3) {
        this.field5427 = arg2;
        field5415++;
        this.field5409 = arg3;
        this.field5419 = arg1;
        this.field5402 = arg0;
        this.field5429 = this.field5402 != 0 || this.field5419 != 0 || this.field5427 != 0 || this.field5409 != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 512)
    private final void method2260(int arg0) {
        if (arg0 != 12433) {
            return;
        }
        field5416++;
        this.field5426.method2040((byte) 44, 1);
        this.field5426.method2075(null, 0);
        this.field5426.method2030(8448, 8448, (byte) 71);
        this.field5426.method2059(34168, 768, 1, -31277);
        this.field5426.method2044(0, 770, (byte) 64, 5890);
        this.field5426.method2040((byte) -106, 0);
        this.field5426.method2059(34168, 768, 1, arg0 ^ 0xFFFFB542);
    }

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "(IIIIII)V", line = 536)
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5424++;
        this.field5422.method232(arg4, arg0, 0, arg3, arg1, arg5, arg2);
    }

    @OriginalMember(owner = "client!lm", name = "XA", descriptor = "(IIIIIII)V", line = 546)
    public final void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5422.method3176(false, true);
        field5412++;
        this.field5426.method2096(-29861);
        this.field5426.method2087(arg6, 16711935);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5429) {
            float var8 = (float) arg2 / (float) this.method302();
            float var9 = (float) arg3 / (float) this.method306();
            float var10 = (float) this.field5402 * var8 + (float) arg0;
            float var11 = (float) this.field5419 * var9 + (float) arg1;
            float var12 = (float) this.field5422.field1594 * var8 + var10;
            float var13 = (float) this.field5422.field1595 * var9 + var11;
            if (this.field5418 == null) {
                this.field5426.method2075(this.field5422, 0);
                this.field5426.method2045(34023, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2257((byte) -103, arg4);
                this.field5418.method3176(false, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5422.field1598);
                OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5422.field1602, 0.0F);
                OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5422.field1602, this.field5422.field1598);
                OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2260(12433);
            }
        } else if (this.field5418 == null) {
            this.field5426.method2075(this.field5422, 0);
            this.field5426.method2045(34023, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2257((byte) -36, arg4);
            this.field5418.method3176(false, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5422.field1598);
            OpenGL.glTexCoord2f(0.0F, this.field5422.field1598);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5422.field1602, 0.0F);
            OpenGL.glTexCoord2f(this.field5422.field1602, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5422.field1602, this.field5422.field1598);
            OpenGL.glTexCoord2f(this.field5422.field1602, this.field5422.field1598);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2260(12433);
        }
    }

    @OriginalMember(owner = "client!lm", name = "ga", descriptor = "()I", line = 650)
    public final int method306() {
        field5428++;
        return this.field5422.field1595 + this.field5419 + this.field5409;
    }

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "(III)V", line = 666)
    public final void method307(int arg0, int arg1, int arg2) {
        field5410++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5418 = class35.method310(this.field5422.field1594, arg1, this.field5426, 34037, arg0, this.field5422.field1595);
        this.field5420 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILi;II)V", line = 715)
    public final void method303(int arg0, int arg1, class30 arg2, int arg3, int arg4) {
        field5411++;
        class261 var6 = (class261) arg2;
        class116 var7 = var6.field3678;
        this.field5422.method3176(false, false);
        this.field5426.method2096(-29861);
        this.field5426.method2075(this.field5422, 0);
        this.field5426.method2045(34023, 1);
        this.field5426.method2040((byte) -95, 1);
        this.field5426.method2075(var7, 0);
        this.field5426.method2030(7681, 8448, (byte) 71);
        this.field5426.method2059(34168, 768, 0, -31277);
        this.field5426.method2087(1, 16711935);
        int var8 = this.field5419 + arg1;
        int var9 = this.field5402 + arg0;
        int var10 = var9 + this.field5422.field1594;
        int var11 = this.field5422.field1595 + var8;
        float var12 = var7.field1602 / (float) var7.field1594;
        float var13 = var7.field1598 / (float) var7.field1595;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1598 - (float) (var8 - arg4) * var13;
        float var17 = var7.field1598 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5422.field1598);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field5422.field1595 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5422.field1602, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5422.field1594 + var9, this.field5422.field1595 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5422.field1602, this.field5422.field1598);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field5422.field1594, var8);
        OpenGL.glEnd();
        this.field5426.method2059(5890, 768, 0, -31277);
        this.field5426.method2045(34023, 0);
        this.field5426.method2075(null, 0);
        this.field5426.method2040((byte) 32, 0);
    }
}
