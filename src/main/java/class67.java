import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XRDQTWLL")
public class class67 {

    @OriginalMember(owner = "client!XRDQTWLL", name = "c", descriptor = "Z")
    private boolean field1664 = false;

    @OriginalMember(owner = "client!XRDQTWLL", name = "j", descriptor = "I")
    public int field1671 = -1;

    @OriginalMember(owner = "client!XRDQTWLL", name = "l", descriptor = "Z")
    public boolean field1673 = false;

    @OriginalMember(owner = "client!XRDQTWLL", name = "m", descriptor = "I")
    public int field1674 = 5;

    @OriginalMember(owner = "client!XRDQTWLL", name = "n", descriptor = "I")
    public int field1675 = -1;

    @OriginalMember(owner = "client!XRDQTWLL", name = "o", descriptor = "I")
    public int field1676 = -1;

    @OriginalMember(owner = "client!XRDQTWLL", name = "p", descriptor = "I")
    public int field1677 = 99;

    @OriginalMember(owner = "client!XRDQTWLL", name = "q", descriptor = "I")
    public int field1678 = -1;

    @OriginalMember(owner = "client!XRDQTWLL", name = "r", descriptor = "I")
    public int field1679 = -1;

    @OriginalMember(owner = "client!XRDQTWLL", name = "s", descriptor = "I")
    public int field1680 = 2;

    @OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "I")
    private static int field1662 = 536;

    @OriginalMember(owner = "client!XRDQTWLL", name = "b", descriptor = "I")
    private static int field1663 = 3;

    @OriginalMember(owner = "client!XRDQTWLL", name = "d", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!XRDQTWLL", name = "f", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!XRDQTWLL", name = "t", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!XRDQTWLL", name = "u", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!XRDQTWLL", name = "g", descriptor = "[I")
    public int[] field1668;

    @OriginalMember(owner = "client!XRDQTWLL", name = "h", descriptor = "[I")
    public int[] field1669;

    @OriginalMember(owner = "client!XRDQTWLL", name = "i", descriptor = "[I")
    private int[] field1670;

    @OriginalMember(owner = "client!XRDQTWLL", name = "k", descriptor = "[I")
    public int[] field1672;

    @OriginalMember(owner = "client!XRDQTWLL", name = "e", descriptor = "[LXRDQTWLL;")
    public static class67[] field1666;

    @OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "(ILUUIGNTAD;)V")
    public static void method582(int arg0, class59 arg1) {
        if (field1663 != arg0) {
            return;
        }
        class10 var2 = new class10(arg1.method545("seq.dat", null), field1662);
        field1665 = var2.method196();
        if (field1666 == null) {
            field1666 = new class67[field1665];
        }
        for (int var3 = 0; var3 < field1665; var3++) {
            if (field1666[var3] == null) {
                field1666[var3] = new class67();
            }
            field1666[var3].method584(var2, -593);
        }
    }

    @OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "(IB)I")
    public int method583(int arg0, byte arg1) {
        if (arg1 != 9) {
            this.field1664 = !this.field1664;
        }
        int var3 = this.field1670[arg0];
        if (var3 == 0) {
            class48 var4 = class48.method435(this.field1668[arg0]);
            if (var4 != null) {
                var3 = this.field1670[arg0] = var4.field1252;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "(LCMGGUSPR;I)V")
    public void method584(class10 arg0, int arg1) {
        if (arg1 >= 0) {
            field1662 = 23;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method194();
                if (var3 == 0) {
                    if (this.field1667 == 0) {
                        this.field1667 = 1;
                        this.field1668 = new int[1];
                        this.field1668[0] = -1;
                        this.field1669 = new int[1];
                        this.field1669[0] = -1;
                        this.field1670 = new int[1];
                        this.field1670[0] = -1;
                    }
                    if (this.field1678 == -1) {
                        if (this.field1672 == null) {
                            this.field1678 = 0;
                        } else {
                            this.field1678 = 2;
                        }
                    }
                    if (this.field1679 == -1) {
                        if (this.field1672 != null) {
                            this.field1679 = 2;
                            return;
                        }
                        this.field1679 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1667 = arg0.method194();
                    this.field1668 = new int[this.field1667];
                    this.field1669 = new int[this.field1667];
                    this.field1670 = new int[this.field1667];
                    for (int var4 = 0; var4 < this.field1667; var4++) {
                        this.field1668[var4] = arg0.method196();
                        this.field1669[var4] = arg0.method196();
                        if (this.field1669[var4] == 65535) {
                            this.field1669[var4] = -1;
                        }
                        this.field1670[var4] = arg0.method196();
                    }
                } else if (var3 == 2) {
                    this.field1671 = arg0.method196();
                } else if (var3 == 3) {
                    int var5 = arg0.method194();
                    this.field1672 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1672[var6] = arg0.method194();
                    }
                    this.field1672[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1673 = true;
                } else if (var3 == 5) {
                    this.field1674 = arg0.method194();
                } else if (var3 == 6) {
                    this.field1675 = arg0.method196();
                } else if (var3 == 7) {
                    this.field1676 = arg0.method196();
                } else if (var3 == 8) {
                    this.field1677 = arg0.method194();
                } else if (var3 == 9) {
                    this.field1678 = arg0.method194();
                } else if (var3 == 10) {
                    this.field1679 = arg0.method194();
                } else if (var3 == 11) {
                    this.field1680 = arg0.method194();
                } else if (var3 == 12) {
                    this.field1681 = arg0.method199();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
