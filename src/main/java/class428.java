import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class428 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    private int field6141 = 0;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    private int field6140 = -1;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    private int field6144 = -1;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    private int field6145 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Ltc;")
    private class196 field6139 = new class196();

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
    private boolean field6146 = true;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[Lrq;")
    private class195[] field6147 = new class195[2];

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Z")
    private boolean field6149 = true;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    private int field6151 = -1;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "Z")
    private boolean field6153 = false;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Z")
    private boolean field6152 = true;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    private int field6154 = 0;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lhj;")
    private class338 field6143;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Lvi;")
    private class317 field6142;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Lrq;")
    private class195 field6148;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Lum;")
    private class306 field6150;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lps;Z)V")
    private final void method2692(class52 arg0, boolean arg1) {
        if (arg1) {
            arg0.method348();
        }
        arg0.field776 = false;
        arg0.method2459(198);
        this.method2695();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
    public final void method2693() {
        if (this.field6142 != null) {
            this.field6142 = null;
            this.field6147 = null;
            this.field6150 = null;
            this.field6148 = null;
            this.field6146 = true;
            this.field6149 = true;
            this.field6152 = true;
            if (!this.field6139.method1300((byte) -93)) {
                for (class376 var1 = this.field6139.method1312((byte) 25); var1 != this.field6139.field2720; var1 = var1.field5365) {
                    ((class52) var1).method348();
                }
            }
        }
        this.field6144 = this.field6140 = -1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lps;)V")
    public final void method2694(class52 arg0) {
        this.method2692(arg0, true);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()V")
    private final void method2695() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class52 var4 = (class52) this.field6139.method1312((byte) 25); var4 != null; var4 = (class52) this.field6139.method1304(117)) {
            int var5 = var4.method354();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method355(1);
            var3 |= var4.method347(-57);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6151 != var6) {
            this.field6151 = var6;
            this.field6146 = true;
        }
        int var7 = this.field6154 > 2 ? 2 : this.field6154;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field6152 = this.field6146 = true;
        }
        if (this.field6153 != var3) {
            this.field6153 = var3;
            this.field6149 = true;
        }
        this.field6154 = var2;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lps;)Z")
    public final boolean method2696(class52 arg0) {
        if (this.field6142 != null) {
            if (arg0.method353() || arg0.method349()) {
                if (this.field6144 != -1 && this.field6140 != -1) {
                    arg0.method352(this.field6144, this.field6140);
                }
                arg0.field776 = true;
                this.field6139.method1301(50, arg0);
                this.method2695();
                return true;
            }
            arg0.method348();
        }
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()Z")
    private final boolean method2697() {
        return this.field6143.method2171() == this.field6142;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "()V")
    public final void method2698() {
        if (!this.method2697()) {
            return;
        }
        opengl var1 = this.field6143.field4607;
        this.field6143.method2118();
        this.field6143.method2125(0);
        this.field6143.method1812();
        int var2 = 0;
        int var3 = 1;
        class52 var5;
        for (class52 var4 = (class52) this.field6139.method1312((byte) 25); var4 != null; var4 = var5) {
            var5 = (class52) this.field6139.method1304(117);
            int var6 = var4.method355(1);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method351(var7, this.field6147[var2], this.field6148);
                if (var5 == null && var6 - 1 == var7) {
                    this.field6143.method2170(this.field6142);
                    this.field6143.method2105(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field6140);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field6141, this.field6145);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field6141, this.field6145 + this.field6140);
                    var1.glTexCoord2f((float) this.field6144, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6144 + this.field6141, this.field6145 + this.field6140);
                    var1.glTexCoord2f((float) this.field6144, (float) this.field6140);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6144 + this.field6141, this.field6145);
                    var1.glEnd();
                } else {
                    this.field6142.method2022(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field6140);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field6140);
                    var1.glTexCoord2f((float) this.field6144, (float) this.field6140);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6144, this.field6140);
                    var1.glTexCoord2f((float) this.field6144, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6144, 0);
                    var1.glEnd();
                }
                var4.method356(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)Z")
    public final boolean method2699(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6142 == null || this.field6139.method1300((byte) -125)) {
            return false;
        }
        boolean var5 = false;
        if (this.field6144 != arg2 || this.field6140 != arg3) {
            this.field6144 = arg2;
            this.field6140 = arg3;
            for (class376 var6 = this.field6139.method1312((byte) 25); var6 != this.field6139.field2720; var6 = var6.field5365) {
                ((class52) var6).method352(this.field6144, this.field6140);
            }
            this.field6146 = true;
            this.field6149 = true;
        }
        if (this.field6149) {
            if (this.field6150 != null) {
                this.field6150.method1952();
                this.field6150 = null;
            }
            if (this.field6148 != null) {
                this.field6148.method906();
                this.field6148 = null;
            }
            if (this.field6153) {
                this.field6148 = new class195(this.field6143, 34037, 6402, this.field6144, this.field6140);
            } else {
                this.field6150 = new class306(this.field6143, 6402, this.field6144, this.field6140);
            }
            this.field6152 = true;
            this.field6149 = false;
            var5 = true;
        }
        if (this.field6146) {
            if (this.field6147[0] != null) {
                this.field6147[0].method906();
                this.field6147[0] = null;
            }
            if (this.field6147[1] != null) {
                this.field6147[1].method906();
                this.field6147[1] = null;
            }
            this.field6147[0] = new class195(this.field6143, 34037, this.field6151, this.field6144, this.field6140);
            this.field6147[1] = this.field6154 > 1 ? new class195(this.field6143, 34037, this.field6151, this.field6144, this.field6140) : null;
            this.field6152 = true;
            this.field6146 = false;
            var5 = true;
        }
        int var7 = this.field6143.method2171().method1181();
        this.field6143.method2128(this.field6142);
        if (this.field6152) {
            this.field6142.method2018(0);
            this.field6142.method2018(1);
            this.field6142.method2018(8);
            if (this.field6147[0] != null) {
                this.field6142.method2017(0, this.field6147[0]);
            }
            if (this.field6147[1] != null) {
                this.field6142.method2017(1, this.field6147[1]);
            }
            if (this.field6148 != null) {
                this.field6142.method2017(8, this.field6148);
            }
            if (this.field6150 != null) {
                this.field6142.method2023(8, this.field6150);
            }
            this.field6142.method2022(0);
            this.field6152 = false;
            var5 = true;
        }
        if (!var5 || this.field6142.method2016()) {
            this.field6141 = arg0;
            this.field6145 = arg1;
            this.field6143.method2105(-this.field6141, this.field6145 + this.field6140 - var7);
            return true;
        }
        this.field6143.method2170(this.field6142);
        this.field6146 = true;
        this.field6149 = true;
        this.field6152 = true;
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lhj;)V")
    public class428(class338 arg0) {
        this.field6143 = arg0;
        if (this.field6143.field4705 && this.field6143.field4693) {
            this.field6142 = new class317(this.field6143);
        }
    }
}
