import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class52 extends class82 {

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field1023 = 0;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Lmh;")
    public static class128 field1022 = class22.method156(125, "null");

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field1019 = 0;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "[[B")
    public static byte[][] field1025;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 5)
    public static final void method355(int arg0) {
        if (arg0 != 1) {
            method358(-99);
        }
        field1021++;
        if (class4.field75 == 0) {
            return;
        }
        try {
            if ((++class211.field3740) > 2000) {
                if (class121.field2041 != null) {
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                }
                if (class176.field3103 >= 1) {
                    class4.field75 = 0;
                    class192.field3330 = -5;
                    return;
                }
                class176.field3103++;
                class211.field3740 = 0;
                class4.field75 = 1;
                if (class53.field1028 == class303.field5127) {
                    class53.field1028 = class203.field3592;
                } else {
                    class53.field1028 = class303.field5127;
                }
            }
            if (class4.field75 == 1) {
                class118.field1994 = class288.field4925.method1902(110, class241.field4137, class53.field1028);
                class4.field75 = 2;
            }
            if (class4.field75 == 2) {
                if (class118.field1994.field560 == 2) {
                    throw new IOException();
                }
                if (class118.field1994.field560 != 1) {
                    return;
                }
                class121.field2041 = new class180((Socket) class118.field1994.field562, class288.field4925);
                class118.field1994 = null;
                class121.field2041.method1228(class71.field1320.field3417, 0, false, class71.field1320.field3380);
                if (class257.field4412 != null) {
                    class257.field4412.method1676(arg0 - 6245);
                }
                if (class310.field5264 != null) {
                    class310.field5264.method1676(-6244);
                }
                int var1 = class121.field2041.method1231(-1);
                if (class257.field4412 != null) {
                    class257.field4412.method1676(-6244);
                }
                if (class310.field5264 != null) {
                    class310.field5264.method1676(-6244);
                }
                if (var1 != 21) {
                    class4.field75 = 0;
                    class192.field3330 = var1;
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                    return;
                }
                class4.field75 = 3;
            }
            if (class4.field75 == 3) {
                if (class121.field2041.method1230((byte) 60) < 1) {
                    return;
                }
                class3.field43 = new class128[class121.field2041.method1231(-1)];
                class4.field75 = 4;
            }
            if (class4.field75 == 4) {
                if (class121.field2041.method1230((byte) 16) < (class3.field43.length * 8)) {
                    return;
                }
                class54.field1051.field3380 = 0;
                class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, class3.field43.length * 8);
                for (int var2 = 0; var2 < class3.field43.length; var2++) {
                    class3.field43[var2] = class260.method1827(true, class54.field1051.method1321(20169));
                }
                class4.field75 = 0;
                class192.field3330 = 21;
                class121.field2041.method1229(false);
                class121.field2041 = null;
                return;
            }
        } catch (IOException var4) {
            if (class121.field2041 != null) {
                class121.field2041.method1229(false);
                class121.field2041 = null;
            }
            if (class176.field3103 >= 1) {
                class192.field3330 = -4;
                class4.field75 = 0;
            } else {
                class211.field3740 = 0;
                if (class53.field1028 == class303.field5127) {
                    class53.field1028 = class203.field3592;
                } else {
                    class53.field1028 = class303.field5127;
                }
                class4.field75 = 1;
                class176.field3103++;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V", line = 162)
    public static final void method356(int arg0, int arg1, int arg2) {
        class173.field3065 = true;
        class148.field2552 = arg0;
        class30.field667 = arg1;
        class77.field1418 = arg2;
        class204.field3604 = -1;
        class260.field4511 = -1;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 175)
    public static void method357(int arg0) {
        field1022 = null;
        if (arg0 < 17) {
            field1025 = (byte[][]) ((byte[][]) null);
        }
        field1025 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 188)
    public static final void method358(int arg0) {
        field1024++;
        class150.method1002(0, 5);
        class82.method521(5, 3826);
        class105.method649((byte) -108, 5);
        class148.method999(5, (byte) -29);
        class88.method549(5, -1);
        class42.method287(128, 5);
        class123.method756(5, (byte) 31);
        class148.method996(5, true);
        class281.method1960(0, 5);
        class151.method1007(5, 0);
        int var1 = -121 / ((60 - arg0) / 34);
        class284.method1970((byte) 125, 5);
        class175.method1205(50, -101);
        class241.method1640(5, (byte) 114);
        class171.method1149(true, 5);
        class93.field1575.method1833(5, (byte) 79);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([B[Lid;ZIIIII)V", line = 235)
    public static final void method359(byte[] arg0, class249[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1026++;
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg3 + var10) > 0 && (arg3 + var10) < 103 && arg6 + var11 > 0 && arg6 + var11 < 103) {
                            arg1[var9].field4306[arg3 + var10][arg6 + var11] = class238.method1622(arg1[var9].field4306[arg3 + var10][arg6 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class194 var12 = new class194(arg0);
        for (int var13 = arg4; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class3.method21(arg6 + var15, var13, 0, -105, arg5, var12, arg2, arg7, arg3 + var14);
                }
            }
        }
        if (!class247.field4247 || arg2) {
            return;
        }
        class182 var16 = null;
        label117: while (true) {
            int var18;
            label110: do {
                while (var12.field3417.length > var12.field3380) {
                    int var17 = var12.method1325(7627);
                    if (var17 != 0) {
                        if (var17 != 1) {
                            throw new IllegalStateException();
                        }
                        var18 = var12.method1325(7627);
                        continue label110;
                    }
                    var16 = new class182(var12);
                }
                if (var16 == null) {
                    var16 = new class182();
                }
                for (int var23 = 0; var23 < 8; var23++) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        int var25 = (arg3 >> 3) + var23;
                        int var26 = (arg6 >> 3) + var24;
                        if (var25 >= 0 && var25 < 13 && var26 >= 0 && var26 < 13) {
                            class178.field3136[var25][var26] = var16;
                        }
                    }
                }
                break label117;
            } while (var18 <= 0);
            for (int var19 = 0; var19 < var18; var19++) {
                class97 var20 = new class97(var12);
                var20.field1660 += arg6 << 7;
                int var21 = var20.field1660 >> 7;
                var20.field1657 += arg3 << 7;
                int var22 = var20.field1657 >> 7;
                if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                    var20.field1651 = class250.field4334[var20.field1686][var22][var21] - var20.field1651;
                    class46.method322(var20);
                }
            }
        }
    }
}
