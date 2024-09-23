import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PUBJBHOK")
public class class42 {

    @OriginalMember(owner = "PUBJBHOK", name = "a", descriptor = "I")
    private int field1015 = -591;

    @OriginalMember(owner = "PUBJBHOK", name = "b", descriptor = "I")
    private int field1016 = 28077;

    @OriginalMember(owner = "PUBJBHOK", name = "c", descriptor = "LTSSAWEFF;")
    public class53 field1017 = new class53();

    @OriginalMember(owner = "PUBJBHOK", name = "d", descriptor = "LTSSAWEFF;")
    private class53 field1018;

    @OriginalMember(owner = "PUBJBHOK", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        this.field1017.field1327 = this.field1017;
        this.field1017.field1328 = this.field1017;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "PUBJBHOK", name = "a", descriptor = "(LTSSAWEFF;)V")
    public void method373(class53 arg0) {
        if (arg0.field1328 != null) {
            arg0.method492();
        }
        arg0.field1328 = this.field1017.field1328;
        arg0.field1327 = this.field1017;
        arg0.field1328.field1327 = arg0;
        arg0.field1327.field1328 = arg0;
    }

    @OriginalMember(owner = "PUBJBHOK", name = "a", descriptor = "(ILTSSAWEFF;)V")
    public void method374(int arg0, class53 arg1) {
        if (arg1.field1328 != null) {
            arg1.method492();
        }
        arg1.field1328 = this.field1017;
        arg1.field1327 = this.field1017.field1327;
        arg1.field1328.field1327 = arg1;
        arg1.field1327.field1328 = arg1;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "PUBJBHOK", name = "a", descriptor = "()LTSSAWEFF;")
    public class53 method375() {
        class53 var1 = this.field1017.field1327;
        if (this.field1017 == var1) {
            return null;
        } else {
            var1.method492();
            return var1;
        }
    }

    @OriginalMember(owner = "PUBJBHOK", name = "b", descriptor = "()LTSSAWEFF;")
    public class53 method376() {
        class53 var1 = this.field1017.field1327;
        if (this.field1017 == var1) {
            this.field1018 = null;
            return null;
        } else {
            this.field1018 = var1.field1327;
            return var1;
        }
    }

    @OriginalMember(owner = "PUBJBHOK", name = "a", descriptor = "(B)LTSSAWEFF;")
    public class53 method377(byte arg0) {
        class53 var2 = this.field1017.field1328;
        if (this.field1017 == var2) {
            this.field1018 = null;
            return null;
        }
        this.field1018 = var2.field1328;
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "PUBJBHOK", name = "a", descriptor = "(I)LTSSAWEFF;")
    public class53 method378(int arg0) {
        class53 var2 = this.field1018;
        if (arg0 != 0) {
            this.field1016 = 252;
        }
        if (this.field1017 == var2) {
            this.field1018 = null;
            return null;
        } else {
            this.field1018 = var2.field1327;
            return var2;
        }
    }

    @OriginalMember(owner = "PUBJBHOK", name = "b", descriptor = "(I)LTSSAWEFF;")
    public class53 method379(int arg0) {
        class53 var2 = this.field1018;
        if (this.field1017 == var2) {
            this.field1018 = null;
            return null;
        }
        this.field1018 = var2.field1328;
        if (arg0 < 1 || arg0 > 1) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "PUBJBHOK", name = "c", descriptor = "()V")
    public void method380() {
        if (this.field1017.field1327 == this.field1017) {
            return;
        }
        while (true) {
            class53 var1 = this.field1017.field1327;
            if (this.field1017 == var1) {
                return;
            }
            var1.method492();
        }
    }
}
