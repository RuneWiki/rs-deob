import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JQOEJEDB")
public class class25 {

    @OriginalMember(owner = "JQOEJEDB", name = "a", descriptor = "I")
    private int field990 = 3;

    @OriginalMember(owner = "JQOEJEDB", name = "b", descriptor = "I")
    private int field991 = 8;

    @OriginalMember(owner = "JQOEJEDB", name = "c", descriptor = "Z")
    private boolean field992 = false;

    @OriginalMember(owner = "JQOEJEDB", name = "e", descriptor = "LAIZKCREI;")
    public class1 field994 = new class1();

    @OriginalMember(owner = "JQOEJEDB", name = "d", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "JQOEJEDB", name = "f", descriptor = "LAIZKCREI;")
    private class1 field995;

    @OriginalMember(owner = "JQOEJEDB", name = "<init>", descriptor = "(I)V")
    public class25(int arg0) {
        if (this.field990 != arg0) {
            this.field993 = 153;
        }
        this.field994.field2 = this.field994;
        this.field994.field3 = this.field994;
    }

    @OriginalMember(owner = "JQOEJEDB", name = "a", descriptor = "(LAIZKCREI;)V")
    public void method326(class1 arg0) {
        if (arg0.field3 != null) {
            arg0.method1();
        }
        arg0.field3 = this.field994.field3;
        arg0.field2 = this.field994;
        arg0.field3.field2 = arg0;
        arg0.field2.field3 = arg0;
    }

    @OriginalMember(owner = "JQOEJEDB", name = "a", descriptor = "(ILAIZKCREI;)V")
    public void method327(int arg0, class1 arg1) {
        if (arg1.field3 != null) {
            arg1.method1();
        }
        arg1.field3 = this.field994;
        arg1.field2 = this.field994.field2;
        arg1.field3.field2 = arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        arg1.field2.field3 = arg1;
        if (class1.field4) {
        }
    }

    @OriginalMember(owner = "JQOEJEDB", name = "a", descriptor = "()LAIZKCREI;")
    public class1 method328() {
        class1 var1 = this.field994.field2;
        if (this.field994 == var1) {
            return null;
        } else {
            var1.method1();
            return var1;
        }
    }

    @OriginalMember(owner = "JQOEJEDB", name = "b", descriptor = "()LAIZKCREI;")
    public class1 method329() {
        class1 var1 = this.field994.field2;
        if (this.field994 == var1) {
            this.field995 = null;
            return null;
        } else {
            this.field995 = var1.field2;
            return var1;
        }
    }

    @OriginalMember(owner = "JQOEJEDB", name = "a", descriptor = "(I)LAIZKCREI;")
    public class1 method330(int arg0) {
        if (this.field991 != arg0) {
            this.field993 = 488;
        }
        class1 var2 = this.field994.field3;
        if (this.field994 == var2) {
            this.field995 = null;
            return null;
        } else {
            this.field995 = var2.field3;
            return var2;
        }
    }

    @OriginalMember(owner = "JQOEJEDB", name = "b", descriptor = "(I)LAIZKCREI;")
    public class1 method331(int arg0) {
        class1 var2 = this.field995;
        if (arg0 < 9 || arg0 > 9) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field994 == var2) {
            this.field995 = null;
            return null;
        } else {
            this.field995 = var2.field2;
            return var2;
        }
    }

    @OriginalMember(owner = "JQOEJEDB", name = "a", descriptor = "(Z)LAIZKCREI;")
    public class1 method332(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class1 var3 = this.field995;
        if (this.field994 == var3) {
            this.field995 = null;
            return null;
        } else {
            this.field995 = var3.field3;
            return var3;
        }
    }

    @OriginalMember(owner = "JQOEJEDB", name = "c", descriptor = "()V")
    public void method333() {
        if (this.field994.field2 == this.field994) {
            return;
        }
        while (true) {
            class1 var1 = this.field994.field2;
            if (this.field994 == var1) {
                return;
            }
            var1.method1();
        }
    }
}
