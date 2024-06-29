import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class448 extends class597 {

    @OriginalMember(owner = "client!laa", name = "K", descriptor = "Lvg;")
    public static class622 field6494 = new class622(33, 4);

    @OriginalMember(owner = "client!laa", name = "O", descriptor = "[I")
    public static int[] field6498 = new int[2048];

    @OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
    public static int field6499 = 0;

    @OriginalMember(owner = "client!laa", name = "N", descriptor = "Lnb;")
    public static class318 field6497 = new class318("WTWIP", 3);

    @OriginalMember(owner = "client!laa", name = "Q", descriptor = "I")
    public static int field6500 = 0;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "B")
    public byte field6490;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
    public int field6492;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "Lgk;")
    public class540 field6489;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "(I)V", line = 3)
    public static void method2643(int arg0) {
        field6498 = null;
        field6497 = null;
        if (arg0 != 301006384) {
            method2647((class287) null, -6, -116, 51, 23);
        }
        field6494 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 16)
    public static final void method2644(int arg0, String arg1, int arg2) {
        if (arg0 == 17399) {
            ++class416.field6152;
            ++field6491;
            class654 var3 = class631.method3628(class480.field6869, (byte) -51, class357.field5280);
            var3.field9358.method3110(class420.method2543(1, arg1) + 1, 69);
            var3.field9358.method3107(arg2, (byte) -67);
            var3.field9358.method3132(arg1, arg0 ^ 17396);
            class444.method2623(121, var3);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Llr;I)V", line = 33)
    public static final void method2645(class311 arg0, int arg1) {
        int var2 = -108 % ((-45 - arg1) / 63);
        ++field6493;
        for (int var3 = 0; ~class440.field6397 < ~var3; ++var3) {
            int var4 = class191.field2586[var3];
            class71 var5 = class35.field551[var4];
            int var6 = arg0.method3115(29871);
            if ((1 & var6) != 0) {
                var6 += arg0.method3115(29871) << 8;
            }
            if ((8192 & var6) != 0) {
                var6 += arg0.method3115(29871) << 16;
            }
            class239.method1471(var4, -114, var5, var6, arg0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)I", line = 70)
    public final int method2646(int arg0) {
        ++field6488;
        if (arg0 != 15862) {
            field6498 = null;
        }
        return this.field6489 == null ? 0 : this.field6489.field7956 * 100 / (this.field6489.field7952.length + -this.field6490);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Luca;IIII)Lei;", line = 86)
    public static final class506 method2647(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6495;
        if (arg1 != 3553) {
            method2644(0, (String) null, 70);
        }
        if (!arg0.field4144 && (!class346.method2145(-1, arg4) || !class346.method2145(-1, arg3))) {
            return arg0.field4132 ? new class506(arg0, 34037, arg2, arg4, arg3) : new class506(arg0, arg2, arg4, arg3, class240.method1478(-28325, arg4), class240.method1478(-28325, arg3));
        } else {
            return new class506(arg0, 3553, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)[B", line = 106)
    public final byte[] method2648(int arg0) {
        ++field6496;
        if (!super.field8640 && ~this.field6489.field7956 <= ~(this.field6489.field7952.length + -this.field6490)) {
            return arg0 <= 36 ? null : this.field6489.field7952;
        } else {
            throw new RuntimeException();
        }
    }
}
