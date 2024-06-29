import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class87 extends class90 {

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Z")
    public boolean field1892 = false;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "[Lrf;")
    public static class163[] field1891 = new class163[200];

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "[I")
    public static int[] field1894 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Lrf;")
    private static class163 field1893 = class53.method392(41, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "[I")
    public static int[] field1900 = new int[500];

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lrf;")
    private static class163 field1901 = class53.method392(51, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Z")
    public static boolean field1896 = false;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "Lrf;")
    public static class163 field1898 = field1901;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Lrf;")
    public static class163 field1897 = field1893;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Lrf;")
    public static class163 field1902 = class53.method392(120, "null");

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public int field1890;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLh;)V")
    public static final void method610(byte arg0, class69 arg1) {
        field1899++;
        if (class96.field2041) {
            class37.method232(127, arg1);
            return;
        }
        if (class68.field1424 == 1 && class193.field3796 >= 715 && class16.field283 >= 453) {
            class163.field3327 = !class163.field3327;
            if (class163.field3327) {
                class48.method297((byte) 69);
            } else {
                class77.method535((byte) 71, 255, class177.field3577, false, class134.field2777, class202.field3986);
            }
        }
        if (class16.field277 == 5) {
            return;
        }
        class93.field2012++;
        if (class16.field277 != 10) {
            return;
        }
        int var2 = 108 % ((29 - arg0) / 63);
        if (class20.field343 != 2 && class133.field2763 == 0) {
            if (class68.field1424 == 1) {
                byte var3 = 5;
                short var4 = 463;
                byte var5 = 100;
                byte var6 = 35;
                if (var3 <= class193.field3796 && class193.field3796 <= var3 + var5 && var4 <= class16.field283 && var4 + var6 >= class16.field283) {
                    client.method194((byte) 85);
                    return;
                }
            }
            if (class205.field4013 != null) {
                client.method194((byte) 110);
            }
        }
        int var7 = class68.field1424;
        int var8 = class16.field283;
        int var9 = class193.field3796;
        if (class34.field661 == 0) {
            short var10 = 302;
            short var11 = 291;
            if (var7 == 1 && var10 - 75 <= var9 && var10 + 75 >= var9 && var11 - 20 <= var8 && var11 + 20 >= var8) {
                class34.field661 = 3;
                class122.field2574 = 0;
            }
            short var12 = 462;
            boolean var13 = false;
            if (class36.field700 != 0) {
                while (class172.method1155(66)) {
                    if (class39.field810 == 84) {
                        var13 = true;
                        break;
                    }
                }
            }
            if (var13 || var7 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var11 - 20 <= var8 && var11 + 20 >= var8) {
                class202.field3995 = class195.field3877;
                class202.field3994 = class195.field3869;
                class122.field2574 = 0;
                class34.field661 = 2;
                class202.field3985 = class181.field3636;
            }
        } else if (class34.field661 == 2) {
            short var16 = 231;
            int var22 = var16 + 30;
            if (var7 == 1 && var8 >= var22 - 15 && var22 > var8) {
                class122.field2574 = 0;
            }
            var22 += 15;
            short var17 = 321;
            if (var7 == 1 && var22 - 15 <= var8 && var8 < var22) {
                class122.field2574 = 1;
            }
            var22 += 15;
            short var18 = 302;
            if (var7 == 1 && var18 - 75 <= var9 && var18 + 75 >= var9 && var8 >= var17 - 20 && var8 <= var17 + 20) {
                class202.field3989 = class202.field3989.method1044(-1).method1031(false);
                if (class202.field3989.method1029(122) == 0) {
                    class16.method106(class11.field223, class195.field3861, (byte) 119, class195.field3831);
                    return;
                }
                if (class202.field3990.method1029(117) == 0) {
                    class16.method106(class56.field1131, class195.field3837, (byte) 123, class195.field3828);
                    return;
                }
                class16.method106(class201.field3972, class195.field3866, (byte) 115, class195.field3854);
                class84.method589(20, -26);
                return;
            }
            short var19 = 462;
            if (var7 == 1 && var9 >= var19 - 75 && var19 + 75 >= var9 && var8 >= var17 - 20 && var8 <= var17 + 20) {
                class34.field661 = 0;
                class202.field3990 = class202.field3986;
                class202.field3989 = class202.field3986;
            }
            while (true) {
                while (class172.method1155(117)) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < class179.field3591.method1029(117); var21++) {
                        if (class57.field1160 == class179.field3591.method1032(var21, (byte) -25)) {
                            var20 = true;
                            break;
                        }
                    }
                    if (class122.field2574 == 0) {
                        if (class39.field810 == 85 && class202.field3989.method1029(124) > 0) {
                            class202.field3989 = class202.field3989.method1036(class202.field3989.method1029(127) - 1, (byte) 118, 0);
                        }
                        if (class39.field810 == 84 || class39.field810 == 80) {
                            class122.field2574 = 1;
                        }
                        if (var20 && class202.field3989.method1029(113) < 12) {
                            class202.field3989 = class202.field3989.method1047(class57.field1160, (byte) -115);
                        }
                    } else if (class122.field2574 == 1) {
                        if (class39.field810 == 85 && class202.field3990.method1029(120) > 0) {
                            class202.field3990 = class202.field3990.method1036(class202.field3990.method1029(125) - 1, (byte) 94, 0);
                        }
                        if (class39.field810 == 84 || class39.field810 == 80) {
                            class122.field2574 = 0;
                        }
                        if (class36.field700 != 0 && class39.field810 == 84) {
                            class202.field3989 = class202.field3989.method1044(-1).method1031(false);
                            if (class202.field3989.method1029(124) == 0) {
                                class16.method106(class11.field223, class195.field3861, (byte) 120, class195.field3831);
                                return;
                            }
                            if (class202.field3990.method1029(116) == 0) {
                                class16.method106(class56.field1131, class195.field3837, (byte) 115, class195.field3828);
                                return;
                            }
                            class16.method106(class201.field3972, class195.field3866, (byte) 118, class195.field3854);
                            class84.method589(20, -26);
                            return;
                        }
                        if (var20 && class202.field3990.method1029(118) < 20) {
                            class202.field3990 = class202.field3990.method1047(class57.field1160, (byte) -121);
                        }
                    }
                }
                return;
            }
        } else if (class34.field661 == 3) {
            short var14 = 321;
            short var15 = 382;
            if (var7 == 1 && var15 - 75 <= var9 && var15 + 75 >= var9 && var8 >= var14 - 20 && var14 + 20 >= var8) {
                class34.field661 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method611(boolean arg0) {
        field1894 = null;
        field1902 = null;
        field1893 = null;
        field1897 = null;
        field1901 = null;
        field1898 = null;
        if (!arg0) {
            field1891 = null;
            field1900 = null;
        }
    }
}
