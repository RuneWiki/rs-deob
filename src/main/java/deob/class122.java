package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bk")
public class class122 {

    @ObfuscatedName("bk.b")
    public static Hashtable field1864 = new Hashtable(16);

    @ObfuscatedName("bk.v")
    public static boolean field1863 = false;

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.v(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1215(String arg0) {
        if (!field1863) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1864.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1862, arg0);
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
            field1864.put(arg0, var2);
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
