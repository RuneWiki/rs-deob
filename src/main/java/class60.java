import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TLLQKWNZ")
public class class60 {

    @OriginalMember(owner = "client!TLLQKWNZ", name = "b", descriptor = "Z")
    private boolean field1595 = true;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "j", descriptor = "Z")
    public boolean field1603 = false;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "k", descriptor = "Z")
    public boolean field1604 = true;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "m", descriptor = "Z")
    public boolean field1606 = false;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "p", descriptor = "Z")
    public boolean field1609 = false;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "q", descriptor = "I")
    public int field1610 = -1;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "r", descriptor = "Z")
    public boolean field1611 = true;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "a", descriptor = "I")
    private static int field1594;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "c", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "e", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "h", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "i", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "l", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "n", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "o", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "g", descriptor = "Ljava/lang/String;")
    public String field1600;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "f", descriptor = "[I")
    public static int[] field1599;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "d", descriptor = "[LTLLQKWNZ;")
    public static class60[] field1597;

    @OriginalMember(owner = "client!TLLQKWNZ", name = "a", descriptor = "(BLESUFCMYV;)V")
    public static void method512(byte arg0, class11 arg1) {
        class53 var2 = new class53(arg1.method205("varp.dat", null), (byte) -17);
        field1598 = 0;
        field1596 = var2.method457();
        if (arg0 != 6) {
            return;
        }
        if (field1597 == null) {
            field1597 = new class60[field1596];
        }
        if (field1599 == null) {
            field1599 = new int[field1596];
        }
        for (int var3 = 0; var3 < field1596; var3++) {
            if (field1597[var3] == null) {
                field1597[var3] = new class60();
            }
            field1597[var3].method513(var2, var3, field1594);
        }
        if (var2.field1538.length != var2.field1539) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!TLLQKWNZ", name = "a", descriptor = "(LRGCGKKUR;II)V")
    public void method513(class53 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1595 = !this.field1595;
        }
        while (true) {
            int var4 = arg0.method455();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1601 = arg0.method455();
            } else if (var4 == 2) {
                this.field1602 = arg0.method455();
            } else if (var4 == 3) {
                this.field1603 = true;
                field1599[field1598++] = arg1;
            } else if (var4 == 4) {
                this.field1604 = false;
            } else if (var4 == 5) {
                this.field1605 = arg0.method457();
            } else if (var4 == 6) {
                this.field1606 = true;
            } else if (var4 == 7) {
                this.field1607 = arg0.method460();
            } else if (var4 == 8) {
                this.field1608 = 1;
                this.field1609 = true;
            } else if (var4 == 10) {
                this.field1600 = arg0.method462();
            } else if (var4 == 11) {
                this.field1609 = true;
            } else if (var4 == 12) {
                this.field1610 = arg0.method460();
            } else if (var4 == 13) {
                this.field1608 = 2;
                this.field1609 = true;
            } else if (var4 == 14) {
                this.field1611 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
