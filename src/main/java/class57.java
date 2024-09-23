import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VYBZTNTY")
public class class57 {

    @OriginalMember(owner = "VYBZTNTY", name = "a", descriptor = "B")
    private byte field1553 = 1;

    @OriginalMember(owner = "VYBZTNTY", name = "b", descriptor = "B")
    private byte field1554 = 19;

    @OriginalMember(owner = "VYBZTNTY", name = "c", descriptor = "Z")
    private boolean field1555 = true;

    @OriginalMember(owner = "VYBZTNTY", name = "d", descriptor = "I")
    private int field1556 = -261;

    @OriginalMember(owner = "VYBZTNTY", name = "e", descriptor = "LCDEGFOQA;")
    public class4 field1557 = new class4();

    @OriginalMember(owner = "VYBZTNTY", name = "f", descriptor = "LCDEGFOQA;")
    private class4 field1558;

    @OriginalMember(owner = "VYBZTNTY", name = "<init>", descriptor = "(B)V")
    public class57(byte arg0) {
        this.field1557.field55 = this.field1557;
        if (arg0 != 55) {
            throw new NullPointerException();
        }
        this.field1557.field56 = this.field1557;
    }

    @OriginalMember(owner = "VYBZTNTY", name = "a", descriptor = "(LCDEGFOQA;)V")
    public void method516(class4 arg0) {
        if (arg0.field56 != null) {
            arg0.method19();
        }
        arg0.field56 = this.field1557.field56;
        arg0.field55 = this.field1557;
        arg0.field56.field55 = arg0;
        arg0.field55.field56 = arg0;
    }

    @OriginalMember(owner = "VYBZTNTY", name = "a", descriptor = "(LCDEGFOQA;B)V")
    public void method517(class4 arg0, byte arg1) {
        if (arg0.field56 != null) {
            arg0.method19();
        }
        arg0.field56 = this.field1557;
        arg0.field55 = this.field1557.field55;
        arg0.field56.field55 = arg0;
        arg0.field55.field56 = arg0;
        if (arg1 == -3 && class4.field57) {
        }
    }

    @OriginalMember(owner = "VYBZTNTY", name = "a", descriptor = "()LCDEGFOQA;")
    public class4 method518() {
        class4 var1 = this.field1557.field55;
        if (this.field1557 == var1) {
            return null;
        } else {
            var1.method19();
            return var1;
        }
    }

    @OriginalMember(owner = "VYBZTNTY", name = "b", descriptor = "()LCDEGFOQA;")
    public class4 method519() {
        class4 var1 = this.field1557.field55;
        if (this.field1557 == var1) {
            this.field1558 = null;
            return null;
        } else {
            this.field1558 = var1.field55;
            return var1;
        }
    }

    @OriginalMember(owner = "VYBZTNTY", name = "a", descriptor = "(I)LCDEGFOQA;")
    public class4 method520(int arg0) {
        class4 var2 = this.field1557.field56;
        if (arg0 < 5 || arg0 > 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1557 == var2) {
            this.field1558 = null;
            return null;
        } else {
            this.field1558 = var2.field56;
            return var2;
        }
    }

    @OriginalMember(owner = "VYBZTNTY", name = "b", descriptor = "(I)LCDEGFOQA;")
    public class4 method521(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class4 var3 = this.field1558;
        if (this.field1557 == var3) {
            this.field1558 = null;
            return null;
        } else {
            this.field1558 = var3.field55;
            return var3;
        }
    }

    @OriginalMember(owner = "VYBZTNTY", name = "a", descriptor = "(B)LCDEGFOQA;")
    public class4 method522(byte arg0) {
        class4 var2 = this.field1558;
        if (arg0 != 109) {
            throw new NullPointerException();
        } else if (this.field1557 == var2) {
            this.field1558 = null;
            return null;
        } else {
            this.field1558 = var2.field56;
            return var2;
        }
    }

    @OriginalMember(owner = "VYBZTNTY", name = "c", descriptor = "()V")
    public void method523() {
        if (this.field1557.field55 == this.field1557) {
            return;
        }
        while (true) {
            class4 var1 = this.field1557.field55;
            if (this.field1557 == var1) {
                return;
            }
            var1.method19();
        }
    }
}
