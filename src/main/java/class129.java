import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class129 extends class183 {

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "Lfm;")
    public static class53 field1778 = new class53(64);

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 8)
    public static void method926(boolean arg0) {
        if (!arg0) {
            field1778 = (class53) null;
        }
        field1778 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 24)
    public static final void method927(int arg0) {
        field1761++;
        int var1 = 50 / ((14 - arg0) / 58);
        int var2 = (class173.field2356.field3745 >> 7) + class132.field1809;
        class88.field1250 = 0;
        int var3 = (class173.field2356.field3679 >> 7) + class296.field4394;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class88.field1250 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class88.field1250 = 1;
        }
        if (class88.field1250 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class88.field1250 = 0;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lsn;", line = 49)
    public static final class145 method928(int arg0, int arg1) {
        field1775++;
        class145 var2 = (class145) class148.field2045.method716((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        int var3 = -15 % ((arg1 - 69) / 50);
        byte[] var4 = class23.field297.method955(16, arg0, -21853);
        class145 var5 = new class145();
        if (var4 != null) {
            var5.method1046(false, new class316(var4));
        }
        class148.field2045.method721((long) arg0, var5, 0);
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 73)
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class245.field3524 * 128) {
            arg0 = class245.field3524 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class99.field1356 * 128) {
            arg2 = class99.field1356 * 128 - 1;
        }
        class115.field1554 = class184.field2538[arg3];
        class193.field2658 = class184.field2532[arg3];
        class340.field5104 = class184.field2538[arg4];
        class251.field3596 = class184.field2532[arg4];
        class234.field3310 = arg0;
        class173.field2353 = arg1;
        class113.field1539 = arg2;
        class175.field2383 = arg0 / 128;
        class25.field315 = arg2 / 128;
        class110.field1484 = class175.field2383 - class208.field2988;
        if (class110.field1484 < 0) {
            class110.field1484 = 0;
        }
        class161.field2213 = class25.field315 - class208.field2988;
        if (class161.field2213 < 0) {
            class161.field2213 = 0;
        }
        class316.field4758 = class208.field2988 + class175.field2383;
        if (class316.field4758 > class245.field3524) {
            class316.field4758 = class245.field3524;
        }
        class230.field3254 = class25.field315 + class208.field2988;
        if (class230.field3254 > class99.field1356) {
            class230.field3254 = class99.field1356;
        }
        short var15;
        if (class67.field908) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class208.field2988 + class208.field2988 + 2; var16++) {
            for (int var17 = 0; var17 < class208.field2988 + class208.field2988 + 2; var17++) {
                int var18 = (var16 - class208.field2988 << 7) - (class234.field3310 & 0x7F);
                int var19 = (var17 - class208.field2988 << 7) - (class113.field1539 & 0x7F);
                int var20 = class175.field2383 + var16 - class208.field2988;
                int var21 = class25.field315 + var17 - class208.field2988;
                if (var20 >= 0 && var21 >= 0 && var20 < class245.field3524 && var21 < class99.field1356) {
                    int var22;
                    if (class143.field1967 == null) {
                        var22 = class269.field3994[0][var20][var21] + 128 - class173.field2353;
                    } else {
                        var22 = class143.field1967[0][var20][var21] + 128 - class173.field2353;
                    }
                    int var23 = class269.field3994[3][var20][var21] - class173.field2353 - 1000;
                    class286.field4248[var16][var17] = class219.method1512(var18, var23, var22, var19, var15);
                } else {
                    class286.field4248[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class208.field2988 + class208.field2988 + 1; var24++) {
            for (int var25 = 0; var25 < class208.field2988 + class208.field2988 + 1; var25++) {
                class240.field3399[var24][var25] = class286.field4248[var24][var25] || class286.field4248[var24 + 1][var25] || class286.field4248[var24][var25 + 1] || class286.field4248[var24 + 1][var25 + 1];
            }
        }
        class119.field1603 = arg6;
        class112.field1531 = arg7;
        class168.field2287 = arg8;
        class25.field312 = arg9;
        class166.field2266 = arg10;
        class52.method355();
        if (class113.field1545 != null) {
            class35.method198(true);
            class82.method639(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class67.field908) {
                class310.field4686 = false;
                class123.method884(0, 0, -68);
                class139.method1005((float[]) null);
                class147.method1060();
            }
            class35.method198(false);
        }
        class82.method639(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)Luh;", line = 205)
    public static final class88 method930(byte arg0) {
        field1763++;
        if (arg0 <= 29) {
            return (class88) null;
        }
        try {
            return (class88) Class.forName("of").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILkm;B)Z", line = 230)
    public static final boolean method931(int arg0, int arg1, class133 arg2, byte arg3) {
        field1765++;
        byte[] var4 = arg2.method955(arg1, arg0, -21853);
        if (var4 == null) {
            return false;
        } else if (arg3 < 84) {
            return false;
        } else {
            class226.method1587(125, var4);
            return true;
        }
    }
}
