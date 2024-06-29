import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class353 extends class163 {

    @OriginalMember(owner = "client!jo", name = "Lb", descriptor = "[Ljava/lang/String;")
    private static final String[] field5448 = new String[] { method2897(method2896("_@\"0\u0012\u001d")), method2897(method2896("_@\"6\u0012\u001d")), method2897(method2896("_@\"4\u0012\u001d")), method2897(method2896("_@\"1\u0012\u001d")), method2897(method2896("N\u0001\"],")), method2897(method2896("[Z`\u001f")), method2897(method2896("_@\"7\u0012\u001d")), method2897(method2896("_@\"5\u0012\u001d")) };

    @OriginalMember(owner = "client!jo", name = "Eb", descriptor = "Ldv;")
    public static class685 field5445 = new class685(11, 0, 1, 2);

    @OriginalMember(owner = "client!jo", name = "Hb", descriptor = "Ljava/lang/String;")
    public static String field5447 = null;

    @OriginalMember(owner = "client!jo", name = "Gb", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!jo", name = "Ib", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!jo", name = "Kb", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!jo", name = "Jb", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!jo", name = "Fb", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V")
    public class353(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(FB)V")
    public final void method2890(float arg0, byte arg1) {
        try {
            ++field5441;
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field2209[super.field2201++] = (byte) (var3 >> 24);
            super.field2209[super.field2201++] = (byte) (var3 >> 16);
            super.field2209[super.field2201++] = (byte) (var3 >> 8);
            int var4 = -23 / ((arg1 - -60) / 33);
            super.field2209[super.field2201++] = (byte) var3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5448[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZII)V")
    public static final void method2891(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            ++field5443;
            if (arg2 || class247.field3771 != arg4 || ~class687.field9973 != ~arg1 || ~class520.field7618 != ~class419.field6182 && ~class289.field4305.field825.method717(false) != -2) {
                class419.field6182 = class520.field7618;
                class247.field3771 = arg4;
                class687.field9973 = arg1;
                if (~class289.field4305.field825.method717(false) == -2) {
                    class419.field6182 = 0;
                }
                class86.method728(arg3, (byte) -96);
                class145.method1227(true, class309.field4859.method2616(false, class167.field2300), class309.field4911, class64.field664, class610.field8913, (byte) -124);
                int var5 = class494.field7101;
                class494.field7101 = (-(class648.field9378 >> 4) + class247.field3771) * 8;
                int var6 = class281.field4219;
                class281.field4219 = (class687.field9973 - (class659.field9506 >> 4)) * 8;
                class451.field6614 = class161.method1378(class247.field3771 * 8, class687.field9973 * 8);
                class224.field3436 = null;
                int var7 = class494.field7101 - var5;
                int var8 = class281.field4219 - var6;
                if (arg3 == 11) {
                    for (int var9 = 0; ~class750.field10912 < ~var9; ++var9) {
                        class383 var10 = class753.field10966[var9];
                        if (var10 != null) {
                            class612 var11 = var10.field5799;
                            for (int var12 = 0; ~var12 > -11; ++var12) {
                                var11.field3859[var12] -= var7;
                                var11.field3863[var12] -= var8;
                            }
                            var11.field6197 -= var7 * 512;
                            var11.field6211 -= var8 * 512;
                        }
                    }
                } else {
                    boolean var13 = false;
                    class6.field60 = 0;
                    int var14 = class648.field9378 * 512 + -512;
                    int var15 = class659.field9506 * 512 + -512;
                    for (int var16 = 0; ~var16 > ~class750.field10912; ++var16) {
                        class383 var17 = class753.field10966[var16];
                        if (var17 != null) {
                            class612 var18 = var17.field5799;
                            var18.field6197 -= var7 * 512;
                            var18.field6211 -= var8 * 512;
                            if (~var18.field6197 <= -1 && ~var18.field6197 >= ~var14 && var18.field6211 >= 0 && var15 >= var18.field6211) {
                                boolean var19 = true;
                                for (int var20 = 0; var20 < 10; ++var20) {
                                    var18.field3859[var20] -= var7;
                                    var18.field3863[var20] -= var8;
                                    if (~var18.field3859[var20] > -1 || var18.field3859[var20] >= class648.field9378 || ~var18.field3863[var20] > -1 || class659.field9506 <= var18.field3863[var20]) {
                                        var19 = false;
                                    }
                                }
                                if (var19) {
                                    class590.field8680[class6.field60++] = var18.field3780;
                                } else {
                                    var18.method4519(true, (class496) null);
                                    var17.method1824(1);
                                    var13 = true;
                                }
                            } else {
                                var18.method4519(true, (class496) null);
                                var17.method1824(1);
                                var13 = true;
                            }
                        }
                    }
                    if (var13) {
                        class750.field10912 = class207.field3184.method979(false);
                        class207.field3184.method974(0, class753.field10966);
                    }
                }
                for (int var21 = arg0; ~var21 > -2049; ++var21) {
                    class726 var22 = class197.field2685[var21];
                    if (var22 != null) {
                        for (int var23 = 0; ~var23 > -11; ++var23) {
                            var22.field3859[var23] -= var7;
                            var22.field3863[var23] -= var8;
                        }
                        var22.field6211 -= var8 * 512;
                        var22.field6197 -= var7 * 512;
                    }
                }
                class352[] var24 = class708.field10260;
                for (int var25 = 0; ~var24.length < ~var25; ++var25) {
                    class352 var26 = var24[var25];
                    if (var26 != null) {
                        var26.field5436 -= var7 * 512;
                        var26.field5430 -= var8 * 512;
                    }
                }
                for (class326 var27 = (class326) class115.field1368.method3863((byte) 64); var27 != null; var27 = (class326) class115.field1368.method3862(arg0 ^ -353)) {
                    var27.field5148 -= var8;
                    var27.field5136 -= var7;
                    if (~class104.field1209 != -5 && (var27.field5136 < 0 || ~var27.field5148 > -1 || class648.field9378 <= var27.field5136 || var27.field5148 >= class659.field9506)) {
                        var27.method1824(1);
                    }
                }
                for (class326 var28 = (class326) class403.field6017.method3863((byte) 64); var28 != null; var28 = (class326) class403.field6017.method3862(-353)) {
                    var28.field5148 -= var8;
                    var28.field5136 -= var7;
                    if (class104.field1209 != 4 && (var28.field5136 < 0 || ~var28.field5148 > -1 || class648.field9378 <= var28.field5136 || var28.field5148 >= class659.field9506)) {
                        var28.method1824(arg0 + 1);
                    }
                }
                if (class104.field1209 != 4) {
                    for (class672 var29 = (class672) class29.field357.method971(347); var29 != null; var29 = (class672) class29.field357.method973(true)) {
                        int var30 = (int) (var29.field3177 & 16383L);
                        int var31 = -class494.field7101 + var30;
                        int var32 = (int) (var29.field3177 >> 14 & 16383L);
                        int var33 = -class281.field4219 + var32;
                        if (~var31 > -1 || ~var33 > -1 || ~var31 <= ~class648.field9378 || var33 >= class659.field9506) {
                            var29.method1824(1);
                        }
                    }
                }
                if (~class492.field7065 != -1) {
                    class153.field1893 -= var8;
                    class492.field7065 -= var7;
                }
                class667.method4910(-26130);
                if (~arg3 == -12) {
                    if (class185.field2559 == 4) {
                        class114.field1356 -= var8 * 512;
                        class477.field6945 -= var7 * 512;
                        class194.field2605 -= var7 * 512;
                        class578.field8576 -= var8 * 512;
                    } else {
                        class238.field3617 = -1;
                        class730.field10605 = -1;
                        class185.field2559 = 1;
                    }
                } else {
                    class243.field3724 -= var7;
                    class315.field4975 -= var8;
                    class271.field4116 -= var7 * 512;
                    class361.field5517 -= var7;
                    class329.field5184 -= var8;
                    class683.field9899 -= var8 * 512;
                    if (Math.abs(var7) > class648.field9378 || Math.abs(var8) > class659.field9506) {
                        class745.method5429(arg0 + -6124);
                    }
                }
                class94.method798(126);
                class233.method1993((byte) -70);
                class112.field1301.method3879(77);
                class737.field10713.method3879(arg0 + 108);
                class712.field10331.method4539((byte) 93);
                class273.method2255(false);
            }
        } catch (RuntimeException var35) {
            throw class759.method5498(var35, field5448[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IF)V")
    public final void method2892(int arg0, float arg1) {
        try {
            ++field5444;
            int var3 = Stream.floatToRawIntBits(arg1);
            if (arg0 != -1335387932) {
                method2895(51, (class163) null);
            }
            super.field2209[super.field2201++] = (byte) var3;
            super.field2209[super.field2201++] = (byte) (var3 >> 8);
            super.field2209[super.field2201++] = (byte) (var3 >> 16);
            super.field2209[super.field2201++] = (byte) (var3 >> 24);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5448[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILib;)Lfha;")
    public static final class398 method2893(int arg0, class163 arg1) {
        try {
            ++field5446;
            int var2 = 88 / ((arg0 - 52) / 34);
            return new class398(arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1436((byte) 92), arg1.method1436((byte) 61), arg1.method1455((byte) 62));
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5448[6] + arg0 + ',' + (arg1 != null ? field5448[4] : field5448[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "(I)V")
    public static void method2894(int arg0) {
        try {
            field5447 = null;
            field5445 = null;
            int var1 = 126 / ((arg0 - 46) / 47);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5448[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(ILib;)Luq;")
    public static final class171 method2895(int arg0, class163 arg1) {
        try {
            ++field5442;
            int var2 = 105 / ((-7 - arg0) / 54);
            return new class171(arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1436((byte) 59), arg1.method1436((byte) 56), arg1.method1455((byte) 62));
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5448[7] + arg0 + ',' + (arg1 != null ? field5448[4] : field5448[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2896(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 81);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2897(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
