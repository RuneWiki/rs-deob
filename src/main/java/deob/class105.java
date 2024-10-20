package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("de")
public class class105 {

    @ObfuscatedName("de.q")
    public static class73 field1690 = null;

    @ObfuscatedName("de.l")
    public static class73 field1681 = null;

    @ObfuscatedName("de.y")
    public static class73 field1688 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.n(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3031(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field3159 = arg3;
        Statics.field1672 = arg2;
        try {
            Statics.field2689 = System.getProperty("os.name");
        } catch (Exception var40) {
            Statics.field2689 = "Unknown";
        }
        Statics.field592 = Statics.field2689.toLowerCase();
        try {
            Statics.field212 = System.getProperty("user.home");
            if (Statics.field212 != null) {
                Statics.field212 = Statics.field212 + "/";
            }
        } catch (Exception var39) {
        }
        try {
            if (Statics.field592.startsWith("win")) {
                if (Statics.field212 == null) {
                    Statics.field212 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field212 == null) {
                Statics.field212 = System.getenv("HOME");
            }
            if (Statics.field212 != null) {
                Statics.field212 = Statics.field212 + "/";
            }
        } catch (Exception var38) {
        }
        if (Statics.field212 == null) {
            Statics.field212 = "~/";
        }
        Statics.field1686 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field212, "/tmp/", "" };
        Statics.field1106 = new String[] { ".jagex_cache_" + Statics.field1672, ".file_store_" + Statics.field1672 };
        int var7 = 0;
        label206: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1680 = new File(Statics.field212, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1680.exists()) {
                try {
                    class74 var12 = new class74(Statics.field1680, "rw", 10000L);
                    class161 var13 = new class161((int) var12.method1349());
                    while (var13.field2285 < var13.field2291.length) {
                        int var14 = var12.method1354(var13.field2291, var13.field2285, var13.field2291.length - var13.field2285);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2285 += var14;
                    }
                    var13.field2285 = 0;
                    int var15 = var13.method2823();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2823();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2789();
                        if (var16 == 1) {
                            var10 = var13.method2789();
                        }
                    } else {
                        var9 = var13.method2790();
                        if (var16 == 1) {
                            var10 = var13.method2790();
                        }
                    }
                    var12.method1352();
                } catch (IOException var42) {
                    var42.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method1825(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label180: for (int var20 = 0; var20 < Statics.field1106.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1686.length; var21++) {
                        File var22 = new File(Statics.field1686[var21] + Statics.field1106[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1825(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label180;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field212 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var41) {
                    var41.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method753(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1677 = var32;
            if (!Statics.field1677.exists()) {
                Statics.field1677.mkdirs();
            }
            File[] var33 = Statics.field1677.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method1825(var36, false)) {
                        var7++;
                        continue label206;
                    }
                }
            }
            break;
        }
        class108.method1817(Statics.field1677);
        method3900();
        field1681 = new class73(new class74(class108.method2753("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1688 = new class73(new class74(class108.method2753("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1689 = new class73[Statics.field3159];
        for (int var37 = 0; var37 < Statics.field3159; var37++) {
            Statics.field1689[var37] = new class73(new class74(class108.method2753("main_file_cache.idx" + var37), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("az.d(Ljava/io/File;Ljava/io/File;B)V")
    public static void method753(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1680, "rw", 10000L);
            class161 var3 = new class161(500);
            var3.method2765(3);
            var3.method2765(arg1 == null ? 0 : 1);
            var3.method2773(arg0.getPath());
            if (arg1 != null) {
                var3.method2773(arg1.getPath());
            }
            var2.method1351(var3.field2291, 0, var3.field2285);
            var2.method1352();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ch.m(Ljava/io/File;ZI)Z")
    public static boolean method1825(File arg0, boolean arg1) {
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

    @ObfuscatedName("dn.h(Ljava/lang/String;Ljava/lang/String;ZI)Lbs;")
    public static class74 method2171(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1677, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1672 == 33) {
            var6 = "_rc";
        } else if (Statics.field1672 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field212, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("hg.w(I)V")
    public static void method3900() {
        try {
            File var0 = new File(Statics.field212, "random.dat");
            if (var0.exists()) {
                field1690 = new class73(new class74(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1106.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1686.length; var2++) {
                        File var3 = new File(Statics.field1686[var2] + Statics.field1106[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1690 = new class73(new class74(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1690 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1690 = new class73(new class74(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("af.r(Lfa;B)V")
    public static void method735(class161 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1690.method1335(0L);
            field1690.method1318(var1);
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
        arg0.method2774(var1, 0, 24);
    }

    @ObfuscatedName("af.c(B)V")
    public static void method736() {
        try {
            field1681.method1337();
            for (int var0 = 0; var0 < Statics.field3159; var0++) {
                Statics.field1689[var0].method1337();
            }
            field1688.method1337();
            field1690.method1337();
        } catch (Exception var2) {
        }
    }
}
