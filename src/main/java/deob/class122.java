package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dx")
public class class122 {

    @ObfuscatedName("dx.t")
    public static boolean field1923 = false;

    @ObfuscatedName("dx.f")
    public static Hashtable field1925 = new Hashtable(16);

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.t(Ljava/io/File;I)V")
    public static void method2424(File arg0) {
        Statics.field1924 = arg0;
        if (!Statics.field1924.exists()) {
            throw new RuntimeException("");
        }
        field1923 = true;
    }

    @ObfuscatedName("dm.s(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2372(String arg0) {
        if (!field1923) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1925.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1924, arg0);
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
            field1925.put(arg0, var2);
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
