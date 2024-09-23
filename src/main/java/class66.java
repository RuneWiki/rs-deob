import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VSBOWDVL")
public class class66 {

    @OriginalMember(owner = "VSBOWDVL", name = "g", descriptor = "I")
    public int field1608 = -1;

    @OriginalMember(owner = "VSBOWDVL", name = "i", descriptor = "[I")
    public int[] field1610 = new int[6];

    @OriginalMember(owner = "VSBOWDVL", name = "j", descriptor = "[I")
    public int[] field1611 = new int[6];

    @OriginalMember(owner = "VSBOWDVL", name = "k", descriptor = "I")
    public int field1612 = 128;

    @OriginalMember(owner = "VSBOWDVL", name = "l", descriptor = "I")
    public int field1613 = 128;

    @OriginalMember(owner = "VSBOWDVL", name = "a", descriptor = "B")
    private static byte field1602 = -27;

    @OriginalMember(owner = "VSBOWDVL", name = "p", descriptor = "LJLTMYUOM;")
    public static class24 field1617 = new class24(true, 30);

    @OriginalMember(owner = "VSBOWDVL", name = "c", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "VSBOWDVL", name = "e", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "VSBOWDVL", name = "f", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "VSBOWDVL", name = "m", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "VSBOWDVL", name = "n", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "VSBOWDVL", name = "o", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "VSBOWDVL", name = "h", descriptor = "LGMRGYXFL;")
    public class21 field1609;

    @OriginalMember(owner = "VSBOWDVL", name = "b", descriptor = "Z")
    private static boolean field1603;

    @OriginalMember(owner = "VSBOWDVL", name = "d", descriptor = "[LVSBOWDVL;")
    public static class66[] field1605;

    @OriginalMember(owner = "VSBOWDVL", name = "a", descriptor = "(ILQKFGLETG;)V")
    public static void method517(int arg0, class50 arg1) {
        if (arg0 != 0) {
            field1603 = !field1603;
        }
        class68 var2 = new class68((byte) 9, arg1.method402("spotanim.dat", null));
        field1604 = var2.method536();
        if (field1605 == null) {
            field1605 = new class66[field1604];
        }
        for (int var3 = 0; var3 < field1604; var3++) {
            if (field1605[var3] == null) {
                field1605[var3] = new class66();
            }
            field1605[var3].field1606 = var3;
            field1605[var3].method518(field1602, var2);
        }
    }

    @OriginalMember(owner = "VSBOWDVL", name = "a", descriptor = "(BLXJCNBMKS;)V")
    public void method518(byte arg0, class68 arg1) {
        if (field1602 != arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method534();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1607 = arg1.method536();
                } else if (var3 == 2) {
                    this.field1608 = arg1.method536();
                    if (class21.field817 != null) {
                        this.field1609 = class21.field817[this.field1608];
                    }
                } else if (var3 == 4) {
                    this.field1612 = arg1.method536();
                } else if (var3 == 5) {
                    this.field1613 = arg1.method536();
                } else if (var3 == 6) {
                    this.field1614 = arg1.method536();
                } else if (var3 == 7) {
                    this.field1615 = arg1.method534();
                } else if (var3 == 8) {
                    this.field1616 = arg1.method534();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1610[var3 - 40] = arg1.method536();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1611[var3 - 50] = arg1.method536();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "VSBOWDVL", name = "a", descriptor = "()LFUTAQMCE;")
    public class19 method519() {
        class19 var1 = (class19) field1617.method297((long) this.field1606);
        if (var1 != null) {
            return var1;
        }
        class19 var2 = class19.method250(true, this.field1607);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1610[0] != 0) {
                var2.method264(this.field1610[var3], this.field1611[var3]);
            }
        }
        field1617.method298(-561, (long) this.field1606, var2);
        return var2;
    }
}
