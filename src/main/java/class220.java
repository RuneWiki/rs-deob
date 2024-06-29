import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class220 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lqd;")
    private static class40 field3658 = class147.method1106("Connected to update server", (byte) -68);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lqd;")
    public static class40 field3666 = class147.method1106(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) -99);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lqd;")
    public static class40 field3663 = class147.method1106("<img=1>", (byte) -90);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lqd;")
    public static class40 field3668 = field3658;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lqd;")
    private static class40 field3667 = class147.method1106("Loading textures )2 ", (byte) -88);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lqd;")
    public static class40 field3661 = field3667;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 4)
    public static void method1540(int arg0) {
        field3658 = null;
        field3668 = null;
        field3666 = null;
        field3667 = null;
        field3663 = null;
        field3661 = null;
        if (arg0 != 0) {
            field3663 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 35)
    public static final void method1541(int arg0, int arg1) {
        field3665++;
        class310.field5202.method1348(0, arg1);
        if (arg0 != 2000) {
            field3664 = -26;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 47)
    public static final void method1542(int arg0) {
        class87.field1555 = 0;
        class76.field1314 = 0;
        if (arg0 >= -17) {
            method1542(120);
        }
        class52.method451(-26980);
        field3669++;
        class315.method2177((byte) 94);
        class159.method1224((byte) 71);
        for (int var1 = 0; var1 < class76.field1314; var1++) {
            int var2 = class275.field4568[var1];
            if (class256.field4266 != class91.field1656[var2].field1509) {
                if (class91.field1656[var2].field796.method917(82)) {
                    class58.method483(false, class91.field1656[var2]);
                }
                class91.field1656[var2].field796 = null;
                class91.field1656[var2] = null;
            }
        }
        if (class202.field3201 != class95.field1715.field478) {
            throw new RuntimeException("gnp1 pos:" + class95.field1715.field478 + " psize:" + class202.field3201);
        }
        for (int var3 = 0; var3 < class177.field2923; var3++) {
            if (class91.field1656[class65.field1229[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class177.field2923);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILve;Z)V", line = 120)
    public static final void method1543(int arg0, int arg1, int arg2, class258 arg3, boolean arg4) {
        field3659++;
        if (class255.field4233 == arg3) {
            return;
        }
        if (!arg4) {
            method1540(-64);
        }
        if (class255.field4252 >= 400) {
            return;
        }
        class40 var10;
        if (arg3.field4292 == 0) {
            boolean var5 = true;
            if (class255.field4233.field4287 != -1 && arg3.field4287 != -1) {
                int var6 = arg3.field4320 >= class255.field4233.field4320 ? arg3.field4320 : class255.field4233.field4320;
                int var7 = class255.field4233.field4287 >= arg3.field4287 ? arg3.field4287 : class255.field4233.field4287;
                int var8 = (var6 * 10 / 100) + var7 + 5;
                int var9 = class255.field4233.field4320 - arg3.field4320;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            if (arg3.field4296 <= arg3.field4320) {
                var10 = class153.method1192(new class40[] { arg3.method1814(0), var5 ? class78.method580(arg3.field4320, class255.field4233.field4320, -26482) : class165.field2736, class6.field94, class60.field1153, class276.method1927((byte) -120, arg3.field4320), class298.field4985 }, (byte) -94);
            } else {
                var10 = class153.method1192(new class40[] { arg3.method1814(0), var5 ? class78.method580(arg3.field4320, class255.field4233.field4320, -26482) : class165.field2736, class6.field94, class60.field1153, class276.method1927((byte) -70, arg3.field4320), class150.field2520, class276.method1927((byte) -64, arg3.field4296 - arg3.field4320), class298.field4985 }, (byte) -43);
            }
        } else {
            var10 = class153.method1192(new class40[] { arg3.method1814(0), class6.field94, class57.field1097, class276.method1927((byte) -83, arg3.field4292), class298.field4985 }, (byte) 125);
        }
        if (class274.field4566 == 1) {
            class277.method1941(arg1, class153.method1192(new class40[] { class3.field27, class226.field3740, var10 }, (byte) -94), (short) 5, arg2, (long) arg0, 74, class12.field207);
            class296.field4946++;
        } else if (!class274.field4549) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class54.field1041[var11] != null) {
                    client.field4052++;
                    short var12 = 0;
                    if (class249.field4110 == 0 && class54.field1041[var11].method327(class189.field3062, -21581)) {
                        if (arg3.field4320 > class255.field4233.field4320) {
                            var12 = 2000;
                        }
                        if (class255.field4233.field4308 != 0 && arg3.field4308 != 0) {
                            if (class255.field4233.field4308 == arg3.field4308) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class288.field4836[var11]) {
                        var12 = 2000;
                    }
                    boolean var13 = false;
                    short var14 = class227.field3754[var11];
                    short var15 = (short) (var12 + var14);
                    class277.method1941(arg1, class153.method1192(new class40[] { class165.field2736, var10 }, (byte) -57), var15, arg2, (long) arg0, 89, class54.field1041[var11]);
                }
            }
        } else if ((class306.field5130 & 0x8) == 8) {
            class8.field120++;
            class277.method1941(arg1, class153.method1192(new class40[] { class300.field5012, class226.field3740, var10 }, (byte) 125), (short) 12, arg2, (long) arg0, 46, class277.field4638);
        }
        for (int var16 = 0; var16 < class255.field4252; var16++) {
            if (class288.field4832[var16] == 32) {
                class3.field37[var16] = class153.method1192(new class40[] { class165.field2736, var10 }, (byte) -10);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lce;III)[Lmb;", line = 246)
    public static final class99[] method1544(class239 arg0, int arg1, int arg2, int arg3) {
        field3660++;
        if (class272.method1881(arg0, arg2, arg1, 929)) {
            if (arg3 > -56) {
                method1542(-120);
            }
            return class5.method24(127);
        } else {
            return null;
        }
    }
}
