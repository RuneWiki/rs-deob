import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CRZPTUPR")
public class class7 {

    @OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "I")
    private int field595 = 809;

    @OriginalMember(owner = "client!CRZPTUPR", name = "b", descriptor = "Z")
    private boolean field596 = true;

    @OriginalMember(owner = "client!CRZPTUPR", name = "c", descriptor = "B")
    private byte field597 = -90;

    @OriginalMember(owner = "client!CRZPTUPR", name = "d", descriptor = "LKMUPFLXI;")
    public class27 field598 = new class27();

    @OriginalMember(owner = "client!CRZPTUPR", name = "e", descriptor = "LKMUPFLXI;")
    private class27 field599;

    @OriginalMember(owner = "client!CRZPTUPR", name = "<init>", descriptor = "(B)V")
    public class7(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field598.field952 = this.field598;
        this.field598.field953 = this.field598;
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(LKMUPFLXI;)V")
    public void method176(class27 arg0) {
        if (arg0.field953 != null) {
            arg0.method272();
        }
        arg0.field953 = this.field598.field953;
        arg0.field952 = this.field598;
        arg0.field953.field952 = arg0;
        arg0.field952.field953 = arg0;
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(LKMUPFLXI;I)V")
    public void method177(class27 arg0, int arg1) {
        if (arg0.field953 != null) {
            arg0.method272();
        }
        arg0.field953 = this.field598;
        arg0.field952 = this.field598.field952;
        if (arg1 != 6) {
            this.field596 = !this.field596;
        }
        arg0.field953.field952 = arg0;
        arg0.field952.field953 = arg0;
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "()LKMUPFLXI;")
    public class27 method178() {
        class27 var1 = this.field598.field952;
        if (this.field598 == var1) {
            return null;
        } else {
            var1.method272();
            return var1;
        }
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "b", descriptor = "()LKMUPFLXI;")
    public class27 method179() {
        class27 var1 = this.field598.field952;
        if (this.field598 == var1) {
            this.field599 = null;
            return null;
        } else {
            this.field599 = var1.field952;
            return var1;
        }
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(B)LKMUPFLXI;")
    public class27 method180(byte arg0) {
        class27 var2 = this.field598.field953;
        if (arg0 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field598 == var2) {
            this.field599 = null;
            return null;
        } else {
            this.field599 = var2.field953;
            return var2;
        }
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "b", descriptor = "(B)LKMUPFLXI;")
    public class27 method181(byte arg0) {
        class27 var2 = this.field599;
        if (this.field598 == var2) {
            this.field599 = null;
            return null;
        }
        this.field599 = var2.field952;
        if (arg0 != 2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(Z)LKMUPFLXI;")
    public class27 method182(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class27 var3 = this.field599;
        if (this.field598 == var3) {
            this.field599 = null;
            return null;
        } else {
            this.field599 = var3.field953;
            return var3;
        }
    }

    @OriginalMember(owner = "client!CRZPTUPR", name = "c", descriptor = "()V")
    public void method183() {
        if (this.field598.field952 == this.field598) {
            return;
        }
        while (true) {
            class27 var1 = this.field598.field952;
            if (this.field598 == var1) {
                return;
            }
            var1.method272();
        }
    }
}
