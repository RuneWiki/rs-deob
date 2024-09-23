import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZWZXPJNQ")
public class class72 {

    @OriginalMember(owner = "ZWZXPJNQ", name = "a", descriptor = "Z")
    private boolean field1748 = false;

    @OriginalMember(owner = "ZWZXPJNQ", name = "b", descriptor = "Z")
    private boolean field1749 = true;

    @OriginalMember(owner = "ZWZXPJNQ", name = "c", descriptor = "I")
    private int field1750 = 708;

    @OriginalMember(owner = "ZWZXPJNQ", name = "d", descriptor = "LOYTUMBCI;")
    public class38 field1751 = new class38();

    @OriginalMember(owner = "ZWZXPJNQ", name = "e", descriptor = "LOYTUMBCI;")
    private class38 field1752;

    @OriginalMember(owner = "ZWZXPJNQ", name = "<init>", descriptor = "(I)V")
    public class72(int arg0) {
        this.field1751.field1219 = this.field1751;
        this.field1751.field1220 = this.field1751;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "a", descriptor = "(LOYTUMBCI;)V")
    public void method597(class38 arg0) {
        if (arg0.field1220 != null) {
            arg0.method367();
        }
        arg0.field1220 = this.field1751.field1220;
        arg0.field1219 = this.field1751;
        arg0.field1220.field1219 = arg0;
        arg0.field1219.field1220 = arg0;
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "a", descriptor = "(ILOYTUMBCI;)V")
    public void method598(int arg0, class38 arg1) {
        if (arg1.field1220 != null) {
            arg1.method367();
        }
        arg1.field1220 = this.field1751;
        arg1.field1219 = this.field1751.field1219;
        arg1.field1220.field1219 = arg1;
        if (arg0 == 0) {
            arg1.field1219.field1220 = arg1;
        }
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "a", descriptor = "()LOYTUMBCI;")
    public class38 method599() {
        class38 var1 = this.field1751.field1219;
        if (this.field1751 == var1) {
            return null;
        } else {
            var1.method367();
            return var1;
        }
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "b", descriptor = "()LOYTUMBCI;")
    public class38 method600() {
        class38 var1 = this.field1751.field1219;
        if (this.field1751 == var1) {
            this.field1752 = null;
            return null;
        } else {
            this.field1752 = var1.field1219;
            return var1;
        }
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "a", descriptor = "(I)LOYTUMBCI;")
    public class38 method601(int arg0) {
        class38 var2 = this.field1751.field1220;
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1751 == var2) {
            this.field1752 = null;
            return null;
        } else {
            this.field1752 = var2.field1220;
            return var2;
        }
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "a", descriptor = "(B)LOYTUMBCI;")
    public class38 method602(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class38 var4 = this.field1752;
        if (this.field1751 == var4) {
            this.field1752 = null;
            return null;
        } else {
            this.field1752 = var4.field1219;
            return var4;
        }
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "b", descriptor = "(B)LOYTUMBCI;")
    public class38 method603(byte arg0) {
        class38 var2 = this.field1752;
        if (this.field1751 == var2) {
            this.field1752 = null;
            return null;
        }
        this.field1752 = var2.field1220;
        if (arg0 != 18) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ZWZXPJNQ", name = "c", descriptor = "()V")
    public void method604() {
        if (this.field1751.field1219 == this.field1751) {
            return;
        }
        while (true) {
            class38 var1 = this.field1751.field1219;
            if (this.field1751 == var1) {
                return;
            }
            var1.method367();
        }
    }
}
