import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class103 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lrd;")
    public static class114 field2399 = class84.method656("mapfunction", (byte) 121);

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lrd;")
    public static class114 field2402 = class84.method656("backright2", (byte) 121);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lrd;")
    public static class114 field2406 = class84.method656("Wordpack geladen)3", (byte) 115);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lmd;")
    public static class84 field2407 = new class84();

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lrd;")
    public static class114 field2408 = class84.method656(":  ", (byte) 123);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
    public static boolean field2410 = false;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lrd;")
    public static class114 field2411 = class84.method656("Sie haben gerade eine andere Welt verlassen)3", (byte) 122);

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Lrd;")
    public static class114 field2413 = class84.method656("rot:", (byte) 118);

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Z")
    public static boolean field2412 = false;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "[I")
    public static int[] field2415 = new int[500];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lpb;")
    public static class100 field2409;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Loa;")
    public static class93 field2405;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
    public static final void method793(int arg0, int arg1, byte arg2) {
        field2414++;
        class116 var3 = class100.method771(arg1, false);
        int var4 = var3.field2696;
        int var5 = var3.field2706;
        int var6 = var3.field2700;
        int var7 = class69.field1515[var6 - var4];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class123.field2896[var5] = class38.method271(class96.method737(var8, arg0 << var4), class96.method737(~var8, class123.field2896[var5]));
        if (arg2 > -57) {
            method793(-87, 11, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method794(byte arg0) {
        field2407 = null;
        field2402 = null;
        field2408 = null;
        field2415 = null;
        field2406 = null;
        field2413 = null;
        field2399 = null;
        field2409 = null;
        if (arg0 == -32) {
            field2411 = null;
            field2405 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIB)I")
    public static final int method795(int arg0, int arg1, byte arg2) {
        field2401++;
        if (arg2 != -29) {
            field2402 = null;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method796(int arg0, boolean arg1) {
        field2404++;
        if (arg0 == 100 && class85.field1893 > 0) {
            byte[] var2 = class98.field2219[--class85.field1893];
            class98.field2219[class85.field1893] = null;
            return var2;
        }
        if (!arg1) {
            field2406 = null;
        }
        if (arg0 == 5000 && class66.field1435 > 0) {
            byte[] var3 = class127.field3028[--class66.field1435];
            class127.field3028[class66.field1435] = null;
            return var3;
        } else if (arg0 == 30000 && class60.field1233 > 0) {
            byte[] var4 = class58.field1202[--class60.field1233];
            class58.field1202[class60.field1233] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)I")
    public static final int method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        field2403++;
        int var8 = arg5 & 0x3;
        if (arg3 != -101) {
            return 48;
        } else if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg2;
        } else {
            return 1 + 7 - arg6 - arg0;
        }
    }
}
