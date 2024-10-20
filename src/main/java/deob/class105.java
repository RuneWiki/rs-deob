package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dd")
public class class105 {

    @ObfuscatedName("dd.h")
    public static class73 field1669 = null;

    @ObfuscatedName("dd.p")
    public static class73 field1674 = null;

    @ObfuscatedName("dd.l")
    public static class73 field1667 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.i(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1862(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field820 = arg3;
        Statics.field2007 = arg2;
        try {
            Statics.field768 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field768 = "Unknown";
        }
        Statics.field1463 = Statics.field768.toLowerCase();
        try {
            Statics.field806 = System.getProperty("user.home");
            if (Statics.field806 != null) {
                Statics.field806 = Statics.field806 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field1463.startsWith("win")) {
                if (Statics.field806 == null) {
                    Statics.field806 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field806 == null) {
                Statics.field806 = System.getenv("HOME");
            }
            if (Statics.field806 != null) {
                Statics.field806 = Statics.field806 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field806 == null) {
            Statics.field806 = "~/";
        }
        Statics.field232 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field806, "/tmp/", "" };
        Statics.field2124 = new String[] { ".jagex_cache_" + Statics.field2007, ".file_store_" + Statics.field2007 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field1671 = method180(arg0, arg1, var7);
            if (!Statics.field1671.exists()) {
                Statics.field1671.mkdirs();
            }
            File[] var8 = Statics.field1671.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label83;
                }
                File var11 = var9[var10];
                if (!method201(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field1671;
        Statics.field1718 = var12;
        if (!Statics.field1718.exists()) {
            throw new RuntimeException("");
        }
        class108.field1712 = true;
        Statics.method3();
        field1674 = new class73(new class74(class108.method703("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1667 = new class73(new class74(class108.method703("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field85 = new class73[Statics.field820];
        for (int var13 = 0; var13 < Statics.field820; var13++) {
            Statics.field85[var13] = new class73(new class74(class108.method703("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("u.e(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method180(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1670 = new File(Statics.field806, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1670.exists()) {
            try {
                class74 var7 = new class74(Statics.field1670, "rw", 10000L);
                class154 var8 = new class154((int) var7.method1312());
                while (var8.field2091 < var8.field2094.length) {
                    int var9 = var7.method1314(var8.field2094, var8.field2091, var8.field2094.length - var8.field2091);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2091 += var9;
                }
                var8.field2091 = 0;
                int var10 = var8.method2573();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2573();
                }
                if (var10 <= 2) {
                    var4 = var8.method2622();
                    if (var11 == 1) {
                        var5 = var8.method2622();
                    }
                } else {
                    var4 = var8.method2583();
                    if (var11 == 1) {
                        var5 = var8.method2583();
                    }
                }
                var7.method1311();
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
                if (!method201(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2124.length; var15++) {
                for (int var16 = 0; var16 < Statics.field232.length; var16++) {
                    File var17 = new File(Statics.field232[var16] + Statics.field2124[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method201(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field806 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method563(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ai.f(Ljava/io/File;Ljava/io/File;I)V")
    public static void method563(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1670, "rw", 10000L);
            class154 var3 = new class154(500);
            var3.method2746(3);
            var3.method2746(arg1 == null ? 0 : 1);
            var3.method2566(arg0.getPath());
            if (arg1 != null) {
                var3.method2566(arg1.getPath());
            }
            var2.method1310(var3.field2094, 0, var3.field2091);
            var2.method1311();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("s.k(Ljava/io/File;ZB)Z")
    public static boolean method201(File arg0, boolean arg1) {
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

    @ObfuscatedName("av.a(Ljava/lang/String;Ljava/lang/String;ZI)Lbz;")
    public static class74 method677(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1671, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2007 == 33) {
            var6 = "_rc";
        } else if (Statics.field2007 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field806, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("k.w(Let;I)V")
    public static void method34(class154 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1669.method1278(0L);
            field1669.method1282(var1);
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
        arg0.method2567(var1, 0, 24);
    }

    @ObfuscatedName("es.v(B)V")
    public static void method2283() {
        try {
            field1674.method1279();
            for (int var0 = 0; var0 < Statics.field820; var0++) {
                Statics.field85[var0].method1279();
            }
            field1667.method1279();
            field1669.method1279();
        } catch (Exception var2) {
        }
    }
}
