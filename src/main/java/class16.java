import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FYVRCFGT")
public class class16 {

    @OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "I")
    private int field706 = 14733;

    @OriginalMember(owner = "client!FYVRCFGT", name = "b", descriptor = "Z")
    private boolean field707 = false;

    @OriginalMember(owner = "client!FYVRCFGT", name = "c", descriptor = "LNQPZRHXK;")
    public class35 field708 = new class35();

    @OriginalMember(owner = "client!FYVRCFGT", name = "d", descriptor = "LNQPZRHXK;")
    private class35 field709;

    @OriginalMember(owner = "client!FYVRCFGT", name = "<init>", descriptor = "(Z)V")
    public class16(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field708.field1045 = this.field708;
        this.field708.field1046 = this.field708;
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(LNQPZRHXK;)V")
    public void method197(class35 arg0) {
        if (arg0.field1046 != null) {
            arg0.method326();
        }
        arg0.field1046 = this.field708.field1046;
        arg0.field1045 = this.field708;
        arg0.field1046.field1045 = arg0;
        arg0.field1045.field1046 = arg0;
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(LNQPZRHXK;I)V")
    public void method198(class35 arg0, int arg1) {
        if (arg0.field1046 != null) {
            arg0.method326();
        }
        arg0.field1046 = this.field708;
        arg0.field1045 = this.field708.field1045;
        if (arg1 == 8919) {
            arg0.field1046.field1045 = arg0;
            arg0.field1045.field1046 = arg0;
        }
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "()LNQPZRHXK;")
    public class35 method199() {
        class35 var1 = this.field708.field1045;
        if (this.field708 == var1) {
            return null;
        } else {
            var1.method326();
            return var1;
        }
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "b", descriptor = "()LNQPZRHXK;")
    public class35 method200() {
        class35 var1 = this.field708.field1045;
        if (this.field708 == var1) {
            this.field709 = null;
            return null;
        } else {
            this.field709 = var1.field1045;
            return var1;
        }
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(B)LNQPZRHXK;")
    public class35 method201(byte arg0) {
        class35 var2 = this.field708.field1046;
        if (this.field708 == var2) {
            this.field709 = null;
            return null;
        }
        this.field709 = var2.field1046;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(I)LNQPZRHXK;")
    public class35 method202(int arg0) {
        class35 var2 = this.field709;
        if (this.field708 == var2) {
            this.field709 = null;
            return null;
        }
        this.field709 = var2.field1045;
        if (arg0 != 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "b", descriptor = "(B)LNQPZRHXK;")
    public class35 method203(byte arg0) {
        class35 var2 = this.field709;
        if (this.field708 == var2) {
            this.field709 = null;
            return null;
        }
        this.field709 = var2.field1046;
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2;
    }

    @OriginalMember(owner = "client!FYVRCFGT", name = "c", descriptor = "()V")
    public void method204() {
        if (this.field708.field1045 == this.field708) {
            return;
        }
        while (true) {
            class35 var1 = this.field708.field1045;
            if (this.field708 == var1) {
                return;
            }
            var1.method326();
        }
    }
}
