import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class67 extends class12 {

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Z")
    public boolean field1228 = false;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Llb;")
    private class102 field1235;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Z")
    public boolean field1229;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Z")
    public boolean field1220;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field1224 = 1;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "Lkb;")
    private static class93 field1219 = class76.method390("The server is being updated)3", 0);

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lkb;")
    public static class93 field1214 = field1219;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1226 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "[I")
    public static int[] field1239 = new int[32];

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lkb;")
    public static class93 field1241 = class76.method390("mapdots", 0);

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "F")
    private float field1232;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
    private int[] field1211;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public final void method351(byte arg0, int arg1) {
        field1216++;
        if (this.field1211 == null) {
            return;
        }
        if (this.field1234 != 0) {
            if (class51.field846 == null || class51.field846.length < this.field1211.length) {
                class51.field846 = new int[this.field1211.length];
            }
            short var3;
            if (this.field1211.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field1211.length;
            int var5 = this.field1212 * var3 * arg1;
            int var6 = var4 - 1;
            if (this.field1234 == 2) {
                var5 = -var5;
            }
            for (int var7 = 0; var7 < var4; var7++) {
                int var9 = var7 + var5 & var6;
                class51.field846[var7] = this.field1211[var9];
            }
            int[] var8 = this.field1211;
            this.field1211 = class51.field846;
            class51.field846 = var8;
        }
        if (this.field1237 != 0) {
            if (class51.field846 == null || class51.field846.length < this.field1211.length) {
                class51.field846 = new int[this.field1211.length];
            }
            int var10 = this.field1211.length;
            int var11 = this.field1212 * arg1;
            if (this.field1237 == 1) {
                var11 = -var11;
            }
            short var12;
            if (this.field1211.length == 4096) {
                var12 = 64;
            } else {
                var12 = 128;
            }
            int var13 = var12 - 1;
            for (int var14 = 0; var14 < var10; var14 += var12) {
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = var14 + var16;
                    int var18 = (var11 + var16 & var13) + var14;
                    class51.field846[var17] = this.field1211[var18];
                }
            }
            int[] var15 = this.field1211;
            this.field1211 = class51.field846;
            class51.field846 = var15;
        }
        int var19 = -38 / ((arg0 - 17) / 56);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Z")
    public static final boolean method352(int arg0, int arg1) {
        if (arg0 != 2) {
            return true;
        }
        field1221++;
        if (class140.field2730[arg1]) {
            return true;
        } else if (class18.field305.method448(arg1, (byte) 109)) {
            int var2 = class18.field305.method456(arg1, -37);
            if (var2 == 0) {
                class140.field2730[arg1] = true;
                return true;
            }
            if (class28.field460[arg1] == null) {
                class28.field460[arg1] = new class65[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class28.field460[arg1][var3] == null) {
                    byte[] var4 = class18.field305.method461(arg1, (byte) 84, var3);
                    if (var4 != null) {
                        class28.field460[arg1][var3] = new class65();
                        class28.field460[arg1][var3].field1058 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class28.field460[arg1][var3].method337(arg0 - 3, new class158(var4));
                        } else {
                            class28.field460[arg1][var3].method342((byte) -99, new class158(var4));
                        }
                    }
                }
            }
            class140.field2730[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static final void method353(int arg0) {
        field1227++;
        if (arg0 != 2) {
            method360(true);
        }
        for (int var1 = 0; var1 < class124.field2313; var1++) {
            int var2 = class14.field243[var1];
            class76 var3 = class143.field2791[var2];
            int var4 = class59.field942.method1054(128);
            if ((var4 & 0x8) != 0) {
                var3.field2053 = class59.field942.method1037(16711680);
                var3.field2042 = class59.field942.method1034(68);
            }
            if ((var4 & 0x1) != 0) {
                var3.field2041 = class59.field942.method1035(arg0 + 253);
                var3.field2068 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1364 = class200.method1313(class59.field942.method1037(16711680), 9);
                var3.field2047 = var3.field1364.field3786;
                var3.field2044 = var3.field1364.field3777;
                var3.field2029 = var3.field1364.field3807;
                var3.field2031 = var3.field1364.field3798;
                var3.field2046 = var3.field1364.field3806;
                var3.field2076 = var3.field1364.field3803;
                var3.field2048 = var3.field1364.field3789;
                var3.field2015 = var3.field1364.field3812;
                var3.field2014 = var3.field1364.field3794;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class59.field942.method1068((byte) -109);
                int var6 = class59.field942.method1054(arg0 + 126);
                var3.method605(var6, var5, class21.field338, true);
                var3.field2057 = class21.field338 + 300;
                var3.field2036 = class59.field942.method1054(128);
            }
            if ((var4 & 0x80) != 0) {
                var3.field2040 = class59.field942.method1034(arg0 ^ 0x5C);
                int var7 = class59.field942.method1070(-2);
                var3.field2066 = 0;
                var3.field2058 = (var7 & 0xFFFF) + class21.field338;
                var3.field2052 = var7 >> 16;
                if (var3.field2040 == 65535) {
                    var3.field2040 = -1;
                }
                var3.field2019 = 0;
                if (class21.field338 < var3.field2058) {
                    var3.field2019 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var8 = class59.field942.method1037(16711680);
                int var9 = class59.field942.method1054(128);
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var3.field2077 == var8 && var8 != -1) {
                    int var10 = class39.method213(arg0 ^ 0xFFFFD673, var8).field604;
                    if (var10 == 1) {
                        var3.field2012 = 0;
                        var3.field2062 = var9;
                        var3.field2070 = 0;
                        var3.field2039 = 0;
                    }
                    if (var10 == 2) {
                        var3.field2070 = 0;
                    }
                } else if (var8 == -1 || var3.field2077 == -1 || class39.method213(-10639, var8).field607 >= class39.method213(arg0 - 10641, var3.field2077).field607) {
                    var3.field2062 = var9;
                    var3.field2012 = 0;
                    var3.field2039 = 0;
                    var3.field2077 = var8;
                    var3.field2070 = 0;
                    var3.field2050 = var3.field2060;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var11 = class59.field942.method1068((byte) -64);
                int var12 = class59.field942.method1068((byte) -66);
                var3.method605(var12, var11, class21.field338, true);
            }
            if ((var4 & 0x20) != 0) {
                var3.field2059 = class59.field942.method1037(16711680);
                if (var3.field2059 == 65535) {
                    var3.field2059 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lrh;Ljg;I)Z")
    public final boolean method354(class162 arg0, class89 arg1, int arg2) {
        field1233++;
        if (arg2 != 15) {
            field1240 = -63;
        }
        return this.field1235.method566(-115, arg1, arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljg;BFLrh;I)[I")
    public final int[] method355(class89 arg0, byte arg1, float arg2, class162 arg3, int arg4) {
        field1236++;
        if (this.field1211 == null || this.field1232 != arg2) {
            if (!this.field1235.method566(-105, arg0, arg3)) {
                return null;
            }
            int var6 = this.field1222 > arg4 ? arg4 : this.field1222;
            this.field1211 = this.field1235.method569(arg0, var6, arg3, true, var6, arg1 - 62, (double) arg2);
            this.field1232 = arg2;
        }
        if (arg1 != 62) {
            field1241 = null;
        }
        return this.field1211;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method356(byte arg0, Throwable arg1) throws IOException {
        field1215++;
        if (arg0 >= -115) {
            method352(-63, -66);
        }
        String var2;
        if (arg1 instanceof class71) {
            class71 var3 = (class71) arg1;
            var2 = var3.field1309 + " | ";
            arg1 = var3.field1308;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)Lkb;")
    public static final class93 method357(byte arg0, int arg1) {
        field1213++;
        return arg0 >= -85 ? null : class84.method425(10, -124, false, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field1223++;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method358(int arg0) {
        field1239 = null;
        field1214 = null;
        field1241 = null;
        if (arg0 <= 102) {
            method360(true);
        }
        field1226 = null;
        field1219 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjg;Lrh;I)[I")
    public final int[] method359(int arg0, class89 arg1, class162 arg2, int arg3) {
        field1230++;
        if (this.field1235.method566(arg0 ^ 0xFFFFFF91, arg1, arg2)) {
            int var5 = arg3 >= this.field1222 ? this.field1222 : arg3;
            return arg0 == 0 ? this.field1235.method569(arg1, var5, arg2, false, var5, 0, 1.0D) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
    public static final void method360(boolean arg0) {
        field1218++;
        int var1 = class68.field1250.method1005(class161.field3231);
        for (int var2 = 0; var2 < class100.field1841; var2++) {
            int var6 = class68.field1250.method1005(class203.method1320(107, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class36.field593 = class100.field1841 * 15 + 22;
        class121.field2241 = true;
        if (arg0) {
            field1219 = null;
        }
        var1 += 8;
        class44.field722 = var1;
        int var3 = class100.field1841 * 15 + 21;
        int var4 = class88.field1592 - var1 / 2;
        int var5 = class57.field928;
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class184.field3622 = var4;
        class66.field1202 = var5;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lrd;)V")
    public class67(class158 arg0) {
        this.field1235 = new class102(arg0);
        int var2 = arg0.method1054(128);
        this.field1229 = (var2 & 0x2) != 0;
        this.field1220 = (var2 & 0x1) != 0;
        this.field1222 = arg0.method1054(128);
        this.field1225 = arg0.method1071(28101);
        this.field1238 = arg0.method1054(128);
        if (this.field1238 == 255) {
            this.field1238 = 256;
        }
        int var3 = arg0.method1054(128);
        int var4 = arg0.method1054(128);
        this.field1234 = var4 >> 6 & 0x3;
        this.field1237 = var3 >> 6 & 0x3;
        this.field1212 = (var4 & 0x3F) - 6;
        arg0.method1054(128);
        arg0.method1054(128);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class67() {
        this.field1235 = new class102();
        this.field1220 = true;
        this.field1222 = 1;
    }
}
