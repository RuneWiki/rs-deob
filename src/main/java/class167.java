import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class167 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lcc;")
    public static class321 field2912 = class100.method684(1332893734);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lhi;")
    public static class82 field2913 = class95.method664((byte) -82, "Benutzen");

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lhi;")
    public static class82 field2915 = class95.method664((byte) -94, " loggt sich aus)3");

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lhn;")
    public static class317 field2914 = new class317(200);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 7)
    public static final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class89.field1605 * 128) {
            arg0 = class89.field1605 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class38.field658 * 128) {
            arg2 = class38.field658 * 128 - 1;
        }
        class280.field4712 = class102.field1813[arg3];
        class311.field5312 = class102.field1819[arg3];
        class123.field2143 = class102.field1813[arg4];
        class199.field3422 = class102.field1819[arg4];
        class129.field2252 = arg0;
        class191.field3210 = arg1;
        class37.field621 = arg2;
        class137.field2363 = arg0 / 128;
        class325.field5585 = arg2 / 128;
        class87.field1546 = class137.field2363 - class71.field1095;
        if (class87.field1546 < 0) {
            class87.field1546 = 0;
        }
        class126.field2218 = class325.field5585 - class71.field1095;
        if (class126.field2218 < 0) {
            class126.field2218 = 0;
        }
        class247.field4275 = class71.field1095 + class137.field2363;
        if (class247.field4275 > class89.field1605) {
            class247.field4275 = class89.field1605;
        }
        class203.field3520 = class71.field1095 + class325.field5585;
        if (class203.field3520 > class38.field658) {
            class203.field3520 = class38.field658;
        }
        short var15;
        if (class147.field2485) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class71.field1095 + class71.field1095 + 2; var16++) {
            for (int var17 = 0; var17 < class71.field1095 + class71.field1095 + 2; var17++) {
                int var18 = (var16 - class71.field1095 << 7) - (class129.field2252 & 0x7F);
                int var19 = (var17 - class71.field1095 << 7) - (class37.field621 & 0x7F);
                int var20 = class137.field2363 + var16 - class71.field1095;
                int var21 = class325.field5585 + var17 - class71.field1095;
                if (var20 >= 0 && var21 >= 0 && var20 < class89.field1605 && var21 < class38.field658) {
                    int var22;
                    if (class150.field2560 == null) {
                        var22 = class180.field3073[0][var20][var21] + 128 - class191.field3210;
                    } else {
                        var22 = class150.field2560[0][var20][var21] + 128 - class191.field3210;
                    }
                    int var23 = class180.field3073[3][var20][var21] - class191.field3210 - 1000;
                    class292.field4900[var16][var17] = class328.method2243(var18, var23, var22, var19, var15);
                } else {
                    class292.field4900[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class71.field1095 + class71.field1095 + 1; var24++) {
            for (int var25 = 0; var25 < class71.field1095 + class71.field1095 + 1; var25++) {
                class42.field743[var24][var25] = class292.field4900[var24][var25] || class292.field4900[var24 + 1][var25] || class292.field4900[var24][var25 + 1] || class292.field4900[var24 + 1][var25 + 1];
            }
        }
        class150.field2548 = arg6;
        class112.field2013 = arg7;
        class133.field2296 = arg8;
        class33.field498 = arg9;
        class40.field705 = arg10;
        class90.method639();
        if (class238.field4139 != null) {
            class90.method640(true);
            class275.method1917(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class147.field2485) {
                class193.field3276 = false;
                class171.method1211(0, 0, false);
                class85.method595((float[]) null);
                class2.method3();
            }
            class90.method640(false);
        }
        class275.method1917(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 135)
    public static void method1201(int arg0) {
        field2915 = null;
        field2913 = null;
        field2914 = null;
        field2912 = null;
        int var1 = -84 % ((4 - arg0) / 58);
    }
}
