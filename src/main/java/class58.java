import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RBTWCHLG")
public class class58 {

    @OriginalMember(owner = "RBTWCHLG", name = "c", descriptor = "B")
    public byte field1250 = 1;

    @OriginalMember(owner = "RBTWCHLG", name = "d", descriptor = "Z")
    public boolean field1251 = false;

    @OriginalMember(owner = "RBTWCHLG", name = "i", descriptor = "I")
    public int field1256 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "j", descriptor = "I")
    private int field1257 = 128;

    @OriginalMember(owner = "RBTWCHLG", name = "k", descriptor = "I")
    public int field1258 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "l", descriptor = "J")
    public long field1259 = -1L;

    @OriginalMember(owner = "RBTWCHLG", name = "o", descriptor = "I")
    public int field1262 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "p", descriptor = "B")
    private byte field1263 = 1;

    @OriginalMember(owner = "RBTWCHLG", name = "s", descriptor = "I")
    public int field1266 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "u", descriptor = "Z")
    public boolean field1268 = true;

    @OriginalMember(owner = "RBTWCHLG", name = "v", descriptor = "I")
    public int field1269 = 32;

    @OriginalMember(owner = "RBTWCHLG", name = "w", descriptor = "Z")
    public boolean field1270 = true;

    @OriginalMember(owner = "RBTWCHLG", name = "x", descriptor = "Z")
    private boolean field1271 = false;

    @OriginalMember(owner = "RBTWCHLG", name = "z", descriptor = "I")
    public int field1273 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "A", descriptor = "I")
    private int field1274 = 128;

    @OriginalMember(owner = "RBTWCHLG", name = "E", descriptor = "I")
    public int field1278 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "F", descriptor = "I")
    public int field1279 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "G", descriptor = "I")
    public int field1280 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "H", descriptor = "I")
    public int field1281 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "I", descriptor = "I")
    private int field1282 = -374;

    @OriginalMember(owner = "RBTWCHLG", name = "J", descriptor = "I")
    public int field1283 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "K", descriptor = "I")
    public int field1284 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "L", descriptor = "I")
    private int field1285 = 693;

    @OriginalMember(owner = "RBTWCHLG", name = "M", descriptor = "B")
    private byte field1286 = 18;

    @OriginalMember(owner = "RBTWCHLG", name = "N", descriptor = "I")
    public int field1287 = -1;

    @OriginalMember(owner = "RBTWCHLG", name = "n", descriptor = "LOOTLZHQB;")
    public static class46 field1261 = new class46(30, 9);

    @OriginalMember(owner = "RBTWCHLG", name = "b", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "RBTWCHLG", name = "f", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "RBTWCHLG", name = "g", descriptor = "I")
    private static int field1254;

    @OriginalMember(owner = "RBTWCHLG", name = "h", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "RBTWCHLG", name = "q", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "RBTWCHLG", name = "m", descriptor = "LJHKSAGUC;")
    private static class31 field1260;

    @OriginalMember(owner = "RBTWCHLG", name = "D", descriptor = "Lclient;")
    public static client field1277;

    @OriginalMember(owner = "RBTWCHLG", name = "e", descriptor = "Ljava/lang/String;")
    public String field1252;

    @OriginalMember(owner = "RBTWCHLG", name = "Q", descriptor = "[B")
    public byte[] field1290;

    @OriginalMember(owner = "RBTWCHLG", name = "t", descriptor = "[I")
    private int[] field1267;

    @OriginalMember(owner = "RBTWCHLG", name = "y", descriptor = "[I")
    private int[] field1272;

    @OriginalMember(owner = "RBTWCHLG", name = "B", descriptor = "[I")
    private int[] field1275;

    @OriginalMember(owner = "RBTWCHLG", name = "C", descriptor = "[I")
    public int[] field1276;

    @OriginalMember(owner = "RBTWCHLG", name = "O", descriptor = "[I")
    private int[] field1288;

    @OriginalMember(owner = "RBTWCHLG", name = "P", descriptor = "[I")
    private static int[] field1289;

    @OriginalMember(owner = "RBTWCHLG", name = "r", descriptor = "[LRBTWCHLG;")
    private static class58[] field1265;

    @OriginalMember(owner = "RBTWCHLG", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field1248;

    @OriginalMember(owner = "RBTWCHLG", name = "a", descriptor = "([IIII)LRTQSBWRH;")
    public final class59 method443(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field1276 != null) {
            class58 var6 = this.method448(true);
            return var6 == null ? null : var6.method443(arg0, arg1, 856, arg3);
        }
        class59 var7 = (class59) field1261.method386(this.field1259);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1267.length; var9++) {
                if (!class59.method455(this.field1267[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class59[] var10 = new class59[this.field1267.length];
            for (int var11 = 0; var11 < this.field1267.length; var11++) {
                var10[var11] = class59.method454(false, this.field1267[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class59(var10.length, var10, this.field1249);
            }
            if (this.field1275 != null) {
                for (int var12 = 0; var12 < this.field1275.length; var12++) {
                    var7.method468(this.field1275[var12], this.field1288[var12]);
                }
            }
            var7.method461(this.field1282);
            var7.method471(this.field1264 + 64, this.field1253 + 850, -30, -50, -30, true);
            field1261.method387(this.field1259, var7, (byte) 8);
        }
        class59 var13 = class59.field1299;
        var13.method456(class18.method229(arg3, 8) & class18.method229(arg1, 8), this.field1285, var7);
        if (arg3 != -1 && arg1 != -1) {
            var13.method463(arg0, arg1, this.field1286, arg3);
        } else if (arg3 != -1) {
            var13.method462(arg3, this.field1263);
        }
        if (this.field1274 != 128 || this.field1257 != 128) {
            var13.method470(this.field1257, this.field1274, this.field1274, true);
        }
        var13.method458(-8326);
        var13.field1336 = null;
        var13.field1335 = null;
        if (this.field1250 == 1) {
            var13.field1337 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "RBTWCHLG", name = "a", descriptor = "(LJHKSAGUC;I)V")
    private final void method444(class31 arg0, int arg1) {
        if (arg1 != 0) {
            this.field1271 = !this.field1271;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method306();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method306();
                    this.field1267 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1267[var5] = arg0.method308();
                    }
                } else if (var3 == 2) {
                    this.field1252 = arg0.method313();
                } else if (var3 == 3) {
                    this.field1290 = arg0.method314(-571);
                } else if (var3 == 12) {
                    this.field1250 = arg0.method307();
                } else if (var3 == 13) {
                    this.field1280 = arg0.method308();
                } else if (var3 == 14) {
                    this.field1284 = arg0.method308();
                } else if (var3 == 17) {
                    this.field1284 = arg0.method308();
                    this.field1278 = arg0.method308();
                    this.field1273 = arg0.method308();
                    this.field1258 = arg0.method308();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1248 == null) {
                        this.field1248 = new String[5];
                    }
                    this.field1248[var3 - 30] = arg0.method313();
                    if (this.field1248[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1248[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method306();
                    this.field1275 = new int[var6];
                    this.field1288 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1275[var7] = arg0.method308();
                        this.field1288[var7] = arg0.method308();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method306();
                    this.field1272 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1272[var9] = arg0.method308();
                    }
                } else if (var3 == 90) {
                    this.field1262 = arg0.method308();
                } else if (var3 == 91) {
                    this.field1283 = arg0.method308();
                } else if (var3 == 92) {
                    this.field1279 = arg0.method308();
                } else if (var3 == 93) {
                    this.field1268 = false;
                } else if (var3 == 95) {
                    this.field1256 = arg0.method308();
                } else if (var3 == 97) {
                    this.field1274 = arg0.method308();
                } else if (var3 == 98) {
                    this.field1257 = arg0.method308();
                } else if (var3 == 99) {
                    this.field1251 = true;
                } else if (var3 == 100) {
                    this.field1264 = arg0.method307();
                } else if (var3 == 101) {
                    this.field1253 = arg0.method307() * 5;
                } else if (var3 == 102) {
                    this.field1266 = arg0.method308();
                } else if (var3 == 103) {
                    this.field1269 = arg0.method308();
                } else if (var3 == 106) {
                    this.field1287 = arg0.method308();
                    if (this.field1287 == 65535) {
                        this.field1287 = -1;
                    }
                    this.field1281 = arg0.method308();
                    if (this.field1281 == 65535) {
                        this.field1281 = -1;
                    }
                    int var10 = arg0.method306();
                    this.field1276 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1276[var11] = arg0.method308();
                        if (this.field1276[var11] == 65535) {
                            this.field1276[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1270 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "RBTWCHLG", name = "a", descriptor = "(LHRXSNEYZ;)V")
    public static final void method445(class26 arg0) {
        field1260 = new class31(arg0.method289("npc.dat", null), 8);
        class31 var1 = new class31(arg0.method289("npc.idx", null), 8);
        field1255 = var1.method308();
        field1289 = new int[field1255];
        int var2 = 2;
        for (int var3 = 0; var3 < field1255; var3++) {
            field1289[var3] = var2;
            var2 += var1.method308();
        }
        field1265 = new class58[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1265[var4] = new class58();
        }
    }

    @OriginalMember(owner = "RBTWCHLG", name = "a", descriptor = "(I)V")
    public static final void method446(int arg0) {
        field1261 = null;
        field1289 = null;
        field1265 = null;
        field1260 = null;
        if (arg0 < 1 || arg0 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "RBTWCHLG", name = "a", descriptor = "(B)LRTQSBWRH;")
    public final class59 method447(byte arg0) {
        if (this.field1276 != null) {
            class58 var2 = this.method448(true);
            return var2 == null ? null : var2.method447((byte) -27);
        } else if (this.field1272 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != -27) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field1272.length; var4++) {
                if (!class59.method455(this.field1272[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class59[] var5 = new class59[this.field1272.length];
            for (int var6 = 0; var6 < this.field1272.length; var6++) {
                var5[var6] = class59.method454(false, this.field1272[var6]);
            }
            class59 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class59(var5.length, var5, this.field1249);
            }
            if (this.field1275 != null) {
                for (int var8 = 0; var8 < this.field1275.length; var8++) {
                    var7.method468(this.field1275[var8], this.field1288[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "RBTWCHLG", name = "a", descriptor = "(Z)LRBTWCHLG;")
    public final class58 method448(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (this.field1287 != -1) {
            class2 var3 = class2.field6[this.field1287];
            int var4 = var3.field8;
            int var5 = var3.field9;
            int var6 = var3.field10;
            int var7 = client.field567[var6 - var5];
            var2 = field1277.field478[var4] >> var5 & var7;
        } else if (this.field1281 != -1) {
            var2 = field1277.field478[this.field1281];
        }
        return var2 < 0 || var2 >= this.field1276.length || this.field1276[var2] == -1 ? null : method449(this.field1276[var2]);
    }

    @OriginalMember(owner = "RBTWCHLG", name = "b", descriptor = "(I)LRBTWCHLG;")
    public static final class58 method449(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1265[var1].field1259) {
                return field1265[var1];
            }
        }
        field1254 = (field1254 + 1) % 20;
        class58 var2 = field1265[field1254] = new class58();
        field1260.field901 = field1289[arg0];
        var2.field1259 = arg0;
        var2.method444(field1260, 0);
        return var2;
    }
}
