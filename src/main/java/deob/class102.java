package deob;

@ObfuscatedName("cb")
public class class102 {

    @ObfuscatedName("cb.r")
    public class105 field1493 = new class105();

    @ObfuscatedName("cb.d")
    public class105 field1494;

    public class102() {
        this.field1493.field1502 = this.field1493;
        this.field1493.field1503 = this.field1493;
    }

    @ObfuscatedName("cb.r(Ldd;)V")
    public void method1267(class105 arg0) {
        if (arg0.field1503 != null) {
            arg0.method1322();
        }
        arg0.field1503 = this.field1493.field1503;
        arg0.field1502 = this.field1493;
        arg0.field1503.field1502 = arg0;
        arg0.field1502.field1503 = arg0;
    }

    @ObfuscatedName("cb.d()Ldd;")
    public class105 method1268() {
        class105 var1 = this.field1493.field1502;
        if (this.field1493 == var1) {
            this.field1494 = null;
            return null;
        } else {
            this.field1494 = var1.field1502;
            return var1;
        }
    }

    @ObfuscatedName("cb.l()Ldd;")
    public class105 method1274() {
        class105 var1 = this.field1494;
        if (this.field1493 == var1) {
            this.field1494 = null;
            return null;
        } else {
            this.field1494 = var1.field1502;
            return var1;
        }
    }
}
