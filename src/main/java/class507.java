import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class507 {

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lrv;")
    public class112 field7154 = new class112();

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Lkg;")
    public static class275 field7155 = new class275(90, 0);

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Lkg;")
    public static class275 field7156 = new class275(88, 10);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "Lrv;")
    private class112 field7157;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Ljha;")
    public static class697 field7153;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final void method2956(byte arg0) {
        field7152++;
        while (true) {
            class112 var2 = this.field7154.field1623;
            if (this.field7154 == var2) {
                if (arg0 <= 114) {
                    field7153 = null;
                }
                this.field7157 = null;
                return;
            }
            var2.method889((byte) 78);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
    public final int method2957(int arg0) {
        field7149++;
        if (arg0 != 10) {
            this.method2957(-67);
        }
        int var2 = 0;
        for (class112 var3 = this.field7154.field1623; var3 != this.field7154; var3 = var3.field1623) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLrv;)V")
    public final void method2958(boolean arg0, class112 arg1) {
        if (!arg0) {
            this.method2956((byte) -69);
        }
        field7151++;
        if (arg1.field1622 != null) {
            arg1.method889((byte) 118);
        }
        arg1.field1622 = this.field7154.field1622;
        arg1.field1623 = this.field7154;
        arg1.field1622.field1623 = arg1;
        arg1.field1623.field1622 = arg1;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Lrv;")
    public final class112 method2959(int arg0) {
        field7158++;
        int var2 = 77 / ((8 - arg0) / 37);
        class112 var3 = this.field7157;
        if (this.field7154 == var3) {
            this.field7157 = null;
            return null;
        } else {
            this.field7157 = var3.field1623;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    public static void method2960(int arg0) {
        field7153 = null;
        if (arg0 != 15285) {
            field7156 = null;
        }
        field7156 = null;
        field7155 = null;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Lrv;")
    public final class112 method2961(byte arg0) {
        field7150++;
        class112 var2 = this.field7154.field1623;
        if (this.field7154 == var2) {
            this.field7157 = null;
            return null;
        } else {
            int var3 = -38 / ((arg0 - 10) / 62);
            this.field7157 = var2.field1623;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public class507() {
        this.field7154.field1623 = this.field7154;
        this.field7154.field1622 = this.field7154;
    }
}
