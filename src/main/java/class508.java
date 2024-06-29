import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class508 {

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[Z")
    public boolean[] field7411 = new boolean[256];

    @OriginalMember(owner = "client!el", name = "g", descriptor = "[I")
    public int[] field7407 = new int[16];

    @OriginalMember(owner = "client!el", name = "t", descriptor = "[B")
    public byte[] field7420 = new byte[18002];

    @OriginalMember(owner = "client!el", name = "r", descriptor = "[[B")
    public byte[][] field7418 = new byte[6][258];

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
    public int[] field7413 = new int[6];

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[B")
    public byte[] field7421 = new byte[4096];

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public int field7416 = 0;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[Z")
    public boolean[] field7406 = new boolean[16];

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public int field7404 = 0;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "[I")
    public int[] field7425 = new int[256];

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[[I")
    public int[][] field7417 = new int[6][258];

    @OriginalMember(owner = "client!el", name = "E", descriptor = "[B")
    public byte[] field7431 = new byte[18002];

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[B")
    public byte[] field7424 = new byte[256];

    @OriginalMember(owner = "client!el", name = "G", descriptor = "[[I")
    public int[][] field7433 = new int[6][258];

    @OriginalMember(owner = "client!el", name = "I", descriptor = "[[I")
    public int[][] field7434 = new int[6][258];

    @OriginalMember(owner = "client!el", name = "C", descriptor = "[I")
    public int[] field7429 = new int[257];

    @OriginalMember(owner = "client!el", name = "v", descriptor = "Lee;")
    public static class628 field7422 = new class628();

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field7437 = 999999;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "B")
    public byte field7432;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field7401;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field7402;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field7408;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field7409;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field7412;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field7414;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public int field7419;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public int field7423;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public int field7426;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public int field7435;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[B")
    public byte[] field7415;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[B")
    public byte[] field7427;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(CB)Z", line = 3)
    public static final boolean method3085(char arg0, byte arg1) {
        if (arg1 <= 80) {
            method3085((char) 65412, (byte) -94);
        }
        field7428++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method3086(int arg0, int arg1, int arg2) {
        if (arg2 < 32) {
            method3085('}', (byte) 94);
        }
        field7410++;
        class698 var3 = class213.field3537.method94(arg1, (byte) -42);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method3946(arg0, -92);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 107)
    public static void method3087(int arg0) {
        if (arg0 >= 103) {
            field7422 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V", line = 122)
    public static final void method3088(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class502.field7355 = class595.field8435.method267() > 0;
        class454.field6813 = arg15;
        class325.field5056 = arg1 >> class439.field6699;
        class542.field7902 = arg3 >> class439.field6699;
        class220.field3583 = arg1;
        class2.field13 = arg3;
        class63.field815 = arg2;
        class197.field3230 = class325.field5056 - class443.field6744;
        if (class197.field3230 < 0) {
            class251.field4010 = -class197.field3230;
            class197.field3230 = 0;
        } else {
            class251.field4010 = 0;
        }
        class16.field223 = class542.field7902 - class443.field6744;
        if (class16.field223 < 0) {
            class466.field6936 = -class16.field223;
            class16.field223 = 0;
        } else {
            class466.field6936 = 0;
        }
        class391.field6123 = class443.field6744 + class325.field5056;
        if (class391.field6123 > class43.field597) {
            class391.field6123 = class43.field597;
        }
        class414.field6349 = class542.field7902 + class443.field6744;
        if (class414.field6349 > class541.field7896) {
            class414.field6349 = class541.field7896;
        }
        boolean[][] var16 = class37.field509;
        boolean[][] var17 = class550.field7997;
        if (class454.field6813) {
            for (int var18 = 0; var18 < class443.field6744 + class443.field6744 + 2; var18++) {
                for (int var21 = 0; var21 < class443.field6744 + class443.field6744 + 2; var21++) {
                    int var22 = class325.field5056 + var18 - class443.field6744;
                    int var23 = class542.field7902 + var21 - class443.field6744;
                    if (var22 >= 0 && var23 >= 0 && var22 < class43.field597 && var23 < class541.field7896) {
                        int var24 = var22 << class439.field6699;
                        int var25 = var23 << class439.field6699;
                        int var26 = class491.field7187[class491.field7187.length - 1].method479(var23, var22, -101) - (0x3E8 << class439.field6699 - 7);
                        int var27 = class493.field7208 == null ? class491.field7187[0].method479(var23, var22, -94) + class134.field2203 : class493.field7208[0].method479(var23, var22, -91) + class134.field2203;
                        class550.field7997[var18][var21] = class595.field8435.method321(var24, var26, var25, var24, var27, var25);
                    } else {
                        class550.field7997[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class443.field6744 + class443.field6744 + 1; var19++) {
                for (int var20 = 0; var20 < class443.field6744 + class443.field6744 + 1; var20++) {
                    class37.field509[var19][var20] = class550.field7997[var19][var20] || class550.field7997[var19 + 1][var20] || class550.field7997[var19][var20 + 1] || class550.field7997[var19 + 1][var20 + 1];
                }
            }
            class685.field9598 = arg5;
            class175.field2886 = arg6;
            class254.field4047 = arg7;
            class367.field5756 = arg8;
            class83.field1025 = arg9;
            class589.method3438(arg10, 0, class595.field8435);
        } else {
            if (class35.field503 == null) {
                class35.field503 = new boolean[class43.field597 + class43.field597 + 1][class541.field7896 + class43.field597 + 1];
                for (int var28 = 0; var28 < class35.field503.length; var28++) {
                    for (int var29 = 0; var29 < class35.field503[0].length; var29++) {
                        class35.field503[var28][var29] = true;
                    }
                }
            }
            class550.field7997 = class35.field503;
            class37.field509 = class35.field503;
            class197.field3230 = 0;
            class16.field223 = 0;
            class391.field6123 = class43.field597;
            class414.field6349 = class541.field7896;
            class95.field1489 = 0;
        }
        class272.method1921(class595.field8435, -90);
        for (class468 var30 = (class468) class485.field7108.method2754((byte) 110); var30 != null; var30 = (class468) class485.field7108.method2759(1486415172)) {
            var30.method2648((byte) -25);
            class377.method2470(var30, (byte) 121);
        }
        if (class502.field7355) {
            for (int var31 = 0; var31 < class343.field5536; var31++) {
                class529.field7714[var31].method1871(-79, arg0, arg14);
            }
        }
        if (class413.field6343) {
            class590.field8385 = class595.field8435.method353();
            class595.field8435.method343(class349.field5578);
            int var32 = (class349.field5578[2] - class349.field5578[0]) / class180.field3034;
            for (int var33 = 0; var33 < class180.field3034 - 1; var33++) {
                class90.field1081[var33] = (var33 + 1) * var32 + class547.field7971[var33];
            }
            for (int var34 = 0; var34 < class458.field6856.length; var34++) {
                class458.field6856[var34].method3191();
            }
        }
        if (class524.field7645 != null) {
            if (class413.field6343) {
                class65.method700(0);
            }
            class164.method1332(true);
            class595.field8435.method332(-1, 1583160, 40, 127);
            class260.method1840(true, arg4, arg10, arg11);
            if (class413.field6343) {
                class243.method1740();
            }
            class595.field8435.method314();
            class164.method1332(false);
        }
        class260.method1840(false, arg4, arg10, arg11);
        if (class413.field6343) {
            for (int var35 = 0; var35 < class524.field7649; var35++) {
                class522.field7576[var35] = class299.field4678[var35];
            }
            class65.method700(0);
            for (int var36 = 0; var36 < class458.field6856.length; var36++) {
                class458.field6856[var36].method3191();
            }
        }
        if (class413.field6343) {
            class243.method1740();
            for (int var37 = 0; var37 < class524.field7649; var37++) {
                class299.field4678[var37] = class522.field7576[var37];
            }
            if (class261.field4273 == 2) {
                int var10002;
                if (class521.field7522[0] < class521.field7522[1]) {
                    if (class90.field1081[0] + class547.field7971[0] > class349.field5578[0]) {
                        var10002 = class547.field7971[0]++;
                    }
                } else if (class521.field7522[0] > class521.field7522[1] && class90.field1081[0] + class547.field7971[0] < class349.field5578[2]) {
                    var10002 = class547.field7971[0]--;
                }
            }
        }
        if (!class454.field6813) {
            class37.field509 = var16;
            class550.field7997 = var17;
        }
        class634.method3685();
    }
}
