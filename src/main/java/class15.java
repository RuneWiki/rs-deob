import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FEIPMYNH")
public class class15 {

    @OriginalMember(owner = "client!FEIPMYNH", name = "b", descriptor = "Z")
    private boolean field677 = true;

    @OriginalMember(owner = "client!FEIPMYNH", name = "c", descriptor = "LTVKHSKYG;")
    public class56 field678 = new class56();

    @OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!FEIPMYNH", name = "d", descriptor = "LTVKHSKYG;")
    private class56 field679;

    @OriginalMember(owner = "client!FEIPMYNH", name = "<init>", descriptor = "(Z)V")
    public class15(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field678.field1533 = this.field678;
        this.field678.field1534 = this.field678;
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(LTVKHSKYG;)V")
    public void method297(class56 arg0) {
        if (arg0.field1534 != null) {
            arg0.method518();
        }
        arg0.field1534 = this.field678.field1534;
        arg0.field1533 = this.field678;
        arg0.field1534.field1533 = arg0;
        arg0.field1533.field1534 = arg0;
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(ZLTVKHSKYG;)V")
    public void method298(boolean arg0, class56 arg1) {
        if (arg0) {
            return;
        }
        if (arg1.field1534 != null) {
            arg1.method518();
        }
        arg1.field1534 = this.field678;
        arg1.field1533 = this.field678.field1533;
        arg1.field1534.field1533 = arg1;
        arg1.field1533.field1534 = arg1;
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "()LTVKHSKYG;")
    public class56 method299() {
        class56 var1 = this.field678.field1533;
        if (this.field678 == var1) {
            return null;
        } else {
            var1.method518();
            return var1;
        }
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "b", descriptor = "()LTVKHSKYG;")
    public class56 method300() {
        class56 var1 = this.field678.field1533;
        if (this.field678 == var1) {
            this.field679 = null;
            return null;
        } else {
            this.field679 = var1.field1533;
            return var1;
        }
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(I)LTVKHSKYG;")
    public class56 method301(int arg0) {
        class56 var2 = this.field678.field1534;
        if (this.field678 == var2) {
            this.field679 = null;
            return null;
        } else {
            this.field679 = var2.field1534;
            int var3 = 91 / arg0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(Z)LTVKHSKYG;")
    public class56 method302(boolean arg0) {
        class56 var2 = this.field679;
        if (this.field678 == var2) {
            this.field679 = null;
            return null;
        }
        this.field679 = var2.field1533;
        if (!arg0) {
            this.field676 = 416;
        }
        return var2;
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "b", descriptor = "(I)LTVKHSKYG;")
    public class56 method303(int arg0) {
        class56 var2 = this.field679;
        if (arg0 <= 0) {
            this.field676 = -250;
        }
        if (this.field678 == var2) {
            this.field679 = null;
            return null;
        } else {
            this.field679 = var2.field1534;
            return var2;
        }
    }

    @OriginalMember(owner = "client!FEIPMYNH", name = "c", descriptor = "()V")
    public void method304() {
        if (this.field678.field1533 == this.field678) {
            return;
        }
        while (true) {
            class56 var1 = this.field678.field1533;
            if (this.field678 == var1) {
                return;
            }
            var1.method518();
        }
    }
}
