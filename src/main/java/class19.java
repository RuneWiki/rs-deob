import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class19 extends class300 {

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field255 = -1;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "Ljava/lang/String;")
    public static String field256 = "flash3:";

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "Ljava/lang/String;")
    public static String field265 = " from your friend list first.";

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "[[[B")
    public static byte[][][] field259;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
    public static final void method107(byte arg0) {
        ++field257;
        if (~class45.field536 == -6) {
            class45.field536 = 6;
            int var1 = 54 / ((arg0 - 42) / 41);
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
    public class19() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method108(Random arg0, int arg1, int arg2) {
        ++field254;
        if (~arg1 >= -1) {
            throw new IllegalArgumentException();
        } else if (class163.method1128(arg2 + -7295, arg1)) {
            return (int) ((long) arg1 * (4294967295L & (long) arg0.nextInt()) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            if (arg2 != 26329) {
                return 25;
            } else {
                int var4;
                do {
                    var4 = arg0.nextInt();
                } while (var4 >= var3);
                return class174.method1245(var4, (byte) 73, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            method107((byte) -1);
        }
        ++field261;
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int[][] var4 = this.method2021(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class180.field2826; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(B)V")
    public static void method109(byte arg0) {
        if (arg0 != 89) {
            method107((byte) 120);
        }
        field265 = null;
        field256 = null;
        field259 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method110(String arg0, String arg1, int arg2, String arg3) {
        int var4 = -54 % ((arg2 - 89) / 36);
        for (int var5 = arg3.indexOf(arg0); ~var5 != 0; var5 = arg3.indexOf(arg0, var5 - -arg1.length())) {
            arg3 = arg3.substring(0, var5) + arg1 + arg3.substring(arg0.length() + var5);
        }
        ++field260;
        return arg3;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(II)I")
    public static final int method111(int arg0, int arg1) {
        if (arg1 <= 14) {
            return -114;
        } else {
            ++field262;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLim;)V")
    public static final void method112(byte arg0, class170 arg1) {
        ++field258;
        if (~(arg1.field2650.length + -arg1.field2676) <= -2) {
            int var2 = arg1.method1218(84);
            if (~var2 <= -1 && ~var2 >= -12) {
                byte var3;
                if (var2 != 11) {
                    if (var2 == 10) {
                        var3 = 32;
                    } else if (var2 == 9) {
                        var3 = 31;
                    } else if (~var2 == -9) {
                        var3 = 30;
                    } else if (var2 != 7) {
                        if (var2 == 6) {
                            var3 = 28;
                        } else if (var2 == 5) {
                            var3 = 28;
                        } else if (~var2 == -5) {
                            var3 = 24;
                        } else if (~var2 == -4) {
                            var3 = 23;
                        } else if (var2 != 2) {
                            if (~var2 == -2) {
                                var3 = 23;
                            } else {
                                var3 = 19;
                            }
                        } else {
                            var3 = 22;
                        }
                    } else {
                        var3 = 29;
                    }
                } else {
                    var3 = 33;
                }
                if (arg1.field2650.length - arg1.field2676 >= var3) {
                    class229.field3547 = arg1.method1218(122);
                    if (~class229.field3547 > -2) {
                        class229.field3547 = 1;
                    } else if (~class229.field3547 < -5) {
                        class229.field3547 = 4;
                    }
                    class288.method1965(false, ~arg1.method1218(64) == -2);
                    class44.field528 = ~arg1.method1218(-83) == -2;
                    class73.field1106 = ~arg1.method1218(67) == -2;
                    class17.field234 = arg1.method1218(-47) == 1;
                    class162.field2440 = arg1.method1218(113) == 1;
                    class118.field1707 = arg1.method1218(-118) == 1;
                    class234.field3773 = ~arg1.method1218(-74) == -2;
                    class89.field1333 = ~arg1.method1218(-116) == -2;
                    class22.field286 = arg1.method1218(-42);
                    if (~class22.field286 < -3) {
                        class22.field286 = 2;
                    }
                    if (var2 < 2) {
                        class250.field4053 = ~arg1.method1218(107) == -2;
                        arg1.method1218(97);
                    } else {
                        class250.field4053 = ~arg1.method1218(83) == -2;
                    }
                    class274.field4452 = ~arg1.method1218(116) == -2;
                    class64.field925 = arg1.method1218(107) == 1;
                    class250.field4091 = arg1.method1218(-111);
                    if (~class250.field4091 < -3) {
                        class250.field4091 = 2;
                    }
                    class96.field1451 = class250.field4091;
                    class23.field295 = ~arg1.method1218(61) == -2;
                    class96.field1437 = arg1.method1218(-100);
                    if (class96.field1437 > 127) {
                        class96.field1437 = 127;
                    }
                    class136.field1960 = arg1.method1218(-114);
                    class235.field3792 = arg1.method1218(-111);
                    if (class235.field3792 > 127) {
                        class235.field3792 = 127;
                    }
                    if (var2 >= 1) {
                        class312.field5005 = arg1.method1186((byte) -67);
                        class299.field4762 = arg1.method1186((byte) -104);
                    }
                    if (~var2 <= -4 && var2 < 6) {
                        arg1.method1218(-60);
                    }
                    if (~var2 <= -5) {
                        int var4 = arg1.method1218(83);
                        if (class200.field3157 < 96) {
                            var4 = 0;
                        }
                        class65.method426(var4);
                    }
                    if (var2 >= 5) {
                        class170.field2663 = arg1.method1190(6345);
                    }
                    if (arg0 > 49) {
                        if (~var2 <= -7) {
                            class173.field2723 = arg1.method1218(102);
                        }
                        if (var2 >= 7) {
                            class138.field1983 = ~arg1.method1218(65) == -2;
                        }
                        if (~var2 <= -9) {
                            class180.field2832 = arg1.method1218(85) == 1;
                        }
                        if (var2 >= 9) {
                            class306.field4876 = arg1.method1218(69);
                        }
                        if (var2 >= 10) {
                            class295.field4725 = arg1.method1218(67) != 0;
                        }
                        if (~var2 <= -12) {
                            class210.field3279 = ~arg1.method1218(116) != -1;
                        }
                    }
                }
            }
        }
    }
}
