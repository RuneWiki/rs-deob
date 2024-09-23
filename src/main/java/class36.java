import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LOISKKJJ")
public class class36 {

    @OriginalMember(owner = "LOISKKJJ", name = "a", descriptor = "I")
    private int field1099 = 2;

    @OriginalMember(owner = "LOISKKJJ", name = "b", descriptor = "Z")
    private boolean field1100 = true;

    @OriginalMember(owner = "LOISKKJJ", name = "c", descriptor = "Z")
    private boolean field1101 = true;

    @OriginalMember(owner = "LOISKKJJ", name = "d", descriptor = "B")
    private byte field1102 = -59;

    @OriginalMember(owner = "LOISKKJJ", name = "e", descriptor = "B")
    private byte field1103 = -27;

    @OriginalMember(owner = "LOISKKJJ", name = "f", descriptor = "B")
    private byte field1104 = 4;

    @OriginalMember(owner = "LOISKKJJ", name = "g", descriptor = "LDJXGSHIT;")
    public class6 field1105 = new class6();

    @OriginalMember(owner = "LOISKKJJ", name = "h", descriptor = "LDJXGSHIT;")
    private class6 field1106;

    @OriginalMember(owner = "LOISKKJJ", name = "<init>", descriptor = "(I)V")
    public class36(int arg0) {
        this.field1105.field543 = this.field1105;
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        this.field1105.field544 = this.field1105;
    }

    @OriginalMember(owner = "LOISKKJJ", name = "a", descriptor = "(LDJXGSHIT;)V")
    public void method448(class6 arg0) {
        if (arg0.field544 != null) {
            arg0.method156();
        }
        arg0.field544 = this.field1105.field544;
        arg0.field543 = this.field1105;
        arg0.field544.field543 = arg0;
        arg0.field543.field544 = arg0;
    }

    @OriginalMember(owner = "LOISKKJJ", name = "a", descriptor = "(LDJXGSHIT;Z)V")
    public void method449(class6 arg0, boolean arg1) {
        if (arg1) {
            this.field1100 = !this.field1100;
        }
        if (arg0.field544 != null) {
            arg0.method156();
        }
        arg0.field544 = this.field1105;
        arg0.field543 = this.field1105.field543;
        arg0.field544.field543 = arg0;
        arg0.field543.field544 = arg0;
        if (class6.field545) {
        }
    }

    @OriginalMember(owner = "LOISKKJJ", name = "a", descriptor = "()LDJXGSHIT;")
    public class6 method450() {
        class6 var1 = this.field1105.field543;
        if (this.field1105 == var1) {
            return null;
        } else {
            var1.method156();
            return var1;
        }
    }

    @OriginalMember(owner = "LOISKKJJ", name = "b", descriptor = "()LDJXGSHIT;")
    public class6 method451() {
        class6 var1 = this.field1105.field543;
        if (this.field1105 == var1) {
            this.field1106 = null;
            return null;
        } else {
            this.field1106 = var1.field543;
            return var1;
        }
    }

    @OriginalMember(owner = "LOISKKJJ", name = "a", descriptor = "(B)LDJXGSHIT;")
    public class6 method452(byte arg0) {
        class6 var2 = this.field1105.field544;
        if (this.field1105 == var2) {
            this.field1106 = null;
            return null;
        }
        this.field1106 = var2.field544;
        if (arg0 != -28) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "LOISKKJJ", name = "b", descriptor = "(B)LDJXGSHIT;")
    public class6 method453(byte arg0) {
        class6 var2 = this.field1106;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        if (this.field1105 == var2) {
            this.field1106 = null;
            return null;
        } else {
            this.field1106 = var2.field543;
            return var2;
        }
    }

    @OriginalMember(owner = "LOISKKJJ", name = "c", descriptor = "(B)LDJXGSHIT;")
    public class6 method454(byte arg0) {
        if (this.field1103 != arg0) {
            this.field1099 = -165;
        }
        class6 var2 = this.field1106;
        if (this.field1105 == var2) {
            this.field1106 = null;
            return null;
        } else {
            this.field1106 = var2.field544;
            return var2;
        }
    }

    @OriginalMember(owner = "LOISKKJJ", name = "c", descriptor = "()V")
    public void method455() {
        if (this.field1105.field543 == this.field1105) {
            return;
        }
        while (true) {
            class6 var1 = this.field1105.field543;
            if (this.field1105 == var1) {
                return;
            }
            var1.method156();
        }
    }
}
