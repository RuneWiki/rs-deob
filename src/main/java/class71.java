import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZGXCNUJM")
public class class71 {

    @OriginalMember(owner = "ZGXCNUJM", name = "b", descriptor = "I")
    private int field1725 = -107;

    @OriginalMember(owner = "ZGXCNUJM", name = "i", descriptor = "I")
    public int field1732 = -1;

    @OriginalMember(owner = "ZGXCNUJM", name = "k", descriptor = "Z")
    public boolean field1734 = false;

    @OriginalMember(owner = "ZGXCNUJM", name = "l", descriptor = "I")
    public int field1735 = 5;

    @OriginalMember(owner = "ZGXCNUJM", name = "m", descriptor = "I")
    public int field1736 = -1;

    @OriginalMember(owner = "ZGXCNUJM", name = "n", descriptor = "I")
    public int field1737 = -1;

    @OriginalMember(owner = "ZGXCNUJM", name = "o", descriptor = "I")
    public int field1738 = 99;

    @OriginalMember(owner = "ZGXCNUJM", name = "p", descriptor = "I")
    public int field1739 = -1;

    @OriginalMember(owner = "ZGXCNUJM", name = "q", descriptor = "I")
    public int field1740 = -1;

    @OriginalMember(owner = "ZGXCNUJM", name = "r", descriptor = "I")
    public int field1741 = 2;

    @OriginalMember(owner = "ZGXCNUJM", name = "a", descriptor = "Z")
    private static boolean field1724 = true;

    @OriginalMember(owner = "ZGXCNUJM", name = "c", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "ZGXCNUJM", name = "e", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "ZGXCNUJM", name = "s", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "ZGXCNUJM", name = "t", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "ZGXCNUJM", name = "f", descriptor = "[I")
    public int[] field1729;

    @OriginalMember(owner = "ZGXCNUJM", name = "g", descriptor = "[I")
    public int[] field1730;

    @OriginalMember(owner = "ZGXCNUJM", name = "h", descriptor = "[I")
    private int[] field1731;

    @OriginalMember(owner = "ZGXCNUJM", name = "j", descriptor = "[I")
    public int[] field1733;

    @OriginalMember(owner = "ZGXCNUJM", name = "d", descriptor = "[LZGXCNUJM;")
    public static class71[] field1727;

    @OriginalMember(owner = "ZGXCNUJM", name = "a", descriptor = "(LFNOQZAYQ;I)V")
    public static void method597(class14 arg0, int arg1) {
        class11 var2 = new class11(arg0.method246("seq.dat", null), field1724);
        int var3 = 57 / arg1;
        field1726 = var2.method191();
        if (field1727 == null) {
            field1727 = new class71[field1726];
        }
        for (int var4 = 0; var4 < field1726; var4++) {
            if (field1727[var4] == null) {
                field1727[var4] = new class71();
            }
            field1727[var4].method599(var2, -25);
        }
    }

    @OriginalMember(owner = "ZGXCNUJM", name = "a", descriptor = "(II)I")
    public int method598(int arg0, int arg1) {
        int var3 = this.field1731[arg0];
        if (arg1 >= 0) {
            this.field1725 = -40;
        }
        if (var3 == 0) {
            class39 var4 = class39.method355(this.field1729[arg0]);
            if (var4 != null) {
                var3 = this.field1731[arg0] = var4.field1158;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "ZGXCNUJM", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public void method599(class11 arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method189();
                if (var3 == 0) {
                    if (this.field1728 == 0) {
                        this.field1728 = 1;
                        this.field1729 = new int[1];
                        this.field1729[0] = -1;
                        this.field1730 = new int[1];
                        this.field1730[0] = -1;
                        this.field1731 = new int[1];
                        this.field1731[0] = -1;
                    }
                    if (this.field1739 == -1) {
                        if (this.field1733 == null) {
                            this.field1739 = 0;
                        } else {
                            this.field1739 = 2;
                        }
                    }
                    if (this.field1740 == -1) {
                        if (this.field1733 != null) {
                            this.field1740 = 2;
                            return;
                        }
                        this.field1740 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1728 = arg0.method189();
                    this.field1729 = new int[this.field1728];
                    this.field1730 = new int[this.field1728];
                    this.field1731 = new int[this.field1728];
                    for (int var4 = 0; var4 < this.field1728; var4++) {
                        this.field1729[var4] = arg0.method191();
                        this.field1730[var4] = arg0.method191();
                        if (this.field1730[var4] == 65535) {
                            this.field1730[var4] = -1;
                        }
                        this.field1731[var4] = arg0.method191();
                    }
                } else if (var3 == 2) {
                    this.field1732 = arg0.method191();
                } else if (var3 == 3) {
                    int var5 = arg0.method189();
                    this.field1733 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1733[var6] = arg0.method189();
                    }
                    this.field1733[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1734 = true;
                } else if (var3 == 5) {
                    this.field1735 = arg0.method189();
                } else if (var3 == 6) {
                    this.field1736 = arg0.method191();
                } else if (var3 == 7) {
                    this.field1737 = arg0.method191();
                } else if (var3 == 8) {
                    this.field1738 = arg0.method189();
                } else if (var3 == 9) {
                    this.field1739 = arg0.method189();
                } else if (var3 == 10) {
                    this.field1740 = arg0.method189();
                } else if (var3 == 11) {
                    this.field1741 = arg0.method189();
                } else if (var3 == 12) {
                    this.field1742 = arg0.method194();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
