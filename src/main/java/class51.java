import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RPWOWYDL")
public class class51 {

    @OriginalMember(owner = "RPWOWYDL", name = "c", descriptor = "LNFNHZJTP;")
    private class36 field1296 = new class36();

    @OriginalMember(owner = "RPWOWYDL", name = "g", descriptor = "LQUHNUHWS;")
    private class49 field1300 = new class49(-160);

    @OriginalMember(owner = "RPWOWYDL", name = "d", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "RPWOWYDL", name = "e", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "RPWOWYDL", name = "f", descriptor = "LEKGZTZOT;")
    private class12 field1299;

    @OriginalMember(owner = "RPWOWYDL", name = "a", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "RPWOWYDL", name = "b", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "RPWOWYDL", name = "<init>", descriptor = "(II)V")
    public class51(int arg0, int arg1) {
        this.field1297 = arg1;
        this.field1298 = arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1299 = new class12(-971, 1024);
    }

    @OriginalMember(owner = "RPWOWYDL", name = "a", descriptor = "(J)LNFNHZJTP;")
    public class36 method401(long arg0) {
        class36 var3 = (class36) this.field1299.method227(arg0);
        if (var3 == null) {
            this.field1294++;
        } else {
            this.field1300.method393(var3);
            this.field1295++;
        }
        return var3;
    }

    @OriginalMember(owner = "RPWOWYDL", name = "a", descriptor = "(BJLNFNHZJTP;)V")
    public void method402(byte arg0, long arg1, class36 arg2) {
        if (this.field1298 == 0) {
            class36 var5 = this.field1300.method394();
            var5.method1();
            var5.method348();
            if (this.field1296 == var5) {
                class36 var6 = this.field1300.method394();
                var6.method1();
                var6.method348();
            }
        } else {
            this.field1298--;
        }
        this.field1299.method228(arg2, arg1, -485);
        if (arg0 == 124) {
            this.field1300.method393(arg2);
        }
    }

    @OriginalMember(owner = "RPWOWYDL", name = "a", descriptor = "()V")
    public void method403() {
        while (true) {
            class36 var1 = this.field1300.method394();
            if (var1 == null) {
                this.field1298 = this.field1297;
                return;
            }
            var1.method1();
            var1.method348();
        }
    }
}
