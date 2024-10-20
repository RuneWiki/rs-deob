package deob;

@ObfuscatedName("ek")
public class class128 {

    @ObfuscatedName("ek.aw")
    public final int field1506;

    @ObfuscatedName("ek.ay")
    public class128 field1501;

    @ObfuscatedName("ek.ar")
    public float[][] field1502;

    @ObfuscatedName("ek.am")
    public final class452[] field1503;

    @ObfuscatedName("ek.as")
    public class452[] field1504;

    @ObfuscatedName("ek.aj")
    public class452[] field1514;

    @ObfuscatedName("ek.ag")
    public class452 field1509 = new class452();

    @ObfuscatedName("ek.az")
    public boolean field1507 = true;

    @ObfuscatedName("ek.av")
    public class452 field1508 = new class452();

    @ObfuscatedName("ek.ap")
    public boolean field1505 = true;

    @ObfuscatedName("ek.aq")
    public class452 field1511 = new class452();

    @ObfuscatedName("ek.at")
    public float[][] field1510;

    @ObfuscatedName("ek.ah")
    public float[][] field1512;

    @ObfuscatedName("ek.ax")
    public float[][] field1513;

    public class128(int arg0, class514 arg1, boolean arg2) {
        this.field1506 = arg1.method8497();
        this.field1503 = new class452[arg0];
        this.field1504 = new class452[this.field1503.length];
        this.field1514 = new class452[this.field1503.length];
        this.field1502 = new float[this.field1503.length][3];
        for (int var4 = 0; var4 < this.field1503.length; var4++) {
            this.field1503[var4] = new class452(arg1, arg2);
            this.field1502[var4][0] = arg1.method8252();
            this.field1502[var4][1] = arg1.method8252();
            this.field1502[var4][2] = arg1.method8252();
        }
        this.method2813();
    }

    @ObfuscatedName("ek.aw(I)V")
    public void method2813() {
        this.field1510 = new float[this.field1503.length][3];
        this.field1512 = new float[this.field1503.length][3];
        this.field1513 = new float[this.field1503.length][3];
        class452 var1 = class452.method2947();
        for (int var2 = 0; var2 < this.field1503.length; var2++) {
            class452 var3 = this.method2835(var2);
            var1.method7529(var3);
            var1.method7499();
            this.field1510[var2] = var1.method7497();
            this.field1512[var2][0] = var3.field4744[12];
            this.field1512[var2][1] = var3.field4744[13];
            this.field1512[var2][2] = var3.field4744[14];
            this.field1513[var2] = var3.method7493();
        }
        var1.method7519();
    }

    @ObfuscatedName("ek.ay(II)Lrm;")
    public class452 method2835(int arg0) {
        return this.field1503[arg0];
    }

    @ObfuscatedName("ek.ar(II)Lrm;")
    public class452 method2815(int arg0) {
        if (this.field1504[arg0] == null) {
            this.field1504[arg0] = new class452(this.method2835(arg0));
            if (this.field1501 == null) {
                this.field1504[arg0].method7525(class452.field4740);
            } else {
                this.field1504[arg0].method7525(this.field1501.method2815(arg0));
            }
        }
        return this.field1504[arg0];
    }

    @ObfuscatedName("ek.am(IB)Lrm;")
    public class452 method2812(int arg0) {
        if (this.field1514[arg0] == null) {
            this.field1514[arg0] = new class452(this.method2815(arg0));
            this.field1514[arg0].method7499();
        }
        return this.field1514[arg0];
    }

    @ObfuscatedName("ek.as(Lrm;I)V")
    public void method2844(class452 arg0) {
        this.field1509.method7529(arg0);
        this.field1507 = true;
        this.field1505 = true;
    }

    @ObfuscatedName("ek.aj(I)Lrm;")
    public class452 method2818() {
        return this.field1509;
    }

    @ObfuscatedName("ek.ag(B)Lrm;")
    public class452 method2819() {
        if (this.field1507) {
            this.field1508.method7529(this.method2818());
            if (this.field1501 != null) {
                this.field1508.method7525(this.field1501.method2819());
            }
            this.field1507 = false;
        }
        return this.field1508;
    }

    @ObfuscatedName("ek.az(IB)Lrm;")
    public class452 method2833(int arg0) {
        if (this.field1505) {
            this.field1511.method7529(this.method2812(arg0));
            this.field1511.method7525(this.method2819());
            this.field1505 = false;
        }
        return this.field1511;
    }

    @ObfuscatedName("ek.av(II)[F")
    public float[] method2821(int arg0) {
        return this.field1510[arg0];
    }

    @ObfuscatedName("ek.ap(II)[F")
    public float[] method2822(int arg0) {
        return this.field1512[arg0];
    }

    @ObfuscatedName("ek.aq(IB)[F")
    public float[] method2823(int arg0) {
        return this.field1513[arg0];
    }
}
