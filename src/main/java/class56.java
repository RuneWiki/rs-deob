import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WIZYUELH")
public class class56 {

    @OriginalMember(owner = "WIZYUELH", name = "a", descriptor = "Z")
    private boolean field1482 = true;

    @OriginalMember(owner = "WIZYUELH", name = "b", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "WIZYUELH", name = "c", descriptor = "[LCSUKQTYW;")
    private class8[] field1484;

    @OriginalMember(owner = "WIZYUELH", name = "<init>", descriptor = "(II)V")
    public class56(int arg0, int arg1) {
        this.field1483 = arg1;
        if (arg0 != 8172) {
            this.field1482 = !this.field1482;
        }
        this.field1484 = new class8[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class8 var4 = this.field1484[var3] = new class8();
            var4.field615 = var4;
            var4.field616 = var4;
        }
    }

    @OriginalMember(owner = "WIZYUELH", name = "a", descriptor = "(J)LCSUKQTYW;")
    public class8 method523(long arg0) {
        class8 var3 = this.field1484[(int) (arg0 & (long) (this.field1483 - 1))];
        for (class8 var4 = var3.field615; var4 != var3; var4 = var4.field615) {
            if (var4.field614 == arg0) {
                return var4;
            }
        }
        if (class8.field617) {
        }
        return null;
    }

    @OriginalMember(owner = "WIZYUELH", name = "a", descriptor = "(LCSUKQTYW;JI)V")
    public void method524(class8 arg0, long arg1, int arg2) {
        if (arg0.field616 != null) {
            arg0.method221();
        }
        class8 var5 = this.field1484[(int) (arg1 & (long) (this.field1483 - 1))];
        if (arg2 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg0.field616 = var5.field616;
        arg0.field615 = var5;
        arg0.field616.field615 = arg0;
        arg0.field615.field616 = arg0;
        arg0.field614 = arg1;
    }
}
