import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class142 {

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "[I")
    private static int[] field1770 = new int[1000];

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "[J")
    private static long[] field1772 = new long[1000];

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "[I")
    private static int[] field1777 = new int[5];

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    private static int field1785 = 0;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field1786 = new String[1000];

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "[I")
    private static int[] field1788 = new int[3];

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "[Ltga;")
    private static class64[] field1794 = new class64[50];

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "I")
    private static int field1795 = 0;

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "[[I")
    private static int[][] field1796 = new int[5][5000];

    @OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
    private static int field1797 = 0;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
    private static int field1798 = 0;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "Ltja;")
    public static class288 field1780 = new class288(4);

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
    private static int field1800 = 0;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "Lwt;")
    private static class330 field1778;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Loga;")
    private static class500 field1769;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Lkq;")
    private static class620 field1776;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "Lkq;")
    private static class620 field1791;

    @OriginalMember(owner = "client!hw", name = "E", descriptor = "Leb;")
    private static class653 field1799;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "[I")
    private static int[] field1783;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "[J")
    private static long[] field1784;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field1792;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lis;I)V", line = 5)
    private static final void method1029(class529 arg0, int arg1) {
        Object[] var2 = arg0.field7477;
        int var3 = (Integer) var2[0];
        class760 var4 = class372.method2180(var3, -82);
        if (var4 == null) {
            return;
        }
        field1783 = new int[var4.field10506];
        int var5 = 0;
        field1792 = new String[var4.field10507];
        int var6 = 0;
        field1784 = new long[var4.field10505];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field7475;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field7469;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field7473 == null ? -1 : arg0.field7473.field8515;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field7479;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field7473 == null ? -1 : arg0.field7473.field8445;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field7472 == null ? -1 : arg0.field7472.field8515;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field7472 == null ? -1 : arg0.field7472.field8445;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field7471;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field7478;
                }
                field1783[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field7476;
                }
                field1792[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field1784[var7++] = var11;
            }
        }
        field1800 = arg0.field7481;
        method1033(var4, arg1);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 108)
    private static final void method1030(int arg0) {
        class620 var1 = class479.method2848(arg0, (byte) 118);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class620[] var3 = class642.field8762[var2];
        if (var3 == null) {
            class620[] var4 = class316.field3880[var2];
            int var5 = var4.length;
            var3 = class642.field8762[var2] = new class620[var5];
            class211.method1335(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class211.method1335(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)I", line = 152)
    private static final int method1031(int arg0) {
        class253 var1 = class204.field2444.method3556((byte) 95, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field1769.method2952(true, class672.field9229.field5926 << 16 | arg0);
        if (var2 == null) {
            return var1.field2952 == 'i' || var1.field2952 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V", line = 182)
    public static final void method1032(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lbo;I)V", line = 187)
    private static final void method1033(class760 arg0, int arg1) {
        field1785 = 0;
        field1798 = 0;
        int var2 = -1;
        int[] var3 = arg0.field10504;
        int[] var4 = arg0.field10516;
        byte var5 = -1;
        field1795 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method1042(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method1034(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field1770[field1785++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field1770[field1785++] = class2.field30.field8010[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class2.field30.method3376(field1770[--field1785], var8, 384);
                } else if (var45 == 3) {
                    field1786[field1798++] = arg0.field10502[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field1785 -= 2;
                    if (field1770[field1785 + 1] != field1770[field1785]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field1785 -= 2;
                    if (field1770[field1785 + 1] == field1770[field1785]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field1785 -= 2;
                    if (field1770[field1785] < field1770[field1785 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field1785 -= 2;
                    if (field1770[field1785] > field1770[field1785 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field1795 == 0) {
                        return;
                    }
                    class64 var9 = field1794[--field1795];
                    arg0 = var9.field876;
                    var3 = arg0.field10504;
                    var4 = arg0.field10516;
                    var2 = var9.field873;
                    field1783 = var9.field872;
                    field1792 = var9.field874;
                    field1784 = var9.field877;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field1770[field1785++] = class2.field30.method336(var10, (byte) -96);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class2.field30.method3383(field1770[--field1785], var11, 0);
                } else if (var45 == 31) {
                    field1785 -= 2;
                    if (field1770[field1785] <= field1770[field1785 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field1785 -= 2;
                    if (field1770[field1785] >= field1770[field1785 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field1770[field1785++] = field1783[var4[var2]];
                } else if (var45 == 34) {
                    field1783[var4[var2]] = field1770[--field1785];
                } else if (var45 == 35) {
                    field1786[field1798++] = field1792[var4[var2]];
                } else if (var45 == 36) {
                    field1792[var4[var2]] = field1786[--field1798];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field1798 -= var12;
                    String var13 = class152.method1090(field1798, -2, var12, field1786);
                    field1786[field1798++] = var13;
                } else if (var45 == 38) {
                    field1785--;
                } else if (var45 == 39) {
                    field1798--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class760 var15 = class372.method2180(var14, -125);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field10506];
                    String[] var17 = new String[var15.field10507];
                    long[] var18 = new long[var15.field10505];
                    for (int var19 = 0; var19 < var15.field10509; var19++) {
                        var16[var19] = field1770[field1785 + var19 - var15.field10509];
                    }
                    for (int var20 = 0; var20 < var15.field10514; var20++) {
                        var17[var20] = field1786[field1798 + var20 - var15.field10514];
                    }
                    for (int var21 = 0; var21 < var15.field10512; var21++) {
                        var18[var21] = field1772[field1797 + var21 - var15.field10512];
                    }
                    field1785 -= var15.field10509;
                    field1798 -= var15.field10514;
                    field1797 -= var15.field10512;
                    class64 var22 = new class64();
                    var22.field876 = arg0;
                    var22.field873 = var2;
                    var22.field872 = field1783;
                    var22.field874 = field1792;
                    var22.field877 = field1784;
                    if (field1795 >= field1794.length) {
                        throw new RuntimeException();
                    }
                    field1794[field1795++] = var22;
                    arg0 = var15;
                    var3 = var15.field10504;
                    var4 = var15.field10516;
                    var2 = -1;
                    field1783 = var16;
                    field1792 = var17;
                    field1784 = var18;
                } else if (var45 == 42) {
                    field1770[field1785++] = class480.field6716[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class480.field6716[var23] = field1770[--field1785];
                    class504.method3023(-118, var23);
                    class485.field6770 |= class307.field3801[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field1770[--field1785];
                    if (var26 >= 0 && var26 <= 5000) {
                        field1777[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field1796[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field1770[--field1785];
                    if (var30 < 0 || var30 >= field1777[var29]) {
                        throw new RuntimeException();
                    }
                    field1770[field1785++] = field1796[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field1785 -= 2;
                    int var32 = field1770[field1785];
                    if (var32 < 0 || var32 >= field1777[var31]) {
                        throw new RuntimeException();
                    }
                    field1796[var31][var32] = field1770[field1785 + 1];
                } else if (var45 == 47) {
                    String var33 = class733.field10244[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field1786[field1798++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class733.field10244[var34] = field1786[--field1798];
                    class753.method4206(var34, false);
                } else if (var45 == 51) {
                    class362 var35 = arg0.field10510[var4[var2]];
                    class365 var36 = (class365) var35.method2121(62, (long) field1770[--field1785]);
                    if (var36 != null) {
                        var2 += var36.field4537;
                    }
                } else if (var45 == 54) {
                    field1772[field1797++] = arg0.field10508[var2];
                } else if (var45 == 55) {
                    field1797--;
                } else if (var45 == 66) {
                    field1772[field1797++] = field1784[var4[var2]];
                } else if (var45 == 67) {
                    field1784[var4[var2]] = field1772[--field1797];
                } else if (var45 == 68) {
                    field1797 -= 2;
                    if (field1772[field1797 + 1] != field1772[field1797]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field1797 -= 2;
                    if (field1772[field1797 + 1] == field1772[field1797]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field1797 -= 2;
                    if (field1772[field1797] < field1772[field1797 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field1797 -= 2;
                    if (field1772[field1797] > field1772[field1797 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field1797 -= 2;
                    if (field1772[field1797] <= field1772[field1797 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field1797 -= 2;
                    if (field1772[field1797] >= field1772[field1797 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field1770[--field1785] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field1770[--field1785] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field1770[field1785++] = method1031(var4[var2]);
                } else if (var45 == 113) {
                    field1770[field1785++] = method1039(var4[var2]);
                } else if (var45 == 114) {
                    field1772[field1797++] = method1044(var4[var2]);
                } else if (var45 == 115) {
                    field1786[field1798++] = method1035(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field10513 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field4809).append(" ");
                for (int var43 = field1795 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field1794[var43].field876.field4809).append(" ");
                }
                var42.append("op: ").append(var5);
                class705.method4008(var44, var42.toString(), -125);
            } else {
                class619.method3512("Clientscript error in: " + arg0.field10513, 4, false);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field10513).append("\n");
                for (int var40 = field1795 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field1794[var40].field876.field10513).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class705.method4008(var44, var39.toString(), -123);
                class793.method4374(0, var39.toString());
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(IZ)V", line = 749)
    private static final void method1034(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1770[field1785++] = class8.field136;
                return;
            }
            if (arg0 == 5001) {
                field1785 -= 3;
                class8.field136 = field1770[field1785];
                class309.field3846 = class324.method1930(field1770[field1785 + 1], -1537);
                if (class309.field3846 == null) {
                    class309.field3846 = class111.field1404;
                }
                class131.field1619 = field1770[field1785 + 2];
                field1781++;
                class336 var2 = class512.method3076(class526.field7428, class591.field8030, (byte) 62);
                var2.field4150.method2353(-120, class8.field136);
                var2.field4150.method2353(-77, class309.field3846.field4593);
                var2.field4150.method2353(-116, class131.field1619);
                class578.method3334(4, var2);
                return;
            }
            if (arg0 == 5002) {
                field1798 -= 2;
                String var3 = field1786[field1798];
                String var4 = field1786[field1798 + 1];
                field1785 -= 2;
                int var5 = field1770[field1785];
                int var6 = field1770[field1785 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field1787++;
                class336 var7 = class512.method3076(class471.field6573, class591.field8030, (byte) 94);
                var7.field4150.method2353(69, class615.method3482(var3, 1) + class615.method3482(var4, 1) + 2);
                var7.field4150.method2388(255, var3);
                var7.field4150.method2353(77, var5 - 1);
                var7.field4150.method2353(106, var6);
                var7.field4150.method2388(255, var4);
                class578.method3334(4, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field1770[--field1785];
                class239 var9 = class43.method351(0, var8);
                String var10 = "";
                if (var9 != null && var9.field2810 != null) {
                    var10 = var9.field2810;
                }
                field1786[field1798++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field1770[--field1785];
                class239 var12 = class43.method351(0, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field2806;
                }
                field1770[field1785++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class309.field3846 == null) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = class309.field3846.field4593;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field1770[--field1785];
                class336 var15 = class512.method3076(class190.field2280, class591.field8030, (byte) 79);
                var15.field4150.method2353(-101, var14);
                class578.method3334(4, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field1786[--field1798];
                method1036(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1798 -= 2;
                String var17 = field1786[field1798];
                String var18 = field1786[field1798 + 1];
                if (class637.field8741 != 0 || (!class730.field10234 || class633.field8636) && !class257.field3052) {
                    field1793++;
                    class336 var19 = class512.method3076(class455.field6411, class591.field8030, (byte) 99);
                    var19.field4150.method2353(-79, 0);
                    int var20 = var19.field4150.field5262;
                    var19.field4150.method2388(255, var17);
                    class123.method959((byte) -55, var19.field4150, var18);
                    var19.field4150.method2366(-1, var19.field4150.field5262 - var20);
                    class578.method3334(4, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field1770[--field1785];
                class239 var22 = class43.method351(0, var21);
                String var23 = "";
                if (var22 != null && var22.field2804 != null) {
                    var23 = var22.field2804;
                }
                field1786[field1798++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field1770[--field1785];
                class239 var25 = class43.method351(0, var24);
                String var26 = "";
                if (var25 != null && var25.field2802 != null) {
                    var26 = var25.field2802;
                }
                field1786[field1798++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field1770[--field1785];
                class239 var28 = class43.method351(0, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field2808;
                }
                field1770[field1785++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class300.field3596 == null || class300.field3596.field7395 == null) {
                    var30 = "";
                } else {
                    var30 = class300.field3596.method3123(true, true);
                }
                field1786[field1798++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field1770[field1785++] = class131.field1619;
                return;
            }
            if (arg0 == 5017) {
                field1770[field1785++] = class558.method3253(-122);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field1770[--field1785];
                class239 var32 = class43.method351(0, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field2811;
                }
                field1770[field1785++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field1770[--field1785];
                class239 var35 = class43.method351(0, var34);
                String var36 = "";
                if (var35 != null && var35.field2807 != null) {
                    var36 = var35.field2807;
                }
                field1786[field1798++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class300.field3596 == null || class300.field3596.field7395 == null) {
                    var37 = "";
                } else {
                    var37 = class300.field3596.method3122(1119, false);
                }
                field1786[field1798++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field1770[--field1785];
                class239 var39 = class43.method351(0, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field2813;
                }
                field1770[field1785++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field1770[--field1785];
                class239 var42 = class43.method351(0, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field2814;
                }
                field1770[field1785++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field1770[--field1785];
                class239 var45 = class43.method351(0, var44);
                String var46 = "";
                if (var45 != null && var45.field2815 != null) {
                    var46 = var45.field2815;
                }
                field1786[field1798++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field1770[--field1785];
                field1786[field1798++] = class776.field10716.method2757(var47, (byte) -46).field2967;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field1770[--field1785];
                class254 var49 = class776.field10716.method2757(var48, (byte) -46);
                if (var49.field2961 == null) {
                    field1770[field1785++] = 0;
                    return;
                }
                field1770[field1785++] = var49.field2961.length;
                return;
            }
            if (arg0 == 5052) {
                field1785 -= 2;
                int var50 = field1770[field1785];
                int var51 = field1770[field1785 + 1];
                class254 var52 = class776.field10716.method2757(var50, (byte) -46);
                int var53 = var52.field2961[var51];
                field1770[field1785++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field1770[--field1785];
                class254 var55 = class776.field10716.method2757(var54, (byte) -46);
                if (var55.field2964 == null) {
                    field1770[field1785++] = 0;
                    return;
                }
                field1770[field1785++] = var55.field2964.length;
                return;
            }
            if (arg0 == 5054) {
                field1785 -= 2;
                int var56 = field1770[field1785];
                int var57 = field1770[field1785 + 1];
                field1770[field1785++] = class776.field10716.method2757(var56, (byte) -46).field2964[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field1770[--field1785];
                field1786[field1798++] = class578.field7881.method972(var58, 1).method3763(8211);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field1770[--field1785];
                class671 var60 = class578.field7881.method972(var59, 1);
                if (var60.field9209 == null) {
                    field1770[field1785++] = 0;
                    return;
                }
                field1770[field1785++] = var60.field9209.length;
                return;
            }
            if (arg0 == 5057) {
                field1785 -= 2;
                int var61 = field1770[field1785];
                int var62 = field1770[field1785 + 1];
                field1770[field1785++] = class578.field7881.method972(var61, 1).field9209[var62];
                return;
            }
            if (arg0 == 5058) {
                field1799 = new class653();
                field1799.field9014 = field1770[--field1785];
                field1799.field9012 = class578.field7881.method972(field1799.field9014, 1);
                field1799.field9013 = new int[field1799.field9012.method3762(0)];
                return;
            }
            if (arg0 == 5059) {
                field1789++;
                class336 var63 = class512.method3076(class517.field7276, class591.field8030, (byte) 108);
                var63.field4150.method2353(-93, 0);
                int var64 = var63.field4150.field5262;
                var63.field4150.method2353(-74, 0);
                var63.field4150.method2369(-18090, field1799.field9014);
                field1799.field9012.method3772(field1799.field9013, var63.field4150, 89);
                var63.field4150.method2366(-1, var63.field4150.field5262 - var64);
                class578.method3334(4, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field1786[--field1798];
                field1771++;
                class336 var66 = class512.method3076(class262.field3120, class591.field8030, (byte) 110);
                var66.field4150.method2353(58, 0);
                int var67 = var66.field4150.field5262;
                var66.field4150.method2388(255, var65);
                var66.field4150.method2369(-18090, field1799.field9014);
                field1799.field9012.method3772(field1799.field9013, var66.field4150, 82);
                var66.field4150.method2366(-1, var66.field4150.field5262 - var67);
                class578.method3334(4, var66);
                return;
            }
            if (arg0 == 5061) {
                field1789++;
                class336 var68 = class512.method3076(class517.field7276, class591.field8030, (byte) 124);
                var68.field4150.method2353(84, 0);
                int var69 = var68.field4150.field5262;
                var68.field4150.method2353(99, 1);
                var68.field4150.method2369(-18090, field1799.field9014);
                field1799.field9012.method3772(field1799.field9013, var68.field4150, 18);
                var68.field4150.method2366(-1, var68.field4150.field5262 - var69);
                class578.method3334(4, var68);
                return;
            }
            if (arg0 == 5062) {
                field1785 -= 2;
                int var70 = field1770[field1785];
                int var71 = field1770[field1785 + 1];
                field1770[field1785++] = class776.field10716.method2757(var70, (byte) -46).field2973[var71];
                return;
            }
            if (arg0 == 5063) {
                field1785 -= 2;
                int var72 = field1770[field1785];
                int var73 = field1770[field1785 + 1];
                field1770[field1785++] = class776.field10716.method2757(var72, (byte) -46).field2960[var73];
                return;
            }
            if (arg0 == 5064) {
                field1785 -= 2;
                int var74 = field1770[field1785];
                int var75 = field1770[field1785 + 1];
                if (var75 == -1) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = class776.field10716.method2757(var74, (byte) -46).method1509((char) var75, false);
                return;
            }
            if (arg0 == 5065) {
                field1785 -= 2;
                int var76 = field1770[field1785];
                int var77 = field1770[field1785 + 1];
                if (var77 == -1) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = class776.field10716.method2757(var76, (byte) -46).method1510(-1, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field1770[--field1785];
                field1770[field1785++] = class578.field7881.method972(var78, 1).method3762(0);
                return;
            }
            if (arg0 == 5067) {
                field1785 -= 2;
                int var79 = field1770[field1785];
                int var80 = field1770[field1785 + 1];
                int var81 = class578.field7881.method972(var79, 1).method3768(-21079, var80).field526;
                field1770[field1785++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field1785 -= 2;
                int var82 = field1770[field1785];
                int var83 = field1770[field1785 + 1];
                field1799.field9013[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field1785 -= 2;
                int var84 = field1770[field1785];
                int var85 = field1770[field1785 + 1];
                field1799.field9013[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field1785 -= 3;
                int var86 = field1770[field1785];
                int var87 = field1770[field1785 + 1];
                int var88 = field1770[field1785 + 2];
                class671 var89 = class578.field7881.method972(var86, 1);
                if (var89.method3768(-21079, var87).field526 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1770[field1785++] = var89.method3773(var87, var88, 8217);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field1786[--field1798];
                boolean var91 = field1770[--field1785] == 1;
                class216.method1350(-117, var91, var90);
                field1770[field1785++] = class689.field9390;
                return;
            }
            if (arg0 == 5072) {
                if (class734.field10262 != null && class267.field3159 < class689.field9390) {
                    field1770[field1785++] = class734.field10262[class267.field3159++] & 0xFFFF;
                    return;
                }
                field1770[field1785++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class267.field3159 = 0;
                return;
            }
            if (arg0 == 5074) {
                class336 var92 = class512.method3076(class517.field7276, class591.field8030, (byte) 62);
                var92.field4150.method2353(-93, 0);
                int var93 = var92.field4150.field5262;
                var92.field4150.method2353(-67, 2);
                var92.field4150.method2369(-18090, field1799.field9014);
                field1799.field9012.method3772(field1799.field9013, var92.field4150, 88);
                var92.field4150.method2366(-1, var92.field4150.field5262 - var93);
                class578.method3334(4, var92);
                return;
            }
            if (arg0 == 5075) {
                class336 var94 = class512.method3076(class517.field7276, class591.field8030, (byte) 78);
                var94.field4150.method2353(-106, 0);
                int var95 = var94.field4150.field5262;
                var94.field4150.method2353(81, 3);
                var94.field4150.method2369(-18090, field1799.field9014);
                field1799.field9012.method3772(field1799.field9013, var94.field4150, 119);
                var94.field4150.method2366(-1, var94.field4150.field5262 - var95);
                class578.method3334(4, var94);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class348.field4350.method216(-105, 86)) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class348.field4350.method216(-125, 82)) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class348.field4350.method216(-84, 81)) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class287.method1673(-34, field1770[--field1785]);
                return;
            }
            if (arg0 == 5201) {
                field1770[field1785++] = class65.method551(-27095);
                return;
            }
            if (arg0 == 5205) {
                class456.method2763(-1, true, field1770[--field1785], -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field1770[--field1785];
                class257 var97 = class9.method167(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = var97.field3044;
                return;
            }
            if (arg0 == 5207) {
                class257 var98 = class9.method153(field1770[--field1785]);
                if (var98 != null && var98.field3039 != null) {
                    field1786[field1798++] = var98.field3039;
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1770[field1785++] = class47.field627;
                field1770[field1785++] = class336.field4157;
                return;
            }
            if (arg0 == 5209) {
                field1770[field1785++] = class9.field176 + class580.field7912;
                field1770[field1785++] = class9.field178 + class62.field850;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field1770[--field1785];
                class257 var100 = class9.method153(var99);
                if (var100 == null) {
                    field1770[field1785++] = 0;
                    field1770[field1785++] = 0;
                    return;
                }
                field1770[field1785++] = var100.field3033 >> 14 & 0x3FFF;
                field1770[field1785++] = var100.field3033 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field1770[--field1785];
                class257 var102 = class9.method153(var101);
                if (var102 == null) {
                    field1770[field1785++] = 0;
                    field1770[field1785++] = 0;
                    return;
                }
                field1770[field1785++] = var102.field3036 - var102.field3040;
                field1770[field1785++] = var102.field3053 - var102.field3045;
                return;
            }
            if (arg0 == 5212) {
                class625 var103 = class26.method259((byte) -74);
                if (var103 == null) {
                    field1770[field1785++] = -1;
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = var103.field8567;
                int var104 = var103.field8568 << 28 | class9.field176 + var103.field8574 << 14 | class9.field178 + var103.field8572;
                field1770[field1785++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class625 var105 = class581.method3347(true);
                if (var105 == null) {
                    field1770[field1785++] = -1;
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = var105.field8567;
                int var106 = var105.field8568 << 28 | class9.field176 + var105.field8574 << 14 | class9.field178 + var105.field8572;
                field1770[field1785++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field1770[--field1785];
                class257 var108 = class473.method2823(111);
                if (var108 != null) {
                    boolean var109 = var108.method1545(var107 >> 14 & 0x3FFF, var107 & 0x3FFF, -114, var107 >> 28 & 0x3, field1788);
                    if (var109) {
                        class665.method3732(field1788[2], -4, field1788[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1785 -= 2;
                int var110 = field1770[field1785];
                int var111 = field1770[field1785 + 1];
                class136 var112 = class9.method150(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class257 var114 = (class257) var112.method1003((byte) 53); var114 != null; var114 = (class257) var112.method1004(true)) {
                    if (var114.field3044 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field1770[--field1785];
                class257 var116 = class9.method153(var115);
                if (var116 == null) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = var116.field3037;
                return;
            }
            if (arg0 == 5220) {
                field1770[field1785++] = class121.field1557 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field1770[--field1785];
                class665.method3732(var117 & 0x3FFF, -4, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class257 var118 = class473.method2823(8);
                if (var118 != null) {
                    boolean var119 = var118.method1546(true, class9.field178 + class62.field850, class9.field176 + class580.field7912, field1788);
                    if (var119) {
                        field1770[field1785++] = field1788[1];
                        field1770[field1785++] = field1788[2];
                        return;
                    }
                    field1770[field1785++] = -1;
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = -1;
                field1770[field1785++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1785 -= 2;
                int var120 = field1770[field1785];
                int var121 = field1770[field1785 + 1];
                class456.method2763(var121 >> 14 & 0x3FFF, true, var120, var121 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field1770[--field1785];
                class257 var123 = class473.method2823(126);
                if (var123 != null) {
                    boolean var124 = var123.method1545(var122 >> 14 & 0x3FFF, var122 & 0x3FFF, -122, var122 >> 28 & 0x3, field1788);
                    if (var124) {
                        field1770[field1785++] = field1788[1];
                        field1770[field1785++] = field1788[2];
                        return;
                    }
                    field1770[field1785++] = -1;
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = -1;
                field1770[field1785++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field1770[--field1785];
                class257 var126 = class473.method2823(-105);
                if (var126 != null) {
                    boolean var127 = var126.method1546(true, var125 & 0x3FFF, var125 >> 14 & 0x3FFF, field1788);
                    if (var127) {
                        field1770[field1785++] = field1788[1];
                        field1770[field1785++] = field1788[2];
                        return;
                    }
                    field1770[field1785++] = -1;
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = -1;
                field1770[field1785++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class411.method2455(field1770[--field1785], (byte) 88);
                return;
            }
            if (arg0 == 5227) {
                field1785 -= 2;
                int var128 = field1770[field1785];
                int var129 = field1770[field1785 + 1];
                class456.method2763(var129 >> 14 & 0x3FFF, true, var128, var129 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class90.field1196 = field1770[--field1785] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1770[field1785++] = class90.field1196 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field1770[--field1785];
                class613.method3468((byte) -112, var130);
                return;
            }
            if (arg0 == 5231) {
                field1785 -= 2;
                int var131 = field1770[field1785];
                boolean var132 = field1770[field1785 + 1] == 1;
                if (class749.field10399 != null) {
                    class379 var133 = class749.field10399.method2121(123, (long) var131);
                    if (var133 != null && !var132) {
                        var133.method2219(13630);
                        return;
                    }
                    if (var133 == null && var132) {
                        class379 var134 = new class379();
                        class749.field10399.method2112(var134, (byte) 6, (long) var131);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field1770[--field1785];
                if (class749.field10399 != null) {
                    class379 var136 = class749.field10399.method2121(109, (long) var135);
                    field1770[field1785++] = var136 == null ? 0 : 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1785 -= 2;
                int var137 = field1770[field1785];
                boolean var138 = field1770[field1785 + 1] == 1;
                if (class569.field7805 != null) {
                    class379 var139 = class569.field7805.method2121(92, (long) var137);
                    if (var139 != null && !var138) {
                        var139.method2219(13630);
                        return;
                    }
                    if (var139 == null && var138) {
                        class379 var140 = new class379();
                        class569.field7805.method2112(var140, (byte) 6, (long) var137);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field1770[--field1785];
                if (class569.field7805 != null) {
                    class379 var142 = class569.field7805.method2121(101, (long) var141);
                    field1770[field1785++] = var142 == null ? 0 : 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1770[field1785++] = class9.field140 == null ? -1 : class9.field140.field3044;
                return;
            }
            if (arg0 == 5236) {
                field1785 -= 2;
                int var143 = field1770[field1785];
                int var144 = field1770[field1785 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class641.method3592(var146, var143, var145, (byte) -74);
                if (var147 < 0) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class604.method3441(-69);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1785 -= 2;
                int var148 = field1770[field1785];
                int var149 = field1770[field1785 + 1];
                class121.method947(3, var149, var148, 1, false);
                field1770[field1785++] = class260.field3075 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class260.field3075 != null) {
                    class121.method947(class118.field1503.field10674.method3823(0), -1, -1, 1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class540[] var150 = class695.method3873((byte) -67);
                field1770[field1785++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field1770[--field1785];
                class540[] var152 = class695.method3873((byte) -67);
                field1770[field1785++] = var152[var151].field7593;
                field1770[field1785++] = var152[var151].field7597;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class390.field5041;
                int var154 = class596.field8092;
                int var155 = -1;
                class540[] var156 = class695.method3873((byte) -67);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class540 var158 = var156[var157];
                    if (var158.field7593 == var153 && var158.field7597 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field1770[field1785++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field1770[field1785++] = class397.method2331(3);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field1770[--field1785];
                if (var159 >= 1 && var159 <= 2) {
                    class121.method947(var159, -1, -1, 1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1770[field1785++] = class118.field1503.field10674.method3823(0);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field1770[--field1785];
                if (var160 >= 1 && var160 <= 2) {
                    class118.field1503.method4295(class118.field1503.field10674, var160, false);
                    class118.field1503.method4295(class118.field1503.field10630, var160, false);
                    class14.method194(true);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1798 -= 2;
                String var161 = field1786[field1798];
                String var162 = field1786[field1798 + 1];
                int var163 = field1770[--field1785];
                field1779++;
                class336 var164 = class512.method3076(class445.field5964, class591.field8030, (byte) 80);
                var164.field4150.method2353(-109, class615.method3482(var161, 1) + class615.method3482(var162, 1) + 1);
                var164.field4150.method2388(255, var161);
                var164.field4150.method2388(255, var162);
                var164.field4150.method2353(58, var163);
                class578.method3334(4, var164);
                return;
            }
            if (arg0 == 5401) {
                field1785 -= 2;
                client.field3921[field1770[field1785]] = (short) class171.method1166(field1770[field1785 + 1], -12805);
                class121.field1555.method2888(-1);
                class121.field1555.method2884(0);
                class444.field5956.method1066(false);
                class41.method341(-87);
                return;
            }
            if (arg0 == 5405) {
                field1785 -= 2;
                int var165 = field1770[field1785];
                int var166 = field1770[field1785 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class750.field10402[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1785 -= 7;
                int var167 = field1770[field1785];
                int var168 = field1770[field1785 + 1] << 1;
                int var169 = field1770[field1785 + 2];
                int var170 = field1770[field1785 + 3];
                int var171 = field1770[field1785 + 4];
                int var172 = field1770[field1785 + 5];
                int var173 = field1770[field1785 + 6];
                if (var167 >= 0 && var167 < 2 && class750.field10402[var167] != null && var168 >= 0 && var168 < class750.field10402[var167].length) {
                    class750.field10402[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class750.field10402[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class750.field10402[field1770[--field1785]].length >> 1;
                field1770[field1785++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class260.field3075 != null) {
                    class121.method947(class118.field1503.field10674.method3823(0), -1, -1, 1, false);
                }
                if (class645.field8790 != null) {
                    class786.method4352(true);
                    System.exit(0);
                    return;
                }
                String var175 = class198.field2366 == null ? class296.method1734(110) : class198.field2366;
                class784.method4344(-64, class521.field7389, var175, false, class118.field1503.field10665.method1903(0) == 1);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class500.field6989 != null) {
                    if (class500.field6989.field7768 == null) {
                        var176 = class359.method2100(class500.field6989.field7767, 97);
                    } else {
                        var176 = (String) class500.field6989.field7768;
                    }
                }
                field1786[field1798++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field1770[field1785++] = class521.field7389.field9271 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class260.field3075 != null) {
                    class121.method947(class118.field1503.field10674.method3823(0), -1, -1, 1, false);
                }
                String var177 = field1786[--field1798];
                boolean var178 = field1770[--field1785] == 1;
                String var179 = class296.method1734(103) + var177;
                class784.method4344(-119, class521.field7389, var179, var178, class118.field1503.field10665.method1903(0) == 1);
                return;
            }
            if (arg0 == 5422) {
                field1798 -= 2;
                String var180 = field1786[field1798];
                String var181 = field1786[field1798 + 1];
                int var182 = field1770[--field1785];
                if (var180.length() > 0) {
                    if (class416.field5440 == null) {
                        class416.field5440 = new String[class624.field8558[class672.field9229.field5926]];
                    }
                    class416.field5440[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class39.field568 == null) {
                        class39.field568 = new String[class624.field8558[class672.field9229.field5926]];
                    }
                    class39.field568[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1786[--field1798]);
                return;
            }
            if (arg0 == 5424) {
                field1785 -= 11;
                class789.field10870 = field1770[field1785];
                class770.field10591 = field1770[field1785 + 1];
                class757.field10489 = field1770[field1785 + 2];
                class43.field595 = field1770[field1785 + 3];
                class254.field2971 = field1770[field1785 + 4];
                class711.field9971 = field1770[field1785 + 5];
                class784.field10833 = field1770[field1785 + 6];
                class342.field4297 = field1770[field1785 + 7];
                class699.field9509 = field1770[field1785 + 8];
                class219.field2575 = field1770[field1785 + 9];
                class137.field1723 = field1770[field1785 + 10];
                class208.field2470.method433((byte) -92, class254.field2971);
                class208.field2470.method433((byte) -74, class711.field9971);
                class208.field2470.method433((byte) -112, class784.field10833);
                class208.field2470.method433((byte) -89, class342.field4297);
                class208.field2470.method433((byte) -114, class699.field9509);
                class662.field9090 = null;
                class648.field8843 = null;
                class86.field1148 = null;
                class662.field9084 = null;
                class589.field8014 = null;
                class56.field764 = null;
                class787.field10857 = null;
                class522.field7403 = null;
                class35.field536 = true;
                return;
            }
            if (arg0 == 5425) {
                class783.method4339((byte) 119);
                class35.field536 = false;
                return;
            }
            if (arg0 == 5426) {
                field1785 -= 2;
                class481.field6720 = field1770[field1785];
                class170.field2043 = field1770[field1785 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1785 -= 2;
                class500.field7016 = field1770[field1785 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1785 -= 2;
                int var183 = field1770[field1785];
                int var184 = field1770[field1785 + 1];
                field1770[field1785++] = class432.method2559((byte) 92, var183, var184) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class433.method2566(false, -68, false, field1786[--field1798]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class745.method4171("accountcreated", class345.field4331, (byte) 72);
                    return;
                } catch (Throwable var336) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class745.method4171("accountcreatestarted", class345.field4331, (byte) 119);
                    return;
                } catch (Throwable var337) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class215.field2536 != null) {
                    Transferable var186 = class215.field2536.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var338) {
                        }
                    }
                }
                field1786[field1798++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class498.field6968 = field1770[--field1785];
                return;
            }
            if (arg0 == 5435) {
                field1770[field1785++] = class171.field2050 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1785 -= 4;
                int var187 = field1770[field1785];
                int var188 = field1770[field1785 + 1];
                int var189 = field1770[field1785 + 2];
                int var190 = field1770[field1785 + 3];
                class347.method2062(var189, var190, var188 << 2, (var187 & 0x3FFF) - class620.field8435, 125, false, (var187 >> 14 & 0x3FFF) - class632.field8626);
                return;
            }
            if (arg0 == 5501) {
                field1785 -= 4;
                int var191 = field1770[field1785];
                int var192 = field1770[field1785 + 1];
                int var193 = field1770[field1785 + 2];
                int var194 = field1770[field1785 + 3];
                class672.method3777(127, var194, (var191 >> 14 & 0x3FFF) - class632.field8626, var193, (var191 & 0x3FFF) - class620.field8435, var192 << 2);
                return;
            }
            if (arg0 == 5502) {
                field1785 -= 6;
                int var195 = field1770[field1785];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                client.field3934 = var195;
                int var196 = field1770[field1785 + 1];
                if (var196 + 1 >= class750.field10402[client.field3934].length >> 1) {
                    throw new RuntimeException();
                }
                class519.field7325 = var196;
                class666.field9158 = 0;
                class186.field2250 = field1770[field1785 + 2];
                class243.field2874 = field1770[field1785 + 3];
                int var197 = field1770[field1785 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class267.field3160 = var197;
                int var198 = field1770[field1785 + 5];
                if (var198 + 1 >= class750.field10402[class267.field3160].length >> 1) {
                    throw new RuntimeException();
                }
                class633.field8641 = var198;
                class7.field100 = 3;
                class719.field10094 = -1;
                class131.field1617 = -1;
                return;
            }
            if (arg0 == 5503) {
                class17.method217(111);
                return;
            }
            if (arg0 == 5504) {
                field1785 -= 2;
                class596.method3411(0, field1770[field1785], field1770[field1785 + 1], -15208);
                return;
            }
            if (arg0 == 5505) {
                field1770[field1785++] = (int) class229.field2718 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1770[field1785++] = (int) class47.field626 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class707.method4014((byte) 97);
                return;
            }
            if (arg0 == 5508) {
                class603.method3437(16);
                return;
            }
            if (arg0 == 5509) {
                class267.method1585((byte) 76);
                return;
            }
            if (arg0 == 5510) {
                class369.method2152(8);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field1770[--field1785];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class632.field8626;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class596.field8090) {
                    var202 = class596.field8090;
                }
                int var203 = var201 - class620.field8435;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class107.field1350) {
                    var203 = class107.field1350;
                }
                class467.field6528 = (var202 << 9) + 256;
                class93.field1229 = (var203 << 9) + 256;
                class7.field100 = 4;
                class719.field10094 = -1;
                class131.field1617 = -1;
                return;
            }
            if (arg0 == 5512) {
                class223.method1373((byte) 59);
                return;
            }
            if (arg0 == 5514) {
                class621.field8527 = field1770[--field1785];
                return;
            }
            if (arg0 == 5516) {
                field1770[field1785++] = class621.field8527;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field1770[--field1785];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class632.field8626;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class596.field8090) {
                        var207 = class596.field8090;
                    }
                    int var208 = var206 - class620.field8435;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class107.field1350) {
                        var208 = class107.field1350;
                    }
                    class131.field1617 = (var207 << 9) + 256;
                    class719.field10094 = (var208 << 9) + 256;
                    return;
                }
                class131.field1617 = -1;
                class719.field10094 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1798 -= 2;
                String var209 = field1786[field1798];
                String var210 = field1786[field1798 + 1];
                int var211 = field1770[--field1785];
                class297.method1738(var210, 320, var211, var209);
                return;
            }
            if (arg0 == 5601) {
                class159.method1118(false);
                return;
            }
            if (arg0 == 5602) {
                if (!class46.method414(-22723)) {
                    class396.method2326(92);
                }
                return;
            }
            if (arg0 == 5604) {
                field1798--;
                if (class289.field3493 != 3) {
                    return;
                }
                if (!class46.method414(-22723) && class5.field53 == 0) {
                    class325.method1931((byte) 124, field1786[field1798]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1798 -= 2;
                field1785 -= 2;
                if (class289.field3493 != 3) {
                    return;
                }
                if (!class46.method414(-22723) && class5.field53 == 0) {
                    class392.method2300(field1786[field1798], field1786[field1798 + 1], (byte) 115, field1770[field1785], field1770[field1785 + 1] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class5.field53 == 0) {
                    class26.field414 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1770[field1785++] = class324.field4023;
                return;
            }
            if (arg0 == 5608) {
                field1770[field1785++] = class25.field372;
                return;
            }
            if (arg0 == 5609) {
                field1770[field1785++] = class26.field414;
                return;
            }
            if (arg0 == 5611) {
                field1770[field1785++] = class233.field2779;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field1770[--field1785];
                class562.method3263(96, var212);
                return;
            }
            if (arg0 == 5613) {
                field1770[field1785++] = class324.field4023;
                return;
            }
            if (arg0 == 5615) {
                field1798 -= 2;
                String var213 = field1786[field1798];
                String var214 = field1786[field1798 + 1];
                class161.method1129((byte) -55, var214, var213);
                return;
            }
            if (arg0 == 5616) {
                class268.method1590(12, false);
                return;
            }
            if (arg0 == 5617) {
                field1770[field1785++] = class343.field4302;
                return;
            }
            if (arg0 == 5618) {
                field1785--;
                return;
            }
            if (arg0 == 5619) {
                field1785--;
                return;
            }
            if (arg0 == 5620) {
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field1798 -= 2;
                field1785 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class31.field491 != null) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field1770[field1785++] = (int) (class171.field2051 >> 32);
                field1770[field1785++] = (int) (class171.field2051 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field1770[field1785++] = class650.field8959 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class650.field8959 = true;
                class224.method1382(-3476);
                return;
            }
            if (arg0 == 5628) {
                field1770[field1785++] = class46.method414(-22723) ? 1 : 0;
                return;
            }
            if (arg0 == 5630) {
                class613.method3475((byte) 20);
                return;
            }
            if (arg0 == 5631) {
                field1785 -= 2;
                int var215 = field1770[field1785];
                int var216 = field1770[field1785 + 1];
                class140.method1021(var215, 22303, var216);
                return;
            }
            if (arg0 == 5632) {
                int var217 = field1770[--field1785];
                class164.method1143(43, var217);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var218 = field1770[--field1785];
                class118.field1503.method4295(class118.field1503.field10655, var218, false);
                class520.method3115(true);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var219 = field1770[--field1785] == 1;
                class118.field1503.method4295(class118.field1503.field10676, var219 ? 1 : 0, false);
                class118.field1503.method4295(class118.field1503.field10632, var219 ? 1 : 0, false);
                class520.method3115(true);
                class615.method3483((byte) -51);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var220 = field1770[--field1785] == 1;
                class118.field1503.method4295(class118.field1503.field10652, var220 ? 2 : 1, false);
                class118.field1503.method4295(class118.field1503.field10650, var220 ? 2 : 1, false);
                class615.method3483((byte) -51);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6005) {
                class118.field1503.method4295(class118.field1503.field10649, field1770[--field1785] == 1 ? 1 : 0, false);
                class520.method3115(true);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6007) {
                class118.field1503.method4295(class118.field1503.field10659, field1770[--field1785], false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6008) {
                class118.field1503.method4295(class118.field1503.field10660, field1770[--field1785] == 1 ? 1 : 0, false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6010) {
                class118.field1503.method4295(class118.field1503.field10664, field1770[--field1785] == 1 ? 1 : 0, false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6011) {
                class118.field1503.method4295(class118.field1503.field10672, field1770[--field1785], false);
                class520.method3115(true);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6012) {
                class118.field1503.method4295(class118.field1503.field10628, field1770[--field1785] == 1 ? 1 : 0, false);
                class725.method4110((byte) 114);
                class185.method1233(-24497);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6014) {
                class118.field1503.method4295(class118.field1503.field10675, field1770[--field1785] == 1 ? 2 : 0, false);
                class520.method3115(true);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6015) {
                class118.field1503.method4295(class118.field1503.field10657, field1770[--field1785] == 1 ? 1 : 0, false);
                class520.method3115(true);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6016) {
                class118.field1503.method4295(class118.field1503.field10648, field1770[--field1785], false);
                class677.method3810(true, class118.field1503.field10665.method1903(0), false);
                class14.method194(true);
                return;
            }
            if (arg0 == 6017) {
                class118.field1503.method4295(class118.field1503.field10633, field1770[--field1785] == 1 ? 1 : 0, false);
                class317.method1871(90);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6018) {
                class118.field1503.method4295(class118.field1503.field10666, field1770[--field1785], false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field1770[--field1785];
                int var222 = class118.field1503.field10668.method1581(0);
                if (var221 != var222) {
                    if (class17.method211(class289.field3493, -25658)) {
                        if (var222 == 0 && class36.field542 != -1) {
                            class227.method1391(class599.field8106, 0, (byte) -110, var221, false, class36.field542);
                            class133.method991(124);
                            class52.field712 = false;
                        } else if (var221 == 0) {
                            class60.method516((byte) 124);
                            class52.field712 = false;
                        } else {
                            class267.method1584(var221, 0);
                        }
                    }
                    class118.field1503.method4295(class118.field1503.field10668, var221, false);
                    class14.method194(true);
                    class319.field3945 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class118.field1503.method4295(class118.field1503.field10661, field1770[--field1785], false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6021) {
                int var223 = class118.field1503.field10652.method1600(0);
                class118.field1503.method4295(class118.field1503.field10650, field1770[--field1785] == 1 ? 0 : var223, false);
                class615.method3483((byte) -51);
                return;
            }
            if (arg0 == 6023) {
                int var224 = field1770[--field1785];
                class118.field1503.method4295(class118.field1503.field10643, var224, false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6024) {
                class118.field1503.method4295(class118.field1503.field10631, field1770[--field1785], false);
                class14.method194(true);
                return;
            }
            if (arg0 == 6025) {
                class118.field1503.method4295(class118.field1503.field10658, field1770[--field1785], false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6027) {
                int var225 = field1770[--field1785];
                if (var225 < 0 || var225 > 1) {
                    var225 = 0;
                }
                class580.method3342((byte) -108, var225 == 1);
                return;
            }
            if (arg0 == 6028) {
                class118.field1503.method4295(class118.field1503.field10670, field1770[--field1785] == 0 ? 0 : 1, false);
                class14.method194(true);
                return;
            }
            if (arg0 == 6029) {
                class118.field1503.method4295(class118.field1503.field10659, field1770[--field1785], false);
                class14.method194(true);
                return;
            }
            if (arg0 == 6030) {
                class118.field1503.method4295(class118.field1503.field10677, field1770[--field1785] == 0 ? 0 : 1, false);
                class14.method194(true);
                class520.method3115(true);
                return;
            }
            if (arg0 == 6031) {
                int var226 = field1770[--field1785];
                if (var226 < 0 || var226 > 5) {
                    var226 = 2;
                }
                class677.method3810(true, var226, false);
                return;
            }
            if (arg0 == 6032) {
                field1785 -= 2;
                int var227 = field1770[field1785];
                boolean var228 = field1770[field1785 + 1] == 1;
                class118.field1503.method4295(class118.field1503.field10653, var227, false);
                if (!var228) {
                    class118.field1503.method4295(class118.field1503.field10647, 0, false);
                }
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6033) {
                class118.field1503.method4295(class118.field1503.field10638, field1770[--field1785], false);
                class14.method194(true);
                return;
            }
            if (arg0 == 6034) {
                class118.field1503.method4295(class118.field1503.field10641, field1770[--field1785] == 1 ? 1 : 0, false);
                class14.method194(true);
                class725.method4110((byte) 114);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6035) {
                int var229 = class118.field1503.field10676.method3881(0);
                class118.field1503.method4295(class118.field1503.field10632, field1770[--field1785] == 1 ? 1 : var229, false);
                class520.method3115(true);
                class615.method3483((byte) -51);
                return;
            }
            if (arg0 == 6036) {
                class118.field1503.method4295(class118.field1503.field10639, field1770[--field1785], false);
                class14.method194(true);
                class723.field10141 = true;
                return;
            }
            if (arg0 == 6037) {
                class118.field1503.method4295(class118.field1503.field10637, field1770[--field1785], false);
                class14.method194(true);
                class319.field3945 = false;
                return;
            }
            if (arg0 == 6038) {
                int var230 = field1770[--field1785];
                int var231 = class118.field1503.field10651.method1581(0);
                if (var230 != var231 && class500.field6981 == class36.field542) {
                    if (!class17.method211(class289.field3493, -25658)) {
                        if (var231 == 0) {
                            class227.method1391(class599.field8106, 0, (byte) -106, var230, false, class36.field542);
                            class133.method991(92);
                            class52.field712 = false;
                        } else if (var230 == 0) {
                            class60.method516((byte) 124);
                            class52.field712 = false;
                        } else {
                            class267.method1584(var230, 0);
                        }
                    }
                    class118.field1503.method4295(class118.field1503.field10651, var230, false);
                    class14.method194(true);
                    class319.field3945 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var232 = field1770[--field1785];
                if (var232 > 255 || var232 < 0) {
                    var232 = 0;
                }
                if (var232 != class118.field1503.field10627.method3656(0)) {
                    class118.field1503.method4295(class118.field1503.field10627, var232, false);
                    class14.method194(true);
                    class319.field3945 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var233 = field1770[--field1785];
                if (var233 != class118.field1503.field10673.method2087(0)) {
                    class118.field1503.method4295(class118.field1503.field10673, var233, false);
                    class14.method194(true);
                    class319.field3945 = false;
                    class438.method2584(13827);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1770[field1785++] = class118.field1503.field10655.method3783(0);
                return;
            }
            if (arg0 == 6102) {
                field1770[field1785++] = class118.field1503.field10676.method3881(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1770[field1785++] = class118.field1503.field10652.method1600(0) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1770[field1785++] = class118.field1503.field10649.method3707(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1770[field1785++] = class118.field1503.field10659.method4298(0);
                return;
            }
            if (arg0 == 6108) {
                field1770[field1785++] = class118.field1503.field10660.method479(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1770[field1785++] = class118.field1503.field10664.method3189(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1770[field1785++] = class118.field1503.field10672.method4113(0);
                return;
            }
            if (arg0 == 6112) {
                field1770[field1785++] = class118.field1503.field10628.method1580(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1770[field1785++] = class118.field1503.field10675.method4155(0) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1770[field1785++] = class118.field1503.field10657.method3370(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1770[field1785++] = class118.field1503.field10648.method2427(0);
                return;
            }
            if (arg0 == 6117) {
                field1770[field1785++] = class118.field1503.field10633.method3227(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1770[field1785++] = class118.field1503.field10666.method1581(0);
                return;
            }
            if (arg0 == 6119) {
                field1770[field1785++] = class118.field1503.field10668.method1581(0);
                return;
            }
            if (arg0 == 6120) {
                field1770[field1785++] = class118.field1503.field10661.method1581(0);
                return;
            }
            if (arg0 == 6123) {
                field1770[field1785++] = class27.method262(10);
                return;
            }
            if (arg0 == 6124) {
                field1770[field1785++] = class118.field1503.field10631.method2427(0);
                return;
            }
            if (arg0 == 6125) {
                field1770[field1785++] = class118.field1503.field10658.method1368(0);
                return;
            }
            if (arg0 == 6127) {
                field1770[field1785++] = class118.field1503.field10667.method408(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1770[field1785++] = class118.field1503.field10670.method3721(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1770[field1785++] = class118.field1503.field10659.method4298(0);
                return;
            }
            if (arg0 == 6130) {
                field1770[field1785++] = class118.field1503.field10677.method3451(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1770[field1785++] = class118.field1503.field10665.method1903(0);
                return;
            }
            if (arg0 == 6132) {
                field1770[field1785++] = class118.field1503.field10653.method1903(0);
                return;
            }
            if (arg0 == 6133) {
                field1770[field1785++] = class521.field7389.field9271 && !class521.field7389.field9260 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field1770[field1785++] = class118.field1503.field10638.method3837(0);
                return;
            }
            if (arg0 == 6136) {
                field1770[field1785++] = class118.field1503.field10641.method1572(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field1770[field1785++] = class138.method1011(200, class118.field1503.field10665.method1903(0), -128);
                return;
            }
            if (arg0 == 6139) {
                field1770[field1785++] = class118.field1503.field10639.method1290(0);
                return;
            }
            if (arg0 == 6142) {
                field1770[field1785++] = class118.field1503.field10637.method1581(0);
                return;
            }
            if (arg0 == 6143) {
                field1770[field1785++] = class118.field1503.field10651.method1581(0);
                return;
            }
            if (arg0 == 6144) {
                field1770[field1785++] = class251.field2946 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field1770[field1785++] = class118.field1503.field10627.method3656(0);
                return;
            }
            if (arg0 == 6146) {
                field1770[field1785++] = class118.field1503.field10673.method2087(0);
                return;
            }
            if (arg0 == 6147) {
                field1770[field1785++] = class174.field2151.field1067 < 512 || class251.field2946 || class301.field3603 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field1770[field1785++] = class148.field1842 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1785 -= 2;
                class632.field8630 = (short) field1770[field1785];
                if (class632.field8630 <= 0) {
                    class632.field8630 = 256;
                }
                class22.field354 = (short) field1770[field1785 + 1];
                if (class22.field354 <= 0) {
                    class22.field354 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1785 -= 2;
                class722.field10135 = (short) field1770[field1785];
                if (class722.field10135 <= 0) {
                    class722.field10135 = 256;
                }
                class380.field4821 = (short) field1770[field1785 + 1];
                if (class380.field4821 <= 0) {
                    class380.field4821 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1785 -= 4;
                class48.field685 = (short) field1770[field1785];
                if (class48.field685 <= 0) {
                    class48.field685 = 1;
                }
                class573.field7858 = (short) field1770[field1785 + 1];
                if (class573.field7858 <= 0) {
                    class573.field7858 = 32767;
                } else if (class573.field7858 < class48.field685) {
                    class573.field7858 = class48.field685;
                }
                class497.field6955 = (short) field1770[field1785 + 2];
                if (class497.field6955 <= 0) {
                    class497.field6955 = 1;
                }
                class62.field847 = (short) field1770[field1785 + 3];
                if (class62.field847 <= 0) {
                    class62.field847 = 32767;
                    return;
                }
                if (class62.field847 < class497.field6955) {
                    class62.field847 = class497.field6955;
                }
                return;
            }
            if (arg0 == 6203) {
                class121.method944(class81.field1103.field8416, 0, false, 0, class81.field1103.field8506, false);
                field1770[field1785++] = class152.field1895;
                field1770[field1785++] = class480.field6713;
                return;
            }
            if (arg0 == 6204) {
                field1770[field1785++] = class722.field10135;
                field1770[field1785++] = class380.field4821;
                return;
            }
            if (arg0 == 6205) {
                field1770[field1785++] = class632.field8630;
                field1770[field1785++] = class22.field354;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1770[field1785++] = (int) (class349.method2069(true) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1770[field1785++] = (int) (class349.method2069(true) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1785 -= 3;
                int var234 = field1770[field1785];
                int var235 = field1770[field1785 + 1];
                int var236 = field1770[field1785 + 2];
                long var237 = class409.method2448(0, var234, var236, var235, 0, (byte) -112, 12);
                int var239 = class133.method989((byte) 102, var237);
                if (var236 < 1970) {
                    var239--;
                }
                field1770[field1785++] = var239;
                return;
            }
            if (arg0 == 6303) {
                field1770[field1785++] = class682.method3830(false, class349.method2069(true));
                return;
            }
            if (arg0 == 6304) {
                int var240 = field1770[--field1785];
                boolean var241 = true;
                if (var240 < 0) {
                    var241 = (var240 + 1) % 4 == 0;
                } else if (var240 < 1582) {
                    var241 = var240 % 4 == 0;
                } else if (var240 % 4 != 0) {
                    var241 = false;
                } else if (var240 % 100 != 0) {
                    var241 = true;
                } else if (var240 % 400 != 0) {
                    var241 = false;
                }
                field1770[field1785++] = var241 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var242 = field1770[--field1785];
                int[] var243 = class788.method4356(var242, 2);
                class211.method1332(var243, 0, field1770, field1785, 3);
                field1785 += 3;
                return;
            }
            if (arg0 == 6306) {
                int var244 = field1770[--field1785];
                field1770[field1785++] = (int) (class753.method4207(var244, 9144) / 60000L);
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1770[field1785++] = class478.method2839(false) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1770[field1785++] = class249.method1495((byte) -126) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class289.field3493 == 7 && !class46.method414(-22723) && class5.field53 == 0) {
                    if (class221.field2579) {
                        field1770[field1785++] = 0;
                        return;
                    }
                    if (class239.field2805 > class349.method2069(true) - 1000L) {
                        field1770[field1785++] = 1;
                        return;
                    }
                    class221.field2579 = true;
                    class336 var245 = class512.method3076(class751.field10422, class591.field8030, (byte) 91);
                    var245.field4150.method2391(-101, class205.field2452);
                    class578.method3334(4, var245);
                    field1770[field1785++] = 0;
                    return;
                }
                field1770[field1785++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class631 var246 = class174.method1191((byte) -62);
                if (var246 != null) {
                    field1770[field1785++] = var246.field8622;
                    field1770[field1785++] = var246.field1125;
                    field1786[field1798++] = var246.field8620;
                    class565 var247 = var246.method3567(3);
                    field1770[field1785++] = var247.field7793;
                    field1786[field1798++] = var247.field7794;
                    field1770[field1785++] = var246.field1122;
                    field1770[field1785++] = var246.field8618;
                    field1786[field1798++] = var246.field8619;
                    return;
                }
                field1770[field1785++] = -1;
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                field1770[field1785++] = 0;
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 6502) {
                class631 var248 = class326.method1943((byte) 126);
                if (var248 != null) {
                    field1770[field1785++] = var248.field8622;
                    field1770[field1785++] = var248.field1125;
                    field1786[field1798++] = var248.field8620;
                    class565 var249 = var248.method3567(3);
                    field1770[field1785++] = var249.field7793;
                    field1786[field1798++] = var249.field7794;
                    field1770[field1785++] = var248.field1122;
                    field1770[field1785++] = var248.field8618;
                    field1786[field1798++] = var248.field8619;
                    return;
                }
                field1770[field1785++] = -1;
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                field1770[field1785++] = 0;
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var250 = field1770[--field1785];
                String var251 = field1786[--field1798];
                if (class289.field3493 == 7 && !class46.method414(-22723) && class5.field53 == 0) {
                    field1770[field1785++] = class243.method1466(var250, (byte) 89, var251) ? 1 : 0;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var252 = field1770[--field1785];
                class631 var253 = class419.method2504(var252, 4014);
                if (var253 != null) {
                    field1770[field1785++] = var253.field1125;
                    field1786[field1798++] = var253.field8620;
                    class565 var254 = var253.method3567(3);
                    field1770[field1785++] = var254.field7793;
                    field1786[field1798++] = var254.field7794;
                    field1770[field1785++] = var253.field1122;
                    field1770[field1785++] = var253.field8618;
                    field1786[field1798++] = var253.field8619;
                    return;
                }
                field1770[field1785++] = -1;
                field1786[field1798++] = "";
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                field1770[field1785++] = 0;
                field1770[field1785++] = 0;
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 6507) {
                field1785 -= 4;
                int var255 = field1770[field1785];
                boolean var256 = field1770[field1785 + 1] == 1;
                int var257 = field1770[field1785 + 2];
                boolean var258 = field1770[field1785 + 3] == 1;
                class473.method2826(var256, (byte) -93, var255, var258, var257);
                return;
            }
            if (arg0 == 6508) {
                class546.method3215(114);
                return;
            }
            if (arg0 == 6509) {
                if (class289.field3493 != 7) {
                    return;
                }
                class421.field5616 = field1770[--field1785] == 1;
                return;
            }
            if (arg0 == 6510) {
                field1770[field1785++] = class444.field5951;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class576.field7867 == class190.field2282) {
                if (arg0 == 6700) {
                    int var259 = class728.field10205.method2117(true);
                    if (class131.field1615 != -1) {
                        var259++;
                    }
                    field1770[field1785++] = var259;
                    return;
                }
                if (arg0 == 6701) {
                    int var260 = field1770[--field1785];
                    if (class131.field1615 != -1) {
                        if (var260 == 0) {
                            field1770[field1785++] = class131.field1615;
                            return;
                        }
                        var260--;
                    }
                    class52 var261 = (class52) class728.field10205.method2119(-113);
                    while (var260-- > 0) {
                        var261 = (class52) class728.field10205.method2111((byte) 119);
                    }
                    field1770[field1785++] = var261.field713;
                    return;
                }
                if (arg0 == 6702) {
                    int var262 = field1770[--field1785];
                    if (class316.field3880[var262] == null) {
                        field1786[field1798++] = "";
                        return;
                    }
                    String var263 = class316.field3880[var262][0].field8488;
                    if (var263 == null) {
                        field1786[field1798++] = "";
                        return;
                    }
                    field1786[field1798++] = var263.substring(0, var263.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var264 = field1770[--field1785];
                    if (class316.field3880[var264] == null) {
                        field1770[field1785++] = 0;
                        return;
                    }
                    field1770[field1785++] = class316.field3880[var264].length;
                    return;
                }
                if (arg0 == 6704) {
                    field1785 -= 2;
                    int var265 = field1770[field1785];
                    int var266 = field1770[field1785 + 1];
                    if (class316.field3880[var265] == null) {
                        field1786[field1798++] = "";
                        return;
                    }
                    String var267 = class316.field3880[var265][var266].field8488;
                    if (var267 == null) {
                        field1786[field1798++] = "";
                        return;
                    }
                    field1786[field1798++] = var267;
                    return;
                }
                if (arg0 == 6705) {
                    field1785 -= 2;
                    int var268 = field1770[field1785];
                    int var269 = field1770[field1785 + 1];
                    if (class316.field3880[var268] == null) {
                        field1770[field1785++] = 0;
                        return;
                    }
                    field1770[field1785++] = class316.field3880[var268][var269].field8450;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field1785 -= 3;
                    int var270 = field1770[field1785];
                    int var271 = field1770[field1785 + 1];
                    int var272 = field1770[field1785 + 2];
                    class576.method3331(-8, var272, var270 << 16 | var271, "", 1);
                    return;
                }
                if (arg0 == 6708) {
                    field1785 -= 3;
                    int var273 = field1770[field1785];
                    int var274 = field1770[field1785 + 1];
                    int var275 = field1770[field1785 + 2];
                    class576.method3331(-8, var275, var273 << 16 | var274, "", 2);
                    return;
                }
                if (arg0 == 6709) {
                    field1785 -= 3;
                    int var276 = field1770[field1785];
                    int var277 = field1770[field1785 + 1];
                    int var278 = field1770[field1785 + 2];
                    class576.method3331(-8, var278, var276 << 16 | var277, "", 3);
                    return;
                }
                if (arg0 == 6710) {
                    field1785 -= 3;
                    int var279 = field1770[field1785];
                    int var280 = field1770[field1785 + 1];
                    int var281 = field1770[field1785 + 2];
                    class576.method3331(-8, var281, var279 << 16 | var280, "", 4);
                    return;
                }
                if (arg0 == 6711) {
                    field1785 -= 3;
                    int var282 = field1770[field1785];
                    int var283 = field1770[field1785 + 1];
                    int var284 = field1770[field1785 + 2];
                    class576.method3331(-8, var284, var282 << 16 | var283, "", 5);
                    return;
                }
                if (arg0 == 6712) {
                    field1785 -= 3;
                    int var285 = field1770[field1785];
                    int var286 = field1770[field1785 + 1];
                    int var287 = field1770[field1785 + 2];
                    class576.method3331(-8, var287, var285 << 16 | var286, "", 6);
                    return;
                }
                if (arg0 == 6713) {
                    field1785 -= 3;
                    int var288 = field1770[field1785];
                    int var289 = field1770[field1785 + 1];
                    int var290 = field1770[field1785 + 2];
                    class576.method3331(-8, var290, var288 << 16 | var289, "", 7);
                    return;
                }
                if (arg0 == 6714) {
                    field1785 -= 3;
                    int var291 = field1770[field1785];
                    int var292 = field1770[field1785 + 1];
                    int var293 = field1770[field1785 + 2];
                    class576.method3331(-8, var293, var291 << 16 | var292, "", 8);
                    return;
                }
                if (arg0 == 6715) {
                    field1785 -= 3;
                    int var294 = field1770[field1785];
                    int var295 = field1770[field1785 + 1];
                    int var296 = field1770[field1785 + 2];
                    class576.method3331(-8, var296, var294 << 16 | var295, "", 9);
                    return;
                }
                if (arg0 == 6716) {
                    field1785 -= 3;
                    int var297 = field1770[field1785];
                    int var298 = field1770[field1785 + 1];
                    int var299 = field1770[field1785 + 2];
                    class576.method3331(-8, var299, var297 << 16 | var298, "", 10);
                    return;
                }
                if (arg0 == 6717) {
                    field1785 -= 3;
                    int var300 = field1770[field1785];
                    int var301 = field1770[field1785 + 1];
                    int var302 = field1770[field1785 + 2];
                    class620 var303 = class481.method2859(var302, var300 << 16 | var301, 16383);
                    class118.method926(-67);
                    class396 var304 = client.method1882(var303);
                    class541.method3204(1, var304.field5125, var304.method2321(-57), var303);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var305 = field1770[--field1785];
                    class305 var306 = class2.field33.method4140(36, var305);
                    if (var306.field3641 == null) {
                        field1786[field1798++] = "";
                        return;
                    }
                    field1786[field1798++] = var306.field3641;
                    return;
                }
                if (arg0 == 6801) {
                    int var307 = field1770[--field1785];
                    class305 var308 = class2.field33.method4140(36, var307);
                    field1770[field1785++] = var308.field3666;
                    return;
                }
                if (arg0 == 6802) {
                    int var309 = field1770[--field1785];
                    class305 var310 = class2.field33.method4140(36, var309);
                    field1770[field1785++] = var310.field3676;
                    return;
                }
                if (arg0 == 6803) {
                    int var311 = field1770[--field1785];
                    class305 var312 = class2.field33.method4140(36, var311);
                    field1770[field1785++] = var312.field3657;
                    return;
                }
                if (arg0 == 6804) {
                    field1785 -= 2;
                    int var313 = field1770[field1785];
                    int var314 = field1770[field1785 + 1];
                    class613 var315 = class113.field1426.method4366(true, var314);
                    if (var315.method3472((byte) -123)) {
                        field1786[field1798++] = class2.field33.method4140(36, var313).method1772(var315.field8234, (byte) 2, var314);
                        return;
                    }
                    field1770[field1785++] = class2.field33.method4140(36, var313).method1771(var314, var315.field8244, (byte) -127);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field1770[field1785++] = class730.field10234 && !class633.field8636 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field1770[field1785++] = (int) (class191.field2287 / 60000L);
                    field1770[field1785++] = (int) ((class191.field2287 - class349.method2069(true) - class613.field8246) / 60000L);
                    field1770[field1785++] = class299.field3579 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field1770[field1785++] = class785.field10837;
                    return;
                }
                if (arg0 == 6903) {
                    field1770[field1785++] = class73.field1009;
                    return;
                }
                if (arg0 == 6904) {
                    field1770[field1785++] = class26.field417;
                    return;
                }
                if (arg0 == 6905) {
                    String var316 = "";
                    if (class500.field6989 != null) {
                        if (class500.field6989.field7768 == null) {
                            var316 = class359.method2100(class500.field6989.field7767, 100);
                        } else {
                            var316 = (String) class500.field6989.field7768;
                        }
                    }
                    field1786[field1798++] = var316;
                    return;
                }
                if (arg0 == 6906) {
                    field1770[field1785++] = class756.field10476;
                    return;
                }
                if (arg0 == 6907) {
                    field1770[field1785++] = class326.field4045;
                    return;
                }
                if (arg0 == 6908) {
                    field1770[field1785++] = class676.field9283;
                    return;
                }
                if (arg0 == 6909) {
                    field1770[field1785++] = class471.field6574 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field1770[field1785++] = class41.field578;
                    return;
                }
                if (arg0 == 6911) {
                    field1770[field1785++] = class89.field1193;
                    return;
                }
                if (arg0 == 6912) {
                    field1770[field1785++] = class17.field328;
                    return;
                }
                if (arg0 == 6913) {
                    field1770[field1785++] = class608.field8177;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var317 = class55.method486(-21201);
                    field1770[field1785++] = class216.field2542 = class118.field1503.field10665.method1903(0);
                    field1770[field1785++] = var317;
                    class520.method3115(true);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class108.method875(28007);
                    class520.method3115(true);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class576.method3329(-10);
                    class520.method3115(true);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class490.method2898(0);
                    class520.method3115(true);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class368.method2142(-23156, true);
                    class520.method3115(true);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class118.field1503.method4295(class118.field1503.field10647, 0, false);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class216.field2542 == 2) {
                        class705.field9915 = true;
                        return;
                    }
                    if (class216.field2542 == 1) {
                        class522.field7408 = true;
                        return;
                    }
                    if (class216.field2542 == 3) {
                        class500.field7015 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field1770[field1785++] = class118.field1503.field10647.method3543(0);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field1785 -= 2;
                    int var318 = field1770[field1785];
                    int var319 = field1770[field1785 + 1];
                    if (var318 != -1) {
                        if (var319 > 255) {
                            var319 = 255;
                        } else if (var319 < 0) {
                            var319 = 0;
                        }
                        class413.method2460((byte) -71, var318, false, var319);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var320 = field1770[--field1785];
                    if (var320 != -1) {
                        class652.method3684(true, var320);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var321 = field1770[--field1785];
                    if (var321 != -1) {
                        class533.method3173(var321, 25540);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field1770[field1785++] = class641.method3594("jagtheora", -2) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field1770[field1785++] = class118.field1503.field10649.method3706((byte) -95) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field1770[field1785++] = class118.field1503.field10664.method3186((byte) -92) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field1770[field1785++] = class118.field1503.field10672.method4118((byte) -128) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field1770[field1785++] = class118.field1503.field10675.method4156((byte) -120) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field1770[field1785++] = class118.field1503.field10631.method2425((byte) -112) && class363.field4526.method612() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field1770[field1785++] = class118.field1503.field10643.method2581((byte) -86) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field1770[field1785++] = class118.field1503.field10658.method1370((byte) -82) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field1770[field1785++] = class118.field1503.field10667.method410((byte) -110) && class363.field4526.method603() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field1770[field1785++] = class118.field1503.field10677.method3452((byte) -64) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field1770[field1785++] = class118.field1503.field10641.method1573((byte) -89) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field1770[field1785++] = class118.field1503.field10639.method1289((byte) -98) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field1770[field1785++] = class118.field1503.field10657.method3369((byte) -88) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field1770[field1785++] = class118.field1503.field10673.method2084((byte) -106) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field1770[field1785++] = class118.field1503.field10653.method1908((byte) -125) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var322 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10649.method406(0, var322);
                    return;
                }
                if (arg0 == 7302) {
                    int var323 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10664.method406(0, var323);
                    return;
                }
                if (arg0 == 7303) {
                    int var324 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10672.method406(0, var324);
                    return;
                }
                if (arg0 == 7304) {
                    int var325 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10675.method406(0, var325);
                    return;
                }
                if (arg0 == 7305) {
                    int var326 = field1770[--field1785];
                    if (!class363.field4526.method612()) {
                        field1770[field1785++] = 3;
                        return;
                    }
                    field1770[field1785++] = class118.field1503.field10631.method406(0, var326);
                    return;
                }
                if (arg0 == 7306) {
                    int var327 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10643.method406(0, var327);
                    return;
                }
                if (arg0 == 7307) {
                    int var328 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10658.method406(0, var328);
                    return;
                }
                if (arg0 == 7308) {
                    int var329 = field1770[--field1785];
                    if (!class363.field4526.method603()) {
                        field1770[field1785++] = 3;
                        return;
                    }
                    field1770[field1785++] = class118.field1503.field10667.method406(0, var329);
                    return;
                }
                if (arg0 == 7309) {
                    int var330 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10677.method406(0, var330);
                    return;
                }
                if (arg0 == 7310) {
                    int var331 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10641.method406(0, var331);
                    return;
                }
                if (arg0 == 7311) {
                    int var332 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10639.method406(0, var332);
                    return;
                }
                if (arg0 == 7312) {
                    int var333 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10657.method406(0, var333);
                    return;
                }
                if (arg0 == 7313) {
                    int var334 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10673.method406(0, var334);
                    return;
                }
                if (arg0 == 7314) {
                    int var335 = field1770[--field1785];
                    field1770[field1785++] = class118.field1503.field10653.method406(0, var335);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)Ljava/lang/String;", line = 4527)
    private static final String method1035(int arg0) {
        String var1 = field1769.method2959(class672.field9229.field5926 << 16 | arg0, -1);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4534)
    private static final void method1036(String arg0, int arg1) {
        if (class637.field8741 == 0 && !(!class730.field10234 || class633.field8636) || class257.field3052) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class637.field8722.method3584(0, true))) {
            var3 = 0;
            arg0 = arg0.substring(class637.field8722.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8723.method3584(0, true))) {
            var3 = 1;
            arg0 = arg0.substring(class637.field8723.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8724.method3584(0, true))) {
            var3 = 2;
            arg0 = arg0.substring(class637.field8724.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8725.method3584(0, true))) {
            var3 = 3;
            arg0 = arg0.substring(class637.field8725.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8726.method3584(0, true))) {
            var3 = 4;
            arg0 = arg0.substring(class637.field8726.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8727.method3584(0, true))) {
            var3 = 5;
            arg0 = arg0.substring(class637.field8727.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8728.method3584(0, true))) {
            var3 = 6;
            arg0 = arg0.substring(class637.field8728.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8729.method3584(0, true))) {
            var3 = 7;
            arg0 = arg0.substring(class637.field8729.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8730.method3584(0, true))) {
            var3 = 8;
            arg0 = arg0.substring(class637.field8730.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8731.method3584(0, true))) {
            var3 = 9;
            arg0 = arg0.substring(class637.field8731.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8732.method3584(0, true))) {
            var3 = 10;
            arg0 = arg0.substring(class637.field8732.method3584(0, true).length());
        } else if (var2.startsWith(class637.field8733.method3584(0, true))) {
            var3 = 11;
            arg0 = arg0.substring(class637.field8733.method3584(0, true).length());
        } else if (class770.field10592 != 0) {
            if (var2.startsWith(class637.field8722.method3584(class770.field10592, true))) {
                var3 = 0;
                arg0 = arg0.substring(class637.field8722.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8723.method3584(class770.field10592, true))) {
                var3 = 1;
                arg0 = arg0.substring(class637.field8723.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8724.method3584(class770.field10592, true))) {
                var3 = 2;
                arg0 = arg0.substring(class637.field8724.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8725.method3584(class770.field10592, true))) {
                var3 = 3;
                arg0 = arg0.substring(class637.field8725.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8726.method3584(class770.field10592, true))) {
                var3 = 4;
                arg0 = arg0.substring(class637.field8726.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8727.method3584(class770.field10592, true))) {
                var3 = 5;
                arg0 = arg0.substring(class637.field8727.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8728.method3584(class770.field10592, true))) {
                var3 = 6;
                arg0 = arg0.substring(class637.field8728.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8729.method3584(class770.field10592, true))) {
                var3 = 7;
                arg0 = arg0.substring(class637.field8729.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8730.method3584(class770.field10592, true))) {
                var3 = 8;
                arg0 = arg0.substring(class637.field8730.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8731.method3584(class770.field10592, true))) {
                var3 = 9;
                arg0 = arg0.substring(class637.field8731.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8732.method3584(class770.field10592, true))) {
                var3 = 10;
                arg0 = arg0.substring(class637.field8732.method3584(class770.field10592, true).length());
            } else if (var2.startsWith(class637.field8733.method3584(class770.field10592, true))) {
                var3 = 11;
                arg0 = arg0.substring(class637.field8733.method3584(class770.field10592, true).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class637.field8734.method3584(0, true))) {
            var5 = 1;
            arg0 = arg0.substring(class637.field8734.method3584(0, true).length());
        } else if (var4.startsWith(class637.field8735.method3584(0, true))) {
            var5 = 2;
            arg0 = arg0.substring(class637.field8735.method3584(0, true).length());
        } else if (var4.startsWith(class637.field8736.method3584(0, true))) {
            var5 = 3;
            arg0 = arg0.substring(class637.field8736.method3584(0, true).length());
        } else if (var4.startsWith(class637.field8737.method3584(0, true))) {
            var5 = 4;
            arg0 = arg0.substring(class637.field8737.method3584(0, true).length());
        } else if (var4.startsWith(class637.field8738.method3584(0, true))) {
            var5 = 5;
            arg0 = arg0.substring(class637.field8738.method3584(0, true).length());
        } else if (class770.field10592 != 0) {
            if (var4.startsWith(class637.field8734.method3584(class770.field10592, true))) {
                var5 = 1;
                arg0 = arg0.substring(class637.field8734.method3584(class770.field10592, true).length());
            } else if (var4.startsWith(class637.field8735.method3584(class770.field10592, true))) {
                var5 = 2;
                arg0 = arg0.substring(class637.field8735.method3584(class770.field10592, true).length());
            } else if (var4.startsWith(class637.field8736.method3584(class770.field10592, true))) {
                var5 = 3;
                arg0 = arg0.substring(class637.field8736.method3584(class770.field10592, true).length());
            } else if (var4.startsWith(class637.field8737.method3584(class770.field10592, true))) {
                var5 = 4;
                arg0 = arg0.substring(class637.field8737.method3584(class770.field10592, true).length());
            } else if (var4.startsWith(class637.field8738.method3584(class770.field10592, true))) {
                var5 = 5;
                arg0 = arg0.substring(class637.field8738.method3584(class770.field10592, true).length());
            }
        }
        field1774++;
        class336 var6 = class512.method3076(class113.field1423, class591.field8030, (byte) 121);
        var6.field4150.method2353(-98, 0);
        int var7 = var6.field4150.field5262;
        var6.field4150.method2353(113, var3);
        var6.field4150.method2353(-63, var5);
        class123.method959((byte) -108, var6.field4150, arg0);
        var6.field4150.method2366(-1, var6.field4150.field5262 - var7);
        class578.method3334(4, var6);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(C)I", line = 4801)
    private static final int method1037(char arg0) {
        return class132.method982(arg0, -8213) ? 1 : 0;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Loh;II)V", line = 4813)
    public static final void method1038(class425 arg0, int arg1, int arg2) {
        class760 var3 = class163.method1140(arg2, arg1, arg0, -1394844150);
        if (var3 == null) {
            return;
        }
        field1783 = new int[var3.field10506];
        field1792 = new String[var3.field10507];
        if (class381.field4827 == var3.field10515 || class484.field6754 == var3.field10515 || class112.field1414 == var3.field10515) {
            int var4 = 0;
            int var5 = 0;
            if (class358.field4443 != null) {
                var4 = class358.field4443.field8383;
                var5 = class358.field4443.field8492;
            }
            field1783[0] = class738.field10291.method109(121) - var4;
            field1783[1] = class738.field10291.method117(true) - var5;
        }
        method1033(var3, 200000);
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(I)I", line = 4843)
    private static final int method1039(int arg0) {
        class253 var1 = class204.field2444.method3556((byte) 95, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        Integer var2 = field1769.method2968(class672.field9229.field5926 << 16 | var1.field2953, (byte) 89, var1.field2951, var1.field2958);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "(I)V", line = 4860)
    private static final void method1040(int arg0) {
        class620 var1 = class479.method2848(arg0, (byte) -39);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class620[] var3 = class642.field8762[var2];
        if (var3 == null) {
            class620[] var4 = class316.field3880[var2];
            int var5 = var4.length;
            var3 = class642.field8762[var2] = new class620[var5];
            class211.method1335(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class211.method1335(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "()V", line = 4896)
    public static final void method1041() {
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(IZ)V", line = 4904)
    private static final void method1042(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field1785 -= 3;
                int var2 = field1770[field1785];
                int var3 = field1770[field1785 + 1];
                int var4 = field1770[field1785 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class620 var5 = class479.method2848(var2, (byte) 110);
                if (var5.field8343 == null) {
                    var5.field8343 = new class620[var4 + 1];
                }
                if (var5.field8343.length <= var4) {
                    class620[] var6 = new class620[var4 + 1];
                    for (int var7 = 0; var7 < var5.field8343.length; var7++) {
                        var6[var7] = var5.field8343[var7];
                    }
                    var5.field8343 = var6;
                }
                if (var4 > 0 && var5.field8343[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class620 var8 = new class620();
                var8.field8371 = var3;
                var8.field8400 = var8.field8515 = var5.field8515;
                var8.field8445 = var4;
                var5.field8343[var4] = var8;
                if (arg1) {
                    field1776 = var8;
                } else {
                    field1791 = var8;
                }
                class576.method3330(var5, -1);
                return;
            }
            if (arg0 == 151) {
                class620 var9 = arg1 ? field1776 : field1791;
                if (var9.field8445 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class620 var10 = class479.method2848(var9.field8515, (byte) -110);
                var10.field8343[var9.field8445] = null;
                class576.method3330(var10, -1);
                return;
            }
            if (arg0 == 152) {
                class620 var11 = class479.method2848(field1770[--field1785], (byte) -53);
                var11.field8343 = null;
                class576.method3330(var11, -1);
                return;
            }
            if (arg0 == 200) {
                field1785 -= 2;
                int var12 = field1770[field1785];
                int var13 = field1770[field1785 + 1];
                class620 var14 = class481.method2859(var13, var12, 16383);
                if (var14 != null && var13 != -1) {
                    field1770[field1785++] = 1;
                    if (arg1) {
                        field1776 = var14;
                        return;
                    }
                    field1791 = var14;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1770[--field1785];
                class620 var16 = class479.method2848(var15, (byte) 124);
                if (var16 != null) {
                    field1770[field1785++] = 1;
                    if (arg1) {
                        field1776 = var16;
                        return;
                    }
                    field1791 = var16;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1770[--field1785];
                method1030(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1770[--field1785];
                method1040(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1785 -= 2;
                int var19 = field1770[field1785];
                int var20 = field1770[field1785 + 1];
                if (class300.field3596.field7387 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class243.field2855.length; var21++) {
                    if (class243.field2855[var21] == var19) {
                        class300.field3596.field7387.method1855(var20, var21, class692.field9423, 125);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class712.field9996.length; var22++) {
                    if (class712.field9996[var22] == var19) {
                        class300.field3596.field7387.method1855(var20, var22, class692.field9423, 127);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1785 -= 2;
                int var23 = field1770[field1785];
                int var24 = field1770[field1785 + 1];
                if (class300.field3596.field7387 == null) {
                    return;
                }
                class300.field3596.field7387.method1859(var23, 46, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1770[--field1785] != 0;
                if (class300.field3596.field7387 == null) {
                    return;
                }
                class300.field3596.field7387.method1860((byte) -105, var25);
                return;
            }
            if (arg0 == 411) {
                field1785 -= 2;
                int var26 = field1770[field1785];
                int var27 = field1770[field1785 + 1];
                if (class300.field3596.field7387 == null) {
                    return;
                }
                class300.field3596.field7387.method1864(1073741824, var26, class121.field1555, var27);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class620 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class479.method2848(field1770[--field1785], (byte) -48);
            } else {
                var28 = arg1 ? field1776 : field1791;
            }
            if (arg0 == 1000) {
                field1785 -= 4;
                var28.field8375 = field1770[field1785];
                var28.field8490 = field1770[field1785 + 1];
                int var29 = field1770[field1785 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field1770[field1785 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field8456 = (byte) var29;
                var28.field8452 = (byte) var30;
                class576.method3330(var28, -1);
                class776.method4309(var28, 122);
                if (var28.field8445 == -1) {
                    class291.method1702(-21058, var28.field8515);
                }
                return;
            }
            if (arg0 == 1001) {
                field1785 -= 4;
                var28.field8364 = field1770[field1785];
                var28.field8360 = field1770[field1785 + 1];
                var28.field8346 = 0;
                var28.field8421 = 0;
                int var31 = field1770[field1785 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field1770[field1785 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field8423 = (byte) var31;
                var28.field8465 = (byte) var32;
                class576.method3330(var28, -1);
                class776.method4309(var28, 115);
                if (var28.field8371 == 0) {
                    class690.method3851(false, 17959, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field1770[--field1785] == 1;
                if (var28.field8361 != var33) {
                    var28.field8361 = var33;
                    class576.method3330(var28, -1);
                }
                if (var28.field8445 == -1) {
                    class433.method2565(var28.field8515, true);
                }
                return;
            }
            if (arg0 == 1004) {
                field1785 -= 2;
                var28.field8484 = field1770[field1785];
                var28.field8345 = field1770[field1785 + 1];
                class576.method3330(var28, -1);
                class776.method4309(var28, 117);
                if (var28.field8371 == 0) {
                    class690.method3851(false, 17959, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field8503 = field1770[--field1785] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class620 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class479.method2848(field1770[--field1785], (byte) 108);
            } else {
                var34 = arg1 ? field1776 : field1791;
            }
            if (arg0 == 1100) {
                field1785 -= 2;
                var34.field8496 = field1770[field1785];
                if (var34.field8496 > var34.field8482 - var34.field8506) {
                    var34.field8496 = var34.field8482 - var34.field8506;
                }
                if (var34.field8496 < 0) {
                    var34.field8496 = 0;
                }
                var34.field8392 = field1770[field1785 + 1];
                if (var34.field8392 > var34.field8399 - var34.field8416) {
                    var34.field8392 = var34.field8399 - var34.field8416;
                }
                if (var34.field8392 < 0) {
                    var34.field8392 = 0;
                }
                class576.method3330(var34, -1);
                if (var34.field8445 == -1) {
                    class470.method2811((byte) -119, var34.field8515);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field8340 = field1770[--field1785];
                class576.method3330(var34, -1);
                if (var34.field8445 == -1) {
                    class667.method3747(var34.field8515, 19687);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field8469 = field1770[--field1785] == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1103) {
                var34.field8491 = field1770[--field1785];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1104) {
                var34.field8448 = field1770[--field1785];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field1770[--field1785];
                if (var34.field8358 != var35) {
                    var34.field8358 = var35;
                    class576.method3330(var34, -1);
                }
                if (var34.field8445 == -1) {
                    class96.method838(var34.field8515, -128);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field8466 = field1770[--field1785];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1107) {
                var34.field8487 = field1770[--field1785] == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1108) {
                var34.field8512 = 1;
                var34.field8354 = field1770[--field1785];
                class576.method3330(var34, -1);
                if (var34.field8445 == -1) {
                    class271.method1598(var34.field8515, (byte) -116);
                }
                return;
            }
            if (arg0 == 1109) {
                field1785 -= 6;
                var34.field8397 = field1770[field1785];
                var34.field8478 = field1770[field1785 + 1];
                var34.field8382 = field1770[field1785 + 2];
                var34.field8446 = field1770[field1785 + 3];
                var34.field8355 = field1770[field1785 + 4];
                var34.field8363 = field1770[field1785 + 5];
                class576.method3330(var34, -1);
                if (var34.field8445 == -1) {
                    class548.method3223(false, var34.field8515);
                    class321.method1918(256, var34.field8515);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field1770[--field1785];
                if (var34.field8337 != var36) {
                    var34.field8337 = var36;
                    var34.field8404 = 0;
                    var34.field8460 = 1;
                    var34.field8362 = 0;
                    class582 var37 = var34.field8337 == -1 ? null : class362.field4504.method3600(-45, var34.field8337);
                    if (var37 != null) {
                        class514.method3080(var34.field8404, 641545256, var37);
                    }
                    class576.method3330(var34, -1);
                }
                if (var34.field8445 == -1) {
                    class748.method4176((byte) -86, var34.field8515);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field8426 = field1770[--field1785] == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field1786[--field1798];
                if (!var38.equals(var34.field8464)) {
                    var34.field8464 = var38;
                    class576.method3330(var34, -1);
                }
                if (var34.field8445 == -1) {
                    class706.method4010(var34.field8515, 18281);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field8398 = field1770[--field1785];
                class576.method3330(var34, -1);
                if (var34.field8445 == -1) {
                    class584.method3360((byte) 97, var34.field8515);
                }
                return;
            }
            if (arg0 == 1114) {
                field1785 -= 3;
                var34.field8406 = field1770[field1785];
                var34.field8407 = field1770[field1785 + 1];
                var34.field8402 = field1770[field1785 + 2];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1115) {
                var34.field8472 = field1770[--field1785] == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1116) {
                var34.field8463 = field1770[--field1785];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1117) {
                var34.field8480 = field1770[--field1785];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1118) {
                var34.field8498 = field1770[--field1785] == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1119) {
                var34.field8368 = field1770[--field1785] == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1120) {
                field1785 -= 2;
                var34.field8482 = field1770[field1785];
                var34.field8399 = field1770[field1785 + 1];
                class576.method3330(var34, -1);
                if (var34.field8371 == 0) {
                    class690.method3851(false, 17959, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field8468 = field1770[--field1785] == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1123) {
                var34.field8363 = field1770[--field1785];
                class576.method3330(var34, -1);
                if (var34.field8445 == -1) {
                    class548.method3223(false, var34.field8515);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field1770[--field1785];
                var34.field8349 = var39 == 1;
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1125) {
                field1785 -= 2;
                var34.field8443 = field1770[field1785];
                var34.field8339 = field1770[field1785 + 1];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1126) {
                var34.field8432 = field1770[--field1785];
                class576.method3330(var34, -1);
                return;
            }
            if (arg0 == 1127) {
                field1785 -= 2;
                int var40 = field1770[field1785];
                int var41 = field1770[field1785 + 1];
                class613 var42 = class113.field1426.method4366(true, var40);
                if (var42.field8244 != var41) {
                    var34.method3532(var40, 16, var41);
                    return;
                }
                var34.method3521(var40, 2);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field1770[--field1785];
                String var44 = field1786[--field1798];
                class613 var45 = class113.field1426.method4366(true, var43);
                if (!var45.field8234.equals(var44)) {
                    var34.method3528(var44, var43, 10);
                    return;
                }
                var34.method3521(var43, 2);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field1770[--field1785];
                if ((var34.field8371 == 5 || arg0 != 1129) && (var34.field8371 == 4 || arg0 != 1130)) {
                    if (var34.field8344 != var52) {
                        var34.field8344 = var52;
                        class576.method3330(var34, -1);
                    }
                    if (var34.field8445 == -1) {
                        class10.method174(var34.field8515, (byte) -34);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field1785 -= 3;
                int var46 = field1770[field1785];
                short var47 = (short) field1770[field1785 + 1];
                short var48 = (short) field1770[field1785 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method3514(var46, 14138, var48, var47);
                    class576.method3330(var34, -1);
                    if (var34.field8445 == -1) {
                        class539.method3196(var34.field8515, (byte) 51, var46);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field1785 -= 3;
                int var49 = field1770[field1785];
                short var50 = (short) field1770[field1785 + 1];
                short var51 = (short) field1770[field1785 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method3529(var50, -943, var49, var51);
                    class576.method3330(var34, -1);
                    if (var34.field8445 == -1) {
                        class286.method1657(var34.field8515, -112, var49);
                    }
                    return;
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class620 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class479.method2848(field1770[--field1785], (byte) 118);
            } else {
                var53 = arg1 ? field1776 : field1791;
            }
            class576.method3330(var53, -1);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1785 -= 2;
                int var54 = field1770[field1785];
                int var55 = field1770[field1785 + 1];
                if (var53.field8445 == -1) {
                    class517.method3091(var53.field8515, 18412);
                    class548.method3223(false, var53.field8515);
                    class321.method1918(256, var53.field8515);
                }
                if (var54 == -1) {
                    var53.field8512 = 1;
                    var53.field8354 = -1;
                    var53.field8438 = -1;
                    return;
                }
                var53.field8438 = var54;
                var53.field8499 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field8476 = true;
                } else {
                    var53.field8476 = false;
                }
                class340 var56 = class121.field1555.method2882(var54, -22087);
                var53.field8382 = var56.field4236;
                var53.field8446 = var56.field4252;
                var53.field8355 = var56.field4231;
                var53.field8397 = var56.field4197;
                var53.field8478 = var56.field4201;
                var53.field8363 = var56.field4254;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field8502 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field8502 = 1;
                } else {
                    var53.field8502 = 2;
                }
                if (var53.field8346 > 0) {
                    var53.field8363 = var53.field8363 * 32 / var53.field8346;
                    return;
                }
                if (var53.field8364 > 0) {
                    var53.field8363 = var53.field8363 * 32 / var53.field8364;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field8512 = 2;
                var53.field8354 = field1770[--field1785];
                if (var53.field8445 == -1) {
                    class271.method1598(var53.field8515, (byte) -116);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field8512 = 3;
                var53.field8354 = -1;
                if (var53.field8445 == -1) {
                    class271.method1598(var53.field8515, (byte) -116);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field8512 = 6;
                var53.field8354 = field1770[--field1785];
                if (var53.field8445 == -1) {
                    class271.method1598(var53.field8515, (byte) -116);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field8512 = 5;
                var53.field8354 = field1770[--field1785];
                if (var53.field8445 == -1) {
                    class271.method1598(var53.field8515, (byte) -116);
                }
                return;
            }
            if (arg0 == 1206) {
                field1785 -= 4;
                var53.field8428 = field1770[field1785];
                var53.field8384 = field1770[field1785 + 1];
                var53.field8427 = field1770[field1785 + 2];
                var53.field8393 = field1770[field1785 + 3];
                class576.method3330(var53, -1);
                return;
            }
            if (arg0 == 1207) {
                field1785 -= 2;
                var53.field8475 = field1770[field1785];
                var53.field8447 = field1770[field1785 + 1];
                class576.method3330(var53, -1);
                return;
            }
            if (arg0 == 1210) {
                field1785 -= 4;
                var53.field8354 = field1770[field1785];
                var53.field8401 = field1770[field1785 + 1];
                if (field1770[field1785 + 2] == 1) {
                    var53.field8512 = 9;
                } else {
                    var53.field8512 = 8;
                }
                if (field1770[field1785 + 3] == 1) {
                    var53.field8476 = true;
                } else {
                    var53.field8476 = false;
                }
                if (var53.field8445 == -1) {
                    class271.method1598(var53.field8515, (byte) -116);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field8512 = 5;
                var53.field8354 = class782.field10790;
                var53.field8401 = 0;
                if (var53.field8445 == -1) {
                    class271.method1598(var53.field8515, (byte) -116);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class620 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class479.method2848(field1770[--field1785], (byte) -110);
            } else {
                var57 = arg1 ? field1776 : field1791;
            }
            if (arg0 == 1300) {
                int var58 = field1770[--field1785] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method3526(var58, (byte) 103, field1786[--field1798]);
                    return;
                }
                field1798--;
                return;
            }
            if (arg0 == 1301) {
                field1785 -= 2;
                int var59 = field1770[field1785];
                int var60 = field1770[field1785 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field8500 = null;
                    return;
                }
                var57.field8500 = class481.method2859(var60, var59, 16383);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field1770[--field1785];
                if (class53.field715 != var61 && class77.field1048 != var61 && class704.field9906 != var61) {
                    return;
                }
                var57.field8453 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field8413 = field1770[--field1785];
                return;
            }
            if (arg0 == 1304) {
                var57.field8335 = field1770[--field1785];
                return;
            }
            if (arg0 == 1305) {
                var57.field8429 = field1786[--field1798];
                return;
            }
            if (arg0 == 1306) {
                var57.field8462 = field1786[--field1798];
                return;
            }
            if (arg0 == 1307) {
                var57.field8381 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field8477 = field1770[--field1785];
                var57.field8419 = field1770[--field1785];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field1770[--field1785];
                int var63 = field1770[--field1785];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method3530(var62, false, var63 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field8350 = field1786[--field1798];
                return;
            }
            if (arg0 == 1311) {
                var57.field8410 = field1770[--field1785];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field1785 -= 3;
                    var64 = field1770[field1785] - 1;
                    var65 = field1770[field1785 + 1];
                    var66 = field1770[field1785 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1785 -= 2;
                    var64 = 10;
                    var65 = field1770[field1785];
                    var66 = field1770[field1785 + 1];
                }
                if (var57.field8403 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field8403 = new byte[11];
                    var57.field8513 = new byte[11];
                    var57.field8359 = new int[11];
                }
                var57.field8403[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field8454 = false;
                    for (int var67 = 0; var67 < var57.field8403.length; var67++) {
                        if (var57.field8403[var67] != 0) {
                            var57.field8454 = true;
                            break;
                        }
                    }
                } else {
                    var57.field8454 = true;
                }
                var57.field8513[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field8370 = field1770[--field1785];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class620 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class479.method2848(field1770[--field1785], (byte) -121);
            } else {
                var68 = arg1 ? field1776 : field1791;
            }
            if (arg0 == 1499) {
                var68.method3535((byte) -118);
                return;
            }
            String var69 = field1786[--field1798];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field1770[--field1785];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field1770[--field1785];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field1786[--field1798];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field1772[--field1797]);
                } else {
                    var72[var73] = Integer.valueOf(field1770[--field1785]);
                }
            }
            int var74 = field1770[--field1785];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field8449 = var72;
            } else if (arg0 == 1401) {
                var68.field8405 = var72;
            } else if (arg0 == 1402) {
                var68.field8489 = var72;
            } else if (arg0 == 1403) {
                var68.field8411 = var72;
            } else if (arg0 == 1404) {
                var68.field8412 = var72;
            } else if (arg0 == 1405) {
                var68.field8352 = var72;
            } else if (arg0 == 1406) {
                var68.field8441 = var72;
            } else if (arg0 == 1407) {
                var68.field8479 = var72;
                var68.field8481 = var70;
            } else if (arg0 == 1408) {
                var68.field8473 = var72;
            } else if (arg0 == 1409) {
                var68.field8434 = var72;
            } else if (arg0 == 1410) {
                var68.field8353 = var72;
            } else if (arg0 == 1411) {
                var68.field8395 = var72;
            } else if (arg0 == 1412) {
                var68.field8433 = var72;
            } else if (arg0 == 1414) {
                var68.field8342 = var72;
                var68.field8425 = var70;
            } else if (arg0 == 1415) {
                var68.field8417 = var72;
                var68.field8373 = var70;
            } else if (arg0 == 1416) {
                var68.field8356 = var72;
            } else if (arg0 == 1417) {
                var68.field8376 = var72;
            } else if (arg0 == 1418) {
                var68.field8485 = var72;
            } else if (arg0 == 1419) {
                var68.field8486 = var72;
            } else if (arg0 == 1420) {
                var68.field8418 = var72;
            } else if (arg0 == 1421) {
                var68.field8437 = var72;
            } else if (arg0 == 1422) {
                var68.field8444 = var72;
            } else if (arg0 == 1423) {
                var68.field8367 = var72;
            } else if (arg0 == 1424) {
                var68.field8505 = var72;
            } else if (arg0 == 1425) {
                var68.field8424 = var72;
            } else if (arg0 == 1426) {
                var68.field8390 = var72;
            } else if (arg0 == 1427) {
                var68.field8336 = var72;
            } else if (arg0 == 1428) {
                var68.field8372 = var72;
                var68.field8497 = var70;
            } else if (arg0 == 1429) {
                var68.field8341 = var72;
                var68.field8420 = var70;
            } else if (arg0 == 1430) {
                var68.field8493 = var72;
            } else if (arg0 == 1431) {
                var68.field8431 = var72;
            } else if (arg0 == 1432) {
                var68.field8504 = var72;
            }
            var68.field8422 = true;
            return;
        } else if (arg0 < 1600) {
            class620 var75 = arg1 ? field1776 : field1791;
            if (arg0 == 1500) {
                field1770[field1785++] = var75.field8383;
                return;
            }
            if (arg0 == 1501) {
                field1770[field1785++] = var75.field8492;
                return;
            }
            if (arg0 == 1502) {
                field1770[field1785++] = var75.field8506;
                return;
            }
            if (arg0 == 1503) {
                field1770[field1785++] = var75.field8416;
                return;
            }
            if (arg0 == 1504) {
                field1770[field1785++] = var75.field8361 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field1770[field1785++] = var75.field8400;
                return;
            }
            if (arg0 == 1506) {
                class620 var76 = class235.method1442(14939, var75);
                field1770[field1785++] = var76 == null ? -1 : var76.field8515;
                return;
            }
        } else if (arg0 < 1700) {
            class620 var77 = arg1 ? field1776 : field1791;
            if (arg0 == 1600) {
                field1770[field1785++] = var77.field8496;
                return;
            }
            if (arg0 == 1601) {
                field1770[field1785++] = var77.field8392;
                return;
            }
            if (arg0 == 1602) {
                field1786[field1798++] = var77.field8464;
                return;
            }
            if (arg0 == 1603) {
                field1770[field1785++] = var77.field8482;
                return;
            }
            if (arg0 == 1604) {
                field1770[field1785++] = var77.field8399;
                return;
            }
            if (arg0 == 1605) {
                field1770[field1785++] = var77.field8363;
                return;
            }
            if (arg0 == 1606) {
                field1770[field1785++] = var77.field8382;
                return;
            }
            if (arg0 == 1607) {
                field1770[field1785++] = var77.field8355;
                return;
            }
            if (arg0 == 1608) {
                field1770[field1785++] = var77.field8446;
                return;
            }
            if (arg0 == 1609) {
                field1770[field1785++] = var77.field8491;
                return;
            }
            if (arg0 == 1610) {
                field1770[field1785++] = var77.field8397;
                return;
            }
            if (arg0 == 1611) {
                field1770[field1785++] = var77.field8478;
                return;
            }
            if (arg0 == 1612) {
                field1770[field1785++] = var77.field8358;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field1770[--field1785];
                class613 var79 = class113.field1426.method4366(true, var78);
                if (var79.method3472((byte) -122)) {
                    field1786[field1798++] = var77.method3525(var78, 5, var79.field8234);
                    return;
                }
                field1770[field1785++] = var77.method3524(var79.field8244, var78, 2);
                return;
            }
            if (arg0 == 1614) {
                field1770[field1785++] = var77.field8466;
                return;
            }
            if (arg0 == 2614) {
                field1770[field1785++] = var77.field8512 == 1 ? var77.field8354 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class620 var80 = arg1 ? field1776 : field1791;
            if (arg0 == 1700) {
                field1770[field1785++] = var80.field8438;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field8438 != -1) {
                    field1770[field1785++] = var80.field8499;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field1770[field1785++] = var80.field8445;
                return;
            }
        } else if (arg0 < 1900) {
            class620 var81 = arg1 ? field1776 : field1791;
            if (arg0 == 1800) {
                field1770[field1785++] = client.method1882(var81).method2321(-128);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field1770[--field1785];
                int var383 = var82 - 1;
                if (var81.field8381 != null && var383 < var81.field8381.length && var81.field8381[var383] != null) {
                    field1786[field1798++] = var81.field8381[var383];
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field8429 == null) {
                    field1786[field1798++] = "";
                    return;
                }
                field1786[field1798++] = var81.field8429;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class620 var381;
            if (arg0 >= 2000) {
                var381 = class479.method2848(field1770[--field1785], (byte) 127);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field1776 : field1791;
            }
            if (field1800 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field8336 == null) {
                    return;
                }
                class529 var382 = new class529();
                var382.field7473 = var381;
                var382.field7477 = var381.field8336;
                var382.field7481 = field1800 + 1;
                class756.field10475.method2732(var382, 21939);
                return;
            }
        } else if (arg0 < 2600) {
            class620 var83 = class479.method2848(field1770[--field1785], (byte) 113);
            if (arg0 == 2500) {
                field1770[field1785++] = var83.field8383;
                return;
            }
            if (arg0 == 2501) {
                field1770[field1785++] = var83.field8492;
                return;
            }
            if (arg0 == 2502) {
                field1770[field1785++] = var83.field8506;
                return;
            }
            if (arg0 == 2503) {
                field1770[field1785++] = var83.field8416;
                return;
            }
            if (arg0 == 2504) {
                field1770[field1785++] = var83.field8361 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field1770[field1785++] = var83.field8400;
                return;
            }
            if (arg0 == 1506) {
                class620 var84 = class235.method1442(14939, var83);
                field1770[field1785++] = var84 == null ? -1 : var84.field8515;
                return;
            }
        } else if (arg0 < 2700) {
            class620 var85 = class479.method2848(field1770[--field1785], (byte) -16);
            if (arg0 == 2600) {
                field1770[field1785++] = var85.field8496;
                return;
            }
            if (arg0 == 2601) {
                field1770[field1785++] = var85.field8392;
                return;
            }
            if (arg0 == 2602) {
                field1786[field1798++] = var85.field8464;
                return;
            }
            if (arg0 == 2603) {
                field1770[field1785++] = var85.field8482;
                return;
            }
            if (arg0 == 2604) {
                field1770[field1785++] = var85.field8399;
                return;
            }
            if (arg0 == 2605) {
                field1770[field1785++] = var85.field8363;
                return;
            }
            if (arg0 == 2606) {
                field1770[field1785++] = var85.field8382;
                return;
            }
            if (arg0 == 2607) {
                field1770[field1785++] = var85.field8355;
                return;
            }
            if (arg0 == 2608) {
                field1770[field1785++] = var85.field8446;
                return;
            }
            if (arg0 == 2609) {
                field1770[field1785++] = var85.field8491;
                return;
            }
            if (arg0 == 2610) {
                field1770[field1785++] = var85.field8397;
                return;
            }
            if (arg0 == 2611) {
                field1770[field1785++] = var85.field8478;
                return;
            }
            if (arg0 == 2612) {
                field1770[field1785++] = var85.field8358;
                return;
            }
            if (arg0 == 2613) {
                field1770[field1785++] = var85.field8466;
                return;
            }
            if (arg0 == 2614) {
                field1770[field1785++] = var85.field8512 == 1 ? var85.field8354 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class620 var86 = class479.method2848(field1770[--field1785], (byte) -125);
                field1770[field1785++] = var86.field8438;
                return;
            }
            if (arg0 == 2701) {
                class620 var87 = class479.method2848(field1770[--field1785], (byte) 123);
                if (var87.field8438 != -1) {
                    field1770[field1785++] = var87.field8499;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field1770[--field1785];
                class52 var89 = (class52) class728.field10205.method2121(117, (long) var88);
                if (var89 != null) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class620 var90 = class479.method2848(field1770[--field1785], (byte) -96);
                if (var90.field8343 == null) {
                    field1770[field1785++] = 0;
                    return;
                }
                int var91 = var90.field8343.length;
                for (int var92 = 0; var92 < var90.field8343.length; var92++) {
                    if (var90.field8343[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field1770[field1785++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field1785 -= 2;
                int var93 = field1770[field1785];
                int var94 = field1770[field1785 + 1];
                class52 var95 = (class52) class728.field10205.method2121(52, (long) var93);
                if (var95 != null && var95.field713 == var94) {
                    field1770[field1785++] = 1;
                    return;
                } else {
                    field1770[field1785++] = 0;
                    return;
                }
            }
        } else if (arg0 < 2900) {
            class620 var96 = class479.method2848(field1770[--field1785], (byte) 127);
            if (arg0 == 2800) {
                field1770[field1785++] = client.method1882(var96).method2321(-106);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field1770[--field1785];
                int var384 = var97 - 1;
                if (var96.field8381 != null && var384 < var96.field8381.length && var96.field8381[var384] != null) {
                    field1786[field1798++] = var96.field8381[var384];
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field8429 == null) {
                    field1786[field1798++] = "";
                    return;
                }
                field1786[field1798++] = var96.field8429;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field1786[--field1798];
                class86.method798((byte) -127, var98);
                return;
            }
            if (arg0 == 3101) {
                field1785 -= 2;
                class536.method3187(-58, field1770[field1785 + 1], field1770[field1785], class300.field3596);
                return;
            }
            if (arg0 == 3103) {
                class326.method1939(-118, true);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field1786[--field1798];
                int var100 = 0;
                if (class480.method2854((byte) 57, var99)) {
                    var100 = class445.method2623(0, var99);
                }
                field1773++;
                class336 var101 = class512.method3076(class10.field181, class591.field8030, (byte) 96);
                var101.field4150.method2391(87, var100);
                class578.method3334(4, var101);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field1786[--field1798];
                field1775++;
                class336 var103 = class512.method3076(class114.field1431, class591.field8030, (byte) 67);
                var103.field4150.method2353(-96, var102.length() + 1);
                var103.field4150.method2388(255, var102);
                class578.method3334(4, var103);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field1786[--field1798];
                field1782++;
                class336 var105 = class512.method3076(class425.field5637, class591.field8030, (byte) 90);
                var105.field4150.method2353(69, var104.length() + 1);
                var105.field4150.method2388(255, var104);
                class578.method3334(4, var105);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field1770[--field1785];
                String var107 = field1786[--field1798];
                class446.method2631(var107, true, var106);
                return;
            }
            if (arg0 == 3108) {
                field1785 -= 3;
                int var108 = field1770[field1785];
                int var109 = field1770[field1785 + 1];
                int var110 = field1770[field1785 + 2];
                class620 var111 = class479.method2848(var110, (byte) -114);
                class367.method2141(true, var108, var109, var111);
                return;
            }
            if (arg0 == 3109) {
                field1785 -= 2;
                int var112 = field1770[field1785];
                int var113 = field1770[field1785 + 1];
                class620 var114 = arg1 ? field1776 : field1791;
                class367.method2141(true, var112, var113, var114);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field1770[--field1785];
                field1790++;
                class336 var116 = class512.method3076(class543.field7616, class591.field8030, (byte) 91);
                var116.field4150.method2369(-18090, var115);
                class578.method3334(4, var116);
                return;
            }
            if (arg0 == 3111) {
                field1785 -= 2;
                int var117 = field1770[field1785];
                int var118 = field1770[field1785 + 1];
                class52 var119 = (class52) class728.field10205.method2121(113, (long) var117);
                if (var119 != null) {
                    class336.method1989(var119.field713 != var118, true, var119, (byte) 119);
                }
                class229.method1411(var117, true, 3, var118, 32);
                return;
            }
            if (arg0 == 3112) {
                field1785--;
                int var120 = field1770[field1785];
                class52 var121 = (class52) class728.field10205.method2121(51, (long) var120);
                if (var121 != null && var121.field711 == 3) {
                    class336.method1989(true, true, var121, (byte) 97);
                }
                return;
            }
            if (arg0 == 3113) {
                class354.method2083(field1786[--field1798], 24);
                return;
            }
            if (arg0 == 3114) {
                field1785 -= 2;
                int var122 = field1770[field1785];
                int var123 = field1770[field1785 + 1];
                String var124 = field1786[--field1798];
                class318.method1873("", var124, (byte) 28, "", "", var122, var123);
                return;
            }
            if (arg0 == 3115) {
                field1785 -= 11;
                class105[] var125 = class625.method3549((byte) 120);
                class4[] var126 = class716.method4046((byte) -110);
                class230.method1418(field1770[field1785 + 6], field1770[field1785 + 4], field1770[field1785 + 8], field1770[field1785 + 10], field1770[field1785 + 3], field1770[field1785 + 2], field1770[field1785 + 7], var125[field1770[field1785]], field1770[field1785 + 5], field1770[field1785 + 9], 6, var126[field1770[field1785 + 1]]);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field1770[--field1785];
                field1773++;
                class336 var128 = class512.method3076(class251.field2942, class591.field8030, (byte) 76);
                var128.field4150.method2369(-18090, var127);
                class578.method3334(4, var128);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field1786[--field1798];
                class336 var130 = class512.method3076(class664.field9128, class591.field8030, (byte) 104);
                var130.field4150.method2353(-74, var129.length() + 1);
                var130.field4150.method2388(255, var129);
                class578.method3334(4, var130);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field1785 -= 3;
                class676.method3809(field1770[field1785 + 2], field1770[field1785], 256, field1770[field1785 + 1], 255, 0);
                return;
            }
            if (arg0 == 3201) {
                class647.method3649(field1770[--field1785], 50, 255, 28);
                return;
            }
            if (arg0 == 3202) {
                field1785 -= 2;
                class531.method3167(field1770[field1785 + 1], false, field1770[field1785], 255);
                return;
            }
            if (arg0 == 3203) {
                field1785 -= 4;
                class676.method3809(field1770[field1785 + 2], field1770[field1785], 256, field1770[field1785 + 1], field1770[field1785 + 3], 0);
                return;
            }
            if (arg0 == 3204) {
                field1785 -= 3;
                class647.method3649(field1770[field1785], field1770[field1785 + 2], field1770[field1785 + 1], -91);
                return;
            }
            if (arg0 == 3205) {
                field1785 -= 3;
                class531.method3167(field1770[field1785 + 1], false, field1770[field1785], field1770[field1785 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field1785 -= 4;
                class731.method4131(0, 256, field1770[field1785 + 3], field1770[field1785 + 1], field1770[field1785], false, field1770[field1785 + 2]);
                return;
            }
            if (arg0 == 3207) {
                field1785 -= 4;
                class731.method4131(0, 256, field1770[field1785 + 3], field1770[field1785 + 1], field1770[field1785], true, field1770[field1785 + 2]);
                return;
            }
            if (arg0 == 3208) {
                field1785 -= 5;
                class676.method3809(field1770[field1785 + 2], field1770[field1785], field1770[field1785 + 4], field1770[field1785 + 1], field1770[field1785 + 3], 0);
                return;
            }
            if (arg0 == 3209) {
                field1785 -= 5;
                class731.method4131(0, field1770[field1785 + 4], field1770[field1785 + 3], field1770[field1785 + 1], field1770[field1785], false, field1770[field1785 + 2]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field1770[field1785++] = class228.field2707;
                return;
            }
            if (arg0 == 3301) {
                field1785 -= 2;
                int var131 = field1770[field1785];
                int var132 = field1770[field1785 + 1];
                field1770[field1785++] = class25.method254(false, var132, 82, var131);
                return;
            }
            if (arg0 == 3302) {
                field1785 -= 2;
                int var133 = field1770[field1785];
                int var134 = field1770[field1785 + 1];
                field1770[field1785++] = class497.method2939((byte) 127, var134, var133, false);
                return;
            }
            if (arg0 == 3303) {
                field1785 -= 2;
                int var135 = field1770[field1785];
                int var136 = field1770[field1785 + 1];
                field1770[field1785++] = class139.method1016(var136, false, false, var135);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field1770[--field1785];
                field1770[field1785++] = class425.field5639.method3213(99, var137).field6738;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field1770[--field1785];
                field1770[field1785++] = class622.field8544[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field1770[--field1785];
                field1770[field1785++] = class430.field5668[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field1770[--field1785];
                field1770[field1785++] = class35.field530[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class300.field3596.field808;
                int var142 = (class300.field3596.field823 >> 9) + class632.field8626;
                int var143 = (class300.field3596.field813 >> 9) + class620.field8435;
                field1770[field1785++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field1770[--field1785];
                field1770[field1785++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field1770[--field1785];
                field1770[field1785++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field1770[--field1785];
                field1770[field1785++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field1770[field1785++] = class629.field8601 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field1785 -= 2;
                int var147 = field1770[field1785];
                int var148 = field1770[field1785 + 1];
                field1770[field1785++] = class25.method254(true, var148, 37, var147);
                return;
            }
            if (arg0 == 3314) {
                field1785 -= 2;
                int var149 = field1770[field1785];
                int var150 = field1770[field1785 + 1];
                field1770[field1785++] = class497.method2939((byte) 127, var150, var149, true);
                return;
            }
            if (arg0 == 3315) {
                field1785 -= 2;
                int var151 = field1770[field1785];
                int var152 = field1770[field1785 + 1];
                field1770[field1785++] = class139.method1016(var152, true, false, var151);
                return;
            }
            if (arg0 == 3316) {
                if (class637.field8741 >= 2) {
                    field1770[field1785++] = class637.field8741;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field1770[field1785++] = class359.field4466;
                return;
            }
            if (arg0 == 3318) {
                field1770[field1785++] = class55.field743.field4365;
                return;
            }
            if (arg0 == 3321) {
                field1770[field1785++] = class115.field1460;
                return;
            }
            if (arg0 == 3322) {
                field1770[field1785++] = class618.field8327;
                return;
            }
            if (arg0 == 3323) {
                if (class22.field358 >= 5 && class22.field358 <= 9) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class22.field358 >= 5 && class22.field358 <= 9) {
                    field1770[field1785++] = class22.field358;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field1770[field1785++] = class324.field4018 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field1770[field1785++] = class300.field3596.field7347;
                return;
            }
            if (arg0 == 3327) {
                field1770[field1785++] = class300.field3596.field7387 != null && class300.field3596.field7387.field3887 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field1770[field1785++] = class257.field3052 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field1770[--field1785];
                field1770[field1785++] = class57.method505(false, 32516, var153);
                return;
            }
            if (arg0 == 3331) {
                field1785 -= 2;
                int var154 = field1770[field1785];
                int var155 = field1770[field1785 + 1];
                field1770[field1785++] = class248.method1491(false, var154, false, var155, true);
                return;
            }
            if (arg0 == 3332) {
                field1785 -= 2;
                int var156 = field1770[field1785];
                int var157 = field1770[field1785 + 1];
                field1770[field1785++] = class248.method1491(true, var156, false, var157, true);
                return;
            }
            if (arg0 == 3333) {
                field1770[field1785++] = class121.method945(73);
                return;
            }
            if (arg0 == 3335) {
                field1770[field1785++] = class770.field10592;
                return;
            }
            if (arg0 == 3336) {
                field1785 -= 4;
                int var158 = field1770[field1785];
                int var159 = field1770[field1785 + 1];
                int var160 = field1770[field1785 + 2];
                int var161 = field1770[field1785 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field1770[field1785++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field1770[field1785++] = class176.field2187;
                return;
            }
            if (arg0 == 3338) {
                field1770[field1785++] = class531.method3162(8306);
                return;
            }
            if (arg0 == 3339) {
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field1770[field1785++] = class63.field862 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field1770[field1785++] = class496.field6934 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field1770[field1785++] = class738.field10291.method109(122);
                return;
            }
            if (arg0 == 3343) {
                field1770[field1785++] = class738.field10291.method117(true);
                return;
            }
            if (arg0 == 3344) {
                field1786[field1798++] = class486.method2877(50);
                return;
            }
            if (arg0 == 3345) {
                field1786[field1798++] = class461.method2781(0);
                return;
            }
            if (arg0 == 3346) {
                field1770[field1785++] = class606.method3446(1);
                return;
            }
            if (arg0 == 3347) {
                field1770[field1785++] = class287.field3360;
                return;
            }
            if (arg0 == 3349) {
                field1770[field1785++] = class300.field3596.field3434.method1100((byte) 25) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field1785 -= 2;
                int var165 = field1770[field1785];
                int var166 = field1770[field1785 + 1];
                class618 var167 = class39.field569.method819(115, var165);
                field1786[field1798++] = var167.method3500(var166, 2);
                return;
            }
            if (arg0 == 3408) {
                field1785 -= 4;
                int var168 = field1770[field1785];
                int var169 = field1770[field1785 + 1];
                int var170 = field1770[field1785 + 2];
                int var171 = field1770[field1785 + 3];
                class618 var172 = class39.field569.method819(88, var170);
                if (var172.field8320 == var168 && var172.field8321 == var169) {
                    if (var169 == 115) {
                        field1786[field1798++] = var172.method3500(var171, 2);
                        return;
                    }
                    field1770[field1785++] = var172.method3507(var171, true);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field1785 -= 3;
                int var173 = field1770[field1785];
                int var174 = field1770[field1785 + 1];
                int var175 = field1770[field1785 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class618 var176 = class39.field569.method819(-111, var174);
                if (var176.field8321 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field1770[field1785++] = var176.method3497(0, var175) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field1770[--field1785];
                String var178 = field1786[--field1798];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class618 var179 = class39.field569.method819(124, var177);
                if (var179.field8321 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field1770[field1785++] = var179.method3498(5, var178) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field1770[--field1785];
                class618 var181 = class39.field569.method819(119, var180);
                field1770[field1785++] = var181.field8323.method2117(true);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class280.field3263 == 0) {
                    field1770[field1785++] = -2;
                    return;
                }
                if (class280.field3263 == 1) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = class651.field8992;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field1770[--field1785];
                if (class280.field3263 == 2 && var182 < class651.field8992) {
                    field1786[field1798++] = class375.field4702[var182];
                    if (class156.field1942[var182] != null) {
                        field1786[field1798++] = class156.field1942[var182];
                        return;
                    }
                    field1786[field1798++] = "";
                    return;
                }
                field1786[field1798++] = "";
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field1770[--field1785];
                if (class280.field3263 == 2 && var183 < class651.field8992) {
                    field1770[field1785++] = class340.field4225[var183];
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field1770[--field1785];
                if (class280.field3263 == 2 && var184 < class651.field8992) {
                    field1770[field1785++] = class347.field4340[var184];
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field1786[--field1798];
                int var186 = field1770[--field1785];
                class466.method2793(var185, 77, var186);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field1786[--field1798];
                class245.method1472(108, var187);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field1786[--field1798];
                class541.method3203(var188, 94);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field1786[--field1798];
                class740.method4158(var189, false, 0);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field1786[--field1798];
                class346.method2057(var190, (byte) -5);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field1786[--field1798];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field1770[field1785++] = class281.method1622(var191, -21) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field1770[--field1785];
                if (class280.field3263 == 2 && var192 < class651.field8992) {
                    field1786[field1798++] = class208.field2471[var192];
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class614.field8250 != null) {
                    field1786[field1798++] = class28.method269(class614.field8250, 47);
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class614.field8250 != null) {
                    field1770[field1785++] = class454.field6396;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field1770[--field1785];
                if (class614.field8250 != null && var193 < class454.field6396) {
                    field1786[field1798++] = class77.field1049[var193].field9053;
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field1770[--field1785];
                if (class614.field8250 != null && var194 < class454.field6396) {
                    field1770[field1785++] = class77.field1049[var194].field9052;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field1770[--field1785];
                if (class614.field8250 != null && var195 < class454.field6396) {
                    field1770[field1785++] = class77.field1049[var195].field9050;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field1770[field1785++] = class770.field10595;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field1786[--field1798];
                class183.method1226(-40, var196);
                return;
            }
            if (arg0 == 3618) {
                field1770[field1785++] = class137.field1719;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field1786[--field1798];
                class298.method1741(var197, 1);
                return;
            }
            if (arg0 == 3620) {
                class7.method127(11892);
                return;
            }
            if (arg0 == 3621) {
                if (class280.field3263 == 0) {
                    field1770[field1785++] = -1;
                    return;
                }
                field1770[field1785++] = class60.field803;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field1770[--field1785];
                if (class280.field3263 != 0 && var198 < class60.field803) {
                    field1786[field1798++] = class86.field1151[var198];
                    if (class115.field1457[var198] != null) {
                        field1786[field1798++] = class115.field1457[var198];
                        return;
                    }
                    field1786[field1798++] = "";
                    return;
                }
                field1786[field1798++] = "";
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field1786[--field1798];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field1770[field1785++] = class764.method4236(var199, -1) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field1770[--field1785];
                if (class77.field1049 != null && var200 < class454.field6396 && class77.field1049[var200].field9056.equalsIgnoreCase(class300.field3596.field7399)) {
                    field1770[field1785++] = 1;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class397.field5141 != null) {
                    field1786[field1798++] = class397.field5141;
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field1770[--field1785];
                if (class614.field8250 != null && var201 < class454.field6396) {
                    field1786[field1798++] = class77.field1049[var201].field9049;
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field1770[--field1785];
                if (class280.field3263 == 2 && var202 >= 0 && var202 < class651.field8992) {
                    field1770[field1785++] = class111.field1396[var202] ? 1 : 0;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field1786[--field1798];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field1770[field1785++] = class624.method3545(var203, -1);
                return;
            }
            if (arg0 == 3629) {
                field1770[field1785++] = class117.field1495;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field1786[--field1798];
                class740.method4158(var204, true, 0);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field1770[--field1785];
                field1770[field1785++] = class119.field1515[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field1770[--field1785];
                if (class614.field8250 != null && var206 < class454.field6396) {
                    field1786[field1798++] = class77.field1049[var206].field9056;
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field1770[--field1785];
                if (class280.field3263 != 0 && var207 < class60.field803) {
                    field1786[field1798++] = class645.field8786[var207];
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class504.field7138 != null) {
                    field1770[field1785++] = 1;
                    field1769 = class504.field7138;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class621.field8525 != null) {
                    field1770[field1785++] = 1;
                    field1769 = class621.field8525;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field1786[field1798++] = field1769.field6980;
                return;
            }
            if (arg0 == 3703) {
                field1770[field1785++] = field1769.field6982 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field1770[field1785++] = field1769.field6996;
                return;
            }
            if (arg0 == 3705) {
                field1770[field1785++] = field1769.field6988;
                return;
            }
            if (arg0 == 3706) {
                field1770[field1785++] = field1769.field7019;
                return;
            }
            if (arg0 == 3707) {
                field1770[field1785++] = field1769.field7010;
                return;
            }
            if (arg0 == 3709) {
                field1770[field1785++] = field1769.field7001;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field1770[--field1785];
                field1786[field1798++] = field1769.field6972[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field1770[--field1785];
                field1770[field1785++] = field1769.field6994[var209];
                return;
            }
            if (arg0 == 3712) {
                field1770[field1785++] = field1769.field7018;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field1770[--field1785];
                field1786[field1798++] = field1769.field6971[var210];
                return;
            }
            if (arg0 == 3714) {
                field1785 -= 3;
                int var211 = field1770[field1785];
                int var212 = field1770[field1785 + 1];
                int var213 = field1770[field1785 + 2];
                field1770[field1785++] = field1769.method2955(var213, var212, 0, var211);
                return;
            }
            if (arg0 == 3715) {
                field1770[field1785++] = field1769.field6997;
                return;
            }
            if (arg0 == 3716) {
                field1770[field1785++] = field1769.field6979;
                return;
            }
            if (arg0 == 3717) {
                field1770[field1785++] = field1769.method2971(0, field1786[--field1798]);
                return;
            }
            if (arg0 == 3718) {
                field1770[field1785 - 1] = field1769.method2953((byte) -96)[field1770[field1785 - 1]];
                return;
            }
            if (arg0 == 3750) {
                if (class32.field501 != null) {
                    field1770[field1785++] = 1;
                    field1778 = class32.field501;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class227.field2671 != null) {
                    field1770[field1785++] = 1;
                    field1778 = class227.field2671;
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field1786[field1798++] = field1778.field4074;
                return;
            }
            if (arg0 == 3753) {
                field1770[field1785++] = field1778.field4087;
                return;
            }
            if (arg0 == 3754) {
                field1770[field1785++] = field1778.field4090;
                return;
            }
            if (arg0 == 3755) {
                field1770[field1785++] = field1778.field4081;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field1770[--field1785];
                field1786[field1798++] = field1778.field4076[var214].field2544;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field1770[--field1785];
                field1770[field1785++] = field1778.field4076[var215].field2539;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field1770[--field1785];
                field1770[field1785++] = field1778.field4076[var216].field2543;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field1770[--field1785];
                class624.method3548(class227.field2671 == field1778, var217, 0);
                return;
            }
            if (arg0 == 3760) {
                field1770[field1785++] = field1778.method1957(field1786[--field1798], 15658);
                return;
            }
            if (arg0 == 3761) {
                field1770[field1785 - 1] = field1778.method1959(0)[field1770[field1785 - 1]];
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field1770[--field1785];
                field1770[field1785++] = class536.field7550[var218].method1576((byte) -88);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field1770[--field1785];
                field1770[field1785++] = class536.field7550[var219].field3130;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field1770[--field1785];
                field1770[field1785++] = class536.field7550[var220].field3123;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field1770[--field1785];
                field1770[field1785++] = class536.field7550[var221].field3129;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field1770[--field1785];
                field1770[field1785++] = class536.field7550[var222].field3126;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field1770[--field1785];
                field1770[field1785++] = class536.field7550[var223].field3127;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field1770[--field1785];
                int var225 = class536.field7550[var224].method1577((byte) 100);
                field1770[field1785++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field1770[--field1785];
                int var227 = class536.field7550[var226].method1577((byte) 100);
                field1770[field1785++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field1770[--field1785];
                int var229 = class536.field7550[var228].method1577((byte) 100);
                field1770[field1785++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field1770[--field1785];
                int var231 = class536.field7550[var230].method1577((byte) 100);
                field1770[field1785++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field1785 -= 2;
                int var232 = field1770[field1785];
                int var233 = field1770[field1785 + 1];
                field1770[field1785++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field1785 -= 2;
                int var234 = field1770[field1785];
                int var235 = field1770[field1785 + 1];
                field1770[field1785++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field1785 -= 2;
                int var236 = field1770[field1785];
                int var237 = field1770[field1785 + 1];
                field1770[field1785++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field1785 -= 2;
                int var238 = field1770[field1785];
                int var239 = field1770[field1785 + 1];
                field1770[field1785++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field1770[--field1785];
                field1770[field1785++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field1770[--field1785];
                field1770[field1785++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field1785 -= 5;
                int var242 = field1770[field1785];
                int var243 = field1770[field1785 + 1];
                int var244 = field1770[field1785 + 2];
                int var245 = field1770[field1785 + 3];
                int var246 = field1770[field1785 + 4];
                field1770[field1785++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field1785 -= 2;
                long var247 = (long) field1770[field1785];
                long var249 = (long) field1770[field1785 + 1];
                field1770[field1785++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field1785 -= 2;
                int var251 = field1770[field1785];
                int var252 = field1770[field1785 + 1];
                field1770[field1785++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field1785 -= 2;
                int var253 = field1770[field1785];
                int var254 = field1770[field1785 + 1];
                field1770[field1785++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field1785 -= 2;
                int var255 = field1770[field1785];
                int var256 = field1770[field1785 + 1];
                field1770[field1785++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field1785 -= 2;
                int var257 = field1770[field1785];
                int var258 = field1770[field1785 + 1];
                field1770[field1785++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field1785 -= 2;
                int var259 = field1770[field1785];
                int var260 = field1770[field1785 + 1];
                if (var259 == 0) {
                    field1770[field1785++] = 0;
                    return;
                }
                field1770[field1785++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field1785 -= 2;
                int var261 = field1770[field1785];
                int var262 = field1770[field1785 + 1];
                if (var261 == 0) {
                    field1770[field1785++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field1770[field1785++] = Integer.MAX_VALUE;
                    return;
                }
                field1770[field1785++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field1785 -= 2;
                int var263 = field1770[field1785];
                int var264 = field1770[field1785 + 1];
                field1770[field1785++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field1785 -= 2;
                int var265 = field1770[field1785];
                int var266 = field1770[field1785 + 1];
                field1770[field1785++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field1785 -= 2;
                int var267 = field1770[field1785];
                int var268 = field1770[field1785 + 1];
                field1770[field1785++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field1785 -= 2;
                int var269 = field1770[field1785];
                int var270 = field1770[field1785 + 1];
                field1770[field1785++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field1785 -= 3;
                long var271 = (long) field1770[field1785];
                long var273 = (long) field1770[field1785 + 1];
                long var275 = (long) field1770[field1785 + 2];
                field1770[field1785++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field1785 -= 2;
                int var277 = field1770[field1785];
                int var278 = field1770[field1785 + 1];
                if (var277 > 700 || var278 > 700) {
                    field1770[field1785++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field1770[field1785++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field1770[--field1785];
                field1770[field1785++] = class12.field211[class319.method1899(var281, (byte) 65) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field1786[--field1798];
                int var283 = field1770[--field1785];
                field1786[field1798++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field1798 -= 2;
                String var284 = field1786[field1798];
                String var285 = field1786[field1798 + 1];
                field1786[field1798++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field1786[--field1798];
                int var287 = field1770[--field1785];
                field1786[field1798++] = var286 + class355.method2085((byte) 97, true, var287);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field1786[--field1798];
                field1786[field1798++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field1786[field1798++] = class65.method548(-125, class770.field10592, class753.method4207(field1770[--field1785], 9144));
                return;
            }
            if (arg0 == 4105) {
                field1798 -= 2;
                String var289 = field1786[field1798];
                String var290 = field1786[field1798 + 1];
                if (class300.field3596.field7387 != null && class300.field3596.field7387.field3887) {
                    field1786[field1798++] = var290;
                    return;
                }
                field1786[field1798++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field1770[--field1785];
                field1786[field1798++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field1798 -= 2;
                field1770[field1785++] = class547.method3220(class770.field10592, true, field1786[field1798], field1786[field1798 + 1]);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field1786[--field1798];
                field1785 -= 2;
                int var293 = field1770[field1785];
                int var294 = field1770[field1785 + 1];
                class307 var295 = class158.method1111(var294, 0, class625.field8577, true);
                field1770[field1785++] = var295.method1812(class388.field5008, var292, -14563, var293);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field1786[--field1798];
                field1785 -= 2;
                int var297 = field1770[field1785];
                int var298 = field1770[field1785 + 1];
                class307 var299 = class158.method1111(var298, 0, class625.field8577, true);
                field1770[field1785++] = var299.method1815(false, class388.field5008, var296, var297);
                return;
            }
            if (arg0 == 4110) {
                field1798 -= 2;
                String var300 = field1786[field1798];
                String var301 = field1786[field1798 + 1];
                if (field1770[--field1785] == 1) {
                    field1786[field1798++] = var300;
                    return;
                }
                field1786[field1798++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field1786[--field1798];
                field1786[field1798++] = class386.method2265(false, var302);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field1786[--field1798];
                int var304 = field1770[--field1785];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field1786[field1798++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field1770[--field1785];
                field1770[field1785++] = method1037((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field1770[--field1785];
                field1770[field1785++] = class729.method4119(127, (char) var306) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field1770[--field1785];
                field1770[field1785++] = class349.method2067((char) var307, -123) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field1770[--field1785];
                field1770[field1785++] = class685.method3838((char) var308, 17201) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field1786[--field1798];
                if (var309 != null) {
                    field1770[field1785++] = var309.length();
                    return;
                }
                field1770[field1785++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field1786[--field1798];
                field1785 -= 2;
                int var311 = field1770[field1785];
                int var312 = field1770[field1785 + 1];
                field1786[field1798++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field1786[--field1798];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field1786[field1798++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field1786[--field1798];
                field1785 -= 2;
                int var319 = field1770[field1785];
                int var320 = field1770[field1785 + 1];
                field1770[field1785++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field1798 -= 2;
                String var321 = field1786[field1798];
                String var322 = field1786[field1798 + 1];
                int var323 = field1770[--field1785];
                field1770[field1785++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field1770[--field1785];
                field1770[field1785++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field1770[--field1785];
                field1770[field1785++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field1770[--field1785] != 0;
                int var327 = field1770[--field1785];
                field1786[field1798++] = class41.method342((long) var327, var326, class770.field10592, (byte) 87, 0);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field1786[--field1798];
                int var329 = field1770[--field1785];
                class307 var330 = class158.method1111(var329, 0, class625.field8577, true);
                field1770[field1785++] = var330.method1817(false, var328, class388.field5008);
                return;
            }
            if (arg0 == 4126) {
                field1786[field1798++] = class356.method2089(-4, true, class770.field10592, (long) field1770[--field1785] * 60000L) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field1772[--field1797];
                field1786[field1798++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field1770[--field1785];
                field1786[field1798++] = class121.field1555.method2882(var333, -22087).field4222;
                return;
            }
            if (arg0 == 4201) {
                field1785 -= 2;
                int var334 = field1770[field1785];
                int var335 = field1770[field1785 + 1];
                class340 var336 = class121.field1555.method2882(var334, -22087);
                if (var335 >= 1 && var335 <= 5 && var336.field4194[var335 - 1] != null) {
                    field1786[field1798++] = var336.field4194[var335 - 1];
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 4202) {
                field1785 -= 2;
                int var337 = field1770[field1785];
                int var338 = field1770[field1785 + 1];
                class340 var339 = class121.field1555.method2882(var337, -22087);
                if (var338 >= 1 && var338 <= 5 && var339.field4239[var338 - 1] != null) {
                    field1786[field1798++] = var339.field4239[var338 - 1];
                    return;
                }
                field1786[field1798++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field1770[--field1785];
                field1770[field1785++] = class121.field1555.method2882(var340, -22087).field4200;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field1770[--field1785];
                field1770[field1785++] = class121.field1555.method2882(var341, -22087).field4259 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field1770[--field1785];
                class340 var343 = class121.field1555.method2882(var342, -22087);
                if (var343.field4232 == -1 && var343.field4261 >= 0) {
                    field1770[field1785++] = var343.field4261;
                    return;
                }
                field1770[field1785++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field1770[--field1785];
                class340 var345 = class121.field1555.method2882(var344, -22087);
                if (var345.field4232 >= 0 && var345.field4261 >= 0) {
                    field1770[field1785++] = var345.field4261;
                    return;
                }
                field1770[field1785++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field1770[--field1785];
                field1770[field1785++] = class121.field1555.method2882(var346, -22087).field4227 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field1785 -= 2;
                int var347 = field1770[field1785];
                int var348 = field1770[field1785 + 1];
                class613 var349 = class113.field1426.method4366(true, var348);
                if (var349.method3472((byte) -121)) {
                    field1786[field1798++] = class121.field1555.method2882(var347, -22087).method2004(var348, -10390, var349.field8234);
                    return;
                }
                field1770[field1785++] = class121.field1555.method2882(var347, -22087).method2009((byte) -20, var349.field8244, var348);
                return;
            }
            if (arg0 == 4209) {
                field1785 -= 2;
                int var350 = field1770[field1785];
                int var351 = field1770[field1785 + 1] - 1;
                class340 var352 = class121.field1555.method2882(var350, -22087);
                if (var352.field4192 == var351) {
                    field1770[field1785++] = var352.field4195;
                    return;
                }
                if (var352.field4216 == var351) {
                    field1770[field1785++] = var352.field4223;
                    return;
                }
                field1770[field1785++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field1786[--field1798];
                int var354 = field1770[--field1785];
                class417.method2494((byte) -83, var353, var354 == 1);
                field1770[field1785++] = class689.field9390;
                return;
            }
            if (arg0 == 4211) {
                if (class734.field10262 != null && class267.field3159 < class689.field9390) {
                    field1770[field1785++] = class734.field10262[class267.field3159++] & 0xFFFF;
                    return;
                }
                field1770[field1785++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class267.field3159 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field1770[--field1785];
                field1770[field1785++] = class121.field1555.method2882(var355, -22087).field4257;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field1786[--field1798];
                field1785 -= 3;
                int var357 = field1770[field1785];
                int var358 = field1770[field1785 + 1];
                int var359 = field1770[field1785 + 2];
                class296.method1729(var358, var357 == 1, var359, false, var356);
                field1770[field1785++] = class689.field9390;
                return;
            }
            if (arg0 == 4215) {
                field1798 -= 2;
                field1785 -= 2;
                String var360 = field1786[field1798];
                int var361 = field1770[field1785];
                int var362 = field1770[field1785 + 1];
                String var363 = field1786[field1798 + 1];
                class430.method2553(var363, (byte) -121, var362, var360, var361 == 1);
                field1770[field1785++] = class689.field9390;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field1785 -= 2;
                int var364 = field1770[field1785];
                int var365 = field1770[field1785 + 1];
                class613 var366 = class113.field1426.method4366(true, var365);
                if (var366.method3472((byte) -120)) {
                    field1786[field1798++] = class444.field5956.method1070(var364, true).method2846(var365, (byte) -22, var366.field8234);
                    return;
                }
                field1770[field1785++] = class444.field5956.method1070(var364, true).method2852(var365, var366.field8244, 255);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field1785 -= 2;
                int var367 = field1770[field1785];
                int var368 = field1770[field1785 + 1];
                class613 var369 = class113.field1426.method4366(true, var368);
                if (var369.method3472((byte) -120)) {
                    field1786[field1798++] = class379.field4811.method4192(27324, var367).method1184(var369.field8234, (byte) -121, var368);
                    return;
                }
                field1770[field1785++] = class379.field4811.method4192(27324, var367).method1187(67783, var368, var369.field8244);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field1785 -= 2;
                int var370 = field1770[field1785];
                int var371 = field1770[field1785 + 1];
                class613 var372 = class113.field1426.method4366(true, var371);
                if (var372.method3472((byte) -121)) {
                    field1786[field1798++] = class347.field4336.method1024(var370, 26).method2892(-3, var371, var372.field8234);
                    return;
                }
                field1770[field1785++] = class347.field4336.method1024(var370, 26).method2890(var371, var372.field8244, -13);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field1770[--field1785];
                class15 var374 = class249.field2932.method1415((byte) -124, var373);
                if (var374.field239 != null && var374.field239.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field231[0];
                    for (int var377 = 1; var377 < var374.field239.length; var377++) {
                        if (var374.field231[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field231[var377];
                        }
                    }
                    field1770[field1785++] = var374.field239[var375];
                    return;
                }
                field1770[field1785++] = var374.field286;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field1770[field1785++] = class200.field2406 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field1786[--field1798];
                if (class289.field3493 == 7 && !class46.method414(-22723)) {
                    if (var378.length() > 20) {
                        class647.field8813 = -4;
                        return;
                    }
                    class647.field8813 = -1;
                    class336 var379 = class512.method3076(class108.field1359, class591.field8030, (byte) 105);
                    var379.field4150.method2353(-90, 0);
                    int var380 = var379.field4150.field5262;
                    var379.field4150.method2388(255, var378);
                    var379.field4150.method2366(-1, var379.field4150.field5262 - var380);
                    class578.method3334(4, var379);
                    return;
                }
                class647.field8813 = -5;
                return;
            }
            if (arg0 == 4702) {
                field1770[field1785++] = class647.field8813;
                if (class647.field8813 != -1) {
                    class647.field8813 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "(I)V")
    public static final void method1043(int arg0) {
        if (arg0 == -1 || !class647.method3652(arg0, 0)) {
            return;
        }
        class620[] var1 = class316.field3880[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class620 var3 = var1[var2];
            if (var3.field8458 != null) {
                class529 var4 = new class529();
                var4.field7473 = var3;
                var4.field7477 = var3.field8458;
                method1029(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "(I)J")
    private static final long method1044(int arg0) {
        Long var1 = field1769.method2967(0, class672.field9229.field5926 << 16 | arg0);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lis;)V")
    public static final void method1045(class529 arg0) {
        method1029(arg0, 200000);
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "()V")
    public static void method1046() {
        field1783 = null;
        field1792 = null;
        field1784 = null;
        field1777 = null;
        field1796 = null;
        field1770 = null;
        field1786 = null;
        field1772 = null;
        field1794 = null;
        field1791 = null;
        field1776 = null;
        field1799 = null;
        field1769 = null;
        field1778 = null;
        field1788 = null;
        field1780 = null;
    }
}
