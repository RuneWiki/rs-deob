import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class159 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "J")
    public long field2920 = 0L;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lhh;")
    public static class163 field2924 = class137.method1065("sch-Utteln:", 17);

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
    public static int[] field2934 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Lhh;")
    public static class163 field2938 = class137.method1065("sl_arrows", 17);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lpa;")
    public static class123 field2922;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lta;")
    public class165 field2930;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lta;")
    public class165 field2932;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method1168(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg1 - arg3;
        int var10 = -9 % ((arg0 + 76) / 40);
        field2937++;
        int var11 = arg4 - arg7;
        int var12 = (arg2 - arg6 << 16) / var9;
        int var13 = (arg5 - arg8 << 16) / var11;
        class59.method409(arg7, arg1, var12, (byte) 124, var13, 0, arg3, 0, arg4, arg8, arg6);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static final void method1169(byte arg0) {
        class191.method1400();
        if (arg0 != -36) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class140.field2670[var1].method8(85);
        }
        field2926++;
        System.gc();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
    public static final int method1170(int arg0, int arg1) {
        field2931++;
        if (arg1 != -12902) {
            field2924 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field2934 = null;
        field2924 = null;
        field2922 = null;
        int var1 = 44 / ((arg0 + 24) / 36);
        field2938 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lpa;ZLpa;Lpa;)V")
    public static final void method1172(class123 arg0, boolean arg1, class123 arg2, class123 arg3) {
        if (!arg1) {
            method1169((byte) -80);
        }
        class74.field1389 = arg0;
        field2923++;
        class135.field2619 = arg2;
        class63.field1069 = arg3;
    }
}
