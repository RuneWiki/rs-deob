import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class258 {

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
    private boolean field3778 = false;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field3774 = 0;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public int field3776 = 0;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Z")
    public static boolean field3770 = false;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "[[I")
    public static int[][] field3784 = new int[128][128];

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Lba;")
    public static class240 field3782 = new class240(64);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    private int field3779;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "J")
    public long field3787;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lb;")
    public static class201 field3769;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static final void method1606(int arg0) {
        field3765++;
        if (class86.field1045 != null) {
            return;
        }
        Container var1;
        if (class239.field3589 == null) {
            var1 = class252.field3718.field6021;
        } else {
            var1 = class239.field3589;
        }
        class284.field4156 = var1.getSize().width;
        class199.field2901 = var1.getSize().height;
        if (class239.field3589 == var1) {
            Insets var2 = class239.field3589.getInsets();
            class284.field4156 -= var2.right + var2.left;
            class199.field2901 -= var2.top + var2.bottom;
        }
        if (class262.method1624(16822) == 1) {
            class236.field3552 = 0;
            class244.field3634 = class202.field2968;
            class144.field1900 = class350.field5069;
            class377.field5436 = (class284.field4156 - class350.field5069) / 2;
        } else if (class347.field5026 < 96 && class437.field6083 == 0) {
            int var3 = class284.field4156 <= 1024 ? class284.field4156 : 1024;
            class144.field1900 = var3;
            int var4 = class199.field2901 <= 768 ? class199.field2901 : 768;
            class377.field5436 = (class284.field4156 - var3) / 2;
            class236.field3552 = 0;
            class244.field3634 = var4;
        } else {
            class236.field3552 = 0;
            class144.field1900 = class284.field4156;
            class244.field3634 = class199.field2901;
            class377.field5436 = 0;
        }
        if (class394.field5599 != class356.field5143) {
            boolean var10000;
            if (class144.field1900 < 1024 && class244.field3634 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class465.field6503.setSize(class144.field1900, class244.field3634);
        if (arg0 != -769) {
            method1609(71);
        }
        if (class141.field1878 != null) {
            class141.field1878.method698();
        }
        if (class239.field3589 == var1) {
            Insets var5 = class239.field3589.getInsets();
            class465.field6503.setLocation(class377.field5436 + var5.left, class236.field3552 + var5.top);
        } else {
            class465.field6503.setLocation(class377.field5436, class236.field3552);
        }
        if (class36.field472 != -1) {
            class451.method2632(true, (byte) 113);
        }
        class328.method2077(-1);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLrp;I)V")
    private final void method1607(boolean arg0, class276 arg1, int arg2) {
        field3785++;
        if (arg0) {
            return;
        }
        if (arg2 == 1) {
            this.field3779 = arg1.method1729(65280);
        } else if (arg2 == 2) {
            arg1.method1701(-23121);
        } else if (arg2 == 3) {
            this.field3773 = arg1.method1688(20402);
            this.field3788 = arg1.method1688(20402);
            this.field3775 = arg1.method1688(20402);
        } else if (arg2 == 4) {
            this.field3768 = arg1.method1701(-23121);
            this.field3767 = arg1.method1688(20402);
        } else if (arg2 == 6) {
            this.field3766 = arg1.method1701(-23121);
        } else if (arg2 == 8) {
            this.field3774 = 1;
        } else if (arg2 == 9) {
            this.field3776 = 1;
        } else if (arg2 == 10) {
            this.field3778 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lrp;I)V")
    public final void method1608(class276 arg0, int arg1) {
        field3783++;
        if (arg1 != -1) {
            field3772 = 43;
        }
        while (true) {
            int var3 = arg0.method1701(arg1 - 23120);
            if (var3 == 0) {
                return;
            }
            this.method1607(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method1609(int arg0) {
        field3784 = null;
        field3782 = null;
        field3769 = null;
        if (arg0 != -1) {
            method1606(70);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
    public final void method1610(int arg0) {
        field3786++;
        this.field3780 = class53.field726[this.field3779 << 3];
        this.field3771 = (int) Math.sqrt((double) (this.field3775 * this.field3775 + (this.field3773 * this.field3773 + (this.field3788 * this.field3788))));
        if (this.field3767 == 0) {
            this.field3767 = 1;
        }
        if (this.field3768 == 0) {
            this.field3787 = 2147483647L;
        } else if (this.field3768 == 1) {
            this.field3787 = (long) (this.field3771 * 8 / this.field3767);
            this.field3787 *= this.field3787;
        } else if (this.field3768 == 2) {
            this.field3787 = (long) (this.field3771 * 8 / this.field3767);
        }
        if (arg0 != 1) {
            this.method1607(false, (class276) null, 19);
        }
        if (this.field3778) {
            this.field3771 *= -1;
        }
    }

    static {
        new class326("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }
}
