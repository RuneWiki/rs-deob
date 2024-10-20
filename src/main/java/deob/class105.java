package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dx")
public class class105 {

    @ObfuscatedName("dx.z")
    public static class73 field1682 = null;

    @ObfuscatedName("dx.p")
    public static class73 field1684 = null;

    @ObfuscatedName("dx.s")
    public static class73 field1681 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.b(Ljava/io/File;Ljava/io/File;I)V")
    public static void method52(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1678, "rw", 10000L);
            class154 var3 = new class154(500);
            var3.method2832(3);
            var3.method2832(arg1 == null ? 0 : 1);
            var3.method2708(arg0.getPath());
            if (arg1 != null) {
                var3.method2708(arg1.getPath());
            }
            var2.method1391(var3.field2083, 0, var3.field2085);
            var2.method1394();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("aj.l(Ljava/io/File;ZI)Z")
    public static boolean method636(File arg0, boolean arg1) {
        try {
            RandomAccessFile var2 = new RandomAccessFile(arg0, "rw");
            int var3 = var2.read();
            var2.seek(0L);
            var2.write(var3);
            var2.seek(0L);
            var2.close();
            if (arg1) {
                arg0.delete();
            }
            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    @ObfuscatedName("bk.i(Ljava/lang/String;Ljava/lang/String;ZI)Lbz;")
    public static class74 method1160(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1679, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1716 == 33) {
            var6 = "_rc";
        } else if (Statics.field1716 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1687, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class74(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class74(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eh.t(B)V")
    public static void method2661() {
        try {
            field1684.method1358();
            for (int var0 = 0; var0 < Statics.field1680; var0++) {
                Statics.field1822[var0].method1358();
            }
            field1681.method1358();
            field1682.method1358();
        } catch (Exception var2) {
        }
    }
}
