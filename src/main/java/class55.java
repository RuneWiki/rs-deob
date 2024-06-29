import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class55 extends class331 {

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "[F")
    public static float[] field791 = new float[16384];

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "[F")
    public static float[] field796 = new float[16384];

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "Lnl;")
    public static class681 field799;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return 24;
        } else {
            ++field795;
            return super.field4203.method345((byte) 122) == class400.field5535 && super.field4203.method344((byte) 83) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(ILts;)V")
    public class55(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        if (arg0 >= 113) {
            ++field794;
            super.field4202 = arg1;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIB)V")
    public static final void method442(int arg0, int arg1, byte arg2) {
        ++field792;
        class548 var3 = class696.method3872(arg0, 7, -1633381944);
        var3.method3130(61);
        var3.field7725 = arg1;
        int var4 = 112 % ((arg2 - -50) / 34);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        if (arg0 != -1959) {
            this.method226((byte) 69);
        }
        super.field4202 = this.method226((byte) 13);
        ++field797;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field798;
        if (arg1 != 1) {
            field799 = null;
        }
        return 3;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lts;)V")
    public class55(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
    public static void method443(boolean arg0) {
        field791 = null;
        field799 = null;
        field796 = null;
        if (!arg0) {
            method442(-120, -96, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)I")
    public final int method444(byte arg0) {
        if (arg0 >= -119) {
            this.method222(62, 55);
        }
        ++field793;
        return super.field4202;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field791[var2] = (float) Math.sin((double) var2 * var0);
            field796[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
