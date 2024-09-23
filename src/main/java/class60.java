import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VLUKUYNM")
public class class60 {

    @OriginalMember(owner = "VLUKUYNM", name = "a", descriptor = "I")
    private int field1336 = 831;

    @OriginalMember(owner = "VLUKUYNM", name = "b", descriptor = "Z")
    private boolean field1337 = false;

    @OriginalMember(owner = "VLUKUYNM", name = "c", descriptor = "LOWNYSRQV;")
    public class54 field1338 = new class54();

    @OriginalMember(owner = "VLUKUYNM", name = "d", descriptor = "LOWNYSRQV;")
    private class54 field1339;

    @OriginalMember(owner = "VLUKUYNM", name = "<init>", descriptor = "(B)V")
    public class60(byte arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        this.field1338.field1299 = this.field1338;
        this.field1338.field1300 = this.field1338;
    }

    @OriginalMember(owner = "VLUKUYNM", name = "a", descriptor = "(LOWNYSRQV;)V")
    public void method358(class54 arg0) {
        if (arg0.field1300 != null) {
            arg0.method334();
        }
        arg0.field1300 = this.field1338.field1300;
        arg0.field1299 = this.field1338;
        arg0.field1300.field1299 = arg0;
        arg0.field1299.field1300 = arg0;
    }

    @OriginalMember(owner = "VLUKUYNM", name = "a", descriptor = "(LOWNYSRQV;I)V")
    public void method359(class54 arg0, int arg1) {
        if (arg0.field1300 != null) {
            arg0.method334();
        }
        arg0.field1300 = this.field1338;
        arg0.field1299 = this.field1338.field1299;
        arg0.field1300.field1299 = arg0;
        if (arg1 == 8) {
            arg0.field1299.field1300 = arg0;
        }
    }

    @OriginalMember(owner = "VLUKUYNM", name = "a", descriptor = "()LOWNYSRQV;")
    public class54 method360() {
        class54 var1 = this.field1338.field1299;
        if (this.field1338 == var1) {
            return null;
        } else {
            var1.method334();
            return var1;
        }
    }

    @OriginalMember(owner = "VLUKUYNM", name = "b", descriptor = "()LOWNYSRQV;")
    public class54 method361() {
        class54 var1 = this.field1338.field1299;
        if (this.field1338 == var1) {
            this.field1339 = null;
            return null;
        } else {
            this.field1339 = var1.field1299;
            return var1;
        }
    }

    @OriginalMember(owner = "VLUKUYNM", name = "a", descriptor = "(I)LOWNYSRQV;")
    public class54 method362(int arg0) {
        class54 var2 = this.field1338.field1300;
        if (this.field1338 == var2) {
            this.field1339 = null;
            return null;
        }
        this.field1339 = var2.field1300;
        if (arg0 != 46747) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "VLUKUYNM", name = "b", descriptor = "(I)LOWNYSRQV;")
    public class54 method363(int arg0) {
        class54 var2 = this.field1339;
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (this.field1338 == var2) {
            this.field1339 = null;
            return null;
        } else {
            this.field1339 = var2.field1299;
            return var2;
        }
    }

    @OriginalMember(owner = "VLUKUYNM", name = "c", descriptor = "(I)LOWNYSRQV;")
    public class54 method364(int arg0) {
        while (arg0 >= 0) {
            this.field1337 = !this.field1337;
        }
        class54 var2 = this.field1339;
        if (this.field1338 == var2) {
            this.field1339 = null;
            return null;
        } else {
            this.field1339 = var2.field1300;
            return var2;
        }
    }

    @OriginalMember(owner = "VLUKUYNM", name = "c", descriptor = "()V")
    public void method365() {
        if (this.field1338.field1299 == this.field1338) {
            return;
        }
        while (true) {
            class54 var1 = this.field1338.field1299;
            if (this.field1338 == var1) {
                return;
            }
            var1.method334();
        }
    }
}
