import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class226 {

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "[[S")
    public static short[][] field2973 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2970 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "S")
    public static short field2971 = 32767;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Llm;")
    public static class347 field2968;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method1308(byte arg0, int arg1, int arg2) {
        field2966++;
        if (class140.field1922 != arg1) {
            class375.field5448 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class375.field5448[var3] = (var3 << 12) / arg1;
            }
            class242.field3233 = arg1 - 1;
            class448.field6570 = arg1 * 32;
            class140.field1922 = arg1;
        }
        if (class329.field4798 != arg2) {
            if (class140.field1922 == arg2) {
                class84.field1206 = class375.field5448;
            } else {
                class84.field1206 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class84.field1206[var4] = (var4 << 12) / arg2;
                }
            }
            class329.field4798 = arg2;
            class411.field6070 = arg2 - 1;
        }
        int var5 = -40 / ((7 - arg0) / 38);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIII)I", line = 48)
    public static final int method1309(byte arg0, int arg1, int arg2, int arg3) {
        field2967++;
        if (arg0 != -16) {
            method1311((class270[]) null, 80, -87, (byte[]) null, (class405) null, -81, false);
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILps;)Ljava/lang/String;", line = 70)
    public static final String method1310(int arg0, int arg1, class394 arg2) {
        field2965++;
        if (!client.method1544(arg2).method2073(-29, arg1) && arg2.field5760 == null) {
            return null;
        } else if (arg2.field5669 == null || arg1 >= arg2.field5669.length || arg2.field5669[arg1] == null || arg2.field5669[arg1].trim().length() == 0) {
            return class62.field818 ? "Hidden-" + arg1 : null;
        } else {
            if (arg0 != 5157) {
                field2973 = null;
            }
            return arg2.field5669[arg1];
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lba;II[BLii;IZ)V", line = 96)
    public static final void method1311(class270[] arg0, int arg1, int arg2, byte[] arg3, class405 arg4, int arg5, boolean arg6) {
        field2969++;
        class228 var7 = new class228(arg3);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1323(32767);
            if (var9 == 0) {
                if (arg5 != 6554) {
                    field2971 = 47;
                    return;
                }
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1327((byte) -64);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method1348(-128);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < (class192.field2574 - 1) && var19 < class364.field5262 - 1) {
                    class270 var20 = null;
                    if (!arg6) {
                        int var21 = var14;
                        if ((class103.field1430[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg0[var21];
                        }
                    }
                    class386.method2485(var8, -22389, var17, arg6, var19, true, var18, var14, var16, -1, var20, var14, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZZ)V", line = 173)
    public static final void method1312(int arg0, boolean arg1, boolean arg2) {
        field2972++;
        if (arg1) {
            class379.field5523++;
            class73.method537(-340);
        }
        int var3 = 80 / ((arg0 - 86) / 32);
        if (arg2) {
            class416.field6107++;
            class118.method764((byte) -120);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 195)
    public static void method1313(byte arg0) {
        field2970 = null;
        if (arg0 == -86) {
            field2968 = null;
            field2973 = null;
        }
    }
}
