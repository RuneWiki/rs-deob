import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VYCKCNXO")
public class class58 {

    @OriginalMember(owner = "VYCKCNXO", name = "g", descriptor = "I")
    public int field1565 = -1;

    @OriginalMember(owner = "VYCKCNXO", name = "i", descriptor = "Z")
    public boolean field1567 = false;

    @OriginalMember(owner = "VYCKCNXO", name = "j", descriptor = "I")
    public int field1568 = 5;

    @OriginalMember(owner = "VYCKCNXO", name = "k", descriptor = "I")
    public int field1569 = -1;

    @OriginalMember(owner = "VYCKCNXO", name = "l", descriptor = "I")
    public int field1570 = -1;

    @OriginalMember(owner = "VYCKCNXO", name = "m", descriptor = "I")
    public int field1571 = 99;

    @OriginalMember(owner = "VYCKCNXO", name = "n", descriptor = "I")
    public int field1572 = -1;

    @OriginalMember(owner = "VYCKCNXO", name = "o", descriptor = "I")
    public int field1573 = -1;

    @OriginalMember(owner = "VYCKCNXO", name = "p", descriptor = "I")
    public int field1574 = 2;

    @OriginalMember(owner = "VYCKCNXO", name = "a", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "VYCKCNXO", name = "c", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "VYCKCNXO", name = "q", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "VYCKCNXO", name = "r", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "VYCKCNXO", name = "d", descriptor = "[I")
    public int[] field1562;

    @OriginalMember(owner = "VYCKCNXO", name = "e", descriptor = "[I")
    public int[] field1563;

    @OriginalMember(owner = "VYCKCNXO", name = "f", descriptor = "[I")
    private int[] field1564;

    @OriginalMember(owner = "VYCKCNXO", name = "h", descriptor = "[I")
    public int[] field1566;

    @OriginalMember(owner = "VYCKCNXO", name = "b", descriptor = "[LVYCKCNXO;")
    public static class58[] field1560;

    @OriginalMember(owner = "VYCKCNXO", name = "a", descriptor = "(LDTIATKJO;I)V")
    public static void method524(class8 arg0, int arg1) {
        class14 var2 = new class14(-527, arg0.method168("seq.dat", null));
        if (arg1 < 1 || arg1 > 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1559 = var2.method204();
        if (field1560 == null) {
            field1560 = new class58[field1559];
        }
        for (int var4 = 0; var4 < field1559; var4++) {
            if (field1560[var4] == null) {
                field1560[var4] = new class58();
            }
            field1560[var4].method526(var2, 0);
        }
    }

    @OriginalMember(owner = "VYCKCNXO", name = "a", descriptor = "(II)I")
    public int method525(int arg0, int arg1) {
        int var3 = this.field1564[arg1];
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            class68 var5 = class68.method581(this.field1562[arg1]);
            if (var5 != null) {
                var3 = this.field1564[arg1] = var5.field1682;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "VYCKCNXO", name = "a", descriptor = "(LGHHPHSRU;I)V")
    public void method526(class14 arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method202();
                if (var4 == 0) {
                    if (this.field1561 == 0) {
                        this.field1561 = 1;
                        this.field1562 = new int[1];
                        this.field1562[0] = -1;
                        this.field1563 = new int[1];
                        this.field1563[0] = -1;
                        this.field1564 = new int[1];
                        this.field1564[0] = -1;
                    }
                    if (this.field1572 == -1) {
                        if (this.field1566 == null) {
                            this.field1572 = 0;
                        } else {
                            this.field1572 = 2;
                        }
                    }
                    if (this.field1573 == -1) {
                        if (this.field1566 != null) {
                            this.field1573 = 2;
                            return;
                        }
                        this.field1573 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1561 = arg0.method202();
                    this.field1562 = new int[this.field1561];
                    this.field1563 = new int[this.field1561];
                    this.field1564 = new int[this.field1561];
                    for (int var5 = 0; var5 < this.field1561; var5++) {
                        this.field1562[var5] = arg0.method204();
                        this.field1563[var5] = arg0.method204();
                        if (this.field1563[var5] == 65535) {
                            this.field1563[var5] = -1;
                        }
                        this.field1564[var5] = arg0.method204();
                    }
                } else if (var4 == 2) {
                    this.field1565 = arg0.method204();
                } else if (var4 == 3) {
                    int var6 = arg0.method202();
                    this.field1566 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1566[var7] = arg0.method202();
                    }
                    this.field1566[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1567 = true;
                } else if (var4 == 5) {
                    this.field1568 = arg0.method202();
                } else if (var4 == 6) {
                    this.field1569 = arg0.method204();
                } else if (var4 == 7) {
                    this.field1570 = arg0.method204();
                } else if (var4 == 8) {
                    this.field1571 = arg0.method202();
                } else if (var4 == 9) {
                    this.field1572 = arg0.method202();
                } else if (var4 == 10) {
                    this.field1573 = arg0.method202();
                } else if (var4 == 11) {
                    this.field1574 = arg0.method202();
                } else if (var4 == 12) {
                    this.field1575 = arg0.method207();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
