import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class64 extends class189 {

    @OriginalMember(owner = "client!gh", name = "kb", descriptor = "[I")
    public static int[] field1638 = new int[99];

    @OriginalMember(owner = "client!gh", name = "lb", descriptor = "Lgg;")
    public static class63 field1639;

    @OriginalMember(owner = "client!gh", name = "ob", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!gh", name = "mb", descriptor = "[I")
    public static int[] field1640;

    @OriginalMember(owner = "client!gh", name = "qb", descriptor = "Lgg;")
    public static class63 field1644;

    @OriginalMember(owner = "client!gh", name = "rb", descriptor = "Lgg;")
    private static class63 field1645;

    @OriginalMember(owner = "client!gh", name = "nb", descriptor = "Lgg;")
    public static class63 field1641;

    @OriginalMember(owner = "client!gh", name = "gb", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!gh", name = "hb", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!gh", name = "ib", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!gh", name = "jb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!gh", name = "pb", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1641 = null;
        field1639 = null;
        if (arg0 != 22395) {
            method610(61);
        }
        field1640 = null;
        field1644 = null;
        field1645 = null;
        field1638 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIILd;IJ)Z")
    public static final boolean method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class30 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class142.method1020(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method609(int arg0, String arg1) throws ClassNotFoundException {
        ++field1635;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0 != 2000) {
            return null;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method90(-75, -40);
        }
        ++field1636;
        int[] var3 = super.field3825.method681(arg1, (byte) -121);
        if (super.field3825.field1840) {
            for (int var4 = 0; ~class54.field1430 < ~var4; ++var4) {
                var3[var4] = class35.field825[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public static final void method610(int arg0) {
        ++field1634;
        class100.field2351.method282((byte) -91);
        if (arg0 != 64) {
            field1644 = null;
        }
        class3.field62.method282((byte) -93);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILd;IJIIII)Z")
    public static final boolean method611(int arg0, int arg1, int arg2, int arg3, class30 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class142.method1020(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class64() {
        super(0, true);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1638[var1] = var0 / 4;
        }
        field1639 = class116.method911(43, " <col=00ff80>");
        field1642 = -16 + (int) (33.0D * Math.random());
        field1640 = new int[2000];
        field1644 = class116.method911(43, "und Ihr Passwort ein)3");
        field1645 = class116.method911(43, "OFF");
        field1641 = field1645;
    }
}
