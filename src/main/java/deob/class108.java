package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dk")
public class class108 {

    @ObfuscatedName("dk.d")
    public static boolean field1722 = false;

    @ObfuscatedName("dk.n")
    public static Hashtable field1716 = new Hashtable(16);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gs.d(Ljava/io/File;I)V")
    public static void method3426(File arg0) {
        Statics.field1867 = arg0;
        if (!Statics.field1867.exists()) {
            throw new RuntimeException("");
        }
        field1722 = true;
    }

    @ObfuscatedName("i.c(Ljava/lang/String;B)Ljava/io/File;")
    public static File method198(String arg0) {
        if (!field1722) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1716.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1867, arg0);
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
            field1716.put(arg0, var2);
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
