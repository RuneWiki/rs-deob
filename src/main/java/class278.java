import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class278 extends class499 {

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "[Loh;")
    public class278[] field3744;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Z")
    public boolean field3754;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field3755 = -1;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Ljm;")
    public static class485 field3753 = new class485(52, 8);

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field3761 = -1;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field3763 = 0;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "[I")
    public static int[] field3762 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Lbc;")
    public class245 field3757;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lnr;")
    public class40 field3750;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)[[I")
    public final int[][] method1568(int arg0, int arg1, int arg2) {
        field3758++;
        if (arg0 != 5426) {
            return null;
        } else if (this.field3744[arg1].field3754) {
            int[] var4 = this.field3744[arg1].method208(-9, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3744[arg1].method324(103, arg2);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1569(int arg0) {
        field3762 = null;
        if (arg0 == 0) {
            field3753 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public void method207(int arg0) {
        field3748++;
        if (arg0 != 2) {
            field3763 = -127;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)I")
    public int method1044(byte arg0) {
        if (arg0 < 102) {
            return 90;
        } else {
            field3743++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)[I")
    public final int[] method1570(int arg0, int arg1, int arg2) {
        field3756++;
        if (arg0 != 0) {
            this.method208(13, 57);
        }
        return this.field3744[arg1].field3754 ? this.field3744[arg1].method208(-9, arg2) : this.field3744[arg1].method324(arg0 + 88, arg2)[0];
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)I")
    public int method412(int arg0) {
        field3760++;
        int var2 = -74 % ((69 - arg0) / 41);
        return -1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Le;")
    public static final class370 method1571(byte arg0, int arg1) {
        field3749++;
        class370 var2 = (class370) class82.field1152.method56((long) arg1, 41);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class84.field1165.method1411(true, arg1, 1);
        class370 var4 = new class370();
        if (arg0 < 121) {
            field3762 = null;
        }
        var4.field5203 = arg1;
        if (var3 != null) {
            var4.method2142(0, new class365(var3));
        }
        var4.method2138(87);
        if (var4.field5188 == 2 && class35.field499.method979((byte) 28, (long) arg1) == null) {
            class35.field499.method990((long) arg1, (byte) 108, new class330(class241.field3343));
            class516.field7572[class241.field3343++] = var4;
        }
        class82.field1152.method73((long) arg1, var4, 26425);
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Llh;II)V")
    public void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 == -30446) {
            field3742++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public void method410(boolean arg0) {
        if (this.field3754) {
            this.field3750.method252(-85);
            this.field3750 = null;
        } else {
            this.field3757.method1449(-21929);
            this.field3757 = null;
        }
        field3746++;
        if (arg0) {
            field3753 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)V")
    public void method1046(byte arg0, int arg1, int arg2) {
        field3759++;
        int var4 = this.field3751 == 255 ? arg2 : this.field3751;
        if (this.field3754) {
            this.field3750 = new class40(var4, arg2, arg1);
        } else {
            this.field3757 = new class245(var4, arg2, arg1);
        }
        int var5 = 19 % ((arg0 - 46) / 42);
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)[Lof;")
    public static final class438[] method1572(int arg0) {
        field3747++;
        if (arg0 != 2) {
            method1569(-48);
        }
        return new class438[] { class528.field7773, class330.field4500, class190.field2645, class54.field749, class457.field6678, class17.field179 };
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
    public int[][] method324(int arg0, int arg1) {
        field3752++;
        if (arg0 < 75) {
            method1572(115);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I")
    public int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            field3755 = 13;
        }
        field3745++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IZ)V")
    public class278(int arg0, boolean arg1) {
        this.field3744 = new class278[arg0];
        this.field3754 = arg1;
    }
}
