import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class48 extends class45 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field650 = 0;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Lcb;")
    public static class318 field653 = new class318(90, -1);

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Lvi;")
    public static class560 field655 = new class560(8);

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Lln;")
    public static class461 field654;

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lpq;Ltf;)V", line = 5)
    public class48(class159 arg0, class316 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 8)
    public static void method285(int arg0) {
        if (arg0 != 2) {
            method285(-112);
        }
        field655 = null;
        field653 = null;
        field654 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZB)V", line = 20)
    public final void method277(boolean arg0, byte arg1) {
        ++field652;
        int var3 = super.field597.field5881.method2304(class432.field5995, super.field596.method1160(), 65535) + super.field597.field5877;
        int var4 = super.field597.field5884.method536(class384.field5582, -26620, super.field596.method1157()) - -super.field597.field5880;
        super.field596.method2448((float) (super.field596.method1160() / 2 + var3), (float) (var4 + super.field596.method1157() / 2), 4096, this.field650);
        this.field650 += ((class316) super.field597).field4605;
        if (arg1 > -13) {
            this.field650 = -83;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIBIII)V", line = 36)
    public static final void method286(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field651;
        if (class19.field169 >= arg1 && arg0 >= class609.field8313) {
            boolean var6;
            if (~arg3 > ~class398.field5676) {
                var6 = false;
                arg3 = class398.field5676;
            } else if (~arg3 < ~class298.field3995) {
                arg3 = class298.field3995;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg5 >= class398.field5676) {
                if (arg5 > class298.field3995) {
                    var7 = false;
                    arg5 = class298.field3995;
                } else {
                    var7 = true;
                }
            } else {
                var7 = false;
                arg5 = class398.field5676;
            }
            if (arg1 >= class609.field8313) {
                class653.method3620(arg5, arg3, false, arg4, class319.field4673[arg1++]);
            } else {
                arg1 = class609.field8313;
            }
            if (arg0 <= class19.field169) {
                class653.method3620(arg5, arg3, false, arg4, class319.field4673[arg0--]);
            } else {
                arg0 = class19.field169;
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg0; ++var8) {
                    int[] var9 = class319.field4673[var8];
                    var9[arg3] = var9[arg5] = arg4;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg0; ++var10) {
                    class319.field4673[var10][arg3] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg1; ~arg0 <= ~var11; ++var11) {
                    class319.field4673[var11][arg5] = arg4;
                }
            }
        }
        if (arg2 < 108) {
            field653 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;", line = 143)
    public static final Class method287(String arg0, byte arg1) throws ClassNotFoundException {
        ++field649;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg1 < 4) {
            return null;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }
}
