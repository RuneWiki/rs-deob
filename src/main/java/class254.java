import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class254 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "[Lna;")
    public static class25[] field4375 = new class25[50];

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4378 = 3;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Lmh;")
    public static class128 field4379 = class22.method156(124, "mem=");

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Lmh;")
    public static class128 field4376 = class22.method156(126, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4382 = 0;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[Lvd;")
    public static class127[] field4377;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "[S")
    public static short[] field4383;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 10)
    public static void method1797(int arg0) {
        int var1 = -107 % ((-arg0 - 71) / 35);
        field4379 = null;
        field4383 = null;
        field4375 = null;
        field4377 = null;
        field4376 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBI)I", line = 35)
    public static final int method1798(int arg0, byte arg1, int arg2) {
        if (arg1 == 127) {
            field4385++;
            int var3 = arg0 >> 31 & arg2 - 1;
            return ((arg0 >>> 31) + arg0) % arg2 + var3;
        } else {
            return -86;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IBI)V", line = 58)
    public static final void method1799(int arg0, byte arg1, int arg2) {
        class275.field4771 = class178.field3136[arg0][arg2].field3187;
        field4381++;
        class308.field5238 = class178.field3136[arg0][arg2].field3191;
        class228.field3967 = class178.field3136[arg0][arg2].field3181;
        class119.method717((float) class275.field4771, (float) class308.field5238, (float) class228.field3967);
        if (arg1 <= 72) {
            method1797(35);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLmh;)Z", line = 87)
    public static final boolean method1800(byte arg0, class128 arg1) {
        if (arg0 < 86) {
            method1800((byte) 101, (class128) null);
        }
        field4386++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class218.field3847; var2++) {
            if (arg1.method861(10362, class163.field2777[var2])) {
                return true;
            }
        }
        return false;
    }
}
