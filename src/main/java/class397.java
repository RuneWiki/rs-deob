import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class397 extends class486 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lll;")
    public class364 field5597;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lrga;")
    public static class238 field5600 = new class238(0, 0);

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lik;")
    public static class207 field5601 = new class207();

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Leea;II[B)V", line = 5)
    public class397(class131 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5597 = class294.method1914(true, arg2, false, arg1, arg3, arg0, 6406, 6406);
        this.field5597.method3445(false, false, 94);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 18)
    public static final void method2481(int arg0) {
        int var1 = 26 % ((arg0 - 1) / 45);
        class503.field7212 = new class319[50];
        field5599++;
        class557.field7828 = 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 29)
    public static void method2482(boolean arg0) {
        field5600 = null;
        field5601 = null;
        if (arg0) {
            method2482(true);
        }
    }
}
