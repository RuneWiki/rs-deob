import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class289 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Ltb;")
    private class450 field3590 = new class450(128);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lpl;")
    private class612 field3589;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
    public static int[] field3588 = new int[2];

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lrga;")
    public static class280 field3593 = new class280(17, 8);

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3595 = 0;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lf;")
    public static class536 field3594;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lof;")
    public static class540 field3592;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lss;", line = 6)
    public final class440 method1623(int arg0, int arg1) {
        field3591++;
        class450 var3 = this.field3590;
        class440 var4;
        synchronized (this.field3590) {
            if (arg1 != -8727) {
                field3596 = -78;
            }
            var4 = (class440) this.field3590.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3589.method3365(class366.method2007(255, arg0), 113, class330.method1875(-46, arg0));
        class440 var6 = new class440();
        if (var5 != null) {
            var6.method2348(new class630(var5), (byte) -67);
        }
        class450 var7 = this.field3590;
        synchronized (this.field3590) {
            this.field3590.method2409((long) arg0, var6, arg1 + 8728);
            return var6;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 35)
    public static void method1624(boolean arg0) {
        field3588 = null;
        if (arg0) {
            field3596 = -100;
        }
        field3593 = null;
        field3594 = null;
        field3592 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 71)
    public class289(class112 arg0, int arg1, class612 arg2) {
        this.field3589 = arg2;
        if (this.field3589 != null) {
            int var4 = this.field3589.method3342((byte) -107) - 1;
            this.field3589.method3349(var4, true);
        }
    }
}
