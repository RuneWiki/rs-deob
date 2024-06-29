import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QGWIBVPG")
public class class42 {

    @OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "Z")
    private boolean field1196 = true;

    @OriginalMember(owner = "client!QGWIBVPG", name = "b", descriptor = "I")
    private int field1197 = -981;

    @OriginalMember(owner = "client!QGWIBVPG", name = "c", descriptor = "LQEPVMESX;")
    public class41 field1198 = new class41();

    @OriginalMember(owner = "client!QGWIBVPG", name = "d", descriptor = "LQEPVMESX;")
    private class41 field1199;

    @OriginalMember(owner = "client!QGWIBVPG", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        if (arg0 != 9203) {
            this.field1196 = !this.field1196;
        }
        this.field1198.field1193 = this.field1198;
        this.field1198.field1194 = this.field1198;
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "(LQEPVMESX;)V")
    public void method419(class41 arg0) {
        if (arg0.field1194 != null) {
            arg0.method418();
        }
        arg0.field1194 = this.field1198.field1194;
        arg0.field1193 = this.field1198;
        arg0.field1194.field1193 = arg0;
        arg0.field1193.field1194 = arg0;
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "(ILQEPVMESX;)V")
    public void method420(int arg0, class41 arg1) {
        if (arg0 >= 0) {
            return;
        }
        if (arg1.field1194 != null) {
            arg1.method418();
        }
        arg1.field1194 = this.field1198;
        arg1.field1193 = this.field1198.field1193;
        arg1.field1194.field1193 = arg1;
        arg1.field1193.field1194 = arg1;
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "()LQEPVMESX;")
    public class41 method421() {
        class41 var1 = this.field1198.field1193;
        if (this.field1198 == var1) {
            return null;
        } else {
            var1.method418();
            return var1;
        }
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "b", descriptor = "()LQEPVMESX;")
    public class41 method422() {
        class41 var1 = this.field1198.field1193;
        if (this.field1198 == var1) {
            this.field1199 = null;
            return null;
        } else {
            this.field1199 = var1.field1193;
            return var1;
        }
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "(Z)LQEPVMESX;")
    public class41 method423(boolean arg0) {
        class41 var2 = this.field1198.field1194;
        if (this.field1198 == var2) {
            this.field1199 = null;
            return null;
        }
        this.field1199 = var2.field1194;
        if (arg0) {
            this.field1197 = 77;
        }
        return var2;
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "b", descriptor = "(Z)LQEPVMESX;")
    public class41 method424(boolean arg0) {
        class41 var2 = this.field1199;
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field1198 == var2) {
            this.field1199 = null;
            return null;
        } else {
            this.field1199 = var2.field1193;
            return var2;
        }
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "c", descriptor = "(Z)LQEPVMESX;")
    public class41 method425(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        class41 var2 = this.field1199;
        if (this.field1198 == var2) {
            this.field1199 = null;
            return null;
        } else {
            this.field1199 = var2.field1194;
            return var2;
        }
    }

    @OriginalMember(owner = "client!QGWIBVPG", name = "c", descriptor = "()V")
    public void method426() {
        if (this.field1198.field1193 == this.field1198) {
            return;
        }
        while (true) {
            class41 var1 = this.field1198.field1193;
            if (this.field1198 == var1) {
                return;
            }
            var1.method418();
        }
    }
}
