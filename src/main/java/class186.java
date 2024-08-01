import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class class186 extends class85 {

    @OriginalMember(owner = "ub", name = "S", descriptor = "Llf;")
    public static class109 field3535 = class35.method275(")2", 2);

    @OriginalMember(owner = "ub", name = "V", descriptor = "[Z")
    public static boolean[] field3538 = new boolean[100];

    @OriginalMember(owner = "ub", name = "U", descriptor = "Llf;")
    public static class109 field3537 = class35.method275("Mitglieder)2Welt", 2);

    @OriginalMember(owner = "ub", name = "X", descriptor = "Llf;")
    private static class109 field3540 = class35.method275("No response from server)3", 2);

    @OriginalMember(owner = "ub", name = "Y", descriptor = "Llf;")
    public static class109 field3541 = class35.method275("Benutzeroberfl-=che geladen)3", 2);

    @OriginalMember(owner = "ub", name = "W", descriptor = "Llf;")
    public static class109 field3539 = class35.method275("sl_arrows", 2);

    @OriginalMember(owner = "ub", name = "ab", descriptor = "Llf;")
    public static class109 field3543 = field3540;

    @OriginalMember(owner = "ub", name = "Q", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "ub", name = "R", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "ub", name = "T", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "ub", name = "Z", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "ub", name = "e", descriptor = "(I)V")
    public static final void method1260(int arg0) {
        class41.field869.method1088(-51);
        ++field3533;
        class170.field3189.method1088(-51);
        if (arg0 != 5041) {
            field3543 = null;
        }
    }

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "()V")
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(Z)V")
    public static void method1261(boolean arg0) {
        field3538 = null;
        field3541 = null;
        field3540 = null;
        field3543 = null;
        field3539 = null;
        field3537 = null;
        field3535 = null;
        if (arg0) {
            method1264(22, -3);
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIB)I")
    private final int method1262(int arg0, int arg1, byte arg2) {
        ++field3536;
        if (arg2 != -51) {
            this.method87(-74, 59);
        }
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 - -1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIII)V")
    public static final void method1263(int arg0, int arg1, int arg2, int arg3) {
        class3 var4 = class78.field1550[arg0][arg1][arg2];
        if (var4 != null) {
            class104 var5 = var4.field34;
            if (var5 != null) {
                var5.field2057 = var5.field2057 * arg3 / 16;
                var5.field2058 = var5.field2058 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field3534;
        if (arg0 > -49) {
            field3535 = null;
        }
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int var4 = class54.field1083[arg1];
            for (int var5 = 0; ~class57.field1152 < ~var5; ++var5) {
                var3[var5] = this.method1262(class47.field980[var5], var4, (byte) -51) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)V")
    public static final void method1264(int arg0, int arg1) {
        ++field3542;
        class9.method57(89);
        class202.method1331((byte) -127);
        int var2 = class177.method1207(-102, arg1).field1425;
        if (var2 != 0) {
            int var3 = class187.field3564[arg1];
            if (~var2 == -2) {
                client.field684 = var3;
                if (client.field684 == 1) {
                    class124.method897(0.9F);
                }
                if (client.field684 == 2) {
                    class124.method897(0.8F);
                }
                if (client.field684 == 3) {
                    class124.method897(0.7F);
                }
                if (client.field684 == 4) {
                    class124.method897(0.6F);
                }
                class106.method767(15359);
            }
            int var4 = 31 / ((12 - arg0) / 42);
            if (~var2 == -4) {
                short var5 = 0;
                if (var3 == 0) {
                    var5 = 255;
                }
                if (var3 == 1) {
                    var5 = 192;
                }
                if (~var3 == -3) {
                    var5 = 128;
                }
                if (var3 == 3) {
                    var5 = 64;
                }
                if (~var3 == -5) {
                    var5 = 0;
                }
                if (~class178.field3349 != ~var5) {
                    if (class178.field3349 == 0 && class131.field2524 != -1) {
                        class16.method111(0, -110, var5, class131.field2524, false, class103.field2030);
                        class36.field792 = false;
                    } else if (var5 != 0) {
                        class21.method198(7920, var5);
                    } else {
                        class143.method1009(-29672);
                        class36.field792 = false;
                    }
                    class178.field3349 = var5;
                }
            }
            if (~var2 == -5) {
                if (var3 == 0) {
                    class10.field162 = 127;
                }
                if (var3 == 1) {
                    class10.field162 = 96;
                }
                if (var3 == 2) {
                    class10.field162 = 64;
                }
                if (var3 == 3) {
                    class10.field162 = 32;
                }
                if (~var3 == -5) {
                    class10.field162 = 0;
                }
            }
            if (var2 == 9) {
                class13.field201 = var3;
            }
            if (var2 == 6) {
                class54.field1090 = var3;
            }
            if (var2 == 10) {
                if (var3 == 0) {
                    class170.field3196 = 127;
                }
                if (~var3 == -2) {
                    class170.field3196 = 96;
                }
                if (~var3 == -3) {
                    class170.field3196 = 64;
                }
                if (~var3 == -4) {
                    class170.field3196 = 32;
                }
                if (~var3 == -5) {
                    class170.field3196 = 0;
                }
            }
            if (var2 == 5) {
                class126.field2429 = var3;
            }
        }
    }
}
