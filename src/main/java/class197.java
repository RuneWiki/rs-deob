import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class197 extends class205 {

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field3581 = 50;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "Lcf;")
    public static class28 field3583 = new class28();

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "Lvd;")
    private static class222 field3594 = class212.method1357("Type", 10731);

    @OriginalMember(owner = "client!si", name = "ob", descriptor = "Lvd;")
    private static class222 field3599 = class212.method1357("Walk here", 10731);

    @OriginalMember(owner = "client!si", name = "nb", descriptor = "Z")
    public static boolean field3598 = true;

    @OriginalMember(owner = "client!si", name = "tb", descriptor = "Lvd;")
    public static class222 field3604 = class212.method1357("<col=ffffff>", 10731);

    @OriginalMember(owner = "client!si", name = "pb", descriptor = "I")
    public static int field3600 = 0;

    @OriginalMember(owner = "client!si", name = "qb", descriptor = "Lvd;")
    private static class222 field3601 = class212.method1357("flash3:", 10731);

    @OriginalMember(owner = "client!si", name = "rb", descriptor = "Lvd;")
    public static class222 field3602 = field3594;

    @OriginalMember(owner = "client!si", name = "sb", descriptor = "Lvd;")
    public static class222 field3603 = field3601;

    @OriginalMember(owner = "client!si", name = "ub", descriptor = "Lvd;")
    public static class222 field3605 = field3599;

    @OriginalMember(owner = "client!si", name = "lb", descriptor = "Lvd;")
    public static class222 field3596 = field3601;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!si", name = "mb", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "Lme;")
    public static class133 field3593;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public static final void method1210(byte arg0) {
        Object var1 = class52.field989;
        synchronized (class52.field989) {
            if (~class162.field3086 == -1) {
                class191.field3509.method283(new class31(), 5, 0);
            }
            int var2 = -103 / ((47 - arg0) / 33);
            class162.field3086 = 600;
        }
        ++field3584;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field3592;
        if (arg0 != 0) {
            this.method4(-42, -93);
        }
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            class163.method1027(var3, 0, class118.field2245, this.field3586);
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIBI)V")
    public static final void method1211(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 65) {
            method1214((KeyEvent) null, -85);
        }
        ++field3582;
        if (class134.field2585 != 0 && arg1 != 0 && class52.field993 < 50 && ~arg3 != 0) {
            class121.field2309[class52.field993] = arg3;
            class115.field2198[class52.field993] = arg1;
            class96.field1792[class52.field993] = arg0;
            class91.field1720[class52.field993] = null;
            class70.field1307[class52.field993] = 0;
            ++class52.field993;
        }
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)V")
    public static final void method1212(int arg0) {
        class111.field2095.method596(false);
        if (arg0 != -2) {
            method1216(-112);
        }
        class18.field434.method596(false);
        ++field3588;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
    private class197(int arg0) {
        super(0, true);
        this.field3586 = 4096;
        this.field3586 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field3586 = (arg0.method662((byte) -83) << 12) / 255;
        }
        int var5 = 69 % ((-47 - arg1) / 34);
        ++field3590;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class197() {
        this(4096);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIB)V")
    public static final void method1213(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3597;
        class53.method396(arg0, arg2, arg0 - -arg1, arg2 - -arg3);
        class199.method1264();
        class53.method399(arg0, arg2, arg1, arg3, 0);
        if (class143.field2773 >= 100) {
            class5.method52(0, arg2, arg0, 0, arg2 + arg3, 0, class99.field1862, arg0 + arg1, class38.field852);
            int var5 = arg0 - -(class91.field1712 * arg1 / class99.field1862);
            int var6 = class218.field4053 * arg3 / class38.field852 + arg2;
            int var7 = class44.field921 * arg3 / class38.field852;
            int var8 = class146.field2790 * arg1 / class99.field1862;
            int var9 = -79 / ((-50 - arg4) / 47);
            class53.method389(var5, var6, var8, var7, 16711680, 128);
            class53.method401(var5, var6, var8, var7, 16711680);
            if (~class31.field653 < -1 && class31.field653 % 10 < 5) {
                for (class113 var10 = (class113) class71.field1387.method236(0); var10 != null; var10 = (class113) class71.field1387.method237(true)) {
                    if (~class193.field3553 == ~var10.field2126) {
                        int var11 = var10.field2125 * arg1 / class99.field1862 + arg0;
                        int var12 = var10.field2122 * arg3 / class38.field852 + arg2;
                        class53.method399(var11 + -2, var12 - 2, 4, 4, 16776960);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method1214(KeyEvent arg0, int arg1) {
        if (arg1 != 128) {
            return 10;
        } else {
            ++field3591;
            int var2 = arg0.getKeyChar();
            if (var2 == 8364) {
                return 128;
            } else {
                if (~var2 >= -1 || var2 >= 256) {
                    var2 = -1;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Lba;")
    public static final class13 method1215(int arg0, int arg1, int arg2) {
        if (arg2 > -97) {
            method1211(101, -52, (byte) -50, -32);
        }
        ++field3585;
        class13 var3 = class10.method92(923, arg0);
        if (~arg1 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field307 != null && var3.field307.length > arg1 ? var3.field307[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(I)V")
    public static void method1216(int arg0) {
        field3605 = null;
        field3601 = null;
        if (arg0 != 0) {
            field3601 = null;
        }
        field3596 = null;
        field3593 = null;
        field3594 = null;
        field3583 = null;
        field3603 = null;
        field3602 = null;
        field3599 = null;
        field3604 = null;
    }
}
