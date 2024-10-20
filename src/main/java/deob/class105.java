package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dd")
public class class105 {

    @ObfuscatedName("dd.s")
    public static class73 field1713 = null;

    @ObfuscatedName("dd.q")
    public static class73 field1714 = null;

    @ObfuscatedName("dd.d")
    public static class73 field1715 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.f(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2198(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field4 = arg3;
        Statics.field1716 = arg2;
        try {
            Statics.field768 = System.getProperty("os.name");
        } catch (Exception var54) {
            Statics.field768 = "Unknown";
        }
        Statics.field973 = Statics.field768.toLowerCase();
        try {
            Statics.field3075 = System.getProperty("user.home");
            if (Statics.field3075 != null) {
                Statics.field3075 = Statics.field3075 + "/";
            }
        } catch (Exception var53) {
        }
        try {
            if (Statics.field973.startsWith("win")) {
                if (Statics.field3075 == null) {
                    Statics.field3075 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3075 == null) {
                Statics.field3075 = System.getenv("HOME");
            }
            if (Statics.field3075 != null) {
                Statics.field3075 = Statics.field3075 + "/";
            }
        } catch (Exception var52) {
        }
        if (Statics.field3075 == null) {
            Statics.field3075 = "~/";
        }
        Statics.field1595 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3075, "/tmp/", "" };
        Statics.field174 = new String[] { ".jagex_cache_" + Statics.field1716, ".file_store_" + Statics.field1716 };
        int var7 = 0;
        label261: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1709 = new File(Statics.field3075, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1709.exists()) {
                try {
                    class74 var12 = new class74(Statics.field1709, "rw", 10000L);
                    class154 var13 = new class154((int) var12.method1362());
                    while (var13.field2111 < var13.field2114.length) {
                        int var14 = var12.method1363(var13.field2114, var13.field2111, var13.field2114.length - var13.field2111);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2111 += var14;
                    }
                    var13.field2111 = 0;
                    int var15 = var13.method2666();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2666();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2675();
                        if (var16 == 1) {
                            var10 = var13.method2675();
                        }
                    } else {
                        var9 = var13.method2658();
                        if (var16 == 1) {
                            var10 = var13.method2658();
                        }
                    }
                    var12.method1361();
                } catch (IOException var57) {
                    var57.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method1128(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label235: for (int var20 = 0; var20 < Statics.field174.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1595.length; var21++) {
                        File var22 = new File(Statics.field1595[var21] + Statics.field174[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1128(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label235;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field3075 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var56) {
                    var56.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class74 var34 = new class74(Statics.field1709, "rw", 10000L);
                    class154 var35 = new class154(500);
                    var35.method2651(3);
                    var35.method2651(var33 == null ? 0 : 1);
                    var35.method2659(var32.getPath());
                    if (var33 != null) {
                        var35.method2659(((File) var33).getPath());
                    }
                    var34.method1360(var35.field2114, 0, var35.field2111);
                    var34.method1361();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2201 = var37;
            if (!Statics.field2201.exists()) {
                Statics.field2201.mkdirs();
            }
            File[] var38 = Statics.field2201.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method1128(var41, false)) {
                        var7++;
                        continue label261;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field2201;
        Statics.field1753 = var42;
        if (!Statics.field1753.exists()) {
            throw new RuntimeException("");
        }
        class108.field1754 = true;
        try {
            File var43 = new File(Statics.field3075, "random.dat");
            if (var43.exists()) {
                field1713 = new class73(new class74(var43, "rw", 25L), 24, 0);
            } else {
                label186: for (int var44 = 0; var44 < Statics.field174.length; var44++) {
                    for (int var45 = 0; var45 < Statics.field1595.length; var45++) {
                        File var46 = new File(Statics.field1595[var45] + Statics.field174[var44] + File.separatorChar + "random.dat");
                        if (var46.exists()) {
                            field1713 = new class73(new class74(var46, "rw", 25L), 24, 0);
                            break label186;
                        }
                    }
                }
            }
            if (field1713 == null) {
                RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
                int var48 = var47.read();
                var47.seek(0L);
                var47.write(var48);
                var47.seek(0L);
                var47.close();
                field1713 = new class73(new class74(var43, "rw", 25L), 24, 0);
            }
        } catch (IOException var55) {
        }
        field1714 = new class73(new class74(class108.method79("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1715 = new class73(new class74(class108.method79("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field187 = new class73[Statics.field4];
        for (int var50 = 0; var50 < Statics.field4; var50++) {
            Statics.field187[var50] = new class73(new class74(class108.method79("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bv.i(Ljava/io/File;ZI)Z")
    public static boolean method1128(File arg0, boolean arg1) {
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

    @ObfuscatedName("aa.u(Ljava/lang/String;Ljava/lang/String;ZI)Lbx;")
    public static class74 method849(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2201, "preferences" + arg0 + ".dat");
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
        File var7 = new File(Statics.field3075, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("p.r(I)V")
    public static void method163() {
        try {
            field1714.method1348();
            for (int var0 = 0; var0 < Statics.field4; var0++) {
                Statics.field187[var0].method1348();
            }
            field1715.method1348();
            field1713.method1348();
        } catch (Exception var2) {
        }
    }
}
