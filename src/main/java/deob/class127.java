package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dx")
public class class127 {

    @ObfuscatedName("dx.p")
    public static boolean field1984 = false;

    @ObfuscatedName("dx.e")
    public static Hashtable field1985 = new Hashtable(16);

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.p(Ljava/io/File;B)V")
    public static void method1621(File arg0) {
        Statics.field981 = arg0;
        if (!Statics.field981.exists()) {
            throw new RuntimeException("");
        }
        field1984 = true;
    }

    @ObfuscatedName("ag.k(Ljava/lang/String;I)Ljava/io/File;")
    public static File method580(String arg0) {
        if (!field1984) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1985.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field981, arg0);
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
            field1985.put(arg0, var2);
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
