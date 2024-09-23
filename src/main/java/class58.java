import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UVDKTGZK")
public class class58 {

    @OriginalMember(owner = "UVDKTGZK", name = "a", descriptor = "I")
    private int field1567 = -896;

    @OriginalMember(owner = "UVDKTGZK", name = "i", descriptor = "I")
    public int field1575 = -1;

    @OriginalMember(owner = "UVDKTGZK", name = "k", descriptor = "Z")
    public boolean field1577 = false;

    @OriginalMember(owner = "UVDKTGZK", name = "l", descriptor = "I")
    public int field1578 = 5;

    @OriginalMember(owner = "UVDKTGZK", name = "m", descriptor = "I")
    public int field1579 = -1;

    @OriginalMember(owner = "UVDKTGZK", name = "n", descriptor = "I")
    public int field1580 = -1;

    @OriginalMember(owner = "UVDKTGZK", name = "o", descriptor = "I")
    public int field1581 = 99;

    @OriginalMember(owner = "UVDKTGZK", name = "p", descriptor = "I")
    public int field1582 = -1;

    @OriginalMember(owner = "UVDKTGZK", name = "q", descriptor = "I")
    public int field1583 = -1;

    @OriginalMember(owner = "UVDKTGZK", name = "r", descriptor = "I")
    public int field1584 = 2;

    @OriginalMember(owner = "UVDKTGZK", name = "b", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "UVDKTGZK", name = "c", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "UVDKTGZK", name = "e", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "UVDKTGZK", name = "s", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "UVDKTGZK", name = "t", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "UVDKTGZK", name = "f", descriptor = "[I")
    public int[] field1572;

    @OriginalMember(owner = "UVDKTGZK", name = "g", descriptor = "[I")
    public int[] field1573;

    @OriginalMember(owner = "UVDKTGZK", name = "h", descriptor = "[I")
    private int[] field1574;

    @OriginalMember(owner = "UVDKTGZK", name = "j", descriptor = "[I")
    public int[] field1576;

    @OriginalMember(owner = "UVDKTGZK", name = "d", descriptor = "[LUVDKTGZK;")
    public static class58[] field1570;

    @OriginalMember(owner = "UVDKTGZK", name = "a", descriptor = "(LGWOEELWB;B)V")
    public static void method561(class18 arg0, byte arg1) {
        if (arg1 != 3) {
            return;
        }
        class30 var2 = new class30(true, arg0.method249("seq.dat", null));
        field1569 = var2.method298();
        if (field1570 == null) {
            field1570 = new class58[field1569];
        }
        for (int var3 = 0; var3 < field1569; var3++) {
            if (field1570[var3] == null) {
                field1570[var3] = new class58();
            }
            field1570[var3].method563(var2, (byte) 2);
        }
    }

    @OriginalMember(owner = "UVDKTGZK", name = "a", descriptor = "(BI)I")
    public int method562(byte arg0, int arg1) {
        int var3 = this.field1574[arg1];
        if (arg0 != 5) {
            return this.field1567;
        }
        boolean var4 = false;
        if (var3 == 0) {
            class8 var5 = class8.method214(this.field1572[arg1]);
            if (var5 != null) {
                var3 = this.field1574[arg1] = var5.field675;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "UVDKTGZK", name = "a", descriptor = "(LMLYYHULT;B)V")
    public void method563(class30 arg0, byte arg1) {
        if (arg1 != 2) {
            this.field1568 = 119;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method296();
                if (var3 == 0) {
                    if (this.field1571 == 0) {
                        this.field1571 = 1;
                        this.field1572 = new int[1];
                        this.field1572[0] = -1;
                        this.field1573 = new int[1];
                        this.field1573[0] = -1;
                        this.field1574 = new int[1];
                        this.field1574[0] = -1;
                    }
                    if (this.field1582 == -1) {
                        if (this.field1576 == null) {
                            this.field1582 = 0;
                        } else {
                            this.field1582 = 2;
                        }
                    }
                    if (this.field1583 == -1) {
                        if (this.field1576 != null) {
                            this.field1583 = 2;
                            return;
                        }
                        this.field1583 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1571 = arg0.method296();
                    this.field1572 = new int[this.field1571];
                    this.field1573 = new int[this.field1571];
                    this.field1574 = new int[this.field1571];
                    for (int var4 = 0; var4 < this.field1571; var4++) {
                        this.field1572[var4] = arg0.method298();
                        this.field1573[var4] = arg0.method298();
                        if (this.field1573[var4] == 65535) {
                            this.field1573[var4] = -1;
                        }
                        this.field1574[var4] = arg0.method298();
                    }
                } else if (var3 == 2) {
                    this.field1575 = arg0.method298();
                } else if (var3 == 3) {
                    int var5 = arg0.method296();
                    this.field1576 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1576[var6] = arg0.method296();
                    }
                    this.field1576[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1577 = true;
                } else if (var3 == 5) {
                    this.field1578 = arg0.method296();
                } else if (var3 == 6) {
                    this.field1579 = arg0.method298();
                } else if (var3 == 7) {
                    this.field1580 = arg0.method298();
                } else if (var3 == 8) {
                    this.field1581 = arg0.method296();
                } else if (var3 == 9) {
                    this.field1582 = arg0.method296();
                } else if (var3 == 10) {
                    this.field1583 = arg0.method296();
                } else if (var3 == 11) {
                    this.field1584 = arg0.method296();
                } else if (var3 == 12) {
                    this.field1585 = arg0.method301();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
