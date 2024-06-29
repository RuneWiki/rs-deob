import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class10 {

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    private int field136 = 0;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private int field132 = 0;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    private int field147 = 1;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    private int field150 = 1;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lvr;")
    private class306 field135 = new class306();

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Z")
    private boolean field155 = true;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "Z")
    private boolean field157 = false;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Z")
    private boolean field164 = true;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "Z")
    private boolean field166 = true;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Z")
    private boolean field161 = true;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    private int field162 = 0;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "[Lwg;")
    private class393[] field158 = new class393[2];

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    private int field167 = -1;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lbv;")
    private class282 field152;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lks;")
    private class317 field131;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lks;")
    private class317 field130;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lks;")
    private class317 field138;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lui;")
    public static class375 field134 = new class375("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lpg;")
    public static class492 field153;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field159;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Lwi;")
    public static class340 field165;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "Lpo;")
    private class252 field156;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "Lpo;")
    private class252 field160;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "Lwg;")
    private class393 field154;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Z")
    private boolean field139;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILmp;)Z")
    public final boolean method80(int arg0, class381 arg1) {
        if (arg0 <= 37) {
            return true;
        }
        field148++;
        if (this.field130 != null) {
            if (arg1.method1452(1) || arg1.method1451(0)) {
                this.field135.method1958(arg1, 0);
                this.method84((byte) -6);
                if (this.method90(false)) {
                    if (this.field147 != -1 && this.field150 != -1) {
                        arg1.method1447((byte) 81, this.field150, this.field147);
                    }
                    arg1.field5808 = true;
                    return true;
                }
            }
            this.method83(116, arg1);
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public final void method81(int arg0) {
        this.field158 = null;
        this.field154 = null;
        this.field160 = null;
        this.field156 = null;
        this.field130 = this.field138 = this.field131 = null;
        field145++;
        if (!this.field135.method1965(64)) {
            for (class467 var2 = this.field135.method1970(arg0 + 63); var2 != this.field135.field4498; var2 = var2.field6797) {
                ((class381) var2).method1446((byte) -60);
            }
        }
        this.field147 = this.field150 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static final void method82(byte arg0) {
        field146++;
        if (client.field935) {
            return;
        }
        client.field935 = true;
        int var1 = 30 % (-arg0 / 63);
        class314.field4804 = true;
        if (class96.field1399.field5229) {
            class99.field1428 = ((int) class99.field1428 - 17 & 0xFFFFFFF0);
        } else {
            class128.field1809 += (-class128.field1809 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(ILmp;)V")
    public final void method83(int arg0, class381 arg1) {
        field140++;
        arg1.field5808 = false;
        arg1.method1446((byte) -112);
        if (arg0 <= 71) {
            this.method80(77, null);
        }
        arg1.method2785((byte) -120);
        this.method84((byte) -6);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    private final void method84(byte arg0) {
        if (arg0 != -6) {
            method86(-89, null);
        }
        field133++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class381 var5 = (class381) this.field135.method1970(64); var5 != null; var5 = (class381) this.field135.method1960(24)) {
            int var9 = var5.method1454(1);
            var4 += var5.method2368(arg0 + 7);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method2365((byte) 38);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field167 != var6) {
            this.field161 = true;
            this.field167 = var6;
        }
        int var7 = this.field162 <= 2 ? this.field162 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field164 = this.field161 = true;
        }
        if (var2 != this.field157) {
            this.field157 = var2;
            this.field155 = true;
        }
        this.field162 = var4;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method85(int arg0) {
        field134 = null;
        field165 = null;
        int var1 = -17 / ((arg0 - 52) / 45);
        field159 = null;
        field153 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILap;)I")
    public static final int method86(int arg0, class337 arg1) {
        if (arg0 != 6402) {
            field149 = 8;
        }
        field143++;
        if (arg1.field5245 == 0) {
            return 0;
        }
        if (arg1.field5257 != -1) {
            class337 var2 = null;
            if (arg1.field5257 < 32768) {
                var2 = class151.field2174[arg1.field5257];
            } else if (arg1.field5257 >= 32768) {
                var2 = class439.field6539[arg1.field5257 - 32768];
            }
            if (var2 != null) {
                int var3 = arg1.field2217 - var2.field2217;
                int var4 = arg1.field2215 - var2.field2215;
                if (var3 != 0 || var4 != 0) {
                    arg1.method2173((byte) 85, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg1 instanceof class322)) {
            class322 var8 = (class322) arg1;
            if (var8.field4934 != -1 && (var8.field5343 == 0 || var8.field5342 > 0)) {
                var8.method2173((byte) 71, var8.field4934);
                var8.field4934 = -1;
            }
        } else if (arg1 instanceof class194) {
            class194 var5 = (class194) arg1;
            if (var5.field2747 != -1 && (var5.field5343 == 0 || var5.field5342 > 0)) {
                int var6 = var5.field2217 - ((var5.field2747 - (class82.field1105 + class82.field1105)) * 64);
                int var7 = var5.field2215 - ((var5.field2752 - class437.field6477 - class437.field6477) * 64);
                if (var6 != 0 || var7 != 0) {
                    var5.method2173((byte) 36, (int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D) & 0x3FFF);
                }
                var5.field2747 = -1;
            }
        }
        return arg1.method2174(-8513);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public static final int method87(int arg0, int arg1) {
        return class202.field2843 == null ? 0 : class202.field2843[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBII)Z")
    public final boolean method88(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 10) {
            this.method90(false);
        }
        field142++;
        if (this.field130 == null || this.field135.method1965(64)) {
            return false;
        }
        if (this.field147 != arg1 || this.field150 != arg4) {
            this.field147 = arg1;
            this.field150 = arg4;
            for (class467 var6 = this.field135.method1970(64); var6 != this.field135.field4498; var6 = var6.field6797) {
                ((class381) var6).method1447((byte) 81, this.field150, this.field147);
            }
            this.field164 = true;
            this.field161 = true;
            this.field155 = true;
        }
        if (!this.method90(false)) {
            return false;
        }
        this.field132 = arg3;
        this.field136 = arg0;
        this.field139 = true;
        this.field152.method1843(-110, this.field130);
        this.field130.method2065(0, (byte) 111);
        this.field152.method1837(-this.field132, this.field150 - this.field130.method2054(66) - this.field136, 1);
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
    public final boolean method89(byte arg0) {
        field129++;
        if (arg0 != 86) {
            this.field155 = true;
        }
        return this.field130 != null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
    private final boolean method90(boolean arg0) {
        if (arg0) {
            this.field158 = null;
        }
        if (this.field155) {
            if (this.field160 != null) {
                this.field160.method1643((byte) -92);
                this.field160 = null;
            }
            if (this.field154 != null) {
                this.field154.method121((byte) -57);
                this.field154 = null;
            }
            if (this.field138 != null) {
                this.field160 = new class252(this.field152, 6402, this.field147, this.field150, this.field152.field4066);
            }
            if (this.field157) {
                this.field154 = new class393(this.field152, 34037, 6402, this.field147, this.field150);
            } else if (this.field160 == null) {
                this.field160 = new class252(this.field152, 6402, this.field147, this.field150);
            }
            this.field164 = true;
            this.field166 = true;
            this.field155 = false;
        }
        field151++;
        if (this.field161) {
            if (this.field156 != null) {
                this.field156.method1643((byte) -110);
                this.field156 = null;
            }
            if (this.field158[0] != null) {
                this.field158[0].method121((byte) -57);
                this.field158[0] = null;
            }
            if (this.field158[1] != null) {
                this.field158[1].method121((byte) -57);
                this.field158[1] = null;
            }
            if (this.field138 != null) {
                this.field156 = new class252(this.field152, this.field167, this.field147, this.field150, this.field152.field4066);
            }
            this.field158[0] = new class393(this.field152, 34037, this.field167, this.field147, this.field150);
            this.field158[1] = this.field162 <= 1 ? null : new class393(this.field152, 34037, this.field167, this.field147, this.field150);
            this.field161 = false;
            this.field164 = true;
            this.field166 = true;
        }
        if (this.field164) {
            if (this.field138 == null) {
                this.field152.method1843(-97, this.field131);
                this.field131.method2066((byte) 23, 0);
                this.field131.method2066((byte) 23, 1);
                this.field131.method2066((byte) 23, 8);
                this.field131.method2057(0, -90, this.field158[0]);
                if (this.field162 > 1) {
                    this.field131.method2057(1, -55, this.field158[1]);
                }
                if (this.field157) {
                    this.field131.method2057(8, -87, this.field154);
                } else {
                    this.field131.method2056(this.field160, (byte) -108, 8);
                }
                this.field152.method1779(this.field131, true);
            } else {
                this.field152.method1843(90, this.field131);
                this.field131.method2066((byte) 23, 0);
                this.field131.method2066((byte) 23, 1);
                this.field131.method2066((byte) 23, 8);
                this.field131.method2057(0, 69, this.field158[0]);
                if (this.field162 > 1) {
                    this.field131.method2057(1, 120, this.field158[1]);
                }
                if (this.field157) {
                    this.field131.method2057(8, 111, this.field154);
                }
                this.field152.method1779(this.field131, true);
                this.field152.method1843(46, this.field138);
                this.field138.method2066((byte) 23, 0);
                this.field138.method2066((byte) 23, 8);
                this.field138.method2056(this.field156, (byte) 75, 0);
                this.field138.method2056(this.field160, (byte) 113, 8);
                this.field152.method1779(this.field138, true);
            }
            this.field164 = false;
            this.field166 = true;
        }
        if (this.field166) {
            this.field152.method1843(-83, this.field130);
            this.field166 = !this.field130.method2063(-16436);
            this.field152.method1779(this.field130, true);
        }
        return !this.field166;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public final void method91(boolean arg0) {
        field141++;
        if (!this.field139) {
            return;
        }
        if (this.field138 != null) {
            this.field152.method1771(this.field138, 0);
            int var2 = 16384;
            this.field152.method1772((byte) 57, this.field131);
            this.field138.method2055(0, 0);
            this.field131.method2065(0, (byte) -127);
            if (this.field157) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field147, this.field150, 0, 0, this.field147, this.field150, var2, 9728);
            this.field152.method1822(this.field138, 110);
            this.field152.method1777((byte) -112, this.field131);
        }
        this.field152.method1833(16384);
        this.field152.method1802(0, (byte) 57);
        this.field152.method1794(1, 53);
        this.field152.method1107();
        int var3 = 0;
        int var4 = 1;
        class381 var6;
        for (class381 var5 = (class381) this.field135.method1970(64); var5 != null; var5 = var6) {
            var6 = (class381) this.field135.method1960(24);
            int var7 = var5.method2368(1);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1445(this.field158[var3], this.field154, var8, -91);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field152.method1779(this.field131, true);
                    this.field152.method1837(0, 0, 1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field150);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field132, this.field136);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field132, this.field136 + this.field150);
                    OpenGL.glTexCoord2f((float) this.field147, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field147 + this.field132, this.field150 + this.field136);
                    OpenGL.glTexCoord2f((float) this.field147, (float) this.field150);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field147 + this.field132, this.field136);
                    OpenGL.glEnd();
                } else {
                    this.field131.method2065(var4, (byte) -73);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field150);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field150);
                    OpenGL.glTexCoord2f((float) this.field147, (float) this.field150);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field147, this.field150);
                    OpenGL.glTexCoord2f((float) this.field147, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field147, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method1453(-55, var8);
            }
        }
        this.field139 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lbv;)V")
    public class10(class282 arg0) {
        this.field152 = arg0;
        if (this.field152.field4159 && this.field152.field4155) {
            this.field130 = this.field131 = new class317(this.field152);
            if (this.field152.field4066 > 1 && this.field152.field4118 && this.field152.field4186) {
                this.field130 = this.field138 = new class317(this.field152);
                return;
            }
        }
    }

    static {
        new class375("Ok", "Okay", "OK", "Ok");
        field153 = new class492(22, 4);
        field159 = new String[100];
        field165 = new class340(1, 2, 2, 0);
    }
}
