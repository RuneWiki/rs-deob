import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class84 extends class101 {

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "[Z")
    public static boolean[] field1229 = new boolean[8];

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "Lhb;")
    public static class318 field1244 = new class318(50);

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field1245 = 20;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field1251 = 64;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "J")
    public static long field1252 = 0L;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lll;")
    public class151 field1227;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lmi;")
    public class207 field1221;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "Lni;")
    public class219 field1237;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Lsf;")
    public class220 field1248;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Lqb;")
    public static class89 field1247;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "[I")
    public static int[] field1250;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 4)
    public final void method584(byte arg0) {
        field1228++;
        this.field1221 = null;
        this.field1237 = null;
        int var2 = 59 % ((arg0 - 84) / 34);
        this.field1227 = null;
        this.field1248 = null;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 23)
    public static void method585(int arg0) {
        field1250 = null;
        int var1 = 39 / ((-arg0 - 58) / 62);
        field1244 = null;
        field1229 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lqm;IBII)V", line = 58)
    public static final void method586(class58 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1225++;
        if (class190.field2829 >= 400) {
            return;
        }
        if (arg0.field756 != null) {
            arg0 = arg0.method390(-109);
        }
        if (arg2 < 121 || arg0 == null || !arg0.field768) {
            return;
        }
        String var5 = arg0.field744;
        if (arg0.field746 != 0) {
            String var6 = class237.field3555 == 1 ? class200.field2996 : class15.field169;
            var5 = var5 + class28.method181(-4, arg0.field746, class114.field1750.field2927) + " (" + var6 + arg0.field746 + ")";
        }
        if (class76.field985 == 1) {
            class296.method2062(arg1, (short) 23, (long) arg3, arg4, 100, class184.field2760 + " -> <col=ffff00>" + var5, class292.field4442, class160.field2404);
            class182.field2725++;
        } else if (class122.field1907) {
            class63 var14 = class12.field133 == -1 ? null : class104.method733(class12.field133, true);
            if ((class274.field4201 & 0x2) != 0 && (var14 == null || arg0.method387(-7363, var14.field837, class12.field133) != var14.field837)) {
                class81.field1151++;
                class296.method2062(arg1, (short) 57, (long) arg3, arg4, 100, class40.field492 + " -> <col=ffff00>" + var5, class69.field916, class149.field2247);
            }
        } else {
            class63.field830++;
            String[] var7 = arg0.field787;
            if (class302.field4610) {
                var7 = class295.method2058(0, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class237.field3555 != 0 || !var7[var8].equalsIgnoreCase(class51.field642))) {
                        class63.field834++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 17;
                        }
                        if (var8 == 1) {
                            var9 = 39;
                        }
                        int var10 = -1;
                        if (var8 == 2) {
                            var9 = 40;
                        }
                        if (arg0.field786 == var8) {
                            var10 = arg0.field747;
                        }
                        if (arg0.field734 == var8) {
                            var10 = arg0.field748;
                        }
                        if (var8 == 3) {
                            var9 = 7;
                        }
                        if (var8 == 4) {
                            var9 = 47;
                        }
                        class296.method2062(arg1, var9, (long) arg3, arg4, 100, "<col=ffff00>" + var5, var7[var8], var10);
                    }
                }
            }
            if (class237.field3555 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class51.field642)) {
                        class218.field3317++;
                        short var12 = 0;
                        if (arg0.field746 > class114.field1750.field2927) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 17;
                        }
                        if (var11 == 1) {
                            var13 = 39;
                        }
                        if (var11 == 2) {
                            var13 = 40;
                        }
                        if (var11 == 3) {
                            var13 = 7;
                        }
                        if (var11 == 4) {
                            var13 = 47;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class296.method2062(arg1, var13, (long) arg3, arg4, 100, "<col=ffff00>" + var5, var7[var11], arg0.field779);
                    }
                }
            }
            class296.method2062(arg1, (short) 1007, (long) arg3, arg4, 100, "<col=ffff00>" + var5, class274.field4205, class90.field1341);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V", line = 230)
    public static final void method587(int arg0, byte arg1) {
        if (arg1 >= -33) {
            field1245 = 115;
        }
        class307.field4683 = 0;
        class54.field682 = 1;
        class194.field2897 = -1;
        class314.field4757 = null;
        class16.field176 = false;
        class270.field4128 = -1;
        class43.field527 = arg0;
        field1240++;
    }
}
