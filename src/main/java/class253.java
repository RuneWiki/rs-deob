import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 {

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "[I")
    public static int[] field4260 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "Lve;")
    public static class255 field4274 = class87.method607(71, "Hierhin gehen");

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field4251;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Lrg;")
    public static class88 field4254;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Lrg;")
    public static class88 field4266;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lsl;")
    public static class91 field4277;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[Lfi;")
    public static class250[] field4262;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1729(byte arg0) {
        class122.field2042 = null;
        field4267++;
        class280.field4800 = null;
        int var1 = -66 / ((-arg0 - 71) / 37);
        class150.field2533 = null;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 21)
    public static void method1730(byte arg0) {
        field4262 = null;
        field4254 = null;
        if (arg0 >= -12) {
            field4266 = (class88) null;
        }
        field4266 = null;
        field4277 = null;
        field4260 = null;
        field4274 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZII)I", line = 36)
    public static final int method1731(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field4258++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg1) {
                method1732((byte[]) null, 65);
            }
            return var4 == 2 ? 1023 - arg0 : -arg3 + 1023;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([BI)Lph;", line = 64)
    public static final class71 method1732(byte[] arg0, int arg1) {
        field4250++;
        if (arg0 == null) {
            return null;
        }
        class71 var2;
        if (class281.field4827) {
            var2 = new class214(arg0, class131.field2167, class298.field5098, class132.field2173, class187.field3027, class282.field4849);
        } else {
            var2 = new class290(arg0, class131.field2167, class298.field5098, class132.field2173, class187.field3027, class282.field4849);
        }
        if (arg1 != -2) {
            method1730((byte) 32);
        }
        class111.method850(-3);
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 112)
    public static final void method1733(int arg0) {
        class203.field3498.method275(arg0 - 671198518);
        if (arg0 != -2) {
            method1732((byte[]) null, -75);
        }
        class90.field1525.method1918((byte) -88);
        class127.field2092.method1918((byte) -88);
        field4263++;
    }
}
