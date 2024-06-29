import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class306 extends class110 {

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
    public static boolean field4859 = false;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Llg;")
    public static class132 field4857;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZBILjava/lang/String;ZIIZJLjava/lang/String;)V", line = 5)
    public static final void method2169(int arg0, boolean arg1, byte arg2, int arg3, String arg4, boolean arg5, int arg6, int arg7, boolean arg8, long arg9, String arg10) {
        field4862++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        if (arg2 != -54) {
            field4857 = (class132) null;
        }
        class1 var14 = new class1(128);
        var14.method21(-125, 10);
        var14.method14(-246866616, (arg8 ? 2 : 0) | (arg1 ? 1 : 0) | (arg5 ? 4 : 0));
        var14.method59(arg9, false);
        var14.method11(var12[0], arg2 ^ 0xFFFF8376);
        var14.method12(arg10, (byte) -47);
        var14.method11(var12[1], 31932);
        var14.method14(-246866616, class151.field2464);
        var14.method21(-113, arg0);
        var14.method21(-107, arg7);
        var14.method11(var12[2], 31932);
        var14.method14(-246866616, arg3);
        var14.method14(-246866616, arg6);
        var14.method11(var12[3], arg2 ^ 0xFFFF8376);
        var14.method24(class308.field4877, 28, class232.field3540);
        class1 var15 = new class1(350);
        var15.method12(arg4, (byte) -47);
        int var16 = 8 - class274.method1951(-1, arg4) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method21(97, (int) (Math.random() * 255.0D));
        }
        var15.method46(var12, 255);
        class209.field3305.field48 = 0;
        class209.field3305.method21(arg2 ^ 0xFFFFFFB0, 22);
        class209.field3305.method14(-246866616, var14.field48 + var15.field48 + 2);
        class209.field3305.method14(-246866616, 544);
        class209.field3305.method61(var14.field48, var14.field34, 0, arg2 - 2131480380);
        class209.field3305.method61(var15.field48, var15.field34, 0, -2131480434);
        class257.field3824 = 0;
        class74.field1118 = 1;
        class42.field663 = -3;
        class8.field196 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIII)V", line = 66)
    public static final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4861++;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = arg2 - 334;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 > 100) {
            var9 = 100;
        }
        int var10 = -125 % ((arg7 + 26) / 60);
        int var11 = (class106.field1737 - class260.field3872) * var9 / 100 + class260.field3872;
        int var12 = arg5 * var11 >> 8;
        int var13 = 2048 - arg0 & 0x7FF;
        int var14 = 0;
        int var15 = 0;
        int var16 = var12;
        if (var8 != 0) {
            int var17 = class40.field612[var8];
            var15 = -var12 * var17 >> 16;
            int var18 = class40.field619[var8];
            var16 = var12 * var18 >> 16;
        }
        if (var13 != 0) {
            int var19 = class40.field612[var13];
            var14 = var16 * var19 >> 16;
            int var20 = class40.field619[var13];
            var16 = var16 * var20 >> 16;
        }
        class64.field943 = arg0;
        class152.field2498 = arg1 - var14;
        class137.field2239 = arg6 - var16;
        class332.field5180 = arg4 - var15;
        class43.field683 = arg3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 124)
    public static final void method2171(boolean arg0) {
        field4860++;
        class280.method1971((byte) 101, class86.field1377);
        class122.field1981++;
        if (class66.field1010 && class314.field4959) {
            if (!arg0) {
                method2169(124, true, (byte) -43, 11, (String) null, true, 97, 79, true, 53L, (String) null);
            }
            int var1 = class22.field389;
            int var2 = class303.field4832;
            int var3 = var1 - class120.field1937;
            int var4 = var2 - class178.field2838;
            if (var4 < class92.field1489) {
                var4 = class92.field1489;
            }
            if (class338.field5227 > var3) {
                var3 = class338.field5227;
            }
            if ((class86.field1377.field3939 + var3) > (class338.field5227 + class55.field841.field3939)) {
                var3 = class338.field5227 - (class86.field1377.field3939 - class55.field841.field3939);
            }
            if ((class86.field1377.field3941 + var4) > (class92.field1489 + class55.field841.field3941)) {
                var4 = class92.field1489 + class55.field841.field3941 - class86.field1377.field3941;
            }
            int var5 = var3 + class55.field841.field4045 - class338.field5227;
            int var6 = var4 + class55.field841.field3951 - class92.field1489;
            int var7 = var3 - class26.field437;
            int var8 = var4 - class115.field1873;
            int var9 = class86.field1377.field4060;
            if (class86.field1377.field3979 < class122.field1981 && (var8 > var9 || -var9 > var8 || var7 > var9 || var7 < (-var9))) {
                class136.field2219 = true;
            }
            if (class86.field1377.field3989 != null && class136.field2219) {
                class150 var10 = new class150();
                var10.field2457 = var5;
                var10.field2450 = class86.field1377.field3989;
                var10.field2449 = var6;
                var10.field2458 = class86.field1377;
                class172.method1280(var10, (byte) 12);
            }
            if (class129.field2062 == 0) {
                if (class136.field2219) {
                    if (class86.field1377.field4070 != null) {
                        class150 var11 = new class150();
                        var11.field2450 = class86.field1377.field4070;
                        var11.field2458 = class86.field1377;
                        var11.field2445 = class128.field2056;
                        var11.field2449 = var6;
                        var11.field2457 = var5;
                        class172.method1280(var11, (byte) 12);
                    }
                    if (class128.field2056 != null && client.method1865(class86.field1377) != null) {
                        class209.field3305.method1808((byte) -74, 90);
                        class332.field5179++;
                        class209.field3305.method47(class128.field2056.field3958, false);
                        class209.field3305.method26(-104, class86.field1377.field3958);
                        class209.field3305.method52(class128.field2056.field4088, (byte) 121);
                        class209.field3305.method52(class86.field1377.field4088, (byte) 114);
                    }
                } else if ((class118.field1907 == 1 || class221.method1607(0, class137.field2225 - 1)) && class137.field2225 > 2) {
                    class136.method1051(arg0);
                } else if (class137.field2225 > 0) {
                    class345.method2394((byte) 62);
                }
                class86.field1377 = null;
            }
        } else if (class122.field1981 > 1) {
            class86.field1377 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 255)
    public static void method2172(int arg0) {
        int var1 = 88 % ((39 - arg0) / 46);
        field4857 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)Lq;", line = 264)
    public static final class105 method2173(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = var3.field665;
            var3.field665 = null;
            return var4;
        }
    }
}
