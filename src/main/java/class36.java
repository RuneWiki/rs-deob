import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class36 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lmn;")
    private class162 field364;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "[[Z")
    public static boolean[][] field374 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "[B")
    public static byte[] field366 = new byte[32896];

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "F")
    public static float field371;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Lhv;")
    public static class152 field376;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lsc;")
    public static final class29 method221(int arg0, int arg1) {
        field369++;
        if (arg1 != -21279) {
            method224(false);
        }
        if (arg0 == 0) {
            if ((double) class194.field2877 == 3.0D) {
                return class416.field6308;
            }
            if ((double) class194.field2877 == 4.0D) {
                return class526.field7755;
            }
            if ((double) class194.field2877 == 6.0D) {
                return class350.field5418;
            }
            if ((double) class194.field2877 >= 8.0D) {
                return class399.field6037;
            }
        } else if (arg0 == 1) {
            if ((double) class194.field2877 == 3.0D) {
                return class350.field5418;
            }
            if ((double) class194.field2877 == 4.0D) {
                return class399.field6037;
            }
            if ((double) class194.field2877 == 6.0D) {
                return class523.field7736;
            }
            if ((double) class194.field2877 >= 8.0D) {
                return class39.field386;
            }
        } else if (arg0 == 2) {
            if ((double) class194.field2877 == 3.0D) {
                return class523.field7736;
            }
            if ((double) class194.field2877 == 4.0D) {
                return class39.field386;
            }
            if ((double) class194.field2877 == 6.0D) {
                return class85.field1245;
            }
            if ((double) class194.field2877 >= 8.0D) {
                return class236.field3870;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)I")
    public static final int method222(int arg0) {
        field365++;
        if (arg0 != 6) {
            field373 = -84;
        }
        return 6;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < 39) {
            method225(45);
        }
        if (arg3 >= class178.field2609 && arg1 <= class460.field7096 && arg6 >= class462.field7105 && arg0 <= class222.field3750) {
            if (arg2 == 1) {
                class264.method1809(arg6, 0, arg0, arg4, arg1, arg3);
            } else {
                class409.method2615(arg4, arg2, arg0, 35, arg6, arg1, arg3);
            }
        } else if (arg2 == 1) {
            class81.method576(true, arg3, arg1, arg0, arg6, arg4);
        } else {
            class222.method1619(arg6, arg2, arg3, arg1, arg4, 89, arg0);
        }
        field368++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public static void method224(boolean arg0) {
        field376 = null;
        if (arg0) {
            field374 = null;
        }
        field374 = null;
        field366 = null;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public static final void method225(int arg0) {
        field367++;
        if (class205.field3137) {
            return;
        }
        if (class141.field1911.field6082) {
            class135.field1824 = ((int) class135.field1824 - 17 & 0xFFFFFFF0);
        } else {
            class131.field1781 += (-12.0F - class131.field1781) / 2.0F;
        }
        if (arg0 <= 86) {
            field374 = null;
        }
        class205.field3137 = true;
        class528.field7774 = true;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class36(class236 arg0, int arg1, class162 arg2) {
        new class328(64);
        this.field364 = arg2;
        this.field372 = this.field364.method1008(15, (byte) -21);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field366[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field375 = 2;
    }
}
