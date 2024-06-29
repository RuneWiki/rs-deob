import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class437 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field6162 = -1;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private int field6168 = 0;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private int field6165 = -1;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    private int field6167 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Ljm;")
    private class162 field6164 = new class162();

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
    private boolean field6171 = true;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    private int field6172 = -1;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    private int field6173 = 0;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
    private boolean field6169 = false;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[Lhn;")
    private class257[] field6175 = new class257[2];

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
    private boolean field6177 = true;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Z")
    private boolean field6176 = true;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lmm;")
    private class357 field6166;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lqd;")
    private class3 field6163;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lhn;")
    private class257 field6170;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lfb;")
    private class45 field6174;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Luc;Z)V", line = 3)
    private final void method2686(class59 arg0, boolean arg1) {
        if (arg1) {
            arg0.method467();
        }
        arg0.field761 = false;
        arg0.method1884(false);
        this.method2691();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()Z", line = 12)
    private final boolean method2687() {
        return this.field6166.method2211() == this.field6163;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lmm;)V", line = 361)
    public class437(class357 arg0) {
        this.field6166 = arg0;
        if (this.field6166.field4833 && this.field6166.field4856) {
            this.field6163 = new class3(this.field6166);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 19)
    public final void method2688() {
        if (this.field6163 != null) {
            this.field6163 = null;
            this.field6175 = null;
            this.field6174 = null;
            this.field6170 = null;
            this.field6176 = true;
            this.field6177 = true;
            this.field6171 = true;
            if (!this.field6164.method1167(-93)) {
                for (class311 var1 = this.field6164.method1173(0); var1 != this.field6164.field2296; var1 = var1.field4223) {
                    ((class59) var1).method467();
                }
            }
        }
        this.field6165 = this.field6162 = -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Luc;)Z", line = 46)
    public final boolean method2689(class59 arg0) {
        if (this.field6163 != null) {
            if (arg0.method466() || arg0.method464()) {
                if (this.field6165 != -1 && this.field6162 != -1) {
                    arg0.method468(this.field6165, this.field6162);
                }
                arg0.field761 = true;
                this.field6164.method1162(121, arg0);
                this.method2691();
                return true;
            }
            arg0.method467();
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Luc;)V", line = 79)
    public final void method2690(class59 arg0) {
        this.method2686(arg0, true);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V", line = 83)
    private final void method2691() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class59 var4 = (class59) this.field6164.method1173(0); var4 != null; var4 = (class59) this.field6164.method1165(true)) {
            int var5 = var4.method471();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method462(4909);
            var3 |= var4.method465(21912);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6172 != var6) {
            this.field6172 = var6;
            this.field6176 = true;
        }
        int var7 = this.field6173 > 2 ? 2 : this.field6173;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field6171 = this.field6176 = true;
        }
        if (this.field6169 != var3) {
            this.field6169 = var3;
            this.field6177 = true;
        }
        this.field6173 = var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)Z", line = 136)
    public final boolean method2692(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6163 == null || this.field6164.method1167(-54)) {
            return false;
        }
        boolean var5 = false;
        if (this.field6165 != arg2 || this.field6162 != arg3) {
            this.field6165 = arg2;
            this.field6162 = arg3;
            for (class311 var6 = this.field6164.method1173(0); var6 != this.field6164.field2296; var6 = var6.field4223) {
                ((class59) var6).method468(this.field6165, this.field6162);
            }
            this.field6176 = true;
            this.field6177 = true;
        }
        if (this.field6177) {
            if (this.field6174 != null) {
                this.field6174.method376();
                this.field6174 = null;
            }
            if (this.field6170 != null) {
                this.field6170.method1963();
                this.field6170 = null;
            }
            if (this.field6169) {
                this.field6170 = new class257(this.field6166, 34037, 6402, this.field6165, this.field6162);
            } else {
                this.field6174 = new class45(this.field6166, 6402, this.field6165, this.field6162);
            }
            this.field6171 = true;
            this.field6177 = false;
            var5 = true;
        }
        if (this.field6176) {
            if (this.field6175[0] != null) {
                this.field6175[0].method1963();
                this.field6175[0] = null;
            }
            if (this.field6175[1] != null) {
                this.field6175[1].method1963();
                this.field6175[1] = null;
            }
            this.field6175[0] = new class257(this.field6166, 34037, this.field6172, this.field6165, this.field6162);
            this.field6175[1] = this.field6173 > 1 ? new class257(this.field6166, 34037, this.field6172, this.field6165, this.field6162) : null;
            this.field6171 = true;
            this.field6176 = false;
            var5 = true;
        }
        int var7 = this.field6166.method2211().method12();
        this.field6166.method2188(this.field6163);
        if (this.field6171) {
            this.field6163.method13(0);
            this.field6163.method13(1);
            this.field6163.method13(8);
            if (this.field6175[0] != null) {
                this.field6163.method9(0, this.field6175[0]);
            }
            if (this.field6175[1] != null) {
                this.field6163.method9(1, this.field6175[1]);
            }
            if (this.field6170 != null) {
                this.field6163.method9(8, this.field6170);
            }
            if (this.field6174 != null) {
                this.field6163.method7(8, this.field6174);
            }
            this.field6163.method10(0);
            this.field6171 = false;
            var5 = true;
        }
        if (!var5 || this.field6163.method15()) {
            this.field6168 = arg0;
            this.field6167 = arg1;
            this.field6166.method2209(-this.field6168, this.field6167 + this.field6162 - var7);
            return true;
        }
        this.field6166.method2191(this.field6163);
        this.field6176 = true;
        this.field6177 = true;
        this.field6171 = true;
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V", line = 246)
    public final void method2693() {
        if (!this.method2687()) {
            return;
        }
        opengl var1 = this.field6166.field4794;
        this.field6166.method2173();
        this.field6166.method2195(0);
        this.field6166.method204();
        int var2 = 0;
        int var3 = 1;
        class59 var5;
        for (class59 var4 = (class59) this.field6164.method1173(0); var4 != null; var4 = var5) {
            var5 = (class59) this.field6164.method1165(true);
            int var6 = var4.method462(4909);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method469(var7, this.field6175[var2], this.field6170);
                if (var5 == null && var6 - 1 == var7) {
                    this.field6166.method2191(this.field6163);
                    this.field6166.method2209(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field6162);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field6168, this.field6167);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field6168, this.field6167 + this.field6162);
                    var1.glTexCoord2f((float) this.field6165, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6168 + this.field6165, this.field6167 + this.field6162);
                    var1.glTexCoord2f((float) this.field6165, (float) this.field6162);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6168 + this.field6165, this.field6167);
                    var1.glEnd();
                } else {
                    this.field6163.method10(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field6162);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field6162);
                    var1.glTexCoord2f((float) this.field6165, (float) this.field6162);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6165, this.field6162);
                    var1.glTexCoord2f((float) this.field6165, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6165, 0);
                    var1.glEnd();
                }
                var4.method463(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }
}
