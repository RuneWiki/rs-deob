import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class183 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Luf;")
    private static class168 field2937 = class148.method1019(-1720, "flash3:");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Luf;")
    public static class168 field2939 = field2937;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Luf;")
    public static class168 field2935 = field2937;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2940 = -1;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static volatile int field2945 = 0;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Luf;")
    private static class168 field2943 = class148.method1019(-1720, "Free world");

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Luf;")
    public static class168 field2942 = field2943;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2941 = -1;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 11)
    public static void method1300(int arg0) {
        field2942 = null;
        if (arg0 != -1) {
            method1302((byte) 3, -50, -124, (byte[]) null);
        }
        field2935 = null;
        field2939 = null;
        field2943 = null;
        field2937 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIBI)V", line = 33)
    public static final void method1301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field2936++;
        if (class18.method83((byte) -113, arg5)) {
            class87.field1345 = null;
            class297.method2033(arg0, arg8, arg6, arg2, -1, -1, arg3, arg4, class272.field4582[arg5], arg1);
            if (class87.field1345 != null) {
                class297.method2033(arg0, arg8, class251.field4268, arg2, -1412584499, -1, arg3, arg4, class87.field1345, class226.field3680);
                class87.field1345 = null;
            }
            if (arg7 <= 60) {
                field2945 = -14;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class214.field3495[var9] = true;
            }
        } else {
            class214.field3495[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII[B)Luf;", line = 75)
    public static final class168 method1302(byte arg0, int arg1, int arg2, byte[] arg3) {
        field2944++;
        class168 var4 = new class168();
        var4.field2692 = 0;
        var4.field2716 = new byte[arg2];
        int var5 = arg1;
        if (arg0 != -10) {
            return (class168) null;
        }
        while (arg1 + arg2 > var5) {
            if (arg3[var5] != 0) {
                var4.field2716[var4.field2692++] = arg3[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public abstract void method36(byte arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)I")
    public abstract int method37(boolean arg0, int arg1, int arg2);
}
