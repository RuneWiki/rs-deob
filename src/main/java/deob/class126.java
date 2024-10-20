package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("dr")
public class class126 {

    @ObfuscatedName("dr.v")
    public static boolean field1952 = false;

    @ObfuscatedName("dr.f")
    public static Hashtable field1947 = new Hashtable(16);

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.v(Ljava/io/File;I)V")
    public static void method166(File arg0) {
        Statics.field1945 = arg0;
        if (!Statics.field1945.exists()) {
            throw new RuntimeException("");
        }
        field1952 = true;
    }

    @ObfuscatedName("ds.t(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2092(String arg0) {
        if (!field1952) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1947.get(arg0);
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
            field1947.put(arg0, var2);
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
