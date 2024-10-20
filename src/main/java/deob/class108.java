package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("de")
public class class108 {

    @ObfuscatedName("de.i")
    public static boolean field1712 = false;

    @ObfuscatedName("de.f")
    public static Hashtable field1715 = new Hashtable(16);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.i(Ljava/lang/String;B)Ljava/io/File;")
    public static File method703(String arg0) {
        if (!field1712) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1715.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1718, arg0);
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
            field1715.put(arg0, var2);
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
