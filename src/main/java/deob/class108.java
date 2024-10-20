package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dq")
public class class108 {

    @ObfuscatedName("dq.k")
    public static boolean field1729 = false;

    @ObfuscatedName("dq.o")
    public static Hashtable field1730 = new Hashtable(16);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.k(Ljava/io/File;I)V")
    public static void method3203(File arg0) {
        Statics.field1728 = arg0;
        if (!Statics.field1728.exists()) {
            throw new RuntimeException("");
        }
        field1729 = true;
    }

    @ObfuscatedName("cb.y(Ljava/lang/String;S)Ljava/io/File;")
    public static File method1856(String arg0) {
        if (!field1729) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1730.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1728, arg0);
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
            field1730.put(arg0, var2);
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
