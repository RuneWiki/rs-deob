import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DMMTBJKZ")
public class class12 {

    @OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "I")
    private int field708 = 850;

    @OriginalMember(owner = "client!DMMTBJKZ", name = "b", descriptor = "LDOUWNVSH;")
    public class13 field709 = new class13();

    @OriginalMember(owner = "client!DMMTBJKZ", name = "c", descriptor = "LDOUWNVSH;")
    private class13 field710;

    @OriginalMember(owner = "client!DMMTBJKZ", name = "<init>", descriptor = "(B)V")
    public class12(byte arg0) {
        this.field709.field712 = this.field709;
        this.field709.field713 = this.field709;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "(LDOUWNVSH;)V")
    public void method197(class13 arg0) {
        if (arg0.field713 != null) {
            arg0.method205();
        }
        arg0.field713 = this.field709.field713;
        arg0.field712 = this.field709;
        arg0.field713.field712 = arg0;
        arg0.field712.field713 = arg0;
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "(LDOUWNVSH;Z)V")
    public void method198(class13 arg0, boolean arg1) {
        if (arg0.field713 != null) {
            arg0.method205();
        }
        arg0.field713 = this.field709;
        if (!arg1) {
            arg0.field712 = this.field709.field712;
            arg0.field713.field712 = arg0;
            arg0.field712.field713 = arg0;
        }
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "()LDOUWNVSH;")
    public class13 method199() {
        class13 var1 = this.field709.field712;
        if (this.field709 == var1) {
            return null;
        } else {
            var1.method205();
            return var1;
        }
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "b", descriptor = "()LDOUWNVSH;")
    public class13 method200() {
        class13 var1 = this.field709.field712;
        if (this.field709 == var1) {
            this.field710 = null;
            return null;
        } else {
            this.field710 = var1.field712;
            return var1;
        }
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "(I)LDOUWNVSH;")
    public class13 method201(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            throw new NullPointerException();
        }
        class13 var2 = this.field709.field713;
        if (this.field709 == var2) {
            this.field710 = null;
            return null;
        } else {
            this.field710 = var2.field713;
            return var2;
        }
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "b", descriptor = "(I)LDOUWNVSH;")
    public class13 method202(int arg0) {
        class13 var2 = this.field710;
        int var3 = 68 / arg0;
        if (this.field709 == var2) {
            this.field710 = null;
            return null;
        } else {
            this.field710 = var2.field712;
            return var2;
        }
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "c", descriptor = "(I)LDOUWNVSH;")
    public class13 method203(int arg0) {
        class13 var2 = this.field710;
        while (arg0 >= 0) {
            this.field708 = 204;
        }
        if (this.field709 == var2) {
            this.field710 = null;
            return null;
        } else {
            this.field710 = var2.field713;
            return var2;
        }
    }

    @OriginalMember(owner = "client!DMMTBJKZ", name = "c", descriptor = "()V")
    public void method204() {
        if (this.field709.field712 == this.field709) {
            return;
        }
        while (true) {
            class13 var1 = this.field709.field712;
            if (this.field709 == var1) {
                return;
            }
            var1.method205();
        }
    }
}
