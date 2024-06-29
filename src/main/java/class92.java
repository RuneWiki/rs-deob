import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class92 extends class294 {

    @OriginalMember(owner = "client!pf", name = "sc", descriptor = "I")
    public int field1479 = -1;

    @OriginalMember(owner = "client!pf", name = "wc", descriptor = "I")
    public int field1483 = -1;

    @OriginalMember(owner = "client!pf", name = "Gc", descriptor = "Z")
    public boolean field1493 = false;

    @OriginalMember(owner = "client!pf", name = "qc", descriptor = "I")
    public int field1477 = -1;

    @OriginalMember(owner = "client!pf", name = "Fc", descriptor = "B")
    private byte field1492 = 0;

    @OriginalMember(owner = "client!pf", name = "Ic", descriptor = "I")
    public int field1495 = -1;

    @OriginalMember(owner = "client!pf", name = "uc", descriptor = "I")
    public int field1481 = 0;

    @OriginalMember(owner = "client!pf", name = "oc", descriptor = "I")
    public int field1475 = 0;

    @OriginalMember(owner = "client!pf", name = "Kc", descriptor = "I")
    public int field1497 = 0;

    @OriginalMember(owner = "client!pf", name = "Ec", descriptor = "I")
    public int field1491 = 255;

    @OriginalMember(owner = "client!pf", name = "Wc", descriptor = "I")
    public int field1509 = 0;

    @OriginalMember(owner = "client!pf", name = "Mc", descriptor = "I")
    public int field1499 = -1;

    @OriginalMember(owner = "client!pf", name = "rc", descriptor = "I")
    public int field1478 = -1;

    @OriginalMember(owner = "client!pf", name = "Xc", descriptor = "I")
    public int field1510 = -1;

    @OriginalMember(owner = "client!pf", name = "Yc", descriptor = "I")
    public int field1511 = 0;

    @OriginalMember(owner = "client!pf", name = "Ac", descriptor = "[I")
    public static int[] field1487 = new int[2000];

    @OriginalMember(owner = "client!pf", name = "Cc", descriptor = "I")
    public static int field1489 = -1;

    @OriginalMember(owner = "client!pf", name = "pc", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!pf", name = "tc", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!pf", name = "vc", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!pf", name = "Bc", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!pf", name = "Dc", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pf", name = "Hc", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!pf", name = "Jc", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!pf", name = "Lc", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!pf", name = "Nc", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!pf", name = "Oc", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!pf", name = "Pc", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!pf", name = "Qc", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!pf", name = "Rc", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!pf", name = "Tc", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!pf", name = "Uc", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!pf", name = "Vc", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!pf", name = "yc", descriptor = "Lam;")
    public class270 field1485;

    @OriginalMember(owner = "client!pf", name = "xc", descriptor = "Lbk;")
    public static class69 field1484;

    @OriginalMember(owner = "client!pf", name = "zc", descriptor = "Ljava/lang/String;")
    public String field1486;

    @OriginalMember(owner = "client!pf", name = "Sc", descriptor = "[Lme;")
    public static class200[] field1505;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIJILrb;)V", line = 4)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class236 arg10) {
        field1504++;
        if (this.field1485 == null) {
            return;
        }
        class38 var13 = this.field4660 != -1 && this.field4667 == 0 ? class63.method503(this.field4660, (byte) 120) : null;
        class38 var14 = this.field4614 == -1 || this.field1493 || this.field4614 == this.method2062((byte) -121).field1006 && var13 != null ? null : class63.method503(this.field4614, (byte) 121);
        class94 var15 = this.field1485.method1917(29, this.field4655, var14, this.field4656, this.field4636, true, this.field4687, this.field4676, this.field4674, var13, this.field4649);
        int var16 = class84.method665(false);
        if (class162.field2623 && class178.field2841 < 96 && var16 > 50) {
            class101.method814(0);
        }
        if (class209.field3298 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class21.field385) {
                class258.field3832[class21.field385] = new byte[102400];
                class21.field385++;
            }
            while (var17 < class21.field385) {
                class21.field385--;
                class258.field3832[class21.field385] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field4654 = var15.method137();
        if (class56.field853 && (this.field1485.field4160 == -1 || class310.method2191(this.field1485.field4160, 98).field1335)) {
            class94 var18 = class226.method1655(this.field4671, var14 == null ? var13 : var14, 1, this.field4635, arg0, 160, var15, 0, var14 == null ? this.field4655 : this.field4656, 0, 240, this.field4672, true, this.field4610);
            if (class162.field2623) {
                float var19 = class162.method1191();
                float var20 = class162.method1208();
                class162.method1196();
                class162.method1231(var19, var20 - 150.0F);
                var18.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class236) null);
                class162.method1203();
                class162.method1231(var19, var20);
            } else {
                var18.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class236) null);
            }
        }
        if (class345.field5363 == this) {
            for (int var21 = class62.field912.length - 1; var21 >= 0; var21--) {
                class327 var22 = class62.field912[var21];
                if (var22 != null && var22.field5112 != -1) {
                    if (var22.field5113 == 1 && var22.field5117 >= 0 && var22.field5117 < class197.field3029.length) {
                        class86 var23 = class197.field3029[var22.field5117];
                        if (var23 != null) {
                            int var24 = var23.field4671 / 32 - (class345.field5363.field4671 / 32);
                            int var25 = var23.field4672 / 32 - (class345.field5363.field4672 / 32);
                            this.method733(arg4, arg0, arg7, arg2, arg3, arg5, (class236) null, var24, 360000, arg6, -1, var25, arg1, var15, var22.field5112, arg9);
                        }
                    }
                    if (var22.field5113 == 2) {
                        int var26 = (var22.field5121 - class117.field1902) * 4 + 2 - (class345.field5363.field4671 / 32);
                        int var27 = (var22.field5109 - class133.field2118) * 4 - ((class345.field5363.field4672 / 32) - 2);
                        int var28 = var22.field5122 * 4;
                        int var29 = var28 * var28;
                        this.method733(arg4, arg0, arg7, arg2, arg3, arg5, (class236) null, var26, var29, arg6, -1, var27, arg1, var15, var22.field5112, arg9);
                    }
                    if (var22.field5113 == 10 && var22.field5117 >= 0 && var22.field5117 < class74.field1140.length) {
                        class92 var30 = class74.field1140[var22.field5117];
                        if (var30 != null) {
                            int var31 = var30.field4671 / 32 - (class345.field5363.field4671 / 32);
                            int var32 = var30.field4672 / 32 - (class345.field5363.field4672 / 32);
                            this.method733(arg4, arg0, arg7, arg2, arg3, arg5, (class236) null, var31, 360000, arg6, -1, var32, arg1, var15, var22.field5112, arg9);
                        }
                    }
                }
            }
        }
        this.method2067(var15, (byte) -53);
        this.method2068((byte) -12, var15, arg0);
        class94 var33 = null;
        if (!this.field1493 && this.field4679 != -1 && this.field4681 != -1) {
            class74 var34 = class52.method429(4618, this.field4679);
            var33 = var34.method586(this.field4681, this.field4617, (byte) 70, this.field4678);
            if (var33 != null) {
                var33.method757(0, -this.field4647, 0);
                if (var34.field1130) {
                    if (class155.field2517 != 0) {
                        var33.method752(class155.field2517);
                    }
                    if (class294.field4692 != 0) {
                        var33.method745(class294.field4692);
                    }
                    if (class19.field352 != 0) {
                        var33.method757(0, class19.field352, 0);
                    }
                }
            }
        }
        class94 var35 = null;
        if (!this.field1493 && this.field4711 != null) {
            if (class307.field4869 >= this.field4618) {
                this.field4711 = null;
            }
            if (class307.field4869 >= this.field4661 && this.field4618 > class307.field4869) {
                if (this.field4711 instanceof class155) {
                    var35 = (class94) ((class155) this.field4711).method1152(197715105);
                } else {
                    var35 = (class94) this.field4711;
                }
                var35.method757(this.field4642 - this.field4671, this.field4710 - this.field4635, this.field4665 - this.field4672);
                if (this.field4630 == 512) {
                    var35.method747();
                } else if (this.field4630 == 1024) {
                    var35.method749();
                } else if (this.field4630 == 1536) {
                    var35.method748();
                }
            }
        }
        if (class162.field2623) {
            var15.field1524 = true;
            var15.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4664);
            if (var33 != null) {
                var33.field1524 = true;
                var33.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4664);
            }
        } else {
            if (var33 != null) {
                var15 = ((class271) var15).method1937(var33);
            }
            if (var35 != null) {
                var15 = ((class271) var15).method1937(var35);
            }
            var15.field1524 = true;
            var15.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4664);
        }
        if (var35 == null) {
            return;
        }
        if (this.field4630 == 512) {
            var35.method748();
        } else if (this.field4630 == 1024) {
            var35.method749();
        } else if (this.field4630 == 1536) {
            var35.method747();
        }
        var35.method757(this.field4671 - this.field4642, -this.field4710 + this.field4635, this.field4672 - this.field4665);
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V", line = 259)
    public static void method729(int arg0) {
        field1487 = null;
        if (arg0 < -107) {
            field1505 = null;
            field1484 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 275)
    public static final void method730(String arg0, int arg1) {
        field1502++;
        class259.field3844 = arg0;
        if (field1484.field1037 == null) {
            return;
        }
        try {
            String var2 = field1484.field1037.getParameter("cookieprefix");
            String var3 = field1484.field1037.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class293.method2055(class212.method1543(22326) + 94608000000L, false) + "; Max-Age=" + 94608000L;
            }
            class51.method421(-10156, field1484.field1037, "document.cookie=\"" + var5 + "\"");
            int var6 = -11 / ((arg1 + 75) / 50);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V", line = 307)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1500++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILaj;)V", line = 320)
    public final void method731(int arg0, class1 arg1) {
        field1482++;
        arg1.field48 = 0;
        int var3 = arg1.method15((byte) 112);
        boolean var4 = (var3 & 0x4) != 0;
        int var5 = var3 & 0x1;
        int var6 = super.method738(-6421);
        this.method2069(((var3 & 0x39) >> 3) + 1, (byte) 96);
        this.field1492 = (byte) ((var3 & 0xD3) >> 6);
        this.field4671 += (this.method738(-6421) - var6) * 64;
        this.field4672 += (this.method738(arg0 + 14391) - var6) * 64;
        int var7 = -1;
        int[] var8 = new int[12];
        this.field1479 = arg1.method55(4);
        this.field1483 = arg1.method55(4);
        this.field1511 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method15((byte) 111);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method15((byte) -42);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method56(arg0 + 40424);
                    this.field1511 = arg1.method15((byte) -77);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class216.field3361[var12 - 32768];
                    var8[var9] = class251.method1740(1073741824, var13);
                    int var14 = class188.method1361(true, var13).field2190;
                    if (var14 != 0) {
                        this.field1511 = var14;
                    }
                } else {
                    var8[var9] = class251.method1740(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        if (arg0 != -20812) {
            method730((String) null, -80);
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method15((byte) 111);
            if (var17 < 0 || class167.field2688[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4632 = arg1.method56(19612);
        long var18 = arg1.method28((byte) -53);
        this.field1486 = class150.method1134(arg0 ^ 0xFFFFAEF0, var18);
        this.field1475 = arg1.method15((byte) -88);
        if (var4) {
            this.field1481 = arg1.method56(19612);
            this.field1478 = -1;
            this.field1497 = this.field1475;
        } else {
            this.field1481 = 0;
            this.field1497 = arg1.method15((byte) -24);
            this.field1478 = arg1.method15((byte) 122);
            if (this.field1478 == 255) {
                this.field1478 = -1;
            }
        }
        int var20 = this.field1509;
        this.field1509 = arg1.method15((byte) -98);
        if (this.field1509 == 0) {
            class327.method2301(this, false);
        } else {
            int var21 = this.field1499;
            int var22 = this.field1510;
            int var23 = this.field1477;
            int var24 = this.field1495;
            int var25 = this.field1491;
            this.field1499 = arg1.method56(19612);
            this.field1510 = arg1.method56(19612);
            this.field1477 = arg1.method56(19612);
            this.field1495 = arg1.method56(19612);
            this.field1491 = arg1.method15((byte) 94);
            if (this.field1509 != var20 || this.field1499 != var21 || this.field1510 != var22 || this.field1477 != var23 || this.field1495 != var24 || this.field1491 != var25) {
                class20.method209(arg0 ^ 0xFFFFAEB4, this);
            }
        }
        if (this.field1485 == null) {
            this.field1485 = new class270();
        }
        int var26 = this.field1485.field4160;
        this.field1485.method1921(var7, var15, this.field4632, true, var5 == 1, var8);
        if (var7 != var26) {
            this.field4671 = this.field4643[0] * 128 + (this.method738(-6421) * 64);
            this.field4672 = this.field4619[0] * 128 + (this.method738(-6421) * 64);
        }
        if (this.field4664 != null) {
            this.field4664.method1687();
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IB)Lij;", line = 484)
    public static final class90 method732(int arg0, byte arg1) {
        class90 var2 = (class90) class174.field2777.method2288((long) arg0, (byte) 96);
        field1506++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == -67) {
            byte[] var3 = class282.field4418.method967(29, arg0, 65280);
            class90 var4 = new class90();
            if (var3 != null) {
                var4.method712(new class1(var3), -8625, arg0);
            }
            class174.field2777.method2281(0, (long) arg0, var4);
            return var4;
        } else {
            return (class90) null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIILrb;IIIIIILie;II)V", line = 522)
    private final void method733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class236 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13, int arg14, int arg15) {
        field1488++;
        int var17 = arg7 * arg7 + arg11 * arg11;
        if (var17 < 16 || arg8 < var17 || arg10 != -1) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg7, (double) arg11) * 325.949D) & 0x7FF;
        class94 var19 = class168.method1248(arg13, this.field4672, 8358, this.field4635, this.field4671, arg14, var18);
        if (var19 == null) {
            return;
        }
        if (!class162.field2623) {
            var19.method117(0, arg12, arg3, arg4, arg0, arg5, arg9, arg2, -1L, arg15, arg6);
            return;
        }
        float var20 = class162.method1191();
        float var21 = class162.method1208();
        class162.method1196();
        class162.method1231(var20, var21 - 150.0F);
        var19.method117(0, arg12, arg3, arg4, arg0, arg5, arg9, arg2, -1L, arg15, arg6);
        class162.method1203();
        class162.method1231(var20, var21);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I", line = 562)
    public final int method680(int arg0) {
        int var2 = -18 % ((52 - arg0) / 61);
        field1496++;
        return this.field4632;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLpk;Lpk;)I", line = 578)
    public static final int method734(byte arg0, class120 arg1, class120 arg2) {
        field1501++;
        int var3 = 64 / ((-arg0 - 30) / 39);
        int var4 = 0;
        if (arg2.method939((byte) 57, class147.field2403)) {
            var4++;
        }
        if (arg2.method939((byte) 77, class74.field1119)) {
            var4++;
        }
        if (arg2.method939((byte) 52, class258.field3838)) {
            var4++;
        }
        if (arg1.method939((byte) 71, class147.field2403)) {
            var4++;
        }
        if (arg1.method939((byte) 45, class74.field1119)) {
            var4++;
        }
        if (arg1.method939((byte) 103, class258.field3838)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)Z", line = 627)
    public final boolean method681(boolean arg0) {
        field1476++;
        if (!arg0) {
            this.method137();
        }
        return this.field1485 != null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)Ljava/lang/String;", line = 641)
    public final String method735(byte arg0) {
        field1490++;
        int var2 = 33 / ((arg0 - 37) / 62);
        String var3 = this.field1486;
        if (class183.field2904 != null) {
            var3 = class183.field2904[this.field1492] + var3;
        }
        if (class331.field5146 != null) {
            var3 = var3 + class331.field5146[this.field1492];
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZ)V", line = 661)
    public final void method736(int arg0, int arg1, int arg2, boolean arg3) {
        field1480++;
        if (arg1 == -2436) {
            super.method2070(arg2, this.method738(-6421), arg1 + 2530, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()I", line = 672)
    public final int method137() {
        field1508++;
        return this.field4654;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V", line = 685)
    public static final void method737(int arg0) {
        for (int var1 = arg0; var1 < class83.field1290; var1++) {
            int var2 = class76.field1192[var1];
            class86 var3 = class197.field3029[var2];
            if (var3 != null) {
                class122.method974(var3.field1381.field1363, var3, -20);
            }
        }
        field1494++;
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V", line = 723)
    protected final void finalize() {
        field1507++;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I", line = 732)
    public final int method738(int arg0) {
        if (arg0 != -6421) {
            method729(20);
        }
        field1498++;
        return this.field1485 == null || this.field1485.field4160 == -1 ? super.method738(arg0) : class310.method2191(this.field1485.field4160, 55).field1363;
    }
}
