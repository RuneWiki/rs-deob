import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class203 {

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[I")
    public int[] field2770 = new int[4];

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "B")
    public byte field2779;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "[I")
    public int[] field2780;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
    public int[] field2772;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "B")
    public byte field2766;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "S")
    public short field2781;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "S")
    public short field2783;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "S")
    public short field2777;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[S")
    public short[] field2765;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[S")
    public short[] field2775;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[S")
    public short[] field2773;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "S")
    public short field2782;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2768 = -1;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2774 = new String[100];

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lar;")
    public static class524 field2769;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[Laca;")
    public static class541[] field2764;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lqg;")
    public static final class271 method1311(int arg0, int arg1) {
        field2767++;
        class271[] var2 = class105.method747((byte) -128);
        int var3 = 0;
        if (arg1 != 18444) {
            field2774 = null;
        }
        while (var2.length > var3) {
            class271 var4 = var2[var3];
            if (var4.field3547 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method1312(byte arg0) {
        field2778++;
        int var1 = 42 % ((arg0 - 49) / 52);
        if (class226.field3006.toLowerCase().indexOf("microsoft") != -1) {
            class218.field2906[188] = 71;
            class218.field2906[219] = 42;
            class218.field2906[221] = 43;
            class218.field2906[190] = 72;
            class218.field2906[186] = 57;
            class218.field2906[192] = 58;
            class218.field2906[220] = 74;
            class218.field2906[223] = 28;
            class218.field2906[191] = 73;
            class218.field2906[222] = 59;
            class218.field2906[189] = 26;
            class218.field2906[187] = 27;
            return;
        }
        class218.field2906[44] = 71;
        class218.field2906[93] = 43;
        class218.field2906[46] = 72;
        class218.field2906[59] = 57;
        class218.field2906[92] = 74;
        class218.field2906[45] = 26;
        class218.field2906[91] = 42;
        class218.field2906[47] = 73;
        class218.field2906[61] = 27;
        if (class226.field2985 == null) {
            class218.field2906[192] = 58;
            class218.field2906[222] = 59;
        } else {
            class218.field2906[192] = 28;
            class218.field2906[520] = 59;
            class218.field2906[222] = 58;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static void method1313(byte arg0) {
        field2764 = null;
        int var1 = -31 / ((arg0 - 80) / 42);
        field2769 = null;
        field2774 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1314(String arg0, int arg1, int arg2) {
        field2776++;
        class489 var3 = class704.method3942(arg2, arg1, arg1 - 2);
        var3.method2797(-1);
        var3.field6939 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLmq;B)V")
    public static final void method1315(boolean arg0, class71 arg1, byte arg2) {
        field2771++;
        if (class373.field5520 >= 400) {
            return;
        }
        if (arg2 != 73) {
            field2774 = null;
        }
        if (class321.field4681 != arg1) {
            String var9;
            if (arg1.field1131 == 0) {
                boolean var3 = true;
                if (class321.field4681.field1126 != -1 && arg1.field1126 != -1) {
                    int var4 = class321.field4681.field1123 <= arg1.field1123 ? arg1.field1123 : class321.field4681.field1123;
                    int var5 = arg1.field1126 > class321.field4681.field1126 ? class321.field4681.field1126 : arg1.field1126;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class321.field4681.field1123 - arg1.field1123;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class478.field6840 == class132.field1922 ? class279.field3655.method1654(91, class262.field3401) : class279.field3653.method1654(108, class262.field3401);
                if (arg1.field1095 <= arg1.field1123) {
                    var9 = arg1.method417(true, true) + (var3 ? class617.method3542(class321.field4681.field1123, arg1.field1123, false) : "<col=ffffff>") + " (" + var8 + arg1.field1123 + ")";
                } else {
                    var9 = arg1.method417(true, true) + (var3 ? class617.method3542(class321.field4681.field1123, arg1.field1123, false) : "<col=ffffff>") + " (" + var8 + arg1.field1123 + "+" + (arg1.field1095 - arg1.field1123) + ")";
                }
            } else if (arg1.field1131 == -1) {
                var9 = arg1.method417(true, true);
            } else {
                var9 = arg1.method417(true, true) + " (" + class279.field3654.method1654(-120, class262.field3401) + arg1.field1131 + ")";
            }
            if (class240.field3164 && !arg0 && (class282.field3771 & 0x8) != 0) {
                class310.field4569++;
                class621.method3581(class697.field9824, 0, 59, (long) arg1.field7405, 0, (byte) 127, class372.field5508 + " -> <col=ffffff>" + var9, false, -1, class142.field2061, true);
            }
            if (arg0) {
                class621.method3581("<col=cccccc>" + var9, 0, -1, 0L, 0, (byte) 127, "", true, 0, -1, false);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class677.field9580[var10] != null) {
                        short var12 = 0;
                        if (class518.field7269 == class478.field6840 && class677.field9580[var10].equalsIgnoreCase(class279.field3648.method1654(-65, class262.field3401))) {
                            if (arg1.field1123 > class321.field4681.field1123) {
                                var12 = 2000;
                            }
                            if (class321.field4681.field1101 != 0 && arg1.field1101 != 0) {
                                if (class321.field4681.field1101 == arg1.field1101) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class350.field5181[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class330.field4799[var10] + var12);
                        int var14 = class705.field9986[var10] == -1 ? class379.field5696 : class705.field9986[var10];
                        class58.field951++;
                        class621.method3581(class677.field9580[var10], 0, var13, (long) arg1.field7405, 0, (byte) 127, "<col=ffffff>" + var9, false, -1, var14, true);
                    }
                }
            }
            if (!arg0) {
                for (class426 var11 = (class426) class152.field2150.method1904(false); var11 != null; var11 = (class426) class152.field2150.method1901(98)) {
                    if (var11.field6223 == 10) {
                        var11.field6225 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class240.field3164 && (class282.field3771 & 0x10) != 0) {
            class273.field3562++;
            class621.method3581(class697.field9824, 0, 22, 0L, 0, (byte) 127, class372.field5508 + " -> <col=ffffff>" + class279.field3662.method1654(arg2 - 145, class262.field3401), false, -1, class142.field2061, true);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2779 = (byte) arg0;
        this.field2780 = new int[4];
        this.field2772 = new int[4];
        this.field2766 = (byte) arg1;
        this.field2770[2] = arg4;
        this.field2770[1] = arg3;
        this.field2770[3] = arg5;
        this.field2770[0] = arg2;
        this.field2780[1] = arg7;
        this.field2780[0] = arg6;
        this.field2780[2] = arg8;
        this.field2780[3] = arg9;
        this.field2772[3] = arg13;
        this.field2772[1] = arg11;
        this.field2772[2] = arg12;
        this.field2772[0] = arg10;
        this.field2781 = (short) (arg2 >> class125.field1831);
        this.field2783 = (short) (arg4 >> class125.field1831);
        this.field2777 = (short) (arg10 >> class125.field1831);
        this.field2765 = new short[4];
        this.field2775 = new short[4];
        this.field2773 = new short[4];
        this.field2782 = (short) (arg12 >> class125.field1831);
    }
}
