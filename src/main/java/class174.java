import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class174 {

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Z")
    private boolean field2266 = false;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field2265 = 0;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public int field2270 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2251 = 0;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "Lkg;")
    public static class179 field2271 = new class179(28, 4);

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public int field2260;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "J")
    public long field2255;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method1114(int arg0) {
        this.field2256 = class36.field478[this.field2259 << 3];
        field2261++;
        this.field2267 = (int) Math.sqrt((double) (this.field2253 * this.field2253 - (-(this.field2263 * this.field2263) - (this.field2254 * this.field2254))));
        if (this.field2258 == 0) {
            this.field2258 = 1;
        }
        if (this.field2264 == 0) {
            this.field2255 = 2147483647L;
        } else if (this.field2264 == 1) {
            this.field2255 = (this.field2267 * 8 / this.field2258);
            this.field2255 *= this.field2255;
        } else if (this.field2264 == 2) {
            this.field2255 = (this.field2267 * 8 / this.field2258);
        }
        if (this.field2266) {
            this.field2267 *= -1;
        }
        if (arg0 != -25173) {
            this.method1117((byte) 52, null);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static void method1115(int arg0) {
        if (arg0 > -56) {
            method1115(29);
        }
        field2271 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lfh;IB)V")
    private final void method1116(class463 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2259 = arg0.method2758((byte) 92);
        } else if (arg1 == 2) {
            arg0.method2737(false);
        } else if (arg1 == 3) {
            this.field2253 = arg0.method2727(-111);
            this.field2263 = arg0.method2727(-105);
            this.field2254 = arg0.method2727(-97);
        } else if (arg1 == 4) {
            this.field2264 = arg0.method2737(false);
            this.field2258 = arg0.method2727(-94);
        } else if (arg1 == 6) {
            this.field2252 = arg0.method2737(false);
        } else if (arg1 == 8) {
            this.field2270 = 1;
        } else if (arg1 == 9) {
            this.field2265 = 1;
        } else if (arg1 == 10) {
            this.field2266 = true;
        }
        if (arg2 < 21) {
            this.method1114(-53);
        }
        field2268++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLfh;)V")
    public final void method1117(byte arg0, class463 arg1) {
        if (arg0 != 109) {
            this.field2264 = 51;
        }
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field2269++;
                return;
            }
            this.method1116(arg1, var3, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(FFFB)I")
    public static final int method1118(float arg0, float arg1, float arg2, byte arg3) {
        if (arg3 < 10) {
            return 4;
        }
        field2257++;
        float var4 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var5 > var4 && var6 < var5) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }
}
