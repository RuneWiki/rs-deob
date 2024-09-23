import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EWLVMFRK")
public class class15 {

    @OriginalMember(owner = "EWLVMFRK", name = "a", descriptor = "I")
    private int field676 = 22736;

    @OriginalMember(owner = "EWLVMFRK", name = "b", descriptor = "I")
    private int field677 = 303;

    @OriginalMember(owner = "EWLVMFRK", name = "c", descriptor = "Z")
    private boolean field678 = false;

    @OriginalMember(owner = "EWLVMFRK", name = "d", descriptor = "Z")
    private boolean field679 = false;

    @OriginalMember(owner = "EWLVMFRK", name = "e", descriptor = "LOZVKRYKO;")
    public class47 field680 = new class47();

    @OriginalMember(owner = "EWLVMFRK", name = "f", descriptor = "LOZVKRYKO;")
    private class47 field681;

    @OriginalMember(owner = "EWLVMFRK", name = "<init>", descriptor = "(Z)V")
    public class15(boolean arg0) {
        this.field680.field1216 = this.field680;
        this.field680.field1217 = this.field680;
        if (!arg0) {
            this.field676 = -233;
        }
    }

    @OriginalMember(owner = "EWLVMFRK", name = "a", descriptor = "(LOZVKRYKO;)V")
    public void method198(class47 arg0) {
        if (arg0.field1217 != null) {
            arg0.method396();
        }
        arg0.field1217 = this.field680.field1217;
        arg0.field1216 = this.field680;
        arg0.field1217.field1216 = arg0;
        arg0.field1216.field1217 = arg0;
    }

    @OriginalMember(owner = "EWLVMFRK", name = "a", descriptor = "(ILOZVKRYKO;)V")
    public void method199(int arg0, class47 arg1) {
        if (arg1.field1217 != null) {
            arg1.method396();
        }
        arg1.field1217 = this.field680;
        int var3 = 79 / arg0;
        arg1.field1216 = this.field680.field1216;
        arg1.field1217.field1216 = arg1;
        arg1.field1216.field1217 = arg1;
    }

    @OriginalMember(owner = "EWLVMFRK", name = "a", descriptor = "()LOZVKRYKO;")
    public class47 method200() {
        class47 var1 = this.field680.field1216;
        if (this.field680 == var1) {
            return null;
        } else {
            var1.method396();
            return var1;
        }
    }

    @OriginalMember(owner = "EWLVMFRK", name = "b", descriptor = "()LOZVKRYKO;")
    public class47 method201() {
        class47 var1 = this.field680.field1216;
        if (this.field680 == var1) {
            this.field681 = null;
            return null;
        } else {
            this.field681 = var1.field1216;
            return var1;
        }
    }

    @OriginalMember(owner = "EWLVMFRK", name = "a", descriptor = "(I)LOZVKRYKO;")
    public class47 method202(int arg0) {
        class47 var2 = this.field680.field1217;
        if (this.field680 == var2) {
            this.field681 = null;
            return null;
        }
        this.field681 = var2.field1217;
        if (arg0 != -2258) {
            this.field678 = !this.field678;
        }
        return var2;
    }

    @OriginalMember(owner = "EWLVMFRK", name = "a", descriptor = "(B)LOZVKRYKO;")
    public class47 method203(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        class47 var2 = this.field681;
        if (this.field680 == var2) {
            this.field681 = null;
            return null;
        } else {
            this.field681 = var2.field1216;
            return var2;
        }
    }

    @OriginalMember(owner = "EWLVMFRK", name = "b", descriptor = "(B)LOZVKRYKO;")
    public class47 method204(byte arg0) {
        class47 var2 = this.field681;
        if (this.field680 == var2) {
            this.field681 = null;
            return null;
        }
        this.field681 = var2.field1217;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "EWLVMFRK", name = "c", descriptor = "()V")
    public void method205() {
        if (this.field680.field1216 == this.field680) {
            return;
        }
        while (true) {
            class47 var1 = this.field680.field1216;
            if (this.field680 == var1) {
                return;
            }
            var1.method396();
        }
    }
}
