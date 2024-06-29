import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public int field1093 = 0;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public int field1098 = 0;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1090 = -1;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lpb;")
    public static class100 field1099 = new class100();

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lvc;")
    public static class137 field1100 = class45.method325(" zuerst von Ihrer Ignorieren)2Liste(Q", -46);

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field1106 = -1;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field1107 = 0;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lvc;")
    public static class137 field1108 = class45.method325("@yel@*V", -46);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lpe;")
    public class103 field1109;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lha;")
    public static class50 field1103;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Loa;")
    public static class93 field1104;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public static final void method350(int arg0, int arg1) {
        field1089++;
        class112.field2686 = arg0;
        int var2 = -9 % ((40 - arg1) / 60);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
    public static int method351(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLnb;Lnb;Ljava/awt/Component;)V")
    public static final void method352(byte arg0, class88 arg1, class88 arg2, Component arg3) {
        field1102++;
        if (class46.field1038) {
            return;
        }
        class8.field193 = class44.method311(128, -113, 265, arg3);
        class62.method451();
        class99.field2322 = class44.method311(128, -109, 265, arg3);
        class62.method451();
        class32.field695 = class44.method311(509, -120, 171, arg3);
        class62.method451();
        class73.field1547 = class44.method311(360, -111, 132, arg3);
        class62.method451();
        class106.field2476 = class44.method311(360, -116, 200, arg3);
        class62.method451();
        class134.field3109 = class44.method311(202, -115, 238, arg3);
        class62.method451();
        class1.field4 = class44.method311(203, -115, 238, arg3);
        class62.method451();
        class30.field668 = class44.method311(74, -128, 94, arg3);
        class62.method451();
        class29.field642 = class44.method311(75, -106, 94, arg3);
        class62.method451();
        byte[] var4 = arg2.method669(class115.field2737, class142.field3347, 1);
        class138 var5 = new class138(var4, arg3);
        class8.field193.method680(94);
        var5.method1057(0, 0);
        class99.field2322.method680(122);
        var5.method1057(-637, 0);
        class32.field695.method680(64);
        var5.method1057(-128, 0);
        class73.field1547.method680(61);
        var5.method1057(-202, -371);
        class106.field2476.method680(-92);
        var5.method1057(-202, -171);
        class134.field3109.method680(112);
        var5.method1057(0, -265);
        class1.field4.method680(112);
        var5.method1057(-562, -265);
        class30.field668.method680(-49);
        var5.method1057(-128, -171);
        class29.field642.method680(-68);
        var5.method1057(-562, -171);
        int[] var6 = new int[var5.field3194];
        for (int var7 = 0; var7 < var5.field3191; var7++) {
            for (int var24 = 0; var24 < var5.field3194; var24++) {
                var6[var24] = var5.field3195[var5.field3194 * var7 + var5.field3194 - var24 - 1];
            }
            for (int var25 = 0; var25 < var5.field3194; var25++) {
                var5.field3195[var25 + var5.field3194 * var7] = var6[var25];
            }
        }
        class8.field193.method680(-119);
        var5.method1057(382, 0);
        class99.field2322.method680(109);
        var5.method1057(-255, 0);
        class32.field695.method680(-57);
        var5.method1057(254, 0);
        class73.field1547.method680(-44);
        var5.method1057(180, -371);
        class106.field2476.method680(111);
        var5.method1057(180, -171);
        class134.field3109.method680(-126);
        var5.method1057(382, -265);
        class1.field4.method680(107);
        var5.method1057(-180, -265);
        class30.field668.method680(-85);
        var5.method1057(254, -171);
        class29.field642.method680(47);
        var5.method1057(-180, -171);
        class138 var8 = class98.method708(class115.field2737, class104.field2409, arg1, false);
        class32.field695.method680(-76);
        var8.method1048(382 - var8.field3194 / 2 - 128, 18);
        class58.field1240 = class99.method718(arg1, class141.field3283, class115.field2737, -27880);
        class59.field1273 = class99.method718(arg1, class119.field2786, class115.field2737, -27880);
        class45.field1016 = class129.method961(arg1, class115.field2737, class84.field1898, -75);
        class107.field2491 = new class138(128, 265);
        class58.field1250 = new class138(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class107.field2491.field3195[var9] = class8.field193.field2194[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class58.field1250.field3195[var10] = class99.field2322.field2194[var10];
        }
        class86.field2051 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class86.field2051[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class86.field2051[var12 + 64] = var12 * 1024 + 16711680;
        }
        int var13 = 0;
        int var14 = -88 % ((arg0 + 33) / 41);
        while (var13 < 64) {
            class86.field2051[var13 + 128] = var13 * 4 + 16776960;
            var13++;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class86.field2051[var15 + 192] = 16777215;
        }
        class89.field2124 = new int[256];
        for (int var16 = 0; var16 < 64; var16++) {
            class89.field2124[var16] = var16 * 1024;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class89.field2124[var17 + 64] = var17 * 4 + 65280;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class89.field2124[var18 + 128] = var18 * 262144 + 65535;
        }
        for (int var19 = 0; var19 < 64; var19++) {
            class89.field2124[var19 + 192] = 16777215;
        }
        class134.field3114 = new int[256];
        for (int var20 = 0; var20 < 64; var20++) {
            class134.field3114[var20] = var20 * 4;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class134.field3114[var21 + 64] = var21 * 262144 + 255;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class134.field3114[var22 + 128] = var22 * 1024 + 16711935;
        }
        for (int var23 = 0; var23 < 64; var23++) {
            class134.field3114[var23 + 192] = 16777215;
        }
        class40.field917 = new int[32768];
        class53.field1186 = new int[256];
        class53.field1181 = new int[32768];
        class36.method259((byte) 1, null);
        class115.field2735 = class115.field2737;
        class115.field2732 = class115.field2737;
        class7.field167 = new int[32768];
        class22.field512 = new int[32768];
        class10.field211 = 0;
        if (class10.field218 == 0 || class25.field603) {
            class13.method81((byte) 32, 10);
        } else {
            class13.method85(false, class23.field553, class10.field218, 0, 10, class116.field2769, class115.field2737, -116);
        }
        class1.method8(false, (byte) -27);
        class86.field2058 = true;
        class46.field1038 = true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZLqe;Lha;)V")
    public static final void method353(int arg0, boolean arg1, class109 arg2, class50 arg3) {
        if (!arg1) {
            field1104 = null;
        }
        field1101++;
        class91 var4 = new class91();
        var4.field2167 = arg2.method838(255);
        var4.field2149 = arg2.method832(14722);
        var4.field2146 = new int[var4.field2167];
        var4.field2154 = new class136[var4.field2167];
        var4.field2168 = new int[var4.field2167];
        var4.field2150 = new byte[var4.field2167][][];
        var4.field2160 = new int[var4.field2167];
        var4.field2164 = new class136[var4.field2167];
        for (int var5 = 0; var5 < var4.field2167; var5++) {
            try {
                int var6 = arg2.method838(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = new String(arg2.method833(-1).method1006((byte) 23));
                    String var19 = new String(arg2.method833(-1).method1006((byte) -77));
                    if (var6 == 1) {
                        var17 = arg2.method832(14722);
                    }
                    var4.field2146[var5] = var6;
                    var4.field2168[var5] = var17;
                    var4.field2154[var5] = arg3.method362((byte) 121, class33.method244(var18, 4349), var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method833(-1).method1006((byte) 85));
                    String var8 = new String(arg2.method833(-1).method1006((byte) -87));
                    int var9 = arg2.method838(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method833(-1).method1006((byte) -116));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method832(14722);
                            var12[var13] = new byte[var14];
                            arg2.method807(0, var12[var13], var14, 3);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field2146[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class33.method244(var10[var16], 4349);
                    }
                    var4.field2164[var5] = arg3.method356(var15, class33.method244(var7, 4349), var8, 0);
                    var4.field2150[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2160[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2160[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2160[var5] = -3;
            } catch (Exception var23) {
                var4.field2160[var5] = -4;
            } catch (Throwable var24) {
                var4.field2160[var5] = -5;
            }
        }
        class22.field514.method730(467, var4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static final void method354(boolean arg0) {
        field1094++;
        class84.field1906.method22((byte) -21);
        for (int var1 = 0; var1 < 32; var1++) {
            class102.field2365[var1] = 0L;
        }
        if (arg0) {
            for (int var2 = 0; var2 < 32; var2++) {
                class132.field3070[var2] = 0L;
            }
            class124.field2867 = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method355(int arg0) {
        field1100 = null;
        field1104 = null;
        field1099 = null;
        if (arg0 == -64) {
            field1103 = null;
            field1108 = null;
        }
    }
}
