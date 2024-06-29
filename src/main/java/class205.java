import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class205 extends class88 {

    @OriginalMember(owner = "client!aj", name = "Ib", descriptor = "[Ljava/lang/String;")
    public static String[] field2676 = new String[100];

    @OriginalMember(owner = "client!aj", name = "Fb", descriptor = "F")
    public static float field2673;

    @OriginalMember(owner = "client!aj", name = "Gb", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!aj", name = "Hb", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!aj", name = "Jb", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!aj", name = "Kb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(FB)V")
    public final void method1338(float arg0, byte arg1) {
        ++field2674;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field1223[super.field1176++] = (byte) var3;
        super.field1223[super.field1176++] = (byte) (var3 >> 8);
        if (arg1 <= -11) {
            super.field1223[super.field1176++] = (byte) (var3 >> 16);
            super.field1223[super.field1176++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "(B)V")
    public static void method1339(byte arg0) {
        field2676 = null;
        int var1 = -121 % ((arg0 - -50) / 40);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
    public class205(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "(I)V")
    public static final void method1340(int arg0) {
        class382.field5036.method84(arg0 ^ -77);
        if (arg0 != 0) {
            field2676 = null;
        }
        ++field2675;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)V")
    public static final void method1341(int arg0, int arg1, byte arg2) {
        if (class230.field2954 > class230.field2952) {
            class230.field2952 = (float) ((double) class230.field2952 / 30.0D + (double) class230.field2952);
            if (class230.field2954 < class230.field2952) {
                class230.field2952 = class230.field2954;
            }
            class60.method342((byte) 90);
            class230.field2960 = (int) class230.field2952 >> 1;
            class230.field2955 = class370.method2155(class230.field2960, (byte) 11);
        } else if (class230.field2952 > class230.field2954) {
            class230.field2952 = (float) ((double) class230.field2952 - (double) class230.field2952 / 30.0D);
            if (class230.field2954 > class230.field2952) {
                class230.field2952 = class230.field2954;
            }
            class60.method342((byte) 90);
            class230.field2960 = (int) class230.field2952 >> 1;
            class230.field2955 = class370.method2155(class230.field2960, (byte) 11);
        }
        if (arg2 != 11) {
            method1342(-65, -119, -29);
        }
        ++field2677;
        if (~class294.field3816 != 0 && ~class203.field2665 != 0) {
            int var3 = -class267.field3389 + class294.field3816;
            if (~var3 > -3 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = class203.field2665 - class346.field4413;
            class267.field3389 += var3;
            if (~var4 > -3 || ~var4 < -3) {
                var4 /= 8;
            }
            if (~var3 == -1 && var4 == 0) {
                class294.field3816 = -1;
                class203.field2665 = -1;
            }
            class346.field4413 += var4;
            class60.method342((byte) 90);
        }
        if (~class407.field5459 < -1) {
            --class181.field2366;
            if (class181.field2366 == 0) {
                class181.field2366 = 100;
                --class407.field5459;
            }
        } else {
            class246.field3149 = -1;
            class196.field2536 = -1;
        }
        if (class415.field5534 && class176.field2250 != null) {
            for (class36 var5 = (class36) class176.field2250.method49(-13); var5 != null; var5 = (class36) class176.field2250.method46((byte) 11)) {
                class429 var6 = class230.field2950.method1093(var5.field549.field4371, arg2 + -40);
                if (!var5.method237(arg0, arg1, false)) {
                    if (var5.field549.field4362) {
                        var5.field549.field4362 = false;
                        class490.method2933(class51.field694, var5.field549.field4371, var6.field5912);
                    }
                } else {
                    if (var6.field5879 != null) {
                        if (var6.field5879[4] != null) {
                            class126.method793(0, 1002, (long) var5.field549.field4371, -1, var6.field5912, (byte) -5, false, var6.field5918, true, var6.field5879[4], -1);
                        }
                        if (var6.field5879[3] != null) {
                            class126.method793(0, 1003, (long) var5.field549.field4371, -1, var6.field5912, (byte) -5, false, var6.field5918, true, var6.field5879[3], -1);
                        }
                        if (var6.field5879[2] != null) {
                            class126.method793(0, 1010, (long) var5.field549.field4371, -1, var6.field5912, (byte) -5, false, var6.field5918, true, var6.field5879[2], -1);
                        }
                        if (var6.field5879[1] != null) {
                            class126.method793(0, 1006, (long) var5.field549.field4371, -1, var6.field5912, (byte) -5, false, var6.field5918, true, var6.field5879[1], -1);
                        }
                        if (var6.field5879[0] != null) {
                            class126.method793(0, 1011, (long) var5.field549.field4371, -1, var6.field5912, (byte) -5, false, var6.field5918, true, var6.field5879[0], -1);
                        }
                    }
                    if (!var5.field549.field4362) {
                        var5.field549.field4362 = true;
                        class490.method2933(class228.field2935, var5.field549.field4371, var6.field5912);
                    }
                    if (var5.field549.field4362) {
                        class490.method2933(class187.field2442, var5.field549.field4371, var6.field5912);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Lmu;")
    public static final class338 method1342(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        return var3 != null && var3.field7492 != null ? var3.field7492 : null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(FI)V")
    public final void method1343(float arg0, int arg1) {
        ++field2678;
        if (arg1 != 1829123664) {
            field2676 = null;
        }
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field1223[super.field1176++] = (byte) (var3 >> 24);
        super.field1223[super.field1176++] = (byte) (var3 >> 16);
        super.field1223[super.field1176++] = (byte) (var3 >> 8);
        super.field1223[super.field1176++] = (byte) var3;
    }
}
