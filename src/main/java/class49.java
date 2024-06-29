import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SHKUIFHF")
public class class49 {

    @OriginalMember(owner = "client!SHKUIFHF", name = "b", descriptor = "Z")
    public boolean field1349 = true;

    @OriginalMember(owner = "client!SHKUIFHF", name = "d", descriptor = "I")
    public int field1351 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "h", descriptor = "I")
    public int field1355 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "k", descriptor = "I")
    public int field1358 = 32;

    @OriginalMember(owner = "client!SHKUIFHF", name = "l", descriptor = "Z")
    public boolean field1359 = true;

    @OriginalMember(owner = "client!SHKUIFHF", name = "p", descriptor = "B")
    public byte field1363 = 1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "q", descriptor = "J")
    public long field1364 = -1L;

    @OriginalMember(owner = "client!SHKUIFHF", name = "r", descriptor = "Z")
    private boolean field1365 = true;

    @OriginalMember(owner = "client!SHKUIFHF", name = "s", descriptor = "I")
    public int field1366 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "t", descriptor = "I")
    private int field1367 = 128;

    @OriginalMember(owner = "client!SHKUIFHF", name = "u", descriptor = "Ljava/lang/String;")
    public String field1368 = "null";

    @OriginalMember(owner = "client!SHKUIFHF", name = "w", descriptor = "I")
    public int field1370 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "x", descriptor = "I")
    private int field1371 = 1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "A", descriptor = "I")
    public int field1374 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "B", descriptor = "I")
    public int field1375 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "C", descriptor = "I")
    public int field1376 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "D", descriptor = "I")
    public int field1377 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "H", descriptor = "I")
    public int field1381 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "I", descriptor = "I")
    public int field1382 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "J", descriptor = "I")
    private int field1383 = 128;

    @OriginalMember(owner = "client!SHKUIFHF", name = "K", descriptor = "I")
    public int field1384 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "L", descriptor = "B")
    private byte field1385 = 7;

    @OriginalMember(owner = "client!SHKUIFHF", name = "M", descriptor = "I")
    public int field1386 = -1;

    @OriginalMember(owner = "client!SHKUIFHF", name = "N", descriptor = "Z")
    public boolean field1387 = false;

    @OriginalMember(owner = "client!SHKUIFHF", name = "f", descriptor = "LRYXFUVWJ;")
    public static class48 field1353 = new class48(30, -268);

    @OriginalMember(owner = "client!SHKUIFHF", name = "n", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!SHKUIFHF", name = "v", descriptor = "I")
    private static int field1369;

    @OriginalMember(owner = "client!SHKUIFHF", name = "E", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client!SHKUIFHF", name = "G", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!SHKUIFHF", name = "O", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client!SHKUIFHF", name = "i", descriptor = "LBFQIDHPO;")
    private static class3 field1356;

    @OriginalMember(owner = "client!SHKUIFHF", name = "m", descriptor = "Lclient;")
    public static client field1360;

    @OriginalMember(owner = "client!SHKUIFHF", name = "e", descriptor = "[B")
    public byte[] field1352;

    @OriginalMember(owner = "client!SHKUIFHF", name = "c", descriptor = "[I")
    private int[] field1350;

    @OriginalMember(owner = "client!SHKUIFHF", name = "g", descriptor = "[I")
    private int[] field1354;

    @OriginalMember(owner = "client!SHKUIFHF", name = "j", descriptor = "[I")
    private int[] field1357;

    @OriginalMember(owner = "client!SHKUIFHF", name = "o", descriptor = "[I")
    private static int[] field1362;

    @OriginalMember(owner = "client!SHKUIFHF", name = "z", descriptor = "[I")
    private int[] field1373;

    @OriginalMember(owner = "client!SHKUIFHF", name = "F", descriptor = "[I")
    public int[] field1379;

    @OriginalMember(owner = "client!SHKUIFHF", name = "y", descriptor = "[LSHKUIFHF;")
    private static class49[] field1372;

    @OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field1348;

    @OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(I)Z")
    public boolean method498(int arg0) {
        if (this.field1379 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != 0) {
            this.field1380 = 141;
        }
        if (this.field1355 != -1) {
            class56 var3 = class56.field1489[this.field1355];
            int var4 = var3.field1491;
            int var5 = var3.field1492;
            int var6 = var3.field1493;
            int var7 = client.field307[var6 - var5];
            var2 = field1360.field599[var4] >> var5 & var7;
        } else if (this.field1366 != -1) {
            var2 = field1360.field599[this.field1366];
        }
        return var2 >= 0 && var2 < this.field1379.length && this.field1379[var2] != -1;
    }

    @OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(B)LXBVYIDUH;")
    public final class65 method499(byte arg0) {
        if (this.field1379 != null) {
            class49 var2 = this.method504(0);
            return var2 == null ? null : var2.method499((byte) 44);
        } else if (this.field1373 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != 44) {
                this.field1365 = !this.field1365;
            }
            for (int var4 = 0; var4 < this.field1373.length; var4++) {
                if (!class65.method542(this.field1373[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class65[] var5 = new class65[this.field1373.length];
            for (int var6 = 0; var6 < this.field1373.length; var6++) {
                var5[var6] = class65.method541(this.field1373[var6]);
            }
            class65 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class65(var5, 273, var5.length);
            }
            if (this.field1357 != null) {
                for (int var8 = 0; var8 < this.field1357.length; var8++) {
                    var7.method555(this.field1357[var8], this.field1354[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!SHKUIFHF", name = "b", descriptor = "(I)V")
    public static final void method500(int arg0) {
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1353 = null;
        field1362 = null;
        field1372 = null;
        field1356 = null;
    }

    @OriginalMember(owner = "client!SHKUIFHF", name = "c", descriptor = "(I)LSHKUIFHF;")
    public static final class49 method501(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1372[var1].field1364) {
                return field1372[var1];
            }
        }
        field1369 = (field1369 + 1) % 20;
        class49 var2 = field1372[field1369] = new class49();
        field1356.field50 = field1362[arg0];
        var2.field1364 = arg0;
        var2.method505((byte) -11, field1356);
        return var2;
    }

    @OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(III[I)LXBVYIDUH;")
    public final class65 method502(int arg0, int arg1, int arg2, int[] arg3) {
        if (this.field1379 != null) {
            class49 var5 = this.method504(0);
            return var5 == null ? null : var5.method502(arg0, 1, arg2, arg3);
        }
        class65 var6 = (class65) field1353.method495(this.field1364);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1350.length; var8++) {
                if (!class65.method542(this.field1350[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class65[] var9 = new class65[this.field1350.length];
            for (int var10 = 0; var10 < this.field1350.length; var10++) {
                var9[var10] = class65.method541(this.field1350[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class65(var9, 273, var9.length);
            }
            if (this.field1357 != null) {
                for (int var11 = 0; var11 < this.field1357.length; var11++) {
                    var6.method555(this.field1357[var11], this.field1354[var11]);
                }
            }
            var6.method548((byte) 77);
            var6.method558(this.field1388 + 64, this.field1378 + 850, -30, -50, -30, true);
            field1353.method496(true, var6, this.field1364);
        }
        class65 var12 = class65.field1591;
        if (this.field1371 != arg1) {
            throw new NullPointerException();
        }
        var12.method543(-906, var6, class6.method115(this.field1385, arg2) & class6.method115(this.field1385, arg0));
        if (arg2 != -1 && arg0 != -1) {
            var12.method550(arg0, -648, arg2, arg3);
        } else if (arg2 != -1) {
            var12.method549(true, arg2);
        }
        if (this.field1383 != 128 || this.field1367 != 128) {
            var12.method557(0, this.field1367, this.field1383, this.field1383);
        }
        var12.method545(3);
        var12.field1627 = null;
        var12.field1626 = null;
        if (this.field1363 == 1) {
            var12.field1628 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(LVSQMPWOM;)V")
    public static final void method503(class59 arg0) {
        field1356 = new class3(arg0.method526("npc.dat", null), -990);
        class3 var1 = new class3(arg0.method526("npc.idx", null), -990);
        field1361 = var1.method56();
        field1362 = new int[field1361];
        int var2 = 2;
        for (int var3 = 0; var3 < field1361; var3++) {
            field1362[var3] = var2;
            var2 += var1.method56();
        }
        field1372 = new class49[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1372[var4] = new class49();
        }
    }

    @OriginalMember(owner = "client!SHKUIFHF", name = "d", descriptor = "(I)LSHKUIFHF;")
    public final class49 method504(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1355 != -1) {
            class56 var3 = class56.field1489[this.field1355];
            int var4 = var3.field1491;
            int var5 = var3.field1492;
            int var6 = var3.field1493;
            int var7 = client.field307[var6 - var5];
            var2 = field1360.field599[var4] >> var5 & var7;
        } else if (this.field1366 != -1) {
            var2 = field1360.field599[this.field1366];
        }
        return var2 < 0 || var2 >= this.field1379.length || this.field1379[var2] == -1 ? null : method501(this.field1379[var2]);
    }

    @OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(BLBFQIDHPO;)V")
    private final void method505(byte arg0, class3 arg1) {
        if (arg0 != -11) {
            this.field1380 = 268;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method54();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method54();
                    this.field1350 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1350[var5] = arg1.method56();
                    }
                } else if (var3 == 2) {
                    this.field1368 = arg1.method61();
                } else if (var3 == 3) {
                    this.field1352 = arg1.method62(0);
                } else if (var3 == 12) {
                    this.field1363 = arg1.method55();
                } else if (var3 == 13) {
                    this.field1386 = arg1.method56();
                } else if (var3 == 14) {
                    this.field1375 = arg1.method56();
                } else if (var3 == 17) {
                    this.field1375 = arg1.method56();
                    this.field1377 = arg1.method56();
                    this.field1351 = arg1.method56();
                    this.field1381 = arg1.method56();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1348 == null) {
                        this.field1348 = new String[5];
                    }
                    this.field1348[var3 - 30] = arg1.method61();
                    if (this.field1348[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1348[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method54();
                    this.field1357 = new int[var6];
                    this.field1354 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1357[var7] = arg1.method56();
                        this.field1354[var7] = arg1.method56();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method54();
                    this.field1373 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1373[var9] = arg1.method56();
                    }
                } else if (var3 == 90) {
                    this.field1376 = arg1.method56();
                } else if (var3 == 91) {
                    this.field1384 = arg1.method56();
                } else if (var3 == 92) {
                    this.field1374 = arg1.method56();
                } else if (var3 == 93) {
                    this.field1349 = false;
                } else if (var3 == 95) {
                    this.field1370 = arg1.method56();
                } else if (var3 == 97) {
                    this.field1383 = arg1.method56();
                } else if (var3 == 98) {
                    this.field1367 = arg1.method56();
                } else if (var3 == 99) {
                    this.field1387 = true;
                } else if (var3 == 100) {
                    this.field1388 = arg1.method55();
                } else if (var3 == 101) {
                    this.field1378 = arg1.method55() * 5;
                } else if (var3 == 102) {
                    this.field1382 = arg1.method56();
                } else if (var3 == 103) {
                    this.field1358 = arg1.method56();
                } else if (var3 == 106) {
                    this.field1355 = arg1.method56();
                    if (this.field1355 == 65535) {
                        this.field1355 = -1;
                    }
                    this.field1366 = arg1.method56();
                    if (this.field1366 == 65535) {
                        this.field1366 = -1;
                    }
                    int var10 = arg1.method54();
                    this.field1379 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1379[var11] = arg1.method56();
                        if (this.field1379[var11] == 65535) {
                            this.field1379[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1359 = false;
                }
            }
        }
    }
}
