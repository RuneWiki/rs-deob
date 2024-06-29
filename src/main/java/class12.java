import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GQWQHTHS")
public class class12 {

    @OriginalMember(owner = "client!GQWQHTHS", name = "h", descriptor = "Z")
    public boolean field628 = false;

    @OriginalMember(owner = "client!GQWQHTHS", name = "i", descriptor = "I")
    public int field629 = -1;

    @OriginalMember(owner = "client!GQWQHTHS", name = "k", descriptor = "Z")
    public boolean field631 = true;

    @OriginalMember(owner = "client!GQWQHTHS", name = "a", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!GQWQHTHS", name = "b", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!GQWQHTHS", name = "e", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!GQWQHTHS", name = "f", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!GQWQHTHS", name = "g", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!GQWQHTHS", name = "j", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!GQWQHTHS", name = "d", descriptor = "Ljava/lang/String;")
    public String field624;

    @OriginalMember(owner = "client!GQWQHTHS", name = "c", descriptor = "[LGQWQHTHS;")
    public static class12[] field623;

    @OriginalMember(owner = "client!GQWQHTHS", name = "a", descriptor = "(LWEMOPWVJ;I)V")
    public static void method186(class62 arg0, int arg1) {
        class52 var2 = new class52(arg0.method559("varbit.dat", null), true);
        field622 = var2.method463();
        if (arg1 != 24414) {
            return;
        }
        if (field623 == null) {
            field623 = new class12[field622];
        }
        for (int var3 = 0; var3 < field622; var3++) {
            if (field623[var3] == null) {
                field623[var3] = new class12();
            }
            field623[var3].method187(var3, false, var2);
            if (field623[var3].field628) {
                class24.field898[field623[var3].field625].field910 = true;
            }
        }
        if (var2.field1433.length != var2.field1434) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!GQWQHTHS", name = "a", descriptor = "(IZLSVWJKJVI;)V")
    public void method187(int arg0, boolean arg1, class52 arg2) {
        if (arg1) {
            this.field621 = -208;
        }
        while (true) {
            int var4 = arg2.method461();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field625 = arg2.method463();
                this.field626 = arg2.method461();
                this.field627 = arg2.method461();
            } else if (var4 == 10) {
                this.field624 = arg2.method468();
            } else if (var4 == 2) {
                this.field628 = true;
            } else if (var4 == 3) {
                this.field629 = arg2.method466();
            } else if (var4 == 4) {
                this.field630 = arg2.method466();
            } else if (var4 == 5) {
                this.field631 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
