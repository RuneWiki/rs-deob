import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class89 {

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    private int field1267 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lcn;")
    private class37 field1261;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public static boolean field1266 = false;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
    public static int[] field1270 = new int[4096];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lwk;")
    private class172 field1271;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
    public static int[] field1262;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method798(byte arg0, int arg1) {
        field1268++;
        class133 var2 = (class133) class81.field1169.method370((byte) -120, (long) arg1);
        if (var2 == null) {
            return;
        }
        if (arg0 != 19) {
            field1270 = (int[]) null;
        }
        for (int var3 = 0; var3 < var2.field2231.length; var3++) {
            var2.field2231[var3] = -1;
            var2.field2227[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 34)
    public static void method799(byte arg0) {
        field1262 = null;
        field1270 = null;
        if (arg0 != 27) {
            method798((byte) -46, 32);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBIII)V", line = 47)
    public static final void method800(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg1 != -64) {
            method799((byte) 32);
        }
        while (class362.field5732 > var5) {
            if (arg4 < class188.field2958[var5] + class236.field3677[var5] && (arg4 + arg2) > class188.field2958[var5] && arg3 < (class212.field3299[var5] + class91.field1390[var5]) && arg3 + arg0 > class212.field3299[var5]) {
                class227.field3540[var5] = true;
            }
            var5++;
        }
        field1269++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIIIIIII[Lrk;[B)V", line = 66)
    public static final void method801(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class290[] arg9, byte[] arg10) {
        field1264++;
        if (arg4 != 2707) {
            field1262 = (int[]) null;
        }
        int var11 = -1;
        class25 var12 = new class25(arg10);
        while (true) {
            int var13 = var12.method308((byte) -59);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method270(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var12.method281(arg4 ^ 0xFFFFF513);
                int var19 = var14 >> 6 & 0x3F;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg1 == var17 && var19 >= arg2 && var19 < arg2 + 8 && var16 >= arg3 && arg3 + 8 > var16) {
                    class212 var22 = class43.method437(47, var11);
                    int var23 = arg6 + class284.method2063(var21, var22.field3306, (byte) -104, var22.field3250, var16 & 0x7, var19 & 0x7, arg8);
                    int var24 = class9.method95(arg8, (byte) -60, var16 & 0x7, var22.field3250, var19 & 0x7, var22.field3306, var21) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class290 var25 = null;
                        if (!arg0) {
                            int var26 = arg7;
                            if ((class146.field2386[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        class204.method1525(19330, var11, var20, !arg0, var24, arg7, arg7, var23, arg0, arg8 + var21 & 0x3, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lwk;", line = 147)
    public final class172 method802(int arg0) {
        field1265++;
        if (this.field1267 > 0 && this.field1261.field558[this.field1267 - 1] != this.field1271) {
            class172 var2 = this.field1271;
            this.field1271 = var2.field2737;
            return var2;
        }
        class172 var3;
        do {
            if (this.field1261.field553 <= this.field1267) {
                if (arg0 != 20592) {
                    this.field1271 = (class172) null;
                }
                return null;
            }
            var3 = this.field1261.field558[this.field1267++].field2737;
        } while (this.field1261.field558[this.field1267 - 1] == var3);
        this.field1271 = var3.field2737;
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lfe;I)V", line = 181)
    public static final void method803(class285 arg0, int arg1) {
        field1272++;
        long var2 = 0L;
        if (arg0.field4423 == 0) {
            var2 = class280.method2045(arg0.field4430, arg0.field4416, arg0.field4427);
        }
        if (arg0.field4423 == 1) {
            var2 = class252.method1873(arg0.field4430, arg0.field4416, arg0.field4427);
        }
        int var4 = arg1;
        if (arg0.field4423 == 2) {
            var2 = class209.method1553(arg0.field4430, arg0.field4416, arg0.field4427);
        }
        int var5 = 0;
        if (arg0.field4423 == 3) {
            var2 = class41.method427(arg0.field4430, arg0.field4416, arg0.field4427);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var6 = ((int) var2 & 0x7F07C) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = (int) var2 >> 20 & 0x3;
        }
        arg0.field4422 = var6;
        arg0.field4425 = var4;
        arg0.field4433 = var5;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Lwk;", line = 230)
    public final class172 method804(boolean arg0) {
        this.field1267 = 0;
        if (arg0) {
            return (class172) null;
        } else {
            field1263++;
            return this.method802(20592);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lcn;)V", line = 248)
    public class89(class37 arg0) {
        this.field1261 = arg0;
    }
}
