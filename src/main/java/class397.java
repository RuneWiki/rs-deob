import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class397 extends class601 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
    public static int[] field5436 = new int[3];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Z")
    public static boolean field5443 = false;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method2431(int arg0) {
        if (arg0 == 15214) {
            field5436 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)I")
    public final int method2432(int arg0) {
        int var2 = 19 % ((-59 - arg0) / 61);
        ++field5439;
        return super.field8565;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2433(long arg0, int arg1) {
        ++field5438;
        class2.field10.setTime(new Date(arg0));
        int var3 = class2.field10.get(7);
        int var4 = class2.field10.get(5);
        int var5 = class2.field10.get(2);
        int var6 = class2.field10.get(1);
        int var7 = class2.field10.get(11);
        if (arg1 != -2209) {
            field5443 = true;
        }
        int var8 = class2.field10.get(12);
        int var9 = class2.field10.get(13);
        return class599.field8541[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class572.field8138[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            field5443 = true;
        }
        ++field5435;
        return 0;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)Z")
    public final boolean method2434(int arg0) {
        if (arg0 != -9242) {
            this.method2432(-75);
        }
        ++field5447;
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Z")
    public final boolean method2435(boolean arg0) {
        if (arg0) {
            field5436 = null;
        }
        ++field5441;
        return class584.method3356(-4, super.field8565);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLlba;)V")
    public static final void method2436(boolean arg0, class547 arg1) {
        ++field5442;
        arg1.field7866 = null;
        int var2 = arg1.field7870.length;
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            arg1.field7870[var3].field8082 = false;
        }
        if (arg0) {
            field5436 = null;
        }
        class454[] var4 = class62.field640;
        synchronized (class62.field640) {
            if (var2 < class62.field640.length && ~class501.field7045[var2] > -201) {
                class62.field640[var2].method2792((byte) -13, arg1);
                int var10002 = class501.field7045[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        if (!arg1) {
            super.field8565 = arg0;
            ++field5440;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field5444;
        if (class584.method3356(-4, arg0)) {
            if (super.field8563.field9850.method1515(0) && !class231.method1343(super.field8563.field9850.method1512(-120), 8249)) {
                return 3;
            }
            if (~super.field8563.field9846.method2453(-127) == -2) {
                return 3;
            }
        }
        if (arg1 != 15706) {
            field5443 = true;
        }
        if (arg0 == 3) {
            return 3;
        } else {
            return class584.method3356(-4, arg0) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(ILgn;)V")
    public class397(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        if (this.method2435(false)) {
            if (super.field8563.field9850.method1515(0) && !class231.method1343(super.field8563.field9850.method1512(25), 8249)) {
                super.field8565 = 1;
            }
            if (~super.field8563.field9846.method2453(-127) == -2) {
                super.field8565 = 1;
            }
        }
        ++field5446;
        if (super.field8565 == 3) {
            super.field8565 = 2;
        }
        if (arg0 >= -37) {
            this.method2434(104);
        }
        if (super.field8565 < 0 || ~super.field8565 < -4) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lgn;)V")
    public class397(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lcaa;")
    public static final class302 method2437(int arg0, int arg1, int arg2) {
        ++field5437;
        class302 var3 = new class302();
        var3.field3767 = arg2 + 5 - -1;
        var3.field3759 = -1;
        var3.field3761 = arg0;
        var3.field3769 = arg1 + 6;
        var3.field3770 = new int[var3.field3767][var3.field3769];
        var3.method1809(false);
        return var3;
    }
}
