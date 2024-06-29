import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WAPMJSJO")
public class class61 {

    @OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "I")
    private int field1539 = 673;

    @OriginalMember(owner = "client!WAPMJSJO", name = "b", descriptor = "B")
    private byte field1540 = -126;

    @OriginalMember(owner = "client!WAPMJSJO", name = "d", descriptor = "I")
    private int field1542 = 9;

    @OriginalMember(owner = "client!WAPMJSJO", name = "e", descriptor = "Z")
    private boolean field1543 = false;

    @OriginalMember(owner = "client!WAPMJSJO", name = "f", descriptor = "LLTTSKENL;")
    public class33 field1544 = new class33();

    @OriginalMember(owner = "client!WAPMJSJO", name = "c", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!WAPMJSJO", name = "g", descriptor = "LLTTSKENL;")
    private class33 field1545;

    @OriginalMember(owner = "client!WAPMJSJO", name = "<init>", descriptor = "(B)V")
    public class61(byte arg0) {
        this.field1544.field958 = this.field1544;
        this.field1544.field959 = this.field1544;
        if (this.field1540 != arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "(LLTTSKENL;)V")
    public void method482(class33 arg0) {
        if (arg0.field959 != null) {
            arg0.method327();
        }
        arg0.field959 = this.field1544.field959;
        arg0.field958 = this.field1544;
        arg0.field959.field958 = arg0;
        arg0.field958.field959 = arg0;
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "(LLTTSKENL;Z)V")
    public void method483(class33 arg0, boolean arg1) {
        if (arg0.field959 != null) {
            arg0.method327();
        }
        arg0.field959 = this.field1544;
        arg0.field958 = this.field1544.field958;
        arg0.field959.field958 = arg0;
        arg0.field958.field959 = arg0;
        if (!arg1) {
            this.field1541 = 330;
        } else if (class33.field960) {
        }
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "()LLTTSKENL;")
    public class33 method484() {
        class33 var1 = this.field1544.field958;
        if (this.field1544 == var1) {
            return null;
        } else {
            var1.method327();
            return var1;
        }
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "b", descriptor = "()LLTTSKENL;")
    public class33 method485() {
        class33 var1 = this.field1544.field958;
        if (this.field1544 == var1) {
            this.field1545 = null;
            return null;
        } else {
            this.field1545 = var1.field958;
            return var1;
        }
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "(I)LLTTSKENL;")
    public class33 method486(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
        class33 var2 = this.field1544.field959;
        if (this.field1544 == var2) {
            this.field1545 = null;
            return null;
        } else {
            this.field1545 = var2.field959;
            return var2;
        }
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "b", descriptor = "(I)LLTTSKENL;")
    public class33 method487(int arg0) {
        class33 var2 = this.field1545;
        if (this.field1544 == var2) {
            this.field1545 = null;
            return null;
        }
        this.field1545 = var2.field958;
        if (arg0 < 6 || arg0 > 6) {
            this.field1539 = -370;
        }
        return var2;
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "c", descriptor = "(I)LLTTSKENL;")
    public class33 method488(int arg0) {
        class33 var2 = this.field1545;
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (this.field1544 == var2) {
            this.field1545 = null;
            return null;
        } else {
            this.field1545 = var2.field959;
            return var2;
        }
    }

    @OriginalMember(owner = "client!WAPMJSJO", name = "c", descriptor = "()V")
    public void method489() {
        if (this.field1544.field958 == this.field1544) {
            return;
        }
        while (true) {
            class33 var1 = this.field1544.field958;
            if (this.field1544 == var1) {
                return;
            }
            var1.method327();
        }
    }
}
