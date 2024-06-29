import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class624 extends class377 {

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    private int field8465 = 204;

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
    private int field8469 = 4;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    private int field8459 = 0;

    @OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
    private int field8468 = 1024;

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    private int field8466 = 409;

    @OriginalMember(owner = "client!gba", name = "R", descriptor = "I")
    private int field8476 = 81;

    @OriginalMember(owner = "client!gba", name = "O", descriptor = "I")
    private int field8474 = 1024;

    @OriginalMember(owner = "client!gba", name = "T", descriptor = "I")
    private int field8478 = 8;

    @OriginalMember(owner = "client!gba", name = "P", descriptor = "[F")
    public static float[] field8475 = new float[4];

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!gba", name = "C", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!gba", name = "K", descriptor = "I")
    private int field8470;

    @OriginalMember(owner = "client!gba", name = "L", descriptor = "I")
    private int field8471;

    @OriginalMember(owner = "client!gba", name = "N", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!gba", name = "S", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!gba", name = "U", descriptor = "I")
    private int field8479;

    @OriginalMember(owner = "client!gba", name = "M", descriptor = "[I")
    private int[] field8472;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "[[I")
    private int[][] field8461;

    @OriginalMember(owner = "client!gba", name = "D", descriptor = "[[I")
    private int[][] field8463;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field8468 = arg2.method3031(-1);
                                    }
                                } else {
                                    this.field8476 = arg2.method3031(-1);
                                }
                            } else {
                                this.field8459 = arg2.method3031(-1);
                            }
                        } else {
                            this.field8474 = arg2.method3031(-1);
                        }
                    } else {
                        this.field8465 = arg2.method3031(-1);
                    }
                } else {
                    this.field8466 = arg2.method3031(-1);
                }
            } else {
                this.field8478 = arg2.method3097((byte) 12);
            }
        } else {
            this.field8469 = arg2.method3097((byte) 12);
        }
        ++field8464;
        int var5 = 32 % ((arg1 - 13) / 55);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        int var3 = -123 / ((5 - arg1) / 53);
        ++field8462;
        int[] var4 = super.field4842.method2772(arg0, (byte) -124);
        if (super.field4842.field6354) {
            int var5 = 0;
            int var6;
            for (var6 = class596.field8003[arg0] + this.field8459; var6 < 0; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (var5 < this.field8478 && ~var6 <= ~this.field8472[var5]) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = ~(var5 & 1) == -1;
            int var9 = this.field8472[var5];
            int var10 = this.field8472[var5 - 1];
            if (~(this.field8471 + var10) > ~var6 && ~var6 > ~(-this.field8471 + var9)) {
                for (int var11 = 0; class528.field6661 > var11; ++var11) {
                    int var12 = !var8 ? -this.field8474 : this.field8474;
                    int var13 = 0;
                    int var14;
                    for (var14 = (this.field8479 * var12 >> 12) + class136.field1654[var11]; ~var14 > -1; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (~this.field8469 < ~var13 && this.field8461[var7][var13] <= var14) {
                        ++var13;
                    }
                    int var15 = var13 + -1;
                    int var16 = this.field8461[var7][var15];
                    int var17 = this.field8461[var7][var13];
                    if (this.field8471 + var16 < var14 && -this.field8471 + var17 > var14) {
                        var4[var11] = this.field8463[var7][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class70.method558(var4, 0, class528.field6661, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "(I)V")
    private final void method3474(int arg0) {
        ++field8477;
        Random var2 = new Random((long) this.field8478);
        this.field8471 = this.field8476 / 2;
        this.field8470 = 4096 / this.field8478;
        this.field8479 = 4096 / this.field8469;
        if (arg0 < 80) {
            this.method91((byte) 98);
        }
        int var3 = this.field8479 / 2;
        this.field8463 = new int[this.field8478][this.field8469];
        this.field8472 = new int[this.field8478 + 1];
        int var4 = this.field8470 / 2;
        this.field8461 = new int[this.field8478][this.field8469 + 1];
        this.field8472[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field8478; ++var5) {
            if (var5 > 0) {
                int var6 = this.field8470;
                int var7 = (class396.method2241(0, 4096, var2) + -2048) * this.field8465 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field8472[var5] = this.field8472[var5 + -1] - -var8;
            }
            this.field8461[var5][0] = 0;
            for (int var9 = 0; this.field8469 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field8479;
                    int var11 = (class396.method2241(0, 4096, var2) + -2048) * this.field8466 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field8461[var5][var9] = this.field8461[var5][var9 + -1] + var12;
                }
                this.field8463[var5][var9] = this.field8468 > 0 ? 4096 - class396.method2241(0, this.field8468, var2) : 4096;
            }
            this.field8461[var5][this.field8469] = 4096;
        }
        this.field8472[this.field8478] = 4096;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IJ)V")
    public static final void method3475(int arg0, long arg1) {
        ++field8467;
        class124 var3 = class590.method3275(55);
        var3.field1516.method3090(class295.field3753.field7095, 3);
        var3.field1516.method3047(true, arg1);
        var3.field1516.method3090(class71.field912, 3);
        class197.method1156((byte) 124, var3);
        class478.field5958 = 0;
        class303.field3848 = 1;
        class389.field4992 = -3;
        class398.field5059 = 0;
        if (arg0 < 24) {
            field8475 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        if (arg0 <= 52) {
            this.method91((byte) -80);
        }
        this.method3474(102);
        ++field8460;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class624() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
    public static void method3476(boolean arg0) {
        field8475 = null;
        if (!arg0) {
            field8475 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "(I)Z")
    public static final boolean method3477(int arg0) throws IOException {
        ++field8473;
        if (class335.field4139 == null) {
            return false;
        } else {
            if (class613.field8339 == null) {
                if (class162.field1916) {
                    if (!class335.field4139.method2514(arg0 + -32, 1)) {
                        return false;
                    }
                    class335.field4139.method2513((byte) -128, 1, 0, class222.field2585.field7318);
                    ++class505.field6315;
                    class295.field3741 = 0;
                    class162.field1916 = false;
                }
                class222.field2585.field7313 = 0;
                if (class222.field2585.method3586(-30965)) {
                    if (!class335.field4139.method2514(-1, 1)) {
                        return false;
                    }
                    class335.field4139.method2513((byte) -114, 1, 1, class222.field2585.field7318);
                    class295.field3741 = 0;
                    ++class505.field6315;
                }
                class162.field1916 = true;
                class675[] var1 = class501.method2726(3063);
                int var2 = class222.field2585.method3574(arg0 + -160);
                if (~var2 > -1 || var2 >= var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class222.field2585.field7313);
                }
                class613.field8339 = var1[var2];
                class10.field100 = class613.field8339.field9217;
            }
            if (~class10.field100 == 0) {
                if (!class335.field4139.method2514(-1, 1)) {
                    return false;
                }
                class335.field4139.method2513((byte) -121, 1, 0, class222.field2585.field7318);
                class295.field3741 = 0;
                ++class505.field6315;
                class10.field100 = 255 & class222.field2585.field7318[0];
            }
            if (~class10.field100 == 1) {
                if (!class335.field4139.method2514(-1, 2)) {
                    return false;
                }
                class335.field4139.method2513((byte) -114, 2, 0, class222.field2585.field7318);
                class222.field2585.field7313 = 0;
                class10.field100 = class222.field2585.method3031(-1);
                class505.field6315 += 2;
                class295.field3741 = 0;
            }
            if (class10.field100 > 0) {
                if (!class335.field4139.method2514(-1, class10.field100)) {
                    return false;
                }
                class222.field2585.field7313 = 0;
                class335.field4139.method2513((byte) -108, class10.field100, 0, class222.field2585.field7318);
                class295.field3741 = 0;
                class505.field6315 += class10.field100;
            }
            class660.field8961 = class610.field8305;
            class610.field8305 = class531.field6702;
            class531.field6702 = class613.field8339;
            if (class710.field9920 == class613.field8339) {
                int var3 = class222.field2585.method3054(-2);
                int var4 = class222.field2585.method3096(-24);
                String var5 = class222.field2585.method3072(arg0 ^ 224);
                if (class563.method2992(true, var4)) {
                    class25.method160((byte) 93, var3, var5);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class364.field4664) {
                String var6 = class222.field2585.method3072(arg0 + 224);
                int var7 = class222.field2585.method3031(-1);
                String var8 = class471.field5810.method3267(var7, 116).method3730(class222.field2585, arg0 ^ 31);
                class518.method2812(var8, var6, var6, 0, var7, (String) null, arg0 + -7, var6, 19);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class484.field6017) {
                class79.method612(class356.field4592, -117);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class365.field4707) {
                int var9 = class222.field2585.method3084((byte) 78);
                int var10 = class222.field2585.method3094((byte) 100);
                class327.field4084.method310(var9, var10, true);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class586.field7867) {
                class536.field6753 = class222.field2585.method3086(65280);
                class278.field3536 = class696.field9643;
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class3.field21) {
                int var11 = class222.field2585.method3033((byte) 91);
                int var12 = class222.field2585.method3064(arg0 ^ -2031091481);
                int var13 = class222.field2585.method3097((byte) 12);
                String var14 = "";
                String var15 = var14;
                if (~(1 & var13) != -1) {
                    var14 = class222.field2585.method3072(255);
                    if ((2 & var13) == 0) {
                        var15 = var14;
                    } else {
                        var15 = class222.field2585.method3072(255);
                    }
                }
                String var16 = class222.field2585.method3072(255);
                if (~var11 == -100) {
                    class8.method28(arg0 + -32, var16);
                } else {
                    if (!var15.equals("") && class366.method2133((byte) 59, var15)) {
                        class613.field8339 = null;
                        return true;
                    }
                    class417.method2324(var14, var15, var14, var16, var12, (byte) -95, var11);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class288.field3642) {
                int var17 = class222.field2585.method3031(-1);
                String var18 = class222.field2585.method3072(255);
                Object[] var19 = new Object[var18.length() - -1];
                for (int var20 = var18.length() + -1; var20 >= 0; --var20) {
                    if (~var18.charAt(var20) == -116) {
                        var19[var20 + 1] = class222.field2585.method3072(255);
                    } else {
                        var19[var20 + 1] = new Integer(class222.field2585.method3064(-2031091464));
                    }
                }
                var19[0] = new Integer(class222.field2585.method3064(-2031091464));
                if (class563.method2992(true, var17)) {
                    class402 var21 = new class402();
                    var21.field5153 = var19;
                    class620.method3450(var21);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class593.field7958) {
                int var22 = class222.field2585.method3031(arg0 + -32);
                int var23 = class222.field2585.method3068((byte) -111);
                if (class563.method2992(true, var22)) {
                    class525.field6638 = var23;
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class341.field4348) {
                class79.method612(class175.field2049, -114);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class555.field6940) {
                int var24 = class222.field2585.method3054(-2);
                int var25 = class222.field2585.method3040(-16777216);
                int var26 = class222.field2585.method3086(65280);
                if (class563.method2992(true, var24)) {
                    class50.method295(var25, 16568, var26);
                }
                class613.field8339 = null;
                return true;
            } else if (class645.field8743 == class613.field8339) {
                int var27 = class222.field2585.method3040(arg0 + -16777247);
                int var28 = class222.field2585.method3031(-1);
                int var29 = class222.field2585.method3064(-2031091464);
                if (class563.method2992(true, var28)) {
                    class293 var30 = (class293) class216.field2530.method3828((long) var27, (byte) -91);
                    class293 var31 = (class293) class216.field2530.method3828((long) var29, (byte) -91);
                    if (var31 != null) {
                        class190.method1128(false, arg0 + -125, var30 == null || ~var30.field3727 != ~var31.field3727, var31);
                    }
                    if (var30 != null) {
                        var30.method1566(-62);
                        class216.field2530.method3832(var30, (long) var29, arg0 + 23);
                    }
                    class337 var32 = class442.method2421(var27, 78);
                    if (var32 != null) {
                        class99.method721((byte) -25, var32);
                    }
                    class337 var33 = class442.method2421(var29, 61);
                    if (var33 != null) {
                        class99.method721((byte) 119, var33);
                        class480.method2620(true, var33, arg0 + -32);
                    }
                    if (~class305.field3866 != 0) {
                        class654.method3657(class305.field3866, true, 1);
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class439.field5528) {
                int var34 = class222.field2585.method3096(-98);
                int var35 = class222.field2585.method3094((byte) 100);
                int var36 = class222.field2585.method3031(-1);
                int var37 = class222.field2585.method3054(-2);
                int var38 = class222.field2585.method3031(arg0 + -32);
                if (class563.method2992(true, var34)) {
                    class683.method3774(var35, var38, 7, 4, var36 | var37 << 16);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class496.field6200) {
                int var39 = class222.field2585.method3096(-112);
                int var40 = class222.field2585.method3054(arg0 + -33);
                int var41 = class222.field2585.method3096(-91);
                int var42 = class222.field2585.method3084((byte) 84);
                int var43 = class222.field2585.method3040(arg0 ^ -16777185);
                if (class563.method2992(true, var40)) {
                    class558.method2972(var41, var43, (byte) -80, var42, var39);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class24.field274) {
                class327.field4084.method302((byte) 77);
                class175.field2050 += 32;
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class479.field5960) {
                class564.method2996(class10.field100, class222.field2585, (byte) -121, class386.field4955);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class513.field6432) {
                boolean var44 = class222.field2585.method3097((byte) 12) == 1;
                String var45 = class222.field2585.method3072(255);
                String var46 = var45;
                if (var44) {
                    var46 = class222.field2585.method3072(255);
                }
                int var47 = class222.field2585.method3097((byte) 12);
                boolean var48 = false;
                if (~var47 >= -2) {
                    if ((!class701.field9811 || class493.field6149) && !class165.field1938) {
                        if (~var47 >= -2 && class366.method2133((byte) 85, var46)) {
                            var48 = true;
                        }
                    } else {
                        var48 = true;
                    }
                }
                if (!var48 && ~class148.field1765 == -1) {
                    String var49 = class424.method2340(0, class75.method600((byte) -117, class222.field2585));
                    if (var47 == 2) {
                        class518.method2812(var49, "<img=1>" + var46, "<img=1>" + var45, 0, -1, (String) null, 24, var45, 24);
                    } else if (~var47 != -2) {
                        class518.method2812(var49, var46, var45, 0, -1, (String) null, 24, var45, 24);
                    } else {
                        class518.method2812(var49, "<img=0>" + var46, "<img=0>" + var45, 0, -1, (String) null, arg0 + -7, var45, 24);
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class28.field336) {
                if (class411.method2307(class470.field5804, 8)) {
                    class675.field9221 = (int) (2.5F * (float) class222.field2585.method3031(-1));
                } else {
                    class675.field9221 = class222.field2585.method3031(arg0 ^ -32) * 30;
                }
                class278.field3536 = class696.field9643;
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class403.field5192) {
                int var50 = class222.field2585.method3031(-1);
                int var51 = class222.field2585.method3064(arg0 + -2031091495);
                if (class563.method2992(true, var50)) {
                    class293 var52 = (class293) class216.field2530.method3828((long) var51, (byte) -91);
                    if (var52 != null) {
                        class190.method1128(false, arg0 ^ -121, true, var52);
                    }
                    if (class83.field1066 != null) {
                        class99.method721((byte) 125, class83.field1066);
                        class83.field1066 = null;
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class688.field9484 == class613.field8339) {
                int var53 = class222.field2585.method3097((byte) 12);
                boolean var54 = (var53 & 1) == 1;
                String var55 = class222.field2585.method3072(255);
                String var56 = class222.field2585.method3072(255);
                if (var56.equals("")) {
                    var56 = var55;
                }
                String var57 = class222.field2585.method3072(255);
                String var58 = class222.field2585.method3072(255);
                if (var58.equals("")) {
                    var58 = var57;
                }
                if (!var54) {
                    class594.field7963[class189.field2253] = var55;
                    class204.field2368[class189.field2253] = var56;
                    class599.field8033[class189.field2253] = var57;
                    class200.field2328[class189.field2253] = var58;
                    class165.field1940[class189.field2253] = class109.method762(var53, 2) == 2;
                    ++class189.field2253;
                } else {
                    for (int var59 = 0; ~var59 > ~class189.field2253; ++var59) {
                        if (class204.field2368[var59].equals(var58)) {
                            class594.field7963[var59] = var55;
                            class204.field2368[var59] = var56;
                            class599.field8033[var59] = var57;
                            class200.field2328[var59] = var58;
                            break;
                        }
                    }
                }
                class613.field8339 = null;
                class78.field1019 = class696.field9643;
                return true;
            } else if (class613.field8339 == class243.field3143) {
                class182.field2140 = class696.field9643;
                if (~class10.field100 == -1) {
                    class136.field1664 = null;
                    class26.field311 = null;
                    class348.field4476 = 0;
                    class485.field6032 = null;
                    class613.field8339 = null;
                    return true;
                } else {
                    class26.field311 = class222.field2585.method3072(255);
                    boolean var60 = ~class222.field2585.method3097((byte) 12) == -2;
                    if (var60) {
                        class222.field2585.method3072(255);
                    }
                    long var61 = class222.field2585.method3046(false);
                    class136.field1664 = class182.method1086(var61, -30150);
                    class534.field6736 = class222.field2585.method3083(255);
                    int var63 = class222.field2585.method3097((byte) 12);
                    if (~var63 == -256) {
                        class613.field8339 = null;
                        return true;
                    } else {
                        class348.field4476 = var63;
                        class189[] var64 = new class189[100];
                        for (int var65 = 0; var65 < class348.field4476; ++var65) {
                            var64[var65] = new class189();
                            var64[var65].field2252 = class222.field2585.method3072(255);
                            boolean var71 = ~class222.field2585.method3097((byte) 12) == -2;
                            if (var71) {
                                var64[var65].field2254 = class222.field2585.method3072(255);
                            } else {
                                var64[var65].field2254 = var64[var65].field2252;
                            }
                            var64[var65].field2247 = class279.method1680(-2415, var64[var65].field2254);
                            var64[var65].field2249 = class222.field2585.method3031(-1);
                            var64[var65].field2251 = class222.field2585.method3083(255);
                            var64[var65].field2248 = class222.field2585.method3072(arg0 + 224);
                            if (var64[var65].field2254.equals(class67.field815.field4673)) {
                                class92.field1181 = var64[var65].field2251;
                            }
                        }
                        boolean var66 = false;
                        int var67 = class348.field4476;
                        while (var67 > 0) {
                            --var67;
                            boolean var68 = true;
                            for (int var69 = 0; var67 > var69; ++var69) {
                                if (~var64[var69].field2247.compareTo(var64[var69 + 1].field2247) < -1) {
                                    class189 var70 = var64[var69];
                                    var64[var69] = var64[var69 - -1];
                                    var64[var69 - -1] = var70;
                                    var68 = false;
                                }
                            }
                            if (var68) {
                                break;
                            }
                        }
                        class485.field6032 = var64;
                        class613.field8339 = null;
                        return true;
                    }
                }
            } else if (class613.field8339 == class364.field4658) {
                int var72 = class222.field2585.method3031(-1);
                int var73 = class222.field2585.method3097((byte) 12);
                int var74 = class222.field2585.method3097((byte) 12);
                int var75 = class222.field2585.method3031(-1) << 2;
                int var76 = class222.field2585.method3097((byte) 12);
                int var77 = class222.field2585.method3097((byte) 12);
                if (class563.method2992(true, var72)) {
                    class388.method2219(var75, var77, var73, var74, true, var76, (byte) -108);
                }
                class613.field8339 = null;
                return true;
            } else if (class644.field8736 == class613.field8339) {
                int var78 = class222.field2585.method3048((byte) 43);
                int var79 = class222.field2585.method3054(arg0 + -33);
                if (class563.method2992(true, var79)) {
                    class683.method3774(var78, -1, 3, 4, -1);
                }
                class613.field8339 = null;
                return true;
            } else if (class72.field935 == class613.field8339) {
                int var80 = class222.field2585.method3084((byte) 73);
                if (var80 == 65535) {
                    var80 = -1;
                }
                int var81 = class222.field2585.method3064(arg0 + -2031091495);
                int var82 = (919012555 & var81) >> 28;
                int var83 = (var81 & 268430548) >> 14;
                int var84 = 16383 & var81;
                int var85 = class222.field2585.method3076((byte) -39);
                int var86 = var85 >> 2;
                int var87 = 3 & var85;
                int var88 = var84 - class522.field6612;
                int var89 = var83 - class227.field2938;
                int var90 = class158.field1876[var86];
                class235.method1420(var88, var87, var86, var89, var90, var80, -3, var82);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class376.field4835) {
                class79.method612(class340.field4338, arg0 + -151);
                class613.field8339 = null;
                return true;
            } else if (class689.field9543 == class613.field8339) {
                boolean var91 = class222.field2585.method3097((byte) 12) == 1;
                String var92 = class222.field2585.method3072(255);
                String var93 = var92;
                if (var91) {
                    var93 = class222.field2585.method3072(arg0 ^ 224);
                }
                long var94 = class222.field2585.method3046(false);
                long var96 = (long) class222.field2585.method3031(-1);
                long var98 = (long) class222.field2585.method3059(1);
                int var100 = class222.field2585.method3097((byte) 12);
                long var101 = (var96 << 32) + var98;
                boolean var103 = false;
                int var104 = 0;
                while (true) {
                    if (var104 >= 100) {
                        if (var100 <= 1) {
                            if ((!class701.field9811 || class493.field6149) && !class165.field1938) {
                                if (class366.method2133((byte) 101, var93)) {
                                    var103 = true;
                                }
                            } else {
                                var103 = true;
                            }
                        }
                        break;
                    }
                    if (class146.field1750[var104] == var101) {
                        var103 = true;
                        break;
                    }
                    ++var104;
                }
                if (!var103 && class148.field1765 == 0) {
                    class146.field1750[class146.field1749] = var101;
                    class146.field1749 = (class146.field1749 - -1) % 100;
                    String var105 = class424.method2340(0, class75.method600((byte) -125, class222.field2585));
                    if (var100 != 2 && var100 != 3) {
                        if (var100 == 1) {
                            class518.method2812(var105, "<img=0>" + var93, "<img=0>" + var92, 0, -1, class396.method2240(var94, (byte) -124), 24, var92, 9);
                        } else {
                            class518.method2812(var105, var93, var92, 0, -1, class396.method2240(var94, (byte) -124), 24, var92, 9);
                        }
                    } else {
                        class518.method2812(var105, "<img=1>" + var93, "<img=1>" + var92, 0, -1, class396.method2240(var94, (byte) -127), arg0 + -7, var92, 9);
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class655.field8919 == class613.field8339) {
                boolean var106 = ~class222.field2585.method3097((byte) 12) == -2;
                String var107 = class222.field2585.method3072(255);
                String var108 = var107;
                if (var106) {
                    var108 = class222.field2585.method3072(255);
                }
                long var109 = class222.field2585.method3046(false);
                long var111 = (long) class222.field2585.method3031(-1);
                long var113 = (long) class222.field2585.method3059(1);
                int var115 = class222.field2585.method3097((byte) 12);
                int var116 = class222.field2585.method3031(-1);
                long var117 = (var111 << 32) - -var113;
                boolean var119 = false;
                int var120 = 0;
                while (true) {
                    if (~var120 <= -101) {
                        if (var115 <= 1 && class366.method2133((byte) 104, var108)) {
                            var119 = true;
                        }
                        break;
                    }
                    if (class146.field1750[var120] == var117) {
                        var119 = true;
                        break;
                    }
                    ++var120;
                }
                if (!var119 && class148.field1765 == 0) {
                    class146.field1750[class146.field1749] = var117;
                    class146.field1749 = (class146.field1749 + 1) % 100;
                    String var121 = class471.field5810.method3267(var116, 118).method3730(class222.field2585, 0);
                    if (var115 != 2) {
                        if (var115 != 1) {
                            class518.method2812(var121, var108, var107, 0, var116, class396.method2240(var109, (byte) -122), 24, var107, 20);
                        } else {
                            class518.method2812(var121, "<img=0>" + var108, "<img=0>" + var107, 0, var116, class396.method2240(var109, (byte) -122), arg0 + -7, var107, 20);
                        }
                    } else {
                        class518.method2812(var121, "<img=1>" + var108, "<img=1>" + var107, 0, var116, class396.method2240(var109, (byte) -122), 24, var107, 20);
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class219.field2550) {
                int var122 = class222.field2585.method3031(arg0 ^ -32);
                class365 var123;
                if (~class350.field4523 == ~var122) {
                    var123 = class67.field815;
                } else {
                    var123 = class132.field1601[var122];
                }
                if (var123 == null) {
                    class613.field8339 = null;
                    return true;
                } else {
                    int var124 = class222.field2585.method3031(-1);
                    int var125 = class222.field2585.method3097((byte) 12);
                    boolean var126 = (32768 & var124) != 0;
                    if (var123.field4673 != null && var123.field4684 != null) {
                        boolean var127 = false;
                        if (var125 <= 1) {
                            if (!var126 && (class701.field9811 && !class493.field6149 || class165.field1938)) {
                                var127 = true;
                            } else if (class366.method2133((byte) 125, var123.field4673)) {
                                var127 = true;
                            }
                        }
                        if (!var127 && class148.field1765 == 0) {
                            int var128 = -1;
                            String var129;
                            if (!var126) {
                                var129 = class424.method2340(0, class75.method600((byte) -117, class222.field2585));
                            } else {
                                var124 &= 32767;
                                class532 var130 = class479.method2616(class222.field2585, (byte) 35);
                                var128 = var130.field6720;
                                var129 = var130.field6730.method3730(class222.field2585, 0);
                            }
                            var123.field494 = var129.trim();
                            var123.field485 = 150;
                            var123.field453 = var124 & 255;
                            var123.field461 = var124 >> 8;
                            int var131;
                            if (var125 != 1 && ~var125 != -3) {
                                var131 = !var126 ? 2 : 17;
                            } else {
                                var131 = !var126 ? 1 : 17;
                            }
                            if (var125 == 2) {
                                class518.method2812(var129, "<img=1>" + var123.method2123((byte) -88, false), "<img=1>" + var123.method2129(arg0 + 77, true), 0, var128, (String) null, arg0 + -7, var123.field4710, var131);
                            } else if (var125 == 1) {
                                class518.method2812(var129, "<img=0>" + var123.method2123((byte) 117, false), "<img=0>" + var123.method2129(84, true), 0, var128, (String) null, 24, var123.field4710, var131);
                            } else {
                                class518.method2812(var129, var123.method2123((byte) -89, false), var123.method2129(54, true), 0, var128, (String) null, 24, var123.field4710, var131);
                            }
                        }
                    }
                    class613.field8339 = null;
                    return true;
                }
            } else if (class64.field781 == class613.field8339) {
                class79.method612(class546.field6859, -76);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class32.field413) {
                class79.method612(class311.field3915, -96);
                class613.field8339 = null;
                return true;
            } else if (class697.field9677 == class613.field8339) {
                class79.method612(class323.field4025, -60);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class536.field6748) {
                if (class90.field1174 != null) {
                    class645.method3607(false, class611.field8310.field8697, -1, -1, (byte) -127);
                }
                byte[] var132 = new byte[class10.field100];
                class222.field2585.method3577((byte) 15, var132, 0, class10.field100);
                String var133 = class115.method785(class10.field100, 0, var132, (byte) 101);
                class222.method1271(var133, ~class628.field8526 == -2, true, 110, class386.field4955);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class116.field1439) {
                class222.field2585.field7313 += 28;
                if (class222.field2585.method3078((byte) 107)) {
                    class289.method1734(class222.field2585.field7313 + -28, (byte) -46, class222.field2585);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class563.field7033) {
                String var134 = class222.field2585.method3072(255);
                boolean var135 = class222.field2585.method3097((byte) 12) == 1;
                String var136;
                if (var135) {
                    var136 = class222.field2585.method3072(255);
                } else {
                    var136 = var134;
                }
                int var137 = class222.field2585.method3031(-1);
                byte var138 = class222.field2585.method3083(arg0 ^ 224);
                boolean var139 = false;
                if (var138 == -128) {
                    var139 = true;
                }
                if (!var139) {
                    String var140 = class222.field2585.method3072(255);
                    class189 var141 = new class189();
                    var141.field2254 = var136;
                    var141.field2252 = var134;
                    var141.field2247 = class279.method1680(-2415, var141.field2254);
                    var141.field2251 = var138;
                    var141.field2249 = var137;
                    var141.field2248 = var140;
                    int var142;
                    for (var142 = class348.field4476 - 1; ~var142 <= -1; --var142) {
                        int var143 = class485.field6032[var142].field2247.compareTo(var141.field2247);
                        if (var143 == 0) {
                            class485.field6032[var142].field2249 = var137;
                            class485.field6032[var142].field2251 = var138;
                            class485.field6032[var142].field2248 = var140;
                            if (var136.equals(class67.field815.field4673)) {
                                class92.field1181 = var138;
                            }
                            class613.field8339 = null;
                            class182.field2140 = class696.field9643;
                            return true;
                        }
                        if (var143 < 0) {
                            break;
                        }
                    }
                    if (class485.field6032.length <= class348.field4476) {
                        class613.field8339 = null;
                        return true;
                    }
                    for (int var144 = class348.field4476 + -1; ~var144 < ~var142; --var144) {
                        class485.field6032[var144 + 1] = class485.field6032[var144];
                    }
                    if (~class348.field4476 == -1) {
                        class485.field6032 = new class189[100];
                    }
                    class485.field6032[var142 + 1] = var141;
                    ++class348.field4476;
                    if (var136.equals(class67.field815.field4673)) {
                        class92.field1181 = var138;
                    }
                } else {
                    if (~class348.field4476 == -1) {
                        class613.field8339 = null;
                        return true;
                    }
                    boolean var145 = false;
                    int var146;
                    for (var146 = 0; class348.field4476 > var146 && (!class485.field6032[var146].field2254.equals(var136) || ~class485.field6032[var146].field2249 != ~var137); ++var146) {
                    }
                    if (class348.field4476 > var146) {
                        while (var146 < class348.field4476 + -1) {
                            class485.field6032[var146] = class485.field6032[var146 + 1];
                            ++var146;
                        }
                        --class348.field4476;
                        class485.field6032[class348.field4476] = null;
                    }
                }
                class613.field8339 = null;
                class182.field2140 = class696.field9643;
                return true;
            } else if (class78.field1017 == class613.field8339) {
                int var147 = class222.field2585.method3031(-1);
                if (~var147 == -65536) {
                    var147 = -1;
                }
                int var148 = class222.field2585.method3097((byte) 12);
                int var149 = class222.field2585.method3031(arg0 ^ -32);
                int var150 = class222.field2585.method3097((byte) 12);
                class132.method852(var150, (byte) -47, var147, var149, var148);
                class613.field8339 = null;
                return true;
            } else if (class631.field8563 == class613.field8339) {
                class55.field702 = class222.field2585.method3097((byte) 12);
                class613.field8339 = null;
                class278.field3536 = class696.field9643;
                return true;
            } else if (class613.field8339 == class550.field6906) {
                int var151 = class222.field2585.method3048((byte) 43);
                int var152 = class222.field2585.method3096(arg0 ^ -126);
                int var153 = class222.field2585.method3031(arg0 + -32);
                if (class563.method2992(true, var153)) {
                    class467.method2548(false, var152, var151);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class240.field3109) {
                int var154 = class222.field2585.method3084((byte) 58);
                int var155 = class222.field2585.method3094((byte) 100);
                int var156 = class222.field2585.method3096(arg0 ^ -27);
                int var157 = class222.field2585.method3040(arg0 ^ -16777185);
                if (class563.method2992(true, var156)) {
                    class683.method3774(var155, var157, 5, 4, var154);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class477.field5944) {
                class704.method3888(false, 23136);
                class613.field8339 = null;
                return true;
            } else if (class688.field9470 == class613.field8339) {
                class103.method740(class222.field2585, class10.field100, arg0 + -561);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class210.field2488) {
                class79.method612(class580.field7768, arg0 ^ -106);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class401.field5087) {
                if (class305.field3866 != -1) {
                    class654.method3657(class305.field3866, true, 0);
                }
                class613.field8339 = null;
                return true;
            } else if (class618.field8382 == class613.field8339) {
                int var158 = class222.field2585.method3097((byte) 12);
                int var159 = var158 >> 5;
                int var160 = 31 & var158;
                if (~var160 == -1) {
                    class565.field7071[var159] = null;
                    class613.field8339 = null;
                    return true;
                } else {
                    class26 var161 = new class26();
                    var161.field301 = var160;
                    var161.field299 = class222.field2585.method3097((byte) 12);
                    if (var161.field299 >= 0 && class194.field2291.length > var161.field299) {
                        if (var161.field301 != 1 && ~var161.field301 != -11) {
                            if (~var161.field301 <= -3 && var161.field301 <= 6) {
                                if (~var161.field301 == -3) {
                                    var161.field305 = 256;
                                    var161.field304 = 256;
                                }
                                if (~var161.field301 == -4) {
                                    var161.field304 = 256;
                                    var161.field305 = 0;
                                }
                                if (~var161.field301 == -5) {
                                    var161.field305 = 512;
                                    var161.field304 = 256;
                                }
                                if (~var161.field301 == -6) {
                                    var161.field305 = 256;
                                    var161.field304 = 0;
                                }
                                if (~var161.field301 == -7) {
                                    var161.field304 = 512;
                                    var161.field305 = 256;
                                }
                                var161.field301 = 2;
                                var161.field308 = class222.field2585.method3097((byte) 12);
                                var161.field305 += class222.field2585.method3031(-1) + -class227.field2938 << 9;
                                var161.field304 += class222.field2585.method3031(-1) - class522.field6612 << 9;
                                var161.field307 = class222.field2585.method3097((byte) 12) << 2;
                                var161.field302 = class222.field2585.method3031(-1);
                            }
                        } else {
                            var161.field300 = class222.field2585.method3031(-1);
                            class222.field2585.field7313 += 6;
                        }
                        var161.field306 = class222.field2585.method3031(-1);
                        if (var161.field306 == 65535) {
                            var161.field306 = -1;
                        }
                        class565.field7071[var159] = var161;
                    }
                    class613.field8339 = null;
                    return true;
                }
            } else if (class613.field8339 == class111.field1381) {
                class650.method3631((byte) 85);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class534.field6732) {
                int var162 = class222.field2585.method3096(-103);
                int var163 = class222.field2585.method3048((byte) 43);
                int var164 = class222.field2585.method3096(-37);
                if (class563.method2992(true, var164)) {
                    class349.method2012(-4559, var163, var162);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class559.field6989) {
                int var165 = class222.field2585.method3096(arg0 + -121);
                if (~var165 == -65536) {
                    var165 = -1;
                }
                int var166 = class222.field2585.method3048((byte) 43);
                int var167 = class222.field2585.method3084((byte) 106);
                if (class563.method2992(true, var167)) {
                    class683.method3774(var166, -1, 1, 4, var165);
                }
                class613.field8339 = null;
                return true;
            } else if (class74.field979 == class613.field8339) {
                class589.field7907 = class526.method2842(true, class222.field2585.method3097((byte) 12));
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class439.field5532) {
                int var168 = class222.field2585.method3064(-2031091464);
                class354.field4577 = class386.field4955.method2595(var168, 65535);
                class613.field8339 = null;
                return true;
            } else if (class634.field8598 == class613.field8339) {
                int var169 = class222.field2585.method3068((byte) -127);
                int var170 = class222.field2585.method3054(-2);
                int var171 = class222.field2585.method3096(-120);
                if (class563.method2992(true, var170)) {
                    if (~var169 == -3) {
                        class618.method3446(arg0 ^ 20);
                    }
                    class305.field3866 = var171;
                    class46.method279((byte) 61, var171);
                    class602.method3309(false, 3);
                    class620.method3449(class305.field3866);
                    for (int var172 = 0; var172 < 100; ++var172) {
                        class58.field743[var172] = true;
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class656.field8934 == class613.field8339) {
                int var173 = class222.field2585.method3064(arg0 ^ -2031091481);
                int var174 = class222.field2585.method3031(-1);
                if (class563.method2992(true, var174)) {
                    class683.method3774(var173, 0, 5, 4, class350.field4523);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class448.field5645) {
                class79.method612(class522.field6598, -80);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class585.field7861) {
                class596.method3294(83);
                class613.field8339 = null;
                return false;
            } else if (class76.field996 == class613.field8339) {
                int var175 = class222.field2585.method3097((byte) 12);
                int var176 = class222.field2585.method3076((byte) -38);
                int var177 = class222.field2585.method3031(-1);
                if (var177 == 65535) {
                    var177 = -1;
                }
                class571.method3029(var177, var175, 16, var176);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class6.field59) {
                int var178 = class222.field2585.method3058((byte) -118);
                int var179 = class222.field2585.method3084((byte) 119);
                if (var179 == 65535) {
                    var179 = -1;
                }
                int var180 = class222.field2585.method3097((byte) 12);
                class269.method1595(var180, var178, var179, arg0 ^ 1588775735);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class558.field6977) {
                class691.field9587 = ~class10.field100 >= -3 ? class671.field9140.method3726((byte) 126, class71.field912) : class222.field2585.method3072(arg0 ^ 224);
                class151.field1802 = class10.field100 <= 0 ? -1 : class222.field2585.method3031(-1);
                if (~class151.field1802 == -65536) {
                    class151.field1802 = -1;
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class467.field5790) {
                class613.field8339 = null;
                class254.field3274 = 1;
                class78.field1019 = class696.field9643;
                return true;
            } else if (class613.field8339 == class410.field5272) {
                class349.method2010(class180.field2124, true);
                class613.field8339 = null;
                return false;
            } else if (class613.field8339 == class406.field5232) {
                class79.method612(class200.field2326, -119);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class595.field7976) {
                class79.method612(class479.field5959, arg0 + -152);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class103.field1322) {
                class189.field2253 = class222.field2585.method3097((byte) 12);
                for (int var181 = 0; var181 < class189.field2253; ++var181) {
                    class594.field7963[var181] = class222.field2585.method3072(255);
                    class204.field2368[var181] = class222.field2585.method3072(255);
                    if (class204.field2368[var181].equals("")) {
                        class204.field2368[var181] = class594.field7963[var181];
                    }
                    class599.field8033[var181] = class222.field2585.method3072(class289.method1735(arg0, 224));
                    class200.field2328[var181] = class222.field2585.method3072(arg0 + 224);
                    if (class200.field2328[var181].equals("")) {
                        class200.field2328[var181] = class599.field8033[var181];
                    }
                    class165.field1940[var181] = false;
                }
                class78.field1019 = class696.field9643;
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class277.field3529) {
                int var182 = class222.field2585.method3031(-1);
                if (~var182 == -65536) {
                    var182 = -1;
                }
                int var183 = class222.field2585.method3054(-2);
                int var184 = class222.field2585.method3094((byte) 100);
                if (class563.method2992(true, var183)) {
                    class590.method3273((byte) -80, var182, var184);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class2.field10) {
                String var185 = class222.field2585.method3072(255);
                int var186 = class222.field2585.method3054(-2);
                int var187 = class222.field2585.method3064(-2031091464);
                if (class563.method2992(true, var186)) {
                    class432.method2372((byte) -126, var187, var185);
                }
                class613.field8339 = null;
                return true;
            } else if (class702.field9823 == class613.field8339) {
                int var188 = class222.field2585.method3031(-1);
                int var189 = class222.field2585.method3097((byte) 12);
                int var190 = class222.field2585.method3097((byte) 12);
                int var191 = class222.field2585.method3031(-1) << 2;
                int var192 = class222.field2585.method3097((byte) 12);
                int var193 = class222.field2585.method3097((byte) 12);
                if (class563.method2992(true, var188)) {
                    class171.method1027(var192, var189, var190, var191, var193, (byte) 35);
                }
                class613.field8339 = null;
                return true;
            } else if (class656.field8931 == class613.field8339) {
                int var194 = class222.field2585.method3097((byte) 12);
                int var195 = class222.field2585.method3054(-2);
                boolean var196 = (var194 & 1) == 1;
                class112.method779(var195, (byte) -121, var196);
                class561.field7023[class109.method762(class175.field2063++, 31)] = var195;
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class268.field3391) {
                int var197 = class222.field2585.method3054(arg0 + -33);
                int var198 = class222.field2585.method3031(-1);
                int var199 = class222.field2585.method3048((byte) 43);
                int var200 = class222.field2585.method3096(-70);
                if (class563.method2992(true, var200)) {
                    class14.method65(false, (var197 << 16) + var198, var199);
                }
                class613.field8339 = null;
                return true;
            } else if (class89.field1157 == class613.field8339) {
                int var201 = class222.field2585.method3031(-1);
                int var202 = class222.field2585.method3031(-1);
                int var203 = class222.field2585.method3031(arg0 ^ -32);
                int var204 = class222.field2585.method3031(-1);
                if (class563.method2992(true, var201) && class325.field4062[var202] != null) {
                    for (int var205 = var203; var205 < var204; ++var205) {
                        int var206 = class222.field2585.method3059(1);
                        if (~class325.field4062[var202].length < ~var205 && class325.field4062[var202][var205] != null) {
                            class325.field4062[var202][var205].field4314 = var206;
                        }
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class227.field2935) {
                class79.method612(class706.field9869, -67);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class17.field165) {
                class79.method612(class388.field4971, -75);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class2.field7) {
                boolean var207 = ~class222.field2585.method3097((byte) 12) == -2;
                String var208 = class222.field2585.method3072(255);
                String var209 = var208;
                if (var207) {
                    var209 = class222.field2585.method3072(255);
                }
                long var210 = (long) class222.field2585.method3031(-1);
                long var212 = (long) class222.field2585.method3059(1);
                int var214 = class222.field2585.method3097((byte) 12);
                long var215 = (var210 << 32) - -var212;
                boolean var217 = false;
                int var218 = 0;
                while (true) {
                    if (var218 >= 100) {
                        if (~var214 >= -2) {
                            if ((!class701.field9811 || class493.field6149) && !class165.field1938) {
                                if (class366.method2133((byte) 83, var209)) {
                                    var217 = true;
                                }
                            } else {
                                var217 = true;
                            }
                        }
                        break;
                    }
                    if (~class146.field1750[var218] == ~var215) {
                        var217 = true;
                        break;
                    }
                    ++var218;
                }
                if (!var217 && class148.field1765 == 0) {
                    class146.field1750[class146.field1749] = var215;
                    class146.field1749 = (class146.field1749 + 1) % 100;
                    String var219 = class424.method2340(0, class75.method600((byte) -121, class222.field2585));
                    if (~var214 != -3) {
                        if (~var214 == -2) {
                            class518.method2812(var219, "<img=0>" + var209, "<img=0>" + var208, 0, -1, (String) null, 24, var208, 7);
                        } else {
                            class518.method2812(var219, var209, var208, 0, -1, (String) null, arg0 ^ 7, var208, 3);
                        }
                    } else {
                        class518.method2812(var219, "<img=1>" + var209, "<img=1>" + var208, 0, -1, (String) null, 24, var208, 7);
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class139.field1675) {
                class66.field798 = class222.field2585.method3068((byte) 34);
                class80.field1042 = class222.field2585.method3083(255) << 3;
                class581.field7825 = class222.field2585.method3087(68) << 3;
                while (~class10.field100 < ~class222.field2585.field7313) {
                    class27 var220 = class335.method1920((byte) 111)[class222.field2585.method3097((byte) 12)];
                    class79.method612(var220, arg0 ^ -94);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class203.field2363) {
                int var221 = class222.field2585.method3054(arg0 + -33);
                int var222 = class222.field2585.method3031(-1);
                byte var223 = class222.field2585.method3066(27382);
                if (class563.method2992(true, var222)) {
                    class349.method2012(arg0 ^ -4562, var223, var221);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class24.field283) {
                class613.field8339 = null;
                return false;
            } else if (class613.field8339 == class526.field6642) {
                int var224 = class222.field2585.method3031(-1);
                int var225 = class222.field2585.method3096(-19);
                int var226 = class222.field2585.method3096(arg0 ^ -63);
                if (class563.method2992(true, var224)) {
                    class431.method2368(0, (byte) 95, var225, var226);
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class506.field6333) {
                class349.method2010(false, true);
                class613.field8339 = null;
                return false;
            } else if (class635.field8604 == class613.field8339) {
                class367.method2138(true);
                class613.field8339 = null;
                return false;
            } else if (class613.field8339 == class550.field6907) {
                int var227 = class222.field2585.method3094((byte) 100);
                int var228 = class222.field2585.method3084((byte) 74);
                if (~var228 == -65536) {
                    var228 = -1;
                }
                int var229 = class222.field2585.method3064(-2031091464);
                int var230 = class222.field2585.method3054(-2);
                if (~var230 == -65536) {
                    var230 = -1;
                }
                int var231 = class222.field2585.method3031(arg0 ^ -32);
                if (class563.method2992(true, var231)) {
                    for (int var232 = var228; var232 <= var230; ++var232) {
                        long var233 = ((long) var227 << 32) + (long) var232;
                        class357 var235 = (class357) class96.field1248.method3828(var233, (byte) -91);
                        class357 var236;
                        if (var235 != null) {
                            var236 = new class357(var229, var235.field4602);
                            var235.method1566(-104);
                        } else if (~var232 != 0) {
                            var236 = new class357(var229, -1);
                        } else {
                            var236 = new class357(var229, class442.method2421(var227, 77).field4316.field4602);
                        }
                        class96.field1248.method3832(var236, var233, 89);
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class410.field5276) {
                int var237 = class222.field2585.method3031(arg0 ^ -32);
                int var238 = class222.field2585.method3097((byte) 12);
                boolean var239 = ~(1 & var238) == -2;
                class642.method3599(var239, 125, var237);
                int var240 = class222.field2585.method3031(arg0 + -32);
                for (int var241 = 0; ~var240 < ~var241; ++var241) {
                    int var242 = class222.field2585.method3031(arg0 + -32);
                    int var243 = class222.field2585.method3097((byte) 12);
                    if (~var243 == -256) {
                        var243 = class222.field2585.method3094((byte) 100);
                    }
                    class694.method3831(var237, var241, var242 + -1, var243, var239, (byte) -114);
                }
                class561.field7023[class109.method762(class175.field2063++, 31)] = var237;
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class256.field3281) {
                int var244 = class222.field2585.method3063(0);
                int var245 = class222.field2585.method3040(arg0 + -16777247);
                int var246 = class222.field2585.method3063(0);
                class356.field4587[var244] = var245;
                class607.field8280[var244] = var246;
                class608.field8282[var244] = 1;
                int var247 = class688.field9479[var244] + -1;
                for (int var248 = 0; ~var248 > ~var247; ++var248) {
                    if (class373.field4818[var248] <= var245) {
                        class608.field8282[var244] = var248 + 2;
                    }
                }
                class484.field6019[class109.method762(31, class267.field3377++)] = var244;
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class179.field2117) {
                class704.method3888(true, 23136);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class223.field2701) {
                class666.field9038 = class222.field2585.method3097((byte) 12);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class111.field1380) {
                boolean var249 = ~class222.field2585.method3097((byte) 12) == -2;
                String var250 = class222.field2585.method3072(255);
                String var251 = var250;
                if (var249) {
                    var251 = class222.field2585.method3072(arg0 ^ 224);
                }
                int var252 = class222.field2585.method3097((byte) 12);
                int var253 = class222.field2585.method3031(-1);
                boolean var254 = false;
                if (~var252 >= -2 && class366.method2133((byte) 83, var251)) {
                    var254 = true;
                }
                if (!var254 && class148.field1765 == 0) {
                    String var255 = class471.field5810.method3267(var253, arg0 ^ -111).method3730(class222.field2585, 0);
                    if (~var252 != -3) {
                        if (~var252 != -2) {
                            class518.method2812(var255, var251, var250, 0, var253, (String) null, arg0 + -7, var250, 25);
                        } else {
                            class518.method2812(var255, "<img=0>" + var251, "<img=0>" + var250, 0, var253, (String) null, 24, var250, 25);
                        }
                    } else {
                        class518.method2812(var255, "<img=1>" + var251, "<img=1>" + var250, 0, var253, (String) null, 24, var250, 25);
                    }
                }
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class45.field615) {
                int var256 = class222.field2585.method3031(arg0 ^ -32);
                if (var256 == 65535) {
                    var256 = -1;
                }
                int var257 = class222.field2585.method3097((byte) 12);
                int var258 = class222.field2585.method3031(-1);
                int var259 = class222.field2585.method3097((byte) 12);
                class606.method3374(var256, (byte) 110, var258, var259, false, var257);
                class613.field8339 = null;
                return true;
            } else if (class613.field8339 == class389.field4999) {
                class80.field1042 = class222.field2585.method3066(27382) << 3;
                class66.field798 = class222.field2585.method3097((byte) 12);
                class581.field7825 = class222.field2585.method3087(53) << 3;
                class613.field8339 = null;
                return true;
            } else if (class92.field1183 == class613.field8339) {
                boolean var260 = class222.field2585.method3097((byte) 12) == 1;
                String var261 = class222.field2585.method3072(255);
                String var262 = var261;
                if (var260) {
                    var262 = class222.field2585.method3072(arg0 ^ 224);
                }
                long var263 = (long) class222.field2585.method3031(-1);
                long var265 = (long) class222.field2585.method3059(1);
                int var267 = class222.field2585.method3097((byte) 12);
                int var268 = class222.field2585.method3031(arg0 + -32);
                long var269 = (var263 << 32) - -var265;
                boolean var271 = false;
                int var272 = 0;
                while (true) {
                    if (~var272 <= -101) {
                        if (var267 <= 1 && class366.method2133((byte) 104, var262)) {
                            var271 = true;
                        }
                        break;
                    }
                    if (class146.field1750[var272] == var269) {
                        var271 = true;
                        break;
                    }
                    ++var272;
                }
                if (!var271 && class148.field1765 == 0) {
                    class146.field1750[class146.field1749] = var269;
                    class146.field1749 = (class146.field1749 + 1) % 100;
                    String var273 = class471.field5810.method3267(var268, arg0 + -119).method3730(class222.field2585, 0);
                    if (~var267 != -3) {
                        if (var267 == 1) {
                            class518.method2812(var273, "<img=0>" + var262, "<img=0>" + var261, 0, var268, (String) null, 24, var261, 18);
                        } else {
                            class518.method2812(var273, var262, var261, 0, var268, (String) null, arg0 ^ 7, var261, 18);
                        }
                    } else {
                        class518.method2812(var273, "<img=1>" + var262, "<img=1>" + var261, 0, var268, (String) null, 24, var261, 18);
                    }
                }
                class613.field8339 = null;
                return true;
            } else {
                if (arg0 != 31) {
                    method3476(true);
                }
                if (class631.field8561 == class613.field8339) {
                    int var274 = class222.field2585.method3092((byte) 85);
                    int var275 = class222.field2585.method3048((byte) 43);
                    int var276 = class222.field2585.method3035(22401);
                    int var277 = class222.field2585.method3031(arg0 + -32);
                    if (class563.method2992(true, var277)) {
                        class270.method1605(var276, arg0 ^ 30, var274, var275);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class193.field2281) {
                    int var278 = class222.field2585.method3031(-1);
                    int var279 = class222.field2585.method3097((byte) 12);
                    boolean var280 = (1 & var279) == 1;
                    while (~class222.field2585.field7313 > ~class10.field100) {
                        int var281 = class222.field2585.method3033((byte) 91);
                        int var282 = class222.field2585.method3031(-1);
                        int var283 = 0;
                        if (var282 != 0) {
                            var283 = class222.field2585.method3097((byte) 12);
                            if (~var283 == -256) {
                                var283 = class222.field2585.method3064(-2031091464);
                            }
                        }
                        class694.method3831(var278, var281, var282 + -1, var283, var280, (byte) -122);
                    }
                    class561.field7023[class109.method762(class175.field2063++, 31)] = var278;
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class142.field1718) {
                    int var284 = class222.field2585.method3076((byte) -104);
                    int var285 = class222.field2585.method3063(0);
                    int var286 = class222.field2585.method3096(arg0 + -67);
                    if (var286 == 65535) {
                        var286 = -1;
                    }
                    String var287 = class222.field2585.method3072(arg0 + 224);
                    if (~var284 <= -2 && ~var284 >= -9) {
                        if (var287.equalsIgnoreCase("null")) {
                            var287 = null;
                        }
                        class112.field1402[var284 - 1] = var287;
                        class688.field9472[var284 + -1] = var286;
                        class187.field2213[var284 + -1] = ~var285 == -1;
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class185.field2184) {
                    int var288 = class222.field2585.method3031(arg0 ^ -32);
                    int[] var289 = new int[4];
                    for (int var290 = 0; var290 < 4; ++var290) {
                        var289[var290] = class222.field2585.method3054(-2);
                    }
                    int var291 = class222.field2585.method3076((byte) -52);
                    class704 var292 = (class704) class168.field1973.method3828((long) var288, (byte) -91);
                    if (var292 != null) {
                        class292.method1765(var289, -90, var292.field9854, var291);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class614.field8341 == class613.field8339) {
                    int var293 = class222.field2585.method3031(arg0 + -32);
                    if (~var293 == -65536) {
                        var293 = -1;
                    }
                    int var294 = class222.field2585.method3097((byte) 12);
                    int var295 = class222.field2585.method3031(-1);
                    int var296 = class222.field2585.method3097((byte) 12);
                    class606.method3374(var293, (byte) 109, var295, var296, true, var294);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class404.field5220) {
                    int var297 = class222.field2585.method3096(-104);
                    String var298 = class222.field2585.method3072(arg0 + 224);
                    int var299 = class222.field2585.method3054(-2);
                    if (class563.method2992(true, var299)) {
                        class25.method160((byte) 98, var297, var298);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class183.field2147) {
                    class79.method612(class621.field8428, -119);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class162.field1914) {
                    int var300 = class222.field2585.method3096(-72);
                    int var301 = class222.field2585.method3054(-2);
                    if (~var301 == -65536) {
                        var301 = -1;
                    }
                    int var302 = class222.field2585.method3048((byte) 43);
                    int var303 = class222.field2585.method3084((byte) 96);
                    if (~var303 == -65536) {
                        var303 = -1;
                    }
                    int var304 = class222.field2585.method3096(-38);
                    if (class563.method2992(true, var304)) {
                        for (int var305 = var301; var305 <= var303; ++var305) {
                            long var306 = ((long) var302 << 32) - -((long) var305);
                            class357 var308 = (class357) class96.field1248.method3828(var306, (byte) -91);
                            class357 var309;
                            if (var308 == null) {
                                if (~var305 == 0) {
                                    var309 = new class357(class442.method2421(var302, 109).field4316.field4604, var300);
                                } else {
                                    var309 = new class357(0, var300);
                                }
                            } else {
                                var309 = new class357(var308.field4604, var300);
                                var308.method1566(-90);
                            }
                            class96.field1248.method3832(var309, var306, 33);
                        }
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class29.field348) {
                    int var310 = class222.field2585.method3031(arg0 + -32);
                    int var311 = class222.field2585.method3094((byte) 100);
                    class327.field4084.method311(var310, 111, var311);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class250.field3227) {
                    class66.field798 = class222.field2585.method3063(0);
                    class80.field1042 = class222.field2585.method3095(0) << 3;
                    class581.field7825 = class222.field2585.method3095(0) << 3;
                    for (class62 var312 = (class62) class370.field4774.method3830((byte) 99); var312 != null; var312 = (class62) class370.field4774.method3838((byte) -92)) {
                        int var314 = (int) (var312.field3321 >> 28 & 3L);
                        int var315 = (int) (16383L & var312.field3321);
                        int var316 = var315 - class227.field2938;
                        int var317 = (int) (var312.field3321 >> 14 & 16383L);
                        int var318 = -class522.field6612 + var317;
                        if (~class66.field798 == ~var314 && class581.field7825 <= var316 && var316 < class581.field7825 + 8 && ~class80.field1042 >= ~var318 && ~var318 > ~(class80.field1042 + 8)) {
                            var312.method1566(-98);
                            if (var316 >= 0 && ~var318 <= -1 && var316 < class85.field1090 && ~var318 > ~class656.field8932) {
                                class391.method2224((byte) 89, var318, var316, class66.field798);
                            }
                        }
                    }
                    for (class589 var313 = (class589) class26.field303.method1909(true); var313 != null; var313 = (class589) class26.field303.method1916((byte) 106)) {
                        if (class581.field7825 <= var313.field7904 && ~(class581.field7825 + 8) < ~var313.field7904 && ~var313.field7910 <= ~class80.field1042 && var313.field7910 < class80.field1042 + 8 && class66.field798 == var313.field7906) {
                            var313.field7908 = 0;
                        }
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class691.field9582 == class613.field8339) {
                    byte var319 = class222.field2585.method3087(113);
                    int var320 = class222.field2585.method3031(-1);
                    class327.field4084.method311(var320, arg0 + 88, var319);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class277.field3531) {
                    boolean var321 = class222.field2585.method3097((byte) 12) == 1;
                    byte[] var322 = new byte[class10.field100 + -1];
                    class222.field2585.method3081(class10.field100 + -1, -24643, var322, 0);
                    class170.method1023(var322, (byte) 64, var321);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class319.field3991) {
                    int var323 = class222.field2585.method3084((byte) 97);
                    int var324 = class222.field2585.method3031(-1);
                    int var325 = class222.field2585.method3040(-16777216);
                    int var326 = class222.field2585.method3068((byte) 53);
                    if (class563.method2992(true, var324)) {
                        class293 var327 = (class293) class216.field2530.method3828((long) var325, (byte) -91);
                        if (var327 != null) {
                            class190.method1128(false, -96, var327.field3727 != var323, var327);
                        }
                        class99.method723(var326, var325, (byte) 29, var323, false);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class124.field1511) {
                    String var328 = class222.field2585.method3072(255);
                    String var329 = class424.method2340(0, class75.method600((byte) -115, class222.field2585));
                    class417.method2324(var328, var328, var328, var329, 0, (byte) -95, 6);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class455.field5684) {
                    class79.method612(class339.field4333, -114);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class511.field6418) {
                    int var330 = class222.field2585.method3097((byte) 12);
                    if (~class222.field2585.method3097((byte) 12) == -1) {
                        class317.field3965[var330] = new class327();
                    } else {
                        --class222.field2585.field7313;
                        class317.field3965[var330] = new class327(class222.field2585);
                    }
                    class441.field5539 = class696.field9643;
                    class613.field8339 = null;
                    return true;
                } else if (class633.field8585 == class613.field8339) {
                    int var331 = class222.field2585.method3064(-2031091464);
                    int var332 = class222.field2585.method3084((byte) 114);
                    int var333 = class222.field2585.method3096(arg0 + -46);
                    if (class563.method2992(true, var332)) {
                        class33.method231(var333, var331, (byte) -8);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class440.field5537) {
                    class340.field4345 = class222.field2585.method3097((byte) 12);
                    class646.field8749 = class222.field2585.method3063(0);
                    class613.field8339 = null;
                    return true;
                } else if (class668.field9054 == class613.field8339) {
                    int var334 = class222.field2585.method3040(-16777216);
                    int var335 = class222.field2585.method3096(arg0 + -67);
                    if (~var335 == -65536) {
                        var335 = -1;
                    }
                    int var336 = class222.field2585.method3096(-91);
                    int var337 = class222.field2585.method3048((byte) 43);
                    if (class563.method2992(true, var336)) {
                        class606.method3360(var334, var335, var337, (byte) 8);
                        class68 var338 = class504.field6287.method1628(var335, (byte) -84);
                        class558.method2972(var338.field863, var334, (byte) -118, var338.field835, var338.field883);
                        class487.method2650(var338.field876, 10, var334, var338.field894, var338.field819);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class660.field8964 == class613.field8339) {
                    int var339 = class222.field2585.method3064(-2031091464);
                    int var340 = class222.field2585.method3084((byte) 69);
                    int var341 = class222.field2585.method3054(-2);
                    if (class563.method2992(true, var340)) {
                        class141.method888(var341, var339, false);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class590.field7922) {
                    for (int var342 = 0; class132.field1601.length > var342; ++var342) {
                        if (class132.field1601[var342] != null) {
                            class132.field1601[var342].field448 = null;
                            class132.field1601[var342].field447 = -1;
                        }
                    }
                    for (int var343 = 0; class215.field2516 > var343; ++var343) {
                        class140.field1687[var343].field9854.field448 = null;
                        class140.field1687[var343].field9854.field447 = -1;
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class160.field1884) {
                    int var344 = class222.field2585.method3064(-2031091464);
                    int var345 = class222.field2585.method3054(-2);
                    int var346 = class222.field2585.method3068((byte) -126);
                    if (class563.method2992(true, var345)) {
                        class228.method1375(var344, -120, var346);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class351.field4537) {
                    int var347 = class222.field2585.method3097((byte) 12);
                    int var348 = class222.field2585.method3097((byte) 12);
                    if (var348 == 255) {
                        var347 = -1;
                        var348 = -1;
                    }
                    class244.method1467(var347, var348, (byte) 42);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class39.field575) {
                    int var349 = class222.field2585.method3094((byte) 100);
                    int var350 = class222.field2585.method3054(-2);
                    int var351 = class222.field2585.method3031(-1);
                    int var352 = class222.field2585.method3096(-93);
                    int var353 = class222.field2585.method3097((byte) 12);
                    boolean var354 = (var353 & 128) != 0;
                    if (var349 >> 30 != 0) {
                        int var355 = (906839675 & var349) >> 28;
                        int var356 = (var349 >> 14 & 16383) + -class227.field2938;
                        int var357 = (var349 & 16383) + -class522.field6612;
                        if (~var356 <= -1 && var357 >= 0 && ~var356 > ~class85.field1090 && var357 < class656.field8932) {
                            int var358 = var356 * 512 + 256;
                            int var359 = var357 * 512 + 256;
                            int var360 = var355;
                            if (~var355 > -4 && class407.method2284(arg0 + 25, var356, var357)) {
                                var360 = var355 + 1;
                            }
                            class367 var361 = new class367(var350, 0, class665.field9027, var355, var360, var358, -var352 + class514.method2798(var359, var358, var355, (byte) 123), var359, var356, var356, var357, var357, 7 & var353);
                            class301.field3832.method1904(new class210(var361), -97);
                        }
                    } else if (var349 >> 29 != 0) {
                        int var362 = 65535 & var349;
                        class704 var363 = (class704) class168.field1973.method3828((long) var362, (byte) -91);
                        if (var363 != null) {
                            class506 var364 = var363.field9854;
                            if (var350 == 65535) {
                                var350 = -1;
                            }
                            boolean var365 = true;
                            int var366 = !var354 ? var364.field429 : var364.field492;
                            if (~var350 != 0 && ~var366 != 0) {
                                if (var350 == var366) {
                                    class561 var367 = class339.field4336.method2158((byte) -25, var350);
                                    if (var367.field7006 && var367.field7016 != -1) {
                                        class207 var368 = class11.field110.method1141(var367.field7016, (byte) -102);
                                        int var369 = var368.field2451;
                                        if (~var369 != -1 && ~var369 != -3) {
                                            if (var369 == 1) {
                                                var365 = true;
                                            }
                                        } else {
                                            var365 = false;
                                        }
                                    }
                                } else {
                                    class561 var370 = class339.field4336.method2158((byte) -25, var350);
                                    class561 var371 = class339.field4336.method2158((byte) -25, var366);
                                    if (~var370.field7016 != 0 && ~var371.field7016 != 0) {
                                        class207 var372 = class11.field110.method1141(var370.field7016, (byte) 120);
                                        class207 var373 = class11.field110.method1141(var371.field7016, (byte) -14);
                                        if (~var372.field2425 > ~var373.field2425) {
                                            var365 = false;
                                        }
                                    }
                                }
                            }
                            if (var365) {
                                if (!var354) {
                                    var364.field462 = var352;
                                    var364.field474 = 1;
                                    var364.field451 = 0;
                                    var364.field457 = 0;
                                    var364.field482 = var353 & 7;
                                    var364.field429 = var350;
                                    var364.field460 = class665.field9027 - -var351;
                                    if (~var364.field460 < ~class665.field9027) {
                                        var364.field451 = -1;
                                    }
                                    if (var364.field429 != -1 && ~class665.field9027 == ~var364.field460) {
                                        int var374 = class339.field4336.method2158((byte) -25, var364.field429).field7016;
                                        if (var374 != -1) {
                                            class207 var375 = class11.field110.method1141(var374, (byte) 114);
                                            if (var375 != null && var375.field2441 != null) {
                                                class526.method2841(arg0 ^ -305539914, var364.field8010, var375, false, var364.field8018, 0, var364.field8011);
                                            }
                                        }
                                    }
                                } else {
                                    var364.field483 = class665.field9027 + var351;
                                    var364.field481 = var352;
                                    var364.field454 = 1;
                                    var364.field438 = 0;
                                    var364.field452 = 0;
                                    var364.field440 = 7 & var353;
                                    var364.field492 = var350;
                                    if (var364.field483 > class665.field9027) {
                                        var364.field438 = -1;
                                    }
                                    if (var364.field492 != -1 && ~class665.field9027 == ~var364.field483) {
                                        int var376 = class339.field4336.method2158((byte) -25, var364.field492).field7016;
                                        if (~var376 != 0) {
                                            class207 var377 = class11.field110.method1141(var376, (byte) 118);
                                            if (var377 != null && var377.field2441 != null) {
                                                class526.method2841(-305539927, var364.field8010, var377, false, var364.field8018, 0, var364.field8011);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~(var349 >> 28) != -1) {
                        int var378 = 65535 & var349;
                        class365 var379;
                        if (~class350.field4523 != ~var378) {
                            var379 = class132.field1601[var378];
                        } else {
                            var379 = class67.field815;
                        }
                        if (var379 != null) {
                            if (~var350 == -65536) {
                                var350 = -1;
                            }
                            boolean var380 = true;
                            int var381 = !var354 ? var379.field429 : var379.field492;
                            if (var350 != -1 && var381 != -1) {
                                if (~var350 != ~var381) {
                                    class561 var382 = class339.field4336.method2158((byte) -25, var350);
                                    class561 var383 = class339.field4336.method2158((byte) -25, var381);
                                    if (var382.field7016 != -1 && var383.field7016 != -1) {
                                        class207 var384 = class11.field110.method1141(var382.field7016, (byte) -58);
                                        class207 var385 = class11.field110.method1141(var383.field7016, (byte) 115);
                                        if (var384.field2425 < var385.field2425) {
                                            var380 = false;
                                        }
                                    }
                                } else {
                                    class561 var386 = class339.field4336.method2158((byte) -25, var350);
                                    if (var386.field7006 && ~var386.field7016 != 0) {
                                        class207 var387 = class11.field110.method1141(var386.field7016, (byte) 115);
                                        int var388 = var387.field2451;
                                        if (~var388 != -1 && ~var388 != -3) {
                                            if (~var388 == -2) {
                                                var380 = true;
                                            }
                                        } else {
                                            var380 = false;
                                        }
                                    }
                                }
                            }
                            if (var380) {
                                if (var354) {
                                    var379.field440 = 7 & var353;
                                    var379.field483 = class665.field9027 + var351;
                                    var379.field438 = 0;
                                    var379.field481 = var352;
                                    var379.field492 = var350;
                                    var379.field454 = 1;
                                    var379.field452 = 0;
                                    if (class665.field9027 < var379.field483) {
                                        var379.field438 = -1;
                                    }
                                    if (~var379.field492 == -65536) {
                                        var379.field492 = -1;
                                    }
                                    if (~var379.field492 != 0 && class665.field9027 == var379.field483) {
                                        int var389 = class339.field4336.method2158((byte) -25, var379.field492).field7016;
                                        if (var389 != -1) {
                                            class207 var390 = class11.field110.method1141(var389, (byte) -98);
                                            if (var390 != null && var390.field2441 != null) {
                                                class526.method2841(-305539927, var379.field8010, var390, class67.field815 == var379, var379.field8018, 0, var379.field8011);
                                            }
                                        }
                                    }
                                } else {
                                    var379.field451 = 0;
                                    var379.field462 = var352;
                                    var379.field460 = class665.field9027 - -var351;
                                    var379.field457 = 0;
                                    var379.field482 = var353 & 7;
                                    var379.field429 = var350;
                                    var379.field474 = 1;
                                    if (var379.field429 == 65535) {
                                        var379.field429 = -1;
                                    }
                                    if (~var379.field460 < ~class665.field9027) {
                                        var379.field451 = -1;
                                    }
                                    if (var379.field429 != -1 && ~class665.field9027 == ~var379.field460) {
                                        int var391 = class339.field4336.method2158((byte) -25, var379.field429).field7016;
                                        if (~var391 != 0) {
                                            class207 var392 = class11.field110.method1141(var391, (byte) 116);
                                            if (var392 != null && var392.field2441 != null) {
                                                class526.method2841(-305539927, var379.field8010, var392, class67.field815 == var379, var379.field8018, 0, var379.field8011);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class617.field8369 == class613.field8339) {
                    int var393 = class222.field2585.method3076((byte) -112);
                    int var394 = class222.field2585.method3054(-2);
                    class327.field4084.method310(var394, var393, true);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class597.field8012) {
                    int var395 = class222.field2585.method3031(arg0 ^ -32);
                    if (class563.method2992(true, var395)) {
                        class376.method2170(false);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class632.field8565 == class613.field8339) {
                    class696.method3850(class222.field2585.method3072(255), (byte) 85);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class168.field1967) {
                    class79.method612(class360.field4620, -71);
                    class613.field8339 = null;
                    return true;
                } else if (class64.field779 == class613.field8339) {
                    class79.method612(class228.field2951, -86);
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class126.field1530) {
                    int var396 = class222.field2585.method3031(-1);
                    int var397 = class222.field2585.method3097((byte) 12);
                    int var398 = class222.field2585.method3097((byte) 12);
                    int var399 = class222.field2585.method3097((byte) 12);
                    int var400 = class222.field2585.method3097((byte) 12);
                    int var401 = class222.field2585.method3031(-1);
                    if (class563.method2992(true, var396)) {
                        class642.field8705[var397] = true;
                        class588.field7896[var397] = var398;
                        class491.field6123[var397] = var399;
                        class25.field286[var397] = var400;
                        class47.field633[var397] = var401;
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class337.field4249) {
                    int var402 = class222.field2585.method3040(-16777216);
                    int var403 = class222.field2585.method3031(-1);
                    int var404 = class222.field2585.method3031(arg0 + -32);
                    if (~var404 == -65536) {
                        var404 = -1;
                    }
                    if (class563.method2992(true, var403)) {
                        class683.method3774(var402, -1, 2, 4, var404);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class644.field8732 == class613.field8339) {
                    class173.field2033 = class222.field2585.method3071(228709168);
                    class701.field9811 = class222.field2585.method3097((byte) 12) == 1;
                    class613.field8339 = null;
                    return true;
                } else if (class613.field8339 == class474.field5866) {
                    int var405 = class222.field2585.method3031(-1);
                    if (class563.method2992(true, var405)) {
                        class457.method2516((byte) 5);
                    }
                    class613.field8339 = null;
                    return true;
                } else if (class84.field1075 != class613.field8339) {
                    class564.method2994((byte) 34, "T1 - " + (class613.field8339 == null ? -1 : class613.field8339.method3745(arg0 ^ -73)) + "," + (class610.field8305 != null ? class610.field8305.method3745(-95) : -1) + "," + (class660.field8961 != null ? class660.field8961.method3745(arg0 ^ 103) : -1) + " - " + class10.field100, (Throwable) null);
                    class349.method2010(false, true);
                    return true;
                } else {
                    while (class222.field2585.field7313 < class10.field100) {
                        boolean var416 = class222.field2585.method3097((byte) 12) == 1;
                        String var417 = class222.field2585.method3072(255);
                        String var418 = class222.field2585.method3072(arg0 + 224);
                        int var419 = class222.field2585.method3031(-1);
                        int var420 = class222.field2585.method3097((byte) 12);
                        String var421 = "";
                        boolean var422 = false;
                        if (~var419 < -1) {
                            var421 = class222.field2585.method3072(arg0 + 224);
                            var422 = ~class222.field2585.method3097((byte) 12) == -2;
                        }
                        for (int var423 = 0; ~var423 > ~class284.field3600; ++var423) {
                            if (var416) {
                                if (var418.equals(class136.field1659[var423])) {
                                    class136.field1659[var423] = var417;
                                    class392.field5015[var423] = var418;
                                    var417 = null;
                                    break;
                                }
                            } else if (var417.equals(class136.field1659[var423])) {
                                if (~class618.field8380[var423] != ~var419) {
                                    boolean var424 = true;
                                    for (class500 var425 = (class500) class207.field2432.method1715((byte) 124); var425 != null; var425 = (class500) class207.field2432.method1712((byte) 126)) {
                                        if (var425.field6236.equals(var417)) {
                                            if (~var419 != -1 && ~var425.field6233 == -1) {
                                                var424 = false;
                                                var425.method1619((byte) -90);
                                            } else if (var419 == 0 && ~var425.field6233 != -1) {
                                                var425.method1619((byte) -92);
                                                var424 = false;
                                            }
                                        }
                                    }
                                    if (var424) {
                                        class207.field2432.method1714(new class500(var417, var419), (byte) 11);
                                    }
                                    class618.field8380[var423] = var419;
                                }
                                class392.field5015[var423] = var418;
                                class413.field5289[var423] = var421;
                                class65.field790[var423] = var420;
                                class267.field3373[var423] = var422;
                                var417 = null;
                                break;
                            }
                        }
                        if (var417 != null && ~class284.field3600 > -201) {
                            class136.field1659[class284.field3600] = var417;
                            class392.field5015[class284.field3600] = var418;
                            class618.field8380[class284.field3600] = var419;
                            class413.field5289[class284.field3600] = var421;
                            class65.field790[class284.field3600] = var420;
                            class267.field3373[class284.field3600] = var422;
                            ++class284.field3600;
                        }
                    }
                    class254.field3274 = 2;
                    class78.field1019 = class696.field9643;
                    boolean var406 = false;
                    int var407 = class284.field3600;
                    while (var407 > 0) {
                        --var407;
                        boolean var408 = true;
                        for (int var409 = 0; var407 > var409; ++var409) {
                            if (class618.field8380[var409] != class360.field4628.field3030 && ~class618.field8380[var409 + 1] == ~class360.field4628.field3030 || ~class618.field8380[var409] == -1 && ~class618.field8380[var409 + 1] != -1) {
                                int var410 = class618.field8380[var409];
                                class618.field8380[var409] = class618.field8380[var409 + 1];
                                class618.field8380[var409 + 1] = var410;
                                String var411 = class413.field5289[var409];
                                class413.field5289[var409] = class413.field5289[var409 - -1];
                                class413.field5289[var409 + 1] = var411;
                                String var412 = class136.field1659[var409];
                                class136.field1659[var409] = class136.field1659[var409 + 1];
                                class136.field1659[var409 + 1] = var412;
                                String var413 = class392.field5015[var409];
                                class392.field5015[var409] = class392.field5015[var409 - -1];
                                class392.field5015[var409 + 1] = var413;
                                int var414 = class65.field790[var409];
                                class65.field790[var409] = class65.field790[var409 + 1];
                                class65.field790[var409 + 1] = var414;
                                boolean var415 = class267.field3373[var409];
                                class267.field3373[var409] = class267.field3373[var409 - -1];
                                class267.field3373[var409 - -1] = var415;
                                var408 = false;
                            }
                        }
                        if (var408) {
                            break;
                        }
                    }
                    class613.field8339 = null;
                    return true;
                }
            }
        }
    }
}
