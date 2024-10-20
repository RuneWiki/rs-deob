package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dj")
public class class105 {

    @ObfuscatedName("dj.s")
    public static class73 field1694 = null;

    @ObfuscatedName("dj.g")
    public static class73 field1695 = null;

    @ObfuscatedName("dj.i")
    public static class73 field1696 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.k(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method743(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1692 = new File(Statics.field969, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1692.exists()) {
            try {
                class74 var7 = new class74(Statics.field1692, "rw", 10000L);
                class161 var8 = new class161((int) var7.method1334());
                while (var8.field2267 < var8.field2258.length) {
                    int var9 = var7.method1335(var8.field2258, var8.field2267, var8.field2258.length - var8.field2267);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2267 += var9;
                }
                var8.field2267 = 0;
                int var10 = var8.method2733();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2733();
                }
                if (var10 <= 2) {
                    var4 = var8.method2724();
                    if (var11 == 1) {
                        var5 = var8.method2724();
                    }
                } else {
                    var4 = var8.method2742();
                    if (var11 == 1) {
                        var5 = var8.method2742();
                    }
                }
                var7.method1333();
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
                if (!method647(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1698.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1199.length; var16++) {
                    File var17 = new File(Statics.field1199[var16] + Statics.field1698[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method647(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field969 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class74 var29 = new class74(Statics.field1692, "rw", 10000L);
                class161 var30 = new class161(500);
                var30.method2718(3);
                var30.method2718(var28 == null ? 0 : 1);
                var30.method2839(var27.getPath());
                if (var28 != null) {
                    var30.method2839(((File) var28).getPath());
                }
                var29.method1332(var30.field2258, 0, var30.field2267);
                var29.method1333();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("aw.y(Ljava/io/File;ZS)Z")
    public static boolean method647(File arg0, boolean arg1) {
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

    @ObfuscatedName("client.o(Ljava/lang/String;Ljava/lang/String;ZI)Lbu;")
    public static class74 method611(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3283, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1693 == 33) {
            var6 = "_rc";
        } else if (Statics.field1693 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field969, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("gp.r(I)V")
    public static void method3373() {
        try {
            File var0 = new File(Statics.field969, "random.dat");
            if (var0.exists()) {
                field1694 = new class73(new class74(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1698.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1199.length; var2++) {
                        File var3 = new File(Statics.field1199[var2] + Statics.field1698[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1694 = new class73(new class74(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1694 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1694 = new class73(new class74(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("av.w(Lfm;I)V")
    public static void method874(class161 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1694.method1318(0L);
            field1694.method1305(var1);
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
        arg0.method2727(var1, 0, 24);
    }

    @ObfuscatedName("dd.j(I)V")
    public static void method1928() {
        try {
            field1695.method1302();
            for (int var0 = 0; var0 < Statics.field178; var0++) {
                Statics.field121[var0].method1302();
            }
            field1696.method1302();
            field1694.method1302();
        } catch (Exception var2) {
        }
    }
}
