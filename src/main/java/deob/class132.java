package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ej")
public class class132 {

    @ObfuscatedName("ej.f")
    public static boolean field1502 = false;

    @ObfuscatedName("ej.v")
    public static Hashtable field1504 = new Hashtable(16);

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.f(Ljava/io/File;I)V")
    public static void method199(File arg0) {
        Statics.field1503 = arg0;
        if (!Statics.field1503.exists()) {
            throw new RuntimeException("");
        }
        field1502 = true;
    }

    @ObfuscatedName("eo.e(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2612(String arg0) {
        if (!field1502) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1504.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1503, arg0);
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
            field1504.put(arg0, var2);
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
