import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BVBAURNI")
public class class8 {

    @OriginalMember(owner = "BVBAURNI", name = "a", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "BVBAURNI", name = "b", descriptor = "[LICYTWAKR;")
    private class29[] field119;

    @OriginalMember(owner = "BVBAURNI", name = "<init>", descriptor = "(BI)V")
    public class8(byte arg0, int arg1) {
        this.field118 = arg1;
        if (arg0 != -87) {
            throw new NullPointerException();
        }
        this.field119 = new class29[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class29 var4 = this.field119[var3] = new class29();
            var4.field876 = var4;
            var4.field877 = var4;
        }
    }

    @OriginalMember(owner = "BVBAURNI", name = "a", descriptor = "(J)LICYTWAKR;")
    public class29 method60(long arg0) {
        class29 var3 = this.field119[(int) (arg0 & (long) (this.field118 - 1))];
        for (class29 var4 = var3.field876; var4 != var3; var4 = var4.field876) {
            if (var4.field875 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "BVBAURNI", name = "a", descriptor = "(LICYTWAKR;JZ)V")
    public void method61(class29 arg0, long arg1, boolean arg2) {
        if (arg0.field877 != null) {
            arg0.method290();
        }
        class29 var5 = this.field119[(int) (arg1 & (long) (this.field118 - 1))];
        arg0.field877 = var5.field877;
        arg0.field876 = var5;
        arg0.field877.field876 = arg0;
        arg0.field876.field877 = arg0;
        if (arg2) {
            arg0.field875 = arg1;
        }
    }
}
