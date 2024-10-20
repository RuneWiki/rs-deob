package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dn")
public class class130 {

    @ObfuscatedName("dn.b")
    public static class369 field1492 = null;

    @ObfuscatedName("dn.i")
    public static class369 field1498 = null;

    @ObfuscatedName("dn.k")
    public static class369 field1496 = null;

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gr.f(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3786(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1115 = new File(Statics.field1499, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1115.exists()) {
            try {
                class368 var7 = new class368(Statics.field1115, "rw", 10000L);
                class384 var8 = new class384((int) var7.method5731());
                while (var8.field4161 < var8.field4160.length) {
                    int var9 = var7.method5732(var8.field4160, var8.field4161, var8.field4160.length - var8.field4161);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4161 += var9;
                }
                var8.field4161 = 0;
                int var10 = var8.method5902();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5902();
                }
                if (var10 <= 2) {
                    var4 = var8.method5907();
                    if (var11 == 1) {
                        var5 = var8.method5907();
                    }
                } else {
                    var4 = var8.method5908();
                    if (var11 == 1) {
                        var5 = var8.method5908();
                    }
                }
                var7.method5729();
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
            label134: for (int var19 = 0; var19 < Statics.field1495.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1123.length; var20++) {
                    File var21 = new File(Statics.field1123[var20] + Statics.field1495[var19] + File.separatorChar + arg0 + File.separatorChar);
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
            var4 = Statics.field1499 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class368 var38 = new class368(Statics.field1115, "rw", 10000L);
                class384 var39 = new class384(500);
                var39.method5880(3);
                var39.method5880(var37 == null ? 0 : 1);
                var39.method5889(var36.getPath());
                if (var37 != null) {
                    var39.method5889(((File) var37).getPath());
                }
                var38.method5728(var39.field4160, 0, var39.field4161);
                var38.method5729();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ji.e(Ljava/lang/String;Ljava/lang/String;ZI)Lnp;")
    public static class368 method4424(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2086, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class368(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field34 == 33) {
            var6 = "_rc";
        } else if (Statics.field34 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1499, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class368(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class368(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ms.v(B)[B")
    public static byte[] method5434() {
        byte[] var0 = new byte[24];
        try {
            field1492.method5758(0L);
            field1492.method5750(var0);
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
}
