import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class143 extends class330 {

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lvn;")
    public static class169 field2026 = new class169();

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2027 = 0;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
    public static int[] field2028 = new int[25];

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lra;I)V")
    public static final void method844(class57 arg0, int arg1) {
        class142.field1999 = arg0;
        field2020++;
        class35.field353 = class142.field1999.method352(arg1, (byte) -75);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
    public static void method845(boolean arg0) {
        if (arg0) {
            method844((class57) null, 53);
        }
        field2026 = null;
        field2028 = null;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static final void method846(int arg0) {
        field2024++;
        if (arg0 != 15) {
            method844((class57) null, 64);
        }
        while (class249.field3379.method814((byte) -97, class290.field4131) >= 27) {
            int var1 = class249.field3379.method817(-119, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class81.field917[var1] == null) {
                class81.field917[var1] = new class358();
                class81.field917[var1].field6279 = var1;
                var2 = true;
            }
            class358 var3 = class81.field917[var1];
            class201.field2770[class426.field6168++] = var1;
            var3.field6320 = class221.field3033;
            if (var3.field5229 != null && var3.field5229.method2165((byte) -75)) {
                class283.method1812(var3, 5);
            }
            int var4 = class249.field3379.method817(-119, 1);
            int var5 = class249.field3379.method817(63, 1);
            if (var5 == 1) {
                class204.field2798[class189.field2578++] = var1;
            }
            int var6 = class249.field3379.method817(-116, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class196.field2668[class249.field3379.method817(65, 3)];
            int var8 = class249.field3379.method817(arg0 ^ 0x3C, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method2282(class282.method1806(101, class249.field3379.method817(123, 14)), (byte) 84);
            var3.method2684(var3.field5229.field4982, (byte) -98);
            var3.field6307 = var3.field5229.field4950 << 3;
            if (var3.field6307 == 0) {
                var3.method2687(0, true);
            } else if (var2) {
                var3.method2687(var7, true);
            }
            var3.method2696(class390.field5715.field6351[0] + var6, class410.field5931, class390.field5715.field6350[0] + var8, var3.method786((byte) 70), var4 == 1, -29874);
            if (var3.field5229.method2165((byte) -98)) {
                class349.method2224(var3.field6351[0], var3.field6350[0], (class133) null, (class327) null, 0, 128, class410.field5931, var3);
            }
        }
        class249.field3379.method810(arg0 ^ 0xFFFFFFF0);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Z")
    public final boolean method217(int arg0) {
        field2016++;
        int var2 = 10 % ((-arg0 - 60) / 37);
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public final void method224(int arg0) {
        field2023++;
        int var2 = -35 / ((arg0 - 52) / 46);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILen;IBLfs;IZ)V")
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        field2022++;
        if (arg3 == -42) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)I")
    public abstract int method431(int arg0);

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIII)V")
    public class143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2018 = arg0;
        this.field2015 = arg1;
        this.field2021 = arg2;
        this.field2030 = arg4;
        this.field2019 = arg3;
        this.field2025 = arg5;
        this.field2014 = arg6;
    }
}
