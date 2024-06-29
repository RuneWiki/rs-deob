import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class726 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public int field10171;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field10173;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field10174;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field10178;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public int field10179;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field10181;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public int field10182;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lbh;")
    public static class429 field10170;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lkha;")
    public static class687 field10175;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[B")
    public byte[] field10169;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[B")
    public byte[] field10176;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 4)
    public static void method4026(byte arg0) {
        field10175 = null;
        if (arg0 != 76) {
            field10170 = null;
        }
        field10170 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/String;IZ)I", line = 25)
    public static final int method4027(byte arg0, String arg1, int arg2, boolean arg3) {
        field10172++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
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
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        if (arg0 != -8) {
            method4026((byte) -94);
        }
        return var6;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 111)
    public static final void method4028(int arg0, int arg1) {
        class573.field8008.method775(arg0 + 1, arg1);
        field10180++;
        class30.field487.method775(1, arg1);
        if (arg0 != 0) {
            field10170 = null;
        }
        class372.field5237.method775(1, arg1);
        class5.field48.method775(arg0 ^ 0x1, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III[IIIII)Z", line = 125)
    public static final boolean method4029(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field10177++;
        int var8 = 24 / ((4 - arg0) / 60);
        if (class521.field7350 < arg4) {
            arg4 = class521.field7350;
        }
        if (arg5 < 0) {
            arg5 = 0;
        }
        if (arg5 >= arg4) {
            return true;
        }
        int var9 = arg4 - arg5 >> 2;
        int var10 = arg5 + arg7 - 1;
        int var11 = arg5 * arg6 + arg2;
        if (class608.field8432 == 1) {
            class540.field7599 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var12 = arg4 - arg5 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg3[var10] > var11) {
                            arg3[var10] = var11;
                        }
                        var11 += arg6;
                    }
                }
                int var10000 = ~var11;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    arg3[var10] = var11;
                }
                int var13 = arg6 + var11;
                var10++;
                if (arg3[var10] > var13) {
                    arg3[var10] = var13;
                }
                int var14 = arg6 + var13;
                var10++;
                if (arg3[var10] > var14) {
                    arg3[var10] = var14;
                }
                int var15 = arg6 + var14;
                var10++;
                if (arg3[var10] > var15) {
                    arg3[var10] = var15;
                }
                var11 = arg6 + var15;
            }
        } else {
            int var16 = var11 - 38400;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var17 = arg4 - arg5 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg3[var10] > var16) {
                            return false;
                        }
                        var16 += arg6;
                    }
                }
                var10++;
                if (var16 < arg3[var10]) {
                    return false;
                }
                int var18 = arg6 + var16;
                var10++;
                if (arg3[var10] > var18) {
                    return false;
                }
                int var19 = arg6 + var18;
                var10++;
                if (arg3[var10] > var19) {
                    return false;
                }
                int var20 = arg6 + var19;
                var10++;
                if (arg3[var10] > var20) {
                    return false;
                }
                var16 = arg6 + var20;
            }
        }
    }
}
