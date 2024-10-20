package deob;

import java.util.zip.Inflater;

@ObfuscatedName("di")
public class class108 {

    @ObfuscatedName("di.y")
    public Inflater field1885;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("di.y(Ldw;[BB)V")
    public void method2101(class111 arg0, byte[] arg1) {
        if (arg0.field1897[arg0.field1902] != 31 || arg0.field1897[arg0.field1902 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1885 == null) {
            this.field1885 = new Inflater(true);
        }
        try {
            this.field1885.setInput(arg0.field1897, arg0.field1902 + 10, arg0.field1897.length - (arg0.field1902 + 10 + 8));
            this.field1885.inflate(arg1);
        } catch (Exception var4) {
            this.field1885.reset();
            throw new RuntimeException("");
        }
        this.field1885.reset();
    }
}
