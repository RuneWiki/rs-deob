import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IHMCQRZY")
public class class24 {

    @OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "I")
    private int field803 = 9;

    @OriginalMember(owner = "client!IHMCQRZY", name = "b", descriptor = "I")
    private int field804 = 275;

    @OriginalMember(owner = "client!IHMCQRZY", name = "c", descriptor = "LXAQVXEIR;")
    public class66 field805 = new class66();

    @OriginalMember(owner = "client!IHMCQRZY", name = "d", descriptor = "LXAQVXEIR;")
    private class66 field806;

    @OriginalMember(owner = "client!IHMCQRZY", name = "<init>", descriptor = "(Z)V")
    public class24(boolean arg0) {
        this.field805.field1690 = this.field805;
        this.field805.field1691 = this.field805;
        if (arg0) {
            this.field804 = -211;
        }
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(LXAQVXEIR;)V")
    public void method243(class66 arg0) {
        if (arg0.field1691 != null) {
            arg0.method589();
        }
        arg0.field1691 = this.field805.field1691;
        arg0.field1690 = this.field805;
        arg0.field1691.field1690 = arg0;
        arg0.field1690.field1691 = arg0;
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(LXAQVXEIR;I)V")
    public void method244(class66 arg0, int arg1) {
        if (arg0.field1691 != null) {
            arg0.method589();
        }
        arg0.field1691 = this.field805;
        arg0.field1690 = this.field805.field1690;
        if (this.field803 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        arg0.field1691.field1690 = arg0;
        arg0.field1690.field1691 = arg0;
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "()LXAQVXEIR;")
    public class66 method245() {
        class66 var1 = this.field805.field1690;
        if (this.field805 == var1) {
            return null;
        } else {
            var1.method589();
            return var1;
        }
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "b", descriptor = "()LXAQVXEIR;")
    public class66 method246() {
        class66 var1 = this.field805.field1690;
        if (this.field805 == var1) {
            this.field806 = null;
            return null;
        } else {
            this.field806 = var1.field1690;
            return var1;
        }
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(Z)LXAQVXEIR;")
    public class66 method247(boolean arg0) {
        class66 var2 = this.field805.field1691;
        if (this.field805 == var2) {
            this.field806 = null;
            return null;
        }
        this.field806 = var2.field1691;
        if (!arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "b", descriptor = "(Z)LXAQVXEIR;")
    public class66 method248(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class66 var3 = this.field806;
        if (this.field805 == var3) {
            this.field806 = null;
            return null;
        } else {
            this.field806 = var3.field1690;
            return var3;
        }
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(I)LXAQVXEIR;")
    public class66 method249(int arg0) {
        class66 var2 = this.field806;
        if (arg0 < 4 || arg0 > 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field805 == var2) {
            this.field806 = null;
            return null;
        } else {
            this.field806 = var2.field1691;
            return var2;
        }
    }

    @OriginalMember(owner = "client!IHMCQRZY", name = "c", descriptor = "()V")
    public void method250() {
        if (this.field805.field1690 == this.field805) {
            return;
        }
        while (true) {
            class66 var1 = this.field805.field1690;
            if (this.field805 == var1) {
                return;
            }
            var1.method589();
        }
    }
}
