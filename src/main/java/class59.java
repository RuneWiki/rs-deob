import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WLHKAARP")
public class class59 {

    @OriginalMember(owner = "WLHKAARP", name = "a", descriptor = "Z")
    private boolean field1536 = false;

    @OriginalMember(owner = "WLHKAARP", name = "h", descriptor = "I")
    public int field1543 = -1;

    @OriginalMember(owner = "WLHKAARP", name = "j", descriptor = "Z")
    public boolean field1545 = false;

    @OriginalMember(owner = "WLHKAARP", name = "k", descriptor = "I")
    public int field1546 = 5;

    @OriginalMember(owner = "WLHKAARP", name = "l", descriptor = "I")
    public int field1547 = -1;

    @OriginalMember(owner = "WLHKAARP", name = "m", descriptor = "I")
    public int field1548 = -1;

    @OriginalMember(owner = "WLHKAARP", name = "n", descriptor = "I")
    public int field1549 = 99;

    @OriginalMember(owner = "WLHKAARP", name = "o", descriptor = "I")
    public int field1550 = -1;

    @OriginalMember(owner = "WLHKAARP", name = "p", descriptor = "I")
    public int field1551 = -1;

    @OriginalMember(owner = "WLHKAARP", name = "q", descriptor = "I")
    public int field1552 = 2;

    @OriginalMember(owner = "WLHKAARP", name = "b", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "WLHKAARP", name = "d", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "WLHKAARP", name = "r", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "WLHKAARP", name = "s", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "WLHKAARP", name = "e", descriptor = "[I")
    public int[] field1540;

    @OriginalMember(owner = "WLHKAARP", name = "f", descriptor = "[I")
    public int[] field1541;

    @OriginalMember(owner = "WLHKAARP", name = "g", descriptor = "[I")
    private int[] field1542;

    @OriginalMember(owner = "WLHKAARP", name = "i", descriptor = "[I")
    public int[] field1544;

    @OriginalMember(owner = "WLHKAARP", name = "c", descriptor = "[LWLHKAARP;")
    public static class59[] field1538;

    @OriginalMember(owner = "WLHKAARP", name = "a", descriptor = "(ZLXRWUKRPO;)V")
    public static void method548(boolean arg0, class65 arg1) {
        if (arg0) {
            return;
        }
        class21 var2 = new class21(arg1.method581("seq.dat", null), -49015);
        field1537 = var2.method246();
        if (field1538 == null) {
            field1538 = new class59[field1537];
        }
        for (int var3 = 0; var3 < field1537; var3++) {
            if (field1538[var3] == null) {
                field1538[var3] = new class59();
            }
            field1538[var3].method550((byte) 8, var2);
        }
    }

    @OriginalMember(owner = "WLHKAARP", name = "a", descriptor = "(II)I")
    public int method549(int arg0, int arg1) {
        if (arg1 != 0) {
            return 2;
        }
        int var3 = this.field1542[arg0];
        if (var3 == 0) {
            class51 var4 = class51.method488((byte) 5, this.field1540[arg0]);
            if (var4 != null) {
                var3 = this.field1542[arg0] = var4.field1293;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "WLHKAARP", name = "a", descriptor = "(BLGLMIQHJI;)V")
    public void method550(byte arg0, class21 arg1) {
        if (arg0 != 8) {
            this.field1536 = !this.field1536;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method244();
                if (var3 == 0) {
                    if (this.field1539 == 0) {
                        this.field1539 = 1;
                        this.field1540 = new int[1];
                        this.field1540[0] = -1;
                        this.field1541 = new int[1];
                        this.field1541[0] = -1;
                        this.field1542 = new int[1];
                        this.field1542[0] = -1;
                    }
                    if (this.field1550 == -1) {
                        if (this.field1544 == null) {
                            this.field1550 = 0;
                        } else {
                            this.field1550 = 2;
                        }
                    }
                    if (this.field1551 == -1) {
                        if (this.field1544 != null) {
                            this.field1551 = 2;
                            return;
                        }
                        this.field1551 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1539 = arg1.method244();
                    this.field1540 = new int[this.field1539];
                    this.field1541 = new int[this.field1539];
                    this.field1542 = new int[this.field1539];
                    for (int var4 = 0; var4 < this.field1539; var4++) {
                        this.field1540[var4] = arg1.method246();
                        this.field1541[var4] = arg1.method246();
                        if (this.field1541[var4] == 65535) {
                            this.field1541[var4] = -1;
                        }
                        this.field1542[var4] = arg1.method246();
                    }
                } else if (var3 == 2) {
                    this.field1543 = arg1.method246();
                } else if (var3 == 3) {
                    int var5 = arg1.method244();
                    this.field1544 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1544[var6] = arg1.method244();
                    }
                    this.field1544[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1545 = true;
                } else if (var3 == 5) {
                    this.field1546 = arg1.method244();
                } else if (var3 == 6) {
                    this.field1547 = arg1.method246();
                } else if (var3 == 7) {
                    this.field1548 = arg1.method246();
                } else if (var3 == 8) {
                    this.field1549 = arg1.method244();
                } else if (var3 == 9) {
                    this.field1550 = arg1.method244();
                } else if (var3 == 10) {
                    this.field1551 = arg1.method244();
                } else if (var3 == 11) {
                    this.field1552 = arg1.method244();
                } else if (var3 == 12) {
                    this.field1553 = arg1.method249();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
