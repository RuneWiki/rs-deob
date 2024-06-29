import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class356 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    private int field4883 = 0;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    private int field4885 = -1;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    private int field4887 = -1;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    private int field4888 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lcf;")
    private class92 field4882 = new class92();

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    private int field4890 = 0;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    private int field4889 = -1;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "[Luo;")
    private class429[] field4892 = new class429[2];

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Z")
    private boolean field4895 = true;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
    private boolean field4896 = false;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Z")
    private boolean field4897 = true;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Z")
    private boolean field4893 = true;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lfu;")
    private class42 field4886;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lhm;")
    private class148 field4884;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Luo;")
    private class429 field4894;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lkd;")
    private class488 field4891;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lef;Z)V", line = 3)
    private final void method2199(class120 arg0, boolean arg1) {
        if (arg1) {
            arg0.method930();
        }
        arg0.field1656 = false;
        arg0.method2714(65);
        this.method2201();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lef;)Z", line = 11)
    public final boolean method2200(class120 arg0) {
        if (this.field4884 != null) {
            if (arg0.method927() || arg0.method926()) {
                if (this.field4887 != -1 && this.field4885 != -1) {
                    arg0.method928(this.field4887, this.field4885);
                }
                arg0.field1656 = true;
                this.field4882.method766(arg0, -1);
                this.method2201();
                return true;
            }
            arg0.method930();
        }
        return false;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 39)
    private final void method2201() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class120 var4 = (class120) this.field4882.method775(1); var4 != null; var4 = (class120) this.field4882.method763(0)) {
            int var5 = var4.method934();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method932(1);
            var3 |= var4.method933((byte) 124);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4889 != var6) {
            this.field4889 = var6;
            this.field4895 = true;
        }
        int var7 = this.field4890 > 2 ? 2 : this.field4890;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field4897 = this.field4895 = true;
        }
        if (this.field4896 != var3) {
            this.field4896 = var3;
            this.field4893 = true;
        }
        this.field4890 = var2;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()Z", line = 94)
    private final boolean method2202() {
        return this.field4886.method305() == this.field4884;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V", line = 97)
    public final void method2203() {
        if (!this.method2202()) {
            return;
        }
        opengl var1 = this.field4886.field557;
        this.field4886.method449();
        this.field4886.method349(0);
        this.field4886.method360();
        int var2 = 0;
        int var3 = 1;
        class120 var5;
        for (class120 var4 = (class120) this.field4882.method775(1); var4 != null; var4 = var5) {
            var5 = (class120) this.field4882.method763(0);
            int var6 = var4.method932(1);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method929(var7, this.field4892[var2], this.field4894);
                if (var5 == null && var6 - 1 == var7) {
                    this.field4886.method413(this.field4884);
                    this.field4886.method395(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field4885);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field4888, this.field4883);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field4888, this.field4885 + this.field4883);
                    var1.glTexCoord2f((float) this.field4887, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4888 + this.field4887, this.field4885 + this.field4883);
                    var1.glTexCoord2f((float) this.field4887, (float) this.field4885);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4888 + this.field4887, this.field4883);
                    var1.glEnd();
                } else {
                    this.field4884.method1054(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field4885);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field4885);
                    var1.glTexCoord2f((float) this.field4887, (float) this.field4885);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4887, this.field4885);
                    var1.glTexCoord2f((float) this.field4887, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4887, 0);
                    var1.glEnd();
                }
                var4.method931(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)Z", line = 175)
    public final boolean method2204(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4884 == null || this.field4882.method765(-63)) {
            return false;
        }
        boolean var5 = false;
        if (this.field4887 != arg2 || this.field4885 != arg3) {
            this.field4887 = arg2;
            this.field4885 = arg3;
            for (class449 var6 = this.field4882.method775(1); var6 != this.field4882.field1299; var6 = var6.field6385) {
                ((class120) var6).method928(this.field4887, this.field4885);
            }
            this.field4895 = true;
            this.field4893 = true;
        }
        if (this.field4893) {
            if (this.field4891 != null) {
                this.field4891.method2871();
                this.field4891 = null;
            }
            if (this.field4894 != null) {
                this.field4894.method2300();
                this.field4894 = null;
            }
            if (this.field4896) {
                this.field4894 = new class429(this.field4886, 34037, 6402, this.field4887, this.field4885);
            } else {
                this.field4891 = new class488(this.field4886, 6402, this.field4887, this.field4885);
            }
            this.field4897 = true;
            this.field4893 = false;
            var5 = true;
        }
        if (this.field4895) {
            if (this.field4892[0] != null) {
                this.field4892[0].method2300();
                this.field4892[0] = null;
            }
            if (this.field4892[1] != null) {
                this.field4892[1].method2300();
                this.field4892[1] = null;
            }
            this.field4892[0] = new class429(this.field4886, 34037, this.field4889, this.field4887, this.field4885);
            this.field4892[1] = this.field4890 > 1 ? new class429(this.field4886, 34037, this.field4889, this.field4887, this.field4885) : null;
            this.field4897 = true;
            this.field4895 = false;
            var5 = true;
        }
        int var7 = this.field4886.method305().method354();
        this.field4886.method319(this.field4884);
        if (this.field4897) {
            this.field4884.method1050(0);
            this.field4884.method1050(1);
            this.field4884.method1050(8);
            if (this.field4892[0] != null) {
                this.field4884.method1051(0, this.field4892[0]);
            }
            if (this.field4892[1] != null) {
                this.field4884.method1051(1, this.field4892[1]);
            }
            if (this.field4894 != null) {
                this.field4884.method1051(8, this.field4894);
            }
            if (this.field4891 != null) {
                this.field4884.method1048(8, this.field4891);
            }
            this.field4884.method1054(0);
            this.field4897 = false;
            var5 = true;
        }
        if (!var5 || this.field4884.method1053()) {
            this.field4888 = arg0;
            this.field4883 = arg1;
            this.field4886.method395(-this.field4888, this.field4885 + this.field4883 - var7);
            return true;
        }
        this.field4886.method413(this.field4884);
        this.field4895 = true;
        this.field4893 = true;
        this.field4897 = true;
        return false;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lfu;)V", line = 361)
    public class356(class42 arg0) {
        this.field4886 = arg0;
        if (this.field4886.field693 && this.field4886.field668) {
            this.field4884 = new class148(this.field4886);
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()V", line = 295)
    public final void method2205() {
        if (this.field4884 != null) {
            this.field4884 = null;
            this.field4892 = null;
            this.field4891 = null;
            this.field4894 = null;
            this.field4895 = true;
            this.field4893 = true;
            this.field4897 = true;
            if (!this.field4882.method765(-91)) {
                for (class449 var1 = this.field4882.method775(1); var1 != this.field4882.field1299; var1 = var1.field6385) {
                    ((class120) var1).method930();
                }
            }
        }
        this.field4887 = this.field4885 = -1;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Lef;)V", line = 332)
    public final void method2206(class120 arg0) {
        this.method2199(arg0, true);
    }
}
