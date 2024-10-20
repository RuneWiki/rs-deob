package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dd")
public class class105 {

    @ObfuscatedName("dd.t")
    public static class73 field1683 = null;

    @ObfuscatedName("dd.m")
    public static class73 field1677 = null;

    @ObfuscatedName("dd.q")
    public static class73 field1678 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gg.u(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3577(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1674 = arg3;
        Statics.field1562 = arg2;
        try {
            Statics.field1679 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field1679 = "Unknown";
        }
        Statics.field208 = Statics.field1679.toLowerCase();
        try {
            Statics.field1466 = System.getProperty("user.home");
            if (Statics.field1466 != null) {
                Statics.field1466 = Statics.field1466 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field208.startsWith("win")) {
                if (Statics.field1466 == null) {
                    Statics.field1466 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1466 == null) {
                Statics.field1466 = System.getenv("HOME");
            }
            if (Statics.field1466 != null) {
                Statics.field1466 = Statics.field1466 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field1466 == null) {
            Statics.field1466 = "~/";
        }
        Statics.field162 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1466, "/tmp/", "" };
        Statics.field2622 = new String[] { ".jagex_cache_" + Statics.field1562, ".file_store_" + Statics.field1562 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1672 = new File(Statics.field1466, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1672.exists()) {
                try {
                    class74 var12 = new class74(Statics.field1672, "rw", 10000L);
                    class154 var13 = new class154((int) var12.method1297());
                    while (var13.field2073 < var13.field2078.length) {
                        int var14 = var12.method1298(var13.field2078, var13.field2073, var13.field2078.length - var13.field2073);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2073 += var14;
                    }
                    var13.field2073 = 0;
                    int var15 = var13.method2708();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2708();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2597();
                        if (var16 == 1) {
                            var10 = var13.method2597();
                        }
                    } else {
                        var9 = var13.method2762();
                        if (var16 == 1) {
                            var10 = var13.method2762();
                        }
                    }
                    var12.method1295();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method64(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field2622.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field162.length; var21++) {
                        File var22 = new File(Statics.field162[var21] + Statics.field2622[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method64(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1466 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var49) {
                    var49.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method761(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1673 = var32;
            if (!Statics.field1673.exists()) {
                Statics.field1673.mkdirs();
            }
            File[] var33 = Statics.field1673.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method64(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        class108.method1291(Statics.field1673);
        try {
            File var37 = new File(Statics.field1466, "random.dat");
            if (var37.exists()) {
                field1683 = new class73(new class74(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field2622.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field162.length; var39++) {
                        File var40 = new File(Statics.field162[var39] + Statics.field2622[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field1683 = new class73(new class74(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field1683 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field1683 = new class73(new class74(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field1677 = new class73(new class74(class108.method189("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1678 = new class73(new class74(class108.method189("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field3161 = new class73[Statics.field1674];
        for (int var44 = 0; var44 < Statics.field1674; var44++) {
            Statics.field3161[var44] = new class73(new class74(class108.method189("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("aq.x(Ljava/io/File;Ljava/io/File;B)V")
    public static void method761(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1672, "rw", 10000L);
            class154 var3 = new class154(500);
            var3.method2573(3);
            var3.method2573(arg1 == null ? 0 : 1);
            var3.method2611(arg0.getPath());
            if (arg1 != null) {
                var3.method2611(arg1.getPath());
            }
            var2.method1305(var3.field2078, 0, var3.field2073);
            var2.method1295();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("f.i(Ljava/io/File;ZI)Z")
    public static boolean method64(File arg0, boolean arg1) {
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

    @ObfuscatedName("as.a(Ljava/lang/String;Ljava/lang/String;ZB)Lbj;")
    public static class74 method843(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1673, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1562 == 33) {
            var6 = "_rc";
        } else if (Statics.field1562 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1466, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ab.c(B)V")
    public static void method813() {
        try {
            field1677.method1264();
            for (int var0 = 0; var0 < Statics.field1674; var0++) {
                Statics.field3161[var0].method1264();
            }
            field1678.method1264();
            field1683.method1264();
        } catch (Exception var2) {
        }
    }
}
