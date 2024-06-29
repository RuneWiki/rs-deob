import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class87 extends class147 {

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Ljf;")
    public class103 field1074;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lsr;")
    public class146 field1069;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Ljr;")
    public class250 field1077;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Ljk;")
    public class436 field1073;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Z")
    public static boolean field1087;

    static {
        new class40((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V", line = 7)
    public final void method441(boolean arg0) {
        this.field1074 = null;
        field1088++;
        this.field1069 = null;
        if (arg0) {
            this.field1089 = 5;
        }
        this.field1073 = null;
        this.field1077 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lab;Loj;IIZ)V", line = 42)
    public static final void method442(class256 arg0, class280 arg1, int arg2, int arg3, boolean arg4) {
        field1081++;
        class313 var5 = arg0.method1576(arg1, 18785);
        if (var5 == null) {
            return;
        }
        if (!arg4) {
            method442((class256) null, (class280) null, -34, -17, false);
        }
        arg1.method1351(arg3, arg2, arg0.field3597 + arg3, arg0.field3707 + arg2);
        if (class73.field890 == 2 || class73.field890 == 5 || class61.field758 == null) {
            arg1.method1369(-16777216, var5, arg3, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class358.field5167 == 4) {
            var6 = 4096;
            var7 = class255.field3554;
            var8 = (int) (-class349.field5021) & 0x3FFF;
            var9 = class369.field5280;
        } else {
            var6 = 4096 - (class415.field6000 * 16);
            var9 = class19.field258.field1005;
            var7 = class19.field258.field1008;
            var8 = (int) (-class349.field5021) + class367.field5251 & 0x3FFF;
        }
        int var10 = var7 / 32 + 48 + 208 - class159.field1895 * 2;
        int var11 = class289.field4316 * 4 + 48 - (var9 / 32) - (class289.field4316 * 2 + -208);
        class61.field758.method2365((float) arg0.field3597 / 2.0F + (float) arg3, (float) arg0.field3707 / 2.0F + (float) arg2, (float) var10, (float) var11, var6, var8 << 2, var5, arg3, arg2);
        for (class363 var12 = (class363) class173.field2089.method802((byte) 114); var12 != null; var12 = (class363) class173.field2089.method806((byte) 104)) {
            int var52 = var12.field5221;
            int var53 = (class340.field4883.field4633[var52] >> 14 & 0x3FFF) - class93.field1163;
            int var54 = (class340.field4883.field4633[var52] & 0x3FFF) - class349.field5023;
            int var55 = var53 * 4 + 2 - var7 / 32;
            int var56 = var54 * 4 + 2 - var9 / 32;
            class298.method1880(var56, var5, arg2, class340.field4883.field4627[var52], arg0, var55, (byte) -115, arg3, arg1);
        }
        for (int var13 = 0; var13 < class12.field183; var13++) {
            int var49 = class205.field2809[var13] * 4 + 2 - var7 / 32;
            int var50 = class412.field5863[var13] * 4 + 2 - (var9 / 32);
            class415 var51 = class173.field2084.method2297(50, class397.field5639[var13]);
            if (var51.field5951 != null) {
                var51 = var51.method2473(-18648, class75.field909);
                if (var51 == null || var51.field5946 == -1) {
                    continue;
                }
            }
            class298.method1880(var50, var5, arg2, var51.field5946, arg0, var49, (byte) 2, arg3, arg1);
        }
        for (class173 var14 = (class173) class76.field913.method241(0); var14 != null; var14 = (class173) class76.field913.method239(0)) {
            int var46 = (int) (var14.field1776 >> 28 & 0x3L);
            if (class263.field3786 == var46) {
                int var47 = (int) (var14.field1776 & 0x3FFFL) * 4 + 2 - (var7 / 32);
                int var48 = ((int) (var14.field1776 >> 14 & 0x3FFFL) * 4 - var9 / 32) + 2;
                class18.method120(var47, var5, var48, (byte) -63, arg3, class79.field950[0], arg2, arg0);
            }
        }
        for (int var15 = 0; var15 < class356.field5112; var15++) {
            class137 var42 = class448.field6366[class25.field353[var15]];
            if (var42 != null && var42.method655((byte) 127) && class19.field258.field994 == var42.field994) {
                class476 var43 = var42.field1643;
                if (var43 != null && var43.field6694 != null) {
                    var43 = var43.method2812(class75.field909, arg4);
                }
                if (var43 != null && var43.field6724 && var43.field6740) {
                    int var44 = var42.field1008 / 32 - (var7 / 32);
                    int var45 = var42.field1005 / 32 - (var9 / 32);
                    if (var43.field6733 == -1) {
                        class18.method120(var44, var5, var45, (byte) -63, arg3, class79.field950[1], arg2, arg0);
                    } else {
                        class298.method1880(var45, var5, arg2, var43.field6733, arg0, var44, (byte) 111, arg3, arg1);
                    }
                }
            }
        }
        int var16 = class438.field6286;
        int[] var17 = class79.field944;
        for (int var18 = 0; var18 < var16; var18++) {
            class198 var34 = class46.field596[var17[var18]];
            if (var34 != null && var34.method1079((byte) 127) && class19.field258 != var34 && class19.field258.field994 == var34.field994) {
                int var35 = var34.field1008 / 32 - (var7 / 32);
                int var36 = var34.field1005 / 32 - (var9 / 32);
                boolean var37 = false;
                for (int var38 = 0; var38 < class3.field25; var38++) {
                    if (var34.field2736.equals(class150.field1823[var38]) && class148.field1800[var38] != 0) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                for (int var40 = 0; var40 < class13.field187; var40++) {
                    if (var34.field2736.equals(class372.field5331[var40].field3500)) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                if (class19.field258.field2744 != 0 && var34.field2744 != 0 && class19.field258.field2744 == var34.field2744) {
                    var41 = true;
                }
                if (var37) {
                    class18.method120(var35, var5, var36, (byte) -63, arg3, class79.field950[3], arg2, arg0);
                } else if (var39) {
                    class18.method120(var35, var5, var36, (byte) -63, arg3, class79.field950[5], arg2, arg0);
                } else if (var41) {
                    class18.method120(var35, var5, var36, (byte) -63, arg3, class79.field950[4], arg2, arg0);
                } else {
                    class18.method120(var35, var5, var36, (byte) -63, arg3, class79.field950[2], arg2, arg0);
                }
            }
        }
        class231[] var19 = class251.field3525;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class231 var23 = var19[var20];
            if (var23 != null && var23.field3198 != 0 && class204.field2796 % 20 < 10) {
                if (var23.field3198 == 1 && var23.field3192 >= 0 && class448.field6366.length > var23.field3192) {
                    class137 var24 = class448.field6366[var23.field3192];
                    if (var24 != null) {
                        int var25 = var24.field1008 / 32 - (var7 / 32);
                        int var26 = var24.field1005 / 32 - (var9 / 32);
                        class212.method1179(true, var25, arg3, arg0, arg2, 360000, var26, var5, var23.field3193);
                    }
                }
                if (var23.field3198 == 2) {
                    int var27 = (var23.field3195 - class93.field1163) * 4 + 2 - var7 / 32;
                    int var28 = (var23.field3194 - class349.field5023) * 4 + 2 - (var9 / 32);
                    int var29 = var23.field3202 * 4;
                    int var30 = var29 * var29;
                    class212.method1179(arg4, var27, arg3, arg0, arg2, var30, var28, var5, var23.field3193);
                }
                if (var23.field3198 == 10 && var23.field3192 >= 0 && class46.field596.length > var23.field3192) {
                    class198 var31 = class46.field596[var23.field3192];
                    if (var31 != null) {
                        int var32 = var31.field1008 / 32 - (var7 / 32);
                        int var33 = var31.field1005 / 32 - (var9 / 32);
                        class212.method1179(true, var32, arg3, arg0, arg2, 360000, var33, var5, var23.field3193);
                    }
                }
            }
        }
        if (class358.field5167 == 4) {
            return;
        }
        if (class158.field1886 != 0) {
            int var21 = class158.field1886 * 4 + (2 - (var7 / 32 + (2 - (class19.field258.method1012(false) * 2))));
            int var22 = class4.field52 * 4 + class19.field258.method1012(false) * 2 + 2 - (var9 / 32) - 2;
            class18.method120(var21, var5, var22, (byte) -63, arg3, class487.field6902[class317.field4623 ? 1 : 0], arg2, arg0);
        }
        arg1.method1759(-6923, 3, 3, arg0.field3707 / 2 + arg2 - 1, -1, arg3 + (arg0.field3597 / 2) - 1);
        return;
    }
}
