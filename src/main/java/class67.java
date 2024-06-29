import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class67 extends class60 {

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!la", name = "zb", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!la", name = "Sb", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!la", name = "Jb", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!la", name = "Cb", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!la", name = "vb", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client!la", name = "Nb", descriptor = "Ltb;")
    private class116 field1528;

    @OriginalMember(owner = "client!la", name = "Qb", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client!la", name = "Hb", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!la", name = "Bb", descriptor = "Lrc;")
    private static class105 field1516 = class43.method374(" more options", 0);

    @OriginalMember(owner = "client!la", name = "Eb", descriptor = "I")
    public static int field1519 = 0;

    @OriginalMember(owner = "client!la", name = "qb", descriptor = "Lrc;")
    public static class105 field1505 = field1516;

    @OriginalMember(owner = "client!la", name = "Fb", descriptor = "Lrc;")
    public static class105 field1520 = class43.method374("Empf-=nger:", 0);

    @OriginalMember(owner = "client!la", name = "rb", descriptor = "Z")
    public static volatile boolean field1506 = true;

    @OriginalMember(owner = "client!la", name = "Db", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!la", name = "sb", descriptor = "Lrc;")
    public static class105 field1507 = class43.method374(": ", 0);

    @OriginalMember(owner = "client!la", name = "Rb", descriptor = "Lrc;")
    public static class105 field1532 = class43.method374("Konfig geladen)3", 0);

    @OriginalMember(owner = "client!la", name = "pb", descriptor = "Lrc;")
    private static class105 field1504 = class43.method374(" ", 0);

    @OriginalMember(owner = "client!la", name = "Mb", descriptor = "Lrc;")
    private static class105 field1527 = class43.method374("Password: ", 0);

    @OriginalMember(owner = "client!la", name = "Kb", descriptor = "Lrc;")
    public static class105 field1525 = field1504;

    @OriginalMember(owner = "client!la", name = "Pb", descriptor = "Lrc;")
    public static class105 field1530 = class43.method374("Versteckt", 0);

    @OriginalMember(owner = "client!la", name = "Ib", descriptor = "Lrc;")
    public static class105 field1523 = field1527;

    @OriginalMember(owner = "client!la", name = "Tb", descriptor = "Lrc;")
    private static class105 field1534 = class43.method374("To play on this world move to a free area first", 0);

    @OriginalMember(owner = "client!la", name = "ub", descriptor = "Lrc;")
    public static class105 field1509 = field1534;

    @OriginalMember(owner = "client!la", name = "Ob", descriptor = "Lrc;")
    private static class105 field1529 = class43.method374("Loading textures )2 ", 0);

    @OriginalMember(owner = "client!la", name = "xb", descriptor = "Lrc;")
    public static class105 field1512 = field1529;

    @OriginalMember(owner = "client!la", name = "Gb", descriptor = "[I")
    public static int[] field1521 = new int[500];

    @OriginalMember(owner = "client!la", name = "tb", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!la", name = "wb", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!la", name = "yb", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!la", name = "Ab", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!la", name = "Lb", descriptor = "Lub;")
    public static class122 field1526;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(III)Z", line = 4)
    public static final boolean method562(int arg0, int arg1, int arg2) {
        field1508++;
        if (arg0 != -7117) {
            field1516 = null;
        }
        if (arg1 == 0 && class123.field3029 == arg2) {
            return true;
        } else if (arg1 == 1 && class42.field949 == arg2) {
            return true;
        } else {
            return (arg1 == 2 || arg1 == 3) && class76.field1692 == arg2;
        }
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V", line = 26)
    public static void method563(int arg0) {
        field1525 = null;
        field1516 = null;
        field1509 = null;
        field1526 = null;
        field1521 = null;
        field1523 = null;
        field1512 = null;
        if (arg0 != 0) {
            field1512 = null;
        }
        field1534 = null;
        field1527 = null;
        field1532 = null;
        field1507 = null;
        field1530 = null;
        field1529 = null;
        field1504 = null;
        field1505 = null;
        field1520 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([BIIB)Z", line = 105)
    public static final boolean method564(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -67) {
            method562(-123, -124, 21);
        }
        class7 var4 = new class7(arg0);
        boolean var5 = true;
        int var6 = -1;
        label56: while (true) {
            int var7 = var4.method66(-690477040);
            if (var7 == 0) {
                field1515++;
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method66(arg3 - 690476973);
                    if (var11 == 0) {
                        continue label56;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var4.method96(27023) >> 2;
                    int var15 = arg2 + var13;
                    int var16 = var12 + arg1;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class121 var17 = class12.method149(var6, (byte) 62);
                        if (var14 != 22 || !class109.field2520 || var17.field2948 != 0 || var17.field2964) {
                            var9 = true;
                            if (!var17.method981((byte) 118)) {
                                class89.field2055++;
                                var5 = false;
                            }
                        }
                    }
                }
                int var10 = var4.method66(arg3 ^ 0x2927D7AD);
                if (var10 == 0) {
                    break;
                }
                var4.method96(arg3 ^ 0xFFFF9632);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Ljb;", line = 189)
    public final class56 method168(int arg0) {
        if (this.field1528 != null) {
            int var2 = class104.field2351 - this.field1522;
            if (var2 > 100 && this.field1528.field2692 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field1528.field2683[this.field1531]) {
                            break label42;
                        }
                        var2 -= this.field1528.field2683[this.field1531];
                        this.field1531++;
                    } while (this.field1528.field2713.length > this.field1531);
                    this.field1531 -= this.field1528.field2692;
                } while (this.field1531 >= 0 && this.field1531 < this.field1528.field2713.length);
                this.field1528 = null;
            }
            this.field1522 = class104.field2351 - var2;
        }
        field1511++;
        if (arg0 < 6) {
            return null;
        }
        class121 var3 = class12.method149(this.field1502, (byte) 62);
        if (var3.field2909 != null) {
            var3 = var3.method978((byte) -28);
        }
        return var3 == null ? null : var3.method977(this.field1531, this.field1514, this.field1528, this.field1503, 75, this.field1517, this.field1524, this.field1510, this.field1533);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lsb;[BIIIILkb;IIII)V", line = 276)
    public static final void method565(class110[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class62 arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 < 29) {
            field1520 = null;
        }
        field1513++;
        int var11 = -1;
        class7 var12 = new class7(arg1);
        while (true) {
            int var13 = var12.method66(-690477040);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method66(-690477040);
                if (var15 == 0) {
                    break;
                }
                int var16 = var12.method96(27023);
                var14 += var15 - 1;
                int var17 = var16 >> 2;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var14 & 0x3F;
                int var20 = var14 >> 12;
                int var21 = var16 & 0x3;
                if (arg7 == var20 && var18 >= arg9 && var18 < arg9 + 8 && arg4 <= var19 && arg4 + 8 > var19) {
                    class121 var22 = class12.method149(var11, (byte) 62);
                    int var23 = arg10 + class41.method368(var19 & 0x7, var21, var22.field2912, 118, var18 & 0x7, var22.field2906, arg8);
                    int var24 = arg2 + class116.method948(-13766, var19 & 0x7, var22.field2906, var22.field2912, var18 & 0x7, var21, arg8);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg3;
                        class110 var26 = null;
                        if ((class57.field1185[1][var23][var24] & 0x2) == 2) {
                            var25 = arg3 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg0[var25];
                        }
                        class6.method59(var17, -24053, arg6, var23, var11, arg8 + var21 & 0x3, var26, var24, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIIIIZLk;)V", line = 352)
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class60 arg9) {
        this.field1503 = arg4;
        this.field1514 = arg6;
        this.field1533 = arg5;
        this.field1524 = arg1;
        this.field1517 = arg3;
        this.field1510 = arg2;
        this.field1502 = arg0;
        if (arg7 != -1) {
            this.field1528 = class6.method49(103, arg7);
            this.field1531 = 0;
            this.field1522 = class104.field2351 - 1;
            if (this.field1528.field2711 == 0 && arg9 != null && arg9 instanceof class67) {
                class67 var11 = (class67) arg9;
                if (this.field1528 == var11.field1528) {
                    this.field1522 = var11.field1522;
                    this.field1531 = var11.field1531;
                    return;
                }
            }
            if (arg8 && this.field1528.field2692 != -1) {
                this.field1531 = (int) (Math.random() * (double) this.field1528.field2713.length);
                this.field1522 -= (int) (Math.random() * (double) this.field1528.field2683[this.field1531]);
                return;
            }
        }
    }
}
