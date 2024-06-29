import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class319 {

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
    public static int[] field4697 = new int[50];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lic;")
    public static class329 field4693;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 5)
    public static void method2199(int arg0) {
        if (arg0 != 26683) {
            method2202(108, 74);
        }
        field4693 = null;
        field4697 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Ljava/lang/String;", line = 25)
    public static final String method2200(int arg0, byte arg1, int arg2) {
        field4692++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            if (arg1 != -109) {
                field4697 = (int[]) null;
            }
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 69)
    public static final void method2201(byte arg0) {
        field4700++;
        if (class38.field458 == null) {
            return;
        }
        if (class82.field1061 < 10) {
            if (!class38.field456.method1082(class38.field458.field4567, 2)) {
                class82.field1061 = class114.field1473.method1059(class38.field458.field4567, (byte) -11) / 10;
                return;
            }
            class194.method1404((byte) -23);
            class82.field1061 = 10;
        }
        if (class82.field1061 == 10) {
            class38.field462 = class38.field458.field4546 >> 6 << 6;
            class38.field467 = (class38.field458.field4561 >> 6 << 6) + 64 - class38.field462;
            class38.field461 = class38.field458.field4551 >> 6 << 6;
            int[] var1 = new int[3];
            class38.field459 = (class38.field458.field4566 >> 6 << 6) + 64 - class38.field461;
            int var2 = -1;
            int var3 = -1;
            if (class38.field458.method2154((class359.field5616.field4893 >> 7) + class355.field5556, -1, class56.field724, var1, (class359.field5616.field4855 >> 7) + class331.field4867)) {
                var3 = var1[1] - class38.field462;
                var2 = class38.field461 + class38.field459 - var1[2] - 1;
            }
            if (!class71.field941 && var3 >= 0 && class38.field467 > var3 && var2 >= 0 && class38.field459 > var2) {
                int var4 = var2 + ((int) (Math.random() * 10.0D) - 5);
                class35.field428 = var4;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class32.field393 = var5;
            } else if (class185.field2541 == -1 || class217.field3064 == -1) {
                class38.field458.method2156(var1, class38.field458.field4547 & 0x3FFF, (byte) 68, class38.field458.field4547 >> 14 & 0x3FFF);
                class35.field428 = class38.field461 - (var1[2] - (class38.field459 - 1));
                class32.field393 = var1[1] - class38.field462;
            } else {
                class38.field458.method2156(var1, class217.field3064, (byte) -84, class185.field2541);
                class217.field3064 = -1;
                class185.field2541 = -1;
                class71.field941 = false;
                if (var1 != null) {
                    class35.field428 = class38.field459 + class38.field461 - var1[2] - 1;
                    class32.field393 = var1[1] - class38.field462;
                }
            }
            if (class38.field458.field4565 == 37) {
                class38.field463 = 3.0F;
                class38.field465 = 3.0F;
            } else if (class38.field458.field4565 == 50) {
                class38.field463 = 4.0F;
                class38.field465 = 4.0F;
            } else if (class38.field458.field4565 == 75) {
                class38.field463 = 6.0F;
                class38.field465 = 6.0F;
            } else if (class38.field458.field4565 == 100) {
                class38.field463 = 8.0F;
                class38.field465 = 8.0F;
            } else if (class38.field458.field4565 == 200) {
                class38.field463 = 16.0F;
                class38.field465 = 16.0F;
            } else {
                class38.field463 = 8.0F;
                class38.field465 = 8.0F;
            }
            class144.method1122((byte) 15);
            int var6 = class38.field467 >> 6;
            class38.field482 = new int[class299.field4358 + 1];
            int var7 = class38.field459 >> 6;
            class38.field473 = new byte[var6][var7][];
            class38.field469 = new int[var6][var7][];
            class38.field474 = new byte[var6][var7][];
            class38.field477 = new byte[var6][var7][];
            class38.field480 = new int[var6][var7][];
            class38.field470 = new byte[var6][var7][];
            class38.field478 = new byte[var6][var7][];
            class287.field4140 = new class54();
            class271.field3887 = new class144();
            int var8 = class227.field3268 >> 1;
            int var9 = class30.field354 >> 2 << 10;
            class38.method273(var9, var8);
            class341.method2367(1024, 256, -87);
            class229.method1641(256, (byte) 104);
            class82.field1061 = 20;
        } else if (class82.field1061 == 20) {
            class311.method2164(arg0 ^ 0xFFFFE30E, new class299(class38.field456.method1075(108, "underlay", class38.field458.field4567)));
            class82.field1061 = 30;
            class328.method2268(0, true);
            class233.method1658((byte) 53);
        } else if (class82.field1061 == 30) {
            class38.method263(new class299(class38.field456.method1075(108, "overlay", class38.field458.field4567)));
            class82.field1061 = 40;
            class233.method1658((byte) 53);
        } else if (class82.field1061 == 40) {
            class38.method271(new class299(class38.field456.method1075(arg0 ^ 0xFFFFFF9D, "overlay2", class38.field458.field4567)));
            class82.field1061 = 50;
            class233.method1658((byte) 53);
        } else if (class82.field1061 == 50) {
            class38.method272(new class299(class38.field456.method1075(111, "loc", class38.field458.field4567)), class225.field3244);
            class82.field1061 = 60;
            class328.method2268(arg0 ^ 0xFFFFFFD9, true);
            class233.method1658((byte) 53);
        } else if (arg0 == -39) {
            if (class82.field1061 == 60) {
                if (class38.field456.method1061(class38.field458.field4567 + "_labels", arg0 ^ 0x27)) {
                    if (!class38.field456.method1082(class38.field458.field4567 + "_labels", 2)) {
                        return;
                    }
                    class38.field460 = class221.method1606(class38.field456, -2, class38.field458.field4567 + "_labels", class225.field3244);
                } else {
                    class38.field460 = new class10(0);
                }
                class38.method265();
                class82.field1061 = 70;
                class233.method1658((byte) 53);
            } else if (class82.field1061 == 70) {
                class125.field1672 = new class295(11, true, class26.field307);
                class82.field1061 = 73;
                class328.method2268(arg0 ^ 0xFFFFFFD9, true);
                class233.method1658((byte) 53);
            } else if (class82.field1061 == 73) {
                class282.field4021 = new class295(12, true, class26.field307);
                class82.field1061 = 76;
                class328.method2268(arg0 ^ 0xFFFFFFD9, true);
                class233.method1658((byte) 53);
            } else if (class82.field1061 == 76) {
                class288.field4163 = new class295(14, true, class26.field307);
                class82.field1061 = 79;
                class328.method2268(arg0 ^ 0xFFFFFFD9, true);
                class233.method1658((byte) 53);
            } else if (class82.field1061 == 79) {
                class195.field2694 = new class295(17, true, class26.field307);
                class82.field1061 = 82;
                class328.method2268(0, true);
                class233.method1658((byte) 53);
            } else if (class82.field1061 == 82) {
                class254.field3707 = new class295(19, true, class26.field307);
                class82.field1061 = 85;
                class328.method2268(arg0 + 39, true);
                class233.method1658((byte) 53);
            } else if (class82.field1061 == 85) {
                class196.field2703 = new class295(22, true, class26.field307);
                class82.field1061 = 88;
                class328.method2268(0, true);
                class233.method1658((byte) 53);
            } else if (class82.field1061 == 88) {
                class216.field3057 = new class295(26, true, class26.field307);
                class82.field1061 = 91;
                class328.method2268(0, true);
                class233.method1658((byte) 53);
            } else {
                class74.field976 = new class295(30, true, class26.field307);
                class82.field1061 = 100;
                class328.method2268(0, true);
                class233.method1658((byte) 53);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 317)
    public static final void method2202(int arg0, int arg1) {
        class240.field3488.method2264((byte) 79, arg0);
        if (arg1 != -128) {
            field4696 = 46;
        }
        field4694++;
        class293.field4260.method2264((byte) -91, arg0);
        class347.field5393.method2264((byte) -85, arg0);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 331)
    public static final void method2203(byte arg0) {
        field4698++;
        if (class232.field3333) {
            return;
        }
        if (arg0 < 114) {
            method2203((byte) 116);
        }
        if (class48.field638) {
            class247.field3601 = (float) ((int) class247.field3601 + 191 & 0xFFFFFF80);
        } else {
            class206.field2874 += (24.0F - class206.field2874) / 2.0F;
        }
        class232.field3333 = true;
        class311.field4573 = true;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 364)
    public static final void method2204(int arg0) {
        class130.field1775.method2262(false);
        if (arg0 == -11) {
            field4699++;
        }
    }
}
