import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class127 extends RuntimeException {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ljava/lang/String;")
    public String field2567;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2572;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljd;")
    private static class92 field2564 = class202.method1325((byte) 90, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[I")
    public static int[] field2568 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Ljd;")
    public static class92 field2562 = class202.method1325((byte) 90, " x ");

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2565 = 0;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Ljd;")
    public static class92 field2571 = class202.method1325((byte) 90, "<col=00ffff>");

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Ljd;")
    public static class92 field2573 = field2564;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lae;")
    public static class6 field2570;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static final void method847(int arg0) {
        if (arg0 != 45) {
            field2565 = 13;
        }
        if (class169.field3301.toLowerCase().indexOf("microsoft") == -1) {
            class162.field3186[45] = 26;
            class162.field3186[93] = 43;
            class162.field3186[59] = 57;
            class162.field3186[46] = 72;
            if (class169.field3298 == null) {
                class162.field3186[192] = 58;
                class162.field3186[222] = 59;
            } else {
                class162.field3186[192] = 28;
                class162.field3186[222] = 58;
                class162.field3186[520] = 59;
            }
            class162.field3186[47] = 73;
            class162.field3186[92] = 74;
            class162.field3186[44] = 71;
            class162.field3186[91] = 42;
            class162.field3186[61] = 27;
        } else {
            class162.field3186[192] = 58;
            class162.field3186[223] = 28;
            class162.field3186[190] = 72;
            class162.field3186[188] = 71;
            class162.field3186[222] = 59;
            class162.field3186[191] = 73;
            class162.field3186[186] = 57;
            class162.field3186[220] = 74;
            class162.field3186[189] = 26;
            class162.field3186[219] = 42;
            class162.field3186[221] = 43;
            class162.field3186[187] = 27;
        }
        field2574++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method848(int arg0) {
        if (arg0 != 223) {
            method847(60);
        }
        field2570 = null;
        field2573 = null;
        field2571 = null;
        field2568 = null;
        field2562 = null;
        field2564 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILac;)V")
    public static final void method849(int arg0, class4 arg1) {
        if (class158.field3150 == arg1.field232 || arg1.field215 == -1 || arg1.field254 != 0 || arg1.field251 + 1 > class153.method978(arg1.field215, arg0 + -11708).field515[arg1.field260]) {
            int var2 = arg1.field232 - arg1.field249;
            int var3 = class158.field3150 - arg1.field249;
            int var4 = arg1.field212 * 128 + arg1.field211 * 64;
            int var5 = arg1.field258 * 128 + arg1.field211 * 64;
            int var6 = arg1.field207 * 128 + arg1.field211 * 64;
            arg1.field246 = ((var2 - var3) * var6 + var3 * var5) / var2;
            int var7 = arg1.field211 * 64 + arg1.field210 * 128;
            arg1.field208 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        if (arg0 != 11580) {
            method849(55, null);
        }
        field2563++;
        if (arg1.field222 == 0) {
            arg1.field243 = 1024;
        }
        if (arg1.field222 == 1) {
            arg1.field243 = 1536;
        }
        arg1.field252 = 0;
        if (arg1.field222 == 2) {
            arg1.field243 = 0;
        }
        if (arg1.field222 == 3) {
            arg1.field243 = 512;
        }
        arg1.field234 = arg1.field243;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIIII)I")
    public static final int method850(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2566++;
        int var5 = 65536 - class194.field3803[arg1 * 1024 / arg2] >> 1;
        if (!arg0) {
            method848(-98);
        }
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class127(Throwable arg0, String arg1) {
        this.field2567 = arg1;
        this.field2572 = arg0;
    }
}
