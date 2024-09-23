import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YLURZVWU")
public class class65 {

    @OriginalMember(owner = "YLURZVWU", name = "a", descriptor = "Z")
    private boolean field1530 = false;

    @OriginalMember(owner = "YLURZVWU", name = "c", descriptor = "LZSZDCWXM;")
    public class72 field1532 = new class72();

    @OriginalMember(owner = "YLURZVWU", name = "b", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "YLURZVWU", name = "d", descriptor = "LZSZDCWXM;")
    private class72 field1533;

    @OriginalMember(owner = "YLURZVWU", name = "<init>", descriptor = "(B)V")
    public class65(byte arg0) {
        this.field1532.field1711 = this.field1532;
        this.field1532.field1712 = this.field1532;
        if (arg0 != 52) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "YLURZVWU", name = "a", descriptor = "(LZSZDCWXM;)V")
    public void method525(class72 arg0) {
        if (arg0.field1712 != null) {
            arg0.method589();
        }
        arg0.field1712 = this.field1532.field1712;
        arg0.field1711 = this.field1532;
        arg0.field1712.field1711 = arg0;
        arg0.field1711.field1712 = arg0;
    }

    @OriginalMember(owner = "YLURZVWU", name = "a", descriptor = "(LZSZDCWXM;I)V")
    public void method526(class72 arg0, int arg1) {
        if (arg0.field1712 != null) {
            arg0.method589();
        }
        arg0.field1712 = this.field1532;
        arg0.field1711 = this.field1532.field1711;
        if (arg1 == 5) {
            arg0.field1712.field1711 = arg0;
            arg0.field1711.field1712 = arg0;
        }
    }

    @OriginalMember(owner = "YLURZVWU", name = "a", descriptor = "()LZSZDCWXM;")
    public class72 method527() {
        class72 var1 = this.field1532.field1711;
        if (this.field1532 == var1) {
            return null;
        } else {
            var1.method589();
            return var1;
        }
    }

    @OriginalMember(owner = "YLURZVWU", name = "b", descriptor = "()LZSZDCWXM;")
    public class72 method528() {
        class72 var1 = this.field1532.field1711;
        if (this.field1532 == var1) {
            this.field1533 = null;
            return null;
        } else {
            this.field1533 = var1.field1711;
            return var1;
        }
    }

    @OriginalMember(owner = "YLURZVWU", name = "a", descriptor = "(I)LZSZDCWXM;")
    public class72 method529(int arg0) {
        class72 var2 = this.field1532.field1712;
        if (this.field1532 == var2) {
            this.field1533 = null;
            return null;
        }
        this.field1533 = var2.field1712;
        if (arg0 < 0 || arg0 > 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "YLURZVWU", name = "a", descriptor = "(Z)LZSZDCWXM;")
    public class72 method530(boolean arg0) {
        class72 var2 = this.field1533;
        if (this.field1532 == var2) {
            this.field1533 = null;
            return null;
        }
        this.field1533 = var2.field1711;
        if (arg0) {
            this.field1531 = 409;
        }
        return var2;
    }

    @OriginalMember(owner = "YLURZVWU", name = "b", descriptor = "(I)LZSZDCWXM;")
    public class72 method531(int arg0) {
        class72 var2 = this.field1533;
        if (this.field1532 == var2) {
            this.field1533 = null;
            return null;
        } else {
            this.field1533 = var2.field1712;
            int var3 = 2 / arg0;
            return var2;
        }
    }

    @OriginalMember(owner = "YLURZVWU", name = "c", descriptor = "()V")
    public void method532() {
        if (this.field1532.field1711 == this.field1532) {
            return;
        }
        while (true) {
            class72 var1 = this.field1532.field1711;
            if (this.field1532 == var1) {
                return;
            }
            var1.method589();
        }
    }
}
