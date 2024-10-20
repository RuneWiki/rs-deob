package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dm")
public class class127 {

    @ObfuscatedName("dm.n")
    public static boolean field1992 = false;

    @ObfuscatedName("dm.a")
    public static Hashtable field1995 = new Hashtable(16);

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.n(Ljava/io/File;I)V")
    public static void method2832(File arg0) {
        Statics.field1957 = arg0;
        if (!Statics.field1957.exists()) {
            throw new RuntimeException("");
        }
        field1992 = true;
    }

    @ObfuscatedName("bl.g(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1121(String arg0) {
        if (!field1992) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1995.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1957, arg0);
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
            field1995.put(arg0, var2);
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
