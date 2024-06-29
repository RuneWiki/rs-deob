import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class122 {

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "[I")
    private static int[] field1782 = new int[5];

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field1790 = new String[1000];

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    private static int field1785 = 0;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "[Ltc;")
    private static class233[] field1792 = new class233[50];

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "[[I")
    private static int[][] field1798 = new int[5][5000];

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    private static int field1793 = 0;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "[I")
    private static int[] field1799 = new int[1000];

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    private static int field1796 = 0;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1778 = Calendar.getInstance();

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "[I")
    private static int[] field1801 = new int[3];

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field1803 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Ljp;")
    public static class236 field1802 = new class236(4);

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
    private static int field1804 = 0;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Lcr;")
    private static class403 field1776;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "Lcr;")
    private static class403 field1797;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lam;")
    private static class445 field1779;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "[I")
    private static int[] field1795;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field1784;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 6)
    private static final void method886(int arg0) {
        class403 var1 = class213.method1345((byte) 58, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class403[] var3 = class462.field6402[var2];
        if (var3 == null) {
            class403[] var4 = class238.field3185[var2];
            int var5 = var4.length;
            var3 = class462.field6402[var2] = new class403[var5];
            class254.method1533(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class254.method1533(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V", line = 45)
    private static final void method887(int arg0) {
        class403 var1 = class213.method1345((byte) 27, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class403[] var3 = class462.field6402[var2];
        if (var3 == null) {
            class403[] var4 = class238.field3185[var2];
            int var5 = var4.length;
            var3 = class462.field6402[var2] = new class403[var5];
            class254.method1533(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class254.method1533(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ldk;I)V", line = 85)
    private static final void method888(class353 arg0, int arg1) {
        Object[] var2 = arg0.field4772;
        int var3 = (Integer) var2[0];
        class318 var4 = class479.method2747(false, var3);
        if (var4 == null) {
            return;
        }
        field1795 = new int[var4.field4164];
        int var5 = 0;
        field1784 = new String[var4.field4167];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4775;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4768;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4770 == null ? -1 : arg0.field4770.field5431;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4767;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4770 == null ? -1 : arg0.field4770.field5553;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4764 == null ? -1 : arg0.field4764.field5431;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4764 == null ? -1 : arg0.field4764.field5553;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4771;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4769;
                }
                field1795[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4773;
                }
                field1784[var6++] = var9;
            }
        }
        field1804 = arg0.field4776;
        method896(var4, arg1);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V", line = 163)
    public static final void method889(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "()V", line = 170)
    public static void method890() {
        field1795 = null;
        field1784 = null;
        field1782 = null;
        field1798 = null;
        field1799 = null;
        field1790 = null;
        field1792 = null;
        field1797 = null;
        field1776 = null;
        field1779 = null;
        field1778 = null;
        field1803 = null;
        field1801 = null;
        field1802 = null;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)Ljava/lang/String;", line = 194)
    private static final String method891(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field1778.setTime(new Date(var1));
        int var3 = field1778.get(5);
        int var4 = field1778.get(2);
        int var5 = field1778.get(1);
        return var3 + "-" + field1803[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lsl;II)V", line = 206)
    public static final void method892(class317 arg0, int arg1, int arg2) {
        class318 var3 = class4.method24(arg2, true, arg0, arg1);
        if (var3 == null) {
            return;
        }
        field1795 = new int[var3.field4164];
        field1784 = new String[var3.field4167];
        if (class96.field1459 == var3.field4168 || class67.field1024 == var3.field4168 || class507.field7045 == var3.field4168) {
            int var4 = 0;
            int var5 = 0;
            if (class53.field836 != null) {
                var4 = class53.field836.field5438;
                var5 = class53.field836.field5537;
            }
            field1795[0] = class267.field3526.method1302(-4362) - var4;
            field1795[1] = class267.field3526.method1297(true) - var5;
        }
        method896(var3, 200000);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ldk;)V", line = 236)
    public static final void method893(class353 arg0) {
        method888(arg0, 200000);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 239)
    private static final void method894(String arg0, int arg1) {
        if (class196.field2745 == 0 && !(!class16.field282 || class513.field7557) || class362.field4900) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class439.field6031.method1764(0, false))) {
            var3 = 0;
            arg0 = arg0.substring(class439.field6031.method1764(0, false).length());
        } else if (var2.startsWith(class344.field4549.method1764(0, false))) {
            var3 = 1;
            arg0 = arg0.substring(class344.field4549.method1764(0, false).length());
        } else if (var2.startsWith(class479.field6600.method1764(0, false))) {
            var3 = 2;
            arg0 = arg0.substring(class479.field6600.method1764(0, false).length());
        } else if (var2.startsWith(class309.field4062.method1764(0, false))) {
            var3 = 3;
            arg0 = arg0.substring(class309.field4062.method1764(0, false).length());
        } else if (var2.startsWith(class232.field3125.method1764(0, false))) {
            var3 = 4;
            arg0 = arg0.substring(class232.field3125.method1764(0, false).length());
        } else if (var2.startsWith(class193.field2710.method1764(0, false))) {
            var3 = 5;
            arg0 = arg0.substring(class193.field2710.method1764(0, false).length());
        } else if (var2.startsWith(class348.field4705.method1764(0, false))) {
            var3 = 6;
            arg0 = arg0.substring(class348.field4705.method1764(0, false).length());
        } else if (var2.startsWith(class387.field5262.method1764(0, false))) {
            var3 = 7;
            arg0 = arg0.substring(class387.field5262.method1764(0, false).length());
        } else if (var2.startsWith(class112.field1594.method1764(0, false))) {
            var3 = 8;
            arg0 = arg0.substring(class112.field1594.method1764(0, false).length());
        } else if (var2.startsWith(class480.field6631.method1764(0, false))) {
            var3 = 9;
            arg0 = arg0.substring(class480.field6631.method1764(0, false).length());
        } else if (var2.startsWith(class287.field3756.method1764(0, false))) {
            var3 = 10;
            arg0 = arg0.substring(class287.field3756.method1764(0, false).length());
        } else if (var2.startsWith(class413.field5712.method1764(0, false))) {
            var3 = 11;
            arg0 = arg0.substring(class413.field5712.method1764(0, false).length());
        } else if (class489.field6789 != 0) {
            if (var2.startsWith(class439.field6031.method1764(class489.field6789, false))) {
                var3 = 0;
                arg0 = arg0.substring(class439.field6031.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class344.field4549.method1764(class489.field6789, false))) {
                var3 = 1;
                arg0 = arg0.substring(class344.field4549.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class479.field6600.method1764(class489.field6789, false))) {
                var3 = 2;
                arg0 = arg0.substring(class479.field6600.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class309.field4062.method1764(class489.field6789, false))) {
                var3 = 3;
                arg0 = arg0.substring(class309.field4062.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class232.field3125.method1764(class489.field6789, false))) {
                var3 = 4;
                arg0 = arg0.substring(class232.field3125.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class193.field2710.method1764(class489.field6789, false))) {
                var3 = 5;
                arg0 = arg0.substring(class193.field2710.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class348.field4705.method1764(class489.field6789, false))) {
                var3 = 6;
                arg0 = arg0.substring(class348.field4705.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class387.field5262.method1764(class489.field6789, false))) {
                var3 = 7;
                arg0 = arg0.substring(class387.field5262.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class112.field1594.method1764(class489.field6789, false))) {
                var3 = 8;
                arg0 = arg0.substring(class112.field1594.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class480.field6631.method1764(class489.field6789, false))) {
                var3 = 9;
                arg0 = arg0.substring(class480.field6631.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class287.field3756.method1764(class489.field6789, false))) {
                var3 = 10;
                arg0 = arg0.substring(class287.field3756.method1764(class489.field6789, false).length());
            } else if (var2.startsWith(class413.field5712.method1764(class489.field6789, false))) {
                var3 = 11;
                arg0 = arg0.substring(class413.field5712.method1764(class489.field6789, false).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class288.field3771.method1764(0, false))) {
            var5 = 1;
            arg0 = arg0.substring(class288.field3771.method1764(0, false).length());
        } else if (var4.startsWith(class16.field286.method1764(0, false))) {
            var5 = 2;
            arg0 = arg0.substring(class16.field286.method1764(0, false).length());
        } else if (var4.startsWith(class21.field376.method1764(0, false))) {
            var5 = 3;
            arg0 = arg0.substring(class21.field376.method1764(0, false).length());
        } else if (var4.startsWith(class189.field2660.method1764(0, false))) {
            var5 = 4;
            arg0 = arg0.substring(class189.field2660.method1764(0, false).length());
        } else if (var4.startsWith(class117.field1678.method1764(0, false))) {
            var5 = 5;
            arg0 = arg0.substring(class117.field1678.method1764(0, false).length());
        } else if (class489.field6789 != 0) {
            if (var4.startsWith(class288.field3771.method1764(class489.field6789, false))) {
                var5 = 1;
                arg0 = arg0.substring(class288.field3771.method1764(class489.field6789, false).length());
            } else if (var4.startsWith(class16.field286.method1764(class489.field6789, false))) {
                var5 = 2;
                arg0 = arg0.substring(class16.field286.method1764(class489.field6789, false).length());
            } else if (var4.startsWith(class21.field376.method1764(class489.field6789, false))) {
                var5 = 3;
                arg0 = arg0.substring(class21.field376.method1764(class489.field6789, false).length());
            } else if (var4.startsWith(class189.field2660.method1764(class489.field6789, false))) {
                var5 = 4;
                arg0 = arg0.substring(class189.field2660.method1764(class489.field6789, false).length());
            } else if (var4.startsWith(class117.field1678.method1764(class489.field6789, false))) {
                var5 = 5;
                arg0 = arg0.substring(class117.field1678.method1764(class489.field6789, false).length());
            }
        }
        field1787++;
        class118.method822(-122, class507.field7040);
        class193.field2708.method2200(7, 0);
        int var6 = class193.field2708.field5173;
        if (arg1 == 5021) {
            class193.field2708.method2200(7, 1);
        } else if (arg1 == 5022) {
            class193.field2708.method2200(7, 2);
        } else {
            class193.field2708.method2200(7, 0);
        }
        class193.field2708.method2200(7, var3);
        class193.field2708.method2200(7, var5);
        class423.method2439(arg0, -3097, class193.field2708);
        class193.field2708.method2210(class193.field2708.field5173 - var6, (byte) 109);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "()V", line = 523)
    public static final void method895() {
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lsj;I)V", line = 533)
    private static final void method896(class318 arg0, int arg1) {
        field1793 = 0;
        field1796 = 0;
        int var2 = -1;
        int[] var3 = arg0.field4171;
        int[] var4 = arg0.field4163;
        byte var5 = -1;
        field1785 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
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
                        method898(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method899(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field1799[field1793++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field1799[field1793++] = class301.field3980.field3856[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class301.field3980.method1722(-84, field1799[--field1793], var8);
                } else if (var43 == 3) {
                    field1790[field1796++] = arg0.field4177[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field1793 -= 2;
                    if (field1799[field1793 + 1] != field1799[field1793]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field1793 -= 2;
                    if (field1799[field1793 + 1] == field1799[field1793]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field1793 -= 2;
                    if (field1799[field1793] < field1799[field1793 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field1793 -= 2;
                    if (field1799[field1793] > field1799[field1793 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field1785 == 0) {
                        return;
                    }
                    class233 var9 = field1792[--field1785];
                    arg0 = var9.field3133;
                    var3 = arg0.field4171;
                    var4 = arg0.field4163;
                    var2 = var9.field3136;
                    field1795 = var9.field3135;
                    field1784 = var9.field3130;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field1799[field1793++] = class301.field3980.method1395(var10, (byte) 84);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class301.field3980.method1729(var11, field1799[--field1793], -122);
                } else if (var43 == 31) {
                    field1793 -= 2;
                    if (field1799[field1793] <= field1799[field1793 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field1793 -= 2;
                    if (field1799[field1793] >= field1799[field1793 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field1799[field1793++] = field1795[var4[var2]];
                } else if (var43 == 34) {
                    field1795[var4[var2]] = field1799[--field1793];
                } else if (var43 == 35) {
                    field1790[field1796++] = field1784[var4[var2]];
                } else if (var43 == 36) {
                    field1784[var4[var2]] = field1790[--field1796];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field1796 -= var12;
                    String var13 = class37.method288(var12, field1790, (byte) 8, field1796);
                    field1790[field1796++] = var13;
                } else if (var43 == 38) {
                    field1793--;
                } else if (var43 == 39) {
                    field1796--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class318 var15 = class479.method2747(false, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field4164];
                    String[] var17 = new String[var15.field4167];
                    for (int var18 = 0; var18 < var15.field4178; var18++) {
                        var16[var18] = field1799[field1793 + var18 - var15.field4178];
                    }
                    for (int var19 = 0; var19 < var15.field4173; var19++) {
                        var17[var19] = field1790[field1796 + var19 - var15.field4173];
                    }
                    field1793 -= var15.field4178;
                    field1796 -= var15.field4173;
                    class233 var20 = new class233();
                    var20.field3133 = arg0;
                    var20.field3136 = var2;
                    var20.field3135 = field1795;
                    var20.field3130 = field1784;
                    if (field1785 >= field1792.length) {
                        throw new RuntimeException();
                    }
                    field1792[field1785++] = var20;
                    arg0 = var15;
                    var3 = var15.field4171;
                    var4 = var15.field4163;
                    var2 = -1;
                    field1795 = var16;
                    field1784 = var17;
                } else if (var43 == 42) {
                    field1799[field1793++] = class98.field1478[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class98.field1478[var21] = field1799[--field1793];
                    class394.method2311(var21, 4857);
                    class269.field3538 |= class131.field1900[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field1799[--field1793];
                    if (var24 >= 0 && var24 <= 5000) {
                        field1782[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field1798[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field1799[--field1793];
                    if (var28 < 0 || var28 >= field1782[var27]) {
                        throw new RuntimeException();
                    }
                    field1799[field1793++] = field1798[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field1793 -= 2;
                    int var30 = field1799[field1793];
                    if (var30 < 0 || var30 >= field1782[var29]) {
                        throw new RuntimeException();
                    }
                    field1798[var29][var30] = field1799[field1793 + 1];
                } else if (var43 == 47) {
                    String var31 = class344.field4551[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field1790[field1796++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class344.field4551[var32] = field1790[--field1796];
                    class420.method2418(var32, 107);
                } else if (var43 == 51) {
                    class18 var33 = arg0.field4169[var4[var2]];
                    class387 var34 = (class387) var33.method182((long) field1799[--field1793], (byte) 94);
                    if (var34 != null) {
                        var2 += var34.field5264;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field4176 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field622).append(" ");
                for (int var41 = field1785 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field1792[var41].field3133.field622).append(" ");
                }
                var40.append("op: ").append(var5);
                class504.method2879(var42, var40.toString(), -19638);
            } else {
                class414.method2404("Clientscript error in: " + arg0.field4176, -74);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field4176).append("\n");
                for (int var38 = field1785 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field1792[var38].field3133.field4176).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class504.method2879(var42, var37.toString(), -19638);
                class176.method1181(var37.toString(), false);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V", line = 980)
    public static final void method897(int arg0) {
        if (arg0 == -1 || !class28.method230(arg0, 117)) {
            return;
        }
        class403[] var1 = class238.field3185[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class403 var3 = var1[var2];
            if (var3.field5430 != null) {
                class353 var4 = new class353();
                var4.field4770 = var3;
                var4.field4772 = var3.field5430;
                method888(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(IZ)V", line = 1009)
    private static final void method898(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field1793 -= 3;
                int var2 = field1799[field1793];
                int var3 = field1799[field1793 + 1];
                int var4 = field1799[field1793 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class403 var5 = class213.method1345((byte) 85, var2);
                if (var5.field5420 == null) {
                    var5.field5420 = new class403[var4 + 1];
                }
                if (var5.field5420.length <= var4) {
                    class403[] var6 = new class403[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5420.length; var7++) {
                        var6[var7] = var5.field5420[var7];
                    }
                    var5.field5420 = var6;
                }
                if (var4 > 0 && var5.field5420[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class403 var8 = new class403();
                var8.field5480 = var3;
                var8.field5517 = var8.field5431 = var5.field5431;
                var8.field5553 = var4;
                var5.field5420[var4] = var8;
                if (arg1) {
                    field1776 = var8;
                } else {
                    field1797 = var8;
                }
                class412.method2378(var5, (byte) -125);
                return;
            }
            if (arg0 == 101) {
                class403 var9 = arg1 ? field1776 : field1797;
                if (var9.field5553 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class403 var10 = class213.method1345((byte) -116, var9.field5431);
                var10.field5420[var9.field5553] = null;
                class412.method2378(var10, (byte) -117);
                return;
            }
            if (arg0 == 102) {
                class403 var11 = class213.method1345((byte) -103, field1799[--field1793]);
                var11.field5420 = null;
                class412.method2378(var11, (byte) -121);
                return;
            }
            if (arg0 == 200) {
                field1793 -= 2;
                int var12 = field1799[field1793];
                int var13 = field1799[field1793 + 1];
                class403 var14 = class381.method2261(-10673, var12, var13);
                if (var14 != null && var13 != -1) {
                    field1799[field1793++] = 1;
                    if (arg1) {
                        field1776 = var14;
                        return;
                    }
                    field1797 = var14;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1799[--field1793];
                class403 var16 = class213.method1345((byte) 125, var15);
                if (var16 != null) {
                    field1799[field1793++] = 1;
                    if (arg1) {
                        field1776 = var16;
                        return;
                    }
                    field1797 = var16;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1799[--field1793];
                method887(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1799[--field1793];
                method886(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1793 -= 2;
                int var19 = field1799[field1793];
                int var20 = field1799[field1793 + 1];
                for (int var21 = 0; var21 < class73.field1108.length; var21++) {
                    if (class73.field1108[var21] == var19) {
                        class385.field5232.field7627.method2752(var20, Integer.MIN_VALUE, class204.field2828, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class192.field2697.length; var22++) {
                    if (class192.field2697[var22] == var19) {
                        class385.field5232.field7627.method2752(var20, Integer.MIN_VALUE, class204.field2828, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1793 -= 2;
                int var23 = field1799[field1793];
                int var24 = field1799[field1793 + 1];
                class385.field5232.field7627.method2753(var23, var24, (byte) 119);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1799[--field1793] != 0;
                class385.field5232.field7627.method2756(var25, (byte) -48);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class403 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class213.method1345((byte) 11, field1799[--field1793]);
            } else {
                var26 = arg1 ? field1776 : field1797;
            }
            if (arg0 == 1000) {
                field1793 -= 4;
                var26.field5470 = field1799[field1793];
                var26.field5475 = field1799[field1793 + 1];
                int var27 = field1799[field1793 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field1799[field1793 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field5521 = (byte) var27;
                var26.field5469 = (byte) var28;
                class412.method2378(var26, (byte) -115);
                class275.method1646(var26, 29958);
                if (var26.field5553 == -1) {
                    class481.method2761(0, var26.field5431);
                }
                return;
            }
            if (arg0 == 1001) {
                field1793 -= 4;
                var26.field5536 = field1799[field1793];
                var26.field5432 = field1799[field1793 + 1];
                var26.field5496 = 0;
                var26.field5561 = 0;
                int var29 = field1799[field1793 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field1799[field1793 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field5467 = (byte) var29;
                var26.field5563 = (byte) var30;
                class412.method2378(var26, (byte) -115);
                class275.method1646(var26, 29958);
                if (var26.field5480 == 0) {
                    class388.method2290(127, false, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field1799[--field1793] == 1;
                if (var26.field5550 != var31) {
                    var26.field5550 = var31;
                    class412.method2378(var26, (byte) -116);
                }
                if (var26.field5553 == -1) {
                    class260.method1571(var26.field5431, -95);
                }
                return;
            }
            if (arg0 == 1004) {
                field1793 -= 2;
                var26.field5451 = field1799[field1793];
                var26.field5474 = field1799[field1793 + 1];
                class412.method2378(var26, (byte) -122);
                class275.method1646(var26, 29958);
                if (var26.field5480 == 0) {
                    class388.method2290(-44, false, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field5535 = field1799[--field1793] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class403 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class213.method1345((byte) -119, field1799[--field1793]);
            } else {
                var32 = arg1 ? field1776 : field1797;
            }
            if (arg0 == 1100) {
                field1793 -= 2;
                var32.field5520 = field1799[field1793];
                if (var32.field5520 > var32.field5473 - var32.field5450) {
                    var32.field5520 = var32.field5473 - var32.field5450;
                }
                if (var32.field5520 < 0) {
                    var32.field5520 = 0;
                }
                var32.field5442 = field1799[field1793 + 1];
                if (var32.field5442 > var32.field5472 - var32.field5404) {
                    var32.field5442 = var32.field5472 - var32.field5404;
                }
                if (var32.field5442 < 0) {
                    var32.field5442 = 0;
                }
                class412.method2378(var32, (byte) -115);
                if (var32.field5553 == -1) {
                    class354.method2072((byte) 44, var32.field5431);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field5436 = field1799[--field1793];
                class412.method2378(var32, (byte) -126);
                if (var32.field5553 == -1) {
                    class225.method1413(var32.field5431, (byte) -125);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field5493 = field1799[--field1793] == 1;
                class412.method2378(var32, (byte) -125);
                return;
            }
            if (arg0 == 1103) {
                var32.field5401 = field1799[--field1793];
                class412.method2378(var32, (byte) -128);
                return;
            }
            if (arg0 == 1104) {
                var32.field5548 = field1799[--field1793];
                class412.method2378(var32, (byte) -125);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field1799[--field1793];
                if (var32.field5424 != var33) {
                    var32.field5424 = var33;
                    class412.method2378(var32, (byte) -125);
                }
                if (var32.field5553 == -1) {
                    class146.method1006(71, var32.field5431);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field5529 = field1799[--field1793];
                class412.method2378(var32, (byte) -121);
                return;
            }
            if (arg0 == 1107) {
                var32.field5408 = field1799[--field1793] == 1;
                class412.method2378(var32, (byte) -125);
                return;
            }
            if (arg0 == 1108) {
                var32.field5516 = 1;
                var32.field5510 = field1799[--field1793];
                class412.method2378(var32, (byte) -123);
                if (var32.field5553 == -1) {
                    class168.method1129(var32.field5431, (byte) 104);
                }
                return;
            }
            if (arg0 == 1109) {
                field1793 -= 6;
                var32.field5405 = field1799[field1793];
                var32.field5527 = field1799[field1793 + 1];
                var32.field5556 = field1799[field1793 + 2];
                var32.field5546 = field1799[field1793 + 3];
                var32.field5457 = field1799[field1793 + 4];
                var32.field5434 = field1799[field1793 + 5];
                class412.method2378(var32, (byte) -124);
                if (var32.field5553 == -1) {
                    class318.method1839((byte) 68, var32.field5431);
                    class226.method1416(-88, var32.field5431);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field1799[--field1793];
                if (var32.field5415 != var34) {
                    var32.field5415 = var34;
                    var32.field5543 = 0;
                    var32.field5484 = 1;
                    var32.field5477 = 0;
                    class412.method2378(var32, (byte) -113);
                }
                if (var32.field5553 == -1) {
                    client.method1249(var32.field5431, (byte) 36);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field5508 = field1799[--field1793] == 1;
                class412.method2378(var32, (byte) -116);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field1790[--field1796];
                if (!var35.equals(var32.field5479)) {
                    var32.field5479 = var35;
                    class412.method2378(var32, (byte) -125);
                }
                if (var32.field5553 == -1) {
                    class448.method2570(var32.field5431, (byte) 94);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field5531 = field1799[--field1793];
                class412.method2378(var32, (byte) -124);
                if (var32.field5553 == -1) {
                    class300.method1751(var32.field5431, 14271);
                }
                return;
            }
            if (arg0 == 1114) {
                field1793 -= 3;
                var32.field5465 = field1799[field1793];
                var32.field5414 = field1799[field1793 + 1];
                var32.field5406 = field1799[field1793 + 2];
                class412.method2378(var32, (byte) -126);
                return;
            }
            if (arg0 == 1115) {
                var32.field5552 = field1799[--field1793] == 1;
                class412.method2378(var32, (byte) -116);
                return;
            }
            if (arg0 == 1116) {
                var32.field5416 = field1799[--field1793];
                class412.method2378(var32, (byte) -114);
                return;
            }
            if (arg0 == 1117) {
                var32.field5489 = field1799[--field1793];
                class412.method2378(var32, (byte) -128);
                return;
            }
            if (arg0 == 1118) {
                var32.field5444 = field1799[--field1793] == 1;
                class412.method2378(var32, (byte) -126);
                return;
            }
            if (arg0 == 1119) {
                var32.field5555 = field1799[--field1793] == 1;
                class412.method2378(var32, (byte) -116);
                return;
            }
            if (arg0 == 1120) {
                field1793 -= 2;
                var32.field5473 = field1799[field1793];
                var32.field5472 = field1799[field1793 + 1];
                class412.method2378(var32, (byte) -116);
                if (var32.field5480 == 0) {
                    class388.method2290(-36, false, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field1793 -= 2;
                var32.field5507 = (short) field1799[field1793];
                var32.field5423 = (short) field1799[field1793 + 1];
                class412.method2378(var32, (byte) -125);
                return;
            }
            if (arg0 == 1122) {
                var32.field5488 = field1799[--field1793] == 1;
                class412.method2378(var32, (byte) -124);
                return;
            }
            if (arg0 == 1123) {
                var32.field5434 = field1799[--field1793];
                class412.method2378(var32, (byte) -122);
                if (var32.field5553 == -1) {
                    class318.method1839((byte) 74, var32.field5431);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field1799[--field1793];
                var32.field5494 = var36 == 1;
                class412.method2378(var32, (byte) -120);
                return;
            }
            if (arg0 == 1125) {
                field1793 -= 2;
                var32.field5524 = field1799[field1793];
                var32.field5421 = field1799[field1793 + 1];
                class412.method2378(var32, (byte) -114);
                return;
            }
            if (arg0 == 1126) {
                var32.field5534 = field1799[--field1793];
                class412.method2378(var32, (byte) -115);
                return;
            }
            if (arg0 == 1127) {
                field1793 -= 2;
                int var37 = field1799[field1793];
                int var38 = field1799[field1793 + 1];
                class495 var39 = class270.field3546.method693(var37, -108);
                if (var39.field6873 != var38) {
                    var32.method2348(var37, (byte) 122, var38);
                    return;
                }
                var32.method2352(var37, -1325689497);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field1799[--field1793];
                String var41 = field1790[--field1796];
                class495 var42 = class270.field3546.method693(var40, 126);
                if (!var42.field6875.equals(var41)) {
                    var32.method2350(true, var40, var41);
                    return;
                }
                var32.method2352(var40, -1325689497);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class403 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class213.method1345((byte) -123, field1799[--field1793]);
            } else {
                var43 = arg1 ? field1776 : field1797;
            }
            class412.method2378(var43, (byte) -116);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1793 -= 2;
                int var44 = field1799[field1793];
                int var45 = field1799[field1793 + 1];
                if (var43.field5553 == -1) {
                    class342.method1983(var43.field5431, 2529);
                    class318.method1839((byte) 68, var43.field5431);
                    class226.method1416(62, var43.field5431);
                }
                if (var44 == -1) {
                    var43.field5516 = 1;
                    var43.field5510 = -1;
                    var43.field5530 = -1;
                    return;
                }
                var43.field5530 = var44;
                var43.field5541 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field5461 = true;
                } else {
                    var43.field5461 = false;
                }
                class482 var46 = class127.field1852.method2390(77, var44);
                var43.field5556 = var46.field6704;
                var43.field5546 = var46.field6668;
                var43.field5457 = var46.field6694;
                var43.field5405 = var46.field6714;
                var43.field5527 = var46.field6654;
                var43.field5434 = var46.field6678;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field5499 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field5499 = 1;
                } else {
                    var43.field5499 = 2;
                }
                if (var43.field5496 > 0) {
                    var43.field5434 = var43.field5434 * 32 / var43.field5496;
                    return;
                }
                if (var43.field5536 > 0) {
                    var43.field5434 = var43.field5434 * 32 / var43.field5536;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field5516 = 2;
                var43.field5510 = field1799[--field1793];
                if (var43.field5553 == -1) {
                    class168.method1129(var43.field5431, (byte) 104);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field5516 = 3;
                var43.field5510 = -1;
                if (var43.field5553 == -1) {
                    class168.method1129(var43.field5431, (byte) 104);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field5516 = 6;
                var43.field5510 = field1799[--field1793];
                if (var43.field5553 == -1) {
                    class168.method1129(var43.field5431, (byte) 104);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field5516 = 5;
                var43.field5510 = field1799[--field1793];
                if (var43.field5553 == -1) {
                    class168.method1129(var43.field5431, (byte) 104);
                }
                return;
            }
            if (arg0 == 1206) {
                field1793 -= 4;
                var43.field5518 = field1799[field1793];
                var43.field5459 = field1799[field1793 + 1];
                var43.field5448 = field1799[field1793 + 2];
                var43.field5439 = field1799[field1793 + 3];
                class412.method2378(var43, (byte) -118);
                return;
            }
            if (arg0 == 1207) {
                field1793 -= 2;
                var43.field5458 = field1799[field1793];
                var43.field5498 = field1799[field1793 + 1];
                class412.method2378(var43, (byte) -127);
                return;
            }
            if (arg0 == 1210) {
                field1793 -= 4;
                var43.field5510 = field1799[field1793];
                var43.field5419 = field1799[field1793 + 1];
                if (field1799[field1793 + 2] == 1) {
                    var43.field5516 = 9;
                } else {
                    var43.field5516 = 8;
                }
                if (field1799[field1793 + 3] == 1) {
                    var43.field5461 = true;
                } else {
                    var43.field5461 = false;
                }
                if (var43.field5553 == -1) {
                    class168.method1129(var43.field5431, (byte) 104);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field5516 = 5;
                var43.field5510 = class391.field5305;
                var43.field5419 = 0;
                if (var43.field5553 == -1) {
                    class168.method1129(var43.field5431, (byte) 104);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class403 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class213.method1345((byte) 67, field1799[--field1793]);
                } else {
                    var58 = arg1 ? field1776 : field1797;
                }
                String var59 = field1790[--field1796];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field1799[--field1793];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field1799[--field1793];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field1790[--field1796];
                    } else {
                        var62[var63] = Integer.valueOf(field1799[--field1793]);
                    }
                }
                int var64 = field1799[--field1793];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field5522 = var62;
                } else if (arg0 == 1401) {
                    var58.field5466 = var62;
                } else if (arg0 == 1402) {
                    var58.field5491 = var62;
                } else if (arg0 == 1403) {
                    var58.field5526 = var62;
                } else if (arg0 == 1404) {
                    var58.field5433 = var62;
                } else if (arg0 == 1405) {
                    var58.field5446 = var62;
                } else if (arg0 == 1406) {
                    var58.field5497 = var62;
                } else if (arg0 == 1407) {
                    var58.field5409 = var62;
                    var58.field5447 = var60;
                } else if (arg0 == 1408) {
                    var58.field5453 = var62;
                } else if (arg0 == 1409) {
                    var58.field5506 = var62;
                } else if (arg0 == 1410) {
                    var58.field5551 = var62;
                } else if (arg0 == 1411) {
                    var58.field5441 = var62;
                } else if (arg0 == 1412) {
                    var58.field5425 = var62;
                } else if (arg0 == 1414) {
                    var58.field5402 = var62;
                    var58.field5559 = var60;
                } else if (arg0 == 1415) {
                    var58.field5525 = var62;
                    var58.field5399 = var60;
                } else if (arg0 == 1416) {
                    var58.field5445 = var62;
                } else if (arg0 == 1417) {
                    var58.field5426 = var62;
                } else if (arg0 == 1418) {
                    var58.field5554 = var62;
                } else if (arg0 == 1419) {
                    var58.field5428 = var62;
                } else if (arg0 == 1420) {
                    var58.field5487 = var62;
                } else if (arg0 == 1421) {
                    var58.field5495 = var62;
                } else if (arg0 == 1422) {
                    var58.field5449 = var62;
                } else if (arg0 == 1423) {
                    var58.field5492 = var62;
                } else if (arg0 == 1424) {
                    var58.field5503 = var62;
                } else if (arg0 == 1425) {
                    var58.field5427 = var62;
                } else if (arg0 == 1426) {
                    var58.field5412 = var62;
                } else if (arg0 == 1427) {
                    var58.field5464 = var62;
                } else if (arg0 == 1428) {
                    var58.field5511 = var62;
                    var58.field5443 = var60;
                } else if (arg0 == 1429) {
                    var58.field5440 = var62;
                    var58.field5547 = var60;
                } else if (arg0 == 1430) {
                    var58.field5437 = var62;
                }
                var58.field5411 = true;
                return;
            }
            if (arg0 < 1600) {
                class403 var65 = arg1 ? field1776 : field1797;
                if (arg0 == 1500) {
                    field1799[field1793++] = var65.field5438;
                    return;
                }
                if (arg0 == 1501) {
                    field1799[field1793++] = var65.field5537;
                    return;
                }
                if (arg0 == 1502) {
                    field1799[field1793++] = var65.field5450;
                    return;
                }
                if (arg0 == 1503) {
                    field1799[field1793++] = var65.field5404;
                    return;
                }
                if (arg0 == 1504) {
                    field1799[field1793++] = var65.field5550 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field1799[field1793++] = var65.field5517;
                    return;
                }
                if (arg0 == 1506) {
                    class403 var66 = class298.method1744((byte) -122, var65);
                    field1799[field1793++] = var66 == null ? -1 : var66.field5431;
                    return;
                }
            } else if (arg0 < 1700) {
                class403 var67 = arg1 ? field1776 : field1797;
                if (arg0 == 1600) {
                    field1799[field1793++] = var67.field5520;
                    return;
                }
                if (arg0 == 1601) {
                    field1799[field1793++] = var67.field5442;
                    return;
                }
                if (arg0 == 1602) {
                    field1790[field1796++] = var67.field5479;
                    return;
                }
                if (arg0 == 1603) {
                    field1799[field1793++] = var67.field5473;
                    return;
                }
                if (arg0 == 1604) {
                    field1799[field1793++] = var67.field5472;
                    return;
                }
                if (arg0 == 1605) {
                    field1799[field1793++] = var67.field5434;
                    return;
                }
                if (arg0 == 1606) {
                    field1799[field1793++] = var67.field5556;
                    return;
                }
                if (arg0 == 1607) {
                    field1799[field1793++] = var67.field5457;
                    return;
                }
                if (arg0 == 1608) {
                    field1799[field1793++] = var67.field5546;
                    return;
                }
                if (arg0 == 1609) {
                    field1799[field1793++] = var67.field5401;
                    return;
                }
                if (arg0 == 1610) {
                    field1799[field1793++] = var67.field5405;
                    return;
                }
                if (arg0 == 1611) {
                    field1799[field1793++] = var67.field5527;
                    return;
                }
                if (arg0 == 1612) {
                    field1799[field1793++] = var67.field5424;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field1799[--field1793];
                    class495 var69 = class270.field3546.method693(var68, -33);
                    if (var69.method2845((byte) -85)) {
                        field1790[field1796++] = var67.method2349(var69.field6875, var68, (byte) -102);
                    } else {
                        field1799[field1793++] = var67.method2347(1, var69.field6873, var68);
                    }
                }
            } else if (arg0 < 1800) {
                class403 var70 = arg1 ? field1776 : field1797;
                if (arg0 == 1700) {
                    field1799[field1793++] = var70.field5530;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field5530 != -1) {
                        field1799[field1793++] = var70.field5541;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field1799[field1793++] = var70.field5553;
                    return;
                }
            } else if (arg0 < 1900) {
                class403 var71 = arg1 ? field1776 : field1797;
                if (arg0 == 1800) {
                    field1799[field1793++] = client.method1255(var71).method2046((byte) -78);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field1799[--field1793];
                    int var334 = var72 - 1;
                    if (var71.field5557 != null && var334 < var71.field5557.length && var71.field5557[var334] != null) {
                        field1790[field1796++] = var71.field5557[var334];
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field5544 == null) {
                        field1790[field1796++] = "";
                        return;
                    }
                    field1790[field1796++] = var71.field5544;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class403 var332;
                if (arg0 >= 2000) {
                    var332 = class213.method1345((byte) -113, field1799[--field1793]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field1776 : field1797;
                }
                if (field1804 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field5464 == null) {
                        return;
                    }
                    class353 var333 = new class353();
                    var333.field4770 = var332;
                    var333.field4772 = var332.field5464;
                    var333.field4776 = field1804 + 1;
                    class55.field869.method1666((byte) 101, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class403 var73 = class213.method1345((byte) 122, field1799[--field1793]);
                if (arg0 == 2500) {
                    field1799[field1793++] = var73.field5438;
                    return;
                }
                if (arg0 == 2501) {
                    field1799[field1793++] = var73.field5537;
                    return;
                }
                if (arg0 == 2502) {
                    field1799[field1793++] = var73.field5450;
                    return;
                }
                if (arg0 == 2503) {
                    field1799[field1793++] = var73.field5404;
                    return;
                }
                if (arg0 == 2504) {
                    field1799[field1793++] = var73.field5550 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field1799[field1793++] = var73.field5517;
                    return;
                }
                if (arg0 == 1506) {
                    class403 var74 = class298.method1744((byte) -93, var73);
                    field1799[field1793++] = var74 == null ? -1 : var74.field5431;
                    return;
                }
            } else if (arg0 < 2700) {
                class403 var75 = class213.method1345((byte) -126, field1799[--field1793]);
                if (arg0 == 2600) {
                    field1799[field1793++] = var75.field5520;
                    return;
                }
                if (arg0 == 2601) {
                    field1799[field1793++] = var75.field5442;
                    return;
                }
                if (arg0 == 2602) {
                    field1790[field1796++] = var75.field5479;
                    return;
                }
                if (arg0 == 2603) {
                    field1799[field1793++] = var75.field5473;
                    return;
                }
                if (arg0 == 2604) {
                    field1799[field1793++] = var75.field5472;
                    return;
                }
                if (arg0 == 2605) {
                    field1799[field1793++] = var75.field5434;
                    return;
                }
                if (arg0 == 2606) {
                    field1799[field1793++] = var75.field5556;
                    return;
                }
                if (arg0 == 2607) {
                    field1799[field1793++] = var75.field5457;
                    return;
                }
                if (arg0 == 2608) {
                    field1799[field1793++] = var75.field5546;
                    return;
                }
                if (arg0 == 2609) {
                    field1799[field1793++] = var75.field5401;
                    return;
                }
                if (arg0 == 2610) {
                    field1799[field1793++] = var75.field5405;
                    return;
                }
                if (arg0 == 2611) {
                    field1799[field1793++] = var75.field5527;
                    return;
                }
                if (arg0 == 2612) {
                    field1799[field1793++] = var75.field5424;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class403 var76 = class213.method1345((byte) -116, field1799[--field1793]);
                    field1799[field1793++] = var76.field5530;
                    return;
                }
                if (arg0 == 2701) {
                    class403 var77 = class213.method1345((byte) -116, field1799[--field1793]);
                    if (var77.field5530 == -1) {
                        field1799[field1793++] = 0;
                        return;
                    } else {
                        field1799[field1793++] = var77.field5541;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field1799[--field1793];
                    class301 var79 = (class301) class27.field457.method182((long) var78, (byte) 124);
                    if (var79 != null) {
                        field1799[field1793++] = 1;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class403 var80 = class213.method1345((byte) -115, field1799[--field1793]);
                    if (var80.field5420 == null) {
                        field1799[field1793++] = 0;
                        return;
                    }
                    int var81 = var80.field5420.length;
                    for (int var82 = 0; var82 < var80.field5420.length; var82++) {
                        if (var80.field5420[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field1799[field1793++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field1793 -= 2;
                    int var83 = field1799[field1793];
                    int var84 = field1799[field1793 + 1];
                    class301 var85 = (class301) class27.field457.method182((long) var83, (byte) 112);
                    if (var85 != null && var85.field3982 == var84) {
                        field1799[field1793++] = 1;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class403 var86 = class213.method1345((byte) -127, field1799[--field1793]);
                if (arg0 == 2800) {
                    field1799[field1793++] = client.method1255(var86).method2046((byte) -78);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field1799[--field1793];
                    int var335 = var87 - 1;
                    if (var86.field5557 != null && var335 < var86.field5557.length && var86.field5557[var335] != null) {
                        field1790[field1796++] = var86.field5557[var335];
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field5544 == null) {
                        field1790[field1796++] = "";
                        return;
                    }
                    field1790[field1796++] = var86.field5544;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field1790[--field1796];
                    class414.method2404(var88, -68);
                    return;
                }
                if (arg0 == 3101) {
                    field1793 -= 2;
                    class496.method2848((byte) 2, class385.field5232, field1799[field1793], field1799[field1793 + 1]);
                    return;
                }
                if (arg0 == 3103) {
                    class44.method313(true, (byte) 36);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field1790[--field1796];
                    int var90 = 0;
                    if (class80.method495(var89, (byte) -30)) {
                        var90 = class300.method1752(true, var89);
                    }
                    field1788++;
                    class118.method822(67, class405.field5570);
                    class193.field2708.method2214(30, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field1790[--field1796];
                    field1789++;
                    class118.method822(-103, class130.field1890);
                    class193.field2708.method2200(7, var91.length() + 1);
                    class193.field2708.method2216(var91, -119);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field1790[--field1796];
                    field1783++;
                    class118.method822(117, class316.field4154);
                    class193.field2708.method2200(7, var92.length() + 1);
                    class193.field2708.method2216(var92, -114);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field1799[--field1793];
                    String var94 = field1790[--field1796];
                    class200.method1282(var94, -86, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field1793 -= 3;
                    int var95 = field1799[field1793];
                    int var96 = field1799[field1793 + 1];
                    int var97 = field1799[field1793 + 2];
                    class403 var98 = class213.method1345((byte) -122, var97);
                    class189.method1217(var96, 64, var95, var98);
                    return;
                }
                if (arg0 == 3109) {
                    field1793 -= 2;
                    int var99 = field1799[field1793];
                    int var100 = field1799[field1793 + 1];
                    class403 var101 = arg1 ? field1776 : field1797;
                    class189.method1217(var100, 64, var99, var101);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field1799[--field1793];
                    field1777++;
                    class118.method822(111, class401.field5375);
                    class193.field2708.method2246(var102, (byte) -57);
                    return;
                }
                if (arg0 == 3111) {
                    field1793 -= 2;
                    int var103 = field1799[field1793];
                    int var104 = field1799[field1793 + 1];
                    class301 var105 = (class301) class27.field457.method182((long) var103, (byte) 110);
                    if (var105 != null) {
                        class347.method2023(var105, true, var105.field3982 != var104, (byte) 107);
                    }
                    class283.method1683(true, -19434, 3, var104, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field1793--;
                    int var106 = field1799[field1793];
                    class301 var107 = (class301) class27.field457.method182((long) var106, (byte) 108);
                    if (var107 != null && var107.field3981 == 3) {
                        class347.method2023(var107, true, true, (byte) -106);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class282.method1679(field1790[--field1796], -26734);
                    return;
                }
                if (arg0 == 3114) {
                    field1793 -= 2;
                    int var108 = field1799[field1793];
                    int var109 = field1799[field1793 + 1];
                    String var110 = field1790[--field1796];
                    class223.method1400("", var108, "", var110, false, var109);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field1793 -= 3;
                    class259.method1568(0, 255, field1799[field1793 + 1], field1799[field1793 + 2], field1799[field1793]);
                    return;
                }
                if (arg0 == 3201) {
                    class463.method2643(50, 255, (byte) 113, field1799[--field1793]);
                    return;
                }
                if (arg0 == 3202) {
                    field1793 -= 2;
                    class420.method2422(field1799[field1793 + 1], 255, 128, field1799[field1793]);
                    return;
                }
                if (arg0 == 3203) {
                    field1793 -= 4;
                    class259.method1568(0, field1799[field1793 + 3], field1799[field1793 + 1], field1799[field1793 + 2], field1799[field1793]);
                    return;
                }
                if (arg0 == 3204) {
                    field1793 -= 3;
                    class463.method2643(field1799[field1793 + 2], field1799[field1793 + 1], (byte) 86, field1799[field1793]);
                    return;
                }
                if (arg0 == 3205) {
                    field1793 -= 3;
                    class420.method2422(field1799[field1793 + 1], field1799[field1793 + 2], 128, field1799[field1793]);
                    return;
                }
                if (arg0 == 3206) {
                    field1793 -= 4;
                    class520.method3062(field1799[field1793 + 3], field1799[field1793 + 2], field1799[field1793], field1799[field1793 + 1], (byte) -47);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field1799[field1793++] = class31.field516;
                    return;
                }
                if (arg0 == 3301) {
                    field1793 -= 2;
                    int var111 = field1799[field1793];
                    int var112 = field1799[field1793 + 1];
                    field1799[field1793++] = class28.method231(var112, 122, var111, false);
                    return;
                }
                if (arg0 == 3302) {
                    field1793 -= 2;
                    int var113 = field1799[field1793];
                    int var114 = field1799[field1793 + 1];
                    field1799[field1793++] = class192.method1237(false, 18680, var113, var114);
                    return;
                }
                if (arg0 == 3303) {
                    field1793 -= 2;
                    int var115 = field1799[field1793];
                    int var116 = field1799[field1793 + 1];
                    field1799[field1793++] = class18.method178(var115, (byte) -84, var116, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field1799[--field1793];
                    field1799[field1793++] = class78.field1169.method2071(5, var117).field2623;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field1799[--field1793];
                    field1799[field1793++] = class305.field4013[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field1799[--field1793];
                    field1799[field1793++] = class252.field3337[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field1799[--field1793];
                    field1799[field1793++] = class138.field1994[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class385.field5232.field573;
                    int var122 = (class385.field5232.field584 >> 7) + class401.field5382;
                    int var123 = (class385.field5232.field574 >> 7) + class421.field5762;
                    field1799[field1793++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field1799[--field1793];
                    field1799[field1793++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field1799[--field1793];
                    field1799[field1793++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field1799[--field1793];
                    field1799[field1793++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field1799[field1793++] = class5.field151 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field1793 -= 2;
                    int var127 = field1799[field1793];
                    int var128 = field1799[field1793 + 1];
                    field1799[field1793++] = class28.method231(var128, 76, var127, true);
                    return;
                }
                if (arg0 == 3314) {
                    field1793 -= 2;
                    int var129 = field1799[field1793];
                    int var130 = field1799[field1793 + 1];
                    field1799[field1793++] = class192.method1237(true, 18680, var129, var130);
                    return;
                }
                if (arg0 == 3315) {
                    field1793 -= 2;
                    int var131 = field1799[field1793];
                    int var132 = field1799[field1793 + 1];
                    field1799[field1793++] = class18.method178(var131, (byte) -84, var132, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class196.field2745 >= 2) {
                        field1799[field1793++] = class196.field2745;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field1799[field1793++] = class377.field5106;
                    return;
                }
                if (arg0 == 3318) {
                    field1799[field1793++] = class145.field2063;
                    return;
                }
                if (arg0 == 3321) {
                    field1799[field1793++] = class170.field2484;
                    return;
                }
                if (arg0 == 3322) {
                    field1799[field1793++] = class471.field6484;
                    return;
                }
                if (arg0 == 3323) {
                    if (class131.field1898 >= 5 && class131.field1898 <= 9) {
                        field1799[field1793++] = 1;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class131.field1898 >= 5 && class131.field1898 <= 9) {
                        field1799[field1793++] = class131.field1898;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field1799[field1793++] = class412.field5681 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field1799[field1793++] = class385.field5232.field7607;
                    return;
                }
                if (arg0 == 3327) {
                    field1799[field1793++] = class385.field5232.field7627.field6617 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field1799[field1793++] = class16.field282 && !class513.field7557 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field1799[field1793++] = class362.field4900 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field1799[--field1793];
                    field1799[field1793++] = class228.method1423((byte) 124, var133, false);
                    return;
                }
                if (arg0 == 3331) {
                    field1793 -= 2;
                    int var134 = field1799[field1793];
                    int var135 = field1799[field1793 + 1];
                    field1799[field1793++] = class315.method1826(false, var135, -126, false, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field1793 -= 2;
                    int var136 = field1799[field1793];
                    int var137 = field1799[field1793 + 1];
                    field1799[field1793++] = class315.method1826(false, var137, 47, true, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field1799[field1793++] = class365.field4945;
                    return;
                }
                if (arg0 == 3335) {
                    field1799[field1793++] = class489.field6789;
                    return;
                }
                if (arg0 == 3336) {
                    field1793 -= 4;
                    int var138 = field1799[field1793];
                    int var139 = field1799[field1793 + 1];
                    int var140 = field1799[field1793 + 2];
                    int var141 = field1799[field1793 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field1799[field1793++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field1799[field1793++] = class213.field2891;
                    return;
                }
                if (arg0 == 3338) {
                    field1799[field1793++] = class427.method2462(0);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field1793 -= 2;
                    int var145 = field1799[field1793];
                    int var146 = field1799[field1793 + 1];
                    class46 var147 = class168.field2436.method2609((byte) 99, var145);
                    field1790[field1796++] = var147.method326(var146, -2);
                    return;
                }
                if (arg0 == 3408) {
                    field1793 -= 4;
                    int var148 = field1799[field1793];
                    int var149 = field1799[field1793 + 1];
                    int var150 = field1799[field1793 + 2];
                    int var151 = field1799[field1793 + 3];
                    class46 var152 = class168.field2436.method2609((byte) 110, var150);
                    if (var152.field679 == var148 && var152.field684 == var149) {
                        if (var149 == 115) {
                            field1790[field1796++] = var152.method326(var151, -2);
                            return;
                        }
                        field1799[field1793++] = var152.method323(-117, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field1793 -= 3;
                    int var153 = field1799[field1793];
                    int var154 = field1799[field1793 + 1];
                    int var155 = field1799[field1793 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class46 var156 = class168.field2436.method2609((byte) 105, var154);
                    if (var156.field684 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field1799[field1793++] = var156.method329(25782, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field1799[--field1793];
                    String var158 = field1790[--field1796];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class46 var159 = class168.field2436.method2609((byte) 120, var157);
                    if (var159.field684 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field1799[field1793++] = var159.method325(var158, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field1799[--field1793];
                    class46 var161 = class168.field2436.method2609((byte) 92, var160);
                    field1799[field1793++] = var161.field687.method174(-112);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class28.field482 == 0) {
                        field1799[field1793++] = -2;
                        return;
                    }
                    if (class28.field482 == 1) {
                        field1799[field1793++] = -1;
                        return;
                    }
                    field1799[field1793++] = class267.field3528;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field1799[--field1793];
                    if (class28.field482 == 2 && var162 < class267.field3528) {
                        field1790[field1796++] = class471.field6485[var162];
                        if (class71.field1076[var162] != null) {
                            field1790[field1796++] = class71.field1076[var162];
                            return;
                        }
                        field1790[field1796++] = "";
                        return;
                    }
                    field1790[field1796++] = "";
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field1799[--field1793];
                    if (class28.field482 == 2 && var163 < class267.field3528) {
                        field1799[field1793++] = class127.field1853[var163];
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field1799[--field1793];
                    if (class28.field482 == 2 && var164 < class267.field3528) {
                        field1799[field1793++] = class427.field5837[var164];
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field1790[--field1796];
                    int var166 = field1799[--field1793];
                    class513.method3021(var166, var165, 75);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field1790[--field1796];
                    class222.method1399(var167, (byte) -117);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field1790[--field1796];
                    class470.method2671(0, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field1790[--field1796];
                    class268.method1609(var169, -101, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field1790[--field1796];
                    class286.method1689(false, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field1790[--field1796];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field1799[field1793++] = class363.method2120(-18228, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field1799[--field1793];
                    if (class28.field482 == 2 && var172 < class267.field3528) {
                        field1790[field1796++] = class176.field2566[var172];
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class476.field6563 != null) {
                        field1790[field1796++] = class167.method1119(false, class476.field6563);
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class476.field6563 != null) {
                        field1799[field1793++] = class237.field3176;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field1799[--field1793];
                    if (class476.field6563 != null && var173 < class237.field3176) {
                        field1790[field1796++] = class265.field3506[var173].field5087;
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field1799[--field1793];
                    if (class476.field6563 != null && var174 < class237.field3176) {
                        field1799[field1793++] = class265.field3506[var174].field5095;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field1799[--field1793];
                    if (class476.field6563 != null && var175 < class237.field3176) {
                        field1799[field1793++] = class265.field3506[var175].field5086;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field1799[field1793++] = class377.field5108;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field1790[--field1796];
                    class296.method1733(var176, 789221);
                    return;
                }
                if (arg0 == 3618) {
                    field1799[field1793++] = class282.field3704;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field1790[--field1796];
                    class129.method925(var177, (byte) -103);
                    return;
                }
                if (arg0 == 3620) {
                    class17.method172(20);
                    return;
                }
                if (arg0 == 3621) {
                    if (class28.field482 == 0) {
                        field1799[field1793++] = -1;
                        return;
                    }
                    field1799[field1793++] = class114.field1621;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field1799[--field1793];
                    if (class28.field482 != 0 && var178 < class114.field1621) {
                        field1790[field1796++] = class227.field3064[var178];
                        if (class184.field2622[var178] != null) {
                            field1790[field1796++] = class184.field2622[var178];
                            return;
                        }
                        field1790[field1796++] = "";
                        return;
                    }
                    field1790[field1796++] = "";
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field1790[--field1796];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field1799[field1793++] = class386.method2284(var179, -45) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field1799[--field1793];
                    if (class265.field3506 != null && var180 < class237.field3176 && class265.field3506[var180].field5084.equalsIgnoreCase(class385.field5232.field7638)) {
                        field1799[field1793++] = 1;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class125.field1840 != null) {
                        field1790[field1796++] = class125.field1840;
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field1799[--field1793];
                    if (class476.field6563 != null && var181 < class237.field3176) {
                        field1790[field1796++] = class265.field3506[var181].field5089;
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field1799[--field1793];
                    if (class28.field482 == 2 && var182 >= 0 && var182 < class267.field3528) {
                        field1799[field1793++] = class454.field6157[var182] ? 1 : 0;
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field1790[--field1796];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field1799[field1793++] = class207.method1325(var183, 0);
                    return;
                }
                if (arg0 == 3629) {
                    field1799[field1793++] = class88.field1342;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field1790[--field1796];
                    class268.method1609(var184, -101, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field1799[--field1793];
                    field1799[field1793++] = class140.field2040[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field1799[--field1793];
                    if (class476.field6563 != null && var186 < class237.field3176) {
                        field1790[field1796++] = class265.field3506[var186].field5084;
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field1799[--field1793];
                    if (class28.field482 != 0 && var187 < class114.field1621) {
                        field1790[field1796++] = class222.field2989[var187];
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field1799[--field1793];
                    field1799[field1793++] = class518.field7681[var188].method1984(19417);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field1799[--field1793];
                    field1799[field1793++] = class518.field7681[var189].field4514;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field1799[--field1793];
                    field1799[field1793++] = class518.field7681[var190].field4518;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field1799[--field1793];
                    field1799[field1793++] = class518.field7681[var191].field4524;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field1799[--field1793];
                    field1799[field1793++] = class518.field7681[var192].field4516;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field1799[--field1793];
                    field1799[field1793++] = class518.field7681[var193].field4513;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field1799[--field1793];
                    int var195 = class518.field7681[var194].method1988(false);
                    field1799[field1793++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field1799[--field1793];
                    int var197 = class518.field7681[var196].method1988(false);
                    field1799[field1793++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field1799[--field1793];
                    int var199 = class518.field7681[var198].method1988(false);
                    field1799[field1793++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field1799[--field1793];
                    int var201 = class518.field7681[var200].method1988(false);
                    field1799[field1793++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field1793 -= 2;
                    int var202 = field1799[field1793];
                    int var203 = field1799[field1793 + 1];
                    field1799[field1793++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field1793 -= 2;
                    int var204 = field1799[field1793];
                    int var205 = field1799[field1793 + 1];
                    field1799[field1793++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field1793 -= 2;
                    int var206 = field1799[field1793];
                    int var207 = field1799[field1793 + 1];
                    field1799[field1793++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field1793 -= 2;
                    int var208 = field1799[field1793];
                    int var209 = field1799[field1793 + 1];
                    field1799[field1793++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field1799[--field1793];
                    field1799[field1793++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field1799[--field1793];
                    field1799[field1793++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field1793 -= 5;
                    int var212 = field1799[field1793];
                    int var213 = field1799[field1793 + 1];
                    int var214 = field1799[field1793 + 2];
                    int var215 = field1799[field1793 + 3];
                    int var216 = field1799[field1793 + 4];
                    field1799[field1793++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field1793 -= 2;
                    long var217 = (long) field1799[field1793];
                    long var219 = (long) field1799[field1793 + 1];
                    field1799[field1793++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field1793 -= 2;
                    int var221 = field1799[field1793];
                    int var222 = field1799[field1793 + 1];
                    field1799[field1793++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field1793 -= 2;
                    int var223 = field1799[field1793];
                    int var224 = field1799[field1793 + 1];
                    field1799[field1793++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field1793 -= 2;
                    int var225 = field1799[field1793];
                    int var226 = field1799[field1793 + 1];
                    field1799[field1793++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field1793 -= 2;
                    int var227 = field1799[field1793];
                    int var228 = field1799[field1793 + 1];
                    field1799[field1793++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field1793 -= 2;
                    int var229 = field1799[field1793];
                    int var230 = field1799[field1793 + 1];
                    if (var229 == 0) {
                        field1799[field1793++] = 0;
                        return;
                    }
                    field1799[field1793++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field1793 -= 2;
                    int var231 = field1799[field1793];
                    int var232 = field1799[field1793 + 1];
                    if (var231 == 0) {
                        field1799[field1793++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field1799[field1793++] = Integer.MAX_VALUE;
                        return;
                    }
                    field1799[field1793++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field1793 -= 2;
                    int var233 = field1799[field1793];
                    int var234 = field1799[field1793 + 1];
                    field1799[field1793++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field1793 -= 2;
                    int var235 = field1799[field1793];
                    int var236 = field1799[field1793 + 1];
                    field1799[field1793++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field1793 -= 2;
                    int var237 = field1799[field1793];
                    int var238 = field1799[field1793 + 1];
                    field1799[field1793++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field1793 -= 2;
                    int var239 = field1799[field1793];
                    int var240 = field1799[field1793 + 1];
                    field1799[field1793++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field1793 -= 3;
                    long var241 = (long) field1799[field1793];
                    long var243 = (long) field1799[field1793 + 1];
                    long var245 = (long) field1799[field1793 + 2];
                    field1799[field1793++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field1790[--field1796];
                    int var248 = field1799[--field1793];
                    field1790[field1796++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field1796 -= 2;
                    String var249 = field1790[field1796];
                    String var250 = field1790[field1796 + 1];
                    field1790[field1796++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field1790[--field1796];
                    int var252 = field1799[--field1793];
                    field1790[field1796++] = var251 + class280.method1667((byte) -51, var252, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field1790[--field1796];
                    field1790[field1796++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field1790[field1796++] = method891(field1799[--field1793]);
                    return;
                }
                if (arg0 == 4105) {
                    field1796 -= 2;
                    String var254 = field1790[field1796];
                    String var255 = field1790[field1796 + 1];
                    if (class385.field5232.field7627 != null && class385.field5232.field7627.field6617) {
                        field1790[field1796++] = var255;
                        return;
                    }
                    field1790[field1796++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field1799[--field1793];
                    field1790[field1796++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field1796 -= 2;
                    field1799[field1793++] = class232.method1445(class489.field6789, field1790[field1796], field1790[field1796 + 1], true);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field1790[--field1796];
                    field1793 -= 2;
                    int var258 = field1799[field1793];
                    int var259 = field1799[field1793 + 1];
                    class425 var260 = class321.method1851(var259, (byte) 62, class201.field2790, 0);
                    field1799[field1793++] = var260.method2443(var258, -39, var257, class514.field7590);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field1790[--field1796];
                    field1793 -= 2;
                    int var262 = field1799[field1793];
                    int var263 = field1799[field1793 + 1];
                    class425 var264 = class321.method1851(var263, (byte) 107, class201.field2790, 0);
                    field1799[field1793++] = var264.method2451(var262, true, class514.field7590, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field1796 -= 2;
                    String var265 = field1790[field1796];
                    String var266 = field1790[field1796 + 1];
                    if (field1799[--field1793] == 1) {
                        field1790[field1796++] = var265;
                        return;
                    }
                    field1790[field1796++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field1790[--field1796];
                    field1790[field1796++] = class517.method3046(var267, (byte) 63);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field1790[--field1796];
                    int var269 = field1799[--field1793];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field1790[field1796++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field1799[--field1793];
                    field1799[field1793++] = class330.method1902((byte) 76, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field1799[--field1793];
                    field1799[field1793++] = class482.method2773((char) var271, -29865) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field1799[--field1793];
                    field1799[field1793++] = class347.method2020((char) var272, (byte) 114) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field1799[--field1793];
                    field1799[field1793++] = class397.method2318((char) var273, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field1790[--field1796];
                    if (var274 != null) {
                        field1799[field1793++] = var274.length();
                        return;
                    }
                    field1799[field1793++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field1790[--field1796];
                    field1793 -= 2;
                    int var276 = field1799[field1793];
                    int var277 = field1799[field1793 + 1];
                    field1790[field1796++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field1790[--field1796];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field1790[field1796++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field1790[--field1796];
                    field1793 -= 2;
                    int var284 = field1799[field1793];
                    int var285 = field1799[field1793 + 1];
                    field1799[field1793++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field1796 -= 2;
                    String var286 = field1790[field1796];
                    String var287 = field1790[field1796 + 1];
                    int var288 = field1799[--field1793];
                    field1799[field1793++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field1799[--field1793];
                    field1799[field1793++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field1799[--field1793];
                    field1799[field1793++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field1799[--field1793] != 0;
                    int var292 = field1799[--field1793];
                    field1790[field1796++] = class485.method2791(0, class489.field6789, 46, (long) var292, var291);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field1790[--field1796];
                    int var294 = field1799[--field1793];
                    class425 var295 = class321.method1851(var294, (byte) 108, class201.field2790, 0);
                    field1799[field1793++] = var295.method2456(544, var293, class514.field7590);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field1799[--field1793];
                    field1790[field1796++] = class127.field1852.method2390(99, var296).field6697;
                    return;
                }
                if (arg0 == 4201) {
                    field1793 -= 2;
                    int var297 = field1799[field1793];
                    int var298 = field1799[field1793 + 1];
                    class482 var299 = class127.field1852.method2390(91, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field6662[var298 - 1] != null) {
                        field1790[field1796++] = var299.field6662[var298 - 1];
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field1793 -= 2;
                    int var300 = field1799[field1793];
                    int var301 = field1799[field1793 + 1];
                    class482 var302 = class127.field1852.method2390(65, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field6691[var301 - 1] != null) {
                        field1790[field1796++] = var302.field6691[var301 - 1];
                        return;
                    }
                    field1790[field1796++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field1799[--field1793];
                    field1799[field1793++] = class127.field1852.method2390(111, var303).field6719;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field1799[--field1793];
                    field1799[field1793++] = class127.field1852.method2390(121, var304).field6706 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field1799[--field1793];
                    class482 var306 = class127.field1852.method2390(127, var305);
                    if (var306.field6639 == -1 && var306.field6702 >= 0) {
                        field1799[field1793++] = var306.field6702;
                        return;
                    }
                    field1799[field1793++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field1799[--field1793];
                    class482 var308 = class127.field1852.method2390(91, var307);
                    if (var308.field6639 >= 0 && var308.field6702 >= 0) {
                        field1799[field1793++] = var308.field6702;
                        return;
                    }
                    field1799[field1793++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field1799[--field1793];
                    field1799[field1793++] = class127.field1852.method2390(48, var309).field6689 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field1793 -= 2;
                    int var310 = field1799[field1793];
                    int var311 = field1799[field1793 + 1];
                    class495 var312 = class270.field3546.method693(var311, 123);
                    if (var312.method2845((byte) -118)) {
                        field1790[field1796++] = class127.field1852.method2390(99, var310).method2765(0, var312.field6875, var311);
                        return;
                    }
                    field1799[field1793++] = class127.field1852.method2390(48, var310).method2772(var311, (byte) -128, var312.field6873);
                    return;
                }
                if (arg0 == 4209) {
                    field1793 -= 2;
                    int var313 = field1799[field1793];
                    int var314 = field1799[field1793 + 1] - 1;
                    class482 var315 = class127.field1852.method2390(55, var313);
                    if (var315.field6709 == var314) {
                        field1799[field1793++] = var315.field6647;
                        return;
                    }
                    if (var315.field6716 == var314) {
                        field1799[field1793++] = var315.field6708;
                        return;
                    }
                    field1799[field1793++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field1790[--field1796];
                    int var317 = field1799[--field1793];
                    class353.method2066((byte) -29, var316, var317 == 1);
                    field1799[field1793++] = class29.field491;
                    return;
                }
                if (arg0 == 4211) {
                    if (class215.field2897 != null && class245.field3255 < class29.field491) {
                        field1799[field1793++] = class215.field2897[class245.field3255++] & 0xFFFF;
                        return;
                    }
                    field1799[field1793++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class245.field3255 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field1793 -= 2;
                    int var318 = field1799[field1793];
                    int var319 = field1799[field1793 + 1];
                    class495 var320 = class270.field3546.method693(var319, -87);
                    if (var320.method2845((byte) -86)) {
                        field1790[field1796++] = class206.field2849.method2554(123, var318).method2888((byte) -62, var319, var320.field6875);
                        return;
                    }
                    field1799[field1793++] = class206.field2849.method2554(121, var318).method2894(var320.field6873, var319, 3830);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field1793 -= 2;
                    int var321 = field1799[field1793];
                    int var322 = field1799[field1793 + 1];
                    class495 var323 = class270.field3546.method693(var322, -107);
                    if (var323.method2845((byte) -84)) {
                        field1790[field1796++] = class402.field5388.method1994(-17294, var321).method3(var322, 94, var323.field6875);
                        return;
                    }
                    field1799[field1793++] = class402.field5388.method1994(-17294, var321).method16(var322, var323.field6873, (byte) -56);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field1793 -= 2;
                    int var324 = field1799[field1793];
                    int var325 = field1799[field1793 + 1];
                    class495 var326 = class270.field3546.method693(var325, -23);
                    if (var326.method2845((byte) -124)) {
                        field1790[field1796++] = client.field2731.method926(var324, 14).method1283(var326.field6875, var325, -112);
                        return;
                    }
                    field1799[field1793++] = client.field2731.method926(var324, 14).method1284(9, var325, var326.field6873);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field1799[--field1793];
                class20 var328 = class291.field3825.method131(var327, (byte) -120);
                if (var328.field365 != null && var328.field365.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field352[0];
                    for (int var331 = 1; var331 < var328.field365.length; var331++) {
                        if (var328.field352[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field352[var331];
                        }
                    }
                    field1799[field1793++] = var328.field365[var329];
                    return;
                }
                field1799[field1793++] = var328.field367;
                return;
            }
        } else {
            class403 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class213.method1345((byte) -104, field1799[--field1793]);
            } else {
                var47 = arg1 ? field1776 : field1797;
            }
            if (arg0 == 1300) {
                int var48 = field1799[--field1793] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2344(field1790[--field1796], 104, var48);
                    return;
                }
                field1796--;
                return;
            }
            if (arg0 == 1301) {
                field1793 -= 2;
                int var49 = field1799[field1793];
                int var50 = field1799[field1793 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field5519 = null;
                    return;
                }
                var47.field5519 = class381.method2261(-10673, var49, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field1799[--field1793];
                if (class74.field1121 != var51 && class322.field4225 != var51 && class379.field5186 != var51) {
                    return;
                }
                var47.field5523 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field5542 = field1799[--field1793];
                return;
            }
            if (arg0 == 1304) {
                var47.field5463 = field1799[--field1793];
                return;
            }
            if (arg0 == 1305) {
                var47.field5544 = field1790[--field1796];
                return;
            }
            if (arg0 == 1306) {
                var47.field5532 = field1790[--field1796];
                return;
            }
            if (arg0 == 1307) {
                var47.field5557 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field5471 = field1799[--field1793];
                var47.field5512 = field1799[--field1793];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field1799[--field1793];
                int var53 = field1799[--field1793];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2353(var53 - 1, -1715730592, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field5403 = field1790[--field1796];
                return;
            }
            if (arg0 == 1311) {
                var47.field5515 = field1799[--field1793];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field1793 -= 3;
                    var54 = field1799[field1793] - 1;
                    var55 = field1799[field1793 + 1];
                    var56 = field1799[field1793 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1793 -= 2;
                    var54 = 10;
                    var55 = field1799[field1793];
                    var56 = field1799[field1793 + 1];
                }
                if (var47.field5562 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field5562 = new byte[11];
                    var47.field5549 = new byte[11];
                    var47.field5481 = new int[11];
                }
                var47.field5562[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field5418 = false;
                    for (int var57 = 0; var57 < var47.field5562.length; var57++) {
                        if (var47.field5562[var57] != 0) {
                            var47.field5418 = true;
                            break;
                        }
                    }
                } else {
                    var47.field5418 = true;
                }
                var47.field5549[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field5486 = field1799[--field1793];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(IZ)V", line = 4602)
    private static final void method899(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1799[field1793++] = class58.field913;
                return;
            }
            if (arg0 == 5001) {
                field1793 -= 3;
                class58.field913 = field1799[field1793];
                class514.field7592 = class267.method1607(-89, field1799[field1793 + 1]);
                if (class514.field7592 == null) {
                    class514.field7592 = class499.field6899;
                }
                class280.field3683 = field1799[field1793 + 2];
                field1800++;
                class118.method822(-75, class252.field3334);
                class193.field2708.method2200(7, class58.field913);
                class193.field2708.method2200(7, class514.field7592.field3703);
                class193.field2708.method2200(7, class280.field3683);
                return;
            }
            if (arg0 == 5002) {
                field1796 -= 2;
                String var2 = field1790[field1796];
                String var3 = field1790[field1796 + 1];
                field1793 -= 2;
                int var4 = field1799[field1793];
                int var5 = field1799[field1793 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field1794++;
                class118.method822(-80, class279.field3665);
                class193.field2708.method2200(7, class125.method912(var2, 1) + class125.method912(var3, 1) + 2);
                class193.field2708.method2216(var2, -115);
                class193.field2708.method2200(7, var4 - 1);
                class193.field2708.method2200(7, var5);
                class193.field2708.method2216(var3, -117);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field1799[--field1793];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class364.field4924[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field1790[field1796++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field1799[--field1793];
                int var9 = -1;
                if (var8 < 100 && class364.field4924[var8] != null) {
                    var9 = class28.field481[var8];
                }
                field1799[field1793++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class514.field7592 == null) {
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = class514.field7592.field3703;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field1790[--field1796];
                method894(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1796 -= 2;
                String var11 = field1790[field1796];
                String var12 = field1790[field1796 + 1];
                if (class196.field2745 != 0 || (!class16.field282 || class513.field7557) && !class362.field4900) {
                    field1781++;
                    class118.method822(-120, class267.field3516);
                    class193.field2708.method2200(7, 0);
                    int var13 = class193.field2708.field5173;
                    class193.field2708.method2216(var11, -121);
                    class423.method2439(var12, -3097, class193.field2708);
                    class193.field2708.method2210(class193.field2708.field5173 - var13, (byte) 108);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field1799[--field1793];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class169.field2473[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field1790[field1796++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field1799[--field1793];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class233.field3141[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field1790[field1796++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field1799[--field1793];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class456.field6275[var18];
                }
                field1799[field1793++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class385.field5232 == null || class385.field5232.field7625 == null) {
                    var20 = class266.field3513;
                } else {
                    var20 = class385.field5232.method3033(true, false);
                }
                field1790[field1796++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field1799[field1793++] = class280.field3683;
                return;
            }
            if (arg0 == 5017) {
                field1799[field1793++] = class156.field2282;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field1799[--field1793];
                int var22 = 0;
                if (var21 < 100 && class364.field4924[var21] != null) {
                    var22 = class28.field481[var21];
                }
                field1799[field1793++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field1799[--field1793];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class340.field4445[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field1790[field1796++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class385.field5232 == null || class385.field5232.field7625 == null) {
                    var25 = class266.field3513;
                } else {
                    var25 = class385.field5232.method3040(false, (byte) 121);
                }
                field1790[field1796++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field1799[--field1793];
                field1790[field1796++] = class329.field4344.method1214((byte) 118, var26).field6007;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field1799[--field1793];
                class438 var28 = class329.field4344.method1214((byte) 122, var27);
                if (var28.field6005 == null) {
                    field1799[field1793++] = 0;
                    return;
                }
                field1799[field1793++] = var28.field6005.length;
                return;
            }
            if (arg0 == 5052) {
                field1793 -= 2;
                int var29 = field1799[field1793];
                int var30 = field1799[field1793 + 1];
                class438 var31 = class329.field4344.method1214((byte) 117, var29);
                int var32 = var31.field6005[var30];
                field1799[field1793++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field1799[--field1793];
                class438 var34 = class329.field4344.method1214((byte) 115, var33);
                if (var34.field6004 == null) {
                    field1799[field1793++] = 0;
                    return;
                }
                field1799[field1793++] = var34.field6004.length;
                return;
            }
            if (arg0 == 5054) {
                field1793 -= 2;
                int var35 = field1799[field1793];
                int var36 = field1799[field1793 + 1];
                field1799[field1793++] = class329.field4344.method1214((byte) 112, var35).field6004[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field1799[--field1793];
                field1790[field1796++] = class507.field7044.method2504((byte) 60, var37).method1172(-27972);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field1799[--field1793];
                class174 var39 = class507.field7044.method2504((byte) 60, var38);
                if (var39.field2544 == null) {
                    field1799[field1793++] = 0;
                    return;
                }
                field1799[field1793++] = var39.field2544.length;
                return;
            }
            if (arg0 == 5057) {
                field1793 -= 2;
                int var40 = field1799[field1793];
                int var41 = field1799[field1793 + 1];
                field1799[field1793++] = class507.field7044.method2504((byte) 60, var40).field2544[var41];
                return;
            }
            if (arg0 == 5058) {
                field1779 = new class445();
                field1779.field6096 = field1799[--field1793];
                field1779.field6093 = class507.field7044.method2504((byte) 60, field1779.field6096);
                field1779.field6097 = new int[field1779.field6093.method1168((byte) -11)];
                return;
            }
            if (arg0 == 5059) {
                field1786++;
                class118.method822(116, class482.field6718);
                class193.field2708.method2200(7, 0);
                int var42 = class193.field2708.field5173;
                class193.field2708.method2200(7, 0);
                class193.field2708.method2246(field1779.field6096, (byte) -112);
                field1779.field6093.method1164((byte) 123, field1779.field6097, class193.field2708);
                class193.field2708.method2210(class193.field2708.field5173 - var42, (byte) 114);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field1790[--field1796];
                field1780++;
                class118.method822(-104, class434.field5955);
                class193.field2708.method2200(7, 0);
                int var44 = class193.field2708.field5173;
                class193.field2708.method2216(var43, -125);
                class193.field2708.method2246(field1779.field6096, (byte) -58);
                field1779.field6093.method1164((byte) -94, field1779.field6097, class193.field2708);
                class193.field2708.method2210(class193.field2708.field5173 - var44, (byte) 113);
                return;
            }
            if (arg0 == 5061) {
                field1786++;
                class118.method822(-87, class482.field6718);
                class193.field2708.method2200(7, 0);
                int var45 = class193.field2708.field5173;
                class193.field2708.method2200(7, 1);
                class193.field2708.method2246(field1779.field6096, (byte) -122);
                field1779.field6093.method1164((byte) -34, field1779.field6097, class193.field2708);
                class193.field2708.method2210(class193.field2708.field5173 - var45, (byte) 122);
                return;
            }
            if (arg0 == 5062) {
                field1793 -= 2;
                int var46 = field1799[field1793];
                int var47 = field1799[field1793 + 1];
                field1799[field1793++] = class329.field4344.method1214((byte) 126, var46).field6008[var47];
                return;
            }
            if (arg0 == 5063) {
                field1793 -= 2;
                int var48 = field1799[field1793];
                int var49 = field1799[field1793 + 1];
                field1799[field1793++] = class329.field4344.method1214((byte) 115, var48).field5999[var49];
                return;
            }
            if (arg0 == 5064) {
                field1793 -= 2;
                int var50 = field1799[field1793];
                int var51 = field1799[field1793 + 1];
                if (var51 == -1) {
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = class329.field4344.method1214((byte) 123, var50).method2514((char) var51, 9826);
                return;
            }
            if (arg0 == 5065) {
                field1793 -= 2;
                int var52 = field1799[field1793];
                int var53 = field1799[field1793 + 1];
                if (var53 == -1) {
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = class329.field4344.method1214((byte) 125, var52).method2518((byte) -120, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field1799[--field1793];
                field1799[field1793++] = class507.field7044.method2504((byte) 60, var54).method1168((byte) 127);
                return;
            }
            if (arg0 == 5067) {
                field1793 -= 2;
                int var55 = field1799[field1793];
                int var56 = field1799[field1793 + 1];
                int var57 = class507.field7044.method2504((byte) 60, var55).method1171(var56, -117).field1052;
                field1799[field1793++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field1793 -= 2;
                int var58 = field1799[field1793];
                int var59 = field1799[field1793 + 1];
                field1779.field6097[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field1793 -= 2;
                int var60 = field1799[field1793];
                int var61 = field1799[field1793 + 1];
                field1779.field6097[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field1793 -= 3;
                int var62 = field1799[field1793];
                int var63 = field1799[field1793 + 1];
                int var64 = field1799[field1793 + 2];
                class174 var65 = class507.field7044.method2504((byte) 60, var62);
                if (var65.method1171(var63, -75).field1052 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1799[field1793++] = var65.method1167((byte) -80, var63, var64);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field1790[--field1796];
                boolean var67 = field1799[--field1793] == 1;
                class119.method830(var66, false, var67);
                field1799[field1793++] = class29.field491;
                return;
            }
            if (arg0 == 5072) {
                if (class215.field2897 != null && class245.field3255 < class29.field491) {
                    field1799[field1793++] = class215.field2897[class245.field3255++] & 0xFFFF;
                    return;
                }
                field1799[field1793++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class245.field3255 = 0;
                return;
            }
            if (arg0 == 5074) {
                field1786++;
                class118.method822(69, class482.field6718);
                class193.field2708.method2200(7, 0);
                int var68 = class193.field2708.field5173;
                class193.field2708.method2200(7, 2);
                class193.field2708.method2246(field1779.field6096, (byte) -102);
                field1779.field6093.method1164((byte) 115, field1779.field6097, class193.field2708);
                class193.field2708.method2210(class193.field2708.field5173 - var68, (byte) 108);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class32.field523.method305(86, (byte) 59)) {
                    field1799[field1793++] = 1;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class32.field523.method305(82, (byte) 59)) {
                    field1799[field1793++] = 1;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class32.field523.method305(81, (byte) 59)) {
                    field1799[field1793++] = 1;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class37.method289((byte) 44, field1799[--field1793]);
                return;
            }
            if (arg0 == 5201) {
                field1799[field1793++] = class329.method1897(5890);
                return;
            }
            if (arg0 == 5205) {
                class457.method2606(9834, false, -1, -1, field1799[--field1793]);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field1799[--field1793];
                class54 var70 = class6.method34(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = var70.field857;
                return;
            }
            if (arg0 == 5207) {
                class54 var71 = class6.method35(field1799[--field1793]);
                if (var71 != null && var71.field856 != null) {
                    field1790[field1796++] = var71.field856;
                    return;
                }
                field1790[field1796++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1799[field1793++] = class483.field6724;
                field1799[field1793++] = class256.field3381;
                return;
            }
            if (arg0 == 5209) {
                field1799[field1793++] = class6.field175 + class5.field152;
                field1799[field1793++] = class6.field172 + class391.field5300;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field1799[--field1793];
                class54 var73 = class6.method35(var72);
                if (var73 == null) {
                    field1799[field1793++] = 0;
                    field1799[field1793++] = 0;
                    return;
                }
                field1799[field1793++] = var73.field852 >> 14 & 0x3FFF;
                field1799[field1793++] = var73.field852 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field1799[--field1793];
                class54 var75 = class6.method35(var74);
                if (var75 == null) {
                    field1799[field1793++] = 0;
                    field1799[field1793++] = 0;
                    return;
                }
                field1799[field1793++] = var75.field858 - var75.field854;
                field1799[field1793++] = var75.field848 - var75.field849;
                return;
            }
            if (arg0 == 5212) {
                class228 var76 = class483.method2788(-126);
                if (var76 == null) {
                    field1799[field1793++] = -1;
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = var76.field3078;
                int var77 = var76.field3069 << 28 | class6.field175 + var76.field3073 << 14 | class6.field172 + var76.field3065;
                field1799[field1793++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class228 var78 = class96.method682(256);
                if (var78 == null) {
                    field1799[field1793++] = -1;
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = var78.field3078;
                int var79 = var78.field3069 << 28 | class6.field175 + var78.field3073 << 14 | class6.field172 + var78.field3065;
                field1799[field1793++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field1799[--field1793];
                class54 var81 = class71.method467((byte) 89);
                if (var81 != null) {
                    boolean var82 = var81.method393((byte) 74, var80 & 0x3FFF, var80 >> 14 & 0x3FFF, var80 >> 28 & 0x3, field1801);
                    if (var82) {
                        class286.method1691(0, field1801[1], field1801[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1793 -= 2;
                int var83 = field1799[field1793];
                int var84 = field1799[field1793 + 1];
                class114 var85 = class6.method43(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class54 var87 = (class54) var85.method786(1); var87 != null; var87 = (class54) var85.method780((byte) -78)) {
                    if (var87.field857 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field1799[field1793++] = 1;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field1799[--field1793];
                class54 var89 = class6.method35(var88);
                if (var89 == null) {
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = var89.field845;
                return;
            }
            if (arg0 == 5220) {
                field1799[field1793++] = class320.field4194 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field1799[--field1793];
                class286.method1691(0, var90 >> 14 & 0x3FFF, var90 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class54 var91 = class71.method467((byte) 89);
                if (var91 != null) {
                    boolean var92 = var91.method394(class6.field175 + class5.field152, -21, field1801, class6.field172 + class391.field5300);
                    if (var92) {
                        field1799[field1793++] = field1801[1];
                        field1799[field1793++] = field1801[2];
                        return;
                    }
                    field1799[field1793++] = -1;
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = -1;
                field1799[field1793++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1793 -= 2;
                int var93 = field1799[field1793];
                int var94 = field1799[field1793 + 1];
                class457.method2606(9834, false, var94 & 0x3FFF, var94 >> 14 & 0x3FFF, var93);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field1799[--field1793];
                class54 var96 = class71.method467((byte) 89);
                if (var96 != null) {
                    boolean var97 = var96.method393((byte) 90, var95 & 0x3FFF, var95 >> 14 & 0x3FFF, var95 >> 28 & 0x3, field1801);
                    if (var97) {
                        field1799[field1793++] = field1801[1];
                        field1799[field1793++] = field1801[2];
                        return;
                    }
                    field1799[field1793++] = -1;
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = -1;
                field1799[field1793++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field1799[--field1793];
                class54 var99 = class71.method467((byte) 89);
                if (var99 != null) {
                    boolean var100 = var99.method394(var98 >> 14 & 0x3FFF, -21, field1801, var98 & 0x3FFF);
                    if (var100) {
                        field1799[field1793++] = field1801[1];
                        field1799[field1793++] = field1801[2];
                        return;
                    }
                    field1799[field1793++] = -1;
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = -1;
                field1799[field1793++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class506.method2895(field1799[--field1793], 1);
                return;
            }
            if (arg0 == 5227) {
                field1793 -= 2;
                int var101 = field1799[field1793];
                int var102 = field1799[field1793 + 1];
                class457.method2606(9834, true, var102 & 0x3FFF, var102 >> 14 & 0x3FFF, var101);
                return;
            }
            if (arg0 == 5228) {
                class484.field6732 = field1799[--field1793] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1799[field1793++] = class484.field6732 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field1799[--field1793];
                class225.method1411(var103, (byte) -80);
                return;
            }
            if (arg0 == 5231) {
                field1793 -= 2;
                int var104 = field1799[field1793];
                boolean var105 = field1799[field1793 + 1] == 1;
                if (class301.field3985 != null) {
                    class42 var106 = class301.field3985.method182((long) var104, (byte) 90);
                    if (var106 != null && !var105) {
                        var106.method300(false);
                        return;
                    }
                    if (var106 == null && var105) {
                        class42 var107 = new class42();
                        class301.field3985.method173((long) var104, var107, (byte) 82);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field1799[--field1793];
                if (class301.field3985 != null) {
                    class42 var109 = class301.field3985.method182((long) var108, (byte) 90);
                    field1799[field1793++] = var109 == null ? 0 : 1;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1793 -= 2;
                int var110 = field1799[field1793];
                boolean var111 = field1799[field1793 + 1] == 1;
                if (class169.field2465 != null) {
                    class42 var112 = class169.field2465.method182((long) var110, (byte) 103);
                    if (var112 != null && !var111) {
                        var112.method300(false);
                        return;
                    }
                    if (var112 == null && var111) {
                        class42 var113 = new class42();
                        class169.field2465.method173((long) var110, var113, (byte) 84);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field1799[--field1793];
                if (class169.field2465 != null) {
                    class42 var115 = class169.field2465.method182((long) var114, (byte) 107);
                    field1799[field1793++] = var115 == null ? 0 : 1;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1799[field1793++] = class6.field161 == null ? -1 : class6.field161.field857;
                return;
            }
            if (arg0 == 5236) {
                field1793 -= 2;
                int var116 = field1799[field1793];
                int var117 = field1799[field1793 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class360.method2100(var116, 2048, var119, var118);
                if (var120 < 0) {
                    field1799[field1793++] = -1;
                    return;
                }
                field1799[field1793++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1793 -= 2;
                int var121 = field1799[field1793];
                int var122 = field1799[field1793 + 1];
                class412.method2388(-53, false, var122, var121, 3);
                field1799[field1793++] = class297.field3882 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class297.field3882 != null) {
                    class412.method2388(89, false, -1, -1, class154.field2244.field7752);
                }
                return;
            }
            if (arg0 == 5302) {
                class83[] var123 = class518.method3053((byte) 116);
                field1799[field1793++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field1799[--field1793];
                class83[] var125 = class518.method3053((byte) 117);
                field1799[field1793++] = var125[var124].field1234;
                field1799[field1793++] = var125[var124].field1237;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class154.field2244.field7777;
                int var127 = class154.field2244.field7759;
                int var128 = -1;
                class83[] var129 = class518.method3053((byte) 123);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class83 var131 = var129[var130];
                    if (var131.field1234 == var126 && var131.field1237 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field1799[field1793++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field1799[field1793++] = class170.method1136((byte) 80);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field1799[--field1793];
                if (var132 >= 1 && var132 <= 2) {
                    class412.method2388(120, false, -1, -1, var132);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1799[field1793++] = class154.field2244.field7752;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field1799[--field1793];
                if (var133 >= 1 && var133 <= 2) {
                    class154.field2244.field7752 = var133;
                    class154.field2244.method1852(class389.field5281, (byte) -62);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1796 -= 2;
                String var134 = field1790[field1796];
                String var135 = field1790[field1796 + 1];
                int var136 = field1799[--field1793];
                field1791++;
                class118.method822(53, class93.field1401);
                class193.field2708.method2200(7, class125.method912(var134, 1) + class125.method912(var135, 1) + 1);
                class193.field2708.method2216(var134, -128);
                class193.field2708.method2216(var135, -125);
                class193.field2708.method2200(7, var136);
                return;
            }
            if (arg0 == 5401) {
                field1793 -= 2;
                class392.field5308[field1799[field1793]] = (short) class227.method1419(-14169, field1799[field1793 + 1]);
                class127.field1852.method2393((byte) -89);
                class127.field1852.method2389(-66);
                class206.field2849.method2546(0);
                class260.method1570(118);
                return;
            }
            if (arg0 == 5405) {
                field1793 -= 2;
                int var137 = field1799[field1793];
                int var138 = field1799[field1793 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class147.field2083[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1793 -= 7;
                int var139 = field1799[field1793];
                int var140 = field1799[field1793 + 1] << 1;
                int var141 = field1799[field1793 + 2];
                int var142 = field1799[field1793 + 3];
                int var143 = field1799[field1793 + 4];
                int var144 = field1799[field1793 + 5];
                int var145 = field1799[field1793 + 6];
                if (var139 >= 0 && var139 < 2 && class147.field2083[var139] != null && var140 >= 0 && var140 < class147.field2083[var139].length) {
                    class147.field2083[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class147.field2083[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class147.field2083[field1799[--field1793]].length >> 1;
                field1799[field1793++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class297.field3882 != null) {
                    class412.method2388(100, false, -1, -1, class154.field2244.field7752);
                }
                if (class273.field3572 != null) {
                    class519.method3060((byte) 27);
                    System.exit(0);
                    return;
                }
                String var147 = class114.field1626 == null ? class490.method2830((byte) 103) : class114.field1626;
                class118.method828(false, class166.field2414 == 1, var147, class389.field5281, (byte) 64);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class99.field1481 != null) {
                    if (class99.field1481.field6104 == null) {
                        var148 = class121.method852(-11, class99.field1481.field6102);
                    } else {
                        var148 = (String) class99.field1481.field6104;
                    }
                }
                field1790[field1796++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field1799[field1793++] = class216.field2911 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class297.field3882 != null) {
                    class412.method2388(77, false, -1, -1, class154.field2244.field7752);
                }
                String var149 = field1790[--field1796];
                boolean var150 = field1799[--field1793] == 1;
                String var151 = class490.method2830((byte) 109) + var149;
                class118.method828(var150, class166.field2414 == 1, var151, class389.field5281, (byte) 64);
                return;
            }
            if (arg0 == 5422) {
                field1796 -= 2;
                String var152 = field1790[field1796];
                String var153 = field1790[field1796 + 1];
                int var154 = field1799[--field1793];
                if (var152.length() > 0) {
                    if (class12.field247 == null) {
                        class12.field247 = new String[class162.field2367[class155.field2265.field3146]];
                    }
                    class12.field247[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class302.field3993 == null) {
                        class302.field3993 = new String[class162.field2367[class155.field2265.field3146]];
                    }
                    class302.field3993[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1790[--field1796]);
                return;
            }
            if (arg0 == 5424) {
                field1793 -= 11;
                class391.field5307 = field1799[field1793];
                class316.field4142 = field1799[field1793 + 1];
                class389.field5279 = field1799[field1793 + 2];
                class454.field6158 = field1799[field1793 + 3];
                class458.field6303 = field1799[field1793 + 4];
                class46.field698 = field1799[field1793 + 5];
                class480.field6629 = field1799[field1793 + 6];
                class63.field975 = field1799[field1793 + 7];
                class61.field947 = field1799[field1793 + 8];
                class229.field3089 = field1799[field1793 + 9];
                class387.field5267 = field1799[field1793 + 10];
                class71.field1082.method2721(class458.field6303, (byte) 99);
                class71.field1082.method2721(class46.field698, (byte) 111);
                class71.field1082.method2721(class480.field6629, (byte) 110);
                class71.field1082.method2721(class63.field975, (byte) 112);
                class71.field1082.method2721(class61.field947, (byte) 89);
                class394.field5334 = null;
                class268.field3534 = null;
                class201.field2781 = null;
                class461.field6371 = null;
                class174.field2530 = null;
                class162.field2372 = null;
                class304.field4003 = null;
                class458.field6307 = null;
                class206.field2843 = true;
                return;
            }
            if (arg0 == 5425) {
                class233.method1447((byte) -94);
                class206.field2843 = false;
                return;
            }
            if (arg0 == 5426) {
                field1793 -= 2;
                class385.field5243 = field1799[field1793];
                class420.field5751 = field1799[field1793 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1793 -= 2;
                class290.field3800 = field1799[field1793 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1793 -= 2;
                int var155 = field1799[field1793];
                int var156 = field1799[field1793 + 1];
                field1799[field1793++] = class174.method1173(65535, var156, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class497.method2850(field1790[--field1796], 29685, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class87.method637(-114, class389.field5281.field2917, "accountcreated");
                    return;
                } catch (Throwable var266) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1793 -= 4;
                int var157 = field1799[field1793];
                int var158 = field1799[field1793 + 1];
                int var159 = field1799[field1793 + 2];
                int var160 = field1799[field1793 + 3];
                class59.method417((var157 & 0x3FFF) - class421.field5762, false, var159, (var157 >> 14 & 0x3FFF) - class401.field5382, var158, var160, true);
                return;
            }
            if (arg0 == 5501) {
                field1793 -= 4;
                int var161 = field1799[field1793];
                int var162 = field1799[field1793 + 1];
                int var163 = field1799[field1793 + 2];
                int var164 = field1799[field1793 + 3];
                class363.method2114(var164, 119, (var161 & 0x3FFF) - class421.field5762, var162, var163, (var161 >> 14 & 0x3FFF) - class401.field5382);
                return;
            }
            if (arg0 == 5502) {
                field1793 -= 6;
                int var165 = field1799[field1793];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class450.field6127 = var165;
                int var166 = field1799[field1793 + 1];
                if (var166 + 1 >= class147.field2083[class450.field6127].length >> 1) {
                    throw new RuntimeException();
                }
                class515.field7632 = var166;
                class354.field4782 = 0;
                class31.field521 = field1799[field1793 + 2];
                class494.field6865 = field1799[field1793 + 3];
                int var167 = field1799[field1793 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class520.field7699 = var167;
                int var168 = field1799[field1793 + 5];
                if (var168 + 1 >= class147.field2083[class520.field7699].length >> 1) {
                    throw new RuntimeException();
                }
                class211.field2877 = var168;
                class42.field623 = 3;
                return;
            }
            if (arg0 == 5503) {
                class430.method2483(true);
                return;
            }
            if (arg0 == 5504) {
                field1793 -= 2;
                class487.method2795(field1799[field1793], 115, 0, field1799[field1793 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field1799[field1793++] = (int) class426.field5820 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1799[field1793++] = (int) class184.field2621 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class171.method1141(-10450);
                return;
            }
            if (arg0 == 5508) {
                class23.method212(1401);
                return;
            }
            if (arg0 == 5509) {
                class522.method3081(-257);
                return;
            }
            if (arg0 == 5510) {
                class112.method772(10);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field1799[--field1793];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class401.field5382;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class12.field251) {
                    var172 = class12.field251;
                }
                int var173 = var171 - class421.field5762;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class289.field3782) {
                    var173 = class289.field3782;
                }
                class375.field5094 = (var172 << 7) + 64;
                class183.field2610 = (var173 << 7) + 64;
                class42.field623 = 4;
                return;
            }
            if (arg0 == 5512) {
                class125.method911(-95);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1796 -= 2;
                String var174 = field1790[field1796];
                String var175 = field1790[field1796 + 1];
                int var176 = field1799[--field1793];
                if (class454.field6161 != 10) {
                    return;
                }
                if (class127.field1854 == 0 && class27.field459 == 0 && class314.field4116 == 0 && class290.field3802 == 0) {
                    class224.method1403(var175, (byte) -4, var174, var176);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class223.method1401(64);
                return;
            }
            if (arg0 == 5602) {
                if (class27.field459 == 0) {
                    class458.field6312 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field1793 -= 4;
                if (class454.field6161 != 10) {
                    return;
                }
                if (class127.field1854 == 0 && class27.field459 == 0 && class314.field4116 == 0 && class290.field3802 == 0) {
                    class406.method2364(field1799[field1793], 43, field1799[field1793 + 2], field1799[field1793 + 1], field1799[field1793 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field1796--;
                if (class454.field6161 != 10) {
                    return;
                }
                if (class127.field1854 == 0 && class27.field459 == 0 && class314.field4116 == 0 && class290.field3802 == 0) {
                    class295.method1725(class33.method259(field1790[field1796], 0), 8425);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1796 -= 3;
                field1793 -= 7;
                if (class454.field6161 != 10) {
                    return;
                }
                if (class127.field1854 == 0 && class27.field459 == 0 && class314.field4116 == 0 && class290.field3802 == 0) {
                    class340.method1953(field1799[field1793 + 3], field1790[field1796 + 1], field1799[field1793 + 1], field1799[field1793 + 2], field1799[field1793 + 5] == 1, 2, field1799[field1793 + 6] == 1, field1799[field1793], field1790[field1796 + 2], class33.method259(field1790[field1796], 0), field1799[field1793 + 4] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class314.field4116 == 0) {
                    class225.field3043 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1799[field1793++] = class458.field6312;
                return;
            }
            if (arg0 == 5608) {
                field1799[field1793++] = class382.field5209;
                return;
            }
            if (arg0 == 5609) {
                field1799[field1793++] = class225.field3043;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field1790[field1796++] = class227.field3063.length > var177 ? class167.method1119(false, class227.field3063[var177]) : "";
                }
                class227.field3063 = null;
                return;
            }
            if (arg0 == 5611) {
                field1799[field1793++] = class186.field2630;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field1799[--field1793];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class154.field2244.field7746 = var178;
                class228.method1426((byte) 127);
                class154.field2244.method1852(class389.field5281, (byte) 125);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6002) {
                class154.field2244.method1850(field1799[--field1793] == 1, 2);
                class228.method1426((byte) 127);
                class437.method2510(-1975902942);
                class154.field2244.method1852(class389.field5281, (byte) 119);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6003) {
                class154.field2244.field7773 = field1799[--field1793] == 1;
                class437.method2510(-1975902942);
                class154.field2244.method1852(class389.field5281, (byte) 119);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6005) {
                class154.field2244.field7764 = field1799[--field1793] == 1;
                class228.method1426((byte) 127);
                class154.field2244.method1852(class389.field5281, (byte) -8);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6006) {
                class154.field2244.field7749 = field1799[--field1793] == 1;
                class370.field4984.method624(!class154.field2244.field7749);
                class154.field2244.method1852(class389.field5281, (byte) 16);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6007) {
                class154.field2244.field7737 = field1799[--field1793];
                class154.field2244.method1852(class389.field5281, (byte) 121);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6008) {
                class154.field2244.field7758 = field1799[--field1793] == 1;
                class154.field2244.method1852(class389.field5281, (byte) -19);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6009) {
                class154.field2244.field7745 = field1799[--field1793] == 1;
                class228.method1426((byte) 127);
                class154.field2244.method1852(class389.field5281, (byte) -97);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6010) {
                class154.field2244.field7766 = field1799[--field1793] == 1;
                class154.field2244.method1852(class389.field5281, (byte) 122);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field1799[--field1793];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class154.field2244.method3087(var179, 2, class166.field2414);
                class228.method1426((byte) 127);
                class154.field2244.method1852(class389.field5281, (byte) 119);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6012) {
                class154.field2244.method3088(-114, field1799[--field1793] == 1, class166.field2414);
                class72.method471(30);
                class489.method2809(0);
                class154.field2244.method1852(class389.field5281, (byte) -83);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6014) {
                class154.field2244.field7778 = field1799[--field1793] == 1;
                class228.method1426((byte) 127);
                class154.field2244.method1852(class389.field5281, (byte) -47);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6015) {
                class154.field2244.field7769 = field1799[--field1793] == 1;
                class228.method1426((byte) 127);
                class154.field2244.method1852(class389.field5281, (byte) -50);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field1799[--field1793];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class154.field2244.field7756 = var180;
                class258.method1562(class166.field2414, (byte) 80);
                class154.field2244.method1852(class389.field5281, (byte) -35);
                return;
            }
            if (arg0 == 6017) {
                class154.field2244.field7765 = field1799[--field1793] == 1;
                class33.method257(37);
                class154.field2244.method1852(class389.field5281, (byte) -57);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field1799[--field1793];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class154.field2244.field7767 = var181;
                class154.field2244.method1852(class389.field5281, (byte) -95);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field1799[--field1793];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class154.field2244.field7775 != var182) {
                    if (class154.field2244.field7775 == 0 && class153.field2234 != -1) {
                        class290.method1700(0, class153.field2234, false, class449.field6118, true, var182);
                        class21.field380 = false;
                    } else if (var182 == 0) {
                        class271.method1619((byte) 117);
                        class21.field380 = false;
                    } else {
                        class462.method2638(-31757, var182);
                    }
                    class154.field2244.field7775 = var182;
                }
                class154.field2244.method1852(class389.field5281, (byte) -111);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field1799[--field1793];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class154.field2244.field7772 = var183;
                class154.field2244.method1852(class389.field5281, (byte) 120);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6021) {
                class154.field2244.field4198 = field1799[--field1793] == 1;
                class437.method2510(-1975902942);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field1799[--field1793];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class199.field2765 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class201.method1285(-3, var184);
                class154.field2244.method1852(class389.field5281, (byte) 122);
                class121.field1774 = false;
                field1799[field1793++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field1799[--field1793];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class154.field2244.field7757 = var186;
                class154.field2244.method1852(class389.field5281, (byte) 127);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field1799[--field1793];
                if (var187 < 0 || var187 > class425.method2445(96, class199.field2765)) {
                    var187 = 0;
                }
                class154.field2244.field7768 = var187;
                class154.field2244.method1852(class389.field5281, (byte) 31);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field1799[--field1793];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class362.method2105(true, var188 == 1);
                return;
            }
            if (arg0 == 6028) {
                class154.field2244.field7763 = field1799[--field1793] != 0;
                class154.field2244.method1852(class389.field5281, (byte) -44);
                return;
            }
            if (arg0 == 6029) {
                class154.field2244.field7737 = field1799[--field1793];
                class154.field2244.method1852(class389.field5281, (byte) -48);
                return;
            }
            if (arg0 == 6030) {
                class154.field2244.field7744 = field1799[--field1793] != 0;
                class154.field2244.method1852(class389.field5281, (byte) 116);
                class228.method1426((byte) 127);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field1799[--field1793];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class258.method1562(var189, (byte) 89);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field1799[--field1793];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class154.field2244.field7743 = var190;
                class154.field2244.method1852(class389.field5281, (byte) 125);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field1799[--field1793];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class154.field2244.field7761 = var191;
                class154.field2244.method1852(class389.field5281, (byte) 127);
                return;
            }
            if (arg0 == 6034) {
                class154.field2244.field7754 = field1799[--field1793] == 1;
                class154.field2244.method1852(class389.field5281, (byte) -114);
                class72.method471(30);
                class121.field1774 = false;
                return;
            }
            if (arg0 == 6035) {
                class154.field2244.field4206 = field1799[--field1793] == 1;
                class228.method1426((byte) 127);
                class437.method2510(-1975902942);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1799[field1793++] = class154.field2244.field7746;
                return;
            }
            if (arg0 == 6102) {
                field1799[field1793++] = class154.field2244.method1848(-125, class166.field2414) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1799[field1793++] = class154.field2244.field7773 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1799[field1793++] = class154.field2244.field7764 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field1799[field1793++] = class154.field2244.field7749 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1799[field1793++] = class154.field2244.field7737;
                return;
            }
            if (arg0 == 6108) {
                field1799[field1793++] = class154.field2244.field7758 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field1799[field1793++] = class154.field2244.field7745 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1799[field1793++] = class154.field2244.field7766 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1799[field1793++] = class154.field2244.method3089((byte) 123, class166.field2414);
                return;
            }
            if (arg0 == 6112) {
                field1799[field1793++] = class154.field2244.method3086(class166.field2414, (byte) 60) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1799[field1793++] = class154.field2244.field7778 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1799[field1793++] = class154.field2244.field7769 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1799[field1793++] = class154.field2244.field7756;
                return;
            }
            if (arg0 == 6117) {
                field1799[field1793++] = class154.field2244.field7765 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1799[field1793++] = class154.field2244.field7767;
                return;
            }
            if (arg0 == 6119) {
                field1799[field1793++] = class154.field2244.field7775;
                return;
            }
            if (arg0 == 6120) {
                field1799[field1793++] = class154.field2244.field7772;
                return;
            }
            if (arg0 == 6121) {
                field1799[field1793++] = class370.field4984.method604() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field1799[field1793++] = class518.method3047((byte) 32);
                return;
            }
            if (arg0 == 6124) {
                field1799[field1793++] = class154.field2244.field7757;
                return;
            }
            if (arg0 == 6125) {
                field1799[field1793++] = class154.field2244.field7768;
                return;
            }
            if (arg0 == 6126) {
                field1799[field1793++] = class370.field4984.method554() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field1799[field1793++] = class154.field2244.field7755 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1799[field1793++] = class154.field2244.field7763 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1799[field1793++] = class154.field2244.field7737;
                return;
            }
            if (arg0 == 6130) {
                field1799[field1793++] = class154.field2244.field7744 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1799[field1793++] = class166.field2414;
                return;
            }
            if (arg0 == 6132) {
                field1799[field1793++] = class154.field2244.field7743;
                return;
            }
            if (arg0 == 6133) {
                field1799[field1793++] = class216.field2911 == 1 || class216.field2911 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field1799[field1793++] = class425.method2445(96, class199.field2765);
                return;
            }
            if (arg0 == 6135) {
                field1799[field1793++] = class154.field2244.field7761;
                return;
            }
            if (arg0 == 6136) {
                field1799[field1793++] = class154.field2244.field7754 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1793 -= 2;
                class209.field2869 = (short) field1799[field1793];
                if (class209.field2869 <= 0) {
                    class209.field2869 = 256;
                }
                class204.field2827 = (short) field1799[field1793 + 1];
                if (class204.field2827 <= 0) {
                    class204.field2827 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1793 -= 2;
                class494.field6864 = (short) field1799[field1793];
                if (class494.field6864 <= 0) {
                    class494.field6864 = 256;
                }
                class454.field6160 = (short) field1799[field1793 + 1];
                if (class454.field6160 <= 0) {
                    class454.field6160 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1793 -= 4;
                class522.field7723 = (short) field1799[field1793];
                if (class522.field7723 <= 0) {
                    class522.field7723 = 1;
                }
                class261.field3448 = (short) field1799[field1793 + 1];
                if (class261.field3448 <= 0) {
                    class261.field3448 = 32767;
                } else if (class261.field3448 < class522.field7723) {
                    class261.field3448 = class522.field7723;
                }
                class214.field2894 = (short) field1799[field1793 + 2];
                if (class214.field2894 <= 0) {
                    class214.field2894 = 1;
                }
                class217.field2937 = (short) field1799[field1793 + 3];
                if (class217.field2937 <= 0) {
                    class217.field2937 = 32767;
                    return;
                }
                if (class217.field2937 < class214.field2894) {
                    class217.field2937 = class214.field2894;
                }
                return;
            }
            if (arg0 == 6203) {
                class528.method3108(false, class112.field1596.field5404, (byte) -56, 0, 0, class112.field1596.field5450);
                field1799[field1793++] = class258.field3418;
                field1799[field1793++] = class484.field6733;
                return;
            }
            if (arg0 == 6204) {
                field1799[field1793++] = class494.field6864;
                field1799[field1793++] = class454.field6160;
                return;
            }
            if (arg0 == 6205) {
                field1799[field1793++] = class209.field2869;
                field1799[field1793++] = class204.field2827;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1799[field1793++] = (int) (class498.method2854(-112) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1799[field1793++] = (int) (class498.method2854(-111) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1793 -= 3;
                int var192 = field1799[field1793];
                int var193 = field1799[field1793 + 1];
                int var194 = field1799[field1793 + 2];
                field1778.clear();
                field1778.set(11, 12);
                field1778.set(var194, var193, var192);
                field1799[field1793++] = (int) (field1778.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field1778.clear();
                field1778.setTime(new Date(class498.method2854(-123)));
                field1799[field1793++] = field1778.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field1799[--field1793];
                boolean var196 = true;
                if (var195 < 0) {
                    var196 = (var195 + 1) % 4 == 0;
                } else if (var195 < 1582) {
                    var196 = var195 % 4 == 0;
                } else if (var195 % 4 != 0) {
                    var196 = false;
                } else if (var195 % 100 != 0) {
                    var196 = true;
                } else if (var195 % 400 != 0) {
                    var196 = false;
                }
                field1799[field1793++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1799[field1793++] = class470.method2672(5448) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1799[field1793++] = class355.method2078(-66) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class454.field6161 == 10 && class127.field1854 == 0 && class27.field459 == 0 && class314.field4116 == 0) {
                    field1799[field1793++] = class365.method2127(99) == -1 ? 0 : 1;
                    return;
                }
                field1799[field1793++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class386 var197 = class265.method1594((byte) -68);
                if (var197 != null) {
                    field1799[field1793++] = var197.field5250;
                    field1799[field1793++] = var197.field2354;
                    field1790[field1796++] = var197.field5249;
                    class211 var198 = var197.method2286((byte) -118);
                    field1799[field1793++] = var198.field2876;
                    field1790[field1796++] = var198.field2878;
                    field1799[field1793++] = var197.field2352;
                    field1799[field1793++] = var197.field5253;
                    return;
                }
                field1799[field1793++] = -1;
                field1799[field1793++] = 0;
                field1790[field1796++] = "";
                field1799[field1793++] = 0;
                field1790[field1796++] = "";
                field1799[field1793++] = 0;
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class386 var199 = class193.method1241((byte) 85);
                if (var199 != null) {
                    field1799[field1793++] = var199.field5250;
                    field1799[field1793++] = var199.field2354;
                    field1790[field1796++] = var199.field5249;
                    class211 var200 = var199.method2286((byte) 80);
                    field1799[field1793++] = var200.field2876;
                    field1790[field1796++] = var200.field2878;
                    field1799[field1793++] = var199.field2352;
                    field1799[field1793++] = var199.field5253;
                    return;
                }
                field1799[field1793++] = -1;
                field1799[field1793++] = 0;
                field1790[field1796++] = "";
                field1799[field1793++] = 0;
                field1790[field1796++] = "";
                field1799[field1793++] = 0;
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field1799[--field1793];
                if (class454.field6161 == 10 && class127.field1854 == 0 && class27.field459 == 0 && class314.field4116 == 0) {
                    field1799[field1793++] = class163.method1102((byte) -115, var201) ? 1 : 0;
                    return;
                }
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class154.field2244.field7760 = field1799[--field1793];
                class154.field2244.method1852(class389.field5281, (byte) 119);
                return;
            }
            if (arg0 == 6505) {
                field1799[field1793++] = class154.field2244.field7760;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field1799[--field1793];
                class386 var203 = class238.method1474(false, var202);
                if (var203 != null) {
                    field1799[field1793++] = var203.field2354;
                    field1790[field1796++] = var203.field5249;
                    class211 var204 = var203.method2286((byte) 59);
                    field1799[field1793++] = var204.field2876;
                    field1790[field1796++] = var204.field2878;
                    field1799[field1793++] = var203.field2352;
                    field1799[field1793++] = var203.field5253;
                    return;
                }
                field1799[field1793++] = -1;
                field1790[field1796++] = "";
                field1799[field1793++] = 0;
                field1790[field1796++] = "";
                field1799[field1793++] = 0;
                field1799[field1793++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field1793 -= 4;
                int var205 = field1799[field1793];
                boolean var206 = field1799[field1793 + 1] == 1;
                int var207 = field1799[field1793 + 2];
                boolean var208 = field1799[field1793 + 3] == 1;
                class343.method1993(var205, var206, -6754, var208, var207);
                return;
            }
            if (arg0 == 6508) {
                class481.method2764(0);
                return;
            }
            if (arg0 == 6509) {
                if (class454.field6161 != 10) {
                    return;
                }
                class299.field3959 = field1799[--field1793] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class154.field2244.field7738 = field1799[--field1793] == 1;
                class154.field2244.method1852(class389.field5281, (byte) 118);
                return;
            }
            if (arg0 == 6601) {
                field1799[field1793++] = class154.field2244.field7738 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class470.field6474 == class365.field4944) {
            if (arg0 == 6700) {
                int var209 = class27.field457.method174(-60);
                if (class474.field6555 != -1) {
                    var209++;
                }
                field1799[field1793++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field1799[--field1793];
                if (class474.field6555 != -1) {
                    if (var210 == 0) {
                        field1799[field1793++] = class474.field6555;
                        return;
                    }
                    var210--;
                }
                class301 var211 = (class301) class27.field457.method181((byte) -70);
                while (var210-- > 0) {
                    var211 = (class301) class27.field457.method179(1);
                }
                field1799[field1793++] = var211.field3982;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field1799[--field1793];
                if (class238.field3185[var212] == null) {
                    field1790[field1796++] = "";
                    return;
                }
                String var213 = class238.field3185[var212][0].field5429;
                if (var213 == null) {
                    field1790[field1796++] = "";
                    return;
                }
                field1790[field1796++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field1799[--field1793];
                if (class238.field3185[var214] == null) {
                    field1799[field1793++] = 0;
                    return;
                }
                field1799[field1793++] = class238.field3185[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field1793 -= 2;
                int var215 = field1799[field1793];
                int var216 = field1799[field1793 + 1];
                if (class238.field3185[var215] == null) {
                    field1790[field1796++] = "";
                    return;
                }
                String var217 = class238.field3185[var215][var216].field5429;
                if (var217 == null) {
                    field1790[field1796++] = "";
                    return;
                }
                field1790[field1796++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field1793 -= 2;
                int var218 = field1799[field1793];
                int var219 = field1799[field1793 + 1];
                if (class238.field3185[var218] == null) {
                    field1799[field1793++] = 0;
                    return;
                }
                field1799[field1793++] = class238.field3185[var218][var219].field5538;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field1793 -= 3;
                int var220 = field1799[field1793];
                int var221 = field1799[field1793 + 1];
                int var222 = field1799[field1793 + 2];
                class116.method796(1, "", 9, var220 << 16 | var221, var222);
                return;
            }
            if (arg0 == 6708) {
                field1793 -= 3;
                int var223 = field1799[field1793];
                int var224 = field1799[field1793 + 1];
                int var225 = field1799[field1793 + 2];
                class116.method796(2, "", 9, var223 << 16 | var224, var225);
                return;
            }
            if (arg0 == 6709) {
                field1793 -= 3;
                int var226 = field1799[field1793];
                int var227 = field1799[field1793 + 1];
                int var228 = field1799[field1793 + 2];
                class116.method796(3, "", 9, var226 << 16 | var227, var228);
                return;
            }
            if (arg0 == 6710) {
                field1793 -= 3;
                int var229 = field1799[field1793];
                int var230 = field1799[field1793 + 1];
                int var231 = field1799[field1793 + 2];
                class116.method796(4, "", 9, var229 << 16 | var230, var231);
                return;
            }
            if (arg0 == 6711) {
                field1793 -= 3;
                int var232 = field1799[field1793];
                int var233 = field1799[field1793 + 1];
                int var234 = field1799[field1793 + 2];
                class116.method796(5, "", 9, var232 << 16 | var233, var234);
                return;
            }
            if (arg0 == 6712) {
                field1793 -= 3;
                int var235 = field1799[field1793];
                int var236 = field1799[field1793 + 1];
                int var237 = field1799[field1793 + 2];
                class116.method796(6, "", 9, var235 << 16 | var236, var237);
                return;
            }
            if (arg0 == 6713) {
                field1793 -= 3;
                int var238 = field1799[field1793];
                int var239 = field1799[field1793 + 1];
                int var240 = field1799[field1793 + 2];
                class116.method796(7, "", 9, var238 << 16 | var239, var240);
                return;
            }
            if (arg0 == 6714) {
                field1793 -= 3;
                int var241 = field1799[field1793];
                int var242 = field1799[field1793 + 1];
                int var243 = field1799[field1793 + 2];
                class116.method796(8, "", 9, var241 << 16 | var242, var243);
                return;
            }
            if (arg0 == 6715) {
                field1793 -= 3;
                int var244 = field1799[field1793];
                int var245 = field1799[field1793 + 1];
                int var246 = field1799[field1793 + 2];
                class116.method796(9, "", 9, var244 << 16 | var245, var246);
                return;
            }
            if (arg0 == 6716) {
                field1793 -= 3;
                int var247 = field1799[field1793];
                int var248 = field1799[field1793 + 1];
                int var249 = field1799[field1793 + 2];
                class116.method796(10, "", 9, var247 << 16 | var248, var249);
                return;
            }
            if (arg0 == 6717) {
                field1793 -= 3;
                int var250 = field1799[field1793];
                int var251 = field1799[field1793 + 1];
                int var252 = field1799[field1793 + 2];
                class403 var253 = class381.method2261(-10673, var250 << 16 | var251, var252);
                class506.method2892(65535);
                class350 var254 = client.method1255(var253);
                class63.method434(var253, var254.method2046((byte) -93), var254.field4718, 5465);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field1799[--field1793];
                class460 var256 = class267.field3522.method1014(var255, -22947);
                if (var256.field6352 == null) {
                    field1790[field1796++] = "";
                    return;
                }
                field1790[field1796++] = var256.field6352;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field1799[--field1793];
                class460 var258 = class267.field3522.method1014(var257, -22947);
                field1799[field1793++] = var258.field6364;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field1799[--field1793];
                class460 var260 = class267.field3522.method1014(var259, -22947);
                field1799[field1793++] = var260.field6327;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field1799[--field1793];
                class460 var262 = class267.field3522.method1014(var261, -22947);
                field1799[field1793++] = var262.field6329;
                return;
            }
            if (arg0 == 6804) {
                field1793 -= 2;
                int var263 = field1799[field1793];
                int var264 = field1799[field1793 + 1];
                class495 var265 = class270.field3546.method693(var264, 125);
                if (var265.method2845((byte) -113)) {
                    field1790[field1796++] = class267.field3522.method1014(var263, -22947).method2616(var264, var265.field6875, -1);
                    return;
                }
                field1799[field1793++] = class267.field3522.method1014(var263, -22947).method2619(var264, var265.field6873, true);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
