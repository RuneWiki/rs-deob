import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XWMRKIHQ")
public class class60 {

    @OriginalMember(owner = "XWMRKIHQ", name = "a", descriptor = "I")
    private int field1614 = 3;

    @OriginalMember(owner = "XWMRKIHQ", name = "b", descriptor = "Z")
    private boolean field1615 = true;

    @OriginalMember(owner = "XWMRKIHQ", name = "c", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "XWMRKIHQ", name = "d", descriptor = "[LMRGQMKFG;")
    private class34[] field1617;

    @OriginalMember(owner = "XWMRKIHQ", name = "<init>", descriptor = "(II)V")
    public class60(int arg0, int arg1) {
        this.field1616 = arg0;
        this.field1617 = new class34[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class34 var4 = this.field1617[var3] = new class34();
            var4.field1087 = var4;
            var4.field1088 = var4;
        }
        if (arg1 != 38166) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "XWMRKIHQ", name = "a", descriptor = "(J)LMRGQMKFG;")
    public class34 method554(long arg0) {
        class34 var3 = this.field1617[(int) (arg0 & (long) (this.field1616 - 1))];
        for (class34 var4 = var3.field1087; var4 != var3; var4 = var4.field1087) {
            if (var4.field1086 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "XWMRKIHQ", name = "a", descriptor = "(BLMRGQMKFG;J)V")
    public void method555(byte arg0, class34 arg1, long arg2) {
        if (arg1.field1088 != null) {
            arg1.method336();
        }
        class34 var5 = this.field1617[(int) (arg2 & (long) (this.field1616 - 1))];
        arg1.field1088 = var5.field1088;
        arg1.field1087 = var5;
        arg1.field1088.field1087 = arg1;
        arg1.field1087.field1088 = arg1;
        if (arg0 != 5) {
            this.field1615 = !this.field1615;
        }
        arg1.field1086 = arg2;
    }
}
