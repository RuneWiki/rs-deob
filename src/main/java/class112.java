import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class112 extends class232 {

    @OriginalMember(owner = "client!rja", name = "O", descriptor = "I")
    private int field1565 = 0;

    @OriginalMember(owner = "client!rja", name = "H", descriptor = "I")
    private int field1569 = 4096;

    @OriginalMember(owner = "client!rja", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1574 = new String[] { method1026(method1025("\u0000 d\n-Z")), method1026(method1025("\u001c?iH")), method1026(method1025("\u0000 d\n$Z")), method1026(method1025("\td+\n\u001c")), method1026(method1025("\u0000 d\n Z")), method1026(method1025("\u0000 d\n%Z")), method1026(method1025("\u0000 d\n#Z")), method1026(method1025("\u0000 d\n+Z")), method1026(method1025("\u0000 d\n'Z")) };

    @OriginalMember(owner = "client!rja", name = "I", descriptor = "[I")
    public static int[] field1571 = new int[3];

    @OriginalMember(owner = "client!rja", name = "N", descriptor = "S")
    public static short field1572 = 320;

    @OriginalMember(owner = "client!rja", name = "M", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!rja", name = "P", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!rja", name = "L", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!rja", name = "J", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!rja", name = "K", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!rja", name = "G", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILwq;I)V", line = 3)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field1566;
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field3605 = ~arg1.method1645((byte) -81) == -2;
                    }
                } else {
                    this.field1569 = arg1.method1687((byte) -109);
                }
            } else {
                this.field1565 = arg1.method1687((byte) -60);
            }
            if (arg0 < 96) {
                this.method66(42, (byte) 42);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1574[2] + arg0 + ',' + (arg1 != null ? field1574[3] : field1574[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "(I)V", line = 49)
    public static void method1021(int arg0) {
        try {
            field1571 = null;
            if (arg0 != 2) {
                method1023(-93, -51, (byte) 17);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1574[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(B)Z", line = 60)
    public static final boolean method1022(byte arg0) {
        try {
            ++field1567;
            try {
                int var1 = -33 % ((26 - arg0) / 46);
                if (~class516.field7614 == -3) {
                    if (class550.field8067 == null) {
                        class550.field8067 = class110.method1016(class787.field11509, class328.field5391, class785.field11466);
                        if (class550.field8067 == null) {
                            return false;
                        }
                    }
                    if (class609.field8766 == null) {
                        class609.field8766 = new class625(class58.field732, class303.field4882);
                    }
                    class114 var2 = class350.field5661;
                    if (class550.field8070 != null) {
                        var2 = class550.field8070;
                    }
                    if (var2.method1128(22050, class609.field8766, class660.field9427, class550.field8067, (byte) 114)) {
                        class350.field5661 = var2;
                        class350.field5661.method1103(-113);
                        if (~class714.field10341 < -1) {
                            class516.field7614 = 3;
                            class350.field5661.method1118(~class714.field10341 < ~class32.field389 ? class32.field389 : class714.field10341, true);
                            for (int var3 = 0; ~var3 > ~class459.field7078.length; ++var3) {
                                class350.field5661.method1137(class459.field7078[var3], var3, -17);
                                class459.field7078[var3] = 255;
                            }
                        } else {
                            class516.field7614 = 0;
                            class350.field5661.method1118(class32.field389, true);
                            for (int var4 = 0; ~var4 > ~class459.field7078.length; ++var4) {
                                class350.field5661.method1137(class459.field7078[var4], var4, -17);
                                class459.field7078[var4] = 255;
                            }
                        }
                        if (class550.field8070 == null) {
                            if (~class312.field5115 < -1L) {
                                class350.field5661.method1117(true, (byte) -75, class312.field5115, class60.field780, class550.field8067);
                            } else {
                                class350.field5661.method1126(class550.field8067, (byte) 86, class60.field780);
                            }
                        }
                        if (class447.field6942 != null) {
                            class447.field6942.method5702((byte) 93, class350.field5661);
                        }
                        class550.field8067 = null;
                        class312.field5115 = 0L;
                        class550.field8070 = null;
                        class787.field11509 = null;
                        class609.field8766 = null;
                        return true;
                    }
                }
            } catch (Exception var7) {
                var7.printStackTrace();
                class350.field5661.method1107(0);
                class609.field8766 = null;
                class516.field7614 = 0;
                class787.field11509 = null;
                class550.field8070 = null;
                class550.field8067 = null;
            }
            return false;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1574[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "<init>", descriptor = "()V", line = 342)
    public class112() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIB)I", line = 166)
    public static final int method1023(int arg0, int arg1, byte arg2) {
        try {
            arg0 = (arg1 & 127) * arg0 >> 7;
            ++field1564;
            if (arg2 != -79) {
                field1572 = 107;
            }
            if (arg0 < 2) {
                arg0 = 2;
            } else if (~arg0 < -127) {
                arg0 = 126;
            }
            return (arg1 & 65408) + arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1574[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(II)[[I", line = 186)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field1568;
            if (arg0 != -3093) {
                field1571 = null;
            }
            int[][] var3 = super.field3599.method1580(arg1, (byte) -44);
            if (super.field3599.field2743) {
                int[][] var4 = this.method2023((byte) 127, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class449.field6969 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field1565 > var12) {
                        var8[var11] = this.field1565;
                    } else if (this.field1569 < var12) {
                        var8[var11] = this.field1569;
                    } else {
                        var8[var11] = var12;
                    }
                    if (var13 < this.field1565) {
                        var9[var11] = this.field1565;
                    } else if (var13 <= this.field1569) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field1569;
                    }
                    if (this.field1565 > var14) {
                        var10[var11] = this.field1565;
                    } else if (~var14 < ~this.field1569) {
                        var10[var11] = this.field1569;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field1574[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IB)[I", line = 271)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field1573;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                method1022((byte) -72);
            }
            if (super.field3601.field6907) {
                int[] var4 = this.method2022(arg0, 0, arg1 + -123);
                for (int var5 = 0; ~var5 > ~class449.field6969; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 <= ~this.field1565) {
                        if (~this.field1569 > ~var6) {
                            var3[var5] = this.field1569;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field1565;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1574[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "(I)V", line = 317)
    public static final void method1024(int arg0) {
        try {
            ++field1570;
            for (class10 var1 = (class10) class702.field10091.method3228(arg0 + 13); var1 != null; var1 = (class10) class702.field10091.method3216(true)) {
                class313.method2686((byte) 32, false, var1);
            }
            class10 var2 = (class10) class344.field5596.method3228(11);
            if (arg0 != -2) {
                method1022((byte) -114);
            }
            while (var2 != null) {
                class313.method2686((byte) 32, true, var2);
                var2 = (class10) class344.field5596.method3216(true);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1574[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1025(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 97);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1026(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
