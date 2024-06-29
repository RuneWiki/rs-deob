import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class280 extends class312 {

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "S")
    public static short field4320 = 320;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4321 = "white:";

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Leg;")
    public static class188 field4318 = new class188(50);

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4326 = "Examine";

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "Z")
    public static volatile boolean field4325 = false;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field4327 = 1;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "C")
    private char field4312;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4324;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Ljava/lang/String;")
    public String field4317;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "[[[B")
    public static byte[][][] field4323;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZIIIIZB)V", line = 12)
    public static final void method1846(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        field4313++;
        if (arg0) {
            class333.method2289();
        }
        if (class63.field919 != null && (arg2 != 3 || class226.field3605 != arg3 || class10.field99 != arg4)) {
            class95.method655(true, class89.field1359, class63.field919);
            class63.field919 = null;
        }
        if (arg2 == 3 && class63.field919 == null) {
            class63.field919 = class330.method2230(0, 0, class89.field1359, (byte) 112, arg4, arg3);
            if (class63.field919 != null) {
                class10.field99 = arg4;
                class226.field3605 = arg3;
                class268.method1777(-27637, class89.field1359);
            }
        }
        if (arg2 == 3 && class63.field919 == null) {
            method1846(true, arg1, class175.field2682, -1, -1, true, (byte) 27);
            return;
        }
        Container var7;
        if (class63.field919 != null) {
            var7 = class63.field919;
        } else if (class261.field4045 == null) {
            var7 = class89.field1359.field3569;
        } else {
            var7 = class261.field4045;
        }
        class312.field4943 = var7.getSize().width;
        class136.field2112 = var7.getSize().height;
        if (class261.field4045 == var7) {
            Insets var8 = class261.field4045.getInsets();
            class312.field4943 -= var8.right + var8.left;
            class136.field2112 -= var8.top + var8.bottom;
        }
        if (arg2 < 2) {
            class128.field1996 = 0;
            class174.field2644 = 503;
            class143.field2278 = (class312.field4943 - 765) / 2;
            class334.field5203 = 765;
        } else {
            class334.field5203 = class312.field4943;
            class143.field2278 = 0;
            class174.field2644 = class136.field2112;
            class128.field1996 = 0;
        }
        if (arg5) {
            class97.method673((byte) -64, class302.field4665);
            class199.method1340(0, class302.field4665);
            if (class283.field4349 != null) {
                class283.field4349.method1071(class302.field4665, (byte) -23);
            }
            class236.field3790.method860(0);
            class335.method2332(class302.field4665, (byte) -126);
            class222.method1495(class302.field4665, (byte) -118);
            if (class283.field4349 != null) {
                class283.field4349.method1072(0, class302.field4665);
            }
        } else {
            if (class333.field5166) {
                class333.method2317(class334.field5203, class174.field2644);
            }
            class302.field4665.setSize(class334.field5203, class174.field2644);
            if (class261.field4045 == var7) {
                Insets var9 = class261.field4045.getInsets();
                class302.field4665.setLocation(class143.field2278 + var9.left, class128.field1996 + var9.top);
            } else {
                class302.field4665.setLocation(class143.field2278, class128.field1996);
            }
        }
        if (arg2 == 0 && arg1 > 0) {
            class333.method2303(class302.field4665);
        }
        if (arg0 && arg2 > 0) {
            class302.field4665.setIgnoreRepaint(true);
            if (!class14.field150) {
                class154.method1075();
                class42.field594 = null;
                class42.field594 = class192.method1312(class302.field4665, class174.field2644, 1, class334.field5203);
                class57.method391();
                if (class304.field4758 == 5) {
                    class163.method1118(true, class286.field4380, arg6 ^ 0x39);
                } else {
                    class204.method1369(false, true, class200.field3016);
                }
                try {
                    Graphics var10 = class302.field4665.getGraphics();
                    class42.field594.method29(0, var10, 0, 30365);
                } catch (Exception var14) {
                }
                class95.method649(arg6 - 14254);
                if (arg1 == 0) {
                    class42.field594 = class192.method1312(class302.field4665, 503, arg6 - 26, 765);
                } else {
                    class42.field594 = null;
                }
                class252 var12 = class89.field1359.method1507((byte) -13, class236.field3790.getClass());
                while (var12.field3931 == 0) {
                    class96.method657(100L, (byte) -115);
                }
                if (var12.field3931 == 1) {
                    class14.field150 = true;
                }
            }
            if (class14.field150) {
                class333.method2293(class302.field4665, class10.field95 * 2);
            }
        }
        if (!class333.field5166 && arg2 > 0) {
            method1846(true, arg1, 0, -1, -1, true, (byte) 27);
            return;
        }
        if (arg2 > 0 && arg1 == 0) {
            class92.field1427.setPriority(5);
            class42.field594 = null;
            class141.method959();
            ((class97) class12.field126).method667(200, arg6 - 28908);
            if (class192.field2903) {
                class12.method89(0.7F);
            }
            if (class14.field144 == null) {
                class14.field144 = new class117[13][13];
            }
            class147.method1031(4, 104, 104);
            class11.method72(104, 104);
            class315.method2150((byte) 64);
        } else if (arg2 == 0 && arg1 > 0) {
            class92.field1427.setPriority(1);
            class42.field594 = class192.method1312(class302.field4665, 503, arg6 ^ 0x1A, 765);
            class141.method986();
            class243.method1653();
            ((class97) class12.field126).method667(20, -28881);
            if (class192.field2903) {
                if (class88.field1322 == 1) {
                    class12.method89(0.9F);
                }
                if (class88.field1322 == 2) {
                    class12.method89(0.8F);
                }
                if (class88.field1322 == 3) {
                    class12.method89(0.7F);
                }
                if (class88.field1322 == 4) {
                    class12.method89(0.6F);
                }
            }
            class217.method1447();
            class315.method2150((byte) 126);
        }
        class150.field2363 = !class148.method1042((byte) 54);
        if (arg6 != 27) {
            return;
        }
        if (arg0) {
            class332.method2277((byte) -127);
        }
        if (arg2 >= 2) {
            class233.field3735 = true;
        } else {
            class233.field3735 = false;
        }
        if (class253.field3936 != -1) {
            class221.method1479(true, 12918);
        }
        if (class308.field4851 != null && (class304.field4758 == 30 || class304.field4758 == 25)) {
            class95.method646(0);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class2.field12[var13] = true;
        }
        class245.field3840 = true;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILgn;)V", line = 264)
    public final void method1847(int arg0, class303 arg1) {
        while (true) {
            int var3 = arg1.method2043((byte) -113);
            if (var3 == 0) {
                if (arg0 != -22918) {
                    field4325 = false;
                }
                field4319++;
                return;
            }
            this.method1848(var3, -103, arg1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILgn;)V", line = 282)
    private final void method1848(int arg0, int arg1, class303 arg2) {
        if (arg1 >= -85) {
            this.method1851(-70);
        }
        field4314++;
        if (arg0 == 1) {
            this.field4312 = class152.method1064(0, arg2.method2001(-3));
        } else if (arg0 == 2) {
            this.field4315 = arg2.method1996(-48);
        } else if (arg0 == 5) {
            this.field4317 = arg2.method2027(0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V", line = 308)
    public static void method1849(byte arg0) {
        field4326 = null;
        if (arg0 != 13) {
            method1846(false, 47, -121, -95, -91, true, (byte) 1);
        }
        field4324 = null;
        field4318 = null;
        field4321 = null;
        field4323 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIB)V", line = 323)
    public static final void method1850(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4316++;
        if (arg1 == arg3) {
            class129.method877(arg3, 107, arg4, arg2, arg0);
            return;
        }
        if (class256.field3995 <= arg0 - arg3 && class118.field1834 >= (arg0 + arg3) && class323.field5030 <= (arg2 - arg1) && (arg1 + arg2) <= class88.field1324) {
            class308.method2119(arg4, (byte) -19, arg2, arg0, arg1, arg3);
        } else {
            class46.method319(arg2, arg1, (byte) 50, arg3, arg0, arg4);
        }
        if (arg5 < 103) {
            method1846(true, 113, 108, -82, -26, true, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)Z", line = 351)
    public final boolean method1851(int arg0) {
        if (arg0 != 115) {
            this.method1848(-97, -61, (class303) null);
        }
        field4322++;
        return this.field4312 == 's';
    }
}
