import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class408 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    private int field5783 = -1;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    private int field5784 = 0;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    private int field5786 = 0;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    private int field5782 = -1;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Laq;")
    private class90 field5781 = new class90();

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[Lim;")
    private class342[] field5787 = new class342[2];

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Z")
    private boolean field5788 = true;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    private int field5789 = 0;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    private int field5793 = -1;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
    private boolean field5792 = true;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Z")
    private boolean field5790 = true;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Z")
    private boolean field5794 = false;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Ltb;")
    private class227 field5780;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lwq;")
    private class93 field5785;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lwm;")
    private class336 field5791;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lim;")
    private class342 field5795;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()Z", line = 4)
    private final boolean method2554() {
        return this.field5780.method1553() == this.field5785;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Llh;)V", line = 8)
    public final void method2555(class309 arg0) {
        this.method2560(arg0, true);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()V", line = 13)
    public final void method2556() {
        if (!this.method2554()) {
            return;
        }
        opengl var1 = this.field5780.field3184;
        this.field5780.method1511();
        this.field5780.method1510(0);
        this.field5780.method143();
        int var2 = 0;
        int var3 = 1;
        class309 var5;
        for (class309 var4 = (class309) this.field5781.method646(48); var4 != null; var4 = var5) {
            var5 = (class309) this.field5781.method641(false);
            int var6 = var4.method1987((byte) -36);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method1995(var7, this.field5787[var2], this.field5795);
                if (var5 == null && var6 - 1 == var7) {
                    this.field5780.method1557(this.field5785);
                    this.field5780.method1565(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field5782);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field5786, this.field5784);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field5786, this.field5784 + this.field5782);
                    var1.glTexCoord2f((float) this.field5783, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field5786 + this.field5783, this.field5784 + this.field5782);
                    var1.glTexCoord2f((float) this.field5783, (float) this.field5782);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field5786 + this.field5783, this.field5784);
                    var1.glEnd();
                } else {
                    this.field5785.method658(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field5782);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field5782);
                    var1.glTexCoord2f((float) this.field5783, (float) this.field5782);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field5783, this.field5782);
                    var1.glTexCoord2f((float) this.field5783, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field5783, 0);
                    var1.glEnd();
                }
                var4.method1992(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()V", line = 92)
    private final void method2557() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class309 var4 = (class309) this.field5781.method646(48); var4 != null; var4 = (class309) this.field5781.method641(false)) {
            int var5 = var4.method1989();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method1987((byte) -36);
            var3 |= var4.method1993(0);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5793 != var6) {
            this.field5793 = var6;
            this.field5788 = true;
        }
        int var7 = this.field5789 > 2 ? 2 : this.field5789;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field5792 = this.field5788 = true;
        }
        if (this.field5794 != var3) {
            this.field5794 = var3;
            this.field5790 = true;
        }
        this.field5789 = var2;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Llh;)Z", line = 145)
    public final boolean method2558(class309 arg0) {
        if (this.field5785 != null) {
            if (arg0.method1990() || arg0.method1994()) {
                if (this.field5783 != -1 && this.field5782 != -1) {
                    arg0.method1988(this.field5783, this.field5782);
                }
                arg0.field4246 = true;
                this.field5781.method643(arg0, -101);
                this.method2557();
                return true;
            }
            arg0.method1991();
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ltb;)V", line = 361)
    public class408(class227 arg0) {
        this.field5780 = arg0;
        if (this.field5780.field3309 && this.field5780.field3248) {
            this.field5785 = new class93(this.field5780);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()V", line = 176)
    public final void method2559() {
        if (this.field5785 != null) {
            this.field5785 = null;
            this.field5787 = null;
            this.field5791 = null;
            this.field5795 = null;
            this.field5788 = true;
            this.field5790 = true;
            this.field5792 = true;
            if (!this.field5781.method647(false)) {
                for (class390 var1 = this.field5781.method646(48); var1 != this.field5781.field1267; var1 = var1.field5597) {
                    ((class309) var1).method1991();
                }
            }
        }
        this.field5783 = this.field5782 = -1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Llh;Z)V", line = 214)
    private final void method2560(class309 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1991();
        }
        arg0.field4246 = false;
        arg0.method2467((byte) -126);
        this.method2557();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)Z", line = 222)
    public final boolean method2561(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5785 == null || this.field5781.method647(false)) {
            return false;
        }
        boolean var5 = false;
        if (this.field5783 != arg2 || this.field5782 != arg3) {
            this.field5783 = arg2;
            this.field5782 = arg3;
            for (class390 var6 = this.field5781.method646(48); var6 != this.field5781.field1267; var6 = var6.field5597) {
                ((class309) var6).method1988(this.field5783, this.field5782);
            }
            this.field5788 = true;
            this.field5790 = true;
        }
        if (this.field5790) {
            if (this.field5791 != null) {
                this.field5791.method2150();
                this.field5791 = null;
            }
            if (this.field5795 != null) {
                this.field5795.method871();
                this.field5795 = null;
            }
            if (this.field5794) {
                this.field5795 = new class342(this.field5780, 34037, 6402, this.field5783, this.field5782);
            } else {
                this.field5791 = new class336(this.field5780, 6402, this.field5783, this.field5782);
            }
            this.field5792 = true;
            this.field5790 = false;
            var5 = true;
        }
        if (this.field5788) {
            if (this.field5787[0] != null) {
                this.field5787[0].method871();
                this.field5787[0] = null;
            }
            if (this.field5787[1] != null) {
                this.field5787[1].method871();
                this.field5787[1] = null;
            }
            this.field5787[0] = new class342(this.field5780, 34037, this.field5793, this.field5783, this.field5782);
            this.field5787[1] = this.field5789 > 1 ? new class342(this.field5780, 34037, this.field5793, this.field5783, this.field5782) : null;
            this.field5792 = true;
            this.field5788 = false;
            var5 = true;
        }
        int var7 = this.field5780.method1553().method660();
        this.field5780.method1514(this.field5785);
        if (this.field5792) {
            this.field5785.method665(0);
            this.field5785.method665(1);
            this.field5785.method665(8);
            if (this.field5787[0] != null) {
                this.field5785.method663(0, this.field5787[0]);
            }
            if (this.field5787[1] != null) {
                this.field5785.method663(1, this.field5787[1]);
            }
            if (this.field5795 != null) {
                this.field5785.method663(8, this.field5795);
            }
            if (this.field5791 != null) {
                this.field5785.method659(8, this.field5791);
            }
            this.field5785.method658(0);
            this.field5792 = false;
            var5 = true;
        }
        if (!var5 || this.field5785.method666()) {
            this.field5786 = arg0;
            this.field5784 = arg1;
            this.field5780.method1565(-this.field5786, this.field5784 + this.field5782 - var7);
            return true;
        }
        this.field5780.method1557(this.field5785);
        this.field5788 = true;
        this.field5790 = true;
        this.field5792 = true;
        return false;
    }
}
