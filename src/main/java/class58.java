import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TLXFHCOO")
public class class58 {

    @OriginalMember(owner = "TLXFHCOO", name = "b", descriptor = "Z")
    private boolean field1451 = true;

    @OriginalMember(owner = "TLXFHCOO", name = "i", descriptor = "I")
    public int field1458 = -1;

    @OriginalMember(owner = "TLXFHCOO", name = "k", descriptor = "Z")
    public boolean field1460 = false;

    @OriginalMember(owner = "TLXFHCOO", name = "l", descriptor = "I")
    public int field1461 = 5;

    @OriginalMember(owner = "TLXFHCOO", name = "m", descriptor = "I")
    public int field1462 = -1;

    @OriginalMember(owner = "TLXFHCOO", name = "n", descriptor = "I")
    public int field1463 = -1;

    @OriginalMember(owner = "TLXFHCOO", name = "o", descriptor = "I")
    public int field1464 = 99;

    @OriginalMember(owner = "TLXFHCOO", name = "p", descriptor = "I")
    public int field1465 = -1;

    @OriginalMember(owner = "TLXFHCOO", name = "q", descriptor = "I")
    public int field1466 = -1;

    @OriginalMember(owner = "TLXFHCOO", name = "r", descriptor = "I")
    public int field1467 = 2;

    @OriginalMember(owner = "TLXFHCOO", name = "a", descriptor = "I")
    private static int field1450 = 8;

    @OriginalMember(owner = "TLXFHCOO", name = "c", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "TLXFHCOO", name = "e", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "TLXFHCOO", name = "s", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "TLXFHCOO", name = "t", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "TLXFHCOO", name = "f", descriptor = "[I")
    public int[] field1455;

    @OriginalMember(owner = "TLXFHCOO", name = "g", descriptor = "[I")
    public int[] field1456;

    @OriginalMember(owner = "TLXFHCOO", name = "h", descriptor = "[I")
    private int[] field1457;

    @OriginalMember(owner = "TLXFHCOO", name = "j", descriptor = "[I")
    public int[] field1459;

    @OriginalMember(owner = "TLXFHCOO", name = "d", descriptor = "[LTLXFHCOO;")
    public static class58[] field1453;

    @OriginalMember(owner = "TLXFHCOO", name = "a", descriptor = "(LFIGUVTWB;Z)V")
    public static void method492(class15 arg0, boolean arg1) {
        class33 var2 = new class33(field1450, arg0.method209("seq.dat", null));
        field1452 = var2.method294();
        if (field1453 == null) {
            field1453 = new class58[field1452];
        }
        for (int var3 = 0; var3 < field1452; var3++) {
            if (field1453[var3] == null) {
                field1453[var3] = new class58();
            }
            field1453[var3].method494(var2, false);
        }
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "TLXFHCOO", name = "a", descriptor = "(IB)I")
    public int method493(int arg0, byte arg1) {
        if (arg1 != 2) {
            this.field1451 = !this.field1451;
        }
        int var3 = this.field1457[arg0];
        if (var3 == 0) {
            class57 var4 = class57.method490(this.field1455[arg0], 14700);
            if (var4 != null) {
                var3 = this.field1457[arg0] = var4.field1442;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "TLXFHCOO", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    public void method494(class33 arg0, boolean arg1) {
        if (arg1) {
            this.field1451 = !this.field1451;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method292();
                if (var3 == 0) {
                    if (this.field1454 == 0) {
                        this.field1454 = 1;
                        this.field1455 = new int[1];
                        this.field1455[0] = -1;
                        this.field1456 = new int[1];
                        this.field1456[0] = -1;
                        this.field1457 = new int[1];
                        this.field1457[0] = -1;
                    }
                    if (this.field1465 == -1) {
                        if (this.field1459 == null) {
                            this.field1465 = 0;
                        } else {
                            this.field1465 = 2;
                        }
                    }
                    if (this.field1466 == -1) {
                        if (this.field1459 != null) {
                            this.field1466 = 2;
                            return;
                        }
                        this.field1466 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1454 = arg0.method292();
                    this.field1455 = new int[this.field1454];
                    this.field1456 = new int[this.field1454];
                    this.field1457 = new int[this.field1454];
                    for (int var4 = 0; var4 < this.field1454; var4++) {
                        this.field1455[var4] = arg0.method294();
                        this.field1456[var4] = arg0.method294();
                        if (this.field1456[var4] == 65535) {
                            this.field1456[var4] = -1;
                        }
                        this.field1457[var4] = arg0.method294();
                    }
                } else if (var3 == 2) {
                    this.field1458 = arg0.method294();
                } else if (var3 == 3) {
                    int var5 = arg0.method292();
                    this.field1459 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1459[var6] = arg0.method292();
                    }
                    this.field1459[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1460 = true;
                } else if (var3 == 5) {
                    this.field1461 = arg0.method292();
                } else if (var3 == 6) {
                    this.field1462 = arg0.method294();
                } else if (var3 == 7) {
                    this.field1463 = arg0.method294();
                } else if (var3 == 8) {
                    this.field1464 = arg0.method292();
                } else if (var3 == 9) {
                    this.field1465 = arg0.method292();
                } else if (var3 == 10) {
                    this.field1466 = arg0.method292();
                } else if (var3 == 11) {
                    this.field1467 = arg0.method292();
                } else if (var3 == 12) {
                    this.field1468 = arg0.method297();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
