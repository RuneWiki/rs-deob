package deob;

@ObfuscatedName("fh")
public class class131 {

    @ObfuscatedName("fh.ak")
    public final int field1558;

    @ObfuscatedName("fh.al")
    public class131 field1559;

    @ObfuscatedName("fh.aj")
    public float[][] field1551;

    @ObfuscatedName("fh.az")
    public final class424[] field1552;

    @ObfuscatedName("fh.af")
    public class424[] field1553;

    @ObfuscatedName("fh.aa")
    public class424[] field1557;

    @ObfuscatedName("fh.at")
    public class424 field1555 = new class424();

    @ObfuscatedName("fh.ab")
    public boolean field1556 = true;

    @ObfuscatedName("fh.ac")
    public class424 field1554 = new class424();

    @ObfuscatedName("fh.ao")
    public boolean field1565 = true;

    @ObfuscatedName("fh.ah")
    public class424 field1549 = new class424();

    @ObfuscatedName("fh.av")
    public float[][] field1560;

    @ObfuscatedName("fh.aq")
    public float[][] field1561;

    @ObfuscatedName("fh.ap")
    public float[][] field1562;

    public class131(int arg0, class546 arg1, boolean arg2) {
        this.field1558 = arg1.method8926();
        this.field1552 = new class424[arg0];
        this.field1553 = new class424[this.field1552.length];
        this.field1557 = new class424[this.field1552.length];
        this.field1551 = new float[this.field1552.length][3];
        for (int var4 = 0; var4 < this.field1552.length; var4++) {
            this.field1552[var4] = new class424(arg1, arg2);
            this.field1551[var4][0] = arg1.method8803();
            this.field1551[var4][1] = arg1.method8803();
            this.field1551[var4][2] = arg1.method8803();
        }
        this.method2903();
    }

    @ObfuscatedName("fh.ak(I)V")
    public void method2903() {
        this.field1560 = new float[this.field1552.length][3];
        this.field1561 = new float[this.field1552.length][3];
        this.field1562 = new float[this.field1552.length][3];
        class424[] var1 = class424.field4692;
        class424 var2;
        synchronized (class424.field4692) {
            if (Statics.field5240 == 0) {
                var2 = new class424();
            } else {
                class424.field4692[--Statics.field5240].method7210();
                var2 = class424.field4692[Statics.field5240];
            }
        }
        class424 var4 = var2;
        for (int var5 = 0; var5 < this.field1552.length; var5++) {
            class424 var6 = this.method2904(var5);
            var4.method7244(var6);
            var4.method7190();
            this.field1560[var5] = var4.method7172();
            this.field1561[var5][0] = var6.field4695[12];
            this.field1561[var5][1] = var6.field4695[13];
            this.field1561[var5][2] = var6.field4695[14];
            this.field1562[var5] = var6.method7191();
        }
        var4.method7197();
    }

    @ObfuscatedName("fh.al(II)Lql;")
    public class424 method2904(int arg0) {
        return this.field1552[arg0];
    }

    @ObfuscatedName("fh.aj(II)Lql;")
    public class424 method2905(int arg0) {
        if (this.field1553[arg0] == null) {
            this.field1553[arg0] = new class424(this.method2904(arg0));
            if (this.field1559 == null) {
                this.field1553[arg0].method7224(class424.field4696);
            } else {
                this.field1553[arg0].method7224(this.field1559.method2905(arg0));
            }
        }
        return this.field1553[arg0];
    }

    @ObfuscatedName("fh.az(II)Lql;")
    public class424 method2906(int arg0) {
        if (this.field1557[arg0] == null) {
            this.field1557[arg0] = new class424(this.method2905(arg0));
            this.field1557[arg0].method7190();
        }
        return this.field1557[arg0];
    }

    @ObfuscatedName("fh.af(Lql;B)V")
    public void method2923(class424 arg0) {
        this.field1555.method7244(arg0);
        this.field1556 = true;
        this.field1565 = true;
    }

    @ObfuscatedName("fh.aa(I)Lql;")
    public class424 method2929() {
        return this.field1555;
    }

    @ObfuscatedName("fh.at(B)Lql;")
    public class424 method2927() {
        if (this.field1556) {
            this.field1554.method7244(this.method2929());
            if (this.field1559 != null) {
                this.field1554.method7224(this.field1559.method2927());
            }
            this.field1556 = false;
        }
        return this.field1554;
    }

    @ObfuscatedName("fh.ab(IB)Lql;")
    public class424 method2910(int arg0) {
        if (this.field1565) {
            this.field1549.method7244(this.method2906(arg0));
            this.field1549.method7224(this.method2927());
            this.field1565 = false;
        }
        return this.field1549;
    }

    @ObfuscatedName("fh.ac(II)[F")
    public float[] method2911(int arg0) {
        return this.field1560[arg0];
    }

    @ObfuscatedName("fh.ao(II)[F")
    public float[] method2912(int arg0) {
        return this.field1561[arg0];
    }

    @ObfuscatedName("fh.ah(IB)[F")
    public float[] method2908(int arg0) {
        return this.field1562[arg0];
    }
}
