import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class508 extends class318 implements class659 {

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    private int field7306;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[J")
    public static long[] field7311 = new long[256];

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "[S")
    public static short[] field7312;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "S")
    public static short field7313;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI[BI)V")
    public final void method782(byte arg0, int arg1, byte[] arg2, int arg3) {
        this.method1792(arg1, 0, arg2);
        if (arg0 < 87) {
            field7313 = 63;
        }
        ++field7305;
        this.field7306 = arg3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static final void method2916(byte arg0) {
        ++field7308;
        if (class381.field4954 == 1 || class381.field4954 == 3 || class381.field4954 != class227.field2904 && (~class381.field4954 == -1 || class227.field2904 == 0)) {
            class208.field2528 = 0;
            class118.field1356 = 0;
            class392.field5223.method3227((byte) 60);
        }
        if (arg0 != -55) {
            method2921(-34, (byte) 14);
        }
        class227.field2904 = class381.field4954;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lep;B)Lep;")
    public static final class382 method2917(class382 arg0, byte arg1) {
        ++field7310;
        if (~arg0.field5108 != 0) {
            return class505.method2903(arg0.field5108, 65535);
        } else {
            if (arg1 != -28) {
                field7313 = 67;
            }
            int var2 = arg0.field5055 >>> 16;
            class627 var3 = new class627(class234.field2982);
            for (class454 var4 = (class454) var3.method3516(0); var4 != null; var4 = (class454) var3.method3517(-1)) {
                if (var4.field6291 == var2) {
                    return class505.method2903((int) var4.field3405, 65535);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)J")
    public final long method781(boolean arg0) {
        ++field7314;
        return arg0 ? 26L : 0L;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
    public final int method779(int arg0) {
        if (arg0 < 21) {
            field7313 = -12;
        }
        ++field7303;
        return super.field4122;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method778(int arg0) {
        if (arg0 != -13931) {
            field7313 = -29;
        }
        ++field7301;
        return this.field7306;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lap;ILjaclib/memory/Buffer;IZ)V")
    public class508(class435 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7306 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
    public static final void method2918(byte arg0) {
        ++field7304;
        class187.method1086();
        if (arg0 != 72) {
            field7313 = 84;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public static void method2919(int arg0) {
        field7312 = null;
        if (arg0 <= 109) {
            method2919(-94);
        }
        field7311 = null;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lap;I[BIZ)V")
    public class508(class435 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7306 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public final void method1108(byte arg0) {
        super.field4119.method2384(this, arg0 ^ -876814223);
        if (arg0 != -103) {
            this.field7306 = -14;
        }
        ++field7300;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public static final void method2920(int arg0) {
        class592.field8416 = new class261(8);
        ++field7309;
        class19.field174 = arg0;
        for (class202 var1 = (class202) class515.field7362.method93((byte) 59); var1 != null; var1 = (class202) class515.field7362.method92(0)) {
            var1.method1231();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V")
    public static final void method2921(int arg0, byte arg1) {
        ++field7307;
        if (class351.field4601 != arg0) {
            if (~arg0 == -14) {
                if (class343.field4443 != null) {
                    class500.method2878(class347.field4526, (byte) -104);
                } else {
                    class267.method1510(class380.field4932, 29476, class673.field9560, class347.field4526);
                }
            }
            if (~arg0 != -14 && class46.field505 != null) {
                class46.field505.method1642(-1);
                class46.field505 = null;
            }
            if (arg0 == 3) {
                class438.method2418((byte) 88, class397.field5320 != class36.field410);
            }
            if (~arg0 == -8) {
                class4.method19(50, ~class397.field5320 != ~class293.field3847);
            }
            if (~arg0 != -6) {
                if (~arg0 != -7) {
                    if (~arg0 == -10) {
                        if (class343.field4443 != null) {
                            class500.method2878(class347.field4526, (byte) -90);
                        } else {
                            class267.method1510(class380.field4932, 29476, class673.field9560, class347.field4526);
                        }
                    } else if (~arg0 == -13) {
                        if (class343.field4443 != null) {
                            class225.method1321((byte) 114);
                        } else {
                            class156.method847(class673.field9560, -1, class380.field4932);
                        }
                    }
                } else if (class343.field4443 == null) {
                    class267.method1510(class380.field4932, 29476, class673.field9560, class347.field4526);
                } else {
                    class500.method2878(class347.field4526, (byte) -98);
                }
            } else if (class343.field4443 == null) {
                class156.method847(class673.field9560, -1, class380.field4932);
            } else {
                class225.method1321((byte) 108);
            }
            if (class569.method3217((byte) -102, class351.field4601)) {
                class294.field3869.field3945 = 2;
                class144.field1615.field3945 = 2;
                class85.field900.field3945 = 2;
                class315.field4096.field3945 = 2;
                class147.field1648.field3945 = 2;
                class516.field7385.field3945 = 2;
                class135.field1527.field3945 = 2;
            }
            if (class569.method3217((byte) -110, arg0)) {
                class73.field759 = 1;
                class581.field8255 = 1;
                class689.field9727 = 0;
                class149.field1702 = 0;
                class421.field5603 = 0;
                class526.method2994(32130, true);
                class294.field3869.field3945 = 1;
                class144.field1615.field3945 = 1;
                class85.field900.field3945 = 1;
                class315.field4096.field3945 = 1;
                class147.field1648.field3945 = 1;
                class516.field7385.field3945 = 1;
                class135.field1527.field3945 = 1;
            }
            if (~arg0 == -12 || ~arg0 == -4) {
                class374.method2057((byte) -66);
            }
            boolean var2 = ~arg0 == -3 || class285.method1619(true, arg0) || class521.method2973(7, arg0);
            boolean var3 = ~class351.field4601 == -3 || class285.method1619(true, class351.field4601) || class521.method2973(7, class351.field4601);
            if (arg1 >= -92) {
                field7312 = null;
            }
            if (var3 == !var2) {
                if (!var2) {
                    class649.method3656(2, true);
                    class448.field6156.method2482(true, true);
                } else {
                    class80.field832 = class21.field195;
                    if (class601.field8530.field2873 != 0) {
                        class388.method2121(2, class21.field195, 18660, 0, class601.field8530.field2873, class403.field5364, false);
                    } else {
                        class649.method3656(2, true);
                    }
                    class448.field6156.method2482(false, true);
                }
            }
            if (class569.method3217((byte) -27, arg0) || arg0 == 13) {
                class453.field6284.method367();
            }
            class351.field4601 = arg0;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(1L & var1) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field7311[var0] = var1;
        }
        field7312 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        field7313 = 256;
    }
}
