import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public abstract class class297 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lbo;")
    public class511 field3881;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "Lff;")
    public static class9 field3879 = new class9(62, 6);

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "Lqe;")
    public static class326 field3880;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field3882;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1734(int arg0, byte arg1) {
        if (class99.field1482 == null) {
            class99.field1482 = new byte[4][class12.field251][class289.field3782];
        }
        field3883++;
        int var2 = 0;
        if (arg0 != 4) {
            return;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class12.field251; var3++) {
                for (int var4 = 0; var4 < class289.field3782; var4++) {
                    class99.field1482[var2][var3][var4] = arg1;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "()V", line = 48)
    public static final void method1735() {
        for (int var0 = 0; var0 < class238.field3189; var0++) {
            class37 var1 = class32.field525[var0];
            class191.method1231(var1);
            class32.field525[var0] = null;
        }
        class238.field3189 = 0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 64)
    public static void method1736(byte arg0) {
        field3879 = null;
        int var1 = 23 % ((57 - arg0) / 63);
        field3882 = null;
        field3880 = null;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lbo;)V", line = 81)
    public class297(class511 arg0) {
        this.field3881 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZII)V")
    public abstract void method245(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lnk;II)V")
    public abstract void method248(class501 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Z")
    public abstract boolean method240(boolean arg0);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)V")
    public abstract void method244(int arg0, boolean arg1);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public abstract void method246(int arg0);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
    public abstract void method241(boolean arg0, int arg1);
}
