import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class310 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    private int field4582 = -1;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    private int field4586 = 0;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    private int field4587 = 0;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    private int field4588 = -1;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Lm;")
    private class242 field4583 = new class242();

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "[Loa;")
    private class121[] field4590 = new class121[2];

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Z")
    private boolean field4591 = false;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "Z")
    private boolean field4593 = true;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "Z")
    private boolean field4589 = true;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "Z")
    private boolean field4592 = true;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    private int field4596 = 0;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    private int field4595 = -1;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "Lse;")
    private class282 field4584;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljj;")
    private class18 field4585;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Loa;")
    private class121 field4597;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Lij;")
    private class152 field4594;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)Z")
    public final boolean method2046(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4585 == null || this.field4583.method1563(11395)) {
            return false;
        }
        boolean var5 = false;
        if (this.field4582 != arg2 || this.field4588 != arg3) {
            this.field4582 = arg2;
            this.field4588 = arg3;
            for (class418 var6 = this.field4583.method1575(0); var6 != this.field4583.field3397; var6 = var6.field6094) {
                ((class61) var6).method547(this.field4582, this.field4588);
            }
            this.field4589 = true;
            this.field4592 = true;
        }
        if (this.field4592) {
            if (this.field4594 != null) {
                this.field4594.method1033();
                this.field4594 = null;
            }
            if (this.field4597 != null) {
                this.field4597.method2283();
                this.field4597 = null;
            }
            if (this.field4591) {
                this.field4597 = new class121(this.field4584, 34037, 6402, this.field4582, this.field4588);
            } else {
                this.field4594 = new class152(this.field4584, 6402, this.field4582, this.field4588);
            }
            this.field4593 = true;
            this.field4592 = false;
            var5 = true;
        }
        if (this.field4589) {
            if (this.field4590[0] != null) {
                this.field4590[0].method2283();
                this.field4590[0] = null;
            }
            if (this.field4590[1] != null) {
                this.field4590[1].method2283();
                this.field4590[1] = null;
            }
            this.field4590[0] = new class121(this.field4584, 34037, this.field4595, this.field4582, this.field4588);
            this.field4590[1] = this.field4596 > 1 ? new class121(this.field4584, 34037, this.field4595, this.field4582, this.field4588) : null;
            this.field4593 = true;
            this.field4589 = false;
            var5 = true;
        }
        int var7 = this.field4584.method1909().method140();
        this.field4584.method1884(this.field4585);
        if (this.field4593) {
            this.field4585.method131(0);
            this.field4585.method131(1);
            this.field4585.method131(8);
            if (this.field4590[0] != null) {
                this.field4585.method139(0, this.field4590[0]);
            }
            if (this.field4590[1] != null) {
                this.field4585.method139(1, this.field4590[1]);
            }
            if (this.field4597 != null) {
                this.field4585.method139(8, this.field4597);
            }
            if (this.field4594 != null) {
                this.field4585.method138(8, this.field4594);
            }
            this.field4585.method135(0);
            this.field4593 = false;
            var5 = true;
        }
        if (!var5 || this.field4585.method142()) {
            this.field4586 = arg0;
            this.field4587 = arg1;
            this.field4584.method1876(-this.field4586, this.field4588 + this.field4587 - var7);
            return true;
        }
        this.field4584.method1916(this.field4585);
        this.field4589 = true;
        this.field4592 = true;
        this.field4593 = true;
        return false;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()Z")
    private final boolean method2047() {
        return this.field4584.method1909() == this.field4585;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lnm;)V")
    public final void method2048(class61 arg0) {
        this.method2053(arg0, true);
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "()V")
    public final void method2049() {
        if (!this.method2047()) {
            return;
        }
        opengl var1 = this.field4584.field4140;
        this.field4584.method1928();
        this.field4584.method1933(0);
        this.field4584.method472();
        int var2 = 0;
        int var3 = 1;
        class61 var5;
        for (class61 var4 = (class61) this.field4583.method1575(0); var4 != null; var4 = var5) {
            var5 = (class61) this.field4583.method1573((byte) -128);
            int var6 = var4.method540(4);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method538(var7, this.field4590[var2], this.field4597);
                if (var5 == null && var6 - 1 == var7) {
                    this.field4584.method1916(this.field4585);
                    this.field4584.method1876(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field4588);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field4586, this.field4587);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field4586, this.field4588 + this.field4587);
                    var1.glTexCoord2f((float) this.field4582, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4586 + this.field4582, this.field4588 + this.field4587);
                    var1.glTexCoord2f((float) this.field4582, (float) this.field4588);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4586 + this.field4582, this.field4587);
                    var1.glEnd();
                } else {
                    this.field4585.method135(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field4588);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field4588);
                    var1.glTexCoord2f((float) this.field4582, (float) this.field4588);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4582, this.field4588);
                    var1.glTexCoord2f((float) this.field4582, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4582, 0);
                    var1.glEnd();
                }
                var4.method543(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(Lnm;)Z")
    public final boolean method2050(class61 arg0) {
        if (this.field4585 != null) {
            if (arg0.method545() || arg0.method542()) {
                if (this.field4582 != -1 && this.field4588 != -1) {
                    arg0.method547(this.field4582, this.field4588);
                }
                arg0.field933 = true;
                this.field4583.method1560(-99, arg0);
                this.method2052();
                return true;
            }
            arg0.method546();
        }
        return false;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "()V")
    public final void method2051() {
        if (this.field4585 != null) {
            this.field4585 = null;
            this.field4590 = null;
            this.field4594 = null;
            this.field4597 = null;
            this.field4589 = true;
            this.field4592 = true;
            this.field4593 = true;
            if (!this.field4583.method1563(11395)) {
                for (class418 var1 = this.field4583.method1575(0); var1 != this.field4583.field3397; var1 = var1.field6094) {
                    ((class61) var1).method546();
                }
            }
        }
        this.field4582 = this.field4588 = -1;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "()V")
    private final void method2052() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class61 var4 = (class61) this.field4583.method1575(0); var4 != null; var4 = (class61) this.field4583.method1573((byte) -128)) {
            int var5 = var4.method541();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method540(4);
            var3 |= var4.method539((byte) 72);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4595 != var6) {
            this.field4595 = var6;
            this.field4589 = true;
        }
        int var7 = this.field4596 > 2 ? 2 : this.field4596;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field4593 = this.field4589 = true;
        }
        if (this.field4591 != var3) {
            this.field4591 = var3;
            this.field4592 = true;
        }
        this.field4596 = var2;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lnm;Z)V")
    private final void method2053(class61 arg0, boolean arg1) {
        if (arg1) {
            arg0.method546();
        }
        arg0.field933 = false;
        arg0.method2632(true);
        this.method2052();
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lse;)V")
    public class310(class282 arg0) {
        this.field4584 = arg0;
        if (this.field4584.field4212 && this.field4584.field4217) {
            this.field4585 = new class18(this.field4584);
        }
    }
}
