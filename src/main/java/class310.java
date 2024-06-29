import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class310 {

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    private int field4377 = 0;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lmp;")
    private class758 field4378;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "Lqaa;")
    public static class27 field4382 = new class27(52, 8);

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "Lmp;")
    public static class758 field4383 = new class758(8);

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "[I")
    public static int[] field4384 = new int[25];

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "Ltq;")
    private class626 field4375;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "Z")
    public static boolean field4379;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 7)
    public static void method2010(int arg0) {
        field4383 = null;
        if (arg0 == 52) {
            field4384 = null;
            field4382 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILfca;)V", line = 19)
    public static final void method2011(int arg0, class84 arg1) {
        field4381++;
        if (arg0 >= -68) {
            field4382 = null;
        }
        for (class235 var2 = (class235) class240.field3372.method1522(true); var2 != null; var2 = (class235) class240.field3372.method1527((byte) 95)) {
            if (var2.field3328 == arg1) {
                if (var2.field3338 != null) {
                    class484.field6848.method4051(var2.field3338);
                    var2.field3338 = null;
                }
                var2.method3617(1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)Ltq;", line = 55)
    public final class626 method2012(int arg0) {
        field4380++;
        if (arg0 > ~this.field4377 && this.field4378.field10537[this.field4377 - 1] != this.field4375) {
            class626 var2 = this.field4375;
            this.field4375 = var2.field8990;
            return var2;
        }
        while (this.field4377 < this.field4378.field10543) {
            class626 var3 = this.field4378.field10537[this.field4377++].field8990;
            if (this.field4378.field10537[this.field4377 - 1] != var3) {
                this.field4375 = var3.field8990;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Ltq;", line = 84)
    public final class626 method2013(byte arg0) {
        field4376++;
        this.field4377 = 0;
        int var2 = -110 % ((5 - arg0) / 32);
        return this.method2012(-1);
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V", line = 100)
    public class310() {
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lmp;)V", line = 109)
    public class310(class758 arg0) {
        this.field4378 = arg0;
    }
}
