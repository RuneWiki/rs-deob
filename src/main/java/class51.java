import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ROXEPOUC")
public class class51 {

    @OriginalMember(owner = "ROXEPOUC", name = "a", descriptor = "Z")
    private boolean field1338 = true;

    @OriginalMember(owner = "ROXEPOUC", name = "b", descriptor = "I")
    private int field1339 = 581;

    @OriginalMember(owner = "ROXEPOUC", name = "c", descriptor = "I")
    private int field1340 = 7;

    @OriginalMember(owner = "ROXEPOUC", name = "d", descriptor = "LDLMMHADP;")
    public class13 field1341 = new class13();

    @OriginalMember(owner = "ROXEPOUC", name = "e", descriptor = "LDLMMHADP;")
    private class13 field1342;

    @OriginalMember(owner = "ROXEPOUC", name = "<init>", descriptor = "(I)V")
    public class51(int arg0) {
        this.field1341.field721 = this.field1341;
        if (arg0 != 0) {
            this.field1340 = 334;
        }
        this.field1341.field722 = this.field1341;
    }

    @OriginalMember(owner = "ROXEPOUC", name = "a", descriptor = "(LDLMMHADP;)V")
    public void method424(class13 arg0) {
        if (arg0.field722 != null) {
            arg0.method234();
        }
        arg0.field722 = this.field1341.field722;
        arg0.field721 = this.field1341;
        arg0.field722.field721 = arg0;
        arg0.field721.field722 = arg0;
    }

    @OriginalMember(owner = "ROXEPOUC", name = "a", descriptor = "(ILDLMMHADP;)V")
    public void method425(int arg0, class13 arg1) {
        if (arg1.field722 != null) {
            arg1.method234();
        }
        arg1.field722 = this.field1341;
        arg1.field721 = this.field1341.field721;
        if (arg0 >= 9 && arg0 <= 9) {
            arg1.field722.field721 = arg1;
            arg1.field721.field722 = arg1;
        }
    }

    @OriginalMember(owner = "ROXEPOUC", name = "a", descriptor = "()LDLMMHADP;")
    public class13 method426() {
        class13 var1 = this.field1341.field721;
        if (this.field1341 == var1) {
            return null;
        } else {
            var1.method234();
            return var1;
        }
    }

    @OriginalMember(owner = "ROXEPOUC", name = "b", descriptor = "()LDLMMHADP;")
    public class13 method427() {
        class13 var1 = this.field1341.field721;
        if (this.field1341 == var1) {
            this.field1342 = null;
            return null;
        } else {
            this.field1342 = var1.field721;
            return var1;
        }
    }

    @OriginalMember(owner = "ROXEPOUC", name = "a", descriptor = "(I)LDLMMHADP;")
    public class13 method428(int arg0) {
        class13 var2 = this.field1341.field722;
        if (this.field1341 == var2) {
            this.field1342 = null;
            return null;
        }
        this.field1342 = var2.field722;
        if (arg0 != 0) {
            this.field1338 = !this.field1338;
        }
        return var2;
    }

    @OriginalMember(owner = "ROXEPOUC", name = "b", descriptor = "(I)LDLMMHADP;")
    public class13 method429(int arg0) {
        class13 var2 = this.field1342;
        if (this.field1341 == var2) {
            this.field1342 = null;
            return null;
        }
        this.field1342 = var2.field721;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ROXEPOUC", name = "a", descriptor = "(Z)LDLMMHADP;")
    public class13 method430(boolean arg0) {
        class13 var2 = this.field1342;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1341 == var2) {
            this.field1342 = null;
            return null;
        } else {
            this.field1342 = var2.field722;
            return var2;
        }
    }

    @OriginalMember(owner = "ROXEPOUC", name = "c", descriptor = "()V")
    public void method431() {
        if (this.field1341.field721 == this.field1341) {
            return;
        }
        while (true) {
            class13 var1 = this.field1341.field721;
            if (this.field1341 == var1) {
                return;
            }
            var1.method234();
        }
    }
}
