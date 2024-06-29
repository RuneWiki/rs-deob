import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class273 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lvl;")
    public static class68 field4412 = null;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lfh;")
    public static class178 field4407 = new class178(5000);

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4413 = 0;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
    public static int[] field4416 = new int[32];

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Ljg;")
    public static class271 field4409;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[[[Lpk;")
    public static class99[][][] field4415;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLhi;I)Lch;")
    public static final class125 method1840(byte arg0, class264 arg1, int arg2) {
        field4410++;
        class125 var3 = new class125(arg2, arg1.method1750((byte) -128), arg1.method1750((byte) -99), arg1.method1765((byte) 90), arg1.method1765((byte) 98), arg1.method1779(-94) == 1, arg1.method1779(arg0 ^ 0xFFFFFFFE));
        int var4 = arg1.method1779(-118);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field2079.method363(arg0 ^ 0x5D, new class52(arg1.method1779(-49), arg1.method1779(-83), arg1.method1777(arg0 - 143), arg1.method1777(-53), arg1.method1777(-121), arg1.method1777(-75), arg1.method1777(-113), arg1.method1777(arg0 - 204), arg1.method1777(-63), arg1.method1777(-65)));
        }
        var3.method874(arg0);
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    public static final void method1841(int arg0, int arg1, int arg2) {
        field4406++;
        if (arg1 != 4547) {
            method1843(true, 57, 24, 62);
        }
        class108.field1876[arg0] = arg2;
        class100 var3 = (class100) class129.field2158.method457((long) arg0, (byte) -115);
        if (var3 == null) {
            class100 var4 = new class100(4611686018427387905L);
            class129.field2158.method466((long) arg0, var4, (byte) 93);
        } else if (var3.field1519 != 4611686018427387905L) {
            var3.field1519 = class182.method1253(20215) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILjj;I)Lvl;")
    public static final class68 method1842(int arg0, int arg1, class134 arg2, int arg3) {
        int var4 = 87 % ((-arg0 - 10) / 54);
        field4408++;
        return class227.method1499((byte) -87, arg2, arg3, arg1) ? class45.method353(true) : null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method1843(boolean arg0, int arg1, int arg2, int arg3) {
        field4411++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg1 >= 0) {
            int var4 = arg1 / arg2;
            if (arg3 > -108) {
                return null;
            }
            int var5 = 2;
            while (var4 != 0) {
                var4 /= arg2;
                var5++;
            }
            char[] var6 = new char[var5];
            var6[0] = '+';
            for (int var7 = var5 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - (arg1 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1844(int arg0) {
        field4416 = null;
        if (arg0 != 2) {
            field4414 = -111;
        }
        field4409 = null;
        field4415 = null;
        field4407 = null;
        field4412 = null;
    }
}
