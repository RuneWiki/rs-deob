import jaggl.OpenGL;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class57 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    private int field989 = 1;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    private int field988 = 0;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    private int field1001 = 0;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field1003 = 1;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lug;")
    private class392 field1004 = new class392();

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Z")
    private boolean field1011 = true;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    private int field1014 = 0;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Z")
    private boolean field1013 = true;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    private int field1017 = -1;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "[Lmf;")
    private class286[] field1012 = new class286[2];

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "Z")
    private boolean field1018 = true;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "Z")
    private boolean field1016 = true;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Z")
    private boolean field1020 = false;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lvj;")
    private class303 field990;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Lvh;")
    private class240 field1006;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lvh;")
    private class240 field995;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lvh;")
    private class240 field991;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field997 = 1;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Lbu;")
    public static class17 field1008;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Lmf;")
    private class286 field1015;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Lip;")
    private class497 field1010;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Lip;")
    private class497 field1019;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Z")
    private boolean field987;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public static int[] field1002;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Z")
    public final boolean method504(int arg0) {
        int var2 = -77 / ((-arg0 - 51) / 57);
        field998++;
        return this.field995 != null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method505(int arg0) {
        field1005++;
        this.field1015 = null;
        this.field1010 = null;
        this.field1019 = null;
        if (arg0 >= -108) {
            return;
        }
        this.field1012 = null;
        this.field995 = this.field991 = this.field1006 = null;
        if (!this.field1004.method2430(-1)) {
            for (class320 var2 = this.field1004.method2427(119); var2 != this.field1004.field5929; var2 = var2.field4901) {
                ((class345) var2).method570(1);
            }
        }
        this.field989 = this.field1003 = 1;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public final void method506(int arg0) {
        field993++;
        if (!this.field987) {
            return;
        }
        if (this.field991 != null) {
            this.field990.method1935(-1, this.field991);
            int var2 = 16384;
            this.field990.method1924((byte) -108, this.field1006);
            this.field991.method1566((byte) 94, 0);
            this.field1006.method1575(0, 2);
            if (this.field1020) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field989, this.field1003, 0, 0, this.field989, this.field1003, var2, 9728);
            this.field990.method1960(4, this.field991);
            this.field990.method1923(this.field1006, -5831);
        }
        this.field990.method1930((byte) 117);
        this.field990.method1934(arg0, true);
        this.field990.method1989(-24145, 1);
        this.field990.method258();
        int var3 = 0;
        int var4 = 1;
        class345 var6;
        for (class345 var5 = (class345) this.field1004.method2427(arg0 + 117); var5 != null; var5 = var6) {
            var6 = (class345) this.field1004.method2422(-127);
            int var7 = var5.method2195(1);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method572(124, this.field1015, this.field1012[var3], var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field990.method1916(this.field1006, arg0 ^ 0x6C);
                    this.field990.method1959(0, 0, (byte) 45);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1003);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field988, this.field1001);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field988, this.field1003 + this.field1001);
                    OpenGL.glTexCoord2f((float) this.field989, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field989 + this.field988, this.field1003 + this.field1001);
                    OpenGL.glTexCoord2f((float) this.field989, (float) this.field1003);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field988 + this.field989, this.field1001);
                    OpenGL.glEnd();
                } else {
                    this.field1006.method1575(var4, arg0 + 2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1003);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field1003);
                    OpenGL.glTexCoord2f((float) this.field989, (float) this.field1003);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field989, this.field1003);
                    OpenGL.glTexCoord2f((float) this.field989, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field989, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method578(var8, 1);
            }
        }
        this.field987 = false;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)Z")
    public final boolean method507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field999++;
        if (this.field995 == null || this.field1004.method2430(-1)) {
            return false;
        } else if (arg4 <= 45) {
            return true;
        } else {
            if (this.field989 != arg3 || this.field1003 != arg0) {
                this.field989 = arg3;
                this.field1003 = arg0;
                for (class320 var6 = this.field1004.method2427(109); var6 != this.field1004.field5929; var6 = var6.field4901) {
                    ((class345) var6).method574(this.field1003, 437, this.field989);
                }
                this.field1016 = true;
                this.field1018 = true;
                this.field1013 = true;
            }
            if (!this.method510((byte) 120)) {
                return false;
            }
            this.field988 = arg2;
            this.field1001 = arg1;
            this.field987 = true;
            this.field990.method1945(this.field995, false);
            this.field995.method1575(0, 2);
            this.field990.method1959(this.field1003 - (this.field995.method1561((byte) 127) + this.field1001), -this.field988, (byte) 45);
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    public static final void method508(int arg0) {
        field996++;
        int var1 = class236.field3422 * 128 + 64;
        int var2 = class403.field6053 * 128 + 64;
        int var3 = class343.method2188(class163.field2525, var1, (byte) -102, var2) - class302.field4285;
        if (class98.field1631 >= 100) {
            class40.field732 = class236.field3422 * 128 + 64;
            class405.field6075 = class403.field6053 * 128 + 64;
            class222.field3184 = class343.method2188(class163.field2525, class40.field732, (byte) -102, class405.field6075) - class302.field4285;
        } else {
            if (var1 > class40.field732) {
                class40.field732 += (var1 - class40.field732) * class98.field1631 / 1000 + class516.field7587;
                if (var1 < class40.field732) {
                    class40.field732 = var1;
                }
            }
            if (class222.field3184 < var3) {
                class222.field3184 += (var3 - class222.field3184) * class98.field1631 / 1000 + class516.field7587;
                if (var3 < class222.field3184) {
                    class222.field3184 = var3;
                }
            }
            if (var1 < class40.field732) {
                class40.field732 -= (class40.field732 - var1) * class98.field1631 / 1000 + class516.field7587;
                if (var1 > class40.field732) {
                    class40.field732 = var1;
                }
            }
            if (var3 < class222.field3184) {
                class222.field3184 -= class516.field7587 + ((class222.field3184 - var3) * class98.field1631 / 1000);
                if (var3 > class222.field3184) {
                    class222.field3184 = var3;
                }
            }
            if (var2 > class405.field6075) {
                class405.field6075 += class516.field7587 + ((var2 - class405.field6075) * class98.field1631 / 1000);
                if (var2 < class405.field6075) {
                    class405.field6075 = var2;
                }
            }
            if (class405.field6075 > var2) {
                class405.field6075 -= (class405.field6075 - var2) * class98.field1631 / 1000 + class516.field7587;
                if (var2 > class405.field6075) {
                    class405.field6075 = var2;
                }
            }
        }
        int var4 = class184.field2758 * 128 + 64;
        int var5 = class420.field6283 * 128 + 64;
        int var6 = class343.method2188(class163.field2525, var5, (byte) -102, var4) - class152.field2416;
        int var7 = var5 - class40.field732;
        int var8 = var6 - class222.field3184;
        int var9 = var4 - class405.field6075;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class122.field1982) {
            class122.field1982 += (var11 - class122.field1982 >> 3) * class255.field3660 / 1000 + class236.field3423 << 3;
            if (class122.field1982 > var11) {
                class122.field1982 = var11;
            }
        }
        if (var11 < class122.field1982) {
            class122.field1982 -= (class122.field1982 - var11 >> 3) * class255.field3660 / 1000 + class236.field3423 << 3;
            if (var11 > class122.field1982) {
                class122.field1982 = var11;
            }
        }
        int var13 = var12 - class291.field4148;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (arg0 < 104) {
            return;
        }
        if (var14 > 0) {
            class291.field4148 += class255.field3660 * var14 / 1000 + class236.field3423 << 3;
            class291.field4148 &= 0x3FFF;
        }
        if (var14 < 0) {
            class291.field4148 -= -var14 * class255.field3660 / 1000 + class236.field3423 << 3;
            class291.field4148 &= 0x3FFF;
        }
        int var15 = var12 - class291.field4148;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class291.field4148 = var12;
        }
        class291.field4137 = 0;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    private final void method509(int arg0) {
        field1007++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class345 var5 = (class345) this.field1004.method2427(123); var5 != null; var5 = (class345) this.field1004.method2422(-101)) {
            int var9 = var5.method573(18433);
            var4 += var5.method2195(arg0 - 6407);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method2192((byte) -3);
        }
        if (arg0 != 6408) {
            method511(false);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1017 != var6) {
            this.field1017 = var6;
            this.field1016 = true;
        }
        int var7 = this.field1014 > 2 ? 2 : this.field1014;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field1014 = var4;
        if (var2 != this.field1020) {
            this.field1020 = var2;
            this.field1013 = true;
        }
        if (var7 != var8) {
            this.field1018 = this.field1016 = true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)Z")
    private final boolean method510(byte arg0) {
        field1009++;
        if (this.field1013) {
            if (this.field1010 != null) {
                this.field1010.method2980(0);
                this.field1010 = null;
            }
            if (this.field1015 != null) {
                this.field1015.method2931(122);
                this.field1015 = null;
            }
            if (this.field991 != null) {
                this.field1010 = new class497(this.field990, 6402, this.field989, this.field1003, this.field990.field4482);
            }
            if (this.field1020) {
                this.field1015 = new class286(this.field990, 34037, 6402, this.field989, this.field1003);
            } else if (this.field1010 == null) {
                this.field1010 = new class497(this.field990, 6402, this.field989, this.field1003);
            }
            this.field1018 = true;
            this.field1013 = false;
            this.field1011 = true;
        }
        if (this.field1016) {
            if (this.field1019 != null) {
                this.field1019.method2980(0);
                this.field1019 = null;
            }
            if (this.field1012[0] != null) {
                this.field1012[0].method2931(112);
                this.field1012[0] = null;
            }
            if (this.field1012[1] != null) {
                this.field1012[1].method2931(122);
                this.field1012[1] = null;
            }
            if (this.field991 != null) {
                this.field1019 = new class497(this.field990, this.field1017, this.field989, this.field1003, this.field990.field4482);
            }
            this.field1012[0] = new class286(this.field990, 34037, this.field1017, this.field989, this.field1003);
            this.field1012[1] = this.field1014 > 1 ? new class286(this.field990, 34037, this.field1017, this.field989, this.field1003) : null;
            this.field1018 = true;
            this.field1011 = true;
            this.field1016 = false;
        }
        int var2 = -46 / ((arg0 - 13) / 62);
        if (this.field1018) {
            if (this.field991 == null) {
                this.field990.method1945(this.field1006, false);
                this.field1006.method1564(0, 113);
                this.field1006.method1564(1, 87);
                this.field1006.method1564(8, 59);
                this.field1006.method1574(0, (byte) 109, this.field1012[0]);
                if (this.field1014 > 1) {
                    this.field1006.method1574(1, (byte) 101, this.field1012[1]);
                }
                if (this.field1020) {
                    this.field1006.method1574(8, (byte) 86, this.field1015);
                } else {
                    this.field1006.method1565(8, this.field1010, 0);
                }
                this.field990.method1916(this.field1006, 91);
            } else {
                this.field990.method1945(this.field1006, false);
                this.field1006.method1564(0, 105);
                this.field1006.method1564(1, 74);
                this.field1006.method1564(8, 125);
                this.field1006.method1574(0, (byte) 107, this.field1012[0]);
                if (this.field1014 > 1) {
                    this.field1006.method1574(1, (byte) 109, this.field1012[1]);
                }
                if (this.field1020) {
                    this.field1006.method1574(8, (byte) 89, this.field1015);
                }
                this.field990.method1916(this.field1006, 96);
                this.field990.method1945(this.field991, false);
                this.field991.method1564(0, 114);
                this.field991.method1564(8, 123);
                this.field991.method1565(0, this.field1019, 0);
                this.field991.method1565(8, this.field1010, 0);
                this.field990.method1916(this.field991, 92);
            }
            this.field1018 = false;
            this.field1011 = true;
        }
        if (this.field1011) {
            this.field990.method1945(this.field995, false);
            this.field1011 = !this.field995.method1567(-87);
            this.field990.method1916(this.field995, 97);
        }
        return !this.field1011;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static void method511(boolean arg0) {
        field1008 = null;
        field1002 = null;
        if (!arg0) {
            method514(null, null, 70);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILis;)V")
    public final void method512(int arg0, class345 arg1) {
        field986++;
        arg1.field5173 = false;
        arg1.method570(1);
        arg1.method2090(~arg0);
        if (arg0 == 0) {
            this.method509(6408);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLis;)Z")
    public final boolean method513(byte arg0, class345 arg1) {
        if (arg0 < 98) {
            this.method509(105);
        }
        field994++;
        if (this.field995 != null) {
            if (arg1.method577(35632) || arg1.method575((byte) 65)) {
                this.field1004.method2417(98, arg1);
                this.method509(6408);
                if (this.method510((byte) -63)) {
                    if (this.field989 != -1 && this.field1003 != -1) {
                        arg1.method574(this.field1003, 437, this.field989);
                    }
                    arg1.field5173 = true;
                    return true;
                }
            }
            this.method512(0, arg1);
        }
        return false;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/Object;Lli;I)V")
    public static final void method514(Object arg0, class293 arg1, int arg2) {
        field992++;
        if (arg1.field4180 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field4180.peekEvent() != null; var3++) {
            class71.method583(1L, -126);
        }
        if (arg2 != 1) {
            field1008 = null;
        }
        if (arg0 != null) {
            arg1.field4180.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lvj;)V")
    public class57(class303 arg0) {
        this.field990 = arg0;
        if (this.field990.field4532 && this.field990.field4538) {
            this.field995 = this.field1006 = new class240(this.field990);
            if (this.field990.field4482 > 1 && this.field990.field4533 && this.field990.field4521) {
                this.field995 = this.field991 = new class240(this.field990);
                return;
            }
        }
    }
}
