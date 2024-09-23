import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZKWMIVTX")
public class class71 {

    @OriginalMember(owner = "ZKWMIVTX", name = "h", descriptor = "I")
    public int field1710 = -1;

    @OriginalMember(owner = "ZKWMIVTX", name = "j", descriptor = "Z")
    public boolean field1712 = false;

    @OriginalMember(owner = "ZKWMIVTX", name = "k", descriptor = "I")
    public int field1713 = 5;

    @OriginalMember(owner = "ZKWMIVTX", name = "l", descriptor = "I")
    public int field1714 = -1;

    @OriginalMember(owner = "ZKWMIVTX", name = "m", descriptor = "I")
    public int field1715 = -1;

    @OriginalMember(owner = "ZKWMIVTX", name = "n", descriptor = "I")
    public int field1716 = 99;

    @OriginalMember(owner = "ZKWMIVTX", name = "o", descriptor = "I")
    public int field1717 = -1;

    @OriginalMember(owner = "ZKWMIVTX", name = "p", descriptor = "I")
    public int field1718 = -1;

    @OriginalMember(owner = "ZKWMIVTX", name = "q", descriptor = "I")
    public int field1719 = 2;

    @OriginalMember(owner = "ZKWMIVTX", name = "a", descriptor = "I")
    private static int field1703 = 8;

    @OriginalMember(owner = "ZKWMIVTX", name = "b", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "ZKWMIVTX", name = "d", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "ZKWMIVTX", name = "r", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "ZKWMIVTX", name = "s", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "ZKWMIVTX", name = "e", descriptor = "[I")
    public int[] field1707;

    @OriginalMember(owner = "ZKWMIVTX", name = "f", descriptor = "[I")
    public int[] field1708;

    @OriginalMember(owner = "ZKWMIVTX", name = "g", descriptor = "[I")
    private int[] field1709;

    @OriginalMember(owner = "ZKWMIVTX", name = "i", descriptor = "[I")
    public int[] field1711;

    @OriginalMember(owner = "ZKWMIVTX", name = "c", descriptor = "[LZKWMIVTX;")
    public static class71[] field1705;

    @OriginalMember(owner = "ZKWMIVTX", name = "a", descriptor = "(LBYZSQZUF;Z)V")
    public static void method590(class7 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        class24 var2 = new class24(0, arg0.method29("seq.dat", null));
        field1704 = var2.method240();
        if (field1705 == null) {
            field1705 = new class71[field1704];
        }
        for (int var3 = 0; var3 < field1704; var3++) {
            if (field1705[var3] == null) {
                field1705[var3] = new class71();
            }
            field1705[var3].method592(field1703, var2);
        }
    }

    @OriginalMember(owner = "ZKWMIVTX", name = "a", descriptor = "(II)I")
    public int method591(int arg0, int arg1) {
        int var3 = this.field1709[arg1];
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            class22 var5 = class22.method218(this.field1707[arg1], (byte) -27);
            if (var5 != null) {
                var3 = this.field1709[arg1] = var5.field793;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "ZKWMIVTX", name = "a", descriptor = "(ILIMUIZRAF;)V")
    public void method592(int arg0, class24 arg1) {
        if (arg0 != 8) {
            field1703 = -233;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    if (this.field1706 == 0) {
                        this.field1706 = 1;
                        this.field1707 = new int[1];
                        this.field1707[0] = -1;
                        this.field1708 = new int[1];
                        this.field1708[0] = -1;
                        this.field1709 = new int[1];
                        this.field1709[0] = -1;
                    }
                    if (this.field1717 == -1) {
                        if (this.field1711 == null) {
                            this.field1717 = 0;
                        } else {
                            this.field1717 = 2;
                        }
                    }
                    if (this.field1718 == -1) {
                        if (this.field1711 != null) {
                            this.field1718 = 2;
                            return;
                        }
                        this.field1718 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1706 = arg1.method238();
                    this.field1707 = new int[this.field1706];
                    this.field1708 = new int[this.field1706];
                    this.field1709 = new int[this.field1706];
                    for (int var4 = 0; var4 < this.field1706; var4++) {
                        this.field1707[var4] = arg1.method240();
                        this.field1708[var4] = arg1.method240();
                        if (this.field1708[var4] == 65535) {
                            this.field1708[var4] = -1;
                        }
                        this.field1709[var4] = arg1.method240();
                    }
                } else if (var3 == 2) {
                    this.field1710 = arg1.method240();
                } else if (var3 == 3) {
                    int var5 = arg1.method238();
                    this.field1711 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1711[var6] = arg1.method238();
                    }
                    this.field1711[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1712 = true;
                } else if (var3 == 5) {
                    this.field1713 = arg1.method238();
                } else if (var3 == 6) {
                    this.field1714 = arg1.method240();
                } else if (var3 == 7) {
                    this.field1715 = arg1.method240();
                } else if (var3 == 8) {
                    this.field1716 = arg1.method238();
                } else if (var3 == 9) {
                    this.field1717 = arg1.method238();
                } else if (var3 == 10) {
                    this.field1718 = arg1.method238();
                } else if (var3 == 11) {
                    this.field1719 = arg1.method238();
                } else if (var3 == 12) {
                    this.field1720 = arg1.method243();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
