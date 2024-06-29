import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ABNYIQPF")
public class class2 {

    @OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "I")
    private int field5 = -901;

    @OriginalMember(owner = "client!ABNYIQPF", name = "b", descriptor = "Z")
    private boolean field6 = false;

    @OriginalMember(owner = "client!ABNYIQPF", name = "c", descriptor = "LIOXDUYYH;")
    public class26 field7 = new class26();

    @OriginalMember(owner = "client!ABNYIQPF", name = "d", descriptor = "LIOXDUYYH;")
    private class26 field8;

    @OriginalMember(owner = "client!ABNYIQPF", name = "<init>", descriptor = "(I)V")
    public class2(int arg0) {
        this.field7.field889 = this.field7;
        if (arg0 < 8 || arg0 > 8) {
            throw new NullPointerException();
        }
        this.field7.field890 = this.field7;
    }

    @OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "(LIOXDUYYH;)V")
    public void method2(class26 arg0) {
        if (arg0.field890 != null) {
            arg0.method304();
        }
        arg0.field890 = this.field7.field890;
        arg0.field889 = this.field7;
        arg0.field890.field889 = arg0;
        arg0.field889.field890 = arg0;
    }

    @OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "()LIOXDUYYH;")
    public class26 method3() {
        class26 var1 = this.field7.field889;
        if (this.field7 == var1) {
            return null;
        } else {
            var1.method304();
            return var1;
        }
    }

    @OriginalMember(owner = "client!ABNYIQPF", name = "b", descriptor = "()LIOXDUYYH;")
    public class26 method4() {
        class26 var1 = this.field7.field889;
        if (this.field7 == var1) {
            this.field8 = null;
            return null;
        } else {
            this.field8 = var1.field889;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "(Z)LIOXDUYYH;")
    public class26 method5(boolean arg0) {
        class26 var2 = this.field8;
        if (this.field7 == var2) {
            this.field8 = null;
            return null;
        }
        this.field8 = var2.field889;
        if (arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!ABNYIQPF", name = "c", descriptor = "()I")
    public int method6() {
        int var1 = 0;
        for (class26 var2 = this.field7.field889; var2 != this.field7; var2 = var2.field889) {
            var1++;
        }
        return var1;
    }
}
