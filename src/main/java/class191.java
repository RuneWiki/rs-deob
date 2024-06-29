import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class191 extends class392 {

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "Lsv;")
    public static class570 field2864 = new class570(41, 3);

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "[Z")
    public static boolean[] field2866 = new boolean[8];

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "[B")
    public static byte[] field2867 = new byte[32896];

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "[I")
    public static int[] field2875;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "[I")
    public static int[] field2874;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "[I")
    public static int[] field2870;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "[I")
    public static int[] field2871;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "[I")
    public static int[] field2876;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "[I")
    public static int[] field2868;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2869;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "Lvb;")
    public static class396 field2873;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "[I")
    public static int[] field2879;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "[I")
    public static int[] field2878;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "Lou;")
    public static class292 field2877;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I")
    public final int method1367(int arg0) {
        if (arg0 != 17539) {
            this.method286((byte) -47, -80);
        }
        ++field2860;
        return super.field5452;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lw;)V")
    public class191(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(ILw;)V")
    public class191(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            this.method292(false);
        }
        ++field2865;
        return 1;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
    public static final boolean method1368(int arg0, int arg1, int arg2) {
        if (arg1 != -8576) {
            return true;
        } else {
            ++field2859;
            return class464.method2700(arg2, arg1 ^ 8575, arg0) || class608.method3522(arg2, false, arg0);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        ++field2863;
        if (~super.field5452 > -1 && super.field5452 > 127) {
            super.field5452 = this.method292(!arg0);
        }
        if (arg0) {
            this.method292(false);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        int var3 = -114 % ((arg0 - -80) / 38);
        super.field5452 = arg1;
        ++field2862;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public static void method1369(byte arg0) {
        field2866 = null;
        field2876 = null;
        if (arg0 >= 67) {
            field2870 = null;
            field2871 = null;
            field2864 = null;
            field2873 = null;
            field2875 = null;
            field2874 = null;
            field2879 = null;
            field2869 = null;
            field2878 = null;
            field2868 = null;
            field2867 = null;
            field2877 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        if (!arg0) {
            this.method286((byte) -17, -29);
        }
        ++field2861;
        return 127;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var2 <= var1; ++var2) {
                field2867[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 - -65535) / 65535.0F))));
            }
        }
        field2872 = 50;
        field2875 = new int[field2872];
        field2874 = new int[field2872];
        field2870 = new int[field2872];
        field2871 = new int[field2872];
        field2876 = new int[field2872];
        field2868 = new int[field2872];
        field2869 = new String[field2872];
        field2873 = new class396(10, 7);
        field2879 = new int[] { 0, -1, 0, 1 };
        field2878 = new int[3];
    }
}
