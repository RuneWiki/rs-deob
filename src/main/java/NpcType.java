import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SLDUQHOR")
public class NpcType {

    @OriginalMember(owner = "client!SLDUQHOR", name = "a", descriptor = "I")
    public int field1424 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "c", descriptor = "Z")
    private boolean field1426 = true;

    @OriginalMember(owner = "client!SLDUQHOR", name = "d", descriptor = "I")
    private int field1427 = 932;

    @OriginalMember(owner = "client!SLDUQHOR", name = "g", descriptor = "I")
    public int field1430 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "h", descriptor = "J")
    public long field1431 = -1L;

    @OriginalMember(owner = "client!SLDUQHOR", name = "j", descriptor = "I")
    private int field1433 = 128;

    @OriginalMember(owner = "client!SLDUQHOR", name = "k", descriptor = "Z")
    public boolean field1434 = true;

    @OriginalMember(owner = "client!SLDUQHOR", name = "l", descriptor = "I")
    private int field1435 = 128;

    @OriginalMember(owner = "client!SLDUQHOR", name = "m", descriptor = "I")
    public int field1436 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "p", descriptor = "Z")
    public boolean field1439 = true;

    @OriginalMember(owner = "client!SLDUQHOR", name = "q", descriptor = "I")
    public int field1440 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "r", descriptor = "I")
    public int field1441 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "s", descriptor = "I")
    public int field1442 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "t", descriptor = "I")
    private int field1443 = 7;

    @OriginalMember(owner = "client!SLDUQHOR", name = "u", descriptor = "I")
    public int field1444 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "v", descriptor = "B")
    public byte field1445 = 1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "w", descriptor = "I")
    public int field1446 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "x", descriptor = "Z")
    public boolean field1447 = false;

    @OriginalMember(owner = "client!SLDUQHOR", name = "y", descriptor = "I")
    public int field1448 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "A", descriptor = "Z")
    private boolean field1450 = false;

    @OriginalMember(owner = "client!SLDUQHOR", name = "B", descriptor = "I")
    public int field1451 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "E", descriptor = "I")
    public int field1454 = 32;

    @OriginalMember(owner = "client!SLDUQHOR", name = "F", descriptor = "Ljava/lang/String;")
    public String field1455 = "null";

    @OriginalMember(owner = "client!SLDUQHOR", name = "H", descriptor = "I")
    public int field1457 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "M", descriptor = "I")
    public int field1462 = -1;

    @OriginalMember(owner = "client!SLDUQHOR", name = "P", descriptor = "Z")
    private boolean field1465 = false;

    @OriginalMember(owner = "client!SLDUQHOR", name = "o", descriptor = "LRHNYLZZL;")
    public static LruCache field1438 = new LruCache(30, -572);

    @OriginalMember(owner = "client!SLDUQHOR", name = "G", descriptor = "B")
    private static byte field1456 = 6;

    @OriginalMember(owner = "client!SLDUQHOR", name = "C", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!SLDUQHOR", name = "L", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!SLDUQHOR", name = "O", descriptor = "I")
    private static int field1464;

    @OriginalMember(owner = "client!SLDUQHOR", name = "Q", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!SLDUQHOR", name = "K", descriptor = "LMFMVIYHT;")
    private static Packet field1460;

    @OriginalMember(owner = "client!SLDUQHOR", name = "i", descriptor = "Lclient;")
    public static client field1432;

    @OriginalMember(owner = "client!SLDUQHOR", name = "N", descriptor = "[B")
    public byte[] field1463;

    @OriginalMember(owner = "client!SLDUQHOR", name = "b", descriptor = "[I")
    public int[] field1425;

    @OriginalMember(owner = "client!SLDUQHOR", name = "e", descriptor = "[I")
    private int[] field1428;

    @OriginalMember(owner = "client!SLDUQHOR", name = "f", descriptor = "[I")
    private int[] field1429;

    @OriginalMember(owner = "client!SLDUQHOR", name = "n", descriptor = "[I")
    private int[] field1437;

    @OriginalMember(owner = "client!SLDUQHOR", name = "D", descriptor = "[I")
    private static int[] field1453;

    @OriginalMember(owner = "client!SLDUQHOR", name = "J", descriptor = "[I")
    private int[] field1459;

    @OriginalMember(owner = "client!SLDUQHOR", name = "I", descriptor = "[LSLDUQHOR;")
    private static NpcType[] field1458;

    @OriginalMember(owner = "client!SLDUQHOR", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1449;

    @OriginalMember(owner = "client!SLDUQHOR", name = "a", descriptor = "(BLMFMVIYHT;)V")
    private final void method470(byte arg0, Packet arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg1.g1();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.g1();
                    this.field1429 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1429[var6] = arg1.g2();
                    }
                } else if (var4 == 2) {
                    this.field1455 = arg1.gjstr();
                } else if (var4 == 3) {
                    this.field1463 = arg1.gjstrraw(621);
                } else if (var4 == 12) {
                    this.field1445 = arg1.g1b();
                } else if (var4 == 13) {
                    this.field1424 = arg1.g2();
                } else if (var4 == 14) {
                    this.field1448 = arg1.g2();
                } else if (var4 == 17) {
                    this.field1448 = arg1.g2();
                    this.field1446 = arg1.g2();
                    this.field1444 = arg1.g2();
                    this.field1436 = arg1.g2();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1449 == null) {
                        this.field1449 = new String[5];
                    }
                    this.field1449[var4 - 30] = arg1.gjstr();
                    if (this.field1449[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1449[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.g1();
                    this.field1437 = new int[var7];
                    this.field1459 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1437[var8] = arg1.g2();
                        this.field1459[var8] = arg1.g2();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.g1();
                    this.field1428 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1428[var10] = arg1.g2();
                    }
                } else if (var4 == 90) {
                    this.field1451 = arg1.g2();
                } else if (var4 == 91) {
                    this.field1430 = arg1.g2();
                } else if (var4 == 92) {
                    this.field1440 = arg1.g2();
                } else if (var4 == 93) {
                    this.field1439 = false;
                } else if (var4 == 95) {
                    this.field1442 = arg1.g2();
                } else if (var4 == 97) {
                    this.field1435 = arg1.g2();
                } else if (var4 == 98) {
                    this.field1433 = arg1.g2();
                } else if (var4 == 99) {
                    this.field1447 = true;
                } else if (var4 == 100) {
                    this.field1466 = arg1.g1b();
                } else if (var4 == 101) {
                    this.field1461 = arg1.g1b() * 5;
                } else if (var4 == 102) {
                    this.field1441 = arg1.g2();
                } else if (var4 == 103) {
                    this.field1454 = arg1.g2();
                } else if (var4 == 106) {
                    this.field1457 = arg1.g2();
                    if (this.field1457 == 65535) {
                        this.field1457 = -1;
                    }
                    this.field1462 = arg1.g2();
                    if (this.field1462 == 65535) {
                        this.field1462 = -1;
                    }
                    int var11 = arg1.g1();
                    this.field1425 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1425[var12] = arg1.g2();
                        if (this.field1425[var12] == 65535) {
                            this.field1425[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field1434 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!SLDUQHOR", name = "a", descriptor = "(Z)V")
    public static final void method471(boolean arg0) {
        field1438 = null;
        field1453 = null;
        field1458 = null;
        field1460 = null;
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }

    @OriginalMember(owner = "client!SLDUQHOR", name = "a", descriptor = "(I)LLZYQDKJV;")
    public final Model method472(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1425 != null) {
            NpcType var3 = this.method476(false);
            return var3 == null ? null : var3.method472(858);
        } else if (this.field1428 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field1428.length; var5++) {
                if (!Model.method360(this.field1428[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            Model[] var6 = new Model[this.field1428.length];
            for (int var7 = 0; var7 < this.field1428.length; var7++) {
                var6[var7] = Model.method359(this.field1428[var7]);
            }
            Model var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new Model(var6.length, var6, (byte) -89);
            }
            if (this.field1437 != null) {
                for (int var9 = 0; var9 < this.field1437.length; var9++) {
                    var8.method373(this.field1437[var9], this.field1459[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!SLDUQHOR", name = "b", descriptor = "(I)Z")
    public boolean method473(int arg0) {
        while (arg0 >= 0) {
            this.field1465 = !this.field1465;
        }
        if (this.field1425 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field1457 != -1) {
            VarbitType var3 = VarbitType.field1760[this.field1457];
            int var4 = var3.field1762;
            int var5 = var3.field1763;
            int var6 = var3.field1764;
            int var7 = client.field510[var6 - var5];
            var2 = field1432.field335[var4] >> var5 & var7;
        } else if (this.field1462 != -1) {
            var2 = field1432.field335[this.field1462];
        }
        if (var2 < 0 || var2 >= this.field1425.length || this.field1425[var2] == -1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!SLDUQHOR", name = "a", descriptor = "(LATJMVOZR;)V")
    public static final void method474(Jagfile arg0) {
        field1460 = new Packet(true, arg0.method2("npc.dat", null));
        Packet var1 = new Packet(true, arg0.method2("npc.idx", null));
        field1452 = var1.g2();
        field1453 = new int[field1452];
        int var2 = 2;
        for (int var3 = 0; var3 < field1452; var3++) {
            field1453[var3] = var2;
            var2 += var1.g2();
        }
        field1458 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1458[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "client!SLDUQHOR", name = "a", descriptor = "(III[I)LLZYQDKJV;")
    public final Model method475(int arg0, int arg1, int arg2, int[] arg3) {
        if (this.field1425 != null) {
            NpcType var5 = this.method476(false);
            return var5 == null ? null : var5.method475(arg0, arg1, 0, arg3);
        }
        Model var6 = (Model) field1438.method458(this.field1431);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1429.length; var8++) {
                if (!Model.method360(this.field1429[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1429.length];
            for (int var10 = 0; var10 < this.field1429.length; var10++) {
                var9[var10] = Model.method359(this.field1429[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new Model(var9.length, var9, (byte) -89);
            }
            if (this.field1437 != null) {
                for (int var11 = 0; var11 < this.field1437.length; var11++) {
                    var6.method373(this.field1437[var11], this.field1459[var11]);
                }
            }
            var6.method366(7);
            var6.method376(this.field1466 + 64, this.field1461 + 850, -30, -50, -30, true);
            field1438.method459(var6, this.field1431, 5);
        }
        Model var12 = Model.field1190;
        if (arg2 != 0) {
            this.field1450 = !this.field1450;
        }
        var12.method361(AnimFrame.method265(this.field1426, arg0) & AnimFrame.method265(this.field1426, arg1), var6, 1244);
        if (arg0 != -1 && arg1 != -1) {
            var12.method368(arg1, 0, arg0, arg3);
        } else if (arg0 != -1) {
            var12.method367(arg0, (byte) 6);
        }
        if (this.field1435 != 128 || this.field1433 != 128) {
            var12.method375(this.field1433, this.field1435, 9, this.field1435);
        }
        var12.method363(this.field1427);
        var12.field1226 = null;
        var12.field1225 = null;
        if (this.field1445 == 1) {
            var12.field1227 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!SLDUQHOR", name = "b", descriptor = "(Z)LSLDUQHOR;")
    public final NpcType method476(boolean arg0) {
        if (arg0) {
            this.field1443 = -212;
        }
        int var2 = -1;
        if (this.field1457 != -1) {
            VarbitType var3 = VarbitType.field1760[this.field1457];
            int var4 = var3.field1762;
            int var5 = var3.field1763;
            int var6 = var3.field1764;
            int var7 = client.field510[var6 - var5];
            var2 = field1432.field335[var4] >> var5 & var7;
        } else if (this.field1462 != -1) {
            var2 = field1432.field335[this.field1462];
        }
        return var2 < 0 || var2 >= this.field1425.length || this.field1425[var2] == -1 ? null : method477(this.field1425[var2]);
    }

    @OriginalMember(owner = "client!SLDUQHOR", name = "c", descriptor = "(I)LSLDUQHOR;")
    public static final NpcType method477(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1458[var1].field1431) {
                return field1458[var1];
            }
        }
        field1464 = (field1464 + 1) % 20;
        NpcType var2 = field1458[field1464] = new NpcType();
        field1460.pos = field1453[arg0];
        var2.field1431 = arg0;
        var2.method470(field1456, field1460);
        return var2;
    }
}
