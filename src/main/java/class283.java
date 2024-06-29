import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class283 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    private int field4187 = 1;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    private int field4190 = 0;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    private int field4198 = 1;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    private int field4205 = 0;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lhga;")
    private class158 field4201 = new class158();

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Z")
    private boolean field4206 = false;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
    private boolean field4209 = true;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "[Ldb;")
    private class296[] field4207 = new class296[2];

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Z")
    private boolean field4213 = true;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Z")
    private boolean field4211 = true;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Z")
    private boolean field4216 = true;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    private int field4215 = -1;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    private int field4214 = 0;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lus;")
    private class1 field4204;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lrq;")
    private class323 field4199;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lrq;")
    private class323 field4188;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lrq;")
    private class323 field4192;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field4203 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Ldb;")
    private class296 field4210;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Lht;")
    private class540 field4208;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Lht;")
    private class540 field4212;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Z")
    private boolean field4200;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method1864(byte arg0) {
        this.field4212 = null;
        if (arg0 != 13) {
            return;
        }
        this.field4207 = null;
        this.field4208 = null;
        this.field4188 = this.field4192 = this.field4199 = null;
        field4191++;
        this.field4210 = null;
        if (!this.field4201.method1223(-2)) {
            for (class425 var2 = this.field4201.method1224(arg0 ^ 0xFFFFFFF3); var2 != this.field4201.field2700; var2 = var2.field6134) {
                ((class467) var2).method2790((byte) -89);
            }
        }
        this.field4187 = this.field4198 = 1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Z")
    private final boolean method1865(int arg0) {
        field4202++;
        if (this.field4216) {
            if (this.field4208 != null) {
                this.field4208.method3115(false);
                this.field4208 = null;
            }
            if (this.field4210 != null) {
                this.field4210.method2938(-23054);
                this.field4210 = null;
            }
            if (this.field4192 != null) {
                this.field4208 = new class540(this.field4204, 6402, this.field4187, this.field4198, this.field4204.field196);
            }
            if (this.field4206) {
                this.field4210 = new class296(this.field4204, 34037, 6402, this.field4187, this.field4198);
            } else if (this.field4208 == null) {
                this.field4208 = new class540(this.field4204, 6402, this.field4187, this.field4198);
            }
            this.field4216 = false;
            this.field4211 = true;
            this.field4209 = true;
        }
        if (arg0 <= 89) {
            return false;
        }
        if (this.field4213) {
            if (this.field4212 != null) {
                this.field4212.method3115(false);
                this.field4212 = null;
            }
            if (this.field4207[0] != null) {
                this.field4207[0].method2938(-23054);
                this.field4207[0] = null;
            }
            if (this.field4207[1] != null) {
                this.field4207[1].method2938(-23054);
                this.field4207[1] = null;
            }
            if (this.field4192 != null) {
                this.field4212 = new class540(this.field4204, this.field4215, this.field4187, this.field4198, this.field4204.field196);
            }
            this.field4207[0] = new class296(this.field4204, 34037, this.field4215, this.field4187, this.field4198);
            this.field4207[1] = this.field4214 <= 1 ? null : new class296(this.field4204, 34037, this.field4215, this.field4187, this.field4198);
            this.field4211 = true;
            this.field4209 = true;
            this.field4213 = false;
        }
        if (this.field4211) {
            if (this.field4192 == null) {
                this.field4204.method60(this.field4199, (byte) -88);
                this.field4199.method2074(0, -60);
                this.field4199.method2074(1, -52);
                this.field4199.method2074(8, -53);
                this.field4199.method2089(this.field4207[0], (byte) 119, 0);
                if (this.field4214 > 1) {
                    this.field4199.method2089(this.field4207[1], (byte) 112, 1);
                }
                if (this.field4206) {
                    this.field4199.method2089(this.field4210, (byte) 115, 8);
                } else {
                    this.field4199.method2095((byte) -9, 8, this.field4208);
                }
                this.field4204.method141(2131, this.field4199);
            } else {
                this.field4204.method60(this.field4199, (byte) -109);
                this.field4199.method2074(0, -70);
                this.field4199.method2074(1, -111);
                this.field4199.method2074(8, -74);
                this.field4199.method2089(this.field4207[0], (byte) 115, 0);
                if (this.field4214 > 1) {
                    this.field4199.method2089(this.field4207[1], (byte) 111, 1);
                }
                if (this.field4206) {
                    this.field4199.method2089(this.field4210, (byte) 120, 8);
                }
                this.field4204.method141(2131, this.field4199);
                this.field4204.method60(this.field4192, (byte) 126);
                this.field4192.method2074(0, -111);
                this.field4192.method2074(8, -50);
                this.field4192.method2095((byte) -9, 0, this.field4212);
                this.field4192.method2095((byte) -9, 8, this.field4208);
                this.field4204.method141(2131, this.field4192);
            }
            this.field4211 = false;
            this.field4209 = true;
        }
        if (this.field4209) {
            this.field4204.method60(this.field4188, (byte) -115);
            this.field4209 = !this.field4188.method2081((byte) -95);
            this.field4204.method141(2131, this.field4188);
        }
        return !this.field4209;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public final void method1866(int arg0) {
        field4197++;
        if (!this.field4200) {
            return;
        }
        if (this.field4192 != null) {
            int var2 = 16384;
            this.field4204.method157(25133, this.field4192);
            this.field4204.method154(this.field4199, false);
            this.field4192.method2078(0, (byte) 100);
            this.field4199.method2075(false, 0);
            if (this.field4206) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field4187, this.field4198, 0, 0, this.field4187, this.field4198, var2, 9728);
            this.field4204.method1((byte) -97, this.field4192);
            this.field4204.method156(-86, this.field4199);
        }
        if (arg0 < 16) {
            this.method1871((byte) 20);
        }
        this.field4204.method136((byte) -80);
        this.field4204.method7(0, (byte) 76);
        this.field4204.method133(1, (byte) -124);
        this.field4204.method107();
        int var3 = 0;
        int var4 = 1;
        class467 var6;
        for (class467 var5 = (class467) this.field4201.method1224(-2); var5 != null; var5 = var6) {
            var6 = (class467) this.field4201.method1232(-2);
            int var7 = var5.method2787((byte) -126);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2791(this.field4207[var3], var8, -68, this.field4210);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field4204.method141(2131, this.field4199);
                    this.field4204.method138(false, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4198);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4190, this.field4205);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4190, this.field4205 + this.field4198);
                    OpenGL.glTexCoord2f((float) this.field4187, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4190 + this.field4187, this.field4205 + this.field4198);
                    OpenGL.glTexCoord2f((float) this.field4187, (float) this.field4198);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4190 + this.field4187, this.field4205);
                    OpenGL.glEnd();
                } else {
                    this.field4199.method2075(false, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4198);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field4198);
                    OpenGL.glTexCoord2f((float) this.field4187, (float) this.field4198);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4187, this.field4198);
                    OpenGL.glTexCoord2f((float) this.field4187, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4187, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method2788(119, var8);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field4200 = false;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    private final void method1867(int arg0) {
        field4195++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class467 var5 = (class467) this.field4201.method1224(-2); var5 != null; var5 = (class467) this.field4201.method1232(-2)) {
            int var9 = var5.method2781(1);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method2787((byte) -126);
            var2 |= var5.method2793(0);
        }
        if (arg0 < 17) {
            this.method1869(-112, -56, -18, -96, -18);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4215 != var6) {
            this.field4215 = var6;
            this.field4213 = true;
        }
        int var7 = this.field4214 > 2 ? 2 : this.field4214;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field4214 = var4;
        if (var7 != var8) {
            this.field4211 = this.field4213 = true;
        }
        if (this.field4206 != var2) {
            this.field4206 = var2;
            this.field4216 = true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Leaa;I)V")
    public final void method1868(class467 arg0, int arg1) {
        field4189++;
        if (arg1 == 1) {
            arg0.field6612 = false;
            arg0.method2790((byte) -99);
            arg0.method2588(300);
            this.method1867(46);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)Z")
    public final boolean method1869(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4194++;
        if (this.field4188 == null || this.field4201.method1223(-2)) {
            return false;
        }
        if (arg3 <= 84) {
            this.field4192 = null;
        }
        if (this.field4187 != arg2 || this.field4198 != arg4) {
            this.field4198 = arg4;
            this.field4187 = arg2;
            for (class425 var6 = this.field4201.method1224(-2); var6 != this.field4201.field2700; var6 = var6.field6134) {
                ((class467) var6).method2789(this.field4198, this.field4187, true);
            }
            this.field4213 = true;
            this.field4216 = true;
            this.field4211 = true;
        }
        if (!this.method1865(115)) {
            return false;
        }
        this.field4200 = true;
        this.field4190 = arg1;
        this.field4205 = arg0;
        this.field4204.method60(this.field4188, (byte) 71);
        this.field4188.method2075(false, 0);
        this.field4204.method138(false, this.field4198 + this.field4205 - this.field4204.field24, -this.field4190);
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Leaa;B)Z")
    public final boolean method1870(class467 arg0, byte arg1) {
        field4196++;
        if (arg1 != -85) {
            this.method1866(41);
        }
        if (this.field4188 != null) {
            if (arg0.method2792((byte) -124) || arg0.method2780((byte) 19)) {
                this.field4201.method1229(arg0, (byte) 120);
                this.method1867(51);
                if (this.method1865(arg1 ^ 0xFFFFFFCB)) {
                    if (this.field4187 != -1 && this.field4198 != -1) {
                        arg0.method2789(this.field4198, this.field4187, true);
                    }
                    arg0.field6612 = true;
                    return true;
                }
            }
            this.method1868(arg0, 1);
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
    public final boolean method1871(byte arg0) {
        if (arg0 > -73) {
            this.field4211 = false;
        }
        field4193++;
        return this.field4188 != null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lus;)V")
    public class283(class1 arg0) {
        this.field4204 = arg0;
        if (this.field4204.field278 && this.field4204.field259) {
            this.field4188 = this.field4199 = new class323(this.field4204);
            if (this.field4204.field196 > 1 && this.field4204.field283 && this.field4204.field289) {
                this.field4188 = this.field4192 = new class323(this.field4204);
                return;
            }
        }
    }
}
