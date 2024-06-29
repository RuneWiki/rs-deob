import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ULDYKUPK")
public class class57 {

    @OriginalMember(owner = "client!ULDYKUPK", name = "e", descriptor = "LUCIRENXU;")
    private class55 field1341 = new class55();

    @OriginalMember(owner = "client!ULDYKUPK", name = "i", descriptor = "LBGTUCWCI;")
    private class3 field1345 = new class3(41416);

    @OriginalMember(owner = "client!ULDYKUPK", name = "f", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!ULDYKUPK", name = "b", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!ULDYKUPK", name = "g", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!ULDYKUPK", name = "h", descriptor = "LMPNPHMKJ;")
    private class31 field1344;

    @OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client!ULDYKUPK", name = "c", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!ULDYKUPK", name = "d", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!ULDYKUPK", name = "<init>", descriptor = "(II)V")
    public class57(int arg0, int arg1) {
        this.field1342 = arg0;
        if (arg1 != 0) {
            this.field1338 = 374;
        }
        this.field1343 = arg0;
        this.field1344 = new class31(0, 1024);
    }

    @OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "(J)LUCIRENXU;")
    public class55 method509(long arg0) {
        class55 var3 = (class55) this.field1344.method264(arg0);
        if (var3 == null) {
            this.field1339++;
        } else {
            this.field1345.method13(var3);
            this.field1340++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "(JILUCIRENXU;)V")
    public void method510(long arg0, int arg1, class55 arg2) {
        if (arg1 != 0) {
            this.field1337 = 473;
        }
        if (this.field1343 == 0) {
            class55 var5 = this.field1345.method14();
            var5.method326();
            var5.method456();
            if (this.field1341 == var5) {
                class55 var6 = this.field1345.method14();
                var6.method326();
                var6.method456();
            }
        } else {
            this.field1343--;
        }
        this.field1344.method265(arg0, arg2, 850);
        this.field1345.method13(arg2);
        if (class35.field1047) {
        }
    }

    @OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "()V")
    public void method511() {
        while (true) {
            class55 var1 = this.field1345.method14();
            if (var1 == null) {
                this.field1343 = this.field1342;
                return;
            }
            var1.method326();
            var1.method456();
        }
    }
}
