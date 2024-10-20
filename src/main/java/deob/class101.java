package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cy")
public class class101 {

    @ObfuscatedName("cy.m")
    public Inflater field1794;

    public class101() {
        this(-1, 1000000, 1000000);
    }

    public class101(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cy.m(Lcb;[BB)V")
    public void method2079(class104 arg0, byte[] arg1) {
        if (arg0.field1808[arg0.field1806] != 31 || arg0.field1808[arg0.field1806 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1794 == null) {
            this.field1794 = new Inflater(true);
        }
        try {
            this.field1794.setInput(arg0.field1808, arg0.field1806 + 10, arg0.field1808.length - (arg0.field1806 + 10 + 8));
            this.field1794.inflate(arg1);
        } catch (Exception var4) {
            this.field1794.reset();
            throw new RuntimeException("");
        }
        this.field1794.reset();
    }
}
