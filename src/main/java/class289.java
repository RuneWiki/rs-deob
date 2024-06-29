import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class289 extends class435 {

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "F")
    public float field4062;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "F")
    public static float field4059 = 0.25F;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Lau;")
    public static class692 field4051 = new class692();

    @OriginalMember(owner = "client!am", name = "E", descriptor = "Z")
    public static boolean field4065 = false;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILr;IILnf;I)V", line = 3)
    public static final void method1769(int arg0, class98 arg1, int arg2, int arg3, class119 arg4, int arg5) {
        field4055++;
        class253 var6 = class624.field8902.method1498(arg4.field1934, (byte) 24);
        if (~var6.field3656 == arg5) {
            return;
        }
        int var8;
        if (arg4.field1890) {
            int var7 = arg4.field1940 + arg3;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class257 var9 = var6.method1616(2, arg4.field1920, var8, arg1);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field1965;
        int var11 = arg4.field1876;
        if ((var8 & 0x1) == 1) {
            var10 = arg4.field1876;
            var11 = arg4.field1965;
        }
        int var12 = var9.method11();
        int var13 = var9.method9();
        if (var6.field3660) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field3657 == 0) {
            var9.method1634(arg2, arg0 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method1636(arg2, arg0 + 4 - (var11 * 4), var12, var13, 0, var6.field3657 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)I", line = 60)
    public final int method1771(boolean arg0) {
        if (arg0) {
            field4058++;
            return this.field4064;
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)I", line = 71)
    public final int method1772(boolean arg0) {
        field4052++;
        return arg0 ? this.field4053 : 62;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 83)
    public static void method1773(byte arg0) {
        int var1 = 10 % ((arg0 + 1) / 60);
        field4051 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)I", line = 92)
    public final int method1774(int arg0) {
        int var2 = 43 / ((arg0 + 64) / 57);
        field4063++;
        return this.field4068;
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(B)I", line = 107)
    public final int method1775(byte arg0) {
        if (arg0 <= 65) {
            field4051 = null;
        }
        field4060++;
        return this.field4066;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(B)I", line = 120)
    public final int method1776(byte arg0) {
        if (arg0 != -116) {
            this.field4054 = -4;
        }
        field4067++;
        return this.field4054;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)F", line = 134)
    public final float method1777(int arg0) {
        field4056++;
        return arg0 == -4 ? this.field4062 : -0.46427837F;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ldq;Z)V", line = 147)
    public static final void method1779(class516 arg0, boolean arg1) {
        class427.field6096 = arg0;
        field4061++;
        if (arg1) {
            method1780(115, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)Ldj;", line = 162)
    public static final class456 method1780(int arg0, byte arg1) {
        field4057++;
        class456 var2 = (class456) class596.field8625.method941((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -50 / ((46 - arg1) / 38);
        byte[] var4 = class693.field9819.method2081(-2, arg0, 0);
        class456 var5 = new class456();
        if (var4 != null) {
            var5.method2646(new class465(var4), arg0, (byte) 126);
        }
        class596.field8625.method949((long) arg0, true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIIIF)V", line = 193)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field4064 = arg2;
        this.field4054 = arg0;
        this.field4062 = arg5;
        this.field4053 = arg3;
        this.field4068 = arg4;
        this.field4066 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BIII)V")
    public abstract void method1770(byte arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(FB)V")
    public abstract void method1778(float arg0, byte arg1);
}
