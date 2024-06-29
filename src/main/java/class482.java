import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class482 {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lmf;")
    private class291 field7108;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Ls;")
    public static class186 field7110 = new class186(31, -1);

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "S")
    public static short field7113 = 32767;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Les;")
    private class261 field7109;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[I")
    public static int[] field7106;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILmf;)V", line = 8)
    public final void method2892(int arg0, class291 arg1) {
        this.field7108 = arg1;
        if (arg0 <= 107) {
            field7113 = -48;
        }
        field7112++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Les;", line = 21)
    public final class261 method2893(int arg0) {
        field7111++;
        class261 var2 = this.field7108.field4458.field3972;
        if (this.field7108.field4458 == var2) {
            this.field7109 = null;
            return null;
        } else {
            this.field7109 = var2.field3972;
            int var3 = -126 / ((-arg0 - 27) / 52);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 40)
    public class482() {
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 45)
    public static void method2894(int arg0) {
        field7106 = null;
        field7110 = null;
        if (arg0 != 31) {
            field7113 = -123;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lmf;)V", line = 60)
    public class482(class291 arg0) {
        this.field7108 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)Les;", line = 70)
    public final class261 method2895(int arg0) {
        if (arg0 != 31) {
            method2894(-103);
        }
        field7107++;
        class261 var2 = this.field7109;
        if (this.field7108.field4458 == var2) {
            this.field7109 = null;
            return null;
        } else {
            this.field7109 = var2.field3972;
            return var2;
        }
    }
}
