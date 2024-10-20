package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dp")
public class class105 {

    @ObfuscatedName("dp.m")
    public static class73 field1693 = null;

    @ObfuscatedName("dp.s")
    public static class73 field1696 = null;

    @ObfuscatedName("dp.u")
    public static class73 field1697 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fh.q(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method3082(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1553 = arg3;
        Statics.field1816 = arg2;
        try {
            Statics.field3126 = System.getProperty("os.name");
        } catch (Exception var46) {
            Statics.field3126 = "Unknown";
        }
        Statics.field1213 = Statics.field3126.toLowerCase();
        try {
            Statics.field1700 = System.getProperty("user.home");
            if (Statics.field1700 != null) {
                Statics.field1700 = Statics.field1700 + "/";
            }
        } catch (Exception var45) {
        }
        try {
            if (Statics.field1213.startsWith("win")) {
                if (Statics.field1700 == null) {
                    Statics.field1700 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1700 == null) {
                Statics.field1700 = System.getenv("HOME");
            }
            if (Statics.field1700 != null) {
                Statics.field1700 = Statics.field1700 + "/";
            }
        } catch (Exception var44) {
        }
        if (Statics.field1700 == null) {
            Statics.field1700 = "~/";
        }
        Statics.field1192 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1700, "/tmp/", "" };
        Statics.field1698 = new String[] { ".jagex_cache_" + Statics.field1816, ".file_store_" + Statics.field1816 };
        int var7 = 0;
        label221: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1688 = new File(Statics.field1700, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1688.exists()) {
                try {
                    class74 var12 = new class74(Statics.field1688, "rw", 10000L);
                    class154 var13 = new class154((int) var12.method1412());
                    while (var13.field2091 < var13.field2092.length) {
                        int var14 = var12.method1407(var13.field2092, var13.field2091, var13.field2092.length - var13.field2091);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2091 += var14;
                    }
                    var13.field2091 = 0;
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
                        var9 = var13.method2676();
                        if (var16 == 1) {
                            var10 = var13.method2676();
                        }
                    }
                    var12.method1410();
                } catch (IOException var48) {
                    var48.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method85(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label195: for (int var20 = 0; var20 < Statics.field1698.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1192.length; var21++) {
                        File var22 = new File(Statics.field1192[var21] + Statics.field1698[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method85(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label195;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1700 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var47) {
                    var47.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class74 var34 = new class74(Statics.field1688, "rw", 10000L);
                    class154 var35 = new class154(500);
                    var35.method2751(3);
                    var35.method2751(var33 == null ? 0 : 1);
                    var35.method2659(var32.getPath());
                    if (var33 != null) {
                        var35.method2659(((File) var33).getPath());
                    }
                    var34.method1404(var35.field2092, 0, var35.field2091);
                    var34.method1410();
                } catch (IOException var43) {
                    var43.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field1692 = var37;
            if (!Statics.field1692.exists()) {
                Statics.field1692.mkdirs();
            }
            File[] var38 = Statics.field1692.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method85(var41, false)) {
                        var7++;
                        continue label221;
                    }
                }
            }
            break;
        }
        class108.method190(Statics.field1692);
        method606();
        field1696 = new class73(new class74(class108.method223("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1697 = new class73(new class74(class108.method223("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1223 = new class73[Statics.field1553];
        for (int var42 = 0; var42 < Statics.field1553; var42++) {
            Statics.field1223[var42] = new class73(new class74(class108.method223("main_file_cache.idx" + var42), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("c.d(Ljava/io/File;ZI)Z")
    public static boolean method85(File arg0, boolean arg1) {
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

    @ObfuscatedName("l.h(Ljava/lang/String;Ljava/lang/String;ZB)Lbf;")
    public static class74 method221(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1692, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1816 == 33) {
            var6 = "_rc";
        } else if (Statics.field1816 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1700, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("e.p(I)V")
    public static void method606() {
        try {
            File var0 = new File(Statics.field1700, "random.dat");
            if (var0.exists()) {
                field1693 = new class73(new class74(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1698.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1192.length; var2++) {
                        File var3 = new File(Statics.field1192[var2] + Statics.field1698[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1693 = new class73(new class74(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1693 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1693 = new class73(new class74(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("x.j(I)V")
    public static void method237() {
        try {
            field1696.method1365();
            for (int var0 = 0; var0 < Statics.field1553; var0++) {
                Statics.field1223[var0].method1365();
            }
            field1697.method1365();
            field1693.method1365();
        } catch (Exception var2) {
        }
    }
}
