import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class260 {

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lff;")
    private class9 field3579 = new class9(64);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lvh;")
    private class240 field3578;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "F")
    public static float field3580 = 0.0F;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3581 = 503;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ljm;")
    public static class485 field3584 = new class485(53, 3);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lwo;")
    public static class522 field3585 = new class522();

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
    public final void method1504(int arg0, byte arg1) {
        field3577++;
        class9 var3 = this.field3579;
        synchronized (this.field3579) {
            this.field3579.method61((byte) -67, arg0);
        }
        if (arg1 != -25) {
            this.method1505(false, -90);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Lio;")
    public final class300 method1505(boolean arg0, int arg1) {
        field3576++;
        class9 var3 = this.field3579;
        class300 var4;
        synchronized (this.field3579) {
            var4 = (class300) this.field3579.method56((long) arg1, 32);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3578.method1411(arg0, arg1, 31);
        class300 var6 = new class300();
        if (var5 != null) {
            var6.method1715(-118, new class365(var5));
        }
        class9 var7 = this.field3579;
        synchronized (this.field3579) {
            if (arg0) {
                this.field3579.method73((long) arg1, var6, 26425);
                return var6;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3585 = null;
        if (arg0 < 83) {
            field3584 = null;
        }
        field3584 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public final void method1507(int arg0) {
        field3582++;
        class9 var2 = this.field3579;
        synchronized (this.field3579) {
            this.field3579.method67(-121);
        }
        if (arg0 != 0) {
            this.method1504(84, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public final void method1508(int arg0) {
        class9 var2 = this.field3579;
        synchronized (this.field3579) {
            this.field3579.method65(false);
        }
        field3583++;
        if (arg0 != 5108) {
            this.method1508(-83);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class260(class157 arg0, int arg1, class240 arg2) {
        this.field3578 = arg2;
        this.field3578.method1397((byte) -110, 31);
    }
}
