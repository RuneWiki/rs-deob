package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("de")
public class class105 {

    @ObfuscatedName("de.k")
    public static class73 field1678 = null;

    @ObfuscatedName("de.f")
    public static class73 field1679 = null;

    @ObfuscatedName("de.a")
    public static class73 field1680 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.b(Ljava/io/File;Ljava/io/File;I)V")
    public static void method723(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1684, "rw", 10000L);
            class154 var3 = new class154(500);
            var3.method2780(3);
            var3.method2780(arg1 == null ? 0 : 1);
            var3.method2662(arg0.getPath());
            if (arg1 != null) {
                var3.method2662(arg1.getPath());
            }
            var2.method1368(var3.field2084, 0, var3.field2079);
            var2.method1356();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("fa.e(Ljava/io/File;ZI)Z")
    public static boolean method2904(File arg0, boolean arg1) {
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

    @ObfuscatedName("ap.c(Ljava/lang/String;Ljava/lang/String;ZI)Lby;")
    public static class74 method717(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1681, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1670 == 33) {
            var6 = "_rc";
        } else if (Statics.field1670 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3266, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("cq.l(Lec;B)V")
    public static void method1839(class154 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1678.method1351(0L);
            field1678.method1329(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var5) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2663(var1, 0, 24);
    }

    @ObfuscatedName("n.y(Lec;IB)V")
    public static void method225(class154 arg0, int arg1) {
        if (field1678 == null) {
            return;
        }
        try {
            field1678.method1351(0L);
            field1678.method1345(arg0.field2084, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bg.j(I)V")
    public static void method1154() {
        try {
            field1679.method1325();
            for (int var0 = 0; var0 < Statics.field106; var0++) {
                Statics.field1674[var0].method1325();
            }
            field1680.method1325();
            field1678.method1325();
        } catch (Exception var2) {
        }
    }
}
