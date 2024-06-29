import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class124 extends class273 {

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lwm;")
    public static class152 field1736 = class157.method1048("Suche nach Updates )2 ", 117);

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Lwm;")
    private static class152 field1741 = class157.method1048("RuneScape is loading )2 please wait)3)3)3", 121);

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[Luk;")
    public static class93[] field1744 = new class93[14];

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lwm;")
    public static class152 field1735 = field1741;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "[S")
    public static short[] field1745 = new short[256];

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lwm;")
    public static class152 field1746 = class157.method1048("M-Bmoire attribu-Be", 108);

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lbg;")
    public static class203 field1742;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[S[Lwm;I)V", line = 7)
    public static final void method790(int arg0, int arg1, short[] arg2, class152[] arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = arg1;
            int var6 = (arg1 + arg4) / 2;
            class152 var7 = arg3[var6];
            arg3[var6] = arg3[arg4];
            arg3[arg4] = var7;
            short var8 = arg2[var6];
            arg2[var6] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (var7 == null || arg3[var9] != null && arg3[var9].method1007(var7, (byte) -13) < (var9 & 0x1)) {
                    class152 var10 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5++] = var11;
                }
            }
            arg3[arg4] = arg3[var5];
            arg3[var5] = var7;
            arg2[arg4] = arg2[var5];
            arg2[var5] = var8;
            method790(arg0 ^ 0x0, arg1, arg2, arg3, var5 - 1);
            method790(1, var5 + 1, arg2, arg3, arg4);
        }
        if (arg0 != 1) {
            method793(102);
        }
        field1740++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Ldl;", line = 66)
    public static final class38 method791(byte arg0) {
        if (arg0 != 13) {
            method792(24);
        }
        field1743++;
        try {
            return (class38) Class.forName("i").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class298();
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 81)
    public static final void method792(int arg0) {
        if (class270.field4629 != null) {
            class270.field4629.method1671(41);
        }
        field1738++;
        if (class224.field3646 != null) {
            class224.field3646.method1671(58);
        }
        class313.method2179(class28.field484, arg0, 22050, (byte) 78);
        class270.field4629 = class152.method1011(class34.field572, 0, 256, 22050, class224.field3648);
        class270.field4629.method1674(class239.field3914, 16419);
        class224.field3646 = class152.method1011(class34.field572, 1, arg0 + 254, 2048, class224.field3648);
        class224.field3646.method1674(class290.field4916, 16419);
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V", line = 107)
    public static void method793(int arg0) {
        field1744 = null;
        field1745 = null;
        field1746 = null;
        field1736 = null;
        if (arg0 == 21020) {
            field1741 = null;
            field1735 = null;
            field1742 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V", line = 127)
    public class124(int arg0, int arg1) {
        this.field1739 = arg0;
        this.field1737 = arg1;
    }
}
