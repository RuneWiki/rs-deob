package deob;

import java.io.File;
import java.util.Hashtable;

@ObfuscatedName("dx")
public class class108 {

    @ObfuscatedName("dx.o")
    public static boolean field1738 = false;

    @ObfuscatedName("dx.b")
    public static Hashtable field1733 = new Hashtable(16);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.o(Ljava/io/File;I)V")
    public static void method40(File arg0) {
        Statics.field1732 = arg0;
        if (!Statics.field1732.exists()) {
            throw new RuntimeException("");
        }
        field1738 = true;
    }
}
