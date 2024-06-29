import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class726 {

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "Lpja;")
    private class43 field9980 = new class43(128);

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "Lpja;")
    public class43 field9982 = new class43(64);

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "Lgj;")
    private class662 field9971;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "Lgj;")
    public class662 field9975;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "Lafa;")
    public static class365 field9977 = new class365();

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V", line = 5)
    public static void method4026(int arg0) {
        if (arg0 <= 18) {
            method4030(-59, true, 91);
        }
        field9977 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method4027(boolean arg0, int arg1) {
        class43 var3 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method265(arg1, -40);
        }
        field9974++;
        if (!arg0) {
            class43 var4 = this.field9982;
            synchronized (this.field9982) {
                this.field9982.method265(arg1, -46);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V", line = 36)
    public final void method4028(int arg0, int arg1, int arg2) {
        if (arg0 == 55) {
            field9976++;
            this.field9980 = new class43(arg1);
            this.field9982 = new class43(arg2);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)V", line = 57)
    public static final void method4029(int arg0, byte arg1) {
        field9972++;
        if (arg1 >= -21) {
            field9977 = null;
        }
        class745.field10277 = arg0;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZI)Z", line = 69)
    public static final boolean method4030(int arg0, boolean arg1, int arg2) {
        field9973++;
        if (!arg1) {
            method4029(-23, (byte) -112);
        }
        if ((class787.method4289(arg2, arg0, (byte) 121) | (arg2 & 0x10000) != 0) || class137.method1133(arg2, arg0, 92)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class4.method23(arg2, false, arg0);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Lgka;", line = 83)
    public final class393 method4031(int arg0, int arg1) {
        field9979++;
        class43 var3 = this.field9980;
        class393 var4;
        synchronized (this.field9980) {
            var4 = (class393) this.field9980.method266((byte) -126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field9971;
        byte[] var6;
        synchronized (this.field9971) {
            var6 = this.field9971.method3732(arg1, 8906, arg0);
        }
        class393 var7 = new class393();
        var7.field5418 = arg1;
        var7.field5389 = this;
        if (var6 != null) {
            var7.method2383(new class93(var6), 1);
        }
        var7.method2377(115);
        class43 var8 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method270(var7, (long) arg1, arg0 - 159);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V", line = 113)
    public final void method4032(int arg0) {
        field9978++;
        class43 var2 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method273(127);
        }
        class43 var3 = this.field9982;
        synchronized (this.field9982) {
            this.field9982.method273(126);
            if (arg0 > -41) {
                this.method4028(44, -84, -30);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lim;ILgj;Lgj;)V", line = 150)
    public class726(class598 arg0, int arg1, class662 arg2, class662 arg3) {
        this.field9971 = arg2;
        this.field9975 = arg3;
        this.field9971.method3730((byte) -99, 36);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V", line = 136)
    public final void method4033(byte arg0) {
        class43 var2 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method272(20);
        }
        field9981++;
        int var3 = -100 / ((-arg0 - 1) / 38);
        class43 var4 = this.field9982;
        synchronized (this.field9982) {
            this.field9982.method272(20);
        }
    }
}
