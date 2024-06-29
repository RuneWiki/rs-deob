import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WCVCMGLX")
public class class62 {

    @OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "I")
    private int field1559 = -34531;

    @OriginalMember(owner = "client!WCVCMGLX", name = "b", descriptor = "Z")
    private boolean field1560 = false;

    @OriginalMember(owner = "client!WCVCMGLX", name = "c", descriptor = "Z")
    private boolean field1561 = true;

    @OriginalMember(owner = "client!WCVCMGLX", name = "d", descriptor = "B")
    private byte field1562 = -48;

    @OriginalMember(owner = "client!WCVCMGLX", name = "e", descriptor = "I")
    private int field1563 = -39880;

    @OriginalMember(owner = "client!WCVCMGLX", name = "f", descriptor = "LABHGPSRU;")
    public class1 field1564 = new class1();

    @OriginalMember(owner = "client!WCVCMGLX", name = "g", descriptor = "LABHGPSRU;")
    private class1 field1565;

    @OriginalMember(owner = "client!WCVCMGLX", name = "<init>", descriptor = "(I)V")
    public class62(int arg0) {
        this.field1564.field2 = this.field1564;
        while (arg0 >= 0) {
            this.field1563 = 0;
        }
        this.field1564.field3 = this.field1564;
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(LABHGPSRU;)V")
    public void method564(class1 arg0) {
        if (arg0.field3 != null) {
            arg0.method1();
        }
        arg0.field3 = this.field1564.field3;
        arg0.field2 = this.field1564;
        arg0.field3.field2 = arg0;
        arg0.field2.field3 = arg0;
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(LABHGPSRU;I)V")
    public void method565(class1 arg0, int arg1) {
        if (arg0.field3 != null) {
            arg0.method1();
        }
        arg0.field3 = this.field1564;
        arg0.field2 = this.field1564.field2;
        arg0.field3.field2 = arg0;
        arg0.field2.field3 = arg0;
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "()LABHGPSRU;")
    public class1 method566() {
        class1 var1 = this.field1564.field2;
        if (this.field1564 == var1) {
            return null;
        } else {
            var1.method1();
            return var1;
        }
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "b", descriptor = "()LABHGPSRU;")
    public class1 method567() {
        class1 var1 = this.field1564.field2;
        if (this.field1564 == var1) {
            this.field1565 = null;
            return null;
        } else {
            this.field1565 = var1.field2;
            return var1;
        }
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(B)LABHGPSRU;")
    public class1 method568(byte arg0) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        class1 var2 = this.field1564.field3;
        if (this.field1564 == var2) {
            this.field1565 = null;
            return null;
        } else {
            this.field1565 = var2.field3;
            return var2;
        }
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(Z)LABHGPSRU;")
    public class1 method569(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        class1 var2 = this.field1565;
        if (this.field1564 == var2) {
            this.field1565 = null;
            return null;
        } else {
            this.field1565 = var2.field2;
            return var2;
        }
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(I)LABHGPSRU;")
    public class1 method570(int arg0) {
        if (arg0 != 36701) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class1 var3 = this.field1565;
        if (this.field1564 == var3) {
            this.field1565 = null;
            return null;
        } else {
            this.field1565 = var3.field3;
            return var3;
        }
    }

    @OriginalMember(owner = "client!WCVCMGLX", name = "c", descriptor = "()V")
    public void method571() {
        if (this.field1564.field2 == this.field1564) {
            return;
        }
        while (true) {
            class1 var1 = this.field1564.field2;
            if (this.field1564 == var1) {
                return;
            }
            var1.method1();
        }
    }
}
