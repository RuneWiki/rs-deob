import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CYAEJBRE")
public class class9 {

    @OriginalMember(owner = "client!CYAEJBRE", name = "a", descriptor = "B")
    private byte field622 = 2;

    @OriginalMember(owner = "client!CYAEJBRE", name = "b", descriptor = "Z")
    private boolean field623 = false;

    @OriginalMember(owner = "client!CYAEJBRE", name = "j", descriptor = "Z")
    public boolean field631 = false;

    @OriginalMember(owner = "client!CYAEJBRE", name = "k", descriptor = "I")
    public int field632 = -1;

    @OriginalMember(owner = "client!CYAEJBRE", name = "c", descriptor = "I")
    private static int field624 = -27735;

    @OriginalMember(owner = "client!CYAEJBRE", name = "d", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!CYAEJBRE", name = "g", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!CYAEJBRE", name = "h", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!CYAEJBRE", name = "i", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!CYAEJBRE", name = "l", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!CYAEJBRE", name = "f", descriptor = "Ljava/lang/String;")
    public String field627;

    @OriginalMember(owner = "client!CYAEJBRE", name = "e", descriptor = "[LCYAEJBRE;")
    public static class9[] field626;

    @OriginalMember(owner = "client!CYAEJBRE", name = "a", descriptor = "(LCXFTMSCH;B)V")
    public static void method177(class8 arg0, byte arg1) {
        class33 var2 = new class33(true, arg0.method176("varbit.dat", null));
        field625 = var2.method327();
        if (arg1 != 51) {
            field624 = 324;
        }
        if (field626 == null) {
            field626 = new class9[field625];
        }
        for (int var3 = 0; var3 < field625; var3++) {
            if (field626[var3] == null) {
                field626[var3] = new class9();
            }
            field626[var3].method178((byte) 2, var3, var2);
            if (field626[var3].field631) {
                class4.field551[field626[var3].field628].field563 = true;
            }
        }
        if (var2.field944.length != var2.field945) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!CYAEJBRE", name = "a", descriptor = "(BILMQZHAILV;)V")
    public void method178(byte arg0, int arg1, class33 arg2) {
        if (this.field622 != arg0) {
            this.field623 = !this.field623;
        }
        while (true) {
            int var4 = arg2.method325();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field628 = arg2.method327();
                this.field629 = arg2.method325();
                this.field630 = arg2.method325();
            } else if (var4 == 10) {
                this.field627 = arg2.method332();
            } else if (var4 == 2) {
                this.field631 = true;
            } else if (var4 == 3) {
                this.field632 = arg2.method330();
            } else if (var4 == 4) {
                this.field633 = arg2.method330();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
