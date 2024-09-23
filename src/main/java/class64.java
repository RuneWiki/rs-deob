import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UAVNMKVJ")
public class class64 {

    @OriginalMember(owner = "UAVNMKVJ", name = "f", descriptor = "I")
    public int field1560 = -1;

    @OriginalMember(owner = "UAVNMKVJ", name = "h", descriptor = "[I")
    public int[] field1562 = new int[6];

    @OriginalMember(owner = "UAVNMKVJ", name = "i", descriptor = "[I")
    public int[] field1563 = new int[6];

    @OriginalMember(owner = "UAVNMKVJ", name = "j", descriptor = "I")
    public int field1564 = 128;

    @OriginalMember(owner = "UAVNMKVJ", name = "k", descriptor = "I")
    public int field1565 = 128;

    @OriginalMember(owner = "UAVNMKVJ", name = "o", descriptor = "LOOTLZHQB;")
    public static class46 field1569 = new class46(30, 9);

    @OriginalMember(owner = "UAVNMKVJ", name = "b", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "UAVNMKVJ", name = "d", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "UAVNMKVJ", name = "e", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "UAVNMKVJ", name = "l", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "UAVNMKVJ", name = "m", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "UAVNMKVJ", name = "n", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "UAVNMKVJ", name = "g", descriptor = "LLCRVYGCP;")
    public class36 field1561;

    @OriginalMember(owner = "UAVNMKVJ", name = "a", descriptor = "Z")
    private static boolean field1555;

    @OriginalMember(owner = "UAVNMKVJ", name = "c", descriptor = "[LUAVNMKVJ;")
    public static class64[] field1557;

    @OriginalMember(owner = "UAVNMKVJ", name = "a", descriptor = "(ILHRXSNEYZ;)V")
    public static void method500(int arg0, class26 arg1) {
        class31 var2 = new class31(arg1.method289("spotanim.dat", null), 8);
        field1556 = var2.method308();
        if (field1557 == null) {
            field1557 = new class64[field1556];
        }
        for (int var3 = 0; var3 < field1556; var3++) {
            if (field1557[var3] == null) {
                field1557[var3] = new class64();
            }
            field1557[var3].field1558 = var3;
            field1557[var3].method501(var2, 0);
        }
        if (arg0 <= 0) {
            field1555 = !field1555;
        }
    }

    @OriginalMember(owner = "UAVNMKVJ", name = "a", descriptor = "(LJHKSAGUC;I)V")
    public void method501(class31 arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method306();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1559 = arg0.method308();
                } else if (var4 == 2) {
                    this.field1560 = arg0.method308();
                    if (class36.field953 != null) {
                        this.field1561 = class36.field953[this.field1560];
                    }
                } else if (var4 == 4) {
                    this.field1564 = arg0.method308();
                } else if (var4 == 5) {
                    this.field1565 = arg0.method308();
                } else if (var4 == 6) {
                    this.field1566 = arg0.method308();
                } else if (var4 == 7) {
                    this.field1567 = arg0.method306();
                } else if (var4 == 8) {
                    this.field1568 = arg0.method306();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1562[var4 - 40] = arg0.method308();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1563[var4 - 50] = arg0.method308();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "UAVNMKVJ", name = "a", descriptor = "()LRTQSBWRH;")
    public class59 method502() {
        class59 var1 = (class59) field1569.method386((long) this.field1558);
        if (var1 != null) {
            return var1;
        }
        class59 var2 = class59.method454(false, this.field1559);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1562[0] != 0) {
                var2.method468(this.field1562[var3], this.field1563[var3]);
            }
        }
        field1569.method387((long) this.field1558, var2, (byte) 8);
        return var2;
    }
}
