import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!USQYPEQB")
public class class56 {

    @OriginalMember(owner = "client!USQYPEQB", name = "a", descriptor = "I")
    private int field1486 = -585;

    @OriginalMember(owner = "client!USQYPEQB", name = "b", descriptor = "Z")
    private boolean field1487 = true;

    @OriginalMember(owner = "client!USQYPEQB", name = "i", descriptor = "Z")
    public boolean field1494 = false;

    @OriginalMember(owner = "client!USQYPEQB", name = "j", descriptor = "I")
    public int field1495 = -1;

    @OriginalMember(owner = "client!USQYPEQB", name = "l", descriptor = "Z")
    public boolean field1497 = true;

    @OriginalMember(owner = "client!USQYPEQB", name = "c", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!USQYPEQB", name = "f", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!USQYPEQB", name = "g", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!USQYPEQB", name = "h", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!USQYPEQB", name = "k", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!USQYPEQB", name = "e", descriptor = "Ljava/lang/String;")
    public String field1490;

    @OriginalMember(owner = "client!USQYPEQB", name = "d", descriptor = "[LUSQYPEQB;")
    public static class56[] field1489;

    @OriginalMember(owner = "client!USQYPEQB", name = "a", descriptor = "(ZLVSQMPWOM;)V")
    public static void method519(boolean arg0, class59 arg1) {
        if (!arg0) {
            return;
        }
        class3 var2 = new class3(arg1.method526("varbit.dat", null), -990);
        field1488 = var2.method56();
        if (field1489 == null) {
            field1489 = new class56[field1488];
        }
        for (int var3 = 0; var3 < field1488; var3++) {
            if (field1489[var3] == null) {
                field1489[var3] = new class56();
            }
            field1489[var3].method520(var3, var2, -585);
            if (field1489[var3].field1494) {
                class37.field1086[field1489[var3].field1491].field1098 = true;
            }
        }
        if (var2.field49.length != var2.field50) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!USQYPEQB", name = "a", descriptor = "(ILBFQIDHPO;I)V")
    public void method520(int arg0, class3 arg1, int arg2) {
        while (arg2 >= 0) {
            this.field1487 = !this.field1487;
        }
        while (true) {
            int var4 = arg1.method54();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1491 = arg1.method56();
                this.field1492 = arg1.method54();
                this.field1493 = arg1.method54();
            } else if (var4 == 10) {
                this.field1490 = arg1.method61();
            } else if (var4 == 2) {
                this.field1494 = true;
            } else if (var4 == 3) {
                this.field1495 = arg1.method59();
            } else if (var4 == 4) {
                this.field1496 = arg1.method59();
            } else if (var4 == 5) {
                this.field1497 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
