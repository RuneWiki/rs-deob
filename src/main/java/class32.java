import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KHIOJPOB")
public class class32 {

    @OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "I")
    private int field1027 = 959;

    @OriginalMember(owner = "client!KHIOJPOB", name = "b", descriptor = "Z")
    private boolean field1028 = false;

    @OriginalMember(owner = "client!KHIOJPOB", name = "c", descriptor = "LFFAASUKE;")
    public class13 field1029 = new class13();

    @OriginalMember(owner = "client!KHIOJPOB", name = "d", descriptor = "LFFAASUKE;")
    private class13 field1030;

    @OriginalMember(owner = "client!KHIOJPOB", name = "<init>", descriptor = "(B)V")
    public class32(byte arg0) {
        this.field1029.field735 = this.field1029;
        this.field1029.field736 = this.field1029;
        if (arg0 != 8) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "(LFFAASUKE;)V")
    public void method331(class13 arg0) {
        if (arg0.field736 != null) {
            arg0.method300();
        }
        arg0.field736 = this.field1029.field736;
        arg0.field735 = this.field1029;
        arg0.field736.field735 = arg0;
        arg0.field735.field736 = arg0;
    }

    @OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "()LFFAASUKE;")
    public class13 method332() {
        class13 var1 = this.field1029.field735;
        if (this.field1029 == var1) {
            return null;
        } else {
            var1.method300();
            return var1;
        }
    }

    @OriginalMember(owner = "client!KHIOJPOB", name = "b", descriptor = "()LFFAASUKE;")
    public class13 method333() {
        class13 var1 = this.field1029.field735;
        if (this.field1029 == var1) {
            this.field1030 = null;
            return null;
        } else {
            this.field1030 = var1.field735;
            return var1;
        }
    }

    @OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "(I)LFFAASUKE;")
    public class13 method334(int arg0) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        class13 var2 = this.field1030;
        if (this.field1029 == var2) {
            this.field1030 = null;
            return null;
        } else {
            this.field1030 = var2.field735;
            return var2;
        }
    }

    @OriginalMember(owner = "client!KHIOJPOB", name = "c", descriptor = "()I")
    public int method335() {
        int var1 = 0;
        for (class13 var2 = this.field1029.field735; var2 != this.field1029; var2 = var2.field735) {
            var1++;
        }
        return var1;
    }
}
