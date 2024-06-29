import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class183 extends class239 {

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private final int field3186;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    private final int field3189;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    private final int field3183;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    private final int field3188;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field3184 = 0;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lie;")
    public static class117 field3176 = new class117(50);

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field3190 = -1;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field3192 = 0;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "S")
    public static short field3191 = 32767;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
    public static final boolean method1249(int arg0, int arg1) {
        if (arg1 != -672) {
            method1251(103);
        }
        ++field3181;
        return ~arg0 <= -98 && arg0 <= 122 || ~arg0 <= -66 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILme;I)I")
    public static final int method1250(int arg0, class44 arg1, int arg2) {
        ++field3182;
        if (arg1.field867 != null && ~arg2 > ~arg1.field867.length) {
            try {
                int[] var3 = arg1.field867[arg2];
                int var4 = arg0;
                byte var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var3[var6++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (var7 == 0) {
                        return var4;
                    }
                    if (~var7 == -2) {
                        var8 = class53.field1156[var3[var6++]];
                    }
                    if (~var7 == -3) {
                        var8 = class239.field4106[var3[var6++]];
                    }
                    if (~var7 == -16) {
                        var9 = 1;
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (~var7 == -4) {
                        var8 = class248.field4274[var3[var6++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var6++] << 16;
                        int var11 = var10 + var3[var6++];
                        class44 var12 = class221.method1456(var11, (byte) -105);
                        int var13 = var3[var6++];
                        if (~var13 != 0 && (!class156.method1090(var13, 0).field309 || class68.field1363)) {
                            for (int var14 = 0; ~var14 > ~var12.field929.length; ++var14) {
                                if (var13 + 1 == var12.field929[var14]) {
                                    var8 += var12.field1008[var14];
                                }
                            }
                        }
                    }
                    if (var7 == 5) {
                        var8 = class117.field2100[var3[var6++]];
                    }
                    if (var7 == 6) {
                        var8 = class178.field3046[class239.field4106[var3[var6++]] + -1];
                    }
                    if (var7 == 7) {
                        var8 = class117.field2100[var3[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var8 = class137.field2441.field3115;
                    }
                    if (~var7 == -10) {
                        for (int var15 = 0; var15 < 25; ++var15) {
                            if (class78.field1511[var15]) {
                                var8 += class239.field4106[var15];
                            }
                        }
                    }
                    if (~var7 == -11) {
                        int var16 = var3[var6++] << 16;
                        int var17 = var16 + var3[var6++];
                        class44 var18 = class221.method1456(var17, (byte) -126);
                        int var19 = var3[var6++];
                        if (~var19 != 0 && (!class156.method1090(var19, 0).field309 || class68.field1363)) {
                            for (int var20 = 0; var20 < var18.field929.length; ++var20) {
                                if (var19 + 1 == var18.field929[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var8 = class33.field650;
                    }
                    if (var7 == 12) {
                        var8 = class255.field4365;
                    }
                    if (var7 == 13) {
                        int var21 = class117.field2100[var3[var6++]];
                        int var22 = var3[var6++];
                        var8 = ~(1 << var22 & var21) == -1 ? 0 : 1;
                    }
                    if (~var7 == -15) {
                        int var23 = var3[var6++];
                        var8 = class230.method1500(-105, var23);
                    }
                    if (~var7 == -19) {
                        var8 = (class137.field2441.field4177 >> 7) + class244.field4232;
                    }
                    if (var7 == 19) {
                        var8 = (class137.field2441.field4143 >> 7) + class231.field3878;
                    }
                    if (var7 == 20) {
                        var8 = var3[var6++];
                    }
                    if (var9 != 0) {
                        var5 = var9;
                    } else {
                        if (var5 == 0) {
                            var4 += var8;
                        }
                        if (~var5 == -2) {
                            var4 -= var8;
                        }
                        if (var5 == 2 && ~var8 != -1) {
                            var4 /= var8;
                        }
                        if (~var5 == -4) {
                            var4 *= var8;
                        }
                        var5 = 0;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)V")
    public final void method242(int arg0, byte arg1, int arg2) {
        ++field3179;
        if (arg1 >= -10) {
            field3184 = 28;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIII)V")
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3186 = arg0;
        this.field3189 = arg2;
        this.field3183 = arg1;
        this.field3188 = arg3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method1251(int arg0) {
        int var1 = -2 / ((arg0 - -71) / 55);
        field3176 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBIII)V")
    public static final void method1252(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 40) {
            field3176 = null;
        }
        ++field3180;
        int var9 = arg1 + 1;
        class94.method692(class185.field3220[arg1], (byte) 93, arg3, arg5, arg4);
        int var8 = arg0 - 1;
        class94.method692(class185.field3220[arg0], (byte) -122, arg3, arg5, arg4);
        for (int var6 = var9; var6 <= var8; ++var6) {
            int[] var7 = class185.field3220[var6];
            var7[arg3] = var7[arg4] = arg5;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)V")
    public final void method240(byte arg0, int arg1, int arg2) {
        if (arg0 == -15) {
            int var4 = this.field3189 * arg2 >> 12;
            int var5 = this.field3186 * arg2 >> 12;
            ++field3177;
            int var6 = this.field3183 * arg1 >> 12;
            int var7 = this.field3188 * arg1 >> 12;
            class71.method536(-674930900, var5, super.field4102, var4, var7, var6);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1253(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (class123.field2211 <= -arg0 + arg6 && arg0 + arg6 <= class145.field2540 && class40.field834 <= arg2 - arg0 && arg0 + arg2 <= class255.field4371) {
            class37.method301(arg6, arg5, arg1, -1, arg4, arg0, arg2);
        } else {
            class72.method539(arg1, arg0, (byte) 83, arg5, arg4, arg2, arg6);
        }
        ++field3187;
        if (arg3 != -68) {
            field3191 = 74;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
    public final void method241(int arg0, int arg1, int arg2) {
        ++field3178;
        int var4 = -6 % ((arg1 - 62) / 40);
    }
}
