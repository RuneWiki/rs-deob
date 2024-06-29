import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class92 extends class210 {

    @OriginalMember(owner = "client!kq", name = "T", descriptor = "I")
    private int field1145 = 4096;

    @OriginalMember(owner = "client!kq", name = "S", descriptor = "Z")
    public static boolean field1144 = false;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "Lhj;")
    public static class109 field1139 = new class109("runescape", 0);

    @OriginalMember(owner = "client!kq", name = "Y", descriptor = "I")
    public static int field1150 = -2;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!kq", name = "R", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!kq", name = "V", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kq", name = "W", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kq", name = "X", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!kq", name = "U", descriptor = "Lct;")
    public static class104 field1146;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "[I")
    public static int[] field1136;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "[S")
    public static short[] field1137;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field1135;
        if (arg1 != -38) {
            field1149 = -50;
        }
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(arg0 + -1 & class139.field1911, -128, 0);
            int[] var5 = this.method1447(arg0, -118, 0);
            int[] var6 = this.method1447(arg0 + 1 & class139.field1911, -121, 0);
            for (int var7 = 0; var7 < class202.field2852; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1145;
                int var9 = (var5[class437.field6373 & var7 + 1] + -var5[class437.field6373 & var7 + -1]) * this.field1145;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLwe;Z)V")
    public static final void method623(boolean arg0, class26 arg1, boolean arg2) {
        ++field1138;
        if (class237.field3532 < 400) {
            class327 var3 = arg1.field369;
            if (var3.field4871 != null) {
                var3 = var3.method2139(arg2);
                if (var3 == null) {
                    return;
                }
            }
            if (!arg2) {
                field1144 = false;
            }
            if (var3.field4810) {
                String var4 = var3.field4817;
                if (~var3.field4812 != -1) {
                    String var5 = class408.field5869 == class166.field2191 ? class433.field6314.method2543(false, class153.field2073) : class37.field528.method2543(!arg2, class153.field2073);
                    var4 = var4 + class308.method2057(class187.field2619.field5553, (byte) 93, var3.field4812) + " (" + var5 + var3.field4812 + ")";
                }
                if (!class147.field1993) {
                    if (!arg0) {
                        String[] var6 = var3.field4813;
                        if (class423.field6109) {
                            var6 = class336.method2177(var6, true);
                        }
                        if (var6 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (var6[var7] != null && (field1139 != class408.field5869 || !var6[var7].equalsIgnoreCase(class282.field4143.method2543(false, class153.field2073)))) {
                                    byte var8 = 0;
                                    if (var7 == 0) {
                                        var8 = 60;
                                    }
                                    int var9 = class452.field6668;
                                    if (var7 == 1) {
                                        var8 = 23;
                                    }
                                    if (var7 == 2) {
                                        var8 = 22;
                                    }
                                    if (~var7 == -4) {
                                        var8 = 4;
                                    }
                                    if (var7 == 4) {
                                        var8 = 47;
                                    }
                                    if (~var3.field4872 == ~var7) {
                                        var9 = var3.field4822;
                                    }
                                    if (var3.field4857 == var7) {
                                        var9 = var3.field4845;
                                    }
                                    ++class169.field2209;
                                    class463.method2862(var9, 0, false, true, var6[var7], (long) arg1.field777, "<col=ffff00>" + var4, (byte) -101, var8, 0);
                                }
                            }
                        }
                        if (field1139 == class408.field5869 && var6 != null) {
                            for (int var10 = 4; ~var10 <= -1; --var10) {
                                if (var6[var10] != null && var6[var10].equalsIgnoreCase(class282.field4143.method2543(false, class153.field2073))) {
                                    short var11 = 0;
                                    if (class187.field2619.field5553 < var3.field4812) {
                                        var11 = 2000;
                                    }
                                    short var12 = 0;
                                    if (~var10 == -1) {
                                        var12 = 60;
                                    }
                                    if (var10 == 1) {
                                        var12 = 23;
                                    }
                                    if (var10 == 2) {
                                        var12 = 22;
                                    }
                                    if (var10 == 3) {
                                        var12 = 4;
                                    }
                                    if (var10 == 4) {
                                        var12 = 47;
                                    }
                                    if (~var12 != -1) {
                                        var12 += var11;
                                    }
                                    class463.method2862(var3.field4811, 0, false, true, var6[var10], (long) arg1.field777, "<col=ffff00>" + var4, (byte) -126, var12, 0);
                                    ++class167.field2201;
                                }
                            }
                        }
                    }
                    ++class256.field3766;
                    class463.method2862(class383.field5615, 0, arg0, true, class242.field3591.method2543(!arg2, class153.field2073), (long) arg1.field777, "<col=ffff00>" + var4, (byte) -111, 1002, 0);
                } else {
                    if (!arg0) {
                        class294 var13 = class356.field5173 != -1 ? class320.method2109(class356.field5173, (byte) -116) : null;
                        if (~(2 & class433.field6315) != -1) {
                            if (var13 == null || ~var3.method2135((byte) 20, var13.field4270, class356.field5173) != ~var13.field4270) {
                                ++class104.field1355;
                                class463.method2862(class90.field1107, 0, false, true, class253.field3723, (long) arg1.field777, class429.field6240 + " -> <col=ffff00>" + var4, (byte) -115, 12, 0);
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)V")
    public static void method624(boolean arg0) {
        if (arg0) {
            field1137 = null;
            field1139 = null;
            field1136 = null;
            field1146 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)[Lmg;")
    public static final class429[] method625(int arg0) {
        if (class244.field3613 == null) {
            class429[] var1 = class409.method2542(0, class267.field3963);
            class429[] var2 = new class429[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var1.length > var4; ++var4) {
                class429 var8 = var1[var4];
                if ((var8.field6230 <= 0 || var8.field6230 >= 24) && ~var8.field6234 <= -801 && ~var8.field6235 <= -601 && (class451.field6661 >= 96 || ~class118.field1594 != -1 || ~var8.field6234 >= -1025 && var8.field6235 <= 768)) {
                    for (int var9 = 0; ~var9 > ~var3; ++var9) {
                        class429 var10 = var2[var9];
                        if (~var8.field6234 == ~var10.field6234 && var8.field6235 == var10.field6235) {
                            if (var10.field6230 < var8.field6230) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class244.field3613 = new class429[var3];
            class224.method1538(var2, 0, class244.field3613, 0, var3);
            int[] var5 = new int[class244.field3613.length];
            for (int var6 = 0; var6 < class244.field3613.length; ++var6) {
                class429 var7 = class244.field3613[var6];
                var5[var6] = var7.field6235 * var7.field6234;
            }
            class395.method2481(var5, class244.field3613, 3);
        }
        if (arg0 != 768) {
            field1136 = null;
        }
        ++field1140;
        return class244.field3613;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            field1146 = null;
        }
        if (arg0 == 0) {
            this.field1145 = arg2.method1767(arg1 + 1930505517);
        }
        ++field1143;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)I")
    public static final int method626(int arg0, int arg1, int arg2, int arg3) {
        ++field1148;
        if (arg1 != -5268) {
            method626(-35, 91, -11, 113);
        }
        int var4 = arg2 & 3;
        if (~var4 == -1) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else {
            return var4 == 2 ? -arg3 + 7 : -arg0 + 7;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method627(String arg0, byte arg1) {
        ++field1141;
        int var2 = 116 / ((-16 - arg1) / 53);
        return class133.method890(-58, arg0, true, 10);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method628(int arg0, String arg1) {
        ++field1134;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; ++var4) {
            var3 = -var3 + (var3 << 5) + arg1.charAt(var4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V")
    public static final void method629(int arg0, boolean arg1) {
        ++field1142;
        byte[][] var2;
        if (arg1) {
            var2 = class322.field4762;
        } else {
            var2 = class38.field532;
        }
        int var3 = class24.field336.length;
        int var4 = -38 / ((arg0 - 57) / 43);
        for (int var5 = 0; ~var3 < ~var5; ++var5) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class356.field5174[var5] >> 8) * 64 + -class28.field399;
                int var8 = (255 & class356.field5174[var5]) * 64 - class134.field1846;
                class60.method457(14597);
                class58.method439(var8, var6, 16284, arg1, class74.field942, class382.field5610, var7);
            }
        }
    }
}
