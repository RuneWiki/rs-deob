import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class31 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lgd;")
    public static class325 field487 = new class325(2);

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lpk;")
    public static class120 field489;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 6)
    public static void method279(int arg0) {
        field487 = null;
        field489 = null;
        if (arg0 != 1) {
            field489 = (class120) null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 18)
    public static final void method280(int arg0) {
        class99.field1580 = 0;
        class340.field5248 = -1;
        field484++;
        class260.field3858 = false;
        class137.field2225 = 0;
        class209.field3305.field48 = 0;
        class260.field3870 = 0;
        class42.field646 = 0;
        class128.field2060 = 0;
        class172.field2761 = -1;
        class60.field884 = -1;
        class57.field862 = 0;
        class6.field132 = -1;
        class80.field1248.field48 = 0;
        for (int var1 = 0; var1 < class74.field1140.length; var1++) {
            if (class74.field1140[var1] != null) {
                class74.field1140[var1].field4695 = -1;
            }
        }
        if (arg0 > -35) {
            return;
        }
        for (int var2 = 0; var2 < class197.field3029.length; var2++) {
            if (class197.field3029[var2] != null) {
                class197.field3029[var2].field4695 = -1;
            }
        }
        class6.method97(-31005);
        class73.field1112 = 1;
        class117.method921((byte) 69, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class280.field4378[var3] = true;
        }
        class237.method1696(true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLnn;Lnn;BZII)I", line = 76)
    public static final int method281(boolean arg0, class44 arg1, class44 arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        field492++;
        if (arg3 > -69) {
            method279(70);
        }
        int var7 = class84.method664(arg0, arg2, arg5, arg1, -8);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class84.method664(arg4, arg2, arg6, arg1, -8);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZII)V", line = 115)
    public static final void method282(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field486++;
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (class162.field2623) {
            int var6 = arg2 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class10.field229 - class21.field382) * var6 / 100 + class21.field382;
            if (var7 < class75.field1155) {
                var7 = class75.field1155;
            } else if (class258.field3835 < var7) {
                var7 = class258.field3835;
            }
            int var8 = var7 * 512 * arg2 / (arg1 * 334);
            if (var8 < class308.field4881) {
                short var12 = class308.field4881;
                var7 = arg1 * var12 * 334 / (arg2 * 512);
                if (class258.field3835 < var7) {
                    var7 = class258.field3835;
                    int var13 = arg2 * var7 * 512 / (var12 * 334);
                    int var14 = (arg1 - var13) / 2;
                    if (arg3) {
                        class114.method892();
                        class114.method887(arg5, arg0, var14, arg2, 0);
                        class114.method887(arg1 + arg5 - var14, arg0, var14, arg2, 0);
                    }
                    arg5 += var14;
                    arg1 -= var14 * 2;
                }
            } else if (class184.field2913 < var8) {
                short var9 = class184.field2913;
                var7 = arg1 * 334 * var9 / (arg2 * 512);
                if (var7 < class75.field1155) {
                    var7 = class75.field1155;
                    int var10 = var9 * 334 * arg1 / (var7 * 512);
                    int var11 = (arg2 - var10) / 2;
                    if (arg3) {
                        class114.method892();
                        class114.method887(arg5, arg0, arg1, var11, 0);
                        class114.method887(arg5, arg0 + arg2 - var11, arg1, var11, 0);
                    }
                    arg2 -= var11 * 2;
                    arg0 += var11;
                }
            }
            class48.field740 = arg2 * var7 / 334;
        }
        class66.field984 = (short) arg2;
        if (arg4 == 0) {
            class175.field2803 = (short) arg1;
            class229.field3521 = arg5;
            class309.field4886 = arg0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILph;)V", line = 211)
    public static final void method283(int arg0, int arg1, int arg2, class86 arg3) {
        if (arg3.field4660 == arg2 && arg2 != -1) {
            class38 var4 = class63.method503(arg2, (byte) 120);
            int var5 = var4.field575;
            if (var5 == 1) {
                arg3.field4667 = arg0;
                arg3.field4634 = 0;
                arg3.field4674 = 1;
                arg3.field4655 = 0;
                arg3.field4687 = 0;
                class28.method246(false, 255, arg3.field4655, arg3.field4671, var4, arg3.field4672);
            }
            if (var5 == 2) {
                arg3.field4634 = 0;
            }
        } else if (arg2 == -1 || arg3.field4660 == -1 || class63.method503(arg2, (byte) 73).field583 >= class63.method503(arg3.field4660, (byte) 68).field583) {
            arg3.field4655 = 0;
            arg3.field4641 = arg3.field4645;
            arg3.field4634 = 0;
            arg3.field4687 = 0;
            arg3.field4660 = arg2;
            arg3.field4667 = arg0;
            arg3.field4674 = 1;
            if (arg3.field4660 != -1) {
                class28.method246(false, arg1 - 26251, arg3.field4655, arg3.field4671, class63.method503(arg3.field4660, (byte) 105), arg3.field4672);
            }
        }
        if (arg1 != 26506) {
            field491 = -55;
        }
        field488++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(CI)Z", line = 274)
    public static final boolean method284(char arg0, int arg1) {
        if (arg1 <= 124) {
            method282(-40, -16, -19, false, 77, 108);
        }
        field485++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
