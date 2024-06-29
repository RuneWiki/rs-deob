import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class246 extends class292 {

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lok;")
    public static class41 field3953 = class137.method956("0", 45);

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "[Lof;")
    public static class245[] field3955 = new class245[2048];

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field3954 = 0;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "[Lok;")
    public static class41[] field3951 = new class41[100];

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field3952 = 0;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V", line = 11)
    public static final void method1758(int arg0, int arg1) {
        field3950++;
        class46 var2 = class195.method1396(11, arg0, false);
        var2.method336(true);
        if (arg1 != 31089) {
            field3951 = (class41[]) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 33)
    public static void method1759(byte arg0) {
        field3955 = null;
        if (arg0 != 29) {
            method1759((byte) -9);
        }
        field3953 = null;
        field3951 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLag;)V", line = 52)
    public static final void method1760(byte arg0, class211 arg1) {
        field3949++;
        class220 var2 = null;
        try {
            class182 var3 = arg1.method1492((byte) 125, "runescape");
            if (arg0 < 4) {
                return;
            }
            while (var3.field2948 == 0) {
                class300.method2068(127, 1L);
            }
            if (var3.field2948 == 1) {
                var2 = (class220) var3.field2945;
                class112 var4 = class138.method966(1);
                var2.method1579(16235, var4.field1640, var4.field1607, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1580(-3810);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 100)
    public static final void method1761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class289 var20 = new class289(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class205.field3312[var21][arg1][arg2] == null) {
                    class205.field3312[var21][arg1][arg2] = new class308(var21, arg1, arg2);
                }
            }
            class205.field3312[arg0][arg1][arg2].field5199 = var20;
        } else if (arg3 == 1) {
            class289 var22 = new class289(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class205.field3312[var23][arg1][arg2] == null) {
                    class205.field3312[var23][arg1][arg2] = new class308(var23, arg1, arg2);
                }
            }
            class205.field3312[arg0][arg1][arg2].field5199 = var22;
        } else {
            class170 var24 = new class170(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class205.field3312[var25][arg1][arg2] == null) {
                    class205.field3312[var25][arg1][arg2] = new class308(var25, arg1, arg2);
                }
            }
            class205.field3312[arg0][arg1][arg2].field5212 = var24;
        }
    }
}
