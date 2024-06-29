import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VKMARKYY")
public class class60 {

    @OriginalMember(owner = "client!VKMARKYY", name = "b", descriptor = "Z")
    private boolean field1527 = false;

    @OriginalMember(owner = "client!VKMARKYY", name = "j", descriptor = "Z")
    public boolean field1535 = false;

    @OriginalMember(owner = "client!VKMARKYY", name = "k", descriptor = "I")
    public int field1536 = -1;

    @OriginalMember(owner = "client!VKMARKYY", name = "m", descriptor = "Z")
    public boolean field1538 = true;

    @OriginalMember(owner = "client!VKMARKYY", name = "c", descriptor = "Z")
    private static boolean field1528 = true;

    @OriginalMember(owner = "client!VKMARKYY", name = "d", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!VKMARKYY", name = "g", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!VKMARKYY", name = "h", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!VKMARKYY", name = "i", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!VKMARKYY", name = "l", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!VKMARKYY", name = "f", descriptor = "Ljava/lang/String;")
    public String field1531;

    @OriginalMember(owner = "client!VKMARKYY", name = "a", descriptor = "Z")
    private static boolean field1526;

    @OriginalMember(owner = "client!VKMARKYY", name = "e", descriptor = "[LVKMARKYY;")
    public static class60[] field1530;

    @OriginalMember(owner = "client!VKMARKYY", name = "a", descriptor = "(BLRPFMUSNN;)V")
    public static void method480(byte arg0, class49 arg1) {
        class63 var2 = new class63((byte) -58, arg1.method414("varbit.dat", null));
        field1529 = var2.method504();
        if (field1530 == null) {
            field1530 = new class60[field1529];
        }
        for (int var3 = 0; var3 < field1529; var3++) {
            if (field1530[var3] == null) {
                field1530[var3] = new class60();
            }
            field1530[var3].method481(var3, var2, field1528);
            if (field1530[var3].field1535) {
                class51.field1372[field1530[var3].field1532].field1384 = true;
            }
        }
        if (arg0 != -114) {
            field1526 = !field1526;
        }
        if (var2.field1570.length != var2.field1571) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!VKMARKYY", name = "a", descriptor = "(ILWNCFPLWV;Z)V")
    public void method481(int arg0, class63 arg1, boolean arg2) {
        if (!arg2) {
            this.field1527 = !this.field1527;
        }
        while (true) {
            int var4 = arg1.method502();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1532 = arg1.method504();
                this.field1533 = arg1.method502();
                this.field1534 = arg1.method502();
            } else if (var4 == 10) {
                this.field1531 = arg1.method509();
            } else if (var4 == 2) {
                this.field1535 = true;
            } else if (var4 == 3) {
                this.field1536 = arg1.method507();
            } else if (var4 == 4) {
                this.field1537 = arg1.method507();
            } else if (var4 == 5) {
                this.field1538 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
