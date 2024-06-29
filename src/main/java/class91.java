import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class91 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    private int field1262 = -1;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    private int field1259 = -1;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    private int field1260 = 0;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    private int field1261 = 0;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lat;")
    private class412 field1264 = new class412();

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "[Lhi;")
    private class41[] field1265 = new class41[2];

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Z")
    private boolean field1271 = true;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    private int field1266 = -1;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Z")
    private boolean field1269 = true;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
    private boolean field1268 = false;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
    private boolean field1267 = true;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    private int field1272 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lnm;")
    private class254 field1258;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Lgg;")
    private class202 field1263;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lkf;")
    private class195 field1273;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lhi;")
    private class41 field1270;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)Z")
    public final boolean method702(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1263 == null || this.field1264.method2458(-116)) {
            return false;
        }
        boolean var5 = false;
        if (this.field1259 != arg2 || this.field1262 != arg3) {
            this.field1259 = arg2;
            this.field1262 = arg3;
            for (class35 var6 = this.field1264.method2456(32101); var6 != this.field1264.field5951; var6 = var6.field434) {
                ((class369) var6).method2282(this.field1259, this.field1262);
            }
            this.field1271 = true;
            this.field1267 = true;
        }
        if (this.field1267) {
            if (this.field1273 != null) {
                this.field1273.method1337();
                this.field1273 = null;
            }
            if (this.field1270 != null) {
                this.field1270.method222();
                this.field1270 = null;
            }
            if (this.field1268) {
                this.field1270 = new class41(this.field1258, 34037, 6402, this.field1259, this.field1262);
            } else {
                this.field1273 = new class195(this.field1258, 6402, this.field1259, this.field1262);
            }
            this.field1269 = true;
            this.field1267 = false;
            var5 = true;
        }
        if (this.field1271) {
            if (this.field1265[0] != null) {
                this.field1265[0].method222();
                this.field1265[0] = null;
            }
            if (this.field1265[1] != null) {
                this.field1265[1].method222();
                this.field1265[1] = null;
            }
            this.field1265[0] = new class41(this.field1258, 34037, this.field1266, this.field1259, this.field1262);
            this.field1265[1] = this.field1272 > 1 ? new class41(this.field1258, 34037, this.field1266, this.field1259, this.field1262) : null;
            this.field1269 = true;
            this.field1271 = false;
            var5 = true;
        }
        int var7 = this.field1258.method1641().method1382();
        this.field1258.method1612(this.field1263);
        if (this.field1269) {
            this.field1263.method1380(0);
            this.field1263.method1380(1);
            this.field1263.method1380(8);
            if (this.field1265[0] != null) {
                this.field1263.method1374(0, this.field1265[0]);
            }
            if (this.field1265[1] != null) {
                this.field1263.method1374(1, this.field1265[1]);
            }
            if (this.field1270 != null) {
                this.field1263.method1374(8, this.field1270);
            }
            if (this.field1273 != null) {
                this.field1263.method1377(8, this.field1273);
            }
            this.field1263.method1372(0);
            this.field1269 = false;
            var5 = true;
        }
        if (!var5 || this.field1263.method1381()) {
            this.field1260 = arg0;
            this.field1261 = arg1;
            this.field1258.method1620(-this.field1260, this.field1262 + this.field1261 - var7);
            return true;
        }
        this.field1258.method1659(this.field1263);
        this.field1271 = true;
        this.field1267 = true;
        this.field1269 = true;
        return false;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lkh;)V")
    public final void method703(class369 arg0) {
        this.method704(arg0, true);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lkh;Z)V")
    private final void method704(class369 arg0, boolean arg1) {
        if (arg1) {
            arg0.method2278();
        }
        arg0.field5563 = false;
        arg0.method283(2);
        this.method709();
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
    public final void method705() {
        if (!this.method707()) {
            return;
        }
        opengl var1 = this.field1258.field3648;
        this.field1258.method1673();
        this.field1258.method1657(0);
        this.field1258.method493();
        int var2 = 0;
        int var3 = 1;
        class369 var5;
        for (class369 var4 = (class369) this.field1264.method2456(32101); var4 != null; var4 = var5) {
            var5 = (class369) this.field1264.method2461(301);
            int var6 = var4.method2280(-15240);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method2286(var7, this.field1265[var2], this.field1270);
                if (var5 == null && var6 - 1 == var7) {
                    this.field1258.method1659(this.field1263);
                    this.field1258.method1620(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field1262);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field1260, this.field1261);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field1260, this.field1262 + this.field1261);
                    var1.glTexCoord2f((float) this.field1259, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field1260 + this.field1259, this.field1262 + this.field1261);
                    var1.glTexCoord2f((float) this.field1259, (float) this.field1262);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field1260 + this.field1259, this.field1261);
                    var1.glEnd();
                } else {
                    this.field1263.method1372(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field1262);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field1262);
                    var1.glTexCoord2f((float) this.field1259, (float) this.field1262);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field1259, this.field1262);
                    var1.glTexCoord2f((float) this.field1259, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field1259, 0);
                    var1.glEnd();
                }
                var4.method2277(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Lkh;)Z")
    public final boolean method706(class369 arg0) {
        if (this.field1263 != null) {
            if (arg0.method2284() || arg0.method2281()) {
                if (this.field1259 != -1 && this.field1262 != -1) {
                    arg0.method2282(this.field1259, this.field1262);
                }
                arg0.field5563 = true;
                this.field1264.method2453((byte) -126, arg0);
                this.method709();
                return true;
            }
            arg0.method2278();
        }
        return false;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()Z")
    private final boolean method707() {
        return this.field1258.method1641() == this.field1263;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "()V")
    public final void method708() {
        if (this.field1263 != null) {
            this.field1263 = null;
            this.field1265 = null;
            this.field1273 = null;
            this.field1270 = null;
            this.field1271 = true;
            this.field1267 = true;
            this.field1269 = true;
            if (!this.field1264.method2458(-40)) {
                for (class35 var1 = this.field1264.method2456(32101); var1 != this.field1264.field5951; var1 = var1.field434) {
                    ((class369) var1).method2278();
                }
            }
        }
        this.field1259 = this.field1262 = -1;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "()V")
    private final void method709() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class369 var4 = (class369) this.field1264.method2456(32101); var4 != null; var4 = (class369) this.field1264.method2461(301)) {
            int var5 = var4.method2285();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method2280(-15240);
            var3 |= var4.method2283(15271);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1266 != var6) {
            this.field1266 = var6;
            this.field1271 = true;
        }
        int var7 = this.field1272 > 2 ? 2 : this.field1272;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field1269 = this.field1271 = true;
        }
        if (this.field1268 != var3) {
            this.field1268 = var3;
            this.field1267 = true;
        }
        this.field1272 = var2;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lnm;)V")
    public class91(class254 arg0) {
        this.field1258 = arg0;
        if (this.field1258.field3776 && this.field1258.field3685) {
            this.field1263 = new class202(this.field1258);
        }
    }
}
