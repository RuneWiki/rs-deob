import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class463 extends class147 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    private int field6406 = 0;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    private int field6410 = 0;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    private int field6413 = 0;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    private int field6417 = 0;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
    private int field6430 = 0;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Z")
    private boolean field6408 = false;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "Ldia;")
    private class246 field6429;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "Lme;")
    private class207 field6422;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!rp", name = "F", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "Lme;")
    private class207 field6419;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "[I")
    public static int[] field6409;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILgea;II)V")
    public static final void method2742(int arg0, class81 arg1, int arg2, int arg3) {
        field6405++;
        if (!class526.field7216) {
            return;
        }
        int var4 = 0;
        for (class275 var5 = (class275) arg1.field1155.method697(0); var5 != null; var5 = (class275) arg1.field1155.method699(true)) {
            int var11 = class244.method1574(var5, (byte) -101);
            if (var11 > var4) {
                var4 = var11;
            }
        }
        var4 += 8;
        class485.field6706 = arg1.field1151 * 16 + (class38.field591 ? 26 : 22);
        int var6 = arg1.field1151 * 16 + 21;
        int var7 = class442.field6220 + class245.field3317;
        if ((var4 + var7) > class593.field8019) {
            var7 = class245.field3317 - var4;
        }
        int var8 = -81 % ((4 - arg2) / 63);
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = class38.field591 ? 33 : 31;
        int var10 = arg0 + 13 - var9;
        if (class140.field2048 < (var10 + var6)) {
            var10 = class140.field2048 - var6;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        class271.field4010 = var7;
        class152.field2100 = var4;
        class314.field4522 = arg1;
        class270.field3986 = var10;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
    public static final String method2743(boolean arg0, long arg1, int arg2, int arg3, int arg4) {
        field6428++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            var8 = true;
            arg1 = -arg1;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg1 * 10));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                if (arg4 != -1262897456) {
                    field6409 = null;
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(IIII)V")
    public final void method1112(int arg0, int arg1, int arg2, int arg3) {
        this.field6430 = arg1;
        field6418++;
        this.field6417 = arg0;
        this.field6410 = arg3;
        this.field6406 = arg2;
        this.field6408 = this.field6417 != 0 || this.field6430 != 0 || this.field6406 != 0 || this.field6410 != 0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static void method2744(int arg0) {
        field6409 = null;
        if (arg0 != -13865) {
            method2744(-66);
        }
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "()I")
    public final int method1110() {
        field6424++;
        return this.field6422.field2704;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)V")
    private final void method2745(int arg0, byte arg1) {
        if (arg1 < 1) {
            return;
        }
        field6433++;
        this.field6429.method1637(33984, 1);
        this.field6429.method1653((byte) 87, this.field6422);
        this.field6429.method1622(7681, this.field6429.method1608(arg0, -124), (byte) 126);
        this.field6429.method1641(34167, 768, 1, 34192);
        this.field6429.method1657((byte) 90, 770, 0, 34168);
        this.field6429.method1637(33984, 0);
        this.field6429.method1653((byte) 116, this.field6419);
        this.field6429.method1622(7681, 34479, (byte) 124);
        this.field6429.method1641(34166, 768, 1, 34192);
        if (this.field6413 == 0) {
            this.field6429.method1612(1.0F, 0.5F, 0.0F, 122, 0.5F);
        } else if (this.field6413 == 1) {
            this.field6429.method1612(0.5F, 0.5F, 0.0F, 118, 1.0F);
        } else if (this.field6413 == 2) {
            this.field6429.method1612(0.5F, 1.0F, 0.0F, 119, 0.5F);
        } else if (this.field6413 == 3) {
            this.field6429.method1612(128.5F, 128.5F, 0.0F, 123, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6422.method52(false, (arg7 & 0x1) != 0);
        field6431++;
        this.field6429.method1603(77);
        this.field6429.method1648(0, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6408) {
            float var9 = (float) arg2 / (float) this.method1096();
            float var10 = (float) arg3 / (float) this.method1106();
            float var11 = (float) this.field6417 * var9 + (float) arg0;
            float var12 = (float) this.field6430 * var10 + (float) arg1;
            float var13 = (float) this.field6422.field2712 * var9 + var11;
            float var14 = (float) this.field6422.field2704 * var10 + var12;
            if (this.field6419 == null) {
                this.field6429.method1653((byte) 97, this.field6422);
                this.field6429.method1589(-4, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2745(arg4, (byte) 114);
                this.field6419.method52(false, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6422.field2708);
                OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field6422.field2710, 0.0F);
                OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field6422.field2710, this.field6422.field2708);
                OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2746((byte) 89);
            }
        } else if (this.field6419 == null) {
            this.field6429.method1653((byte) 112, this.field6422);
            this.field6429.method1589(-4, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2745(arg4, (byte) 47);
            this.field6419.method52(false, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6422.field2708);
            OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6422.field2710, 0.0F);
            OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6422.field2710, this.field6422.field2708);
            OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2746((byte) 109);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
    private final void method2746(byte arg0) {
        this.field6429.method1637(33984, 1);
        field6423++;
        this.field6429.method1653((byte) 126, null);
        int var2 = -2 / ((25 - arg0) / 42);
        this.field6429.method1622(8448, 8448, (byte) 125);
        this.field6429.method1641(34168, 768, 1, 34192);
        this.field6429.method1657((byte) 90, 770, 0, 5890);
        this.field6429.method1637(33984, 0);
        this.field6429.method1641(34168, 768, 1, 34192);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1100(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        field6415++;
        class207 var11 = ((class148) arg7).field2076;
        if (this.field6408) {
            float var12 = (float) this.method1096();
            float var13 = (float) this.method1106();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field6430 * var16;
            float var19 = (float) this.field6430 * var17;
            float var20 = (float) this.field6417 * var14;
            float var21 = (float) this.field6417 * var15;
            float var22 = (float) this.field6406 * -var14;
            float var23 = (float) this.field6406 * -var15;
            float var24 = (float) this.field6410 * -var16;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field6410 * -var17;
            arg0 = arg0 + var20 + var18;
            arg4 = arg4 + var20 + var24;
            arg2 = arg2 + var22 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field6422.method52(false, (arg6 & 0x1) != 0);
        this.field6429.method1603(102);
        this.field6429.method1653((byte) 92, this.field6422);
        this.field6429.method1589(-4, 1);
        this.field6429.method1637(33984, 1);
        this.field6429.method1653((byte) 110, var11);
        this.field6429.method1622(8448, 7681, (byte) 126);
        this.field6429.method1641(34168, 768, 0, 34192);
        this.field6429.method1648(0, 1);
        float var28 = var11.field2710 / (float) var11.field2712;
        float var29 = var11.field2708 / (float) var11.field2704;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6422.field2708);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field2708 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field2708 - (arg5 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field6422.field2710, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field2708 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field6422.field2710, this.field6422.field2708);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field2708 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field6429.method1641(5890, 768, 0, 34192);
        this.field6429.method1589(-4, 0);
        this.field6429.method1653((byte) 92, null);
        this.field6429.method1637(33984, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V")
    public final void method1081(int arg0, int arg1, int arg2) {
        field6426++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field6419 = class212.method1408(this.field6422.field2704, this.field6429, 34037, arg0, arg1, this.field6422.field2712);
        this.field6413 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII[III)V")
    private final void method2747(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field6420++;
        this.field6422.method1281(arg4, true, arg1, 73, arg5, arg3, arg6, arg2, arg0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method2748(int arg0, short[] arg1, int arg2) {
        field6434++;
        short[] var3 = new short[arg2];
        class278.method1800(arg1, 0, var3, arg0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "()I")
    public final int method1106() {
        field6404++;
        return this.field6422.field2704 + this.field6430 + this.field6410;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILaa;II)V")
    public final void method1084(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        field6421++;
        class148 var6 = (class148) arg2;
        class207 var7 = var6.field2076;
        this.field6422.method52(false, false);
        this.field6429.method1603(45);
        this.field6429.method1653((byte) 106, this.field6422);
        this.field6429.method1589(-4, 1);
        this.field6429.method1637(33984, 1);
        this.field6429.method1653((byte) 103, var7);
        this.field6429.method1622(8448, 7681, (byte) -54);
        this.field6429.method1641(34168, 768, 0, 34192);
        this.field6429.method1648(0, 1);
        int var8 = this.field6430 + arg1;
        int var9 = this.field6417 + arg0;
        int var10 = var9 + this.field6422.field2712;
        int var11 = this.field6422.field2704 + var8;
        float var12 = var7.field2710 / (float) var7.field2712;
        float var13 = var7.field2708 / (float) var7.field2704;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2708 - (float) (var8 - arg4) * var13;
        float var17 = var7.field2708 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6422.field2708);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field6422.field2704 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6422.field2710, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field6422.field2712 + var9, this.field6422.field2704 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6422.field2710, this.field6422.field2708);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field6422.field2712 + var9, var8);
        OpenGL.glEnd();
        this.field6429.method1641(5890, 768, 0, 34192);
        this.field6429.method1589(-4, 0);
        this.field6429.method1653((byte) 111, null);
        this.field6429.method1637(33984, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIII)V")
    public final void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6414++;
        int var8 = arg0 + arg2;
        this.field6422.method52(false, false);
        int var9 = arg1 + arg3;
        this.field6429.method1603(82);
        this.field6429.method1653((byte) 100, this.field6422);
        this.field6429.method1648(0, arg6);
        this.field6429.method1589(-4, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6422.field2706 && !this.field6408) {
            float var10 = (float) arg3 * this.field6422.field2708 / (float) this.field6422.field2704;
            float var11 = (float) arg2 * this.field6422.field2710 / (float) this.field6422.field2712;
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
        OpenGL.glTranslatef((float) this.field6417, (float) this.field6430, 0.0F);
        int var12 = this.method1096();
        int var13 = this.method1106();
        int var14 = this.field6422.field2704 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field6422.field2712 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field6422.field2710 / (float) this.field6422.field2712;
                OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field6422.field2708);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 - (var9 - this.field6422.field2704)) * this.field6422.field2708 / (float) this.field6422.field2704;
            int var17 = this.field6422.field2712 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field6422.field2710, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field6422.field2710 / (float) this.field6422.field2712;
                OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field6422.field2708);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V")
    public final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6435++;
        this.field6422.method52(false, false);
        this.field6429.method1603(121);
        this.field6429.method1648(0, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field6430 + arg1;
        int var7 = this.field6417 + arg0;
        if (this.field6419 == null) {
            this.field6429.method1653((byte) 95, this.field6422);
            this.field6429.method1589(-4, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field6422.field2704 + var6);
            OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
            OpenGL.glVertex2i(var7 + this.field6422.field2712, var6 - -this.field6422.field2704);
            OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
            OpenGL.glVertex2i(var7 + this.field6422.field2712, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2745(arg2, (byte) 122);
        this.field6419.method52(false, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6422.field2708);
        OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field6422.field2704 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field6422.field2710, 0.0F);
        OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
        OpenGL.glVertex2i(this.field6422.field2712 + var7, this.field6422.field2704 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field6422.field2710, this.field6422.field2708);
        OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
        OpenGL.glVertex2i(this.field6422.field2712 + var7, var6);
        OpenGL.glEnd();
        this.method2746((byte) -92);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1098(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field6408) {
            float var11 = (float) this.method1096();
            float var12 = (float) this.method1106();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6430 * var15;
            float var18 = (float) this.field6430 * var16;
            float var19 = (float) this.field6417 * var13;
            float var20 = (float) this.field6417 * var14;
            float var21 = (float) this.field6406 * -var13;
            float var22 = (float) this.field6406 * -var14;
            float var23 = (float) this.field6410 * -var15;
            float var24 = (float) this.field6410 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field6407++;
        float var25 = arg2 + arg4 - arg0;
        this.field6422.method52(false, (arg9 & 0x1) != 0);
        float var26 = arg5 + arg3 - arg1;
        this.field6429.method1603(49);
        this.field6429.method1653((byte) 95, this.field6422);
        this.field6429.method1648(0, arg8);
        this.field6429.method1589(-4, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field6422.field2708);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field6422.field2710, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field6422.field2710, this.field6422.field2708);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "()I")
    public final int method1096() {
        field6416++;
        return this.field6422.field2712 - (-this.field6417 - this.field6406);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method2749(String arg0, byte arg1) {
        field6425++;
        return arg1 > -74 ? false : class139.field2027.containsKey(arg0);
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "()I")
    public final int method1107() {
        field6411++;
        return this.field6422.field2712;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V")
    public static final void method2750(byte arg0) {
        if (class674.field9468 != 0) {
            if (class457.field6340 != null) {
                class457.field6340.method3027(2);
                class457.field6340 = null;
            }
            class608.method3365((byte) -109);
            class389.method2463(61);
        }
        if (arg0 < 40) {
            field6409 = null;
        }
        field6427++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIII)V")
    public final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field6429.field3576) {
            int[] var7 = this.field6429.method521(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class213.method1409(var7[var8], -16777216);
                }
                this.method2747(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field6422.method1280(arg4, false, arg1, arg2, arg3, arg5, arg0);
        }
        field6432++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "([I)V")
    public final void method1105(int[] arg0) {
        arg0[3] = this.field6410;
        field6412++;
        arg0[2] = this.field6406;
        arg0[0] = this.field6417;
        arg0[1] = this.field6430;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ldia;IIZ)V")
    public class463(class246 arg0, int arg1, int arg2, boolean arg3) {
        this.field6429 = arg0;
        this.field6422 = class287.method1829(arg3 ? 6408 : 6407, arg0, arg2, arg1, (byte) 127);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ldia;IIII)V")
    public class463(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6429 = arg0;
        this.field6422 = class212.method1408(arg4, arg0, 34037, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ldia;II[III)V")
    public class463(class246 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6429 = arg0;
        this.field6422 = class74.method665(arg1, arg3, false, arg5, arg2, arg0, arg4, (byte) -98);
    }
}
