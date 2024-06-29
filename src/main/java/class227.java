import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class227 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Loa;")
    public static class99 field3920 = class221.method1463(2844, "Prendre");

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
    public static int[] field3926 = new int[50];

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3928 = 0;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3929 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Ltg;")
    public static class182 field3923;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1490(byte arg0) {
        field3923 = null;
        field3920 = null;
        field3926 = null;
        if (arg0 != 29) {
            field3926 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public static final void method1491(byte arg0) {
        field3927++;
        try {
            if (arg0 >= -95) {
                method1493(-99, -120, -40, -6, -72);
            }
            if (class53.field873 == 1) {
                int var1 = class116.field2065.method162(-21008);
                if (var1 > 0 && class116.field2065.method175((byte) 118)) {
                    int var2 = var1 - class34.field614;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class116.field2065.method146(-125, var2);
                } else {
                    class116.field2065.method163(100);
                    class116.field2065.method179(127);
                    class150.field2645 = null;
                    class139.field2464 = null;
                    if (class161.field2860 == null) {
                        class53.field873 = 0;
                    } else {
                        class53.field873 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class116.field2065.method163(113);
            class150.field2645 = null;
            class161.field2860 = null;
            class53.field873 = 0;
            class139.field2464 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z")
    public static final boolean method1492(int arg0, int arg1) {
        field3922++;
        if (arg1 != 0) {
            method1494(-23, 16, 38, (byte) 116, -77);
        }
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
    public static final void method1493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class175.method1174(class124.field2177[arg4], arg3, -7, arg1 - arg2, arg1 + arg2);
        field3919++;
        int var5 = arg2;
        int var6 = arg0;
        int var7 = -arg2;
        int var8 = -1;
        while (var6 < var5) {
            var8 += 2;
            var7 += var8;
            var6++;
            if (var7 >= 0) {
                var5--;
                int[] var9 = class124.field2177[arg4 - var5];
                int var10 = arg1 + var6;
                int[] var11 = class124.field2177[arg4 + var5];
                var7 -= var5 << 1;
                int var12 = arg1 - var6;
                class175.method1174(var11, arg3, -7, var12, var10);
                class175.method1174(var9, arg3, -7, var12, var10);
            }
            int var13 = arg1 - var5;
            int var14 = arg1 + var5;
            int[] var15 = class124.field2177[arg4 + var6];
            int[] var16 = class124.field2177[arg4 - var6];
            class175.method1174(var15, arg3, -7, var13, var14);
            class175.method1174(var16, arg3, -7, var13, var14);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIBI)V")
    public static final void method1494(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3921++;
        if (arg3 < -117 && arg1 >= class197.field3437 && arg1 <= class79.field1395) {
            int var5 = class166.method1127(class137.field2414, arg2, class178.field3101, 8946);
            int var6 = class166.method1127(class137.field2414, arg4, class178.field3101, 8946);
            class93.method623(arg1, (byte) 115, var5, var6, arg0);
        }
    }
}
