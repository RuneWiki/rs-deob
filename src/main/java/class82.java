import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class82 {

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    private int field1160 = 1;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
    private int field1168 = 0;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    private int field1157 = 1;

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "I")
    private int field1173 = 0;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "Lfca;")
    private class661 field1167 = new class661();

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "Z")
    private boolean field1180 = false;

    @OriginalMember(owner = "client!kea", name = "D", descriptor = "Z")
    private boolean field1181 = true;

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "Z")
    private boolean field1177 = true;

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "I")
    private int field1184 = -1;

    @OriginalMember(owner = "client!kea", name = "H", descriptor = "Z")
    private boolean field1185 = true;

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
    private int field1178 = 0;

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "Z")
    private boolean field1179 = true;

    @OriginalMember(owner = "client!kea", name = "I", descriptor = "[Lgha;")
    private class520[] field1186 = new class520[2];

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "Lck;")
    private class733 field1165;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "Lvd;")
    private class39 field1152;

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "Lvd;")
    private class39 field1175;

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "Lvd;")
    private class39 field1170;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "[I")
    public static int[] field1166 = new int[5];

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "Lgha;")
    private class520 field1182;

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "Lru;")
    private class709 field1176;

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "Lru;")
    private class709 field1183;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "Z")
    private boolean field1161;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIII)V", line = 15)
    public static final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1174++;
        int var6 = class774.method4226(class80.field1131, (byte) -16, class405.field5375, arg3);
        int var7 = class774.method4226(class80.field1131, (byte) -70, class405.field5375, arg4);
        int var8 = class774.method4226(class498.field6390, (byte) -78, class30.field274, arg0);
        int var9 = class774.method4226(class498.field6390, (byte) -120, class30.field274, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class54.method333(var9, class207.field2840[var10], 7, var8, arg5);
        }
        int var11 = 7 % ((-arg1 - 19) / 34);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)Z", line = 43)
    private final boolean method514(byte arg0) {
        if (this.field1185) {
            if (this.field1176 != null) {
                this.field1176.method3829((byte) -127);
                this.field1176 = null;
            }
            if (this.field1182 != null) {
                this.field1182.method753(-1);
                this.field1182 = null;
            }
            if (this.field1170 != null) {
                this.field1176 = new class709(this.field1165, 6402, this.field1157, this.field1160, this.field1165.field9794);
            }
            if (this.field1180) {
                this.field1182 = new class520(this.field1165, 34037, 6402, this.field1157, this.field1160);
            } else if (this.field1176 == null) {
                this.field1176 = new class709(this.field1165, 6402, this.field1157, this.field1160);
            }
            this.field1181 = true;
            this.field1177 = true;
            this.field1185 = false;
        }
        if (arg0 >= -50) {
            this.method516(126);
        }
        field1153++;
        if (this.field1179) {
            if (this.field1183 != null) {
                this.field1183.method3829((byte) -125);
                this.field1183 = null;
            }
            if (this.field1186[0] != null) {
                this.field1186[0].method753(-1);
                this.field1186[0] = null;
            }
            if (this.field1186[1] != null) {
                this.field1186[1].method753(-1);
                this.field1186[1] = null;
            }
            if (this.field1170 != null) {
                this.field1183 = new class709(this.field1165, this.field1184, this.field1157, this.field1160, this.field1165.field9794);
            }
            this.field1186[0] = new class520(this.field1165, 34037, this.field1184, this.field1157, this.field1160);
            this.field1186[1] = this.field1178 <= 1 ? null : new class520(this.field1165, 34037, this.field1184, this.field1157, this.field1160);
            this.field1177 = true;
            this.field1179 = false;
            this.field1181 = true;
        }
        if (this.field1181) {
            if (this.field1170 == null) {
                this.field1165.method3988(this.field1152, -112);
                this.field1152.method236(0, -3);
                this.field1152.method236(1, -3);
                this.field1152.method236(8, -3);
                this.field1152.method239(this.field1186[0], 91, 0);
                if (this.field1178 > 1) {
                    this.field1152.method239(this.field1186[1], 52, 1);
                }
                if (this.field1180) {
                    this.field1152.method239(this.field1182, 85, 8);
                } else {
                    this.field1152.method243(8, this.field1176, false);
                }
                this.field1165.method3918(4609, this.field1152);
            } else {
                this.field1165.method3988(this.field1152, -112);
                this.field1152.method236(0, -3);
                this.field1152.method236(1, -3);
                this.field1152.method236(8, -3);
                this.field1152.method239(this.field1186[0], 82, 0);
                if (this.field1178 > 1) {
                    this.field1152.method239(this.field1186[1], 60, 1);
                }
                if (this.field1180) {
                    this.field1152.method239(this.field1182, 96, 8);
                }
                this.field1165.method3918(4609, this.field1152);
                this.field1165.method3988(this.field1170, -114);
                this.field1170.method236(0, -3);
                this.field1170.method236(8, -3);
                this.field1170.method243(0, this.field1183, false);
                this.field1170.method243(8, this.field1176, false);
                this.field1165.method3918(4609, this.field1170);
            }
            this.field1177 = true;
            this.field1181 = false;
        }
        if (this.field1177) {
            this.field1165.method3988(this.field1175, -124);
            this.field1177 = !this.field1175.method234(-117);
            this.field1165.method3918(4609, this.field1175);
        }
        return !this.field1177;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BIIII)Z", line = 174)
    public final boolean method515(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1155++;
        if (arg0 > -53) {
            this.method514((byte) 61);
        }
        if (this.field1175 == null || this.field1167.method3596(-109)) {
            return false;
        }
        if (this.field1157 != arg1 || this.field1160 != arg4) {
            this.field1157 = arg1;
            this.field1160 = arg4;
            for (class337 var6 = this.field1167.method3591(0); var6 != this.field1167.field8613; var6 = var6.field4111) {
                ((class263) var6).method1218(this.field1157, 40, this.field1160);
            }
            this.field1181 = true;
            this.field1179 = true;
            this.field1185 = true;
        }
        if (!this.method514((byte) -53)) {
            return false;
        }
        this.field1168 = arg3;
        this.field1173 = arg2;
        this.field1161 = true;
        this.field1165.method3988(this.field1175, -125);
        this.field1175.method237((byte) -122, 0);
        this.field1165.method3951(-this.field1168, this.field1160 + this.field1173 - this.field1165.field9789, 27289);
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z", line = 219)
    public final boolean method516(int arg0) {
        if (arg0 != -5704) {
            this.method515((byte) 11, -31, 100, -115, -52);
        }
        field1163++;
        return this.field1175 != null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIII)V", line = 230)
    public static final void method517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class88.field1219 = arg0;
        field1164++;
        class756.field10306 = arg3;
        if (arg2 == -28231) {
            class648.field8276 = arg4;
            class695.field8911 = arg1;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Llp;I)Z", line = 244)
    public final boolean method518(class263 arg0, int arg1) {
        if (arg1 != 0) {
            this.method518(null, 51);
        }
        field1159++;
        if (this.field1175 != null) {
            if (arg0.method1221(arg1 + 1) || arg0.method1217(50)) {
                this.field1167.method3593(arg0, 15);
                this.method523((byte) -127);
                if (this.method514((byte) -67)) {
                    if (this.field1157 != -1 && this.field1160 != -1) {
                        arg0.method1218(this.field1157, 45, this.field1160);
                    }
                    arg0.field3499 = true;
                    return true;
                }
            }
            this.method521(arg0, (byte) 38);
        }
        return false;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V", line = 282)
    public static void method519(int arg0) {
        int var1 = -63 % ((arg0 + 46) / 57);
        field1166 = null;
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lck;)V", line = 604)
    public class82(class733 arg0) {
        this.field1165 = arg0;
        if (this.field1165.field9880 && this.field1165.field9876) {
            this.field1175 = this.field1152 = new class39(this.field1165);
            if (this.field1165.field9794 > 1 && this.field1165.field9851 && this.field1165.field9931) {
                this.field1175 = this.field1170 = new class39(this.field1165);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V", line = 297)
    public final void method520(int arg0) {
        field1156++;
        if (!this.field1161) {
            return;
        }
        if (this.field1170 != null) {
            this.field1165.method3964((byte) 43, this.field1170);
            int var2 = 16384;
            this.field1165.method3984(-76, this.field1152);
            this.field1170.method247(false, 0);
            this.field1152.method237((byte) 127, 0);
            if (this.field1180) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1157, this.field1160, 0, 0, this.field1157, this.field1160, var2, 9728);
            this.field1165.method3962(true, this.field1170);
            this.field1165.method3940(this.field1152, (byte) 108);
        }
        this.field1165.method3914((byte) -72);
        this.field1165.method3920(0, 9770);
        this.field1165.method3979((byte) -74, 1);
        this.field1165.method957();
        int var3 = 0;
        int var4 = 1;
        if (arg0 < 100) {
            this.method516(36);
        }
        class263 var6;
        for (class263 var5 = (class263) this.field1167.method3591(0); var5 != null; var5 = var6) {
            var6 = (class263) this.field1167.method3600((byte) 109);
            int var7 = var5.method1669(5);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1219(var8, this.field1182, false, this.field1186[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field1165.method3918(4609, this.field1152);
                    this.field1165.method3951(0, 0, 27289);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1160);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1168, this.field1173);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1168, this.field1173 + this.field1160);
                    OpenGL.glTexCoord2f((float) this.field1157, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1168 + this.field1157, this.field1173 + this.field1160);
                    OpenGL.glTexCoord2f((float) this.field1157, (float) this.field1160);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1168 + this.field1157, this.field1173);
                    OpenGL.glEnd();
                } else {
                    this.field1152.method237((byte) -30, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1160);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field1160);
                    OpenGL.glTexCoord2f((float) this.field1157, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1157, this.field1160);
                    OpenGL.glTexCoord2f((float) this.field1157, (float) this.field1160);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1157, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method1220(var8, (byte) -128);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field1161 = false;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Llp;B)V", line = 403)
    public final void method521(class263 arg0, byte arg1) {
        arg0.field3499 = false;
        if (arg1 == 38) {
            field1162++;
            arg0.method1224(-126);
            arg0.method1946(arg1 ^ 0xFFFFD7A2);
            this.method523((byte) -126);
        }
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V", line = 420)
    public final void method522(int arg0) {
        if (arg0 != 0) {
            method517(-118, 44, 115, 5, 91);
        }
        this.field1182 = null;
        this.field1186 = null;
        this.field1176 = null;
        field1158++;
        this.field1175 = this.field1170 = this.field1152 = null;
        this.field1183 = null;
        if (!this.field1167.method3596(-85)) {
            for (class337 var2 = this.field1167.method3591(0); var2 != this.field1167.field8613; var2 = var2.field4111) {
                ((class263) var2).method1224(-103);
            }
        }
        this.field1157 = this.field1160 = 1;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)V", line = 462)
    private final void method523(byte arg0) {
        field1171++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class263 var5 = (class263) this.field1167.method3591(0); var5 != null; var5 = (class263) this.field1167.method3600((byte) 122)) {
            int var9 = var5.method1215(true);
            var4 += var5.method1669(5);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method1665(107);
        }
        if (arg0 >= -124) {
            return;
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
            this.field1179 = true;
            this.field1184 = var6;
        }
        int var7 = this.field1178 <= 2 ? this.field1178 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (var2 != this.field1180) {
            this.field1185 = true;
            this.field1180 = var2;
        }
        if (var7 != var8) {
            this.field1181 = this.field1179 = true;
        }
        this.field1178 = var4;
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)V", line = 527)
    public static final void method524(byte arg0) {
        field1169++;
        if (arg0 == -42) {
            class294.field3738.method2932((byte) 80);
            class282.field3656.method2932((byte) 80);
            class781.field10682.method2932((byte) 80);
            class615.field7807.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBLjava/awt/Canvas;I)Lhca;", line = 541)
    public static final class256 method525(int arg0, byte arg1, Canvas arg2, int arg3) {
        if (arg1 <= 113) {
            method513(-55, 110, 120, 93, 74, 18);
        }
        field1154++;
        try {
            Class var4 = Class.forName("hs");
            class256 var5 = (class256) var4.getDeclaredConstructor().newInstance();
            var5.method1648(arg3, -1, arg0, arg2);
            return var5;
        } catch (Throwable var7) {
            class436 var6 = new class436();
            var6.method1648(arg3, -1, arg0, arg2);
            return var6;
        }
    }
}
