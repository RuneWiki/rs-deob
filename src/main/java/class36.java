import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JQSVNFRT")
public class class36 {

    @OriginalMember(owner = "JQSVNFRT", name = "a", descriptor = "I")
    private int field1030 = 518;

    @OriginalMember(owner = "JQSVNFRT", name = "b", descriptor = "Z")
    private boolean field1031 = false;

    @OriginalMember(owner = "JQSVNFRT", name = "c", descriptor = "Z")
    private boolean field1032 = true;

    @OriginalMember(owner = "JQSVNFRT", name = "d", descriptor = "I")
    private int field1033 = -558;

    @OriginalMember(owner = "JQSVNFRT", name = "e", descriptor = "I")
    private int field1034 = 691;

    @OriginalMember(owner = "JQSVNFRT", name = "f", descriptor = "LIHAIACWA;")
    public class33 field1035 = new class33();

    @OriginalMember(owner = "JQSVNFRT", name = "g", descriptor = "LIHAIACWA;")
    private class33 field1036;

    @OriginalMember(owner = "JQSVNFRT", name = "<init>", descriptor = "(I)V")
    public class36(int arg0) {
        if (arg0 != 0) {
            this.field1031 = !this.field1031;
        }
        this.field1035.field1007 = this.field1035;
        this.field1035.field1008 = this.field1035;
    }

    @OriginalMember(owner = "JQSVNFRT", name = "a", descriptor = "(LIHAIACWA;)V")
    public void method392(class33 arg0) {
        if (arg0.field1008 != null) {
            arg0.method379();
        }
        arg0.field1008 = this.field1035.field1008;
        arg0.field1007 = this.field1035;
        arg0.field1008.field1007 = arg0;
        arg0.field1007.field1008 = arg0;
    }

    @OriginalMember(owner = "JQSVNFRT", name = "a", descriptor = "(LIHAIACWA;I)V")
    public void method393(class33 arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1032 = !this.field1032;
        }
        if (arg0.field1008 != null) {
            arg0.method379();
        }
        arg0.field1008 = this.field1035;
        arg0.field1007 = this.field1035.field1007;
        arg0.field1008.field1007 = arg0;
        arg0.field1007.field1008 = arg0;
        if (class33.field1009) {
        }
    }

    @OriginalMember(owner = "JQSVNFRT", name = "a", descriptor = "()LIHAIACWA;")
    public class33 method394() {
        class33 var1 = this.field1035.field1007;
        if (this.field1035 == var1) {
            return null;
        } else {
            var1.method379();
            return var1;
        }
    }

    @OriginalMember(owner = "JQSVNFRT", name = "b", descriptor = "()LIHAIACWA;")
    public class33 method395() {
        class33 var1 = this.field1035.field1007;
        if (this.field1035 == var1) {
            this.field1036 = null;
            return null;
        } else {
            this.field1036 = var1.field1007;
            return var1;
        }
    }

    @OriginalMember(owner = "JQSVNFRT", name = "a", descriptor = "(I)LIHAIACWA;")
    public class33 method396(int arg0) {
        class33 var2 = this.field1035.field1008;
        if (this.field1035 == var2) {
            this.field1036 = null;
            return null;
        }
        this.field1036 = var2.field1008;
        if (arg0 < 3 || arg0 > 3) {
            this.field1030 = -258;
        }
        return var2;
    }

    @OriginalMember(owner = "JQSVNFRT", name = "b", descriptor = "(I)LIHAIACWA;")
    public class33 method397(int arg0) {
        class33 var2 = this.field1036;
        if (arg0 >= 0) {
            this.field1032 = !this.field1032;
        }
        if (this.field1035 == var2) {
            this.field1036 = null;
            return null;
        } else {
            this.field1036 = var2.field1007;
            return var2;
        }
    }

    @OriginalMember(owner = "JQSVNFRT", name = "a", descriptor = "(B)LIHAIACWA;")
    public class33 method398(byte arg0) {
        class33 var2 = this.field1036;
        if (arg0 != -128) {
            throw new NullPointerException();
        } else if (this.field1035 == var2) {
            this.field1036 = null;
            return null;
        } else {
            this.field1036 = var2.field1008;
            return var2;
        }
    }

    @OriginalMember(owner = "JQSVNFRT", name = "c", descriptor = "()V")
    public void method399() {
        if (this.field1035.field1007 == this.field1035) {
            return;
        }
        while (true) {
            class33 var1 = this.field1035.field1007;
            if (this.field1035 == var1) {
                return;
            }
            var1.method379();
        }
    }
}
