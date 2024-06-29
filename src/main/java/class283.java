import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class283 extends class69 {

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "[J")
    public static long[] field4979 = new long[256];

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "Lvf;")
    public static class265 field4986;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public int field4981;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "Li;")
    public class182 field4983;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "[B")
    public byte[] field4982;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "[[[B")
    public static byte[][][] field4984;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
    public static final void method1918(int arg0) {
        int var1 = class130.field2335;
        ++field4989;
        int var2 = 6116423;
        int var3 = class279.field4926;
        int var4 = class172.field3103;
        int var5 = class182.field3227;
        class35.method295(var1, var5, var3, var4, var2);
        class35.method295(var1 + 1, var5 - -1, var3 + -2, 16, 0);
        class35.method292(var1 + 1, var5 + 18, var3 + -2, var4 + -19, 0);
        class205.field3692.method763(class103.field1833, var1 + 3, var5 + 14, var2, -1);
        int var6 = class79.field1497;
        int var7 = class268.field4722;
        for (int var8 = arg0; ~var8 > ~class120.field2129; ++var8) {
            int var9 = (class120.field2129 + -1 + -var8) * 15 + 31 + var5;
            int var10 = 16777215;
            if (~var6 < ~var1 && ~var6 > ~(var1 + var3) && var9 + -13 < var7 && ~(var9 - -3) < ~var7) {
                var10 = 16776960;
            }
            class205.field3692.method763(class118.method798(var8, 1927674668), var1 + 3, var9, var10, 0);
        }
        class139.method961(class172.field3103, class182.field3227, class279.field4926, 6467, class130.field2335);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBIII)V")
    public static final void method1919(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field4988;
        int var6 = -arg0 + arg4;
        int var7 = arg3 - arg5;
        if (~var6 == -1) {
            if (~var7 != -1) {
                class208.method1429(100, arg3, arg1, arg0, arg5);
            }
        } else if (var7 == 0) {
            class117.method790(arg4, (byte) 61, arg0, arg1, arg5);
        } else {
            if (~var6 > -1) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = ~var7 < ~var6;
            if (var8) {
                int var9 = arg0;
                int var10 = arg4;
                arg4 = arg3;
                arg3 = var10;
                arg0 = arg5;
                arg5 = var9;
            }
            if (arg2 <= -3) {
                if (arg4 < arg0) {
                    int var11 = arg0;
                    arg0 = arg4;
                    arg4 = var11;
                    int var12 = arg5;
                    arg5 = arg3;
                    arg3 = var12;
                }
                int var13 = -arg5 + arg3;
                int var14 = -arg0 + arg4;
                int var15 = -(var14 >> 1);
                int var16 = arg5 < arg3 ? 1 : -1;
                if (var13 < 0) {
                    var13 = -var13;
                }
                int var17 = arg5;
                if (var8) {
                    for (int var18 = arg0; var18 <= arg4; ++var18) {
                        class44.field973[var18][var17] = arg1;
                        var15 += var13;
                        if (var15 > 0) {
                            var17 += var16;
                            var15 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg0; ~var19 >= ~arg4; ++var19) {
                        class44.field973[var17][var19] = arg1;
                        var15 += var13;
                        if (var15 > 0) {
                            var17 += var16;
                            var15 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)[B")
    public final byte[] method493(int arg0) {
        ++field4978;
        if (super.field1315) {
            throw new RuntimeException();
        } else {
            int var2 = 28 % ((arg0 - -63) / 36);
            return this.field4982;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIILfl;)[Lvj;")
    public static final class88[] method1920(byte arg0, int arg1, int arg2, class192 arg3) {
        ++field4976;
        if (!class28.method239(50, arg3, arg2, arg1)) {
            return null;
        } else {
            if (arg0 != 28) {
                field4984 = null;
            }
            return class204.method1398(false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public static void method1921(byte arg0) {
        if (arg0 == -86) {
            field4984 = null;
            field4979 = null;
            field4986 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILvf;)I")
    public static final int method1922(int arg0, class265 arg1) {
        ++field4980;
        int var2 = 0;
        if (arg0 != 5143) {
            return -128;
        } else {
            while (~class91.field1623.length < ~var2) {
                if (class91.field1623[var2].method1791(arg1, (byte) -98)) {
                    return var2;
                }
                ++var2;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBILjava/awt/Component;)Lok;")
    public static final class127 method1923(int arg0, byte arg1, int arg2, Component arg3) {
        ++field4987;
        if (arg1 < 51) {
            field4985 = 93;
        }
        try {
            Class var4 = Class.forName("mb");
            class127 var5 = (class127) var4.newInstance();
            var5.method579(arg0, arg2, (byte) -70, arg3);
            return var5;
        } catch (Throwable var7) {
            class163 var6 = new class163();
            var6.method579(arg0, arg2, (byte) -70, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
    public final int method492(int arg0) {
        if (arg0 != -2) {
            this.method493(-19);
        }
        ++field4977;
        return super.field1315 ? 0 : 100;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(1L & var1) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field4979[var0] = var1;
        }
        field4986 = class87.method582(-46, ",Mcran)2titre charg-B");
        field4985 = 0;
        field4990 = 0;
    }
}
