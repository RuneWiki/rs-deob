package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dc")
public class class127 {

    @ObfuscatedName("dc.b")
    public static boolean field1982 = false;

    @ObfuscatedName("dc.a")
    public static Hashtable field1991 = new Hashtable(16);

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.b(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1763(String arg0) {
        if (!field1982) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1991.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1989, arg0);
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
            field1991.put(arg0, var2);
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
