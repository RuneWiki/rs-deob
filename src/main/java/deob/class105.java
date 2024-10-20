package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dq")
public class class105 {

    @ObfuscatedName("dq.z")
    public static class73 field1688 = null;

    @ObfuscatedName("dq.y")
    public static class73 field1689 = null;

    @ObfuscatedName("dq.j")
    public static class73 field1690 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.o(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3147(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1419 = arg3;
        Statics.field71 = arg2;
        try {
            Statics.field1561 = System.getProperty("os.name");
        } catch (Exception var53) {
            Statics.field1561 = "Unknown";
        }
        Statics.field3249 = Statics.field1561.toLowerCase();
        try {
            Statics.field1542 = System.getProperty("user.home");
            if (Statics.field1542 != null) {
                Statics.field1542 = Statics.field1542 + "/";
            }
        } catch (Exception var52) {
        }
        try {
            if (Statics.field3249.startsWith("win")) {
                if (Statics.field1542 == null) {
                    Statics.field1542 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1542 == null) {
                Statics.field1542 = System.getenv("HOME");
            }
            if (Statics.field1542 != null) {
                Statics.field1542 = Statics.field1542 + "/";
            }
        } catch (Exception var51) {
        }
        if (Statics.field1542 == null) {
            Statics.field1542 = "~/";
        }
        Statics.field1678 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1542, "/tmp/", "" };
        Statics.field205 = new String[] { ".jagex_cache_" + Statics.field71, ".file_store_" + Statics.field71 };
        int var7 = 0;
        label257: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field211 = new File(Statics.field1542, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field211.exists()) {
                try {
                    class74 var12 = new class74(Statics.field211, "rw", 10000L);
                    class154 var13 = new class154((int) var12.method1313());
                    while (var13.field2105 < var13.field2108.length) {
                        int var14 = var12.method1315(var13.field2108, var13.field2105, var13.field2108.length - var13.field2105);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2105 += var14;
                    }
                    var13.field2105 = 0;
                    int var15 = var13.method2552();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2552();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2561();
                        if (var16 == 1) {
                            var10 = var13.method2561();
                        }
                    } else {
                        var9 = var13.method2562();
                        if (var16 == 1) {
                            var10 = var13.method2562();
                        }
                    }
                    var12.method1324();
                } catch (IOException var56) {
                    var56.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2296(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label231: for (int var20 = 0; var20 < Statics.field205.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1678.length; var21++) {
                        File var22 = new File(Statics.field1678[var21] + Statics.field205[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2296(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label231;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1542 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var23 = new File(var10);
                File var24 = new File(var9);
                try {
                    File[] var25 = var23.listFiles();
                    File[] var26 = var25;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        File var28 = var26[var27];
                        File var29 = new File(var24, var28.getName());
                        boolean var30 = var28.renameTo(var29);
                        if (!var30) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var55) {
                    var55.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class74 var34 = new class74(Statics.field211, "rw", 10000L);
                    class154 var35 = new class154(500);
                    var35.method2641(3);
                    var35.method2641(var33 == null ? 0 : 1);
                    var35.method2545(var32.getPath());
                    if (var33 != null) {
                        var35.method2545(((File) var33).getPath());
                    }
                    var34.method1311(var35.field2108, 0, var35.field2105);
                    var34.method1324();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field1686 = var37;
            if (!Statics.field1686.exists()) {
                Statics.field1686.mkdirs();
            }
            File[] var38 = Statics.field1686.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method2296(var41, false)) {
                        var7++;
                        continue label257;
                    }
                }
            }
            break;
        }
        class108.method40(Statics.field1686);
        try {
            File var42 = new File(Statics.field1542, "random.dat");
            if (var42.exists()) {
                field1688 = new class73(new class74(var42, "rw", 25L), 24, 0);
            } else {
                label184: for (int var43 = 0; var43 < Statics.field205.length; var43++) {
                    for (int var44 = 0; var44 < Statics.field1678.length; var44++) {
                        File var45 = new File(Statics.field1678[var44] + Statics.field205[var43] + File.separatorChar + "random.dat");
                        if (var45.exists()) {
                            field1688 = new class73(new class74(var45, "rw", 25L), 24, 0);
                            break label184;
                        }
                    }
                }
            }
            if (field1688 == null) {
                RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                int var47 = var46.read();
                var46.seek(0L);
                var46.write(var47);
                var46.seek(0L);
                var46.close();
                field1688 = new class73(new class74(var42, "rw", 25L), 24, 0);
            }
        } catch (IOException var54) {
        }
        field1689 = new class73(new class74(Statics.method671("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1690 = new class73(new class74(Statics.method671("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1691 = new class73[Statics.field1419];
        for (int var49 = 0; var49 < Statics.field1419; var49++) {
            Statics.field1691[var49] = new class73(new class74(Statics.method671("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ev.m(Ljava/io/File;ZI)Z")
    public static boolean method2296(File arg0, boolean arg1) {
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

    @ObfuscatedName("ah.b(Ljava/lang/String;Ljava/lang/String;ZI)Lbn;")
    public static class74 method672(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1686, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field71 == 33) {
            var6 = "_rc";
        } else if (Statics.field71 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1542, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ah.g(Lez;II)V")
    public static void method673(class154 arg0, int arg1) {
        if (field1688 == null) {
            return;
        }
        try {
            field1688.method1277(0L);
            field1688.method1282(arg0.field2108, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
