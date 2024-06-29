import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class429 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    private int field6098 = -1;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private int field6100 = 0;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    private int field6099 = 0;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    private int field6101 = -1;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lfi;")
    private class166 field6104 = new class166();

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    private int field6106 = 0;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Z")
    private boolean field6108 = true;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    private int field6111 = -1;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Z")
    private boolean field6109 = false;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
    private boolean field6105 = true;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Z")
    private boolean field6113 = true;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[Loe;")
    private class231[] field6112 = new class231[2];

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Lhd;")
    private class17 field6102;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Lgm;")
    private class337 field6103;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lsr;")
    private class136 field6107;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Loe;")
    private class231 field6110;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
    public final void method2668() {
        if (!this.method2670()) {
            return;
        }
        opengl var1 = this.field6102.field198;
        this.field6102.method198();
        this.field6102.method121(0);
        this.field6102.method122();
        int var2 = 0;
        int var3 = 1;
        class343 var5;
        for (class343 var4 = (class343) this.field6104.method1240((byte) -69); var4 != null; var4 = var5) {
            var5 = (class343) this.field6104.method1245(1);
            int var6 = var4.method2173(1);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method1734(var7, this.field6112[var2], this.field6110);
                if (var5 == null && var6 - 1 == var7) {
                    this.field6102.method214(this.field6103);
                    this.field6102.method140(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field6101);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field6099, this.field6100);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field6099, this.field6101 + this.field6100);
                    var1.glTexCoord2f((float) this.field6098, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6099 + this.field6098, this.field6101 + this.field6100);
                    var1.glTexCoord2f((float) this.field6098, (float) this.field6101);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6099 + this.field6098, this.field6100);
                    var1.glEnd();
                } else {
                    this.field6103.method2137(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field6101);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field6101);
                    var1.glTexCoord2f((float) this.field6098, (float) this.field6101);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6098, this.field6101);
                    var1.glTexCoord2f((float) this.field6098, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6098, 0);
                    var1.glEnd();
                }
                var4.method1737(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lpq;)Z")
    public final boolean method2669(class343 arg0) {
        if (this.field6103 != null) {
            if (arg0.method1738() || arg0.method1735()) {
                if (this.field6098 != -1 && this.field6101 != -1) {
                    arg0.method1733(this.field6098, this.field6101);
                }
                arg0.field4660 = true;
                this.field6104.method1249(arg0, (byte) -112);
                this.method2671();
                return true;
            }
            arg0.method1732();
        }
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()Z")
    private final boolean method2670() {
        return this.field6102.method225() == this.field6103;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()V")
    private final void method2671() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class343 var4 = (class343) this.field6104.method1240((byte) -99); var4 != null; var4 = (class343) this.field6104.method1245(1)) {
            int var5 = var4.method1736();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method2173(1);
            var3 |= var4.method2171((byte) 85);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6111 != var6) {
            this.field6111 = var6;
            this.field6108 = true;
        }
        int var7 = this.field6106 > 2 ? 2 : this.field6106;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field6113 = this.field6108 = true;
        }
        if (this.field6109 != var3) {
            this.field6109 = var3;
            this.field6105 = true;
        }
        this.field6106 = var2;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "()V")
    public final void method2672() {
        if (this.field6103 != null) {
            this.field6103 = null;
            this.field6112 = null;
            this.field6107 = null;
            this.field6110 = null;
            this.field6108 = true;
            this.field6105 = true;
            this.field6113 = true;
            if (!this.field6104.method1247((byte) 120)) {
                for (class381 var1 = this.field6104.method1240((byte) -101); var1 != this.field6104.field2454; var1 = var1.field5346) {
                    ((class343) var1).method1732();
                }
            }
        }
        this.field6098 = this.field6101 = -1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lpq;Z)V")
    private final void method2673(class343 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1732();
        }
        arg0.field4660 = false;
        arg0.method2367(5);
        this.method2671();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Lpq;)V")
    public final void method2674(class343 arg0) {
        this.method2673(arg0, true);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z")
    public final boolean method2675(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6103 == null || this.field6104.method1247((byte) 120)) {
            return false;
        }
        boolean var5 = false;
        if (this.field6098 != arg2 || this.field6101 != arg3) {
            this.field6098 = arg2;
            this.field6101 = arg3;
            for (class381 var6 = this.field6104.method1240((byte) -79); var6 != this.field6104.field2454; var6 = var6.field5346) {
                ((class343) var6).method1733(this.field6098, this.field6101);
            }
            this.field6108 = true;
            this.field6105 = true;
        }
        if (this.field6105) {
            if (this.field6107 != null) {
                this.field6107.method1079();
                this.field6107 = null;
            }
            if (this.field6110 != null) {
                this.field6110.method19();
                this.field6110 = null;
            }
            if (this.field6109) {
                this.field6110 = new class231(this.field6102, 34037, 6402, this.field6098, this.field6101);
            } else {
                this.field6107 = new class136(this.field6102, 6402, this.field6098, this.field6101);
            }
            this.field6113 = true;
            this.field6105 = false;
            var5 = true;
        }
        if (this.field6108) {
            if (this.field6112[0] != null) {
                this.field6112[0].method19();
                this.field6112[0] = null;
            }
            if (this.field6112[1] != null) {
                this.field6112[1].method19();
                this.field6112[1] = null;
            }
            this.field6112[0] = new class231(this.field6102, 34037, this.field6111, this.field6098, this.field6101);
            this.field6112[1] = this.field6106 > 1 ? new class231(this.field6102, 34037, this.field6111, this.field6098, this.field6101) : null;
            this.field6113 = true;
            this.field6108 = false;
            var5 = true;
        }
        int var7 = this.field6102.method225().method185();
        this.field6102.method260(this.field6103);
        if (this.field6113) {
            this.field6103.method2138(0);
            this.field6103.method2138(1);
            this.field6103.method2138(8);
            if (this.field6112[0] != null) {
                this.field6103.method2140(0, this.field6112[0]);
            }
            if (this.field6112[1] != null) {
                this.field6103.method2140(1, this.field6112[1]);
            }
            if (this.field6110 != null) {
                this.field6103.method2140(8, this.field6110);
            }
            if (this.field6107 != null) {
                this.field6103.method2134(8, this.field6107);
            }
            this.field6103.method2137(0);
            this.field6113 = false;
            var5 = true;
        }
        if (!var5 || this.field6103.method2135()) {
            this.field6099 = arg0;
            this.field6100 = arg1;
            this.field6102.method140(-this.field6099, this.field6101 + this.field6100 - var7);
            return true;
        }
        this.field6102.method214(this.field6103);
        this.field6108 = true;
        this.field6105 = true;
        this.field6113 = true;
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lhd;)V")
    public class429(class17 arg0) {
        this.field6102 = arg0;
        if (this.field6102.field295 && this.field6102.field309) {
            this.field6103 = new class337(this.field6102);
        }
    }
}
