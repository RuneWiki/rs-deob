import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WGMBOAQO")
public class class65 {

    @OriginalMember(owner = "client!WGMBOAQO", name = "a", descriptor = "I")
    private int field1664 = 720;

    @OriginalMember(owner = "client!WGMBOAQO", name = "b", descriptor = "Z")
    private boolean field1665 = false;

    @OriginalMember(owner = "client!WGMBOAQO", name = "c", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!WGMBOAQO", name = "d", descriptor = "[LYNSWJIIM;")
    private class67[] field1667;

    @OriginalMember(owner = "client!WGMBOAQO", name = "<init>", descriptor = "(BI)V")
    public class65(byte arg0, int arg1) {
        this.field1666 = arg1;
        if (arg0 != 45) {
            this.field1665 = !this.field1665;
        }
        this.field1667 = new class67[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class67 var4 = this.field1667[var3] = new class67();
            var4.field1686 = var4;
            var4.field1687 = var4;
        }
    }

    @OriginalMember(owner = "client!WGMBOAQO", name = "a", descriptor = "(J)LYNSWJIIM;")
    public class67 method586(long arg0) {
        class67 var3 = this.field1667[(int) (arg0 & (long) (this.field1666 - 1))];
        for (class67 var4 = var3.field1686; var4 != var3; var4 = var4.field1686) {
            if (var4.field1685 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!WGMBOAQO", name = "a", descriptor = "(JBLYNSWJIIM;)V")
    public void method587(long arg0, byte arg1, class67 arg2) {
        if (arg1 == 3) {
            boolean var5 = false;
        } else {
            this.field1664 = -157;
        }
        if (arg2.field1687 != null) {
            arg2.method588();
        }
        class67 var6 = this.field1667[(int) (arg0 & (long) (this.field1666 - 1))];
        arg2.field1687 = var6.field1687;
        arg2.field1686 = var6;
        arg2.field1687.field1686 = arg2;
        arg2.field1686.field1687 = arg2;
        arg2.field1685 = arg0;
    }
}
