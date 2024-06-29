import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class209 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2839 = "Drop";

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lii;")
    public static class405 field2847;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[Llg;")
    public static class20[] field2845;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1133(int arg0, int arg1) {
        field2843++;
        if (arg1 < 83) {
            field2839 = null;
        }
        if (class262.method1460((byte) -128, arg0)) {
            class140.method762(class235.field3227[arg0], -1, true);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 22)
    public static void method1134(byte arg0) {
        field2845 = null;
        int var1 = 99 / ((arg0 - 7) / 54);
        field2839 = null;
        field2847 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 38)
    public static final void method1135(int arg0) {
        field2846++;
        class194.method1045(true, class292.field3962);
        int var1 = (class70.field767 >> 3) + (class127.field1633 >> 10);
        int var2 = (class180.field2272 >> 10) + (class291.field3961 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class405.field5893 = new int[var6];
        if (arg0 > -85) {
            method1135(-31);
        }
        class297.field4042 = new byte[var6][];
        class65.field681 = new byte[var6][];
        class296.field4037 = new int[var6];
        class248.field3340 = new int[var6];
        class295.field4011 = new byte[var6][];
        class110.field1363 = new int[var6];
        class452.field6576 = new int[var6];
        class432.field6336 = new int[var6][4];
        class105.field1293 = new byte[var6][];
        class140.field1796 = new byte[var6][];
        class138.field1777 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - (class315.field4214 >> 4)) / 8; var8 <= (((class315.field4214 >> 4) + var1) / 8); var8++) {
            for (int var10 = (var2 - (class340.field4549 >> 4)) / 8; var10 <= ((var2 + (class340.field4549 >> 4)) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class138.field1777[var7] = var11;
                class452.field6576[var7] = class371.field5195.method1700("m" + var8 + "_" + var10, (byte) -70);
                class248.field3340[var7] = class371.field5195.method1700("l" + var8 + "_" + var10, (byte) -70);
                class296.field4037[var7] = class371.field5195.method1700("n" + var8 + "_" + var10, (byte) -70);
                class110.field1363[var7] = class371.field5195.method1700("um" + var8 + "_" + var10, (byte) -70);
                class405.field5893[var7] = class371.field5195.method1700("ul" + var8 + "_" + var10, (byte) -70);
                if (class296.field4037[var7] == -1) {
                    class452.field6576[var7] = -1;
                    class248.field3340[var7] = -1;
                    class110.field1363[var7] = -1;
                    class405.field5893[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class296.field4037.length; var9++) {
            class296.field4037[var9] = -1;
            class452.field6576[var9] = -1;
            class248.field3340[var9] = -1;
            class110.field1363[var9] = -1;
            class405.field5893[var9] = -1;
        }
        class85.method464(false, var4, var5, 0, var3, var2, var1, true);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 123)
    public static final void method1136(int arg0) {
        class114 var1 = class130.field1669;
        synchronized (class130.field1669) {
            if (arg0 != 0) {
                return;
            }
            class130.field1669.method613(true);
        }
        field2844++;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)I", line = 141)
    public static final int method1137(int arg0) {
        field2842++;
        if ((double) class443.field6450 == 3.0D) {
            return 37;
        } else if ((double) class443.field6450 == 4.0D) {
            return 50;
        } else if ((double) class443.field6450 == 6.0D) {
            return 75;
        } else if (arg0 == -746268989) {
            return (double) class443.field6450 == 8.0D ? 100 : 200;
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Llo;IIIIII)V", line = 167)
    public static final void method1138(class419 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 <= 114) {
            method1136(46);
        }
        class24.method128(0, arg0.field154, arg0.field152, arg6, arg5, arg3, arg4, arg2, -129);
        field2841++;
    }
}
