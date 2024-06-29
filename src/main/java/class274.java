import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class274 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    private int field4117 = 0;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    private int field4119 = -1;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    private int field4116 = -1;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field4121 = 0;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lvq;")
    private class22 field4120 = new class22();

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Llb;")
    private class208[] field4122 = new class208[2];

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Z")
    private boolean field4125 = true;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field4123 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Z")
    private boolean field4126 = true;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
    private boolean field4124 = true;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    private int field4127 = -1;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Z")
    private boolean field4129 = false;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lge;")
    private class104 field4115;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljd;")
    private class130 field4118;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Llb;")
    private class208 field4130;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lcl;")
    private class313 field4128;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 4)
    public final void method1957() {
        if (this.field4118 != null) {
            this.field4118 = null;
            this.field4122 = null;
            this.field4128 = null;
            this.field4130 = null;
            this.field4124 = true;
            this.field4126 = true;
            this.field4125 = true;
            if (!this.field4120.method152((byte) 59)) {
                for (class35 var1 = this.field4120.method157((byte) -125); var1 != this.field4120.field322; var1 = var1.field498) {
                    ((class226) var1).method331();
                }
            }
        }
        this.field4119 = this.field4116 = -1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lfo;Z)V", line = 32)
    private final void method1958(class226 arg0, boolean arg1) {
        if (arg1) {
            arg0.method331();
        }
        arg0.field3328 = false;
        arg0.method251(6);
        this.method1959();
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V", line = 42)
    private final void method1959() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class226 var4 = (class226) this.field4120.method157((byte) -125); var4 != null; var4 = (class226) this.field4120.method145(85)) {
            int var5 = var4.method330();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method1699(-105);
            var3 |= var4.method1700(41);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4127 != var6) {
            this.field4127 = var6;
            this.field4124 = true;
        }
        int var7 = this.field4123 > 2 ? 2 : this.field4123;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field4125 = this.field4124 = true;
        }
        if (this.field4129 != var3) {
            this.field4129 = var3;
            this.field4126 = true;
        }
        this.field4123 = var2;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V", line = 94)
    public final void method1960() {
        if (!this.method1963()) {
            return;
        }
        opengl var1 = this.field4115.field1604;
        this.field4115.method933();
        this.field4115.method868(0);
        this.field4115.method751();
        int var2 = 0;
        int var3 = 1;
        class226 var5;
        for (class226 var4 = (class226) this.field4120.method157((byte) -125); var4 != null; var4 = var5) {
            var5 = (class226) this.field4120.method145(-110);
            int var6 = var4.method1699(-108);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method329(var7, this.field4122[var2], this.field4130);
                if (var5 == null && var6 - 1 == var7) {
                    this.field4115.method869(this.field4118);
                    this.field4115.method883(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field4116);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field4117, this.field4121);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field4117, this.field4121 + this.field4116);
                    var1.glTexCoord2f((float) this.field4119, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4119 + this.field4117, this.field4121 + this.field4116);
                    var1.glTexCoord2f((float) this.field4119, (float) this.field4116);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4119 + this.field4117, this.field4121);
                    var1.glEnd();
                } else {
                    this.field4118.method1095(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field4116);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field4116);
                    var1.glTexCoord2f((float) this.field4119, (float) this.field4116);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4119, this.field4116);
                    var1.glTexCoord2f((float) this.field4119, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4119, 0);
                    var1.glEnd();
                }
                var4.method332(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lfo;)V", line = 171)
    public final void method1961(class226 arg0) {
        this.method1958(arg0, true);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Lfo;)Z", line = 174)
    public final boolean method1962(class226 arg0) {
        if (this.field4118 != null) {
            if (arg0.method327() || arg0.method328()) {
                if (this.field4119 != -1 && this.field4116 != -1) {
                    arg0.method325(this.field4119, this.field4116);
                }
                arg0.field3328 = true;
                this.field4120.method148((byte) 114, arg0);
                this.method1959();
                return true;
            }
            arg0.method331();
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lge;)V", line = 361)
    public class274(class104 arg0) {
        this.field4115 = arg0;
        if (this.field4115.field1635 && this.field4115.field1666) {
            this.field4118 = new class130(this.field4115);
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()Z", line = 205)
    private final boolean method1963() {
        return this.field4115.method859() == this.field4118;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)Z", line = 209)
    public final boolean method1964(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4118 == null || this.field4120.method152((byte) 59)) {
            return false;
        }
        boolean var5 = false;
        if (this.field4119 != arg2 || this.field4116 != arg3) {
            this.field4119 = arg2;
            this.field4116 = arg3;
            for (class35 var6 = this.field4120.method157((byte) -125); var6 != this.field4120.field322; var6 = var6.field498) {
                ((class226) var6).method325(this.field4119, this.field4116);
            }
            this.field4124 = true;
            this.field4126 = true;
        }
        if (this.field4126) {
            if (this.field4128 != null) {
                this.field4128.method2124();
                this.field4128 = null;
            }
            if (this.field4130 != null) {
                this.field4130.method1492();
                this.field4130 = null;
            }
            if (this.field4129) {
                this.field4130 = new class208(this.field4115, 34037, 6402, this.field4119, this.field4116);
            } else {
                this.field4128 = new class313(this.field4115, 6402, this.field4119, this.field4116);
            }
            this.field4125 = true;
            this.field4126 = false;
            var5 = true;
        }
        if (this.field4124) {
            if (this.field4122[0] != null) {
                this.field4122[0].method1492();
                this.field4122[0] = null;
            }
            if (this.field4122[1] != null) {
                this.field4122[1].method1492();
                this.field4122[1] = null;
            }
            this.field4122[0] = new class208(this.field4115, 34037, this.field4127, this.field4119, this.field4116);
            this.field4122[1] = this.field4123 > 1 ? new class208(this.field4115, 34037, this.field4127, this.field4119, this.field4116) : null;
            this.field4125 = true;
            this.field4124 = false;
            var5 = true;
        }
        int var7 = this.field4115.method859().method898();
        this.field4115.method903(this.field4118);
        if (this.field4125) {
            this.field4118.method1092(0);
            this.field4118.method1092(1);
            this.field4118.method1092(8);
            if (this.field4122[0] != null) {
                this.field4118.method1098(0, this.field4122[0]);
            }
            if (this.field4122[1] != null) {
                this.field4118.method1098(1, this.field4122[1]);
            }
            if (this.field4130 != null) {
                this.field4118.method1098(8, this.field4130);
            }
            if (this.field4128 != null) {
                this.field4118.method1094(8, this.field4128);
            }
            this.field4118.method1095(0);
            this.field4125 = false;
            var5 = true;
        }
        if (!var5 || this.field4118.method1096()) {
            this.field4117 = arg0;
            this.field4121 = arg1;
            this.field4115.method883(-this.field4117, this.field4121 + this.field4116 - var7);
            return true;
        }
        this.field4115.method869(this.field4118);
        this.field4124 = true;
        this.field4126 = true;
        this.field4125 = true;
        return false;
    }
}
