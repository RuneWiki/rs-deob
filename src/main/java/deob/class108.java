package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dz")
public class class108 {

    @ObfuscatedName("dz.s")
    public static boolean field1732 = false;

    @ObfuscatedName("dz.f")
    public static Hashtable field1731 = new Hashtable(16);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.s(Ljava/io/File;B)V")
    public static void method1764(File arg0) {
        Statics.field1730 = arg0;
        if (!Statics.field1730.exists()) {
            throw new RuntimeException("");
        }
        field1732 = true;
    }

    @ObfuscatedName("y.c(Ljava/lang/String;I)Ljava/io/File;")
    public static File method223(String arg0) {
        if (!field1732) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1731.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1730, arg0);
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
            field1731.put(arg0, var2);
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
