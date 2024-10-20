package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dg")
public class class105 {

    @ObfuscatedName("dg.w")
    public static class73 field1680 = null;

    @ObfuscatedName("dg.r")
    public static class73 field1681 = null;

    @ObfuscatedName("dg.s")
    public static class73 field1682 = null;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gf.d(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3197(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1685 = new File(Statics.field217, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1685.exists()) {
            try {
                class74 var7 = new class74(Statics.field1685, "rw", 10000L);
                class130 var8 = new class130((int) var7.method1353());
                while (var8.field1956 < var8.field1955.length) {
                    int var9 = var7.method1342(var8.field1955, var8.field1956, var8.field1955.length - var8.field1956);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1956 += var9;
                }
                var8.field1956 = 0;
                int var10 = var8.method2379();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2379();
                }
                if (var10 <= 2) {
                    var4 = var8.method2277();
                    if (var11 == 1) {
                        var5 = var8.method2277();
                    }
                } else {
                    var4 = var8.method2396();
                    if (var11 == 1) {
                        var5 = var8.method2396();
                    }
                }
                var7.method1340();
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
                if (!method641(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2793.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1679.length; var16++) {
                    File var17 = new File(Statics.field1679[var16] + Statics.field2793[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method641(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field217 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method3043(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("fc.c(Ljava/io/File;Ljava/io/File;I)V")
    public static void method3043(File arg0, File arg1) {
        try {
            class74 var2 = new class74(Statics.field1685, "rw", 10000L);
            class130 var3 = new class130(500);
            var3.method2215(3);
            var3.method2215(arg1 == null ? 0 : 1);
            var3.method2223(arg0.getPath());
            if (arg1 != null) {
                var3.method2223(arg1.getPath());
            }
            var2.method1339(var3.field1955, 0, var3.field1956);
            var2.method1340();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ao.n(Ljava/io/File;ZI)Z")
    public static boolean method641(File arg0, boolean arg1) {
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

    @ObfuscatedName("by.q(Ljava/lang/String;Ljava/lang/String;ZB)Lba;")
    public static class74 method1111(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1677, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class74(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field177 == 33) {
            var6 = "_rc";
        } else if (Statics.field177 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field217, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("h.t(B)[B")
    public static byte[] method216() {
        byte[] var0 = new byte[24];
        try {
            field1680.method1310(0L);
            field1680.method1312(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }

    @ObfuscatedName("dk.p(Ldu;II)V")
    public static void method1940(class130 arg0, int arg1) {
        if (field1680 == null) {
            return;
        }
        try {
            field1680.method1310(0L);
            field1680.method1330(arg0.field1955, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("at.u(I)V")
    public static void method889() {
        try {
            field1681.method1309();
            for (int var0 = 0; var0 < Statics.field1678; var0++) {
                Statics.field1684[var0].method1309();
            }
            field1682.method1309();
            field1680.method1309();
        } catch (Exception var2) {
        }
    }
}
