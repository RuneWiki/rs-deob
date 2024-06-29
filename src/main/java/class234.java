import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class234 {

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Lrp;")
    private class288 field3561 = new class288(64);

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Llt;")
    private class458 field3563;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "Loe;")
    public static class127 field3556 = new class127(65, 4);

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "F")
    public static float field3555;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V", line = 7)
    public static final void method1403(int arg0, int arg1, int arg2) {
        field3559++;
        if (arg1 < 45) {
            method1403(109, 97, -106);
        }
        class64 var3 = class230.method1387(arg0, (byte) 40, 13);
        var3.method441((byte) 58);
        var3.field1051 = arg2;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 22)
    public static void method1404(byte arg0) {
        if (arg0 != 25) {
            field3556 = null;
        }
        field3556 = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)Lqk;", line = 36)
    public final class14 method1405(int arg0, int arg1) {
        if (arg1 >= -120) {
            return null;
        }
        field3558++;
        class288 var3 = this.field3561;
        class14 var4;
        synchronized (this.field3561) {
            var4 = (class14) this.field3561.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3563.method2715(arg0, 32, false);
        class14 var6 = new class14();
        if (var5 != null) {
            var6.method74(new class40(var5), (byte) 112);
        }
        class288 var7 = this.field3561;
        synchronized (this.field3561) {
            this.field3561.method1758(1, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 63)
    public static final void method1406(int arg0) {
        field3562++;
        class295.field4482 = new class467(8);
        if (arg0 > 9) {
            class455.field6981 = 0;
            for (class477 var1 = (class477) class139.field2285.method1319(49); var1 != null; var1 = (class477) class139.field2285.method1320((byte) -110)) {
                var1.method2881();
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V", line = 84)
    public final void method1407(boolean arg0, int arg1) {
        class288 var3 = this.field3561;
        synchronized (this.field3561) {
            if (arg0) {
                this.method1407(false, -126);
            }
            this.field3561.method1760(arg1, 30398);
        }
        field3554++;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 98)
    public final void method1408(int arg0) {
        if (arg0 > -113) {
            this.method1408(-20);
        }
        field3560++;
        class288 var2 = this.field3561;
        synchronized (this.field3561) {
            this.field3561.method1761(-112);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 111)
    public final void method1409(boolean arg0) {
        class288 var2 = this.field3561;
        synchronized (this.field3561) {
            this.field3561.method1749((byte) -57);
        }
        field3552++;
        if (!arg0) {
            field3556 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lro;I)V", line = 124)
    public static final void method1410(class2 arg0, int arg1) {
        field3553++;
        if (class381.field5555) {
            return;
        }
        arg0.method1121(false);
        if (arg1 != 25438) {
            method1410(null, -106);
        }
        class330.field4948--;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 151)
    public class234(class491 arg0, int arg1, class458 arg2) {
        this.field3563 = arg2;
        this.field3563.method2726((byte) 113, 32);
    }
}
