import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class141 extends class312 implements class164 {

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "Z")
    private boolean field2162;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "B")
    private byte field2134;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "B")
    private byte field2159;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Z")
    private boolean field2144;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
    private boolean field2145;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "S")
    private short field2138;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "B")
    private byte field2153;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "Z")
    private boolean field2147;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Lt;")
    public class475 field2142;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "Lba;")
    private class265 field2154;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "Lob;")
    public static class521 field2160 = new class521(52, 4);

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    public static int field2163 = 10;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[Ll;")
    public static class16[] field2146;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILya;B)Lt;", line = 3)
    private final class475 method1012(int arg0, class38 arg1, byte arg2) {
        int var4 = -21 % ((arg2 - 19) / 40);
        ++field2132;
        if (this.field2142 != null && arg1.method314(this.field2142.method433(), arg0) == 0) {
            return this.field2142;
        } else {
            class415 var5 = this.method1016(arg1, false, arg0, 0);
            return var5 != null ? var5.field6192 : null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 25)
    public final void method616(int arg0) {
        if (this.field2142 != null) {
            this.field2142.method455();
        }
        ++field2148;
        if (arg0 != 23504) {
            this.method1016((class38) null, true, 86, -10);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lya;Z)V", line = 40)
    public final void method25(class38 arg0, boolean arg1) {
        ++field2152;
        if (arg1) {
            this.method627(-71);
        }
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V", line = 53)
    public static void method1013(int arg0) {
        field2160 = null;
        field2146 = null;
        if (arg0 != -1) {
            field2160 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Z", line = 65)
    public final boolean method614(int arg0) {
        if (arg0 != -1086) {
            return false;
        } else {
            ++field2139;
            return this.field2147;
        }
    }

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "(I)V", line = 77)
    public static final void method1014(int arg0) {
        if (~class301.field4572 <= -1) {
            long var1 = class493.method2937(-89);
            class301.field4572 = (int) ((long) class301.field4572 - (-class245.field3855 + var1));
            if (class301.field4572 <= 0) {
                class32.field376 = class307.field4633.field5307;
                class95.field1370 = class307.field4633.field5314;
                class411.field6145 = class307.field4633.field5311;
                class301.field4572 = -1;
                class153.field2273 = class307.field4633.field5295;
                class321.field4819 = class307.field4633.field5304;
                class519.field7606 = class307.field4633.field5305;
                class189.field3186 = class307.field4633.field5308;
                class169.field2491 = class307.field4633.field5296;
                class403.field5986 = class307.field4633.field5298;
                class38.field512 = class307.field4633.field5301;
            } else {
                int var3 = (class301.field4572 << 8) / class157.field2365;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class189.field3186 = ((class113.field1574 & 65280) * var3 - -((class307.field4633.field5308 & 65280) * var4) & 16711680) + ((class113.field1574 & 16711935) * var3 + (class307.field4633.field5308 & 16711935) * var4 & -16711936) >>> 8;
                float var6 = 1.0F - var5;
                class169.field2491 = (-16711936 & (class508.field7446 & 16711935) * var3 + (class307.field4633.field5296 & 16711935) * var4) + ((65280 & class508.field7446) * var3 + (65280 & class307.field4633.field5296) * var4 & 16711680) >>> 8;
                class519.field7606 = (-class103.field1486 + class307.field4633.field5305) * var6 + class103.field1486;
                class411.field6145 = (class307.field4633.field5311 - class238.field3815) * var6 + class238.field3815;
                class321.field4819 = (class307.field4633.field5304 - class58.field703) * var6 + class58.field703;
                class403.field5986 = (class307.field4633.field5298 - class180.field2706) * var6 + class180.field2706;
                class153.field2273 = (class307.field4633.field5295 - class145.field2208) * var6 + class145.field2208;
                class95.field1370 = (-class145.field2209 + class307.field4633.field5314) * var6 + class145.field2209;
                class32.field376 = class294.field4461 * var3 + class307.field4633.field5307 * var4 >> 8;
                if (class49.field632 != class307.field4633.field5301) {
                    class38.field512 = class181.field2717.method338(class49.field632, class307.field4633.field5301, var6, class38.field512);
                }
            }
            class245.field3855 = var1;
        }
        ++field2143;
        int var7 = -117 % ((arg0 - 23) / 54);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lya;ZI)Lt;", line = 132)
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2159 = -125;
        }
        ++field2155;
        return this.method1012(arg2, arg0, (byte) -86);
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Z", line = 146)
    public final boolean method17(int arg0) {
        if (arg0 != 13651334) {
            this.method624((byte) -14);
        }
        ++field2156;
        return this.field2162;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I", line = 159)
    public final int method624(byte arg0) {
        ++field2140;
        if (arg0 >= -119) {
            this.method624((byte) -74);
        }
        return this.field2138 & 65535;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lya;I)Lag;", line = 171)
    public final class484 method29(class38 arg0, int arg1) {
        ++field2151;
        if (this.field2142 == null) {
            return null;
        } else if (arg1 < 22) {
            return null;
        } else {
            class125 var3 = arg0.method296();
            var3.method206(super.field4693, super.field4697, super.field4695);
            class484 var4 = null;
            if (this.field2145) {
                var4 = class133.method971(1, 0);
            }
            this.field2142.method439(var3, var4 != null ? var4.field6964[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I", line = 198)
    public final int method627(int arg0) {
        if (arg0 != 23326) {
            this.field2134 = -63;
        }
        ++field2161;
        return this.field2159;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLya;II)Z", line = 210)
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        ++field2135;
        class475 var5 = this.method1012(131072, arg1, (byte) -56);
        if (var5 != null) {
            class125 var6 = arg1.method296();
            var6.method206(super.field4693, super.field4697, super.field4695);
            return var5.method440(arg3, arg2, var6, false);
        } else {
            return arg0 > -119 ? false : false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I", line = 241)
    public final int method621(int arg0) {
        if (arg0 != 3021) {
            field2163 = -77;
        }
        ++field2149;
        return this.field2134;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILya;ILor;IZ)V", line = 253)
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        ++field2141;
        if (arg4 instanceof class141) {
            class141 var8 = (class141) arg4;
            if (this.field2142 != null && var8.field2142 != null) {
                this.field2142.method422(var8.field2142, arg3, arg5, arg1, arg6);
            }
        } else if (arg4 instanceof class508) {
            class508 var9 = (class508) arg4;
            if (this.field2142 != null && var9.field7419 != null) {
                this.field2142.method422(var9.field7419, arg3, arg5, arg1, arg6);
            }
        }
        if (arg0 != 3) {
            this.method1012(-96, (class38) null, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lya;Ljt;IIIIZIIZ)V", line = 284)
    public class141(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class498.method2953(arg8, arg7, 18731));
        this.field2162 = arg9;
        super.field4695 = arg5;
        this.field2134 = (byte) arg8;
        this.field2159 = (byte) arg7;
        this.field2144 = arg6;
        this.field2145 = ~arg1.field922 != -1 && !arg6;
        this.field2138 = (short) arg1.field964;
        this.field2153 = (byte) arg2;
        super.field4693 = arg3;
        this.field2147 = arg0.method372() && arg1.field907 && !this.field2144 && class193.field3258.method2986(28721, class96.field1384) != 0;
        int var11 = 2048;
        if (this.field2162) {
            var11 |= 65536;
        }
        class415 var12 = this.method1016(arg0, this.field2147, var11, 0);
        if (var12 != null) {
            this.field2142 = var12.field6192;
            this.field2154 = var12.field6193;
            if (this.field2162) {
                this.field2142 = this.field2142.method449((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILya;)V", line = 319)
    public final void method623(int arg0, class38 arg1) {
        ++field2137;
        if (arg0 < 125) {
            field2146 = null;
        }
        Object var3 = null;
        class265 var5;
        if (this.field2154 == null && this.field2147) {
            class415 var4 = this.method1016(arg1, true, 262144, 0);
            var5 = var4 != null ? var4.field6193 : null;
        } else {
            var5 = this.field2154;
            this.field2154 = null;
        }
        if (var5 != null) {
            class98.method792(var5, this.field2153, super.field4693, super.field4695, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V", line = 349)
    public static final void method1015(int arg0, byte arg1) {
        class326.field4909 = 0;
        class53.field665 = -1;
        ++field2157;
        if (arg1 >= -18) {
            field2146 = null;
        }
        class359.field5329 = false;
        class60.field718 = 1;
        class216.field3506 = null;
        class265.field4068 = arg0;
        class150.field2248 = -1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 368)
    public final void method21(boolean arg0) {
        ++field2150;
        this.field2162 = arg0;
        if (this.field2142 != null) {
            this.field2142.method435(-65537 & this.field2142.method433());
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lya;ZII)Lpm;", line = 383)
    private final class415 method1016(class38 arg0, boolean arg1, int arg2, int arg3) {
        ++field2136;
        class69 var5 = class510.field7458.method2973(-122, 65535 & this.field2138);
        if (arg3 != 0) {
            this.method23(-85, 94, (class38) null, 49, (class455) null, -9, false);
        }
        class145 var6;
        class145 var7;
        if (!this.field2144) {
            if (this.field2153 >= 3) {
                var6 = null;
            } else {
                var6 = class289.field4358[this.field2153 + 1];
            }
            var7 = class289.field4358[this.field2153];
        } else {
            var6 = class289.field4358[0];
            var7 = class290.field4367[this.field2153];
        }
        return var5.method595(arg2, var7, arg1, super.field4695, -1, arg0, this.field2159, this.field2134, var6, super.field4697, super.field4693);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLya;)V", line = 413)
    public final void method619(boolean arg0, class38 arg1) {
        ++field2158;
        Object var3 = null;
        if (!arg0) {
            method1015(85, (byte) 85);
        }
        class265 var5;
        if (this.field2154 == null && this.field2147) {
            class415 var4 = this.method1016(arg1, true, 262144, 0);
            var5 = var4 != null ? var4.field6193 : null;
        } else {
            var5 = this.field2154;
            this.field2154 = null;
        }
        if (var5 != null) {
            class56.method514(var5, this.field2153, super.field4693, super.field4695, (boolean[]) null);
        }
    }
}
