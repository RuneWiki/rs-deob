import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class116 extends class29 {

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "Ljava/lang/String;")
    private String field1740 = "null";

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "[I")
    public static int[] field1744 = new int[25];

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field1749 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "C")
    public char field1738;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "C")
    public char field1752;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    private int field1742;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "Lol;")
    public class246 field1739;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "Lol;")
    private class246 field1748;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "[[[Lqg;")
    public static class256[][][] field1745;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V", line = 7)
    private final void method803(byte arg0) {
        if (arg0 >= -59) {
            this.field1742 = -22;
        }
        this.field1748 = new class246(this.field1739.method1748((byte) 22));
        for (class98 var2 = (class98) this.field1739.method1746((byte) -33); var2 != null; var2 = (class98) this.field1739.method1749((byte) -124)) {
            class219 var3 = new class219(var2.field1490, (int) var2.field916);
            this.field1748.method1750(var3, (byte) 125, class189.method1335(1082969068, var2.field1490));
        }
        field1750++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIIII)V", line = 33)
    public static final void method804(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1746++;
        class179 var5 = class319.method2220(arg1, (byte) -114, 4);
        if (arg0) {
            method813((byte) 52);
        }
        var5.method1242((byte) -100);
        var5.field2897 = arg2;
        var5.field2888 = arg4;
        var5.field2889 = arg3;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZIIII)V", line = 51)
    public static final void method805(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1741++;
        if (class204.method1498((byte) -95, arg4)) {
            class20.method130(8, arg3, arg2, class21.field309[arg4], arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Z", line = 66)
    public final boolean method806(int arg0, byte arg1) {
        field1751++;
        if (this.field1739 == null) {
            return false;
        } else if (arg1 == -2) {
            if (this.field1748 == null) {
                this.method809((byte) -58);
            }
            class310 var3 = (class310) this.field1748.method1743((long) arg0, (byte) -75);
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLlf;IIIII)Llf;", line = 91)
    public static final class134 method807(byte arg0, class134 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1757++;
        long var7 = (long) arg3;
        class134 var9 = (class134) class22.field329.method1619(var7, 81);
        if (var9 == null) {
            class259 var10 = class259.method1835(class182.field2946, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1855(64, 768, -50, -10, -50);
            class22.field329.method1621(var7, 100, var9);
        }
        int var11 = arg1.method525();
        int var12 = arg1.method535();
        int var13 = arg1.method513();
        int var14 = arg1.method505();
        class134 var15 = var9.method507(true, true, true);
        if (arg4 != 0) {
            var15.method530(arg4);
        }
        if (class186.field2991) {
            class75 var18 = (class75) var15;
            if (class227.method1653(arg2 + var11, arg5 + var13, -12282, class148.field2209) != arg6 || class227.method1653(arg2 + var12, arg5 + var14, -12282, class148.field2209) != arg6) {
                for (int var19 = 0; var19 < var18.field1021; var19++) {
                    var18.field1010[var19] += class227.method1653(var18.field1006[var19] + arg2, var18.field1024[var19] + arg5, arg0 - 12260, class148.field2209) - arg6;
                }
                var18.field1011.field1236 = false;
                var18.field1041.field4391 = false;
            }
        } else {
            class76 var16 = (class76) var15;
            if (arg6 != class227.method1653(arg2 + var11, arg5 - -var13, -12282, class148.field2209) || arg6 != class227.method1653(arg2 + var12, arg5 - -var14, arg0 - 12260, class148.field2209)) {
                for (int var17 = 0; var17 < var16.field1074; var17++) {
                    var16.field1109[var17] += class227.method1653(var16.field1078[var17] + arg2, var16.field1095[var17] + arg5, arg0 - 12260, class148.field2209) - arg6;
                }
                var16.field1086 = false;
            }
        }
        return arg0 == -22 ? var15 : (class134) null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V", line = 176)
    public static final void method808(boolean arg0, int arg1) {
        class209.field3423 = null;
        field1755++;
        if (arg0 && class124.field1855 != null) {
            class247.field3933 = class124.field1855.field4927;
        } else {
            class247.field3933 = -1;
        }
        class254.field4030 = (int[][][]) null;
        class34.field456 = (int[][][]) null;
        class119.field1829 = null;
        class145.field2163 = (byte[][][]) null;
        class325.field5074 = (byte[][][]) null;
        if (arg1 != 4) {
            return;
        }
        class334.field5185 = (byte[][][]) null;
        class334.field5182 = 0;
        class41.field578 = (byte[][][]) null;
        class124.field1855 = null;
        class16.field210 = (byte[][][]) null;
        class308.field4814 = (int[][][]) null;
        class17.field229.method1811((byte) 25);
        class282.field4433 = null;
        class18.field253 = null;
        class95.field1460 = null;
        class139.field2082 = null;
        class101.field1549 = null;
        class77.field1168 = null;
        class119.field1833 = null;
        class206.field3363 = -1;
        class244.field3884 = null;
        class138.field2069 = -1;
        class193.field3167 = null;
        class225.field3583 = null;
        class35.field463 = null;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V", line = 218)
    private final void method809(byte arg0) {
        this.field1748 = new class246(this.field1739.method1748((byte) 22));
        field1753++;
        for (class310 var2 = (class310) this.field1739.method1746((byte) -33); var2 != null; var2 = (class310) this.field1739.method1749((byte) -95)) {
            class310 var3 = new class310((int) var2.field916);
            this.field1748.method1750(var3, (byte) 122, (long) var2.field4844);
        }
        if (arg0 != -58) {
            this.method814((byte) -15, -74);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Ljava/lang/String;", line = 245)
    public final String method810(int arg0, int arg1) {
        field1743++;
        if (this.field1739 == null) {
            return this.field1740;
        }
        class98 var3 = (class98) this.field1739.method1743((long) arg1, (byte) 122);
        if (var3 == null) {
            return this.field1740;
        } else {
            if (arg0 != 2) {
                field1749 = (String[]) null;
            }
            return var3.field1490;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Ljava/lang/String;B)Z", line = 267)
    public final boolean method811(String arg0, byte arg1) {
        field1747++;
        if (this.field1739 == null) {
            return false;
        }
        if (this.field1748 == null) {
            this.method803((byte) -71);
        }
        for (class219 var3 = (class219) this.field1748.method1743(class189.method1335(1082969068, arg0), (byte) -50); var3 != null; var3 = (class219) this.field1748.method1747(-11383)) {
            if (var3.field3508.equals(arg0)) {
                return true;
            }
        }
        if (arg1 <= 34) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILim;I)V", line = 299)
    private final void method812(int arg0, class192 arg1, int arg2) {
        field1756++;
        if (arg2 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field1738 = class327.method2268(arg1.method1377(true), 90);
        } else if (arg0 == 2) {
            this.field1752 = class327.method2268(arg1.method1377(true), 88);
        } else if (arg0 == 3) {
            this.field1740 = arg1.method1355((byte) 42);
        } else if (arg0 == 4) {
            this.field1742 = arg1.method1354((byte) 47);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1396(-125);
            this.field1739 = new class246(class290.method2032(85, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1354((byte) -128);
                class71 var7;
                if (arg0 == 5) {
                    var7 = new class98(arg1.method1355((byte) 22));
                } else {
                    var7 = new class310(arg1.method1354((byte) 32));
                }
                this.field1739.method1750(var7, (byte) 122, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(B)V", line = 352)
    public static void method813(byte arg0) {
        if (arg0 == 64) {
            field1745 = (class256[][][]) null;
            field1749 = null;
            field1744 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)I", line = 368)
    public final int method814(byte arg0, int arg1) {
        field1754++;
        if (this.field1739 == null) {
            return this.field1742;
        } else if (arg0 < 70) {
            return 60;
        } else {
            class310 var3 = (class310) this.field1739.method1743((long) arg1, (byte) -72);
            return var3 == null ? this.field1742 : var3.field4844;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLim;)V", line = 392)
    public final void method815(byte arg0, class192 arg1) {
        while (true) {
            int var3 = arg1.method1399(-1172389784);
            if (var3 == 0) {
                field1737++;
                if (arg0 != -112) {
                    this.field1739 = (class246) null;
                }
                return;
            }
            this.method812(var3, arg1, 0);
        }
    }
}
