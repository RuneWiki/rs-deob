import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class348 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lbt;")
    public static class39 field4768 = null;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4763 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Lwf;")
    public static class117 field4770 = new class117(32);

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
    public static boolean field4774 = false;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "[I")
    public static int[] field4773 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[Lcu;")
    public static class187[] field4775 = new class187[0];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4771;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZIII)V")
    public static final void method2109(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4764++;
        if (arg0 != -1) {
            field4763 = null;
        }
        long var6 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg3);
        class38 var8 = (class38) class487.field6920.method2799(var6, true);
        if (var8 == null) {
            var8 = new class38();
            class487.field6920.method2797(-4234, var8, var6);
        }
        if (var8.field466.length <= arg4) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field466.length; var11++) {
                var9[var11] = var8.field466[var11];
                var10[var11] = var8.field465[var11];
            }
            for (int var12 = var8.field466.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field465 = var10;
            var8.field466 = var9;
        }
        var8.field466[arg4] = arg5;
        var8.field465[arg4] = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(CB)V")
    public final void method2110(char arg0, byte arg1) {
        field4761++;
        OpenGL.glCallList(this.field4767 + arg0);
        if (arg1 >= -121) {
            field4772 = 114;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method2111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field4765++;
        if (arg7 <= 37) {
            field4768 = null;
        }
        if (arg2 == arg3 && arg0 == arg9 && arg1 == arg6 && arg4 == arg5) {
            class490.method2936(arg2, arg9, arg1, arg5, (byte) 124, arg8);
            return;
        }
        int var10 = arg2;
        int var11 = arg9;
        int var12 = arg2 * 3;
        int var13 = arg9 * 3;
        int var14 = arg3 * 3;
        int var15 = arg0 * 3;
        int var16 = arg6 * 3;
        int var17 = arg4 * 3;
        int var18 = arg1 + var14 - var16 - arg2;
        int var19 = arg5 + var15 - var17 - arg9;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg2 + (var27 + var29 + var31 >> 12);
            int var34 = (var30 + var32 + var28 >> 12) + arg9;
            class490.method2936(var10, var11, var33, var34, (byte) 84, arg8);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
    public static void method2112(boolean arg0) {
        if (arg0) {
            field4768 = null;
        }
        field4763 = null;
        field4775 = null;
        field4768 = null;
        field4773 = null;
        field4770 = null;
        field4771 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    public final void method2113(int arg0, int arg1) {
        field4769++;
        OpenGL.glNewList(this.field4767 + arg0, 4864);
        if (arg1 != 25033) {
            method2109(-61, 113, true, 14, -35, -124);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final void method2114(int arg0) {
        if (arg0 == 0) {
            OpenGL.glEndList();
            field4766++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lwca;BII)V")
    public static final void method2115(class583 arg0, byte arg1, int arg2, int arg3) {
        field4762++;
        if (arg0 == null || class174.field2677.field179 == arg0) {
            return;
        }
        int var4 = arg0.field8561;
        int var5 = arg0.field8557;
        int var6 = arg0.field8566;
        int var7 = (int) arg0.field8564;
        long var8 = arg0.field8564;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 48) {
            class373 var10 = class293.field4036[var7];
            if (var10 != null) {
                class93.field1392++;
                class588.field8730 = 0;
                class94.field1400 = arg3;
                class630.field9255 = arg2;
                class50.field589 = 2;
                class402.method2367(class609.field9040, (byte) 83);
                class112.field1589.method1036((byte) 109, class24.field237.method1788(16, 82) ? 1 : 0);
                class112.field1589.method1012(976668456, var7);
                class11.method50(var10.field1957[0], var10.method940(-1), true, (byte) 127, var10.field1955[0], var10.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 15) {
            class392.field5392++;
            class94.field1400 = arg3;
            class50.field589 = 2;
            class630.field9255 = arg2;
            class588.field8730 = 0;
            class402.method2367(class474.field6695, (byte) 123);
            class112.field1589.method1027(255, class193.field2865);
            class112.field1589.method1036((byte) 112, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1012(976668456, class626.field9224);
            class112.field1589.method1053(class205.field3027, (byte) 86);
            class112.field1589.method1008(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class112.field1589.method1008(false, class473.field6687 + var4);
            class112.field1589.method1017(class38.field463 + var5, 428082024);
            class404.method2378(var4, var8, 508065, var5);
        }
        if (var6 == 4) {
            class630.field9255 = arg2;
            class309.field4269++;
            class50.field589 = 1;
            class94.field1400 = arg3;
            class588.field8730 = 0;
            class402.method2367(class33.field398, (byte) 67);
            class112.field1589.method1027(255, class473.field6687 + var4);
            class112.field1589.method1027(255, class38.field463 + var5);
            class112.field1589.method1027(255, class626.field9224);
            class112.field1589.method1058(602643080, class205.field3027);
            class112.field1589.method1027(255, class193.field2865);
            class11.method50(var4, 1, true, (byte) 113, var5, 1, -4, 0, 0);
        }
        if (var6 == 1006) {
            class588.field8730 = 0;
            class630.field9255 = arg2;
            class50.field589 = 2;
            class94.field1400 = arg3;
            class505 var11 = (class505) class510.field7260.method2799((long) var7, true);
            if (var11 != null) {
                class571 var12 = var11.field7148;
                class87 var13 = var12.field8405;
                if (var13.field1314 != null) {
                    var13 = var13.method655((byte) 108, class556.field8280);
                }
                if (var13 != null) {
                    class402.method2367(class631.field9265, (byte) 101);
                    class302.field4143++;
                    class112.field1589.method1027(255, var13.field1264);
                }
            }
        }
        if (var6 == 22) {
            class587.field8641++;
            class50.field589 = 2;
            class94.field1400 = arg3;
            class630.field9255 = arg2;
            class588.field8730 = 0;
            class402.method2367(class215.field3167, (byte) 66);
            class112.field1589.method1049(-1, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1012(976668456, class38.field463 + var5);
            class112.field1589.method1027(255, class473.field6687 + var4);
            class112.field1589.method1017(Integer.MAX_VALUE & (int) (var8 >>> 32), 428082024);
            class404.method2378(var4, var8, 508065, var5);
        }
        if (var6 == 50) {
            class373 var14 = class293.field4036[var7];
            if (var14 != null) {
                class588.field8730 = 0;
                class630.field9255 = arg2;
                class50.field589 = 2;
                class94.field1400 = arg3;
                class287.field4006++;
                class402.method2367(class512.field7290, (byte) 122);
                class112.field1589.method1054(class24.field237.method1788(16, 82) ? 1 : 0, true);
                class112.field1589.method1017(var7, 428082024);
                class11.method50(var14.field1957[0], var14.method940(-1), true, (byte) 118, var14.field1955[0], var14.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 45) {
            class505 var15 = (class505) class510.field7260.method2799((long) var7, true);
            if (var15 != null) {
                class94.field1400 = arg3;
                class50.field589 = 2;
                class571 var16 = var15.field7148;
                class364.field4998++;
                class630.field9255 = arg2;
                class588.field8730 = 0;
                class402.method2367(class36.field432, (byte) 79);
                class112.field1589.method1012(976668456, var7);
                class112.field1589.method1036((byte) 118, class24.field237.method1788(16, 82) ? 1 : 0);
                class11.method50(var16.field1957[0], var16.method940(-1), true, (byte) 116, var16.field1955[0], var16.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 59) {
            class588.field8730 = 0;
            class50.field589 = 2;
            class194.field2866++;
            class94.field1400 = arg3;
            class630.field9255 = arg2;
            class402.method2367(class135.field1840, (byte) 103);
            class112.field1589.method1017(class38.field463 + var5, 428082024);
            class112.field1589.method1017(var4 + class473.field6687, 428082024);
            class112.field1589.method1017(var7, 428082024);
            class112.field1589.method1036((byte) -126, class24.field237.method1788(16, 82) ? 1 : 0);
            class631.method3676(var5, var4, -124);
        }
        if (var6 == 2) {
            class162 var17 = class372.method2217(var5, 100, var4);
            if (var17 != null) {
                class429.method2511(true);
                class625 var18 = client.method1599(var17);
                class627.method3665(var18.field9205, var18.method3658(-98), var17, (byte) 36);
                class217.field3182 = class379.method2263(32694, var17);
                if (class217.field3182 == null) {
                    class217.field3182 = "Null";
                }
                class537.field8008 = var17.field2535 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 18) {
            if (class163.field2578 > 0 && class24.field237.method1788(16, 82) && class24.field237.method1788(16, 81)) {
                class351.method2123(-8, class541.field8119.field8501, class38.field463 + var5, class473.field6687 + var4);
            } else {
                class228.method1463(var4, var5, var7, -20328);
                if (var7 == 1) {
                    class112.field1589.method1049(-1, -1);
                    class112.field1589.method1049(-1, -1);
                    class112.field1589.method1027(255, (int) class539.field8023);
                    class112.field1589.method1049(-1, 57);
                    class112.field1589.method1049(-1, class300.field4113);
                    class112.field1589.method1049(-1, class449.field6301);
                    class112.field1589.method1049(-1, 89);
                    class112.field1589.method1027(255, class541.field8119.field8496);
                    class112.field1589.method1027(255, class541.field8119.field8500);
                    class112.field1589.method1049(-1, 63);
                } else {
                    class50.field589 = 1;
                    class94.field1400 = arg3;
                    class630.field9255 = arg2;
                    class588.field8730 = 0;
                }
                class11.method50(var4, 1, true, (byte) 122, var5, 1, -4, 0, 0);
            }
        }
        if (var6 == 60) {
            class581.field8543++;
            class50.field589 = 2;
            class588.field8730 = 0;
            class94.field1400 = arg3;
            class630.field9255 = arg2;
            class402.method2367(class221.field3217, (byte) 72);
            class112.field1589.method1008(false, class473.field6687 + var4);
            class112.field1589.method1017(class38.field463 + var5, 428082024);
            class112.field1589.method1036((byte) -77, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1008(false, var7);
            class631.method3676(var5, var4, -116);
        }
        if (var6 == 1009) {
            class50.field589 = 2;
            class588.field8730 = 0;
            class630.field9255 = arg2;
            class5.field42++;
            class94.field1400 = arg3;
            class402.method2367(class415.field5636, (byte) 80);
            class112.field1589.method1027(255, var7);
        }
        if (var6 == 25) {
            if (class163.field2578 > 0 && class24.field237.method1788(16, 82) && class24.field237.method1788(16, 81)) {
                class351.method2123(-44, class541.field8119.field8501, class38.field463 + var5, class473.field6687 + var4);
            } else {
                class94.field1400 = arg3;
                class50.field589 = 1;
                class630.field9255 = arg2;
                class588.field8730 = 0;
                class182.field2739++;
                class402.method2367(class416.field5644, (byte) 74);
                class112.field1589.method1017(class473.field6687 + var4, 428082024);
                class112.field1589.method1012(976668456, class38.field463 + var5);
            }
        }
        if (var6 == 1011) {
            class94.field1400 = arg3;
            class588.field8730 = 0;
            class50.field589 = 2;
            class630.field9255 = arg2;
            class442.field5897++;
            class402.method2367(class600.field8872, (byte) 120);
            class112.field1589.method1017(class38.field463 + var5, 428082024);
            class112.field1589.method1010(85, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1027(255, var4 + class473.field6687);
            class112.field1589.method1027(255, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class404.method2378(var4, var8, 508065, var5);
        }
        if (var6 == 46) {
            class505 var19 = (class505) class510.field7260.method2799((long) var7, true);
            if (var19 != null) {
                class588.field8730 = 0;
                class185.field2772++;
                class94.field1400 = arg3;
                class571 var20 = var19.field7148;
                class50.field589 = 2;
                class630.field9255 = arg2;
                class402.method2367(class450.field6321, (byte) 120);
                class112.field1589.method1017(var7, 428082024);
                class112.field1589.method1010(113, class24.field237.method1788(16, 82) ? 1 : 0);
                class11.method50(var20.field1957[0], var20.method940(-1), true, (byte) 121, var20.field1955[0], var20.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 9) {
            class94.field1400 = arg3;
            class619.field9139++;
            class630.field9255 = arg2;
            class588.field8730 = 0;
            class50.field589 = 2;
            class402.method2367(class484.field6904, (byte) 121);
            class112.field1589.method1008(false, var4 + class473.field6687);
            class112.field1589.method1010(60, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1027(255, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class112.field1589.method1008(false, class38.field463 + var5);
            class404.method2378(var4, var8, 508065, var5);
        }
        if (var6 == 44) {
            class373 var21 = class293.field4036[var7];
            if (var21 != null) {
                class164.field2587++;
                class588.field8730 = 0;
                class94.field1400 = arg3;
                class630.field9255 = arg2;
                class50.field589 = 2;
                class402.method2367(class493.field7003, (byte) 71);
                class112.field1589.method1008(false, var7);
                class112.field1589.method1010(126, class24.field237.method1788(16, 82) ? 1 : 0);
                class11.method50(var21.field1957[0], var21.method940(-1), true, (byte) 114, var21.field1955[0], var21.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 47) {
            class505 var22 = (class505) class510.field7260.method2799((long) var7, true);
            if (var22 != null) {
                class50.field589 = 2;
                class94.field1400 = arg3;
                class588.field8730 = 0;
                class630.field9255 = arg2;
                class571 var23 = var22.field7148;
                class638.field9312++;
                class402.method2367(class122.field1717, (byte) 78);
                class112.field1589.method1027(255, var7);
                class112.field1589.method1010(73, class24.field237.method1788(16, 82) ? 1 : 0);
                class11.method50(var23.field1957[0], var23.method940(-1), true, (byte) 111, var23.field1955[0], var23.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 1012) {
            class630.field9255 = arg2;
            class94.field1400 = arg3;
            class588.field8730 = 0;
            class50.field589 = 2;
            class52.field606++;
            class402.method2367(class85.field1213, (byte) 124);
            class112.field1589.method1027(255, var7);
        }
        if (var6 == 20) {
            class588.field8730 = 0;
            class630.field9255 = arg2;
            class574.field8455++;
            class50.field589 = 2;
            class94.field1400 = arg3;
            class402.method2367(class404.field5521, (byte) 81);
            class112.field1589.method1053(class205.field3027, (byte) -95);
            class112.field1589.method1012(976668456, class38.field463 + var5);
            class112.field1589.method1027(255, var7);
            class112.field1589.method1008(false, class473.field6687 + var4);
            class112.field1589.method1027(255, class626.field9224);
            class112.field1589.method1027(255, class193.field2865);
            class112.field1589.method1054(class24.field237.method1788(16, 82) ? 1 : 0, true);
            class631.method3676(var5, var4, -120);
        }
        if (var6 == 57) {
            class373 var24 = class293.field4036[var7];
            if (var24 != null) {
                class50.field589 = 2;
                class630.field9255 = arg2;
                class94.field1400 = arg3;
                class588.field8730 = 0;
                class115.field1617++;
                class402.method2367(class541.field8115, (byte) 102);
                class112.field1589.method1036((byte) 121, class24.field237.method1788(16, 82) ? 1 : 0);
                class112.field1589.method1017(var7, 428082024);
                class11.method50(var24.field1957[0], var24.method940(-1), true, (byte) 118, var24.field1955[0], var24.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 51) {
            class373 var25 = class293.field4036[var7];
            if (var25 != null) {
                class630.field9255 = arg2;
                class148.field2193++;
                class94.field1400 = arg3;
                class588.field8730 = 0;
                class50.field589 = 2;
                class402.method2367(class56.field667, (byte) 76);
                class112.field1589.method1012(976668456, var7);
                class112.field1589.method1010(99, class24.field237.method1788(16, 82) ? 1 : 0);
                class11.method50(var25.field1957[0], var25.method940(-1), true, (byte) 119, var25.field1955[0], var25.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 19) {
            class373 var26 = class293.field4036[var7];
            if (var26 != null) {
                class317.field4357++;
                class630.field9255 = arg2;
                class94.field1400 = arg3;
                class588.field8730 = 0;
                class50.field589 = 2;
                class402.method2367(class111.field1572, (byte) 83);
                class112.field1589.method1027(255, class193.field2865);
                class112.field1589.method1058(602643080, class205.field3027);
                class112.field1589.method1012(976668456, var7);
                class112.field1589.method1054(class24.field237.method1788(16, 82) ? 1 : 0, true);
                class112.field1589.method1017(class626.field9224, 428082024);
                class11.method50(var26.field1957[0], var26.method940(-1), true, (byte) 127, var26.field1955[0], var26.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 23) {
            class373 var27 = class293.field4036[var7];
            if (var27 != null) {
                class630.field9255 = arg2;
                class330.field4549++;
                class50.field589 = 2;
                class588.field8730 = 0;
                class94.field1400 = arg3;
                class402.method2367(class316.field4350, (byte) 93);
                class112.field1589.method1036((byte) -107, class24.field237.method1788(16, 82) ? 1 : 0);
                class112.field1589.method1027(255, var7);
                class11.method50(var27.field1957[0], var27.method940(-1), true, (byte) 125, var27.field1955[0], var27.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 5) {
            class162 var28 = class372.method2217(var5, 100, var4);
            if (var28 != null) {
                class27.method187(67, var28);
            }
        }
        if (var6 == 16 || var6 == 1002) {
            class472.method2844(var5, arg0.field8567, var4, var7, false);
        }
        if (var6 == 10 && class230.field3374 == null) {
            class222.method1440(-126, var4, var5);
            class230.field3374 = class372.method2217(var5, 100, var4);
            class403.method2371(class230.field3374, (byte) -62);
        }
        if (var6 == 17) {
            class373 var29 = class293.field4036[var7];
            if (var29 != null) {
                class588.field8730 = 0;
                class94.field1400 = arg3;
                class178.field2713++;
                class630.field9255 = arg2;
                class50.field589 = 2;
                class402.method2367(class148.field2187, (byte) 110);
                class112.field1589.method1036((byte) -51, class24.field237.method1788(16, 82) ? 1 : 0);
                class112.field1589.method1027(255, var7);
                class11.method50(var29.field1957[0], var29.method940(-1), true, (byte) 117, var29.field1955[0], var29.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 3) {
            class505 var30 = (class505) class510.field7260.method2799((long) var7, true);
            if (var30 != null) {
                class115.field1615++;
                class630.field9255 = arg2;
                class588.field8730 = 0;
                class50.field589 = 2;
                class571 var31 = var30.field7148;
                class94.field1400 = arg3;
                class402.method2367(class609.field9042, (byte) 125);
                class112.field1589.method1008(false, var7);
                class112.field1589.method1054(class24.field237.method1788(16, 82) ? 1 : 0, true);
                class11.method50(var31.field1957[0], var31.method940(-1), true, (byte) 113, var31.field1955[0], var31.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 49) {
            class50.field589 = 2;
            class630.field9255 = arg2;
            class588.field8730 = 0;
            class94.field1400 = arg3;
            class142.field2001++;
            class402.method2367(class65.field806, (byte) 93);
            class112.field1589.method1012(976668456, class38.field463 + var5);
            class112.field1589.method1036((byte) -100, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1008(false, class473.field6687 + var4);
            class112.field1589.method1017((int) (var8 >>> 32) & Integer.MAX_VALUE, 428082024);
            class404.method2378(var4, var8, 508065, var5);
        }
        if (var6 == 30) {
            class505 var32 = (class505) class510.field7260.method2799((long) var7, true);
            if (var32 != null) {
                class94.field1400 = arg3;
                class50.field589 = 2;
                class588.field8730 = 0;
                class571 var33 = var32.field7148;
                class77.field1028++;
                class630.field9255 = arg2;
                class402.method2367(class388.field5326, (byte) 69);
                class112.field1589.method1049(-1, class24.field237.method1788(16, 82) ? 1 : 0);
                class112.field1589.method1017(class193.field2865, 428082024);
                class112.field1589.method1017(var7, 428082024);
                class112.field1589.method1053(class205.field3027, (byte) 123);
                class112.field1589.method1008(false, class626.field9224);
                class11.method50(var33.field1957[0], var33.method940(-1), true, (byte) 112, var33.field1955[0], var33.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 13) {
            class588.field8730 = 0;
            class50.field589 = 2;
            class630.field9255 = arg2;
            class94.field1400 = arg3;
            class365.field5025++;
            class402.method2367(class397.field5465, (byte) 127);
            class112.field1589.method1012(976668456, class473.field6687 + var4);
            class112.field1589.method1036((byte) 123, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1017(var7, 428082024);
            class112.field1589.method1027(255, class38.field463 + var5);
            class631.method3676(var5, var4, -118);
        }
        if (var6 == 12) {
            class50.field589 = 2;
            class94.field1400 = arg3;
            class630.field9255 = arg2;
            class588.field8730 = 0;
            class76.field1019++;
            class402.method2367(class168.field2627, (byte) 122);
            class112.field1589.method1008(false, var5 + class38.field463);
            class112.field1589.method1036((byte) 121, class24.field237.method1788(16, 82) ? 1 : 0);
            class112.field1589.method1027(255, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class112.field1589.method1012(976668456, class473.field6687 + var4);
            class404.method2378(var4, var8, 508065, var5);
        }
        if (var6 == 21) {
            class94.field1400 = arg3;
            class592.field8754++;
            class630.field9255 = arg2;
            class588.field8730 = 0;
            class50.field589 = 2;
            class402.method2367(class115.field1614, (byte) 110);
            class112.field1589.method1012(976668456, var5 + class38.field463);
            class112.field1589.method1012(976668456, class473.field6687 + var4);
            class112.field1589.method1008(false, var7);
            class112.field1589.method1010(90, class24.field237.method1788(16, 82) ? 1 : 0);
            class631.method3676(var5, var4, -120);
        }
        if (var6 == 6) {
            class588.field8730 = 0;
            class94.field1400 = arg3;
            class50.field589 = 2;
            class630.field9255 = arg2;
            class342.field4731++;
            class402.method2367(class588.field8717, (byte) 121);
            class112.field1589.method1008(false, class38.field463 + var5);
            class112.field1589.method1054(class24.field237.method1788(16, 82) ? 1 : 0, true);
            class112.field1589.method1012(976668456, var7);
            class112.field1589.method1008(false, class473.field6687 + var4);
            class631.method3676(var5, var4, -123);
        }
        if (var6 == 11) {
            class505 var34 = (class505) class510.field7260.method2799((long) var7, true);
            if (var34 != null) {
                class94.field1400 = arg3;
                class588.field8730 = 0;
                class571 var35 = var34.field7148;
                class484.field6901++;
                class50.field589 = 2;
                class630.field9255 = arg2;
                class402.method2367(class559.field8307, (byte) 89);
                class112.field1589.method1012(976668456, var7);
                class112.field1589.method1049(-1, class24.field237.method1788(16, 82) ? 1 : 0);
                class11.method50(var35.field1957[0], var35.method940(-1), true, (byte) 111, var35.field1955[0], var35.method940(-1), -2, 0, 0);
            }
        }
        if (arg1 > -87) {
            field4775 = null;
        }
        if (var6 == 1007 || var6 == 1008 || var6 == 1010 || var6 == 1003 || var6 == 1004) {
            class341.method2091(var6, var4, var7, (byte) 52);
        }
        if (var6 == 8) {
            class373 var36 = class293.field4036[var7];
            if (var36 != null) {
                class577.field8503++;
                class630.field9255 = arg2;
                class588.field8730 = 0;
                class94.field1400 = arg3;
                class50.field589 = 2;
                class402.method2367(class330.field4553, (byte) 124);
                class112.field1589.method1049(-1, class24.field237.method1788(16, 82) ? 1 : 0);
                class112.field1589.method1012(976668456, var7);
                class11.method50(var36.field1957[0], var36.method940(-1), true, (byte) 123, var36.field1955[0], var36.method940(-1), -2, 0, 0);
            }
        }
        if (var6 == 58) {
            class588.field8730 = 0;
            class94.field1400 = arg3;
            class630.field9255 = arg2;
            class317.field4357++;
            class50.field589 = 2;
            class402.method2367(class111.field1572, (byte) 106);
            class112.field1589.method1027(255, class193.field2865);
            class112.field1589.method1058(602643080, class205.field3027);
            class112.field1589.method1012(976668456, class541.field8119.field1904);
            class112.field1589.method1054(class24.field237.method1788(16, 82) ? 1 : 0, true);
            class112.field1589.method1017(class626.field9224, 428082024);
        }
        if (class606.field9002) {
            class429.method2511(true);
        }
        if (class366.field5044 != null && class452.field6387 == 0) {
            class403.method2371(class366.field5044, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lte;I)V")
    public class348(class527 arg0, int arg1) {
        this.field4767 = OpenGL.glGenLists(arg1);
    }
}
