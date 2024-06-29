import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class167 extends class398 {

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    private int field2246 = 12288;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    private int field2247 = 0;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    private int field2258 = 2048;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    private int field2263 = 4096;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    private int field2248 = 8192;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    private int field2255 = 0;

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    private int field2265 = 2048;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field2262 = "Starting 3d Library";

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "F")
    public static float field2261;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
    public static final void method1026(byte arg0) {
        if (arg0 != 105) {
            method1027(99, -127);
        }
        class244.field3248.method1136((byte) -114);
        ++field2256;
        class397.field5905.method1136((byte) -120);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class167() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        class42.method303(7344);
        if (arg0 != 16) {
            this.method208((class228) null, 15, -113);
        }
        ++field2253;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            field2261 = 1.304242F;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field2248 = arg0.method1343(255);
                                }
                            } else {
                                this.field2263 = arg0.method1343(255);
                            }
                        } else {
                            this.field2246 = arg0.method1343(255);
                        }
                    } else {
                        this.field2265 = arg0.method1343(arg2 ^ -13237);
                    }
                } else {
                    this.field2255 = arg0.method1343(255);
                }
            } else {
                this.field2247 = arg0.method1343(255);
            }
        } else {
            this.field2258 = arg0.method1343(255);
        }
        ++field2245;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)V")
    public static final void method1027(int arg0, int arg1) {
        class189 var2 = class125.field1762;
        synchronized (class125.field1762) {
            class125.field1762.method1142((byte) -51, arg0);
        }
        if (arg1 <= 62) {
            method1030(57);
        }
        ++field2251;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field2264;
        int[] var3 = super.field5927.method305(arg0, (byte) 99);
        if (arg1 != 0) {
            this.field2258 = -93;
        }
        if (super.field5927.field591) {
            int var4 = class84.field1206[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class140.field1922; ++var5) {
                int var6 = class375.field5448[var5] + -2048;
                int var7 = this.field2258 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                int var10 = var4 - -this.field2247;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field2255;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 - 4096;
                int var16 = this.field2265 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method1032(var9, -2048, var12) && !this.method1028(arg1 + -26766, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(III)Z")
    private final boolean method1028(int arg0, int arg1, int arg2) {
        if (arg0 != -26766) {
            return true;
        } else {
            ++field2252;
            int var4 = (arg1 + arg2) * this.field2246 >> 12;
            int var5 = class286.field4148[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field2246;
            int var7 = (var6 << 12) / this.field2248;
            int var8 = this.field2263 * var7 >> 12;
            return var8 > -arg2 + arg1 && ~(-var8) > ~(-arg2 + arg1);
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(II)Lnn;")
    public static final class230 method1029(int arg0, int arg1) {
        ++field2266;
        class230 var2 = (class230) class250.field3435.method1137((long) arg1, 2108653711);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class233.field3100.method2261(arg1, 33, 96);
            class230 var4 = new class230();
            if (var3 != null) {
                var4.method1389(arg1, new class228(var3), false);
            }
            class250.field3435.method1144((long) arg1, var4, -3480);
            if (arg0 != 69609580) {
                method1030(67);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public static final void method1030(int arg0) {
        if (arg0 == 4096) {
            class189 var1 = class304.field4463;
            synchronized (class304.field4463) {
                class304.field4463.method1141(arg0 + -3840);
            }
            ++field2259;
            class189 var2 = class242.field3238;
            synchronized (class242.field3238) {
                class242.field3238.method1141(arg0 ^ 4352);
            }
            class178 var3 = class212.field2835;
            synchronized (class212.field2835) {
                class212.field2835.method1083(0);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static void method1031(int arg0) {
        if (arg0 != 4590) {
            method1031(-55);
        }
        field2262 = null;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(III)Z")
    private final boolean method1032(int arg0, int arg1, int arg2) {
        ++field2250;
        int var4 = (-arg0 + arg2) * this.field2246 >> 12;
        if (arg1 != -2048) {
            this.method208((class228) null, 18, -108);
        }
        int var5 = class286.field4148[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field2246;
        int var7 = (var6 << 12) / this.field2248;
        int var8 = this.field2263 * var7 >> 12;
        return arg0 + arg2 < var8 && ~(arg0 - -arg2) < ~(-var8);
    }
}
