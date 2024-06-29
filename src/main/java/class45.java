import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PFWIJTDA")
public class class45 {

    @OriginalMember(owner = "client!PFWIJTDA", name = "b", descriptor = "I")
    public int field1283 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "d", descriptor = "J")
    public long field1285 = -1L;

    @OriginalMember(owner = "client!PFWIJTDA", name = "f", descriptor = "I")
    public int field1287 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "h", descriptor = "I")
    public int field1289 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "i", descriptor = "Z")
    public boolean field1290 = true;

    @OriginalMember(owner = "client!PFWIJTDA", name = "j", descriptor = "Z")
    private boolean field1291 = true;

    @OriginalMember(owner = "client!PFWIJTDA", name = "m", descriptor = "Z")
    public boolean field1294 = false;

    @OriginalMember(owner = "client!PFWIJTDA", name = "n", descriptor = "Z")
    public boolean field1295 = true;

    @OriginalMember(owner = "client!PFWIJTDA", name = "o", descriptor = "I")
    public int field1296 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "s", descriptor = "B")
    public byte field1300 = 1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "v", descriptor = "I")
    private int field1303 = 128;

    @OriginalMember(owner = "client!PFWIJTDA", name = "x", descriptor = "I")
    private int field1305 = 766;

    @OriginalMember(owner = "client!PFWIJTDA", name = "z", descriptor = "I")
    public int field1307 = 32;

    @OriginalMember(owner = "client!PFWIJTDA", name = "A", descriptor = "I")
    public int field1308 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "C", descriptor = "I")
    public int field1310 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "D", descriptor = "I")
    public int field1311 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "E", descriptor = "I")
    public int field1312 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "F", descriptor = "I")
    private int field1313 = 128;

    @OriginalMember(owner = "client!PFWIJTDA", name = "H", descriptor = "I")
    public int field1315 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "I", descriptor = "Ljava/lang/String;")
    public String field1316 = "null";

    @OriginalMember(owner = "client!PFWIJTDA", name = "K", descriptor = "B")
    private byte field1318 = -8;

    @OriginalMember(owner = "client!PFWIJTDA", name = "L", descriptor = "I")
    public int field1319 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "M", descriptor = "I")
    public int field1320 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "N", descriptor = "I")
    public int field1321 = -1;

    @OriginalMember(owner = "client!PFWIJTDA", name = "t", descriptor = "I")
    private static int field1301 = -46103;

    @OriginalMember(owner = "client!PFWIJTDA", name = "w", descriptor = "LNVDACYAH;")
    public static class40 field1304 = new class40(false, 30);

    @OriginalMember(owner = "client!PFWIJTDA", name = "c", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!PFWIJTDA", name = "l", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!PFWIJTDA", name = "q", descriptor = "I")
    private static int field1298;

    @OriginalMember(owner = "client!PFWIJTDA", name = "G", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client!PFWIJTDA", name = "r", descriptor = "LMNKDCXXG;")
    private static class37 field1299;

    @OriginalMember(owner = "client!PFWIJTDA", name = "g", descriptor = "Lclient;")
    public static client field1288;

    @OriginalMember(owner = "client!PFWIJTDA", name = "y", descriptor = "[B")
    public byte[] field1306;

    @OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "[I")
    private static int[] field1282;

    @OriginalMember(owner = "client!PFWIJTDA", name = "k", descriptor = "[I")
    public int[] field1292;

    @OriginalMember(owner = "client!PFWIJTDA", name = "p", descriptor = "[I")
    private int[] field1297;

    @OriginalMember(owner = "client!PFWIJTDA", name = "B", descriptor = "[I")
    private int[] field1309;

    @OriginalMember(owner = "client!PFWIJTDA", name = "J", descriptor = "[I")
    private int[] field1317;

    @OriginalMember(owner = "client!PFWIJTDA", name = "O", descriptor = "[I")
    private int[] field1322;

    @OriginalMember(owner = "client!PFWIJTDA", name = "e", descriptor = "[LPFWIJTDA;")
    private static class45[] field1286;

    @OriginalMember(owner = "client!PFWIJTDA", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1302;

    @OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "(I)LIRLTEWJP;")
    public final class26 method436(int arg0) {
        if (arg0 != -38435) {
            this.field1291 = !this.field1291;
        }
        if (this.field1292 != null) {
            class45 var2 = this.method437(505);
            return var2 == null ? null : var2.method436(-38435);
        } else if (this.field1317 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1317.length; var4++) {
                if (!class26.method282(this.field1317[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class26[] var5 = new class26[this.field1317.length];
            for (int var6 = 0; var6 < this.field1317.length; var6++) {
                var5[var6] = class26.method281(this.field1317[var6]);
            }
            class26 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class26(var5.length, 473, var5);
            }
            if (this.field1322 != null) {
                for (int var8 = 0; var8 < this.field1322.length; var8++) {
                    var7.method295(this.field1322[var8], this.field1297[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!PFWIJTDA", name = "b", descriptor = "(I)LPFWIJTDA;")
    public final class45 method437(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            field1301 = 203;
        }
        if (this.field1312 != -1) {
            class39 var3 = class39.field1232[this.field1312];
            int var4 = var3.field1234;
            int var5 = var3.field1235;
            int var6 = var3.field1236;
            int var7 = client.field448[var6 - var5];
            var2 = field1288.field498[var4] >> var5 & var7;
        } else if (this.field1296 != -1) {
            var2 = field1288.field498[this.field1296];
        }
        return var2 < 0 || var2 >= this.field1292.length || this.field1292[var2] == -1 ? null : method442(this.field1292[var2]);
    }

    @OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "(LNXFIIFAD;)V")
    public static final void method438(class41 arg0) {
        field1299 = new class37(arg0.method431("npc.dat", null), -670);
        class37 var1 = new class37(arg0.method431("npc.idx", null), -670);
        field1293 = var1.method388();
        field1282 = new int[field1293];
        int var2 = 2;
        for (int var3 = 0; var3 < field1293; var3++) {
            field1282[var3] = var2;
            var2 += var1.method388();
        }
        field1286 = new class45[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1286[var4] = new class45();
        }
    }

    @OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "(LMNKDCXXG;I)V")
    private final void method439(class37 arg0, int arg1) {
        if (arg1 != 0) {
            this.field1291 = !this.field1291;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method386();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method386();
                    this.field1309 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1309[var5] = arg0.method388();
                    }
                } else if (var3 == 2) {
                    this.field1316 = arg0.method393();
                } else if (var3 == 3) {
                    this.field1306 = arg0.method394(1927);
                } else if (var3 == 12) {
                    this.field1300 = arg0.method387();
                } else if (var3 == 13) {
                    this.field1319 = arg0.method388();
                } else if (var3 == 14) {
                    this.field1289 = arg0.method388();
                } else if (var3 == 17) {
                    this.field1289 = arg0.method388();
                    this.field1283 = arg0.method388();
                    this.field1308 = arg0.method388();
                    this.field1310 = arg0.method388();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1302 == null) {
                        this.field1302 = new String[5];
                    }
                    this.field1302[var3 - 30] = arg0.method393();
                    if (this.field1302[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1302[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method386();
                    this.field1322 = new int[var6];
                    this.field1297 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1322[var7] = arg0.method388();
                        this.field1297[var7] = arg0.method388();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method386();
                    this.field1317 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1317[var9] = arg0.method388();
                    }
                } else if (var3 == 90) {
                    this.field1315 = arg0.method388();
                } else if (var3 == 91) {
                    this.field1321 = arg0.method388();
                } else if (var3 == 92) {
                    this.field1287 = arg0.method388();
                } else if (var3 == 93) {
                    this.field1295 = false;
                } else if (var3 == 95) {
                    this.field1311 = arg0.method388();
                } else if (var3 == 97) {
                    this.field1313 = arg0.method388();
                } else if (var3 == 98) {
                    this.field1303 = arg0.method388();
                } else if (var3 == 99) {
                    this.field1294 = true;
                } else if (var3 == 100) {
                    this.field1284 = arg0.method387();
                } else if (var3 == 101) {
                    this.field1314 = arg0.method387() * 5;
                } else if (var3 == 102) {
                    this.field1320 = arg0.method388();
                } else if (var3 == 103) {
                    this.field1307 = arg0.method388();
                } else if (var3 == 106) {
                    this.field1312 = arg0.method388();
                    if (this.field1312 == 65535) {
                        this.field1312 = -1;
                    }
                    this.field1296 = arg0.method388();
                    if (this.field1296 == 65535) {
                        this.field1296 = -1;
                    }
                    int var10 = arg0.method386();
                    this.field1292 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1292[var11] = arg0.method388();
                        if (this.field1292[var11] == 65535) {
                            this.field1292[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1290 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "([IIII)LIRLTEWJP;")
    public final class26 method440(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 15 / arg3;
        if (this.field1292 != null) {
            class45 var6 = this.method437(505);
            return var6 == null ? null : var6.method440(arg0, arg1, arg2, 670);
        }
        class26 var7 = (class26) field1304.method427(this.field1285);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1309.length; var9++) {
                if (!class26.method282(this.field1309[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class26[] var10 = new class26[this.field1309.length];
            for (int var11 = 0; var11 < this.field1309.length; var11++) {
                var10[var11] = class26.method281(this.field1309[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class26(var10.length, 473, var10);
            }
            if (this.field1322 != null) {
                for (int var12 = 0; var12 < this.field1322.length; var12++) {
                    var7.method295(this.field1322[var12], this.field1297[var12]);
                }
            }
            var7.method288(49427);
            var7.method298(this.field1284 + 64, this.field1314 + 850, -30, -50, -30, true);
            field1304.method428(this.field1285, (byte) 81, var7);
        }
        class26 var13 = class26.field987;
        var13.method283(this.field1305, var7, class17.method211(arg2, 47525) & class17.method211(arg1, 47525));
        if (arg2 != -1 && arg1 != -1) {
            var13.method290(true, arg2, arg0, arg1);
        } else if (arg2 != -1) {
            var13.method289(arg2, true);
        }
        if (this.field1313 != 128 || this.field1303 != 128) {
            var13.method297(this.field1313, this.field1318, this.field1303, this.field1313);
        }
        var13.method285(true);
        var13.field1023 = null;
        var13.field1022 = null;
        if (this.field1300 == 1) {
            var13.field1024 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "client!PFWIJTDA", name = "c", descriptor = "(I)Z")
    public boolean method441(int arg0) {
        int var2 = 64 / arg0;
        if (this.field1292 == null) {
            return true;
        }
        int var3 = -1;
        if (this.field1312 != -1) {
            class39 var4 = class39.field1232[this.field1312];
            int var5 = var4.field1234;
            int var6 = var4.field1235;
            int var7 = var4.field1236;
            int var8 = client.field448[var7 - var6];
            var3 = field1288.field498[var5] >> var6 & var8;
        } else if (this.field1296 != -1) {
            var3 = field1288.field498[this.field1296];
        }
        return var3 >= 0 && var3 < this.field1292.length && this.field1292[var3] != -1;
    }

    @OriginalMember(owner = "client!PFWIJTDA", name = "d", descriptor = "(I)LPFWIJTDA;")
    public static final class45 method442(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1286[var1].field1285) {
                return field1286[var1];
            }
        }
        field1298 = (field1298 + 1) % 20;
        class45 var2 = field1286[field1298] = new class45();
        field1299.field1212 = field1282[arg0];
        var2.field1285 = arg0;
        var2.method439(field1299, 0);
        return var2;
    }

    @OriginalMember(owner = "client!PFWIJTDA", name = "e", descriptor = "(I)V")
    public static final void method443(int arg0) {
        field1304 = null;
        field1282 = null;
        field1286 = null;
        field1299 = null;
        if (arg0 < 7 || arg0 > 7) {
            field1301 = -453;
        }
    }
}
