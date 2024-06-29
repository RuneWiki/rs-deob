import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class298 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[Lqo;")
    public static class127[] field4012 = new class127[32768];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4008 = "flash2:";

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lik;")
    public static class410 field4010 = new class410(16);

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4016 = 0;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Z")
    public static boolean field4019 = false;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4015 = 0;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "[S")
    public static short[] field4017 = new short[256];

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4018 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lrk;")
    public static class427 field4011;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1914(int arg0) {
        field4017 = null;
        field4010 = null;
        field4012 = null;
        field4011 = null;
        if (arg0 != -25144) {
            field4008 = null;
        }
        field4008 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIZIIII)V")
    public static final void method1915(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field4014++;
        if (arg0 >= 1 && arg1 >= 1 && (class116.field1621 - 2) >= arg0 && arg1 <= class385.field5425 - 2) {
            if (!class339.method2153(9) && !class113.method921(arg0, arg1, arg8, class329.field4471, arg4)) {
                return;
            }
            if (class118.field1653 == null) {
                return;
            }
            int var9 = arg8;
            if (arg8 < 3 && class272.method1741(arg1, -1, arg0)) {
                var9 = arg8 + 1;
            }
            class166.method1248(arg6, arg0, arg8, class235.field3247[arg8], var9, -121, arg1, class249.field3415);
            if (arg2 >= 0) {
                boolean var10 = class162.field2401;
                class162.field2401 = true;
                class42.method401(94, var9, class235.field3247[arg8], arg8, false, class249.field3415, arg7, arg1, arg3, arg2, arg5, false, arg0);
                class162.field2401 = var10;
            }
        }
        if (arg4) {
            method1916(44, (class80[]) null);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lkb;)V")
    public static final void method1916(int arg0, class80[] arg1) {
        class388.field5456 = arg1.length;
        field4013++;
        class258.field3483 = new class80[class388.field5456 + 10];
        class53.field872 = new int[class388.field5456 + 10];
        class152.method1169(arg1, arg0, class258.field3483, 0, class388.field5456);
        for (int var2 = 0; var2 < class388.field5456; var2++) {
            class53.field872[var2] = class258.field3483[var2].method739();
        }
        for (int var3 = class388.field5456; var3 < class258.field3483.length; var3++) {
            class53.field872[var3] = 12;
        }
    }
}
