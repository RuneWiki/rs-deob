import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class237 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lid;")
    private class149 field3789 = null;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lid;")
    private class149 field3800 = null;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    private int field3791 = 65000;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    private int field3799;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3790 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Z")
    public static boolean field3794 = false;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "J")
    public static long field3798 = 0L;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3803 = "glow2:";

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Ldl;")
    public static class123 field3802;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[B")
    public static byte[] field3792;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BBIZ)Z")
    private final boolean method1606(int arg0, byte[] arg1, byte arg2, int arg3, boolean arg4) {
        field3796++;
        class149 var6 = this.field3789;
        synchronized (this.field3789) {
            try {
                int var7;
                if (arg4) {
                    if (this.field3800.method995(true) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field3800.method992((long) (arg3 * 6), -92);
                    this.field3800.method999(6, class34.field432, -1, 0);
                    var7 = (class34.field432[3] & 0xFF << 16) + (class34.field432[5] & 0xFF) + ((class34.field432[4] & 0xFF) << 8);
                    if (var7 <= 0 || ((long) var7) > (this.field3789.method995(true) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3789.method995(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class34.field432[4] = (byte) (var7 >> 8);
                class34.field432[0] = (byte) (arg0 >> 16);
                class34.field432[1] = (byte) (arg0 >> 8);
                class34.field432[5] = (byte) var7;
                class34.field432[2] = (byte) arg0;
                class34.field432[3] = (byte) (var7 >> 16);
                int var10 = 0;
                int var11 = 0;
                this.field3800.method992((long) (arg3 * 6), 59);
                this.field3800.method994(6, class34.field432, 0, (byte) 65);
                while (var11 < arg0) {
                    int var12 = 0;
                    if (arg4) {
                        label105: {
                            this.field3789.method992((long) (var7 * 520), 108);
                            try {
                                this.field3789.method999(8, class34.field432, -1, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var12 = (class34.field432[6] & 0xFF) + ((class34.field432[4] & 0xFF) << 16) + (class34.field432[5] & 0xFF << 8);
                            int var13 = (class34.field432[2] & 0xFF << 8) + (class34.field432[3] & 0xFF);
                            int var14 = (class34.field432[0] & 0xFF << 8) + (class34.field432[1] & 0xFF);
                            int var15 = class34.field432[7] & 0xFF;
                            if (arg3 == var14 && var10 == var13 && this.field3799 == var15) {
                                if (var12 >= 0 && (this.field3789.method995(true) / 520L) >= ((long) var12)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg0 - var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3789.method995(true) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg4 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class34.field432[2] = (byte) (var10 >> 8);
                    class34.field432[7] = (byte) this.field3799;
                    if (arg0 - var11 <= 512) {
                        var12 = 0;
                    }
                    class34.field432[4] = (byte) (var12 >> 16);
                    class34.field432[5] = (byte) (var12 >> 8);
                    class34.field432[6] = (byte) var12;
                    class34.field432[3] = (byte) var10;
                    var10++;
                    class34.field432[0] = (byte) (arg3 >> 8);
                    class34.field432[1] = (byte) arg3;
                    this.field3789.method992((long) (var7 * 520), -72);
                    var7 = var12;
                    this.field3789.method994(8, class34.field432, 0, (byte) 65);
                    this.field3789.method994(var18, arg1, var11, (byte) 65);
                    var11 += var18;
                }
                return true;
            } catch (IOException var35) {
                int var20 = 60 / ((arg2 - 19) / 60);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method1607(int arg0) {
        field3803 = null;
        field3802 = null;
        field3790 = null;
        if (arg0 <= -76) {
            field3792 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Lld;IIZI[BIIII)V")
    public static final void method1608(int arg0, class79[] arg1, int arg2, int arg3, boolean arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 < 46) {
            return;
        }
        field3805++;
        class25 var11 = new class25(arg6);
        int var12 = -1;
        while (true) {
            int var13 = var11.method209(-2073973340);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method192((byte) -20);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFFB) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method201(255);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg7 == var18 && arg0 <= var17 && (arg0 + 8) > var17 && arg2 <= var16 && var16 < arg2 + 8) {
                    class181 var22 = class25.method224(var12, 0);
                    int var23 = arg8 + class223.method1520(-124, arg10, var22.field2813, var21, var22.field2829, var17 & 0x7, var16 & 0x7);
                    int var24 = class235.method1595(var17 & 0x7, -3, var16 & 0x7, arg10, var22.field2829, var21, var22.field2813) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class79 var25 = null;
                        if (!arg4) {
                            int var26 = arg3;
                            if ((class35.field449[1][var23][var24] & 0x2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg1[var26];
                            }
                        }
                        class56.method412(var24, var25, (byte) 125, !arg4, var20, arg10 + var21 & 0x3, arg3, var23, arg3, var12, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1609(int arg0, int arg1, byte[] arg2, int arg3) {
        field3793++;
        class149 var5 = this.field3789;
        synchronized (this.field3789) {
            if (arg1 != 255) {
                return true;
            } else if (arg0 >= 0 && this.field3791 >= arg0) {
                boolean var7 = this.method1606(arg0, arg2, (byte) 90, arg3, true);
                if (!var7) {
                    var7 = this.method1606(arg0, arg2, (byte) 121, arg3, false);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILlj;)V")
    public static final void method1610(int arg0, class25 arg1) {
        field3795++;
        if (arg0 < 91 || arg1.field339.length - arg1.field349 < 1) {
            return;
        }
        int var2 = arg1.method201(255);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field339.length - arg1.field349) {
            return;
        }
        class59.field835 = arg1.method201(255);
        if (class59.field835 < 1) {
            class59.field835 = 1;
        } else if (class59.field835 > 4) {
            class59.field835 = 4;
        }
        class76.method517(false, arg1.method201(255) == 1);
        class199.field3114 = arg1.method201(255) == 1;
        class143.field2098 = arg1.method201(255) == 1;
        class239.field3814 = arg1.method201(255) == 1;
        class195.field3073 = arg1.method201(255) == 1;
        class264.field4255 = arg1.method201(255) == 1;
        class184.field2893 = arg1.method201(255) == 1;
        class50.field693 = arg1.method201(255) == 1;
        class65.field912 = arg1.method201(255);
        if (class65.field912 > 2) {
            class65.field912 = 2;
        }
        if (var2 >= 2) {
            class3.field37 = arg1.method201(255) == 1;
        } else {
            class3.field37 = arg1.method201(255) == 1;
            arg1.method201(255);
        }
        class182.field2882 = arg1.method201(255) == 1;
        class123.field1815 = arg1.method201(255) == 1;
        class185.field2900 = arg1.method201(255);
        if (class185.field2900 > 2) {
            class185.field2900 = 2;
        }
        class229.field3703 = class185.field2900;
        class16.field192 = arg1.method201(255) == 1;
        class76.field1074 = arg1.method201(255);
        if (class76.field1074 > 127) {
            class76.field1074 = 127;
        }
        class219.field3553 = arg1.method201(255);
        class60.field841 = arg1.method201(255);
        if (class60.field841 > 127) {
            class60.field841 = 127;
        }
        if (var2 >= 1) {
            class261.field4220 = arg1.method190(-3);
            class192.field3041 = arg1.method190(-3);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method201(255);
        }
        if (var2 >= 4) {
            int var4 = arg1.method201(255);
            if (class69.field967 < 96) {
                var4 = 0;
            }
            class217.method1469(var4);
        }
        if (var2 >= 5) {
            class238.field3807 = arg1.method214((byte) 44);
        }
        if (var2 >= 6) {
            class8.field124 = arg1.method201(255);
        }
        if (var2 >= 7) {
            class244.field3910 = arg1.method201(255) == 1;
        }
        if (var2 >= 8) {
            class264.field4251 = arg1.method201(255) == 1;
        }
        if (var2 >= 9) {
            class18.field215 = arg1.method201(255);
        }
        if (var2 >= 10) {
            class141.field2068 = arg1.method201(255) != 0;
        }
        if (var2 >= 11) {
            class80.field1167 = arg1.method201(255) != 0;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)I")
    public static final int method1611(int arg0) {
        if (arg0 != 15) {
            method1611(-18);
        }
        field3806++;
        return 15;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BZZII)V")
    public static final void method1612(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class219.method1478(arg3, class216.field3526.length - 1, 0, 0, arg2, arg1, arg4);
        field3801++;
        int var5 = -50 / ((-arg0 - 71) / 36);
    }

    @OriginalMember(owner = "client!d", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3797++;
        return "Cache:" + this.field3799;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)[B")
    public final byte[] method1613(boolean arg0, int arg1) {
        field3804++;
        class149 var3 = this.field3789;
        synchronized (this.field3789) {
            try {
                if (this.field3800.method995(true) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3800.method992((long) (arg1 * 6), 114);
                this.field3800.method999(6, class34.field432, -1, 0);
                int var5 = (class34.field432[0] & 0xFF << 16) + (class34.field432[1] & 0xFF << 8) + (class34.field432[2] & 0xFF);
                int var6 = ((class34.field432[3] & 0xFF) << 16) + (class34.field432[4] & 0xFF << 8) + (class34.field432[5] & 0xFF);
                if (var5 < 0 || var5 > this.field3791) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field3789.method995(true) / 520L)) {
                    if (arg0) {
                        method1611(20);
                    }
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    label74: while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3789.method992((long) (var6 * 520), -107);
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3789.method999(var13 + 8, class34.field432, -1, 0);
                        int var14 = (class34.field432[6] & 0xFF) + (class34.field432[4] & 0xFF << 16) + (class34.field432[5] & 0xFF << 8);
                        int var15 = (class34.field432[2] & 0xFF << 8) + (class34.field432[3] & 0xFF);
                        int var16 = ((class34.field432[0] & 0xFF) << 8) + (class34.field432[1] & 0xFF);
                        int var17 = class34.field432[7] & 0xFF;
                        if (arg1 == var16 && var9 == var15 && this.field3799 == var17) {
                            if (var14 >= 0 && (long) var14 <= this.field3789.method995(true) / 520L) {
                                var6 = var14;
                                var9++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label74;
                                    }
                                    var10[var11++] = class34.field432[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(ILid;Lid;I)V")
    public class237(int arg0, class149 arg1, class149 arg2, int arg3) {
        this.field3791 = arg3;
        this.field3800 = arg2;
        this.field3799 = arg0;
        this.field3789 = arg1;
    }
}
