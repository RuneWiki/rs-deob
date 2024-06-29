import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class231 extends class7 {

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    public int field3376 = -1;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    public int field3377 = -1;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "Ldp;")
    public static class174 field3375;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;Lmb;I)Ljava/lang/String;", line = 6)
    public static final String method1715(String arg0, class258 arg1, int arg2) {
        ++field3373;
        if (arg0.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg0.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class120.field1877 != null) {
                                                            if (class120.field1877.field2125 == null) {
                                                                var9 = class293.method2046(class120.field1877.field2124, 65280);
                                                            } else {
                                                                var9 = (String) class120.field1877.field2125;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + class277.method1978(class416.method2603(4, arg1, (byte) -36), 999999999) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + class277.method1978(class416.method2603(3, arg1, (byte) 1), 999999999) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + class277.method1978(class416.method2603(2, arg1, (byte) -41), 999999999) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + class277.method1978(class416.method2603(1, arg1, (byte) -5), 999999999) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + class277.method1978(class416.method2603(0, arg1, (byte) -100), 999999999) + arg0.substring(var3 - -2);
            }
        }
        if (arg2 <= 92) {
            field3375 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 102)
    public static void method1716(int arg0) {
        if (arg0 != 128) {
            field3375 = null;
        }
        field3375 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLja;)Lkh;", line = 118)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field3384;
        class202 var3 = arg1.method709();
        var3.method1527(super.field86, super.field95, super.field90);
        class69 var4 = class256.method1849(3, 122);
        if (~this.field3376 != 0) {
            class100 var5 = class206.method1561(-68, this.field3376).method1053((class153) null, 0, 0, -1, (byte) 98, 1024, (class51) null, arg1, this.field3374);
            if (var5 != null) {
                var5.method530(var3, var4.field1128[2], 0);
            }
        }
        if (this.field3377 != -1) {
            class100 var6 = class206.method1561(112, this.field3377).method1053((class153) null, 0, 0, -1, (byte) 102, 1024, (class51) null, arg1, this.field3382);
            if (var6 != null) {
                var6.method530(var3, var4.field1128[1], 0);
            }
        }
        class100 var7 = class206.method1561(97, this.field3381).method1053((class153) null, 0, 0, -1, (byte) 96, 1024, (class51) null, arg1, this.field3386);
        if (var7 != null) {
            var7.method530(var3, var4.field1128[0], 0);
        }
        if (arg0 <= 90) {
            this.field3377 = 118;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILja;)V", line = 161)
    public final void method137(int arg0, class90 arg1) {
        ++field3383;
        int var3 = -15 % ((-31 - arg0) / 51);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)I", line = 170)
    public static final int method1717(int arg0) {
        int var1 = 21 % ((arg0 - 24) / 51);
        ++field3372;
        return class356.field5062;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILja;II)Z", line = 185)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field3380;
        class202 var5 = arg1.method709();
        var5.method1527(super.field86, super.field95, super.field90);
        class100 var6 = class206.method1561(107, this.field3381).method1053((class153) null, 0, 0, -1, (byte) 127, 65536, (class51) null, arg1, this.field3386);
        if (var6 != null && var6.method574(arg3, arg0, var5, true)) {
            return true;
        } else {
            if (this.field3377 != -1) {
                class100 var7 = class206.method1561(96, this.field3377).method1053((class153) null, 0, 0, -1, (byte) 121, 65536, (class51) null, arg1, this.field3382);
                if (var7 != null && var7.method574(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            if (arg2 != 28033) {
                this.field3386 = -70;
            }
            if (~this.field3376 != 0) {
                class100 var8 = class206.method1561(arg2 ^ 28125, this.field3376).method1053((class153) null, 0, 0, -1, (byte) 117, 65536, (class51) null, arg1, this.field3374);
                if (var8 != null && var8.method574(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILec;)Lti;", line = 228)
    public static final class5 method1718(int arg0, class37 arg1) {
        ++field3371;
        return arg0 >= -63 ? null : new class5(arg1.method321((byte) 111), arg1.method321((byte) 106), arg1.method321((byte) 93), arg1.method321((byte) 119), arg1.method295(true), arg1.method295(true), arg1.method271((byte) 110));
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)S", line = 239)
    public static final short method1719(int arg0, int arg1) {
        ++field3379;
        int var2 = (arg1 & 65421) >> 10;
        int var3 = 112 & arg1 >> 3;
        if (arg0 != -24927) {
            method1719(76, -94);
        }
        int var4 = arg1 & 127;
        int var5 = ~var4 >= -65 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (~var6 == -1) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIII)Z", line = 267)
    public static final boolean method1720(int arg0, int arg1, int arg2, int arg3) {
        if (!class78.method619(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class218.method1647(var4 + 1, class50.field816[arg0].method794(arg1, arg2) + arg3, var5 + 1) && class218.method1647(var4 + 128 - 1, class50.field816[arg0].method794(arg1 + 1, arg2) + arg3, var5 + 1) && class218.method1647(var4 + 128 - 1, class50.field816[arg0].method794(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class218.method1647(var4 + 1, class50.field816[arg0].method794(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        }
    }
}
