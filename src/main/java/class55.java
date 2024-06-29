import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UDOLPBTU")
public class class55 {

    @OriginalMember(owner = "client!UDOLPBTU", name = "h", descriptor = "Z")
    public boolean field1586 = false;

    @OriginalMember(owner = "client!UDOLPBTU", name = "i", descriptor = "I")
    public int field1587 = -1;

    @OriginalMember(owner = "client!UDOLPBTU", name = "k", descriptor = "Z")
    public boolean field1589 = true;

    @OriginalMember(owner = "client!UDOLPBTU", name = "a", descriptor = "I")
    private static int field1579 = 6;

    @OriginalMember(owner = "client!UDOLPBTU", name = "b", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!UDOLPBTU", name = "e", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!UDOLPBTU", name = "f", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!UDOLPBTU", name = "g", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!UDOLPBTU", name = "j", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!UDOLPBTU", name = "d", descriptor = "Ljava/lang/String;")
    public String field1582;

    @OriginalMember(owner = "client!UDOLPBTU", name = "c", descriptor = "[LUDOLPBTU;")
    public static class55[] field1581;

    @OriginalMember(owner = "client!UDOLPBTU", name = "a", descriptor = "(LLKPVZAQN;I)V")
    public static void method495(class33 arg0, int arg1) {
        class58 var2 = new class58((byte) -115, arg0.method323("varbit.dat", null));
        field1580 = var2.method517();
        int var3 = 67 / arg1;
        if (field1581 == null) {
            field1581 = new class55[field1580];
        }
        for (int var4 = 0; var4 < field1580; var4++) {
            if (field1581[var4] == null) {
                field1581[var4] = new class55();
            }
            field1581[var4].method496(var2, var4, field1579);
            if (field1581[var4].field1586) {
                class64.field1667[field1581[var4].field1583].field1679 = true;
            }
        }
        if (var2.field1614.length != var2.field1615) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!UDOLPBTU", name = "a", descriptor = "(LWBEWPIXO;II)V")
    public void method496(class58 arg0, int arg1, int arg2) {
        if (arg2 != 6) {
            return;
        }
        while (true) {
            int var4 = arg0.method515();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1583 = arg0.method517();
                this.field1584 = arg0.method515();
                this.field1585 = arg0.method515();
            } else if (var4 == 10) {
                this.field1582 = arg0.method522();
            } else if (var4 == 2) {
                this.field1586 = true;
            } else if (var4 == 3) {
                this.field1587 = arg0.method520();
            } else if (var4 == 4) {
                this.field1588 = arg0.method520();
            } else if (var4 == 5) {
                this.field1589 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
