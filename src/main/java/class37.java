import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PNEYGONI")
public class class37 {

    @OriginalMember(owner = "PNEYGONI", name = "a", descriptor = "I")
    private int field1310 = -3061;

    @OriginalMember(owner = "PNEYGONI", name = "b", descriptor = "Z")
    private boolean field1311 = false;

    @OriginalMember(owner = "PNEYGONI", name = "c", descriptor = "LOGGHOMII;")
    public class33 field1312 = new class33();

    @OriginalMember(owner = "PNEYGONI", name = "d", descriptor = "LOGGHOMII;")
    private class33 field1313;

    @OriginalMember(owner = "PNEYGONI", name = "<init>", descriptor = "(B)V")
    public class37(byte arg0) {
        this.field1312.field1177 = this.field1312;
        this.field1312.field1178 = this.field1312;
        if (arg0 != 33) {
            this.field1311 = !this.field1311;
        }
    }

    @OriginalMember(owner = "PNEYGONI", name = "a", descriptor = "(LOGGHOMII;)V")
    public void method438(class33 arg0) {
        if (arg0.field1178 != null) {
            arg0.method384();
        }
        arg0.field1178 = this.field1312.field1178;
        arg0.field1177 = this.field1312;
        arg0.field1178.field1177 = arg0;
        arg0.field1177.field1178 = arg0;
    }

    @OriginalMember(owner = "PNEYGONI", name = "a", descriptor = "()LOGGHOMII;")
    public class33 method439() {
        class33 var1 = this.field1312.field1177;
        if (this.field1312 == var1) {
            return null;
        } else {
            var1.method384();
            return var1;
        }
    }

    @OriginalMember(owner = "PNEYGONI", name = "b", descriptor = "()LOGGHOMII;")
    public class33 method440() {
        class33 var1 = this.field1312.field1177;
        if (this.field1312 == var1) {
            this.field1313 = null;
            return null;
        } else {
            this.field1313 = var1.field1177;
            return var1;
        }
    }

    @OriginalMember(owner = "PNEYGONI", name = "a", descriptor = "(I)LOGGHOMII;")
    public class33 method441(int arg0) {
        class33 var2 = this.field1313;
        if (arg0 != 5) {
            this.field1310 = 56;
        }
        if (this.field1312 == var2) {
            this.field1313 = null;
            return null;
        } else {
            this.field1313 = var2.field1177;
            return var2;
        }
    }

    @OriginalMember(owner = "PNEYGONI", name = "c", descriptor = "()I")
    public int method442() {
        int var1 = 0;
        for (class33 var2 = this.field1312.field1177; var2 != this.field1312; var2 = var2.field1177) {
            var1++;
        }
        return var1;
    }
}
