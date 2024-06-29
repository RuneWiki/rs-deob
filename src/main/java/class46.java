import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PJGEBWSY")
public class class46 {

    @OriginalMember(owner = "client!PJGEBWSY", name = "c", descriptor = "I")
    public int field1370 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "d", descriptor = "I")
    public int field1371 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "e", descriptor = "J")
    public long field1372 = -1L;

    @OriginalMember(owner = "client!PJGEBWSY", name = "f", descriptor = "Z")
    public boolean field1373 = true;

    @OriginalMember(owner = "client!PJGEBWSY", name = "g", descriptor = "I")
    public int field1374 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "j", descriptor = "Z")
    private boolean field1377 = true;

    @OriginalMember(owner = "client!PJGEBWSY", name = "k", descriptor = "I")
    public int field1378 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "m", descriptor = "I")
    public int field1380 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "n", descriptor = "I")
    public int field1381 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "o", descriptor = "I")
    public int field1382 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "q", descriptor = "I")
    private int field1384 = 128;

    @OriginalMember(owner = "client!PJGEBWSY", name = "u", descriptor = "Z")
    public boolean field1388 = false;

    @OriginalMember(owner = "client!PJGEBWSY", name = "w", descriptor = "B")
    public byte field1390 = 1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "y", descriptor = "I")
    public int field1392 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "z", descriptor = "I")
    public int field1393 = 32;

    @OriginalMember(owner = "client!PJGEBWSY", name = "A", descriptor = "I")
    public int field1394 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "C", descriptor = "I")
    public int field1396 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "E", descriptor = "I")
    public int field1398 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "G", descriptor = "Ljava/lang/String;")
    public String field1400 = "null";

    @OriginalMember(owner = "client!PJGEBWSY", name = "J", descriptor = "Z")
    public boolean field1403 = true;

    @OriginalMember(owner = "client!PJGEBWSY", name = "K", descriptor = "I")
    public int field1404 = -1;

    @OriginalMember(owner = "client!PJGEBWSY", name = "L", descriptor = "I")
    private int field1405 = 128;

    @OriginalMember(owner = "client!PJGEBWSY", name = "i", descriptor = "LNQQFCAPC;")
    public static class36 field1376 = new class36(30, 285);

    @OriginalMember(owner = "client!PJGEBWSY", name = "H", descriptor = "Z")
    private static boolean field1401 = true;

    @OriginalMember(owner = "client!PJGEBWSY", name = "b", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!PJGEBWSY", name = "h", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!PJGEBWSY", name = "l", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!PJGEBWSY", name = "r", descriptor = "I")
    private static int field1385;

    @OriginalMember(owner = "client!PJGEBWSY", name = "p", descriptor = "LWBEWPIXO;")
    private static class58 field1383;

    @OriginalMember(owner = "client!PJGEBWSY", name = "x", descriptor = "Lclient;")
    public static client field1391;

    @OriginalMember(owner = "client!PJGEBWSY", name = "I", descriptor = "[B")
    public byte[] field1402;

    @OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "[I")
    private int[] field1368;

    @OriginalMember(owner = "client!PJGEBWSY", name = "s", descriptor = "[I")
    private int[] field1386;

    @OriginalMember(owner = "client!PJGEBWSY", name = "v", descriptor = "[I")
    public int[] field1389;

    @OriginalMember(owner = "client!PJGEBWSY", name = "B", descriptor = "[I")
    private int[] field1395;

    @OriginalMember(owner = "client!PJGEBWSY", name = "D", descriptor = "[I")
    private static int[] field1397;

    @OriginalMember(owner = "client!PJGEBWSY", name = "M", descriptor = "[I")
    private int[] field1406;

    @OriginalMember(owner = "client!PJGEBWSY", name = "t", descriptor = "[LPJGEBWSY;")
    private static class46[] field1387;

    @OriginalMember(owner = "client!PJGEBWSY", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field1399;

    @OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(I)Z")
    public boolean method389(int arg0) {
        if (this.field1389 == null) {
            return true;
        }
        int var2 = -1;
        int var3 = 16 / arg0;
        if (this.field1394 != -1) {
            class55 var4 = class55.field1581[this.field1394];
            int var5 = var4.field1583;
            int var6 = var4.field1584;
            int var7 = var4.field1585;
            int var8 = client.field287[var7 - var6];
            var2 = field1391.field693[var5] >> var6 & var8;
        } else if (this.field1370 != -1) {
            var2 = field1391.field693[this.field1370];
        }
        return var2 >= 0 && var2 < this.field1389.length && this.field1389[var2] != -1;
    }

    @OriginalMember(owner = "client!PJGEBWSY", name = "b", descriptor = "(I)V")
    public static final void method390(int arg0) {
        field1376 = null;
        field1397 = null;
        field1387 = null;
        field1383 = null;
        if (arg0 != 6) {
            field1401 = !field1401;
        }
    }

    @OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(LWBEWPIXO;I)V")
    private final void method391(class58 arg0, int arg1) {
        int var3 = 15 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method515();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method515();
                    this.field1406 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1406[var6] = arg0.method517();
                    }
                } else if (var4 == 2) {
                    this.field1400 = arg0.method522();
                } else if (var4 == 3) {
                    this.field1402 = arg0.method523(37643);
                } else if (var4 == 12) {
                    this.field1390 = arg0.method516();
                } else if (var4 == 13) {
                    this.field1398 = arg0.method517();
                } else if (var4 == 14) {
                    this.field1404 = arg0.method517();
                } else if (var4 == 17) {
                    this.field1404 = arg0.method517();
                    this.field1371 = arg0.method517();
                    this.field1380 = arg0.method517();
                    this.field1382 = arg0.method517();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1399 == null) {
                        this.field1399 = new String[5];
                    }
                    this.field1399[var4 - 30] = arg0.method522();
                    if (this.field1399[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1399[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method515();
                    this.field1395 = new int[var7];
                    this.field1386 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1395[var8] = arg0.method517();
                        this.field1386[var8] = arg0.method517();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method515();
                    this.field1368 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1368[var10] = arg0.method517();
                    }
                } else if (var4 == 90) {
                    this.field1378 = arg0.method517();
                } else if (var4 == 91) {
                    this.field1374 = arg0.method517();
                } else if (var4 == 92) {
                    this.field1392 = arg0.method517();
                } else if (var4 == 93) {
                    this.field1403 = false;
                } else if (var4 == 95) {
                    this.field1381 = arg0.method517();
                } else if (var4 == 97) {
                    this.field1384 = arg0.method517();
                } else if (var4 == 98) {
                    this.field1405 = arg0.method517();
                } else if (var4 == 99) {
                    this.field1388 = true;
                } else if (var4 == 100) {
                    this.field1375 = arg0.method516();
                } else if (var4 == 101) {
                    this.field1379 = arg0.method516() * 5;
                } else if (var4 == 102) {
                    this.field1396 = arg0.method517();
                } else if (var4 == 103) {
                    this.field1393 = arg0.method517();
                } else if (var4 == 106) {
                    this.field1394 = arg0.method517();
                    if (this.field1394 == 65535) {
                        this.field1394 = -1;
                    }
                    this.field1370 = arg0.method517();
                    if (this.field1370 == 65535) {
                        this.field1370 = -1;
                    }
                    int var11 = arg0.method515();
                    this.field1389 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1389[var12] = arg0.method517();
                        if (this.field1389[var12] == 65535) {
                            this.field1389[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field1373 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(Z)LPJGEBWSY;")
    public final class46 method392(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (this.field1394 != -1) {
            class55 var3 = class55.field1581[this.field1394];
            int var4 = var3.field1583;
            int var5 = var3.field1584;
            int var6 = var3.field1585;
            int var7 = client.field287[var6 - var5];
            var2 = field1391.field693[var4] >> var5 & var7;
        } else if (this.field1370 != -1) {
            var2 = field1391.field693[this.field1370];
        }
        return var2 < 0 || var2 >= this.field1389.length || this.field1389[var2] == -1 ? null : method393(this.field1389[var2]);
    }

    @OriginalMember(owner = "client!PJGEBWSY", name = "c", descriptor = "(I)LPJGEBWSY;")
    public static final class46 method393(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1387[var1].field1372) {
                return field1387[var1];
            }
        }
        field1385 = (field1385 + 1) % 20;
        class46 var2 = field1387[field1385] = new class46();
        field1383.field1615 = field1397[arg0];
        var2.field1372 = arg0;
        var2.method391(field1383, 767);
        return var2;
    }

    @OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(LLKPVZAQN;)V")
    public static final void method394(class33 arg0) {
        field1383 = new class58((byte) -115, arg0.method323("npc.dat", null));
        class58 var1 = new class58((byte) -115, arg0.method323("npc.idx", null));
        field1369 = var1.method517();
        field1397 = new int[field1369];
        int var2 = 2;
        for (int var3 = 0; var3 < field1369; var3++) {
            field1397[var3] = var2;
            var2 += var1.method517();
        }
        field1387 = new class46[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1387[var4] = new class46();
        }
    }

    @OriginalMember(owner = "client!PJGEBWSY", name = "d", descriptor = "(I)LFCIDIKVY;")
    public final class19 method395(int arg0) {
        if (this.field1389 != null) {
            class46 var2 = this.method392(true);
            return var2 == null ? null : var2.method395(649);
        } else if (this.field1368 == null) {
            return null;
        } else {
            boolean var3 = false;
            int var4 = 76 / arg0;
            for (int var5 = 0; var5 < this.field1368.length; var5++) {
                if (!class19.method200(this.field1368[var5])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class19[] var6 = new class19[this.field1368.length];
            for (int var7 = 0; var7 < this.field1368.length; var7++) {
                var6[var7] = class19.method199(this.field1368[var7]);
            }
            class19 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class19(var6.length, -23, var6);
            }
            if (this.field1395 != null) {
                for (int var9 = 0; var9 < this.field1395.length; var9++) {
                    var8.method213(this.field1395[var9], this.field1386[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "([IIII)LFCIDIKVY;")
    public final class19 method396(int[] arg0, int arg1, int arg2, int arg3) {
        if (this.field1389 != null) {
            class46 var5 = this.method392(true);
            return var5 == null ? null : var5.method396(arg0, 0, arg2, arg3);
        }
        class19 var6 = (class19) field1376.method334(this.field1372);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1406.length; var8++) {
                if (!class19.method200(this.field1406[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class19[] var9 = new class19[this.field1406.length];
            for (int var10 = 0; var10 < this.field1406.length; var10++) {
                var9[var10] = class19.method199(this.field1406[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class19(var9.length, -23, var9);
            }
            if (this.field1395 != null) {
                for (int var11 = 0; var11 < this.field1395.length; var11++) {
                    var6.method213(this.field1395[var11], this.field1386[var11]);
                }
            }
            var6.method206(8);
            var6.method216(this.field1375 + 64, this.field1379 + 850, -30, -50, -30, true);
            field1376.method335(97, this.field1372, var6);
        }
        class19 var12 = class19.field763;
        if (arg1 != 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.method201(class21.method235(arg2, 12073) & class21.method235(arg3, 12073), var6, 3);
        if (arg2 != -1 && arg3 != -1) {
            var12.method208(arg0, arg2, false, arg3);
        } else if (arg2 != -1) {
            var12.method207(arg2, (byte) -14);
        }
        if (this.field1384 != 128 || this.field1405 != 128) {
            var12.method215(this.field1384, this.field1384, this.field1377, this.field1405);
        }
        var12.method203(8);
        var12.field799 = null;
        var12.field798 = null;
        if (this.field1390 == 1) {
            var12.field800 = true;
        }
        return var12;
    }
}
