import java.awt.Graphics;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class49 extends class59 {

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public int field610 = -1;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public int field613 = 0;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "Z")
    public boolean field611 = true;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public int field608 = -1;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public int field615 = 12800;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public int field607 = 12800;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    public int field630 = 0;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "Ljava/lang/String;")
    public String field614;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "Ljava/lang/String;")
    private String field629;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "Lol;")
    public class220 field618;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "[Z")
    public static boolean[] field623 = new boolean[5];

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "Ljf;")
    public static class216 field626 = new class216(260);

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "Lvl;")
    public static class73 field619;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB[II)Z")
    public final boolean method296(int arg0, byte arg1, int[] arg2, int arg3) {
        field604++;
        class94 var5 = (class94) this.field618.method1548(0);
        if (arg1 != -102) {
            field621 = 105;
        }
        while (var5 != null) {
            if (var5.method644(arg0, arg1 + 107, arg3)) {
                var5.method637(1, arg0, arg3, arg2);
                return true;
            }
            var5 = (class94) this.field618.method1549(95);
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)V")
    private static final void method297(long arg0, int arg1) {
        field616++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 >= -40) {
            method299(false);
        }
        class150.field2218.method445(134, 7);
        class71.field1055++;
        class150.field2218.method1160(-25643, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)I")
    public static final int method298(byte arg0) {
        field617++;
        if (arg0 <= 89) {
            method298((byte) -101);
        }
        return 0;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V")
    public static final void method299(boolean arg0) {
        field609++;
        if (!arg0 && !class197.field3121 && class73.field1104 != 2) {
            try {
                class25.method132(class197.field3117, "tbrefresh", (byte) 73);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBI[I)Z")
    public final boolean method300(int arg0, int arg1, byte arg2, int arg3, int[] arg4) {
        field606++;
        if (arg2 != -52) {
            method304((String) null, true, -118);
        }
        for (class94 var6 = (class94) this.field618.method1548(0); var6 != null; var6 = (class94) this.field618.method1549(91)) {
            if (var6.method638(arg0, (byte) -53, arg3, arg1)) {
                var6.method646(arg0, 8, arg4, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public final void method301(int arg0) {
        field627++;
        int var2 = 39 / ((19 - arg0) / 62);
        this.field613 = 0;
        this.field607 = 12800;
        this.field630 = 0;
        this.field615 = 12800;
        for (class94 var3 = (class94) this.field618.method1548(0); var3 != null; var3 = (class94) this.field618.method1549(-127)) {
            if (this.field607 > var3.field1418) {
                this.field607 = var3.field1418;
            }
            if (this.field615 > var3.field1422) {
                this.field615 = var3.field1422;
            }
            if (var3.field1419 > this.field630) {
                this.field630 = var3.field1419;
            }
            if (this.field613 < var3.field1402) {
                this.field613 = var3.field1402;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)I")
    public static final int method302(int arg0, byte arg1) {
        field625++;
        if (arg1 != 110) {
            field621 = 18;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([IIBI)Z")
    public final boolean method303(int[] arg0, int arg1, byte arg2, int arg3) {
        field620++;
        if (arg2 != -9) {
            field623 = null;
        }
        for (class94 var5 = (class94) this.field618.method1548(0); var5 != null; var5 = (class94) this.field618.method1549(arg2 + 105)) {
            if (var5.method641((byte) -115, arg1, arg3)) {
                var5.method646(arg3, 8, arg0, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method304(String arg0, boolean arg1, int arg2) {
        field603++;
        int var4 = arg2 + 6;
        int var5 = class183.field2880.method1476(arg0, 250);
        int var6 = arg2 + 6;
        int var7 = class183.field2880.method1470(arg0, 250) * 13;
        class151.method1026(var4 - arg2, var6 - arg2, arg2 + var5 + arg2, arg2 + var7 + arg2, 0);
        class151.method1040(var4 - arg2, var6 - arg2, arg2 + arg2 + var5, var7 - -arg2 - -arg2, 16777215);
        class183.field2880.method1483(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class277.method1912(arg2 + arg2 + var5, -30901, -arg2 + var4, var6 - arg2, arg2 + var7 + arg2);
        if (!arg1) {
            class287.method1961(var4, -76, var7, var6, var5);
            return;
        }
        try {
            Graphics var8 = class304.field4831.getGraphics();
            class187.field2935.method64((byte) -96, var8, 0, 0);
        } catch (Exception var9) {
            class304.field4831.repaint();
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZII)Z")
    public final boolean method305(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field611 = false;
        }
        field622++;
        for (class94 var4 = (class94) this.field618.method1548(0); var4 != null; var4 = (class94) this.field618.method1549(105)) {
            if (var4.method641((byte) 69, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
    public static void method306(int arg0) {
        field619 = null;
        if (arg0 == -21776) {
            field623 = null;
            field626 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lek;IB)V")
    public static final void method307(class173 arg0, int arg1, byte arg2) {
        field612++;
        class161.field2412 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = arg0.field2717;
        int var6 = -1;
        byte var7 = -1;
        int[] var8 = arg0.field2715;
        try {
            int var9 = 0;
            if (arg2 != -12) {
                method298((byte) 70);
            }
            label4038: while (true) {
                var9++;
                if (arg1 < var9) {
                    throw new RuntimeException("slow");
                }
                var6++;
                int var526 = var5[var6];
                if (var526 < 100) {
                    if (var526 == 0) {
                        class217.field3397[var3++] = var8[var6];
                        continue;
                    }
                    if (var526 == 1) {
                        int var10 = var8[var6];
                        class217.field3397[var3++] = class299.field4770[var10];
                        continue;
                    }
                    if (var526 == 2) {
                        int var11 = var8[var6];
                        var3--;
                        class290.method1975(126, var11, class217.field3397[var3]);
                        continue;
                    }
                    if (var526 == 3) {
                        class83.field1276[var4++] = arg0.field2722[var6];
                        continue;
                    }
                    if (var526 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var526 == 7) {
                        var3 -= 2;
                        if (class217.field3397[var3 + 1] != class217.field3397[var3]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var526 == 8) {
                        var3 -= 2;
                        if (class217.field3397[var3 + 1] == class217.field3397[var3]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var526 == 9) {
                        var3 -= 2;
                        if (class217.field3397[var3] < class217.field3397[var3 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var526 == 10) {
                        var3 -= 2;
                        if (class217.field3397[var3 + 1] < class217.field3397[var3]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var526 == 21) {
                        if (class161.field2412 == 0) {
                            return;
                        }
                        class69 var12 = class262.field4257[--class161.field2412];
                        class230.field3552 = var12.field1027;
                        class6.field84 = var12.field1026;
                        arg0 = var12.field1031;
                        var8 = arg0.field2715;
                        var5 = arg0.field2717;
                        var6 = var12.field1032;
                        continue;
                    }
                    if (var526 == 25) {
                        int var13 = var8[var6];
                        class217.field3397[var3++] = class161.method1101(1357013281, var13);
                        continue;
                    }
                    if (var526 == 27) {
                        int var14 = var8[var6];
                        var3--;
                        class96.method654(var14, class217.field3397[var3], 23924);
                        continue;
                    }
                    if (var526 == 31) {
                        var3 -= 2;
                        if (class217.field3397[var3 + 1] >= class217.field3397[var3]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var526 == 32) {
                        var3 -= 2;
                        if (class217.field3397[var3] >= class217.field3397[var3 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var526 == 33) {
                        class217.field3397[var3++] = class230.field3552[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var526 == 34) {
                        var10001 = var8[var6];
                        var3--;
                        class230.field3552[var10001] = class217.field3397[var3];
                        continue;
                    }
                    if (var526 == 35) {
                        class83.field1276[var4++] = class6.field84[var8[var6]];
                        continue;
                    }
                    if (var526 == 36) {
                        var10001 = var8[var6];
                        var4--;
                        class6.field84[var10001] = class83.field1276[var4];
                        continue;
                    }
                    if (var526 == 37) {
                        int var15 = var8[var6];
                        var4 -= var15;
                        String var16 = class172.method1237(28851, var15, var4, class83.field1276);
                        class83.field1276[var4++] = var16;
                        continue;
                    }
                    if (var526 == 38) {
                        var3--;
                        continue;
                    }
                    if (var526 == 39) {
                        var4--;
                        continue;
                    }
                    if (var526 == 40) {
                        int var17 = var8[var6];
                        class173 var18 = class79.method537(var17, (byte) -66);
                        int[] var19 = new int[var18.field2720];
                        String[] var20 = new String[var18.field2726];
                        for (int var21 = 0; var21 < var18.field2719; var21++) {
                            var19[var21] = class217.field3397[var3 + var21 - var18.field2719];
                        }
                        for (int var22 = 0; var22 < var18.field2714; var22++) {
                            var20[var22] = class83.field1276[var4 + var22 - var18.field2714];
                        }
                        var4 -= var18.field2714;
                        var3 -= var18.field2719;
                        class69 var23 = new class69();
                        var23.field1032 = var6;
                        var23.field1026 = class6.field84;
                        var23.field1027 = class230.field3552;
                        var23.field1031 = arg0;
                        if (class161.field2412 >= class262.field4257.length) {
                            throw new RuntimeException();
                        }
                        var6 = -1;
                        class262.field4257[class161.field2412++] = var23;
                        class230.field3552 = var19;
                        class6.field84 = var20;
                        arg0 = var18;
                        var5 = var18.field2717;
                        var8 = var18.field2715;
                        continue;
                    }
                    if (var526 == 42) {
                        class217.field3397[var3++] = class56.field814[var8[var6]];
                        continue;
                    }
                    if (var526 == 43) {
                        int var24 = var8[var6];
                        var3--;
                        class56.field814[var24] = class217.field3397[var3];
                        class184.method1304(var24, 1);
                        continue;
                    }
                    if (var526 == 44) {
                        int var25 = var8[var6] & 0xFFFF;
                        int var26 = var8[var6] >> 16;
                        var3--;
                        int var27 = class217.field3397[var3];
                        if (var27 >= 0 && var27 <= 5000) {
                            byte var28 = -1;
                            if (var25 == 105) {
                                var28 = 0;
                            }
                            class197.field3112[var26] = var27;
                            int var29 = 0;
                            while (true) {
                                if (var29 >= var27) {
                                    continue label4038;
                                }
                                class198.field3140[var26][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 45) {
                        var3--;
                        int var30 = class217.field3397[var3];
                        int var31 = var8[var6];
                        if (var30 >= 0 && class197.field3112[var31] > var30) {
                            class217.field3397[var3++] = class198.field3140[var31][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 46) {
                        var3 -= 2;
                        int var32 = var8[var6];
                        int var33 = class217.field3397[var3];
                        if (var33 >= 0 && class197.field3112[var32] > var33) {
                            class198.field3140[var32][var33] = class217.field3397[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 47) {
                        String var34 = class272.field4433[var8[var6]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class83.field1276[var4++] = var34;
                        continue;
                    }
                    if (var526 == 48) {
                        int var35 = var8[var6];
                        var4--;
                        class272.field4433[var35] = class83.field1276[var4];
                        class38.method221(var35, (byte) 82);
                        continue;
                    }
                    if (var526 == 51) {
                        class153 var36 = arg0.field2724[var8[var6]];
                        var3--;
                        class178 var37 = (class178) var36.method1064(-1, (long) class217.field3397[var3]);
                        if (var37 != null) {
                            var6 += var37.field2789;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var8[var6] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                if (var526 < 300) {
                    if (var526 == 100) {
                        var3 -= 3;
                        int var506 = class217.field3397[var3];
                        int var507 = class217.field3397[var3 + 2];
                        int var508 = class217.field3397[var3 + 1];
                        if (var508 == 0) {
                            throw new RuntimeException();
                        }
                        class231 var509 = class201.method1398(var506, 0);
                        if (var509.field3578 == null) {
                            var509.field3578 = new class231[var507 + 1];
                        }
                        if (var507 >= var509.field3578.length) {
                            class231[] var510 = new class231[var507 + 1];
                            for (int var511 = 0; var511 < var509.field3578.length; var511++) {
                                var510[var511] = var509.field3578[var511];
                            }
                            var509.field3578 = var510;
                        }
                        if (var507 > 0 && var509.field3578[var507 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var507 - 1));
                        }
                        class231 var512 = new class231();
                        var512.field3739 = var507;
                        var512.field3585 = true;
                        var512.field3633 = var512.field3595 = var509.field3595;
                        var512.field3620 = var508;
                        var509.field3578[var507] = var512;
                        if (var38) {
                            class21.field273 = var512;
                        } else {
                            class195.field3085 = var512;
                        }
                        class247.method1761(var509, (byte) -116);
                        continue;
                    }
                    if (var526 == 101) {
                        class231 var513 = var38 ? class21.field273 : class195.field3085;
                        if (var513.field3739 == -1) {
                            if (var38) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class231 var514 = class201.method1398(var513.field3595, 0);
                        var514.field3578[var513.field3739] = null;
                        class247.method1761(var514, (byte) -82);
                        continue;
                    }
                    if (var526 == 102) {
                        var3--;
                        class231 var515 = class201.method1398(class217.field3397[var3], arg2 ^ 0xFFFFFFF4);
                        var515.field3578 = null;
                        class247.method1761(var515, (byte) -107);
                        continue;
                    }
                    if (var526 == 200) {
                        var3 -= 2;
                        int var516 = class217.field3397[var3];
                        int var517 = class217.field3397[var3 + 1];
                        class231 var518 = class282.method1942(var516, var517, (byte) -95);
                        if (var518 != null && var517 != -1) {
                            class217.field3397[var3++] = 1;
                            if (var38) {
                                class21.field273 = var518;
                            } else {
                                class195.field3085 = var518;
                            }
                            continue;
                        }
                        class217.field3397[var3++] = 0;
                        continue;
                    }
                    if (var526 == 201) {
                        var3--;
                        int var519 = class217.field3397[var3];
                        class231 var520 = class201.method1398(var519, arg2 ^ 0xFFFFFFF4);
                        if (var520 == null) {
                            class217.field3397[var3++] = 0;
                        } else {
                            class217.field3397[var3++] = 1;
                            if (var38) {
                                class21.field273 = var520;
                            } else {
                                class195.field3085 = var520;
                            }
                        }
                        continue;
                    }
                } else if (var526 < 500) {
                    if (var526 == 403) {
                        var3 -= 2;
                        int var39 = class217.field3397[var3 + 1];
                        int var40 = class217.field3397[var3];
                        for (int var41 = 0; var41 < class270.field4401.length; var41++) {
                            if (class270.field4401[var41] == var40) {
                                class214.field3347.field33.method1226((byte) -100, var41, var39);
                                continue label4038;
                            }
                        }
                        int var42 = 0;
                        while (true) {
                            if (var42 >= class231.field3746.length) {
                                continue label4038;
                            }
                            if (class231.field3746[var42] == var40) {
                                class214.field3347.field33.method1226((byte) -100, var42, var39);
                                continue label4038;
                            }
                            var42++;
                        }
                    }
                    if (var526 == 404) {
                        var3 -= 2;
                        int var43 = class217.field3397[var3];
                        int var44 = class217.field3397[var3 + 1];
                        class214.field3347.field33.method1239(var43, arg2 ^ 0xFFFFF90B, var44);
                        continue;
                    }
                    if (var526 == 410) {
                        var3--;
                        boolean var45 = class217.field3397[var3] != 0;
                        class214.field3347.field33.method1236(arg2 - 81, var45);
                        continue;
                    }
                } else if (var526 >= 1000 && var526 < 1100 || var526 >= 2000 && var526 < 2100) {
                    class231 var500;
                    if (var526 < 2000) {
                        var500 = var38 ? class21.field273 : class195.field3085;
                    } else {
                        var526 -= 1000;
                        var3--;
                        var500 = class201.method1398(class217.field3397[var3], 0);
                    }
                    if (var526 == 1000) {
                        var3 -= 4;
                        var500.field3740 = class217.field3397[var3];
                        var500.field3607 = class217.field3397[var3 + 1];
                        int var501 = class217.field3397[var3 + 3];
                        if (var501 < 0) {
                            var501 = 0;
                        } else if (var501 > 5) {
                            var501 = 5;
                        }
                        int var502 = class217.field3397[var3 + 2];
                        var500.field3644 = (byte) var501;
                        if (var502 < 0) {
                            var502 = 0;
                        } else if (var502 > 5) {
                            var502 = 5;
                        }
                        var500.field3579 = (byte) var502;
                        class247.method1761(var500, (byte) -92);
                        class167.method1140(var500, 50);
                        if (var500.field3739 == -1) {
                            class35.method191(-256, var500.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1001) {
                        var3 -= 4;
                        var500.field3603 = class217.field3397[var3];
                        var500.field3592 = class217.field3397[var3 + 1];
                        var500.field3744 = 0;
                        var500.field3597 = 0;
                        int var503 = class217.field3397[var3 + 2];
                        int var504 = class217.field3397[var3 + 3];
                        if (var503 < 0) {
                            var503 = 0;
                        } else if (var503 > 4) {
                            var503 = 4;
                        }
                        var500.field3591 = (byte) var503;
                        if (var504 < 0) {
                            var504 = 0;
                        } else if (var504 > 4) {
                            var504 = 4;
                        }
                        var500.field3693 = (byte) var504;
                        class247.method1761(var500, (byte) -87);
                        class167.method1140(var500, 50);
                        if (var500.field3620 == 0) {
                            class130.method831((byte) 112, var500, false);
                        }
                        continue;
                    }
                    if (var526 == 1003) {
                        var3--;
                        boolean var505 = class217.field3397[var3] == 1;
                        if (var500.field3692 != var505) {
                            var500.field3692 = var505;
                            class247.method1761(var500, (byte) -103);
                        }
                        if (var500.field3739 == -1) {
                            class13.method78(var500.field3595, true);
                        }
                        continue;
                    }
                    if (var526 == 1004) {
                        var3 -= 2;
                        var500.field3664 = class217.field3397[var3];
                        var500.field3655 = class217.field3397[var3 + 1];
                        class247.method1761(var500, (byte) -88);
                        class167.method1140(var500, 50);
                        if (var500.field3620 == 0) {
                            class130.method831((byte) 65, var500, false);
                        }
                        continue;
                    }
                    if (var526 == 1005) {
                        var3--;
                        var500.field3717 = class217.field3397[var3] == 1;
                        continue;
                    }
                } else if (!(var526 < 1100 || var526 >= 1200) || !(var526 < 2100 || var526 >= 2200)) {
                    class231 var46;
                    if (var526 >= 2000) {
                        var3--;
                        var46 = class201.method1398(class217.field3397[var3], arg2 + 12);
                        var526 -= 1000;
                    } else {
                        var46 = var38 ? class21.field273 : class195.field3085;
                    }
                    if (var526 == 1100) {
                        var3 -= 2;
                        var46.field3616 = class217.field3397[var3];
                        if ((var46.field3720 - var46.field3730) < var46.field3616) {
                            var46.field3616 = var46.field3720 - var46.field3730;
                        }
                        if (var46.field3616 < 0) {
                            var46.field3616 = 0;
                        }
                        var46.field3661 = class217.field3397[var3 + 1];
                        if (var46.field3648 - var46.field3686 < var46.field3661) {
                            var46.field3661 = var46.field3648 - var46.field3686;
                        }
                        if (var46.field3661 < 0) {
                            var46.field3661 = 0;
                        }
                        class247.method1761(var46, (byte) -90);
                        if (var46.field3739 == -1) {
                            class250.method1777(-6217, var46.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1101) {
                        var3--;
                        var46.field3583 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -108);
                        if (var46.field3739 == -1) {
                            class45.method251(6, var46.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1102) {
                        var3--;
                        var46.field3662 = class217.field3397[var3] == 1;
                        class247.method1761(var46, (byte) -107);
                        continue;
                    }
                    if (var526 == 1103) {
                        var3--;
                        var46.field3574 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -103);
                        continue;
                    }
                    if (var526 == 1104) {
                        var3--;
                        var46.field3570 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -99);
                        continue;
                    }
                    if (var526 == 1105) {
                        var3--;
                        var46.field3605 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -119);
                        continue;
                    }
                    if (var526 == 1106) {
                        var3--;
                        var46.field3642 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -110);
                        continue;
                    }
                    if (var526 == 1107) {
                        var3--;
                        var46.field3723 = class217.field3397[var3] == 1;
                        class247.method1761(var46, (byte) -92);
                        continue;
                    }
                    if (var526 == 1108) {
                        var46.field3675 = 1;
                        var3--;
                        var46.field3609 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -97);
                        if (var46.field3739 == -1) {
                            class153.method1055((byte) -64, var46.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1109) {
                        var3 -= 6;
                        var46.field3617 = class217.field3397[var3];
                        var46.field3710 = class217.field3397[var3 + 1];
                        var46.field3651 = class217.field3397[var3 + 2];
                        var46.field3695 = class217.field3397[var3 + 3];
                        var46.field3738 = class217.field3397[var3 + 4];
                        var46.field3727 = class217.field3397[var3 + 5];
                        class247.method1761(var46, (byte) -117);
                        if (var46.field3739 == -1) {
                            class104.method698(var46.field3595, 8);
                            class262.method1843(var46.field3595, 10);
                        }
                        continue;
                    }
                    if (var526 == 1110) {
                        var3--;
                        int var47 = class217.field3397[var3];
                        if (var46.field3631 != var47) {
                            var46.field3631 = var47;
                            var46.field3669 = 0;
                            var46.field3647 = 1;
                            var46.field3659 = 0;
                            class247.method1761(var46, (byte) -122);
                        }
                        if (var46.field3739 == -1) {
                            class86.method583(false, var46.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1111) {
                        var3--;
                        var46.field3568 = class217.field3397[var3] == 1;
                        class247.method1761(var46, (byte) -121);
                        continue;
                    }
                    if (var526 == 1112) {
                        var4--;
                        String var48 = class83.field1276[var4];
                        if (!var48.equals(var46.field3571)) {
                            var46.field3571 = var48;
                            class247.method1761(var46, (byte) -124);
                        }
                        if (var46.field3739 == -1) {
                            class138.method871(24216, var46.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1113) {
                        var3--;
                        var46.field3650 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -125);
                        continue;
                    }
                    if (var526 == 1114) {
                        var3 -= 3;
                        var46.field3572 = class217.field3397[var3];
                        var46.field3625 = class217.field3397[var3 + 1];
                        var46.field3615 = class217.field3397[var3 + 2];
                        class247.method1761(var46, (byte) -119);
                        continue;
                    }
                    if (var526 == 1115) {
                        var3--;
                        var46.field3725 = class217.field3397[var3] == 1;
                        class247.method1761(var46, (byte) -94);
                        continue;
                    }
                    if (var526 == 1116) {
                        var3--;
                        var46.field3573 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -125);
                        continue;
                    }
                    if (var526 == 1117) {
                        var3--;
                        var46.field3745 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -126);
                        continue;
                    }
                    if (var526 == 1118) {
                        var3--;
                        var46.field3700 = class217.field3397[var3] == 1;
                        class247.method1761(var46, (byte) -87);
                        continue;
                    }
                    if (var526 == 1119) {
                        var3--;
                        var46.field3594 = class217.field3397[var3] == 1;
                        class247.method1761(var46, (byte) -80);
                        continue;
                    }
                    if (var526 == 1120) {
                        var3 -= 2;
                        var46.field3720 = class217.field3397[var3];
                        var46.field3648 = class217.field3397[var3 + 1];
                        class247.method1761(var46, (byte) -81);
                        if (var46.field3620 == 0) {
                            class130.method831((byte) 115, var46, false);
                        }
                        continue;
                    }
                    if (var526 == 1121) {
                        class247.method1761(var46, (byte) -112);
                        var3 -= 2;
                        continue;
                    }
                    if (var526 == 1122) {
                        var3--;
                        var46.field3678 = class217.field3397[var3] == 1;
                        class247.method1761(var46, (byte) -126);
                        continue;
                    }
                    if (var526 == 1123) {
                        var3--;
                        var46.field3727 = class217.field3397[var3];
                        class247.method1761(var46, (byte) -117);
                        if (var46.field3739 == -1) {
                            class104.method698(var46.field3595, 8);
                        }
                        continue;
                    }
                    if (var526 == 1124) {
                        var3--;
                        int var49 = class217.field3397[var3];
                        var46.field3576 = var49 == 1;
                        class247.method1761(var46, (byte) -112);
                        continue;
                    }
                } else if (var526 >= 1200 && var526 < 1300 || var526 >= 2200 && var526 < 2300) {
                    class231 var496;
                    if (var526 >= 2000) {
                        var3--;
                        var496 = class201.method1398(class217.field3397[var3], 0);
                        var526 -= 1000;
                    } else {
                        var496 = var38 ? class21.field273 : class195.field3085;
                    }
                    class247.method1761(var496, (byte) -116);
                    if (var526 == 1200 || var526 == 1205 || var526 == 1208 || var526 == 1209) {
                        var3 -= 2;
                        int var497 = class217.field3397[var3 + 1];
                        int var498 = class217.field3397[var3];
                        if (var496.field3739 == -1) {
                            class33.method174(9, var496.field3595);
                            class104.method698(var496.field3595, 8);
                            class262.method1843(var496.field3595, 10);
                        }
                        if (var498 == -1) {
                            var496.field3675 = 1;
                            var496.field3609 = -1;
                            var496.field3657 = -1;
                            continue;
                        }
                        var496.field3657 = var498;
                        if (var526 == 1208 || var526 == 1209) {
                            var496.field3596 = true;
                        } else {
                            var496.field3596 = false;
                        }
                        var496.field3645 = var497;
                        class162 var499 = class104.method696((byte) -26, var498);
                        var496.field3727 = var499.field2442;
                        var496.field3695 = var499.field2481;
                        if (var496.field3597 > 0) {
                            var496.field3727 = var496.field3727 * 32 / var496.field3597;
                        } else if (var496.field3603 > 0) {
                            var496.field3727 = var496.field3727 * 32 / var496.field3603;
                        }
                        var496.field3738 = var499.field2426;
                        if (var526 == 1205) {
                            var496.field3634 = false;
                        } else {
                            var496.field3634 = true;
                        }
                        var496.field3710 = var499.field2461;
                        var496.field3617 = var499.field2428;
                        var496.field3651 = var499.field2468;
                        continue;
                    }
                    if (var526 == 1201) {
                        var496.field3675 = 2;
                        var3--;
                        var496.field3609 = class217.field3397[var3];
                        if (var496.field3739 == -1) {
                            class153.method1055((byte) -81, var496.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1202) {
                        var496.field3675 = 3;
                        var496.field3609 = class214.field3347.field33.method1230(true);
                        if (var496.field3739 == -1) {
                            class153.method1055((byte) -96, var496.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1203) {
                        var496.field3675 = 6;
                        var3--;
                        var496.field3609 = class217.field3397[var3];
                        if (var496.field3739 == -1) {
                            class153.method1055((byte) -97, var496.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1204) {
                        var496.field3675 = 5;
                        var3--;
                        var496.field3609 = class217.field3397[var3];
                        if (var496.field3739 == -1) {
                            class153.method1055((byte) -93, var496.field3595);
                        }
                        continue;
                    }
                    if (var526 == 1206) {
                        var3 -= 4;
                        var496.field3593 = class217.field3397[var3];
                        var496.field3685 = class217.field3397[var3 + 1];
                        var496.field3580 = class217.field3397[var3 + 2];
                        var496.field3694 = class217.field3397[var3 + 3];
                        class247.method1761(var496, (byte) -120);
                        continue;
                    }
                    if (var526 == 1207) {
                        var3 -= 2;
                        var496.field3566 = class217.field3397[var3];
                        var496.field3684 = class217.field3397[var3 + 1];
                        class247.method1761(var496, (byte) -82);
                        continue;
                    }
                } else if ((var526 < 1300 || var526 >= 1400) && (var526 < 2300 || var526 >= 2400)) {
                    if (var526 >= 1400 && var526 < 1500 || var526 >= 2400 && var526 < 2500) {
                        class231 var56;
                        if (var526 >= 2000) {
                            var526 -= 1000;
                            var3--;
                            var56 = class201.method1398(class217.field3397[var3], 0);
                        } else {
                            var56 = var38 ? class21.field273 : class195.field3085;
                        }
                        int[] var57 = null;
                        var4--;
                        String var58 = class83.field1276[var4];
                        if (var58.length() > 0 && var58.charAt(var58.length() - 1) == 'Y') {
                            var3--;
                            int var59 = class217.field3397[var3];
                            if (var59 > 0) {
                                var57 = new int[var59];
                                while ((var59--) > 0) {
                                    var3--;
                                    var57[var59] = class217.field3397[var3];
                                }
                            }
                            var58 = var58.substring(0, var58.length() - 1);
                        }
                        Object[] var60 = new Object[var58.length() + 1];
                        for (int var61 = var60.length - 1; var61 >= 1; var61--) {
                            if (var58.charAt(var61 - 1) == 's') {
                                var4--;
                                var60[var61] = class83.field1276[var4];
                            } else {
                                var3--;
                                var60[var61] = Integer.valueOf(class217.field3397[var3]);
                            }
                        }
                        var3--;
                        int var62 = class217.field3397[var3];
                        if (var62 == -1) {
                            var60 = null;
                        } else {
                            var60[0] = Integer.valueOf(var62);
                        }
                        if (var526 == 1400) {
                            var56.field3630 = var60;
                        } else if (var526 == 1401) {
                            var56.field3680 = var60;
                        } else if (var526 == 1402) {
                            var56.field3629 = var60;
                        } else if (var526 == 1403) {
                            var56.field3639 = var60;
                        } else if (var526 == 1404) {
                            var56.field3660 = var60;
                        } else if (var526 == 1405) {
                            var56.field3666 = var60;
                        } else if (var526 == 1406) {
                            var56.field3676 = var60;
                        } else if (var526 == 1407) {
                            var56.field3575 = var60;
                            var56.field3601 = var57;
                        } else if (var526 == 1408) {
                            var56.field3704 = var60;
                        } else if (var526 == 1409) {
                            var56.field3590 = var60;
                        } else if (var526 == 1410) {
                            var56.field3732 = var60;
                        } else if (var526 == 1411) {
                            var56.field3621 = var60;
                        } else if (var526 == 1412) {
                            var56.field3612 = var60;
                        } else if (var526 == 1414) {
                            var56.field3705 = var57;
                            var56.field3599 = var60;
                        } else if (var526 == 1415) {
                            var56.field3677 = var60;
                            var56.field3719 = var57;
                        } else if (var526 == 1416) {
                            var56.field3656 = var60;
                        } else if (var526 == 1417) {
                            var56.field3628 = var60;
                        } else if (var526 == 1418) {
                            var56.field3611 = var60;
                        } else if (var526 == 1419) {
                            var56.field3619 = var60;
                        } else if (var526 == 1420) {
                            var56.field3668 = var60;
                        } else if (var526 == 1421) {
                            var56.field3632 = var60;
                        } else if (var526 == 1422) {
                            var56.field3726 = var60;
                        } else if (var526 == 1423) {
                            var56.field3627 = var60;
                        } else if (var526 == 1424) {
                            var56.field3588 = var60;
                        } else if (var526 == 1425) {
                            var56.field3606 = var60;
                        } else if (var526 == 1426) {
                            var56.field3569 = var60;
                        } else if (var526 == 1427) {
                            var56.field3709 = var60;
                        } else if (var526 == 1428) {
                            var56.field3640 = var57;
                            var56.field3733 = var60;
                        } else if (var526 == 1429) {
                            var56.field3618 = var57;
                            var56.field3614 = var60;
                        }
                        var56.field3703 = true;
                        continue;
                    }
                    if (var526 < 1600) {
                        class231 var63 = var38 ? class21.field273 : class195.field3085;
                        if (var526 == 1500) {
                            class217.field3397[var3++] = var63.field3734;
                            continue;
                        }
                        if (var526 == 1501) {
                            class217.field3397[var3++] = var63.field3608;
                            continue;
                        }
                        if (var526 == 1502) {
                            class217.field3397[var3++] = var63.field3730;
                            continue;
                        }
                        if (var526 == 1503) {
                            class217.field3397[var3++] = var63.field3686;
                            continue;
                        }
                        if (var526 == 1504) {
                            class217.field3397[var3++] = var63.field3692 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 1505) {
                            class217.field3397[var3++] = var63.field3633;
                            continue;
                        }
                    } else if (var526 < 1700) {
                        class231 var495 = var38 ? class21.field273 : class195.field3085;
                        if (var526 == 1600) {
                            class217.field3397[var3++] = var495.field3616;
                            continue;
                        }
                        if (var526 == 1601) {
                            class217.field3397[var3++] = var495.field3661;
                            continue;
                        }
                        if (var526 == 1602) {
                            class83.field1276[var4++] = var495.field3571;
                            continue;
                        }
                        if (var526 == 1603) {
                            class217.field3397[var3++] = var495.field3720;
                            continue;
                        }
                        if (var526 == 1604) {
                            class217.field3397[var3++] = var495.field3648;
                            continue;
                        }
                        if (var526 == 1605) {
                            class217.field3397[var3++] = var495.field3727;
                            continue;
                        }
                        if (var526 == 1606) {
                            class217.field3397[var3++] = var495.field3651;
                            continue;
                        }
                        if (var526 == 1607) {
                            class217.field3397[var3++] = var495.field3738;
                            continue;
                        }
                        if (var526 == 1608) {
                            class217.field3397[var3++] = var495.field3695;
                            continue;
                        }
                        if (var526 == 1609) {
                            class217.field3397[var3++] = var495.field3574;
                            continue;
                        }
                        if (var526 == 1610) {
                            class217.field3397[var3++] = var495.field3617;
                            continue;
                        }
                        if (var526 == 1611) {
                            class217.field3397[var3++] = var495.field3710;
                            continue;
                        }
                        if (var526 == 1612) {
                            class217.field3397[var3++] = var495.field3605;
                            continue;
                        }
                    } else if (var526 < 1800) {
                        class231 var64 = var38 ? class21.field273 : class195.field3085;
                        if (var526 == 1700) {
                            class217.field3397[var3++] = var64.field3657;
                            continue;
                        }
                        if (var526 == 1701) {
                            if (var64.field3657 == -1) {
                                class217.field3397[var3++] = 0;
                            } else {
                                class217.field3397[var3++] = var64.field3645;
                            }
                            continue;
                        }
                        if (var526 == 1702) {
                            class217.field3397[var3++] = var64.field3739;
                            continue;
                        }
                    } else if (var526 < 1900) {
                        class231 var65 = var38 ? class21.field273 : class195.field3085;
                        if (var526 == 1800) {
                            class217.field3397[var3++] = client.method1698(var65).method159(65);
                            continue;
                        }
                        if (var526 == 1801) {
                            var3--;
                            int var66 = class217.field3397[var3];
                            int var527 = var66 - 1;
                            if (var65.field3622 != null && var65.field3622.length > var527 && var65.field3622[var527] != null) {
                                class83.field1276[var4++] = var65.field3622[var527];
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 1802) {
                            if (var65.field3712 == null) {
                                class83.field1276[var4++] = "";
                            } else {
                                class83.field1276[var4++] = var65.field3712;
                            }
                            continue;
                        }
                    } else if (var526 < 2600) {
                        var3--;
                        class231 var67 = class201.method1398(class217.field3397[var3], 0);
                        if (var526 == 2500) {
                            class217.field3397[var3++] = var67.field3734;
                            continue;
                        }
                        if (var526 == 2501) {
                            class217.field3397[var3++] = var67.field3608;
                            continue;
                        }
                        if (var526 == 2502) {
                            class217.field3397[var3++] = var67.field3730;
                            continue;
                        }
                        if (var526 == 2503) {
                            class217.field3397[var3++] = var67.field3686;
                            continue;
                        }
                        if (var526 == 2504) {
                            class217.field3397[var3++] = var67.field3692 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 2505) {
                            class217.field3397[var3++] = var67.field3633;
                            continue;
                        }
                    } else if (var526 < 2700) {
                        var3--;
                        class231 var68 = class201.method1398(class217.field3397[var3], 0);
                        if (var526 == 2600) {
                            class217.field3397[var3++] = var68.field3616;
                            continue;
                        }
                        if (var526 == 2601) {
                            class217.field3397[var3++] = var68.field3661;
                            continue;
                        }
                        if (var526 == 2602) {
                            class83.field1276[var4++] = var68.field3571;
                            continue;
                        }
                        if (var526 == 2603) {
                            class217.field3397[var3++] = var68.field3720;
                            continue;
                        }
                        if (var526 == 2604) {
                            class217.field3397[var3++] = var68.field3648;
                            continue;
                        }
                        if (var526 == 2605) {
                            class217.field3397[var3++] = var68.field3727;
                            continue;
                        }
                        if (var526 == 2606) {
                            class217.field3397[var3++] = var68.field3651;
                            continue;
                        }
                        if (var526 == 2607) {
                            class217.field3397[var3++] = var68.field3738;
                            continue;
                        }
                        if (var526 == 2608) {
                            class217.field3397[var3++] = var68.field3695;
                            continue;
                        }
                        if (var526 == 2609) {
                            class217.field3397[var3++] = var68.field3574;
                            continue;
                        }
                        if (var526 == 2610) {
                            class217.field3397[var3++] = var68.field3617;
                            continue;
                        }
                        if (var526 == 2611) {
                            class217.field3397[var3++] = var68.field3710;
                            continue;
                        }
                        if (var526 == 2612) {
                            class217.field3397[var3++] = var68.field3605;
                            continue;
                        }
                    } else if (var526 < 2800) {
                        if (var526 == 2700) {
                            var3--;
                            class231 var69 = class201.method1398(class217.field3397[var3], arg2 + 12);
                            class217.field3397[var3++] = var69.field3657;
                            continue;
                        }
                        if (var526 == 2701) {
                            var3--;
                            class231 var70 = class201.method1398(class217.field3397[var3], arg2 ^ 0xFFFFFFF4);
                            if (var70.field3657 == -1) {
                                class217.field3397[var3++] = 0;
                            } else {
                                class217.field3397[var3++] = var70.field3645;
                            }
                            continue;
                        }
                        if (var526 == 2702) {
                            var3--;
                            int var71 = class217.field3397[var3];
                            class104 var72 = (class104) class115.field1674.method1064(-1, (long) var71);
                            if (var72 == null) {
                                class217.field3397[var3++] = 0;
                            } else {
                                class217.field3397[var3++] = 1;
                            }
                            continue;
                        }
                        if (var526 == 2703) {
                            var3--;
                            class231 var73 = class201.method1398(class217.field3397[var3], 0);
                            if (var73.field3578 == null) {
                                class217.field3397[var3++] = 0;
                                continue;
                            }
                            int var74 = var73.field3578.length;
                            for (int var75 = 0; var75 < var73.field3578.length; var75++) {
                                if (var73.field3578[var75] == null) {
                                    var74 = var75;
                                    break;
                                }
                            }
                            class217.field3397[var3++] = var74;
                            continue;
                        }
                        if (var526 == 2704 || var526 == 2705) {
                            var3 -= 2;
                            int var76 = class217.field3397[var3];
                            int var77 = class217.field3397[var3 + 1];
                            class104 var78 = (class104) class115.field1674.method1064(-1, (long) var76);
                            if (var78 != null && var78.field1511 == var77) {
                                class217.field3397[var3++] = 1;
                            } else {
                                class217.field3397[var3++] = 0;
                            }
                            continue;
                        }
                    } else if (var526 < 2900) {
                        var3--;
                        class231 var493 = class201.method1398(class217.field3397[var3], 0);
                        if (var526 == 2800) {
                            class217.field3397[var3++] = client.method1698(var493).method159(62);
                            continue;
                        }
                        if (var526 == 2801) {
                            var3--;
                            int var494 = class217.field3397[var3];
                            int var528 = var494 - 1;
                            if (var493.field3622 != null && var528 < var493.field3622.length && var493.field3622[var528] != null) {
                                class83.field1276[var4++] = var493.field3622[var528];
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 2802) {
                            if (var493.field3712 == null) {
                                class83.field1276[var4++] = "";
                            } else {
                                class83.field1276[var4++] = var493.field3712;
                            }
                            continue;
                        }
                    } else if (var526 < 3200) {
                        if (var526 == 3100) {
                            var4--;
                            String var79 = class83.field1276[var4];
                            class236.method1655(0, "", arg2 + 133, var79);
                            continue;
                        }
                        if (var526 == 3101) {
                            var3 -= 2;
                            class29.method150(-97, class217.field3397[var3 + 1], class214.field3347, class217.field3397[var3]);
                            continue;
                        }
                        if (var526 == 3103) {
                            class121.method788(1427);
                            continue;
                        }
                        if (var526 == 3104) {
                            class200.field3162++;
                            int var80 = 0;
                            var4--;
                            String var81 = class83.field1276[var4];
                            if (class297.method2001((byte) 40, var81)) {
                                var80 = class144.method946(var81, -1);
                            }
                            class150.field2218.method445(242, 7);
                            class150.field2218.method1210(var80, (byte) -16);
                            continue;
                        }
                        if (var526 == 3105) {
                            var4--;
                            String var82 = class83.field1276[var4];
                            class150.field2218.method445(67, arg2 + 19);
                            class184.field2907++;
                            class150.field2218.method1160(-25643, class176.method1256((byte) 127, var82));
                            continue;
                        }
                        if (var526 == 3106) {
                            class111.field1609++;
                            var4--;
                            String var83 = class83.field1276[var4];
                            class150.field2218.method445(25, arg2 + 19);
                            class150.field2218.method1183(var83.length() + 1, 984049208);
                            class150.field2218.method1168((byte) -37, var83);
                            continue;
                        }
                        if (var526 == 3107) {
                            var3--;
                            int var84 = class217.field3397[var3];
                            var4--;
                            String var85 = class83.field1276[var4];
                            class187.method1316((byte) 21, var85, var84);
                            continue;
                        }
                        if (var526 == 3108) {
                            var3 -= 3;
                            int var86 = class217.field3397[var3 + 1];
                            int var87 = class217.field3397[var3];
                            int var88 = class217.field3397[var3 + 2];
                            class231 var89 = class201.method1398(var88, 0);
                            class97.method664(var87, -121, var86, var89);
                            continue;
                        }
                        if (var526 == 3109) {
                            var3 -= 2;
                            int var90 = class217.field3397[var3];
                            int var91 = class217.field3397[var3 + 1];
                            class231 var92 = var38 ? class21.field273 : class195.field3085;
                            class97.method664(var90, -58, var91, var92);
                            continue;
                        }
                        if (var526 == 3110) {
                            class220.field3447++;
                            var3--;
                            int var93 = class217.field3397[var3];
                            class150.field2218.method445(98, 7);
                            class150.field2218.method1180(-17437, var93);
                            continue;
                        }
                    } else if (var526 < 3300) {
                        if (var526 == 3200) {
                            var3 -= 3;
                            class205.method1416(class217.field3397[var3], class217.field3397[var3 + 1], 8526, class217.field3397[var3 + 2], 255);
                            continue;
                        }
                        if (var526 == 3201) {
                            var3--;
                            class135.method858(255, class217.field3397[var3], true);
                            continue;
                        }
                        if (var526 == 3202) {
                            var3 -= 2;
                            class62.method393(255, class217.field3397[var3], arg2 - 1910, class217.field3397[var3 + 1]);
                            continue;
                        }
                    } else if (var526 < 3400) {
                        if (var526 == 3300) {
                            class217.field3397[var3++] = class311.field4996;
                            continue;
                        }
                        if (var526 == 3301) {
                            var3 -= 2;
                            int var459 = class217.field3397[var3];
                            int var460 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class300.method2020(var459, (byte) 113, var460);
                            continue;
                        }
                        if (var526 == 3302) {
                            var3 -= 2;
                            int var461 = class217.field3397[var3];
                            int var462 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class166.method1136(var461, (byte) -74, var462);
                            continue;
                        }
                        if (var526 == 3303) {
                            var3 -= 2;
                            int var463 = class217.field3397[var3];
                            int var464 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class296.method1994(var463, -1, var464);
                            continue;
                        }
                        if (var526 == 3304) {
                            var3--;
                            int var465 = class217.field3397[var3];
                            class217.field3397[var3++] = class13.method72(false, var465).field2603;
                            continue;
                        }
                        if (var526 == 3305) {
                            var3--;
                            int var466 = class217.field3397[var3];
                            class217.field3397[var3++] = class305.field4862[var466];
                            continue;
                        }
                        if (var526 == 3306) {
                            var3--;
                            int var467 = class217.field3397[var3];
                            class217.field3397[var3++] = class274.field4450[var467];
                            continue;
                        }
                        if (var526 == 3307) {
                            var3--;
                            int var468 = class217.field3397[var3];
                            class217.field3397[var3++] = class118.field1701[var468];
                            continue;
                        }
                        if (var526 == 3308) {
                            int var469 = class148.field2204;
                            int var470 = (class214.field3347.field3920 >> 7) + class5.field77;
                            int var471 = (class214.field3347.field3915 >> 7) + class113.field1653;
                            class217.field3397[var3++] = (var469 << 28) + var470 + (var471 << 14);
                            continue;
                        }
                        if (var526 == 3309) {
                            var3--;
                            int var472 = class217.field3397[var3];
                            class217.field3397[var3++] = class205.method1411(var472 >> 14, 16383);
                            continue;
                        }
                        if (var526 == 3310) {
                            var3--;
                            int var473 = class217.field3397[var3];
                            class217.field3397[var3++] = var473 >> 28;
                            continue;
                        }
                        if (var526 == 3311) {
                            var3--;
                            int var474 = class217.field3397[var3];
                            class217.field3397[var3++] = class205.method1411(16383, var474);
                            continue;
                        }
                        if (var526 == 3312) {
                            class217.field3397[var3++] = class147.field2191 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3313) {
                            var3 -= 2;
                            int var475 = class217.field3397[var3] + 32768;
                            int var476 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class300.method2020(var475, (byte) -91, var476);
                            continue;
                        }
                        if (var526 == 3314) {
                            var3 -= 2;
                            int var477 = class217.field3397[var3] + 32768;
                            int var478 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class166.method1136(var477, (byte) -74, var478);
                            continue;
                        }
                        if (var526 == 3315) {
                            var3 -= 2;
                            int var479 = class217.field3397[var3] + 32768;
                            int var480 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class296.method1994(var479, arg2 + 11, var480);
                            continue;
                        }
                        if (var526 == 3316) {
                            if (class72.field1072 >= 2) {
                                class217.field3397[var3++] = class72.field1072;
                            } else {
                                class217.field3397[var3++] = 0;
                            }
                            continue;
                        }
                        if (var526 == 3317) {
                            class217.field3397[var3++] = class205.field3200;
                            continue;
                        }
                        if (var526 == 3318) {
                            class217.field3397[var3++] = class67.field991;
                            continue;
                        }
                        if (var526 == 3321) {
                            class217.field3397[var3++] = class304.field4828;
                            continue;
                        }
                        if (var526 == 3322) {
                            class217.field3397[var3++] = class234.field3778;
                            continue;
                        }
                        if (var526 == 3323) {
                            if (class20.field269 >= 5 && class20.field269 <= 9) {
                                class217.field3397[var3++] = 1;
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3324) {
                            if (class20.field269 >= 5 && class20.field269 <= 9) {
                                class217.field3397[var3++] = class20.field269;
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3325) {
                            class217.field3397[var3++] = class310.field4986 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3326) {
                            class217.field3397[var3++] = class214.field3347.field13;
                            continue;
                        }
                        if (var526 == 3327) {
                            class217.field3397[var3++] = class214.field3347.field33.field2711 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3328) {
                            class217.field3397[var3++] = class235.field3799 && !class83.field1280 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3329) {
                            class217.field3397[var3++] = class211.field3283 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3330) {
                            var3--;
                            int var481 = class217.field3397[var3];
                            class217.field3397[var3++] = class138.method872(109, var481);
                            continue;
                        }
                        if (var526 == 3331) {
                            var3 -= 2;
                            int var482 = class217.field3397[var3];
                            int var483 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class293.method1983(var483, false, var482, -1);
                            continue;
                        }
                        if (var526 == 3332) {
                            var3 -= 2;
                            int var484 = class217.field3397[var3];
                            int var485 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class293.method1983(var485, true, var484, -1);
                            continue;
                        }
                        if (var526 == 3333) {
                            class217.field3397[var3++] = class18.field243;
                            continue;
                        }
                        if (var526 == 3335) {
                            class217.field3397[var3++] = class46.field571;
                            continue;
                        }
                        if (var526 == 3336) {
                            var3 -= 4;
                            int var486 = class217.field3397[var3];
                            int var487 = class217.field3397[var3 + 2];
                            int var488 = class217.field3397[var3 + 1];
                            int var489 = (var488 << 14) + var486;
                            int var490 = (var487 << 28) + var489;
                            int var491 = class217.field3397[var3 + 3];
                            int var492 = var490 + var491;
                            class217.field3397[var3++] = var492;
                            continue;
                        }
                        if (var526 == 3337) {
                            class217.field3397[var3++] = class158.field2371;
                            continue;
                        }
                    } else if (var526 < 3500) {
                        if (var526 == 3400) {
                            var3 -= 2;
                            int var442 = class217.field3397[var3];
                            int var443 = class217.field3397[var3 + 1];
                            class89 var444 = class290.method1973(var442, (byte) 127);
                            class83.field1276[var4++] = var444.method601((byte) 45, var443);
                            continue;
                        }
                        if (var526 == 3408) {
                            var3 -= 4;
                            int var445 = class217.field3397[var3];
                            int var446 = class217.field3397[var3 + 2];
                            int var447 = class217.field3397[var3 + 1];
                            int var448 = class217.field3397[var3 + 3];
                            class89 var449 = class290.method1973(var446, (byte) 125);
                            if (var449.field1343 == var445 && var449.field1348 == var447) {
                                if (var447 == 115) {
                                    class83.field1276[var4++] = var449.method601((byte) 45, var448);
                                } else {
                                    class217.field3397[var3++] = var449.method595(true, var448);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var526 == 3409) {
                            var3 -= 3;
                            int var450 = class217.field3397[var3 + 1];
                            int var451 = class217.field3397[var3];
                            int var452 = class217.field3397[var3 + 2];
                            if (var450 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class89 var453 = class290.method1973(var450, (byte) 127);
                            if (var453.field1348 != var451) {
                                throw new RuntimeException("C3409-1");
                            }
                            class217.field3397[var3++] = var453.method596(4, var452) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3410) {
                            var3--;
                            int var454 = class217.field3397[var3];
                            var4--;
                            String var455 = class83.field1276[var4];
                            if (var454 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class89 var456 = class290.method1973(var454, (byte) 126);
                            if (var456.field1348 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class217.field3397[var3++] = var456.method600((byte) -96, var455) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3411) {
                            var3--;
                            int var457 = class217.field3397[var3];
                            class89 var458 = class290.method1973(var457, (byte) 127);
                            class217.field3397[var3++] = var458.field1335.method1063(0);
                            continue;
                        }
                    } else if (var526 < 3700) {
                        if (var526 == 3600) {
                            if (class60.field880 == 0) {
                                class217.field3397[var3++] = -2;
                            } else if (class60.field880 == 1) {
                                class217.field3397[var3++] = -1;
                            } else {
                                class217.field3397[var3++] = class76.field1142;
                            }
                            continue;
                        }
                        if (var526 == 3601) {
                            var3--;
                            int var94 = class217.field3397[var3];
                            if (class60.field880 == 2 && class76.field1142 > var94) {
                                class83.field1276[var4++] = class301.field4799[var94];
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 3602) {
                            var3--;
                            int var95 = class217.field3397[var3];
                            if (class60.field880 == 2 && var95 < class76.field1142) {
                                class217.field3397[var3++] = class127.field1821[var95];
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3603) {
                            var3--;
                            int var96 = class217.field3397[var3];
                            if (class60.field880 == 2 && class76.field1142 > var96) {
                                class217.field3397[var3++] = class113.field1655[var96];
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3604) {
                            var4--;
                            String var97 = class83.field1276[var4];
                            var3--;
                            int var98 = class217.field3397[var3];
                            class107.method713(true, var97, var98);
                            continue;
                        }
                        if (var526 == 3605) {
                            var4--;
                            String var99 = class83.field1276[var4];
                            class200.method1392(class176.method1256((byte) 127, var99), true);
                            continue;
                        }
                        if (var526 == 3606) {
                            var4--;
                            String var100 = class83.field1276[var4];
                            class192.method1354(class176.method1256((byte) 127, var100), (byte) 22);
                            continue;
                        }
                        if (var526 == 3607) {
                            var4--;
                            String var101 = class83.field1276[var4];
                            class39.method224(class176.method1256((byte) 127, var101), (byte) -116, false);
                            continue;
                        }
                        if (var526 == 3608) {
                            var4--;
                            String var102 = class83.field1276[var4];
                            class309.method2086(class176.method1256((byte) 127, var102), (byte) -42);
                            continue;
                        }
                        if (var526 == 3609) {
                            var4--;
                            String var103 = class83.field1276[var4];
                            if (var103.startsWith("<img=0>") || var103.startsWith("<img=1>")) {
                                var103 = var103.substring(7);
                            }
                            class217.field3397[var3++] = class209.method1454(var103, -96) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3610) {
                            var3--;
                            int var104 = class217.field3397[var3];
                            if (class60.field880 == 2 && class76.field1142 > var104) {
                                class83.field1276[var4++] = class198.field3143[var104];
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 3611) {
                            if (class28.field351 == null) {
                                class83.field1276[var4++] = "";
                            } else {
                                class83.field1276[var4++] = class256.method1820(-16963, class28.field351);
                            }
                            continue;
                        }
                        if (var526 == 3612) {
                            if (class28.field351 == null) {
                                class217.field3397[var3++] = 0;
                            } else {
                                class217.field3397[var3++] = class220.field3456;
                            }
                            continue;
                        }
                        if (var526 == 3613) {
                            var3--;
                            int var105 = class217.field3397[var3];
                            if (class28.field351 != null && class220.field3456 > var105) {
                                class83.field1276[var4++] = class256.method1820(-16963, class215.field3360[var105].field498);
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 3614) {
                            var3--;
                            int var106 = class217.field3397[var3];
                            if (class28.field351 != null && class220.field3456 > var106) {
                                class217.field3397[var3++] = class215.field3360[var106].field505;
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3615) {
                            var3--;
                            int var107 = class217.field3397[var3];
                            if (class28.field351 != null && var107 < class220.field3456) {
                                class217.field3397[var3++] = class215.field3360[var107].field502;
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3616) {
                            class217.field3397[var3++] = class89.field1337;
                            continue;
                        }
                        if (var526 == 3617) {
                            var4--;
                            String var108 = class83.field1276[var4];
                            class128.method826((byte) 126, var108);
                            continue;
                        }
                        if (var526 == 3618) {
                            class217.field3397[var3++] = class312.field5007;
                            continue;
                        }
                        if (var526 == 3619) {
                            var4--;
                            String var109 = class83.field1276[var4];
                            method297(class176.method1256((byte) 127, var109), -73);
                            continue;
                        }
                        if (var526 == 3620) {
                            class287.method1959(121);
                            continue;
                        }
                        if (var526 == 3621) {
                            if (class60.field880 == 0) {
                                class217.field3397[var3++] = -1;
                            } else {
                                class217.field3397[var3++] = class84.field1302;
                            }
                            continue;
                        }
                        if (var526 == 3622) {
                            var3--;
                            int var110 = class217.field3397[var3];
                            if (class60.field880 != 0 && var110 < class84.field1302) {
                                class83.field1276[var4++] = class178.method1264(class58.field863[var110], (byte) 103);
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 3623) {
                            var4--;
                            String var111 = class83.field1276[var4];
                            if (var111.startsWith("<img=0>") || var111.startsWith("<img=1>")) {
                                var111 = var111.substring(7);
                            }
                            class217.field3397[var3++] = class255.method1809((byte) 106, var111) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3624) {
                            var3--;
                            int var112 = class217.field3397[var3];
                            if (class215.field3360 != null && var112 < class220.field3456 && class215.field3360[var112].field498.equalsIgnoreCase(class214.field3347.field31)) {
                                class217.field3397[var3++] = 1;
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3625) {
                            if (class193.field3064 == null) {
                                class83.field1276[var4++] = "";
                            } else {
                                class83.field1276[var4++] = class256.method1820(-16963, class193.field3064);
                            }
                            continue;
                        }
                        if (var526 == 3626) {
                            var3--;
                            int var113 = class217.field3397[var3];
                            if (class28.field351 != null && class220.field3456 > var113) {
                                class83.field1276[var4++] = class215.field3360[var113].field501;
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 3627) {
                            var3--;
                            int var114 = class217.field3397[var3];
                            if (class60.field880 == 2 && var114 >= 0 && class76.field1142 > var114) {
                                class217.field3397[var3++] = class214.field3349[var114] ? 1 : 0;
                                continue;
                            }
                            class217.field3397[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3628) {
                            var4--;
                            String var115 = class83.field1276[var4];
                            if (var115.startsWith("<img=0>") || var115.startsWith("<img=1>")) {
                                var115 = var115.substring(7);
                            }
                            class217.field3397[var3++] = class111.method744(var115, (byte) 116);
                            continue;
                        }
                        if (var526 == 3629) {
                            class217.field3397[var3++] = class166.field2561;
                            continue;
                        }
                        if (var526 == 3630) {
                            var4--;
                            String var116 = class83.field1276[var4];
                            class39.method224(class176.method1256((byte) 127, var116), (byte) -69, true);
                            continue;
                        }
                        if (var526 == 3631) {
                            var3--;
                            int var117 = class217.field3397[var3];
                            class217.field3397[var3++] = class82.field1249[var117] ? 1 : 0;
                            continue;
                        }
                    } else if (var526 < 4000) {
                        if (var526 == 3903) {
                            var3--;
                            int var428 = class217.field3397[var3];
                            class217.field3397[var3++] = class60.field883[var428].method1890((byte) 90);
                            continue;
                        }
                        if (var526 == 3904) {
                            var3--;
                            int var429 = class217.field3397[var3];
                            class217.field3397[var3++] = class60.field883[var429].field4429;
                            continue;
                        }
                        if (var526 == 3905) {
                            var3--;
                            int var430 = class217.field3397[var3];
                            class217.field3397[var3++] = class60.field883[var430].field4419;
                            continue;
                        }
                        if (var526 == 3906) {
                            var3--;
                            int var431 = class217.field3397[var3];
                            class217.field3397[var3++] = class60.field883[var431].field4425;
                            continue;
                        }
                        if (var526 == 3907) {
                            var3--;
                            int var432 = class217.field3397[var3];
                            class217.field3397[var3++] = class60.field883[var432].field4422;
                            continue;
                        }
                        if (var526 == 3908) {
                            var3--;
                            int var433 = class217.field3397[var3];
                            class217.field3397[var3++] = class60.field883[var433].field4416;
                            continue;
                        }
                        if (var526 == 3910) {
                            var3--;
                            int var434 = class217.field3397[var3];
                            int var435 = class60.field883[var434].method1895(arg2 ^ 0x58);
                            class217.field3397[var3++] = var435 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3911) {
                            var3--;
                            int var436 = class217.field3397[var3];
                            int var437 = class60.field883[var436].method1895(124);
                            class217.field3397[var3++] = var437 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3912) {
                            var3--;
                            int var438 = class217.field3397[var3];
                            int var439 = class60.field883[var438].method1895(79);
                            class217.field3397[var3++] = var439 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3913) {
                            var3--;
                            int var440 = class217.field3397[var3];
                            int var441 = class60.field883[var440].method1895(-81);
                            class217.field3397[var3++] = var441 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var526 < 4100) {
                        if (var526 == 4000) {
                            var3 -= 2;
                            int var118 = class217.field3397[var3];
                            int var119 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = var118 + var119;
                            continue;
                        }
                        if (var526 == 4001) {
                            var3 -= 2;
                            int var120 = class217.field3397[var3];
                            int var121 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = var120 - var121;
                            continue;
                        }
                        if (var526 == 4002) {
                            var3 -= 2;
                            int var122 = class217.field3397[var3];
                            int var123 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = var122 * var123;
                            continue;
                        }
                        if (var526 == 4003) {
                            var3 -= 2;
                            int var124 = class217.field3397[var3];
                            int var125 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = var124 / var125;
                            continue;
                        }
                        if (var526 == 4004) {
                            var3--;
                            int var126 = class217.field3397[var3];
                            class217.field3397[var3++] = (int) ((double) var126 * Math.random());
                            continue;
                        }
                        if (var526 == 4005) {
                            var3--;
                            int var127 = class217.field3397[var3];
                            class217.field3397[var3++] = (int) ((double) (var127 + 1) * Math.random());
                            continue;
                        }
                        if (var526 == 4006) {
                            var3 -= 5;
                            int var128 = class217.field3397[var3];
                            int var129 = class217.field3397[var3 + 1];
                            int var130 = class217.field3397[var3 + 2];
                            int var131 = class217.field3397[var3 + 4];
                            int var132 = class217.field3397[var3 + 3];
                            class217.field3397[var3++] = var128 + ((var129 - var128) * (var131 - var130) / (var132 - var130));
                            continue;
                        }
                        if (var526 == 4007) {
                            var3 -= 2;
                            long var133 = (long) class217.field3397[var3];
                            long var135 = (long) class217.field3397[var3 + 1];
                            class217.field3397[var3++] = (int) (var133 * var135 / 100L + var133);
                            continue;
                        }
                        if (var526 == 4008) {
                            var3 -= 2;
                            int var137 = class217.field3397[var3 + 1];
                            int var138 = class217.field3397[var3];
                            class217.field3397[var3++] = class243.method1723(var138, 0x1 << var137);
                            continue;
                        }
                        if (var526 == 4009) {
                            var3 -= 2;
                            int var139 = class217.field3397[var3 + 1];
                            int var140 = class217.field3397[var3];
                            class217.field3397[var3++] = class205.method1411(-(0x1 << var139) - 1, var140);
                            continue;
                        }
                        if (var526 == 4010) {
                            var3 -= 2;
                            int var141 = class217.field3397[var3 + 1];
                            int var142 = class217.field3397[var3];
                            class217.field3397[var3++] = class205.method1411(var142, 0x1 << var141) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var526 == 4011) {
                            var3 -= 2;
                            int var143 = class217.field3397[var3 + 1];
                            int var144 = class217.field3397[var3];
                            class217.field3397[var3++] = var144 % var143;
                            continue;
                        }
                        if (var526 == 4012) {
                            var3 -= 2;
                            int var145 = class217.field3397[var3 + 1];
                            int var146 = class217.field3397[var3];
                            if (var146 == 0) {
                                class217.field3397[var3++] = 0;
                            } else {
                                class217.field3397[var3++] = (int) Math.pow((double) var146, (double) var145);
                            }
                            continue;
                        }
                        if (var526 == 4013) {
                            var3 -= 2;
                            int var147 = class217.field3397[var3];
                            int var148 = class217.field3397[var3 + 1];
                            if (var147 == 0) {
                                class217.field3397[var3++] = 0;
                            } else if (var148 == 0) {
                                class217.field3397[var3++] = Integer.MAX_VALUE;
                            } else {
                                class217.field3397[var3++] = (int) Math.pow((double) var147, 1.0D / (double) var148);
                            }
                            continue;
                        }
                        if (var526 == 4014) {
                            var3 -= 2;
                            int var149 = class217.field3397[var3];
                            int var150 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class205.method1411(var150, var149);
                            continue;
                        }
                        if (var526 == 4015) {
                            var3 -= 2;
                            int var151 = class217.field3397[var3 + 1];
                            int var152 = class217.field3397[var3];
                            class217.field3397[var3++] = class243.method1723(var152, var151);
                            continue;
                        }
                        if (var526 == 4016) {
                            var3 -= 2;
                            int var153 = class217.field3397[var3];
                            int var154 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = var154 > var153 ? var153 : var154;
                            continue;
                        }
                        if (var526 == 4017) {
                            var3 -= 2;
                            int var155 = class217.field3397[var3];
                            int var156 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = var156 < var155 ? var155 : var156;
                            continue;
                        }
                        if (var526 == 4018) {
                            var3 -= 3;
                            long var157 = (long) class217.field3397[var3];
                            long var159 = (long) class217.field3397[var3 + 1];
                            long var161 = (long) class217.field3397[var3 + 2];
                            class217.field3397[var3++] = (int) (var157 * var161 / var159);
                            continue;
                        }
                    } else if (var526 < 4200) {
                        if (var526 == 4100) {
                            var4--;
                            String var378 = class83.field1276[var4];
                            var3--;
                            int var379 = class217.field3397[var3];
                            class83.field1276[var4++] = var378 + var379;
                            continue;
                        }
                        if (var526 == 4101) {
                            var4 -= 2;
                            String var380 = class83.field1276[var4];
                            String var381 = class83.field1276[var4 + 1];
                            class83.field1276[var4++] = var380 + var381;
                            continue;
                        }
                        if (var526 == 4102) {
                            var4--;
                            String var382 = class83.field1276[var4];
                            var3--;
                            int var383 = class217.field3397[var3];
                            class83.field1276[var4++] = var382 + class92.method625(arg2 + 12, var383, true);
                            continue;
                        }
                        if (var526 == 4103) {
                            var4--;
                            String var384 = class83.field1276[var4];
                            class83.field1276[var4++] = var384.toLowerCase();
                            continue;
                        }
                        if (var526 == 4104) {
                            var3--;
                            int var385 = class217.field3397[var3];
                            long var386 = (long) var385 * 86400000L + 1014768000000L;
                            class206.field3220.setTime(new Date(var386));
                            int var388 = class206.field3220.get(5);
                            int var389 = class206.field3220.get(2);
                            int var390 = class206.field3220.get(1);
                            class83.field1276[var4++] = var388 + "-" + class118.field1702[var389] + "-" + var390;
                            continue;
                        }
                        if (var526 == 4105) {
                            var4 -= 2;
                            String var391 = class83.field1276[var4];
                            String var392 = class83.field1276[var4 + 1];
                            if (class214.field3347.field33 != null && class214.field3347.field33.field2711) {
                                class83.field1276[var4++] = var392;
                                continue;
                            }
                            class83.field1276[var4++] = var391;
                            continue;
                        }
                        if (var526 == 4106) {
                            var3--;
                            int var393 = class217.field3397[var3];
                            class83.field1276[var4++] = Integer.toString(var393);
                            continue;
                        }
                        if (var526 == 4107) {
                            var4 -= 2;
                            class217.field3397[var3++] = class8.method49(6, class122.method794(0, class83.field1276[var4], class83.field1276[var4 + 1], class46.field571));
                            continue;
                        }
                        if (var526 == 4108) {
                            var3 -= 2;
                            int var394 = class217.field3397[var3];
                            var4--;
                            String var395 = class83.field1276[var4];
                            int var396 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class205.method1415(var396, 58).method1470(var395, var394);
                            continue;
                        }
                        if (var526 == 4109) {
                            var3 -= 2;
                            var4--;
                            String var397 = class83.field1276[var4];
                            int var398 = class217.field3397[var3];
                            int var399 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = class205.method1415(var399, class299.method2011(arg2, -108)).method1476(var397, var398);
                            continue;
                        }
                        if (var526 == 4110) {
                            var4 -= 2;
                            String var400 = class83.field1276[var4];
                            String var401 = class83.field1276[var4 + 1];
                            var3--;
                            if (class217.field3397[var3] == 1) {
                                class83.field1276[var4++] = var400;
                            } else {
                                class83.field1276[var4++] = var401;
                            }
                            continue;
                        }
                        if (var526 == 4111) {
                            var4--;
                            String var402 = class83.field1276[var4];
                            class83.field1276[var4++] = class213.method1472(var402);
                            continue;
                        }
                        if (var526 == 4112) {
                            var4--;
                            String var403 = class83.field1276[var4];
                            var3--;
                            int var404 = class217.field3397[var3];
                            if (var404 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class83.field1276[var4++] = var403 + (char) var404;
                            continue;
                        }
                        if (var526 == 4113) {
                            var3--;
                            int var405 = class217.field3397[var3];
                            class217.field3397[var3++] = class306.method2046((char) var405, 8364) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4114) {
                            var3--;
                            int var406 = class217.field3397[var3];
                            class217.field3397[var3++] = class142.method926((byte) -20, (char) var406) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4115) {
                            var3--;
                            int var407 = class217.field3397[var3];
                            class217.field3397[var3++] = class84.method572((byte) 57, (char) var407) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4116) {
                            var3--;
                            int var408 = class217.field3397[var3];
                            class217.field3397[var3++] = class214.method1502((char) var408, (byte) 43) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4117) {
                            var4--;
                            String var409 = class83.field1276[var4];
                            if (var409 == null) {
                                class217.field3397[var3++] = 0;
                            } else {
                                class217.field3397[var3++] = var409.length();
                            }
                            continue;
                        }
                        if (var526 == 4118) {
                            var4--;
                            String var410 = class83.field1276[var4];
                            var3 -= 2;
                            int var411 = class217.field3397[var3 + 1];
                            int var412 = class217.field3397[var3];
                            class83.field1276[var4++] = var410.substring(var412, var411);
                            continue;
                        }
                        if (var526 == 4119) {
                            var4--;
                            String var413 = class83.field1276[var4];
                            StringBuffer var414 = new StringBuffer(var413.length());
                            boolean var415 = false;
                            for (int var416 = 0; var413.length() > var416; var416++) {
                                char var417 = var413.charAt(var416);
                                if (var417 == '<') {
                                    var415 = true;
                                } else if (var417 == '>') {
                                    var415 = false;
                                } else if (!var415) {
                                    var414.append(var417);
                                }
                            }
                            class83.field1276[var4++] = var414.toString();
                            continue;
                        }
                        if (var526 == 4120) {
                            var4--;
                            String var418 = class83.field1276[var4];
                            var3 -= 2;
                            int var419 = class217.field3397[var3];
                            int var420 = class217.field3397[var3 + 1];
                            class217.field3397[var3++] = var418.indexOf(var419, var420);
                            continue;
                        }
                        if (var526 == 4121) {
                            var4 -= 2;
                            var3--;
                            int var421 = class217.field3397[var3];
                            String var422 = class83.field1276[var4];
                            String var423 = class83.field1276[var4 + 1];
                            class217.field3397[var3++] = var422.indexOf(var423, var421);
                            continue;
                        }
                        if (var526 == 4122) {
                            var3--;
                            int var424 = class217.field3397[var3];
                            class217.field3397[var3++] = Character.toLowerCase((char) var424);
                            continue;
                        }
                        if (var526 == 4123) {
                            var3--;
                            int var425 = class217.field3397[var3];
                            class217.field3397[var3++] = Character.toUpperCase((char) var425);
                            continue;
                        }
                        if (var526 == 4124) {
                            var3--;
                            boolean var426 = class217.field3397[var3] != 0;
                            var3--;
                            int var427 = class217.field3397[var3];
                            class83.field1276[var4++] = class171.method1224(var426, (long) var427, class46.field571, 0, 2732);
                            continue;
                        }
                    } else if (var526 < 4300) {
                        if (var526 == 4200) {
                            var3--;
                            int var163 = class217.field3397[var3];
                            class83.field1276[var4++] = class104.method696((byte) -26, var163).field2425;
                            continue;
                        }
                        if (var526 == 4201) {
                            var3 -= 2;
                            int var164 = class217.field3397[var3];
                            int var165 = class217.field3397[var3 + 1];
                            class162 var166 = class104.method696((byte) -26, var164);
                            if (var165 >= 1 && var165 <= 5 && var166.field2432[var165 - 1] != null) {
                                class83.field1276[var4++] = var166.field2432[var165 - 1];
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 4202) {
                            var3 -= 2;
                            int var167 = class217.field3397[var3];
                            int var168 = class217.field3397[var3 + 1];
                            class162 var169 = class104.method696((byte) -26, var167);
                            if (var168 >= 1 && var168 <= 5 && var169.field2464[var168 - 1] != null) {
                                class83.field1276[var4++] = var169.field2464[var168 - 1];
                                continue;
                            }
                            class83.field1276[var4++] = "";
                            continue;
                        }
                        if (var526 == 4203) {
                            var3--;
                            int var170 = class217.field3397[var3];
                            class217.field3397[var3++] = class104.method696((byte) -26, var170).field2434;
                            continue;
                        }
                        if (var526 == 4204) {
                            var3--;
                            int var171 = class217.field3397[var3];
                            class217.field3397[var3++] = class104.method696((byte) -26, var171).field2422 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4205) {
                            var3--;
                            int var172 = class217.field3397[var3];
                            class162 var173 = class104.method696((byte) -26, var172);
                            if (var173.field2490 == -1 && var173.field2454 >= 0) {
                                class217.field3397[var3++] = var173.field2454;
                                continue;
                            }
                            class217.field3397[var3++] = var172;
                            continue;
                        }
                        if (var526 == 4206) {
                            var3--;
                            int var174 = class217.field3397[var3];
                            class162 var175 = class104.method696((byte) -26, var174);
                            if (var175.field2490 >= 0 && var175.field2454 >= 0) {
                                class217.field3397[var3++] = var175.field2454;
                                continue;
                            }
                            class217.field3397[var3++] = var174;
                            continue;
                        }
                        if (var526 == 4207) {
                            var3--;
                            int var176 = class217.field3397[var3];
                            class217.field3397[var3++] = class104.method696((byte) -26, var176).field2478 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4208) {
                            var3 -= 2;
                            int var177 = class217.field3397[var3];
                            int var178 = class217.field3397[var3 + 1];
                            class226 var179 = class214.method1501(var178, (byte) -59);
                            if (var179.method1594(-73)) {
                                class83.field1276[var4++] = class104.method696((byte) -26, var177).method1115(var179.field3514, arg2 + 12, var178);
                            } else {
                                class217.field3397[var3++] = class104.method696((byte) -26, var177).method1109(var178, var179.field3519, (byte) -65);
                            }
                            continue;
                        }
                        if (var526 == 4210) {
                            var4--;
                            String var180 = class83.field1276[var4];
                            var3--;
                            int var181 = class217.field3397[var3];
                            class72.method478(var181 == 1, var180, -10358);
                            class217.field3397[var3++] = class312.field4998;
                            continue;
                        }
                        if (var526 == 4211) {
                            if (class28.field340 != null && class312.field4998 > class3.field42) {
                                class217.field3397[var3++] = class205.method1411(class28.field340[class3.field42++], 65535);
                                continue;
                            }
                            class217.field3397[var3++] = -1;
                            continue;
                        }
                        if (var526 == 4212) {
                            class3.field42 = 0;
                            continue;
                        }
                    } else if (var526 >= 4400) {
                        if (var526 < 4500) {
                            if (var526 == 4400) {
                                var3 -= 2;
                                int var182 = class217.field3397[var3 + 1];
                                int var183 = class217.field3397[var3];
                                class226 var184 = class214.method1501(var182, (byte) -59);
                                if (var184.method1594(-119)) {
                                    class83.field1276[var4++] = class128.method822(var183, (byte) 83).method1330(var184.field3514, var182, (byte) 125);
                                } else {
                                    class217.field3397[var3++] = class128.method822(var183, (byte) -109).method1331(var184.field3519, -30336, var182);
                                }
                                continue;
                            }
                        } else if (var526 >= 4600) {
                            if (var526 < 5100) {
                                if (var526 == 5000) {
                                    class217.field3397[var3++] = class73.field1097;
                                    continue;
                                }
                                if (var526 == 5001) {
                                    class252.field4124++;
                                    var3 -= 3;
                                    class73.field1097 = class217.field3397[var3];
                                    class303.field4822 = class217.field3397[var3 + 1];
                                    class21.field275 = class217.field3397[var3 + 2];
                                    class150.field2218.method445(209, 7);
                                    class150.field2218.method1183(class73.field1097, 984049208);
                                    class150.field2218.method1183(class303.field4822, arg2 + 984049220);
                                    class150.field2218.method1183(class21.field275, arg2 + 984049220);
                                    continue;
                                }
                                if (var526 == 5002) {
                                    var4--;
                                    String var307 = class83.field1276[var4];
                                    class14.field197++;
                                    var3 -= 2;
                                    int var308 = class217.field3397[var3];
                                    int var309 = class217.field3397[var3 + 1];
                                    class150.field2218.method445(199, arg2 ^ 0xFFFFFFF3);
                                    class150.field2218.method1160(-25643, class176.method1256((byte) 127, var307));
                                    class150.field2218.method1183(var308 - 1, arg2 ^ 0xC55899CC);
                                    class150.field2218.method1183(var309, 984049208);
                                    continue;
                                }
                                if (var526 == 5003) {
                                    var3--;
                                    int var310 = class217.field3397[var3];
                                    String var311 = null;
                                    if (var310 < 100) {
                                        var311 = class169.field2606[var310];
                                    }
                                    if (var311 == null) {
                                        var311 = "";
                                    }
                                    class83.field1276[var4++] = var311;
                                    continue;
                                }
                                if (var526 == 5004) {
                                    var3--;
                                    int var312 = class217.field3397[var3];
                                    int var313 = -1;
                                    if (var312 < 100 && class169.field2606[var312] != null) {
                                        var313 = class117.field1692[var312];
                                    }
                                    class217.field3397[var3++] = var313;
                                    continue;
                                }
                                if (var526 == 5005) {
                                    class217.field3397[var3++] = class303.field4822;
                                    continue;
                                }
                                if (var526 == 5008) {
                                    var4--;
                                    String var314 = class83.field1276[var4];
                                    if (var314.startsWith("::")) {
                                        class254.method1801(var314, (byte) 93);
                                        continue;
                                    }
                                    if (class72.field1072 == 0 && (class235.field3799 && !class83.field1280 || class211.field3283)) {
                                        continue;
                                    }
                                    class122.field1746++;
                                    String var315 = var314.toLowerCase();
                                    byte var316 = 0;
                                    if (var315.startsWith(class58.field861)) {
                                        var314 = var314.substring(class58.field861.length());
                                        var316 = 0;
                                    } else if (var315.startsWith(class265.field4306)) {
                                        var316 = 1;
                                        var314 = var314.substring(class265.field4306.length());
                                    } else if (var315.startsWith(class211.field3285)) {
                                        var314 = var314.substring(class211.field3285.length());
                                        var316 = 2;
                                    } else if (var315.startsWith(class120.field1735)) {
                                        var316 = 3;
                                        var314 = var314.substring(class120.field1735.length());
                                    } else if (var315.startsWith(class1.field23)) {
                                        var314 = var314.substring(class1.field23.length());
                                        var316 = 4;
                                    } else if (var315.startsWith(class81.field1233)) {
                                        var314 = var314.substring(class81.field1233.length());
                                        var316 = 5;
                                    } else if (var315.startsWith(class124.field1793)) {
                                        var314 = var314.substring(class124.field1793.length());
                                        var316 = 6;
                                    } else if (var315.startsWith(class144.field2137)) {
                                        var316 = 7;
                                        var314 = var314.substring(class144.field2137.length());
                                    } else if (var315.startsWith(class288.field4657)) {
                                        var314 = var314.substring(class288.field4657.length());
                                        var316 = 8;
                                    } else if (var315.startsWith(class276.field4476)) {
                                        var316 = 9;
                                        var314 = var314.substring(class276.field4476.length());
                                    } else if (var315.startsWith(class286.field4623)) {
                                        var314 = var314.substring(class286.field4623.length());
                                        var316 = 10;
                                    } else if (var315.startsWith(class276.field4472)) {
                                        var316 = 11;
                                        var314 = var314.substring(class276.field4472.length());
                                    } else if (class46.field571 != 0) {
                                        if (var315.startsWith(class162.field2484)) {
                                            var314 = var314.substring(class162.field2484.length());
                                            var316 = 0;
                                        } else if (var315.startsWith(class108.field1578)) {
                                            var314 = var314.substring(class108.field1578.length());
                                            var316 = 1;
                                        } else if (var315.startsWith(class126.field1811)) {
                                            var316 = 2;
                                            var314 = var314.substring(class126.field1811.length());
                                        } else if (var315.startsWith(class278.field4548)) {
                                            var314 = var314.substring(class278.field4548.length());
                                            var316 = 3;
                                        } else if (var315.startsWith(class86.field1309)) {
                                            var314 = var314.substring(class86.field1309.length());
                                            var316 = 4;
                                        } else if (var315.startsWith(class146.field2180)) {
                                            var314 = var314.substring(class146.field2180.length());
                                            var316 = 5;
                                        } else if (var315.startsWith(class140.field2009)) {
                                            var314 = var314.substring(class140.field2009.length());
                                            var316 = 6;
                                        } else if (var315.startsWith(class76.field1164)) {
                                            var314 = var314.substring(class76.field1164.length());
                                            var316 = 7;
                                        } else if (var315.startsWith(class19.field256)) {
                                            var314 = var314.substring(class19.field256.length());
                                            var316 = 8;
                                        } else if (var315.startsWith(class150.field2212)) {
                                            var316 = 9;
                                            var314 = var314.substring(class150.field2212.length());
                                        } else if (var315.startsWith(class313.field5021)) {
                                            var314 = var314.substring(class313.field5021.length());
                                            var316 = 10;
                                        } else if (var315.startsWith(class67.field987)) {
                                            var316 = 11;
                                            var314 = var314.substring(class67.field987.length());
                                        }
                                    }
                                    byte var317 = 0;
                                    String var318 = var314.toLowerCase();
                                    if (var318.startsWith(class253.field4131)) {
                                        var317 = 1;
                                        var314 = var314.substring(class253.field4131.length());
                                    } else if (var318.startsWith(class146.field2183)) {
                                        var314 = var314.substring(class146.field2183.length());
                                        var317 = 2;
                                    } else if (var318.startsWith(class1.field18)) {
                                        var317 = 3;
                                        var314 = var314.substring(class1.field18.length());
                                    } else if (var318.startsWith(class306.field4886)) {
                                        var317 = 4;
                                        var314 = var314.substring(class306.field4886.length());
                                    } else if (var318.startsWith(class44.field532)) {
                                        var314 = var314.substring(class44.field532.length());
                                        var317 = 5;
                                    } else if (class46.field571 != 0) {
                                        if (var318.startsWith(class303.field4821)) {
                                            var317 = 1;
                                            var314 = var314.substring(class303.field4821.length());
                                        } else if (var318.startsWith(class146.field2175)) {
                                            var314 = var314.substring(class146.field2175.length());
                                            var317 = 2;
                                        } else if (var318.startsWith(class230.field3559)) {
                                            var314 = var314.substring(class230.field3559.length());
                                            var317 = 3;
                                        } else if (var318.startsWith(class288.field4656)) {
                                            var314 = var314.substring(class288.field4656.length());
                                            var317 = 4;
                                        } else if (var318.startsWith(class265.field4307)) {
                                            var314 = var314.substring(class265.field4307.length());
                                            var317 = 5;
                                        }
                                    }
                                    class150.field2218.method445(106, 7);
                                    class150.field2218.method1183(0, 984049208);
                                    int var319 = class150.field2218.field2676;
                                    class150.field2218.method1183(var316, 984049208);
                                    class150.field2218.method1183(var317, 984049208);
                                    class10.method61(class150.field2218, (byte) -34, var314);
                                    class150.field2218.method1177(class150.field2218.field2676 - var319, arg2 ^ 0xFFFFFF0B);
                                    continue;
                                }
                                if (var526 == 5009) {
                                    var4 -= 2;
                                    String var320 = class83.field1276[var4 + 1];
                                    String var321 = class83.field1276[var4];
                                    if (class72.field1072 != 0 || (!class235.field3799 || class83.field1280) && !class211.field3283) {
                                        class150.field2218.method445(164, 7);
                                        class136.field1965++;
                                        class150.field2218.method1183(0, arg2 + 984049220);
                                        int var322 = class150.field2218.field2676;
                                        class150.field2218.method1160(-25643, class176.method1256((byte) 127, var321));
                                        class10.method61(class150.field2218, (byte) -65, var320);
                                        class150.field2218.method1177(class150.field2218.field2676 - var322, 255);
                                    }
                                    continue;
                                }
                                if (var526 == 5010) {
                                    var3--;
                                    int var323 = class217.field3397[var3];
                                    String var324 = null;
                                    if (var323 < 100) {
                                        var324 = class55.field796[var323];
                                    }
                                    if (var324 == null) {
                                        var324 = "";
                                    }
                                    class83.field1276[var4++] = var324;
                                    continue;
                                }
                                if (var526 == 5011) {
                                    var3--;
                                    int var325 = class217.field3397[var3];
                                    String var326 = null;
                                    if (var325 < 100) {
                                        var326 = class29.field354[var325];
                                    }
                                    if (var326 == null) {
                                        var326 = "";
                                    }
                                    class83.field1276[var4++] = var326;
                                    continue;
                                }
                                if (var526 == 5012) {
                                    var3--;
                                    int var327 = class217.field3397[var3];
                                    int var328 = -1;
                                    if (var327 < 100) {
                                        var328 = class27.field329[var327];
                                    }
                                    class217.field3397[var3++] = var328;
                                    continue;
                                }
                                if (var526 == 5015) {
                                    String var329;
                                    if (class214.field3347 == null || class214.field3347.field31 == null) {
                                        var329 = class226.field3515;
                                    } else {
                                        var329 = class214.field3347.method6(113);
                                    }
                                    class83.field1276[var4++] = var329;
                                    continue;
                                }
                                if (var526 == 5016) {
                                    class217.field3397[var3++] = class21.field275;
                                    continue;
                                }
                                if (var526 == 5017) {
                                    class217.field3397[var3++] = class176.field2775;
                                    continue;
                                }
                                if (var526 == 5050) {
                                    var3--;
                                    int var330 = class217.field3397[var3];
                                    class83.field1276[var4++] = class170.method1179(var330, (byte) -79).field4041;
                                    continue;
                                }
                                if (var526 == 5051) {
                                    var3--;
                                    int var331 = class217.field3397[var3];
                                    class249 var332 = class170.method1179(var331, (byte) -61);
                                    if (var332.field4047 == null) {
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = var332.field4047.length;
                                    }
                                    continue;
                                }
                                if (var526 == 5052) {
                                    var3 -= 2;
                                    int var333 = class217.field3397[var3];
                                    int var334 = class217.field3397[var3 + 1];
                                    class249 var335 = class170.method1179(var333, (byte) -122);
                                    int var336 = var335.field4047[var334];
                                    class217.field3397[var3++] = var336;
                                    continue;
                                }
                                if (var526 == 5053) {
                                    var3--;
                                    int var337 = class217.field3397[var3];
                                    class249 var338 = class170.method1179(var337, (byte) -107);
                                    if (var338.field4039 == null) {
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = var338.field4039.length;
                                    }
                                    continue;
                                }
                                if (var526 == 5054) {
                                    var3 -= 2;
                                    int var339 = class217.field3397[var3 + 1];
                                    int var340 = class217.field3397[var3];
                                    class217.field3397[var3++] = class170.method1179(var340, (byte) -116).field4039[var339];
                                    continue;
                                }
                                if (var526 == 5055) {
                                    var3--;
                                    int var341 = class217.field3397[var3];
                                    class83.field1276[var4++] = class218.method1526(var341, false).method470((byte) 118);
                                    continue;
                                }
                                if (var526 == 5056) {
                                    var3--;
                                    int var342 = class217.field3397[var3];
                                    class71 var343 = class218.method1526(var342, false);
                                    if (var343.field1050 == null) {
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = var343.field1050.length;
                                    }
                                    continue;
                                }
                                if (var526 == 5057) {
                                    var3 -= 2;
                                    int var344 = class217.field3397[var3];
                                    int var345 = class217.field3397[var3 + 1];
                                    class217.field3397[var3++] = class218.method1526(var344, false).field1050[var345];
                                    continue;
                                }
                                if (var526 == 5058) {
                                    class24.field307 = new class233();
                                    var3--;
                                    class24.field307.field3761 = class217.field3397[var3];
                                    class24.field307.field3767 = class218.method1526(class24.field307.field3761, false);
                                    class24.field307.field3764 = new int[class24.field307.field3767.method468((byte) 46)];
                                    continue;
                                }
                                if (var526 == 5059) {
                                    class150.field2218.method445(61, 7);
                                    class283.field4602++;
                                    class150.field2218.method1183(0, 984049208);
                                    int var346 = class150.field2218.field2676;
                                    class150.field2218.method1183(0, 984049208);
                                    class150.field2218.method1180(arg2 ^ 0x4417, class24.field307.field3761);
                                    class24.field307.field3767.method465(71, class24.field307.field3764, class150.field2218);
                                    class150.field2218.method1177(class150.field2218.field2676 - var346, 255);
                                    continue;
                                }
                                if (var526 == 5060) {
                                    class304.field4835++;
                                    var4--;
                                    String var347 = class83.field1276[var4];
                                    class150.field2218.method445(142, arg2 + 19);
                                    class150.field2218.method1183(0, 984049208);
                                    int var348 = class150.field2218.field2676;
                                    class150.field2218.method1160(-25643, class176.method1256((byte) 127, var347));
                                    class150.field2218.method1180(-17437, class24.field307.field3761);
                                    class24.field307.field3767.method465(8, class24.field307.field3764, class150.field2218);
                                    class150.field2218.method1177(class150.field2218.field2676 - var348, 255);
                                    continue;
                                }
                                if (var526 == 5061) {
                                    class150.field2218.method445(61, 7);
                                    class283.field4602++;
                                    class150.field2218.method1183(0, arg2 ^ 0xC55899CC);
                                    int var349 = class150.field2218.field2676;
                                    class150.field2218.method1183(1, arg2 + 984049220);
                                    class150.field2218.method1180(-17437, class24.field307.field3761);
                                    class24.field307.field3767.method465(arg2 ^ 0xFFFFFFFC, class24.field307.field3764, class150.field2218);
                                    class150.field2218.method1177(class150.field2218.field2676 - var349, 255);
                                    continue;
                                }
                                if (var526 == 5062) {
                                    var3 -= 2;
                                    int var350 = class217.field3397[var3 + 1];
                                    int var351 = class217.field3397[var3];
                                    class217.field3397[var3++] = class170.method1179(var351, (byte) -69).field4045[var350];
                                    continue;
                                }
                                if (var526 == 5063) {
                                    var3 -= 2;
                                    int var352 = class217.field3397[var3 + 1];
                                    int var353 = class217.field3397[var3];
                                    class217.field3397[var3++] = class170.method1179(var353, (byte) -109).field4046[var352];
                                    continue;
                                }
                                if (var526 == 5064) {
                                    var3 -= 2;
                                    int var354 = class217.field3397[var3];
                                    int var355 = class217.field3397[var3 + 1];
                                    if (var355 == -1) {
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        class217.field3397[var3++] = class170.method1179(var354, (byte) -97).method1775((char) var355, (byte) 121);
                                    }
                                    continue;
                                }
                                if (var526 == 5065) {
                                    var3 -= 2;
                                    int var356 = class217.field3397[var3];
                                    int var357 = class217.field3397[var3 + 1];
                                    if (var357 == -1) {
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        class217.field3397[var3++] = class170.method1179(var356, (byte) -93).method1770(-115, (char) var357);
                                    }
                                    continue;
                                }
                                if (var526 == 5066) {
                                    var3--;
                                    int var358 = class217.field3397[var3];
                                    class217.field3397[var3++] = class218.method1526(var358, false).method468((byte) 46);
                                    continue;
                                }
                                if (var526 == 5067) {
                                    var3 -= 2;
                                    int var359 = class217.field3397[var3];
                                    int var360 = class217.field3397[var3 + 1];
                                    int var361 = class218.method1526(var359, false).method469(-1, var360);
                                    class217.field3397[var3++] = var361;
                                    continue;
                                }
                                if (var526 == 5068) {
                                    var3 -= 2;
                                    int var362 = class217.field3397[var3];
                                    int var363 = class217.field3397[var3 + 1];
                                    class24.field307.field3764[var362] = var363;
                                    continue;
                                }
                                if (var526 == 5069) {
                                    var3 -= 2;
                                    int var364 = class217.field3397[var3];
                                    int var365 = class217.field3397[var3 + 1];
                                    class24.field307.field3764[var364] = var365;
                                    continue;
                                }
                                if (var526 == 5070) {
                                    var3 -= 3;
                                    int var366 = class217.field3397[var3];
                                    int var367 = class217.field3397[var3 + 1];
                                    int var368 = class217.field3397[var3 + 2];
                                    class71 var369 = class218.method1526(var366, false);
                                    if (var369.method469(arg2 + 11, var367) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class217.field3397[var3++] = var369.method467(var367, (byte) 120, var368);
                                    continue;
                                }
                                if (var526 == 5071) {
                                    var3--;
                                    boolean var370 = class217.field3397[var3] == 1;
                                    var4--;
                                    String var371 = class83.field1276[var4];
                                    class40.method228(var370, var371, arg2 ^ 0xFFFFFF86);
                                    class217.field3397[var3++] = class312.field4998;
                                    continue;
                                }
                                if (var526 == 5072) {
                                    if (class28.field340 != null && class312.field4998 > class3.field42) {
                                        class217.field3397[var3++] = class205.method1411(class28.field340[class3.field42++], 65535);
                                        continue;
                                    }
                                    class217.field3397[var3++] = -1;
                                    continue;
                                }
                                if (var526 == 5073) {
                                    class3.field42 = 0;
                                    continue;
                                }
                            } else if (var526 < 5200) {
                                if (var526 == 5100) {
                                    if (class309.field4977[86]) {
                                        class217.field3397[var3++] = 1;
                                    } else {
                                        class217.field3397[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var526 == 5101) {
                                    if (class309.field4977[82]) {
                                        class217.field3397[var3++] = 1;
                                    } else {
                                        class217.field3397[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var526 == 5102) {
                                    if (class309.field4977[81]) {
                                        class217.field3397[var3++] = 1;
                                    } else {
                                        class217.field3397[var3++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var526 < 5300) {
                                if (var526 == 5200) {
                                    int var10000 = arg2 ^ 0xFFFFFF97;
                                    var3--;
                                    class90.method608(var10000, class217.field3397[var3]);
                                    continue;
                                }
                                if (var526 == 5201) {
                                    class217.field3397[var3++] = class258.method1827((byte) -117);
                                    continue;
                                }
                                if (var526 == 5205) {
                                    var3--;
                                    class21.method118(-1, class217.field3397[var3], -1, false, 62);
                                    continue;
                                }
                                if (var526 == 5206) {
                                    var3--;
                                    int var260 = class217.field3397[var3];
                                    class49 var261 = class207.method1433(var260 >> 14 & 0x3FFF, var260 & 0x3FFF);
                                    if (var261 == null) {
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        class217.field3397[var3++] = var261.field624;
                                    }
                                    continue;
                                }
                                if (var526 == 5207) {
                                    var3--;
                                    class49 var262 = class207.method1427(class217.field3397[var3]);
                                    if (var262 != null && var262.field629 != null) {
                                        class83.field1276[var4++] = var262.field629;
                                        continue;
                                    }
                                    class83.field1276[var4++] = "";
                                    continue;
                                }
                                if (var526 == 5208) {
                                    class217.field3397[var3++] = class276.field4471;
                                    class217.field3397[var3++] = class307.field4895;
                                    continue;
                                }
                                if (var526 == 5209) {
                                    class217.field3397[var3++] = class311.field4993 + class207.field3241;
                                    class217.field3397[var3++] = class207.field3237 + class207.field3247 - class229.field3544 - 1;
                                    continue;
                                }
                                if (var526 == 5210) {
                                    var3--;
                                    int var263 = class217.field3397[var3];
                                    class49 var264 = class207.method1427(var263);
                                    if (var264 == null) {
                                        class217.field3397[var3++] = 0;
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = class205.method1411(16383, var264.field605 >> 14);
                                        class217.field3397[var3++] = class205.method1411(16383, var264.field605);
                                    }
                                    continue;
                                }
                                if (var526 == 5211) {
                                    var3--;
                                    int var265 = class217.field3397[var3];
                                    class49 var266 = class207.method1427(var265);
                                    if (var266 == null) {
                                        class217.field3397[var3++] = 0;
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = var266.field613 - var266.field615;
                                        class217.field3397[var3++] = var266.field630 - var266.field607;
                                    }
                                    continue;
                                }
                                if (var526 == 5212) {
                                    class138 var267 = class215.method1509(0);
                                    if (var267 == null) {
                                        class217.field3397[var3++] = -1;
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        class217.field3397[var3++] = var267.field1987;
                                        int var268 = class207.field3247 + class207.field3237 - var267.field1986 - 1 | class207.field3241 + var267.field1996 << 14 | var267.field1978 << 28;
                                        class217.field3397[var3++] = var268;
                                    }
                                    continue;
                                }
                                if (var526 == 5213) {
                                    class138 var269 = class93.method634(30370);
                                    if (var269 == null) {
                                        class217.field3397[var3++] = -1;
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        class217.field3397[var3++] = var269.field1987;
                                        int var270 = class207.field3237 + class207.field3247 - var269.field1986 - 1 | class207.field3241 + var269.field1996 << 14 | var269.field1978 << 28;
                                        class217.field3397[var3++] = var270;
                                    }
                                    continue;
                                }
                                if (var526 == 5214) {
                                    var3--;
                                    int var271 = class217.field3397[var3];
                                    class49 var272 = class152.method1047(arg2 ^ 0xFFFFFFFA);
                                    if (var272 != null) {
                                        boolean var273 = var272.method300((var271 & 0xFFFE133) >> 14, var271 & 0x3FFF, (byte) -52, (var271 & 0x376F33E0) >> 28, class201.field3166);
                                        if (var273) {
                                            class229.method1614(class201.field3166[1], (byte) 93, class201.field3166[2]);
                                        }
                                    }
                                    continue;
                                }
                                if (var526 == 5215) {
                                    var3 -= 2;
                                    int var274 = class217.field3397[var3 + 1];
                                    boolean var275 = false;
                                    int var276 = class217.field3397[var3];
                                    class168 var277 = class207.method1432((var276 & 0xFFFD00C) >> 14, var276 & 0x3FFF);
                                    for (class49 var278 = (class49) var277.method1146(-93); var278 != null; var278 = (class49) var277.method1148((byte) 113)) {
                                        if (var278.field624 == var274) {
                                            var275 = true;
                                            break;
                                        }
                                    }
                                    if (var275) {
                                        class217.field3397[var3++] = 1;
                                    } else {
                                        class217.field3397[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var526 == 5218) {
                                    var3--;
                                    int var279 = class217.field3397[var3];
                                    class49 var280 = class207.method1427(var279);
                                    if (var280 == null) {
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        class217.field3397[var3++] = var280.field610;
                                    }
                                    continue;
                                }
                                if (var526 == 5220) {
                                    class217.field3397[var3++] = class200.field3150 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 5221) {
                                    var3--;
                                    int var281 = class217.field3397[var3];
                                    class229.method1614((var281 & 0xFFFF580) >> 14, (byte) 92, var281 & 0x3FFF);
                                    continue;
                                }
                                if (var526 == 5222) {
                                    class49 var282 = class152.method1047(14);
                                    if (var282 == null) {
                                        class217.field3397[var3++] = -1;
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        boolean var283 = var282.method296(class207.field3247 + class207.field3237 - class229.field3544 - 1, (byte) -102, class201.field3166, class311.field4993 + class207.field3241);
                                        if (var283) {
                                            class217.field3397[var3++] = class201.field3166[1];
                                            class217.field3397[var3++] = class201.field3166[2];
                                        } else {
                                            class217.field3397[var3++] = -1;
                                            class217.field3397[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var526 == 5223) {
                                    var3 -= 2;
                                    int var284 = class217.field3397[var3];
                                    int var285 = class217.field3397[var3 + 1];
                                    class21.method118((var285 & 0xFFFFE05) >> 14, var284, var285 & 0x3FFF, false, 126);
                                    continue;
                                }
                                if (var526 == 5224) {
                                    var3--;
                                    int var286 = class217.field3397[var3];
                                    class49 var287 = class152.method1047(14);
                                    if (var287 == null) {
                                        class217.field3397[var3++] = -1;
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        boolean var288 = var287.method300((var286 & 0xFFFDDC4) >> 14, var286 & 0x3FFF, (byte) -52, (var286 & 0x3DEFC91F) >> 28, class201.field3166);
                                        if (var288) {
                                            class217.field3397[var3++] = class201.field3166[1];
                                            class217.field3397[var3++] = class201.field3166[2];
                                        } else {
                                            class217.field3397[var3++] = -1;
                                            class217.field3397[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var526 == 5225) {
                                    var3--;
                                    int var289 = class217.field3397[var3];
                                    class49 var290 = class152.method1047(14);
                                    if (var290 == null) {
                                        class217.field3397[var3++] = -1;
                                        class217.field3397[var3++] = -1;
                                    } else {
                                        boolean var291 = var290.method296(var289 & 0x3FFF, (byte) -102, class201.field3166, var289 >> 14 & 0x3FFF);
                                        if (var291) {
                                            class217.field3397[var3++] = class201.field3166[1];
                                            class217.field3397[var3++] = class201.field3166[2];
                                        } else {
                                            class217.field3397[var3++] = -1;
                                            class217.field3397[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var526 == 5226) {
                                    var3--;
                                    class44.method246(class217.field3397[var3], false);
                                    continue;
                                }
                                if (var526 == 5227) {
                                    var3 -= 2;
                                    int var292 = class217.field3397[var3];
                                    int var293 = class217.field3397[var3 + 1];
                                    class21.method118(var293 >> 14 & 0x3FFF, var292, var293 & 0x3FFF, true, 95);
                                    continue;
                                }
                                if (var526 == 5228) {
                                    var3--;
                                    class86.field1316 = class217.field3397[var3] == 1;
                                    continue;
                                }
                                if (var526 == 5229) {
                                    class217.field3397[var3++] = class86.field1316 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 5230) {
                                    var3--;
                                    int var294 = class217.field3397[var3];
                                    class298.method2005(var294, arg2 ^ 0xFFFFFFD0);
                                    continue;
                                }
                                if (var526 == 5231) {
                                    var3 -= 2;
                                    int var295 = class217.field3397[var3];
                                    boolean var296 = class217.field3397[var3 + 1] == 1;
                                    if (class146.field2184 == null) {
                                        continue;
                                    }
                                    class247 var297 = class146.field2184.method1064(-1, (long) var295);
                                    if (var297 != null && !var296) {
                                        var297.method1764(64);
                                        continue;
                                    }
                                    if (var297 == null && var296) {
                                        class247 var298 = new class247();
                                        class146.field2184.method1054(-3510, var298, (long) var295);
                                    }
                                    continue;
                                }
                                if (var526 == 5232) {
                                    var3--;
                                    int var299 = class217.field3397[var3];
                                    if (class146.field2184 == null) {
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class247 var300 = class146.field2184.method1064(arg2 + 11, (long) var299);
                                        class217.field3397[var3++] = var300 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var526 == 5233) {
                                    var3 -= 2;
                                    boolean var301 = class217.field3397[var3 + 1] == 1;
                                    int var302 = class217.field3397[var3];
                                    if (class264.field4288 == null) {
                                        continue;
                                    }
                                    class247 var303 = class264.field4288.method1064(-1, (long) var302);
                                    if (var303 != null && !var301) {
                                        var303.method1764(64);
                                        continue;
                                    }
                                    if (var303 == null && var301) {
                                        class247 var304 = new class247();
                                        class264.field4288.method1054(-3510, var304, (long) var302);
                                    }
                                    continue;
                                }
                                if (var526 == 5234) {
                                    var3--;
                                    int var305 = class217.field3397[var3];
                                    if (class264.field4288 == null) {
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class247 var306 = class264.field4288.method1064(-1, (long) var305);
                                        class217.field3397[var3++] = var306 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var526 == 5235) {
                                    class217.field3397[var3++] = class207.field3240 == null ? -1 : class207.field3240.field624;
                                    continue;
                                }
                            } else if (var526 < 5400) {
                                if (var526 == 5300) {
                                    var3 -= 2;
                                    class217.field3397[var3++] = 0;
                                    continue;
                                }
                                if (var526 == 5301) {
                                    continue;
                                }
                                if (var526 == 5302) {
                                    class217.field3397[var3++] = 0;
                                    continue;
                                }
                                if (var526 == 5303) {
                                    var3--;
                                    class217.field3397[var3++] = 0;
                                    class217.field3397[var3++] = 0;
                                    continue;
                                }
                                if (var526 == 5305) {
                                    byte var257 = -1;
                                    class217.field3397[var3++] = var257;
                                    continue;
                                }
                                if (var526 == 5306) {
                                    class217.field3397[var3++] = method298((byte) 121);
                                    continue;
                                }
                                if (var526 == 5307) {
                                    var3--;
                                    int var258 = class217.field3397[var3];
                                    if (var258 < 0 || var258 > 2) {
                                        var258 = 0;
                                    }
                                    class190.method1325(var258, -1, 0, -1, false);
                                    continue;
                                }
                                if (var526 == 5308) {
                                    class217.field3397[var3++] = class173.field2723;
                                    continue;
                                }
                                if (var526 == 5309) {
                                    var3--;
                                    int var259 = class217.field3397[var3];
                                    if (var259 < 0 || var259 > 2) {
                                        var259 = 0;
                                    }
                                    class173.field2723 = var259;
                                    class170.method1216(class95.field1425, -63);
                                    continue;
                                }
                            } else if (var526 < 5500) {
                                if (var526 == 5400) {
                                    var4 -= 2;
                                    String var235 = class83.field1276[var4];
                                    class247.field4021++;
                                    var3--;
                                    int var236 = class217.field3397[var3];
                                    String var237 = class83.field1276[var4 + 1];
                                    class150.field2218.method445(148, 7);
                                    class150.field2218.method1183(class313.method2098(var235, (byte) -128) + (class313.method2098(var237, (byte) 24) + 1), arg2 + 984049220);
                                    class150.field2218.method1168((byte) -37, var235);
                                    class150.field2218.method1168((byte) -37, var237);
                                    class150.field2218.method1183(var236, arg2 ^ 0xC55899CC);
                                    continue;
                                }
                                if (var526 == 5401) {
                                    var3 -= 2;
                                    class199.field3149[class217.field3397[var3]] = (short) class228.method1607(-91, class217.field3397[var3 + 1]);
                                    class283.method1944(12);
                                    class271.method1886((byte) -122);
                                    class7.method41((byte) 111);
                                    class146.method998((byte) 32);
                                    class92.method626((byte) 30);
                                    continue;
                                }
                                if (var526 == 5405) {
                                    var3 -= 2;
                                    int var238 = class217.field3397[var3];
                                    int var239 = class217.field3397[var3 + 1];
                                    if (var238 >= 0 && var238 < 2) {
                                        class66.field983[var238] = new int[var239 << 1][4];
                                    }
                                    continue;
                                }
                                if (var526 == 5406) {
                                    var3 -= 7;
                                    int var240 = class217.field3397[var3 + 1] << 1;
                                    int var241 = class217.field3397[var3 + 2];
                                    int var242 = class217.field3397[var3];
                                    int var243 = class217.field3397[var3 + 3];
                                    int var244 = class217.field3397[var3 + 6];
                                    int var245 = class217.field3397[var3 + 5];
                                    int var246 = class217.field3397[var3 + 4];
                                    if (var242 >= 0 && var242 < 2 && class66.field983[var242] != null && var240 >= 0 && class66.field983[var242].length > var240) {
                                        class66.field983[var242][var240] = new int[] { class205.method1411(16383, var241 >> 14) * 128, var243, class205.method1411(16383, var241) * 128, var244 };
                                        class66.field983[var242][var240 + 1] = new int[] { class205.method1411(16383, var246 >> 14) * 128, var245, class205.method1411(16383, var246) * 128 };
                                    }
                                    continue;
                                }
                                if (var526 == 5407) {
                                    var3--;
                                    int var247 = class66.field983[class217.field3397[var3]].length >> 1;
                                    class217.field3397[var3++] = var247;
                                    continue;
                                }
                                if (var526 == 5411) {
                                    if (class73.field1086 == null) {
                                        class297.method2002(9558, class47.method270(true), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var526 == 5419) {
                                    String var248 = "";
                                    if (class307.field4914 != null) {
                                        if (class307.field4914.field2401 == null) {
                                            var248 = class271.method1888(class307.field4914.field2398, 6139);
                                        } else {
                                            var248 = (String) class307.field4914.field2401;
                                        }
                                    }
                                    class83.field1276[var4++] = var248;
                                    continue;
                                }
                                if (var526 == 5420) {
                                    class217.field3397[var3++] = class239.field3844 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 5421) {
                                    var3--;
                                    boolean var249 = class217.field3397[var3] == 1;
                                    var4--;
                                    String var250 = class83.field1276[var4];
                                    String var251 = class47.method270(true) + var250;
                                    if (class73.field1086 != null || var249 && class239.field3844 != 3 && class239.field3830.startsWith("win") && !class24.field298) {
                                        class258.field4201 = var251;
                                        class275.field4466 = var249;
                                        class123.field1762 = class95.field1425.method1686((byte) 115, var251);
                                        continue;
                                    }
                                    class297.method2002(9558, var251, var249);
                                    continue;
                                }
                                if (var526 == 5422) {
                                    var4 -= 2;
                                    String var252 = class83.field1276[var4 + 1];
                                    var3--;
                                    int var253 = class217.field3397[var3];
                                    String var254 = class83.field1276[var4];
                                    if (var254.length() > 0) {
                                        if (class170.field2639 == null) {
                                            class170.field2639 = new String[class211.field3288[class257.field4188]];
                                        }
                                        class170.field2639[var253] = var254;
                                    }
                                    if (var252.length() > 0) {
                                        if (class56.field810 == null) {
                                            class56.field810 = new String[class211.field3288[class257.field4188]];
                                        }
                                        class56.field810[var253] = var252;
                                    }
                                    continue;
                                }
                                if (var526 == 5423) {
                                    var4--;
                                    System.out.println(class83.field1276[var4]);
                                    continue;
                                }
                                if (var526 == 5424) {
                                    var3 -= 11;
                                    class293.field4707 = class217.field3397[var3];
                                    class294.field4713 = class217.field3397[var3 + 1];
                                    class275.field4467 = class217.field3397[var3 + 2];
                                    class153.field2288 = class217.field3397[var3 + 3];
                                    class3.field51 = class217.field3397[var3 + 4];
                                    class161.field2411 = class217.field3397[var3 + 5];
                                    class1.field8 = class217.field3397[var3 + 6];
                                    class184.field2900 = class217.field3397[var3 + 7];
                                    class192.field3053 = class217.field3397[var3 + 8];
                                    class273.field4446 = class217.field3397[var3 + 9];
                                    class271.field4410 = class217.field3397[var3 + 10];
                                    class295.field4726.method509(27635, class3.field51);
                                    class295.field4726.method509(27635, class161.field2411);
                                    class295.field4726.method509(27635, class1.field8);
                                    class295.field4726.method509(arg2 + 27647, class184.field2900);
                                    class295.field4726.method509(27635, class192.field3053);
                                    class298.field4758 = true;
                                    continue;
                                }
                                if (var526 == 5425) {
                                    class84.method573(127);
                                    class298.field4758 = false;
                                    continue;
                                }
                                if (var526 == 5426) {
                                    var3--;
                                    class119.field1713 = class217.field3397[var3];
                                    continue;
                                }
                                if (var526 == 5427) {
                                    var3 -= 2;
                                    class123.field1773 = class217.field3397[var3];
                                    class104.field1522 = class217.field3397[var3 + 1];
                                    continue;
                                }
                                if (var526 == 5428) {
                                    var3 -= 2;
                                    int var255 = class217.field3397[var3 + 1];
                                    int var256 = class217.field3397[var3];
                                    class217.field3397[var3++] = class277.method1913(var256, var255, (byte) -85) ? 1 : 0;
                                    continue;
                                }
                            } else if (var526 < 5600) {
                                if (var526 == 5500) {
                                    var3 -= 4;
                                    int var223 = class217.field3397[var3];
                                    int var224 = class217.field3397[var3 + 1];
                                    int var225 = class217.field3397[var3 + 3];
                                    int var226 = class217.field3397[var3 + 2];
                                    class229.method1615(var226, false, var225, (var223 >> 14 & 0x3FFF) - class113.field1653, (var223 & 0x3FFF) - class5.field77, 8806, var224);
                                    continue;
                                }
                                if (var526 == 5501) {
                                    var3 -= 4;
                                    int var227 = class217.field3397[var3];
                                    int var228 = class217.field3397[var3 + 1];
                                    int var229 = class217.field3397[var3 + 2];
                                    int var230 = class217.field3397[var3 + 3];
                                    class52.method352(var230, (var227 & 0x3FFF) - class5.field77, 29043, (var227 >> 14 & 0x3FFF) - class113.field1653, var229, var228);
                                    continue;
                                }
                                if (var526 == 5502) {
                                    var3 -= 6;
                                    int var231 = class217.field3397[var3];
                                    if (var231 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class243.field3886 = var231;
                                    int var232 = class217.field3397[var3 + 1];
                                    if (class66.field983[class243.field3886].length >> 1 <= var232 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class83.field1291 = var232;
                                    class59.field871 = 0;
                                    class186.field2929 = class217.field3397[var3 + 2];
                                    class286.field4625 = class217.field3397[var3 + 3];
                                    int var233 = class217.field3397[var3 + 4];
                                    if (var233 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class28.field348 = var233;
                                    int var234 = class217.field3397[var3 + 5];
                                    if (class66.field983[class28.field348].length >> 1 <= var234 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class306.field4889 = var234;
                                    class158.field2370 = 3;
                                    continue;
                                }
                                if (var526 == 5503) {
                                    class290.method1974((byte) -16);
                                    continue;
                                }
                                if (var526 == 5504) {
                                    var3 -= 2;
                                    class302.method2029((byte) -9, class217.field3397[var3 + 1], class217.field3397[var3]);
                                    continue;
                                }
                                if (var526 == 5505) {
                                    class217.field3397[var3++] = (int) class215.field3356;
                                    continue;
                                }
                                if (var526 == 5506) {
                                    class217.field3397[var3++] = (int) class144.field2145;
                                    continue;
                                }
                                if (var526 == 5507) {
                                    class281.method1936(true);
                                    continue;
                                }
                                if (var526 == 5508) {
                                    class150.method1014(true);
                                    continue;
                                }
                                if (var526 == 5509) {
                                    class217.method1522((byte) -112);
                                    continue;
                                }
                                if (var526 == 5510) {
                                    class125.method810(arg2 - 116);
                                    continue;
                                }
                                if (var526 == 5512) {
                                    class163.method1124(-31);
                                    continue;
                                }
                            } else if (var526 < 5700) {
                                if (var526 == 5600) {
                                    var4 -= 2;
                                    String var185 = class83.field1276[var4];
                                    String var186 = class83.field1276[var4 + 1];
                                    var3--;
                                    int var187 = class217.field3397[var3];
                                    if (class40.field480 == 10 && class229.field3541 == 0 && class45.field536 == 0 && class299.field4764 == 0 && class181.field2858 == 0) {
                                        class206.method1418(var185, var187, (byte) -11, var186);
                                    }
                                    continue;
                                }
                                if (var526 == 5601) {
                                    class19.method107((byte) -42);
                                    continue;
                                }
                                if (var526 == 5602) {
                                    if (class45.field536 == 0) {
                                        class195.field3080 = -2;
                                    }
                                    continue;
                                }
                                if (var526 == 5603) {
                                    var3 -= 4;
                                    if (class40.field480 == 10 && class229.field3541 == 0 && class45.field536 == 0 && class299.field4764 == 0 && class181.field2858 == 0) {
                                        class126.method815(20, class217.field3397[var3], class217.field3397[var3 + 3], class217.field3397[var3 + 2], class217.field3397[var3 + 1]);
                                    }
                                    continue;
                                }
                                if (var526 == 5604) {
                                    var4--;
                                    if (class40.field480 == 10 && class229.field3541 == 0 && class45.field536 == 0 && class299.field4764 == 0 && class181.field2858 == 0) {
                                        class168.method1150(class176.method1256((byte) 127, class83.field1276[var4]), (byte) -77);
                                    }
                                    continue;
                                }
                                if (var526 == 5605) {
                                    var3 -= 7;
                                    var4 -= 3;
                                    if (class40.field480 == 10 && class229.field3541 == 0 && class45.field536 == 0 && class299.field4764 == 0 && class181.field2858 == 0) {
                                        class13.method79(class217.field3397[var3 + 1], class83.field1276[var4 + 2], class217.field3397[var3 + 4] == 1, class176.method1256((byte) 127, class83.field1276[var4]), class83.field1276[var4 + 1], class217.field3397[var3 + 5] == 1, -1745706014, class217.field3397[var3 + 2], class217.field3397[var3 + 3], class217.field3397[var3 + 6] == 1, class217.field3397[var3]);
                                    }
                                    continue;
                                }
                                if (var526 == 5606) {
                                    if (class299.field4764 == 0) {
                                        class130.field1863 = -2;
                                    }
                                    continue;
                                }
                                if (var526 == 5607) {
                                    class217.field3397[var3++] = class195.field3080;
                                    continue;
                                }
                                if (var526 == 5608) {
                                    class217.field3397[var3++] = class184.field2890;
                                    continue;
                                }
                                if (var526 == 5609) {
                                    class217.field3397[var3++] = class130.field1863;
                                    continue;
                                }
                                if (var526 == 5610) {
                                    for (int var188 = 0; var188 < 5; var188++) {
                                        class83.field1276[var4++] = var188 < class128.field1830.length ? class256.method1820(-16963, class128.field1830[var188]) : "";
                                    }
                                    class128.field1830 = null;
                                    continue;
                                }
                                if (var526 == 5611) {
                                    class217.field3397[var3++] = class136.field1964;
                                    continue;
                                }
                            } else if (var526 < 6100) {
                                if (var526 == 6001) {
                                    var3--;
                                    int var189 = class217.field3397[var3];
                                    if (var189 < 1) {
                                        var189 = 1;
                                    }
                                    if (var189 > 4) {
                                        var189 = 4;
                                    }
                                    class229.field3547 = var189;
                                    if (class229.field3547 == 1) {
                                        class221.method1561(0.9F);
                                    }
                                    if (class229.field3547 == 2) {
                                        class221.method1561(0.8F);
                                    }
                                    if (class229.field3547 == 3) {
                                        class221.method1561(0.7F);
                                    }
                                    if (class229.field3547 == 4) {
                                        class221.method1561(0.6F);
                                    }
                                    class271.method1886((byte) -69);
                                    class170.method1216(class95.field1425, arg2 ^ 0xFFFFFF8B);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6002) {
                                    var3--;
                                    class288.method1965(false, class217.field3397[var3] == 1);
                                    class121.method789(arg2 + 139);
                                    class266.method1858(27644);
                                    class276.method1910((byte) 58);
                                    class170.method1216(class95.field1425, 81);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6003) {
                                    var3--;
                                    class44.field528 = class217.field3397[var3] == 1;
                                    class276.method1910((byte) 58);
                                    class170.method1216(class95.field1425, -97);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6005) {
                                    var3--;
                                    class73.field1106 = class217.field3397[var3] == 1;
                                    class266.method1858(arg2 ^ 0xFFFF9408);
                                    class170.method1216(class95.field1425, 126);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6006) {
                                    var3--;
                                    class17.field234 = class217.field3397[var3] == 1;
                                    ((class175) class221.field3464).method1249(97, !class17.field234);
                                    class170.method1216(class95.field1425, 85);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6007) {
                                    var3--;
                                    class162.field2440 = class217.field3397[var3] == 1;
                                    class170.method1216(class95.field1425, -72);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6008) {
                                    var3--;
                                    class118.field1707 = class217.field3397[var3] == 1;
                                    class170.method1216(class95.field1425, -84);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6009) {
                                    var3--;
                                    class234.field3773 = class217.field3397[var3] == 1;
                                    class170.method1216(class95.field1425, 112);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6010) {
                                    var3--;
                                    class89.field1333 = class217.field3397[var3] == 1;
                                    class170.method1216(class95.field1425, 45);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6011) {
                                    var3--;
                                    int var190 = class217.field3397[var3];
                                    if (var190 < 0 || var190 > 2) {
                                        var190 = 0;
                                    }
                                    class22.field286 = var190;
                                    class170.method1216(class95.field1425, 86);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6012) {
                                    var3--;
                                    class250.field4053 = class217.field3397[var3] == 1;
                                    if (class229.field3547 == 1) {
                                        class221.method1561(0.9F);
                                    }
                                    if (class229.field3547 == 2) {
                                        class221.method1561(0.8F);
                                    }
                                    if (class229.field3547 == 3) {
                                        class221.method1561(0.7F);
                                    }
                                    if (class229.field3547 == 4) {
                                        class221.method1561(0.6F);
                                    }
                                    class266.method1858(27644);
                                    class170.method1216(class95.field1425, 55);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6014) {
                                    var3--;
                                    class274.field4452 = class217.field3397[var3] == 1;
                                    class170.method1216(class95.field1425, arg2 - 115);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6015) {
                                    var3--;
                                    class64.field925 = class217.field3397[var3] == 1;
                                    class170.method1216(class95.field1425, arg2 ^ 0x21);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6016) {
                                    var3--;
                                    int var191 = class217.field3397[var3];
                                    if (var191 < 0 || var191 > 2) {
                                        var191 = 0;
                                    }
                                    class96.field1451 = var191;
                                    continue;
                                }
                                if (var526 == 6017) {
                                    var3--;
                                    class23.field295 = class217.field3397[var3] == 1;
                                    class181.method1289((byte) -105);
                                    class170.method1216(class95.field1425, 115);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6018) {
                                    var3--;
                                    int var192 = class217.field3397[var3];
                                    if (var192 < 0) {
                                        var192 = 0;
                                    }
                                    if (var192 > 127) {
                                        var192 = 127;
                                    }
                                    class96.field1437 = var192;
                                    class170.method1216(class95.field1425, -71);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6019) {
                                    var3--;
                                    int var193 = class217.field3397[var3];
                                    if (var193 < 0) {
                                        var193 = 0;
                                    }
                                    if (var193 > 255) {
                                        var193 = 255;
                                    }
                                    if (class136.field1960 != var193) {
                                        if (class136.field1960 == 0 && class127.field1826 != -1) {
                                            class198.method1381(var193, 0, arg2 ^ 0x28, class127.field1826, false, class77.field1177);
                                            class229.field3542 = false;
                                        } else if (var193 == 0) {
                                            class256.method1818(1);
                                            class229.field3542 = false;
                                        } else {
                                            class302.method2031(-27001, var193);
                                        }
                                        class136.field1960 = var193;
                                    }
                                    class170.method1216(class95.field1425, 68);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6020) {
                                    var3--;
                                    int var194 = class217.field3397[var3];
                                    if (var194 < 0) {
                                        var194 = 0;
                                    }
                                    if (var194 > 127) {
                                        var194 = 127;
                                    }
                                    class235.field3792 = var194;
                                    class170.method1216(class95.field1425, arg2 - 45);
                                    class52.field741 = false;
                                    continue;
                                }
                                if (var526 == 6021) {
                                    var3--;
                                    class163.field2515 = class217.field3397[var3] == 1;
                                    class276.method1910((byte) 58);
                                    continue;
                                }
                                if (var526 == 6023) {
                                    boolean var195 = false;
                                    var3--;
                                    int var196 = class217.field3397[var3];
                                    if (var196 < 0) {
                                        var196 = 0;
                                    }
                                    if (var196 > 2) {
                                        var196 = 2;
                                    }
                                    if (class200.field3157 < 96) {
                                        var196 = 0;
                                        var195 = true;
                                    }
                                    class65.method426(var196);
                                    class170.method1216(class95.field1425, 69);
                                    class52.field741 = false;
                                    class217.field3397[var3++] = var195 ? 0 : 1;
                                    continue;
                                }
                                if (var526 == 6024) {
                                    var3--;
                                    int var197 = class217.field3397[var3];
                                    if (var197 < 0 || var197 > 2) {
                                        var197 = 0;
                                    }
                                    class250.field4091 = var197;
                                    class170.method1216(class95.field1425, arg2 ^ 0x35);
                                    continue;
                                }
                                if (var526 == 6027) {
                                    var3--;
                                    continue;
                                }
                                if (var526 == 6028) {
                                    var3--;
                                    class210.field3279 = class217.field3397[var3] != 0;
                                    class170.method1216(class95.field1425, -67);
                                    continue;
                                }
                            } else if (var526 < 6200) {
                                if (var526 == 6101) {
                                    class217.field3397[var3++] = class229.field3547;
                                    continue;
                                }
                                if (var526 == 6102) {
                                    class217.field3397[var3++] = class60.method384(-4) ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6103) {
                                    class217.field3397[var3++] = class44.field528 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6105) {
                                    class217.field3397[var3++] = class73.field1106 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6106) {
                                    class217.field3397[var3++] = class17.field234 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6107) {
                                    class217.field3397[var3++] = class162.field2440 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6108) {
                                    class217.field3397[var3++] = class118.field1707 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6109) {
                                    class217.field3397[var3++] = class234.field3773 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6110) {
                                    class217.field3397[var3++] = class89.field1333 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6111) {
                                    class217.field3397[var3++] = class22.field286;
                                    continue;
                                }
                                if (var526 == 6112) {
                                    class217.field3397[var3++] = class250.field4053 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6114) {
                                    class217.field3397[var3++] = class274.field4452 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6115) {
                                    class217.field3397[var3++] = class64.field925 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6116) {
                                    class217.field3397[var3++] = class96.field1451;
                                    continue;
                                }
                                if (var526 == 6117) {
                                    class217.field3397[var3++] = class23.field295 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6118) {
                                    class217.field3397[var3++] = class96.field1437;
                                    continue;
                                }
                                if (var526 == 6119) {
                                    class217.field3397[var3++] = class136.field1960;
                                    continue;
                                }
                                if (var526 == 6120) {
                                    class217.field3397[var3++] = class235.field3792;
                                    continue;
                                }
                                if (var526 == 6121) {
                                    class217.field3397[var3++] = 0;
                                    continue;
                                }
                                if (var526 == 6123) {
                                    class217.field3397[var3++] = class65.method429();
                                    continue;
                                }
                                if (var526 == 6124) {
                                    class217.field3397[var3++] = class250.field4091;
                                    continue;
                                }
                                if (var526 == 6126) {
                                    class217.field3397[var3++] = 0;
                                    continue;
                                }
                                if (var526 == 6127) {
                                    class217.field3397[var3++] = class295.field4725 ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6128) {
                                    class217.field3397[var3++] = class210.field3279 ? 1 : 0;
                                    continue;
                                }
                            } else if (var526 < 6300) {
                                if (var526 == 6200) {
                                    var3 -= 2;
                                    class197.field3104 = (short) class217.field3397[var3];
                                    if (class197.field3104 <= 0) {
                                        class197.field3104 = 256;
                                    }
                                    class108.field1579 = (short) class217.field3397[var3 + 1];
                                    if (class108.field1579 <= 0) {
                                        class108.field1579 = 205;
                                    }
                                    continue;
                                }
                                if (var526 == 6201) {
                                    var3 -= 2;
                                    class73.field1080 = (short) class217.field3397[var3];
                                    if (class73.field1080 <= 0) {
                                        class73.field1080 = 256;
                                    }
                                    class45.field545 = (short) class217.field3397[var3 + 1];
                                    if (class45.field545 <= 0) {
                                        class45.field545 = 320;
                                    }
                                    continue;
                                }
                                if (var526 == 6202) {
                                    var3 -= 4;
                                    class72.field1070 = (short) class217.field3397[var3];
                                    if (class72.field1070 <= 0) {
                                        class72.field1070 = 1;
                                    }
                                    client.field3867 = (short) class217.field3397[var3 + 1];
                                    if (client.field3867 <= 0) {
                                        client.field3867 = 32767;
                                    } else if (class72.field1070 > client.field3867) {
                                        client.field3867 = class72.field1070;
                                    }
                                    class295.field4724 = (short) class217.field3397[var3 + 2];
                                    if (class295.field4724 <= 0) {
                                        class295.field4724 = 1;
                                    }
                                    class17.field230 = (short) class217.field3397[var3 + 3];
                                    if (class17.field230 <= 0) {
                                        class17.field230 = 32767;
                                    } else if (class295.field4724 > class17.field230) {
                                        class17.field230 = class295.field4724;
                                    }
                                    continue;
                                }
                                if (var526 == 6203) {
                                    class136.method865(class41.field500.field3730, 0, arg2 + 63, false, class41.field500.field3686, 0);
                                    class217.field3397[var3++] = class73.field1099;
                                    class217.field3397[var3++] = class58.field858;
                                    continue;
                                }
                                if (var526 == 6204) {
                                    class217.field3397[var3++] = class73.field1080;
                                    class217.field3397[var3++] = class45.field545;
                                    continue;
                                }
                                if (var526 == 6205) {
                                    class217.field3397[var3++] = class197.field3104;
                                    class217.field3397[var3++] = class108.field1579;
                                    continue;
                                }
                            } else if (var526 < 6400) {
                                if (var526 == 6300) {
                                    class217.field3397[var3++] = (int) (class98.method665(true) / 60000L);
                                    continue;
                                }
                                if (var526 == 6301) {
                                    class217.field3397[var3++] = (int) (class98.method665(true) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var526 == 6302) {
                                    var3 -= 3;
                                    int var218 = class217.field3397[var3];
                                    int var219 = class217.field3397[var3 + 1];
                                    int var220 = class217.field3397[var3 + 2];
                                    class206.field3220.clear();
                                    class206.field3220.set(11, 12);
                                    class206.field3220.set(var220, var219, var218);
                                    class217.field3397[var3++] = (int) (class206.field3220.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var526 == 6303) {
                                    class206.field3220.clear();
                                    class206.field3220.setTime(new Date(class98.method665(true)));
                                    class217.field3397[var3++] = class206.field3220.get(1);
                                    continue;
                                }
                                if (var526 == 6304) {
                                    var3--;
                                    int var221 = class217.field3397[var3];
                                    boolean var222 = true;
                                    if (var221 < 0) {
                                        var222 = ((var221 + 1) % 4) == 0;
                                    } else if (var221 < 1582) {
                                        var222 = (var221 % 4) == 0;
                                    } else if ((var221 % 4) != 0) {
                                        var222 = false;
                                    } else if ((var221 % 100) != 0) {
                                        var222 = true;
                                    } else if (var221 % 400 != 0) {
                                        var222 = false;
                                    }
                                    class217.field3397[var3++] = var222 ? 1 : 0;
                                    continue;
                                }
                            } else if (var526 < 6500) {
                                if (var526 == 6405) {
                                    class217.field3397[var3++] = class153.method1056(false) ? 1 : 0;
                                    continue;
                                }
                                if (var526 == 6406) {
                                    class217.field3397[var3++] = class94.method643(127) ? 1 : 0;
                                    continue;
                                }
                            } else if (var526 < 6600) {
                                if (var526 == 6500) {
                                    if (class40.field480 == 10 && class229.field3541 == 0 && class45.field536 == 0 && class299.field4764 == 0) {
                                        class217.field3397[var3++] = class198.method1380(false) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class217.field3397[var3++] = 1;
                                    continue;
                                }
                                if (var526 == 6501) {
                                    class210 var206 = class10.method59(111);
                                    if (var206 == null) {
                                        class217.field3397[var3++] = -1;
                                        class217.field3397[var3++] = 0;
                                        class83.field1276[var4++] = "";
                                        class217.field3397[var3++] = 0;
                                        class83.field1276[var4++] = "";
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = var206.field3273;
                                        class217.field3397[var3++] = var206.field3816;
                                        class83.field1276[var4++] = var206.field3272;
                                        class271 var207 = var206.method1456(false);
                                        class217.field3397[var3++] = var207.field4411;
                                        class83.field1276[var4++] = var207.field4413;
                                        class217.field3397[var3++] = var206.field3819;
                                    }
                                    continue;
                                }
                                if (var526 == 6502) {
                                    class210 var208 = class299.method2014((byte) 87);
                                    if (var208 == null) {
                                        class217.field3397[var3++] = -1;
                                        class217.field3397[var3++] = 0;
                                        class83.field1276[var4++] = "";
                                        class217.field3397[var3++] = 0;
                                        class83.field1276[var4++] = "";
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = var208.field3273;
                                        class217.field3397[var3++] = var208.field3816;
                                        class83.field1276[var4++] = var208.field3272;
                                        class271 var209 = var208.method1456(false);
                                        class217.field3397[var3++] = var209.field4411;
                                        class83.field1276[var4++] = var209.field4413;
                                        class217.field3397[var3++] = var208.field3819;
                                    }
                                    continue;
                                }
                                if (var526 == 6503) {
                                    var3--;
                                    int var210 = class217.field3397[var3];
                                    if (class40.field480 == 10 && class229.field3541 == 0 && class45.field536 == 0 && class299.field4764 == 0) {
                                        class217.field3397[var3++] = class290.method1970(var210, 104) ? 1 : 0;
                                        continue;
                                    }
                                    class217.field3397[var3++] = 0;
                                    continue;
                                }
                                if (var526 == 6504) {
                                    var3--;
                                    class170.field2663 = class217.field3397[var3];
                                    class170.method1216(class95.field1425, 72);
                                    continue;
                                }
                                if (var526 == 6505) {
                                    class217.field3397[var3++] = class170.field2663;
                                    continue;
                                }
                                if (var526 == 6506) {
                                    var3--;
                                    int var211 = class217.field3397[var3];
                                    class210 var212 = class187.method1314(45, var211);
                                    if (var212 == null) {
                                        class217.field3397[var3++] = -1;
                                        class83.field1276[var4++] = "";
                                        class217.field3397[var3++] = 0;
                                        class83.field1276[var4++] = "";
                                        class217.field3397[var3++] = 0;
                                    } else {
                                        class217.field3397[var3++] = var212.field3816;
                                        class83.field1276[var4++] = var212.field3272;
                                        class271 var213 = var212.method1456(false);
                                        class217.field3397[var3++] = var213.field4411;
                                        class83.field1276[var4++] = var213.field4413;
                                        class217.field3397[var3++] = var212.field3819;
                                    }
                                    continue;
                                }
                                if (var526 == 6507) {
                                    var3 -= 4;
                                    int var214 = class217.field3397[var3];
                                    int var215 = class217.field3397[var3 + 2];
                                    boolean var216 = class217.field3397[var3 + 1] == 1;
                                    boolean var217 = class217.field3397[var3 + 3] == 1;
                                    class174.method1244((byte) -93, var215, var214, var216, var217);
                                    continue;
                                }
                            } else if (var526 < 6700) {
                                if (var526 == 6600) {
                                    var3--;
                                    class180.field2832 = class217.field3397[var3] == 1;
                                    class170.method1216(class95.field1425, arg2 ^ 0x78);
                                    continue;
                                }
                                if (var526 == 6601) {
                                    class217.field3397[var3++] = class180.field2832 ? 1 : 0;
                                    continue;
                                }
                            } else if (var526 < 6900) {
                                if (var526 == 6800) {
                                    var3--;
                                    int var198 = class217.field3397[var3];
                                    class152 var199 = class136.method863(var198, 0);
                                    if (var199.field2243 == null) {
                                        class83.field1276[var4++] = "";
                                    } else {
                                        class83.field1276[var4++] = var199.field2243;
                                    }
                                    continue;
                                }
                                if (var526 == 6801) {
                                    var3--;
                                    int var200 = class217.field3397[var3];
                                    class152 var201 = class136.method863(var200, 0);
                                    class217.field3397[var3++] = var201.field2241;
                                    continue;
                                }
                                if (var526 == 6802) {
                                    var3--;
                                    int var202 = class217.field3397[var3];
                                    class152 var203 = class136.method863(var202, arg2 + 12);
                                    class217.field3397[var3++] = var203.field2251;
                                    continue;
                                }
                                if (var526 == 6803) {
                                    var3--;
                                    int var204 = class217.field3397[var3];
                                    class152 var205 = class136.method863(var204, 0);
                                    class217.field3397[var3++] = var205.field2262;
                                    continue;
                                }
                            }
                        } else if (var526 == 4500) {
                            var3 -= 2;
                            int var372 = class217.field3397[var3];
                            int var373 = class217.field3397[var3 + 1];
                            class226 var374 = class214.method1501(var373, (byte) -59);
                            if (var374.method1594(-118)) {
                                class83.field1276[var4++] = class50.method310(var372, 26).method82(false, var374.field3514, var373);
                            } else {
                                class217.field3397[var3++] = class50.method310(var372, 26).method85(var374.field3519, var373, 126);
                            }
                            continue;
                        }
                    } else if (var526 == 4300) {
                        var3 -= 2;
                        int var375 = class217.field3397[var3];
                        int var376 = class217.field3397[var3 + 1];
                        class226 var377 = class214.method1501(var376, (byte) -59);
                        if (var377.method1594(-127)) {
                            class83.field1276[var4++] = class118.method780(var375, -29837).method851(15043, var376, var377.field3514);
                        } else {
                            class217.field3397[var3++] = class118.method780(var375, -29837).method846(var376, 900, var377.field3519);
                        }
                        continue;
                    }
                } else {
                    class231 var50;
                    if (var526 >= 2000) {
                        var3--;
                        var50 = class201.method1398(class217.field3397[var3], 0);
                        var526 -= 1000;
                    } else {
                        var50 = var38 ? class21.field273 : class195.field3085;
                    }
                    if (var526 == 1300) {
                        var3--;
                        int var51 = class217.field3397[var3] - 1;
                        if (var51 >= 0 && var51 <= 9) {
                            var4--;
                            var50.method1629(var51, class83.field1276[var4], (byte) 27);
                            continue;
                        }
                        var4--;
                        continue;
                    }
                    if (var526 == 1301) {
                        var3 -= 2;
                        int var52 = class217.field3397[var3 + 1];
                        int var53 = class217.field3397[var3];
                        var50.field3652 = class282.method1942(var53, var52, (byte) 125);
                        continue;
                    }
                    if (var526 == 1302) {
                        var3--;
                        var50.field3577 = class217.field3397[var3] == 1;
                        continue;
                    }
                    if (var526 == 1303) {
                        var3--;
                        var50.field3728 = class217.field3397[var3];
                        continue;
                    }
                    if (var526 == 1304) {
                        var3--;
                        var50.field3670 = class217.field3397[var3];
                        continue;
                    }
                    if (var526 == 1305) {
                        var4--;
                        var50.field3712 = class83.field1276[var4];
                        continue;
                    }
                    if (var526 == 1306) {
                        var4--;
                        var50.field3581 = class83.field1276[var4];
                        continue;
                    }
                    if (var526 == 1307) {
                        var50.field3622 = null;
                        continue;
                    }
                    if (var526 == 1308) {
                        var3--;
                        var50.field3589 = class217.field3397[var3];
                        var3--;
                        var50.field3736 = class217.field3397[var3];
                        continue;
                    }
                    if (var526 == 1309) {
                        var3--;
                        int var54 = class217.field3397[var3];
                        var3--;
                        int var55 = class217.field3397[var3];
                        if (var55 >= 1 && var55 <= 10) {
                            var50.method1634(var55 - 1, var54, arg2 + 11);
                        }
                        continue;
                    }
                    if (var526 == 1310) {
                        var4--;
                        var50.field3713 = class83.field1276[var4];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var525) {
            if (arg0.field2718 == null) {
                if (class73.field1104 != 0) {
                    class236.method1655(0, "", 91, "Clientscript error - check log for details");
                }
                class285.method1952(var525, (byte) 77, "CS2 - scr:" + arg0.field4018 + " op:" + var7);
            } else {
                StringBuffer var522 = new StringBuffer(30);
                var522.append("%0a - in: ").append(arg0.field2718);
                for (int var523 = class161.field2412 - 1; var523 >= 0; var523--) {
                    var522.append("%0a - via: ").append(class262.field4257[var523].field1031.field2718);
                }
                if (var7 == 40) {
                    int var524 = var8[var6];
                    var522.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var524));
                }
                if (class73.field1104 != 0) {
                    class236.method1655(0, "", 109, "Clientscript error in: " + arg0.field2718);
                }
                class285.method1952(var525, (byte) -108, "CS2 - scr:" + arg0.field4018 + " op:" + var7 + var522.toString());
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class49(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field605 = arg3;
        this.field614 = arg1;
        this.field611 = arg5;
        this.field608 = arg4;
        this.field610 = arg6;
        if (this.field610 == 255) {
            this.field610 = 0;
        }
        this.field624 = arg0;
        this.field629 = arg2;
        this.field618 = new class220();
    }
}
