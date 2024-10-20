package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("di")
public class class127 {

    @ObfuscatedName("di.e")
    public static boolean field1932 = false;

    @ObfuscatedName("di.l")
    public static Hashtable field1930 = new Hashtable(16);

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.e(Ljava/io/File;I)V")
    public static void method2541(File arg0) {
        Statics.field1931 = arg0;
        if (!Statics.field1931.exists()) {
            throw new RuntimeException("");
        }
        field1932 = true;
    }

    @ObfuscatedName("fc.a(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3036(String arg0) {
        if (!field1932) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1930.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1931, arg0);
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
