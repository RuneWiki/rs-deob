import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class362 {

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "[I")
    public int[] field5096;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "[I")
    public int[] field5098;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lqr;")
    public static class65 field5097 = new class65(4);

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field5100 = -1;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "Lqt;")
    public static class637 field5101 = new class637();

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static final void method2152(int arg0) {
        field5092++;
        int var1 = class3.field63.method3809(true);
        class568.field7464 = class3.field63.method3791(true);
        boolean var2 = class3.field63.method3791(true) == 1;
        int var3 = class3.field63.method3809(true);
        int var4 = class3.field63.method3783((byte) -45);
        class505.method2840(false);
        class118.method966(var4, true);
        class3.field63.method1661(true);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class719.field10004 >> 3; var20++) {
                for (int var21 = 0; var21 < class107.field1453 >> 3; var21++) {
                    int var22 = class3.field63.method1664(2059, 1);
                    if (var22 == 1) {
                        class447.field6131[var5][var20][var21] = class3.field63.method1664(2059, 26);
                    } else {
                        class447.field6131[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class3.field63.method1660(-111);
        int var6 = (class732.field10143 - class3.field63.field9419) / 16;
        class236.field3318 = new int[var6][4];
        if (arg0 < 84) {
            return;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class236.field3318[var7][var19] = class3.field63.method3799(false);
            }
        }
        class136.field2171 = new byte[var6][];
        class547.field7235 = new byte[var6][];
        class466.field6415 = new int[var6];
        class552.field7278 = new int[var6];
        class229.field3261 = null;
        class687.field9583 = new byte[var6][];
        class528.field7007 = new int[var6];
        class76.field921 = new int[var6];
        class543.field7180 = new byte[var6][];
        class197.field2972 = new int[var6];
        class1.field1 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class719.field10004 >> 3); var10++) {
                for (int var11 = 0; var11 < (class107.field1453 >> 3); var11++) {
                    int var12 = class447.field6131[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFC444) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class197.field2972[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class197.field2972[var8] = var15;
                            int var17 = (var15 & 0xFFB8) >> 8;
                            int var18 = var15 & 0xFF;
                            class466.field6415[var8] = class265.field3699.method2223((byte) 91, "m" + var17 + "_" + var18);
                            class552.field7278[var8] = class265.field3699.method2223((byte) 72, "l" + var17 + "_" + var18);
                            class76.field921[var8] = class265.field3699.method2223((byte) 78, "um" + var17 + "_" + var18);
                            class528.field7007[var8] = class265.field3699.method2223((byte) 51, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class616.method3375(var1, var2, 11, var3, 0);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2153(int arg0, String arg1) {
        class686.field9560 = arg1;
        field5093++;
        if (class514.field6818 == null) {
            return;
        }
        try {
            String var2 = class514.field6818.getParameter("cookieprefix");
            String var3 = class514.field6818.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (~arg1.length() == arg0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class498.method2808(arg0 + 2, class375.method2193(116) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class124.method986((byte) -62, class514.field6818, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2154(int arg0, int arg1, String arg2) {
        field5094++;
        int var3 = class586.field7665;
        if (arg1 != 12102) {
            return;
        }
        int[] var4 = class20.field351;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class383 var7 = class248.field3438[var4[var6]];
            if (var7 != null && class472.field6475 != var7 && var7.field5334 != null && var7.field5334.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class559.field7351++;
                    class583 var8 = class381.method2246(1, class128.field2105, class88.field1070);
                    var8.field7637.method3831(1182, var4[var6]);
                    var8.field7637.method3814((byte) 107, 0);
                    class42.method309(var8, 0);
                } else if (arg0 == 4) {
                    class336.field4761++;
                    class583 var9 = class381.method2246(1, class128.field2105, class427.field5891);
                    var9.field7637.method3780(var4[var6], arg1 ^ 0x2F02);
                    var9.field7637.method3785(0, (byte) 116);
                    class42.method309(var9, arg1 - 12102);
                } else if (arg0 == 5) {
                    class597.field7788++;
                    class583 var10 = class381.method2246(1, class128.field2105, class376.field5234);
                    var10.field7637.method3831(1182, var4[var6]);
                    var10.field7637.method3785(0, (byte) 98);
                    class42.method309(var10, arg1 - 12102);
                } else if (arg0 == 6) {
                    class314.field4484++;
                    class583 var11 = class381.method2246(1, class128.field2105, class22.field394);
                    var11.field7637.method3780(var4[var6], 109);
                    var11.field7637.method3788(0, (byte) 106);
                    class42.method309(var11, 0);
                } else if (arg0 == 7) {
                    class436.field6009++;
                    class583 var12 = class381.method2246(arg1 ^ 0x2F47, class128.field2105, class270.field3780);
                    var12.field7637.method3780(var4[var6], 41);
                    var12.field7637.method3785(0, (byte) 113);
                    class42.method309(var12, 0);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class178.method1234(4, 31663, class517.field6861.method2877(class713.field9854, (byte) -108) + arg2);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lkn;I)V")
    public static final void method2155(class742 arg0, int arg1) {
        field5099++;
        if (arg0 instanceof class556) {
            class556 var2 = (class556) arg0;
            if (var2.field7328 != null) {
                class603.method3281(true, var2, class472.field6475.field3508 != var2.field3508);
            }
        } else if (arg0 instanceof class383) {
            class383 var3 = (class383) arg0;
            class512.method2860(var3, 0, class472.field6475.field3508 != var3.field3508);
        }
        int var4 = 89 / ((15 - arg1) / 50);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(I)V")
    public class362(int arg0) {
        this.field5095 = arg0;
        this.field5096 = new int[this.field5095];
        this.field5098 = new int[this.field5095];
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public static void method2156(int arg0) {
        field5101 = null;
        field5097 = null;
        if (arg0 != 1520207683) {
            field5101 = null;
        }
    }
}
