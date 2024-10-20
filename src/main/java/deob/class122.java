package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("db")
public class class122 {

    @ObfuscatedName("db.n")
    public static boolean field1921 = false;

    @ObfuscatedName("db.k")
    public static Hashtable field1918 = new Hashtable(16);

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.n(Ljava/io/File;I)V")
    public static void method100(File arg0) {
        Statics.field1916 = arg0;
        if (!Statics.field1916.exists()) {
            throw new RuntimeException("");
        }
        field1921 = true;
    }

    @ObfuscatedName("au.x(Ljava/lang/String;B)Ljava/io/File;")
    public static File method802(String arg0) {
        if (!field1921) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1918.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1916, arg0);
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
            field1918.put(arg0, var2);
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
