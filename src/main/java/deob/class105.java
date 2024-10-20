package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dy")
public class class105 {

    @ObfuscatedName("dy.c")
    public static class73 field1684 = null;

    @ObfuscatedName("dy.m")
    public static class73 field1689 = null;

    @ObfuscatedName("dy.h")
    public static class73 field1690 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.p(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method675(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1682 = arg3;
        Statics.field1692 = arg2;
        try {
            Statics.field1688 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field1688 = "Unknown";
        }
        Statics.field1535 = Statics.field1688.toLowerCase();
        try {
            Statics.field972 = System.getProperty("user.home");
            if (Statics.field972 != null) {
                Statics.field972 = Statics.field972 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field1535.startsWith("win")) {
                if (Statics.field972 == null) {
                    Statics.field972 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field972 == null) {
                Statics.field972 = System.getenv("HOME");
            }
            if (Statics.field972 != null) {
                Statics.field972 = Statics.field972 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field972 == null) {
            Statics.field972 = "~/";
        }
        Statics.field1085 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field972, "/tmp/", "" };
        Statics.field2634 = new String[] { ".jagex_cache_" + Statics.field1692, ".file_store_" + Statics.field1692 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field2333 = method3548(arg0, arg1, var7);
            if (!Statics.field2333.exists()) {
                Statics.field2333.mkdirs();
            }
            File[] var8 = Statics.field2333.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label79;
                }
                File var11 = var9[var10];
                if (!method217(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class108.method252(Statics.field2333);
        method160();
        field1689 = new class73(new class74(class108.method159("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1690 = new class73(new class74(class108.method159("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field152 = new class73[Statics.field1682];
        for (int var12 = 0; var12 < Statics.field1682; var12++) {
            Statics.field152[var12] = new class73(new class74(class108.method159("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("go.g(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3548(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1683 = new File(Statics.field972, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1683.exists()) {
            try {
                class74 var7 = new class74(Statics.field1683, "rw", 10000L);
                class154 var8 = new class154((int) var7.method1320());
                while (var8.field2098 < var8.field2092.length) {
                    int var9 = var7.method1307(var8.field2092, var8.field2098, var8.field2092.length - var8.field2098);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2098 += var9;
                }
                var8.field2098 = 0;
                int var10 = var8.method2593();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2593();
                }
                if (var10 <= 2) {
                    var4 = var8.method2604();
                    if (var11 == 1) {
                        var5 = var8.method2604();
                    }
                } else {
                    var4 = var8.method2640();
                    if (var11 == 1) {
                        var5 = var8.method2640();
                    }
                }
                var7.method1305();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method217(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2634.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1085.length; var16++) {
                    File var17 = new File(Statics.field1085[var16] + Statics.field2634[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method217(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field972 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class74 var29 = new class74(Statics.field1683, "rw", 10000L);
                class154 var30 = new class154(500);
                var30.method2578(3);
                var30.method2578(var28 == null ? 0 : 1);
                var30.method2586(var27.getPath());
                if (var28 != null) {
                    var30.method2586(((File) var28).getPath());
                }
                var29.method1304(var30.field2092, 0, var30.field2098);
                var29.method1305();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("l.x(Ljava/io/File;ZI)Z")
    public static boolean method217(File arg0, boolean arg1) {
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

    @ObfuscatedName("av.q(Ljava/lang/String;Ljava/lang/String;ZB)Lbk;")
    public static class74 method715(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2333, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1692 == 33) {
            var6 = "_rc";
        } else if (Statics.field1692 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field972, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("m.d(B)V")
    public static void method160() {
        try {
            File var0 = new File(Statics.field972, "random.dat");
            if (var0.exists()) {
                field1684 = new class73(new class74(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2634.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1085.length; var2++) {
                        File var3 = new File(Statics.field1085[var2] + Statics.field2634[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1684 = new class73(new class74(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1684 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1684 = new class73(new class74(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("aq.k(Lev;I)V")
    public static void method854(class154 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1684.method1271(0L);
            field1684.method1272(var1);
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
        arg0.method2587(var1, 0, 24);
    }

    @ObfuscatedName("dl.j(I)V")
    public static void method1947() {
        try {
            field1689.method1270();
            for (int var0 = 0; var0 < Statics.field1682; var0++) {
                Statics.field152[var0].method1270();
            }
            field1690.method1270();
            field1684.method1270();
        } catch (Exception var2) {
        }
    }
}
