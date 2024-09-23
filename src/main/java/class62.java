import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VCTVXSNH")
public class class62 {

    @OriginalMember(owner = "VCTVXSNH", name = "f", descriptor = "I")
    public int field1573 = -1;

    @OriginalMember(owner = "VCTVXSNH", name = "h", descriptor = "[I")
    public int[] field1575 = new int[6];

    @OriginalMember(owner = "VCTVXSNH", name = "i", descriptor = "[I")
    public int[] field1576 = new int[6];

    @OriginalMember(owner = "VCTVXSNH", name = "j", descriptor = "I")
    public int field1577 = 128;

    @OriginalMember(owner = "VCTVXSNH", name = "k", descriptor = "I")
    public int field1578 = 128;

    @OriginalMember(owner = "VCTVXSNH", name = "a", descriptor = "Z")
    private static boolean field1568 = true;

    @OriginalMember(owner = "VCTVXSNH", name = "o", descriptor = "LAKUDQPZE;")
    public static class1 field1582 = new class1((byte) 8, 30);

    @OriginalMember(owner = "VCTVXSNH", name = "b", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "VCTVXSNH", name = "d", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "VCTVXSNH", name = "e", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "VCTVXSNH", name = "l", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "VCTVXSNH", name = "m", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "VCTVXSNH", name = "n", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "VCTVXSNH", name = "g", descriptor = "LBZONLWPM;")
    public class5 field1574;

    @OriginalMember(owner = "VCTVXSNH", name = "c", descriptor = "[LVCTVXSNH;")
    public static class62[] field1570;

    @OriginalMember(owner = "VCTVXSNH", name = "a", descriptor = "(ILTKEGJSFV;)V")
    public static void method553(int arg0, class58 arg1) {
        if (arg0 != 0) {
            field1568 = !field1568;
        }
        class15 var2 = new class15(arg1.method542("spotanim.dat", null), false);
        field1569 = var2.method263();
        if (field1570 == null) {
            field1570 = new class62[field1569];
        }
        for (int var3 = 0; var3 < field1569; var3++) {
            if (field1570[var3] == null) {
                field1570[var3] = new class62();
            }
            field1570[var3].field1571 = var3;
            field1570[var3].method554(var2, true);
        }
    }

    @OriginalMember(owner = "VCTVXSNH", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    public void method554(class15 arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method261();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1572 = arg0.method263();
                } else if (var4 == 2) {
                    this.field1573 = arg0.method263();
                    if (class5.field67 != null) {
                        this.field1574 = class5.field67[this.field1573];
                    }
                } else if (var4 == 4) {
                    this.field1577 = arg0.method263();
                } else if (var4 == 5) {
                    this.field1578 = arg0.method263();
                } else if (var4 == 6) {
                    this.field1579 = arg0.method263();
                } else if (var4 == 7) {
                    this.field1580 = arg0.method261();
                } else if (var4 == 8) {
                    this.field1581 = arg0.method261();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1575[var4 - 40] = arg0.method263();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1576[var4 - 50] = arg0.method263();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "VCTVXSNH", name = "a", descriptor = "()LIGXVZOHI;")
    public class32 method555() {
        class32 var1 = (class32) field1582.method1((long) this.field1571);
        if (var1 != null) {
            return var1;
        }
        class32 var2 = class32.method354(this.field1572);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1575[0] != 0) {
                var2.method368(this.field1575[var3], this.field1576[var3]);
            }
        }
        field1582.method2(var2, false, (long) this.field1571);
        return var2;
    }
}
