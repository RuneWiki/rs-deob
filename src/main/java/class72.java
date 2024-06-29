import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZXKMWHPZ")
public class class72 {

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "I")
    private int field1763 = 77;

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "b", descriptor = "Z")
    private boolean field1764 = true;

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "c", descriptor = "Z")
    private boolean field1765 = true;

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "d", descriptor = "Z")
    private boolean field1766 = false;

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "f", descriptor = "LJZLLDEPM;")
    public class30 field1768 = new class30();

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "e", descriptor = "I")
    private int field1767;

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "g", descriptor = "LJZLLDEPM;")
    private class30 field1769;

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "<init>", descriptor = "(B)V")
    public class72(byte arg0) {
        this.field1768.field1021 = this.field1768;
        if (arg0 != 8) {
            this.field1765 = !this.field1765;
        }
        this.field1768.field1022 = this.field1768;
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(LJZLLDEPM;)V")
    public void method595(class30 arg0) {
        if (arg0.field1022 != null) {
            arg0.method329();
        }
        arg0.field1022 = this.field1768.field1022;
        arg0.field1021 = this.field1768;
        arg0.field1022.field1021 = arg0;
        arg0.field1021.field1022 = arg0;
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(BLJZLLDEPM;)V")
    public void method596(byte arg0, class30 arg1) {
        if (arg0 != 2) {
            this.field1765 = !this.field1765;
        }
        if (arg1.field1022 != null) {
            arg1.method329();
        }
        arg1.field1022 = this.field1768;
        arg1.field1021 = this.field1768.field1021;
        arg1.field1022.field1021 = arg1;
        arg1.field1021.field1022 = arg1;
        if (class30.field1023) {
        }
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "()LJZLLDEPM;")
    public class30 method597() {
        class30 var1 = this.field1768.field1021;
        if (this.field1768 == var1) {
            return null;
        } else {
            var1.method329();
            return var1;
        }
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "b", descriptor = "()LJZLLDEPM;")
    public class30 method598() {
        class30 var1 = this.field1768.field1021;
        if (this.field1768 == var1) {
            this.field1769 = null;
            return null;
        } else {
            this.field1769 = var1.field1021;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(I)LJZLLDEPM;")
    public class30 method599(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        class30 var2 = this.field1768.field1022;
        if (this.field1768 == var2) {
            this.field1769 = null;
            return null;
        } else {
            this.field1769 = var2.field1022;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "b", descriptor = "(I)LJZLLDEPM;")
    public class30 method600(int arg0) {
        if (arg0 != 4) {
            this.field1767 = -58;
        }
        class30 var2 = this.field1769;
        if (this.field1768 == var2) {
            this.field1769 = null;
            return null;
        } else {
            this.field1769 = var2.field1021;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(Z)LJZLLDEPM;")
    public class30 method601(boolean arg0) {
        class30 var2 = this.field1769;
        if (!arg0) {
            this.field1763 = -178;
        }
        if (this.field1768 == var2) {
            this.field1769 = null;
            return null;
        } else {
            this.field1769 = var2.field1022;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ZXKMWHPZ", name = "c", descriptor = "()V")
    public void method602() {
        if (this.field1768.field1021 == this.field1768) {
            return;
        }
        while (true) {
            class30 var1 = this.field1768.field1021;
            if (this.field1768 == var1) {
                return;
            }
            var1.method329();
        }
    }
}
