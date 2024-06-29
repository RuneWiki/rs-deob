import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Ltq;")
    public static class426 field119 = new class426(14, 3);

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Lfe;")
    public static class384 field130 = new class384(512);

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[C")
    public static char[] field132 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Lqg;")
    public static class307 field117;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[I")
    public static int[] field123;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field129;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 8)
    public static final void method60(byte arg0) {
        int var1 = -68 / ((-arg0 - 27) / 40);
        field122++;
        if (class435.field6375) {
            return;
        }
        if (class118.field1533.field6908) {
            class506.field7722 = ((int) class506.field7722 - 65 & 0xFFFFFF80);
        } else {
            class242.field3485 += (-class242.field3485 - 24.0F) / 2.0F;
        }
        class435.field6375 = true;
        class477.field6873 = true;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 31)
    public static void method61(byte arg0) {
        field123 = null;
        field117 = null;
        field129 = null;
        field130 = null;
        field119 = null;
        if (arg0 == -33) {
            field132 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIIII)V", line = 46)
    public static final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field120++;
        class234 var10 = null;
        for (class234 var11 = (class234) class117.field1517.method2096(-21400); var11 != null; var11 = (class234) class117.field1517.method2084((byte) 19)) {
            if (var11.field3276 == arg9 && var11.field3283 == arg3 && var11.field3280 == arg0 && var11.field3284 == arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class234();
            var10.field3280 = arg0;
            var10.field3284 = arg1;
            var10.field3283 = arg3;
            var10.field3276 = arg9;
            if (arg3 >= 0 && arg0 >= 0 && arg3 < class362.field5442 && arg0 < class203.field2813) {
                class290.method1754(var10, true);
            }
            class117.field1517.method2086((byte) -113, var10);
        }
        var10.field3272 = arg6;
        var10.field3279 = arg8;
        var10.field3275 = arg2;
        int var12 = -119 % ((3 - arg5) / 33);
        var10.field3281 = arg4;
        var10.field3274 = arg7;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lmd;IB)V", line = 90)
    public static final void method63(class364 arg0, int arg1, byte arg2) {
        if (arg2 >= -56) {
            method61((byte) 25);
        }
        field118++;
        boolean var3 = arg0.method2229(1, -1) == 1;
        if (var3) {
            class337.field4880[class84.field1160++] = arg1;
        }
        int var4 = arg0.method2229(2, -1);
        class313 var5 = class262.field3742[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field4590 = false;
            } else if (class156.field2047 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class223 var6 = class135.field1726[arg1] = new class223();
                var6.field3154 = (var5.field4282[0] + class223.field3158 >> 6) + (var5.field4279[0] + class455.field6637 >> 6 << 14) + (var5.field2956 << 28);
                if (var5.field4570 == -1) {
                    var6.field3153 = var5.field4200.method222(16383);
                } else {
                    var6.field3153 = var5.field4570;
                }
                var6.field3147 = var5.field4557;
                var6.field3148 = var5.field4222;
                if (var5.field4585 > 0) {
                    class78.method514(var5, (byte) 72);
                }
                class262.field3742[arg1] = null;
                if (arg0.method2229(1, -1) != 0) {
                    class405.method2423(arg0, 65375, arg1);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2229(3, -1);
            int var8 = var5.field4279[0];
            int var9 = var5.field4282[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field4590 = true;
                var5.field4595 = var8;
                var5.field4587 = var9;
            } else {
                var5.method1884(class69.field1019[arg1], var8, var9, (byte) 12);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2229(4, -1);
            int var11 = var5.field4279[0];
            int var12 = var5.field4282[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field4595 = var11;
                var5.field4587 = var12;
                var5.field4590 = true;
            } else {
                var5.method1884(class69.field1019[arg1], var11, var12, (byte) 12);
            }
        } else {
            int var13 = arg0.method2229(1, -1);
            if (var13 == 0) {
                int var14 = arg0.method2229(12, -1);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E9) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field4279[0] + var16;
                int var19 = var5.field4282[0] + var17;
                if (var3) {
                    var5.field4590 = true;
                    var5.field4595 = var18;
                    var5.field4587 = var19;
                } else {
                    var5.method1884(class69.field1019[arg1], var18, var19, (byte) 12);
                }
                var5.field2956 = (byte) (var5.field2956 + var15 & 0x3);
                if (class156.field2047 == arg1) {
                    class355.field5121 = var5.field2956;
                }
            } else {
                int var20 = arg0.method2229(30, -1);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field4279[0] + class455.field6637 + var22 & 0x3FFF) - class455.field6637;
                int var25 = (var5.field4282[0] + class223.field3158 + var23 & 0x3FFF) - class223.field3158;
                if (var3) {
                    var5.field4595 = var24;
                    var5.field4587 = var25;
                    var5.field4590 = true;
                } else {
                    var5.method1884(class69.field1019[arg1], var24, var25, (byte) 12);
                }
                var5.field2956 = (byte) (var5.field2956 + var21 & 0x3);
                if (class156.field2047 == arg1) {
                    class355.field5121 = var5.field2956;
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V", line = 402)
    public static final void method64(byte arg0) {
        class170.method1068(-89, class164.field2146);
        if (arg0 < 93) {
            field132 = null;
        }
        field126++;
        class327.field4766++;
        if (class318.field4664 && class212.field3006) {
            int var1 = class137.field1797.method2038(9);
            int var2 = class137.field1797.method2044((byte) -87);
            int var3 = var2 - class389.field5776;
            int var4 = var1 - class117.field1518;
            if (class295.field4284 > var4) {
                var4 = class295.field4284;
            }
            if (class295.field4284 + class65.field965.field5168 < class164.field2146.field5168 + var4) {
                var4 = class295.field4284 + class65.field965.field5168 - class164.field2146.field5168;
            }
            if (var3 < class65.field967) {
                var3 = class65.field967;
            }
            if (class65.field967 + class65.field965.field5169 < class164.field2146.field5169 + var3) {
                var3 = class65.field967 + class65.field965.field5169 - class164.field2146.field5169;
            }
            int var5 = class65.field965.field5219 + var4 - class295.field4284;
            int var6 = class65.field965.field5144 + var3 - class65.field967;
            if (class137.field1797.method2082(1878308764)) {
                if (class327.field4766 > class164.field2146.field5200) {
                    int var8 = var4 - class45.field686;
                    int var9 = var3 - class324.field4739;
                    if (class164.field2146.field5247 < var8 || (-class164.field2146.field5247) > var8 || var9 > class164.field2146.field5247 || var9 < -class164.field2146.field5247) {
                        class89.field1214 = true;
                    }
                }
                if (class164.field2146.field5242 != null && class89.field1214) {
                    class99 var10 = new class99();
                    var10.field1351 = var6;
                    var10.field1343 = class164.field2146;
                    var10.field1346 = class164.field2146.field5242;
                    var10.field1345 = var5;
                    class396.method2358(var10);
                }
            } else {
                if (class89.field1214) {
                    class489.method2941(-1);
                    if (class164.field2146.field5297 != null) {
                        class99 var7 = new class99();
                        var7.field1346 = class164.field2146.field5297;
                        var7.field1345 = var5;
                        var7.field1343 = class164.field2146;
                        var7.field1351 = var6;
                        var7.field1350 = class104.field1403;
                        class396.method2358(var7);
                    }
                    if (class104.field1403 != null && client.method1180(class164.field2146) != null) {
                        class466.method2730(class164.field2146, class104.field1403, 0);
                    }
                } else if ((class318.field4671 == 1 || class53.method404(-1)) && class383.field5696 > 2) {
                    class170.method1077(class389.field5776 + class324.field4739, class117.field1518 - -class45.field686, 5486);
                } else if (class43.method319((byte) 49)) {
                    class170.method1077(class389.field5776 + class324.field4739, class117.field1518 - -class45.field686, 5486);
                }
                class164.field2146 = null;
            }
        } else if (class327.field4766 > 1) {
            class164.field2146 = null;
        }
    }
}
