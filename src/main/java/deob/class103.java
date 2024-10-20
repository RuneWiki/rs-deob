package deob;

@ObfuscatedName("cl")
public class class103 {

    @ObfuscatedName("cl.q")
    public class106 field1502 = new class106();

    @ObfuscatedName("cl.l")
    public class106 field1501;

    public class103() {
        this.field1502.field1511 = this.field1502;
        this.field1502.field1510 = this.field1502;
    }

    @ObfuscatedName("cl.q(Ldv;)V")
    public void method1265(class106 arg0) {
        if (arg0.field1510 != null) {
            arg0.method1322();
        }
        arg0.field1510 = this.field1502.field1510;
        arg0.field1511 = this.field1502;
        arg0.field1510.field1511 = arg0;
        arg0.field1511.field1510 = arg0;
    }

    @ObfuscatedName("cl.l()Ldv;")
    public class106 method1272() {
        class106 var1 = this.field1502.field1511;
        if (this.field1502 == var1) {
            this.field1501 = null;
            return null;
        } else {
            this.field1501 = var1.field1511;
            return var1;
        }
    }

    @ObfuscatedName("cl.a()Ldv;")
    public class106 method1276() {
        class106 var1 = this.field1501;
        if (this.field1502 == var1) {
            this.field1501 = null;
            return null;
        } else {
            this.field1501 = var1.field1511;
            return var1;
        }
    }
}
