package deob;

@ObfuscatedName("ei")
public class class129 {

    @ObfuscatedName("ei.az")
    public final int field1540;

    @ObfuscatedName("ei.ah")
    public class129 field1544;

    @ObfuscatedName("ei.af")
    public float[][] field1532;

    @ObfuscatedName("ei.at")
    public final class471[] field1533;

    @ObfuscatedName("ei.an")
    public class471[] field1534;

    @ObfuscatedName("ei.ao")
    public class471[] field1537;

    @ObfuscatedName("ei.ab")
    public class471 field1536 = new class471();

    @ObfuscatedName("ei.aw")
    public boolean field1531 = true;

    @ObfuscatedName("ei.ad")
    public class471 field1538 = new class471();

    @ObfuscatedName("ei.al")
    public boolean field1530 = true;

    @ObfuscatedName("ei.as")
    public class471 field1535 = new class471();

    @ObfuscatedName("ei.ag")
    public float[][] field1541;

    @ObfuscatedName("ei.ai")
    public float[][] field1542;

    @ObfuscatedName("ei.ax")
    public float[][] field1543;

    public class129(int arg0, class535 arg1, boolean arg2) {
        this.field1540 = arg1.method8465();
        this.field1533 = new class471[arg0];
        this.field1534 = new class471[this.field1533.length];
        this.field1537 = new class471[this.field1533.length];
        this.field1532 = new float[this.field1533.length][3];
        for (int var4 = 0; var4 < this.field1533.length; var4++) {
            this.field1533[var4] = new class471(arg1, arg2);
            this.field1532[var4][0] = arg1.method8470();
            this.field1532[var4][1] = arg1.method8470();
            this.field1532[var4][2] = arg1.method8470();
        }
        this.method2840();
    }

    @ObfuscatedName("ei.az(I)V")
    public void method2840() {
        this.field1541 = new float[this.field1533.length][3];
        this.field1542 = new float[this.field1533.length][3];
        this.field1543 = new float[this.field1533.length][3];
        class471 var1 = class471.method2467();
        for (int var2 = 0; var2 < this.field1533.length; var2++) {
            class471 var3 = this.method2827(var2);
            var1.method7689(var3);
            var1.method7723();
            this.field1541[var2] = var1.method7687();
            this.field1542[var2][0] = var3.field4873[12];
            this.field1542[var2][1] = var3.field4873[13];
            this.field1542[var2][2] = var3.field4873[14];
            this.field1543[var2] = var3.method7698();
        }
        var1.method7738();
    }

    @ObfuscatedName("ei.ah(II)Lsq;")
    public class471 method2827(int arg0) {
        return this.field1533[arg0];
    }

    @ObfuscatedName("ei.af(II)Lsq;")
    public class471 method2828(int arg0) {
        if (this.field1534[arg0] == null) {
            this.field1534[arg0] = new class471(this.method2827(arg0));
            if (this.field1544 == null) {
                this.field1534[arg0].method7692(class471.field4874);
            } else {
                this.field1534[arg0].method7692(this.field1544.method2828(arg0));
            }
        }
        return this.field1534[arg0];
    }

    @ObfuscatedName("ei.at(IB)Lsq;")
    public class471 method2829(int arg0) {
        if (this.field1537[arg0] == null) {
            this.field1537[arg0] = new class471(this.method2828(arg0));
            this.field1537[arg0].method7723();
        }
        return this.field1537[arg0];
    }

    @ObfuscatedName("ei.an(Lsq;I)V")
    public void method2830(class471 arg0) {
        this.field1536.method7689(arg0);
        this.field1531 = true;
        this.field1530 = true;
    }

    @ObfuscatedName("ei.ao(I)Lsq;")
    public class471 method2831() {
        return this.field1536;
    }

    @ObfuscatedName("ei.ab(I)Lsq;")
    public class471 method2832() {
        if (this.field1531) {
            this.field1538.method7689(this.method2831());
            if (this.field1544 != null) {
                this.field1538.method7692(this.field1544.method2832());
            }
            this.field1531 = false;
        }
        return this.field1538;
    }

    @ObfuscatedName("ei.aw(IB)Lsq;")
    public class471 method2833(int arg0) {
        if (this.field1530) {
            this.field1535.method7689(this.method2829(arg0));
            this.field1535.method7692(this.method2832());
            this.field1530 = false;
        }
        return this.field1535;
    }

    @ObfuscatedName("ei.ad(IB)[F")
    public float[] method2849(int arg0) {
        return this.field1541[arg0];
    }

    @ObfuscatedName("ei.al(II)[F")
    public float[] method2835(int arg0) {
        return this.field1542[arg0];
    }

    @ObfuscatedName("ei.as(II)[F")
    public float[] method2825(int arg0) {
        return this.field1543[arg0];
    }
}
