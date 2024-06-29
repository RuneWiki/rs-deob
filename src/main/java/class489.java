import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class489 {

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Ldea;")
    private class205 field6853 = new class205(256);

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Ldea;")
    private class205 field6857 = new class205(256);

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lan;")
    private class21 field6849;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lan;")
    private class21 field6848;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field6847 = 0;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lcba;")
    public static class471 field6852 = new class471(29, 6);

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "F")
    public static float field6856;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([III)Lke;")
    public final class514 method2836(int[] arg0, int arg1, int arg2) {
        field6854++;
        if (this.field6848.method239(-112) == 1) {
            return this.method2841(arg2, 0, true, arg0);
        }
        if (arg1 != -943) {
            this.method2840(null, (byte) 60, 85, -60);
        }
        if (this.field6848.method231(arg2, arg1 ^ 0x3DA) != 1) {
            throw new RuntimeException();
        }
        return this.method2841(0, arg2, true, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public static final void method2837(int arg0, int arg1, int arg2) {
        class274.field3801++;
        field6859++;
        if (arg0 != 6) {
            method2837(-103, -26, -97);
        }
        class351.method2108(class401.field5714, -10511);
        class479.field6754.method109(arg2, 255);
        class479.field6754.method117(123, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[II)Lke;")
    public final class514 method2838(int arg0, int[] arg1, int arg2) {
        field6855++;
        if (this.field6849.method239(-35) == 1) {
            return this.method2840(arg1, (byte) -98, arg0, 0);
        }
        int var4 = -98 % ((arg2 - 53) / 63);
        if (this.field6849.method231(arg0, -126) != 1) {
            throw new RuntimeException();
        }
        return this.method2840(arg1, (byte) -104, 0, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method2839(int arg0) {
        field6851++;
        if (class18.field224 < 1024.0F) {
            class18.field224 = 1024.0F;
        }
        if (class18.field224 > 3072.0F) {
            class18.field224 = 3072.0F;
        }
        while (class1.field13 >= 16384.0F) {
            class1.field13 -= 16384.0F;
        }
        while (class1.field13 < 0.0F) {
            class1.field13 += 16384.0F;
        }
        int var1 = class487.field6841 >> 7;
        int var2 = class414.field5848 >> 7;
        int var3 = class183.method1144(arg0 ^ 0x405B, class487.field6841, class414.field5848, class206.field2901);
        if (arg0 != 16384) {
            method2837(-52, -11, 93);
        }
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class32.field513 - 4) > var1 && var2 < class611.field8786 - 4) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class206.field2901;
                    if (var7 < 3 && class414.method2493(var6, false, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class90.field1398.field1144 != null && class90.field1398.field1144[var7] != null) {
                        var8 = (class90.field1398.field1144[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class590.field8430[var7].method1104(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class430.field6125) {
            class430.field6125 += (var10 - class430.field6125) / 24;
        } else if (class430.field6125 > var10) {
            class430.field6125 += (var10 - class430.field6125) / 80;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([IBII)Lke;")
    private final class514 method2840(int[] arg0, byte arg1, int arg2, int arg3) {
        field6846++;
        int var5 = ((arg3 & 0xD0000FFF) << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        if (arg1 >= -91) {
            this.method2840(null, (byte) -40, 64, 59);
        }
        long var7 = (long) var6;
        class514 var9 = (class514) this.field6857.method1242(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class544 var10 = class544.method3109(this.field6849, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class514 var11 = var10.method3108();
            this.field6857.method1241(var11, var7, -109);
            if (arg0 != null) {
                arg0[0] -= var11.field7229.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ[I)Lke;")
    private final class514 method2841(int arg0, int arg1, boolean arg2, int[] arg3) {
        field6850++;
        int var5 = ((arg1 & 0x90000FFF) << 4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (!arg2) {
            return null;
        }
        class514 var9 = (class514) this.field6857.method1242(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class433 var10 = (class433) this.field6853.method1242(0, var7);
            if (var10 == null) {
                var10 = class433.method2567(this.field6848, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field6853.method1241(var10, var7, -106);
            }
            class514 var11 = var10.method2575(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1117(0);
                this.field6857.method1241(var11, var7, -112);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lan;Lan;)V")
    public class489(class21 arg0, class21 arg1) {
        this.field6849 = arg0;
        this.field6848 = arg1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method2842(byte arg0) {
        if (arg0 < 75) {
            field6852 = null;
        }
        field6852 = null;
    }
}
