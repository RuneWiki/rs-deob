package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("df")
public class class122 {

    @ObfuscatedName("df.g")
    public static boolean field1952 = false;

    @ObfuscatedName("df.v")
    public static Hashtable field1954 = new Hashtable(16);

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.g(Ljava/lang/String;S)Ljava/io/File;")
    public static File method1574(String arg0) {
        if (!field1952) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1954.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1950, arg0);
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
            field1954.put(arg0, var2);
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
