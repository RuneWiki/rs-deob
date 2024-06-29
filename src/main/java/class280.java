import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class280 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    public static int[] field4441 = new int[14];

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
    public static int[] field4440 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4449 = "Cancel";

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lol;")
    public static class109 field4439;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method1866(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4447++;
        if (arg0 != -18693) {
            field4441 = null;
        }
        if (class116.field1653 <= arg3 - arg2 && class114.field1634 >= (arg2 + arg3) && class117.field1656 <= arg4 - arg2 && class132.field2105 >= arg4 + arg2) {
            class117.method759(arg2, 0, arg3, arg1, arg4);
        } else {
            class211.method1483(arg4, arg1, arg2, arg3, false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZCI)C")
    public static final char method1867(boolean arg0, char arg1, int arg2) {
        field4442++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        }
        if (arg0) {
            method1867(false, '4', -48);
        }
        if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lwb;II)V")
    public static final void method1868(class123[] arg0, int arg1, int arg2) {
        field4443++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class123 var4 = arg0[var3];
            if (var4 != null && var4.field1911 == arg1 && (!var4.field1796 || !client.method736(var4))) {
                if (var4.field1778 == 0) {
                    if (!var4.field1796 && client.method736(var4) && class272.field4352 != var4) {
                        continue;
                    }
                    method1868(arg0, var4.field1844, 119);
                    if (var4.field1748 != null) {
                        method1868(var4.field1748, var4.field1844, 116);
                    }
                    class86 var5 = (class86) class92.field1139.method708((long) var4.field1844, 121);
                    if (var5 != null) {
                        class274.method1838(var5.field1064, true);
                    }
                }
                if (var4.field1778 == 6) {
                    if (var4.field1783 != -1 || var4.field1791 != -1) {
                        boolean var6 = class294.method1971(var4, 4);
                        int var7;
                        if (var6) {
                            var7 = var4.field1791;
                        } else {
                            var7 = var4.field1783;
                        }
                        if (var7 != -1) {
                            class165 var8 = class208.method1458((byte) -42, var7);
                            if (var8 != null) {
                                var4.field1894 += class32.field427;
                                while (var4.field1894 > var8.field2634[var4.field1900]) {
                                    var4.field1894 -= var8.field2634[var4.field1900];
                                    var4.field1900++;
                                    if (var8.field2624.length <= var4.field1900) {
                                        var4.field1900 -= var8.field2642;
                                        if (var4.field1900 < 0 || var4.field1900 >= var8.field2624.length) {
                                            var4.field1900 = 0;
                                        }
                                    }
                                    var4.field1780 = var4.field1900 + 1;
                                    if (var8.field2624.length <= var4.field1780) {
                                        var4.field1780 -= var8.field2642;
                                        if (var4.field1780 < 0 || var8.field2624.length <= var4.field1780) {
                                            var4.field1780 = -1;
                                        }
                                    }
                                    class129.method875((byte) -21, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1772 != 0 && !var4.field1796) {
                        int var9 = var4.field1772 >> 16;
                        int var10 = var4.field1772 << 16 >> 16;
                        int var11 = class32.field427 * var9;
                        int var12 = class32.field427 * var10;
                        var4.field1907 = var4.field1907 + var12 & 0x7FF;
                        var4.field1804 = var4.field1804 + var11 & 0x7FF;
                        class129.method875((byte) -21, var4);
                    }
                }
            }
        }
        if (arg2 < 115) {
            field4448 = 82;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/awt/Component;Lcg;II)Ldl;")
    public static final class27 method1869(byte arg0, Component arg1, class48 arg2, int arg3, int arg4) {
        field4437++;
        if (field4448 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class27 var5 = (class27) Class.forName("dc").getDeclaredConstructor().newInstance();
                var5.field362 = new int[(class226.field3636 ? 2 : 1) * 256];
                var5.field394 = arg3;
                var5.method5(arg1);
                var5.field383 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field383 > 16384) {
                    var5.field383 = 16384;
                }
                var5.method2(var5.field383);
                if (class167.field2684 > 0 && class164.field2601 == null) {
                    class164.field2601 = new class160();
                    class164.field2601.field2556 = arg2;
                    arg2.method271(class167.field2684, class164.field2601, 2);
                }
                if (class164.field2601 != null) {
                    if (class164.field2601.field2545[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class164.field2601.field2545[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class69 var6 = new class69(arg2, arg4);
                    var6.field394 = arg3;
                    var6.field362 = new int[(class226.field3636 ? 2 : 1) * 256];
                    if (arg0 >= -31) {
                        return null;
                    }
                    var6.method5(arg1);
                    var6.field383 = 16384;
                    var6.method2(var6.field383);
                    if (class167.field2684 > 0 && class164.field2601 == null) {
                        class164.field2601 = new class160();
                        class164.field2601.field2556 = arg2;
                        arg2.method271(class167.field2684, class164.field2601, 2);
                    }
                    if (class164.field2601 != null) {
                        if (class164.field2601.field2545[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class164.field2601.field2545[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class27();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method1870(byte arg0) {
        field4440 = null;
        field4441 = null;
        field4449 = null;
        int var1 = 2 % ((arg0 + 27) / 40);
        field4439 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)V")
    public static final void method1871(long arg0, int arg1) {
        try {
            int var3 = 35 / ((10 - arg1) / 46);
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        field4444++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)I")
    public static final int method1872(int arg0, int arg1, byte arg2) {
        if (arg2 > -49) {
            return -60;
        }
        int var3 = arg1 + (arg0 * 57);
        field4450++;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZ)V")
    public static final void method1873(int arg0, int arg1, boolean arg2) {
        class34 var3 = class160.method1116(arg0, (byte) -35);
        if (!arg2) {
            method1872(123, -28, (byte) 104);
        }
        field4446++;
        int var4 = var3.field440;
        int var5 = var3.field442;
        int var6 = var3.field445;
        int var7 = class15.field194[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class136.method919(arg1 << var5 & var8 | ~var8 & class135.field2141[var4], -127, var4);
    }
}
