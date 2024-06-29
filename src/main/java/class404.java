import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class404 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lhq;")
    private class158 field5500 = null;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lrw;")
    private class754 field5525;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "Z")
    private boolean field5530;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public int field5531;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "[Ljava/lang/Object;")
    private Object[] field5532;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field5510;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 4)
    private final boolean method2460(String arg0, String arg1, int arg2) {
        field5522++;
        if (!this.method2468(36)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        int var5 = -120 % ((arg2 + 29) / 34);
        String var6 = arg0.toLowerCase();
        int var7 = this.field5500.field1740.method2800(class598.method3407(var4, true), -110);
        if (this.method2483(var7, (byte) -62)) {
            int var8 = this.field5500.field1738[var7].method2800(class598.method3407(var6, true), -97);
            return this.method2493(var7, var8, (byte) -99);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B[III)Z", line = 30)
    private final boolean method2461(byte arg0, int[] arg1, int arg2, int arg3) {
        field5505++;
        if (!this.method2483(arg2, (byte) -115)) {
            return false;
        } else if (this.field5532[arg2] == null) {
            return false;
        } else {
            int var5 = this.field5500.field1736[arg2];
            int[] var6 = this.field5500.field1747[arg2];
            if (this.field5510[arg2] == null) {
                this.field5510[arg2] = new Object[this.field5500.field1756[arg2]];
            }
            Object[] var7 = this.field5510[arg2];
            boolean var8 = true;
            int var9 = 122 / ((arg0 + 49) / 40);
            for (int var10 = 0; var10 < var5; var10++) {
                int var11;
                if (var6 == null) {
                    var11 = var10;
                } else {
                    var11 = var6[var10];
                }
                if (var7[var11] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var12;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var12 = class511.method3018((byte) -72, this.field5532[arg2], true);
                class244 var13 = new class244(var12);
                var13.method1420(5, arg1, var13.field2912.length, (byte) -106);
            } else {
                var12 = class511.method3018((byte) -72, this.field5532[arg2], false);
            }
            byte[] var14;
            try {
                var14 = class325.method1938((byte) 112, var12);
            } catch (RuntimeException var50) {
                throw class590.method3380(var50, "T3 - " + (arg1 != null) + "," + arg2 + "," + var12.length + "," + class743.method4137(var12, var12.length, true) + "," + class743.method4137(var12, var12.length - 2, true) + "," + this.field5500.field1750[arg2] + "," + this.field5500.field1745);
            }
            if (this.field5530) {
                this.field5532[arg2] = null;
            }
            if (var5 <= 1) {
                int var49;
                if (var6 == null) {
                    var49 = 0;
                } else {
                    var49 = var6[0];
                }
                if (this.field5531 == 0) {
                    var7[var49] = class389.method2398(var14, false, 0);
                } else {
                    var7[var49] = var14;
                }
            } else if (this.field5531 == 2) {
                int var16 = var14.length;
                int var51 = var16 - 1;
                int var17 = var14[var51] & 0xFF;
                int var18 = var51 - var17 * 4 * var5;
                class244 var19 = new class244(var14);
                int var20 = 0;
                var19.field2903 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method1438(125);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg3 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                var19.field2903 = var18;
                int var27 = 0;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method1438(88);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg3 == var32) {
                            class143.method894(var14, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var14.length;
                int var52 = var33 - 1;
                int var34 = var14[var52] & 0xFF;
                int var35 = var52 - var34 * 4 * var5;
                class244 var36 = new class244(var14);
                int[] var37 = new int[var5];
                var36.field2903 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method1438(120);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field2903 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method1438(100);
                        class143.method894(var14, var43, var41[var46], var37[var46], var45);
                        var37[var46] += var45;
                        var43 += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field5531 == 0) {
                        var7[var48] = class389.method2398(var41[var47], false, 0);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 315)
    public final boolean method2462(String arg0, String arg1, int arg2) {
        field5506++;
        if (!this.method2468(-115)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field5500.field1740.method2800(class598.method3407(var4, true), -110);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field5500.field1738[var6].method2800(class598.method3407(var5, true), arg2 - 109);
            return arg2 >= ~var7;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Z", line = 342)
    public final boolean method2463(byte arg0, int arg1) {
        if (arg0 <= 89) {
            this.field5500 = null;
        }
        field5537++;
        if (!this.method2468(99)) {
            return false;
        } else if (this.field5500.field1756.length == 1) {
            return this.method2493(0, arg1, (byte) -127);
        } else if (!this.method2483(arg1, (byte) -54)) {
            return false;
        } else if (this.field5500.field1756[arg1] == 1) {
            return this.method2493(arg1, 0, (byte) -96);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 375)
    public final void method2464(byte arg0, String arg1) {
        if (arg0 > -18) {
            this.field5532 = null;
        }
        field5517++;
        if (this.method2468(55)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field5500.field1740.method2800(class598.method3407(var3, true), -90);
            this.method2465(-105, var4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 397)
    private final void method2465(int arg0, int arg1) {
        int var3 = 124 % ((-arg0 - 41) / 46);
        this.field5525.method2140(arg1, (byte) -128);
        field5508++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 408)
    public final boolean method2466(String arg0, int arg1) {
        field5504++;
        if (!this.method2468(44)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 > -110) {
            this.field5530 = true;
        }
        int var4 = this.field5500.field1740.method2800(class598.method3407(var3, true), -95);
        return this.method2491((byte) 64, var4);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V", line = 430)
    private final void method2467(int arg0, int arg1) {
        field5509++;
        if (this.field5530) {
            this.field5532[arg0] = this.field5525.method2139((byte) -107, arg0);
        } else {
            this.field5532[arg0] = class389.method2398(this.field5525.method2139((byte) -125, arg0), false, arg1 - 2);
        }
        if (arg1 != 2) {
            this.method2483(66, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Z", line = 446)
    private final boolean method2468(int arg0) {
        field5515++;
        int var2 = -86 / ((-arg0 - 44) / 57);
        if (this.field5500 == null) {
            this.field5500 = this.field5525.method2135(true);
            if (this.field5500 == null) {
                return false;
            }
            this.field5510 = new Object[this.field5500.field1748][];
            this.field5532 = new Object[this.field5500.field1748];
        }
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 468)
    public final boolean method2469(int arg0, String arg1) {
        field5507++;
        if (!this.method2468(-121)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field5500.field1740.method2800(class598.method3407(var3, true), -91);
        if (arg0 == -26492) {
            return var4 >= 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(BI)[I", line = 492)
    public final int[] method2470(byte arg0, int arg1) {
        field5534++;
        if (!this.method2483(arg1, (byte) -90)) {
            return null;
        }
        int var3 = 8 / ((-arg0 - 38) / 56);
        int[] var4 = this.field5500.field1747[arg1];
        if (var4 == null) {
            var4 = new int[this.field5500.field1736[arg1]];
            int var5 = 0;
            while (var4.length > var5) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B", line = 519)
    public final byte[] method2471(byte arg0, String arg1, String arg2) {
        field5516++;
        if (!this.method2468(15)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (arg0 > -37) {
            this.field5500 = null;
        }
        int var6 = this.field5500.field1740.method2800(class598.method3407(var4, true), -101);
        if (this.method2483(var6, (byte) -64)) {
            int var7 = this.field5500.field1738[var6].method2800(class598.method3407(var5, true), -79);
            return this.method2481(var6, var7, (byte) 119);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[B", line = 545)
    public final byte[] method2472(boolean arg0, int arg1) {
        field5511++;
        if (!this.method2468(15)) {
            return null;
        } else if (arg0) {
            return null;
        } else if (this.field5500.field1756.length == 1) {
            return this.method2481(0, arg1, (byte) 124);
        } else if (!this.method2483(arg1, (byte) -60)) {
            return null;
        } else if (this.field5500.field1756[arg1] == 1) {
            return this.method2481(arg1, 0, (byte) 116);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(BLjava/lang/String;)Z", line = 577)
    public final boolean method2473(byte arg0, String arg1) {
        if (arg0 < 6) {
            return true;
        } else {
            field5521++;
            int var3 = this.method2474(55, "");
            return var3 == -1 ? this.method2460("", arg1, -100) : this.method2460(arg1, "", -74);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(ILjava/lang/String;)I", line = 593)
    public final int method2474(int arg0, String arg1) {
        field5524++;
        if (this.method2468(15)) {
            int var3 = -105 / ((-arg0 - 41) / 61);
            String var4 = arg1.toLowerCase();
            int var5 = this.field5500.field1740.method2800(class598.method3407(var4, true), -119);
            return this.method2483(var5, (byte) -80) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)I", line = 619)
    private final int method2475(int arg0, int arg1) {
        field5501++;
        if (!this.method2483(arg1, (byte) -71)) {
            return 0;
        } else if (arg0 > -81) {
            return 29;
        } else if (this.field5532[arg1] == null) {
            return this.field5525.method2136(arg1, (byte) -89);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 641)
    public final int method2476(boolean arg0, String arg1) {
        field5538++;
        if (!this.method2468(-116)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            this.method2463((byte) -64, -52);
        }
        int var4 = this.field5500.field1740.method2800(class598.method3407(var3, true), -108);
        return this.method2475(-120, var4);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;IZI)V", line = 663)
    public static final void method2477(String arg0, int arg1, boolean arg2, int arg3) {
        field5518++;
        class190.method1160(80);
        class43.method251(9);
        class491.method2952((byte) 79);
        if (arg3 > -24) {
            return;
        }
        class36.method166(arg2, arg1, (byte) -106, arg0);
        class402.method2452(-42);
        class132.method836(class275.field3370, (byte) -57);
        class165.method1031(class275.field3370, 0);
        class667.method3791(class394.field5410, 0, class275.field3370);
        class300.method1773(-9);
        class634.method3640(-21722, class323.field4118);
        class486.method2933(true);
        class598.method3406((byte) 121);
        if (class392.field5397 == 3) {
            class313.method1860(true, 4);
        } else if (class392.field5397 == 7) {
            class313.method1860(true, 8);
        } else if (class392.field5397 == 10) {
            class313.method1860(true, 11);
        } else if (class392.field5397 == 1 || class392.field5397 == 2) {
            class223.method1295(106);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I", line = 701)
    public final int method2478(byte arg0) {
        int var2 = -14 % ((-arg0 - 10) / 35);
        field5529++;
        return this.method2468(102) ? this.field5500.field1756.length : -1;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)Z", line = 715)
    public final boolean method2479(byte arg0) {
        field5512++;
        if (!this.method2468(28)) {
            return false;
        }
        int var2 = 23 / ((-arg0 - 41) / 47);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field5500.field1754.length; var4++) {
            int var5 = this.field5500.field1754[var4];
            if (this.field5532[var5] == null) {
                this.method2467(var5, 2);
                if (this.field5532[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)I", line = 750)
    public final int method2480(int arg0, int arg1) {
        field5526++;
        if (!this.method2468(-103)) {
            return -1;
        }
        int var3 = this.field5500.field1740.method2800(arg1, -84);
        if (this.method2483(var3, (byte) -86)) {
            if (arg0 >= -23) {
                this.field5530 = false;
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIB)[B", line = 770)
    public final byte[] method2481(int arg0, int arg1, byte arg2) {
        if (arg2 <= 99) {
            this.field5525 = null;
        }
        field5528++;
        return this.method2490(-23746, arg1, arg0, null);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(II)I", line = 789)
    public final int method2482(int arg0, int arg1) {
        field5523++;
        if (this.method2483(arg1, (byte) -69)) {
            if (arg0 != 0) {
                this.field5525 = null;
            }
            return this.field5500.field1756[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Z", line = 803)
    private final boolean method2483(int arg0, byte arg1) {
        if (arg1 > -38) {
            this.method2461((byte) -30, null, -58, -120);
        }
        field5503++;
        if (!this.method2468(127)) {
            return false;
        } else if (arg0 >= 0 && this.field5500.field1756.length > arg0 && this.field5500.field1756[arg0] != 0) {
            return true;
        } else if (class387.field5368) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(ZI)V", line = 828)
    public final void method2484(boolean arg0, int arg1) {
        field5499++;
        if (!this.method2483(arg1, (byte) -93)) {
            return;
        }
        if (!arg0) {
            this.field5525 = null;
        }
        if (this.field5510 != null) {
            this.field5510[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZB)V", line = 848)
    public final void method2485(boolean arg0, boolean arg1, byte arg2) {
        field5520++;
        if (!this.method2468(114)) {
            return;
        }
        if (arg2 > -119) {
            this.method2493(48, 78, (byte) -82);
        }
        if (arg1) {
            this.field5500.field1738 = null;
            this.field5500.field1746 = null;
        }
        if (arg0) {
            this.field5500.field1751 = null;
            this.field5500.field1740 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z", line = 879)
    private final boolean method2486(int arg0, int arg1, int arg2) {
        field5533++;
        if (!this.method2468(63)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field5500.field1756.length && this.field5500.field1756[arg0] > arg1) {
            int var4 = -7 % ((33 - arg2) / 58);
            return true;
        } else if (class387.field5368) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I", line = 903)
    public final int method2487(int arg0) {
        if (arg0 >= -95) {
            return -38;
        }
        field5514++;
        if (!this.method2468(-102)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5532.length; var4++) {
            if (this.field5500.field1736[var4] > 0) {
                var3 += this.method2475(-119, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 941)
    public final void method2488(int arg0) {
        field5519++;
        if (arg0 > -106) {
            this.method2465(39, -55);
        }
        if (this.field5532 != null) {
            for (int var2 = 0; var2 < this.field5532.length; var2++) {
                this.field5532[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I", line = 964)
    public final int method2489(int arg0) {
        field5535++;
        if (!this.method2468(arg0 ^ 0xFFFFFF88)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 4) {
            this.method2467(126, -85);
        }
        return this.field5500.field1745;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III[I)[B", line = 980)
    public final byte[] method2490(int arg0, int arg1, int arg2, int[] arg3) {
        field5502++;
        if (!this.method2486(arg2, arg1, -32)) {
            return null;
        }
        if (this.field5510[arg2] == null || this.field5510[arg2][arg1] == null) {
            boolean var5 = this.method2461((byte) 11, arg3, arg2, arg1);
            if (!var5) {
                this.method2467(arg2, 2);
                boolean var6 = this.method2461((byte) 52, arg3, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class511.method3018((byte) -72, this.field5510[arg2][arg1], false);
        if (arg0 != -23746) {
            this.method2473((byte) -116, null);
        }
        if (this.field5531 == 1) {
            this.field5510[arg2][arg1] = null;
            if (this.field5500.field1756[arg2] == 1) {
                this.field5510[arg2] = null;
            }
        } else if (this.field5531 == 2) {
            this.field5510[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(BI)Z", line = 1028)
    public final boolean method2491(byte arg0, int arg1) {
        field5513++;
        if (arg0 != 64) {
            this.field5530 = true;
        }
        if (!this.method2483(arg1, (byte) -117)) {
            return false;
        } else if (this.field5532[arg1] == null) {
            this.method2467(arg1, 2);
            return this.field5532[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 1055)
    public final void method2492(byte arg0) {
        field5536++;
        if (arg0 <= 58) {
            this.method2490(-15, -53, -99, null);
        }
        if (this.field5510 != null) {
            for (int var2 = 0; var2 < this.field5510.length; var2++) {
                this.field5510[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIB)Z", line = 1079)
    public final boolean method2493(int arg0, int arg1, byte arg2) {
        field5527++;
        if (arg2 > -60) {
            return true;
        } else if (!this.method2486(arg0, arg1, 94)) {
            return false;
        } else if (this.field5510[arg0] != null && this.field5510[arg0][arg1] != null) {
            return true;
        } else if (this.field5532[arg0] == null) {
            this.method2467(arg0, 2);
            return this.field5532[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lrw;ZI)V", line = 1109)
    public class404(class754 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field5525 = arg0;
        this.field5530 = arg1;
        this.field5531 = arg2;
    }
}
