package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eu")
public class class131 {

    @ObfuscatedName("eu.p")
    public static class370 field1471 = null;

    @ObfuscatedName("eu.h")
    public static class370 field1477 = null;

    @ObfuscatedName("eu.k")
    public static class370 field1479 = null;

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.t(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method121(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1476 = new File(Statics.field2823, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1476.exists()) {
            try {
                class369 var7 = new class369(Statics.field1476, "rw", 10000L);
                class385 var8 = new class385((int) var7.method5783());
                while (var8.field4182 < var8.field4184.length) {
                    int var9 = var7.method5789(var8.field4184, var8.field4182, var8.field4184.length - var8.field4182);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4182 += var9;
                }
                var8.field4182 = 0;
                int var10 = var8.method5958();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5958();
                }
                if (var10 <= 2) {
                    var4 = var8.method6104();
                    if (var11 == 1) {
                        var5 = var8.method6104();
                    }
                } else {
                    var4 = var8.method5969();
                    if (var11 == 1) {
                        var5 = var8.method5969();
                    }
                }
                var7.method5786();
            } catch (IOException var45) {
                var45.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var43) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label134: for (int var19 = 0; var19 < Statics.field3127.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1254.length; var20++) {
                    File var21 = new File(Statics.field1254[var20] + Statics.field3127[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var42) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label134;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2823 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var36 = new File(var4);
            Object var37 = null;
            try {
                class369 var38 = new class369(Statics.field1476, "rw", 10000L);
                class385 var39 = new class385(500);
                var39.method5941(3);
                var39.method5941(var37 == null ? 0 : 1);
                var39.method5950(var36.getPath());
                if (var37 != null) {
                    var39.method5950(((File) var37).getPath());
                }
                var38.method5790(var39.field4184, 0, var39.field4182);
                var38.method5786();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("aw.v(Ljava/io/File;ZB)Z")
    public static boolean method1556(File arg0, boolean arg1) {
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

    @ObfuscatedName("be.j(Ljava/lang/String;Ljava/lang/String;ZB)Lnx;")
    public static class369 method1860(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1475, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class369(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1161 == 33) {
            var6 = "_rc";
        } else if (Statics.field1161 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2823, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class369(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class369(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("el.l(I)[B")
    public static byte[] method2389() {
        byte[] var0 = new byte[24];
        try {
            field1471.method5805(0L);
            field1471.method5807(var0);
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

    @ObfuscatedName("bj.n(Lnv;II)V")
    public static void method1705(class385 arg0, int arg1) {
        if (field1471 == null) {
            return;
        }
        try {
            field1471.method5805(0L);
            field1471.method5811(arg0.field4184, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
