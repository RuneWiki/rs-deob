import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class315 extends class75 {

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5342 = 50;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Z")
    public static boolean field5346 = false;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Lmh;")
    public static class128 field5344 = class22.method156(123, "Ablegen");

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lmh;")
    public static class128 field5348 = class22.method156(122, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[I")
    public static int[] field5345;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB[B)I", line = 8)
    public static final int method2174(int arg0, int arg1, byte arg2, byte[] arg3) {
        field5339++;
        int var4 = -1;
        if (arg2 == -126) {
            for (int var5 = arg1; var5 < arg0; var5++) {
                var4 = class206.field3625[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(BII)V", line = 61)
    public static final void method2175(byte arg0, int arg1, int arg2) {
        if (arg0 <= 7) {
            field5345 = (int[]) null;
        }
        for (int var3 = 0; var3 < class54.field1053; var3++) {
            class201 var4 = class75.method493(var3, 4);
            if (var4 != null) {
                int var5 = var4.field3566;
                if (var5 >= 0 && !class141.field2419.method105(var5, (byte) 71)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field3556 >= 0) {
                    int var10 = var4.field3556;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class141.field2413[class284.method1971(var12, -82, 96)];
                } else if (var5 >= 0) {
                    var6 = class141.field2413[class284.method1971(class141.field2419.method97(var5, 0), -125, 96)];
                } else if (var4.field3562 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field3562;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class141.field2413[class284.method1971(var9, 83, 96)];
                }
                class45.field909[var3 + 1] = var6;
            }
        }
        field5347++;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 141)
    public static void method2176(int arg0) {
        if (arg0 != -17180) {
            method2175((byte) -11, -102, 111);
        }
        field5348 = null;
        field5345 = null;
        field5344 = null;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(BII)I", line = 158)
    public static final int method2177(byte arg0, int arg1, int arg2) {
        field5340++;
        int var3 = -64 / ((arg0 - 50) / 36);
        int var4 = (class107.method656(4, (byte) 125, arg2 + 91923, arg1 + 45365) + (class107.method656(2, (byte) 126, arg2 + 37821, arg1 - -10294) - 128 >> 1)) + (class107.method656(1, (byte) 124, arg2, arg1) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 184)
    public static final void method2178(int arg0) {
        field5338++;
        if (arg0 != -3595) {
            return;
        }
        if (class173.field3069 == 2) {
            if (class252.field4359 == class104.field1790 && class288.field4927 == class178.field3129) {
                class173.field3069 = 0;
                class11.method90((byte) -26, class275.field4769 - 1);
            }
        } else if (class45.field915 == class252.field4359 && class241.field4129 == class178.field3129) {
            class173.field3069 = 0;
            class11.method90((byte) -26, class275.field4769 - 1);
        } else {
            class173.field3069 = 2;
            class104.field1790 = class45.field915;
            class288.field4927 = class241.field4129;
        }
    }
}
