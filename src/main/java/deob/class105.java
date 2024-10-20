package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dh")
public class class105 {

    @ObfuscatedName("dh.k")
    public static class73 field1690 = null;

    @ObfuscatedName("dh.f")
    public static class73 field1700 = null;

    @ObfuscatedName("dh.o")
    public static class73 field1696 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.x(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method1157(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1693 = new File(Statics.field230, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1693.exists()) {
            try {
                class74 var7 = new class74(Statics.field1693, "rw", 10000L);
                class154 var8 = new class154((int) var7.method1411());
                while (var8.field2087 < var8.field2086.length) {
                    int var9 = var7.method1412(var8.field2086, var8.field2087, var8.field2086.length - var8.field2087);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2087 += var9;
                }
                var8.field2087 = 0;
                int var10 = var8.method2878();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2878();
                }
                if (var10 <= 2) {
                    var4 = var8.method2710();
                    if (var11 == 1) {
                        var5 = var8.method2710();
                    }
                } else {
                    var4 = var8.method2711();
                    if (var11 == 1) {
                        var5 = var8.method2711();
                    }
                }
                var7.method1410();
            } catch (IOException var28) {
                var28.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method256(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field78.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2656.length; var16++) {
                    File var17 = new File(Statics.field2656[var16] + Statics.field78[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method256(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field230 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var18 = new File(var5);
            File var19 = new File(var4);
            try {
                File[] var20 = var18.listFiles();
                File[] var21 = var20;
                for (int var22 = 0; var22 < var21.length; var22++) {
                    File var23 = var21[var22];
                    File var24 = new File(var19, var23.getName());
                    boolean var25 = var23.renameTo(var24);
                    if (!var25) {
                        throw new IOException();
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method702(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ae.n(Ljava/io/File;Ljava/io/File;I)V")
    public static void method702(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1693, "rw", 10000L);
            class154 var3 = new class154(500);
            var3.method2688(3);
            var3.method2688(arg1 == null ? 0 : 1);
            var3.method2694(arg0.getPath());
            if (arg1 != null) {
                var3.method2694(arg1.getPath());
            }
            var2.method1417(var3.field2086, 0, var3.field2087);
            var2.method1410();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("d.g(Ljava/io/File;ZI)Z")
    public static boolean method256(File arg0, boolean arg1) {
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

    @ObfuscatedName("gp.v(Ljava/lang/String;Ljava/lang/String;ZI)Lbp;")
    public static class74 method3399(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3101, "preferences" + arg0 + ".dat");
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
        File var7 = new File(Statics.field230, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ac.p(S)V")
    public static void method635() {
        try {
            field1700.method1385();
            for (int var0 = 0; var0 < Statics.field1548; var0++) {
                Statics.field183[var0].method1385();
            }
            field1696.method1385();
            field1690.method1385();
        } catch (Exception var2) {
        }
    }
}
