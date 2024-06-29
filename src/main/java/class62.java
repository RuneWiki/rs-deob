import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class62 {

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    private int field963 = 1;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    private int field965 = 0;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    private int field970 = 1;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    private int field972 = 0;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Lnj;")
    private class317 field976 = new class317();

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    private int field984 = -1;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    private int field982 = 0;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Z")
    private boolean field981 = true;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "Z")
    private boolean field985 = false;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "[Lsa;")
    private class532[] field989 = new class532[2];

    @OriginalMember(owner = "client!je", name = "F", descriptor = "Z")
    private boolean field987 = true;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Z")
    private boolean field988 = true;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Z")
    private boolean field990 = true;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lna;")
    private class211 field979;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Ldg;")
    private class146 field964;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Ldg;")
    private class146 field974;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Ldg;")
    private class146 field969;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lo;")
    public static class139 field973;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Lsa;")
    private class532 field983;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Ltr;")
    private class85 field980;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Ltr;")
    private class85 field986;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
    private boolean field968;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final void method455(int arg0) {
        this.field974 = this.field969 = this.field964 = null;
        field960++;
        if (arg0 <= 111) {
            return;
        }
        this.field989 = null;
        this.field986 = null;
        this.field980 = null;
        this.field983 = null;
        if (!this.field976.method2122(-12191)) {
            for (class529 var2 = this.field976.method2123(-62); var2 != this.field976.field4939; var2 = var2.field7779) {
                ((class357) var2).method2359((byte) -104);
            }
        }
        this.field970 = this.field963 = 1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILqc;)V")
    public static final void method456(int arg0, class140 arg1) {
        field977++;
        if (class409.field6204) {
            return;
        }
        arg1.method3149(124);
        class501.field7514--;
        if (arg0 > -53) {
            method467(98);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static final void method457(int arg0) {
        field971++;
        if (class135.field1824 < 1024.0F) {
            class135.field1824 = 1024.0F;
        }
        while (class388.field5918 >= 16384.0F) {
            class388.field5918 -= 16384.0F;
        }
        if (class135.field1824 > 3072.0F) {
            class135.field1824 = 3072.0F;
        }
        while (class388.field5918 < 0.0F) {
            class388.field5918 += 16384.0F;
        }
        int var1 = class290.field4578 >> 7;
        int var2 = class254.field4115 >> 7;
        int var3 = class532.method3165(class201.field3057, class290.field4578, false, class254.field4115);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class135.field1839 - 4) > var1 && var2 < class197.field3038 - 4) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class201.field3057;
                    if (var7 < 3 && class303.method2041(var6, var5, (byte) 101)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class196.field3035.field7003 != null && class196.field3035.field7003[var7] != null) {
                        var8 = (class196.field3035.field7003[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class53.field732[var7].method688(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (arg0 != 3047) {
            return;
        }
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class204.field3124) {
            class204.field3124 += (var10 - class204.field3124) / 24;
        } else if (var10 < class204.field3124) {
            class204.field3124 += (var10 - class204.field3124) / 80;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z")
    private final boolean method458(byte arg0) {
        if (this.field987) {
            if (this.field980 != null) {
                this.field980.method593((byte) 107);
                this.field980 = null;
            }
            if (this.field983 != null) {
                this.field983.method2698(0);
                this.field983 = null;
            }
            if (this.field969 != null) {
                this.field980 = new class85(this.field979, 6402, this.field970, this.field963, this.field979.field3470);
            }
            if (this.field985) {
                this.field983 = new class532(this.field979, 34037, 6402, this.field970, this.field963);
            } else if (this.field980 == null) {
                this.field980 = new class85(this.field979, 6402, this.field970, this.field963);
            }
            this.field990 = true;
            this.field987 = false;
            this.field988 = true;
        }
        if (arg0 > -4) {
            this.method460(8, null);
        }
        field957++;
        if (this.field981) {
            if (this.field986 != null) {
                this.field986.method593((byte) 19);
                this.field986 = null;
            }
            if (this.field989[0] != null) {
                this.field989[0].method2698(0);
                this.field989[0] = null;
            }
            if (this.field989[1] != null) {
                this.field989[1].method2698(0);
                this.field989[1] = null;
            }
            if (this.field969 != null) {
                this.field986 = new class85(this.field979, this.field984, this.field970, this.field963, this.field979.field3470);
            }
            this.field989[0] = new class532(this.field979, 34037, this.field984, this.field970, this.field963);
            this.field989[1] = this.field982 <= 1 ? null : new class532(this.field979, 34037, this.field984, this.field970, this.field963);
            this.field988 = true;
            this.field990 = true;
            this.field981 = false;
        }
        if (this.field988) {
            if (this.field969 == null) {
                this.field979.method1522(true, this.field964);
                this.field964.method880(1675886592, 0);
                this.field964.method880(1675886592, 1);
                this.field964.method880(1675886592, 8);
                this.field964.method879(this.field989[0], 0, true);
                if (this.field982 > 1) {
                    this.field964.method879(this.field989[1], 1, true);
                }
                if (this.field985) {
                    this.field964.method879(this.field983, 8, true);
                } else {
                    this.field964.method881(8, (byte) -113, this.field980);
                }
                this.field979.method1503(8, this.field964);
            } else {
                this.field979.method1522(true, this.field964);
                this.field964.method880(1675886592, 0);
                this.field964.method880(1675886592, 1);
                this.field964.method880(1675886592, 8);
                this.field964.method879(this.field989[0], 0, true);
                if (this.field982 > 1) {
                    this.field964.method879(this.field989[1], 1, true);
                }
                if (this.field985) {
                    this.field964.method879(this.field983, 8, true);
                }
                this.field979.method1503(8, this.field964);
                this.field979.method1522(true, this.field969);
                this.field969.method880(1675886592, 0);
                this.field969.method880(1675886592, 8);
                this.field969.method881(0, (byte) -124, this.field986);
                this.field969.method881(8, (byte) -104, this.field980);
                this.field979.method1503(8, this.field969);
            }
            this.field988 = false;
            this.field990 = true;
        }
        if (this.field990) {
            this.field979.method1522(true, this.field974);
            this.field990 = !this.field974.method888(18274);
            this.field979.method1503(8, this.field974);
        }
        return !this.field990;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)V")
    public static final void method459(int arg0, int arg1, byte arg2) {
        field959++;
        if (class516.field7674 == class261.field4216) {
            if (class83.method585(arg0, 0, 1, arg1, -2, (byte) -82, 0, 1, false)) {
                return;
            }
            class83.method585(arg0, 0, 1, arg1, -3, (byte) -82, 0, 1, false);
        } else if (class83.method585(arg0, 0, 1, arg1, -3, (byte) -82, 0, 1, false)) {
            return;
        } else {
            class83.method585(arg0, 0, 1, arg1, -2, (byte) -82, 0, 1, false);
        }
        if (arg2 <= 66) {
            field973 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILuf;)Z")
    public final boolean method460(int arg0, class357 arg1) {
        field978++;
        if (this.field974 != null) {
            if (arg1.method2365(7) || arg1.method2367(256)) {
                this.field976.method2124(arg1, (byte) -46);
                this.method464((byte) -112);
                if (this.method458((byte) -83)) {
                    if (this.field970 != -1 && this.field963 != -1) {
                        arg1.method2361(this.field970, this.field963, true);
                    }
                    arg1.field5541 = true;
                    return true;
                }
            }
            this.method466(arg1, 2);
        }
        int var3 = 121 % ((arg0 - 16) / 52);
        return false;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static final void method461(int arg0) {
        if (class425.field6440 == null || class237.field3882 == null) {
            class237.field3882 = new int[256];
            class425.field6440 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class425.field6440[var1] = (int) (Math.sin(var3) * 4096.0D);
                class237.field3882[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        int var2 = -100 / ((arg0 - 12) / 34);
        field958++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZIII)Z")
    public final boolean method462(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field975++;
        if (this.field974 == null || this.field976.method2122(-12191)) {
            return false;
        }
        if (this.field970 != arg3 || this.field963 != arg4) {
            this.field970 = arg3;
            this.field963 = arg4;
            for (class529 var6 = this.field976.method2123(-83); var6 != this.field976.field4939; var6 = var6.field7779) {
                ((class357) var6).method2361(this.field970, this.field963, true);
            }
            this.field988 = true;
            this.field981 = true;
            this.field987 = true;
        }
        if (this.method458((byte) -80)) {
            this.field972 = arg0;
            this.field968 = true;
            this.field965 = arg2;
            this.field979.method1522(true, this.field974);
            this.field974.method877(28154, 0);
            this.field979.method1560(this.field963 - this.field974.method882((byte) -64) - this.field965, -this.field972, -29807);
            return true;
        } else if (arg1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)Z")
    public final boolean method463(int arg0) {
        if (arg0 >= -36) {
            return false;
        } else {
            field962++;
            return this.field974 != null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    private final void method464(byte arg0) {
        field967++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class357 var5 = (class357) this.field976.method2123(-88); var5 != null; var5 = (class357) this.field976.method2126((byte) 61)) {
            int var9 = var5.method2371(0);
            var4 += var5.method2366(-24966);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method2368(1);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (arg0 > -74) {
            this.field988 = false;
        }
        if (this.field984 != var6) {
            this.field984 = var6;
            this.field981 = true;
        }
        int var7 = this.field982 <= 2 ? this.field982 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field988 = this.field981 = true;
        }
        if (var2 != this.field985) {
            this.field987 = true;
            this.field985 = var2;
        }
        this.field982 = var4;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
    public final void method465(byte arg0) {
        field966++;
        if (!this.field968) {
            return;
        }
        if (this.field969 != null) {
            this.field979.method1565(this.field969, -124);
            int var2 = 16384;
            this.field979.method1506(-106, this.field964);
            this.field969.method890(0, 0);
            this.field964.method877(28154, 0);
            if (this.field985) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field970, this.field963, 0, 0, this.field970, this.field963, var2, 9728);
            this.field979.method1515((byte) -109, this.field969);
            this.field979.method1538((byte) 79, this.field964);
        }
        this.field979.method1529(34166);
        this.field979.method1566((byte) 95, 0);
        this.field979.method1494(1, -25951);
        this.field979.method1228();
        int var3 = 0;
        int var4 = 1;
        class357 var6;
        for (class357 var5 = (class357) this.field976.method2123(123); var5 != null; var5 = var6) {
            var6 = (class357) this.field976.method2126((byte) 61);
            int var7 = var5.method2366(-24966);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2364(var8, this.field989[var3], false, this.field983);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field979.method1503(8, this.field964);
                    this.field979.method1560(0, 0, -29807);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field963);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field972, this.field965);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field972, this.field965 + this.field963);
                    OpenGL.glTexCoord2f((float) this.field970, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field972 + this.field970, this.field965 + this.field963);
                    OpenGL.glTexCoord2f((float) this.field970, (float) this.field963);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field972 + this.field970, this.field965);
                    OpenGL.glEnd();
                } else {
                    this.field964.method877(28154, -(-var4));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field963);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field963);
                    OpenGL.glTexCoord2f((float) this.field970, (float) this.field963);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field970, this.field963);
                    OpenGL.glTexCoord2f((float) this.field970, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field970, 0);
                    OpenGL.glEnd();
                }
                var5.method2372((byte) 88, var8);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field968 = false;
        if (arg0 > -19) {
            this.field972 = -37;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Luf;I)V")
    public final void method466(class357 arg0, int arg1) {
        field961++;
        arg0.field5541 = false;
        arg0.method2359((byte) 83);
        if (arg1 != 2) {
            this.method460(1, null);
        }
        arg0.method3149(arg1 ^ 0x60);
        this.method464((byte) -127);
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public static void method467(int arg0) {
        field973 = null;
        if (arg0 < 98) {
            field973 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lna;)V")
    public class62(class211 arg0) {
        this.field979 = arg0;
        if (this.field979.field3529 && this.field979.field3549) {
            this.field974 = this.field964 = new class146(this.field979);
            if (this.field979.field3470 > 1 && this.field979.field3518 && this.field979.field3531) {
                this.field974 = this.field969 = new class146(this.field979);
                return;
            }
        }
    }
}
