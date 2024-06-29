import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class279 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    private int field4005 = -1;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    private int field4008 = 0;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    private int field4007 = 0;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    private int field4009 = -1;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lkn;")
    private class442 field4006 = new class442();

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[Lhf;")
    private class225[] field4014 = new class225[2];

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Z")
    private boolean field4013 = true;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Z")
    private boolean field4012 = true;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
    private boolean field4016 = true;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    private int field4019 = -1;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Z")
    private boolean field4018 = false;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    private int field4015 = 0;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lig;")
    private class132 field4011;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lgg;")
    private class95 field4010;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Lrr;")
    private class203 field4020;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lhf;")
    private class225 field4017;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Z")
    public final boolean method1921(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4010 == null || this.field4006.method2759(-1)) {
            return false;
        }
        boolean var5 = false;
        if (this.field4009 != arg2 || this.field4005 != arg3) {
            this.field4009 = arg2;
            this.field4005 = arg3;
            for (class425 var6 = this.field4006.method2752(-80); var6 != this.field4006.field6329; var6 = var6.field6074) {
                ((class29) var6).method165(this.field4009, this.field4005);
            }
            this.field4016 = true;
            this.field4013 = true;
        }
        if (this.field4013) {
            if (this.field4020 != null) {
                this.field4020.method1419();
                this.field4020 = null;
            }
            if (this.field4017 != null) {
                this.field4017.method2532();
                this.field4017 = null;
            }
            if (this.field4018) {
                this.field4017 = new class225(this.field4011, 34037, 6402, this.field4009, this.field4005);
            } else {
                this.field4020 = new class203(this.field4011, 6402, this.field4009, this.field4005);
            }
            this.field4012 = true;
            this.field4013 = false;
            var5 = true;
        }
        if (this.field4016) {
            if (this.field4014[0] != null) {
                this.field4014[0].method2532();
                this.field4014[0] = null;
            }
            if (this.field4014[1] != null) {
                this.field4014[1].method2532();
                this.field4014[1] = null;
            }
            this.field4014[0] = new class225(this.field4011, 34037, this.field4019, this.field4009, this.field4005);
            this.field4014[1] = this.field4015 > 1 ? new class225(this.field4011, 34037, this.field4019, this.field4009, this.field4005) : null;
            this.field4012 = true;
            this.field4016 = false;
            var5 = true;
        }
        int var7 = this.field4011.method978().method565();
        this.field4011.method872(this.field4010);
        if (this.field4012) {
            this.field4010.method558(0);
            this.field4010.method558(1);
            this.field4010.method558(8);
            if (this.field4014[0] != null) {
                this.field4010.method560(0, this.field4014[0]);
            }
            if (this.field4014[1] != null) {
                this.field4010.method560(1, this.field4014[1]);
            }
            if (this.field4017 != null) {
                this.field4010.method560(8, this.field4017);
            }
            if (this.field4020 != null) {
                this.field4010.method562(8, this.field4020);
            }
            this.field4010.method566(0);
            this.field4012 = false;
            var5 = true;
        }
        if (!var5 || this.field4010.method563()) {
            this.field4008 = arg0;
            this.field4007 = arg1;
            this.field4011.method927(-this.field4008, this.field4007 + this.field4005 - var7);
            return true;
        }
        this.field4011.method966(this.field4010);
        this.field4016 = true;
        this.field4013 = true;
        this.field4012 = true;
        return false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
    private final void method1922() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class29 var4 = (class29) this.field4006.method2752(-104); var4 != null; var4 = (class29) this.field4006.method2754(-1)) {
            int var5 = var4.method159();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method160(1);
            var3 |= var4.method156(125);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4019 != var6) {
            this.field4019 = var6;
            this.field4016 = true;
        }
        int var7 = this.field4015 > 2 ? 2 : this.field4015;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field4012 = this.field4016 = true;
        }
        if (this.field4018 != var3) {
            this.field4018 = var3;
            this.field4013 = true;
        }
        this.field4015 = var2;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()Z")
    private final boolean method1923() {
        return this.field4011.method978() == this.field4010;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lgs;)Z")
    public final boolean method1924(class29 arg0) {
        if (this.field4010 != null) {
            if (arg0.method157() || arg0.method164()) {
                if (this.field4009 != -1 && this.field4005 != -1) {
                    arg0.method165(this.field4009, this.field4005);
                }
                arg0.field360 = true;
                this.field4006.method2756(-57, arg0);
                this.method1922();
                return true;
            }
            arg0.method158();
        }
        return false;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()V")
    public final void method1925() {
        if (this.field4010 != null) {
            this.field4010 = null;
            this.field4014 = null;
            this.field4020 = null;
            this.field4017 = null;
            this.field4016 = true;
            this.field4013 = true;
            this.field4012 = true;
            if (!this.field4006.method2759(-1)) {
                for (class425 var1 = this.field4006.method2752(-81); var1 != this.field4006.field6329; var1 = var1.field6074) {
                    ((class29) var1).method158();
                }
            }
        }
        this.field4009 = this.field4005 = -1;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lgs;)V")
    public final void method1926(class29 arg0) {
        this.method1927(arg0, true);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lgs;Z)V")
    private final void method1927(class29 arg0, boolean arg1) {
        if (arg1) {
            arg0.method158();
        }
        arg0.field360 = false;
        arg0.method2660((byte) 113);
        this.method1922();
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()V")
    public final void method1928() {
        if (!this.method1923()) {
            return;
        }
        opengl var1 = this.field4011.field1918;
        this.field4011.method889();
        this.field4011.method972(0);
        this.field4011.method931();
        int var2 = 0;
        int var3 = 1;
        class29 var5;
        for (class29 var4 = (class29) this.field4006.method2752(-99); var4 != null; var4 = var5) {
            var5 = (class29) this.field4006.method2754(-1);
            int var6 = var4.method160(1);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method161(var7, this.field4014[var2], this.field4017);
                if (var5 == null && var6 - 1 == var7) {
                    this.field4011.method966(this.field4010);
                    this.field4011.method927(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field4005);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field4008, this.field4007);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field4008, this.field4007 + this.field4005);
                    var1.glTexCoord2f((float) this.field4009, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4009 + this.field4008, this.field4007 + this.field4005);
                    var1.glTexCoord2f((float) this.field4009, (float) this.field4005);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4009 + this.field4008, this.field4007);
                    var1.glEnd();
                } else {
                    this.field4010.method566(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field4005);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field4005);
                    var1.glTexCoord2f((float) this.field4009, (float) this.field4005);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4009, this.field4005);
                    var1.glTexCoord2f((float) this.field4009, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4009, 0);
                    var1.glEnd();
                }
                var4.method162(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lig;)V")
    public class279(class132 arg0) {
        this.field4011 = arg0;
        if (this.field4011.field1969 && this.field4011.field2002) {
            this.field4010 = new class95(this.field4011);
        }
    }
}
