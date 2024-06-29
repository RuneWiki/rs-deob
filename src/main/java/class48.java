import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QYNFXHXW")
public class class48 {

    @OriginalMember(owner = "client!QYNFXHXW", name = "d", descriptor = "I")
    public int field1329 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "e", descriptor = "I")
    public int field1330 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "g", descriptor = "Z")
    public boolean field1332 = true;

    @OriginalMember(owner = "client!QYNFXHXW", name = "h", descriptor = "I")
    public int field1333 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "j", descriptor = "I")
    private int field1335 = 128;

    @OriginalMember(owner = "client!QYNFXHXW", name = "q", descriptor = "I")
    public int field1342 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "s", descriptor = "Z")
    public boolean field1344 = true;

    @OriginalMember(owner = "client!QYNFXHXW", name = "t", descriptor = "I")
    public int field1345 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "v", descriptor = "B")
    public byte field1347 = 1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "w", descriptor = "I")
    private int field1348 = 1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "x", descriptor = "I")
    public int field1349 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "y", descriptor = "J")
    public long field1350 = -1L;

    @OriginalMember(owner = "client!QYNFXHXW", name = "z", descriptor = "I")
    public int field1351 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "A", descriptor = "I")
    public int field1352 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "B", descriptor = "I")
    public int field1353 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "D", descriptor = "Ljava/lang/String;")
    public String field1355 = "null";

    @OriginalMember(owner = "client!QYNFXHXW", name = "F", descriptor = "I")
    public int field1357 = 32;

    @OriginalMember(owner = "client!QYNFXHXW", name = "G", descriptor = "I")
    public int field1358 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "H", descriptor = "I")
    public int field1359 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "I", descriptor = "I")
    private int field1360 = 128;

    @OriginalMember(owner = "client!QYNFXHXW", name = "J", descriptor = "I")
    public int field1361 = -1;

    @OriginalMember(owner = "client!QYNFXHXW", name = "K", descriptor = "Z")
    public boolean field1362 = false;

    @OriginalMember(owner = "client!QYNFXHXW", name = "l", descriptor = "LUNPPHFRC;")
    public static class60 field1337 = new class60(true, 30);

    @OriginalMember(owner = "client!QYNFXHXW", name = "c", descriptor = "I")
    private static int field1328;

    @OriginalMember(owner = "client!QYNFXHXW", name = "f", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!QYNFXHXW", name = "p", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!QYNFXHXW", name = "r", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!QYNFXHXW", name = "C", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!QYNFXHXW", name = "u", descriptor = "LEYMNCFMK;")
    private static class18 field1346;

    @OriginalMember(owner = "client!QYNFXHXW", name = "b", descriptor = "Lclient;")
    public static client field1327;

    @OriginalMember(owner = "client!QYNFXHXW", name = "E", descriptor = "[B")
    public byte[] field1356;

    @OriginalMember(owner = "client!QYNFXHXW", name = "i", descriptor = "[I")
    private int[] field1334;

    @OriginalMember(owner = "client!QYNFXHXW", name = "k", descriptor = "[I")
    private int[] field1336;

    @OriginalMember(owner = "client!QYNFXHXW", name = "m", descriptor = "[I")
    private int[] field1338;

    @OriginalMember(owner = "client!QYNFXHXW", name = "o", descriptor = "[I")
    private static int[] field1340;

    @OriginalMember(owner = "client!QYNFXHXW", name = "L", descriptor = "[I")
    public int[] field1363;

    @OriginalMember(owner = "client!QYNFXHXW", name = "M", descriptor = "[I")
    private int[] field1364;

    @OriginalMember(owner = "client!QYNFXHXW", name = "n", descriptor = "[LQYNFXHXW;")
    private static class48[] field1339;

    @OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field1326;

    @OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "(I)LQYNFXHXW;")
    public final class48 method508(int arg0) {
        int var2 = 25 / arg0;
        int var3 = -1;
        if (this.field1349 != -1) {
            class9 var4 = class9.field134[this.field1349];
            int var5 = var4.field136;
            int var6 = var4.field137;
            int var7 = var4.field138;
            int var8 = client.field156[var7 - var6];
            var3 = field1327.field344[var5] >> var6 & var8;
        } else if (this.field1342 != -1) {
            var3 = field1327.field344[this.field1342];
        }
        return var3 < 0 || var3 >= this.field1363.length || this.field1363[var3] == -1 ? null : method512(this.field1363[var3]);
    }

    @OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "(LHBJEXSJX;)V")
    public static final void method509(class24 arg0) {
        field1346 = new class18(arg0.method348("npc.dat", null), 0);
        class18 var1 = new class18(arg0.method348("npc.idx", null), 0);
        field1341 = var1.method241();
        field1340 = new int[field1341];
        int var2 = 2;
        for (int var3 = 0; var3 < field1341; var3++) {
            field1340[var3] = var2;
            var2 += var1.method241();
        }
        field1339 = new class48[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1339[var4] = new class48();
        }
    }

    @OriginalMember(owner = "client!QYNFXHXW", name = "b", descriptor = "(I)V")
    public static final void method510(int arg0) {
        field1337 = null;
        if (arg0 < 7 || arg0 > 7) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1340 = null;
        field1339 = null;
        field1346 = null;
    }

    @OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "(BLEYMNCFMK;)V")
    private final void method511(byte arg0, class18 arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method239();
                    this.field1334 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1334[var5] = arg1.method241();
                    }
                } else if (var3 == 2) {
                    this.field1355 = arg1.method246();
                } else if (var3 == 3) {
                    this.field1356 = arg1.method247((byte) 4);
                } else if (var3 == 12) {
                    this.field1347 = arg1.method240();
                } else if (var3 == 13) {
                    this.field1353 = arg1.method241();
                } else if (var3 == 14) {
                    this.field1351 = arg1.method241();
                } else if (var3 == 17) {
                    this.field1351 = arg1.method241();
                    this.field1358 = arg1.method241();
                    this.field1359 = arg1.method241();
                    this.field1361 = arg1.method241();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1326 == null) {
                        this.field1326 = new String[5];
                    }
                    this.field1326[var3 - 30] = arg1.method246();
                    if (this.field1326[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1326[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method239();
                    this.field1336 = new int[var6];
                    this.field1364 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1336[var7] = arg1.method241();
                        this.field1364[var7] = arg1.method241();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method239();
                    this.field1338 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1338[var9] = arg1.method241();
                    }
                } else if (var3 == 90) {
                    this.field1333 = arg1.method241();
                } else if (var3 == 91) {
                    this.field1345 = arg1.method241();
                } else if (var3 == 92) {
                    this.field1329 = arg1.method241();
                } else if (var3 == 93) {
                    this.field1332 = false;
                } else if (var3 == 95) {
                    this.field1330 = arg1.method241();
                } else if (var3 == 97) {
                    this.field1335 = arg1.method241();
                } else if (var3 == 98) {
                    this.field1360 = arg1.method241();
                } else if (var3 == 99) {
                    this.field1362 = true;
                } else if (var3 == 100) {
                    this.field1354 = arg1.method240();
                } else if (var3 == 101) {
                    this.field1343 = arg1.method240() * 5;
                } else if (var3 == 102) {
                    this.field1352 = arg1.method241();
                } else if (var3 == 103) {
                    this.field1357 = arg1.method241();
                } else if (var3 == 106) {
                    this.field1349 = arg1.method241();
                    if (this.field1349 == 65535) {
                        this.field1349 = -1;
                    }
                    this.field1342 = arg1.method241();
                    if (this.field1342 == 65535) {
                        this.field1342 = -1;
                    }
                    int var10 = arg1.method239();
                    this.field1363 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1363[var11] = arg1.method241();
                        if (this.field1363[var11] == 65535) {
                            this.field1363[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1344 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!QYNFXHXW", name = "c", descriptor = "(I)LQYNFXHXW;")
    public static final class48 method512(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1339[var1].field1350) {
                return field1339[var1];
            }
        }
        field1328 = (field1328 + 1) % 20;
        class48 var2 = field1339[field1328] = new class48();
        field1346.field794 = field1340[arg0];
        var2.field1350 = arg0;
        var2.method511((byte) 5, field1346);
        return var2;
    }

    @OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "([IIII)LOJGAHFXC;")
    public final class41 method513(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 34 / arg1;
        if (this.field1363 != null) {
            class48 var6 = this.method508(863);
            return var6 == null ? null : var6.method513(arg0, 653, arg2, arg3);
        }
        class41 var7 = (class41) field1337.method531(this.field1350);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1334.length; var9++) {
                if (!class41.method414(this.field1334[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class41[] var10 = new class41[this.field1334.length];
            for (int var11 = 0; var11 < this.field1334.length; var11++) {
                var10[var11] = class41.method413(this.field1334[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class41(var10.length, (byte) 112, var10);
            }
            if (this.field1336 != null) {
                for (int var12 = 0; var12 < this.field1336.length; var12++) {
                    var7.method427(this.field1336[var12], this.field1364[var12]);
                }
            }
            var7.method420(this.field1331);
            var7.method430(this.field1354 + 64, this.field1343 + 850, -30, -50, -30, true);
            field1337.method532(false, this.field1350, var7);
        }
        class41 var13 = class41.field1185;
        var13.method415(class37.method395(arg2, (byte) 1) & class37.method395(arg3, (byte) 1), var7, (byte) 11);
        if (arg2 != -1 && arg3 != -1) {
            var13.method422(arg2, arg0, arg3, 29445);
        } else if (arg2 != -1) {
            var13.method421(771, arg2);
        }
        if (this.field1335 != 128 || this.field1360 != 128) {
            var13.method429(this.field1335, this.field1348, this.field1360, this.field1335);
        }
        var13.method417(true);
        var13.field1221 = null;
        var13.field1220 = null;
        if (this.field1347 == 1) {
            var13.field1222 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "client!QYNFXHXW", name = "d", descriptor = "(I)LOJGAHFXC;")
    public final class41 method514(int arg0) {
        label71: while (true) {
            if (arg0 >= 0) {
                int var9 = 1;
                while (true) {
                    if (var9 <= 0) {
                        continue label71;
                    }
                    var9++;
                }
            }
            if (this.field1363 != null) {
                class48 var2 = this.method508(863);
                if (var2 == null) {
                    return null;
                }
                return var2.method514(-5);
            }
            if (this.field1338 == null) {
                return null;
            }
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1338.length; var4++) {
                if (!class41.method414(this.field1338[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class41[] var5 = new class41[this.field1338.length];
            for (int var6 = 0; var6 < this.field1338.length; var6++) {
                var5[var6] = class41.method413(this.field1338[var6]);
            }
            class41 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class41(var5.length, (byte) 112, var5);
            }
            if (this.field1336 != null) {
                for (int var8 = 0; var8 < this.field1336.length; var8++) {
                    var7.method427(this.field1336[var8], this.field1364[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!QYNFXHXW", name = "e", descriptor = "(I)Z")
    public boolean method515(int arg0) {
        int var2 = 27 / arg0;
        if (this.field1363 == null) {
            return true;
        }
        int var3 = -1;
        if (this.field1349 != -1) {
            class9 var4 = class9.field134[this.field1349];
            int var5 = var4.field136;
            int var6 = var4.field137;
            int var7 = var4.field138;
            int var8 = client.field156[var7 - var6];
            var3 = field1327.field344[var5] >> var6 & var8;
        } else if (this.field1342 != -1) {
            var3 = field1327.field344[this.field1342];
        }
        return var3 >= 0 && var3 < this.field1363.length && this.field1363[var3] != -1;
    }
}
