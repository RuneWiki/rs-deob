import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class264 extends class172 {

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field4106 = 1;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Ll;")
    public static class66 field4101 = new class66(64);

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field4109 = 0;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field4111 = 0;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;III)Loc;", line = 5)
    public static final class304 method1949(Component arg0, int arg1, int arg2, int arg3) {
        field4104++;
        try {
            Class var4 = Class.forName("oe");
            class304 var5 = (class304) var4.getDeclaredConstructor().newInstance();
            if (arg1 >= -17) {
                return (class304) null;
            } else {
                var5.method973(arg0, arg2, 6195, arg3);
                return var5;
            }
        } catch (Throwable var8) {
            class113 var7 = new class113();
            var7.method973(arg0, arg2, 6195, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V", line = 31)
    public static final void method1950(int arg0) {
        field4108++;
        if (arg0 == 0) {
            class235.field3667.method655(-1);
            class134.field2247.method655(-1);
            class311.field4841.method655(-1);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILnc;)V", line = 45)
    public static final void method1951(int arg0, int arg1, class171 arg2) {
        class160 var3 = (class160) class328.field5044.method370((byte) -120, (long) arg1);
        if (var3 == null) {
            class320.method2258(arg1, class119.field1826, (class212) null, arg2, arg2.field1290[0], (class244) null, 128, 0, arg2.field1300[0]);
        } else {
            var3.method1292(arg0 ^ 0x7D69);
        }
        if (arg0 != -32043) {
            method1951(85, -117, (class171) null);
        }
        field4102++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 66)
    public static void method1952(boolean arg0) {
        if (!arg0) {
            method1951(36, 103, (class171) null);
        }
        field4101 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIZIB)V", line = 78)
    public static final void method1953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, byte arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class335.field5123[var11][var12] = 0;
                class321.field4947[var11][var12] = 99999999;
            }
        }
        class335.field5123[arg3][arg1] = 99;
        if (arg10 <= 40) {
            method1953(-91, 21, 51, 65, -117, 71, -94, 92, true, 114, (byte) 56);
        }
        int var13 = arg3;
        field4105++;
        int var14 = arg1;
        byte var15 = 0;
        class321.field4947[arg3][arg1] = 0;
        class274.field4253[var15] = arg3;
        int var16 = 0;
        int var28 = var15 + 1;
        class89.field1270[var15] = arg1;
        int[][] var17 = class57.field905[class119.field1826].field4520;
        boolean var18 = false;
        while (var28 != var16) {
            var13 = class274.field4253[var16];
            var14 = class89.field1270[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg6 == var13 && arg0 == var14) {
                var18 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class57.field905[class119.field1826].method2102(arg0, arg7 - 1, 2, var13, var14, arg6, (byte) -122, arg9)) {
                    var18 = true;
                    break;
                }
                if (arg7 < 10 && class57.field905[class119.field1826].method2093(arg6, arg7 - 1, arg9, var14, arg0, var13, 2, 1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg2 != 0 && class57.field905[class119.field1826].method2095(arg4, arg2, var14, var13, 2, 97, arg0, arg6, arg5)) {
                var18 = true;
                break;
            }
            int var19 = class321.field4947[var13][var14] + 1;
            if (var13 > 0 && class335.field5123[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x2C010E) == 0 && (var17[var13 - 1][var14 + 1] & 0x2C0138) == 0) {
                class274.field4253[var28] = var13 - 1;
                class89.field1270[var28] = var14;
                class335.field5123[var13 - 1][var14] = 2;
                class321.field4947[var13 - 1][var14] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 102 && class335.field5123[var13 + 1][var14] == 0 && (var17[var13 + 2][var14] & 0x2C0183) == 0 && (var17[var13 + 2][var14 + 1] & 0x2C01E0) == 0) {
                class274.field4253[var28] = var13 + 1;
                class89.field1270[var28] = var14;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13 + 1][var14] = 8;
                class321.field4947[var13 + 1][var14] = var19;
            }
            if (var14 > 0 && class335.field5123[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x2C010E) == 0 && (var17[var13 + 1][var14 - 1] & 0x2C0183) == 0) {
                class274.field4253[var28] = var13;
                class89.field1270[var28] = var14 - 1;
                class335.field5123[var13][var14 - 1] = 1;
                var28 = var28 + 1 & 0xFFF;
                class321.field4947[var13][var14 - 1] = var19;
            }
            if (var14 < 102 && class335.field5123[var13][var14 + 1] == 0 && (var17[var13][var14 + 2] & 0x2C0138) == 0 && (var17[var13 + 1][var14 + 2] & 0x2C01E0) == 0) {
                class274.field4253[var28] = var13;
                class89.field1270[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13][var14 + 1] = 4;
                class321.field4947[var13][var14 + 1] = var19;
            }
            if (var13 > 0 && var14 > 0 && class335.field5123[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14] & 0x2C013E) == 0 && (var17[var13 - 1][var14 - 1] & 0x2C010E) == 0 && (var17[var13][var14 - 1] & 0x2C018F) == 0) {
                class274.field4253[var28] = var13 - 1;
                class89.field1270[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13 - 1][var14 - 1] = 3;
                class321.field4947[var13 - 1][var14 - 1] = var19;
            }
            if (var13 < 102 && var14 > 0 && class335.field5123[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x2C018F) == 0 && (var17[var13 + 2][var14 - 1] & 0x2C0183) == 0 && (var17[var13 + 2][var14] & 0x2C01E3) == 0) {
                class274.field4253[var28] = var13 + 1;
                class89.field1270[var28] = var14 - 1;
                class335.field5123[var13 + 1][var14 - 1] = 9;
                var28 = var28 + 1 & 0xFFF;
                class321.field4947[var13 + 1][var14 - 1] = var19;
            }
            if (var13 > 0 && var14 < 102 && class335.field5123[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x2C013E) == 0 && (var17[var13 - 1][var14 + 2] & 0x2C0138) == 0 && (var17[var13][var14 + 2] & 0x2C01F8) == 0) {
                class274.field4253[var28] = var13 - 1;
                class89.field1270[var28] = var14 + 1;
                class335.field5123[var13 - 1][var14 + 1] = 6;
                class321.field4947[var13 - 1][var14 + 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 < 102 && class335.field5123[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 2] & 0x2C01F8) == 0 && (var17[var13 + 2][var14 + 2] & 0x2C01E0) == 0 && (var17[var13 + 2][var14 + 1] & 0x2C01E3) == 0) {
                class274.field4253[var28] = var13 + 1;
                class89.field1270[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13 + 1][var14 + 1] = 12;
                class321.field4947[var13 + 1][var14 + 1] = var19;
            }
        }
        if (!var18) {
            if (!arg8) {
                return;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg6 - var22; var23 <= arg6 + var22; var23++) {
                for (int var24 = arg0 - var22; var24 <= arg0 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class321.field4947[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg6) {
                            var25 = arg6 - var23;
                        } else if (arg4 + arg6 - 1 < var23) {
                            var25 = var23 + 1 - arg6 - arg4;
                        }
                        int var26 = 0;
                        if (arg0 > var24) {
                            var26 = arg0 - var24;
                        } else if ((arg0 - (1 - arg2)) < var24) {
                            var26 = var24 + 1 - arg0 - arg2;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class321.field4947[var23][var24] < var21) {
                            var14 = var24;
                            var20 = var27;
                            var21 = class321.field4947[var23][var24];
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg3 == var13 && arg1 == var14) {
                return;
            }
        }
        class266.field4126 = var13;
        class29.field472 = false;
        class278.field4291 = var14;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZZIILjava/lang/String;Ljava/lang/String;JIZ)V", line = 434)
    public static final void method1954(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, String arg6, String arg7, long arg8, int arg9, boolean arg10) {
        field4098++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class25 var14 = new class25(128);
        var14.method273(0, 10);
        var14.method304(false, (arg3 ? 4 : 0) | (arg10 ? 2 : 0) | (arg2 ? 1 : 0));
        var14.method279(12086, arg8);
        var14.method310(arg1 + 27671, var12[0]);
        var14.method280(arg1 ^ 0x2C1D, arg7);
        var14.method310(46, var12[1]);
        var14.method304(false, class350.field5549);
        var14.method273(0, arg4);
        var14.method273(0, arg0);
        var14.method310(30, var12[2]);
        var14.method304(false, arg5);
        var14.method304(false, arg9);
        var14.method310(arg1 + 27637, var12[3]);
        var14.method268(-46, class165.field2616, class140.field2325);
        class25 var15 = new class25(350);
        var15.method280(-18345, arg6);
        int var16 = 8 - (class34.method354(arg6, (byte) 51) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method273(0, (int) (Math.random() * 255.0D));
        }
        if (arg1 != -27574) {
            method1951(123, -122, (class171) null);
        }
        var15.method293(var12, -11398);
        class99.field1491.field397 = 0;
        class99.field1491.method273(arg1 + 27574, 22);
        class99.field1491.method304(false, var14.field397 + var15.field397 + 2);
        class99.field1491.method304(false, 554);
        class99.field1491.method311(1, var14.field397, 0, var14.field448);
        class99.field1491.method311(1, var15.field397, 0, var15.field448);
        class113.field1738 = 0;
        class135.field2261 = -3;
        class129.field2139 = 1;
        class150.field2455 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(II)V", line = 506)
    public class264(int arg0, int arg1) {
        this.field4099 = arg0;
        this.field4103 = arg1;
    }
}
