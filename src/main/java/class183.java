import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class183 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lhh;")
    public static class163 field3362 = class137.method1065("<img=0>", 17);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[I")
    public static int[] field3367 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3363 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "[Lvf;")
    public static class71[] field3370;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([Lqh;ZI)V")
    public static final void method1350(class69[] arg0, boolean arg1, int arg2) {
        field3368++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class69 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1294 == 0) {
                    if (var4.field1291 != null) {
                        method1350(var4.field1291, false, arg2);
                    }
                    class222 var5 = (class222) class92.field1739.method1743((long) var4.field1188, false);
                    if (var5 != null) {
                        class146.method1102(arg2, var5.field4049, -1458);
                    }
                }
                if (arg2 == 0 && var4.field1201 != null) {
                    class225 var6 = new class225();
                    var6.field4079 = var4.field1201;
                    var6.field4076 = var4;
                    class192.method1406(var6, (byte) 55);
                }
                if (arg2 == 1 && var4.field1285 != null) {
                    if (var4.field1205 >= 0) {
                        class69 var7 = class124.method989((byte) 113, var4.field1188);
                        if (var7 == null || var7.field1291 == null || var7.field1291.length <= var4.field1205 || var7.field1291[var4.field1205] != var4) {
                            continue;
                        }
                    }
                    class225 var8 = new class225();
                    var8.field4079 = var4.field1285;
                    var8.field4076 = var4;
                    class192.method1406(var8, (byte) 72);
                }
            }
        }
        if (arg1) {
            method1357(75, 93, 72, (class202) null, -59, 63, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1351(int arg0) {
        if (arg0 != 16) {
            field3362 = null;
        }
        field3367 = null;
        field3362 = null;
        field3370 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static final void method1352(byte arg0) {
        if (class76.field1428 != class236.field4213) {
            class205.field3706 += class236.field4213;
            class236.field4213 = class76.field1428;
            class205.field3706 -= class76.field1428;
            if (class193.field3521 != -1) {
                class243.method1677(59, true);
            }
        }
        if (class250.field4402 != null) {
            class250.field4402.hide();
        }
        class157.method1163(class202.field3675, -1);
        field3365++;
        class203.method1452((byte) 107, class202.field3675);
        if (class205.field3700 != null) {
            class205.field3700.method316(false, class202.field3675);
        }
        int var1 = -79 % ((43 - arg0) / 62);
        class131.method1036(10);
        class17.method119((byte) 87, class202.field3675);
        class220.method1555(class202.field3675, true);
        if (class205.field3700 != null) {
            class205.field3700.method315(class202.field3675, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    public static final void method1353(int arg0, int arg1) {
        field3361++;
        class4.field74.method112(arg0, 125);
        int var2 = 60 / ((-arg1 - 18) / 37);
        class210.field3813.method112(arg0, 109);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
    public static final int method1354(int arg0, int arg1) {
        field3366++;
        if (arg1 > -9) {
            return -68;
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xFE) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lpa;ILpa;)V")
    public static final void method1355(class123 arg0, int arg1, class123 arg2) {
        field3371++;
        class122.field2305 = arg2;
        class180.field3262 = arg0;
        class130.field2521 = class122.field2305.method971(arg1, 0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static final void method1356(boolean arg0) {
        if (class188.field3443 != null) {
            class188.field3443.method1724(true);
            class188.field3443 = null;
        }
        class131.method1037(false);
        field3360++;
        class191.method1400();
        for (int var1 = 0; var1 < 4; var1++) {
            class140.field2670[var1].method8(58);
        }
        class48.method345(false);
        System.gc();
        class259.method1751(2, 1);
        client.field1987 = -1;
        class123.field2360 = false;
        class260.method1757(true, arg0);
        class62.field1035 = 0;
        class50.field840 = false;
        class257.field4500 = 0;
        for (int var2 = 0; var2 < class174.field3174.length; var2++) {
            class174.field3174[var2] = null;
        }
        class95.field1791 = 0;
        class199.field3573 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class106.field2029[var3] = null;
            class228.field4116[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class111.field2098[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class32.field498[var5][var6][var7] = null;
                }
            }
        }
        class116.method930(-85);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILsh;IIB)V")
    public static final void method1357(int arg0, int arg1, int arg2, class202 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 >= -45) {
            method1352((byte) -43);
        }
        field3369++;
        class130.method1034(arg5, arg2, arg4, arg3.field3615, arg1, 125, arg0, arg3.field3633);
    }
}
