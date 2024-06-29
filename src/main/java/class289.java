import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class289 implements class698 {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lla;")
    private class420 field3680;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lkha;")
    private class687 field3676;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lkha;")
    private class687 field3672;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Ldh;")
    public static class286 field3670 = new class286("game3", 2);

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lda;")
    private class423 field3674;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "[Lac;")
    public static class712[] field3681;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lsi;", line = 6)
    public static final class737 method1729(int arg0, int arg1, Canvas arg2, int arg3) {
        field3671++;
        try {
            if (arg0 != -5) {
                method1732(-26);
            }
            Class var4 = Class.forName("q");
            class737 var5 = (class737) var4.getDeclaredConstructor().newInstance();
            var5.method1007(arg2, arg1, arg3, -21975);
            return var5;
        } catch (Throwable var7) {
            class661 var6 = new class661();
            var6.method1007(arg2, arg1, arg3, -21975);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 32)
    public static final void method1730(byte arg0) {
        if (arg0 != -108) {
            method1729(-115, -3, null, 43);
        }
        class701.field9883 = null;
        class102.field1258 = -1;
        field3678++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Z", line = 44)
    public final boolean method616(byte arg0) {
        if (arg0 != 30) {
            this.field3680 = null;
        }
        field3673++;
        boolean var2 = true;
        if (!this.field3672.method3827(this.field3680.field5976, (byte) 70)) {
            var2 = false;
        }
        if (!this.field3676.method3827(this.field3680.field5976, (byte) 47)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 65)
    public final void method621(int arg0) {
        field3677++;
        class56 var2 = class653.method3527(this.field3676, (byte) -127, this.field3680.field5976);
        this.field3674 = class458.field6407.method156(var2, class196.method1235(this.field3672, this.field3680.field5976), true);
        if (arg0 != 27799) {
            this.method621(-70);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)Z", line = 81)
    public static final boolean method1731(int arg0, byte arg1) {
        if (arg1 != -32) {
            method1732(-3);
        }
        field3675++;
        if (arg0 == 4 || arg0 == 9 || arg0 == 23 || arg0 == 19 || arg0 == 12) {
            return true;
        } else {
            return arg0 == 25 || arg0 == 1010;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 101)
    public static void method1732(int arg0) {
        field3681 = null;
        field3670 = null;
        if (arg0 != 25) {
            field3681 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lkha;Lkha;Lla;)V", line = 115)
    public class289(class687 arg0, class687 arg1, class420 arg2) {
        this.field3680 = arg2;
        this.field3676 = arg1;
        this.field3672 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V", line = 125)
    public final void method620(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field3680.field5973.method4235(false, class303.field3896, this.field3680.field5966) + this.field3680.field5977;
            int var4 = this.field3680.field5967.method2413(this.field3680.field5965, class708.field9966, (byte) -8) + this.field3680.field5979;
            this.field3674.method2523(var3, this.field3680.field5966, this.field3680.field5970, this.field3680.field5978, null, this.field3680.field5965, this.field3680.field5969, this.field3680.field5964, null, this.field3680.field5974, null, var4, 17517, this.field3680.field5975, 0, 0);
        }
        if (arg1 < 108) {
            field3681 = null;
        }
        field3679++;
    }
}
