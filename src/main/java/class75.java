import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class75 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Led;")
    public static class43 field1478 = class191.method1219("Benutzeroberfl-=che geladen)3", false);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Led;")
    public static class43 field1492 = class191.method1219("oberen Rand der Webseite ausw-=hlen)3", false);

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Led;")
    public static class43 field1498 = class191.method1219("<)4col>", false);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Led;")
    public static class43 field1484 = class191.method1219("Bitte warten Sie eine Minute", false);

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1485 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "J")
    private long field1483;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "J")
    private long field1501;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lob;")
    public static class129 field1482;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Z")
    public boolean field1495;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
    private int[] field1493;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
    private int[] field1499;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIZ)V")
    public final void method461(boolean arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        int var4 = this.field1493[arg1];
        field1488++;
        if (arg0) {
            var4++;
            if (var4 >= class44.field869[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class44.field869[arg1].length - 1;
            }
        }
        this.field1493[arg1] = var4;
        this.method472(-103);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
    public final void method462(byte arg0, boolean arg1) {
        if (arg0 == 1) {
            field1497++;
            if (arg1 != this.field1495) {
                this.method465((byte) 61, this.field1493, arg1, -1, null);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1496++;
        class138 var10 = (class138) class176.field3499.method753(-26703);
        class138 var11 = null;
        while (var10 != null) {
            if (var10.field2864 == arg1 && var10.field2870 == arg6 && var10.field2867 == arg5 && var10.field2858 == arg9) {
                var11 = var10;
                break;
            }
            var10 = (class138) class176.field3499.method755((byte) 114);
        }
        if (var11 == null) {
            var11 = new class138();
            var11.field2867 = arg5;
            var11.field2864 = arg1;
            var11.field2870 = arg6;
            var11.field2858 = arg9;
            class139.method898(var11, arg2 ^ 0xAC95E844);
            class176.field3499.method756(arg2 + 25533, var11);
        }
        var11.field2865 = arg8;
        var11.field2871 = arg0;
        var11.field2868 = arg3;
        var11.field2863 = arg4;
        var11.field2859 = arg7;
        if (arg2 != 8) {
            method469(-42);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lga;BLga;)V")
    public static final void method464(class58 arg0, byte arg1, class58 arg2) {
        field1491++;
        class122.field2445 = arg2;
        if (arg1 <= -25) {
            class27.field483 = arg0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[IZI[I)V")
    public final void method465(byte arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class180.field3584; var7++) {
                    class28 var8 = class127.method819(107, var7);
                    if (var8 != null && !var8.field491 && var6 + (arg2 ? 7 : 0) == var8.field512) {
                        arg4[class21.field356[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1499 = arg4;
        this.field1493 = arg1;
        field1479++;
        this.field1477 = arg3;
        this.field1495 = arg2;
        this.method472(arg0 ^ 0xFFFFFF9A);
        if (arg0 != 61) {
            this.method461(false, -21, false);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lwf;II)Lw;")
    public final class199 method466(class205 arg0, int arg1, int arg2) {
        field1500++;
        if (this.field1477 != -1) {
            return class2.method7(false, this.field1477).method374(-1, arg2, arg0);
        }
        if (arg1 <= 45) {
            method470(-123);
        }
        class199 var4 = (class199) class159.field3217.method1106(100, this.field1483);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1499[var6];
                if (var15 >= 256 && var15 < 512 && !class127.method819(-76, var15 - 256).method132((byte) -38)) {
                    var5 = true;
                }
                if (var15 >= 512 && !class2.method18(var15 - 512, 0).method291(-22, this.field1495)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class169[] var8 = new class169[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1499[var9];
                if (var12 >= 256 && var12 < 512) {
                    class169 var13 = class127.method819(-26, var12 - 256).method134((byte) 122);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
                if (var12 >= 512) {
                    class169 var14 = class2.method18(var12 - 512, 0).method289(this.field1495, true);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                }
            }
            class169 var10 = new class169(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class44.field869[var11].length > this.field1493[var11]) {
                    var10.method1059(class131.field2747[var11], class44.field869[var11][this.field1493[var11]]);
                }
                if (class133.field2767[var11].length > this.field1493[var11]) {
                    var10.method1059(class30.field570[var11], class133.field2767[var11][this.field1493[var11]]);
                }
            }
            var4 = var10.method1075(64, 768, -50, -10, -50, true, true);
            class159.field3217.method1107(this.field1483, var4, -122);
        }
        if (arg0 != null) {
            var4 = arg0.method1320(var4, (byte) -57, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I")
    public final int method467(byte arg0) {
        field1481++;
        if (arg0 != -63) {
            this.field1495 = false;
        }
        return this.field1477 == -1 ? (this.field1493[0] << 25) + (this.field1499[0] << 15) + (this.field1499[11] << 5) + (this.field1493[4] << 20) + (this.field1499[8] << 10) + this.field1499[1] : 305419896 - -class2.method7(false, this.field1477).field1183;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljg;B)V")
    public final void method468(class89 arg0, byte arg1) {
        field1480++;
        arg0.method539(this.field1495 ? 1 : 0, 27678);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1499[class21.field356[var3]];
            if (var5 == 0) {
                arg0.method539(-1, 27678);
            } else {
                arg0.method539(var5 - 256, 27678);
            }
        }
        int var4 = 0;
        if (arg1 < -45) {
            while (var4 < 5) {
                arg0.method539(this.field1493[var4], 27678);
                var4++;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method469(int arg0) {
        field1498 = null;
        field1482 = null;
        field1478 = null;
        field1492 = null;
        field1484 = null;
        if (arg0 != -8) {
            method463(59, -37, 8, 51, 42, 38, 101, -56, -86, 96);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)Z")
    public static final boolean method470(int arg0) {
        if (arg0 == 256) {
            field1486++;
            return class158.field3206 == 0 ? class38.field725.method711(0) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILwf;IILwf;)Lw;")
    public final class199 method471(int arg0, class205 arg1, int arg2, int arg3, class205 arg4) {
        field1494++;
        if (this.field1477 != -1) {
            return class2.method7(false, this.field1477).method370((byte) 55, arg3, arg0, arg4, arg1);
        }
        long var6 = this.field1483;
        int[] var8 = this.field1499;
        if (arg4 != null && (arg4.field4001 >= 0 || arg4.field4009 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1499[var9];
            }
            if (arg4.field4001 >= 0) {
                var6 += arg4.field4001 - this.field1499[5] << 8;
                var8[5] = arg4.field4001;
            }
            if (arg4.field4009 >= 0) {
                var6 += arg4.field4009 - this.field1499[3] << 16;
                var8[3] = arg4.field4009;
            }
        }
        class199 var10 = (class199) class194.field3788.method1106(100, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class127.method819(117, var21 - 256).method136(5497)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class2.method18(var21 - 512, 0).method281(true, this.field1495)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1501 != -1L) {
                    var10 = (class199) class194.field3788.method1106(100, this.field1501);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class169[] var13 = new class169[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class169 var19 = class127.method819(126, var18 - 256).method138(101);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class169 var20 = class2.method18(var18 - 512, arg2 + 6).method284((byte) -35, this.field1495);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class169 var16 = new class169(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field1493[var17] < class44.field869[var17].length) {
                        var16.method1059(class131.field2747[var17], class44.field869[var17][this.field1493[var17]]);
                    }
                    if (this.field1493[var17] < class133.field2767[var17].length) {
                        var16.method1059(class30.field570[var17], class133.field2767[var17][this.field1493[var17]]);
                    }
                }
                var10 = var16.method1075(64, 850, -30, -50, -30, true, true);
                class194.field3788.method1107(var6, var10, 114);
                this.field1501 = var6;
            }
        }
        if (arg4 == null && arg1 == null) {
            return var10;
        }
        class199 var22;
        if (arg4 != null && arg1 != null) {
            var22 = arg4.method1321(arg1, arg3, arg0, var10, (byte) -126);
        } else if (arg4 == null) {
            var22 = arg1.method1322(var10, arg3, (byte) -92);
        } else {
            var22 = arg4.method1322(var10, arg0, (byte) -107);
        }
        return arg2 == -6 ? var22 : null;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    private final void method472(int arg0) {
        field1489++;
        int var2 = this.field1499[5];
        int var3 = this.field1499[9];
        long var4 = this.field1483;
        this.field1499[5] = var3;
        this.field1499[9] = var2;
        this.field1483 = 0L;
        if (arg0 >= -73) {
            this.method473(-54, false, 102);
        }
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1483 <<= 0x4;
            if (this.field1499[var6] >= 256) {
                this.field1483 += this.field1499[var6] - 256;
            }
        }
        if (this.field1499[0] >= 256) {
            this.field1483 += this.field1499[0] - 256 >> 4;
        }
        if (this.field1499[1] >= 256) {
            this.field1483 += this.field1499[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1483 <<= 0x3;
            this.field1483 += this.field1493[var7];
        }
        this.field1483 <<= 0x1;
        this.field1499[5] = var2;
        this.field1499[9] = var3;
        this.field1483 += this.field1495 ? 1 : 0;
        if (var4 != 0L && this.field1483 != var4) {
            class194.field3788.method1102(var4, -1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        field1487++;
        if (arg0 == arg2 && this.field1495) {
            return;
        }
        int var4 = this.field1499[class21.field356[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class28 var5;
        do {
            if (arg1) {
                var4++;
                if (class180.field3584 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class180.field3584 - 1;
                }
            }
            var5 = class127.method819(114, var4);
        } while (var5 == null || var5.field491 || var5.field512 != (this.field1495 ? 7 : 0) + arg0);
        this.field1499[class21.field356[arg0]] = var4 + 256;
        this.method472(-105);
    }
}
