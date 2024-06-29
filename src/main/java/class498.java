import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class498 extends class141 {

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BC)Z")
    public static final boolean method2917(byte arg0, char arg1) {
        if (arg0 != 44) {
            return true;
        } else {
            ++field7220;
            return ~arg1 <= -66 && ~arg1 >= -91 || arg1 >= 'a' && ~arg1 >= -123;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZBIZI)Lci;")
    public static final class320 method2918(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        ++field7215;
        class91 var5 = null;
        if (class545.field7995 != null) {
            var5 = new class91(arg4, class545.field7995, class166.field2502[arg4], 1000000);
        }
        if (arg1 < 0) {
            return null;
        } else {
            class425.field6008[arg4] = class24.field353.method2370(arg4, 0, class466.field6781, var5);
            if (arg3) {
                class425.field6008[arg4].method1010(-69);
            }
            return new class320(class425.field6008[arg4], arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        ++field7214;
        if (arg1 != 0) {
            this.method51(107, true);
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        ++field7216;
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lei;II)V")
    public final void method57(class120 arg0, int arg1, int arg2) {
        ++field7218;
        super.field2178.method285(false, arg0);
        super.field2178.method249(arg1, -2);
        if (arg2 <= 89) {
            this.method49(116, 64, -35);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
    public final void method49(int arg0, int arg1, int arg2) {
        if (arg0 != 1400) {
            method2920(85, -29);
        }
        ++field7217;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        super.field2178.method183((byte) -121, false);
        ++field7222;
        int var2 = 14 / ((-51 - arg0) / 45);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method2919(int arg0, float[] arg1, int arg2) {
        ++field7221;
        float[] var3 = new float[arg2];
        class282.method1819(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lbt;)V")
    public class498(class33 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V")
    public final void method51(int arg0, boolean arg1) {
        if (arg0 != -21897) {
            this.method57((class120) null, 82, 99);
        }
        ++field7219;
        super.field2178.method183((byte) -107, true);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z")
    public static final boolean method2920(int arg0, int arg1) {
        if (arg0 != 28407) {
            method2918(false, (byte) -98, -5, false, 105);
        }
        ++field7213;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }
}
