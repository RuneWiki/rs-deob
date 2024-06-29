import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lmc;")
    private static class75 field346 = class30.method234(true, "Select");

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lmc;")
    private static class75 field333 = class30.method234(true, "Connection timed out)3");

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lmc;")
    public static class75 field340 = field333;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[I")
    public static int[] field343 = new int[128];

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lmc;")
    private static class75 field351 = class30.method234(true, "To");

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lmc;")
    public static class75 field345 = class30.method234(true, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lmc;")
    public static class75 field338 = class30.method234(true, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Lmc;")
    public static class75 field354 = field346;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lmc;")
    public static class75 field348 = class30.method234(true, "Classic");

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lmc;")
    public static class75 field335 = field351;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lmc;")
    public static class75 field359 = class30.method234(true, "null");

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lmc;")
    public static class75 field358 = class30.method234(true, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lmc;")
    public static class75 field347 = class30.method234(true, "scrollbar");

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lkc;")
    public static class63 field337 = new class63(20);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lkc;")
    public static class63 field350;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    public static int[] field336;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lib;I)V", line = 19)
    public static final void method114(class50 arg0, int arg1) {
        field341++;
        if (arg0.field1234 == 0) {
            return;
        }
        if (arg0.field1252 != -1 && arg0.field1252 < 32768) {
            class97 var2 = class12.field231[arg0.field1252];
            if (var2 != null) {
                int var3 = arg0.field1233 - var2.field1233;
                int var4 = arg0.field1242 - var2.field1242;
                if (var3 != 0 || var4 != 0) {
                    arg0.field1271 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1252 >= 32768) {
            int var5 = arg0.field1252 - 32768;
            if (class92.field2285 == var5) {
                var5 = 2047;
            }
            class122 var6 = class40.field957[var5];
            if (var6 != null) {
                int var7 = arg0.field1233 - var6.field1233;
                int var8 = arg0.field1242 - var6.field1242;
                if (var7 != 0 || var8 != 0) {
                    arg0.field1271 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 >= -50) {
            return;
        }
        if ((arg0.field1246 != 0 || arg0.field1209 != 0) && (arg0.field1267 == 0 || arg0.field1256 > 0)) {
            int var9 = arg0.field1233 - (arg0.field1246 - class62.field1618 - class62.field1618) * 64;
            int var10 = arg0.field1242 - (arg0.field1209 - class55.field1367 - class55.field1367) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field1271 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1246 = 0;
            arg0.field1209 = 0;
        }
        int var11 = arg0.field1271 - arg0.field1220 & 0x7FF;
        if (var11 == 0) {
            return;
        }
        if (var11 > 1024) {
            arg0.field1220 -= arg0.field1234;
            if (arg0.field1223 == arg0.field1219) {
                if (arg0.field1237 == -1) {
                    arg0.field1219 = arg0.field1235;
                } else {
                    arg0.field1219 = arg0.field1237;
                }
            }
        } else {
            arg0.field1220 += arg0.field1234;
            if (arg0.field1223 == arg0.field1219) {
                if (arg0.field1244 == -1) {
                    arg0.field1219 = arg0.field1235;
                } else {
                    arg0.field1219 = arg0.field1244;
                }
            }
        }
        if (arg0.field1234 > var11 || 2048 - arg0.field1234 < var11) {
            arg0.field1220 = arg0.field1271;
        }
        arg0.field1220 &= 0x7FF;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Lkb;", line = 131)
    public static final class62 method115(int arg0, boolean arg1) {
        field342++;
        class62 var2 = (class62) class111.field2819.method559((long) arg0, -123);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class34.field769.method436(arg0, 5, 3);
        class62 var4 = new class62();
        if (arg1) {
            method121(118, -109);
        }
        if (var3 != null) {
            var4.method542(new class61(var3), arg1);
        }
        class111.field2819.method558((long) arg0, var4, 304);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 155)
    public static final void method116(boolean arg0) {
        field334++;
        if (arg0) {
            method114(null, -75);
        }
        class3.field53.method553((byte) 7);
        class45.field1094.method553((byte) 117);
        class107.field2684.method553((byte) -80);
        class3.field44.method553((byte) 18);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 177)
    public static final void method117(int arg0) {
        field357++;
        class82.field2039.method553((byte) 126);
        if (arg0 != -31) {
            field346 = null;
        }
        class25.field487.method553((byte) -103);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 192)
    public static final void method118(int arg0) {
        field353++;
        class75 var1 = null;
        int var2 = 0;
        if (arg0 < 79) {
            return;
        }
        while (class100.field2585 > var2) {
            if (class43.field1036[var2].method644(class35.field853, 0) != -1) {
                var1 = class43.field1036[var2].method645(class43.field1036[var2].method644(class35.field853, 0), (byte) 110);
                break;
            }
            var2++;
        }
        if (var1 == null) {
            class117.method930(8580);
            return;
        }
        int var3 = class110.field2802;
        if (var3 < 0) {
            var3 = 0;
        }
        int var4 = class98.field2465;
        if (var4 > 190) {
            var4 = 190;
        }
        int var5 = class61.field1592;
        int var6 = class34.field809;
        int var7 = 6116423;
        class66.method569(var3, var5, var4, var6, var7);
        class66.method569(var3 + 1, var5 - -1, var4 - 2, 16, 0);
        class66.method578(var3 + 1, var5 + 18, var4 - 2, var6 + -19, 0);
        class5.field77.method412(var1, var3 + 3, var5 + 14, var7, false);
        int var8 = class90.field2200;
        int var9 = class45.field1104;
        if (class90.field2218 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class90.field2218 == 1) {
            var9 -= 205;
            var8 -= 553;
        }
        if (class90.field2218 == 2) {
            var9 -= 357;
            var8 -= 17;
        }
        for (int var10 = 0; var10 < class100.field2585; var10++) {
            int var11 = var5 + (class100.field2585 - var10 - 1) * 15 + 31;
            int var12 = 16777215;
            class75 var13 = class43.field1036[var10];
            if (var13.method626(var1, (byte) 34)) {
                var13 = var13.method647(0, 0, var13.method621(-19198) - var1.method621(-19198));
                if (var13.method626(class5.field71, (byte) 65)) {
                    var13 = var13.method647(0, 0, var13.method621(-19198) - class5.field71.method621(-19198));
                }
            }
            if (var3 < var8 && var3 + var4 > var8 && var11 - 13 < var9 && var11 + 3 > var9) {
                var12 = 16776960;
            }
            class5.field77.method412(var13, var3 + 3, var11, var12, true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 317)
    public static final void method119(int arg0) {
        if (arg0 > 114) {
            field349++;
            class111.field2819.method553((byte) -55);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILp;ILbe;)V", line = 340)
    public static final void method120(int arg0, class90 arg1, int arg2, class12 arg3) {
        field355++;
        class65 var4 = new class65();
        var4.field1706 = arg3;
        var4.field1765 = arg2;
        var4.field1707 = arg1;
        var4.field1711 = 1;
        class32 var5 = class88.field2169;
        synchronized (class88.field2169) {
            class88.field2169.method245(var4, 0);
        }
        int var6 = 13 % ((-arg0 - 64) / 34);
        class97.method815((byte) 102);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V", line = 374)
    public static final void method121(int arg0, int arg1) {
        field356++;
        if (class110.field2787 == arg0) {
            return;
        }
        if (class110.field2787 == 0) {
            class101.method839(-1);
        }
        if (arg0 == 20 || arg0 == 40) {
            class59.field1536 = 0;
            class5.field79 = 0;
            class84.field2062 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class129.field3142 != null) {
            class129.field3142.method756(-105);
        }
        if (arg1 != -9411) {
            return;
        }
        if (class110.field2787 == 25 || class110.field2787 == 40) {
            class8.method46(-1);
            class66.method575();
        }
        if (class110.field2787 == 25) {
            class16.field296 = 1;
            class109.field2773 = 0;
            class97.field2443 = 0;
            class56.field1427 = 0;
            class25.field495 = 1;
        }
        if (arg0 == 0 || arg0 == 35) {
            class84.method697(arg1 + 39356);
            class91.method754((byte) -70);
            if (client.field374 == null) {
                client.field374 = class74.method616(class108.field2738, (byte) 123, 503, 765);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            client.field374 = null;
            class84.method697(29945);
            class35.method274(class32.field712, -93, class108.field2738, class12.field248);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            client.field374 = null;
            class91.method754((byte) -70);
            class98.method818(class12.field248, 33, class108.field2738);
        }
        class110.field2787 = arg0;
        class110.field2780 = true;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 463)
    public static void method122(boolean arg0) {
        field338 = null;
        field336 = null;
        field358 = null;
        field346 = null;
        if (arg0) {
            return;
        }
        field340 = null;
        field345 = null;
        field343 = null;
        field347 = null;
        field333 = null;
        field351 = null;
        field350 = null;
        field335 = null;
        field337 = null;
        field359 = null;
        field348 = null;
        field354 = null;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 497)
    public static final void method123(int arg0) {
        if (class124.field3032.toLowerCase().indexOf("microsoft") == -1) {
            class52.field1288[44] = 71;
            class52.field1288[45] = 26;
            class52.field1288[46] = 72;
            class52.field1288[47] = 73;
            class52.field1288[59] = 57;
            class52.field1288[61] = 27;
            class52.field1288[91] = 42;
            class52.field1288[92] = 74;
            class52.field1288[93] = 43;
            if (class124.field3044 == null) {
                class52.field1288[192] = 58;
                class52.field1288[222] = 59;
            } else {
                class52.field1288[192] = 28;
                class52.field1288[222] = 58;
                class52.field1288[520] = 59;
            }
        } else {
            class52.field1288[186] = 57;
            class52.field1288[187] = 27;
            class52.field1288[188] = 71;
            class52.field1288[189] = 26;
            class52.field1288[190] = 72;
            class52.field1288[191] = 73;
            class52.field1288[192] = 58;
            class52.field1288[219] = 42;
            class52.field1288[220] = 74;
            class52.field1288[221] = 43;
            class52.field1288[222] = 59;
            class52.field1288[223] = 28;
        }
        field339++;
        if (arg0 != 18) {
            method118(-52);
        }
    }
}
