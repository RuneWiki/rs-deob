import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class69 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "J")
    public long field1064 = 0L;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "F")
    public static float field1065;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lrm;")
    public class175 field1075;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "[Z")
    public static boolean[] field1086;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)I", line = 13)
    public static final int method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1069++;
        if ((arg6 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg3 < 63) {
            field1086 = (boolean[]) null;
        }
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 1 - (arg1 - 7) - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg5;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[BI)Z", line = 55)
    public static final boolean method433(int arg0, int arg1, byte[] arg2, int arg3) {
        field1077++;
        class153 var4 = new class153(arg2);
        boolean var5 = true;
        int var6 = -1;
        if (arg0 >= -79) {
            method432(41, -105, 8, 48, -33, -86, -72);
        }
        label70: while (true) {
            int var7 = var4.method1062(114);
            if (var7 == 0) {
                return var5;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                int var12;
                class157 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method1050(-32768);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var4.method1082(-46);
                                    }
                                    int var10 = var4.method1050(-32768);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var4.method1082(-73) >> 2;
                                    int var13 = (var8 & 0xFD0) >> 6;
                                    var14 = arg1 + var13;
                                    var15 = arg3 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class99.method682(var6, (byte) -91);
                } while (var12 == 22 && !class256.field4409 && var16.field2661 == 0 && var16.field2670 != 1 && !var16.field2699);
                var9 = true;
                if (!var16.method1128((byte) 126)) {
                    var5 = false;
                    class231.field3983++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)V", line = 149)
    public static final void method434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 18643) {
            field1066 = 110;
        }
        for (int var5 = 0; var5 < class254.field4381; var5++) {
            if (arg3 < (class290.field4880[var5] + class191.field3214[var5]) && arg3 + arg4 > class290.field4880[var5] && (class25.field339[var5] + class117.field2058[var5]) > arg1 && class25.field339[var5] < arg1 + arg2) {
                class302.field5151[var5] = true;
            }
        }
        field1085++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 176)
    public static void method435(byte arg0) {
        field1086 = null;
        if (arg0 < 35) {
            method433(75, 53, (byte[]) null, 46);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILme;)V", line = 191)
    public static final void method436(int arg0, class75 arg1) {
        field1081++;
        int var2 = arg1.field1210;
        if (var2 == 324) {
            if (class153.field2590 == -1) {
                class325.field5576 = arg1.field1289;
                class153.field2590 = arg1.field1150;
            }
            if (class34.field513.field3401) {
                arg1.field1150 = class153.field2590;
            } else {
                arg1.field1150 = class325.field5576;
            }
        } else if (var2 == 325) {
            if (class153.field2590 == -1) {
                class325.field5576 = arg1.field1289;
                class153.field2590 = arg1.field1150;
            }
            if (class34.field513.field3401) {
                arg1.field1150 = class325.field5576;
            } else {
                arg1.field1150 = class153.field2590;
            }
        } else if (var2 == 327) {
            arg1.field1299 = 150;
            arg1.field1167 = (int) (Math.sin((double) class212.field3708 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1164 = -1;
            arg1.field1180 = 5;
        } else if (arg0 == 150 && var2 == 328) {
            if (class168.field2932.field1409 == null) {
                arg1.field1164 = 0;
            } else {
                arg1.field1299 = 150;
                arg1.field1167 = (int) (Math.sin((double) class212.field3708 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1180 = 5;
                arg1.field1164 = ((int) class168.field2932.field1409.method568(22476) << 11) + 2047;
                arg1.field1235 = class168.field2932.field1668;
                arg1.field1202 = class168.field2932.field1692;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIIIIII)V", line = 267)
    public static final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1084++;
        if (class200.field3443 <= arg2 - arg5 && class207.field3623 >= arg2 + arg5 && arg1 - arg5 >= class60.field931 && (arg1 + arg5) <= class29.field399) {
            class73.method465(arg5, arg4, arg3, arg1, arg0, arg6 + 25312, arg2);
        } else {
            class195.method1358(arg4, arg5, -73, arg1, arg2, arg3, arg0);
        }
        if (arg6 != 256) {
            field1086 = (boolean[]) null;
        }
    }
}
