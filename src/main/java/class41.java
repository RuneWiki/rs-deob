import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class41 extends class200 {

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    private int field641 = 4096;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static volatile int field640 = -1;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "[I")
    public static int[] field645 = new int[100];

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Lve;")
    public static class189 field646 = new class189(64);

    @OriginalMember(owner = "client!r", name = "W", descriptor = "Lid;")
    public static class149 field647 = class60.method382("Bitte warten Sie)3)3)3", (byte) 40);

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "Lid;")
    public static class149 field649 = class60.method382("blanc:", (byte) 50);

    @OriginalMember(owner = "client!r", name = "X", descriptor = "Lve;")
    public static class189 field648 = new class189(64);

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field638;
        if (arg1 != 55) {
            return null;
        } else {
            int[] var3 = super.field3638.method1879(arg0, true);
            if (super.field3638.field4887) {
                int[] var4 = this.method1368(0, class191.field3436 & arg0 + -1, false);
                int[] var5 = this.method1368(0, arg0, false);
                int[] var6 = this.method1368(0, class191.field3436 & arg0 + 1, false);
                for (int var7 = 0; ~var7 > ~class137.field2515; ++var7) {
                    int var8 = (var5[class261.field4667 & var7 - -1] + -var5[class261.field4667 & var7 + -1]) * this.field641;
                    int var9 = (var6[var7] - var4[var7]) * this.field641;
                    int var10 = var8 >> 12;
                    int var11 = var9 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                    int var15 = var14 == 0 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Lid;")
    public static final class149 method240(int arg0, int arg1, int arg2) {
        if (arg2 != 4162) {
            method242(true);
        }
        ++field639;
        int var3 = -arg1 + arg0;
        if (~var3 > 8) {
            return class288.field5138;
        } else if (var3 < -6) {
            return class141.field2594;
        } else if (~var3 > 2) {
            return class25.field377;
        } else if (var3 < 0) {
            return class6.field70;
        } else if (~var3 < -10) {
            return class128.field2251;
        } else if (var3 > 6) {
            return class157.field2884;
        } else if (~var3 < -4) {
            return class111.field1925;
        } else {
            return var3 > 0 ? class69.field1204 : class247.field4336;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (~arg2 == -1) {
                this.field641 = arg0.method485(-2386);
            }
            ++field644;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method241(KeyEvent arg0, int arg1) {
        ++field642;
        int var2 = arg0.getKeyChar();
        if (arg1 != -25442) {
            field645 = null;
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || ~var2 <= -257) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public static void method242(boolean arg0) {
        field648 = null;
        field646 = null;
        if (!arg0) {
            field647 = null;
        }
        field649 = null;
        field647 = null;
        field645 = null;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public static final void method243(int arg0) {
        class176.field3218 = new class157();
        if (arg0 <= 46) {
            method242(false);
        }
        ++field643;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class41() {
        super(1, true);
    }
}
