import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DKRLEWQI")
public class class11 {

    @OriginalMember(owner = "DKRLEWQI", name = "a", descriptor = "I")
    private int field622 = 666;

    @OriginalMember(owner = "DKRLEWQI", name = "b", descriptor = "I")
    private int field623 = -884;

    @OriginalMember(owner = "DKRLEWQI", name = "c", descriptor = "Z")
    private boolean field624 = false;

    @OriginalMember(owner = "DKRLEWQI", name = "d", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "DKRLEWQI", name = "e", descriptor = "[LOZVKRYKO;")
    private class47[] field626;

    @OriginalMember(owner = "DKRLEWQI", name = "<init>", descriptor = "(ZI)V")
    public class11(boolean arg0, int arg1) {
        if (arg0) {
            this.field622 = -350;
        }
        this.field625 = arg1;
        this.field626 = new class47[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class47 var4 = this.field626[var3] = new class47();
            var4.field1216 = var4;
            var4.field1217 = var4;
        }
    }

    @OriginalMember(owner = "DKRLEWQI", name = "a", descriptor = "(J)LOZVKRYKO;")
    public class47 method168(long arg0) {
        class47 var3 = this.field626[(int) (arg0 & (long) (this.field625 - 1))];
        for (class47 var4 = var3.field1216; var4 != var3; var4 = var4.field1216) {
            if (var4.field1215 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "DKRLEWQI", name = "a", descriptor = "(IJLOZVKRYKO;)V")
    public void method169(int arg0, long arg1, class47 arg2) {
        if (arg2.field1217 != null) {
            arg2.method396();
        }
        class47 var5 = this.field626[(int) (arg1 & (long) (this.field625 - 1))];
        arg2.field1217 = var5.field1217;
        if (arg0 == 0) {
            arg2.field1216 = var5;
            arg2.field1217.field1216 = arg2;
            arg2.field1216.field1217 = arg2;
            arg2.field1215 = arg1;
        }
    }
}
