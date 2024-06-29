import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 extends class101 {

    @OriginalMember(owner = "client!k", name = "vb", descriptor = "I")
    private int field1506 = 0;

    @OriginalMember(owner = "client!k", name = "yb", descriptor = "Z")
    public boolean field1509 = false;

    @OriginalMember(owner = "client!k", name = "Db", descriptor = "I")
    private int field1514 = 0;

    @OriginalMember(owner = "client!k", name = "rb", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!k", name = "pb", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!k", name = "Fb", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!k", name = "zb", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!k", name = "Eb", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!k", name = "sb", descriptor = "Lnc;")
    private class93 field1503;

    @OriginalMember(owner = "client!k", name = "ub", descriptor = "Laf;")
    private static class7 field1505 = class48.method406(40, "Enter your username (V password)3");

    @OriginalMember(owner = "client!k", name = "xb", descriptor = "I")
    public static int field1508 = 1;

    @OriginalMember(owner = "client!k", name = "Cb", descriptor = "Z")
    public static boolean field1513 = false;

    @OriginalMember(owner = "client!k", name = "Bb", descriptor = "Laf;")
    public static class7 field1512 = class48.method406(40, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!k", name = "Gb", descriptor = "Laf;")
    private static class7 field1517 = class48.method406(40, " has logged in)3");

    @OriginalMember(owner = "client!k", name = "wb", descriptor = "Laf;")
    public static class7 field1507 = class48.method406(40, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!k", name = "Ob", descriptor = "Laf;")
    private static class7 field1525 = class48.method406(40, "Your account is already logged in)3");

    @OriginalMember(owner = "client!k", name = "Lb", descriptor = "Laf;")
    public static class7 field1522 = field1525;

    @OriginalMember(owner = "client!k", name = "Kb", descriptor = "Laf;")
    public static class7 field1521 = field1505;

    @OriginalMember(owner = "client!k", name = "Pb", descriptor = "Laf;")
    public static class7 field1526 = field1517;

    @OriginalMember(owner = "client!k", name = "Mb", descriptor = "Laf;")
    private static class7 field1523 = class48.method406(40, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!k", name = "Nb", descriptor = "Laf;")
    public static class7 field1524 = field1523;

    @OriginalMember(owner = "client!k", name = "ob", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!k", name = "qb", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!k", name = "Ab", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!k", name = "Hb", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!k", name = "Ib", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!k", name = "Jb", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([Lbf;[I[IIII)V")
    public static final void method552(class14[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 29945) {
            field1505 = null;
        }
        field1501++;
        if (arg3 >= arg5) {
            return;
        }
        int var6 = arg3 - 1;
        int var7 = arg5 + 1;
        int var8 = (arg3 + arg5) / 2;
        class14 var9 = arg0[var8];
        arg0[var8] = arg0[arg3];
        arg0[arg3] = var9;
        while (var7 > var6) {
            boolean var10 = true;
            do {
                var7--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg2[var11] == 2) {
                        var12 = var9.field355;
                        var13 = arg0[var7].field355;
                    } else if (arg2[var11] == 1) {
                        var12 = var9.field352;
                        var13 = arg0[var7].field352;
                        if (var13 == -1 && arg1[var11] == 1) {
                            var13 = 2001;
                        }
                        if (var12 == -1 && arg1[var11] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg2[var11] == 3) {
                        var12 = var9.field350 ? 1 : 0;
                        var13 = arg0[var7].field350 ? 1 : 0;
                    } else {
                        var13 = arg0[var7].field358;
                        var12 = var9.field358;
                    }
                    if (var12 != var13) {
                        if ((arg1[var11] != 1 || var13 <= var12) && (arg1[var11] != 0 || var12 <= var13)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg2[var15] == 2) {
                        var16 = var9.field355;
                        var17 = arg0[var6].field355;
                    } else if (arg2[var15] == 1) {
                        var16 = var9.field352;
                        var17 = arg0[var6].field352;
                        if (var16 == -1 && arg1[var15] == 1) {
                            var16 = 2001;
                        }
                        if (var17 == -1 && arg1[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg2[var15] == 3) {
                        var17 = arg0[var6].field350 ? 1 : 0;
                        var16 = var9.field350 ? 1 : 0;
                    } else {
                        var17 = arg0[var6].field358;
                        var16 = var9.field358;
                    }
                    if (var16 != var17) {
                        if ((arg1[var15] != 1 || var16 <= var17) && (arg1[var15] != 0 || var16 >= var17)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var7 > var6) {
                class14 var18 = arg0[var6];
                arg0[var6] = arg0[var7];
                arg0[var7] = var18;
            }
        }
        method552(arg0, arg1, arg2, arg3, 29945, var7);
        method552(arg0, arg1, arg2, var7 + 1, 29945, arg5);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
    public static final int method553(int arg0, int arg1, int arg2) {
        field1520++;
        if (arg1 <= 71) {
            return 102;
        } else {
            int var3 = arg0 * 57 + arg2;
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)Leb;")
    public final class31 method190(int arg0) {
        class27 var2 = class94.method764(this.field1510, -21565);
        field1511++;
        if (arg0 != 1) {
            method552(null, null, null, -3, -49, -83);
        }
        class31 var3;
        if (this.field1509) {
            var3 = var2.method241(101, -1);
        } else {
            var3 = var2.method241(arg0 - 34, this.field1506);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)V")
    public final void method554(boolean arg0, int arg1) {
        if (!arg0) {
            field1508 = -15;
        }
        field1519++;
        if (this.field1509) {
            return;
        }
        this.field1514 += arg1;
        while (this.field1503.field2169[this.field1506] < this.field1514) {
            this.field1514 -= this.field1503.field2169[this.field1506];
            this.field1506++;
            if (this.field1506 >= this.field1503.field2158.length) {
                this.field1509 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    public static void method555(int arg0) {
        field1526 = null;
        field1512 = null;
        field1522 = null;
        field1505 = null;
        field1507 = null;
        field1524 = null;
        field1525 = null;
        field1523 = null;
        field1517 = null;
        if (arg0 != -27669) {
            field1523 = null;
        }
        field1521 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIII)V")
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1502 = arg2;
        this.field1504 = arg1;
        this.field1500 = arg4;
        this.field1516 = arg5 + arg6;
        this.field1510 = arg0;
        this.field1515 = arg3;
        int var8 = class94.method764(this.field1510, -21565).field702;
        if (var8 == -1) {
            this.field1509 = true;
        } else {
            this.field1509 = false;
            this.field1503 = class87.method710(var8, 6491);
        }
    }
}
