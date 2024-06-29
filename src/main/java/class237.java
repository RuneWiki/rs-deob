import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class237 {

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Lrp;")
    private class288 field3587 = new class288(128);

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "Llt;")
    private class458 field3586;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Loq;")
    public static class231 field3580 = new class231("", 15);

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "[I")
    public static int[] field3585 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field3583 = 328;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "Llt;")
    public static class458 field3590;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V", line = 7)
    public final void method1421(int arg0, int arg1) {
        if (arg1 <= 36) {
            this.field3587 = null;
        }
        class288 var3 = this.field3587;
        synchronized (this.field3587) {
            this.field3587.method1760(arg0, 30398);
        }
        field3582++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1422(int arg0) {
        class107.field1870 = false;
        class181.field2811 = null;
        field3579++;
        class119.method831(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 37)
    public static final boolean method1423(String arg0, int arg1) {
        field3577++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class170.field2651; var2++) {
            if (arg0.equalsIgnoreCase(class373.field5453[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class241.field3635[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILo;)V", line = 63)
    public static final void method1424(int arg0, class24 arg1) {
        field3578++;
        class437.field6434 = arg1;
        if (arg0 != 0) {
            field3580 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 79)
    public final void method1425(int arg0) {
        class288 var2 = this.field3587;
        synchronized (this.field3587) {
            if (arg0 != 3) {
                this.method1426(-114);
            }
            this.field3587.method1749((byte) 125);
        }
        field3584++;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 97)
    public final void method1426(int arg0) {
        class288 var2 = this.field3587;
        synchronized (this.field3587) {
            this.field3587.method1761(-118);
        }
        field3588++;
        if (arg0 != 2) {
            method1423(null, -113);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)Ltg;", line = 114)
    public final class147 method1427(boolean arg0, int arg1) {
        field3581++;
        class288 var3 = this.field3587;
        class147 var4;
        synchronized (this.field3587) {
            var4 = (class147) this.field3587.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3586.method2715(arg1, 1, arg0);
        class147 var6 = new class147();
        if (var5 != null) {
            var6.method967(118, new class40(var5));
        }
        class288 var7 = this.field3587;
        synchronized (this.field3587) {
            this.field3587.method1758(1, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 142)
    public class237(class491 arg0, int arg1, class458 arg2) {
        this.field3586 = arg2;
        this.field3586.method2726((byte) 113, 1);
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V", line = 157)
    public static void method1428(int arg0) {
        field3580 = null;
        if (arg0 != 11616) {
            field3580 = null;
        }
        field3590 = null;
        field3585 = null;
    }
}
