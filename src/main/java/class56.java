import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SWVPDERM")
public class class56 {

    @OriginalMember(owner = "SWVPDERM", name = "a", descriptor = "Z")
    private boolean field1435 = true;

    @OriginalMember(owner = "SWVPDERM", name = "b", descriptor = "Z")
    private boolean field1436 = true;

    @OriginalMember(owner = "SWVPDERM", name = "c", descriptor = "I")
    private int field1437 = 7;

    @OriginalMember(owner = "SWVPDERM", name = "d", descriptor = "LOEHUIBBM;")
    public class37 field1438 = new class37();

    @OriginalMember(owner = "SWVPDERM", name = "e", descriptor = "LOEHUIBBM;")
    private class37 field1439;

    @OriginalMember(owner = "SWVPDERM", name = "<init>", descriptor = "(I)V")
    public class56(int arg0) {
        this.field1438.field1081 = this.field1438;
        this.field1438.field1082 = this.field1438;
        if (arg0 <= 0) {
            this.field1435 = !this.field1435;
        }
    }

    @OriginalMember(owner = "SWVPDERM", name = "a", descriptor = "(LOEHUIBBM;)V")
    public void method479(class37 arg0) {
        if (arg0.field1082 != null) {
            arg0.method397();
        }
        arg0.field1082 = this.field1438.field1082;
        arg0.field1081 = this.field1438;
        arg0.field1082.field1081 = arg0;
        arg0.field1081.field1082 = arg0;
    }

    @OriginalMember(owner = "SWVPDERM", name = "a", descriptor = "(BLOEHUIBBM;)V")
    public void method480(byte arg0, class37 arg1) {
        if (arg1.field1082 != null) {
            arg1.method397();
        }
        arg1.field1082 = this.field1438;
        arg1.field1081 = this.field1438.field1081;
        arg1.field1082.field1081 = arg1;
        arg1.field1081.field1082 = arg1;
        if (arg0 != 4) {
            this.field1437 = -18;
        } else if (class37.field1083) {
        }
    }

    @OriginalMember(owner = "SWVPDERM", name = "a", descriptor = "()LOEHUIBBM;")
    public class37 method481() {
        class37 var1 = this.field1438.field1081;
        if (this.field1438 == var1) {
            return null;
        } else {
            var1.method397();
            return var1;
        }
    }

    @OriginalMember(owner = "SWVPDERM", name = "b", descriptor = "()LOEHUIBBM;")
    public class37 method482() {
        class37 var1 = this.field1438.field1081;
        if (this.field1438 == var1) {
            this.field1439 = null;
            return null;
        } else {
            this.field1439 = var1.field1081;
            return var1;
        }
    }

    @OriginalMember(owner = "SWVPDERM", name = "a", descriptor = "(B)LOEHUIBBM;")
    public class37 method483(byte arg0) {
        class37 var2 = this.field1438.field1082;
        if (this.field1438 == var2) {
            this.field1439 = null;
            return null;
        }
        this.field1439 = var2.field1082;
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "SWVPDERM", name = "a", descriptor = "(I)LOEHUIBBM;")
    public class37 method484(int arg0) {
        class37 var2 = this.field1439;
        if (this.field1438 == var2) {
            this.field1439 = null;
            return null;
        }
        this.field1439 = var2.field1081;
        if (arg0 != 2) {
            this.field1436 = !this.field1436;
        }
        return var2;
    }

    @OriginalMember(owner = "SWVPDERM", name = "b", descriptor = "(I)LOEHUIBBM;")
    public class37 method485(int arg0) {
        class37 var2 = this.field1439;
        if (arg0 != 20429) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1438 == var2) {
            this.field1439 = null;
            return null;
        } else {
            this.field1439 = var2.field1082;
            return var2;
        }
    }

    @OriginalMember(owner = "SWVPDERM", name = "c", descriptor = "()V")
    public void method486() {
        if (this.field1438.field1081 == this.field1438) {
            return;
        }
        while (true) {
            class37 var1 = this.field1438.field1081;
            if (this.field1438 == var1) {
                return;
            }
            var1.method397();
        }
    }
}
