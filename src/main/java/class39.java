import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LVXNVCAS")
public class class39 {

    @OriginalMember(owner = "LVXNVCAS", name = "a", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "LVXNVCAS", name = "b", descriptor = "[LFLQEGCUY;")
    private class15[] field1117;

    @OriginalMember(owner = "LVXNVCAS", name = "<init>", descriptor = "(ZI)V")
    public class39(boolean arg0, int arg1) {
        this.field1116 = arg1;
        this.field1117 = new class15[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class15 var4 = this.field1117[var3] = new class15();
            var4.field715 = var4;
            var4.field716 = var4;
        }
        if (!arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "LVXNVCAS", name = "a", descriptor = "(J)LFLQEGCUY;")
    public class15 method362(long arg0) {
        class15 var3 = this.field1117[(int) (arg0 & (long) (this.field1116 - 1))];
        for (class15 var4 = var3.field715; var4 != var3; var4 = var4.field715) {
            if (var4.field714 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "LVXNVCAS", name = "a", descriptor = "(IJLFLQEGCUY;)V")
    public void method363(int arg0, long arg1, class15 arg2) {
        if (arg2.field716 != null) {
            arg2.method195();
        }
        class15 var5 = this.field1117[(int) (arg1 & (long) (this.field1116 - 1))];
        arg2.field716 = var5.field716;
        arg2.field715 = var5;
        arg2.field716.field715 = arg2;
        if (arg0 < 3 || arg0 > 3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg2.field715.field716 = arg2;
        arg2.field714 = arg1;
    }
}
