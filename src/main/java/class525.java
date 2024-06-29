import jaggl.OpenGL;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class525 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    private int field7160 = 1;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    private int field7174 = 1;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    private int field7171 = 0;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    private int field7172 = 0;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lsu;")
    private class192 field7165 = new class192();

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    private int field7184 = -1;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "Z")
    private boolean field7196 = true;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    private int field7199 = 0;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Z")
    private boolean field7181 = false;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Z")
    private boolean field7183 = true;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "Z")
    private boolean field7189 = true;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "Z")
    private boolean field7197 = true;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "[Lwaa;")
    private class646[] field7193 = new class646[2];

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Len;")
    private class289 field7179;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Lufa;")
    private class625 field7158;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lufa;")
    private class625 field7163;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lufa;")
    private class625 field7167;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field7166 = 1401;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Luc;")
    public static class27 field7178 = new class27(80, 7);

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field7188 = 50;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "[I")
    public static int[] field7187 = new int[field7188];

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "[I")
    public static int[] field7195 = new int[field7188];

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "[I")
    public static int[] field7198 = new int[field7188];

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field7194 = new String[field7188];

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "[I")
    public static int[] field7185 = new int[field7188];

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "[I")
    public static int[] field7192 = new int[field7188];

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "[I")
    public static int[] field7191 = new int[field7188];

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "Lfc;")
    public static class235 field7186 = new class235(58, -1);

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Lfj;")
    private class601 field7182;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "Lfj;")
    private class601 field7201;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "Lwaa;")
    private class646 field7190;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Z")
    private boolean field7177;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
    public static int[] field7175;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "[I")
    public static int[] field7180;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[[Z")
    public static boolean[][] field7157;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 3)
    public final void method2910(int arg0) {
        field7159++;
        if (!this.field7177) {
            return;
        }
        if (this.field7167 != null) {
            int var2 = 16384;
            this.field7179.method1799(this.field7167, 127);
            this.field7179.method1780(this.field7158, arg0 - 14639);
            this.field7167.method3473(0, false);
            this.field7158.method3480((byte) -113, 0);
            if (this.field7181) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field7174, this.field7160, 0, 0, this.field7174, this.field7160, var2, 9728);
            this.field7179.method1820(false, this.field7167);
            this.field7179.method1756(this.field7158, 3);
        }
        this.field7179.method1808(-99);
        this.field7179.method1768(0, -105);
        this.field7179.method1801(1, arg0 ^ 0xFF59);
        this.field7179.method449();
        int var3 = 0;
        int var4 = 1;
        class65 var6;
        for (class65 var5 = (class65) this.field7165.method1270((byte) -25); var5 != null; var5 = var6) {
            var6 = (class65) this.field7165.method1282(0);
            int var7 = var5.method525(74);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method531(this.field7190, (byte) 125, this.field7193[var3], var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field7179.method1785(this.field7158, (byte) -1);
                    this.field7179.method1813(0, 0, (byte) 112);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7160);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7171, this.field7172);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7171, this.field7172 + this.field7160);
                    OpenGL.glTexCoord2f((float) this.field7174, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7171 + this.field7174, this.field7172 - -this.field7160);
                    OpenGL.glTexCoord2f((float) this.field7174, (float) this.field7160);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7174 + this.field7171, this.field7172);
                    OpenGL.glEnd();
                } else {
                    this.field7158.method3480((byte) -64, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7160);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field7160);
                    OpenGL.glTexCoord2f((float) this.field7174, (float) this.field7160);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7174, this.field7160);
                    OpenGL.glTexCoord2f((float) this.field7174, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7174, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method527(var8, (byte) 6);
                var3 = var3 + 1 & 0x1;
            }
        }
        if (arg0 == 31279) {
            this.field7177 = false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILoi;)Z", line = 112)
    public final boolean method2911(int arg0, class65 arg1) {
        field7162++;
        if (arg0 != 3125) {
            this.method2914(70);
        }
        if (this.field7163 != null) {
            if (arg1.method522(true) || arg1.method529(arg0 ^ 0x842F)) {
                this.field7165.method1273(arg1, (byte) 122);
                this.method2914(6638);
                if (this.method2920(6208)) {
                    if (this.field7174 != -1 && this.field7160 != -1) {
                        arg1.method526(false, this.field7160, this.field7174);
                    }
                    arg1.field857 = true;
                    return true;
                }
            }
            this.method2918(arg1, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIBI)Z", line = 154)
    public final boolean method2912(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7168++;
        if (this.field7163 == null || this.field7165.method1274((byte) 110)) {
            return false;
        }
        if (this.field7174 != arg0 || this.field7160 != arg2) {
            this.field7160 = arg2;
            this.field7174 = arg0;
            for (class539 var6 = this.field7165.method1270((byte) -25); var6 != this.field7165.field2826; var6 = var6.field7315) {
                ((class65) var6).method526(false, this.field7160, this.field7174);
            }
            this.field7189 = true;
            this.field7196 = true;
            this.field7197 = true;
        }
        if (!this.method2920(6208)) {
            if (arg3 != -14) {
                this.field7158 = null;
            }
            return false;
        }
        this.field7171 = arg1;
        this.field7177 = true;
        this.field7172 = arg4;
        this.field7179.method1817(this.field7163, false);
        this.field7163.method3480((byte) -84, 0);
        this.field7179.method1813(this.field7172 + this.field7160 - this.field7179.field4036, -this.field7171, (byte) 78);
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Len;)V", line = 714)
    public class525(class289 arg0) {
        this.field7179 = arg0;
        if (this.field7179.field4252 && this.field7179.field4335) {
            this.field7163 = this.field7158 = new class625(this.field7179);
            if (this.field7179.field4215 > 1 && this.field7179.field4263 && this.field7179.field4345) {
                this.field7163 = this.field7167 = new class625(this.field7179);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Z", line = 205)
    public final boolean method2913(byte arg0) {
        field7164++;
        if (arg0 != -82) {
            method2917(-46, 98, -18, false, -62, -93);
        }
        return this.field7163 != null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 229)
    private final void method2914(int arg0) {
        field7161++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 6638) {
            this.method2916(101);
        }
        for (class65 var5 = (class65) this.field7165.method1270((byte) -25); var5 != null; var5 = (class65) this.field7165.method1282(0)) {
            int var9 = var5.method530(false);
            var4 += var5.method525(arg0 - 6547);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method534((byte) 125);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field7184 != var6) {
            this.field7184 = var6;
            this.field7197 = true;
        }
        int var7 = this.field7199 > 2 ? 2 : this.field7199;
        int var8 = var4 > 2 ? 2 : var4;
        this.field7199 = var4;
        if (var7 != var8) {
            this.field7189 = this.field7197 = true;
        }
        if (var2 != this.field7181) {
            this.field7181 = var2;
            this.field7196 = true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 291)
    public static void method2915(byte arg0) {
        field7191 = null;
        field7194 = null;
        field7185 = null;
        field7178 = null;
        field7192 = null;
        field7186 = null;
        field7180 = null;
        field7195 = null;
        field7187 = null;
        field7157 = null;
        field7175 = null;
        field7198 = null;
        if (arg0 != 84) {
            field7185 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 312)
    public final void method2916(int arg0) {
        field7200++;
        if (arg0 < 1) {
            this.field7160 = 52;
        }
        this.field7193 = null;
        this.field7201 = null;
        this.field7190 = null;
        this.field7163 = this.field7167 = this.field7158 = null;
        this.field7182 = null;
        if (!this.field7165.method1274((byte) 117)) {
            for (class539 var2 = this.field7165.method1270((byte) -25); var2 != this.field7165.field2826; var2 = var2.field7315) {
                ((class65) var2).method528((byte) 17);
            }
        }
        this.field7174 = this.field7160 = 1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIZII)V", line = 348)
    public static final void method2917(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field7170++;
        if (class164.field2504 != null && (arg5 != 3 || class274.field3872.field912 != arg0 || class274.field3872.field886 != arg4)) {
            class439.method2516(false, class164.field2504, class503.field6878);
            class164.field2504 = null;
        }
        if (arg5 == 3 && class164.field2504 == null) {
            class164.field2504 = class376.method2189(class503.field6878, 0, arg4, arg0, -6007, 0);
            if (class164.field2504 != null) {
                class274.field3872.field912 = arg0;
                class274.field3872.field886 = arg4;
                class274.field3872.method2439(arg2 - 1, class503.field6878);
            }
        }
        if (arg5 == 3 && class164.field2504 == null) {
            method2917(-1, arg1, -1, true, -1, class274.field3872.field917);
            return;
        }
        Container var7;
        if (class164.field2504 != null) {
            class693.field9716 = arg4;
            var7 = class164.field2504;
            class43.field650 = arg0;
        } else if (class166.field2513 == null) {
            if (class188.field2779 == null) {
                var7 = class374.field5299;
            } else {
                var7 = class188.field2779;
            }
            class43.field650 = var7.getSize().width;
            class693.field9716 = var7.getSize().height;
        } else {
            Insets var6 = class166.field2513.getInsets();
            int var10001 = -var6.right;
            class43.field650 = class166.field2513.getSize().width + var10001 - var6.left;
            class693.field9716 = class166.field2513.getSize().height - var6.top - var6.bottom;
            var7 = class166.field2513;
        }
        if (arg5 == 1) {
            class486.field6753 = (class43.field650 - class652.field9217) / 2;
            class547.field7412 = class652.field9217;
            class124.field1711 = class603.field8386;
            class508.field6968 = 0;
        } else {
            class328.method1993((byte) -10);
        }
        if (class500.field6862 != class112.field1530) {
            boolean var10000;
            if (class547.field7412 < 1024 && class124.field1711 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class136.method972(false);
        } else {
            class105.field1413.setSize(class547.field7412, class124.field1711);
            class630.field8790.method395(class105.field1413);
            if (class166.field2513 == var7) {
                Insets var8 = class166.field2513.getInsets();
                class105.field1413.setLocation(var8.left + class486.field6753, class508.field6968 + var8.top);
            } else {
                class105.field1413.setLocation(class486.field6753, class508.field6968);
            }
        }
        if (arg5 >= 2) {
            class199.field2943 = true;
        } else {
            class199.field2943 = false;
        }
        if (class677.field9551 != arg2) {
            class22.method112(true, 95);
        }
        if (class53.field758 != null && class601.method3330(-37, class340.field4947)) {
            class614.method3400((byte) 110);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class287.field3996[var9] = true;
        }
        class192.field2835 = true;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Loi;I)V", line = 475)
    public final void method2918(class65 arg0, int arg1) {
        field7169++;
        arg0.field857 = false;
        arg0.method528((byte) 17);
        arg0.method2971(1);
        this.method2914(6638);
        if (arg1 != 0) {
            this.method2910(-42);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Lrq;", line = 489)
    public static final class319 method2919(int arg0, int arg1) {
        if (arg0 != 0) {
            method2915((byte) -108);
        }
        field7173++;
        return arg1 >= 0 && arg1 < 100 ? class130.field1786[arg1] : null;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z", line = 505)
    private final boolean method2920(int arg0) {
        if (this.field7196) {
            if (this.field7182 != null) {
                this.field7182.method3333((byte) 126);
                this.field7182 = null;
            }
            if (this.field7190 != null) {
                this.field7190.method3292(arg0 ^ 0x1840);
                this.field7190 = null;
            }
            if (this.field7167 != null) {
                this.field7182 = new class601(this.field7179, 6402, this.field7174, this.field7160, this.field7179.field4215);
            }
            if (this.field7181) {
                this.field7190 = new class646(this.field7179, 34037, 6402, this.field7174, this.field7160);
            } else if (this.field7182 == null) {
                this.field7182 = new class601(this.field7179, 6402, this.field7174, this.field7160);
            }
            this.field7189 = true;
            this.field7183 = true;
            this.field7196 = false;
        }
        field7176++;
        if (arg0 != 6208) {
            this.field7158 = null;
        }
        if (this.field7197) {
            if (this.field7201 != null) {
                this.field7201.method3333((byte) -37);
                this.field7201 = null;
            }
            if (this.field7193[0] != null) {
                this.field7193[0].method3292(0);
                this.field7193[0] = null;
            }
            if (this.field7193[1] != null) {
                this.field7193[1].method3292(arg0 ^ 0x1840);
                this.field7193[1] = null;
            }
            if (this.field7167 != null) {
                this.field7201 = new class601(this.field7179, this.field7184, this.field7174, this.field7160, this.field7179.field4215);
            }
            this.field7193[0] = new class646(this.field7179, 34037, this.field7184, this.field7174, this.field7160);
            this.field7193[1] = this.field7199 <= 1 ? null : new class646(this.field7179, 34037, this.field7184, this.field7174, this.field7160);
            this.field7189 = true;
            this.field7197 = false;
            this.field7183 = true;
        }
        if (this.field7189) {
            if (this.field7167 == null) {
                this.field7179.method1817(this.field7158, false);
                this.field7158.method3469((byte) 117, 0);
                this.field7158.method3469((byte) 95, 1);
                this.field7158.method3469((byte) -51, 8);
                this.field7158.method3477(this.field7193[0], (byte) -6, 0);
                if (this.field7199 > 1) {
                    this.field7158.method3477(this.field7193[1], (byte) -6, 1);
                }
                if (this.field7181) {
                    this.field7158.method3477(this.field7190, (byte) -6, 8);
                } else {
                    this.field7158.method3476(8, this.field7182, -91);
                }
                this.field7179.method1785(this.field7158, (byte) -1);
            } else {
                this.field7179.method1817(this.field7158, false);
                this.field7158.method3469((byte) -76, 0);
                this.field7158.method3469((byte) 65, 1);
                this.field7158.method3469((byte) 65, 8);
                this.field7158.method3477(this.field7193[0], (byte) -6, 0);
                if (this.field7199 > 1) {
                    this.field7158.method3477(this.field7193[1], (byte) -6, 1);
                }
                if (this.field7181) {
                    this.field7158.method3477(this.field7190, (byte) -6, 8);
                }
                this.field7179.method1785(this.field7158, (byte) -1);
                this.field7179.method1817(this.field7167, false);
                this.field7167.method3469((byte) -33, 0);
                this.field7167.method3469((byte) -37, 8);
                this.field7167.method3476(0, this.field7201, 85);
                this.field7167.method3476(8, this.field7182, -91);
                this.field7179.method1785(this.field7167, (byte) -1);
            }
            this.field7189 = false;
            this.field7183 = true;
        }
        if (this.field7183) {
            this.field7179.method1817(this.field7163, false);
            this.field7183 = !this.field7163.method3475(28296);
            this.field7179.method1785(this.field7163, (byte) -1);
        }
        return !this.field7183;
    }
}
