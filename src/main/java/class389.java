import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class389 {

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lka;")
    private class473 field5619 = new class473(64);

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lka;")
    public class473 field5622 = new class473(2);

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Ldk;")
    public class421 field5620;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Ldk;")
    private class421 field5621;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lhi;")
    public static class45 field5611 = new class45(55, 2);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lat;")
    public static class444 field5616 = null;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lhh;", line = 5)
    public final class505 method2304(int arg0, int arg1) {
        field5617++;
        class473 var3 = this.field5619;
        class505 var4;
        synchronized (this.field5619) {
            var4 = (class505) this.field5619.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field5621;
        byte[] var6;
        synchronized (this.field5621) {
            var6 = this.field5621.method2512(33, (byte) -93, arg1);
        }
        class505 var7 = new class505();
        if (arg0 != -17450) {
            field5616 = null;
        }
        var7.field7383 = this;
        if (var6 != null) {
            var7.method2998(new class319(var6), true);
        }
        class473 var8 = this.field5619;
        synchronized (this.field5619) {
            this.field5619.method2777(arg0 + 16425, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V", line = 43)
    public final void method2305(int arg0, int arg1) {
        field5612++;
        class473 var3 = this.field5619;
        synchronized (this.field5619) {
            this.field5619.method2779(14896, arg0);
            if (arg1 > -71) {
                this.method2304(38, -1);
            }
        }
        class473 var4 = this.field5622;
        synchronized (this.field5622) {
            this.field5622.method2779(14896, arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 60)
    public final void method2306(int arg0) {
        class473 var2 = this.field5619;
        synchronized (this.field5619) {
            if (arg0 != 5832) {
                field5611 = null;
            }
            this.field5619.method2764(-769);
        }
        field5613++;
        class473 var3 = this.field5622;
        synchronized (this.field5622) {
            this.field5622.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 76)
    public final void method2307(int arg0) {
        field5614++;
        class473 var2 = this.field5619;
        synchronized (this.field5619) {
            this.field5619.method2774((byte) 117);
        }
        class473 var3 = this.field5622;
        synchronized (this.field5622) {
            if (arg0 == 33) {
                this.field5622.method2774((byte) -105);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIBII)V", line = 98)
    public static final void method2308(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5615++;
        if (arg0 == arg4) {
            class40.method280(false, arg1, arg2, arg5, arg4);
            return;
        }
        if (class519.field7633 <= (arg5 - arg4) && class375.field5387 >= (arg4 + arg5) && arg1 - arg0 >= class23.field320 && arg0 + arg1 <= class233.field3241) {
            class327.method1938(arg0, arg4, arg2, arg5, arg1, false);
        } else {
            class3.method23(arg1, arg0, arg4, (byte) -63, arg5, arg2);
        }
        if (arg3 < 106) {
            field5611 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V", line = 121)
    public static void method2309(int arg0) {
        if (arg0 <= 55) {
            method2308(20, -64, -16, (byte) -56, 51, -101);
        }
        field5616 = null;
        field5611 = null;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lad;ILdk;Ldk;)V", line = 149)
    public class389(class12 arg0, int arg1, class421 arg2, class421 arg3) {
        this.field5620 = arg3;
        this.field5621 = arg2;
        this.field5621.method2509(0, 33);
    }
}
