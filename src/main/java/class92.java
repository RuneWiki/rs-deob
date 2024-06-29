import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class92 extends class104 {

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Le;")
    private static class191 field1507 = class54.method368("OFF", 2047);

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Le;")
    public static class191 field1501 = field1507;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "[I")
    public static int[] field1511 = new int[5];

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Le;")
    public static class191 field1512 = class54.method368("p11_full", 2047);

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1510++;
        if (arg6 != 128) {
            method562(-102, -83, -10, -109, 11, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 52, (byte) -105, 25, -57);
        }
        if (class37.field678 <= arg1 && class207.field3680 >= arg1 && arg2 >= class37.field678 && arg2 <= class207.field3680 && arg7 >= class37.field678 && class207.field3680 >= arg7 && class37.field678 <= arg0 && arg0 <= class207.field3680 && arg3 >= class242.field4314 && class99.field1584 >= arg3 && class242.field4314 <= arg9 && arg9 <= class99.field1584 && arg5 >= class242.field4314 && class99.field1584 >= arg5 && arg4 >= class242.field4314 && class99.field1584 >= arg4) {
            class37.method257(arg1, arg7, arg4, arg0, arg2, arg8, arg5, 3, arg9, arg3);
        } else {
            class62.method415(false, arg5, arg4, arg3, arg7, arg1, arg8, arg9, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static final void method559(boolean arg0) {
        if (!arg0) {
            field1509 = -29;
        }
        field1514++;
        if (class17.field226 != null) {
            class183 var1 = class17.field226;
            synchronized (class17.field226) {
                class17.field226 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static final void method560(byte arg0) {
        if (arg0 <= -114) {
            class244.field4348.method992(-31);
            field1505++;
            class61.field1099.method992(-31);
            class137.field2290.method992(-31);
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static void method561(int arg0) {
        field1501 = null;
        field1507 = null;
        if (arg0 != 0) {
            field1512 = null;
        }
        field1512 = null;
        field1511 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class217.field3821 * 128) {
            arg0 = class217.field3821 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class85.field1406 * 128) {
            arg2 = class85.field1406 * 128 - 1;
        }
        class45.field803 = class15.field204[arg3];
        class62.field1118 = class15.field206[arg3];
        class17.field230 = class15.field204[arg4];
        class270.field4766 = class15.field206[arg4];
        class267.field4716 = arg0;
        class22.field319 = arg1;
        class73.field1268 = arg2;
        class161.field2720 = arg0 / 128;
        class31.field440 = arg2 / 128;
        class221.field3910 = class161.field2720 - class81.field1368;
        if (class221.field3910 < 0) {
            class221.field3910 = 0;
        }
        class141.field2346 = class31.field440 - class81.field1368;
        if (class141.field2346 < 0) {
            class141.field2346 = 0;
        }
        class262.field4641 = class81.field1368 + class161.field2720;
        if (class262.field4641 > class217.field3821) {
            class262.field4641 = class217.field3821;
        }
        class101.field1621 = class81.field1368 + class31.field440;
        if (class101.field1621 > class85.field1406) {
            class101.field1621 = class85.field1406;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class81.field1368 + class81.field1368 + 2; var16++) {
            for (int var19 = 0; var19 < class81.field1368 + class81.field1368 + 2; var19++) {
                int var20 = (var16 - class81.field1368 << 7) - (class267.field4716 & 0x7F);
                int var21 = (var19 - class81.field1368 << 7) - (class73.field1268 & 0x7F);
                int var22 = class161.field2720 + var16 - class81.field1368;
                int var23 = class31.field440 + var19 - class81.field1368;
                if (var22 >= 0 && var23 >= 0 && var22 < class217.field3821 && var23 < class85.field1406) {
                    int var24;
                    if (class32.field453 == null) {
                        var24 = class65.field1136[0][var22][var23] + 128 - class22.field319;
                    } else {
                        var24 = class32.field453[0][var22][var23] + 128 - class22.field319;
                    }
                    int var25 = class65.field1136[3][var22][var23] - class22.field319 - 1000;
                    class162.field2750[var16][var19] = class35.method244(var20, var25, var24, var21, var15);
                } else {
                    class162.field2750[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class81.field1368 + class81.field1368 + 1; var17++) {
            for (int var18 = 0; var18 < class81.field1368 + class81.field1368 + 1; var18++) {
                class66.field1150[var17][var18] = class162.field2750[var17][var18] || class162.field2750[var17 + 1][var18] || class162.field2750[var17][var18 + 1] || class162.field2750[var17 + 1][var18 + 1];
            }
        }
        class165.field2791 = arg6;
        class135.field2276 = arg7;
        class143.field2372 = arg8;
        class273.field4835 = arg9;
        class110.field1838 = arg10;
        class249.method1739();
        class99.method619(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Le;")
    public static final class191 method563(int arg0, int arg1) {
        field1515++;
        if (arg0 > -48) {
            method558(14, -115, -74, 55, -104, -90, 110, 126, 22, -118);
        }
        return class55.method373(110, false, 10, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
    public static final void method564(int arg0, int arg1) {
        field1502++;
        if (class127.method858(arg0, 46)) {
            class27.method199(arg1 + 17082, arg1, class242.field4325[arg0]);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lng;BLng;)V")
    public static final void method565(class121 arg0, byte arg1, class121 arg2) {
        field1506++;
        class206.field3652 = arg2;
        int var3 = -106 / ((arg1 - 37) / 59);
        class82.field1385 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
    public class92(int arg0, int arg1) {
        this.field1504 = arg1;
        this.field1513 = arg0;
    }
}
