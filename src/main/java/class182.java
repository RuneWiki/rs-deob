import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class182 {

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "[B")
    private byte[] field3301 = new byte[4];

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lha;")
    private class77 field3297;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "J")
    private long field3288;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Loc;")
    private static class151 field3285 = class137.method873(2, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Loc;")
    private static class151 field3293 = class137.method873(2, "Please use a different world)3");

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3287 = 0;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Loc;")
    public static class151 field3290 = class137.method873(2, "<col=ff3000>");

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Loc;")
    public static class151 field3286 = field3293;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Loc;")
    public static class151 field3283 = field3285;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Loc;")
    public static class151 field3289 = field3293;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "[Loc;")
    public static class151[] field3305 = new class151[500];

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3300 = -1;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    private int field3295;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    private int field3298;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3281;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "[B")
    private byte[] field3302;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field3286 = null;
        field3290 = null;
        field3305 = null;
        field3293 = null;
        if (arg0 != -25521) {
            field3289 = null;
        }
        field3283 = null;
        field3285 = null;
        field3289 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I")
    public static final int method1143(int arg0, int arg1, int arg2, int arg3) {
        field3291++;
        int var4 = 256 - arg1;
        if (arg2 < 5) {
            method1146(true);
        }
        return ((arg0 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg1 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
    public static final void method1144(int arg0, boolean arg1) {
        if (class228.field3975.field3976 >> 7 == class122.field2189 && class228.field3975.field4029 >> 7 == class150.field2677) {
            class122.field2189 = 0;
        }
        int var2 = class47.field961;
        if (arg1) {
            var2 = 1;
        }
        field3303++;
        if (arg0 != 17782) {
            method1144(119, true);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class20 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class228.field3975;
            } else {
                var6 = class179.field3229[class159.field2866[var3]];
                var4 = (long) class159.field2866[var3] << 32;
            }
            if (var6 != null && var6.method173(2)) {
                int var7 = var6.field3976 >> 7;
                int var8 = var6.field4029 >> 7;
                var6.field440 = false;
                if ((class13.field300 && class47.field961 > 50 || class47.field961 > 200) && !arg1 && var6.field4002 == var6.field3993) {
                    var6.field440 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field414 == null || var6.field424 > class200.field3541 || class200.field3541 >= var6.field419) {
                        if ((var6.field3976 & 0x7F) == 64 && (var6.field4029 & 0x7F) == 64) {
                            if (class101.field1828[var7][var8] == class116.field2080) {
                                continue;
                            }
                            class101.field1828[var7][var8] = class116.field2080;
                        }
                        var6.field3989 = class195.method1225(var6.field3976, class234.field4325, var6.field4029, (byte) -118);
                        class154.method1014(class234.field4325, var6.field3976, var6.field4029, var6.field3989, 60, var6, var6.field4024, var4, var6.field4038);
                    } else {
                        var6.field440 = false;
                        var6.field3989 = class195.method1225(var6.field3976, class234.field4325, var6.field4029, (byte) -118);
                        class163.method1053(class234.field4325, var6.field3976, var6.field4029, var6.field3989, var6, var6.field4024, var4, var6.field441, var6.field421, var6.field443, var6.field445);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1145(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class187) {
            class187 var2 = (class187) arg1;
            var3 = var2.field3321 + " | ";
            arg1 = var2.field3331;
        } else {
            var3 = "";
        }
        field3296++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg0 > -72) {
            field3290 = null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static final void method1146(boolean arg0) {
        if (class22.field476 == null || class164.field2963 == null) {
            class164.field2963 = new int[256];
            class22.field476 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class22.field476[var1] = (int) (Math.sin(var2) * 4096.0D);
                class164.field2963[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (!arg0) {
            field3284++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)[B")
    public final byte[] method1147(byte arg0) throws IOException {
        if (arg0 != 18) {
            return null;
        }
        field3282++;
        if (this.field3288 < class217.method1351(61)) {
            throw new IOException("fdt");
        }
        if (this.field3292 == 0) {
            if (this.field3297.field1501 == 2) {
                throw new IOException("fds");
            }
            if (this.field3297.field1501 == 1) {
                this.field3281 = (DataInputStream) this.field3297.field1503;
                this.field3292 = 1;
            }
        }
        if (this.field3292 == 1) {
            int var2 = this.field3281.available();
            if (var2 > 0) {
                if (this.field3298 + var2 > 4) {
                    var2 = 4 - this.field3298;
                }
                this.field3298 += this.field3281.read(this.field3301, this.field3298, var2);
                if (this.field3298 == 4) {
                    int var3 = (new class229(this.field3301)).method1437(425528536);
                    this.field3292 = 2;
                    this.field3302 = new byte[var3];
                }
            }
        }
        if (this.field3292 == 2) {
            int var4 = this.field3281.available();
            if (var4 > 0) {
                if (this.field3295 + var4 > this.field3302.length) {
                    var4 = this.field3302.length - this.field3295;
                }
                this.field3295 += this.field3281.read(this.field3302, this.field3295, var4);
                if (this.field3302.length == this.field3295) {
                    return this.field3302;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class218.field3792[arg0][var8][var14] == -class11.field201) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class233.field4286[arg0][arg1][arg3] + arg5;
            if (!class9.method53(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class9.method53(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class9.method53(var9, var11, var13)) {
                return false;
            } else if (class9.method53(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class233.method1527(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class9.method53(var6 + 1, class233.field4286[arg0][arg1][arg3] + arg5, var7 + 1) && class9.method53(var6 + 128 - 1, class233.field4286[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class9.method53(var6 + 128 - 1, class233.field4286[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class9.method53(var6 + 1, class233.field4286[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lda;Ljava/net/URL;)V")
    public class182(class35 arg0, URL arg1) {
        this.field3297 = arg0.method262(arg1, -117);
        this.field3292 = 0;
        this.field3288 = class217.method1351(-75) + 30000L;
    }
}
