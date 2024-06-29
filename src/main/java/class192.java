import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class192 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
    public boolean field3016 = true;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field3019 = 0;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    public boolean field3020 = false;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field3024 = -1;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field3017 = 8;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field3018 = -1;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
    public boolean field3032 = true;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field3026 = 1190717;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public int field3025 = 16;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public int field3030 = 128;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
    public static int[] field3023 = new int[50];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
    public static boolean field3031;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 15)
    public static void method1462(int arg0) {
        field3023 = null;
        if (arg0 >= -114) {
            field3027 = -18;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1463(byte arg0) {
        class287.method2076(arg0 ^ 0xFFFFFFA1, 5);
        class32.method340(5, (byte) 99);
        class362.method2544((byte) 112, 5);
        field3034++;
        class71.method678((byte) 124, 5);
        class123.method1064(5, arg0 + 7052);
        class128.method1113((byte) 89, 5);
        class201.method1503(200, 5);
        class32.method339(5, -90);
        class51.method485(5, 7203);
        class282.method2053(5, 0);
        class235.method1754(5, (byte) -95);
        class46.method462(5, (byte) 110);
        class105.method913(5, 116);
        class260.method1907(5, false);
        class239.method1772(5, 121);
        class197.method1494(-105, 5);
        if (arg0 != -52) {
            return;
        }
        class3.method24(-2, 5);
        class36.method366((byte) -66, 5);
        class171.method1345(50, 17339);
        class188.method1441(5, (byte) 117);
        class188.method1444(true, 5);
        class256.field3936.method649((byte) 75, 5);
        class134.field2248.method649((byte) 75, 5);
        class277.field4288.method649((byte) 75, 5);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)I", line = 66)
    public static final int method1464(boolean arg0, int arg1) {
        field3021++;
        return arg0 ? arg1 & 0xFF : -34;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILug;I)V", line = 87)
    private final void method1465(int arg0, int arg1, class25 arg2, int arg3) {
        if (arg3 == 1) {
            this.field3019 = class178.method1395(118, arg2.method265(true));
        } else if (arg3 == 2) {
            this.field3024 = arg2.method281(arg1 ^ 0xFFFFFF89);
        } else if (arg3 == 3) {
            this.field3024 = arg2.method314((byte) 67);
            if (this.field3024 == 65535) {
                this.field3024 = -1;
            }
        } else if (arg3 == 5) {
            this.field3032 = false;
        } else if (arg3 == 7) {
            this.field3018 = class178.method1395(104, arg2.method265(true));
        } else if (arg3 == 8) {
            class58.field913 = arg0;
        } else if (arg3 == 9) {
            this.field3030 = arg2.method314((byte) 97);
        } else if (arg3 == 10) {
            this.field3016 = false;
        } else if (arg3 == 11) {
            this.field3017 = arg2.method281(-126);
        } else if (arg3 == 12) {
            this.field3020 = true;
        } else if (arg3 == 13) {
            this.field3026 = arg2.method265(true);
        } else if (arg3 == 14) {
            this.field3025 = arg2.method281(-126);
        }
        if (arg1 == 9) {
            field3014++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIII)V", line = 166)
    public static final void method1466(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3035++;
        for (int var6 = arg4; var6 <= (arg0 + arg4); var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class235.field3658[arg2][var7][var6] = 127;
                }
            }
        }
        int var8 = arg4;
        if (!arg1) {
            return;
        }
        while (arg0 + arg4 > var8) {
            for (int var9 = arg3; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class277.field4290[arg2][var9][var8] = arg2 <= 0 ? 0 : class277.field4290[arg2 - 1][var9][var8];
                }
            }
            var8++;
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg4 + 1; var10 < (arg0 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class277.field4290[arg2][arg3][var10] = class277.field4290[arg2][arg3 - 1][var10];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var11 = arg3 + 1; var11 < (arg3 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class277.field4290[arg2][var11][arg4] = class277.field4290[arg2][var11][arg4 - 1];
                }
            }
        }
        if (arg3 < 0 || arg4 < 0 || arg3 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 > 0 && class277.field4290[arg2][arg3 - 1][arg4] != 0) {
                class277.field4290[arg2][arg3][arg4] = class277.field4290[arg2][arg3 - 1][arg4];
            } else if (arg4 > 0 && class277.field4290[arg2][arg3][arg4 - 1] != 0) {
                class277.field4290[arg2][arg3][arg4] = class277.field4290[arg2][arg3][arg4 - 1];
            } else if (arg3 > 0 && arg4 > 0 && class277.field4290[arg2][arg3 - 1][arg4 - 1] != 0) {
                class277.field4290[arg2][arg3][arg4] = class277.field4290[arg2][arg3 - 1][arg4 - 1];
            }
        } else if (arg3 > 0 && class277.field4290[arg2 - 1][arg3 - 1][arg4] != class277.field4290[arg2][arg3 - 1][arg4]) {
            class277.field4290[arg2][arg3][arg4] = class277.field4290[arg2][arg3 - 1][arg4];
        } else if (arg4 > 0 && class277.field4290[arg2 - 1][arg3][arg4 - 1] != class277.field4290[arg2][arg3][arg4 - 1]) {
            class277.field4290[arg2][arg3][arg4] = class277.field4290[arg2][arg3][arg4 - 1];
        } else if (arg3 > 0 && arg4 > 0 && class277.field4290[arg2][arg3 - 1][arg4 - 1] != class277.field4290[arg2 - 1][arg3 - 1][arg4 - 1]) {
            class277.field4290[arg2][arg3][arg4] = class277.field4290[arg2][arg3 - 1][arg4 - 1];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V", line = 286)
    public static final void method1467(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class128.field2130 = arg0;
        field3029++;
        if (arg3 != 5) {
            field3033 = -105;
        }
        class284.field4385 = arg4;
        class328.field5042 = arg2;
        class43.field693 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILug;)V", line = 320)
    public final void method1468(int arg0, int arg1, class25 arg2) {
        if (arg1 != 0) {
            this.field3030 = 3;
        }
        while (true) {
            int var4 = arg2.method281(5);
            if (var4 == 0) {
                field3022++;
                return;
            }
            this.method1465(arg0, 9, arg2, var4);
        }
    }
}
