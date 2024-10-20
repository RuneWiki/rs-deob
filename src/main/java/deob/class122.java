package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dv")
public class class122 {

    @ObfuscatedName("dv.e")
    public static boolean field1933 = false;

    @ObfuscatedName("dv.i")
    public static Hashtable field1930 = new Hashtable(16);

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.e(Ljava/lang/String;S)Ljava/io/File;")
    public static File method544(String arg0) {
        if (!field1933) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1930.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1928, arg0);
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
            field1930.put(arg0, var2);
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
