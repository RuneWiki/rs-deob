import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UDCHKCCJ")
public class class60 {

    @OriginalMember(owner = "client!UDCHKCCJ", name = "h", descriptor = "Z")
    public boolean field1609 = false;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "i", descriptor = "I")
    public int field1610 = -1;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "k", descriptor = "Z")
    public boolean field1612 = true;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "b", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "e", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "f", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "g", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "j", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "d", descriptor = "Ljava/lang/String;")
    public String field1605;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "a", descriptor = "Z")
    private static boolean field1602;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "c", descriptor = "[LUDCHKCCJ;")
    public static class60[] field1604;

    @OriginalMember(owner = "client!UDCHKCCJ", name = "a", descriptor = "(BLJUPFHAZZ;)V")
    public static void method568(byte arg0, class32 arg1) {
        if (arg0 != -3) {
            field1602 = !field1602;
        }
        class59 var2 = new class59(859, arg1.method372("varbit.dat", null));
        field1603 = var2.method531();
        if (field1604 == null) {
            field1604 = new class60[field1603];
        }
        for (int var3 = 0; var3 < field1603; var3++) {
            if (field1604[var3] == null) {
                field1604[var3] = new class60();
            }
            field1604[var3].method569(var2, 0, var3);
            if (field1604[var3].field1609) {
                class51.field1380[field1604[var3].field1606].field1392 = true;
            }
        }
        if (var2.field1588.length != var2.field1589) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!UDCHKCCJ", name = "a", descriptor = "(LTKPFKOXP;II)V")
    public void method569(class59 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method529();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1606 = arg0.method531();
                this.field1607 = arg0.method529();
                this.field1608 = arg0.method529();
            } else if (var5 == 10) {
                this.field1605 = arg0.method536();
            } else if (var5 == 2) {
                this.field1609 = true;
            } else if (var5 == 3) {
                this.field1610 = arg0.method534();
            } else if (var5 == 4) {
                this.field1611 = arg0.method534();
            } else if (var5 == 5) {
                this.field1612 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
