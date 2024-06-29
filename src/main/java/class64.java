import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class64 extends class273 {

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    private int field1254 = 0;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    private int field1264 = 0;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    private int field1265 = 4096;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    private int field1256 = 8192;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    private int field1266 = 2048;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    private int field1268 = 12288;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "I")
    private int field1274 = 2048;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Ljd;")
    public static class86 field1259 = class122.method868("www)2wtrc", true);

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Ljd;")
    private static class86 field1261 = class122.method868("Use", true);

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "Ljd;")
    public static class86 field1269 = class122.method868("Zugewiesener Speicher)3", true);

    @OriginalMember(owner = "client!e", name = "S", descriptor = "Ljd;")
    public static class86 field1253 = field1261;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Z")
    public static boolean field1258 = false;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "[I")
    public static int[] field1272 = new int[1000];

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 != 4095) {
            this.method84(109);
        }
        ++field1275;
        class144.method1022((byte) -124);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZI)Z")
    private final boolean method453(int arg0, boolean arg1, int arg2) {
        ++field1267;
        int var4 = (-arg0 + arg2) * this.field1268 >> 12;
        if (arg1) {
            return false;
        } else {
            int var5 = class237.field4277[(1047693 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field1268;
            int var7 = (var6 << 12) / this.field1256;
            int var8 = this.field1265 * var7 >> 12;
            return ~var8 < ~(arg0 + arg2) && -var8 < arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field1263;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1256 = arg1.method1410(-65);
                                }
                            } else {
                                this.field1265 = arg1.method1410(-124);
                            }
                        } else {
                            this.field1268 = arg1.method1410(-98);
                        }
                    } else {
                        this.field1274 = arg1.method1410(-124);
                    }
                } else {
                    this.field1264 = arg1.method1410(-125);
                }
            } else {
                this.field1254 = arg1.method1410(-91);
            }
        } else {
            this.field1266 = arg1.method1410(-57);
        }
        if (arg2 > -16) {
            this.field1254 = 12;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(B)V")
    public static final void method454(byte arg0) {
        if (arg0 != -71) {
            method455(67, -20, -17, (class170) null);
        }
        class24.field593 = null;
        ++field1273;
        class51.field1068 = null;
        class79.field1547 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class64() {
        super(0, true);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILbc;)V")
    public static final void method455(int arg0, int arg1, int arg2, class170 arg3) {
        if (arg2 == 0) {
            if (~arg3.field683 == ~arg0 && arg0 != -1) {
                class122 var4 = class133.method952(arg0, 127);
                int var5 = var4.field2360;
                if (~var5 == -2) {
                    arg3.field708 = 0;
                    arg3.field715 = 0;
                    arg3.field695 = 0;
                    arg3.field724 = arg1;
                    class168.method1212(arg3.field676, arg3.field708, false, var4, 1928670186, arg3.field685);
                }
                if (~var5 == -3) {
                    arg3.field715 = 0;
                }
            } else if (~arg0 == 0 || ~arg3.field683 == 0 || class133.method952(arg0, 127).field2373 >= class133.method952(arg3.field683, arg2 + 127).field2373) {
                arg3.field708 = 0;
                arg3.field695 = 0;
                arg3.field683 = arg0;
                arg3.field715 = 0;
                arg3.field724 = arg1;
                arg3.field742 = arg3.field704;
                if (arg3.field683 != -1) {
                    class168.method1212(arg3.field676, arg3.field708, false, class133.method952(arg3.field683, 127), 1928670186, arg3.field685);
                }
            }
            ++field1262;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public static void method456(int arg0) {
        field1261 = null;
        if (arg0 == 1047693) {
            field1259 = null;
            field1269 = null;
            field1253 = null;
            field1272 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)Lcg;")
    public static final class161 method457(int arg0) {
        int var1 = -16 / ((arg0 - 28) / 32);
        ++field1260;
        class161 var2 = (class161) class140.field2662.method995(26386);
        if (var2 != null) {
            var2.method1477(1);
            var2.method1728(1000);
            return var2;
        } else {
            class161 var3;
            do {
                var3 = (class161) class210.field3792.method995(26386);
                if (var3 == null) {
                    return null;
                }
                if (var3.method1170(false) > class253.method1711((byte) -95)) {
                    return null;
                }
                var3.method1477(1);
                var3.method1728(1000);
            } while (~(var3.field4542 & Long.MIN_VALUE) == -1L);
            return var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(III)Z")
    private final boolean method458(int arg0, int arg1, int arg2) {
        ++field1271;
        int var4 = (arg0 - -arg2) * this.field1268 >> 12;
        int var5 = class237.field4277[(1046893 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1268;
        int var7 = (var6 << 12) / this.field1256;
        if (arg1 != -5818) {
            return false;
        } else {
            int var8 = this.field1265 * var7 >> 12;
            return var8 > arg0 - arg2 && -var8 < arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1255;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (arg0 != -7420) {
            this.method34(-5, (class200) null, 78);
        }
        if (super.field4800.field3160) {
            int var4 = class143.field2711[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class176.field3200; ++var5) {
                int var6 = class114.field2184[var5] + -2048;
                int var7 = this.field1254 + var4;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field1264 + var6;
                int var11 = ~var10 <= 2047 ? var10 : var10 - -4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field1274 + var4;
                int var14 = this.field1266 + var6;
                int var15 = var13 < -2048 ? var13 - -4096 : var13;
                int var16 = ~var15 >= -2049 ? var15 : var15 + -4096;
                int var17 = var14 < -2048 ? var14 + 4096 : var14;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = !this.method453(var18, false, var9) && !this.method458(var16, -5818, var12) ? 0 : 4096;
            }
        }
        return var3;
    }
}
