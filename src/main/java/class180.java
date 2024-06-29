import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class180 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2621 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[Z")
    public static boolean[] field2622 = new boolean[200];

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Z")
    public static boolean field2623 = false;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lki;")
    public static class158 field2620;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZ)V")
    private static final void method1183(byte arg0, boolean arg1) {
        int var2 = class165.field2429.length;
        if (arg0 < 12) {
            return;
        }
        field2625++;
        byte[][] var3 = class259.field3974;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class18.field323[var4] >> 8) * 64 - class90.field1367;
                int var7 = (class18.field323[var4] & 0xFF) * 64 - class188.field2774;
                class195.method1316(-127);
                class275.method1837(var6, var7, arg1, 22837, var5, class243.field3763);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method1184(boolean arg0) {
        field2622 = null;
        if (arg0) {
            method1184(true);
        }
        field2620 = null;
        field2621 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1185(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2624++;
        if (arg5 != -69) {
            field2623 = false;
        }
        int var8 = class251.method1710(arg2, (byte) 27, class175.field2557, class91.field1381);
        int var9 = class251.method1710(arg4, (byte) 27, class175.field2557, class91.field1381);
        int var10 = class251.method1710(arg1, (byte) 27, class196.field2961, class84.field1287);
        int var11 = class251.method1710(arg6, (byte) 27, class196.field2961, class84.field1287);
        int var12 = class251.method1710(arg2 + arg7, (byte) 27, class175.field2557, class91.field1381);
        int var13 = class251.method1710(arg4 - arg7, (byte) 27, class175.field2557, class91.field1381);
        for (int var14 = var8; var14 < var12; var14++) {
            class222.method1519((byte) -109, var10, class241.field3751[var14], var11, arg0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class222.method1519((byte) -111, var10, class241.field3751[var15], var11, arg0);
        }
        int var16 = class251.method1710(arg1 + arg7, (byte) 27, class196.field2961, class84.field1287);
        int var17 = class251.method1710(arg6 - arg7, (byte) 27, class196.field2961, class84.field1287);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class241.field3751[var18];
            class222.method1519((byte) -112, var10, var19, var16, arg0);
            class222.method1519((byte) -123, var16, var19, var17, arg3);
            class222.method1519((byte) -123, var17, var19, var11, arg0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static final void method1186(byte arg0) {
        class142.method969(false, (byte) 107);
        boolean var1 = true;
        field2619++;
        class17.field310 = 0;
        for (int var2 = 0; var2 < class165.field2429.length; var2++) {
            if (class51.field841[var2] != -1 && class165.field2429[var2] == null) {
                class165.field2429[var2] = class210.field3143.method1605(-128, 0, class51.field841[var2]);
                if (class165.field2429[var2] == null) {
                    var1 = false;
                    class17.field310++;
                }
            }
            if (class283.field4334[var2] != -1 && class259.field3974[var2] == null) {
                class259.field3974[var2] = class210.field3143.method1625(0, class32.field581[var2], (byte) -126, class283.field4334[var2]);
                if (class259.field3974[var2] == null) {
                    var1 = false;
                    class17.field310++;
                }
            }
            if (class220.field3417 != null && class168.field2480[var2] == null && class220.field3417[var2] != -1) {
                class168.field2480[var2] = class210.field3143.method1625(0, class32.field581[var2], (byte) -114, class220.field3417[var2]);
                if (class168.field2480[var2] == null) {
                    var1 = false;
                    class17.field310++;
                }
            }
        }
        if (class21.field358 == null) {
            if (class66.field1092 == null || !class34.field603.method1622(class66.field1092.field4342 + "_labels", -1)) {
                class21.field358 = new class240(0);
            } else if (class34.field603.method1611(-1, class66.field1092.field4342 + "_labels")) {
                class21.field358 = class27.method194(2, class34.field603, class66.field1092.field4342 + "_labels");
            } else {
                class17.field310++;
                var1 = false;
            }
        }
        if (!var1) {
            class109.field1606 = 1;
            return;
        }
        class259.field3968 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class165.field2429.length; var4++) {
            byte[] var20 = class259.field3974[var4];
            if (var20 != null) {
                int var21 = (class18.field323[var4] & 0xFF) * 64 - class188.field2774;
                int var22 = (class18.field323[var4] >> 8) * 64 - class90.field1367;
                if (class176.field2578) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class102.method742(var20, arg0 + 19102, var22, var21);
            }
        }
        if (!var3) {
            class109.field1606 = 2;
            return;
        }
        if (class109.field1606 != 0) {
            class226.method1550(true, false, class295.field4491 + "<br>(100%)");
        }
        boolean var5 = false;
        class195.method1316(-86);
        class216.method1455((byte) 43);
        class102.method745(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class243.field3763[var6].method615(2097152);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class247.field3844[var7][var18][var19] = 0;
                }
            }
        }
        if (arg0 != -73) {
            method1186((byte) -32);
        }
        class207.method1366(false, true);
        class195.method1316(-43);
        System.gc();
        class142.method969(true, (byte) 107);
        class247.method1694(false, 100);
        if (!class176.field2578) {
            class166.method1128(false, arg0 - 15559);
            class142.method969(true, (byte) 107);
            method1183((byte) 84, false);
            if (class168.field2480 != null) {
                class150.method1014((byte) -83);
            }
        }
        if (class176.field2578) {
            class281.method1869((byte) 40, false);
            class142.method969(true, (byte) 107);
            class71.method556(false, arg0 - 10428);
        }
        class216.method1455((byte) 48);
        class142.method969(true, (byte) 107);
        class18.method127(class243.field3763, false, class176.field2578 ? class195.field2952 : null, false);
        class142.method969(true, (byte) 107);
        int var8 = class133.field1953;
        if (class260.field3986 < var8) {
            var8 = class260.field3986;
        }
        if ((class260.field3986 - 1) > var8) {
            int var9 = class260.field3986 - 1;
        }
        if (class101.method741(-6425)) {
            class169.method1137(0);
        } else {
            class169.method1137(class133.field1953);
        }
        class113.method817(-24416);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class213.method1440(var17, var10, -91);
            }
        }
        class267.method1809(29835);
        class195.method1316(-109);
        class258.method1740(0);
        class216.method1455((byte) 35);
        if (class167.field2459 != null && class22.field369 != null && class42.field742 == 25) {
            class59.field964.method1540(199, (byte) -2);
            class207.field3095++;
            class59.field964.method453((byte) 95, 1057001181);
        }
        if (!class176.field2578) {
            int var11 = (class121.field1806 - 6) / 8;
            int var12 = (class121.field1806 + 6) / 8;
            int var13 = (class16.field297 + 6) / 8;
            int var14 = (class16.field297 - 6) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var14 - 1; var16 <= var13 + 1; var16++) {
                    if (var15 < var11 || var15 > var12 || var14 > var16 || var13 < var16) {
                        class210.field3143.method1612("m" + var15 + "_" + var16, 91);
                        class210.field3143.method1612("l" + var15 + "_" + var16, -21);
                    }
                }
            }
        }
        if (class42.field742 == 28) {
            class88.method668(true, 10);
        } else {
            class88.method668(true, 30);
            if (class22.field369 != null) {
                class59.field964.method1540(72, (byte) -2);
            }
        }
        class123.method868(24059);
        class195.method1316(arg0 - 2);
        class231.method1573(-106);
    }
}
