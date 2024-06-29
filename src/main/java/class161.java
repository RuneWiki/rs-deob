import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class161 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lik;")
    private class17 field2211 = new class17(256);

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Lik;")
    private class17 field2223 = new class17(256);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lkm;")
    private class133 field2208;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lkm;")
    private class133 field2215;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2219 = 0;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(CZILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;", line = 7)
    public static final StringBuffer method1157(char arg0, boolean arg1, int arg2, StringBuffer arg3) {
        field2209++;
        int var4 = arg3.length();
        if (arg1) {
            method1157((char) 65409, true, -124, (StringBuffer) null);
        }
        arg3.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg3.setCharAt(var5, arg0);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[IB)Lcc;", line = 29)
    public final class87 method1158(int arg0, int[] arg1, byte arg2) {
        if (arg2 > -18) {
            this.method1158(25, (int[]) null, (byte) -121);
        }
        field2222++;
        if (this.field2215.method952((byte) 63) == 1) {
            return this.method1163(0, (byte) -70, arg1, arg0);
        } else if (this.field2215.method970(-121, arg0) == 1) {
            return this.method1163(arg0, (byte) -70, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 63)
    public static final void method1159(byte arg0) {
        field2220++;
        int var1 = 0;
        if (arg0 > -13) {
            return;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class275.method1892(var1, var2, class142.field1940, var3, true, 50)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[III)Lcc;", line = 103)
    private final class87 method1160(int arg0, int[] arg1, int arg2, int arg3) {
        field2221++;
        int var5 = arg2 ^ (arg0 << 4 & 0xFFF2 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class87 var9 = (class87) this.field2223.method111(-109, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 != -29263) {
            return (class87) null;
        } else if (arg1 == null || arg1[0] > 0) {
            class215 var10 = class215.method1490(this.field2208, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class87 var11 = var10.method1491();
            this.field2223.method120(var7, var11, -22851);
            if (arg1 != null) {
                arg1[0] -= var11.field1244.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILkm;I)Lb;", line = 141)
    public static final class100 method1161(int arg0, class133 arg1, int arg2) {
        if (arg0 != -22757) {
            field2217 = -119;
        }
        byte[] var3 = arg1.method948((byte) -121, arg2);
        field2212++;
        return var3 == null ? null : new class100(var3);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIB)Lcc;", line = 157)
    public final class87 method1162(int[] arg0, int arg1, byte arg2) {
        field2210++;
        if (arg2 != -23) {
            return (class87) null;
        } else if (this.field2208.method952((byte) 127) == 1) {
            return this.method1160(0, arg0, arg1, arg2 - 29240);
        } else if (this.field2208.method970(-74, arg1) == 1) {
            return this.method1160(arg1, arg0, 0, -29263);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB[II)Lcc;", line = 184)
    private final class87 method1163(int arg0, byte arg1, int[] arg2, int arg3) {
        field2218++;
        int var5 = arg3 ^ ((arg0 & 0xE0000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class87 var9 = (class87) this.field2223.method111(arg1 ^ 0x36, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class244 var10 = (class244) this.field2211.method111(-127, var7);
            if (var10 == null) {
                var10 = class244.method1674(this.field2215, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2211.method120(var7, var10, -22851);
            }
            class87 var11 = var10.method1673(arg2);
            if (var11 == null) {
                return null;
            } else if (arg1 == -70) {
                var10.method1274((byte) -26);
                this.field2223.method120(var7, var11, -22851);
                return var11;
            } else {
                return (class87) null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lkm;Lkm;)V", line = 353)
    public class161(class133 arg0, class133 arg1) {
        this.field2208 = arg0;
        this.field2215 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V", line = 239)
    public static final void method1164(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class98 var5 = (class98) class291.field4344.method1335(1); var5 != null; var5 = (class98) class291.field4344.method1336(3)) {
            class4.method19(arg1, arg0, arg2, var5, -22594, arg4);
        }
        for (class98 var6 = (class98) class174.field2372.method1335(1); var6 != null; var6 = (class98) class174.field2372.method1336(arg3 + 4)) {
            byte var7 = 1;
            class194 var8 = var6.field1334.method1753(arg3 ^ 0x0);
            if (var6.field1334.field3719 == var8.field2665) {
                var7 = 0;
            } else if (var6.field1334.field3719 == var8.field2682 || var6.field1334.field3719 == var8.field2691 || var6.field1334.field3719 == var8.field2680 || var6.field1334.field3719 == var8.field2701) {
                var7 = 2;
            } else if (var6.field1334.field3719 == var8.field2699 || var6.field1334.field3719 == var8.field2667 || var6.field1334.field3719 == var8.field2670 || var6.field1334.field3719 == var8.field2685) {
                var7 = 3;
            }
            if (var6.field1323 != var7) {
                int var9 = class170.method1197(var6.field1334, 96);
                if (var6.field1342 != var9) {
                    if (var6.field1333 != null) {
                        class160.field2196.method1130(var6.field1333);
                        var6.field1333 = null;
                    }
                    var6.field1342 = var9;
                }
                var6.field1323 = var7;
            }
            var6.field1335 = var6.field1334.field3745;
            var6.field1326 = var6.field1334.field3745 + var6.field1334.method1653(-1) * 64;
            var6.field1331 = var6.field1334.field3679;
            var6.field1341 = var6.field1334.field3679 + var6.field1334.method1653(-1) * 64;
            class4.method19(arg1, arg0, arg2, var6, arg3 - 22593, arg4);
        }
        for (class98 var10 = (class98) class223.field3199.method110(0); var10 != null; var10 = (class98) class223.field3199.method115(~arg3)) {
            class194 var11 = var10.field1324.method1753(arg3 ^ 0x0);
            byte var12 = 1;
            if (var10.field1324.field3719 == var11.field2665) {
                var12 = 0;
            } else if (var10.field1324.field3719 == var11.field2682 || var10.field1324.field3719 == var11.field2691 || var10.field1324.field3719 == var11.field2680 || var10.field1324.field3719 == var11.field2701) {
                var12 = 2;
            } else if (var10.field1324.field3719 == var11.field2699 || var10.field1324.field3719 == var11.field2667 || var10.field1324.field3719 == var11.field2670 || var10.field1324.field3719 == var11.field2685) {
                var12 = 3;
            }
            if (var10.field1323 != var12) {
                int var13 = class202.method1437(var10.field1324, -1);
                if (var10.field1342 != var13) {
                    if (var10.field1333 != null) {
                        class160.field2196.method1130(var10.field1333);
                        var10.field1333 = null;
                    }
                    var10.field1342 = var13;
                }
                var10.field1323 = var12;
            }
            var10.field1335 = var10.field1324.field3745;
            var10.field1326 = var10.field1324.field3745 + var10.field1324.method1653(arg3 ^ 0x0) * 64;
            var10.field1331 = var10.field1324.field3679;
            var10.field1341 = var10.field1324.field3679 + (var10.field1324.method1653(-1) * 64);
            class4.method19(arg1, arg0, arg2, var10, -22594, arg4);
        }
        if (arg3 != -1) {
            method1157((char) 65526, false, -40, (StringBuffer) null);
        }
        field2214++;
    }
}
