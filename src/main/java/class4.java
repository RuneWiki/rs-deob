import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 extends class5 {

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Lec;")
    public static class99 field45 = new class99(260);

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[B")
    public static byte[] field62 = new byte[32896];

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Z", line = 8)
    public final boolean method22(int arg0) {
        field42++;
        int var2 = 108 % ((-arg0 - 44) / 55);
        return ((this.field54 & 0x54F64D) >> 22) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Lmf;", line = 22)
    public static final class188 method23(int arg0) {
        field49++;
        class188 var1 = (class188) class328.field5058.method1811(arg0 ^ 0x7);
        if (var1 != null) {
            var1.method39(10717);
            var1.method2257(false);
            return var1;
        }
        if (arg0 != 0) {
            field52 = 41;
        }
        class188 var2;
        do {
            var2 = (class188) class170.field2743.method1811(arg0 ^ 0x7);
            if (var2 == null) {
                return null;
            }
            if (var2.method1394(arg0 ^ 0x7F) > class105.method789((byte) 55)) {
                return null;
            }
            var2.method39(10717);
            var2.method2257(false);
        } while ((var2.field5013 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)Z", line = 66)
    public final boolean method24(int arg0) {
        field44++;
        if (arg0 <= 23) {
            this.method22(84);
        }
        return (this.field54 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)Z", line = 80)
    public final boolean method25(int arg0) {
        field61++;
        if (arg0 != -1) {
            this.field54 = -71;
        }
        return ((this.field54 & 0x2943BB7F) >> 29) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z", line = 92)
    public final boolean method26(int arg0, int arg1) {
        field57++;
        if (arg0 == 1) {
            return (this.field54 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lbo;", line = 103)
    public static final class333 method27(boolean arg0) {
        field56++;
        try {
            if (arg0) {
                method29(-104, (byte) -56);
            }
            return (class333) Class.forName("vg").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class274();
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)Z", line = 120)
    public final boolean method28(boolean arg0) {
        field43++;
        if (arg0) {
            field45 = (class99) null;
        }
        return (this.field54 & 0x10FD721B) >> 28 != 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)I", line = 132)
    public static final int method29(int arg0, byte arg1) {
        if (arg1 != -55) {
            field52 = -123;
        }
        field63++;
        if (class1.field20 != null) {
            class1.field20.method1653(-19746);
            class1.field20 = null;
        }
        class323.field4990++;
        if (class323.field4990 > 4) {
            class323.field4990 = 0;
            class151.field2284 = 0;
            return arg0;
        }
        class151.field2284 = 0;
        if (class75.field1092 == class280.field4347) {
            class75.field1092 = class320.field4954;
        } else {
            class75.field1092 = class280.field4347;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V", line = 171)
    public static void method30(byte arg0) {
        field62 = null;
        field45 = null;
        if (arg0 >= -80) {
            method33(-76, -2, (byte[]) null, 31);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V", line = 180)
    public class4(int arg0, int arg1) {
        this.field54 = arg0;
        this.field48 = arg1;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)I", line = 194)
    public final int method31(boolean arg0) {
        field55++;
        if (arg0) {
            this.method28(true);
        }
        return this.field54 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)Z", line = 205)
    public final boolean method32(int arg0) {
        field53++;
        int var2 = -70 % ((65 - arg0) / 45);
        return (this.field54 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[BI)Z", line = 215)
    public static final boolean method33(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 1) {
            return true;
        }
        boolean var4 = true;
        int var5 = -1;
        class254 var6 = new class254(arg2);
        field47++;
        label62: while (true) {
            int var7 = var6.method1753(0);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var6.method1730(false);
                    if (var11 == 0) {
                        continue label62;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 >> 6 & 0x3F;
                    int var13 = arg1 + var12;
                    int var14 = var9 & 0x3F;
                    int var15 = var14 + arg0;
                    int var16 = var6.method1774((byte) 95) >> 2;
                    if (var13 > 0 && var15 > 0 && var13 < 103 && var15 < 103) {
                        class32 var17 = class226.method1607(-119, var5);
                        if (var16 != 22 || class320.field4958 || var17.field407 != 0 || var17.field466 == 1 || var17.field478) {
                            var8 = true;
                            if (!var17.method260(-1)) {
                                class233.field3541++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var6.method1730(false);
                if (var10 == 0) {
                    break;
                }
                var6.method1774((byte) 39);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)I", line = 299)
    public final int method34(int arg0) {
        if (arg0 <= 24) {
            field62 = (byte[]) null;
        }
        field58++;
        return class323.method2244(this.field54, -1);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field62[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)V", line = 321)
    public static final void method35(int arg0) {
        field51++;
        if (class229.method1618(-89) != 2) {
            return;
        }
        byte var1 = (byte) (class211.field3240 - 4 & 0xFF);
        int var2 = class211.field3240 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class2.field25[var3][var2][var4] = var1;
            }
        }
        if (~class265.field4112 == arg0) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class300.field4618[var5] = -1000000;
            class27.field294[var5] = 1000000;
            class201.field3097[var5] = 0;
            class242.field3684[var5] = 1000000;
            class13.field174[var5] = 0;
        }
        if (class268.field4168 != 1) {
            int var16 = class328.method2291(class265.field4112, class197.field3028, class190.field2976, 114);
            if (var16 - class7.field111 < 800 && (class324.field5005[class265.field4112][class190.field2976 >> 7][class197.field3028 >> 7] & 0x4) != 0) {
                class134.method1032(1, (byte) -89, class213.field3262, false, class190.field2976 >> 7, class197.field3028 >> 7);
            }
            return;
        }
        if ((class324.field5005[class265.field4112][class39.field575.field4713 >> 7][class39.field575.field4731 >> 7] & 0x4) != 0) {
            class134.method1032(0, (byte) -89, class213.field3262, false, class39.field575.field4713 >> 7, class39.field575.field4731 >> 7);
        }
        if (class193.field3015 >= 310) {
            return;
        }
        int var6 = class190.field2976 >> 7;
        int var7 = class197.field3028 >> 7;
        int var8 = class39.field575.field4713 >> 7;
        int var9;
        if (var6 >= var8) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10 = class39.field575.field4731 >> 7;
        int var11;
        if (var7 >= var10) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        if (var9 == 0 && var11 == 0 || var9 <= -104 || var9 >= 104 || var11 <= -104 || var11 >= 104) {
            class189.method1401(true, (Throwable) null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var10 + " " + class327.field5054 + "," + class293.field4522);
            return;
        }
        if (var11 >= var9) {
            int var14 = var9 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var10) {
                if (var10 > var7) {
                    var7++;
                } else if (var10 < var7) {
                    var7--;
                }
                if ((class324.field5005[class265.field4112][var6][var7] & 0x4) != 0) {
                    class134.method1032(1, (byte) -89, class213.field3262, false, var6, var7);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    var15 -= 65536;
                    if ((class324.field5005[class265.field4112][var6][var7] & 0x4) != 0) {
                        class134.method1032(1, (byte) -89, class213.field3262, false, var6, var7);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var9;
        int var13 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class324.field5005[class265.field4112][var6][var7] & 0x4) != 0) {
                class134.method1032(1, (byte) -89, class213.field3262, false, var6, var7);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var7 < var10) {
                    var7++;
                } else if (var7 > var10) {
                    var7--;
                }
                var13 -= 65536;
                if ((class324.field5005[class265.field4112][var6][var7] & 0x4) != 0) {
                    class134.method1032(1, (byte) -89, class213.field3262, false, var6, var7);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "(I)Z", line = 516)
    public final boolean method36(int arg0) {
        if (arg0 == 1463190736) {
            field46++;
            return ((this.field54 & 0x573684D0) >> 30) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(Z)Z", line = 554)
    public final boolean method37(boolean arg0) {
        if (arg0) {
            field50++;
            return (this.field54 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }
}
