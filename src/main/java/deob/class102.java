package deob;

@ObfuscatedName("cr")
public class class102 {

    @ObfuscatedName("cr.t")
    public class105 field1488 = new class105();

    @ObfuscatedName("cr.n")
    public class105 field1487;

    public class102() {
        this.field1488.field1496 = this.field1488;
        this.field1488.field1497 = this.field1488;
    }

    @ObfuscatedName("cr.t(Lds;)V")
    public void method1257(class105 arg0) {
        if (arg0.field1497 != null) {
            arg0.method1306();
        }
        arg0.field1497 = this.field1488.field1497;
        arg0.field1496 = this.field1488;
        arg0.field1497.field1496 = arg0;
        arg0.field1496.field1497 = arg0;
    }

    @ObfuscatedName("cr.n()Lds;")
    public class105 method1251() {
        class105 var1 = this.field1488.field1496;
        if (this.field1488 == var1) {
            this.field1487 = null;
            return null;
        } else {
            this.field1487 = var1.field1496;
            return var1;
        }
    }

    @ObfuscatedName("cr.q()Lds;")
    public class105 method1253() {
        class105 var1 = this.field1487;
        if (this.field1488 == var1) {
            this.field1487 = null;
            return null;
        } else {
            this.field1487 = var1.field1496;
            return var1;
        }
    }
}
