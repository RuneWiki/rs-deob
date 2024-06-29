import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class203 extends class87 {

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2942 = "Loaded textures";

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "[I")
    public static int[] field2944 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field2940 = 0;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field2945 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "Lqd;")
    public static class37 field2943 = new class37(64);

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "Lac;")
    public class141 field2948;

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "[B")
    public byte[] field2950;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field2942 = null;
        field2943 = null;
        field2944 = null;
        field2945 = null;
        if (arg0 < 117) {
            field2940 = 101;
        }
    }

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)I")
    public final int method596(int arg0) {
        ++field2949;
        if (arg0 != -899) {
            method1315(-123);
        }
        return super.field1339 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "(I)V")
    public static final void method1316(int arg0) {
        ++field2941;
        class242.method1576(0, false);
        boolean var1 = true;
        class245.field3673 = 0;
        for (int var2 = 0; ~class255.field3870.length < ~var2; ++var2) {
            if (class75.field1170[var2] != -1 && class255.field3870[var2] == null) {
                class255.field3870[var2] = class136.field1971.method1538(class75.field1170[var2], 0, (byte) 94);
                if (class255.field3870[var2] == null) {
                    ++class245.field3673;
                    var1 = false;
                }
            }
            if (~class115.field1701[var2] != 0 && class263.field3961[var2] == null) {
                class263.field3961[var2] = class136.field1971.method1510(arg0 + -16500, 0, class25.field335[var2], class115.field1701[var2]);
                if (class263.field3961[var2] == null) {
                    ++class245.field3673;
                    var1 = false;
                }
            }
            if (class77.field1194 != null && class272.field4319[var2] == null && class77.field1194[var2] != -1) {
                class272.field4319[var2] = class136.field1971.method1510(-127, 0, class25.field335[var2], class77.field1194[var2]);
                if (class272.field4319[var2] == null) {
                    ++class245.field3673;
                    var1 = false;
                }
            }
        }
        if (class200.field2890 == null) {
            if (class24.field321 != null && class132.field1936.method1517(arg0 + -16285, class24.field321.field3381 + "_labels")) {
                if (class132.field1936.method1533(class24.field321.field3381 + "_labels", 0)) {
                    class200.field2890 = class226.method1474(class24.field321.field3381 + "_labels", class132.field1936, 0);
                } else {
                    ++class245.field3673;
                    var1 = false;
                }
            } else {
                class200.field2890 = new class78(0);
            }
        }
        if (!var1) {
            class35.field525 = 1;
        } else {
            class264.field3973 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~var4 > ~class255.field3870.length; ++var4) {
                byte[] var20 = class263.field3961[var4];
                if (var20 != null) {
                    int var21 = (class23.field303[var4] >> 8) * 64 + -class113.field1615;
                    int var22 = (class23.field303[var4] & 255) * 64 - class95.field1445;
                    if (class217.field3209) {
                        var22 = 10;
                        var21 = 10;
                    }
                    var3 &= class263.method1751(var21, var22, var20, -1792250120);
                }
            }
            if (!var3) {
                class35.field525 = 2;
            } else {
                if (~class35.field525 != -1) {
                    class69.method474(true, class86.field1333 + "<br>(100%)", true);
                }
                class270.method1804(10288);
                class25.method190((byte) 112);
                boolean var5 = false;
                class35.method249(4, 104, 104, 25, var5);
                for (int var6 = 0; var6 < 4; ++var6) {
                    class246.field3681[var6].method583(16777216);
                }
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    for (int var18 = 0; var18 < 104; ++var18) {
                        for (int var19 = 0; ~var19 > -105; ++var19) {
                            class189.field2684[var7][var18][var19] = 0;
                        }
                    }
                }
                class277.method1863(false, (byte) 19);
                class270.method1804(10288);
                System.gc();
                class242.method1576(arg0 ^ arg0, true);
                class206.method1325(false, 104);
                if (!class217.field3209) {
                    class282.method1901(arg0 + -16269, false);
                    class242.method1576(0, true);
                    class122.method833(false, -4);
                    if (class272.field4319 != null) {
                        class132.method905(0);
                    }
                }
                if (class217.field3209) {
                    class66.method451(false, 14021);
                    class242.method1576(0, true);
                    class138.method927(false, arg0 + -16364);
                }
                class25.method190((byte) 112);
                class242.method1576(0, true);
                class12.method105(-613927039, false, class246.field3681);
                class242.method1576(0, true);
                int var8 = class264.field3988;
                if (~class163.field2364 > ~var8) {
                    var8 = class163.field2364;
                }
                if (~(class163.field2364 + -1) < ~var8) {
                    int var9 = class163.field2364 + -1;
                }
                if (!class202.method1310(false)) {
                    class84.method565(class264.field3988);
                } else {
                    class84.method565(0);
                }
                class222.method1445(arg0 ^ 32391);
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        class107.method702(30926, var10, var17);
                    }
                }
                class209.method1340((byte) 0);
                class270.method1804(10288);
                class173.method1138((byte) 73);
                class25.method190((byte) 112);
                if (class282.field4503 != null && class10.field180 != null && ~class192.field2754 == -26) {
                    class95.field1451.method522(241, arg0 + 12355);
                    class95.field1451.method737(arg0 ^ -13729, 1057001181);
                    ++class147.field2102;
                }
                if (!class217.field3209) {
                    int var11 = (class156.field2280 + 6) / 8;
                    int var12 = (class200.field2893 + -6) / 8;
                    int var13 = (class156.field2280 + -6) / 8;
                    int var14 = (class200.field2893 + 6) / 8;
                    for (int var15 = var13 - 1; var11 + 1 >= var15; ++var15) {
                        for (int var16 = var12 + -1; var16 <= var14 + 1; ++var16) {
                            if (var15 < var13 || var11 < var15 || var16 < var12 || var16 > var14) {
                                class136.field1971.method1530((byte) -109, "m" + var15 + "_" + var16);
                                class136.field1971.method1530((byte) -93, "l" + var15 + "_" + var16);
                            }
                        }
                    }
                }
                if (~class192.field2754 != -29) {
                    class245.method1608((byte) 84, 30);
                    if (class10.field180 != null) {
                        class95.field1451.method522(53, 28727);
                    }
                } else {
                    class245.method1608((byte) 84, 10);
                }
                class43.method293((byte) 74);
                class270.method1804(10288);
                class32.method231((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)[B")
    public final byte[] method594(boolean arg0) {
        ++field2947;
        if (super.field1339) {
            throw new RuntimeException();
        } else {
            if (!arg0) {
                field2942 = null;
            }
            return this.field2950;
        }
    }
}
