package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dl")
public class class105 {

    @ObfuscatedName("dl.q")
    public static class73 field1696 = null;

    @ObfuscatedName("dl.v")
    public static class73 field1697 = null;

    @ObfuscatedName("dl.l")
    public static class73 field1692 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.x(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3196(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1698 = new File(Statics.field725, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1698.exists()) {
            try {
                class74 var7 = new class74(Statics.field1698, "rw", 10000L);
                class154 var8 = new class154((int) var7.method1395());
                while (var8.field2086 < var8.field2091.length) {
                    int var9 = var7.method1391(var8.field2091, var8.field2086, var8.field2091.length - var8.field2086);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2086 += var9;
                }
                var8.field2086 = 0;
                int var10 = var8.method2701();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2701();
                }
                if (var10 <= 2) {
                    var4 = var8.method2781();
                    if (var11 == 1) {
                        var5 = var8.method2781();
                    }
                } else {
                    var4 = var8.method2656();
                    if (var11 == 1) {
                        var5 = var8.method2656();
                    }
                }
                var7.method1394();
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
                if (!method279(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field3101.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1477.length; var16++) {
                    File var17 = new File(Statics.field1477[var16] + Statics.field3101[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method279(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field725 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method949(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ag.j(Ljava/io/File;Ljava/io/File;I)V")
    public static void method949(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1698, "rw", 10000L);
            class154 var3 = new class154(500);
            var3.method2651(3);
            var3.method2651(arg1 == null ? 0 : 1);
            var3.method2632(arg0.getPath());
            if (arg1 != null) {
                var3.method2632(arg1.getPath());
            }
            var2.method1396(var3.field2091, 0, var3.field2086);
            var2.method1394();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("a.c(Ljava/io/File;ZB)Z")
    public static boolean method279(File arg0, boolean arg1) {
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

    @ObfuscatedName("c.d(Ljava/lang/String;Ljava/lang/String;ZI)Lbz;")
    public static class74 method34(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3184, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field235 == 33) {
            var6 = "_rc";
        } else if (Statics.field235 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field725, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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
}
