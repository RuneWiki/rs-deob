import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LSQNLJTA")
public class class42 {

    @OriginalMember(owner = "LSQNLJTA", name = "a", descriptor = "Z")
    private boolean field1074 = false;

    @OriginalMember(owner = "LSQNLJTA", name = "b", descriptor = "Z")
    private boolean field1075 = false;

    @OriginalMember(owner = "LSQNLJTA", name = "c", descriptor = "I")
    private int field1076 = -7889;

    @OriginalMember(owner = "LSQNLJTA", name = "f", descriptor = "LUXRJCYSS;")
    private class60 field1079 = new class60();

    @OriginalMember(owner = "LSQNLJTA", name = "j", descriptor = "LBGEXEDZG;")
    private class3 field1083 = new class3((byte) 3);

    @OriginalMember(owner = "LSQNLJTA", name = "g", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "LSQNLJTA", name = "h", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "LSQNLJTA", name = "i", descriptor = "LLJCRDSKE;")
    private class38 field1082;

    @OriginalMember(owner = "LSQNLJTA", name = "d", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "LSQNLJTA", name = "e", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "LSQNLJTA", name = "<init>", descriptor = "(IB)V")
    public class42(int arg0, byte arg1) {
        this.field1080 = arg0;
        this.field1081 = arg0;
        this.field1082 = new class38(1024, this.field1074);
        if (arg1 != 17) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "LSQNLJTA", name = "a", descriptor = "(J)LUXRJCYSS;")
    public class60 method369(long arg0) {
        class60 var3 = (class60) this.field1082.method366(arg0);
        if (var3 == null) {
            this.field1077++;
        } else {
            this.field1083.method4(var3);
            this.field1078++;
        }
        return var3;
    }

    @OriginalMember(owner = "LSQNLJTA", name = "a", descriptor = "(LUXRJCYSS;IJ)V")
    public void method370(class60 arg0, int arg1, long arg2) {
        if (arg1 != 0) {
            this.field1075 = !this.field1075;
        }
        if (this.field1081 == 0) {
            class60 var5 = this.field1083.method5();
            var5.method582();
            var5.method564();
            if (this.field1079 == var5) {
                class60 var6 = this.field1083.method5();
                var6.method582();
                var6.method564();
            }
        } else {
            this.field1081--;
        }
        this.field1082.method367((byte) 1, arg0, arg2);
        this.field1083.method4(arg0);
        if (class67.field1668) {
        }
    }

    @OriginalMember(owner = "LSQNLJTA", name = "a", descriptor = "()V")
    public void method371() {
        while (true) {
            class60 var1 = this.field1083.method5();
            if (var1 == null) {
                this.field1081 = this.field1080;
                return;
            }
            var1.method582();
            var1.method564();
        }
    }
}
