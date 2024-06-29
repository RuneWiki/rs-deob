import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class423 implements class331 {

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lvha;")
    private class713 field5787;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lwia;")
    private class791 field5789;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field5786 = 0;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Ljd;")
    private class241 field5783;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZZ)V")
    public final void method299(boolean arg0, boolean arg1) {
        if (arg1) {
            method2564(-25, 80, 110);
        }
        field5788++;
        if (!arg0) {
            return;
        }
        int var3 = class428.field5825 > class527.field7532 ? class428.field5825 : class527.field7532;
        int var4 = class296.field4307 < class714.field9895 ? class714.field9895 : class296.field4307;
        int var5 = this.field5783.method1507();
        int var6 = this.field5783.method1505();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var8 = var4 * var5 / var6;
            var10 = 0;
            var9 = var4;
            var7 = (var3 - var8) / 2;
        }
        this.field5783.method1607(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Z")
    public static final boolean method2564(int arg0, int arg1, int arg2) {
        field5784++;
        if (arg0 > -125) {
            method2564(-79, -6, -74);
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)Z")
    public final boolean method298(byte arg0) {
        field5791++;
        return arg0 == -98 ? this.field5789.method4349((byte) -102, this.field5787.field9889) : false;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        int var2 = -28 / ((83 - arg0) / 32);
        this.field5783 = class611.method3549(0, this.field5789, this.field5787.field9889);
        field5785++;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lwia;Lvha;)V")
    public class423(class791 arg0, class713 arg1) {
        this.field5787 = arg1;
        this.field5789 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BILrn;IIII)Z")
    public static final boolean method2565(byte arg0, int arg1, class281 arg2, int arg3, int arg4, int arg5, int arg6) {
        field5790++;
        if (!class694.field9700 || !class385.field5304) {
            return false;
        } else if (class710.field9866 < 100) {
            return false;
        } else if (arg1 != arg3 || arg4 != arg6) {
            int var7 = -123 / ((arg0 + 59) / 60);
            for (int var8 = arg1; var8 <= arg3; var8++) {
                for (int var9 = arg4; var9 <= arg6; var9++) {
                    if (class440.field5978[arg5][var8][var9] == (-class744.field10316)) {
                        return false;
                    }
                }
            }
            if (class368.method2299(2, arg2)) {
                class211.field3269++;
                return true;
            } else {
                return false;
            }
        } else if (!class295.method1924(arg4, 1, arg1, arg5)) {
            return false;
        } else if (class368.method2299(2, arg2)) {
            class211.field3269++;
            return true;
        } else {
            return false;
        }
    }
}
