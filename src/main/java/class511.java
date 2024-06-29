import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class511 {

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    private int field7549 = 0;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lib;")
    private class106 field7545;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Lbf;")
    public static class372 field7546 = new class372(6, 4);

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "[Lpt;")
    public static class367[] field7547 = new class367[14];

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Lvu;")
    private class223 field7548;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lbg;")
    public static class324 field7543;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Lvu;", line = 4)
    public final class223 method3044(boolean arg0) {
        field7542++;
        if (!arg0) {
            this.method3044(true);
        }
        if (this.field7549 > 0 && this.field7545.field1466[this.field7549 - 1] != this.field7548) {
            class223 var2 = this.field7548;
            this.field7548 = var2.field3275;
            return var2;
        }
        while (this.field7549 < this.field7545.field1463) {
            class223 var3 = this.field7545.field1466[this.field7549++].field3275;
            if (this.field7545.field1466[this.field7549 - 1] != var3) {
                this.field7548 = var3.field3275;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Lvu;", line = 37)
    public final class223 method3045(int arg0) {
        this.field7549 = 0;
        if (arg0 == 4) {
            field7544++;
            return this.method3044(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 54)
    public static void method3046(int arg0) {
        field7546 = null;
        field7543 = null;
        field7547 = null;
        int var1 = 35 / ((-arg0 - 31) / 56);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lib;)V", line = 73)
    public class511(class106 arg0) {
        this.field7545 = arg0;
    }
}
