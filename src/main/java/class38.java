import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    public static int[] field903 = new int[100];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lid;")
    public static class60 field912 = class11.method72("(U5", (byte) 102);

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lqd;")
    public static class115 field909 = new class115(50);

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lid;")
    public static class60 field922 = class11.method72("W-=hlen Sie eine Welt", (byte) -24);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lid;")
    public static class60 field918 = class11.method72(")4lang)4de", (byte) -87);

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Lmc;")
    public static class86 field921 = new class86(32);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Ltf;")
    public static class138 field920;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[Le;")
    public static class29[] field910;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[Le;")
    public static class29[] field923;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
    public static final int method294(int arg0, int arg1, int arg2) {
        field915++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg1 & arg0) * arg2 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method295(int arg0) {
        if (class26.field625.toLowerCase().indexOf("microsoft") == -1) {
            class93.field2298[61] = 27;
            if (class26.field622 == null) {
                class93.field2298[192] = 58;
                class93.field2298[222] = 59;
            } else {
                class93.field2298[520] = 59;
                class93.field2298[192] = 28;
                class93.field2298[222] = 58;
            }
            class93.field2298[46] = 72;
            class93.field2298[91] = 42;
            class93.field2298[59] = 57;
            class93.field2298[93] = 43;
            class93.field2298[44] = 71;
            class93.field2298[47] = 73;
            class93.field2298[45] = 26;
            class93.field2298[92] = 74;
        } else {
            class93.field2298[219] = 42;
            class93.field2298[190] = 72;
            class93.field2298[192] = 58;
            class93.field2298[191] = 73;
            class93.field2298[188] = 71;
            class93.field2298[187] = 27;
            class93.field2298[220] = 74;
            class93.field2298[189] = 26;
            class93.field2298[186] = 57;
            class93.field2298[221] = 43;
            class93.field2298[223] = 28;
            class93.field2298[222] = 59;
        }
        field908++;
        if (arg0 != 42) {
            method300(null, null);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZLid;ILie;ILid;)V")
    public static final void method296(byte arg0, boolean arg1, class60 arg2, int arg3, class61 arg4, int arg5, class60 arg6) {
        int var7 = arg4.method482(13975, arg2);
        int var8 = arg4.method464((byte) -113, arg6, var7);
        class33.method249(arg1, -2, arg5, var7, arg4, var8, arg3);
        if (arg0 < 97) {
            field903 = null;
        }
        field907++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
    public static final void method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field913++;
        if (class102.field2476 == arg2 && class87.field2181 == arg5 && (class153.field3423 == arg3 || !class22.field548)) {
            return;
        }
        class102.field2476 = arg2;
        class87.field2181 = arg5;
        class153.field3423 = arg3;
        if (!class22.field548) {
            class153.field3423 = 0;
        }
        if (arg1 != 128) {
            return;
        }
        class45.method348((byte) -113, 25);
        class81.method687(true, arg1 ^ 0xFFFFFC80, class19.field465);
        int var6 = class41.field1095;
        class41.field1095 = (arg2 - 6) * 8;
        int var7 = class144.field3240;
        class144.field3240 = (arg5 - 6) * 8;
        int var8 = class41.field1095 - var6;
        int var9 = class41.field1095;
        int var10 = class144.field3240 - var7;
        int var11 = class144.field3240;
        for (int var12 = 0; var12 < 32768; var12++) {
            class53 var28 = class5.field83[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field841[var29] -= var8;
                    var28.field827[var29] -= var10;
                }
                var28.field854 -= var8 * 128;
                var28.field828 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class1 var26 = class81.field2016[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field841[var27] -= var8;
                    var26.field827[var27] -= var10;
                }
                var26.field828 -= var10 * 128;
                var26.field854 -= var8 * 128;
            }
        }
        class46.field1222 = arg3;
        class107.field2640.method266(arg4, arg0, false, -17715);
        byte var14 = 104;
        byte var15 = 0;
        byte var16 = 0;
        byte var17 = 104;
        byte var18 = 1;
        if (var8 < 0) {
            var18 = -1;
            var14 = -1;
            var15 = 103;
        }
        byte var19 = 1;
        if (var10 < 0) {
            var19 = -1;
            var17 = -1;
            var16 = 103;
        }
        for (int var20 = var15; var20 != var14; var20 += var18) {
            for (int var22 = var16; var22 != var17; var22 += var19) {
                int var23 = var8 + var20;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class107.field2637[var25][var20][var22] = class107.field2637[var25][var23][var24];
                    } else {
                        class107.field2637[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class12 var21 = (class12) class53.field1340.method496(10153); var21 != null; var21 = (class12) class53.field1340.method500(arg1 ^ 0xFFFFFF7F)) {
            var21.field201 -= var8;
            var21.field225 -= var10;
            if (var21.field201 < 0 || var21.field225 < 0 || var21.field201 >= 104 || var21.field225 >= 104) {
                var21.method1009((byte) 100);
            }
        }
        class34.field789 = 0;
        if (class48.field1267 != 0) {
            class48.field1267 -= var8;
            class59.field1438 -= var10;
        }
        class109.field2661 = false;
        class28.field659 = -1;
        class109.field2647.method506((byte) 4);
        class25.field610.method506((byte) 4);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method298(int arg0) {
        field909 = null;
        field920 = null;
        field910 = null;
        field921 = null;
        field918 = null;
        field923 = null;
        field903 = null;
        if (arg0 < -115) {
            field922 = null;
            field912 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLfd;)Z")
    public static final boolean method299(byte arg0, class40 arg1) {
        field904++;
        if (arg1.field936 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field936.length; var2++) {
            int var3 = class101.method794(-29559, var2, arg1);
            int var4 = arg1.field1015[var2];
            if (arg1.field936[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field936[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field936[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 > -91) {
            field920 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgf;")
    public static final class48 method300(Throwable arg0, String arg1) {
        field917++;
        class48 var2;
        if (arg0 instanceof class48) {
            var2 = (class48) arg0;
            var2.field1250 = var2.field1250 + ' ' + arg1;
        } else {
            var2 = new class48(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Loe;")
    public static final class102 method301(int arg0) {
        field905++;
        try {
            return arg0 >= -56 ? null : (class102) Class.forName("ma").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lge;")
    public static final class47 method302(int arg0, int arg1) {
        if (arg0 >= -56) {
            return null;
        }
        class47 var2 = (class47) class7.field102.method918(-67, (long) arg1);
        field906++;
        if (var2 != null) {
            return var2;
        }
        class47 var3 = class86.method720(arg1, 67, class87.field2179, false, class69.field1650);
        if (var3 != null) {
            class7.field102.method914(var3, (long) arg1, (byte) 85);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)V")
    public static final void method303(int arg0, int arg1, int arg2) {
        field919++;
        if (class46.field1200 != 0 && class46.field1200 != 3) {
            return;
        }
        if (class60.field1466 == 1) {
            int var3 = class140.field3185 - arg0 - 25;
            int var4 = class139.field3174 - arg2 - 5;
            if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                var3 -= 73;
                int var5 = class157.field3590 + class151.field3394 & 0x7FF;
                var4 -= 75;
                int var6 = class127.field2900[var5];
                int var7 = class127.field2899[var5];
                int var8 = (class145.field3271 + 256) * var7 >> 8;
                int var9 = (class145.field3271 + 256) * var6 >> 8;
                int var10 = var3 * var8 + var4 * var9 >> 11;
                int var11 = class107.field2640.field854 + var10 >> 7;
                int var12 = var4 * var8 - var3 * var9 >> 11;
                int var13 = class107.field2640.field828 - var12 >> 7;
                boolean var14 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 1, var11, true, 0, var13, arg1 ^ 0xFFFFFF2B, 0, 0);
                if (var14) {
                    class22.field519.method818(false, var3);
                    class22.field519.method818(false, var4);
                    class22.field519.method811(true, class157.field3590);
                    class22.field519.method818(false, 57);
                    class22.field519.method818(false, class151.field3394);
                    class22.field519.method818(false, class145.field3271);
                    class22.field519.method818(false, 89);
                    class22.field519.method811(true, class107.field2640.field854);
                    class22.field519.method811(true, class107.field2640.field828);
                    class22.field519.method818(false, class34.field794);
                    class22.field519.method818(false, 63);
                }
            }
        }
        if (arg1 != 128) {
            field922 = null;
        }
    }
}
