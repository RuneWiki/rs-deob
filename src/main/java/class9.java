import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CLCMCMIN")
public class class9 {

    @OriginalMember(owner = "CLCMCMIN", name = "a", descriptor = "I")
    private int field85 = 344;

    @OriginalMember(owner = "CLCMCMIN", name = "b", descriptor = "I")
    private int field86 = 958;

    @OriginalMember(owner = "CLCMCMIN", name = "c", descriptor = "B")
    private byte field87 = 0;

    @OriginalMember(owner = "CLCMCMIN", name = "d", descriptor = "LXNCSKJMM;")
    public class67 field88 = new class67();

    @OriginalMember(owner = "CLCMCMIN", name = "e", descriptor = "LXNCSKJMM;")
    private class67 field89;

    @OriginalMember(owner = "CLCMCMIN", name = "<init>", descriptor = "(I)V")
    public class9(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field88.field1666 = this.field88;
        this.field88.field1667 = this.field88;
    }

    @OriginalMember(owner = "CLCMCMIN", name = "a", descriptor = "(LXNCSKJMM;)V")
    public void method68(class67 arg0) {
        if (arg0.field1667 != null) {
            arg0.method582();
        }
        arg0.field1667 = this.field88.field1667;
        arg0.field1666 = this.field88;
        arg0.field1667.field1666 = arg0;
        arg0.field1666.field1667 = arg0;
    }

    @OriginalMember(owner = "CLCMCMIN", name = "a", descriptor = "(ILXNCSKJMM;)V")
    public void method69(int arg0, class67 arg1) {
        if (arg1.field1667 != null) {
            arg1.method582();
        }
        arg1.field1667 = this.field88;
        arg1.field1666 = this.field88.field1666;
        arg1.field1667.field1666 = arg1;
        if (arg0 == -33985) {
            arg1.field1666.field1667 = arg1;
        }
    }

    @OriginalMember(owner = "CLCMCMIN", name = "a", descriptor = "()LXNCSKJMM;")
    public class67 method70() {
        class67 var1 = this.field88.field1666;
        if (this.field88 == var1) {
            return null;
        } else {
            var1.method582();
            return var1;
        }
    }

    @OriginalMember(owner = "CLCMCMIN", name = "b", descriptor = "()LXNCSKJMM;")
    public class67 method71() {
        class67 var1 = this.field88.field1666;
        if (this.field88 == var1) {
            this.field89 = null;
            return null;
        } else {
            this.field89 = var1.field1666;
            return var1;
        }
    }

    @OriginalMember(owner = "CLCMCMIN", name = "a", descriptor = "(B)LXNCSKJMM;")
    public class67 method72(byte arg0) {
        class67 var2 = this.field88.field1667;
        if (this.field87 != arg0) {
            throw new NullPointerException();
        } else if (this.field88 == var2) {
            this.field89 = null;
            return null;
        } else {
            this.field89 = var2.field1667;
            return var2;
        }
    }

    @OriginalMember(owner = "CLCMCMIN", name = "a", descriptor = "(I)LXNCSKJMM;")
    public class67 method73(int arg0) {
        class67 var2 = this.field89;
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (this.field88 == var2) {
            this.field89 = null;
            return null;
        } else {
            this.field89 = var2.field1666;
            return var2;
        }
    }

    @OriginalMember(owner = "CLCMCMIN", name = "b", descriptor = "(I)LXNCSKJMM;")
    public class67 method74(int arg0) {
        class67 var2 = this.field89;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field88 == var2) {
            this.field89 = null;
            return null;
        } else {
            this.field89 = var2.field1667;
            return var2;
        }
    }

    @OriginalMember(owner = "CLCMCMIN", name = "c", descriptor = "()V")
    public void method75() {
        if (this.field88.field1666 == this.field88) {
            return;
        }
        while (true) {
            class67 var1 = this.field88.field1666;
            if (this.field88 == var1) {
                return;
            }
            var1.method582();
        }
    }
}
