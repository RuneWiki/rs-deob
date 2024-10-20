package deob;

@ObfuscatedName("ds")
public class class107 extends class351 {

    @ObfuscatedName("ds.c")
    public final boolean field1338;

    public class107(boolean arg0) {
        this.field1338 = arg0;
    }

    @ObfuscatedName("ds.c(Lmp;Lmp;I)I")
    public int method2412(class354 arg0, class354 arg1) {
        if (client.field469 == arg0.field4121 && client.field469 == arg1.field4121) {
            return this.field1338 ? arg0.method5770().method7190(arg1.method5770()) : arg1.method5770().method7190(arg0.method5770());
        } else {
            return this.method5785(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2412((class354) arg0, (class354) arg1);
    }
}
