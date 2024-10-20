package deob;

@ObfuscatedName("dn")
public class class107 {

    @ObfuscatedName("dn.q")
    public long field1513;

    @ObfuscatedName("dn.l")
    public class107 field1512;

    @ObfuscatedName("dn.a")
    public class107 field1514;

    @ObfuscatedName("dn.q()V")
    public void method1328() {
        if (this.field1514 != null) {
            this.field1514.field1512 = this.field1512;
            this.field1512.field1514 = this.field1514;
            this.field1512 = null;
            this.field1514 = null;
        }
    }

    @ObfuscatedName("dn.l()Z")
    public boolean method1327() {
        return this.field1514 != null;
    }
}
