package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("da")
public class class105 {

    @ObfuscatedName("da.r")
    public static class73 field1685 = null;

    @ObfuscatedName("da.n")
    public static class73 field1689 = null;

    @ObfuscatedName("da.m")
    public static class73 field1683 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.s(Ljava/lang/String;Ljava/lang/String;ZI)Lbf;")
    public static class74 method665(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1767, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2348 == 33) {
            var6 = "_rc";
        } else if (Statics.field2348 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1693, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("cy.c(I)V")
    public static void method1428() {
        try {
            File var0 = new File(Statics.field1693, "random.dat");
            if (var0.exists()) {
                field1685 = new class73(new class74(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1691.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1211.length; var2++) {
                        File var3 = new File(Statics.field1211[var2] + Statics.field1691[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1685 = new class73(new class74(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1685 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1685 = new class73(new class74(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("aj.f(I)V")
    public static void method745() {
        try {
            field1689.method1287();
            for (int var0 = 0; var0 < Statics.field1729; var0++) {
                Statics.field1561[var0].method1287();
            }
            field1683.method1287();
            field1685.method1287();
        } catch (Exception var2) {
        }
    }
}
