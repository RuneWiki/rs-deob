import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class358 extends class159 {

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public int field5673;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5674 = "Continue";

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILnm;)V", line = 8)
    public static final void method2488(int arg0, class221 arg1) {
        class290.field4819 = arg1.method1510("titlebg", 0);
        class341.field5502 = arg1.method1510("logo", 0);
        if (arg0 == 8) {
            field5678++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZIII)V", line = 20)
    public static final void method2489(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class183.method1270(false, -1);
        class68.field1057 = arg0;
        class327.field5353 = arg3;
        class46.field670 = arg1;
        field5668++;
        class88.method578(arg4);
        class48.field689 = new class4(8);
        class91.field1311 = new class4(arg2);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method2490(boolean arg0) {
        class79.method539(class31.field478, -93);
        field5670++;
        int var1 = (class259.field4098 >> 10) + (class150.field2420 >> 3);
        byte var2 = 0;
        int var3 = (class41.field625 >> 10) + (class215.field3313 >> 3);
        byte var4 = 18;
        class150.field2404 = new int[var4];
        class315.field5197 = new byte[var4][];
        class190.field2956 = new int[var4];
        class54.field813 = new int[var4];
        class241.field3778 = new byte[var4][];
        byte var5 = 8;
        class71.field1096 = new byte[var4][];
        class177.field2752 = new int[var4][4];
        byte var6 = 8;
        class285.field4673 = new int[var4];
        class23.field352 = new byte[var4][];
        class202.field3107 = new byte[var4][];
        class356.field5644 = new int[var4];
        class51.field764 = new int[var4];
        int var7 = 0;
        for (int var8 = (var3 - 6) / 8; var8 <= ((var3 + 6) / 8); var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class150.field2404[var7] = var10;
                class285.field4673[var7] = class97.field1406.method1510("m" + var8 + "_" + var9, 0);
                class356.field5644[var7] = class97.field1406.method1510("l" + var8 + "_" + var9, 0);
                class190.field2956[var7] = class97.field1406.method1510("n" + var8 + "_" + var9, 0);
                class54.field813[var7] = class97.field1406.method1510("um" + var8 + "_" + var9, 0);
                class51.field764[var7] = class97.field1406.method1510("ul" + var8 + "_" + var9, 0);
                if (class190.field2956[var7] == -1) {
                    class285.field4673[var7] = -1;
                    class356.field5644[var7] = -1;
                    class54.field813[var7] = -1;
                    class51.field764[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class190.field2956.length; var11++) {
            class190.field2956[var11] = -1;
            class285.field4673[var11] = -1;
            class356.field5644[var11] = -1;
            class54.field813[var11] = -1;
            class51.field764[var11] = -1;
        }
        class304.method2132(var2, var3, true, var5, arg0, var1, var6, (byte) -115);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", line = 119)
    public static final void method2491(String arg0, int arg1, String arg2, String arg3, int arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class166.field2625[var6] = class166.field2625[var6 - 1];
            class119.field1765[var6] = class119.field1765[var6 - 1];
            class84.field1210[var6] = class84.field1210[var6 - 1];
            class47.field688[var6] = class47.field688[var6 - 1];
            class139.field2197[var6] = class139.field2197[var6 - 1];
        }
        class119.field1765[0] = arg2;
        field5677++;
        class166.field2625[0] = arg5;
        class139.field2197[0] = arg1;
        class253.field4023++;
        class84.field1210[0] = arg3;
        class47.field688[0] = arg0;
        class49.field720 = class12.field157;
        if (arg4 != -21381) {
            field5674 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIILod;IILkl;Ls;)V", line = 150)
    public static final void method2492(int arg0, int arg1, int arg2, class233 arg3, int arg4, int arg5, class39 arg6, class126 arg7) {
        if (arg0 > -41) {
            field5667 = -125;
        }
        class250 var8 = new class250();
        var8.field3987 = arg2 * 128;
        var8.field3978 = arg4;
        var8.field3989 = arg1 * 128;
        field5671++;
        if (arg7 != null) {
            var8.field3974 = arg7.field1946;
            var8.field3972 = arg7.field1928;
            var8.field3997 = arg7.field1907;
            var8.field3981 = arg7.field1921;
            var8.field3973 = arg7.field1945;
            var8.field3986 = arg7;
            int var9 = arg7.field1880;
            int var10 = arg7.field1929;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg7.field1880;
                var9 = arg7.field1929;
            }
            var8.field3977 = (arg1 + var10) * 128;
            var8.field3970 = (arg2 + var9) * 128;
            var8.field3980 = arg7.field1910 * 128;
            if (arg7.field1949 != null) {
                var8.field3990 = true;
                var8.method1776((byte) 92);
            }
            if (var8.field3974 != null) {
                var8.field3971 = var8.field3981 + (int) ((double) (var8.field3997 - var8.field3981) * Math.random());
            }
            class250.field3988.method1077(16711935, var8);
        } else if (arg3 != null) {
            class139 var11 = arg3.field3702;
            var8.field3968 = arg3;
            if (var11.field2229 != null) {
                var8.field3990 = true;
                var11 = var11.method987(-1);
            }
            if (var11 != null) {
                var8.field3977 = (var11.field2220 + arg1) * 128;
                var8.field3970 = (arg2 + var11.field2220) * 128;
                var8.field3972 = class142.method1004(arg3, 20438);
                var8.field3980 = var11.field2191 * 128;
                var8.field3973 = var11.field2195;
            }
            class49.field701.method1077(16711935, var8);
        } else if (arg6 != null) {
            var8.field3984 = arg6;
            var8.field3970 = (arg2 + arg6.method312(81)) * 128;
            var8.field3977 = (arg1 + arg6.method312(33)) * 128;
            var8.field3972 = class68.method477((byte) -108, arg6);
            var8.field3980 = arg6.field579 * 128;
            var8.field3973 = arg6.field587;
            class109.field1586.method37(false, var8, class265.method1872(arg6.field597, 121));
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLnm;I)Z", line = 241)
    public static final boolean method2493(byte arg0, class221 arg1, int arg2) {
        field5676++;
        if (arg0 != -90) {
            method2493((byte) 81, (class221) null, -114);
        }
        byte[] var3 = arg1.method1513(arg2, true);
        if (var3 == null) {
            return false;
        } else {
            class26.method228(var3, (byte) 80);
            return true;
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V", line = 259)
    public static void method2494(int arg0) {
        field5674 = null;
        if (arg0 > 0) {
            method2492(-80, -55, -84, (class233) null, -11, 110, (class39) null, (class126) null);
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V", line = 269)
    public class358(int arg0, int arg1) {
        this.field5673 = arg0;
        this.field5672 = arg1;
    }
}
