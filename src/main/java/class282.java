import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class282 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
    public boolean field4608 = false;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field4613 = 0;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public int field4626 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[[Z")
    public static boolean[][] field4607 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field4618 = -1;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[Ltc;")
    public static class48[] field4611 = new class48[4];

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field4614 = -1;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field4620 = 0;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljj;")
    public static class168 field4610;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lkf;")
    public class249 field4624;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4612;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[[[B")
    public static byte[][][] field4615;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lek;Lek;ZII)Lje;", line = 9)
    public static final class84 method2002(class206 arg0, class206 arg1, boolean arg2, int arg3, int arg4) {
        field4617++;
        if (class76.method581(arg0, 81, arg4, arg3)) {
            return arg2 ? class303.method2168(true, arg1.method1404(arg4, arg3, (byte) -81)) : (class84) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V", line = 24)
    public static final void method2003(int arg0, byte arg1) {
        class238.field3885.method896(arg0, (byte) -28);
        field4622++;
        if (arg1 < 97) {
            method2002((class206) null, (class206) null, true, -39, 77);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 36)
    public static final void method2004(int arg0) {
        field4609++;
        for (int var1 = arg0; var1 < class277.field4517; var1++) {
            class123 var2 = class79.method595(var1, (byte) -45);
            if (var2 != null && var2.field2162 == 0) {
                class340.field5391[var1] = 0;
                class334.field5322[var1] = 0;
            }
        }
        class59.field1156 = new class328(16);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBIIII)V", line = 70)
    public static final void method2005(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= -53) {
            method2005(-79, 31, (byte) 70, -4, -112, -47, -43);
        }
        field4623++;
        if (arg6 - arg3 >= class190.field3224 && arg3 + arg6 <= class289.field4704 && (arg5 - arg3) >= class87.field1520 && arg3 + arg5 <= class177.field2930) {
            class209.method1441(-85, arg4, arg1, arg0, arg6, arg3, arg5);
        } else {
            class138.method958(arg3, arg1, arg6, arg5, arg4, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 90)
    public static void method2006(boolean arg0) {
        field4610 = null;
        field4615 = (byte[][][]) null;
        field4607 = (boolean[][]) null;
        field4611 = null;
        if (arg0) {
            method2005(123, 67, (byte) 68, -34, -121, -109, 124);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 103)
    public static final void method2007(byte arg0) {
        field4625++;
        if (arg0 != -13) {
            field4618 = 68;
        }
        int var1 = class332.field5297.method636(class20.field518);
        for (int var2 = 0; var2 < class137.field2343; var2++) {
            int var3 = class332.field5297.method636(class142.method972(var2, (byte) 37));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class137.field2343 * 15 + 21;
        int var5 = class57.field1135 - (var1 / 2);
        int var6 = class250.field4111;
        if (var6 + var4 > class287.field4696) {
            var6 = class287.field4696 - var4;
        }
        if (class133.field2287 < var5 + var1) {
            var5 = class133.field2287 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class200.field3356 == 1) {
            if (class57.field1135 == class201.field3373 && class34.field754 == class250.field4111) {
                class232.field3802 = (class170.field2807 ? 26 : 22) + class137.field2343 * 15;
                class351.field5616 = var6;
                class137.field2340 = var5;
                class200.field3356 = 0;
                class5.field87 = true;
                class278.field4528 = var1;
            }
        } else if (class57.field1135 == class37.field807 && class303.field4931 == class250.field4111) {
            class278.field4528 = var1;
            class137.field2340 = var5;
            class5.field87 = true;
            class232.field3802 = (class170.field2807 ? 26 : 22) + class137.field2343 * 15;
            class351.field5616 = var6;
            class200.field3356 = 0;
        } else {
            class34.field754 = class303.field4931;
            class201.field3373 = class37.field807;
            class200.field3356 = 1;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lg;I)Lg;", line = 207)
    public static final class181 method2008(class181 arg0, int arg1) {
        class181 var2 = client.method1995(arg0);
        if (arg1 != -1) {
            return (class181) null;
        }
        if (var2 == null) {
            var2 = arg0.field3045;
        }
        field4616++;
        return var2;
    }
}
