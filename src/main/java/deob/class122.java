package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dm")
public class class122 {

    @ObfuscatedName("dm.e")
    public static boolean field1935 = false;

    @ObfuscatedName("dm.a")
    public static Hashtable field1934 = new Hashtable(16);

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.e(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2421(String arg0) {
        if (!field1935) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1934.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1885, arg0);
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
            field1934.put(arg0, var2);
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
