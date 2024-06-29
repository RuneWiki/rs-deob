import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class68 {

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    private int field981 = 0;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    private int field984 = 1;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    private int field991 = 0;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    private int field983 = 1;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Lwo;")
    private class522 field975 = new class522();

    @OriginalMember(owner = "client!er", name = "z", descriptor = "Z")
    private boolean field998 = false;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "Z")
    private boolean field1002 = true;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "I")
    private int field1000 = 0;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "[Lqv;")
    private class308[] field996 = new class308[2];

    @OriginalMember(owner = "client!er", name = "E", descriptor = "Z")
    private boolean field1003 = true;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    private int field1004 = -1;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "Z")
    private boolean field999 = true;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "Z")
    private boolean field1005 = true;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "Lht;")
    private class410 field993;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Llr;")
    private class527 field979;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Llr;")
    private class527 field974;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Llr;")
    private class527 field976;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Luf;")
    public static class310 field973 = new class310(29, 6);

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Ljava/lang/String;")
    public static String field982 = null;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "Lfg;")
    public static class83 field992 = new class83("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "Lqv;")
    private class308 field1001;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "Lgv;")
    public static class56 field987;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "Lps;")
    private class62 field994;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "Lps;")
    private class62 field997;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "Z")
    private boolean field990;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method421(int arg0) {
        this.field1001 = null;
        this.field997 = null;
        this.field994 = null;
        this.field996 = null;
        if (arg0 != 0) {
            this.field999 = false;
        }
        this.field974 = this.field976 = this.field979 = null;
        field985++;
        if (!this.field975.method3068(83)) {
            for (class499 var2 = this.field975.method3072((byte) 108); var2 != this.field975.field7697; var2 = var2.field7336) {
                ((class461) var2).method1468(false);
            }
        }
        this.field984 = this.field983 = 1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method422(byte arg0) {
        int var1 = 93 % ((-arg0 - 31) / 37);
        field973 = null;
        field987 = null;
        field992 = null;
        field982 = null;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public final void method423(int arg0) {
        field977++;
        if (!this.field990) {
            return;
        }
        if (this.field976 != null) {
            this.field993.method2415((byte) -122, this.field976);
            int var2 = 16384;
            this.field993.method2422(true, this.field979);
            this.field976.method3092(-1, 0);
            this.field979.method3099(0, -104);
            if (this.field998) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field984, this.field983, 0, 0, this.field984, this.field983, var2, 9728);
            this.field993.method2409(32718, this.field976);
            this.field993.method2367((byte) 21, this.field979);
        }
        this.field993.method2423(8448);
        this.field993.method2356((byte) -21, 0);
        this.field993.method2365(true, 1);
        this.field993.method526();
        int var3 = 0;
        int var4 = -37 / ((arg0 - 71) / 55);
        int var5 = 1;
        class461 var7;
        for (class461 var6 = (class461) this.field975.method3072((byte) 19); var6 != null; var6 = var7) {
            var7 = (class461) this.field975.method3066(2);
            int var8 = var6.method2712(5696);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method1463(var9, (byte) -96, this.field996[var3], this.field1001);
                if (var7 == null && var8 - 1 == var9) {
                    this.field993.method2425(this.field979, -81);
                    this.field993.method2429(0, (byte) 7, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field983);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field991, this.field981);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field991, this.field981 + this.field983);
                    OpenGL.glTexCoord2f((float) this.field984, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field991 + this.field984, this.field983 + this.field981);
                    OpenGL.glTexCoord2f((float) this.field984, (float) this.field983);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field991 + this.field984, this.field981);
                    OpenGL.glEnd();
                } else {
                    this.field979.method3099(var5, -108);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field983);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field983);
                    OpenGL.glTexCoord2f((float) this.field984, (float) this.field983);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field984, this.field983);
                    OpenGL.glTexCoord2f((float) this.field984, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field984, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var6.method1469(var9, (byte) -119);
                var5 = var5 + 1 & 0x1;
            }
        }
        this.field990 = false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)Z")
    public final boolean method424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field995++;
        if (this.field974 == null || this.field975.method3068(83)) {
            return false;
        }
        if (this.field984 != arg4 || this.field983 != arg2) {
            this.field983 = arg2;
            this.field984 = arg4;
            for (class499 var6 = this.field975.method3072((byte) 44); var6 != this.field975.field7697; var6 = var6.field7336) {
                ((class461) var6).method1467(arg1, this.field984, this.field983);
            }
            this.field1002 = true;
            this.field999 = true;
            this.field1003 = true;
        }
        if (!this.method426((byte) -28)) {
            if (arg1 != 0) {
                this.method429(111, null);
            }
            return false;
        }
        this.field991 = arg3;
        this.field990 = true;
        this.field981 = arg0;
        this.field993.method2434(40, this.field974);
        this.field974.method3099(0, 121);
        this.field993.method2429(-this.field991, (byte) 7, this.field983 - this.field974.method3098((byte) 92) - this.field981);
        return true;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        field978++;
        int var2 = 44 % ((22 - arg0) / 35);
        return this.field974 != null;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)Z")
    private final boolean method426(byte arg0) {
        if (this.field999) {
            if (this.field994 != null) {
                this.field994.method393(33);
                this.field994 = null;
            }
            if (this.field1001 != null) {
                this.field1001.method1131(100);
                this.field1001 = null;
            }
            if (this.field976 != null) {
                this.field994 = new class62(this.field993, 6402, this.field984, this.field983, this.field993.field5847);
            }
            if (this.field998) {
                this.field1001 = new class308(this.field993, 34037, 6402, this.field984, this.field983);
            } else if (this.field994 == null) {
                this.field994 = new class62(this.field993, 6402, this.field984, this.field983);
            }
            this.field999 = false;
            this.field1005 = true;
            this.field1002 = true;
        }
        field986++;
        if (arg0 > 0) {
            this.field983 = -57;
        }
        if (this.field1003) {
            if (this.field997 != null) {
                this.field997.method393(44);
                this.field997 = null;
            }
            if (this.field996[0] != null) {
                this.field996[0].method1131(100);
                this.field996[0] = null;
            }
            if (this.field996[1] != null) {
                this.field996[1].method1131(100);
                this.field996[1] = null;
            }
            if (this.field976 != null) {
                this.field997 = new class62(this.field993, this.field1004, this.field984, this.field983, this.field993.field5847);
            }
            this.field996[0] = new class308(this.field993, 34037, this.field1004, this.field984, this.field983);
            this.field996[1] = this.field1000 <= 1 ? null : new class308(this.field993, 34037, this.field1004, this.field984, this.field983);
            this.field1003 = false;
            this.field1005 = true;
            this.field1002 = true;
        }
        if (this.field1002) {
            if (this.field976 == null) {
                this.field993.method2434(-78, this.field979);
                this.field979.method3095(0, (byte) -17);
                this.field979.method3095(1, (byte) -17);
                this.field979.method3095(8, (byte) -17);
                this.field979.method3097(this.field996[0], 0, (byte) -128);
                if (this.field1000 > 1) {
                    this.field979.method3097(this.field996[1], 1, (byte) -124);
                }
                if (this.field998) {
                    this.field979.method3097(this.field1001, 8, (byte) -124);
                } else {
                    this.field979.method3090(0, this.field994, 8);
                }
                this.field993.method2425(this.field979, -107);
            } else {
                this.field993.method2434(-127, this.field979);
                this.field979.method3095(0, (byte) -17);
                this.field979.method3095(1, (byte) -17);
                this.field979.method3095(8, (byte) -17);
                this.field979.method3097(this.field996[0], 0, (byte) -126);
                if (this.field1000 > 1) {
                    this.field979.method3097(this.field996[1], 1, (byte) -128);
                }
                if (this.field998) {
                    this.field979.method3097(this.field1001, 8, (byte) -124);
                }
                this.field993.method2425(this.field979, 54);
                this.field993.method2434(48, this.field976);
                this.field976.method3095(0, (byte) -17);
                this.field976.method3095(8, (byte) -17);
                this.field976.method3090(0, this.field997, 0);
                this.field976.method3090(0, this.field994, 8);
                this.field993.method2425(this.field976, 86);
            }
            this.field1005 = true;
            this.field1002 = false;
        }
        if (this.field1005) {
            this.field993.method2434(9, this.field974);
            this.field1005 = !this.field974.method3096((byte) -86);
            this.field993.method2425(this.field974, 30);
        }
        return !this.field1005;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLfh;)V")
    public final void method427(byte arg0, class461 arg1) {
        field989++;
        if (arg0 != 107) {
            this.method424(-27, -56, -75, -32, -62);
        }
        arg1.field6708 = false;
        arg1.method1468(false);
        arg1.method2946(-117);
        this.method428((byte) -28);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
    private final void method428(byte arg0) {
        field980++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class461 var5 = (class461) this.field975.method3072((byte) 108); var5 != null; var5 = (class461) this.field975.method3066(2)) {
            int var9 = var5.method1461(26615);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method2712(5696);
            var2 |= var5.method2715(true);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1004 != var6) {
            this.field1003 = true;
            this.field1004 = var6;
        }
        int var7 = this.field1000 > 2 ? 2 : this.field1000;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field1002 = this.field1003 = true;
        }
        if (arg0 != -28) {
            return;
        }
        if (this.field998 != var2) {
            this.field998 = var2;
            this.field999 = true;
        }
        this.field1000 = var4;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILfh;)Z")
    public final boolean method429(int arg0, class461 arg1) {
        if (arg0 != -18461) {
            this.method421(45);
        }
        field988++;
        if (this.field974 != null) {
            if (arg1.method1466(arg0 + 21976) || arg1.method1464(arg0 + 18382)) {
                this.field975.method3070(arg1, (byte) -125);
                this.method428((byte) -28);
                if (this.method426((byte) -1)) {
                    if (this.field984 != -1 && this.field983 != -1) {
                        arg1.method1467(arg0 ^ 0xFFFFB7E3, this.field984, this.field983);
                    }
                    arg1.field6708 = true;
                    return true;
                }
            }
            this.method427((byte) 107, arg1);
        }
        return false;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lht;)V")
    public class68(class410 arg0) {
        this.field993 = arg0;
        if (this.field993.field5897 && this.field993.field5905) {
            this.field974 = this.field979 = new class527(this.field993);
            if (this.field993.field5847 > 1 && this.field993.field5901 && this.field993.field5956) {
                this.field974 = this.field976 = new class527(this.field993);
                return;
            }
        }
    }
}
