import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class384 extends class260 {

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "Ljw;")
    public static class581 field5618 = new class581(122, 1);

    @OriginalMember(owner = "client!uia", name = "q", descriptor = "[Leja;")
    public static class764[] field5621 = new class764[100];

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5620 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!uia", name = "r", descriptor = "F")
    public static float field5622;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)Z")
    public final boolean method2442(int arg0) {
        ++field5614;
        int var2 = -53 / ((56 - arg0) / 53);
        return ~super.field3867.method733(-103).method3986(114) <= -97;
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lfca;)V")
    public class384(class92 arg0) {
        super(arg0);
        class284.method1822(super.field3868, (byte) -69);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        ++field5615;
        if (arg0 != 4) {
            method2443(26, 7, 47);
        }
        return super.field3867.method733(arg0 ^ 25).method3986(122) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (super.field3867.method733(-120).method3986(118) < 96) {
            super.field3868 = 0;
        }
        ++field5616;
        if (~super.field3868 > -1 || super.field3868 > 2) {
            super.field3868 = this.method8((byte) 4);
        }
        if (arg0) {
            method2443(-62, -77, -101);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(III)Z")
    public static final boolean method2443(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field5618 = null;
        }
        ++field5612;
        return class714.method3995(arg2, arg1, false) | ~(arg2 & 2048) != -1 || class647.method3617(arg2, arg1, (byte) -49);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field5617;
        if (super.field3867.method733(-110).method3986(110) < 96) {
            return 3;
        } else {
            int var3 = -107 % ((-53 - arg1) / 50);
            return 1;
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(ILfca;)V")
    public class384(int arg0, class92 arg1) {
        super(arg0, arg1);
        class284.method1822(super.field3868, (byte) -108);
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        ++field5619;
        if (arg1 == -107) {
            class284.method1822(super.field3868, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)V")
    public static void method2444(byte arg0) {
        field5618 = null;
        if (arg0 >= -5) {
            method2444((byte) -118);
        }
        field5620 = null;
        field5621 = null;
    }

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "(I)I")
    public final int method2445(int arg0) {
        ++field5613;
        return arg0 <= 3 ? -106 : super.field3868;
    }
}
