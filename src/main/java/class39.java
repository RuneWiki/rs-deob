import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class39 extends class46 {

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Lsa;")
    public class195 field634;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field630 = 0;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Lmb;")
    public static class132 field635 = class166.method1092(" <col=00ff80>", 122);

    @OriginalMember(owner = "client!de", name = "H", descriptor = "[I")
    public static int[] field637 = new int[200];

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field633 = 0;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Lmb;")
    public static class132 field629 = class166.method1092("gr-Un:", 115);

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Lii;")
    public static class96 field638 = null;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lmb;")
    public static class132 field643 = class166.method1092("leuchten1:", 123);

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "[Lhh;")
    public static class85[] field639;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
    public static final void method273(int arg0, int arg1) {
        field641++;
        if (arg1 == -1 || (!class208.field3796[arg1] || arg0 != -11748)) {
            return;
        }
        class134.field2524.method1066((byte) -117, arg1);
        if (class97.field1866[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class97.field1866[arg1].length; var3++) {
            if (class97.field1866[arg1][var3] != null) {
                if (class97.field1866[arg1][var3].field1760 == 2) {
                    var2 = false;
                } else {
                    class97.field1866[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class97.field1866[arg1] = null;
        }
        class208.field3796[arg1] = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
    public static final boolean method274(int arg0, int arg1, int arg2) {
        if (arg1 < 115) {
            return false;
        } else {
            field632++;
            return (arg2 >> arg0 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method275(int arg0) {
        field637 = null;
        field643 = null;
        field635 = null;
        field639 = null;
        field638 = null;
        field629 = null;
        if (arg0 != 32) {
            field638 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lsa;)V")
    public class39(class195 arg0) {
        this.field634 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILii;BI)V")
    public static final void method276(int arg0, int arg1, class96 arg2, byte arg3, int arg4) {
        if (arg3 < 121) {
            field643 = null;
        }
        class10.method50((byte) -24);
        class239.method1517(arg0, arg4, arg2.field1830 + arg0, arg2.field1740 + arg4);
        if (class8.field72 == 2 || class8.field72 == 5) {
            class239.method1521(arg0, arg4, 0, arg2.field1795, arg2.field1747);
        } else {
            int var5 = class230.field4153 + class166.field3029 & 0x7FF;
            int var6 = class210.field3854.field673 / 32 + 48;
            int var7 = 464 - class210.field3854.field723 / 32;
            ((class18) class84.field1473).method92(arg0, arg4, arg2.field1830, arg2.field1740, var6, var7, var5, class233.field4196 + 256, arg2.field1795, arg2.field1747);
            for (int var8 = 0; var8 < class159.field2874; var8++) {
                int var41 = class203.field3726[var8] * 4 + 2 - class210.field3854.field673 / 32;
                int var42 = class70.field1173[var8] * 4 + 2 - class210.field3854.field723 / 32;
                class84 var43 = class66.method414(0, class27.field441[var8]);
                if (var43.field1413 != null) {
                    var43 = var43.method515(-45);
                    if (var43 == null || var43.field1436 == -1) {
                        continue;
                    }
                }
                class218.method1360(var42, arg4, var41, class17.field249[var43.field1436], (byte) 106, arg0, arg2);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class19 var38 = class15.field216[class139.field2615][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + 2 - class210.field3854.field673 / 32;
                        int var40 = var37 * 4 + 2 - class210.field3854.field723 / 32;
                        class218.method1360(var40, arg4, var39, class38.field619[0], (byte) 124, arg0, arg2);
                    }
                }
            }
            for (int var10 = 0; var10 < class131.field2423; var10++) {
                class65 var33 = class11.field145[class226.field4098[var10]];
                if (var33 != null && var33.method291(124)) {
                    class185 var34 = var33.field1072;
                    if (var34 != null && var34.field3394 != null) {
                        var34 = var34.method1188(112);
                    }
                    if (var34 != null && var34.field3395 && var34.field3414) {
                        int var35 = var33.field723 / 32 - class210.field3854.field723 / 32;
                        int var36 = var33.field673 / 32 - class210.field3854.field673 / 32;
                        class218.method1360(var35, arg4, var36, class38.field619[1], (byte) 123, arg0, arg2);
                    }
                }
            }
            for (int var11 = 0; var11 < class160.field2906; var11++) {
                class159 var25 = class68.field1120[class33.field527[var11]];
                if (var25 != null && var25.method291(114)) {
                    int var26 = var25.field723 / 32 - class210.field3854.field723 / 32;
                    boolean var27 = false;
                    int var28 = var25.field673 / 32 - class210.field3854.field673 / 32;
                    long var29 = var25.field2877.method867(-27410);
                    for (int var31 = 0; var31 < client.field537; var31++) {
                        if (class137.field2575[var31] == var29 && field637[var31] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class210.field3854.field2890 != 0 && var25.field2890 != 0 && class210.field3854.field2890 == var25.field2890) {
                        var32 = true;
                    }
                    if (var27) {
                        class218.method1360(var26, arg4, var28, class38.field619[3], (byte) 87, arg0, arg2);
                    } else if (var32) {
                        class218.method1360(var26, arg4, var28, class38.field619[4], (byte) 96, arg0, arg2);
                    } else {
                        class218.method1360(var26, arg4, var28, class38.field619[2], (byte) 82, arg0, arg2);
                    }
                }
            }
            int var12 = 0;
            class59[] var13 = class203.field3742;
            while (var12 < var13.length) {
                class59 var16 = var13[var12];
                if (var16 != null && var16.field989 != 0 && class30.field460 % 20 < 10) {
                    if (var16.field989 == 1 && var16.field1004 >= 0 && class11.field145.length > var16.field1004) {
                        class65 var17 = class11.field145[var16.field1004];
                        if (var17 != null) {
                            int var18 = var17.field723 / 32 - class210.field3854.field723 / 32;
                            int var19 = var17.field673 / 32 - class210.field3854.field673 / 32;
                            class49.method325(var19, var16.field1012, var18, arg2, arg0, false, arg4);
                        }
                    }
                    if (var16.field989 == 2) {
                        int var20 = (var16.field986 - class129.field2389) * 4 + 2 - class210.field3854.field673 / 32;
                        int var21 = (var16.field988 - class168.field3082) * 4 + 2 - class210.field3854.field723 / 32;
                        class49.method325(var20, var16.field1012, var21, arg2, arg0, false, arg4);
                    }
                    if (var16.field989 == 10 && var16.field1004 >= 0 && class68.field1120.length > var16.field1004) {
                        class159 var22 = class68.field1120[var16.field1004];
                        if (var22 != null) {
                            int var23 = var22.field673 / 32 - class210.field3854.field673 / 32;
                            int var24 = var22.field723 / 32 - class210.field3854.field723 / 32;
                            class49.method325(var23, var16.field1012, var24, arg2, arg0, false, arg4);
                        }
                    }
                }
                var12++;
            }
            if (class13.field174 != 0) {
                int var14 = class13.field174 * 4 + 2 - class210.field3854.field673 / 32;
                int var15 = class84.field1470 * 4 + 2 - class210.field3854.field723 / 32;
                class218.method1360(var15, arg4, var14, class130.field2411, (byte) 71, arg0, arg2);
            }
            class239.method1525(arg0 + arg2.field1830 / 2 - 1, arg2.field1740 / 2 + arg4 + -1, 3, 3, 16777215);
        }
        class36.field603[arg1] = true;
        field631++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)I")
    public static final int method277(byte arg0, int arg1) {
        field642++;
        return arg0 >= -53 ? 72 : arg1 >>> 8;
    }
}
