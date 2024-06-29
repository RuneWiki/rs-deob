import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class247 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public int field3629 = 8;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field3634 = 16777215;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field3641 = 0;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lvq;")
    public static class24 field3643 = new class24(95, 7);

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[C")
    public static char[] field3644 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Ljn;")
    public static class409 field3645 = new class409("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Ljn;")
    public static class409 field3646 = new class409("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field3647 = -1;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
    public static byte[] field3648 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "F")
    public static float field3633;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public int field3636;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field3642;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field3649;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
    public boolean field3630;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1636(int arg0, boolean arg1, String arg2) {
        field3640++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        if (arg0 != 98) {
            field3633 = -0.2559223F;
        }
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class270.field4000 : class383.field5616) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class150 var11 = class51.method399((byte) -28, var8);
            if (var11.field2042 && var11.method1032(1).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class92.field1137 = null;
                    class127.field1684 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class92.field1137 = var4;
        class127.field1684 = var5;
        class178.field2512 = 0;
        String[] var9 = new String[class127.field1684];
        for (int var10 = 0; var10 < class127.field1684; var10++) {
            var9[var10] = class51.method399((byte) -28, var4[var10]).method1032(arg0 - 97);
        }
        class216.method1492((byte) -122, class92.field1137, var9);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILfp;IIII)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, class9 arg4, int arg5, int arg6, int arg7, int arg8) {
        field3631++;
        class438 var9 = (class438) class319.method2098(arg6, arg2, arg7);
        if (arg8 <= 70) {
            return;
        }
        if (var9 != null) {
            class178 var10 = class450.method2785(var9.method9((byte) 120), (byte) 89);
            int var11 = var9.method1(-105) & 0x3;
            int var12 = var9.method6(-20839);
            if (var10.field2458 == -1) {
                int var13 = arg0;
                if (var10.field2479 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method155(arg3, 4, var13, 1, arg1);
                    } else if (var11 == 1) {
                        arg4.method126(arg3, var13, 4, 2702, arg1);
                    } else if (var11 == 2) {
                        arg4.method155(arg3 + 3, 4, var13, 1, arg1);
                    } else if (var11 == 3) {
                        arg4.method126(arg3, var13, 4, 2702, arg1 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method150(-41, arg1, arg3, 1, var13, 1);
                    } else if (var11 == 1) {
                        arg4.method150(-87, arg1, arg3 + 3, 1, var13, 1);
                    } else if (var11 == 2) {
                        arg4.method150(-113, arg1 + 3, arg3 + 3, 1, var13, 1);
                    } else if (var11 == 3) {
                        arg4.method150(-100, arg1 + 3, arg3, 1, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method126(arg3, var13, 4, 2702, arg1);
                    } else if (var11 == 1) {
                        arg4.method155(arg3 + 3, 4, var13, 1, arg1);
                    } else if (var11 == 2) {
                        arg4.method126(arg3, var13, 4, 2702, arg1 + 3);
                    } else if (var11 == 3) {
                        arg4.method155(arg3, 4, var13, 1, arg1);
                    }
                }
            } else {
                class77.method539(var11, arg3, -128, arg1, arg4, var10);
            }
        }
        class438 var14 = (class438) class188.method1287(arg6, arg2, arg7, field3649 == null ? (field3649 = method1642("jb")) : field3649);
        if (var14 != null) {
            class178 var15 = class450.method2785(var14.method9((byte) 126), (byte) 94);
            int var16 = var14.method1(-93) & 0x3;
            int var17 = var14.method6(-20839);
            if (var15.field2458 != -1) {
                class77.method539(var16, arg3, -128, arg1, arg4, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field2479 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method130(var18, arg3, arg1, arg1 + 3, (byte) 90, arg3 + 3);
                } else {
                    arg4.method130(var18, arg3, arg1 + 3, arg1, (byte) 88, arg3 + 3);
                }
            }
        }
        class438 var19 = (class438) class137.method913(arg6, arg2, arg7);
        if (var19 == null) {
            return;
        }
        class178 var20 = class450.method2785(var19.method9((byte) 116), (byte) 104);
        int var21 = var19.method1(-84) & 0x3;
        if (var20.field2458 != -1) {
            class77.method539(var21, arg3, -128, arg1, arg4, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
    public static final void method1638(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            class257.method1773((byte) -10, class159.field2127);
            class206.field2888++;
        }
        field3638++;
        if (arg0 == 1) {
            class257.method1773((byte) -10, class346.field5097);
            class456.field6743++;
        }
        class159.field2132.method1727(-128, class436.field6368.method256(-107, 82) ? 1 : 0);
        if (arg2 != 112) {
            field3646 = null;
        }
        class159.field2132.method1744((byte) -108, arg3 + class134.field1846);
        class159.field2132.method1750((byte) 0, arg1 + class28.field399);
        field3647 = arg3;
        class36.field516 = arg1;
        class441.field6418 = false;
        class294.method1955((byte) -38);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILat;)V")
    private final void method1639(int arg0, int arg1, int arg2, class256 arg3) {
        if (arg2 == 1) {
            this.field3629 = arg3.method1767(1930493576);
        } else if (arg2 == 2) {
            this.field3630 = true;
        } else if (arg2 == 3) {
            this.field3637 = arg3.method1747((byte) 12);
            this.field3635 = arg3.method1747((byte) 12);
            this.field3628 = arg3.method1747((byte) 12);
        } else if (arg2 == 4) {
            this.field3632 = arg3.method1738((byte) -125);
        } else if (arg2 == 5) {
            this.field3636 = arg3.method1767(1930493576);
        } else if (arg2 == 6) {
            this.field3634 = arg3.method1725((byte) 0);
        }
        if (arg1 < -92) {
            field3639++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLat;I)V")
    public final void method1640(byte arg0, class256 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1738((byte) -30);
            if (var4 == 0) {
                field3642++;
                if (arg0 > -43) {
                    this.field3634 = -25;
                    return;
                }
                return;
            }
            this.method1639(arg2, -118, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method1641(byte arg0) {
        field3645 = null;
        field3646 = null;
        field3643 = null;
        if (arg0 <= -118) {
            field3644 = null;
            field3648 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1642(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
