import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XKEHWKFH")
public class class66 {

    @OriginalMember(owner = "XKEHWKFH", name = "a", descriptor = "I")
    private int field1605 = 16191;

    @OriginalMember(owner = "XKEHWKFH", name = "i", descriptor = "I")
    public int field1613 = -1;

    @OriginalMember(owner = "XKEHWKFH", name = "k", descriptor = "Z")
    public boolean field1615 = false;

    @OriginalMember(owner = "XKEHWKFH", name = "l", descriptor = "I")
    public int field1616 = 5;

    @OriginalMember(owner = "XKEHWKFH", name = "m", descriptor = "I")
    public int field1617 = -1;

    @OriginalMember(owner = "XKEHWKFH", name = "n", descriptor = "I")
    public int field1618 = -1;

    @OriginalMember(owner = "XKEHWKFH", name = "o", descriptor = "I")
    public int field1619 = 99;

    @OriginalMember(owner = "XKEHWKFH", name = "p", descriptor = "I")
    public int field1620 = -1;

    @OriginalMember(owner = "XKEHWKFH", name = "q", descriptor = "I")
    public int field1621 = -1;

    @OriginalMember(owner = "XKEHWKFH", name = "r", descriptor = "I")
    public int field1622 = 2;

    @OriginalMember(owner = "XKEHWKFH", name = "b", descriptor = "I")
    private static int field1606;

    @OriginalMember(owner = "XKEHWKFH", name = "c", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "XKEHWKFH", name = "e", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "XKEHWKFH", name = "s", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "XKEHWKFH", name = "t", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "XKEHWKFH", name = "f", descriptor = "[I")
    public int[] field1610;

    @OriginalMember(owner = "XKEHWKFH", name = "g", descriptor = "[I")
    public int[] field1611;

    @OriginalMember(owner = "XKEHWKFH", name = "h", descriptor = "[I")
    private int[] field1612;

    @OriginalMember(owner = "XKEHWKFH", name = "j", descriptor = "[I")
    public int[] field1614;

    @OriginalMember(owner = "XKEHWKFH", name = "d", descriptor = "[LXKEHWKFH;")
    public static class66[] field1608;

    @OriginalMember(owner = "XKEHWKFH", name = "a", descriptor = "(ILSPZBTZXL;)V")
    public static void method565(int arg0, class51 arg1) {
        class34 var2 = new class34(arg1.method515("seq.dat", null), field1606);
        field1607 = var2.method404();
        if (arg0 <= 0) {
            field1606 = 271;
        }
        if (field1608 == null) {
            field1608 = new class66[field1607];
        }
        for (int var3 = 0; var3 < field1607; var3++) {
            if (field1608[var3] == null) {
                field1608[var3] = new class66();
            }
            field1608[var3].method567(var2, 16191);
        }
    }

    @OriginalMember(owner = "XKEHWKFH", name = "a", descriptor = "(IB)I")
    public int method566(int arg0, byte arg1) {
        int var3 = this.field1612[arg0];
        if (arg1 == 2) {
            boolean var4 = false;
        } else {
            field1606 = 64;
        }
        if (var3 == 0) {
            class56 var5 = class56.method535(this.field1610[arg0], (byte) 71);
            if (var5 != null) {
                var3 = this.field1612[arg0] = var5.field1373;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "XKEHWKFH", name = "a", descriptor = "(LLDILQFVA;I)V")
    public void method567(class34 arg0, int arg1) {
        if (this.field1605 != arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method402();
                if (var3 == 0) {
                    if (this.field1609 == 0) {
                        this.field1609 = 1;
                        this.field1610 = new int[1];
                        this.field1610[0] = -1;
                        this.field1611 = new int[1];
                        this.field1611[0] = -1;
                        this.field1612 = new int[1];
                        this.field1612[0] = -1;
                    }
                    if (this.field1620 == -1) {
                        if (this.field1614 == null) {
                            this.field1620 = 0;
                        } else {
                            this.field1620 = 2;
                        }
                    }
                    if (this.field1621 == -1) {
                        if (this.field1614 != null) {
                            this.field1621 = 2;
                            return;
                        }
                        this.field1621 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1609 = arg0.method402();
                    this.field1610 = new int[this.field1609];
                    this.field1611 = new int[this.field1609];
                    this.field1612 = new int[this.field1609];
                    for (int var4 = 0; var4 < this.field1609; var4++) {
                        this.field1610[var4] = arg0.method404();
                        this.field1611[var4] = arg0.method404();
                        if (this.field1611[var4] == 65535) {
                            this.field1611[var4] = -1;
                        }
                        this.field1612[var4] = arg0.method404();
                    }
                } else if (var3 == 2) {
                    this.field1613 = arg0.method404();
                } else if (var3 == 3) {
                    int var5 = arg0.method402();
                    this.field1614 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1614[var6] = arg0.method402();
                    }
                    this.field1614[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1615 = true;
                } else if (var3 == 5) {
                    this.field1616 = arg0.method402();
                } else if (var3 == 6) {
                    this.field1617 = arg0.method404();
                } else if (var3 == 7) {
                    this.field1618 = arg0.method404();
                } else if (var3 == 8) {
                    this.field1619 = arg0.method402();
                } else if (var3 == 9) {
                    this.field1620 = arg0.method402();
                } else if (var3 == 10) {
                    this.field1621 = arg0.method402();
                } else if (var3 == 11) {
                    this.field1622 = arg0.method402();
                } else if (var3 == 12) {
                    this.field1623 = arg0.method407();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
