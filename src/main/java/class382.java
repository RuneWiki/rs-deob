import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class382 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    private int field5221 = 0;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    private int field5232 = 1;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    private int field5230 = 1;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    private int field5240 = 0;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "Lbq;")
    private class289 field5236 = new class289();

    @OriginalMember(owner = "client!es", name = "z", descriptor = "Z")
    private boolean field5246 = true;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "Z")
    private boolean field5242 = true;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    private int field5248 = -1;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    private int field5244 = 0;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "[Lwn;")
    private class720[] field5249 = new class720[2];

    @OriginalMember(owner = "client!es", name = "A", descriptor = "Z")
    private boolean field5247 = true;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "Z")
    private boolean field5250 = true;

    @OriginalMember(owner = "client!es", name = "E", descriptor = "Z")
    private boolean field5251 = false;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Lnv;")
    private class417 field5226;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Ler;")
    private class106 field5227;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Ler;")
    private class106 field5228;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "Ler;")
    private class106 field5233;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lpfa;")
    public static class295 field5225 = new class295(16);

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "Lds;")
    private class14 field5245;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "Lds;")
    private class14 field5252;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "Lwn;")
    private class720 field5243;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "Z")
    private boolean field5238;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BLns;)Z", line = 3)
    public final boolean method2346(byte arg0, class403 arg1) {
        field5229++;
        if (arg0 != 78) {
            this.method2351(-31);
        }
        if (this.field5228 != null) {
            if (arg1.method1045(121) || arg1.method1047(-15414)) {
                this.field5236.method1721((byte) 96, arg1);
                this.method2352(2);
                if (this.method2351(-115)) {
                    if (this.field5232 != -1 && this.field5230 != -1) {
                        arg1.method1048(this.field5232, false, this.field5230);
                    }
                    arg1.field5490 = true;
                    return true;
                }
            }
            this.method2353(-9, arg1);
        }
        return false;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 40)
    public final void method2347(int arg0) {
        field5224++;
        if (!this.field5238) {
            return;
        }
        if (this.field5233 != null) {
            int var2 = 16384;
            this.field5226.method2600(this.field5233, arg0 + 1);
            this.field5226.method2612(10272, this.field5227);
            this.field5233.method739(0, arg0 ^ 0x1);
            this.field5227.method728((byte) 7, 0);
            if (this.field5251) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field5232, this.field5230, 0, 0, this.field5232, this.field5230, var2, 9728);
            this.field5226.method2562((byte) -127, this.field5233);
            this.field5226.method2618(this.field5227, -14227);
        }
        this.field5226.method2620(false);
        this.field5226.method2606(arg0, arg0 - 24754);
        this.field5226.method2573(1, false);
        this.field5226.method393();
        int var3 = 0;
        int var4 = 1;
        class403 var6;
        for (class403 var5 = (class403) this.field5236.method1719(65280); var5 != null; var5 = var6) {
            var6 = (class403) this.field5236.method1723(-20665);
            int var7 = var5.method2459((byte) -66);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1046(this.field5249[var3], 1, var8, this.field5243);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field5226.method2617((byte) -120, this.field5227);
                    this.field5226.method2552(0, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5230);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5240, this.field5221);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5240, this.field5230 + this.field5221);
                    OpenGL.glTexCoord2f((float) this.field5232, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5240 + this.field5232, this.field5230 + this.field5221);
                    OpenGL.glTexCoord2f((float) this.field5232, (float) this.field5230);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5240 + this.field5232, this.field5221);
                    OpenGL.glEnd();
                } else {
                    this.field5227.method728((byte) 7, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5230);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field5230);
                    OpenGL.glTexCoord2f((float) this.field5232, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5232, this.field5230);
                    OpenGL.glTexCoord2f((float) this.field5232, (float) this.field5230);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5232, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method1053(var8, -1);
            }
        }
        this.field5238 = false;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIII)Z", line = 145)
    public final boolean method2348(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 53) {
            this.field5248 = -94;
        }
        field5237++;
        if (this.field5228 == null || this.field5236.method1717((byte) 28)) {
            return false;
        }
        if (this.field5232 != arg0 || this.field5230 != arg2) {
            this.field5230 = arg2;
            this.field5232 = arg0;
            for (class134 var6 = this.field5236.method1719(65280); var6 != this.field5236.field3563; var6 = var6.field1521) {
                ((class403) var6).method1048(this.field5232, false, this.field5230);
            }
            this.field5246 = true;
            this.field5247 = true;
            this.field5250 = true;
        }
        if (!this.method2351(-32)) {
            return false;
        }
        this.field5238 = true;
        this.field5221 = arg4;
        this.field5240 = arg1;
        this.field5226.method2615(this.field5228, true);
        this.field5228.method728((byte) 7, 0);
        this.field5226.method2552(0, -this.field5240, this.field5230 - (this.field5226.field5837 - this.field5221));
        return true;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)Z", line = 190)
    public final boolean method2349(int arg0) {
        if (arg0 != 0) {
            this.method2352(-80);
        }
        field5223++;
        return this.field5228 != null;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V", line = 203)
    public static void method2350(int arg0) {
        if (arg0 == 1) {
            field5225 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lnv;)V", line = 518)
    public class382(class417 arg0) {
        this.field5226 = arg0;
        if (this.field5226.field6033 && this.field5226.field5996) {
            this.field5228 = this.field5227 = new class106(this.field5226);
            if (this.field5226.field5907 > 1 && this.field5226.field5976 && this.field5226.field5961) {
                this.field5228 = this.field5233 = new class106(this.field5226);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)Z", line = 220)
    private final boolean method2351(int arg0) {
        field5241++;
        if (this.field5247) {
            if (this.field5245 != null) {
                this.field5245.method65((byte) 73);
                this.field5245 = null;
            }
            if (this.field5243 != null) {
                this.field5243.method1736(-30119);
                this.field5243 = null;
            }
            if (this.field5233 != null) {
                this.field5245 = new class14(this.field5226, 6402, this.field5232, this.field5230, this.field5226.field5907);
            }
            if (this.field5251) {
                this.field5243 = new class720(this.field5226, 34037, 6402, this.field5232, this.field5230);
            } else if (this.field5245 == null) {
                this.field5245 = new class14(this.field5226, 6402, this.field5232, this.field5230);
            }
            this.field5242 = true;
            this.field5247 = false;
            this.field5246 = true;
        }
        if (arg0 >= -23) {
            method2350(38);
        }
        if (this.field5250) {
            if (this.field5252 != null) {
                this.field5252.method65((byte) 74);
                this.field5252 = null;
            }
            if (this.field5249[0] != null) {
                this.field5249[0].method1736(-30119);
                this.field5249[0] = null;
            }
            if (this.field5249[1] != null) {
                this.field5249[1].method1736(-30119);
                this.field5249[1] = null;
            }
            if (this.field5233 != null) {
                this.field5252 = new class14(this.field5226, this.field5248, this.field5232, this.field5230, this.field5226.field5907);
            }
            this.field5249[0] = new class720(this.field5226, 34037, this.field5248, this.field5232, this.field5230);
            this.field5249[1] = this.field5244 <= 1 ? null : new class720(this.field5226, 34037, this.field5248, this.field5232, this.field5230);
            this.field5242 = true;
            this.field5246 = true;
            this.field5250 = false;
        }
        if (this.field5246) {
            if (this.field5233 == null) {
                this.field5226.method2615(this.field5227, true);
                this.field5227.method737(0, (byte) -118);
                this.field5227.method737(1, (byte) -118);
                this.field5227.method737(8, (byte) -118);
                this.field5227.method734(0, false, this.field5249[0]);
                if (this.field5244 > 1) {
                    this.field5227.method734(1, false, this.field5249[1]);
                }
                if (this.field5251) {
                    this.field5227.method734(8, false, this.field5243);
                } else {
                    this.field5227.method725(this.field5245, 26867, 8);
                }
                this.field5226.method2617((byte) -19, this.field5227);
            } else {
                this.field5226.method2615(this.field5227, true);
                this.field5227.method737(0, (byte) -118);
                this.field5227.method737(1, (byte) -118);
                this.field5227.method737(8, (byte) -118);
                this.field5227.method734(0, false, this.field5249[0]);
                if (this.field5244 > 1) {
                    this.field5227.method734(1, false, this.field5249[1]);
                }
                if (this.field5251) {
                    this.field5227.method734(8, false, this.field5243);
                }
                this.field5226.method2617((byte) -40, this.field5227);
                this.field5226.method2615(this.field5233, true);
                this.field5233.method737(0, (byte) -118);
                this.field5233.method737(8, (byte) -118);
                this.field5233.method725(this.field5252, 26867, 0);
                this.field5233.method725(this.field5245, 26867, 8);
                this.field5226.method2617((byte) -38, this.field5233);
            }
            this.field5242 = true;
            this.field5246 = false;
        }
        if (this.field5242) {
            this.field5226.method2615(this.field5228, true);
            this.field5242 = !this.field5228.method727(36053);
            this.field5226.method2617((byte) -70, this.field5228);
        }
        return !this.field5242;
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V", line = 352)
    private final void method2352(int arg0) {
        field5222++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class403 var5 = (class403) this.field5236.method1719(arg0 ^ 0xFF02); var5 != null; var5 = (class403) this.field5236.method1723(-20665)) {
            int var9 = var5.method1052(0);
            var4 += var5.method2459((byte) -66);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method2455(arg0 ^ 0x2);
        }
        int var6;
        if (arg0 == var3) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5248 != var6) {
            this.field5248 = var6;
            this.field5250 = true;
        }
        int var7 = this.field5244 <= 2 ? this.field5244 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        this.field5244 = var4;
        if (var7 != var8) {
            this.field5246 = this.field5250 = true;
        }
        if (var2 != this.field5251) {
            this.field5251 = var2;
            this.field5247 = true;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILns;)V", line = 412)
    public final void method2353(int arg0, class403 arg1) {
        arg1.field5490 = false;
        field5235++;
        arg1.method1050(-3058);
        int var3 = 41 % ((arg0 + 54) / 36);
        arg1.method864(12983);
        this.method2352(2);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V", line = 437)
    public final void method2354(byte arg0) {
        this.field5228 = this.field5233 = this.field5227 = null;
        this.field5249 = null;
        field5239++;
        this.field5243 = null;
        this.field5252 = null;
        if (arg0 != -70) {
            this.method2354((byte) 56);
        }
        this.field5245 = null;
        if (!this.field5236.method1717((byte) 28)) {
            for (class134 var2 = this.field5236.method1719(65280); var2 != this.field5236.field3563; var2 = var2.field1521) {
                ((class403) var2).method1050(-3058);
            }
        }
        this.field5232 = this.field5230 = 1;
    }
}
