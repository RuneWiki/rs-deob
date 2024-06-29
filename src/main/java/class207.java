import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class207 {

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public int field3024 = 2048;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field3023 = 0;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field3030 = 2048;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field3033 = 0;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field3035 = 127;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lph;")
    public static class361 field3031;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZILnh;IBII)Lin;", line = 5)
    public static final class177 method1512(boolean arg0, int arg1, class256 arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3022++;
        int var8 = (arg1 << 19) + (arg5 << 17) + (arg6 - -(arg0 ? 65536 : 0));
        if (arg4 < 106) {
            field3028 = 4;
        }
        long var9 = (long) arg3 * 3147483667L + (long) var8 * 3849834839L;
        class177 var11 = (class177) class235.field3533.method461((byte) 120, var9);
        if (var11 != null) {
            return var11;
        }
        class345.field5342 = false;
        class177 var12 = class149.method1052(arg5, arg3, 113, false, arg6, arg1, false, arg2, arg0);
        if (var12 != null && !class345.field5342) {
            class235.field3533.method460(var12, -26089, var9);
        }
        return var12;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1513(int arg0) {
        if (arg0 != -64) {
            method1514((byte) 22);
        }
        field3026++;
        class85.field1204 = null;
        class245.method1802();
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 47)
    public static void method1514(byte arg0) {
        if (arg0 == 97) {
            field3031 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BILsb;)V", line = 57)
    public final void method1515(byte arg0, int arg1, class190 arg2) {
        field3021++;
        while (true) {
            int var4 = arg2.method1319(255);
            if (var4 == 0) {
                if (arg0 <= 97) {
                    this.field3024 = -55;
                }
                return;
            }
            this.method1518(var4, arg2, arg1, 4065);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V", line = 82)
    public static final void method1516(int arg0) {
        field3034++;
        int var1 = class340.field5255 * 128 + 64;
        int var2 = class323.field4861 * 128 + 64;
        int var3 = class71.method584(class321.field4835, var1, 94, var2) - class154.field2203;
        if (class272.field4121 >= 100) {
            class166.field2385 = class323.field4861 * 128 + 64;
            class137.field1991 = class340.field5255 * 128 + 64;
            class129.field1871 = class71.method584(class321.field4835, class137.field1991, 107, class166.field2385) - class154.field2203;
        } else {
            if (var3 > class129.field1871) {
                class129.field1871 += (var3 - class129.field1871) * class272.field4121 / 1000 + class38.field563;
                if (var3 < class129.field1871) {
                    class129.field1871 = var3;
                }
            }
            if (class137.field1991 < var1) {
                class137.field1991 += (var1 - class137.field1991) * class272.field4121 / 1000 + class38.field563;
                if (class137.field1991 > var1) {
                    class137.field1991 = var1;
                }
            }
            if (class137.field1991 > var1) {
                class137.field1991 -= (class137.field1991 - var1) * class272.field4121 / 1000 + class38.field563;
                if (class137.field1991 < var1) {
                    class137.field1991 = var1;
                }
            }
            if (class166.field2385 < var2) {
                class166.field2385 += class38.field563 + ((var2 - class166.field2385) * class272.field4121 / 1000);
                if (class166.field2385 > var2) {
                    class166.field2385 = var2;
                }
            }
            if (class166.field2385 > var2) {
                class166.field2385 -= class38.field563 + ((class166.field2385 - var2) * class272.field4121 / 1000);
                if (class166.field2385 < var2) {
                    class166.field2385 = var2;
                }
            }
            if (var3 < class129.field1871) {
                class129.field1871 -= (class129.field1871 - var3) * class272.field4121 / 1000 + class38.field563;
                if (class129.field1871 < var3) {
                    class129.field1871 = var3;
                }
            }
        }
        int var4 = class197.field2860 * 128 + 64;
        int var5 = class296.field4448 * 128 + 64;
        int var6 = class71.method584(class321.field4835, var4, -64, var5) - class130.field1878;
        int var7 = var4 - class137.field1991;
        if (arg0 <= 109) {
            return;
        }
        int var8 = var5 - class166.field2385;
        int var9 = var6 - class129.field1871;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class335.field5216;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > class362.field5746) {
            class362.field5746 += (var11 - class362.field5746) * class288.field4364 / 1000 + class76.field1116;
            if (var11 < class362.field5746) {
                class362.field5746 = var11;
            }
        }
        if (class362.field5746 > var11) {
            class362.field5746 -= (class362.field5746 - var11) * class288.field4364 / 1000 + class76.field1116;
            if (var11 > class362.field5746) {
                class362.field5746 = var11;
            }
        }
        if (var13 > 0) {
            class335.field5216 += class288.field4364 * var13 / 1000 + class76.field1116;
            class335.field5216 &= 0x7FF;
        }
        if (var13 < 0) {
            class335.field5216 -= -var13 * class288.field4364 / 1000 + class76.field1116;
            class335.field5216 &= 0x7FF;
        }
        int var14 = var12 - class335.field5216;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class335.field5216 = var12;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V", line = 234)
    public static final void method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        if (arg2 != 0) {
            field3028 = 106;
        }
        while (arg3 >= var6) {
            class329.method2285(arg5, class274.field4158[var6], (byte) 70, arg1, arg0);
            var6++;
        }
        field3029++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILsb;II)V", line = 261)
    private final void method1518(int arg0, class190 arg1, int arg2, int arg3) {
        if (arg3 != 4065) {
            field3028 = 21;
        }
        if (arg0 == 1) {
            this.field3023 = arg1.method1319(255);
        } else if (arg0 == 2) {
            this.field3024 = arg1.method1317((byte) 118);
        } else if (arg0 == 3) {
            this.field3030 = arg1.method1317((byte) 88);
        } else if (arg0 == 4) {
            this.field3033 = arg1.method1347((byte) 61);
        }
        field3027++;
    }
}
