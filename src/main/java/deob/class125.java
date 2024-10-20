package deob;

@ObfuscatedName("db")
public class class125 {

    @ObfuscatedName("db.a")
    public boolean field1482;

    @ObfuscatedName("db.f")
    public boolean field1481;

    @ObfuscatedName("db.c")
    public class124 field1491;

    @ObfuscatedName("db.x")
    public class124 field1490;

    @ObfuscatedName("db.h")
    public class121[] field1494;

    @ObfuscatedName("db.j")
    public boolean field1485;

    @ObfuscatedName("db.y")
    public float field1486;

    @ObfuscatedName("db.d")
    public float field1487;

    @ObfuscatedName("db.n")
    public float[] field1488 = new float[4];

    @ObfuscatedName("db.r")
    public float[] field1489 = new float[4];

    @ObfuscatedName("db.l")
    public boolean field1484 = true;

    @ObfuscatedName("db.s")
    public int field1480 = 0;

    @ObfuscatedName("db.p")
    public float[] field1492;

    @ObfuscatedName("db.b")
    public int field1493;

    @ObfuscatedName("db.o")
    public int field1497;

    @ObfuscatedName("db.u")
    public float field1495;

    @ObfuscatedName("db.z")
    public float field1496;

    @ObfuscatedName("db.a(Lqr;II)I")
    public int method2753(class464 arg0, int arg1) {
        int var3 = arg0.method7716();
        class131.method5717(arg0.method7735());
        this.field1491 = class124.method1933(arg0.method7735());
        this.field1490 = class124.method1933(arg0.method7735());
        this.field1482 = arg0.method7735() != 0;
        this.field1494 = new class121[var3];
        class121 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class121 var6 = new class121();
            var6.method2692(arg0, arg1);
            this.field1494[var5] = var6;
            if (var4 != null) {
                var4.field1445 = var6;
            }
            var4 = var6;
        }
        this.field1493 = this.field1494[0].field1442;
        this.field1497 = this.field1494[this.method2759() - 1].field1442;
        this.field1492 = new float[this.method2756() + 1];
        for (int var7 = this.method2776(); var7 <= this.method2755(); var7++) {
            this.field1492[var7 - this.method2776()] = class122.method2837(this, (float) var7);
        }
        this.field1494 = null;
        this.field1495 = class122.method2837(this, (float) (this.method2776() - 1));
        this.field1496 = class122.method2837(this, (float) (this.method2755() + 1));
        return var3;
    }

    @ObfuscatedName("db.f(II)F")
    public float method2764(int arg0) {
        if (arg0 < this.method2776()) {
            return this.field1495;
        } else if (arg0 > this.method2755()) {
            return this.field1496;
        } else {
            return this.field1492[arg0 - this.method2776()];
        }
    }

    @ObfuscatedName("db.c(I)I")
    public int method2776() {
        return this.field1493;
    }

    @ObfuscatedName("db.x(B)I")
    public int method2755() {
        return this.field1497;
    }

    @ObfuscatedName("db.h(I)I")
    public int method2756() {
        return this.method2755() - this.method2776();
    }

    @ObfuscatedName("db.j(FI)I")
    public int method2757(float arg0) {
        if (this.field1480 >= 0 && ((float) this.field1494[this.field1480].field1442 <= arg0) && this.field1494[this.field1480].field1445 == null || ((float) this.field1494[this.field1480].field1445.field1442 > arg0)) {
            return this.field1480;
        } else if ((arg0 < (float) this.method2776()) || (arg0 > (float) this.method2755())) {
            return -1;
        } else {
            int var2 = this.method2759();
            int var3 = this.field1480;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1494[var6].field1442) {
                        if (arg0 > (float) this.field1494[var6 - 1].field1442) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1494[var6].field1442)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1494[var6 + 1].field1442) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1480 != var3) {
                this.field1480 = var3;
                this.field1484 = true;
            }
            return this.field1480;
        }
    }

    @ObfuscatedName("db.y(FB)Ldo;")
    public class121 method2758(float arg0) {
        int var2 = this.method2757(arg0);
        return var2 >= 0 && var2 < this.field1494.length ? this.field1494[var2] : null;
    }

    @ObfuscatedName("db.d(I)I")
    public int method2759() {
        return this.field1494 == null ? 0 : this.field1494.length;
    }
}
