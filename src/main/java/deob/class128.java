package deob;

@ObfuscatedName("dt")
public class class128 {

    @ObfuscatedName("dt.cp")
    public long field1905;

    @ObfuscatedName("dt.ch")
    public class128 field1906;

    @ObfuscatedName("dt.ca")
    public class128 field1904;

    @ObfuscatedName("dt.fu()V")
    public void method2289() {
        if (this.field1904 != null) {
            this.field1904.field1906 = this.field1906;
            this.field1906.field1904 = this.field1904;
            this.field1906 = null;
            this.field1904 = null;
        }
    }

    @ObfuscatedName("dt.fb()Z")
    public boolean method2293() {
        return this.field1904 != null;
    }
}
