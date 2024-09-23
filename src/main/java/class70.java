import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZCVCEQHJ")
public class class70 {

    @OriginalMember(owner = "ZCVCEQHJ", name = "a", descriptor = "Z")
    private boolean field1718 = false;

    @OriginalMember(owner = "ZCVCEQHJ", name = "b", descriptor = "Z")
    private boolean field1719 = true;

    @OriginalMember(owner = "ZCVCEQHJ", name = "c", descriptor = "Z")
    private boolean field1720 = false;

    @OriginalMember(owner = "ZCVCEQHJ", name = "d", descriptor = "I")
    private int field1721 = 1;

    @OriginalMember(owner = "ZCVCEQHJ", name = "e", descriptor = "LAJSSLSFA;")
    public class2 field1722 = new class2();

    @OriginalMember(owner = "ZCVCEQHJ", name = "f", descriptor = "LAJSSLSFA;")
    private class2 field1723;

    @OriginalMember(owner = "ZCVCEQHJ", name = "<init>", descriptor = "(I)V")
    public class70(int arg0) {
        this.field1722.field12 = this.field1722;
        this.field1722.field13 = this.field1722;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "a", descriptor = "(LAJSSLSFA;)V")
    public void method589(class2 arg0) {
        if (arg0.field13 != null) {
            arg0.method1();
        }
        arg0.field13 = this.field1722.field13;
        arg0.field12 = this.field1722;
        arg0.field13.field12 = arg0;
        arg0.field12.field13 = arg0;
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "a", descriptor = "(LAJSSLSFA;I)V")
    public void method590(class2 arg0, int arg1) {
        if (arg0.field13 != null) {
            arg0.method1();
        }
        arg0.field13 = this.field1722;
        if (arg1 != 0) {
            this.field1720 = !this.field1720;
        }
        arg0.field12 = this.field1722.field12;
        arg0.field13.field12 = arg0;
        arg0.field12.field13 = arg0;
        if (class2.field14) {
        }
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "a", descriptor = "()LAJSSLSFA;")
    public class2 method591() {
        class2 var1 = this.field1722.field12;
        if (this.field1722 == var1) {
            return null;
        } else {
            var1.method1();
            return var1;
        }
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "b", descriptor = "()LAJSSLSFA;")
    public class2 method592() {
        class2 var1 = this.field1722.field12;
        if (this.field1722 == var1) {
            this.field1723 = null;
            return null;
        } else {
            this.field1723 = var1.field12;
            return var1;
        }
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "a", descriptor = "(Z)LAJSSLSFA;")
    public class2 method593(boolean arg0) {
        class2 var2 = this.field1722.field13;
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field1722 == var2) {
            this.field1723 = null;
            return null;
        } else {
            this.field1723 = var2.field13;
            return var2;
        }
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "a", descriptor = "(I)LAJSSLSFA;")
    public class2 method594(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class2 var3 = this.field1723;
        if (this.field1722 == var3) {
            this.field1723 = null;
            return null;
        } else {
            this.field1723 = var3.field12;
            return var3;
        }
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "b", descriptor = "(Z)LAJSSLSFA;")
    public class2 method595(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        class2 var2 = this.field1723;
        if (this.field1722 == var2) {
            this.field1723 = null;
            return null;
        } else {
            this.field1723 = var2.field13;
            return var2;
        }
    }

    @OriginalMember(owner = "ZCVCEQHJ", name = "c", descriptor = "()V")
    public void method596() {
        if (this.field1722.field12 == this.field1722) {
            return;
        }
        while (true) {
            class2 var1 = this.field1722.field12;
            if (this.field1722 == var1) {
                return;
            }
            var1.method1();
        }
    }
}
