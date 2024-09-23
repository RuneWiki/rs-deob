import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("URASIGRB")
public class class58 {

    @OriginalMember(owner = "URASIGRB", name = "a", descriptor = "I")
    private int field1506 = -21624;

    @OriginalMember(owner = "URASIGRB", name = "b", descriptor = "Z")
    private boolean field1507 = false;

    @OriginalMember(owner = "URASIGRB", name = "c", descriptor = "I")
    private int field1508 = 10369;

    @OriginalMember(owner = "URASIGRB", name = "d", descriptor = "Z")
    private boolean field1509 = false;

    @OriginalMember(owner = "URASIGRB", name = "e", descriptor = "B")
    private byte field1510 = -111;

    @OriginalMember(owner = "URASIGRB", name = "f", descriptor = "LOKDOXVFL;")
    public class40 field1511 = new class40();

    @OriginalMember(owner = "URASIGRB", name = "g", descriptor = "LOKDOXVFL;")
    private class40 field1512;

    @OriginalMember(owner = "URASIGRB", name = "<init>", descriptor = "(I)V")
    public class58(int arg0) {
        this.field1511.field1191 = this.field1511;
        if (arg0 != 41824) {
            this.field1507 = !this.field1507;
        }
        this.field1511.field1192 = this.field1511;
    }

    @OriginalMember(owner = "URASIGRB", name = "a", descriptor = "(LOKDOXVFL;)V")
    public void method500(class40 arg0) {
        if (arg0.field1192 != null) {
            arg0.method398();
        }
        arg0.field1192 = this.field1511.field1192;
        arg0.field1191 = this.field1511;
        arg0.field1192.field1191 = arg0;
        arg0.field1191.field1192 = arg0;
    }

    @OriginalMember(owner = "URASIGRB", name = "a", descriptor = "(ILOKDOXVFL;)V")
    public void method501(int arg0, class40 arg1) {
        if (arg0 >= 0) {
            this.field1507 = !this.field1507;
        }
        if (arg1.field1192 != null) {
            arg1.method398();
        }
        arg1.field1192 = this.field1511;
        arg1.field1191 = this.field1511.field1191;
        arg1.field1192.field1191 = arg1;
        arg1.field1191.field1192 = arg1;
    }

    @OriginalMember(owner = "URASIGRB", name = "a", descriptor = "()LOKDOXVFL;")
    public class40 method502() {
        class40 var1 = this.field1511.field1191;
        if (this.field1511 == var1) {
            return null;
        } else {
            var1.method398();
            return var1;
        }
    }

    @OriginalMember(owner = "URASIGRB", name = "b", descriptor = "()LOKDOXVFL;")
    public class40 method503() {
        class40 var1 = this.field1511.field1191;
        if (this.field1511 == var1) {
            this.field1512 = null;
            return null;
        } else {
            this.field1512 = var1.field1191;
            return var1;
        }
    }

    @OriginalMember(owner = "URASIGRB", name = "a", descriptor = "(B)LOKDOXVFL;")
    public class40 method504(byte arg0) {
        if (arg0 != -97) {
            this.field1508 = -194;
        }
        class40 var2 = this.field1511.field1192;
        if (this.field1511 == var2) {
            this.field1512 = null;
            return null;
        } else {
            this.field1512 = var2.field1192;
            return var2;
        }
    }

    @OriginalMember(owner = "URASIGRB", name = "a", descriptor = "(Z)LOKDOXVFL;")
    public class40 method505(boolean arg0) {
        if (arg0) {
            this.field1507 = !this.field1507;
        }
        class40 var2 = this.field1512;
        if (this.field1511 == var2) {
            this.field1512 = null;
            return null;
        } else {
            this.field1512 = var2.field1191;
            return var2;
        }
    }

    @OriginalMember(owner = "URASIGRB", name = "b", descriptor = "(Z)LOKDOXVFL;")
    public class40 method506(boolean arg0) {
        class40 var2 = this.field1512;
        if (this.field1511 == var2) {
            this.field1512 = null;
            return null;
        }
        this.field1512 = var2.field1192;
        if (arg0) {
            this.field1506 = 488;
        }
        return var2;
    }

    @OriginalMember(owner = "URASIGRB", name = "c", descriptor = "()V")
    public void method507() {
        if (this.field1511.field1191 == this.field1511) {
            return;
        }
        while (true) {
            class40 var1 = this.field1511.field1191;
            if (this.field1511 == var1) {
                return;
            }
            var1.method398();
        }
    }
}
