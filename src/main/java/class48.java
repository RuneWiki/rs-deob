import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OUZUCGGU")
public class class48 {

    @OriginalMember(owner = "OUZUCGGU", name = "a", descriptor = "LICYTWAKR;")
    public class29 field1096 = new class29();

    @OriginalMember(owner = "OUZUCGGU", name = "b", descriptor = "LICYTWAKR;")
    private class29 field1097;

    @OriginalMember(owner = "OUZUCGGU", name = "<init>", descriptor = "(I)V")
    public class48(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field1096.field876 = this.field1096;
        this.field1096.field877 = this.field1096;
    }

    @OriginalMember(owner = "OUZUCGGU", name = "a", descriptor = "(LICYTWAKR;)V")
    public void method390(class29 arg0) {
        if (arg0.field877 != null) {
            arg0.method290();
        }
        arg0.field877 = this.field1096.field877;
        arg0.field876 = this.field1096;
        arg0.field877.field876 = arg0;
        arg0.field876.field877 = arg0;
    }

    @OriginalMember(owner = "OUZUCGGU", name = "a", descriptor = "(LICYTWAKR;I)V")
    public void method391(class29 arg0, int arg1) {
        if (arg1 != -15393) {
            return;
        }
        if (arg0.field877 != null) {
            arg0.method290();
        }
        arg0.field877 = this.field1096;
        arg0.field876 = this.field1096.field876;
        arg0.field877.field876 = arg0;
        arg0.field876.field877 = arg0;
    }

    @OriginalMember(owner = "OUZUCGGU", name = "a", descriptor = "()LICYTWAKR;")
    public class29 method392() {
        class29 var1 = this.field1096.field876;
        if (this.field1096 == var1) {
            return null;
        } else {
            var1.method290();
            return var1;
        }
    }

    @OriginalMember(owner = "OUZUCGGU", name = "b", descriptor = "()LICYTWAKR;")
    public class29 method393() {
        class29 var1 = this.field1096.field876;
        if (this.field1096 == var1) {
            this.field1097 = null;
            return null;
        } else {
            this.field1097 = var1.field876;
            return var1;
        }
    }

    @OriginalMember(owner = "OUZUCGGU", name = "a", descriptor = "(Z)LICYTWAKR;")
    public class29 method394(boolean arg0) {
        class29 var2 = this.field1096.field877;
        if (this.field1096 == var2) {
            this.field1097 = null;
            return null;
        }
        this.field1097 = var2.field877;
        if (!arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "OUZUCGGU", name = "b", descriptor = "(Z)LICYTWAKR;")
    public class29 method395(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        class29 var2 = this.field1097;
        if (this.field1096 == var2) {
            this.field1097 = null;
            return null;
        } else {
            this.field1097 = var2.field876;
            return var2;
        }
    }

    @OriginalMember(owner = "OUZUCGGU", name = "a", descriptor = "(I)LICYTWAKR;")
    public class29 method396(int arg0) {
        class29 var2 = this.field1097;
        if (arg0 != 1837) {
            throw new NullPointerException();
        } else if (this.field1096 == var2) {
            this.field1097 = null;
            return null;
        } else {
            this.field1097 = var2.field877;
            return var2;
        }
    }

    @OriginalMember(owner = "OUZUCGGU", name = "c", descriptor = "()V")
    public void method397() {
        if (this.field1096.field876 == this.field1096) {
            return;
        }
        while (true) {
            class29 var1 = this.field1096.field876;
            if (this.field1096 == var1) {
                return;
            }
            var1.method290();
        }
    }
}
