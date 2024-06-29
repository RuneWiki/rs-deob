import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class35 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    private int field448 = -1;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    private int field450 = -1;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    private int field452 = 0;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lkr;")
    private class486 field447 = new class486();

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Z")
    private boolean field455 = true;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "Z")
    private boolean field456 = true;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    private int field457 = -1;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "[Lkh;")
    private class13[] field459 = new class13[2];

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Z")
    private boolean field461 = false;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "Z")
    private boolean field454 = true;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    private int field462 = 0;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Lmi;")
    private class315 field449;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "Lla;")
    private class288 field451;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Lkh;")
    private class13 field460;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "Lhb;")
    private class471 field458;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lln;Z)V")
    private final void method232(class234 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1069();
        }
        arg0.field3531 = false;
        arg0.method1510((byte) -13);
        this.method234();
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lln;)Z")
    public final boolean method233(class234 arg0) {
        if (this.field451 != null) {
            if (arg0.method1072() || arg0.method1073()) {
                if (this.field448 != -1 && this.field450 != -1) {
                    arg0.method1071(this.field448, this.field450);
                }
                arg0.field3531 = true;
                this.field447.method2845(arg0, (byte) 37);
                this.method234();
                return true;
            }
            arg0.method1069();
        }
        return false;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
    private final void method234() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class234 var4 = (class234) this.field447.method2843(1123227612); var4 != null; var4 = (class234) this.field447.method2842(1673506446)) {
            int var5 = var4.method1070();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method1497(0);
            var3 |= var4.method1495((byte) 97);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field457 != var6) {
            this.field457 = var6;
            this.field455 = true;
        }
        int var7 = this.field462 > 2 ? 2 : this.field462;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field454 = this.field455 = true;
        }
        if (this.field461 != var3) {
            this.field461 = var3;
            this.field456 = true;
        }
        this.field462 = var2;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z")
    public final boolean method235(int arg0, int arg1, int arg2, int arg3) {
        if (this.field451 == null || this.field447.method2851(false)) {
            return false;
        }
        boolean var5 = false;
        if (this.field448 != arg2 || this.field450 != arg3) {
            this.field448 = arg2;
            this.field450 = arg3;
            for (class238 var6 = this.field447.method2843(1123227612); var6 != this.field447.field6838; var6 = var6.field3575) {
                ((class234) var6).method1071(this.field448, this.field450);
            }
            this.field455 = true;
            this.field456 = true;
        }
        if (this.field456) {
            if (this.field458 != null) {
                this.field458.method2773();
                this.field458 = null;
            }
            if (this.field460 != null) {
                this.field460.method2503();
                this.field460 = null;
            }
            if (this.field461) {
                this.field460 = new class13(this.field449, 34037, 6402, this.field448, this.field450);
            } else {
                this.field458 = new class471(this.field449, 6402, this.field448, this.field450);
            }
            this.field454 = true;
            this.field456 = false;
            var5 = true;
        }
        if (this.field455) {
            if (this.field459[0] != null) {
                this.field459[0].method2503();
                this.field459[0] = null;
            }
            if (this.field459[1] != null) {
                this.field459[1].method2503();
                this.field459[1] = null;
            }
            this.field459[0] = new class13(this.field449, 34037, this.field457, this.field448, this.field450);
            this.field459[1] = this.field462 > 1 ? new class13(this.field449, 34037, this.field457, this.field448, this.field450) : null;
            this.field454 = true;
            this.field455 = false;
            var5 = true;
        }
        int var7 = this.field449.method2011().method1139();
        this.field449.method1969(this.field451);
        if (this.field454) {
            this.field451.method1805(0);
            this.field451.method1805(1);
            this.field451.method1805(8);
            if (this.field459[0] != null) {
                this.field451.method1799(0, this.field459[0]);
            }
            if (this.field459[1] != null) {
                this.field451.method1799(1, this.field459[1]);
            }
            if (this.field460 != null) {
                this.field451.method1799(8, this.field460);
            }
            if (this.field458 != null) {
                this.field451.method1803(8, this.field458);
            }
            this.field451.method1800(0);
            this.field454 = false;
            var5 = true;
        }
        if (!var5 || this.field451.method1804()) {
            this.field452 = arg0;
            this.field453 = arg1;
            this.field449.method1948(-this.field452, this.field453 + this.field450 - var7);
            return true;
        }
        this.field449.method2009(this.field451);
        this.field455 = true;
        this.field456 = true;
        this.field454 = true;
        return false;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "()Z")
    private final boolean method236() {
        return this.field449.method2011() == this.field451;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "()V")
    public final void method237() {
        if (this.field451 != null) {
            this.field451 = null;
            this.field459 = null;
            this.field458 = null;
            this.field460 = null;
            this.field455 = true;
            this.field456 = true;
            this.field454 = true;
            if (!this.field447.method2851(false)) {
                for (class238 var1 = this.field447.method2843(1123227612); var1 != this.field447.field6838; var1 = var1.field3575) {
                    ((class234) var1).method1069();
                }
            }
        }
        this.field448 = this.field450 = -1;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lln;)V")
    public final void method238(class234 arg0) {
        this.method232(arg0, true);
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "()V")
    public final void method239() {
        if (!this.method236()) {
            return;
        }
        opengl var1 = this.field449.field4445;
        this.field449.method1956();
        this.field449.method1995(0);
        this.field449.method691();
        int var2 = 0;
        int var3 = 1;
        class234 var5;
        for (class234 var4 = (class234) this.field447.method2843(1123227612); var4 != null; var4 = var5) {
            var5 = (class234) this.field447.method2842(1673506446);
            int var6 = var4.method1497(0);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method1074(var7, this.field459[var2], this.field460);
                if (var5 == null && var6 - 1 == var7) {
                    this.field449.method2009(this.field451);
                    this.field449.method1948(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field450);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field452, this.field453);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field452, this.field453 + this.field450);
                    var1.glTexCoord2f((float) this.field448, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field452 + this.field448, this.field453 + this.field450);
                    var1.glTexCoord2f((float) this.field448, (float) this.field450);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field452 + this.field448, this.field453);
                    var1.glEnd();
                } else {
                    this.field451.method1800(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field450);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field450);
                    var1.glTexCoord2f((float) this.field448, (float) this.field450);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field448, this.field450);
                    var1.glTexCoord2f((float) this.field448, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field448, 0);
                    var1.glEnd();
                }
                var4.method1075(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lmi;)V")
    public class35(class315 arg0) {
        this.field449 = arg0;
        if (this.field449.field4579 && this.field449.field4499) {
            this.field451 = new class288(this.field449);
        }
    }
}
