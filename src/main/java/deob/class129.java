package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dd")
public class class129 {

    @ObfuscatedName("dd.m")
    public static class367 field1481 = null;

    @ObfuscatedName("dd.d")
    public static class367 field1479 = null;

    @ObfuscatedName("dd.c")
    public static class367 field1484 = null;

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.f(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2338(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1475 = arg3;
        Statics.field158 = arg2;
        try {
            Statics.field2576 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field2576 = "Unknown";
        }
        Statics.field511 = Statics.field2576.toLowerCase();
        try {
            Statics.field281 = System.getProperty("user.home");
            if (Statics.field281 != null) {
                Statics.field281 = Statics.field281 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field511.startsWith("win")) {
                if (Statics.field281 == null) {
                    Statics.field281 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field281 == null) {
                Statics.field281 = System.getenv("HOME");
            }
            if (Statics.field281 != null) {
                Statics.field281 = Statics.field281 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field281 == null) {
            Statics.field281 = "~/";
        }
        Statics.field4271 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field281, "/tmp/", "" };
        Statics.field3799 = new String[] { ".jagex_cache_" + Statics.field158, ".file_store_" + Statics.field158 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1477 = new File(Statics.field281, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1477.exists()) {
                try {
                    class366 var12 = new class366(Statics.field1477, "rw", 10000L);
                    class382 var13 = new class382((int) var12.method5695());
                    while (var13.field4155 < var13.field4153.length) {
                        int var14 = var12.method5671(var13.field4153, var13.field4155, var13.field4153.length - var13.field4155);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field4155 += var14;
                    }
                    var13.field4155 = 0;
                    int var15 = var13.method5856();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method5856();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method5896();
                        if (var16 == 1) {
                            var10 = var13.method5896();
                        }
                    } else {
                        var9 = var13.method5867();
                        if (var16 == 1) {
                            var10 = var13.method5867();
                        }
                    }
                    var12.method5674();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method547(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field3799.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field4271.length; var21++) {
                        File var22 = new File(Statics.field4271[var21] + Statics.field3799[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method547(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field281 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var49) {
                    var49.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method2189(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1478 = var32;
            if (!Statics.field1478.exists()) {
                Statics.field1478.mkdirs();
            }
            File[] var33 = Statics.field1478.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method547(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        class131.method4325(Statics.field1478);
        try {
            File var37 = new File(Statics.field281, "random.dat");
            if (var37.exists()) {
                field1481 = new class367(new class366(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field3799.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field4271.length; var39++) {
                        File var40 = new File(Statics.field4271[var39] + Statics.field3799[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field1481 = new class367(new class366(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field1481 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field1481 = new class367(new class366(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field1479 = new class367(new class366(class131.method167("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1484 = new class367(new class366(class131.method167("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1201 = new class367[Statics.field1475];
        for (int var44 = 0; var44 < Statics.field1475; var44++) {
            Statics.field1201[var44] = new class367(new class366(class131.method167("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ds.o(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2189(File arg0, File arg1) {
        try {
            class366 var2 = new class366(Statics.field1477, "rw", 10000L);
            class382 var3 = new class382(500);
            var3.method5839(3);
            var3.method5839(arg1 == null ? 0 : 1);
            var3.method6043(arg0.getPath());
            if (arg1 != null) {
                var3.method6043(arg1.getPath());
            }
            var2.method5673(var3.field4153, 0, var3.field4155);
            var2.method5674();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ar.u(Ljava/io/File;ZB)Z")
    public static boolean method547(File arg0, boolean arg1) {
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

    @ObfuscatedName("r.p(Ljava/lang/String;Ljava/lang/String;ZI)Lni;")
    public static class366 method162(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1478, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class366(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field158 == 33) {
            var6 = "_rc";
        } else if (Statics.field158 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field281, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class366(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class366(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fx.b(B)[B")
    public static byte[] method2920() {
        byte[] var0 = new byte[24];
        try {
            field1481.method5702(0L);
            field1481.method5707(var0);
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

    @ObfuscatedName("x.e(I)V")
    public static void method170() {
        try {
            field1479.method5725();
            for (int var0 = 0; var0 < Statics.field1475; var0++) {
                Statics.field1201[var0].method5725();
            }
            field1484.method5725();
            field1481.method5725();
        } catch (Exception var2) {
        }
    }
}
