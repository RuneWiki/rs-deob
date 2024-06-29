import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class745 {

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "Lea;")
    public static class547 field10355 = new class547(4, 6);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field10347;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public int field10348;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public int field10350;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public int field10352;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public int field10353;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field10354;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 8)
    public static void method4159(byte arg0) {
        int var1 = 94 % ((arg0 + 58) / 38);
        field10355 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIZII)V", line = 24)
    public static final void method4160(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field10349++;
        if (!arg2 && class505.field6855 == arg3 && class539.field7309 == arg1 && class61.field677 == class131.field1693 || class11.field68.field5548.method186((byte) 123) == 1) {
            return;
        }
        class505.field6855 = arg3;
        class131.field1693 = class61.field677;
        class539.field7309 = arg1;
        if (class11.field68.field5548.method186((byte) 123) == 1) {
            class131.field1693 = 0;
        }
        class237.method1429(arg4, false);
        class396.method2303(-77, class294.field3954, class399.field5650, true, class21.field142, class755.field10492.method4201(class723.field10095, (byte) 25));
        int var5 = class99.field1313;
        class99.field1313 = (class505.field6855 - (class272.field3589 >> 4)) * 8;
        int var6 = class133.field1704;
        class133.field1704 = (class539.field7309 - (class3.field26 >> 4)) * 8;
        class450.field6295 = class642.method3617(class505.field6855 * 8, class539.field7309 * 8);
        class330.field4451 = null;
        int var7 = class99.field1313 - var5;
        int var8 = class133.field1704 - var6;
        if (arg4 == 11) {
            for (int var9 = 0; var9 < class12.field79; var9++) {
                class706 var10 = class746.field10359[var9];
                if (var10 != null) {
                    class215 var11 = var10.field9890;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field898[var12] -= var7;
                        var11.field899[var12] -= var8;
                    }
                    var11.field2165 -= var8 * 512;
                    var11.field2170 -= var7 * 512;
                }
            }
        } else {
            class84.field1169 = 0;
            boolean var13 = false;
            int var14 = (class272.field3589 - 1) * 512;
            int var15 = (class3.field26 - 1) * 512;
            for (int var16 = 0; var16 < class12.field79; var16++) {
                class706 var30 = class746.field10359[var16];
                if (var30 != null) {
                    class215 var31 = var30.field9890;
                    var31.field2170 -= var7 * 512;
                    var31.field2165 -= var8 * 512;
                    if (var31.field2170 >= 0 && var31.field2170 <= var14 && var31.field2165 >= 0 && var15 >= var31.field2165) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field898[var33] -= var7;
                            var31.field899[var33] -= var8;
                            if (var31.field898[var33] < 0 || class272.field3589 <= var31.field898[var33] || var31.field899[var33] < 0 || class3.field26 <= var31.field899[var33]) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class665.field9261[class84.field1169++] = var31.field817;
                        } else {
                            var31.method1200(null, 1);
                            var30.method315(97);
                            var13 = true;
                        }
                    } else {
                        var31.method1200(null, 1);
                        var30.method315(113);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class12.field79 = class681.field9475.method2561((byte) -6);
                class681.field9475.method2554(class746.field10359, (byte) 74);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class83 var28 = class361.field4793[var17];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field898[var29] -= var7;
                    var28.field899[var29] -= var8;
                }
                var28.field2165 -= var8 * 512;
                var28.field2170 -= var7 * 512;
            }
        }
        if (arg0 != -6547) {
            return;
        }
        class641[] var18 = class475.field6572;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class641 var27 = var18[var19];
            if (var27 != null) {
                var27.field8910 -= var7 * 512;
                var27.field8922 -= var8 * 512;
            }
        }
        for (class189 var20 = (class189) class56.field574.method724(32); var20 != null; var20 = (class189) class56.field574.method723(88)) {
            var20.field2269 -= var7;
            var20.field2270 -= var8;
            if (class361.field4790 != 4 && (var20.field2269 < 0 || var20.field2270 < 0 || var20.field2269 >= class272.field3589 || class3.field26 <= var20.field2270)) {
                var20.method315(83);
            }
        }
        for (class189 var21 = (class189) class103.field1381.method724(32); var21 != null; var21 = (class189) class103.field1381.method723(116)) {
            var21.field2270 -= var8;
            var21.field2269 -= var7;
            if (class361.field4790 != 4 && (var21.field2269 < 0 || var21.field2270 < 0 || class272.field3589 <= var21.field2269 || class3.field26 <= var21.field2270)) {
                var21.method315(arg0 + 6603);
            }
        }
        if (class361.field4790 != 4) {
            for (class270 var22 = (class270) class472.field6537.method2560(101); var22 != null; var22 = (class270) class472.field6537.method2557(arg0 + 6546)) {
                int var23 = (int) (var22.field556 & 0x3FFFL);
                int var24 = var23 - class99.field1313;
                int var25 = (int) (var22.field556 >> 14 & 0x3FFFL);
                int var26 = var25 - class133.field1704;
                if (var24 < 0 || var26 < 0 || class272.field3589 <= var24 || class3.field26 <= var26) {
                    var22.method315(61);
                }
            }
        }
        if (class476.field6576 != 0) {
            class98.field1303 -= var8;
            class476.field6576 -= var7;
        }
        class264.method1584((byte) 126);
        if (arg4 != 11) {
            class422.field5907 -= var8;
            class353.field4712 -= var7;
            class328.field4443 -= var7;
            class273.field3591 -= var8;
            class684.field9518 -= var8 * 512;
            class294.field3956 -= var7 * 512;
            if (Math.abs(var7) > class272.field3589 || Math.abs(var8) > class3.field26) {
                class723.method4058((byte) 124);
            }
        } else if (class8.field57 == 4) {
            class420.field5892 -= var8 * 512;
            class232.field2981 -= var8 * 512;
            class558.field7855 -= var7 * 512;
            class86.field1179 -= var7 * 512;
        } else {
            class39.field404 = -1;
            class520.field6999 = -1;
            class8.field57 = 1;
        }
        class205.method1139((byte) -38);
        class456.method2548(arg0 + 6456);
        class576.field8091.method728((byte) 47);
        class268.field3555.method728((byte) 47);
        class608.field8493.method112(arg0 + 6435);
        class318.method1905(arg0 + 6547);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V", line = 303)
    public static final void method4161(String arg0, int arg1, String arg2, int arg3) {
        if (arg1 != -17877) {
            field10347 = -7;
        }
        class381.field5302 = arg3;
        field10346++;
        class8.field55 = 2;
        class163.method961(false, arg2, arg1 + 17782, arg0);
    }
}
