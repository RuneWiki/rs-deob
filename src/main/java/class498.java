import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class498 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
    private static int[] field6770 = new int[1000];

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[[I")
    private static int[][] field6774 = new int[5][5000];

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "[Ljava/lang/String;")
    private static String[] field6778 = new String[1000];

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    private static int field6779 = 0;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    private static int field6784 = 0;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[I")
    private static int[] field6782 = new int[5];

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    private static int field6780 = 0;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "[Lvf;")
    private static class153[] field6788 = new class153[50];

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6775 = Calendar.getInstance();

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field6792 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "[I")
    private static int[] field6791 = new int[3];

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lfc;")
    public static class262 field6790 = new class262(4);

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    private static int field6793 = 0;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lsba;")
    private static class218 field6769;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lsba;")
    private static class218 field6771;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lsh;")
    private static class71 field6768;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    private static int[] field6765;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field6781;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 11)
    private static final void method2773(int arg0) {
        class218 var1 = class357.method2056(arg0, -9820);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class218[] var3 = class607.field8483[var2];
        if (var3 == null) {
            class218[] var4 = class357.field4742[var2];
            int var5 = var4.length;
            var3 = class607.field8483[var2] = new class218[var5];
            class373.method2192(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class373.method2192(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V", line = 48)
    public static final void method2774(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lje;)V", line = 60)
    public static final void method2775(class404 arg0) {
        method2781(arg0, 200000);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 71)
    private static final void method2776(int arg0) {
        class218 var1 = class357.method2056(arg0, -9820);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class218[] var3 = class607.field8483[var2];
        if (var3 == null) {
            class218[] var4 = class357.field4742[var2];
            int var5 = var4.length;
            var3 = class607.field8483[var2] = new class218[var5];
            class373.method2192(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class373.method2192(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(C)I", line = 109)
    private static final int method2777(char arg0) {
        return class432.method2468(376, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 120)
    public static final void method2778() {
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IZ)V", line = 125)
    private static final void method2779(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6780 -= 3;
                int var2 = field6770[field6780];
                int var3 = field6770[field6780 + 1];
                int var4 = field6770[field6780 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class218 var5 = class357.method2056(var2, -9820);
                if (var5.field2816 == null) {
                    var5.field2816 = new class218[var4 + 1];
                }
                if (var5.field2816.length <= var4) {
                    class218[] var6 = new class218[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2816.length; var7++) {
                        var6[var7] = var5.field2816[var7];
                    }
                    var5.field2816 = var6;
                }
                if (var4 > 0 && var5.field2816[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class218 var8 = new class218();
                var8.field2832 = var3;
                var8.field2693 = var8.field2708 = var5.field2708;
                var8.field2769 = var4;
                var5.field2816[var4] = var8;
                if (arg1) {
                    field6769 = var8;
                } else {
                    field6771 = var8;
                }
                class277.method1652(1, var5);
                return;
            }
            if (arg0 == 101) {
                class218 var9 = arg1 ? field6769 : field6771;
                if (var9.field2769 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class218 var10 = class357.method2056(var9.field2708, -9820);
                var10.field2816[var9.field2769] = null;
                class277.method1652(1, var10);
                return;
            }
            if (arg0 == 102) {
                class218 var11 = class357.method2056(field6770[--field6780], -9820);
                var11.field2816 = null;
                class277.method1652(1, var11);
                return;
            }
            if (arg0 == 200) {
                field6780 -= 2;
                int var12 = field6770[field6780];
                int var13 = field6770[field6780 + 1];
                class218 var14 = class408.method2359((byte) 72, var12, var13);
                if (var14 != null && var13 != -1) {
                    field6770[field6780++] = 1;
                    if (arg1) {
                        field6769 = var14;
                        return;
                    }
                    field6771 = var14;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6770[--field6780];
                class218 var16 = class357.method2056(var15, -9820);
                if (var16 != null) {
                    field6770[field6780++] = 1;
                    if (arg1) {
                        field6769 = var16;
                        return;
                    }
                    field6771 = var16;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6770[--field6780];
                method2773(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6770[--field6780];
                method2776(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6780 -= 2;
                int var19 = field6770[field6780];
                int var20 = field6770[field6780 + 1];
                if (class653.field9086.field1121 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class622.field8715.length; var21++) {
                    if (class622.field8715[var21] == var19) {
                        class653.field9086.field1121.method170(12, var21, class135.field1723, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class235.field3091.length; var22++) {
                    if (class235.field3091[var22] == var19) {
                        class653.field9086.field1121.method170(12, var22, class135.field1723, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6780 -= 2;
                int var23 = field6770[field6780];
                int var24 = field6770[field6780 + 1];
                if (class653.field9086.field1121 == null) {
                    return;
                }
                class653.field9086.field1121.method171(var24, var23, -9);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6770[--field6780] != 0;
                if (class653.field9086.field1121 == null) {
                    return;
                }
                class653.field9086.field1121.method174(var25, false);
                return;
            }
            if (arg0 == 411) {
                field6780 -= 2;
                int var26 = field6770[field6780];
                int var27 = field6770[field6780 + 1];
                if (class653.field9086.field1121 == null) {
                    return;
                }
                class653.field9086.field1121.method173(var27, var26, class761.field10628, 1073741824);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class218 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class357.method2056(field6770[--field6780], -9820);
            } else {
                var28 = arg1 ? field6769 : field6771;
            }
            if (arg0 == 1000) {
                field6780 -= 4;
                var28.field2747 = field6770[field6780];
                var28.field2688 = field6770[field6780 + 1];
                int var29 = field6770[field6780 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field6770[field6780 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field2700 = (byte) var29;
                var28.field2705 = (byte) var30;
                class277.method1652(1, var28);
                class270.method1614(var28, true);
                if (var28.field2769 == -1) {
                    class689.method3895(11, var28.field2708);
                }
                return;
            }
            if (arg0 == 1001) {
                field6780 -= 4;
                var28.field2694 = field6770[field6780];
                var28.field2702 = field6770[field6780 + 1];
                var28.field2691 = 0;
                var28.field2685 = 0;
                int var31 = field6770[field6780 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field6770[field6780 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field2703 = (byte) var31;
                var28.field2665 = (byte) var32;
                class277.method1652(1, var28);
                class270.method1614(var28, true);
                if (var28.field2832 == 0) {
                    class676.method3845(var28, false, (byte) 118);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field6770[--field6780] == 1;
                if (var28.field2762 != var33) {
                    var28.field2762 = var33;
                    class277.method1652(1, var28);
                }
                if (var28.field2769 == -1) {
                    class368.method2186((byte) 97, var28.field2708);
                }
                return;
            }
            if (arg0 == 1004) {
                field6780 -= 2;
                var28.field2795 = field6770[field6780];
                var28.field2815 = field6770[field6780 + 1];
                class277.method1652(1, var28);
                class270.method1614(var28, true);
                if (var28.field2832 == 0) {
                    class676.method3845(var28, false, (byte) -112);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field2752 = field6770[--field6780] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class218 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class357.method2056(field6770[--field6780], -9820);
            } else {
                var34 = arg1 ? field6769 : field6771;
            }
            if (arg0 == 1100) {
                field6780 -= 2;
                var34.field2706 = field6770[field6780];
                if (var34.field2706 > var34.field2756 - var34.field2781) {
                    var34.field2706 = var34.field2756 - var34.field2781;
                }
                if (var34.field2706 < 0) {
                    var34.field2706 = 0;
                }
                var34.field2671 = field6770[field6780 + 1];
                if (var34.field2671 > var34.field2687 - var34.field2718) {
                    var34.field2671 = var34.field2687 - var34.field2718;
                }
                if (var34.field2671 < 0) {
                    var34.field2671 = 0;
                }
                class277.method1652(1, var34);
                if (var34.field2769 == -1) {
                    class284.method1702(16953, var34.field2708);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field2695 = field6770[--field6780];
                class277.method1652(1, var34);
                if (var34.field2769 == -1) {
                    class426.method2442(124, var34.field2708);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field2724 = field6770[--field6780] == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field2751 = field6770[--field6780];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field2760 = field6770[--field6780];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field6770[--field6780];
                if (var34.field2696 != var35) {
                    var34.field2696 = var35;
                    class277.method1652(1, var34);
                }
                if (var34.field2769 == -1) {
                    class236.method1425(44, var34.field2708);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field2715 = field6770[--field6780];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field2754 = field6770[--field6780] == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field2692 = 1;
                var34.field2820 = field6770[--field6780];
                class277.method1652(1, var34);
                if (var34.field2769 == -1) {
                    class196.method1092(false, var34.field2708);
                }
                return;
            }
            if (arg0 == 1109) {
                field6780 -= 6;
                var34.field2729 = field6770[field6780];
                var34.field2735 = field6770[field6780 + 1];
                var34.field2779 = field6770[field6780 + 2];
                var34.field2676 = field6770[field6780 + 3];
                var34.field2823 = field6770[field6780 + 4];
                var34.field2711 = field6770[field6780 + 5];
                class277.method1652(1, var34);
                if (var34.field2769 == -1) {
                    class229.method1363(0, var34.field2708);
                    class150.method919(10, var34.field2708);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field6770[--field6780];
                if (var34.field2666 != var36) {
                    var34.field2666 = var36;
                    var34.field2772 = 0;
                    var34.field2753 = 1;
                    var34.field2782 = 0;
                    class300 var37 = var34.field2666 == -1 ? null : class460.field6365.method1090(var34.field2666, 16383);
                    if (var37 != null) {
                        class268.method1605(var34.field2772, var37, (byte) 74);
                    }
                    class277.method1652(1, var34);
                }
                if (var34.field2769 == -1) {
                    class260.method1559(5, var34.field2708);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field2726 = field6770[--field6780] == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field6778[--field6779];
                if (!var38.equals(var34.field2684)) {
                    var34.field2684 = var38;
                    class277.method1652(1, var34);
                }
                if (var34.field2769 == -1) {
                    class439.method2481(3, var34.field2708);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field2725 = field6770[--field6780];
                class277.method1652(1, var34);
                if (var34.field2769 == -1) {
                    class574.method3223(var34.field2708, 0);
                }
                return;
            }
            if (arg0 == 1114) {
                field6780 -= 3;
                var34.field2818 = field6770[field6780];
                var34.field2763 = field6770[field6780 + 1];
                var34.field2704 = field6770[field6780 + 2];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field2786 = field6770[--field6780] == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field2773 = field6770[--field6780];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field2833 = field6770[--field6780];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field2802 = field6770[--field6780] == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field2744 = field6770[--field6780] == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1120) {
                field6780 -= 2;
                var34.field2756 = field6770[field6780];
                var34.field2687 = field6770[field6780 + 1];
                class277.method1652(1, var34);
                if (var34.field2832 == 0) {
                    class676.method3845(var34, false, (byte) 60);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field2742 = field6770[--field6780] == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field2711 = field6770[--field6780];
                class277.method1652(1, var34);
                if (var34.field2769 == -1) {
                    class229.method1363(0, var34.field2708);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field6770[--field6780];
                var34.field2716 = var39 == 1;
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1125) {
                field6780 -= 2;
                var34.field2813 = field6770[field6780];
                var34.field2821 = field6770[field6780 + 1];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field2827 = field6770[--field6780];
                class277.method1652(1, var34);
                return;
            }
            if (arg0 == 1127) {
                field6780 -= 2;
                int var40 = field6770[field6780];
                int var41 = field6770[field6780 + 1];
                class135 var42 = class482.field6654.method296((byte) 31, var40);
                if (var42.field1718 != var41) {
                    var34.method1222(var40, var41, 16);
                    return;
                }
                var34.method1226((byte) 54, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field6770[--field6780];
                String var44 = field6778[--field6779];
                class135 var45 = class482.field6654.method296((byte) 31, var43);
                if (!var45.field1719.equals(var44)) {
                    var34.method1225(var44, 16, var43);
                    return;
                }
                var34.method1226((byte) 101, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field6770[--field6780];
                if (var34.field2832 != 5 && arg0 == 1129 || var34.field2832 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field2669 != var46) {
                    var34.field2669 = var46;
                    class277.method1652(1, var34);
                }
                if (var34.field2769 == -1) {
                    class499.method2790(121, var34.field2708);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class218 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class357.method2056(field6770[--field6780], -9820);
            } else {
                var47 = arg1 ? field6769 : field6771;
            }
            class277.method1652(1, var47);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6780 -= 2;
                int var48 = field6770[field6780];
                int var49 = field6770[field6780 + 1];
                if (var47.field2769 == -1) {
                    class553.method3143((byte) 83, var47.field2708);
                    class229.method1363(0, var47.field2708);
                    class150.method919(10, var47.field2708);
                }
                if (var48 == -1) {
                    var47.field2692 = 1;
                    var47.field2820 = -1;
                    var47.field2771 = -1;
                    return;
                }
                var47.field2771 = var48;
                var47.field2826 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field2723 = true;
                } else {
                    var47.field2723 = false;
                }
                class697 var50 = class761.field10628.method4169(var48, (byte) -120);
                var47.field2779 = var50.field9737;
                var47.field2676 = var50.field9814;
                var47.field2823 = var50.field9768;
                var47.field2729 = var50.field9763;
                var47.field2735 = var50.field9776;
                var47.field2711 = var50.field9802;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field2774 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field2774 = 1;
                } else {
                    var47.field2774 = 2;
                }
                if (var47.field2691 > 0) {
                    var47.field2711 = var47.field2711 * 32 / var47.field2691;
                    return;
                }
                if (var47.field2694 > 0) {
                    var47.field2711 = var47.field2711 * 32 / var47.field2694;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field2692 = 2;
                var47.field2820 = field6770[--field6780];
                if (var47.field2769 == -1) {
                    class196.method1092(false, var47.field2708);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field2692 = 3;
                var47.field2820 = -1;
                if (var47.field2769 == -1) {
                    class196.method1092(false, var47.field2708);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field2692 = 6;
                var47.field2820 = field6770[--field6780];
                if (var47.field2769 == -1) {
                    class196.method1092(false, var47.field2708);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field2692 = 5;
                var47.field2820 = field6770[--field6780];
                if (var47.field2769 == -1) {
                    class196.method1092(false, var47.field2708);
                }
                return;
            }
            if (arg0 == 1206) {
                field6780 -= 4;
                var47.field2728 = field6770[field6780];
                var47.field2775 = field6770[field6780 + 1];
                var47.field2721 = field6770[field6780 + 2];
                var47.field2810 = field6770[field6780 + 3];
                class277.method1652(1, var47);
                return;
            }
            if (arg0 == 1207) {
                field6780 -= 2;
                var47.field2674 = field6770[field6780];
                var47.field2722 = field6770[field6780 + 1];
                class277.method1652(1, var47);
                return;
            }
            if (arg0 == 1210) {
                field6780 -= 4;
                var47.field2820 = field6770[field6780];
                var47.field2668 = field6770[field6780 + 1];
                if (field6770[field6780 + 2] == 1) {
                    var47.field2692 = 9;
                } else {
                    var47.field2692 = 8;
                }
                if (field6770[field6780 + 3] == 1) {
                    var47.field2723 = true;
                } else {
                    var47.field2723 = false;
                }
                if (var47.field2769 == -1) {
                    class196.method1092(false, var47.field2708);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field2692 = 5;
                var47.field2820 = class247.field3207;
                var47.field2668 = 0;
                if (var47.field2769 == -1) {
                    class196.method1092(false, var47.field2708);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class218 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class357.method2056(field6770[--field6780], -9820);
                } else {
                    var62 = arg1 ? field6769 : field6771;
                }
                if (arg0 == 1499) {
                    var62.method1232(-1);
                    return;
                }
                String var63 = field6778[--field6779];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field6770[--field6780];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field6770[--field6780];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field6778[--field6779];
                    } else {
                        var66[var67] = Integer.valueOf(field6770[--field6780]);
                    }
                }
                int var68 = field6770[--field6780];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field2757 = var66;
                } else if (arg0 == 1401) {
                    var62.field2689 = var66;
                } else if (arg0 == 1402) {
                    var62.field2834 = var66;
                } else if (arg0 == 1403) {
                    var62.field2686 = var66;
                } else if (arg0 == 1404) {
                    var62.field2734 = var66;
                } else if (arg0 == 1405) {
                    var62.field2787 = var66;
                } else if (arg0 == 1406) {
                    var62.field2799 = var66;
                } else if (arg0 == 1407) {
                    var62.field2730 = var66;
                    var62.field2749 = var64;
                } else if (arg0 == 1408) {
                    var62.field2731 = var66;
                } else if (arg0 == 1409) {
                    var62.field2804 = var66;
                } else if (arg0 == 1410) {
                    var62.field2784 = var66;
                } else if (arg0 == 1411) {
                    var62.field2811 = var66;
                } else if (arg0 == 1412) {
                    var62.field2785 = var66;
                } else if (arg0 == 1414) {
                    var62.field2712 = var66;
                    var62.field2709 = var64;
                } else if (arg0 == 1415) {
                    var62.field2741 = var66;
                    var62.field2732 = var64;
                } else if (arg0 == 1416) {
                    var62.field2717 = var66;
                } else if (arg0 == 1417) {
                    var62.field2740 = var66;
                } else if (arg0 == 1418) {
                    var62.field2699 = var66;
                } else if (arg0 == 1419) {
                    var62.field2736 = var66;
                } else if (arg0 == 1420) {
                    var62.field2673 = var66;
                } else if (arg0 == 1421) {
                    var62.field2759 = var66;
                } else if (arg0 == 1422) {
                    var62.field2817 = var66;
                } else if (arg0 == 1423) {
                    var62.field2805 = var66;
                } else if (arg0 == 1424) {
                    var62.field2792 = var66;
                } else if (arg0 == 1425) {
                    var62.field2761 = var66;
                } else if (arg0 == 1426) {
                    var62.field2678 = var66;
                } else if (arg0 == 1427) {
                    var62.field2727 = var66;
                } else if (arg0 == 1428) {
                    var62.field2670 = var66;
                    var62.field2764 = var64;
                } else if (arg0 == 1429) {
                    var62.field2793 = var66;
                    var62.field2819 = var64;
                } else if (arg0 == 1430) {
                    var62.field2713 = var66;
                }
                var62.field2667 = true;
                return;
            }
            if (arg0 < 1600) {
                class218 var69 = arg1 ? field6769 : field6771;
                if (arg0 == 1500) {
                    field6770[field6780++] = var69.field2824;
                    return;
                }
                if (arg0 == 1501) {
                    field6770[field6780++] = var69.field2768;
                    return;
                }
                if (arg0 == 1502) {
                    field6770[field6780++] = var69.field2781;
                    return;
                }
                if (arg0 == 1503) {
                    field6770[field6780++] = var69.field2718;
                    return;
                }
                if (arg0 == 1504) {
                    field6770[field6780++] = var69.field2762 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6770[field6780++] = var69.field2693;
                    return;
                }
                if (arg0 == 1506) {
                    class218 var70 = class463.method2580(true, var69);
                    field6770[field6780++] = var70 == null ? -1 : var70.field2708;
                    return;
                }
            } else if (arg0 < 1700) {
                class218 var71 = arg1 ? field6769 : field6771;
                if (arg0 == 1600) {
                    field6770[field6780++] = var71.field2706;
                    return;
                }
                if (arg0 == 1601) {
                    field6770[field6780++] = var71.field2671;
                    return;
                }
                if (arg0 == 1602) {
                    field6778[field6779++] = var71.field2684;
                    return;
                }
                if (arg0 == 1603) {
                    field6770[field6780++] = var71.field2756;
                    return;
                }
                if (arg0 == 1604) {
                    field6770[field6780++] = var71.field2687;
                    return;
                }
                if (arg0 == 1605) {
                    field6770[field6780++] = var71.field2711;
                    return;
                }
                if (arg0 == 1606) {
                    field6770[field6780++] = var71.field2779;
                    return;
                }
                if (arg0 == 1607) {
                    field6770[field6780++] = var71.field2823;
                    return;
                }
                if (arg0 == 1608) {
                    field6770[field6780++] = var71.field2676;
                    return;
                }
                if (arg0 == 1609) {
                    field6770[field6780++] = var71.field2751;
                    return;
                }
                if (arg0 == 1610) {
                    field6770[field6780++] = var71.field2729;
                    return;
                }
                if (arg0 == 1611) {
                    field6770[field6780++] = var71.field2735;
                    return;
                }
                if (arg0 == 1612) {
                    field6770[field6780++] = var71.field2696;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field6770[--field6780];
                    class135 var73 = class482.field6654.method296((byte) 31, var72);
                    if (var73.method843(false)) {
                        field6778[field6779++] = var71.method1230(var72, 700, var73.field1719);
                        return;
                    }
                    field6770[field6780++] = var71.method1239(22241, var73.field1718, var72);
                    return;
                }
                if (arg0 == 1614) {
                    field6770[field6780++] = var71.field2715;
                    return;
                }
                if (arg0 == 2614) {
                    field6770[field6780++] = var71.field2692 == 1 ? var71.field2820 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class218 var74 = arg1 ? field6769 : field6771;
                if (arg0 == 1700) {
                    field6770[field6780++] = var74.field2771;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field2771 != -1) {
                        field6770[field6780++] = var74.field2826;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6770[field6780++] = var74.field2769;
                    return;
                }
            } else if (arg0 < 1900) {
                class218 var75 = arg1 ? field6769 : field6771;
                if (arg0 == 1800) {
                    field6770[field6780++] = client.method1835(var75).method3967(-1);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field6770[--field6780];
                    int var357 = var76 - 1;
                    if (var75.field2828 != null && var357 < var75.field2828.length && var75.field2828[var357] != null) {
                        field6778[field6779++] = var75.field2828[var357];
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field2683 == null) {
                        field6778[field6779++] = "";
                        return;
                    }
                    field6778[field6779++] = var75.field2683;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class218 var355;
                if (arg0 >= 2000) {
                    var355 = class357.method2056(field6770[--field6780], -9820);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field6769 : field6771;
                }
                if (field6793 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field2727 == null) {
                        return;
                    }
                    class404 var356 = new class404();
                    var356.field5714 = var355;
                    var356.field5709 = var355.field2727;
                    var356.field5722 = field6793 + 1;
                    class213.field2550.method725(var356, -20911);
                    return;
                }
            } else if (arg0 < 2600) {
                class218 var77 = class357.method2056(field6770[--field6780], -9820);
                if (arg0 == 2500) {
                    field6770[field6780++] = var77.field2824;
                    return;
                }
                if (arg0 == 2501) {
                    field6770[field6780++] = var77.field2768;
                    return;
                }
                if (arg0 == 2502) {
                    field6770[field6780++] = var77.field2781;
                    return;
                }
                if (arg0 == 2503) {
                    field6770[field6780++] = var77.field2718;
                    return;
                }
                if (arg0 == 2504) {
                    field6770[field6780++] = var77.field2762 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6770[field6780++] = var77.field2693;
                    return;
                }
                if (arg0 == 1506) {
                    class218 var78 = class463.method2580(true, var77);
                    field6770[field6780++] = var78 == null ? -1 : var78.field2708;
                    return;
                }
            } else if (arg0 < 2700) {
                class218 var79 = class357.method2056(field6770[--field6780], -9820);
                if (arg0 == 2600) {
                    field6770[field6780++] = var79.field2706;
                    return;
                }
                if (arg0 == 2601) {
                    field6770[field6780++] = var79.field2671;
                    return;
                }
                if (arg0 == 2602) {
                    field6778[field6779++] = var79.field2684;
                    return;
                }
                if (arg0 == 2603) {
                    field6770[field6780++] = var79.field2756;
                    return;
                }
                if (arg0 == 2604) {
                    field6770[field6780++] = var79.field2687;
                    return;
                }
                if (arg0 == 2605) {
                    field6770[field6780++] = var79.field2711;
                    return;
                }
                if (arg0 == 2606) {
                    field6770[field6780++] = var79.field2779;
                    return;
                }
                if (arg0 == 2607) {
                    field6770[field6780++] = var79.field2823;
                    return;
                }
                if (arg0 == 2608) {
                    field6770[field6780++] = var79.field2676;
                    return;
                }
                if (arg0 == 2609) {
                    field6770[field6780++] = var79.field2751;
                    return;
                }
                if (arg0 == 2610) {
                    field6770[field6780++] = var79.field2729;
                    return;
                }
                if (arg0 == 2611) {
                    field6770[field6780++] = var79.field2735;
                    return;
                }
                if (arg0 == 2612) {
                    field6770[field6780++] = var79.field2696;
                    return;
                }
                if (arg0 == 2613) {
                    field6770[field6780++] = var79.field2715;
                    return;
                }
                if (arg0 == 2614) {
                    field6770[field6780++] = var79.field2692 == 1 ? var79.field2820 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class218 var80 = class357.method2056(field6770[--field6780], -9820);
                    field6770[field6780++] = var80.field2771;
                    return;
                }
                if (arg0 == 2701) {
                    class218 var81 = class357.method2056(field6770[--field6780], -9820);
                    if (var81.field2771 != -1) {
                        field6770[field6780++] = var81.field2826;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field6770[--field6780];
                    class526 var83 = (class526) class520.field6994.method2552((long) var82, -1);
                    if (var83 != null) {
                        field6770[field6780++] = 1;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class218 var84 = class357.method2056(field6770[--field6780], -9820);
                    if (var84.field2816 == null) {
                        field6770[field6780++] = 0;
                        return;
                    }
                    int var85 = var84.field2816.length;
                    for (int var86 = 0; var86 < var84.field2816.length; var86++) {
                        if (var84.field2816[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field6770[field6780++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6780 -= 2;
                    int var87 = field6770[field6780];
                    int var88 = field6770[field6780 + 1];
                    class526 var89 = (class526) class520.field6994.method2552((long) var87, -1);
                    if (var89 != null && var89.field7062 == var88) {
                        field6770[field6780++] = 1;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class218 var90 = class357.method2056(field6770[--field6780], -9820);
                if (arg0 == 2800) {
                    field6770[field6780++] = client.method1835(var90).method3967(-1);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field6770[--field6780];
                    int var358 = var91 - 1;
                    if (var90.field2828 != null && var358 < var90.field2828.length && var90.field2828[var358] != null) {
                        field6778[field6779++] = var90.field2828[var358];
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field2683 == null) {
                        field6778[field6779++] = "";
                        return;
                    }
                    field6778[field6779++] = var90.field2683;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field6778[--field6779];
                    class651.method3674(var92, (byte) 108);
                    return;
                }
                if (arg0 == 3101) {
                    field6780 -= 2;
                    class509.method2827(class653.field9086, (byte) 114, field6770[field6780 + 1], field6770[field6780]);
                    return;
                }
                if (arg0 == 3103) {
                    class312.method1872(-1, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field6778[--field6779];
                    int var94 = 0;
                    if (class266.method1590((byte) 53, var93)) {
                        var94 = class436.method2477(-126, var93);
                    }
                    field6776++;
                    class103 var95 = class752.method4186(260, class744.field10343, class449.field6285);
                    var95.field1379.method3384(1571862888, var94);
                    class27.method104(false, var95);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field6778[--field6779];
                    field6789++;
                    class103 var97 = class752.method4186(260, class402.field5679, class449.field6285);
                    var97.field1379.method3393(var96.length() + 1, -61);
                    var97.field1379.method3387(var96, (byte) 113);
                    class27.method104(false, var97);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field6778[--field6779];
                    field6777++;
                    class103 var99 = class752.method4186(260, class301.field4069, class449.field6285);
                    var99.field1379.method3393(var98.length() + 1, -58);
                    var99.field1379.method3387(var98, (byte) 113);
                    class27.method104(false, var99);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field6770[--field6780];
                    String var101 = field6778[--field6779];
                    class233.method1389(var100, var101, false);
                    return;
                }
                if (arg0 == 3108) {
                    field6780 -= 3;
                    int var102 = field6770[field6780];
                    int var103 = field6770[field6780 + 1];
                    int var104 = field6770[field6780 + 2];
                    class218 var105 = class357.method2056(var104, -9820);
                    class78.method587(var105, (byte) 103, var102, var103);
                    return;
                }
                if (arg0 == 3109) {
                    field6780 -= 2;
                    int var106 = field6770[field6780];
                    int var107 = field6770[field6780 + 1];
                    class218 var108 = arg1 ? field6769 : field6771;
                    class78.method587(var108, (byte) 118, var106, var107);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field6770[--field6780];
                    field6787++;
                    class103 var110 = class752.method4186(260, class84.field1166, class449.field6285);
                    var110.field1379.method3423(var109, 1571862888);
                    class27.method104(false, var110);
                    return;
                }
                if (arg0 == 3111) {
                    field6780 -= 2;
                    int var111 = field6770[field6780];
                    int var112 = field6770[field6780 + 1];
                    class526 var113 = (class526) class520.field6994.method2552((long) var111, -1);
                    if (var113 != null) {
                        class303.method1815(16398, true, var113, var113.field7062 != var112);
                    }
                    class94.method651(true, -128, var112, var111, 3);
                    return;
                }
                if (arg0 == 3112) {
                    field6780--;
                    int var114 = field6770[field6780];
                    class526 var115 = (class526) class520.field6994.method2552((long) var114, -1);
                    if (var115 != null && var115.field7064 == 3) {
                        class303.method1815(16398, true, var115, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class590.method3283((byte) 36, field6778[--field6779]);
                    return;
                }
                if (arg0 == 3114) {
                    field6780 -= 2;
                    int var116 = field6770[field6780];
                    int var117 = field6770[field6780 + 1];
                    String var118 = field6778[--field6779];
                    class270.method1616((byte) -119, var116, var118, var117, "", "", "");
                    return;
                }
                if (arg0 == 3115) {
                    field6780 -= 11;
                    class676[] var119 = class216.method1203(123);
                    class82[] var120 = class449.method2516(256);
                    class414.method2390(field6770[field6780 + 10], field6770[field6780 + 3], var119[field6770[field6780]], field6770[field6780 + 4], field6770[field6780 + 2], false, field6770[field6780 + 8], field6770[field6780 + 9], field6770[field6780 + 6], field6770[field6780 + 7], field6770[field6780 + 5], var120[field6770[field6780 + 1]]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6780 -= 3;
                    class728.method4083(256, (byte) 1, field6770[field6780], field6770[field6780 + 1], field6770[field6780 + 2], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class142.method884(field6770[--field6780], 255, (byte) -83, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field6780 -= 2;
                    class90.method641(field6770[field6780 + 1], 255, field6770[field6780], 18596);
                    return;
                }
                if (arg0 == 3203) {
                    field6780 -= 4;
                    class728.method4083(256, (byte) 1, field6770[field6780], field6770[field6780 + 1], field6770[field6780 + 2], field6770[field6780 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field6780 -= 3;
                    class142.method884(field6770[field6780], field6770[field6780 + 1], (byte) -83, field6770[field6780 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field6780 -= 3;
                    class90.method641(field6770[field6780 + 1], field6770[field6780 + 2], field6770[field6780], 18596);
                    return;
                }
                if (arg0 == 3206) {
                    field6780 -= 4;
                    class595.method3297(-1962608884, field6770[field6780 + 3], field6770[field6780 + 1], field6770[field6780], false, field6770[field6780 + 2], 256);
                    return;
                }
                if (arg0 == 3207) {
                    field6780 -= 4;
                    class595.method3297(-1962608884, field6770[field6780 + 3], field6770[field6780 + 1], field6770[field6780], true, field6770[field6780 + 2], 256);
                    return;
                }
                if (arg0 == 3208) {
                    field6780 -= 5;
                    class728.method4083(field6770[field6780 + 4], (byte) 1, field6770[field6780], field6770[field6780 + 1], field6770[field6780 + 2], field6770[field6780 + 3]);
                    return;
                }
                if (arg0 == 3209) {
                    field6780 -= 5;
                    class595.method3297(-1962608884, field6770[field6780 + 3], field6770[field6780 + 1], field6770[field6780], false, field6770[field6780 + 2], field6770[field6780 + 4]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6770[field6780++] = class406.field5732;
                    return;
                }
                if (arg0 == 3301) {
                    field6780 -= 2;
                    int var121 = field6770[field6780];
                    int var122 = field6770[field6780 + 1];
                    field6770[field6780++] = class123.method792(var121, -121, var122, false);
                    return;
                }
                if (arg0 == 3302) {
                    field6780 -= 2;
                    int var123 = field6770[field6780];
                    int var124 = field6770[field6780 + 1];
                    field6770[field6780++] = class6.method13(false, (byte) -96, var123, var124);
                    return;
                }
                if (arg0 == 3303) {
                    field6780 -= 2;
                    int var125 = field6770[field6780];
                    int var126 = field6770[field6780 + 1];
                    field6770[field6780++] = class199.method1101(var125, -122, false, var126);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field6770[--field6780];
                    field6770[field6780++] = class503.field6834.method3321(9, var127).field6809;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field6770[--field6780];
                    field6770[field6780++] = class223.field2877[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field6770[--field6780];
                    field6770[field6780++] = class212.field2542[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field6770[--field6780];
                    field6770[field6780++] = class511.field6900[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class653.field9086.field2175;
                    int var132 = (class653.field9086.field2170 >> 9) + class99.field1313;
                    int var133 = (class653.field9086.field2165 >> 9) + class133.field1704;
                    field6770[field6780++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field6770[--field6780];
                    field6770[field6780++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field6770[--field6780];
                    field6770[field6780++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field6770[--field6780];
                    field6770[field6780++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6770[field6780++] = class262.field3431 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6780 -= 2;
                    int var137 = field6770[field6780];
                    int var138 = field6770[field6780 + 1];
                    field6770[field6780++] = class123.method792(var137, 118, var138, true);
                    return;
                }
                if (arg0 == 3314) {
                    field6780 -= 2;
                    int var139 = field6770[field6780];
                    int var140 = field6770[field6780 + 1];
                    field6770[field6780++] = class6.method13(true, (byte) -96, var139, var140);
                    return;
                }
                if (arg0 == 3315) {
                    field6780 -= 2;
                    int var141 = field6770[field6780];
                    int var142 = field6770[field6780 + 1];
                    field6770[field6780++] = class199.method1101(var141, -121, true, var142);
                    return;
                }
                if (arg0 == 3316) {
                    if (class596.field8304 >= 2) {
                        field6770[field6780++] = class596.field8304;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6770[field6780++] = class167.field2097;
                    return;
                }
                if (arg0 == 3318) {
                    field6770[field6780++] = class294.field3941.field7967;
                    return;
                }
                if (arg0 == 3321) {
                    field6770[field6780++] = class409.field5773;
                    return;
                }
                if (arg0 == 3322) {
                    field6770[field6780++] = class292.field3892;
                    return;
                }
                if (arg0 == 3323) {
                    if (class208.field2514 >= 5 && class208.field2514 <= 9) {
                        field6770[field6780++] = 1;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class208.field2514 >= 5 && class208.field2514 <= 9) {
                        field6770[field6780++] = class208.field2514;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6770[field6780++] = class205.field2436 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6770[field6780++] = class653.field9086.field1122;
                    return;
                }
                if (arg0 == 3327) {
                    field6770[field6780++] = class653.field9086.field1121 != null && class653.field9086.field1121.field355 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6770[field6780++] = class446.field6207 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field6770[--field6780];
                    field6770[field6780++] = class604.method3343(var143, (byte) 99, false);
                    return;
                }
                if (arg0 == 3331) {
                    field6780 -= 2;
                    int var144 = field6770[field6780];
                    int var145 = field6770[field6780 + 1];
                    field6770[field6780++] = class317.method1895(false, false, var144, true, var145);
                    return;
                }
                if (arg0 == 3332) {
                    field6780 -= 2;
                    int var146 = field6770[field6780];
                    int var147 = field6770[field6780 + 1];
                    field6770[field6780++] = class317.method1895(false, true, var146, true, var147);
                    return;
                }
                if (arg0 == 3333) {
                    field6770[field6780++] = class381.field5302;
                    return;
                }
                if (arg0 == 3335) {
                    field6770[field6780++] = class723.field10095;
                    return;
                }
                if (arg0 == 3336) {
                    field6780 -= 4;
                    int var148 = field6770[field6780];
                    int var149 = field6770[field6780 + 1];
                    int var150 = field6770[field6780 + 2];
                    int var151 = field6770[field6780 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field6770[field6780++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field6770[field6780++] = class586.field8204;
                    return;
                }
                if (arg0 == 3338) {
                    field6770[field6780++] = class623.method3525(12);
                    return;
                }
                if (arg0 == 3339) {
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field6770[field6780++] = class51.field539 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field6770[field6780++] = class22.field162 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field6770[field6780++] = class427.field6034.method528(61);
                    return;
                }
                if (arg0 == 3343) {
                    field6770[field6780++] = class427.field6034.method521((byte) 82);
                    return;
                }
                if (arg0 == 3344) {
                    field6778[field6779++] = class599.method3315(29558);
                    return;
                }
                if (arg0 == 3345) {
                    field6778[field6779++] = class191.method1063(0);
                    return;
                }
                if (arg0 == 3346) {
                    field6770[field6780++] = class549.method3113(66);
                    return;
                }
                if (arg0 == 3347) {
                    field6770[field6780++] = class665.field9268;
                    return;
                }
                if (arg0 == 3349) {
                    field6770[field6780++] = class653.field9086.field854.method3756((byte) 116) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6780 -= 2;
                    int var155 = field6770[field6780];
                    int var156 = field6770[field6780 + 1];
                    class635 var157 = class26.field193.method4097(var155, 1028602529);
                    field6778[field6779++] = var157.method3573(var156, (byte) 88);
                    return;
                }
                if (arg0 == 3408) {
                    field6780 -= 4;
                    int var158 = field6770[field6780];
                    int var159 = field6770[field6780 + 1];
                    int var160 = field6770[field6780 + 2];
                    int var161 = field6770[field6780 + 3];
                    class635 var162 = class26.field193.method4097(var160, 1028602529);
                    if (var162.field8825 == var158 && var162.field8838 == var159) {
                        if (var159 == 115) {
                            field6778[field6779++] = var162.method3573(var161, (byte) 23);
                            return;
                        }
                        field6770[field6780++] = var162.method3577(var161, -28629);
                        return;
                    }
                    throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
                }
                if (arg0 == 3409) {
                    field6780 -= 3;
                    int var163 = field6770[field6780];
                    int var164 = field6770[field6780 + 1];
                    int var165 = field6770[field6780 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class635 var166 = class26.field193.method4097(var164, 1028602529);
                    if (var166.field8838 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6770[field6780++] = var166.method3575(var165, (byte) 104) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field6770[--field6780];
                    String var168 = field6778[--field6779];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class635 var169 = class26.field193.method4097(var167, 1028602529);
                    if (var169.field8838 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6770[field6780++] = var169.method3581(var168, -16972) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field6770[--field6780];
                    class635 var171 = class26.field193.method4097(var170, 1028602529);
                    field6770[field6780++] = var171.field8821.method2561((byte) -6);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class543.field7686 == 0) {
                        field6770[field6780++] = -2;
                        return;
                    }
                    if (class543.field7686 == 1) {
                        field6770[field6780++] = -1;
                        return;
                    }
                    field6770[field6780++] = class233.field3026;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field6770[--field6780];
                    if (class543.field7686 == 2 && var172 < class233.field3026) {
                        field6778[field6779++] = class512.field6935[var172];
                        if (class58.field621[var172] != null) {
                            field6778[field6779++] = class58.field621[var172];
                            return;
                        }
                        field6778[field6779++] = "";
                        return;
                    }
                    field6778[field6779++] = "";
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field6770[--field6780];
                    if (class543.field7686 == 2 && var173 < class233.field3026) {
                        field6770[field6780++] = class48.field490[var173];
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field6770[--field6780];
                    if (class543.field7686 == 2 && var174 < class233.field3026) {
                        field6770[field6780++] = class179.field2206[var174];
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field6778[--field6779];
                    int var176 = field6770[--field6780];
                    class180.method1026(var176, (byte) 89, var175);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field6778[--field6779];
                    class675.method3838(4, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field6778[--field6779];
                    class104.method709(54, var178);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field6778[--field6779];
                    class711.method3987(-104, var179, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field6778[--field6779];
                    class257.method1537(var180, -23995);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field6778[--field6779];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field6770[field6780++] = class212.method1181(0, var181) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field6770[--field6780];
                    if (class543.field7686 == 2 && var182 < class233.field3026) {
                        field6778[field6779++] = class441.field6158[var182];
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class256.field3321 != null) {
                        field6778[field6779++] = class384.method2252(class256.field3321, 46);
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class256.field3321 != null) {
                        field6770[field6780++] = class170.field2122;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field6770[--field6780];
                    if (class256.field3321 != null && var183 < class170.field2122) {
                        field6778[field6779++] = class723.field10093[var183].field9667;
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field6770[--field6780];
                    if (class256.field3321 != null && var184 < class170.field2122) {
                        field6770[field6780++] = class723.field10093[var184].field9662;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field6770[--field6780];
                    if (class256.field3321 != null && var185 < class170.field2122) {
                        field6770[field6780++] = class723.field10093[var185].field9661;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6770[field6780++] = class362.field4798;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field6778[--field6779];
                    class479.method2691(-108, var186);
                    return;
                }
                if (arg0 == 3618) {
                    field6770[field6780++] = class10.field60;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field6778[--field6779];
                    class580.method3243(var187, 2);
                    return;
                }
                if (arg0 == 3620) {
                    class660.method3738(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class543.field7686 == 0) {
                        field6770[field6780++] = -1;
                        return;
                    }
                    field6770[field6780++] = class148.field1904;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field6770[--field6780];
                    if (class543.field7686 != 0 && var188 < class148.field1904) {
                        field6778[field6779++] = class554.field7827[var188];
                        if (class270.field3568[var188] != null) {
                            field6778[field6779++] = class270.field3568[var188];
                            return;
                        }
                        field6778[field6779++] = "";
                        return;
                    }
                    field6778[field6779++] = "";
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field6778[--field6779];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field6770[field6780++] = class336.method1996(var189, (byte) 117) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field6770[--field6780];
                    if (class723.field10093 != null && var190 < class170.field2122 && class723.field10093[var190].field9660.equalsIgnoreCase(class653.field9086.field1148)) {
                        field6770[field6780++] = 1;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class288.field3829 != null) {
                        field6778[field6779++] = class288.field3829;
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field6770[--field6780];
                    if (class256.field3321 != null && var191 < class170.field2122) {
                        field6778[field6779++] = class723.field10093[var191].field9666;
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field6770[--field6780];
                    if (class543.field7686 == 2 && var192 >= 0 && var192 < class233.field3026) {
                        field6770[field6780++] = class24.field187[var192] ? 1 : 0;
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field6778[--field6779];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field6770[field6780++] = class10.method27(var193, -125);
                    return;
                }
                if (arg0 == 3629) {
                    field6770[field6780++] = class444.field6175;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field6778[--field6779];
                    class711.method3987(-59, var194, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field6770[--field6780];
                    field6770[field6780++] = class759.field10584[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field6770[--field6780];
                    if (class256.field3321 != null && var196 < class170.field2122) {
                        field6778[field6779++] = class723.field10093[var196].field9660;
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field6770[--field6780];
                    if (class543.field7686 != 0 && var197 < class148.field1904) {
                        field6778[field6779++] = class72.field775[var197];
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field6770[--field6780];
                    field6770[field6780++] = class507.field6864[var198].method1656(true);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field6770[--field6780];
                    field6770[field6780++] = class507.field6864[var199].field3710;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field6770[--field6780];
                    field6770[field6780++] = class507.field6864[var200].field3704;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field6770[--field6780];
                    field6770[field6780++] = class507.field6864[var201].field3711;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field6770[--field6780];
                    field6770[field6780++] = class507.field6864[var202].field3709;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field6770[--field6780];
                    field6770[field6780++] = class507.field6864[var203].field3707;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field6770[--field6780];
                    int var205 = class507.field6864[var204].method1658(7);
                    field6770[field6780++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field6770[--field6780];
                    int var207 = class507.field6864[var206].method1658(7);
                    field6770[field6780++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field6770[--field6780];
                    int var209 = class507.field6864[var208].method1658(7);
                    field6770[field6780++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field6770[--field6780];
                    int var211 = class507.field6864[var210].method1658(7);
                    field6770[field6780++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6780 -= 2;
                    int var212 = field6770[field6780];
                    int var213 = field6770[field6780 + 1];
                    field6770[field6780++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field6780 -= 2;
                    int var214 = field6770[field6780];
                    int var215 = field6770[field6780 + 1];
                    field6770[field6780++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field6780 -= 2;
                    int var216 = field6770[field6780];
                    int var217 = field6770[field6780 + 1];
                    field6770[field6780++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field6780 -= 2;
                    int var218 = field6770[field6780];
                    int var219 = field6770[field6780 + 1];
                    field6770[field6780++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field6770[--field6780];
                    field6770[field6780++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field6770[--field6780];
                    field6770[field6780++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6780 -= 5;
                    int var222 = field6770[field6780];
                    int var223 = field6770[field6780 + 1];
                    int var224 = field6770[field6780 + 2];
                    int var225 = field6770[field6780 + 3];
                    int var226 = field6770[field6780 + 4];
                    field6770[field6780++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field6780 -= 2;
                    long var227 = (long) field6770[field6780];
                    long var229 = (long) field6770[field6780 + 1];
                    field6770[field6780++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field6780 -= 2;
                    int var231 = field6770[field6780];
                    int var232 = field6770[field6780 + 1];
                    field6770[field6780++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field6780 -= 2;
                    int var233 = field6770[field6780];
                    int var234 = field6770[field6780 + 1];
                    field6770[field6780++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6780 -= 2;
                    int var235 = field6770[field6780];
                    int var236 = field6770[field6780 + 1];
                    field6770[field6780++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6780 -= 2;
                    int var237 = field6770[field6780];
                    int var238 = field6770[field6780 + 1];
                    field6770[field6780++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field6780 -= 2;
                    int var239 = field6770[field6780];
                    int var240 = field6770[field6780 + 1];
                    if (var239 == 0) {
                        field6770[field6780++] = 0;
                        return;
                    }
                    field6770[field6780++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field6780 -= 2;
                    int var241 = field6770[field6780];
                    int var242 = field6770[field6780 + 1];
                    if (var241 == 0) {
                        field6770[field6780++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field6770[field6780++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6770[field6780++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field6780 -= 2;
                    int var243 = field6770[field6780];
                    int var244 = field6770[field6780 + 1];
                    field6770[field6780++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field6780 -= 2;
                    int var245 = field6770[field6780];
                    int var246 = field6770[field6780 + 1];
                    field6770[field6780++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field6780 -= 2;
                    int var247 = field6770[field6780];
                    int var248 = field6770[field6780 + 1];
                    field6770[field6780++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field6780 -= 2;
                    int var249 = field6770[field6780];
                    int var250 = field6770[field6780 + 1];
                    field6770[field6780++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field6780 -= 3;
                    long var251 = (long) field6770[field6780];
                    long var253 = (long) field6770[field6780 + 1];
                    long var255 = (long) field6770[field6780 + 2];
                    field6770[field6780++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field6780 -= 2;
                    int var257 = field6770[field6780];
                    int var258 = field6770[field6780 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field6770[field6780++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field6770[field6780++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field6778[--field6779];
                    int var262 = field6770[--field6780];
                    field6778[field6779++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field6779 -= 2;
                    String var263 = field6778[field6779];
                    String var264 = field6778[field6779 + 1];
                    field6778[field6779++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field6778[--field6779];
                    int var266 = field6770[--field6780];
                    field6778[field6779++] = var265 + class178.method1014(var266, false, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field6778[--field6779];
                    field6778[field6779++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6778[field6779++] = method2780(field6770[--field6780]);
                    return;
                }
                if (arg0 == 4105) {
                    field6779 -= 2;
                    String var268 = field6778[field6779];
                    String var269 = field6778[field6779 + 1];
                    if (class653.field9086.field1121 != null && class653.field9086.field1121.field355) {
                        field6778[field6779++] = var269;
                        return;
                    }
                    field6778[field6779++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field6770[--field6780];
                    field6778[field6779++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field6779 -= 2;
                    field6770[field6780++] = class387.method2262(field6778[field6779], field6778[field6779 + 1], class723.field10095, 1166845806);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field6778[--field6779];
                    field6780 -= 2;
                    int var272 = field6770[field6780];
                    int var273 = field6770[field6780 + 1];
                    class377 var274 = class581.method3247((byte) 121, 0, var273, class641.field8923);
                    field6770[field6780++] = var274.method2211(var272, 0, var271, class205.field2434);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field6778[--field6779];
                    field6780 -= 2;
                    int var276 = field6770[field6780];
                    int var277 = field6770[field6780 + 1];
                    class377 var278 = class581.method3247((byte) 119, 0, var277, class641.field8923);
                    field6770[field6780++] = var278.method2212(var276, var275, class205.field2434, (byte) 5);
                    return;
                }
                if (arg0 == 4110) {
                    field6779 -= 2;
                    String var279 = field6778[field6779];
                    String var280 = field6778[field6779 + 1];
                    if (field6770[--field6780] == 1) {
                        field6778[field6779++] = var279;
                        return;
                    }
                    field6778[field6779++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field6778[--field6779];
                    field6778[field6779++] = class199.method1100(var281, 62);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field6778[--field6779];
                    int var283 = field6770[--field6780];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6778[field6779++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field6770[--field6780];
                    field6770[field6780++] = method2777((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field6770[--field6780];
                    field6770[field6780++] = class175.method1001((char) var285, 118) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field6770[--field6780];
                    field6770[field6780++] = class401.method2322((byte) 124, (char) var286) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field6770[--field6780];
                    field6770[field6780++] = class492.method2757(18646, (char) var287) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field6778[--field6779];
                    if (var288 != null) {
                        field6770[field6780++] = var288.length();
                        return;
                    }
                    field6770[field6780++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field6778[--field6779];
                    field6780 -= 2;
                    int var290 = field6770[field6780];
                    int var291 = field6770[field6780 + 1];
                    field6778[field6779++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field6778[--field6779];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field6778[field6779++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field6778[--field6779];
                    field6780 -= 2;
                    int var298 = field6770[field6780];
                    int var299 = field6770[field6780 + 1];
                    field6770[field6780++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field6779 -= 2;
                    String var300 = field6778[field6779];
                    String var301 = field6778[field6779 + 1];
                    int var302 = field6770[--field6780];
                    field6770[field6780++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field6770[--field6780];
                    field6770[field6780++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field6770[--field6780];
                    field6770[field6780++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field6770[--field6780] != 0;
                    int var306 = field6770[--field6780];
                    field6778[field6779++] = class516.method2845(class723.field10095, 0, 48, (long) var306, var305);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field6778[--field6779];
                    int var308 = field6770[--field6780];
                    class377 var309 = class581.method3247((byte) 115, 0, var308, class641.field8923);
                    field6770[field6780++] = var309.method2218((byte) 82, class205.field2434, var307);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field6770[--field6780];
                    field6778[field6779++] = class761.field10628.method4169(var310, (byte) -126).field9780;
                    return;
                }
                if (arg0 == 4201) {
                    field6780 -= 2;
                    int var311 = field6770[field6780];
                    int var312 = field6770[field6780 + 1];
                    class697 var313 = class761.field10628.method4169(var311, (byte) -119);
                    if (var312 >= 1 && var312 <= 5 && var313.field9775[var312 - 1] != null) {
                        field6778[field6779++] = var313.field9775[var312 - 1];
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6780 -= 2;
                    int var314 = field6770[field6780];
                    int var315 = field6770[field6780 + 1];
                    class697 var316 = class761.field10628.method4169(var314, (byte) -125);
                    if (var315 >= 1 && var315 <= 5 && var316.field9811[var315 - 1] != null) {
                        field6778[field6779++] = var316.field9811[var315 - 1];
                        return;
                    }
                    field6778[field6779++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field6770[--field6780];
                    field6770[field6780++] = class761.field10628.method4169(var317, (byte) -120).field9813;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field6770[--field6780];
                    field6770[field6780++] = class761.field10628.method4169(var318, (byte) -117).field9806 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field6770[--field6780];
                    class697 var320 = class761.field10628.method4169(var319, (byte) -116);
                    if (var320.field9735 == -1 && var320.field9759 >= 0) {
                        field6770[field6780++] = var320.field9759;
                        return;
                    }
                    field6770[field6780++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field6770[--field6780];
                    class697 var322 = class761.field10628.method4169(var321, (byte) -126);
                    if (var322.field9735 >= 0 && var322.field9759 >= 0) {
                        field6770[field6780++] = var322.field9759;
                        return;
                    }
                    field6770[field6780++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field6770[--field6780];
                    field6770[field6780++] = class761.field10628.method4169(var323, (byte) -124).field9741 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6780 -= 2;
                    int var324 = field6770[field6780];
                    int var325 = field6770[field6780 + 1];
                    class135 var326 = class482.field6654.method296((byte) 31, var325);
                    if (var326.method843(false)) {
                        field6778[field6779++] = class761.field10628.method4169(var324, (byte) -126).method3940(var326.field1719, -1, var325);
                        return;
                    }
                    field6770[field6780++] = class761.field10628.method4169(var324, (byte) -123).method3939(var325, (byte) -86, var326.field1718);
                    return;
                }
                if (arg0 == 4209) {
                    field6780 -= 2;
                    int var327 = field6770[field6780];
                    int var328 = field6770[field6780 + 1] - 1;
                    class697 var329 = class761.field10628.method4169(var327, (byte) -116);
                    if (var329.field9800 == var328) {
                        field6770[field6780++] = var329.field9767;
                        return;
                    }
                    if (var329.field9760 == var328) {
                        field6770[field6780++] = var329.field9799;
                        return;
                    }
                    field6770[field6780++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field6778[--field6779];
                    int var331 = field6770[--field6780];
                    class131.method828(var331 == 1, var330, -97);
                    field6770[field6780++] = class360.field4769;
                    return;
                }
                if (arg0 == 4211) {
                    if (class421.field5899 != null && class382.field5392 < class360.field4769) {
                        field6770[field6780++] = class421.field5899[class382.field5392++] & 0xFFFF;
                        return;
                    }
                    field6770[field6780++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class382.field5392 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field6770[--field6780];
                    field6770[field6780++] = class761.field10628.method4169(var332, (byte) -117).field9739;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field6778[--field6779];
                    field6780 -= 3;
                    int var334 = field6770[field6780];
                    int var335 = field6770[field6780 + 1];
                    int var336 = field6770[field6780 + 2];
                    class359.method2064(var334 == 1, var333, var336, -1, var335);
                    field6770[field6780++] = class360.field4769;
                    return;
                }
                if (arg0 == 4215) {
                    field6779 -= 2;
                    field6780 -= 2;
                    String var337 = field6778[field6779];
                    int var338 = field6770[field6780];
                    int var339 = field6770[field6780 + 1];
                    String var340 = field6778[field6779 + 1];
                    class354.method2050(var337, var340, (byte) 34, var338 == 1, var339);
                    field6770[field6780++] = class360.field4769;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6780 -= 2;
                    int var341 = field6770[field6780];
                    int var342 = field6770[field6780 + 1];
                    class135 var343 = class482.field6654.method296((byte) 31, var342);
                    if (var343.method843(false)) {
                        field6778[field6779++] = class51.field540.method4084(5, var341).method1635(var342, -105, var343.field1719);
                        return;
                    }
                    field6770[field6780++] = class51.field540.method4084(5, var341).method1642(var342, var343.field1718, (byte) 127);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6780 -= 2;
                    int var344 = field6770[field6780];
                    int var345 = field6770[field6780 + 1];
                    class135 var346 = class482.field6654.method296((byte) 31, var345);
                    if (var346.method843(false)) {
                        field6778[field6779++] = class707.field9894.method4109(var344, (byte) 119).method3887((byte) 109, var345, var346.field1719);
                        return;
                    }
                    field6770[field6780++] = class707.field9894.method4109(var344, (byte) 119).method3889(var346.field1718, var345, 1);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6780 -= 2;
                    int var347 = field6770[field6780];
                    int var348 = field6770[field6780 + 1];
                    class135 var349 = class482.field6654.method296((byte) 31, var348);
                    if (var349.method843(false)) {
                        field6778[field6779++] = class758.field10568.method3194(26, var347).method4152(var348, (byte) -19, var349.field1719);
                        return;
                    }
                    field6770[field6780++] = class758.field10568.method3194(26, var347).method4151(var348, true, var349.field1718);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field6770[--field6780];
                class351 var351 = class137.field1743.method1346(false, var350);
                if (var351.field4690 != null && var351.field4690.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field4679[0];
                    for (int var354 = 1; var354 < var351.field4690.length; var354++) {
                        if (var351.field4679[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field4679[var354];
                        }
                    }
                    field6770[field6780++] = var351.field4690[var352];
                    return;
                }
                field6770[field6780++] = var351.field4691;
                return;
            }
        } else {
            class218 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class357.method2056(field6770[--field6780], -9820);
            } else {
                var51 = arg1 ? field6769 : field6771;
            }
            if (arg0 == 1300) {
                int var52 = field6770[--field6780] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method1235(field6778[--field6779], var52, 1);
                    return;
                }
                field6779--;
                return;
            }
            if (arg0 == 1301) {
                field6780 -= 2;
                int var53 = field6770[field6780];
                int var54 = field6770[field6780 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field2677 = null;
                    return;
                }
                var51.field2677 = class408.method2359((byte) 72, var53, var54);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field6770[--field6780];
                if (class158.field1997 != var55 && class531.field7207 != var55 && class641.field8925 != var55) {
                    return;
                }
                var51.field2755 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field2777 = field6770[--field6780];
                return;
            }
            if (arg0 == 1304) {
                var51.field2830 = field6770[--field6780];
                return;
            }
            if (arg0 == 1305) {
                var51.field2683 = field6778[--field6779];
                return;
            }
            if (arg0 == 1306) {
                var51.field2672 = field6778[--field6779];
                return;
            }
            if (arg0 == 1307) {
                var51.field2828 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field2791 = field6770[--field6780];
                var51.field2778 = field6770[--field6780];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field6770[--field6780];
                int var57 = field6770[--field6780];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method1241(-17972, var57 - 1, var56);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field2809 = field6778[--field6779];
                return;
            }
            if (arg0 == 1311) {
                var51.field2714 = field6770[--field6780];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field6780 -= 3;
                    var58 = field6770[field6780] - 1;
                    var59 = field6770[field6780 + 1];
                    var60 = field6770[field6780 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6780 -= 2;
                    var58 = 10;
                    var59 = field6770[field6780];
                    var60 = field6770[field6780 + 1];
                }
                if (var51.field2822 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field2822 = new byte[11];
                    var51.field2806 = new byte[11];
                    var51.field2737 = new int[11];
                }
                var51.field2822[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field2681 = false;
                    for (int var61 = 0; var61 < var51.field2822.length; var61++) {
                        if (var51.field2822[var61] != 0) {
                            var51.field2681 = true;
                            break;
                        }
                    }
                } else {
                    var51.field2681 = true;
                }
                var51.field2806[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field2789 = field6770[--field6780];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Ljava/lang/String;", line = 3944)
    private static final String method2780(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6775.setTime(new Date(var1));
        int var3 = field6775.get(5);
        int var4 = field6775.get(2);
        int var5 = field6775.get(1);
        return var3 + "-" + field6792[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lje;I)V", line = 3957)
    private static final void method2781(class404 arg0, int arg1) {
        Object[] var2 = arg0.field5709;
        int var3 = (Integer) var2[0];
        class464 var4 = class435.method2472(var3, 100);
        if (var4 == null) {
            return;
        }
        field6765 = new int[var4.field6423];
        int var5 = 0;
        field6781 = new String[var4.field6429];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5713;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5707;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5714 == null ? -1 : arg0.field5714.field2708;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5712;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5714 == null ? -1 : arg0.field5714.field2769;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5710 == null ? -1 : arg0.field5710.field2708;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5710 == null ? -1 : arg0.field5710.field2769;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5705;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5704;
                }
                field6765[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5706;
                }
                field6781[var6++] = var9;
            }
        }
        field6793 = arg0.field5722;
        method2784(var4, arg1);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4037)
    private static final void method2782(String arg0, int arg1) {
        if (class596.field8304 == 0 && !(!class581.field8146 || class75.field906) || class446.field6207) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class755.field10527.method4201(0, (byte) 25))) {
            var3 = 0;
            arg0 = arg0.substring(class755.field10527.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10528.method4201(0, (byte) 25))) {
            var3 = 1;
            arg0 = arg0.substring(class755.field10528.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10529.method4201(0, (byte) 25))) {
            var3 = 2;
            arg0 = arg0.substring(class755.field10529.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10530.method4201(0, (byte) 25))) {
            var3 = 3;
            arg0 = arg0.substring(class755.field10530.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10531.method4201(0, (byte) 25))) {
            var3 = 4;
            arg0 = arg0.substring(class755.field10531.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10532.method4201(0, (byte) 25))) {
            var3 = 5;
            arg0 = arg0.substring(class755.field10532.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10533.method4201(0, (byte) 25))) {
            var3 = 6;
            arg0 = arg0.substring(class755.field10533.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10534.method4201(0, (byte) 25))) {
            var3 = 7;
            arg0 = arg0.substring(class755.field10534.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10535.method4201(0, (byte) 25))) {
            var3 = 8;
            arg0 = arg0.substring(class755.field10535.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10536.method4201(0, (byte) 25))) {
            var3 = 9;
            arg0 = arg0.substring(class755.field10536.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10537.method4201(0, (byte) 25))) {
            var3 = 10;
            arg0 = arg0.substring(class755.field10537.method4201(0, (byte) 25).length());
        } else if (var2.startsWith(class755.field10538.method4201(0, (byte) 25))) {
            var3 = 11;
            arg0 = arg0.substring(class755.field10538.method4201(0, (byte) 25).length());
        } else if (class723.field10095 != 0) {
            if (var2.startsWith(class755.field10527.method4201(class723.field10095, (byte) 25))) {
                var3 = 0;
                arg0 = arg0.substring(class755.field10527.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10528.method4201(class723.field10095, (byte) 25))) {
                var3 = 1;
                arg0 = arg0.substring(class755.field10528.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10529.method4201(class723.field10095, (byte) 25))) {
                var3 = 2;
                arg0 = arg0.substring(class755.field10529.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10530.method4201(class723.field10095, (byte) 25))) {
                var3 = 3;
                arg0 = arg0.substring(class755.field10530.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10531.method4201(class723.field10095, (byte) 25))) {
                var3 = 4;
                arg0 = arg0.substring(class755.field10531.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10532.method4201(class723.field10095, (byte) 25))) {
                var3 = 5;
                arg0 = arg0.substring(class755.field10532.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10533.method4201(class723.field10095, (byte) 25))) {
                var3 = 6;
                arg0 = arg0.substring(class755.field10533.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10534.method4201(class723.field10095, (byte) 25))) {
                var3 = 7;
                arg0 = arg0.substring(class755.field10534.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10535.method4201(class723.field10095, (byte) 25))) {
                var3 = 8;
                arg0 = arg0.substring(class755.field10535.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10536.method4201(class723.field10095, (byte) 25))) {
                var3 = 9;
                arg0 = arg0.substring(class755.field10536.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10537.method4201(class723.field10095, (byte) 25))) {
                var3 = 10;
                arg0 = arg0.substring(class755.field10537.method4201(class723.field10095, (byte) 25).length());
            } else if (var2.startsWith(class755.field10538.method4201(class723.field10095, (byte) 25))) {
                var3 = 11;
                arg0 = arg0.substring(class755.field10538.method4201(class723.field10095, (byte) 25).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class755.field10539.method4201(0, (byte) 25))) {
            var5 = 1;
            arg0 = arg0.substring(class755.field10539.method4201(0, (byte) 25).length());
        } else if (var4.startsWith(class755.field10540.method4201(0, (byte) 25))) {
            var5 = 2;
            arg0 = arg0.substring(class755.field10540.method4201(0, (byte) 25).length());
        } else if (var4.startsWith(class755.field10541.method4201(0, (byte) 25))) {
            var5 = 3;
            arg0 = arg0.substring(class755.field10541.method4201(0, (byte) 25).length());
        } else if (var4.startsWith(class755.field10542.method4201(0, (byte) 25))) {
            var5 = 4;
            arg0 = arg0.substring(class755.field10542.method4201(0, (byte) 25).length());
        } else if (var4.startsWith(class755.field10543.method4201(0, (byte) 25))) {
            var5 = 5;
            arg0 = arg0.substring(class755.field10543.method4201(0, (byte) 25).length());
        } else if (class723.field10095 != 0) {
            if (var4.startsWith(class755.field10539.method4201(class723.field10095, (byte) 25))) {
                var5 = 1;
                arg0 = arg0.substring(class755.field10539.method4201(class723.field10095, (byte) 25).length());
            } else if (var4.startsWith(class755.field10540.method4201(class723.field10095, (byte) 25))) {
                var5 = 2;
                arg0 = arg0.substring(class755.field10540.method4201(class723.field10095, (byte) 25).length());
            } else if (var4.startsWith(class755.field10541.method4201(class723.field10095, (byte) 25))) {
                var5 = 3;
                arg0 = arg0.substring(class755.field10541.method4201(class723.field10095, (byte) 25).length());
            } else if (var4.startsWith(class755.field10542.method4201(class723.field10095, (byte) 25))) {
                var5 = 4;
                arg0 = arg0.substring(class755.field10542.method4201(class723.field10095, (byte) 25).length());
            } else if (var4.startsWith(class755.field10543.method4201(class723.field10095, (byte) 25))) {
                var5 = 5;
                arg0 = arg0.substring(class755.field10543.method4201(class723.field10095, (byte) 25).length());
            }
        }
        field6786++;
        class103 var6 = class752.method4186(260, class653.field9091, class449.field6285);
        var6.field1379.method3393(0, 70);
        int var7 = var6.field1379.field8520;
        var6.field1379.method3393(var3, 122);
        var6.field1379.method3393(var5, -54);
        class705.method3975(127, arg0, var6.field1379);
        var6.field1379.method3410((byte) 84, var6.field1379.field8520 - var7);
        class27.method104(false, var6);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lgm;II)V", line = 4309)
    public static final void method2783(class125 arg0, int arg1, int arg2) {
        class464 var3 = class462.method2569((byte) -109, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field6765 = new int[var3.field6423];
        field6781 = new String[var3.field6429];
        if (class140.field1800 == var3.field6422 || class449.field6265 == var3.field6422 || class626.field8757 == var3.field6422) {
            int var4 = 0;
            int var5 = 0;
            if (class162.field2034 != null) {
                var4 = class162.field2034.field2824;
                var5 = class162.field2034.field2768;
            }
            field6765[0] = class427.field6034.method528(112) - var4;
            field6765[1] = class427.field6034.method521((byte) 72) - var5;
        }
        method2784(var3, 200000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lch;I)V", line = 4334)
    private static final void method2784(class464 arg0, int arg1) {
        field6780 = 0;
        field6779 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6428;
        int[] var4 = arg0.field6432;
        byte var5 = -1;
        field6784 = 0;
        try {
            int var6 = 0;
            label270: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method2779(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2787(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6770[field6780++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6770[field6780++] = class386.field5455.field8792[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class386.field5455.method3559(var8, 98, field6770[--field6780]);
                } else if (var43 == 3) {
                    field6778[field6779++] = arg0.field6424[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6780 -= 2;
                    if (field6770[field6780 + 1] != field6770[field6780]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6780 -= 2;
                    if (field6770[field6780 + 1] == field6770[field6780]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6780 -= 2;
                    if (field6770[field6780] < field6770[field6780 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6780 -= 2;
                    if (field6770[field6780] > field6770[field6780 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6784 == 0) {
                        return;
                    }
                    class153 var9 = field6788[--field6784];
                    arg0 = var9.field1953;
                    var3 = arg0.field6428;
                    var4 = arg0.field6432;
                    var2 = var9.field1956;
                    field6765 = var9.field1948;
                    field6781 = var9.field1952;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6770[field6780++] = class386.field5455.method3554(var10, 7373);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class386.field5455.method3557(field6770[--field6780], var11, 0);
                } else if (var43 == 31) {
                    field6780 -= 2;
                    if (field6770[field6780] <= field6770[field6780 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6780 -= 2;
                    if (field6770[field6780] >= field6770[field6780 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6770[field6780++] = field6765[var4[var2]];
                } else if (var43 == 34) {
                    field6765[var4[var2]] = field6770[--field6780];
                } else if (var43 == 35) {
                    field6778[field6779++] = field6781[var4[var2]];
                } else if (var43 == 36) {
                    field6781[var4[var2]] = field6778[--field6779];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6779 -= var12;
                    String var13 = class572.method3213(var12, field6778, field6779, -17120);
                    field6778[field6779++] = var13;
                } else if (var43 == 38) {
                    field6780--;
                } else if (var43 == 39) {
                    field6779--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class464 var15 = class435.method2472(var14, 100);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6423];
                    String[] var17 = new String[var15.field6429];
                    for (int var18 = 0; var18 < var15.field6431; var18++) {
                        var16[var18] = field6770[field6780 + var18 - var15.field6431];
                    }
                    for (int var19 = 0; var19 < var15.field6430; var19++) {
                        var17[var19] = field6778[field6779 + var19 - var15.field6430];
                    }
                    field6780 -= var15.field6431;
                    field6779 -= var15.field6430;
                    class153 var20 = new class153();
                    var20.field1953 = arg0;
                    var20.field1956 = var2;
                    var20.field1948 = field6765;
                    var20.field1952 = field6781;
                    if (field6784 >= field6788.length) {
                        throw new RuntimeException();
                    }
                    field6788[field6784++] = var20;
                    arg0 = var15;
                    var3 = var15.field6428;
                    var4 = var15.field6432;
                    var2 = -1;
                    field6765 = var16;
                    field6781 = var17;
                } else if (var43 == 42) {
                    field6770[field6780++] = class161.field2024[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class161.field2024[var21] = field6770[--field6780];
                    class389.method2268(var21, 15233);
                    class711.field9923 |= class633.field8794[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6770[--field6780];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6782[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label270;
                            }
                            field6774[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6770[--field6780];
                    if (var28 < 0 || var28 >= field6782[var27]) {
                        throw new RuntimeException();
                    }
                    field6770[field6780++] = field6774[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6780 -= 2;
                    int var30 = field6770[field6780];
                    if (var30 < 0 || var30 >= field6782[var29]) {
                        throw new RuntimeException();
                    }
                    field6774[var29][var30] = field6770[field6780 + 1];
                } else if (var43 == 47) {
                    String var31 = class102.field1367[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6778[field6779++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class102.field1367[var32] = field6778[--field6779];
                    class320.method1912(var32, 2);
                } else if (var43 == 51) {
                    class459 var33 = arg0.field6421[var4[var2]];
                    class629 var34 = (class629) var33.method2552((long) field6770[--field6780], -1);
                    if (var34 != null) {
                        var2 += var34.field8775;
                    }
                } else if (var43 == 86) {
                    if (field6770[--field6780] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 87 && field6770[--field6780] == 0) {
                    var2 += var4[var2];
                }
            }
        } catch (Exception var42) {
            if (arg0.field6433 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field556).append(" ");
                for (int var41 = field6784 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6788[var41].field1953.field556).append(" ");
                }
                var40.append("op: ").append(var5);
                class760.method4223(var42, -125, var40.toString());
            } else {
                class247.method1484("Clientscript error in: " + arg0.field6433, 4, (byte) 68);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6433).append("\n");
                for (int var38 = field6784 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6788[var38].field1953.field6433).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class760.method4223(var42, -125, var37.toString());
                class392.method2288(var37.toString(), -126);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()V", line = 4789)
    public static void method2785() {
        field6765 = null;
        field6781 = null;
        field6782 = null;
        field6774 = null;
        field6770 = null;
        field6778 = null;
        field6788 = null;
        field6771 = null;
        field6769 = null;
        field6768 = null;
        field6775 = null;
        field6792 = null;
        field6791 = null;
        field6790 = null;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V", line = 4812)
    public static final void method2786(int arg0) {
        if (arg0 == -1 || !class382.method2244(arg0, 73)) {
            return;
        }
        class218[] var1 = class357.field4742[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2808 != null) {
                class404 var4 = new class404();
                var4.field5714 = var3;
                var4.field5709 = var3.field2808;
                method2781(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(IZ)V", line = 4843)
    private static final void method2787(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6770[field6780++] = class21.field156;
                return;
            }
            if (arg0 == 5001) {
                field6780 -= 3;
                class21.field156 = field6770[field6780];
                class656.field9166 = class124.method800((byte) -107, field6770[field6780 + 1]);
                if (class656.field9166 == null) {
                    class656.field9166 = class391.field5546;
                }
                class55.field565 = field6770[field6780 + 2];
                field6766++;
                class103 var2 = class752.method4186(260, class751.field10418, class449.field6285);
                var2.field1379.method3393(class21.field156, -77);
                var2.field1379.method3393(class656.field9166.field552, -57);
                var2.field1379.method3393(class55.field565, 120);
                class27.method104(false, var2);
                return;
            }
            if (arg0 == 5002) {
                field6779 -= 2;
                String var3 = field6778[field6779];
                String var4 = field6778[field6779 + 1];
                field6780 -= 2;
                int var5 = field6770[field6780];
                int var6 = field6770[field6780 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field6783++;
                class103 var7 = class752.method4186(260, class14.field105, class449.field6285);
                var7.field1379.method3393(class601.method3326(var3, (byte) 109) + class601.method3326(var4, (byte) 110) + 2, 52);
                var7.field1379.method3387(var3, (byte) 113);
                var7.field1379.method3393(var5 - 1, -91);
                var7.field1379.method3393(var6, 108);
                var7.field1379.method3387(var4, (byte) 113);
                class27.method104(false, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field6770[--field6780];
                class646 var9 = class342.method2016((byte) 49, var8);
                String var10 = "";
                if (var9 != null && var9.field8994 != null) {
                    var10 = var9.field8994;
                }
                field6778[field6779++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field6770[--field6780];
                class646 var12 = class342.method2016((byte) 49, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field8993;
                }
                field6770[field6780++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class656.field9166 == null) {
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = class656.field9166.field552;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field6770[--field6780];
                class103 var15 = class752.method4186(260, class78.field953, class449.field6285);
                var15.field1379.method3393(var14, 55);
                class27.method104(false, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field6778[--field6779];
                method2782(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6779 -= 2;
                String var17 = field6778[field6779];
                String var18 = field6778[field6779 + 1];
                if (class596.field8304 != 0 || (!class581.field8146 || class75.field906) && !class446.field6207) {
                    field6772++;
                    class103 var19 = class752.method4186(260, class295.field3975, class449.field6285);
                    var19.field1379.method3393(0, -83);
                    int var20 = var19.field1379.field8520;
                    var19.field1379.method3387(var17, (byte) 113);
                    class705.method3975(127, var18, var19.field1379);
                    var19.field1379.method3410((byte) 98, var19.field1379.field8520 - var20);
                    class27.method104(false, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field6770[--field6780];
                class646 var22 = class342.method2016((byte) 49, var21);
                String var23 = "";
                if (var22 != null && var22.field8986 != null) {
                    var23 = var22.field8986;
                }
                field6778[field6779++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field6770[--field6780];
                class646 var25 = class342.method2016((byte) 49, var24);
                String var26 = "";
                if (var25 != null && var25.field8985 != null) {
                    var26 = var25.field8985;
                }
                field6778[field6779++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field6770[--field6780];
                class646 var28 = class342.method2016((byte) 49, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field8989;
                }
                field6770[field6780++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class653.field9086 == null || class653.field9086.field1147 == null) {
                    var30 = "";
                } else {
                    var30 = class653.field9086.method615(0, true);
                }
                field6778[field6779++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field6770[field6780++] = class55.field565;
                return;
            }
            if (arg0 == 5017) {
                field6770[field6780++] = class350.method2034((byte) -4);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field6770[--field6780];
                class646 var32 = class342.method2016((byte) 49, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field8988;
                }
                field6770[field6780++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field6770[--field6780];
                class646 var35 = class342.method2016((byte) 49, var34);
                String var36 = "";
                if (var35 != null && var35.field8987 != null) {
                    var36 = var35.field8987;
                }
                field6778[field6779++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class653.field9086 == null || class653.field9086.field1147 == null) {
                    var37 = "";
                } else {
                    var37 = class653.field9086.method611(-1, false);
                }
                field6778[field6779++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field6770[--field6780];
                class646 var39 = class342.method2016((byte) 49, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field8990;
                }
                field6770[field6780++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field6770[--field6780];
                class646 var42 = class342.method2016((byte) 49, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field8992;
                }
                field6770[field6780++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field6770[--field6780];
                class646 var45 = class342.method2016((byte) 49, var44);
                String var46 = "";
                if (var45 != null && var45.field8996 != null) {
                    var46 = var45.field8996;
                }
                field6778[field6779++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field6770[--field6780];
                field6778[field6779++] = class29.field237.method2755(28559, var47).field938;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field6770[--field6780];
                class77 var49 = class29.field237.method2755(28559, var48);
                if (var49.field943 == null) {
                    field6770[field6780++] = 0;
                    return;
                }
                field6770[field6780++] = var49.field943.length;
                return;
            }
            if (arg0 == 5052) {
                field6780 -= 2;
                int var50 = field6770[field6780];
                int var51 = field6770[field6780 + 1];
                class77 var52 = class29.field237.method2755(28559, var50);
                int var53 = var52.field943[var51];
                field6770[field6780++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field6770[--field6780];
                class77 var55 = class29.field237.method2755(28559, var54);
                if (var55.field939 == null) {
                    field6770[field6780++] = 0;
                    return;
                }
                field6770[field6780++] = var55.field939.length;
                return;
            }
            if (arg0 == 5054) {
                field6780 -= 2;
                int var56 = field6770[field6780];
                int var57 = field6770[field6780 + 1];
                field6770[field6780++] = class29.field237.method2755(28559, var56).field939[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field6770[--field6780];
                field6778[field6779++] = class511.field6912.method1603(var58, 51).method3569(false);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field6770[--field6780];
                class634 var60 = class511.field6912.method1603(var59, 53);
                if (var60.field8816 == null) {
                    field6770[field6780++] = 0;
                    return;
                }
                field6770[field6780++] = var60.field8816.length;
                return;
            }
            if (arg0 == 5057) {
                field6780 -= 2;
                int var61 = field6770[field6780];
                int var62 = field6770[field6780 + 1];
                field6770[field6780++] = class511.field6912.method1603(var61, 74).field8816[var62];
                return;
            }
            if (arg0 == 5058) {
                field6768 = new class71();
                field6768.field765 = field6770[--field6780];
                field6768.field768 = class511.field6912.method1603(field6768.field765, 98);
                field6768.field766 = new int[field6768.field768.method3561((byte) -111)];
                return;
            }
            if (arg0 == 5059) {
                field6773++;
                class103 var63 = class752.method4186(260, class142.field1825, class449.field6285);
                var63.field1379.method3393(0, 59);
                int var64 = var63.field1379.field8520;
                var63.field1379.method3393(0, 72);
                var63.field1379.method3423(field6768.field765, 1571862888);
                field6768.field768.method3566(var63.field1379, field6768.field766, -3);
                var63.field1379.method3410((byte) 98, var63.field1379.field8520 - var64);
                class27.method104(false, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field6778[--field6779];
                field6785++;
                class103 var66 = class752.method4186(260, class751.field10417, class449.field6285);
                var66.field1379.method3393(0, -109);
                int var67 = var66.field1379.field8520;
                var66.field1379.method3387(var65, (byte) 113);
                var66.field1379.method3423(field6768.field765, 1571862888);
                field6768.field768.method3566(var66.field1379, field6768.field766, -3);
                var66.field1379.method3410((byte) 115, var66.field1379.field8520 - var67);
                class27.method104(false, var66);
                return;
            }
            if (arg0 == 5061) {
                field6773++;
                class103 var68 = class752.method4186(260, class142.field1825, class449.field6285);
                var68.field1379.method3393(0, 91);
                int var69 = var68.field1379.field8520;
                var68.field1379.method3393(1, -118);
                var68.field1379.method3423(field6768.field765, 1571862888);
                field6768.field768.method3566(var68.field1379, field6768.field766, -3);
                var68.field1379.method3410((byte) 118, var68.field1379.field8520 - var69);
                class27.method104(false, var68);
                return;
            }
            if (arg0 == 5062) {
                field6780 -= 2;
                int var70 = field6770[field6780];
                int var71 = field6770[field6780 + 1];
                field6770[field6780++] = class29.field237.method2755(28559, var70).field945[var71];
                return;
            }
            if (arg0 == 5063) {
                field6780 -= 2;
                int var72 = field6770[field6780];
                int var73 = field6770[field6780 + 1];
                field6770[field6780++] = class29.field237.method2755(28559, var72).field946[var73];
                return;
            }
            if (arg0 == 5064) {
                field6780 -= 2;
                int var74 = field6770[field6780];
                int var75 = field6770[field6780 + 1];
                if (var75 == -1) {
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = class29.field237.method2755(28559, var74).method569(-1, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field6780 -= 2;
                int var76 = field6770[field6780];
                int var77 = field6770[field6780 + 1];
                if (var77 == -1) {
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = class29.field237.method2755(28559, var76).method570((char) var77, (byte) -126);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field6770[--field6780];
                field6770[field6780++] = class511.field6912.method1603(var78, 109).method3561((byte) -109);
                return;
            }
            if (arg0 == 5067) {
                field6780 -= 2;
                int var79 = field6770[field6780];
                int var80 = field6770[field6780 + 1];
                int var81 = class511.field6912.method1603(var79, 67).method3567(var80, 78).field3680;
                field6770[field6780++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field6780 -= 2;
                int var82 = field6770[field6780];
                int var83 = field6770[field6780 + 1];
                field6768.field766[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field6780 -= 2;
                int var84 = field6770[field6780];
                int var85 = field6770[field6780 + 1];
                field6768.field766[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field6780 -= 3;
                int var86 = field6770[field6780];
                int var87 = field6770[field6780 + 1];
                int var88 = field6770[field6780 + 2];
                class634 var89 = class511.field6912.method1603(var86, 65);
                if (var89.method3567(var87, -126).field3680 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6770[field6780++] = var89.method3570(121, var88, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field6778[--field6779];
                boolean var91 = field6770[--field6780] == 1;
                class522.method2899(var91, var90, (byte) 69);
                field6770[field6780++] = class360.field4769;
                return;
            }
            if (arg0 == 5072) {
                if (class421.field5899 != null && class382.field5392 < class360.field4769) {
                    field6770[field6780++] = class421.field5899[class382.field5392++] & 0xFFFF;
                    return;
                }
                field6770[field6780++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class382.field5392 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class290.field3843.method1426(86, 5503)) {
                    field6770[field6780++] = 1;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class290.field3843.method1426(82, 5503)) {
                    field6770[field6780++] = 1;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class290.field3843.method1426(81, 5503)) {
                    field6770[field6780++] = 1;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class506.method2817(field6770[--field6780], false);
                return;
            }
            if (arg0 == 5201) {
                field6770[field6780++] = class134.method837(1024);
                return;
            }
            if (arg0 == 5205) {
                class222.method1266(-1, false, field6770[--field6780], (byte) 89, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field6770[--field6780];
                class294 var93 = class642.method3617(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = var93.field3946;
                return;
            }
            if (arg0 == 5207) {
                class294 var94 = class642.method3620(field6770[--field6780]);
                if (var94 != null && var94.field3933 != null) {
                    field6778[field6779++] = var94.field3933;
                    return;
                }
                field6778[field6779++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6770[field6780++] = class487.field6677;
                field6770[field6780++] = class561.field7923;
                return;
            }
            if (arg0 == 5209) {
                field6770[field6780++] = class642.field8947 + class510.field6893;
                field6770[field6780++] = class642.field8950 + class450.field6297;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field6770[--field6780];
                class294 var96 = class642.method3620(var95);
                if (var96 == null) {
                    field6770[field6780++] = 0;
                    field6770[field6780++] = 0;
                    return;
                }
                field6770[field6780++] = var96.field3934 >> 14 & 0x3FFF;
                field6770[field6780++] = var96.field3934 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field6770[--field6780];
                class294 var98 = class642.method3620(var97);
                if (var98 == null) {
                    field6770[field6780++] = 0;
                    field6770[field6780++] = 0;
                    return;
                }
                field6770[field6780++] = var98.field3948 - var98.field3937;
                field6770[field6780++] = var98.field3960 - var98.field3938;
                return;
            }
            if (arg0 == 5212) {
                class513 var99 = class212.method1182((byte) -99);
                if (var99 == null) {
                    field6770[field6780++] = -1;
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = var99.field6940;
                int var100 = var99.field6941 << 28 | class642.field8947 + var99.field6945 << 14 | class642.field8950 + var99.field6939;
                field6770[field6780++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class513 var101 = class176.method1006(-105);
                if (var101 == null) {
                    field6770[field6780++] = -1;
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = var101.field6940;
                int var102 = var101.field6941 << 28 | class642.field8947 + var101.field6945 << 14 | class642.field8950 + var101.field6939;
                field6770[field6780++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field6770[--field6780];
                class294 var104 = class124.method797(-3);
                if (var104 != null) {
                    boolean var105 = var104.method1762(var103 >> 28 & 0x3, field6791, -90, var103 & 0x3FFF, var103 >> 14 & 0x3FFF);
                    if (var105) {
                        class396.method2302(field6791[2], (byte) 39, field6791[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6780 -= 2;
                int var106 = field6770[field6780];
                int var107 = field6770[field6780 + 1];
                class406 var108 = class642.method3610(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class294 var110 = (class294) var108.method2348(-1); var110 != null; var110 = (class294) var108.method2343(0)) {
                    if (var110.field3946 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field6770[field6780++] = 1;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field6770[--field6780];
                class294 var112 = class642.method3620(var111);
                if (var112 == null) {
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = var112.field3936;
                return;
            }
            if (arg0 == 5220) {
                field6770[field6780++] = class491.field6703 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field6770[--field6780];
                class396.method2302(var113 & 0x3FFF, (byte) 100, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class294 var114 = class124.method797(-3);
                if (var114 != null) {
                    boolean var115 = var114.method1752(31960, class642.field8947 + class510.field6893, field6791, class642.field8950 + class450.field6297);
                    if (var115) {
                        field6770[field6780++] = field6791[1];
                        field6770[field6780++] = field6791[2];
                        return;
                    }
                    field6770[field6780++] = -1;
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = -1;
                field6770[field6780++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6780 -= 2;
                int var116 = field6770[field6780];
                int var117 = field6770[field6780 + 1];
                class222.method1266(var117 >> 14 & 0x3FFF, false, var116, (byte) 89, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field6770[--field6780];
                class294 var119 = class124.method797(-3);
                if (var119 != null) {
                    boolean var120 = var119.method1762(var118 >> 28 & 0x3, field6791, -105, var118 & 0x3FFF, var118 >> 14 & 0x3FFF);
                    if (var120) {
                        field6770[field6780++] = field6791[1];
                        field6770[field6780++] = field6791[2];
                        return;
                    }
                    field6770[field6780++] = -1;
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = -1;
                field6770[field6780++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field6770[--field6780];
                class294 var122 = class124.method797(-3);
                if (var122 != null) {
                    boolean var123 = var122.method1752(31960, var121 >> 14 & 0x3FFF, field6791, var121 & 0x3FFF);
                    if (var123) {
                        field6770[field6780++] = field6791[1];
                        field6770[field6780++] = field6791[2];
                        return;
                    }
                    field6770[field6780++] = -1;
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = -1;
                field6770[field6780++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class574.method3224((byte) 103, field6770[--field6780]);
                return;
            }
            if (arg0 == 5227) {
                field6780 -= 2;
                int var124 = field6770[field6780];
                int var125 = field6770[field6780 + 1];
                class222.method1266(var125 >> 14 & 0x3FFF, true, var124, (byte) 89, var125 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class482.field6652 = field6770[--field6780] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6770[field6780++] = class482.field6652 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field6770[--field6780];
                class255.method1518(125, var126);
                return;
            }
            if (arg0 == 5231) {
                field6780 -= 2;
                int var127 = field6770[field6780];
                boolean var128 = field6770[field6780 + 1] == 1;
                if (class68.field745 != null) {
                    class55 var129 = class68.field745.method2552((long) var127, -1);
                    if (var129 != null && !var128) {
                        var129.method315(120);
                        return;
                    }
                    if (var129 == null && var128) {
                        class55 var130 = new class55();
                        class68.field745.method2558(var130, (long) var127, -1);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field6770[--field6780];
                if (class68.field745 != null) {
                    class55 var132 = class68.field745.method2552((long) var131, -1);
                    field6770[field6780++] = var132 == null ? 0 : 1;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6780 -= 2;
                int var133 = field6770[field6780];
                boolean var134 = field6770[field6780 + 1] == 1;
                if (class148.field1901 != null) {
                    class55 var135 = class148.field1901.method2552((long) var133, -1);
                    if (var135 != null && !var134) {
                        var135.method315(97);
                        return;
                    }
                    if (var135 == null && var134) {
                        class55 var136 = new class55();
                        class148.field1901.method2558(var136, (long) var133, -1);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field6770[--field6780];
                if (class148.field1901 != null) {
                    class55 var138 = class148.field1901.method2552((long) var137, -1);
                    field6770[field6780++] = var138 == null ? 0 : 1;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6770[field6780++] = class642.field8928 == null ? -1 : class642.field8928.field3946;
                return;
            }
            if (arg0 == 5236) {
                field6780 -= 2;
                int var139 = field6770[field6780];
                int var140 = field6770[field6780 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class543.method3086(var139, 1, var141, var142);
                if (var143 < 0) {
                    field6770[field6780++] = -1;
                    return;
                }
                field6770[field6780++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class191.method1068(2);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6780 -= 2;
                int var144 = field6770[field6780];
                int var145 = field6770[field6780 + 1];
                class426.method2445(3, var144, 3, var145, false);
                field6770[field6780++] = class526.field7067 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class526.field7067 != null) {
                    class426.method2445(class11.field68.field5517.method2812((byte) 123), -1, 3, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class118[] var146 = class208.method1170(124);
                field6770[field6780++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field6770[--field6780];
                class118[] var148 = class208.method1170(121);
                field6770[field6780++] = var148[var147].field1556;
                field6770[field6780++] = var148[var147].field1559;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class82.field1111;
                int var150 = class490.field6699;
                int var151 = -1;
                class118[] var152 = class208.method1170(122);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class118 var154 = var152[var153];
                    if (var154.field1556 == var149 && var154.field1559 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field6770[field6780++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field6770[field6780++] = class381.method2243((byte) 102);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field6770[--field6780];
                if (var155 >= 1 && var155 <= 2) {
                    class426.method2445(var155, -1, 3, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6770[field6780++] = class11.field68.field5517.method2812((byte) 122);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field6770[--field6780];
                if (var156 >= 1 && var156 <= 2) {
                    class11.field68.method2276((byte) -13, var156, class11.field68.field5517);
                    class11.field68.method2276((byte) -13, var156, class11.field68.field5539);
                    class355.method2054(-5964);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6779 -= 2;
                String var157 = field6778[field6779];
                String var158 = field6778[field6779 + 1];
                int var159 = field6770[--field6780];
                field6767++;
                class103 var160 = class752.method4186(260, class621.field8700, class449.field6285);
                var160.field1379.method3393(class601.method3326(var157, (byte) 79) + class601.method3326(var158, (byte) 124) + 1, -41);
                var160.field1379.method3387(var157, (byte) 113);
                var160.field1379.method3387(var158, (byte) 113);
                var160.field1379.method3393(var159, -78);
                class27.method104(false, var160);
                return;
            }
            if (arg0 == 5401) {
                field6780 -= 2;
                class166.field2072[field6770[field6780]] = (short) class729.method4094(field6770[field6780 + 1], -13);
                class761.field10628.method4176(60);
                class761.field10628.method4172(64);
                class51.field540.method4080(-123);
                class340.method2004(2);
                return;
            }
            if (arg0 == 5405) {
                field6780 -= 2;
                int var161 = field6770[field6780];
                int var162 = field6770[field6780 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class523.field7048[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6780 -= 7;
                int var163 = field6770[field6780];
                int var164 = field6770[field6780 + 1] << 1;
                int var165 = field6770[field6780 + 2];
                int var166 = field6770[field6780 + 3];
                int var167 = field6770[field6780 + 4];
                int var168 = field6770[field6780 + 5];
                int var169 = field6770[field6780 + 6];
                if (var163 >= 0 && var163 < 2 && class523.field7048[var163] != null && var164 >= 0 && var164 < class523.field7048[var163].length) {
                    class523.field7048[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class523.field7048[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class523.field7048[field6770[--field6780]].length >> 1;
                field6770[field6780++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class526.field7067 != null) {
                    class426.method2445(class11.field68.field5517.method2812((byte) 121), -1, 3, -1, false);
                }
                if (class271.field3587 != null) {
                    class115.method762((byte) 100);
                    System.exit(0);
                    return;
                }
                String var171 = class438.field6140 == null ? class314.method1877((byte) -100) : class438.field6140;
                class58.method336(false, class11.field68.field5503.method741((byte) 123) == 1, var171, true, class287.field3823);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class631.field8778 != null) {
                    if (class631.field8778.field1418 == null) {
                        var172 = class565.method3183(class631.field8778.field1422, (byte) -36);
                    } else {
                        var172 = (String) class631.field8778.field1418;
                    }
                }
                field6778[field6779++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field6770[field6780++] = class287.field3823.field10290 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class526.field7067 != null) {
                    class426.method2445(class11.field68.field5517.method2812((byte) 125), -1, 3, -1, false);
                }
                String var173 = field6778[--field6779];
                boolean var174 = field6770[--field6780] == 1;
                String var175 = class314.method1877((byte) -64) + var173;
                class58.method336(var174, class11.field68.field5503.method741((byte) 123) == 1, var175, true, class287.field3823);
                return;
            }
            if (arg0 == 5422) {
                field6779 -= 2;
                String var176 = field6778[field6779];
                String var177 = field6778[field6779 + 1];
                int var178 = field6770[--field6780];
                if (var176.length() > 0) {
                    if (class520.field6998 == null) {
                        class520.field6998 = new String[class596.field8312[class51.field541.field3141]];
                    }
                    class520.field6998[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class651.field9075 == null) {
                        class651.field9075 = new String[class596.field8312[class51.field541.field3141]];
                    }
                    class651.field9075[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6778[--field6779]);
                return;
            }
            if (arg0 == 5424) {
                field6780 -= 11;
                class681.field9488 = field6770[field6780];
                class371.field5187 = field6770[field6780 + 1];
                class207.field2485 = field6770[field6780 + 2];
                class568.field8006 = field6770[field6780 + 3];
                class729.field10181 = field6770[field6780 + 4];
                class202.field2400 = field6770[field6780 + 5];
                class687.field9627 = field6770[field6780 + 6];
                class4.field36 = field6770[field6780 + 7];
                class472.field6540 = field6770[field6780 + 8];
                class690.field9670 = field6770[field6780 + 9];
                class166.field2076 = field6770[field6780 + 10];
                class97.field1282.method2882(-28, class729.field10181);
                class97.field1282.method2882(-124, class202.field2400);
                class97.field1282.method2882(-125, class687.field9627);
                class97.field1282.method2882(-34, class4.field36);
                class97.field1282.method2882(-116, class472.field6540);
                class513.field6946 = null;
                class677.field9448 = null;
                class704.field9880 = null;
                class144.field1860 = null;
                class71.field770 = null;
                class215.field2600 = null;
                class120.field1576 = null;
                class559.field7871 = null;
                class527.field7072 = true;
                return;
            }
            if (arg0 == 5425) {
                class569.method3200(true);
                class527.field7072 = false;
                return;
            }
            if (arg0 == 5426) {
                field6780 -= 2;
                class410.field5779 = field6770[field6780];
                class457.field6330 = field6770[field6780 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6780 -= 2;
                class661.field9240 = field6770[field6780 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6780 -= 2;
                int var179 = field6770[field6780];
                int var180 = field6770[field6780 + 1];
                field6770[field6780++] = class532.method2944(var179, var180, (byte) 6) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class244.method1464(field6778[--field6779], false, false, (byte) 117);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class679.method3851("accountcreated", class144.field1868, -26978);
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class679.method3851("accountcreatestarted", class144.field1868, -26978);
                    return;
                } catch (Throwable var325) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class600.field8359 != null) {
                    Transferable var182 = class600.field8359.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var326) {
                        }
                    }
                }
                field6778[field6779++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class38.field395 = field6770[--field6780];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6780 -= 4;
                int var183 = field6770[field6780];
                int var184 = field6770[field6780 + 1];
                int var185 = field6770[field6780 + 2];
                int var186 = field6770[field6780 + 3];
                class541.method3014(var185, (var183 >> 14 & 0x3FFF) - class99.field1313, false, var184 << 2, (var183 & 0x3FFF) - class133.field1704, var186, -116);
                return;
            }
            if (arg0 == 5501) {
                field6780 -= 4;
                int var187 = field6770[field6780];
                int var188 = field6770[field6780 + 1];
                int var189 = field6770[field6780 + 2];
                int var190 = field6770[field6780 + 3];
                class67.method512(-25686, var189, (var187 >> 14 & 0x3FFF) - class99.field1313, var188 << 2, var190, (var187 & 0x3FFF) - class133.field1704);
                return;
            }
            if (arg0 == 5502) {
                field6780 -= 6;
                int var191 = field6770[field6780];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class409.field5778 = var191;
                int var192 = field6770[field6780 + 1];
                if (var192 + 1 >= class523.field7048[class409.field5778].length >> 1) {
                    throw new RuntimeException();
                }
                class346.field4615 = var192;
                class52.field548 = 0;
                class166.field2077 = field6770[field6780 + 2];
                class96.field1248 = field6770[field6780 + 3];
                int var193 = field6770[field6780 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class695.field9715 = var193;
                int var194 = field6770[field6780 + 5];
                if (var194 + 1 >= class523.field7048[class695.field9715].length >> 1) {
                    throw new RuntimeException();
                }
                class60.field652 = var194;
                class8.field57 = 3;
                class39.field404 = -1;
                class520.field6999 = -1;
                return;
            }
            if (arg0 == 5503) {
                class271.method1622(9268);
                return;
            }
            if (arg0 == 5504) {
                field6780 -= 2;
                class659.method3724(field6770[field6780 + 1], 0, 87, field6770[field6780]);
                return;
            }
            if (arg0 == 5505) {
                field6770[field6780++] = (int) class255.field3307 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6770[field6780++] = (int) class183.field2237 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class353.method2047((byte) -87);
                return;
            }
            if (arg0 == 5508) {
                class340.method2007(-1);
                return;
            }
            if (arg0 == 5509) {
                class607.method3353((byte) -107);
                return;
            }
            if (arg0 == 5510) {
                class716.method4036((byte) 83);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field6770[--field6780];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class99.field1313;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class272.field3589) {
                    var198 = class272.field3589;
                }
                int var199 = var197 - class133.field1704;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class3.field26) {
                    var199 = class3.field26;
                }
                class86.field1179 = (var198 << 9) + 256;
                class232.field2981 = (var199 << 9) + 256;
                class8.field57 = 4;
                class39.field404 = -1;
                class520.field6999 = -1;
                return;
            }
            if (arg0 == 5512) {
                class685.method3879((byte) 1);
                return;
            }
            if (arg0 == 5514) {
                class661.field9251 = field6770[--field6780];
                return;
            }
            if (arg0 == 5516) {
                field6770[field6780++] = class661.field9251;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field6770[--field6780];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class99.field1313;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class272.field3589) {
                        var203 = class272.field3589;
                    }
                    int var204 = var202 - class133.field1704;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class3.field26) {
                        var204 = class3.field26;
                    }
                    class520.field6999 = (var203 << 9) + 256;
                    class39.field404 = (var204 << 9) + 256;
                    return;
                }
                class520.field6999 = -1;
                class39.field404 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6779 -= 2;
                String var205 = field6778[field6779];
                String var206 = field6778[field6779 + 1];
                int var207 = field6770[--field6780];
                if (var205.length() > 320) {
                    return;
                }
                if (class713.field9949 != 3) {
                    return;
                }
                if (class421.field5893 == 0 && class284.field3753 == 0) {
                    class551.field7807 = var205;
                    class463.field6399 = var206;
                    class381.field5302 = var207;
                    class237.method1429(6, false);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class554.method3145((byte) -38);
                return;
            }
            if (arg0 == 5602) {
                if (class421.field5893 == 0) {
                    class226.field2932 = -2;
                    class173.field2146 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field6779--;
                if (class713.field9949 != 3) {
                    return;
                }
                if (class421.field5893 == 0 && class284.field3753 == 0) {
                    class28.method111((byte) 34, field6778[field6779]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6779 -= 2;
                field6780 -= 2;
                if (class713.field9949 != 3) {
                    return;
                }
                if (class421.field5893 == 0 && class284.field3753 == 0) {
                    class579.method3241(field6770[field6780 + 1] == 1, 0, field6778[field6779 + 1], field6778[field6779], field6770[field6780]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class284.field3753 == 0) {
                    class698.field9828 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6770[field6780++] = class173.field2146;
                return;
            }
            if (arg0 == 5608) {
                field6770[field6780++] = class671.field9319;
                return;
            }
            if (arg0 == 5609) {
                field6770[field6780++] = class698.field9828;
                return;
            }
            if (arg0 == 5611) {
                field6770[field6780++] = class36.field371;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field6770[--field6780];
                if (class713.field9949 != 7) {
                    return;
                }
                if (class421.field5893 == 0 && class284.field3753 == 0) {
                    if (class582.field8161 != null) {
                        class582.field8161.method1439(-18);
                        class582.field8161 = null;
                    }
                    class381.field5302 = var208;
                    class237.method1429(9, false);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field6770[field6780++] = class173.field2146;
                return;
            }
            if (arg0 == 5615) {
                field6779 -= 2;
                String var209 = field6778[field6779];
                String var210 = field6778[field6779 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class713.field9949 != 3) {
                    return;
                }
                if (class421.field5893 == 0 && class284.field3753 == 0) {
                    if (class582.field8161 != null) {
                        class582.field8161.method1439(-64);
                        class582.field8161 = null;
                    }
                    class551.field7807 = var209;
                    class463.field6399 = var210;
                    class237.method1429(5, false);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class727.method4076(false, false);
                return;
            }
            if (arg0 == 5617) {
                field6770[field6780++] = class226.field2932;
                return;
            }
            if (arg0 == 5618) {
                field6780--;
                return;
            }
            if (arg0 == 5619) {
                field6780--;
                return;
            }
            if (arg0 == 5620) {
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field6779 -= 2;
                field6780 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class692.field9682 != null) {
                    field6770[field6780++] = 1;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field6770[field6780++] = (int) (class377.field5237 >> 32);
                field6770[field6780++] = (int) (class377.field5237 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field6770[field6780++] = class60.field647 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class60.field647 = true;
                class285.method1707(-68);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field6770[--field6780];
                class11.field68.method2276((byte) -13, var211, class11.field68.field5523);
                class243.method1461((byte) -74);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field6770[--field6780] == 1;
                class11.field68.method2276((byte) -13, var212 ? 1 : 0, class11.field68.field5502);
                class11.field68.method2276((byte) -13, var212 ? 1 : 0, class11.field68.field5548);
                class243.method1461((byte) 121);
                class232.method1386((byte) -118);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field6770[--field6780] == 1;
                class11.field68.method2276((byte) -13, var213 ? 2 : 1, class11.field68.field5493);
                class11.field68.method2276((byte) -13, var213 ? 2 : 1, class11.field68.field5524);
                class232.method1386((byte) -117);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6005) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : 0, class11.field68.field5498);
                class243.method1461((byte) 124);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6007) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5510);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6008) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : 0, class11.field68.field5532);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6010) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : 0, class11.field68.field5494);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6011) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5545);
                class243.method1461((byte) 123);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6012) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : 0, class11.field68.field5541);
                class216.method1201((byte) 67);
                class723.method4058((byte) 127);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6014) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 2 : 0, class11.field68.field5534);
                class243.method1461((byte) 119);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6015) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : 0, class11.field68.field5512);
                class243.method1461((byte) 123);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6016) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5520);
                class479.method2689(class11.field68.field5503.method741((byte) 123), false, 80);
                class355.method2054(-5964);
                return;
            }
            if (arg0 == 6017) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : 0, class11.field68.field5504);
                class444.method2493(124);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6018) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5537);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field6770[--field6780];
                int var215 = class11.field68.field5540.method750((byte) 121);
                if (var214 != var215) {
                    if (class247.method1483(-11297, class713.field9949)) {
                        if (var215 == 0 && class555.field7831 != -1) {
                            class257.method1547(class727.field10149, false, var214, class555.field7831, 0, -16523);
                            class444.method2492((byte) 111);
                            class31.field270 = false;
                        } else if (var214 == 0) {
                            class658.method3723(31585);
                            class31.field270 = false;
                        } else {
                            class394.method2293(var214, 1024);
                        }
                    }
                    class11.field68.method2276((byte) -13, var214, class11.field68.field5540);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5516);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class11.field68.field5493.method2687((byte) 127);
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 0 : var216, class11.field68.field5524);
                class232.method1386((byte) -113);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field6770[--field6780];
                class11.field68.method2276((byte) -13, var217, class11.field68.field5492);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6024) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5505);
                class355.method2054(-5964);
                return;
            }
            if (arg0 == 6025) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5508);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field6770[--field6780];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class557.method3155(29089, var218 == 1);
                return;
            }
            if (arg0 == 6028) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 0 ? 0 : 1, class11.field68.field5513);
                class355.method2054(-5964);
                return;
            }
            if (arg0 == 6029) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5510);
                class355.method2054(-5964);
                return;
            }
            if (arg0 == 6030) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 0 ? 0 : 1, class11.field68.field5499);
                class355.method2054(-5964);
                class243.method1461((byte) -71);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field6770[--field6780];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class479.method2689(var219, false, 3);
                return;
            }
            if (arg0 == 6032) {
                field6780 -= 2;
                int var220 = field6770[field6780];
                boolean var221 = field6770[field6780 + 1] == 1;
                class11.field68.method2276((byte) -13, var220, class11.field68.field5530);
                if (!var221) {
                    class11.field68.method2276((byte) -13, 0, class11.field68.field5511);
                }
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6033) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5496);
                class355.method2054(-5964);
                return;
            }
            if (arg0 == 6034) {
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : 0, class11.field68.field5521);
                class355.method2054(-5964);
                class216.method1201((byte) 49);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class11.field68.field5502.method186((byte) 125);
                class11.field68.method2276((byte) -13, field6770[--field6780] == 1 ? 1 : var222, class11.field68.field5548);
                class243.method1461((byte) 112);
                class232.method1386((byte) -118);
                return;
            }
            if (arg0 == 6036) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5501);
                class355.method2054(-5964);
                class139.field1786 = true;
                return;
            }
            if (arg0 == 6037) {
                class11.field68.method2276((byte) -13, field6770[--field6780], class11.field68.field5519);
                class355.method2054(-5964);
                class257.field3353 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field6770[--field6780];
                int var224 = class11.field68.field5544.method750((byte) 123);
                if (var223 != var224 && class555.field7831 == class413.field5841) {
                    if (!class247.method1483(-11297, class713.field9949)) {
                        if (var224 == 0) {
                            class257.method1547(class727.field10149, false, var223, class555.field7831, 0, -16523);
                            class444.method2492((byte) 111);
                            class31.field270 = false;
                        } else if (var223 == 0) {
                            class658.method3723(31585);
                            class31.field270 = false;
                        } else {
                            class394.method2293(var223, 1024);
                        }
                    }
                    class11.field68.method2276((byte) -13, var223, class11.field68.field5544);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field6770[--field6780];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class11.field68.field5518.method2633((byte) 125)) {
                    class11.field68.method2276((byte) -13, var225, class11.field68.field5518);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field6770[--field6780];
                if (var226 != class11.field68.field5543.method1144((byte) 122)) {
                    class11.field68.method2276((byte) -13, var226, class11.field68.field5543);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    class339.method2002(-58);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6770[field6780++] = class11.field68.field5523.method746((byte) 125);
                return;
            }
            if (arg0 == 6102) {
                field6770[field6780++] = class11.field68.field5502.method186((byte) 127) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6770[field6780++] = class11.field68.field5493.method2687((byte) 125) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6770[field6780++] = class11.field68.field5498.method4055((byte) 125) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6770[field6780++] = class11.field68.field5510.method1173((byte) 126);
                return;
            }
            if (arg0 == 6108) {
                field6770[field6780++] = class11.field68.field5532.method3352((byte) 127) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6770[field6780++] = class11.field68.field5494.method193((byte) 120) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6770[field6780++] = class11.field68.field5545.method61((byte) 126);
                return;
            }
            if (arg0 == 6112) {
                field6770[field6780++] = class11.field68.field5541.method3210((byte) 123) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6770[field6780++] = class11.field68.field5534.method1058((byte) 125) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6770[field6780++] = class11.field68.field5512.method813((byte) 125) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6770[field6780++] = class11.field68.field5520.method1958((byte) 125);
                return;
            }
            if (arg0 == 6117) {
                field6770[field6780++] = class11.field68.field5504.method3760((byte) 120) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6770[field6780++] = class11.field68.field5537.method750((byte) 126);
                return;
            }
            if (arg0 == 6119) {
                field6770[field6780++] = class11.field68.field5540.method750((byte) 121);
                return;
            }
            if (arg0 == 6120) {
                field6770[field6780++] = class11.field68.field5516.method750((byte) 120);
                return;
            }
            if (arg0 == 6123) {
                field6770[field6780++] = class435.method2471((byte) -47);
                return;
            }
            if (arg0 == 6124) {
                field6770[field6780++] = class11.field68.field5505.method1958((byte) 121);
                return;
            }
            if (arg0 == 6125) {
                field6770[field6780++] = class11.field68.field5508.method2663((byte) 123);
                return;
            }
            if (arg0 == 6127) {
                field6770[field6780++] = class11.field68.field5536.method2257((byte) 121) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6770[field6780++] = class11.field68.field5513.method1109((byte) 122) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6770[field6780++] = class11.field68.field5510.method1173((byte) 125);
                return;
            }
            if (arg0 == 6130) {
                field6770[field6780++] = class11.field68.field5499.method249((byte) 127) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6770[field6780++] = class11.field68.field5503.method741((byte) 122);
                return;
            }
            if (arg0 == 6132) {
                field6770[field6780++] = class11.field68.field5530.method741((byte) 120);
                return;
            }
            if (arg0 == 6133) {
                field6770[field6780++] = class287.field3823.field10290 && !class287.field3823.field10283 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field6770[field6780++] = class11.field68.field5496.method1271((byte) 121);
                return;
            }
            if (arg0 == 6136) {
                field6770[field6780++] = class11.field68.field5521.method3358((byte) 122) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field6770[field6780++] = class711.method3986((byte) -80, 200, class11.field68.field5503.method741((byte) 122));
                return;
            }
            if (arg0 == 6139) {
                field6770[field6780++] = class11.field68.field5501.method2405((byte) 124);
                return;
            }
            if (arg0 == 6142) {
                field6770[field6780++] = class11.field68.field5519.method750((byte) 127);
                return;
            }
            if (arg0 == 6143) {
                field6770[field6780++] = class11.field68.field5544.method750((byte) 120);
                return;
            }
            if (arg0 == 6144) {
                field6770[field6780++] = class500.field6811 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field6770[field6780++] = class11.field68.field5518.method2633((byte) 121);
                return;
            }
            if (arg0 == 6146) {
                field6770[field6780++] = class11.field68.field5543.method1144((byte) 127);
                return;
            }
            if (arg0 == 6147) {
                field6770[field6780++] = class353.field4715.field10203 < 512 || class500.field6811 || class598.field8329 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field6770[field6780++] = class130.field1678 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6780 -= 2;
                class21.field141 = (short) field6770[field6780];
                if (class21.field141 <= 0) {
                    class21.field141 = 256;
                }
                class638.field8852 = (short) field6770[field6780 + 1];
                if (class638.field8852 <= 0) {
                    class638.field8852 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6780 -= 2;
                class111.field1473 = (short) field6770[field6780];
                if (class111.field1473 <= 0) {
                    class111.field1473 = 256;
                }
                class232.field3001 = (short) field6770[field6780 + 1];
                if (class232.field3001 <= 0) {
                    class232.field3001 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6780 -= 4;
                class15.field114 = (short) field6770[field6780];
                if (class15.field114 <= 0) {
                    class15.field114 = 1;
                }
                class490.field6698 = (short) field6770[field6780 + 1];
                if (class490.field6698 <= 0) {
                    class490.field6698 = 32767;
                } else if (class490.field6698 < class15.field114) {
                    class490.field6698 = class15.field114;
                }
                class221.field2861 = (short) field6770[field6780 + 2];
                if (class221.field2861 <= 0) {
                    class221.field2861 = 1;
                }
                class681.field9479 = (short) field6770[field6780 + 3];
                if (class681.field9479 <= 0) {
                    class681.field9479 = 32767;
                    return;
                }
                if (class681.field9479 < class221.field2861) {
                    class681.field9479 = class221.field2861;
                }
                return;
            }
            if (arg0 == 6203) {
                class213.method1183(0, false, class753.field10437.field2781, 100, class753.field10437.field2718, 0);
                field6770[field6780++] = class406.field5729;
                field6770[field6780++] = class97.field1276;
                return;
            }
            if (arg0 == 6204) {
                field6770[field6780++] = class111.field1473;
                field6770[field6780++] = class232.field3001;
                return;
            }
            if (arg0 == 6205) {
                field6770[field6780++] = class21.field141;
                field6770[field6780++] = class638.field8852;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6770[field6780++] = (int) (class538.method2963(-47) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6770[field6780++] = (int) (class538.method2963(-47) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6780 -= 3;
                int var227 = field6770[field6780];
                int var228 = field6770[field6780 + 1];
                int var229 = field6770[field6780 + 2];
                field6775.clear();
                field6775.set(11, 12);
                field6775.set(var229, var228, var227);
                int var230 = (int) (field6775.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field6770[field6780++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field6775.clear();
                field6775.setTime(new Date(class538.method2963(-47)));
                field6770[field6780++] = field6775.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field6770[--field6780];
                boolean var232 = true;
                if (var231 < 0) {
                    var232 = (var231 + 1) % 4 == 0;
                } else if (var231 < 1582) {
                    var232 = var231 % 4 == 0;
                } else if (var231 % 4 != 0) {
                    var232 = false;
                } else if (var231 % 100 != 0) {
                    var232 = true;
                } else if (var231 % 400 != 0) {
                    var232 = false;
                }
                field6770[field6780++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6770[field6780++] = class399.method2312(-96) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6770[field6780++] = class368.method2184(76) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class713.field9949 == 7 && class421.field5893 == 0 && class284.field3753 == 0) {
                    if (class331.field4463) {
                        field6770[field6780++] = 0;
                        return;
                    }
                    if (class146.field1882 > class538.method2963(-47) - 1000L) {
                        field6770[field6780++] = 1;
                        return;
                    }
                    class331.field4463 = true;
                    class103 var233 = class752.method4186(260, class393.field5571, class449.field6285);
                    var233.field1379.method3384(1571862888, class348.field4627);
                    class27.method104(false, var233);
                    field6770[field6780++] = 0;
                    return;
                }
                field6770[field6780++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class695 var234 = class620.method3513((byte) 101);
                if (var234 != null) {
                    field6770[field6780++] = var234.field9709;
                    field6770[field6780++] = var234.field695;
                    field6778[field6779++] = var234.field9706;
                    class175 var235 = var234.method3925(-1);
                    field6770[field6780++] = var235.field2160;
                    field6778[field6779++] = var235.field2161;
                    field6770[field6780++] = var234.field697;
                    field6770[field6780++] = var234.field9707;
                    field6778[field6779++] = var234.field9712;
                    return;
                }
                field6770[field6780++] = -1;
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                field6770[field6780++] = 0;
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                return;
            }
            if (arg0 == 6502) {
                class695 var236 = class497.method2770(200);
                if (var236 != null) {
                    field6770[field6780++] = var236.field9709;
                    field6770[field6780++] = var236.field695;
                    field6778[field6779++] = var236.field9706;
                    class175 var237 = var236.method3925(-1);
                    field6770[field6780++] = var237.field2160;
                    field6778[field6779++] = var237.field2161;
                    field6770[field6780++] = var236.field697;
                    field6770[field6780++] = var236.field9707;
                    field6778[field6779++] = var236.field9712;
                    return;
                }
                field6770[field6780++] = -1;
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                field6770[field6780++] = 0;
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field6770[--field6780];
                String var239 = field6778[--field6779];
                if (class713.field9949 == 7 && class421.field5893 == 0 && class284.field3753 == 0) {
                    field6770[field6780++] = class109.method739(-8804, var238, var239) ? 1 : 0;
                    return;
                }
                field6770[field6780++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field6770[--field6780];
                class695 var241 = class539.method2965((byte) 123, var240);
                if (var241 != null) {
                    field6770[field6780++] = var241.field695;
                    field6778[field6779++] = var241.field9706;
                    class175 var242 = var241.method3925(-1);
                    field6770[field6780++] = var242.field2160;
                    field6778[field6779++] = var242.field2161;
                    field6770[field6780++] = var241.field697;
                    field6770[field6780++] = var241.field9707;
                    field6778[field6779++] = var241.field9712;
                    return;
                }
                field6770[field6780++] = -1;
                field6778[field6779++] = "";
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                field6770[field6780++] = 0;
                field6770[field6780++] = 0;
                field6778[field6779++] = "";
                return;
            }
            if (arg0 == 6507) {
                field6780 -= 4;
                int var243 = field6770[field6780];
                boolean var244 = field6770[field6780 + 1] == 1;
                int var245 = field6770[field6780 + 2];
                boolean var246 = field6770[field6780 + 3] == 1;
                class702.method3959(var246, var245, var243, (byte) 82, var244);
                return;
            }
            if (arg0 == 6508) {
                class376.method2209((byte) 74);
                return;
            }
            if (arg0 == 6509) {
                if (class713.field9949 != 7) {
                    return;
                }
                class420.field5888 = field6770[--field6780] == 1;
                return;
            }
            if (arg0 == 6510) {
                field6770[field6780++] = class392.field5551;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class535.field7257 == class299.field4020) {
                if (arg0 == 6700) {
                    int var247 = class520.field6994.method2561((byte) -6);
                    if (class116.field1543 != -1) {
                        var247++;
                    }
                    field6770[field6780++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field6770[--field6780];
                    if (class116.field1543 != -1) {
                        if (var248 == 0) {
                            field6770[field6780++] = class116.field1543;
                            return;
                        }
                        var248--;
                    }
                    class526 var249 = (class526) class520.field6994.method2560(98);
                    while (var248-- > 0) {
                        var249 = (class526) class520.field6994.method2557(-1);
                    }
                    field6770[field6780++] = var249.field7062;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field6770[--field6780];
                    if (class357.field4742[var250] == null) {
                        field6778[field6779++] = "";
                        return;
                    }
                    String var251 = class357.field4742[var250][0].field2690;
                    if (var251 == null) {
                        field6778[field6779++] = "";
                        return;
                    }
                    field6778[field6779++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field6770[--field6780];
                    if (class357.field4742[var252] == null) {
                        field6770[field6780++] = 0;
                        return;
                    }
                    field6770[field6780++] = class357.field4742[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field6780 -= 2;
                    int var253 = field6770[field6780];
                    int var254 = field6770[field6780 + 1];
                    if (class357.field4742[var253] == null) {
                        field6778[field6779++] = "";
                        return;
                    }
                    String var255 = class357.field4742[var253][var254].field2690;
                    if (var255 == null) {
                        field6778[field6779++] = "";
                        return;
                    }
                    field6778[field6779++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field6780 -= 2;
                    int var256 = field6770[field6780];
                    int var257 = field6770[field6780 + 1];
                    if (class357.field4742[var256] == null) {
                        field6770[field6780++] = 0;
                        return;
                    }
                    field6770[field6780++] = class357.field4742[var256][var257].field2719;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field6780 -= 3;
                    int var258 = field6770[field6780];
                    int var259 = field6770[field6780 + 1];
                    int var260 = field6770[field6780 + 2];
                    class461.method2566(1, var260, "", -121, var258 << 16 | var259);
                    return;
                }
                if (arg0 == 6708) {
                    field6780 -= 3;
                    int var261 = field6770[field6780];
                    int var262 = field6770[field6780 + 1];
                    int var263 = field6770[field6780 + 2];
                    class461.method2566(2, var263, "", -117, var261 << 16 | var262);
                    return;
                }
                if (arg0 == 6709) {
                    field6780 -= 3;
                    int var264 = field6770[field6780];
                    int var265 = field6770[field6780 + 1];
                    int var266 = field6770[field6780 + 2];
                    class461.method2566(3, var266, "", -126, var264 << 16 | var265);
                    return;
                }
                if (arg0 == 6710) {
                    field6780 -= 3;
                    int var267 = field6770[field6780];
                    int var268 = field6770[field6780 + 1];
                    int var269 = field6770[field6780 + 2];
                    class461.method2566(4, var269, "", -121, var267 << 16 | var268);
                    return;
                }
                if (arg0 == 6711) {
                    field6780 -= 3;
                    int var270 = field6770[field6780];
                    int var271 = field6770[field6780 + 1];
                    int var272 = field6770[field6780 + 2];
                    class461.method2566(5, var272, "", -117, var270 << 16 | var271);
                    return;
                }
                if (arg0 == 6712) {
                    field6780 -= 3;
                    int var273 = field6770[field6780];
                    int var274 = field6770[field6780 + 1];
                    int var275 = field6770[field6780 + 2];
                    class461.method2566(6, var275, "", -118, var273 << 16 | var274);
                    return;
                }
                if (arg0 == 6713) {
                    field6780 -= 3;
                    int var276 = field6770[field6780];
                    int var277 = field6770[field6780 + 1];
                    int var278 = field6770[field6780 + 2];
                    class461.method2566(7, var278, "", -125, var276 << 16 | var277);
                    return;
                }
                if (arg0 == 6714) {
                    field6780 -= 3;
                    int var279 = field6770[field6780];
                    int var280 = field6770[field6780 + 1];
                    int var281 = field6770[field6780 + 2];
                    class461.method2566(8, var281, "", -117, var279 << 16 | var280);
                    return;
                }
                if (arg0 == 6715) {
                    field6780 -= 3;
                    int var282 = field6770[field6780];
                    int var283 = field6770[field6780 + 1];
                    int var284 = field6770[field6780 + 2];
                    class461.method2566(9, var284, "", -115, var282 << 16 | var283);
                    return;
                }
                if (arg0 == 6716) {
                    field6780 -= 3;
                    int var285 = field6770[field6780];
                    int var286 = field6770[field6780 + 1];
                    int var287 = field6770[field6780 + 2];
                    class461.method2566(10, var287, "", -126, var285 << 16 | var286);
                    return;
                }
                if (arg0 == 6717) {
                    field6780 -= 3;
                    int var288 = field6770[field6780];
                    int var289 = field6770[field6780 + 1];
                    int var290 = field6770[field6780 + 2];
                    class218 var291 = class408.method2359((byte) 72, var288 << 16 | var289, var290);
                    class96.method661((byte) 117);
                    class703 var292 = client.method1835(var291);
                    class572.method3215(var292.field9872, var291, var292.method3967(-1), -6838);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field6770[--field6780];
                    class292 var294 = class224.field2894.method1647(-114, var293);
                    if (var294.field3901 == null) {
                        field6778[field6779++] = "";
                        return;
                    }
                    field6778[field6779++] = var294.field3901;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field6770[--field6780];
                    class292 var296 = class224.field2894.method1647(106, var295);
                    field6770[field6780++] = var296.field3879;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field6770[--field6780];
                    class292 var298 = class224.field2894.method1647(-54, var297);
                    field6770[field6780++] = var298.field3902;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field6770[--field6780];
                    class292 var300 = class224.field2894.method1647(-47, var299);
                    field6770[field6780++] = var300.field3880;
                    return;
                }
                if (arg0 == 6804) {
                    field6780 -= 2;
                    int var301 = field6770[field6780];
                    int var302 = field6770[field6780 + 1];
                    class135 var303 = class482.field6654.method296((byte) 31, var302);
                    if (var303.method843(false)) {
                        field6778[field6779++] = class224.field2894.method1647(105, var301).method1741(-5911, var303.field1719, var302);
                        return;
                    }
                    field6770[field6780++] = class224.field2894.method1647(122, var301).method1737(48, var302, var303.field1718);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field6770[field6780++] = class581.field8146 && !class75.field906 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field6770[field6780++] = class128.field1670;
                    return;
                }
                if (arg0 == 6902) {
                    field6770[field6780++] = class388.field5476;
                    return;
                }
                if (arg0 == 6903) {
                    field6770[field6780++] = class424.field5959;
                    return;
                }
                if (arg0 == 6904) {
                    field6770[field6780++] = class394.field5581;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class631.field8778 != null) {
                        if (class631.field8778.field1418 == null) {
                            var304 = class565.method3183(class631.field8778.field1422, (byte) -63);
                        } else {
                            var304 = (String) class631.field8778.field1418;
                        }
                    }
                    field6778[field6779++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field6770[field6780++] = class465.field6443;
                    return;
                }
                if (arg0 == 6907) {
                    field6770[field6780++] = class392.field5558;
                    return;
                }
                if (arg0 == 6908) {
                    field6770[field6780++] = class352.field4706;
                    return;
                }
                if (arg0 == 6909) {
                    field6770[field6780++] = class257.field3341 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field6770[field6780++] = class756.field10559;
                    return;
                }
                if (arg0 == 6911) {
                    field6770[field6780++] = class287.field3826;
                    return;
                }
                if (arg0 == 6912) {
                    field6770[field6780++] = class641.field8924;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class543.method3085((byte) -106);
                    field6770[field6780++] = class507.field6873 = class11.field68.field5503.method741((byte) 120);
                    field6770[field6780++] = var305;
                    class243.method1461((byte) 122);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class391.method2275(1);
                    class243.method1461((byte) -27);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class677.method3848((byte) 19);
                    class243.method1461((byte) 113);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class354.method2048((byte) 27);
                    class243.method1461((byte) -126);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class753.method4190(-100, true);
                    class243.method1461((byte) -10);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class11.field68.method2276((byte) -13, 0, class11.field68.field5511);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class507.field6873 == 2) {
                        class759.field10580 = true;
                        return;
                    }
                    if (class507.field6873 == 1) {
                        class4.field35 = true;
                        return;
                    }
                    if (class507.field6873 == 3) {
                        class364.field4813 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field6770[field6780++] = class11.field68.field5511.method1961((byte) 123);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field6780 -= 2;
                    int var306 = field6770[field6780];
                    int var307 = field6770[field6780 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class22.method86(-29680, var307, false, var306);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field6770[--field6780];
                    if (var308 != -1) {
                        class103.method708((byte) 67, var308);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field6770[--field6780];
                    if (var309 != -1) {
                        class101.method694(256, var309);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field6770[field6780++] = class101.method697("jagtheora", 0) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field6770[field6780++] = class11.field68.field5498.method4056(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field6770[field6780++] = class11.field68.field5494.method192(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field6770[field6780++] = class11.field68.field5545.method63(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field6770[field6780++] = class11.field68.field5534.method1061(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field6770[field6780++] = class11.field68.field5505.method1957(-1) && class21.field142.method456() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field6770[field6780++] = class11.field68.field5492.method1493(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field6770[field6780++] = class11.field68.field5508.method2667(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field6770[field6780++] = class11.field68.field5536.method2258(-1) && class21.field142.method376() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field6770[field6780++] = class11.field68.field5499.method251(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field6770[field6780++] = class11.field68.field5521.method3359(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field6770[field6780++] = class11.field68.field5501.method2404(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field6770[field6780++] = class11.field68.field5512.method811(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field6770[field6780++] = class11.field68.field5543.method1143(-1) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field6770[field6780++] = class11.field68.field5530.method745(-1) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5498.method57(var310, 29053);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5494.method57(var311, 29053);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5545.method57(var312, 29053);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5534.method57(var313, 29053);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field6770[--field6780];
                    if (!class21.field142.method456()) {
                        field6770[field6780++] = 3;
                        return;
                    }
                    field6770[field6780++] = class11.field68.field5505.method57(var314, 29053);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5492.method57(var315, 29053);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5508.method57(var316, 29053);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field6770[--field6780];
                    if (!class21.field142.method376()) {
                        field6770[field6780++] = 3;
                        return;
                    }
                    field6770[field6780++] = class11.field68.field5536.method57(var317, 29053);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5499.method57(var318, 29053);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5521.method57(var319, 29053);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5501.method57(var320, 29053);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5512.method57(var321, 29053);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5543.method57(var322, 29053);
                    return;
                }
                if (arg0 == 7314) {
                    int var323 = field6770[--field6780];
                    field6770[field6780++] = class11.field68.field5530.method57(var323, 29053);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
