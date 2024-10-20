package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dk")
public class class127 {

    @ObfuscatedName("dk.n")
    public static boolean field1993 = false;

    @ObfuscatedName("dk.a")
    public static Hashtable field1989 = new Hashtable(16);

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.n(Ljava/io/File;I)V")
    public static void method531(File arg0) {
        Statics.field1988 = arg0;
        if (!Statics.field1988.exists()) {
            throw new RuntimeException("");
        }
        field1993 = true;
    }

    @ObfuscatedName("h.o(Ljava/lang/String;B)Ljava/io/File;")
    public static File method76(String arg0) {
        if (!field1993) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1989.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1988, arg0);
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
            field1989.put(arg0, var2);
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
