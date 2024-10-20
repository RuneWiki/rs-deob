package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dm")
public class class129 {

    @ObfuscatedName("dm.l")
    public static class368 field1491 = null;

    @ObfuscatedName("dm.o")
    public static class368 field1493 = null;

    @ObfuscatedName("dm.c")
    public static class368 field1488 = null;

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.v(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method294(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field4218 = new File(Statics.field197, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field4218.exists()) {
            try {
                class367 var7 = new class367(Statics.field4218, "rw", 10000L);
                class383 var8 = new class383((int) var7.method5809());
                while (var8.field4158 < var8.field4155.length) {
                    int var9 = var7.method5810(var8.field4155, var8.field4158, var8.field4155.length - var8.field4158);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4158 += var9;
                }
                var8.field4158 = 0;
                int var10 = var8.method5965();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5965();
                }
                if (var10 <= 2) {
                    var4 = var8.method5975();
                    if (var11 == 1) {
                        var5 = var8.method5975();
                    }
                } else {
                    var4 = var8.method5976();
                    if (var11 == 1) {
                        var5 = var8.method5976();
                    }
                }
                var7.method5823();
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
                if (!method3745(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field3554.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1167.length; var16++) {
                    File var17 = new File(Statics.field1167[var16] + Statics.field3554[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method3745(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field197 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class367 var29 = new class367(Statics.field4218, "rw", 10000L);
                class383 var30 = new class383(500);
                var30.method6043(3);
                var30.method6043(var28 == null ? 0 : 1);
                var30.method5963(var27.getPath());
                if (var28 != null) {
                    var30.method5963(((File) var28).getPath());
                }
                var29.method5806(var30.field4155, 0, var30.field4158);
                var29.method5823();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("gk.n(Ljava/io/File;ZI)Z")
    public static boolean method3745(File arg0, boolean arg1) {
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

    @ObfuscatedName("ci.f(Ljava/lang/String;Ljava/lang/String;ZI)Lnm;")
    public static class367 method1727(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field123, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class367(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1459 == 33) {
            var6 = "_rc";
        } else if (Statics.field1459 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field197, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class367(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class367(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bu.y(I)V")
    public static void method708() {
        try {
            File var0 = new File(Statics.field197, "random.dat");
            if (var0.exists()) {
                field1491 = new class368(new class367(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3554.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1167.length; var2++) {
                        File var3 = new File(Statics.field1167[var2] + Statics.field3554[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1491 = new class368(new class367(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1491 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1491 = new class368(new class367(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("by.p(I)V")
    public static void method1563() {
        try {
            field1493.method5824();
            for (int var0 = 0; var0 < Statics.field470; var0++) {
                Statics.field1160[var0].method5824();
            }
            field1488.method5824();
            field1491.method5824();
        } catch (Exception var2) {
        }
    }
}
