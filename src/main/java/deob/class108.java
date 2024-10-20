package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dk")
public class class108 {

    @ObfuscatedName("dk.f")
    public static boolean field1754 = false;

    @ObfuscatedName("dk.u")
    public static Hashtable field1755 = new Hashtable(16);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.f(Ljava/lang/String;S)Ljava/io/File;")
    public static File method79(String arg0) {
        if (!field1754) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1755.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1753, arg0);
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
            field1755.put(arg0, var2);
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
