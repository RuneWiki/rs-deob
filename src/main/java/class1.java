import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AAITTAMV")
public class class1 {

    @OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "I")
    private int field1 = -548;

    @OriginalMember(owner = "client!AAITTAMV", name = "b", descriptor = "I")
    private int field2 = 338;

    @OriginalMember(owner = "client!AAITTAMV", name = "c", descriptor = "Z")
    private boolean field3 = true;

    @OriginalMember(owner = "client!AAITTAMV", name = "d", descriptor = "B")
    private byte field4 = -113;

    @OriginalMember(owner = "client!AAITTAMV", name = "e", descriptor = "LEDVKOEOK;")
    public class9 field5 = new class9();

    @OriginalMember(owner = "client!AAITTAMV", name = "f", descriptor = "LEDVKOEOK;")
    private class9 field6;

    @OriginalMember(owner = "client!AAITTAMV", name = "<init>", descriptor = "(B)V")
    public class1(byte arg0) {
        this.field5.field571 = this.field5;
        this.field5.field572 = this.field5;
        if (this.field4 != arg0) {
            this.field1 = -84;
        }
    }

    @OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "(LEDVKOEOK;)V")
    public void method1(class9 arg0) {
        if (arg0.field572 != null) {
            arg0.method188();
        }
        arg0.field572 = this.field5.field572;
        arg0.field571 = this.field5;
        arg0.field572.field571 = arg0;
        arg0.field571.field572 = arg0;
    }

    @OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "()LEDVKOEOK;")
    public class9 method2() {
        class9 var1 = this.field5.field571;
        if (this.field5 == var1) {
            return null;
        } else {
            var1.method188();
            return var1;
        }
    }

    @OriginalMember(owner = "client!AAITTAMV", name = "b", descriptor = "()LEDVKOEOK;")
    public class9 method3() {
        class9 var1 = this.field5.field571;
        if (this.field5 == var1) {
            this.field6 = null;
            return null;
        } else {
            this.field6 = var1.field571;
            return var1;
        }
    }

    @OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "(Z)LEDVKOEOK;")
    public class9 method4(boolean arg0) {
        class9 var2 = this.field6;
        if (this.field5 == var2) {
            this.field6 = null;
            return null;
        }
        this.field6 = var2.field571;
        if (arg0) {
            this.field2 = 343;
        }
        return var2;
    }

    @OriginalMember(owner = "client!AAITTAMV", name = "c", descriptor = "()I")
    public int method5() {
        int var1 = 0;
        for (class9 var2 = this.field5.field571; var2 != this.field5; var2 = var2.field571) {
            var1++;
        }
        return var1;
    }
}
