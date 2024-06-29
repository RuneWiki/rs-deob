import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GUGSPPMO")
public class class18 {

    @OriginalMember(owner = "client!GUGSPPMO", name = "a", descriptor = "I")
    private int field698 = 240;

    @OriginalMember(owner = "client!GUGSPPMO", name = "b", descriptor = "Z")
    private boolean field699 = true;

    @OriginalMember(owner = "client!GUGSPPMO", name = "c", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!GUGSPPMO", name = "d", descriptor = "[LQEPVMESX;")
    private class41[] field701;

    @OriginalMember(owner = "client!GUGSPPMO", name = "<init>", descriptor = "(II)V")
    public class18(int arg0, int arg1) {
        this.field700 = arg0;
        if (arg1 < 1 || arg1 > 1) {
            this.field699 = !this.field699;
        }
        this.field701 = new class41[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class41 var4 = this.field701[var3] = new class41();
            var4.field1193 = var4;
            var4.field1194 = var4;
        }
    }

    @OriginalMember(owner = "client!GUGSPPMO", name = "a", descriptor = "(J)LQEPVMESX;")
    public class41 method292(long arg0) {
        class41 var3 = this.field701[(int) (arg0 & (long) (this.field700 - 1))];
        for (class41 var4 = var3.field1193; var4 != var3; var4 = var4.field1193) {
            if (var4.field1192 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!GUGSPPMO", name = "a", descriptor = "(LQEPVMESX;JI)V")
    public void method293(class41 arg0, long arg1, int arg2) {
        if (arg0.field1194 != null) {
            arg0.method418();
        }
        class41 var5 = this.field701[(int) (arg1 & (long) (this.field700 - 1))];
        arg0.field1194 = var5.field1194;
        arg0.field1193 = var5;
        arg0.field1194.field1193 = arg0;
        arg0.field1193.field1194 = arg0;
        arg0.field1192 = arg1;
        if (arg2 <= 0) {
            this.field698 = 321;
        }
    }
}
