import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SXQMCHPP")
public class class56 {

    @OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "I")
    private int field1517 = -76;

    @OriginalMember(owner = "client!SXQMCHPP", name = "b", descriptor = "Z")
    private boolean field1518 = false;

    @OriginalMember(owner = "client!SXQMCHPP", name = "c", descriptor = "LYNSWJIIM;")
    public class67 field1519 = new class67();

    @OriginalMember(owner = "client!SXQMCHPP", name = "d", descriptor = "LYNSWJIIM;")
    private class67 field1520;

    @OriginalMember(owner = "client!SXQMCHPP", name = "<init>", descriptor = "(I)V")
    public class56(int arg0) {
        this.field1519.field1686 = this.field1519;
        if (arg0 < 5 || arg0 > 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1519.field1687 = this.field1519;
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(LYNSWJIIM;)V")
    public void method506(class67 arg0) {
        if (arg0.field1687 != null) {
            arg0.method588();
        }
        arg0.field1687 = this.field1519.field1687;
        arg0.field1686 = this.field1519;
        arg0.field1687.field1686 = arg0;
        arg0.field1686.field1687 = arg0;
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(LYNSWJIIM;I)V")
    public void method507(class67 arg0, int arg1) {
        if (arg0.field1687 != null) {
            arg0.method588();
        }
        arg0.field1687 = this.field1519;
        arg0.field1686 = this.field1519.field1686;
        arg0.field1687.field1686 = arg0;
        if (arg1 == 0) {
            arg0.field1686.field1687 = arg0;
        }
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "()LYNSWJIIM;")
    public class67 method508() {
        class67 var1 = this.field1519.field1686;
        if (this.field1519 == var1) {
            return null;
        } else {
            var1.method588();
            return var1;
        }
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "b", descriptor = "()LYNSWJIIM;")
    public class67 method509() {
        class67 var1 = this.field1519.field1686;
        if (this.field1519 == var1) {
            this.field1520 = null;
            return null;
        } else {
            this.field1520 = var1.field1686;
            return var1;
        }
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(B)LYNSWJIIM;")
    public class67 method510(byte arg0) {
        class67 var2 = this.field1519.field1687;
        if (arg0 != 61) {
            this.field1518 = !this.field1518;
        }
        if (this.field1519 == var2) {
            this.field1520 = null;
            return null;
        } else {
            this.field1520 = var2.field1687;
            return var2;
        }
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(I)LYNSWJIIM;")
    public class67 method511(int arg0) {
        class67 var2 = this.field1520;
        if (this.field1519 == var2) {
            this.field1520 = null;
            return null;
        }
        this.field1520 = var2.field1686;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "b", descriptor = "(B)LYNSWJIIM;")
    public class67 method512(byte arg0) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        class67 var3 = this.field1520;
        if (this.field1519 == var3) {
            this.field1520 = null;
            return null;
        } else {
            this.field1520 = var3.field1687;
            return var3;
        }
    }

    @OriginalMember(owner = "client!SXQMCHPP", name = "c", descriptor = "()V")
    public void method513() {
        if (this.field1519.field1686 == this.field1519) {
            return;
        }
        while (true) {
            class67 var1 = this.field1519.field1686;
            if (this.field1519 == var1) {
                return;
            }
            var1.method588();
        }
    }
}
