import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class302 extends class134 {

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "[I")
    public int[] field4922 = new int[] { -1 };

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "[I")
    public int[] field4927 = new int[1];

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Z")
    public static boolean field4918 = false;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4919 = " has logged out.";

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Li;")
    public static class74 field4921;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V")
    public static final void method2058(int arg0) {
        field4925++;
        boolean var1 = true;
        class287.method2002(false, (byte) 76);
        class141.field2339 = 0;
        for (int var2 = 0; var2 < class111.field1832.length; var2++) {
            if (class176.field2845[var2] != -1 && class111.field1832[var2] == null) {
                class111.field1832[var2] = class270.field4488.method1149(class176.field2845[var2], (byte) 40, 0);
                if (class111.field1832[var2] == null) {
                    var1 = false;
                    class141.field2339++;
                }
            }
            if (class111.field1829[var2] != -1 && class258.field4345[var2] == null) {
                class258.field4345[var2] = class270.field4488.method1126((byte) -73, 0, class111.field1829[var2], class216.field3656[var2]);
                if (class258.field4345[var2] == null) {
                    var1 = false;
                    class141.field2339++;
                }
            }
            if (class105.field1735 != null && class136.field2244[var2] == null && class105.field1735[var2] != -1) {
                class136.field2244[var2] = class270.field4488.method1126((byte) -73, 0, class105.field1735[var2], class216.field3656[var2]);
                if (class136.field2244[var2] == null) {
                    var1 = false;
                    class141.field2339++;
                }
            }
        }
        if (class196.field3165 == null) {
            if (class90.field1487 == null || !class13.field285.method1134((byte) 120, class90.field1487.field3308 + "_labels")) {
                class196.field3165 = new class238(0);
            } else if (class13.field285.method1154(class90.field1487.field3308 + "_labels", -29993)) {
                class196.field3165 = class171.method1277(class90.field1487.field3308 + "_labels", class13.field285, class85.field1418, true);
            } else {
                var1 = false;
                class141.field2339++;
            }
        }
        if (!var1) {
            class67.field1126 = 1;
            return;
        }
        class292.field4790 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class111.field1832.length; var4++) {
            byte[] var20 = class258.field4345[var4];
            if (var20 != null) {
                int var21 = (class184.field2947[var4] >> 8) * 64 - class26.field462;
                int var22 = (class184.field2947[var4] & 0xFF) * 64 - class78.field1313;
                if (class222.field3722) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class184.method1334(var21, var22, arg0 ^ 0xFFFFC3C4, var20);
            }
        }
        if (!var3) {
            class67.field1126 = 2;
            return;
        }
        if (~class67.field1126 != arg0) {
            class44.method260(true, class5.field127 + "<br>(100%)", (byte) 78);
        }
        class159.method1187(-659813974);
        class312.method2112(0);
        boolean var5 = false;
        class122.method916(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class225.field3790[var6].method2091((byte) 88);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class67.field1132[var7][var18][var19] = 0;
                }
            }
        }
        class209.method1467(97, false);
        class159.method1187(-659813974);
        System.gc();
        class287.method2002(true, (byte) -74);
        class299.method2049(104, false);
        if (!class222.field3722) {
            class73.method515(-18757, false);
            class287.method2002(true, (byte) 94);
            class251.method1829(false, 104);
            if (class136.field2244 != null) {
                class94.method673(104);
            }
        }
        if (class222.field3722) {
            class23.method151(false, 26713);
            class287.method2002(true, (byte) 123);
            class217.method1548(false, (byte) 109);
        }
        class312.method2112(0);
        class287.method2002(true, (byte) -63);
        class251.method1827(class222.field3722 ? class173.field2778 : null, false, class225.field3790, 114);
        class287.method2002(true, (byte) 78);
        int var8 = class113.field1933;
        if (var8 > class182.field2898) {
            var8 = class182.field2898;
        }
        if ((class182.field2898 - 1) > var8) {
            int var9 = class182.field2898 - 1;
        }
        if (class136.method1011(false)) {
            class240.method1721(0);
        } else {
            class240.method1721(class113.field1933);
        }
        class244.method1745(arg0 ^ 0x3C);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class89.method620(var17, false, var10);
            }
        }
        class264.method1869(0);
        class159.method1187(arg0 ^ 0x2753F655);
        class209.method1465((byte) -104);
        class312.method2112(0);
        if (class64.field1086 != null && class159.field2609 != null && class26.field458 == 25) {
            class236.field3980.method640((byte) 97, 193);
            class236.field3980.method1811(1057001181, (byte) 51);
            class146.field2417++;
        }
        if (!class222.field3722) {
            int var11 = (class263.field4395 - 6) / 8;
            int var12 = (class263.field4395 + 6) / 8;
            int var13 = (class260.field4363 - 6) / 8;
            int var14 = (class260.field4363 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var12 < var15 || var13 > var16 || var16 > var14) {
                        class270.field4488.method1141("m" + var15 + "_" + var16, 123);
                        class270.field4488.method1141("l" + var15 + "_" + var16, 124);
                    }
                }
            }
        }
        if (class26.field458 == 28) {
            class240.method1719(10, arg0 ^ 0xFFFF865F);
        } else {
            class240.method1719(30, arg0 ^ 0xFFFF865F);
            if (class159.field2609 != null) {
                class236.field3980.method640((byte) 97, 130);
            }
        }
        class6.method43(-67);
        class159.method1187(-659813974);
        class146.method1083(-16011);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method2059(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field4924++;
        if (arg3 == 3) {
            method2059(arg0, -1, -1, class297.field4862, true, arg5, true);
            return;
        }
        Container var7;
        if (class218.field3682 != null) {
            var7 = class218.field3682;
        } else if (class64.field1086 == null) {
            var7 = class142.field2344.field1380;
        } else {
            var7 = class64.field1086;
        }
        class61.field1051 = var7.getSize().width;
        class145.field2390 = var7.getSize().height;
        if (class64.field1086 == var7) {
            Insets var8 = class64.field1086.getInsets();
            class145.field2390 -= var8.top + var8.bottom;
            class61.field1051 -= var8.right + var8.left;
        }
        if (arg3 >= 2) {
            class182.field2901 = class145.field2390;
            class171.field2775 = 0;
            class49.field838 = 0;
            class155.field2567 = class61.field1051;
        } else {
            class49.field838 = (class61.field1051 - 765) / 2;
            class171.field2775 = 0;
            class155.field2567 = 765;
            class182.field2901 = 503;
        }
        if (arg4) {
            class55.method347(false, class5.field125);
            class87.method610(0, class5.field125);
            if (class5.field128 != null) {
                class5.field128.method1542(class5.field125, (byte) 31);
            }
            class45.field702.method272(23017);
            class25.method162(-88, class5.field125);
            class80.method558(class5.field125, (byte) -58);
            if (class5.field128 != null) {
                class5.field128.method1545(class5.field125, arg5 - 875);
            }
        } else {
            class5.field125.setSize(class155.field2567, class182.field2901);
            if (class64.field1086 == var7) {
                Insets var9 = class64.field1086.getInsets();
                class5.field125.setLocation(class49.field838 + var9.left, class171.field2775 + var9.top);
            } else {
                class5.field125.setLocation(class49.field838, class171.field2775);
            }
        }
        if (arg3 > 0) {
            method2059(arg0, -1, -1, 0, true, arg5, true);
            return;
        }
        if (arg5 != 765) {
            field4919 = null;
        }
        class224.field3777 = !class136.method1011(false);
        class139.method1028(class155.field2567, class182.field2901);
        if (class243.field4082 != -1) {
            class215.method1536(28942, true);
        }
        if (class159.field2609 != null && (class26.field458 == 30 || class26.field458 == 25)) {
            class228.method1611((byte) 102);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class143.field2351[var10] = true;
        }
        class101.field1603 = true;
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)V")
    public static void method2060(int arg0) {
        field4919 = null;
        field4921 = null;
        if (arg0 < 125) {
            method2058(14);
        }
    }
}
