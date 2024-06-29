import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class430 {

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field6003 = -1;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "Lem;")
    public static class206 field6014 = new class206(82, 12);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Lfaa;")
    private class139 field6001;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lom;")
    public static class341 field5994;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljava/lang/String;")
    private String field5998;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Ljava/lang/String;")
    private String field6012;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "[B")
    public static byte[] field6015;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
    private int[] field5990;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    private int[] field5992;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    private int[] field5993;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
    private int[] field5996;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
    private int[] field6000;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
    private int[] field6002;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[I")
    private int[] field6009;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[I")
    private int[] field6010;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "[I")
    public static int[] field6016;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field6005;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field6006;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[[I")
    private int[][] field5999;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[[I")
    private int[][] field6004;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "[[I")
    private int[][] field6008;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLac;)V")
    public final void method2467(byte arg0, class501 arg1) {
        if (arg0 != 105) {
            field6016 = null;
        }
        field6013++;
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                return;
            }
            this.method2472(4, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public final void method2468(int arg0) {
        field5991++;
        if (this.field5998 == null) {
            this.field5998 = this.field6012;
        }
        if (arg0 >= -50) {
            method2469(89);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static final void method2469(int arg0) {
        if (arg0 < 118) {
            return;
        }
        class541.field7317.method287((byte) -9);
        field5995++;
        for (int var1 = 0; var1 < 32; var1++) {
            class90.field1292[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class693.field9878[var2] = 0L;
        }
        class631.field8752 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILpc;III)V")
    public static final void method2470(int arg0, class623 arg1, int arg2, int arg3, int arg4) {
        field5997++;
        long var5 = (long) (arg0 << 14 | arg4 << 28 | arg2);
        class385 var7 = (class385) class687.field9801.method970((byte) 89, var5);
        if (var7 == null) {
            class385 var8 = new class385();
            class687.field9801.method968(var5, var8, -1);
            var8.field5460.method1441(arg1, 0);
            return;
        }
        class661 var9 = class599.field8366.method3949(arg3 - 1, arg1.field8646);
        int var10 = var9.field9253;
        if (var9.field9254 == arg3) {
            var10 = (arg1.field8645 + 1) * var10;
        }
        for (class623 var11 = (class623) var7.field5460.method1436(28964); var11 != null; var11 = (class623) var7.field5460.method1443((byte) 6)) {
            class661 var12 = class599.field8366.method3949(0, var11.field8646);
            int var13 = var12.field9253;
            if (var12.field9254 == 1) {
                var13 = (var11.field8645 + 1) * var13;
            }
            if (var13 < var10) {
                class140.method983(var11, arg1, 30653);
                return;
            }
        }
        var7.field5460.method1441(arg1, 0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method2471(byte arg0) {
        field5994 = null;
        if (arg0 <= -70) {
            field6016 = null;
            field6015 = null;
            field6014 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILac;)V")
    private final void method2472(int arg0, int arg1, class501 arg2) {
        if (arg0 != 4) {
            this.method2468(64);
        }
        if (arg1 == 1) {
            this.field6012 = arg2.method2839(true);
        } else if (arg1 == 2) {
            this.field5998 = arg2.method2839(true);
        } else if (arg1 == 3) {
            int var22 = arg2.method2874((byte) -75);
            this.field5999 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5999[var23][0] = arg2.method2845(-1);
                this.field5999[var23][1] = arg2.method2840(false);
                this.field5999[var23][2] = arg2.method2840(false);
            }
        } else if (arg1 == 4) {
            int var20 = arg2.method2874((byte) -75);
            this.field6004 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field6004[var21][0] = arg2.method2845(-1);
                this.field6004[var21][1] = arg2.method2840(false);
                this.field6004[var21][2] = arg2.method2840(false);
            }
        } else if (arg1 == 5) {
            arg2.method2845(-1);
        } else if (arg1 == 6) {
            arg2.method2874((byte) -75);
        } else if (arg1 == 7) {
            arg2.method2874((byte) -75);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method2874((byte) -75);
            } else if (arg1 == 10) {
                int var4 = arg2.method2874((byte) -75);
                this.field6002 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6002[var5] = arg2.method2840(false);
                }
            } else if (arg1 == 12) {
                arg2.method2840(false);
            } else if (arg1 == 13) {
                int var6 = arg2.method2874((byte) -75);
                this.field5992 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5992[var7] = arg2.method2845(arg0 - 5);
                }
            } else if (arg1 == 14) {
                int var18 = arg2.method2874((byte) -75);
                this.field6008 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6008[var19][0] = arg2.method2874((byte) -75);
                    this.field6008[var19][1] = arg2.method2874((byte) -75);
                }
            } else if (arg1 == 15) {
                arg2.method2845(arg0 ^ 0xFFFFFFFB);
            } else if (arg1 == 17) {
                this.field6003 = arg2.method2845(-1);
            } else if (arg1 == 18) {
                int var8 = arg2.method2874((byte) -75);
                this.field6006 = new String[var8];
                this.field6010 = new int[var8];
                this.field6009 = new int[var8];
                this.field5996 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5996[var9] = arg2.method2840(false);
                    this.field6009[var9] = arg2.method2840(false);
                    this.field6010[var9] = arg2.method2840(false);
                    this.field6006[var9] = arg2.method2851((byte) -97);
                }
            } else if (arg1 == 19) {
                int var10 = arg2.method2874((byte) -75);
                this.field5993 = new int[var10];
                this.field6000 = new int[var10];
                this.field6005 = new String[var10];
                this.field5990 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field5990[var11] = arg2.method2840(false);
                    this.field5993[var11] = arg2.method2840(false);
                    this.field6000[var11] = arg2.method2840(false);
                    this.field6005[var11] = arg2.method2851((byte) -95);
                }
            } else if (arg1 == 249) {
                int var12 = arg2.method2874((byte) -75);
                if (this.field6001 == null) {
                    int var13 = class206.method1334(arg0 - 5, var12);
                    this.field6001 = new class139(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg2.method2874((byte) -75) == 1;
                    int var16 = arg2.method2819((byte) 72);
                    class401 var17;
                    if (var15) {
                        var17 = new class256(arg2.method2851((byte) -98));
                    } else {
                        var17 = new class72(arg2.method2840(false));
                    }
                    this.field6001.method968((long) var16, var17, arg0 - 5);
                }
            }
        }
        field6007++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2473(int arg0, String arg1) {
        field6011++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class165.method1165((byte) 98, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class165.method1165((byte) 98, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class207.method1344(var7, 20686)) {
                char var8 = class468.method2643(var7, arg0 ^ 0xFFFFB6E9);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (arg0 != 15570) {
            return null;
        } else if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
