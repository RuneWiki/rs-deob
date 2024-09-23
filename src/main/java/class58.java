import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WZSDIPBR")
public class class58 {

    @OriginalMember(owner = "WZSDIPBR", name = "g", descriptor = "I")
    public int field1495 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "h", descriptor = "I")
    public int field1496 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "i", descriptor = "I")
    private int field1497 = 128;

    @OriginalMember(owner = "WZSDIPBR", name = "j", descriptor = "I")
    public int field1498 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "m", descriptor = "I")
    public int field1501 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "n", descriptor = "Z")
    public boolean field1502 = false;

    @OriginalMember(owner = "WZSDIPBR", name = "o", descriptor = "B")
    public byte field1503 = 1;

    @OriginalMember(owner = "WZSDIPBR", name = "p", descriptor = "Z")
    private boolean field1504 = false;

    @OriginalMember(owner = "WZSDIPBR", name = "t", descriptor = "I")
    public int field1508 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "u", descriptor = "I")
    public int field1509 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "v", descriptor = "Z")
    public boolean field1510 = true;

    @OriginalMember(owner = "WZSDIPBR", name = "w", descriptor = "Z")
    public boolean field1511 = true;

    @OriginalMember(owner = "WZSDIPBR", name = "x", descriptor = "I")
    private int field1512 = 128;

    @OriginalMember(owner = "WZSDIPBR", name = "y", descriptor = "I")
    public int field1513 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "A", descriptor = "I")
    public int field1515 = 32;

    @OriginalMember(owner = "WZSDIPBR", name = "B", descriptor = "I")
    public int field1516 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "C", descriptor = "I")
    public int field1517 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "D", descriptor = "I")
    public int field1518 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "E", descriptor = "I")
    public int field1519 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "F", descriptor = "I")
    private int field1520 = 8;

    @OriginalMember(owner = "WZSDIPBR", name = "K", descriptor = "J")
    public long field1525 = -1L;

    @OriginalMember(owner = "WZSDIPBR", name = "M", descriptor = "I")
    public int field1527 = -1;

    @OriginalMember(owner = "WZSDIPBR", name = "c", descriptor = "LZYLCKQCD;")
    public static class71 field1491 = new class71((byte) -89, 30);

    @OriginalMember(owner = "WZSDIPBR", name = "f", descriptor = "I")
    private static int field1494 = 974;

    @OriginalMember(owner = "WZSDIPBR", name = "N", descriptor = "I")
    private static int field1528 = -48545;

    @OriginalMember(owner = "WZSDIPBR", name = "d", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "WZSDIPBR", name = "e", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "WZSDIPBR", name = "l", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "WZSDIPBR", name = "J", descriptor = "I")
    private static int field1524;

    @OriginalMember(owner = "WZSDIPBR", name = "O", descriptor = "LPGNBHFUF;")
    private static class42 field1529;

    @OriginalMember(owner = "WZSDIPBR", name = "a", descriptor = "Lclient;")
    public static client field1489;

    @OriginalMember(owner = "WZSDIPBR", name = "b", descriptor = "Ljava/lang/String;")
    public String field1490;

    @OriginalMember(owner = "WZSDIPBR", name = "z", descriptor = "[B")
    public byte[] field1514;

    @OriginalMember(owner = "WZSDIPBR", name = "k", descriptor = "[I")
    private int[] field1499;

    @OriginalMember(owner = "WZSDIPBR", name = "q", descriptor = "[I")
    private int[] field1505;

    @OriginalMember(owner = "WZSDIPBR", name = "r", descriptor = "[I")
    private int[] field1506;

    @OriginalMember(owner = "WZSDIPBR", name = "s", descriptor = "[I")
    private static int[] field1507;

    @OriginalMember(owner = "WZSDIPBR", name = "H", descriptor = "[I")
    public int[] field1522;

    @OriginalMember(owner = "WZSDIPBR", name = "I", descriptor = "[I")
    private int[] field1523;

    @OriginalMember(owner = "WZSDIPBR", name = "G", descriptor = "[LWZSDIPBR;")
    private static class58[] field1521;

    @OriginalMember(owner = "WZSDIPBR", name = "L", descriptor = "[Ljava/lang/String;")
    public String[] field1526;

    @OriginalMember(owner = "WZSDIPBR", name = "a", descriptor = "(I)LWZSDIPBR;")
    public static final class58 method525(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1521[var1].field1525) {
                return field1521[var1];
            }
        }
        field1524 = (field1524 + 1) % 20;
        class58 var2 = field1521[field1524] = new class58();
        field1529.field1250 = field1507[arg0];
        var2.field1525 = arg0;
        var2.method529(field1529, field1494);
        return var2;
    }

    @OriginalMember(owner = "WZSDIPBR", name = "a", descriptor = "(B)LWZSDIPBR;")
    public final class58 method526(byte arg0) {
        int var2 = -1;
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            field1528 = 339;
        }
        if (this.field1518 != -1) {
            class18 var4 = class18.field798[this.field1518];
            int var5 = var4.field800;
            int var6 = var4.field801;
            int var7 = var4.field802;
            int var8 = client.field225[var7 - var6];
            var2 = field1489.field373[var5] >> var6 & var8;
        } else if (this.field1509 != -1) {
            var2 = field1489.field373[this.field1509];
        }
        return var2 < 0 || var2 >= this.field1522.length || this.field1522[var2] == -1 ? null : method525(this.field1522[var2]);
    }

    @OriginalMember(owner = "WZSDIPBR", name = "a", descriptor = "(I[III)LPOJFANDE;")
    public final class43 method527(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 != 11195) {
            throw new NullPointerException();
        } else if (this.field1522 == null) {
            class43 var6 = (class43) field1491.method599(this.field1525);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field1523.length; var8++) {
                    if (!class43.method461(this.field1523[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class43[] var9 = new class43[this.field1523.length];
                for (int var10 = 0; var10 < this.field1523.length; var10++) {
                    var9[var10] = class43.method460(this.field1523[var10]);
                }
                if (var9.length == 1) {
                    var6 = var9[0];
                } else {
                    var6 = new class43(var9.length, -347, var9);
                }
                if (this.field1499 != null) {
                    for (int var11 = 0; var11 < this.field1499.length; var11++) {
                        var6.method474(this.field1499[var11], this.field1506[var11]);
                    }
                }
                var6.method467(0);
                var6.method477(this.field1500 + 64, this.field1492 + 850, -30, -50, -30, true);
                field1491.method600(var6, this.field1520, this.field1525);
            }
            class43 var12 = class43.field1274;
            var12.method462(this.field1504, var6, class21.method287(arg2, -13619) & class21.method287(arg3, -13619));
            if (arg2 != -1 && arg3 != -1) {
                var12.method469(13742, arg1, arg2, arg3);
            } else if (arg2 != -1) {
                var12.method468(arg2, 19066);
            }
            if (this.field1497 != 128 || this.field1512 != 128) {
                var12.method476(this.field1512, true, this.field1497, this.field1497);
            }
            var12.method464((byte) 3);
            var12.field1310 = null;
            var12.field1309 = null;
            if (this.field1503 == 1) {
                var12.field1311 = true;
            }
            return var12;
        } else {
            class58 var5 = this.method526((byte) 3);
            return var5 == null ? null : var5.method527(11195, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "WZSDIPBR", name = "b", descriptor = "(B)LPOJFANDE;")
    public final class43 method528(byte arg0) {
        if (arg0 != 50) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1522 != null) {
            class58 var3 = this.method526((byte) 3);
            return var3 == null ? null : var3.method528((byte) 50);
        } else if (this.field1505 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field1505.length; var5++) {
                if (!class43.method461(this.field1505[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            class43[] var6 = new class43[this.field1505.length];
            for (int var7 = 0; var7 < this.field1505.length; var7++) {
                var6[var7] = class43.method460(this.field1505[var7]);
            }
            class43 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class43(var6.length, -347, var6);
            }
            if (this.field1499 != null) {
                for (int var9 = 0; var9 < this.field1499.length; var9++) {
                    var8.method474(this.field1499[var9], this.field1506[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "WZSDIPBR", name = "a", descriptor = "(LPGNBHFUF;I)V")
    private final void method529(class42 arg0, int arg1) {
        int var3 = 55 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method420();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method420();
                    this.field1523 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1523[var6] = arg0.method422();
                    }
                } else if (var4 == 2) {
                    this.field1490 = arg0.method427();
                } else if (var4 == 3) {
                    this.field1514 = arg0.method428((byte) 2);
                } else if (var4 == 12) {
                    this.field1503 = arg0.method421();
                } else if (var4 == 13) {
                    this.field1527 = arg0.method422();
                } else if (var4 == 14) {
                    this.field1501 = arg0.method422();
                } else if (var4 == 17) {
                    this.field1501 = arg0.method422();
                    this.field1495 = arg0.method422();
                    this.field1498 = arg0.method422();
                    this.field1516 = arg0.method422();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1526 == null) {
                        this.field1526 = new String[5];
                    }
                    this.field1526[var4 - 30] = arg0.method427();
                    if (this.field1526[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1526[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method420();
                    this.field1499 = new int[var7];
                    this.field1506 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1499[var8] = arg0.method422();
                        this.field1506[var8] = arg0.method422();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method420();
                    this.field1505 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1505[var10] = arg0.method422();
                    }
                } else if (var4 == 90) {
                    this.field1508 = arg0.method422();
                } else if (var4 == 91) {
                    this.field1496 = arg0.method422();
                } else if (var4 == 92) {
                    this.field1513 = arg0.method422();
                } else if (var4 == 93) {
                    this.field1510 = false;
                } else if (var4 == 95) {
                    this.field1517 = arg0.method422();
                } else if (var4 == 97) {
                    this.field1497 = arg0.method422();
                } else if (var4 == 98) {
                    this.field1512 = arg0.method422();
                } else if (var4 == 99) {
                    this.field1502 = true;
                } else if (var4 == 100) {
                    this.field1500 = arg0.method421();
                } else if (var4 == 101) {
                    this.field1492 = arg0.method421() * 5;
                } else if (var4 == 102) {
                    this.field1519 = arg0.method422();
                } else if (var4 == 103) {
                    this.field1515 = arg0.method422();
                } else if (var4 == 106) {
                    this.field1518 = arg0.method422();
                    if (this.field1518 == 65535) {
                        this.field1518 = -1;
                    }
                    this.field1509 = arg0.method422();
                    if (this.field1509 == 65535) {
                        this.field1509 = -1;
                    }
                    int var11 = arg0.method420();
                    this.field1522 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1522[var12] = arg0.method422();
                        if (this.field1522[var12] == 65535) {
                            this.field1522[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field1511 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "WZSDIPBR", name = "b", descriptor = "(I)Z")
    public boolean method530(int arg0) {
        if (arg0 != -39117) {
            field1528 = 263;
        }
        if (this.field1522 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field1518 != -1) {
            class18 var3 = class18.field798[this.field1518];
            int var4 = var3.field800;
            int var5 = var3.field801;
            int var6 = var3.field802;
            int var7 = client.field225[var6 - var5];
            var2 = field1489.field373[var4] >> var5 & var7;
        } else if (this.field1509 != -1) {
            var2 = field1489.field373[this.field1509];
        }
        return var2 >= 0 && var2 < this.field1522.length && this.field1522[var2] != -1;
    }

    @OriginalMember(owner = "WZSDIPBR", name = "a", descriptor = "(LQDHHNYHL;)V")
    public static final void method531(class44 arg0) {
        field1529 = new class42(5, arg0.method488("npc.dat", null));
        class42 var1 = new class42(5, arg0.method488("npc.idx", null));
        field1493 = var1.method422();
        field1507 = new int[field1493];
        int var2 = 2;
        for (int var3 = 0; var3 < field1493; var3++) {
            field1507[var3] = var2;
            var2 += var1.method422();
        }
        field1521 = new class58[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1521[var4] = new class58();
        }
    }

    @OriginalMember(owner = "WZSDIPBR", name = "c", descriptor = "(I)V")
    public static final void method532(int arg0) {
        field1491 = null;
        field1507 = null;
        field1521 = null;
        field1529 = null;
        if (field1528 == arg0) {
            ;
        }
    }
}
