import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QASTZCLF")
public class class47 {

    @OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "I")
    private int field1409 = 45;

    @OriginalMember(owner = "client!QASTZCLF", name = "d", descriptor = "LIVMCUDWL;")
    private class26 field1412 = new class26();

    @OriginalMember(owner = "client!QASTZCLF", name = "h", descriptor = "LQHOLWOGP;")
    private class48 field1416 = new class48((byte) -67);

    @OriginalMember(owner = "client!QASTZCLF", name = "e", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!QASTZCLF", name = "f", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!QASTZCLF", name = "g", descriptor = "LCABSPGMS;")
    private class6 field1415;

    @OriginalMember(owner = "client!QASTZCLF", name = "b", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!QASTZCLF", name = "c", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!QASTZCLF", name = "<init>", descriptor = "(IZ)V")
    public class47(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1413 = arg0;
        this.field1414 = arg0;
        this.field1415 = new class6(1024, 0);
    }

    @OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "(J)LIVMCUDWL;")
    public class26 method438(long arg0) {
        class26 var3 = (class26) this.field1415.method45(arg0);
        if (var3 == null) {
            this.field1410++;
        } else {
            this.field1416.method441(var3);
            this.field1411++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "(LIVMCUDWL;JI)V")
    public void method439(class26 arg0, long arg1, int arg2) {
        if (this.field1414 == 0) {
            class26 var5 = this.field1416.method442();
            var5.method602();
            var5.method282();
            if (this.field1412 == var5) {
                class26 var6 = this.field1416.method442();
                var6.method602();
                var6.method282();
            }
        } else {
            this.field1414--;
        }
        this.field1415.method46(arg0, arg1, 0);
        this.field1416.method441(arg0);
        if (arg2 != -27210) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        } else if (class71.field1729) {
        }
    }

    @OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "()V")
    public void method440() {
        while (true) {
            class26 var1 = this.field1416.method442();
            if (var1 == null) {
                this.field1414 = this.field1413;
                return;
            }
            var1.method602();
            var1.method282();
        }
    }
}
