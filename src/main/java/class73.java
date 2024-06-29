import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class73 {

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lnb;")
    private class117 field1149 = new class117();

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Lbf;")
    private class209 field1157;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field1148 = 0;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lma;")
    public static class5 field1142 = class12.method119("; Max)2Age=", (byte) 120);

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Leb;")
    public static class253 field1145 = null;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "[I")
    public static int[] field1153 = new int[32768];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[Lma;")
    public static class5[] field1152;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLql;Lql;)V", line = 9)
    public static final void method515(byte arg0, class297 arg1, class297 arg2) {
        if (arg1.field4998 != null) {
            arg1.method1997(-27381);
        }
        field1154++;
        arg1.field5005 = arg2;
        arg1.field4998 = arg2.field4998;
        arg1.field4998.field5005 = arg1;
        if (arg0 != -104) {
            field1152 = (class5[]) null;
        }
        arg1.field5005.field4998 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 29)
    public static void method516(int arg0) {
        if (arg0 != -30488) {
            field1153 = (int[]) null;
        }
        field1153 = null;
        field1142 = null;
        field1145 = null;
        field1152 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V", line = 42)
    public final void method517(boolean arg0, int arg1) {
        if (class271.field4637 != null) {
            for (class249 var3 = (class249) this.field1149.method781(-1); var3 != null; var3 = (class249) this.field1149.method789((byte) 124)) {
                if (var3.method147(5)) {
                    if (var3.method146(0) == null) {
                        var3.method1997(-27381);
                        var3.method1828(-108);
                        this.field1143++;
                    }
                } else if (++var3.field4541 > (long) arg1) {
                    class249 var4 = class271.field4637.method157(var3, 11657);
                    this.field1157.method1376(var3.field5004, -1, var4);
                    class234.method1661(57, var4, var3);
                    var3.method1997(-27381);
                    var3.method1828(-113);
                }
            }
        }
        field1150++;
        if (arg0) {
            this.field1157 = (class209) null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZJIB)Lma;", line = 93)
    public static final class5 method518(boolean arg0, long arg1, int arg2, byte arg3) {
        field1155++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var5 = 1;
        long var6 = arg1 / (long) arg2;
        while (var6 != 0L) {
            var6 /= (long) arg2;
            var5++;
        }
        int var8 = var5;
        if (arg1 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        if (arg3 != 43) {
            field1152 = (class5[]) null;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg1 % (long) arg2);
            arg1 /= (long) arg2;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class5 var12 = new class5();
        var12.field57 = var9;
        var12.field72 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/lang/Object;J)V", line = 155)
    public final void method519(byte arg0, Object arg1, long arg2) {
        this.method520(32, arg2);
        if (this.field1143 == 0) {
            class249 var5 = (class249) this.field1149.method785(114);
            var5.method1997(-27381);
            var5.method1828(-79);
        } else {
            this.field1143--;
        }
        field1138++;
        class284 var6 = new class284(arg1);
        this.field1157.method1376(arg2, -1, var6);
        if (arg0 != -95) {
            this.method521(-77L, (byte) -5);
        }
        this.field1149.method786(var6, 0);
        var6.field4541 = 0L;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IJ)V", line = 186)
    public final void method520(int arg0, long arg1) {
        if (arg0 != 32) {
            return;
        }
        field1139++;
        class249 var4 = (class249) this.field1157.method1372(false, arg1);
        if (var4 != null) {
            var4.method1997(arg0 - 27413);
            var4.method1828(-103);
            this.field1143++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 209)
    public final Object method521(long arg0, byte arg1) {
        field1140++;
        class249 var4 = (class249) this.field1157.method1372(false, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method146(0);
        if (arg1 != 80) {
            method515((byte) -115, (class297) null, (class297) null);
        }
        if (var5 == null) {
            var4.method1997(-27381);
            var4.method1828(arg1 ^ 0xFFFFFFF5);
            this.field1143++;
            return null;
        }
        if (var4.method147(5)) {
            class284 var6 = new class284(var5);
            this.field1157.method1376(var4.field5004, -1, var6);
            this.field1149.method786(var6, 0);
            var6.field4541 = 0L;
            var4.method1997(-27381);
            var4.method1828(-75);
        } else {
            this.field1149.method786(var4, arg1 ^ 0x50);
            var4.field4541 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 261)
    public final void method522(int arg0) {
        class249 var2 = (class249) this.field1149.method781(-1);
        if (arg0 <= 48) {
            return;
        }
        while (var2 != null) {
            if (var2.method147(5)) {
                var2.method1997(-27381);
                var2.method1828(-116);
                this.field1143++;
            }
            var2 = (class249) this.field1149.method789((byte) 114);
        }
        field1147++;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 293)
    public final void method523(int arg0) {
        this.field1149.method782(-18590);
        field1144++;
        if (arg0 <= 121) {
            field1145 = (class253) null;
        }
        this.field1157.method1382((byte) 118);
        this.field1143 = this.field1156;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIILeb;)V", line = 306)
    public static final void method524(int arg0, int arg1, int arg2, int arg3, class253 arg4) {
        if (arg0 != 24632) {
            method515((byte) -81, (class297) null, (class297) null);
        }
        class177.method1155((byte) 96);
        field1146++;
        class124.method822(arg3, arg1, arg4.field4228 + arg3, arg4.field4190 + arg1);
        if (class100.field1499 == 2 || class100.field1499 == 5 || class260.field4438 == null) {
            class237 var57 = arg4.method1774(arg0 - 24745, false);
            if (var57 != null) {
                var57.method213(arg3, arg1);
            }
        } else {
            int var5 = class24.field416 + class14.field268 & 0x7FF;
            int var6 = class151.field2183.field178 / 32 + 48;
            int var7 = 464 - (class151.field2183.field211 / 32);
            ((class109) class260.field4438).method728(arg3, arg1, arg4.field4228, arg4.field4190, var6, var7, var5, class236.field3894 + 256, (class109) arg4.method1774(-70, false));
            if (class118.field1792 != null) {
                for (int var8 = 0; var8 < class118.field1792.field403; var8++) {
                    if (class118.field1792.method183(var8, 10)) {
                        int var9 = (class118.field1792.field396[var8] - class193.field3017) * 4 + 2 - (class151.field2183.field178 / 32);
                        int var10 = class229.field3805[var5];
                        int var11 = var10 * 256 / (class236.field3894 + 256);
                        int var12 = (class118.field1792.field395[var8] - class74.field1158) * 4 + 2 - class151.field2183.field211 / 32;
                        int var13 = class229.field3806[var5];
                        int var14 = var13 * 256 / (class236.field3894 + 256);
                        class299 var15 = class282.field4791;
                        int var16 = var9 * var14 + var11 * var12 >> 16;
                        int var17 = var12 * var14 - (var9 * var11) >> 16;
                        if (class118.field1792.method185(var8, -18321) == 1) {
                            var15 = class72.field1127;
                        }
                        if (class118.field1792.method185(var8, -18321) == 2) {
                            var15 = class201.field3197;
                        }
                        int var18 = var15.method2016(class118.field1792.field397[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (-arg4.field4228 <= var19 && var19 <= arg4.field4228 && var17 >= -arg4.field4190 && arg4.field4190 >= var17) {
                            int var20 = 16777215;
                            if (class118.field1792.field398[var8] != -1) {
                                var20 = class118.field1792.field398[var8];
                            }
                            class124.method820((class109) arg4.method1774(-70, false));
                            var15.method2029(class118.field1792.field397[var8], arg3 + var19 + (arg4.field4228 / 2), arg4.field4190 / 2 + arg1 + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            class124.method817();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class105.field1556; var21++) {
                int var22 = class218.field3515[var21] * 4 + 2 - (class151.field2183.field211 / 32);
                int var23 = class204.field3266[var21] * 4 + 2 - class151.field2183.field178 / 32;
                class185 var24 = class77.method536(class244.field4053[var21], arg0 ^ 0x604B);
                if (var24.field2843 != null) {
                    var24 = var24.method1216(0);
                    if (var24 == null || var24.field2903 == -1) {
                        continue;
                    }
                }
                class189.method1243(var22, arg3, (byte) -113, var23, arg1, class232.field3862[var24.field2903], arg4);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class218 var27 = class91.field1358[class276.field4701][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class151.field2183.field178 / 32);
                        int var29 = var26 * 4 + 2 - (class151.field2183.field211 / 32);
                        class189.method1243(var29, arg3, (byte) -113, var28, arg1, class213.field3382[0], arg4);
                    }
                }
            }
            for (int var30 = 0; var30 < class129.field1940; var30++) {
                class177 var31 = class119.field1804[field1153[var30]];
                if (var31 != null && var31.method117((byte) -128)) {
                    class288 var32 = var31.field2699;
                    if (var32 != null && var32.field4891 != null) {
                        var32 = var32.method1938((byte) 34);
                    }
                    if (var32 != null && var32.field4890 && var32.field4879) {
                        int var33 = var31.field178 / 32 - (class151.field2183.field178 / 32);
                        int var34 = var31.field211 / 32 - class151.field2183.field211 / 32;
                        class189.method1243(var34, arg3, (byte) -113, var33, arg1, class213.field3382[1], arg4);
                    }
                }
            }
            for (int var35 = 0; var35 < class175.field2675; var35++) {
                class91 var36 = class267.field4593[class118.field1785[var35]];
                if (var36 != null && var36.method117((byte) -123)) {
                    int var37 = var36.field178 / 32 - (class151.field2183.field178 / 32);
                    int var38 = var36.field211 / 32 - (class151.field2183.field211 / 32);
                    boolean var39 = false;
                    long var40 = var36.field1367.method69(arg0 - 24681);
                    for (int var42 = 0; var42 < class275.field4698; var42++) {
                        if (class168.field2565[var42] == var40 && class49.field771[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    if (class151.field2183.field1377 != 0 && var36.field1377 != 0 && class151.field2183.field1377 == var36.field1377) {
                        var43 = true;
                    }
                    if (var39) {
                        class189.method1243(var38, arg3, (byte) -113, var37, arg1, class213.field3382[3], arg4);
                    } else if (var43) {
                        class189.method1243(var38, arg3, (byte) -113, var37, arg1, class213.field3382[4], arg4);
                    } else {
                        class189.method1243(var38, arg3, (byte) -113, var37, arg1, class213.field3382[2], arg4);
                    }
                }
            }
            class81[] var44 = class226.field3714;
            for (int var45 = 0; var45 < var44.length; var45++) {
                class81 var46 = var44[var45];
                if (var46 != null && var46.field1259 != 0 && (class50.field784 % 20) < 10) {
                    if (var46.field1259 == 1 && var46.field1250 >= 0 && var46.field1250 < class119.field1804.length) {
                        class177 var47 = class119.field1804[var46.field1250];
                        if (var47 != null) {
                            int var48 = var47.field178 / 32 - (class151.field2183.field178 / 32);
                            int var49 = var47.field211 / 32 - (class151.field2183.field211 / 32);
                            class67.method475(arg4, arg3, var48, var46.field1249, arg1, 127, var49);
                        }
                    }
                    if (var46.field1259 == 2) {
                        int var50 = (var46.field1258 - class193.field3017) * 4 + 2 - (class151.field2183.field178 / 32);
                        int var51 = (var46.field1254 - class74.field1158) * 4 + 2 - (class151.field2183.field211 / 32);
                        class67.method475(arg4, arg3, var50, var46.field1249, arg1, 127, var51);
                    }
                    if (var46.field1259 == 10 && var46.field1250 >= 0 && class267.field4593.length > var46.field1250) {
                        class91 var52 = class267.field4593[var46.field1250];
                        if (var52 != null) {
                            int var53 = var52.field211 / 32 - (class151.field2183.field211 / 32);
                            int var54 = var52.field178 / 32 - (class151.field2183.field178 / 32);
                            class67.method475(arg4, arg3, var54, var46.field1249, arg1, arg0 ^ 0x6047, var53);
                        }
                    }
                }
            }
            if (class213.field3383 != 0) {
                int var55 = class213.field3383 * 4 + 2 - class151.field2183.field178 / 32;
                int var56 = class10.field153 * 4 + 2 - (class151.field2183.field211 / 32);
                class189.method1243(var56, arg3, (byte) -113, var55, arg1, class209.field3327, arg4);
            }
            class124.method826(arg4.field4228 / 2 + arg3 - 1, arg4.field4190 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        class296.field4975[arg2] = true;
        class52.field822[arg2] = true;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(I)V", line = 621)
    public class73(int arg0) {
        int var2 = 1;
        this.field1156 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field1143 = arg0;
        this.field1157 = new class209(var2);
    }
}
