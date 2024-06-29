import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class223 {

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public int field3487 = -1;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public int field3486 = 99;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Z")
    public boolean field3497 = false;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public int field3489 = -1;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public int field3509 = 2;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field3482 = -1;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Z")
    public boolean field3498 = false;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Z")
    public boolean field3503 = false;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "Z")
    public boolean field3506 = false;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field3481 = 5;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field3491 = -1;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public int field3502 = -1;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "[I")
    public static int[] field3496 = new int[256];

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "Z")
    public static boolean field3515;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "[I")
    public static int[] field3517;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "Lfa;")
    public static class257 field3508;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lli;")
    public static class297 field3495;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    public int[] field3484;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[I")
    public int[] field3488;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "[I")
    private int[] field3513;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "[Z")
    public boolean[] field3493;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "[[I")
    public int[][] field3501;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILrg;IIB)Lrg;")
    public final class233 method1485(int arg0, class233 arg1, int arg2, int arg3, byte arg4) {
        field3504++;
        int var6 = this.field3488[arg0];
        int var7 = this.field3484[arg0];
        if (arg4 != 96) {
            method1489(10, (class176) null, (byte) 16);
        }
        class286 var8 = class198.method1324((byte) -69, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method1537(true, true, true);
        }
        class286 var10 = null;
        if ((this.field3498 || class53.field830) && arg3 != -1 && this.field3484.length > arg3) {
            int var11 = this.field3484[arg3];
            var10 = class198.method1324((byte) -117, var11 >> 16);
            arg3 = var11 & 0xFFFF;
        }
        class233 var12;
        if (var10 == null) {
            var12 = arg1.method1537(!var8.method1924(false, var9), !var8.method1921(arg4 ^ 0x310B, var9), !this.field3506);
        } else {
            var12 = arg1.method1537(!var8.method1924(false, var9) & !var10.method1924(false, arg3), !var8.method1921(arg4 ^ 0x310B, var9) & !var10.method1921(12651, arg3), !this.field3506);
        }
        var12.method1551(var8, var9, var10, arg3, arg2 - 1, var6, this.field3506);
        return var12;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIILrg;)Lrg;")
    public final class233 method1486(int arg0, int arg1, int arg2, int arg3, class233 arg4) {
        field3511++;
        if (arg0 != -1097371440) {
            return null;
        }
        int var6 = this.field3488[arg1];
        int var7 = this.field3484[arg1];
        class286 var8 = class198.method1324((byte) -60, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method1545(true, true, true);
        }
        class286 var10 = null;
        class286 var11 = null;
        if ((this.field3498 || class53.field830) && arg2 != -1 && arg2 < this.field3484.length) {
            int var12 = this.field3484[arg2];
            var10 = class198.method1324((byte) 80, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class286 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field3513 != null) {
            if (arg1 < this.field3513.length) {
                var15 = this.field3513[arg1];
                if (var15 != 65535) {
                    var13 = class198.method1324((byte) 86, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3498 || class53.field830) && arg2 != -1 && this.field3513.length > arg2) {
                var14 = this.field3513[arg2];
                if (var14 != 65535) {
                    var11 = class198.method1324((byte) 85, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1924(false, var9);
        boolean var17 = !var8.method1921(arg0 + 1097384091, var9);
        if (var13 != null) {
            var16 &= !var13.method1924(false, var15);
            var17 &= !var13.method1921(12651, var15);
        }
        if (var10 != null) {
            var16 &= !var10.method1924(false, arg2);
            var17 &= !var10.method1921(12651, arg2);
        }
        if (var11 != null) {
            var16 &= !var11.method1924(false, var14);
            var17 &= !var11.method1921(12651, var14);
        }
        class233 var18 = arg4.method1545(var16, var17, !this.field3506);
        var18.method1551(var8, var9, var10, arg2, arg3 - 1, var6, this.field3506);
        if (var13 != null) {
            var18.method1551(var13, var15, var11, var14, arg3 - 1, var6, this.field3506);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    public static final boolean method1487(int arg0) {
        field3494++;
        int var1 = 67 % ((arg0 - 22) / 62);
        return class121.field1859;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lf;I)V")
    public final void method1488(class37 arg0, int arg1) {
        if (arg1 != 78) {
            this.field3503 = true;
        }
        field3512++;
        while (true) {
            int var3 = arg0.method333((byte) -59);
            if (var3 == 0) {
                return;
            }
            this.method1491(arg0, var3, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILuf;B)Z")
    public static final boolean method1489(int arg0, class176 arg1, byte arg2) {
        field3499++;
        if (arg2 <= 4) {
            method1494(-16, false, 8, 90, -54, -92, -110, (class188) null);
        }
        byte[] var3 = arg1.method1152(-4897, arg0);
        if (var3 == null) {
            return false;
        } else {
            class129.method914(104, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method1490(Throwable arg0, String arg1, byte arg2) {
        field3490++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class243.method1649(-127, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class131.method922(var3, -111);
            String var4 = class288.method1940("%3a", (byte) -91, var3, ":");
            String var5 = class288.method1940("%40", (byte) -81, var4, "@");
            String var6 = class288.method1940("%26", (byte) -62, var5, "&");
            String var7 = class288.method1940("%23", (byte) -61, var6, "#");
            if (class155.field2365.field934 != null) {
                if (arg2 >= -42) {
                    field3517 = null;
                }
                class248 var8 = class155.field2365.method468(true, new URL(class155.field2365.field934.getCodeBase(), "clienterror.ws?c=" + class39.field660 + "&u=" + class8.field181 + "&v1=" + class59.field923 + "&v2=" + class59.field938 + "&e=" + var7));
                while (var8.field3828 == 0) {
                    class42.method354(1L, false);
                }
                if (var8.field3828 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3831;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lf;IB)V")
    private final void method1491(class37 arg0, int arg1, byte arg2) {
        if (arg2 > -79) {
            field3515 = false;
        }
        field3483++;
        if (arg1 == 1) {
            int var4 = arg0.method293(98);
            this.field3488 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3488[var5] = arg0.method293(126);
            }
            this.field3484 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3484[var6] = arg0.method293(106);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3484[var7] += arg0.method293(119) << 16;
            }
        } else if (arg1 == 2) {
            this.field3487 = arg0.method293(114);
        } else if (arg1 == 3) {
            this.field3493 = new boolean[256];
            int var15 = arg0.method333((byte) -59);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3493[arg0.method333((byte) -59)] = true;
            }
        } else if (arg1 == 4) {
            this.field3497 = true;
        } else if (arg1 == 5) {
            this.field3481 = arg0.method333((byte) -59);
        } else if (arg1 == 6) {
            this.field3491 = arg0.method293(96);
        } else if (arg1 == 7) {
            this.field3482 = arg0.method293(115);
        } else if (arg1 == 8) {
            this.field3486 = arg0.method333((byte) -59);
        } else if (arg1 == 9) {
            this.field3502 = arg0.method333((byte) -59);
        } else if (arg1 == 10) {
            this.field3489 = arg0.method333((byte) -59);
        } else if (arg1 == 11) {
            this.field3509 = arg0.method333((byte) -59);
            return;
        } else if (arg1 == 12) {
            int var8 = arg0.method333((byte) -59);
            this.field3513 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3513[var9] = arg0.method293(11);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3513[var10] += arg0.method293(99) << 16;
            }
            return;
        } else if (arg1 == 13) {
            int var11 = arg0.method293(-74);
            this.field3501 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method333((byte) -59);
                if (var13 > 0) {
                    this.field3501[var12] = new int[var13];
                    this.field3501[var12][0] = arg0.method336(23362);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3501[var12][var14] = arg0.method293(-101);
                    }
                }
            }
            return;
        } else if (arg1 == 14) {
            this.field3506 = true;
            return;
        } else if (arg1 == 15) {
            this.field3498 = true;
            return;
        } else if (arg1 == 16) {
            this.field3503 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BIILrg;II)Lrg;")
    public final class233 method1492(byte arg0, int arg1, int arg2, class233 arg3, int arg4, int arg5) {
        field3500++;
        int var7 = this.field3488[arg2];
        int var8 = this.field3484[arg2];
        class286 var9 = class198.method1324((byte) 82, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method1554(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class286 var12 = null;
        if ((this.field3498 || class53.field830) && arg1 != -1 && this.field3484.length > arg1) {
            int var13 = this.field3484[arg1];
            var12 = class198.method1324((byte) 99, var13 >> 16);
            arg1 = var13 & 0xFFFF;
        }
        class233 var14;
        if (var12 == null) {
            var14 = arg3.method1554(!var9.method1924(false, var10), !var9.method1921(arg0 ^ 0x314C, var10), !this.field3506);
        } else {
            var14 = arg3.method1554(!var9.method1924(false, var10) & !var12.method1924(false, arg1), !var9.method1921(12651, var10) & !var12.method1921(12651, arg1), !this.field3506);
        }
        if (var11 == 1) {
            var14.method1540();
        } else if (var11 == 2) {
            var14.method1530();
        } else if (var11 == 3) {
            var14.method1528();
        }
        if (arg0 != 39) {
            return null;
        }
        var14.method1551(var9, var10, var12, arg1, arg5 - 1, var7, this.field3506);
        if (var11 == 1) {
            var14.method1528();
        } else if (var11 == 2) {
            var14.method1530();
        } else if (var11 == 3) {
            var14.method1540();
        }
        return var14;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static void method1493(int arg0) {
        field3517 = null;
        field3508 = null;
        if (arg0 != -20654) {
            field3515 = false;
        }
        field3496 = null;
        field3495 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZIIIIILag;)V")
    public static final void method1494(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class188 arg7) {
        field3485++;
        int var8 = arg2 * arg2 + arg5 * arg5;
        if (!arg1) {
            method1490((Throwable) null, (String) null, (byte) 8);
        }
        if (arg4 < var8) {
            return;
        }
        int var9 = Math.min(arg7.field2922 / 2, arg7.field2928 / 2);
        if (var9 * var9 >= var8) {
            class250.method1674(arg3, arg7, arg2, class139.field2142[arg0], arg5, 2, arg6);
            return;
        }
        var9 -= 10;
        int var10 = (int) class276.field4334 + class133.field2060 & 0x7FF;
        int var11 = class97.field1556[var10];
        int var12 = class97.field1557[var10];
        int var13 = var11 * 256 / (class296.field4674 + 256);
        int var14 = var12 * 256 / (class296.field4674 + 256);
        int var15 = arg2 * var14 + arg5 * var13 >> 16;
        int var16 = arg2 * var13 - (arg5 * var14) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        ((class49) class174.field2590[arg0]).method406(arg3 - (-(arg7.field2922 / 2) - var19) - 10, arg7.field2928 / 2 - 10 + arg6 + -var20, 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIC)C")
    public static final char method1495(int arg0, int arg1, char arg2) {
        field3516++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        }
        if (arg0 >= -110) {
            field3517 = null;
        }
        if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)I")
    public static final int method1496(int arg0, int arg1, int arg2) {
        field3505++;
        class127 var3 = (class127) class251.field3858.method1414(true, (long) arg2);
        if (arg1 <= 63) {
            field3495 = null;
        }
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field1989.length) {
            return var3.field1989[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public final void method1497(int arg0) {
        field3514++;
        if (arg0 != -25536) {
            method1493(64);
        }
        if (this.field3489 == -1) {
            if (this.field3493 == null) {
                this.field3489 = 0;
            } else {
                this.field3489 = 2;
            }
        }
        if (this.field3502 != -1) {
            return;
        }
        if (this.field3493 == null) {
            this.field3502 = 0;
        } else {
            this.field3502 = 2;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3496[var0] = var1;
        }
        field3515 = false;
        field3517 = new int[128];
    }
}
