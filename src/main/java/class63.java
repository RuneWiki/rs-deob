import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YDNMMDSW")
public class class63 {

    @OriginalMember(owner = "client!YDNMMDSW", name = "a", descriptor = "I")
    private int field1560 = -582;

    @OriginalMember(owner = "client!YDNMMDSW", name = "b", descriptor = "I")
    private int field1561 = 964;

    @OriginalMember(owner = "client!YDNMMDSW", name = "c", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!YDNMMDSW", name = "d", descriptor = "[LPXORWIXO;")
    private class45[] field1563;

    @OriginalMember(owner = "client!YDNMMDSW", name = "<init>", descriptor = "(II)V")
    public class63(int arg0, int arg1) {
        this.field1562 = arg1;
        this.field1563 = new class45[arg1];
        int var3 = 52 / arg0;
        for (int var4 = 0; var4 < arg1; var4++) {
            class45 var5 = this.field1563[var4] = new class45();
            var5.field1315 = var5;
            var5.field1316 = var5;
        }
    }

    @OriginalMember(owner = "client!YDNMMDSW", name = "a", descriptor = "(J)LPXORWIXO;")
    public class45 method567(long arg0) {
        class45 var3 = this.field1563[(int) (arg0 & (long) (this.field1562 - 1))];
        for (class45 var4 = var3.field1315; var4 != var3; var4 = var4.field1315) {
            if (var4.field1314 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!YDNMMDSW", name = "a", descriptor = "(JLPXORWIXO;Z)V")
    public void method568(long arg0, class45 arg1, boolean arg2) {
        if (arg1.field1316 != null) {
            arg1.method464();
        }
        class45 var5 = this.field1563[(int) (arg0 & (long) (this.field1562 - 1))];
        arg1.field1316 = var5.field1316;
        arg1.field1315 = var5;
        arg1.field1316.field1315 = arg1;
        arg1.field1315.field1316 = arg1;
        if (arg2) {
            arg1.field1314 = arg0;
        }
    }
}
