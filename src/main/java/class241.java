import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class241 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lrc;")
    public static class9 field3966 = new class9(64);

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3968 = null;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3969 = new String[100];

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3971 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)Lgf;")
    public static final class222 method1589(int arg0, int arg1, byte arg2) {
        field3965++;
        if (arg2 < 80) {
            method1592(58);
        }
        class222 var3 = new class222();
        for (class39 var4 = (class39) client.field4546.method782(0); var4 != null; var4 = (class39) client.field4546.method788(true)) {
            if (var4.field586 && var4.method266(arg0, 0, arg1)) {
                var3.method1498(0, var4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method1590(byte arg0) {
        field3968 = null;
        field3966 = null;
        if (arg0 != -26) {
            method1593(true);
        }
        field3969 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method1591(int arg0) {
        field3963++;
        class78.method511(false, arg0 ^ 0x1F61);
        class165.field2708 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class61.field1059.length; var2++) {
            if (class166.field2714[var2] != -1 && class61.field1059[var2] == null) {
                class61.field1059[var2] = class198.field3197.method746(0, (byte) -128, class166.field2714[var2]);
                if (class61.field1059[var2] == null) {
                    var1 = false;
                    class165.field2708++;
                }
            }
            if (class163.field2697[var2] != -1 && class163.field2695[var2] == null) {
                class163.field2695[var2] = class198.field3197.method756(class163.field2697[var2], class175.field2877[var2], 0, 1);
                if (class163.field2695[var2] == null) {
                    class165.field2708++;
                    var1 = false;
                }
            }
            if (class37.field520 != null && class220.field3686[var2] == null && class37.field520[var2] != -1) {
                class220.field3686[var2] = class198.field3197.method756(class37.field520[var2], class175.field2877[var2], 0, 1);
                if (class220.field3686[var2] == null) {
                    class165.field2708++;
                    var1 = false;
                }
            }
        }
        if (class255.field4167 == null) {
            if (class110.field1988 == null || !class101.field1739.method741(-16808, class110.field1988.field595 + "_labels")) {
                class255.field4167 = new class195(0);
            } else if (class101.field1739.method736(class110.field1988.field595 + "_labels", (byte) 6)) {
                class255.field4167 = client.method1921(class110.field1988.field595 + "_labels", 0, class101.field1739);
            } else {
                var1 = false;
                class165.field2708++;
            }
        }
        if (!var1) {
            class122.field2148 = 1;
            return;
        }
        class33.field483 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class61.field1059.length; var4++) {
            byte[] var20 = class163.field2695[var4];
            if (var20 != null) {
                int var21 = (class276.field4405[var4] & 0xFF) * 64 - class255.field4162;
                int var22 = (class276.field4405[var4] >> 8) * 64 - class126.field2206;
                if (class216.field3649) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class69.method421(var20, 2, var21, var22);
            }
        }
        if (!var3) {
            class122.field2148 = 2;
            return;
        }
        if (class122.field2148 != arg0) {
            class229.method1539(arg0, true, class261.field4257 + "<br>(100%)");
        }
        class97.method614(32067);
        class225.method1512((byte) -49);
        boolean var5 = false;
        class111.method770(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class99.field1699[var6].method1232(-83);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class229.field3862[var7][var18][var19] = 0;
                }
            }
        }
        class186.method1223(6554, false);
        class97.method614(32067);
        System.gc();
        class78.method511(true, 8033);
        class152.method1045(false, (byte) 118);
        if (!class216.field3649) {
            class229.method1541(arg0 ^ 0xFFFFFFD6, false);
            class78.method511(true, 8033);
            class292.method1973((byte) -68, false);
            if (class220.field3686 != null) {
                class281.method1832(107);
            }
        }
        if (class216.field3649) {
            class261.method1734((byte) 103, false);
            class78.method511(true, 8033);
            class58.method363(false, (byte) 18);
        }
        class225.method1512((byte) -83);
        class78.method511(true, 8033);
        class50.method308(-13249, false, class99.field1699, class216.field3649 ? class290.field4634 : null);
        class78.method511(true, 8033);
        int var8 = class19.field304;
        if (var8 > class176.field2886) {
            var8 = class176.field2886;
        }
        if (class176.field2886 - 1 > var8) {
            int var9 = class176.field2886 - 1;
        }
        if (class96.method610(0)) {
            class170.method1148(0);
        } else {
            class170.method1148(class19.field304);
        }
        class189.method1234((byte) -125);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class6.method35(var10, var17, arg0 - 124);
            }
        }
        class184.method1211(arg0 ^ 0xFFFFA2E1);
        class97.method614(arg0 + 32067);
        class74.method451((byte) -92);
        class225.method1512((byte) -112);
        if (class270.field4349 != null && class194.field3131 != null && class59.field1026 == 25) {
            class168.field2778.method199(228, arg0 ^ 0x75);
            class168.field2778.method698(-27, 1057001181);
            class161.field2676++;
        }
        if (!class216.field3649) {
            int var11 = (class96.field1654 - 6) / 8;
            int var12 = (class59.field1031 - 6) / 8;
            int var13 = (class59.field1031 + 6) / 8;
            int var14 = (class96.field1654 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var14 + 1); var15++) {
                for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                    if (var11 > var15 || var15 > var14 || var16 < var12 || var13 < var16) {
                        class198.field3197.method745("m" + var15 + "_" + var16, (byte) 61);
                        class198.field3197.method745("l" + var15 + "_" + var16, (byte) 61);
                    }
                }
            }
        }
        if (class59.field1026 == 28) {
            class217.method1441(10, -31239);
        } else {
            class217.method1441(30, -31239);
            if (class194.field3131 != null) {
                class168.field2778.method199(248, arg0 + 122);
            }
        }
        class53.method334((byte) -128);
        class97.method614(32067);
        class2.method10((byte) 60);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static final void method1592(int arg0) {
        int var1 = -11 / ((39 - arg0) / 53);
        field3967++;
        field3966.method58(0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static final void method1593(boolean arg0) {
        if (class21.field334 == 2) {
            if (class295.field4696 == class199.field3266 && class240.field3940 == class147.field2497) {
                class21.field334 = 0;
                if (class119.field2117 && class12.field169[81] && class275.field4399 > 2) {
                    class19.method137(arg0, class275.field4399 - 2);
                } else {
                    class19.method137(false, class275.field4399 - 1);
                }
            }
        } else if (class199.field3266 == class115.field2069 && class160.field2668 == class147.field2497) {
            class21.field334 = 0;
            if (class119.field2117 && class12.field169[81] && class275.field4399 > 2) {
                class19.method137(false, class275.field4399 - 2);
            } else {
                class19.method137(false, class275.field4399 - 1);
            }
        } else {
            class240.field3940 = class160.field2668;
            class295.field4696 = class115.field2069;
            class21.field334 = 2;
        }
        field3962++;
        if (arg0) {
            field3964 = -110;
        }
    }
}
