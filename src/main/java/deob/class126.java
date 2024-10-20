package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dv")
public class class126 {

    @ObfuscatedName("dv.p")
    public static boolean field1944 = false;

    @ObfuscatedName("dv.d")
    public static Hashtable field1946 = new Hashtable(16);

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.p(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1898(String arg0) {
        if (!field1944) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1946.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1945, arg0);
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
            field1946.put(arg0, var2);
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
