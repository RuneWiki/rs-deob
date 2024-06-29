import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class157 {

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "Lcea;")
    public static class111 field2462;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILgga;II)Lida;", line = 4)
    public static final class678 method1211(int arg0, class513 arg1, int arg2, int arg3) {
        field2455++;
        byte[] var4 = arg1.method3019(arg3, arg2, arg0 ^ 0xFFFFFFAF);
        if (var4 == null) {
            return null;
        } else if (arg0 == -5) {
            return new class678(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1212(byte arg0) {
        class494 var1 = class729.field10165;
        synchronized (class729.field10165) {
            class729.field10165.method2893((byte) -26);
        }
        if (arg0 > -100) {
            method1215(-30, null);
        }
        field2464++;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)V", line = 40)
    public static final void method1213(byte arg0) {
        field2457++;
        class636.field8987 = class48.field674.method2555(124);
        if (arg0 != -71) {
            method1216((byte) 90);
        }
        int var1 = class48.field674.method2560(true);
        int var2 = class48.field674.method2565((byte) -124);
        int var3 = class48.field674.method2565((byte) -125);
        boolean var4 = class48.field674.method2555(127) == 1;
        class68.method665((byte) -103);
        class388.method2335(var1, (byte) 113);
        class48.field674.method2220((byte) -120);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class192.field2891 >> 3); var20++) {
                for (int var21 = 0; var21 < (class456.field6225 >> 3); var21++) {
                    int var22 = class48.field674.method2222(8, 1);
                    if (var22 == 1) {
                        class364.field5178[var5][var20][var21] = class48.field674.method2222(8, 26);
                    } else {
                        class364.field5178[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class48.field674.method2223(false);
        int var6 = (class549.field7634 - class48.field674.field5983) / 16;
        class149.field2397 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class149.field2397[var7][var19] = class48.field674.method2526(17);
            }
        }
        class687.field9715 = new int[var6];
        class12.field156 = new int[var6];
        class590.field8476 = new byte[var6][];
        class60.field912 = new int[var6];
        class555.field7705 = new byte[var6][];
        class114.field1832 = null;
        class651.field9224 = new int[var6];
        class11.field142 = new byte[var6][];
        class401.field5521 = new int[var6];
        class789.field10791 = null;
        class613.field8704 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class192.field2891 >> 3); var10++) {
                for (int var11 = 0; var11 < (class456.field6225 >> 3); var11++) {
                    int var12 = class364.field5178[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FF8) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class12.field156[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class12.field156[var8] = var15;
                            int var17 = (var15 & 0xFFA4) >> 8;
                            int var18 = var15 & 0xFF;
                            class687.field9715[var8] = class562.field7790.method3016(98, "m" + var17 + "_" + var18);
                            class651.field9224[var8] = class562.field7790.method3016(100, "l" + var17 + "_" + var18);
                            class60.field912[var8] = class562.field7790.method3016(arg0 + 182, "um" + var17 + "_" + var18);
                            class401.field5521[var8] = class562.field7790.method3016(96, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class694.method3901(11, var2, 26055, var3, var4);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lcea;ZIZLjava/lang/String;)V", line = 189)
    public static final void method1214(class111 arg0, boolean arg1, int arg2, boolean arg3, String arg4) {
        if (arg2 >= -25) {
            method1211(59, null, 46, -48);
        }
        field2460++;
        if (!arg1) {
            class324.method1955(arg4, arg0, 3, -123);
            return;
        }
        if (class111.field1584.startsWith("win") && arg0.field1585) {
            String var5 = null;
            if (class343.field4881 != null) {
                var5 = class343.field4881.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class746 var6 = class324.method1955(arg4, arg0, 0, 93);
                field2462 = arg0;
                class93.field1333 = arg4;
                class40.field466 = var6;
                return;
            }
        }
        if (class111.field1584.startsWith("mac")) {
            String var7 = null;
            if (class343.field4881 != null) {
                var7 = class343.field4881.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class324.method1955(arg4, arg0, 1, -121);
                return;
            }
        }
        class324.method1955(arg4, arg0, 2, -105);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILol;)Lkh;", line = 257)
    public static final class368 method1215(int arg0, class431 arg1) {
        field2456++;
        int var2 = arg1.method2557(14929);
        class565 var3 = class551.method3180(-1)[arg1.method2557(14929)];
        class345 var4 = class91.method777(true)[arg1.method2557(14929)];
        int var5 = arg1.method2528((byte) 89);
        int var6 = arg1.method2528((byte) 89);
        int var7 = arg1.method2565((byte) -89);
        int var8 = arg1.method2565((byte) -117);
        int var9 = arg1.method2526(17);
        int var10 = arg1.method2526(17);
        int var11 = arg1.method2526(17);
        boolean var12 = arg0 == arg1.method2557(14929);
        return new class368(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)V", line = 288)
    public static void method1216(byte arg0) {
        int var1 = 1 / ((arg0 - 13) / 47);
        field2462 = null;
    }
}
