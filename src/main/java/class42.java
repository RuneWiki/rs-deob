import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class42 {

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
    public static int[] field466 = new int[5];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lce;")
    public static class275 field456;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
    public static int[] field474;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Lch;", line = 7)
    public final class158 method255(int arg0) {
        field470++;
        class158 var2 = (class158) class252.field3986.method380(0, (long) this.field459);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 92) {
            field466 = (int[]) null;
        }
        class158 var3 = class25.method182(this.field459, class259.field4088, 0, -89);
        if (var3 != null) {
            class252.field3986.method377((long) this.field459, var3, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI)V", line = 30)
    public static final void method256(int arg0, boolean arg1, int arg2) {
        class279 var3 = class147.method1085(arg0, -19443, 6);
        if (!arg1) {
            var3.method1989(0);
            var3.field4388 = arg2;
            field464++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lad;", line = 51)
    public static final class147 method257(int arg0, byte arg1) {
        field460++;
        if (arg1 != 14) {
            method261(9);
        }
        class147 var2 = (class147) class225.field3397.method380(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class74.field940.method100(1, arg0, (byte) -107);
        class147 var4 = new class147();
        var4.field2339 = arg0;
        if (var3 != null) {
            var4.method1083(new class143(var3), true);
        }
        var4.method1080((byte) -61);
        if (var4.field2332 == 2 && class111.field1528.method770((long) arg0, 39) == null) {
            class111.field1528.method764(24369, new class305(class50.field574), (long) arg0);
            class303.field4732[class50.field574++] = var4;
        }
        class225.field3397.method377((long) arg0, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V", line = 90)
    public static final void method258(int arg0, int arg1) {
        field471++;
        class255.field4033.method387(arg1, false);
        class252.field3999.method387(arg1, false);
        class135.field2027.method387(arg1, false);
        if (arg0 > -92) {
            field466 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V", line = 103)
    public static final void method259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < arg3) {
            class278.method1986(arg0, class347.field5501[arg4], arg1, arg3, (byte) 88);
        } else {
            class278.method1986(arg3, class347.field5501[arg4], arg1, arg0, (byte) 86);
        }
        field461++;
        if (arg2 != 929588991) {
            field474 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Llf;II)V", line = 126)
    public final void method260(class143 arg0, int arg1, int arg2) {
        if (arg1 <= 36) {
            field466 = (int[]) null;
        }
        while (true) {
            int var4 = arg0.method1043(true);
            if (var4 == 0) {
                field458++;
                return;
            }
            this.method262(var4, 1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 152)
    public static void method261(int arg0) {
        if (arg0 != 1) {
            method264(-124, -64, -71, 99, -85);
        }
        field456 = null;
        field474 = null;
        field466 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILlf;I)V", line = 164)
    private final void method262(int arg0, int arg1, class143 arg2, int arg3) {
        field465++;
        if (arg0 == arg1) {
            this.field459 = arg2.method1051(1);
        } else if (arg0 == 2) {
            this.field472 = arg2.method1043(true);
            this.field462 = arg2.method1043(true);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I", line = 185)
    public static final int method263(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method257(65, (byte) 37);
        }
        field473++;
        int var3 = arg0 - 1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIII)V", line = 201)
    public static final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field468++;
        if (class189.field2847 != 0 && arg0 != 0 && class298.field4681 < 50 && arg1 != -1) {
            class187.field2811[class298.field4681] = arg1;
            class88.field1161[class298.field4681] = arg0;
            class14.field150[class298.field4681] = arg2;
            class247.field3913[class298.field4681] = null;
            class87.field1144[class298.field4681] = 0;
            class327.field5239[class298.field4681] = arg3;
            class298.field4681++;
        }
        if (arg4 != -51) {
            method265((byte[]) null, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BB)Lsb;", line = 225)
    public static final class126 method265(byte[] arg0, byte arg1) {
        field467++;
        if (arg1 > -126) {
            return (class126) null;
        }
        class126 var2 = new class126();
        class143 var3 = new class143(arg0);
        var3.field2295 = var3.field2260.length - 2;
        int var4 = var3.method1051(1);
        int var5 = var3.field2260.length - var4 - 2 - 12;
        var3.field2295 = var5;
        int var6 = var3.method1057(-125);
        var2.field1784 = var3.method1051(1);
        var2.field1791 = var3.method1051(1);
        var2.field1779 = var3.method1051(1);
        var2.field1789 = var3.method1051(1);
        int var7 = var3.method1043(true);
        if (var7 > 0) {
            var2.field1780 = new class117[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1051(1);
                class117 var10 = new class117(class226.method1571(true, var9));
                var2.field1780[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1057(-109);
                    int var12 = var3.method1057(-115);
                    var10.method764(24369, new class305(var12), (long) var11);
                }
            }
        }
        var3.field2295 = 0;
        var2.field1782 = var3.method1061(255);
        var2.field1787 = new String[var6];
        var2.field1785 = new int[var6];
        var2.field1788 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field2295) {
            int var14 = var3.method1051(1);
            if (var14 == 3) {
                var2.field1787[var13] = var3.method1040((byte) -128).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1788[var13] = var3.method1043(true);
            } else {
                var2.field1788[var13] = var3.method1057(-101);
            }
            var2.field1785[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)I", line = 311)
    public static final int method266(int arg0, int arg1, int arg2) {
        field469++;
        if (arg0 != 0) {
            field456 = (class275) null;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }
}
