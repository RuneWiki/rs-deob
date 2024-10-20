package deob;

@ObfuscatedName("dt")
public class class124 {

    @ObfuscatedName("dt.h")
    public final int field1517;

    @ObfuscatedName("dt.e")
    public class124 field1514;

    @ObfuscatedName("dt.v")
    public float[][] field1515;

    @ObfuscatedName("dt.x")
    public final class411[] field1516;

    @ObfuscatedName("dt.m")
    public class411[] field1513;

    @ObfuscatedName("dt.q")
    public class411[] field1518;

    @ObfuscatedName("dt.f")
    public class411 field1519 = new class411();

    @ObfuscatedName("dt.r")
    public boolean field1523 = true;

    @ObfuscatedName("dt.u")
    public class411 field1525 = new class411();

    @ObfuscatedName("dt.b")
    public boolean field1522 = true;

    @ObfuscatedName("dt.j")
    public class411 field1520 = new class411();

    @ObfuscatedName("dt.g")
    public float[][] field1521;

    @ObfuscatedName("dt.i")
    public float[][] field1524;

    @ObfuscatedName("dt.o")
    public float[][] field1526;

    public class124(int arg0, class467 arg1, boolean arg2) {
        this.field1517 = arg1.method7795();
        this.field1516 = new class411[arg0];
        this.field1513 = new class411[this.field1516.length];
        this.field1518 = new class411[this.field1516.length];
        this.field1515 = new float[this.field1516.length][3];
        for (int var4 = 0; var4 < this.field1516.length; var4++) {
            this.field1516[var4] = new class411(arg1, arg2);
            this.field1515[var4][0] = arg1.method7798();
            this.field1515[var4][1] = arg1.method7798();
            this.field1515[var4][2] = arg1.method7798();
        }
        this.method2757();
    }

    @ObfuscatedName("dt.h(B)V")
    public void method2757() {
        this.field1521 = new float[this.field1516.length][3];
        this.field1524 = new float[this.field1516.length][3];
        this.field1526 = new float[this.field1516.length][3];
        class411 var1 = class411.method5785();
        for (int var2 = 0; var2 < this.field1516.length; var2++) {
            class411 var3 = this.method2788(var2);
            var1.method7082(var3);
            var1.method7090();
            this.field1521[var2] = var1.method7079();
            this.field1524[var2][0] = var3.field4613[12];
            this.field1524[var2][1] = var3.field4613[13];
            this.field1524[var2][2] = var3.field4613[14];
            this.field1526[var2] = var3.method7092();
        }
        var1.method7093();
    }

    @ObfuscatedName("dt.e(II)Loj;")
    public class411 method2788(int arg0) {
        return this.field1516[arg0];
    }

    @ObfuscatedName("dt.v(IB)Loj;")
    public class411 method2760(int arg0) {
        if (this.field1513[arg0] == null) {
            this.field1513[arg0] = new class411(this.method2788(arg0));
            if (this.field1514 == null) {
                this.field1513[arg0].method7086(class411.field4614);
            } else {
                this.field1513[arg0].method7086(this.field1514.method2760(arg0));
            }
        }
        return this.field1513[arg0];
    }

    @ObfuscatedName("dt.x(IS)Loj;")
    public class411 method2787(int arg0) {
        if (this.field1518[arg0] == null) {
            this.field1518[arg0] = new class411(this.method2760(arg0));
            this.field1518[arg0].method7090();
        }
        return this.field1518[arg0];
    }

    @ObfuscatedName("dt.m(Loj;I)V")
    public void method2764(class411 arg0) {
        this.field1519.method7082(arg0);
        this.field1523 = true;
        this.field1522 = true;
    }

    @ObfuscatedName("dt.q(I)Loj;")
    public class411 method2763() {
        return this.field1519;
    }

    @ObfuscatedName("dt.f(I)Loj;")
    public class411 method2770() {
        if (this.field1523) {
            this.field1525.method7082(this.method2763());
            if (this.field1514 != null) {
                this.field1525.method7086(this.field1514.method2770());
            }
            this.field1523 = false;
        }
        return this.field1525;
    }

    @ObfuscatedName("dt.r(II)Loj;")
    public class411 method2761(int arg0) {
        if (this.field1522) {
            this.field1520.method7082(this.method2787(arg0));
            this.field1520.method7086(this.method2770());
            this.field1522 = false;
        }
        return this.field1520;
    }

    @ObfuscatedName("dt.u(IB)[F")
    public float[] method2766(int arg0) {
        return this.field1521[arg0];
    }

    @ObfuscatedName("dt.b(II)[F")
    public float[] method2767(int arg0) {
        return this.field1524[arg0];
    }

    @ObfuscatedName("dt.j(IS)[F")
    public float[] method2768(int arg0) {
        return this.field1526[arg0];
    }
}
