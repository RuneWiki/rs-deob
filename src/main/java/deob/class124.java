package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dd")
public class class124 {

    @ObfuscatedName("dd.l")
    public static boolean field1927 = false;

    @ObfuscatedName("dd.g")
    public static Hashtable field1924 = new Hashtable(16);

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.l(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2097(String arg0) {
        if (!field1927) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1924.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2934, arg0);
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
            field1924.put(arg0, var2);
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
