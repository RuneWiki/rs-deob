package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("da")
public class class108 {

    @ObfuscatedName("da.n")
    public static boolean field1736 = false;

    @ObfuscatedName("da.m")
    public static Hashtable field1728 = new Hashtable(16);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.n(Ljava/io/File;I)V")
    public static void method1817(File arg0) {
        Statics.field1727 = arg0;
        if (!Statics.field1727.exists()) {
            throw new RuntimeException("");
        }
        field1736 = true;
    }

    @ObfuscatedName("fr.d(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2753(String arg0) {
        if (!field1736) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1728.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1727, arg0);
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
            field1728.put(arg0, var2);
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
