import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class244 {

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[S")
    public static short[] field3457 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3460 = -2;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Liq;")
    public static class362 field3462 = new class362("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "F")
    public static float field3456;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method1654(int arg0) {
        field3455++;
        class264.field3756 = new class302(class281.field3984.method2331(25, class271.field3836), "", class297.field4161, 1003, 0L, 0, 0);
        if (arg0 != 920) {
            method1657(-87, -76);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILdg;B)V")
    private final void method1655(int arg0, class236 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3454 = arg1.method1617((byte) 48);
            this.field3461 = arg1.method1574(-108);
            this.field3464 = arg1.method1574(-109);
        }
        int var4 = 95 % ((arg2 + 64) / 48);
        field3463++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1656(byte arg0) {
        field3462 = null;
        if (arg0 >= 109) {
            field3457 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
    public static final int method1657(int arg0, int arg1) {
        field3452++;
        if (class146.field1798 != null) {
            class146.field1798.method1343((byte) 59);
            class146.field1798 = null;
        }
        class210.field2991++;
        if (arg1 > ~class210.field2991) {
            class210.field2991 = 0;
            class72.field870 = 0;
            return arg0;
        }
        class72.field870 = 0;
        if (class99.field1207 == class419.field5989) {
            class99.field1207 = class250.field3569;
        } else {
            class99.field1207 = class419.field5989;
        }
        return -1;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static final void method1658(int arg0) {
        class186.method1277(class225.field3144, (byte) 89);
        field3453++;
        class122.field1498++;
        if (class254.field3664 && class191.field2751) {
            int var1 = class306.field4306.method17(20417);
            int var2 = class306.field4306.method18(1);
            int var3 = var2 - class261.field3723;
            int var4 = var1 - class3.field24;
            if (class225.field3144.field2649 < class122.field1498) {
                int var5 = var4 - class425.field6085;
                int var6 = var3 - class334.field4732;
                if (var5 > class225.field3144.field2582 || -class225.field3144.field2582 > var5 || class225.field3144.field2582 < var6 || -class225.field3144.field2582 > var6) {
                    class284.field3993 = true;
                }
            }
            if (class5.field71 > var4) {
                var4 = class5.field71;
            }
            if (var3 < class36.field424) {
                var3 = class36.field424;
            }
            if (class5.field71 + class276.field3921.field2618 < var4 - -class225.field3144.field2618) {
                var4 = class276.field3921.field2618 + class5.field71 - class225.field3144.field2618;
            }
            if (class36.field424 + class276.field3921.field2516 < class225.field3144.field2516 + var3) {
                var3 = class36.field424 + class276.field3921.field2516 - class225.field3144.field2516;
            }
            if (arg0 <= -63) {
                int var7 = var4 + class276.field3921.field2655 - class5.field71;
                int var8 = var3 + class276.field3921.field2648 - class36.field424;
                if (class225.field3144.field2565 != null && class284.field3993) {
                    class272 var9 = new class272();
                    var9.field3847 = var7;
                    var9.field3858 = var8;
                    var9.field3851 = class225.field3144;
                    var9.field3848 = class225.field3144.field2565;
                    class201.method1332(var9);
                }
                if (!class306.field4306.method793(88)) {
                    if (class284.field3993) {
                        if (class225.field3144.field2666 != null) {
                            class272 var10 = new class272();
                            var10.field3853 = class199.field2834;
                            var10.field3851 = class225.field3144;
                            var10.field3858 = var8;
                            var10.field3848 = class225.field3144.field2666;
                            var10.field3847 = var7;
                            class201.method1332(var10);
                        }
                        if (class199.field2834 != null && client.method1114(class225.field3144) != null) {
                            class114.method712((byte) -69, class199.field2834, class225.field3144);
                        }
                    } else if ((class392.field5516 == 1 || class129.method797(-2001)) && class208.field2958 > 2) {
                        class415.method2645(2, 76, class334.field4732 + class261.field3723, class425.field6085 + class3.field24);
                    } else if (class276.method1824(-105)) {
                        class415.method2645(0, 116, class334.field4732 + class261.field3723, class425.field6085 + class3.field24);
                    }
                    class225.field3144 = null;
                }
            }
        } else if (class122.field1498 > 1) {
            class225.field3144 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public static final void method1659(int arg0) {
        field3459++;
        if (arg0 > -26) {
            method1659(34);
        }
        class331.field4672.method1618(0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILdg;)V")
    public final void method1660(int arg0, class236 arg1) {
        field3458++;
        while (true) {
            int var3 = arg1.method1574(-46);
            if (var3 == 0) {
                if (arg0 == -27744) {
                    return;
                } else {
                    field3456 = -0.11174399F;
                    return;
                }
            }
            this.method1655(var3, arg1, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)V")
    public static final void method1661(byte arg0, int arg1, int arg2) {
        field3465++;
        int var3 = class371.field5232.method2264(class193.field2764.method2331(arg0 + 127, class271.field3836), 125);
        for (class302 var4 = (class302) class393.field5547.method506((byte) -128); var4 != null; var4 = (class302) class393.field5547.method514(true)) {
            int var8 = class345.method2210(var4, (byte) 72);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class208.field2958 * 16 + 21;
        int var6 = arg2 - var3 / 2;
        if (class330.field4671 < var6 + var3) {
            var6 = class330.field4671 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if ((var5 + arg1) > class105.field1259) {
            var7 = class105.field1259 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class8.field120 = var6;
        class302.field4246 = class208.field2958 * 16 + (class331.field4686 ? 26 : 22);
        class379.field5341 = var7;
        if (arg0 != -102) {
            field3460 = -43;
        }
        class435.field6270 = true;
        class113.field1393 = var3;
    }
}
