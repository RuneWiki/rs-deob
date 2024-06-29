import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class19 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field223 = 0;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Lqj;")
    public static class280 field229 = new class280(64);

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Z")
    public static boolean field232 = false;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[I")
    public static int[] field236 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/String;")
    public static String field235 = " has logged in.";

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lnk;")
    public static class16 field226;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lfe;")
    public class270 field227;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lio;")
    public class294 field230;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field233;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[[B")
    public static byte[][] field234;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)V", line = 5)
    public static final void method140(long arg0, int arg1) {
        if (arg1 != 16711680) {
            return;
        }
        field222++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class332.method2299(arg1 ^ 0xFF00FFB2, arg0 - 1L);
            class332.method2299(-114, 1L);
        } else {
            class332.method2299(-120, arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 28)
    public static void method141(int arg0) {
        field236 = null;
        if (arg0 != 50) {
            return;
        }
        field234 = (byte[][]) null;
        field229 = null;
        field233 = null;
        field226 = null;
        field235 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZIILtb;II)Lpa;", line = 48)
    public static final class2 method142(int arg0, boolean arg1, int arg2, int arg3, class246 arg4, int arg5, int arg6) {
        field228++;
        int var8 = arg2 + (arg5 << 19) - (-(arg1 ? 65536 : 0) - (arg6 << 17));
        long var9 = (long) arg0 * 3147483667L + ((long) var8 * 3849834839L);
        class2 var11 = (class2) class112.field1558.method380(arg3 ^ arg3, var9);
        if (var11 != null) {
            return var11;
        }
        class104.field1429 = false;
        class2 var12 = class179.method1234(arg1, arg2, arg5, arg0, false, false, arg4, (byte) 23, arg6);
        if (var12 != null && !class104.field1429) {
            class112.field1558.method377(var9, var12, arg3 ^ 0xFFFFE77F);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V", line = 74)
    public static final void method143(int arg0, byte arg1) {
        if (arg0 == 37) {
            class336.field5349 = 3.0F;
        } else if (arg0 == 50) {
            class336.field5349 = 4.0F;
        } else if (arg0 == 75) {
            class336.field5349 = 6.0F;
        } else if (arg0 == 100) {
            class336.field5349 = 8.0F;
        } else if (arg0 == 200) {
            class336.field5349 = 16.0F;
        }
        field225++;
        class168.field2579 = -1;
        class168.field2579 = -1;
        if (arg1 <= 36) {
            method141(94);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V", line = 113)
    public static final void method144(byte arg0, int arg1) {
        field224++;
        int var2 = -101 / ((63 - arg0) / 59);
        if (class31.field362 == arg1 && arg1 != 0) {
            class97 var3 = class10.field94[arg1];
            var3.method150(class222.field3360);
        }
    }
}
