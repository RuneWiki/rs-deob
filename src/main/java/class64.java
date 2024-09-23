import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WEZGVHTE")
public class class64 {

    @OriginalMember(owner = "WEZGVHTE", name = "a", descriptor = "I")
    private int field1619 = 624;

    @OriginalMember(owner = "WEZGVHTE", name = "b", descriptor = "Z")
    private boolean field1620 = false;

    @OriginalMember(owner = "WEZGVHTE", name = "c", descriptor = "I")
    private int field1621 = -768;

    @OriginalMember(owner = "WEZGVHTE", name = "d", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "WEZGVHTE", name = "e", descriptor = "[LAIZKCREI;")
    private class1[] field1623;

    @OriginalMember(owner = "WEZGVHTE", name = "<init>", descriptor = "(II)V")
    public class64(int arg0, int arg1) {
        if (arg0 < 4 || arg0 > 4) {
            this.field1621 = 93;
        }
        this.field1622 = arg1;
        this.field1623 = new class1[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class1 var4 = this.field1623[var3] = new class1();
            var4.field2 = var4;
            var4.field3 = var4;
        }
    }

    @OriginalMember(owner = "WEZGVHTE", name = "a", descriptor = "(J)LAIZKCREI;")
    public class1 method586(long arg0) {
        class1 var3 = this.field1623[(int) (arg0 & (long) (this.field1622 - 1))];
        for (class1 var4 = var3.field2; var4 != var3; var4 = var4.field2) {
            if (var4.field1 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "WEZGVHTE", name = "a", descriptor = "(ILAIZKCREI;J)V")
    public void method587(int arg0, class1 arg1, long arg2) {
        int var5 = 67 / arg0;
        if (arg1.field3 != null) {
            arg1.method1();
        }
        class1 var6 = this.field1623[(int) (arg2 & (long) (this.field1622 - 1))];
        arg1.field3 = var6.field3;
        arg1.field2 = var6;
        arg1.field3.field2 = arg1;
        arg1.field2.field3 = arg1;
        arg1.field1 = arg2;
    }
}
