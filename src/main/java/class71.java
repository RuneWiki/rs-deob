import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "F")
    public static float field869;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)I")
    public static final int method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg6 & 0x3;
        int var9 = -100 % ((arg1 + 47) / 58);
        field868++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg0;
        } else {
            return 7 - (arg5 - (1 - arg2));
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)[Lsd;")
    public static final class74[] method361(int arg0) {
        int var1 = 15 / ((arg0 - 32) / 47);
        field870++;
        return new class74[] { class208.field2874, class274.field3887, class367.field5250, class18.field226, class19.field248, class236.field3261, class112.field1371, class200.field2782, class77.field922, class364.field5228, class231.field3191, class154.field1853, class34.field416, class232.field3222, class201.field2786, class481.field6802, class368.field5262, class398.field5657, class2.field7, class397.field5640, class120.field1491, class276.field3951, class138.field1667, class41.field499, class464.field6534, class422.field6087, class284.field4137, class361.field5201, class42.field504, class198.field2713, class312.field4558, class335.field4829, class260.field3749, class244.field3331, class67.field838, class318.field4631, class421.field6078, class86.field1053, class440.field6299, class351.field5043, class448.field6354, class115.field1415, class298.field4456, class50.field639, class72.field873, class273.field3874, class172.field2056, class131.field1602, class292.field4341, class358.field5168, class484.field6855, class471.field6640, class403.field5735, class89.field1101, class283.field4122, class199.field2764, class108.field1300, class44.field562, class298.field4458, class468.field6576, class361.field5204, class328.field4713, class322.field4661, class82.field982, class231.field3200, class435.field6266, class482.field6810, class287.field4297, class216.field2977, class106.field1295, class261.field3757, class375.field5352, client.field3941, class144.field1739, class118.field1452, class227.field3153, class119.field1485, class344.field4928, class457.field6439, class229.field3177, class367.field5253, class282.field4108, class263.field3799, class291.field4339, class21.field290, class357.field5163, class376.field5361, class178.field2156, class354.field5085, class403.field5723, class424.field6110, class438.field6279, class121.field1499, class281.field4096, class323.field4662, class273.field3872, class304.field4490, class485.field6879, class240.field3300, class459.field6483, class115.field1421, class324.field4680, class297.field4437, class362.field5215, class373.field5337 };
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public static final int method362(int arg0, int arg1) {
        return class419.field6040 == null ? 0 : (class419.field6040[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
    public static final void method363(int arg0, int arg1) {
        field867++;
        if (arg1 != 3) {
            method364(-93);
        }
        class89 var2 = class146.method695(6, arg0, (byte) -71);
        var2.method448(13);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static final void method364(int arg0) {
        field871++;
        int var1 = class438.field6286;
        int[] var2 = class79.field944;
        for (int var3 = arg0; var3 < var1; var3++) {
            class198 var7 = class46.field596[var2[var3]];
            if (var7 != null && var7.field2486 > 0) {
                var7.field2486--;
                if (var7.field2486 == 0) {
                    var7.field2473 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class356.field5112; var4++) {
            int var5 = class25.field353[var4];
            class137 var6 = class448.field6366[var5];
            if (var6 != null && var6.field2486 > 0) {
                var6.field2486--;
                if (var6.field2486 == 0) {
                    var6.field2473 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Loj;IILbd;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method365(class280 arg0, int arg1, int arg2, class327 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class415.field5985 = arg0;
        class113.field1389 = arg1;
        class83.field1003 = arg3;
        class183.field2363 = class415.field5985.method1345() > 0;
        class352.field5065 = arg4 >> class482.field6812;
        class25.field345 = arg6 >> class482.field6812;
        class404.field5739 = arg4;
        class68.field851 = arg6;
        class280.field4067 = arg5;
        class63.field785 = class352.field5065 - class218.field3071;
        if (class63.field785 < 0) {
            class453.field6406 = -class63.field785;
            class63.field785 = 0;
        } else {
            class453.field6406 = 0;
        }
        class360.field5183 = class25.field345 - class218.field3071;
        if (class360.field5183 < 0) {
            class193.field2653 = -class360.field5183;
            class360.field5183 = 0;
        } else {
            class193.field2653 = 0;
        }
        class216.field2980 = class352.field5065 + class218.field3071;
        if (class216.field2980 > class176.field2122) {
            class216.field2980 = class176.field2122;
        }
        class257.field3718 = class25.field345 + class218.field3071;
        if (class257.field3718 > class225.field3116) {
            class257.field3718 = class225.field3116;
        }
        for (int var18 = 0; var18 < class218.field3071 + class218.field3071 + 2; var18++) {
            for (int var23 = 0; var23 < class218.field3071 + class218.field3071 + 2; var23++) {
                int var24 = class352.field5065 + var18 - class218.field3071;
                int var25 = class25.field345 + var23 - class218.field3071;
                if (var24 >= 0 && var25 >= 0 && var24 < class176.field2122 && var25 < class225.field3116) {
                    int var26 = var24 << class482.field6812;
                    int var27 = var25 << class482.field6812;
                    int var28 = class443.field6329[class443.field6329.length - 1].method1861(var24, var25) - 1000;
                    int var29 = class361.field5208 == null ? class443.field6329[0].method1861(var24, var25) + class200.field2777 : class361.field5208[0].method1861(var24, var25) + class200.field2777;
                    class241.field3311[var18][var23] = class415.field5985.method1347(var26, var28, var27, var26, var29, var27);
                } else {
                    class241.field3311[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class218.field3071 + class218.field3071 + 1; var19++) {
            for (int var22 = 0; var22 < class218.field3071 + class218.field3071 + 1; var22++) {
                class115.field1413[var19][var22] = class241.field3311[var19][var22] || class241.field3311[var19 + 1][var22] || class241.field3311[var19][var22 + 1] || class241.field3311[var19 + 1][var22 + 1];
            }
        }
        class329.field4733 = arg8;
        class125.field1535 = arg9;
        class162.field1938 = arg10;
        class67.field843 = arg11;
        class94.field1177 = arg12;
        class103.method498();
        class39.method199((byte) 23);
        for (class451 var20 = (class451) class305.field4504.method2334(-104); var20 != null; var20 = (class451) class305.field4504.method2340(65)) {
            var20.method2550(false);
            class477.method2826(var20, (byte) -80);
        }
        if (class183.field2363) {
            for (int var21 = 0; var21 < class10.field129; var21++) {
                class364.field5236[var21].method1985(16, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class415.field5985.method1408(0);
            if (class96.field1187 == null || class96.field1187 instanceof class148) {
                class96.field1187 = new class343();
            }
        } else if (class96.field1187 == null || class96.field1187 instanceof class343) {
            class96.field1187 = new class148();
        }
        class96.field1187.method708(14, arg2);
        class96.field1187.method710(100);
        if (class159.field1901 != null) {
            class270.method1634(true);
            class96.field1187.method706(-8173, 22);
            class329.method1997(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class96.field1187.method710(100);
            class96.field1187.method706(-8173, 23);
            class270.method1634(false);
        }
        class329.method1997(arg2, arg7, arg13, arg14, arg15, arg16);
        class96.field1187.method710(100);
        class96.field1187.method716(-31042);
        class96.field1187.method710(100);
        if (arg2 > 1) {
            class415.field5985.method1381(0);
        }
        class415.field5985.method1370(0, (class190[]) null);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I")
    public static final int method366(int arg0) {
        if (arg0 <= 62) {
            return -13;
        }
        field866++;
        if (class348.field4961 == null) {
            return class464.field6538 ? 2 : 1;
        } else {
            return 3;
        }
    }
}
