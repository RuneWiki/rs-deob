package deob;

@ObfuscatedName("dd")
public class class105 {

    @ObfuscatedName("dd.r")
    public class105 field1502;

    @ObfuscatedName("dd.d")
    public class105 field1503;

    @ObfuscatedName("dd.r()V")
    public void method1322() {
        if (this.field1503 != null) {
            this.field1503.field1502 = this.field1502;
            this.field1502.field1503 = this.field1503;
            this.field1502 = null;
            this.field1503 = null;
        }
    }
}
