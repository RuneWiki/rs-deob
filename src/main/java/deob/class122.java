package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dd")
public class class122 {

    @ObfuscatedName("dd.z")
    public static boolean field1917 = false;

    @ObfuscatedName("dd.a")
    public static Hashtable field1915 = new Hashtable(16);

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.z(Ljava/io/File;I)V")
    public static void method2811(File arg0) {
        Statics.field1916 = arg0;
        if (!Statics.field1916.exists()) {
            throw new RuntimeException("");
        }
        field1917 = true;
    }

    @ObfuscatedName("g.j(Ljava/lang/String;B)Ljava/io/File;")
    public static File method527(String arg0) {
        if (!field1917) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1915.get(arg0);
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
            field1915.put(arg0, var2);
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
