import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class128 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lmt;")
    private class517 field1909 = new class517(256);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lmt;")
    private class517 field1911 = new class517(256);

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lok;")
    private class74 field1910;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lok;")
    private class74 field1906;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Luv;")
    public static class2 field1912 = new class2(58, -1);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1917 = null;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Ltv;", line = 9)
    public static final class294 method940(int arg0, int arg1) {
        field1915++;
        if (arg1 == 0) {
            if ((double) class137.field2026 == 3.0D) {
                return class87.field1371;
            }
            if ((double) class137.field2026 == 4.0D) {
                return class414.field6248;
            }
            if ((double) class137.field2026 == 6.0D) {
                return class146.field2194;
            }
            if ((double) class137.field2026 >= 8.0D) {
                return class266.field3967;
            }
        } else if (arg1 == 1) {
            if ((double) class137.field2026 == 3.0D) {
                return class146.field2194;
            }
            if ((double) class137.field2026 == 4.0D) {
                return class266.field3967;
            }
            if ((double) class137.field2026 == 6.0D) {
                return class314.field4858;
            }
            if ((double) class137.field2026 >= 8.0D) {
                return class286.field4294;
            }
        } else if (arg1 == 2) {
            if ((double) class137.field2026 == 3.0D) {
                return class314.field4858;
            }
            if ((double) class137.field2026 == 4.0D) {
                return class286.field4294;
            }
            if ((double) class137.field2026 == 6.0D) {
                return class197.field2886;
            }
            if ((double) class137.field2026 >= 8.0D) {
                return class282.field4266;
            }
        }
        if (arg0 != -2) {
            field1917 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)Llv;", line = 83)
    public final class528 method941(int[] arg0, int arg1, int arg2) {
        int var4 = -6 % ((-arg1 - 41) / 44);
        field1908++;
        if (this.field1910.method535((byte) 117) == 1) {
            return this.method947(-88, arg0, 0, arg2);
        } else if (this.field1910.method536(false, arg2) == 1) {
            return this.method947(-69, arg0, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILig;III)V", line = 105)
    public static final void method942(int arg0, class233 arg1, int arg2, int arg3, int arg4) {
        field1905++;
        long var5 = (long) (arg3 << 14 | arg2 << 28 | arg0);
        class449 var7 = (class449) class491.field7318.method3059(69, var5);
        if (var7 == null) {
            class449 var8 = new class449();
            class491.field7318.method3055(0, var5, var8);
            var8.field6612.method2958(arg1, (byte) 88);
            return;
        }
        class81 var9 = class164.field2437.method1749(arg1.field3272, -20230);
        int var10 = var9.field1177;
        if (var9.field1132 == 1) {
            var10 = (arg1.field3273 + 1) * var10;
        }
        for (class233 var11 = (class233) var7.field6612.method2957(-88); var11 != null; var11 = (class233) var7.field6612.method2947(-111)) {
            class81 var12 = class164.field2437.method1749(var11.field3272, -20230);
            int var13 = var12.field1177;
            if (var12.field1132 == 1) {
                var13 = (var11.field3273 + 1) * var13;
            }
            if (var10 > var13) {
                class116.method877(-118, arg1, var11);
                return;
            }
        }
        if (arg4 <= -50) {
            var7.field6612.method2958(arg1, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lok;Lok;)V", line = 325)
    public class128(class74 arg0, class74 arg1) {
        this.field1910 = arg0;
        this.field1906 = arg1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I)Llv;", line = 163)
    public final class528 method943(int arg0, int arg1, int[] arg2) {
        field1916++;
        if (this.field1906.method535((byte) 117) == 1) {
            return this.method946(arg1, -1, arg2, 0);
        }
        if (arg0 != -17413) {
            this.field1911 = null;
        }
        if (this.field1906.method536(false, arg1) != 1) {
            throw new RuntimeException();
        }
        return this.method946(0, -1, arg2, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 185)
    public static final void method944(int arg0) {
        class473.field6976 = null;
        class279.field4217 = null;
        class286.field4296 = null;
        class320.field4929 = null;
        field1913++;
        class254.field3448 = null;
        class311.field4816 = null;
        class406.field6122 = null;
        class367.field5596 = null;
        class320.field4932 = null;
        class52.field672 = null;
        class397.field5929 = null;
        class345.field5325 = null;
        class268.field3993 = null;
        class283.field4279 = null;
        if (arg0 == -1342173185) {
            class456.field6688 = null;
            class164.field2445 = null;
            class267.field3975 = null;
            class76.field1074 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 214)
    public static void method945(byte arg0) {
        field1917 = null;
        field1912 = null;
        if (arg0 > -1) {
            method944(93);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[II)Llv;", line = 232)
    private final class528 method946(int arg0, int arg1, int[] arg2, int arg3) {
        field1914++;
        int var5 = ((arg3 & 0xB0000FFF) << 4 | arg3 >>> 12) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class528 var9 = (class528) this.field1911.method3059(123, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg1 != -1) {
            this.field1906 = null;
        }
        if (arg2 != null && arg2[0] <= 0) {
            return null;
        }
        class177 var10 = (class177) this.field1909.method3059(48, var7);
        if (var10 == null) {
            var10 = class177.method1211(this.field1906, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            this.field1909.method3055(0, var7, var10);
        }
        class528 var11 = var10.method1214(arg2);
        if (var11 == null) {
            return null;
        } else {
            var10.method876((byte) -96);
            this.field1911.method3055(0, var7, var11);
            return var11;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[III)Llv;", line = 275)
    private final class528 method947(int arg0, int[] arg1, int arg2, int arg3) {
        field1907++;
        int var5 = arg3 ^ ((arg2 & 0x20000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class528 var9 = (class528) this.field1911.method3059(74, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class183 var10 = class183.method1244(this.field1910, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class528 var11 = var10.method1246();
            if (arg0 > -10) {
                return null;
            }
            this.field1911.method3055(0, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field7782.length;
            }
            return var11;
        } else {
            return null;
        }
    }
}
