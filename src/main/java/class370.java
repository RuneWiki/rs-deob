import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class370 extends class60 {

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    private int field5614;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field5609;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    private int field5610;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    private int field5608;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Laa;")
    public static class76 field5611 = new class76(69, 7);

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field5616 = 0;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
    public final void method429(int arg0, int arg1, int arg2) {
        ++field5607;
        if (arg0 == -201) {
            int var4 = this.field5614 * arg2 >> 12;
            int var5 = this.field5609 * arg2 >> 12;
            int var6 = this.field5610 * arg1 >> 12;
            int var7 = this.field5608 * arg1 >> 12;
            class164.method1151(var7, var6, var5, super.field822, -118, var4, super.field820, super.field819);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field5613;
        int var4 = this.field5614 * arg1 >> 12;
        int var5 = this.field5609 * arg1 >> 12;
        if (arg0 != 25878) {
            method2210((class11) null, -49, -110, -106, (class497) null);
        }
        int var6 = this.field5610 * arg2 >> 12;
        int var7 = this.field5608 * arg2 >> 12;
        class488.method2914(super.field819, var6, super.field820, var4, var7, var5, arg0 + -25797);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V")
    public final void method431(int arg0, int arg1, int arg2) {
        ++field5615;
        int var4 = this.field5614 * arg2 >> 12;
        if (arg1 != -76) {
            this.field5609 = -46;
        }
        int var5 = this.field5609 * arg2 >> 12;
        int var6 = this.field5610 * arg0 >> 12;
        int var7 = this.field5608 * arg0 >> 12;
        class437.method2569(var7, super.field822, var6, 29905, var4, var5);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method2209(int arg0) {
        if (arg0 != -1526725172) {
            method2209(-28);
        }
        field5611 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lya;IIILfr;)V")
    public static final void method2210(class11 arg0, int arg1, int arg2, int arg3, class497 arg4) {
        ++field5612;
        if (arg1 != -29770) {
            field5611 = null;
        }
        class6.field59.method2955(2131289328);
        if (!class241.field3357) {
            for (class219 var5 = (class219) arg4.method2957(arg1 + 29882); var5 != null; var5 = (class219) arg4.method2947(arg1 + 29655)) {
                class473 var6 = class137.field2014.method699(var5.field3137, 113);
                if (class403.method2432((byte) 0, var6)) {
                    boolean var7 = class305.method1901(arg2, arg3, var6, false, arg0, var5);
                    if (var7) {
                        class411.method2468(var5, -12035, var6, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIII)V")
    public class370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5614 = arg0;
        this.field5609 = arg2;
        this.field5610 = arg1;
        this.field5608 = arg3;
    }
}
