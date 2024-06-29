import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class294 {

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Lme;")
    private class668 field3809 = new class668(64);

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lpe;")
    private class615 field3810;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Z")
    public static boolean field3806 = false;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "[Lvr;")
    public static class409[] field3818 = new class409[75];

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "[[Z")
    public static boolean[][] field3808;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/awt/Frame;Lufa;B)V")
    public static final void method1737(Frame arg0, class140 arg1, byte arg2) {
        if (arg2 <= 17) {
            return;
        }
        while (true) {
            class548 var3 = arg1.method1047(false, arg0);
            while (var3.field7108 == 0) {
                class122.method905(10L, -6145);
            }
            if (var3.field7108 == 1) {
                field3812++;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class122.method905(100L, -6145);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)V")
    public static final void method1738(byte arg0, int arg1, int arg2) {
        field3807++;
        class367 var3 = class573.method3057(15, 0, 2);
        var3.method2115(1);
        var3.field4735 = arg2;
        var3.field4736 = arg1;
        if (arg0 != 83) {
            field3811 = -14;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Lcw;")
    public static final class126 method1739(boolean arg0) {
        field3813++;
        class126 var1 = (class126) class91.field1201.method2102(-102);
        if (var1 == null) {
            if (!arg0) {
                field3811 = 116;
            }
            return new class126();
        } else {
            class683.field9392--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)V")
    public final void method1740(int arg0, byte arg1) {
        class668 var3 = this.field3809;
        synchronized (this.field3809) {
            this.field3809.method3659(-105, arg0);
            if (arg1 >= -3) {
                field3811 = -2;
            }
        }
        field3805++;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)Ldk;")
    public final class636 method1741(int arg0, byte arg1) {
        field3815++;
        class668 var3 = this.field3809;
        class636 var4;
        synchronized (this.field3809) {
            var4 = (class636) this.field3809.method3655(89, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field3810;
        byte[] var6;
        synchronized (this.field3810) {
            var6 = this.field3810.method3346(-1, 35, arg0);
        }
        class636 var7 = new class636();
        if (var6 != null) {
            var7.method3514(new class418(var6), (byte) -19);
        }
        var7.method3512(-22311);
        class668 var8 = this.field3809;
        synchronized (this.field3809) {
            this.field3809.method3650((long) arg0, -103, var7);
        }
        if (arg1 >= -19) {
            this.field3809 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public static void method1742(byte arg0) {
        field3808 = null;
        field3818 = null;
        if (arg0 != 30) {
            field3818 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public final void method1743(int arg0) {
        class668 var2 = this.field3809;
        synchronized (this.field3809) {
            this.field3809.method3656((byte) 0);
        }
        if (arg0 != 0) {
            method1737(null, null, (byte) -21);
        }
        field3814++;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class294(class635 arg0, int arg1, class615 arg2) {
        this.field3810 = arg2;
        if (this.field3810 != null) {
            this.field3810.method3341(35, -19046);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Loa;I)V")
    public static final void method1744(class43 arg0, int arg1) {
        if (class594.field8025) {
            class19.method110(arg0, -2);
        } else {
            class410.method2325(arg1 - 3, arg0);
        }
        field3817++;
        if (arg1 != 0) {
            method1739(false);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public final void method1745(int arg0) {
        class668 var2 = this.field3809;
        synchronized (this.field3809) {
            this.field3809.method3658(0);
            if (arg0 != 1) {
                this.field3809 = null;
            }
        }
        field3816++;
    }
}
