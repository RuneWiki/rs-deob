import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class177 {

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public int field3037 = -1;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field3032 = 2;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lpl;")
    private class616 field3035;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Ljava/lang/String;")
    private String field3031;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Ljava/lang/String;")
    private String field3038;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
    private int[] field3025;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
    private int[] field3028;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[I")
    private int[] field3033;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
    private int[] field3034;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "[I")
    private int[] field3036;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "[I")
    private int[] field3039;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "[I")
    private int[] field3041;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "[I")
    private int[] field3043;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field3027;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field3044;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[[I")
    private int[][] field3029;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "[[I")
    private int[][] field3040;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[[I")
    private int[][] field3045;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLofa;)V", line = 7)
    public final void method1380(byte arg0, class301 arg1) {
        int var3 = 71 / ((arg0 + 36) / 40);
        field3046++;
        while (true) {
            int var4 = arg1.method1987(-110);
            if (var4 == 0) {
                return;
            }
            this.method1384(arg1, (byte) 100, var4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 27)
    public final void method1381(int arg0) {
        field3026++;
        if (this.field3031 == null) {
            this.field3031 = this.field3038;
        }
        int var2 = -46 % ((52 - arg0) / 58);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILul;ZILla;I)V", line = 39)
    public static final void method1382(int arg0, int arg1, class363 arg2, boolean arg3, int arg4, class422 arg5, int arg6) {
        class736.method4110((byte) -72, arg1, arg4, arg6, arg5, arg3);
        field3047++;
        if (arg0 <= 26) {
            method1382(62, -54, null, true, -75, null, 15);
        }
        class259.field4052 = arg2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V", line = 61)
    public static final void method1383(byte arg0, String arg1, String arg2) {
        class355.field5377 = -1;
        if (arg0 == 23) {
            class377.field5674 = 1;
            field3030++;
            class723.method3986((byte) 86, arg1, arg2, false);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lofa;BI)V", line = 76)
    private final void method1384(class301 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3038 = arg0.method1944(-110);
        } else if (arg2 == 2) {
            this.field3031 = arg0.method1944(-106);
        } else if (arg2 == 3) {
            int var4 = arg0.method1987(-47);
            this.field3045 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3045[var5][0] = arg0.method1989((byte) -83);
                this.field3045[var5][1] = arg0.method1934(-2);
                this.field3045[var5][2] = arg0.method1934(-2);
            }
        } else if (arg2 == 4) {
            int var6 = arg0.method1987(arg1 - 209);
            this.field3040 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3040[var7][0] = arg0.method1989((byte) -96);
                this.field3040[var7][1] = arg0.method1934(-2);
                this.field3040[var7][2] = arg0.method1934(-2);
            }
        } else if (arg2 == 5) {
            arg0.method1989((byte) -113);
        } else if (arg2 == 6) {
            arg0.method1987(-15);
        } else if (arg2 == 7) {
            arg0.method1987(-42);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method1987(-45);
            } else if (arg2 == 10) {
                int var8 = arg0.method1987(-69);
                this.field3034 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field3034[var9] = arg0.method1934(arg1 - 102);
                }
            } else if (arg2 == 12) {
                arg0.method1934(arg1 - 102);
            } else if (arg2 == 13) {
                int var10 = arg0.method1987(arg1 ^ 0xFFFFFF98);
                this.field3041 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field3041[var11] = arg0.method1989((byte) -46);
                }
            } else if (arg2 == 14) {
                int var12 = arg0.method1987(arg1 ^ 0xFFFFFFD0);
                this.field3029 = new int[var12][2];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field3029[var13][0] = arg0.method1987(-30);
                    this.field3029[var13][1] = arg0.method1987(-11);
                }
            } else if (arg2 == 15) {
                arg0.method1989((byte) -103);
            } else if (arg2 == 17) {
                this.field3037 = arg0.method1989((byte) -104);
            } else if (arg2 == 18) {
                int var22 = arg0.method1987(arg1 ^ 0xFFFFFFBB);
                this.field3039 = new int[var22];
                this.field3036 = new int[var22];
                this.field3027 = new String[var22];
                this.field3028 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field3039[var23] = arg0.method1934(-2);
                    this.field3036[var23] = arg0.method1934(-2);
                    this.field3028[var23] = arg0.method1934(-2);
                    this.field3027[var23] = arg0.method1958(-3438);
                }
            } else if (arg2 == 19) {
                int var20 = arg0.method1987(-55);
                this.field3044 = new String[var20];
                this.field3043 = new int[var20];
                this.field3025 = new int[var20];
                this.field3033 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field3025[var21] = arg0.method1934(-2);
                    this.field3033[var21] = arg0.method1934(-2);
                    this.field3043[var21] = arg0.method1934(-2);
                    this.field3044[var21] = arg0.method1958(arg1 - 3538);
                }
            } else if (arg2 == 249) {
                int var14 = arg0.method1987(-57);
                if (this.field3035 == null) {
                    int var15 = class567.method3292(var14, arg1 - 213);
                    this.field3035 = new class616(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg0.method1987(arg1 ^ 0xFFFFFFB5) == 1;
                    int var18 = arg0.method1952(22085);
                    class65 var19;
                    if (var17) {
                        var19 = new class495(arg0.method1958(-3438));
                    } else {
                        var19 = new class332(arg0.method1934(-2));
                    }
                    this.field3035.method3516(255, (long) var18, var19);
                }
            }
        }
        if (arg1 != 100) {
            this.field3031 = null;
        }
        field3042++;
    }
}
