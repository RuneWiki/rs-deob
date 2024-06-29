import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class116 extends class110 {

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    private int field1765 = 12288;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    private int field1774 = 4096;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    private int field1777 = 0;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    private int field1780 = 2048;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    private int field1771 = 2048;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    private int field1782 = 8192;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    private int field1785 = 0;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1779 = 0;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "[I")
    public static int[] field1783 = new int[50];

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Llm;")
    public static class210 field1766;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            field1779 = 126;
        }
        field1767++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = class177.field2615[arg1] - 2048;
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                int var6 = this.field1785 + var4;
                int var7 = class249.field3714[var5] - 2048;
                int var8 = var6 < -2048 ? var6 + 4096 : var6;
                int var9 = this.field1777 + var7;
                int var10 = var7 + this.field1780;
                int var11 = var8 <= 2048 ? var8 : var8 - 4096;
                int var12 = var9 < -2048 ? var9 + 4096 : var9;
                int var13 = var12 > 2048 ? var12 - 4096 : var12;
                int var14 = this.field1771 + var4;
                int var15 = var10 >= -2048 ? var10 : var10 + 4096;
                int var16 = var14 < -2048 ? var14 + 4096 : var14;
                int var17 = var16 > 2048 ? var16 - 4096 : var16;
                int var18 = var15 > 2048 ? var15 - 4096 : var15;
                var3[var5] = this.method800(var11, arg0 - 21493, var18) || this.method797(var13, var17, 2047) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILre;I)V", line = 65)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 > -37) {
            return;
        }
        if (arg0 == 0) {
            this.field1780 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field1785 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field1777 = arg1.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field1771 = arg1.method1830((byte) -77);
        } else if (arg0 == 4) {
            this.field1765 = arg1.method1830((byte) -77);
        } else if (arg0 == 5) {
            this.field1774 = arg1.method1830((byte) -77);
        } else if (arg0 == 6) {
            this.field1782 = arg1.method1830((byte) -77);
        }
        field1784++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 143)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class164 var13 = new class164();
        var13.field2475 = arg0;
        var13.field2482 = arg2;
        var13.field2470 = arg9;
        var13.field2478 = arg11;
        var13.field2472 = arg7;
        var13.field2477 = arg12;
        var13.field2485 = arg3;
        var13.field2469 = arg4;
        field1768++;
        var13.field2483 = arg5;
        var13.field2471 = arg6;
        var13.field2479 = arg8;
        var13.field2476 = arg10;
        if (arg1 == 4) {
            class12.field131.method1108(var13, 65280);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 197)
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 172)
    public static void method794(boolean arg0) {
        field1783 = null;
        field1766 = null;
        if (arg0) {
            method796(31, -22, -1, (byte) 114, -20, -1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V", line = 184)
    public static final void method795(int arg0) {
        class56.field707.method2182(false);
        field1781++;
        class183.field2734.method2182(false);
        if (arg0 != -26897) {
            method796(52, -17, -71, (byte) -30, 83, -61);
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 214)
    public final void method47(int arg0) {
        if (arg0 != -9) {
            method798(-86, -89, (byte) 46, -110, -7);
        }
        field1776++;
        class314.method2157(-71);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIBII)V", line = 226)
    public static final void method796(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1778++;
        int var6 = arg5 - arg0;
        int var7 = arg1 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class61.method408((byte) -34, arg4, arg1, arg2, arg0);
            }
        } else if (var7 == 0) {
            class184.method1268((byte) 106, arg5, arg2, arg4, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            if (arg3 <= 1) {
                field1769 = -70;
            }
            int var9 = arg4 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class157.field2357) {
                var10 = (class157.field2357 * var8 >> 12) + var9;
                var11 = class157.field2357;
            } else if (class184.field2761 >= arg0) {
                var10 = arg4;
                var11 = arg0;
            } else {
                var10 = var9 + (class184.field2761 * var8 >> 12);
                var11 = class184.field2761;
            }
            if (class185.field2769 > var10) {
                var11 = (class185.field2769 - var9 << 12) / var8;
                var10 = class185.field2769;
            } else if (class166.field2494 < var10) {
                var10 = class166.field2494;
                var11 = (class166.field2494 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class157.field2357 > arg5) {
                var12 = (class157.field2357 * var8 >> 12) + var9;
                var13 = class157.field2357;
            } else if (class184.field2761 < arg5) {
                var12 = (class184.field2761 * var8 >> 12) + var9;
                var13 = class184.field2761;
            } else {
                var13 = arg5;
                var12 = arg1;
            }
            if (class185.field2769 > var12) {
                var12 = class185.field2769;
                var13 = (class185.field2769 - var9 << 12) / var8;
            } else if (class166.field2494 < var12) {
                var13 = (class166.field2494 - var9 << 12) / var8;
                var12 = class166.field2494;
            }
            class51.method344(var11, var13, (byte) 105, var12, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III)Z", line = 333)
    private final boolean method797(int arg0, int arg1, int arg2) {
        field1770++;
        if (arg2 != 2047) {
            method799((byte) -41, -97, 104, -85, 99, 41, 1, -86);
        }
        int var4 = (arg0 + arg1) * this.field1765 >> 12;
        int var5 = class321.field4852[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field1765;
        int var7 = (var6 << 12) / this.field1782;
        int var8 = this.field1774 * var7 >> 12;
        return (arg1 - arg0) < var8 && (arg1 - arg0) > (-var8);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIBII)V", line = 358)
    public static final void method798(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -12) {
            field1783 = (int[]) null;
        }
        int var5 = 0;
        class315.method2160(class40.field488[arg4], arg1, arg0 + arg3, -arg0 + arg3, 7);
        field1773++;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class40.field488[arg4 + var6];
                var7 -= var6 << 1;
                int[] var10 = class40.field488[arg4 - var6];
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                class315.method2160(var9, arg1, var12, var11, 7);
                class315.method2160(var10, arg1, var12, var11, 7);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class40.field488[arg4 + var5];
            int[] var16 = class40.field488[arg4 - var5];
            class315.method2160(var15, arg1, var13, var14, 7);
            class315.method2160(var16, arg1, var13, var14, 7);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIIIIIII)V", line = 416)
    public static final void method799(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 > -124) {
            method794(false);
        }
        if (arg7 >= 0 && arg1 >= 0 && arg7 < 103 && arg1 < 103) {
            if (arg2 == 0) {
                class163 var8 = class300.method2091(arg6, arg7, arg1);
                if (var8 != null) {
                    int var9 = (int) (var8.field2448 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 2) {
                        var8.field2451 = new class17(var9, 2, arg4 + 4, arg6, arg7, arg1, arg3, false, var8.field2451);
                        var8.field2452 = new class17(var9, 2, arg4 + 1 & 0x3, arg6, arg7, arg1, arg3, false, var8.field2452);
                    } else {
                        var8.field2451 = new class17(var9, arg5, arg4, arg6, arg7, arg1, arg3, false, var8.field2451);
                    }
                }
            }
            if (arg2 == 1) {
                class226 var10 = class8.method30(arg6, arg7, arg1);
                if (var10 != null) {
                    int var11 = (int) (var10.field3440 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field3450 = new class17(var11, 4, arg4, arg6, arg7, arg1, arg3, false, var10.field3450);
                    } else if (arg5 == 6) {
                        var10.field3450 = new class17(var11, 4, arg4 + 4, arg6, arg7, arg1, arg3, false, var10.field3450);
                    } else if (arg5 == 7) {
                        var10.field3450 = new class17(var11, 4, (arg4 + 2 & 0x3) + 4, arg6, arg7, arg1, arg3, false, var10.field3450);
                    } else if (arg5 == 8) {
                        var10.field3450 = new class17(var11, 4, arg4 + 4, arg6, arg7, arg1, arg3, false, var10.field3450);
                        var10.field3435 = new class17(var11, 4, (arg4 + 2 & 0x3) + 4, arg6, arg7, arg1, arg3, false, var10.field3435);
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 11) {
                    arg5 = 10;
                }
                class311 var12 = class187.method1283(arg6, arg7, arg1);
                if (var12 != null) {
                    var12.field4728 = new class17((int) (var12.field4720 >>> 32) & Integer.MAX_VALUE, arg5, arg4, arg6, arg7, arg1, arg3, false, var12.field4728);
                }
            }
            if (arg2 == 3) {
                class187 var13 = class179.method1235(arg6, arg7, arg1);
                if (var13 != null) {
                    var13.field2781 = new class17((int) (var13.field2787 >>> 32) & Integer.MAX_VALUE, 22, arg4, arg6, arg7, arg1, arg3, false, var13.field2781);
                }
            }
        }
        field1772++;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(III)Z", line = 514)
    private final boolean method800(int arg0, int arg1, int arg2) {
        field1775++;
        int var4 = (arg0 - arg2) * this.field1765 >> 12;
        int var5 = class321.field4852[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field1765;
        if (arg1 != -21492) {
            this.field1780 = -20;
        }
        int var7 = (var6 << 12) / this.field1782;
        int var8 = this.field1774 * var7 >> 12;
        return var8 > (arg0 + arg2) && (-var8) < (arg0 + arg2);
    }
}
