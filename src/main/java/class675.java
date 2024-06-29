import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class675 {

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "Ljga;")
    private class143 field9616 = new class143();

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "Lgd;")
    private class346 field9622 = new class346();

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    private int field9620;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    private int field9621;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "Lmo;")
    private class482 field9623;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "Leda;")
    public static class116 field9617 = new class116(66, 8);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public final void method3821(int arg0) {
        this.field9622.method2103((byte) -42);
        field9618++;
        this.field9623.method2821(arg0);
        this.field9616 = new class143();
        this.field9621 = this.field9620;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public static void method3822(byte arg0) {
        field9617 = null;
        if (arg0 < 77) {
            method3822((byte) 117);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(JI)Ljga;")
    public final class143 method3823(long arg0, int arg1) {
        if (arg1 != -1) {
            return null;
        }
        field9619++;
        class143 var4 = (class143) this.field9623.method2818(-22803, arg0);
        if (var4 != null) {
            this.field9622.method2107(true, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(JILjga;)V")
    public final void method3824(long arg0, int arg1, class143 arg2) {
        if (arg1 != -91) {
            this.method3821(84);
        }
        if (this.field9621 == 0) {
            class143 var5 = this.field9622.method2105(-4488);
            var5.method2549((byte) -97);
            var5.method1113(32730);
            if (this.field9616 == var5) {
                class143 var6 = this.field9622.method2105(-4488);
                var6.method2549((byte) 36);
                var6.method1113(32730);
            }
        } else {
            this.field9621--;
        }
        field9615++;
        this.field9623.method2816(arg2, arg0, false);
        this.field9622.method2107(true, arg2);
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(I)V")
    public class675(int arg0) {
        this.field9620 = arg0;
        this.field9621 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field9623 = new class482(var2);
    }
}
