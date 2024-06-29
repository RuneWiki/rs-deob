import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VYXELYSX")
public class class55 {

    @OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "I")
    private int field1442 = 655;

    @OriginalMember(owner = "client!VYXELYSX", name = "h", descriptor = "I")
    public int field1449 = -1;

    @OriginalMember(owner = "client!VYXELYSX", name = "j", descriptor = "Z")
    public boolean field1451 = false;

    @OriginalMember(owner = "client!VYXELYSX", name = "k", descriptor = "I")
    public int field1452 = 5;

    @OriginalMember(owner = "client!VYXELYSX", name = "l", descriptor = "I")
    public int field1453 = -1;

    @OriginalMember(owner = "client!VYXELYSX", name = "m", descriptor = "I")
    public int field1454 = -1;

    @OriginalMember(owner = "client!VYXELYSX", name = "n", descriptor = "I")
    public int field1455 = 99;

    @OriginalMember(owner = "client!VYXELYSX", name = "o", descriptor = "I")
    public int field1456 = -1;

    @OriginalMember(owner = "client!VYXELYSX", name = "p", descriptor = "I")
    public int field1457 = -1;

    @OriginalMember(owner = "client!VYXELYSX", name = "q", descriptor = "I")
    public int field1458 = 2;

    @OriginalMember(owner = "client!VYXELYSX", name = "b", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!VYXELYSX", name = "d", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!VYXELYSX", name = "r", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!VYXELYSX", name = "s", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!VYXELYSX", name = "e", descriptor = "[I")
    public int[] field1446;

    @OriginalMember(owner = "client!VYXELYSX", name = "f", descriptor = "[I")
    public int[] field1447;

    @OriginalMember(owner = "client!VYXELYSX", name = "g", descriptor = "[I")
    private int[] field1448;

    @OriginalMember(owner = "client!VYXELYSX", name = "i", descriptor = "[I")
    public int[] field1450;

    @OriginalMember(owner = "client!VYXELYSX", name = "c", descriptor = "[LVYXELYSX;")
    public static class55[] field1444;

    @OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "(ILMAARFNGV;)V")
    public static void method458(int arg0, class29 arg1) {
        class14 var2 = new class14(arg1.method332("seq.dat", null), true);
        if (arg0 != 0) {
            return;
        }
        field1443 = var2.method219();
        if (field1444 == null) {
            field1444 = new class55[field1443];
        }
        for (int var3 = 0; var3 < field1443; var3++) {
            if (field1444[var3] == null) {
                field1444[var3] = new class55();
            }
            field1444[var3].method460(1016, var2);
        }
    }

    @OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "(IZ)I")
    public int method459(int arg0, boolean arg1) {
        if (arg1) {
            return this.field1442;
        }
        int var3 = this.field1448[arg0];
        if (var3 == 0) {
            class33 var4 = class33.method336(this.field1446[arg0]);
            if (var4 != null) {
                var3 = this.field1448[arg0] = var4.field1015;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "(ILEMWAMCXW;)V")
    public void method460(int arg0, class14 arg1) {
        if (arg0 != 1016) {
            this.field1442 = -111;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method217();
                if (var3 == 0) {
                    if (this.field1445 == 0) {
                        this.field1445 = 1;
                        this.field1446 = new int[1];
                        this.field1446[0] = -1;
                        this.field1447 = new int[1];
                        this.field1447[0] = -1;
                        this.field1448 = new int[1];
                        this.field1448[0] = -1;
                    }
                    if (this.field1456 == -1) {
                        if (this.field1450 == null) {
                            this.field1456 = 0;
                        } else {
                            this.field1456 = 2;
                        }
                    }
                    if (this.field1457 == -1) {
                        if (this.field1450 != null) {
                            this.field1457 = 2;
                            return;
                        }
                        this.field1457 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1445 = arg1.method217();
                    this.field1446 = new int[this.field1445];
                    this.field1447 = new int[this.field1445];
                    this.field1448 = new int[this.field1445];
                    for (int var4 = 0; var4 < this.field1445; var4++) {
                        this.field1446[var4] = arg1.method219();
                        this.field1447[var4] = arg1.method219();
                        if (this.field1447[var4] == 65535) {
                            this.field1447[var4] = -1;
                        }
                        this.field1448[var4] = arg1.method219();
                    }
                } else if (var3 == 2) {
                    this.field1449 = arg1.method219();
                } else if (var3 == 3) {
                    int var5 = arg1.method217();
                    this.field1450 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1450[var6] = arg1.method217();
                    }
                    this.field1450[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1451 = true;
                } else if (var3 == 5) {
                    this.field1452 = arg1.method217();
                } else if (var3 == 6) {
                    this.field1453 = arg1.method219();
                } else if (var3 == 7) {
                    this.field1454 = arg1.method219();
                } else if (var3 == 8) {
                    this.field1455 = arg1.method217();
                } else if (var3 == 9) {
                    this.field1456 = arg1.method217();
                } else if (var3 == 10) {
                    this.field1457 = arg1.method217();
                } else if (var3 == 11) {
                    this.field1458 = arg1.method217();
                } else if (var3 == 12) {
                    this.field1459 = arg1.method222();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
