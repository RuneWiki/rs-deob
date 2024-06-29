import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class108 extends class306 {

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "[I")
    public static int[] field1486 = new int[32];

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1479 = " from your friend list first.";

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "[[B")
    public static byte[][] field1490;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method694(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field1488++;
        class74.field924--;
        if (class74.field924 == arg0) {
            return;
        }
        class8.method56(class29.field342, arg0 + 1, class29.field342, arg0, class74.field924 - arg0);
        class8.method56(class222.field3357, arg0 + 1, class222.field3357, arg0, class74.field924 - arg0);
        class8.method55(class304.field4734, arg0 + 1, class304.field4734, arg0, class74.field924 - arg0);
        class8.method52(class105.field1442, arg0 + 1, class105.field1442, arg0, class74.field924 - arg0);
        class8.method53(class276.field4346, arg0 + 1, class276.field4346, arg0, class74.field924 - arg0);
        class8.method55(class296.field4669, arg0 + 1, class296.field4669, arg0, class74.field924 - arg0);
        class8.method55(class125.field1771, arg0 + 1, class125.field1771, arg0, class74.field924 - arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 31)
    private final void method695(int arg0, int arg1, int arg2) {
        int var4 = class25.field288[arg1];
        field1487++;
        int var5 = class111.field1553[arg0];
        if (arg2 != 4550) {
            return;
        }
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class339.field5408 = arg1;
            class56.field667 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class339.field5408 = arg0;
            class56.field667 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class339.field5408 = class31.field367 - arg0;
            class56.field667 = arg1;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class56.field667 = class99.field1344 - arg0;
            class339.field5408 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class339.field5408 = class31.field367 - arg1;
            class56.field667 = class99.field1344 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class339.field5408 = class31.field367 - arg0;
            class56.field667 = class99.field1344 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class56.field667 = class99.field1344 - arg1;
            class339.field5408 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class56.field667 = arg0;
            class339.field5408 = class31.field367 - arg1;
        }
        class56.field667 &= class56.field663;
        class339.field5408 &= class311.field4878;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Llf;BI)Ljava/lang/String;", line = 103)
    public static final String method696(class143 arg0, byte arg1, int arg2) {
        field1484++;
        try {
            int var3 = arg0.method1027(false);
            if (arg2 < var3) {
                var3 = arg2;
            }
            int var4 = 41 % ((64 - arg1) / 42);
            byte[] var5 = new byte[var3];
            arg0.field2295 += class99.field1343.method774(arg0.field2295, arg0.field2260, 0, 0, var3, var5);
            return class203.method1421(var5, 0, var3, -1);
        } catch (Exception var8) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 132)
    public class108() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V", line = 137)
    public static final void method697(boolean arg0) {
        field1478++;
        if (class346.field5485 == class219.field3290) {
            return;
        }
        if (class303.method2138((byte) 90, class219.field3290)) {
            class346.field5485 = class219.field3290;
        }
        if (arg0) {
            method701(120, true, -72, (String) null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 156)
    public static final void method698(int arg0) {
        field1483++;
        if (class273.field4330 != null) {
            class273.field4330.method1413(2);
        }
        if (arg0 < -84 && class192.field2881 != null) {
            class192.field2881.method1413(2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V", line = 174)
    public static void method699(boolean arg0) {
        field1479 = null;
        if (arg0) {
            method701(-60, false, 113, (String) null);
        }
        field1490 = (byte[][]) null;
        field1486 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I", line = 186)
    public final int[][] method681(int arg0, byte arg1) {
        field1481++;
        if (arg1 != -119) {
            field1489 = -63;
        }
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class31.field367; var7++) {
                this.method695(arg0, var7, 4550);
                int[][] var8 = this.method2160(0, (byte) 127, class56.field667);
                var4[var7] = var8[0][class339.field5408];
                var6[var7] = var8[1][class339.field5408];
                var5[var7] = var8[2][class339.field5408];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILlf;I)V", line = 231)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        if (arg0 != -15334) {
            method698(-53);
        }
        field1485++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIII)Z", line = 244)
    public static final boolean method700(int arg0, int arg1, int arg2, int arg3) {
        if (!class355.method2451(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class72.field902[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class245.field3859) {
                    if (!class186.method1282(var4, var6, var5)) {
                        return false;
                    }
                    if (!class186.method1282(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1282(var4, var7, var5)) {
                        return false;
                    }
                    if (!class186.method1282(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class186.method1282(var4, var8, var5)) {
                    return false;
                }
                if (!class186.method1282(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class42.field457) {
                    if (!class186.method1282(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class186.method1282(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1282(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class186.method1282(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class186.method1282(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class186.method1282(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class245.field3859) {
                    if (!class186.method1282(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class186.method1282(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1282(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class186.method1282(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class186.method1282(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class186.method1282(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class42.field457) {
                    if (!class186.method1282(var4, var6, var5)) {
                        return false;
                    }
                    if (!class186.method1282(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1282(var4, var7, var5)) {
                        return false;
                    }
                    if (!class186.method1282(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class186.method1282(var4, var8, var5)) {
                    return false;
                }
                if (!class186.method1282(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class186.method1282(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class186.method1282(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class186.method1282(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class186.method1282(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class186.method1282(var4, var8, var5);
        } else {
            return true;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1486[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I", line = 435)
    public final int[] method47(int arg0, int arg1) {
        field1480++;
        int[] var3 = this.field4757.method903(arg0, -66);
        if (this.field4757.field1898) {
            for (int var4 = 0; var4 < class31.field367; var4++) {
                this.method695(arg0, var4, 4550);
                int[] var5 = this.method2161(class56.field667, (byte) 115, 0);
                var3[var4] = var5[class339.field5408];
            }
        }
        if (arg1 != -1546337535) {
            field1486 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZILjava/lang/String;)Z", line = 467)
    public static final boolean method701(int arg0, boolean arg1, int arg2, String arg3) {
        field1482++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg3.length();
        int var7 = 0;
        if (arg0 != 128) {
            field1479 = (String) null;
        }
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var7 + var11;
            if (var10 / arg2 != var7) {
                return false;
            }
            var7 = var10;
            var5 = true;
        }
        return var5;
    }
}
