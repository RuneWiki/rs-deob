package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dw")
public class class119 {

    @ObfuscatedName("dw.z")
    public static boolean field1916 = false;

    @ObfuscatedName("dw.u")
    public static Hashtable field1912 = new Hashtable(16);

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.z(Ljava/io/File;I)V")
    public static void method2561(File arg0) {
        Statics.field1895 = arg0;
        if (!Statics.field1895.exists()) {
            throw new RuntimeException("");
        }
        field1916 = true;
    }

    @ObfuscatedName("bg.n(Ljava/lang/String;B)Ljava/io/File;")
    public static File method1418(String arg0) {
        if (!field1916) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1912.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1895, arg0);
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
            field1912.put(arg0, var2);
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
