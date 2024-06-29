import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class256 {

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lbe;")
    public static class283 field4321 = class153.method941(126, "titlebg");

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4325 = 0;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field4324 = 0;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lbe;")
    private static class283 field4319 = class153.method941(-124, "yellow:");

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lbe;")
    public static class283 field4326 = class153.method941(-120, "leuchten1:");

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lbe;")
    private static class283 field4328 = class153.method941(127, "glow1:");

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lbe;")
    public static class283 field4322 = field4328;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lbe;")
    public static class283 field4314 = field4319;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lbe;")
    public static class283 field4330 = field4319;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lbe;")
    public static class283 field4331 = field4328;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[[B")
    public static byte[][] field4329;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1728(byte arg0) {
        field4316++;
        int var1 = -32 % ((56 - arg0) / 39);
        class277.field4636.method1631(-27875);
        class107.field1824.method1631(-27875);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1729(int arg0) {
        field4320++;
        for (class91 var1 = (class91) class153.field2518.method1812((byte) -107); var1 != null; var1 = (class91) class153.field2518.method1813((byte) 46)) {
            if (var1.field1534 > 0) {
                var1.field1534--;
            }
            if (var1.field1534 != 0) {
                if (var1.field1537 > 0) {
                    var1.field1537--;
                }
                if (var1.field1537 == 0 && var1.field1540 >= 1 && var1.field1531 >= 1 && var1.field1540 <= 102 && var1.field1531 <= 102 && (var1.field1544 < 0 || class264.method1786((byte) -88, var1.field1544, var1.field1542))) {
                    class163.method992(var1.field1540, var1.field1535, var1.field1544, var1.field1531, var1.field1529, var1.field1545, (byte) 114, var1.field1542);
                    var1.field1537 = -1;
                    if (var1.field1544 == var1.field1536 && var1.field1536 == -1) {
                        var1.method557((byte) -89);
                    } else if (var1.field1544 == var1.field1536 && var1.field1539 == var1.field1529 && var1.field1542 == var1.field1532) {
                        var1.method557((byte) -89);
                    }
                }
            } else if (var1.field1536 < 0 || class264.method1786((byte) -88, var1.field1536, var1.field1532)) {
                class163.method992(var1.field1540, var1.field1535, var1.field1536, var1.field1531, var1.field1539, var1.field1545, (byte) 114, var1.field1532);
                var1.method557((byte) -89);
            }
        }
        if (arg0 != -1) {
            field4328 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 97)
    public static final void method1730(int arg0) {
        field4315++;
        class66.field914.method1636(122);
        class186.field3183.method1636(109);
        if (arg0 != 0) {
            method1731(false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 118)
    public static void method1731(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4330 = null;
        field4321 = null;
        field4326 = null;
        field4331 = null;
        field4329 = (byte[][]) null;
        field4319 = null;
        field4328 = null;
        field4322 = null;
        field4314 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILnh;Lkg;ZII)V", line = 146)
    public static final void method1732(int arg0, int arg1, class107 arg2, class69 arg3, boolean arg4, int arg5, int arg6) {
        field4327++;
        if (arg2 == null) {
            return;
        }
        int var7 = class88.field1497 + class203.field3477 & 0x7FF;
        int var8 = arg1 * arg1 + arg5 * arg5;
        int var9 = Math.max(arg3.field1069 / 2, arg3.field1085 / 2) + 10;
        if (var8 > (var9 * var9)) {
            return;
        }
        int var10 = class139.field2309[var7];
        int var11 = var10 * 256 / (class24.field358 + 256);
        int var12 = class139.field2316[var7];
        int var13 = var12 * 256 / (class24.field358 + 256);
        int var14 = arg5 * var13 - (arg1 * var11) >> 16;
        int var15 = arg1 * var13 + arg5 * var11 >> 16;
        ((class266) arg2).method1796(arg3.field1069 / 2 + var15 + arg6 - (arg2.field1820 / 2), -(arg2.field1829 / 2) + arg0 - (-(arg3.field1085 / 2) - -var14), (class266) arg3.method447(false, (byte) 28));
        if (!arg4) {
            method1731(false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLek;I)Lnh;", line = 183)
    public static final class107 method1733(byte arg0, class172 arg1, int arg2) {
        if (arg0 == -53) {
            field4318++;
            return class246.method1675((byte) 19, arg2, arg1) ? class296.method2014((byte) -124) : null;
        } else {
            return (class107) null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)I", line = 224)
    public static final int method1734(boolean arg0, int arg1) {
        double var2 = (double) ((arg1 & 0xFF87) >> 8) / 256.0D;
        field4323++;
        double var4 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var4;
        if (var4 > var2) {
            var8 = var2;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        if (arg0) {
            return 12;
        }
        double var10 = 0.0D;
        double var12 = 0.0D;
        double var14 = var4;
        if (var2 > var4) {
            var14 = var2;
        }
        if (var14 < var6) {
            var14 = var6;
        }
        double var16 = (var8 + var14) / 2.0D;
        if (var8 != var14) {
            if (var4 == var14) {
                var10 = (var2 - var6) / (var14 - var8);
            } else if (var2 == var14) {
                var10 = (var6 - var4) / (var14 - var8) + 2.0D;
            } else if (var6 == var14) {
                var10 = (var4 - var2) / (var14 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var12 = (var14 - var8) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (var14 - var8) / (2.0D - var14 - var8);
            }
        }
        double var18 = var10 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var12 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var21 > 243) {
            var22 >>= 0x4;
        } else if (var21 > 217) {
            var22 >>= 0x3;
        } else if (var21 > 192) {
            var22 >>= 0x2;
        } else if (var21 > 179) {
            var22 >>= 0x1;
        }
        return (var20 >> 2 << 10) + (var22 >> 5 << 7) + (var21 >> 1);
    }
}
