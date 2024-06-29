import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XTKQUJNF")
public class class65 {

    @OriginalMember(owner = "client!XTKQUJNF", name = "h", descriptor = "I")
    public int field1633 = -1;

    @OriginalMember(owner = "client!XTKQUJNF", name = "j", descriptor = "Z")
    public boolean field1635 = false;

    @OriginalMember(owner = "client!XTKQUJNF", name = "k", descriptor = "I")
    public int field1636 = 5;

    @OriginalMember(owner = "client!XTKQUJNF", name = "l", descriptor = "I")
    public int field1637 = -1;

    @OriginalMember(owner = "client!XTKQUJNF", name = "m", descriptor = "I")
    public int field1638 = -1;

    @OriginalMember(owner = "client!XTKQUJNF", name = "n", descriptor = "I")
    public int field1639 = 99;

    @OriginalMember(owner = "client!XTKQUJNF", name = "o", descriptor = "I")
    public int field1640 = -1;

    @OriginalMember(owner = "client!XTKQUJNF", name = "p", descriptor = "I")
    public int field1641 = -1;

    @OriginalMember(owner = "client!XTKQUJNF", name = "q", descriptor = "I")
    public int field1642 = 2;

    @OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "I")
    private static int field1626 = 178;

    @OriginalMember(owner = "client!XTKQUJNF", name = "b", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!XTKQUJNF", name = "d", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!XTKQUJNF", name = "r", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!XTKQUJNF", name = "s", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!XTKQUJNF", name = "e", descriptor = "[I")
    public int[] field1630;

    @OriginalMember(owner = "client!XTKQUJNF", name = "f", descriptor = "[I")
    public int[] field1631;

    @OriginalMember(owner = "client!XTKQUJNF", name = "g", descriptor = "[I")
    private int[] field1632;

    @OriginalMember(owner = "client!XTKQUJNF", name = "i", descriptor = "[I")
    public int[] field1634;

    @OriginalMember(owner = "client!XTKQUJNF", name = "c", descriptor = "[LXTKQUJNF;")
    public static class65[] field1628;

    @OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "(LAWEEREDT;I)V")
    public static void method531(class2 arg0, int arg1) {
        class25 var2 = new class25(arg0.method14("seq.dat", null), 713);
        field1627 = var2.method247();
        if (field1628 == null) {
            field1628 = new class65[field1627];
        }
        for (int var3 = 0; var3 < field1627; var3++) {
            if (field1628[var3] == null) {
                field1628[var3] = new class65();
            }
            field1628[var3].method533(var2, (byte) 1);
        }
        if (arg1 != 0) {
            field1626 = -497;
        }
    }

    @OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "(IB)I")
    public int method532(int arg0, byte arg1) {
        int var3 = this.field1632[arg0];
        if (arg1 == 6) {
            boolean var4 = false;
        } else {
            field1626 = 348;
        }
        if (var3 == 0) {
            class42 var5 = class42.method381(this.field1630[arg0]);
            if (var5 != null) {
                var3 = this.field1632[arg0] = var5.field1303;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "(LIUVBENCV;B)V")
    public void method533(class25 arg0, byte arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg0.method245();
                if (var4 == 0) {
                    if (this.field1629 == 0) {
                        this.field1629 = 1;
                        this.field1630 = new int[1];
                        this.field1630[0] = -1;
                        this.field1631 = new int[1];
                        this.field1631[0] = -1;
                        this.field1632 = new int[1];
                        this.field1632[0] = -1;
                    }
                    if (this.field1640 == -1) {
                        if (this.field1634 == null) {
                            this.field1640 = 0;
                        } else {
                            this.field1640 = 2;
                        }
                    }
                    if (this.field1641 == -1) {
                        if (this.field1634 != null) {
                            this.field1641 = 2;
                            return;
                        }
                        this.field1641 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1629 = arg0.method245();
                    this.field1630 = new int[this.field1629];
                    this.field1631 = new int[this.field1629];
                    this.field1632 = new int[this.field1629];
                    for (int var5 = 0; var5 < this.field1629; var5++) {
                        this.field1630[var5] = arg0.method247();
                        this.field1631[var5] = arg0.method247();
                        if (this.field1631[var5] == 65535) {
                            this.field1631[var5] = -1;
                        }
                        this.field1632[var5] = arg0.method247();
                    }
                } else if (var4 == 2) {
                    this.field1633 = arg0.method247();
                } else if (var4 == 3) {
                    int var6 = arg0.method245();
                    this.field1634 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1634[var7] = arg0.method245();
                    }
                    this.field1634[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1635 = true;
                } else if (var4 == 5) {
                    this.field1636 = arg0.method245();
                } else if (var4 == 6) {
                    this.field1637 = arg0.method247();
                } else if (var4 == 7) {
                    this.field1638 = arg0.method247();
                } else if (var4 == 8) {
                    this.field1639 = arg0.method245();
                } else if (var4 == 9) {
                    this.field1640 = arg0.method245();
                } else if (var4 == 10) {
                    this.field1641 = arg0.method245();
                } else if (var4 == 11) {
                    this.field1642 = arg0.method245();
                } else if (var4 == 12) {
                    this.field1643 = arg0.method250();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
