import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class292 {

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    private int field4129 = 0;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
    private int field4136 = 1;

    @OriginalMember(owner = "client!uea", name = "t", descriptor = "I")
    private int field4138 = 0;

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
    private int field4140 = 1;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "Lgj;")
    private class593 field4133 = new class593();

    @OriginalMember(owner = "client!uea", name = "x", descriptor = "I")
    private int field4142 = 0;

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "Z")
    private boolean field4146 = false;

    @OriginalMember(owner = "client!uea", name = "F", descriptor = "Z")
    private boolean field4149 = true;

    @OriginalMember(owner = "client!uea", name = "C", descriptor = "Z")
    private boolean field4147 = true;

    @OriginalMember(owner = "client!uea", name = "D", descriptor = "Z")
    private boolean field4148 = true;

    @OriginalMember(owner = "client!uea", name = "w", descriptor = "Z")
    private boolean field4141 = true;

    @OriginalMember(owner = "client!uea", name = "G", descriptor = "I")
    private int field4150 = -1;

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "[Lgaa;")
    private class275[] field4144 = new class275[2];

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "Lno;")
    private class658 field4126;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "Lvga;")
    private class79 field4135;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Lvga;")
    private class79 field4128;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "Lvga;")
    private class79 field4131;

    @OriginalMember(owner = "client!uea", name = "I", descriptor = "Z")
    public static boolean field4152 = false;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "Lmga;")
    public static class666 field4127 = new class666(3000000, 200);

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!uea", name = "s", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!uea", name = "u", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!uea", name = "y", descriptor = "Lbm;")
    private class101 field4143;

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "Lbm;")
    private class101 field4151;

    @OriginalMember(owner = "client!uea", name = "A", descriptor = "Lgaa;")
    private class275 field4145;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "Z")
    private boolean field4130;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lli;B)V", line = 4)
    public final void method1794(class398 arg0, byte arg1) {
        int var3 = 18 / ((arg1 + 83) / 42);
        arg0.field5293 = false;
        field4137++;
        arg0.method957(-99);
        arg0.method2797(116);
        this.method1797((byte) 126);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 18)
    public static void method1795(int arg0) {
        int var1 = -46 % ((20 - arg0) / 59);
        field4127 = null;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 28)
    public final void method1796(byte arg0) {
        field4132++;
        if (!this.field4130) {
            return;
        }
        if (this.field4131 != null) {
            int var2 = 16384;
            this.field4126.method3617(this.field4131, -1);
            this.field4126.method3631(25704, this.field4135);
            this.field4131.method615(0, true);
            this.field4135.method625((byte) 108, 0);
            if (this.field4146) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field4140, this.field4136, 0, 0, this.field4140, this.field4136, var2, 9728);
            this.field4126.method3648(this.field4131, (byte) 125);
            this.field4126.method3604(this.field4135, -2034463408);
        }
        this.field4126.method3614(-10553);
        this.field4126.method3646(-2, 0);
        this.field4126.method3603((byte) -34, 1);
        this.field4126.method435();
        int var3 = 0;
        int var4 = 1;
        int var5 = -59 / ((58 - arg0) / 46);
        class398 var7;
        for (class398 var6 = (class398) this.field4133.method3257(-74); var6 != null; var6 = var7) {
            var7 = (class398) this.field4133.method3263((byte) -110);
            int var8 = var6.method2283((byte) -20);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method952(this.field4144[var3], this.field4145, (byte) -105, var9);
                if (var7 == null && var8 - 1 == var9) {
                    this.field4126.method3658(-120, this.field4135);
                    this.field4126.method3663(0, 32888, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4136);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4138, this.field4129);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4138, this.field4136 + this.field4129);
                    OpenGL.glTexCoord2f((float) this.field4140, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4140 + this.field4138, this.field4136 + this.field4129);
                    OpenGL.glTexCoord2f((float) this.field4140, (float) this.field4136);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4140 + this.field4138, this.field4129);
                    OpenGL.glEnd();
                } else {
                    this.field4135.method625((byte) 115, -(-var4));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4136);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field4136);
                    OpenGL.glTexCoord2f((float) this.field4140, (float) this.field4136);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4140, this.field4136);
                    OpenGL.glTexCoord2f((float) this.field4140, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4140, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var6.method960((byte) 118, var9);
            }
        }
        this.field4130 = false;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)V", line = 134)
    private final void method1797(byte arg0) {
        field4123++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class398 var5 = (class398) this.field4133.method3257(-46); var5 != null; var5 = (class398) this.field4133.method3263((byte) -83)) {
            int var10 = var5.method959((byte) 17);
            var4 += var5.method2283((byte) -20);
            if (var3 < var10) {
                var3 = var10;
            }
            var2 |= var5.method2282(112);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4150 != var6) {
            this.field4150 = var6;
            this.field4148 = true;
        }
        int var7 = this.field4142 > 2 ? 2 : this.field4142;
        int var8 = -5 / ((62 - arg0) / 61);
        int var9 = var4 <= 2 ? var4 : 2;
        if (var2 != this.field4146) {
            this.field4141 = true;
            this.field4146 = var2;
        }
        if (var7 != var9) {
            this.field4147 = this.field4148 = true;
        }
        this.field4142 = var4;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 198)
    public static final void method1798(byte arg0, String arg1, boolean arg2) {
        field4120++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != -78) {
            field4152 = false;
        }
        if (class18.field311 >= 100) {
            class315.method1881(class72.field1103.method546(class516.field6892, (byte) -35), arg0 ^ 0xFFFFFFB2, 4);
            return;
        }
        String var3 = class166.method1138(arg1, 3317);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class18.field311; var4++) {
            String var9 = class166.method1138(class3.field38[var4], 3317);
            if (var9 != null && var9.equals(var3)) {
                class315.method1881(arg1 + class72.field1104.method546(class516.field6892, (byte) -35), arg0 ^ 0xFFFFFFB2, 4);
                return;
            }
            if (class260.field3574[var4] != null) {
                String var10 = class166.method1138(class260.field3574[var4], 3317);
                if (var10 != null && var10.equals(var3)) {
                    class315.method1881(arg1 + class72.field1104.method546(class516.field6892, (byte) -35), 0, 4);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class408.field5515; var5++) {
            String var7 = class166.method1138(class398.field5296[var5], 3317);
            if (var7 != null && var7.equals(var3)) {
                class315.method1881(class72.field1109.method546(class516.field6892, (byte) -35) + arg1 + class72.field1110.method546(class516.field6892, (byte) -35), 0, 4);
                return;
            }
            if (class34.field529[var5] != null) {
                String var8 = class166.method1138(class34.field529[var5], 3317);
                if (var8 != null && var8.equals(var3)) {
                    class315.method1881(class72.field1109.method546(class516.field6892, (byte) -35) + arg1 + class72.field1110.method546(class516.field6892, (byte) -35), 0, 4);
                    return;
                }
            }
        }
        if (class166.method1138(class199.field2897.field5398, 3317).equals(var3)) {
            class315.method1881(class72.field1106.method546(class516.field6892, (byte) -35), 0, 4);
            return;
        }
        class688.field9698++;
        class402 var6 = class390.method2252(class287.field4038, -119, class262.field3644);
        var6.field5354.method1980(-345277664, class580.method3186(122, arg1) + 1);
        var6.field5354.method2019(-110, arg1);
        var6.field5354.method1980(-345277664, arg2 ? 1 : 0);
        class36.method278(0, var6);
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)Z", line = 299)
    private final boolean method1799(int arg0) {
        field4122++;
        if (this.field4141) {
            if (this.field4143 != null) {
                this.field4143.method770(-10660793);
                this.field4143 = null;
            }
            if (this.field4145 != null) {
                this.field4145.method2170(9729);
                this.field4145 = null;
            }
            if (this.field4131 != null) {
                this.field4143 = new class101(this.field4126, 6402, this.field4140, this.field4136, this.field4126.field9176);
            }
            if (this.field4146) {
                this.field4145 = new class275(this.field4126, 34037, 6402, this.field4140, this.field4136);
            } else if (this.field4143 == null) {
                this.field4143 = new class101(this.field4126, 6402, this.field4140, this.field4136);
            }
            this.field4141 = false;
            this.field4147 = true;
            this.field4149 = true;
        }
        if (arg0 > -8) {
            return true;
        }
        if (this.field4148) {
            if (this.field4151 != null) {
                this.field4151.method770(-10660793);
                this.field4151 = null;
            }
            if (this.field4144[0] != null) {
                this.field4144[0].method2170(9729);
                this.field4144[0] = null;
            }
            if (this.field4144[1] != null) {
                this.field4144[1].method2170(9729);
                this.field4144[1] = null;
            }
            if (this.field4131 != null) {
                this.field4151 = new class101(this.field4126, this.field4150, this.field4140, this.field4136, this.field4126.field9176);
            }
            this.field4144[0] = new class275(this.field4126, 34037, this.field4150, this.field4140, this.field4136);
            this.field4144[1] = this.field4142 <= 1 ? null : new class275(this.field4126, 34037, this.field4150, this.field4140, this.field4136);
            this.field4147 = true;
            this.field4149 = true;
            this.field4148 = false;
        }
        if (this.field4147) {
            if (this.field4131 == null) {
                this.field4126.method3639(7, this.field4135);
                this.field4135.method620(1, 0);
                this.field4135.method620(1, 1);
                this.field4135.method620(1, 8);
                this.field4135.method621(this.field4144[0], -43, 0);
                if (this.field4142 > 1) {
                    this.field4135.method621(this.field4144[1], -106, 1);
                }
                if (this.field4146) {
                    this.field4135.method621(this.field4145, 123, 8);
                } else {
                    this.field4135.method612(107, this.field4143, 8);
                }
                this.field4126.method3658(-128, this.field4135);
            } else {
                this.field4126.method3639(7, this.field4135);
                this.field4135.method620(1, 0);
                this.field4135.method620(1, 1);
                this.field4135.method620(1, 8);
                this.field4135.method621(this.field4144[0], -30, 0);
                if (this.field4142 > 1) {
                    this.field4135.method621(this.field4144[1], -45, 1);
                }
                if (this.field4146) {
                    this.field4135.method621(this.field4145, -35, 8);
                }
                this.field4126.method3658(-119, this.field4135);
                this.field4126.method3639(7, this.field4131);
                this.field4131.method620(1, 0);
                this.field4131.method620(1, 8);
                this.field4131.method612(125, this.field4151, 0);
                this.field4131.method612(120, this.field4143, 8);
                this.field4126.method3658(-126, this.field4131);
            }
            this.field4149 = true;
            this.field4147 = false;
        }
        if (this.field4149) {
            this.field4126.method3639(7, this.field4128);
            this.field4149 = !this.field4128.method623(-32672);
            this.field4126.method3658(-120, this.field4128);
        }
        return !this.field4149;
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "(B)V", line = 430)
    public final void method1800(byte arg0) {
        if (arg0 < 44) {
            return;
        }
        this.field4151 = null;
        field4134++;
        this.field4144 = null;
        this.field4128 = this.field4131 = this.field4135 = null;
        this.field4145 = null;
        this.field4143 = null;
        if (!this.field4133.method3254((byte) 32)) {
            for (class504 var2 = this.field4133.method3257(-29); var2 != this.field4133.field7850; var2 = var2.field6722) {
                ((class398) var2).method957(-104);
            }
        }
        this.field4140 = this.field4136 = 1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BI[B)I", line = 461)
    public static final int method1801(byte arg0, int arg1, byte[] arg2) {
        field4139++;
        if (arg0 >= -68) {
            field4152 = true;
        }
        return class261.method1602(arg2, (byte) -52, 0, arg1);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLli;)Z", line = 476)
    public final boolean method1802(boolean arg0, class398 arg1) {
        field4125++;
        if (this.field4128 != null) {
            if (arg1.method955(1) || arg1.method954(23208)) {
                this.field4133.method3265(arg1, (byte) -65);
                this.method1797((byte) 123);
                if (this.method1799(-74)) {
                    if (this.field4140 != -1 && this.field4136 != -1) {
                        arg1.method953(72, this.field4136, this.field4140);
                    }
                    arg1.field5293 = true;
                    return true;
                }
            }
            this.method1794(arg1, (byte) -125);
        }
        if (arg0) {
            this.field4130 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lno;)V", line = 625)
    public class292(class658 arg0) {
        this.field4126 = arg0;
        if (this.field4126.field9284 && this.field4126.field9310) {
            this.field4128 = this.field4135 = new class79(this.field4126);
            if (this.field4126.field9176 > 1 && this.field4126.field9271 && this.field4126.field9317) {
                this.field4128 = this.field4131 = new class79(this.field4126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIBI)Z", line = 528)
    public final boolean method1803(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4121++;
        if (arg3 != 33) {
            this.field4130 = false;
        }
        if (this.field4128 == null || this.field4133.method3254((byte) 32)) {
            return false;
        }
        if (this.field4140 != arg2 || this.field4136 != arg4) {
            this.field4140 = arg2;
            this.field4136 = arg4;
            for (class504 var6 = this.field4133.method3257(arg3 - 65); var6 != this.field4133.field7850; var6 = var6.field6722) {
                ((class398) var6).method953(arg3 ^ 0x10, this.field4136, this.field4140);
            }
            this.field4148 = true;
            this.field4147 = true;
            this.field4141 = true;
        }
        if (!this.method1799(-65)) {
            return false;
        }
        this.field4129 = arg1;
        this.field4138 = arg0;
        this.field4130 = true;
        this.field4126.method3639(arg3 - 26, this.field4128);
        this.field4128.method625((byte) 98, 0);
        this.field4126.method3663(this.field4129 + this.field4136 - this.field4126.field9051, arg3 + 32855, -this.field4138);
        return true;
    }

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "(B)Z", line = 580)
    public final boolean method1804(byte arg0) {
        if (arg0 == 117) {
            field4119++;
            return this.field4128 != null;
        } else {
            return true;
        }
    }
}
