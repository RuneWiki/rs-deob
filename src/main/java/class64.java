import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XHDTVZNY")
public class class64 {

    @OriginalMember(owner = "XHDTVZNY", name = "e", descriptor = "I")
    public int field1623 = -1;

    @OriginalMember(owner = "XHDTVZNY", name = "g", descriptor = "[I")
    public int[] field1625 = new int[6];

    @OriginalMember(owner = "XHDTVZNY", name = "h", descriptor = "[I")
    public int[] field1626 = new int[6];

    @OriginalMember(owner = "XHDTVZNY", name = "i", descriptor = "I")
    public int field1627 = 128;

    @OriginalMember(owner = "XHDTVZNY", name = "j", descriptor = "I")
    public int field1628 = 128;

    @OriginalMember(owner = "XHDTVZNY", name = "n", descriptor = "LHGKRJZKS;")
    public static class24 field1632 = new class24(0, 30);

    @OriginalMember(owner = "XHDTVZNY", name = "a", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "XHDTVZNY", name = "c", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "XHDTVZNY", name = "d", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "XHDTVZNY", name = "k", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "XHDTVZNY", name = "l", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "XHDTVZNY", name = "m", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "XHDTVZNY", name = "f", descriptor = "LWLHKAARP;")
    public class59 field1624;

    @OriginalMember(owner = "XHDTVZNY", name = "b", descriptor = "[LXHDTVZNY;")
    public static class64[] field1620;

    @OriginalMember(owner = "XHDTVZNY", name = "a", descriptor = "(ZLXRWUKRPO;)V")
    public static void method577(boolean arg0, class65 arg1) {
        class21 var2 = new class21(arg1.method581("spotanim.dat", null), -49015);
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1619 = var2.method246();
        if (field1620 == null) {
            field1620 = new class64[field1619];
        }
        for (int var4 = 0; var4 < field1619; var4++) {
            if (field1620[var4] == null) {
                field1620[var4] = new class64();
            }
            field1620[var4].field1621 = var4;
            field1620[var4].method578((byte) 8, var2);
        }
    }

    @OriginalMember(owner = "XHDTVZNY", name = "a", descriptor = "(BLGLMIQHJI;)V")
    public void method578(byte arg0, class21 arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method244();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1622 = arg1.method246();
                } else if (var3 == 2) {
                    this.field1623 = arg1.method246();
                    if (class59.field1538 != null) {
                        this.field1624 = class59.field1538[this.field1623];
                    }
                } else if (var3 == 4) {
                    this.field1627 = arg1.method246();
                } else if (var3 == 5) {
                    this.field1628 = arg1.method246();
                } else if (var3 == 6) {
                    this.field1629 = arg1.method246();
                } else if (var3 == 7) {
                    this.field1630 = arg1.method244();
                } else if (var3 == 8) {
                    this.field1631 = arg1.method244();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1625[var3 - 40] = arg1.method246();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1626[var3 - 50] = arg1.method246();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "XHDTVZNY", name = "a", descriptor = "()LVHYCWIPJ;")
    public class53 method579() {
        class53 var1 = (class53) field1632.method285((long) this.field1621);
        if (var1 != null) {
            return var1;
        }
        class53 var2 = class53.method500((byte) 5, this.field1622);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1625[0] != 0) {
                var2.method514(this.field1625[var3], this.field1626[var3]);
            }
        }
        field1632.method286(-43932, (long) this.field1621, var2);
        return var2;
    }
}
