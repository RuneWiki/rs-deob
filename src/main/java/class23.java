import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class23 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lhi;")
    private static class82 field314 = class95.method664((byte) -57, "M");

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lhi;")
    public static class82 field313 = class95.method664((byte) -29, "rect_debug=");

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lhi;")
    public static class82 field312 = field314;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lhi;")
    public static class82 field316 = class95.method664((byte) -76, ":duelstake:");

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lhi;")
    public static class82 field323 = field314;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Z")
    public static boolean field317 = false;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Lsl;")
    public class194 field318;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "[I")
    public int[] field321;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z[Luf;[BBII)V", line = 19)
    public static final void method152(boolean arg0, class189[] arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -105) {
            method156((byte) 88);
        }
        field319++;
        int var6 = -1;
        class153 var7 = new class153(arg2);
        while (true) {
            int var8 = var7.method1062(102);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method1050(-32768);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = (var9 & 0xFDB) >> 6;
                int var14 = var7.method1082(-34);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg5 + var13;
                int var18 = arg4 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class189 var19 = null;
                    if (!arg0) {
                        int var20 = var12;
                        if ((class204.field3567[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class177.method1256(var16, 20192, var15, arg0, var18, var12, var17, var6, var12, var19, !arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z", line = 96)
    public static final boolean method153(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method153(-44, -11, -15);
        }
        field322++;
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V", line = 108)
    public static final void method154(boolean arg0, int arg1) {
        field315++;
        if (arg1 < 120) {
            field323 = (class82) null;
        }
        byte[][] var2;
        byte var3;
        if (class147.field2485 && arg0) {
            var2 = class71.field1094;
            var3 = 1;
        } else {
            var2 = class287.field4830;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class283.method1968(80);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class89.field1600[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFC) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class93.field1664.length; var14++) {
                                if (class93.field1664[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class112.method773(var4, var10, var2[var14], (var11 & 0x7) * 8, (var12 & 0x7) * 8, var9, var5 * 8, class180.field3071, (byte) -70, arg0, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class219.method1551(var5 * 8, var6 * 8, var4, (byte) 82, 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lsa;Z)I", line = 227)
    public static final int method155(class81 arg0, boolean arg1) {
        if (arg1) {
            method156((byte) -89);
        }
        field311++;
        int var2 = arg0.field1392;
        if (arg0.field1703 == arg0.field1668) {
            var2 = arg0.field1411;
        } else if (arg0.field1668 == arg0.field1667) {
            var2 = arg0.field1414;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 253)
    public static void method156(byte arg0) {
        field313 = null;
        field323 = null;
        if (arg0 <= 78) {
            field314 = (class82) null;
        }
        field316 = null;
        field314 = null;
        field312 = null;
    }
}
