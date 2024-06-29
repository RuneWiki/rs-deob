import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 extends class567 {

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field274 = -1;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "Lkq;")
    public static class617 field277 = new class617(14, 0);

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "Lkq;")
    public static class617 field279 = new class617(15, 4);

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "Lkq;")
    public static class617 field281 = new class617(16, -2);

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "Lkq;")
    public static class617 field283 = new class617(17, 0);

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lkq;")
    public static class617 field284 = new class617(18, -2);

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "Lkq;")
    public static class617 field285 = new class617(19, -2);

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "Lkq;")
    public static class617 field286 = new class617(22, -2);

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "Lkq;")
    public static class617 field287 = new class617(23, 4);

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "Lkq;")
    public static class617 field288 = new class617(24, -1);

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "Lkq;")
    public static class617 field289 = new class617(26, 0);

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "Lkq;")
    public static class617 field290 = new class617(27, 0);

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "Lkq;")
    public static class617 field291 = new class617(28, -2);

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "[Lkq;")
    private static class617[] field292 = new class617[32];

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)I")
    public static final int method143(int arg0) {
        if (arg0 >= -127) {
            return -61;
        } else {
            ++field276;
            return class463.field6612 == 1 ? class614.field8677 : 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method144(String arg0, boolean arg1) {
        ++field278;
        if (!class543.field7604.field8334) {
            return -1;
        } else if (class45.field658.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class653.method3742(arg0, (byte) 94);
            if (var2 == null) {
                return -1;
            } else {
                String var3 = class489.field6919 + var2;
                if (!class62.field839.method3154(var3, "", (byte) 126)) {
                    return -1;
                } else if (!class62.field839.method3156((byte) 76, var3)) {
                    return class62.field839.method3148(120, var3);
                } else {
                    byte[] var4 = class62.field839.method3126((byte) 99, var3, "");
                    if (arg1) {
                        field287 = null;
                    }
                    Object var5 = null;
                    File var6;
                    try {
                        var6 = class236.method1623(true, var2);
                    } catch (RuntimeException var10) {
                        return -1;
                    }
                    if (var4 != null && var6 != null) {
                        boolean var7 = true;
                        byte[] var8 = class585.method3395((byte) 109, var6);
                        if (var8 != null && ~var4.length == ~var8.length) {
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                if (~var4[var9] != ~var8[var9]) {
                                    var7 = false;
                                    break;
                                }
                            }
                        } else {
                            var7 = false;
                        }
                        try {
                            if (!var7) {
                                class543.field7604.method3421(var4, var6, 65535);
                            }
                        } catch (Throwable var11) {
                            return -1;
                        }
                        class435.method2608(var6, (byte) -119, arg0);
                        return 100;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)V")
    public static final void method145(byte arg0) {
        int var1 = 47 / ((72 - arg0) / 37);
        ++field280;
        class60.field825 = (int) ((double) class109.field1314 * 34.46D);
        class235.field3396 = 200;
        class60.field825 <<= 2;
        if (class638.field8979.method475()) {
            class60.field825 += 512;
        }
        class291.method1970(false, -33);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(III)Z")
    public static final boolean method146(int arg0, int arg1, int arg2) {
        ++field275;
        int var3 = 107 % ((-30 - arg0) / 51);
        return class605.method3488(arg1, arg2, true) & class567.method3294(-7020, arg2, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        ++field282;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481 && this.method3298(arg1 + 16)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field8023 * super.field8023;
            for (int var8 = 0; class673.field9452 > var8; ++var8) {
                int var9 = super.field8029[var8 % super.field8025 + var7];
                var6[var8] = class111.method773(var9 << 4, 4080);
                var5[var8] = class111.method773(var9 >> 4, 4080);
                var4[var8] = class111.method773(var9, 16711680) >> 12;
            }
        }
        return arg1 != 57 ? null : var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static void method148(boolean arg0) {
        if (!arg0) {
            method146(-126, 36, 104);
        }
        field290 = null;
        field287 = null;
        field286 = null;
        field285 = null;
        field277 = null;
        field284 = null;
        field288 = null;
        field279 = null;
        field283 = null;
        field281 = null;
        field292 = null;
        field291 = null;
        field289 = null;
    }

    static {
        class617[] var0 = class89.method630(false);
        for (int var1 = 0; var0.length > var1; ++var1) {
            field292[var0[var1].field8702] = var0[var1];
        }
    }
}
