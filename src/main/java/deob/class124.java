package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dj")
public class class124 {

    @ObfuscatedName("dj.e")
    public static boolean field1937 = false;

    @ObfuscatedName("dj.k")
    public static Hashtable field1935 = new Hashtable(16);

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.e(Ljava/io/File;I)V")
    public static void method2430(File arg0) {
        Statics.field1936 = arg0;
        if (!Statics.field1936.exists()) {
            throw new RuntimeException("");
        }
        field1937 = true;
    }

    @ObfuscatedName("cg.v(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2038(String arg0) {
        if (!field1937) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1935.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1936, arg0);
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
            field1935.put(arg0, var2);
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
