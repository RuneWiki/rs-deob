import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class95 {

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    private int field1158 = 0;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
    private int field1174 = 1;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    private int field1173 = 0;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    private int field1157 = 1;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "Lui;")
    private class193 field1168 = new class193();

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "I")
    private int field1182 = 0;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Z")
    private boolean field1181 = true;

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    private int field1184 = -1;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "Z")
    private boolean field1183 = true;

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "[Lrr;")
    private class303[] field1187 = new class303[2];

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "Z")
    private boolean field1186 = true;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "Z")
    private boolean field1188 = true;

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "Z")
    private boolean field1190 = false;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "Lmh;")
    private class537 field1156;

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "Ler;")
    private class88 field1170;

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "Ler;")
    private class88 field1171;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "Ler;")
    private class88 field1166;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "Z")
    public static boolean field1167 = false;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "Ldb;")
    public static class268 field1179 = new class268(0, -1);

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "Ldca;")
    private class151 field1180;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "Ldca;")
    private class151 field1189;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "Lrr;")
    private class303 field1185;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "Z")
    private boolean field1176;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
    public static void method583(byte arg0) {
        if (arg0 != -42) {
            field1179 = null;
        }
        field1179 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method584(boolean arg0, String arg1, String arg2) {
        class91.field1121 = 1;
        class184.field2230 = -1;
        field1161++;
        class81.method476(arg0, -125, arg2, arg1);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    private final void method585(int arg0) {
        field1163++;
        if (arg0 != 8497) {
            this.method592(41);
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class167 var5 = (class167) this.field1168.method1050((byte) 73); var5 != null; var5 = (class167) this.field1168.method1047(-7962)) {
            int var9 = var5.method941(0);
            var4 += var5.method942((byte) 34);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method936((byte) -26);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1184 != var6) {
            this.field1186 = true;
            this.field1184 = var6;
        }
        int var7 = this.field1182 <= 2 ? this.field1182 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field1183 = this.field1186 = true;
        }
        this.field1182 = var4;
        if (var2 != this.field1190) {
            this.field1190 = var2;
            this.field1188 = true;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field1165++;
        if (!arg6) {
            field1179 = null;
        }
        if (arg0 == arg7 && arg8 == arg9 && arg1 == arg4 && arg2 == arg3) {
            class33.method190((byte) 66, arg7, arg3, arg5, arg9, arg1);
            return;
        }
        int var10 = arg7;
        int var11 = arg9;
        int var12 = arg7 * 3;
        int var13 = arg9 * 3;
        int var14 = arg0 * 3;
        int var15 = arg8 * 3;
        int var16 = arg4 * 3;
        int var17 = arg2 * 3;
        int var18 = arg1 - (var16 - var14) - arg7;
        int var19 = arg3 - var17 - (-var15 - -arg9);
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg7;
            int var34 = arg9 + (var28 + var30 + var32 >> 12);
            class33.method190((byte) 64, var10, var34, arg5, var11, var33);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)Z")
    public final boolean method587(byte arg0) {
        if (arg0 <= 24) {
            this.field1166 = null;
        }
        field1178++;
        return this.field1171 != null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIII)Z")
    public final boolean method588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1169++;
        if (this.field1171 == null || this.field1168.method1043(true)) {
            return false;
        }
        if (this.field1174 != arg3 || this.field1157 != arg1) {
            this.field1174 = arg3;
            this.field1157 = arg1;
            for (class544 var6 = this.field1168.method1050((byte) 73); var6 != this.field1168.field2331; var6 = var6.field7964) {
                ((class167) var6).method939(7, this.field1157, this.field1174);
            }
            this.field1183 = true;
            this.field1188 = true;
            this.field1186 = true;
        }
        if (arg4 != 21724) {
            this.method592(101);
        }
        if (!this.method592(arg4 - 21846)) {
            return false;
        }
        this.field1176 = true;
        this.field1158 = arg2;
        this.field1173 = arg0;
        this.field1156.method3096(this.field1171, -128);
        this.field1171.method519((byte) -52, 0);
        this.field1156.method3097((byte) -112, -this.field1173, this.field1157 + (-this.field1171.method521((byte) -26) - this.field1158));
        return true;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lvb;B)V")
    public final void method589(class167 arg0, byte arg1) {
        arg0.field2040 = false;
        int var3 = -89 % ((3 - arg1) / 43);
        field1160++;
        arg0.method932(false);
        arg0.method3187(true);
        this.method585(8497);
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(B)V")
    public final void method590(byte arg0) {
        field1164++;
        if (!this.field1176) {
            return;
        }
        if (this.field1166 != null) {
            int var2 = 16384;
            this.field1156.method3127(this.field1166, arg0 ^ 0xFFFFFF9B);
            this.field1156.method3110(this.field1170, true);
            this.field1166.method526(0, -21033);
            this.field1170.method519((byte) -79, 0);
            if (this.field1190) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1174, this.field1157, 0, 0, this.field1174, this.field1157, var2, 9728);
            this.field1156.method3113(-97, this.field1166);
            this.field1156.method3102(this.field1170, -88);
        }
        this.field1156.method3100(arg0 + 5255);
        this.field1156.method3058((byte) -115, 0);
        this.field1156.method3063(1, (byte) -107);
        this.field1156.method1182();
        int var3 = 0;
        int var4 = 1;
        class167 var6;
        for (class167 var5 = (class167) this.field1168.method1050((byte) 73); var5 != null; var5 = var6) {
            var6 = (class167) this.field1168.method1047(-7962);
            int var7 = var5.method942((byte) 123);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method940(false, this.field1185, var8, this.field1187[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field1156.method3109((byte) -108, this.field1170);
                    this.field1156.method3097((byte) -90, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1157);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1173, this.field1158);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1173, this.field1158 + this.field1157);
                    OpenGL.glTexCoord2f((float) this.field1174, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1174 + this.field1173, this.field1158 + this.field1157);
                    OpenGL.glTexCoord2f((float) this.field1174, (float) this.field1157);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1174 + this.field1173, this.field1158);
                    OpenGL.glEnd();
                } else {
                    this.field1170.method519((byte) -114, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1157);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field1157);
                    OpenGL.glTexCoord2f((float) this.field1174, (float) this.field1157);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1174, this.field1157);
                    OpenGL.glTexCoord2f((float) this.field1174, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1174, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method934(var8, (byte) 111);
                var3 = var3 + 1 & 0x1;
            }
        }
        if (arg0 != -59) {
            this.field1185 = null;
        }
        this.field1176 = false;
    }

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)V")
    public final void method591(byte arg0) {
        if (arg0 >= -67) {
            this.field1187 = null;
        }
        this.field1171 = this.field1166 = this.field1170 = null;
        this.field1187 = null;
        field1172++;
        this.field1189 = null;
        this.field1185 = null;
        this.field1180 = null;
        if (!this.field1168.method1043(true)) {
            for (class544 var2 = this.field1168.method1050((byte) 73); var2 != this.field1168.field2331; var2 = var2.field7964) {
                ((class167) var2).method932(false);
            }
        }
        this.field1174 = this.field1157 = 1;
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)Z")
    private final boolean method592(int arg0) {
        field1159++;
        int var2 = 37 / ((-arg0 - 10) / 51);
        if (this.field1188) {
            if (this.field1189 != null) {
                this.field1189.method823(8);
                this.field1189 = null;
            }
            if (this.field1185 != null) {
                this.field1185.method1352(-43);
                this.field1185 = null;
            }
            if (this.field1166 != null) {
                this.field1189 = new class151(this.field1156, 6402, this.field1174, this.field1157, this.field1156.field7723);
            }
            if (this.field1190) {
                this.field1185 = new class303(this.field1156, 34037, 6402, this.field1174, this.field1157);
            } else if (this.field1189 == null) {
                this.field1189 = new class151(this.field1156, 6402, this.field1174, this.field1157);
            }
            this.field1181 = true;
            this.field1183 = true;
            this.field1188 = false;
        }
        if (this.field1186) {
            if (this.field1180 != null) {
                this.field1180.method823(8);
                this.field1180 = null;
            }
            if (this.field1187[0] != null) {
                this.field1187[0].method1352(-78);
                this.field1187[0] = null;
            }
            if (this.field1187[1] != null) {
                this.field1187[1].method1352(-60);
                this.field1187[1] = null;
            }
            if (this.field1166 != null) {
                this.field1180 = new class151(this.field1156, this.field1184, this.field1174, this.field1157, this.field1156.field7723);
            }
            this.field1187[0] = new class303(this.field1156, 34037, this.field1184, this.field1174, this.field1157);
            this.field1187[1] = this.field1182 > 1 ? new class303(this.field1156, 34037, this.field1184, this.field1174, this.field1157) : null;
            this.field1183 = true;
            this.field1186 = false;
            this.field1181 = true;
        }
        if (this.field1183) {
            if (this.field1166 == null) {
                this.field1156.method3096(this.field1170, -128);
                this.field1170.method512(0, (byte) -126);
                this.field1170.method512(1, (byte) -125);
                this.field1170.method512(8, (byte) -128);
                this.field1170.method524(0, this.field1187[0], 111);
                if (this.field1182 > 1) {
                    this.field1170.method524(1, this.field1187[1], 101);
                }
                if (this.field1190) {
                    this.field1170.method524(8, this.field1185, 110);
                } else {
                    this.field1170.method517(8, -93, this.field1189);
                }
                this.field1156.method3109((byte) -108, this.field1170);
            } else {
                this.field1156.method3096(this.field1170, -127);
                this.field1170.method512(0, (byte) -126);
                this.field1170.method512(1, (byte) 28);
                this.field1170.method512(8, (byte) 2);
                this.field1170.method524(0, this.field1187[0], 117);
                if (this.field1182 > 1) {
                    this.field1170.method524(1, this.field1187[1], 120);
                }
                if (this.field1190) {
                    this.field1170.method524(8, this.field1185, 118);
                }
                this.field1156.method3109((byte) -108, this.field1170);
                this.field1156.method3096(this.field1166, -128);
                this.field1166.method512(0, (byte) -126);
                this.field1166.method512(8, (byte) -128);
                this.field1166.method517(0, -93, this.field1180);
                this.field1166.method517(8, -57, this.field1189);
                this.field1156.method3109((byte) -108, this.field1166);
            }
            this.field1181 = true;
            this.field1183 = false;
        }
        if (this.field1181) {
            this.field1156.method3096(this.field1171, -128);
            this.field1181 = !this.field1171.method522(-36);
            this.field1156.method3109((byte) -108, this.field1171);
        }
        return !this.field1181;
    }

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)Loda;")
    public static final class98 method593(byte arg0) {
        if (arg0 != 34) {
            method583((byte) -52);
        }
        field1162++;
        return class353.field4591;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(BLvb;)Z")
    public final boolean method594(byte arg0, class167 arg1) {
        field1175++;
        if (this.field1171 != null) {
            if (arg1.method933(-121) || arg1.method929(-28261)) {
                this.field1168.method1040(arg1, -127);
                this.method585(8497);
                if (this.method592(-115)) {
                    if (this.field1174 != -1 && this.field1157 != -1) {
                        arg1.method939(7, this.field1157, this.field1174);
                    }
                    arg1.field2040 = true;
                    return true;
                }
            }
            this.method589(arg1, (byte) 90);
        }
        if (arg0 >= -64) {
            this.field1185 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lmh;)V")
    public class95(class537 arg0) {
        this.field1156 = arg0;
        if (this.field1156.field7872 && this.field1156.field7795) {
            this.field1171 = this.field1170 = new class88(this.field1156);
            if (this.field1156.field7723 > 1 && this.field1156.field7858 && this.field1156.field7825) {
                this.field1171 = this.field1166 = new class88(this.field1156);
                return;
            }
        }
    }
}
