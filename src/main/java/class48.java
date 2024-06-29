import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[I")
    public static int[] field1163 = new int[] { 0, 0, -1, 0, 0, 0, 15, 0, 0, 0, 1, 0, 0, 0, 1, 6, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 4, 6, 8, 0, 6, 0, 10, 0, 0, 10, 0, 0, 0, 1, 0, 0, 4, 0, -1, 0, 0, 0, 7, 0, 2, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 6, 0, 2, 0, 3, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 2, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 6, 3, 0, 8, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 2, 0, 0, 0, 4, 2, 0, 5, 0, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, -1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 5, 11, 5, 0, 0, 0, -2, 0, 4, 14, 0, 2, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, -2, 5, 0, 0, 0, 0, 0, 0, 0, 6, 4, 0, 0, 6, -2, 0, -1, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 0, -2, 6 };

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Loc;")
    private static class99 field1159 = method402((byte) -104, "Use");

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Loc;")
    public static class99 field1166 = field1159;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static volatile int field1172 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Loc;")
    private static class99 field1165 = method402((byte) -104, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Loc;")
    public static class99 field1168 = field1165;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Ljf;")
    public static class68 field1171 = new class68();

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Loc;")
    public static class99 field1174 = method402((byte) -104, "(Y ");

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "[I")
    public static int[] field1173 = new int[5];

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "J")
    public static long field1176 = 0L;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lra;")
    public static class115 field1162;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lpc;II)Lqd;")
    public static final class113 method398(class105 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field1158++;
            byte[] var3 = arg0.method897(arg1, arg2);
            return var3 == null ? null : new class113(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Z")
    public static final boolean method399(int arg0, int arg1) {
        field1164++;
        if (arg0 != 0) {
            method402((byte) 98, null);
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILoc;ILoc;)V")
    public static final void method400(int arg0, class99 arg1, int arg2, class99 arg3) {
        if (arg0 == 0 && class127.field3110 != -1) {
            class93.field2251 = arg1;
            class49.field1179 = 0;
        }
        field1157++;
        if (class87.field2162 == -1) {
            class113.field2832 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class104.field2527[var4] = class104.field2527[var4 - 1];
            class137.field3420[var4] = class137.field3420[var4 - 1];
            class81.field2003[var4] = class81.field2003[var4 - 1];
        }
        int var5 = 108 % ((48 - arg2) / 46);
        class137.field3420[0] = arg3;
        class104.field2527[0] = arg0;
        class81.field2003[0] = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static void method401(boolean arg0) {
        field1159 = null;
        field1171 = null;
        field1174 = null;
        field1173 = null;
        if (arg0) {
            return;
        }
        field1168 = null;
        field1162 = null;
        field1163 = null;
        field1165 = null;
        field1166 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/String;)Loc;")
    public static final class99 method402(byte arg0, String arg1) {
        field1170++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class99 var4 = new class99();
        var4.field2394 = new byte[var3];
        if (arg0 != -104) {
            method404((byte) -24, null);
        }
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2394[var4.field2391++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field2394[var4.field2391++] = (byte) var6;
            }
        }
        var4.method809((byte) 124);
        return var4.method841(arg0 ^ 0xFFFFFFF0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[B[Lee;Lae;II)V")
    public static final void method403(int arg0, byte[] arg1, class34[] arg2, class6 arg3, int arg4, int arg5) {
        field1161++;
        int var6 = -1;
        class57 var7 = new class57(arg1);
        while (true) {
            int var8 = var7.method470((byte) -102);
            if (var8 == 0) {
                if (arg4 != 169) {
                    field1171 = null;
                    return;
                }
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method470((byte) -115);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var7.method510(arg4 ^ 0xFFFFFF2F);
                int var13 = var9 & 0x3F;
                int var14 = var9 >> 12;
                int var15 = var12 & 0x3;
                int var16 = var12 >> 2;
                int var17 = arg5 + var11;
                int var18 = arg0 + var13;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class34 var19 = null;
                    int var20 = var14;
                    if ((class81.field2028[1][var17][var18] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg2[var20];
                    }
                    class132.method1068(var18, var14, arg3, var17, var16, var19, var6, -4388, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLhe;)Z")
    public static final boolean method404(byte arg0, class54 arg1) {
        field1167++;
        int var2 = arg1.field1327;
        if (class74.field1889 == 2) {
            if (var2 == 201) {
                class30.field712 = true;
                class137.field3412 = class137.field3407;
                class137.field3424 = class121.field2965;
                class113.field2832 = true;
                class3.field56 = 0;
                class126.field3052 = 1;
            }
            if (var2 == 202) {
                class126.field3052 = 2;
                class3.field56 = 0;
                class113.field2832 = true;
                class137.field3412 = class137.field3407;
                class137.field3424 = field1168;
                class30.field712 = true;
            }
        }
        if (var2 == 205) {
            class37.field936 = 250;
            return true;
        }
        if (arg0 <= 106) {
            method404((byte) -60, null);
        }
        if (var2 == 501) {
            class3.field56 = 0;
            class137.field3424 = class87.field2178;
            class126.field3052 = 4;
            class30.field712 = true;
            class137.field3412 = class137.field3407;
            class113.field2832 = true;
        }
        if (var2 == 502) {
            class30.field712 = true;
            class113.field2832 = true;
            class137.field3424 = class33.field789;
            class137.field3412 = class137.field3407;
            class3.field56 = 0;
            class126.field3052 = 5;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class126.field3032.method1074(var3, 117, var4 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class126.field3032.method1083(110, var5, var6 == 1);
        }
        if (var2 == 324) {
            class126.field3032.method1080(-22500, false);
        }
        if (var2 == 325) {
            class126.field3032.method1080(-22500, true);
        }
        if (var2 == 326) {
            class134.field3276.method869((byte) 11, 114);
            class110.field2737++;
            class126.field3032.method1078(class134.field3276, (byte) -104);
            return true;
        }
        if (var2 == 620) {
            class100.field2433 = !class100.field2433;
        }
        if (var2 >= 601 && var2 <= 613) {
            class132.method1069(-117);
            if (class137.field3434.method810(-58) > 0) {
                class88.field2190++;
                class134.field3276.method869((byte) 11, 169);
                class134.field3276.method490(true, class137.field3434.method834(-97));
                class134.field3276.method514((byte) 73, var2 - 601);
                class134.field3276.method514((byte) 73, class100.field2433 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILoc;)V")
    public static final void method405(int arg0, int arg1, class99 arg2) {
        class144.field3592++;
        field1169++;
        class134.field3276.method869((byte) 11, arg0);
        class134.field3276.method488(arg1, 0);
        class134.field3276.method490(true, arg2.method834(-97));
    }
}
