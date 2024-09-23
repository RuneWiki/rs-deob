import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VJTDBWRW")
public class class64 {

    @OriginalMember(owner = "VJTDBWRW", name = "a", descriptor = "I")
    private int field1556 = 4;

    @OriginalMember(owner = "VJTDBWRW", name = "i", descriptor = "Z")
    public boolean field1564 = false;

    @OriginalMember(owner = "VJTDBWRW", name = "j", descriptor = "Z")
    public boolean field1565 = true;

    @OriginalMember(owner = "VJTDBWRW", name = "l", descriptor = "Z")
    public boolean field1567 = false;

    @OriginalMember(owner = "VJTDBWRW", name = "o", descriptor = "Z")
    public boolean field1570 = false;

    @OriginalMember(owner = "VJTDBWRW", name = "p", descriptor = "I")
    public int field1571 = -1;

    @OriginalMember(owner = "VJTDBWRW", name = "b", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "VJTDBWRW", name = "d", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "VJTDBWRW", name = "g", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "VJTDBWRW", name = "h", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "VJTDBWRW", name = "k", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "VJTDBWRW", name = "m", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "VJTDBWRW", name = "n", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "VJTDBWRW", name = "f", descriptor = "Ljava/lang/String;")
    public String field1561;

    @OriginalMember(owner = "VJTDBWRW", name = "e", descriptor = "[I")
    public static int[] field1560;

    @OriginalMember(owner = "VJTDBWRW", name = "c", descriptor = "[LVJTDBWRW;")
    public static class64[] field1558;

    @OriginalMember(owner = "VJTDBWRW", name = "a", descriptor = "(LDYBMLHQM;Z)V")
    public static void method507(class16 arg0, boolean arg1) {
        class29 var2 = new class29((byte) -28, arg0.method248("varp.dat", null));
        field1559 = 0;
        if (arg1) {
            return;
        }
        field1557 = var2.method310();
        if (field1558 == null) {
            field1558 = new class64[field1557];
        }
        if (field1560 == null) {
            field1560 = new int[field1557];
        }
        for (int var3 = 0; var3 < field1557; var3++) {
            if (field1558[var3] == null) {
                field1558[var3] = new class64();
            }
            field1558[var3].method508(-45827, var3, var2);
        }
        if (var2.field1106.length != var2.field1107) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "VJTDBWRW", name = "a", descriptor = "(IILINLHDAGO;)V")
    public void method508(int arg0, int arg1, class29 arg2) {
        if (arg0 != -45827) {
            this.field1556 = 399;
        }
        while (true) {
            int var4 = arg2.method308();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1562 = arg2.method308();
            } else if (var4 == 2) {
                this.field1563 = arg2.method308();
            } else if (var4 == 3) {
                this.field1564 = true;
                field1560[field1559++] = arg1;
            } else if (var4 == 4) {
                this.field1565 = false;
            } else if (var4 == 5) {
                this.field1566 = arg2.method310();
            } else if (var4 == 6) {
                this.field1567 = true;
            } else if (var4 == 7) {
                this.field1568 = arg2.method313();
            } else if (var4 == 8) {
                this.field1569 = 1;
                this.field1570 = true;
            } else if (var4 == 10) {
                this.field1561 = arg2.method315();
            } else if (var4 == 11) {
                this.field1570 = true;
            } else if (var4 == 12) {
                this.field1571 = arg2.method313();
            } else if (var4 == 13) {
                this.field1569 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
