import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class176 extends class237 {

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    private final int field3175;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    private final int field3173;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    private final int field3171;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    private final int field3176;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "S")
    public static short field3174 = 256;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static volatile int field3181 = 0;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field3179 = 0;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIII)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3175 = arg1;
        this.field3173 = arg0;
        this.field3171 = arg2;
        this.field3176 = arg3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lc;")
    public static final class23 method1224(int arg0, int arg1) {
        ++field3186;
        class23 var2 = (class23) class239.field4323.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg1 <= arg0) {
                var3 = class179.field3231.method104(-113, 0, arg1 & 32767);
            } else {
                var3 = class33.field771.method104(-127, 0, arg1);
            }
            class23 var4 = new class23();
            if (var3 != null) {
                var4.method204(arg0 ^ 32869, new class145(var3));
            }
            if (~arg1 <= -32769) {
                var4.method206((byte) -121);
            }
            class239.field4323.method497((long) arg1, var4, -104);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(BII)V")
    public final void method595(byte arg0, int arg1, int arg2) {
        ++field3185;
        if (arg0 < -13) {
            int var4 = this.field3171 * arg1 >> 12;
            int var5 = this.field3175 * arg2 >> 12;
            int var6 = this.field3173 * arg1 >> 12;
            int var7 = this.field3176 * arg2 >> 12;
            class11.method114(super.field4281, super.field4290, var7, (byte) 66, var4, var6, super.field4291, var5);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lah;I)V")
    public static final void method1225(int arg0, class9[] arg1, int arg2) {
        if (arg0 != -32769) {
            method1227((class117) null, 62);
        }
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            class9 var4 = arg1[var3];
            if (var4 != null && var4.field175 == arg2 && (!var4.field249 || !class148.method1060(var4, (byte) -83))) {
                if (var4.field225 == 0) {
                    if (!var4.field249 && class148.method1060(var4, (byte) 52) && class196.field3500 != var4) {
                        continue;
                    }
                    method1225(-32769, arg1, var4.field218);
                    if (var4.field157 != null) {
                        method1225(arg0, var4.field157, var4.field218);
                    }
                    class73 var5 = (class73) class11.field371.method460((long) var4.field218, 1);
                    if (var5 != null) {
                        class173.method1209(arg0 ^ -39828, var5.field1397);
                    }
                }
                if (~var4.field225 == -7) {
                    if (~var4.field291 != 0 || ~var4.field196 != 0) {
                        boolean var6 = class4.method34(2, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field291;
                        } else {
                            var7 = var4.field196;
                        }
                        if (var7 != -1) {
                            class174 var8 = class81.method555(var7, (byte) 46);
                            if (var8 != null) {
                                var4.field270 += class28.field691;
                                while (var8.field3148[var4.field299] < var4.field270) {
                                    var4.field270 -= var8.field3148[var4.field299];
                                    ++var4.field299;
                                    if (var4.field299 >= var8.field3144.length) {
                                        var4.field299 -= var8.field3137;
                                        if (~var4.field299 > -1 || ~var4.field299 <= ~var8.field3144.length) {
                                            var4.field299 = 0;
                                        }
                                    }
                                    class62.method457(var4, 0);
                                }
                            }
                        }
                    }
                    if (var4.field210 != 0 && !var4.field249) {
                        int var9 = var4.field210 >> 16;
                        int var10 = var4.field210 << 16 >> 16;
                        int var11 = class28.field691 * var10;
                        var4.field209 = 2047 & var4.field209 + var11;
                        int var12 = class28.field691 * var9;
                        var4.field229 = var4.field229 + var12 & 2047;
                        class62.method457(var4, 0);
                    }
                }
            }
        }
        ++field3177;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
    public final void method598(int arg0, int arg1, int arg2) {
        ++field3178;
        if (arg2 != -18503) {
            this.method595((byte) 22, 83, 35);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Z")
    public static final boolean method1226(int arg0, int arg1) {
        ++field3180;
        if (arg1 != -677878100) {
            field3181 = -127;
        }
        return ~(arg0 >> 21 & 1) != -1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V")
    public final void method596(byte arg0, int arg1, int arg2) {
        ++field3182;
        int var4 = this.field3173 * arg1 >> 12;
        int var5 = this.field3171 * arg1 >> 12;
        int var6 = this.field3175 * arg2 >> 12;
        int var7 = 85 / ((arg0 - 39) / 59);
        int var8 = this.field3176 * arg2 >> 12;
        class180.method1246(var6, var4, super.field4281, var8, true, var5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkh;I)V")
    public static final void method1227(class117 arg0, int arg1) {
        try {
            class146.field2685.getAppletContext().showDocument(arg0.method784(class146.field2685.getCodeBase(), 126), "_blank");
        } catch (Exception var2) {
        }
        ++field3187;
        if (arg1 > -16) {
            field3174 = 25;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([BI)Lmg;")
    public static final class138 method1228(byte[] arg0, int arg1) {
        ++field3184;
        if (arg0 == null) {
            return null;
        } else {
            class235 var2 = new class235(arg0, class100.field1827, class106.field1927, class204.field3690, class11.field376, class105.field1921);
            if (arg1 <= 78) {
                return null;
            } else {
                class45.method376(5851);
                return var2;
            }
        }
    }
}
