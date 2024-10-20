package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dn")
public class class122 {

    @ObfuscatedName("dn.p")
    public static boolean field1925 = false;

    @ObfuscatedName("dn.x")
    public static Hashtable field1921 = new Hashtable(16);

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.p(Ljava/lang/String;S)Ljava/io/File;")
    public static File method1645(String arg0) {
        if (!field1925) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1921.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1920, arg0);
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
            field1921.put(arg0, var2);
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
