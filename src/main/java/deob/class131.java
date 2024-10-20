package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ec")
public class class131 {

    @ObfuscatedName("ec.f")
    public static boolean field1486 = false;

    @ObfuscatedName("ec.u")
    public static Hashtable field1488 = new Hashtable(16);

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.f(Ljava/io/File;I)V")
    public static void method4325(File arg0) {
        Statics.field1487 = arg0;
        if (!Statics.field1487.exists()) {
            throw new RuntimeException("");
        }
        field1486 = true;
    }

    @ObfuscatedName("v.o(Ljava/lang/String;I)Ljava/io/File;")
    public static File method167(String arg0) {
        if (!field1486) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1488.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1487, arg0);
        RandomAccessFile var3 = null;
        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            field1488.put(arg0, var2);
            return var2;
        } catch (Exception var10) {
            try {
                if (var3 != null) {
                    var3.close();
                    Object var7 = null;
                }
            } catch (Exception var9) {
            }
            throw new RuntimeException();
        }
    }
}
