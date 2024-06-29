import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class120 extends class15 {

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Loh;")
    private static class263 field2225 = class253.method1681(-117, "flash3:");

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Loh;")
    public static class263 field2231 = field2225;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Loh;")
    public static class263 field2228 = field2225;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Z")
    public static boolean field2234 = true;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "Lpc;")
    public static class21 field2237;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    public static final void method772(int arg0) {
        if (arg0 != -5481) {
            method778(-61, true, (byte) -16, 54);
        }
        field2222++;
        class238.field4164++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIII)V")
    public static final void method773(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class64 var5 = class84.method563(10, arg4, 80);
        field2227++;
        var5.method396(true);
        var5.field1298 = arg2;
        var5.field1281 = arg0;
        if (arg1) {
            field2234 = false;
        }
        var5.field1290 = arg3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILoh;ILoh;)V")
    public static final void method774(int arg0, class263 arg1, int arg2, class263 arg3) {
        field2233++;
        if (arg2 != -11292) {
            field2234 = true;
        }
        class48.method309(arg1, arg0, (byte) 7, arg3, (class263) null, -1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2223++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            class130.field2394 = -1;
            class1.field19 = -1;
            return;
        }
        int var8 = method781(class12.field321, arg0, false, arg1) - arg2;
        int var9 = arg0 - class127.field2357;
        int var10 = 116 / ((64 - arg3) / 38);
        int var11 = var8 - class87.field1750;
        int var12 = class270.field4769[class73.field1528];
        int var13 = arg1 - class152.field2738;
        int var14 = class270.field4769[class215.field3816];
        int var15 = class270.field4762[class215.field3816];
        int var16 = class270.field4762[class73.field1528];
        int var17 = var9 * var15 + var13 * var14 >> 16;
        int var18 = var13 * var15 - (var9 * var14) >> 16;
        int var20 = var11 * var16 - (var12 * var18) >> 16;
        int var21 = var11 * var12 + var16 * var18 >> 16;
        if (var21 >= 50) {
            class1.field19 = (var17 << 9) / var21 + arg7;
            class130.field2394 = (var20 << 9) / var21 + arg4;
        } else {
            class1.field19 = -1;
            class130.field2394 = -1;
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public static final void method776(int arg0) {
        field2229++;
        if (class191.field3433 || class55.field1157 == 2) {
            return;
        }
        try {
            class12.field287.method1785(-25092, class233.field4074);
            if (arg0 != -3) {
                method775(-28, -31, -62, 27, 2, 68, 38, 32);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILue;I)[Lfd;")
    public static final class119[] method777(int arg0, int arg1, class86 arg2, int arg3) {
        field2236++;
        if (arg1 != -1) {
            field2228 = null;
        }
        return class254.method1687(arg3, (byte) 112, arg2, arg0) ? class56.method356((byte) -98) : null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZBI)Loh;")
    public static final class263 method778(int arg0, boolean arg1, byte arg2, int arg3) {
        field2235++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        if (arg2 != 59) {
            return null;
        }
        for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg3 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg3 /= arg0;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class263 var9 = new class263();
        var9.field4605 = var7;
        var9.field4591 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
    public static void method779(int arg0) {
        field2225 = null;
        field2237 = null;
        field2231 = null;
        field2228 = null;
        if (arg0 != 1) {
            field2224 = 14;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLoh;)V")
    public static final void method780(byte arg0, class263 arg1) {
        int var2 = class183.method1213(29370, arg1);
        field2230++;
        if (var2 == -1) {
            return;
        }
        class75.field1554 = class34.field814.field356[var2] - class54.field1146;
        class182.field3299 = class112.field2110 + class116.field2163 - class34.field814.field364[var2] - 1;
        int var3 = (int) ((float) class253.field4390.field539 / class201.field3627) + class75.field1554;
        int var4 = 103 / ((arg0 + 6) / 42);
        int var5 = class75.field1554 - ((int) ((float) class253.field4390.field539 / class201.field3627));
        int var6 = class182.field3299 - ((int) ((float) class253.field4390.field479 / class201.field3627));
        if (var5 < 0) {
            class75.field1554 = (int) ((float) class253.field4390.field539 / class201.field3627);
        }
        int var7 = class182.field3299 + ((int) ((float) class253.field4390.field479 / class201.field3627));
        if (var3 > class8.field149) {
            class75.field1554 = class8.field149 - (int) ((float) class253.field4390.field539 / class201.field3627);
        }
        if (var6 < 0) {
            class182.field3299 = (int) ((float) class253.field4390.field479 / class201.field3627);
        }
        if (var7 > class112.field2110) {
            class182.field3299 = class112.field2110 - ((int) ((float) class253.field4390.field479 / class201.field3627));
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIZI)I")
    public static final int method781(int arg0, int arg1, boolean arg2, int arg3) {
        field2226++;
        if (class112.field2102 == null) {
            return 0;
        } else if (arg2) {
            return -68;
        } else {
            int var4 = arg1 >> 7;
            int var5 = arg3 >> 7;
            if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
                return 0;
            }
            int var6 = arg0;
            if (arg0 < 3 && (class77.field1576[1][var4][var5] & 0x2) == 2) {
                var6 = arg0 + 1;
            }
            int var7 = arg1 & 0x7F;
            int var8 = arg3 & 0x7F;
            int var9 = (128 - var7) * class112.field2102[var6][var4][var5] + (class112.field2102[var6][var4 + 1][var5] * var7) >> 7;
            int var10 = (128 - var7) * class112.field2102[var6][var4][var5 + 1] + (class112.field2102[var6][var4 + 1][var5 + 1] * var7) >> 7;
            return (128 - var8) * var9 + var8 * var10 >> 7;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lue;II)Lfd;")
    public static final class119 method782(class86 arg0, int arg1, int arg2) {
        field2238++;
        return class180.method1205(arg1, arg2 ^ arg2, arg0) ? class218.method1487(0) : null;
    }
}
